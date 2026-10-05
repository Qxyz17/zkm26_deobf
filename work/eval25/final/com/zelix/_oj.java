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

public class _oj extends _ow {
   private int y;
   private static final long b = ess.a(3141787455037137761L, 2215065230450117431L, MethodHandles.lookup().lookupClass()).a(223398736482406L);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map p = new HashMap(13);

   public void k(Object[] param1) {
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
      // 004: checkcast java/io/PrintWriter
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/StringBuilder
      // 018: astore 5
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 32198005677074
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 43317403178689
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 72462291038852
      // 02e: lxor
      // 02f: lstore 10
      // 031: dup2
      // 032: ldc2_w 128528899487657
      // 035: lxor
      // 036: lstore 12
      // 038: pop2
      // 039: ldc2_w 8216154267410362304
      // 03c: lload 3
      // 03d: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: new java/lang/StringBuilder
      // 045: dup
      // 046: sipush 14231
      // 049: ldc2_w 6188719138509033294
      // 04c: lload 3
      // 04d: lxor
      // 04e: invokedynamic n (IJ)I bsm=com/zelix/_oj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: invokespecial java/lang/StringBuilder.<init> (I)V
      // 056: astore 15
      // 058: aload 0
      // 059: lload 6
      // 05b: bipush 1
      // 05c: anewarray 359
      // 05f: dup_x2
      // 060: dup_x2
      // 061: pop
      // 062: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 065: bipush 0
      // 066: swap
      // 067: aastore
      // 068: ldc2_w 8353405308985101719
      // 06b: lload 3
      // 06c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: astore 16
      // 073: astore 14
      // 075: aload 15
      // 077: new java/lang/StringBuilder
      // 07a: dup
      // 07b: invokespecial java/lang/StringBuilder.<init> ()V
      // 07e: aload 16
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: ldc " "
      // 085: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 088: aload 0
      // 089: getfield com/zelix/_oj.o Lcom/zelix/xl;
      // 08c: invokevirtual com/zelix/xl.B ()I
      // 08f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 092: ldc " "
      // 094: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 097: aload 0
      // 098: ldc2_w 8162154222757056612
      // 09b: lload 3
      // 09c: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a4: ldc " "
      // 0a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a9: bipush 0
      // 0aa: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b3: pop
      // 0b4: aload 0
      // 0b5: getfield com/zelix/_oj.a I
      // 0b8: lload 10
      // 0ba: dup2_x1
      // 0bb: pop2
      // 0bc: bipush 2
      // 0bd: anewarray 359
      // 0c0: dup_x1
      // 0c1: swap
      // 0c2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c5: bipush 1
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x2
      // 0c9: dup_x2
      // 0ca: pop
      // 0cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ce: bipush 0
      // 0cf: swap
      // 0d0: aastore
      // 0d1: ldc2_w 8570484206580877217
      // 0d4: lload 3
      // 0d5: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: astore 17
      // 0dc: aload 17
      // 0de: aload 0
      // 0df: getfield com/zelix/_oj.o Lcom/zelix/xl;
      // 0e2: lload 12
      // 0e4: ldc2_w 8448228292890142953
      // 0e7: lload 3
      // 0e8: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: lload 8
      // 0ef: dup2_x1
      // 0f0: pop2
      // 0f1: bipush 3
      // 0f2: anewarray 359
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: bipush 2
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x2
      // 0fb: dup_x2
      // 0fc: pop
      // 0fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 100: bipush 1
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w 7799761149368071863
      // 10b: lload 3
      // 10c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: astore 17
      // 113: aload 17
      // 115: aload 0
      // 116: ldc2_w 8162154222757056612
      // 119: lload 3
      // 11a: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: ldc2_w 8463256255195338727
      // 122: lload 3
      // 123: invokedynamic t (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: lload 8
      // 12a: dup2_x1
      // 12b: pop2
      // 12c: bipush 3
      // 12d: anewarray 359
      // 130: dup_x1
      // 131: swap
      // 132: bipush 2
      // 133: swap
      // 134: aastore
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 1
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: ldc2_w 7799761149368071863
      // 146: lload 3
      // 147: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: astore 17
      // 14e: aload 14
      // 150: ifnonnull 1b2
      // 153: aload 17
      // 155: invokevirtual java/lang/String.length ()I
      // 158: ifle 18f
      // 15b: goto 168
      // 15e: ldc2_w 7665099202643194111
      // 161: lload 3
      // 162: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 15
      // 16a: new java/lang/StringBuilder
      // 16d: dup
      // 16e: invokespecial java/lang/StringBuilder.<init> ()V
      // 171: ldc "\t"
      // 173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 176: aload 17
      // 178: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 181: pop
      // 182: goto 18f
      // 185: ldc2_w 7665099202643194111
      // 188: lload 3
      // 189: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: aload 2
      // 190: new java/lang/StringBuilder
      // 193: dup
      // 194: invokespecial java/lang/StringBuilder.<init> ()V
      // 197: aload 5
      // 199: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19f: aload 5
      // 1a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: aload 15
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1af: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1b2: return
   }

   public int d(long var1) {
      return 5;
   }

   public void K(long var1, DataOutputStream var3, Map var4) {
      long var5 = var1 ^ 0L;
      super.K(var5, var3, var4);
      var3.writeByte(x44.a<"n">(this, -2599745266779145526L, var1));
      var3.writeByte(0);
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      long var6 = var2 ^ 45294604634303L;
      StringBuilder var8 = new StringBuilder();
      var8.append(x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2));
      var8.append((char)c<"n">(28277, 2202241631791851961L ^ var2));
      var8.append(x44.a<"j">(this.o, var6, 731974627431766015L, var2));
      return var8.toString();
   }

   public _oj(long var1, mz var3) {
      var1 = b ^ var1;
      long var4 = var1 ^ 133002452707679L;
      super(c<"n">(924, 7170981400507046406L ^ var1), var3);
      x44.a<"u">(this, x44.a<"n">(var3, new Object[]{var4}, 720651201879930067L, var1) + 1, 1155068299687555366L, var1);
   }

   public void s(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = b ^ var3;
      x44.a<"r">(this, var2, -1652673823641958351L, var3);
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      super.W(var6, var2, var7);
      var2.writeByte(x44.a<"l">(this, 3238616289771965904L, var4));
      var2.writeByte(0);
   }

   _oj(_xx var1, long var2, va var4, _y4 var5, _y4 var6, _y4 var7, _y4 var8, _y4 var9) {
      var2 = b ^ var2;
      long var10 = var2 ^ 115567976145327L;
      super(c<"n">(7022, 6818007089902613294L ^ var2), var1, var4, var5, var6, var7, var8, var9, var10);
      x44.a<"t">(this, var1.read(), -6782777500455059201L, var2);
      x44.a<"o">(var1, 1L, -6848652435993371972L, var2);
   }

   static {
      long var0 = b ^ 6766871814484L;
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
      String var6 = "\u0004ðTÇÐ\u008079\u0007jU\u0085õÃ½i";
      int var7 = "\u0004ðTÇÐ\u008079\u0007jU\u0085õÃ½i".length();
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
                     m = var8;
                     n = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ùmXñåNY5¢¦\u0088 ù\u0017¬6";
                  var7 = "ùmXñåNY5¢¦\u0088 ù\u0017¬6".length();
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

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18382;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_oj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_oj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
