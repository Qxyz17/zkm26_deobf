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
import javax.swing.DefaultListModel;

public class q7 extends q9 {
   private static final long j = ess.a(-4065866134707383052L, 3615959518084377451L, MethodHandles.lookup().lookupClass()).a(173644655273829L);
   private static final String[] R;
   private static final String[] V;
   private static final Map ab = new HashMap(13);
   private static final long[] ib;
   private static final Integer[] jb;
   private static final Map kb;

   int p(Object[] var1) {
      long var2 = (Long)var1[0];
      return f<"u">(17722, 8669073606583092942L ^ var2);
   }

   void x(Object[] var1) {
      q0 var4 = (q0)var1[0];
      long var2 = (Long)var1[1];
      DefaultListModel var5 = (DefaultListModel)x44.a<"h">(var4, -7053401072140697607L, var2);
      x44.a<"h">(var5, c<"s">(5983, 765323474386943309L ^ var2), -9161727778426999730L, var2);
      x44.a<"h">(var5, c<"s">(298, 7716901228732148543L ^ var2), -9161727778426999730L, var2);
      x44.a<"h">(var5, c<"s">(23939, 1682334506320148368L ^ var2), -9161727778426999730L, var2);
      x44.a<"h">(var5, c<"s">(9102, 8192089243654211993L ^ var2), -9161727778426999730L, var2);
   }

   q7(ir var1, pk var2, q0 var3, u6 var4, _yk var5, long var6) {
      var6 = j ^ var6;
      long var8 = (var6 ^ 75678575799545L) >>> 16;
      int var10 = (int)((var6 ^ 75678575799545L) << 48 >>> 48);
      super(var1, var2, var3, var8, (char)var10, var4, var5);
   }

   void A(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 109905980343723L;
      synchronized (x44.a<"j">(this, 9202756433567212425L, var2)) {
         x44.a<"n">(
            x44.a<"j">(this, 9202756433567212425L, var2),
            new Object[]{(ir)x44.a<"j">(this, 6924022117106356494L, var2), var4, var5},
            8812577606964457530L,
            var2
         );
      }
   }

