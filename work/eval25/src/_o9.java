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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _o9 extends _og {
   private final int B;
   protected final vi C;
   protected final y4 O;
   private static final long b = ess.a(-5529519599073525336L, 2663104163205472014L, MethodHandles.lookup().lookupClass()).a(47794005632943L);
   private static final String g;
   private static final long[] k;
   private static final Integer[] l;
   private static final Map m;

   public final boolean o(Object[] param1) {
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
      // 0c: ldc2_w 4044195243099530714
      // 0f: lload 2
      // 10: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: astore 4
      // 17: getstatic com/zelix/_k7.D [I
      // 1a: aload 0
      // 1b: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 1e: invokevirtual com/zelix/y4.ordinal ()I
      // 21: iaload
      // 22: aload 4
      // 24: ifnonnull 7d
      // 27: tableswitch 85 1 12 83 71 83 71 83 83 83 83 83 83 83 83
      // 64: ldc2_w 2546013474565465209
      // 67: lload 2
      // 68: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 1
      // 6f: ireturn
      // 70: ldc2_w 2546013474565465209
      // 73: lload 2
      // 74: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: bipush 0
      // 7b: ireturn
      // 7c: bipush 0
      // 7d: ireturn
   }

   public final boolean Y(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 6
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/n
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Long
      // 24: invokevirtual java/lang/Long.longValue ()J
      // 27: lstore 3
      // 28: pop
      // 29: ldc2_w 5084457588552424266
      // 2c: lload 3
      // 2d: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: astore 7
      // 34: getstatic com/zelix/_k7.D [I
      // 37: aload 0
      // 38: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 3b: invokevirtual com/zelix/y4.ordinal ()I
      // 3e: iaload
      // 3f: aload 7
      // 41: ifnonnull c7
      // 44: tableswitch 130 1 12 74 74 74 74 74 86 86 86 86 86 74 74
      // 84: ldc2_w 6756807767050443497
      // 87: lload 3
      // 88: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: bipush 0
      // 8f: ireturn
      // 90: ldc2_w 6756807767050443497
      // 93: lload 3
      // 94: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: iload 6
      // 9c: aload 7
      // 9e: ifnonnull c1
      // a1: iload 5
      // a3: if_icmplt c4
      // a6: goto b3
      // a9: ldc2_w 6756807767050443497
      // ac: lload 3
      // ad: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: bipush 1
      // b4: goto c1
      // b7: ldc2_w 6756807767050443497
      // ba: lload 3
      // bb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: athrow
      // c1: goto c5
      // c4: bipush 0
      // c5: ireturn
      // c6: bipush 0
      // c7: ireturn
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 26619652573261L;
      return x44.a<"h">(this, new Object[]{var4}, -1376581772371127143L, var2);
   }

   public final boolean e(Object[] param1) {
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
      // 0c: ldc2_w 9060366003407872121
      // 0f: lload 2
      // 10: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: astore 4
      // 17: getstatic com/zelix/_k7.D [I
      // 1a: aload 0
      // 1b: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 1e: invokevirtual com/zelix/y4.ordinal ()I
      // 21: iaload
      // 22: aload 4
      // 24: ifnonnull 7d
      // 27: tableswitch 85 1 12 71 71 71 71 71 83 83 83 83 83 83 83
      // 64: ldc2_w 7419254883074073050
      // 67: lload 2
      // 68: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 1
      // 6f: ireturn
      // 70: ldc2_w 7419254883074073050
      // 73: lload 2
      // 74: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: bipush 0
      // 7b: ireturn
      // 7c: bipush 0
      // 7d: ireturn
   }

   public _o9(vi var1, long var2, y4 var4) {
      var2 = b ^ var2;
      super(b<"e">(26250, 7597788196624261221L ^ var2));
      this.C = var1;
      this.O = var4;
      this.B = 0;
   }

   private static y4 a(Object[] param0) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 1
      // 01d: pop
      // 01e: getstatic com/zelix/_o9.b J
      // 021: lload 1
      // 022: lxor
      // 023: lstore 1
      // 024: ldc2_w 3619651975864758270
      // 027: lload 1
      // 028: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: astore 5
      // 02f: aload 3
      // 030: invokevirtual java/lang/String.length ()I
      // 033: aload 5
      // 035: ifnonnull 16c
      // 038: bipush 1
      // 039: if_icmpne 16a
      // 03c: goto 049
      // 03f: ldc2_w 2986178657370058333
      // 042: lload 1
      // 043: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: athrow
      // 049: aload 3
      // 04a: bipush 0
      // 04b: invokevirtual java/lang/String.charAt (I)C
      // 04e: lload 1
      // 04f: lconst_0
      // 050: lcmp
      // 051: iflt 0e4
      // 054: aload 5
      // 056: ifnonnull 0e4
      // 059: goto 066
      // 05c: ldc2_w 2986178657370058333
      // 05f: lload 1
      // 060: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: tableswitch 258 66 90 124 124 223 258 188 258 258 124 159 258 258 258 258 258 258 258 258 124 258 258 258 258 258 258 124
      // 0d8: ldc2_w 2986178657370058333
      // 0db: lload 1
      // 0dc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: iload 4
      // 0e4: ifeq 0fb
      // 0e7: ldc2_w 3132661784049217699
      // 0ea: lload 1
      // 0eb: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: areturn
      // 0f1: ldc2_w 2986178657370058333
      // 0f4: lload 1
      // 0f5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: ldc2_w 3954438276475588309
      // 0fe: lload 1
      // 0ff: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: areturn
      // 105: iload 4
      // 107: ifeq 118
      // 10a: getstatic com/zelix/y4.u Lcom/zelix/y4;
      // 10d: areturn
      // 10e: ldc2_w 2986178657370058333
      // 111: lload 1
      // 112: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: ldc2_w 3377177447416569007
      // 11b: lload 1
      // 11c: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: areturn
      // 122: iload 4
      // 124: ifeq 13b
      // 127: ldc2_w 3867923029735563221
      // 12a: lload 1
      // 12b: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: areturn
      // 131: ldc2_w 2986178657370058333
      // 134: lload 1
      // 135: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: ldc2_w 2969363188251280072
      // 13e: lload 1
      // 13f: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: areturn
      // 145: iload 4
      // 147: ifeq 15e
      // 14a: ldc2_w 3176529576827191404
      // 14d: lload 1
      // 14e: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: areturn
      // 154: ldc2_w 2986178657370058333
      // 157: lload 1
      // 158: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: ldc2_w 3962971132125391371
      // 161: lload 1
      // 162: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: areturn
      // 168: aconst_null
      // 169: areturn
      // 16a: iload 4
      // 16c: ifeq 17d
      // 16f: getstatic com/zelix/y4.m Lcom/zelix/y4;
      // 172: areturn
      // 173: ldc2_w 2986178657370058333
      // 176: lload 1
      // 177: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: ldc2_w 3736332194569293144
      // 180: lload 1
      // 181: invokedynamic k (JJ)Lcom/zelix/y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: areturn
   }

   public final boolean c(char param1, short param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 32
      // 12: lshl
      // 13: bipush 32
      // 15: lushr
      // 16: lor
      // 17: lstore 4
      // 19: ldc2_w 95349445245443223
      // 1c: lload 4
      // 1e: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 6
      // 25: getstatic com/zelix/_k7.D [I
      // 28: aload 0
      // 29: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 2c: invokevirtual com/zelix/y4.ordinal ()I
      // 2f: iaload
      // 30: aload 6
      // 32: ifnonnull 8f
      // 35: tableswitch 89 1 12 74 74 74 74 74 74 74 74 74 74 74 87
      // 74: ldc2_w 1880288240308722996
      // 77: lload 4
      // 79: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: bipush 0
      // 80: ireturn
      // 81: ldc2_w 1880288240308722996
      // 84: lload 4
      // 86: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: bipush 1
      // 8d: ireturn
      // 8e: bipush 0
      // 8f: ireturn
   }

   public boolean v(Object[] param1) {
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
      // 0c: ldc2_w 2088220457649799487
      // 0f: lload 2
      // 10: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: astore 4
      // 17: getstatic com/zelix/_k7.D [I
      // 1a: aload 0
      // 1b: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 1e: invokevirtual com/zelix/y4.ordinal ()I
      // 21: iaload
      // 22: aload 4
      // 24: ifnonnull 7d
      // 27: tableswitch 85 1 12 71 71 71 71 71 83 83 83 83 83 83 83
      // 64: ldc2_w 554020341500543132
      // 67: lload 2
      // 68: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 1
      // 6f: ireturn
      // 70: ldc2_w 554020341500543132
      // 73: lload 2
      // 74: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: bipush 0
      // 7b: ireturn
      // 7c: bipush 0
      // 7d: ireturn
   }

   public boolean P(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_o9.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 29082470051099
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w -9025279280461045894
      // 11: lload 1
      // 12: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: astore 5
      // 19: aload 0
      // 1a: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 1d: lload 3
      // 1e: invokevirtual com/zelix/vi.s (J)Z
      // 21: aload 5
      // 23: ifnonnull d9
      // 26: ifne cb
      // 29: goto 36
      // 2c: ldc2_w -7352870011800805671
      // 2f: lload 1
      // 30: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: lload 1
      // 38: lconst_0
      // 39: lcmp
      // 3a: iflt 73
      // 3d: aload 5
      // 3f: ifnonnull 73
      // 42: goto 4f
      // 45: ldc2_w -7352870011800805671
      // 48: lload 1
      // 49: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 52: getstatic com/zelix/y4.w Lcom/zelix/y4;
      // 55: if_acmpne dc
      // 58: goto 65
      // 5b: ldc2_w -7352870011800805671
      // 5e: lload 1
      // 5f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 0
      // 66: goto 73
      // 69: ldc2_w -7352870011800805671
      // 6c: lload 1
      // 6d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: getfield com/zelix/_o9.B I
      // 76: aload 5
      // 78: ifnonnull d9
      // 7b: sipush 2041
      // 7e: ldc2_w 449129949586410912
      // 81: lload 1
      // 82: lxor
      // 83: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: if_icmplt cb
      // 8b: goto 98
      // 8e: ldc2_w -7352870011800805671
      // 91: lload 1
      // 92: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: aload 0
      // 99: getfield com/zelix/_o9.B I
      // 9c: aload 5
      // 9e: ifnonnull d9
      // a1: goto ae
      // a4: ldc2_w -7352870011800805671
      // a7: lload 1
      // a8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: sipush 16796
      // b1: ldc2_w 6769566914458258319
      // b4: lload 1
      // b5: lxor
      // b6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: if_icmple dc
      // be: goto cb
      // c1: ldc2_w -7352870011800805671
      // c4: lload 1
      // c5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: athrow
      // cb: bipush 1
      // cc: goto d9
      // cf: ldc2_w -7352870011800805671
      // d2: lload 1
      // d3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8: athrow
      // d9: goto dd
      // dc: bipush 0
      // dd: istore 6
      // df: iload 6
      // e1: ireturn
   }

   public boolean I(long param1, char param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: bipush 16
      // 003: lshl
      // 004: iload 3
      // 005: i2l
      // 006: bipush 48
      // 008: lshl
      // 009: bipush 48
      // 00b: lushr
      // 00c: lor
      // 00d: lstore 5
      // 00f: lload 5
      // 011: dup2
      // 012: ldc2_w 41348852436330
      // 015: lxor
      // 016: lstore 7
      // 018: dup2
      // 019: ldc2_w 52358916322840
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 48
      // 020: lushr
      // 021: l2i
      // 022: istore 9
      // 024: dup2
      // 025: bipush 16
      // 027: lshl
      // 028: bipush 48
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 10
      // 02e: dup2
      // 02f: bipush 32
      // 031: lshl
      // 032: bipush 32
      // 034: lushr
      // 035: l2i
      // 036: istore 11
      // 038: pop2
      // 039: dup2
      // 03a: ldc2_w 102393188290291
      // 03d: lxor
      // 03e: lstore 12
      // 040: pop2
      // 041: ldc2_w -8372495720954325493
      // 044: lload 5
      // 046: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: astore 14
      // 04d: aload 0
      // 04e: iload 4
      // 050: lload 7
      // 052: invokevirtual com/zelix/_o9.X (IJ)Z
      // 055: aload 14
      // 057: ifnonnull 09e
      // 05a: ifne 09d
      // 05d: goto 06b
      // 060: ldc2_w -8033167872029452376
      // 063: lload 5
      // 065: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 0
      // 06c: iload 4
      // 06e: iload 9
      // 070: i2c
      // 071: iload 10
      // 073: i2s
      // 074: iload 11
      // 076: invokevirtual com/zelix/_o9.k (ICSI)Z
      // 079: aload 14
      // 07b: ifnonnull 0b9
      // 07e: goto 08c
      // 081: ldc2_w -8033167872029452376
      // 084: lload 5
      // 086: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: ifeq 09f
      // 08f: goto 09d
      // 092: ldc2_w -8033167872029452376
      // 095: lload 5
      // 097: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: bipush 1
      // 09e: ireturn
      // 09f: aload 0
      // 0a0: lload 12
      // 0a2: bipush 1
      // 0a3: anewarray 357
      // 0a6: dup_x2
      // 0a7: dup_x2
      // 0a8: pop
      // 0a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac: bipush 0
      // 0ad: swap
      // 0ae: aastore
      // 0af: ldc2_w -8338964566288744588
      // 0b2: lload 5
      // 0b4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: istore 15
      // 0bb: iload 15
      // 0bd: sipush 25023
      // 0c0: ldc2_w 5177930812441404100
      // 0c3: lload 5
      // 0c5: lxor
      // 0c6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: aload 14
      // 0cd: ifnonnull 13f
      // 0d0: if_icmpeq 115
      // 0d3: goto 0e1
      // 0d6: ldc2_w -8033167872029452376
      // 0d9: lload 5
      // 0db: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: iload 15
      // 0e3: aload 14
      // 0e5: ifnonnull 149
      // 0e8: goto 0f6
      // 0eb: ldc2_w -8033167872029452376
      // 0ee: lload 5
      // 0f0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: sipush 1723
      // 0f9: ldc2_w 1193441938828543437
      // 0fc: lload 5
      // 0fe: lxor
      // 0ff: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: if_icmpne 148
      // 107: goto 115
      // 10a: ldc2_w -8033167872029452376
      // 10d: lload 5
      // 10f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 0
      // 116: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 119: invokevirtual com/zelix/vi.H ()I
      // 11c: aload 14
      // 11e: ifnonnull 143
      // 121: goto 12f
      // 124: ldc2_w -8033167872029452376
      // 127: lload 5
      // 129: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: iload 4
      // 131: goto 13f
      // 134: ldc2_w -8033167872029452376
      // 137: lload 5
      // 139: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: if_icmpne 146
      // 142: bipush 1
      // 143: goto 147
      // 146: bipush 0
      // 147: ireturn
      // 148: bipush 0
      // 149: ireturn
   }

   int j(Object[] param1) {
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
      // 00c: ldc2_w 377658742224165112
      // 00f: lload 2
      // 010: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: aload 0
      // 016: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 019: invokevirtual com/zelix/vi.H ()I
      // 01c: istore 5
      // 01e: astore 4
      // 020: getstatic com/zelix/_k7.D [I
      // 023: aload 0
      // 024: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 027: invokevirtual com/zelix/y4.ordinal ()I
      // 02a: iaload
      // 02b: aload 4
      // 02d: ifnonnull 5ab
      // 030: tableswitch 1402 1 12 74 350 606 862 1118 222 734 1246 478 990 1374 1388
      // 070: ldc2_w 2195268704714299739
      // 073: lload 2
      // 074: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: iload 5
      // 07c: aload 4
      // 07e: ifnonnull 10d
      // 081: goto 08e
      // 084: ldc2_w 2195268704714299739
      // 087: lload 2
      // 088: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: lload 2
      // 08f: lconst_0
      // 090: lcmp
      // 091: ifle 103
      // 094: tableswitch 108 0 3 42 66 80 94
      // 0b4: ldc2_w 2195268704714299739
      // 0b7: lload 2
      // 0b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: sipush 28409
      // 0c1: ldc2_w 1047515120996295434
      // 0c4: lload 2
      // 0c5: lxor
      // 0c6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: ireturn
      // 0cc: ldc2_w 2195268704714299739
      // 0cf: lload 2
      // 0d0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: sipush 28771
      // 0d9: ldc2_w 9053330936957386132
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: ireturn
      // 0e4: sipush 3927
      // 0e7: ldc2_w 4303487751287259819
      // 0ea: lload 2
      // 0eb: lxor
      // 0ec: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: ireturn
      // 0f2: sipush 29570
      // 0f5: ldc2_w 2070912271092104798
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: ireturn
      // 100: sipush 6322
      // 103: ldc2_w 4132264644526953831
      // 106: lload 2
      // 107: lxor
      // 108: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: ireturn
      // 10e: iload 5
      // 110: aload 4
      // 112: ifnonnull 18d
      // 115: tableswitch 107 0 3 41 65 79 93
      // 134: ldc2_w 2195268704714299739
      // 137: lload 2
      // 138: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: sipush 13412
      // 141: ldc2_w 7290905959792736742
      // 144: lload 2
      // 145: lxor
      // 146: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: ireturn
      // 14c: ldc2_w 2195268704714299739
      // 14f: lload 2
      // 150: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: sipush 17898
      // 159: ldc2_w 4175934545341122579
      // 15c: lload 2
      // 15d: lxor
      // 15e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: ireturn
      // 164: sipush 19330
      // 167: ldc2_w 3051664811835262511
      // 16a: lload 2
      // 16b: lxor
      // 16c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: ireturn
      // 172: sipush 28464
      // 175: ldc2_w 8913179861086741169
      // 178: lload 2
      // 179: lxor
      // 17a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: ireturn
      // 180: sipush 30791
      // 183: ldc2_w 7592413956192941562
      // 186: lload 2
      // 187: lxor
      // 188: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: ireturn
      // 18e: iload 5
      // 190: aload 4
      // 192: ifnonnull 20d
      // 195: tableswitch 107 0 3 41 65 79 93
      // 1b4: ldc2_w 2195268704714299739
      // 1b7: lload 2
      // 1b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: sipush 28456
      // 1c1: ldc2_w 9176343028939236040
      // 1c4: lload 2
      // 1c5: lxor
      // 1c6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: ireturn
      // 1cc: ldc2_w 2195268704714299739
      // 1cf: lload 2
      // 1d0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: sipush 26341
      // 1d9: ldc2_w 8004219804357995347
      // 1dc: lload 2
      // 1dd: lxor
      // 1de: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: ireturn
      // 1e4: sipush 19349
      // 1e7: ldc2_w 8303304146673862147
      // 1ea: lload 2
      // 1eb: lxor
      // 1ec: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: ireturn
      // 1f2: sipush 8714
      // 1f5: ldc2_w 8719389048482394108
      // 1f8: lload 2
      // 1f9: lxor
      // 1fa: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: ireturn
      // 200: sipush 21505
      // 203: ldc2_w 4749344317470054801
      // 206: lload 2
      // 207: lxor
      // 208: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: ireturn
      // 20e: iload 5
      // 210: aload 4
      // 212: ifnonnull 28d
      // 215: tableswitch 107 0 3 41 65 79 93
      // 234: ldc2_w 2195268704714299739
      // 237: lload 2
      // 238: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: sipush 10240
      // 241: ldc2_w 2769183967990212084
      // 244: lload 2
      // 245: lxor
      // 246: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: ireturn
      // 24c: ldc2_w 2195268704714299739
      // 24f: lload 2
      // 250: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: sipush 6927
      // 259: ldc2_w 747607816952239845
      // 25c: lload 2
      // 25d: lxor
      // 25e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: ireturn
      // 264: sipush 14836
      // 267: ldc2_w 318771502621389842
      // 26a: lload 2
      // 26b: lxor
      // 26c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: ireturn
      // 272: sipush 18650
      // 275: ldc2_w 1947942280699413869
      // 278: lload 2
      // 279: lxor
      // 27a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: ireturn
      // 280: sipush 23335
      // 283: ldc2_w 6903196067427587755
      // 286: lload 2
      // 287: lxor
      // 288: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: ireturn
      // 28e: iload 5
      // 290: aload 4
      // 292: ifnonnull 30d
      // 295: tableswitch 107 0 3 41 65 79 93
      // 2b4: ldc2_w 2195268704714299739
      // 2b7: lload 2
      // 2b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: sipush 27978
      // 2c1: ldc2_w 183550955129807016
      // 2c4: lload 2
      // 2c5: lxor
      // 2c6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: ireturn
      // 2cc: ldc2_w 2195268704714299739
      // 2cf: lload 2
      // 2d0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: athrow
      // 2d6: sipush 18984
      // 2d9: ldc2_w 1306739786662119296
      // 2dc: lload 2
      // 2dd: lxor
      // 2de: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: ireturn
      // 2e4: sipush 15526
      // 2e7: ldc2_w 8034810482397671763
      // 2ea: lload 2
      // 2eb: lxor
      // 2ec: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: ireturn
      // 2f2: sipush 8499
      // 2f5: ldc2_w 7991634066519190728
      // 2f8: lload 2
      // 2f9: lxor
      // 2fa: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: ireturn
      // 300: sipush 10778
      // 303: ldc2_w 8135253042836072392
      // 306: lload 2
      // 307: lxor
      // 308: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: ireturn
      // 30e: iload 5
      // 310: aload 4
      // 312: ifnonnull 38d
      // 315: tableswitch 107 0 3 41 65 79 93
      // 334: ldc2_w 2195268704714299739
      // 337: lload 2
      // 338: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: athrow
      // 33e: sipush 26653
      // 341: ldc2_w 2071848577197516284
      // 344: lload 2
      // 345: lxor
      // 346: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: ireturn
      // 34c: ldc2_w 2195268704714299739
      // 34f: lload 2
      // 350: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: athrow
      // 356: sipush 7725
      // 359: ldc2_w 3726319884219077629
      // 35c: lload 2
      // 35d: lxor
      // 35e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 363: ireturn
      // 364: sipush 10970
      // 367: ldc2_w 19552504915748662
      // 36a: lload 2
      // 36b: lxor
      // 36c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: ireturn
      // 372: sipush 30489
      // 375: ldc2_w 4167944279815076533
      // 378: lload 2
      // 379: lxor
      // 37a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37f: ireturn
      // 380: sipush 17128
      // 383: ldc2_w 5021431045129670405
      // 386: lload 2
      // 387: lxor
      // 388: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38d: ireturn
      // 38e: iload 5
      // 390: aload 4
      // 392: ifnonnull 40d
      // 395: tableswitch 107 0 3 41 65 79 93
      // 3b4: ldc2_w 2195268704714299739
      // 3b7: lload 2
      // 3b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bd: athrow
      // 3be: sipush 8148
      // 3c1: ldc2_w 353318444511580683
      // 3c4: lload 2
      // 3c5: lxor
      // 3c6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: ireturn
      // 3cc: ldc2_w 2195268704714299739
      // 3cf: lload 2
      // 3d0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d5: athrow
      // 3d6: sipush 9645
      // 3d9: ldc2_w 7621910271596390428
      // 3dc: lload 2
      // 3dd: lxor
      // 3de: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: ireturn
      // 3e4: sipush 31794
      // 3e7: ldc2_w 3094344024780485073
      // 3ea: lload 2
      // 3eb: lxor
      // 3ec: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f1: ireturn
      // 3f2: sipush 6399
      // 3f5: ldc2_w 621051538794894694
      // 3f8: lload 2
      // 3f9: lxor
      // 3fa: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ff: ireturn
      // 400: sipush 19708
      // 403: ldc2_w 915498376565129519
      // 406: lload 2
      // 407: lxor
      // 408: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40d: ireturn
      // 40e: iload 5
      // 410: aload 4
      // 412: ifnonnull 48d
      // 415: tableswitch 107 0 3 41 65 79 93
      // 434: ldc2_w 2195268704714299739
      // 437: lload 2
      // 438: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43d: athrow
      // 43e: sipush 27345
      // 441: ldc2_w 4705011399994287935
      // 444: lload 2
      // 445: lxor
      // 446: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: ireturn
      // 44c: ldc2_w 2195268704714299739
      // 44f: lload 2
      // 450: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: athrow
      // 456: sipush 2299
      // 459: ldc2_w 418216953685525761
      // 45c: lload 2
      // 45d: lxor
      // 45e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 463: ireturn
      // 464: sipush 21598
      // 467: ldc2_w 8139333926937893329
      // 46a: lload 2
      // 46b: lxor
      // 46c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 471: ireturn
      // 472: sipush 29282
      // 475: ldc2_w 3232581270023716794
      // 478: lload 2
      // 479: lxor
      // 47a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47f: ireturn
      // 480: sipush 15230
      // 483: ldc2_w 4756329066173069035
      // 486: lload 2
      // 487: lxor
      // 488: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48d: ireturn
      // 48e: iload 5
      // 490: aload 4
      // 492: ifnonnull 50d
      // 495: tableswitch 107 0 3 41 65 79 93
      // 4b4: ldc2_w 2195268704714299739
      // 4b7: lload 2
      // 4b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bd: athrow
      // 4be: sipush 3371
      // 4c1: ldc2_w 2950415062856876228
      // 4c4: lload 2
      // 4c5: lxor
      // 4c6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cb: ireturn
      // 4cc: ldc2_w 2195268704714299739
      // 4cf: lload 2
      // 4d0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d5: athrow
      // 4d6: sipush 2665
      // 4d9: ldc2_w 4366591891330353101
      // 4dc: lload 2
      // 4dd: lxor
      // 4de: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e3: ireturn
      // 4e4: sipush 22058
      // 4e7: ldc2_w 7418455645837499264
      // 4ea: lload 2
      // 4eb: lxor
      // 4ec: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f1: ireturn
      // 4f2: sipush 10740
      // 4f5: ldc2_w 4304842473841058858
      // 4f8: lload 2
      // 4f9: lxor
      // 4fa: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ff: ireturn
      // 500: sipush 15816
      // 503: ldc2_w 2465321521765249130
      // 506: lload 2
      // 507: lxor
      // 508: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50d: ireturn
      // 50e: iload 5
      // 510: aload 4
      // 512: ifnonnull 58d
      // 515: tableswitch 107 0 3 41 65 79 93
      // 534: ldc2_w 2195268704714299739
      // 537: lload 2
      // 538: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53d: athrow
      // 53e: sipush 9176
      // 541: ldc2_w 6999841545579916927
      // 544: lload 2
      // 545: lxor
      // 546: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54b: ireturn
      // 54c: ldc2_w 2195268704714299739
      // 54f: lload 2
      // 550: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 555: athrow
      // 556: sipush 28662
      // 559: ldc2_w 7090188183296942624
      // 55c: lload 2
      // 55d: lxor
      // 55e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 563: ireturn
      // 564: sipush 31241
      // 567: ldc2_w 418392030376277915
      // 56a: lload 2
      // 56b: lxor
      // 56c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 571: ireturn
      // 572: sipush 20441
      // 575: ldc2_w 5977616561250304512
      // 578: lload 2
      // 579: lxor
      // 57a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57f: ireturn
      // 580: sipush 2779
      // 583: ldc2_w 1482838571960616814
      // 586: lload 2
      // 587: lxor
      // 588: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58d: ireturn
      // 58e: sipush 25023
      // 591: ldc2_w 5177988948101901367
      // 594: lload 2
      // 595: lxor
      // 596: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59b: ireturn
      // 59c: sipush 1723
      // 59f: ldc2_w 1193357412706306878
      // 5a2: lload 2
      // 5a3: lxor
      // 5a4: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a9: ireturn
      // 5aa: bipush -1
      // 5ab: ireturn
   }

   public static _o9 b(Object[] param0) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/_xx
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 1
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast com/zelix/t7
      // 023: astore 4
      // 025: pop
      // 026: getstatic com/zelix/_o9.b J
      // 029: lload 1
      // 02a: lxor
      // 02b: lstore 1
      // 02c: lload 1
      // 02d: dup2
      // 02e: ldc2_w 113875230274998
      // 031: lxor
      // 032: lstore 6
      // 034: dup2
      // 035: ldc2_w 83731092159337
      // 038: lxor
      // 039: lstore 8
      // 03b: pop2
      // 03c: ldc2_w -6523027919954102084
      // 03f: lload 1
      // 040: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: astore 10
      // 047: iload 5
      // 049: aload 10
      // 04b: ifnonnull 08f
      // 04e: sipush 23824
      // 051: ldc2_w 7972617590973608181
      // 054: lload 1
      // 055: lxor
      // 056: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: if_icmpne 080
      // 05e: goto 06b
      // 061: ldc2_w -4741424768358631137
      // 064: lload 1
      // 065: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 3
      // 06c: invokevirtual com/zelix/_xx.read ()I
      // 06f: istore 12
      // 071: iload 12
      // 073: istore 11
      // 075: lload 1
      // 076: lconst_0
      // 077: lcmp
      // 078: ifle 091
      // 07b: aload 10
      // 07d: ifnull 091
      // 080: iload 5
      // 082: goto 08f
      // 085: ldc2_w -4741424768358631137
      // 088: lload 1
      // 089: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: istore 11
      // 091: iload 11
      // 093: aload 10
      // 095: ifnonnull 3ac
      // 098: tableswitch 774 21 169 678 678 678 678 678 622 636 650 664 622 636 650 664 622 636 650 664 622 636 650 664 622 636 650 664 774 774 774 774 774 774 774 774 678 678 678 678 678 622 636 650 664 622 636 650 664 622 636 650 664 622 636 650 664 622 636 650 664 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 678 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 774 678
      // 2fc: ldc2_w -4741424768358631137
      // 2ff: lload 1
      // 300: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: athrow
      // 306: bipush 0
      // 307: istore 12
      // 309: lload 1
      // 30a: lconst_0
      // 30b: lcmp
      // 30c: ifle 3ae
      // 30f: aload 10
      // 311: ifnull 3ae
      // 314: bipush 1
      // 315: istore 12
      // 317: lload 1
      // 318: lconst_0
      // 319: lcmp
      // 31a: ifle 3ae
      // 31d: aload 10
      // 31f: ifnull 3ae
      // 322: bipush 2
      // 323: istore 12
      // 325: lload 1
      // 326: lconst_0
      // 327: lcmp
      // 328: ifle 3ae
      // 32b: aload 10
      // 32d: ifnull 3ae
      // 330: bipush 3
      // 331: istore 12
      // 333: lload 1
      // 334: lconst_0
      // 335: lcmp
      // 336: ifle 3ae
      // 339: aload 10
      // 33b: ifnull 3ae
      // 33e: iload 5
      // 340: aload 10
      // 342: ifnonnull 391
      // 345: goto 352
      // 348: ldc2_w -4741424768358631137
      // 34b: lload 1
      // 34c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: athrow
      // 352: sipush 23824
      // 355: ldc2_w 7972617590973608181
      // 358: lload 1
      // 359: lxor
      // 35a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: if_icmpne 380
      // 362: goto 36f
      // 365: ldc2_w -4741424768358631137
      // 368: lload 1
      // 369: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36e: athrow
      // 36f: aload 3
      // 370: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 373: istore 12
      // 375: lload 1
      // 376: lconst_0
      // 377: lcmp
      // 378: ifle 3ae
      // 37b: aload 10
      // 37d: ifnull 3ae
      // 380: aload 3
      // 381: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 384: goto 391
      // 387: ldc2_w -4741424768358631137
      // 38a: lload 1
      // 38b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 390: athrow
      // 391: istore 12
      // 393: lload 1
      // 394: lconst_0
      // 395: lcmp
      // 396: iflt 3ae
      // 399: aload 10
      // 39b: ifnull 3ae
      // 39e: bipush -1
      // 39f: goto 3ac
      // 3a2: ldc2_w -4741424768358631137
      // 3a5: lload 1
      // 3a6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ab: athrow
      // 3ac: istore 12
      // 3ae: iload 12
      // 3b0: bipush 3
      // 3b1: aload 10
      // 3b3: lload 1
      // 3b4: lconst_0
      // 3b5: lcmp
      // 3b6: iflt 3ea
      // 3b9: ifnonnull 3e8
      // 3bc: if_icmpgt 5f7
      // 3bf: goto 3cc
      // 3c2: ldc2_w -4741424768358631137
      // 3c5: lload 1
      // 3c6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: iload 11
      // 3ce: sipush 32304
      // 3d1: ldc2_w 1984430680600941536
      // 3d4: lload 1
      // 3d5: lxor
      // 3d6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3db: goto 3e8
      // 3de: ldc2_w -4741424768358631137
      // 3e1: lload 1
      // 3e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e7: athrow
      // 3e8: aload 10
      // 3ea: lload 1
      // 3eb: lconst_0
      // 3ec: lcmp
      // 3ed: iflt 421
      // 3f0: ifnonnull 41f
      // 3f3: if_icmpeq 5da
      // 3f6: goto 403
      // 3f9: ldc2_w -4741424768358631137
      // 3fc: lload 1
      // 3fd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: athrow
      // 403: iload 11
      // 405: sipush 32563
      // 408: ldc2_w 2733327252786713235
      // 40b: lload 1
      // 40c: lxor
      // 40d: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 412: goto 41f
      // 415: ldc2_w -4741424768358631137
      // 418: lload 1
      // 419: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41e: athrow
      // 41f: aload 10
      // 421: lload 1
      // 422: lconst_0
      // 423: lcmp
      // 424: iflt 458
      // 427: ifnonnull 456
      // 42a: if_icmpeq 5da
      // 42d: goto 43a
      // 430: ldc2_w -4741424768358631137
      // 433: lload 1
      // 434: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: athrow
      // 43a: iload 11
      // 43c: sipush 1645
      // 43f: ldc2_w 7414963763068791806
      // 442: lload 1
      // 443: lxor
      // 444: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 449: goto 456
      // 44c: ldc2_w -4741424768358631137
      // 44f: lload 1
      // 450: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: athrow
      // 456: aload 10
      // 458: lload 1
      // 459: lconst_0
      // 45a: lcmp
      // 45b: ifle 48f
      // 45e: ifnonnull 48d
      // 461: if_icmpeq 5da
      // 464: goto 471
      // 467: ldc2_w -4741424768358631137
      // 46a: lload 1
      // 46b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 470: athrow
      // 471: iload 11
      // 473: sipush 23092
      // 476: ldc2_w 951718444813694955
      // 479: lload 1
      // 47a: lxor
      // 47b: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 480: goto 48d
      // 483: ldc2_w -4741424768358631137
      // 486: lload 1
      // 487: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48c: athrow
      // 48d: aload 10
      // 48f: lload 1
      // 490: lconst_0
      // 491: lcmp
      // 492: ifle 4c6
      // 495: ifnonnull 4c4
      // 498: if_icmpeq 5da
      // 49b: goto 4a8
      // 49e: ldc2_w -4741424768358631137
      // 4a1: lload 1
      // 4a2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a7: athrow
      // 4a8: iload 11
      // 4aa: sipush 27948
      // 4ad: ldc2_w 6074139146943037659
      // 4b0: lload 1
      // 4b1: lxor
      // 4b2: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b7: goto 4c4
      // 4ba: ldc2_w -4741424768358631137
      // 4bd: lload 1
      // 4be: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c3: athrow
      // 4c4: aload 10
      // 4c6: lload 1
      // 4c7: lconst_0
      // 4c8: lcmp
      // 4c9: iflt 4fd
      // 4cc: ifnonnull 4fb
      // 4cf: if_icmpeq 5da
      // 4d2: goto 4df
      // 4d5: ldc2_w -4741424768358631137
      // 4d8: lload 1
      // 4d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: athrow
      // 4df: iload 11
      // 4e1: sipush 16106
      // 4e4: ldc2_w 4311448548846883601
      // 4e7: lload 1
      // 4e8: lxor
      // 4e9: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ee: goto 4fb
      // 4f1: ldc2_w -4741424768358631137
      // 4f4: lload 1
      // 4f5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fa: athrow
      // 4fb: aload 10
      // 4fd: lload 1
      // 4fe: lconst_0
      // 4ff: lcmp
      // 500: ifle 534
      // 503: ifnonnull 532
      // 506: if_icmpeq 5da
      // 509: goto 516
      // 50c: ldc2_w -4741424768358631137
      // 50f: lload 1
      // 510: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 515: athrow
      // 516: iload 11
      // 518: sipush 9728
      // 51b: ldc2_w 4523837293917883384
      // 51e: lload 1
      // 51f: lxor
      // 520: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 525: goto 532
      // 528: ldc2_w -4741424768358631137
      // 52b: lload 1
      // 52c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 531: athrow
      // 532: aload 10
      // 534: lload 1
      // 535: lconst_0
      // 536: lcmp
      // 537: ifle 56b
      // 53a: ifnonnull 569
      // 53d: if_icmpeq 5da
      // 540: goto 54d
      // 543: ldc2_w -4741424768358631137
      // 546: lload 1
      // 547: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54c: athrow
      // 54d: iload 11
      // 54f: sipush 17668
      // 552: ldc2_w 3655530509778594015
      // 555: lload 1
      // 556: lxor
      // 557: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55c: goto 569
      // 55f: ldc2_w -4741424768358631137
      // 562: lload 1
      // 563: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 568: athrow
      // 569: aload 10
      // 56b: lload 1
      // 56c: lconst_0
      // 56d: lcmp
      // 56e: ifle 5a8
      // 571: ifnonnull 5a0
      // 574: if_icmpeq 5da
      // 577: goto 584
      // 57a: ldc2_w -4741424768358631137
      // 57d: lload 1
      // 57e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 583: athrow
      // 584: iload 11
      // 586: sipush 28261
      // 589: ldc2_w 8311361389861438393
      // 58c: lload 1
      // 58d: lxor
      // 58e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 593: goto 5a0
      // 596: ldc2_w -4741424768358631137
      // 599: lload 1
      // 59a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59f: athrow
      // 5a0: lload 1
      // 5a1: lconst_0
      // 5a2: lcmp
      // 5a3: ifle 5d7
      // 5a6: aload 10
      // 5a8: ifnonnull 5d7
      // 5ab: if_icmpeq 5da
      // 5ae: goto 5bb
      // 5b1: ldc2_w -4741424768358631137
      // 5b4: lload 1
      // 5b5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ba: athrow
      // 5bb: iload 11
      // 5bd: sipush 9100
      // 5c0: ldc2_w 7589550826823831147
      // 5c3: lload 1
      // 5c4: lxor
      // 5c5: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ca: goto 5d7
      // 5cd: ldc2_w -4741424768358631137
      // 5d0: lload 1
      // 5d1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d6: athrow
      // 5d7: if_icmpne 5f7
      // 5da: new com/zelix/_o7
      // 5dd: dup
      // 5de: iload 5
      // 5e0: iload 11
      // 5e2: lload 6
      // 5e4: iload 12
      // 5e6: aload 3
      // 5e7: aload 4
      // 5e9: invokespecial com/zelix/_o7.<init> (IIJILcom/zelix/_xx;Lcom/zelix/t7;)V
      // 5ec: areturn
      // 5ed: ldc2_w -4741424768358631137
      // 5f0: lload 1
      // 5f1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f6: athrow
      // 5f7: new com/zelix/_o9
      // 5fa: dup
      // 5fb: iload 5
      // 5fd: iload 11
      // 5ff: iload 12
      // 601: lload 8
      // 603: aload 3
      // 604: aload 4
      // 606: invokespecial com/zelix/_o9.<init> (IIIJLcom/zelix/_xx;Lcom/zelix/t7;)V
      // 609: areturn
   }

   public static _o9 T(Object[] var0) {
      String var2 = (String)var0[0];
      boolean var1 = (Boolean)var0[1];
      long var3 = (Long)var0[2];
      vi var5 = (vi)var0[3];
      var3 = b ^ var3;
      long var6 = var3 ^ 102690062725969L;
      long var8 = var3 ^ 3834734612325L;
      Object[] var10004 = new Object[]{null, null, var8};
      var10004[1] = var1;
      var10004[0] = var2;
      y4 var10 = x44.a<"w">(var10004, 2990747106246253355L, var3);
      return new _o9(var5, var6, var10);
   }

   public String q(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 71039313027844
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 11196460046908
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 87630082345006
      // 01f: lxor
      // 020: lstore 8
      // 022: pop2
      // 023: new java/lang/StringBuilder
      // 026: dup
      // 027: invokespecial java/lang/StringBuilder.<init> ()V
      // 02a: astore 11
      // 02c: aload 11
      // 02e: aload 0
      // 02f: lload 4
      // 031: bipush 1
      // 032: anewarray 357
      // 035: dup_x2
      // 036: dup_x2
      // 037: pop
      // 038: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03b: bipush 0
      // 03c: swap
      // 03d: aastore
      // 03e: ldc2_w 1042377796663484199
      // 041: lload 2
      // 042: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04a: pop
      // 04b: ldc2_w 942370607041450198
      // 04e: lload 2
      // 04f: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 11
      // 056: sipush 19349
      // 059: ldc2_w 8303244159652204077
      // 05c: lload 2
      // 05d: lxor
      // 05e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 066: pop
      // 067: astore 10
      // 069: aload 0
      // 06a: lload 8
      // 06c: bipush 1
      // 06d: anewarray 357
      // 070: dup_x2
      // 071: dup_x2
      // 072: pop
      // 073: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 076: bipush 0
      // 077: swap
      // 078: aastore
      // 079: ldc2_w 764232574313281961
      // 07c: lload 2
      // 07d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: istore 12
      // 084: aload 0
      // 085: lload 6
      // 087: invokevirtual com/zelix/_o9.P (J)Z
      // 08a: aload 10
      // 08c: ifnonnull 0f8
      // 08f: ifeq 0d1
      // 092: goto 09f
      // 095: ldc2_w 1610431537586180469
      // 098: lload 2
      // 099: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: aload 11
      // 0a1: ldc2_w 1492038898102481394
      // 0a4: lload 2
      // 0a5: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 12
      // 0ac: aaload
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b0: pop
      // 0b1: aload 11
      // 0b3: sipush 19349
      // 0b6: ldc2_w 8303244159652204077
      // 0b9: lload 2
      // 0ba: lxor
      // 0bb: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c3: pop
      // 0c4: goto 0d1
      // 0c7: ldc2_w 1610431537586180469
      // 0ca: lload 2
      // 0cb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: lload 2
      // 0d2: lconst_0
      // 0d3: lcmp
      // 0d4: iflt 0e9
      // 0d7: aload 11
      // 0d9: aload 0
      // 0da: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 0dd: invokevirtual com/zelix/vi.H ()I
      // 0e0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e3: aload 10
      // 0e5: ifnonnull 134
      // 0e8: pop
      // 0e9: iload 12
      // 0eb: goto 0f8
      // 0ee: ldc2_w 1610431537586180469
      // 0f1: lload 2
      // 0f2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: sipush 25023
      // 0fb: ldc2_w 5177914927744885785
      // 0fe: lload 2
      // 0ff: lxor
      // 100: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: if_icmpne 132
      // 108: aload 11
      // 10a: sipush 19349
      // 10d: ldc2_w 8303244159652204077
      // 110: lload 2
      // 111: lxor
      // 112: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 11a: pop
      // 11b: aload 11
      // 11d: aload 0
      // 11e: getfield com/zelix/_o9.B I
      // 121: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 124: pop
      // 125: goto 132
      // 128: ldc2_w 1610431537586180469
      // 12b: lload 2
      // 12c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 11
      // 134: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 137: areturn
   }

   public boolean k(int param1, char param2, short param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 32
      // 13: lshl
      // 14: bipush 32
      // 16: lushr
      // 17: lor
      // 18: lstore 5
      // 1a: ldc2_w 4455964516866433043
      // 1d: lload 5
      // 1f: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 7
      // 26: getstatic com/zelix/_k7.D [I
      // 29: aload 0
      // 2a: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 2d: invokevirtual com/zelix/y4.ordinal ()I
      // 30: iaload
      // 31: aload 7
      // 33: ifnonnull c2
      // 36: tableswitch 139 1 12 73 73 73 73 73 137 137 137 137 137 137 137
      // 74: ldc2_w 2782199820650095024
      // 77: lload 5
      // 79: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 83: invokevirtual com/zelix/vi.H ()I
      // 86: aload 7
      // 88: ifnonnull ba
      // 8b: goto 99
      // 8e: ldc2_w 2782199820650095024
      // 91: lload 5
      // 93: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: iload 1
      // 9a: if_icmpne bd
      // 9d: goto ab
      // a0: ldc2_w 2782199820650095024
      // a3: lload 5
      // a5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: bipush 1
      // ac: goto ba
      // af: ldc2_w 2782199820650095024
      // b2: lload 5
      // b4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: athrow
      // ba: goto be
      // bd: bipush 0
      // be: ireturn
      // bf: bipush 0
      // c0: ireturn
      // c1: bipush 0
      // c2: ireturn
   }

   public final boolean V(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 8624668665552104053
      // 03: lload 1
      // 04: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: astore 3
      // 0a: getstatic com/zelix/_k7.D [I
      // 0d: aload 0
      // 0e: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 11: invokevirtual com/zelix/y4.ordinal ()I
      // 14: iaload
      // 15: aload 3
      // 16: ifnonnull 71
      // 19: tableswitch 87 1 12 85 85 85 85 85 73 73 73 73 73 85 85
      // 58: ldc2_w 7852700591841897430
      // 5b: lload 1
      // 5c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush 1
      // 63: ireturn
      // 64: ldc2_w 7852700591841897430
      // 67: lload 1
      // 68: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 0
      // 6f: ireturn
      // 70: bipush 0
      // 71: ireturn
   }

   private _kz a(char param1, int param2, n[] param3, n[] param4, int param5, int param6, n param7, p5 param8, Set param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 5
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 6
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/_o9.b J
      // 01c: lxor
      // 01d: lstore 10
      // 01f: lload 10
      // 021: dup2
      // 022: ldc2_w 112202262852513
      // 025: lxor
      // 026: lstore 12
      // 028: dup2
      // 029: ldc2_w 52407463742802
      // 02c: lxor
      // 02d: lstore 14
      // 02f: pop2
      // 030: ldc2_w -6508550763683432343
      // 033: lload 10
      // 035: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: aload 0
      // 03b: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 03e: invokevirtual com/zelix/vi.H ()I
      // 041: istore 17
      // 043: astore 16
      // 045: iload 2
      // 046: bipush 1
      // 047: isub
      // 048: lload 12
      // 04a: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 04d: astore 18
      // 04f: aload 3
      // 050: bipush 0
      // 051: aload 18
      // 053: bipush 0
      // 054: iload 2
      // 055: bipush 1
      // 056: isub
      // 057: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 05a: aload 4
      // 05c: arraylength
      // 05d: istore 19
      // 05f: iload 19
      // 061: lload 12
      // 063: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 066: astore 20
      // 068: aload 4
      // 06a: bipush 0
      // 06b: aload 20
      // 06d: bipush 0
      // 06e: iload 19
      // 070: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 073: aload 20
      // 075: iload 17
      // 077: aaload
      // 078: aload 16
      // 07a: ifnonnull 121
      // 07d: getstatic com/zelix/n.l Lcom/zelix/n;
      // 080: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 083: ifeq 113
      // 086: goto 094
      // 089: ldc2_w -4690951521144292918
      // 08c: lload 10
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 20
      // 096: iload 17
      // 098: bipush 1
      // 099: isub
      // 09a: aload 16
      // 09c: ifnonnull 10f
      // 09f: goto 0ad
      // 0a2: ldc2_w -4690951521144292918
      // 0a5: lload 10
      // 0a7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: iload 5
      // 0af: iflt 101
      // 0b2: aaload
      // 0b3: getstatic com/zelix/n.D Lcom/zelix/n;
      // 0b6: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 0b9: ifne 0fb
      // 0bc: goto 0ca
      // 0bf: ldc2_w -4690951521144292918
      // 0c2: lload 10
      // 0c4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 20
      // 0cc: iload 17
      // 0ce: bipush 1
      // 0cf: isub
      // 0d0: aaload
      // 0d1: aload 16
      // 0d3: ifnonnull 121
      // 0d6: goto 0e4
      // 0d9: ldc2_w -4690951521144292918
      // 0dc: lload 10
      // 0de: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: getstatic com/zelix/n.c Lcom/zelix/n;
      // 0e7: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 0ea: ifeq 113
      // 0ed: goto 0fb
      // 0f0: ldc2_w -4690951521144292918
      // 0f3: lload 10
      // 0f5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 20
      // 0fd: iload 17
      // 0ff: bipush 1
      // 100: isub
      // 101: goto 10f
      // 104: ldc2_w -4690951521144292918
      // 107: lload 10
      // 109: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 112: aastore
      // 113: aload 20
      // 115: iload 17
      // 117: aload 7
      // 119: aastore
      // 11a: aload 20
      // 11c: iload 17
      // 11e: bipush 1
      // 11f: iadd
      // 120: aaload
      // 121: astore 21
      // 123: aload 20
      // 125: iload 17
      // 127: bipush 1
      // 128: iadd
      // 129: getstatic com/zelix/n.l Lcom/zelix/n;
      // 12c: aastore
      // 12d: iload 1
      // 12e: iflt 180
      // 131: aload 16
      // 133: ifnonnull 180
      // 136: aload 21
      // 138: getstatic com/zelix/n.D Lcom/zelix/n;
      // 13b: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 13e: ifne 168
      // 141: goto 14f
      // 144: ldc2_w -4690951521144292918
      // 147: lload 10
      // 149: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 21
      // 151: getstatic com/zelix/n.c Lcom/zelix/n;
      // 154: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 157: ifeq 1a1
      // 15a: goto 168
      // 15d: ldc2_w -4690951521144292918
      // 160: lload 10
      // 162: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 20
      // 16a: iload 17
      // 16c: bipush 2
      // 16d: iadd
      // 16e: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 171: aastore
      // 172: goto 180
      // 175: ldc2_w -4690951521144292918
      // 178: lload 10
      // 17a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: aload 8
      // 182: aload 16
      // 184: ifnonnull 19a
      // 187: ifnull 1a1
      // 18a: goto 198
      // 18d: ldc2_w -4690951521144292918
      // 190: lload 10
      // 192: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: aload 8
      // 19a: iload 17
      // 19c: bipush 2
      // 19d: iadd
      // 19e: invokevirtual com/zelix/p5.set (I)V
      // 1a1: new com/zelix/_kz
      // 1a4: dup
      // 1a5: aload 18
      // 1a7: aload 20
      // 1a9: lload 14
      // 1ab: aload 8
      // 1ad: aload 9
      // 1af: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 1b2: areturn
   }

   public y4 b(Object[] var1) {
      return this.O;
   }

   public int d(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 120124498042997
      // 005: lxor
      // 006: lstore 3
      // 007: dup2
      // 008: ldc2_w 44928526774887
      // 00b: lxor
      // 00c: lstore 5
      // 00e: pop2
      // 00f: ldc2_w -623011339996534113
      // 012: lload 1
      // 013: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018: bipush 0
      // 019: istore 8
      // 01b: astore 7
      // 01d: aload 0
      // 01e: lload 5
      // 020: bipush 1
      // 021: anewarray 357
      // 024: dup_x2
      // 025: dup_x2
      // 026: pop
      // 027: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 02a: bipush 0
      // 02b: swap
      // 02c: aastore
      // 02d: ldc2_w -1093673133409877024
      // 030: lload 1
      // 031: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: istore 9
      // 038: iload 9
      // 03a: aload 7
      // 03c: ifnonnull 328
      // 03f: tableswitch 743 21 169 633 633 633 633 633 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 743 743 743 743 743 743 743 743 633 633 633 633 633 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 619 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 692 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 743 633
      // 2a0: ldc2_w -1436646506237531332
      // 2a3: lload 1
      // 2a4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: athrow
      // 2aa: bipush 1
      // 2ab: istore 8
      // 2ad: lload 1
      // 2ae: lconst_0
      // 2af: lcmp
      // 2b0: iflt 2b8
      // 2b3: aload 7
      // 2b5: ifnull 326
      // 2b8: bipush 2
      // 2b9: aload 0
      // 2ba: lload 3
      // 2bb: invokevirtual com/zelix/_o9.P (J)Z
      // 2be: aload 7
      // 2c0: ifnonnull 2e1
      // 2c3: goto 2d0
      // 2c6: ldc2_w -1436646506237531332
      // 2c9: lload 1
      // 2ca: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: ifeq 2e4
      // 2d3: goto 2e0
      // 2d6: ldc2_w -1436646506237531332
      // 2d9: lload 1
      // 2da: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: athrow
      // 2e0: bipush 2
      // 2e1: goto 2e5
      // 2e4: bipush 0
      // 2e5: iadd
      // 2e6: istore 8
      // 2e8: lload 1
      // 2e9: lconst_0
      // 2ea: lcmp
      // 2eb: ifle 2f3
      // 2ee: aload 7
      // 2f0: ifnull 326
      // 2f3: bipush 3
      // 2f4: aload 0
      // 2f5: lload 3
      // 2f6: invokevirtual com/zelix/_o9.P (J)Z
      // 2f9: aload 7
      // 2fb: ifnonnull 31c
      // 2fe: goto 30b
      // 301: ldc2_w -1436646506237531332
      // 304: lload 1
      // 305: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: athrow
      // 30b: ifeq 31f
      // 30e: goto 31b
      // 311: ldc2_w -1436646506237531332
      // 314: lload 1
      // 315: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: athrow
      // 31b: bipush 3
      // 31c: goto 320
      // 31f: bipush 0
      // 320: iadd
      // 321: istore 8
      // 323: goto 326
      // 326: iload 8
      // 328: ireturn
   }

   public int W(Object[] var1) {
      return this.B;
   }

   public int l() {
      return super.l();
   }

   public final boolean N(int param1, int param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 8037225787695755852
      // 03: lload 3
      // 04: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: astore 5
      // 0b: getstatic com/zelix/_k7.D [I
      // 0e: aload 0
      // 0f: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 12: invokevirtual com/zelix/y4.ordinal ()I
      // 15: iaload
      // 16: aload 5
      // 18: ifnonnull 99
      // 1b: tableswitch 125 1 12 71 71 71 71 71 83 83 83 83 83 71 71
      // 58: ldc2_w 8413684685655667695
      // 5b: lload 3
      // 5c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
      // 64: ldc2_w 8413684685655667695
      // 67: lload 3
      // 68: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: iload 1
      // 6f: aload 5
      // 71: ifnonnull 93
      // 74: iload 2
      // 75: if_icmplt 96
      // 78: goto 85
      // 7b: ldc2_w 8413684685655667695
      // 7e: lload 3
      // 7f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: bipush 1
      // 86: goto 93
      // 89: ldc2_w 8413684685655667695
      // 8c: lload 3
      // 8d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: goto 97
      // 96: bipush 0
      // 97: ireturn
      // 98: bipush 0
      // 99: ireturn
   }

   public _o9(int var1, y4 var2, t7 var3, long var4, int var6) {
      var4 = b ^ var4;
      long var7 = var4 ^ 122971089409587L;
      this(var1, var2, var7, var3, 0, var6);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public y4 F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;

      try {
         switch (_k7.D[this.O.ordinal()]) {
            case 6:
               return x44.a<"k">(-2798631464637824269L, var2);
            case 7:
               return x44.a<"k">(-4035876960180032123L, var2);
            case 8:
               return y4.m;
            case 9:
               return y4.u;
            case 10:
               return x44.a<"k">(-2430399977886354884L, var2);
            default:
               return null;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, -2656779203934102515L, var2);
      }
   }

   public _kz M(_kz param1, long param2, boolean param4, boolean param5, _fm param6, String param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: dup2
      // 002: ldc2_w 32610570959058
      // 005: lxor
      // 006: lstore 8
      // 008: dup2
      // 009: ldc2_w 1691382610792
      // 00c: lxor
      // 00d: lstore 10
      // 00f: dup2
      // 010: ldc2_w 118237195067467
      // 013: lxor
      // 014: lstore 12
      // 016: dup2
      // 017: ldc2_w 76765594929621
      // 01a: lxor
      // 01b: lstore 14
      // 01d: dup2
      // 01e: ldc2_w 64832415286906
      // 021: lxor
      // 022: dup2
      // 023: bipush 48
      // 025: lushr
      // 026: l2i
      // 027: istore 16
      // 029: dup2
      // 02a: bipush 16
      // 02c: lshl
      // 02d: bipush 32
      // 02f: lushr
      // 030: l2i
      // 031: istore 17
      // 033: dup2
      // 034: bipush 48
      // 036: lshl
      // 037: bipush 48
      // 039: lushr
      // 03a: l2i
      // 03b: istore 18
      // 03d: pop2
      // 03e: dup2
      // 03f: ldc2_w 37585498234552
      // 042: lxor
      // 043: lstore 19
      // 045: dup2
      // 046: ldc2_w 117730469283447
      // 049: lxor
      // 04a: lstore 21
      // 04c: pop2
      // 04d: new com/zelix/_fc
      // 050: dup
      // 051: lload 21
      // 053: aload 7
      // 055: invokespecial com/zelix/_fc.<init> (JLjava/lang/String;)V
      // 058: astore 24
      // 05a: aload 1
      // 05b: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 05e: astore 25
      // 060: aload 1
      // 061: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 064: astore 26
      // 066: ldc2_w 8522769916746197891
      // 069: lload 2
      // 06a: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aconst_null
      // 070: astore 27
      // 072: aload 26
      // 074: arraylength
      // 075: istore 28
      // 077: aload 1
      // 078: invokevirtual com/zelix/_kz.z ()Lcom/zelix/p5;
      // 07b: astore 29
      // 07d: aload 1
      // 07e: lload 8
      // 080: invokevirtual com/zelix/_kz.C (J)Ljava/util/Set;
      // 083: astore 31
      // 085: astore 23
      // 087: aload 0
      // 088: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 08b: invokevirtual com/zelix/vi.H ()I
      // 08e: istore 32
      // 090: aload 29
      // 092: ifnull 245
      // 095: lload 2
      // 096: lconst_0
      // 097: lcmp
      // 098: ifle 237
      // 09b: getstatic com/zelix/_k7.D [I
      // 09e: aload 0
      // 09f: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 0a2: invokevirtual com/zelix/y4.ordinal ()I
      // 0a5: iaload
      // 0a6: aload 23
      // 0a8: ifnonnull 21c
      // 0ab: goto 0b8
      // 0ae: ldc2_w 7857771950399711776
      // 0b1: lload 2
      // 0b2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: iflt 20f
      // 0be: tableswitch 336 1 12 72 175 72 175 72 72 72 72 175 175 72 72
      // 0fc: ldc2_w 7857771950399711776
      // 0ff: lload 2
      // 100: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 29
      // 108: aload 23
      // 10a: ifnonnull 159
      // 10d: goto 11a
      // 110: ldc2_w 7857771950399711776
      // 113: lload 2
      // 114: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: iload 32
      // 11c: invokevirtual com/zelix/p5.get (I)Z
      // 11f: ifeq 13e
      // 122: goto 12f
      // 125: ldc2_w 7857771950399711776
      // 128: lload 2
      // 129: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 29
      // 131: astore 30
      // 133: aload 23
      // 135: lload 2
      // 136: lconst_0
      // 137: lcmp
      // 138: iflt 251
      // 13b: ifnull 248
      // 13e: aload 29
      // 140: ldc2_w 7663330788799206552
      // 143: lload 2
      // 144: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: checkcast com/zelix/p5
      // 14c: goto 159
      // 14f: ldc2_w 7857771950399711776
      // 152: lload 2
      // 153: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: astore 30
      // 15b: aload 30
      // 15d: iload 32
      // 15f: invokevirtual com/zelix/p5.set (I)V
      // 162: aload 23
      // 164: lload 2
      // 165: lconst_0
      // 166: lcmp
      // 167: ifle 251
      // 16a: ifnull 248
      // 16d: aload 29
      // 16f: aload 23
      // 171: ifnonnull 1f1
      // 174: goto 181
      // 177: ldc2_w 7857771950399711776
      // 17a: lload 2
      // 17b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: lload 2
      // 182: lconst_0
      // 183: lcmp
      // 184: iflt 1e4
      // 187: iload 32
      // 189: invokevirtual com/zelix/p5.get (I)Z
      // 18c: ifeq 1d6
      // 18f: goto 19c
      // 192: ldc2_w 7857771950399711776
      // 195: lload 2
      // 196: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: aload 29
      // 19e: aload 23
      // 1a0: ifnonnull 1f1
      // 1a3: goto 1b0
      // 1a6: ldc2_w 7857771950399711776
      // 1a9: lload 2
      // 1aa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: iload 32
      // 1b2: bipush 1
      // 1b3: iadd
      // 1b4: invokevirtual com/zelix/p5.get (I)Z
      // 1b7: ifeq 1d6
      // 1ba: goto 1c7
      // 1bd: ldc2_w 7857771950399711776
      // 1c0: lload 2
      // 1c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: athrow
      // 1c7: aload 29
      // 1c9: astore 30
      // 1cb: aload 23
      // 1cd: lload 2
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: ifle 251
      // 1d3: ifnull 248
      // 1d6: aload 29
      // 1d8: ldc2_w 7663330788799206552
      // 1db: lload 2
      // 1dc: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: checkcast com/zelix/p5
      // 1e4: goto 1f1
      // 1e7: ldc2_w 7857771950399711776
      // 1ea: lload 2
      // 1eb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: astore 30
      // 1f3: aload 30
      // 1f5: iload 32
      // 1f7: invokevirtual com/zelix/p5.set (I)V
      // 1fa: aload 30
      // 1fc: iload 32
      // 1fe: bipush 1
      // 1ff: iadd
      // 200: invokevirtual com/zelix/p5.set (I)V
      // 203: aload 23
      // 205: lload 2
      // 206: lconst_0
      // 207: lcmp
      // 208: ifle 251
      // 20b: ifnull 248
      // 20e: bipush 0
      // 20f: goto 21c
      // 212: ldc2_w 7857771950399711776
      // 215: lload 2
      // 216: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: bipush 1
      // 21d: anewarray 16
      // 220: dup
      // 221: bipush 0
      // 222: aload 0
      // 223: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 226: ldc2_w 7551200331557856095
      // 229: lload 2
      // 22a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: aastore
      // 230: lload 10
      // 232: dup2_x2
      // 233: pop2
      // 234: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 237: aconst_null
      // 238: lload 2
      // 239: lconst_0
      // 23a: lcmp
      // 23b: ifle 246
      // 23e: astore 30
      // 240: aload 23
      // 242: ifnull 248
      // 245: aconst_null
      // 246: astore 30
      // 248: lload 2
      // 249: lconst_0
      // 24a: lcmp
      // 24b: iflt 6f2
      // 24e: getstatic com/zelix/_k7.D [I
      // 251: aload 0
      // 252: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 255: invokevirtual com/zelix/y4.ordinal ()I
      // 258: iaload
      // 259: aload 23
      // 25b: ifnonnull 6cd
      // 25e: tableswitch 1121 1 12 72 124 176 228 280 334 366 392 1053 1090 856 950
      // 29c: ldc2_w 7857771950399711776
      // 29f: lload 2
      // 2a0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: iload 28
      // 2a8: bipush 1
      // 2a9: iadd
      // 2aa: lload 12
      // 2ac: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 2af: astore 27
      // 2b1: aload 26
      // 2b3: bipush 0
      // 2b4: aload 27
      // 2b6: bipush 0
      // 2b7: iload 28
      // 2b9: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2bc: aload 27
      // 2be: iload 28
      // 2c0: getstatic com/zelix/n.n Lcom/zelix/n;
      // 2c3: aastore
      // 2c4: new com/zelix/_kz
      // 2c7: dup
      // 2c8: aload 27
      // 2ca: aload 25
      // 2cc: lload 19
      // 2ce: aload 30
      // 2d0: aload 31
      // 2d2: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 2d5: astore 33
      // 2d7: goto 6f5
      // 2da: iload 28
      // 2dc: bipush 1
      // 2dd: iadd
      // 2de: lload 12
      // 2e0: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 2e3: astore 27
      // 2e5: aload 26
      // 2e7: bipush 0
      // 2e8: aload 27
      // 2ea: bipush 0
      // 2eb: iload 28
      // 2ed: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2f0: aload 27
      // 2f2: iload 28
      // 2f4: getstatic com/zelix/n.D Lcom/zelix/n;
      // 2f7: aastore
      // 2f8: new com/zelix/_kz
      // 2fb: dup
      // 2fc: aload 27
      // 2fe: aload 25
      // 300: lload 19
      // 302: aload 30
      // 304: aload 31
      // 306: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 309: astore 33
      // 30b: goto 6f5
      // 30e: iload 28
      // 310: bipush 1
      // 311: iadd
      // 312: lload 12
      // 314: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 317: astore 27
      // 319: aload 26
      // 31b: bipush 0
      // 31c: aload 27
      // 31e: bipush 0
      // 31f: iload 28
      // 321: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 324: aload 27
      // 326: iload 28
      // 328: getstatic com/zelix/n.o Lcom/zelix/n;
      // 32b: aastore
      // 32c: new com/zelix/_kz
      // 32f: dup
      // 330: aload 27
      // 332: aload 25
      // 334: lload 19
      // 336: aload 30
      // 338: aload 31
      // 33a: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 33d: astore 33
      // 33f: goto 6f5
      // 342: iload 28
      // 344: bipush 1
      // 345: iadd
      // 346: lload 12
      // 348: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 34b: astore 27
      // 34d: aload 26
      // 34f: bipush 0
      // 350: aload 27
      // 352: bipush 0
      // 353: iload 28
      // 355: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 358: aload 27
      // 35a: iload 28
      // 35c: getstatic com/zelix/n.c Lcom/zelix/n;
      // 35f: aastore
      // 360: new com/zelix/_kz
      // 363: dup
      // 364: aload 27
      // 366: aload 25
      // 368: lload 19
      // 36a: aload 30
      // 36c: aload 31
      // 36e: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 371: astore 33
      // 373: goto 6f5
      // 376: iload 28
      // 378: bipush 1
      // 379: iadd
      // 37a: lload 12
      // 37c: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 37f: astore 27
      // 381: aload 26
      // 383: bipush 0
      // 384: aload 27
      // 386: bipush 0
      // 387: iload 28
      // 389: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 38c: aload 27
      // 38e: iload 28
      // 390: aload 25
      // 392: iload 32
      // 394: aaload
      // 395: aastore
      // 396: new com/zelix/_kz
      // 399: dup
      // 39a: aload 27
      // 39c: aload 25
      // 39e: lload 19
      // 3a0: aload 30
      // 3a2: aload 31
      // 3a4: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 3a7: astore 33
      // 3a9: goto 6f5
      // 3ac: aload 0
      // 3ad: iload 28
      // 3af: aload 26
      // 3b1: lload 14
      // 3b3: aload 25
      // 3b5: getstatic com/zelix/n.n Lcom/zelix/n;
      // 3b8: aload 30
      // 3ba: aload 31
      // 3bc: invokespecial com/zelix/_o9.n (I[Lcom/zelix/n;J[Lcom/zelix/n;Lcom/zelix/n;Lcom/zelix/p5;Ljava/util/Set;)Lcom/zelix/_kz;
      // 3bf: astore 33
      // 3c1: aload 23
      // 3c3: lload 2
      // 3c4: lconst_0
      // 3c5: lcmp
      // 3c6: iflt 3e3
      // 3c9: ifnull 6f5
      // 3cc: aload 0
      // 3cd: iload 28
      // 3cf: aload 26
      // 3d1: lload 14
      // 3d3: aload 25
      // 3d5: getstatic com/zelix/n.o Lcom/zelix/n;
      // 3d8: aload 30
      // 3da: aload 31
      // 3dc: invokespecial com/zelix/_o9.n (I[Lcom/zelix/n;J[Lcom/zelix/n;Lcom/zelix/n;Lcom/zelix/p5;Ljava/util/Set;)Lcom/zelix/_kz;
      // 3df: astore 33
      // 3e1: aload 23
      // 3e3: ifnull 6f5
      // 3e6: aload 25
      // 3e8: arraylength
      // 3e9: istore 34
      // 3eb: iload 34
      // 3ed: lload 12
      // 3ef: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 3f2: astore 35
      // 3f4: aload 25
      // 3f6: bipush 0
      // 3f7: aload 35
      // 3f9: bipush 0
      // 3fa: iload 34
      // 3fc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3ff: aload 35
      // 401: iload 32
      // 403: aaload
      // 404: getstatic com/zelix/n.l Lcom/zelix/n;
      // 407: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 40a: aload 23
      // 40c: ifnonnull 4fc
      // 40f: ifeq 4d9
      // 412: goto 41f
      // 415: ldc2_w 7857771950399711776
      // 418: lload 2
      // 419: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41e: athrow
      // 41f: aload 35
      // 421: iload 32
      // 423: bipush 1
      // 424: isub
      // 425: aload 23
      // 427: lload 2
      // 428: lconst_0
      // 429: lcmp
      // 42a: ifle 4a4
      // 42d: ifnonnull 4a2
      // 430: goto 43d
      // 433: ldc2_w 7857771950399711776
      // 436: lload 2
      // 437: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43c: athrow
      // 43d: lload 2
      // 43e: lconst_0
      // 43f: lcmp
      // 440: ifle 495
      // 443: aaload
      // 444: getstatic com/zelix/n.D Lcom/zelix/n;
      // 447: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 44a: ifne 48f
      // 44d: goto 45a
      // 450: ldc2_w 7857771950399711776
      // 453: lload 2
      // 454: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: athrow
      // 45a: aload 35
      // 45c: iload 32
      // 45e: bipush 1
      // 45f: isub
      // 460: aaload
      // 461: getstatic com/zelix/n.c Lcom/zelix/n;
      // 464: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 467: lload 2
      // 468: lconst_0
      // 469: lcmp
      // 46a: ifle 4fc
      // 46d: aload 23
      // 46f: ifnonnull 4fc
      // 472: goto 47f
      // 475: ldc2_w 7857771950399711776
      // 478: lload 2
      // 479: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47e: athrow
      // 47f: ifeq 4d9
      // 482: goto 48f
      // 485: ldc2_w 7857771950399711776
      // 488: lload 2
      // 489: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48e: athrow
      // 48f: aload 35
      // 491: iload 32
      // 493: bipush 1
      // 494: isub
      // 495: goto 4a2
      // 498: ldc2_w 7857771950399711776
      // 49b: lload 2
      // 49c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a1: athrow
      // 4a2: aload 23
      // 4a4: lload 2
      // 4a5: lconst_0
      // 4a6: lcmp
      // 4a7: ifle 4e5
      // 4aa: ifnonnull 4dd
      // 4ad: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 4b0: aastore
      // 4b1: aload 30
      // 4b3: ifnull 4d9
      // 4b6: goto 4c3
      // 4b9: ldc2_w 7857771950399711776
      // 4bc: lload 2
      // 4bd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c2: athrow
      // 4c3: aload 30
      // 4c5: iload 32
      // 4c7: bipush 1
      // 4c8: isub
      // 4c9: invokevirtual com/zelix/p5.set (I)V
      // 4cc: goto 4d9
      // 4cf: ldc2_w 7857771950399711776
      // 4d2: lload 2
      // 4d3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d8: athrow
      // 4d9: aload 35
      // 4db: iload 32
      // 4dd: lload 2
      // 4de: lconst_0
      // 4df: lcmp
      // 4e0: ifle 54b
      // 4e3: aload 23
      // 4e5: ifnonnull 54b
      // 4e8: aaload
      // 4e9: getstatic com/zelix/n.D Lcom/zelix/n;
      // 4ec: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 4ef: goto 4fc
      // 4f2: ldc2_w 7857771950399711776
      // 4f5: lload 2
      // 4f6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fb: athrow
      // 4fc: lload 2
      // 4fd: lconst_0
      // 4fe: lcmp
      // 4ff: iflt 516
      // 502: ifne 538
      // 505: aload 35
      // 507: lload 2
      // 508: lconst_0
      // 509: lcmp
      // 50a: iflt 591
      // 50d: iload 32
      // 50f: aaload
      // 510: getstatic com/zelix/n.c Lcom/zelix/n;
      // 513: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 516: aload 23
      // 518: ifnonnull 58c
      // 51b: goto 528
      // 51e: ldc2_w 7857771950399711776
      // 521: lload 2
      // 522: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 527: athrow
      // 528: ifeq 57c
      // 52b: goto 538
      // 52e: ldc2_w 7857771950399711776
      // 531: lload 2
      // 532: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 537: athrow
      // 538: aload 35
      // 53a: iload 32
      // 53c: bipush 1
      // 53d: iadd
      // 53e: goto 54b
      // 541: ldc2_w 7857771950399711776
      // 544: lload 2
      // 545: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54a: athrow
      // 54b: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 54e: aastore
      // 54f: aload 23
      // 551: ifnonnull 588
      // 554: aload 30
      // 556: ifnull 57c
      // 559: goto 566
      // 55c: ldc2_w 7857771950399711776
      // 55f: lload 2
      // 560: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 565: athrow
      // 566: aload 30
      // 568: iload 32
      // 56a: bipush 1
      // 56b: iadd
      // 56c: invokevirtual com/zelix/p5.set (I)V
      // 56f: goto 57c
      // 572: ldc2_w 7857771950399711776
      // 575: lload 2
      // 576: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57b: athrow
      // 57c: aload 35
      // 57e: iload 32
      // 580: aload 26
      // 582: iload 28
      // 584: bipush 1
      // 585: isub
      // 586: aaload
      // 587: aastore
      // 588: iload 28
      // 58a: bipush 1
      // 58b: isub
      // 58c: lload 12
      // 58e: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 591: astore 27
      // 593: aload 26
      // 595: bipush 0
      // 596: aload 27
      // 598: bipush 0
      // 599: iload 28
      // 59b: bipush 1
      // 59c: isub
      // 59d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 5a0: new com/zelix/_kz
      // 5a3: dup
      // 5a4: aload 27
      // 5a6: aload 35
      // 5a8: lload 19
      // 5aa: aload 30
      // 5ac: aload 31
      // 5ae: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 5b1: astore 33
      // 5b3: goto 6f5
      // 5b6: aload 30
      // 5b8: aload 23
      // 5ba: ifnonnull 5cf
      // 5bd: ifnull 5d4
      // 5c0: goto 5cd
      // 5c3: ldc2_w 7857771950399711776
      // 5c6: lload 2
      // 5c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cc: athrow
      // 5cd: aload 30
      // 5cf: aload 29
      // 5d1: if_acmpne 5f2
      // 5d4: new com/zelix/_kz
      // 5d7: dup
      // 5d8: aload 26
      // 5da: aload 25
      // 5dc: lload 19
      // 5de: aload 29
      // 5e0: aload 31
      // 5e2: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 5e5: astore 33
      // 5e7: aload 23
      // 5e9: lload 2
      // 5ea: lconst_0
      // 5eb: lcmp
      // 5ec: ifle 611
      // 5ef: ifnull 6f5
      // 5f2: new com/zelix/_kz
      // 5f5: dup
      // 5f6: aload 1
      // 5f7: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 5fa: aload 1
      // 5fb: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 5fe: lload 19
      // 600: aload 30
      // 602: aload 31
      // 604: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 607: astore 33
      // 609: lload 2
      // 60a: lconst_0
      // 60b: lcmp
      // 60c: iflt 614
      // 60f: aload 23
      // 611: ifnull 6f5
      // 614: aload 30
      // 616: aload 23
      // 618: ifnonnull 63a
      // 61b: goto 628
      // 61e: ldc2_w 7857771950399711776
      // 621: lload 2
      // 622: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 627: athrow
      // 628: ifnull 63f
      // 62b: goto 638
      // 62e: ldc2_w 7857771950399711776
      // 631: lload 2
      // 632: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 637: athrow
      // 638: aload 30
      // 63a: aload 29
      // 63c: if_acmpne 65d
      // 63f: new com/zelix/_kz
      // 642: dup
      // 643: aload 26
      // 645: aload 25
      // 647: lload 19
      // 649: aload 29
      // 64b: aload 31
      // 64d: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 650: astore 33
      // 652: aload 23
      // 654: lload 2
      // 655: lconst_0
      // 656: lcmp
      // 657: iflt 672
      // 65a: ifnull 6f5
      // 65d: new com/zelix/_kz
      // 660: dup
      // 661: aload 26
      // 663: aload 25
      // 665: lload 19
      // 667: aload 30
      // 669: aload 31
      // 66b: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 66e: astore 33
      // 670: aload 23
      // 672: lload 2
      // 673: lconst_0
      // 674: lcmp
      // 675: iflt 697
      // 678: ifnull 6f5
      // 67b: aload 0
      // 67c: iload 16
      // 67e: i2c
      // 67f: iload 28
      // 681: aload 26
      // 683: aload 25
      // 685: iload 17
      // 687: iload 18
      // 689: getstatic com/zelix/n.D Lcom/zelix/n;
      // 68c: aload 30
      // 68e: aload 31
      // 690: invokespecial com/zelix/_o9.a (CI[Lcom/zelix/n;[Lcom/zelix/n;IILcom/zelix/n;Lcom/zelix/p5;Ljava/util/Set;)Lcom/zelix/_kz;
      // 693: astore 33
      // 695: aload 23
      // 697: lload 2
      // 698: lconst_0
      // 699: lcmp
      // 69a: iflt 6bc
      // 69d: ifnull 6f5
      // 6a0: aload 0
      // 6a1: iload 16
      // 6a3: i2c
      // 6a4: iload 28
      // 6a6: aload 26
      // 6a8: aload 25
      // 6aa: iload 17
      // 6ac: iload 18
      // 6ae: getstatic com/zelix/n.c Lcom/zelix/n;
      // 6b1: aload 30
      // 6b3: aload 31
      // 6b5: invokespecial com/zelix/_o9.a (CI[Lcom/zelix/n;[Lcom/zelix/n;IILcom/zelix/n;Lcom/zelix/p5;Ljava/util/Set;)Lcom/zelix/_kz;
      // 6b8: astore 33
      // 6ba: aload 23
      // 6bc: ifnull 6f5
      // 6bf: bipush 0
      // 6c0: goto 6cd
      // 6c3: ldc2_w 7857771950399711776
      // 6c6: lload 2
      // 6c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cc: athrow
      // 6cd: bipush 1
      // 6ce: anewarray 16
      // 6d1: dup
      // 6d2: bipush 0
      // 6d3: new java/lang/StringBuilder
      // 6d6: dup
      // 6d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 6da: getstatic com/zelix/_o9.g Ljava/lang/String;
      // 6dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e0: aload 0
      // 6e1: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 6e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6ea: aastore
      // 6eb: lload 10
      // 6ed: dup2_x2
      // 6ee: pop2
      // 6ef: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 6f2: aconst_null
      // 6f3: astore 33
      // 6f5: aload 33
      // 6f7: areturn
   }

   private static y4 L(int var0, long var1) {
      var1 = b ^ var1;

      try {
         switch (var0) {
            case 21:
            case 26:
            case 27:
            case 28:
            case 29:
               return x44.a<"k">(-3825392776298950349L, var1);
            case 22:
            case 30:
            case 31:
            case 32:
            case 33:
               return y4.u;
            case 23:
            case 34:
            case 35:
            case 36:
            case 37:
               return x44.a<"k">(-3153200050434589115L, var1);
            case 24:
            case 38:
            case 39:
            case 40:
            case 41:
               return x44.a<"k">(-3637424072978832900L, var1);
            case 25:
            case 42:
            case 43:
            case 44:
            case 45:
               return y4.m;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            default:
               return null;
            case 54:
            case 59:
            case 60:
            case 61:
            case 62:
               return x44.a<"k">(-2922565218231652539L, var1);
            case 55:
            case 63:
            case 64:
            case 65:
            case 66:
               return x44.a<"k">(-3508816220192015041L, var1);
            case 56:
            case 67:
            case 68:
            case 69:
            case 70:
               return x44.a<"k">(-3988704016719928488L, var1);
            case 57:
            case 71:
            case 72:
            case 73:
            case 74:
               return x44.a<"k">(-2923038479768302693L, var1);
            case 58:
            case 75:
            case 76:
            case 77:
            case 78:
               return x44.a<"k">(-3293797534773646136L, var1);
            case 132:
               return y4.w;
            case 169:
         }
      } catch (gj var3) {
         throw x44.a<"r">(var3, -3971889647099850803L, var1);
      }

      return y4.h;
   }

   public final boolean X(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -4132951942481355935
      // 03: lload 2
      // 04: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: astore 4
      // 0b: getstatic com/zelix/_k7.D [I
      // 0e: aload 0
      // 0f: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 12: invokevirtual com/zelix/y4.ordinal ()I
      // 15: iaload
      // 16: aload 4
      // 18: ifnonnull a2
      // 1b: tableswitch 134 1 12 132 132 132 132 132 71 71 71 71 71 132 132
      // 58: ldc2_w -2454934610519008574
      // 5b: lload 2
      // 5c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 66: invokevirtual com/zelix/vi.H ()I
      // 69: aload 4
      // 6b: ifnonnull 9a
      // 6e: goto 7b
      // 71: ldc2_w -2454934610519008574
      // 74: lload 2
      // 75: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: iload 1
      // 7c: if_icmpne 9d
      // 7f: goto 8c
      // 82: ldc2_w -2454934610519008574
      // 85: lload 2
      // 86: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: bipush 1
      // 8d: goto 9a
      // 90: ldc2_w -2454934610519008574
      // 93: lload 2
      // 94: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: goto 9e
      // 9d: bipush 0
      // 9e: ireturn
      // 9f: bipush 0
      // a0: ireturn
      // a1: bipush 0
      // a2: ireturn
   }

   public boolean p(char var1, int var2, short var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;

      try {
         if (this.O == y4.h) {
            return true;
         }
      } catch (gj var6) {
         throw x44.a<"t">(var6, 8122022366213863323L, var4);
      }

      return false;
   }

   public _o9(int param1, int param2, int param3, long param4, _xx param6, t7 param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_o9.b J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 101174450605499
      // 00e: lxor
      // 00f: lstore 8
      // 011: dup2
      // 012: ldc2_w 69125539770609
      // 015: lxor
      // 016: lstore 10
      // 018: pop2
      // 019: ldc2_w 828935002237277765
      // 01c: lload 4
      // 01e: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: aload 0
      // 024: sipush 6244
      // 027: ldc2_w 6930370388063181657
      // 02a: lload 4
      // 02c: lxor
      // 02d: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: invokespecial com/zelix/_og.<init> (I)V
      // 035: astore 12
      // 037: iload 2
      // 038: sipush 25023
      // 03b: ldc2_w 5177917866018153098
      // 03e: lload 4
      // 040: lxor
      // 041: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: aload 12
      // 048: ifnonnull 079
      // 04b: if_icmpne 0d0
      // 04e: goto 05c
      // 051: ldc2_w 1209893934766823398
      // 054: lload 4
      // 056: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: iload 1
      // 05d: sipush 23824
      // 060: ldc2_w 7972521573977464332
      // 063: lload 4
      // 065: lxor
      // 066: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: goto 079
      // 06e: ldc2_w 1209893934766823398
      // 071: lload 4
      // 073: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: if_icmpne 0a6
      // 07c: aload 0
      // 07d: aload 6
      // 07f: ldc2_w 1492389520370376707
      // 082: lload 4
      // 084: invokedynamic i (Ljava/lang/Object;JJ)S bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: putfield com/zelix/_o9.B I
      // 08c: lload 4
      // 08e: lconst_0
      // 08f: lcmp
      // 090: ifle 100
      // 093: aload 12
      // 095: ifnull 0e3
      // 098: goto 0a6
      // 09b: ldc2_w 1209893934766823398
      // 09e: lload 4
      // 0a0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: aload 6
      // 0a9: ldc2_w 1366864655476131226
      // 0ac: lload 4
      // 0ae: invokedynamic i (Ljava/lang/Object;JJ)B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: putfield com/zelix/_o9.B I
      // 0b6: lload 4
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 100
      // 0bd: aload 12
      // 0bf: ifnull 0e3
      // 0c2: goto 0d0
      // 0c5: ldc2_w 1209893934766823398
      // 0c8: lload 4
      // 0ca: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: bipush 0
      // 0d2: putfield com/zelix/_o9.B I
      // 0d5: goto 0e3
      // 0d8: ldc2_w 1209893934766823398
      // 0db: lload 4
      // 0dd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: iload 2
      // 0e5: lload 8
      // 0e7: invokestatic com/zelix/_o9.L (IJ)Lcom/zelix/y4;
      // 0ea: putfield com/zelix/_o9.O Lcom/zelix/y4;
      // 0ed: aload 0
      // 0ee: aload 7
      // 0f0: iload 3
      // 0f1: aload 0
      // 0f2: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 0f5: lload 10
      // 0f7: bipush 0
      // 0f8: invokeinterface com/zelix/t7.M (ILcom/zelix/y4;JI)Lcom/zelix/vi; 6
      // 0fd: putfield com/zelix/_o9.C Lcom/zelix/vi;
      // 100: return
   }

   private _kz n(int param1, n[] param2, long param3, n[] param5, n param6, p5 param7, Set param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_o9.b J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 27675612953614
      // 00b: lxor
      // 00c: lstore 9
      // 00e: dup2
      // 00f: ldc2_w 88568858116861
      // 012: lxor
      // 013: lstore 11
      // 015: pop2
      // 016: aload 0
      // 017: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 01a: invokevirtual com/zelix/vi.H ()I
      // 01d: istore 14
      // 01f: iload 1
      // 020: bipush 1
      // 021: isub
      // 022: lload 9
      // 024: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 027: astore 15
      // 029: ldc2_w -6195962736873293882
      // 02c: lload 3
      // 02d: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: aload 2
      // 033: bipush 0
      // 034: aload 15
      // 036: bipush 0
      // 037: iload 1
      // 038: bipush 1
      // 039: isub
      // 03a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 03d: aload 5
      // 03f: arraylength
      // 040: istore 16
      // 042: iload 16
      // 044: lload 9
      // 046: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 049: astore 17
      // 04b: aload 5
      // 04d: bipush 0
      // 04e: aload 17
      // 050: bipush 0
      // 051: iload 16
      // 053: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 056: astore 13
      // 058: aload 17
      // 05a: iload 14
      // 05c: aaload
      // 05d: getstatic com/zelix/n.l Lcom/zelix/n;
      // 060: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 063: aload 13
      // 065: ifnonnull 155
      // 068: ifeq 132
      // 06b: goto 078
      // 06e: ldc2_w -5671972197895457179
      // 071: lload 3
      // 072: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: aload 17
      // 07a: iload 14
      // 07c: bipush 1
      // 07d: isub
      // 07e: aload 13
      // 080: lload 3
      // 081: lconst_0
      // 082: lcmp
      // 083: ifle 0fd
      // 086: ifnonnull 0fb
      // 089: goto 096
      // 08c: ldc2_w -5671972197895457179
      // 08f: lload 3
      // 090: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: lload 3
      // 097: lconst_0
      // 098: lcmp
      // 099: ifle 0ee
      // 09c: aaload
      // 09d: getstatic com/zelix/n.D Lcom/zelix/n;
      // 0a0: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 0a3: ifne 0e8
      // 0a6: goto 0b3
      // 0a9: ldc2_w -5671972197895457179
      // 0ac: lload 3
      // 0ad: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 17
      // 0b5: iload 14
      // 0b7: bipush 1
      // 0b8: isub
      // 0b9: aaload
      // 0ba: getstatic com/zelix/n.c Lcom/zelix/n;
      // 0bd: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 0c0: lload 3
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: ifle 155
      // 0c6: aload 13
      // 0c8: ifnonnull 155
      // 0cb: goto 0d8
      // 0ce: ldc2_w -5671972197895457179
      // 0d1: lload 3
      // 0d2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: ifeq 132
      // 0db: goto 0e8
      // 0de: ldc2_w -5671972197895457179
      // 0e1: lload 3
      // 0e2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 17
      // 0ea: iload 14
      // 0ec: bipush 1
      // 0ed: isub
      // 0ee: goto 0fb
      // 0f1: ldc2_w -5671972197895457179
      // 0f4: lload 3
      // 0f5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 13
      // 0fd: lload 3
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 13e
      // 103: ifnonnull 136
      // 106: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 109: aastore
      // 10a: aload 7
      // 10c: ifnull 132
      // 10f: goto 11c
      // 112: ldc2_w -5671972197895457179
      // 115: lload 3
      // 116: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: aload 7
      // 11e: iload 14
      // 120: bipush 1
      // 121: isub
      // 122: invokevirtual com/zelix/p5.set (I)V
      // 125: goto 132
      // 128: ldc2_w -5671972197895457179
      // 12b: lload 3
      // 12c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 17
      // 134: iload 14
      // 136: lload 3
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 198
      // 13c: aload 13
      // 13e: ifnonnull 198
      // 141: aaload
      // 142: getstatic com/zelix/n.D Lcom/zelix/n;
      // 145: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 148: goto 155
      // 14b: ldc2_w -5671972197895457179
      // 14e: lload 3
      // 14f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: ifne 185
      // 158: aload 17
      // 15a: iload 14
      // 15c: aload 13
      // 15e: ifnonnull 1cd
      // 161: goto 16e
      // 164: ldc2_w -5671972197895457179
      // 167: lload 3
      // 168: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aaload
      // 16f: getstatic com/zelix/n.c Lcom/zelix/n;
      // 172: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 175: ifeq 1c9
      // 178: goto 185
      // 17b: ldc2_w -5671972197895457179
      // 17e: lload 3
      // 17f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: aload 17
      // 187: iload 14
      // 189: bipush 1
      // 18a: iadd
      // 18b: goto 198
      // 18e: ldc2_w -5671972197895457179
      // 191: lload 3
      // 192: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 19b: aastore
      // 19c: aload 13
      // 19e: ifnonnull 1d0
      // 1a1: aload 7
      // 1a3: ifnull 1c9
      // 1a6: goto 1b3
      // 1a9: ldc2_w -5671972197895457179
      // 1ac: lload 3
      // 1ad: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: aload 7
      // 1b5: iload 14
      // 1b7: bipush 1
      // 1b8: iadd
      // 1b9: invokevirtual com/zelix/p5.set (I)V
      // 1bc: goto 1c9
      // 1bf: ldc2_w -5671972197895457179
      // 1c2: lload 3
      // 1c3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: aload 17
      // 1cb: iload 14
      // 1cd: aload 6
      // 1cf: aastore
      // 1d0: new com/zelix/_kz
      // 1d3: dup
      // 1d4: aload 15
      // 1d6: aload 17
      // 1d8: lload 11
      // 1da: aload 7
      // 1dc: aload 8
      // 1de: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 1e1: areturn
   }

   public final String K(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 74821174520157L;
      return x44.a<"o">(-5210513151666023690L, var2)[x44.a<"n">(this, new Object[]{var4}, -5678649497154586860L, var2)];
   }

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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 32198005677074
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 43317403178689
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 72462291038852
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 135217447378337
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 20231315158840
      // 03d: lxor
      // 03e: lstore 14
      // 040: pop2
      // 041: ldc2_w 8216154267410362304
      // 044: lload 4
      // 046: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: new java/lang/StringBuilder
      // 04e: dup
      // 04f: sipush 16057
      // 052: ldc2_w 4328900452828709924
      // 055: lload 4
      // 057: lxor
      // 058: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: invokespecial java/lang/StringBuilder.<init> (I)V
      // 060: astore 17
      // 062: aload 17
      // 064: aload 0
      // 065: lload 6
      // 067: bipush 1
      // 068: anewarray 357
      // 06b: dup_x2
      // 06c: dup_x2
      // 06d: pop
      // 06e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: ldc2_w 8169838419931160625
      // 077: lload 4
      // 079: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 081: pop
      // 082: astore 16
      // 084: aload 17
      // 086: sipush 7399
      // 089: ldc2_w 3122897863058335284
      // 08c: lload 4
      // 08e: lxor
      // 08f: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 097: pop
      // 098: aload 0
      // 099: lload 14
      // 09b: bipush 1
      // 09c: anewarray 357
      // 09f: dup_x2
      // 0a0: dup_x2
      // 0a1: pop
      // 0a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a5: bipush 0
      // 0a6: swap
      // 0a7: aastore
      // 0a8: ldc2_w 8470501990987581119
      // 0ab: lload 4
      // 0ad: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: istore 18
      // 0b4: aload 0
      // 0b5: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 0b8: lload 12
      // 0ba: invokevirtual com/zelix/vi.s (J)Z
      // 0bd: aload 16
      // 0bf: ifnonnull 12f
      // 0c2: ifeq 120
      // 0c5: goto 0d3
      // 0c8: ldc2_w 7588348940049542755
      // 0cb: lload 4
      // 0cd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 17
      // 0d5: ldc2_w 7755924981447577316
      // 0d8: lload 4
      // 0da: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: aload 0
      // 0e0: lload 14
      // 0e2: bipush 1
      // 0e3: anewarray 357
      // 0e6: dup_x2
      // 0e7: dup_x2
      // 0e8: pop
      // 0e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ec: bipush 0
      // 0ed: swap
      // 0ee: aastore
      // 0ef: ldc2_w 8470501990987581119
      // 0f2: lload 4
      // 0f4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: aaload
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: pop
      // 0fe: aload 17
      // 100: sipush 19349
      // 103: ldc2_w 8303319701574676795
      // 106: lload 4
      // 108: lxor
      // 109: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 111: pop
      // 112: goto 120
      // 115: ldc2_w 7588348940049542755
      // 118: lload 4
      // 11a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 17
      // 122: aload 0
      // 123: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 126: invokevirtual com/zelix/vi.H ()I
      // 129: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12c: pop
      // 12d: iload 18
      // 12f: lload 10
      // 131: dup2_x1
      // 132: pop2
      // 133: bipush 2
      // 134: anewarray 357
      // 137: dup_x1
      // 138: swap
      // 139: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13c: bipush 1
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 0
      // 146: swap
      // 147: aastore
      // 148: ldc2_w 8570484206580877217
      // 14b: lload 4
      // 14d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: astore 19
      // 154: aload 19
      // 156: aload 0
      // 157: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 15a: invokevirtual com/zelix/vi.H ()I
      // 15d: ldc2_w 8463256255195338727
      // 160: lload 4
      // 162: invokedynamic t (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: lload 8
      // 169: dup2_x1
      // 16a: pop2
      // 16b: bipush 3
      // 16c: anewarray 357
      // 16f: dup_x1
      // 170: swap
      // 171: bipush 2
      // 172: swap
      // 173: aastore
      // 174: dup_x2
      // 175: dup_x2
      // 176: pop
      // 177: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17a: bipush 1
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x1
      // 17e: swap
      // 17f: bipush 0
      // 180: swap
      // 181: aastore
      // 182: ldc2_w 7799761149368071863
      // 185: lload 4
      // 187: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: astore 19
      // 18e: iload 18
      // 190: lload 4
      // 192: lconst_0
      // 193: lcmp
      // 194: iflt 1f7
      // 197: aload 16
      // 199: ifnonnull 1f7
      // 19c: sipush 29018
      // 19f: ldc2_w 6112371420119518184
      // 1a2: lload 4
      // 1a4: lxor
      // 1a5: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: if_icmpne 1f2
      // 1ad: goto 1bb
      // 1b0: ldc2_w 7588348940049542755
      // 1b3: lload 4
      // 1b5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: aload 19
      // 1bd: aload 0
      // 1be: getfield com/zelix/_o9.B I
      // 1c1: ldc2_w 8463256255195338727
      // 1c4: lload 4
      // 1c6: invokedynamic t (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: lload 8
      // 1cd: dup2_x1
      // 1ce: pop2
      // 1cf: bipush 3
      // 1d0: anewarray 357
      // 1d3: dup_x1
      // 1d4: swap
      // 1d5: bipush 2
      // 1d6: swap
      // 1d7: aastore
      // 1d8: dup_x2
      // 1d9: dup_x2
      // 1da: pop
      // 1db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1de: bipush 1
      // 1df: swap
      // 1e0: aastore
      // 1e1: dup_x1
      // 1e2: swap
      // 1e3: bipush 0
      // 1e4: swap
      // 1e5: aastore
      // 1e6: ldc2_w 7799761149368071863
      // 1e9: lload 4
      // 1eb: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: astore 19
      // 1f2: aload 19
      // 1f4: invokevirtual java/lang/String.length ()I
      // 1f7: ifle 222
      // 1fa: aload 17
      // 1fc: new java/lang/StringBuilder
      // 1ff: dup
      // 200: invokespecial java/lang/StringBuilder.<init> ()V
      // 203: ldc "\t"
      // 205: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 208: aload 19
      // 20a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: pop
      // 214: goto 222
      // 217: ldc2_w 7588348940049542755
      // 21a: lload 4
      // 21c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 3
      // 223: new java/lang/StringBuilder
      // 226: dup
      // 227: invokespecial java/lang/StringBuilder.<init> ()V
      // 22a: aload 2
      // 22b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 231: aload 2
      // 232: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 235: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 238: aload 17
      // 23a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 23d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 240: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 243: return
   }

   public _o9(int var1, y4 var2, long var3, t7 var5, int var6, int var7) {
      var3 = b ^ var3;
      long var8 = var3 ^ 103121727001833L;
      super(b<"e">(6244, 6930472690464751425L ^ var3));
      this.O = var2;
      this.C = var5.M(var1, var2, var8, var7);
      this.B = var6;
   }

   public int X(Object[] param1) {
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
      // 0c: getstatic com/zelix/_o9.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 63555023357429
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 136689892677607
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w 5970307394900119327
      // 25: lload 2
      // 26: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 8
      // 2d: aload 0
      // 2e: lload 4
      // 30: invokevirtual com/zelix/_o9.P (J)Z
      // 33: aload 8
      // 35: ifnonnull 79
      // 38: ifeq 60
      // 3b: goto 48
      // 3e: ldc2_w 5300830289083780796
      // 41: lload 2
      // 42: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: sipush 8074
      // 4b: ldc2_w 9192668291244590493
      // 4e: lload 2
      // 4f: lxor
      // 50: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: ireturn
      // 56: ldc2_w 5300830289083780796
      // 59: lload 2
      // 5a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 0
      // 61: lload 6
      // 63: bipush 1
      // 64: anewarray 357
      // 67: dup_x2
      // 68: dup_x2
      // 69: pop
      // 6a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: ldc2_w 6148023279042487904
      // 73: lload 2
      // 74: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: ireturn
   }

   public void W(int param1, DataOutputStream param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: lstore 4
      // 010: lload 4
      // 012: dup2
      // 013: ldc2_w 135946124605598
      // 016: lxor
      // 017: lstore 6
      // 019: pop2
      // 01a: ldc2_w 3436678178989978228
      // 01d: lload 4
      // 01f: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: astore 8
      // 026: aload 0
      // 027: lload 6
      // 029: invokevirtual com/zelix/_o9.P (J)Z
      // 02c: aload 8
      // 02e: ifnonnull 069
      // 031: ifeq 062
      // 034: goto 042
      // 037: ldc2_w 3817670921772610519
      // 03a: lload 4
      // 03c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: athrow
      // 042: aload 2
      // 043: sipush 23824
      // 046: ldc2_w 7972612998061996605
      // 049: lload 4
      // 04b: lxor
      // 04c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 054: goto 062
      // 057: ldc2_w 3817670921772610519
      // 05a: lload 4
      // 05c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 0
      // 063: getfield com/zelix/_o9.C Lcom/zelix/vi;
      // 066: invokevirtual com/zelix/vi.H ()I
      // 069: istore 9
      // 06b: getstatic com/zelix/_k7.D [I
      // 06e: aload 0
      // 06f: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 072: invokevirtual com/zelix/y4.ordinal ()I
      // 075: iaload
      // 076: aload 8
      // 078: iload 1
      // 079: iflt 0cf
      // 07c: ifnonnull 0c9
      // 07f: tableswitch 3650 1 12 72 722 1386 2050 2714 390 1718 3046 1054 2382 3378 3538
      // 0bc: ldc2_w 3817670921772610519
      // 0bf: lload 4
      // 0c1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: iload 9
      // 0c9: iload 1
      // 0ca: ifle 1cc
      // 0cd: aload 8
      // 0cf: ifnonnull 1cc
      // 0d2: tableswitch 189 0 3 41 78 115 152
      // 0f0: ldc2_w 3817670921772610519
      // 0f3: lload 4
      // 0f5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 2
      // 0fc: sipush 21600
      // 0ff: ldc2_w 4073090890632278869
      // 102: lload 4
      // 104: lxor
      // 105: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 10d: aload 8
      // 10f: ifnull ec1
      // 112: goto 120
      // 115: ldc2_w 3817670921772610519
      // 118: lload 4
      // 11a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 2
      // 121: sipush 3033
      // 124: ldc2_w 4651530945533275303
      // 127: lload 4
      // 129: lxor
      // 12a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 132: aload 8
      // 134: ifnull ec1
      // 137: goto 145
      // 13a: ldc2_w 3817670921772610519
      // 13d: lload 4
      // 13f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: aload 2
      // 146: sipush 19734
      // 149: ldc2_w 763066847283882597
      // 14c: lload 4
      // 14e: lxor
      // 14f: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 157: aload 8
      // 159: ifnull ec1
      // 15c: goto 16a
      // 15f: ldc2_w 3817670921772610519
      // 162: lload 4
      // 164: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 2
      // 16b: sipush 1960
      // 16e: ldc2_w 7202825781404557516
      // 171: lload 4
      // 173: lxor
      // 174: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 17c: aload 8
      // 17e: ifnull ec1
      // 181: goto 18f
      // 184: ldc2_w 3817670921772610519
      // 187: lload 4
      // 189: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: aload 2
      // 190: sipush 6322
      // 193: ldc2_w 4132332984528306155
      // 196: lload 4
      // 198: lxor
      // 199: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 1a1: aload 8
      // 1a3: iload 3
      // 1a4: ifle 202
      // 1a7: ifnonnull 1fc
      // 1aa: goto 1b8
      // 1ad: ldc2_w 3817670921772610519
      // 1b0: lload 4
      // 1b2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: lload 6
      // 1bb: invokevirtual com/zelix/_o9.P (J)Z
      // 1be: goto 1cc
      // 1c1: ldc2_w 3817670921772610519
      // 1c4: lload 4
      // 1c6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: ifeq 1e8
      // 1cf: aload 2
      // 1d0: iload 9
      // 1d2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 1d5: aload 8
      // 1d7: ifnull ec1
      // 1da: goto 1e8
      // 1dd: ldc2_w 3817670921772610519
      // 1e0: lload 4
      // 1e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: aload 2
      // 1e9: iload 9
      // 1eb: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 1ee: goto 1fc
      // 1f1: ldc2_w 3817670921772610519
      // 1f4: lload 4
      // 1f6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: iload 1
      // 1fd: ifle 205
      // 200: aload 8
      // 202: ifnull ec1
      // 205: iload 9
      // 207: iload 1
      // 208: iflt 318
      // 20b: aload 8
      // 20d: ifnonnull 318
      // 210: goto 21e
      // 213: ldc2_w 3817670921772610519
      // 216: lload 4
      // 218: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: tableswitch 189 0 3 41 78 115 152
      // 23c: ldc2_w 3817670921772610519
      // 23f: lload 4
      // 241: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: aload 2
      // 248: sipush 5022
      // 24b: ldc2_w 5900526630411990205
      // 24e: lload 4
      // 250: lxor
      // 251: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 259: aload 8
      // 25b: ifnull ec1
      // 25e: goto 26c
      // 261: ldc2_w 3817670921772610519
      // 264: lload 4
      // 266: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: aload 2
      // 26d: sipush 2086
      // 270: ldc2_w 4927653817406517012
      // 273: lload 4
      // 275: lxor
      // 276: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 27e: aload 8
      // 280: ifnull ec1
      // 283: goto 291
      // 286: ldc2_w 3817670921772610519
      // 289: lload 4
      // 28b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: athrow
      // 291: aload 2
      // 292: sipush 25283
      // 295: ldc2_w 3296129262239221231
      // 298: lload 4
      // 29a: lxor
      // 29b: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 2a3: aload 8
      // 2a5: ifnull ec1
      // 2a8: goto 2b6
      // 2ab: ldc2_w 3817670921772610519
      // 2ae: lload 4
      // 2b0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: aload 2
      // 2b7: sipush 18330
      // 2ba: ldc2_w 3776394461447168235
      // 2bd: lload 4
      // 2bf: lxor
      // 2c0: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 2c8: aload 8
      // 2ca: ifnull ec1
      // 2cd: goto 2db
      // 2d0: ldc2_w 3817670921772610519
      // 2d3: lload 4
      // 2d5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: athrow
      // 2db: aload 2
      // 2dc: sipush 30791
      // 2df: ldc2_w 7592385608962940790
      // 2e2: lload 4
      // 2e4: lxor
      // 2e5: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 2ed: aload 8
      // 2ef: iload 1
      // 2f0: iflt 34e
      // 2f3: ifnonnull 348
      // 2f6: goto 304
      // 2f9: ldc2_w 3817670921772610519
      // 2fc: lload 4
      // 2fe: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: athrow
      // 304: aload 0
      // 305: lload 6
      // 307: invokevirtual com/zelix/_o9.P (J)Z
      // 30a: goto 318
      // 30d: ldc2_w 3817670921772610519
      // 310: lload 4
      // 312: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: athrow
      // 318: ifeq 334
      // 31b: aload 2
      // 31c: iload 9
      // 31e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 321: aload 8
      // 323: ifnull ec1
      // 326: goto 334
      // 329: ldc2_w 3817670921772610519
      // 32c: lload 4
      // 32e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: athrow
      // 334: aload 2
      // 335: iload 9
      // 337: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 33a: goto 348
      // 33d: ldc2_w 3817670921772610519
      // 340: lload 4
      // 342: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: athrow
      // 348: iload 3
      // 349: ifle 351
      // 34c: aload 8
      // 34e: ifnull ec1
      // 351: iload 9
      // 353: iload 3
      // 354: ifle 464
      // 357: aload 8
      // 359: ifnonnull 464
      // 35c: goto 36a
      // 35f: ldc2_w 3817670921772610519
      // 362: lload 4
      // 364: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: athrow
      // 36a: tableswitch 189 0 3 41 78 115 152
      // 388: ldc2_w 3817670921772610519
      // 38b: lload 4
      // 38d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: athrow
      // 393: aload 2
      // 394: sipush 25017
      // 397: ldc2_w 7125865350560777948
      // 39a: lload 4
      // 39c: lxor
      // 39d: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 3a5: aload 8
      // 3a7: ifnull ec1
      // 3aa: goto 3b8
      // 3ad: ldc2_w 3817670921772610519
      // 3b0: lload 4
      // 3b2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b7: athrow
      // 3b8: aload 2
      // 3b9: sipush 23011
      // 3bc: ldc2_w 6196482226943049361
      // 3bf: lload 4
      // 3c1: lxor
      // 3c2: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 3ca: aload 8
      // 3cc: ifnull ec1
      // 3cf: goto 3dd
      // 3d2: ldc2_w 3817670921772610519
      // 3d5: lload 4
      // 3d7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dc: athrow
      // 3dd: aload 2
      // 3de: sipush 19349
      // 3e1: ldc2_w 8303367882538560655
      // 3e4: lload 4
      // 3e6: lxor
      // 3e7: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ec: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 3ef: aload 8
      // 3f1: ifnull ec1
      // 3f4: goto 402
      // 3f7: ldc2_w 3817670921772610519
      // 3fa: lload 4
      // 3fc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: athrow
      // 402: aload 2
      // 403: sipush 10699
      // 406: ldc2_w 7454284662609170137
      // 409: lload 4
      // 40b: lxor
      // 40c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 411: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 414: aload 8
      // 416: ifnull ec1
      // 419: goto 427
      // 41c: ldc2_w 3817670921772610519
      // 41f: lload 4
      // 421: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 426: athrow
      // 427: aload 2
      // 428: sipush 21505
      // 42b: ldc2_w 4749381459365442333
      // 42e: lload 4
      // 430: lxor
      // 431: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 436: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 439: aload 8
      // 43b: iload 3
      // 43c: ifle 49a
      // 43f: ifnonnull 494
      // 442: goto 450
      // 445: ldc2_w 3817670921772610519
      // 448: lload 4
      // 44a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44f: athrow
      // 450: aload 0
      // 451: lload 6
      // 453: invokevirtual com/zelix/_o9.P (J)Z
      // 456: goto 464
      // 459: ldc2_w 3817670921772610519
      // 45c: lload 4
      // 45e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 463: athrow
      // 464: ifeq 480
      // 467: aload 2
      // 468: iload 9
      // 46a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 46d: aload 8
      // 46f: ifnull ec1
      // 472: goto 480
      // 475: ldc2_w 3817670921772610519
      // 478: lload 4
      // 47a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47f: athrow
      // 480: aload 2
      // 481: iload 9
      // 483: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 486: goto 494
      // 489: ldc2_w 3817670921772610519
      // 48c: lload 4
      // 48e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 493: athrow
      // 494: iload 3
      // 495: ifle 49d
      // 498: aload 8
      // 49a: ifnull ec1
      // 49d: iload 9
      // 49f: iload 1
      // 4a0: iflt 5b0
      // 4a3: aload 8
      // 4a5: ifnonnull 5b0
      // 4a8: goto 4b6
      // 4ab: ldc2_w 3817670921772610519
      // 4ae: lload 4
      // 4b0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b5: athrow
      // 4b6: tableswitch 189 0 3 41 78 115 152
      // 4d4: ldc2_w 3817670921772610519
      // 4d7: lload 4
      // 4d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: athrow
      // 4df: aload 2
      // 4e0: sipush 27114
      // 4e3: ldc2_w 8167459594906275569
      // 4e6: lload 4
      // 4e8: lxor
      // 4e9: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ee: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 4f1: aload 8
      // 4f3: ifnull ec1
      // 4f6: goto 504
      // 4f9: ldc2_w 3817670921772610519
      // 4fc: lload 4
      // 4fe: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 503: athrow
      // 504: aload 2
      // 505: sipush 26228
      // 508: ldc2_w 2559498136983994731
      // 50b: lload 4
      // 50d: lxor
      // 50e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 513: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 516: aload 8
      // 518: ifnull ec1
      // 51b: goto 529
      // 51e: ldc2_w 3817670921772610519
      // 521: lload 4
      // 523: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 528: athrow
      // 529: aload 2
      // 52a: sipush 6142
      // 52d: ldc2_w 5348905604123226312
      // 530: lload 4
      // 532: lxor
      // 533: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 538: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 53b: aload 8
      // 53d: ifnull ec1
      // 540: goto 54e
      // 543: ldc2_w 3817670921772610519
      // 546: lload 4
      // 548: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54d: athrow
      // 54e: aload 2
      // 54f: sipush 14213
      // 552: ldc2_w 7162215872944853141
      // 555: lload 4
      // 557: lxor
      // 558: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55d: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 560: aload 8
      // 562: ifnull ec1
      // 565: goto 573
      // 568: ldc2_w 3817670921772610519
      // 56b: lload 4
      // 56d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 572: athrow
      // 573: aload 2
      // 574: sipush 23335
      // 577: ldc2_w 6903220017131306023
      // 57a: lload 4
      // 57c: lxor
      // 57d: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 582: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 585: aload 8
      // 587: iload 3
      // 588: ifle 5e6
      // 58b: ifnonnull 5e0
      // 58e: goto 59c
      // 591: ldc2_w 3817670921772610519
      // 594: lload 4
      // 596: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59b: athrow
      // 59c: aload 0
      // 59d: lload 6
      // 59f: invokevirtual com/zelix/_o9.P (J)Z
      // 5a2: goto 5b0
      // 5a5: ldc2_w 3817670921772610519
      // 5a8: lload 4
      // 5aa: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5af: athrow
      // 5b0: ifeq 5cc
      // 5b3: aload 2
      // 5b4: iload 9
      // 5b6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 5b9: aload 8
      // 5bb: ifnull ec1
      // 5be: goto 5cc
      // 5c1: ldc2_w 3817670921772610519
      // 5c4: lload 4
      // 5c6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: athrow
      // 5cc: aload 2
      // 5cd: iload 9
      // 5cf: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 5d2: goto 5e0
      // 5d5: ldc2_w 3817670921772610519
      // 5d8: lload 4
      // 5da: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5df: athrow
      // 5e0: iload 3
      // 5e1: iflt 5e9
      // 5e4: aload 8
      // 5e6: ifnull ec1
      // 5e9: iload 9
      // 5eb: iload 3
      // 5ec: ifle 6fc
      // 5ef: aload 8
      // 5f1: ifnonnull 6fc
      // 5f4: goto 602
      // 5f7: ldc2_w 3817670921772610519
      // 5fa: lload 4
      // 5fc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 601: athrow
      // 602: tableswitch 189 0 3 41 78 115 152
      // 620: ldc2_w 3817670921772610519
      // 623: lload 4
      // 625: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62a: athrow
      // 62b: aload 2
      // 62c: sipush 6380
      // 62f: ldc2_w 8731420624793993195
      // 632: lload 4
      // 634: lxor
      // 635: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 63d: aload 8
      // 63f: ifnull ec1
      // 642: goto 650
      // 645: ldc2_w 3817670921772610519
      // 648: lload 4
      // 64a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64f: athrow
      // 650: aload 2
      // 651: sipush 29772
      // 654: ldc2_w 1128351602135012135
      // 657: lload 4
      // 659: lxor
      // 65a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65f: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 662: aload 8
      // 664: ifnull ec1
      // 667: goto 675
      // 66a: ldc2_w 3817670921772610519
      // 66d: lload 4
      // 66f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 674: athrow
      // 675: aload 2
      // 676: sipush 17021
      // 679: ldc2_w 6141161277316506889
      // 67c: lload 4
      // 67e: lxor
      // 67f: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 684: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 687: aload 8
      // 689: ifnull ec1
      // 68c: goto 69a
      // 68f: ldc2_w 3817670921772610519
      // 692: lload 4
      // 694: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 699: athrow
      // 69a: aload 2
      // 69b: sipush 10499
      // 69e: ldc2_w 6601144395325296164
      // 6a1: lload 4
      // 6a3: lxor
      // 6a4: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a9: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 6ac: aload 8
      // 6ae: ifnull ec1
      // 6b1: goto 6bf
      // 6b4: ldc2_w 3817670921772610519
      // 6b7: lload 4
      // 6b9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6be: athrow
      // 6bf: aload 2
      // 6c0: sipush 10778
      // 6c3: ldc2_w 8135198238962076996
      // 6c6: lload 4
      // 6c8: lxor
      // 6c9: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ce: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 6d1: aload 8
      // 6d3: iload 1
      // 6d4: ifle 732
      // 6d7: ifnonnull 72c
      // 6da: goto 6e8
      // 6dd: ldc2_w 3817670921772610519
      // 6e0: lload 4
      // 6e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e7: athrow
      // 6e8: aload 0
      // 6e9: lload 6
      // 6eb: invokevirtual com/zelix/_o9.P (J)Z
      // 6ee: goto 6fc
      // 6f1: ldc2_w 3817670921772610519
      // 6f4: lload 4
      // 6f6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fb: athrow
      // 6fc: ifeq 718
      // 6ff: aload 2
      // 700: iload 9
      // 702: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 705: aload 8
      // 707: ifnull ec1
      // 70a: goto 718
      // 70d: ldc2_w 3817670921772610519
      // 710: lload 4
      // 712: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 717: athrow
      // 718: aload 2
      // 719: iload 9
      // 71b: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 71e: goto 72c
      // 721: ldc2_w 3817670921772610519
      // 724: lload 4
      // 726: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72b: athrow
      // 72c: iload 1
      // 72d: ifle 735
      // 730: aload 8
      // 732: ifnull ec1
      // 735: iload 9
      // 737: iload 1
      // 738: iflt 848
      // 73b: aload 8
      // 73d: ifnonnull 848
      // 740: goto 74e
      // 743: ldc2_w 3817670921772610519
      // 746: lload 4
      // 748: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74d: athrow
      // 74e: tableswitch 189 0 3 41 78 115 152
      // 76c: ldc2_w 3817670921772610519
      // 76f: lload 4
      // 771: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 776: athrow
      // 777: aload 2
      // 778: sipush 12488
      // 77b: ldc2_w 998746909184776135
      // 77e: lload 4
      // 780: lxor
      // 781: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 786: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 789: aload 8
      // 78b: ifnull ec1
      // 78e: goto 79c
      // 791: ldc2_w 3817670921772610519
      // 794: lload 4
      // 796: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79b: athrow
      // 79c: aload 2
      // 79d: sipush 1672
      // 7a0: ldc2_w 8460232137937445293
      // 7a3: lload 4
      // 7a5: lxor
      // 7a6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ab: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 7ae: aload 8
      // 7b0: ifnull ec1
      // 7b3: goto 7c1
      // 7b6: ldc2_w 3817670921772610519
      // 7b9: lload 4
      // 7bb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c0: athrow
      // 7c1: aload 2
      // 7c2: sipush 10262
      // 7c5: ldc2_w 164443146157543220
      // 7c8: lload 4
      // 7ca: lxor
      // 7cb: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d0: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 7d3: aload 8
      // 7d5: ifnull ec1
      // 7d8: goto 7e6
      // 7db: ldc2_w 3817670921772610519
      // 7de: lload 4
      // 7e0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e5: athrow
      // 7e6: aload 2
      // 7e7: sipush 17786
      // 7ea: ldc2_w 6304832541241516588
      // 7ed: lload 4
      // 7ef: lxor
      // 7f0: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f5: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 7f8: aload 8
      // 7fa: ifnull ec1
      // 7fd: goto 80b
      // 800: ldc2_w 3817670921772610519
      // 803: lload 4
      // 805: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80a: athrow
      // 80b: aload 2
      // 80c: sipush 17128
      // 80f: ldc2_w 5021384762201056649
      // 812: lload 4
      // 814: lxor
      // 815: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 81d: aload 8
      // 81f: iload 1
      // 820: iflt 87e
      // 823: ifnonnull 878
      // 826: goto 834
      // 829: ldc2_w 3817670921772610519
      // 82c: lload 4
      // 82e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 833: athrow
      // 834: aload 0
      // 835: lload 6
      // 837: invokevirtual com/zelix/_o9.P (J)Z
      // 83a: goto 848
      // 83d: ldc2_w 3817670921772610519
      // 840: lload 4
      // 842: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 847: athrow
      // 848: ifeq 864
      // 84b: aload 2
      // 84c: iload 9
      // 84e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 851: aload 8
      // 853: ifnull ec1
      // 856: goto 864
      // 859: ldc2_w 3817670921772610519
      // 85c: lload 4
      // 85e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 863: athrow
      // 864: aload 2
      // 865: iload 9
      // 867: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 86a: goto 878
      // 86d: ldc2_w 3817670921772610519
      // 870: lload 4
      // 872: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 877: athrow
      // 878: iload 1
      // 879: iflt 881
      // 87c: aload 8
      // 87e: ifnull ec1
      // 881: iload 9
      // 883: iload 3
      // 884: ifle 994
      // 887: aload 8
      // 889: ifnonnull 994
      // 88c: goto 89a
      // 88f: ldc2_w 3817670921772610519
      // 892: lload 4
      // 894: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 899: athrow
      // 89a: tableswitch 189 0 3 41 78 115 152
      // 8b8: ldc2_w 3817670921772610519
      // 8bb: lload 4
      // 8bd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c2: athrow
      // 8c3: aload 2
      // 8c4: sipush 2345
      // 8c7: ldc2_w 821934711205948949
      // 8ca: lload 4
      // 8cc: lxor
      // 8cd: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d2: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 8d5: aload 8
      // 8d7: ifnull ec1
      // 8da: goto 8e8
      // 8dd: ldc2_w 3817670921772610519
      // 8e0: lload 4
      // 8e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e7: athrow
      // 8e8: aload 2
      // 8e9: sipush 10816
      // 8ec: ldc2_w 6683460779951345012
      // 8ef: lload 4
      // 8f1: lxor
      // 8f2: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f7: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 8fa: aload 8
      // 8fc: ifnull ec1
      // 8ff: goto 90d
      // 902: ldc2_w 3817670921772610519
      // 905: lload 4
      // 907: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90c: athrow
      // 90d: aload 2
      // 90e: sipush 9217
      // 911: ldc2_w 5449185288009532171
      // 914: lload 4
      // 916: lxor
      // 917: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91c: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 91f: aload 8
      // 921: ifnull ec1
      // 924: goto 932
      // 927: ldc2_w 3817670921772610519
      // 92a: lload 4
      // 92c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 931: athrow
      // 932: aload 2
      // 933: sipush 20185
      // 936: ldc2_w 8408712712822893009
      // 939: lload 4
      // 93b: lxor
      // 93c: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 941: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 944: aload 8
      // 946: ifnull ec1
      // 949: goto 957
      // 94c: ldc2_w 3817670921772610519
      // 94f: lload 4
      // 951: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 956: athrow
      // 957: aload 2
      // 958: sipush 19708
      // 95b: ldc2_w 915566443029048227
      // 95e: lload 4
      // 960: lxor
      // 961: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 966: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 969: aload 8
      // 96b: iload 1
      // 96c: iflt 9ca
      // 96f: ifnonnull 9c4
      // 972: goto 980
      // 975: ldc2_w 3817670921772610519
      // 978: lload 4
      // 97a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97f: athrow
      // 980: aload 0
      // 981: lload 6
      // 983: invokevirtual com/zelix/_o9.P (J)Z
      // 986: goto 994
      // 989: ldc2_w 3817670921772610519
      // 98c: lload 4
      // 98e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 993: athrow
      // 994: ifeq 9b0
      // 997: aload 2
      // 998: iload 9
      // 99a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 99d: aload 8
      // 99f: ifnull ec1
      // 9a2: goto 9b0
      // 9a5: ldc2_w 3817670921772610519
      // 9a8: lload 4
      // 9aa: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9af: athrow
      // 9b0: aload 2
      // 9b1: iload 9
      // 9b3: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 9b6: goto 9c4
      // 9b9: ldc2_w 3817670921772610519
      // 9bc: lload 4
      // 9be: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c3: athrow
      // 9c4: iload 3
      // 9c5: ifle 9cd
      // 9c8: aload 8
      // 9ca: ifnull ec1
      // 9cd: iload 9
      // 9cf: iload 3
      // 9d0: ifle ae0
      // 9d3: aload 8
      // 9d5: ifnonnull ae0
      // 9d8: goto 9e6
      // 9db: ldc2_w 3817670921772610519
      // 9de: lload 4
      // 9e0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e5: athrow
      // 9e6: tableswitch 189 0 3 41 78 115 152
      // a04: ldc2_w 3817670921772610519
      // a07: lload 4
      // a09: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0e: athrow
      // a0f: aload 2
      // a10: sipush 17238
      // a13: ldc2_w 3863930179532727379
      // a16: lload 4
      // a18: lxor
      // a19: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1e: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // a21: aload 8
      // a23: ifnull ec1
      // a26: goto a34
      // a29: ldc2_w 3817670921772610519
      // a2c: lload 4
      // a2e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a33: athrow
      // a34: aload 2
      // a35: sipush 26162
      // a38: ldc2_w 7268707669646934277
      // a3b: lload 4
      // a3d: lxor
      // a3e: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a43: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // a46: aload 8
      // a48: ifnull ec1
      // a4b: goto a59
      // a4e: ldc2_w 3817670921772610519
      // a51: lload 4
      // a53: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a58: athrow
      // a59: aload 2
      // a5a: sipush 1275
      // a5d: ldc2_w 7894387105056678865
      // a60: lload 4
      // a62: lxor
      // a63: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a68: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // a6b: aload 8
      // a6d: ifnull ec1
      // a70: goto a7e
      // a73: ldc2_w 3817670921772610519
      // a76: lload 4
      // a78: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7d: athrow
      // a7e: aload 2
      // a7f: sipush 15728
      // a82: ldc2_w 1333741075530209906
      // a85: lload 4
      // a87: lxor
      // a88: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8d: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // a90: aload 8
      // a92: ifnull ec1
      // a95: goto aa3
      // a98: ldc2_w 3817670921772610519
      // a9b: lload 4
      // a9d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa2: athrow
      // aa3: aload 2
      // aa4: sipush 15230
      // aa7: ldc2_w 4756326968792931431
      // aaa: lload 4
      // aac: lxor
      // aad: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab2: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // ab5: aload 8
      // ab7: iload 1
      // ab8: iflt b16
      // abb: ifnonnull b10
      // abe: goto acc
      // ac1: ldc2_w 3817670921772610519
      // ac4: lload 4
      // ac6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // acb: athrow
      // acc: aload 0
      // acd: lload 6
      // acf: invokevirtual com/zelix/_o9.P (J)Z
      // ad2: goto ae0
      // ad5: ldc2_w 3817670921772610519
      // ad8: lload 4
      // ada: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // adf: athrow
      // ae0: ifeq afc
      // ae3: aload 2
      // ae4: iload 9
      // ae6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // ae9: aload 8
      // aeb: ifnull ec1
      // aee: goto afc
      // af1: ldc2_w 3817670921772610519
      // af4: lload 4
      // af6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // afb: athrow
      // afc: aload 2
      // afd: iload 9
      // aff: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // b02: goto b10
      // b05: ldc2_w 3817670921772610519
      // b08: lload 4
      // b0a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0f: athrow
      // b10: iload 1
      // b11: ifle b19
      // b14: aload 8
      // b16: ifnull ec1
      // b19: iload 9
      // b1b: iload 1
      // b1c: iflt c2c
      // b1f: aload 8
      // b21: ifnonnull c2c
      // b24: goto b32
      // b27: ldc2_w 3817670921772610519
      // b2a: lload 4
      // b2c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b31: athrow
      // b32: tableswitch 189 0 3 41 78 115 152
      // b50: ldc2_w 3817670921772610519
      // b53: lload 4
      // b55: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5a: athrow
      // b5b: aload 2
      // b5c: sipush 20437
      // b5f: ldc2_w 958554663163177148
      // b62: lload 4
      // b64: lxor
      // b65: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // b6d: aload 8
      // b6f: ifnull ec1
      // b72: goto b80
      // b75: ldc2_w 3817670921772610519
      // b78: lload 4
      // b7a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7f: athrow
      // b80: aload 2
      // b81: sipush 3191
      // b84: ldc2_w 6779208013011086090
      // b87: lload 4
      // b89: lxor
      // b8a: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8f: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // b92: aload 8
      // b94: ifnull ec1
      // b97: goto ba5
      // b9a: ldc2_w 3817670921772610519
      // b9d: lload 4
      // b9f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba4: athrow
      // ba5: aload 2
      // ba6: sipush 24851
      // ba9: ldc2_w 2937195445141898795
      // bac: lload 4
      // bae: lxor
      // baf: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb4: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // bb7: aload 8
      // bb9: ifnull ec1
      // bbc: goto bca
      // bbf: ldc2_w 3817670921772610519
      // bc2: lload 4
      // bc4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc9: athrow
      // bca: aload 2
      // bcb: sipush 32390
      // bce: ldc2_w 1337791252536367544
      // bd1: lload 4
      // bd3: lxor
      // bd4: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd9: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // bdc: aload 8
      // bde: ifnull ec1
      // be1: goto bef
      // be4: ldc2_w 3817670921772610519
      // be7: lload 4
      // be9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bee: athrow
      // bef: aload 2
      // bf0: sipush 15816
      // bf3: ldc2_w 2465345745539980006
      // bf6: lload 4
      // bf8: lxor
      // bf9: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bfe: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // c01: aload 8
      // c03: iload 1
      // c04: iflt c62
      // c07: ifnonnull c5c
      // c0a: goto c18
      // c0d: ldc2_w 3817670921772610519
      // c10: lload 4
      // c12: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c17: athrow
      // c18: aload 0
      // c19: lload 6
      // c1b: invokevirtual com/zelix/_o9.P (J)Z
      // c1e: goto c2c
      // c21: ldc2_w 3817670921772610519
      // c24: lload 4
      // c26: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2b: athrow
      // c2c: ifeq c48
      // c2f: aload 2
      // c30: iload 9
      // c32: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // c35: aload 8
      // c37: ifnull ec1
      // c3a: goto c48
      // c3d: ldc2_w 3817670921772610519
      // c40: lload 4
      // c42: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c47: athrow
      // c48: aload 2
      // c49: iload 9
      // c4b: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // c4e: goto c5c
      // c51: ldc2_w 3817670921772610519
      // c54: lload 4
      // c56: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5b: athrow
      // c5c: iload 3
      // c5d: ifle c65
      // c60: aload 8
      // c62: ifnull ec1
      // c65: iload 9
      // c67: iload 1
      // c68: ifle d78
      // c6b: aload 8
      // c6d: ifnonnull d78
      // c70: goto c7e
      // c73: ldc2_w 3817670921772610519
      // c76: lload 4
      // c78: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7d: athrow
      // c7e: tableswitch 189 0 3 41 78 115 152
      // c9c: ldc2_w 3817670921772610519
      // c9f: lload 4
      // ca1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca6: athrow
      // ca7: aload 2
      // ca8: sipush 26821
      // cab: ldc2_w 8226372540669136836
      // cae: lload 4
      // cb0: lxor
      // cb1: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb6: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // cb9: aload 8
      // cbb: ifnull ec1
      // cbe: goto ccc
      // cc1: ldc2_w 3817670921772610519
      // cc4: lload 4
      // cc6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ccb: athrow
      // ccc: aload 2
      // ccd: sipush 9184
      // cd0: ldc2_w 5911856398818755768
      // cd3: lload 4
      // cd5: lxor
      // cd6: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cdb: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // cde: aload 8
      // ce0: ifnull ec1
      // ce3: goto cf1
      // ce6: ldc2_w 3817670921772610519
      // ce9: lload 4
      // ceb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf0: athrow
      // cf1: aload 2
      // cf2: sipush 23253
      // cf5: ldc2_w 8360836641237614046
      // cf8: lload 4
      // cfa: lxor
      // cfb: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d00: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // d03: aload 8
      // d05: ifnull ec1
      // d08: goto d16
      // d0b: ldc2_w 3817670921772610519
      // d0e: lload 4
      // d10: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d15: athrow
      // d16: aload 2
      // d17: sipush 22111
      // d1a: ldc2_w 4884730087312339278
      // d1d: lload 4
      // d1f: lxor
      // d20: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d25: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // d28: aload 8
      // d2a: ifnull ec1
      // d2d: goto d3b
      // d30: ldc2_w 3817670921772610519
      // d33: lload 4
      // d35: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3a: athrow
      // d3b: aload 2
      // d3c: sipush 2779
      // d3f: ldc2_w 1482854069166599650
      // d42: lload 4
      // d44: lxor
      // d45: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // d4d: aload 8
      // d4f: iload 1
      // d50: iflt daa
      // d53: ifnonnull da8
      // d56: goto d64
      // d59: ldc2_w 3817670921772610519
      // d5c: lload 4
      // d5e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d63: athrow
      // d64: aload 0
      // d65: lload 6
      // d67: invokevirtual com/zelix/_o9.P (J)Z
      // d6a: goto d78
      // d6d: ldc2_w 3817670921772610519
      // d70: lload 4
      // d72: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d77: athrow
      // d78: ifeq d94
      // d7b: aload 2
      // d7c: iload 9
      // d7e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // d81: aload 8
      // d83: ifnull ec1
      // d86: goto d94
      // d89: ldc2_w 3817670921772610519
      // d8c: lload 4
      // d8e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d93: athrow
      // d94: aload 2
      // d95: iload 9
      // d97: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // d9a: goto da8
      // d9d: ldc2_w 3817670921772610519
      // da0: lload 4
      // da2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da7: athrow
      // da8: aload 8
      // daa: iload 3
      // dab: ifle dc5
      // dae: ifnull ec1
      // db1: aload 2
      // db2: sipush 25023
      // db5: ldc2_w 5177969398578415291
      // db8: lload 4
      // dba: lxor
      // dbb: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc0: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // dc3: aload 8
      // dc5: iload 3
      // dc6: ifle e4a
      // dc9: ifnonnull e48
      // dcc: goto dda
      // dcf: ldc2_w 3817670921772610519
      // dd2: lload 4
      // dd4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd9: athrow
      // dda: iload 1
      // ddb: ifle e3a
      // dde: aload 0
      // ddf: lload 6
      // de1: invokevirtual com/zelix/_o9.P (J)Z
      // de4: ifeq e21
      // de7: goto df5
      // dea: ldc2_w 3817670921772610519
      // ded: lload 4
      // def: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // df4: athrow
      // df5: aload 2
      // df6: iload 9
      // df8: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // dfb: aload 2
      // dfc: aload 0
      // dfd: bipush 0
      // dfe: anewarray 357
      // e01: ldc2_w 3353703252641302209
      // e04: lload 4
      // e06: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // e0e: aload 8
      // e10: ifnull ec1
      // e13: goto e21
      // e16: ldc2_w 3817670921772610519
      // e19: lload 4
      // e1b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e20: athrow
      // e21: aload 2
      // e22: iload 9
      // e24: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // e27: aload 2
      // e28: aload 0
      // e29: bipush 0
      // e2a: anewarray 357
      // e2d: ldc2_w 3353703252641302209
      // e30: lload 4
      // e32: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e37: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // e3a: goto e48
      // e3d: ldc2_w 3817670921772610519
      // e40: lload 4
      // e42: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e47: athrow
      // e48: aload 8
      // e4a: iload 1
      // e4b: ifle e65
      // e4e: ifnull ec1
      // e51: aload 2
      // e52: sipush 8232
      // e55: ldc2_w 1401522851312518974
      // e58: lload 4
      // e5a: lxor
      // e5b: invokedynamic e (IJ)I bsm=com/zelix/_o9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e60: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // e63: aload 8
      // e65: ifnonnull ebe
      // e68: goto e76
      // e6b: ldc2_w 3817670921772610519
      // e6e: lload 4
      // e70: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e75: athrow
      // e76: iload 1
      // e77: ifle eb0
      // e7a: aload 0
      // e7b: lload 6
      // e7d: invokevirtual com/zelix/_o9.P (J)Z
      // e80: ifeq eaa
      // e83: goto e91
      // e86: ldc2_w 3817670921772610519
      // e89: lload 4
      // e8b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e90: athrow
      // e91: aload 2
      // e92: iload 9
      // e94: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // e97: aload 8
      // e99: ifnull ec1
      // e9c: goto eaa
      // e9f: ldc2_w 3817670921772610519
      // ea2: lload 4
      // ea4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ea9: athrow
      // eaa: aload 2
      // eab: iload 9
      // ead: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // eb0: goto ebe
      // eb3: ldc2_w 3817670921772610519
      // eb6: lload 4
      // eb8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ebd: athrow
      // ebe: goto ec1
      // ec1: return
   }

   public final boolean I(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 2290070615942595074
      // 03: lload 1
      // 04: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: astore 3
      // 0a: getstatic com/zelix/_k7.D [I
      // 0d: aload 0
      // 0e: getfield com/zelix/_o9.O Lcom/zelix/y4;
      // 11: invokevirtual com/zelix/y4.ordinal ()I
      // 14: iaload
      // 15: aload 3
      // 16: ifnonnull 71
      // 19: tableswitch 87 1 12 73 73 73 73 73 73 73 73 73 73 73 85
      // 58: ldc2_w 328033753878299553
      // 5b: lload 1
      // 5c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush 1
      // 63: ireturn
      // 64: ldc2_w 328033753878299553
      // 67: lload 1
      // 68: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 0
      // 6f: ireturn
      // 70: bipush 1
      // 71: ireturn
   }

   public int g() {
      return this.C.H();
   }

   static {
      long var11 = b ^ 43574030765026L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal(
         "Tg\u0012¢%k'\u008d8G\u0083#\u0080\u0002¾?\u0080Ñã×\u0001¿Kð\u0017\u0096\u0092P]@À/\u0007\u0002ð\u001d\u0083°\u001ex".getBytes("ISO-8859-1")
      );
      String var22 = b(var15).intern();
      int var10001 = -1;
      g = var22;
      m = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[111];
      int var3 = 0;
      String var4 = "Çï8\u0091·\u0001¿Â\u0084ëM¡-\u0093fwÉ\u0095¤¾\"'ÈX¨ÍO\u009c²\"ö(ãlVþôýQà<RcS\u009bn>\u0018\u008da^øP3¶£{±ÛÞ\u009do\u009d82NK:Fr~.µ \u009eÄ=H\u0093\u0018g\u008c\u008dT\u009b)?÷J\u009e?Ñà\t8¢æXÁ½Ø^ê\u0010«@\t,ïZ{Oá\u0013¦ò§ï\u001a©¸f¿\\\b¬Lkù\u0090ûfü|:_Mâ2\u0087í/àèóA\u0093æXR¸é\u000fU\u0019)£ð\u0086¨[Á\u001c}È&\u0019`oA\u009a-Û\u000buôb\b5´A ²\u0092¬\u0005/¬_,s}Éo8%Í\"±d0?·*\"\u000fë/O\u009aÝ\u0012Ô)23²\u0016\u008b\u008dþ\u0083\u008cÍ'P~ÁÍ\" ûLýÁ\b8î×ÔâNk\u0081!æ\u0003jÌ\u0084\u0094[<Ï\u0003^pÎòé\u001eà\u001fÏ{\u007fÉÄ\u0099D²fÒ\u0014C£1\u009d¸.\u0013îëÊ¬¯\u0099\u0000©î\u001e\u009bìáíQ¨\u001aB\u001eëøÎHcò\u001dÑ-ð*-\u009cR\u0091\u000f´\u0013åhWò¨\u0093ç2!\u0005ß»W¾i\u009eÙ§+{¨\f\u001a\u0015v\u008bõëÊõ\u000e\u0093àxÅùz\u0018 \u0098\u007faü@Å£\u000bÌágê\bTA3p÷vb ó\u001c·e=ã©\u00168M*è\u008eFF\u0085\u009dèÉËµý\u0013\u008eÅâF\\¡\u001f×=X\u0010\u0086g1D\u0010 \u0092\u0003j(æGj\u009d(ß\u009c°zd®ÝïÇz{}¬Ueû\u008ae¶n\u0088`·SÒ(þJ1\u008a&P2Ì\u0013\u0003¥éf)P\u0012øæ\u0082Å3Ú\r\u0098HII\u0099\u001a\u007f\\eo\u008cªD\u0080éG¦K\u0091\u0001\u0011¢\nòí|Ý^eÝ\u001dÊ¶\u0016`\u001bêeIÕçIÞµ(5s\u0099·\u0015µnK\u0094\u008c-\u0084js\u00add[\u008f\b\u009fúNö\u008a¨.\u009e\u009f\u0007\"%¸w\u009fP2ÞéÔú\u0017\u0018\u0011Û\u00ad}t9ÿã\u0006\t¼²³£5PØ\u0099Ä\u0019Dæº\u001bÍ\u008fTêxzÕSX¬Ð\u0083æÀ\u000eð:ÂùZÅSëÎßI÷u\u009a1\u0010á®\u0003×\u0018ó\u0000GÄ\u0099Æ{(ÆS\u009aþ\u009f\u009c ¤Àçß1×¨k\u0015\u0088?¥\u007f´,.ÈÀtæÁ\u0091²SxMRÃ\u008dmi_ì}fõ\u0018ñ¡\u0088\u0099[\u0005\u0099\f2ü\u008ckÔ\u001e\u0084½F2\u0001ÄÿéÊfb¨·%\u0089ý°\nì{ý\u009fAê\u00922`í,ð²ºa\u000bß\u0089¾\u008d\u001cÞO;&\\g7ñ L¥_$>à´?\u0090TûôA\u0015æ\\F¯\u0013\u0001\u00997´Öv\u0082\u0011)\u001e¾¸?M}Ão'ë\u0017\u0092Úc\u0086ÖÐ\u001bb\u0001´`àS\u0014\tÞ*bm¾´5·p\tÃG\u0099\u0080lÅ[\u0019®0\\W\u009a\ryå·\u008a|È\u0002\u0016\u0097t\u001e\b/Z\u009c\b\u008cB¶éS65\u000b¥\u0014ÕHç\b\u008f\u00191\u0099¥2ü\u001bËvñB÷\u008b5þ¨x\u00969|}/É·\"ò";
      int var5 = "Çï8\u0091·\u0001¿Â\u0084ëM¡-\u0093fwÉ\u0095¤¾\"'ÈX¨ÍO\u009c²\"ö(ãlVþôýQà<RcS\u009bn>\u0018\u008da^øP3¶£{±ÛÞ\u009do\u009d82NK:Fr~.µ \u009eÄ=H\u0093\u0018g\u008c\u008dT\u009b)?÷J\u009e?Ñà\t8¢æXÁ½Ø^ê\u0010«@\t,ïZ{Oá\u0013¦ò§ï\u001a©¸f¿\\\b¬Lkù\u0090ûfü|:_Mâ2\u0087í/àèóA\u0093æXR¸é\u000fU\u0019)£ð\u0086¨[Á\u001c}È&\u0019`oA\u009a-Û\u000buôb\b5´A ²\u0092¬\u0005/¬_,s}Éo8%Í\"±d0?·*\"\u000fë/O\u009aÝ\u0012Ô)23²\u0016\u008b\u008dþ\u0083\u008cÍ'P~ÁÍ\" ûLýÁ\b8î×ÔâNk\u0081!æ\u0003jÌ\u0084\u0094[<Ï\u0003^pÎòé\u001eà\u001fÏ{\u007fÉÄ\u0099D²fÒ\u0014C£1\u009d¸.\u0013îëÊ¬¯\u0099\u0000©î\u001e\u009bìáíQ¨\u001aB\u001eëøÎHcò\u001dÑ-ð*-\u009cR\u0091\u000f´\u0013åhWò¨\u0093ç2!\u0005ß»W¾i\u009eÙ§+{¨\f\u001a\u0015v\u008bõëÊõ\u000e\u0093àxÅùz\u0018 \u0098\u007faü@Å£\u000bÌágê\bTA3p÷vb ó\u001c·e=ã©\u00168M*è\u008eFF\u0085\u009dèÉËµý\u0013\u008eÅâF\\¡\u001f×=X\u0010\u0086g1D\u0010 \u0092\u0003j(æGj\u009d(ß\u009c°zd®ÝïÇz{}¬Ueû\u008ae¶n\u0088`·SÒ(þJ1\u008a&P2Ì\u0013\u0003¥éf)P\u0012øæ\u0082Å3Ú\r\u0098HII\u0099\u001a\u007f\\eo\u008cªD\u0080éG¦K\u0091\u0001\u0011¢\nòí|Ý^eÝ\u001dÊ¶\u0016`\u001bêeIÕçIÞµ(5s\u0099·\u0015µnK\u0094\u008c-\u0084js\u00add[\u008f\b\u009fúNö\u008a¨.\u009e\u009f\u0007\"%¸w\u009fP2ÞéÔú\u0017\u0018\u0011Û\u00ad}t9ÿã\u0006\t¼²³£5PØ\u0099Ä\u0019Dæº\u001bÍ\u008fTêxzÕSX¬Ð\u0083æÀ\u000eð:ÂùZÅSëÎßI÷u\u009a1\u0010á®\u0003×\u0018ó\u0000GÄ\u0099Æ{(ÆS\u009aþ\u009f\u009c ¤Àçß1×¨k\u0015\u0088?¥\u007f´,.ÈÀtæÁ\u0091²SxMRÃ\u008dmi_ì}fõ\u0018ñ¡\u0088\u0099[\u0005\u0099\f2ü\u008ckÔ\u001e\u0084½F2\u0001ÄÿéÊfb¨·%\u0089ý°\nì{ý\u009fAê\u00922`í,ð²ºa\u000bß\u0089¾\u008d\u001cÞO;&\\g7ñ L¥_$>à´?\u0090TûôA\u0015æ\\F¯\u0013\u0001\u00997´Öv\u0082\u0011)\u001e¾¸?M}Ão'ë\u0017\u0092Úc\u0086ÖÐ\u001bb\u0001´`àS\u0014\tÞ*bm¾´5·p\tÃG\u0099\u0080lÅ[\u0019®0\\W\u009a\ryå·\u008a|È\u0002\u0016\u0097t\u001e\b/Z\u009c\b\u008cB¶éS65\u000b¥\u0014ÕHç\b\u008f\u00191\u0099¥2ü\u001bËvñB÷\u008b5þ¨x\u00969|}/É·\"ò"
         .length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var27 = -1;

         while (true) {
            long var8 = var24;
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
            long var29 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     k = var6;
                     l = new Integer[111];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "Ä\u0018÷±eì\u008cZB^ºmÜd?I";
                  var5 = "Ä\u0018÷±eì\u008cZB^ºmÜd?I".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var27 = 0;
         }
      }
   }

   private static gj b(gj var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17809;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("com/zelix/_o9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
