package com.zelix;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qf implements Runnable {
   final ug z;
   final Vector I;
   final eq G;
   final _zk Z;
   private static final long a = ess.a(-3952806578663675231L, 4524378349416579954L, MethodHandles.lookup().lookupClass()).a(66995584696835L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   qf(ug var1, Vector var2, _zk var3, eq var4) {
      this.z = var1;
      this.I = var2;
      this.Z = var3;
      this.G = var4;
   }

   @Override
   public void run() {
      long var1 = a ^ 118473713625696L;
      long var3 = var1 ^ 90395211386981L;
      long var5 = var1 ^ 86037786460169L;
      long var7 = var1 ^ 42489205716741L;
      ByteArrayOutputStream var9 = new ByteArrayOutputStream();
      PrintWriter var10 = new PrintWriter(var9);

      try {
         x44.a<"o">(
            x44.a<"k">(x44.a<"k">(this, 4476867633709393239L, var1), 2395053214906234788L, var1),
            new Object[]{
               x44.a<"k">(this, 2365702143517879312L, var1),
               null,
               var10,
               x44.a<"k">(this, 4040654978571941333L, var1),
               x44.a<"k">(this, 4415855351354471797L, var1),
               x44.a<"k">(x44.a<"k">(this, 4476867633709393239L, var1), 4527903231704591892L, var1),
               var7,
               x44.a<"k">(x44.a<"k">(this, 4476867633709393239L, var1), 4070258640807083023L, var1)
            },
            4076484786560399255L,
            var1
         );
         x44.a<"o">(var10, 2786728642288030981L, var1);
         String var11 = x44.a<"o">(var9, 2829429772029272040L, var1);

         try {
            if (var11.length() > -1) {
               new s7(
                  x44.a<"k">(this, 4476867633709393239L, var1),
                  a<"b">(18680, 1454807751153611437L ^ var1),
                  a<"b">(7151, 7296984170616398264L ^ var1),
                  var11,
                  false,
                  true,
                  var5,
                  false
               );
            }
         } catch (_sq var12) {
            throw x44.a<"w">(var12, 4042857105548799383L, var1);
         }
      } catch (_sq var13) {
         x44.a<"o">(
            x44.a<"k">(this, 4040654978571941333L, var1),
            new Object[]{a<"b">(29367, 6699976189397846241L ^ var1), x44.a<"o">(var13, 4163938122597936374L, var1), var3},
            2481900722973339843L,
            var1
         );
      } catch (_sk var14) {
         x44.a<"o">(
            x44.a<"k">(this, 4040654978571941333L, var1),
            new Object[]{a<"b">(16698, 6733436748920519534L ^ var1), x44.a<"o">(var14, 4358606424466053459L, var1), var3},
            2481900722973339843L,
            var1
         );
      }
   }

   static {
      long var0 = a ^ 64625964122318L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "õßÈÓ\u0095\u0015æûSn\t¨\u0088¶©¡(·Ãû©\t1~\rúÍÜ\u0093±\u001añùÒÿbDÊ¦\u009a|è\u0090\u0016C·ÈPWÿîx}Ù×5I";
      int var8 = "õßÈÓ\u0095\u0015æûSn\t¨\u0088¶©¡(·Ãû©\t1~\rúÍÜ\u0093±\u001añùÒÿbDÊ¦\u009a|è\u0090\u0016C·ÈPWÿîx}Ù×5I".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[4];
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

                  var6 = "ô\u0014ý\u0016\u008dì3\u0004TSÁK\u0092÷ØøG+´{tåâ\u009e×ZîÂ\u0088KbÑ(óy\u0013Z\u0013µÙÃDh¸\u0081åKÆ\u008fUp¡ÞÇú\u008b¶ctö\u009c)\u001dÝÙ@t\n\u0013Kî÷9";
                  var8 = "ô\u0014ý\u0016\u008dì3\u0004TSÁK\u0092÷ØøG+´{tåâ\u009e×ZîÂ\u0088KbÑ(óy\u0013Z\u0013µÙÃDh¸\u0081åKÆ\u008fUp¡ÞÇú\u008b¶ctö\u009c)\u001dÝÙ@t\n\u0013Kî÷9"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static _sq a(_sq var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5704;
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
            throw new RuntimeException("com/zelix/qf", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/qf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
