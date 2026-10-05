package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _o1 extends _o2 {
   private final int B;
   private int z;
   private final int m;
   private static final long c = ess.a(-1239572511612198260L, 4541731306599369551L, MethodHandles.lookup().lookupClass()).a(273909347987806L);
   private static final String[] g;
   private static final String[] k;
   private static final Map l = new HashMap(13);
   private static final long[] n;
   private static final Integer[] o;
   private static final Map p;

   public void k(Object[] var1) {
      PrintWriter var5 = (PrintWriter)var1[0];
      long var2 = (Long)var1[1];
      StringBuilder var4 = (StringBuilder)var1[2];
      long var6 = var2 ^ 104031253466172L;
      long var8 = var2 ^ 32198005677074L;
      int[] var10000 = x44.a<"t">(8216154267410362304L, var2);
      StringBuilder var11 = new StringBuilder();
      int[] var10 = var10000;
      var11.append(x44.a<"l">(this, new Object[]{var8}, 8353405308985101719L, var2));
      var5.println(var4.toString() + var11.toString());
      _op var12 = this.N[this.N.length - 1];

      Object var21;
      StringBuilder var10001;
      label59: {
         label58: {
            label57: {
               try {
                  var18 = var5;
                  var10001 = new StringBuilder().append(var4.toString()).append(b<"r">(31887, 4485298274420241401L ^ var2));
                  var21 = var12;
                  if (var10 != null) {
                     break label58;
                  }

                  if (var12 == null) {
                     break label57;
                  }
               } catch (gj var17) {
                  throw x44.a<"t">(var17, 7719364415371588011L, var2);
               }

               var21 = var12;
               break label58;
            }

            var21 = var12;
            break label59;
         }

         var21 = x44.a<"l">(var21, new Object[]{var6}, 8032731987764428496L, var2);
      }

      var18.println(var10001.append(var21).toString());
      int var13 = 0;

      while (var13 < x44.a<"h">(this, 7969841975575388159L, var2)) {
         _op var14 = this.N[var13];
         int var15 = x44.a<"h">(this, 7917020284497003370L, var2) + var13;

         label44: {
            label43: {
               label42: {
                  try {
                     var19 = var5;
                     var10001 = new StringBuilder().append(var4.toString()).append(b<"r">(16829, 2256599817677508298L ^ var2)).append(var15);
                     var21 = b<"r">(24159, 7664387550894690602L ^ var2);
                     if (var2 <= 0L) {
                        break label44;
                     }

                     var10001 = var10001.append((String)var21);
                     var21 = var14;
                     if (var10 != null) {
                        break label43;
                     }

                     if (var14 == null) {
                        break label42;
                     }
                  } catch (gj var16) {
                     throw x44.a<"t">(var16, 7719364415371588011L, var2);
                  }

                  var21 = var14;
                  break label43;
               }

               var21 = var14;
               break label44;
            }

            var21 = x44.a<"l">(var21, new Object[]{var6}, 8032731987764428496L, var2);
         }

         var19.println(var10001.append(var21).toString());
         var13++;
         if (var10 != null) {
            break;
         }
      }
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      return x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2);
   }

   _o1(_xx var1, int var2, long var3, _y4 var5) {
      var3 = c ^ var3;
      long var10001 = var3 ^ 72657263344672L;
      int var6 = (int)((var3 ^ 72657263344672L) >>> 32);
      int var7 = (int)((var3 ^ 72657263344672L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var3 ^ 42167802213276L;
      long var11 = var3 ^ 84391681034452L;
      super(c<"t">(8327, 1962236901362840179L ^ var3), var6, (char)var7, var8, var1, var2);
      x44.a<"s">(this, -1, 173080203361022723L, var3);
      int var14 = var1.readInt();
      this.B = var1.readInt();
      int[] var10000 = x44.a<"p">(2232046321313415996L, var3);
      this.m = var1.readInt();
      x44.a<"s">(this, x44.a<"l">(this, 426404075152988074L, var3) - x44.a<"l">(this, 81802064993644438L, var3) + 1, 173080203361022723L, var3);
      this.N = new _op[x44.a<"l">(this, 173080203361022723L, var3) + 1];
      this.t = new ArrayList(this.N.length);
      int var15 = 0;
      int[] var13 = var10000;

      label25:
      while (true) {
         if (var15 < x44.a<"l">(this, 173080203361022723L, var3)) {
            int var20 = var1.readInt();

            do {
               int var16 = var20;
               var21 = x44.a<"i">(1776282471658405289L, var3).R(x44.a<"l">(this, 468246849086732406L, var3) + var16, var9);
               if (var13 != null) {
                  break label25;
               }

               Integer var17 = var21;
               var5.G(var17, this, var11);
               this.t.add(var17);
               var15++;
               if (var13 == null) {
                  continue label25;
               }

               var20 = 5;
            } while (var3 < 0L);

            x44.a<"p">(new String[5], 1773430503434435626L, var3);
         }

         var21 = x44.a<"i">(1776282471658405289L, var3).R(x44.a<"l">(this, 468246849086732406L, var3) + var14, var9);
         break;
      }

      Integer var19 = var21;
      var5.G(var19, this, var11);
      this.t.add(var19);
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      int[] var10000 = x44.a<"p">(3436678178989978228L, var4);
      super.W(var6, var2, var7);
      int[] var8 = var10000;
      x44.a<"h">(var2, x44.a<"l">(this, 3488816772239646430L, var4), 3974921034981549113L, var4);
      x44.a<"h">(var2, x44.a<"l">(this, 3792803751054010082L, var4), 3974921034981549113L, var4);
      int var9 = 0;

      while (var9 < x44.a<"l">(this, 3688093308991455819L, var4)) {
         _op var10 = this.N[var9];
         x44.a<"h">(var2, var10.W() - x44.a<"l">(this, 3978884995804596542L, var4), 3974921034981549113L, var4);
         var9++;
         if (var8 != null) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public _o1(int var1, _op var2, short var3, short var4, int var5, int var6, _op[] var7) {
      long var8 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
      super(c<"t">(19652, 2287961448777034703L ^ var8));
      x44.a<"w">(this, -1, 8618359132002453247L, var8);
      this.B = var5;
      this.m = var6;
      int[] var10000 = x44.a<"t">(7711774710230873792L, var8);
      x44.a<"w">(this, x44.a<"h">(this, 8076797255106536022L, var8) - x44.a<"h">(this, 8421439913927023210L, var8) + 1, 8618359132002453247L, var8);
      this.N = new _op[x44.a<"h">(this, 8618359132002453247L, var8) + 1];
      int[] var10 = var10000;
      int var11 = 0;

      label41:
      while (var11 < x44.a<"h">(this, 8618359132002453247L, var8)) {
         try {
            this.N[var11] = var7[var11];
            var11++;
         } catch (gj var13) {
            boolean var10001 = false;
            throw x44.a<"t">(var13, 8223766375138109611L, var8);
         }

         while (true) {
            try {
               var10000 = var10;
               if (var4 < 0) {
                  if (var10 != null) {
                     return;
                  }

                  var10000 = var10;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var12) {
               boolean var16 = false;
               throw x44.a<"t">(var12, 8223766375138109611L, var8);
            }

            if (var3 >= 0) {
               break label41;
            }
         }
      }

      this.N[this.N.length - 1] = var2;
   }

   public int d(long var1) {
      return 1 + x44.a<"o">(this, -1504476754191028209L, var1) + c<"t">(3679, 8952286728322249993L ^ var1) + x44.a<"o">(this, -1457570105229469024L, var1) * 4;
   }

   static {
      long var11 = c ^ 51441163873993L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "Ü\u009fxùìDî\u0092GH\u0080\u0096\fî\u0085è\u0018È\u0013\u0006q\u001eÈ]áz_\u0095[\"f\u008fc\u009f\u001b\u009eô\u0099`ó\u0091\u0010\u00ad_wK\u0084\u008a\u0080Á|4¹ú¦\u008eÍ\u0094";
      int var19 = "Ü\u009fxùìDî\u0092GH\u0080\u0096\fî\u0085è\u0018È\u0013\u0006q\u001eÈ]áz_\u0095[\"f\u008fc\u009f\u001b\u009eô\u0099`ó\u0091\u0010\u00ad_wK\u0084\u008a\u0080Á|4¹ú¦\u008eÍ\u0094"
         .length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = b(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            g = var20;
            k = new String[3];
            p = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "º_öÖ<\u00ad\u0015±O`Ö\u0010\rÇSSüÿÀù~yß@";
            int var5 = "º_öÖ<\u00ad\u0015±O`Ö\u0010\rÇSSüÿÀù~yß@".length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               var10001 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            n = var6;
            o = new Integer[3];
            return;
         }

         var16 = var17.charAt(var15);
      }
   }

   private static gj a(gj var0) {
      return var0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12384;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_o1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         k[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("com/zelix/_o1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 286;
      if (o[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = n[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_o1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
