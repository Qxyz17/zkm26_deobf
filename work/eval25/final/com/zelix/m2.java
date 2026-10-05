package com.zelix;

import java.io.DataOutputStream;
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

public class m2 extends xl implements _8t {
   int S;
   static final w5 P;
   private static final long a = ess.a(-3243367643212721517L, -2264417364859671896L, MethodHandles.lookup().lookupClass()).a(31635425274465L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xl f(_y4 var1, long var2, _y4 var4, _y4 var5, _y4 var6, PrintWriter var7) {
      long var8 = var2 ^ 128058306197029L;
      long var10 = var2 ^ 124446124793758L;
      long var12 = var2 ^ 34842138774455L;
      long var14 = var2 ^ 2904563378402L;
      long var16 = (var2 ^ 6615983278246L) >>> 8;
      int var18 = (int)((var2 ^ 6615983278246L) << 56 >>> 56);

      try {
         xl var19 = this.j.N(var16, x44.a<"j">(this, -1771000621600523453L, var2), (byte)var18);
         if (var19 instanceof mx) {
            return new mq(this, (mx)var19, var8, var1);
         } else {
            String var22 = x44.a<"n">(this.j, new Object[]{var14}, -1746162578944128322L, var2)
               + b<"p">(13367, 8338070856133194574L ^ var2)
               + b<"p">(30336, 4114614796980548093L ^ var2)
               + b<"p">(6037, 3869551892082266345L ^ var2)
               + x44.a<"j">(this, -1771000621600523453L, var2)
               + b<"p">(6037, 3869551892082266345L ^ var2)
               + x44.a<"v">(new Object[]{var10, x44.a<"n">(this, var12, -2260175367455610193L, var2)}, -2088652136688790455L, var2)
               + b<"p">(14243, 3942279245819621595L ^ var2);
            throw new _sx(var22);
         }
      } catch (ArrayIndexOutOfBoundsException var21) {
         String var20 = x44.a<"n">(this.j, new Object[]{var14}, -1746162578944128322L, var2)
            + b<"p">(6037, 3869551892082266345L ^ var2)
            + b<"p">(6420, 4687248037246312042L ^ var2)
            + b<"p">(6037, 3869551892082266345L ^ var2)
            + x44.a<"n">(var21, -2133278794689247292L, var2)
            + b<"p">(6037, 3869551892082266345L ^ var2)
            + x44.a<"v">(new Object[]{var10, x44.a<"n">(this, var12, -2260175367455610193L, var2)}, -2088652136688790455L, var2)
            + b<"p">(24678, 6207477549059663641L ^ var2);
         throw new _sx(var20);
      }
   }

   m2(int var1, long var2, _xx var4, _83 var5) {
      var2 = a ^ var2;
      super(var1, var5);
      x44.a<"q">(this, var4.readUnsignedShort(), 1756523028477887567L, var2);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-998555822582918960L, var1);
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-2514691957446393874L, var1).l());
      var3.writeShort(x44.a<"k">(this, -4330961076626448438L, var1));
   }

   static {
      long var9 = a ^ 139820925712871L;
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
      String var4 = "\u0017\u00856\u0095h© &\u0094¦|þì\u0003\f+H* \u000b¸\u009f$¿ãmÕ÷\u0010«-pVBLìF\u000f'ÈZ°B\u0002#mÔÔæbL\u0089\u00adé?\u000eÒ\u0010\u001e\u0019\u001f¿]ú\u0097\u009f3\u0001ý\u00adIrX\u008eýbLË\u008e¬\u0085\u001eh9ð«4\r5@`ÉÂ¼JÎ\u008bb¿dS/0nºµG8\u0095V#QÑ\u008a¸\u009dge«\u00184\u0006\u0098Ae\u000ba\u0087ÀP^xó \u009dLX(\u0012\u0095¡-³Æ\u008fû\u0094Ô¤ý\u009cíF¼\u0010ÒÑfáç\u001a-[NÌ\u008cêy\u0002CË";
      int var6 = "\u0017\u00856\u0095h© &\u0094¦|þì\u0003\f+H* \u000b¸\u009f$¿ãmÕ÷\u0010«-pVBLìF\u000f'ÈZ°B\u0002#mÔÔæbL\u0089\u00adé?\u000eÒ\u0010\u001e\u0019\u001f¿]ú\u0097\u009f3\u0001ý\u00adIrX\u008eýbLË\u008e¬\u0085\u001eh9ð«4\r5@`ÉÂ¼JÎ\u008bb¿dS/0nºµG8\u0095V#QÑ\u008a¸\u009dge«\u00184\u0006\u0098Ae\u000ba\u0087ÀP^xó \u009dLX(\u0012\u0095¡-³Æ\u008fû\u0094Ô¤ý\u009cíF¼\u0010ÒÑfáç\u001a-[NÌ\u008cêy\u0002CË"
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
                     P = x44.a<"m">(-3838767834059157284L, var9);
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

                  var4 = "9 ÚÉm\u001bXA\u008f6\fx;ý¼S\u0010x«\u0081~K´N\u0097=îø\u0087+¯ÔÚ";
                  var6 = "9 ÚÉm\u001bXA\u008f6\fx;ý¼S\u0010x«\u0081~K´N\u0097=îø\u0087+¯ÔÚ".length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   public boolean s() {
      return true;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29785;
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
            throw new RuntimeException("com/zelix/m2", var10);
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
         throw new RuntimeException("com/zelix/m2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
