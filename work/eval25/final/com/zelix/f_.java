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

public class f_ extends fw {
   private h r;
   public static String H;
   private static final long a = ess.a(3639762310417832105L, 1225875127697293496L, MethodHandles.lookup().lookupClass()).a(252450927536719L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   protected void Y(Object[] var1) {
      _ur var2 = (_ur)var1[0];
      int var6 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var4 = (Long)var1[3];
      int var7 = (Integer)var1[4];
      long var8 = var4 ^ 62320299059174L;
      long var10 = var4 ^ 4538559877319L;
      x44.a<"o">(var2, new Object[]{x44.a<"k">(this, -8476344859539574329L, var4), var8}, -8440492063415886237L, var4);
      Object[] var10008 = new Object[]{null, null, null, null, var10, b<"t">(16540, 4184702765088481495L ^ var4)};
      var10008[3] = var7;
      var10008[2] = var3;
      var10008[1] = var6;
      var10008[0] = var2;
      x44.a<"o">(this, var10008, -7698716387196803538L, var4);
   }

   static {
      long var9 = a ^ 106668171584216L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "DW{É±ÁÙÿ§\u008eÙU¼\f\fÊÇù0R7Ú\u007fxºpþ9fnü.¬÷M±0&È\u0000\u0019¹`Dm\u0088S\u0004Ù¼W»ÐÎ#s!°\u000b\u008d\u0014\u0012Þ4\u0010\u008bæ\u0099Iê\f\u00018$ª\u0018\u0090\f\u007fVN0¨ô\u0081ãd\u0092ïuâ\u008cþÔ\u0007\u0013ý¡\u000f\"B°·\u0091ï\u0010\u000bS:Ù\u0088\u0001µ`\u001a\"wáNÕÕØcD\u009bjïç% ì\\ëÇe2¼ü#1\u0098¥Y.\u0085h¡Øß\u0019\u0097®\u0082°*9-³q¤%P";
      int var6 = "DW{É±ÁÙÿ§\u008eÙU¼\f\fÊÇù0R7Ú\u007fxºpþ9fnü.¬÷M±0&È\u0000\u0019¹`Dm\u0088S\u0004Ù¼W»ÐÎ#s!°\u000b\u008d\u0014\u0012Þ4\u0010\u008bæ\u0099Iê\f\u00018$ª\u0018\u0090\f\u007fVN0¨ô\u0081ãd\u0092ïuâ\u008cþÔ\u0007\u0013ý¡\u000f\"B°·\u0091ï\u0010\u000bS:Ù\u0088\u0001µ`\u001a\"wáNÕÕØcD\u009bjïç% ì\\ëÇe2¼ü#1\u0098¥Y.\u0085h¡Øß\u0019\u0097®\u0082°*9-³q¤%P"
         .length();
      char var3 = 'H';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = c(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[3];
            x44.a<"w">(b<"t">(20897, 5618360836013953648L ^ var9), 3717202094499074142L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"m">(-7328467818982917756L, var2);
   }

   public f_(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 14171865995841L;
      long var10001 = var1 ^ 35945915912476L;
      int var6 = (int)((var1 ^ 35945915912476L) >>> 48);
      int var7 = (int)((var1 ^ 35945915912476L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      super((short)var6, (char)var7, var3, var8);
      x44.a<"s">(this, new h(var4), -2289316479234729056L, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      _ur var5 = (_ur)var1[2];
      long var6 = var3 ^ 133568995115568L;
      long var8 = var3 ^ 114633185681979L;
      long var10 = var3 ^ 29791420647726L;
      long var12 = var3 ^ 1445808893670L;
      long var14 = var3 ^ 59705601187639L;
      long var16 = var3 ^ 0L;
      long var18 = var3 ^ 134528422017690L;
      long var20 = var3 ^ 80521838856410L;
      int var23 = x44.a<"i">(var5, new Object[]{var20}, 8706655031326303606L, var3);
      int var24 = x44.a<"i">(var5, new Object[]{var8}, 7309659849235451010L, var3);
      int var25 = x44.a<"i">(var5, new Object[]{var10}, 7191208742915394367L, var3);
      int[] var10000 = x44.a<"q">(9148277501292601163L, var3);
      PrintWriter var26 = x44.a<"i">(var5, new Object[]{var14}, 7101428964050372029L, var3);
      String var27 = x44.a<"q">(new Object[]{var6}, 8883304907924305135L, var3) + b<"t">(32183, 2010528736291812120L ^ var3);
      int[] var22 = var10000;
      var26.println(var27);
      x44.a<"i">(x44.a<"h">(8667675691498957867L, var3), var27, 7101258681737693074L, var3);
      int var28 = x44.a<"i">(this, new Object[]{var18}, 7145691849331111744L, var3);
      int var29 = 0;

      label43:
      while (var29 < var28) {
         _za var30 = this.e(var29);

         try {
            x44.a<"i">(var30, new Object[]{var16, this, var5}, 8818198965911889370L, var3);
            var29++;
         } catch (gj var32) {
            boolean var10001 = false;
            throw x44.a<"q">(var32, 8735196878520033718L, var3);
         }

         while (true) {
            try {
               var10000 = var22;
               if (var3 >= 0L) {
                  if (var22 != null) {
                     return;
                  }

                  var10000 = var22;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var31) {
               boolean var35 = false;
               throw x44.a<"q">(var31, 8735196878520033718L, var3);
            }

            if (var3 > 0L) {
               break label43;
            }
         }
      }

      Object[] var10007 = new Object[]{null, null, null, null, var25};
      var10007[3] = var12;
      var10007[2] = var24;
      var10007[1] = var23;
      var10007[0] = var5;
      x44.a<"i">(this, var10007, 7163527971451700364L, var3);
   }

   void D(Object[] var1) {
      long var2 = (Long)var1[0];
      String var5 = (String)var1[1];
      String var4 = (String)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 70550303404185L;
      x44.a<"i">(this, 5325472835732550269L, var2).u(var6, var5, var4);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31109;
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
            throw new RuntimeException("com/zelix/f_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/f_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
