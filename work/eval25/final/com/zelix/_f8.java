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

public abstract class _f8 {
   final String T;
   final String x;
   private static final long a = ess.a(5504922914609996474L, 7235781238585723203L, MethodHandles.lookup().lookupClass()).a(178101674676056L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public abstract String k(Object[] var1);

   public _f8(_f8 var1, long var2) {
      var2 = a ^ var2;
      super();
      this.x = var1.v();
      this.T = x44.a<"j">(var1, new Object[0], 533942163072236683L, var2);
   }

   public final String v() {
      return this.x;
   }

   public _f8(String var1, String var2) {
      this.x = var1.intern();
      this.T = _fz.d(var2).intern();
   }

   public boolean U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.x.equals(a<"l">(2482, 3345264903193987801L ^ var2));
   }

   public boolean v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.x.equals(a<"l">(19060, 6661066354217858838L ^ var2));
   }

   public final String X(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 86212167100520L;
      return this.x + x44.a<"j">(this, var5, var4, 3068023986467165943L, var2);
   }

   public final String M(Object[] var1) {
      return this.T;
   }

   public final String m(long var1, Map var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 114019984684502L;
      return _fz.T(var4, this.T, var3);
   }

   public final String P(Object[] param1) {
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
      // 00c: getstatic com/zelix/_f8.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 113365890770026
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w -1684777730620558202
      // 01e: lload 2
      // 01f: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: aload 0
      // 025: getfield com/zelix/_f8.T Ljava/lang/String;
      // 028: lload 4
      // 02a: dup2_x1
      // 02b: pop2
      // 02c: bipush 2
      // 02d: anewarray 132
      // 030: dup_x1
      // 031: swap
      // 032: bipush 1
      // 033: swap
      // 034: aastore
      // 035: dup_x2
      // 036: dup_x2
      // 037: pop
      // 038: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03b: bipush 0
      // 03c: swap
      // 03d: aastore
      // 03e: ldc2_w -967984357649413619
      // 041: lload 2
      // 042: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: astore 7
      // 049: new java/lang/StringBuilder
      // 04c: dup
      // 04d: invokespecial java/lang/StringBuilder.<init> ()V
      // 050: astore 8
      // 052: aload 7
      // 054: invokeinterface java/util/List.size ()I 1
      // 059: istore 9
      // 05b: astore 6
      // 05d: bipush 0
      // 05e: istore 10
      // 060: iload 10
      // 062: iload 9
      // 064: if_icmpge 0da
      // 067: lload 2
      // 068: lconst_0
      // 069: lcmp
      // 06a: iflt 084
      // 06d: aload 8
      // 06f: aload 7
      // 071: iload 10
      // 073: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 078: checkcast java/lang/String
      // 07b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07e: aload 6
      // 080: ifnonnull 100
      // 083: pop
      // 084: aload 6
      // 086: lload 2
      // 087: lconst_0
      // 088: lcmp
      // 089: iflt 0d7
      // 08c: ifnonnull 0d5
      // 08f: goto 09c
      // 092: ldc2_w -1352517568655205591
      // 095: lload 2
      // 096: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: iload 10
      // 09e: iload 9
      // 0a0: bipush 1
      // 0a1: isub
      // 0a2: if_icmpge 0d2
      // 0a5: goto 0b2
      // 0a8: ldc2_w -1352517568655205591
      // 0ab: lload 2
      // 0ac: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 8
      // 0b4: sipush 647
      // 0b7: ldc2_w 8448036338266523693
      // 0ba: lload 2
      // 0bb: lxor
      // 0bc: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_f8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: pop
      // 0c5: goto 0d2
      // 0c8: ldc2_w -1352517568655205591
      // 0cb: lload 2
      // 0cc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: iinc 10 1
      // 0d5: aload 6
      // 0d7: ifnull 060
      // 0da: new java/lang/StringBuilder
      // 0dd: dup
      // 0de: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e1: aload 0
      // 0e2: getfield com/zelix/_f8.x Ljava/lang/String;
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: ldc "("
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: aload 8
      // 0ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: ldc ")"
      // 0f7: lload 2
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: ifle 07b
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 103: areturn
   }

   static {
      long var0 = a ^ 4638666914057L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "u\u000e:¥?êfzÔùÿ\u009ar\u0019&µ½\u0011¾°ÏìË\u008f\u0010c!:Õ\u007f\b\u001a×\u0081\u0002âb¹|\f¨\u0010Q]&\u0083$ê\u00901\u0081h\u008fÅ\u008fÅ!¾";
      int var8 = "u\u000e:¥?êfzÔùÿ\u009ar\u0019&µ½\u0011¾°ÏìË\u008f\u0010c!:Õ\u007f\b\u001a×\u0081\u0002âb¹|\f¨\u0010Q]&\u0083$ê\u00901\u0081h\u008fÅ\u008fÅ!¾"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11074;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_f8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/_f8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
