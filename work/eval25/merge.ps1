$ErrorActionPreference = "Continue"
$base = "D:\Project\GitHub\zkm26_deobf\work\eval25"
$srcRoot = Join-Path $base "src"
$dst = Join-Path $base "final"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
$files = Get-ChildItem -Path $srcRoot -File -Filter *.java
$n = 0
foreach ($f in $files) {
  $head = Get-Content $f.FullName -TotalCount 12
  $pkgLine = $head | Where-Object { $_ -match '^package\s+' } | Select-Object -First 1
  $pkg = ""
  if ($pkgLine -and ($pkgLine -match 'package\s+([\w\.]+)\s*;')) { $pkg = $Matches[1] }
  if ($pkg -ne "") {
    $dir = Join-Path $dst ($pkg -replace '\.', '\\')
  } else {
    $dir = $dst
  }
  New-Item -ItemType Directory -Force -Path $dir | Out-Null
  Copy-Item $f.FullName -Destination (Join-Path $dir $f.Name) -Force
  $n++
}
Write-Output ("moved vineflower: " + $n)
Copy-Item -Path (Join-Path $base "cfr-src\*") -Destination $dst -Recurse -Force
Write-Output "merged cfr-src"
Write-Output ("final java count: " + (Get-ChildItem -Path $dst -Recurse -Filter *.java | Measure-Object).Count)
Write-Output "MERGE DONE"
