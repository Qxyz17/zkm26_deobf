package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _f3 {
   private _8z H;
   private HashSet e;
   private qx i;
   private pk Y;
   private _8z h;
   private static final long a = ess.a(-1086272114800606721L, -7169162575374697616L, MethodHandles.lookup().lookupClass()).a(37776715937405L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   ig[] E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      ig[] var4 = new ig[x44.a<"i">(x44.a<"m">(this, 5857313827437305560L, var2), 5654720393057600987L, var2)];
      return (ig[])x44.a<"i">(x44.a<"m">(this, 5857313827437305560L, var2), var4, 5995954592364605896L, var2);
   }

   Enumeration E(Object[] var1) {
      long var2 = (Long)var1[0];
      ig var4 = (ig)var1[1];
      var2 = a ^ var2;
      hk[] var10000 = x44.a<"u">(7402007283633093281L, var2);
      Map var6 = x44.a<"i">(this, 8881459699456784078L, var2).D(var4);
      hk[] var5 = var10000;

      try {
         if (var5 != null) {
            return Collections.enumeration(var6.keySet());
         }

         if (var6 == null) {
            return new ri();
         }
      } catch (gj var7) {
         throw x44.a<"u">(var7, 9203936322031092573L, var2);
      }

      return Collections.enumeration(var6.keySet());
   }

   private void k(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/HashSet
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/HashSet
      // 021: astore 5
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/_y4
      // 029: astore 4
      // 02b: pop
      // 02c: getstatic com/zelix/_f3.a J
      // 02f: lload 2
      // 030: lxor
      // 031: lstore 2
      // 032: lload 2
      // 033: dup2
      // 034: ldc2_w 130304963184056
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 99165679126224
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 60295735984494
      // 045: lxor
      // 046: lstore 12
      // 048: dup2
      // 049: ldc2_w 24529201840763
      // 04c: lxor
      // 04d: lstore 14
      // 04f: dup2
      // 050: ldc2_w 24739687700492
      // 053: lxor
      // 054: lstore 16
      // 056: dup2
      // 057: ldc2_w 117677326125518
      // 05a: lxor
      // 05b: lstore 18
      // 05d: dup2
      // 05e: ldc2_w 45321738370930
      // 061: lxor
      // 062: lstore 20
      // 064: dup2
      // 065: ldc2_w 12078566743778
      // 068: lxor
      // 069: lstore 22
      // 06b: dup2
      // 06c: ldc2_w 23831641047342
      // 06f: lxor
      // 070: dup2
      // 071: bipush 32
      // 073: lushr
      // 074: l2i
      // 075: istore 24
      // 077: dup2
      // 078: bipush 32
      // 07a: lshl
      // 07b: bipush 48
      // 07d: lushr
      // 07e: l2i
      // 07f: istore 25
      // 081: dup2
      // 082: bipush 48
      // 084: lshl
      // 085: bipush 48
      // 087: lushr
      // 088: l2i
      // 089: istore 26
      // 08b: pop2
      // 08c: dup2
      // 08d: ldc2_w 28981732057618
      // 090: lxor
      // 091: lstore 27
      // 093: dup2
      // 094: ldc2_w 131032334657668
      // 097: lxor
      // 098: lstore 29
      // 09a: pop2
      // 09b: ldc2_w -7104027508151418511
      // 09e: lload 2
      // 09f: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: aload 7
      // 0a6: lload 10
      // 0a8: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 0ab: astore 32
      // 0ad: astore 31
      // 0af: aload 32
      // 0b1: aload 31
      // 0b3: ifnonnull 0ef
      // 0b6: sipush 21561
      // 0b9: ldc2_w 816482358047503081
      // 0bc: lload 2
      // 0bd: lxor
      // 0be: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c6: ifne 4cf
      // 0c9: goto 0d6
      // 0cc: ldc2_w -8905118788878370675
      // 0cf: lload 2
      // 0d0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 7
      // 0d8: iload 24
      // 0da: iload 25
      // 0dc: iload 26
      // 0de: i2c
      // 0df: invokevirtual com/zelix/hz.O (IIC)Ljava/lang/String;
      // 0e2: goto 0ef
      // 0e5: ldc2_w -8905118788878370675
      // 0e8: lload 2
      // 0e9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: astore 33
      // 0f1: aload 33
      // 0f3: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 0f6: astore 34
      // 0f8: aload 34
      // 0fa: aload 31
      // 0fc: lload 2
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: ifle 126
      // 102: ifnonnull 117
      // 105: ifnull 14a
      // 108: goto 115
      // 10b: ldc2_w -8905118788878370675
      // 10e: lload 2
      // 10f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 34
      // 117: lload 18
      // 119: bipush 1
      // 11a: anewarray 223
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: ldc2_w -7234571398606876222
      // 129: lload 2
      // 12a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: aload 31
      // 131: lload 2
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 166
      // 137: ifnonnull 164
      // 13a: ifne 278
      // 13d: goto 14a
      // 140: ldc2_w -8905118788878370675
      // 143: lload 2
      // 144: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 5
      // 14c: aload 33
      // 14e: ldc2_w -8892910603574282707
      // 151: lload 2
      // 152: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: goto 164
      // 15a: ldc2_w -8905118788878370675
      // 15d: lload 2
      // 15e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: aload 31
      // 166: ifnonnull 18d
      // 169: ifne 278
      // 16c: goto 179
      // 16f: ldc2_w -8905118788878370675
      // 172: lload 2
      // 173: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 5
      // 17b: aload 33
      // 17d: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 180: goto 18d
      // 183: ldc2_w -8905118788878370675
      // 186: lload 2
      // 187: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: pop
      // 18e: new java/lang/StringBuilder
      // 191: dup
      // 192: invokespecial java/lang/StringBuilder.<init> ()V
      // 195: sipush 6626
      // 198: ldc2_w 3915246755921182519
      // 19b: lload 2
      // 19c: lxor
      // 19d: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a5: aload 7
      // 1a7: lload 12
      // 1a9: bipush 1
      // 1aa: anewarray 223
      // 1ad: dup_x2
      // 1ae: dup_x2
      // 1af: pop
      // 1b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b3: bipush 0
      // 1b4: swap
      // 1b5: aastore
      // 1b6: ldc2_w -7320398864171036990
      // 1b9: lload 2
      // 1ba: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c2: sipush 16919
      // 1c5: ldc2_w 1983926099797861568
      // 1c8: lload 2
      // 1c9: lxor
      // 1ca: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: aload 7
      // 1d4: lload 20
      // 1d6: ldc2_w -9171227375414803525
      // 1d9: lload 2
      // 1da: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: ldc "'"
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ea: astore 35
      // 1ec: aload 0
      // 1ed: aload 33
      // 1ef: lload 8
      // 1f1: aload 35
      // 1f3: bipush 3
      // 1f4: anewarray 223
      // 1f7: dup_x1
      // 1f8: swap
      // 1f9: bipush 2
      // 1fa: swap
      // 1fb: aastore
      // 1fc: dup_x2
      // 1fd: dup_x2
      // 1fe: pop
      // 1ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 202: bipush 1
      // 203: swap
      // 204: aastore
      // 205: dup_x1
      // 206: swap
      // 207: bipush 0
      // 208: swap
      // 209: aastore
      // 20a: ldc2_w -8719088889344577361
      // 20d: lload 2
      // 20e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: astore 36
      // 215: aload 0
      // 216: aload 36
      // 218: aload 6
      // 21a: aload 4
      // 21c: lload 29
      // 21e: bipush 4
      // 21f: anewarray 223
      // 222: dup_x2
      // 223: dup_x2
      // 224: pop
      // 225: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 228: bipush 3
      // 229: swap
      // 22a: aastore
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 2
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: bipush 1
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 0
      // 238: swap
      // 239: aastore
      // 23a: ldc2_w -7303937141931510427
      // 23d: lload 2
      // 23e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: aload 0
      // 244: aload 36
      // 246: lload 27
      // 248: aload 6
      // 24a: aload 5
      // 24c: aload 4
      // 24e: bipush 5
      // 24f: anewarray 223
      // 252: dup_x1
      // 253: swap
      // 254: bipush 4
      // 255: swap
      // 256: aastore
      // 257: dup_x1
      // 258: swap
      // 259: bipush 3
      // 25a: swap
      // 25b: aastore
      // 25c: dup_x1
      // 25d: swap
      // 25e: bipush 2
      // 25f: swap
      // 260: aastore
      // 261: dup_x2
      // 262: dup_x2
      // 263: pop
      // 264: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 267: bipush 1
      // 268: swap
      // 269: aastore
      // 26a: dup_x1
      // 26b: swap
      // 26c: bipush 0
      // 26d: swap
      // 26e: aastore
      // 26f: ldc2_w -9186823117032885893
      // 272: lload 2
      // 273: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: aload 7
      // 27a: lload 14
      // 27c: bipush 1
      // 27d: anewarray 223
      // 280: dup_x2
      // 281: dup_x2
      // 282: pop
      // 283: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 286: bipush 0
      // 287: swap
      // 288: aastore
      // 289: ldc2_w -9163495291123284713
      // 28c: lload 2
      // 28d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: astore 35
      // 294: bipush 0
      // 295: istore 36
      // 297: iload 36
      // 299: aload 35
      // 29b: arraylength
      // 29c: if_icmpge 4cf
      // 29f: aload 35
      // 2a1: iload 36
      // 2a3: aaload
      // 2a4: astore 37
      // 2a6: aload 37
      // 2a8: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 2ab: astore 38
      // 2ad: aload 38
      // 2af: aload 31
      // 2b1: lload 2
      // 2b2: lconst_0
      // 2b3: lcmp
      // 2b4: ifle 2db
      // 2b7: ifnonnull 2cc
      // 2ba: ifnull 2ff
      // 2bd: goto 2ca
      // 2c0: ldc2_w -8905118788878370675
      // 2c3: lload 2
      // 2c4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: athrow
      // 2ca: aload 38
      // 2cc: lload 18
      // 2ce: bipush 1
      // 2cf: anewarray 223
      // 2d2: dup_x2
      // 2d3: dup_x2
      // 2d4: pop
      // 2d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d8: bipush 0
      // 2d9: swap
      // 2da: aastore
      // 2db: ldc2_w -7234571398606876222
      // 2de: lload 2
      // 2df: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: aload 31
      // 2e6: lload 2
      // 2e7: lconst_0
      // 2e8: lcmp
      // 2e9: iflt 31b
      // 2ec: ifnonnull 319
      // 2ef: ifne 4c7
      // 2f2: goto 2ff
      // 2f5: ldc2_w -8905118788878370675
      // 2f8: lload 2
      // 2f9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fe: athrow
      // 2ff: aload 5
      // 301: aload 37
      // 303: ldc2_w -8892910603574282707
      // 306: lload 2
      // 307: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30c: goto 319
      // 30f: ldc2_w -8905118788878370675
      // 312: lload 2
      // 313: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 318: athrow
      // 319: aload 31
      // 31b: ifnonnull 342
      // 31e: ifne 4c7
      // 321: goto 32e
      // 324: ldc2_w -8905118788878370675
      // 327: lload 2
      // 328: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: athrow
      // 32e: aload 5
      // 330: aload 37
      // 332: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 335: goto 342
      // 338: ldc2_w -8905118788878370675
      // 33b: lload 2
      // 33c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: pop
      // 343: new java/lang/StringBuilder
      // 346: dup
      // 347: invokespecial java/lang/StringBuilder.<init> ()V
      // 34a: sipush 23573
      // 34d: ldc2_w 5098905303806147271
      // 350: lload 2
      // 351: lxor
      // 352: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35a: aload 7
      // 35c: lload 12
      // 35e: bipush 1
      // 35f: anewarray 223
      // 362: dup_x2
      // 363: dup_x2
      // 364: pop
      // 365: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 368: bipush 0
      // 369: swap
      // 36a: aastore
      // 36b: ldc2_w -7320398864171036990
      // 36e: lload 2
      // 36f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 374: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 377: sipush 18238
      // 37a: ldc2_w 584562340617282026
      // 37d: lload 2
      // 37e: lxor
      // 37f: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 387: aload 7
      // 389: lload 20
      // 38b: ldc2_w -9171227375414803525
      // 38e: lload 2
      // 38f: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 397: ldc "'"
      // 399: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 39f: astore 39
      // 3a1: aload 0
      // 3a2: aload 37
      // 3a4: lload 8
      // 3a6: aload 39
      // 3a8: bipush 3
      // 3a9: anewarray 223
      // 3ac: dup_x1
      // 3ad: swap
      // 3ae: bipush 2
      // 3af: swap
      // 3b0: aastore
      // 3b1: dup_x2
      // 3b2: dup_x2
      // 3b3: pop
      // 3b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b7: bipush 1
      // 3b8: swap
      // 3b9: aastore
      // 3ba: dup_x1
      // 3bb: swap
      // 3bc: bipush 0
      // 3bd: swap
      // 3be: aastore
      // 3bf: ldc2_w -8719088889344577361
      // 3c2: lload 2
      // 3c3: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c8: astore 40
      // 3ca: aconst_null
      // 3cb: astore 41
      // 3cd: aload 7
      // 3cf: invokevirtual com/zelix/hz.b ()Z
      // 3d2: ifeq 3f2
      // 3d5: lload 16
      // 3d7: bipush 1
      // 3d8: anewarray 223
      // 3db: dup_x2
      // 3dc: dup_x2
      // 3dd: pop
      // 3de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e1: bipush 0
      // 3e2: swap
      // 3e3: aastore
      // 3e4: ldc2_w -7491514497777528380
      // 3e7: lload 2
      // 3e8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ed: astore 41
      // 3ef: goto 3f6
      // 3f2: aload 6
      // 3f4: astore 41
      // 3f6: aload 0
      // 3f7: aload 40
      // 3f9: aload 41
      // 3fb: aload 4
      // 3fd: lload 29
      // 3ff: bipush 4
      // 400: anewarray 223
      // 403: dup_x2
      // 404: dup_x2
      // 405: pop
      // 406: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 409: bipush 3
      // 40a: swap
      // 40b: aastore
      // 40c: dup_x1
      // 40d: swap
      // 40e: bipush 2
      // 40f: swap
      // 410: aastore
      // 411: dup_x1
      // 412: swap
      // 413: bipush 1
      // 414: swap
      // 415: aastore
      // 416: dup_x1
      // 417: swap
      // 418: bipush 0
      // 419: swap
      // 41a: aastore
      // 41b: ldc2_w -7303937141931510427
      // 41e: lload 2
      // 41f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 424: aload 0
      // 425: aload 40
      // 427: lload 27
      // 429: aload 41
      // 42b: aload 5
      // 42d: aload 4
      // 42f: bipush 5
      // 430: anewarray 223
      // 433: dup_x1
      // 434: swap
      // 435: bipush 4
      // 436: swap
      // 437: aastore
      // 438: dup_x1
      // 439: swap
      // 43a: bipush 3
      // 43b: swap
      // 43c: aastore
      // 43d: dup_x1
      // 43e: swap
      // 43f: bipush 2
      // 440: swap
      // 441: aastore
      // 442: dup_x2
      // 443: dup_x2
      // 444: pop
      // 445: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 448: bipush 1
      // 449: swap
      // 44a: aastore
      // 44b: dup_x1
      // 44c: swap
      // 44d: bipush 0
      // 44e: swap
      // 44f: aastore
      // 450: ldc2_w -9186823117032885893
      // 453: lload 2
      // 454: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: aload 31
      // 45b: lload 2
      // 45c: lconst_0
      // 45d: lcmp
      // 45e: ifle 4cc
      // 461: ifnonnull 4ca
      // 464: aload 7
      // 466: invokevirtual com/zelix/hz.b ()Z
      // 469: ifeq 4c7
      // 46c: goto 479
      // 46f: ldc2_w -8905118788878370675
      // 472: lload 2
      // 473: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 478: athrow
      // 479: aload 6
      // 47b: aload 41
      // 47d: ldc2_w -8762956253071622709
      // 480: lload 2
      // 481: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 486: pop
      // 487: aload 0
      // 488: lload 22
      // 48a: aload 7
      // 48c: checkcast com/zelix/hy
      // 48f: aload 41
      // 491: ldc2_w -8789240829703734963
      // 494: lload 2
      // 495: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49a: bipush 3
      // 49b: anewarray 223
      // 49e: dup_x1
      // 49f: swap
      // 4a0: bipush 2
      // 4a1: swap
      // 4a2: aastore
      // 4a3: dup_x1
      // 4a4: swap
      // 4a5: bipush 1
      // 4a6: swap
      // 4a7: aastore
      // 4a8: dup_x2
      // 4a9: dup_x2
      // 4aa: pop
      // 4ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4ae: bipush 0
      // 4af: swap
      // 4b0: aastore
      // 4b1: ldc2_w -7225121566888338095
      // 4b4: lload 2
      // 4b5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ba: goto 4c7
      // 4bd: ldc2_w -8905118788878370675
      // 4c0: lload 2
      // 4c1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c6: athrow
      // 4c7: iinc 36 1
      // 4ca: aload 31
      // 4cc: ifnull 297
      // 4cf: return
   }

   Set w(Object[] var1) {
      long var3 = (Long)var1[0];
      ig var2 = (ig)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 46283259434164L;
      long var7 = var3 ^ 130006412745802L;
      hk[] var10000 = x44.a<"s">(6426368541708567863L, var3);
      Map var10 = x44.a<"o">(this, 4724361204004520608L, var3).D(var2);
      hk[] var9 = var10000;

      try {
         if (var9 != null) {
            return x44.a<"s">(new Object[]{var10.keySet(), var5}, 6522669725610356958L, var3);
         }

         if (var10 == null) {
            return x44.a<"s">(new Object[]{var7}, 6651442802117367170L, var3);
         }
      } catch (gj var11) {
         throw x44.a<"s">(var11, 4624292029843619019L, var3);
      }

      return x44.a<"s">(new Object[]{var10.keySet(), var5}, 6522669725610356958L, var3);
   }

   private void J(Object[] param1) {
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
      // 004: checkcast com/zelix/hu
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/HashSet
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_y4
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 3
      // 022: pop
      // 023: getstatic com/zelix/_f3.a J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 135166284656400
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 11577793242177
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 59327670155674
      // 03c: lxor
      // 03d: lstore 11
      // 03f: dup2
      // 040: ldc2_w 13003145807698
      // 043: lxor
      // 044: lstore 13
      // 046: dup2
      // 047: ldc2_w 50975164194633
      // 04a: lxor
      // 04b: lstore 15
      // 04d: dup2
      // 04e: ldc2_w 95562911261545
      // 051: lxor
      // 052: lstore 17
      // 054: dup2
      // 055: ldc2_w 44122065528653
      // 058: lxor
      // 059: lstore 19
      // 05b: pop2
      // 05c: ldc2_w 6340788901607820263
      // 05f: lload 3
      // 060: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: aload 6
      // 067: aload 2
      // 068: lload 9
      // 06a: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 06d: astore 22
      // 06f: astore 21
      // 071: aload 21
      // 073: ifnonnull 1aa
      // 076: aload 22
      // 078: ifnonnull 19c
      // 07b: goto 088
      // 07e: ldc2_w 5691640439877513755
      // 081: lload 3
      // 082: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: new java/util/Vector
      // 08b: dup
      // 08c: invokespecial java/util/Vector.<init> ()V
      // 08f: astore 22
      // 091: aload 2
      // 092: lload 11
      // 094: bipush 1
      // 095: anewarray 223
      // 098: dup_x2
      // 099: dup_x2
      // 09a: pop
      // 09b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09e: bipush 0
      // 09f: swap
      // 0a0: aastore
      // 0a1: ldc2_w 5958759007248486989
      // 0a4: lload 3
      // 0a5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: astore 23
      // 0ac: bipush 0
      // 0ad: istore 24
      // 0af: iload 24
      // 0b1: aload 23
      // 0b3: arraylength
      // 0b4: if_icmpge 16e
      // 0b7: aload 23
      // 0b9: iload 24
      // 0bb: aaload
      // 0bc: astore 25
      // 0be: aload 21
      // 0c0: lload 3
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: iflt 16b
      // 0c6: ifnonnull 169
      // 0c9: aload 25
      // 0cb: lload 13
      // 0cd: invokevirtual com/zelix/in.n (J)Z
      // 0d0: aload 21
      // 0d2: ifnonnull 1a9
      // 0d5: goto 0e2
      // 0d8: ldc2_w 5691640439877513755
      // 0db: lload 3
      // 0dc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: ifne 166
      // 0e5: goto 0f2
      // 0e8: ldc2_w 5691640439877513755
      // 0eb: lload 3
      // 0ec: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 25
      // 0f4: lload 19
      // 0f6: invokevirtual com/zelix/in.C (J)Z
      // 0f9: aload 21
      // 0fb: lload 3
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: iflt 137
      // 101: ifnonnull 135
      // 104: goto 111
      // 107: ldc2_w 5691640439877513755
      // 10a: lload 3
      // 10b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: ifne 166
      // 114: goto 121
      // 117: ldc2_w 5691640439877513755
      // 11a: lload 3
      // 11b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 25
      // 123: lload 15
      // 125: invokevirtual com/zelix/in.Q (J)Z
      // 128: goto 135
      // 12b: ldc2_w 5691640439877513755
      // 12e: lload 3
      // 12f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: aload 21
      // 137: ifnonnull 165
      // 13a: ifne 166
      // 13d: goto 14a
      // 140: ldc2_w 5691640439877513755
      // 143: lload 3
      // 144: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 22
      // 14c: aload 25
      // 14e: lload 17
      // 150: invokevirtual com/zelix/in.G (J)Lcom/zelix/_fz;
      // 153: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 158: goto 165
      // 15b: ldc2_w 5691640439877513755
      // 15e: lload 3
      // 15f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: pop
      // 166: iinc 24 1
      // 169: aload 21
      // 16b: ifnull 0af
      // 16e: lload 3
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 1aa
      // 174: aload 6
      // 176: aload 2
      // 177: aload 22
      // 179: lload 7
      // 17b: bipush 3
      // 17c: anewarray 223
      // 17f: dup_x2
      // 180: dup_x2
      // 181: pop
      // 182: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 185: bipush 2
      // 186: swap
      // 187: aastore
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 1
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w 6154515482841065298
      // 195: lload 3
      // 196: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: pop
      // 19c: aload 5
      // 19e: aload 22
      // 1a0: ldc2_w 5545572440689243997
      // 1a3: lload 3
      // 1a4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: pop
      // 1aa: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   _f3(pk var1, int var2, int var3, pd var4, qx var5, byte var6) {
      long var7 = ((long)var2 << 32 | (long)var3 << 40 >>> 32 | (long)var6 << 56 >>> 56) ^ a;
      long var9 = var7 ^ 64688056131082L;
      long var11 = var7 ^ 74598208537828L;
      long var13 = var7 ^ 119796758365856L;
      long var10001 = var7 ^ 32196873920611L;
      int var15 = (int)((var7 ^ 32196873920611L) >>> 32);
      int var16 = (int)((var7 ^ 32196873920611L) << 32 >>> 56);
      int var17 = (int)(var10001 << 40 >>> 40);
      long var18 = var7 ^ 100611969598764L;
      long var20 = var7 ^ 80240321840207L;
      super();
      hk[] var10000 = x44.a<"u">(108431389304331673L, var7);
      x44.a<"v">(this, x44.a<"u">(new Object[]{var11}, 351454601645165868L, var7), 1888505467086443940L, var7);
      hk[] var22 = var10000;
      x44.a<"v">(this, new _8z(var18), 1819023920559806990L, var7);
      x44.a<"v">(this, new _8z(var18), 2051749327019233782L, var7);
      x44.a<"v">(this, var1, 164830021643280594L, var7);
      x44.a<"v">(this, var5, 543421092736046496L, var7);
      _y4 var23 = new _y4(var20);
      List var24 = x44.a<"m">(var4, new Object[]{var9}, 2106300336609870363L, var7);
      int var25 = 0;

      label80: {
         label79:
         while (true) {
            if (var25 < var24.size()) {
               yn var26 = (yn)var24.get(var25);
               HashSet var27 = x44.a<"u">(new Object[]{var11}, 351454601645165868L, var7);
               HashSet var28 = x44.a<"u">(new Object[]{var11}, 351454601645165868L, var7);
               var36 = new _8z(var18);
               if (var6 > 0) {
                  break label80;
               }

               _8z var29 = var36;

               do {
                  try {
                     var37 = this;
                     if (var22 != null) {
                        break label79;
                     }

                     Object[] var10009 = new Object[]{null, null, null, null, null, var23, false};
                     var10009[4] = var13;
                     var10009[3] = var27;
                     var10009[2] = var29;
                     var10009[1] = var28;
                     var10009[0] = var26;
                     x44.a<"k">(this, var10009, 1784079604700232700L, var7);
                     var25++;
                     if (var22 == null) {
                        continue label79;
                     }
                  } catch (gj var30) {
                     throw x44.a<"u">(var30, 1766252163241862245L, var7);
                  }
               } while (var3 < 0);
            }

            var37 = this;
            break;
         }

         var36 = x44.a<"i">(var37, 1819023920559806990L, var7);
      }

      Enumeration var31 = x44.a<"m">(var36, new Object[0], 487014467200623428L, var7);

      label62:
      while (true) {
         if (var31.hasMoreElements()) {
            var10000 = (hk[])var31.nextElement();
         } else {
            if (var3 >= 0) {
               return;
            }

            var10000 = (hk[])var31.nextElement();
         }

         label60:
         while (true) {
            ig var32 = (ig)var10000;
            Map var33 = x44.a<"i">(this, 1819023920559806990L, var7).D(var32);
            Iterator var34 = var33.keySet().iterator();

            label56:
            while (true) {
               if (var34.hasNext()) {
                  var10000 = (hk[])var34.next();
               } else {
                  var10000 = var22;
                  if (var6 <= 0) {
                     break;
                  }
               }

               while (true) {
                  ig var35 = (ig)var10000;
                  x44.a<"i">(this, 2051749327019233782L, var7).s(var35, var32, var32, var15, (byte)var16, var17);
                  if (var22 != null) {
                     continue label62;
                  }

                  var10000 = var22;
                  if (var6 >= 0) {
                     continue label60;
                  }

                  if (var22 == null) {
                     break;
                  }

                  var10000 = var22;
                  if (var6 <= 0) {
                     break label56;
                  }
               }
            }

            if (var10000 == null) {
               break;
            }

            if (var3 >= 0) {
               return;
            }

            var10000 = (hk[])var31.nextElement();
         }
      }
   }

   private hu P(Object[] var1) {
      String var5 = (String)var1[0];
      long var2 = (Long)var1[1];
      String var4 = (String)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 71348379286061L;
      long var8 = var2 ^ 108088216507156L;

      try {
         qx var10000 = x44.a<"k">(this, -4843437662870491422L, var2);
         Object[] var10006 = new Object[]{null, var5, true, var4};
         var10006[0] = var6;
         return x44.a<"o">(var10000, var10006, -4888712480067968128L, var2);
      } catch (_sz var11) {
         throw new _sq(
            a<"l">(29397, 3118343694218158L ^ var2)
               + sh.b(x44.a<"o">(var11, new Object[]{var8}, -6853456582414456657L, var2))
               + a<"l">(32141, 4962906818230942974L ^ var2)
               + var4
               + a<"l">(12245, 5725445407257833127L ^ var2)
         );
      } catch (_s8 var12) {
         throw new _sq(x44.a<"o">(var12, -5102790244847431808L, var2));
      }
   }

   private void O(Object[] param1) {
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
      // 00e: checkcast com/zelix/hy
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Iterator
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/_f3.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 82013883349536
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 76912840557596
      // 02e: lxor
      // 02f: dup2
      // 030: bipush 48
      // 032: lushr
      // 033: l2i
      // 034: istore 8
      // 036: dup2
      // 037: bipush 16
      // 039: lshl
      // 03a: bipush 32
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 9
      // 040: dup2
      // 041: bipush 48
      // 043: lshl
      // 044: bipush 48
      // 046: lushr
      // 047: l2i
      // 048: istore 10
      // 04a: pop2
      // 04b: dup2
      // 04c: ldc2_w 35750313527427
      // 04f: lxor
      // 050: lstore 11
      // 052: dup2
      // 053: ldc2_w 70996639031598
      // 056: lxor
      // 057: lstore 13
      // 059: dup2
      // 05a: ldc2_w 81318913885941
      // 05d: lxor
      // 05e: lstore 15
      // 060: dup2
      // 061: ldc2_w 135933371282750
      // 064: lxor
      // 065: lstore 17
      // 067: pop2
      // 068: ldc2_w -6802269177215304319
      // 06b: lload 2
      // 06c: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: astore 19
      // 073: aload 4
      // 075: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07a: ifeq 203
      // 07d: aload 4
      // 07f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 084: checkcast com/zelix/_fz
      // 087: astore 20
      // 089: aload 0
      // 08a: ldc2_w -6750370313376333622
      // 08d: lload 2
      // 08e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 20
      // 095: lload 13
      // 097: aload 5
      // 099: bipush 3
      // 09a: anewarray 223
      // 09d: dup_x1
      // 09e: swap
      // 09f: bipush 2
      // 0a0: swap
      // 0a1: aastore
      // 0a2: dup_x2
      // 0a3: dup_x2
      // 0a4: pop
      // 0a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w -4953895912905110133
      // 0b3: lload 2
      // 0b4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: ifne 1f8
      // 0bc: aload 5
      // 0be: lload 6
      // 0c0: invokevirtual com/zelix/hy.k (J)Ljava/lang/String;
      // 0c3: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 0c6: astore 21
      // 0c8: aload 21
      // 0ca: ldc2_w -6811982773192574979
      // 0cd: lload 2
      // 0ce: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/yn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: astore 22
      // 0d5: aload 22
      // 0d7: lload 17
      // 0d9: bipush 1
      // 0da: anewarray 223
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 0
      // 0e4: swap
      // 0e5: aastore
      // 0e6: ldc2_w -6383374170740216526
      // 0e9: lload 2
      // 0ea: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: ifeq 1f8
      // 0f2: aload 22
      // 0f4: iload 8
      // 0f6: i2s
      // 0f7: iload 9
      // 0f9: iload 10
      // 0fb: i2s
      // 0fc: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 0ff: astore 23
      // 101: aload 19
      // 103: lload 2
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 1f5
      // 109: ifnonnull 1f3
      // 10c: aload 0
      // 10d: ldc2_w -6750370313376333622
      // 110: lload 2
      // 111: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: aload 20
      // 118: lload 13
      // 11a: aload 23
      // 11c: bipush 3
      // 11d: anewarray 223
      // 120: dup_x1
      // 121: swap
      // 122: bipush 2
      // 123: swap
      // 124: aastore
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 1
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: ldc2_w -4953895912905110133
      // 136: lload 2
      // 137: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: aload 19
      // 13e: ifnonnull 07a
      // 141: lload 2
      // 142: lconst_0
      // 143: lcmp
      // 144: iflt 0b9
      // 147: goto 154
      // 14a: ldc2_w -5144596201692642179
      // 14d: lload 2
      // 14e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: ifeq 1e6
      // 157: aload 0
      // 158: ldc2_w -6750370313376333622
      // 15b: lload 2
      // 15c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: lload 15
      // 163: aload 23
      // 165: aload 20
      // 167: bipush 3
      // 168: anewarray 223
      // 16b: dup_x1
      // 16c: swap
      // 16d: bipush 2
      // 16e: swap
      // 16f: aastore
      // 170: dup_x1
      // 171: swap
      // 172: bipush 1
      // 173: swap
      // 174: aastore
      // 175: dup_x2
      // 176: dup_x2
      // 177: pop
      // 178: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17b: bipush 0
      // 17c: swap
      // 17d: aastore
      // 17e: ldc2_w -6504846109159631813
      // 181: lload 2
      // 182: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: astore 24
      // 189: lload 2
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: iflt 1db
      // 18f: aload 24
      // 191: lload 11
      // 193: bipush 1
      // 194: anewarray 223
      // 197: dup_x2
      // 198: dup_x2
      // 199: pop
      // 19a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19d: bipush 0
      // 19e: swap
      // 19f: aastore
      // 1a0: ldc2_w -6487602563924714232
      // 1a3: lload 2
      // 1a4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: aload 19
      // 1ab: ifnonnull 1da
      // 1ae: ifne 1f8
      // 1b1: goto 1be
      // 1b4: ldc2_w -5144596201692642179
      // 1b7: lload 2
      // 1b8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: ldc2_w -5031342907310688836
      // 1c2: lload 2
      // 1c3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: aload 24
      // 1ca: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 1cd: goto 1da
      // 1d0: ldc2_w -5144596201692642179
      // 1d3: lload 2
      // 1d4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: pop
      // 1db: aload 19
      // 1dd: lload 2
      // 1de: lconst_0
      // 1df: lcmp
      // 1e0: iflt 200
      // 1e3: ifnull 1f8
      // 1e6: aload 22
      // 1e8: ldc2_w -6811982773192574979
      // 1eb: lload 2
      // 1ec: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/yn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: astore 22
      // 1f3: aload 19
      // 1f5: ifnull 0d5
      // 1f8: aload 19
      // 1fa: lload 2
      // 1fb: lconst_0
      // 1fc: lcmp
      // 1fd: ifle 084
      // 200: ifnull 073
      // 203: lload 2
      // 204: lconst_0
      // 205: lcmp
      // 206: iflt 07d
      // 209: return
   }

   private void f(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 9
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/HashSet
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_8z
      // 017: astore 3
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/util/HashSet
      // 01e: astore 8
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/lang/Long
      // 026: invokevirtual java/lang/Long.longValue ()J
      // 029: lstore 4
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_y4
      // 031: astore 2
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/lang/Boolean
      // 039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c: istore 7
      // 03e: pop
      // 03f: getstatic com/zelix/_f3.a J
      // 042: lload 4
      // 044: lxor
      // 045: lstore 4
      // 047: lload 4
      // 049: dup2
      // 04a: ldc2_w 21798215076905
      // 04d: lxor
      // 04e: lstore 10
      // 050: dup2
      // 051: ldc2_w 76223270040990
      // 054: lxor
      // 055: lstore 12
      // 057: dup2
      // 058: ldc2_w 137517403680204
      // 05b: lxor
      // 05c: lstore 14
      // 05e: dup2
      // 05f: ldc2_w 88083640261267
      // 062: lxor
      // 063: lstore 16
      // 065: dup2
      // 066: ldc2_w 63414333266504
      // 069: lxor
      // 06a: lstore 18
      // 06c: dup2
      // 06d: ldc2_w 130443071094966
      // 070: lxor
      // 071: dup2
      // 072: bipush 48
      // 074: lushr
      // 075: l2i
      // 076: istore 20
      // 078: dup2
      // 079: bipush 16
      // 07b: lshl
      // 07c: bipush 32
      // 07e: lushr
      // 07f: l2i
      // 080: istore 21
      // 082: dup2
      // 083: bipush 48
      // 085: lshl
      // 086: bipush 48
      // 088: lushr
      // 089: l2i
      // 08a: istore 22
      // 08c: pop2
      // 08d: dup2
      // 08e: ldc2_w 74928286068329
      // 091: lxor
      // 092: lstore 23
      // 094: dup2
      // 095: ldc2_w 6157146811512
      // 098: lxor
      // 099: lstore 25
      // 09b: dup2
      // 09c: ldc2_w 111545288762520
      // 09f: lxor
      // 0a0: lstore 27
      // 0a2: dup2
      // 0a3: ldc2_w 127280266601860
      // 0a6: lxor
      // 0a7: lstore 29
      // 0a9: dup2
      // 0aa: ldc2_w 134849198883423
      // 0ad: lxor
      // 0ae: lstore 31
      // 0b0: dup2
      // 0b1: ldc2_w 658092801378
      // 0b4: lxor
      // 0b5: lstore 33
      // 0b7: dup2
      // 0b8: ldc2_w 80204121649556
      // 0bb: lxor
      // 0bc: lstore 35
      // 0be: dup2
      // 0bf: ldc2_w 118643737871569
      // 0c2: lxor
      // 0c3: dup2
      // 0c4: bipush 32
      // 0c6: lushr
      // 0c7: l2i
      // 0c8: istore 37
      // 0ca: dup2
      // 0cb: bipush 32
      // 0cd: lshl
      // 0ce: bipush 56
      // 0d0: lushr
      // 0d1: l2i
      // 0d2: istore 38
      // 0d4: dup2
      // 0d5: bipush 40
      // 0d7: lshl
      // 0d8: bipush 40
      // 0da: lushr
      // 0db: l2i
      // 0dc: istore 39
      // 0de: pop2
      // 0df: dup2
      // 0e0: ldc2_w 28981732057618
      // 0e3: lxor
      // 0e4: lstore 40
      // 0e6: dup2
      // 0e7: ldc2_w 45128760223416
      // 0ea: lxor
      // 0eb: lstore 42
      // 0ed: dup2
      // 0ee: ldc2_w 106498269244805
      // 0f1: lxor
      // 0f2: lstore 44
      // 0f4: dup2
      // 0f5: ldc2_w 26840901947813
      // 0f8: lxor
      // 0f9: lstore 46
      // 0fb: dup2
      // 0fc: ldc2_w 112839042192769
      // 0ff: lxor
      // 100: lstore 48
      // 102: pop2
      // 103: aload 9
      // 105: iload 20
      // 107: i2s
      // 108: iload 21
      // 10a: iload 22
      // 10c: i2s
      // 10d: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 110: astore 51
      // 112: ldc2_w 7292259536836950315
      // 115: lload 4
      // 117: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: aload 0
      // 11d: aload 51
      // 11f: lload 18
      // 121: aload 6
      // 123: aload 8
      // 125: aload 2
      // 126: bipush 5
      // 127: anewarray 223
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 4
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 3
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 2
      // 137: swap
      // 138: aastore
      // 139: dup_x2
      // 13a: dup_x2
      // 13b: pop
      // 13c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13f: bipush 1
      // 140: swap
      // 141: aastore
      // 142: dup_x1
      // 143: swap
      // 144: bipush 0
      // 145: swap
      // 146: aastore
      // 147: ldc2_w 8708830263078979873
      // 14a: lload 4
      // 14c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: astore 50
      // 153: iload 7
      // 155: ifeq 37a
      // 158: aload 3
      // 159: bipush 0
      // 15a: anewarray 223
      // 15d: ldc2_w 7093257083375208438
      // 160: lload 4
      // 162: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: astore 52
      // 169: aload 52
      // 16b: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 170: ifeq 341
      // 173: aload 52
      // 175: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 17a: checkcast com/zelix/_fz
      // 17d: astore 53
      // 17f: aload 0
      // 180: aload 50
      // 182: lload 4
      // 184: lconst_0
      // 185: lcmp
      // 186: ifle 370
      // 189: ifnonnull 349
      // 18c: ldc2_w 7420787214310458464
      // 18f: lload 4
      // 191: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: aload 53
      // 198: lload 29
      // 19a: aload 51
      // 19c: bipush 3
      // 19d: anewarray 223
      // 1a0: dup_x1
      // 1a1: swap
      // 1a2: bipush 2
      // 1a3: swap
      // 1a4: aastore
      // 1a5: dup_x2
      // 1a6: dup_x2
      // 1a7: pop
      // 1a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ab: bipush 1
      // 1ac: swap
      // 1ad: aastore
      // 1ae: dup_x1
      // 1af: swap
      // 1b0: bipush 0
      // 1b1: swap
      // 1b2: aastore
      // 1b3: ldc2_w 9217191383753345313
      // 1b6: lload 4
      // 1b8: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: ifne 33c
      // 1c0: goto 1ce
      // 1c3: ldc2_w 8948804551006847191
      // 1c6: lload 4
      // 1c8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 9
      // 1d0: ldc2_w 7339964224705557335
      // 1d3: lload 4
      // 1d5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/yn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: astore 54
      // 1dc: aload 54
      // 1de: lload 35
      // 1e0: bipush 1
      // 1e1: anewarray 223
      // 1e4: dup_x2
      // 1e5: dup_x2
      // 1e6: pop
      // 1e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ea: bipush 0
      // 1eb: swap
      // 1ec: aastore
      // 1ed: ldc2_w 7188730527048853912
      // 1f0: lload 4
      // 1f2: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: ifeq 33c
      // 1fa: aload 54
      // 1fc: iload 20
      // 1fe: i2s
      // 1ff: iload 21
      // 201: iload 22
      // 203: i2s
      // 204: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 207: astore 55
      // 209: aload 50
      // 20b: lload 4
      // 20d: lconst_0
      // 20e: lcmp
      // 20f: ifle 339
      // 212: ifnonnull 337
      // 215: aload 0
      // 216: ldc2_w 7420787214310458464
      // 219: lload 4
      // 21b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: aload 53
      // 222: lload 29
      // 224: aload 55
      // 226: bipush 3
      // 227: anewarray 223
      // 22a: dup_x1
      // 22b: swap
      // 22c: bipush 2
      // 22d: swap
      // 22e: aastore
      // 22f: dup_x2
      // 230: dup_x2
      // 231: pop
      // 232: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 235: bipush 1
      // 236: swap
      // 237: aastore
      // 238: dup_x1
      // 239: swap
      // 23a: bipush 0
      // 23b: swap
      // 23c: aastore
      // 23d: ldc2_w 9217191383753345313
      // 240: lload 4
      // 242: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: aload 50
      // 249: ifnonnull 170
      // 24c: lload 4
      // 24e: lconst_0
      // 24f: lcmp
      // 250: ifle 1bd
      // 253: goto 261
      // 256: ldc2_w 8948804551006847191
      // 259: lload 4
      // 25b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: athrow
      // 261: ifeq 329
      // 264: aload 0
      // 265: ldc2_w 7420787214310458464
      // 268: lload 4
      // 26a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: lload 31
      // 271: aload 55
      // 273: aload 53
      // 275: bipush 3
      // 276: anewarray 223
      // 279: dup_x1
      // 27a: swap
      // 27b: bipush 2
      // 27c: swap
      // 27d: aastore
      // 27e: dup_x1
      // 27f: swap
      // 280: bipush 1
      // 281: swap
      // 282: aastore
      // 283: dup_x2
      // 284: dup_x2
      // 285: pop
      // 286: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 289: bipush 0
      // 28a: swap
      // 28b: aastore
      // 28c: ldc2_w 6994116321933103249
      // 28f: lload 4
      // 291: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: astore 56
      // 298: aload 56
      // 29a: lload 10
      // 29c: bipush 1
      // 29d: anewarray 223
      // 2a0: dup_x2
      // 2a1: dup_x2
      // 2a2: pop
      // 2a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a6: bipush 0
      // 2a7: swap
      // 2a8: aastore
      // 2a9: ldc2_w 7015856736720017826
      // 2ac: lload 4
      // 2ae: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: ifne 33c
      // 2b6: aload 3
      // 2b7: aload 53
      // 2b9: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 2bc: astore 57
      // 2be: aload 57
      // 2c0: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 2c5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2ca: astore 58
      // 2cc: aload 58
      // 2ce: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d3: ifeq 324
      // 2d6: aload 58
      // 2d8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2dd: checkcast com/zelix/ig
      // 2e0: astore 59
      // 2e2: aload 0
      // 2e3: ldc2_w 9046621358049836732
      // 2e6: lload 4
      // 2e8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: aload 56
      // 2ef: aload 59
      // 2f1: aload 59
      // 2f3: iload 37
      // 2f5: iload 38
      // 2f7: i2b
      // 2f8: iload 39
      // 2fa: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 2fd: pop
      // 2fe: aload 50
      // 300: lload 4
      // 302: lconst_0
      // 303: lcmp
      // 304: iflt 33e
      // 307: ifnonnull 33c
      // 30a: aload 50
      // 30c: ifnull 2cc
      // 30f: lload 4
      // 311: lconst_0
      // 312: lcmp
      // 313: ifle 2fe
      // 316: goto 324
      // 319: ldc2_w 8948804551006847191
      // 31c: lload 4
      // 31e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: aload 50
      // 326: ifnull 33c
      // 329: aload 54
      // 32b: ldc2_w 7339964224705557335
      // 32e: lload 4
      // 330: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/yn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: astore 54
      // 337: aload 50
      // 339: ifnull 1dc
      // 33c: aload 50
      // 33e: ifnull 169
      // 341: lload 4
      // 343: lconst_0
      // 344: lcmp
      // 345: ifle 173
      // 348: aload 0
      // 349: lload 42
      // 34b: aload 51
      // 34d: aload 6
      // 34f: ldc2_w 9105288883883524375
      // 352: lload 4
      // 354: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 359: bipush 3
      // 35a: anewarray 223
      // 35d: dup_x1
      // 35e: swap
      // 35f: bipush 2
      // 360: swap
      // 361: aastore
      // 362: dup_x1
      // 363: swap
      // 364: bipush 1
      // 365: swap
      // 366: aastore
      // 367: dup_x2
      // 368: dup_x2
      // 369: pop
      // 36a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 36d: bipush 0
      // 36e: swap
      // 36f: aastore
      // 370: ldc2_w 7197057593952281867
      // 373: lload 4
      // 375: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: aload 51
      // 37c: invokevirtual com/zelix/hy.y ()[Lcom/zelix/ig;
      // 37f: astore 52
      // 381: bipush 0
      // 382: istore 53
      // 384: iload 53
      // 386: aload 52
      // 388: arraylength
      // 389: if_icmpge 504
      // 38c: aload 52
      // 38e: iload 53
      // 390: aaload
      // 391: astore 54
      // 393: aload 50
      // 395: lload 4
      // 397: lconst_0
      // 398: lcmp
      // 399: ifle 501
      // 39c: ifnonnull 4ff
      // 39f: aload 54
      // 3a1: lload 12
      // 3a3: invokevirtual com/zelix/ig.n (J)Z
      // 3a6: ifne 4fc
      // 3a9: goto 3b7
      // 3ac: ldc2_w 8948804551006847191
      // 3af: lload 4
      // 3b1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: athrow
      // 3b7: aload 54
      // 3b9: lload 48
      // 3bb: invokevirtual com/zelix/ig.C (J)Z
      // 3be: aload 50
      // 3c0: ifnonnull 40a
      // 3c3: goto 3d1
      // 3c6: ldc2_w 8948804551006847191
      // 3c9: lload 4
      // 3cb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d0: athrow
      // 3d1: ifne 4fc
      // 3d4: goto 3e2
      // 3d7: ldc2_w 8948804551006847191
      // 3da: lload 4
      // 3dc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e1: athrow
      // 3e2: aload 54
      // 3e4: aload 50
      // 3e6: ifnonnull 40f
      // 3e9: goto 3f7
      // 3ec: ldc2_w 8948804551006847191
      // 3ef: lload 4
      // 3f1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f6: athrow
      // 3f7: lload 44
      // 3f9: invokevirtual com/zelix/ig.Q (J)Z
      // 3fc: goto 40a
      // 3ff: ldc2_w 8948804551006847191
      // 402: lload 4
      // 404: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 409: athrow
      // 40a: ifne 4fc
      // 40d: aload 54
      // 40f: lload 46
      // 411: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // 414: astore 55
      // 416: aload 6
      // 418: aload 55
      // 41a: ldc2_w 8992609951716249207
      // 41d: lload 4
      // 41f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 424: aload 50
      // 426: ifnonnull 479
      // 429: ifeq 459
      // 42c: goto 43a
      // 42f: ldc2_w 8948804551006847191
      // 432: lload 4
      // 434: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: athrow
      // 43a: aload 0
      // 43b: ldc2_w 9117298958911172886
      // 43e: lload 4
      // 440: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 445: aload 54
      // 447: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 44a: pop
      // 44b: goto 459
      // 44e: ldc2_w 8948804551006847191
      // 451: lload 4
      // 453: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 458: athrow
      // 459: aload 3
      // 45a: lload 4
      // 45c: lconst_0
      // 45d: lcmp
      // 45e: ifle 4fb
      // 461: aload 55
      // 463: aload 50
      // 465: ifnonnull 4ed
      // 468: invokevirtual com/zelix/_8z.g (Ljava/lang/Object;)Z
      // 46b: goto 479
      // 46e: ldc2_w 8948804551006847191
      // 471: lload 4
      // 473: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 478: athrow
      // 479: ifeq 4ea
      // 47c: aload 3
      // 47d: aload 55
      // 47f: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 482: astore 56
      // 484: aload 56
      // 486: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 48b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 490: astore 57
      // 492: aload 57
      // 494: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 499: ifeq 4ea
      // 49c: aload 57
      // 49e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4a3: checkcast com/zelix/ig
      // 4a6: astore 58
      // 4a8: aload 0
      // 4a9: ldc2_w 9046621358049836732
      // 4ac: lload 4
      // 4ae: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b3: aload 54
      // 4b5: aload 58
      // 4b7: aload 58
      // 4b9: iload 37
      // 4bb: iload 38
      // 4bd: i2b
      // 4be: iload 39
      // 4c0: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 4c3: pop
      // 4c4: aload 50
      // 4c6: lload 4
      // 4c8: lconst_0
      // 4c9: lcmp
      // 4ca: ifle 4d2
      // 4cd: ifnonnull 4ff
      // 4d0: aload 50
      // 4d2: ifnull 492
      // 4d5: lload 4
      // 4d7: lconst_0
      // 4d8: lcmp
      // 4d9: ifle 4c4
      // 4dc: goto 4ea
      // 4df: ldc2_w 8948804551006847191
      // 4e2: lload 4
      // 4e4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e9: athrow
      // 4ea: aload 3
      // 4eb: aload 55
      // 4ed: aload 54
      // 4ef: aload 54
      // 4f1: iload 37
      // 4f3: iload 38
      // 4f5: i2b
      // 4f6: iload 39
      // 4f8: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 4fb: pop
      // 4fc: iinc 53 1
      // 4ff: aload 50
      // 501: ifnull 384
      // 504: aload 9
      // 506: lload 33
      // 508: bipush 1
      // 509: anewarray 223
      // 50c: dup_x2
      // 50d: dup_x2
      // 50e: pop
      // 50f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 512: bipush 0
      // 513: swap
      // 514: aastore
      // 515: ldc2_w 8848317135013980756
      // 518: lload 4
      // 51a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51f: astore 53
      // 521: aload 53
      // 523: aload 50
      // 525: ifnonnull 630
      // 528: ifnull 60e
      // 52b: goto 539
      // 52e: ldc2_w 8948804551006847191
      // 531: lload 4
      // 533: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 538: athrow
      // 539: aload 53
      // 53b: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 540: ifeq 60e
      // 543: goto 551
      // 546: ldc2_w 8948804551006847191
      // 549: lload 4
      // 54b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 550: athrow
      // 551: aload 53
      // 553: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 558: checkcast com/zelix/yn
      // 55b: aload 50
      // 55d: lload 4
      // 55f: lconst_0
      // 560: lcmp
      // 561: iflt 626
      // 564: ifnonnull 617
      // 567: astore 54
      // 569: aload 0
      // 56a: aload 54
      // 56c: lload 16
      // 56e: aload 6
      // 570: bipush 2
      // 571: anewarray 223
      // 574: dup_x1
      // 575: swap
      // 576: bipush 1
      // 577: swap
      // 578: aastore
      // 579: dup_x2
      // 57a: dup_x2
      // 57b: pop
      // 57c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57f: bipush 0
      // 580: swap
      // 581: aastore
      // 582: ldc2_w 8708262861300750264
      // 585: lload 4
      // 587: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58c: aload 3
      // 58d: lload 14
      // 58f: bipush 2
      // 590: anewarray 223
      // 593: dup_x2
      // 594: dup_x2
      // 595: pop
      // 596: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 599: bipush 1
      // 59a: swap
      // 59b: aastore
      // 59c: dup_x1
      // 59d: swap
      // 59e: bipush 0
      // 59f: swap
      // 5a0: aastore
      // 5a1: ldc2_w 7203078831212142388
      // 5a4: lload 4
      // 5a6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ab: lload 16
      // 5ad: aload 8
      // 5af: bipush 2
      // 5b0: anewarray 223
      // 5b3: dup_x1
      // 5b4: swap
      // 5b5: bipush 1
      // 5b6: swap
      // 5b7: aastore
      // 5b8: dup_x2
      // 5b9: dup_x2
      // 5ba: pop
      // 5bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5be: bipush 0
      // 5bf: swap
      // 5c0: aastore
      // 5c1: ldc2_w 8708262861300750264
      // 5c4: lload 4
      // 5c6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: lload 40
      // 5cd: aload 2
      // 5ce: bipush 0
      // 5cf: bipush 7
      // 5d1: anewarray 223
      // 5d4: dup_x1
      // 5d5: swap
      // 5d6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5d9: bipush 6
      // 5db: swap
      // 5dc: aastore
      // 5dd: dup_x1
      // 5de: swap
      // 5df: bipush 5
      // 5e0: swap
      // 5e1: aastore
      // 5e2: dup_x2
      // 5e3: dup_x2
      // 5e4: pop
      // 5e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e8: bipush 4
      // 5e9: swap
      // 5ea: aastore
      // 5eb: dup_x1
      // 5ec: swap
      // 5ed: bipush 3
      // 5ee: swap
      // 5ef: aastore
      // 5f0: dup_x1
      // 5f1: swap
      // 5f2: bipush 2
      // 5f3: swap
      // 5f4: aastore
      // 5f5: dup_x1
      // 5f6: swap
      // 5f7: bipush 1
      // 5f8: swap
      // 5f9: aastore
      // 5fa: dup_x1
      // 5fb: swap
      // 5fc: bipush 0
      // 5fd: swap
      // 5fe: aastore
      // 5ff: ldc2_w 8966706841015770958
      // 602: lload 4
      // 604: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 609: aload 50
      // 60b: ifnull 539
      // 60e: lload 4
      // 610: lconst_0
      // 611: lcmp
      // 612: iflt 551
      // 615: aload 9
      // 617: lload 23
      // 619: bipush 1
      // 61a: anewarray 223
      // 61d: dup_x2
      // 61e: dup_x2
      // 61f: pop
      // 620: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 623: bipush 0
      // 624: swap
      // 625: aastore
      // 626: ldc2_w 8728374382902049998
      // 629: lload 4
      // 62b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 630: astore 54
      // 632: aload 54
      // 634: aload 50
      // 636: ifnonnull 64c
      // 639: ifnull 852
      // 63c: goto 64a
      // 63f: ldc2_w 8948804551006847191
      // 642: lload 4
      // 644: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 649: athrow
      // 64a: aload 54
      // 64c: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 651: ifeq 852
      // 654: aload 54
      // 656: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 65b: checkcast com/zelix/yn
      // 65e: astore 55
      // 660: aload 9
      // 662: lload 35
      // 664: bipush 1
      // 665: anewarray 223
      // 668: dup_x2
      // 669: dup_x2
      // 66a: pop
      // 66b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66e: bipush 0
      // 66f: swap
      // 670: aastore
      // 671: ldc2_w 7188730527048853912
      // 674: lload 4
      // 676: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67b: lload 25
      // 67d: dup2_x1
      // 67e: pop2
      // 67f: bipush 1
      // 680: anewarray 10
      // 683: dup
      // 684: bipush 0
      // 685: new java/lang/StringBuilder
      // 688: dup
      // 689: invokespecial java/lang/StringBuilder.<init> ()V
      // 68c: sipush 11202
      // 68f: ldc2_w 93986691796038987
      // 692: lload 4
      // 694: lxor
      // 695: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 69d: aload 9
      // 69f: ldc2_w 8658959338756722623
      // 6a2: lload 4
      // 6a4: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ac: ldc " "
      // 6ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b1: aload 55
      // 6b3: ldc2_w 8658959338756722623
      // 6b6: lload 4
      // 6b8: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6c3: aastore
      // 6c4: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 6c7: aload 55
      // 6c9: lload 35
      // 6cb: bipush 1
      // 6cc: anewarray 223
      // 6cf: dup_x2
      // 6d0: dup_x2
      // 6d1: pop
      // 6d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d5: bipush 0
      // 6d6: swap
      // 6d7: aastore
      // 6d8: ldc2_w 7188730527048853912
      // 6db: lload 4
      // 6dd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e2: lload 25
      // 6e4: dup2_x1
      // 6e5: pop2
      // 6e6: bipush 1
      // 6e7: anewarray 10
      // 6ea: dup
      // 6eb: bipush 0
      // 6ec: new java/lang/StringBuilder
      // 6ef: dup
      // 6f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 6f3: sipush 16024
      // 6f6: ldc2_w 3070546336538812436
      // 6f9: lload 4
      // 6fb: lxor
      // 6fc: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 701: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 704: aload 9
      // 706: ldc2_w 8658959338756722623
      // 709: lload 4
      // 70b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 710: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 713: ldc " "
      // 715: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 718: aload 55
      // 71a: ldc2_w 8658959338756722623
      // 71d: lload 4
      // 71f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 724: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 727: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 72a: aastore
      // 72b: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 72e: aload 9
      // 730: lload 27
      // 732: bipush 1
      // 733: anewarray 223
      // 736: dup_x2
      // 737: dup_x2
      // 738: pop
      // 739: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 73c: bipush 0
      // 73d: swap
      // 73e: aastore
      // 73f: ldc2_w 8954042205470172568
      // 742: lload 4
      // 744: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 749: aload 50
      // 74b: lload 4
      // 74d: lconst_0
      // 74e: lcmp
      // 74f: ifle 791
      // 752: ifnonnull 78f
      // 755: ifeq 7a9
      // 758: goto 766
      // 75b: ldc2_w 8948804551006847191
      // 75e: lload 4
      // 760: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 765: athrow
      // 766: aload 55
      // 768: lload 27
      // 76a: bipush 1
      // 76b: anewarray 223
      // 76e: dup_x2
      // 76f: dup_x2
      // 770: pop
      // 771: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 774: bipush 0
      // 775: swap
      // 776: aastore
      // 777: ldc2_w 8954042205470172568
      // 77a: lload 4
      // 77c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 781: goto 78f
      // 784: ldc2_w 8948804551006847191
      // 787: lload 4
      // 789: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78e: athrow
      // 78f: aload 50
      // 791: ifnonnull 7a6
      // 794: ifne 7a9
      // 797: goto 7a5
      // 79a: ldc2_w 8948804551006847191
      // 79d: lload 4
      // 79f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a4: athrow
      // 7a5: bipush 1
      // 7a6: goto 7aa
      // 7a9: bipush 0
      // 7aa: istore 56
      // 7ac: aload 0
      // 7ad: aload 55
      // 7af: lload 16
      // 7b1: aload 6
      // 7b3: bipush 2
      // 7b4: anewarray 223
      // 7b7: dup_x1
      // 7b8: swap
      // 7b9: bipush 1
      // 7ba: swap
      // 7bb: aastore
      // 7bc: dup_x2
      // 7bd: dup_x2
      // 7be: pop
      // 7bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c2: bipush 0
      // 7c3: swap
      // 7c4: aastore
      // 7c5: ldc2_w 8708262861300750264
      // 7c8: lload 4
      // 7ca: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cf: aload 3
      // 7d0: lload 14
      // 7d2: bipush 2
      // 7d3: anewarray 223
      // 7d6: dup_x2
      // 7d7: dup_x2
      // 7d8: pop
      // 7d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7dc: bipush 1
      // 7dd: swap
      // 7de: aastore
      // 7df: dup_x1
      // 7e0: swap
      // 7e1: bipush 0
      // 7e2: swap
      // 7e3: aastore
      // 7e4: ldc2_w 7203078831212142388
      // 7e7: lload 4
      // 7e9: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ee: lload 16
      // 7f0: aload 8
      // 7f2: bipush 2
      // 7f3: anewarray 223
      // 7f6: dup_x1
      // 7f7: swap
      // 7f8: bipush 1
      // 7f9: swap
      // 7fa: aastore
      // 7fb: dup_x2
      // 7fc: dup_x2
      // 7fd: pop
      // 7fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 801: bipush 0
      // 802: swap
      // 803: aastore
      // 804: ldc2_w 8708262861300750264
      // 807: lload 4
      // 809: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80e: lload 40
      // 810: aload 2
      // 811: iload 56
      // 813: bipush 7
      // 815: anewarray 223
      // 818: dup_x1
      // 819: swap
      // 81a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 81d: bipush 6
      // 81f: swap
      // 820: aastore
      // 821: dup_x1
      // 822: swap
      // 823: bipush 5
      // 824: swap
      // 825: aastore
      // 826: dup_x2
      // 827: dup_x2
      // 828: pop
      // 829: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 82c: bipush 4
      // 82d: swap
      // 82e: aastore
      // 82f: dup_x1
      // 830: swap
      // 831: bipush 3
      // 832: swap
      // 833: aastore
      // 834: dup_x1
      // 835: swap
      // 836: bipush 2
      // 837: swap
      // 838: aastore
      // 839: dup_x1
      // 83a: swap
      // 83b: bipush 1
      // 83c: swap
      // 83d: aastore
      // 83e: dup_x1
      // 83f: swap
      // 840: bipush 0
      // 841: swap
      // 842: aastore
      // 843: ldc2_w 8966706841015770958
      // 846: lload 4
      // 848: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84d: aload 50
      // 84f: ifnull 64a
      // 852: lload 4
      // 854: lconst_0
      // 855: lcmp
      // 856: iflt 654
      // 859: return
   }

   static {
      long var0 = a ^ 41801204673121L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "¤Z\u001aQ2¨G¯bç9\u0082ªv¨®\u0088\u0088ß\u001aæDÊAHª5óÿ&,\u0007lLÂ\u001d\u0007\u0006ûÕSJ9¶\u0092y\u0018|\u0010Ð\u0091_f\u0084ã\u0080K@Èe\u0081ªÈë\u000b@1ú\u0089ê\u0007Ù³K9ñY\u0093\u0097\tÅávvPà?éPâ{æÜJCö¯X3\u0001'qi\u0001bíérKí\u0003d®5\u0081¬&X¨g£$ioWÖ\u001f\u0006#²\u0010\u0096H\t§\u00adS\u008930¬¶l«\u0019\u009b±\u0010\u009e\u007fÙ¹M\u000f\nþÃÕü\u0013ZÇO 0Mm÷\u00950XE\u000b\u001fw;×)á×\u0016½`Ù\"_ÛLql\u001f\u001dR\u0090æuª5Ø\u008e5p{<3áÂtØ\u008d¼ë\u0094\u0010]\u0015^B=Ã?3ZÍ\u0004\u008eH\u0082Pã\u0010\u000el\u009a\t^´Ð\u0017¡\u0015!èO\u0007Éx";
      int var8 = "¤Z\u001aQ2¨G¯bç9\u0082ªv¨®\u0088\u0088ß\u001aæDÊAHª5óÿ&,\u0007lLÂ\u001d\u0007\u0006ûÕSJ9¶\u0092y\u0018|\u0010Ð\u0091_f\u0084ã\u0080K@Èe\u0081ªÈë\u000b@1ú\u0089ê\u0007Ù³K9ñY\u0093\u0097\tÅávvPà?éPâ{æÜJCö¯X3\u0001'qi\u0001bíérKí\u0003d®5\u0081¬&X¨g£$ioWÖ\u001f\u0006#²\u0010\u0096H\t§\u00adS\u008930¬¶l«\u0019\u009b±\u0010\u009e\u007fÙ¹M\u000f\nþÃÕü\u0013ZÇO 0Mm÷\u00950XE\u000b\u001fw;×)á×\u0016½`Ù\"_ÛLql\u001f\u001dR\u0090æuª5Ø\u008e5p{<3áÂtØ\u008d¼ë\u0094\u0010]\u0015^B=Ã?3ZÍ\u0004\u008eH\u0082Pã\u0010\u000el\u009a\t^´Ð\u0017¡\u0015!èO\u0007Éx"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[10];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Oê\u008aÓ\u0011û|:E/\u001aùÆ:\u008c\u0015(ù?çJ%ð\u0007è3\u0087\u008ed\u0095\u000bqºÆ\f\f\u0011§sDM2G;×ÏÄn\u0099>¦´\u0096\u0000;\u009c=";
                  var8 = "Oê\u008aÓ\u0011û|:E/\u001aùÆ:\u008c\u0015(ù?çJ%ð\u0007è3\u0087\u008ed\u0095\u000bqºÆ\f\f\u0011§sDM2G;×ÏÄn\u0099>¦´\u0096\u0000;\u009c="
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13006;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_f3", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/_f3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
