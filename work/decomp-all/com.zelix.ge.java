package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ge implements lkp, loz {
   private boolean G;
   private List E;
   private List O;
   private String U;
   private boolean a;
   private int x;
   private ah v;
   private static final long b = prr.a(-3802885422526644750L, 9091789180246772880L, MethodHandles.lookup().lookupClass()).a(130492724285248L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public boolean k(Object[] param1) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: pop
      // 017: lload 2
      // 018: dup2
      // 019: ldc2_w 101747208547237
      // 01c: lxor
      // 01d: lstore 5
      // 01f: dup2
      // 020: ldc2_w 0
      // 023: lxor
      // 024: lstore 7
      // 026: dup2
      // 027: ldc2_w 11707660690873
      // 02a: lxor
      // 02b: lstore 9
      // 02d: pop2
      // 02e: ldc2_w 4022236455885607079
      // 031: lload 2
      // 032: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: astore 11
      // 039: aload 0
      // 03a: ldc2_w 3384772058622032201
      // 03d: lload 2
      // 03e: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: aload 11
      // 045: ifnull 1f0
      // 048: ifne 1e6
      // 04b: goto 058
      // 04e: ldc2_w 3581532805614078252
      // 051: lload 2
      // 052: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: athrow
      // 058: aload 0
      // 059: bipush 1
      // 05a: ldc2_w 3384772058622032201
      // 05d: lload 2
      // 05e: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: bipush 0
      // 064: istore 12
      // 066: iload 12
      // 068: aload 0
      // 069: ldc2_w 3340095089053232837
      // 06c: lload 2
      // 06d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: invokeinterface java/util/List.size ()I 1
      // 077: if_icmpge 1e6
      // 07a: bipush 0
      // 07b: istore 13
      // 07d: aload 0
      // 07e: ldc2_w 3340095089053232837
      // 081: lload 2
      // 082: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: iload 12
      // 089: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 08e: checkcast com/zelix/lkp
      // 091: astore 14
      // 093: aload 14
      // 095: iload 4
      // 097: lload 7
      // 099: bipush 2
      // 09a: anewarray 488
      // 09d: dup_x2
      // 09e: dup_x2
      // 09f: pop
      // 0a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a3: bipush 1
      // 0a4: swap
      // 0a5: aastore
      // 0a6: dup_x1
      // 0a7: swap
      // 0a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ab: bipush 0
      // 0ac: swap
      // 0ad: aastore
      // 0ae: ldc2_w 3477580809084826625
      // 0b1: lload 2
      // 0b2: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: aload 11
      // 0b9: lload 2
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: ifle 0c4
      // 0bf: ifnull 1f0
      // 0c2: aload 11
      // 0c4: ifnull 10b
      // 0c7: goto 0d4
      // 0ca: ldc2_w 3581532805614078252
      // 0cd: lload 2
      // 0ce: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: ifeq 118
      // 0d7: goto 0e4
      // 0da: ldc2_w 3581532805614078252
      // 0dd: lload 2
      // 0de: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 14
      // 0e6: lload 5
      // 0e8: bipush 1
      // 0e9: anewarray 488
      // 0ec: dup_x2
      // 0ed: dup_x2
      // 0ee: pop
      // 0ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: ldc2_w 3033789447482455744
      // 0f8: lload 2
      // 0f9: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: goto 10b
      // 101: ldc2_w 3581532805614078252
      // 104: lload 2
      // 105: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: istore 13
      // 10d: lload 2
      // 10e: lconst_0
      // 10f: lcmp
      // 110: iflt 130
      // 113: aload 11
      // 115: ifnonnull 130
      // 118: aload 0
      // 119: bipush 0
      // 11a: ldc2_w 3384772058622032201
      // 11d: lload 2
      // 11e: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: goto 130
      // 126: ldc2_w 3581532805614078252
      // 129: lload 2
      // 12a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 0
      // 131: ldc2_w 3384772058622032201
      // 134: lload 2
      // 135: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: lload 2
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: ifle 157
      // 140: aload 11
      // 142: ifnull 157
      // 145: ifeq 1de
      // 148: goto 155
      // 14b: ldc2_w 3581532805614078252
      // 14e: lload 2
      // 14f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: iload 12
      // 157: ifne 17e
      // 15a: aload 0
      // 15b: iload 13
      // 15d: ldc2_w 3702076410657776567
      // 160: lload 2
      // 161: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: aload 11
      // 168: lload 2
      // 169: lconst_0
      // 16a: lcmp
      // 16b: ifle 1e3
      // 16e: ifnonnull 1de
      // 171: goto 17e
      // 174: ldc2_w 3581532805614078252
      // 177: lload 2
      // 178: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: aload 0
      // 17f: ldc2_w 3845217978787231963
      // 182: lload 2
      // 183: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: iload 12
      // 18a: bipush 1
      // 18b: isub
      // 18c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 191: checkcast java/lang/String
      // 194: astore 15
      // 196: aload 0
      // 197: aload 0
      // 198: aload 0
      // 199: ldc2_w 3702076410657776567
      // 19c: lload 2
      // 19d: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: lload 9
      // 1a4: dup2_x1
      // 1a5: pop2
      // 1a6: iload 13
      // 1a8: aload 15
      // 1aa: bipush 4
      // 1ab: anewarray 488
      // 1ae: dup_x1
      // 1af: swap
      // 1b0: bipush 3
      // 1b1: swap
      // 1b2: aastore
      // 1b3: dup_x1
      // 1b4: swap
      // 1b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b8: bipush 2
      // 1b9: swap
      // 1ba: aastore
      // 1bb: dup_x1
      // 1bc: swap
      // 1bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c0: bipush 1
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x2
      // 1c4: dup_x2
      // 1c5: pop
      // 1c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c9: bipush 0
      // 1ca: swap
      // 1cb: aastore
      // 1cc: ldc2_w 3101667232343940439
      // 1cf: lload 2
      // 1d0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: ldc2_w 3702076410657776567
      // 1d8: lload 2
      // 1d9: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: iinc 12 1
      // 1e1: aload 11
      // 1e3: ifnonnull 066
      // 1e6: aload 0
      // 1e7: ldc2_w 3384772058622032201
      // 1ea: lload 2
      // 1eb: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void b(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      String var10000 = m44.a<"m">(-5811687548070229970L, var2);
      int var7 = 0;
      String var6 = var10000;

      label43:
      while (var7 < m44.a<"s">(this, -5272870184820017588L, var2).size()) {
         lkp var8 = (lkp)m44.a<"s">(this, -5272870184820017588L, var2).get(var7);

         try {
            m44.a<"r">(var8, new Object[]{var4}, -6298714522431475577L, var2);
            var7++;
         } catch (NumberFormatException var10) {
            boolean var10001 = false;
            throw m44.a<"m">(var10, -6251753477436894811L, var2);
         }

         while (true) {
            try {
               var10000 = var6;
               if (var2 > 0L) {
                  if (var6 == null) {
                     return;
                  }

                  var10000 = var6;
               }

               if (var10000 != null) {
                  break;
               }
            } catch (NumberFormatException var9) {
               boolean var13 = false;
               throw m44.a<"m">(var9, -6251753477436894811L, var2);
            }

            if (var2 > 0L) {
               break label43;
            }
         }
      }

      m44.a<"q">(this, false, -5300659759029689920L, var2);
      m44.a<"q">(this, (int)f, -6059297907811894466L, var2);
   }

   private boolean X(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/ge.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -3512005199987611596
      // 1d: lload 2
      // 1e: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 5
      // 25: aload 4
      // 27: ldc "+"
      // 29: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c: aload 5
      // 2e: ifnull bd
      // 31: ifne bc
      // 34: goto 41
      // 37: ldc2_w -3952143683682242113
      // 3a: lload 2
      // 3b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 4
      // 43: ldc "-"
      // 45: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48: aload 5
      // 4a: ifnull bd
      // 4d: goto 5a
      // 50: ldc2_w -3952143683682242113
      // 53: lload 2
      // 54: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: ifne bc
      // 5d: goto 6a
      // 60: ldc2_w -3952143683682242113
      // 63: lload 2
      // 64: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 4
      // 6c: ldc "*"
      // 6e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 71: aload 5
      // 73: ifnull bd
      // 76: goto 83
      // 79: ldc2_w -3952143683682242113
      // 7c: lload 2
      // 7d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: ifne bc
      // 86: goto 93
      // 89: ldc2_w -3952143683682242113
      // 8c: lload 2
      // 8d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: aload 4
      // 95: ldc "/"
      // 97: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9a: aload 5
      // 9c: ifnull bf
      // 9f: goto ac
      // a2: ldc2_w -3952143683682242113
      // a5: lload 2
      // a6: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: ifeq be
      // af: goto bc
      // b2: ldc2_w -3952143683682242113
      // b5: lload 2
      // b6: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: athrow
      // bc: bipush 1
      // bd: ireturn
      // be: bipush 0
      // bf: ireturn
   }

   public boolean m(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 3458129054616914059
      // 18: lload 2
      // 19: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: ldc2_w 3924326848835450601
      // 22: lload 2
      // 23: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: bipush 0
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast com/zelix/lkp
      // 31: astore 7
      // 33: astore 6
      // 35: aload 7
      // 37: lload 4
      // 39: bipush 1
      // 3a: anewarray 488
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w 3243571081845136993
      // 49: lload 2
      // 4a: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: aload 6
      // 51: ifnull 71
      // 54: ifeq 70
      // 57: goto 64
      // 5a: ldc2_w 2997230966203683072
      // 5d: lload 2
      // 5e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: ldc2_w 2997230966203683072
      // 69: lload 2
      // 6a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 0
      // 71: ireturn
   }

   int n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 39988316568261L;
      String var10000 = m44.a<"h">(-2529370796847989869L, var2);
      lkp var7 = (lkp)m44.a<"v">(this, -4220327091618740751L, var2).get(0);
      String var6 = var10000;

      label27: {
         try {
            byte var11 = var7 instanceof g9;
            if (var6 == null) {
               return var11;
            }

            if (var11 != 0) {
               break label27;
            }
         } catch (NumberFormatException var9) {
            throw m44.a<"h">(var9, -2702110247914708456L, var2);
         }

         return 0;
      }

      g9 var8 = (g9)var7;
      return m44.a<"w">(var8, new Object[]{var4}, -4489546701586018504L, var2);
   }

   public boolean s(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -190112262786917846
      // 18: lload 2
      // 19: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: ldc2_w -1957049810362522552
      // 22: lload 2
      // 23: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: bipush 0
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast com/zelix/lkp
      // 31: astore 7
      // 33: astore 6
      // 35: aload 7
      // 37: lload 4
      // 39: bipush 1
      // 3a: anewarray 488
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w -1955331785578528524
      // 49: lload 2
      // 4a: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: aload 6
      // 51: ifnull 71
      // 54: ifeq 70
      // 57: goto 64
      // 5a: ldc2_w -344131446075898975
      // 5d: lload 2
      // 5e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: ldc2_w -344131446075898975
      // 69: lload 2
      // 6a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 0
      // 71: ireturn
   }

   ge(long var1, ah var3, String var4) {
      var1 = b ^ var1;
      super();
      m44.a<"w">(this, new ArrayList(), -7841495032203062350L, var1);
      m44.a<"w">(this, new ArrayList(), -8634532458675681876L, var1);
      m44.a<"w">(this, var3, -7843975019509901160L, var1);
      m44.a<"w">(this, var4, -8280184205536859071L, var1);
   }

   public boolean r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return m44.a<"u">(this, -2225200524721736018L, var2);
   }

   int E(Object[] param1) {
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
      // 00b: pop
      // 00c: getstatic com/zelix/ge.b J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 22548552050632
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 79199739546733
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 73314129373652
      // 025: lxor
      // 026: lstore 8
      // 028: pop2
      // 029: ldc2_w -4918895379058549558
      // 02c: lload 2
      // 02d: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: bipush 0
      // 033: istore 11
      // 035: bipush 1
      // 036: istore 12
      // 038: astore 10
      // 03a: iload 12
      // 03c: aload 0
      // 03d: ldc2_w -6757881307983977816
      // 040: lload 2
      // 041: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: invokeinterface java/util/List.size ()I 1
      // 04b: if_icmpge 126
      // 04e: aload 0
      // 04f: ldc2_w -6757881307983977816
      // 052: lload 2
      // 053: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: iload 12
      // 05a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 05f: checkcast com/zelix/lkp
      // 062: astore 13
      // 064: aload 10
      // 066: lload 2
      // 067: lconst_0
      // 068: lcmp
      // 069: ifle 123
      // 06c: ifnull 121
      // 06f: aload 13
      // 071: bipush 0
      // 072: lload 6
      // 074: bipush 2
      // 075: anewarray 488
      // 078: dup_x2
      // 079: dup_x2
      // 07a: pop
      // 07b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07e: bipush 1
      // 07f: swap
      // 080: aastore
      // 081: dup_x1
      // 082: swap
      // 083: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 086: bipush 0
      // 087: swap
      // 088: aastore
      // 089: ldc2_w -4886527254883927956
      // 08c: lload 2
      // 08d: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: aload 10
      // 094: ifnull 130
      // 097: goto 0a4
      // 09a: ldc2_w -4766671990887119551
      // 09d: lload 2
      // 09e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: ifeq 11e
      // 0a7: goto 0b4
      // 0aa: ldc2_w -4766671990887119551
      // 0ad: lload 2
      // 0ae: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 13
      // 0b6: lload 4
      // 0b8: bipush 1
      // 0b9: anewarray 488
      // 0bc: dup_x2
      // 0bd: dup_x2
      // 0be: pop
      // 0bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c2: bipush 0
      // 0c3: swap
      // 0c4: aastore
      // 0c5: ldc2_w -6451574253856572755
      // 0c8: lload 2
      // 0c9: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: istore 14
      // 0d0: aload 0
      // 0d1: ldc2_w -5102088644737796938
      // 0d4: lload 2
      // 0d5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: iload 12
      // 0dc: bipush 1
      // 0dd: isub
      // 0de: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e3: checkcast java/lang/String
      // 0e6: astore 15
      // 0e8: aload 0
      // 0e9: lload 8
      // 0eb: iload 11
      // 0ed: iload 14
      // 0ef: aload 15
      // 0f1: bipush 4
      // 0f2: anewarray 488
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: bipush 3
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ff: bipush 2
      // 100: swap
      // 101: aastore
      // 102: dup_x1
      // 103: swap
      // 104: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x2
      // 10b: dup_x2
      // 10c: pop
      // 10d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w -6384382564261179078
      // 116: lload 2
      // 117: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: istore 11
      // 11e: iinc 12 1
      // 121: aload 10
      // 123: ifnonnull 03a
      // 126: iload 11
      // 128: lload 2
      // 129: lconst_0
      // 12a: lcmp
      // 12b: iflt 130
      // 12e: bipush -1
      // 12f: imul
      // 130: ireturn
   }

   private String Q(Object[] param1) {
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
      // 00b: pop
      // 00c: getstatic com/zelix/ge.b J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 55040567446580
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 2769133130897
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 40764700002971
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 37124666856485
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 115833154772309
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 103563922994331
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 102619423066277
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 85303851562552
      // 048: lxor
      // 049: lstore 18
      // 04b: dup2
      // 04c: ldc2_w 47968924722806
      // 04f: lxor
      // 050: lstore 20
      // 052: dup2
      // 053: ldc2_w 111399664843788
      // 056: lxor
      // 057: lstore 22
      // 059: dup2
      // 05a: ldc2_w 47968924722806
      // 05d: lxor
      // 05e: lstore 24
      // 060: dup2
      // 061: ldc2_w 46677688395687
      // 064: lxor
      // 065: dup2
      // 066: bipush 48
      // 068: lushr
      // 069: l2i
      // 06a: istore 26
      // 06c: dup2
      // 06d: bipush 16
      // 06f: lshl
      // 070: bipush 48
      // 072: lushr
      // 073: l2i
      // 074: istore 27
      // 076: dup2
      // 077: bipush 32
      // 079: lshl
      // 07a: bipush 32
      // 07c: lushr
      // 07d: l2i
      // 07e: istore 28
      // 080: pop2
      // 081: pop2
      // 082: ldc2_w 5688753324989114756
      // 085: lload 2
      // 086: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: aload 0
      // 08c: bipush 1
      // 08d: ldc2_w 6133234469948218878
      // 090: lload 2
      // 091: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: new java/util/StringTokenizer
      // 099: dup
      // 09a: aload 0
      // 09b: ldc2_w 5278982855506012181
      // 09e: lload 2
      // 09f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: sipush 4064
      // 0a7: ldc2_w 5182136473154158484
      // 0aa: lload 2
      // 0ab: lxor
      // 0ac: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ge.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: bipush 1
      // 0b2: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 0b5: astore 30
      // 0b7: astore 29
      // 0b9: aload 30
      // 0bb: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0be: ifeq 420
      // 0c1: aload 30
      // 0c3: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0c6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0c9: astore 31
      // 0cb: lload 2
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 125
      // 0d1: aload 0
      // 0d2: aload 31
      // 0d4: lload 4
      // 0d6: bipush 2
      // 0d7: anewarray 488
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
      // 0e8: ldc2_w 5647453173596818043
      // 0eb: lload 2
      // 0ec: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: aload 29
      // 0f3: ifnull 124
      // 0f6: ifeq 130
      // 0f9: goto 106
      // 0fc: ldc2_w 5230773327587799055
      // 0ff: lload 2
      // 100: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: ldc2_w 5512314530638758392
      // 10a: lload 2
      // 10b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aload 31
      // 112: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 117: goto 124
      // 11a: ldc2_w 5230773327587799055
      // 11d: lload 2
      // 11e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: pop
      // 125: aload 29
      // 127: lload 2
      // 128: lconst_0
      // 129: lcmp
      // 12a: iflt 41d
      // 12d: ifnonnull 41b
      // 130: aconst_null
      // 131: astore 32
      // 133: aload 31
      // 135: ldc "."
      // 137: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 13a: istore 33
      // 13c: aload 31
      // 13e: lload 8
      // 140: bipush 2
      // 141: anewarray 488
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w 6272168057973420254
      // 155: lload 2
      // 156: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: aload 29
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 1d0
      // 163: ifnull 1ce
      // 166: ifeq 1cc
      // 169: goto 176
      // 16c: ldc2_w 5230773327587799055
      // 16f: lload 2
      // 170: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: new com/zelix/l6l
      // 179: dup
      // 17a: aload 0
      // 17b: ldc2_w 6300761152560291020
      // 17e: lload 2
      // 17f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ah; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: lload 22
      // 186: dup2_x1
      // 187: pop2
      // 188: aload 31
      // 18a: invokespecial com/zelix/l6l.<init> (JLcom/zelix/ah;Ljava/lang/String;)V
      // 18d: astore 34
      // 18f: aload 34
      // 191: lload 24
      // 193: bipush 1
      // 194: anewarray 488
      // 197: dup_x2
      // 198: dup_x2
      // 199: pop
      // 19a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19d: bipush 0
      // 19e: swap
      // 19f: aastore
      // 1a0: ldc2_w 5650020141150517449
      // 1a3: lload 2
      // 1a4: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: astore 35
      // 1ab: aload 35
      // 1ad: aload 29
      // 1af: ifnull 1c4
      // 1b2: ifnull 1c5
      // 1b5: goto 1c2
      // 1b8: ldc2_w 5230773327587799055
      // 1bb: lload 2
      // 1bc: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aload 35
      // 1c4: areturn
      // 1c5: aload 34
      // 1c7: astore 32
      // 1c9: goto 368
      // 1cc: iload 33
      // 1ce: aload 29
      // 1d0: lload 2
      // 1d1: lconst_0
      // 1d2: lcmp
      // 1d3: iflt 2aa
      // 1d6: ifnull 2a8
      // 1d9: bipush -1
      // 1da: if_icmpeq 299
      // 1dd: goto 1ea
      // 1e0: ldc2_w 5230773327587799055
      // 1e3: lload 2
      // 1e4: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 31
      // 1ec: bipush 0
      // 1ed: iload 33
      // 1ef: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f2: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1f5: astore 34
      // 1f7: aload 31
      // 1f9: iload 33
      // 1fb: bipush 1
      // 1fc: iadd
      // 1fd: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 200: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 203: astore 35
      // 205: lload 14
      // 207: aload 35
      // 209: bipush 2
      // 20a: anewarray 488
      // 20d: dup_x1
      // 20e: swap
      // 20f: bipush 1
      // 210: swap
      // 211: aastore
      // 212: dup_x2
      // 213: dup_x2
      // 214: pop
      // 215: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 218: bipush 0
      // 219: swap
      // 21a: aastore
      // 21b: ldc2_w 5614753834299207225
      // 21e: lload 2
      // 21f: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: istore 36
      // 226: aload 34
      // 228: sipush 25287
      // 22b: ldc2_w 5926002862834979511
      // 22e: lload 2
      // 22f: lxor
      // 230: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ge.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 238: ifeq 25c
      // 23b: new com/zelix/g9
      // 23e: dup
      // 23f: aload 0
      // 240: ldc2_w 6300761152560291020
      // 243: lload 2
      // 244: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ah; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: iload 26
      // 24b: i2s
      // 24c: swap
      // 24d: iload 36
      // 24f: iload 27
      // 251: i2s
      // 252: iload 28
      // 254: invokespecial com/zelix/g9.<init> (SLcom/zelix/ah;ISI)V
      // 257: astore 32
      // 259: goto 296
      // 25c: aload 0
      // 25d: ldc2_w 6300761152560291020
      // 260: lload 2
      // 261: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ah; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: aload 34
      // 268: lload 6
      // 26a: bipush 2
      // 26b: anewarray 488
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 1
      // 275: swap
      // 276: aastore
      // 277: dup_x1
      // 278: swap
      // 279: bipush 0
      // 27a: swap
      // 27b: aastore
      // 27c: ldc2_w 5340154219028119771
      // 27f: lload 2
      // 280: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lqe; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: astore 37
      // 287: new com/zelix/lm7
      // 28a: dup
      // 28b: aload 37
      // 28d: iload 36
      // 28f: lload 18
      // 291: invokespecial com/zelix/lm7.<init> (Lcom/zelix/lqe;IJ)V
      // 294: astore 32
      // 296: goto 368
      // 299: aload 31
      // 29b: bipush 0
      // 29c: invokevirtual java/lang/String.charAt (I)C
      // 29f: ldc2_w 5650092754607515514
      // 2a2: lload 2
      // 2a3: invokedynamic o (CJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: aload 29
      // 2aa: ifnull 2c2
      // 2ad: ifeq 303
      // 2b0: goto 2bd
      // 2b3: ldc2_w 5230773327587799055
      // 2b6: lload 2
      // 2b7: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: athrow
      // 2bd: aload 31
      // 2bf: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 2c2: istore 34
      // 2c4: new com/zelix/md
      // 2c7: dup
      // 2c8: lload 10
      // 2ca: iload 34
      // 2cc: invokespecial com/zelix/md.<init> (JI)V
      // 2cf: astore 32
      // 2d1: goto 368
      // 2d4: astore 34
      // 2d6: new java/lang/StringBuilder
      // 2d9: dup
      // 2da: invokespecial java/lang/StringBuilder.<init> ()V
      // 2dd: sipush 11065
      // 2e0: ldc2_w 607902110978202444
      // 2e3: lload 2
      // 2e4: lxor
      // 2e5: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ge.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ed: aload 0
      // 2ee: ldc2_w 5278982855506012181
      // 2f1: lload 2
      // 2f2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fa: ldc "'"
      // 2fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ff: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 302: areturn
      // 303: aload 0
      // 304: ldc2_w 6300761152560291020
      // 307: lload 2
      // 308: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ah; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: aload 31
      // 30f: lload 12
      // 311: bipush 2
      // 312: anewarray 488
      // 315: dup_x2
      // 316: dup_x2
      // 317: pop
      // 318: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31b: bipush 1
      // 31c: swap
      // 31d: aastore
      // 31e: dup_x1
      // 31f: swap
      // 320: bipush 0
      // 321: swap
      // 322: aastore
      // 323: ldc2_w 6040208710683724881
      // 326: lload 2
      // 327: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: astore 34
      // 32e: aload 34
      // 330: lload 20
      // 332: bipush 1
      // 333: anewarray 488
      // 336: dup_x2
      // 337: dup_x2
      // 338: pop
      // 339: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33c: bipush 0
      // 33d: swap
      // 33e: aastore
      // 33f: ldc2_w 6260900406913359525
      // 342: lload 2
      // 343: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: astore 35
      // 34a: aload 35
      // 34c: aload 29
      // 34e: ifnull 363
      // 351: ifnull 364
      // 354: goto 361
      // 357: ldc2_w 5230773327587799055
      // 35a: lload 2
      // 35b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: athrow
      // 361: aload 35
      // 363: areturn
      // 364: aload 34
      // 366: astore 32
      // 368: aload 0
      // 369: ldc2_w 6303138928420919270
      // 36c: lload 2
      // 36d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: aload 32
      // 374: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 379: pop
      // 37a: aload 0
      // 37b: ldc2_w 6303138928420919270
      // 37e: lload 2
      // 37f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: invokeinterface java/util/List.size ()I 1
      // 389: lload 2
      // 38a: lconst_0
      // 38b: lcmp
      // 38c: iflt 3cc
      // 38f: aload 29
      // 391: ifnull 3cc
      // 394: bipush 1
      // 395: if_icmple 41b
      // 398: goto 3a5
      // 39b: ldc2_w 5230773327587799055
      // 39e: lload 2
      // 39f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: athrow
      // 3a5: aload 32
      // 3a7: lload 16
      // 3a9: bipush 1
      // 3aa: anewarray 488
      // 3ad: dup_x2
      // 3ae: dup_x2
      // 3af: pop
      // 3b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b3: bipush 0
      // 3b4: swap
      // 3b5: aastore
      // 3b6: ldc2_w 5686021159291118374
      // 3b9: lload 2
      // 3ba: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bf: goto 3cc
      // 3c2: ldc2_w 5230773327587799055
      // 3c5: lload 2
      // 3c6: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: ifeq 41b
      // 3cf: new java/lang/StringBuilder
      // 3d2: dup
      // 3d3: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d6: sipush 23125
      // 3d9: ldc2_w 5881243059196013091
      // 3dc: lload 2
      // 3dd: lxor
      // 3de: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ge.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e6: aload 31
      // 3e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3eb: sipush 25512
      // 3ee: ldc2_w 5933566498820821983
      // 3f1: lload 2
      // 3f2: lxor
      // 3f3: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ge.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3fb: aload 0
      // 3fc: ldc2_w 5278982855506012181
      // 3ff: lload 2
      // 400: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 405: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 408: ldc "'"
      // 40a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 410: areturn
      // 411: ldc2_w 5230773327587799055
      // 414: lload 2
      // 415: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: athrow
      // 41b: aload 29
      // 41d: ifnonnull 0b9
      // 420: aconst_null
      // 421: areturn
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return m44.a<"r">(this, 5566877542855945238L, var2);
   }

   public boolean t(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 2775822840957895155
      // 18: lload 2
      // 19: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: ldc2_w 4543578270562353041
      // 22: lload 2
      // 23: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: bipush 0
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast com/zelix/lkp
      // 31: astore 7
      // 33: astore 6
      // 35: aload 7
      // 37: lload 4
      // 39: bipush 1
      // 3a: anewarray 488
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w 4455038207810681447
      // 49: lload 2
      // 4a: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: aload 6
      // 51: ifnull 71
      // 54: ifeq 70
      // 57: goto 64
      // 5a: ldc2_w 2368972054227523704
      // 5d: lload 2
      // 5e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: ldc2_w 2368972054227523704
      // 69: lload 2
      // 6a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 0
      // 71: ireturn
   }

   public String v(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 22359260858332
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 74000011815922
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w -6303728162048339982
      // 1f: lload 2
      // 20: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: lload 4
      // 28: bipush 1
      // 29: anewarray 488
      // 2c: dup_x2
      // 2d: dup_x2
      // 2e: pop
      // 2f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32: bipush 0
      // 33: swap
      // 34: aastore
      // 35: ldc2_w -6047067548193966356
      // 38: lload 2
      // 39: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: astore 8
      // 40: aload 0
      // 41: aload 8
      // 43: ifnull 6d
      // 46: ldc2_w -5518163115838653560
      // 49: lload 2
      // 4a: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: ifne 86
      // 52: goto 5f
      // 55: ldc2_w -5845290785628318087
      // 58: lload 2
      // 59: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: goto 6d
      // 63: ldc2_w -5845290785628318087
      // 66: lload 2
      // 67: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: lload 6
      // 6f: bipush 1
      // 70: anewarray 488
      // 73: dup_x2
      // 74: dup_x2
      // 75: pop
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w -5338060917609185776
      // 7f: lload 2
      // 80: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: areturn
      // 86: aconst_null
      // 87: areturn
   }

   private int g(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 6
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 5
      // 21: dup
      // 22: bipush 3
      // 23: aaload
      // 24: checkcast java/lang/String
      // 27: astore 4
      // 29: pop
      // 2a: getstatic com/zelix/ge.b J
      // 2d: lload 2
      // 2e: lxor
      // 2f: lstore 2
      // 30: ldc2_w -2311269138563467110
      // 33: lload 2
      // 34: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: astore 7
      // 3b: aload 4
      // 3d: ldc "+"
      // 3f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42: aload 7
      // 44: ifnull 6e
      // 47: ifeq 67
      // 4a: goto 57
      // 4d: ldc2_w -2771601270008389359
      // 50: lload 2
      // 51: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 6
      // 59: iload 5
      // 5b: iadd
      // 5c: ireturn
      // 5d: ldc2_w -2771601270008389359
      // 60: lload 2
      // 61: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 4
      // 69: ldc "-"
      // 6b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6e: aload 7
      // 70: lload 2
      // 71: lconst_0
      // 72: lcmp
      // 73: iflt a2
      // 76: ifnull a0
      // 79: ifeq 99
      // 7c: goto 89
      // 7f: ldc2_w -2771601270008389359
      // 82: lload 2
      // 83: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: iload 6
      // 8b: iload 5
      // 8d: isub
      // 8e: ireturn
      // 8f: ldc2_w -2771601270008389359
      // 92: lload 2
      // 93: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 4
      // 9b: ldc "*"
      // 9d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a0: aload 7
      // a2: ifnull ca
      // a5: ifeq c5
      // a8: goto b5
      // ab: ldc2_w -2771601270008389359
      // ae: lload 2
      // af: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: iload 6
      // b7: iload 5
      // b9: imul
      // ba: ireturn
      // bb: ldc2_w -2771601270008389359
      // be: lload 2
      // bf: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: athrow
      // c5: iload 6
      // c7: iload 5
      // c9: idiv
      // ca: ireturn
   }

   public int u(Object[] var1) {
      long var2 = (Long)var1[0];
      return m44.a<"w">(this, -2826793369414088686L, var2);
   }

   public boolean P(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      lkp var6 = (lkp)m44.a<"t">(this, 2295817805204119363L, var2).get(0);
      return m44.a<"u">(var6, new Object[]{var4}, 454181086334069635L, var2);
   }

   static {
      long var5 = b ^ 134634789630971L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[5];
      int var12 = 0;
      String var11 = "Ó3\n\u0010¾ä\u0080Ò²I`²M`RÁ\u0018\u009bØ\u0003Ìñðð;\u0005éc à\u000b\f\u0014e\u0083s,ôû\u0005@pÿæ{^õÔI\u0003äo×£Xþ\u0083§2\u0013\u0006\u009a²³çºäL;ùË\u000e=å\u009a\u008bIä½s\u0004W¡Ü\u008aÌ\u0091å¾\u0084\u0090Ø÷\u00ad´\u0085Çë\u0086<G9¯8©ÍÛ-7ÍþzA\n9\u0017\u0010\u00800R\u0082¼U«àªÀ\u008b±\u0014\u0004f¬:\u008b-`û@ðÒ¬\u001e¸6he\u009e[Á¢cÁ#";
      int var13 = "Ó3\n\u0010¾ä\u0080Ò²I`²M`RÁ\u0018\u009bØ\u0003Ìñðð;\u0005éc à\u000b\f\u0014e\u0083s,ôû\u0005@pÿæ{^õÔI\u0003äo×£Xþ\u0083§2\u0013\u0006\u009a²³çºäL;ùË\u000e=å\u009a\u008bIä½s\u0004W¡Ü\u008aÌ\u0091å¾\u0084\u0090Ø÷\u00ad´\u0085Çë\u0086<G9¯8©ÍÛ-7ÍþzA\n9\u0017\u0010\u00800R\u0082¼U«àªÀ\u008b±\u0014\u0004f¬:\u008b-`û@ðÒ¬\u001e¸6he\u009e[Á¢cÁ#"
         .length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     c = var14;
                     d = new String[5];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 4154680098146909999L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)((int)(var2 >>> 56)),
                           (byte)((int)(var2 >>> 48)),
                           (byte)((int)(var2 >>> 40)),
                           (byte)((int)(var2 >>> 32)),
                           (byte)((int)(var2 >>> 24)),
                           (byte)((int)(var2 >>> 16)),
                           (byte)((int)(var2 >>> 8)),
                           (byte)((int)var2)
                        }
                     );
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     f = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "\u0090ÂãW\u0087Ö*\u001a\u000f®\u0091\u0011§t\r, ½\u0086&D\u0085JL \u0091þ(\u000fîÛûi3³êÓ¨\u0002lBj\f\u009f¶B¸\u00020";
                  var13 = "\u0090ÂãW\u0087Ö*\u001a\u000f®\u0091\u0011§t\r, ½\u0086&D\u0085JL \u0091þ(\u000fîÛûi3³êÓ¨\u0002lBj\f\u009f¶B¸\u00020".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10396;
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
            throw new RuntimeException("com/zelix/ge", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("com/zelix/ge" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
