package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zl extends jf implements _f6 {
   private String Q;
   private String H;
   private ArrayList y;
   private final String F;
   private static final long a = ess.a(8453145418452754487L, -7300051789285293005L, MethodHandles.lookup().lookupClass()).a(151443025663391L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public String o(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"k">(this, 8325255185725963464L, var2);
   }

   public void t(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/_za
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ur
      // 019: astore 3
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 134528422017690
      // 021: lxor
      // 022: lstore 6
      // 024: pop2
      // 025: ldc2_w 9148277501292601163
      // 028: lload 4
      // 02a: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: aload 0
      // 030: lload 6
      // 032: bipush 1
      // 033: anewarray 31
      // 036: dup_x2
      // 037: dup_x2
      // 038: pop
      // 039: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03c: bipush 0
      // 03d: swap
      // 03e: aastore
      // 03f: ldc2_w 7145691849331111744
      // 042: lload 4
      // 044: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: istore 9
      // 04b: astore 8
      // 04d: new java/lang/StringBuilder
      // 050: dup
      // 051: invokespecial java/lang/StringBuilder.<init> ()V
      // 054: astore 10
      // 056: new java/lang/StringBuilder
      // 059: dup
      // 05a: invokespecial java/lang/StringBuilder.<init> ()V
      // 05d: astore 11
      // 05f: bipush 0
      // 060: istore 12
      // 062: iload 12
      // 064: iload 9
      // 066: if_icmpge 106
      // 069: aload 0
      // 06a: iload 12
      // 06c: invokevirtual com/zelix/zl.e (I)Lcom/zelix/_za;
      // 06f: checkcast com/zelix/zw
      // 072: bipush 0
      // 073: anewarray 31
      // 076: ldc2_w 7328816409459435145
      // 079: lload 4
      // 07b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: astore 13
      // 082: aload 0
      // 083: ldc2_w 8829408382980465869
      // 086: lload 4
      // 088: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: aload 13
      // 08f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 092: pop
      // 093: aload 10
      // 095: aload 13
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: pop
      // 09b: aload 10
      // 09d: ldc "."
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: pop
      // 0a3: aload 11
      // 0a5: aload 13
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: pop
      // 0ab: aload 8
      // 0ad: lload 4
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: ifle 0b9
      // 0b4: ifnonnull 126
      // 0b7: aload 8
      // 0b9: lload 4
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: ifle 103
      // 0c0: ifnonnull 101
      // 0c3: goto 0d1
      // 0c6: ldc2_w 7208609838280698814
      // 0c9: lload 4
      // 0cb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: iload 12
      // 0d3: iload 9
      // 0d5: bipush 1
      // 0d6: isub
      // 0d7: if_icmpge 0fe
      // 0da: goto 0e8
      // 0dd: ldc2_w 7208609838280698814
      // 0e0: lload 4
      // 0e2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 11
      // 0ea: ldc "/"
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: pop
      // 0f0: goto 0fe
      // 0f3: ldc2_w 7208609838280698814
      // 0f6: lload 4
      // 0f8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: iinc 12 1
      // 101: aload 8
      // 103: ifnull 062
      // 106: aload 0
      // 107: aload 10
      // 109: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10c: ldc2_w 8806575871318078838
      // 10f: lload 4
      // 111: invokedynamic r (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: aload 0
      // 117: aload 11
      // 119: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11c: putfield com/zelix/zl.Q Ljava/lang/String;
      // 11f: lload 4
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 126
      // 126: return
   }

   List Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 9904735917605L;
      return x44.a<"u">(new Object[]{var4, x44.a<"i">(this, 8911608260325811689L, var2)}, 7387130452255857281L, var2);
   }

   public boolean R(long param1, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 62135247076743
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 10908409034562
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w 1379340358887420570
      // 13: lload 1
      // 14: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: lload 6
      // 1b: aload 3
      // 1c: aload 0
      // 1d: getfield com/zelix/zl.Q Ljava/lang/String;
      // 20: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // 23: istore 9
      // 25: astore 8
      // 27: iload 9
      // 29: aload 8
      // 2b: ifnonnull b4
      // 2e: ifne b2
      // 31: goto 3e
      // 34: ldc2_w 710287952348776047
      // 37: lload 1
      // 38: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w 1402080708623297000
      // 42: lload 1
      // 43: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_za; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: checkcast com/zelix/fz
      // 4b: lload 4
      // 4d: bipush 1
      // 4e: anewarray 31
      // 51: dup_x2
      // 52: dup_x2
      // 53: pop
      // 54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: ldc2_w 1284109491289389023
      // 5d: lload 1
      // 5e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: aload 8
      // 65: ifnonnull b4
      // 68: goto 75
      // 6b: ldc2_w 710287952348776047
      // 6e: lload 1
      // 6f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: ifeq b2
      // 78: goto 85
      // 7b: ldc2_w 710287952348776047
      // 7e: lload 1
      // 7f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: new java/lang/StringBuilder
      // 88: dup
      // 89: invokespecial java/lang/StringBuilder.<init> ()V
      // 8c: aload 0
      // 8d: getfield com/zelix/zl.Q Ljava/lang/String;
      // 90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93: sipush 12238
      // 96: ldc2_w 2460715582535157859
      // 99: lload 1
      // 9a: lxor
      // 9b: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/zl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a6: astore 10
      // a8: lload 6
      // aa: aload 3
      // ab: aload 10
      // ad: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // b0: istore 9
      // b2: iload 9
      // b4: ireturn
   }

   public zl(int var1, short var2, char var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 27703432123266L;
      super(var7, var1);
      x44.a<"v">(this, new ArrayList(), -3004900250696775671L, var5);
      this.F = a<"o">(10937, 8627187038524115968L ^ var5);
   }

   boolean A(Object[] param1) {
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
      // 0c: getstatic com/zelix/zl.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8091987930644828659
      // 15: lload 2
      // 16: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w -8398808496436132816
      // 21: lload 2
      // 22: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: ldc "*"
      // 29: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2c: aload 4
      // 2e: ifnonnull 50
      // 31: bipush -1
      // 32: if_icmpne 53
      // 35: goto 42
      // 38: ldc2_w -7688649211951211784
      // 3b: lload 2
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 1
      // 43: goto 50
      // 46: ldc2_w -7688649211951211784
      // 49: lload 2
      // 4a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   static {
      long var0 = a ^ 16714197768127L;
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
      String var6 = "\u00adÐûÊD3Ù\u000eÈ{\u0088\"\u001fa9§\u0010üÑû\u0012\u000b\u0094&<S\u001fqÙ; Æ\u001c";
      int var8 = "\u00adÐûÊD3Ù\u000eÈ{\u0088\"\u001fa9§\u0010üÑû\u0012\u000b\u0094&<S\u001fqÙ; Æ\u001c".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32086;
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
            throw new RuntimeException("com/zelix/zl", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/zl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
