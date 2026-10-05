package com.zelix;

import java.awt.Cursor;
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
import javax.swing.JPanel;

public class wa extends JPanel {
   so S;
   Cursor b;
   boolean z;
   private static final long a = ess.a(4664546326123200336L, -1424245333587512232L, MethodHandles.lookup().lookupClass()).a(56088858095685L);
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   void r(Object[] param1) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/wa.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w -3053187711323013745
      // 015: lload 2
      // 016: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: astore 4
      // 01d: aload 0
      // 01e: ldc2_w -3650974344082046416
      // 021: lload 2
      // 022: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/so; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: ldc2_w -3998624015771095406
      // 02a: lload 2
      // 02b: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: aload 4
      // 032: ifnull 0d4
      // 035: ifne 0af
      // 038: goto 045
      // 03b: ldc2_w -3334825771638819410
      // 03e: lload 2
      // 03f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: athrow
      // 045: aload 0
      // 046: ldc2_w -3650974344082046416
      // 049: lload 2
      // 04a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/so; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: ldc2_w -3546372968393029932
      // 052: lload 2
      // 053: invokedynamic k (Ljava/lang/Object;JJ)F bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: f2d
      // 059: ldc2_w 0.5
      // 05c: dcmpg
      // 05d: ifge 08e
      // 060: goto 06d
      // 063: ldc2_w -3334825771638819410
      // 066: lload 2
      // 067: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: new java/awt/Cursor
      // 070: dup
      // 071: sipush 2114
      // 074: ldc2_w 2768512397046467117
      // 077: lload 2
      // 078: lxor
      // 079: invokedynamic i (IJ)I bsm=com/zelix/wa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokespecial java/awt/Cursor.<init> (I)V
      // 081: astore 5
      // 083: lload 2
      // 084: lconst_0
      // 085: lcmp
      // 086: iflt 11a
      // 089: aload 4
      // 08b: ifnonnull 10e
      // 08e: new java/awt/Cursor
      // 091: dup
      // 092: sipush 2649
      // 095: ldc2_w 461857100538955829
      // 098: lload 2
      // 099: lxor
      // 09a: invokedynamic i (IJ)I bsm=com/zelix/wa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: invokespecial java/awt/Cursor.<init> (I)V
      // 0a2: astore 5
      // 0a4: lload 2
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: ifle 11a
      // 0aa: aload 4
      // 0ac: ifnonnull 10e
      // 0af: aload 0
      // 0b0: ldc2_w -3650974344082046416
      // 0b3: lload 2
      // 0b4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/so; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: ldc2_w -3546372968393029932
      // 0bc: lload 2
      // 0bd: invokedynamic k (Ljava/lang/Object;JJ)F bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: f2d
      // 0c3: ldc2_w 0.5
      // 0c6: dcmpg
      // 0c7: goto 0d4
      // 0ca: ldc2_w -3334825771638819410
      // 0cd: lload 2
      // 0ce: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: ifge 0f8
      // 0d7: new java/awt/Cursor
      // 0da: dup
      // 0db: sipush 32013
      // 0de: ldc2_w 3954136472956026720
      // 0e1: lload 2
      // 0e2: lxor
      // 0e3: invokedynamic i (IJ)I bsm=com/zelix/wa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: invokespecial java/awt/Cursor.<init> (I)V
      // 0eb: astore 5
      // 0ed: lload 2
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 11a
      // 0f3: aload 4
      // 0f5: ifnonnull 10e
      // 0f8: new java/awt/Cursor
      // 0fb: dup
      // 0fc: sipush 3144
      // 0ff: ldc2_w 904993462219165222
      // 102: lload 2
      // 103: lxor
      // 104: invokedynamic i (IJ)I bsm=com/zelix/wa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: invokespecial java/awt/Cursor.<init> (I)V
      // 10c: astore 5
      // 10e: aload 0
      // 10f: aload 5
      // 111: ldc2_w -3570608873380761373
      // 114: lload 2
      // 115: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: return
   }

   wa(so var1, long var2) {
      var2 = a ^ var2;
      super();
      x44.a<"q">(this, false, 4458569328912622384L, var2);
      x44.a<"q">(this, var1, 2648211079399418789L, var2);
      x44.a<"j">(this, x44.a<"j">(x44.a<"k">(2794835084655272101L, var2), 2741049636236812445L, var2), 2388581835789477359L, var2);
      x44.a<"j">(this, new us(this), 2567068192282787567L, var2);
      x44.a<"j">(this, new _yg(this), 2563970304453288771L, var2);
   }

   static {
      long var0 = a ^ 63648944846812L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "Î<ï¿Ã¿ö:`Ý¤\u0017%âËc";
      int var7 = "Î<ï¿Ã¿ö:`Ý¤\u0017%âËc".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
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
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     c = var8;
                     d = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ËýPì\u007f\u0010Â7âg¥!²\u0011g¼";
                  var7 = "ËýPì\u007f\u0010Â7âg¥!²\u0011g¼".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6408;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/wa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
         throw new RuntimeException("com/zelix/wa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
