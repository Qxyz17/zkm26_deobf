package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _gl extends _n7 {
   List t;
   private static final long a = ess.a(5552064949079592190L, -2368663356259310837L, MethodHandles.lookup().lookupClass()).a(13608106528822L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"c">(11732, 7034610986406436303L ^ var2);
   }

   void R(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = a ^ var3;
      x44.a<"o">(this, 8142754257464332416L, var3).add(var2);
   }

   protected void G(Object[] param1) {
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
      // 004: checkcast com/zelix/_uu
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 7
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 3
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 2
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/Integer
      // 02e: invokevirtual java/lang/Integer.intValue ()I
      // 031: istore 5
      // 033: pop
      // 034: lload 3
      // 035: dup2
      // 036: ldc2_w 130298468579397
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 108780440013823
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 124056261134545
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 102087856021836
      // 04e: lxor
      // 04f: lstore 14
      // 051: pop2
      // 052: ldc2_w 1096596874045400213
      // 055: lload 3
      // 056: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 0
      // 05c: ldc2_w 1071557308710874974
      // 05f: lload 3
      // 060: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 06a: astore 17
      // 06c: istore 16
      // 06e: aload 17
      // 070: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 075: ifeq 1bf
      // 078: aload 17
      // 07a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07f: checkcast java/lang/String
      // 082: astore 18
      // 084: lload 3
      // 085: lconst_0
      // 086: lcmp
      // 087: ifle 199
      // 08a: aload 18
      // 08c: iload 16
      // 08e: ifeq 197
      // 091: bipush 0
      // 092: invokevirtual java/lang/String.charAt (I)C
      // 095: getstatic com/zelix/_gl.f J
      // 098: l2i
      // 099: if_icmpne 104
      // 09c: goto 0a9
      // 09f: ldc2_w 699099290347168186
      // 0a2: lload 3
      // 0a3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 6
      // 0ab: new java/lang/StringBuilder
      // 0ae: dup
      // 0af: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b2: sipush 24166
      // 0b5: ldc2_w 1619825770353094873
      // 0b8: lload 3
      // 0b9: lxor
      // 0ba: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/_gl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: aload 18
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: ldc "'"
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cf: lload 8
      // 0d1: bipush 2
      // 0d2: anewarray 174
      // 0d5: dup_x2
      // 0d6: dup_x2
      // 0d7: pop
      // 0d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0db: bipush 1
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x1
      // 0df: swap
      // 0e0: bipush 0
      // 0e1: swap
      // 0e2: aastore
      // 0e3: ldc2_w 1259892150344068944
      // 0e6: lload 3
      // 0e7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: iload 16
      // 0ee: lload 3
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: ifle 1bc
      // 0f4: ifne 1ba
      // 0f7: goto 104
      // 0fa: ldc2_w 699099290347168186
      // 0fd: lload 3
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 18
      // 106: lload 14
      // 108: bipush 2
      // 109: anewarray 174
      // 10c: dup_x2
      // 10d: dup_x2
      // 10e: pop
      // 10f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112: bipush 1
      // 113: swap
      // 114: aastore
      // 115: dup_x1
      // 116: swap
      // 117: bipush 0
      // 118: swap
      // 119: aastore
      // 11a: ldc2_w 1229738454404469134
      // 11d: lload 3
      // 11e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: astore 18
      // 125: aload 18
      // 127: lload 12
      // 129: ldc "?"
      // 12b: sipush 3503
      // 12e: ldc2_w 7552928365467345682
      // 131: lload 3
      // 132: lxor
      // 133: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/_gl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: bipush 4
      // 139: anewarray 174
      // 13c: dup_x1
      // 13d: swap
      // 13e: bipush 3
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: bipush 2
      // 144: swap
      // 145: aastore
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 1
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 0
      // 152: swap
      // 153: aastore
      // 154: ldc2_w 1373151682517321273
      // 157: lload 3
      // 158: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: astore 18
      // 15f: aload 18
      // 161: lload 12
      // 163: ldc "*"
      // 165: sipush 4054
      // 168: ldc2_w 7257815445307564394
      // 16b: lload 3
      // 16c: lxor
      // 16d: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/_gl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: bipush 4
      // 173: anewarray 174
      // 176: dup_x1
      // 177: swap
      // 178: bipush 3
      // 179: swap
      // 17a: aastore
      // 17b: dup_x1
      // 17c: swap
      // 17d: bipush 2
      // 17e: swap
      // 17f: aastore
      // 180: dup_x2
      // 181: dup_x2
      // 182: pop
      // 183: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 186: bipush 1
      // 187: swap
      // 188: aastore
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 0
      // 18c: swap
      // 18d: aastore
      // 18e: ldc2_w 1373151682517321273
      // 191: lload 3
      // 192: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: astore 18
      // 199: aload 6
      // 19b: lload 10
      // 19d: aload 18
      // 19f: bipush 2
      // 1a0: anewarray 174
      // 1a3: dup_x1
      // 1a4: swap
      // 1a5: bipush 1
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x2
      // 1a9: dup_x2
      // 1aa: pop
      // 1ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ae: bipush 0
      // 1af: swap
      // 1b0: aastore
      // 1b1: ldc2_w 1064583926297402469
      // 1b4: lload 3
      // 1b5: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: iload 16
      // 1bc: ifne 06e
      // 1bf: return
   }

   public _gl(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 66317748996728L;
      super(var4, var1);
      x44.a<"s">(this, new ArrayList(), 7418442468239738739L, var2);
   }

   static {
      long var5 = a ^ 58874543596698L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "K8z\u0099y\u008a\u001d¹´\u001b_ìèZ '\u008c¼\u00825³3Þ\u0006Hã³\u0004·~ã\t\\\u00175ÅØÆh\u009fc¿t\u0083\u0086Yõÿ[¼Ár\u008c\u0086DX!ÉÄ~I\u0083¯X,_t¬\u001d\u0087çª×\u0092§AD\u0004\u000fOÊëµÕm\u0000Rå\u0013Ã\"ÑÆ&Ið\u009f";
      int var13 = "K8z\u0099y\u008a\u001d¹´\u001b_ìèZ '\u008c¼\u00825³3Þ\u0006Hã³\u0004·~ã\t\\\u00175ÅØÆh\u009fc¿t\u0083\u0086Yõÿ[¼Ár\u008c\u0086DX!ÉÄ~I\u0083¯X,_t¬\u001d\u0087çª×\u0092§AD\u0004\u000fOÊëµÕm\u0000Rå\u0013Ã\"ÑÆ&Ið\u009f"
         .length();
      char var10 = 24;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = b(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     b = var14;
                     d = new String[4];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -7636238264048201355L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)((int)(var2 >>> 56)),
                           (byte)((int)(var2 >>> 48)),
                           (byte)((int)(var2 >>> 40)),
                           (byte)((int)(var2 >>> 32)),
                           (byte)((int)(var2 >>> 24)),
                           (byte)((int)(var2 >>> 16)),
                           (byte)((int)(var2 >>> 8)),
                           (byte)((int)var2)
                        }
                     );
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     f = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "5ïaö\u001c\u009d:Ì\u0086\u001b\u009csaI,Ú¬¸%\u000e[;\u0017\u008d\"J\u0006Þ¶\u009d½\b\u0018YÈòi\u0096¼1ûÂþØë\u008d«²¶\u008eÊ+\u0086Ò\u008b\u008dA";
                  var13 = "5ïaö\u001c\u009d:Ì\u0086\u001b\u009csaI,Ú¬¸%\u000e[;\u0017\u008d\"J\u0006Þ¶\u009d½\b\u0018YÈòi\u0096¼1ûÂþØë\u008d«²¶\u008eÊ+\u0086Ò\u008b\u008dA"
                     .length();
                  var10 = ' ';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12952;
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
            throw new RuntimeException("com/zelix/_gl", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/_gl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
