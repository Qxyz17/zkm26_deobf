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

public class xp extends x1 {
   static final w5 q;
   private static final long a = ess.a(-6748230542800503502L, 91904174178592352L, MethodHandles.lookup().lookupClass()).a(200469572109002L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xl f(_y4 var1, long var2, _y4 var4, _y4 var5, _y4 var6, PrintWriter var7) {
      long var8 = var2 ^ 46633954199545L;
      return x44.a<"n">(this, new Object[]{var1, var4, var8, var5, var6, var7}, -2146718134565507571L, var2);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-685580431186014348L, var1);
   }

   public x2 M(Object[] var1) {
      _y4 var2 = (_y4)var1[0];
      _y4 var6 = (_y4)var1[1];
      long var3 = (Long)var1[2];
      _y4 var8 = (_y4)var1[3];
      _y4 var5 = (_y4)var1[4];
      PrintWriter var7 = (PrintWriter)var1[5];
      var3 = a ^ var3;
      long var9 = var3 ^ 124007491856301L;
      long var11 = var3 ^ 16984980059023L;
      long var13 = var3 ^ 16984980059023L;
      long var15 = var3 ^ 60379285917730L;
      long var17 = var3 ^ 29544608295568L;
      long var19 = var3 ^ 107666541258662L;
      long var21 = (var3 ^ 25042505740446L) >>> 8;
      int var23 = (int)((var3 ^ 25042505740446L) << 56 >>> 56);
      String[] var24 = x44.a<"v">(457331485225935801L, var3);

      try {
         xl var25 = this.j.N(var21, x44.a<"j">(this, 1999545921413636778L, var3), (byte)var23);

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
               throw x44.a<"v">(var28, 1741963065972534625L, var3);
            }

            var10000 = var25 instanceof mn;
         }

         if (!var10000) {
            String var32 = this.j.M(var17)
               + b<"c">(6769, 4089622289518005179L ^ var3)
               + b<"c">(8219, 7315749383434351059L ^ var3)
               + b<"c">(7834, 1941382122636611414L ^ var3)
               + x44.a<"j">(this, 1999545921413636778L, var3)
               + b<"c">(7834, 1941382122636611414L ^ var3)
               + x44.a<"v">(new Object[]{var19, var25.m(var13)}, 1962317301754637425L, var3)
               + b<"c">(7834, 1941382122636611414L ^ var3)
               + x44.a<"v">(new Object[]{var19, x44.a<"n">(this, var11, 517627819477982593L, var3)}, 1962317301754637425L, var3)
               + b<"c">(24546, 7803071659506814507L ^ var3)
               + this.B();
            throw new _sx(var32);
         } else {
            x2 var31 = new x2(var9, this.B(), this.j, x44.a<"j">(this, 403936584437055706L, var3), (mn)var25);

            label36: {
               try {
                  var33 = var6;
                  if (var24 != null) {
                     break label36;
                  }

                  if (var6 == null) {
                     return var31;
                  }
               } catch (ArrayIndexOutOfBoundsException var27) {
                  throw x44.a<"v">(var27, 1741963065972534625L, var3);
               }

               var33 = var6;
            }

            var33.G((mn)var25, var31, var15);
            return var31;
         }
      } catch (ArrayIndexOutOfBoundsException var29) {
         String var26 = this.j.M(var17)
            + b<"c">(7834, 1941382122636611414L ^ var3)
            + b<"c">(18805, 3427320903190501566L ^ var3)
            + b<"c">(7834, 1941382122636611414L ^ var3)
            + x44.a<"n">(var29, 1899677916041674748L, var3)
            + b<"c">(7834, 1941382122636611414L ^ var3)
            + x44.a<"v">(new Object[]{var19, x44.a<"n">(this, var11, 517627819477982593L, var3)}, 1962317301754637425L, var3)
            + b<"c">(23094, 5887143913224227835L ^ var3);
         throw new _sx(var26);
      }
   }

   public xp(int var1, _xx var2, _83 var3) {
      super(var1, var2, var3);
   }

   static {
      long var9 = a ^ 46796900070350L;
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
      String var4 = "aº9\u00161*4úý\u0095Y]XËÓ}#¿ªq\u0002t{\u0082wÕâ)½å«¦X\"ó\u001eDÇ\u0092Æ±5x>\u0097ÈÍé~\u009f,¦\u0017ÃÀÖQf\u001aôX\u0006î\u0097j(\u009cd\u009f(\u0093\u009f ýFøÆó\u0001\u0005`\u0098¾¼2cDåÛ5YG\u001eÆrz\u0088|\u000ed\u0093]¾¾´\u0010Ft×K\u009døÝ\u0082×pFóü\u007fNÄ@\u008f:75Rvn\"yÑäqöYãðt\u00059RÓ\u000fÿLð\u0013NÛâ\u0097\\\u0002ù\u0002Í7(¾-é®%öÊ\u000eò\u0016^\u001f\u009fo\u0006º\u0082G>s\u0099ÿ\u0002|Z:§";
      int var6 = "aº9\u00161*4úý\u0095Y]XËÓ}#¿ªq\u0002t{\u0082wÕâ)½å«¦X\"ó\u001eDÇ\u0092Æ±5x>\u0097ÈÍé~\u009f,¦\u0017ÃÀÖQf\u001aôX\u0006î\u0097j(\u009cd\u009f(\u0093\u009f ýFøÆó\u0001\u0005`\u0098¾¼2cDåÛ5YG\u001eÆrz\u0088|\u000ed\u0093]¾¾´\u0010Ft×K\u009døÝ\u0082×pFóü\u007fNÄ@\u008f:75Rvn\"yÑäqöYãðt\u00059RÓ\u000fÿLð\u0013NÛâ\u0097\\\u0002ù\u0002Í7(¾-é®%öÊ\u000eò\u0016^\u001f\u009fo\u0006º\u0082G>s\u0099ÿ\u0002|Z:§"
         .length();
      char var3 = 'H';
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
                     q = x44.a<"m">(6801849563595129363L, var9);
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

                  var4 = "é¾¢Z\u0001vP¼©\u0012:à¦ùvÏ\u0010[P\u009a$Ußm\u0088\u0013\u001cÏ%Wæùz";
                  var6 = "é¾¢Z\u0001vP¼©\u0012:à¦ùvÏ\u0010[P\u009a$Ußm\u0088\u0013\u001cÏ%Wæùz".length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6869;
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
            throw new RuntimeException("com/zelix/xp", var10);
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
         throw new RuntimeException("com/zelix/xp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
