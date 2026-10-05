package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class sx {
   static final int[] F;

   static {
      long var11 = ess.a(-7463397435513817014L, 2870693701377579765L, MethodHandles.lookup().lookupClass()).a(122109732119558L) ^ 59367815225684L;
      long var13 = var11 ^ 19722739985438L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[12];
      int var4 = 0;
      String var5 = "AÔÏC\u0011CkÁ¨\u001f\u007fíÎÅ\u0096©·Ï/åD?\u008f5\u0084\u001e\u009eÄ3\u008bçë\r\"åZ NÙ\u0003\u0092ëÕ\u009c\u008füo\u008e², ¤Â\u009d^\u0089£Ý%\u008c\u0090Ü|èò@ûKBÑ1Ä¢âQ\u0088QC#\u000f";
      int var6 = "AÔÏC\u0011CkÁ¨\u001f\u007fíÎÅ\u0096©·Ï/åD?\u008f5\u0084\u001e\u009eÄ3\u008bçë\r\"åZ NÙ\u0003\u0092ëÕ\u009c\u008füo\u008e², ¤Â\u009d^\u0089£Ý%\u008c\u0090Ü|èò@ûKBÑ1Ä¢âQ\u0088QC#\u000f"
         .length();
      byte var3 = 0;

      label129:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var34 = var0;
         var10001 = var4++;
         long var37 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var39 = -1;

         while (true) {
            long var8 = var37;
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
            long var41 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var39) {
               case 0:
                  var34[var10001] = var41;
                  if (var3 >= var6) {
                     F = new int[x44.a<"w">(new Object[]{var13}, 7213156377244812426L, var11).length];

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(7492206362768099227L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var32) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(9166071171206302523L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var31) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(9168512179161970452L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var30) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(7112249773836690083L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(9175802543712938484L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[w5.l.ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(8653862067808204205L, var11).ordinal()] = (int)var0[10];
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(8827538534066863373L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(7292274853125786347L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(9185964929015602271L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(7418791353675147453L, var11).ordinal()] = (int)var0[7];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(9164034534631522385L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(8926399511325592592L, var11).ordinal()] = (int)var0[11];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(8889654608174638888L, var11).ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(8653300843498631208L, var11).ordinal()] = (int)var0[8];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(7280831282435456879L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        x44.a<"n">(9178612174338671724L, var11)[x44.a<"n">(8842468307241727932L, var11).ordinal()] = (int)var0[9];
                     } catch (NoSuchFieldError var16) {
                     }

                     return;
                  }
                  break;
               default:
                  var34[var10001] = var41;
                  if (var3 < var6) {
                     continue label129;
                  }

                  var5 = "0\u0014Åÿy\u0019¿As\u008d¿Xg~/\u0019";
                  var6 = "0\u0014Åÿy\u0019¿As\u008d¿Xg~/\u0019".length();
                  var3 = 0;
            }

            byte var36 = var3;
            var3 += 8;
            var7 = var5.substring(var36, var3).getBytes("ISO-8859-1");
            var34 = var0;
            var10001 = var4++;
            var37 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var39 = 0;
         }
      }
   }
}
