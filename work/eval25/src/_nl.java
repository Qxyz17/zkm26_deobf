package com.zelix;

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

public abstract class _nl extends _n5 {
   private static final long b = ess.a(6873025456666696288L, -1549031232457982817L, MethodHandles.lookup().lookupClass()).a(99703111163407L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   protected final void G(Object[] var1) {
      _uu var2 = (_uu)var1[0];
      int var4 = (Integer)var1[1];
      long var5 = (Long)var1[2];
      int var3 = (Integer)var1[3];
      int var7 = (Integer)var1[4];
   }

   public final void K(Object[] var1) {
      long var3 = (Long)var1[0];
      az var2 = (az)var1[1];
      _uu var5 = (_uu)var1[2];
      long var6 = var3 ^ 40659853048087L;
      long var8 = var3 ^ 139324542296055L;
      x44.a<"o">(
         var5,
         new Object[]{
            a<"b">(511, 2583592220037440530L ^ var3)
               + x44.a<"o">(this, new Object[]{var6}, 2923609937309484140L, var3)
               + a<"b">(2173, 7581818229135994257L ^ var3),
            var8
         },
         3949095066529335522L,
         var3
      );
   }

   public _nl(long var1, int var3) {
      var1 = b ^ var1;
      long var4 = var1 ^ 67581203567534L;
      super(var3, var4);
   }

   static {
      long var0 = b ^ 100502142591282L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Â«\u000e\u0085Ú¨Ï\u0002\fhýÝ)tÐ\u008f\u0082Ý\u0099Ï\u008cô\u0098\u0019\u0085¤Yß\u0087\u00ad\u0097}P6´\u0096\u009f|i¤,\u0012Di \u0091ø^óÖYï|×}f1\u0090?\u0004`\u0099\u0002\u0004 \u0097\u0000LJãæÌ\u0016Ó\u0095©§\r\u0097kÂá\n&\u008bNF.Ý\u0007}½\u0098Mü\u0094á";
      int var8 = "Â«\u000e\u0085Ú¨Ï\u0002\fhýÝ)tÐ\u008f\u0082Ý\u0099Ï\u008cô\u0098\u0019\u0085¤Yß\u0087\u00ad\u0097}P6´\u0096\u009f|i¤,\u0012Di \u0091ø^óÖYï|×}f1\u0090?\u0004`\u0099\u0002\u0004 \u0097\u0000LJãæÌ\u0016Ó\u0095©§\r\u0097kÂá\n&\u008bNF.Ý\u0007}½\u0098Mü\u0094á"
         .length();
      char var5 = '@';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24184;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_nl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_nl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
