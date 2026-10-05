package com.zelix;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
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

public class ku extends kd {
   private static final long a = ess.a(-7293340197218033339L, -958286641919940632L, MethodHandles.lookup().lookupClass()).a(210711981378713L);
   private static final String[] c;
   private static final String[] k;
   private static final Map l = new HashMap(13);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map p;

   protected void U(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 54918385829176L;
      long var7 = var2 ^ 139384863496255L;
      PrintWriter var9 = x44.a<"i">(var4, new Object[]{var7}, -6519786688485244235L, var2);
      String var10 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var2) + b<"l">(5442, 8582304444892301130L ^ var2);
      var9.println(var10);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var2), var10, -6519816233838018406L, var2);
   }

   public ku(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 86757747937034L;
      super(var1, var4);
   }

   public static kd R(Object[] var0) {
      String var1 = (String)var0[0];
      _ur var4 = (_ur)var0[1];
      long var2 = (Long)var0[2];
      var2 = a ^ var2;
      long var5 = var2 ^ 41306304157309L;
      long var10001 = var2 ^ 105587126368594L;
      int var7 = (int)((var2 ^ 105587126368594L) >>> 48);
      int var8 = (int)((var2 ^ 105587126368594L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var2 ^ 55393885442024L;
      long var12 = var2 ^ 61859330158885L;
      BufferedReader var14 = new BufferedReader(new StringReader(var1));

      try {
         _m var15 = new _m((char)var7, var14, var8, (short)var9);
         jf var16 = x44.a<"l">(var15, new Object[]{var10}, 8318441227535075714L, var2);
         x44.a<"l">(var16, new Object[]{var5, null, var4}, 7839899138979690138L, var2);
         return x44.a<"l">((c3)var16, new Object[]{var12}, 8413968821254460362L, var2);
      } catch (a1 var18) {
         throw new _sk(x44.a<"l">(var18, 7749504808048054557L, var2));
      } catch (_sp var19) {
         throw new _sk(x44.a<"l">(var19, 8146890694259491795L, var2));
      }
   }

   protected void Y(Object[] var1) {
      _ur var3 = (_ur)var1[0];
      int var5 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var6 = (Long)var1[3];
      int var2 = (Integer)var1[4];
      long var8 = var6 ^ 4538559877319L;
      long var10 = var6 ^ 127328065750494L;
      x44.a<"o">(var3, new Object[]{this, var10}, -7922484273070173459L, var6);
      Object[] var10008 = new Object[]{null, null, null, null, var8, b<"l">(6991, 8582046392361115816L ^ var6)};
      var10008[3] = var2;
      var10008[2] = var4;
      var10008[1] = var5;
      var10008[0] = var3;
      x44.a<"o">(this, var10008, -7698716387196803538L, var6);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"l">(7714, 4380280630246403972L ^ var2);
   }

   public static String q(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/util/List
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 4
      // 01d: pop
      // 01e: getstatic com/zelix/ku.a J
      // 021: lload 2
      // 022: lxor
      // 023: lstore 2
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 131679832781339
      // 029: lxor
      // 02a: lstore 5
      // 02c: pop2
      // 02d: ldc2_w 4700409165907452037
      // 030: lload 2
      // 031: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: aload 1
      // 037: invokeinterface java/util/List.size ()I 1
      // 03c: istore 8
      // 03e: astore 7
      // 040: iload 8
      // 042: ifle 218
      // 045: ldc ""
      // 047: sipush 29279
      // 04a: ldc2_w 520230336985180205
      // 04d: lload 2
      // 04e: lxor
      // 04f: invokedynamic z (IJ)I bsm=com/zelix/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: iload 4
      // 056: lload 5
      // 058: sipush 15283
      // 05b: ldc2_w 1443504569040757191
      // 05e: lload 2
      // 05f: lxor
      // 060: invokedynamic z (IJ)I bsm=com/zelix/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: bipush 5
      // 066: anewarray 68
      // 069: dup_x1
      // 06a: swap
      // 06b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06e: bipush 4
      // 06f: swap
      // 070: aastore
      // 071: dup_x2
      // 072: dup_x2
      // 073: pop
      // 074: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 077: bipush 3
      // 078: swap
      // 079: aastore
      // 07a: dup_x1
      // 07b: swap
      // 07c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07f: bipush 2
      // 080: swap
      // 081: aastore
      // 082: dup_x1
      // 083: swap
      // 084: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 087: bipush 1
      // 088: swap
      // 089: aastore
      // 08a: dup_x1
      // 08b: swap
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: ldc2_w 4895786351180006965
      // 092: lload 2
      // 093: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: astore 9
      // 09a: new java/lang/StringBuffer
      // 09d: dup
      // 09e: sipush 16826
      // 0a1: ldc2_w 8177266255427017677
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic z (IJ)I bsm=com/zelix/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: invokespecial java/lang/StringBuffer.<init> (I)V
      // 0ae: astore 10
      // 0b0: aload 10
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: getstatic com/zelix/mc.R Ljava/lang/String;
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: sipush 21102
      // 0c2: ldc2_w 4094264494497659046
      // 0c5: lload 2
      // 0c6: lxor
      // 0c7: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/ku.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: sipush 28231
      // 0cf: ldc2_w 2743334282820695089
      // 0d2: lload 2
      // 0d3: lxor
      // 0d4: invokedynamic z (IJ)I bsm=com/zelix/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: iload 4
      // 0db: lload 5
      // 0dd: sipush 9838
      // 0e0: ldc2_w 5225346858078927899
      // 0e3: lload 2
      // 0e4: lxor
      // 0e5: invokedynamic z (IJ)I bsm=com/zelix/ku.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: bipush 5
      // 0eb: anewarray 68
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 4
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 3
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: bipush 2
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10c: bipush 1
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: ldc2_w 4895786351180006965
      // 117: lload 2
      // 118: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 123: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 126: pop
      // 127: bipush 0
      // 128: istore 11
      // 12a: iload 11
      // 12c: iload 8
      // 12e: if_icmpge 20c
      // 131: aload 1
      // 132: iload 11
      // 134: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 139: checkcast java/lang/String
      // 13c: aload 7
      // 13e: ifnonnull 217
      // 141: astore 12
      // 143: iload 11
      // 145: lload 2
      // 146: lconst_0
      // 147: lcmp
      // 148: iflt 197
      // 14b: aload 7
      // 14d: ifnonnull 197
      // 150: ifle 175
      // 153: goto 160
      // 156: ldc2_w 4812420058350244391
      // 159: lload 2
      // 15a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 10
      // 162: aload 9
      // 164: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 167: pop
      // 168: goto 175
      // 16b: ldc2_w 4812420058350244391
      // 16e: lload 2
      // 16f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: athrow
      // 175: lload 2
      // 176: lconst_0
      // 177: lcmp
      // 178: iflt 188
      // 17b: aload 10
      // 17d: aload 12
      // 17f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 182: aload 7
      // 184: ifnonnull 203
      // 187: pop
      // 188: iload 11
      // 18a: goto 197
      // 18d: ldc2_w 4812420058350244391
      // 190: lload 2
      // 191: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: iload 8
      // 199: bipush 1
      // 19a: isub
      // 19b: if_icmpge 1dc
      // 19e: aload 10
      // 1a0: new java/lang/StringBuilder
      // 1a3: dup
      // 1a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a7: sipush 9055
      // 1aa: ldc2_w 2813718215429294483
      // 1ad: lload 2
      // 1ae: lxor
      // 1af: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/ku.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: getstatic com/zelix/mc.R Ljava/lang/String;
      // 1ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c0: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c3: pop
      // 1c4: aload 7
      // 1c6: lload 2
      // 1c7: lconst_0
      // 1c8: lcmp
      // 1c9: ifle 209
      // 1cc: ifnull 204
      // 1cf: goto 1dc
      // 1d2: ldc2_w 4812420058350244391
      // 1d5: lload 2
      // 1d6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: aload 10
      // 1de: new java/lang/StringBuilder
      // 1e1: dup
      // 1e2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e5: ldc ";"
      // 1e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ea: getstatic com/zelix/mc.R Ljava/lang/String;
      // 1ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f3: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1f6: goto 203
      // 1f9: ldc2_w 4812420058350244391
      // 1fc: lload 2
      // 1fd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: pop
      // 204: iinc 11 1
      // 207: aload 7
      // 209: ifnull 12a
      // 20c: aload 10
      // 20e: lload 2
      // 20f: lconst_0
      // 210: lcmp
      // 211: ifle 139
      // 214: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 217: areturn
      // 218: aconst_null
      // 219: areturn
   }

   static {
      long var11 = a ^ 53628785837488L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "R\u008c\t¼\u0011f.RCµ6ÒS]ªþ\u0010\u0084 znC9Ó\u0018Û\u001b5é.\u0087ý?(w\n\rm\u0011µ\f\u0003ØØÝV°ª\u008f\bp\u008aÕ=\tÇ\u0094×\u000bÄ\u0017u\u0098ÑíÕ\u0016ÒõÊ¨>âÞ";
      int var19 = "R\u008c\t¼\u0011f.RCµ6ÒS]ªþ\u0010\u0084 znC9Ó\u0018Û\u001b5é.\u0087ý?(w\n\rm\u0011µ\f\u0003ØØÝV°ª\u008f\bp\u008aÕ=\tÇ\u0094×\u000bÄ\u0017u\u0098ÑíÕ\u0016ÒõÊ¨>âÞ"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     c = var20;
                     k = new String[5];
                     p = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "u¬C\u0081\u0098\u0090è''\u000b\u0086¤ªÈgõN\u009frGïòxä";
                     int var5 = "u¬C\u0081\u0098\u0090è''\u000b\u0086¤ªÈgõN\u009frGïòxä".length();
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
                                    m = var6;
                                    n = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "¨&s¨è\u0014\u0015\u009dðîdÂí¶¾À";
                                 var5 = "¨&s¨è\u0014\u0015\u009dðîdÂí¶¾À".length();
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

                  var17 = "\u00972û\u0091\u0099\u0090\"£QCÇ{\u0016\u00133@\\A\u0091FÑ«oý\u0010\u0003\u008b¯9ÎÒ\u009fb*Jè\u009c\u001bû\u0096\u0013";
                  var19 = "\u00972û\u0091\u0099\u0090\"£QCÇ{\u0016\u00133@\\A\u0091FÑ«oý\u0010\u0003\u008b¯9ÎÒ\u009fb*Jè\u009c\u001bû\u0096\u0013".length();
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25128;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ku", var10);
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
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ku" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4754;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ku", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/ku" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
