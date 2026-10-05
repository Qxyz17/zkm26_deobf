package com.zelix;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _rj {
   private static final long a = ess.a(-2334729089639719615L, -8359491849517759029L, MethodHandles.lookup().lookupClass()).a(28366696174233L);
   private static final long b;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public _rj(String var1, String var2, wp var3, wp var4, wp var5, int var6, String var7, _x7 var8, short var9, int var10) {
      long var11 = ((long)var6 << 32 | (long)var9 << 48 >>> 32 | (long)var10 << 48 >>> 48) ^ a;
      long var13 = var11 ^ 121976451255464L;
      long var15 = var11 ^ 109862901429045L;
      long var17 = var11 ^ 11817813279576L;
      hk[] var10000 = x44.a<"u">(-5687215367710566371L, var11);
      super();
      int var10001 = (int)b;
      Object[] var10004 = new Object[]{null, var13};
      var10004[0] = var10001;
      HashMap var20 = x44.a<"u">(var10004, -5572086569631238888L, var11);
      hk[] var19 = var10000;
      Object var21 = null;
      Object var22 = null;
      Object var23 = null;
      ByteArrayInputStream var24 = null;
      boolean var32 = false /* VF: Semaphore variable */;

      try {
         var32 = true;
         var24 = new ByteArrayInputStream(x44.a<"m">(var2, -5895009021691932652L, var11));
         new u(var24, var8, var7, var3.C(var17), var4.C(var17), var15, var5.C(var17), var20, (Map)var21, (Map)var22, (_8z)var23, var1);
         var32 = false;
      } finally {
         if (var32) {
            try {
               label61: {
                  label60: {
                     try {
                        var39 = var24;
                        if (var19 != null) {
                           break label60;
                        }

                        if (var24 == null) {
                           break label61;
                        }
                     } catch (IOException var33) {
                        throw x44.a<"u">(var33, -6318223640203540561L, var11);
                     }

                     var39 = var24;
                  }

                  x44.a<"m">(var39, -5327895017421912042L, var11);
               }
            } catch (IOException var34) {
            }
         }
      }

      try {
         ByteArrayInputStream var40 = var24;
         if (var19 == null) {
            if (var24 == null) {
               return;
            }

            var40 = var24;
         }

         x44.a<"m">(var40, -5327895017421912042L, var11);
      } catch (IOException var36) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public _rj(File var1, wp var2, wp var3, wp var4, String var5, _yv var6, _x7 var7, Map var8, Map var9, long var10, Map var12, _8z var13) {
      var10 = a ^ var10;
      long var14 = var10 ^ 87622048712251L;
      long var16 = var10 ^ 42768859674198L;
      hk[] var10000 = x44.a<"s">(-8927014503529829101L, var10);
      super();
      hk[] var18 = var10000;
      FileInputStream var19 = null;
      boolean var27 = false /* VF: Semaphore variable */;

      try {
         var27 = true;
         var19 = new FileInputStream(var1);
         new u(var19, var7, var5, var2.C(var16), var3.C(var16), var14, var4.C(var16), var8, var9, var12, var13, x44.a<"k">(var1, -8907451041698952095L, var10));
         var27 = false;
      } finally {
         if (var27) {
            try {
               label61: {
                  label60: {
                     try {
                        var35 = var19;
                        if (var18 != null) {
                           break label60;
                        }

                        if (var19 == null) {
                           break label61;
                        }
                     } catch (IOException var28) {
                        throw x44.a<"s">(var28, -7106955873996410207L, var10);
                     }

                     var35 = var19;
                  }

                  x44.a<"k">(var35, -9006724335781642984L, var10);
               }
            } catch (IOException var29) {
            }
         }
      }

      try {
         FileInputStream var36 = var19;
         if (var18 == null) {
            if (var19 == null) {
               return;
            }

            var36 = var19;
         }

         x44.a<"k">(var36, -9006724335781642984L, var10);
      } catch (IOException var31) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public _rj(ZipFile var1, ZipEntry var2, long var3, wp var5, wp var6, wp var7, String var8, _yv var9, _x7 var10, Map var11, Map var12, Map var13, _8z var14) {
      var3 = a ^ var3;
      long var15 = var3 ^ 64055477744375L;
      long var17 = var3 ^ 4694423350766L;
      long var19 = var3 ^ 85926629651232L;
      long var21 = var3 ^ 119924056464771L;
      super();
      hk[] var10000 = x44.a<"v">(-5779925441684896058L, var3);
      InputStream var24 = null;
      hk[] var23 = var10000;
      boolean var32 = false /* VF: Semaphore variable */;

      try {
         var32 = true;
         var24 = x44.a<"n">(var1, var2, -6046028356528741171L, var3);
         new u(
            var24,
            var10,
            var8,
            var5.C(var21),
            var6.C(var21),
            var17,
            var7.C(var21),
            var11,
            var12,
            var13,
            var14,
            x44.a<"v">(new Object[]{var1, var2, var15}, -5552026694141556790L, var3)
         );
         x44.a<"n">(var10, new Object[]{var19}, -6244931344745958107L, var3);
         var32 = false;
      } finally {
         if (var32) {
            try {
               label61: {
                  label60: {
                     try {
                        var40 = var24;
                        if (var23 != null) {
                           break label60;
                        }

                        if (var24 == null) {
                           break label61;
                        }
                     } catch (IOException var33) {
                        throw x44.a<"v">(var33, -5293331836613142156L, var3);
                     }

                     var40 = var24;
                  }

                  x44.a<"n">(var40, -6281144772578552115L, var3);
               }
            } catch (IOException var34) {
            }
         }
      }

      try {
         InputStream var41 = var24;
         if (var23 == null) {
            if (var24 == null) {
               return;
            }

            var41 = var24;
         }

         x44.a<"n">(var41, -6281144772578552115L, var3);
      } catch (IOException var36) {
      }
   }

   static {
      long var0 = a ^ 133456243446293L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 5103518947444635774L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
