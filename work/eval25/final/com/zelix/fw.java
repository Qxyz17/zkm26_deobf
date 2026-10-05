package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class fw extends f7 implements ss {
   protected int G;
   private static final long f = ess.a(-2273349670161625012L, -2389640320800136470L, MethodHandles.lookup().lookupClass()).a(268268960790995L);
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long u;

   public fw W(Object[] var1) {
      long var2 = (Long)var1[0];
      return this;
   }

   public int F(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"n">(this, 941312939251993343L, var2);
   }

   public abstract String Z(Object[] var1);

   public final void c(Object[] param1) {
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
      // 004: checkcast com/zelix/_ur
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Integer
      // 01a: invokevirtual java/lang/Integer.intValue ()I
      // 01d: istore 5
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/lang/Integer
      // 025: invokevirtual java/lang/Integer.intValue ()I
      // 028: istore 6
      // 02a: dup
      // 02b: bipush 4
      // 02c: aaload
      // 02d: checkcast java/lang/Long
      // 030: invokevirtual java/lang/Long.longValue ()J
      // 033: lstore 2
      // 034: dup
      // 035: bipush 5
      // 036: aaload
      // 037: checkcast java/lang/String
      // 03a: astore 8
      // 03c: pop
      // 03d: getstatic com/zelix/fw.f J
      // 040: lload 2
      // 041: lxor
      // 042: lstore 2
      // 043: lload 2
      // 044: dup2
      // 045: ldc2_w 106643795050727
      // 048: lxor
      // 049: lstore 9
      // 04b: dup2
      // 04c: ldc2_w 125091380437228
      // 04f: lxor
      // 050: lstore 11
      // 052: dup2
      // 053: ldc2_w 2883501149177
      // 056: lxor
      // 057: lstore 13
      // 059: dup2
      // 05a: ldc2_w 128078662275960
      // 05d: lxor
      // 05e: lstore 15
      // 060: dup2
      // 061: ldc2_w 35121162856050
      // 064: lxor
      // 065: lstore 17
      // 067: dup2
      // 068: ldc2_w 88772521642509
      // 06b: lxor
      // 06c: lstore 19
      // 06e: pop2
      // 06f: new java/lang/StringBuilder
      // 072: dup
      // 073: invokespecial java/lang/StringBuilder.<init> ()V
      // 076: astore 22
      // 078: ldc2_w 4333074642277899676
      // 07b: lload 2
      // 07c: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: aload 7
      // 083: lload 19
      // 085: bipush 1
      // 086: anewarray 53
      // 089: dup_x2
      // 08a: dup_x2
      // 08b: pop
      // 08c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08f: bipush 0
      // 090: swap
      // 091: aastore
      // 092: ldc2_w 4180282838762268577
      // 095: lload 2
      // 096: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: iload 4
      // 09d: isub
      // 09e: istore 23
      // 0a0: astore 21
      // 0a2: iload 23
      // 0a4: aload 21
      // 0a6: ifnonnull 16e
      // 0a9: ifle 151
      // 0ac: goto 0b9
      // 0af: ldc2_w 2721907435668195282
      // 0b2: lload 2
      // 0b3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 22
      // 0bb: lload 2
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: iflt 108
      // 0c1: aload 21
      // 0c3: ifnonnull 108
      // 0c6: goto 0d3
      // 0c9: ldc2_w 2721907435668195282
      // 0cc: lload 2
      // 0cd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: invokevirtual java/lang/StringBuilder.length ()I
      // 0d6: ifle 106
      // 0d9: goto 0e6
      // 0dc: ldc2_w 2721907435668195282
      // 0df: lload 2
      // 0e0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 22
      // 0e8: sipush 22667
      // 0eb: ldc2_w 5178366073513968715
      // 0ee: lload 2
      // 0ef: lxor
      // 0f0: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: pop
      // 0f9: goto 106
      // 0fc: ldc2_w 2721907435668195282
      // 0ff: lload 2
      // 100: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 22
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: iload 23
      // 111: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 114: iload 23
      // 116: lload 2
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 13d
      // 11c: bipush 1
      // 11d: if_icmple 13a
      // 120: sipush 11665
      // 123: ldc2_w 8805726007741804883
      // 126: lload 2
      // 127: lxor
      // 128: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: goto 147
      // 130: ldc2_w 2721907435668195282
      // 133: lload 2
      // 134: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: sipush 11018
      // 13d: ldc2_w 127457159658338255
      // 140: lload 2
      // 141: lxor
      // 142: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: pop
      // 151: aload 7
      // 153: lload 11
      // 155: bipush 1
      // 156: anewarray 53
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 0
      // 160: swap
      // 161: aastore
      // 162: ldc2_w 2857034100569083477
      // 165: lload 2
      // 166: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: iload 5
      // 16d: isub
      // 16e: istore 24
      // 170: iload 24
      // 172: aload 21
      // 174: ifnonnull 23c
      // 177: ifle 21f
      // 17a: goto 187
      // 17d: ldc2_w 2721907435668195282
      // 180: lload 2
      // 181: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 22
      // 189: lload 2
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: iflt 1d6
      // 18f: aload 21
      // 191: ifnonnull 1d6
      // 194: goto 1a1
      // 197: ldc2_w 2721907435668195282
      // 19a: lload 2
      // 19b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: invokevirtual java/lang/StringBuilder.length ()I
      // 1a4: ifle 1d4
      // 1a7: goto 1b4
      // 1aa: ldc2_w 2721907435668195282
      // 1ad: lload 2
      // 1ae: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 22
      // 1b6: sipush 32541
      // 1b9: ldc2_w 1290667302783263708
      // 1bc: lload 2
      // 1bd: lxor
      // 1be: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c6: pop
      // 1c7: goto 1d4
      // 1ca: ldc2_w 2721907435668195282
      // 1cd: lload 2
      // 1ce: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: aload 22
      // 1d6: new java/lang/StringBuilder
      // 1d9: dup
      // 1da: invokespecial java/lang/StringBuilder.<init> ()V
      // 1dd: iload 24
      // 1df: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1e2: iload 24
      // 1e4: lload 2
      // 1e5: lconst_0
      // 1e6: lcmp
      // 1e7: ifle 20b
      // 1ea: bipush 1
      // 1eb: if_icmple 208
      // 1ee: sipush 13323
      // 1f1: ldc2_w 2633041368457636045
      // 1f4: lload 2
      // 1f5: lxor
      // 1f6: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: goto 215
      // 1fe: ldc2_w 2721907435668195282
      // 201: lload 2
      // 202: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: athrow
      // 208: sipush 28563
      // 20b: ldc2_w 2022672614595703636
      // 20e: lload 2
      // 20f: lxor
      // 210: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 218: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21e: pop
      // 21f: aload 7
      // 221: lload 13
      // 223: bipush 1
      // 224: anewarray 53
      // 227: dup_x2
      // 228: dup_x2
      // 229: pop
      // 22a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22d: bipush 0
      // 22e: swap
      // 22f: aastore
      // 230: ldc2_w 2385596941009652200
      // 233: lload 2
      // 234: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: iload 6
      // 23b: isub
      // 23c: istore 25
      // 23e: iload 25
      // 240: lload 2
      // 241: lconst_0
      // 242: lcmp
      // 243: iflt 2f8
      // 246: aload 21
      // 248: ifnonnull 2f8
      // 24b: ifle 2f3
      // 24e: goto 25b
      // 251: ldc2_w 2721907435668195282
      // 254: lload 2
      // 255: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: athrow
      // 25b: aload 22
      // 25d: lload 2
      // 25e: lconst_0
      // 25f: lcmp
      // 260: iflt 2aa
      // 263: aload 21
      // 265: ifnonnull 2aa
      // 268: goto 275
      // 26b: ldc2_w 2721907435668195282
      // 26e: lload 2
      // 26f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: athrow
      // 275: invokevirtual java/lang/StringBuilder.length ()I
      // 278: ifle 2a8
      // 27b: goto 288
      // 27e: ldc2_w 2721907435668195282
      // 281: lload 2
      // 282: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: athrow
      // 288: aload 22
      // 28a: sipush 32541
      // 28d: ldc2_w 1290667302783263708
      // 290: lload 2
      // 291: lxor
      // 292: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29a: pop
      // 29b: goto 2a8
      // 29e: ldc2_w 2721907435668195282
      // 2a1: lload 2
      // 2a2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: aload 22
      // 2aa: new java/lang/StringBuilder
      // 2ad: dup
      // 2ae: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b1: iload 25
      // 2b3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2b6: iload 25
      // 2b8: lload 2
      // 2b9: lconst_0
      // 2ba: lcmp
      // 2bb: iflt 2df
      // 2be: bipush 1
      // 2bf: if_icmple 2dc
      // 2c2: sipush 22804
      // 2c5: ldc2_w 1405197585574921688
      // 2c8: lload 2
      // 2c9: lxor
      // 2ca: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: goto 2e9
      // 2d2: ldc2_w 2721907435668195282
      // 2d5: lload 2
      // 2d6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: athrow
      // 2dc: sipush 16200
      // 2df: ldc2_w 58682744945927047
      // 2e2: lload 2
      // 2e3: lxor
      // 2e4: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f2: pop
      // 2f3: aload 22
      // 2f5: invokevirtual java/lang/StringBuilder.length ()I
      // 2f8: ifle 3c9
      // 2fb: ldc2_w 4224056051165638396
      // 2fe: lload 2
      // 2ff: invokedynamic o (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: new java/lang/StringBuilder
      // 307: dup
      // 308: invokespecial java/lang/StringBuilder.<init> ()V
      // 30b: lload 9
      // 30d: bipush 1
      // 30e: anewarray 53
      // 311: dup_x2
      // 312: dup_x2
      // 313: pop
      // 314: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 317: bipush 0
      // 318: swap
      // 319: aastore
      // 31a: ldc2_w 4148043098268350008
      // 31d: lload 2
      // 31e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: invokevirtual java/lang/String.length ()I
      // 326: bipush 1
      // 327: iadd
      // 328: getstatic com/zelix/fw.u J
      // 32b: l2i
      // 32c: lload 15
      // 32e: bipush 3
      // 32f: anewarray 53
      // 332: dup_x2
      // 333: dup_x2
      // 334: pop
      // 335: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 338: bipush 2
      // 339: swap
      // 33a: aastore
      // 33b: dup_x1
      // 33c: swap
      // 33d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 340: bipush 1
      // 341: swap
      // 342: aastore
      // 343: dup_x1
      // 344: swap
      // 345: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 348: bipush 0
      // 349: swap
      // 34a: aastore
      // 34b: ldc2_w 4346109714016269608
      // 34e: lload 2
      // 34f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 354: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 357: aload 22
      // 359: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 35c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35f: sipush 16375
      // 362: ldc2_w 1109543966932460340
      // 365: lload 2
      // 366: lxor
      // 367: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36f: aload 8
      // 371: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 374: sipush 15218
      // 377: ldc2_w 7679828170854918079
      // 37a: lload 2
      // 37b: lxor
      // 37c: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 381: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 384: aload 0
      // 385: lload 17
      // 387: bipush 1
      // 388: anewarray 53
      // 38b: dup_x2
      // 38c: dup_x2
      // 38d: pop
      // 38e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 391: bipush 0
      // 392: swap
      // 393: aastore
      // 394: ldc2_w 4286710888317307098
      // 397: lload 2
      // 398: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a0: sipush 12051
      // 3a3: ldc2_w 6485779708372480983
      // 3a6: lload 2
      // 3a7: lxor
      // 3a8: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/fw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b3: ldc2_w 2331638250372203845
      // 3b6: lload 2
      // 3b7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bc: goto 3c9
      // 3bf: ldc2_w 2721907435668195282
      // 3c2: lload 2
      // 3c3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c8: athrow
      // 3c9: return
   }

   public fw(short var1, char var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ f;
      long var10001 = var5 ^ 111380833527938L;
      int var7 = (int)((var5 ^ 111380833527938L) >>> 48);
      int var8 = (int)((var5 ^ 111380833527938L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      super((short)var7, (short)var8, var3, var9);
   }

   public void A(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = f ^ var2;
      x44.a<"q">(this, var4, -1958925696560209089L, var2);
   }

   protected abstract void Y(Object[] var1);

   static {
      long var5 = f ^ 69352311755286L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[11];
      int var12 = 0;
      String var11 = "\u001e\u0017\u0006ÉZZWBÝzi¾,%>«ð=ëE4\u009d®í í%tð\u0013Gª×éE`E©îà?=xlÒ#ÀÅ?â \u0097/ð¨,I HVÃ¨\u000e\u0014ûÃ²Û~\u00adÉZ%âÐíÑ'(\u0097ìs`TÛ\u0091ì#\u0016  \u008bçÞ«b\u009dµ×BåÇ\u0098q\u008b\u008c÷ª©ZË\u0088#Ë%q\u0090\u009cja =û\u0010{\u0012ÏoÝK\u000f¹}}ÂúÞ³5\u0000\u0010<üüó;EÇüï\fÑÏë\u0001\u0086h\u0018m\u0004\u001d\u0011\u008bh\u0018×9\u008c[RÔ\u0002\u0003×¶ñÌ3,wÕÍ\u0018\u0090>´\u008eÌ×gqãÝé\b\u009b¹&\bÅ\u0083Î\u001bÓ\u001aÞï\u0010õU\u001a\u0095ÃÓØ¡\u001dÝ¡\u0007Þ/\u0019\u0092";
      int var13 = "\u001e\u0017\u0006ÉZZWBÝzi¾,%>«ð=ëE4\u009d®í í%tð\u0013Gª×éE`E©îà?=xlÒ#ÀÅ?â \u0097/ð¨,I HVÃ¨\u000e\u0014ûÃ²Û~\u00adÉZ%âÐíÑ'(\u0097ìs`TÛ\u0091ì#\u0016  \u008bçÞ«b\u009dµ×BåÇ\u0098q\u008b\u008c÷ª©ZË\u0088#Ë%q\u0090\u009cja =û\u0010{\u0012ÏoÝK\u000f¹}}ÂúÞ³5\u0000\u0010<üüó;EÇüï\fÑÏë\u0001\u0086h\u0018m\u0004\u001d\u0011\u008bh\u0018×9\u008c[RÔ\u0002\u0003×¶ñÌ3,wÕÍ\u0018\u0090>´\u008eÌ×gqãÝé\b\u009b¹&\bÅ\u0083Î\u001bÓ\u001aÞï\u0010õU\u001a\u0095ÃÓØ¡\u001dÝ¡\u0007Þ/\u0019\u0092"
         .length();
      char var10 = 24;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = b(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     g = var14;
                     h = new String[11];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -5795672552880128799L;
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
                     u = var30;
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

                  var11 = "\u0015\tlFí1ø¾DÆ\u001eµ\u009bHÉr\u0010ø¡ZÜ,¿\u009a¸±®ð \u008c\u0087&ç";
                  var13 = "\u0015\tlFí1ø¾DÆ\u001eµ\u009bHÉr\u0010ø¡ZÜ,¿\u009a¸±®ð \u008c\u0087&ç".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static gj c(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26936;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/fw", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("com/zelix/fw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
