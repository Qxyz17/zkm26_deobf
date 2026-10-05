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

public class z7 extends jf implements _un {
   private String A;
   private static final long a = ess.a(5637114029126886305L, -4150152384405955429L, MethodHandles.lookup().lookupClass()).a(223868934164207L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public z7(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 5939845169854L;
      super(var4, var1);
   }

   public void t(Object[] param1) {
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
      // 00f: checkcast com/zelix/_za
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ur
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 12619343063191
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 60900272621577
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 72662818385492
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 50052436472016
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 60295149180194
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 0
      // 044: lxor
      // 045: lstore 16
      // 047: dup2
      // 048: ldc2_w 128085609659678
      // 04b: lxor
      // 04c: lstore 18
      // 04e: dup2
      // 04f: ldc2_w 134528422017690
      // 052: lxor
      // 053: lstore 20
      // 055: dup2
      // 056: ldc2_w 113353931186623
      // 059: lxor
      // 05a: lstore 22
      // 05c: dup2
      // 05d: ldc2_w 2679952629242
      // 060: lxor
      // 061: lstore 24
      // 063: pop2
      // 064: aload 0
      // 065: lload 20
      // 067: bipush 1
      // 068: anewarray 230
      // 06b: dup_x2
      // 06c: dup_x2
      // 06d: pop
      // 06e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: ldc2_w 7145691849331111744
      // 077: lload 4
      // 079: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: istore 27
      // 080: aload 0
      // 081: bipush 0
      // 082: invokevirtual com/zelix/z7.e (I)Lcom/zelix/_za;
      // 085: lload 16
      // 087: aload 0
      // 088: aload 2
      // 089: bipush 3
      // 08a: anewarray 230
      // 08d: dup_x1
      // 08e: swap
      // 08f: bipush 2
      // 090: swap
      // 091: aastore
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
      // 0a0: ldc2_w 8818198965911889370
      // 0a3: lload 4
      // 0a5: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: ldc2_w 9148277501292601163
      // 0ad: lload 4
      // 0af: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: aload 3
      // 0b5: checkcast com/zelix/za
      // 0b8: astore 28
      // 0ba: astore 26
      // 0bc: aload 0
      // 0bd: ldc2_w 9026508589918925648
      // 0c0: lload 4
      // 0c2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: aload 26
      // 0c9: ifnonnull 12f
      // 0cc: ifnull 244
      // 0cf: goto 0dd
      // 0d2: ldc2_w 8714143740091356894
      // 0d5: lload 4
      // 0d7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 28
      // 0df: lload 14
      // 0e1: bipush 1
      // 0e2: anewarray 230
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: ldc2_w 7000607624208587079
      // 0f1: lload 4
      // 0f3: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: aload 0
      // 0f9: ldc2_w 9026508589918925648
      // 0fc: lload 4
      // 0fe: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: lload 18
      // 105: bipush 2
      // 106: anewarray 230
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 1
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: bipush 0
      // 115: swap
      // 116: aastore
      // 117: ldc2_w 7432834548637523359
      // 11a: lload 4
      // 11c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: goto 12f
      // 124: ldc2_w 8714143740091356894
      // 127: lload 4
      // 129: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: astore 29
      // 131: aload 0
      // 132: ldc2_w 9026508589918925648
      // 135: lload 4
      // 137: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: lload 10
      // 13e: bipush 2
      // 13f: anewarray 230
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 1
      // 149: swap
      // 14a: aastore
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: ldc2_w 8787057217635590446
      // 153: lload 4
      // 155: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: astore 30
      // 15c: aload 29
      // 15e: invokevirtual java/lang/String.length ()I
      // 161: aload 26
      // 163: ifnonnull 1a0
      // 166: ifle 19b
      // 169: goto 177
      // 16c: ldc2_w 8714143740091356894
      // 16f: lload 4
      // 171: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: new com/zelix/_fx
      // 17a: dup
      // 17b: aload 29
      // 17d: lload 24
      // 17f: invokespecial com/zelix/_fx.<init> (Ljava/lang/String;J)V
      // 182: astore 31
      // 184: aload 28
      // 186: aload 31
      // 188: bipush 1
      // 189: anewarray 230
      // 18c: dup_x1
      // 18d: swap
      // 18e: bipush 0
      // 18f: swap
      // 190: aastore
      // 191: ldc2_w 7167151269751321407
      // 194: lload 4
      // 196: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: aload 30
      // 19d: invokevirtual java/lang/String.length ()I
      // 1a0: ifle 1d2
      // 1a3: new com/zelix/_f1
      // 1a6: dup
      // 1a7: aload 30
      // 1a9: lload 8
      // 1ab: invokespecial com/zelix/_f1.<init> (Ljava/lang/String;J)V
      // 1ae: astore 31
      // 1b0: aload 28
      // 1b2: lload 12
      // 1b4: aload 31
      // 1b6: bipush 2
      // 1b7: anewarray 230
      // 1ba: dup_x1
      // 1bb: swap
      // 1bc: bipush 1
      // 1bd: swap
      // 1be: aastore
      // 1bf: dup_x2
      // 1c0: dup_x2
      // 1c1: pop
      // 1c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c5: bipush 0
      // 1c6: swap
      // 1c7: aastore
      // 1c8: ldc2_w 8988087116308480844
      // 1cb: lload 4
      // 1cd: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: aload 28
      // 1d4: sipush 22133
      // 1d7: ldc2_w 5196077550541899231
      // 1da: lload 4
      // 1dc: lxor
      // 1dd: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/z7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: bipush 1
      // 1e3: anewarray 230
      // 1e6: dup_x1
      // 1e7: swap
      // 1e8: bipush 0
      // 1e9: swap
      // 1ea: aastore
      // 1eb: ldc2_w 8957805035284271694
      // 1ee: lload 4
      // 1f0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: aload 28
      // 1f7: lload 22
      // 1f9: aconst_null
      // 1fa: bipush 2
      // 1fb: anewarray 230
      // 1fe: dup_x1
      // 1ff: swap
      // 200: bipush 1
      // 201: swap
      // 202: aastore
      // 203: dup_x2
      // 204: dup_x2
      // 205: pop
      // 206: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 209: bipush 0
      // 20a: swap
      // 20b: aastore
      // 20c: ldc2_w 8807744804132423581
      // 20f: lload 4
      // 211: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: aload 28
      // 218: sipush 32521
      // 21b: ldc2_w 86970169479867554
      // 21e: lload 4
      // 220: lxor
      // 221: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/z7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: lload 6
      // 228: bipush 2
      // 229: anewarray 230
      // 22c: dup_x2
      // 22d: dup_x2
      // 22e: pop
      // 22f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 232: bipush 1
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 0
      // 238: swap
      // 239: aastore
      // 23a: ldc2_w 8966299730605932621
      // 23d: lload 4
      // 23f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: return
   }

   public void m(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"r">(this, var2, 7589934424338343744L, var3);
   }

   static {
      long var0 = a ^ 125135141030195L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Ò+ÕQ\u000b\u0015÷GIoãÁ\u008bà\u0003×¬É\u0085ôTþÙ\u00908?\b}V§ýi%\u0014¬Î\u0000µW-7`¿ï÷a\u0081v\u0096\u0089Zù\fr0\u009dèfnlú>1H,¹¾@Ç\u001fGx}Þõ\u0019\u0091Óôl?";
      int var8 = "Ò+ÕQ\u000b\u0015÷GIoãÁ\u008bà\u0003×¬É\u0085ôTþÙ\u00908?\b}V§ýi%\u0014¬Î\u0000µW-7`¿ï÷a\u0081v\u0096\u0089Zù\fr0\u009dèfnlú>1H,¹¾@Ç\u001fGx}Þõ\u0019\u0091Óôl?"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9345;
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
            throw new RuntimeException("com/zelix/z7", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/z7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
