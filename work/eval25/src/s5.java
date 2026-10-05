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

public class s5 {
   private String R;
   private final boolean Z;
   private final String r;
   private final String D;
   private final boolean U;
   private final String j;
   private final boolean N;
   private static final long a = ess.a(1864701099197227048L, -3196919546196577350L, MethodHandles.lookup().lookupClass()).a(42811253413969L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 6078539704045052586L, var2);
   }

   public boolean m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"n">(this, -4771292691938912325L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, -5081726835115687487L, var2);
      }

      return false;
   }

   s5(String var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 16577789168058L;
      int var4 = (int)((var2 ^ 16577789168058L) >>> 48);
      int var5 = (int)((var2 ^ 16577789168058L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      this(var1, "", false, null, (short)var4, var5, (char)var6, null, false, false);
   }

   s5(String var1, String var2, boolean var3, String var4, short var5, int var6, char var7, String var8, boolean var9, boolean var10) {
      long var11 = ((long)var5 << 48 | (long)var6 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ a;
      super();
      this.j = var1;
      this.r = var2;
      this.D = var4;
      this.U = var9;
      x44.a<"u">(this, var8, 6936871856886745655L, var11);
      this.Z = var3;
      this.N = var10;
   }

   String P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 422584377772977563L, var2);
   }

   public final String B(Object[] param1) {
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
      // 0c: getstatic com/zelix/s5.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 55232757394352
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 4023470232195403835
      // 1e: lload 2
      // 1f: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: astore 7
      // 2d: istore 6
      // 2f: aload 7
      // 31: aload 0
      // 32: ldc2_w 3486369578160014995
      // 35: lload 2
      // 36: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: pop
      // 3f: iload 6
      // 41: ifne ef
      // 44: aload 0
      // 45: lload 4
      // 47: bipush 1
      // 48: anewarray 48
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w 3988382871940530259
      // 57: lload 2
      // 58: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: ifne c8
      // 60: goto 6d
      // 63: ldc2_w 3741135603496553296
      // 66: lload 2
      // 67: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: ldc2_w 3393276010016156287
      // 71: lload 2
      // 72: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: iload 6
      // 79: ifne fc
      // 7c: goto 89
      // 7f: ldc2_w 3741135603496553296
      // 82: lload 2
      // 83: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: ifnull f7
      // 8c: goto 99
      // 8f: ldc2_w 3741135603496553296
      // 92: lload 2
      // 93: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 0
      // 9a: ldc2_w 3393276010016156287
      // 9d: lload 2
      // 9e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: iload 6
      // a5: ifne fc
      // a8: goto b5
      // ab: ldc2_w 3741135603496553296
      // ae: lload 2
      // af: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: invokevirtual java/lang/String.length ()I
      // b8: ifle f7
      // bb: goto c8
      // be: ldc2_w 3741135603496553296
      // c1: lload 2
      // c2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 7
      // ca: getstatic com/zelix/s5.e J
      // cd: l2i
      // ce: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // d1: pop
      // d2: aload 7
      // d4: aload 0
      // d5: ldc2_w 3393276010016156287
      // d8: lload 2
      // d9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e1: pop
      // e2: goto ef
      // e5: ldc2_w 3741135603496553296
      // e8: lload 2
      // e9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ee: athrow
      // ef: aload 7
      // f1: ldc ")"
      // f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // f6: pop
      // f7: aload 7
      // f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // fc: areturn
   }

   s5(String var1, long var2, String var4) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 79292648190386L;
      int var5 = (int)((var2 ^ 79292648190386L) >>> 48);
      int var6 = (int)((var2 ^ 79292648190386L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      this(var1, var4, false, null, (short)var5, var6, (char)var7, null, false, false);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/s5.a J
      // 003: ldc2_w 118695995252369
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -8656349028823085151
      // 00b: lload 2
      // 00c: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: istore 4
      // 013: aload 1
      // 014: instanceof com/zelix/s5
      // 017: iload 4
      // 019: ifeq 259
      // 01c: ifeq 24b
      // 01f: goto 02c
      // 022: ldc2_w -9058299723839751439
      // 025: lload 2
      // 026: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/s5
      // 030: astore 6
      // 032: aload 0
      // 033: ldc2_w -9096345670955206862
      // 036: lload 2
      // 037: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 6
      // 03e: ldc2_w -9096345670955206862
      // 041: lload 2
      // 042: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04a: iload 4
      // 04c: ifeq 0a7
      // 04f: ifeq 099
      // 052: goto 05f
      // 055: ldc2_w -9058299723839751439
      // 058: lload 2
      // 059: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: aload 0
      // 060: ldc2_w -7010400463016715298
      // 063: lload 2
      // 064: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: iload 4
      // 06b: ifeq 0c5
      // 06e: goto 07b
      // 071: ldc2_w -9058299723839751439
      // 074: lload 2
      // 075: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 6
      // 07d: ldc2_w -7010400463016715298
      // 080: lload 2
      // 081: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 089: ifne 0ae
      // 08c: goto 099
      // 08f: ldc2_w -9058299723839751439
      // 092: lload 2
      // 093: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: bipush 0
      // 09a: goto 0a7
      // 09d: ldc2_w -9058299723839751439
      // 0a0: lload 2
      // 0a1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: istore 5
      // 0a9: iload 4
      // 0ab: ifne 246
      // 0ae: aload 0
      // 0af: ldc2_w -7025799176953514439
      // 0b2: lload 2
      // 0b3: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: goto 0c5
      // 0bb: ldc2_w -9058299723839751439
      // 0be: lload 2
      // 0bf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: iload 4
      // 0c7: ifeq 11e
      // 0ca: ifnull 107
      // 0cd: goto 0da
      // 0d0: ldc2_w -9058299723839751439
      // 0d3: lload 2
      // 0d4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 6
      // 0dc: ldc2_w -7025799176953514439
      // 0df: lload 2
      // 0e0: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: iload 4
      // 0e7: ifeq 11e
      // 0ea: goto 0f7
      // 0ed: ldc2_w -9058299723839751439
      // 0f0: lload 2
      // 0f1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: ifnull 1f3
      // 0fa: goto 107
      // 0fd: ldc2_w -9058299723839751439
      // 100: lload 2
      // 101: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 0
      // 108: ldc2_w -7025799176953514439
      // 10b: lload 2
      // 10c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: goto 11e
      // 114: ldc2_w -9058299723839751439
      // 117: lload 2
      // 118: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: iload 4
      // 120: ifeq 189
      // 123: ifnonnull 160
      // 126: goto 133
      // 129: ldc2_w -9058299723839751439
      // 12c: lload 2
      // 12d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 6
      // 135: ldc2_w -7025799176953514439
      // 138: lload 2
      // 139: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: iload 4
      // 140: ifeq 189
      // 143: goto 150
      // 146: ldc2_w -9058299723839751439
      // 149: lload 2
      // 14a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: ifnonnull 1f3
      // 153: goto 160
      // 156: ldc2_w -9058299723839751439
      // 159: lload 2
      // 15a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 0
      // 161: iload 4
      // 163: ifeq 209
      // 166: goto 173
      // 169: ldc2_w -9058299723839751439
      // 16c: lload 2
      // 16d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: ldc2_w -7025799176953514439
      // 176: lload 2
      // 177: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: goto 189
      // 17f: ldc2_w -9058299723839751439
      // 182: lload 2
      // 183: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: ifnull 1fb
      // 18c: aload 6
      // 18e: iload 4
      // 190: ifeq 209
      // 193: goto 1a0
      // 196: ldc2_w -9058299723839751439
      // 199: lload 2
      // 19a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: ldc2_w -7025799176953514439
      // 1a3: lload 2
      // 1a4: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: ifnull 1fb
      // 1ac: goto 1b9
      // 1af: ldc2_w -9058299723839751439
      // 1b2: lload 2
      // 1b3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: ldc2_w -7025799176953514439
      // 1bd: lload 2
      // 1be: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: aload 6
      // 1c5: ldc2_w -7025799176953514439
      // 1c8: lload 2
      // 1c9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d1: iload 4
      // 1d3: ifeq 212
      // 1d6: goto 1e3
      // 1d9: ldc2_w -9058299723839751439
      // 1dc: lload 2
      // 1dd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: ifne 1fb
      // 1e6: goto 1f3
      // 1e9: ldc2_w -9058299723839751439
      // 1ec: lload 2
      // 1ed: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: bipush 0
      // 1f4: istore 5
      // 1f6: iload 4
      // 1f8: ifne 246
      // 1fb: aload 0
      // 1fc: goto 209
      // 1ff: ldc2_w -9058299723839751439
      // 202: lload 2
      // 203: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: ldc2_w -9127287044189542497
      // 20c: lload 2
      // 20d: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: iload 4
      // 214: ifeq 240
      // 217: aload 6
      // 219: ldc2_w -9127287044189542497
      // 21c: lload 2
      // 21d: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: if_icmpne 243
      // 225: goto 232
      // 228: ldc2_w -9058299723839751439
      // 22b: lload 2
      // 22c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: bipush 1
      // 233: goto 240
      // 236: ldc2_w -9058299723839751439
      // 239: lload 2
      // 23a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: goto 244
      // 243: bipush 0
      // 244: istore 5
      // 246: iload 4
      // 248: ifne 25b
      // 24b: bipush 0
      // 24c: goto 259
      // 24f: ldc2_w -9058299723839751439
      // 252: lload 2
      // 253: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: istore 5
      // 25b: iload 5
      // 25d: ireturn
   }

   public String r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -268797856550487763L, var2);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 12548358344608L;
      int var10000 = x44.a<"s">(-7570805002237583728L, var1);
      int var4 = x44.a<"o">(this, -8002288150412106237L, var1).hashCode() ^ x44.a<"o">(this, -8104388649372316945L, var1).hashCode();
      int var3 = var10000;

      label37: {
         label36: {
            try {
               var7 = this;
               if (var3 == 0) {
                  break label37;
               }

               if (x44.a<"o">(this, -8120491218650585336L, var1) == null) {
                  break label36;
               }
            } catch (gj var6) {
               throw x44.a<"s">(var6, -7819633266854450240L, var1);
            }

            var4 ^= x44.a<"o">(this, -8120491218650585336L, var1).hashCode();
         }

         var7 = this;
      }

      try {
         byte var8 = x44.a<"o">(var7, -8042236690135402834L, var1);
         if (var3 == 0) {
            return var8;
         }

         if (var8 == 0) {
            return var4;
         }
      } catch (gj var5) {
         throw x44.a<"s">(var5, -7819633266854450240L, var1);
      }

      var4 ^= a<"d">(1719, 4304581393002717021L ^ var1).hashCode();
      return var4;
   }

   boolean c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 9189064768017244847L, var2);
   }

   public boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 7997674896071280695L, var2);
   }

   public String o(Object[] param1) {
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
      // 0c: getstatic com/zelix/s5.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 1588726492386669025
      // 15: lload 2
      // 16: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: iload 4
      // 20: ifne 55
      // 23: ldc2_w 1238051351047387108
      // 26: lload 2
      // 27: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: ifeq 54
      // 2f: goto 3c
      // 32: ldc2_w 1310927418521987722
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: sipush 31398
      // 3f: ldc2_w 1257269962818691591
      // 42: lload 2
      // 43: lxor
      // 44: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/s5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: areturn
      // 4a: ldc2_w 1310927418521987722
      // 4d: lload 2
      // 4e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: ldc2_w 1066543895497018277
      // 58: lload 2
      // 59: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: areturn
   }

   String O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 7842942383722628772L, var2);
   }

   public boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"o">(this, -2988615517310845248L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"s">(var4, -3840617485116083704L, var2);
      }

      return false;
   }

   static {
      long var5 = a ^ 108813633447233L;
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
      String var11 = "H\u001c\u009b\u001eÐ'üô¡ýMs\bãr<YÈ|ù\u008cP\u007f}\u008dÜ\u009f¿Ù\u001dRÀ\u0099ýuM\u0095\u0084²\u0096(ëÇ³ã\u001c\u0007IªÍ1\u008e\u008c8w«(\u0006;ñG\u007fã®£.¿E2T]u\u0097\u0085\bÐ>·\u001f².";
      int var13 = "H\u001c\u009b\u001eÐ'üô¡ýMs\bãr<YÈ|ù\u008cP\u007f}\u008dÜ\u009f¿Ù\u001dRÀ\u0099ýuM\u0095\u0084²\u0096(ëÇ³ã\u001c\u0007IªÍ1\u008e\u008c8w«(\u0006;ñG\u007fã®£.¿E2T]u\u0097\u0085\bÐ>·\u001f²."
         .length();
      char var10 = '(';
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
            long var2 = 3931612659690153153L;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17570;
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
            throw new RuntimeException("com/zelix/s5", var10);
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
         throw new RuntimeException("com/zelix/s5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
