// 
// Decompiled by Procyon v0.6.0
// 

package com.zelix;

import java.util.zip.CRC32;
import java.io.OutputStream;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import javax.crypto.SecretKey;
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
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.util.zip.ZipOutputStream;
import java.util.Map;
import java.util.List;

public class cn
{
    private dx d;
    private List O;
    private boolean v;
    private String e;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    
    public void z(final Object[] array) {
        final ZipOutputStream zipOutputStream = (ZipOutputStream)array[0];
        final Long n = (Long)array[1];
        final v8 v8 = (v8)array[2];
        final v8 v9 = (v8)array[3];
        final _x x = (_x)array[4];
        final long longValue = (long)array[5];
        final boolean booleanValue = (boolean)array[6];
        final yf yf = (yf)array[7];
        final long n3;
        final long n2 = n3 = (cn.a ^ longValue);
        final long l = n3 ^ 0x2E9629904107L;
        final long i = n3 ^ 0x5DF088918D53L;
        final long j = n3 ^ 0x5BE8C1663D59L;
        final long k = n3 ^ 0x67058856933BL;
        final long m = n3 ^ 0x67058856933BL;
        final y5 y5 = new y5(n3 ^ 0x34BC4AD07A9EL, zipOutputStream, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_3.invoke(755, 0x12FDC376DCDBB324L ^ n2), booleanValue);
        final int[] array2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_4.invoke(-8601688309699885882L, n2);
        final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_5.invoke(y5, new Object[] { i }, -7753667276458579629L, n2), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_6.invoke(6852, 0x6E71A28363A52B14L ^ n2)));
        final boolean b = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_7.invoke(new Object[] { l, v8 }, -8376790063219610875L, n2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_10.invoke(ProcyonInvokeDynamicHelper_8.invoke(this, -7756773719047303156L, n2), new Object[] { printWriter, v8, v9, x, m, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_9.invoke(this, -7982066593219679888L, n2), b, yf }, -7551994823796430970L, n2);
        int n4 = 0;
        final int[] array3 = array2;
    Label_0360:
        while (n4 < /* invokedynamic(!) */ProcyonInvokeDynamicHelper_11.invoke(this, -8542198469113365917L, n2).size()) {
            final ds ds = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_12.invoke(this, -8542198469113365917L, n2).get(n4);
            try {
                /* invokedynamic(!) */ProcyonInvokeDynamicHelper_14.invoke(ds, new Object[] { printWriter, v8, v9, x, k, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_13.invoke(this, -7982066593219679888L, n2), b, yf }, -7761856069819105484L, n2);
                ++n4;
                do {
                    final int[] array4 = array3;
                    if (n2 >= 0L && array4 == null) {
                        return;
                    }
                    if (array4 == null) {
                        continue;
                    }
                    continue Label_0360;
                } while (n2 < 0L);
            }
            catch (final NumberFormatException ex) {
                throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_15.invoke(ex, -7744168399065939746L, n2);
            }
            break;
        }
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_16.invoke(printWriter, -8416017948647045159L, n2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_17.invoke(y5, new Object[] { n, j }, -8630450371925806404L, n2);
    }
    
    public boolean A(final Object[] array) {
        final long n = cn.a ^ (long)array[0];
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_19.invoke(ProcyonInvokeDynamicHelper_18.invoke(this, -4407052532451916159L, n), new Object[] { n ^ 0x2993262E0537L }, -2359310132257252522L, n);
    }
    
    public cn(final ZipFile p0, final ZipEntry p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: lload_3        
        //     4: lxor           
        //     5: lstore_3       
        //     6: lload_3        
        //     7: dup2           
        //     8: ldc2_w          70731664040805
        //    11: lxor           
        //    12: lstore          5
        //    14: dup2           
        //    15: ldc2_w          113190092520383
        //    18: lxor           
        //    19: dup2           
        //    20: bipush          32
        //    22: lushr          
        //    23: lstore          7
        //    25: dup2           
        //    26: bipush          32
        //    28: lshl           
        //    29: bipush          32
        //    31: lushr          
        //    32: l2i            
        //    33: istore          9
        //    35: pop2           
        //    36: dup2           
        //    37: ldc2_w          111783320521411
        //    40: lxor           
        //    41: lstore          10
        //    43: dup2           
        //    44: ldc2_w          105590036108392
        //    47: lxor           
        //    48: lstore          12
        //    50: dup2           
        //    51: ldc2_w          21916483995480
        //    54: lxor           
        //    55: lstore          14
        //    57: pop2           
        //    58: ldc2_w          -3936432500879194824
        //    61: lload_3        
        //    62: invokedynamic   BootstrapMethod #14, o:(JJ)[I
        //    67: aload_0        
        //    68: invokespecial   java/lang/Object.<init>:()V
        //    71: aload_0        
        //    72: new             Ljava/util/ArrayList;
        //    75: dup            
        //    76: invokespecial   java/util/ArrayList.<init>:()V
        //    79: ldc2_w          -3996290797046400099
        //    82: lload_3        
        //    83: invokedynamic   BootstrapMethod #15, s:(Ljava/lang/Object;Ljava/util/List;JJ)V
        //    88: astore          16
        //    90: aconst_null    
        //    91: astore          17
        //    93: aconst_null    
        //    94: astore          18
        //    96: aload_0        
        //    97: aload_1        
        //    98: ldc2_w          -3597571678382659823
        //   101: lload_3        
        //   102: invokedynamic   BootstrapMethod #16, p:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   107: ldc2_w          -3403505498398480242
        //   110: lload_3        
        //   111: invokedynamic   BootstrapMethod #17, s:(Ljava/lang/Object;Ljava/lang/String;JJ)V
        //   116: aload_0        
        //   117: aload_2        
        //   118: ldc2_w          -3125401803868797184
        //   121: lload_3        
        //   122: invokedynamic   BootstrapMethod #18, p:(Ljava/lang/Object;JJ)I
        //   127: aload           16
        //   129: ifnull          175
        //   132: sipush          20062
        //   135: ldc2_w          7307472197930100016
        //   138: lload_3        
        //   139: lxor           
        //   140: invokedynamic   BootstrapMethod #1, v:(IJ)I
        //   145: if_icmpne       178
        //   148: goto            161
        //   151: ldc2_w          -3064278784088686304
        //   154: lload_3        
        //   155: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   160: athrow         
        //   161: iconst_1       
        //   162: goto            175
        //   165: ldc2_w          -3064278784088686304
        //   168: lload_3        
        //   169: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   174: athrow         
        //   175: goto            179
        //   178: iconst_0       
        //   179: ldc2_w          -3547386568195517608
        //   182: lload_3        
        //   183: invokedynamic   BootstrapMethod #20, s:(Ljava/lang/Object;ZJJ)V
        //   188: aload_1        
        //   189: aload_2        
        //   190: ldc2_w          -3789157015677833566
        //   193: lload_3        
        //   194: invokedynamic   BootstrapMethod #21, p:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/InputStream;
        //   199: astore          17
        //   201: lload           12
        //   203: aload           17
        //   205: sipush          9778
        //   208: ldc2_w          773115330881836569
        //   211: lload_3        
        //   212: lxor           
        //   213: invokedynamic   BootstrapMethod #0, b:(IJ)Ljava/lang/String;
        //   218: aconst_null    
        //   219: iconst_4       
        //   220: anewarray       Ljava/lang/Object;
        //   223: dup_x1         
        //   224: swap           
        //   225: iconst_3       
        //   226: swap           
        //   227: aastore        
        //   228: dup_x1         
        //   229: swap           
        //   230: iconst_2       
        //   231: swap           
        //   232: aastore        
        //   233: dup_x1         
        //   234: swap           
        //   235: iconst_1       
        //   236: swap           
        //   237: aastore        
        //   238: dup_x2         
        //   239: dup_x2         
        //   240: pop            
        //   241: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   244: iconst_0       
        //   245: swap           
        //   246: aastore        
        //   247: ldc2_w          -3543397971938400466
        //   250: lload_3        
        //   251: invokedynamic   BootstrapMethod #22, o:(Ljava/lang/Object;JJ)Ljava/io/BufferedReader;
        //   256: astore          18
        //   258: aload_0        
        //   259: new             Lcom/zelix/dx;
        //   262: dup            
        //   263: aload           18
        //   265: lload           7
        //   267: iload           9
        //   269: invokespecial   com/zelix/dx.<init>:(Ljava/io/BufferedReader;JI)V
        //   272: ldc2_w          -3052255174628748814
        //   275: lload_3        
        //   276: invokedynamic   BootstrapMethod #23, s:(Ljava/lang/Object;Lcom/zelix/dx;JJ)V
        //   281: aload_0        
        //   282: ldc2_w          -3052255174628748814
        //   285: lload_3        
        //   286: invokedynamic   BootstrapMethod #24, q:(Ljava/lang/Object;JJ)Lcom/zelix/dx;
        //   291: lload           10
        //   293: iconst_1       
        //   294: anewarray       Ljava/lang/Object;
        //   297: dup_x2         
        //   298: dup_x2         
        //   299: pop            
        //   300: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   303: iconst_0       
        //   304: swap           
        //   305: aastore        
        //   306: ldc2_w          -3871412134470407026
        //   309: lload_3        
        //   310: invokedynamic   BootstrapMethod #25, p:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   315: istore          19
        //   317: iload           19
        //   319: ifne            470
        //   322: new             Lcom/zelix/ds;
        //   325: dup            
        //   326: lload           14
        //   328: aload           18
        //   330: invokespecial   com/zelix/ds.<init>:(JLjava/io/BufferedReader;)V
        //   333: astore          20
        //   335: lload_3        
        //   336: lconst_0       
        //   337: lcmp           
        //   338: iflt            524
        //   341: aload           16
        //   343: ifnull          524
        //   346: aload           20
        //   348: lload           5
        //   350: iconst_1       
        //   351: anewarray       Ljava/lang/Object;
        //   354: dup_x2         
        //   355: dup_x2         
        //   356: pop            
        //   357: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   360: iconst_0       
        //   361: swap           
        //   362: aastore        
        //   363: ldc2_w          -3270370981398712662
        //   366: lload_3        
        //   367: invokedynamic   BootstrapMethod #25, p:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   372: aload           16
        //   374: ifnull          463
        //   377: goto            390
        //   380: ldc2_w          -3064278784088686304
        //   383: lload_3        
        //   384: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   389: athrow         
        //   390: ifne            437
        //   393: goto            406
        //   396: ldc2_w          -3064278784088686304
        //   399: lload_3        
        //   400: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   405: athrow         
        //   406: aload_0        
        //   407: ldc2_w          -3996290797046400099
        //   410: lload_3        
        //   411: invokedynamic   BootstrapMethod #26, q:(Ljava/lang/Object;JJ)Ljava/util/List;
        //   416: aload           20
        //   418: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   423: pop            
        //   424: goto            437
        //   427: ldc2_w          -3064278784088686304
        //   430: lload_3        
        //   431: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   436: athrow         
        //   437: aload           20
        //   439: lload           10
        //   441: iconst_1       
        //   442: anewarray       Ljava/lang/Object;
        //   445: dup_x2         
        //   446: dup_x2         
        //   447: pop            
        //   448: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   451: iconst_0       
        //   452: swap           
        //   453: aastore        
        //   454: ldc2_w          -3871412134470407026
        //   457: lload_3        
        //   458: invokedynamic   BootstrapMethod #25, p:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   463: istore          19
        //   465: aload           16
        //   467: ifnonnull       317
        //   470: lload_3        
        //   471: lconst_0       
        //   472: lcmp           
        //   473: ifle            524
        //   476: lload_3        
        //   477: lconst_0       
        //   478: lcmp           
        //   479: ifle            516
        //   482: aload           18
        //   484: aload           16
        //   486: ifnull          507
        //   489: ifnull          524
        //   492: goto            505
        //   495: ldc2_w          -3064278784088686304
        //   498: lload_3        
        //   499: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   504: athrow         
        //   505: aload           18
        //   507: ldc2_w          -3372658661534342797
        //   510: lload_3        
        //   511: invokedynamic   BootstrapMethod #27, p:(Ljava/lang/Object;JJ)V
        //   516: goto            691
        //   519: astore          19
        //   521: goto            691
        //   524: lload_3        
        //   525: lconst_0       
        //   526: lcmp           
        //   527: ifle            564
        //   530: aload           17
        //   532: aload           16
        //   534: ifnull          555
        //   537: ifnull          691
        //   540: goto            553
        //   543: ldc2_w          -3064278784088686304
        //   546: lload_3        
        //   547: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   552: athrow         
        //   553: aload           17
        //   555: ldc2_w          -3421318426312640987
        //   558: lload_3        
        //   559: invokedynamic   BootstrapMethod #27, p:(Ljava/lang/Object;JJ)V
        //   564: goto            691
        //   567: astore          19
        //   569: goto            691
        //   572: astore          21
        //   574: lload_3        
        //   575: lconst_0       
        //   576: lcmp           
        //   577: ifle            614
        //   580: aload           18
        //   582: aload           16
        //   584: ifnull          605
        //   587: ifnull          630
        //   590: goto            603
        //   593: ldc2_w          -3064278784088686304
        //   596: lload_3        
        //   597: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   602: athrow         
        //   603: aload           18
        //   605: ldc2_w          -3372658661534342797
        //   608: lload_3        
        //   609: invokedynamic   BootstrapMethod #27, p:(Ljava/lang/Object;JJ)V
        //   614: goto            688
        //   617: astore          22
        //   619: lload_3        
        //   620: lconst_0       
        //   621: lcmp           
        //   622: iflt            630
        //   625: aload           16
        //   627: ifnonnull       688
        //   630: lload_3        
        //   631: lconst_0       
        //   632: lcmp           
        //   633: ifle            683
        //   636: aload           17
        //   638: aload           16
        //   640: ifnull          674
        //   643: goto            656
        //   646: ldc2_w          -3064278784088686304
        //   649: lload_3        
        //   650: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   655: athrow         
        //   656: ifnull          688
        //   659: goto            672
        //   662: ldc2_w          -3064278784088686304
        //   665: lload_3        
        //   666: invokedynamic   BootstrapMethod #19, o:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   671: athrow         
        //   672: aload           17
        //   674: ldc2_w          -3421318426312640987
        //   677: lload_3        
        //   678: invokedynamic   BootstrapMethod #27, p:(Ljava/lang/Object;JJ)V
        //   683: goto            688
        //   686: astore          22
        //   688: aload           21
        //   690: athrow         
        //   691: return         
        //    StackMapTable: 00 2A FF 00 97 00 0D 07 01 54 07 00 E2 07 01 39 04 04 04 01 04 04 04 07 00 7A 05 05 00 01 07 00 25 49 07 01 54 43 07 00 25 FF 00 09 00 0D 07 01 54 07 00 E2 07 01 39 04 04 04 01 04 04 04 07 00 7A 05 05 00 02 07 01 54 01 42 07 01 54 FF 00 00 00 0D 07 01 54 07 00 E2 07 01 39 04 04 04 01 04 04 04 07 00 7A 05 05 00 02 07 01 54 01 FF 00 89 00 0E 07 01 54 07 00 E2 07 01 39 04 04 04 01 04 04 04 07 00 7A 07 00 C3 07 01 25 01 00 00 FF 00 3E 00 0F 07 01 54 07 00 E2 07 01 39 04 04 04 01 04 04 04 07 00 7A 07 00 C3 07 01 25 01 07 00 2A 00 01 07 00 25 49 01 45 07 00 25 09 54 07 00 25 09 59 01 FA 00 06 58 07 00 25 09 41 07 01 25 08 42 07 00 25 04 52 07 00 25 09 41 07 00 C3 08 42 07 00 25 FF 00 04 00 0D 07 01 54 07 00 E2 07 01 39 04 04 04 01 04 04 04 07 00 7A 07 00 C3 07 01 25 00 01 07 00 31 FF 00 14 00 10 07 01 54 07 00 E2 07 01 39 04 04 04 01 04 04 04 07 00 7A 07 00 C3 07 01 25 00 00 07 00 31 00 01 07 00 25 09 41 07 01 25 08 42 07 00 25 0C 4F 07 00 25 49 07 00 C3 45 07 00 25 09 41 07 00 C3 08 42 07 00 25 01 F8 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  390    424    427    437    Ljava/io/IOException;
        //  346    393    396    406    Ljava/io/IOException;
        //  335    377    380    390    Ljava/io/IOException;
        //  132    162    165    175    Ljava/io/IOException;
        //  96     148    151    161    Ljava/io/IOException;
        //  505    516    519    524    Ljava/io/IOException;
        //  553    564    567    572    Ljava/io/IOException;
        //  188    470    572    691    Any
        //  524    540    543    553    Ljava/io/IOException;
        //  470    492    495    505    Ljava/io/IOException;
        //  603    614    617    630    Ljava/io/IOException;
        //  672    683    686    688    Ljava/io/IOException;
        //  572    574    572    691    Any
        //  574    590    593    603    Ljava/io/IOException;
        //  619    643    646    656    Ljava/io/IOException;
        //  630    659    662    672    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0390:
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
    
    public static boolean M(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: iconst_0       
        //     3: aaload         
        //     4: checkcast       Ljava/lang/Long;
        //     7: invokevirtual   java/lang/Long.longValue:()J
        //    10: lstore_2       
        //    11: dup            
        //    12: iconst_1       
        //    13: aaload         
        //    14: checkcast       Ljava/lang/String;
        //    17: astore          4
        //    19: dup            
        //    20: iconst_2       
        //    21: aaload         
        //    22: checkcast       Lcom/zelix/lb6;
        //    25: astore_1       
        //    26: pop            
        //    27: getstatic       com/zelix/cn.a:J
        //    30: lload_2        
        //    31: lxor           
        //    32: lstore_2       
        //    33: ldc2_w          5401106431442912914
        //    36: lload_2        
        //    37: invokedynamic   BootstrapMethod #28, m:(JJ)[I
        //    42: aload_1        
        //    43: iconst_m1      
        //    44: invokevirtual   com/zelix/lb6.P:(I)V
        //    47: astore          5
        //    49: aload           4
        //    51: sipush          3588
        //    54: ldc2_w          5989119799753964932
        //    57: lload_2        
        //    58: lxor           
        //    59: invokedynamic   BootstrapMethod #0, b:(IJ)Ljava/lang/String;
        //    64: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    67: aload           5
        //    69: ifnull          241
        //    72: ifeq            240
        //    75: goto            88
        //    78: ldc2_w          6256362447734588042
        //    81: lload_2        
        //    82: invokedynamic   BootstrapMethod #29, m:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //    87: athrow         
        //    88: aload           4
        //    90: invokevirtual   java/lang/String.length:()I
        //    93: aload           5
        //    95: ifnull          241
        //    98: goto            111
        //   101: ldc2_w          6256362447734588042
        //   104: lload_2        
        //   105: invokedynamic   BootstrapMethod #29, m:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   110: athrow         
        //   111: sipush          27347
        //   114: ldc2_w          2723293935185336657
        //   117: lload_2        
        //   118: lxor           
        //   119: invokedynamic   BootstrapMethod #0, b:(IJ)Ljava/lang/String;
        //   124: invokevirtual   java/lang/String.length:()I
        //   127: if_icmple       240
        //   130: goto            143
        //   133: ldc2_w          6256362447734588042
        //   136: lload_2        
        //   137: invokedynamic   BootstrapMethod #29, m:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   142: athrow         
        //   143: aload           4
        //   145: sipush          27347
        //   148: ldc2_w          2723293935185336657
        //   151: lload_2        
        //   152: lxor           
        //   153: invokedynamic   BootstrapMethod #0, b:(IJ)Ljava/lang/String;
        //   158: invokevirtual   java/lang/String.length:()I
        //   161: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   164: astore          6
        //   166: aload           6
        //   168: sipush          28724
        //   171: ldc2_w          5588546658741393649
        //   174: lload_2        
        //   175: lxor           
        //   176: invokedynamic   BootstrapMethod #1, v:(IJ)I
        //   181: invokevirtual   java/lang/String.indexOf:(I)I
        //   184: istore          7
        //   186: iload           7
        //   188: aload           5
        //   190: ifnull          239
        //   193: ifle            238
        //   196: goto            209
        //   199: ldc2_w          6256362447734588042
        //   202: lload_2        
        //   203: invokedynamic   BootstrapMethod #29, m:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   208: athrow         
        //   209: aload           6
        //   211: iconst_0       
        //   212: iload           7
        //   214: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   217: astore          8
        //   219: aload           8
        //   221: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   224: istore          9
        //   226: aload_1        
        //   227: iload           9
        //   229: invokevirtual   com/zelix/lb6.P:(I)V
        //   232: iconst_1       
        //   233: ireturn        
        //   234: astore          9
        //   236: iconst_0       
        //   237: ireturn        
        //   238: iconst_0       
        //   239: ireturn        
        //   240: iconst_0       
        //   241: ireturn        
        //    StackMapTable: 00 0D FF 00 4E 00 05 07 00 0B 07 00 9D 04 07 00 09 07 00 7A 00 01 07 00 91 09 4C 07 00 91 49 01 55 07 00 91 09 FF 00 37 00 07 07 00 0B 07 00 9D 04 07 00 09 07 00 7A 07 00 09 01 00 01 07 00 91 09 FF 00 18 00 08 07 00 0B 07 00 9D 04 07 00 09 07 00 7A 07 00 09 01 07 00 09 00 01 07 00 91 FA 00 03 40 01 F9 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  186    196    199    209    Ljava/lang/NumberFormatException;
        //  88     130    133    143    Ljava/lang/NumberFormatException;
        //  72     98     101    111    Ljava/lang/NumberFormatException;
        //  49     75     78     88     Ljava/lang/NumberFormatException;
        //  219    233    234    238    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
    
    public void Z(final Object[] array) {
        final String s = (String)array[0];
        final Map map = (Map)array[1];
        final Map map2 = (Map)array[2];
        final Map map3 = (Map)array[3];
        final long n = cn.a ^ (long)array[4];
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_21.invoke(ProcyonInvokeDynamicHelper_20.invoke(this, -1929474245467381393L, n), new Object[] { s, map, map2, n ^ 0x74A64F35051L, map3 }, -486584309365821160L, n);
        final int[] array2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_22.invoke(-449255994996148827L, n);
        int i = 0;
        final int[] array3 = array2;
        while (i < /* invokedynamic(!) */ProcyonInvokeDynamicHelper_23.invoke(this, -569910120173810944L, n).size()) {
            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_25.invoke((ds)/* invokedynamic(!) */ProcyonInvokeDynamicHelper_24.invoke(this, -569910120173810944L, n).get(i), new Object[] { s, map }, -2234780618186615459L, n);
            ++i;
            if (array3 == null) {
                break;
            }
        }
    }
    
    public boolean E(final Object[] array) {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_26.invoke(this, -7498391228554376595L, cn.a ^ (long)array[0]);
    }
    
    public boolean d(final Object[] array) {
        final long n = cn.a ^ (long)array[0];
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_28.invoke(ProcyonInvokeDynamicHelper_27.invoke(this, 2576182303453882262L, n), new Object[] { n ^ 0x1C8AFCE2EAE7L }, 2334873116393168308L, n);
    }
    
    static boolean N(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: iconst_0       
        //     3: aaload         
        //     4: checkcast       Ljava/lang/Long;
        //     7: invokevirtual   java/lang/Long.longValue:()J
        //    10: lstore_2       
        //    11: dup            
        //    12: iconst_1       
        //    13: aaload         
        //    14: checkcast       Lcom/zelix/v8;
        //    17: astore_1       
        //    18: pop            
        //    19: getstatic       com/zelix/cn.a:J
        //    22: lload_2        
        //    23: lxor           
        //    24: lstore_2       
        //    25: lload_2        
        //    26: dup2           
        //    27: ldc2_w          82407913587865
        //    30: lxor           
        //    31: lstore          4
        //    33: dup2           
        //    34: ldc2_w          3495064085731
        //    37: lxor           
        //    38: dup2           
        //    39: bipush          32
        //    41: lushr          
        //    42: l2i            
        //    43: istore          6
        //    45: dup2           
        //    46: bipush          32
        //    48: lshl           
        //    49: bipush          48
        //    51: lushr          
        //    52: l2i            
        //    53: istore          7
        //    55: dup2           
        //    56: bipush          48
        //    58: lshl           
        //    59: bipush          48
        //    61: lushr          
        //    62: l2i            
        //    63: istore          8
        //    65: pop2           
        //    66: pop2           
        //    67: ldc2_w          5899890714366025094
        //    70: lload_2        
        //    71: invokedynamic   BootstrapMethod #2, i:(JJ)[I
        //    76: iconst_0       
        //    77: istore          10
        //    79: astore          9
        //    81: aload_1        
        //    82: ldc2_w          5542746616814392282
        //    85: lload_2        
        //    86: invokedynamic   BootstrapMethod #37, v:(Ljava/lang/Object;JJ)I
        //    91: iload           6
        //    93: iload           7
        //    95: i2c            
        //    96: iload           8
        //    98: i2s            
        //    99: invokestatic    com/zelix/cf.x:(IICS)I
        //   102: lload           4
        //   104: iconst_2       
        //   105: anewarray       Ljava/lang/Object;
        //   108: dup_x2         
        //   109: dup_x2         
        //   110: pop            
        //   111: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   114: iconst_1       
        //   115: swap           
        //   116: aastore        
        //   117: dup_x1         
        //   118: swap           
        //   119: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   122: iconst_0       
        //   123: swap           
        //   124: aastore        
        //   125: ldc2_w          5231585870065459154
        //   128: lload_2        
        //   129: invokedynamic   BootstrapMethod #38, i:(Ljava/lang/Object;JJ)Ljava/util/HashSet;
        //   134: astore          11
        //   136: aload_1        
        //   137: ldc2_w          6278392868465959157
        //   140: lload_2        
        //   141: invokedynamic   BootstrapMethod #39, v:(Ljava/lang/Object;JJ)Ljava/util/Set;
        //   146: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   151: astore          12
        //   153: aload           12
        //   155: invokeinterface java/util/Iterator.hasNext:()Z
        //   160: ifeq            272
        //   163: aload           12
        //   165: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   170: checkcast       Ljava/util/Map$Entry;
        //   173: astore          13
        //   175: aload           11
        //   177: aload           13
        //   179: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   184: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   189: aload           9
        //   191: lload_2        
        //   192: lconst_0       
        //   193: lcmp           
        //   194: ifle            202
        //   197: ifnull          274
        //   200: aload           9
        //   202: ifnull          235
        //   205: goto            218
        //   208: ldc2_w          5604477440220092830
        //   211: lload_2        
        //   212: invokedynamic   BootstrapMethod #9, i:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   217: athrow         
        //   218: ifne            248
        //   221: goto            234
        //   224: ldc2_w          5604477440220092830
        //   227: lload_2        
        //   228: invokedynamic   BootstrapMethod #9, i:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   233: athrow         
        //   234: iconst_1       
        //   235: istore          10
        //   237: aload           9
        //   239: lload_2        
        //   240: lconst_0       
        //   241: lcmp           
        //   242: ifle            250
        //   245: ifnonnull       272
        //   248: aload           9
        //   250: ifnonnull       153
        //   253: lload_2        
        //   254: lconst_0       
        //   255: lcmp           
        //   256: ifle            175
        //   259: goto            272
        //   262: ldc2_w          5604477440220092830
        //   265: lload_2        
        //   266: invokedynamic   BootstrapMethod #9, i:(Ljava/lang/Object;JJ)Ljava/lang/Exception;
        //   271: athrow         
        //   272: iload           10
        //   274: ireturn        
        //    StackMapTable: 00 0D FF 00 99 00 0B 07 00 0B 07 00 C9 04 04 01 01 01 07 00 7A 01 07 00 A8 07 00 20 00 00 FC 00 15 07 01 D6 FF 00 1A 00 0C 07 00 0B 07 00 C9 04 04 01 01 01 07 00 7A 01 07 00 A8 07 00 20 07 01 D6 00 02 01 07 00 7A 45 07 00 91 49 01 45 07 00 91 09 40 01 0C 41 07 00 7A 4B 07 00 91 FA 00 09 41 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  175    205    208    218    Ljava/lang/NumberFormatException;
        //  200    221    224    234    Ljava/lang/NumberFormatException;
        //  237    253    262    272    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0202:
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
    
    public String q(final Object[] array) {
        final String s = (String)array[0];
        final long n = cn.a ^ (long)array[1];
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_30.invoke(ProcyonInvokeDynamicHelper_29.invoke(this, -4805864293562337000L, n), new Object[] { s, n ^ 0x4467057E0A8BL }, -6804460074611936950L, n);
    }
    
    static {
        a = prr.a(948083894866334375L, 3097900749959731573L, (Object)MethodHandles.lookup().lookupClass()).a(154623099175644L);
        f = new HashMap(13);
        final long n = cn.a ^ 0x1764CAB17D57L;
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key[j] = (byte)(n << j * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] b2 = new String[5];
        int n2 = 0;
        String s;
        int n3 = (s = "\u00cd\u009f?\u0086\u00e9?\u0006\u00e1\u007f\u007f\u00e84\u00c1$\u00da\u008f??eLVk\u008dSu\u00f0g4,y)?fZ\u000f\u0004^Z?y\u0011?¡ìy~\u0004\u0097\u00dd\u0010?T:\u0010\u00ed\u00fb\u0014\u00c1\u0088\u00f8\u00ebu\u009f\u009a\u0080\u0012(\u000e\u00c3>\u0084m\u00fd\u00c4\u00eb\u00f1\u008d\u00f9?K\u0083\u0019\u00f2\u0018-?-\u00cd\u00cfIX\u0007^~\u00d1\u009f\u009f\u00f1\u00d5(\u00cb\u00f5?\u00ad3D\u000b").length();
        int n4 = 48;
        int n5 = -1;
    Label_0159:
        while (true) {
            while (true) {
                ++n5;
                final String s2 = s;
                final int beginIndex = n5;
                String s3 = s2.substring(beginIndex, beginIndex + n4);
                int n6 = -1;
                while (true) {
                    final String intern = a(instance.doFinal(s3.getBytes("ISO-8859-1"))).intern();
                    switch (n6) {
                        default: {
                            b2[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0159;
                            }
                            n3 = (s = "\u0006\u00ed2\u001a2%=\u0096?\u00d2\u008d\u0091\u00ca\u0016<?\f\f\u000b\u0011\u00c7\u0086\u00faO7?^\u008a?$\u009e\u00f230\u00d0U?\u0091d3\u0010\u001a\u00f47g\u00c6PW\u00e7b\u001e&v)?\u00c2\u008f").length();
                            n4 = 40;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            b2[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                break;
                            }
                            break Label_0159;
                        }
                    }
                    ++n5;
                    final String s4 = s;
                    final int beginIndex2 = n5;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n4);
                    n6 = 0;
                }
            }
            break;
        }
        b = b2;
        c = new String[5];
        i = new HashMap(13);
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int k = 1; k < 8; ++k) {
            key2[k] = (byte)(n << k * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] g2 = new long[2];
        int n7 = 0;
        final String s5;
        final int length = (s5 = "\u0007e?\u0019\u0003\u0019Z3\u00dek7b\u0091\u00ad4\u001f").length();
        int l = 0;
        do {
            final String s6 = s5;
            final int beginIndex3 = l;
            l += 8;
            final byte[] bytes = s6.substring(beginIndex3, l).getBytes("ISO-8859-1");
            final long[] array = g2;
            final int n8 = n7++;
            final long n9 = ((long)bytes[0] & 0xFFL) << 56 | ((long)bytes[1] & 0xFFL) << 48 | ((long)bytes[2] & 0xFFL) << 40 | ((long)bytes[3] & 0xFFL) << 32 | ((long)bytes[4] & 0xFFL) << 24 | ((long)bytes[5] & 0xFFL) << 16 | ((long)bytes[6] & 0xFFL) << 8 | ((long)bytes[7] & 0xFFL);
            final byte[] doFinal = instance3.doFinal(new byte[] { (byte)(n9 >>> 56), (byte)(n9 >>> 48), (byte)(n9 >>> 40), (byte)(n9 >>> 32), (byte)(n9 >>> 24), (byte)(n9 >>> 16), (byte)(n9 >>> 8), (byte)n9 });
            array[n8] = (((long)doFinal[0] & 0xFFL) << 56 | ((long)doFinal[1] & 0xFFL) << 48 | ((long)doFinal[2] & 0xFFL) << 40 | ((long)doFinal[3] & 0xFFL) << 32 | ((long)doFinal[4] & 0xFFL) << 24 | ((long)doFinal[5] & 0xFFL) << 16 | ((long)doFinal[6] & 0xFFL) << 8 | ((long)doFinal[7] & 0xFFL));
        } while (l < length);
        g = g2;
        h = new Integer[2];
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
        final int n3 = n ^ (int)(n2 & 0x7FFFL) ^ 0x2B0A;
        if (cn.c[n3] == null) {
            Object[] array;
            try {
                final Long value = Thread.currentThread().getId();
                array = cn.f.get(value);
                if (array == null) {
                    array = new Object[] { Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8]) };
                    cn.f.put(value, array);
                }
            }
            catch (final Exception cause) {
                throw new RuntimeException("com/zelix/cn", cause);
            }
            final byte[] key = new byte[8];
            key[0] = (byte)(n2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                key[i] = (byte)(n2 << i * 8 >>> 56);
            }
            ((Cipher)array[0]).init(2, ((SecretKeyFactory)array[1]).generateSecret(new DESKeySpec(key)), (AlgorithmParameterSpec)array[2]);
            cn.c[n3] = a(((Cipher)array[0]).doFinal(cn.b[n3].getBytes("ISO-8859-1")));
        }
        return cn.c[n3];
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
            throw new RuntimeException("com/zelix/cn" + " : " + str + " : " + methodType.toString(), cause);
        }
        return mutableCallSite;
    }
    
    private static int b(final int n, final long n2) {
        final int n3 = n ^ (int)(n2 & 0x7FFFL) ^ 0x304F;
        if (cn.h[n3] == null) {
            final byte[] key = { (byte)(n2 >>> 56), (byte)(n2 >>> 48), (byte)(n2 >>> 40), (byte)(n2 >>> 32), (byte)(n2 >>> 24), (byte)(n2 >>> 16), (byte)(n2 >>> 8), (byte)n2 };
            final long n4 = cn.g[n3];
            final byte[] input = { (byte)(n4 >>> 56), (byte)(n4 >>> 48), (byte)(n4 >>> 40), (byte)(n4 >>> 32), (byte)(n4 >>> 24), (byte)(n4 >>> 16), (byte)(n4 >>> 8), (byte)n4 };
            final Long value = Thread.currentThread().getId();
            Object[] array = cn.i.get(value);
            byte[] doFinal;
            try {
                if (array == null) {
                    array = new Object[] { Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8]) };
                    cn.i.put(value, array);
                }
                final SecretKey generateSecret = ((SecretKeyFactory)array[1]).generateSecret(new DESKeySpec(key));
                final Cipher cipher = (Cipher)array[0];
                cipher.init(2, generateSecret, (AlgorithmParameterSpec)array[2]);
                doFinal = cipher.doFinal(input);
            }
            catch (final Exception cause) {
                throw new RuntimeException("com/zelix/cn", cause);
            }
            cn.h[n3] = ((doFinal[4] & 0xFF) << 24 | (doFinal[5] & 0xFF) << 16 | (doFinal[6] & 0xFF) << 8 | (doFinal[7] & 0xFF));
        }
        return cn.h[n3];
    }
    
    private static int b(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final Object[] array) {
        final int b = b((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, b), 0, Integer.TYPE, Long.TYPE));
        return b;
    }
    
    private static CallSite b(final MethodHandles.Lookup lookup, final String str, final MethodType methodType) {
        final MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(/* ldc_method_handle(!) */ProcyonConstantHelper_2.HANDLE.asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, str), methodType));
        }
        catch (final Exception cause) {
            throw new RuntimeException("com/zelix/cn" + " : " + str + " : " + methodType.toString(), cause);
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
                handle = cn.__PROCYON__LOOKUP_1__.findStatic(cn.class, "a", type);
            }
            catch (final ReflectiveOperationException e) {
                handle = MethodHandles.permuteArguments(MethodHandles.insertArguments(MethodHandles.throwException(type.returnType(), e.getClass()), 0, e), type);
            }
            ProcyonConstantHelper_1.HANDLE = handle;
        }
    }
    
    private static final MethodHandles.Lookup __PROCYON__LOOKUP_2__ = MethodHandles.lookup();
    
    // This helper class was generated by Procyon to approximate the behavior of a
    // MethodHandle constant that cannot (currently) be represented in Java code.
    private static final class ProcyonConstantHelper_2
    {
        static final MethodHandle HANDLE;
        
        static {
            MethodHandle handle;
            final MethodType type = MethodType.methodType(int.class, MethodHandles.Lookup.class, MutableCallSite.class, String.class, Object[].class);
            try {
                handle = cn.__PROCYON__LOOKUP_2__.findStatic(cn.class, "b", type);
            }
            catch (final ReflectiveOperationException e) {
                handle = MethodHandles.permuteArguments(MethodHandles.insertArguments(MethodHandles.throwException(type.returnType(), e.getClass()), 0, e), type);
            }
            ProcyonConstantHelper_2.HANDLE = handle;
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
                    handle = ((CallSite)cn.a(lookup, "b", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(int[].class, long.class, long.class))).dynamicInvoker();
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
        
        private static int[] invoke(long p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(OutputStream.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static OutputStream invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_6
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_6.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_6.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_6.LOOKUP;
                try {
                    handle = ((CallSite)cn.a(lookup, "b", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_6.fence = 1;
                ProcyonInvokeDynamicHelper_6.handle = handle;
                ProcyonInvokeDynamicHelper_6.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_7
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_7.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_7.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_7.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_7.fence = 1;
                ProcyonInvokeDynamicHelper_7.handle = handle;
                ProcyonInvokeDynamicHelper_7.fence = 0;
            }
            return handle;
        }
        
        private static boolean invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_8
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_8.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_8.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_8.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(dx.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_8.fence = 1;
                ProcyonInvokeDynamicHelper_8.handle = handle;
                ProcyonInvokeDynamicHelper_8.fence = 0;
            }
            return handle;
        }
        
        private static dx invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_9
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_9.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_9.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_9.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_9.fence = 1;
                ProcyonInvokeDynamicHelper_9.handle = handle;
                ProcyonInvokeDynamicHelper_9.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_10
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_10.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_10.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_10.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_10.fence = 1;
                ProcyonInvokeDynamicHelper_10.handle = handle;
                ProcyonInvokeDynamicHelper_10.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_11
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_11.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_11.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_11.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(List.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_11.fence = 1;
                ProcyonInvokeDynamicHelper_11.handle = handle;
                ProcyonInvokeDynamicHelper_11.fence = 0;
            }
            return handle;
        }
        
        private static List invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_12
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_12.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_12.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_12.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(List.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_12.fence = 1;
                ProcyonInvokeDynamicHelper_12.handle = handle;
                ProcyonInvokeDynamicHelper_12.fence = 0;
            }
            return handle;
        }
        
        private static List invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_13
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_13.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_13.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_13.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_13.fence = 1;
                ProcyonInvokeDynamicHelper_13.handle = handle;
                ProcyonInvokeDynamicHelper_13.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_14
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_14.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_14.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_14.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_14.fence = 1;
                ProcyonInvokeDynamicHelper_14.handle = handle;
                ProcyonInvokeDynamicHelper_14.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_14.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_15
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_15.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_15.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_15.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(Exception.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_15.fence = 1;
                ProcyonInvokeDynamicHelper_15.handle = handle;
                ProcyonInvokeDynamicHelper_15.fence = 0;
            }
            return handle;
        }
        
        private static Exception invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_16
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_16.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_16.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_16.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_16.fence = 1;
                ProcyonInvokeDynamicHelper_16.handle = handle;
                ProcyonInvokeDynamicHelper_16.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_16.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_17
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_17.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_17.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_17.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(CRC32.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_17.fence = 1;
                ProcyonInvokeDynamicHelper_17.handle = handle;
                ProcyonInvokeDynamicHelper_17.fence = 0;
            }
            return handle;
        }
        
        private static CRC32 invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_17.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_18
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_18.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_18.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_18.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "r", MethodType.methodType(dx.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_18.fence = 1;
                ProcyonInvokeDynamicHelper_18.handle = handle;
                ProcyonInvokeDynamicHelper_18.fence = 0;
            }
            return handle;
        }
        
        private static dx invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_18.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_19
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_19.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_19.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_19.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "s", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_19.fence = 1;
                ProcyonInvokeDynamicHelper_19.handle = handle;
                ProcyonInvokeDynamicHelper_19.fence = 0;
            }
            return handle;
        }
        
        private static boolean invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_19.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_20
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_20.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_20.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_20.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(dx.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_20.fence = 1;
                ProcyonInvokeDynamicHelper_20.handle = handle;
                ProcyonInvokeDynamicHelper_20.fence = 0;
            }
            return handle;
        }
        
        private static dx invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_20.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_21
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_21.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_21.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_21.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_21.fence = 1;
                ProcyonInvokeDynamicHelper_21.handle = handle;
                ProcyonInvokeDynamicHelper_21.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_21.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_22
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_22.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_22.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_22.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "j", MethodType.methodType(int[].class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_22.fence = 1;
                ProcyonInvokeDynamicHelper_22.handle = handle;
                ProcyonInvokeDynamicHelper_22.fence = 0;
            }
            return handle;
        }
        
        private static int[] invoke(long p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_22.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_23
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_23.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_23.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_23.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(List.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_23.fence = 1;
                ProcyonInvokeDynamicHelper_23.handle = handle;
                ProcyonInvokeDynamicHelper_23.fence = 0;
            }
            return handle;
        }
        
        private static List invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_23.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_24
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_24.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_24.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_24.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(List.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_24.fence = 1;
                ProcyonInvokeDynamicHelper_24.handle = handle;
                ProcyonInvokeDynamicHelper_24.fence = 0;
            }
            return handle;
        }
        
        private static List invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_24.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_25
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_25.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_25.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_25.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_25.fence = 1;
                ProcyonInvokeDynamicHelper_25.handle = handle;
                ProcyonInvokeDynamicHelper_25.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_25.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_26
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_26.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_26.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_26.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(boolean.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_26.fence = 1;
                ProcyonInvokeDynamicHelper_26.handle = handle;
                ProcyonInvokeDynamicHelper_26.fence = 0;
            }
            return handle;
        }
        
        private static boolean invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_26.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_27
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_27.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_27.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_27.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(dx.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_27.fence = 1;
                ProcyonInvokeDynamicHelper_27.handle = handle;
                ProcyonInvokeDynamicHelper_27.fence = 0;
            }
            return handle;
        }
        
        private static dx invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_27.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_28
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_28.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_28.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_28.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(boolean.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_28.fence = 1;
                ProcyonInvokeDynamicHelper_28.handle = handle;
                ProcyonInvokeDynamicHelper_28.fence = 0;
            }
            return handle;
        }
        
        private static boolean invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_28.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_29
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_29.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_29.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_29.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "s", MethodType.methodType(dx.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_29.fence = 1;
                ProcyonInvokeDynamicHelper_29.handle = handle;
                ProcyonInvokeDynamicHelper_29.fence = 0;
            }
            return handle;
        }
        
        private static dx invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_29.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_30
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_30.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_30.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_30.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "r", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_30.fence = 1;
                ProcyonInvokeDynamicHelper_30.handle = handle;
                ProcyonInvokeDynamicHelper_30.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_30.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
