$wd = "D:\Project\GitHub\zkm26_deobf\work"
$java = "C:\Program Files\Zulu\zulu-17\bin\java.exe"
$cfr = "$wd\tools\cfr.jar"
$classesRoot = "$wd\eval25\classes"
$outDir = "$wd\eval25\cfr-src"
New-Item -ItemType Directory -Force -Path $outDir | Out-Null
$fails = Get-Content "$wd\eval25\fails.txt"
$i = 0
foreach ($f in $fails) {
  $f = $f.Trim()
  if ($f -eq "") { continue }
  $in = Join-Path $classesRoot $f
  if (-not (Test-Path $in)) { Write-Output ("SKIP missing " + $f); continue }
  $i++
  Write-Output ("[" + $i + "] CFR " + $f)
  & $java -Xmx4g -jar $cfr $in --outputdir $outDir --comments false --silent true 2>&1
}
Write-Output "CFR DONE"
