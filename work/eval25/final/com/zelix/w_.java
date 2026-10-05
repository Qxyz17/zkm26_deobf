package com.zelix;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w_ {
   private static List h;
   public static final String l;
   public static final String A;
   public static final String c;
   public static final File K;
   public static int s;
   public static final String Q;
   public static final char p;
   public static final char n;
   public static boolean U;
   public static final String f;
   public static final String k;
   private static final long a;
   private static final String[] b;
   private static final String[] d;
   private static final Map e;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map j;
   private static final long[] m;
   private static final Long[] o;
   private static final Map q;

   public static String l(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/pg
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/pg
      // 16: astore 1
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 3
      // 21: pop
      // 22: getstatic com/zelix/w_.a J
      // 25: lload 3
      // 26: lxor
      // 27: lstore 3
      // 28: lload 3
      // 29: dup2
      // 2a: ldc2_w 137466335558451
      // 2d: lxor
      // 2e: lstore 6
      // 30: pop2
      // 31: ldc2_w 459800356594731955
      // 34: lload 3
      // 35: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: astore 8
      // 3c: aload 5
      // 3e: ldc2_w 1978002578408903315
      // 41: lload 3
      // 42: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 4a: dup
      // 4b: istore 9
      // 4d: bipush -1
      // 4e: aload 8
      // 50: ifnonnull 80
      // 53: if_icmpgt a3
      // 56: goto 63
      // 59: ldc2_w 1854983196544828108
      // 5c: lload 3
      // 5d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aload 5
      // 65: aload 8
      // 67: ifnonnull dc
      // 6a: goto 77
      // 6d: ldc2_w 1854983196544828108
      // 70: lload 3
      // 71: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: ldc "\\"
      // 79: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 7c: dup
      // 7d: istore 9
      // 7f: bipush -1
      // 80: if_icmpgt a3
      // 83: aload 5
      // 85: aload 8
      // 87: ifnonnull ef
      // 8a: goto 97
      // 8d: ldc2_w 1854983196544828108
      // 90: lload 3
      // 91: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: ldc "/"
      // 99: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 9c: dup
      // 9d: istore 9
      // 9f: bipush -1
      // a0: if_icmple dd
      // a3: aload 2
      // a4: aload 5
      // a6: bipush 0
      // a7: iload 9
      // a9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // ac: lload 6
      // ae: dup2_x1
      // af: pop2
      // b0: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // b3: aload 1
      // b4: aload 5
      // b6: iload 9
      // b8: bipush 1
      // b9: iadd
      // ba: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // bd: lload 6
      // bf: dup2_x1
      // c0: pop2
      // c1: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // c4: aload 5
      // c6: iload 9
      // c8: iload 9
      // ca: bipush 1
      // cb: iadd
      // cc: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // cf: goto dc
      // d2: ldc2_w 1854983196544828108
      // d5: lload 3
      // d6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: areturn
      // dd: aload 2
      // de: lload 6
      // e0: ldc ""
      // e2: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // e5: aload 1
      // e6: lload 6
      // e8: aload 5
      // ea: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // ed: ldc ""
      // ef: areturn
   }

   public static String h(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w -3529699799838588207
      // 01c: lload 2
      // 01d: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 4
      // 024: aload 1
      // 025: aload 4
      // 027: ifnonnull 04a
      // 02a: ifnonnull 046
      // 02d: goto 03a
      // 030: ldc2_w -3396756297836115026
      // 033: lload 2
      // 034: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: athrow
      // 03a: aconst_null
      // 03b: areturn
      // 03c: ldc2_w -3396756297836115026
      // 03f: lload 2
      // 040: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: aload 1
      // 047: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 04a: astore 5
      // 04c: ldc2_w -2951447352961169286
      // 04f: lload 2
      // 050: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: sipush 719
      // 058: ldc2_w 6158253427267597479
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: aload 4
      // 064: ifnonnull 0da
      // 067: if_icmpne 09f
      // 06a: goto 077
      // 06d: ldc2_w -3396756297836115026
      // 070: lload 2
      // 071: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 5
      // 079: sipush 3614
      // 07c: ldc2_w 4559823175169767543
      // 07f: lload 2
      // 080: lxor
      // 081: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: ldc2_w -2951447352961169286
      // 089: lload 2
      // 08a: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 092: astore 5
      // 094: aload 4
      // 096: lload 2
      // 097: lconst_0
      // 098: lcmp
      // 099: iflt 0fc
      // 09c: ifnull 0fa
      // 09f: ldc2_w -2951447352961169286
      // 0a2: lload 2
      // 0a3: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: lload 2
      // 0a9: lconst_0
      // 0aa: lcmp
      // 0ab: ifle 108
      // 0ae: aload 4
      // 0b0: ifnonnull 108
      // 0b3: goto 0c0
      // 0b6: ldc2_w -3396756297836115026
      // 0b9: lload 2
      // 0ba: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: sipush 3614
      // 0c3: ldc2_w 4559823175169767543
      // 0c6: lload 2
      // 0c7: lxor
      // 0c8: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: goto 0da
      // 0d0: ldc2_w -3396756297836115026
      // 0d3: lload 2
      // 0d4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: if_icmpne 0fa
      // 0dd: aload 5
      // 0df: sipush 719
      // 0e2: ldc2_w 6158253427267597479
      // 0e5: lload 2
      // 0e6: lxor
      // 0e7: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: ldc2_w -2951447352961169286
      // 0ef: lload 2
      // 0f0: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0f8: astore 5
      // 0fa: aload 5
      // 0fc: ldc2_w -3309807513776858127
      // 0ff: lload 2
      // 100: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 108: ifeq 142
      // 10b: aload 5
      // 10d: bipush 0
      // 10e: lload 2
      // 10f: lconst_0
      // 110: lcmp
      // 111: iflt 153
      // 114: aload 5
      // 116: invokevirtual java/lang/String.length ()I
      // 119: ldc2_w -3309807513776858127
      // 11c: lload 2
      // 11d: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: invokevirtual java/lang/String.length ()I
      // 125: isub
      // 126: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 129: aload 4
      // 12b: ifnonnull 14a
      // 12e: goto 13b
      // 131: ldc2_w -3396756297836115026
      // 134: lload 2
      // 135: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: astore 5
      // 13d: aload 4
      // 13f: ifnull 0fa
      // 142: lload 2
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 10b
      // 148: aload 5
      // 14a: ldc2_w -2951447352961169286
      // 14d: lload 2
      // 14e: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: invokevirtual java/lang/String.lastIndexOf (I)I
      // 156: istore 6
      // 158: iload 6
      // 15a: bipush -1
      // 15b: lload 2
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: ifle 18c
      // 161: aload 4
      // 163: ifnonnull 18c
      // 166: if_icmple 1b1
      // 169: goto 176
      // 16c: ldc2_w -3396756297836115026
      // 16f: lload 2
      // 170: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: iload 6
      // 178: aload 5
      // 17a: invokevirtual java/lang/String.length ()I
      // 17d: bipush 1
      // 17e: isub
      // 17f: goto 18c
      // 182: ldc2_w -3396756297836115026
      // 185: lload 2
      // 186: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: if_icmpne 1a7
      // 18f: aload 5
      // 191: bipush 0
      // 192: aload 5
      // 194: invokevirtual java/lang/String.length ()I
      // 197: bipush 1
      // 198: isub
      // 199: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 19c: areturn
      // 19d: ldc2_w -3396756297836115026
      // 1a0: lload 2
      // 1a1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 5
      // 1a9: iload 6
      // 1ab: bipush 1
      // 1ac: iadd
      // 1ad: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1b0: areturn
      // 1b1: aload 5
      // 1b3: areturn
   }

   public static boolean E(ZipFile param0, long param1, ZipEntry param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/w_.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 30095152146398
      // 0b: lxor
      // 0c: dup2
      // 0d: bipush 48
      // 0f: lushr
      // 10: l2i
      // 11: istore 4
      // 13: dup2
      // 14: bipush 16
      // 16: lshl
      // 17: bipush 48
      // 19: lushr
      // 1a: l2i
      // 1b: istore 5
      // 1d: dup2
      // 1e: bipush 32
      // 20: lshl
      // 21: bipush 32
      // 23: lushr
      // 24: l2i
      // 25: istore 6
      // 27: pop2
      // 28: dup2
      // 29: ldc2_w 6637935099043
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: ldc2_w -2485530140605902765
      // 33: lload 1
      // 34: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: astore 9
      // 3b: aload 3
      // 3c: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 3f: iload 4
      // 41: i2c
      // 42: swap
      // 43: iload 5
      // 45: i2s
      // 46: iload 6
      // 48: ldc2_w -2496724018528319143
      // 4b: lload 1
      // 4c: invokedynamic s (CLjava/lang/Object;SIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: aload 9
      // 53: ifnonnull 97
      // 56: ifeq b0
      // 59: goto 66
      // 5c: ldc2_w -4441060372642113236
      // 5f: lload 1
      // 60: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 0
      // 67: aload 3
      // 68: lload 7
      // 6a: bipush 3
      // 6b: anewarray 598
      // 6e: dup_x2
      // 6f: dup_x2
      // 70: pop
      // 71: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 74: bipush 2
      // 75: swap
      // 76: aastore
      // 77: dup_x1
      // 78: swap
      // 79: bipush 1
      // 7a: swap
      // 7b: aastore
      // 7c: dup_x1
      // 7d: swap
      // 7e: bipush 0
      // 7f: swap
      // 80: aastore
      // 81: ldc2_w -4557195585578198731
      // 84: lload 1
      // 85: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: goto 97
      // 8d: ldc2_w -4441060372642113236
      // 90: lload 1
      // 91: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: aload 9
      // 99: ifnonnull ad
      // 9c: ifeq b0
      // 9f: goto ac
      // a2: ldc2_w -4441060372642113236
      // a5: lload 1
      // a6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: bipush 1
      // ad: goto b1
      // b0: bipush 0
      // b1: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File T(Object[] var0) {
      File var1 = (File)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 45623387693727L;
      String var10000 = x44.a<"s">(3619179716271964139L, var2);
      BufferedInputStream var7 = null;
      String var6 = var10000;
      boolean var19 = false /* VF: Semaphore variable */;

      File var8;
      try {
         var19 = true;
         var7 = new BufferedInputStream(new FileInputStream(var1));
         var8 = x44.a<"s">(new Object[]{var7, var4, x44.a<"k">(var1, 3308562582783944169L, var2)}, 3556494643829853251L, var2);
         var19 = false;
      } finally {
         if (var19) {
            label89: {
               label88: {
                  try {
                     if (var2 <= 0L) {
                        break label89;
                     }

                     var30 = var7;
                     if (var6 != null) {
                        break label88;
                     }

                     if (var7 == null) {
                        break label89;
                     }
                  } catch (IOException var22) {
                     throw x44.a<"s">(var22, 3307428118620452500L, var2);
                  }

                  try {
                     var30 = var7;
                  } catch (IOException var21) {
                     boolean var10001 = false;
                     break label89;
                  }
               }

               try {
                  x44.a<"k">(var30, 3113634023070408163L, var2);
               } catch (IOException var20) {
                  boolean var32 = false;
               }
            }
         }
      }

      label105: {
         try {
            var31 = var7;
            if (var6 != null) {
               break label105;
            }

            if (var7 == null) {
               return var8;
            }
         } catch (IOException var26) {
            throw x44.a<"s">(var26, 3307428118620452500L, var2);
         }

         try {
            var31 = var7;
         } catch (IOException var25) {
            boolean var33 = false;
            return var8;
         }
      }

      try {
         x44.a<"k">(var31, 3113634023070408163L, var2);
      } catch (IOException var24) {
         boolean var34 = false;
      }

      return var8;
   }

   public static String f(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/util/zip/ZipFile
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/zip/ZipEntry
      // 00e: astore 1
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: pop
      // 01a: getstatic com/zelix/w_.a J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 85102665798698
      // 025: lxor
      // 026: lstore 5
      // 028: pop2
      // 029: new java/lang/StringBuilder
      // 02c: dup
      // 02d: invokespecial java/lang/StringBuilder.<init> ()V
      // 030: astore 8
      // 032: ldc2_w 1114590743092675237
      // 035: lload 3
      // 036: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: aload 8
      // 03d: aload 2
      // 03e: ldc2_w 1317321878390344128
      // 041: lload 3
      // 042: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04a: pop
      // 04b: astore 7
      // 04d: new java/io/File
      // 050: dup
      // 051: aload 2
      // 052: ldc2_w 1317321878390344128
      // 055: lload 3
      // 056: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 05e: astore 9
      // 060: aload 7
      // 062: ifnonnull 11d
      // 065: aload 9
      // 067: lload 5
      // 069: bipush 2
      // 06a: anewarray 598
      // 06d: dup_x2
      // 06e: dup_x2
      // 06f: pop
      // 070: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 073: bipush 1
      // 074: swap
      // 075: aastore
      // 076: dup_x1
      // 077: swap
      // 078: bipush 0
      // 079: swap
      // 07a: aastore
      // 07b: ldc2_w 918542888747192483
      // 07e: lload 3
      // 07f: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: ifeq 10b
      // 087: goto 094
      // 08a: ldc2_w 1200318150127160282
      // 08d: lload 3
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 9
      // 096: ldc2_w 1199182930190424231
      // 099: lload 3
      // 09a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: bipush 1
      // 0a0: anewarray 598
      // 0a3: dup_x1
      // 0a4: swap
      // 0a5: bipush 0
      // 0a6: swap
      // 0a7: aastore
      // 0a8: ldc2_w 946968884467380876
      // 0ab: lload 3
      // 0ac: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: astore 10
      // 0b3: aload 10
      // 0b5: lload 3
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 122
      // 0bb: aload 7
      // 0bd: ifnonnull 122
      // 0c0: ifnull 10b
      // 0c3: goto 0d0
      // 0c6: ldc2_w 1200318150127160282
      // 0c9: lload 3
      // 0ca: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 8
      // 0d2: sipush 13928
      // 0d5: ldc2_w 8213032642378104959
      // 0d8: lload 3
      // 0d9: lxor
      // 0da: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0e2: pop
      // 0e3: aload 8
      // 0e5: aload 10
      // 0e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ea: pop
      // 0eb: aload 8
      // 0ed: sipush 23612
      // 0f0: ldc2_w 8663068357913864738
      // 0f3: lload 3
      // 0f4: lxor
      // 0f5: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0fd: pop
      // 0fe: goto 10b
      // 101: ldc2_w 1200318150127160282
      // 104: lload 3
      // 105: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 8
      // 10d: ldc "!"
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: pop
      // 113: aload 8
      // 115: aload 1
      // 116: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: pop
      // 11d: aload 8
      // 11f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 122: lload 3
      // 123: lconst_0
      // 124: lcmp
      // 125: ifle 13f
      // 128: ldc2_w 875430143821931657
      // 12b: lload 3
      // 12c: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: ifnonnull 14c
      // 134: ldc "VIRyic"
      // 136: ldc2_w 835672797104611719
      // 139: lload 3
      // 13a: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: goto 14c
      // 142: ldc2_w 1200318150127160282
      // 145: lload 3
      // 146: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: areturn
   }

   public static String D(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/io/File
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 1
      // 01a: pop
      // 01b: getstatic com/zelix/w_.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: ldc2_w 7433947796374760184
      // 024: lload 1
      // 025: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: astore 5
      // 02c: aload 3
      // 02d: ifnonnull 03c
      // 030: aconst_null
      // 031: areturn
      // 032: ldc2_w 8715873466492248967
      // 035: lload 1
      // 036: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: athrow
      // 03c: aload 4
      // 03e: aload 5
      // 040: ifnonnull 083
      // 043: ifnonnull 074
      // 046: goto 053
      // 049: ldc2_w 8715873466492248967
      // 04c: lload 1
      // 04d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: ldc2_w 8781389465847800468
      // 056: lload 1
      // 057: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: astore 6
      // 05e: ldc2_w 6950520325905647936
      // 061: lload 1
      // 062: invokedynamic i (JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: astore 4
      // 069: aload 5
      // 06b: lload 1
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: iflt 092
      // 071: ifnull 08e
      // 074: aload 4
      // 076: goto 083
      // 079: ldc2_w 8715873466492248967
      // 07c: lload 1
      // 07d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: ldc2_w 8717060981923721466
      // 086: lload 1
      // 087: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: astore 6
      // 08e: aload 3
      // 08f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 092: astore 3
      // 093: new java/lang/StringBuilder
      // 096: dup
      // 097: invokespecial java/lang/StringBuilder.<init> ()V
      // 09a: astore 7
      // 09c: aload 3
      // 09d: new java/lang/StringBuilder
      // 0a0: dup
      // 0a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a4: sipush 4583
      // 0a7: ldc2_w 4637730646372134452
      // 0aa: lload 1
      // 0ab: lxor
      // 0ac: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b4: ldc2_w 9161191205346091091
      // 0b7: lload 1
      // 0b8: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c3: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0c6: lload 1
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 23e
      // 0cc: aload 5
      // 0ce: ifnonnull 23e
      // 0d1: ifeq 200
      // 0d4: goto 0e1
      // 0d7: ldc2_w 8715873466492248967
      // 0da: lload 1
      // 0db: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 4
      // 0e3: ldc2_w 8777761538079643949
      // 0e6: lload 1
      // 0e7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: astore 8
      // 0ee: aload 5
      // 0f0: lload 1
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: ifle 122
      // 0f6: ifnonnull 120
      // 0f9: aload 8
      // 0fb: ifnonnull 12b
      // 0fe: goto 10b
      // 101: ldc2_w 8715873466492248967
      // 104: lload 1
      // 105: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 7
      // 10d: aload 6
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: pop
      // 113: goto 120
      // 116: ldc2_w 8715873466492248967
      // 119: lload 1
      // 11a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 5
      // 122: lload 1
      // 123: lconst_0
      // 124: lcmp
      // 125: ifle 14a
      // 128: ifnull 149
      // 12b: aload 7
      // 12d: aload 8
      // 12f: ldc2_w 8717060981923721466
      // 132: lload 1
      // 133: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: pop
      // 13c: goto 149
      // 13f: ldc2_w 8715873466492248967
      // 142: lload 1
      // 143: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 3
      // 14a: invokevirtual java/lang/String.length ()I
      // 14d: bipush 2
      // 14e: lload 1
      // 14f: lconst_0
      // 150: lcmp
      // 151: iflt 1a3
      // 154: aload 5
      // 156: ifnonnull 1a3
      // 159: if_icmple 1f5
      // 15c: goto 169
      // 15f: ldc2_w 8715873466492248967
      // 162: lload 1
      // 163: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 7
      // 16b: aload 5
      // 16d: ifnonnull 1f4
      // 170: goto 17d
      // 173: ldc2_w 8715873466492248967
      // 176: lload 1
      // 177: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 7
      // 17f: invokevirtual java/lang/StringBuilder.length ()I
      // 182: bipush 1
      // 183: isub
      // 184: ldc2_w 8739683674646933809
      // 187: lload 1
      // 188: invokedynamic h (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: ldc2_w 9161191205346091091
      // 190: lload 1
      // 191: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: goto 1a3
      // 199: ldc2_w 8715873466492248967
      // 19c: lload 1
      // 19d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: lload 1
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 1ba
      // 1a9: if_icmpne 1ea
      // 1ac: aload 3
      // 1ad: bipush 2
      // 1ae: invokevirtual java/lang/String.charAt (I)C
      // 1b1: ldc2_w 9161191205346091091
      // 1b4: lload 1
      // 1b5: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: if_icmpne 1ea
      // 1bd: goto 1ca
      // 1c0: ldc2_w 8715873466492248967
      // 1c3: lload 1
      // 1c4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 7
      // 1cc: aload 7
      // 1ce: invokevirtual java/lang/StringBuilder.length ()I
      // 1d1: bipush 1
      // 1d2: isub
      // 1d3: ldc2_w 7377173360165428397
      // 1d6: lload 1
      // 1d7: invokedynamic h (Ljava/lang/Object;IJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: pop
      // 1dd: goto 1ea
      // 1e0: ldc2_w 8715873466492248967
      // 1e3: lload 1
      // 1e4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 7
      // 1ec: aload 3
      // 1ed: bipush 2
      // 1ee: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f4: pop
      // 1f5: aload 5
      // 1f7: lload 1
      // 1f8: lconst_0
      // 1f9: lcmp
      // 1fa: ifle 201
      // 1fd: ifnull 31c
      // 200: aload 3
      // 201: aload 5
      // 203: ifnonnull 31b
      // 206: goto 213
      // 209: ldc2_w 8715873466492248967
      // 20c: lload 1
      // 20d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: athrow
      // 213: new java/lang/StringBuilder
      // 216: dup
      // 217: invokespecial java/lang/StringBuilder.<init> ()V
      // 21a: ldc "."
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: ldc2_w 9161191205346091091
      // 222: lload 1
      // 223: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 22b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 231: goto 23e
      // 234: ldc2_w 8715873466492248967
      // 237: lload 1
      // 238: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: ifeq 30d
      // 241: aload 7
      // 243: aload 6
      // 245: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 248: pop
      // 249: aload 3
      // 24a: aload 5
      // 24c: ifnonnull 321
      // 24f: goto 25c
      // 252: ldc2_w 8715873466492248967
      // 255: lload 1
      // 256: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: athrow
      // 25c: invokevirtual java/lang/String.length ()I
      // 25f: bipush 1
      // 260: if_icmple 31c
      // 263: goto 270
      // 266: ldc2_w 8715873466492248967
      // 269: lload 1
      // 26a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: athrow
      // 270: aload 7
      // 272: lload 1
      // 273: lconst_0
      // 274: lcmp
      // 275: ifle 301
      // 278: aload 5
      // 27a: ifnonnull 301
      // 27d: goto 28a
      // 280: ldc2_w 8715873466492248967
      // 283: lload 1
      // 284: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: athrow
      // 28a: lload 1
      // 28b: lconst_0
      // 28c: lcmp
      // 28d: iflt 2f9
      // 290: aload 7
      // 292: invokevirtual java/lang/StringBuilder.length ()I
      // 295: bipush 1
      // 296: isub
      // 297: ldc2_w 8739683674646933809
      // 29a: lload 1
      // 29b: invokedynamic h (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: ldc2_w 9161191205346091091
      // 2a3: lload 1
      // 2a4: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: if_icmpne 2f7
      // 2ac: goto 2b9
      // 2af: ldc2_w 8715873466492248967
      // 2b2: lload 1
      // 2b3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: aload 3
      // 2ba: bipush 1
      // 2bb: invokevirtual java/lang/String.charAt (I)C
      // 2be: ldc2_w 9161191205346091091
      // 2c1: lload 1
      // 2c2: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: if_icmpne 2f7
      // 2ca: goto 2d7
      // 2cd: ldc2_w 8715873466492248967
      // 2d0: lload 1
      // 2d1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: athrow
      // 2d7: aload 7
      // 2d9: aload 7
      // 2db: invokevirtual java/lang/StringBuilder.length ()I
      // 2de: bipush 1
      // 2df: isub
      // 2e0: ldc2_w 7377173360165428397
      // 2e3: lload 1
      // 2e4: invokedynamic h (Ljava/lang/Object;IJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: pop
      // 2ea: goto 2f7
      // 2ed: ldc2_w 8715873466492248967
      // 2f0: lload 1
      // 2f1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: athrow
      // 2f7: aload 7
      // 2f9: aload 3
      // 2fa: bipush 1
      // 2fb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 301: lload 1
      // 302: lconst_0
      // 303: lcmp
      // 304: iflt 31e
      // 307: pop
      // 308: aload 5
      // 30a: ifnull 31c
      // 30d: aload 3
      // 30e: goto 31b
      // 311: ldc2_w 8715873466492248967
      // 314: lload 1
      // 315: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: athrow
      // 31b: areturn
      // 31c: aload 7
      // 31e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 321: areturn
   }

   public static String i(long var0, ZipFile var2, ZipEntry var3) {
      var0 = a ^ var0;
      return x44.a<"o">(var2, -8445828782111387326L, var0) + "!" + var3.getName();
   }

   private static String v(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/io/InputStream
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 1
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/qv
      // 021: astore 7
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Long
      // 029: invokevirtual java/lang/Long.longValue ()J
      // 02c: lstore 2
      // 02d: pop
      // 02e: getstatic com/zelix/w_.a J
      // 031: lload 2
      // 032: lxor
      // 033: lstore 2
      // 034: lload 2
      // 035: dup2
      // 036: ldc2_w 9261917218618
      // 039: lxor
      // 03a: lstore 8
      // 03c: pop2
      // 03d: ldc2_w -6009258956990455480
      // 040: lload 2
      // 041: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: aconst_null
      // 047: astore 11
      // 049: astore 10
      // 04b: lload 5
      // 04d: sipush 12857
      // 050: ldc2_w 6043263718666670796
      // 053: lload 2
      // 054: lxor
      // 055: invokedynamic i (IJ)J bsm=com/zelix/w_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: lcmp
      // 05b: aload 10
      // 05d: ifnonnull 08d
      // 060: ifle 0b5
      // 063: goto 070
      // 066: ldc2_w -5528904879087736777
      // 069: lload 2
      // 06a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: lload 5
      // 072: sipush 24095
      // 075: ldc2_w 6495574484449033963
      // 078: lload 2
      // 079: lxor
      // 07a: invokedynamic i (IJ)J bsm=com/zelix/w_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: lcmp
      // 080: goto 08d
      // 083: ldc2_w -5528904879087736777
      // 086: lload 2
      // 087: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: ifge 0b5
      // 090: new java/io/StringWriter
      // 093: dup
      // 094: lload 5
      // 096: l2i
      // 097: sipush 12678
      // 09a: ldc2_w 5031627293754958955
      // 09d: lload 2
      // 09e: lxor
      // 09f: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: iadd
      // 0a5: invokespecial java/io/StringWriter.<init> (I)V
      // 0a8: lload 2
      // 0a9: lconst_0
      // 0aa: lcmp
      // 0ab: ifle 0bc
      // 0ae: astore 12
      // 0b0: aload 10
      // 0b2: ifnull 0be
      // 0b5: new java/io/StringWriter
      // 0b8: dup
      // 0b9: invokespecial java/io/StringWriter.<init> ()V
      // 0bc: astore 12
      // 0be: new java/io/BufferedReader
      // 0c1: dup
      // 0c2: new java/io/InputStreamReader
      // 0c5: dup
      // 0c6: aload 4
      // 0c8: aload 1
      // 0c9: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0cc: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0cf: astore 11
      // 0d1: bipush 1
      // 0d2: istore 14
      // 0d4: aload 11
      // 0d6: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0d9: dup
      // 0da: astore 13
      // 0dc: ifnull 196
      // 0df: aload 10
      // 0e1: lload 2
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: ifle 209
      // 0e7: ifnonnull 1fe
      // 0ea: aload 7
      // 0ec: aload 10
      // 0ee: lload 2
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: iflt 118
      // 0f4: ifnonnull 116
      // 0f7: goto 104
      // 0fa: ldc2_w -5528904879087736777
      // 0fd: lload 2
      // 0fe: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: ifnull 137
      // 107: goto 114
      // 10a: ldc2_w -5528904879087736777
      // 10d: lload 2
      // 10e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: aload 7
      // 116: aload 13
      // 118: lload 8
      // 11a: bipush 2
      // 11b: anewarray 598
      // 11e: dup_x2
      // 11f: dup_x2
      // 120: pop
      // 121: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w -6194828308832854849
      // 12f: lload 2
      // 130: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: astore 13
      // 137: lload 2
      // 138: lconst_0
      // 139: lcmp
      // 13a: iflt 157
      // 13d: iload 14
      // 13f: aload 10
      // 141: ifnonnull 155
      // 144: ifeq 162
      // 147: goto 154
      // 14a: ldc2_w -5528904879087736777
      // 14d: lload 2
      // 14e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: bipush 0
      // 155: istore 14
      // 157: aload 10
      // 159: lload 2
      // 15a: lconst_0
      // 15b: lcmp
      // 15c: ifle 193
      // 15f: ifnull 184
      // 162: aload 12
      // 164: ldc2_w -5996654222554336605
      // 167: lload 2
      // 168: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: ldc2_w -5338728617016835420
      // 170: lload 2
      // 171: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/StringWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: pop
      // 177: goto 184
      // 17a: ldc2_w -5528904879087736777
      // 17d: lload 2
      // 17e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: aload 12
      // 186: aload 13
      // 188: ldc2_w -5829953726297446422
      // 18b: lload 2
      // 18c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: aload 10
      // 193: ifnull 0d4
      // 196: lload 2
      // 197: lconst_0
      // 198: lcmp
      // 199: iflt 0df
      // 19c: lload 2
      // 19d: lconst_0
      // 19e: lcmp
      // 19f: iflt 1c4
      // 1a2: aload 11
      // 1a4: aload 10
      // 1a6: ifnonnull 1bb
      // 1a9: ifnull 1fe
      // 1ac: goto 1b9
      // 1af: ldc2_w -5528904879087736777
      // 1b2: lload 2
      // 1b3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 11
      // 1bb: ldc2_w -5612671947158401733
      // 1be: lload 2
      // 1bf: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: goto 1fe
      // 1c7: astore 13
      // 1c9: goto 1fe
      // 1cc: astore 15
      // 1ce: lload 2
      // 1cf: lconst_0
      // 1d0: lcmp
      // 1d1: ifle 1f6
      // 1d4: aload 11
      // 1d6: aload 10
      // 1d8: ifnonnull 1ed
      // 1db: ifnull 1fb
      // 1de: goto 1eb
      // 1e1: ldc2_w -5528904879087736777
      // 1e4: lload 2
      // 1e5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: athrow
      // 1eb: aload 11
      // 1ed: ldc2_w -5612671947158401733
      // 1f0: lload 2
      // 1f1: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: goto 1fb
      // 1f9: astore 16
      // 1fb: aload 15
      // 1fd: athrow
      // 1fe: aload 12
      // 200: ldc2_w -5539582311568453537
      // 203: lload 2
      // 204: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: areturn
   }

   public static String n(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/w_.a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 139123528644098
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: ldc2_w 312062134775794054
      // 02d: lload 2
      // 02e: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 7
      // 035: aload 1
      // 036: aload 7
      // 038: ifnonnull 059
      // 03b: ifnonnull 057
      // 03e: goto 04b
      // 041: ldc2_w 1984708943755837689
      // 044: lload 2
      // 045: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: aconst_null
      // 04c: areturn
      // 04d: ldc2_w 1984708943755837689
      // 050: lload 2
      // 051: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: athrow
      // 057: aload 4
      // 059: aload 7
      // 05b: ifnonnull 0b2
      // 05e: ifnonnull 0ae
      // 061: goto 06e
      // 064: ldc2_w 1984708943755837689
      // 067: lload 2
      // 068: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: new java/lang/IllegalArgumentException
      // 071: dup
      // 072: new java/lang/StringBuilder
      // 075: dup
      // 076: invokespecial java/lang/StringBuilder.<init> ()V
      // 079: sipush 27186
      // 07c: ldc2_w 3875452895939344057
      // 07f: lload 2
      // 080: lxor
      // 081: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: aload 1
      // 08a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d: sipush 9848
      // 090: ldc2_w 58812064159136490
      // 093: lload 2
      // 094: lxor
      // 095: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a0: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0a3: athrow
      // 0a4: ldc2_w 1984708943755837689
      // 0a7: lload 2
      // 0a8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 1
      // 0af: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b2: astore 1
      // 0b3: new java/lang/StringBuilder
      // 0b6: dup
      // 0b7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ba: astore 8
      // 0bc: aload 1
      // 0bd: sipush 4583
      // 0c0: ldc2_w 4637754934973582666
      // 0c3: lload 2
      // 0c4: lxor
      // 0c5: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0cd: aload 7
      // 0cf: lload 2
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: ifle 2c9
      // 0d5: ifnonnull 2c7
      // 0d8: ifeq 2b4
      // 0db: goto 0e8
      // 0de: ldc2_w 1984708943755837689
      // 0e1: lload 2
      // 0e2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 1
      // 0e9: astore 9
      // 0eb: aload 4
      // 0ed: astore 10
      // 0ef: aload 9
      // 0f1: sipush 4583
      // 0f4: ldc2_w 4637754934973582666
      // 0f7: lload 2
      // 0f8: lxor
      // 0f9: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 101: ifeq 1fd
      // 104: aload 10
      // 106: lload 5
      // 108: bipush 2
      // 109: anewarray 598
      // 10c: dup_x2
      // 10d: dup_x2
      // 10e: pop
      // 10f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112: bipush 1
      // 113: swap
      // 114: aastore
      // 115: dup_x1
      // 116: swap
      // 117: bipush 0
      // 118: swap
      // 119: aastore
      // 11a: ldc2_w 347342871147165076
      // 11d: lload 2
      // 11e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: astore 11
      // 125: aload 11
      // 127: aload 7
      // 129: lload 2
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: iflt 134
      // 12f: ifnonnull 555
      // 132: aload 7
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 1bd
      // 13a: ifnonnull 1bb
      // 13d: goto 14a
      // 140: ldc2_w 1984708943755837689
      // 143: lload 2
      // 144: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: lload 2
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 1b7
      // 150: ifnonnull 1b5
      // 153: goto 160
      // 156: ldc2_w 1984708943755837689
      // 159: lload 2
      // 15a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: new java/lang/IllegalArgumentException
      // 163: dup
      // 164: new java/lang/StringBuilder
      // 167: dup
      // 168: invokespecial java/lang/StringBuilder.<init> ()V
      // 16b: sipush 10759
      // 16e: ldc2_w 8756553683330627203
      // 171: lload 2
      // 172: lxor
      // 173: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17b: aload 4
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: sipush 21993
      // 183: ldc2_w 8292071349160544620
      // 186: lload 2
      // 187: lxor
      // 188: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: aload 1
      // 191: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 194: sipush 9848
      // 197: ldc2_w 58812064159136490
      // 19a: lload 2
      // 19b: lxor
      // 19c: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a7: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 1aa: athrow
      // 1ab: ldc2_w 1984708943755837689
      // 1ae: lload 2
      // 1af: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aload 11
      // 1b7: astore 10
      // 1b9: aload 9
      // 1bb: aload 7
      // 1bd: ifnonnull 1f6
      // 1c0: invokevirtual java/lang/String.length ()I
      // 1c3: bipush 2
      // 1c4: if_icmple 1e7
      // 1c7: goto 1d4
      // 1ca: ldc2_w 1984708943755837689
      // 1cd: lload 2
      // 1ce: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: aload 9
      // 1d6: bipush 3
      // 1d7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1da: astore 9
      // 1dc: aload 7
      // 1de: lload 2
      // 1df: lconst_0
      // 1e0: lcmp
      // 1e1: ifle 1fa
      // 1e4: ifnull 1f8
      // 1e7: ldc ""
      // 1e9: goto 1f6
      // 1ec: ldc2_w 1984708943755837689
      // 1ef: lload 2
      // 1f0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: astore 9
      // 1f8: aload 7
      // 1fa: ifnull 0ef
      // 1fd: aload 8
      // 1ff: aload 10
      // 201: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 204: pop
      // 205: aload 8
      // 207: aload 7
      // 209: ifnonnull 2a8
      // 20c: invokevirtual java/lang/StringBuilder.length ()I
      // 20f: ifle 2a1
      // 212: goto 21f
      // 215: ldc2_w 1984708943755837689
      // 218: lload 2
      // 219: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: athrow
      // 21f: aload 8
      // 221: lload 2
      // 222: lconst_0
      // 223: lcmp
      // 224: ifle 2a8
      // 227: aload 7
      // 229: ifnonnull 2a8
      // 22c: goto 239
      // 22f: ldc2_w 1984708943755837689
      // 232: lload 2
      // 233: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: athrow
      // 239: lload 2
      // 23a: lconst_0
      // 23b: lcmp
      // 23c: iflt 2a3
      // 23f: aload 8
      // 241: invokevirtual java/lang/StringBuilder.length ()I
      // 244: bipush 1
      // 245: isub
      // 246: ldc2_w 1889133628533903951
      // 249: lload 2
      // 24a: invokedynamic n (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: sipush 3614
      // 252: ldc2_w 4559869766988575520
      // 255: lload 2
      // 256: lxor
      // 257: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: if_icmpeq 2a1
      // 25f: goto 26c
      // 262: ldc2_w 1984708943755837689
      // 265: lload 2
      // 266: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: aload 9
      // 26e: invokevirtual java/lang/String.length ()I
      // 271: ifle 2a1
      // 274: goto 281
      // 277: ldc2_w 1984708943755837689
      // 27a: lload 2
      // 27b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: athrow
      // 281: aload 8
      // 283: sipush 3614
      // 286: ldc2_w 4559869766988575520
      // 289: lload 2
      // 28a: lxor
      // 28b: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 293: pop
      // 294: goto 2a1
      // 297: ldc2_w 1984708943755837689
      // 29a: lload 2
      // 29b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: aload 8
      // 2a3: aload 9
      // 2a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a8: lload 2
      // 2a9: lconst_0
      // 2aa: lcmp
      // 2ab: ifle 552
      // 2ae: pop
      // 2af: aload 7
      // 2b1: ifnull 550
      // 2b4: aload 1
      // 2b5: ldc "."
      // 2b7: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2ba: goto 2c7
      // 2bd: ldc2_w 1984708943755837689
      // 2c0: lload 2
      // 2c1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: athrow
      // 2c7: aload 7
      // 2c9: lload 2
      // 2ca: lconst_0
      // 2cb: lcmp
      // 2cc: ifle 48e
      // 2cf: ifnonnull 48c
      // 2d2: ifeq 47a
      // 2d5: goto 2e2
      // 2d8: ldc2_w 1984708943755837689
      // 2db: lload 2
      // 2dc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: athrow
      // 2e2: aload 4
      // 2e4: aload 7
      // 2e6: ifnonnull 3f5
      // 2e9: goto 2f6
      // 2ec: ldc2_w 1984708943755837689
      // 2ef: lload 2
      // 2f0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: athrow
      // 2f6: lload 2
      // 2f7: lconst_0
      // 2f8: lcmp
      // 2f9: ifle 3e8
      // 2fc: invokevirtual java/lang/String.length ()I
      // 2ff: ifle 3e3
      // 302: goto 30f
      // 305: ldc2_w 1984708943755837689
      // 308: lload 2
      // 309: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30e: athrow
      // 30f: aload 8
      // 311: aload 4
      // 313: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 316: pop
      // 317: aload 1
      // 318: aload 7
      // 31a: ifnonnull 555
      // 31d: goto 32a
      // 320: ldc2_w 1984708943755837689
      // 323: lload 2
      // 324: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 329: athrow
      // 32a: invokevirtual java/lang/String.length ()I
      // 32d: bipush 1
      // 32e: if_icmple 550
      // 331: goto 33e
      // 334: ldc2_w 1984708943755837689
      // 337: lload 2
      // 338: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: athrow
      // 33e: aload 8
      // 340: lload 2
      // 341: lconst_0
      // 342: lcmp
      // 343: iflt 3d7
      // 346: aload 7
      // 348: ifnonnull 3d7
      // 34b: goto 358
      // 34e: ldc2_w 1984708943755837689
      // 351: lload 2
      // 352: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: athrow
      // 358: lload 2
      // 359: lconst_0
      // 35a: lcmp
      // 35b: ifle 3cf
      // 35e: aload 8
      // 360: invokevirtual java/lang/StringBuilder.length ()I
      // 363: bipush 1
      // 364: isub
      // 365: ldc2_w 1889133628533903951
      // 368: lload 2
      // 369: invokedynamic n (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36e: sipush 3614
      // 371: ldc2_w 4559869766988575520
      // 374: lload 2
      // 375: lxor
      // 376: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37b: if_icmpne 3cd
      // 37e: goto 38b
      // 381: ldc2_w 1984708943755837689
      // 384: lload 2
      // 385: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38a: athrow
      // 38b: aload 1
      // 38c: bipush 1
      // 38d: invokevirtual java/lang/String.charAt (I)C
      // 390: sipush 3614
      // 393: ldc2_w 4559869766988575520
      // 396: lload 2
      // 397: lxor
      // 398: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: if_icmpne 3cd
      // 3a0: goto 3ad
      // 3a3: ldc2_w 1984708943755837689
      // 3a6: lload 2
      // 3a7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: athrow
      // 3ad: aload 8
      // 3af: aload 8
      // 3b1: invokevirtual java/lang/StringBuilder.length ()I
      // 3b4: bipush 1
      // 3b5: isub
      // 3b6: ldc2_w 368986121477881811
      // 3b9: lload 2
      // 3ba: invokedynamic n (Ljava/lang/Object;IJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bf: pop
      // 3c0: goto 3cd
      // 3c3: ldc2_w 1984708943755837689
      // 3c6: lload 2
      // 3c7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cc: athrow
      // 3cd: aload 8
      // 3cf: aload 1
      // 3d0: bipush 1
      // 3d1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d7: lload 2
      // 3d8: lconst_0
      // 3d9: lcmp
      // 3da: ifle 552
      // 3dd: pop
      // 3de: aload 7
      // 3e0: ifnull 550
      // 3e3: aload 1
      // 3e4: bipush 1
      // 3e5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3e8: goto 3f5
      // 3eb: ldc2_w 1984708943755837689
      // 3ee: lload 2
      // 3ef: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f4: athrow
      // 3f5: astore 9
      // 3f7: aload 9
      // 3f9: invokevirtual java/lang/String.length ()I
      // 3fc: lload 2
      // 3fd: lconst_0
      // 3fe: lcmp
      // 3ff: ifle 442
      // 402: aload 7
      // 404: ifnonnull 442
      // 407: ifle 46f
      // 40a: goto 417
      // 40d: ldc2_w 1984708943755837689
      // 410: lload 2
      // 411: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 416: athrow
      // 417: aload 9
      // 419: lload 2
      // 41a: lconst_0
      // 41b: lcmp
      // 41c: iflt 465
      // 41f: bipush 0
      // 420: aload 7
      // 422: ifnonnull 462
      // 425: goto 432
      // 428: ldc2_w 1984708943755837689
      // 42b: lload 2
      // 42c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 431: athrow
      // 432: invokevirtual java/lang/String.charAt (I)C
      // 435: goto 442
      // 438: ldc2_w 1984708943755837689
      // 43b: lload 2
      // 43c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 441: athrow
      // 442: sipush 3614
      // 445: ldc2_w 4559869766988575520
      // 448: lload 2
      // 449: lxor
      // 44a: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44f: if_icmpne 46f
      // 452: aload 9
      // 454: bipush 1
      // 455: goto 462
      // 458: ldc2_w 1984708943755837689
      // 45b: lload 2
      // 45c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 461: athrow
      // 462: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 465: astore 9
      // 467: aload 8
      // 469: aload 9
      // 46b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46e: pop
      // 46f: aload 7
      // 471: lload 2
      // 472: lconst_0
      // 473: lcmp
      // 474: ifle 47b
      // 477: ifnull 550
      // 47a: aload 1
      // 47b: bipush 0
      // 47c: invokevirtual java/lang/String.charAt (I)C
      // 47f: goto 48c
      // 482: ldc2_w 1984708943755837689
      // 485: lload 2
      // 486: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48b: athrow
      // 48c: aload 7
      // 48e: lload 2
      // 48f: lconst_0
      // 490: lcmp
      // 491: iflt 4cd
      // 494: ifnonnull 4c5
      // 497: sipush 3614
      // 49a: ldc2_w 4559869766988575520
      // 49d: lload 2
      // 49e: lxor
      // 49f: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: if_icmpne 4c0
      // 4a7: goto 4b4
      // 4aa: ldc2_w 1984708943755837689
      // 4ad: lload 2
      // 4ae: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b3: athrow
      // 4b4: aload 1
      // 4b5: areturn
      // 4b6: ldc2_w 1984708943755837689
      // 4b9: lload 2
      // 4ba: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bf: athrow
      // 4c0: aload 4
      // 4c2: invokevirtual java/lang/String.length ()I
      // 4c5: lload 2
      // 4c6: lconst_0
      // 4c7: lcmp
      // 4c8: ifle 519
      // 4cb: aload 7
      // 4cd: ifnonnull 519
      // 4d0: ifle 549
      // 4d3: goto 4e0
      // 4d6: ldc2_w 1984708943755837689
      // 4d9: lload 2
      // 4da: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4df: athrow
      // 4e0: aload 8
      // 4e2: aload 4
      // 4e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e7: pop
      // 4e8: aload 8
      // 4ea: aload 7
      // 4ec: ifnonnull 54f
      // 4ef: goto 4fc
      // 4f2: ldc2_w 1984708943755837689
      // 4f5: lload 2
      // 4f6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fb: athrow
      // 4fc: aload 8
      // 4fe: invokevirtual java/lang/StringBuilder.length ()I
      // 501: bipush 1
      // 502: isub
      // 503: ldc2_w 1889133628533903951
      // 506: lload 2
      // 507: invokedynamic n (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50c: goto 519
      // 50f: ldc2_w 1984708943755837689
      // 512: lload 2
      // 513: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 518: athrow
      // 519: sipush 3614
      // 51c: ldc2_w 4559869766988575520
      // 51f: lload 2
      // 520: lxor
      // 521: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: if_icmpeq 549
      // 529: aload 8
      // 52b: sipush 3614
      // 52e: ldc2_w 4559869766988575520
      // 531: lload 2
      // 532: lxor
      // 533: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 538: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 53b: pop
      // 53c: goto 549
      // 53f: ldc2_w 1984708943755837689
      // 542: lload 2
      // 543: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 548: athrow
      // 549: aload 8
      // 54b: aload 1
      // 54c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54f: pop
      // 550: aload 8
      // 552: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 555: areturn
   }

   public static BufferedReader i(Object[] var0) {
      long var1 = (Long)var0[0];
      InputStream var3 = (InputStream)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 117373208401892L;
      return x44.a<"r">(new Object[]{var3, (String)null, null, var4}, 6483274094884397101L, var1);
   }

   public static String w(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w 8697723284045444454
      // 01c: lload 1
      // 01d: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 3
      // 023: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 026: astore 3
      // 027: astore 4
      // 029: aload 3
      // 02a: aload 4
      // 02c: ifnonnull 13d
      // 02f: invokevirtual java/lang/String.length ()I
      // 032: bipush 1
      // 033: if_icmple 106
      // 036: goto 043
      // 039: ldc2_w 7452108977914969113
      // 03c: lload 1
      // 03d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: athrow
      // 043: aload 3
      // 044: bipush 0
      // 045: aload 4
      // 047: ifnonnull 12f
      // 04a: goto 057
      // 04d: ldc2_w 7452108977914969113
      // 050: lload 1
      // 051: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: athrow
      // 057: lload 1
      // 058: lconst_0
      // 059: lcmp
      // 05a: iflt 125
      // 05d: invokevirtual java/lang/String.charAt (I)C
      // 060: ldc2_w 7407186552282138991
      // 063: lload 1
      // 064: invokedynamic v (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: ifeq 106
      // 06c: goto 079
      // 06f: ldc2_w 7452108977914969113
      // 072: lload 1
      // 073: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 3
      // 07a: lload 1
      // 07b: lconst_0
      // 07c: lcmp
      // 07d: iflt 13b
      // 080: bipush 1
      // 081: aload 4
      // 083: ifnonnull 12f
      // 086: goto 093
      // 089: ldc2_w 7452108977914969113
      // 08c: lload 1
      // 08d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: lload 1
      // 094: lconst_0
      // 095: lcmp
      // 096: ifle 125
      // 099: invokevirtual java/lang/String.charAt (I)C
      // 09c: sipush 20204
      // 09f: ldc2_w 764402119446531900
      // 0a2: lload 1
      // 0a3: lxor
      // 0a4: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: if_icmpne 106
      // 0ac: goto 0b9
      // 0af: ldc2_w 7452108977914969113
      // 0b2: lload 1
      // 0b3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: ldc2_w 8765158281014489769
      // 0bc: lload 1
      // 0bd: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: sipush 8388
      // 0c5: ldc2_w 1718186019316392214
      // 0c8: lload 1
      // 0c9: lxor
      // 0ca: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: if_icmpne 104
      // 0d2: goto 0df
      // 0d5: ldc2_w 7452108977914969113
      // 0d8: lload 1
      // 0d9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 3
      // 0e0: sipush 3614
      // 0e3: ldc2_w 4559831409054764992
      // 0e6: lload 1
      // 0e7: lxor
      // 0e8: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: ldc2_w 8765158281014489769
      // 0f0: lload 1
      // 0f1: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0f9: areturn
      // 0fa: ldc2_w 7452108977914969113
      // 0fd: lload 1
      // 0fe: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 3
      // 105: areturn
      // 106: aload 3
      // 107: sipush 719
      // 10a: ldc2_w 6158385897997550352
      // 10d: lload 1
      // 10e: lxor
      // 10f: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: ldc2_w 8765158281014489769
      // 117: lload 1
      // 118: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 120: astore 3
      // 121: aload 3
      // 122: sipush 3614
      // 125: ldc2_w 4559831409054764992
      // 128: lload 1
      // 129: lxor
      // 12a: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: ldc2_w 8765158281014489769
      // 132: lload 1
      // 133: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 13b: astore 3
      // 13c: aload 3
      // 13d: areturn
   }

   public static boolean i(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/w_.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w -4483096994526426086
      // 1c: lload 1
      // 1d: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: ldc2_w -2846169226689081500
      // 27: lload 1
      // 28: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 4
      // 2f: ifnonnull 5f
      // 32: ifne 4e
      // 35: goto 42
      // 38: ldc2_w -2443370377413180059
      // 3b: lload 1
      // 3c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
      // 44: ldc2_w -2443370377413180059
      // 47: lload 1
      // 48: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 3
      // 4f: sipush 7147
      // 52: ldc2_w 3951899984576373591
      // 55: lload 1
      // 56: lxor
      // 57: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: invokevirtual java/lang/String.lastIndexOf (I)I
      // 5f: istore 5
      // 61: iload 5
      // 63: aload 4
      // 65: ifnonnull ef
      // 68: bipush -1
      // 69: if_icmple ee
      // 6c: goto 79
      // 6f: ldc2_w -2443370377413180059
      // 72: lload 1
      // 73: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 3
      // 7a: iload 5
      // 7c: aload 3
      // 7d: invokevirtual java/lang/String.length ()I
      // 80: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 83: astore 6
      // 85: aload 6
      // 87: sipush 19888
      // 8a: ldc2_w 3948244235163817121
      // 8d: lload 1
      // 8e: lxor
      // 8f: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: ldc2_w -4474208129106337319
      // 97: lload 1
      // 98: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: aload 4
      // 9f: ifnonnull ed
      // a2: ifne ec
      // a5: goto b2
      // a8: ldc2_w -2443370377413180059
      // ab: lload 1
      // ac: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 6
      // b4: sipush 7851
      // b7: ldc2_w 3897729526916908938
      // ba: lload 1
      // bb: lxor
      // bc: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: ldc2_w -4474208129106337319
      // c4: lload 1
      // c5: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: aload 4
      // cc: ifnonnull ef
      // cf: goto dc
      // d2: ldc2_w -2443370377413180059
      // d5: lload 1
      // d6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: ifeq ee
      // df: goto ec
      // e2: ldc2_w -2443370377413180059
      // e5: lload 1
      // e6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // eb: athrow
      // ec: bipush 1
      // ed: ireturn
      // ee: bipush 0
      // ef: ireturn
   }

   public static BufferedReader P(Object[] var0) {
      File var4 = (File)var0[0];
      pg var3 = (pg)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 98662838023433L;
      return x44.a<"w">(new Object[]{new FileInputStream(var4), (String)null, var3, var5}, 8868718014982161088L, var1);
   }

   public static void b(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Integer
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Integer
      // 01e: astore 1
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 3
      // 029: pop
      // 02a: getstatic com/zelix/w_.a J
      // 02d: lload 3
      // 02e: lxor
      // 02f: lstore 3
      // 030: ldc2_w -4991403472519628952
      // 033: lload 3
      // 034: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: astore 7
      // 03b: new java/io/File
      // 03e: dup
      // 03f: aload 2
      // 040: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 043: ldc2_w -6527562929525691030
      // 046: lload 3
      // 047: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: new java/io/File
      // 04f: dup
      // 050: aload 5
      // 052: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 055: ldc2_w -6527562929525691030
      // 058: lload 3
      // 059: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 061: ifeq 0a9
      // 064: new java/lang/IllegalArgumentException
      // 067: dup
      // 068: new java/lang/StringBuilder
      // 06b: dup
      // 06c: invokespecial java/lang/StringBuilder.<init> ()V
      // 06f: sipush 23837
      // 072: ldc2_w 6522758785498955628
      // 075: lload 3
      // 076: lxor
      // 077: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: new java/io/File
      // 082: dup
      // 083: aload 2
      // 084: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 087: ldc2_w -6527562929525691030
      // 08a: lload 3
      // 08b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: ldc "'"
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 098: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 09e: athrow
      // 09f: ldc2_w -6528732491981636073
      // 0a2: lload 3
      // 0a3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aconst_null
      // 0aa: astore 8
      // 0ac: aconst_null
      // 0ad: astore 9
      // 0af: aload 6
      // 0b1: ifnull 0cd
      // 0b4: new java/io/BufferedInputStream
      // 0b7: dup
      // 0b8: new java/io/FileInputStream
      // 0bb: dup
      // 0bc: aload 2
      // 0bd: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 0c0: aload 6
      // 0c2: invokevirtual java/lang/Integer.intValue ()I
      // 0c5: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 0c8: astore 9
      // 0ca: goto 0de
      // 0cd: new java/io/BufferedInputStream
      // 0d0: dup
      // 0d1: new java/io/FileInputStream
      // 0d4: dup
      // 0d5: aload 2
      // 0d6: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 0d9: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 0dc: astore 9
      // 0de: aload 1
      // 0df: ifnull 0fb
      // 0e2: new java/io/BufferedOutputStream
      // 0e5: dup
      // 0e6: new java/io/FileOutputStream
      // 0e9: dup
      // 0ea: aload 5
      // 0ec: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 0ef: aload 1
      // 0f0: invokevirtual java/lang/Integer.intValue ()I
      // 0f3: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 0f6: astore 8
      // 0f8: goto 10d
      // 0fb: new java/io/BufferedOutputStream
      // 0fe: dup
      // 0ff: new java/io/FileOutputStream
      // 102: dup
      // 103: aload 5
      // 105: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 108: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;)V
      // 10b: astore 8
      // 10d: aload 9
      // 10f: ldc2_w -6507026612837292230
      // 112: lload 3
      // 113: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: istore 10
      // 11a: iload 10
      // 11c: newarray 8
      // 11e: astore 11
      // 120: bipush 0
      // 121: istore 12
      // 123: iload 12
      // 125: iload 10
      // 127: if_icmpge 197
      // 12a: aload 9
      // 12c: aload 7
      // 12e: lload 3
      // 12f: lconst_0
      // 130: lcmp
      // 131: iflt 1c8
      // 134: ifnonnull 1c6
      // 137: aload 11
      // 139: iload 12
      // 13b: sipush 21787
      // 13e: ldc2_w 2048174675615307468
      // 141: lload 3
      // 142: lxor
      // 143: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: iload 10
      // 14a: iload 12
      // 14c: isub
      // 14d: ldc2_w -5094859375665042870
      // 150: lload 3
      // 151: invokedynamic p (IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: ldc2_w -5178960184454119871
      // 159: lload 3
      // 15a: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: dup
      // 160: istore 13
      // 162: lload 3
      // 163: lconst_0
      // 164: lcmp
      // 165: ifle 190
      // 168: bipush -1
      // 169: aload 7
      // 16b: ifnonnull 18f
      // 16e: if_icmpeq 197
      // 171: goto 17e
      // 174: ldc2_w -6528732491981636073
      // 177: lload 3
      // 178: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: iload 12
      // 180: iload 13
      // 182: goto 18f
      // 185: ldc2_w -6528732491981636073
      // 188: lload 3
      // 189: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: iadd
      // 190: istore 12
      // 192: aload 7
      // 194: ifnull 123
      // 197: aload 8
      // 199: aload 11
      // 19b: invokevirtual java/io/BufferedOutputStream.write ([B)V
      // 19e: lload 3
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: ifle 1e6
      // 1a4: lload 3
      // 1a5: lconst_0
      // 1a6: lcmp
      // 1a7: ifle 1bf
      // 1aa: aload 8
      // 1ac: aload 7
      // 1ae: ifnonnull 1b6
      // 1b1: ifnull 1c4
      // 1b4: aload 8
      // 1b6: ldc2_w -6344566398373260474
      // 1b9: lload 3
      // 1ba: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: goto 1c4
      // 1c2: astore 10
      // 1c4: aload 9
      // 1c6: aload 7
      // 1c8: ifnonnull 1dd
      // 1cb: ifnull 24d
      // 1ce: goto 1db
      // 1d1: ldc2_w -6528732491981636073
      // 1d4: lload 3
      // 1d5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: aload 9
      // 1dd: ldc2_w -6649906112230451872
      // 1e0: lload 3
      // 1e1: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: goto 24d
      // 1e9: astore 10
      // 1eb: goto 24d
      // 1ee: astore 14
      // 1f0: lload 3
      // 1f1: lconst_0
      // 1f2: lcmp
      // 1f3: ifle 218
      // 1f6: aload 8
      // 1f8: aload 7
      // 1fa: ifnonnull 20f
      // 1fd: ifnull 21d
      // 200: goto 20d
      // 203: ldc2_w -6528732491981636073
      // 206: lload 3
      // 207: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: athrow
      // 20d: aload 8
      // 20f: ldc2_w -6344566398373260474
      // 212: lload 3
      // 213: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: goto 21d
      // 21b: astore 15
      // 21d: lload 3
      // 21e: lconst_0
      // 21f: lcmp
      // 220: iflt 245
      // 223: aload 9
      // 225: aload 7
      // 227: ifnonnull 23c
      // 22a: ifnull 24a
      // 22d: goto 23a
      // 230: ldc2_w -6528732491981636073
      // 233: lload 3
      // 234: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: athrow
      // 23a: aload 9
      // 23c: ldc2_w -6649906112230451872
      // 23f: lload 3
      // 240: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: goto 24a
      // 248: astore 15
      // 24a: aload 14
      // 24c: athrow
      // 24d: return
   }

   public static BufferedReader S(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/io/InputStream
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/pg
      // 017: astore 1
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 2
      // 022: pop
      // 023: getstatic com/zelix/w_.a J
      // 026: lload 2
      // 027: lxor
      // 028: lstore 2
      // 029: lload 2
      // 02a: dup2
      // 02b: ldc2_w 46578793011786
      // 02e: lxor
      // 02f: lstore 6
      // 031: dup2
      // 032: ldc2_w 17485590043781
      // 035: lxor
      // 036: lstore 8
      // 038: dup2
      // 039: ldc2_w 47444401201938
      // 03c: lxor
      // 03d: lstore 10
      // 03f: dup2
      // 040: ldc2_w 81339541409611
      // 043: lxor
      // 044: lstore 12
      // 046: pop2
      // 047: ldc2_w 6791674374477452178
      // 04a: lload 2
      // 04b: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: new java/io/PushbackInputStream
      // 053: dup
      // 054: aload 5
      // 056: ldc2_w 4820150371869904507
      // 059: lload 2
      // 05a: invokedynamic k (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokespecial java/io/PushbackInputStream.<init> (Ljava/io/InputStream;I)V
      // 062: astore 15
      // 064: aconst_null
      // 065: astore 16
      // 067: aconst_null
      // 068: astore 17
      // 06a: astore 14
      // 06c: aload 4
      // 06e: aload 14
      // 070: ifnonnull 095
      // 073: ifnull 0c1
      // 076: goto 083
      // 079: ldc2_w 4728620469411437293
      // 07c: lload 2
      // 07d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: aload 4
      // 085: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 088: goto 095
      // 08b: ldc2_w 4728620469411437293
      // 08e: lload 2
      // 08f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 14
      // 097: ifnonnull 0bf
      // 09a: invokevirtual java/lang/String.length ()I
      // 09d: ifle 0c1
      // 0a0: goto 0ad
      // 0a3: ldc2_w 4728620469411437293
      // 0a6: lload 2
      // 0a7: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: aload 4
      // 0af: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b2: goto 0bf
      // 0b5: ldc2_w 4728620469411437293
      // 0b8: lload 2
      // 0b9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: astore 17
      // 0c1: bipush 0
      // 0c2: istore 18
      // 0c4: aload 17
      // 0c6: aload 14
      // 0c8: ifnonnull 198
      // 0cb: ifnull 13c
      // 0ce: goto 0db
      // 0d1: ldc2_w 4728620469411437293
      // 0d4: lload 2
      // 0d5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 17
      // 0dd: aload 14
      // 0df: ifnonnull 198
      // 0e2: goto 0ef
      // 0e5: ldc2_w 4728620469411437293
      // 0e8: lload 2
      // 0e9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: lload 2
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: ifle 18b
      // 0f5: invokevirtual java/lang/String.length ()I
      // 0f8: ifeq 13c
      // 0fb: goto 108
      // 0fe: ldc2_w 4728620469411437293
      // 101: lload 2
      // 102: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 17
      // 10a: aload 14
      // 10c: ifnonnull 28d
      // 10f: goto 11c
      // 112: ldc2_w 4728620469411437293
      // 115: lload 2
      // 116: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: sipush 22707
      // 11f: ldc2_w 7502974328006237750
      // 122: lload 2
      // 123: lxor
      // 124: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 12c: ifeq 28b
      // 12f: goto 13c
      // 132: ldc2_w 4728620469411437293
      // 135: lload 2
      // 136: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: aload 15
      // 13e: lload 6
      // 140: ldc2_w 4820150371869904507
      // 143: lload 2
      // 144: invokedynamic k (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: bipush 3
      // 14a: anewarray 598
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 152: bipush 2
      // 153: swap
      // 154: aastore
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 1
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: ldc2_w 6522111370487254791
      // 166: lload 2
      // 167: invokedynamic r (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: lload 8
      // 16e: dup2_x1
      // 16f: pop2
      // 170: bipush 2
      // 171: anewarray 598
      // 174: dup_x1
      // 175: swap
      // 176: bipush 1
      // 177: swap
      // 178: aastore
      // 179: dup_x2
      // 17a: dup_x2
      // 17b: pop
      // 17c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17f: bipush 0
      // 180: swap
      // 181: aastore
      // 182: ldc2_w 4640418776588709752
      // 185: lload 2
      // 186: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: goto 198
      // 18e: ldc2_w 4728620469411437293
      // 191: lload 2
      // 192: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: astore 19
      // 19a: aload 19
      // 19c: aload 14
      // 19e: lload 2
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: iflt 1c6
      // 1a4: ifnonnull 1b9
      // 1a7: ifnull 1e2
      // 1aa: goto 1b7
      // 1ad: ldc2_w 4728620469411437293
      // 1b0: lload 2
      // 1b1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: aload 19
      // 1b9: sipush 22707
      // 1bc: ldc2_w 7502974328006237750
      // 1bf: lload 2
      // 1c0: lxor
      // 1c1: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c9: aload 14
      // 1cb: ifnonnull 1df
      // 1ce: ifeq 1e2
      // 1d1: goto 1de
      // 1d4: ldc2_w 4728620469411437293
      // 1d7: lload 2
      // 1d8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: bipush 1
      // 1df: goto 1e3
      // 1e2: bipush 0
      // 1e3: istore 18
      // 1e5: aload 19
      // 1e7: aload 14
      // 1e9: ifnonnull 28d
      // 1ec: ifnull 28b
      // 1ef: goto 1fc
      // 1f2: ldc2_w 4728620469411437293
      // 1f5: lload 2
      // 1f6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: aload 19
      // 1fe: aload 14
      // 200: ifnonnull 28d
      // 203: goto 210
      // 206: ldc2_w 4728620469411437293
      // 209: lload 2
      // 20a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: athrow
      // 210: invokevirtual java/lang/String.length ()I
      // 213: ifle 28b
      // 216: goto 223
      // 219: ldc2_w 4728620469411437293
      // 21c: lload 2
      // 21d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: athrow
      // 223: aload 17
      // 225: aload 14
      // 227: ifnonnull 289
      // 22a: goto 237
      // 22d: ldc2_w 4728620469411437293
      // 230: lload 2
      // 231: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: athrow
      // 237: lload 2
      // 238: lconst_0
      // 239: lcmp
      // 23a: ifle 27c
      // 23d: ifnull 27a
      // 240: goto 24d
      // 243: ldc2_w 4728620469411437293
      // 246: lload 2
      // 247: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: athrow
      // 24d: aload 17
      // 24f: aload 14
      // 251: lload 2
      // 252: lconst_0
      // 253: lcmp
      // 254: ifle 295
      // 257: ifnonnull 28d
      // 25a: goto 267
      // 25d: ldc2_w 4728620469411437293
      // 260: lload 2
      // 261: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: invokevirtual java/lang/String.length ()I
      // 26a: ifne 28b
      // 26d: goto 27a
      // 270: ldc2_w 4728620469411437293
      // 273: lload 2
      // 274: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: athrow
      // 27a: aload 19
      // 27c: goto 289
      // 27f: ldc2_w 4728620469411437293
      // 282: lload 2
      // 283: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: athrow
      // 289: astore 17
      // 28b: aload 17
      // 28d: lload 2
      // 28e: lconst_0
      // 28f: lcmp
      // 290: ifle 2aa
      // 293: aload 14
      // 295: ifnonnull 2aa
      // 298: ifnull 2c2
      // 29b: goto 2a8
      // 29e: ldc2_w 4728620469411437293
      // 2a1: lload 2
      // 2a2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: aload 17
      // 2aa: invokevirtual java/lang/String.length ()I
      // 2ad: aload 14
      // 2af: ifnonnull 2d9
      // 2b2: ifne 2d7
      // 2b5: goto 2c2
      // 2b8: ldc2_w 4728620469411437293
      // 2bb: lload 2
      // 2bc: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: new java/io/BufferedReader
      // 2c5: dup
      // 2c6: new java/io/InputStreamReader
      // 2c9: dup
      // 2ca: aload 15
      // 2cc: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 2cf: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 2d2: astore 16
      // 2d4: goto 31a
      // 2d7: iload 18
      // 2d9: ifeq 306
      // 2dc: lload 12
      // 2de: aload 15
      // 2e0: bipush 3
      // 2e1: bipush 3
      // 2e2: anewarray 598
      // 2e5: dup_x1
      // 2e6: swap
      // 2e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2ea: bipush 2
      // 2eb: swap
      // 2ec: aastore
      // 2ed: dup_x1
      // 2ee: swap
      // 2ef: bipush 1
      // 2f0: swap
      // 2f1: aastore
      // 2f2: dup_x2
      // 2f3: dup_x2
      // 2f4: pop
      // 2f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f8: bipush 0
      // 2f9: swap
      // 2fa: aastore
      // 2fb: ldc2_w 5101886481051563824
      // 2fe: lload 2
      // 2ff: invokedynamic r (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: astore 19
      // 306: new java/io/BufferedReader
      // 309: dup
      // 30a: new java/io/InputStreamReader
      // 30d: dup
      // 30e: aload 15
      // 310: aload 17
      // 312: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 315: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 318: astore 16
      // 31a: aload 1
      // 31b: aload 14
      // 31d: ifnonnull 331
      // 320: ifnull 338
      // 323: goto 330
      // 326: ldc2_w 4728620469411437293
      // 329: lload 2
      // 32a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32f: athrow
      // 330: aload 1
      // 331: lload 10
      // 333: aload 17
      // 335: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 338: aload 16
      // 33a: lload 2
      // 33b: lconst_0
      // 33c: lcmp
      // 33d: iflt 352
      // 340: aload 14
      // 342: ifnull 35f
      // 345: bipush 4
      // 346: anewarray 23
      // 349: ldc2_w 5153847354614047536
      // 34c: lload 2
      // 34d: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: goto 35f
      // 355: ldc2_w 4728620469411437293
      // 358: lload 2
      // 359: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35e: athrow
      // 35f: areturn
   }

   public static String L(Object[] var0) {
      File var1 = (File)var0[0];
      long var3 = (Long)var0[1];
      String var5 = (String)var0[2];
      qv var2 = (qv)var0[3];
      var3 = a ^ var3;
      long var6 = var3 ^ 52350764211861L;
      FileInputStream var8 = new FileInputStream(var1);
      long var10002 = (long)(x44.a<"i">(var8, 7041587299182554935L, var3) + b<"k">(12678, 5031517535668893466L ^ var3));
      Object[] var10006 = new Object[]{null, null, null, var2, var6};
      var10006[2] = var10002;
      var10006[1] = var5;
      var10006[0] = var8;
      return x44.a<"q">(var10006, 8999465677587858073L, var3);
   }

   public static boolean x(Object[] var0) {
      File var1 = (File)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 124021570458404L;
      String var10000 = x44.a<"u">(-950259816810692835L, var2);
      FileInputStream var7 = null;
      String var6 = var10000;

      boolean var8;
      try {
         var7 = new FileInputStream(var1);
         var8 = x44.a<"u">(new Object[]{var4, var7}, -915846048088069785L, var2);
      } finally {
         try {
            label71: {
               label70: {
                  try {
                     var24 = var7;
                     if (var6 != null) {
                        break label70;
                     }

                     if (var7 == null) {
                        break label71;
                     }
                  } catch (g3 var19) {
                     throw x44.a<"u">(var19, -1364503669670054302L, var2);
                  }

                  var24 = var7;
               }

               x44.a<"m">(var24, -1383684856670755807L, var2);
            }
         } catch (g3 var20) {
            throw var20;
         } catch (Exception var21) {
         }
      }

      return var8;
   }

   public static byte[] q(Object[] var0) {
      long var1 = (Long)var0[0];
      InputStream var4 = (InputStream)var0[1];
      int var3 = (Integer)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 58618771574500L;
      String var10000 = x44.a<"u">(2085128615381127485L, var1);
      B var8 = null;
      String var7 = var10000;

      label20: {
         try {
            var11 = var3;
            if (var7 != null) {
               break label20;
            }

            if (var3 <= 0) {
               return (byte[])var8;
            }
         } catch (IllegalArgumentException var9) {
            throw x44.a<"u">(var9, 229804471356069954L, var1);
         }

         var11 = var3;
      }

      var8 = new byte[var11];
      x44.a<"u">(new Object[]{var5, var4, var8}, 211475500591254178L, var1);
      return (byte[])var8;
   }

   public static boolean o(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/pg
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 1
      // 01a: pop
      // 01b: getstatic com/zelix/w_.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 23162434179964
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: ldc2_w 3327845571806192636
      // 02d: lload 1
      // 02e: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: sipush 5227
      // 036: ldc2_w 8806810355547300486
      // 039: lload 1
      // 03a: lxor
      // 03b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: astore 8
      // 042: astore 7
      // 044: aconst_null
      // 045: astore 9
      // 047: new java/io/PrintWriter
      // 04a: dup
      // 04b: new java/io/FileWriter
      // 04e: dup
      // 04f: aload 4
      // 051: invokespecial java/io/FileWriter.<init> (Ljava/lang/String;)V
      // 054: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 057: astore 9
      // 059: aload 9
      // 05b: aload 8
      // 05d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 060: aload 9
      // 062: aload 7
      // 064: ifnonnull 06c
      // 067: ifnull 0f8
      // 06a: aload 9
      // 06c: ldc2_w 3904428206289192326
      // 06f: lload 1
      // 070: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: goto 0f8
      // 078: astore 10
      // 07a: aload 3
      // 07b: aload 7
      // 07d: lload 1
      // 07e: lconst_0
      // 07f: lcmp
      // 080: ifle 0a2
      // 083: ifnonnull 097
      // 086: ifnull 0a9
      // 089: goto 096
      // 08c: ldc2_w 3598747140516457091
      // 08f: lload 1
      // 090: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: aload 3
      // 097: aload 10
      // 099: ldc2_w 3688844092894788468
      // 09c: lload 1
      // 09d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: lload 5
      // 0a4: dup2_x1
      // 0a5: pop2
      // 0a6: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 0a9: bipush 0
      // 0aa: istore 11
      // 0ac: aload 9
      // 0ae: aload 7
      // 0b0: ifnonnull 0c5
      // 0b3: ifnull 0ce
      // 0b6: goto 0c3
      // 0b9: ldc2_w 3598747140516457091
      // 0bc: lload 1
      // 0bd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: aload 9
      // 0c5: ldc2_w 3904428206289192326
      // 0c8: lload 1
      // 0c9: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: iload 11
      // 0d0: ireturn
      // 0d1: astore 12
      // 0d3: aload 9
      // 0d5: aload 7
      // 0d7: ifnonnull 0ec
      // 0da: ifnull 0f5
      // 0dd: goto 0ea
      // 0e0: ldc2_w 3598747140516457091
      // 0e3: lload 1
      // 0e4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: aload 9
      // 0ec: ldc2_w 3904428206289192326
      // 0ef: lload 1
      // 0f0: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: aload 12
      // 0f7: athrow
      // 0f8: aconst_null
      // 0f9: astore 10
      // 0fb: aconst_null
      // 0fc: astore 11
      // 0fe: new java/io/BufferedReader
      // 101: dup
      // 102: new java/io/FileReader
      // 105: dup
      // 106: aload 4
      // 108: invokespecial java/io/FileReader.<init> (Ljava/lang/String;)V
      // 10b: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 10e: astore 10
      // 110: aload 10
      // 112: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 115: astore 11
      // 117: lload 1
      // 118: lconst_0
      // 119: lcmp
      // 11a: iflt 13f
      // 11d: aload 10
      // 11f: aload 7
      // 121: ifnonnull 136
      // 124: ifnull 1dd
      // 127: goto 134
      // 12a: ldc2_w 3598747140516457091
      // 12d: lload 1
      // 12e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 10
      // 136: ldc2_w 3508299310954467215
      // 139: lload 1
      // 13a: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: goto 1dd
      // 142: astore 12
      // 144: goto 1dd
      // 147: astore 12
      // 149: aload 3
      // 14a: aload 7
      // 14c: lload 1
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: iflt 171
      // 152: ifnonnull 166
      // 155: ifnull 178
      // 158: goto 165
      // 15b: ldc2_w 3598747140516457091
      // 15e: lload 1
      // 15f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: aload 3
      // 166: aload 12
      // 168: ldc2_w 3688844092894788468
      // 16b: lload 1
      // 16c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: lload 5
      // 173: dup2_x1
      // 174: pop2
      // 175: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 178: bipush 0
      // 179: istore 13
      // 17b: lload 1
      // 17c: lconst_0
      // 17d: lcmp
      // 17e: iflt 1a3
      // 181: aload 10
      // 183: aload 7
      // 185: ifnonnull 19a
      // 188: ifnull 1a8
      // 18b: goto 198
      // 18e: ldc2_w 3598747140516457091
      // 191: lload 1
      // 192: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: aload 10
      // 19a: ldc2_w 3508299310954467215
      // 19d: lload 1
      // 19e: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: goto 1a8
      // 1a6: astore 14
      // 1a8: iload 13
      // 1aa: ireturn
      // 1ab: astore 15
      // 1ad: lload 1
      // 1ae: lconst_0
      // 1af: lcmp
      // 1b0: ifle 1d5
      // 1b3: aload 10
      // 1b5: aload 7
      // 1b7: ifnonnull 1cc
      // 1ba: ifnull 1da
      // 1bd: goto 1ca
      // 1c0: ldc2_w 3598747140516457091
      // 1c3: lload 1
      // 1c4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 10
      // 1cc: ldc2_w 3508299310954467215
      // 1cf: lload 1
      // 1d0: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: goto 1da
      // 1d8: astore 16
      // 1da: aload 15
      // 1dc: athrow
      // 1dd: aload 11
      // 1df: aload 7
      // 1e1: lload 1
      // 1e2: lconst_0
      // 1e3: lcmp
      // 1e4: iflt 1fe
      // 1e7: ifnonnull 1fc
      // 1ea: ifnull 21a
      // 1ed: goto 1fa
      // 1f0: ldc2_w 3598747140516457091
      // 1f3: lload 1
      // 1f4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: athrow
      // 1fa: aload 8
      // 1fc: aload 11
      // 1fe: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 201: aload 7
      // 203: ifnonnull 217
      // 206: ifeq 21a
      // 209: goto 216
      // 20c: ldc2_w 3598747140516457091
      // 20f: lload 1
      // 210: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: athrow
      // 216: bipush 1
      // 217: goto 21b
      // 21a: bipush 0
      // 21b: ireturn
   }

   public static void v(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      String var4 = (String)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 42296102671610L;
      x44.a<"v">(new Object[]{var3, var4, (Integer)null, (Integer)null, var5}, -87316991457335459L, var1);
   }

   public static String r(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast [B
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/wp
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast com/zelix/wp
      // 015: astore 3
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast java/lang/Long
      // 01c: invokevirtual java/lang/Long.longValue ()J
      // 01f: lstore 4
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/wp
      // 027: astore 6
      // 029: pop
      // 02a: getstatic com/zelix/w_.a J
      // 02d: lload 4
      // 02f: lxor
      // 030: lstore 4
      // 032: ldc2_w 838938890833577590
      // 035: lload 4
      // 037: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: astore 7
      // 03e: aload 1
      // 03f: aload 7
      // 041: ifnonnull 063
      // 044: ifnonnull 062
      // 047: goto 055
      // 04a: ldc2_w 1475829268806602505
      // 04d: lload 4
      // 04f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: athrow
      // 055: aconst_null
      // 056: areturn
      // 057: ldc2_w 1475829268806602505
      // 05a: lload 4
      // 05c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 1
      // 063: arraylength
      // 064: lload 4
      // 066: lconst_0
      // 067: lcmp
      // 068: ifle 0ee
      // 06b: ldc2_w 1657536441266903967
      // 06e: lload 4
      // 070: invokedynamic o (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: aload 7
      // 077: ifnonnull 0ed
      // 07a: if_icmpeq 0dc
      // 07d: goto 08b
      // 080: ldc2_w 1475829268806602505
      // 083: lload 4
      // 085: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: new java/lang/IllegalArgumentException
      // 08e: dup
      // 08f: new java/lang/StringBuilder
      // 092: dup
      // 093: invokespecial java/lang/StringBuilder.<init> ()V
      // 096: sipush 12884
      // 099: ldc2_w 6015736868974584098
      // 09c: lload 4
      // 09e: lxor
      // 09f: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: ldc2_w 1657536441266903967
      // 0aa: lload 4
      // 0ac: invokedynamic o (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0b4: sipush 23981
      // 0b7: ldc2_w 8905837990262542034
      // 0ba: lload 4
      // 0bc: lxor
      // 0bd: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c5: aload 1
      // 0c6: arraylength
      // 0c7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ca: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cd: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0d0: athrow
      // 0d1: ldc2_w 1475829268806602505
      // 0d4: lload 4
      // 0d6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: bipush 0
      // 0de: baload
      // 0df: sipush 27312
      // 0e2: ldc2_w 6691784735644833909
      // 0e5: lload 4
      // 0e7: lxor
      // 0e8: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: iand
      // 0ee: istore 8
      // 0f0: aload 1
      // 0f1: bipush 1
      // 0f2: baload
      // 0f3: sipush 10814
      // 0f6: ldc2_w 7606469752198535423
      // 0f9: lload 4
      // 0fb: lxor
      // 0fc: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: iand
      // 102: istore 9
      // 104: aload 1
      // 105: bipush 2
      // 106: baload
      // 107: sipush 10814
      // 10a: ldc2_w 7606469752198535423
      // 10d: lload 4
      // 10f: lxor
      // 110: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iand
      // 116: istore 10
      // 118: iload 8
      // 11a: sipush 16950
      // 11d: ldc2_w 8815950759223423202
      // 120: lload 4
      // 122: lxor
      // 123: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: aload 7
      // 12a: ifnonnull 1ef
      // 12d: if_icmpne 1df
      // 130: goto 13e
      // 133: ldc2_w 1475829268806602505
      // 136: lload 4
      // 138: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: iload 9
      // 140: sipush 29987
      // 143: ldc2_w 6132265691403667433
      // 146: lload 4
      // 148: lxor
      // 149: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: aload 7
      // 150: ifnonnull 1ef
      // 153: goto 161
      // 156: ldc2_w 1475829268806602505
      // 159: lload 4
      // 15b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: lload 4
      // 163: lconst_0
      // 164: lcmp
      // 165: ifle 1e4
      // 168: if_icmpne 1df
      // 16b: goto 179
      // 16e: ldc2_w 1475829268806602505
      // 171: lload 4
      // 173: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: iload 10
      // 17b: sipush 8526
      // 17e: ldc2_w 5913795719495193478
      // 181: lload 4
      // 183: lxor
      // 184: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: aload 7
      // 18b: lload 4
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: ifle 1f1
      // 192: ifnonnull 1ef
      // 195: goto 1a3
      // 198: ldc2_w 1475829268806602505
      // 19b: lload 4
      // 19d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: lload 4
      // 1a5: lconst_0
      // 1a6: lcmp
      // 1a7: iflt 1e4
      // 1aa: if_icmpne 1df
      // 1ad: goto 1bb
      // 1b0: ldc2_w 1475829268806602505
      // 1b3: lload 4
      // 1b5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: aload 2
      // 1bc: bipush 3
      // 1bd: invokevirtual com/zelix/wp.V (I)V
      // 1c0: sipush 3446
      // 1c3: aload 3
      // 1c4: bipush 3
      // 1c5: invokevirtual com/zelix/wp.V (I)V
      // 1c8: ldc2_w 2940740536195079722
      // 1cb: lload 4
      // 1cd: lxor
      // 1ce: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: areturn
      // 1d4: ldc2_w 1475829268806602505
      // 1d7: lload 4
      // 1d9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: iload 8
      // 1e1: sipush 10814
      // 1e4: ldc2_w 7606469752198535423
      // 1e7: lload 4
      // 1e9: lxor
      // 1ea: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: aload 7
      // 1f1: ifnonnull 27c
      // 1f4: if_icmpne 26c
      // 1f7: goto 205
      // 1fa: ldc2_w 1475829268806602505
      // 1fd: lload 4
      // 1ff: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: athrow
      // 205: iload 9
      // 207: sipush 15775
      // 20a: ldc2_w 3224549169731997524
      // 20d: lload 4
      // 20f: lxor
      // 210: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: aload 7
      // 217: lload 4
      // 219: lconst_0
      // 21a: lcmp
      // 21b: iflt 285
      // 21e: ifnonnull 27c
      // 221: goto 22f
      // 224: ldc2_w 1475829268806602505
      // 227: lload 4
      // 229: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: athrow
      // 22f: lload 4
      // 231: lconst_0
      // 232: lcmp
      // 233: iflt 271
      // 236: if_icmpne 26c
      // 239: goto 247
      // 23c: ldc2_w 1475829268806602505
      // 23f: lload 4
      // 241: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: aload 3
      // 248: bipush 2
      // 249: invokevirtual com/zelix/wp.V (I)V
      // 24c: sipush 6103
      // 24f: aload 6
      // 251: bipush 0
      // 252: invokevirtual com/zelix/wp.V (I)V
      // 255: ldc2_w 3278194127323481233
      // 258: lload 4
      // 25a: lxor
      // 25b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: areturn
      // 261: ldc2_w 1475829268806602505
      // 264: lload 4
      // 266: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: iload 8
      // 26e: sipush 8253
      // 271: ldc2_w 2613879800699818730
      // 274: lload 4
      // 276: lxor
      // 277: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: lload 4
      // 27e: lconst_0
      // 27f: lcmp
      // 280: ifle 2b7
      // 283: aload 7
      // 285: ifnonnull 2b7
      // 288: if_icmpne 2df
      // 28b: goto 299
      // 28e: ldc2_w 1475829268806602505
      // 291: lload 4
      // 293: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: athrow
      // 299: iload 9
      // 29b: sipush 10814
      // 29e: ldc2_w 7606469752198535423
      // 2a1: lload 4
      // 2a3: lxor
      // 2a4: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: goto 2b7
      // 2ac: ldc2_w 1475829268806602505
      // 2af: lload 4
      // 2b1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: athrow
      // 2b7: if_icmpne 2df
      // 2ba: aload 3
      // 2bb: bipush 2
      // 2bc: invokevirtual com/zelix/wp.V (I)V
      // 2bf: sipush 20046
      // 2c2: aload 6
      // 2c4: bipush 1
      // 2c5: invokevirtual com/zelix/wp.V (I)V
      // 2c8: ldc2_w 3974063855821102357
      // 2cb: lload 4
      // 2cd: lxor
      // 2ce: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d3: areturn
      // 2d4: ldc2_w 1475829268806602505
      // 2d7: lload 4
      // 2d9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: athrow
      // 2df: aconst_null
      // 2e0: areturn
   }

   private static boolean h(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/io/InputStream
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 90274538077444
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: ldc2_w -6048400008743165475
      // 025: lload 1
      // 026: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 6
      // 02d: aload 3
      // 02e: ldc2_w -5594371864548115245
      // 031: lload 1
      // 032: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 6
      // 039: ifnonnull 16a
      // 03c: bipush 4
      // 03d: if_icmplt 169
      // 040: goto 04d
      // 043: ldc2_w -5489759700065572702
      // 046: lload 1
      // 047: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: lload 4
      // 04f: aload 3
      // 050: bipush 4
      // 051: bipush 3
      // 052: anewarray 598
      // 055: dup_x1
      // 056: swap
      // 057: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05a: bipush 2
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 1
      // 060: swap
      // 061: aastore
      // 062: dup_x2
      // 063: dup_x2
      // 064: pop
      // 065: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068: bipush 0
      // 069: swap
      // 06a: aastore
      // 06b: ldc2_w -5439625585237375617
      // 06e: lload 1
      // 06f: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: astore 7
      // 076: aload 7
      // 078: bipush 0
      // 079: baload
      // 07a: sipush 10814
      // 07d: ldc2_w 7606542066277793620
      // 080: lload 1
      // 081: lxor
      // 082: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: lload 1
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 0a0
      // 08d: iand
      // 08e: aload 6
      // 090: ifnonnull 168
      // 093: sipush 12642
      // 096: ldc2_w 7578876885004297231
      // 099: lload 1
      // 09a: lxor
      // 09b: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: if_icmpne 167
      // 0a3: goto 0b0
      // 0a6: ldc2_w -5489759700065572702
      // 0a9: lload 1
      // 0aa: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 7
      // 0b2: bipush 1
      // 0b3: baload
      // 0b4: sipush 10814
      // 0b7: ldc2_w 7606542066277793620
      // 0ba: lload 1
      // 0bb: lxor
      // 0bc: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iand
      // 0c2: aload 6
      // 0c4: ifnonnull 168
      // 0c7: goto 0d4
      // 0ca: ldc2_w -5489759700065572702
      // 0cd: lload 1
      // 0ce: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: sipush 12226
      // 0d7: ldc2_w 8332599151259171498
      // 0da: lload 1
      // 0db: lxor
      // 0dc: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: if_icmpne 167
      // 0e4: goto 0f1
      // 0e7: ldc2_w -5489759700065572702
      // 0ea: lload 1
      // 0eb: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 7
      // 0f3: bipush 2
      // 0f4: baload
      // 0f5: sipush 10814
      // 0f8: ldc2_w 7606542066277793620
      // 0fb: lload 1
      // 0fc: lxor
      // 0fd: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: iand
      // 103: aload 6
      // 105: ifnonnull 168
      // 108: goto 115
      // 10b: ldc2_w -5489759700065572702
      // 10e: lload 1
      // 10f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: bipush 3
      // 116: if_icmpne 167
      // 119: goto 126
      // 11c: ldc2_w -5489759700065572702
      // 11f: lload 1
      // 120: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 7
      // 128: bipush 3
      // 129: baload
      // 12a: sipush 10814
      // 12d: ldc2_w 7606542066277793620
      // 130: lload 1
      // 131: lxor
      // 132: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: iand
      // 138: aload 6
      // 13a: ifnonnull 168
      // 13d: goto 14a
      // 140: ldc2_w -5489759700065572702
      // 143: lload 1
      // 144: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: bipush 4
      // 14b: if_icmpne 167
      // 14e: goto 15b
      // 151: ldc2_w -5489759700065572702
      // 154: lload 1
      // 155: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: bipush 1
      // 15c: ireturn
      // 15d: ldc2_w -5489759700065572702
      // 160: lload 1
      // 161: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: bipush 0
      // 168: ireturn
      // 169: bipush 0
      // 16a: ireturn
   }

   public static String U(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 3
      // 01a: pop
      // 01b: getstatic com/zelix/w_.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: ldc2_w -7695278653229573914
      // 024: lload 1
      // 025: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: astore 5
      // 02c: aload 4
      // 02e: aload 3
      // 02f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 032: aload 5
      // 034: ifnonnull 061
      // 037: ifeq 054
      // 03a: goto 047
      // 03d: ldc2_w -8436561200494931559
      // 040: lload 1
      // 041: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: athrow
      // 047: ldc "."
      // 049: areturn
      // 04a: ldc2_w -8436561200494931559
      // 04d: lload 1
      // 04e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: sipush 17016
      // 057: ldc2_w 838782299882810942
      // 05a: lload 1
      // 05b: lxor
      // 05c: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: istore 7
      // 063: aload 4
      // 065: ldc2_w -8636162495080758842
      // 068: lload 1
      // 069: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 071: dup
      // 072: istore 6
      // 074: bipush -1
      // 075: aload 5
      // 077: ifnonnull 0f8
      // 07a: if_icmpgt 0d0
      // 07d: goto 08a
      // 080: ldc2_w -8436561200494931559
      // 083: lload 1
      // 084: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: aload 4
      // 08c: ldc "\\"
      // 08e: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 091: dup
      // 092: istore 6
      // 094: bipush -1
      // 095: aload 5
      // 097: ifnonnull 0f8
      // 09a: if_icmpgt 0d0
      // 09d: goto 0aa
      // 0a0: ldc2_w -8436561200494931559
      // 0a3: lload 1
      // 0a4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 4
      // 0ac: ldc "/"
      // 0ae: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 0b1: dup
      // 0b2: lload 1
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 0c0
      // 0b8: istore 6
      // 0ba: aload 5
      // 0bc: ifnonnull 106
      // 0bf: bipush -1
      // 0c0: if_icmple 104
      // 0c3: goto 0d0
      // 0c6: ldc2_w -8436561200494931559
      // 0c9: lload 1
      // 0ca: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: iload 6
      // 0d2: aload 5
      // 0d4: lload 1
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 108
      // 0da: ifnonnull 106
      // 0dd: goto 0ea
      // 0e0: ldc2_w -8436561200494931559
      // 0e3: lload 1
      // 0e4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: bipush -1
      // 0eb: goto 0f8
      // 0ee: ldc2_w -8436561200494931559
      // 0f1: lload 1
      // 0f2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: if_icmple 104
      // 0fb: aload 4
      // 0fd: iload 6
      // 0ff: invokevirtual java/lang/String.charAt (I)C
      // 102: istore 7
      // 104: iload 7
      // 106: aload 5
      // 108: ifnonnull 1c0
      // 10b: ifne 1b8
      // 10e: goto 11b
      // 111: ldc2_w -8436561200494931559
      // 114: lload 1
      // 115: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 3
      // 11c: ldc2_w -8636162495080758842
      // 11f: lload 1
      // 120: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 128: dup
      // 129: istore 6
      // 12b: bipush -1
      // 12c: aload 5
      // 12e: ifnonnull 1ad
      // 131: if_icmpgt 185
      // 134: goto 141
      // 137: ldc2_w -8436561200494931559
      // 13a: lload 1
      // 13b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 3
      // 142: ldc "\\"
      // 144: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 147: dup
      // 148: istore 6
      // 14a: bipush -1
      // 14b: aload 5
      // 14d: ifnonnull 1ad
      // 150: if_icmpgt 185
      // 153: goto 160
      // 156: ldc2_w -8436561200494931559
      // 159: lload 1
      // 15a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 3
      // 161: ldc "/"
      // 163: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 166: dup
      // 167: lload 1
      // 168: lconst_0
      // 169: lcmp
      // 16a: ifle 175
      // 16d: istore 6
      // 16f: aload 5
      // 171: ifnonnull 1c0
      // 174: bipush -1
      // 175: if_icmple 1b8
      // 178: goto 185
      // 17b: ldc2_w -8436561200494931559
      // 17e: lload 1
      // 17f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: iload 6
      // 187: aload 5
      // 189: lload 1
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: ifle 1c2
      // 18f: ifnonnull 1c0
      // 192: goto 19f
      // 195: ldc2_w -8436561200494931559
      // 198: lload 1
      // 199: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: bipush -1
      // 1a0: goto 1ad
      // 1a3: ldc2_w -8436561200494931559
      // 1a6: lload 1
      // 1a7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: if_icmple 1b8
      // 1b0: aload 3
      // 1b1: iload 6
      // 1b3: invokevirtual java/lang/String.charAt (I)C
      // 1b6: istore 7
      // 1b8: aload 4
      // 1ba: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1bd: invokevirtual java/lang/String.length ()I
      // 1c0: aload 5
      // 1c2: ifnonnull 212
      // 1c5: ifne 210
      // 1c8: goto 1d5
      // 1cb: ldc2_w -8436561200494931559
      // 1ce: lload 1
      // 1cf: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: aload 3
      // 1d6: aload 5
      // 1d8: ifnonnull 20f
      // 1db: goto 1e8
      // 1de: ldc2_w -8436561200494931559
      // 1e1: lload 1
      // 1e2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: bipush 0
      // 1e9: invokevirtual java/lang/String.charAt (I)C
      // 1ec: iload 7
      // 1ee: if_icmpne 20e
      // 1f1: goto 1fe
      // 1f4: ldc2_w -8436561200494931559
      // 1f7: lload 1
      // 1f8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: athrow
      // 1fe: aload 3
      // 1ff: bipush 1
      // 200: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 203: areturn
      // 204: ldc2_w -8436561200494931559
      // 207: lload 1
      // 208: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: aload 3
      // 20f: areturn
      // 210: iload 7
      // 212: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 215: astore 8
      // 217: new java/util/StringTokenizer
      // 21a: dup
      // 21b: aload 4
      // 21d: aload 8
      // 21f: bipush 1
      // 220: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 223: astore 9
      // 225: new java/util/StringTokenizer
      // 228: dup
      // 229: aload 3
      // 22a: aload 8
      // 22c: bipush 1
      // 22d: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 230: astore 10
      // 232: aload 9
      // 234: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 237: istore 11
      // 239: aload 10
      // 23b: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 23e: istore 12
      // 240: new java/lang/StringBuilder
      // 243: dup
      // 244: invokespecial java/lang/StringBuilder.<init> ()V
      // 247: astore 13
      // 249: bipush 0
      // 24a: istore 14
      // 24c: iload 14
      // 24e: iload 11
      // 250: if_icmpge 2ad
      // 253: iload 14
      // 255: iload 12
      // 257: if_icmpge 2ad
      // 25a: aload 9
      // 25c: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 25f: astore 15
      // 261: aload 10
      // 263: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 266: astore 16
      // 268: aload 15
      // 26a: aload 5
      // 26c: lload 1
      // 26d: lconst_0
      // 26e: lcmp
      // 26f: ifle 277
      // 272: ifnonnull 2b2
      // 275: aload 16
      // 277: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27a: ifeq 2ad
      // 27d: goto 28a
      // 280: ldc2_w -8436561200494931559
      // 283: lload 1
      // 284: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: athrow
      // 28a: aload 13
      // 28c: aload 15
      // 28e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 291: pop
      // 292: iinc 14 1
      // 295: aload 5
      // 297: ifnull 24c
      // 29a: lload 1
      // 29b: lconst_0
      // 29c: lcmp
      // 29d: iflt 2ad
      // 2a0: goto 2ad
      // 2a3: ldc2_w -8436561200494931559
      // 2a6: lload 1
      // 2a7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: athrow
      // 2ad: aload 13
      // 2af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b2: astore 14
      // 2b4: aload 14
      // 2b6: invokevirtual java/lang/String.length ()I
      // 2b9: ifne 395
      // 2bc: new java/util/StringTokenizer
      // 2bf: dup
      // 2c0: aload 4
      // 2c2: aload 8
      // 2c4: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 2c7: astore 15
      // 2c9: aload 15
      // 2cb: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 2ce: istore 16
      // 2d0: new java/lang/StringBuilder
      // 2d3: dup
      // 2d4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d7: astore 17
      // 2d9: bipush 0
      // 2da: istore 18
      // 2dc: iload 18
      // 2de: iload 16
      // 2e0: if_icmpge 34c
      // 2e3: aload 17
      // 2e5: sipush 22698
      // 2e8: ldc2_w 5748346151243879754
      // 2eb: lload 1
      // 2ec: lxor
      // 2ed: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: pop
      // 2f6: aload 5
      // 2f8: lload 1
      // 2f9: lconst_0
      // 2fa: lcmp
      // 2fb: ifle 349
      // 2fe: ifnonnull 347
      // 301: iload 18
      // 303: lload 1
      // 304: lconst_0
      // 305: lcmp
      // 306: iflt 370
      // 309: aload 5
      // 30b: ifnonnull 370
      // 30e: goto 31b
      // 311: ldc2_w -8436561200494931559
      // 314: lload 1
      // 315: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: athrow
      // 31b: iload 16
      // 31d: bipush 1
      // 31e: isub
      // 31f: if_icmpge 344
      // 322: goto 32f
      // 325: ldc2_w -8436561200494931559
      // 328: lload 1
      // 329: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: athrow
      // 32f: aload 17
      // 331: aload 8
      // 333: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 336: pop
      // 337: goto 344
      // 33a: ldc2_w -8436561200494931559
      // 33d: lload 1
      // 33e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: athrow
      // 344: iinc 18 1
      // 347: aload 5
      // 349: ifnull 2dc
      // 34c: aload 3
      // 34d: lload 1
      // 34e: lconst_0
      // 34f: lcmp
      // 350: iflt 2f8
      // 353: aload 5
      // 355: lload 1
      // 356: lconst_0
      // 357: lcmp
      // 358: ifle 360
      // 35b: ifnonnull 394
      // 35e: aload 8
      // 360: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 363: goto 370
      // 366: ldc2_w -8436561200494931559
      // 369: lload 1
      // 36a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36f: athrow
      // 370: ifne 388
      // 373: aload 17
      // 375: aload 8
      // 377: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37a: pop
      // 37b: goto 388
      // 37e: ldc2_w -8436561200494931559
      // 381: lload 1
      // 382: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: athrow
      // 388: aload 17
      // 38a: aload 3
      // 38b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38e: pop
      // 38f: aload 17
      // 391: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 394: areturn
      // 395: new java/util/StringTokenizer
      // 398: dup
      // 399: aload 14
      // 39b: aload 8
      // 39d: bipush 1
      // 39e: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 3a1: astore 15
      // 3a3: aload 15
      // 3a5: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 3a8: istore 16
      // 3aa: aload 3
      // 3ab: aload 14
      // 3ad: invokevirtual java/lang/String.length ()I
      // 3b0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3b3: astore 17
      // 3b5: new java/lang/StringBuilder
      // 3b8: dup
      // 3b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3bc: astore 18
      // 3be: iload 11
      // 3c0: lload 1
      // 3c1: lconst_0
      // 3c2: lcmp
      // 3c3: iflt 40f
      // 3c6: iload 16
      // 3c8: aload 5
      // 3ca: ifnonnull 40e
      // 3cd: if_icmpne 3fd
      // 3d0: goto 3dd
      // 3d3: ldc2_w -8436561200494931559
      // 3d6: lload 1
      // 3d7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dc: athrow
      // 3dd: aload 18
      // 3df: ldc "."
      // 3e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e4: pop
      // 3e5: aload 5
      // 3e7: lload 1
      // 3e8: lconst_0
      // 3e9: lcmp
      // 3ea: iflt 476
      // 3ed: ifnull 474
      // 3f0: goto 3fd
      // 3f3: ldc2_w -8436561200494931559
      // 3f6: lload 1
      // 3f7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fc: athrow
      // 3fd: iload 11
      // 3ff: iload 16
      // 401: goto 40e
      // 404: ldc2_w -8436561200494931559
      // 407: lload 1
      // 408: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40d: athrow
      // 40e: isub
      // 40f: istore 19
      // 411: aload 18
      // 413: sipush 4583
      // 416: ldc2_w 4637818692176567338
      // 419: lload 1
      // 41a: lxor
      // 41b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 423: pop
      // 424: iinc 19 -1
      // 427: bipush 0
      // 428: istore 20
      // 42a: iload 20
      // 42c: iload 19
      // 42e: bipush 2
      // 42f: idiv
      // 430: if_icmpge 474
      // 433: aload 18
      // 435: aload 8
      // 437: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 43a: pop
      // 43b: aload 18
      // 43d: sipush 4583
      // 440: ldc2_w 4637818692176567338
      // 443: lload 1
      // 444: lxor
      // 445: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44d: lload 1
      // 44e: lconst_0
      // 44f: lcmp
      // 450: iflt 5da
      // 453: pop
      // 454: iinc 20 1
      // 457: aload 5
      // 459: ifnonnull 5d8
      // 45c: aload 5
      // 45e: ifnull 42a
      // 461: lload 1
      // 462: lconst_0
      // 463: lcmp
      // 464: ifle 457
      // 467: goto 474
      // 46a: ldc2_w -8436561200494931559
      // 46d: lload 1
      // 46e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 473: athrow
      // 474: aload 17
      // 476: aload 5
      // 478: ifnonnull 5dd
      // 47b: invokevirtual java/lang/String.length ()I
      // 47e: ifle 5d8
      // 481: goto 48e
      // 484: ldc2_w -8436561200494931559
      // 487: lload 1
      // 488: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48d: athrow
      // 48e: aload 18
      // 490: invokevirtual java/lang/StringBuilder.length ()I
      // 493: bipush 1
      // 494: aload 5
      // 496: lload 1
      // 497: lconst_0
      // 498: lcmp
      // 499: iflt 554
      // 49c: ifnonnull 54c
      // 49f: goto 4ac
      // 4a2: ldc2_w -8436561200494931559
      // 4a5: lload 1
      // 4a6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ab: athrow
      // 4ac: if_icmpne 52b
      // 4af: goto 4bc
      // 4b2: ldc2_w -8436561200494931559
      // 4b5: lload 1
      // 4b6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bb: athrow
      // 4bc: aload 18
      // 4be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c1: ldc "."
      // 4c3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4c6: aload 5
      // 4c8: ifnonnull 54a
      // 4cb: goto 4d8
      // 4ce: ldc2_w -8436561200494931559
      // 4d1: lload 1
      // 4d2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d7: athrow
      // 4d8: lload 1
      // 4d9: lconst_0
      // 4da: lcmp
      // 4db: iflt 53d
      // 4de: ifeq 52b
      // 4e1: goto 4ee
      // 4e4: ldc2_w -8436561200494931559
      // 4e7: lload 1
      // 4e8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ed: athrow
      // 4ee: aload 18
      // 4f0: aload 5
      // 4f2: ifnonnull 5d7
      // 4f5: goto 502
      // 4f8: ldc2_w -8436561200494931559
      // 4fb: lload 1
      // 4fc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: athrow
      // 502: bipush 0
      // 503: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 506: aload 17
      // 508: bipush 0
      // 509: invokevirtual java/lang/String.charAt (I)C
      // 50c: iload 7
      // 50e: if_icmpne 5d0
      // 511: goto 51e
      // 514: ldc2_w -8436561200494931559
      // 517: lload 1
      // 518: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51d: athrow
      // 51e: aload 17
      // 520: bipush 1
      // 521: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 524: astore 17
      // 526: aload 5
      // 528: ifnull 5d0
      // 52b: aload 18
      // 52d: aload 18
      // 52f: invokevirtual java/lang/StringBuilder.length ()I
      // 532: bipush 1
      // 533: isub
      // 534: ldc2_w -8406031329141882065
      // 537: lload 1
      // 538: invokedynamic n (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53d: goto 54a
      // 540: ldc2_w -8436561200494931559
      // 543: lload 1
      // 544: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 549: athrow
      // 54a: iload 7
      // 54c: lload 1
      // 54d: lconst_0
      // 54e: lcmp
      // 54f: ifle 5b8
      // 552: aload 5
      // 554: ifnonnull 5b8
      // 557: if_icmpne 5a3
      // 55a: goto 567
      // 55d: ldc2_w -8436561200494931559
      // 560: lload 1
      // 561: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 566: athrow
      // 567: aload 17
      // 569: bipush 0
      // 56a: invokevirtual java/lang/String.charAt (I)C
      // 56d: iload 7
      // 56f: if_icmpne 5d0
      // 572: goto 57f
      // 575: ldc2_w -8436561200494931559
      // 578: lload 1
      // 579: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57e: athrow
      // 57f: aload 18
      // 581: lload 1
      // 582: lconst_0
      // 583: lcmp
      // 584: iflt 5d2
      // 587: aload 18
      // 589: invokevirtual java/lang/StringBuilder.length ()I
      // 58c: bipush 1
      // 58d: isub
      // 58e: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 591: aload 5
      // 593: ifnull 5d0
      // 596: goto 5a3
      // 599: ldc2_w -8436561200494931559
      // 59c: lload 1
      // 59d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a2: athrow
      // 5a3: aload 17
      // 5a5: bipush 0
      // 5a6: invokevirtual java/lang/String.charAt (I)C
      // 5a9: iload 7
      // 5ab: goto 5b8
      // 5ae: ldc2_w -8436561200494931559
      // 5b1: lload 1
      // 5b2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b7: athrow
      // 5b8: if_icmpeq 5d0
      // 5bb: aload 18
      // 5bd: aload 8
      // 5bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c2: pop
      // 5c3: goto 5d0
      // 5c6: ldc2_w -8436561200494931559
      // 5c9: lload 1
      // 5ca: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cf: athrow
      // 5d0: aload 18
      // 5d2: aload 17
      // 5d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d7: pop
      // 5d8: aload 18
      // 5da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5dd: areturn
   }

   public static String C(Object[] var0) {
      File var4 = (File)var0[0];
      String var3 = (String)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 11055532165735L;
      FileInputStream var7 = new FileInputStream(var4);
      long var10002 = (long)(x44.a<"k">(var7, 8451738925336673221L, var1) + b<"k">(5010, 7615777225408561635L ^ var1));
      Object[] var10006 = new Object[]{null, null, null, null, var5};
      var10006[2] = var10002;
      var10006[1] = var3;
      var10006[0] = var7;
      return x44.a<"s">(var10006, 7500362311192073835L, var1);
   }

   public static List i(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/io/File
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/pg
      // 021: astore 1
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Boolean
      // 028: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02b: istore 6
      // 02d: pop
      // 02e: getstatic com/zelix/w_.a J
      // 031: lload 2
      // 032: lxor
      // 033: lstore 2
      // 034: lload 2
      // 035: dup2
      // 036: ldc2_w 11781987915576
      // 039: lxor
      // 03a: lstore 7
      // 03c: dup2
      // 03d: ldc2_w 67392129614273
      // 040: lxor
      // 041: lstore 9
      // 043: dup2
      // 044: ldc2_w 70007575759014
      // 047: lxor
      // 048: lstore 11
      // 04a: dup2
      // 04b: ldc2_w 77283007556955
      // 04e: lxor
      // 04f: lstore 13
      // 051: dup2
      // 052: ldc2_w 53021153550138
      // 055: lxor
      // 056: lstore 15
      // 058: dup2
      // 059: ldc2_w 20167141882182
      // 05c: lxor
      // 05d: lstore 17
      // 05f: dup2
      // 060: ldc2_w 132136148394840
      // 063: lxor
      // 064: lstore 19
      // 066: dup2
      // 067: ldc2_w 67873265802592
      // 06a: lxor
      // 06b: lstore 21
      // 06d: pop2
      // 06e: ldc2_w -6743924102715543622
      // 071: lload 2
      // 072: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 1
      // 078: lload 19
      // 07a: bipush 1
      // 07b: anewarray 598
      // 07e: dup_x2
      // 07f: dup_x2
      // 080: pop
      // 081: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 084: bipush 0
      // 085: swap
      // 086: aastore
      // 087: ldc2_w -4984448162987335823
      // 08a: lload 2
      // 08b: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: pop
      // 091: astore 23
      // 093: new java/util/Vector
      // 096: dup
      // 097: invokespecial java/util/Vector.<init> ()V
      // 09a: astore 24
      // 09c: aload 23
      // 09e: ifnonnull 103
      // 0a1: aload 5
      // 0a3: ifnull 0e3
      // 0a6: goto 0b3
      // 0a9: ldc2_w -4776220936799836475
      // 0ac: lload 2
      // 0ad: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 5
      // 0b5: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b8: aload 23
      // 0ba: ifnonnull 10b
      // 0bd: goto 0ca
      // 0c0: ldc2_w -4776220936799836475
      // 0c3: lload 2
      // 0c4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: lload 2
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: ifle 108
      // 0d0: invokevirtual java/lang/String.length ()I
      // 0d3: ifne 106
      // 0d6: goto 0e3
      // 0d9: ldc2_w -4776220936799836475
      // 0dc: lload 2
      // 0dd: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 1
      // 0e4: lload 15
      // 0e6: sipush 7851
      // 0e9: ldc2_w 2761309548151333909
      // 0ec: lload 2
      // 0ed: lxor
      // 0ee: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 0f6: goto 103
      // 0f9: ldc2_w -4776220936799836475
      // 0fc: lload 2
      // 0fd: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: aload 24
      // 105: areturn
      // 106: aload 5
      // 108: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 10b: astore 25
      // 10d: aload 25
      // 10f: lload 7
      // 111: bipush 2
      // 112: anewarray 598
      // 115: dup_x2
      // 116: dup_x2
      // 117: pop
      // 118: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11b: bipush 1
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: ldc2_w -4615570793873525182
      // 126: lload 2
      // 127: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: astore 25
      // 12e: aload 25
      // 130: aload 4
      // 132: lload 11
      // 134: bipush 3
      // 135: anewarray 598
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 2
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: bipush 1
      // 144: swap
      // 145: aastore
      // 146: dup_x1
      // 147: swap
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w -6721701319199950681
      // 14e: lload 2
      // 14f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: astore 25
      // 156: lload 13
      // 158: aload 25
      // 15a: bipush 2
      // 15b: anewarray 598
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 1
      // 161: swap
      // 162: aastore
      // 163: dup_x2
      // 164: dup_x2
      // 165: pop
      // 166: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 169: bipush 0
      // 16a: swap
      // 16b: aastore
      // 16c: ldc2_w -5019958296140009669
      // 16f: lload 2
      // 170: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: aload 23
      // 177: ifnonnull 1a5
      // 17a: ifeq 534
      // 17d: goto 18a
      // 180: ldc2_w -4776220936799836475
      // 183: lload 2
      // 184: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 25
      // 18c: ldc2_w -4649390591799314790
      // 18f: lload 2
      // 190: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 198: goto 1a5
      // 19b: ldc2_w -4776220936799836475
      // 19e: lload 2
      // 19f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: istore 28
      // 1a7: iload 28
      // 1a9: ifle 326
      // 1ac: aload 25
      // 1ae: iload 28
      // 1b0: bipush 1
      // 1b1: iadd
      // 1b2: aload 25
      // 1b4: invokevirtual java/lang/String.length ()I
      // 1b7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1ba: astore 27
      // 1bc: aload 25
      // 1be: bipush 0
      // 1bf: iload 28
      // 1c1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1c4: astore 29
      // 1c6: iload 6
      // 1c8: aload 23
      // 1ca: ifnonnull 2f5
      // 1cd: ifeq 2d6
      // 1d0: goto 1dd
      // 1d3: ldc2_w -4776220936799836475
      // 1d6: lload 2
      // 1d7: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: lload 13
      // 1df: aload 29
      // 1e1: bipush 2
      // 1e2: anewarray 598
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: bipush 1
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x2
      // 1eb: dup_x2
      // 1ec: pop
      // 1ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f0: bipush 0
      // 1f1: swap
      // 1f2: aastore
      // 1f3: ldc2_w -5019958296140009669
      // 1f6: lload 2
      // 1f7: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: aload 23
      // 1fe: ifnonnull 2f5
      // 201: goto 20e
      // 204: ldc2_w -4776220936799836475
      // 207: lload 2
      // 208: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: ifeq 2d6
      // 211: goto 21e
      // 214: ldc2_w -4776220936799836475
      // 217: lload 2
      // 218: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: aload 29
      // 220: ldc "*"
      // 222: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 225: istore 30
      // 227: aload 29
      // 229: ldc2_w -4649390591799314790
      // 22c: lload 2
      // 22d: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 235: istore 31
      // 237: iload 30
      // 239: aload 23
      // 23b: ifnonnull 292
      // 23e: iload 31
      // 240: if_icmpge 289
      // 243: goto 250
      // 246: ldc2_w -4776220936799836475
      // 249: lload 2
      // 24a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: athrow
      // 250: aload 1
      // 251: new java/lang/StringBuilder
      // 254: dup
      // 255: invokespecial java/lang/StringBuilder.<init> ()V
      // 258: sipush 12564
      // 25b: ldc2_w 1053636492624481183
      // 25e: lload 2
      // 25f: lxor
      // 260: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 268: aload 29
      // 26a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26d: ldc "'"
      // 26f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 272: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 275: lload 15
      // 277: dup2_x1
      // 278: pop2
      // 279: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 27c: aload 24
      // 27e: areturn
      // 27f: ldc2_w -4776220936799836475
      // 282: lload 2
      // 283: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: athrow
      // 289: ldc2_w -6544891087940851538
      // 28c: lload 2
      // 28d: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: ifne 2a2
      // 295: aload 27
      // 297: ldc2_w -5106129251381427048
      // 29a: lload 2
      // 29b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: astore 27
      // 2a2: aload 29
      // 2a4: aload 27
      // 2a6: lload 9
      // 2a8: aload 4
      // 2aa: aload 1
      // 2ab: bipush 5
      // 2ac: anewarray 598
      // 2af: dup_x1
      // 2b0: swap
      // 2b1: bipush 4
      // 2b2: swap
      // 2b3: aastore
      // 2b4: dup_x1
      // 2b5: swap
      // 2b6: bipush 3
      // 2b7: swap
      // 2b8: aastore
      // 2b9: dup_x2
      // 2ba: dup_x2
      // 2bb: pop
      // 2bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2bf: bipush 2
      // 2c0: swap
      // 2c1: aastore
      // 2c2: dup_x1
      // 2c3: swap
      // 2c4: bipush 1
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: bipush 0
      // 2ca: swap
      // 2cb: aastore
      // 2cc: ldc2_w -5095255775291930858
      // 2cf: lload 2
      // 2d0: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: areturn
      // 2d6: aload 29
      // 2d8: lload 17
      // 2da: bipush 2
      // 2db: anewarray 598
      // 2de: dup_x2
      // 2df: dup_x2
      // 2e0: pop
      // 2e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e4: bipush 1
      // 2e5: swap
      // 2e6: aastore
      // 2e7: dup_x1
      // 2e8: swap
      // 2e9: bipush 0
      // 2ea: swap
      // 2eb: aastore
      // 2ec: ldc2_w -6843019658793989734
      // 2ef: lload 2
      // 2f0: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: ifeq 310
      // 2f8: new java/io/File
      // 2fb: dup
      // 2fc: aload 4
      // 2fe: aload 29
      // 300: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 303: astore 26
      // 305: aload 23
      // 307: lload 2
      // 308: lconst_0
      // 309: lcmp
      // 30a: ifle 31d
      // 30d: ifnull 31b
      // 310: new java/io/File
      // 313: dup
      // 314: aload 29
      // 316: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 319: astore 26
      // 31b: aload 23
      // 31d: lload 2
      // 31e: lconst_0
      // 31f: lcmp
      // 320: ifle 32c
      // 323: ifnull 32e
      // 326: aload 4
      // 328: astore 26
      // 32a: aload 25
      // 32c: astore 27
      // 32e: ldc2_w -6544891087940851538
      // 331: lload 2
      // 332: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 337: aload 23
      // 339: lload 2
      // 33a: lconst_0
      // 33b: lcmp
      // 33c: ifle 36c
      // 33f: ifnonnull 36a
      // 342: ifne 35f
      // 345: goto 352
      // 348: ldc2_w -4776220936799836475
      // 34b: lload 2
      // 34c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: athrow
      // 352: aload 27
      // 354: ldc2_w -5106129251381427048
      // 357: lload 2
      // 358: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35d: astore 27
      // 35f: aload 26
      // 361: ldc2_w -6529816688077494656
      // 364: lload 2
      // 365: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: aload 23
      // 36c: ifnonnull 3a9
      // 36f: ifeq 4e3
      // 372: goto 37f
      // 375: ldc2_w -4776220936799836475
      // 378: lload 2
      // 379: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: athrow
      // 37f: aload 26
      // 381: aload 23
      // 383: ifnonnull 3ae
      // 386: goto 393
      // 389: ldc2_w -4776220936799836475
      // 38c: lload 2
      // 38d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: athrow
      // 393: ldc2_w -6570689528731405780
      // 396: lload 2
      // 397: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39c: goto 3a9
      // 39f: ldc2_w -4776220936799836475
      // 3a2: lload 2
      // 3a3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: athrow
      // 3a9: ifeq 4e3
      // 3ac: aload 26
      // 3ae: ldc2_w -4878916107110964905
      // 3b1: lload 2
      // 3b2: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b7: astore 29
      // 3b9: lload 2
      // 3ba: lconst_0
      // 3bb: lcmp
      // 3bc: ifle 4cb
      // 3bf: aload 29
      // 3c1: ifnull 482
      // 3c4: bipush 0
      // 3c5: istore 30
      // 3c7: iload 30
      // 3c9: aload 29
      // 3cb: arraylength
      // 3cc: if_icmpge 471
      // 3cf: aload 29
      // 3d1: iload 30
      // 3d3: aaload
      // 3d4: ldc2_w -6559969386805507733
      // 3d7: lload 2
      // 3d8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: astore 31
      // 3df: aload 23
      // 3e1: lload 2
      // 3e2: lconst_0
      // 3e3: lcmp
      // 3e4: ifle 4da
      // 3e7: ifnonnull 4d8
      // 3ea: ldc2_w -6544891087940851538
      // 3ed: lload 2
      // 3ee: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: aload 23
      // 3f5: lload 2
      // 3f6: lconst_0
      // 3f7: lcmp
      // 3f8: ifle 433
      // 3fb: ifnonnull 431
      // 3fe: goto 40b
      // 401: ldc2_w -4776220936799836475
      // 404: lload 2
      // 405: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40a: athrow
      // 40b: ifne 428
      // 40e: goto 41b
      // 411: ldc2_w -4776220936799836475
      // 414: lload 2
      // 415: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: athrow
      // 41b: aload 31
      // 41d: ldc2_w -5106129251381427048
      // 420: lload 2
      // 421: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 426: astore 31
      // 428: lload 21
      // 42a: aload 31
      // 42c: aload 27
      // 42e: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // 431: aload 23
      // 433: ifnonnull 468
      // 436: ifeq 469
      // 439: goto 446
      // 43c: ldc2_w -4776220936799836475
      // 43f: lload 2
      // 440: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 445: athrow
      // 446: aload 24
      // 448: aload 29
      // 44a: iload 30
      // 44c: aaload
      // 44d: ldc2_w -4775139249370565192
      // 450: lload 2
      // 451: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 45b: goto 468
      // 45e: ldc2_w -4776220936799836475
      // 461: lload 2
      // 462: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 467: athrow
      // 468: pop
      // 469: iinc 30 1
      // 46c: aload 23
      // 46e: ifnull 3c7
      // 471: lload 2
      // 472: lconst_0
      // 473: lcmp
      // 474: ifle 4cb
      // 477: aload 23
      // 479: lload 2
      // 47a: lconst_0
      // 47b: lcmp
      // 47c: ifle 3dd
      // 47f: ifnull 4d8
      // 482: aload 1
      // 483: new java/lang/StringBuilder
      // 486: dup
      // 487: invokespecial java/lang/StringBuilder.<init> ()V
      // 48a: sipush 26440
      // 48d: ldc2_w 2347388679375363535
      // 490: lload 2
      // 491: lxor
      // 492: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 497: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49a: aload 26
      // 49c: ldc2_w -4775139249370565192
      // 49f: lload 2
      // 4a0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a8: bipush 53
      // 4aa: ldc2_w 7612821031089306299
      // 4ad: lload 2
      // 4ae: lxor
      // 4af: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b7: aload 25
      // 4b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bc: ldc "'"
      // 4be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c4: lload 15
      // 4c6: dup2_x1
      // 4c7: pop2
      // 4c8: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 4cb: goto 4d8
      // 4ce: ldc2_w -4776220936799836475
      // 4d1: lload 2
      // 4d2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d7: athrow
      // 4d8: aload 23
      // 4da: lload 2
      // 4db: lconst_0
      // 4dc: lcmp
      // 4dd: iflt 531
      // 4e0: ifnull 52f
      // 4e3: aload 1
      // 4e4: new java/lang/StringBuilder
      // 4e7: dup
      // 4e8: invokespecial java/lang/StringBuilder.<init> ()V
      // 4eb: ldc "'"
      // 4ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f0: aload 26
      // 4f2: ldc2_w -4775139249370565192
      // 4f5: lload 2
      // 4f6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4fe: sipush 22731
      // 501: ldc2_w 932934134822281855
      // 504: lload 2
      // 505: lxor
      // 506: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50e: aload 25
      // 510: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 513: ldc "'"
      // 515: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 518: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 51b: lload 15
      // 51d: dup2_x1
      // 51e: pop2
      // 51f: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 522: goto 52f
      // 525: ldc2_w -4776220936799836475
      // 528: lload 2
      // 529: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52e: athrow
      // 52f: aload 23
      // 531: ifnull 552
      // 534: new java/io/File
      // 537: dup
      // 538: aload 25
      // 53a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 53d: astore 26
      // 53f: aload 24
      // 541: aload 26
      // 543: ldc2_w -4775139249370565192
      // 546: lload 2
      // 547: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 551: pop
      // 552: aload 24
      // 554: areturn
   }

   public static boolean c(Object[] var0) {
      ZipFile var1 = (ZipFile)var0[0];
      ZipEntry var2 = (ZipEntry)var0[1];
      long var3 = (Long)var0[2];
      var3 = a ^ var3;
      long var5 = var3 ^ 103031602351405L;
      String var10000 = x44.a<"t">(3226497921658806548L, var3);
      InputStream var8 = null;
      String var7 = var10000;

      boolean var9;
      try {
         var8 = x44.a<"l">(var1, var2, 3511189864798550127L, var3);
         var9 = x44.a<"t">(new Object[]{var5, var8}, 3261573321642882926L, var3);
      } finally {
         try {
            label71: {
               label70: {
                  try {
                     var25 = var8;
                     if (var7 != null) {
                        break label70;
                     }

                     if (var8 == null) {
                        break label71;
                     }
                  } catch (g3 var20) {
                     throw x44.a<"t">(var20, 3682082320802687083L, var3);
                  }

                  var25 = var8;
               }

               x44.a<"l">(var25, 3780373527665429103L, var3);
            }
         } catch (g3 var21) {
            throw var21;
         } catch (Exception var22) {
         }
      }

      return var9;
   }

   public static String q(Object[] var0) {
      long var2 = (Long)var0[0];
      byte[] var1 = (byte[])var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 90446757710177L;
      return x44.a<"s">(new Object[]{var1, new wp(), new wp(), var4, new wp()}, -2939316585577665658L, var2);
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 7202802573095781927
      // 003: ldc2_w 281063644335770730
      // 006: invokestatic java/lang/invoke/MethodHandles.lookup ()Ljava/lang/invoke/MethodHandles$Lookup;
      // 009: invokevirtual java/lang/invoke/MethodHandles$Lookup.lookupClass ()Ljava/lang/Class;
      // 00c: invokestatic com/zelix/ess.a (JJLjava/lang/Object;)Lcom/zelix/b44;
      // 00f: ldc2_w 122670191150095
      // 012: invokeinterface com/zelix/b44.a (J)J 3
      // 017: putstatic com/zelix/w_.a J
      // 01a: getstatic com/zelix/w_.a J
      // 01d: ldc2_w 116962330252493
      // 020: lxor
      // 021: lstore 31
      // 023: new java/util/HashMap
      // 026: dup
      // 027: bipush 13
      // 029: invokespecial java/util/HashMap.<init> (I)V
      // 02c: putstatic com/zelix/w_.e Ljava/util/Map;
      // 02f: ldc "DES/CBC/PKCS5Padding"
      // 031: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 034: dup
      // 035: astore 22
      // 037: bipush 2
      // 038: ldc "DES"
      // 03a: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 03d: bipush 8
      // 03f: newarray 8
      // 041: dup
      // 042: bipush 0
      // 043: lload 31
      // 045: bipush 56
      // 047: lushr
      // 048: l2i
      // 049: i2b
      // 04a: bastore
      // 04b: bipush 1
      // 04c: istore 23
      // 04e: iload 23
      // 050: bipush 8
      // 052: if_icmpge 06c
      // 055: dup
      // 056: iload 23
      // 058: lload 31
      // 05a: iload 23
      // 05c: bipush 8
      // 05e: imul
      // 05f: lshl
      // 060: bipush 56
      // 062: lushr
      // 063: l2i
      // 064: i2b
      // 065: bastore
      // 066: iinc 23 1
      // 069: goto 04e
      // 06c: new javax/crypto/spec/DESKeySpec
      // 06f: dup_x1
      // 070: swap
      // 071: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 074: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 077: new javax/crypto/spec/IvParameterSpec
      // 07a: dup
      // 07b: bipush 8
      // 07d: newarray 8
      // 07f: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 082: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 085: bipush 56
      // 087: anewarray 23
      // 08a: astore 29
      // 08c: bipush 0
      // 08d: istore 27
      // 08f: ldc "Ñ»«djç0¨Í»\t\u0086£\u000bÔ;\u0010\u0004Ú_åsy>.^\u0006=ÅWß³á\u0010àWe\b\u00896B\u0080{åµZY\u0017N± ,³\u009d$\u001f\u0016b\u0005\u0013)± ¨þóü\u0089uÂ\rHâÑµà\u0017\u0097\u0083¿úhâ\u0010e12§T}\u0019NÍXbÜ\u001a\u0010`Q(ì'°\u0014¼\u0086:.L!ï\u008d\u00947\\}?\u0081 \u0096!Þ\n¾¸´\u0019\u0016á\\\u0082Òn\u008a\u009b´\u0017\u008dl\u0090\u0010\u009f¯\u0093\u0003\u0016\u0096{\u0096q\u000fs\t±Ã=EH\u0084W\u000f\u001b`Q=Í\u001c?´\u009cÁ¹Û\u0005\u009c\u009em>h®¶\u0097'MóþWñÚ\u009e\u0083Ü\u001ap\u008eW\u0081 íÀ\u0010\b;U\n/OäòO\u009b~a\u0085ð\u007f\u0001Ó~ø\u009d¸\u0093òúGü1à\u0098\u0010*\thÉ¥P\"ISi#ìÄzÔI\u0010©j\u0094GÖZÂ88\u0096\u0094Fé¾\u001f¹\u0010ÒÊ2\u001a9æøtgO\u008cðx[æÇ\u0010¡\u009bu\u0016] f>\u009ciH\u008dµ»[ë \bL)\u0019\u0013\u0007\u001c£³¤C½\u008c¼\u009c\u0085\u0005àËñÌî×6\u007fs\u0085Õc\u0014cD\u0010×\u0091Âöô&¢E\u0084¼i ïá\u009eõ mª8Ó¼ôé\u0091\u0093\u008a¿\u0089wðû\u0090ä\nÄ8¡ôñ\u0007\r þ\u009f\u009dÁªÒ\u0010N\t´®\u009d&W^yxC\u001d\u0007°+ÌH ª\u0007±\u0019\u0089ë:f¾|¸rÿg\u009aQ ²\u0014\n,,8ötk\u0089\u008aö\u0001ð\u0086\"<Ñ\u001d(slí/- Ý\u001e\u001dõB¥ªH\u0004÷\u008bð²:\u00ad\u008e3s=ø\u0002t;\u0082)±Ò\u009c\u0018\u0099ß¥ß\\äê\u008cwc\u00adEsy[Ë=É¥;l\u000fú®\u0010\u0086{,`]$¸\u0016ç¹ÃW0>£pXqÃBE:ú\u0089l\n(\u0094Ê«Ý\u0016\u0090·×Ó\u0011\u009ck\u0010kÂ7\u0094\u0016HÓG_Q\u009cøW£1<òåZX\u007fuÐ8Ò\u00921Ow¦5b\u0082ÿ´Y\"(èÄ0/¦\u0091È\u008cÀ¸\u0001ÞïÇ¯ ¥\u0014®\u000e\u0007£\u0085\u000enMû\u0010pé¿ø\t:`\r_j'í\u0017ç¯\u008a\u0010ï³«Ë@\u009cÏd<\u009b\tz\u0083ôo\u009b\u0010ð$Õ \u0005\u001a¥_\\È\r\u001bÙûÍ\u0010\u0010\u0005wm\u0005Å\u001cÂÍ\u009af\u007fû]îÇ£\u0010~NLÓó\u000eü\u0001IÞ·qsf¾Ê\u0010]h\né¯\u0091ö)¨Ã!Zbük{(\u008dò!\u00adýX\"\u0095\u0005\u0016_F\u001a·\r)<ãíwP»ÝVn\fÇi53(\u0099\u009c\u009e\u00104e\u0090·Ù\u0010]Ä\u0013\bc\b\u001cåÖ\u000fmAW\u0003Ù\u0087(BµávL\u00040óK\u001aØbÑ1éX\u001d\u0003å\u008d°gJ\u001c\u009eÌ)\u009f¯\"\u0016\u0014©÷\u0018ËÉË\\ÏHÂy\u0011\u00897ÃqQ\u0087\u0005©Ê÷ogµ\n\u001eh¶\u00047¢GFAÞ\u0098\u0085(ü\u0093ù\u00101·{ \u0086\u008fpJf\u008c{ð\u007f\u0094¡ÀºOé9/i2O\f\u0092a\n\u009a£z[ÔyW¹,ë@\u0090ÍåÒ\u008c\u009c}´²4Ä#4±ß\u008f:¼ÇÅEÈ2\u0084'\u0083:ð\u0093V\u0013#\u0005\u009eÌÄmkØQµà\u00adþ\u008a°\u008a\tE\u009f\u0097Ê\u0096Coï\u0099½ÒøÚ\u001aó·\u0010>\u0004¢ä\u0004,4Êô\u0082\u00adL2\u0015\u009eÅ\u0010;l\u0089\u001aw½¹\u0098\u001f²®ÕêiÈÜ (ä¨&ÒT.PhèÂ;\u0003lîB\u0012ã\u0011Ïå\"\u000e\u0016Q½ùmÂP[ù\u0010\"\u009aú¦b\u0092\\\u0096\u008fµ\u0093éÆ®ûÌ0¶@Òº\u00987¤\u0019\u001an\u009dõ#ÐË´Àû2L¦+\u009cî\u0002\u008eHy,AðövXv¾2\u008c¾0r\u009b¦ÔB\u001aH\u0087\u0010gN»\u0005Ì\u0012\fã\u0098Yc3â\u008a!\u0019\u0010\u000bT^e\u0091\u0082\u0000Ú\u0016ã\u007f#1Yu\u0013\u0010<`ÛQ»>a\u001cé¯ÉÚmiPf\u0010§gäZ8Õ\u009bµ°«'\u007f_\u008b\r\\\u0010[R¾Å/ä\u009e5¬¨\u009cD}\u0090P0\u0018ë\u0002û1MÞ[£\u0081Îª%öIcáçp¢\u0099ø\u0019\u000f<\u0010K23§\u0005Ë\u001b\u009d_\u001b\u007f#<ÈÕ\u009d(N\bdI³ÎYS[\u0010ÍD¢º®ôz´§\u001b\u008b\u0090Y\u0005~ßP>ö|¸\rÚ\u001e\u007f.BE \u001d\u0010èãN\u008dÎý\u000bz$;\u007f57¢!â\u0010£ð.Ã\u001f«H&\u009e<±ÿK\u0087p~\u0010\u0001z\rø¨\u0090 \u0094_\u0011^GØþN\u0000H1¡íX¹\u009ez¼&ý6óÙI$\u0095`¸]£v!jøoì°ÇeüK(êzóð\u001cJ\u001e¢\u000b\u0087zà(o\u001chND¦azÛñ\nÝIÅ\u0019Æ¸(ÇuÃ\"xÅÌ\u0097\u0012(G_Ï¥¨oo\u0010\u0015Ó3\u0005\u0088ÿÈ'$|\u0090\u00adÅp®\u0092ÄnãJ\u001e¾>Ä\u008f\u0004dZ\u0012\u008dYn \u0018\u0005\u0098mÉßÑäÔ7\u001bWMä·Á¸\u0002\u0089FMÑ\u008b\u0011\r,¾àX%.·\u0010ÅGå!\u0085\u0098ÞV\u001fY\u001fÔjz\u0081ö\u0010Üiçy\u00ad»Ë\u0080\t\u0004Ëk¬\u0015\u008d\u0089\u0010oc½ÇE\u009b\u0094H¯ÔupNýØ÷\u0010L\u008aÕ\u0097\u0089\u0003IÛòì§«>K³»"
      // 091: dup
      // 092: astore 26
      // 094: invokevirtual java/lang/String.length ()I
      // 097: istore 28
      // 099: bipush 16
      // 09b: istore 25
      // 09d: bipush -1
      // 09e: istore 24
      // 0a0: iinc 24 1
      // 0a3: aload 26
      // 0a5: iload 24
      // 0a7: dup
      // 0a8: iload 25
      // 0aa: iadd
      // 0ab: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ae: bipush -1
      // 0af: goto 12b
      // 0b2: aload 29
      // 0b4: swap
      // 0b5: iload 27
      // 0b7: iinc 27 1
      // 0ba: swap
      // 0bb: aastore
      // 0bc: iload 24
      // 0be: iload 25
      // 0c0: iadd
      // 0c1: dup
      // 0c2: istore 24
      // 0c4: iload 28
      // 0c6: if_icmpge 0d5
      // 0c9: aload 26
      // 0cb: iload 24
      // 0cd: invokevirtual java/lang/String.charAt (I)C
      // 0d0: istore 25
      // 0d2: goto 0a0
      // 0d5: ldc "?²\u000b<\u0096Û3\u0087V\u008e±öéS¶ã\u0010)\u0019\u0081AÆ8\u0004O\u001c\u0089°Uèð\u00915"
      // 0d7: dup
      // 0d8: astore 26
      // 0da: invokevirtual java/lang/String.length ()I
      // 0dd: istore 28
      // 0df: bipush 16
      // 0e1: istore 25
      // 0e3: bipush -1
      // 0e4: istore 24
      // 0e6: iinc 24 1
      // 0e9: aload 26
      // 0eb: iload 24
      // 0ed: dup
      // 0ee: iload 25
      // 0f0: iadd
      // 0f1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0f4: bipush 0
      // 0f5: goto 12b
      // 0f8: aload 29
      // 0fa: swap
      // 0fb: iload 27
      // 0fd: iinc 27 1
      // 100: swap
      // 101: aastore
      // 102: iload 24
      // 104: iload 25
      // 106: iadd
      // 107: dup
      // 108: istore 24
      // 10a: iload 28
      // 10c: if_icmpge 11b
      // 10f: aload 26
      // 111: iload 24
      // 113: invokevirtual java/lang/String.charAt (I)C
      // 116: istore 25
      // 118: goto 0e6
      // 11b: aload 29
      // 11d: putstatic com/zelix/w_.b [Ljava/lang/String;
      // 120: bipush 56
      // 122: anewarray 23
      // 125: putstatic com/zelix/w_.d [Ljava/lang/String;
      // 128: goto 154
      // 12b: swap
      // 12c: ldc "ISO-8859-1"
      // 12e: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 131: aload 22
      // 133: swap
      // 134: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 137: astore 30
      // 139: aload 30
      // 13b: invokestatic com/zelix/w_.a ([B)Ljava/lang/String;
      // 13e: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 141: swap
      // 142: tableswitch -144 0 0 -74
      // 154: new java/util/HashMap
      // 157: dup
      // 158: bipush 13
      // 15a: invokespecial java/util/HashMap.<init> (I)V
      // 15d: putstatic com/zelix/w_.j Ljava/util/Map;
      // 160: ldc "DES/CBC/NoPadding"
      // 162: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 165: dup
      // 166: astore 11
      // 168: bipush 2
      // 169: ldc "DES"
      // 16b: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 16e: bipush 8
      // 170: newarray 8
      // 172: dup
      // 173: bipush 0
      // 174: lload 31
      // 176: bipush 56
      // 178: lushr
      // 179: l2i
      // 17a: i2b
      // 17b: bastore
      // 17c: bipush 1
      // 17d: istore 12
      // 17f: iload 12
      // 181: bipush 8
      // 183: if_icmpge 19d
      // 186: dup
      // 187: iload 12
      // 189: lload 31
      // 18b: iload 12
      // 18d: bipush 8
      // 18f: imul
      // 190: lshl
      // 191: bipush 56
      // 193: lushr
      // 194: l2i
      // 195: i2b
      // 196: bastore
      // 197: iinc 12 1
      // 19a: goto 17f
      // 19d: new javax/crypto/spec/DESKeySpec
      // 1a0: dup_x1
      // 1a1: swap
      // 1a2: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 1a5: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 1a8: new javax/crypto/spec/IvParameterSpec
      // 1ab: dup
      // 1ac: bipush 8
      // 1ae: newarray 8
      // 1b0: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 1b3: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 1b6: bipush 24
      // 1b8: newarray 11
      // 1ba: astore 17
      // 1bc: bipush 0
      // 1bd: istore 14
      // 1bf: ldc "¬)þ5Ô\u0092]\u008amü\u008f\u001f%\u0016 \u009b:n\u009c»\u009e\u00101î ÂD}\u007fßN;Äù* ªð4\u0097áP\u0090\u0094\u0007\u0087Ü²wPi\"\u0082M NSfÒ\u0006r«ÙÒÏO*\u008eþ=\u0000´\ri\u008coì8å½ÈI\u0085¸\u009c\u001d\u0007Q\u0005ù8\u008bð\u0011\u0002g·\u009få`ÑÔþç÷ÄÔa\u0012S\u000eîZØ\u000eÔQ\u001d\u008a4|À1sUÂ\u000bh¸?\u009fY\u008a¬\u000e\u0000ä-Ô¨·\u008d9\u0093Æ\u0002-a°JÎwCE\tí\u0098\u008dÈ?UóT\u0014\f\u0094\u008d\"Ãa\u0019ìnt\u00ad³"
      // 1c1: dup
      // 1c2: astore 15
      // 1c4: invokevirtual java/lang/String.length ()I
      // 1c7: istore 16
      // 1c9: bipush 0
      // 1ca: istore 13
      // 1cc: aload 15
      // 1ce: iload 13
      // 1d0: iinc 13 8
      // 1d3: iload 13
      // 1d5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1d8: ldc "ISO-8859-1"
      // 1da: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 1dd: astore 18
      // 1df: aload 17
      // 1e1: iload 14
      // 1e3: iinc 14 1
      // 1e6: aload 18
      // 1e8: bipush 0
      // 1e9: baload
      // 1ea: i2l
      // 1eb: ldc2_w 255
      // 1ee: land
      // 1ef: bipush 56
      // 1f1: lshl
      // 1f2: aload 18
      // 1f4: bipush 1
      // 1f5: baload
      // 1f6: i2l
      // 1f7: ldc2_w 255
      // 1fa: land
      // 1fb: bipush 48
      // 1fd: lshl
      // 1fe: lor
      // 1ff: aload 18
      // 201: bipush 2
      // 202: baload
      // 203: i2l
      // 204: ldc2_w 255
      // 207: land
      // 208: bipush 40
      // 20a: lshl
      // 20b: lor
      // 20c: aload 18
      // 20e: bipush 3
      // 20f: baload
      // 210: i2l
      // 211: ldc2_w 255
      // 214: land
      // 215: bipush 32
      // 217: lshl
      // 218: lor
      // 219: aload 18
      // 21b: bipush 4
      // 21c: baload
      // 21d: i2l
      // 21e: ldc2_w 255
      // 221: land
      // 222: bipush 24
      // 224: lshl
      // 225: lor
      // 226: aload 18
      // 228: bipush 5
      // 229: baload
      // 22a: i2l
      // 22b: ldc2_w 255
      // 22e: land
      // 22f: bipush 16
      // 231: lshl
      // 232: lor
      // 233: aload 18
      // 235: bipush 6
      // 237: baload
      // 238: i2l
      // 239: ldc2_w 255
      // 23c: land
      // 23d: bipush 8
      // 23f: lshl
      // 240: lor
      // 241: aload 18
      // 243: bipush 7
      // 245: baload
      // 246: i2l
      // 247: ldc2_w 255
      // 24a: land
      // 24b: lor
      // 24c: bipush -1
      // 24d: goto 301
      // 250: lastore
      // 251: iload 13
      // 253: iload 16
      // 255: if_icmplt 1cc
      // 258: ldc "\u001bºÓ\u009fm«\u008fqÛ%¾\u001e\u0084¼¸Ç"
      // 25a: dup
      // 25b: astore 15
      // 25d: invokevirtual java/lang/String.length ()I
      // 260: istore 16
      // 262: bipush 0
      // 263: istore 13
      // 265: aload 15
      // 267: iload 13
      // 269: iinc 13 8
      // 26c: iload 13
      // 26e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 271: ldc "ISO-8859-1"
      // 273: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 276: astore 18
      // 278: aload 17
      // 27a: iload 14
      // 27c: iinc 14 1
      // 27f: aload 18
      // 281: bipush 0
      // 282: baload
      // 283: i2l
      // 284: ldc2_w 255
      // 287: land
      // 288: bipush 56
      // 28a: lshl
      // 28b: aload 18
      // 28d: bipush 1
      // 28e: baload
      // 28f: i2l
      // 290: ldc2_w 255
      // 293: land
      // 294: bipush 48
      // 296: lshl
      // 297: lor
      // 298: aload 18
      // 29a: bipush 2
      // 29b: baload
      // 29c: i2l
      // 29d: ldc2_w 255
      // 2a0: land
      // 2a1: bipush 40
      // 2a3: lshl
      // 2a4: lor
      // 2a5: aload 18
      // 2a7: bipush 3
      // 2a8: baload
      // 2a9: i2l
      // 2aa: ldc2_w 255
      // 2ad: land
      // 2ae: bipush 32
      // 2b0: lshl
      // 2b1: lor
      // 2b2: aload 18
      // 2b4: bipush 4
      // 2b5: baload
      // 2b6: i2l
      // 2b7: ldc2_w 255
      // 2ba: land
      // 2bb: bipush 24
      // 2bd: lshl
      // 2be: lor
      // 2bf: aload 18
      // 2c1: bipush 5
      // 2c2: baload
      // 2c3: i2l
      // 2c4: ldc2_w 255
      // 2c7: land
      // 2c8: bipush 16
      // 2ca: lshl
      // 2cb: lor
      // 2cc: aload 18
      // 2ce: bipush 6
      // 2d0: baload
      // 2d1: i2l
      // 2d2: ldc2_w 255
      // 2d5: land
      // 2d6: bipush 8
      // 2d8: lshl
      // 2d9: lor
      // 2da: aload 18
      // 2dc: bipush 7
      // 2de: baload
      // 2df: i2l
      // 2e0: ldc2_w 255
      // 2e3: land
      // 2e4: lor
      // 2e5: bipush 0
      // 2e6: goto 301
      // 2e9: lastore
      // 2ea: iload 13
      // 2ec: iload 16
      // 2ee: if_icmplt 265
      // 2f1: aload 17
      // 2f3: putstatic com/zelix/w_.g [J
      // 2f6: bipush 24
      // 2f8: anewarray 656
      // 2fb: putstatic com/zelix/w_.i [Ljava/lang/Integer;
      // 2fe: goto 3dc
      // 301: dup_x2
      // 302: pop
      // 303: lstore 19
      // 305: bipush 8
      // 307: newarray 8
      // 309: dup
      // 30a: bipush 0
      // 30b: lload 19
      // 30d: bipush 56
      // 30f: lushr
      // 310: l2i
      // 311: i2b
      // 312: bastore
      // 313: dup
      // 314: bipush 1
      // 315: lload 19
      // 317: bipush 48
      // 319: lushr
      // 31a: l2i
      // 31b: i2b
      // 31c: bastore
      // 31d: dup
      // 31e: bipush 2
      // 31f: lload 19
      // 321: bipush 40
      // 323: lushr
      // 324: l2i
      // 325: i2b
      // 326: bastore
      // 327: dup
      // 328: bipush 3
      // 329: lload 19
      // 32b: bipush 32
      // 32d: lushr
      // 32e: l2i
      // 32f: i2b
      // 330: bastore
      // 331: dup
      // 332: bipush 4
      // 333: lload 19
      // 335: bipush 24
      // 337: lushr
      // 338: l2i
      // 339: i2b
      // 33a: bastore
      // 33b: dup
      // 33c: bipush 5
      // 33d: lload 19
      // 33f: bipush 16
      // 341: lushr
      // 342: l2i
      // 343: i2b
      // 344: bastore
      // 345: dup
      // 346: bipush 6
      // 348: lload 19
      // 34a: bipush 8
      // 34c: lushr
      // 34d: l2i
      // 34e: i2b
      // 34f: bastore
      // 350: dup
      // 351: bipush 7
      // 353: lload 19
      // 355: l2i
      // 356: i2b
      // 357: bastore
      // 358: aload 11
      // 35a: swap
      // 35b: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 35e: astore 21
      // 360: aload 21
      // 362: bipush 0
      // 363: baload
      // 364: i2l
      // 365: ldc2_w 255
      // 368: land
      // 369: bipush 56
      // 36b: lshl
      // 36c: aload 21
      // 36e: bipush 1
      // 36f: baload
      // 370: i2l
      // 371: ldc2_w 255
      // 374: land
      // 375: bipush 48
      // 377: lshl
      // 378: lor
      // 379: aload 21
      // 37b: bipush 2
      // 37c: baload
      // 37d: i2l
      // 37e: ldc2_w 255
      // 381: land
      // 382: bipush 40
      // 384: lshl
      // 385: lor
      // 386: aload 21
      // 388: bipush 3
      // 389: baload
      // 38a: i2l
      // 38b: ldc2_w 255
      // 38e: land
      // 38f: bipush 32
      // 391: lshl
      // 392: lor
      // 393: aload 21
      // 395: bipush 4
      // 396: baload
      // 397: i2l
      // 398: ldc2_w 255
      // 39b: land
      // 39c: bipush 24
      // 39e: lshl
      // 39f: lor
      // 3a0: aload 21
      // 3a2: bipush 5
      // 3a3: baload
      // 3a4: i2l
      // 3a5: ldc2_w 255
      // 3a8: land
      // 3a9: bipush 16
      // 3ab: lshl
      // 3ac: lor
      // 3ad: aload 21
      // 3af: bipush 6
      // 3b1: baload
      // 3b2: i2l
      // 3b3: ldc2_w 255
      // 3b6: land
      // 3b7: bipush 8
      // 3b9: lshl
      // 3ba: lor
      // 3bb: aload 21
      // 3bd: bipush 7
      // 3bf: baload
      // 3c0: i2l
      // 3c1: ldc2_w 255
      // 3c4: land
      // 3c5: lor
      // 3c6: dup2_x1
      // 3c7: pop2
      // 3c8: tableswitch -376 0 0 -223
      // 3dc: new java/util/HashMap
      // 3df: dup
      // 3e0: bipush 13
      // 3e2: invokespecial java/util/HashMap.<init> (I)V
      // 3e5: putstatic com/zelix/w_.q Ljava/util/Map;
      // 3e8: ldc "DES/CBC/NoPadding"
      // 3ea: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 3ed: dup
      // 3ee: astore 0
      // 3ef: bipush 2
      // 3f0: ldc "DES"
      // 3f2: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 3f5: bipush 8
      // 3f7: newarray 8
      // 3f9: dup
      // 3fa: bipush 0
      // 3fb: lload 31
      // 3fd: bipush 56
      // 3ff: lushr
      // 400: l2i
      // 401: i2b
      // 402: bastore
      // 403: bipush 1
      // 404: istore 1
      // 405: iload 1
      // 406: bipush 8
      // 408: if_icmpge 420
      // 40b: dup
      // 40c: iload 1
      // 40d: lload 31
      // 40f: iload 1
      // 410: bipush 8
      // 412: imul
      // 413: lshl
      // 414: bipush 56
      // 416: lushr
      // 417: l2i
      // 418: i2b
      // 419: bastore
      // 41a: iinc 1 1
      // 41d: goto 405
      // 420: new javax/crypto/spec/DESKeySpec
      // 423: dup_x1
      // 424: swap
      // 425: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 428: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 42b: new javax/crypto/spec/IvParameterSpec
      // 42e: dup
      // 42f: bipush 8
      // 431: newarray 8
      // 433: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 436: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 439: bipush 2
      // 43a: newarray 11
      // 43c: astore 6
      // 43e: bipush 0
      // 43f: istore 3
      // 440: ldc "ûÍÓ\u0013·ªò·PÂ=Â\"+ý\u0000"
      // 442: dup
      // 443: astore 4
      // 445: invokevirtual java/lang/String.length ()I
      // 448: istore 5
      // 44a: bipush 0
      // 44b: istore 2
      // 44c: aload 4
      // 44e: iload 2
      // 44f: iinc 2 8
      // 452: iload 2
      // 453: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 456: ldc "ISO-8859-1"
      // 458: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 45b: astore 7
      // 45d: aload 6
      // 45f: iload 3
      // 460: iinc 3 1
      // 463: aload 7
      // 465: bipush 0
      // 466: baload
      // 467: i2l
      // 468: ldc2_w 255
      // 46b: land
      // 46c: bipush 56
      // 46e: lshl
      // 46f: aload 7
      // 471: bipush 1
      // 472: baload
      // 473: i2l
      // 474: ldc2_w 255
      // 477: land
      // 478: bipush 48
      // 47a: lshl
      // 47b: lor
      // 47c: aload 7
      // 47e: bipush 2
      // 47f: baload
      // 480: i2l
      // 481: ldc2_w 255
      // 484: land
      // 485: bipush 40
      // 487: lshl
      // 488: lor
      // 489: aload 7
      // 48b: bipush 3
      // 48c: baload
      // 48d: i2l
      // 48e: ldc2_w 255
      // 491: land
      // 492: bipush 32
      // 494: lshl
      // 495: lor
      // 496: aload 7
      // 498: bipush 4
      // 499: baload
      // 49a: i2l
      // 49b: ldc2_w 255
      // 49e: land
      // 49f: bipush 24
      // 4a1: lshl
      // 4a2: lor
      // 4a3: aload 7
      // 4a5: bipush 5
      // 4a6: baload
      // 4a7: i2l
      // 4a8: ldc2_w 255
      // 4ab: land
      // 4ac: bipush 16
      // 4ae: lshl
      // 4af: lor
      // 4b0: aload 7
      // 4b2: bipush 6
      // 4b4: baload
      // 4b5: i2l
      // 4b6: ldc2_w 255
      // 4b9: land
      // 4ba: bipush 8
      // 4bc: lshl
      // 4bd: lor
      // 4be: aload 7
      // 4c0: bipush 7
      // 4c2: baload
      // 4c3: i2l
      // 4c4: ldc2_w 255
      // 4c7: land
      // 4c8: lor
      // 4c9: bipush -1
      // 4ca: goto 4e3
      // 4cd: lastore
      // 4ce: iload 2
      // 4cf: iload 5
      // 4d1: if_icmplt 44c
      // 4d4: aload 6
      // 4d6: putstatic com/zelix/w_.m [J
      // 4d9: bipush 2
      // 4da: anewarray 204
      // 4dd: putstatic com/zelix/w_.o [Ljava/lang/Long;
      // 4e0: goto 5ad
      // 4e3: dup_x2
      // 4e4: pop
      // 4e5: lstore 8
      // 4e7: bipush 8
      // 4e9: newarray 8
      // 4eb: dup
      // 4ec: bipush 0
      // 4ed: lload 8
      // 4ef: bipush 56
      // 4f1: lushr
      // 4f2: l2i
      // 4f3: i2b
      // 4f4: bastore
      // 4f5: dup
      // 4f6: bipush 1
      // 4f7: lload 8
      // 4f9: bipush 48
      // 4fb: lushr
      // 4fc: l2i
      // 4fd: i2b
      // 4fe: bastore
      // 4ff: dup
      // 500: bipush 2
      // 501: lload 8
      // 503: bipush 40
      // 505: lushr
      // 506: l2i
      // 507: i2b
      // 508: bastore
      // 509: dup
      // 50a: bipush 3
      // 50b: lload 8
      // 50d: bipush 32
      // 50f: lushr
      // 510: l2i
      // 511: i2b
      // 512: bastore
      // 513: dup
      // 514: bipush 4
      // 515: lload 8
      // 517: bipush 24
      // 519: lushr
      // 51a: l2i
      // 51b: i2b
      // 51c: bastore
      // 51d: dup
      // 51e: bipush 5
      // 51f: lload 8
      // 521: bipush 16
      // 523: lushr
      // 524: l2i
      // 525: i2b
      // 526: bastore
      // 527: dup
      // 528: bipush 6
      // 52a: lload 8
      // 52c: bipush 8
      // 52e: lushr
      // 52f: l2i
      // 530: i2b
      // 531: bastore
      // 532: dup
      // 533: bipush 7
      // 535: lload 8
      // 537: l2i
      // 538: i2b
      // 539: bastore
      // 53a: aload 0
      // 53b: swap
      // 53c: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 53f: astore 10
      // 541: aload 10
      // 543: bipush 0
      // 544: baload
      // 545: i2l
      // 546: ldc2_w 255
      // 549: land
      // 54a: bipush 56
      // 54c: lshl
      // 54d: aload 10
      // 54f: bipush 1
      // 550: baload
      // 551: i2l
      // 552: ldc2_w 255
      // 555: land
      // 556: bipush 48
      // 558: lshl
      // 559: lor
      // 55a: aload 10
      // 55c: bipush 2
      // 55d: baload
      // 55e: i2l
      // 55f: ldc2_w 255
      // 562: land
      // 563: bipush 40
      // 565: lshl
      // 566: lor
      // 567: aload 10
      // 569: bipush 3
      // 56a: baload
      // 56b: i2l
      // 56c: ldc2_w 255
      // 56f: land
      // 570: bipush 32
      // 572: lshl
      // 573: lor
      // 574: aload 10
      // 576: bipush 4
      // 577: baload
      // 578: i2l
      // 579: ldc2_w 255
      // 57c: land
      // 57d: bipush 24
      // 57f: lshl
      // 580: lor
      // 581: aload 10
      // 583: bipush 5
      // 584: baload
      // 585: i2l
      // 586: ldc2_w 255
      // 589: land
      // 58a: bipush 16
      // 58c: lshl
      // 58d: lor
      // 58e: aload 10
      // 590: bipush 6
      // 592: baload
      // 593: i2l
      // 594: ldc2_w 255
      // 597: land
      // 598: bipush 8
      // 59a: lshl
      // 59b: lor
      // 59c: aload 10
      // 59e: bipush 7
      // 5a0: baload
      // 5a1: i2l
      // 5a2: ldc2_w 255
      // 5a5: land
      // 5a6: lor
      // 5a7: dup2_x1
      // 5a8: pop2
      // 5a9: pop
      // 5aa: goto 4cd
      // 5ad: sipush 2806
      // 5b0: ldc2_w 7412309482671102355
      // 5b3: lload 31
      // 5b5: lxor
      // 5b6: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bb: ldc2_w 1394862713466854475
      // 5be: lload 31
      // 5c0: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c5: putstatic com/zelix/w_.l Ljava/lang/String;
      // 5c8: sipush 11513
      // 5cb: new java/io/File
      // 5ce: dup
      // 5cf: ldc2_w 1544632498744938022
      // 5d2: lload 31
      // 5d4: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5dc: putstatic com/zelix/w_.K Ljava/io/File;
      // 5df: ldc2_w 5348952611834764816
      // 5e2: lload 31
      // 5e4: lxor
      // 5e5: sipush 25299
      // 5e8: ldc2_w 4234664581938098571
      // 5eb: lload 31
      // 5ed: lxor
      // 5ee: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f3: ldc2_w 1394862713466854475
      // 5f6: lload 31
      // 5f8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fd: putstatic com/zelix/w_.A Ljava/lang/String;
      // 600: ldc2_w 1624144840990433130
      // 603: lload 31
      // 605: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60a: bipush 0
      // 60b: invokevirtual java/lang/String.charAt (I)C
      // 60e: putstatic com/zelix/w_.p C
      // 611: sipush 22091
      // 614: ldc2_w 2785512459911005468
      // 617: lload 31
      // 619: lxor
      // 61a: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61f: ldc2_w 1394862713466854475
      // 622: lload 31
      // 624: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 629: putstatic com/zelix/w_.c Ljava/lang/String;
      // 62c: ldc2_w 604119121776818148
      // 62f: lload 31
      // 631: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 636: bipush 0
      // 637: invokevirtual java/lang/String.charAt (I)C
      // 63a: putstatic com/zelix/w_.n C
      // 63d: sipush 3613
      // 640: ldc2_w 3859154411664825696
      // 643: lload 31
      // 645: lxor
      // 646: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64b: ldc "\n"
      // 64d: ldc2_w 955004370465731176
      // 650: lload 31
      // 652: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 657: putstatic com/zelix/w_.Q Ljava/lang/String;
      // 65a: sipush 14489
      // 65d: ldc2_w 8101679475533409260
      // 660: lload 31
      // 662: lxor
      // 663: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 668: sipush 22707
      // 66b: ldc2_w 7502966996917717998
      // 66e: lload 31
      // 670: lxor
      // 671: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 676: ldc2_w 955004370465731176
      // 679: lload 31
      // 67b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 680: putstatic com/zelix/w_.k Ljava/lang/String;
      // 683: bipush 1
      // 684: ldc2_w 926603494468403550
      // 687: lload 31
      // 689: invokedynamic s (ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68e: sipush 8042
      // 691: ldc2_w 5665955748321807372
      // 694: lload 31
      // 696: lxor
      // 697: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69c: ldc2_w 1394862713466854475
      // 69f: lload 31
      // 6a1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a6: putstatic com/zelix/w_.f Ljava/lang/String;
      // 6a9: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ae: ldc2_w 1674374672514849699
      // 6b1: lload 31
      // 6b3: invokedynamic s (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b8: sipush 19003
      // 6bb: ldc2_w 1462423909346744685
      // 6be: lload 31
      // 6c0: lxor
      // 6c1: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c6: astore 33
      // 6c8: aload 33
      // 6ca: ldc2_w 1212443276882963816
      // 6cd: lload 31
      // 6cf: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d4: astore 34
      // 6d6: bipush 0
      // 6d7: istore 37
      // 6d9: new java/io/File
      // 6dc: dup
      // 6dd: new java/lang/StringBuilder
      // 6e0: dup
      // 6e1: invokespecial java/lang/StringBuilder.<init> ()V
      // 6e4: aload 33
      // 6e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e9: iload 37
      // 6eb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6ee: sipush 6753
      // 6f1: ldc2_w 2068953104979642680
      // 6f4: lload 31
      // 6f6: lxor
      // 6f7: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ff: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 702: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 705: astore 35
      // 707: new java/io/File
      // 70a: dup
      // 70b: new java/lang/StringBuilder
      // 70e: dup
      // 70f: invokespecial java/lang/StringBuilder.<init> ()V
      // 712: aload 34
      // 714: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 717: iload 37
      // 719: iinc 37 1
      // 71c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 71f: sipush 27657
      // 722: ldc2_w 623920454011567997
      // 725: lload 31
      // 727: lxor
      // 728: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 730: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 733: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 736: astore 36
      // 738: aload 35
      // 73a: ldc2_w 945804766671494108
      // 73d: lload 31
      // 73f: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 744: ifne 6d9
      // 747: aload 36
      // 749: ldc2_w 945804766671494108
      // 74c: lload 31
      // 74e: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 753: ifne 6d9
      // 756: new java/io/PrintWriter
      // 759: dup
      // 75a: new java/io/FileWriter
      // 75d: dup
      // 75e: aload 35
      // 760: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 763: bipush 1
      // 764: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;Z)V
      // 767: astore 38
      // 769: aload 38
      // 76b: aload 33
      // 76d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 770: aload 38
      // 772: ldc2_w 970640523145153769
      // 775: lload 31
      // 777: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77c: aload 38
      // 77e: ldc2_w 1412266813177733168
      // 781: lload 31
      // 783: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 788: aload 36
      // 78a: ldc2_w 945804766671494108
      // 78d: lload 31
      // 78f: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 794: ifne 7a6
      // 797: bipush 1
      // 798: goto 7a7
      // 79b: ldc2_w 1461242837227376437
      // 79e: lload 31
      // 7a0: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a5: athrow
      // 7a6: bipush 0
      // 7a7: ldc2_w 926603494468403550
      // 7aa: lload 31
      // 7ac: invokedynamic s (ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b1: goto 846
      // 7b4: astore 38
      // 7b6: ldc2_w 1384115918169423846
      // 7b9: lload 31
      // 7bb: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c0: sipush 17571
      // 7c3: ldc2_w 2359165504731289537
      // 7c6: lload 31
      // 7c8: lxor
      // 7c9: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ce: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 7d1: ifne 83b
      // 7d4: ldc2_w 1384115918169423846
      // 7d7: lload 31
      // 7d9: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7de: sipush 15054
      // 7e1: ldc2_w 8979845808318874
      // 7e4: lload 31
      // 7e6: lxor
      // 7e7: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ec: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 7ef: ifne 83b
      // 7f2: goto 800
      // 7f5: ldc2_w 1461242837227376437
      // 7f8: lload 31
      // 7fa: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ff: athrow
      // 800: ldc2_w 1384115918169423846
      // 803: lload 31
      // 805: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80a: sipush 29908
      // 80d: ldc2_w 6635587440688146329
      // 810: lload 31
      // 812: lxor
      // 813: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 818: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 81b: ifne 83b
      // 81e: goto 82c
      // 821: ldc2_w 1461242837227376437
      // 824: lload 31
      // 826: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82b: athrow
      // 82c: bipush 1
      // 82d: goto 83c
      // 830: ldc2_w 1461242837227376437
      // 833: lload 31
      // 835: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83a: athrow
      // 83b: bipush 0
      // 83c: ldc2_w 926603494468403550
      // 83f: lload 31
      // 841: invokedynamic s (ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 846: aload 35
      // 848: ldc2_w 1666490170646545596
      // 84b: lload 31
      // 84d: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 852: pop
      // 853: ldc2_w 755573339129851539
      // 856: lload 31
      // 858: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85d: ifnull 8be
      // 860: new java/util/ArrayList
      // 863: dup
      // 864: invokespecial java/util/ArrayList.<init> ()V
      // 867: ldc2_w 942782509782655353
      // 86a: lload 31
      // 86c: invokedynamic s (Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 871: new java/util/StringTokenizer
      // 874: dup
      // 875: ldc2_w 755573339129851539
      // 878: lload 31
      // 87a: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87f: ldc ";"
      // 881: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 884: astore 38
      // 886: aload 38
      // 888: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 88b: ifeq 8be
      // 88e: aload 38
      // 890: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 893: astore 39
      // 895: ldc2_w 926603494468403550
      // 898: lload 31
      // 89a: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89f: ifne 8a9
      // 8a2: aload 39
      // 8a4: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 8a7: astore 39
      // 8a9: ldc2_w 942782509782655353
      // 8ac: lload 31
      // 8ae: invokedynamic k (JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b3: aload 39
      // 8b5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8ba: pop
      // 8bb: goto 886
      // 8be: return
   }

   public static boolean H(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w 6234576085292555095
      // 01c: lload 2
      // 01d: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 1
      // 023: invokevirtual java/lang/String.length ()I
      // 026: istore 5
      // 028: astore 4
      // 02a: iload 5
      // 02c: aload 4
      // 02e: ifnonnull 27c
      // 031: bipush 4
      // 032: if_icmple 27b
      // 035: goto 042
      // 038: ldc2_w 5285565106148659752
      // 03b: lload 2
      // 03c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: athrow
      // 042: aload 1
      // 043: iload 5
      // 045: bipush 4
      // 046: isub
      // 047: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 04a: astore 6
      // 04c: aload 6
      // 04e: sipush 18771
      // 051: ldc2_w 4251328098746124037
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: ldc2_w 6243420143549953684
      // 05e: lload 2
      // 05f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 4
      // 066: ifnonnull 216
      // 069: ifne 215
      // 06c: goto 079
      // 06f: ldc2_w 5285565106148659752
      // 072: lload 2
      // 073: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 6
      // 07b: sipush 15386
      // 07e: ldc2_w 5525370960203461185
      // 081: lload 2
      // 082: lxor
      // 083: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: ldc2_w 6243420143549953684
      // 08b: lload 2
      // 08c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: aload 4
      // 093: ifnonnull 216
      // 096: goto 0a3
      // 099: ldc2_w 5285565106148659752
      // 09c: lload 2
      // 09d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: ifne 215
      // 0a6: goto 0b3
      // 0a9: ldc2_w 5285565106148659752
      // 0ac: lload 2
      // 0ad: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 6
      // 0b5: sipush 19773
      // 0b8: ldc2_w 3198573333170439001
      // 0bb: lload 2
      // 0bc: lxor
      // 0bd: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: ldc2_w 6243420143549953684
      // 0c5: lload 2
      // 0c6: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: aload 4
      // 0cd: ifnonnull 216
      // 0d0: goto 0dd
      // 0d3: ldc2_w 5285565106148659752
      // 0d6: lload 2
      // 0d7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: ifne 215
      // 0e0: goto 0ed
      // 0e3: ldc2_w 5285565106148659752
      // 0e6: lload 2
      // 0e7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 6
      // 0ef: sipush 13970
      // 0f2: ldc2_w 4145108489078192336
      // 0f5: lload 2
      // 0f6: lxor
      // 0f7: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: ldc2_w 6243420143549953684
      // 0ff: lload 2
      // 100: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: aload 4
      // 107: ifnonnull 216
      // 10a: goto 117
      // 10d: ldc2_w 5285565106148659752
      // 110: lload 2
      // 111: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: ifne 215
      // 11a: goto 127
      // 11d: ldc2_w 5285565106148659752
      // 120: lload 2
      // 121: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 6
      // 129: sipush 5847
      // 12c: ldc2_w 2100420330659027080
      // 12f: lload 2
      // 130: lxor
      // 131: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: ldc2_w 6243420143549953684
      // 139: lload 2
      // 13a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: aload 4
      // 141: ifnonnull 216
      // 144: goto 151
      // 147: ldc2_w 5285565106148659752
      // 14a: lload 2
      // 14b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: ifne 215
      // 154: goto 161
      // 157: ldc2_w 5285565106148659752
      // 15a: lload 2
      // 15b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: aload 6
      // 163: sipush 23111
      // 166: ldc2_w 377077591219721273
      // 169: lload 2
      // 16a: lxor
      // 16b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: ldc2_w 6243420143549953684
      // 173: lload 2
      // 174: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: aload 4
      // 17b: ifnonnull 216
      // 17e: goto 18b
      // 181: ldc2_w 5285565106148659752
      // 184: lload 2
      // 185: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: ifne 215
      // 18e: goto 19b
      // 191: ldc2_w 5285565106148659752
      // 194: lload 2
      // 195: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: aload 6
      // 19d: sipush 10669
      // 1a0: ldc2_w 5334506986281084872
      // 1a3: lload 2
      // 1a4: lxor
      // 1a5: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: ldc2_w 6243420143549953684
      // 1ad: lload 2
      // 1ae: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: aload 4
      // 1b5: ifnonnull 216
      // 1b8: goto 1c5
      // 1bb: ldc2_w 5285565106148659752
      // 1be: lload 2
      // 1bf: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: ifne 215
      // 1c8: goto 1d5
      // 1cb: ldc2_w 5285565106148659752
      // 1ce: lload 2
      // 1cf: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: aload 6
      // 1d7: sipush 1847
      // 1da: ldc2_w 981084034784725354
      // 1dd: lload 2
      // 1de: lxor
      // 1df: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: ldc2_w 6243420143549953684
      // 1e7: lload 2
      // 1e8: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: aload 4
      // 1ef: lload 2
      // 1f0: lconst_0
      // 1f1: lcmp
      // 1f2: ifle 21b
      // 1f5: ifnonnull 219
      // 1f8: goto 205
      // 1fb: ldc2_w 5285565106148659752
      // 1fe: lload 2
      // 1ff: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: athrow
      // 205: ifeq 217
      // 208: goto 215
      // 20b: ldc2_w 5285565106148659752
      // 20e: lload 2
      // 20f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: athrow
      // 215: bipush 1
      // 216: ireturn
      // 217: iload 5
      // 219: aload 4
      // 21b: ifnonnull 27c
      // 21e: bipush 5
      // 21f: if_icmple 27b
      // 222: goto 22f
      // 225: ldc2_w 5285565106148659752
      // 228: lload 2
      // 229: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: athrow
      // 22f: aload 1
      // 230: iload 5
      // 232: bipush 5
      // 233: isub
      // 234: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 237: sipush 7075
      // 23a: ldc2_w 8538845098119730638
      // 23d: lload 2
      // 23e: lxor
      // 23f: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: ldc2_w 6243420143549953684
      // 247: lload 2
      // 248: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: aload 4
      // 24f: ifnonnull 27c
      // 252: goto 25f
      // 255: ldc2_w 5285565106148659752
      // 258: lload 2
      // 259: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: athrow
      // 25f: ifeq 27b
      // 262: goto 26f
      // 265: ldc2_w 5285565106148659752
      // 268: lload 2
      // 269: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: athrow
      // 26f: bipush 1
      // 270: ireturn
      // 271: ldc2_w 5285565106148659752
      // 274: lload 2
      // 275: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: athrow
      // 27b: bipush 0
      // 27c: ireturn
   }

   public static BufferedReader I(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      String var4 = (String)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 128926246293802L;
      return x44.a<"t">(new Object[]{new FileInputStream(var3.trim()), var4, null, var5}, 2249311556870072035L, var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File b(Object[] var0) {
      String var1 = (String)var0[0];
      long var3 = (Long)var0[1];
      File var5 = (File)var0[2];
      pg var2 = (pg)var0[3];
      var3 = a ^ var3;
      long var6 = var3 ^ 28799134286078L;
      String var10000 = x44.a<"v">(4444189491315306622L, var3);
      PrintWriter var9 = null;
      String var8 = var10000;
      boolean var17 = false /* VF: Semaphore variable */;

      label109: {
         Object var11;
         try {
            var17 = true;
            var9 = new PrintWriter(new BufferedWriter(new FileWriter(var5)));
            var9.println(var1);
            x44.a<"n">(var9, 4272885405575199453L, var3);
            var17 = false;
            break label109;
         } catch (IOException var20) {
            var2.G(var6, x44.a<"n">(var20, 2432853859732379632L, var3));
            var11 = null;
            var17 = false;
         } finally {
            if (var17) {
               label78: {
                  label77: {
                     try {
                        var26 = var9;
                        if (var8 != null) {
                           break label77;
                        }

                        if (var9 == null) {
                           break label78;
                        }
                     } catch (IOException var18) {
                        throw x44.a<"v">(var18, 2482431537374411009L, var3);
                     }

                     var26 = var9;
                  }

                  x44.a<"n">(var26, 2714931591290820100L, var3);
               }
            }
         }

         label87: {
            try {
               var27 = var9;
               if (var8 != null) {
                  break label87;
               }

               if (var9 == null) {
                  return (File)var11;
               }
            } catch (IOException var19) {
               throw x44.a<"v">(var19, 2482431537374411009L, var3);
            }

            var27 = var9;
         }

         x44.a<"n">(var27, 2714931591290820100L, var3);
         return (File)var11;
      }

      PrintWriter var28 = var9;
      if (var8 == null) {
         if (var9 == null) {
            return var5;
         }

         var28 = var9;
      }

      x44.a<"n">(var28, 2714931591290820100L, var3);
      return var5;
   }

   public static byte[] j(Object[] var0) {
      PushbackInputStream var2 = (PushbackInputStream)var0[0];
      long var3 = (Long)var0[1];
      int var1 = (Integer)var0[2];
      var3 = a ^ var3;
      long var5 = var3 ^ 95616996678629L;
      String var7 = x44.a<"t">(-8507652866149006276L, var3);

      try {
         byte[] var8 = new byte[var1];
         int var9 = x44.a<"t">(new Object[]{var5, var2, var8}, -7499007408683802717L, var3);

         label24: {
            try {
               if (var7 != null) {
                  return var8;
               }

               if (var9 != -1) {
                  break label24;
               }
            } catch (IOException var10) {
               throw x44.a<"t">(var10, -7624296938797003453L, var3);
            }

            var9 = 0;
         }

         x44.a<"l">(var2, var8, 0, var9, -7708788344970889886L, var3);
         return var8;
      } catch (IOException var11) {
         return null;
      }
   }

   private static List h(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/io/File
      // 021: astore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/pg
      // 029: astore 1
      // 02a: pop
      // 02b: getstatic com/zelix/w_.a J
      // 02e: lload 2
      // 02f: lxor
      // 030: lstore 2
      // 031: lload 2
      // 032: dup2
      // 033: ldc2_w 77214127100703
      // 036: lxor
      // 037: lstore 7
      // 039: dup2
      // 03a: ldc2_w 34345745121814
      // 03d: lxor
      // 03e: lstore 9
      // 040: dup2
      // 041: ldc2_w 110323294549347
      // 044: lxor
      // 045: lstore 11
      // 047: dup2
      // 048: ldc2_w 83270196662597
      // 04b: lxor
      // 04c: lstore 13
      // 04e: pop2
      // 04f: ldc2_w 7948205469224018847
      // 052: lload 2
      // 053: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: aload 5
      // 05a: ldc2_w 8313501850160200383
      // 05d: lload 2
      // 05e: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 066: istore 19
      // 068: astore 18
      // 06a: iload 19
      // 06c: bipush -1
      // 06d: if_icmple 090
      // 070: aload 5
      // 072: bipush 0
      // 073: iload 19
      // 075: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 078: astore 20
      // 07a: aload 5
      // 07c: iload 19
      // 07e: bipush 1
      // 07f: iadd
      // 080: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 083: astore 21
      // 085: aload 18
      // 087: lload 2
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 099
      // 08d: ifnull 097
      // 090: aconst_null
      // 091: astore 20
      // 093: aload 5
      // 095: astore 21
      // 097: aload 20
      // 099: aload 18
      // 09b: ifnonnull 0cc
      // 09e: ifnonnull 0bd
      // 0a1: goto 0ae
      // 0a4: ldc2_w 8183606067831827168
      // 0a7: lload 2
      // 0a8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 4
      // 0b0: astore 22
      // 0b2: aload 18
      // 0b4: lload 2
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: iflt 0bf
      // 0ba: ifnull 10f
      // 0bd: aload 20
      // 0bf: goto 0cc
      // 0c2: ldc2_w 8183606067831827168
      // 0c5: lload 2
      // 0c6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: lload 11
      // 0ce: bipush 2
      // 0cf: anewarray 598
      // 0d2: dup_x2
      // 0d3: dup_x2
      // 0d4: pop
      // 0d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d8: bipush 1
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: ldc2_w 7867159497050555839
      // 0e3: lload 2
      // 0e4: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: ifeq 104
      // 0ec: new java/io/File
      // 0ef: dup
      // 0f0: aload 4
      // 0f2: aload 20
      // 0f4: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0f7: lload 2
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: iflt 10d
      // 0fd: astore 22
      // 0ff: aload 18
      // 101: ifnull 10f
      // 104: new java/io/File
      // 107: dup
      // 108: aload 20
      // 10a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 10d: astore 22
      // 10f: new java/util/Vector
      // 112: dup
      // 113: invokespecial java/util/Vector.<init> ()V
      // 116: astore 23
      // 118: aload 22
      // 11a: ldc2_w 7563037662312807945
      // 11d: lload 2
      // 11e: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: lload 2
      // 124: lconst_0
      // 125: lcmp
      // 126: iflt 1a8
      // 129: aload 18
      // 12b: ifnonnull 1a8
      // 12e: ifne 18b
      // 131: goto 13e
      // 134: ldc2_w 8183606067831827168
      // 137: lload 2
      // 138: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: aload 1
      // 13f: new java/lang/StringBuilder
      // 142: dup
      // 143: invokespecial java/lang/StringBuilder.<init> ()V
      // 146: sipush 31662
      // 149: ldc2_w 8684274450425367841
      // 14c: lload 2
      // 14d: lxor
      // 14e: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 156: aload 22
      // 158: ldc2_w 8187045108221622685
      // 15b: lload 2
      // 15c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: sipush 22707
      // 167: ldc2_w 3955319317372104217
      // 16a: lload 2
      // 16b: lxor
      // 16c: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 177: lload 7
      // 179: dup2_x1
      // 17a: pop2
      // 17b: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 17e: aload 23
      // 180: areturn
      // 181: ldc2_w 8183606067831827168
      // 184: lload 2
      // 185: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 22
      // 18d: aload 18
      // 18f: ifnonnull 1fa
      // 192: ldc2_w 7585214407247063717
      // 195: lload 2
      // 196: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: goto 1a8
      // 19e: ldc2_w 8183606067831827168
      // 1a1: lload 2
      // 1a2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: ifne 1f8
      // 1ab: aload 1
      // 1ac: new java/lang/StringBuilder
      // 1af: dup
      // 1b0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b3: sipush 6287
      // 1b6: ldc2_w 601829189694959125
      // 1b9: lload 2
      // 1ba: lxor
      // 1bb: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c3: aload 22
      // 1c5: ldc2_w 8187045108221622685
      // 1c8: lload 2
      // 1c9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d1: sipush 29435
      // 1d4: ldc2_w 3232309516593349759
      // 1d7: lload 2
      // 1d8: lxor
      // 1d9: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e4: lload 7
      // 1e6: dup2_x1
      // 1e7: pop2
      // 1e8: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 1eb: aload 23
      // 1ed: areturn
      // 1ee: ldc2_w 8183606067831827168
      // 1f1: lload 2
      // 1f2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: aload 22
      // 1fa: ldc2_w 8101955557539442034
      // 1fd: lload 2
      // 1fe: invokedynamic o (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: astore 24
      // 205: aload 24
      // 207: aload 18
      // 209: ifnonnull 26b
      // 20c: ifnonnull 269
      // 20f: goto 21c
      // 212: ldc2_w 8183606067831827168
      // 215: lload 2
      // 216: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: aload 1
      // 21d: new java/lang/StringBuilder
      // 220: dup
      // 221: invokespecial java/lang/StringBuilder.<init> ()V
      // 224: sipush 10676
      // 227: ldc2_w 560185577269763845
      // 22a: lload 2
      // 22b: lxor
      // 22c: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: aload 22
      // 236: ldc2_w 8187045108221622685
      // 239: lload 2
      // 23a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 242: sipush 27107
      // 245: ldc2_w 3728838688885825354
      // 248: lload 2
      // 249: lxor
      // 24a: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 252: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 255: lload 7
      // 257: dup2_x1
      // 258: pop2
      // 259: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 25c: aload 23
      // 25e: areturn
      // 25f: ldc2_w 8183606067831827168
      // 262: lload 2
      // 263: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: athrow
      // 269: aload 24
      // 26b: astore 25
      // 26d: aload 25
      // 26f: arraylength
      // 270: istore 26
      // 272: bipush 0
      // 273: istore 27
      // 275: iload 27
      // 277: iload 26
      // 279: if_icmpge 333
      // 27c: aload 25
      // 27e: iload 27
      // 280: aaload
      // 281: astore 28
      // 283: aload 18
      // 285: lload 2
      // 286: lconst_0
      // 287: lcmp
      // 288: ifle 330
      // 28b: ifnonnull 32e
      // 28e: aload 28
      // 290: ldc2_w 7585214407247063717
      // 293: lload 2
      // 294: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: ifeq 32b
      // 29c: goto 2a9
      // 29f: ldc2_w 8183606067831827168
      // 2a2: lload 2
      // 2a3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: athrow
      // 2a9: aload 28
      // 2ab: aload 18
      // 2ad: lload 2
      // 2ae: lconst_0
      // 2af: lcmp
      // 2b0: iflt 2f6
      // 2b3: ifnonnull 2f4
      // 2b6: goto 2c3
      // 2b9: ldc2_w 8183606067831827168
      // 2bc: lload 2
      // 2bd: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: athrow
      // 2c3: ldc2_w 7553443227422852430
      // 2c6: lload 2
      // 2c7: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: lload 13
      // 2ce: dup2_x1
      // 2cf: pop2
      // 2d0: aload 21
      // 2d2: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // 2d5: ifeq 32b
      // 2d8: goto 2e5
      // 2db: ldc2_w 8183606067831827168
      // 2de: lload 2
      // 2df: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: athrow
      // 2e5: aload 28
      // 2e7: goto 2f4
      // 2ea: ldc2_w 8183606067831827168
      // 2ed: lload 2
      // 2ee: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: athrow
      // 2f4: aload 6
      // 2f6: aload 23
      // 2f8: astore 15
      // 2fa: astore 16
      // 2fc: astore 17
      // 2fe: lload 9
      // 300: aload 17
      // 302: aload 16
      // 304: aload 15
      // 306: bipush 4
      // 307: anewarray 598
      // 30a: dup_x1
      // 30b: swap
      // 30c: bipush 3
      // 30d: swap
      // 30e: aastore
      // 30f: dup_x1
      // 310: swap
      // 311: bipush 2
      // 312: swap
      // 313: aastore
      // 314: dup_x1
      // 315: swap
      // 316: bipush 1
      // 317: swap
      // 318: aastore
      // 319: dup_x2
      // 31a: dup_x2
      // 31b: pop
      // 31c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31f: bipush 0
      // 320: swap
      // 321: aastore
      // 322: ldc2_w 8280981682339316923
      // 325: lload 2
      // 326: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: iinc 27 1
      // 32e: aload 18
      // 330: ifnull 275
      // 333: aload 23
      // 335: areturn
   }

   public static int m(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/io/InputStream
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast [B
      // 18: astore 1
      // 19: pop
      // 1a: getstatic com/zelix/w_.a J
      // 1d: lload 3
      // 1e: lxor
      // 1f: lstore 3
      // 20: ldc2_w 2301237663718199869
      // 23: lload 3
      // 24: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: bipush 0
      // 2a: istore 6
      // 2c: astore 5
      // 2e: aload 2
      // 2f: aload 1
      // 30: iload 6
      // 32: aload 1
      // 33: arraylength
      // 34: iload 6
      // 36: isub
      // 37: ldc2_w 17581278362513280
      // 3a: lload 3
      // 3b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: istore 7
      // 42: iload 7
      // 44: bipush -1
      // 45: if_icmpeq 54
      // 48: iload 6
      // 4a: iload 7
      // 4c: iadd
      // 4d: istore 6
      // 4f: aload 5
      // 51: ifnull 79
      // 54: iload 6
      // 56: aload 5
      // 58: ifnonnull 9a
      // 5b: ifne 93
      // 5e: goto 6b
      // 61: ldc2_w 13532690693135170
      // 64: lload 3
      // 65: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: bipush -1
      // 6c: lload 3
      // 6d: lconst_0
      // 6e: lcmp
      // 6f: ifle 95
      // 72: istore 6
      // 74: aload 5
      // 76: ifnull 93
      // 79: iload 6
      // 7b: aload 1
      // 7c: arraylength
      // 7d: if_icmplt 2e
      // 80: lload 3
      // 81: lconst_0
      // 82: lcmp
      // 83: ifle 4f
      // 86: goto 93
      // 89: ldc2_w 13532690693135170
      // 8c: lload 3
      // 8d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: iload 6
      // 95: aload 5
      // 97: ifnonnull 4d
      // 9a: lload 3
      // 9b: lconst_0
      // 9c: lcmp
      // 9d: ifle 56
      // a0: ireturn
   }

   public static File D(Object[] var0) {
      long var2 = (Long)var0[0];
      String var4 = (String)var0[1];
      pg var1 = (pg)var0[2];
      var2 = a ^ var2;
      long var5 = var2 ^ 30508750377436L;
      long var7 = var2 ^ 82213684665542L;
      long var9 = var2 ^ 23629190771833L;

      try {
         return x44.a<"v">(new Object[]{var4, var5, x44.a<"v">(new Object[]{var9}, 4231953054318425695L, var2), var1}, 4220977349054365877L, var2);
      } catch (IOException var12) {
         var1.G(var7, x44.a<"n">(var12, 4466281406487219144L, var2));
         return null;
      }
   }

   public static String Y(Object[] var0) {
      ZipFile var3 = (ZipFile)var0[0];
      long var4 = (Long)var0[1];
      ZipEntry var1 = (ZipEntry)var0[2];
      String var2 = (String)var0[3];
      var4 = a ^ var4;
      long var6 = var4 ^ 67718373720182L;
      InputStream var8 = x44.a<"j">(var3, var1, 9039910120796763553L, var4);
      long var10002 = x44.a<"j">(var1, 8983177809730715649L, var4);
      Object[] var10006 = new Object[]{null, null, null, null, var6};
      var10006[2] = var10002;
      var10006[1] = var2;
      var10006[0] = var8;
      return x44.a<"r">(var10006, 7063777613849418874L, var4);
   }

   public static String c(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w -4633466139643350432
      // 01c: lload 1
      // 01d: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 4
      // 024: aload 3
      // 025: invokevirtual java/lang/String.length ()I
      // 028: bipush 1
      // 029: aload 4
      // 02b: ifnonnull 0e8
      // 02e: if_icmple 0da
      // 031: goto 03e
      // 034: ldc2_w -6886795997239624929
      // 037: lload 1
      // 038: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: athrow
      // 03e: aload 3
      // 03f: aload 3
      // 040: invokevirtual java/lang/String.length ()I
      // 043: bipush 1
      // 044: isub
      // 045: invokevirtual java/lang/String.charAt (I)C
      // 048: istore 5
      // 04a: iload 5
      // 04c: ldc2_w -6728289633866470592
      // 04f: lload 1
      // 050: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: bipush 0
      // 056: invokevirtual java/lang/String.charAt (I)C
      // 059: aload 4
      // 05b: lload 1
      // 05c: lconst_0
      // 05d: lcmp
      // 05e: ifle 08b
      // 061: ifnonnull 089
      // 064: if_icmpeq 0ce
      // 067: goto 074
      // 06a: ldc2_w -6886795997239624929
      // 06d: lload 1
      // 06e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: iload 5
      // 076: ldc "/"
      // 078: bipush 0
      // 079: invokevirtual java/lang/String.charAt (I)C
      // 07c: goto 089
      // 07f: ldc2_w -6886795997239624929
      // 082: lload 1
      // 083: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 4
      // 08b: lload 1
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: ifle 0bb
      // 091: ifnonnull 0b9
      // 094: if_icmpeq 0ce
      // 097: goto 0a4
      // 09a: ldc2_w -6886795997239624929
      // 09d: lload 1
      // 09e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: iload 5
      // 0a6: ldc "\\"
      // 0a8: bipush 0
      // 0a9: invokevirtual java/lang/String.charAt (I)C
      // 0ac: goto 0b9
      // 0af: ldc2_w -6886795997239624929
      // 0b2: lload 1
      // 0b3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: ifnonnull 0fd
      // 0be: if_icmpne 0da
      // 0c1: goto 0ce
      // 0c4: ldc2_w -6886795997239624929
      // 0c7: lload 1
      // 0c8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 3
      // 0cf: bipush 0
      // 0d0: aload 3
      // 0d1: invokevirtual java/lang/String.length ()I
      // 0d4: bipush 1
      // 0d5: isub
      // 0d6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0d9: astore 3
      // 0da: aload 3
      // 0db: ldc2_w -6728289633866470592
      // 0de: lload 1
      // 0df: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 0e7: dup
      // 0e8: istore 5
      // 0ea: aload 4
      // 0ec: ifnonnull 159
      // 0ef: bipush -1
      // 0f0: goto 0fd
      // 0f3: ldc2_w -6886795997239624929
      // 0f6: lload 1
      // 0f7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: if_icmpgt 14a
      // 100: aload 3
      // 101: ldc "/"
      // 103: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 106: dup
      // 107: istore 5
      // 109: aload 4
      // 10b: lload 1
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: ifle 161
      // 111: ifnonnull 159
      // 114: bipush -1
      // 115: if_icmpgt 14a
      // 118: goto 125
      // 11b: ldc2_w -6886795997239624929
      // 11e: lload 1
      // 11f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: aload 3
      // 126: ldc "\\"
      // 128: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 12b: dup
      // 12c: lload 1
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: ifle 13a
      // 132: istore 5
      // 134: aload 4
      // 136: ifnonnull 1cf
      // 139: bipush -1
      // 13a: if_icmple 1b9
      // 13d: goto 14a
      // 140: ldc2_w -6886795997239624929
      // 143: lload 1
      // 144: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: iload 5
      // 14c: goto 159
      // 14f: ldc2_w -6886795997239624929
      // 152: lload 1
      // 153: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: lload 1
      // 15a: lconst_0
      // 15b: lcmp
      // 15c: ifle 197
      // 15f: aload 4
      // 161: ifnonnull 197
      // 164: ifne 1b1
      // 167: goto 174
      // 16a: ldc2_w -6886795997239624929
      // 16d: lload 1
      // 16e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: aload 3
      // 175: aload 4
      // 177: ifnonnull 1b0
      // 17a: goto 187
      // 17d: ldc2_w -6886795997239624929
      // 180: lload 1
      // 181: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: invokevirtual java/lang/String.length ()I
      // 18a: goto 197
      // 18d: ldc2_w -6886795997239624929
      // 190: lload 1
      // 191: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: bipush 1
      // 198: if_icmpne 1a7
      // 19b: aconst_null
      // 19c: areturn
      // 19d: ldc2_w -6886795997239624929
      // 1a0: lload 1
      // 1a1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 3
      // 1a8: bipush 0
      // 1a9: iload 5
      // 1ab: bipush 1
      // 1ac: iadd
      // 1ad: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1b0: areturn
      // 1b1: aload 3
      // 1b2: bipush 0
      // 1b3: iload 5
      // 1b5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1b8: areturn
      // 1b9: aload 3
      // 1ba: aload 4
      // 1bc: ifnonnull 1d4
      // 1bf: invokevirtual java/lang/String.length ()I
      // 1c2: goto 1cf
      // 1c5: ldc2_w -6886795997239624929
      // 1c8: lload 1
      // 1c9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: ifle 1d5
      // 1d2: ldc ""
      // 1d4: areturn
      // 1d5: aconst_null
      // 1d6: areturn
   }

   public static boolean M(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 1
      // 12: pop
      // 13: getstatic com/zelix/w_.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 7061317775212096556
      // 1c: lload 2
      // 1d: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: ldc2_w 6966081987723609156
      // 27: lload 2
      // 28: invokedynamic m (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 4
      // 2f: ifnonnull 5f
      // 32: ifne 4e
      // 35: goto 42
      // 38: ldc2_w 9088659347186771283
      // 3b: lload 2
      // 3c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
      // 44: ldc2_w 9088659347186771283
      // 47: lload 2
      // 48: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 1
      // 4f: sipush 7147
      // 52: ldc2_w 3951899922130879329
      // 55: lload 2
      // 56: lxor
      // 57: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: invokevirtual java/lang/String.lastIndexOf (I)I
      // 5f: istore 5
      // 61: iload 5
      // 63: aload 4
      // 65: ifnonnull bf
      // 68: bipush -1
      // 69: if_icmple be
      // 6c: goto 79
      // 6f: ldc2_w 9088659347186771283
      // 72: lload 2
      // 73: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 1
      // 7a: iload 5
      // 7c: aload 1
      // 7d: invokevirtual java/lang/String.length ()I
      // 80: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 83: astore 6
      // 85: aload 6
      // 87: sipush 16662
      // 8a: ldc2_w 1019639075544725557
      // 8d: lload 2
      // 8e: lxor
      // 8f: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: ldc2_w 7052192242055315951
      // 97: lload 2
      // 98: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: aload 4
      // 9f: ifnonnull bf
      // a2: ifeq be
      // a5: goto b2
      // a8: ldc2_w 9088659347186771283
      // ab: lload 2
      // ac: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: bipush 1
      // b3: ireturn
      // b4: ldc2_w 9088659347186771283
      // b7: lload 2
      // b8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: athrow
      // be: bipush 0
      // bf: ireturn
   }

   public static boolean g(char param0, String param1, short param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 0
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 32
      // 012: lshl
      // 013: bipush 32
      // 015: lushr
      // 016: lor
      // 017: getstatic com/zelix/w_.a J
      // 01a: lxor
      // 01b: lstore 4
      // 01d: ldc2_w 4016031732797766249
      // 020: lload 4
      // 022: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 1
      // 028: invokevirtual java/lang/String.length ()I
      // 02b: istore 7
      // 02d: aload 1
      // 02e: sipush 18339
      // 031: ldc2_w 4289707632582543726
      // 034: lload 4
      // 036: lxor
      // 037: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: invokevirtual java/lang/String.lastIndexOf (I)I
      // 03f: istore 8
      // 041: astore 6
      // 043: iload 8
      // 045: aload 6
      // 047: ifnonnull 154
      // 04a: ifle 153
      // 04d: goto 05b
      // 050: ldc2_w 2910590940855513878
      // 053: lload 4
      // 055: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: iload 8
      // 05d: iload 7
      // 05f: bipush 4
      // 060: isub
      // 061: aload 6
      // 063: ifnonnull 0ac
      // 066: goto 074
      // 069: ldc2_w 2910590940855513878
      // 06c: lload 4
      // 06e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: if_icmpeq 0af
      // 077: goto 085
      // 07a: ldc2_w 2910590940855513878
      // 07d: lload 4
      // 07f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: iload 8
      // 087: aload 6
      // 089: ifnonnull 154
      // 08c: goto 09a
      // 08f: ldc2_w 2910590940855513878
      // 092: lload 4
      // 094: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: iload 7
      // 09c: bipush 5
      // 09d: isub
      // 09e: goto 0ac
      // 0a1: ldc2_w 2910590940855513878
      // 0a4: lload 4
      // 0a6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: if_icmpne 153
      // 0af: aload 1
      // 0b0: iload 8
      // 0b2: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0b5: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0b8: astore 9
      // 0ba: aload 9
      // 0bc: sipush 27989
      // 0bf: ldc2_w 8744272362524246566
      // 0c2: lload 4
      // 0c4: lxor
      // 0c5: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cd: aload 6
      // 0cf: ifnonnull 152
      // 0d2: ifne 151
      // 0d5: goto 0e3
      // 0d8: ldc2_w 2910590940855513878
      // 0db: lload 4
      // 0dd: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 9
      // 0e5: sipush 30933
      // 0e8: ldc2_w 2347173964475012992
      // 0eb: lload 4
      // 0ed: lxor
      // 0ee: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f6: aload 6
      // 0f8: ifnonnull 152
      // 0fb: goto 109
      // 0fe: ldc2_w 2910590940855513878
      // 101: lload 4
      // 103: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: ifne 151
      // 10c: goto 11a
      // 10f: ldc2_w 2910590940855513878
      // 112: lload 4
      // 114: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 9
      // 11c: sipush 9391
      // 11f: ldc2_w 790293896232094672
      // 122: lload 4
      // 124: lxor
      // 125: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 12d: aload 6
      // 12f: ifnonnull 154
      // 132: goto 140
      // 135: ldc2_w 2910590940855513878
      // 138: lload 4
      // 13a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: ifeq 153
      // 143: goto 151
      // 146: ldc2_w 2910590940855513878
      // 149: lload 4
      // 14b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: bipush 1
      // 152: ireturn
      // 153: bipush 0
      // 154: ireturn
   }

   public static BufferedReader E(Object[] var0) {
      File var1 = (File)var0[0];
      long var3 = (Long)var0[1];
      String var2 = (String)var0[2];
      var3 = a ^ var3;
      long var5 = var3 ^ 124398143942040L;
      return x44.a<"v">(new Object[]{new FileInputStream(var1), var2, null, var5}, -2052185041695860143L, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File h(Object[] var0) {
      ZipFile var4 = (ZipFile)var0[0];
      long var2 = (Long)var0[1];
      ZipEntry var1 = (ZipEntry)var0[2];
      var2 = a ^ var2;
      long var5 = var2 ^ 106878470163218L;
      String var10000 = x44.a<"v">(-7226974975538833818L, var2);
      BufferedInputStream var8 = null;
      String var7 = var10000;
      boolean var20 = false /* VF: Semaphore variable */;

      File var9;
      try {
         var20 = true;
         var8 = new BufferedInputStream(x44.a<"n">(var4, var1, -8662617966378463459L, var2));
         var9 = x44.a<"v">(new Object[]{var8, var5, x44.a<"n">(var4, -8751791877626651389L, var2) + "!" + var1.getName()}, -7433616408147106354L, var2);
         var20 = false;
      } finally {
         if (var20) {
            label89: {
               label88: {
                  try {
                     if (var2 < 0L) {
                        break label89;
                     }

                     var31 = var8;
                     if (var7 != null) {
                        break label88;
                     }

                     if (var8 == null) {
                        break label89;
                     }
                  } catch (IOException var23) {
                     throw x44.a<"v">(var23, -8905006161679605991L, var2);
                  }

                  try {
                     var31 = var8;
                  } catch (IOException var22) {
                     boolean var10001 = false;
                     break label89;
                  }
               }

               try {
                  x44.a<"n">(var31, -9027304994675608466L, var2);
               } catch (IOException var21) {
                  boolean var33 = false;
               }
            }
         }
      }

      label105: {
         try {
            var32 = var8;
            if (var7 != null) {
               break label105;
            }

            if (var8 == null) {
               return var9;
            }
         } catch (IOException var27) {
            throw x44.a<"v">(var27, -8905006161679605991L, var2);
         }

         try {
            var32 = var8;
         } catch (IOException var26) {
            boolean var34 = false;
            return var9;
         }
      }

      try {
         x44.a<"n">(var32, -9027304994675608466L, var2);
      } catch (IOException var25) {
         boolean var35 = false;
      }

      return var9;
   }

   public static BufferedReader m(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 3099873154249L;
      return x44.a<"w">(new Object[]{new FileInputStream(var1.trim()), (String)null, null, var4}, 6544961032276779776L, var2);
   }

   public static List q(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return x44.a<"i">(-6408793993274897565L, var1);
   }

   public static boolean w(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 73766265047119
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: ldc2_w 3983357383963474581
      // 025: lload 1
      // 026: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: aload 3
      // 02c: sipush 7147
      // 02f: ldc2_w 3951791573950797272
      // 032: lload 1
      // 033: lxor
      // 034: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: invokevirtual java/lang/String.lastIndexOf (I)I
      // 03c: istore 7
      // 03e: astore 6
      // 040: iload 7
      // 042: bipush -1
      // 043: if_icmple 12f
      // 046: aload 3
      // 047: iload 7
      // 049: aload 3
      // 04a: invokevirtual java/lang/String.length ()I
      // 04d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 050: astore 8
      // 052: aload 8
      // 054: sipush 26437
      // 057: ldc2_w 6474092881062004943
      // 05a: lload 1
      // 05b: lxor
      // 05c: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: ldc2_w 3992166259843159894
      // 064: lload 1
      // 065: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 6
      // 06c: ifnonnull 12e
      // 06f: ifne 12d
      // 072: goto 07f
      // 075: ldc2_w 2925099988056847338
      // 078: lload 1
      // 079: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 8
      // 081: sipush 14469
      // 084: ldc2_w 4774432456346720040
      // 087: lload 1
      // 088: lxor
      // 089: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: ldc2_w 3992166259843159894
      // 091: lload 1
      // 092: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: aload 6
      // 099: ifnonnull 12e
      // 09c: goto 0a9
      // 09f: ldc2_w 2925099988056847338
      // 0a2: lload 1
      // 0a3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: ifne 12d
      // 0ac: goto 0b9
      // 0af: ldc2_w 2925099988056847338
      // 0b2: lload 1
      // 0b3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 8
      // 0bb: sipush 25091
      // 0be: ldc2_w 112565664688508335
      // 0c1: lload 1
      // 0c2: lxor
      // 0c3: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: ldc2_w 3992166259843159894
      // 0cb: lload 1
      // 0cc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: aload 6
      // 0d3: ifnonnull 12e
      // 0d6: goto 0e3
      // 0d9: ldc2_w 2925099988056847338
      // 0dc: lload 1
      // 0dd: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: ifne 12d
      // 0e6: goto 0f3
      // 0e9: ldc2_w 2925099988056847338
      // 0ec: lload 1
      // 0ed: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 8
      // 0f5: sipush 7809
      // 0f8: ldc2_w 3488371558832566540
      // 0fb: lload 1
      // 0fc: lxor
      // 0fd: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: ldc2_w 3992166259843159894
      // 105: lload 1
      // 106: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: aload 6
      // 10d: ifnonnull 12e
      // 110: goto 11d
      // 113: ldc2_w 2925099988056847338
      // 116: lload 1
      // 117: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: ifeq 12f
      // 120: goto 12d
      // 123: ldc2_w 2925099988056847338
      // 126: lload 1
      // 127: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: bipush 1
      // 12e: ireturn
      // 12f: ldc2_w 3587686496665001382
      // 132: lload 1
      // 133: invokedynamic l (JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: aload 6
      // 13a: ifnonnull 156
      // 13d: ifnull 1df
      // 140: goto 14d
      // 143: ldc2_w 2925099988056847338
      // 146: lload 1
      // 147: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: ldc2_w 3587686496665001382
      // 150: lload 1
      // 151: invokedynamic l (JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 15b: astore 8
      // 15d: aload 8
      // 15f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 164: ifeq 1df
      // 167: aload 8
      // 169: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16e: checkcast java/lang/String
      // 171: astore 9
      // 173: aload 9
      // 175: ldc "*"
      // 177: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 17a: aload 6
      // 17c: lload 1
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: iflt 187
      // 182: ifnonnull 1e0
      // 185: aload 6
      // 187: lload 1
      // 188: lconst_0
      // 189: lcmp
      // 18a: iflt 1c5
      // 18d: ifnonnull 1c3
      // 190: goto 19d
      // 193: ldc2_w 2925099988056847338
      // 196: lload 1
      // 197: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: bipush -1
      // 19e: if_icmple 1da
      // 1a1: goto 1ae
      // 1a4: ldc2_w 2925099988056847338
      // 1a7: lload 1
      // 1a8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: lload 4
      // 1b0: aload 3
      // 1b1: aload 9
      // 1b3: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // 1b6: goto 1c3
      // 1b9: ldc2_w 2925099988056847338
      // 1bc: lload 1
      // 1bd: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: aload 6
      // 1c5: ifnonnull 1d9
      // 1c8: ifeq 1da
      // 1cb: goto 1d8
      // 1ce: ldc2_w 2925099988056847338
      // 1d1: lload 1
      // 1d2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: bipush 1
      // 1d9: ireturn
      // 1da: aload 6
      // 1dc: ifnull 15d
      // 1df: bipush 0
      // 1e0: ireturn
   }

   public static BufferedReader l(Object[] var0) {
      long var1 = (Long)var0[0];
      File var3 = (File)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 55046289155148L;
      return x44.a<"r">(new Object[]{new FileInputStream(var3), (String)null, null, var4}, 3049341156194636677L, var1);
   }

   public static boolean I(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/io/File
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 42399634356032
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 48
      // 022: lushr
      // 023: l2i
      // 024: istore 4
      // 026: dup2
      // 027: bipush 16
      // 029: lshl
      // 02a: bipush 48
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 5
      // 030: dup2
      // 031: bipush 32
      // 033: lshl
      // 034: bipush 32
      // 036: lushr
      // 037: l2i
      // 038: istore 6
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 71401654294142
      // 03f: lxor
      // 040: lstore 7
      // 042: dup2
      // 043: ldc2_w 24883187954228
      // 046: lxor
      // 047: lstore 9
      // 049: pop2
      // 04a: ldc2_w 5557338935976657101
      // 04d: lload 2
      // 04e: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: aload 1
      // 054: ldc2_w 5440673849532392988
      // 057: lload 2
      // 058: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: astore 12
      // 05f: astore 11
      // 061: lload 7
      // 063: aload 12
      // 065: bipush 2
      // 066: anewarray 598
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 1
      // 06c: swap
      // 06d: aastore
      // 06e: dup_x2
      // 06f: dup_x2
      // 070: pop
      // 071: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 074: bipush 0
      // 075: swap
      // 076: aastore
      // 077: ldc2_w 5908164341779388521
      // 07a: lload 2
      // 07b: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: aload 11
      // 082: ifnonnull 111
      // 085: ifne 110
      // 088: goto 095
      // 08b: ldc2_w 5962786582936471986
      // 08e: lload 2
      // 08f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: iload 4
      // 097: i2c
      // 098: aload 12
      // 09a: iload 5
      // 09c: i2s
      // 09d: iload 6
      // 09f: ldc2_w 5604702709116672455
      // 0a2: lload 2
      // 0a3: invokedynamic u (CLjava/lang/Object;SIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: aload 11
      // 0aa: lload 2
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: iflt 0fd
      // 0b0: ifnonnull 0fb
      // 0b3: goto 0c0
      // 0b6: ldc2_w 5962786582936471986
      // 0b9: lload 2
      // 0ba: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: ifeq 114
      // 0c3: goto 0d0
      // 0c6: ldc2_w 5962786582936471986
      // 0c9: lload 2
      // 0ca: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 1
      // 0d1: lload 9
      // 0d3: bipush 2
      // 0d4: anewarray 598
      // 0d7: dup_x2
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dd: bipush 1
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 0
      // 0e3: swap
      // 0e4: aastore
      // 0e5: ldc2_w 5952027004408214375
      // 0e8: lload 2
      // 0e9: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: goto 0fb
      // 0f1: ldc2_w 5962786582936471986
      // 0f4: lload 2
      // 0f5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 11
      // 0fd: ifnonnull 111
      // 100: ifeq 114
      // 103: goto 110
      // 106: ldc2_w 5962786582936471986
      // 109: lload 2
      // 10a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 115
      // 114: bipush 0
      // 115: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File v(Object[] var0) {
      BufferedInputStream var4 = (BufferedInputStream)var0[0];
      long var1 = (Long)var0[1];
      String var3 = (String)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 69283036108175L;
      File var8 = x44.a<"p">(new Object[]{var3, var5}, -9121783836390875524L, var1);
      String var10000 = x44.a<"p">(-7114971682811883376L, var1);
      BufferedOutputStream var9 = null;
      String var7 = var10000;
      boolean var25 = false /* VF: Semaphore variable */;

      try {
         var25 = true;
         var9 = new BufferedOutputStream(new FileOutputStream(var8));
         int var10 = x44.a<"h">(var4, -9058401543228112702L, var1);
         byte[] var11 = new byte[b<"k">(6191, 8206068031296519182L ^ var1)];
         int var12 = 0;
         int var13 = 0;

         label169:
         while (true) {
            if ((var12 = x44.a<"h">(var4, var11, -7331893594807162597L, var1)) != -1) {
               var13 += var12;

               try {
                  x44.a<"h">(var9, var11, 0, var12, -8872914637995382419L, var1);
               } catch (IOException var33) {
                  boolean var46 = false;
                  throw x44.a<"p">(var33, -9035001038025123345L, var1);
               }

               do {
                  try {
                     var10000 = var7;
                     if (var1 > 0L) {
                        if (var7 != null) {
                           var25 = false;
                           return var8;
                        }

                        var10000 = var7;
                     }

                     if (var10000 == null) {
                        continue label169;
                     }
                  } catch (IOException var32) {
                     boolean var47 = false;
                     throw x44.a<"p">(var32, -9035001038025123345L, var1);
                  }
               } while (var1 <= 0L);

               var25 = false;
               break;
            }

            var25 = false;
            break;
         }
      } finally {
         if (var25) {
            label130: {
               label129: {
                  try {
                     if (var1 <= 0L) {
                        break label130;
                     }

                     var41 = var9;
                     if (var7 != null) {
                        break label129;
                     }

                     if (var9 == null) {
                        break label130;
                     }
                  } catch (IOException var28) {
                     throw x44.a<"p">(var28, -9035001038025123345L, var1);
                  }

                  try {
                     var41 = var9;
                  } catch (IOException var27) {
                     boolean var10001 = false;
                     break label130;
                  }
               }

               try {
                  x44.a<"h">(var41, -9220029012522486594L, var1);
               } catch (IOException var26) {
                  boolean var45 = false;
               }
            }
         }
      }

      label146: {
         try {
            if (var1 < 0L) {
               return var8;
            }

            var44 = var9;
            if (var7 != null) {
               break label146;
            }

            if (var9 == null) {
               return var8;
            }
         } catch (IOException var31) {
            throw x44.a<"p">(var31, -9035001038025123345L, var1);
         }

         try {
            var44 = var9;
         } catch (IOException var30) {
            boolean var48 = false;
            return var8;
         }
      }

      try {
         x44.a<"h">(var44, -9220029012522486594L, var1);
      } catch (IOException var29) {
         boolean var49 = false;
      }

      return var8;
   }

   public static boolean r(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/w_.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w -2969387426443977960
      // 01c: lload 2
      // 01d: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 4
      // 024: aload 1
      // 025: aload 4
      // 027: ifnonnull 04b
      // 02a: ifnull 069
      // 02d: goto 03a
      // 030: ldc2_w -3957206938861088153
      // 033: lload 2
      // 034: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: athrow
      // 03a: aload 1
      // 03b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 03e: goto 04b
      // 041: ldc2_w -3957206938861088153
      // 044: lload 2
      // 045: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: invokevirtual java/lang/String.length ()I
      // 04e: lload 2
      // 04f: lconst_0
      // 050: lcmp
      // 051: ifle 07f
      // 054: aload 4
      // 056: ifnonnull 07f
      // 059: ifne 075
      // 05c: goto 069
      // 05f: ldc2_w -3957206938861088153
      // 062: lload 2
      // 063: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: bipush 0
      // 06a: ireturn
      // 06b: ldc2_w -3957206938861088153
      // 06e: lload 2
      // 06f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: aload 1
      // 076: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 079: astore 1
      // 07a: aload 1
      // 07b: bipush 0
      // 07c: invokevirtual java/lang/String.charAt (I)C
      // 07f: ldc2_w -2892997727680553769
      // 082: lload 2
      // 083: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: lload 2
      // 089: lconst_0
      // 08a: lcmp
      // 08b: ifle 0c6
      // 08e: aload 4
      // 090: ifnonnull 0c6
      // 093: if_icmpne 0af
      // 096: goto 0a3
      // 099: ldc2_w -3957206938861088153
      // 09c: lload 2
      // 09d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: bipush 0
      // 0a4: ireturn
      // 0a5: ldc2_w -3957206938861088153
      // 0a8: lload 2
      // 0a9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 1
      // 0b0: invokevirtual java/lang/String.length ()I
      // 0b3: aload 4
      // 0b5: ifnonnull 13a
      // 0b8: bipush 1
      // 0b9: goto 0c6
      // 0bc: ldc2_w -3957206938861088153
      // 0bf: lload 2
      // 0c0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: if_icmple 139
      // 0c9: aload 1
      // 0ca: bipush 0
      // 0cb: invokevirtual java/lang/String.charAt (I)C
      // 0ce: ldc2_w -3984133107934271727
      // 0d1: lload 2
      // 0d2: invokedynamic p (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 4
      // 0d9: ifnonnull 13a
      // 0dc: goto 0e9
      // 0df: ldc2_w -3957206938861088153
      // 0e2: lload 2
      // 0e3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: ifeq 139
      // 0ec: goto 0f9
      // 0ef: ldc2_w -3957206938861088153
      // 0f2: lload 2
      // 0f3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: bipush 1
      // 0fb: invokevirtual java/lang/String.charAt (I)C
      // 0fe: aload 4
      // 100: ifnonnull 13a
      // 103: goto 110
      // 106: ldc2_w -3957206938861088153
      // 109: lload 2
      // 10a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: sipush 18480
      // 113: ldc2_w 4517905254570633103
      // 116: lload 2
      // 117: lxor
      // 118: invokedynamic k (IJ)I bsm=com/zelix/w_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: if_icmpne 139
      // 120: goto 12d
      // 123: ldc2_w -3957206938861088153
      // 126: lload 2
      // 127: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: bipush 0
      // 12e: ireturn
      // 12f: ldc2_w -3957206938861088153
      // 132: lload 2
      // 133: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: bipush 1
      // 13a: ireturn
   }

   public static String K(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/w_.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w -4217171985264310101
      // 1c: lload 1
      // 1d: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aconst_null
      // 23: astore 5
      // 25: astore 4
      // 27: aload 3
      // 28: ldc2_w -2742499046663703433
      // 2b: lload 1
      // 2c: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: ldc2_w -2465721550053446338
      // 34: lload 1
      // 35: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: astore 5
      // 3c: goto 5f
      // 3f: astore 6
      // 41: aload 3
      // 42: sipush 22707
      // 45: ldc2_w 7502905540534748431
      // 48: lload 1
      // 49: lxor
      // 4a: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/w_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: ldc2_w -2465721550053446338
      // 52: lload 1
      // 53: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: astore 5
      // 5a: goto 5f
      // 5d: astore 7
      // 5f: aload 5
      // 61: aload 4
      // 63: ifnonnull 84
      // 66: ifnull 83
      // 69: goto 76
      // 6c: ldc2_w -2691418702600650284
      // 6f: lload 1
      // 70: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 5
      // 78: areturn
      // 79: ldc2_w -2691418702600650284
      // 7c: lload 1
      // 7d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: aload 3
      // 84: areturn
   }

   public static String b(Object[] var0) {
      long var2 = (Long)var0[0];
      File var1 = (File)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 98893028378298L;
      return x44.a<"u">(new Object[]{var1, x44.a<"l">(4381640593158820169L, var2), var4}, 4372685993638680128L, var2);
   }

   public static boolean Q(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/w_.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w 4816540154630901509
      // 1c: lload 1
      // 1d: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 3
      // 25: ldc "*"
      // 27: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2a: aload 4
      // 2c: ifnonnull 4e
      // 2f: bipush -1
      // 30: if_icmple 51
      // 33: goto 40
      // 36: ldc2_w 6703741494389163642
      // 39: lload 1
      // 3a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 4e
      // 44: ldc2_w 6703741494389163642
      // 47: lload 1
      // 48: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: goto 52
      // 51: bipush 0
      // 52: ireturn
   }

   private static void j(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/io/File
      // 012: astore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/util/List
      // 020: astore 3
      // 021: pop
      // 022: getstatic com/zelix/w_.a J
      // 025: lload 4
      // 027: lxor
      // 028: lstore 4
      // 02a: lload 4
      // 02c: dup2
      // 02d: ldc2_w 82788991208932
      // 030: lxor
      // 031: lstore 6
      // 033: dup2
      // 034: ldc2_w 34964119199415
      // 037: lxor
      // 038: lstore 8
      // 03a: pop2
      // 03b: ldc2_w -2179770033193636755
      // 03e: lload 4
      // 040: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: aload 1
      // 046: ldc2_w -27661718671170944
      // 049: lload 4
      // 04b: invokedynamic m (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: astore 11
      // 052: astore 10
      // 054: aload 11
      // 056: astore 12
      // 058: aload 12
      // 05a: arraylength
      // 05b: istore 13
      // 05d: bipush 0
      // 05e: istore 14
      // 060: iload 14
      // 062: iload 13
      // 064: if_icmpge 16e
      // 067: aload 12
      // 069: iload 14
      // 06b: aaload
      // 06c: astore 15
      // 06e: aload 15
      // 070: aload 10
      // 072: ifnonnull 0e6
      // 075: ldc2_w -1822185265134082729
      // 078: lload 4
      // 07a: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: ifeq 0d6
      // 082: goto 090
      // 085: ldc2_w -116998846499691246
      // 088: lload 4
      // 08a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: lload 6
      // 092: aload 15
      // 094: aload 2
      // 095: aload 3
      // 096: bipush 4
      // 097: anewarray 598
      // 09a: dup_x1
      // 09b: swap
      // 09c: bipush 3
      // 09d: swap
      // 09e: aastore
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: bipush 2
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: bipush 1
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x2
      // 0aa: dup_x2
      // 0ab: pop
      // 0ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0af: bipush 0
      // 0b0: swap
      // 0b1: aastore
      // 0b2: ldc2_w -208959434959647927
      // 0b5: lload 4
      // 0b7: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: aload 10
      // 0be: lload 4
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifle 16b
      // 0c5: ifnull 166
      // 0c8: goto 0d6
      // 0cb: ldc2_w -116998846499691246
      // 0ce: lload 4
      // 0d0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 15
      // 0d8: goto 0e6
      // 0db: ldc2_w -116998846499691246
      // 0de: lload 4
      // 0e0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: ldc2_w -1792031402493539652
      // 0e9: lload 4
      // 0eb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: astore 16
      // 0f2: ldc2_w -1802352114489873543
      // 0f5: lload 4
      // 0f7: invokedynamic l (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: aload 10
      // 0fe: lload 4
      // 100: lconst_0
      // 101: lcmp
      // 102: ifle 131
      // 105: ifnonnull 12f
      // 108: ifne 127
      // 10b: goto 119
      // 10e: ldc2_w -116998846499691246
      // 111: lload 4
      // 113: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: aload 16
      // 11b: ldc2_w -363595259890923697
      // 11e: lload 4
      // 120: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: astore 16
      // 127: lload 8
      // 129: aload 16
      // 12b: aload 2
      // 12c: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // 12f: aload 10
      // 131: ifnonnull 165
      // 134: ifeq 166
      // 137: goto 145
      // 13a: ldc2_w -116998846499691246
      // 13d: lload 4
      // 13f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: aload 3
      // 146: aload 15
      // 148: ldc2_w -113594595241118097
      // 14b: lload 4
      // 14d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 157: goto 165
      // 15a: ldc2_w -116998846499691246
      // 15d: lload 4
      // 15f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: pop
      // 166: iinc 14 1
      // 169: aload 10
      // 16b: ifnull 060
      // 16e: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19069;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/w_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/w_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11217;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = g[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/w_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/w_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7903;
      if (o[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = m[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/w_", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         o[var3] = var15;
      }

      return o[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/w_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
