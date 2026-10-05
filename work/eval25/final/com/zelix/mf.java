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

public class mf extends xe implements rt {
   int k;
   private boolean S;
   static final w5 u;
   private static final long a = ess.a(-7352041546784851686L, -1480107773385668083L, MethodHandles.lookup().lookupClass()).a(9480198710321L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void o(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      x44.a<"t">(this, var4, 2407691590776158362L, var2);
   }

   mf(int var1, _xx var2, long var3, _83 var5) {
      var3 = a ^ var3;
      super(var1, var5);
      x44.a<"p">(this, var2.readInt(), -5202293550906937794L, var3);
      x44.a<"p">(this, x44.a<"k">(var5, new Object[0], -5257408444993978774L, var3), -5342677457586164036L, var3);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-692706778932719171L, var1);
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 137214445240483L;
      return x44.a<"n">(this, var4, -7303306528107362816L, var2);
   }

   public String l(char var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      return b<"s">(28318, 6525454214999012056L ^ var4);
   }

   public mf(int var1, int var2, char var3, _83 var4, int var5, char var6, boolean var7) {
      long var8 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      super(var1, var4);
      x44.a<"q">(this, var5, -5429950652471317161L, var8);
      x44.a<"q">(this, var7, -5281682112355766827L, var8);
   }

   boolean M(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: pop
      // 16: getstatic com/zelix/mf.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w -760927898044690287
      // 1f: lload 3
      // 20: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 5
      // 27: aload 0
      // 28: ldc2_w -1675156742387027661
      // 2b: lload 3
      // 2c: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: aload 5
      // 33: ifnonnull 55
      // 36: iload 2
      // 37: if_icmpne 58
      // 3a: goto 47
      // 3d: ldc2_w -1713119610828471137
      // 40: lload 3
      // 41: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: bipush 1
      // 48: goto 55
      // 4b: ldc2_w -1713119610828471137
      // 4e: lload 3
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public String N(long var1) {
      return x44.a<"u">(x44.a<"i">(this, -2860985198886813256L, var1), -4405942807515045810L, var1);
   }

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 92703790740844L;

      int var7;
      try {
         var7 = Integer.parseInt(var4);
      } catch (NumberFormatException var9) {
         throw new _su(var4 + b<"s">(19217, 2282692036848511854L ^ var2));
      }

      x44.a<"t">(this, var7, -1141158761210533414L, var2);
      x44.a<"o">(this, new Object[]{var5}, -937336034939244895L, var2);
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-2783949271855399293L, var1).l());
      x44.a<"o">(var3, x44.a<"k">(this, -4082051191442858326L, var1), -4456733857013018314L, var1);
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -889864477128742720L, var2);
   }

   public String t(long var1) {
      return x44.a<"u">(x44.a<"i">(this, 7963413400798902128L, var1), 8364016878525830790L, var1);
   }

   public mf(int var1, _83 var2, mf var3, long var4) {
      var4 = a ^ var4;
      super(var1, var2);
      x44.a<"w">(this, x44.a<"h">(var3, -2570824037306825311L, var4), -2570824037306825311L, var4);
      x44.a<"w">(this, x44.a<"h">(var3, -2430294994997836509L, var4), -2430294994997836509L, var4);
   }

   static {
      long var9 = a ^ 128053641828929L;
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
      String var4 = "=*þ\u008f\u0090 \u0089ÎÒfª\u009bõ.ø\u0016©B\u00922uh[tP¨i7%c6\u0097\u0000\u0012G\u009e#cÇÖ\u0010Ì®²}'(¸RlJ^\u0082Þòi\u007f";
      int var6 = "=*þ\u008f\u0090 \u0089ÎÒfª\u009bõ.ø\u0016©B\u00922uh[tP¨i7%c6\u0097\u0000\u0012G\u009e#cÇÖ\u0010Ì®²}'(¸RlJ^\u0082Þòi\u007f".length();
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
            u = x44.a<"j">(2231605094712421111L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public int z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -1237715603292244191L, var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16547;
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
            throw new RuntimeException("com/zelix/mf", var10);
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
         throw new RuntimeException("com/zelix/mf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
