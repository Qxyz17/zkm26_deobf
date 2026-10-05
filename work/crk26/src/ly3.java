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

public class ly3 extends lyn {
   String U;
   private static final long a = prr.a(2398723644195619164L, 2463981553894451498L, MethodHandles.lookup().lookupClass()).a(199876878909605L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);

   public void M(Object[] var1) {
      lmu var4 = (lmu)var1[0];
      lqu var5 = (lqu)var1[1];
      long var2 = (Long)var1[2];
      long var6 = var2 ^ 74673965963454L;
      long var8 = var2 ^ 0L;
      long var10 = var2 ^ 70974204760313L;
      long var12 = var2 ^ 29166006246517L;
      long var14 = var2 ^ 48832956100528L;
      long var16 = var2 ^ 78419313187334L;
      int var18 = m44.a<"w">(this, new Object[]{var16}, -4972914505230991179L, var2);
      lwr var19 = (lwr)this.V(0);
      int var20 = m44.a<"w">(var5, new Object[]{var14}, -6410373196425327712L, var2);
      int var21 = m44.a<"w">(var5, new Object[]{var6}, -5092376014320582940L, var2);
      int var22 = m44.a<"w">(var5, new Object[]{var10}, -5139488470093813520L, var2);
      m44.a<"w">(var19, new Object[]{this, var5, var8}, -4740954200097092079L, var2);
      m44.a<"t">(this, m44.a<"w">(var19, new Object[0], -4968184746715213117L, var2), -5106530567656490893L, var2);
      Object[] var10007 = new Object[]{null, null, null, null, var22};
      var10007[3] = var21;
      var10007[2] = var12;
      var10007[1] = var20;
      var10007[0] = var5;
      m44.a<"w">(this, var10007, -6696292234793046670L, var2);
   }

   public ly3(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 62858549093461L;
      super(var4, var3);
   }

