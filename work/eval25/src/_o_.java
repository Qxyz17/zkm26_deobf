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

public class _o_ extends _ow {
   private static final long b = ess.a(-9017485612724205647L, -967828151919814117L, MethodHandles.lookup().lookupClass()).a(69927041019924L);
   private static final String[] m;
   private static final String[] n;
   private static final Map p = new HashMap(13);
   private static final long[] x;
   private static final Integer[] y;
   private static final Map z;
   private static final long A;

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      StringBuilder var6 = new StringBuilder();
      var6.append(x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2));
      var6.append((char)f<"l">(31991, 8673594802105250118L ^ var2));
      x4 var7 = (x4)this.o;
      var6.append(var7.B());
      return var6.toString();
   }

   public void K(long var1, DataOutputStream var3, Map var4) {
      long var5 = var1 ^ 0L;
      super.K(var5, var3, var4);
      var3.writeShort(0);
   }

   public _o_(x4 var1, int var2, char var3, char var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      super(f<"l">(28435, 7299305426805459293L ^ var5), var1);
   }

   public xl T(long var1) {
      return x44.a<"m">(this, new Object[0], 3100083411284162545L, var1);
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 4
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 50705903688143
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 68895298760205
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 32198005677074
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 43317403178689
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 72462291038852
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 63738864407929
      // 044: lxor
      // 045: lstore 16
      // 047: pop2
      // 048: new java/lang/StringBuilder
      // 04b: dup
      // 04c: sipush 15895
      // 04f: ldc2_w 4834307135616208049
      // 052: lload 2
      // 053: lxor
      // 054: invokedynamic l (IJ)I bsm=com/zelix/_o_.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: invokespecial java/lang/StringBuilder.<init> (I)V
      // 05c: astore 19
      // 05e: aload 0
      // 05f: lload 10
      // 061: bipush 1
      // 062: anewarray 164
      // 065: dup_x2
      // 066: dup_x2
      // 067: pop
      // 068: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06b: bipush 0
      // 06c: swap
      // 06d: aastore
      // 06e: ldc2_w 8353405308985101719
      // 071: lload 2
      // 072: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: astore 20
      // 079: ldc2_w 8216154267410362304
      // 07c: lload 2
      // 07d: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: aload 0
      // 083: getfield com/zelix/_o_.o Lcom/zelix/xl;
      // 086: checkcast com/zelix/x4
      // 089: astore 21
      // 08b: astore 18
      // 08d: aload 19
      // 08f: new java/lang/StringBuilder
      // 092: dup
      // 093: invokespecial java/lang/StringBuilder.<init> ()V
      // 096: aload 20
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b: ldc " "
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: aload 21
      // 0a2: aload 18
      // 0a4: ifnonnull 0b9
      // 0a7: ifnull 0c2
      // 0aa: goto 0b7
      // 0ad: ldc2_w 7729830284307629066
      // 0b0: lload 2
      // 0b1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 21
      // 0b9: invokevirtual com/zelix/x4.B ()I
      // 0bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bf: goto 0cf
      // 0c2: sipush 13351
      // 0c5: ldc2_w 9114566211242749486
      // 0c8: lload 2
      // 0c9: lxor
      // 0ca: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_o_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: pop
      // 0d9: aload 0
      // 0da: getfield com/zelix/_o_.a I
      // 0dd: lload 14
      // 0df: dup2_x1
      // 0e0: pop2
      // 0e1: bipush 2
      // 0e2: anewarray 164
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ea: bipush 1
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x2
      // 0ee: dup_x2
      // 0ef: pop
      // 0f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: ldc2_w 8570484206580877217
      // 0f9: lload 2
      // 0fa: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: astore 22
      // 101: aload 22
      // 103: aload 21
      // 105: aload 18
      // 107: ifnonnull 11c
      // 10a: ifnull 137
      // 10d: goto 11a
      // 110: ldc2_w 7729830284307629066
      // 113: lload 2
      // 114: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 21
      // 11c: lload 16
      // 11e: bipush 1
      // 11f: anewarray 164
      // 122: dup_x2
      // 123: dup_x2
      // 124: pop
      // 125: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: ldc2_w 7704208577664510087
      // 12e: lload 2
      // 12f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: goto 144
      // 137: sipush 22618
      // 13a: ldc2_w 264079363608543826
      // 13d: lload 2
      // 13e: lxor
      // 13f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_o_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: lload 12
      // 146: dup2_x1
      // 147: pop2
      // 148: bipush 3
      // 149: anewarray 164
      // 14c: dup_x1
      // 14d: swap
      // 14e: bipush 2
      // 14f: swap
      // 150: aastore
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 1
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: ldc2_w 7799761149368071863
      // 162: lload 2
      // 163: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: astore 22
      // 16a: aload 22
      // 16c: aload 21
      // 16e: lload 2
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 18b
      // 174: aload 18
      // 176: ifnonnull 18b
      // 179: ifnull 20a
      // 17c: goto 189
      // 17f: ldc2_w 7729830284307629066
      // 182: lload 2
      // 183: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: aload 21
      // 18b: lload 8
      // 18d: bipush 1
      // 18e: anewarray 164
      // 191: dup_x2
      // 192: dup_x2
      // 193: pop
      // 194: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 197: bipush 0
      // 198: swap
      // 199: aastore
      // 19a: ldc2_w 8075811294319169448
      // 19d: lload 2
      // 19e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: aload 18
      // 1a5: ifnonnull 1df
      // 1a8: ifnull 1fa
      // 1ab: goto 1b8
      // 1ae: ldc2_w 7729830284307629066
      // 1b1: lload 2
      // 1b2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: athrow
      // 1b8: aload 21
      // 1ba: lload 8
      // 1bc: bipush 1
      // 1bd: anewarray 164
      // 1c0: dup_x2
      // 1c1: dup_x2
      // 1c2: pop
      // 1c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c6: bipush 0
      // 1c7: swap
      // 1c8: aastore
      // 1c9: ldc2_w 8075811294319169448
      // 1cc: lload 2
      // 1cd: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: goto 1df
      // 1d5: ldc2_w 7729830284307629066
      // 1d8: lload 2
      // 1d9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: lload 6
      // 1e1: bipush 1
      // 1e2: anewarray 164
      // 1e5: dup_x2
      // 1e6: dup_x2
      // 1e7: pop
      // 1e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1eb: bipush 0
      // 1ec: swap
      // 1ed: aastore
      // 1ee: ldc2_w 8390126671922703372
      // 1f1: lload 2
      // 1f2: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: goto 217
      // 1fa: sipush 22618
      // 1fd: ldc2_w 264079363608543826
      // 200: lload 2
      // 201: lxor
      // 202: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_o_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: goto 217
      // 20a: sipush 22618
      // 20d: ldc2_w 264079363608543826
      // 210: lload 2
      // 211: lxor
      // 212: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_o_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: lload 12
      // 219: dup2_x1
      // 21a: pop2
      // 21b: bipush 3
      // 21c: anewarray 164
      // 21f: dup_x1
      // 220: swap
      // 221: bipush 2
      // 222: swap
      // 223: aastore
      // 224: dup_x2
      // 225: dup_x2
      // 226: pop
      // 227: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22a: bipush 1
      // 22b: swap
      // 22c: aastore
      // 22d: dup_x1
      // 22e: swap
      // 22f: bipush 0
      // 230: swap
      // 231: aastore
      // 232: ldc2_w 7799761149368071863
      // 235: lload 2
      // 236: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: astore 22
      // 23d: lload 2
      // 23e: lconst_0
      // 23f: lcmp
      // 240: iflt 2a8
      // 243: aload 18
      // 245: ifnonnull 2a8
      // 248: aload 22
      // 24a: invokevirtual java/lang/String.length ()I
      // 24d: ifle 284
      // 250: goto 25d
      // 253: ldc2_w 7729830284307629066
      // 256: lload 2
      // 257: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: athrow
      // 25d: aload 19
      // 25f: new java/lang/StringBuilder
      // 262: dup
      // 263: invokespecial java/lang/StringBuilder.<init> ()V
      // 266: ldc "\t"
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: aload 22
      // 26d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 270: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 273: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 276: pop
      // 277: goto 284
      // 27a: ldc2_w 7729830284307629066
      // 27d: lload 2
      // 27e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: aload 5
      // 286: new java/lang/StringBuilder
      // 289: dup
      // 28a: invokespecial java/lang/StringBuilder.<init> ()V
      // 28d: aload 4
      // 28f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 292: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 295: aload 4
      // 297: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 29a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29d: aload 19
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a5: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2a8: lload 2
      // 2a9: lconst_0
      // 2aa: lcmp
      // 2ab: iflt 2c6
      // 2ae: ldc2_w 7995865561660491352
      // 2b1: lload 2
      // 2b2: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: ifnonnull 2d3
      // 2ba: bipush 5
      // 2bb: newarray 10
      // 2bd: ldc2_w 7644699945007302504
      // 2c0: lload 2
      // 2c1: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: goto 2d3
      // 2c9: ldc2_w 7729830284307629066
      // 2cc: lload 2
      // 2cd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: athrow
      // 2d3: return
   }

   public x4 p(Object[] var1) {
      return (x4)this.o;
   }

   public int d(long var1) {
      return 5;
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      super.W(var6, var2, var7);
      var2.writeShort(0);
   }

   _o_(_xx var1, va var2, _y4 var3, long var4, _y4 var6, _y4 var7, _y4 var8, _y4 var9, _y4 var10) {
      var4 = b ^ var4;
      long var11 = var4 ^ 138911210293411L;
      long var13 = var4 ^ 99847960010175L;
      super(f<"l">(12062, 2675552652025721137L ^ var4), var1, var2, var3, var6, var7, var8, var9, var13);
      x44.a<"o">(var1, A, -2529755042071042388L, var4);
      var10.G((x4)this.o, this, var11);
   }

   static {
      long var16 = b ^ 132651996035436L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[2];
      int var23 = 0;
      String var22 = "z\u00112þ\u0002Fð\u001dÅÛ@\u0080>Ø\u000e]\u00105J¤\t\u0080S\u008c\u009f\u000f¤\u001a#Ä\u0089»\u0012";
      int var24 = "z\u00112þ\u0002Fð\u001dÅÛ@\u0080>Ø\u000e]\u00105J¤\t\u0080S\u008c\u009f\u000f¤\u001a#Ä\u0089»\u0012".length();
      char var21 = 16;
      int var20 = -1;

      while (true) {
         byte[] var26 = var18.doFinal(var22.substring(++var20, var20 + var21).getBytes("ISO-8859-1"));
         String var37 = c(var26).intern();
         int var10001 = -1;
         var25[var23++] = var37;
         if ((var20 += var21) >= var24) {
            m = var25;
            n = new String[2];
            z = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var6 = 1; var6 < 8; var6++) {
               var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[4];
            int var8 = 0;
            String var9 = "ÐÆwÇîùG¶|)\u0017\u0097§R\u0083?";
            int var10 = "ÐÆwÇîùG¶|)\u0017\u0097§R\u0083?".length();
            byte var7 = 0;

            label42:
            while (true) {
               var10001 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
               long[] var30 = var11;
               var10001 = var8++;
               long var40 = ((long)var12[0] & 255L) << 56
                  | ((long)var12[1] & 255L) << 48
                  | ((long)var12[2] & 255L) << 40
                  | ((long)var12[3] & 255L) << 32
                  | ((long)var12[4] & 255L) << 24
                  | ((long)var12[5] & 255L) << 16
                  | ((long)var12[6] & 255L) << 8
                  | (long)var12[7] & 255L;
               byte var45 = -1;

               while (true) {
                  long var13 = var40;
                  byte[] var15 = var5.doFinal(
                     new byte[]{
                        (byte)((int)(var13 >>> 56)),
                        (byte)((int)(var13 >>> 48)),
                        (byte)((int)(var13 >>> 40)),
                        (byte)((int)(var13 >>> 32)),
                        (byte)((int)(var13 >>> 24)),
                        (byte)((int)(var13 >>> 16)),
                        (byte)((int)(var13 >>> 8)),
                        (byte)((int)var13)
                     }
                  );
                  long var48 = ((long)var15[0] & 255L) << 56
                     | ((long)var15[1] & 255L) << 48
                     | ((long)var15[2] & 255L) << 40
                     | ((long)var15[3] & 255L) << 32
                     | ((long)var15[4] & 255L) << 24
                     | ((long)var15[5] & 255L) << 16
                     | ((long)var15[6] & 255L) << 8
                     | (long)var15[7] & 255L;
                  switch (var45) {
                     case 0:
                        var30[var10001] = var48;
                        if (var7 >= var10) {
                           x = var11;
                           y = new Integer[4];
                           Cipher var0;
                           var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           var10002 = SecretKeyFactory.getInstance("DES");
                           var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                           for (int var1 = 1; var1 < 8; var1++) {
                              var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           long var2 = 4238939306810065275L;
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
                           long var43 = ((long)var4[0] & 255L) << 56
                              | ((long)var4[1] & 255L) << 48
                              | ((long)var4[2] & 255L) << 40
                              | ((long)var4[3] & 255L) << 32
                              | ((long)var4[4] & 255L) << 24
                              | ((long)var4[5] & 255L) << 16
                              | ((long)var4[6] & 255L) << 8
                              | (long)var4[7] & 255L;
                           byte var36 = -1;
                           A = var43;
                           return;
                        }
                        break;
                     default:
                        var30[var10001] = var48;
                        if (var7 < var10) {
                           continue label42;
                        }

                        var9 = "\u001d\u008b\u009cÅ\u000e\u009eÕR!\u0085Æ]¡ùÞk";
                        var10 = "\u001d\u008b\u009cÅ\u000e\u009eÕR!\u0085Æ]¡ùÞk".length();
                        var7 = 0;
                  }

                  byte var35 = var7;
                  var7 += 8;
                  var12 = var9.substring(var35, var7).getBytes("ISO-8859-1");
                  var30 = var11;
                  var10001 = var8++;
                  var40 = ((long)var12[0] & 255L) << 56
                     | ((long)var12[1] & 255L) << 48
                     | ((long)var12[2] & 255L) << 40
                     | ((long)var12[3] & 255L) << 32
                     | ((long)var12[4] & 255L) << 24
                     | ((long)var12[5] & 255L) << 16
                     | ((long)var12[6] & 255L) << 8
                     | (long)var12[7] & 255L;
                  var45 = 0;
               }
            }
         }

         var21 = var22.charAt(var20);
      }
   }

   private static gj a(gj var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9502;
      if (n[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])p.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_o_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = m[var5].getBytes("ISO-8859-1");
         n[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return n[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/_o_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int f(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3507;
      if (y[var3] == null) {
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
         long var5 = x[var3];
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
         Object[] var9 = (Object[])z.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               z.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         y[var3] = var15;
      }

      return y[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_o_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
