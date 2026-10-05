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

public abstract class _n7 extends _n5 {
   private static final long g = ess.a(2649950892165915826L, -5605400952299329853L, MethodHandles.lookup().lookupClass()).a(73708796055734L);
   private static final String[] j;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public void K(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/az
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_uu
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 0
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 61084179180318
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 40659853048087
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 130577362491821
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 101216835141935
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 23478223416965
      // 044: lxor
      // 045: lstore 16
      // 047: dup2
      // 048: ldc2_w 112151099262352
      // 04b: lxor
      // 04c: lstore 18
      // 04e: dup2
      // 04f: ldc2_w 9030105114546
      // 052: lxor
      // 053: lstore 20
      // 055: dup2
      // 056: ldc2_w 134094684716713
      // 059: lxor
      // 05a: lstore 22
      // 05c: dup2
      // 05d: ldc2_w 40659853048087
      // 060: lxor
      // 061: lstore 24
      // 063: dup2
      // 064: ldc2_w 89968223186826
      // 067: lxor
      // 068: lstore 26
      // 06a: dup2
      // 06b: ldc2_w 57327596029028
      // 06e: lxor
      // 06f: lstore 28
      // 071: pop2
      // 072: ldc2_w 2920000768921731879
      // 075: lload 4
      // 077: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: aload 0
      // 07d: lload 22
      // 07f: bipush 1
      // 080: anewarray 55
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: ldc2_w 3465643414999437744
      // 08f: lload 4
      // 091: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_n5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: astore 31
      // 098: istore 30
      // 09a: aload 31
      // 09c: iload 30
      // 09e: ifeq 0b4
      // 0a1: ifnull 1c2
      // 0a4: goto 0b2
      // 0a7: ldc2_w 3482081826950747327
      // 0aa: lload 4
      // 0ac: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 31
      // 0b4: instanceof com/zelix/_gz
      // 0b7: iload 30
      // 0b9: ifeq 1c3
      // 0bc: ifeq 1c2
      // 0bf: goto 0cd
      // 0c2: ldc2_w 3482081826950747327
      // 0c5: lload 4
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: instanceof com/zelix/_nv
      // 0d1: iload 30
      // 0d3: ifeq 1c3
      // 0d6: goto 0e4
      // 0d9: ldc2_w 3482081826950747327
      // 0dc: lload 4
      // 0de: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: ifne 1c2
      // 0e7: goto 0f5
      // 0ea: ldc2_w 3482081826950747327
      // 0ed: lload 4
      // 0ef: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 31
      // 0f7: checkcast com/zelix/_gz
      // 0fa: astore 32
      // 0fc: aload 2
      // 0fd: new java/lang/StringBuilder
      // 100: dup
      // 101: invokespecial java/lang/StringBuilder.<init> ()V
      // 104: sipush 30789
      // 107: ldc2_w 5508309036512957750
      // 10a: lload 4
      // 10c: lxor
      // 10d: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_n7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: aload 32
      // 117: lload 24
      // 119: bipush 1
      // 11a: anewarray 55
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: ldc2_w 3152542667290727538
      // 129: lload 4
      // 12b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 133: sipush 4893
      // 136: ldc2_w 1327846983311408749
      // 139: lload 4
      // 13b: lxor
      // 13c: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_n7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: aload 32
      // 146: lload 8
      // 148: bipush 1
      // 149: anewarray 55
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 0
      // 153: swap
      // 154: aastore
      // 155: ldc2_w 3936579428098839194
      // 158: lload 4
      // 15a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 162: sipush 4772
      // 165: ldc2_w 1151276093424254934
      // 168: lload 4
      // 16a: lxor
      // 16b: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_n7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: aload 0
      // 174: lload 10
      // 176: bipush 1
      // 177: anewarray 55
      // 17a: dup_x2
      // 17b: dup_x2
      // 17c: pop
      // 17d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 180: bipush 0
      // 181: swap
      // 182: aastore
      // 183: ldc2_w 2923609937309484140
      // 186: lload 4
      // 188: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: sipush 29399
      // 193: ldc2_w 2364271080459067302
      // 196: lload 4
      // 198: lxor
      // 199: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_n7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a4: lload 12
      // 1a6: bipush 2
      // 1a7: anewarray 55
      // 1aa: dup_x2
      // 1ab: dup_x2
      // 1ac: pop
      // 1ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b0: bipush 1
      // 1b1: swap
      // 1b2: aastore
      // 1b3: dup_x1
      // 1b4: swap
      // 1b5: bipush 0
      // 1b6: swap
      // 1b7: aastore
      // 1b8: ldc2_w 3578938323224581578
      // 1bb: lload 4
      // 1bd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: bipush 0
      // 1c3: istore 32
      // 1c5: iload 32
      // 1c7: aload 0
      // 1c8: lload 14
      // 1ca: bipush 1
      // 1cb: anewarray 55
      // 1ce: dup_x2
      // 1cf: dup_x2
      // 1d0: pop
      // 1d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d4: bipush 0
      // 1d5: swap
      // 1d6: aastore
      // 1d7: ldc2_w 3459742712771822671
      // 1da: lload 4
      // 1dc: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: if_icmpge 256
      // 1e4: aload 0
      // 1e5: iload 32
      // 1e7: lload 26
      // 1e9: bipush 2
      // 1ea: anewarray 55
      // 1ed: dup_x2
      // 1ee: dup_x2
      // 1ef: pop
      // 1f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f3: bipush 1
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fb: bipush 0
      // 1fc: swap
      // 1fd: aastore
      // 1fe: ldc2_w 3156618655040194173
      // 201: lload 4
      // 203: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: lload 6
      // 20a: aload 0
      // 20b: aload 2
      // 20c: bipush 3
      // 20d: anewarray 55
      // 210: dup_x1
      // 211: swap
      // 212: bipush 2
      // 213: swap
      // 214: aastore
      // 215: dup_x1
      // 216: swap
      // 217: bipush 1
      // 218: swap
      // 219: aastore
      // 21a: dup_x2
      // 21b: dup_x2
      // 21c: pop
      // 21d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 220: bipush 0
      // 221: swap
      // 222: aastore
      // 223: ldc2_w 3570806773825883371
      // 226: lload 4
      // 228: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: iinc 32 1
      // 230: iload 30
      // 232: lload 4
      // 234: lconst_0
      // 235: lcmp
      // 236: ifle 28c
      // 239: ifeq 272
      // 23c: iload 30
      // 23e: ifne 1c5
      // 241: lload 4
      // 243: lconst_0
      // 244: lcmp
      // 245: iflt 230
      // 248: goto 256
      // 24b: ldc2_w 3482081826950747327
      // 24e: lload 4
      // 250: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: aload 2
      // 257: lload 28
      // 259: bipush 1
      // 25a: anewarray 55
      // 25d: dup_x2
      // 25e: dup_x2
      // 25f: pop
      // 260: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 263: bipush 0
      // 264: swap
      // 265: aastore
      // 266: ldc2_w 3776898889302878664
      // 269: lload 4
      // 26b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: istore 32
      // 272: aload 2
      // 273: lload 16
      // 275: bipush 1
      // 276: anewarray 55
      // 279: dup_x2
      // 27a: dup_x2
      // 27b: pop
      // 27c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27f: bipush 0
      // 280: swap
      // 281: aastore
      // 282: ldc2_w 3012730029759529020
      // 285: lload 4
      // 287: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: istore 33
      // 28e: aload 2
      // 28f: lload 18
      // 291: bipush 1
      // 292: anewarray 55
      // 295: dup_x2
      // 296: dup_x2
      // 297: pop
      // 298: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29b: bipush 0
      // 29c: swap
      // 29d: aastore
      // 29e: ldc2_w 3418851520953878401
      // 2a1: lload 4
      // 2a3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: istore 34
      // 2aa: aload 0
      // 2ab: aload 2
      // 2ac: iload 32
      // 2ae: lload 20
      // 2b0: iload 33
      // 2b2: iload 34
      // 2b4: bipush 5
      // 2b5: anewarray 55
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2bd: bipush 4
      // 2be: swap
      // 2bf: aastore
      // 2c0: dup_x1
      // 2c1: swap
      // 2c2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2c5: bipush 3
      // 2c6: swap
      // 2c7: aastore
      // 2c8: dup_x2
      // 2c9: dup_x2
      // 2ca: pop
      // 2cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ce: bipush 2
      // 2cf: swap
      // 2d0: aastore
      // 2d1: dup_x1
      // 2d2: swap
      // 2d3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2d6: bipush 1
      // 2d7: swap
      // 2d8: aastore
      // 2d9: dup_x1
      // 2da: swap
      // 2db: bipush 0
      // 2dc: swap
      // 2dd: aastore
      // 2de: ldc2_w 2931382744535591215
      // 2e1: lload 4
      // 2e3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: return
   }