   void D(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: pop
      // 017: lload 2
      // 018: dup2
      // 019: ldc2_w 109131063515343
      // 01c: lxor
      // 01d: lstore 5
      // 01f: dup2
      // 020: ldc2_w 136756473770011
      // 023: lxor
      // 024: lstore 7
      // 026: dup2
      // 027: ldc2_w 4880139196754
      // 02a: lxor
      // 02b: lstore 9
      // 02d: pop2
      // 02e: ldc2_w -2201304977838301975
      // 031: lload 2
      // 032: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: astore 11
      // 039: iload 4
      // 03b: sipush 28520
      // 03e: ldc2_w 6935423728623056744
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic u (IJ)I bsm=com/zelix/q7.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: iand
      // 049: aload 11
      // 04b: ifnull 0db
      // 04e: ifeq 0b5
      // 051: goto 05e
      // 054: ldc2_w -1854055692600313555
      // 057: lload 2
      // 058: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: iload 4
      // 060: sipush 10538
      // 063: ldc2_w 5478285773112979755
      // 066: lload 2
      // 067: lxor
      // 068: invokedynamic u (IJ)I bsm=com/zelix/q7.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: iand
      // 06e: lload 2
      // 06f: lconst_0
      // 070: lcmp
      // 071: iflt 0db
      // 074: aload 11
      // 076: ifnull 0db
      // 079: goto 086
      // 07c: ldc2_w -1854055692600313555
      // 07f: lload 2
      // 080: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: ifeq 0b5
      // 089: goto 096
      // 08c: ldc2_w -1854055692600313555
      // 08f: lload 2
      // 090: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: new com/zelix/_su
      // 099: dup
      // 09a: sipush 25562
      // 09d: ldc2_w 4448130603919796461
      // 0a0: lload 2
      // 0a1: lxor
      // 0a2: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/q7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: invokespecial com/zelix/_su.<init> (Ljava/lang/String;)V
      // 0aa: athrow
      // 0ab: ldc2_w -1854055692600313555
      // 0ae: lload 2
      // 0af: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: aload 11
      // 0b8: ifnull 188
      // 0bb: ldc2_w -348950420714223055
      // 0be: lload 2
      // 0bf: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/i8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: lload 7
      // 0c6: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // 0c9: lload 5
      // 0cb: invokevirtual com/zelix/hz.d (J)Z
      // 0ce: goto 0db
      // 0d1: ldc2_w -1854055692600313555
      // 0d4: lload 2
      // 0d5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: lload 2
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: ifle 0f4
      // 0e1: ifeq 187
      // 0e4: iload 4
      // 0e6: sipush 9634
      // 0e9: ldc2_w 2495811775767100832
      // 0ec: lload 2
      // 0ed: lxor
      // 0ee: invokedynamic u (IJ)I bsm=com/zelix/q7.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: iand
      // 0f4: aload 11
      // 0f6: lload 2
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 141
      // 0fc: ifnull 139
      // 0ff: goto 10c
      // 102: ldc2_w -1854055692600313555
      // 105: lload 2
      // 106: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: ifeq 168
      // 10f: goto 11c
      // 112: ldc2_w -1854055692600313555
      // 115: lload 2
      // 116: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: iload 4
      // 11e: sipush 4499
      // 121: ldc2_w 7887357078810102167
      // 124: lload 2
      // 125: lxor
      // 126: invokedynamic u (IJ)I bsm=com/zelix/q7.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: iand
      // 12c: goto 139
      // 12f: ldc2_w -1854055692600313555
      // 132: lload 2
      // 133: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: lload 2
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: ifle 165
      // 13f: aload 11
      // 141: ifnull 165
      // 144: ifeq 168
      // 147: goto 154
      // 14a: ldc2_w -1854055692600313555
      // 14d: lload 2
      // 14e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: iload 4
      // 156: bipush 1
      // 157: iand
      // 158: goto 165
      // 15b: ldc2_w -1854055692600313555
      // 15e: lload 2
      // 15f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: ifne 187
      // 168: new com/zelix/_su
      // 16b: dup
      // 16c: sipush 10566
      // 16f: ldc2_w 1864750080739811955
      // 172: lload 2
      // 173: lxor
      // 174: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/q7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: invokespecial com/zelix/_su.<init> (Ljava/lang/String;)V
      // 17c: athrow
      // 17d: ldc2_w -1854055692600313555
      // 180: lload 2
      // 181: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 0
      // 188: ldc2_w -1978887657115125578
      // 18b: lload 2
      // 18c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: dup
      // 192: astore 12
      // 194: monitorenter
      // 195: aload 0
      // 196: ldc2_w -348950420714223055
      // 199: lload 2
      // 19a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/i8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: lload 9
      // 1a1: iload 4
      // 1a3: bipush 2
      // 1a4: anewarray 127
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ac: bipush 1
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x2
      // 1b0: dup_x2
      // 1b1: pop
      // 1b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b5: bipush 0
      // 1b6: swap
      // 1b7: aastore
      // 1b8: ldc2_w -1922615113497894809
      // 1bb: lload 2
      // 1bc: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: aload 12
      // 1c3: monitorexit
      // 1c4: goto 1cf
      // 1c7: astore 13
      // 1c9: aload 12
      // 1cb: monitorexit
      // 1cc: aload 13
      // 1ce: athrow
      // 1cf: return
   }

   void X(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      super.X(new Object[]{var4});
      x44.a<"s">(this, 0, 3267071613471081882L, var2);
      x44.a<"s">(this, 1, 3817833767622077644L, var2);
      x44.a<"s">(this, f<"u">(16661, 3653916030745679667L ^ var2), 3482965656475517513L, var2);
      x44.a<"s">(this, f<"u">(2345, 8462753614262361867L ^ var2), 3019099461850913860L, var2);
   }

