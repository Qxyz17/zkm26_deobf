package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class l6k {
   public static final String m;
   public static final String C;
   public static final String M;
   public static final String H;

   static {
      long var9 = prr.a(-8455089274228520502L, -3019465799095495167L, MethodHandles.lookup().lookupClass()).a(79544669071401L) ^ 135910015983953L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[7];
      int var6 = 0;
      String var5 = "-JI\u0084$Áþ\u009b:<|î²Ø<´\u0010P\u0084\u007f\u0015©\u0091+\u008e¨\u0087\u001d\u0016'æÔá\b9ö\u009d`¦\u0000\b\u009e\u0090d\u009cÇ»-\u0005zÍ¹\u009al\u001d;tHDG\u0001M\u00842ÎbAÃb\u0006\"yÎ¨\u008b½ÁÇÔ$**jä°6êÔ,§ã\u0089cdP½\u00ad\u0090zå>uÕ\u0090ð®6TtèCA^^ ÎÀÀ±ä\fÁ²\u0018ûUé»¯¾|6\u0010\u0010S\u007f.|S%Öò\u0005¸\u000e\u008b\u009f%\u008cDãJ¼ªù\u0084\u0017\u0002Ø\u000b\u00ad\u001dØ\u0091cb\u0007)¿^×r\u008e\u0006Ýì)_\u001fQ\u0012P<±\u0089\u009b\u008a\u0010zá)^¤\u0093}yn¯ê=eáXá";
      int var7 = "-JI\u0084$Áþ\u009b:<|î²Ø<´\u0010P\u0084\u007f\u0015©\u0091+\u008e¨\u0087\u001d\u0016'æÔá\b9ö\u009d`¦\u0000\b\u009e\u0090d\u009cÇ»-\u0005zÍ¹\u009al\u001d;tHDG\u0001M\u00842ÎbAÃb\u0006\"yÎ¨\u008b½ÁÇÔ$**jä°6êÔ,§ã\u0089cdP½\u00ad\u0090zå>uÕ\u0090ð®6TtèCA^^ ÎÀÀ±ä\fÁ²\u0018ûUé»¯¾|6\u0010\u0010S\u007f.|S%Öò\u0005¸\u000e\u008b\u009f%\u008cDãJ¼ªù\u0084\u0017\u0002Ø\u000b\u00ad\u001dØ\u0091cb\u0007)¿^×r\u008e\u0006Ýì)_\u001fQ\u0012P<±\u0089\u009b\u008a\u0010zá)^¤\u0093}yn¯ê=eáXá"
         .length();
      char var4 = 16;
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     M = m44.a<"n">(var0[6], "\n", -2514729431652614651L, var9);
                     m = m44.a<"n">(var0[0], -2830571361438485752L, var9);
                     H = var0[3] + m44.a<"n">(var0[4], -2830571361438485752L, var9) + var0[2];
                     C = var0[5] + m44.a<"n">(var0[1], -2830571361438485752L, var9) + "\"";
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "d\u009cÇ»-\u0005zÍ¹\u009al\u001d;tHDG\u0001M\u00842ÎbAÃb\u0006\"yÎ¨\u008bÕ\u0019\u001av÷ÝµUÜ£ÞWté\u000f\u0005çQÞ\u0094\u0091Ðs\ts÷¡\u009cß7¦\u00045\u001bõ\u0090\u0088kmîÅ\fañàÏ\u000b ´Ø/¹ËT4°\u0012Á·Nv®5ñ*ãG\u00adÆ1°RV\u0083\"\r`\u009e;]\u0010P\u00adàÞ´±èøS\u0086Páªøðà";
                  var7 = "d\u009cÇ»-\u0005zÍ¹\u009al\u001d;tHDG\u0001M\u00842ÎbAÃb\u0006\"yÎ¨\u008bÕ\u0019\u001av÷ÝµUÜ£ÞWté\u000f\u0005çQÞ\u0094\u0091Ðs\ts÷¡\u009cß7¦\u00045\u001bõ\u0090\u0088kmîÅ\fañàÏ\u000b ´Ø/¹ËT4°\u0012Á·Nv®5ñ*ãG\u00adÆ1°RV\u0083\"\r`\u009e;]\u0010P\u00adàÞ´±èøS\u0086Páªøðà"
                     .length();
                  var4 = 'p';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
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
}
