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

public class m4 extends xl implements _8t {
   int t;
   static final w5 E;
   private static final long a = ess.a(-6595355953137420816L, -8344587830087221044L, MethodHandles.lookup().lookupClass()).a(89694039702756L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xl f(_y4 var1, long var2, _y4 var4, _y4 var5, _y4 var6, PrintWriter var7) {
      long var8 = var2 ^ 124446124793758L;
      long var10 = var2 ^ 24715371287562L;
      long var12 = var2 ^ 34842138774455L;
      long var14 = var2 ^ 2904563378402L;
      long var16 = (var2 ^ 6615983278246L) >>> 8;
      int var18 = (int)((var2 ^ 6615983278246L) << 56 >>> 56);

      try {
         xl var19 = this.j.N(var16, x44.a<"j">(this, -1785614663838341082L, var2), (byte)var18);
         if (var19 instanceof mx) {
            return new md(var10, this, (mx)var19, var1);
         } else {
            String var22 = x44.a<"n">(this.j, new Object[]{var14}, -1746162578944128322L, var2)
               + b<"c">(29068, 6710044874846480165L ^ var2)
               + b<"c">(14704, 946699600792580059L ^ var2)
               + b<"c">(24562, 3840080978227169624L ^ var2)
               + x44.a<"j">(this, -1785614663838341082L, var2)
               + b<"c">(24562, 3840080978227169624L ^ var2)
               + x44.a<"v">(new Object[]{var8, x44.a<"n">(this, var12, -497682124426190805L, var2)}, -2088652136688790455L, var2)
               + b<"c">(12766, 2598575293897762678L ^ var2);
            throw new _sx(var22);
         }
      } catch (ArrayIndexOutOfBoundsException var21) {
         String var20 = x44.a<"n">(this.j, new Object[]{var14}, -1746162578944128322L, var2)
            + b<"c">(24562, 3840080978227169624L ^ var2)
            + b<"c">(3048, 7397467574450707782L ^ var2)
            + b<"c">(24562, 3840080978227169624L ^ var2)
            + x44.a<"n">(var21, -2133278794689247292L, var2)
            + b<"c">(24562, 3840080978227169624L ^ var2)
            + x44.a<"v">(new Object[]{var8, x44.a<"n">(this, var12, -497682124426190805L, var2)}, -2088652136688790455L, var2)
            + b<"c">(9549, 97920452792742882L ^ var2);
         throw new _sx(var20);
      }
   }

   m4(int var1, _xx var2, long var3, _83 var5) {
      var3 = a ^ var3;
      super(var1, var5);
      x44.a<"s">(this, var2.readUnsignedShort(), -2191471965642822008L, var3);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-933580122499970629L, var1);
   }

   public boolean s() {
      return true;
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-2579102526252374395L, var1).l());
      var3.writeShort(x44.a<"k">(this, -4345611466237424465L, var1));
   }

   static {
      long var9 = a ^ 139606982493327L;
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
      String var4 = "ÌQñ G\u001bÿë\u0090\u0001\tÊÚj\u008e|ùzA\u001dtP\u0099êõi'\bâ<FJ¯ÐÒôb¤ÈÊÓþåTm$D\u0084]Ù\u0003«r}\u0097ÄÛ\u001d±%>àN\u0093\u0010\u009cÞ\u001e7x\f\u0094k]ÎõÚÀÇpÎ\u0010\u0004½,\fÍÆ\u008e\u0087Huç\bþx*·\u0010²\u001f -óë\u001fÆ\u008a\u0019±ÚG#\b|";
      int var6 = "ÌQñ G\u001bÿë\u0090\u0001\tÊÚj\u008e|ùzA\u001dtP\u0099êõi'\bâ<FJ¯ÐÒôb¤ÈÊÓþåTm$D\u0084]Ù\u0003«r}\u0097ÄÛ\u001d±%>àN\u0093\u0010\u009cÞ\u001e7x\f\u0094k]ÎõÚÀÇpÎ\u0010\u0004½,\fÍÆ\u008e\u0087Huç\bþx*·\u0010²\u001f -óë\u001fÆ\u008a\u0019±ÚG#\b|"
         .length();
      char var3 = '@';
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
                     E = x44.a<"o">(-8097008087569825260L, var9);
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

                  var4 = "íM%û¶û\u007f_\u0092!»Rù\u0089\u001aR@k\u000e<i\u008ca\u008cìÊöÒ»\u001d?ø\u0092H¢N5Ç÷)lÄN\u009dY\u0016î\u008eHiGÍGfpoÞ\u0090¬lý©É]\u001e&\u0081Wc¨Ó~ý¹%a\u00819¥2Ë";
                  var6 = "íM%û¶û\u007f_\u0092!»Rù\u0089\u001aR@k\u000e<i\u008ca\u008cìÊöÒ»\u001d?ø\u0092H¢N5Ç÷)lÄN\u009dY\u0016î\u008eHiGÍGfpoÞ\u0090¬lý©É]\u001e&\u0081Wc¨Ó~ý¹%a\u00819¥2Ë"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9614;
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
            throw new RuntimeException("com/zelix/m4", var10);
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
         throw new RuntimeException("com/zelix/m4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