   protected void m(Object[] param1) {
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
      // 004: checkcast com/zelix/lqu
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 5
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/lang/Integer
      // 025: invokevirtual java/lang/Integer.intValue ()I
      // 028: istore 2
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 3
      // 033: pop
      // 034: lload 5
      // 036: dup2
      // 037: ldc2_w 139052689147471
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 86555404386089
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 117183604112065
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 41228634740897
      // 04f: lxor
      // 050: lstore 14
      // 052: dup2
      // 053: ldc2_w 32452763901518
      // 056: lxor
      // 057: lstore 16
      // 059: pop2
      // 05a: ldc2_w -6521875426121538117
      // 05d: lload 5
      // 05f: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 7
      // 066: lload 14
      // 068: bipush 1
      // 069: anewarray 222
      // 06c: dup_x2
      // 06d: dup_x2
      // 06e: pop
      // 06f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 072: bipush 0
      // 073: swap
      // 074: aastore
      // 075: ldc2_w -4963623474998811189
      // 078: lload 5
      // 07a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: astore 19
      // 081: lload 16
      // 083: bipush 1
      // 084: anewarray 222
      // 087: dup_x2
      // 088: dup_x2
      // 089: pop
      // 08a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w -6429108569517432985
      // 093: lload 5
      // 095: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: astore 20
      // 09c: istore 18
      // 09e: new java/lang/StringBuilder
      // 0a1: dup
      // 0a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a5: aload 20
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: sipush 13485
      // 0ad: ldc2_w 1519154334766150893
      // 0b0: lload 5
      // 0b2: lxor
      // 0b3: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0be: astore 21
      // 0c0: aload 19
      // 0c2: new java/lang/StringBuilder
      // 0c5: dup
      // 0c6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c9: aload 21
      // 0cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ce: sipush 25356
      // 0d1: ldc2_w 2811840442736206664
      // 0d4: lload 5
      // 0d6: lxor
      // 0d7: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0df: aload 0
      // 0e0: ldc2_w -6533334343289920506
      // 0e3: lload 5
      // 0e5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: ldc "]"
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f5: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 0f8: ldc2_w -6626972079646401238
      // 0fb: lload 5
      // 0fd: invokedynamic i (JJ)Ljava/io/PrintStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: aload 21
      // 104: ldc2_w -4650195723326610078
      // 107: lload 5
      // 109: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: ldc2_w -4992281869728831884
      // 111: lload 5
      // 113: invokedynamic m (JJ)Ljava/lang/Runtime; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: astore 22
      // 11a: aconst_null
      // 11b: astore 23
      // 11d: aconst_null
      // 11e: astore 24
      // 120: ldc2_w -6348403953969857996
      // 123: lload 5
      // 125: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: sipush 8567
      // 12d: ldc2_w 7323812795726340404
      // 130: lload 5
      // 132: lxor
      // 133: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 13b: iload 18
      // 13d: ifeq 199
      // 140: ifeq 164
      // 143: goto 151
      // 146: ldc2_w -4873665316658290046
      // 149: lload 5
      // 14b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: sipush 15685
      // 154: ldc2_w 9208984462814657803
      // 157: lload 5
      // 159: lxor
      // 15a: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: astore 24
      // 161: goto 2d0
      // 164: ldc2_w -6348403953969857996
      // 167: lload 5
      // 169: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: iload 18
      // 170: lload 5
      // 172: lconst_0
      // 173: lcmp
      // 174: iflt 17d
      // 177: ifeq 27c
      // 17a: sipush 6511
      // 17d: ldc2_w 2744123252053252387
      // 180: lload 5
      // 182: lxor
      // 183: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 18b: goto 199
      // 18e: ldc2_w -4873665316658290046
      // 191: lload 5
      // 193: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: athrow
      // 199: lload 5
      // 19b: lconst_0
      // 19c: lcmp
      // 19d: ifle 271
      // 1a0: ifne 26e
      // 1a3: ldc2_w -6348403953969857996
      // 1a6: lload 5
      // 1a8: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: iload 18
      // 1af: ifeq 27c
      // 1b2: goto 1c0
      // 1b5: ldc2_w -4873665316658290046
      // 1b8: lload 5
      // 1ba: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: sipush 20637
      // 1c3: ldc2_w 447007745745047762
      // 1c6: lload 5
      // 1c8: lxor
      // 1c9: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1d1: lload 5
      // 1d3: lconst_0
      // 1d4: lcmp
      // 1d5: iflt 271
      // 1d8: ifne 26e
      // 1db: goto 1e9
      // 1de: ldc2_w -4873665316658290046
      // 1e1: lload 5
      // 1e3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: ldc2_w -6348403953969857996
      // 1ec: lload 5
      // 1ee: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: iload 18
      // 1f5: ifeq 27c
      // 1f8: goto 206
      // 1fb: ldc2_w -4873665316658290046
      // 1fe: lload 5
      // 200: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: athrow
      // 206: sipush 16327
      // 209: ldc2_w 8286911183297593216
      // 20c: lload 5
      // 20e: lxor
      // 20f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 217: lload 5
      // 219: lconst_0
      // 21a: lcmp
      // 21b: iflt 271
      // 21e: ifne 26e
      // 221: goto 22f
      // 224: ldc2_w -4873665316658290046
      // 227: lload 5
      // 229: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: athrow
      // 22f: ldc2_w -6348403953969857996
      // 232: lload 5
      // 234: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: sipush 20037
      // 23c: ldc2_w 4446066364506983944
      // 23f: lload 5
      // 241: lxor
      // 242: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 24a: iload 18
      // 24c: ifeq 2b6
      // 24f: goto 25d
      // 252: ldc2_w -4873665316658290046
      // 255: lload 5
      // 257: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: athrow
      // 25d: ifeq 281
      // 260: goto 26e
      // 263: ldc2_w -4873665316658290046
      // 266: lload 5
      // 268: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: sipush 32016
      // 271: ldc2_w 2715268096543587674
      // 274: lload 5
      // 276: lxor
      // 277: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: astore 24
      // 27e: goto 2d0
      // 281: ldc2_w -6348403953969857996
      // 284: lload 5
      // 286: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: iload 18
      // 28d: lload 5
      // 28f: lconst_0
      // 290: lcmp
      // 291: iflt 29a
      // 294: ifeq 2ce
      // 297: sipush 800
      // 29a: ldc2_w 6629941336324178786
      // 29d: lload 5
      // 29f: lxor
      // 2a0: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2a8: goto 2b6
      // 2ab: ldc2_w -4873665316658290046
      // 2ae: lload 5
      // 2b0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: ifeq 2cc
      // 2b9: sipush 524
      // 2bc: ldc2_w 4274160522494018122
      // 2bf: lload 5
      // 2c1: lxor
      // 2c2: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: astore 24
      // 2c9: goto 2d0
      // 2cc: ldc ""
      // 2ce: astore 24
      // 2d0: aload 22
      // 2d2: new java/lang/StringBuilder
      // 2d5: dup
      // 2d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d9: aload 24
      // 2db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2de: aload 0
      // 2df: ldc2_w -6533334343289920506
      // 2e2: lload 5
      // 2e4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ef: ldc2_w -6901090939925482373
      // 2f2: lload 5
      // 2f4: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Process; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: astore 23
      // 2fb: new com/zelix/lkz
      // 2fe: dup
      // 2ff: aload 23
      // 301: ldc2_w -5093248039686031359
      // 304: lload 5
      // 306: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: aload 19
      // 30d: aload 20
      // 30f: invokevirtual java/lang/String.length ()I
      // 312: bipush 1
      // 313: iadd
      // 314: bipush 1
      // 315: lload 12
      // 317: invokespecial com/zelix/lkz.<init> (Ljava/io/InputStream;Ljava/io/PrintWriter;IZJ)V
      // 31a: astore 25
      // 31c: new com/zelix/lkz
      // 31f: dup
      // 320: aload 23
      // 322: ldc2_w -6545423081317862373
      // 325: lload 5
      // 327: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: aload 19
      // 32e: aload 20
      // 330: invokevirtual java/lang/String.length ()I
      // 333: bipush 1
      // 334: iadd
      // 335: bipush 0
      // 336: lload 12
      // 338: invokespecial com/zelix/lkz.<init> (Ljava/io/InputStream;Ljava/io/PrintWriter;IZJ)V
      // 33b: astore 26
      // 33d: aload 25
      // 33f: ldc2_w -4621829707186068180
      // 342: lload 5
      // 344: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 349: aload 26
      // 34b: ldc2_w -4621829707186068180
      // 34e: lload 5
      // 350: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: iload 18
      // 357: lload 5
      // 359: lconst_0
      // 35a: lcmp
      // 35b: ifle 37c
      // 35e: ifeq 3a5
      // 361: ldc2_w -4661280946630894594
      // 364: lload 5
      // 366: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36b: sipush 11144
      // 36e: ldc2_w 3747351275329596353
      // 371: lload 5
      // 373: lxor
      // 374: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 37c: ifne 3aa
      // 37f: goto 38d
      // 382: ldc2_w -4873665316658290046
      // 385: lload 5
      // 387: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38c: athrow
      // 38d: aload 25
      // 38f: ldc2_w -4755926796783423197
      // 392: lload 5
      // 394: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 399: aload 26
      // 39b: ldc2_w -4755926796783423197
      // 39e: lload 5
      // 3a0: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: goto 3aa
      // 3a8: astore 27
      // 3aa: goto 43f
      // 3ad: astore 25
      // 3af: aload 7
      // 3b1: new java/lang/StringBuilder
      // 3b4: dup
      // 3b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b8: aload 0
      // 3b9: lload 8
      // 3bb: bipush 1
      // 3bc: anewarray 222
      // 3bf: dup_x2
      // 3c0: dup_x2
      // 3c1: pop
      // 3c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c5: bipush 0
      // 3c6: swap
      // 3c7: aastore
      // 3c8: ldc2_w -6375394569998293984
      // 3cb: lload 5
      // 3cd: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d5: sipush 6914
      // 3d8: ldc2_w 3457247268004830025
      // 3db: lload 5
      // 3dd: lxor
      // 3de: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e6: aload 24
      // 3e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3eb: aload 0
      // 3ec: ldc2_w -6533334343289920506
      // 3ef: lload 5
      // 3f1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f9: sipush 18704
      // 3fc: ldc2_w 8886660022911289685
      // 3ff: lload 5
      // 401: lxor
      // 402: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/ly3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 407: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40a: aload 25
      // 40c: ldc2_w -4804274569044548174
      // 40f: lload 5
      // 411: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 416: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 419: ldc "'"
      // 41b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 421: lload 10
      // 423: bipush 2
      // 424: anewarray 222
      // 427: dup_x2
      // 428: dup_x2
      // 429: pop
      // 42a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42d: bipush 1
      // 42e: swap
      // 42f: aastore
      // 430: dup_x1
      // 431: swap
      // 432: bipush 0
      // 433: swap
      // 434: aastore
      // 435: ldc2_w -4793997075062359565
      // 438: lload 5
      // 43a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43f: aload 23
      // 441: iload 18
      // 443: ifeq 459
      // 446: ifnull 465
      // 449: goto 457
      // 44c: ldc2_w -4873665316658290046
      // 44f: lload 5
      // 451: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/InterruptedException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: aload 23
      // 459: ldc2_w -6765353176893537034
      // 45c: lload 5
      // 45e: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 463: istore 25
      // 465: goto 46a
      // 468: astore 25
      // 46a: return
   }

