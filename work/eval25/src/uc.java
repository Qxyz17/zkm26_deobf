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
import javax.swing.JFrame;

public class uc extends uj {
   er M;
   e8 r;
   en E;
   private static final long c = ess.a(-6502950011629305395L, 8613839225412675314L, MethodHandles.lookup().lookupClass()).a(264126483049493L);
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   void S(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 36471657904402L;
      long var6 = var2 ^ 48228935404460L;
      int var8 = (int)((var2 ^ 132148535808185L) >>> 48);
      long var9 = (var2 ^ 132148535808185L) << 16 >>> 16;
      long var11 = var2 ^ 120409143990423L;

      uc var10000;
      en var10001;
      en var10002;
      uc var10003;
      pn var10004;
      boolean var10005;
      label22: {
         try {
            var10000 = this;
            var10001 = new en;
            var10002 = var10001;
            var10003 = this;
            var10004 = x44.a<"l">(this, -5402679116386116631L, var2);
            if (x44.a<"l">(this, -6141178301222292618L, var2) == 1) {
               var10005 = true;
               break label22;
            }
         } catch (gj var17) {
            throw x44.a<"p">(var17, -5942721347313357591L, var2);
         }

         var10005 = false;
      }

      var10002./* $VF: Unable to resugar constructor */<init>(var10003, var10004, var11, var10005, x44.a<"l">(this, -6141178301222292618L, var2));
      x44.a<"s">(var10000, var10001, -5650698502338910874L, var2);
      var10004 = x44.a<"l">(this, -5402679116386116631L, var2);
      var10005 = x44.a<"l">(this, -6141178301222292618L, var2) != 3;
      int var13 = x44.a<"l">(this, -6141178301222292618L, var2);
      boolean var14 = var10005;
      pn var15 = var10004;
      x44.a<"s">(this, new ez(var6, this, var15, var14, var13), -5524196782640041052L, var2);
      x44.a<"s">(
         this,
         new er(this, (short)var8, x44.a<"l">(this, -5402679116386116631L, var2), var9, x44.a<"l">(this, -6141178301222292618L, var2)),
         -5786362211348910107L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"d">(22204, 2052268812405389507L ^ var2),
         null,
         x44.a<"l">(this, -5650698502338910874L, var2),
         x44.a<"p">(new Object[]{c<"d">(18430, 2715084164397115783L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"d">(7687, 7300056256971534448L ^ var2),
         null,
         x44.a<"l">(this, -5524196782640041052L, var2),
         x44.a<"p">(new Object[]{c<"d">(12304, 1752045286471622253L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"d">(28679, 6032795963899190908L ^ var2),
         null,
         x44.a<"l">(this, -5786362211348910107L, var2),
         x44.a<"p">(new Object[]{c<"d">(19979, 5405632769025876081L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(x44.a<"l">(this, -5828574482245427290L, var2), x44.a<"l">(this, -5786362211348910107L, var2), -5491807491691095246L, var2);
   }

   public uc(JFrame var1, String var2, pn var3, int var4, char var5, eq var6, int var7, int var8) {
      long var9 = ((long)var5 << 48 | (long)var7 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ c;
      long var11 = var9 ^ 40901464620079L;
      super(var1, var11, var2, var3, var4, var6);
   }

   protected final void R(Object[] param1) {
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
      // 00e: ldc2_w 19307919075270
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w -8642576093970008683
      // 018: lload 2
      // 019: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: astore 6
      // 020: aload 0
      // 021: ldc2_w -7517849078236852709
      // 024: lload 2
      // 025: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: bipush 1
      // 02b: aload 6
      // 02d: ifnull 094
      // 030: if_icmpne 07c
      // 033: goto 040
      // 036: ldc2_w -8004536267033374332
      // 039: lload 2
      // 03a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: athrow
      // 040: sipush 25339
      // 043: ldc2_w 2075068549441401326
      // 046: lload 2
      // 047: lxor
      // 048: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: lload 4
      // 04f: bipush 2
      // 050: anewarray 270
      // 053: dup_x2
      // 054: dup_x2
      // 055: pop
      // 056: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059: bipush 1
      // 05a: swap
      // 05b: aastore
      // 05c: dup_x1
      // 05d: swap
      // 05e: bipush 0
      // 05f: swap
      // 060: aastore
      // 061: ldc2_w -7554726856480850332
      // 064: lload 2
      // 065: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 6
      // 06c: ifnonnull 13d
      // 06f: goto 07c
      // 072: ldc2_w -8004536267033374332
      // 075: lload 2
      // 076: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: aload 0
      // 07d: ldc2_w -7517849078236852709
      // 080: lload 2
      // 081: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: bipush 2
      // 087: goto 094
      // 08a: ldc2_w -8004536267033374332
      // 08d: lload 2
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: iflt 103
      // 09a: aload 6
      // 09c: ifnull 103
      // 09f: if_icmpne 0eb
      // 0a2: goto 0af
      // 0a5: ldc2_w -8004536267033374332
      // 0a8: lload 2
      // 0a9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: sipush 27024
      // 0b2: ldc2_w 5841513296136845953
      // 0b5: lload 2
      // 0b6: lxor
      // 0b7: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: lload 4
      // 0be: bipush 2
      // 0bf: anewarray 270
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 1
      // 0c9: swap
      // 0ca: aastore
      // 0cb: dup_x1
      // 0cc: swap
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: ldc2_w -7554726856480850332
      // 0d3: lload 2
      // 0d4: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: aload 6
      // 0db: ifnonnull 13d
      // 0de: goto 0eb
      // 0e1: ldc2_w -8004536267033374332
      // 0e4: lload 2
      // 0e5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: ldc2_w -7517849078236852709
      // 0ef: lload 2
      // 0f0: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: bipush 3
      // 0f6: goto 103
      // 0f9: ldc2_w -8004536267033374332
      // 0fc: lload 2
      // 0fd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: if_icmpne 13d
      // 106: sipush 3275
      // 109: ldc2_w 4326500533058887640
      // 10c: lload 2
      // 10d: lxor
      // 10e: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: lload 4
      // 115: bipush 2
      // 116: anewarray 270
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 1
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 0
      // 125: swap
      // 126: aastore
      // 127: ldc2_w -7554726856480850332
      // 12a: lload 2
      // 12b: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: goto 13d
      // 133: ldc2_w -8004536267033374332
      // 136: lload 2
      // 137: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: return
   }

   static {
      long var0 = c ^ 22943826364575L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "Öó0ë\"\u0085w´\u0003Ö/\u0093Ø\u0015\u0007Ô1\u0002\u0092s¤\"ÛO\u009c6V¨\u009cjr$ç\u008f3\u0098Göóý\u0010:\u0019V\u007f½Ý\u0015NtèBê\u0003ètÀ01\u0002\u0091\u009aÒn«\u0081·j\u00893Lkdõ\u009dJ7\u0092\\:y5¦Öå\u0004\u009e»\u0015Ð\u000bÉ7ïn|[\u0007Ñ\u0018>ÆEÀ:p\u0010\u008a?k\u0018o¦\u0018\u008chOýSn*\u009fÒ\u0010³Ù|ð%\u0094|\u008a\u0010>¤Ð\u009aØ\u0016¹(÷\u0083\u0094ó\u0099¿ý¯¾7v¾F\u0099KN\u0018»\u0015yí±\u008d\u0083Å}\u0084'kÖú\u0094¬\u0014\u0000\u009cÄ'Å\u0099@é½\u008cE.Ä4:\u001fo7\u0091\u0006ÊÚ\u0014[\u009eJ\u0092\u001e8\u001dV\u0012\\¼Õ\u0098\u0091$æ\u009a8$¿ÔÂ¿:\u00ad\u0019íy\u0003?O«\u0082ÁtË2´U<óÆ¥\u0013ÉÖ\u008cÒ";
      int var8 = "Öó0ë\"\u0085w´\u0003Ö/\u0093Ø\u0015\u0007Ô1\u0002\u0092s¤\"ÛO\u009c6V¨\u009cjr$ç\u008f3\u0098Göóý\u0010:\u0019V\u007f½Ý\u0015NtèBê\u0003ètÀ01\u0002\u0091\u009aÒn«\u0081·j\u00893Lkdõ\u009dJ7\u0092\\:y5¦Öå\u0004\u009e»\u0015Ð\u000bÉ7ïn|[\u0007Ñ\u0018>ÆEÀ:p\u0010\u008a?k\u0018o¦\u0018\u008chOýSn*\u009fÒ\u0010³Ù|ð%\u0094|\u008a\u0010>¤Ð\u009aØ\u0016¹(÷\u0083\u0094ó\u0099¿ý¯¾7v¾F\u0099KN\u0018»\u0015yí±\u008d\u0083Å}\u0084'kÖú\u0094¬\u0014\u0000\u009cÄ'Å\u0099@é½\u008cE.Ä4:\u001fo7\u0091\u0006ÊÚ\u0014[\u009eJ\u0092\u001e8\u001dV\u0012\\¼Õ\u0098\u0091$æ\u009a8$¿ÔÂ¿:\u00ad\u0019íy\u0003?O«\u0082ÁtË2´U<óÆ¥\u0013ÉÖ\u008cÒ"
         .length();
      char var5 = '(';
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
                     d = var9;
                     g = new String[9];
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

                  var6 = "\u0086\u0010K'\u009fM\rh\u0003}Å¡Ex3E()tö´c¼ª,W_N\u009cM;\u008e<õ\u0088Ç\u0086R\u0010@\u000f\"\u009c\u0018'\u0089\u000f\u0084¢©Õ©×LJàñ";
                  var8 = "\u0086\u0010K'\u009fM\rh\u0003}Å¡Ex3E()tö´c¼ª,W_N\u009cM;\u008e<õ\u0088Ç\u0086R\u0010@\u000f\"\u009c\u0018'\u0089\u000f\u0084¢©Õ©×LJàñ"
                     .length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20292;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/uc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/uc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
