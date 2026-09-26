package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lkl {
   private s B;
   private static ResourceBundle F;
   private _s V;
   private String l;
   private static wt A;
   private static final lkl f;
   private static final long a = prr.a(-8894092849990376368L, 7053989877339876977L, MethodHandles.lookup().lookupClass()).a(25340653030639L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   public static void v(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      m44.a<"k">(null, -1098366008068704274L, var1);
   }

   public static URL n(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 119116625734696L;
      return m44.a<"j">(new Object[]{var1, null, var4}, -7213620924763403736L, var2);
   }

   public static boolean V(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;

      try {
         if (m44.a<"h">(6362915754882621282L, var1) != null) {
            return true;
         }
      } catch (n9 var3) {
         throw m44.a<"l">(var3, 6739867257739513517L, var1);
      }

      return false;
   }

   public _s J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"t">(this, 1329292576714461583L, var2);
   }

   static {
      long var20 = a ^ 35694455552185L;
      long var22 = var20 ^ 138733932470963L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[2];
      int var16 = 0;
      String var15 = "ÄöxS\u009e{\rþ#±ã¸ò¾æj\u0010\nç\"o-síþ\u0092~Üý\\k<~";
      int var17 = "ÄöxS\u009e{\rþ#±ã¸ò¾æj\u0010\nç\"o-síþ\u0092~Üý\\k<~".length();
      char var14 = 16;
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var32 = a(var19).intern();
         int var10001 = -1;
         var18[var16++] = var32;
         if ((var13 += var14) >= var17) {
            b = var18;
            c = new String[2];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[6];
            int var3 = 0;
            String var4 = "º\u0098ÜM\u0018¢¥±È¨\u008aY\u0088¥\u0004³j\u001cCqW¦â\u0093ð\u0097±Å÷6\u0084J";
            int var5 = "º\u0098ÜM\u0018¢¥±È¨\u008aY\u0088¥\u0004³j\u001cCqW¦â\u0093ð\u0097±Å÷6\u0084J".length();
            byte var2 = 0;

            label32:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var27 = var6;
               var10001 = var3++;
               long var35 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var38 = -1;

               while (true) {
                  long var8 = var35;
                  byte[] var10 = var0.doFinal(
                     new byte[]{
                        (byte)((int)(var8 >>> 56)),
                        (byte)((int)(var8 >>> 48)),
                        (byte)((int)(var8 >>> 40)),
                        (byte)((int)(var8 >>> 32)),
                        (byte)((int)(var8 >>> 24)),
                        (byte)((int)(var8 >>> 16)),
                        (byte)((int)(var8 >>> 8)),
                        (byte)((int)var8)
                     }
                  );
                  long var40 = ((long)var10[0] & 255L) << 56
                     | ((long)var10[1] & 255L) << 48
                     | ((long)var10[2] & 255L) << 40
                     | ((long)var10[3] & 255L) << 32
                     | ((long)var10[4] & 255L) << 24
                     | ((long)var10[5] & 255L) << 16
                     | ((long)var10[6] & 255L) << 8
                     | (long)var10[7] & 255L;
                  switch (var38) {
                     case 0:
                        var27[var10001] = var40;
                        if (var2 >= var5) {
                           e = var6;
                           g = new Integer[6];
                           f = new lkl(var22);
                           return;
                        }
                        break;
                     default:
                        var27[var10001] = var40;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "K*\u0098;È\u009b2\u0085\u00026\"øN7ui";
                        var5 = "K*\u0098;È\u009b2\u0085\u00026\"øN7ui".length();
                        var2 = 0;
                  }

                  byte var31 = var2;
                  var2 += 8;
                  var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                  var27 = var6;
                  var10001 = var3++;
                  var35 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var38 = 0;
               }
            }
         }

         var14 = var15.charAt(var13);
      }
   }

   public static void c(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 6476267886298L;
      m44.a<"k">(new Object[]{var4, var3, null}, -5397405293919163607L, var1);
   }

   public s r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"t">(this, -965712749455150847L, var2);
   }

   public static URL D(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 1
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: pop
      // 01a: getstatic com/zelix/lkl.a J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: new java/lang/StringBuffer
      // 023: dup
      // 024: invokespecial java/lang/StringBuffer.<init> ()V
      // 027: astore 6
      // 029: ldc2_w -5851200461430496254
      // 02c: lload 3
      // 02d: invokedynamic k (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: aload 6
      // 034: ldc2_w -5713532559742383014
      // 037: lload 3
      // 038: invokedynamic o (JJ)Lcom/zelix/lkl; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: ldc2_w -6187804188162082521
      // 040: lload 3
      // 041: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 049: pop
      // 04a: astore 5
      // 04c: aload 2
      // 04d: aload 5
      // 04f: ifnull 0bc
      // 052: ifnull 0bb
      // 055: goto 062
      // 058: ldc2_w -5435890538945812566
      // 05b: lload 3
      // 05c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 2
      // 063: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 066: aload 5
      // 068: lload 3
      // 069: lconst_0
      // 06a: lcmp
      // 06b: ifle 0c4
      // 06e: ifnull 0bc
      // 071: goto 07e
      // 074: ldc2_w -5435890538945812566
      // 077: lload 3
      // 078: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: invokevirtual java/lang/String.length ()I
      // 081: ifle 0bb
      // 084: goto 091
      // 087: ldc2_w -5435890538945812566
      // 08a: lload 3
      // 08b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: aload 6
      // 093: aload 2
      // 094: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 097: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 09a: pop
      // 09b: aload 6
      // 09d: sipush 9377
      // 0a0: ldc2_w 8491271261085508959
      // 0a3: lload 3
      // 0a4: lxor
      // 0a5: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/lkl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0ad: pop
      // 0ae: goto 0bb
      // 0b1: ldc2_w -5435890538945812566
      // 0b4: lload 3
      // 0b5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: lload 3
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 0e8
      // 0c2: aload 5
      // 0c4: ifnull 0e8
      // 0c7: ifnull 10d
      // 0ca: goto 0d7
      // 0cd: ldc2_w -5435890538945812566
      // 0d0: lload 3
      // 0d1: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0db: goto 0e8
      // 0de: ldc2_w -5435890538945812566
      // 0e1: lload 3
      // 0e2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: invokevirtual java/lang/String.length ()I
      // 0eb: ifle 10d
      // 0ee: aload 6
      // 0f0: ldc "#"
      // 0f2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0f5: pop
      // 0f6: aload 6
      // 0f8: aload 1
      // 0f9: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0fc: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0ff: pop
      // 100: goto 10d
      // 103: ldc2_w -5435890538945812566
      // 106: lload 3
      // 107: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: ldc2_w -5713532559742383014
      // 110: lload 3
      // 111: invokedynamic o (JJ)Lcom/zelix/lkl; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 119: aload 6
      // 11b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 11e: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 121: astore 7
      // 123: aload 7
      // 125: lload 3
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 143
      // 12b: ldc2_w -6232354514225295173
      // 12e: lload 3
      // 12f: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: ifnonnull 150
      // 137: bipush 2
      // 138: newarray 10
      // 13a: ldc2_w -6262501581371585924
      // 13d: lload 3
      // 13e: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: goto 150
      // 146: ldc2_w -5435890538945812566
      // 149: lload 3
      // 14a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: areturn
   }

   private lkl(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/lkl.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: aload 0
      // 007: invokespecial java/lang/Object.<init> ()V
      // 00a: aload 0
      // 00b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 00e: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 011: astore 3
      // 012: aload 3
      // 013: bipush 0
      // 014: aload 3
      // 015: ldc "."
      // 017: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 01a: bipush 1
      // 01b: iadd
      // 01c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 01f: astore 4
      // 021: aload 0
      // 022: new java/lang/StringBuilder
      // 025: dup
      // 026: invokespecial java/lang/StringBuilder.<init> ()V
      // 029: ldc "/"
      // 02b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02e: aload 4
      // 030: sipush 19202
      // 033: ldc2_w 6523681943503235574
      // 036: lload 1
      // 037: lxor
      // 038: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: sipush 13616
      // 040: ldc2_w 6238179694368561088
      // 043: lload 1
      // 044: lxor
      // 045: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 050: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 053: ldc2_w -8500940961959995135
      // 056: lload 1
      // 057: invokedynamic q (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: ldc2_w -7735856747736037222
      // 05f: lload 1
      // 060: invokedynamic i (JJ)Lcom/zelix/as; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: astore 5
      // 067: ldc2_w -7755155041200684985
      // 06a: lload 1
      // 06b: invokedynamic m (JJ)Ljava/awt/Toolkit; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: ldc2_w -8357431721218862996
      // 073: lload 1
      // 074: invokedynamic r (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: astore 6
      // 07b: aload 0
      // 07c: aload 5
      // 07e: ldc2_w -7512108198979230840
      // 081: lload 1
      // 082: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/_s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: ldc2_w -8314241359348330656
      // 08a: lload 1
      // 08b: invokedynamic q (Ljava/lang/Object;Lcom/zelix/_s;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: aload 0
      // 091: ldc2_w -8314241359348330656
      // 094: lload 1
      // 095: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/_s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: ldc2_w -8156291487265263272
      // 09d: lload 1
      // 09e: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: i2d
      // 0a4: aload 6
      // 0a6: ldc2_w -8134313654824554263
      // 0a9: lload 1
      // 0aa: invokedynamic r (Ljava/lang/Object;JJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: ldc2_w 50.0
      // 0b2: dsub
      // 0b3: dcmpl
      // 0b4: ifgt 0f1
      // 0b7: aload 0
      // 0b8: ldc2_w -8314241359348330656
      // 0bb: lload 1
      // 0bc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/_s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: ldc2_w -7560261684715918406
      // 0c4: lload 1
      // 0c5: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: i2d
      // 0cb: aload 6
      // 0cd: ldc2_w -7959117003101528689
      // 0d0: lload 1
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: ldc2_w 50.0
      // 0d9: dsub
      // 0da: dcmpl
      // 0db: lload 1
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: iflt 14a
      // 0e1: ifle 111
      // 0e4: goto 0f1
      // 0e7: ldc2_w -7734438100455635060
      // 0ea: lload 1
      // 0eb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: new com/zelix/_s
      // 0f5: dup
      // 0f6: bipush 0
      // 0f7: bipush 0
      // 0f8: invokespecial com/zelix/_s.<init> (II)V
      // 0fb: ldc2_w -8314241359348330656
      // 0fe: lload 1
      // 0ff: invokedynamic q (Ljava/lang/Object;Lcom/zelix/_s;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: goto 111
      // 107: ldc2_w -7734438100455635060
      // 10a: lload 1
      // 10b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: aload 5
      // 114: ldc2_w -8446984555665490204
      // 117: lload 1
      // 118: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: ldc2_w -8557323455032620378
      // 120: lload 1
      // 121: invokedynamic q (Ljava/lang/Object;Lcom/zelix/s;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: aload 0
      // 127: ldc2_w -8557323455032620378
      // 12a: lload 1
      // 12b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: ldc2_w -8530064985460805542
      // 133: lload 1
      // 134: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: i2d
      // 13a: aload 6
      // 13c: ldc2_w -8134313654824554263
      // 13f: lload 1
      // 140: invokedynamic r (Ljava/lang/Object;JJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: ldc2_w 25.0
      // 148: dsub
      // 149: dcmpl
      // 14a: lload 1
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 1c2
      // 150: iflt 19e
      // 153: aload 0
      // 154: new com/zelix/s
      // 157: dup
      // 158: aload 6
      // 15a: ldc2_w -8134313654824554263
      // 15d: lload 1
      // 15e: invokedynamic r (Ljava/lang/Object;JJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: d2i
      // 164: sipush 16086
      // 167: ldc2_w 4724457874321120289
      // 16a: lload 1
      // 16b: lxor
      // 16c: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: isub
      // 172: aload 0
      // 173: ldc2_w -8557323455032620378
      // 176: lload 1
      // 177: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: ldc2_w -8179938880762690103
      // 17f: lload 1
      // 180: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: invokespecial com/zelix/s.<init> (II)V
      // 188: ldc2_w -8557323455032620378
      // 18b: lload 1
      // 18c: invokedynamic q (Ljava/lang/Object;Lcom/zelix/s;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: goto 19e
      // 194: ldc2_w -7734438100455635060
      // 197: lload 1
      // 198: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: aload 0
      // 19f: ldc2_w -8557323455032620378
      // 1a2: lload 1
      // 1a3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: ldc2_w -8179938880762690103
      // 1ab: lload 1
      // 1ac: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: i2d
      // 1b2: aload 6
      // 1b4: ldc2_w -7959117003101528689
      // 1b7: lload 1
      // 1b8: invokedynamic r (Ljava/lang/Object;JJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: ldc2_w 25.0
      // 1c0: dsub
      // 1c1: dcmpl
      // 1c2: lload 1
      // 1c3: lconst_0
      // 1c4: lcmp
      // 1c5: iflt 229
      // 1c8: iflt 216
      // 1cb: aload 0
      // 1cc: new com/zelix/s
      // 1cf: dup
      // 1d0: aload 0
      // 1d1: ldc2_w -8557323455032620378
      // 1d4: lload 1
      // 1d5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: ldc2_w -8530064985460805542
      // 1dd: lload 1
      // 1de: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: aload 6
      // 1e5: ldc2_w -7959117003101528689
      // 1e8: lload 1
      // 1e9: invokedynamic r (Ljava/lang/Object;JJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: d2i
      // 1ef: sipush 19799
      // 1f2: ldc2_w 7561172643654725542
      // 1f5: lload 1
      // 1f6: lxor
      // 1f7: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: isub
      // 1fd: invokespecial com/zelix/s.<init> (II)V
      // 200: ldc2_w -8557323455032620378
      // 203: lload 1
      // 204: invokedynamic q (Ljava/lang/Object;Lcom/zelix/s;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: goto 216
      // 20c: ldc2_w -7734438100455635060
      // 20f: lload 1
      // 210: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: athrow
      // 216: aload 0
      // 217: ldc2_w -8557323455032620378
      // 21a: lload 1
      // 21b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: ldc2_w -8530064985460805542
      // 223: lload 1
      // 224: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: sipush 26922
      // 22c: ldc2_w 2793926769711401951
      // 22f: lload 1
      // 230: lxor
      // 231: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: lload 1
      // 237: lconst_0
      // 238: lcmp
      // 239: iflt 2a3
      // 23c: if_icmpge 27d
      // 23f: aload 0
      // 240: new com/zelix/s
      // 243: dup
      // 244: sipush 7088
      // 247: ldc2_w 2549738664026978630
      // 24a: lload 1
      // 24b: lxor
      // 24c: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: aload 0
      // 252: ldc2_w -8557323455032620378
      // 255: lload 1
      // 256: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: ldc2_w -8179938880762690103
      // 25e: lload 1
      // 25f: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: invokespecial com/zelix/s.<init> (II)V
      // 267: ldc2_w -8557323455032620378
      // 26a: lload 1
      // 26b: invokedynamic q (Ljava/lang/Object;Lcom/zelix/s;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: goto 27d
      // 273: ldc2_w -7734438100455635060
      // 276: lload 1
      // 277: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: lload 1
      // 27e: lconst_0
      // 27f: lcmp
      // 280: iflt 318
      // 283: aload 0
      // 284: ldc2_w -8557323455032620378
      // 287: lload 1
      // 288: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: ldc2_w -8179938880762690103
      // 290: lload 1
      // 291: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: sipush 7088
      // 299: ldc2_w 2549738664026978630
      // 29c: lload 1
      // 29d: lxor
      // 29e: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: if_icmpge 2e4
      // 2a6: aload 0
      // 2a7: new com/zelix/s
      // 2aa: dup
      // 2ab: aload 0
      // 2ac: ldc2_w -8557323455032620378
      // 2af: lload 1
      // 2b0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/s; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: ldc2_w -8530064985460805542
      // 2b8: lload 1
      // 2b9: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: sipush 7088
      // 2c1: ldc2_w 2549738664026978630
      // 2c4: lload 1
      // 2c5: lxor
      // 2c6: invokedynamic a (IJ)I bsm=com/zelix/lkl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: invokespecial com/zelix/s.<init> (II)V
      // 2ce: ldc2_w -8557323455032620378
      // 2d1: lload 1
      // 2d2: invokedynamic q (Ljava/lang/Object;Lcom/zelix/s;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: goto 2e4
      // 2da: ldc2_w -7734438100455635060
      // 2dd: lload 1
      // 2de: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: athrow
      // 2e4: new java/lang/StringBuilder
      // 2e7: dup
      // 2e8: invokespecial java/lang/StringBuilder.<init> ()V
      // 2eb: aload 4
      // 2ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f0: sipush 28847
      // 2f3: ldc2_w 4446245369481318774
      // 2f6: lload 1
      // 2f7: lxor
      // 2f8: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/lkl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 300: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 303: invokestatic com/zelix/f33.a (Ljava/lang/String;)Ljava/lang/String;
      // 306: ldc2_w -8370718497021300553
      // 309: lload 1
      // 30a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/ResourceBundle; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: ldc2_w -8113967652950418247
      // 312: lload 1
      // 313: invokedynamic n (Ljava/util/ResourceBundle;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 318: goto 31d
      // 31b: astore 7
      // 31d: return
   }

   public static void J(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 1
      // 1a: pop
      // 1b: getstatic com/zelix/lkl.a J
      // 1e: lload 2
      // 1f: lxor
      // 20: lstore 2
      // 21: lload 2
      // 22: dup2
      // 23: ldc2_w 90383402766154
      // 26: lxor
      // 27: lstore 5
      // 29: dup2
      // 2a: ldc2_w 24297598087774
      // 2d: lxor
      // 2e: lstore 7
      // 30: dup2
      // 31: ldc2_w 110616798816213
      // 34: lxor
      // 35: lstore 9
      // 37: pop2
      // 38: ldc2_w -1806132170323842015
      // 3b: lload 2
      // 3c: invokedynamic h (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: astore 11
      // 43: ldc2_w -474688247985570234
      // 46: lload 2
      // 47: invokedynamic l (JJ)Lcom/zelix/wt; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: aload 11
      // 4e: ifnull 92
      // 51: ifnonnull 89
      // 54: goto 61
      // 57: ldc2_w -239572413210284151
      // 5a: lload 2
      // 5b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: new com/zelix/wt
      // 64: dup
      // 65: ldc2_w -534103051543706503
      // 68: lload 2
      // 69: invokedynamic l (JJ)Lcom/zelix/lkl; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: lload 7
      // 70: invokespecial com/zelix/wt.<init> (Lcom/zelix/lkl;J)V
      // 73: ldc2_w -474688247985570234
      // 76: lload 2
      // 77: invokedynamic k (Lcom/zelix/wt;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: goto 89
      // 7f: ldc2_w -239572413210284151
      // 82: lload 2
      // 83: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: ldc2_w -474688247985570234
      // 8c: lload 2
      // 8d: invokedynamic l (JJ)Lcom/zelix/wt; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: aload 4
      // 94: aload 1
      // 95: lload 5
      // 97: bipush 3
      // 98: anewarray 339
      // 9b: dup_x2
      // 9c: dup_x2
      // 9d: pop
      // 9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a1: bipush 2
      // a2: swap
      // a3: aastore
      // a4: dup_x1
      // a5: swap
      // a6: bipush 1
      // a7: swap
      // a8: aastore
      // a9: dup_x1
      // aa: swap
      // ab: bipush 0
      // ac: swap
      // ad: aastore
      // ae: ldc2_w -538690745384343222
      // b1: lload 2
      // b2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/net/URL; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: lload 9
      // b9: bipush 2
      // ba: anewarray 339
      // bd: dup_x2
      // be: dup_x2
      // bf: pop
      // c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c3: bipush 1
      // c4: swap
      // c5: aastore
      // c6: dup_x1
      // c7: swap
      // c8: bipush 0
      // c9: swap
      // ca: aastore
      // cb: ldc2_w -2151968040902117773
      // ce: lload 2
      // cf: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static String A(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      int[] var4 = m44.a<"o">(-9020586860771522530L, var2);

      ResourceBundle var10000;
      label31: {
         try {
            var10000 = m44.a<"k">(-8980355152821202813L, var2);
            if (var4 == null) {
               break label31;
            }

            if (var10000 == null) {
               return "";
            }
         } catch (Throwable var9) {
            throw m44.a<"o">(var9, -7452337532772594762L, var2);
         }

         try {
            var10000 = m44.a<"k">(-8980355152821202813L, var2);
         } catch (Throwable var8) {
            boolean var10001 = false;
            return "";
         }
      }

      try {
         return m44.a<"p">(var10000, var1, -8880361537844352263L, var2);
      } catch (Throwable var7) {
         boolean var11 = false;
         return "";
      }
   }

   public static void n(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      long var3 = var1 ^ 128386563984082L;
      int[] var5 = m44.a<"l">(-3669533033389750307L, var1);

      wt var10000;
      label20: {
         try {
            var10000 = m44.a<"h">(-3272438026373212742L, var1);
            if (var5 == null) {
               break label20;
            }

            if (var10000 == null) {
               return;
            }
         } catch (n9 var6) {
            throw m44.a<"l">(var6, -2931639597797407627L, var1);
         }

         var10000 = m44.a<"h">(-3272438026373212742L, var1);
      }

      m44.a<"s">(var10000, new Object[]{var3}, -3657279877943476255L, var1);
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15315;
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
            throw new RuntimeException("com/zelix/lkl", var10);
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
         throw new RuntimeException("com/zelix/lkl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14591;
      if (g[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lkl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/lkl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
