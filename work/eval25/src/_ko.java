package com.zelix;

import java.io.IOException;
import java.io.PrintWriter;
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

public class _ko implements Runnable {
   final pk f;
   final lm G;
   final _zz n;
   final _b i;
   final PrintWriter E;
   private static final long a = ess.a(7820518538697293511L, -4861847804836176866L, MethodHandles.lookup().lookupClass()).a(4785664346543L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   _ko(lm var1, _zz var2, pk var3, _b var4, PrintWriter var5) {
      this.G = var1;
      this.n = var2;
      this.f = var3;
      this.i = var4;
      this.E = var5;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_ko.a J
      // 003: ldc2_w 139927386864927
      // 006: lxor
      // 007: lstore 1
      // 008: lload 1
      // 009: dup2
      // 00a: ldc2_w 130556981277519
      // 00d: lxor
      // 00e: lstore 3
      // 00f: dup2
      // 010: ldc2_w 97473284159722
      // 013: lxor
      // 014: lstore 5
      // 016: dup2
      // 017: ldc2_w 36553990808027
      // 01a: lxor
      // 01b: lstore 7
      // 01d: pop2
      // 01e: ldc2_w -3110481779956758323
      // 021: lload 1
      // 022: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aconst_null
      // 028: astore 10
      // 02a: astore 9
      // 02c: new com/zelix/_ys
      // 02f: dup
      // 030: new java/io/FileWriter
      // 033: dup
      // 034: sipush 3859
      // 037: ldc2_w 3283629620830474434
      // 03a: lload 1
      // 03b: lxor
      // 03c: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/_ko.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: invokespecial java/io/FileWriter.<init> (Ljava/lang/String;)V
      // 044: bipush 1
      // 045: lload 3
      // 046: invokespecial com/zelix/_ys.<init> (Ljava/io/Writer;ZJ)V
      // 049: astore 10
      // 04b: goto 0ae
      // 04e: astore 11
      // 050: aload 0
      // 051: ldc2_w -3499263964488883330
      // 054: lload 1
      // 055: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_zz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: sipush 3152
      // 05d: ldc2_w 524881770963604354
      // 060: lload 1
      // 061: lxor
      // 062: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/_ko.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: new java/lang/StringBuilder
      // 06a: dup
      // 06b: invokespecial java/lang/StringBuilder.<init> ()V
      // 06e: sipush 31374
      // 071: ldc2_w 1512047977528583518
      // 074: lload 1
      // 075: lxor
      // 076: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/_ko.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07e: aload 11
      // 080: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 083: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08c: lload 7
      // 08e: bipush 3
      // 08f: anewarray 78
      // 092: dup_x2
      // 093: dup_x2
      // 094: pop
      // 095: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 098: bipush 2
      // 099: swap
      // 09a: aastore
      // 09b: dup_x1
      // 09c: swap
      // 09d: bipush 1
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: bipush 0
      // 0a3: swap
      // 0a4: aastore
      // 0a5: ldc2_w -3544659950755728226
      // 0a8: lload 1
      // 0a9: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: aconst_null
      // 0af: astore 11
      // 0b1: new java/io/PrintWriter
      // 0b4: dup
      // 0b5: new java/io/FileWriter
      // 0b8: dup
      // 0b9: sipush 6598
      // 0bc: ldc2_w 4840701588156974608
      // 0bf: lload 1
      // 0c0: lxor
      // 0c1: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/_ko.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: invokespecial java/io/FileWriter.<init> (Ljava/lang/String;)V
      // 0c9: bipush 1
      // 0ca: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;Z)V
      // 0cd: astore 11
      // 0cf: goto 132
      // 0d2: astore 12
      // 0d4: aload 0
      // 0d5: ldc2_w -3499263964488883330
      // 0d8: lload 1
      // 0d9: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_zz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: sipush 11200
      // 0e1: ldc2_w 7946747014603355159
      // 0e4: lload 1
      // 0e5: lxor
      // 0e6: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/_ko.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: new java/lang/StringBuilder
      // 0ee: dup
      // 0ef: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f2: sipush 9340
      // 0f5: ldc2_w 614483179576048559
      // 0f8: lload 1
      // 0f9: lxor
      // 0fa: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/_ko.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: aload 12
      // 104: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 107: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 110: lload 7
      // 112: bipush 3
      // 113: anewarray 78
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 2
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 1
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: bipush 0
      // 127: swap
      // 128: aastore
      // 129: ldc2_w -3544659950755728226
      // 12c: lload 1
      // 12d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: aload 0
      // 133: ldc2_w -3297115001473939110
      // 136: lload 1
      // 137: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: bipush 0
      // 13d: anewarray 254
      // 140: bipush 0
      // 141: anewarray 201
      // 144: aconst_null
      // 145: aconst_null
      // 146: aconst_null
      // 147: aconst_null
      // 148: aconst_null
      // 149: aconst_null
      // 14a: aconst_null
      // 14b: checkcast java/lang/String
      // 14e: bipush 0
      // 14f: anewarray 254
      // 152: bipush 0
      // 153: anewarray 254
      // 156: bipush 0
      // 157: anewarray 254
      // 15a: bipush 0
      // 15b: anewarray 254
      // 15e: bipush 1
      // 15f: aload 0
      // 160: ldc2_w -3499263964488883330
      // 163: lload 1
      // 164: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_zz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: aload 0
      // 16a: ldc2_w -3435628481089106209
      // 16d: lload 1
      // 16e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: aconst_null
      // 174: lload 5
      // 176: aconst_null
      // 177: checkcast com/zelix/_ur
      // 17a: aload 10
      // 17c: aload 11
      // 17e: new com/zelix/wp
      // 181: dup
      // 182: bipush 0
      // 183: invokespecial com/zelix/wp.<init> (I)V
      // 186: aload 0
      // 187: ldc2_w -3756037281132514588
      // 18a: lload 1
      // 18b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: bipush 23
      // 192: anewarray 78
      // 195: dup_x1
      // 196: swap
      // 197: bipush 22
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 21
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: bipush 20
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: bipush 19
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x1
      // 1ae: swap
      // 1af: bipush 18
      // 1b1: swap
      // 1b2: aastore
      // 1b3: dup_x2
      // 1b4: dup_x2
      // 1b5: pop
      // 1b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b9: bipush 17
      // 1bb: swap
      // 1bc: aastore
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: bipush 16
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x1
      // 1c4: swap
      // 1c5: bipush 15
      // 1c7: swap
      // 1c8: aastore
      // 1c9: dup_x1
      // 1ca: swap
      // 1cb: bipush 14
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1d4: bipush 13
      // 1d6: swap
      // 1d7: aastore
      // 1d8: dup_x1
      // 1d9: swap
      // 1da: bipush 12
      // 1dc: swap
      // 1dd: aastore
      // 1de: dup_x1
      // 1df: swap
      // 1e0: bipush 11
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x1
      // 1e5: swap
      // 1e6: bipush 10
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 9
      // 1ee: swap
      // 1ef: aastore
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: bipush 8
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 7
      // 1fa: swap
      // 1fb: aastore
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: bipush 6
      // 200: swap
      // 201: aastore
      // 202: dup_x1
      // 203: swap
      // 204: bipush 5
      // 205: swap
      // 206: aastore
      // 207: dup_x1
      // 208: swap
      // 209: bipush 4
      // 20a: swap
      // 20b: aastore
      // 20c: dup_x1
      // 20d: swap
      // 20e: bipush 3
      // 20f: swap
      // 210: aastore
      // 211: dup_x1
      // 212: swap
      // 213: bipush 2
      // 214: swap
      // 215: aastore
      // 216: dup_x1
      // 217: swap
      // 218: bipush 1
      // 219: swap
      // 21a: aastore
      // 21b: dup_x1
      // 21c: swap
      // 21d: bipush 0
      // 21e: swap
      // 21f: aastore
      // 220: ldc2_w -2946903982557053034
      // 223: lload 1
      // 224: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: pop
      // 22a: aload 10
      // 22c: aload 9
      // 22e: ifnonnull 25b
      // 231: ifnull 259
      // 234: goto 241
      // 237: ldc2_w -3425342345959449997
      // 23a: lload 1
      // 23b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: athrow
      // 241: aload 10
      // 243: ldc2_w -2949292712762153797
      // 246: lload 1
      // 247: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: goto 259
      // 24f: ldc2_w -3425342345959449997
      // 252: lload 1
      // 253: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: aload 11
      // 25b: aload 9
      // 25d: ifnonnull 272
      // 260: ifnull 27b
      // 263: goto 270
      // 266: ldc2_w -3425342345959449997
      // 269: lload 1
      // 26a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: athrow
      // 270: aload 11
      // 272: ldc2_w -2949292712762153797
      // 275: lload 1
      // 276: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: return
   }

   static {
      long var0 = a ^ 117911846085382L;
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
      String var6 = "x\u009acøòù.àW\u001c1¢elÐ\u009e@ÖR¢\u007fææ\u009amc»â\u001dÜ@\u008dÑ\u0001Ì\u0087 N\u0089\u0019÷\u0018\u009c~¥\u0001A^\u0086ÉÀì=Á\u0017`\u001c\u0091VCr\u0080NQ\fÁ\u0097,DA=\u0000±¾ï\u00adöZh|+H5Ö¬Í÷¾ª\u0018ØÕ®Î\u0010D¾\u008csñvcfJ\u0096Õ\u009b@)ààM^\u0018©\u0011&ÐÉ\u009e\u0099~vÜ%\u0005ý¶\u0088¡øS\u0019\u00adwYõo<\u009f\u0093\u0007|·\u009d\u000fZ ô\u0087Å\u008db¼ \u0096\u001d\u0002rZúì§\u000b\u009e©¡ñÔ²\u000buû\u0003ñO\\-\u008b©wZ_â×é¡";
      int var8 = "x\u009acøòù.àW\u001c1¢elÐ\u009e@ÖR¢\u007fææ\u009amc»â\u001dÜ@\u008dÑ\u0001Ì\u0087 N\u0089\u0019÷\u0018\u009c~¥\u0001A^\u0086ÉÀì=Á\u0017`\u001c\u0091VCr\u0080NQ\fÁ\u0097,DA=\u0000±¾ï\u00adöZh|+H5Ö¬Í÷¾ª\u0018ØÕ®Î\u0010D¾\u008csñvcfJ\u0096Õ\u009b@)ààM^\u0018©\u0011&ÐÉ\u009e\u0099~vÜ%\u0005ý¶\u0088¡øS\u0019\u00adwYõo<\u009f\u0093\u0007|·\u009d\u000fZ ô\u0087Å\u008db¼ \u0096\u001d\u0002rZúì§\u000b\u009e©¡ñÔ²\u000buû\u0003ñO\\-\u008b©wZ_â×é¡"
         .length();
      char var5 = 16;
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
                     c = new String[6];
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

                  var6 = "îçîz\nSÿ\u0011Çía{¤\u0011q\u000e\u008b\u000bæ\u0011gÀí¸ç\u0083\u009bq¥¸D¸vIÁ\u0092#6Ô3\u0010W'â'2\u0094ÞTA½\u0093Ð¯\u0094&¬";
                  var8 = "îçîz\nSÿ\u0011Çía{¤\u0011q\u000e\u008b\u000bæ\u0011gÀí¸ç\u0083\u009bq¥¸D¸vIÁ\u0092#6Ô3\u0010W'â'2\u0094ÞTA½\u0093Ð¯\u0094&¬".length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IOException a(IOException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17008;
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
            throw new RuntimeException("com/zelix/_ko", var10);
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
         throw new RuntimeException("com/zelix/_ko" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
