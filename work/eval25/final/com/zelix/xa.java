package com.zelix;

import java.io.PrintWriter;
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

public class xa extends x1 {
   static final w5 y;
   private static final long a = ess.a(156189794177427637L, -4540378041649910339L, MethodHandles.lookup().lookupClass()).a(33032776514810L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xa(int var1, _xx var2, _83 var3) {
      super(var1, var2, var3);
   }

   public x4 V(Object[] var1) {
      _y4 var4 = (_y4)var1[0];
      _y4 var2 = (_y4)var1[1];
      _y4 var5 = (_y4)var1[2];
      _y4 var3 = (_y4)var1[3];
      PrintWriter var8 = (PrintWriter)var1[4];
      long var6 = (Long)var1[5];
      var6 = a ^ var6;
      long var9 = var6 ^ 74733890596411L;
      long var11 = var6 ^ 134556716895638L;
      long var13 = var6 ^ 94919504066340L;
      long var15 = var6 ^ 115222107689618L;
      long var17 = var6 ^ 49919754877458L;
      long var19 = var6 ^ 74733890596411L;
      long var21 = (var6 ^ 99284093185322L) >>> 8;
      int var23 = (int)((var6 ^ 99284093185322L) << 56 >>> 56);
      String[] var24 = x44.a<"r">(-7211239254422323699L, var6);

      try {
         xl var25 = this.j.N(var21, x44.a<"n">(this, -8787757756942418146L, var6), (byte)var23);

         boolean var10000;
         label49: {
            try {
               var10000 = var25.s();
               if (var24 != null) {
                  break label49;
               }

               if (var10000) {
                  return null;
               }
            } catch (ArrayIndexOutOfBoundsException var28) {
               throw x44.a<"r">(var28, -8665343089627937116L, var6);
            }

            var10000 = var25 instanceof mn;
         }

         if (!var10000) {
            String var32 = this.j.M(var13)
               + b<"m">(20305, 329638369948640546L ^ var6)
               + b<"m">(28790, 6466687768648358402L ^ var6)
               + b<"m">(13420, 8828412576822877723L ^ var6)
               + x44.a<"n">(this, -8787757756942418146L, var6)
               + b<"m">(13420, 8828412576822877723L ^ var6)
               + x44.a<"r">(new Object[]{var17, var25.m(var9)}, -8750562543614578235L, var6)
               + b<"m">(13420, 8828412576822877723L ^ var6)
               + x44.a<"r">(new Object[]{var17, x44.a<"j">(this, var19, -7270691601132599286L, var6)}, -8750562543614578235L, var6)
               + b<"m">(11125, 770768429431734535L ^ var6)
               + this.B();
            throw new _sx(var32);
         } else {
            x4 var31 = new x4(this.B(), this.j, x44.a<"n">(this, -7480656396571878034L, var6), (mn)var25, var15);

            label36: {
               try {
                  var33 = var2;
                  if (var24 != null) {
                     break label36;
                  }

                  if (var2 == null) {
                     return var31;
                  }
               } catch (ArrayIndexOutOfBoundsException var27) {
                  throw x44.a<"r">(var27, -8665343089627937116L, var6);
               }

               var33 = var2;
            }

            var33.G((mn)var25, var31, var11);
            return var31;
         }
      } catch (ArrayIndexOutOfBoundsException var29) {
         String var26 = this.j.M(var13)
            + b<"m">(13420, 8828412576822877723L ^ var6)
            + b<"m">(9987, 7427462368594709878L ^ var6)
            + b<"m">(13420, 8828412576822877723L ^ var6)
            + x44.a<"j">(var29, -8653298943961931192L, var6)
            + b<"m">(13420, 8828412576822877723L ^ var6)
            + x44.a<"r">(new Object[]{var17, x44.a<"j">(this, var19, -7270691601132599286L, var6)}, -8750562543614578235L, var6)
            + b<"m">(19920, 5100060852907026342L ^ var6);
         throw new _sx(var26);
      }
   }

   static {
      long var9 = a ^ 132986701850169L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "(\u0092\u0093¦<ZO\u0098\u000fÌ\u0011þ\u009bî;\u0092\u0010\u0002\u009b\u00052ªK\u0005V\u001b¾È4r15²Hf\u0013ºÀ\u0013¼\u0018§i:Ò\u0014Ctâà\u0097p!\u001dÿyLðÄ*Q\u0012\u009c\u0095¹\u00144ú-\nÑmãñª\nÉ§¥-\u008a´\u0015×Ã¤\u000f8\u0085ÓMx¸\u0005Éò%\u0001Â´~cøy\u001dáPí\u001b \u008b/\u000b\u0092¤7X§[\u008aÅ9¯\u0016z«xÛé@ö#\u0099Ò¯Îð\u0086\\\u0095«k\u0019\u008d\u0093\nï\\ò²ª\u0007¨\u0011Æ\u0006Q\u0096tMÔ$>\u0091Ö°,iýî\u0088®ÂÓg\u0098Ì 6*ð1¯Á\u0088\u0012â";
      int var6 = "(\u0092\u0093¦<ZO\u0098\u000fÌ\u0011þ\u009bî;\u0092\u0010\u0002\u009b\u00052ªK\u0005V\u001b¾È4r15²Hf\u0013ºÀ\u0013¼\u0018§i:Ò\u0014Ctâà\u0097p!\u001dÿyLðÄ*Q\u0012\u009c\u0095¹\u00144ú-\nÑmãñª\nÉ§¥-\u008a´\u0015×Ã¤\u000f8\u0085ÓMx¸\u0005Éò%\u0001Â´~cøy\u001dáPí\u001b \u008b/\u000b\u0092¤7X§[\u008aÅ9¯\u0016z«xÛé@ö#\u0099Ò¯Îð\u0086\\\u0095«k\u0019\u008d\u0093\nï\\ò²ª\u0007¨\u0011Æ\u0006Q\u0096tMÔ$>\u0091Ö°,iýî\u0088®ÂÓg\u0098Ì 6*ð1¯Á\u0088\u0012â"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[6];
                     y = x44.a<"n">(-2806151964081827536L, var9);
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

                  var4 = "Ú¨ä\u0002Ò\t;\nö\u0097\\uÇ±\u0010«\u0018PÐ&9þB\u0001[ÊC½iï\u0019¦¬âjÞj( \u0094ó";
                  var6 = "Ú¨ä\u0002Ò\t;\nö\u0097\\uÇ±\u0010«\u0018PÐ&9þB\u0001[ÊC½iï\u0019¦¬âjÞj( \u0094ó".length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   public xl f(_y4 var1, long var2, _y4 var4, _y4 var5, _y4 var6, PrintWriter var7) {
      long var8 = var2 ^ 122685750447001L;
      return x44.a<"n">(this, new Object[]{var1, var4, var5, var6, var7, var8}, -108124306020004955L, var2);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-781662167296625499L, var1);
   }

   private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31966;
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
            throw new RuntimeException("com/zelix/xa", var10);
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
         throw new RuntimeException("com/zelix/xa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
