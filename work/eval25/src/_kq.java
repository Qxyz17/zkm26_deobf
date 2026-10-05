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

public class _kq extends _kr {
   private static final long f = ess.a(-7219025050249646431L, 1802649838766141268L, MethodHandles.lookup().lookupClass()).a(79427349992013L);
   private static final String[] R;
   private static final String[] S;
   private static final Map T = new HashMap(13);

   public final void X(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Map
      // 017: astore 5
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Map
      // 029: astore 4
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/util/Map
      // 031: astore 7
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/_8z
      // 03a: astore 6
      // 03c: pop
      // 03d: lload 2
      // 03e: dup2
      // 03f: ldc2_w 50525634640419
      // 042: lxor
      // 043: lstore 10
      // 045: dup2
      // 046: ldc2_w 70543496593817
      // 049: lxor
      // 04a: lstore 12
      // 04c: pop2
      // 04d: ldc2_w -2653834964154813916
      // 050: lload 2
      // 051: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: astore 14
      // 058: aload 9
      // 05a: aload 14
      // 05c: ifnonnull 119
      // 05f: ifnonnull 0cd
      // 062: goto 06f
      // 065: ldc2_w -2570914212548774091
      // 068: lload 2
      // 069: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: new com/zelix/_s2
      // 072: dup
      // 073: new java/lang/StringBuilder
      // 076: dup
      // 077: invokespecial java/lang/StringBuilder.<init> ()V
      // 07a: sipush 12232
      // 07d: ldc2_w 3706625596786110644
      // 080: lload 2
      // 081: lxor
      // 082: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/_kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: lload 12
      // 08c: aload 8
      // 08e: bipush 2
      // 08f: anewarray 142
      // 092: dup_x1
      // 093: swap
      // 094: bipush 1
      // 095: swap
      // 096: aastore
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w -4163314010655871518
      // 0a3: lload 2
      // 0a4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ac: sipush 30659
      // 0af: ldc2_w 1498017000129800377
      // 0b2: lload 2
      // 0b3: lxor
      // 0b4: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/_kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bf: invokespecial com/zelix/_s2.<init> (Ljava/lang/String;)V
      // 0c2: athrow
      // 0c3: ldc2_w -2570914212548774091
      // 0c6: lload 2
      // 0c7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: new java/lang/StringBuilder
      // 0d0: dup
      // 0d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d4: sipush 30350
      // 0d7: ldc2_w 5656772764057479664
      // 0da: lload 2
      // 0db: lxor
      // 0dc: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/_kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: aload 0
      // 0e5: ldc2_w -4125288569072156257
      // 0e8: lload 2
      // 0e9: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f1: sipush 421
      // 0f4: ldc2_w 6839205264585219806
      // 0f7: lload 2
      // 0f8: lxor
      // 0f9: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/_kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 101: aload 9
      // 103: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 106: sipush 19104
      // 109: ldc2_w 4451504519155095007
      // 10c: lload 2
      // 10d: lxor
      // 10e: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/_kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 119: astore 15
      // 11b: aload 0
      // 11c: lload 10
      // 11e: aload 8
      // 120: aload 5
      // 122: aload 15
      // 124: aload 9
      // 126: bipush 1
      // 127: bipush 6
      // 129: anewarray 142
      // 12c: dup_x1
      // 12d: swap
      // 12e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 131: bipush 5
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 4
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 3
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 2
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x2
      // 149: dup_x2
      // 14a: pop
      // 14b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14e: bipush 0
      // 14f: swap
      // 150: aastore
      // 151: ldc2_w -4577756258776114904
      // 154: lload 2
      // 155: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: return
   }

   public _kq(String var1, _8s var2, q2 var3, q2 var4, vm var5, _yv var6, _ug var7, _zk var8, long var9) {
      var9 = f ^ var9;
      long var11 = var9 ^ 59103691728929L;
      super(var1, var2, var3, var11, var4, var5, var6, var7, var8);
   }

