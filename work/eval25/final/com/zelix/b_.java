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

public class b_ extends h4 implements _zv {
   private byte[] I;
   private static final long a = ess.a(-2034874416789694808L, -4264042977158370742L, MethodHandles.lookup().lookupClass()).a(167135614300270L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   protected void O(Object[] var1) {
      long var3 = (Long)var1[0];
      DataOutputStream var2 = (DataOutputStream)var1[1];
      long var5 = var3 ^ 0L;
      super.O(new Object[]{var5, var2});
      var2.write(x44.a<"h">(this, -7821293777016395273L, var3));
   }

   int x(long var1) {
      return x44.a<"k">(this, 1598343857263439020L, var1).length;
   }

   b_(h8 var1, int var2, String var3, _xx var4, long var5, _y4 var7) {
      var5 = a ^ var5;
      long var8 = var5 ^ 46363907694639L;
      super(var1, var2, var3, var8, var4, var7);
      x44.a<"q">(this, new byte[this.C], -7229672850260500183L, var5);
      var4.read(x44.a<"n">(this, -7229672850260500183L, var5));
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 10727274753381L;
      var3.H(this.c, this, this.x(), var4);
   }

   void i(Object[] param1) {
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
      // 00a: istore 7
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 5
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast java/util/HashMap
      // 01d: astore 4
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/util/HashMap
      // 025: astore 6
      // 027: dup
      // 028: bipush 4
      // 029: aaload
      // 02a: checkcast java/lang/Long
      // 02d: invokevirtual java/lang/Long.longValue ()J
      // 030: lstore 2
      // 031: pop
      // 032: lload 2
      // 033: dup2
      // 034: ldc2_w 12638330797894
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 112493197733303
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 19019423935563
      // 045: lxor
      // 046: lstore 12
      // 048: pop2
      // 049: ldc2_w 2390003288020881728
      // 04c: lload 2
      // 04d: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: new java/lang/String
      // 055: dup
      // 056: aload 0
      // 057: ldc2_w 2795184020056071240
      // 05a: lload 2
      // 05b: invokedynamic o (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: invokespecial java/lang/String.<init> ([B)V
      // 063: astore 15
      // 065: istore 14
      // 067: ldc2_w 4436326651129118536
      // 06a: lload 2
      // 06b: invokedynamic j (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: iload 14
      // 072: ifeq 0d5
      // 075: ifne 0b6
      // 078: goto 085
      // 07b: ldc2_w 2347029764503920977
      // 07e: lload 2
      // 07f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: ldc2_w 2813199017235184325
      // 088: lload 2
      // 089: invokedynamic j (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: iload 14
      // 090: lload 2
      // 091: lconst_0
      // 092: lcmp
      // 093: ifle 0d7
      // 096: ifeq 0d5
      // 099: goto 0a6
      // 09c: ldc2_w 2347029764503920977
      // 09f: lload 2
      // 0a0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: ifeq 305
      // 0a9: goto 0b6
      // 0ac: ldc2_w 2347029764503920977
      // 0af: lload 2
      // 0b0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: aload 15
      // 0b8: sipush 21837
      // 0bb: ldc2_w 2675881078993449958
      // 0be: lload 2
      // 0bf: lxor
      // 0c0: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/b_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0c8: goto 0d5
      // 0cb: ldc2_w 2347029764503920977
      // 0ce: lload 2
      // 0cf: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: iload 14
      // 0d7: lload 2
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: ifle 111
      // 0dd: ifeq 10f
      // 0e0: ifeq 305
      // 0e3: goto 0f0
      // 0e6: ldc2_w 2347029764503920977
      // 0e9: lload 2
      // 0ea: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 15
      // 0f2: sipush 31214
      // 0f5: ldc2_w 4478106045256654660
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/b_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 102: goto 10f
      // 105: ldc2_w 2347029764503920977
      // 108: lload 2
      // 109: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: iload 14
      // 111: lload 2
      // 112: lconst_0
      // 113: lcmp
      // 114: iflt 11b
      // 117: ifeq 139
      // 11a: bipush -1
      // 11b: if_icmple 305
      // 11e: goto 12b
      // 121: ldc2_w 2347029764503920977
      // 124: lload 2
      // 125: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: bipush 0
      // 12c: goto 139
      // 12f: ldc2_w 2347029764503920977
      // 132: lload 2
      // 133: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: istore 16
      // 13b: new java/lang/StringBuilder
      // 13e: dup
      // 13f: invokespecial java/lang/StringBuilder.<init> ()V
      // 142: astore 17
      // 144: new java/util/StringTokenizer
      // 147: dup
      // 148: aload 15
      // 14a: ldc "\n"
      // 14c: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 14f: astore 18
      // 151: new com/zelix/xx
      // 154: dup
      // 155: invokespecial com/zelix/xx.<init> ()V
      // 158: astore 19
      // 15a: aload 18
      // 15c: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 15f: ifeq 2d5
      // 162: aload 18
      // 164: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 167: astore 20
      // 169: aconst_null
      // 16a: astore 21
      // 16c: aload 19
      // 16e: bipush 0
      // 16f: invokevirtual com/zelix/xx.Q (Z)V
      // 172: aload 20
      // 174: iload 14
      // 176: lload 2
      // 177: lconst_0
      // 178: lcmp
      // 179: iflt 183
      // 17c: ifeq 21a
      // 17f: getstatic com/zelix/b_.f J
      // 182: l2i
      // 183: lload 10
      // 185: dup2_x2
      // 186: pop2
      // 187: invokestatic com/zelix/l_.p (JLjava/lang/String;C)I
      // 18a: lload 2
      // 18b: lconst_0
      // 18c: lcmp
      // 18d: iflt 2dd
      // 190: iload 14
      // 192: ifeq 2dd
      // 195: goto 1a2
      // 198: ldc2_w 2347029764503920977
      // 19b: lload 2
      // 19c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: bipush 1
      // 1a3: if_icmpge 1e0
      // 1a6: goto 1b3
      // 1a9: ldc2_w 2347029764503920977
      // 1ac: lload 2
      // 1ad: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: lload 8
      // 1b6: invokevirtual com/zelix/b_.k (J)Ljava/lang/String;
      // 1b9: iload 14
      // 1bb: ifeq 21a
      // 1be: goto 1cb
      // 1c1: ldc2_w 2347029764503920977
      // 1c4: lload 2
      // 1c5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 20
      // 1cd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d0: ifeq 21c
      // 1d3: goto 1e0
      // 1d6: ldc2_w 2347029764503920977
      // 1d9: lload 2
      // 1da: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: aload 20
      // 1e2: aload 6
      // 1e4: lload 12
      // 1e6: aload 19
      // 1e8: bipush 4
      // 1e9: anewarray 162
      // 1ec: dup_x1
      // 1ed: swap
      // 1ee: bipush 3
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x2
      // 1f2: dup_x2
      // 1f3: pop
      // 1f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f7: bipush 2
      // 1f8: swap
      // 1f9: aastore
      // 1fa: dup_x1
      // 1fb: swap
      // 1fc: bipush 1
      // 1fd: swap
      // 1fe: aastore
      // 1ff: dup_x1
      // 200: swap
      // 201: bipush 0
      // 202: swap
      // 203: aastore
      // 204: ldc2_w 4577388976013538228
      // 207: lload 2
      // 208: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: goto 21a
      // 210: ldc2_w 2347029764503920977
      // 213: lload 2
      // 214: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: astore 21
      // 21c: aload 17
      // 21e: invokevirtual java/lang/StringBuilder.length ()I
      // 221: lload 2
      // 222: lconst_0
      // 223: lcmp
      // 224: iflt 256
      // 227: iload 14
      // 229: ifeq 256
      // 22c: ifle 251
      // 22f: goto 23c
      // 232: ldc2_w 2347029764503920977
      // 235: lload 2
      // 236: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: athrow
      // 23c: aload 17
      // 23e: ldc "\n"
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: pop
      // 244: goto 251
      // 247: ldc2_w 2347029764503920977
      // 24a: lload 2
      // 24b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: aload 19
      // 253: invokevirtual com/zelix/xx.S ()Z
      // 256: ifeq 2bb
      // 259: aload 21
      // 25b: lload 2
      // 25c: lconst_0
      // 25d: lcmp
      // 25e: ifle 285
      // 261: iload 14
      // 263: ifeq 285
      // 266: goto 273
      // 269: ldc2_w 2347029764503920977
      // 26c: lload 2
      // 26d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: athrow
      // 273: ifnull 2bb
      // 276: goto 283
      // 279: ldc2_w 2347029764503920977
      // 27c: lload 2
      // 27d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: athrow
      // 283: aload 21
      // 285: aload 20
      // 287: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28a: lload 2
      // 28b: lconst_0
      // 28c: lcmp
      // 28d: ifle 2b2
      // 290: iload 14
      // 292: ifeq 2a6
      // 295: ifne 2bb
      // 298: goto 2a5
      // 29b: ldc2_w 2347029764503920977
      // 29e: lload 2
      // 29f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a4: athrow
      // 2a5: bipush 1
      // 2a6: istore 16
      // 2a8: aload 17
      // 2aa: aload 21
      // 2ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2af: pop
      // 2b0: iload 14
      // 2b2: lload 2
      // 2b3: lconst_0
      // 2b4: lcmp
      // 2b5: iflt 2d2
      // 2b8: ifne 2d0
      // 2bb: aload 17
      // 2bd: aload 20
      // 2bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c2: pop
      // 2c3: goto 2d0
      // 2c6: ldc2_w 2347029764503920977
      // 2c9: lload 2
      // 2ca: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: iload 14
      // 2d2: ifne 15a
      // 2d5: lload 2
      // 2d6: lconst_0
      // 2d7: lcmp
      // 2d8: ifle 305
      // 2db: iload 16
      // 2dd: ifeq 305
      // 2e0: aload 0
      // 2e1: aload 17
      // 2e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e6: ldc2_w 4591041674104717714
      // 2e9: lload 2
      // 2ea: invokedynamic k (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: ldc2_w 2795184020056071240
      // 2f2: lload 2
      // 2f3: invokedynamic p (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: goto 305
      // 2fb: ldc2_w 2347029764503920977
      // 2fe: lload 2
      // 2ff: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: athrow
      // 305: return
   }

   protected void j(Object[] var1) {
      DataOutputStream var2 = (DataOutputStream)var1[0];
      long var3 = (Long)var1[1];
      Map var5 = (Map)var1[2];
      _ur var6 = (_ur)var1[3];
      long var7 = var3 ^ 0L;
      super.j(new Object[]{var2, var7, var5, var6});
      var2.write(x44.a<"i">(this, -3570106904522083082L, var3));
   }

   static {
      long var5 = a ^ 68877235143578L;
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
      String var11 = "$\u0083p\u0097!ÑÆx\u0018Qh\u008a\u0098mÕ¿\u0010\u0086\u0098h\u000f\u0016øFd\u008e\u0092~\r\u008bÝé9";
      int var13 = "$\u0083p\u0097!ÑÆx\u0018Qh\u008a\u0098mÕ¿\u0010\u0086\u0098h\u000f\u0016øFd\u008e\u0092~\r\u008bÝé9".length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = c(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            d = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -3357070347002438031L;
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
            f = var23;
            return;
         }

         var10 = var11.charAt(var9);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2850;
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
            throw new RuntimeException("com/zelix/b_", var10);
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
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/b_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
