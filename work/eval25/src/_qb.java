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

public class _qb extends _qw implements eo {
   private boolean j;
   private static final long a = ess.a(-4474372479193754772L, 5604267096720862458L, MethodHandles.lookup().lookupClass()).a(220926763231351L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/az
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_uu
      // 019: astore 4
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 111452843812254
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 139324542296055
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 54130034607546
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 0
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 12703793543226
      // 03d: lxor
      // 03e: lstore 14
      // 040: pop2
      // 041: ldc2_w 3018414783042270147
      // 044: lload 2
      // 045: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: aload 0
      // 04b: lload 12
      // 04d: aload 5
      // 04f: aload 4
      // 051: bipush 3
      // 052: anewarray 185
      // 055: dup_x1
      // 056: swap
      // 057: bipush 2
      // 058: swap
      // 059: aastore
      // 05a: dup_x1
      // 05b: swap
      // 05c: bipush 1
      // 05d: swap
      // 05e: aastore
      // 05f: dup_x2
      // 060: dup_x2
      // 061: pop
      // 062: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 065: bipush 0
      // 066: swap
      // 067: aastore
      // 068: invokespecial com/zelix/_qw.K ([Ljava/lang/Object;)V
      // 06b: aload 0
      // 06c: lload 14
      // 06e: bipush 1
      // 06f: anewarray 185
      // 072: dup_x2
      // 073: dup_x2
      // 074: pop
      // 075: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 078: bipush 0
      // 079: swap
      // 07a: aastore
      // 07b: ldc2_w 3905488149096465397
      // 07e: lload 2
      // 07f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: checkcast com/zelix/_q4
      // 087: astore 17
      // 089: istore 16
      // 08b: aload 0
      // 08c: lload 6
      // 08e: bipush 1
      // 08f: anewarray 185
      // 092: dup_x2
      // 093: dup_x2
      // 094: pop
      // 095: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 098: bipush 0
      // 099: swap
      // 09a: aastore
      // 09b: ldc2_w 3495266996315428193
      // 09e: lload 2
      // 09f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: astore 18
      // 0a6: aload 18
      // 0a8: sipush 30158
      // 0ab: ldc2_w 4212086096488248023
      // 0ae: lload 2
      // 0af: lxor
      // 0b0: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_qb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b8: iload 16
      // 0ba: ifne 0ec
      // 0bd: ifne 107
      // 0c0: goto 0cd
      // 0c3: ldc2_w 3907019982044674431
      // 0c6: lload 2
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 18
      // 0cf: sipush 32493
      // 0d2: ldc2_w 7860968936991701490
      // 0d5: lload 2
      // 0d6: lxor
      // 0d7: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_qb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0df: goto 0ec
      // 0e2: ldc2_w 3907019982044674431
      // 0e5: lload 2
      // 0e6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: iload 16
      // 0ee: lload 2
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: iflt 195
      // 0f4: ifne 18d
      // 0f7: ifeq 16e
      // 0fa: goto 107
      // 0fd: ldc2_w 3907019982044674431
      // 100: lload 2
      // 101: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 17
      // 109: new java/lang/StringBuilder
      // 10c: dup
      // 10d: invokespecial java/lang/StringBuilder.<init> ()V
      // 110: aload 0
      // 111: ldc2_w 3503731229926727976
      // 114: lload 2
      // 115: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: ifeq 139
      // 11d: goto 12a
      // 120: ldc2_w 3907019982044674431
      // 123: lload 2
      // 124: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: ldc "!"
      // 12c: goto 13b
      // 12f: ldc2_w 3907019982044674431
      // 132: lload 2
      // 133: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: ldc ""
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13e: aload 18
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: lload 10
      // 148: bipush 2
      // 149: anewarray 185
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 1
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 0
      // 158: swap
      // 159: aastore
      // 15a: ldc2_w 3500834423916402332
      // 15d: lload 2
      // 15e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: iload 16
      // 165: lload 2
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 180
      // 16b: ifeq 2a6
      // 16e: aload 18
      // 170: sipush 20594
      // 173: ldc2_w 4586615878733240174
      // 176: lload 2
      // 177: lxor
      // 178: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_qb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 180: goto 18d
      // 183: ldc2_w 3907019982044674431
      // 186: lload 2
      // 187: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: lload 2
      // 18e: lconst_0
      // 18f: lcmp
      // 190: ifle 231
      // 193: iload 16
      // 195: ifne 231
      // 198: ifeq 21a
      // 19b: goto 1a8
      // 19e: ldc2_w 3907019982044674431
      // 1a1: lload 2
      // 1a2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 17
      // 1aa: new java/lang/StringBuilder
      // 1ad: dup
      // 1ae: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b1: aload 0
      // 1b2: ldc2_w 3503731229926727976
      // 1b5: lload 2
      // 1b6: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: ifeq 1da
      // 1be: goto 1cb
      // 1c1: ldc2_w 3907019982044674431
      // 1c4: lload 2
      // 1c5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: ldc "!"
      // 1cd: goto 1dc
      // 1d0: ldc2_w 3907019982044674431
      // 1d3: lload 2
      // 1d4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: ldc ""
      // 1dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1df: sipush 24174
      // 1e2: ldc2_w 4320761334548666742
      // 1e5: lload 2
      // 1e6: lxor
      // 1e7: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_qb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f2: lload 10
      // 1f4: bipush 2
      // 1f5: anewarray 185
      // 1f8: dup_x2
      // 1f9: dup_x2
      // 1fa: pop
      // 1fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fe: bipush 1
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: ldc2_w 3500834423916402332
      // 209: lload 2
      // 20a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: iload 16
      // 211: lload 2
      // 212: lconst_0
      // 213: lcmp
      // 214: iflt 224
      // 217: ifeq 2a6
      // 21a: aload 0
      // 21b: ldc2_w 3503731229926727976
      // 21e: lload 2
      // 21f: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: goto 231
      // 227: ldc2_w 3907019982044674431
      // 22a: lload 2
      // 22b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: ifeq 2a6
      // 234: aload 4
      // 236: new java/lang/StringBuilder
      // 239: dup
      // 23a: invokespecial java/lang/StringBuilder.<init> ()V
      // 23d: sipush 30857
      // 240: ldc2_w 6020305872555556759
      // 243: lload 2
      // 244: lxor
      // 245: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_qb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24d: aload 0
      // 24e: lload 6
      // 250: bipush 1
      // 251: anewarray 185
      // 254: dup_x2
      // 255: dup_x2
      // 256: pop
      // 257: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25a: bipush 0
      // 25b: swap
      // 25c: aastore
      // 25d: ldc2_w 3495266996315428193
      // 260: lload 2
      // 261: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 269: sipush 17942
      // 26c: ldc2_w 668176374608167179
      // 26f: lload 2
      // 270: lxor
      // 271: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_qb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 279: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27c: lload 8
      // 27e: bipush 2
      // 27f: anewarray 185
      // 282: dup_x2
      // 283: dup_x2
      // 284: pop
      // 285: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 288: bipush 1
      // 289: swap
      // 28a: aastore
      // 28b: dup_x1
      // 28c: swap
      // 28d: bipush 0
      // 28e: swap
      // 28f: aastore
      // 290: ldc2_w 3949095066529335522
      // 293: lload 2
      // 294: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: goto 2a6
      // 29c: ldc2_w 3907019982044674431
      // 29f: lload 2
      // 2a0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: return
   }

