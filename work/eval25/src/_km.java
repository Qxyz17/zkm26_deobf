package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _km extends _k0 {
   final tm J;
   final Map P;
   final Map b;
   final Map Y;
   private static final long a = ess.a(1719783503724087587L, -7786600758944247821L, MethodHandles.lookup().lookupClass()).a(168528529972545L);
   private static final String[] q;
   private static final String[] t;
   private static final Map w = new HashMap(13);

   public _km(String var1, _8s var2, q2 var3, q2 var4, tm var5, vm var6, long var7, _yv var9, _ug var10, _zk var11) {
      var7 = a ^ var7;
      long var12 = var7 ^ 94376867801818L;
      long var14 = var7 ^ 7833499535613L;
      super(var1, var2, var3, var4, var12, var6, var9, var10, var11);
      this.b = x44.a<"u">(new Object[]{var14}, 4972441859620971374L, var7);
      this.Y = x44.a<"u">(new Object[]{var14}, 4972441859620971374L, var7);
      this.P = x44.a<"u">(new Object[]{var14}, 4972441859620971374L, var7);
      this.J = var5;
   }

   abstract List h(Object[] var1);

   void M(Object[] param1) {
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
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_km.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 73378198419173
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 6149220042630
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 139029070013871
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 86580431830196
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: ldc2_w -2103824182784930878
      // 03a: lload 3
      // 03b: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aconst_null
      // 041: astore 14
      // 043: astore 13
      // 045: aload 2
      // 046: sipush 19075
      // 049: ldc2_w 2909858485841556611
      // 04c: lload 3
      // 04d: lxor
      // 04e: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_km.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 056: aload 13
      // 058: ifnonnull 0ea
      // 05b: ifne 0d7
      // 05e: goto 06b
      // 061: ldc2_w -91293629134437844
      // 064: lload 3
      // 065: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 2
      // 06c: sipush 14582
      // 06f: ldc2_w 7170069504490407669
      // 072: lload 3
      // 073: lxor
      // 074: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_km.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 07c: aload 13
      // 07e: ifnonnull 0ea
      // 081: goto 08e
      // 084: ldc2_w -91293629134437844
      // 087: lload 3
      // 088: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: lload 3
      // 08f: lconst_0
      // 090: lcmp
      // 091: iflt 0dd
      // 094: ifne 0d7
      // 097: goto 0a4
      // 09a: ldc2_w -91293629134437844
      // 09d: lload 3
      // 09e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 2
      // 0a5: sipush 20652
      // 0a8: ldc2_w 1188329974433312429
      // 0ab: lload 3
      // 0ac: lxor
      // 0ad: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/_km.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0b5: aload 13
      // 0b7: ifnonnull 0ea
      // 0ba: goto 0c7
      // 0bd: ldc2_w -91293629134437844
      // 0c0: lload 3
      // 0c1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: ifeq 152
      // 0ca: goto 0d7
      // 0cd: ldc2_w -91293629134437844
      // 0d0: lload 3
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 2
      // 0d8: ldc ":"
      // 0da: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0dd: goto 0ea
      // 0e0: ldc2_w -91293629134437844
      // 0e3: lload 3
      // 0e4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: istore 15
      // 0ec: aload 2
      // 0ed: iload 15
      // 0ef: bipush 1
      // 0f0: iadd
      // 0f1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f4: astore 16
      // 0f6: aload 16
      // 0f8: aload 13
      // 0fa: ifnonnull 125
      // 0fd: ldc "/"
      // 0ff: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 102: ifeq 127
      // 105: goto 112
      // 108: ldc2_w -91293629134437844
      // 10b: lload 3
      // 10c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: aload 16
      // 114: bipush 1
      // 115: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 118: goto 125
      // 11b: ldc2_w -91293629134437844
      // 11e: lload 3
      // 11f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: astore 16
      // 127: aload 0
      // 128: lload 7
      // 12a: aload 16
      // 12c: aconst_null
      // 12d: bipush 3
      // 12e: anewarray 64
      // 131: dup_x1
      // 132: swap
      // 133: bipush 2
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: bipush 1
      // 139: swap
      // 13a: aastore
      // 13b: dup_x2
      // 13c: dup_x2
      // 13d: pop
      // 13e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: ldc2_w -81527751486712059
      // 147: lload 3
      // 148: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: astore 14
      // 14f: goto 23c
      // 152: new com/zelix/pg
      // 155: dup
      // 156: lload 9
      // 158: invokespecial com/zelix/pg.<init> (J)V
      // 15b: astore 15
      // 15d: new com/zelix/pg
      // 160: dup
      // 161: lload 9
      // 163: invokespecial com/zelix/pg.<init> (J)V
      // 166: astore 16
      // 168: aload 0
      // 169: ldc2_w -105854203887083646
      // 16c: lload 3
      // 16d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: aload 15
      // 174: aload 16
      // 176: lload 5
      // 178: bipush 4
      // 179: anewarray 64
      // 17c: dup_x2
      // 17d: dup_x2
      // 17e: pop
      // 17f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 182: bipush 3
      // 183: swap
      // 184: aastore
      // 185: dup_x1
      // 186: swap
      // 187: bipush 2
      // 188: swap
      // 189: aastore
      // 18a: dup_x1
      // 18b: swap
      // 18c: bipush 1
      // 18d: swap
      // 18e: aastore
      // 18f: dup_x1
      // 190: swap
      // 191: bipush 0
      // 192: swap
      // 193: aastore
      // 194: ldc2_w -2032536747262928716
      // 197: lload 3
      // 198: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: astore 17
      // 19f: aload 15
      // 1a1: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 1a4: checkcast java/lang/String
      // 1a7: astore 18
      // 1a9: aload 2
      // 1aa: astore 19
      // 1ac: aload 19
      // 1ae: aload 13
      // 1b0: ifnonnull 1fd
      // 1b3: ldc "/"
      // 1b5: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1b8: ifeq 1d0
      // 1bb: goto 1c8
      // 1be: ldc2_w -91293629134437844
      // 1c1: lload 3
      // 1c2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: aload 19
      // 1ca: bipush 1
      // 1cb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1ce: astore 19
      // 1d0: aload 19
      // 1d2: aload 15
      // 1d4: aload 16
      // 1d6: lload 5
      // 1d8: bipush 4
      // 1d9: anewarray 64
      // 1dc: dup_x2
      // 1dd: dup_x2
      // 1de: pop
      // 1df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e2: bipush 3
      // 1e3: swap
      // 1e4: aastore
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: bipush 2
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x1
      // 1f0: swap
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: ldc2_w -2032536747262928716
      // 1f7: lload 3
      // 1f8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: astore 20
      // 1ff: aload 15
      // 201: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 204: checkcast java/lang/String
      // 207: astore 21
      // 209: aload 16
      // 20b: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 20e: checkcast java/lang/String
      // 211: astore 22
      // 213: aload 0
      // 214: lload 7
      // 216: aload 19
      // 218: aload 18
      // 21a: bipush 3
      // 21b: anewarray 64
      // 21e: dup_x1
      // 21f: swap
      // 220: bipush 2
      // 221: swap
      // 222: aastore
      // 223: dup_x1
      // 224: swap
      // 225: bipush 1
      // 226: swap
      // 227: aastore
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22e: bipush 0
      // 22f: swap
      // 230: aastore
      // 231: ldc2_w -81527751486712059
      // 234: lload 3
      // 235: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: astore 14
      // 23c: aload 14
      // 23e: aload 13
      // 240: ifnonnull 255
      // 243: ifnull 2af
      // 246: goto 253
      // 249: ldc2_w -91293629134437844
      // 24c: lload 3
      // 24d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 14
      // 255: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 25a: astore 15
      // 25c: aload 15
      // 25e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 263: ifeq 2af
      // 266: aload 15
      // 268: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26d: checkcast java/lang/String
      // 270: astore 16
      // 272: aload 0
      // 273: ldc2_w -140470960301005122
      // 276: lload 3
      // 277: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/tm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: aload 16
      // 27e: aload 0
      // 27f: ldc2_w -61326620626405255
      // 282: lload 3
      // 283: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: lload 11
      // 28a: bipush 3
      // 28b: anewarray 64
      // 28e: dup_x2
      // 28f: dup_x2
      // 290: pop
      // 291: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 294: bipush 2
      // 295: swap
      // 296: aastore
      // 297: dup_x1
      // 298: swap
      // 299: bipush 1
      // 29a: swap
      // 29b: aastore
      // 29c: dup_x1
      // 29d: swap
      // 29e: bipush 0
      // 29f: swap
      // 2a0: aastore
      // 2a1: ldc2_w -2180674149733764820
      // 2a4: lload 3
      // 2a5: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: aload 13
      // 2ac: ifnull 25c
      // 2af: return
   }

   public _km(char var1, String var2, tm var3, _yv var4, int var5, int var6, _ug var7, _zk var8) {
      long var9 = ((long)var1 << 48 | (long)var5 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      long var10001 = var9 ^ 36559784561836L;
      int var11 = (int)((var9 ^ 36559784561836L) >>> 32);
      int var12 = (int)((var9 ^ 36559784561836L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var9 ^ 49424051637950L;
      super(var2, var11, var4, (char)var12, var7, var8, var13);
      this.b = x44.a<"v">(new Object[]{var14}, -4376792495082560211L, var9);
      this.Y = x44.a<"v">(new Object[]{var14}, -4376792495082560211L, var9);
      this.P = x44.a<"v">(new Object[]{var14}, -4376792495082560211L, var9);
      this.J = var3;
   }

   List g(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      hk[] var10000 = x44.a<"r">(6128788361108388866L, var2);
      StringTokenizer var6 = new StringTokenizer(var4, e<"e">(11568, 2853969912233731314L ^ var2));
      ArrayList var7 = new ArrayList(var6.countTokens());
      hk[] var5 = var10000;

      while (var6.hasMoreTokens()) {
         try {
            if (var2 > 0L) {
               if (var5 != null) {
                  return var7;
               }

               var7.add(var6.nextToken());
            }

            if (var5 == null) {
               continue;
            }
         } catch (gj var8) {
            throw x44.a<"r">(var8, 5295049443525801452L, var2);
         }

         if (var2 >= 0L) {
            break;
         }
      }

      return var7;
   }

   static {
      long var0 = a ^ 74326897359367L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u009c£qyÖã/\u0001\u0086!ÔÌRµV\u0082ÒüZ9\u0086\u001e\u008e>ÿ(¶³É?Z\u009e\u0010wêtL]³\u0007\u0087>{ús\u008d\u001e\u0085í";
      int var8 = "\u009c£qyÖã/\u0001\u0086!ÔÌRµV\u0082ÒüZ9\u0086\u001e\u008e>ÿ(¶³É?Z\u009e\u0010wêtL]³\u0007\u0087>{ús\u008d\u001e\u0085í".length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = e(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     q = var9;
                     t = new String[4];
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

                  var6 = "±\u0016Ü3id¶Z6\u0088Ô]V\u0084Ý- çï\u0094÷ä,ó8\u008c\u000eL(¿\"}#1óó\ft\u000f\u0089$\b\u0084¦|æg×ü";
                  var8 = "±\u0016Ü3id¶Z6\u0088Ô]V\u0084Ý- çï\u0094÷ä,ó8\u008c\u000eL(¿\"}#1óó\ft\u000f\u0089$\b\u0084¦|æg×ü".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
      return var0;
   }

   private static String e(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20946;
      if (t[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])w.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               w.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_km", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = q[var5].getBytes("ISO-8859-1");
         t[var5] = e(((Cipher)var4[0]).doFinal(var9));
      }

      return t[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_km" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
