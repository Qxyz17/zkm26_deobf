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

public class tr {
   final ZKMChangeLog m;
   String j;
   String M;
   String[] l;
   private static final long a = ess.a(-853369134318714980L, -5893753941521813161L, MethodHandles.lookup().lookupClass()).a(256335278889254L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   tr(ZKMChangeLog var1, String var2, long var3, String var5, String[] var6) {
      var3 = a ^ var3;
      this.m = var1;
      super();
      x44.a<"w">(this, var2, -6201545183580746420L, var3);
      x44.a<"w">(this, var5, -5576807495311867517L, var3);
      x44.a<"w">(this, var6, -5291091793204512839L, var3);
   }

   String f(Object[] param1) {
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
      // 00c: getstatic com/zelix/tr.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: new java/lang/StringBuilder
      // 015: dup
      // 016: invokespecial java/lang/StringBuilder.<init> ()V
      // 019: astore 5
      // 01b: ldc2_w -1119389629101831429
      // 01e: lload 2
      // 01f: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: aload 5
      // 026: aload 0
      // 027: ldc2_w -1534646427877519856
      // 02a: lload 2
      // 02b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 033: pop
      // 034: astore 4
      // 036: aload 5
      // 038: sipush 27280
      // 03b: ldc2_w 8160027467044426410
      // 03e: lload 2
      // 03f: lxor
      // 040: invokedynamic z (IJ)I bsm=com/zelix/tr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 048: pop
      // 049: aload 5
      // 04b: aload 0
      // 04c: ldc2_w -1024767280479206689
      // 04f: lload 2
      // 050: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 058: pop
      // 059: aload 5
      // 05b: sipush 7581
      // 05e: ldc2_w 2650763796331226534
      // 061: lload 2
      // 062: lxor
      // 063: invokedynamic z (IJ)I bsm=com/zelix/tr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 06b: pop
      // 06c: bipush 0
      // 06d: istore 6
      // 06f: iload 6
      // 071: aload 0
      // 072: ldc2_w -734582915347499803
      // 075: lload 2
      // 076: invokedynamic l (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: arraylength
      // 07c: if_icmpge 0f1
      // 07f: aload 5
      // 081: aload 0
      // 082: ldc2_w -734582915347499803
      // 085: lload 2
      // 086: invokedynamic l (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: iload 6
      // 08d: aaload
      // 08e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 091: lload 2
      // 092: lconst_0
      // 093: lcmp
      // 094: iflt 10c
      // 097: pop
      // 098: aload 4
      // 09a: ifnonnull 10a
      // 09d: aload 4
      // 09f: lload 2
      // 0a0: lconst_0
      // 0a1: lcmp
      // 0a2: ifle 0ee
      // 0a5: ifnonnull 0ec
      // 0a8: goto 0b5
      // 0ab: ldc2_w -1592202120069016899
      // 0ae: lload 2
      // 0af: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: iload 6
      // 0b7: aload 0
      // 0b8: ldc2_w -734582915347499803
      // 0bb: lload 2
      // 0bc: invokedynamic l (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: arraylength
      // 0c2: bipush 1
      // 0c3: isub
      // 0c4: if_icmpge 0e9
      // 0c7: goto 0d4
      // 0ca: ldc2_w -1592202120069016899
      // 0cd: lload 2
      // 0ce: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 5
      // 0d6: ldc ","
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: pop
      // 0dc: goto 0e9
      // 0df: ldc2_w -1592202120069016899
      // 0e2: lload 2
      // 0e3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: iinc 6 1
      // 0ec: aload 4
      // 0ee: ifnull 06f
      // 0f1: aload 5
      // 0f3: sipush 3826
      // 0f6: ldc2_w 1777632118384785099
      // 0f9: lload 2
      // 0fa: lxor
      // 0fb: invokedynamic z (IJ)I bsm=com/zelix/tr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 103: pop
      // 104: lload 2
      // 105: lconst_0
      // 106: lcmp
      // 107: ifle 098
      // 10a: aload 5
      // 10c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10f: areturn
   }

   static {
      long var0 = a ^ 68861665222745L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "6CÌaðW\u0088«â\u0019~^àà¨\u0005;|\u0082Üh\u0084åi";
      int var7 = "6CÌaðW\u0088«â\u0019~^àà¨\u0005;|\u0082Üh\u0084åi".length();
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
      c = new Integer[3];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7200;
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
            throw new RuntimeException("com/zelix/tr", var14);
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
         throw new RuntimeException("com/zelix/tr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
