// 
// Decompiled by Procyon v0.6.0
// 

package com.zelix;

import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import java.io.File;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class d5
{
    private _1[] R;
    private l6q D;
    private Map O;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    
    public List s(final Object[] array) {
        final long longValue = (long)array[0];
        final String s = (String)array[1];
        final long n = d5.a ^ longValue;
        final long n2 = n ^ 0x5916A8433521L;
        final List t = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_2.invoke(this, -4700851952737750905L, n).t((char)(n2 >>> 48), (Object)s, (int)(n2 << 16 >>> 32), (short)(n2 << 48 >>> 48));
        try {
            if (t == null) {
                return null;
            }
        }
        catch (final n9 n3) {
            throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_3.invoke(n3, -5046354538210317739L, n);
        }
        return new ArrayList(t);
    }
    
    public d5(final File[] p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: lload_2        
        //     4: lxor           
        //     5: lstore_2       
        //     6: lload_2        
        //     7: dup2           
        //     8: ldc2_w          24342353041419
        //    11: lxor           
        //    12: dup2           
        //    13: bipush          48
        //    15: lushr          
        //    16: l2i            
        //    17: istore          4
        //    19: dup2           
        //    20: bipush          16
        //    22: lshl           
        //    23: bipush          32
        //    25: lushr          
        //    26: l2i            
        //    27: istore          5
        //    29: dup2           
        //    30: bipush          48
        //    32: lshl           
        //    33: bipush          48
        //    35: lushr          
        //    36: l2i            
        //    37: istore          6
        //    39: pop2           
        //    40: dup2           
        //    41: ldc2_w          101802668572070
        //    44: lxor           
        //    45: lstore          7
        //    47: dup2           
        //    48: ldc2_w          97554872208186
        //    51: lxor           
        //    52: lstore          9
        //    54: dup2           
        //    55: ldc2_w          48313960966916
        //    58: lxor           
        //    59: lstore          11
        //    61: dup2           
        //    62: ldc2_w          22831205891921
        //    65: lxor           
        //    66: dup2           
        //    67: bipush          8
        //    69: lushr          
        //    70: lstore          13
        //    72: dup2           
        //    73: bipush          56
        //    75: lshl           
        //    76: bipush          56
        //    78: lushr          
        //    79: l2i            
        //    80: istore          15
        //    82: pop2           
        //    83: dup2           
        //    84: ldc2_w          65823038341014
        //    87: lxor           
        //    88: lstore          16
        //    90: dup2           
        //    91: ldc2_w          1431052803045
        //    94: lxor           
        //    95: lstore          18
        //    97: dup2           
        //    98: ldc2_w          139868075004022
        //   101: lxor           
        //   102: dup2           
        //   103: bipush          32
        //   105: lushr          
        //   106: l2i            
        //   107: istore          20
        //   109: dup2           
        //   110: bipush          32
        //   112: lshl           
        //   113: bipush          48
        //   115: lushr          
        //   116: l2i            
        //   117: istore          21
        //   119: dup2           
        //   120: bipush          48
        //   122: lshl           
        //   123: bipush          48
        //   125: lushr          
        //   126: l2i            
        //   127: istore          22
        //   129: pop2           
        //   130: dup2           
        //   131: ldc2_w          93145064901694
        //   134: lxor           
        //   135: lstore          23
        //   137: dup2           
        //   138: ldc2_w          19900717903807
        //   141: lxor           
        //   142: lstore          25
        //   144: dup2           
        //   145: ldc2_w          128054056225283
        //   148: lxor           
        //   149: lstore          27
        //   151: pop2           
        //   152: ldc2_w          -286709953529996215
        //   155: lload_2        
        //   156: invokedynamic   BootstrapMethod #3, l:(JJ)[I
        //   161: aload_0        
        //   162: invokespecial   java/lang/Object.<init>:()V
        //   165: new             Ljava/util/ArrayList;
        //   168: dup            
        //   169: aload_1        
        //   170: arraylength    
        //   171: iconst_5       
        //   172: imul           
        //   173: getstatic       com/zelix/d5.e:J
        //   176: l2i            
        //   177: invokestatic    java/lang/Math.max:(II)I
        //   180: invokespecial   java/util/ArrayList.<init>:(I)V
        //   183: astore          30
        //   185: astore          29
        //   187: iconst_0       
        //   188: istore          31
        //   190: iload           31
        //   192: aload_1        
        //   193: arraylength    
        //   194: if_icmpge       791
        //   197: aload_1        
        //   198: iload           31
        //   200: aaload         
        //   201: ldc2_w          -1911511401121587040
        //   204: lload_2        
        //   205: invokedynamic   BootstrapMethod #4, s:(Ljava/lang/Object;JJ)Z
        //   210: aload           29
        //   212: lload_2        
        //   213: lconst_0       
        //   214: lcmp           
        //   215: iflt            223
        //   218: ifnonnull       902
        //   221: aload           29
        //   223: ifnonnull       299
        //   226: goto            239
        //   229: ldc2_w          -2074774559614406506
        //   232: lload_2        
        //   233: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   238: athrow         
        //   239: ifeq            526
        //   242: goto            255
        //   245: ldc2_w          -2074774559614406506
        //   248: lload_2        
        //   249: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   254: athrow         
        //   255: aload_1        
        //   256: iload           31
        //   258: aaload         
        //   259: aload           29
        //   261: ifnonnull       319
        //   264: goto            277
        //   267: ldc2_w          -2074774559614406506
        //   270: lload_2        
        //   271: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   276: athrow         
        //   277: ldc2_w          -554993858332642506
        //   280: lload_2        
        //   281: invokedynamic   BootstrapMethod #4, s:(Ljava/lang/Object;JJ)Z
        //   286: goto            299
        //   289: ldc2_w          -2074774559614406506
        //   292: lload_2        
        //   293: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   298: athrow         
        //   299: ifeq            526
        //   302: aload_1        
        //   303: iload           31
        //   305: aaload         
        //   306: goto            319
        //   309: ldc2_w          -2074774559614406506
        //   312: lload_2        
        //   313: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   318: athrow         
        //   319: ldc2_w          -1941230731319437196
        //   322: lload_2        
        //   323: invokedynamic   BootstrapMethod #6, s:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   328: astore          32
        //   330: aload_1        
        //   331: iload           31
        //   333: aaload         
        //   334: new             Lcom/zelix/tj;
        //   337: dup            
        //   338: invokespecial   com/zelix/tj.<init>:()V
        //   341: ldc2_w          -1975360564958527326
        //   344: lload_2        
        //   345: invokedynamic   BootstrapMethod #7, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String;
        //   350: astore          33
        //   352: aload           33
        //   354: ifnull          509
        //   357: iconst_0       
        //   358: istore          34
        //   360: iload           34
        //   362: aload           33
        //   364: arraylength    
        //   365: if_icmpge       509
        //   368: new             Ljava/lang/StringBuilder;
        //   371: dup            
        //   372: invokespecial   java/lang/StringBuilder.<init>:()V
        //   375: aload           32
        //   377: lload_2        
        //   378: lconst_0       
        //   379: lcmp           
        //   380: ifle            393
        //   383: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   386: aload           29
        //   388: ifnonnull       1169
        //   391: aload           32
        //   393: aload           29
        //   395: ifnonnull       454
        //   398: goto            411
        //   401: ldc2_w          -2074774559614406506
        //   404: lload_2        
        //   405: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   410: athrow         
        //   411: ldc2_w          -90405244462928851
        //   414: lload_2        
        //   415: invokedynamic   BootstrapMethod #8, h:(JJ)Ljava/lang/String;
        //   420: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   423: ifeq            457
        //   426: goto            439
        //   429: ldc2_w          -2074774559614406506
        //   432: lload_2        
        //   433: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   438: athrow         
        //   439: ldc             ""
        //   441: goto            454
        //   444: ldc2_w          -2074774559614406506
        //   447: lload_2        
        //   448: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   453: athrow         
        //   454: goto            466
        //   457: ldc2_w          -90405244462928851
        //   460: lload_2        
        //   461: invokedynamic   BootstrapMethod #8, h:(JJ)Ljava/lang/String;
        //   466: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   469: aload           33
        //   471: iload           34
        //   473: aaload         
        //   474: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   477: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   480: astore          35
        //   482: aload           30
        //   484: new             Lcom/zelix/gs;
        //   487: dup            
        //   488: lload           7
        //   490: aload           35
        //   492: invokespecial   com/zelix/gs.<init>:(JLjava/lang/String;)V
        //   495: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   500: pop            
        //   501: iinc            34, 1
        //   504: aload           29
        //   506: ifnull          360
        //   509: aload           29
        //   511: lload_2        
        //   512: lconst_0       
        //   513: lcmp           
        //   514: ifle            1169
        //   517: lload_2        
        //   518: lconst_0       
        //   519: lcmp           
        //   520: ifle            788
        //   523: ifnull          783
        //   526: aconst_null    
        //   527: astore          32
        //   529: new             Lcom/zelix/yu;
        //   532: dup            
        //   533: aload_1        
        //   534: iload           31
        //   536: aaload         
        //   537: invokespecial   com/zelix/yu.<init>:(Ljava/io/File;)V
        //   540: astore          32
        //   542: aload           32
        //   544: ldc2_w          -307823256621987501
        //   547: lload_2        
        //   548: invokedynamic   BootstrapMethod #9, s:(Ljava/lang/Object;JJ)Ljava/util/Enumeration;
        //   553: astore          33
        //   555: aload           33
        //   557: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   562: ifeq            717
        //   565: aload           33
        //   567: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   572: checkcast       Ljava/util/zip/ZipEntry;
        //   575: astore          34
        //   577: aload           34
        //   579: invokevirtual   java/util/zip/ZipEntry.isDirectory:()Z
        //   582: aload           29
        //   584: ifnonnull       192
        //   587: aload           29
        //   589: lload_2        
        //   590: lconst_0       
        //   591: lcmp           
        //   592: iflt            212
        //   595: lload_2        
        //   596: lconst_0       
        //   597: lcmp           
        //   598: ifle            656
        //   601: ifnonnull       654
        //   604: ifne            712
        //   607: goto            620
        //   610: ldc2_w          -2074774559614406506
        //   613: lload_2        
        //   614: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   619: athrow         
        //   620: aload           34
        //   622: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //   625: sipush          27558
        //   628: ldc2_w          2201366238935648937
        //   631: lload_2        
        //   632: lxor           
        //   633: invokedynamic   BootstrapMethod #0, u:(IJ)Ljava/lang/String;
        //   638: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   641: goto            654
        //   644: ldc2_w          -2074774559614406506
        //   647: lload_2        
        //   648: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   653: athrow         
        //   654: aload           29
        //   656: ifnonnull       711
        //   659: ifeq            712
        //   662: goto            675
        //   665: ldc2_w          -2074774559614406506
        //   668: lload_2        
        //   669: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   674: athrow         
        //   675: aload           30
        //   677: new             Lcom/zelix/gs;
        //   680: dup            
        //   681: lload           13
        //   683: aload           32
        //   685: iload           15
        //   687: i2b            
        //   688: aload           34
        //   690: invokespecial   com/zelix/gs.<init>:(JLjava/util/zip/ZipFile;BLjava/util/zip/ZipEntry;)V
        //   693: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   698: goto            711
        //   701: ldc2_w          -2074774559614406506
        //   704: lload_2        
        //   705: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   710: athrow         
        //   711: pop            
        //   712: aload           29
        //   714: ifnull          555
        //   717: lload_2        
        //   718: lconst_0       
        //   719: lcmp           
        //   720: iflt            901
        //   723: goto            783
        //   726: astore          33
        //   728: new             Lcom/zelix/un;
        //   731: dup            
        //   732: new             Ljava/lang/StringBuilder;
        //   735: dup            
        //   736: invokespecial   java/lang/StringBuilder.<init>:()V
        //   739: aload           33
        //   741: ldc2_w          -2037038293474247845
        //   744: lload_2        
        //   745: invokedynamic   BootstrapMethod #6, s:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   750: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   753: sipush          8281
        //   756: ldc2_w          5294500751332032852
        //   759: lload_2        
        //   760: lxor           
        //   761: invokedynamic   BootstrapMethod #0, u:(IJ)Ljava/lang/String;
        //   766: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   769: aload_1        
        //   770: iload           31
        //   772: aaload         
        //   773: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   776: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   779: invokespecial   com/zelix/un.<init>:(Ljava/lang/String;)V
        //   782: pop            
        //   783: iinc            31, 1
        //   786: aload           29
        //   788: ifnull          190
        //   791: aload_0        
        //   792: aload           30
        //   794: invokeinterface java/util/List.size:()I
        //   799: anewarray       Lcom/zelix/_1;
        //   802: ldc2_w          -501987585469623606
        //   805: lload_2        
        //   806: invokedynamic   BootstrapMethod #10, p:(Ljava/lang/Object;[Lcom/zelix/_1;JJ)V
        //   811: aload_0        
        //   812: aload           30
        //   814: invokeinterface java/util/List.size:()I
        //   819: iload           20
        //   821: iload           21
        //   823: i2c            
        //   824: iload           22
        //   826: i2s            
        //   827: invokestatic    com/zelix/cf.x:(IICS)I
        //   830: lload           16
        //   832: iconst_2       
        //   833: anewarray       Ljava/lang/Object;
        //   836: dup_x2         
        //   837: dup_x2         
        //   838: pop            
        //   839: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   842: iconst_1       
        //   843: swap           
        //   844: aastore        
        //   845: dup_x1         
        //   846: swap           
        //   847: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   850: iconst_0       
        //   851: swap           
        //   852: aastore        
        //   853: ldc2_w          -335667755472748873
        //   856: lload_2        
        //   857: invokedynamic   BootstrapMethod #11, l:(Ljava/lang/Object;JJ)Ljava/util/HashMap;
        //   862: ldc2_w          -1807405467939258834
        //   865: lload_2        
        //   866: invokedynamic   BootstrapMethod #12, p:(Ljava/lang/Object;Ljava/util/Map;JJ)V
        //   871: aload_0        
        //   872: new             Lcom/zelix/l6q;
        //   875: dup            
        //   876: iload           4
        //   878: i2s            
        //   879: iload           5
        //   881: iload           6
        //   883: invokespecial   com/zelix/l6q.<init>:(SII)V
        //   886: ldc2_w          -2017493056789665212
        //   889: lload_2        
        //   890: invokedynamic   BootstrapMethod #13, p:(Ljava/lang/Object;Lcom/zelix/l6q;JJ)V
        //   895: lload_2        
        //   896: lconst_0       
        //   897: lcmp           
        //   898: ifle            197
        //   901: iconst_0       
        //   902: istore          31
        //   904: iload           31
        //   906: aload           30
        //   908: invokeinterface java/util/List.size:()I
        //   913: if_icmpge       1139
        //   916: aload           30
        //   918: iload           31
        //   920: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   925: checkcast       Lcom/zelix/gs;
        //   928: astore          32
        //   930: lload           23
        //   932: aload           32
        //   934: iconst_2       
        //   935: anewarray       Ljava/lang/Object;
        //   938: dup_x1         
        //   939: swap           
        //   940: iconst_1       
        //   941: swap           
        //   942: aastore        
        //   943: dup_x2         
        //   944: dup_x2         
        //   945: pop            
        //   946: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   949: iconst_0       
        //   950: swap           
        //   951: aastore        
        //   952: ldc2_w          -1834366840095990815
        //   955: lload_2        
        //   956: invokedynamic   BootstrapMethod #14, l:(Ljava/lang/Object;JJ)Lcom/zelix/_1;
        //   961: astore          33
        //   963: aload_0        
        //   964: ldc2_w          -501987585469623606
        //   967: lload_2        
        //   968: invokedynamic   BootstrapMethod #15, r:(Ljava/lang/Object;JJ)[Lcom/zelix/_1;
        //   973: iload           31
        //   975: aload           33
        //   977: aastore        
        //   978: aload_0        
        //   979: ldc2_w          -1807405467939258834
        //   982: lload_2        
        //   983: invokedynamic   BootstrapMethod #16, r:(Ljava/lang/Object;JJ)Ljava/util/Map;
        //   988: aload           33
        //   990: lload           9
        //   992: invokevirtual   com/zelix/_1.h:(J)Ljava/lang/String;
        //   995: aload           33
        //   997: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1002: pop            
        //  1003: aload           33
        //  1005: lload           18
        //  1007: iconst_1       
        //  1008: anewarray       Ljava/lang/Object;
        //  1011: dup_x2         
        //  1012: dup_x2         
        //  1013: pop            
        //  1014: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1017: iconst_0       
        //  1018: swap           
        //  1019: aastore        
        //  1020: ldc2_w          -1801803693925165495
        //  1023: lload_2        
        //  1024: invokedynamic   BootstrapMethod #17, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/b9;
        //  1029: astore          34
        //  1031: iconst_0       
        //  1032: aload           29
        //  1034: ifnonnull       1146
        //  1037: istore          35
        //  1039: iload           35
        //  1041: aload           34
        //  1043: arraylength    
        //  1044: if_icmpge       1131
        //  1047: aload_0        
        //  1048: ldc2_w          -2017493056789665212
        //  1051: lload_2        
        //  1052: invokedynamic   BootstrapMethod #18, r:(Ljava/lang/Object;JJ)Lcom/zelix/l6q;
        //  1057: aload           34
        //  1059: iload           35
        //  1061: aaload         
        //  1062: lload           25
        //  1064: iconst_1       
        //  1065: anewarray       Ljava/lang/Object;
        //  1068: dup_x2         
        //  1069: dup_x2         
        //  1070: pop            
        //  1071: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1074: iconst_0       
        //  1075: swap           
        //  1076: aastore        
        //  1077: ldc2_w          -398214864687148175
        //  1080: lload_2        
        //  1081: invokedynamic   BootstrapMethod #19, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String;
        //  1086: aload           33
        //  1088: lload           27
        //  1090: invokevirtual   com/zelix/l6q.t:(Ljava/lang/Object;Ljava/lang/Object;J)V
        //  1093: iinc            35, 1
        //  1096: aload           29
        //  1098: lload_2        
        //  1099: lconst_0       
        //  1100: lcmp           
        //  1101: ifle            1136
        //  1104: ifnonnull       1134
        //  1107: aload           29
        //  1109: ifnull          1039
        //  1112: lload_2        
        //  1113: lconst_0       
        //  1114: lcmp           
        //  1115: iflt            1096
        //  1118: goto            1131
        //  1121: ldc2_w          -2074774559614406506
        //  1124: lload_2        
        //  1125: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //  1130: athrow         
        //  1131: iinc            31, 1
        //  1134: aload           29
        //  1136: ifnull          904
        //  1139: lload_2        
        //  1140: lconst_0       
        //  1141: lcmp           
        //  1142: iflt            1148
        //  1145: iconst_0       
        //  1146: istore          31
        //  1148: iload           31
        //  1150: aload           30
        //  1152: invokeinterface java/util/List.size:()I
        //  1157: if_icmpge       1208
        //  1160: aload           30
        //  1162: iload           31
        //  1164: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1169: checkcast       Lcom/zelix/gs;
        //  1172: astore          32
        //  1174: aload           32
        //  1176: lload           11
        //  1178: iconst_1       
        //  1179: anewarray       Ljava/lang/Object;
        //  1182: dup_x2         
        //  1183: dup_x2         
        //  1184: pop            
        //  1185: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1188: iconst_0       
        //  1189: swap           
        //  1190: aastore        
        //  1191: ldc2_w          -1738848567290340912
        //  1194: lload_2        
        //  1195: invokedynamic   BootstrapMethod #20, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //  1200: iinc            31, 1
        //  1203: aload           29
        //  1205: ifnull          1148
        //  1208: return         
        //    StackMapTable: 00 39 FF 00 BE 00 16 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 00 00 41 01 04 FF 00 0E 00 16 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 00 02 01 07 01 0D FF 00 0A 00 16 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 00 02 01 07 01 0D 45 07 00 68 49 01 45 07 00 68 09 4B 07 00 68 49 07 00 AB 4B 07 00 68 49 01 49 07 00 68 49 07 00 AB FE 00 28 07 00 02 07 01 B6 01 FF 00 20 00 19 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 00 02 07 01 B6 01 00 02 07 01 46 07 00 02 47 07 00 68 FF 00 09 00 19 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 00 02 07 01 B6 01 00 02 07 01 46 07 00 02 51 07 00 68 49 07 01 46 44 07 00 68 FF 00 09 00 19 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 00 02 07 01 B6 01 00 02 07 01 46 07 00 02 42 07 01 46 FF 00 08 00 19 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 00 02 07 01 B6 01 00 02 07 01 46 07 00 02 FA 00 2A F9 00 10 FD 00 1C 07 01 42 07 00 9E FF 00 36 00 19 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 01 42 07 00 9E 07 00 73 00 01 07 00 68 09 57 07 00 68 49 01 FF 00 01 00 19 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 01 42 07 00 9E 07 00 73 00 02 01 07 01 0D 48 07 00 68 09 59 07 00 68 49 01 00 FA 00 04 FF 00 08 00 17 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 01 42 00 01 07 00 68 FF 00 38 00 18 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 01 91 07 01 91 00 00 44 07 01 0D F9 00 02 FB 00 6D 40 01 01 FF 00 86 00 1A 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 07 00 A2 07 01 28 07 01 23 01 00 00 38 58 07 00 68 09 02 41 07 01 0D FF 00 02 00 16 07 01 04 07 01 55 04 01 01 01 04 04 04 04 01 04 04 01 01 01 04 04 04 07 01 0D 07 01 4F 01 00 00 46 01 01 54 07 01 91 26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  659    698    701    711    Ljava/io/IOException;
        //  654    662    665    675    Ljava/io/IOException;
        //  604    641    644    654    Ljava/io/IOException;
        //  587    607    610    620    Ljava/io/IOException;
        //  411    441    444    454    Ljava/io/IOException;
        //  391    426    429    439    Ljava/io/IOException;
        //  368    398    401    411    Ljava/io/IOException;
        //  299    306    309    319    Ljava/io/IOException;
        //  255    286    289    299    Ljava/io/IOException;
        //  239    264    267    277    Ljava/io/IOException;
        //  221    242    245    255    Ljava/io/IOException;
        //  197    226    229    239    Ljava/io/IOException;
        //  529    717    726    783    Ljava/io/IOException;
        //  1047   1112   1121   1131   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0223:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public mh W(final Object[] array) {
        final long n2;
        final long n = n2 = (d5.a ^ (long)array[0]);
        final long n3 = n2 ^ 0x419FDA6DCA3CL;
        final long l = n2 ^ 0xD5CCE7BCB1DL;
        final mh mh = new mh(n3);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_5.invoke(mh, new Object[] { l, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_4.invoke(this, -1443429938835931083L, n) }, -1453836715301949557L, n);
        return mh;
    }
    
    public synchronized List a(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: iconst_0       
        //     3: aaload         
        //     4: checkcast       Ljava/lang/String;
        //     7: astore          4
        //     9: dup            
        //    10: iconst_1       
        //    11: aaload         
        //    12: checkcast       Ljava/lang/Long;
        //    15: invokevirtual   java/lang/Long.longValue:()J
        //    18: lstore_2       
        //    19: pop            
        //    20: getstatic       com/zelix/d5.a:J
        //    23: lload_2        
        //    24: lxor           
        //    25: lstore_2       
        //    26: lload_2        
        //    27: dup2           
        //    28: ldc2_w          111656500213353
        //    31: lxor           
        //    32: dup2           
        //    33: bipush          32
        //    35: lushr          
        //    36: l2i            
        //    37: istore          5
        //    39: dup2           
        //    40: bipush          32
        //    42: lshl           
        //    43: bipush          48
        //    45: lushr          
        //    46: l2i            
        //    47: istore          6
        //    49: dup2           
        //    50: bipush          48
        //    52: lshl           
        //    53: bipush          48
        //    55: lushr          
        //    56: l2i            
        //    57: istore          7
        //    59: pop2           
        //    60: pop2           
        //    61: ldc2_w          9001931797236554913
        //    64: lload_2        
        //    65: invokedynamic   BootstrapMethod #3, l:(JJ)[I
        //    70: aconst_null    
        //    71: astore          9
        //    73: astore          8
        //    75: iconst_0       
        //    76: istore          10
        //    78: iload           10
        //    80: aload_0        
        //    81: ldc2_w          8782225319575671330
        //    84: lload_2        
        //    85: invokedynamic   BootstrapMethod #15, r:(Ljava/lang/Object;JJ)[Lcom/zelix/_1;
        //    90: arraylength    
        //    91: if_icmpge       410
        //    94: aload_0        
        //    95: ldc2_w          8782225319575671330
        //    98: lload_2        
        //    99: invokedynamic   BootstrapMethod #15, r:(Ljava/lang/Object;JJ)[Lcom/zelix/_1;
        //   104: iload           10
        //   106: aaload         
        //   107: astore          11
        //   109: aload           11
        //   111: iload           5
        //   113: iload           6
        //   115: iload           7
        //   117: invokevirtual   com/zelix/_v.a:(III)Ljava/lang/String;
        //   120: astore          12
        //   122: aload           12
        //   124: aload           4
        //   126: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   129: ifeq            220
        //   132: aload           9
        //   134: aload           8
        //   136: lload_2        
        //   137: lconst_0       
        //   138: lcmp           
        //   139: iflt            147
        //   142: ifnonnull       338
        //   145: aload           8
        //   147: ifnonnull       190
        //   150: goto            163
        //   153: ldc2_w          7195841883434184830
        //   156: lload_2        
        //   157: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   162: athrow         
        //   163: ifnonnull       188
        //   166: goto            179
        //   169: ldc2_w          7195841883434184830
        //   172: lload_2        
        //   173: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   178: athrow         
        //   179: new             Ljava/util/ArrayList;
        //   182: dup            
        //   183: invokespecial   java/util/ArrayList.<init>:()V
        //   186: astore          9
        //   188: aload           9
        //   190: aload_0        
        //   191: ldc2_w          8782225319575671330
        //   194: lload_2        
        //   195: invokedynamic   BootstrapMethod #15, r:(Ljava/lang/Object;JJ)[Lcom/zelix/_1;
        //   200: iload           10
        //   202: aaload         
        //   203: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   208: pop            
        //   209: aload           8
        //   211: lload_2        
        //   212: lconst_0       
        //   213: lcmp           
        //   214: ifle            407
        //   217: ifnull          402
        //   220: lload_2        
        //   221: lconst_0       
        //   222: lcmp           
        //   223: iflt            343
        //   226: aload           12
        //   228: aload           8
        //   230: ifnonnull       338
        //   233: goto            246
        //   236: ldc2_w          7195841883434184830
        //   239: lload_2        
        //   240: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   245: athrow         
        //   246: lload_2        
        //   247: lconst_0       
        //   248: lcmp           
        //   249: iflt            325
        //   252: sipush          7596
        //   255: ldc2_w          8863714381324975178
        //   258: lload_2        
        //   259: lxor           
        //   260: invokedynamic   BootstrapMethod #0, u:(IJ)Ljava/lang/String;
        //   265: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   268: ifeq            308
        //   271: goto            284
        //   274: ldc2_w          7195841883434184830
        //   277: lload_2        
        //   278: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   283: athrow         
        //   284: aload           8
        //   286: lload_2        
        //   287: lconst_0       
        //   288: lcmp           
        //   289: ifle            407
        //   292: ifnull          402
        //   295: goto            308
        //   298: ldc2_w          7195841883434184830
        //   301: lload_2        
        //   302: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   307: athrow         
        //   308: aload_0        
        //   309: ldc2_w          7350685872782786246
        //   312: lload_2        
        //   313: invokedynamic   BootstrapMethod #16, r:(Ljava/lang/Object;JJ)Ljava/util/Map;
        //   318: aload           12
        //   320: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   325: goto            338
        //   328: ldc2_w          7195841883434184830
        //   331: lload_2        
        //   332: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   337: athrow         
        //   338: checkcast       Lcom/zelix/_v;
        //   341: astore          11
        //   343: lload_2        
        //   344: lconst_0       
        //   345: lcmp           
        //   346: iflt            354
        //   349: aload           11
        //   351: ifnonnull       378
        //   354: aload           8
        //   356: lload_2        
        //   357: lconst_0       
        //   358: lcmp           
        //   359: ifle            407
        //   362: ifnull          402
        //   365: goto            378
        //   368: ldc2_w          7195841883434184830
        //   371: lload_2        
        //   372: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   377: athrow         
        //   378: aload           8
        //   380: ifnull          109
        //   383: lload_2        
        //   384: lconst_0       
        //   385: lcmp           
        //   386: ifle            132
        //   389: goto            402
        //   392: ldc2_w          7195841883434184830
        //   395: lload_2        
        //   396: invokedynamic   BootstrapMethod #5, l:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   401: athrow         
        //   402: iinc            10, 1
        //   405: aload           8
        //   407: ifnull          78
        //   410: aload           9
        //   412: areturn        
        //    StackMapTable: 00 1C FF 00 4E 00 0A 07 01 04 07 00 0B 04 07 00 02 01 01 01 07 01 0D 07 01 4F 01 00 00 FC 00 1E 07 01 68 FC 00 16 07 00 02 FF 00 0E 00 0C 07 01 04 07 00 0B 04 07 00 02 01 01 01 07 01 0D 07 01 4F 01 07 01 68 07 00 02 00 02 07 01 4F 07 01 0D 45 07 00 AC 49 07 01 4F 45 07 00 AC 09 08 41 07 01 4F 1D 4F 07 00 AC 49 07 00 02 5B 07 00 AC 09 4D 07 00 AC 09 50 07 01 91 42 07 00 AC 49 07 01 91 04 0A 4D 07 00 AC 09 4D 07 00 AC 09 44 07 01 0D F9 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type          
        //  -----  -----  -----  -----  --------------
        //  132    150    153    163    Lcom/zelix/n9;
        //  145    166    169    179    Lcom/zelix/n9;
        //  190    233    236    246    Lcom/zelix/n9;
        //  220    271    274    284    Lcom/zelix/n9;
        //  246    295    298    308    Lcom/zelix/n9;
        //  284    325    328    338    Lcom/zelix/n9;
        //  343    365    368    378    Lcom/zelix/n9;
        //  354    383    392    402    Lcom/zelix/n9;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0147:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        a = prr.a(4607370931788222258L, -4585345676294027847L, (Object)MethodHandles.lookup().lookupClass()).a(103132026842196L);
        d = new HashMap(13);
        final long n = d5.a ^ 0x4EFE4209083EL;
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] b2 = new String[3];
        int n2 = 0;
        final String s;
        final int length = (s = "\u00f8?\u00c0\u000f\u00fa\u001c\u00c2\u00f4\u00f0\u007fB\u007f?\u001b\u00de?(\u0084?\u009ee\u008f\u00d0\u0090?\u007fz\u001eB\u0096\u00fe&a\u00d5\u009c\n]F7\u009d\u0011%?<\u0087_k\u00d6p*F\u0099¡¤\u00c3;\u00cf\u007f 2N\u009d\rg\u001f\u00e9\u009egL\u0092\u008ayO\u007f\u0017%6\u008e\u00d3\u00d8osj\u001c\u0086\u0096\u00ca\u0016??¡À").length();
        int char1 = 16;
        int index = -1;
        while (true) {
            ++index;
            final String s2 = s;
            final int beginIndex = index;
            b2[n2++] = a(instance.doFinal(s2.substring(beginIndex, beginIndex + char1).getBytes("ISO-8859-1"))).intern();
            if ((index += char1) >= length) {
                break;
            }
            char1 = s.charAt(index);
        }
        b = b2;
        c = new String[3];
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key2[j] = (byte)(n << j * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long n3 = -2460435864116089644L;
        final byte[] doFinal = instance3.doFinal(new byte[] { (byte)(n3 >>> 56), (byte)(n3 >>> 48), (byte)(n3 >>> 40), (byte)(n3 >>> 32), (byte)(n3 >>> 24), (byte)(n3 >>> 16), (byte)(n3 >>> 8), (byte)n3 });
        e = (((long)doFinal[0] & 0xFFL) << 56 | ((long)doFinal[1] & 0xFFL) << 48 | ((long)doFinal[2] & 0xFFL) << 40 | ((long)doFinal[3] & 0xFFL) << 32 | ((long)doFinal[4] & 0xFFL) << 24 | ((long)doFinal[5] & 0xFFL) << 16 | ((long)doFinal[6] & 0xFFL) << 8 | ((long)doFinal[7] & 0xFFL));
    }
    
    private static Exception a(final Exception ex) {
        return ex;
    }
    
    private static String a(final byte[] array) {
        int count = 0;
        final int length;
        final char[] value = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            final int n;
            if ((n = (0xFF & array[i])) < 192) {
                value[count++] = (char)n;
            }
            else if (n < 224) {
                value[count++] = (char)((char)((char)(n & 0x1F) << 6) | (char)(array[++i] & 0x3F));
            }
            else if (i < length - 2) {
                value[count++] = (char)((char)((char)((char)(n & 0xF) << 12) | (char)(array[++i] & 0x3F) << 6) | (char)(array[++i] & 0x3F));
            }
        }
        return new String(value, 0, count);
    }
    
    private static String a(final int n, final long n2) {
        final int n3 = n ^ (int)(n2 & 0x7FFFL) ^ 0x1604;
        if (d5.c[n3] == null) {
            Object[] array;
            try {
                final Long value = Thread.currentThread().getId();
                array = d5.d.get(value);
                if (array == null) {
                    array = new Object[] { Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8]) };
                    d5.d.put(value, array);
                }
            }
            catch (final Exception cause) {
                throw new RuntimeException("com/zelix/d5", cause);
            }
            final byte[] key = new byte[8];
            key[0] = (byte)(n2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                key[i] = (byte)(n2 << i * 8 >>> 56);
            }
            ((Cipher)array[0]).init(2, ((SecretKeyFactory)array[1]).generateSecret(new DESKeySpec(key)), (AlgorithmParameterSpec)array[2]);
            d5.c[n3] = a(((Cipher)array[0]).doFinal(d5.b[n3].getBytes("ISO-8859-1")));
        }
        return d5.c[n3];
    }
    
    private static Object a(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final Object[] array) {
        final String a = a((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, a), 0, Integer.TYPE, Long.TYPE));
        return a;
    }
    
    private static CallSite a(final MethodHandles.Lookup lookup, final String str, final MethodType methodType) {
        final MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(/* ldc_method_handle(!) */ProcyonConstantHelper_1.HANDLE.asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, str), methodType));
        }
        catch (final Exception cause) {
            throw new RuntimeException("com/zelix/d5" + " : " + str + " : " + methodType.toString(), cause);
        }
        return mutableCallSite;
    }
    
    private static final MethodHandles.Lookup __PROCYON__LOOKUP_1__ = MethodHandles.lookup();
    
    // This helper class was generated by Procyon to approximate the behavior of a
    // MethodHandle constant that cannot (currently) be represented in Java code.
    private static final class ProcyonConstantHelper_1
    {
        static final MethodHandle HANDLE;
        
        static {
            MethodHandle handle;
            final MethodType type = MethodType.methodType(Object.class, MethodHandles.Lookup.class, MutableCallSite.class, String.class, Object[].class);
            try {
                handle = d5.__PROCYON__LOOKUP_1__.findStatic(d5.class, "a", type);
            }
            catch (final ReflectiveOperationException e) {
                handle = MethodHandles.permuteArguments(MethodHandles.insertArguments(MethodHandles.throwException(type.returnType(), e.getClass()), 0, e), type);
            }
            ProcyonConstantHelper_1.HANDLE = handle;
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_2
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_2.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_2.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_2.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "q", MethodType.methodType(l6q.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_2.fence = 1;
                ProcyonInvokeDynamicHelper_2.handle = handle;
                ProcyonInvokeDynamicHelper_2.fence = 0;
            }
            return handle;
        }
        
        private static l6q invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_3
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_3.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_3.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_3.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "o", MethodType.methodType(Exception.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_3.fence = 1;
                ProcyonInvokeDynamicHelper_3.handle = handle;
                ProcyonInvokeDynamicHelper_3.fence = 0;
            }
            return handle;
        }
        
        private static Exception invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_4
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_4.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_4.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_4.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(_1[].class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_4.fence = 1;
                ProcyonInvokeDynamicHelper_4.handle = handle;
                ProcyonInvokeDynamicHelper_4.fence = 0;
            }
            return handle;
        }
        
        private static _1[] invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_5
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_5.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_5.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_5.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_5.fence = 1;
                ProcyonInvokeDynamicHelper_5.handle = handle;
                ProcyonInvokeDynamicHelper_5.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
