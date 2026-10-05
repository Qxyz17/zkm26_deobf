package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mv implements Comparable {
   private String B;
   private String e;
   private String[] r;
   private static final long a = ess.a(71416944010195307L, 6153659960526573398L, MethodHandles.lookup().lookupClass()).a(100208796901008L);
   private static final String b;

   String[] B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 7279369935125265152L, var2);
   }

   private String v(Object[] param1) {
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
      // 00c: getstatic com/zelix/mv.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w -7498409069482676367
      // 015: lload 2
      // 016: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: astore 4
      // 01d: aload 0
      // 01e: ldc2_w -8507023363801543635
      // 021: lload 2
      // 022: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 4
      // 029: ifnull 159
      // 02c: ifnonnull 14f
      // 02f: goto 03c
      // 032: ldc2_w -7675844551743901800
      // 035: lload 2
      // 036: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: athrow
      // 03c: new java/lang/StringBuffer
      // 03f: dup
      // 040: invokespecial java/lang/StringBuffer.<init> ()V
      // 043: astore 5
      // 045: lload 2
      // 046: lconst_0
      // 047: lcmp
      // 048: iflt 072
      // 04b: aload 5
      // 04d: new java/lang/StringBuilder
      // 050: dup
      // 051: invokespecial java/lang/StringBuilder.<init> ()V
      // 054: aload 0
      // 055: ldc2_w -8291744897631866326
      // 058: lload 2
      // 059: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 061: ldc "("
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 069: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 06c: aload 4
      // 06e: ifnull 137
      // 071: pop
      // 072: aload 0
      // 073: ldc2_w -8067211767477940722
      // 076: lload 2
      // 077: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: ifnull 122
      // 07f: goto 08c
      // 082: ldc2_w -7675844551743901800
      // 085: lload 2
      // 086: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: bipush 0
      // 08d: istore 6
      // 08f: iload 6
      // 091: aload 0
      // 092: ldc2_w -8067211767477940722
      // 095: lload 2
      // 096: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: arraylength
      // 09c: if_icmpge 111
      // 09f: aload 5
      // 0a1: aload 0
      // 0a2: ldc2_w -8067211767477940722
      // 0a5: lload 2
      // 0a6: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: iload 6
      // 0ad: aaload
      // 0ae: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0b1: pop
      // 0b2: aload 4
      // 0b4: lload 2
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: iflt 0bf
      // 0ba: ifnull 140
      // 0bd: aload 4
      // 0bf: lload 2
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: iflt 10e
      // 0c5: ifnull 10c
      // 0c8: goto 0d5
      // 0cb: ldc2_w -7675844551743901800
      // 0ce: lload 2
      // 0cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: iload 6
      // 0d7: aload 0
      // 0d8: ldc2_w -8067211767477940722
      // 0db: lload 2
      // 0dc: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: arraylength
      // 0e2: bipush 1
      // 0e3: isub
      // 0e4: if_icmpge 109
      // 0e7: goto 0f4
      // 0ea: ldc2_w -7675844551743901800
      // 0ed: lload 2
      // 0ee: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: aload 5
      // 0f6: ldc ","
      // 0f8: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0fb: pop
      // 0fc: goto 109
      // 0ff: ldc2_w -7675844551743901800
      // 102: lload 2
      // 103: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: iinc 6 1
      // 10c: aload 4
      // 10e: ifnonnull 08f
      // 111: lload 2
      // 112: lconst_0
      // 113: lcmp
      // 114: ifle 140
      // 117: aload 4
      // 119: lload 2
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: iflt 0b4
      // 11f: ifnonnull 138
      // 122: aload 5
      // 124: getstatic com/zelix/mv.b Ljava/lang/String;
      // 127: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 12a: goto 137
      // 12d: ldc2_w -7675844551743901800
      // 130: lload 2
      // 131: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: pop
      // 138: aload 5
      // 13a: ldc ")"
      // 13c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 13f: pop
      // 140: aload 0
      // 141: aload 5
      // 143: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 146: ldc2_w -8507023363801543635
      // 149: lload 2
      // 14a: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: aload 0
      // 150: ldc2_w -8507023363801543635
      // 153: lload 2
      // 154: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: areturn
   }

   public int L(Object[] var1) {
      long var2 = (Long)var1[0];
      mv var4 = (mv)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 102260896851311L;
      return x44.a<"m">(this, new Object[]{var5}, -2384088835952023812L, var2).compareTo(x44.a<"m">(var4, new Object[]{var5}, -2384088835952023812L, var2));
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 30975334190425L;
      long var4 = var2 ^ 72838743415913L;
      return x44.a<"k">(this, new Object[]{var4, (mv)var1}, -5844694311384818279L, var2);
   }

   String R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 3923067313446324406L, var2);
   }

   mv(long var1, String var3, String[] var4) {
      var1 = a ^ var1;
      super();
      x44.a<"r">(this, var3, 1103856287535280534L, var1);
      x44.a<"r">(this, var4, 1420853935014530482L, var1);
   }

   static {
      long var0 = a ^ 11372303154272L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¢K¶ì\u0089-Ð\u001b".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
}
