package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _uy {
   private int d;
   private a3 k;
   protected boolean A;
   private int t;
   private a3 B;
   protected boolean v;
   protected PrintWriter K;
   private int u;
   private int g;
   private int f;
   private static final long ab = ess.a(9189480263056648174L, 7967631111979214143L, MethodHandles.lookup().lookupClass()).a(180564462552804L);
   private static final String[] cb;
   private static final String[] db;
   private static final Map eb = new HashMap(13);

   public static String o(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = ab ^ var1;
      long var4 = var1 ^ 80614573726091L;
      long var6 = var1 ^ 33256495348288L;
      return x44.a<"q">(
         new Object[]{
            var6, new String[]{a<"f">(17471, 6856268884985250617L ^ var1) + var3 + " " + x44.a<"q">(new Object[]{var4}, -4092166361282288531L, var1)}
         },
         -4456729246094451359L,
         var1
      );
   }

   protected _uy(boolean var1) {
      this.A = var1;
   }

   public final void E(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = ab ^ var3;
      long var5 = var3 ^ 74044981288382L;
      Object[] var10005 = new Object[]{null, null, false};
      var10005[1] = var5;
      var10005[0] = var2;
      x44.a<"n">(this, var10005, 3455153531145877344L, var3);
   }

   public int w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"h">(this, -5149435925880253847L, var2);
   }

   public final void h(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = ab ^ var2;
      long var5 = var2 ^ 4218003556794L;
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = false;
      var10005[0] = var4;
      x44.a<"n">(this, var10005, 616201622537936479L, var2);
   }

   public void B(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = ab ^ var3;
      long var5 = var3 ^ 128366945193580L;
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = false;
      var10005[0] = var2;
      x44.a<"n">(this, var10005, -2818602332923730859L, var3);
   }

   public boolean s() {
      return this.A;
   }

   public int J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"j">(this, -4693042565697543737L, var2);
   }

   public final void f(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 2
      // 01e: pop
      // 01f: getstatic com/zelix/_uy.ab J
      // 022: lload 2
      // 023: lxor
      // 024: lstore 2
      // 025: lload 2
      // 026: dup2
      // 027: ldc2_w 130396272821100
      // 02a: lxor
      // 02b: lstore 6
      // 02d: dup2
      // 02e: ldc2_w 22824119270143
      // 031: lxor
      // 032: lstore 8
      // 034: pop2
      // 035: ldc2_w -6206177297526519711
      // 038: lload 2
      // 039: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: astore 10
      // 040: new java/lang/StringBuilder
      // 043: dup
      // 044: invokespecial java/lang/StringBuilder.<init> ()V
      // 047: iload 5
      // 049: ifeq 05b
      // 04c: ldc "\t"
      // 04e: goto 05d
      // 051: ldc2_w -6227310812090502015
      // 054: lload 2
      // 055: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: ldc ""
      // 05d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 060: sipush 12787
      // 063: ldc2_w 5847835384575073930
      // 066: lload 2
      // 067: lxor
      // 068: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_uy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 070: ldc " "
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: aload 4
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: aload 0
      // 07b: lload 8
      // 07d: bipush 1
      // 07e: anewarray 119
      // 081: dup_x2
      // 082: dup_x2
      // 083: pop
      // 084: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 087: bipush 0
      // 088: swap
      // 089: aastore
      // 08a: ldc2_w -5736540100048891128
      // 08d: lload 2
      // 08e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 099: astore 11
      // 09b: aload 0
      // 09c: ldc2_w -5994881427762189165
      // 09f: lload 2
      // 0a0: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: aload 10
      // 0a7: ifnonnull 0e4
      // 0aa: ifnonnull 0da
      // 0ad: goto 0ba
      // 0b0: ldc2_w -6227310812090502015
      // 0b3: lload 2
      // 0b4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: new com/zelix/a3
      // 0be: dup
      // 0bf: lload 6
      // 0c1: invokespecial com/zelix/a3.<init> (J)V
      // 0c4: ldc2_w -5994881427762189165
      // 0c7: lload 2
      // 0c8: invokedynamic p (Ljava/lang/Object;Lcom/zelix/a3;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: goto 0da
      // 0d0: ldc2_w -6227310812090502015
      // 0d3: lload 2
      // 0d4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 0
      // 0db: ldc2_w -5994881427762189165
      // 0de: lload 2
      // 0df: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: aload 11
      // 0e6: ldc2_w -5358589328903405402
      // 0e9: lload 2
      // 0ea: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: istore 12
      // 0f1: aload 10
      // 0f3: ifnonnull 124
      // 0f6: iload 12
      // 0f8: ifeq 13a
      // 0fb: goto 108
      // 0fe: ldc2_w -6227310812090502015
      // 101: lload 2
      // 102: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 0
      // 109: ldc2_w -5581676095001982687
      // 10c: lload 2
      // 10d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: aload 11
      // 114: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 117: goto 124
      // 11a: ldc2_w -6227310812090502015
      // 11d: lload 2
      // 11e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: aload 0
      // 125: dup
      // 126: ldc2_w -5805736665239127750
      // 129: lload 2
      // 12a: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: bipush 1
      // 130: iadd
      // 131: ldc2_w -5805736665239127750
      // 134: lload 2
      // 135: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: return
   }

   public final void D(Object[] var1) {
      String var5 = (String)var1[0];
      boolean var2 = (Boolean)var1[1];
      long var3 = (Long)var1[2];
      var3 = ab ^ var3;

      StringBuilder var10000;
      String var10001;
      label17: {
         try {
            var10000 = new StringBuilder();
            if (var2) {
               var10001 = "\t";
               break label17;
            }
         } catch (gj var7) {
            throw x44.a<"w">(var7, -7045880380216753363L, var3);
         }

         var10001 = "";
      }

      String var6 = var10000.append(var10001).append(var5).toString();
      x44.a<"k">(this, -8852454010960855411L, var3).println(var6);
   }

   public int u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      int var10002 = x44.a<"l">(this, -6347165652187844565L, var2);
      x44.a<"s">(this, var10002 - 1, -6347165652187844565L, var2);
      return var10002;
   }

   public final void o(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 3
      // 01d: pop
      // 01e: getstatic com/zelix/_uy.ab J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 133773723733685
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 30719875774246
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w -6627550893751695944
      // 037: lload 3
      // 038: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 10
      // 03f: new java/lang/StringBuilder
      // 042: dup
      // 043: invokespecial java/lang/StringBuilder.<init> ()V
      // 046: iload 5
      // 048: ifeq 05a
      // 04b: ldc "\t"
      // 04d: goto 05c
      // 050: ldc2_w -6607577808884958888
      // 053: lload 3
      // 054: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: athrow
      // 05a: ldc ""
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: sipush 19708
      // 062: ldc2_w 2659522437582384731
      // 065: lload 3
      // 066: lxor
      // 067: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_uy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06f: ldc " "
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: aload 2
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: aload 0
      // 079: lload 8
      // 07b: bipush 1
      // 07c: anewarray 119
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w -4775302013602734383
      // 08b: lload 3
      // 08c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 097: astore 11
      // 099: aload 0
      // 09a: ldc2_w -6839586674844311222
      // 09d: lload 3
      // 09e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: aload 10
      // 0a5: ifnonnull 0e2
      // 0a8: ifnonnull 0d8
      // 0ab: goto 0b8
      // 0ae: ldc2_w -6607577808884958888
      // 0b1: lload 3
      // 0b2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: new com/zelix/a3
      // 0bc: dup
      // 0bd: lload 6
      // 0bf: invokespecial com/zelix/a3.<init> (J)V
      // 0c2: ldc2_w -6839586674844311222
      // 0c5: lload 3
      // 0c6: invokedynamic q (Ljava/lang/Object;Lcom/zelix/a3;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: goto 0d8
      // 0ce: ldc2_w -6607577808884958888
      // 0d1: lload 3
      // 0d2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: ldc2_w -6839586674844311222
      // 0dc: lload 3
      // 0dd: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: aload 11
      // 0e4: ldc2_w -5153393029892108929
      // 0e7: lload 3
      // 0e8: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: istore 12
      // 0ef: aload 10
      // 0f1: ifnonnull 129
      // 0f4: iload 12
      // 0f6: ifeq 138
      // 0f9: goto 106
      // 0fc: ldc2_w -6607577808884958888
      // 0ff: lload 3
      // 100: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: dup
      // 108: ldc2_w -6392897562100576857
      // 10b: lload 3
      // 10c: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: bipush 1
      // 112: iadd
      // 113: ldc2_w -6392897562100576857
      // 116: lload 3
      // 117: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: goto 129
      // 11f: ldc2_w -6607577808884958888
      // 122: lload 3
      // 123: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 0
      // 12a: ldc2_w -4660970422356736776
      // 12d: lload 3
      // 12e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: aload 11
      // 135: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 138: return
   }

   public String Y(Object[] param1) {
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
      // 0c: getstatic com/zelix/_uy.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -1846617524854994975
      // 15: lload 2
      // 16: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w -2067817851192696045
      // 21: lload 2
      // 22: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: ifnonnull 36
      // 2a: aconst_null
      // 2b: areturn
      // 2c: ldc2_w -1867762068741801215
      // 2f: lload 2
      // 30: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: new java/lang/StringBuilder
      // 39: dup
      // 3a: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d: astore 5
      // 3f: bipush 0
      // 40: istore 6
      // 42: aload 0
      // 43: ldc2_w -2067817851192696045
      // 46: lload 2
      // 47: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: ldc2_w -297299674133978655
      // 4f: lload 2
      // 50: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: astore 7
      // 57: aload 7
      // 59: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5e: ifeq 9a
      // 61: lload 2
      // 62: lconst_0
      // 63: lcmp
      // 64: ifle 95
      // 67: iload 6
      // 69: ifle 82
      // 6c: aload 5
      // 6e: getstatic com/zelix/mc.R Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: pop
      // 75: goto 82
      // 78: ldc2_w -1867762068741801215
      // 7b: lload 2
      // 7c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: aload 5
      // 84: aload 7
      // 86: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8b: checkcast java/lang/String
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: pop
      // 92: iinc 6 1
      // 95: aload 4
      // 97: ifnull 57
      // 9a: aload 5
      // 9c: lload 2
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: iflt 91
      // a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a5: areturn
   }

   public String B(Object[] param1) {
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
      // 0c: getstatic com/zelix/_uy.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 1534520748412
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 137552653107206
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w -853963608840415848
      // 25: lload 2
      // 26: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 8
      // 2d: aload 0
      // 2e: lload 6
      // 30: bipush 1
      // 31: anewarray 119
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: ldc2_w -974712968192761649
      // 40: lload 2
      // 41: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: aload 8
      // 48: ifnonnull 8b
      // 4b: ifle b1
      // 4e: goto 5b
      // 51: ldc2_w -834006022249567880
      // 54: lload 2
      // 55: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 0
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 119
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -1399803070841903619
      // 6e: lload 2
      // 6f: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: pop
      // 75: ldc2_w -1146758713334430231
      // 78: lload 2
      // 79: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: goto 8b
      // 81: ldc2_w -834006022249567880
      // 84: lload 2
      // 85: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: lload 2
      // 8c: lconst_0
      // 8d: lcmp
      // 8e: ifle 97
      // 91: ifeq ae
      // 94: sipush 17229
      // 97: ldc2_w 4370748531719745999
      // 9a: lload 2
      // 9b: lxor
      // 9c: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_uy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: goto b0
      // a4: ldc2_w -834006022249567880
      // a7: lload 2
      // a8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: ldc " "
      // b0: areturn
      // b1: ldc ""
      // b3: areturn
   }

   public void k(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      long var5 = ((long)var4 << 56 | var2 << 8 >>> 8) ^ ab;
      x44.a<"p">(this, x44.a<"o">(this, -5455810198335954040L, var5) + 1, -5455810198335954040L, var5);
   }

   public final void S(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = ab ^ var3;
      long var5 = var3 ^ 5024453427769L;
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = false;
      var10005[0] = var2;
      x44.a<"l">(this, var10005, -8070867452694035444L, var3);
   }

   public final void I(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/_uy.ab J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 48653561541355
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: sipush 4078
      // 2d: ldc2_w 7210010482442299522
      // 30: lload 2
      // 31: lxor
      // 32: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_uy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: aload 4
      // 3c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f: aload 0
      // 40: lload 5
      // 42: bipush 1
      // 43: anewarray 119
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w 8680564784351451932
      // 52: lload 2
      // 53: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5e: astore 8
      // 60: ldc2_w 7046728391333199989
      // 63: lload 2
      // 64: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: ldc2_w 9075705362247164062
      // 6c: lload 2
      // 6d: invokedynamic n (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: aload 8
      // 74: ldc2_w 9057454548658903212
      // 77: lload 2
      // 78: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: astore 7
      // 7f: aload 0
      // 80: ldc2_w 8835463956884341045
      // 83: lload 2
      // 84: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: aload 8
      // 8b: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 8e: aload 0
      // 8f: ldc2_w 8835463956884341045
      // 92: lload 2
      // 93: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: ldc2_w 7107846939432472845
      // 9b: lload 2
      // 9c: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: aload 0
      // a2: ldc2_w 8911549325270856624
      // a5: lload 2
      // a6: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: aload 7
      // ad: ifnonnull d5
      // b0: ifeq d4
      // b3: goto c0
      // b6: ldc2_w 7025647636566817941
      // b9: lload 2
      // ba: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: new com/zelix/gj
      // c3: dup
      // c4: aload 8
      // c6: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // c9: athrow
      // ca: ldc2_w 7025647636566817941
      // cd: lload 2
      // ce: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: athrow
      // d4: bipush 1
      // d5: ldc2_w 8720473434783260385
      // d8: lload 2
      // d9: invokedynamic w (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: return
   }

   public List e(Object[] param1) {
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
      // 0c: getstatic com/zelix/_uy.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -3001884035791915031
      // 15: lload 2
      // 16: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: new java/util/ArrayList
      // 20: dup
      // 21: aload 0
      // 22: ldc2_w -3222897398048648421
      // 25: lload 2
      // 26: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: ifnonnull 3c
      // 2e: bipush 0
      // 2f: goto 4f
      // 32: ldc2_w -3018479163376465143
      // 35: lload 2
      // 36: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -3222897398048648421
      // 40: lload 2
      // 41: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: ldc2_w -3802429244844429515
      // 49: lload 2
      // 4a: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: invokespecial java/util/ArrayList.<init> (I)V
      // 52: astore 5
      // 54: aload 0
      // 55: ldc2_w -3222897398048648421
      // 58: lload 2
      // 59: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 4
      // 60: ifnonnull 8a
      // 63: ifnull d6
      // 66: goto 73
      // 69: ldc2_w -3018479163376465143
      // 6c: lload 2
      // 6d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: aload 0
      // 74: ldc2_w -3222897398048648421
      // 77: lload 2
      // 78: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: goto 8a
      // 80: ldc2_w -3018479163376465143
      // 83: lload 2
      // 84: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: ldc2_w -3758373738528992791
      // 8d: lload 2
      // 8e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: astore 6
      // 95: aload 6
      // 97: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9c: ifeq d6
      // 9f: aload 6
      // a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a6: checkcast java/lang/String
      // a9: astore 7
      // ab: lload 2
      // ac: lconst_0
      // ad: lcmp
      // ae: ifle be
      // b1: aload 5
      // b3: aload 4
      // b5: ifnonnull d8
      // b8: aload 7
      // ba: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // bd: pop
      // be: aload 4
      // c0: ifnull 95
      // c3: lload 2
      // c4: lconst_0
      // c5: lcmp
      // c6: iflt ab
      // c9: goto d6
      // cc: ldc2_w -3018479163376465143
      // cf: lload 2
      // d0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: athrow
      // d6: aload 5
      // d8: areturn
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"j">(x44.a<"n">(this, -7678396654513410344L, var2), -8266040021383004448L, var2);
   }

   public int c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"n">(this, 1049384930840074577L, var2);
   }

   public final void A(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 3
      // 01d: pop
      // 01e: getstatic com/zelix/_uy.ab J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 14520100298603
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 122520945256184
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w -5343449430945655706
      // 037: lload 3
      // 038: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 10
      // 03f: new java/lang/StringBuilder
      // 042: dup
      // 043: invokespecial java/lang/StringBuilder.<init> ()V
      // 046: iload 5
      // 048: ifeq 05a
      // 04b: ldc "\t"
      // 04d: goto 05c
      // 050: ldc2_w -5362838948122236794
      // 053: lload 3
      // 054: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: athrow
      // 05a: ldc ""
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: sipush 24393
      // 062: ldc2_w 3794347121221856305
      // 065: lload 3
      // 066: lxor
      // 067: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_uy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06f: ldc " "
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: aload 2
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: aload 0
      // 079: lload 8
      // 07b: bipush 1
      // 07c: anewarray 119
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w -6024465548465451249
      // 08b: lload 3
      // 08c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 097: astore 11
      // 099: aload 0
      // 09a: ldc2_w -5707577272017620844
      // 09d: lload 3
      // 09e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: aload 10
      // 0a5: ifnonnull 0e2
      // 0a8: ifnonnull 0d8
      // 0ab: goto 0b8
      // 0ae: ldc2_w -5362838948122236794
      // 0b1: lload 3
      // 0b2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: new com/zelix/a3
      // 0bc: dup
      // 0bd: lload 6
      // 0bf: invokespecial com/zelix/a3.<init> (J)V
      // 0c2: ldc2_w -5707577272017620844
      // 0c5: lload 3
      // 0c6: invokedynamic w (Ljava/lang/Object;Lcom/zelix/a3;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: goto 0d8
      // 0ce: ldc2_w -5362838948122236794
      // 0d1: lload 3
      // 0d2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: ldc2_w -5707577272017620844
      // 0dc: lload 3
      // 0dd: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: aload 11
      // 0e4: ldc2_w -6222553248429138783
      // 0e7: lload 3
      // 0e8: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: istore 12
      // 0ef: aload 10
      // 0f1: ifnonnull 129
      // 0f4: iload 12
      // 0f6: ifeq 138
      // 0f9: goto 106
      // 0fc: ldc2_w -5362838948122236794
      // 0ff: lload 3
      // 100: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: dup
      // 108: ldc2_w -5601618994342156318
      // 10b: lload 3
      // 10c: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: bipush 1
      // 112: iadd
      // 113: ldc2_w -5601618994342156318
      // 116: lload 3
      // 117: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: goto 129
      // 11f: ldc2_w -5362838948122236794
      // 122: lload 3
      // 123: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 0
      // 12a: ldc2_w -5868581162310429402
      // 12d: lload 3
      // 12e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: aload 11
      // 135: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 138: return
   }

   public final void V(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 2
      // 01d: pop
      // 01e: getstatic com/zelix/_uy.ab J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 1001537715009
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 108521614754514
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w -7930191537070165940
      // 037: lload 3
      // 038: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 10
      // 03f: new java/lang/StringBuilder
      // 042: dup
      // 043: invokespecial java/lang/StringBuilder.<init> ()V
      // 046: iload 2
      // 047: ifeq 059
      // 04a: ldc "\t"
      // 04c: goto 05b
      // 04f: ldc2_w -7946227990186406740
      // 052: lload 3
      // 053: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: athrow
      // 059: ldc ""
      // 05b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05e: sipush 11405
      // 061: ldc2_w 8937481156621777885
      // 064: lload 3
      // 065: lxor
      // 066: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_uy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06e: ldc " "
      // 070: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 073: aload 5
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: aload 0
      // 079: lload 8
      // 07b: bipush 1
      // 07c: anewarray 119
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w -8624743630537200859
      // 08b: lload 3
      // 08c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 097: astore 11
      // 099: aload 0
      // 09a: ldc2_w -7719009870343777090
      // 09d: lload 3
      // 09e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: aload 10
      // 0a5: lload 3
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 0ea
      // 0ab: ifnonnull 0e8
      // 0ae: ifnonnull 0de
      // 0b1: goto 0be
      // 0b4: ldc2_w -7946227990186406740
      // 0b7: lload 3
      // 0b8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: new com/zelix/a3
      // 0c2: dup
      // 0c3: lload 6
      // 0c5: invokespecial com/zelix/a3.<init> (J)V
      // 0c8: ldc2_w -7719009870343777090
      // 0cb: lload 3
      // 0cc: invokedynamic u (Ljava/lang/Object;Lcom/zelix/a3;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: goto 0de
      // 0d4: ldc2_w -7946227990186406740
      // 0d7: lload 3
      // 0d8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 0
      // 0df: ldc2_w -7600550487651703522
      // 0e2: lload 3
      // 0e3: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: aload 10
      // 0ea: ifnonnull 127
      // 0ed: ifnonnull 11d
      // 0f0: goto 0fd
      // 0f3: ldc2_w -7946227990186406740
      // 0f6: lload 3
      // 0f7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: new com/zelix/a3
      // 101: dup
      // 102: lload 6
      // 104: invokespecial com/zelix/a3.<init> (J)V
      // 107: ldc2_w -7600550487651703522
      // 10a: lload 3
      // 10b: invokedynamic u (Ljava/lang/Object;Lcom/zelix/a3;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: goto 11d
      // 113: ldc2_w -7946227990186406740
      // 116: lload 3
      // 117: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: aload 0
      // 11e: ldc2_w -7719009870343777090
      // 121: lload 3
      // 122: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: aload 11
      // 129: ldc2_w -8246371205296506741
      // 12c: lload 3
      // 12d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: istore 12
      // 134: lload 3
      // 135: lconst_0
      // 136: lcmp
      // 137: iflt 183
      // 13a: iload 12
      // 13c: aload 10
      // 13e: ifnonnull 182
      // 141: ifeq 199
      // 144: goto 151
      // 147: ldc2_w -7946227990186406740
      // 14a: lload 3
      // 14b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: aload 0
      // 152: ldc2_w -8456474379497819892
      // 155: lload 3
      // 156: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: aload 11
      // 15d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 160: aload 0
      // 161: ldc2_w -7600550487651703522
      // 164: lload 3
      // 165: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: aload 11
      // 16c: ldc2_w -8246371205296506741
      // 16f: lload 3
      // 170: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: goto 182
      // 178: ldc2_w -7946227990186406740
      // 17b: lload 3
      // 17c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: pop
      // 183: aload 0
      // 184: dup
      // 185: ldc2_w -8413144062146685913
      // 188: lload 3
      // 189: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: bipush 1
      // 18f: iadd
      // 190: ldc2_w -8413144062146685913
      // 193: lload 3
      // 194: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: return
   }

   public PrintWriter T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"l">(this, 2131025955932055098L, var2);
   }

   public String X(Object[] param1) {
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
      // 0c: getstatic com/zelix/_uy.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8680248290553190856
      // 15: lload 2
      // 16: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 9151675758662110362
      // 21: lload 2
      // 22: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: ifnonnull 36
      // 2a: aconst_null
      // 2b: areturn
      // 2c: ldc2_w 8664205205990974760
      // 2f: lload 2
      // 30: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: new java/lang/StringBuilder
      // 39: dup
      // 3a: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d: astore 5
      // 3f: bipush 0
      // 40: istore 6
      // 42: aload 0
      // 43: ldc2_w 9151675758662110362
      // 46: lload 2
      // 47: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: ldc2_w 7347296735468404680
      // 4f: lload 2
      // 50: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: astore 7
      // 57: aload 7
      // 59: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5e: ifeq 9a
      // 61: lload 2
      // 62: lconst_0
      // 63: lcmp
      // 64: ifle 95
      // 67: iload 6
      // 69: ifle 82
      // 6c: aload 5
      // 6e: getstatic com/zelix/mc.R Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: pop
      // 75: goto 82
      // 78: ldc2_w 8664205205990974760
      // 7b: lload 2
      // 7c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: aload 5
      // 84: aload 7
      // 86: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8b: checkcast java/lang/String
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: pop
      // 92: iinc 6 1
      // 95: aload 4
      // 97: ifnull 57
      // 9a: aload 5
      // 9c: lload 2
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: ifle 91
      // a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a5: areturn
   }

   public int o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"i">(this, 6247057921815626515L, var2);
   }

   public void Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      x44.a<"q">(this, null, 62200507463778434L, var2);
      x44.a<"q">(this, null, 196190233670168866L, var2);
   }

   public int U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"m">(this, -2994955408123002824L, var2);
   }

   static {
      long var0 = ab ^ 139724274041239L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\"\u0010´\\ÿà\u0087\u0018ô\u0016~w\f%\u001f³@\u0007±]wg4¯Á\u0017m^ÂwRº\u0085N\u0084M¦\u0090ø\u0013Jz^ï>í÷¹|\u0091\u009dÏ\u0080\u0088òÌpJ\u0090\u0087¤i/\u008fë\u0006gð÷\u009eÈ'ØòÎ\u0092¼Rwö\u001e\u0018Þ¾I\u008e\u0080âbóñ\u000fë\u0091+\u0014:å{ÅÄõwò\u0082â ¡Ø®r?g£ÀW\u0093ÿ\u0097w6hTúÆZ~þ\u009erÁôò\u009b³W/ÿ5\u00104fAv@\u008b1¨\u001f\u0017Y+\n%·Ö";
      int var8 = "\"\u0010´\\ÿà\u0087\u0018ô\u0016~w\f%\u001f³@\u0007±]wg4¯Á\u0017m^ÂwRº\u0085N\u0084M¦\u0090ø\u0013Jz^ï>í÷¹|\u0091\u009dÏ\u0080\u0088òÌpJ\u0090\u0087¤i/\u008fë\u0006gð÷\u009eÈ'ØòÎ\u0092¼Rwö\u001e\u0018Þ¾I\u008e\u0080âbóñ\u000fë\u0091+\u0014:å{ÅÄõwò\u0082â ¡Ø®r?g£ÀW\u0093ÿ\u0097w6hTúÆZ~þ\u009erÁôò\u009b³W/ÿ5\u00104fAv@\u008b1¨\u001f\u0017Y+\n%·Ö"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     cb = var9;
                     db = new String[7];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "KgA¹\u001b]á\u0006\u001fù«¶ñMÚìFC\b\u001c¿|£\u008e\u0010@1\u009a\u0014(ZÓüÞL%\u000eÎm\u001cØ";
                  var8 = "KgA¹\u001b]á\u0006\u001fù«¶ñMÚìFC\b\u001c¿|£\u008e\u0010@1\u009a\u0014(ZÓüÞL%\u000eÎm\u001cØ".length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3965;
      if (db[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])eb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               eb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_uy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = cb[var5].getBytes("ISO-8859-1");
         db[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return db[var5];
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
         throw new RuntimeException("com/zelix/_uy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
