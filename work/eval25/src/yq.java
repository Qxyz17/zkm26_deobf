package com.zelix;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class yq extends JComboBox implements ItemListener, yz {
   private DefaultComboBoxModel a;
   private static final long b = ess.a(8861952764585714876L, 8261196821438911077L, MethodHandles.lookup().lookupClass()).a(215733851201366L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public yq(long var1, int var3, pt[] var4) {
      var1 = b ^ var1;
      long var5 = var1 ^ 65221836419922L;
      super();
      Object[] var10005 = new Object[]{null, var5, var4};
      var10005[0] = var3;
      x44.a<"j">(this, var10005, -6628903469270704003L, var1);
   }

   public void U(Object[] param1) {
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
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast [Lcom/zelix/pt;
      // 01c: astore 3
      // 01d: pop
      // 01e: getstatic com/zelix/yq.b J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: ldc2_w 3127717313994852685
      // 029: lload 4
      // 02b: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: aload 0
      // 031: new javax/swing/DefaultComboBoxModel
      // 034: dup
      // 035: invokespecial javax/swing/DefaultComboBoxModel.<init> ()V
      // 038: ldc2_w 3635229975294124858
      // 03b: lload 4
      // 03d: invokedynamic v (Ljava/lang/Object;Ljavax/swing/DefaultComboBoxModel;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: astore 6
      // 044: aload 6
      // 046: ifnull 0b2
      // 049: aload 3
      // 04a: ifnull 088
      // 04d: goto 05b
      // 050: ldc2_w 2959396202115217069
      // 053: lload 4
      // 055: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: aload 3
      // 05c: arraylength
      // 05d: aload 6
      // 05f: ifnull 0cd
      // 062: goto 070
      // 065: ldc2_w 2959396202115217069
      // 068: lload 4
      // 06a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: lload 4
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 0bf
      // 077: ifne 0be
      // 07a: goto 088
      // 07d: ldc2_w 2959396202115217069
      // 080: lload 4
      // 082: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: aload 0
      // 089: ldc2_w 3635229975294124858
      // 08c: lload 4
      // 08e: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultComboBoxModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: new com/zelix/pm
      // 096: dup
      // 097: invokespecial com/zelix/pm.<init> ()V
      // 09a: ldc2_w 3715609058678297868
      // 09d: lload 4
      // 09f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: goto 0b2
      // 0a7: ldc2_w 2959396202115217069
      // 0aa: lload 4
      // 0ac: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: lload 4
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: iflt 15f
      // 0b9: aload 6
      // 0bb: ifnonnull 118
      // 0be: bipush 0
      // 0bf: goto 0cd
      // 0c2: ldc2_w 2959396202115217069
      // 0c5: lload 4
      // 0c7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: istore 7
      // 0cf: iload 7
      // 0d1: aload 3
      // 0d2: arraylength
      // 0d3: if_icmpge 118
      // 0d6: aload 0
      // 0d7: ldc2_w 3635229975294124858
      // 0da: lload 4
      // 0dc: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultComboBoxModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: aload 3
      // 0e2: iload 7
      // 0e4: aaload
      // 0e5: ldc2_w 3715609058678297868
      // 0e8: lload 4
      // 0ea: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: iinc 7 1
      // 0f2: aload 6
      // 0f4: lload 4
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 100
      // 0fb: ifnull 15f
      // 0fe: aload 6
      // 100: ifnonnull 0cf
      // 103: lload 4
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 0f2
      // 10a: goto 118
      // 10d: ldc2_w 2959396202115217069
      // 110: lload 4
      // 112: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: aload 0
      // 119: aload 0
      // 11a: ldc2_w 3635229975294124858
      // 11d: lload 4
      // 11f: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultComboBoxModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: ldc2_w 3699662105467728816
      // 127: lload 4
      // 129: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: aload 0
      // 12f: iload 2
      // 130: ldc2_w 3638109307144844956
      // 133: lload 4
      // 135: invokedynamic m (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: aload 0
      // 13b: aload 0
      // 13c: ldc2_w 3269224876642320643
      // 13f: lload 4
      // 141: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: aload 0
      // 147: sipush 3181
      // 14a: ldc2_w 8362295698553667792
      // 14d: lload 4
      // 14f: lxor
      // 150: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/yq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: ldc2_w 3796627157810277438
      // 158: lload 4
      // 15a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: return
   }

   @Override
   public void itemStateChanged(ItemEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/yq.b J
      // 03: ldc2_w 7027585256832
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -6758583097946079202
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 1
      // 14: aload 4
      // 16: ifnull 4a
      // 19: ldc2_w -4798863482307101808
      // 1c: lload 2
      // 1d: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: bipush 1
      // 23: if_icmpne 69
      // 26: goto 33
      // 29: ldc2_w -6898757053007773698
      // 2c: lload 2
      // 2d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: aload 0
      // 34: ldc2_w -5179151844092130544
      // 37: lload 2
      // 38: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: goto 4a
      // 40: ldc2_w -6898757053007773698
      // 43: lload 2
      // 44: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: checkcast com/zelix/pt
      // 4d: astore 5
      // 4f: aload 0
      // 50: sipush 14757
      // 53: ldc2_w 908147900918611018
      // 56: lload 2
      // 57: lxor
      // 58: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/yq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: aconst_null
      // 5e: aload 5
      // 60: ldc2_w -6852282810539432590
      // 63: lload 2
      // 64: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: return
   }

   static {
      long var0 = b ^ 67317801193500L;
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
      String var6 = "£Â\u0015ËX>\u009e\u0091ã%\u0006ÛMM\u0092FçA<¶Ø'xª\u0011µ#ÖÃ\u00adgVf\u0083\u0003\u008a\fÖ2¬ Â«h\u0004Õ]n Â\fÀx_[b§-\u008bf_\u00adsFuÜô0\u001b\u0083ì\u0092\u008c";
      int var8 = "£Â\u0015ËX>\u009e\u0091ã%\u0006ÛMM\u0092FçA<¶Ø'xª\u0011µ#ÖÃ\u00adgVf\u0083\u0003\u008a\fÖ2¬ Â«h\u0004Õ]n Â\fÀx_[b§-\u008bf_\u00adsFuÜô0\u001b\u0083ì\u0092\u008c"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13386;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/yq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/yq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