   public String N(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"i">(533, 1536423686264701979L ^ var2);
   }

   static {
      long var0 = a ^ 20873156528455L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "ºì\u0081Ü\u009e\f PitP\u008a\u0090\bÓ7á^YW´\u0095vÝ\u0010\u009bÂ£BHlÌo\u0015+\u0013·\u001c·\u008cc\u0010H\u0001}:\u0097¿¼p O³ÝgÏ\u0003\u0092\u0010vtHÞ(\u0082î%Lñ]m\u000eG\u000fo ØIL1Ê\u0017`'âª<c/[Úæ2\béøP|&¢FmEû²\u0094)m\u0010Ã¬$ÖÈ\u0090®îÁGÑ\u0018\u00ad&\u008a\u0099\u0010±\u0015|Ô\u0080C\f\u001e\u008e÷\u0010ÓHØ\u0002\u0019(-\u009c\u0002~\u0098Ý'\u0085Þd¯\u0095}f`Þ\u0087b\u0010\u0086#¨\u0082Òj\u001f\u0000\u008b½8\u0014\u009f©K\u0007·\u0099*\u0099\u001c ,\u0080Ï\u001f²!U1R\u001d~/\u001c¹[Stâ¦vî\u001a¯lÓ\u0084&õ\u0085ñÆ~ T à¨.6ã©Â'ÚÂþzÓû\u000eÅB±Ö\u008bG\u0092\"qb\u0097\u009c\u0006¯P\u0010\u008cà\u001f\fí\u0090L¤>%îøW¼í\u0011\u0018Û_ë'Y¬¢jé\u0012¯V\u0000nréf\u001cOº\u008e\u0080ÝJ\u0018el-\u007f¼áMÂ\"\u000e\u0080\u0085×b³ÐÈôb±Õ7É¼";
      int var8 = "ºì\u0081Ü\u009e\f PitP\u008a\u0090\bÓ7á^YW´\u0095vÝ\u0010\u009bÂ£BHlÌo\u0015+\u0013·\u001c·\u008cc\u0010H\u0001}:\u0097¿¼p O³ÝgÏ\u0003\u0092\u0010vtHÞ(\u0082î%Lñ]m\u000eG\u000fo ØIL1Ê\u0017`'âª<c/[Úæ2\béøP|&¢FmEû²\u0094)m\u0010Ã¬$ÖÈ\u0090®îÁGÑ\u0018\u00ad&\u008a\u0099\u0010±\u0015|Ô\u0080C\f\u001e\u008e÷\u0010ÓHØ\u0002\u0019(-\u009c\u0002~\u0098Ý'\u0085Þd¯\u0095}f`Þ\u0087b\u0010\u0086#¨\u0082Òj\u001f\u0000\u008b½8\u0014\u009f©K\u0007·\u0099*\u0099\u001c ,\u0080Ï\u001f²!U1R\u001d~/\u001c¹[Stâ¦vî\u001a¯lÓ\u0084&õ\u0085ñÆ~ T à¨.6ã©Â'ÚÂþzÓû\u000eÅB±Ö\u008bG\u0092\"qb\u0097\u009c\u0006¯P\u0010\u008cà\u001f\fí\u0090L¤>%îøW¼í\u0011\u0018Û_ë'Y¬¢jé\u0012¯V\u0000nréf\u001cOº\u008e\u0080ÝJ\u0018el-\u007f¼áMÂ\"\u000e\u0080\u0085×b³ÐÈôb±Õ7É¼"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     e = var9;
                     f = new String[15];
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

                  var6 = "È¤`\u0086ó:lZI\u001a\u0089\u008c_\u0082¦\u008c 2û\f¦\u0007g³\u009a±õb\u0084\u0007\u001d}[×Õ\u000b\u0006'þ\u009dµ³¸¸{1\u0096}\u009d";
                  var8 = "È¤`\u0086ó:lZI\u001a\u0089\u008c_\u0082¦\u008c 2û\f¦\u0007g³\u009a±õb\u0084\u0007\u001d}[×Õ\u000b\u0006'þ\u009dµ³¸¸{1\u0096}\u009d"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10661;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ly3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("com/zelix/ly3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
