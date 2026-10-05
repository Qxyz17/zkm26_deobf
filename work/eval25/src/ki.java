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

public class ki extends kx {
   private static final long c = ess.a(2391929297599625133L, -8164399495688519963L, MethodHandles.lookup().lookupClass()).a(38344341213537L);
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);
   private static final long[] n;
   private static final Integer[] p;
   private static final Map q;

   public static int V(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = c ^ var1;
      return b<"g">(14952, 5718000886632712178L ^ var1).length();
   }

   protected void U(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 54918385829176L;
      long var7 = var2 ^ 139384863496255L;
      String var9 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var2) + b<"g">(8019, 1099412814128165935L ^ var2);
      PrintWriter var10 = x44.a<"i">(var4, new Object[]{var7}, -6519786688485244235L, var2);
      var10.println(var9);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var2), var9, -6519816233838018406L, var2);
   }

   protected void Y(Object[] var1) {
      _ur var2 = (_ur)var1[0];
      int var5 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var6 = (Long)var1[3];
      int var4 = (Integer)var1[4];
      long var8 = var6 ^ 4538559877319L;
      long var10 = var6 ^ 24826038111892L;
      x44.a<"o">(var2, new Object[]{var10, this}, -8356110322903395904L, var6);
      Object[] var10008 = new Object[]{null, null, null, null, var8, b<"g">(17573, 8166000318248830516L ^ var6)};
      var10008[3] = var4;
      var10008[2] = var3;
      var10008[1] = var5;
      var10008[0] = var2;
      x44.a<"o">(this, var10008, -7698716387196803538L, var6);
   }

   public static kd v(Object[] var0) {
      String var4 = (String)var0[0];
      long var2 = (Long)var0[1];
      _ur var1 = (_ur)var0[2];
      var2 = c ^ var2;
      long var5 = var2 ^ 1513061776671L;
      long var7 = var2 ^ 128903653838398L;
      long var9 = var2 ^ 124244144748972L;
      long var10001 = var2 ^ 58726910400131L;
      int var11 = (int)((var2 ^ 58726910400131L) >>> 48);
      int var12 = (int)((var2 ^ 58726910400131L) << 16 >>> 32);
      int var13 = (int)(var10001 << 48 >>> 48);
      BufferedReader var14 = new BufferedReader(new StringReader(var4));

      try {
         _m var15 = new _m((char)var11, var14, var12, (short)var13);
         jf var16 = x44.a<"m">(var15, new Object[]{var5}, -7111629940420198502L, var2);
         x44.a<"m">(var16, new Object[]{var9, null, var1}, -8998825562318530229L, var2);
         return x44.a<"m">((z9)var16, new Object[]{var7}, -7434668472059298432L, var2);
      } catch (a1 var18) {
         throw new _sk(x44.a<"m">(var18, -8909649488119316788L, var2));
      } catch (_sp var19) {
         throw new _sk(x44.a<"m">(var19, -6998940705698665470L, var2));
      }
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"g">(29049, 8961127461726386602L ^ var2);
   }

   public ki(int var1, long var2) {
      var2 = c ^ var2;
      long var10001 = var2 ^ 96916161552978L;
      int var4 = (int)((var2 ^ 96916161552978L) >>> 32);
      int var5 = (int)((var2 ^ 96916161552978L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      super(var1, var4, (byte)var5, var6);
   }

   public static String u(Object[] param0) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: invokevirtual java/lang/Integer.intValue ()I
      // 01c: istore 1
      // 01d: pop
      // 01e: getstatic com/zelix/ki.c J
      // 021: lload 2
      // 022: lxor
      // 023: lstore 2
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 60388564828944
      // 029: lxor
      // 02a: lstore 5
      // 02c: pop2
      // 02d: ldc2_w -1139283072722939506
      // 030: lload 2
      // 031: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: aload 4
      // 038: invokeinterface java/util/List.size ()I 1
      // 03d: istore 8
      // 03f: astore 7
      // 041: iload 8
      // 043: ifle 213
      // 046: ldc ""
      // 048: sipush 24411
      // 04b: ldc2_w 5227177959211608838
      // 04e: lload 2
      // 04f: lxor
      // 050: invokedynamic e (IJ)I bsm=com/zelix/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: iload 1
      // 056: lload 5
      // 058: sipush 14683
      // 05b: ldc2_w 7893028788273335554
      // 05e: lload 2
      // 05f: lxor
      // 060: invokedynamic e (IJ)I bsm=com/zelix/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: bipush 5
      // 066: anewarray 354
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
      // 08f: ldc2_w -938417162650454210
      // 092: lload 2
      // 093: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: astore 9
      // 09a: new java/lang/StringBuffer
      // 09d: dup
      // 09e: sipush 32115
      // 0a1: ldc2_w 6750331405827213608
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic e (IJ)I bsm=com/zelix/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: invokespecial java/lang/StringBuffer.<init> (I)V
      // 0ae: astore 10
      // 0b0: aload 10
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: getstatic com/zelix/mc.R Ljava/lang/String;
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: sipush 14952
      // 0c2: ldc2_w 5717983118704531672
      // 0c5: lload 2
      // 0c6: lxor
      // 0c7: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/ki.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: sipush 20285
      // 0cf: ldc2_w 349210169136692069
      // 0d2: lload 2
      // 0d3: lxor
      // 0d4: invokedynamic e (IJ)I bsm=com/zelix/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: iload 1
      // 0da: lload 5
      // 0dc: sipush 9383
      // 0df: ldc2_w 8997640560153088253
      // 0e2: lload 2
      // 0e3: lxor
      // 0e4: invokedynamic e (IJ)I bsm=com/zelix/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: bipush 5
      // 0ea: anewarray 354
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f2: bipush 4
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 3
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 103: bipush 2
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10b: bipush 1
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w -938417162650454210
      // 116: lload 2
      // 117: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 122: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 125: pop
      // 126: bipush 0
      // 127: istore 11
      // 129: iload 11
      // 12b: iload 8
      // 12d: if_icmpge 207
      // 130: aload 4
      // 132: iload 11
      // 134: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 139: astore 12
      // 13b: iload 11
      // 13d: lload 2
      // 13e: lconst_0
      // 13f: lcmp
      // 140: ifle 192
      // 143: aload 7
      // 145: ifnonnull 192
      // 148: ifle 16d
      // 14b: goto 158
      // 14e: ldc2_w -650083903886431188
      // 151: lload 2
      // 152: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: aload 10
      // 15a: aload 9
      // 15c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 15f: pop
      // 160: goto 16d
      // 163: ldc2_w -650083903886431188
      // 166: lload 2
      // 167: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: lload 2
      // 16e: lconst_0
      // 16f: lcmp
      // 170: ifle 183
      // 173: aload 10
      // 175: aload 12
      // 177: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 17a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 17d: aload 7
      // 17f: ifnonnull 1fe
      // 182: pop
      // 183: iload 11
      // 185: goto 192
      // 188: ldc2_w -650083903886431188
      // 18b: lload 2
      // 18c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: iload 8
      // 194: bipush 1
      // 195: isub
      // 196: if_icmpge 1d7
      // 199: aload 10
      // 19b: new java/lang/StringBuilder
      // 19e: dup
      // 19f: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a2: sipush 18790
      // 1a5: ldc2_w 6667798820150324179
      // 1a8: lload 2
      // 1a9: lxor
      // 1aa: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/ki.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b2: getstatic com/zelix/mc.R Ljava/lang/String;
      // 1b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1bb: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1be: pop
      // 1bf: aload 7
      // 1c1: lload 2
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: iflt 204
      // 1c7: ifnull 1ff
      // 1ca: goto 1d7
      // 1cd: ldc2_w -650083903886431188
      // 1d0: lload 2
      // 1d1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: aload 10
      // 1d9: new java/lang/StringBuilder
      // 1dc: dup
      // 1dd: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e0: ldc ";"
      // 1e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e5: getstatic com/zelix/mc.R Ljava/lang/String;
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ee: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1f1: goto 1fe
      // 1f4: ldc2_w -650083903886431188
      // 1f7: lload 2
      // 1f8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: athrow
      // 1fe: pop
      // 1ff: iinc 11 1
      // 202: aload 7
      // 204: ifnull 129
      // 207: aload 10
      // 209: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 20c: lload 2
      // 20d: lconst_0
      // 20e: lcmp
      // 20f: iflt 139
      // 212: areturn
      // 213: aconst_null
      // 214: areturn
   }

   static {
      long var11 = c ^ 134551417500997L;
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
      String var17 = "h\u001eW;#þU0_ÊFùDc°ÃûJþîbR\u009e\u001bg\u0095\u0090EÙçjÅi6\u0007½\u001b>¥\u0002¤3¤\u001cØ¸°.Ï\u0084¢#\u008b¬*«\"Þ£x\u001d\u00114÷¡þì?¹\u0081L8Ò\u00ad\u009c\u0018E÷&¼8$`?LÞ\u008c*ì\u001c¨\röÎ±nÿ#Ãï\u0016ü\u009då\u0092Å\u0086ë!¤³\u0011-7R\u0014°\u0010\r\u0087by!\u001a4rG\u0097HÞq \u0002\u0006\u0086\u0099p8èæVÂuÒONÀ,é\u0097\u001e\u001c¦ãÖ*u7z¢\\ºB\u000e´¯j:,³^\u0005qêÍ\u0086 \u009bF7ß\u0086âS+îCV F{zïl";
      int var19 = "h\u001eW;#þU0_ÊFùDc°ÃûJþîbR\u009e\u001bg\u0095\u0090EÙçjÅi6\u0007½\u001b>¥\u0002¤3¤\u001cØ¸°.Ï\u0084¢#\u008b¬*«\"Þ£x\u001d\u00114÷¡þì?¹\u0081L8Ò\u00ad\u009c\u0018E÷&¼8$`?LÞ\u008c*ì\u001c¨\röÎ±nÿ#Ãï\u0016ü\u009då\u0092Å\u0086ë!¤³\u0011-7R\u0014°\u0010\r\u0087by!\u001a4rG\u0097HÞq \u0002\u0006\u0086\u0099p8èæVÂuÒONÀ,é\u0097\u001e\u001c¦ãÖ*u7z¢\\ºB\u000e´¯j:,³^\u0005qêÍ\u0086 \u009bF7ß\u0086âS+îCV F{zïl"
         .length();
      char var16 = 'P';
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
                     k = var20;
                     l = new String[5];
                     q = new HashMap(13);
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
                     String var4 = "1<ï\u007f\u009dã\u0097~\tö¼ûçÛ¬\u0083\\â\u0096h\f\u0001`ò";
                     int var5 = "1<ï\u007f\u009dã\u0097~\tö¼ûçÛ¬\u0083\\â\u0096h\f\u0001`ò".length();
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
                                    n = var6;
                                    p = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "d\u007f=.¹eæþ²Dß*òf\u0088¦";
                                 var5 = "d\u007f=.¹eæþ²Dß*òf\u0088¦".length();
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

                  var17 = "¨õ\u008cV1ì\u0083j\u000f¤\u0006¡\u009a^}\u0014óáÏT/þ\u0086ú\u0010\u0013@×.AÜ·C\u0089\u00805\u0088\u0016®þ\u00ad";
                  var19 = "¨õ\u008cV1ì\u0083j\u000f¤\u0006¡\u009a^}\u0014óáÏT/þ\u0086ú\u0010\u0013@×.AÜ·C\u0089\u00805\u0088\u0016®þ\u00ad".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7006;
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
            throw new RuntimeException("com/zelix/ki", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         l[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
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
         throw new RuntimeException("com/zelix/ki" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3510;
      if (p[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ki", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
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
         throw new RuntimeException("com/zelix/ki" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
