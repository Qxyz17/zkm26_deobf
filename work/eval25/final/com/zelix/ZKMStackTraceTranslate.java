package com.zelix;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ZKMStackTraceTranslate extends ee {
   public static final int UNQUALIFIED_PARAM_TYPES;
   public static final int NO_PARAM_TYPES = 1;
   private ArrayList d;
   private yr G;
   public static final int FULL_PARAM_TYPES;
   private Set j;
   private static final long a = ess.a(7954169796569930923L, 7176208250897474988L, MethodHandles.lookup().lookupClass()).a(27882287295724L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public String getOldMethodName(String var1, String var2, String[] var3, String var4) {
      long var5 = a ^ 58545228985248L;
      long var7 = var5 ^ 7340389956978L;

      try {
         return x44.a<"m">(x44.a<"i">(this, 3571078724720202044L, var5), new Object[]{var1, var7, var2, var3, var4}, 2905331143916760865L, var5);
      } catch (_sf var10) {
         return a<"p">(30030, 8857827990613544292L ^ var5) + x44.a<"m">(var10, 3882762260254231058L, var5) + "\"" + x44.a<"l">(2979001607851514285L, var5);
      }
   }

   private static void Y(Object[] param0) {
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
      // 00b: pop
      // 00c: getstatic com/zelix/ZKMStackTraceTranslate.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 40564220302744
      // 017: lxor
      // 018: lstore 3
      // 019: dup2
      // 01a: ldc2_w 56332201667118
      // 01d: lxor
      // 01e: lstore 5
      // 020: pop2
      // 021: ldc2_w -6069123522727358134
      // 024: lload 1
      // 025: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: astore 7
      // 02c: ldc2_w -5877100931998349821
      // 02f: lload 1
      // 030: invokedynamic h (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 7
      // 037: ifnonnull 06e
      // 03a: ifeq 0e7
      // 03d: goto 04a
      // 040: ldc2_w -5396044200034999182
      // 043: lload 1
      // 044: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: athrow
      // 04a: lload 3
      // 04b: bipush 1
      // 04c: anewarray 315
      // 04f: dup_x2
      // 050: dup_x2
      // 051: pop
      // 052: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055: bipush 0
      // 056: swap
      // 057: aastore
      // 058: ldc2_w -5894245904506493552
      // 05b: lload 1
      // 05c: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: goto 06e
      // 064: ldc2_w -5396044200034999182
      // 067: lload 1
      // 068: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: aload 7
      // 070: ifnonnull 0de
      // 073: sipush 24283
      // 076: ldc2_w 2512408594416677221
      // 079: lload 1
      // 07a: lxor
      // 07b: invokedynamic q (IJ)I bsm=com/zelix/ZKMStackTraceTranslate.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: if_icmpge 0e7
      // 083: goto 090
      // 086: ldc2_w -5396044200034999182
      // 089: lload 1
      // 08a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: ldc2_w -6175219943567362272
      // 093: lload 1
      // 094: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: new java/lang/StringBuilder
      // 09c: dup
      // 09d: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a0: ldc2_w -5630724136523595487
      // 0a3: lload 1
      // 0a4: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ac: ldc2_w -5261993473932152043
      // 0af: lload 1
      // 0b0: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b8: ldc2_w -5630724136523595487
      // 0bb: lload 1
      // 0bc: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c7: ldc2_w -6193332186610626798
      // 0ca: lload 1
      // 0cb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: bipush 1
      // 0d1: goto 0de
      // 0d4: ldc2_w -5396044200034999182
      // 0d7: lload 1
      // 0d8: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: ldc2_w -5856069581639562913
      // 0e1: lload 1
      // 0e2: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: ldc2_w -5488244211541690174
      // 0ea: lload 1
      // 0eb: invokedynamic q (JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: goto 456
      // 0f3: astore 8
      // 0f5: ldc2_w -6175219943567362272
      // 0f8: lload 1
      // 0f9: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: new java/lang/StringBuilder
      // 101: dup
      // 102: invokespecial java/lang/StringBuilder.<init> ()V
      // 105: ldc2_w -5630724136523595487
      // 108: lload 1
      // 109: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 111: sipush 8657
      // 114: ldc2_w 1273756104575189346
      // 117: lload 1
      // 118: lxor
      // 119: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 121: sipush 24273
      // 124: ldc2_w 7528759936311819892
      // 127: lload 1
      // 128: lxor
      // 129: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: ldc2_w -5630724136523595487
      // 134: lload 1
      // 135: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 140: ldc2_w -6193332186610626798
      // 143: lload 1
      // 144: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: goto 456
      // 14c: astore 8
      // 14e: sipush 10919
      // 151: ldc2_w 176015560264616476
      // 154: lload 1
      // 155: lxor
      // 156: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: ldc2_w -5343345116200650040
      // 15e: lload 1
      // 15f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: astore 9
      // 166: aload 9
      // 168: lload 1
      // 169: lconst_0
      // 16a: lcmp
      // 16b: ifle 185
      // 16e: aload 7
      // 170: ifnonnull 185
      // 173: ifnull 2ba
      // 176: goto 183
      // 179: ldc2_w -5396044200034999182
      // 17c: lload 1
      // 17d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: aload 9
      // 185: sipush 14697
      // 188: ldc2_w 4052264794590484957
      // 18b: lload 1
      // 18c: lxor
      // 18d: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 195: lload 1
      // 196: lconst_0
      // 197: lcmp
      // 198: iflt 214
      // 19b: aload 7
      // 19d: ifnonnull 214
      // 1a0: bipush -1
      // 1a1: if_icmpne 1e8
      // 1a4: goto 1b1
      // 1a7: ldc2_w -5396044200034999182
      // 1aa: lload 1
      // 1ab: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: ldc2_w -6175219943567362272
      // 1b4: lload 1
      // 1b5: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: sipush 211
      // 1bd: ldc2_w 8671953004009201772
      // 1c0: lload 1
      // 1c1: lxor
      // 1c2: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: ldc2_w -6193332186610626798
      // 1ca: lload 1
      // 1cb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: lload 1
      // 1d1: lconst_0
      // 1d2: lcmp
      // 1d3: iflt 31c
      // 1d6: aload 7
      // 1d8: ifnull 2e6
      // 1db: goto 1e8
      // 1de: ldc2_w -5396044200034999182
      // 1e1: lload 1
      // 1e2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: aload 9
      // 1ea: lload 5
      // 1ec: bipush 2
      // 1ed: anewarray 315
      // 1f0: dup_x2
      // 1f1: dup_x2
      // 1f2: pop
      // 1f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f6: bipush 1
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x1
      // 1fa: swap
      // 1fb: bipush 0
      // 1fc: swap
      // 1fd: aastore
      // 1fe: ldc2_w -5864015884059190866
      // 201: lload 1
      // 202: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: goto 214
      // 20a: ldc2_w -5396044200034999182
      // 20d: lload 1
      // 20e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: ifeq 283
      // 217: ldc2_w -6175219943567362272
      // 21a: lload 1
      // 21b: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: new java/lang/StringBuilder
      // 223: dup
      // 224: invokespecial java/lang/StringBuilder.<init> ()V
      // 227: ldc2_w -5630724136523595487
      // 22a: lload 1
      // 22b: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 233: sipush 1611
      // 236: ldc2_w 5395683065193113323
      // 239: lload 1
      // 23a: lxor
      // 23b: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: sipush 29396
      // 246: ldc2_w 578739343427687029
      // 249: lload 1
      // 24a: lxor
      // 24b: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 253: ldc2_w -5630724136523595487
      // 256: lload 1
      // 257: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 262: ldc2_w -6193332186610626798
      // 265: lload 1
      // 266: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: lload 1
      // 26c: lconst_0
      // 26d: lcmp
      // 26e: iflt 31c
      // 271: aload 7
      // 273: ifnull 2e6
      // 276: goto 283
      // 279: ldc2_w -5396044200034999182
      // 27c: lload 1
      // 27d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: athrow
      // 283: ldc2_w -6175219943567362272
      // 286: lload 1
      // 287: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: sipush 12938
      // 28f: ldc2_w 927130364307575346
      // 292: lload 1
      // 293: lxor
      // 294: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: ldc2_w -6193332186610626798
      // 29c: lload 1
      // 29d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: lload 1
      // 2a3: lconst_0
      // 2a4: lcmp
      // 2a5: ifle 31c
      // 2a8: aload 7
      // 2aa: ifnull 2e6
      // 2ad: goto 2ba
      // 2b0: ldc2_w -5396044200034999182
      // 2b3: lload 1
      // 2b4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: athrow
      // 2ba: ldc2_w -6175219943567362272
      // 2bd: lload 1
      // 2be: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c3: sipush 31668
      // 2c6: ldc2_w 4100115146450623233
      // 2c9: lload 1
      // 2ca: lxor
      // 2cb: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: ldc2_w -6193332186610626798
      // 2d3: lload 1
      // 2d4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: goto 2e6
      // 2dc: ldc2_w -5396044200034999182
      // 2df: lload 1
      // 2e0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: ldc2_w -6175219943567362272
      // 2e9: lload 1
      // 2ea: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: new java/lang/StringBuilder
      // 2f2: dup
      // 2f3: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f6: sipush 15742
      // 2f9: ldc2_w 1130761373719174611
      // 2fc: lload 1
      // 2fd: lxor
      // 2fe: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 306: aload 9
      // 308: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30b: ldc "\""
      // 30d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 310: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 313: ldc2_w -6193332186610626798
      // 316: lload 1
      // 317: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: goto 456
      // 31f: astore 8
      // 321: aload 8
      // 323: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 326: astore 9
      // 328: ldc2_w -6175219943567362272
      // 32b: lload 1
      // 32c: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: new java/lang/StringBuilder
      // 334: dup
      // 335: invokespecial java/lang/StringBuilder.<init> ()V
      // 338: ldc2_w -5630724136523595487
      // 33b: lload 1
      // 33c: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 344: sipush 2601
      // 347: ldc2_w 4060163023284218519
      // 34a: lload 1
      // 34b: lxor
      // 34c: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 354: sipush 29396
      // 357: ldc2_w 578739343427687029
      // 35a: lload 1
      // 35b: lxor
      // 35c: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 364: ldc2_w -5630724136523595487
      // 367: lload 1
      // 368: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 370: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 373: ldc2_w -6193332186610626798
      // 376: lload 1
      // 377: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: aload 9
      // 37e: ldc2_w -6175219943567362272
      // 381: lload 1
      // 382: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: ldc2_w -5672199447967859181
      // 38a: lload 1
      // 38b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 390: goto 456
      // 393: astore 8
      // 395: ldc2_w -6175219943567362272
      // 398: lload 1
      // 399: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39e: new java/lang/StringBuilder
      // 3a1: dup
      // 3a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a5: ldc2_w -5630724136523595487
      // 3a8: lload 1
      // 3a9: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b1: sipush 13347
      // 3b4: ldc2_w 139702894107890835
      // 3b7: lload 1
      // 3b8: lxor
      // 3b9: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c1: sipush 29396
      // 3c4: ldc2_w 578739343427687029
      // 3c7: lload 1
      // 3c8: lxor
      // 3c9: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d1: ldc2_w -5630724136523595487
      // 3d4: lload 1
      // 3d5: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3dd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3e0: ldc2_w -6193332186610626798
      // 3e3: lload 1
      // 3e4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: goto 456
      // 3ec: astore 8
      // 3ee: ldc2_w -6175219943567362272
      // 3f1: lload 1
      // 3f2: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: new java/lang/StringBuilder
      // 3fa: dup
      // 3fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 3fe: ldc2_w -5630724136523595487
      // 401: lload 1
      // 402: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 407: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40a: sipush 7780
      // 40d: ldc2_w 4839533726300585693
      // 410: lload 1
      // 411: lxor
      // 412: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41a: sipush 29396
      // 41d: ldc2_w 578739343427687029
      // 420: lload 1
      // 421: lxor
      // 422: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 427: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42a: ldc2_w -5630724136523595487
      // 42d: lload 1
      // 42e: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 433: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 436: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 439: ldc2_w -6193332186610626798
      // 43c: lload 1
      // 43d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 442: aload 8
      // 444: ldc2_w -6175219943567362272
      // 447: lload 1
      // 448: invokedynamic h (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44d: ldc2_w -5672199447967859181
      // 450: lload 1
      // 451: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: return
   }

   public void mandatoryContruction(String[] param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMStackTraceTranslate.a J
      // 003: ldc2_w 123063835265067
      // 006: lxor
      // 007: lstore 3
      // 008: lload 3
      // 009: dup2
      // 00a: ldc2_w 3234491931259
      // 00d: lxor
      // 00e: lstore 5
      // 010: dup2
      // 011: ldc2_w 63048146745364
      // 014: lxor
      // 015: lstore 7
      // 017: dup2
      // 018: ldc2_w 84303984219806
      // 01b: lxor
      // 01c: lstore 9
      // 01e: dup2
      // 01f: ldc2_w 88420850356171
      // 022: lxor
      // 023: lstore 11
      // 025: dup2
      // 026: ldc2_w 35185682486112
      // 029: lxor
      // 02a: lstore 13
      // 02c: dup2
      // 02d: ldc2_w 42387823759551
      // 030: lxor
      // 031: lstore 15
      // 033: dup2
      // 034: ldc2_w 52390347810568
      // 037: lxor
      // 038: lstore 17
      // 03a: dup2
      // 03b: ldc2_w 82937765041875
      // 03e: lxor
      // 03f: lstore 19
      // 041: pop2
      // 042: lload 11
      // 044: aload 2
      // 045: bipush 2
      // 046: anewarray 315
      // 049: dup_x1
      // 04a: swap
      // 04b: bipush 1
      // 04c: swap
      // 04d: aastore
      // 04e: dup_x2
      // 04f: dup_x2
      // 050: pop
      // 051: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 054: bipush 0
      // 055: swap
      // 056: aastore
      // 057: ldc2_w 684413846839215822
      // 05a: lload 3
      // 05b: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: pop
      // 061: ldc2_w 630876180255863373
      // 064: lload 3
      // 065: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 0
      // 06b: new java/util/ArrayList
      // 06e: dup
      // 06f: aload 1
      // 070: arraylength
      // 071: invokespecial java/util/ArrayList.<init> (I)V
      // 074: ldc2_w 1414315262925455522
      // 077: lload 3
      // 078: invokedynamic u (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: bipush 0
      // 07e: istore 22
      // 080: aload 1
      // 081: astore 23
      // 083: aload 23
      // 085: arraylength
      // 086: istore 24
      // 088: bipush 0
      // 089: istore 25
      // 08b: astore 21
      // 08d: iload 25
      // 08f: iload 24
      // 091: if_icmpge 10e
      // 094: aload 23
      // 096: iload 25
      // 098: aaload
      // 099: astore 26
      // 09b: aload 21
      // 09d: ifnonnull 109
      // 0a0: aload 26
      // 0a2: ifnonnull 0f3
      // 0a5: goto 0b2
      // 0a8: ldc2_w 1592603729488693109
      // 0ab: lload 3
      // 0ac: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: new java/lang/IllegalArgumentException
      // 0b5: dup
      // 0b6: new java/lang/StringBuilder
      // 0b9: dup
      // 0ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bd: sipush 19662
      // 0c0: ldc2_w 3122268737382272888
      // 0c3: lload 3
      // 0c4: lxor
      // 0c5: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: iload 22
      // 0cf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d2: sipush 31518
      // 0d5: ldc2_w 6277238909155899575
      // 0d8: lload 3
      // 0d9: lxor
      // 0da: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e5: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0e8: athrow
      // 0e9: ldc2_w 1592603729488693109
      // 0ec: lload 3
      // 0ed: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: ldc2_w 1414315262925455522
      // 0f7: lload 3
      // 0f8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: aload 26
      // 0ff: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 102: pop
      // 103: iinc 22 1
      // 106: iinc 25 1
      // 109: aload 21
      // 10b: ifnull 08d
      // 10e: aconst_null
      // 10f: astore 23
      // 111: aload 2
      // 112: aload 21
      // 114: ifnonnull 128
      // 117: ifnull 1d5
      // 11a: goto 127
      // 11d: ldc2_w 1592603729488693109
      // 120: lload 3
      // 121: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 2
      // 128: invokevirtual java/lang/String.length ()I
      // 12b: ifle 1d5
      // 12e: aload 0
      // 12f: lload 15
      // 131: bipush 1
      // 132: anewarray 315
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 0
      // 13c: swap
      // 13d: aastore
      // 13e: ldc2_w 1205833631456139639
      // 141: lload 3
      // 142: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: ldc2_w 1402875961260118299
      // 14a: lload 3
      // 14b: invokedynamic u (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: new com/zelix/po
      // 153: dup
      // 154: lload 7
      // 156: aload 2
      // 157: aload 0
      // 158: ldc2_w 1402875961260118299
      // 15b: lload 3
      // 15c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: invokespecial com/zelix/po.<init> (JLjava/lang/String;Ljava/util/Set;)V
      // 164: astore 23
      // 166: aload 23
      // 168: new com/zelix/qx
      // 16b: dup
      // 16c: aload 23
      // 16e: ldc2_w 675418924375786714
      // 171: lload 3
      // 172: invokedynamic o (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: lload 17
      // 179: invokespecial com/zelix/qx.<init> (Lcom/zelix/po;ZJ)V
      // 17c: lload 9
      // 17e: dup2_x1
      // 17f: pop2
      // 180: bipush 2
      // 181: anewarray 315
      // 184: dup_x1
      // 185: swap
      // 186: bipush 1
      // 187: swap
      // 188: aastore
      // 189: dup_x2
      // 18a: dup_x2
      // 18b: pop
      // 18c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w 1374709536968945801
      // 195: lload 3
      // 196: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: aload 23
      // 19d: new com/zelix/pg
      // 1a0: dup
      // 1a1: lload 19
      // 1a3: invokespecial com/zelix/pg.<init> (J)V
      // 1a6: new com/zelix/pg
      // 1a9: dup
      // 1aa: lload 19
      // 1ac: invokespecial com/zelix/pg.<init> (J)V
      // 1af: lload 5
      // 1b1: dup2_x2
      // 1b2: pop2
      // 1b3: bipush 3
      // 1b4: anewarray 315
      // 1b7: dup_x1
      // 1b8: swap
      // 1b9: bipush 2
      // 1ba: swap
      // 1bb: aastore
      // 1bc: dup_x1
      // 1bd: swap
      // 1be: bipush 1
      // 1bf: swap
      // 1c0: aastore
      // 1c1: dup_x2
      // 1c2: dup_x2
      // 1c3: pop
      // 1c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c7: bipush 0
      // 1c8: swap
      // 1c9: aastore
      // 1ca: ldc2_w 1407787429840314633
      // 1cd: lload 3
      // 1ce: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: istore 24
      // 1d5: aload 0
      // 1d6: new com/zelix/yr
      // 1d9: dup
      // 1da: aload 0
      // 1db: ldc2_w 1414315262925455522
      // 1de: lload 3
      // 1df: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: lload 13
      // 1e6: aload 23
      // 1e8: invokespecial com/zelix/yr.<init> (Ljava/util/List;JLcom/zelix/po;)V
      // 1eb: ldc2_w 721807376564038327
      // 1ee: lload 3
      // 1ef: invokedynamic u (Ljava/lang/Object;Lcom/zelix/yr;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: return
   }

   public ZKMStackTraceTranslate(String var1) {
      this(var1, null);
   }

   public String getOldClassName(String var1) {
      long var2 = a ^ 54910671190293L;
      long var4 = var2 ^ 73038610207772L;

      String var6;
      try {
         var6 = x44.a<"h">(x44.a<"l">(this, 8879411685479701385L, var2), new Object[]{var1, var4}, 8747901323678386717L, var2);
      } catch (_sf var8) {
         var6 = a<"p">(284, 4991182188751319946L ^ var2) + x44.a<"h">(var8, 9175894556911091879L, var2) + "\"" + x44.a<"i">(7197472256641061656L, var2);
      }

      return var6;
   }

   public String getTranslatedStackTrace(String param1, boolean param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMStackTraceTranslate.a J
      // 003: ldc2_w 44369006185466
      // 006: lxor
      // 007: lstore 4
      // 009: lload 4
      // 00b: dup2
      // 00c: ldc2_w 76266559817637
      // 00f: lxor
      // 010: lstore 6
      // 012: dup2
      // 013: ldc2_w 82933089294687
      // 016: lxor
      // 017: lstore 8
      // 019: dup2
      // 01a: ldc2_w 9062012751167
      // 01d: lxor
      // 01e: lstore 10
      // 020: pop2
      // 021: ldc2_w -3814525535270063716
      // 024: lload 4
      // 026: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 12
      // 02d: aload 0
      // 02e: ldc2_w -3903186789855205018
      // 031: lload 4
      // 033: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/yr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: aload 1
      // 039: iload 2
      // 03a: lload 10
      // 03c: iload 3
      // 03d: bipush 4
      // 03e: anewarray 315
      // 041: dup_x1
      // 042: swap
      // 043: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 046: bipush 3
      // 047: swap
      // 048: aastore
      // 049: dup_x2
      // 04a: dup_x2
      // 04b: pop
      // 04c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04f: bipush 2
      // 050: swap
      // 051: aastore
      // 052: dup_x1
      // 053: swap
      // 054: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 057: bipush 1
      // 058: swap
      // 059: aastore
      // 05a: dup_x1
      // 05b: swap
      // 05c: bipush 0
      // 05d: swap
      // 05e: aastore
      // 05f: ldc2_w -3801862709784400198
      // 062: lload 4
      // 064: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: astore 13
      // 06b: goto 1bc
      // 06e: astore 14
      // 070: aconst_null
      // 071: astore 15
      // 073: aload 0
      // 074: ldc2_w -3411120516899155254
      // 077: lload 4
      // 079: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: aload 12
      // 080: ifnonnull 0ad
      // 083: ifnull 123
      // 086: goto 094
      // 089: ldc2_w -3041241396811463516
      // 08c: lload 4
      // 08e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 0
      // 095: ldc2_w -3411120516899155254
      // 098: lload 4
      // 09a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: goto 0ad
      // 0a2: ldc2_w -3041241396811463516
      // 0a5: lload 4
      // 0a7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: aload 12
      // 0af: ifnonnull 0e1
      // 0b2: invokeinterface java/util/Set.size ()I 1
      // 0b7: ifle 123
      // 0ba: goto 0c8
      // 0bd: ldc2_w -3041241396811463516
      // 0c0: lload 4
      // 0c2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: ldc2_w -3411120516899155254
      // 0cc: lload 4
      // 0ce: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: goto 0e1
      // 0d6: ldc2_w -3041241396811463516
      // 0d9: lload 4
      // 0db: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 6
      // 0e3: dup2_x1
      // 0e4: pop2
      // 0e5: bipush 2
      // 0e6: anewarray 315
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: bipush 1
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x2
      // 0ef: dup_x2
      // 0f0: pop
      // 0f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f4: bipush 0
      // 0f5: swap
      // 0f6: aastore
      // 0f7: ldc2_w -3154911543957457979
      // 0fa: lload 4
      // 0fc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: lload 8
      // 103: dup2_x1
      // 104: pop2
      // 105: bipush 2
      // 106: anewarray 315
      // 109: dup_x1
      // 10a: swap
      // 10b: bipush 1
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x2
      // 10f: dup_x2
      // 110: pop
      // 111: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 114: bipush 0
      // 115: swap
      // 116: aastore
      // 117: ldc2_w -3503899726047955713
      // 11a: lload 4
      // 11c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: astore 15
      // 123: new java/lang/StringBuilder
      // 126: dup
      // 127: invokespecial java/lang/StringBuilder.<init> ()V
      // 12a: sipush 30189
      // 12d: ldc2_w 2045940869681001862
      // 130: lload 4
      // 132: lxor
      // 133: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: aload 14
      // 13d: ldc2_w -3623063637151255992
      // 140: lload 4
      // 142: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14a: ldc "\""
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: ldc2_w -3382881406839987721
      // 152: lload 4
      // 154: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15c: aload 15
      // 15e: aload 12
      // 160: ifnonnull 1af
      // 163: ifnull 1b2
      // 166: goto 174
      // 169: ldc2_w -3041241396811463516
      // 16c: lload 4
      // 16e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: new java/lang/StringBuilder
      // 177: dup
      // 178: invokespecial java/lang/StringBuilder.<init> ()V
      // 17b: sipush 18643
      // 17e: ldc2_w 8177836383807965353
      // 181: lload 4
      // 183: lxor
      // 184: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18c: aload 15
      // 18e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 191: ldc2_w -3763692079667724383
      // 194: lload 4
      // 196: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a1: goto 1af
      // 1a4: ldc2_w -3041241396811463516
      // 1a7: lload 4
      // 1a9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: goto 1b4
      // 1b2: ldc ""
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ba: astore 13
      // 1bc: aload 13
      // 1be: areturn
   }

   private static boolean Y(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      hk[] var10000 = x44.a<"q">(-7679133638374363166L, var2);
      StringTokenizer var5 = new StringTokenizer(var1, x44.a<"h">(-8102037729092353022L, var2));
      hk[] var4 = var10000;

      while (var5.hasMoreTokens()) {
         String var6 = var5.nextToken();

         label54: {
            try {
               boolean var11 = var6.endsWith(a<"p">(238, 6555683336657805025L ^ var2));
               if (var4 != null) {
                  return var11;
               }

               if (!var11) {
                  break label54;
               }
            } catch (IllegalArgumentException var9) {
               throw x44.a<"q">(var9, -8379652408188052774L, var2);
            }

            File var7 = new File(var6);

            try {
               boolean var12 = x44.a<"i">(var7, -7707023090712591369L, var2);
               if (var4 != null) {
                  return var12;
               }

               if (var12) {
                  return true;
               }
            } catch (IllegalArgumentException var8) {
               throw x44.a<"q">(var8, -8379652408188052774L, var2);
            }
         }

         if (var4 != null) {
            break;
         }
      }

      return false;
   }

   public String getTranslatedStackTrace(String var1, boolean var2) {
      long var3 = a ^ 64626396689806L;
      return x44.a<"k">(this, var1, var2, 2, 8291105509861743479L, var3);
   }

   public ZKMStackTraceTranslate(String[] var1) {
      this(var1, null);
   }

   public String getTranslatedStackTrace(String var1) {
      long var2 = a ^ 18329170132661L;
      return x44.a<"h">(this, var1, true, 2, 4050080651231203404L, var2);
   }

   public ZKMStackTraceTranslate(String var1, String var2) {
      long var3 = a ^ 128557104752199L;
      super();
      if (var1 == null) {
         throw new IllegalArgumentException(a<"p">(30421, 922411499669887748L ^ var3));
      } else {
         String[] var5 = new String[]{var1};
         x44.a<"j">(this, var5, var2, 8738755981886890173L, var3);
      }
   }

   public ZKMStackTraceTranslate(String[] var1, String var2) {
      long var3 = a ^ 45061593342104L;
      super();
      x44.a<"m">(this, var1, var2, 4582712050131428962L, var3);
   }

   public static void main(String[] var0) {
      long var1 = ess.a(5891139052679683363L, -1230046424462413885L, MethodHandles.lookup().lookupClass()).a(200297044798623L) ^ 40425327245359L;
      long var3 = var1 ^ 50233067657463L;
      long var5 = var1 ^ 18763956106313L;
      x44.a<"p">(new Object[]{var5}, 9030678971705629202L, var1);
      x44.a<"p">(new Object[]{var3}, 6970130354270436263L, var1);
   }

   public void close() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMStackTraceTranslate.a J
      // 03: ldc2_w 31796742598727
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 122583243283314
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 20537782625107
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w -5715875461167035871
      // 1a: lload 1
      // 1b: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: astore 7
      // 22: aload 7
      // 24: ifnonnull 87
      // 27: aload 0
      // 28: ldc2_w -5591169483550453029
      // 2b: lload 1
      // 2c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/yr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: ifnull 6f
      // 34: goto 41
      // 37: ldc2_w -5875399120088105191
      // 3a: lload 1
      // 3b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 0
      // 42: ldc2_w -5591169483550453029
      // 45: lload 1
      // 46: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/yr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: lload 3
      // 4c: bipush 1
      // 4d: anewarray 315
      // 50: dup_x2
      // 51: dup_x2
      // 52: pop
      // 53: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 56: bipush 0
      // 57: swap
      // 58: aastore
      // 59: ldc2_w -6147493131847912669
      // 5c: lload 1
      // 5d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: goto 6f
      // 65: ldc2_w -5875399120088105191
      // 68: lload 1
      // 69: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: lload 5
      // 71: bipush 1
      // 72: anewarray 315
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w -6176289893890241272
      // 81: lload 1
      // 82: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: return
   }

   public String getOldMethodSignatures(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMStackTraceTranslate.a J
      // 003: ldc2_w 80298316472247
      // 006: lxor
      // 007: lstore 3
      // 008: lload 3
      // 009: dup2
      // 00a: ldc2_w 117712866986418
      // 00d: lxor
      // 00e: lstore 5
      // 010: pop2
      // 011: ldc2_w -6963281484624337455
      // 014: lload 3
      // 015: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: astore 7
      // 01c: aload 0
      // 01d: ldc2_w -7090784473790956245
      // 020: lload 3
      // 021: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/yr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: aload 1
      // 027: lload 5
      // 029: aload 2
      // 02a: bipush 3
      // 02b: anewarray 315
      // 02e: dup_x1
      // 02f: swap
      // 030: bipush 2
      // 031: swap
      // 032: aastore
      // 033: dup_x2
      // 034: dup_x2
      // 035: pop
      // 036: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 039: bipush 1
      // 03a: swap
      // 03b: aastore
      // 03c: dup_x1
      // 03d: swap
      // 03e: bipush 0
      // 03f: swap
      // 040: aastore
      // 041: ldc2_w -8688895627644392809
      // 044: lload 3
      // 045: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: astore 9
      // 04c: new java/lang/StringBuffer
      // 04f: dup
      // 050: invokespecial java/lang/StringBuffer.<init> ()V
      // 053: astore 10
      // 055: aload 10
      // 057: ldc "["
      // 059: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 05c: pop
      // 05d: bipush 0
      // 05e: istore 11
      // 060: iload 11
      // 062: aload 9
      // 064: arraylength
      // 065: if_icmpge 105
      // 068: aload 10
      // 06a: aload 9
      // 06c: iload 11
      // 06e: aaload
      // 06f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 072: pop
      // 073: aload 7
      // 075: ifnonnull 10d
      // 078: iload 11
      // 07a: aload 9
      // 07c: arraylength
      // 07d: bipush 2
      // 07e: isub
      // 07f: aload 7
      // 081: ifnonnull 0da
      // 084: goto 091
      // 087: ldc2_w -9113537089237135127
      // 08a: lload 3
      // 08b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: if_icmpge 0c6
      // 094: goto 0a1
      // 097: ldc2_w -9113537089237135127
      // 09a: lload 3
      // 09b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: aload 10
      // 0a3: sipush 18751
      // 0a6: ldc2_w 7048726122490649863
      // 0a9: lload 3
      // 0aa: lxor
      // 0ab: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0b3: pop
      // 0b4: aload 7
      // 0b6: ifnull 0fd
      // 0b9: goto 0c6
      // 0bc: ldc2_w -9113537089237135127
      // 0bf: lload 3
      // 0c0: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: iload 11
      // 0c8: aload 9
      // 0ca: arraylength
      // 0cb: bipush 1
      // 0cc: isub
      // 0cd: goto 0da
      // 0d0: ldc2_w -9113537089237135127
      // 0d3: lload 3
      // 0d4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: if_icmpge 0fd
      // 0dd: aload 10
      // 0df: sipush 30412
      // 0e2: ldc2_w 7928336538660266720
      // 0e5: lload 3
      // 0e6: lxor
      // 0e7: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0ef: pop
      // 0f0: goto 0fd
      // 0f3: ldc2_w -9113537089237135127
      // 0f6: lload 3
      // 0f7: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: iinc 11 1
      // 100: aload 7
      // 102: ifnull 060
      // 105: aload 10
      // 107: ldc "]"
      // 109: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 10c: pop
      // 10d: aload 10
      // 10f: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 112: astore 8
      // 114: goto 154
      // 117: astore 9
      // 119: new java/lang/StringBuilder
      // 11c: dup
      // 11d: invokespecial java/lang/StringBuilder.<init> ()V
      // 120: sipush 26973
      // 123: ldc2_w 1196244455812038010
      // 126: lload 3
      // 127: lxor
      // 128: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ZKMStackTraceTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: aload 9
      // 132: ldc2_w -7352922933052987899
      // 135: lload 3
      // 136: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13e: ldc "\""
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: ldc2_w -8844799097119689286
      // 146: lload 3
      // 147: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 152: astore 8
      // 154: aload 8
      // 156: areturn
   }

   public String getOldMethodName(String var1, String var2) {
      long var3 = a ^ 35264774089735L;
      long var5 = var3 ^ 21443539854037L;
      hk[] var7 = x44.a<"r">(-5986095942747728287L, var3);

      try {
         var2 = var2.trim();
         int var8 = var2.indexOf(" ");
         if (var8 <= -1) {
            return "'" + var2 + a<"p">(18976, 6980105854977043897L ^ var3);
         } else {
            String var9 = var2.substring(0, var8);
            String var10 = var2.substring(var8 + 1);
            var10 = var10.trim();
            int var11 = var10.indexOf("(");
            if (var11 <= 0) {
               return "'" + var2 + a<"p">(19270, 2752894819660459215L ^ var3);
            } else {
               String var12 = var10.substring(0, var11);
               int var13 = x44.a<"j">(var10, ")", var11, -5989779275744978065L, var3);
               if (var13 <= -1) {
                  return "'" + var2 + a<"p">(9381, 5856935330784936760L ^ var3);
               } else {
                  String var14 = var10.substring(var11 + 1, var13);
                  ArrayList var15 = new ArrayList();
                  StringTokenizer var16 = new StringTokenizer(var14, ",");

                  int var10000;
                  while (true) {
                     if (var16.hasMoreTokens()) {
                        try {
                           var10000 = var15.add(var16.nextToken().trim());
                           if (var7 != null) {
                              break;
                           }

                           if (var7 == null) {
                              continue;
                           }
                        } catch (_sf var18) {
                           throw x44.a<"r">(var18, -5605187850957462695L, var3);
                        }
                     }

                     var10000 = var15.size();
                     break;
                  }

                  String[] var17 = new String[var10000];
                  var17 = var15.toArray(var17);
                  return x44.a<"j">(x44.a<"n">(this, -5897446104217055589L, var3), new Object[]{var1, var5, var12, var17, var9}, -5190721389349359482L, var3);
               }
            }
         }
      } catch (_sf var19) {
         return a<"p">(3068, 9139609030450719859L ^ var3) + x44.a<"j">(var19, -6177458086513896011L, var3) + "\"" + x44.a<"k">(-5264533140259994102L, var3);
      }
   }

   static {
      long var11 = a ^ 85930536947181L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[28];
      int var18 = 0;
      String var17 = "\u000fÍ}f\u000e¦Y¯¢\u0017ÄÀôó@f0³o«\u009b >\u0080å¼ñO\u0007Ô{Éjªzh\u001d\f·¾p\u0081ãRÂxn\u0099â³\u0013ÏSJa´NZkâ\u008aX\u0010H\u0088c\"þ\u007fÝ\u0018!YÛ<ß¯Àj\u001eí\u0000jÑø&\u0087eÈÆ|E¯\u008dKÐeH\u00ad\rïË\u0098;fl\u008cÑ9Eà\u0017\u0098ëj\r?ß%h\"\u0086w&Þ\u001f+x-M\u0098\u007f\u009a\u009d]\u0087\u0096«k³©\u009dÛíüÁh¦F\u009cÎ\u0098ô@`/>{ÔÙK¼µûÓ\u0005\u001aº\u0004X\u0081Ú\u008a*s\u0019úÔÍ²ó©<¥\u0080\u0003(\tÞ¾D6hNu\u0011Ýd!MØÚA\u001bñë\u0004è©¼ÓÞ×ê\u009e6µ\u0007\u0010\u0088\u009bªe{¦2o¬\u00043Å\u0003Òm~XýÑ\rÀìÜ4Ú\u001c\u0096ÿePB+\u0098À\u0080Ë\u009d®«ø\u001aÛ±,\u0014øl\"\u001e\u00923\u0097;\u0016 ÉÖg±Ó\u0017³5ÅÇ×§Þ\u0088´øiHù\u0081³Yì¹Ç\u0014ê\u009f¶E\"ì\u009cM¶bó£V\tÅ³\u0097;ß©P¦JY ·b\u008fô\u0091a$p´à\u009a]Å\u0014{¢6\u0088D]\u0093ÒQ\u0011÷Õ\u0015d.Î!½@M8Ø«ÿ»\u008ad\u008a~Qz\u007fPð\u008c:\u0005{)\u0004ÁÜÝi>?¢\u0081Ta°4\u0097iyÂ½\u0002þ(÷v\u0095à¹\bVþ(Òá\u000eEÏ\u0095\rÜ\tWÛ\u0089//XÞ\u0093f^\u0098¾$;D4\u009c\u000e\u001f\u0099Vªó\u0018Ã!ÇEäm\u000fP`\u007f\u009dþk»(ùwæíÂ/\u009dÎ\u008e\u001e\u0083Hl§\u001f6\u0099s\u008e \u001dÊ%§¯ÀØTÐ\u0082\b¿n]\u0084\u0082\u000bìÆ\u0084\u008b3\u009d/£ö\u0097Ú5Éê%\u0012×£(X\u0011´|\u0086'HhËÞ;³rfý¿\u001bÁ\u0003\u00adnJ\u0013*k5\u0017T\u0093!\u009a;~¾\u0012\u00ad\u009d¥*\u0089([~¨¼Þ¥æñ&8\u009bì\u0011ñ\u0081¢\u0003´À;$\u009atB)\u0006Se\u001a\u0013^\u0000§^ÕG-·\u009bM`r!\u0093Wõ¢\u007fx\u0091½c\u0097Ô0UÈ\u009a5:\u00966Ï+é\u0003ëYIî\u0095c\u009ejô©ÀU\u008f\u0090J.\u0082MÐ«\u008b\u0081Ê(§9\u00813Ã\u0004'Ú\u008fD gÈ\u008aÞ7ñ®\fÏ&\u0000\u008b\u0006&°\"ÿ2¿\u008eæx\u0010>`\u009aÙ#E2\u0083×.\u000f\u0003+hÕõ<°©\u0018á\u008f®\u001e¢8^?\u0089zå{¹ÚJù®GÓÏ\u0000Q`þ¨cg§\u0086eèË\u001d'\r,\u009e$Ô$ÜSÁ\u0082D\u0086ck\u00992+[²æ»¯²À»>ï\u000bèøüÕ®ù\u0013¿f¢Ð:xj\u008dÁÉ\u0095ü\u0087LÉÀ[)m\u009aQÿ:Âò}´Á$\u0080ØÚÅ»&E\u0098¸¾7¹®m¼jbÂ\u000f÷*ç$TX*ª\u009b\u000fá\b\u0002e\u0012°±}\u0019õÝõ\u009eÉRø\u001aë\u0085Y\\á÷\u0081êÒd¾m\u001a$\u0090bG«á \u0017P½Ô\rÂó¯\u000bÎ\nò\u0087f\u0081vGþ»(ÞÔ°\u0007*ØÂ¸ø1>Gº7c6YÃ\u008a\u007fu80\u0019xC\b\u001bG\u001d\u0087W1äu\u009f\u0001ñyÝýéàXÃ\u0094U\u0095\u00055\u0089ÖÏ yk´\u001eQ\u0006{\u0011~V\u0000\u008c\fÕVá»FðLvÉ9ñÈ\u0097\b\u0004\u0000Û\u0095ê{¬\u0081\u0092\u001eG\u001b@ÚU7ê÷ÀNòz·\u001d²¼¸z{ ³åÎ\u0083&Ñº\u0094î\u0002\u0013^Å*Ô\u0090ç\u008fÄ¬\u00ad@ð\u0094(©9j\u001bs\u0017\u0096\u007f\u0091\u009aÎ6f\\ª¥\u0097\u008e\f\u0014\u0099ßÌ\u0011\naì\u009c\u009dK¾S³¢8r\u001cBY\u0087ñ\u009a)_\u009dÄT)ÏÑn\u000bê\u000fâ\tØJ{\u0004' \u0014\fý.8\u001eK¯ù\u0006y¶}&`)éLÆÄ\u0013ùU \u0017\u00ad#u|6+±(\u009c±ö\"\u0081¯ÇF<\u008dPkÅDê§»\u00017G8S¼Çy\u0002Eº½\u000f6\u0014\u0085\u0090\u0006ôñdS8 hK\u000füæ¡!\u001dÌw\u0091Âukq/BÈÝ[\rýæïë'ûç³\u0013\u008c\u0000(ËhÌ@Ó7Ô%cwTL\u0003!$Zú}~\u0007Ñp\u008a\u0093D\u0016ïæ4\u008f:2E´1\u0092SOÙ\u0096(ý\u00842£\u009fòU\u0019\u00031\u00adHB\r;\u001dd2»=X_\u0097È¾u\u001f>*eæá3«Çv\r\u0085ã\tXÇ2 \u009eÝ\u000bðò\u00ad`v*Oß\fu¶\u009a-çÛï\u008b{\u0002\u0003n.\u0013Ç\u0090\u008cçsÂëØ\u001a|O¢~l´&!#Ñ\u008dôqf\u0094ìB\u0084áºm \rÊ¢L;Ç\u0012\u0091¯+A\u00ad\u0015m/%Æ\t6û@\u009cºä\u001c1ê\u008a ß¡\u0017ñ&ªF\u0090Ò4þX\u00808T\u001aæoÅ*\u001e0C\u000e\u009d.N\u009bv\b6õ@ø\u0088A\u0089Æ\u001fwy\u0087z2Î\u0091âËÖ\t¼p64½FO:\u0013TúcM~¿}\u009d\u000f¢\u009aH!3Ý2yÏx\u0096W\u0080J Ú\u000f\u0097½;%ïÀgèø\u008d\r,\u0010\t;»°ûÝÐ^X\u000f/\u0094;D<^@«\u008bm\u001c·~0»ê[¾öIT'Ã\u0018\u0087*&9\u0016Â°C\u00adtñ¨&\u009c®>qtp]6\u00ad\u009cTÈõÿ/OÖÓ\u0092\u0083.\u0085M\u0089^æ\u0099pÕÏÁ}üt êæ\u0097JÝv\u0089\u0001¸\u0080\u0014Qä3Í3\u007fQ\u001dÖ±\u0010òßB®l\u0014ÍW\u0087=";
      int var19 = "\u000fÍ}f\u000e¦Y¯¢\u0017ÄÀôó@f0³o«\u009b >\u0080å¼ñO\u0007Ô{Éjªzh\u001d\f·¾p\u0081ãRÂxn\u0099â³\u0013ÏSJa´NZkâ\u008aX\u0010H\u0088c\"þ\u007fÝ\u0018!YÛ<ß¯Àj\u001eí\u0000jÑø&\u0087eÈÆ|E¯\u008dKÐeH\u00ad\rïË\u0098;fl\u008cÑ9Eà\u0017\u0098ëj\r?ß%h\"\u0086w&Þ\u001f+x-M\u0098\u007f\u009a\u009d]\u0087\u0096«k³©\u009dÛíüÁh¦F\u009cÎ\u0098ô@`/>{ÔÙK¼µûÓ\u0005\u001aº\u0004X\u0081Ú\u008a*s\u0019úÔÍ²ó©<¥\u0080\u0003(\tÞ¾D6hNu\u0011Ýd!MØÚA\u001bñë\u0004è©¼ÓÞ×ê\u009e6µ\u0007\u0010\u0088\u009bªe{¦2o¬\u00043Å\u0003Òm~XýÑ\rÀìÜ4Ú\u001c\u0096ÿePB+\u0098À\u0080Ë\u009d®«ø\u001aÛ±,\u0014øl\"\u001e\u00923\u0097;\u0016 ÉÖg±Ó\u0017³5ÅÇ×§Þ\u0088´øiHù\u0081³Yì¹Ç\u0014ê\u009f¶E\"ì\u009cM¶bó£V\tÅ³\u0097;ß©P¦JY ·b\u008fô\u0091a$p´à\u009a]Å\u0014{¢6\u0088D]\u0093ÒQ\u0011÷Õ\u0015d.Î!½@M8Ø«ÿ»\u008ad\u008a~Qz\u007fPð\u008c:\u0005{)\u0004ÁÜÝi>?¢\u0081Ta°4\u0097iyÂ½\u0002þ(÷v\u0095à¹\bVþ(Òá\u000eEÏ\u0095\rÜ\tWÛ\u0089//XÞ\u0093f^\u0098¾$;D4\u009c\u000e\u001f\u0099Vªó\u0018Ã!ÇEäm\u000fP`\u007f\u009dþk»(ùwæíÂ/\u009dÎ\u008e\u001e\u0083Hl§\u001f6\u0099s\u008e \u001dÊ%§¯ÀØTÐ\u0082\b¿n]\u0084\u0082\u000bìÆ\u0084\u008b3\u009d/£ö\u0097Ú5Éê%\u0012×£(X\u0011´|\u0086'HhËÞ;³rfý¿\u001bÁ\u0003\u00adnJ\u0013*k5\u0017T\u0093!\u009a;~¾\u0012\u00ad\u009d¥*\u0089([~¨¼Þ¥æñ&8\u009bì\u0011ñ\u0081¢\u0003´À;$\u009atB)\u0006Se\u001a\u0013^\u0000§^ÕG-·\u009bM`r!\u0093Wõ¢\u007fx\u0091½c\u0097Ô0UÈ\u009a5:\u00966Ï+é\u0003ëYIî\u0095c\u009ejô©ÀU\u008f\u0090J.\u0082MÐ«\u008b\u0081Ê(§9\u00813Ã\u0004'Ú\u008fD gÈ\u008aÞ7ñ®\fÏ&\u0000\u008b\u0006&°\"ÿ2¿\u008eæx\u0010>`\u009aÙ#E2\u0083×.\u000f\u0003+hÕõ<°©\u0018á\u008f®\u001e¢8^?\u0089zå{¹ÚJù®GÓÏ\u0000Q`þ¨cg§\u0086eèË\u001d'\r,\u009e$Ô$ÜSÁ\u0082D\u0086ck\u00992+[²æ»¯²À»>ï\u000bèøüÕ®ù\u0013¿f¢Ð:xj\u008dÁÉ\u0095ü\u0087LÉÀ[)m\u009aQÿ:Âò}´Á$\u0080ØÚÅ»&E\u0098¸¾7¹®m¼jbÂ\u000f÷*ç$TX*ª\u009b\u000fá\b\u0002e\u0012°±}\u0019õÝõ\u009eÉRø\u001aë\u0085Y\\á÷\u0081êÒd¾m\u001a$\u0090bG«á \u0017P½Ô\rÂó¯\u000bÎ\nò\u0087f\u0081vGþ»(ÞÔ°\u0007*ØÂ¸ø1>Gº7c6YÃ\u008a\u007fu80\u0019xC\b\u001bG\u001d\u0087W1äu\u009f\u0001ñyÝýéàXÃ\u0094U\u0095\u00055\u0089ÖÏ yk´\u001eQ\u0006{\u0011~V\u0000\u008c\fÕVá»FðLvÉ9ñÈ\u0097\b\u0004\u0000Û\u0095ê{¬\u0081\u0092\u001eG\u001b@ÚU7ê÷ÀNòz·\u001d²¼¸z{ ³åÎ\u0083&Ñº\u0094î\u0002\u0013^Å*Ô\u0090ç\u008fÄ¬\u00ad@ð\u0094(©9j\u001bs\u0017\u0096\u007f\u0091\u009aÎ6f\\ª¥\u0097\u008e\f\u0014\u0099ßÌ\u0011\naì\u009c\u009dK¾S³¢8r\u001cBY\u0087ñ\u009a)_\u009dÄT)ÏÑn\u000bê\u000fâ\tØJ{\u0004' \u0014\fý.8\u001eK¯ù\u0006y¶}&`)éLÆÄ\u0013ùU \u0017\u00ad#u|6+±(\u009c±ö\"\u0081¯ÇF<\u008dPkÅDê§»\u00017G8S¼Çy\u0002Eº½\u000f6\u0014\u0085\u0090\u0006ôñdS8 hK\u000füæ¡!\u001dÌw\u0091Âukq/BÈÝ[\rýæïë'ûç³\u0013\u008c\u0000(ËhÌ@Ó7Ô%cwTL\u0003!$Zú}~\u0007Ñp\u008a\u0093D\u0016ïæ4\u008f:2E´1\u0092SOÙ\u0096(ý\u00842£\u009fòU\u0019\u00031\u00adHB\r;\u001dd2»=X_\u0097È¾u\u001f>*eæá3«Çv\r\u0085ã\tXÇ2 \u009eÝ\u000bðò\u00ad`v*Oß\fu¶\u009a-çÛï\u008b{\u0002\u0003n.\u0013Ç\u0090\u008cçsÂëØ\u001a|O¢~l´&!#Ñ\u008dôqf\u0094ìB\u0084áºm \rÊ¢L;Ç\u0012\u0091¯+A\u00ad\u0015m/%Æ\t6û@\u009cºä\u001c1ê\u008a ß¡\u0017ñ&ªF\u0090Ò4þX\u00808T\u001aæoÅ*\u001e0C\u000e\u009d.N\u009bv\b6õ@ø\u0088A\u0089Æ\u001fwy\u0087z2Î\u0091âËÖ\t¼p64½FO:\u0013TúcM~¿}\u009d\u000f¢\u009aH!3Ý2yÏx\u0096W\u0080J Ú\u000f\u0097½;%ïÀgèø\u008d\r,\u0010\t;»°ûÝÐ^X\u000f/\u0094;D<^@«\u008bm\u001c·~0»ê[¾öIT'Ã\u0018\u0087*&9\u0016Â°C\u00adtñ¨&\u009c®>qtp]6\u00ad\u009cTÈõÿ/OÖÓ\u0092\u0083.\u0085M\u0089^æ\u0099pÕÏÁ}üt êæ\u0097JÝv\u0089\u0001¸\u0080\u0014Qä3Í3\u007fQ\u001dÖ±\u0010òßB®l\u0014ÍW\u0087="
         .length();
      char var16 = '(';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[28];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "Ïúë`Éê`ßø¿ªÛ¼\u0000\u000e ÊÝÌûïb¤`";
                     int var5 = "Ïúë`Éê`ßø¿ªÛ¼\u0000\u000e ÊÝÌûïb¤`".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(
                           new byte[]{
                              (byte)((int)(var8 >>> 56)),
                              (byte)((int)(var8 >>> 48)),
                              (byte)((int)(var8 >>> 40)),
                              (byte)((int)(var8 >>> 32)),
                              (byte)((int)(var8 >>> 24)),
                              (byte)((int)(var8 >>> 16)),
                              (byte)((int)(var8 >>> 8)),
                              (byte)((int)var8)
                           }
                        );
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     g = var6;
                     h = new Integer[3];
                     UNQUALIFIED_PARAM_TYPES = b<"q">(27323, var11 ^ 6492203287197279175L);
                     FULL_PARAM_TYPES = b<"q">(1856, var11 ^ 5440061376492310078L);
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "+Å8õÄ\u0095Ñ³£@Q\u001dÄFXÇ}\u00163u\u0086ggpð=lÞ¦\u009f;\r\u0003å\u0018ß£\u009a\u0017\u0096(\u000b\u008cø\r\fÐ2\u0005Å_\u0007&Uí\u0080ÿs\u0014\u0080p\u008a¾\u0090m\u0010¨lµé´?¼\u0014û\u0017\u0010\u0085¹í¤";
                  var19 = "+Å8õÄ\u0095Ñ³£@Q\u001dÄFXÇ}\u00163u\u0086ggpð=lÞ¦\u009f;\r\u0003å\u0018ß£\u009a\u0017\u0096(\u000b\u008cø\r\fÐ2\u0005Å_\u0007&Uí\u0080ÿs\u0014\u0080p\u008a¾\u0090m\u0010¨lµé´?¼\u0014û\u0017\u0010\u0085¹í¤"
                     .length();
                  var16 = '(';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7966;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ZKMStackTraceTranslate", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/ZKMStackTraceTranslate" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20501;
      if (h[var3] == null) {
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ZKMStackTraceTranslate", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/ZKMStackTraceTranslate" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
