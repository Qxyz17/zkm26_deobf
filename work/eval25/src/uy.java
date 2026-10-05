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
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public class uy extends JFrame implements w2 {
   private static String s;
   protected static final String T;
   private static final long eb = ess.a(-2872877999164706495L, -5590612496365029021L, MethodHandles.lookup().lookupClass()).a(262417941276280L);
   private static final String[] fb;
   private static final String[] gb;
   private static final Map hb = new HashMap(13);

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"o">(this, false, -5125292264653013775L, var2);
      x44.a<"o">(this, -6618741808339081002L, var2);
   }

   public uy(String var1, long var2) {
      var2 = eb ^ var2;
      super(var1);
      x44.a<"m">(this, new Object[0], -865789504128972769L, var2);
   }

   protected void P(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public static void C(String var0) {
      s = var0;
   }

   @Override
   protected JRootPane createRootPane() {
      long var1 = eb ^ 73688924209797L;
      JRootPane var3 = new JRootPane();
      KeyStroke var4 = x44.a<"r">(a<"n">(21339, 5393974179033176245L ^ var1), -6546918004455812411L, var1);
      Action var5 = x44.a<"j">(this, new Object[0], -4951026780761308244L, var1);
      InputMap var6 = x44.a<"j">(var3, 2, -4796364507908556151L, var1);
      x44.a<"j">(var6, var4, a<"n">(1432, 2999929742856359543L ^ var1), -6491677745736495456L, var1);
      x44.a<"j">(x44.a<"j">(var3, -6565728098999282055L, var1), a<"n">(1432, 2999929742856359543L ^ var1), var5, -4799054545581750583L, var1);
      return var3;
   }

   static {
      long var9 = eb ^ 25146035302967L;
      x44.a<"p">("g7sUEc", 1707667971209692219L, var9);
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
      String var4 = "ª\u00136ýç\u000361:t(ªq¿Ï\u001c\u0010¸Þ\u0001×9\u008asl\u0085f\u0095GØÁßh";
      int var6 = "ª\u00136ýç\u000361:t(ªq¿Ï\u001c\u0010¸Þ\u0001×9\u008asl\u0085f\u0095GØÁßh".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            fb = var7;
            gb = new String[2];
            T = x44.a<"i">(939488458417253990L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   @Override
   public void setVisible(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/uy.eb J
      // 03: ldc2_w 73775502492650
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 101952235738027
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -1744348709261357083
      // 14: lload 2
      // 15: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 0
      // 1d: aload 6
      // 1f: ifnull 45
      // 22: iload 1
      // 23: invokespecial javax/swing/JFrame.setVisible (Z)V
      // 26: iload 1
      // 27: ifeq 5d
      // 2a: goto 37
      // 2d: ldc2_w -1783474255585836002
      // 30: lload 2
      // 31: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: aload 0
      // 38: goto 45
      // 3b: ldc2_w -1783474255585836002
      // 3e: lload 2
      // 3f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: lload 4
      // 47: bipush 1
      // 48: anewarray 255
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w -1872696735781874771
      // 57: lload 2
      // 58: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: return
   }

   public Action a(Object[] var1) {
      return new _zc(this);
   }

   private void p(Object[] var1) {
   }

   public static String c() {
      return s;
   }

   public uy(long var1) {
      var1 = eb ^ var1;
      super();
      x44.a<"l">(this, new Object[0], 8907375479119085694L, var1);
   }

   @Override
   public void validateTree() {
      super.validateTree();
   }

   public void G(long var1, v_ var3, Object var4, Object var5, Object var6) {
   }

   @Override
   public void doLayout() {
      super.doLayout();
   }

   @Override
   public void validate() {
      super.validate();
   }

   @Override
   public void invalidate() {
      super.invalidate();
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9102;
      if (gb[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])hb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               hb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/uy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = fb[var5].getBytes("ISO-8859-1");
         gb[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return gb[var5];
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
         throw new RuntimeException("com/zelix/uy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
