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

public class io extends oz implements r8, a, eo, mb {
   private js a;
   private static final long b = prr.a(8823783820466006387L, 3283564915940199089L, MethodHandles.lookup().lookupClass()).a(112076866595906L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public boolean S(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public final boolean v(Object[] var1) {
      int var2 = (Integer)var1[0];
      v7 var5 = (v7)var1[1];
      long var3 = (Long)var1[2];
      int var6 = (Integer)var1[3];
      return false;
   }

   public final boolean T(long var1) {
      return false;
   }

   io(h1 param1, hp param2, l6q param3, l6q param4, l6q param5, long param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/io.b J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 4592366319869
      // 00e: lxor
      // 00f: lstore 8
      // 011: dup2
      // 012: ldc2_w 110481928789434
      // 015: lxor
      // 016: lstore 10
      // 018: pop2
      // 019: aload 0
      // 01a: sipush 30810
      // 01d: ldc2_w 1301899548794246215
      // 020: lload 6
      // 022: lxor
      // 023: invokedynamic h (IJ)I bsm=com/zelix/io.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: invokespecial com/zelix/oz.<init> (I)V
      // 02b: ldc2_w -1595475447834009081
      // 02e: lload 6
      // 030: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 1
      // 036: invokevirtual com/zelix/h1.read ()I
      // 039: istore 13
      // 03b: istore 12
      // 03d: aload 0
      // 03e: aload 2
      // 03f: lload 8
      // 041: iload 13
      // 043: invokeinterface com/zelix/hp.m (JI)Lcom/zelix/js; 4
      // 048: putfield com/zelix/io.a Lcom/zelix/js;
      // 04b: aload 0
      // 04c: getfield com/zelix/io.a Lcom/zelix/js;
      // 04f: instanceof com/zelix/xt
      // 052: iload 12
      // 054: ifeq 09e
      // 057: ifeq 089
      // 05a: goto 068
      // 05d: ldc2_w -860338364571203679
      // 060: lload 6
      // 062: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 3
      // 069: aload 0
      // 06a: getfield com/zelix/io.a Lcom/zelix/js;
      // 06d: checkcast com/zelix/xt
      // 070: aload 0
      // 071: lload 10
      // 073: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 076: iload 12
      // 078: ifne 112
      // 07b: goto 089
      // 07e: ldc2_w -860338364571203679
      // 081: lload 6
      // 083: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 0
      // 08a: getfield com/zelix/io.a Lcom/zelix/js;
      // 08d: instanceof com/zelix/xp
      // 090: goto 09e
      // 093: ldc2_w -860338364571203679
      // 096: lload 6
      // 098: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: lload 6
      // 0a0: lconst_0
      // 0a1: lcmp
      // 0a2: ifle 0f2
      // 0a5: iload 12
      // 0a7: ifeq 0f2
      // 0aa: ifeq 0dd
      // 0ad: goto 0bb
      // 0b0: ldc2_w -860338364571203679
      // 0b3: lload 6
      // 0b5: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 4
      // 0bd: aload 0
      // 0be: getfield com/zelix/io.a Lcom/zelix/js;
      // 0c1: checkcast com/zelix/xp
      // 0c4: aload 0
      // 0c5: lload 10
      // 0c7: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0ca: iload 12
      // 0cc: ifne 112
      // 0cf: goto 0dd
      // 0d2: ldc2_w -860338364571203679
      // 0d5: lload 6
      // 0d7: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield com/zelix/io.a Lcom/zelix/js;
      // 0e1: instanceof com/zelix/jf
      // 0e4: goto 0f2
      // 0e7: ldc2_w -860338364571203679
      // 0ea: lload 6
      // 0ec: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: ifeq 112
      // 0f5: aload 5
      // 0f7: aload 0
      // 0f8: getfield com/zelix/io.a Lcom/zelix/js;
      // 0fb: checkcast com/zelix/jf
      // 0fe: aload 0
      // 0ff: lload 10
      // 101: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 104: goto 112
      // 107: ldc2_w -860338364571203679
      // 10a: lload 6
      // 10c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: return
   }

   public io(long var1, js var3) {
      var1 = b ^ var1;
      super(c<"h">(6180, 1672463138402572700L ^ var1));
      this.a = var3;
   }

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 110204503419190L;
      long var10001 = var2 ^ 62838192416743L;
      int var6 = (int)((var2 ^ 62838192416743L) >>> 32);
      int var7 = (int)((var2 ^ 62838192416743L) << 32 >>> 56);
      int var8 = (int)(var10001 << 40 >>> 40);
      StringBuilder var9 = new StringBuilder();
      byte var10003 = (byte)var7;
      Object[] var10006 = new Object[]{null, null, var8};
      var10006[1] = Integer.valueOf(var10003);
      var10006[0] = var6;
      var9.append(m44.a<"s">(this, var10006, -7550383759637692338L, var2));
      var9.append((char)c<"h">(5225, 3637089686594248259L ^ var2));
      var9.append(m44.a<"s">(this.a, new Object[]{var4}, -8351324275647535027L, var2));
      return var9.toString();
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.a instanceof xp;
   }

   public hz n(hz param1, boolean param2, char param3, int param4, boolean param5, loj param6, char param7, String param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 7
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: lstore 9
      // 01b: lload 9
      // 01d: dup2
      // 01e: ldc2_w 6215624408093
      // 021: lxor
      // 022: lstore 11
      // 024: dup2
      // 025: ldc2_w 114161761794490
      // 028: lxor
      // 029: lstore 13
      // 02b: dup2
      // 02c: ldc2_w 332116234582
      // 02f: lxor
      // 030: lstore 15
      // 032: dup2
      // 033: ldc2_w 101946427565099
      // 036: lxor
      // 037: dup2
      // 038: bipush 56
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 17
      // 03e: dup2
      // 03f: bipush 8
      // 041: lshl
      // 042: bipush 32
      // 044: lushr
      // 045: l2i
      // 046: istore 18
      // 048: dup2
      // 049: bipush 40
      // 04b: lshl
      // 04c: bipush 40
      // 04e: lushr
      // 04f: l2i
      // 050: istore 19
      // 052: pop2
      // 053: dup2
      // 054: ldc2_w 31988536357509
      // 057: lxor
      // 058: lstore 20
      // 05a: dup2
      // 05b: ldc2_w 8842354942294
      // 05e: lxor
      // 05f: lstore 22
      // 061: pop2
      // 062: aload 1
      // 063: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 066: astore 25
      // 068: aload 25
      // 06a: arraylength
      // 06b: istore 26
      // 06d: iload 26
      // 06f: bipush 1
      // 070: iadd
      // 071: lload 15
      // 073: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 076: astore 27
      // 078: ldc2_w -4354173775004039090
      // 07b: lload 9
      // 07d: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: aload 1
      // 083: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 086: astore 28
      // 088: istore 24
      // 08a: aload 25
      // 08c: bipush 0
      // 08d: aload 27
      // 08f: bipush 0
      // 090: iload 26
      // 092: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 095: aload 0
      // 096: getfield com/zelix/io.a Lcom/zelix/js;
      // 099: instanceof com/zelix/c
      // 09c: iload 24
      // 09e: ifeq 1c7
      // 0a1: ifeq 1b2
      // 0a4: goto 0b2
      // 0a7: ldc2_w -2430233657819468312
      // 0aa: lload 9
      // 0ac: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield com/zelix/io.a Lcom/zelix/js;
      // 0b6: checkcast com/zelix/c
      // 0b9: lload 22
      // 0bb: invokeinterface com/zelix/c.j (J)Ljava/lang/String; 3
      // 0c0: astore 29
      // 0c2: aload 29
      // 0c4: sipush 6010
      // 0c7: ldc2_w 1745541117892519409
      // 0ca: lload 9
      // 0cc: lxor
      // 0cd: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/io.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d5: iload 24
      // 0d7: iload 7
      // 0d9: iflt 136
      // 0dc: ifeq 130
      // 0df: ifeq 10f
      // 0e2: goto 0f0
      // 0e5: ldc2_w -2430233657819468312
      // 0e8: lload 9
      // 0ea: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 27
      // 0f2: iload 26
      // 0f4: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 0f7: aastore
      // 0f8: iload 24
      // 0fa: iload 3
      // 0fb: iflt 1aa
      // 0fe: ifne 1a8
      // 101: goto 10f
      // 104: ldc2_w -2430233657819468312
      // 107: lload 9
      // 109: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 29
      // 111: sipush 18920
      // 114: ldc2_w 1191327332025776996
      // 117: lload 9
      // 119: lxor
      // 11a: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/io.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 122: goto 130
      // 125: ldc2_w -2430233657819468312
      // 128: lload 9
      // 12a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: iload 3
      // 131: iflt 18a
      // 134: iload 24
      // 136: ifeq 18a
      // 139: ifeq 169
      // 13c: goto 14a
      // 13f: ldc2_w -2430233657819468312
      // 142: lload 9
      // 144: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 27
      // 14c: iload 26
      // 14e: getstatic com/zelix/v7.Y Lcom/zelix/v7;
      // 151: aastore
      // 152: iload 24
      // 154: iload 3
      // 155: iflt 1aa
      // 158: ifne 1a8
      // 15b: goto 169
      // 15e: ldc2_w -2430233657819468312
      // 161: lload 9
      // 163: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 29
      // 16b: sipush 30108
      // 16e: ldc2_w 7843106675519096596
      // 171: lload 9
      // 173: lxor
      // 174: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/io.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17c: goto 18a
      // 17f: ldc2_w -2430233657819468312
      // 182: lload 9
      // 184: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: iload 7
      // 18c: ifle 1aa
      // 18f: ifeq 1a8
      // 192: aload 27
      // 194: iload 26
      // 196: getstatic com/zelix/v7.V Lcom/zelix/v7;
      // 199: aastore
      // 19a: goto 1a8
      // 19d: ldc2_w -2430233657819468312
      // 1a0: lload 9
      // 1a2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: iload 24
      // 1aa: iload 7
      // 1ac: ifle 1b9
      // 1af: ifne 361
      // 1b2: aload 0
      // 1b3: getfield com/zelix/io.a Lcom/zelix/js;
      // 1b6: instanceof com/zelix/jf
      // 1b9: goto 1c7
      // 1bc: ldc2_w -2430233657819468312
      // 1bf: lload 9
      // 1c1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: athrow
      // 1c7: iload 24
      // 1c9: iload 4
      // 1cb: iflt 21b
      // 1ce: ifeq 219
      // 1d1: ifeq 204
      // 1d4: goto 1e2
      // 1d7: ldc2_w -2430233657819468312
      // 1da: lload 9
      // 1dc: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: aload 27
      // 1e4: iload 26
      // 1e6: ldc2_w -2615269712084233667
      // 1e9: lload 9
      // 1eb: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: aastore
      // 1f1: iload 24
      // 1f3: ifne 361
      // 1f6: goto 204
      // 1f9: ldc2_w -2430233657819468312
      // 1fc: lload 9
      // 1fe: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: aload 0
      // 205: getfield com/zelix/io.a Lcom/zelix/js;
      // 208: instanceof com/zelix/j2
      // 20b: goto 219
      // 20e: ldc2_w -2430233657819468312
      // 211: lload 9
      // 213: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: iload 24
      // 21b: iload 3
      // 21c: iflt 286
      // 21f: ifeq 284
      // 222: ifeq 26f
      // 225: goto 233
      // 228: ldc2_w -2430233657819468312
      // 22b: lload 9
      // 22d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: iload 26
      // 235: bipush 1
      // 236: iadd
      // 237: lload 15
      // 239: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 23c: astore 27
      // 23e: aload 25
      // 240: bipush 0
      // 241: aload 27
      // 243: bipush 0
      // 244: iload 26
      // 246: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 249: aload 27
      // 24b: iload 26
      // 24d: iload 17
      // 24f: i2b
      // 250: iload 18
      // 252: iload 19
      // 254: sipush 24620
      // 257: ldc2_w 731301027178582693
      // 25a: lload 9
      // 25c: lxor
      // 25d: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/io.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 265: aastore
      // 266: iload 24
      // 268: iload 3
      // 269: iflt 276
      // 26c: ifne 361
      // 26f: aload 0
      // 270: getfield com/zelix/io.a Lcom/zelix/js;
      // 273: instanceof com/zelix/j9
      // 276: goto 284
      // 279: ldc2_w -2430233657819468312
      // 27c: lload 9
      // 27e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: iload 24
      // 286: iload 3
      // 287: iflt 2f2
      // 28a: ifeq 2f0
      // 28d: ifeq 2db
      // 290: goto 29e
      // 293: ldc2_w -2430233657819468312
      // 296: lload 9
      // 298: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: athrow
      // 29e: iload 26
      // 2a0: bipush 1
      // 2a1: iadd
      // 2a2: lload 15
      // 2a4: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 2a7: astore 27
      // 2a9: aload 25
      // 2ab: bipush 0
      // 2ac: aload 27
      // 2ae: bipush 0
      // 2af: iload 26
      // 2b1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2b4: aload 27
      // 2b6: iload 26
      // 2b8: iload 17
      // 2ba: i2b
      // 2bb: iload 18
      // 2bd: iload 19
      // 2bf: sipush 932
      // 2c2: ldc2_w 3381818826768675118
      // 2c5: lload 9
      // 2c7: lxor
      // 2c8: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/io.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 2d0: aastore
      // 2d1: iload 24
      // 2d3: iload 4
      // 2d5: iflt 2e2
      // 2d8: ifne 361
      // 2db: aload 0
      // 2dc: getfield com/zelix/io.a Lcom/zelix/js;
      // 2df: instanceof com/zelix/j5
      // 2e2: goto 2f0
      // 2e5: ldc2_w -2430233657819468312
      // 2e8: lload 9
      // 2ea: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: athrow
      // 2f0: iload 24
      // 2f2: ifeq 318
      // 2f5: ifeq 361
      // 2f8: goto 306
      // 2fb: ldc2_w -2430233657819468312
      // 2fe: lload 9
      // 300: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: athrow
      // 306: iload 26
      // 308: bipush 1
      // 309: iadd
      // 30a: goto 318
      // 30d: ldc2_w -2430233657819468312
      // 310: lload 9
      // 312: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: athrow
      // 318: lload 15
      // 31a: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 31d: astore 27
      // 31f: aload 25
      // 321: bipush 0
      // 322: aload 27
      // 324: bipush 0
      // 325: iload 26
      // 327: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 32a: aload 0
      // 32b: getfield com/zelix/io.a Lcom/zelix/js;
      // 32e: checkcast com/zelix/j5
      // 331: astore 29
      // 333: aload 29
      // 335: lload 20
      // 337: bipush 1
      // 338: anewarray 139
      // 33b: dup_x2
      // 33c: dup_x2
      // 33d: pop
      // 33e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 341: bipush 0
      // 342: swap
      // 343: aastore
      // 344: ldc2_w -2683358755509513721
      // 347: lload 9
      // 349: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: astore 30
      // 350: aload 27
      // 352: iload 26
      // 354: iload 17
      // 356: i2b
      // 357: iload 18
      // 359: iload 19
      // 35b: aload 30
      // 35d: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 360: aastore
      // 361: new com/zelix/hz
      // 364: dup
      // 365: aload 27
      // 367: aload 28
      // 369: aload 1
      // 36a: invokevirtual com/zelix/hz.j ()Lcom/zelix/fb;
      // 36d: lload 13
      // 36f: dup2_x1
      // 370: pop2
      // 371: aload 1
      // 372: lload 11
      // 374: invokevirtual com/zelix/hz.k (J)Ljava/util/Set;
      // 377: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 37a: areturn
   }

   public final boolean e(long var1, int var3) {
      return true;
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
      // 02c: ldc2_w 94237236529450
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 9522033084411
      // 036: lxor
      // 037: dup2
      // 038: bipush 32
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 12
      // 03e: dup2
      // 03f: bipush 32
      // 041: lshl
      // 042: bipush 56
      // 044: lushr
      // 045: l2i
      // 046: istore 13
      // 048: dup2
      // 049: bipush 40
      // 04b: lshl
      // 04c: bipush 40
      // 04e: lushr
      // 04f: l2i
      // 050: istore 14
      // 052: pop2
      // 053: pop2
      // 054: new java/lang/StringBuilder
      // 057: dup
      // 058: sipush 28924
      // 05b: ldc2_w 4769549514535459535
      // 05e: lload 2
      // 05f: lxor
      // 060: invokedynamic h (IJ)I bsm=com/zelix/io.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokespecial java/lang/StringBuilder.<init> (I)V
      // 068: astore 16
      // 06a: ldc2_w -1155528826364025814
      // 06d: lload 2
      // 06e: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 0
      // 074: iload 12
      // 076: iload 13
      // 078: i2b
      // 079: iload 14
      // 07b: bipush 3
      // 07c: anewarray 139
      // 07f: dup_x1
      // 080: swap
      // 081: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 084: bipush 2
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08c: bipush 1
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x1
      // 090: swap
      // 091: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: ldc2_w -636251684499120046
      // 09a: lload 2
      // 09b: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: astore 17
      // 0a2: istore 15
      // 0a4: aload 16
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: aload 17
      // 0af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b2: ldc " "
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: aload 0
      // 0b8: getfield com/zelix/io.a Lcom/zelix/js;
      // 0bb: lload 10
      // 0bd: bipush 1
      // 0be: anewarray 139
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w -1439441735835203503
      // 0cd: lload 2
      // 0ce: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: pop
      // 0dd: aload 0
      // 0de: getfield com/zelix/io.X I
      // 0e1: lload 8
      // 0e3: dup2_x1
      // 0e4: pop2
      // 0e5: bipush 2
      // 0e6: anewarray 139
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
      // 10a: getfield com/zelix/io.a Lcom/zelix/js;
      // 10d: lload 10
      // 10f: bipush 1
      // 110: anewarray 139
      // 113: dup_x2
      // 114: dup_x2
      // 115: pop
      // 116: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 119: bipush 0
      // 11a: swap
      // 11b: aastore
      // 11c: ldc2_w -1439441735835203503
      // 11f: lload 2
      // 120: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: bipush 3
      // 126: anewarray 139
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
      // 149: ifeq 1ac
      // 14c: aload 18
      // 14e: invokevirtual java/lang/String.length ()I
      // 151: ifle 188
      // 154: goto 161
      // 157: ldc2_w -999110824034188916
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
      // 17e: ldc2_w -999110824034188916
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

   public void S(Object[] param1) {
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
      // 04: checkcast com/zelix/jf
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/jf
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: ldc2_w -7218963243841743902
      // 1e: lload 4
      // 20: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifne 51
      // 2d: getfield com/zelix/io.a Lcom/zelix/js;
      // 30: aload 3
      // 31: if_acmpne 55
      // 34: goto 42
      // 37: ldc2_w -7361915844065514885
      // 3a: lload 4
      // 3c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 51
      // 46: ldc2_w -7361915844065514885
      // 49: lload 4
      // 4b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 2
      // 52: putfield com/zelix/io.a Lcom/zelix/js;
      // 55: return
   }

   public void V(Object[] param1) {
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
      // 04: checkcast com/zelix/xt
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/xt
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: ldc2_w 4490842495129154958
      // 1f: lload 2
      // 20: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 50
      // 2d: getfield com/zelix/io.a Lcom/zelix/js;
      // 30: aload 4
      // 32: if_acmpne 55
      // 35: goto 42
      // 38: ldc2_w 2559839184236711976
      // 3b: lload 2
      // 3c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 50
      // 46: ldc2_w 2559839184236711976
      // 49: lload 2
      // 4a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 5
      // 52: putfield com/zelix/io.a Lcom/zelix/js;
      // 55: return
   }

   public boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public final boolean Y(long var1, int var3, int var4) {
      return false;
   }

   public boolean L(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public boolean d(ii param1, Set param2, bn param3, int param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 5
      // 002: dup2
      // 003: ldc2_w 88807803932621
      // 006: lxor
      // 007: lstore 7
      // 009: dup2
      // 00a: ldc2_w 88905532612688
      // 00d: lxor
      // 00e: lstore 9
      // 010: pop2
      // 011: ldc2_w -6677223770485200759
      // 014: lload 5
      // 016: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: istore 11
      // 01d: aload 0
      // 01e: getfield com/zelix/io.a Lcom/zelix/js;
      // 021: instanceof com/zelix/xt
      // 024: iload 11
      // 026: ifeq 132
      // 029: ifeq 131
      // 02c: goto 03a
      // 02f: ldc2_w -4719366672907530961
      // 032: lload 5
      // 034: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: athrow
      // 03a: aload 0
      // 03b: getfield com/zelix/io.a Lcom/zelix/js;
      // 03e: checkcast com/zelix/xt
      // 041: astore 12
      // 043: aload 12
      // 045: invokevirtual com/zelix/xt.V ()Lcom/zelix/x8;
      // 048: astore 13
      // 04a: aload 13
      // 04c: bipush 0
      // 04d: anewarray 139
      // 050: ldc2_w -4722412079814637109
      // 053: lload 5
      // 055: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: iload 11
      // 05c: lload 5
      // 05e: lconst_0
      // 05f: lcmp
      // 060: ifle 067
      // 063: ifeq 130
      // 066: bipush 2
      // 067: if_icmplt 12f
      // 06a: goto 078
      // 06d: ldc2_w -4719366672907530961
      // 070: lload 5
      // 072: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: aload 12
      // 07a: lload 9
      // 07c: bipush 1
      // 07d: anewarray 139
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 0
      // 087: swap
      // 088: aastore
      // 089: ldc2_w -6562076652257736268
      // 08c: lload 5
      // 08e: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: iload 11
      // 095: ifeq 130
      // 098: goto 0a6
      // 09b: ldc2_w -4719366672907530961
      // 09e: lload 5
      // 0a0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: ifeq 12f
      // 0a9: goto 0b7
      // 0ac: ldc2_w -4719366672907530961
      // 0af: lload 5
      // 0b1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 2
      // 0b8: aload 12
      // 0ba: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0bf: iload 11
      // 0c1: ifeq 130
      // 0c4: goto 0d2
      // 0c7: ldc2_w -4719366672907530961
      // 0ca: lload 5
      // 0cc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: ifne 12f
      // 0d5: goto 0e3
      // 0d8: ldc2_w -4719366672907530961
      // 0db: lload 5
      // 0dd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 1
      // 0e4: aload 3
      // 0e5: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 0e8: aload 3
      // 0e9: aload 12
      // 0eb: new com/zelix/lk9
      // 0ee: dup
      // 0ef: iload 4
      // 0f1: aload 0
      // 0f2: invokespecial com/zelix/lk9.<init> (ILjava/lang/Object;)V
      // 0f5: lload 7
      // 0f7: bipush 5
      // 0f8: anewarray 139
      // 0fb: dup_x2
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 101: bipush 4
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 3
      // 107: swap
      // 108: aastore
      // 109: dup_x1
      // 10a: swap
      // 10b: bipush 2
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 1
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w -6423987347638458274
      // 11b: lload 5
      // 11d: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: bipush 1
      // 123: ireturn
      // 124: ldc2_w -4719366672907530961
      // 127: lload 5
      // 129: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: bipush 0
      // 130: ireturn
      // 131: bipush 0
      // 132: ireturn
   }

   public js s(long var1) {
      return this.a;
   }

   public void o(Object[] param1) {
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
      // 04: checkcast com/zelix/xp
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/xp
      // 19: astore 3
      // 1a: pop
      // 1b: ldc2_w 7272722803229110065
      // 1e: lload 4
      // 20: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 51
      // 2d: getfield com/zelix/io.a Lcom/zelix/js;
      // 30: aload 2
      // 31: if_acmpne 55
      // 34: goto 42
      // 37: ldc2_w 8735060794954369687
      // 3a: lload 4
      // 3c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 51
      // 46: ldc2_w 8735060794954369687
      // 49: lload 4
      // 4b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 3
      // 52: putfield com/zelix/io.a Lcom/zelix/js;
      // 55: return
   }

   public int T(char var1, int var2, char var3) {
      return 2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public oz r(Map var1, int var2, int var3, int var4) {
      long var5 = (long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 46596226632346L;
      int var10000 = m44.a<"k">(8704658504643637502L, var5);
      js var11 = (js)cf.J(var7, this.a, var1);
      byte var9 = (byte)var10000;

      label54: {
         js var10;
         label53: {
            label52: {
               label60: {
                  try {
                     var17 = var11;
                     if (var9 != 0) {
                        break label52;
                     }

                     if (var11 == null) {
                        break label60;
                     }
                  } catch (n9 var16) {
                     throw m44.a<"k">(var16, 8847611105536395623L, var5);
                  }

                  var10 = var11;

                  try {
                     var10000 = var9;
                     if (var2 < 0) {
                        break label54;
                     }

                     if (var9 == 0) {
                        break label53;
                     }
                  } catch (n9 var15) {
                     boolean var10001 = false;
                     throw m44.a<"k">(var15, 8847611105536395623L, var5);
                  }
               }

               try {
                  var17 = this.a;
               } catch (n9 var13) {
                  boolean var21 = false;
                  throw m44.a<"k">(var13, 8847611105536395623L, var5);
               }
            }

            var10 = var17;
         }

         try {
            var10000 = var10.E();
         } catch (n9 var14) {
            boolean var22 = false;
            throw m44.a<"k">(var14, 8847611105536395623L, var5);
         }
      }

      try {
         return var10000 > c<"h">(6483, 6697786680734268303L ^ var5) ? new i_(c<"h">(23317, 7026937530690763212L ^ var5), this.a) : null;
      } catch (n9 var12) {
         boolean var23 = false;
         throw m44.a<"k">(var12, 8847611105536395623L, var5);
      }
   }

   public boolean u(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.a instanceof xp;
   }

   public boolean r(Object[] param1) {
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
      // 004: checkcast com/zelix/ii
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/bn
      // 016: astore 3
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Integer
      // 028: invokevirtual java/lang/Integer.intValue ()I
      // 02b: istore 7
      // 02d: pop
      // 02e: lload 5
      // 030: dup2
      // 031: ldc2_w 128783059689007
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 20501208929285
      // 03b: lxor
      // 03c: lstore 10
      // 03e: pop2
      // 03f: ldc2_w 8691382388752823105
      // 042: lload 5
      // 044: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: istore 12
      // 04b: aload 0
      // 04c: getfield com/zelix/io.a Lcom/zelix/js;
      // 04f: instanceof com/zelix/xp
      // 052: iload 12
      // 054: ifeq 11e
      // 057: ifeq 11d
      // 05a: goto 068
      // 05d: ldc2_w 7298421173746554599
      // 060: lload 5
      // 062: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 0
      // 069: getfield com/zelix/io.a Lcom/zelix/js;
      // 06c: checkcast com/zelix/xp
      // 06f: astore 13
      // 071: aload 13
      // 073: lload 8
      // 075: bipush 1
      // 076: anewarray 139
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: ldc2_w 7320776223038961253
      // 085: lload 5
      // 087: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: iload 12
      // 08e: ifeq 11c
      // 091: ifeq 11b
      // 094: goto 0a2
      // 097: ldc2_w 7298421173746554599
      // 09a: lload 5
      // 09c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 4
      // 0a4: aload 13
      // 0a6: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0ab: iload 12
      // 0ad: ifeq 11c
      // 0b0: goto 0be
      // 0b3: ldc2_w 7298421173746554599
      // 0b6: lload 5
      // 0b8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: ifne 11b
      // 0c1: goto 0cf
      // 0c4: ldc2_w 7298421173746554599
      // 0c7: lload 5
      // 0c9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: aload 3
      // 0d1: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 0d4: aload 3
      // 0d5: aload 13
      // 0d7: new com/zelix/lk9
      // 0da: dup
      // 0db: iload 7
      // 0dd: aload 0
      // 0de: invokespecial com/zelix/lk9.<init> (ILjava/lang/Object;)V
      // 0e1: lload 10
      // 0e3: bipush 5
      // 0e4: anewarray 139
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 4
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 3
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: bipush 2
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 1
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: bipush 0
      // 102: swap
      // 103: aastore
      // 104: ldc2_w 9012032619352306582
      // 107: lload 5
      // 109: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: bipush 1
      // 10f: ireturn
      // 110: ldc2_w 7298421173746554599
      // 113: lload 5
      // 115: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: bipush 0
      // 11c: ireturn
      // 11d: bipush 0
      // 11e: ireturn
   }

   public void H(DataOutputStream param1, Map param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 3
      // 01: dup2
      // 02: ldc2_w 109183790174989
      // 05: lxor
      // 06: dup2
      // 07: bipush 48
      // 09: lushr
      // 0a: l2i
      // 0b: istore 5
      // 0d: dup2
      // 0e: bipush 16
      // 10: lshl
      // 11: bipush 32
      // 13: lushr
      // 14: l2i
      // 15: istore 6
      // 17: dup2
      // 18: bipush 48
      // 1a: lshl
      // 1b: bipush 48
      // 1d: lushr
      // 1e: l2i
      // 1f: istore 7
      // 21: pop2
      // 22: pop2
      // 23: ldc2_w 5435323277584221021
      // 26: lload 3
      // 27: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: iload 5
      // 2f: i2s
      // 30: iload 6
      // 32: aload 1
      // 33: iload 7
      // 35: invokespecial com/zelix/oz.G (SILjava/io/DataOutputStream;I)V
      // 38: aload 2
      // 39: aload 0
      // 3a: getfield com/zelix/io.a Lcom/zelix/js;
      // 3d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 42: checkcast com/zelix/js
      // 45: astore 9
      // 47: istore 8
      // 49: iload 8
      // 4b: ifne 76
      // 4e: aload 9
      // 50: ifnull 81
      // 53: goto 60
      // 56: ldc2_w 5290051843844504260
      // 59: lload 3
      // 5a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 1
      // 61: aload 9
      // 63: invokevirtual com/zelix/js.E ()I
      // 66: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 69: goto 76
      // 6c: ldc2_w 5290051843844504260
      // 6f: lload 3
      // 70: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: lload 3
      // 77: lconst_0
      // 78: lcmp
      // 79: ifle 8c
      // 7c: iload 8
      // 7e: ifeq 99
      // 81: aload 1
      // 82: aload 0
      // 83: getfield com/zelix/io.a Lcom/zelix/js;
      // 86: invokevirtual com/zelix/js.E ()I
      // 89: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 8c: goto 99
      // 8f: ldc2_w 5290051843844504260
      // 92: lload 3
      // 93: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: return
   }

   public boolean g(long var1) {
      return this.a instanceof xt;
   }

   public void G(short var1, int var2, DataOutputStream var3, int var4) {
      long var5 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var10001 = var5 ^ 0L;
      int var7 = (int)((var5 ^ 0L) >>> 48);
      int var8 = (int)((var5 ^ 0L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      super.G((short)var7, var8, var3, var9);
      var3.writeByte(this.a.E());
   }

   static {
      long var11 = b ^ 99543384040760L;
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
      String var17 = "JNûÏ\u008f§\n\u0006\u0003\u0001&¢7\u001f\u009cZ0\u008bOe\u0006\u00ad;`W\u008e³¨âeHtòÿ\u0088\u000b\u0080\u0094²\u0003r1?Ø\u000e\u0086\u0010ß\u0096C\u0000öí;\u0015\u0092}ZÍÕ0d\u0015Ó\"8\u009b\u0094¨ÏÔ·6¯õù\u00adq6\u0006Ô\u000fzá7pDuýâ\r\u001fìõ\u0017ââã¶\u000bXÑk\tós0Î¼\u0011/Be\rü\u0090ï-çG®ì";
      int var19 = "JNûÏ\u008f§\n\u0006\u0003\u0001&¢7\u001f\u009cZ0\u008bOe\u0006\u00ad;`W\u008e³¨âeHtòÿ\u0088\u000b\u0080\u0094²\u0003r1?Ø\u000e\u0086\u0010ß\u0096C\u0000öí;\u0015\u0092}ZÍÕ0d\u0015Ó\"8\u009b\u0094¨ÏÔ·6¯õù\u00adq6\u0006Ô\u000fzá7pDuýâ\r\u001fìõ\u0017ââã¶\u000bXÑk\tós0Î¼\u0011/Be\rü\u0090ï-çG®ì"
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
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "Æ;T\u007f\r7K\u0012\u00856Ò\u0083ö\u008d\u000e±h\u001a\u0094¾¼àHËebe96p\u008b<";
                     int var5 = "Æ;T\u007f\r7K\u0012\u00856Ò\u0083ö\u008d\u000e±h\u001a\u0094¾¼àHËebe96p\u008b<".length();
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
                                    h = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "¬\u00adî$â«/Ä^mK`\u0004ë\u0090Û";
                                 var5 = "¬\u00adî$â«/Ä^mK`\u0004ë\u0090Û".length();
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

                  var17 = "0\u001fþ%nÄ\u009dï/`UÆX\u0093Ò\u0091\u0010£\u008a\u001e}ÐÓUýx{\u001c<Õ¨0ô";
                  var19 = "0\u001fþ%nÄ\u009dï/`UÆX\u0093Ò\u0091\u0010£\u008a\u001e}ÐÓUýx{\u001c<Õ¨0ô".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14451;
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
            throw new RuntimeException("com/zelix/io", var10);
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
         throw new RuntimeException("com/zelix/io" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19628;
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/io", var14);
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
         throw new RuntimeException("com/zelix/io" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
