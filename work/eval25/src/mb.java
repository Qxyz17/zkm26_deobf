package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mb {
   public static final String f;
   public static final char N;
   public static final String g;
   public static final String i;
   public static final String R;
   public static final File V;
   public static final String L;
   public static final String r;
   public static final String Z;
   public static final char S;
   public static final String z;
   public static final String d;
   public static final String k;

   static {
      long var9 = ess.a(2741816211630175570L, -1388189371077159434L, MethodHandles.lookup().lookupClass()).a(85452486344932L) ^ 128102722683367L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[11];
      int var6 = 0;
      String var5 = "\u0099\u0019^Ýy°¯\u008fx64ß\\¨\u0002?\u0010÷ó'ÁZ°°ÊçWµ<ä²Å\u0081\u0010ä\u000b\u009f\u0014ÿ/È,G5åebLÈ-\u0010#rqÙ\u0099´0BXbÃLøâ\u007fÊ\bÄñ¨\u0016s8Ñ+\u0010ûÑ\u0000\\´\u0014©5\f\u000fG \u0090%8*\u0018ã\u001f\u0010\u0000[\u0018û\u008eé\fõjQ_¾A÷cÄ\u0099ÍL/d\u0010ü=é·ÙYQ_\u009e*'\u008a\u0006\u009f\u008f\u0016\b/\u000eGÆ-Â\u001b°";
      int var7 = "\u0099\u0019^Ýy°¯\u008fx64ß\\¨\u0002?\u0010÷ó'ÁZ°°ÊçWµ<ä²Å\u0081\u0010ä\u000b\u009f\u0014ÿ/È,G5åebLÈ-\u0010#rqÙ\u0099´0BXbÃLøâ\u007fÊ\bÄñ¨\u0016s8Ñ+\u0010ûÑ\u0000\\´\u0014©5\f\u000fG \u0090%8*\u0018ã\u001f\u0010\u0000[\u0018û\u008eé\fõjQ_¾A÷cÄ\u0099ÍL/d\u0010ü=é·ÙYQ_\u009e*'\u008a\u0006\u009f\u008f\u0016\b/\u000eGÆ-Â\u001b°"
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
                     r = x44.a<"p">(var0[5], -4302717326870721703L, var9);
                     i = x44.a<"p">(var0[1], -4302717326870721703L, var9);
                     N = x44.a<"i">(-4219374806944635146L, var9).charAt(0);
                     d = x44.a<"p">(var0[7], -4302717326870721703L, var9);
                     S = x44.a<"i">(-2540101044104671821L, var9).charAt(0);
                     R = x44.a<"p">(var0[3], "\n", -2714832513555176070L, var9);
                     V = new File(x44.a<"i">(-2621486154229241249L, var9));
                     k = x44.a<"p">(var0[9], var0[4], -2714832513555176070L, var9);
                     g = x44.a<"p">(var0[2], -4302717326870721703L, var9);
                     L = x44.a<"p">(var0[10], x44.a<"i">(-2621486154229241249L, var9), -2714832513555176070L, var9);
                     f = x44.a<"p">(var0[6], -4302717326870721703L, var9);
                     Z = x44.a<"p">(var0[8], -4302717326870721703L, var9);
                     z = x44.a<"p">(var0[0], -4302717326870721703L, var9);
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

                  var5 = "ä\u000b\u009f\u0014ÿ/È,ú\u0011bî\u0014\u0080Û\n\u0010÷¢ç\u008fRbÎ\u000e\b\u0018Âæ\u00835îm";
                  var7 = "ä\u000b\u009f\u0014ÿ/È,ú\u0011bî\u0014\u0080Û\n\u0010÷¢ç\u008fRbÎ\u000e\b\u0018Âæ\u00835îm".length();
                  var4 = 16;
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
