package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class g {
   static final int[] V;

   static {
      long var11 = ess.a(-3480862986480043838L, -8480537565683521436L, MethodHandles.lookup().lookupClass()).a(203962868216797L) ^ 54583645096971L;
      long var13 = var11 ^ 69799077732912L;
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
      String var5 = "\u0084\tß8è*#\u0098eh¤wÔÅþPÎÿJo\u0001ôÓ\u009cºb®h0\u008då\u0001¡D·\u008a\u0094ûßp\u0092Zuãý\u0083#_($\u0087þßIh©8\u0089¼·][\u0007kzáò\u008c°\u0011]\u0010\u0081\u0001Àlï\u0080\u0086Ã";
      int var6 = "\u0084\tß8è*#\u0098eh¤wÔÅþPÎÿJo\u0001ôÓ\u009cºb®h0\u008då\u0001¡D·\u008a\u0094ûßp\u0092Zuãý\u0083#_($\u0087þßIh©8\u0089¼·][\u0007kzáò\u008c°\u0011]\u0010\u0081\u0001Àlï\u0080\u0086Ã"
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
                     V = new int[x44.a<"q">(new Object[]{var13}, -6182200899942249820L, var11).length];

                     try {
                        V[w5.l.ordinal()] = 1;
                     } catch (NoSuchFieldError var32) {
                     }

                     try {
                        V[x44.a<"h">(-6279431967107111277L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var31) {
                     }

                     try {
                        V[x44.a<"h">(-6116605327707126587L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var30) {
                     }

                     try {
                        V[x44.a<"h">(-5668566400726658447L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        V[x44.a<"h">(-5426950742295284957L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        V[x44.a<"h">(-6208344618159568459L, var11).ordinal()] = (int)var0[10];
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        V[x44.a<"h">(-5316887247109375101L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        V[x44.a<"h">(-5685157217571863275L, var11).ordinal()] = (int)var0[9];
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        V[x44.a<"h">(-6008391275627041651L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        V[x44.a<"h">(-5687140557976471238L, var11).ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        V[x44.a<"h">(-5658542828499736614L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        V[x44.a<"h">(-5691672173076476289L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        V[x44.a<"h">(-5346089945719471554L, var11).ordinal()] = (int)var0[8];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        V[x44.a<"h">(-5372711552309057274L, var11).ordinal()] = (int)var0[7];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        V[x44.a<"h">(-5316325850738573818L, var11).ordinal()] = (int)var0[11];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        V[x44.a<"h">(-6114590928216837823L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        V[x44.a<"h">(-5433332812220974702L, var11).ordinal()] = (int)var0[2];
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

                  var5 = "\u0014ÊÊp\u008aÓÛÄ'vÚ\u0013óx\u001bB";
                  var6 = "\u0014ÊÊp\u008aÓÛÄ'vÚ\u0013óx\u001bB".length();
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
