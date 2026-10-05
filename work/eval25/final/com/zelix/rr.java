package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface rr {
   String[] M;

   static {
      long var9 = ess.a(-2474120491677990733L, 6856177521954026195L, MethodHandles.lookup().lookupClass()).a(8941133631086L) ^ 87333616762213L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[18];
      int var6 = 0;
      String var5 = "\u0097\u001fM¤Ëà\bz\u0010Ä\u000f\u0016ïýêå\u008a)\u001a\u0094¬m§r\u0007\b\u0095 \u0004cäãr\u0016\u0010¯\\pN÷\u0014Òk?F2\u0016ªò Î\u0010·\u001c;1p'ºÄ\u001ddw1\u009eò\u0096è\u0010D\u0011OÂ§Þ=Öhs2z±ß-Ì\u0010\u008e¹ÜMB\u0019\u0096»ù.\u0092\u0014T{\u008as\b\u0086!§\b\fF|C\u0010@Ã\n\u0002¡ëo¯\u000f\u000e\u009e\u0012k\u0004\u0099g\u0010J\u008bûìÅ\u0001åÊhØ8æ\u00ad&m¾\u0010\u001f¾Ó[GÉñsÀ3+ýÿ$\u008eÍ\u0010\u0017n«/\u0019TaÚ1ÁãH=³\\s\u0010ùX7=õ~¿(º£÷ê.\u007fåF\u0010\u0095\u0096\u00062¨qÉ\u0099\u0095¶ý~Q´«/\u0010û./Ä»\u008c\u0000òEÍzÇ\u009d\u0092¾?\u0018û./Ä»\u008c\u0000òÃdt\u00811U`µ`Ç\u0010Øt\u009b\u0082Ê";
      int var7 = "\u0097\u001fM¤Ëà\bz\u0010Ä\u000f\u0016ïýêå\u008a)\u001a\u0094¬m§r\u0007\b\u0095 \u0004cäãr\u0016\u0010¯\\pN÷\u0014Òk?F2\u0016ªò Î\u0010·\u001c;1p'ºÄ\u001ddw1\u009eò\u0096è\u0010D\u0011OÂ§Þ=Öhs2z±ß-Ì\u0010\u008e¹ÜMB\u0019\u0096»ù.\u0092\u0014T{\u008as\b\u0086!§\b\fF|C\u0010@Ã\n\u0002¡ëo¯\u000f\u000e\u009e\u0012k\u0004\u0099g\u0010J\u008bûìÅ\u0001åÊhØ8æ\u00ad&m¾\u0010\u001f¾Ó[GÉñsÀ3+ýÿ$\u008eÍ\u0010\u0017n«/\u0019TaÚ1ÁãH=³\\s\u0010ùX7=õ~¿(º£÷ê.\u007fåF\u0010\u0095\u0096\u00062¨qÉ\u0099\u0095¶ý~Q´«/\u0010û./Ä»\u008c\u0000òEÍzÇ\u009d\u0092¾?\u0018û./Ä»\u008c\u0000òÃdt\u00811U`µ`Ç\u0010Øt\u009b\u0082Ê"
         .length();
      char var4 = '\b';
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
                     M = new String[]{
                        var0[2],
                        var0[17],
                        var0[12],
                        var0[1],
                        var0[15],
                        var0[3],
                        var0[13],
                        var0[5],
                        var0[4],
                        var0[9],
                        var0[8],
                        var0[10],
                        var0[16],
                        var0[6],
                        var0[14],
                        var0[0],
                        var0[7],
                        var0[11]
                     };
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

                  var5 = "þ2\u0099ÓeDKM\u001b¦[íF\u0016ç¦\u0010|rÈÉÖ\u009c\u001a\u000f\u008d}Q,\u0098\u0018¼\u0095";
                  var7 = "þ2\u0099ÓeDKM\u001b¦[íF\u0016ç¦\u0010|rÈÉÖ\u009c\u001a\u000f\u008d}Q,\u0098\u0018¼\u0095".length();
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
