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

public class u3 extends uj {
   en V;
   e8 m;
   private static final long c = ess.a(9101533391978025726L, 5565648725035208422L, MethodHandles.lookup().lookupClass()).a(31578066084863L);
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public u3(JFrame var1, String var2, pn var3, long var4, int var6, eq var7) {
      var4 = c ^ var4;
      long var8 = var4 ^ 17006839401391L;
      super(var1, var8, var2, var3, var6, var7);
   }

   void S(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 36471657904402L;
      long var6 = var2 ^ 48228935404460L;
      long var8 = var2 ^ 120409143990423L;

      u3 var10000;
      en var10001;
      en var10002;
      u3 var10003;
      pn var10004;
      boolean var10005;
      label17: {
         try {
            var10000 = this;
            var10001 = new en;
            var10002 = var10001;
            var10003 = this;
            var10004 = x44.a<"l">(this, -5402679116386116631L, var2);
            if (x44.a<"l">(this, -6141178301222292618L, var2) == 1) {
               var10005 = true;
               break label17;
            }
         } catch (gj var10) {
            throw x44.a<"p">(var10, -6187994107623141784L, var2);
         }

         var10005 = false;
      }

      var10002./* $VF: Unable to resugar constructor */<init>(var10003, var10004, var8, var10005, x44.a<"l">(this, -6141178301222292618L, var2));
      x44.a<"s">(var10000, var10001, -6109022973019432742L, var2);
      x44.a<"s">(
         this,
         new ez(var6, this, x44.a<"l">(this, -5402679116386116631L, var2), false, x44.a<"l">(this, -6141178301222292618L, var2)),
         -5394933508792878178L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"g">(15426, 3839452054956982007L ^ var2),
         null,
         x44.a<"l">(this, -6109022973019432742L, var2),
         x44.a<"p">(new Object[]{c<"g">(31963, 5315682395863547503L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"g">(18571, 1087903349309098555L ^ var2),
         null,
         x44.a<"l">(this, -5394933508792878178L, var2),
         x44.a<"p">(new Object[]{c<"g">(10526, 7398041543059614636L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(x44.a<"l">(this, -5828574482245427290L, var2), x44.a<"l">(this, -5394933508792878178L, var2), -5491807491691095246L, var2);
   }

   protected final void R(Object[] param1) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 19307919075270
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -8642576093970008683
      // 18: lload 2
      // 19: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: astore 6
      // 20: aload 6
      // 22: ifnull 7d
      // 25: aload 0
      // 26: ldc2_w -7517849078236852709
      // 29: lload 2
      // 2a: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: lload 2
      // 30: lconst_0
      // 31: lcmp
      // 32: iflt 8b
      // 35: bipush 1
      // 36: if_icmpne 88
      // 39: goto 46
      // 3c: ldc2_w -7533731749816782075
      // 3f: lload 2
      // 40: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: sipush 13274
      // 49: ldc2_w 768737082650397702
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: lload 4
      // 55: bipush 2
      // 56: anewarray 95
      // 59: dup_x2
      // 5a: dup_x2
      // 5b: pop
      // 5c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f: bipush 1
      // 60: swap
      // 61: aastore
      // 62: dup_x1
      // 63: swap
      // 64: bipush 0
      // 65: swap
      // 66: aastore
      // 67: ldc2_w -7554726856480850332
      // 6a: lload 2
      // 6b: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: goto 7d
      // 73: ldc2_w -7533731749816782075
      // 76: lload 2
      // 77: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: lload 2
      // 7e: lconst_0
      // 7f: lcmp
      // 80: ifle b2
      // 83: aload 6
      // 85: ifnonnull bf
      // 88: sipush 11522
      // 8b: ldc2_w 4481623479313961692
      // 8e: lload 2
      // 8f: lxor
      // 90: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: lload 4
      // 97: bipush 2
      // 98: anewarray 95
      // 9b: dup_x2
      // 9c: dup_x2
      // 9d: pop
      // 9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a1: bipush 1
      // a2: swap
      // a3: aastore
      // a4: dup_x1
      // a5: swap
      // a6: bipush 0
      // a7: swap
      // a8: aastore
      // a9: ldc2_w -7554726856480850332
      // ac: lload 2
      // ad: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: goto bf
      // b5: ldc2_w -7533731749816782075
      // b8: lload 2
      // b9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: athrow
      // bf: return
   }

   static {
      long var0 = c ^ 130790822836640L;
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
      String var6 = "\u008bwq\u008a`\u0017t´Ð·GQ2wüÖ\u0010;ãJ\u0092è VÉ´\u0088\u008d\u009e\u0083\u0016ï\u000f(×ßýèw\u009e\u0092i\u0092ÉÍ|Ô\u009dÁ\u0002ÉgÒó®}¤ ¸iLö\u0097[oP\u0017\u0019R´X\u0083NQ\u0010\u0080\u0080rsÍd:Îvòãñô©þr";
      int var8 = "\u008bwq\u008a`\u0017t´Ð·GQ2wüÖ\u0010;ãJ\u0092è VÉ´\u0088\u008d\u009e\u0083\u0016ï\u000f(×ßýèw\u009e\u0092i\u0092ÉÍ|Ô\u009dÁ\u0002ÉgÒó®}¤ ¸iLö\u0097[oP\u0017\u0019R´X\u0083NQ\u0010\u0080\u0080rsÍd:Îvòãñô©þr"
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
                     d = var9;
                     g = new String[6];
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

                  var6 = "\\&Õv_¾C)¼´8\fWò\u000fâ\u0003=\u0004Ýî\u0087tðíi'õ\u0004ñ\u0090\u0018\u0098pY2\\õø\u0014\u0084ÜGòºäÕ\u000bw2êr\u008b:ÅÄ\u0088Ü\u0090è#\"°\u0091(\u008cÞ\u0083\u0090\u0096¯±\u0087\u0091\u0088``èV\u0086\u0018¢\u000b\b\n·;v\"¤*r\u007fr\u0012ÔÐq \u000f+±Ò©£";
                  var8 = "\\&Õv_¾C)¼´8\fWò\u000fâ\u0003=\u0004Ýî\u0087tðíi'õ\u0004ñ\u0090\u0018\u0098pY2\\õø\u0014\u0084ÜGòºäÕ\u000bw2êr\u008b:ÅÄ\u0088Ü\u0090è#\"°\u0091(\u008cÞ\u0083\u0090\u0096¯±\u0087\u0091\u0088``èV\u0086\u0018¢\u000b\b\n·;v\"¤*r\u007fr\u0012ÔÐq \u000f+±Ò©£"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9099;
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
            throw new RuntimeException("com/zelix/u3", var10);
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
         throw new RuntimeException("com/zelix/u3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
