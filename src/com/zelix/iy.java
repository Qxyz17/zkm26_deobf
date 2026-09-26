package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class iy extends oz implements el {
   iq K;
   int i = -1;
   private static final long a = prr.a(8136639647824093432L, -3087924575379772145L, MethodHandles.lookup().lookupClass()).a(87177218596174L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map k;

   public boolean L(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 99188847103644L;
      return m44.a<"r">(this, new Object[]{var4}, 8517452385825519903L, var2);
   }

   public String R(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 63989368199059L;
      int var4 = (int)((var2 ^ 63989368199059L) >>> 32);
      int var5 = (int)((var2 ^ 63989368199059L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      byte var10002 = (byte)var5;
      Object[] var10005 = new Object[]{null, null, var6};
      var10005[1] = Integer.valueOf(var10002);
      var10005[0] = var4;
      return m44.a<"w">(this, var10005, 2829288529623150650L, var2);
   }

   public boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public final boolean v(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/v7
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 5
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Integer
      // 023: invokevirtual java/lang/Integer.intValue ()I
      // 026: istore 4
      // 028: pop
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 32634434743377
      // 02f: lxor
      // 030: lstore 7
      // 032: pop2
      // 033: ldc2_w -4319878175848984624
      // 036: lload 5
      // 038: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 9
      // 03f: aload 0
      // 040: getfield com/zelix/iy.X I
      // 043: iload 9
      // 045: ifeq 19a
      // 048: tableswitch 290 153 201 236 236 236 236 236 236 236 236 236 236 236 236 288 288 223 223 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 290 288 288 223 223
      // 11c: ldc2_w -2307151734583087823
      // 11f: lload 5
      // 121: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: bipush 0
      // 128: ireturn
      // 129: ldc2_w -2307151734583087823
      // 12c: lload 5
      // 12e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: iload 3
      // 135: iload 9
      // 137: lload 5
      // 139: lconst_0
      // 13a: lcmp
      // 13b: iflt 143
      // 13e: ifeq 163
      // 141: iload 4
      // 143: if_icmplt 166
      // 146: goto 154
      // 149: ldc2_w -2307151734583087823
      // 14c: lload 5
      // 14e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: bipush 1
      // 155: goto 163
      // 158: ldc2_w -2307151734583087823
      // 15b: lload 5
      // 15d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: goto 167
      // 166: bipush 0
      // 167: ireturn
      // 168: bipush 0
      // 169: ireturn
      // 16a: bipush 0
      // 16b: bipush 1
      // 16c: anewarray 16
      // 16f: dup
      // 170: bipush 0
      // 171: new java/lang/StringBuilder
      // 174: dup
      // 175: invokespecial java/lang/StringBuilder.<init> ()V
      // 178: sipush 24073
      // 17b: ldc2_w 4733828935930848132
      // 17e: lload 5
      // 180: lxor
      // 181: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: aload 0
      // 18a: getfield com/zelix/iy.X I
      // 18d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 190: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 193: aastore
      // 194: lload 7
      // 196: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 199: bipush 0
      // 19a: ireturn
   }

   public final void X(Object[] var1) {
      long var3 = (Long)var1[0];
      df var2 = (df)var1[1];
      long var5 = (var3 ^ 122312426200344L) >>> 16;
      int var7 = (int)((var3 ^ 122312426200344L) << 48 >>> 48);
      var2.L(var5, (char)var7, this.K, this);
   }

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 62838192416743L;
      int var4 = (int)((var2 ^ 62838192416743L) >>> 32);
      int var5 = (int)((var2 ^ 62838192416743L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      byte var10002 = (byte)var5;
      Object[] var10005 = new Object[]{null, null, var6};
      var10005[1] = Integer.valueOf(var10002);
      var10005[0] = var4;
      return m44.a<"s">(this, var10005, -7550383759637692338L, var2);
   }

   int J() {
      return this.K.B() - this.i;
   }

   public boolean S(Object[] param1) {
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
      // 00e: ldc2_w 135930187418874
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w 4284947856774443844
      // 018: lload 2
      // 019: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: istore 6
      // 020: aload 0
      // 021: getfield com/zelix/iy.X I
      // 024: iload 6
      // 026: ifne 143
      // 029: tableswitch 235 153 201 233 233 233 233 233 233 233 233 233 233 233 233 233 233 233 221 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 233 233 233 221
      // 0fc: ldc2_w 4562216474992004506
      // 0ff: lload 2
      // 100: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 1
      // 107: ireturn
      // 108: ldc2_w 4562216474992004506
      // 10b: lload 2
      // 10c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: bipush 0
      // 113: ireturn
      // 114: bipush 0
      // 115: bipush 1
      // 116: anewarray 16
      // 119: dup
      // 11a: bipush 0
      // 11b: new java/lang/StringBuilder
      // 11e: dup
      // 11f: invokespecial java/lang/StringBuilder.<init> ()V
      // 122: sipush 10697
      // 125: ldc2_w 7771462599669888233
      // 128: lload 2
      // 129: lxor
      // 12a: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: aload 0
      // 133: getfield com/zelix/iy.X I
      // 136: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 139: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13c: aastore
      // 13d: lload 4
      // 13f: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 142: bipush 0
      // 143: ireturn
   }

   public final boolean Y(long param1, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 94093767828000
      // 005: lxor
      // 006: lstore 5
      // 008: pop2
      // 009: ldc2_w 5367725136247488929
      // 00c: lload 1
      // 00d: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012: istore 7
      // 014: aload 0
      // 015: getfield com/zelix/iy.X I
      // 018: iload 7
      // 01a: ifeq 166
      // 01d: tableswitch 282 153 201 233 233 233 233 233 233 233 233 233 233 233 233 233 233 221 221 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 282 233 233 221 221
      // 0f0: ldc2_w 5875527926841549632
      // 0f3: lload 1
      // 0f4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: bipush 0
      // 0fb: ireturn
      // 0fc: ldc2_w 5875527926841549632
      // 0ff: lload 1
      // 100: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: iload 3
      // 107: iload 7
      // 109: lload 1
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: ifle 114
      // 10f: ifeq 132
      // 112: iload 4
      // 114: if_icmplt 135
      // 117: goto 124
      // 11a: ldc2_w 5875527926841549632
      // 11d: lload 1
      // 11e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: bipush 1
      // 125: goto 132
      // 128: ldc2_w 5875527926841549632
      // 12b: lload 1
      // 12c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: goto 136
      // 135: bipush 0
      // 136: ireturn
      // 137: bipush 0
      // 138: bipush 1
      // 139: anewarray 16
      // 13c: dup
      // 13d: bipush 0
      // 13e: new java/lang/StringBuilder
      // 141: dup
      // 142: invokespecial java/lang/StringBuilder.<init> ()V
      // 145: sipush 24073
      // 148: ldc2_w 4733767456196603381
      // 14b: lload 1
      // 14c: lxor
      // 14d: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: aload 0
      // 156: getfield com/zelix/iy.X I
      // 159: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 15c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15f: aastore
      // 160: lload 5
      // 162: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 165: bipush 0
      // 166: ireturn
   }

   int a(Object[] var1) {
      h1 var4 = (h1)var1[0];
      long var2 = (Long)var1[1];
      short var5 = m44.a<"t">(var4, 210846341583948441L, var2);
      return this.i + var5;
   }

   public iq D() {
      return this.K;
   }

   public List N(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 75996081100554
      // 05: lxor
      // 06: lstore 3
      // 07: dup2
      // 08: ldc2_w 101289198532722
      // 0b: lxor
      // 0c: lstore 5
      // 0e: pop2
      // 0f: ldc2_w -4988472562570415370
      // 12: lload 1
      // 13: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 0
      // 19: invokevirtual com/zelix/iy.J ()I
      // 1c: istore 8
      // 1e: istore 7
      // 20: iload 8
      // 22: sipush 29181
      // 25: ldc2_w 794729048389706312
      // 28: lload 1
      // 29: lxor
      // 2a: invokedynamic m (IJ)I bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: iload 7
      // 31: ifne 60
      // 34: if_icmplt 63
      // 37: goto 44
      // 3a: ldc2_w -4692068789427319768
      // 3d: lload 1
      // 3e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: iload 8
      // 46: sipush 7764
      // 49: ldc2_w 8517540753131015650
      // 4c: lload 1
      // 4d: lxor
      // 4e: invokedynamic m (IJ)I bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: goto 60
      // 56: ldc2_w -4692068789427319768
      // 59: lload 1
      // 5a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: if_icmple e8
      // 63: new java/util/ArrayList
      // 66: dup
      // 67: bipush 5
      // 68: invokespecial java/util/ArrayList.<init> (I)V
      // 6b: astore 9
      // 6d: aload 0
      // 6e: getfield com/zelix/iy.K Lcom/zelix/iq;
      // 71: astore 10
      // 73: new com/zelix/iq
      // 76: dup
      // 77: bipush 1
      // 78: bipush 1
      // 79: lload 5
      // 7b: invokespecial com/zelix/iq.<init> (ZIJ)V
      // 7e: astore 11
      // 80: new com/zelix/iq
      // 83: dup
      // 84: bipush 1
      // 85: bipush 1
      // 86: lload 5
      // 88: invokespecial com/zelix/iq.<init> (ZIJ)V
      // 8b: astore 12
      // 8d: aload 0
      // 8e: aload 11
      // 90: bipush 1
      // 91: anewarray 292
      // 94: dup_x1
      // 95: swap
      // 96: bipush 0
      // 97: swap
      // 98: aastore
      // 99: ldc2_w -6855092278335146480
      // 9c: lload 1
      // 9d: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: aload 9
      // a4: aload 0
      // a5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // a8: pop
      // a9: aload 9
      // ab: new com/zelix/ip
      // ae: dup
      // af: lload 3
      // b0: aload 12
      // b2: invokespecial com/zelix/ip.<init> (JLcom/zelix/iq;)V
      // b5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // b8: pop
      // b9: aload 9
      // bb: aload 11
      // bd: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // c0: pop
      // c1: aload 9
      // c3: new com/zelix/it
      // c6: dup
      // c7: sipush 12278
      // ca: ldc2_w 6881674053362826306
      // cd: lload 1
      // ce: lxor
      // cf: invokedynamic m (IJ)I bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: aload 10
      // d6: invokespecial com/zelix/it.<init> (ILcom/zelix/iq;)V
      // d9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // dc: pop
      // dd: aload 9
      // df: aload 12
      // e1: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // e4: pop
      // e5: aload 9
      // e7: areturn
      // e8: aconst_null
      // e9: areturn
   }

   public hz n(hz var1, boolean var2, char var3, int var4, boolean var5, loj var6, char var7, String var8) {
      long var9 = (long)var3 << 48 | (long)var4 << 32 >>> 16 | (long)var7 << 48 >>> 48;
      long var11 = var9 ^ 6215624408093L;
      long var13 = var9 ^ 114161761794490L;
      long var15 = var9 ^ 332116234582L;
      long var17 = (var9 ^ 65811635556040L) >>> 8;
      int var19 = (int)((var9 ^ 65811635556040L) << 56 >>> 56);
      long var20 = var9 ^ 129763427281871L;
      int var10000 = m44.a<"l">(-2575428984604371855L, var9);
      lby var23 = new lby(var17, var8, (byte)var19);
      boolean var22 = (boolean)var10000;
      v7[] var24 = var1.X();
      v7[] var25 = var1.T();
      Object var26 = null;
      int var27 = var24.length;
      fb var28 = var1.j();
      Set var29 = var1.k(var11);

      label37: {
         label36: {
            label35: {
               label34: {
                  label33: {
                     try {
                        var10000 = this.X;
                        if (var22) {
                           break label33;
                        }

                        switch (this.X) {
                           case 153:
                           case 154:
                           case 155:
                           case 156:
                           case 157:
                           case 158:
                              break label37;
                           case 159:
                           case 160:
                           case 161:
                           case 162:
                           case 163:
                           case 164:
                              break label36;
                           case 165:
                           case 166:
                              break label35;
                           case 167:
                           case 168:
                           case 200:
                           case 201:
                              return null;
                           case 169:
                           case 170:
                           case 171:
                           case 172:
                           case 173:
                           case 174:
                           case 175:
                           case 176:
                           case 177:
                           case 178:
                           case 179:
                           case 180:
                           case 181:
                           case 182:
                           case 183:
                           case 184:
                           case 185:
                           case 186:
                           case 187:
                           case 188:
                           case 189:
                           case 190:
                           case 191:
                           case 192:
                           case 193:
                           case 194:
                           case 195:
                           case 196:
                           case 197:
                           default:
                              break;
                           case 198:
                           case 199:
                              break label34;
                        }
                     } catch (n9 var30) {
                        throw m44.a<"l">(var30, -2853819735775073617L, var9);
                     }

                     var10000 = 0;
                  }

                  lk0.t((boolean)var10000, new String[]{b<"h">(24073, 4733736193005495322L ^ var9) + this.X + " " + var23}, var20);
                  return null;
               }

               var26 = v7.I(var27 - 1, var15);
               System.arraycopy(var24, 0, var26, 0, var27 - 1);
               return new hz((v7[])var26, var25, var13, var28, var29);
            }

            var26 = v7.I(var27 - 2, var15);
            System.arraycopy(var24, 0, var26, 0, var27 - 2);
            return new hz((v7[])var26, var25, var13, var28, var29);
         }

         var26 = v7.I(var27 - 2, var15);
         System.arraycopy(var24, 0, var26, 0, var27 - 2);
         return new hz((v7[])var26, var25, var13, var28, var29);
      }

      var26 = v7.I(var27 - 1, var15);
      System.arraycopy(var24, 0, var26, 0, var27 - 1);
      return new hz((v7[])var26, var25, var13, var28, var29);
   }

   public void P(long var1, int var3) {
      this.i = var3;
   }

   public void h(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/io/PrintWriter
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 5
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 102513965841398
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 135779181519990
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 9522033084411
      // 02f: lxor
      // 030: dup2
      // 031: bipush 32
      // 033: lushr
      // 034: l2i
      // 035: istore 10
      // 037: dup2
      // 038: bipush 32
      // 03a: lshl
      // 03b: bipush 56
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 11
      // 041: dup2
      // 042: bipush 40
      // 044: lshl
      // 045: bipush 40
      // 047: lushr
      // 048: l2i
      // 049: istore 12
      // 04b: pop2
      // 04c: dup2
      // 04d: ldc2_w 1741840435613
      // 050: lxor
      // 051: lstore 13
      // 053: pop2
      // 054: ldc2_w -1142121718372861931
      // 057: lload 2
      // 058: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: new java/lang/StringBuilder
      // 060: dup
      // 061: sipush 20222
      // 064: ldc2_w 1845576663504000938
      // 067: lload 2
      // 068: lxor
      // 069: invokedynamic m (IJ)I bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: invokespecial java/lang/StringBuilder.<init> (I)V
      // 071: astore 16
      // 073: istore 15
      // 075: aload 0
      // 076: iload 10
      // 078: iload 11
      // 07a: i2b
      // 07b: iload 12
      // 07d: bipush 3
      // 07e: anewarray 292
      // 081: dup_x1
      // 082: swap
      // 083: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 086: bipush 2
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: bipush 1
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: ldc2_w -636251684499120046
      // 09c: lload 2
      // 09d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: astore 17
      // 0a4: aload 16
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: aload 17
      // 0af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b2: ldc " "
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: aload 0
      // 0b8: getfield com/zelix/iy.K Lcom/zelix/iq;
      // 0bb: lload 13
      // 0bd: bipush 1
      // 0be: anewarray 292
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w -839484870266077503
      // 0cd: lload 2
      // 0ce: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: pop
      // 0dd: aload 0
      // 0de: getfield com/zelix/iy.X I
      // 0e1: lload 8
      // 0e3: dup2_x1
      // 0e4: pop2
      // 0e5: bipush 2
      // 0e6: anewarray 292
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ee: bipush 1
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: ldc2_w -1509257710096725591
      // 0fd: lload 2
      // 0fe: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: astore 18
      // 105: lload 6
      // 107: aload 18
      // 109: aload 0
      // 10a: getfield com/zelix/iy.K Lcom/zelix/iq;
      // 10d: lload 13
      // 10f: bipush 1
      // 110: anewarray 292
      // 113: dup_x2
      // 114: dup_x2
      // 115: pop
      // 116: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 119: bipush 0
      // 11a: swap
      // 11b: aastore
      // 11c: ldc2_w -839484870266077503
      // 11f: lload 2
      // 120: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: bipush 3
      // 126: anewarray 292
      // 129: dup_x1
      // 12a: swap
      // 12b: bipush 2
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 1
      // 131: swap
      // 132: aastore
      // 133: dup_x2
      // 134: dup_x2
      // 135: pop
      // 136: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 139: bipush 0
      // 13a: swap
      // 13b: aastore
      // 13c: ldc2_w -1214410100789358428
      // 13f: lload 2
      // 140: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: astore 18
      // 147: iload 15
      // 149: ifne 1ac
      // 14c: aload 18
      // 14e: invokevirtual java/lang/String.length ()I
      // 151: ifle 188
      // 154: goto 161
      // 157: ldc2_w -864320932499847477
      // 15a: lload 2
      // 15b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: aload 16
      // 163: new java/lang/StringBuilder
      // 166: dup
      // 167: invokespecial java/lang/StringBuilder.<init> ()V
      // 16a: ldc "\t"
      // 16c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f: aload 18
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: pop
      // 17b: goto 188
      // 17e: ldc2_w -864320932499847477
      // 181: lload 2
      // 182: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: aload 4
      // 18a: new java/lang/StringBuilder
      // 18d: dup
      // 18e: invokespecial java/lang/StringBuilder.<init> ()V
      // 191: aload 5
      // 193: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 199: aload 5
      // 19b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a1: aload 16
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a9: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1ac: return
   }

   public final void Q(Map var1, l6q var2, List var3, long var4) {
      long var6 = var4 ^ 66707108634976L;
      boolean var10000 = m44.a<"o">(-3097945099772748067L, var4);
      Object var9 = null;
      boolean var8 = var10000;
      nc var13 = (nc)(var9 = (nc)var1.get(this.K));

      label21: {
         label20: {
            try {
               if (!var8) {
                  break label20;
               }

               if (var13 != null) {
                  break label21;
               }
            } catch (n9 var11) {
               throw m44.a<"o">(var11, -3533620025567822788L, var4);
            }

            var9 = new nc();
            nc var14 = (nc)var1.put(this.K, var9);
         }

         var3.add(var9);
      }

      var2.t(this, var9, var6);
   }

   iy(int param1, h1 param2, long param3, int param5, l6q param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/iy.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: lload 3
      // 07: dup2
      // 08: ldc2_w 45116770646514
      // 0b: lxor
      // 0c: lstore 7
      // 0e: dup2
      // 0f: ldc2_w 115754097656611
      // 12: lxor
      // 13: lstore 9
      // 15: dup2
      // 16: ldc2_w 88124632282063
      // 19: lxor
      // 1a: lstore 11
      // 1c: pop2
      // 1d: aload 0
      // 1e: iload 1
      // 1f: invokespecial com/zelix/oz.<init> (I)V
      // 22: ldc2_w 6376654156882497613
      // 25: lload 3
      // 26: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 0
      // 2c: iload 5
      // 2e: putfield com/zelix/iy.i I
      // 31: istore 13
      // 33: aload 0
      // 34: aload 2
      // 35: lload 9
      // 37: bipush 2
      // 38: anewarray 292
      // 3b: dup_x2
      // 3c: dup_x2
      // 3d: pop
      // 3e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41: bipush 1
      // 42: swap
      // 43: aastore
      // 44: dup_x1
      // 45: swap
      // 46: bipush 0
      // 47: swap
      // 48: aastore
      // 49: ldc2_w 6502084416023804705
      // 4c: lload 3
      // 4d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: istore 14
      // 54: iload 13
      // 56: ifne f4
      // 59: iload 14
      // 5b: ifge dc
      // 5e: goto 6b
      // 61: ldc2_w 6654459611106913939
      // 64: lload 3
      // 65: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: new com/zelix/n9
      // 6e: dup
      // 6f: new java/lang/StringBuilder
      // 72: dup
      // 73: invokespecial java/lang/StringBuilder.<init> ()V
      // 76: sipush 15179
      // 79: ldc2_w 2948134166870148451
      // 7c: lload 3
      // 7d: lxor
      // 7e: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: iload 1
      // 87: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 8a: sipush 16962
      // 8d: ldc2_w 4255276011545574504
      // 90: lload 3
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: iload 5
      // 9c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9f: sipush 32256
      // a2: ldc2_w 2880170167528620075
      // a5: lload 3
      // a6: lxor
      // a7: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // af: aload 0
      // b0: getfield com/zelix/iy.i I
      // b3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b6: sipush 32256
      // b9: ldc2_w 2880170167528620075
      // bc: lload 3
      // bd: lxor
      // be: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c6: iload 14
      // c8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ce: invokespecial com/zelix/n9.<init> (Ljava/lang/String;)V
      // d1: athrow
      // d2: ldc2_w 6654459611106913939
      // d5: lload 3
      // d6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: aload 6
      // de: ldc2_w 4700524028773557063
      // e1: lload 3
      // e2: invokedynamic l (JJ)Lcom/zelix/o9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e7: lload 7
      // e9: iload 14
      // eb: invokevirtual com/zelix/o9.e (JI)Ljava/lang/Integer;
      // ee: aload 0
      // ef: lload 11
      // f1: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // f4: return
   }

   public int T(char var1, int var2, char var3) {
      return 3;
   }

   public final boolean e(long param1, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: bipush 32
      // 003: lshl
      // 004: iload 3
      // 005: i2l
      // 006: bipush 32
      // 008: lshl
      // 009: bipush 32
      // 00b: lushr
      // 00c: lor
      // 00d: lstore 4
      // 00f: lload 4
      // 011: dup2
      // 012: ldc2_w 75731937642253
      // 015: lxor
      // 016: lstore 6
      // 018: pop2
      // 019: ldc2_w -1116877179038697293
      // 01c: lload 4
      // 01e: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: istore 8
      // 025: aload 0
      // 026: getfield com/zelix/iy.X I
      // 029: iload 8
      // 02b: ifne 14a
      // 02e: tableswitch 236 153 201 234 234 234 234 234 234 234 234 234 234 234 234 234 234 221 221 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 234 234 221 221
      // 100: ldc2_w -817683749207439763
      // 103: lload 4
      // 105: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: bipush 0
      // 10c: ireturn
      // 10d: ldc2_w -817683749207439763
      // 110: lload 4
      // 112: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: bipush 1
      // 119: ireturn
      // 11a: bipush 0
      // 11b: bipush 1
      // 11c: anewarray 16
      // 11f: dup
      // 120: bipush 0
      // 121: new java/lang/StringBuilder
      // 124: dup
      // 125: invokespecial java/lang/StringBuilder.<init> ()V
      // 128: sipush 24073
      // 12b: ldc2_w 4733750607733688536
      // 12e: lload 4
      // 130: lxor
      // 131: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: aload 0
      // 13a: getfield com/zelix/iy.X I
      // 13d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 140: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 143: aastore
      // 144: lload 6
      // 146: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 149: bipush 1
      // 14a: ireturn
   }

   public final boolean T(long var1) {
      return false;
   }

   public boolean N() {
      return true;
   }

   public void d(Integer var1, iq var2, long var3) {
      long var5 = var3 ^ 113014586918199L;
      this.K = var2;
      Object[] var10004 = new Object[]{null, var5};
      var10004[0] = true;
      m44.a<"q">(var2, var10004, 4953808353644756951L, var3);
   }

   public m7 i(long var1) {
      return m44.a<"k">(-5891862527333598110L, var1);
   }

   public void G(short var1, int var2, DataOutputStream var3, int var4) {
      long var5 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 116040742447774L;
      long var10001 = var5 ^ 0L;
      int var9 = (int)((var5 ^ 0L) >>> 48);
      int var10 = (int)((var5 ^ 0L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      super.G((short)var9, var10, var3, var11);
      this.U(var3, var7);
   }

   void s(Object[] var1) {
      iq var2 = (iq)var1[0];
      this.K = var2;
   }

   public iy(int var1, iq var2) {
      super(var1);
      this.K = var2;
   }

   public final boolean b(Object[] param1) {
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
      // 00e: ldc2_w 84112812136785
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w -1235105054321776913
      // 018: lload 2
      // 019: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: istore 6
      // 020: aload 0
      // 021: getfield com/zelix/iy.X I
      // 024: iload 6
      // 026: ifne 143
      // 029: tableswitch 235 153 201 233 233 233 233 233 233 233 233 233 233 233 233 233 233 221 233 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 233 233 221 233
      // 0fc: ldc2_w -1514607405574023119
      // 0ff: lload 2
      // 100: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 0
      // 107: ireturn
      // 108: ldc2_w -1514607405574023119
      // 10b: lload 2
      // 10c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: bipush 1
      // 113: ireturn
      // 114: bipush 0
      // 115: bipush 1
      // 116: anewarray 16
      // 119: dup
      // 11a: bipush 0
      // 11b: new java/lang/StringBuilder
      // 11e: dup
      // 11f: invokespecial java/lang/StringBuilder.<init> ()V
      // 122: sipush 24073
      // 125: ldc2_w 4733742221591156356
      // 128: lload 2
      // 129: lxor
      // 12a: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/iy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: aload 0
      // 133: getfield com/zelix/iy.X I
      // 136: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 139: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13c: aastore
      // 13d: lload 4
      // 13f: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 142: bipush 1
      // 143: ireturn
   }

   void U(DataOutputStream var1, long var2) {
      var1.writeShort(this.J());
   }

   static {
      long var11 = a ^ 38949778012730L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "TD\u0006Ý\u0000\u0094î¾l/P'0d\u0088\u0012\u0010-ì\u0003ÄA{9\u0097µt\u000b4ã\u0002\u001dR\u0018ÞãvR§U^Çs'×\u007fäySD#Í_\u001cÏ\u0084Þ,";
      int var19 = "TD\u0006Ý\u0000\u0094î¾l/P'0d\u0088\u0012\u0010-ì\u0003ÄA{9\u0097µt\u000b4ã\u0002\u001dR\u0018ÞãvR§U^Çs'×\u007fäySD#Í_\u001cÏ\u0084Þ,"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     c = var20;
                     d = new String[5];
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "¯\u0014Ùyºû\u0016¼\u008e£\u008eõ\u0095²w\u001b";
                     int var5 = "¯\u0014Ùyºû\u0016¼\u008e£\u008eõ\u0095²w\u001b".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    g = var6;
                                    h = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Òê \u0006áÌqøÎÒXõ¹\u00ad¤\u0091";
                                 var5 = "Òê \u0006áÌqøÎÒXõ¹\u00ad¤\u0091".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "¥\u001d\u001e\u008fãW§5>Ôk=ÇÃZ\u0085o5ÕØLÖ0kÅæÚkïïl\u0093\u0018\u0095\"\u0003y·\u0006i¦y^£ú¹hS1SÅ\u0098êH\u0095ÄÐ";
                  var19 = "¥\u001d\u001e\u008fãW§5>Ôk=ÇÃZ\u0085o5ÕØLÖ0kÅæÚkïïl\u0093\u0018\u0095\"\u0003y·\u0006i¦y^£ú¹hS1SÅ\u0098êH\u0095ÄÐ".length();
                  var16 = ' ';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static n9 b(n9 var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12524;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/iy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/iy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16328;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/iy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/iy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
