package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class re {
   static final int[] j;
   static final int[] m;
   static final int[] d;

   static {
      long var11 = ess.a(5197148885244820641L, 7111788282900628334L, MethodHandles.lookup().lookupClass()).a(148418517630688L) ^ 91253852998179L;
      long var13 = var11 ^ 121443062094426L;
      long var15 = var11 ^ 44686847468855L;
      long var17 = var11 ^ 117711017071450L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "çmU~Æé\u008c\u0084\u0094²i\f¬\u0087¹\n";
      int var6 = "çmU~Æé\u008c\u0084\u0094²i\f¬\u0087¹\n".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
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
         byte var38 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      j = new int[x44.a<"w">(new Object[]{var17}, 755584333923565592L, var11).length];

      try {
         x44.a<"n">(1686269326105770916L, var11)[x44.a<"n">(766100841654031635L, var11).ordinal()] = 1;
      } catch (NoSuchFieldError var36) {
      }

      try {
         x44.a<"n">(1686269326105770916L, var11)[x44.a<"n">(1670584060783236216L, var11).ordinal()] = 2;
      } catch (NoSuchFieldError var35) {
      }

      try {
         x44.a<"n">(1686269326105770916L, var11)[x44.a<"n">(1268392627743141805L, var11).ordinal()] = 3;
      } catch (NoSuchFieldError var34) {
      }

      try {
         x44.a<"n">(1686269326105770916L, var11)[x44.a<"n">(1294527978670988476L, var11).ordinal()] = 4;
      } catch (NoSuchFieldError var33) {
      }

      try {
         x44.a<"n">(1686269326105770916L, var11)[x44.a<"n">(1641425185626691595L, var11).ordinal()] = 5;
      } catch (NoSuchFieldError var32) {
      }

      m = new int[x44.a<"w">(new Object[]{var13}, 652080174056860177L, var11).length];

      try {
         x44.a<"n">(1306583227549201668L, var11)[x44.a<"n">(1611752753037022742L, var11).ordinal()] = 1;
      } catch (NoSuchFieldError var31) {
      }

      try {
         x44.a<"n">(1306583227549201668L, var11)[x44.a<"n">(1157232459408678389L, var11).ordinal()] = 2;
      } catch (NoSuchFieldError var30) {
      }

      try {
         x44.a<"n">(1306583227549201668L, var11)[x44.a<"n">(1636785324243171137L, var11).ordinal()] = 3;
      } catch (NoSuchFieldError var29) {
      }

      try {
         x44.a<"n">(1306583227549201668L, var11)[x44.a<"n">(1467850522845624306L, var11).ordinal()] = 4;
      } catch (NoSuchFieldError var28) {
      }

      try {
         x44.a<"n">(1306583227549201668L, var11)[x44.a<"n">(1354351242419391129L, var11).ordinal()] = 5;
      } catch (NoSuchFieldError var27) {
      }

      d = new int[x44.a<"w">(new Object[]{var15}, 1361617023558003901L, var11).length];

      try {
         x44.a<"n">(857402757536441264L, var11)[x44.a<"n">(944673882323764724L, var11).ordinal()] = 1;
      } catch (NoSuchFieldError var26) {
      }

      try {
         x44.a<"n">(857402757536441264L, var11)[x44.a<"n">(1081486562550183115L, var11).ordinal()] = 2;
      } catch (NoSuchFieldError var25) {
      }

      try {
         x44.a<"n">(857402757536441264L, var11)[x44.a<"n">(1306783379656994719L, var11).ordinal()] = 3;
      } catch (NoSuchFieldError var24) {
      }

      try {
         x44.a<"n">(857402757536441264L, var11)[x44.a<"n">(669650987357260860L, var11).ordinal()] = 4;
      } catch (NoSuchFieldError var23) {
      }

      try {
         x44.a<"n">(857402757536441264L, var11)[x44.a<"n">(1590989105270869687L, var11).ordinal()] = 5;
      } catch (NoSuchFieldError var22) {
      }

      try {
         x44.a<"n">(857402757536441264L, var11)[x44.a<"n">(1141658180622143990L, var11).ordinal()] = (int)var0[1];
      } catch (NoSuchFieldError var21) {
      }

      try {
         x44.a<"n">(857402757536441264L, var11)[x44.a<"n">(1035294463170569805L, var11).ordinal()] = (int)var0[0];
      } catch (NoSuchFieldError var20) {
      }
   }
}
