package com.zelix;

import java.io.BufferedReader;
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

public class _x2 {
   private static final long a = ess.a(-4651416534785861988L, -5054327945095959751L, MethodHandles.lookup().lookupClass()).a(89881289377741L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public _x2(BufferedReader param1, String param2, Map param3, char param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 4
      // 002: i2l
      // 003: bipush 48
      // 005: lshl
      // 006: lload 5
      // 008: bipush 16
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: getstatic com/zelix/_x2.a J
      // 012: lxor
      // 013: lstore 7
      // 015: lload 7
      // 017: dup2
      // 018: ldc2_w 68687781632593
      // 01b: lxor
      // 01c: lstore 9
      // 01e: pop2
      // 01f: ldc2_w 4901099540820449273
      // 022: lload 7
      // 024: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: aload 0
      // 02a: invokespecial java/lang/Object.<init> ()V
      // 02d: astore 11
      // 02f: aload 1
      // 030: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 033: dup
      // 034: astore 12
      // 036: ifnull 116
      // 039: aload 12
      // 03b: getstatic com/zelix/_x2.e J
      // 03e: l2i
      // 03f: invokevirtual java/lang/String.indexOf (I)I
      // 042: istore 13
      // 044: iload 13
      // 046: bipush -1
      // 047: if_icmple 054
      // 04a: aload 12
      // 04c: bipush 0
      // 04d: iload 13
      // 04f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 052: astore 12
      // 054: new java/util/StringTokenizer
      // 057: dup
      // 058: aload 12
      // 05a: sipush 17910
      // 05d: ldc2_w 3111723061937772167
      // 060: lload 7
      // 062: lxor
      // 063: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_x2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 06b: astore 14
      // 06d: aload 14
      // 06f: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 072: ifeq 111
      // 075: aload 14
      // 077: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 07a: bipush 1
      // 07b: anewarray 177
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 0
      // 081: swap
      // 082: aastore
      // 083: ldc2_w 4926327114099655189
      // 086: lload 7
      // 088: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: astore 15
      // 08f: lload 9
      // 091: aload 15
      // 093: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 096: astore 16
      // 098: aload 11
      // 09a: ifnonnull 02f
      // 09d: aload 16
      // 09f: lload 5
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 096
      // 0a6: aload 11
      // 0a8: ifnonnull 0f6
      // 0ab: ifnull 0f7
      // 0ae: goto 0bc
      // 0b1: ldc2_w 6570056972794807502
      // 0b4: lload 7
      // 0b6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 3
      // 0bd: aload 16
      // 0bf: new java/lang/StringBuilder
      // 0c2: dup
      // 0c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c6: sipush 25419
      // 0c9: ldc2_w 3264418786255777851
      // 0cc: lload 7
      // 0ce: lxor
      // 0cf: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_x2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d7: aload 2
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: ldc "'"
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e8: goto 0f6
      // 0eb: ldc2_w 6570056972794807502
      // 0ee: lload 7
      // 0f0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: pop
      // 0f7: aload 11
      // 0f9: ifnull 06d
      // 0fc: bipush 3
      // 0fd: anewarray 4
      // 100: ldc2_w 4803785077791417884
      // 103: lload 7
      // 105: lload 5
      // 107: lconst_0
      // 108: lcmp
      // 109: iflt 088
      // 10c: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: aload 11
      // 113: ifnull 02f
      // 116: lload 5
      // 118: lconst_0
      // 119: lcmp
      // 11a: iflt 039
      // 11d: return
   }

   static {
      long var5 = a ^ 9917252048439L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "\u001bàÂ_T\u0011SÈ\u008b-ìÃ\u009b\u008bXð\u00183\u0004\u0088e¶\u0087²;\u0083Z3H\u0003[c.»¶ó\u00968Z\fø";
      int var13 = "\u001bàÂ_T\u0011SÈ\u008b-ìÃ\u009b\u008bXð\u00183\u0004\u0088e¶\u0087²;\u0083Z3H\u0003[c.»¶ó\u00968Z\fø".length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -6719574331324801357L;
            byte[] var4 = var0.doFinal(
               new byte[]{
                  (byte)((int)(var2 >>> 56)),
                  (byte)((int)(var2 >>> 48)),
                  (byte)((int)(var2 >>> 40)),
                  (byte)((int)(var2 >>> 32)),
                  (byte)((int)(var2 >>> 24)),
                  (byte)((int)(var2 >>> 16)),
                  (byte)((int)(var2 >>> 8)),
                  (byte)((int)var2)
               }
            );
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            e = var23;
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6828;
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
            throw new RuntimeException("com/zelix/_x2", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/_x2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
