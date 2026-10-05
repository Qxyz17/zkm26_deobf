package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class xl implements Comparable {
   private static String B;
   int i;
   static final Map D;
   static final Map V;
   _83 j;
   static final Map U;
   private static final long bb = ess.a(4928245369615425864L, 3990381796417354069L, MethodHandles.lookup().lookupClass()).a(7478644004476L);
   private static final String[] eb;
   private static final String[] fb;
   private static final Map gb = new HashMap(13);
   private static final long[] nb;
   private static final Integer[] ob;
   private static final Map pb;

   public static List l(Object[] param0) {
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
      // 13: getstatic com/zelix/xl.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: lload 2
      // 1a: dup2
      // 1b: ldc2_w 59402531762799
      // 1e: lxor
      // 1f: lstore 4
      // 21: dup2
      // 22: ldc2_w 132677394023564
      // 25: lxor
      // 26: dup2
      // 27: bipush 48
      // 29: lushr
      // 2a: l2i
      // 2b: istore 6
      // 2d: dup2
      // 2e: bipush 16
      // 30: lshl
      // 31: bipush 16
      // 33: lushr
      // 34: lstore 7
      // 36: pop2
      // 37: pop2
      // 38: ldc2_w -6396936036122377512
      // 3b: lload 2
      // 3c: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: new java/util/ArrayList
      // 44: dup
      // 45: invokespecial java/util/ArrayList.<init> ()V
      // 48: astore 10
      // 4a: astore 9
      // 4c: aload 1
      // 4d: lload 4
      // 4f: bipush 2
      // 50: anewarray 269
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 1
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x1
      // 5d: swap
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: ldc2_w -6383726285799493265
      // 64: lload 2
      // 65: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: astore 11
      // 6c: bipush 0
      // 6d: istore 12
      // 6f: iload 12
      // 71: aload 11
      // 73: invokeinterface java/util/List.size ()I 1
      // 78: if_icmpge cf
      // 7b: aload 11
      // 7d: iload 12
      // 7f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 84: checkcast java/lang/String
      // 87: astore 13
      // 89: iload 6
      // 8b: i2c
      // 8c: lload 7
      // 8e: aload 13
      // 90: invokestatic com/zelix/xl.C (CJLjava/lang/String;)Lcom/zelix/hy;
      // 93: astore 14
      // 95: aload 9
      // 97: lload 2
      // 98: lconst_0
      // 99: lcmp
      // 9a: iflt cc
      // 9d: ifnonnull ca
      // a0: aload 14
      // a2: ifnull c7
      // a5: goto b2
      // a8: ldc2_w -6350767172630196233
      // ab: lload 2
      // ac: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 10
      // b4: aload 14
      // b6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // b9: pop
      // ba: goto c7
      // bd: ldc2_w -6350767172630196233
      // c0: lload 2
      // c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: iinc 12 1
      // ca: aload 9
      // cc: ifnull 6f
      // cf: aload 10
      // d1: lload 2
      // d2: lconst_0
      // d3: lcmp
      // d4: ifle 84
      // d7: areturn
   }

   public static List L(String param0, long param1, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/xl.bb J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: ldc2_w -6703897018165770473
      // 009: lload 1
      // 00a: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: aload 0
      // 010: invokestatic com/zelix/_fz.d (Ljava/lang/String;)Ljava/lang/String;
      // 013: astore 5
      // 015: astore 4
      // 017: aload 4
      // 019: ifnonnull 0fd
      // 01c: iload 3
      // 01d: ifeq 0e3
      // 020: goto 02d
      // 023: ldc2_w -6768075330352559560
      // 026: lload 1
      // 027: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: athrow
      // 02d: aload 5
      // 02f: invokevirtual java/lang/String.length ()I
      // 032: bipush 2
      // 033: aload 4
      // 035: lload 1
      // 036: lconst_0
      // 037: lcmp
      // 038: ifle 083
      // 03b: ifnonnull 07b
      // 03e: goto 04b
      // 041: ldc2_w -6768075330352559560
      // 044: lload 1
      // 045: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: if_icmplt 0d7
      // 04e: goto 05b
      // 051: ldc2_w -6768075330352559560
      // 054: lload 1
      // 055: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: aload 5
      // 05d: bipush 0
      // 05e: invokevirtual java/lang/String.charAt (I)C
      // 061: sipush 4930
      // 064: ldc2_w 9065349436964847138
      // 067: lload 1
      // 068: lxor
      // 069: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: goto 07b
      // 071: ldc2_w -6768075330352559560
      // 074: lload 1
      // 075: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: lload 1
      // 07c: lconst_0
      // 07d: lcmp
      // 07e: ifle 0d4
      // 081: aload 4
      // 083: ifnonnull 0d4
      // 086: if_icmpne 0d7
      // 089: goto 096
      // 08c: ldc2_w -6768075330352559560
      // 08f: lload 1
      // 090: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: aload 5
      // 098: aload 5
      // 09a: invokevirtual java/lang/String.length ()I
      // 09d: bipush 1
      // 09e: lload 1
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: iflt 0f8
      // 0a4: isub
      // 0a5: aload 4
      // 0a7: ifnonnull 0e6
      // 0aa: goto 0b7
      // 0ad: ldc2_w -6768075330352559560
      // 0b0: lload 1
      // 0b1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: invokevirtual java/lang/String.charAt (I)C
      // 0ba: sipush 21960
      // 0bd: ldc2_w 6153387229949196450
      // 0c0: lload 1
      // 0c1: lxor
      // 0c2: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: goto 0d4
      // 0ca: ldc2_w -6768075330352559560
      // 0cd: lload 1
      // 0ce: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: if_icmpeq 0e3
      // 0d7: aconst_null
      // 0d8: areturn
      // 0d9: ldc2_w -6768075330352559560
      // 0dc: lload 1
      // 0dd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 5
      // 0e5: bipush 1
      // 0e6: aload 5
      // 0e8: sipush 16710
      // 0eb: ldc2_w 6190071342116891693
      // 0ee: lload 1
      // 0ef: lxor
      // 0f0: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/String.indexOf (I)I
      // 0f8: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0fb: astore 5
      // 0fd: new java/util/ArrayList
      // 100: dup
      // 101: invokespecial java/util/ArrayList.<init> ()V
      // 104: astore 6
      // 106: aload 5
      // 108: invokevirtual java/lang/String.length ()I
      // 10b: ifeq 293
      // 10e: aload 4
      // 110: ifnonnull 29e
      // 113: bipush 0
      // 114: istore 7
      // 116: aload 5
      // 118: iload 7
      // 11a: invokevirtual java/lang/String.charAt (I)C
      // 11d: sipush 18414
      // 120: ldc2_w 7934513461682498187
      // 123: lload 1
      // 124: lxor
      // 125: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: if_icmpne 153
      // 12d: iinc 7 1
      // 130: aload 4
      // 132: lload 1
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 13d
      // 138: ifnonnull 1ec
      // 13b: aload 4
      // 13d: ifnull 116
      // 140: lload 1
      // 141: lconst_0
      // 142: lcmp
      // 143: ifle 130
      // 146: goto 153
      // 149: ldc2_w -6768075330352559560
      // 14c: lload 1
      // 14d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: aload 5
      // 155: iload 7
      // 157: invokevirtual java/lang/String.charAt (I)C
      // 15a: aload 4
      // 15c: ifnonnull 1ee
      // 15f: sipush 11069
      // 162: ldc2_w 8421695113954690644
      // 165: lload 1
      // 166: lxor
      // 167: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: if_icmpne 1ec
      // 16f: goto 17c
      // 172: ldc2_w -6768075330352559560
      // 175: lload 1
      // 176: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: aload 5
      // 17e: sipush 4286
      // 181: ldc2_w 3246183291002043857
      // 184: lload 1
      // 185: lxor
      // 186: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: invokevirtual java/lang/String.indexOf (I)I
      // 18e: istore 8
      // 190: iload 3
      // 191: lload 1
      // 192: lconst_0
      // 193: lcmp
      // 194: iflt 1ae
      // 197: aload 4
      // 199: ifnonnull 1ae
      // 19c: ifeq 1f0
      // 19f: goto 1ac
      // 1a2: ldc2_w -6768075330352559560
      // 1a5: lload 1
      // 1a6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: iload 8
      // 1ae: bipush -1
      // 1af: lload 1
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: ifle 1dd
      // 1b5: aload 4
      // 1b7: ifnonnull 1dd
      // 1ba: if_icmpeq 1e0
      // 1bd: goto 1ca
      // 1c0: ldc2_w -6768075330352559560
      // 1c3: lload 1
      // 1c4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: iload 8
      // 1cc: iload 7
      // 1ce: bipush 1
      // 1cf: iadd
      // 1d0: goto 1dd
      // 1d3: ldc2_w -6768075330352559560
      // 1d6: lload 1
      // 1d7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: if_icmpne 1f0
      // 1e0: aconst_null
      // 1e1: areturn
      // 1e2: ldc2_w -6768075330352559560
      // 1e5: lload 1
      // 1e6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: iload 7
      // 1ee: istore 8
      // 1f0: aload 5
      // 1f2: bipush 0
      // 1f3: iload 8
      // 1f5: bipush 1
      // 1f6: iadd
      // 1f7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1fa: astore 9
      // 1fc: aload 6
      // 1fe: aload 9
      // 200: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 203: pop
      // 204: iload 3
      // 205: aload 4
      // 207: ifnonnull 26a
      // 20a: ifeq 268
      // 20d: goto 21a
      // 210: ldc2_w -6768075330352559560
      // 213: lload 1
      // 214: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: aload 9
      // 21c: invokevirtual java/lang/String.length ()I
      // 21f: bipush 1
      // 220: aload 4
      // 222: ifnonnull 271
      // 225: goto 232
      // 228: ldc2_w -6768075330352559560
      // 22b: lload 1
      // 22c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: if_icmpne 268
      // 235: goto 242
      // 238: ldc2_w -6768075330352559560
      // 23b: lload 1
      // 23c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: athrow
      // 242: getstatic com/zelix/xl.U Ljava/util/Map;
      // 245: aload 9
      // 247: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24c: ifnonnull 268
      // 24f: goto 25c
      // 252: ldc2_w -6768075330352559560
      // 255: lload 1
      // 256: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: athrow
      // 25c: aconst_null
      // 25d: areturn
      // 25e: ldc2_w -6768075330352559560
      // 261: lload 1
      // 262: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: athrow
      // 268: iload 8
      // 26a: aload 5
      // 26c: invokevirtual java/lang/String.length ()I
      // 26f: bipush 1
      // 270: isub
      // 271: if_icmpne 283
      // 274: ldc ""
      // 276: astore 5
      // 278: aload 4
      // 27a: lload 1
      // 27b: lconst_0
      // 27c: lcmp
      // 27d: ifle 290
      // 280: ifnull 28e
      // 283: aload 5
      // 285: iload 8
      // 287: bipush 1
      // 288: iadd
      // 289: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 28c: astore 5
      // 28e: aload 4
      // 290: ifnull 106
      // 293: aload 6
      // 295: invokevirtual java/util/ArrayList.trimToSize ()V
      // 298: lload 1
      // 299: lconst_0
      // 29a: lcmp
      // 29b: ifle 29e
      // 29e: aload 6
      // 2a0: areturn
   }

   public static List s(Object[] param0) {
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
      // 013: getstatic com/zelix/xl.bb J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 102261171435818
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 59048498826711
      // 025: lxor
      // 026: lstore 6
      // 028: dup2
      // 029: ldc2_w 91428005604281
      // 02c: lxor
      // 02d: lstore 8
      // 02f: dup2
      // 030: ldc2_w 24096715019051
      // 033: lxor
      // 034: lstore 10
      // 036: pop2
      // 037: ldc2_w -4688280537633006834
      // 03a: lload 1
      // 03b: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: new java/util/ArrayList
      // 043: dup
      // 044: invokespecial java/util/ArrayList.<init> ()V
      // 047: astore 13
      // 049: astore 12
      // 04b: aload 3
      // 04c: lload 8
      // 04e: bipush 2
      // 04f: anewarray 269
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: ldc2_w -4702294699608708935
      // 063: lload 1
      // 064: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: astore 14
      // 06b: bipush 0
      // 06c: istore 15
      // 06e: iload 15
      // 070: aload 14
      // 072: invokeinterface java/util/List.size ()I 1
      // 077: if_icmpge 148
      // 07a: aload 14
      // 07c: iload 15
      // 07e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 083: checkcast java/lang/String
      // 086: astore 16
      // 088: lload 10
      // 08a: aload 16
      // 08c: bipush 2
      // 08d: anewarray 269
      // 090: dup_x1
      // 091: swap
      // 092: bipush 1
      // 093: swap
      // 094: aastore
      // 095: dup_x2
      // 096: dup_x2
      // 097: pop
      // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09b: bipush 0
      // 09c: swap
      // 09d: aastore
      // 09e: ldc2_w -6687950389244953708
      // 0a1: lload 1
      // 0a2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: astore 17
      // 0a9: aload 12
      // 0ab: lload 1
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: ifle 145
      // 0b1: ifnonnull 143
      // 0b4: aload 17
      // 0b6: ifnull 140
      // 0b9: goto 0c6
      // 0bc: ldc2_w -4752441347956517343
      // 0bf: lload 1
      // 0c0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 17
      // 0c8: lload 6
      // 0ca: invokevirtual com/zelix/hz.n (J)Z
      // 0cd: aload 12
      // 0cf: ifnonnull 13f
      // 0d2: goto 0df
      // 0d5: ldc2_w -4752441347956517343
      // 0d8: lload 1
      // 0d9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: lload 1
      // 0e0: lconst_0
      // 0e1: lcmp
      // 0e2: ifle 132
      // 0e5: ifeq 129
      // 0e8: goto 0f5
      // 0eb: ldc2_w -4752441347956517343
      // 0ee: lload 1
      // 0ef: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 13
      // 0f7: aload 17
      // 0f9: lload 4
      // 0fb: bipush 1
      // 0fc: anewarray 269
      // 0ff: dup_x2
      // 100: dup_x2
      // 101: pop
      // 102: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w -5153549800867926265
      // 10b: lload 1
      // 10c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 116: pop
      // 117: aload 12
      // 119: ifnull 140
      // 11c: goto 129
      // 11f: ldc2_w -4752441347956517343
      // 122: lload 1
      // 123: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 13
      // 12b: aload 17
      // 12d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 132: goto 13f
      // 135: ldc2_w -4752441347956517343
      // 138: lload 1
      // 139: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: pop
      // 140: iinc 15 1
      // 143: aload 12
      // 145: ifnull 06e
      // 148: aload 13
      // 14a: lload 1
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 083
      // 150: areturn
   }

   boolean P(Object[] var1) {
      return true;
   }

   public abstract w5 m(long var1);

   public final String V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      long var4 = var2 ^ 29229967455484L;
      return x44.a<"o">(this.j, new Object[]{var4}, -8271402362814691881L, var2);
   }

   public static int O(Object[] param0) {
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
      // 04: checkcast java/util/List
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/xl.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: lload 2
      // 1a: dup2
      // 1b: ldc2_w 51835881774867
      // 1e: lxor
      // 1f: lstore 4
      // 21: pop2
      // 22: ldc2_w 1505315180709441794
      // 25: lload 2
      // 26: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 0
      // 2c: istore 7
      // 2e: astore 6
      // 30: aload 1
      // 31: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 36: astore 8
      // 38: aload 8
      // 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f: ifeq bd
      // 42: aload 8
      // 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49: checkcast java/lang/String
      // 4c: astore 9
      // 4e: aload 6
      // 50: lload 2
      // 51: lconst_0
      // 52: lcmp
      // 53: ifle 9f
      // 56: ifnonnull 9d
      // 59: aload 9
      // 5b: lload 4
      // 5d: bipush 2
      // 5e: anewarray 269
      // 61: dup_x2
      // 62: dup_x2
      // 63: pop
      // 64: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 67: bipush 1
      // 68: swap
      // 69: aastore
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: ldc2_w 665534433018543512
      // 72: lload 2
      // 73: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: aload 6
      // 7a: ifnonnull bf
      // 7d: goto 8a
      // 80: ldc2_w 1443397464162696237
      // 83: lload 2
      // 84: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: ifeq a8
      // 8d: goto 9a
      // 90: ldc2_w 1443397464162696237
      // 93: lload 2
      // 94: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: iinc 7 2
      // 9d: aload 6
      // 9f: lload 2
      // a0: lconst_0
      // a1: lcmp
      // a2: iflt ba
      // a5: ifnull b8
      // a8: iinc 7 1
      // ab: goto b8
      // ae: ldc2_w 1443397464162696237
      // b1: lload 2
      // b2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: aload 6
      // ba: ifnull 38
      // bd: iload 7
      // bf: ireturn
   }

   public xl(int var1, _83 var2) {
      this.i = var1;
      this.j = var2;
   }

   public static String E(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = bb ^ var2;
      String[] var4 = x44.a<"q">(3287527452722284670L, var2);

      try {
         if (var4 != null) {
            return var1;
         }

         switch (var1.charAt(0)) {
            case 'B':
            case 'C':
            case 'S':
               break;
            default:
               return (String)x44.a<"h">(2982026070948900798L, var2).get(var1);
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, 3277400870034523473L, var2);
      }

      var1 = "I";
      return (String)x44.a<"h">(2982026070948900798L, var2).get(var1);
   }

   void V(DataOutputStream var1, long var2, Map var4) {
      long var5 = var2 ^ 91668036947449L;
      this.T(var5, var1);
   }

   public static List P(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = bb ^ var1;
      long var4 = var1 ^ 128575412399769L;
      long var6 = var1 ^ 72300492490319L;
      String[] var10000 = x44.a<"u">(7366748201584755674L, var1);
      List var9 = X(var6, var3);
      int var10 = var9.size();
      String[] var8 = var10000;
      int var11 = 0;

      label34:
      while (var11 < var10) {
         String var12 = (String)var9.get(var11);

         do {
            try {
               if (var1 > 0L) {
                  if (var8 != null) {
                     return var9;
                  }

                  var9.set(var11, b(var12, var4));
               }

               var11++;
               if (var8 == null) {
                  continue label34;
               }
            } catch (gj var13) {
               throw x44.a<"u">(var13, 7412920604260077301L, var1);
            }
         } while (var1 < 0L);
         break;
      }

      return var9;
   }

   public boolean s() {
      return false;
   }

   public final String A(int var1, short var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ bb;
      long var6 = var4 ^ 127324847662981L;
      return this.j.M(var6);
   }

   public String C(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 100023681756774L;
      return x44.a<"k">(this, var4, -1373302380644290266L, var2);
   }

   public static String e(Object[] var0) {
      long var2 = (Long)var0[0];
      w5 var1 = (w5)var0[1];
      var2 = bb ^ var2;

      try {
         switch (x44.a<"l">(-7776916322317979874L, var2)[var1.ordinal()]) {
            case 1:
               return a<"f">(13647, 6563308002709169744L ^ var2);
            case 2:
               return a<"f">(29793, 3683805388756854598L ^ var2);
            case 3:
               return a<"f">(31985, 681920407931039694L ^ var2);
            case 4:
               return a<"f">(23866, 8040762602700049932L ^ var2);
            case 5:
               return a<"f">(21864, 1449641937614669392L ^ var2);
            case 6:
               return a<"f">(12982, 4572096742878798215L ^ var2);
            case 7:
               return a<"f">(6557, 5906868031685872278L ^ var2);
            case 8:
               return a<"f">(10842, 8313837259149900117L ^ var2);
            case 9:
               return a<"f">(17328, 2000069964569645222L ^ var2);
            case 10:
               return a<"f">(28992, 3816809839278170747L ^ var2);
            case 11:
               return a<"f">(2435, 142351192260663997L ^ var2);
            case 12:
               return a<"f">(1084, 4885724759252653853L ^ var2);
            case 13:
               return a<"f">(19281, 6684978027600025674L ^ var2);
            case 14:
               return a<"f">(27681, 6151770601042558725L ^ var2);
            case 15:
               return a<"f">(9640, 3532650657170224792L ^ var2);
            case 16:
               return a<"f">(9122, 7991204983102501035L ^ var2);
            case 17:
               return a<"f">(18493, 8740812432841612080L ^ var2);
            default:
               return "";
         }
      } catch (gj var4) {
         throw x44.a<"u">(var4, -8077319817954367539L, var2);
      }
   }

   public final hz O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      return x44.a<"o">(this.j, new Object[0], 2181841368877326746L, var2);
   }

   public static String b(String var0, long var1) {
      var1 = bb ^ var1;
      long var3 = var1 ^ 32110719179835L;
      return m(var0, false, var3, true);
   }

   public String N(long var1) {
      return "";
   }

   int o(long var1) {
      return 1;
   }

   public static String j(Object[] param0) {
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
      // 013: getstatic com/zelix/xl.bb J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w -7707172832876171029
      // 01c: lload 1
      // 01d: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 3
      // 023: astore 5
      // 025: astore 4
      // 027: aload 5
      // 029: invokevirtual java/lang/String.length ()I
      // 02c: istore 6
      // 02e: aconst_null
      // 02f: astore 7
      // 031: aload 5
      // 033: ldc ";"
      // 035: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 038: ifeq 1d8
      // 03b: new java/lang/StringBuffer
      // 03e: dup
      // 03f: invokespecial java/lang/StringBuffer.<init> ()V
      // 042: astore 7
      // 044: aload 5
      // 046: ldc "["
      // 048: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 04b: lload 1
      // 04c: lconst_0
      // 04d: lcmp
      // 04e: iflt 188
      // 051: aload 4
      // 053: ifnonnull 188
      // 056: ifeq 174
      // 059: goto 066
      // 05c: ldc2_w -7643011734651634236
      // 05f: lload 1
      // 060: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: aload 7
      // 068: sipush 18414
      // 06b: ldc2_w 7934616859470585207
      // 06e: lload 1
      // 06f: lxor
      // 070: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: ldc2_w -7769942489793986645
      // 078: lload 1
      // 079: invokedynamic l (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: pop
      // 07f: bipush 1
      // 080: istore 8
      // 082: iload 8
      // 084: iload 6
      // 086: if_icmpge 169
      // 089: aload 5
      // 08b: iload 8
      // 08d: invokevirtual java/lang/String.charAt (I)C
      // 090: istore 9
      // 092: iload 9
      // 094: sipush 18414
      // 097: ldc2_w 7934616859470585207
      // 09a: lload 1
      // 09b: lxor
      // 09c: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: aload 4
      // 0a3: lload 1
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: ifle 0ae
      // 0a9: ifnonnull 1fd
      // 0ac: aload 4
      // 0ae: ifnonnull 121
      // 0b1: goto 0be
      // 0b4: ldc2_w -7643011734651634236
      // 0b7: lload 1
      // 0b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: lload 1
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: ifle 114
      // 0c4: if_icmpne 105
      // 0c7: goto 0d4
      // 0ca: ldc2_w -7643011734651634236
      // 0cd: lload 1
      // 0ce: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 7
      // 0d6: sipush 18414
      // 0d9: ldc2_w 7934616859470585207
      // 0dc: lload 1
      // 0dd: lxor
      // 0de: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: ldc2_w -7769942489793986645
      // 0e6: lload 1
      // 0e7: invokedynamic l (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: pop
      // 0ed: aload 4
      // 0ef: lload 1
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: iflt 166
      // 0f5: ifnull 161
      // 0f8: goto 105
      // 0fb: ldc2_w -7643011734651634236
      // 0fe: lload 1
      // 0ff: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: iload 9
      // 107: sipush 11069
      // 10a: ldc2_w 8421653361830113704
      // 10d: lload 1
      // 10e: lxor
      // 10f: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: goto 121
      // 117: ldc2_w -7643011734651634236
      // 11a: lload 1
      // 11b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: if_icmpne 155
      // 124: aload 7
      // 126: sipush 11069
      // 129: ldc2_w 8421653361830113704
      // 12c: lload 1
      // 12d: lxor
      // 12e: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: ldc2_w -7769942489793986645
      // 136: lload 1
      // 137: invokedynamic l (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: pop
      // 13d: aload 4
      // 13f: lload 1
      // 140: lconst_0
      // 141: lcmp
      // 142: ifle 171
      // 145: ifnull 169
      // 148: goto 155
      // 14b: ldc2_w -7643011734651634236
      // 14e: lload 1
      // 14f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aconst_null
      // 156: areturn
      // 157: ldc2_w -7643011734651634236
      // 15a: lload 1
      // 15b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: iinc 8 1
      // 164: aload 4
      // 166: ifnull 082
      // 169: lload 1
      // 16a: lconst_0
      // 16b: lcmp
      // 16c: ifle 22c
      // 16f: aload 4
      // 171: ifnull 1c2
      // 174: aload 5
      // 176: ldc "L"
      // 178: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 17b: goto 188
      // 17e: ldc2_w -7643011734651634236
      // 181: lload 1
      // 182: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: ifeq 1b6
      // 18b: aload 7
      // 18d: sipush 11069
      // 190: ldc2_w 8421653361830113704
      // 193: lload 1
      // 194: lxor
      // 195: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: ldc2_w -7769942489793986645
      // 19d: lload 1
      // 19e: invokedynamic l (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: pop
      // 1a4: aload 4
      // 1a6: ifnull 1c2
      // 1a9: goto 1b6
      // 1ac: ldc2_w -7643011734651634236
      // 1af: lload 1
      // 1b0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: aconst_null
      // 1b7: areturn
      // 1b8: ldc2_w -7643011734651634236
      // 1bb: lload 1
      // 1bc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aload 5
      // 1c4: aload 7
      // 1c6: ldc2_w -7903958630577707887
      // 1c9: lload 1
      // 1ca: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: iload 6
      // 1d1: bipush 1
      // 1d2: isub
      // 1d3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1d6: astore 5
      // 1d8: aload 5
      // 1da: aload 4
      // 1dc: ifnonnull 23b
      // 1df: sipush 11760
      // 1e2: ldc2_w 1695700712587310944
      // 1e5: lload 1
      // 1e6: lxor
      // 1e7: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: invokevirtual java/lang/String.indexOf (I)I
      // 1ef: bipush -1
      // 1f0: goto 1fd
      // 1f3: ldc2_w -7643011734651634236
      // 1f6: lload 1
      // 1f7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: if_icmpeq 22c
      // 200: aload 5
      // 202: sipush 11760
      // 205: ldc2_w 1695700712587310944
      // 208: lload 1
      // 209: lxor
      // 20a: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: sipush 18794
      // 212: ldc2_w 3818657204404573173
      // 215: lload 1
      // 216: lxor
      // 217: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 21f: lload 1
      // 220: lconst_0
      // 221: lcmp
      // 222: ifle 22e
      // 225: astore 8
      // 227: aload 4
      // 229: ifnull 23d
      // 22c: aload 5
      // 22e: goto 23b
      // 231: ldc2_w -7643011734651634236
      // 234: lload 1
      // 235: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: athrow
      // 23b: astore 8
      // 23d: aload 5
      // 23f: invokevirtual java/lang/String.length ()I
      // 242: istore 9
      // 244: aload 5
      // 246: sipush 11760
      // 249: ldc2_w 1695700712587310944
      // 24c: lload 1
      // 24d: lxor
      // 24e: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: invokevirtual java/lang/String.indexOf (I)I
      // 256: istore 10
      // 258: aload 5
      // 25a: sipush 11760
      // 25d: ldc2_w 1695700712587310944
      // 260: lload 1
      // 261: lxor
      // 262: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: invokevirtual java/lang/String.lastIndexOf (I)I
      // 26a: istore 11
      // 26c: aload 5
      // 26e: sipush 18794
      // 271: ldc2_w 3818657204404573173
      // 274: lload 1
      // 275: lxor
      // 276: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: invokevirtual java/lang/String.indexOf (I)I
      // 27e: istore 12
      // 280: aload 5
      // 282: sipush 18794
      // 285: ldc2_w 3818657204404573173
      // 288: lload 1
      // 289: lxor
      // 28a: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: invokevirtual java/lang/String.lastIndexOf (I)I
      // 292: istore 13
      // 294: aload 8
      // 296: invokevirtual java/lang/String.length ()I
      // 299: aload 4
      // 29b: lload 1
      // 29c: lconst_0
      // 29d: lcmp
      // 29e: iflt 2d3
      // 2a1: ifnonnull 2d1
      // 2a4: bipush 3
      // 2a5: if_icmplt 3c7
      // 2a8: goto 2b5
      // 2ab: ldc2_w -7643011734651634236
      // 2ae: lload 1
      // 2af: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: athrow
      // 2b5: aload 8
      // 2b7: bipush 0
      // 2b8: invokevirtual java/lang/String.charAt (I)C
      // 2bb: ldc2_w -7933297096820075728
      // 2be: lload 1
      // 2bf: invokedynamic t (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: goto 2d1
      // 2c7: ldc2_w -7643011734651634236
      // 2ca: lload 1
      // 2cb: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: aload 4
      // 2d3: lload 1
      // 2d4: lconst_0
      // 2d5: lcmp
      // 2d6: ifle 2f0
      // 2d9: ifnonnull 2ee
      // 2dc: ifeq 3c7
      // 2df: goto 2ec
      // 2e2: ldc2_w -7643011734651634236
      // 2e5: lload 1
      // 2e6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: athrow
      // 2ec: iload 10
      // 2ee: aload 4
      // 2f0: ifnonnull 36b
      // 2f3: ifle 35c
      // 2f6: goto 303
      // 2f9: ldc2_w -7643011734651634236
      // 2fc: lload 1
      // 2fd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: athrow
      // 303: iload 11
      // 305: aload 4
      // 307: ifnonnull 36b
      // 30a: goto 317
      // 30d: ldc2_w -7643011734651634236
      // 310: lload 1
      // 311: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: athrow
      // 317: lload 1
      // 318: lconst_0
      // 319: lcmp
      // 31a: ifle 35e
      // 31d: iload 9
      // 31f: bipush 1
      // 320: isub
      // 321: if_icmpge 35c
      // 324: goto 331
      // 327: ldc2_w -7643011734651634236
      // 32a: lload 1
      // 32b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: athrow
      // 331: iload 12
      // 333: aload 4
      // 335: lload 1
      // 336: lconst_0
      // 337: lcmp
      // 338: iflt 373
      // 33b: ifnonnull 36b
      // 33e: goto 34b
      // 341: ldc2_w -7643011734651634236
      // 344: lload 1
      // 345: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34a: athrow
      // 34b: bipush -1
      // 34c: if_icmpeq 3ba
      // 34f: goto 35c
      // 352: ldc2_w -7643011734651634236
      // 355: lload 1
      // 356: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35b: athrow
      // 35c: iload 12
      // 35e: goto 36b
      // 361: ldc2_w -7643011734651634236
      // 364: lload 1
      // 365: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: athrow
      // 36b: lload 1
      // 36c: lconst_0
      // 36d: lcmp
      // 36e: iflt 388
      // 371: aload 4
      // 373: ifnonnull 388
      // 376: ifle 3c7
      // 379: goto 386
      // 37c: ldc2_w -7643011734651634236
      // 37f: lload 1
      // 380: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: iload 13
      // 388: iload 9
      // 38a: bipush 1
      // 38b: isub
      // 38c: lload 1
      // 38d: lconst_0
      // 38e: lcmp
      // 38f: iflt 3b7
      // 392: aload 4
      // 394: ifnonnull 3b7
      // 397: if_icmpge 3c7
      // 39a: goto 3a7
      // 39d: ldc2_w -7643011734651634236
      // 3a0: lload 1
      // 3a1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: athrow
      // 3a7: iload 10
      // 3a9: bipush -1
      // 3aa: goto 3b7
      // 3ad: ldc2_w -7643011734651634236
      // 3b0: lload 1
      // 3b1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: athrow
      // 3b7: if_icmpne 3c7
      // 3ba: aload 8
      // 3bc: areturn
      // 3bd: ldc2_w -7643011734651634236
      // 3c0: lload 1
      // 3c1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: aconst_null
      // 3c8: areturn
   }

   public static String Z(Object[] var0) {
      String var1 = (String)var0[0];
      return (String)U.get(var1);
   }

   public static String Q(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      var1 = bb ^ var1;
      return (String)x44.a<"m">(-8840721539439574125L, var1).get(var3);
   }

   public static boolean S(long param0, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/xl.bb J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: ldc2_w -2754075484734440410
      // 09: lload 0
      // 0a: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: aload 2
      // 11: bipush 0
      // 12: invokevirtual java/lang/String.charAt (I)C
      // 15: aload 3
      // 16: ifnonnull 49
      // 19: sipush 14508
      // 1c: ldc2_w 4423223560094019324
      // 1f: lload 0
      // 20: lxor
      // 21: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: if_icmpne 61
      // 29: goto 36
      // 2c: ldc2_w -2800253226054110967
      // 2f: lload 0
      // 30: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 2
      // 37: ldc ")"
      // 39: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 3c: goto 49
      // 3f: ldc2_w -2800253226054110967
      // 42: lload 0
      // 43: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 3
      // 4a: ifnonnull 5e
      // 4d: ifle 61
      // 50: goto 5d
      // 53: ldc2_w -2800253226054110967
      // 56: lload 0
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: ireturn
   }

   public static xl b(int var0, long var1, _xx var3, _83 var4) {
      var1 = bb ^ var1;
      long var5 = var1 ^ 38213806333968L;
      long var10001 = var1 ^ 69039848872425L;
      int var7 = (int)((var1 ^ 69039848872425L) >>> 48);
      int var8 = (int)((var1 ^ 69039848872425L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var1 ^ 114056514558392L;
      long var12 = var1 ^ 94141252289456L;
      long var14 = var1 ^ 21247817287032L;
      var10001 = var1 ^ 130125635595252L;
      int var16 = (int)((var1 ^ 130125635595252L) >>> 32);
      int var17 = (int)((var1 ^ 130125635595252L) << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var19 = var1 ^ 58470281427690L;
      long var21 = var1 ^ 22724786990582L;
      long var23 = var1 ^ 118590179668828L;
      long var25 = var1 ^ 134469428312754L;
      int var27 = var3.readUnsignedByte();

      try {
         switch (var27) {
            case 1:
               return new mx(var0, var16, var3, var4, (char)var17, var18);
            case 2:
            case 13:
            case 14:
            default:
               throw new _sx(
                  a<"f">(18879, 195104384114208476L ^ var1)
                     + x44.a<"j">(var4, new Object[]{var21}, 2508633006400884650L, var1)
                     + a<"f">(25930, 911972976246915623L ^ var1)
                     + var27
                     + a<"f">(11184, 1181839574835481851L ^ var1)
                     + var0
                     + a<"f">(27759, 4092733412520135468L ^ var1)
               );
            case 3:
               return new mf(var0, var3, var12, var4);
            case 4:
               return new xv(var0, var23, var3, var4);
            case 5:
               return new ms(var0, var19, var3, var4);
            case 6:
               return new xh(var0, var3, (short)var7, var4, (char)var8, var9);
            case 7:
               return new x6(var0, var25, var3, var4);
            case 8:
               return new m4(var0, var3, var10, var4);
            case 9:
               return new mi(var0, var3, var4);
            case 10:
               return new ml(var0, var3, var4);
            case 11:
               return new m5(var0, var3, var4);
            case 12:
               return new mm(var0, var3, var4);
            case 15:
               return new xj(var0, var3, var4);
            case 16:
               return new xc(var0, var3, var4);
            case 17:
               return new xp(var0, var3, var4);
            case 18:
               return new xa(var0, var3, var4);
            case 19:
               return new mt(var0, var3, var5, var4);
            case 20:
               return new m2(var0, var14, var3, var4);
         }
      } catch (gj var28) {
         throw x44.a<"r">(var28, 4292154931282105274L, var1);
      }
   }

   public static List Y(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = bb ^ var2;
      long var4 = var2 ^ 86039775920607L;
      long var6 = var2 ^ 94760781930774L;
      List var9 = X(var4, var1);
      String[] var10000 = x44.a<"u">(-6797059987662257078L, var2);
      int var10 = var9.size();
      String[] var8 = var10000;
      int var11 = 0;

      label34:
      while (var11 < var10) {
         String var12 = (String)var9.get(var11);

         do {
            try {
               if (var2 >= 0L) {
                  if (var8 != null) {
                     return var9;
                  }

                  var9.set(var11, x44.a<"u">(new Object[]{var6, var12}, -6442675829644902511L, var2));
               }

               var11++;
               if (var8 == null) {
                  continue label34;
               }
            } catch (gj var13) {
               throw x44.a<"u">(var13, -6822967167240943259L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var9;
   }

   @Override
   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static xl v(int var0, long var1, _xx var3, _8c var4) {
      var1 = bb ^ var1;
      long var5 = var1 ^ 119000826987071L;
      long var10001 = var1 ^ 123354781957062L;
      int var7 = (int)((var1 ^ 123354781957062L) >>> 48);
      int var8 = (int)((var1 ^ 123354781957062L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var1 ^ 45361437064087L;
      long var12 = var1 ^ 30119091085727L;
      long var14 = var1 ^ 102982423504727L;
      var10001 = var1 ^ 62274577779163L;
      int var16 = (int)((var1 ^ 62274577779163L) >>> 32);
      int var17 = (int)((var1 ^ 62274577779163L) << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var19 = var1 ^ 136167609981125L;
      long var21 = var1 ^ 99305356808153L;
      long var23 = var1 ^ 40824735207795L;
      long var25 = var1 ^ 57959658723485L;
      int var27 = var3.readUnsignedByte();

      try {
         switch (var27) {
            case 1:
               return new mx(var0, var16, var3, var4, (char)var17, var18);
            case 2:
            case 13:
            case 14:
            default:
               throw new _sx(
                  a<"f">(29509, 3398123035518170687L ^ var1)
                     + x44.a<"m">(var4, new Object[]{var21}, 4683526560924773765L, var1)
                     + a<"f">(12490, 717637301197452724L ^ var1)
                     + var27
                     + a<"f">(7011, 777390027336195593L ^ var1)
                     + var0
                     + a<"f">(8761, 1093612633070184308L ^ var1)
               );
            case 3:
               return new mf(var0, var3, var12, var4);
            case 4:
               return new xv(var0, var23, var3, var4);
            case 5:
               return new ms(var0, var19, var3, var4);
            case 6:
               return new xh(var0, var3, (short)var7, var4, (char)var8, var9);
            case 7:
               return new x6(var0, var25, var3, var4);
            case 8:
               return new m4(var0, var3, var10, var4);
            case 9:
               return new mi(var0, var3, var4);
            case 10:
               return new ml(var0, var3, var4);
            case 11:
               return new m5(var0, var3, var4);
            case 12:
               return new mm(var0, var3, var4);
            case 15:
               return new xj(var0, var3, var4);
            case 16:
               return new xc(var0, var3, var4);
            case 17:
               return new xp(var0, var3, var4);
            case 18:
               return new xa(var0, var3, var4);
            case 19:
               return new mt(var0, var3, var5, var4);
            case 20:
               return new m2(var0, var14, var3, var4);
         }
      } catch (gj var28) {
         throw x44.a<"u">(var28, 6467031424126792085L, var1);
      }
   }

   public static String q(String param0, HashMap param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/xl.bb J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: ldc2_w -5436809201178455699
      // 009: lload 2
      // 00a: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: bipush 0
      // 010: istore 5
      // 012: astore 4
      // 014: aload 0
      // 015: sipush 11069
      // 018: ldc2_w 8421648762646728750
      // 01b: lload 2
      // 01c: lxor
      // 01d: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: iload 5
      // 024: invokevirtual java/lang/String.indexOf (II)I
      // 027: dup
      // 028: istore 5
      // 02a: bipush -1
      // 02b: if_icmpeq 22d
      // 02e: aload 0
      // 02f: aload 4
      // 031: ifnonnull 22e
      // 034: sipush 4286
      // 037: ldc2_w 3246155768830831531
      // 03a: lload 2
      // 03b: lxor
      // 03c: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: iload 5
      // 043: invokevirtual java/lang/String.indexOf (II)I
      // 046: istore 6
      // 048: iload 6
      // 04a: bipush -1
      // 04b: if_icmpne 060
      // 04e: aload 4
      // 050: ifnull 22d
      // 053: goto 060
      // 056: ldc2_w -5446931536013992894
      // 059: lload 2
      // 05a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: aload 0
      // 061: iload 5
      // 063: bipush 1
      // 064: iadd
      // 065: iload 6
      // 067: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 06a: astore 7
      // 06c: aconst_null
      // 06d: astore 8
      // 06f: aload 7
      // 071: sipush 11760
      // 074: ldc2_w 1695705463688369894
      // 077: lload 2
      // 078: lxor
      // 079: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokevirtual java/lang/String.indexOf (I)I
      // 081: lload 2
      // 082: lconst_0
      // 083: lcmp
      // 084: iflt 0bb
      // 087: aload 4
      // 089: ifnonnull 0bb
      // 08c: ifle 144
      // 08f: goto 09c
      // 092: ldc2_w -5446931536013992894
      // 095: lload 2
      // 096: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 7
      // 09e: sipush 11760
      // 0a1: ldc2_w 1695705463688369894
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: invokevirtual java/lang/String.lastIndexOf (I)I
      // 0ae: goto 0bb
      // 0b1: ldc2_w -5446931536013992894
      // 0b4: lload 2
      // 0b5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 7
      // 0bd: invokevirtual java/lang/String.length ()I
      // 0c0: lload 2
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: ifle 113
      // 0c6: aload 4
      // 0c8: ifnonnull 113
      // 0cb: if_icmpge 144
      // 0ce: goto 0db
      // 0d1: ldc2_w -5446931536013992894
      // 0d4: lload 2
      // 0d5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 7
      // 0dd: lload 2
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 142
      // 0e3: sipush 18794
      // 0e6: ldc2_w 3818653963095667315
      // 0e9: lload 2
      // 0ea: lxor
      // 0eb: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: aload 4
      // 0f2: ifnonnull 132
      // 0f5: goto 102
      // 0f8: ldc2_w -5446931536013992894
      // 0fb: lload 2
      // 0fc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: invokevirtual java/lang/String.indexOf (I)I
      // 105: bipush -1
      // 106: goto 113
      // 109: ldc2_w -5446931536013992894
      // 10c: lload 2
      // 10d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: if_icmpne 144
      // 116: aload 7
      // 118: sipush 11760
      // 11b: ldc2_w 1695705463688369894
      // 11e: lload 2
      // 11f: lxor
      // 120: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: goto 132
      // 128: ldc2_w -5446931536013992894
      // 12b: lload 2
      // 12c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: sipush 18794
      // 135: ldc2_w 3818653963095667315
      // 138: lload 2
      // 139: lxor
      // 13a: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 142: astore 8
      // 144: aload 1
      // 145: aload 8
      // 147: aload 4
      // 149: ifnonnull 15e
      // 14c: ifnonnull 161
      // 14f: goto 15c
      // 152: ldc2_w -5446931536013992894
      // 155: lload 2
      // 156: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: aload 7
      // 15e: goto 163
      // 161: aload 8
      // 163: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 166: checkcast java/lang/String
      // 169: astore 9
      // 16b: aload 4
      // 16d: lload 2
      // 16e: lconst_0
      // 16f: lcmp
      // 170: ifle 22a
      // 173: ifnonnull 228
      // 176: aload 9
      // 178: ifnull 224
      // 17b: goto 188
      // 17e: ldc2_w -5446931536013992894
      // 181: lload 2
      // 182: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: aload 8
      // 18a: lload 2
      // 18b: lconst_0
      // 18c: lcmp
      // 18d: ifle 1d5
      // 190: aload 4
      // 192: ifnonnull 1d5
      // 195: goto 1a2
      // 198: ldc2_w -5446931536013992894
      // 19b: lload 2
      // 19c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: ifnull 1d3
      // 1a5: goto 1b2
      // 1a8: ldc2_w -5446931536013992894
      // 1ab: lload 2
      // 1ac: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: athrow
      // 1b2: aload 9
      // 1b4: sipush 18794
      // 1b7: ldc2_w 3818653963095667315
      // 1ba: lload 2
      // 1bb: lxor
      // 1bc: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: sipush 11760
      // 1c4: ldc2_w 1695705463688369894
      // 1c7: lload 2
      // 1c8: lxor
      // 1c9: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1d1: astore 9
      // 1d3: aload 9
      // 1d5: aload 7
      // 1d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1da: aload 4
      // 1dc: ifnonnull 226
      // 1df: ifne 224
      // 1e2: goto 1ef
      // 1e5: ldc2_w -5446931536013992894
      // 1e8: lload 2
      // 1e9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: athrow
      // 1ef: new java/lang/StringBuilder
      // 1f2: dup
      // 1f3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f6: aload 0
      // 1f7: bipush 0
      // 1f8: iload 5
      // 1fa: bipush 1
      // 1fb: iadd
      // 1fc: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 202: aload 9
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: aload 0
      // 208: iload 6
      // 20a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 213: astore 0
      // 214: iload 6
      // 216: aload 9
      // 218: invokevirtual java/lang/String.length ()I
      // 21b: iadd
      // 21c: aload 7
      // 21e: invokevirtual java/lang/String.length ()I
      // 221: isub
      // 222: istore 6
      // 224: iload 6
      // 226: istore 5
      // 228: aload 4
      // 22a: ifnull 014
      // 22d: aload 0
      // 22e: areturn
   }

   public static String T(Object[] param0) {
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
      // 013: getstatic com/zelix/xl.bb J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 108011814691260
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 22886291703616
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: ldc2_w -7957305713230351248
      // 02c: lload 2
      // 02d: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: astore 8
      // 034: aload 1
      // 035: invokevirtual java/lang/String.length ()I
      // 038: aload 8
      // 03a: ifnonnull 0c4
      // 03d: bipush 1
      // 03e: if_icmpne 0b3
      // 041: goto 04e
      // 044: ldc2_w -7965188873441871521
      // 047: lload 2
      // 048: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: athrow
      // 04e: aload 1
      // 04f: aload 8
      // 051: ifnonnull 0b2
      // 054: goto 061
      // 057: ldc2_w -7965188873441871521
      // 05a: lload 2
      // 05b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: lload 4
      // 063: bipush 2
      // 064: anewarray 269
      // 067: dup_x2
      // 068: dup_x2
      // 069: pop
      // 06a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06d: bipush 1
      // 06e: swap
      // 06f: aastore
      // 070: dup_x1
      // 071: swap
      // 072: bipush 0
      // 073: swap
      // 074: aastore
      // 075: ldc2_w -7959844124727745628
      // 078: lload 2
      // 079: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: ifeq 09a
      // 081: goto 08e
      // 084: ldc2_w -7965188873441871521
      // 087: lload 2
      // 088: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: aload 1
      // 08f: areturn
      // 090: ldc2_w -7965188873441871521
      // 093: lload 2
      // 094: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: new java/lang/StringBuilder
      // 09d: dup
      // 09e: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a1: ldc "L"
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6: aload 1
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: ldc ";"
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b2: areturn
      // 0b3: aload 1
      // 0b4: sipush 32474
      // 0b7: ldc2_w 8967273196207158100
      // 0ba: lload 2
      // 0bb: lxor
      // 0bc: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0c4: istore 10
      // 0c6: iload 10
      // 0c8: bipush -1
      // 0c9: if_icmple 0e0
      // 0cc: aload 1
      // 0cd: bipush 0
      // 0ce: iload 10
      // 0d0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0d3: lload 2
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 0e1
      // 0d9: astore 9
      // 0db: aload 8
      // 0dd: ifnull 0e3
      // 0e0: aload 1
      // 0e1: astore 9
      // 0e3: aload 9
      // 0e5: sipush 18414
      // 0e8: ldc2_w 7934511617880480236
      // 0eb: lload 2
      // 0ec: lxor
      // 0ed: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: invokevirtual java/lang/String.lastIndexOf (I)I
      // 0f5: istore 11
      // 0f7: iload 11
      // 0f9: bipush -1
      // 0fa: lload 2
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: ifle 13e
      // 100: aload 8
      // 102: ifnonnull 13e
      // 105: if_icmple 120
      // 108: goto 115
      // 10b: ldc2_w -7965188873441871521
      // 10e: lload 2
      // 10f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 9
      // 117: iload 11
      // 119: bipush 1
      // 11a: iadd
      // 11b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 11e: astore 9
      // 120: aload 9
      // 122: invokevirtual java/lang/String.length ()I
      // 125: lload 2
      // 126: lconst_0
      // 127: lcmp
      // 128: iflt 1e2
      // 12b: aload 8
      // 12d: ifnonnull 1e2
      // 130: bipush 1
      // 131: goto 13e
      // 134: ldc2_w -7965188873441871521
      // 137: lload 2
      // 138: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: if_icmpne 1a8
      // 141: aload 9
      // 143: lload 4
      // 145: bipush 2
      // 146: anewarray 269
      // 149: dup_x2
      // 14a: dup_x2
      // 14b: pop
      // 14c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14f: bipush 1
      // 150: swap
      // 151: aastore
      // 152: dup_x1
      // 153: swap
      // 154: bipush 0
      // 155: swap
      // 156: aastore
      // 157: ldc2_w -7959844124727745628
      // 15a: lload 2
      // 15b: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: aload 8
      // 162: ifnonnull 23d
      // 165: goto 172
      // 168: ldc2_w -7965188873441871521
      // 16b: lload 2
      // 16c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: ifne 23c
      // 175: goto 182
      // 178: ldc2_w -7965188873441871521
      // 17b: lload 2
      // 17c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: new java/lang/StringBuilder
      // 185: dup
      // 186: invokespecial java/lang/StringBuilder.<init> ()V
      // 189: ldc "L"
      // 18b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18e: aload 9
      // 190: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 193: ldc ";"
      // 195: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 198: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19b: astore 9
      // 19d: lload 2
      // 19e: lconst_0
      // 19f: lcmp
      // 1a0: ifle 1c9
      // 1a3: aload 8
      // 1a5: ifnull 23c
      // 1a8: aload 9
      // 1aa: sipush 11760
      // 1ad: ldc2_w 1695659590022902779
      // 1b0: lload 2
      // 1b1: lxor
      // 1b2: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: sipush 18794
      // 1ba: ldc2_w 3818770765628397422
      // 1bd: lload 2
      // 1be: lxor
      // 1bf: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1c7: astore 9
      // 1c9: aload 9
      // 1cb: aload 8
      // 1cd: ifnonnull 23a
      // 1d0: ldc "L"
      // 1d2: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1d5: goto 1e2
      // 1d8: ldc2_w -7965188873441871521
      // 1db: lload 2
      // 1dc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: lload 2
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: iflt 1f2
      // 1e8: ifeq 214
      // 1eb: aload 9
      // 1ed: ldc ";"
      // 1ef: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1f2: aload 8
      // 1f4: ifnonnull 23d
      // 1f7: goto 204
      // 1fa: ldc2_w -7965188873441871521
      // 1fd: lload 2
      // 1fe: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: ifne 23c
      // 207: goto 214
      // 20a: ldc2_w -7965188873441871521
      // 20d: lload 2
      // 20e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: new java/lang/StringBuilder
      // 217: dup
      // 218: invokespecial java/lang/StringBuilder.<init> ()V
      // 21b: ldc "L"
      // 21d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 220: aload 9
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: ldc ";"
      // 227: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22d: goto 23a
      // 230: ldc2_w -7965188873441871521
      // 233: lload 2
      // 234: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: athrow
      // 23a: astore 9
      // 23c: bipush 0
      // 23d: istore 12
      // 23f: iload 10
      // 241: bipush -1
      // 242: aload 8
      // 244: ifnonnull 2b6
      // 247: if_icmple 294
      // 24a: goto 257
      // 24d: ldc2_w -7965188873441871521
      // 250: lload 2
      // 251: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: aload 1
      // 258: lload 6
      // 25a: sipush 18065
      // 25d: ldc2_w 5908773344349424419
      // 260: lload 2
      // 261: lxor
      // 262: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: bipush 3
      // 268: anewarray 269
      // 26b: dup_x1
      // 26c: swap
      // 26d: bipush 2
      // 26e: swap
      // 26f: aastore
      // 270: dup_x2
      // 271: dup_x2
      // 272: pop
      // 273: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 276: bipush 1
      // 277: swap
      // 278: aastore
      // 279: dup_x1
      // 27a: swap
      // 27b: bipush 0
      // 27c: swap
      // 27d: aastore
      // 27e: ldc2_w -7695954250539338945
      // 281: lload 2
      // 282: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: istore 12
      // 289: lload 2
      // 28a: lconst_0
      // 28b: lcmp
      // 28c: iflt 294
      // 28f: aload 8
      // 291: ifnull 2bf
      // 294: iload 11
      // 296: aload 8
      // 298: ifnonnull 2c0
      // 29b: goto 2a8
      // 29e: ldc2_w -7965188873441871521
      // 2a1: lload 2
      // 2a2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: bipush -1
      // 2a9: goto 2b6
      // 2ac: ldc2_w -7965188873441871521
      // 2af: lload 2
      // 2b0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: if_icmple 2bf
      // 2b9: iload 11
      // 2bb: bipush 1
      // 2bc: iadd
      // 2bd: istore 12
      // 2bf: bipush 0
      // 2c0: istore 13
      // 2c2: iload 13
      // 2c4: iload 12
      // 2c6: if_icmpge 2f7
      // 2c9: new java/lang/StringBuilder
      // 2cc: dup
      // 2cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d0: sipush 18414
      // 2d3: ldc2_w 7934511617880480236
      // 2d6: lload 2
      // 2d7: lxor
      // 2d8: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2e0: aload 9
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e8: aload 8
      // 2ea: ifnonnull 2ff
      // 2ed: astore 9
      // 2ef: iinc 13 1
      // 2f2: aload 8
      // 2f4: ifnull 2c2
      // 2f7: lload 2
      // 2f8: lconst_0
      // 2f9: lcmp
      // 2fa: iflt 2f2
      // 2fd: aload 9
      // 2ff: areturn
   }

   abstract void T(long var1, DataOutputStream var3);

   public boolean T(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/xl.bb J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 48866272121320
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 7223746946375549406
      // 1e: lload 2
      // 1f: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: lload 4
      // 27: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 2a: astore 7
      // 2c: astore 6
      // 2e: aload 7
      // 30: ldc2_w 7133020223645836013
      // 33: lload 2
      // 34: invokedynamic h (JJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: invokevirtual com/zelix/w5.equals (Ljava/lang/Object;)Z
      // 3c: aload 6
      // 3e: ifnonnull 82
      // 41: ifne 81
      // 44: goto 51
      // 47: ldc2_w 7267659596975213809
      // 4a: lload 2
      // 4b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 7
      // 53: ldc2_w 9158248690037008826
      // 56: lload 2
      // 57: invokedynamic h (JJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: invokevirtual com/zelix/w5.equals (Ljava/lang/Object;)Z
      // 5f: aload 6
      // 61: ifnonnull 82
      // 64: goto 71
      // 67: ldc2_w 7267659596975213809
      // 6a: lload 2
      // 6b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: ifeq 85
      // 74: goto 81
      // 77: ldc2_w 7267659596975213809
      // 7a: lload 2
      // 7b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   public static boolean f(Object[] param0) {
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
      // 013: getstatic com/zelix/xl.bb J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w -5621684781371173862
      // 01c: lload 2
      // 01d: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 4
      // 024: aload 1
      // 025: ldc ","
      // 027: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 02a: aload 4
      // 02c: ifnonnull 0eb
      // 02f: bipush -1
      // 030: if_icmpgt 0dd
      // 033: goto 040
      // 036: ldc2_w -5683598739822126795
      // 039: lload 2
      // 03a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: athrow
      // 040: aload 1
      // 041: sipush 17862
      // 044: ldc2_w 5440911137091779497
      // 047: lload 2
      // 048: lxor
      // 049: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: invokevirtual java/lang/String.indexOf (I)I
      // 051: aload 4
      // 053: ifnonnull 0eb
      // 056: goto 063
      // 059: ldc2_w -5683598739822126795
      // 05c: lload 2
      // 05d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: lload 2
      // 064: lconst_0
      // 065: lcmp
      // 066: iflt 0de
      // 069: bipush -1
      // 06a: if_icmpgt 0dd
      // 06d: goto 07a
      // 070: ldc2_w -5683598739822126795
      // 073: lload 2
      // 074: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 1
      // 07b: sipush 11760
      // 07e: ldc2_w 1695616861046936465
      // 081: lload 2
      // 082: lxor
      // 083: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: invokevirtual java/lang/String.indexOf (I)I
      // 08b: aload 4
      // 08d: ifnonnull 0eb
      // 090: goto 09d
      // 093: ldc2_w -5683598739822126795
      // 096: lload 2
      // 097: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: lload 2
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: ifle 0de
      // 0a3: bipush -1
      // 0a4: if_icmpgt 0dd
      // 0a7: goto 0b4
      // 0aa: ldc2_w -5683598739822126795
      // 0ad: lload 2
      // 0ae: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 1
      // 0b5: ldc " "
      // 0b7: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0ba: aload 4
      // 0bc: ifnonnull 0ed
      // 0bf: goto 0cc
      // 0c2: ldc2_w -5683598739822126795
      // 0c5: lload 2
      // 0c6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: bipush -1
      // 0cd: if_icmple 0ec
      // 0d0: goto 0dd
      // 0d3: ldc2_w -5683598739822126795
      // 0d6: lload 2
      // 0d7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: bipush 0
      // 0de: goto 0eb
      // 0e1: ldc2_w -5683598739822126795
      // 0e4: lload 2
      // 0e5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: ireturn
      // 0ec: bipush 0
      // 0ed: istore 5
      // 0ef: aload 1
      // 0f0: iload 5
      // 0f2: invokevirtual java/lang/String.charAt (I)C
      // 0f5: sipush 18414
      // 0f8: ldc2_w 7934559295866730886
      // 0fb: lload 2
      // 0fc: lxor
      // 0fd: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: if_icmpne 10d
      // 105: iinc 5 1
      // 108: aload 4
      // 10a: ifnull 0ef
      // 10d: aload 1
      // 10e: iload 5
      // 110: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 113: astore 6
      // 115: lload 2
      // 116: lconst_0
      // 117: lcmp
      // 118: iflt 108
      // 11b: aload 6
      // 11d: ldc "L"
      // 11f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 122: aload 4
      // 124: lload 2
      // 125: lconst_0
      // 126: lcmp
      // 127: ifle 1a3
      // 12a: ifnonnull 1a1
      // 12d: ifeq 19c
      // 130: goto 13d
      // 133: ldc2_w -5683598739822126795
      // 136: lload 2
      // 137: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 6
      // 13f: ldc ";"
      // 141: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 144: aload 4
      // 146: ifnonnull 19b
      // 149: goto 156
      // 14c: ldc2_w -5683598739822126795
      // 14f: lload 2
      // 150: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: ifne 19a
      // 159: goto 166
      // 15c: ldc2_w -5683598739822126795
      // 15f: lload 2
      // 160: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: aload 6
      // 168: invokevirtual java/lang/String.length ()I
      // 16b: aload 4
      // 16d: ifnonnull 19b
      // 170: goto 17d
      // 173: ldc2_w -5683598739822126795
      // 176: lload 2
      // 177: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: bipush 2
      // 17e: if_icmpgt 19a
      // 181: goto 18e
      // 184: ldc2_w -5683598739822126795
      // 187: lload 2
      // 188: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: bipush 0
      // 18f: ireturn
      // 190: ldc2_w -5683598739822126795
      // 193: lload 2
      // 194: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: bipush 1
      // 19b: ireturn
      // 19c: aload 6
      // 19e: invokevirtual java/lang/String.length ()I
      // 1a1: aload 4
      // 1a3: ifnonnull 1cd
      // 1a6: bipush 1
      // 1a7: if_icmpne 1cc
      // 1aa: goto 1b7
      // 1ad: ldc2_w -5683598739822126795
      // 1b0: lload 2
      // 1b1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: getstatic com/zelix/xl.U Ljava/util/Map;
      // 1ba: aload 6
      // 1bc: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1c1: ireturn
      // 1c2: ldc2_w -5683598739822126795
      // 1c5: lload 2
      // 1c6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: bipush 0
      // 1cd: ireturn
   }

   public static hz Q(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = bb ^ var1;
      long var4 = var1 ^ 39822275407990L;
      long var6 = var1 ^ 10674987387231L;
      String[] var10000 = x44.a<"w">(-8990936121729292584L, var1);
      String var9 = hz.P(var3, var6);
      String[] var8 = var10000;

      label35: {
         try {
            var10000 = var9;
            if (var8 != null) {
               break label35;
            }

            if (var9 == null) {
               return null;
            }
         } catch (gj var12) {
            throw x44.a<"w">(var12, -8944771950355059721L, var1);
         }

         var10000 = var9;
      }

      hz var10 = yn.x(var4, var10000);

      try {
         if (var8 != null) {
            return var10;
         }

         if (var10 == null) {
            return null;
         }
      } catch (gj var11) {
         throw x44.a<"w">(var11, -8944771950355059721L, var1);
      }

      return var10;
   }

   public static String A(Object[] param0) {
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
      // 00b: checkcast java/util/Map
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/xx
      // 020: astore 5
      // 022: pop
      // 023: getstatic com/zelix/xl.bb J
      // 026: lload 1
      // 027: lxor
      // 028: lstore 1
      // 029: aload 5
      // 02b: bipush 0
      // 02c: invokevirtual com/zelix/xx.Q (Z)V
      // 02f: aload 3
      // 030: astore 7
      // 032: ldc2_w 7096492576884524954
      // 035: lload 1
      // 036: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: aload 7
      // 03d: invokevirtual java/lang/String.length ()I
      // 040: istore 8
      // 042: aconst_null
      // 043: astore 9
      // 045: aconst_null
      // 046: astore 10
      // 048: astore 6
      // 04a: aload 7
      // 04c: ldc ";"
      // 04e: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 051: ifeq 1f8
      // 054: new java/lang/StringBuilder
      // 057: dup
      // 058: invokespecial java/lang/StringBuilder.<init> ()V
      // 05b: astore 9
      // 05d: aload 7
      // 05f: ldc "["
      // 061: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 064: lload 1
      // 065: lconst_0
      // 066: lcmp
      // 067: iflt 1ad
      // 06a: aload 6
      // 06c: ifnonnull 1ad
      // 06f: ifeq 187
      // 072: goto 07f
      // 075: ldc2_w 7106609914386811573
      // 078: lload 1
      // 079: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 9
      // 081: sipush 18414
      // 084: ldc2_w 7934562698768427526
      // 087: lload 1
      // 088: lxor
      // 089: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 091: pop
      // 092: bipush 1
      // 093: istore 11
      // 095: iload 11
      // 097: iload 8
      // 099: if_icmpge 176
      // 09c: aload 7
      // 09e: lload 1
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: iflt 1e6
      // 0a4: iload 11
      // 0a6: invokevirtual java/lang/String.charAt (I)C
      // 0a9: istore 12
      // 0ab: aload 6
      // 0ad: ifnonnull 1e4
      // 0b0: iload 12
      // 0b2: sipush 18414
      // 0b5: ldc2_w 7934562698768427526
      // 0b8: lload 1
      // 0b9: lxor
      // 0ba: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: lload 1
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: iflt 134
      // 0c5: aload 6
      // 0c7: ifnonnull 134
      // 0ca: goto 0d7
      // 0cd: ldc2_w 7106609914386811573
      // 0d0: lload 1
      // 0d1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: lload 1
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: ifle 127
      // 0dd: if_icmpne 118
      // 0e0: goto 0ed
      // 0e3: ldc2_w 7106609914386811573
      // 0e6: lload 1
      // 0e7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 9
      // 0ef: sipush 18414
      // 0f2: ldc2_w 7934562698768427526
      // 0f5: lload 1
      // 0f6: lxor
      // 0f7: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ff: pop
      // 100: aload 6
      // 102: lload 1
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 173
      // 108: ifnull 16e
      // 10b: goto 118
      // 10e: ldc2_w 7106609914386811573
      // 111: lload 1
      // 112: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: iload 12
      // 11a: sipush 11069
      // 11d: ldc2_w 8421705318913951449
      // 120: lload 1
      // 121: lxor
      // 122: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: goto 134
      // 12a: ldc2_w 7106609914386811573
      // 12d: lload 1
      // 12e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: if_icmpne 162
      // 137: aload 9
      // 139: sipush 11069
      // 13c: ldc2_w 8421705318913951449
      // 13f: lload 1
      // 140: lxor
      // 141: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 149: pop
      // 14a: aload 6
      // 14c: lload 1
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: ifle 184
      // 152: ifnull 176
      // 155: goto 162
      // 158: ldc2_w 7106609914386811573
      // 15b: lload 1
      // 15c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: aload 3
      // 163: areturn
      // 164: ldc2_w 7106609914386811573
      // 167: lload 1
      // 168: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: iinc 11 1
      // 171: aload 6
      // 173: ifnull 095
      // 176: lload 1
      // 177: lconst_0
      // 178: lcmp
      // 179: iflt 1e4
      // 17c: lload 1
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: iflt 187
      // 182: aload 6
      // 184: ifnull 1e4
      // 187: aload 7
      // 189: aload 6
      // 18b: ifnonnull 1e3
      // 18e: goto 19b
      // 191: ldc2_w 7106609914386811573
      // 194: lload 1
      // 195: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: ldc "L"
      // 19d: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1a0: goto 1ad
      // 1a3: ldc2_w 7106609914386811573
      // 1a6: lload 1
      // 1a7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: ifeq 1d5
      // 1b0: aload 9
      // 1b2: sipush 11069
      // 1b5: ldc2_w 8421705318913951449
      // 1b8: lload 1
      // 1b9: lxor
      // 1ba: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1c2: pop
      // 1c3: aload 6
      // 1c5: ifnull 1e4
      // 1c8: goto 1d5
      // 1cb: ldc2_w 7106609914386811573
      // 1ce: lload 1
      // 1cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: aload 3
      // 1d6: goto 1e3
      // 1d9: ldc2_w 7106609914386811573
      // 1dc: lload 1
      // 1dd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: areturn
      // 1e4: ldc ";"
      // 1e6: astore 10
      // 1e8: aload 7
      // 1ea: aload 9
      // 1ec: invokevirtual java/lang/StringBuilder.length ()I
      // 1ef: iload 8
      // 1f1: bipush 1
      // 1f2: isub
      // 1f3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f6: astore 7
      // 1f8: bipush 0
      // 1f9: istore 11
      // 1fb: aload 7
      // 1fd: aload 6
      // 1ff: ifnonnull 296
      // 202: sipush 11760
      // 205: ldc2_w 1695613585878499345
      // 208: lload 1
      // 209: lxor
      // 20a: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: invokevirtual java/lang/String.indexOf (I)I
      // 212: bipush -1
      // 213: if_icmpeq 287
      // 216: goto 223
      // 219: ldc2_w 7106609914386811573
      // 21c: lload 1
      // 21d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: athrow
      // 223: aload 7
      // 225: aload 6
      // 227: ifnonnull 296
      // 22a: goto 237
      // 22d: ldc2_w 7106609914386811573
      // 230: lload 1
      // 231: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: athrow
      // 237: sipush 18794
      // 23a: ldc2_w 3818710793696617604
      // 23d: lload 1
      // 23e: lxor
      // 23f: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: invokevirtual java/lang/String.indexOf (I)I
      // 247: bipush -1
      // 248: if_icmpne 287
      // 24b: goto 258
      // 24e: ldc2_w 7106609914386811573
      // 251: lload 1
      // 252: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: athrow
      // 258: aload 7
      // 25a: sipush 11760
      // 25d: ldc2_w 1695613585878499345
      // 260: lload 1
      // 261: lxor
      // 262: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: sipush 18794
      // 26a: ldc2_w 3818710793696617604
      // 26d: lload 1
      // 26e: lxor
      // 26f: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 277: astore 12
      // 279: bipush 1
      // 27a: istore 11
      // 27c: aload 6
      // 27e: lload 1
      // 27f: lconst_0
      // 280: lcmp
      // 281: ifle 2a1
      // 284: ifnull 298
      // 287: aload 7
      // 289: goto 296
      // 28c: ldc2_w 7106609914386811573
      // 28f: lload 1
      // 290: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: astore 12
      // 298: aload 4
      // 29a: aload 12
      // 29c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a1: checkcast java/lang/String
      // 2a4: astore 13
      // 2a6: aload 5
      // 2a8: aload 13
      // 2aa: ifnull 2bb
      // 2ad: bipush 1
      // 2ae: goto 2bc
      // 2b1: ldc2_w 7106609914386811573
      // 2b4: lload 1
      // 2b5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: athrow
      // 2bb: bipush 0
      // 2bc: invokevirtual com/zelix/xx.Q (Z)V
      // 2bf: aload 7
      // 2c1: invokevirtual java/lang/String.length ()I
      // 2c4: istore 14
      // 2c6: aload 7
      // 2c8: sipush 11760
      // 2cb: ldc2_w 1695613585878499345
      // 2ce: lload 1
      // 2cf: lxor
      // 2d0: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: invokevirtual java/lang/String.indexOf (I)I
      // 2d8: istore 15
      // 2da: aload 7
      // 2dc: sipush 11760
      // 2df: ldc2_w 1695613585878499345
      // 2e2: lload 1
      // 2e3: lxor
      // 2e4: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: invokevirtual java/lang/String.lastIndexOf (I)I
      // 2ec: istore 16
      // 2ee: aload 7
      // 2f0: sipush 18794
      // 2f3: ldc2_w 3818710793696617604
      // 2f6: lload 1
      // 2f7: lxor
      // 2f8: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: invokevirtual java/lang/String.indexOf (I)I
      // 300: istore 17
      // 302: aload 7
      // 304: sipush 18794
      // 307: ldc2_w 3818710793696617604
      // 30a: lload 1
      // 30b: lxor
      // 30c: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: invokevirtual java/lang/String.lastIndexOf (I)I
      // 314: istore 18
      // 316: aload 13
      // 318: aload 6
      // 31a: ifnonnull 547
      // 31d: ifnull 546
      // 320: goto 32d
      // 323: ldc2_w 7106609914386811573
      // 326: lload 1
      // 327: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: athrow
      // 32d: aload 13
      // 32f: aload 6
      // 331: ifnonnull 547
      // 334: goto 341
      // 337: ldc2_w 7106609914386811573
      // 33a: lload 1
      // 33b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: athrow
      // 341: aload 12
      // 343: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 346: ifne 546
      // 349: goto 356
      // 34c: ldc2_w 7106609914386811573
      // 34f: lload 1
      // 350: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: athrow
      // 356: aload 12
      // 358: aload 6
      // 35a: ifnonnull 547
      // 35d: goto 36a
      // 360: ldc2_w 7106609914386811573
      // 363: lload 1
      // 364: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: athrow
      // 36a: invokevirtual java/lang/String.length ()I
      // 36d: ldc2_w 9041623653856353590
      // 370: lload 1
      // 371: invokedynamic l (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: if_icmplt 546
      // 379: goto 386
      // 37c: ldc2_w 7106609914386811573
      // 37f: lload 1
      // 380: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: aload 12
      // 388: aload 6
      // 38a: ifnonnull 547
      // 38d: goto 39a
      // 390: ldc2_w 7106609914386811573
      // 393: lload 1
      // 394: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 399: athrow
      // 39a: bipush 0
      // 39b: invokevirtual java/lang/String.charAt (I)C
      // 39e: ldc2_w 7392118998648693825
      // 3a1: lload 1
      // 3a2: invokedynamic u (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: ifeq 546
      // 3aa: goto 3b7
      // 3ad: ldc2_w 7106609914386811573
      // 3b0: lload 1
      // 3b1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: athrow
      // 3b7: iload 15
      // 3b9: aload 6
      // 3bb: ifnonnull 449
      // 3be: goto 3cb
      // 3c1: ldc2_w 7106609914386811573
      // 3c4: lload 1
      // 3c5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: athrow
      // 3cb: lload 1
      // 3cc: lconst_0
      // 3cd: lcmp
      // 3ce: iflt 43c
      // 3d1: ifle 43a
      // 3d4: goto 3e1
      // 3d7: ldc2_w 7106609914386811573
      // 3da: lload 1
      // 3db: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e0: athrow
      // 3e1: iload 16
      // 3e3: aload 6
      // 3e5: lload 1
      // 3e6: lconst_0
      // 3e7: lcmp
      // 3e8: ifle 451
      // 3eb: ifnonnull 449
      // 3ee: goto 3fb
      // 3f1: ldc2_w 7106609914386811573
      // 3f4: lload 1
      // 3f5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fa: athrow
      // 3fb: lload 1
      // 3fc: lconst_0
      // 3fd: lcmp
      // 3fe: ifle 43c
      // 401: iload 14
      // 403: bipush 1
      // 404: isub
      // 405: if_icmpge 43a
      // 408: goto 415
      // 40b: ldc2_w 7106609914386811573
      // 40e: lload 1
      // 40f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: athrow
      // 415: iload 17
      // 417: aload 6
      // 419: ifnonnull 4a6
      // 41c: goto 429
      // 41f: ldc2_w 7106609914386811573
      // 422: lload 1
      // 423: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 428: athrow
      // 429: bipush -1
      // 42a: if_icmpeq 4a4
      // 42d: goto 43a
      // 430: ldc2_w 7106609914386811573
      // 433: lload 1
      // 434: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: athrow
      // 43a: iload 17
      // 43c: goto 449
      // 43f: ldc2_w 7106609914386811573
      // 442: lload 1
      // 443: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: athrow
      // 449: lload 1
      // 44a: lconst_0
      // 44b: lcmp
      // 44c: ifle 466
      // 44f: aload 6
      // 451: ifnonnull 466
      // 454: ifle 546
      // 457: goto 464
      // 45a: ldc2_w 7106609914386811573
      // 45d: lload 1
      // 45e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 463: athrow
      // 464: iload 18
      // 466: iload 14
      // 468: bipush 1
      // 469: isub
      // 46a: aload 6
      // 46c: ifnonnull 4a1
      // 46f: if_icmpge 546
      // 472: goto 47f
      // 475: ldc2_w 7106609914386811573
      // 478: lload 1
      // 479: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47e: athrow
      // 47f: iload 15
      // 481: aload 6
      // 483: ifnonnull 4a6
      // 486: goto 493
      // 489: ldc2_w 7106609914386811573
      // 48c: lload 1
      // 48d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 492: athrow
      // 493: bipush -1
      // 494: goto 4a1
      // 497: ldc2_w 7106609914386811573
      // 49a: lload 1
      // 49b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a0: athrow
      // 4a1: if_icmpne 546
      // 4a4: iload 11
      // 4a6: ifeq 4ca
      // 4a9: aload 13
      // 4ab: sipush 18794
      // 4ae: ldc2_w 3818710793696617604
      // 4b1: lload 1
      // 4b2: lxor
      // 4b3: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b8: sipush 11760
      // 4bb: ldc2_w 1695613585878499345
      // 4be: lload 1
      // 4bf: lxor
      // 4c0: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 4c8: astore 13
      // 4ca: new java/lang/StringBuilder
      // 4cd: dup
      // 4ce: invokespecial java/lang/StringBuilder.<init> ()V
      // 4d1: astore 19
      // 4d3: aload 9
      // 4d5: lload 1
      // 4d6: lconst_0
      // 4d7: lcmp
      // 4d8: ifle 50f
      // 4db: aload 6
      // 4dd: ifnonnull 50f
      // 4e0: ifnull 508
      // 4e3: goto 4f0
      // 4e6: ldc2_w 7106609914386811573
      // 4e9: lload 1
      // 4ea: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ef: athrow
      // 4f0: aload 19
      // 4f2: aload 9
      // 4f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4fa: pop
      // 4fb: goto 508
      // 4fe: ldc2_w 7106609914386811573
      // 501: lload 1
      // 502: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 507: athrow
      // 508: aload 19
      // 50a: aload 13
      // 50c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50f: pop
      // 510: aload 10
      // 512: aload 6
      // 514: ifnonnull 541
      // 517: ifnull 53c
      // 51a: goto 527
      // 51d: ldc2_w 7106609914386811573
      // 520: lload 1
      // 521: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: athrow
      // 527: aload 19
      // 529: aload 10
      // 52b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 52e: pop
      // 52f: goto 53c
      // 532: ldc2_w 7106609914386811573
      // 535: lload 1
      // 536: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53b: athrow
      // 53c: aload 19
      // 53e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 541: astore 20
      // 543: aload 20
      // 545: areturn
      // 546: aload 3
      // 547: areturn
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/xl.bb J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: aload 1
      // 01a: sipush 9886
      // 01d: ldc2_w 5599626606575470406
      // 020: lload 2
      // 021: lxor
      // 022: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: sipush 22013
      // 02a: ldc2_w 4603695762186679344
      // 02d: lload 2
      // 02e: lxor
      // 02f: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 037: astore 5
      // 039: new java/lang/StringBuilder
      // 03c: dup
      // 03d: invokespecial java/lang/StringBuilder.<init> ()V
      // 040: astore 6
      // 042: ldc2_w -1278854368772584543
      // 045: lload 2
      // 046: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: bipush 0
      // 04c: istore 7
      // 04e: bipush 0
      // 04f: istore 8
      // 051: astore 4
      // 053: iload 8
      // 055: aload 1
      // 056: invokevirtual java/lang/String.length ()I
      // 059: if_icmpge 0ba
      // 05c: aload 1
      // 05d: iload 8
      // 05f: invokevirtual java/lang/String.charAt (I)C
      // 062: sipush 28011
      // 065: ldc2_w 2609904194471529658
      // 068: lload 2
      // 069: lxor
      // 06a: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 4
      // 071: lload 2
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 07c
      // 077: ifnonnull 0e9
      // 07a: aload 4
      // 07c: ifnonnull 0e9
      // 07f: goto 08c
      // 082: ldc2_w -1250708989793597810
      // 085: lload 2
      // 086: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: if_icmpne 0ba
      // 08f: goto 09c
      // 092: ldc2_w -1250708989793597810
      // 095: lload 2
      // 096: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: iinc 7 1
      // 09f: iinc 8 1
      // 0a2: aload 4
      // 0a4: ifnull 053
      // 0a7: lload 2
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: ifle 05c
      // 0ad: goto 0ba
      // 0b0: ldc2_w -1250708989793597810
      // 0b3: lload 2
      // 0b4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 6
      // 0bc: aload 5
      // 0be: bipush 0
      // 0bf: iload 7
      // 0c1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: aload 4
      // 0c9: ifnonnull 1bb
      // 0cc: pop
      // 0cd: aload 5
      // 0cf: iload 7
      // 0d1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0d4: astore 5
      // 0d6: aload 5
      // 0d8: bipush 0
      // 0d9: invokevirtual java/lang/String.charAt (I)C
      // 0dc: sipush 11069
      // 0df: ldc2_w 8421659295394745058
      // 0e2: lload 2
      // 0e3: lxor
      // 0e4: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: lload 2
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 0f8
      // 0ef: if_icmpne 1a3
      // 0f2: aload 5
      // 0f4: invokevirtual java/lang/String.length ()I
      // 0f7: bipush 2
      // 0f8: lload 2
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: ifle 158
      // 0fe: aload 4
      // 100: ifnonnull 158
      // 103: goto 110
      // 106: ldc2_w -1250708989793597810
      // 109: lload 2
      // 10a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: if_icmple 15b
      // 113: goto 120
      // 116: ldc2_w -1250708989793597810
      // 119: lload 2
      // 11a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 5
      // 122: aload 5
      // 124: invokevirtual java/lang/String.length ()I
      // 127: bipush 1
      // 128: isub
      // 129: invokevirtual java/lang/String.charAt (I)C
      // 12c: aload 4
      // 12e: ifnonnull 169
      // 131: goto 13e
      // 134: ldc2_w -1250708989793597810
      // 137: lload 2
      // 138: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: sipush 4286
      // 141: ldc2_w 3246148743749923175
      // 144: lload 2
      // 145: lxor
      // 146: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: goto 158
      // 14e: ldc2_w -1250708989793597810
      // 151: lload 2
      // 152: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: if_icmpeq 167
      // 15b: aconst_null
      // 15c: areturn
      // 15d: ldc2_w -1250708989793597810
      // 160: lload 2
      // 161: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: iload 7
      // 169: ifne 16f
      // 16c: goto 190
      // 16f: aload 5
      // 171: sipush 18794
      // 174: ldc2_w 3818665320483137727
      // 177: lload 2
      // 178: lxor
      // 179: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: sipush 11760
      // 181: ldc2_w 1695694659032042538
      // 184: lload 2
      // 185: lxor
      // 186: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 18e: astore 5
      // 190: aload 6
      // 192: aload 5
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 197: lload 2
      // 198: lconst_0
      // 199: lcmp
      // 19a: iflt 1be
      // 19d: pop
      // 19e: aload 4
      // 1a0: ifnull 1bc
      // 1a3: aload 6
      // 1a5: aload 5
      // 1a7: bipush 0
      // 1a8: invokevirtual java/lang/String.charAt (I)C
      // 1ab: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1ae: goto 1bb
      // 1b1: ldc2_w -1250708989793597810
      // 1b4: lload 2
      // 1b5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: pop
      // 1bc: aload 6
      // 1be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c1: areturn
   }

   public static String m(String param0, boolean param1, long param2, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/xl.bb J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: ldc2_w -7738983298017267336
      // 009: lload 2
      // 00a: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: aload 0
      // 010: ldc ")"
      // 012: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 015: istore 7
      // 017: astore 5
      // 019: iload 7
      // 01b: bipush -1
      // 01c: if_icmple 034
      // 01f: aload 0
      // 020: iload 7
      // 022: bipush 1
      // 023: iadd
      // 024: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 027: lload 2
      // 028: lconst_0
      // 029: lcmp
      // 02a: iflt 035
      // 02d: astore 6
      // 02f: aload 5
      // 031: ifnull 037
      // 034: aload 0
      // 035: astore 6
      // 037: bipush 0
      // 038: istore 8
      // 03a: bipush 0
      // 03b: istore 9
      // 03d: iload 9
      // 03f: aload 6
      // 041: invokevirtual java/lang/String.length ()I
      // 044: if_icmpge 0a6
      // 047: aload 6
      // 049: iload 9
      // 04b: invokevirtual java/lang/String.charAt (I)C
      // 04e: sipush 18414
      // 051: ldc2_w 7934620625571798244
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 5
      // 05d: lload 2
      // 05e: lconst_0
      // 05f: lcmp
      // 060: ifle 068
      // 063: ifnonnull 0da
      // 066: aload 5
      // 068: ifnonnull 0da
      // 06b: goto 078
      // 06e: ldc2_w -7746871099076215721
      // 071: lload 2
      // 072: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: if_icmpne 0a6
      // 07b: goto 088
      // 07e: ldc2_w -7746871099076215721
      // 081: lload 2
      // 082: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: iinc 8 1
      // 08b: iinc 9 1
      // 08e: aload 5
      // 090: ifnull 03d
      // 093: lload 2
      // 094: lconst_0
      // 095: lcmp
      // 096: ifle 047
      // 099: goto 0a6
      // 09c: ldc2_w -7746871099076215721
      // 09f: lload 2
      // 0a0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: aload 6
      // 0a8: iload 8
      // 0aa: lload 2
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: iflt 0bd
      // 0b0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0b3: astore 6
      // 0b5: aload 6
      // 0b7: aload 5
      // 0b9: ifnonnull 1ee
      // 0bc: bipush 0
      // 0bd: invokevirtual java/lang/String.charAt (I)C
      // 0c0: sipush 11069
      // 0c3: ldc2_w 8421658225161252923
      // 0c6: lload 2
      // 0c7: lxor
      // 0c8: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: goto 0da
      // 0d0: ldc2_w -7746871099076215721
      // 0d3: lload 2
      // 0d4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: if_icmpne 1cd
      // 0dd: iload 1
      // 0de: aload 5
      // 0e0: ifnonnull 18c
      // 0e3: goto 0f0
      // 0e6: ldc2_w -7746871099076215721
      // 0e9: lload 2
      // 0ea: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: ifeq 17b
      // 0f3: goto 100
      // 0f6: ldc2_w -7746871099076215721
      // 0f9: lload 2
      // 0fa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 6
      // 102: invokevirtual java/lang/String.length ()I
      // 105: bipush 2
      // 106: lload 2
      // 107: lconst_0
      // 108: lcmp
      // 109: ifle 16c
      // 10c: aload 5
      // 10e: ifnonnull 16c
      // 111: goto 11e
      // 114: ldc2_w -7746871099076215721
      // 117: lload 2
      // 118: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: if_icmple 16f
      // 121: goto 12e
      // 124: ldc2_w -7746871099076215721
      // 127: lload 2
      // 128: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 6
      // 130: aload 6
      // 132: invokevirtual java/lang/String.length ()I
      // 135: bipush 1
      // 136: isub
      // 137: invokevirtual java/lang/String.charAt (I)C
      // 13a: aload 5
      // 13c: lload 2
      // 13d: lconst_0
      // 13e: lcmp
      // 13f: iflt 18e
      // 142: ifnonnull 18c
      // 145: goto 152
      // 148: ldc2_w -7746871099076215721
      // 14b: lload 2
      // 14c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: sipush 4286
      // 155: ldc2_w 3246145483016375230
      // 158: lload 2
      // 159: lxor
      // 15a: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: goto 16c
      // 162: ldc2_w -7746871099076215721
      // 165: lload 2
      // 166: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: if_icmpeq 17b
      // 16f: aconst_null
      // 170: areturn
      // 171: ldc2_w -7746871099076215721
      // 174: lload 2
      // 175: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: aload 6
      // 17d: bipush 1
      // 17e: aload 6
      // 180: invokevirtual java/lang/String.length ()I
      // 183: bipush 1
      // 184: isub
      // 185: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 188: astore 6
      // 18a: iload 4
      // 18c: aload 5
      // 18e: ifnonnull 229
      // 191: ifeq 228
      // 194: goto 1a1
      // 197: ldc2_w -7746871099076215721
      // 19a: lload 2
      // 19b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: aload 6
      // 1a3: sipush 18794
      // 1a6: ldc2_w 3818662067802821222
      // 1a9: lload 2
      // 1aa: lxor
      // 1ab: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: sipush 11760
      // 1b3: ldc2_w 1695695719031420659
      // 1b6: lload 2
      // 1b7: lxor
      // 1b8: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1c0: astore 6
      // 1c2: aload 5
      // 1c4: lload 2
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: iflt 1de
      // 1ca: ifnull 228
      // 1cd: getstatic com/zelix/xl.U Ljava/util/Map;
      // 1d0: aload 6
      // 1d2: bipush 0
      // 1d3: invokevirtual java/lang/String.charAt (I)C
      // 1d6: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 1d9: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1de: checkcast java/lang/String
      // 1e1: goto 1ee
      // 1e4: ldc2_w -7746871099076215721
      // 1e7: lload 2
      // 1e8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: astore 9
      // 1f0: iload 1
      // 1f1: ifeq 224
      // 1f4: aload 9
      // 1f6: aload 5
      // 1f8: ifnonnull 226
      // 1fb: goto 208
      // 1fe: ldc2_w -7746871099076215721
      // 201: lload 2
      // 202: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: athrow
      // 208: ifnonnull 224
      // 20b: goto 218
      // 20e: ldc2_w -7746871099076215721
      // 211: lload 2
      // 212: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aconst_null
      // 219: areturn
      // 21a: ldc2_w -7746871099076215721
      // 21d: lload 2
      // 21e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: aload 9
      // 226: astore 6
      // 228: bipush 0
      // 229: istore 9
      // 22b: iload 9
      // 22d: iload 8
      // 22f: if_icmpge 260
      // 232: new java/lang/StringBuilder
      // 235: dup
      // 236: invokespecial java/lang/StringBuilder.<init> ()V
      // 239: aload 6
      // 23b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23e: sipush 18065
      // 241: ldc2_w 5908807513351294507
      // 244: lload 2
      // 245: lxor
      // 246: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 251: aload 5
      // 253: ifnonnull 268
      // 256: astore 6
      // 258: iinc 9 1
      // 25b: aload 5
      // 25d: ifnull 22b
      // 260: lload 2
      // 261: lconst_0
      // 262: lcmp
      // 263: ifle 25b
      // 266: aload 6
      // 268: areturn
   }

   @Override
   public final int hashCode() {
      return super.hashCode();
   }

   public static String T(long param0, mn param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/xl.bb J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: lload 0
      // 007: dup2
      // 008: ldc2_w 138744397822899
      // 00b: lxor
      // 00c: lstore 3
      // 00d: pop2
      // 00e: ldc2_w -8319903612549731992
      // 011: lload 0
      // 012: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: aload 2
      // 018: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 01b: astore 6
      // 01d: astore 5
      // 01f: aload 6
      // 021: aload 5
      // 023: ifnonnull 05d
      // 026: lload 3
      // 027: dup2_x1
      // 028: pop2
      // 029: invokestatic com/zelix/xl.S (JLjava/lang/String;)Z
      // 02c: ifeq 04e
      // 02f: goto 03c
      // 032: ldc2_w -8327773876854037433
      // 035: lload 0
      // 036: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: athrow
      // 03c: aload 6
      // 03e: invokestatic com/zelix/xl.u (Ljava/lang/String;)Ljava/lang/String;
      // 041: astore 7
      // 043: lload 0
      // 044: lconst_0
      // 045: lcmp
      // 046: ifle 05f
      // 049: aload 5
      // 04b: ifnull 05f
      // 04e: aload 6
      // 050: goto 05d
      // 053: ldc2_w -8327773876854037433
      // 056: lload 0
      // 057: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: astore 7
      // 05f: aload 7
      // 061: ldc "V"
      // 063: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 066: lload 0
      // 067: lconst_0
      // 068: lcmp
      // 069: ifle 0a6
      // 06c: aload 5
      // 06e: ifnonnull 0a6
      // 071: ifeq 08d
      // 074: goto 081
      // 077: ldc2_w -8327773876854037433
      // 07a: lload 0
      // 07b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aconst_null
      // 082: areturn
      // 083: ldc2_w -8327773876854037433
      // 086: lload 0
      // 087: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: aload 7
      // 08f: aload 5
      // 091: ifnonnull 13f
      // 094: ldc "B"
      // 096: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 099: goto 0a6
      // 09c: ldc2_w -8327773876854037433
      // 09f: lload 0
      // 0a0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: ifne 130
      // 0a9: aload 7
      // 0ab: aload 5
      // 0ad: ifnonnull 13f
      // 0b0: goto 0bd
      // 0b3: ldc2_w -8327773876854037433
      // 0b6: lload 0
      // 0b7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: lload 0
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 132
      // 0c3: ldc "C"
      // 0c5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c8: ifne 130
      // 0cb: goto 0d8
      // 0ce: ldc2_w -8327773876854037433
      // 0d1: lload 0
      // 0d2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 7
      // 0da: aload 5
      // 0dc: ifnonnull 13f
      // 0df: goto 0ec
      // 0e2: ldc2_w -8327773876854037433
      // 0e5: lload 0
      // 0e6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: lload 0
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 132
      // 0f2: ldc "S"
      // 0f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f7: ifne 130
      // 0fa: goto 107
      // 0fd: ldc2_w -8327773876854037433
      // 100: lload 0
      // 101: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 7
      // 109: aload 5
      // 10b: ifnonnull 142
      // 10e: goto 11b
      // 111: ldc2_w -8327773876854037433
      // 114: lload 0
      // 115: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: ldc "Z"
      // 11d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 120: ifeq 140
      // 123: goto 130
      // 126: ldc2_w -8327773876854037433
      // 129: lload 0
      // 12a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: ldc "I"
      // 132: goto 13f
      // 135: ldc2_w -8327773876854037433
      // 138: lload 0
      // 139: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: areturn
      // 140: aload 7
      // 142: areturn
   }

   public static boolean s(Object[] param0) {
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
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/xl.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 7281731721259319532
      // 1c: lload 2
      // 1d: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 1
      // 25: ldc "J"
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: aload 4
      // 2c: ifnonnull 68
      // 2f: ifne 67
      // 32: goto 3f
      // 35: ldc2_w 7343653681234349507
      // 38: lload 2
      // 39: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 1
      // 40: ldc "D"
      // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45: aload 4
      // 47: ifnonnull 68
      // 4a: goto 57
      // 4d: ldc2_w 7343653681234349507
      // 50: lload 2
      // 51: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: ifeq 6b
      // 5a: goto 67
      // 5d: ldc2_w 7343653681234349507
      // 60: lload 2
      // 61: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: bipush 1
      // 68: goto 6c
      // 6b: bipush 0
      // 6c: ireturn
   }

   public static String u(String var0) {
      return var0.substring(var0.indexOf(")") + 1);
   }

   public static boolean a(Object[] param0) {
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
      // 013: getstatic com/zelix/xl.bb J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w -3939571929284825934
      // 01c: lload 1
      // 01d: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 4
      // 024: aload 3
      // 025: invokevirtual java/lang/String.length ()I
      // 028: aload 4
      // 02a: ifnonnull 0a2
      // 02d: bipush 2
      // 02e: if_icmplt 0a1
      // 031: goto 03e
      // 034: ldc2_w -3911417760524197475
      // 037: lload 1
      // 038: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: athrow
      // 03e: aload 3
      // 03f: bipush 0
      // 040: invokevirtual java/lang/String.charAt (I)C
      // 043: aload 4
      // 045: ifnonnull 0a2
      // 048: goto 055
      // 04b: ldc2_w -3911417760524197475
      // 04e: lload 1
      // 04f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: athrow
      // 055: sipush 14508
      // 058: ldc2_w 4423142482991185512
      // 05b: lload 1
      // 05c: lxor
      // 05d: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: if_icmpne 0a1
      // 065: goto 072
      // 068: ldc2_w -3911417760524197475
      // 06b: lload 1
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 3
      // 073: ldc ")"
      // 075: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 078: bipush -1
      // 079: lload 1
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: ifle 0bc
      // 07f: aload 4
      // 081: ifnonnull 0bc
      // 084: goto 091
      // 087: ldc2_w -3911417760524197475
      // 08a: lload 1
      // 08b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: if_icmpne 0a3
      // 094: goto 0a1
      // 097: ldc2_w -3911417760524197475
      // 09a: lload 1
      // 09b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: bipush 0
      // 0a2: ireturn
      // 0a3: aload 3
      // 0a4: ldc ","
      // 0a6: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0a9: aload 4
      // 0ab: ifnonnull 12b
      // 0ae: bipush -1
      // 0af: goto 0bc
      // 0b2: ldc2_w -3911417760524197475
      // 0b5: lload 1
      // 0b6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: if_icmpgt 11d
      // 0bf: aload 3
      // 0c0: ldc "]"
      // 0c2: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0c5: aload 4
      // 0c7: ifnonnull 12b
      // 0ca: goto 0d7
      // 0cd: ldc2_w -3911417760524197475
      // 0d0: lload 1
      // 0d1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: lload 1
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: ifle 11e
      // 0dd: bipush -1
      // 0de: if_icmpgt 11d
      // 0e1: goto 0ee
      // 0e4: ldc2_w -3911417760524197475
      // 0e7: lload 1
      // 0e8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 3
      // 0ef: aload 4
      // 0f1: ifnonnull 137
      // 0f4: goto 101
      // 0f7: ldc2_w -3911417760524197475
      // 0fa: lload 1
      // 0fb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: lload 1
      // 102: lconst_0
      // 103: lcmp
      // 104: iflt 12d
      // 107: ldc " "
      // 109: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 10c: bipush -1
      // 10d: if_icmple 12c
      // 110: goto 11d
      // 113: ldc2_w -3911417760524197475
      // 116: lload 1
      // 117: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: bipush 0
      // 11e: goto 12b
      // 121: ldc2_w -3911417760524197475
      // 124: lload 1
      // 125: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: ireturn
      // 12c: aload 3
      // 12d: bipush 1
      // 12e: aload 3
      // 12f: ldc ")"
      // 131: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 134: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 137: astore 5
      // 139: aload 3
      // 13a: ldc ")"
      // 13c: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 13f: lload 1
      // 140: lconst_0
      // 141: lcmp
      // 142: iflt 185
      // 145: aload 4
      // 147: ifnonnull 185
      // 14a: aload 3
      // 14b: invokevirtual java/lang/String.length ()I
      // 14e: bipush 1
      // 14f: isub
      // 150: if_icmpge 180
      // 153: goto 160
      // 156: ldc2_w -3911417760524197475
      // 159: lload 1
      // 15a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: new java/lang/StringBuilder
      // 163: dup
      // 164: invokespecial java/lang/StringBuilder.<init> ()V
      // 167: aload 5
      // 169: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16c: aload 3
      // 16d: aload 3
      // 16e: ldc ")"
      // 170: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 173: bipush 1
      // 174: iadd
      // 175: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 178: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17e: astore 5
      // 180: aload 5
      // 182: invokevirtual java/lang/String.length ()I
      // 185: lload 1
      // 186: lconst_0
      // 187: lcmp
      // 188: iflt 18f
      // 18b: ifeq 2e8
      // 18e: bipush 0
      // 18f: aload 4
      // 191: ifnonnull 2ef
      // 194: goto 1a1
      // 197: ldc2_w -3911417760524197475
      // 19a: lload 1
      // 19b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: istore 6
      // 1a3: aload 5
      // 1a5: iload 6
      // 1a7: invokevirtual java/lang/String.charAt (I)C
      // 1aa: sipush 18414
      // 1ad: ldc2_w 7934534307416015150
      // 1b0: lload 1
      // 1b1: lxor
      // 1b2: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: if_icmpne 1e0
      // 1ba: iinc 6 1
      // 1bd: aload 4
      // 1bf: lload 1
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: ifle 1ca
      // 1c5: ifnonnull 26c
      // 1c8: aload 4
      // 1ca: ifnull 1a3
      // 1cd: lload 1
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: iflt 1bd
      // 1d3: goto 1e0
      // 1d6: ldc2_w -3911417760524197475
      // 1d9: lload 1
      // 1da: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: aload 5
      // 1e2: iload 6
      // 1e4: invokevirtual java/lang/String.charAt (I)C
      // 1e7: aload 4
      // 1e9: ifnonnull 26e
      // 1ec: sipush 11069
      // 1ef: ldc2_w 8421715960341523953
      // 1f2: lload 1
      // 1f3: lxor
      // 1f4: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: if_icmpne 26c
      // 1fc: goto 209
      // 1ff: ldc2_w -3911417760524197475
      // 202: lload 1
      // 203: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: aload 5
      // 20b: sipush 4286
      // 20e: ldc2_w 3246232887698216564
      // 211: lload 1
      // 212: lxor
      // 213: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: invokevirtual java/lang/String.indexOf (I)I
      // 21b: istore 7
      // 21d: iload 7
      // 21f: aload 4
      // 221: ifnonnull 26b
      // 224: bipush -1
      // 225: if_icmpeq 25d
      // 228: goto 235
      // 22b: ldc2_w -3911417760524197475
      // 22e: lload 1
      // 22f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: iload 7
      // 237: aload 4
      // 239: ifnonnull 26b
      // 23c: goto 249
      // 23f: ldc2_w -3911417760524197475
      // 242: lload 1
      // 243: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: iload 6
      // 24b: bipush 1
      // 24c: iadd
      // 24d: if_icmpne 270
      // 250: goto 25d
      // 253: ldc2_w -3911417760524197475
      // 256: lload 1
      // 257: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: athrow
      // 25d: bipush 0
      // 25e: goto 26b
      // 261: ldc2_w -3911417760524197475
      // 264: lload 1
      // 265: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: athrow
      // 26b: ireturn
      // 26c: iload 6
      // 26e: istore 7
      // 270: aload 5
      // 272: bipush 0
      // 273: iload 7
      // 275: bipush 1
      // 276: iadd
      // 277: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 27a: astore 8
      // 27c: aload 8
      // 27e: invokevirtual java/lang/String.length ()I
      // 281: bipush 1
      // 282: aload 4
      // 284: ifnonnull 2c6
      // 287: if_icmpne 2bd
      // 28a: goto 297
      // 28d: ldc2_w -3911417760524197475
      // 290: lload 1
      // 291: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: athrow
      // 297: getstatic com/zelix/xl.U Ljava/util/Map;
      // 29a: aload 8
      // 29c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a1: ifnonnull 2bd
      // 2a4: goto 2b1
      // 2a7: ldc2_w -3911417760524197475
      // 2aa: lload 1
      // 2ab: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: athrow
      // 2b1: bipush 0
      // 2b2: ireturn
      // 2b3: ldc2_w -3911417760524197475
      // 2b6: lload 1
      // 2b7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: athrow
      // 2bd: iload 7
      // 2bf: aload 5
      // 2c1: invokevirtual java/lang/String.length ()I
      // 2c4: bipush 1
      // 2c5: isub
      // 2c6: if_icmpne 2d8
      // 2c9: ldc ""
      // 2cb: astore 5
      // 2cd: aload 4
      // 2cf: lload 1
      // 2d0: lconst_0
      // 2d1: lcmp
      // 2d2: ifle 2e5
      // 2d5: ifnull 2e3
      // 2d8: aload 5
      // 2da: iload 7
      // 2dc: bipush 1
      // 2dd: iadd
      // 2de: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2e1: astore 5
      // 2e3: aload 4
      // 2e5: ifnull 180
      // 2e8: lload 1
      // 2e9: lconst_0
      // 2ea: lcmp
      // 2eb: ifle 18e
      // 2ee: bipush 1
      // 2ef: ireturn
   }

   public static List s(mn param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/xl.bb J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 46170361045637
      // 00b: lxor
      // 00c: lstore 3
      // 00d: pop2
      // 00e: aload 0
      // 00f: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 012: lload 3
      // 013: dup2_x1
      // 014: pop2
      // 015: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 018: astore 6
      // 01a: ldc2_w 4823806316157937424
      // 01d: lload 1
      // 01e: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: aload 6
      // 025: invokeinterface java/util/List.size ()I 1
      // 02a: istore 7
      // 02c: astore 5
      // 02e: bipush 0
      // 02f: istore 8
      // 031: iload 8
      // 033: iload 7
      // 035: if_icmpge 115
      // 038: aload 6
      // 03a: lload 1
      // 03b: lconst_0
      // 03c: lcmp
      // 03d: ifle 04c
      // 040: aload 5
      // 042: ifnonnull 117
      // 045: iload 8
      // 047: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 04c: checkcast java/lang/String
      // 04f: astore 9
      // 051: aload 9
      // 053: aload 5
      // 055: ifnonnull 10c
      // 058: ldc "B"
      // 05a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05d: ifne 0f4
      // 060: goto 06d
      // 063: ldc2_w 4761875182535879231
      // 066: lload 1
      // 067: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: aload 9
      // 06f: aload 5
      // 071: ifnonnull 10c
      // 074: goto 081
      // 077: ldc2_w 4761875182535879231
      // 07a: lload 1
      // 07b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: lload 1
      // 082: lconst_0
      // 083: lcmp
      // 084: ifle 0ff
      // 087: ldc "C"
      // 089: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08c: ifne 0f4
      // 08f: goto 09c
      // 092: ldc2_w 4761875182535879231
      // 095: lload 1
      // 096: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 9
      // 09e: aload 5
      // 0a0: ifnonnull 10c
      // 0a3: goto 0b0
      // 0a6: ldc2_w 4761875182535879231
      // 0a9: lload 1
      // 0aa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: lload 1
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: iflt 0ff
      // 0b6: ldc "S"
      // 0b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bb: ifne 0f4
      // 0be: goto 0cb
      // 0c1: ldc2_w 4761875182535879231
      // 0c4: lload 1
      // 0c5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 9
      // 0cd: aload 5
      // 0cf: ifnonnull 10c
      // 0d2: goto 0df
      // 0d5: ldc2_w 4761875182535879231
      // 0d8: lload 1
      // 0d9: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: ldc "Z"
      // 0e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e4: ifeq 10d
      // 0e7: goto 0f4
      // 0ea: ldc2_w 4761875182535879231
      // 0ed: lload 1
      // 0ee: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: aload 6
      // 0f6: iload 8
      // 0f8: ldc "I"
      // 0fa: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 0ff: goto 10c
      // 102: ldc2_w 4761875182535879231
      // 105: lload 1
      // 106: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: pop
      // 10d: iinc 8 1
      // 110: aload 5
      // 112: ifnull 031
      // 115: aload 6
      // 117: areturn
   }

   public static String P() {
      return B;
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = bb ^ 131337387000341L;
      long var4 = var2 ^ 42614190692721L;
      return this.e(var4, (xl)var1);
   }

   public final String f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      long var4 = var2 ^ 71117113813925L;
      return x44.a<"i">(this.j, new Object[]{var4}, 7242668259656141305L, var2);
   }

   public final int B() {
      return this.i;
   }

   public int e(long param1, xl param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/xl.bb J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -7628648585294253120
      // 09: lload 1
      // 0a: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 4
      // 11: aload 0
      // 12: getfield com/zelix/xl.i I
      // 15: aload 3
      // 16: getfield com/zelix/xl.i I
      // 19: aload 4
      // 1b: ifnonnull 54
      // 1e: if_icmpge 3a
      // 21: goto 2e
      // 24: ldc2_w -7582488434148475153
      // 27: lload 1
      // 28: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: athrow
      // 2e: bipush -1
      // 2f: ireturn
      // 30: ldc2_w -7582488434148475153
      // 33: lload 1
      // 34: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/zelix/xl.i I
      // 3e: aload 4
      // 40: ifnonnull 64
      // 43: aload 3
      // 44: getfield com/zelix/xl.i I
      // 47: goto 54
      // 4a: ldc2_w -7582488434148475153
      // 4d: lload 1
      // 4e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: if_icmpne 63
      // 57: bipush 0
      // 58: ireturn
      // 59: ldc2_w -7582488434148475153
      // 5c: lload 1
      // 5d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: bipush 1
      // 64: ireturn
   }

   public static boolean m(Object[] param0) {
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
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 1
      // 12: pop
      // 13: getstatic com/zelix/xl.bb J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w -7002910776426628303
      // 1c: lload 1
      // 1d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 3
      // 25: invokevirtual java/lang/String.length ()I
      // 28: aload 4
      // 2a: ifnonnull 54
      // 2d: bipush 1
      // 2e: if_icmpne 6d
      // 31: goto 3e
      // 34: ldc2_w -7046823113757526498
      // 37: lload 1
      // 38: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: getstatic com/zelix/xl.U Ljava/util/Map;
      // 41: aload 3
      // 42: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 47: goto 54
      // 4a: ldc2_w -7046823113757526498
      // 4d: lload 1
      // 4e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 4
      // 56: ifnonnull 6a
      // 59: ifeq 6d
      // 5c: goto 69
      // 5f: ldc2_w -7046823113757526498
      // 62: lload 1
      // 63: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: bipush 1
      // 6a: goto 6e
      // 6d: bipush 0
      // 6e: ireturn
   }

   final hy J(Object[] var1) {
      hy var4 = (hy)var1[0];
      long var2 = (Long)var1[1];
      var2 = bb ^ var2;
      long var5 = var2 ^ 83985535966988L;
      return (hy)x44.a<"m">(this, new Object[]{var5, var4}, 5813981096414769596L, var2);
   }

   public final void s(int var1) {
      this.i = var1;
   }

   final hz f(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/hz
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/xl.bb J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 21294778894111
      // 01f: lxor
      // 020: dup2
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 5
      // 027: dup2
      // 028: bipush 16
      // 02a: lshl
      // 02b: bipush 48
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 6
      // 031: dup2
      // 032: bipush 32
      // 034: lshl
      // 035: bipush 32
      // 037: lushr
      // 038: l2i
      // 039: istore 7
      // 03b: pop2
      // 03c: dup2
      // 03d: ldc2_w 26378048754638
      // 040: lxor
      // 041: lstore 8
      // 043: dup2
      // 044: ldc2_w 100096649161232
      // 047: lxor
      // 048: lstore 10
      // 04a: dup2
      // 04b: ldc2_w 9868887018446
      // 04e: lxor
      // 04f: lstore 12
      // 051: pop2
      // 052: ldc2_w 9107013154679233411
      // 055: lload 2
      // 056: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 0
      // 05c: lload 8
      // 05e: bipush 1
      // 05f: anewarray 269
      // 062: dup_x2
      // 063: dup_x2
      // 064: pop
      // 065: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068: bipush 0
      // 069: swap
      // 06a: aastore
      // 06b: ldc2_w 7493280584670620486
      // 06e: lload 2
      // 06f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: astore 16
      // 076: astore 14
      // 078: aload 16
      // 07a: aload 14
      // 07c: ifnonnull 10d
      // 07f: iload 5
      // 081: i2s
      // 082: iload 6
      // 084: i2c
      // 085: iload 7
      // 087: invokevirtual com/zelix/hz.U (SCI)Z
      // 08a: ifeq 0fe
      // 08d: goto 09a
      // 090: ldc2_w 9117135300799927980
      // 093: lload 2
      // 094: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 4
      // 09c: aload 14
      // 09e: ifnonnull 10d
      // 0a1: goto 0ae
      // 0a4: ldc2_w 9117135300799927980
      // 0a7: lload 2
      // 0a8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: lload 12
      // 0b0: invokevirtual com/zelix/hz.B (J)Z
      // 0b3: ifeq 0fe
      // 0b6: goto 0c3
      // 0b9: ldc2_w 9117135300799927980
      // 0bc: lload 2
      // 0bd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: aload 4
      // 0c5: aload 16
      // 0c7: bipush 0
      // 0c8: anewarray 269
      // 0cb: ldc2_w 8770581102078903964
      // 0ce: lload 2
      // 0cf: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: lload 10
      // 0d6: bipush 2
      // 0d7: anewarray 269
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 1
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w 7086962898565113673
      // 0eb: lload 2
      // 0ec: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: lload 2
      // 0f2: lconst_0
      // 0f3: lcmp
      // 0f4: iflt 100
      // 0f7: astore 15
      // 0f9: aload 14
      // 0fb: ifnull 10f
      // 0fe: aload 4
      // 100: goto 10d
      // 103: ldc2_w 9117135300799927980
      // 106: lload 2
      // 107: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: astore 15
      // 10f: aload 15
      // 111: areturn
   }

   public static List m(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      var1 = bb ^ var1;
      long var4 = var1 ^ 55260658375647L;
      List var6 = X(var4, var3);
      String var7 = u(var3);
      var6.add(var7);
      return var6;
   }

   public static String Y(Object[] param0) {
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
      // 13: getstatic com/zelix/xl.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -4296245021847084671
      // 1c: lload 2
      // 1d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 1
      // 23: invokevirtual java/lang/String.length ()I
      // 26: istore 5
      // 28: astore 4
      // 2a: iload 5
      // 2c: bipush 2
      // 2d: aload 4
      // 2f: ifnonnull 73
      // 32: if_icmple c1
      // 35: goto 42
      // 38: ldc2_w -4286118853619077970
      // 3b: lload 2
      // 3c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 1
      // 43: aload 4
      // 45: ifnonnull c2
      // 48: goto 55
      // 4b: ldc2_w -4286118853619077970
      // 4e: lload 2
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: bipush 0
      // 56: invokevirtual java/lang/String.charAt (I)C
      // 59: sipush 2789
      // 5c: ldc2_w 7159906525936140553
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: goto 73
      // 69: ldc2_w -4286118853619077970
      // 6c: lload 2
      // 6d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: if_icmpne c1
      // 76: aload 1
      // 77: aload 4
      // 79: ifnonnull c2
      // 7c: goto 89
      // 7f: ldc2_w -4286118853619077970
      // 82: lload 2
      // 83: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: iload 5
      // 8b: bipush 1
      // 8c: isub
      // 8d: invokevirtual java/lang/String.charAt (I)C
      // 90: sipush 23421
      // 93: ldc2_w 7505603217774022803
      // 96: lload 2
      // 97: lxor
      // 98: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: if_icmpne c1
      // a0: goto ad
      // a3: ldc2_w -4286118853619077970
      // a6: lload 2
      // a7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: aload 1
      // ae: bipush 1
      // af: iload 5
      // b1: bipush 1
      // b2: isub
      // b3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // b6: areturn
      // b7: ldc2_w -4286118853619077970
      // ba: lload 2
      // bb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: athrow
      // c1: aload 1
      // c2: areturn
   }

   public static void S(String var0) {
      B = var0;
   }

   public static List X(long var0, String var2) {
      var0 = bb ^ var0;
      long var3 = var0 ^ 82029202162306L;
      return L(var2, var3, false);
   }

   public static hy C(char var0, long var1, String var3) {
      long var4 = ((long)var0 << 48 | var1 << 16 >>> 16) ^ bb;
      long var6 = var4 ^ 82667176563585L;
      long var8 = var4 ^ 2017980417838L;
      String[] var10000 = x44.a<"v">(-3654443107496384343L, var4);
      String var11 = hz.P(var3, var8);
      String[] var10 = var10000;

      label35: {
         try {
            var10000 = var11;
            if (var10 != null) {
               break label35;
            }

            if (var11 == null) {
               return null;
            }
         } catch (gj var14) {
            throw x44.a<"v">(var14, -3626311197267057274L, var4);
         }

         var10000 = var11;
      }

      hy var12 = yn.Z(var6, var10000);

      try {
         if (var10 != null) {
            return var12;
         }

         if (var12 == null) {
            return null;
         }
      } catch (gj var13) {
         throw x44.a<"v">(var13, -3626311197267057274L, var4);
      }

      return var12;
   }

   public String g(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 88469187170830L;
      return x44.a<"k">(this, var4, 5807680118126218574L, var2);
   }

   public static String K(String var0, long var1, boolean var3) {
      var1 = bb ^ var1;
      long var4 = var1 ^ 9274101203398L;
      return m(var0, var3, var4, true);
   }

   public static String v(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      var1 = bb ^ var1;
      return (String)x44.a<"o">(-4995828463540756066L, var1).get(var3);
   }

   static {
      long var20 = bb ^ 81191770118812L;
      long var22 = var20 ^ 37057303250119L;
      x44.a<"r">(null, 8767110317599381619L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[55];
      int var16 = 0;
      String var15 = "\u008dÏ#£\u009f\u0090\u0089¼æ\u0019òÅÁÛ©Ò\u0010U\u001ca\u009c¨lfB©\r/\nßû\u0002 \u0018R\u0000\u0088Ô\u001d\bpj)^±-¤ãâ\u001ejB\u00ad=Öý:}(\u001btCQæý\u0086=\u000f ô.\u0006UCJ±¥××È¨\u0013Ñû¡Þ\u009ew±p\u00055Md\u00154mFG \u0006úmd\u0085\"\u009d@\u009c«\u0092JCÀ¡¤@MY\u0093Û}ÛÓ_\t#\u008c\u001cÍt2 ý\u0081]ºam8\\`L\u0004\u0017rEC\u0091YyÑ\bV¢i\f\u009e\u001b_Jßzá$8Yò=\\ý%TU\u0094²\u008eÄR{+õ\r'\u0000¦Òñz\u008a|\u0095µw{Ú½\u0019\u0000æºM\u0007¢ú4hÇ6\u008aÇ5Ô´»ótño|ÏÅ\u0010\n\u0000\u0080\u0094$Yç\u001cW\u0080E?ü\u0011þß \\\u0005\u000e\u001cO´¯\u001dñEÔ\u0091\u0019wµº\u001b\u0007ÇÓç(%Õ6ÚQ\f\u0019\fM]\u0018T\u0091a\u009bë\b\u000eç\u0011@\u009eoÂ\u0010\u009bSº\u0016kË\u001fõ\u000e=\u0010\u0004Àº\u0094Î±m¾ÃØYÇ>nKß \u000eì\u000e\u0016í0ÞJ\u0000\u0084\u009b\u008fÈ\u008aþÒ@×\u0081\u0014öq4\u0080\u0014*\u009b\u009cd\u0003í'\u0018d±¡äs\u009d\u009dh÷©!}\u001emÆa³[\u0097²{\u0003Û0(ßU^'\u00133·\u0096\"ïR@; \u0099½¿\t%¥°8Ånó*é\u009dJ<ÏWY\u0094QuÓq\u001f\u000f\u0010\rOdì©/ïÀòLúØ«´ß\u0086\u0010G\u009e&\\&\u0012Ø$\u008b'y°Mïûv\u0010¾VÚ]¯þ¢\u0007LzÓ¾·Éd2(ä\u008b¹\rÚ;QNo\u0086\u001cVí\u0010Þð§\u001dý\u0086v\u0097eh\u0099&Y\u0017³Åh¹umâný\nÀê\u0010\nNtÖ\u009d¾ììÅ\u0092\u009bþÏÖý2 ÔY\u00800½Y,gvZfz»\u00901\"ó)7Í<«_o}c¢çïå\u00939\u0018¥AÁ3\u001aÝ2î\u0084-:¥\u001fç·ôiv\u001bÏÊAÎ 0\u0082¡\u001aöÎ\u0016Yû \u0084Q]\u0096\u008c\u009dI0óHD9\u0003×¥thEÁ* \\îÆ\u0082ÒIó\u008ar\u001eR¡\u0016U§z+×\u0018;AÐ\f JUe\u00134PR\u0011À%\u0004A»¯r^Û\u0093v(2\u0091~\u009a\u0085-Z|HQ\u0002\u000e\u009aáH~\u0013Ü¡ù\u008eyR(}y\u00911]òþi\u008f\u0095Ûî89\u00808\u0018¤\u0015M¸\u009b\u0080rþ§\u009a1SÇ\u00ad¥ÒOü!rÑ¼\u0099È(V½¿\u008d\tb·+\u0082RoV'û \u000bj^öåÿ_U\u008d^6Ü¦K\u008foûí\u0012&H$<\u001e+(`çiDkA#Ã\u00157\u0099¾\u0003²\u0087ÂÂ\u007fÀª\u001cO×Ç:\u008b\u0003çL\u0096åã\u007fd\u0015siï/Æ(>óCmém¥[¥\u00adyÌÝüÞº`\u0007'Ô\u0003¬ÓÙJ´\u0016:\u0090\u0004Q¹+î\u0000\u0017øï\u0098\f0\u0010=|V\u0096p\u0090ñ Añõ\u001bº\u0017Dú©¯\u009cíy8,Ü±!Ã³\rê²b\n\u0007dF_k<BR\u0014Ä\u0006ì·N\u0010}¯\u0004\u0003\u009cÖªQ$\u0090¡ÀãO:t ïàñjÞ$\u0004=\u0019¶ei×LáÉ+\u0087)É^2ó¹\u0096«\u009d\u0000ØÒX< Pü\\Ï{ÎÆð÷cI;\u0096\u0012b^x\u0018¼¢(\u008d?ßR\u0090^9Y\u001c\u0004\u0002 ª}¹Ë¸\u009b\u0002\u008fÌÜ$\u0088è\u0005[çªÕ¤?Á¿\u008ffëÕ\u0085\u000f§\u0000\rx\u0010kÌu\u0017ôz\u0000\b\u0083\u0007_Yù\u009d\u0083Q\u00186Ý#\u001aº\t\u008b FKWw88\u009cT \u0094ê£f\u000e'è\u0010\u008cJ\u008b»ZZ8Å¶\u008a\u0015áü*Ç\u0011 0\u0003):\u009b\u0014®7xí0Æ´â\u009f\"Å;\u00029êZäôÎ(ÂG+äûÅ\u0018dãôX\u0082uz\u0081µ¼\u00864ä\u0091xa|õÙTxÒ\u001b®(û\u0019KÂO×\u008bV\u001c\u0088a¨t?k¶¯\nj±\u008bC'`Q3%i\u0094~\rbÎ4\nÕè\u0087\u0099\u00860têÀ:\\\u007f)ÛågÜqfe XN¢aö½©ª]¶¢Ú¥ºü\nvåo\u0000Iïr{ÙA)u]\tä/q ªk&ß#\u0001¯\u0081V@\u0099Í\u0002çÛêÅPÿ|É;ç\rßCKÂCL\u007f\u0019 ×\u001dæ\u008a¦a/°s?\u007fÄ^ßõµ ¡¸÷Eî<¸H2 ö\u008bÜÛR0]¿ät¦¡\u0080ÛR\u0014^\u0094k\u001d~w§j^}bãÚ\u0012«Ïªë\u008déð&¿\u0095\u008b\u0000N®\u0094S[\u0081?w2Ht¢(+\u0015¬bÝ;xêl\u0098\u0004¤{»«¸âÖ\u001e\u0093\u009bc¡DKÏ¿VØÓÌ^¬\u0090¡$\u001fßy\u009e s!M\u008fÀ½æT\u000f\u0006õ\u0087\u00022a\u001fª[¥ò?|ÕÏH\u009aÆD\"k°á(d\u009bíá\u0093y\u000eþ«)V+\u001cOÉ\u0088\u001aaÝðëñ\u00ad\u0081©\f\u007f6ð\u009fJ38h\u0017\u009d\u00132²&\u0010¨Hò¸\u008e~\u008cU@8§)Ô\u0093Çn(\u008cDÿ°\u0094ÐUùdb³¾î\u008a»\u008cÆ\u0085\u009d,Ì\u0016Ì§{ûÕcÒ\u0090xÓRV|8\nÈ\u0011£(Éö\u0011\tÆí(~Ê²/>»\u008c»2í&ÕBX÷~Ýæ6*\\h\u008eÖGâ\u008eõú&\u009a\u0013\u001b\u0010õcÞ#\u008f\u0097\u0000\u001f×\u009bkâÄ\u009aÃ)(F\"óæÌöýà\u0005\u0000Y\u0019åM¡W\u0015,VFµÏØ9êh\u009e?\u0097=\u0017\bòiì\u0003Xq¿Ò\u0010QEwò\u0016¬\u0002ÔDwx\u009b{±<0 ,õør¯ß\u00809@iï¤§'\u008b\u0080ôÍ_õÒ\u001f\u009bM%¦§C]\u0098Ô ";
      int var17 = "\u008dÏ#£\u009f\u0090\u0089¼æ\u0019òÅÁÛ©Ò\u0010U\u001ca\u009c¨lfB©\r/\nßû\u0002 \u0018R\u0000\u0088Ô\u001d\bpj)^±-¤ãâ\u001ejB\u00ad=Öý:}(\u001btCQæý\u0086=\u000f ô.\u0006UCJ±¥××È¨\u0013Ñû¡Þ\u009ew±p\u00055Md\u00154mFG \u0006úmd\u0085\"\u009d@\u009c«\u0092JCÀ¡¤@MY\u0093Û}ÛÓ_\t#\u008c\u001cÍt2 ý\u0081]ºam8\\`L\u0004\u0017rEC\u0091YyÑ\bV¢i\f\u009e\u001b_Jßzá$8Yò=\\ý%TU\u0094²\u008eÄR{+õ\r'\u0000¦Òñz\u008a|\u0095µw{Ú½\u0019\u0000æºM\u0007¢ú4hÇ6\u008aÇ5Ô´»ótño|ÏÅ\u0010\n\u0000\u0080\u0094$Yç\u001cW\u0080E?ü\u0011þß \\\u0005\u000e\u001cO´¯\u001dñEÔ\u0091\u0019wµº\u001b\u0007ÇÓç(%Õ6ÚQ\f\u0019\fM]\u0018T\u0091a\u009bë\b\u000eç\u0011@\u009eoÂ\u0010\u009bSº\u0016kË\u001fõ\u000e=\u0010\u0004Àº\u0094Î±m¾ÃØYÇ>nKß \u000eì\u000e\u0016í0ÞJ\u0000\u0084\u009b\u008fÈ\u008aþÒ@×\u0081\u0014öq4\u0080\u0014*\u009b\u009cd\u0003í'\u0018d±¡äs\u009d\u009dh÷©!}\u001emÆa³[\u0097²{\u0003Û0(ßU^'\u00133·\u0096\"ïR@; \u0099½¿\t%¥°8Ånó*é\u009dJ<ÏWY\u0094QuÓq\u001f\u000f\u0010\rOdì©/ïÀòLúØ«´ß\u0086\u0010G\u009e&\\&\u0012Ø$\u008b'y°Mïûv\u0010¾VÚ]¯þ¢\u0007LzÓ¾·Éd2(ä\u008b¹\rÚ;QNo\u0086\u001cVí\u0010Þð§\u001dý\u0086v\u0097eh\u0099&Y\u0017³Åh¹umâný\nÀê\u0010\nNtÖ\u009d¾ììÅ\u0092\u009bþÏÖý2 ÔY\u00800½Y,gvZfz»\u00901\"ó)7Í<«_o}c¢çïå\u00939\u0018¥AÁ3\u001aÝ2î\u0084-:¥\u001fç·ôiv\u001bÏÊAÎ 0\u0082¡\u001aöÎ\u0016Yû \u0084Q]\u0096\u008c\u009dI0óHD9\u0003×¥thEÁ* \\îÆ\u0082ÒIó\u008ar\u001eR¡\u0016U§z+×\u0018;AÐ\f JUe\u00134PR\u0011À%\u0004A»¯r^Û\u0093v(2\u0091~\u009a\u0085-Z|HQ\u0002\u000e\u009aáH~\u0013Ü¡ù\u008eyR(}y\u00911]òþi\u008f\u0095Ûî89\u00808\u0018¤\u0015M¸\u009b\u0080rþ§\u009a1SÇ\u00ad¥ÒOü!rÑ¼\u0099È(V½¿\u008d\tb·+\u0082RoV'û \u000bj^öåÿ_U\u008d^6Ü¦K\u008foûí\u0012&H$<\u001e+(`çiDkA#Ã\u00157\u0099¾\u0003²\u0087ÂÂ\u007fÀª\u001cO×Ç:\u008b\u0003çL\u0096åã\u007fd\u0015siï/Æ(>óCmém¥[¥\u00adyÌÝüÞº`\u0007'Ô\u0003¬ÓÙJ´\u0016:\u0090\u0004Q¹+î\u0000\u0017øï\u0098\f0\u0010=|V\u0096p\u0090ñ Añõ\u001bº\u0017Dú©¯\u009cíy8,Ü±!Ã³\rê²b\n\u0007dF_k<BR\u0014Ä\u0006ì·N\u0010}¯\u0004\u0003\u009cÖªQ$\u0090¡ÀãO:t ïàñjÞ$\u0004=\u0019¶ei×LáÉ+\u0087)É^2ó¹\u0096«\u009d\u0000ØÒX< Pü\\Ï{ÎÆð÷cI;\u0096\u0012b^x\u0018¼¢(\u008d?ßR\u0090^9Y\u001c\u0004\u0002 ª}¹Ë¸\u009b\u0002\u008fÌÜ$\u0088è\u0005[çªÕ¤?Á¿\u008ffëÕ\u0085\u000f§\u0000\rx\u0010kÌu\u0017ôz\u0000\b\u0083\u0007_Yù\u009d\u0083Q\u00186Ý#\u001aº\t\u008b FKWw88\u009cT \u0094ê£f\u000e'è\u0010\u008cJ\u008b»ZZ8Å¶\u008a\u0015áü*Ç\u0011 0\u0003):\u009b\u0014®7xí0Æ´â\u009f\"Å;\u00029êZäôÎ(ÂG+äûÅ\u0018dãôX\u0082uz\u0081µ¼\u00864ä\u0091xa|õÙTxÒ\u001b®(û\u0019KÂO×\u008bV\u001c\u0088a¨t?k¶¯\nj±\u008bC'`Q3%i\u0094~\rbÎ4\nÕè\u0087\u0099\u00860têÀ:\\\u007f)ÛågÜqfe XN¢aö½©ª]¶¢Ú¥ºü\nvåo\u0000Iïr{ÙA)u]\tä/q ªk&ß#\u0001¯\u0081V@\u0099Í\u0002çÛêÅPÿ|É;ç\rßCKÂCL\u007f\u0019 ×\u001dæ\u008a¦a/°s?\u007fÄ^ßõµ ¡¸÷Eî<¸H2 ö\u008bÜÛR0]¿ät¦¡\u0080ÛR\u0014^\u0094k\u001d~w§j^}bãÚ\u0012«Ïªë\u008déð&¿\u0095\u008b\u0000N®\u0094S[\u0081?w2Ht¢(+\u0015¬bÝ;xêl\u0098\u0004¤{»«¸âÖ\u001e\u0093\u009bc¡DKÏ¿VØÓÌ^¬\u0090¡$\u001fßy\u009e s!M\u008fÀ½æT\u000f\u0006õ\u0087\u00022a\u001fª[¥ò?|ÕÏH\u009aÆD\"k°á(d\u009bíá\u0093y\u000eþ«)V+\u001cOÉ\u0088\u001aaÝðëñ\u00ad\u0081©\f\u007f6ð\u009fJ38h\u0017\u009d\u00132²&\u0010¨Hò¸\u008e~\u008cU@8§)Ô\u0093Çn(\u008cDÿ°\u0094ÐUùdb³¾î\u008a»\u008cÆ\u0085\u009d,Ì\u0016Ì§{ûÕcÒ\u0090xÓRV|8\nÈ\u0011£(Éö\u0011\tÆí(~Ê²/>»\u008c»2í&ÕBX÷~Ýæ6*\\h\u008eÖGâ\u008eõú&\u009a\u0013\u001b\u0010õcÞ#\u008f\u0097\u0000\u001f×\u009bkâÄ\u009aÃ)(F\"óæÌöýà\u0005\u0000Y\u0019åM¡W\u0015,VFµÏØ9êh\u009e?\u0097=\u0017\bòiì\u0003Xq¿Ò\u0010QEwò\u0016¬\u0002ÔDwx\u009b{±<0 ,õør¯ß\u00809@iï¤§'\u008b\u0080ôÍ_õÒ\u001f\u009bM%¦§C]\u0098Ô "
         .length();
      char var14 = 16;
      int var26 = -1;

      label54:
      while (true) {
         String var27 = var15.substring(++var26, var26 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var41 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var41;
                  if ((var26 += var14) >= var17) {
                     eb = var18;
                     fb = new String[55];
                     pb = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[19];
                     int var3 = 0;
                     String var4 = "\u00965#Ûm\u000fH_Øò\u0011;¼Â\u008f»Å;\u0012ëªá?\u008bµ9ßQSÒt:WàÒ¹jßæ<\u007fCL3è°9k3\u009eu\bÊÅýð´Ú#\u000e\nÂ3öÖ²b\u0001]\u0090\u0094´^C9HÕ\u0099Z(\u0082¬\u0010!\u001açÂn¦ÄÎ=_÷£1¦\t×\u009a·\u009cø\u0094=ò(*\u008e<\u001fR»\u0019ÍÕ³ó\u009e`ñró¡È\u001fûq\u0097FKõèËû¶";
                     int var5 = "\u00965#Ûm\u000fH_Øò\u0011;¼Â\u008f»Å;\u0012ëªá?\u008bµ9ßQSÒt:WàÒ¹jßæ<\u007fCL3è°9k3\u009eu\bÊÅýð´Ú#\u000e\nÂ3öÖ²b\u0001]\u0090\u0094´^C9HÕ\u0099Z(\u0082¬\u0010!\u001açÂn¦ÄÎ=_÷£1¦\t×\u009a·\u009cø\u0094=ò(*\u008e<\u001fR»\u0019ÍÕ³ó\u009e`ñró¡È\u001fûq\u0097FKõèËû¶"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var30 = var6;
                        var10001 = var3++;
                        long var45 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var48 = -1;

                        while (true) {
                           long var8 = var45;
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
                           long var53 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var48) {
                              case 0:
                                 var30[var10001] = var53;
                                 if (var2 >= var5) {
                                    nb = var6;
                                    ob = new Integer[19];
                                    int var31 = d<"x">(646, 888715642974008377L ^ var20);
                                    Object[] var50 = new Object[]{null, var22};
                                    var50[0] = var31;
                                    U = x44.a<"r">(var50, 8846397408826785143L, var20);
                                    int var32 = d<"x">(30184, 7900405358561362782L ^ var20);
                                    Object[] var51 = new Object[]{null, var22};
                                    var51[0] = var32;
                                    V = x44.a<"r">(var51, 8846397408826785143L, var20);
                                    int var33 = d<"x">(30184, 7900405358561362782L ^ var20);
                                    Object[] var52 = new Object[]{null, var22};
                                    var52[0] = var33;
                                    D = x44.a<"r">(var52, 8846397408826785143L, var20);
                                    U.put("B", a<"f">(8414, 8506405564086552003L ^ var20));
                                    U.put("C", a<"f">(11177, 1176851138766966416L ^ var20));
                                    U.put("D", a<"f">(16160, 2632088248776759819L ^ var20));
                                    U.put("F", a<"f">(4280, 982910508436043184L ^ var20));
                                    U.put("I", a<"f">(19971, 1130331659370785545L ^ var20));
                                    U.put("J", a<"f">(10733, 2279482374711151812L ^ var20));
                                    U.put("S", a<"f">(14419, 6921278332889308519L ^ var20));
                                    U.put("Z", a<"f">(31049, 6206177244162088025L ^ var20));
                                    U.put("V", a<"f">(18452, 5153116111299276032L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("B", a<"f">(6283, 4725186673176624573L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("C", a<"f">(25078, 82129808741680379L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("D", a<"f">(10841, 6273608441260085074L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("F", a<"f">(32002, 6112432727548418109L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("I", a<"f">(32232, 4000281416345344216L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("J", a<"f">(19697, 7750662882353441251L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("S", a<"f">(30557, 7165750398105244263L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("Z", a<"f">(30317, 6378714224212857698L ^ var20));
                                    x44.a<"k">(9068384492839877381L, var20).put("V", a<"f">(20233, 8178536736308587031L ^ var20));
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(28770, 8013807064910255456L ^ var20), "B");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(30374, 5277608715295282057L ^ var20), "C");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(15161, 2346204749372202510L ^ var20), "D");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(18172, 2281488840083727298L ^ var20), "F");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(2799, 2906412165646561254L ^ var20), "I");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(13315, 3191610976493244679L ^ var20), "J");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(15884, 200073445843278594L ^ var20), "S");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(12701, 4156440461893244072L ^ var20), "Z");
                                    x44.a<"k">(8766084968665244306L, var20).put(a<"f">(26295, 8169021225314567099L ^ var20), "V");
                                    return;
                                 }
                                 break;
                              default:
                                 var30[var10001] = var53;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u00132[Ê|\u0006wêÓG %ü·!r";
                                 var5 = "\u00132[Ê|\u0006wêÓG %ü·!r".length();
                                 var2 = 0;
                           }

                           byte var39 = var2;
                           var2 += 8;
                           var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                           var30 = var6;
                           var10001 = var3++;
                           var45 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var48 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var26);
                  break;
               default:
                  var18[var16++] = var41;
                  if ((var26 += var14) < var17) {
                     var14 = var15.charAt(var26);
                     continue label54;
                  }

                  var15 = "h!:·F\u0088Ä\u0080\u0015Ë\u0007ÇÕÄÏíü0cÓÇ,¹¦\u000ecØ,uqù3¸Jn¦\u0090\u0001âï ÙÇífnYGñ³Q`\u0007ÎÇÆL_âµì\bZ\u0007\u0005ï@HÃ|,8\t";
                  var17 = "h!:·F\u0088Ä\u0080\u0015Ë\u0007ÇÕÄÏíü0cÓÇ,¹¦\u000ecØ,uqù3¸Jn¦\u0090\u0001âï ÙÇífnYGñ³Q`\u0007ÎÇÆL_âµì\bZ\u0007\u0005ï@HÃ|,8\t"
                     .length();
                  var14 = '(';
                  var26 = -1;
            }

            var27 = var15.substring(++var26, var26 + var14);
            var10001 = 0;
         }
      }
   }

   public static String x(Object[] param0) {
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
      // 00c: checkcast java/util/Map
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Boolean
      // 017: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01a: istore 1
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Long
      // 021: invokevirtual java/lang/Long.longValue ()J
      // 024: lstore 2
      // 025: pop
      // 026: getstatic com/zelix/xl.bb J
      // 029: lload 2
      // 02a: lxor
      // 02b: lstore 2
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 3368327857572
      // 031: lxor
      // 032: lstore 6
      // 034: dup2
      // 035: ldc2_w 118842820711733
      // 038: lxor
      // 039: lstore 8
      // 03b: pop2
      // 03c: ldc2_w 2313433216129582587
      // 03f: lload 2
      // 040: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: astore 10
      // 047: aload 5
      // 049: aload 10
      // 04b: ifnonnull 087
      // 04e: ifnull 085
      // 051: goto 05e
      // 054: ldc2_w 2377611663870511316
      // 057: lload 2
      // 058: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 5
      // 060: invokevirtual java/lang/String.length ()I
      // 063: aload 10
      // 065: ifnonnull 089
      // 068: goto 075
      // 06b: ldc2_w 2377611663870511316
      // 06e: lload 2
      // 06f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: ifne 088
      // 078: goto 085
      // 07b: ldc2_w 2377611663870511316
      // 07e: lload 2
      // 07f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: aload 5
      // 087: areturn
      // 088: bipush 0
      // 089: istore 11
      // 08b: aload 5
      // 08d: ldc "."
      // 08f: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 092: aload 10
      // 094: ifnonnull 0dd
      // 097: bipush -1
      // 098: if_icmple 0db
      // 09b: goto 0a8
      // 09e: ldc2_w 2377611663870511316
      // 0a1: lload 2
      // 0a2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: aload 5
      // 0aa: ldc "/"
      // 0ac: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0af: lload 2
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: iflt 0dd
      // 0b5: aload 10
      // 0b7: ifnonnull 0dd
      // 0ba: goto 0c7
      // 0bd: ldc2_w 2377611663870511316
      // 0c0: lload 2
      // 0c1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: bipush -1
      // 0c8: if_icmpne 0db
      // 0cb: goto 0d8
      // 0ce: ldc2_w 2377611663870511316
      // 0d1: lload 2
      // 0d2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: bipush 1
      // 0d9: istore 11
      // 0db: iload 11
      // 0dd: ifeq 0fc
      // 0e0: aload 5
      // 0e2: ldc "."
      // 0e4: ldc "/"
      // 0e6: ldc2_w 4445902033044404444
      // 0e9: lload 2
      // 0ea: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: goto 0fe
      // 0f2: ldc2_w 2377611663870511316
      // 0f5: lload 2
      // 0f6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 5
      // 0fe: astore 13
      // 100: iload 1
      // 101: lload 2
      // 102: lconst_0
      // 103: lcmp
      // 104: ifle 149
      // 107: aload 10
      // 109: ifnonnull 149
      // 10c: ifeq 135
      // 10f: goto 11c
      // 112: ldc2_w 2377611663870511316
      // 115: lload 2
      // 116: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: aload 13
      // 11e: aload 4
      // 120: lload 6
      // 122: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 125: checkcast java/lang/String
      // 128: astore 12
      // 12a: lload 2
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: ifle 40a
      // 130: aload 10
      // 132: ifnull 40a
      // 135: aload 5
      // 137: ldc "."
      // 139: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 13c: goto 149
      // 13f: ldc2_w 2377611663870511316
      // 142: lload 2
      // 143: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: bipush -1
      // 14a: aload 10
      // 14c: lload 2
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: ifle 1b2
      // 152: ifnonnull 1aa
      // 155: if_icmpne 195
      // 158: goto 165
      // 15b: ldc2_w 2377611663870511316
      // 15e: lload 2
      // 15f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: aload 5
      // 167: aload 10
      // 169: ifnonnull 408
      // 16c: goto 179
      // 16f: ldc2_w 2377611663870511316
      // 172: lload 2
      // 173: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: lload 2
      // 17a: lconst_0
      // 17b: lcmp
      // 17c: iflt 3fb
      // 17f: ldc "/"
      // 181: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 184: bipush -1
      // 185: if_icmpeq 3f9
      // 188: goto 195
      // 18b: ldc2_w 2377611663870511316
      // 18e: lload 2
      // 18f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: aload 5
      // 197: ldc "."
      // 199: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 19c: bipush -1
      // 19d: goto 1aa
      // 1a0: ldc2_w 2377611663870511316
      // 1a3: lload 2
      // 1a4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: lload 2
      // 1ab: lconst_0
      // 1ac: lcmp
      // 1ad: ifle 227
      // 1b0: aload 10
      // 1b2: ifnonnull 227
      // 1b5: if_icmpeq 1f5
      // 1b8: goto 1c5
      // 1bb: ldc2_w 2377611663870511316
      // 1be: lload 2
      // 1bf: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 5
      // 1c7: aload 10
      // 1c9: ifnonnull 408
      // 1cc: goto 1d9
      // 1cf: ldc2_w 2377611663870511316
      // 1d2: lload 2
      // 1d3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: lload 2
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: iflt 3fb
      // 1df: ldc "/"
      // 1e1: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1e4: bipush -1
      // 1e5: if_icmpne 3f9
      // 1e8: goto 1f5
      // 1eb: ldc2_w 2377611663870511316
      // 1ee: lload 2
      // 1ef: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: aload 5
      // 1f7: aload 10
      // 1f9: ifnonnull 408
      // 1fc: goto 209
      // 1ff: ldc2_w 2377611663870511316
      // 202: lload 2
      // 203: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: bipush 0
      // 20a: invokevirtual java/lang/String.charAt (I)C
      // 20d: sipush 11760
      // 210: ldc2_w 1695674202654573168
      // 213: lload 2
      // 214: lxor
      // 215: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: goto 227
      // 21d: ldc2_w 2377611663870511316
      // 220: lload 2
      // 221: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: athrow
      // 227: if_icmpeq 3f9
      // 22a: aload 5
      // 22c: aload 10
      // 22e: ifnonnull 408
      // 231: goto 23e
      // 234: ldc2_w 2377611663870511316
      // 237: lload 2
      // 238: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: lload 2
      // 23f: lconst_0
      // 240: lcmp
      // 241: ifle 3fb
      // 244: bipush 0
      // 245: invokevirtual java/lang/String.charAt (I)C
      // 248: sipush 18794
      // 24b: ldc2_w 3818753531077519077
      // 24e: lload 2
      // 24f: lxor
      // 250: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: if_icmpeq 3f9
      // 258: goto 265
      // 25b: ldc2_w 2377611663870511316
      // 25e: lload 2
      // 25f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: aload 5
      // 267: aload 10
      // 269: ifnonnull 408
      // 26c: goto 279
      // 26f: ldc2_w 2377611663870511316
      // 272: lload 2
      // 273: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: athrow
      // 279: lload 2
      // 27a: lconst_0
      // 27b: lcmp
      // 27c: iflt 3fb
      // 27f: aload 5
      // 281: invokevirtual java/lang/String.length ()I
      // 284: bipush 1
      // 285: isub
      // 286: invokevirtual java/lang/String.charAt (I)C
      // 289: sipush 11760
      // 28c: ldc2_w 1695674202654573168
      // 28f: lload 2
      // 290: lxor
      // 291: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: if_icmpeq 3f9
      // 299: goto 2a6
      // 29c: ldc2_w 2377611663870511316
      // 29f: lload 2
      // 2a0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: aload 5
      // 2a8: aload 10
      // 2aa: ifnonnull 408
      // 2ad: goto 2ba
      // 2b0: ldc2_w 2377611663870511316
      // 2b3: lload 2
      // 2b4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: athrow
      // 2ba: aload 5
      // 2bc: invokevirtual java/lang/String.length ()I
      // 2bf: bipush 1
      // 2c0: isub
      // 2c1: invokevirtual java/lang/String.charAt (I)C
      // 2c4: sipush 18794
      // 2c7: ldc2_w 3818753531077519077
      // 2ca: lload 2
      // 2cb: lxor
      // 2cc: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: if_icmpeq 3f9
      // 2d4: goto 2e1
      // 2d7: ldc2_w 2377611663870511316
      // 2da: lload 2
      // 2db: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: athrow
      // 2e1: aload 5
      // 2e3: ldc "."
      // 2e5: ldc "/"
      // 2e7: ldc2_w 4445902033044404444
      // 2ea: lload 2
      // 2eb: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: astore 12
      // 2f2: new java/util/StringTokenizer
      // 2f5: dup
      // 2f6: aload 12
      // 2f8: ldc "/"
      // 2fa: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 2fd: astore 14
      // 2ff: bipush 1
      // 300: istore 15
      // 302: aload 14
      // 304: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 307: ifeq 3cc
      // 30a: aload 14
      // 30c: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 30f: astore 16
      // 311: aload 16
      // 313: lload 8
      // 315: bipush 2
      // 316: anewarray 269
      // 319: dup_x2
      // 31a: dup_x2
      // 31b: pop
      // 31c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31f: bipush 1
      // 320: swap
      // 321: aastore
      // 322: dup_x1
      // 323: swap
      // 324: bipush 0
      // 325: swap
      // 326: aastore
      // 327: ldc2_w 2861165635773112821
      // 32a: lload 2
      // 32b: invokedynamic t (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: aload 10
      // 332: lload 2
      // 333: lconst_0
      // 334: lcmp
      // 335: ifle 33d
      // 338: ifnonnull 3ce
      // 33b: aload 10
      // 33d: lload 2
      // 33e: lconst_0
      // 33f: lcmp
      // 340: ifle 385
      // 343: ifnonnull 383
      // 346: goto 353
      // 349: ldc2_w 2377611663870511316
      // 34c: lload 2
      // 34d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: athrow
      // 353: ifne 371
      // 356: goto 363
      // 359: ldc2_w 2377611663870511316
      // 35c: lload 2
      // 35d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: athrow
      // 363: bipush 0
      // 364: lload 2
      // 365: lconst_0
      // 366: lcmp
      // 367: ifle 376
      // 36a: istore 15
      // 36c: aload 10
      // 36e: ifnull 3cc
      // 371: aload 16
      // 373: invokevirtual java/lang/String.length ()I
      // 376: goto 383
      // 379: ldc2_w 2377611663870511316
      // 37c: lload 2
      // 37d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 382: athrow
      // 383: aload 10
      // 385: ifnonnull 3a7
      // 388: bipush 2
      // 389: if_icmpge 3b4
      // 38c: goto 399
      // 38f: ldc2_w 2377611663870511316
      // 392: lload 2
      // 393: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: athrow
      // 399: bipush 0
      // 39a: goto 3a7
      // 39d: ldc2_w 2377611663870511316
      // 3a0: lload 2
      // 3a1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: athrow
      // 3a7: istore 15
      // 3a9: aload 10
      // 3ab: lload 2
      // 3ac: lconst_0
      // 3ad: lcmp
      // 3ae: ifle 3b6
      // 3b1: ifnull 3cc
      // 3b4: aload 10
      // 3b6: ifnull 302
      // 3b9: lload 2
      // 3ba: lconst_0
      // 3bb: lcmp
      // 3bc: ifle 311
      // 3bf: goto 3cc
      // 3c2: ldc2_w 2377611663870511316
      // 3c5: lload 2
      // 3c6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: iload 15
      // 3ce: ifeq 3ea
      // 3d1: aload 13
      // 3d3: aload 4
      // 3d5: lload 6
      // 3d7: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 3da: checkcast java/lang/String
      // 3dd: astore 12
      // 3df: aload 10
      // 3e1: lload 2
      // 3e2: lconst_0
      // 3e3: lcmp
      // 3e4: ifle 3f6
      // 3e7: ifnull 3ee
      // 3ea: aload 5
      // 3ec: astore 12
      // 3ee: lload 2
      // 3ef: lconst_0
      // 3f0: lcmp
      // 3f1: ifle 40a
      // 3f4: aload 10
      // 3f6: ifnull 40a
      // 3f9: aload 5
      // 3fb: goto 408
      // 3fe: ldc2_w 2377611663870511316
      // 401: lload 2
      // 402: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 407: athrow
      // 408: astore 12
      // 40a: iload 11
      // 40c: ifeq 42b
      // 40f: aload 12
      // 411: ldc "/"
      // 413: ldc "."
      // 415: ldc2_w 4445902033044404444
      // 418: lload 2
      // 419: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41e: goto 42d
      // 421: ldc2_w 2377611663870511316
      // 424: lload 2
      // 425: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42a: athrow
      // 42b: aload 12
      // 42d: areturn
   }

   public static final String o(Object[] param0) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 2
      // 019: pop
      // 01a: getstatic com/zelix/xl.bb J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 9690257988257
      // 025: lxor
      // 026: lstore 5
      // 028: dup2
      // 029: ldc2_w 87142714858181
      // 02c: lxor
      // 02d: lstore 7
      // 02f: pop2
      // 030: ldc2_w -7925334423206103070
      // 033: lload 3
      // 034: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: new java/lang/StringBuilder
      // 03c: dup
      // 03d: invokespecial java/lang/StringBuilder.<init> ()V
      // 040: astore 10
      // 042: astore 9
      // 044: aload 2
      // 045: sipush 16710
      // 048: ldc2_w 6190191561297485016
      // 04b: lload 3
      // 04c: lxor
      // 04d: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: invokevirtual java/lang/String.indexOf (I)I
      // 055: istore 11
      // 057: aload 9
      // 059: ifnonnull 1a5
      // 05c: iload 11
      // 05e: bipush -1
      // 05f: if_icmple 179
      // 062: goto 06f
      // 065: ldc2_w -7861173733003461939
      // 068: lload 3
      // 069: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: aload 10
      // 071: aload 2
      // 072: iload 11
      // 074: bipush 1
      // 075: iadd
      // 076: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 079: lload 5
      // 07b: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 081: pop
      // 082: aload 10
      // 084: sipush 15821
      // 087: ldc2_w 3735167175085105246
      // 08a: lload 3
      // 08b: lxor
      // 08c: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 094: pop
      // 095: aload 10
      // 097: aload 1
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b: pop
      // 09c: aload 10
      // 09e: sipush 14508
      // 0a1: ldc2_w 4423223959984514360
      // 0a4: lload 3
      // 0a5: lxor
      // 0a6: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ae: pop
      // 0af: lload 7
      // 0b1: aload 2
      // 0b2: bipush 2
      // 0b3: anewarray 269
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 1
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x2
      // 0bc: dup_x2
      // 0bd: pop
      // 0be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c1: bipush 0
      // 0c2: swap
      // 0c3: aastore
      // 0c4: ldc2_w -8341177780563970910
      // 0c7: lload 3
      // 0c8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: astore 12
      // 0cf: aload 12
      // 0d1: invokeinterface java/util/List.size ()I 1
      // 0d6: istore 13
      // 0d8: bipush 0
      // 0d9: istore 14
      // 0db: iload 14
      // 0dd: iload 13
      // 0df: if_icmpge 155
      // 0e2: aload 10
      // 0e4: aload 12
      // 0e6: iload 14
      // 0e8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ed: checkcast java/lang/String
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: pop
      // 0f4: aload 9
      // 0f6: lload 3
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: iflt 176
      // 0fc: ifnonnull 16e
      // 0ff: aload 9
      // 101: lload 3
      // 102: lconst_0
      // 103: lcmp
      // 104: iflt 152
      // 107: ifnonnull 150
      // 10a: goto 117
      // 10d: ldc2_w -7861173733003461939
      // 110: lload 3
      // 111: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: iload 14
      // 119: iload 13
      // 11b: bipush 1
      // 11c: isub
      // 11d: if_icmpge 14d
      // 120: goto 12d
      // 123: ldc2_w -7861173733003461939
      // 126: lload 3
      // 127: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: aload 10
      // 12f: sipush 2456
      // 132: ldc2_w 6853186109798533029
      // 135: lload 3
      // 136: lxor
      // 137: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: pop
      // 140: goto 14d
      // 143: ldc2_w -7861173733003461939
      // 146: lload 3
      // 147: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: iinc 14 1
      // 150: aload 9
      // 152: ifnull 0db
      // 155: aload 10
      // 157: sipush 16710
      // 15a: ldc2_w 6190191561297485016
      // 15d: lload 3
      // 15e: lxor
      // 15f: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 167: pop
      // 168: lload 3
      // 169: lconst_0
      // 16a: lcmp
      // 16b: ifle 0f4
      // 16e: lload 3
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 198
      // 174: aload 9
      // 176: ifnull 1ac
      // 179: aload 10
      // 17b: aload 2
      // 17c: lload 5
      // 17e: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 181: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 184: pop
      // 185: aload 10
      // 187: sipush 25141
      // 18a: ldc2_w 9120522276711432104
      // 18d: lload 3
      // 18e: lxor
      // 18f: invokedynamic x (IJ)I bsm=com/zelix/xl.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 197: pop
      // 198: goto 1a5
      // 19b: ldc2_w -7861173733003461939
      // 19e: lload 3
      // 19f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: aload 10
      // 1a7: aload 1
      // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ab: pop
      // 1ac: aload 10
      // 1ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b1: areturn
   }

   public final String d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      long var4 = var2 ^ 108804314065555L;
      return x44.a<"m">(this.j, new Object[]{var4}, -8140436750235064116L, var2);
   }

   private static gj c(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20859;
      if (fb[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])gb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               gb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/xl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = eb[var5].getBytes("ISO-8859-1");
         fb[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return fb[var5];
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
         throw new RuntimeException("com/zelix/xl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 729;
      if (ob[var3] == null) {
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
         long var5 = nb[var3];
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
         Object[] var9 = (Object[])pb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               pb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/xl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ob[var3] = var15;
      }

      return ob[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/xl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
