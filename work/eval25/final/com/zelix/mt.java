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

public class mt extends xl implements _8t {
   int n;
   static final w5 N;
   private static final long a = ess.a(-9147296535482836616L, -3912449506660081798L, MethodHandles.lookup().lookupClass()).a(158766686135978L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public boolean s() {
      return true;
   }

   public w5 m(long var1) {
      return x44.a<"h">(-1517706503729237687L, var1);
   }

   static {
      long var9 = a ^ 39821864274645L;
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
      String var4 = "¦\u0084Fýèh¼ñ\b\u009c?\u000fy{ú¨@Ô>,\u0004?\u008cÖ!\u0013\u00999X,çvv¤GvaXnÂcí\u0010`\u008c}](Þ;¡¦e°\u008a\u0017úñ\t\nnòa\u00adx÷Hj\u009b\u0017\u0096)\fB<IeÊ¯b=\u0010G\u008a\u0012\u0097Ç¦dÁ\r\u0010Ç(è\bØæ\u0010\u001bÕÜ÷Wõ\f@\u009bÃd\u009fc´\u0086\u0013";
      int var6 = "¦\u0084Fýèh¼ñ\b\u009c?\u000fy{ú¨@Ô>,\u0004?\u008cÖ!\u0013\u00999X,çvv¤GvaXnÂcí\u0010`\u008c}](Þ;¡¦e°\u008a\u0017úñ\t\nnòa\u00adx÷Hj\u009b\u0017\u0096)\fB<IeÊ¯b=\u0010G\u008a\u0012\u0097Ç¦dÁ\r\u0010Ç(è\bØæ\u0010\u001bÕÜ÷Wõ\f@\u009bÃd\u009fc´\u0086\u0013"
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
                     N = x44.a<"l">(7046132350355700653L, var9);
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

                  var4 = "\u0083j\u0019Æ¡\u0099ñÊK5\u008a_¡bñ`@§W\u0004ÙÉ\t7³\u00912ÐP515)yÅKt$`Ðø\u0018··È\u009c¶v\rD¿X3\u0099Æ¼\u0086by-=Ã7!6¥be)ë\u0098Ø\u0096'N\u0087à\u009c\u008a\b0";
                  var6 = "\u0083j\u0019Æ¡\u0099ñÊK5\u008a_¡bñ`@§W\u0004ÙÉ\t7³\u00912ÐP515)yÅKt$`Ðø\u0018··È\u009c¶v\rD¿X3\u0099Æ¼\u0086by-=Ã7!6¥be)ë\u0098Ø\u0096'N\u0087à\u009c\u008a\b0"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-4193295729759412617L, var1).l());
      var3.writeShort(x44.a<"k">(this, -4435218572905340831L, var1));
   }

   mt(int var1, _xx var2, long var3, _83 var5) {
      var3 = a ^ var3;
      super(var1, var5);
      x44.a<"r">(this, var2.readUnsignedShort(), 7267881760430261967L, var3);
   }

   public xl f(_y4 var1, long var2, _y4 var4, _y4 var5, _y4 var6, PrintWriter var7) {
      long var8 = var2 ^ 13763852772127L;
      long var10 = var2 ^ 124446124793758L;
      long var12 = var2 ^ 34842138774455L;
      long var14 = var2 ^ 2904563378402L;
      long var16 = (var2 ^ 6615983278246L) >>> 8;
      int var18 = (int)((var2 ^ 6615983278246L) << 56 >>> 56);

      try {
         xl var19 = this.j.N(var16, x44.a<"j">(this, -1802704575675693848L, var2), (byte)var18);
         if (var19 instanceof mx) {
            return new mu(var8, this, (mx)var19, var1);
         } else {
            String var22 = x44.a<"n">(this.j, new Object[]{var14}, -1746162578944128322L, var2)
               + b<"k">(3907, 7078519497881576369L ^ var2)
               + b<"k">(20068, 3183371300886880913L ^ var2)
               + b<"k">(24762, 8672360509049900105L ^ var2)
               + x44.a<"j">(this, -1802704575675693848L, var2)
               + b<"k">(24762, 8672360509049900105L ^ var2)
               + x44.a<"v">(new Object[]{var10, x44.a<"n">(this, var12, -241171189175760486L, var2)}, -2088652136688790455L, var2)
               + b<"k">(30851, 3068988747154920563L ^ var2);
            throw new _sx(var22);
         }
      } catch (ArrayIndexOutOfBoundsException var21) {
         String var20 = x44.a<"n">(this.j, new Object[]{var14}, -1746162578944128322L, var2)
            + b<"k">(24762, 8672360509049900105L ^ var2)
            + b<"k">(22386, 4737223611152939907L ^ var2)
            + b<"k">(24762, 8672360509049900105L ^ var2)
            + x44.a<"n">(var21, -2133278794689247292L, var2)
            + b<"k">(24762, 8672360509049900105L ^ var2)
            + x44.a<"v">(new Object[]{var10, x44.a<"n">(this, var12, -241171189175760486L, var2)}, -2088652136688790455L, var2)
            + b<"k">(18496, 2096421719909868724L ^ var2);
         throw new _sx(var20);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8149;
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
            throw new RuntimeException("com/zelix/mt", var10);
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
         throw new RuntimeException("com/zelix/mt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
