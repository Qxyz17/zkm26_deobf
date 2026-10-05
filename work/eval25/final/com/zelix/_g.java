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

public class _g extends _r {
   final p6 s;
   private static final long a = ess.a(7134954621034979372L, -3407374790439020871L, MethodHandles.lookup().lookupClass()).a(156438893914019L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   _g(p6 var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 42698765184168L;
      this.s = var1;
      super(var4);
   }

   public void e(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 47196508895794
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 29522028701449
      // 018: lxor
      // 019: dup2
      // 01a: bipush 48
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 6
      // 020: dup2
      // 021: bipush 16
      // 023: lshl
      // 024: bipush 48
      // 026: lushr
      // 027: l2i
      // 028: istore 7
      // 02a: dup2
      // 02b: bipush 32
      // 02d: lshl
      // 02e: bipush 32
      // 030: lushr
      // 031: l2i
      // 032: istore 8
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 4643662381117
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 10387254809803
      // 040: lxor
      // 041: lstore 11
      // 043: dup2
      // 044: ldc2_w 73206727340758
      // 047: lxor
      // 048: lstore 13
      // 04a: pop2
      // 04b: ldc2_w -482092846953855787
      // 04e: lload 2
      // 04f: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: astore 15
      // 056: aload 0
      // 057: aload 15
      // 059: ifnull 0cd
      // 05c: lload 11
      // 05e: bipush 1
      // 05f: anewarray 19
      // 062: dup_x2
      // 063: dup_x2
      // 064: pop
      // 065: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068: bipush 0
      // 069: swap
      // 06a: aastore
      // 06b: ldc2_w -209730085241010659
      // 06e: lload 2
      // 06f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: ifeq 0bf
      // 077: goto 084
      // 07a: ldc2_w -1769771575205096581
      // 07d: lload 2
      // 07e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: aload 0
      // 085: ldc2_w -525369337532024195
      // 088: lload 2
      // 089: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/p6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: lload 9
      // 090: dup2_x1
      // 091: pop2
      // 092: bipush 2
      // 093: anewarray 19
      // 096: dup_x1
      // 097: swap
      // 098: bipush 1
      // 099: swap
      // 09a: aastore
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 0
      // 0a2: swap
      // 0a3: aastore
      // 0a4: ldc2_w -1967134805447717733
      // 0a7: lload 2
      // 0a8: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: aload 15
      // 0af: ifnonnull 218
      // 0b2: goto 0bf
      // 0b5: ldc2_w -1769771575205096581
      // 0b8: lload 2
      // 0b9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: goto 0cd
      // 0c3: ldc2_w -1769771575205096581
      // 0c6: lload 2
      // 0c7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: lload 4
      // 0cf: bipush 1
      // 0d0: anewarray 19
      // 0d3: dup_x2
      // 0d4: dup_x2
      // 0d5: pop
      // 0d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d9: bipush 0
      // 0da: swap
      // 0db: aastore
      // 0dc: ldc2_w -1824208797876978584
      // 0df: lload 2
      // 0e0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: aload 15
      // 0e7: ifnull 142
      // 0ea: ifnull 145
      // 0ed: goto 0fa
      // 0f0: ldc2_w -1769771575205096581
      // 0f3: lload 2
      // 0f4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: new java/lang/StringBuilder
      // 0fd: dup
      // 0fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 101: sipush 5808
      // 104: ldc2_w 698817973758137645
      // 107: lload 2
      // 108: lxor
      // 109: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 111: aload 0
      // 112: lload 4
      // 114: bipush 1
      // 115: anewarray 19
      // 118: dup_x2
      // 119: dup_x2
      // 11a: pop
      // 11b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11e: bipush 0
      // 11f: swap
      // 120: aastore
      // 121: ldc2_w -1824208797876978584
      // 124: lload 2
      // 125: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: ldc "."
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 135: goto 142
      // 138: ldc2_w -1769771575205096581
      // 13b: lload 2
      // 13c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: goto 147
      // 145: ldc ""
      // 147: astore 16
      // 149: new com/zelix/gv
      // 14c: dup
      // 14d: aload 0
      // 14e: ldc2_w -525369337532024195
      // 151: lload 2
      // 152: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/p6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: ldc2_w -1826495368383239960
      // 15a: lload 2
      // 15b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/u6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: iload 6
      // 162: i2s
      // 163: swap
      // 164: iload 7
      // 166: i2c
      // 167: swap
      // 168: sipush 28085
      // 16b: ldc2_w 2512236159286537771
      // 16e: lload 2
      // 16f: lxor
      // 170: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: iload 8
      // 177: sipush 10020
      // 17a: ldc2_w 5837749511306618043
      // 17d: lload 2
      // 17e: lxor
      // 17f: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: new java/lang/StringBuilder
      // 187: dup
      // 188: invokespecial java/lang/StringBuilder.<init> ()V
      // 18b: sipush 25369
      // 18e: ldc2_w 1152109663784394882
      // 191: lload 2
      // 192: lxor
      // 193: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19b: aload 16
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a0: sipush 24540
      // 1a3: ldc2_w 8149507719839374404
      // 1a6: lload 2
      // 1a7: lxor
      // 1a8: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: sipush 28398
      // 1b3: ldc2_w 556076904623762804
      // 1b6: lload 2
      // 1b7: lxor
      // 1b8: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c0: sipush 18858
      // 1c3: ldc2_w 2508151379746802227
      // 1c6: lload 2
      // 1c7: lxor
      // 1c8: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d3: invokespecial com/zelix/gv.<init> (SCLjavax/swing/JFrame;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
      // 1d6: pop
      // 1d7: aload 0
      // 1d8: ldc2_w -525369337532024195
      // 1db: lload 2
      // 1dc: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/p6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: lload 13
      // 1e3: dup2_x1
      // 1e4: pop2
      // 1e5: aload 0
      // 1e6: ldc2_w -525369337532024195
      // 1e9: lload 2
      // 1ea: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/p6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: ldc2_w -1736393713919830130
      // 1f2: lload 2
      // 1f3: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: bipush 3
      // 1f9: anewarray 19
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: bipush 2
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: bipush 1
      // 204: swap
      // 205: aastore
      // 206: dup_x2
      // 207: dup_x2
      // 208: pop
      // 209: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20c: bipush 0
      // 20d: swap
      // 20e: aastore
      // 20f: ldc2_w -74139731504111163
      // 212: lload 2
      // 213: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: return
   }

   static {
      long var0 = a ^ 109484234817358L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u0091DT°ìñ»ªN{9·\u008cøx\u0006\u00ad¯\u0090\u0010F°eÊh_v?Ýþ\u0012D§8c#©dT\n1°\u000e\u009cÁÉ¡\u0011xñº6Y\\\u0096Ù(ü,Nõ\u0006\u0018cÎA¶§9 É\b4®9ðuào[Ì¸\u0010Øõø\u0086üË\u0094p(ª#\u009bwÛ@1¤ï.\u0010i\u00adÑfµàýà¢\u000bSµ\u001e\u001b¿ñi}\u0007èX\u0096z4\u008dÅ\u0096'ô\u0013qEG#O`tä¼\u0011sr\u0086\u0097U1ä$må\u0010±AO\u000bkm´ñX¦×ªTe{¿:\t\u0005a¹3\u0090«øa\u0018¶Cª\u009f·\"(²ê·ykÌ\u001b,]ÍßÎ!q\u0097n)\u009dEZáÁaYÍµ0B!§\u0011°\u0006\u0007IsPò]É\u008e<Rî£6$ç.\u0098g\u0086Û¿c<I\u0000!\u0099f\u0016ì(½\u008d±ÔÃJd\tª&\u0005\u0000l²q(Y\u0013!\u0083R¼\u0090I\u001e'kÃ1]\u0085Æ7Õ$°\u0002\u008eIQ";
      int var8 = "\u0091DT°ìñ»ªN{9·\u008cøx\u0006\u00ad¯\u0090\u0010F°eÊh_v?Ýþ\u0012D§8c#©dT\n1°\u000e\u009cÁÉ¡\u0011xñº6Y\\\u0096Ù(ü,Nõ\u0006\u0018cÎA¶§9 É\b4®9ðuào[Ì¸\u0010Øõø\u0086üË\u0094p(ª#\u009bwÛ@1¤ï.\u0010i\u00adÑfµàýà¢\u000bSµ\u001e\u001b¿ñi}\u0007èX\u0096z4\u008dÅ\u0096'ô\u0013qEG#O`tä¼\u0011sr\u0086\u0097U1ä$må\u0010±AO\u000bkm´ñX¦×ªTe{¿:\t\u0005a¹3\u0090«øa\u0018¶Cª\u009f·\"(²ê·ykÌ\u001b,]ÍßÎ!q\u0097n)\u009dEZáÁaYÍµ0B!§\u0011°\u0006\u0007IsPò]É\u008e<Rî£6$ç.\u0098g\u0086Û¿c<I\u0000!\u0099f\u0016ì(½\u008d±ÔÃJd\tª&\u0005\u0000l²q(Y\u0013!\u0083R¼\u0090I\u001e'kÃ1]\u0085Æ7Õ$°\u0002\u008eIQ"
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
                     c = var9;
                     d = new String[7];
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

                  var6 = "\u007fÄS·¤3ª(Ö\tªQ\u008c×õ±\u008a\u0016·¿¨Ï0\u008c\u0010N \u007f\u0084í\u001cM\u0083pHé\u0087\bG,ç";
                  var8 = "\u007fÄS·¤3ª(Ö\tªQ\u008c×õ±\u008a\u0016·¿¨Ï0\u008c\u0010N \u007f\u0084í\u001cM\u0083pHé\u0087\bG,ç".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28301;
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
            throw new RuntimeException("com/zelix/_g", var10);
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
         throw new RuntimeException("com/zelix/_g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