   public _n7(long var1, int var3) {
      var1 = g ^ var1;
      long var4 = var1 ^ 60531285756101L;
      super(var3, var4);
   }

   static {
      long var0 = g ^ 129288246741108L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "Ð·\u0019\u0098t'v\u0018dñc}²ê.\u0015÷\u0005Z´ \u009b\u0017/«&1³±Q\u008cÏ¬â;¿û.°\r©\u0012\u0092zXfæ\u0093(õ&¸áévlgÀ¾~Ç\u008ba\u008b\u001b\u0082NÆå\u009f\rFúr\u0018ámzô\u00193\"°\u0010J\u009bQ1\u008b";
      int var8 = "Ð·\u0019\u0098t'v\u0018dñc}²ê.\u0015÷\u0005Z´ \u009b\u0017/«&1³±Q\u008cÏ¬â;¿û.°\r©\u0012\u0092zXfæ\u0093(õ&¸áévlgÀ¾~Ç\u008ba\u008b\u001b\u0082NÆå\u009f\rFúr\u0018ámzô\u00193\"°\u0010J\u009bQ1\u008b"
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
                     j = var9;
                     l = new String[4];
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

                  var6 = "ë¬¹}÷Û÷\u0003d\u0017W-\u001bÚ±¶0UgÚåÔem\u0018¥z½}Å\u0083\u000f\r\u001aÆx½hÔ'Ò\u009bë Õ\u000e\u0088ãU";
                  var8 = "ë¬¹}÷Û÷\u0003d\u0017W-\u001bÚ±¶0UgÚåÔem\u0018¥z½}Å\u0083\u000f\r\u001aÆx½hÔ'Ò\u009bë Õ\u000e\u0088ãU".length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5861;
      if (l[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_n7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         l[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
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
         throw new RuntimeException("com/zelix/_n7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