   public _qb(int var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 139472706043503L;
      int var4 = (int)((var2 ^ 139472706043503L) >>> 32);
      int var5 = (int)((var2 ^ 139472706043503L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var1);
   }

   public void j(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"u">(this, true, -2666423023683810487L, var2);
   }

   static {
      long var0 = a ^ 137793268069581L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "áÓÇ~\u0097Iát T\u0006ü\u008c÷\"\u008f\u009aTh\u009a1÷ºC{,dä\u0082}ËoÞý\u000e\u001b\u0013ì\u0011®h,FÝè¸¨aó\u0011U\u009c2ðÃ\u0013 Btî\u007f0B\u0080\u0083ñ PÉyRO\u0019Dhh\u0004×x\u0000\u0006Æ5£+#©G\u009d\u0010bAìÿ¯¸n`ªþ4R/8\n\u008f\u0010óÃæä«\u0099ØvKÁ²\u0003\u0019\u008f)ª";
      int var8 = "áÓÇ~\u0097Iát T\u0006ü\u008c÷\"\u008f\u009aTh\u009a1÷ºC{,dä\u0082}ËoÞý\u000e\u001b\u0013ì\u0011®h,FÝè¸¨aó\u0011U\u009c2ðÃ\u0013 Btî\u007f0B\u0080\u0083ñ PÉyRO\u0019Dhh\u0004×x\u0000\u0006Æ5£+#©G\u009d\u0010bAìÿ¯¸n`ªþ4R/8\n\u008f\u0010óÃæä«\u0099ØvKÁ²\u0003\u0019\u008f)ª"
         .length();
      char var5 = '8';
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
                     d = new String[6];
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

                  var6 = "À%\u0088\u0005\u001a5¡.\u009e³Û0çÚ¶&Ýi¿rÖu\u0086\u0095 g¢\u001e\u0012íé>\u001a÷1w?\u0097¨Zòì\u0019º\u0088:\u0080g\u0088Hä°ÔÄ\u0095øI";
                  var8 = "À%\u0088\u0005\u001a5¡.\u009e³Û0çÚ¶&Ýi¿rÖu\u0086\u0095 g¢\u001e\u0012íé>\u001a÷1w?\u0097¨Zòì\u0019º\u0088:\u0080g\u0088Hä°ÔÄ\u0095øI"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31881;
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
            throw new RuntimeException("com/zelix/_qb", var10);
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
         throw new RuntimeException("com/zelix/_qb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
