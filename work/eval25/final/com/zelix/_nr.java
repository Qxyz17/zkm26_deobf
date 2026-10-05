package com.zelix;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _nr implements Serializable {
   protected Map q;
   protected transient boolean b;
   private static final long i = ess.a(4995780400239741700L, 1987861089850576430L, MethodHandles.lookup().lookupClass()).a(147960628208338L);
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public final Enumeration X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = i ^ var2;
      int var4 = (int)((var2 ^ 72826021491940L) >>> 32);
      int var5 = (int)((var2 ^ 72826021491940L) << 32 >>> 32);
      Object[] var10005 = new Object[]{
         null,
         x44.a<"o">(this, -166273131288218806L, var2),
         var5,
         x44.a<"k">(
               new StringBuilder().append(a<"z">(5399, 7377151223716096131L ^ var2)),
               x44.a<"o">(this, -1901184347585152759L, var2),
               -2224834674931524744L,
               var2
            )
            .toString()
      };
      var10005[0] = var4;
      x44.a<"s">(var10005, -223812560537660361L, var2);
      Set var6 = x44.a<"o">(this, -166273131288218806L, var2).keySet();
      var10005 = new Object[]{
         null,
         var6,
         var5,
         x44.a<"k">(
               new StringBuilder().append(a<"z">(4660, 7761692349398921121L ^ var2)),
               x44.a<"o">(this, -1901184347585152759L, var2),
               -2224834674931524744L,
               var2
            )
            .toString()
      };
      var10005[0] = var4;
      x44.a<"s">(var10005, -223812560537660361L, var2);
      return Collections.enumeration(var6);
   }

   public final List A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = i ^ var2;
      return new ArrayList(x44.a<"o">(this, -7185193467463871822L, var2).keySet());
   }

   public void a(List var1) {
      long var2 = i ^ 109680918948703L;
      x44.a<"n">(this, -3062447136644162693L, var2).clear();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         String var5 = (String)var1.get(var4);
         x44.a<"n">(this, -3062447136644162693L, var2).put(var5, var5);
      }
   }

   public final int T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = i ^ var2;
      return x44.a<"i">(this, 2366424709366050348L, var2).size();
   }

   public final boolean b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = i ^ var2;
      return x44.a<"l">(this, -2231922273284620910L, var2);
   }

   public final void r(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      String var5 = (String)var1[2];
      var3 = i ^ var3;
      File var6 = new File(var2, var5);
      if (!x44.a<"l">(var6, -4166331131750936366L, var3) || !x44.a<"l">(var6, -4062421588535327618L, var3) && x44.a<"l">(var6, -2504242986592562650L, var3)) {
         ObjectOutputStream var7 = null;

         try {
            FileOutputStream var8 = new FileOutputStream(var6);
            var7 = new ObjectOutputStream(var8);
            x44.a<"l">(var7, this, -2741829660329407701L, var3);
            x44.a<"w">(this, true, -2784660887885560370L, var3);
         } catch (IOException var17) {
         } finally {
            if (var7 != null) {
               try {
                  x44.a<"l">(var7, -4543500115476787560L, var3);
               } catch (IOException var16) {
               }
            }
         }
      }
   }

   public _nr(long var1) {
      var1 = i ^ var1;
      super();
      x44.a<"r">(this, new LinkedHashMap(), 1106534296831934880L, var1);
   }

   static {
      long var0 = i ^ 138065135426116L;
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
      String var6 = "§\u0086^\u0005¢*,¯\u0086Ø\u0099¦«\u0005Ú¡®×Ý\u0091:-\n\u001dixpúr\u0004Å³Á³§\u0098\t`\u0019l¶F\u0083qAÞó\u008784\u0017¸H¹È\u0088G{é\u008e\u0097-X\"y¹C\u0001\u0097eá[Ng\u0019£veÔ\u0093\u0014O\u0017\u0090\u001f1\u0092ÅÐ\u007fÉù£È\u0001´~Á¡¿!äc6ô";
      int var8 = "§\u0086^\u0005¢*,¯\u0086Ø\u0099¦«\u0005Ú¡®×Ý\u0091:-\n\u001dixpúr\u0004Å³Á³§\u0098\t`\u0019l¶F\u0083qAÞó\u008784\u0017¸H¹È\u0088G{é\u008e\u0097-X\"y¹C\u0001\u0097eá[Ng\u0019£veÔ\u0093\u0014O\u0017\u0090\u001f1\u0092ÅÐ\u007fÉù£È\u0001´~Á¡¿!äc6ô"
         .length();
      char var5 = '0';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            k = var9;
            l = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21365;
      if (l[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_nr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         l[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
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
         throw new RuntimeException("com/zelix/_nr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
