package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class jf implements _za {
   protected _za[] O;
   private static int[] T;
   protected static String P;
   protected _za J;
   protected int j;
   private static final long o = ess.a(-5499714749081914317L, -6340418695015471009L, MethodHandles.lookup().lookupClass()).a(155369433714060L);
   private static final String ab;

   public fw W(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"h">(x44.a<"l">(this, -2547544511729195464L, var2), new Object[]{var4}, -4171151013038172335L, var2);
   }

   public void d(Object[] var1) {
   }

   public static String Q(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = o ^ var1;
      long var3 = var1 ^ 73641451614842L;
      return "[" + x44.a<"p">(new Object[]{var3}, 7837600118829272988L, var1) + "]";
   }

   public _za q(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"h">(this, -8191744368926853940L, var2);
   }

   public void u(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      x44.a<"t">(this, var2, -2960534830416417673L, var3);
   }

   static {
      long var3 = o ^ 20799322541107L;
      if (x44.a<"q">(-7819049545503034685L, var3) != null) {
         x44.a<"q">(new int[4], -7938122524260437798L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal(
         "Î\u001aË6VIR#V¸-rÃa6\u0087ÖÖ\u009a\u0001§\u0016(\u0081Á²&Ô¯îKgìÈ;ÁMr}\u008e²\u0093i\u001d\u0000\bfMD\u0000)Å\u0082?C¿".getBytes("ISO-8859-1")
      );
      String var5 = a(var2).intern();
      byte var10001 = -1;
      ab = var5;
      x44.a<"p">("!", -8472583784205353934L, var3);
   }

   public jf(long var1, int var3) {
      var1 = o ^ var1;
      super();
      x44.a<"u">(this, var3, 1349979718029569650L, var1);
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = o ^ var2;
      return x44.a<"j">(-4432238354442392654L, var2)[x44.a<"o">(this, -2348329284540718169L, var2)];
   }

   public static int[] k() {
      return T;
   }

   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var3 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var4 ^ 52372067873427L;
      throw new Error(ab + x44.a<"i">(this, new Object[]{var6}, 7386388780098724985L, var4));
   }

   public void v(Object[] param1) {
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
      // 04: checkcast com/zelix/_za
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Integer
      // 0f: invokevirtual java/lang/Integer.intValue ()I
      // 12: istore 4
      // 14: dup
      // 15: bipush 2
      // 16: aaload
      // 17: checkcast java/lang/Long
      // 1a: invokevirtual java/lang/Long.longValue ()J
      // 1d: lstore 2
      // 1e: pop
      // 1f: ldc2_w -1318925108700787700
      // 22: lload 2
      // 23: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: astore 6
      // 2a: aload 0
      // 2b: lload 2
      // 2c: lconst_0
      // 2d: lcmp
      // 2e: ifle 57
      // 31: aload 6
      // 33: ifnonnull 57
      // 36: getfield com/zelix/jf.O [Lcom/zelix/_za;
      // 39: ifnonnull 6c
      // 3c: goto 49
      // 3f: ldc2_w -1211891208103209246
      // 42: lload 2
      // 43: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 57
      // 4d: ldc2_w -1211891208103209246
      // 50: lload 2
      // 51: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 4
      // 59: bipush 1
      // 5a: iadd
      // 5b: anewarray 87
      // 5e: putfield com/zelix/jf.O [Lcom/zelix/_za;
      // 61: lload 2
      // 62: lconst_0
      // 63: lcmp
      // 64: ifle d0
      // 67: aload 6
      // 69: ifnull c7
      // 6c: iload 4
      // 6e: lload 2
      // 6f: lconst_0
      // 70: lcmp
      // 71: ifle ac
      // 74: aload 0
      // 75: getfield com/zelix/jf.O [Lcom/zelix/_za;
      // 78: arraylength
      // 79: aload 6
      // 7b: ifnonnull ab
      // 7e: goto 8b
      // 81: ldc2_w -1211891208103209246
      // 84: lload 2
      // 85: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: if_icmplt c7
      // 8e: goto 9b
      // 91: ldc2_w -1211891208103209246
      // 94: lload 2
      // 95: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: iload 4
      // 9d: bipush 1
      // 9e: goto ab
      // a1: ldc2_w -1211891208103209246
      // a4: lload 2
      // a5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: iadd
      // ac: anewarray 87
      // af: astore 7
      // b1: aload 0
      // b2: getfield com/zelix/jf.O [Lcom/zelix/_za;
      // b5: bipush 0
      // b6: aload 7
      // b8: bipush 0
      // b9: aload 0
      // ba: getfield com/zelix/jf.O [Lcom/zelix/_za;
      // bd: arraylength
      // be: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // c1: aload 0
      // c2: aload 7
      // c4: putfield com/zelix/jf.O [Lcom/zelix/_za;
      // c7: aload 0
      // c8: getfield com/zelix/jf.O [Lcom/zelix/_za;
      // cb: iload 4
      // cd: aload 5
      // cf: aastore
      // d0: return
   }

   public static void q(int[] var0) {
      T = var0;
   }

   public _za e(int var1) {
      return this.O[var1];
   }

   public void z(Object[] var1) {
   }

   public int W(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: ldc2_w 319561718683411921
      // 0f: lload 2
      // 10: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: astore 4
      // 17: aload 0
      // 18: getfield com/zelix/jf.O [Lcom/zelix/_za;
      // 1b: aload 4
      // 1d: ifnonnull 42
      // 20: ifnonnull 3e
      // 23: goto 30
      // 26: ldc2_w 500757690384727871
      // 29: lload 2
      // 2a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: bipush 0
      // 31: goto 43
      // 34: ldc2_w 500757690384727871
      // 37: lload 2
      // 38: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/jf.O [Lcom/zelix/_za;
      // 42: arraylength
      // 43: ireturn
   }

   private static gj d(gj var0) {
      return var0;
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
}