   public final void h(Object[] param1) {
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
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/String
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/util/List
      // 20: astore 6
      // 22: pop
      // 23: lload 3
      // 24: dup2
      // 25: ldc2_w 57559441548277
      // 28: lxor
      // 29: lstore 7
      // 2b: dup2
      // 2c: ldc2_w 25652703034264
      // 2f: lxor
      // 30: lstore 9
      // 32: pop2
      // 33: ldc2_w -2221690421505669083
      // 36: lload 3
      // 37: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: astore 11
      // 3e: aload 11
      // 40: ifnonnull e9
      // 43: aload 2
      // 44: ifnonnull b2
      // 47: goto 54
      // 4a: ldc2_w -1850117047191024332
      // 4d: lload 3
      // 4e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: new com/zelix/_s2
      // 57: dup
      // 58: new java/lang/StringBuilder
      // 5b: dup
      // 5c: invokespecial java/lang/StringBuilder.<init> ()V
      // 5f: sipush 2967
      // 62: ldc2_w 5095321905489899246
      // 65: lload 3
      // 66: lxor
      // 67: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/_kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f: lload 9
      // 71: aload 5
      // 73: bipush 2
      // 74: anewarray 142
      // 77: dup_x1
      // 78: swap
      // 79: bipush 1
      // 7a: swap
      // 7b: aastore
      // 7c: dup_x2
      // 7d: dup_x2
      // 7e: pop
      // 7f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 82: bipush 0
      // 83: swap
      // 84: aastore
      // 85: ldc2_w -271983394697701405
      // 88: lload 3
      // 89: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: sipush 5412
      // 94: ldc2_w 2761832350663438428
      // 97: lload 3
      // 98: lxor
      // 99: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/_kq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a4: invokespecial com/zelix/_s2.<init> (Ljava/lang/String;)V
      // a7: athrow
      // a8: ldc2_w -1850117047191024332
      // ab: lload 3
      // ac: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 6
      // b4: aload 0
      // b5: aload 5
      // b7: lload 7
      // b9: aload 2
      // ba: bipush 1
      // bb: bipush 4
      // bc: anewarray 142
      // bf: dup_x1
      // c0: swap
      // c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c4: bipush 3
      // c5: swap
      // c6: aastore
      // c7: dup_x1
      // c8: swap
      // c9: bipush 2
      // ca: swap
      // cb: aastore
      // cc: dup_x2
      // cd: dup_x2
      // ce: pop
      // cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d2: bipush 1
      // d3: swap
      // d4: aastore
      // d5: dup_x1
      // d6: swap
      // d7: bipush 0
      // d8: swap
      // d9: aastore
      // da: ldc2_w -2282403210752475578
      // dd: lload 3
      // de: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // e8: pop
      // e9: return
   }

   public _kq(String var1, _yv var2, _ug var3, long var4, _zk var6) {
      var4 = f ^ var4;
      long var7 = var4 ^ 71083104396504L;
      super(var7, var1, var2, var3, var6);
   }

   static {
      long var0 = f ^ 97192548889381L;
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
      String var6 = "Ó\u001d¸\u009eC§¾àø\u0004 ÷¨/}/\u0010Þ¼#Ø,]p±yâ]ÂZy3\u0012@Ëxu\u009d¶ßÚ\u0010ý\u008f\fLT\u0010-\u0082\u008c®j\u0019n\u0083§é?V!zñÚFj{ò\u001b\u0000aµÃ\u0013\u0088\u0005íe#\u0001®#ß{Ê7\r\u001ceÏüÒû\u0091\u0097\u0086ä\t\u0010\\Î\u0084\u0002d[Ú\u009d\u0005\u0090ô\u001a`àlg\u0018\u0088Gf\"+h\u0084\u009a\u0097øßlªß¨CÉä\u0005¡\u00887\u0015Í";
      int var8 = "Ó\u001d¸\u009eC§¾àø\u0004 ÷¨/}/\u0010Þ¼#Ø,]p±yâ]ÂZy3\u0012@Ëxu\u009d¶ßÚ\u0010ý\u008f\fLT\u0010-\u0082\u008c®j\u0019n\u0083§é?V!zñÚFj{ò\u001b\u0000aµÃ\u0013\u0088\u0005íe#\u0001®#ß{Ê7\r\u001ceÏüÒû\u0091\u0097\u0086ä\t\u0010\\Î\u0084\u0002d[Ú\u009d\u0005\u0090ô\u001a`àlg\u0018\u0088Gf\"+h\u0084\u009a\u0097øßlªß¨CÉä\u0005¡\u00887\u0015Í"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     R = var9;
                     S = new String[7];
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

                  var6 = "\u0097Ésé\u0007åÔè\u001bI\"m0\u0014\nN@,\u0091\u0006;=\u0090à\u000eÕwdA\u008e½\"\u0000\u009dç§ulô~²\u0098)R\u00061üè\u0081Ù·\u0094N\u0080I<À\u0089Ä\u009aèË\u0081üý\u0096äðyªðd¸0\u0095\u0089½8\u0094\u001f\u0013";
                  var8 = "\u0097Ésé\u0007åÔè\u001bI\"m0\u0014\nN@,\u0091\u0006;=\u0090à\u000eÕwdA\u008e½\"\u0000\u009dç§ulô~²\u0098)R\u00061üè\u0081Ù·\u0094N\u0080I<À\u0089Ä\u009aèË\u0081üý\u0096äðyªðd¸0\u0095\u0089½8\u0094\u001f\u0013"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj c(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2381;
      if (S[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])T.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               T.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_kq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = R[var5].getBytes("ISO-8859-1");
         S[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return S[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_kq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
