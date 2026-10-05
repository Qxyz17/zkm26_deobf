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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ig extends i_ {
   private int h;
   private static final long a = prr.a(9022966993366451950L, 9202538121336802945L, MethodHandles.lookup().lookupClass()).a(272781277159717L);
   private static final long[] c;
   private static final Integer[] i;
   private static final Map u = new HashMap(13);

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 118325147105313L;
      int var4 = (int)((var2 ^ 118325147105313L) >>> 48);
      int var5 = (int)((var2 ^ 118325147105313L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      var10001 = var2 ^ 62838192416743L;
      int var7 = (int)((var2 ^ 62838192416743L) >>> 32);
      int var8 = (int)((var2 ^ 62838192416743L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      StringBuilder var10 = new StringBuilder();
      byte var10003 = (byte)var8;
      Object[] var10006 = new Object[]{null, null, var9};
      var10006[1] = Integer.valueOf(var10003);
      var10006[0] = var7;
      var10.append(m44.a<"s">(this, var10006, -7550383759637692338L, var2));
      var10.append((char)c<"i">(8583, 841896743536510107L ^ var2));
      var10.append(m44.a<"s">(this.k, (char)var4, var5, (short)var6, -7853083534666706113L, var2));
      var10.append((char)c<"i">(13084, 1435877675117139457L ^ var2));
      var10.append(m44.a<"r">(this, -7572350059293638322L, var2));
      return var10.toString();
   }

   public int T(char var1, int var2, char var3) {
      return 4;
   }

   public boolean Y(long param1, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 6173625216586931614
      // 03: lload 1
      // 04: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 5
      // 0b: iload 3
      // 0c: iload 5
      // 0e: lload 1
      // 0f: lconst_0
      // 10: lcmp
      // 11: iflt 1b
      // 14: ifne 39
      // 17: iload 4
      // 19: bipush 1
      // 1a: isub
      // 1b: if_icmplt 3c
      // 1e: goto 2b
      // 21: ldc2_w 5250459910756699068
      // 24: lload 1
      // 25: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 39
      // 2f: ldc2_w 5250459910756699068
      // 32: lload 1
      // 33: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 5
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/v7
      // 12: astore 4
      // 14: dup
      // 15: bipush 2
      // 16: aaload
      // 17: checkcast java/lang/Long
      // 1a: invokevirtual java/lang/Long.longValue ()J
      // 1d: lstore 2
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Integer
      // 24: invokevirtual java/lang/Integer.intValue ()I
      // 27: istore 6
      // 29: pop
      // 2a: ldc2_w -4319878175848984624
      // 2d: lload 2
      // 2e: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: istore 7
      // 35: iload 5
      // 37: iload 7
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: iflt 46
      // 3f: ifeq 64
      // 42: iload 6
      // 44: bipush 1
      // 45: isub
      // 46: if_icmplt 67
      // 49: goto 56
      // 4c: ldc2_w -4130881381298502195
      // 4f: lload 2
      // 50: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: bipush 1
      // 57: goto 64
      // 5a: ldc2_w -4130881381298502195
      // 5d: lload 2
      // 5e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: goto 68
      // 67: bipush 0
      // 68: ireturn
   }

   public void H(DataOutputStream var1, Map var2, long var3) {
      long var5 = var3 ^ 0L;
      super.H(var1, var2, var5);
      var1.writeByte(m44.a<"v">(this, 5601864211733010970L, var3));
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/io/PrintWriter
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 102513965841398
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 135779181519990
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 99033709877309
      // 02f: lxor
      // 030: dup2
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 10
      // 037: dup2
      // 038: bipush 16
      // 03a: lshl
      // 03b: bipush 32
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 11
      // 041: dup2
      // 042: bipush 48
      // 044: lshl
      // 045: bipush 48
      // 047: lushr
      // 048: l2i
      // 049: istore 12
      // 04b: pop2
      // 04c: dup2
      // 04d: ldc2_w 9522033084411
      // 050: lxor
      // 051: dup2
      // 052: bipush 32
      // 054: lushr
      // 055: l2i
      // 056: istore 13
      // 058: dup2
      // 059: bipush 32
      // 05b: lshl
      // 05c: bipush 56
      // 05e: lushr
      // 05f: l2i
      // 060: istore 14
      // 062: dup2
      // 063: bipush 40
      // 065: lshl
      // 066: bipush 40
      // 068: lushr
      // 069: l2i
      // 06a: istore 15
      // 06c: pop2
      // 06d: pop2
      // 06e: ldc2_w -1155528826364025814
      // 071: lload 4
      // 073: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: new java/lang/StringBuilder
      // 07b: dup
      // 07c: sipush 28351
      // 07f: ldc2_w 8144390399029078973
      // 082: lload 4
      // 084: lxor
      // 085: invokedynamic i (IJ)I bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: invokespecial java/lang/StringBuilder.<init> (I)V
      // 08d: astore 17
      // 08f: aload 0
      // 090: iload 13
      // 092: iload 14
      // 094: i2b
      // 095: iload 15
      // 097: bipush 3
      // 098: anewarray 51
      // 09b: dup_x1
      // 09c: swap
      // 09d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a0: bipush 2
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x1
      // 0a4: swap
      // 0a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w -636251684499120046
      // 0b6: lload 4
      // 0b8: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: astore 18
      // 0bf: aload 17
      // 0c1: new java/lang/StringBuilder
      // 0c4: dup
      // 0c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c8: aload 18
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: ldc " "
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2: aload 0
      // 0d3: getfield com/zelix/ig.k Lcom/zelix/js;
      // 0d6: invokevirtual com/zelix/js.E ()I
      // 0d9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0dc: ldc " "
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: aload 0
      // 0e2: ldc2_w -651427438997249710
      // 0e5: lload 4
      // 0e7: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: pop
      // 0f6: aload 0
      // 0f7: getfield com/zelix/ig.X I
      // 0fa: lload 8
      // 0fc: dup2_x1
      // 0fd: pop2
      // 0fe: bipush 2
      // 0ff: anewarray 51
      // 102: dup_x1
      // 103: swap
      // 104: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x2
      // 10b: dup_x2
      // 10c: pop
      // 10d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w -1509257710096725591
      // 116: lload 4
      // 118: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: astore 19
      // 11f: istore 16
      // 121: lload 6
      // 123: aload 19
      // 125: aload 0
      // 126: getfield com/zelix/ig.k Lcom/zelix/js;
      // 129: iload 10
      // 12b: i2c
      // 12c: iload 11
      // 12e: iload 12
      // 130: i2s
      // 131: ldc2_w -929976081543482589
      // 134: lload 4
      // 136: invokedynamic w (Ljava/lang/Object;CISJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: bipush 3
      // 13c: anewarray 51
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 2
      // 142: swap
      // 143: aastore
      // 144: dup_x1
      // 145: swap
      // 146: bipush 1
      // 147: swap
      // 148: aastore
      // 149: dup_x2
      // 14a: dup_x2
      // 14b: pop
      // 14c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w -1214410100789358428
      // 155: lload 4
      // 157: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: astore 19
      // 15e: lload 6
      // 160: aload 19
      // 162: aload 0
      // 163: ldc2_w -651427438997249710
      // 166: lload 4
      // 168: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: ldc2_w -1207627958331833678
      // 170: lload 4
      // 172: invokedynamic h (IJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: bipush 3
      // 178: anewarray 51
      // 17b: dup_x1
      // 17c: swap
      // 17d: bipush 2
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: bipush 1
      // 183: swap
      // 184: aastore
      // 185: dup_x2
      // 186: dup_x2
      // 187: pop
      // 188: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18b: bipush 0
      // 18c: swap
      // 18d: aastore
      // 18e: ldc2_w -1214410100789358428
      // 191: lload 4
      // 193: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: astore 19
      // 19a: iload 16
      // 19c: ifeq 1fe
      // 19f: aload 19
      // 1a1: invokevirtual java/lang/String.length ()I
      // 1a4: ifle 1dd
      // 1a7: goto 1b5
      // 1aa: ldc2_w -1344851921672098249
      // 1ad: lload 4
      // 1af: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aload 17
      // 1b7: new java/lang/StringBuilder
      // 1ba: dup
      // 1bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 1be: ldc "\t"
      // 1c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c3: aload 19
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ce: pop
      // 1cf: goto 1dd
      // 1d2: ldc2_w -1344851921672098249
      // 1d5: lload 4
      // 1d7: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 3
      // 1de: new java/lang/StringBuilder
      // 1e1: dup
      // 1e2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e5: aload 2
      // 1e6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ec: aload 2
      // 1ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f3: aload 17
      // 1f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fb: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1fe: return
   }

   ig(h1 var1, hp var2, l6q var3, long var4, l6q var6, l6q var7, l6q var8, l6q var9) {
      var4 = a ^ var4;
      long var10 = var4 ^ 70672605233178L;
      super(c<"i">(12028, 4024283439445075079L ^ var4), var1, var2, var10, var3, var6, var7, var8, var9);
      m44.a<"t">(this, var1.read(), -5076145462014431702L, var4);
   }

   public hz n(hz var1, boolean var2, char var3, int var4, boolean var5, loj var6, char var7, String var8) {
      long var9 = (long)var3 << 48 | (long)var4 << 32 >>> 16 | (long)var7 << 48 >>> 48;
      long var11 = var9 ^ 6215624408093L;
      long var13 = var9 ^ 114161761794490L;
      long var15 = var9 ^ 332116234582L;
      long var10001 = var9 ^ 101946427565099L;
      int var17 = (int)((var9 ^ 101946427565099L) >>> 56);
      int var18 = (int)((var9 ^ 101946427565099L) << 8 >>> 32);
      int var19 = (int)(var10001 << 40 >>> 40);
      long var20 = var9 ^ 66632514719157L;
      v7[] var22 = var1.X();
      v7[] var23 = var1.T();
      int var24 = var22.length;
      v7[] var25 = v7.I(var24 - m44.a<"r">(this, -2697154176992326346L, var9) + 1, var15);
      int var26 = var25.length;
      System.arraycopy(var22, 0, var25, 0, var26 - 1);
      jf var27 = (jf)this.k;
      String var28 = var27.h(var20);
      var25[var26 - 1] = v7.M((byte)var17, var18, var19, var28);
      return new hz(var25, var23, var13, var1.j(), var1.k(var11));
   }

   public void G(short var1, int var2, DataOutputStream var3, int var4) {
      long var5 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var10001 = var5 ^ 0L;
      int var7 = (int)((var5 ^ 0L) >>> 48);
      int var8 = (int)((var5 ^ 0L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      super.G((short)var7, var8, var3, var9);
      var3.writeByte(m44.a<"s">(this, 2211463814104647959L, var5));
   }

   static {
      long var0 = a ^ 36325821789835L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "ìT\u0091Å!\u0091-´/JAü¶gQ\u008a";
      int var7 = "ìT\u0091Å!\u0091-´/JAü¶gQ\u008a".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
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
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     c = var8;
                     i = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "rmIñ\u0004üý\u0011lJÐ*}BV\u009f";
                  var7 = "rmIñ\u0004üý\u0011lJÐ*}BV\u009f".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25502;
      if (i[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ig", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("com/zelix/ig" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
