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

public class pe implements wn {
   private as t;
   private u6 l;
   private _rv[] N;
   private boolean X;
   static String s;
   private static final long a = ess.a(611311033440995022L, 4562713381804352441L, MethodHandles.lookup().lookupClass()).a(221128444638542L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private void x(Object[] param1) {
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
      // 004: checkcast [Lcom/zelix/_rv;
      // 007: astore 11
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast [Lcom/zelix/_f2;
      // 00f: astore 10
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast [Lcom/zelix/_rv;
      // 017: astore 5
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast [Lcom/zelix/_rv;
      // 01f: astore 4
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/pg
      // 027: astore 9
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/lang/Boolean
      // 02f: astore 8
      // 031: dup
      // 032: bipush 6
      // 034: aaload
      // 035: checkcast java/util/Set
      // 038: astore 6
      // 03a: dup
      // 03b: bipush 7
      // 03d: aaload
      // 03e: checkcast java/lang/Long
      // 041: invokevirtual java/lang/Long.longValue ()J
      // 044: lstore 2
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast java/lang/Integer
      // 04c: invokevirtual java/lang/Integer.intValue ()I
      // 04f: istore 7
      // 051: pop
      // 052: getstatic com/zelix/pe.a J
      // 055: lload 2
      // 056: lxor
      // 057: lstore 2
      // 058: lload 2
      // 059: dup2
      // 05a: ldc2_w 20256093883023
      // 05d: lxor
      // 05e: lstore 12
      // 060: dup2
      // 061: ldc2_w 113200921134026
      // 064: lxor
      // 065: lstore 14
      // 067: dup2
      // 068: ldc2_w 23830682237997
      // 06b: lxor
      // 06c: lstore 16
      // 06e: dup2
      // 06f: ldc2_w 44984824962532
      // 072: lxor
      // 073: lstore 18
      // 075: pop2
      // 076: ldc2_w 2155905524704862321
      // 079: lload 2
      // 07a: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: astore 20
      // 081: aload 11
      // 083: aload 20
      // 085: ifnull 0c1
      // 088: ifnull 0bc
      // 08b: goto 098
      // 08e: ldc2_w 318708826567386210
      // 091: lload 2
      // 092: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 0
      // 099: aload 11
      // 09b: ldc2_w 1813858944906641561
      // 09e: lload 2
      // 09f: invokedynamic r (Ljava/lang/Object;[Lcom/zelix/_rv;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: aload 0
      // 0a5: bipush 1
      // 0a6: ldc2_w 365618280783630262
      // 0a9: lload 2
      // 0aa: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: goto 0bc
      // 0b2: ldc2_w 318708826567386210
      // 0b5: lload 2
      // 0b6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 9
      // 0be: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 0c1: checkcast java/lang/String
      // 0c4: astore 21
      // 0c6: lload 2
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 0f3
      // 0cc: aload 21
      // 0ce: ifnull 0f3
      // 0d1: aload 0
      // 0d2: ldc2_w 1781214439143641682
      // 0d5: lload 2
      // 0d6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aload 21
      // 0dd: ldc2_w 1863838972012972424
      // 0e0: lload 2
      // 0e1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: goto 0f3
      // 0e9: ldc2_w 318708826567386210
      // 0ec: lload 2
      // 0ed: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: lload 2
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: ifle 167
      // 0f9: iload 7
      // 0fb: bipush 1
      // 0fc: if_icmpne 179
      // 0ff: aload 0
      // 100: ldc2_w 163458986023974269
      // 103: lload 2
      // 104: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/u6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: aload 0
      // 10a: ldc2_w 1813858944906641561
      // 10d: lload 2
      // 10e: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: aload 10
      // 115: aload 5
      // 117: aload 4
      // 119: aload 9
      // 11b: aload 8
      // 11d: aload 6
      // 11f: lload 14
      // 121: aconst_null
      // 122: checkcast com/zelix/_r
      // 125: bipush 9
      // 127: anewarray 77
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 8
      // 12e: swap
      // 12f: aastore
      // 130: dup_x2
      // 131: dup_x2
      // 132: pop
      // 133: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 136: bipush 7
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 6
      // 13e: swap
      // 13f: aastore
      // 140: dup_x1
      // 141: swap
      // 142: bipush 5
      // 143: swap
      // 144: aastore
      // 145: dup_x1
      // 146: swap
      // 147: bipush 4
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 3
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 2
      // 152: swap
      // 153: aastore
      // 154: dup_x1
      // 155: swap
      // 156: bipush 1
      // 157: swap
      // 158: aastore
      // 159: dup_x1
      // 15a: swap
      // 15b: bipush 0
      // 15c: swap
      // 15d: aastore
      // 15e: ldc2_w 1751794979226843600
      // 161: lload 2
      // 162: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: aload 20
      // 169: ifnonnull 218
      // 16c: goto 179
      // 16f: ldc2_w 318708826567386210
      // 172: lload 2
      // 173: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 0
      // 17a: ldc2_w 163458986023974269
      // 17d: lload 2
      // 17e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/u6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: lload 12
      // 185: bipush 1
      // 186: anewarray 77
      // 189: dup_x2
      // 18a: dup_x2
      // 18b: pop
      // 18c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w 392410176505439774
      // 195: lload 2
      // 196: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: astore 22
      // 19d: aload 20
      // 19f: lload 2
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: iflt 1e8
      // 1a5: ifnull 1e0
      // 1a8: aload 22
      // 1aa: ifnonnull 1eb
      // 1ad: goto 1ba
      // 1b0: ldc2_w 318708826567386210
      // 1b3: lload 2
      // 1b4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: aload 0
      // 1bb: lload 18
      // 1bd: bipush 1
      // 1be: anewarray 77
      // 1c1: dup_x2
      // 1c2: dup_x2
      // 1c3: pop
      // 1c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c7: bipush 0
      // 1c8: swap
      // 1c9: aastore
      // 1ca: ldc2_w 487449283895083323
      // 1cd: lload 2
      // 1ce: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: goto 1e0
      // 1d6: ldc2_w 318708826567386210
      // 1d9: lload 2
      // 1da: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: lload 2
      // 1e1: lconst_0
      // 1e2: lcmp
      // 1e3: ifle 20b
      // 1e6: aload 20
      // 1e8: ifnonnull 218
      // 1eb: aload 0
      // 1ec: aload 22
      // 1ee: lload 16
      // 1f0: bipush 2
      // 1f1: anewarray 77
      // 1f4: dup_x2
      // 1f5: dup_x2
      // 1f6: pop
      // 1f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fa: bipush 1
      // 1fb: swap
      // 1fc: aastore
      // 1fd: dup_x1
      // 1fe: swap
      // 1ff: bipush 0
      // 200: swap
      // 201: aastore
      // 202: ldc2_w 503981210718701901
      // 205: lload 2
      // 206: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: goto 218
      // 20e: ldc2_w 318708826567386210
      // 211: lload 2
      // 212: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: return
   }

   private void M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 9849990283567L;
      x44.a<"l">(this, new Object[]{var4, null}, -1718525551947168424L, var2);
   }

   private void A(Object[] var1) {
      po var4 = (po)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 104734728701828L;
      long var7 = var2 ^ 86898061066183L;
      _dx var9 = new _dx(this);
      new d8(
         x44.a<"j">(this, -3144660659770285214L, var2),
         var7,
         x44.a<"o">(-3426494804843310146L, var2) + a<"c">(7735, 5648359579695969001L ^ var2),
         var4,
         x44.a<"v">(new Object[]{a<"c">(28635, 1681827580100772609L ^ var2), var5}, -3677878080565487254L, var2),
         a<"c">(5916, 4838526449492687811L ^ var2),
         x44.a<"v">(new Object[]{a<"c">(19536, 3398712266641842313L ^ var2), var5}, -3677878080565487254L, var2),
         x44.a<"j">(this, -3555741687566908339L, var2),
         var9
      );
   }

   public void U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 77373350332552L;
      x44.a<"l">(x44.a<"h">(this, 820160453961710680L, var2), true, 901310903905585498L, var2);
      x44.a<"l">(x44.a<"h">(this, 820160453961710680L, var2), 1124319271053207177L, var2);
      u6 var10000 = x44.a<"h">(this, 820160453961710680L, var2);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = false;
      x44.a<"l">(var10000, var10004, 1473186582562828324L, var2);
   }

   private void y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 138499960307033L;
      long var6 = var2 ^ 134379711089659L;
      x44.a<"i">(
         this,
         new Object[]{x44.a<"o">(x44.a<"k">(this, -5362988292937268565L, var2), new Object[]{var4}, -5574205769610276408L, var2), var6},
         -5681027431067763045L,
         var2
      );
   }

   static {
      long var9 = a ^ 39515363791793L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "Ó¡a¸4\u0094\u0098?<FÕ\u00014ÁÌ´\b)\u0015@X\u0086ª\u000e\u0018\u0014Eª\u0085`ì\u008dÖ]Æ¦³\u0005&#Ï\u008d\u0094\u001e}aÉ?I\u0010f!ºßl\t¾Ërö!Ä/ûüÇ Ùçü'²\u0082²Y\u001bÐ2b0\u0090¡ùÌ$é\u0095\u0095s?î@ORÓ\u0002¢J\u0084\u0018\u007f\u0019'\u000b«ÇM¨\u001a\u009f\u0097@.}\u001b\u0090\u00adÈ\u0005ß ÏÄN";
      int var6 = "Ó¡a¸4\u0094\u0098?<FÕ\u00014ÁÌ´\b)\u0015@X\u0086ª\u000e\u0018\u0014Eª\u0085`ì\u008dÖ]Æ¦³\u0005&#Ï\u008d\u0094\u001e}aÉ?I\u0010f!ºßl\t¾Ërö!Ä/ûüÇ Ùçü'²\u0082²Y\u001bÐ2b0\u0090¡ùÌ$é\u0095\u0095s?î@ORÓ\u0002¢J\u0084\u0018\u007f\u0019'\u000b«ÇM¨\u001a\u009f\u0097@.}\u001b\u0090\u00adÈ\u0005ß ÏÄN"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[7];
                     x44.a<"q">(a<"c">(23247, 6202168045042110525L ^ var9), 8528936318095291792L, var9);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "@\u0087\\3e.ÎÝVÞ¶ú\u0083Ò\u0018!(\u0007f\u0010¿°¬HU}jt\u0018í¸¨¥¬\u00069Ò1\u0087J¢»\u0094\u001bÖ\u001e zú~\u0084Â4\u0014\u0019I\u0006";
                  var6 = "@\u0087\\3e.ÎÝVÞ¶ú\u0083Ò\u0018!(\u0007f\u0010¿°¬HU}jt\u0018í¸¨¥¬\u00069Ò1\u0087J¢»\u0094\u001bÖ\u001e zú~\u0084Â4\u0014\u0019I\u0006"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   public pe(byte var1, u6 var2, as var3, long var4) {
      long var6 = ((long)var1 << 56 | var4 << 8 >>> 8) ^ a;
      long var8 = var6 ^ 134146833446382L;
      long var10 = var6 ^ 101915957067468L;
      long var12 = var6 ^ 138271107859276L;
      super();
      x44.a<"s">(this, var2, 4406158130997676572L, var6);
      x44.a<"s">(this, var3, 2871411402783403315L, var6);
      x44.a<"h">(var2, false, 4235076425861807902L, var6);
      Object[] var10004 = new Object[]{null, var10};
      var10004[0] = true;
      x44.a<"h">(var2, var10004, 2465111168174409312L, var6);
      x44.a<"n">(this, new Object[]{x44.a<"h">(var2, new Object[]{var8}, 4184818859934996863L, var6), var12}, 4152292815734388268L, var6);
   }

   private void K(Object[] var1) {
      long var2 = (Long)var1[0];
      _rv[] var4 = (_rv[])var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 104901418303897L;
      _d0 var7 = new _d0(this);
      x44.a<"o">(x44.a<"k">(this, 6443109070658580051L, var2), false, 6812072099515784017L, var2);
      new u2(
         var5,
         x44.a<"k">(this, 6443109070658580051L, var2),
         x44.a<"n">(6720438800559595151L, var2) + a<"c">(30698, 169497558877738496L ^ var2),
         a<"c">(15140, 7239787194176920269L ^ var2),
         true,
         x44.a<"o">(x44.a<"k">(this, 4870108207957821820L, var2), 6762867786432789841L, var2),
         x44.a<"o">(x44.a<"k">(this, 4870108207957821820L, var2), 5059874382818431663L, var2),
         null,
         var7
      );
   }

   private void r(Object[] param1) {
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
      // 04: checkcast com/zelix/po
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic com/zelix/pe.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 86542634328908
      // 27: lxor
      // 28: lstore 6
      // 2a: dup2
      // 2b: ldc2_w 1315518122065
      // 2e: lxor
      // 2f: lstore 8
      // 31: pop2
      // 32: ldc2_w -3478074252144791007
      // 35: lload 2
      // 36: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: aload 5
      // 3d: invokevirtual java/lang/Integer.intValue ()I
      // 40: istore 11
      // 42: astore 10
      // 44: iload 11
      // 46: bipush 1
      // 47: if_icmpne de
      // 4a: aload 0
      // 4b: aload 10
      // 4d: ifnull b5
      // 50: goto 5d
      // 53: ldc2_w -3009404286569581006
      // 56: lload 2
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: lload 2
      // 5e: lconst_0
      // 5f: lcmp
      // 60: ifle a8
      // 63: ldc2_w -3784103019101252919
      // 66: lload 2
      // 67: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: ifnonnull a7
      // 6f: goto 7c
      // 72: ldc2_w -3009404286569581006
      // 75: lload 2
      // 76: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 0
      // 7d: lload 8
      // 7f: bipush 1
      // 80: anewarray 77
      // 83: dup_x2
      // 84: dup_x2
      // 85: pop
      // 86: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 89: bipush 0
      // 8a: swap
      // 8b: aastore
      // 8c: ldc2_w -3077993352562571077
      // 8f: lload 2
      // 90: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: aload 10
      // 97: ifnonnull de
      // 9a: goto a7
      // 9d: ldc2_w -3009404286569581006
      // a0: lload 2
      // a1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: aload 0
      // a8: goto b5
      // ab: ldc2_w -3009404286569581006
      // ae: lload 2
      // af: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: aload 0
      // b6: ldc2_w -3784103019101252919
      // b9: lload 2
      // ba: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: lload 6
      // c1: dup2_x1
      // c2: pop2
      // c3: bipush 2
      // c4: anewarray 77
      // c7: dup_x1
      // c8: swap
      // c9: bipush 1
      // ca: swap
      // cb: aastore
      // cc: dup_x2
      // cd: dup_x2
      // ce: pop
      // cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d2: bipush 0
      // d3: swap
      // d4: aastore
      // d5: ldc2_w -3871454807733049541
      // d8: lload 2
      // d9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: return
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13175;
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
            throw new RuntimeException("com/zelix/pe", var10);
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
         throw new RuntimeException("com/zelix/pe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
