package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ms extends xe implements rt {
   static final w5 G;
   long L;
   private boolean P;
   private static final long a = ess.a(3800186515058687748L, 2671406170171371349L, MethodHandles.lookup().lookupClass()).a(4144431385272L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public String t(long var1) {
      return x44.a<"u">(this.L, 7827469888647053179L, var1);
   }

   public void k(Object[] var1) {
      long var2 = (Long)var1[0];
      this.L = var2;
   }

   public boolean K(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -791772465452909379L, var2);
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 137214445240483L;
      return x44.a<"n">(this, var4, -7257304476222102258L, var2);
   }

   boolean Q(long var1, long var3) {
      var3 = a ^ var3;
      String[] var5 = x44.a<"w">(-2631840966962659688L, var3);

      try {
         long var8;
         int var10000 = (var8 = this.L - var1) == 0L ? 0 : (var8 < 0L ? -1 : 1);
         if (var5 != null) {
            return (boolean)var10000;
         }

         if (!var10000) {
            return (boolean)1;
         }
      } catch (NumberFormatException var6) {
         throw x44.a<"w">(var6, -4403760917222740757L, var3);
      }

      return (boolean)0;
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public ms(int var1, byte var2, _83 var3, int var4, int var5, ms var6) {
      long var7 = ((long)var2 << 56 | (long)var4 << 32 >>> 8 | (long)var5 << 40 >>> 40) ^ a;
      super(var1, var3);
      this.L = var6.L;
      x44.a<"v">(this, x44.a<"i">(var6, -2278121602061473316L, var7), -2278121602061473316L, var7);
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(G.l());
      var3.writeLong(this.L);
   }

   public ms(int var1, long var2, _83 var4, long var5, boolean var7) {
      var2 = a ^ var2;
      super(var1, var4);
      this.L = var5;
      x44.a<"q">(this, var7, -5076322396578828237L, var2);
   }

   protected int o(long var1) {
      return 2;
   }

   ms(int var1, long var2, _xx var4, _83 var5) {
      var2 = a ^ var2;
      super(var1, var5);
      this.L = x44.a<"o">(var4, 7247991449940341831L, var2);
      x44.a<"t">(this, x44.a<"o">(var5, new Object[0], 7236719348028501262L, var2), 9059104434242188294L, var2);
   }

   public long R(Object[] var1) {
      return this.L;
   }

   static {
      long var9 = a ^ 80115183758638L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "\u0082ë\u0084¯Ð+d\u0006=A'\u0085÷c/\u000b\u0005lFrá\u0084Tâ´æË~\u0094W\u0099^MX\u0093g\u007f\u001a\u009b3\u0010zÆ\u0013Þ\u0017²~áh§;\u0019y\u0006n\u0096";
      int var6 = "\u0082ë\u0084¯Ð+d\u0006=A'\u0085÷c/\u000b\u0005lFrá\u0084Tâ´æË~\u0094W\u0099^MX\u0093g\u007f\u001a\u009b3\u0010zÆ\u0013Þ\u0017²~áh§;\u0019y\u0006n\u0096"
         .length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            G = x44.a<"k">(6786549103895535166L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public w5 m(long var1) {
      return G;
   }

   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      long var5 = var3 ^ 92703790740844L;

      long var7;
      try {
         var7 = x44.a<"w">(var2, -1312197746025983666L, var3);
      } catch (NumberFormatException var10) {
         throw new _su(var2 + b<"r">(29177, 2886199667682526216L ^ var3));
      }

      this.L = var7;
      x44.a<"o">(this, new Object[]{var5}, -937336034939244895L, var3);
   }

   public String N(long var1) {
      return x44.a<"u">(this.L, -2708698360673990221L, var1);
   }

   public ms(int var1, _83 var2, long var3, long var5) {
      var5 = a ^ var5;
      super(var1, var2);
      this.L = var3;
      x44.a<"r">(this, false, 7545287430555230472L, var5);
   }

   public String l(char var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      return b<"r">(2363, 2712793290183803123L ^ var4);
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21805;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ms", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/ms" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
