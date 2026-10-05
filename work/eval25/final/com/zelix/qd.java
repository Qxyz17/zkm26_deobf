package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qd {
   private w9 m;
   private int J;
   private static final long a = ess.a(-4009958389018159206L, 1755679246885754050L, MethodHandles.lookup().lookupClass()).a(262159142722646L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   @Override
   public Object clone() {
      long var1 = a ^ 40792748008153L;
      long var3 = var1 ^ 128344983638068L;
      long var5 = var1 ^ 107516713201995L;
      int var8 = x44.a<"n">(x44.a<"j">(this, 885012054422069695L, var1), 909815833439404921L, var1);
      String var10000 = x44.a<"v">(1562626398802349227L, var1);
      qd var9 = new qd(var8, var3);
      String var7 = var10000;
      Iterator var10 = x44.a<"n">(x44.a<"j">(this, 885012054422069695L, var1), 1238157478094865003L, var1).iterator();

      while (true) {
         if (var10.hasNext()) {
            Entry var11 = (Entry)var10.next();
            ArrayList var12 = new ArrayList((Collection)var11.getValue());

            try {
               var14 = var9;
               if (var7 != null) {
                  break;
               }

               x44.a<"n">(var9, new Object[]{var5, var11.getKey(), var12}, 1290734676878189143L, var1);
               if (var7 == null) {
                  continue;
               }
            } catch (gj var13) {
               throw x44.a<"v">(var13, 1320392377260201498L, var1);
            }
         }

         var14 = var9;
         break;
      }

      return var14;
   }

   public List O(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var4 = var1[1];
      var2 = a ^ var2;
      return (List)x44.a<"m">(x44.a<"i">(this, -5756933764884357652L, var2), var4, -5354114500221154342L, var2);
   }

   public qd(int var1, int var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 111296652232686L;
      super();
      x44.a<"v">(this, a<"l">(28702, 7016046288912995942L ^ var3), -4518753872791128057L, var3);
      x44.a<"v">(this, var2, -4518753872791128057L, var3);
      x44.a<"v">(this, new w9(var5, var1), -4178416739749532684L, var3);
   }

   public synchronized Enumeration X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 67311903156588L;
      return x44.a<"o">(x44.a<"k">(this, 772695583963490126L, var2), new Object[]{var4}, 1162394924297064305L, var2);
   }

   public qd(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 64388093324151L;
      this(a<"l">(25197, 1209289897970322127L ^ var1), 5, var3);
   }

   public int w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(x44.a<"j">(this, 8728077119563257047L, var2), 8775328254503613969L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void D(Object[] var1) {
      Object var3 = var1[0];
      long var4 = (Long)var1[1];
      Object var2 = var1[2];
      var4 = a ^ var4;
      String var10000 = x44.a<"r">(-4599359646957643473L, var4);
      Object var7 = (List)x44.a<"j">(x44.a<"n">(this, -2752707154248600517L, var4), var3, -2565515315542449651L, var4);
      String var6 = var10000;

      label49: {
         label44: {
            try {
               var12 = var7;
               if (var6 != null) {
                  break label49;
               }

               if (var7 != null) {
                  break label44;
               }
            } catch (gj var10) {
               throw x44.a<"r">(var10, -4046867495810006114L, var4);
            }

            var7 = new ArrayList(x44.a<"n">(this, -2412510776009545784L, var4));

            try {
               var12 = var7;
               if (var4 < 0L) {
                  break label49;
               }

               var7.add(var2);
               x44.a<"j">(x44.a<"n">(this, -2752707154248600517L, var4), var3, var7, -2332157242675345114L, var4);
               if (var6 == null) {
                  return;
               }
            } catch (gj var9) {
               boolean var10001 = false;
               throw x44.a<"r">(var9, -4046867495810006114L, var4);
            }
         }

         try {
            var12 = var7;
         } catch (gj var8) {
            boolean var14 = false;
            throw x44.a<"r">(var8, -4046867495810006114L, var4);
         }
      }

      var12.add(var2);
   }

   public qd(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 14714142874239L;
      this(var1, 5, var4);
   }

   public boolean I(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return x44.a<"n">(x44.a<"j">(this, -8887754591467820705L, var2), var4, -8828711281452126635L, var2);
   }

   public void M(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var2 = var1[1];
      List var5 = (List)var1[2];
      var3 = a ^ var3;
      x44.a<"i">(x44.a<"m">(this, 6390455472671585624L, var3), var2, var5, 6827911483840841797L, var3);
   }

   static {
      long var0 = a ^ 110467436795821L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "L«\u0013\u0004§\u000f&\u0088ì\u0091Il#Hüé";
      int var7 = "L«\u0013\u0004§\u000f&\u0088ì\u0091Il#Hüé".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27463;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/qd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/qd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
