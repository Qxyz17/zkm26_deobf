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
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public abstract class s2 extends JDialog {
   protected static final String v;
   protected JFrame G;
   private static final long f = ess.a(6645950407925649940L, -6111282661422009289L, MethodHandles.lookup().lookupClass()).a(28204629259761L);
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public final void G(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = f ^ var3;
      long var5 = var3 ^ 89227484725297L;
      Object[] var10006 = new Object[]{null, null, null, var2};
      var10006[2] = var5;
      var10006[1] = 0;
      var10006[0] = 0;
      x44.a<"o">(this, var10006, 4671320939376348562L, var3);
   }

   static {
      long var9 = f ^ 88756825689046L;
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
      String var4 = "\u0003\u0000V\u000b±9@1ä\u0086Ñ\u0081í\u0015Ó\u0018\u0010\rôÀÙ¡\u0018â¿\u0080D\u0094\u0092\u00121\u0014í";
      int var6 = "\u0003\u0000V\u000b±9@1ä\u0086Ñ\u0081í\u0015Ó\u0018\u0010\rôÀÙ¡\u0018â¿\u0080D\u0094\u0092\u00121\u0014í".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            g = var7;
            h = new String[2];
            v = x44.a<"m">(6979897736399766450L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public final void j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = f ^ var2;
      long var4 = var2 ^ 89596560686603L;
      Object[] var10006 = new Object[]{null, null, null, true};
      var10006[2] = var4;
      var10006[1] = 0;
      var10006[0] = 0;
      x44.a<"m">(this, var10006, 9145084606460670888L, var2);
   }

   public s2(JFrame var1, String var2, boolean var3, long var4) {
      var4 = f ^ var4;
      super(var1, var2, var3);
      x44.a<"s">(this, var1, 8859932441044325981L, var4);
      d var6 = new d(this);
      x44.a<"h">(this, var6, 9173651153564786309L, var4);
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"j">(this, false, -9054523379870705048L, var2);
      x44.a<"j">(this, -7365045833075841285L, var2);
   }

   public Action v(Object[] var1) {
      return new _rb(this);
   }

   @Override
   protected JRootPane createRootPane() {
      long var1 = f ^ 64338242104047L;
      JRootPane var3 = new JRootPane();
      KeyStroke var4 = x44.a<"u">(a<"b">(4426, 8279064120596718834L ^ var1), -7387103065170940262L, var1);
      Action var5 = x44.a<"m">(this, new Object[0], -6941464141858665619L, var1);
      InputMap var6 = x44.a<"m">(var3, 2, -9137535629799356714L, var1);
      x44.a<"m">(var6, var4, a<"b">(10511, 1961732800741498038L ^ var1), -7370143703881125121L, var1);
      x44.a<"m">(x44.a<"m">(var3, -7440288321326224858L, var1), a<"b">(10511, 1961732800741498038L ^ var1), var5, -9135194001616110954L, var1);
      return var3;
   }

   public final void d(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 3
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Long
      // 01c: invokevirtual java/lang/Long.longValue ()J
      // 01f: lstore 5
      // 021: dup
      // 022: bipush 3
      // 023: aaload
      // 024: checkcast java/lang/Boolean
      // 027: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02a: istore 2
      // 02b: pop
      // 02c: getstatic com/zelix/s2.f J
      // 02f: lload 5
      // 031: lxor
      // 032: lstore 5
      // 034: lload 5
      // 036: dup2
      // 037: ldc2_w 115076257795854
      // 03a: lxor
      // 03b: lstore 7
      // 03d: pop2
      // 03e: ldc2_w 4478980159581001223
      // 041: lload 5
      // 043: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: aload 0
      // 049: ldc2_w 2692039952925473133
      // 04c: lload 5
      // 04e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: astore 10
      // 055: astore 9
      // 057: iload 2
      // 058: aload 9
      // 05a: ifnull 0a4
      // 05d: ifeq 15c
      // 060: goto 06e
      // 063: ldc2_w 4125130159179848086
      // 066: lload 5
      // 068: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: aload 0
      // 06f: ldc2_w 4608248300995892058
      // 072: lload 5
      // 074: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JFrame; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: aload 9
      // 07b: ifnull 0c0
      // 07e: goto 08c
      // 081: ldc2_w 4125130159179848086
      // 084: lload 5
      // 086: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: ldc2_w 4565012826098969211
      // 08f: lload 5
      // 091: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: goto 0a4
      // 099: ldc2_w 4125130159179848086
      // 09c: lload 5
      // 09e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: ifeq 15c
      // 0a7: aload 0
      // 0a8: ldc2_w 4608248300995892058
      // 0ab: lload 5
      // 0ad: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JFrame; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: goto 0c0
      // 0b5: ldc2_w 4125130159179848086
      // 0b8: lload 5
      // 0ba: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: ldc2_w 4219387586957565455
      // 0c3: lload 5
      // 0c5: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Point; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: astore 13
      // 0cc: aload 0
      // 0cd: ldc2_w 4608248300995892058
      // 0d0: lload 5
      // 0d2: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JFrame; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: ldc2_w 4571619667337237961
      // 0da: lload 5
      // 0dc: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: astore 14
      // 0e3: aload 14
      // 0e5: ldc2_w 4492829394387781353
      // 0e8: lload 5
      // 0ea: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: bipush 2
      // 0f0: idiv
      // 0f1: aload 10
      // 0f3: ldc2_w 4492829394387781353
      // 0f6: lload 5
      // 0f8: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: bipush 2
      // 0fe: idiv
      // 0ff: isub
      // 100: aload 13
      // 102: ldc2_w 4300913012505275905
      // 105: lload 5
      // 107: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: iadd
      // 10d: istore 11
      // 10f: aload 14
      // 111: ldc2_w 4419943443121391691
      // 114: lload 5
      // 116: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: bipush 2
      // 11c: idiv
      // 11d: aload 10
      // 11f: ldc2_w 4419943443121391691
      // 122: lload 5
      // 124: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: bipush 2
      // 12a: idiv
      // 12b: isub
      // 12c: aload 13
      // 12e: ldc2_w 4296772871199016603
      // 131: lload 5
      // 133: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: iadd
      // 139: istore 12
      // 13b: bipush 0
      // 13c: iload 11
      // 13e: invokestatic java/lang/Math.max (II)I
      // 141: iload 4
      // 143: iadd
      // 144: istore 11
      // 146: bipush 0
      // 147: iload 12
      // 149: invokestatic java/lang/Math.max (II)I
      // 14c: iload 3
      // 14d: iadd
      // 14e: istore 12
      // 150: lload 5
      // 152: lconst_0
      // 153: lcmp
      // 154: ifle 1fc
      // 157: aload 9
      // 159: ifnonnull 1c5
      // 15c: ldc2_w 2791956474051622126
      // 15f: lload 5
      // 161: invokedynamic w (JJ)Ljava/awt/Toolkit; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: ldc2_w 4183996550162348530
      // 169: lload 5
      // 16b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: astore 13
      // 172: aload 13
      // 174: ldc2_w 4492829394387781353
      // 177: lload 5
      // 179: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: bipush 2
      // 17f: idiv
      // 180: aload 10
      // 182: ldc2_w 4492829394387781353
      // 185: lload 5
      // 187: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: bipush 2
      // 18d: idiv
      // 18e: isub
      // 18f: istore 11
      // 191: aload 13
      // 193: ldc2_w 4419943443121391691
      // 196: lload 5
      // 198: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: bipush 2
      // 19e: idiv
      // 19f: aload 10
      // 1a1: ldc2_w 4419943443121391691
      // 1a4: lload 5
      // 1a6: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: bipush 2
      // 1ac: idiv
      // 1ad: isub
      // 1ae: istore 12
      // 1b0: bipush 0
      // 1b1: iload 11
      // 1b3: invokestatic java/lang/Math.max (II)I
      // 1b6: iload 4
      // 1b8: iadd
      // 1b9: istore 11
      // 1bb: bipush 0
      // 1bc: iload 12
      // 1be: invokestatic java/lang/Math.max (II)I
      // 1c1: iload 3
      // 1c2: iadd
      // 1c3: istore 12
      // 1c5: aload 0
      // 1c6: iload 11
      // 1c8: iload 12
      // 1ca: ldc2_w 4330948867966576935
      // 1cd: lload 5
      // 1cf: invokedynamic o (Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: lload 7
      // 1d6: aload 0
      // 1d7: bipush 1
      // 1d8: bipush 3
      // 1d9: anewarray 252
      // 1dc: dup_x1
      // 1dd: swap
      // 1de: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1e1: bipush 2
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x1
      // 1e5: swap
      // 1e6: bipush 1
      // 1e7: swap
      // 1e8: aastore
      // 1e9: dup_x2
      // 1ea: dup_x2
      // 1eb: pop
      // 1ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ef: bipush 0
      // 1f0: swap
      // 1f1: aastore
      // 1f2: ldc2_w 4465238193967097899
      // 1f5: lload 5
      // 1f7: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: return
   }

   private static gj b(gj var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24967;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/s2", var10);
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
         h[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("com/zelix/s2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
