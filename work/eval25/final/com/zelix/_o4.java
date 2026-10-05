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

public class _o4 extends _o2 {
   private final int p;
   private final int[] W;
   private static final long c = ess.a(8339091235801989346L, 2526219598455433568L, MethodHandles.lookup().lookupClass()).a(84882775979170L);
   private static final String[] g;
   private static final String[] k;
   private static final Map l = new HashMap(13);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map o;

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      return x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2);
   }

   public void k(Object[] var1) {
      PrintWriter var2 = (PrintWriter)var1[0];
      long var4 = (Long)var1[1];
      StringBuilder var3 = (StringBuilder)var1[2];
      long var6 = var4 ^ 104031253466172L;
      long var8 = var4 ^ 32198005677074L;
      StringBuilder var11 = new StringBuilder();
      var11.append(x44.a<"l">(this, new Object[]{var8}, 8353405308985101719L, var4));
      int[] var10000 = x44.a<"t">(8216154267410362304L, var4);
      var2.println(var3.toString() + var11.toString());
      int[] var10 = var10000;
      _op var12 = this.N[this.N.length - 1];

      Object var20;
      StringBuilder var10001;
      label59: {
         label58: {
            label57: {
               try {
                  var17 = var2;
                  var10001 = new StringBuilder().append(var3.toString()).append(b<"c">(8041, 1255152849040611728L ^ var4));
                  var20 = var12;
                  if (var10 != null) {
                     break label58;
                  }

                  if (var12 == null) {
                     break label57;
                  }
               } catch (gj var16) {
                  throw x44.a<"t">(var16, 7992067763711402232L, var4);
               }

               var20 = var12;
               break label58;
            }

            var20 = var12;
            break label59;
         }

         var20 = x44.a<"l">(var20, new Object[]{var6}, 8032731987764428496L, var4);
      }

      var17.println(var10001.append(var20).toString());
      int var13 = 0;

      while (var13 < x44.a<"h">(this, 7835611130434470592L, var4)) {
         _op var14 = this.N[var13];

         label44: {
            label43: {
               label42: {
                  try {
                     var18 = var2;
                     var10001 = new StringBuilder()
                        .append(var3.toString())
                        .append(b<"c">(24268, 229621586347874359L ^ var4))
                        .append(x44.a<"h">(this, 7941999034559164019L, var4)[var13]);
                     var20 = b<"c">(22922, 4873197542027779952L ^ var4);
                     if (var4 < 0L) {
                        break label44;
                     }

                     var10001 = var10001.append((String)var20);
                     var20 = var14;
                     if (var10 != null) {
                        break label43;
                     }

                     if (var14 == null) {
                        break label42;
                     }
                  } catch (gj var15) {
                     throw x44.a<"t">(var15, 7992067763711402232L, var4);
                  }

                  var20 = var14;
                  break label43;
               }

               var20 = var14;
               break label44;
            }

            var20 = x44.a<"l">(var20, new Object[]{var6}, 8032731987764428496L, var4);
         }

         var18.println(var10001.append(var20).toString());
         var13++;
         if (var10 != null) {
            break;
         }
      }
   }

   public int d(long var1) {
      return 1
         + x44.a<"o">(this, -1504476754191028209L, var1)
         + c<"n">(32085, 7745315698053138771L ^ var1)
         + x44.a<"o">(this, -1593548091408103521L, var1) * c<"n">(12666, 8683428757488272765L ^ var1);
   }

   _o4(int var1, int var2, _xx var3, int var4, _y4 var5) {
      long var6 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ c;
      long var10001 = var6 ^ 80240788668706L;
      int var8 = (int)((var6 ^ 80240788668706L) >>> 32);
      int var9 = (int)((var6 ^ 80240788668706L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var6 ^ 49167195213470L;
      long var13 = var6 ^ 77166297494998L;
      int[] var10000 = x44.a<"r">(-6630467827521208770L, var6);
      super(c<"n">(3845, 784773851123838880L ^ var6), var8, (char)var9, var10, var3, var4);
      int var16 = var3.readInt();
      int[] var15 = var10000;
      this.p = var3.readInt();
      this.W = new int[x44.a<"n">(this, -4808768343499074754L, var6)];
      this.N = new _op[x44.a<"n">(this, -4808768343499074754L, var6) + 1];
      this.t = new ArrayList(this.N.length);
      int var17 = 0;

      while (true) {
         if (var17 < x44.a<"n">(this, -4808768343499074754L, var6)) {
            int var18 = var3.readInt();
            x44.a<"n">(this, -4626926973743513715L, var6)[var17] = var18;
            int var19 = var3.readInt();
            var22 = x44.a<"k">(-6510914709219704661L, var6).R(x44.a<"n">(this, -4936641280858323596L, var6) + var19, var11);
            if (var15 != null) {
               break;
            }

            Integer var20 = var22;
            var5.G(var20, this, var13);
            this.t.add(var20);
            var17++;
            if (var15 == null) {
               continue;
            }
         }

         var22 = x44.a<"k">(-6510914709219704661L, var6).R(x44.a<"n">(this, -4936641280858323596L, var6) + var16, var11);
         break;
      }

      Integer var21 = var22;
      var5.G(var21, this, var13);
      this.t.add(var21);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      int[] var10000 = x44.a<"p">(3436678178989978228L, var4);
      super.W(var6, var2, var7);
      x44.a<"h">(var2, x44.a<"l">(this, 3533498941551255412L, var4), 3974921034981549113L, var4);
      int var9 = 0;
      int[] var8 = var10000;

      label20:
      while (true) {
         if (var9 < x44.a<"l">(this, 3533498941551255412L, var4)) {
            x44.a<"h">(var2, x44.a<"l">(this, 3711962616090964935L, var4)[var9], 3974921034981549113L, var4);
         } else if (var1 >= 0) {
            return;
         }

         do {
            _op var10 = this.N[var9];
            x44.a<"h">(var2, var10.W() - x44.a<"l">(this, 3978884995804596542L, var4), 3974921034981549113L, var4);
            var9++;
            if (var8 == null) {
               continue label20;
            }
         } while (var1 < 0);

         return;
      }
   }

   static {
      long var11 = c ^ 98515062952909L;
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
      String var17 = "W«¦4íúQuÃ^\u0097ÍÚé²÷\u0010Zh\u0089\u0099¤Ãt25)UÄ\u0018\u000b_ß ß\u001e¼\tF\r|*ciÜ}&xMº\u0091d#ÿ\u0096\u0081ïuµõ:\u0017\u0087D\u008eß";
      int var19 = "W«¦4íúQuÃ^\u0097ÍÚé²÷\u0010Zh\u0089\u0099¤Ãt25)UÄ\u0018\u000b_ß ß\u001e¼\tF\r|*ciÜ}&xMº\u0091d#ÿ\u0096\u0081ïuµõ:\u0017\u0087D\u008eß"
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
            o = new HashMap(13);
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
            String var4 = "º\u0081,mÚ@¦0\u0011²\u001f¾Þ\u0012©a\u009bK\u0013\b^j\u0011á";
            int var5 = "º\u0081,mÚ@¦0\u0011²\u001f¾Þ\u0012©a\u009bK\u0013\b^j\u0011á".length();
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

            m = var6;
            n = new Integer[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31212;
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
            throw new RuntimeException("com/zelix/_o4", var10);
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
         throw new RuntimeException("com/zelix/_o4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20046;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
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
         throw new RuntimeException("com/zelix/_o4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