   static {
      long var11 = j ^ 51651608885577L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "ÿd»Á²\u0083\u0019ÿ~ç»8¡þ\u009d8ZôQ/í.ÈDãk/L=îÞk\u008ang¹»xU\u0091´áUpK\u0087ýªÔ÷ïûÜ÷\u0092xÎ\u0087lm3`£Ñ\u0018åc¸\u0091\u0011é\u0080\u000e¶\u0017á¡h\u0001\u00ad¶Ïø\u009bÕU\u0007È\u0015Xv9¯\u001e\u00803\u001fC¦1\nÚ\u009e\u009f}vUÈdÜØ\u0080skÁì0æÑÃÆcÈâ$ãè\u009d¥\u0087\u0006\tË\u0086\u0089WA1ÊU\u0018\u008fn\u0089\rß\u0090js4\u008f§\u009dÙ\\7Æª%4\u0098\u0018&.K\u0013\u0083u\u0007õ¹c\u0082b\u001aÞE\u0010\u0010l\u0014\u0012,\u0016é¡Z\u009b\u0017dêàÈÝ\u0081";
      int var19 = "ÿd»Á²\u0083\u0019ÿ~ç»8¡þ\u009d8ZôQ/í.ÈDãk/L=îÞk\u008ang¹»xU\u0091´áUpK\u0087ýªÔ÷ïûÜ÷\u0092xÎ\u0087lm3`£Ñ\u0018åc¸\u0091\u0011é\u0080\u000e¶\u0017á¡h\u0001\u00ad¶Ïø\u009bÕU\u0007È\u0015Xv9¯\u001e\u00803\u001fC¦1\nÚ\u009e\u009f}vUÈdÜØ\u0080skÁì0æÑÃÆcÈâ$ãè\u009d¥\u0087\u0006\tË\u0086\u0089WA1ÊU\u0018\u008fn\u0089\rß\u0090js4\u008f§\u009dÙ\\7Æª%4\u0098\u0018&.K\u0013\u0083u\u0007õ¹c\u0082b\u001aÞE\u0010\u0010l\u0014\u0012,\u0016é¡Z\u009b\u0017dêàÈÝ\u0081"
         .length();
      char var16 = '@';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     R = var20;
                     V = new String[6];
                     kb = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "ïváÙÓ¤³ð9º(rN\u0080\u009e\u0013F¤ø\u00ad¯«Í\u0013\u0017Ï!Þ\u008dy÷W!{à\u0091Åz\u0090Ò";
                     int var5 = "ïváÙÓ¤³ð9º(rN\u0080\u009e\u0013F¤ø\u00ad¯«Í\u0013\u0017Ï!Þ\u008dy÷W!{à\u0091Åz\u0090Ò".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    ib = var6;
                                    jb = new Integer[7];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "g°\u0017\u0088«\u0097S)¥[¹¥\u0005/e\u0007";
                                 var5 = "g°\u0017\u0088«\u0097S)¥[¹¥\u0005/e\u0007".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "£3\u0089N\u0007Éj\u009bû\u0090P¢E¦Q\u0093Û\u007fh\u008b<\u0095!Õ\u0018RRi\u009c×^\u008fß#b)MÏhq_\u001fñ\u00883Üëò\r";
                  var19 = "£3\u0089N\u0007Éj\u009bû\u0090P¢E¦Q\u0093Û\u007fh\u008b<\u0095!Õ\u0018RRi\u009c×^\u008fß#b)MÏhq_\u001fñ\u00883Üëò\r".length();
                  var16 = 24;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32285;
      if (V[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])ab.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               ab.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/q7", var10);
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
         V[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return V[var5];
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
         throw new RuntimeException("com/zelix/q7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int f(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27944;
      if (jb[var3] == null) {
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
         long var5 = ib[var3];
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
         Object[] var9 = (Object[])kb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               kb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/q7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/q7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
