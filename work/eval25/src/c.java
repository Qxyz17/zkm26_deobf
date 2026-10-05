package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum c {
   public static final c y;
   public static final c h;
   public static final c b;
   private static final c[] t;
   public static final c H;
   public static final c G;
   public static final c T;
   public static final c i;

   static {
      long var20 = ess.a(7225387873372160496L, 5038107390079335932L, MethodHandles.lookup().lookupClass()).a(129167413663519L) ^ 73410509430084L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[7];
      int var17 = 0;
      String var16 = "¹\u009e}³òîçÌ\r\u001cyüfËTÙ\b^A÷\u0097¯\u0089\u0095è\bnßÇ\u0015\u0004o1e\b¤Ê¢\\>ü\u0097/ !8~#\n\u0010Å\\\u007fßÊ5´\u008d\u007f\u009bõå\bû¨cÏÀ2Ç:P?MáÉ";
      int var18 = "¹\u009e}³òîçÌ\r\u001cyüfËTÙ\b^A÷\u0097¯\u0089\u0095è\bnßÇ\u0015\u0004o1e\b¤Ê¢\\>ü\u0097/ !8~#\n\u0010Å\\\u007fßÊ5´\u008d\u007f\u009bõå\bû¨cÏÀ2Ç:P?MáÉ"
         .length();
      char var15 = 16;
      int var23 = -1;

      label47:
      while (true) {
         String var24 = var16.substring(++var23, var23 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var34 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var34;
                  if ((var23 += var15) >= var18) {
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[3];
                     int var4 = 0;
                     String var5 = "\u000ePþ\u0090î\u0090``¶\u0015$S\u000bÿ\u0085/i3N`\u00895!4";
                     int var6 = "\u000ePþ\u0090î\u0090``¶\u0015$S\u000bÿ\u0085/i3N`\u00895!4".length();
                     byte var3 = 0;

                     do {
                        var10001 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
                        var10001 = var4++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte[] var10 = var1.doFinal(
                           new byte[]{
                              (byte)((int)(var8 >>> 56)),
                              (byte)((int)(var8 >>> 48)),
                              (byte)((int)(var8 >>> 40)),
                              (byte)((int)(var8 >>> 32)),
                              (byte)((int)(var8 >>> 24)),
                              (byte)((int)(var8 >>> 16)),
                              (byte)((int)(var8 >>> 8)),
                              (byte)((int)var8)
                           }
                        );
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var39 = -1;
                        var0[var10001] = var10004;
                     } while (var3 < var6);

                     T = new c();
                     i = new c();
                     G = new c();
                     h = new c();
                     b = new c();
                     H = new c();
                     y = new c();
                     c[] var27 = new c[(int)var0[0]];
                     var27[0] = x44.a<"j">(8489025088176026703L, var20);
                     var27[1] = x44.a<"j">(8337637966089633554L, var20);
                     var27[2] = x44.a<"j">(8325521567074949784L, var20);
                     var27[3] = x44.a<"j">(8255922586708429201L, var20);
                     var27[4] = x44.a<"j">(8245262326211483748L, var20);
                     var27[5] = x44.a<"j">(8072048922427836135L, var20);
                     var27[(int)var0[2]] = x44.a<"j">(8416348791466974424L, var20);
                     t = var27;
                     return;
                  }

                  var15 = var16.charAt(var23);
                  break;
               default:
                  var11[var17++] = var34;
                  if ((var23 += var15) < var18) {
                     var15 = var16.charAt(var23);
                     continue label47;
                  }

                  var16 = "©¹íW\u0099´g\u008f(!8~#\n\u0010Å\\\u007fßÊ5´\u008d\u007f\u009bõå\bû¨cÏÀ\u0095\u0093\u0091yûTEng¶Z\u0011\u008c3ra";
                  var18 = "©¹íW\u0099´g\u008f(!8~#\n\u0010Å\\\u007fßÊ5´\u008d\u007f\u009bõå\bû¨cÏÀ\u0095\u0093\u0091yûTEng¶Z\u0011\u008c3ra".length();
                  var15 = '\b';
                  var23 = -1;
            }

            var24 = var16.substring(++var23, var23 + var15);
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
