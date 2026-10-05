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

public class _oa extends _og implements e2, l6, sv, _8f {
   private xl K;
   private static final long b = ess.a(-2638827387696822602L, 2021133655853838950L, MethodHandles.lookup().lookupClass()).a(151006760794567L);
   private static final String[] c;
   private static final String[] g;
   private static final Map k = new HashMap(13);
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;

   public final boolean Y(Object[] var1) {
      int var3 = (Integer)var1[0];
      n var6 = (n)var1[1];
      int var2 = (Integer)var1[2];
      long var4 = (Long)var1[3];
      return false;
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
      // 002: ldc2_w 40956089078999
      // 005: lxor
      // 006: dup2
      // 007: bipush 48
      // 009: lushr
      // 00a: l2i
      // 00b: istore 8
      // 00d: dup2
      // 00e: bipush 16
      // 010: lshl
      // 011: bipush 48
      // 013: lushr
      // 014: l2i
      // 015: istore 9
      // 017: dup2
      // 018: bipush 32
      // 01a: lshl
      // 01b: bipush 32
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 10
      // 021: pop2
      // 022: dup2
      // 023: ldc2_w 44380989237168
      // 026: lxor
      // 027: dup2
      // 028: bipush 48
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 11
      // 02e: dup2
      // 02f: bipush 16
      // 031: lshl
      // 032: bipush 32
      // 034: lushr
      // 035: l2i
      // 036: istore 12
      // 038: dup2
      // 039: bipush 48
      // 03b: lshl
      // 03c: bipush 48
      // 03e: lushr
      // 03f: l2i
      // 040: istore 13
      // 042: pop2
      // 043: dup2
      // 044: ldc2_w 32610570959058
      // 047: lxor
      // 048: lstore 14
      // 04a: dup2
      // 04b: ldc2_w 65516431573146
      // 04e: lxor
      // 04f: lstore 16
      // 051: dup2
      // 052: ldc2_w 118237195067467
      // 055: lxor
      // 056: lstore 18
      // 058: dup2
      // 059: ldc2_w 37585498234552
      // 05c: lxor
      // 05d: lstore 20
      // 05f: pop2
      // 060: aload 1
      // 061: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 064: astore 23
      // 066: ldc2_w 8522769916746197891
      // 069: lload 2
      // 06a: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 23
      // 071: arraylength
      // 072: istore 24
      // 074: iload 24
      // 076: bipush 1
      // 077: iadd
      // 078: lload 18
      // 07a: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 07d: astore 25
      // 07f: aload 1
      // 080: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 083: astore 26
      // 085: astore 22
      // 087: aload 23
      // 089: bipush 0
      // 08a: aload 25
      // 08c: bipush 0
      // 08d: iload 24
      // 08f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 092: aload 0
      // 093: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 096: instanceof com/zelix/ab
      // 099: aload 22
      // 09b: ifnonnull 1bb
      // 09e: ifeq 1a7
      // 0a1: goto 0ae
      // 0a4: ldc2_w 8183125814198627904
      // 0a7: lload 2
      // 0a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 0b2: checkcast com/zelix/ab
      // 0b5: iload 11
      // 0b7: i2c
      // 0b8: iload 12
      // 0ba: iload 13
      // 0bc: i2c
      // 0bd: invokeinterface com/zelix/ab.l (CIC)Ljava/lang/String; 4
      // 0c2: astore 27
      // 0c4: aload 27
      // 0c6: sipush 3076
      // 0c9: ldc2_w 2721718837932305420
      // 0cc: lload 2
      // 0cd: lxor
      // 0ce: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/_oa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d6: aload 22
      // 0d8: lload 2
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 138
      // 0de: ifnonnull 130
      // 0e1: ifeq 111
      // 0e4: goto 0f1
      // 0e7: ldc2_w 8183125814198627904
      // 0ea: lload 2
      // 0eb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 25
      // 0f3: iload 24
      // 0f5: getstatic com/zelix/n.n Lcom/zelix/n;
      // 0f8: aastore
      // 0f9: aload 22
      // 0fb: lload 2
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: iflt 1a4
      // 101: ifnull 1a2
      // 104: goto 111
      // 107: ldc2_w 8183125814198627904
      // 10a: lload 2
      // 10b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 27
      // 113: sipush 26468
      // 116: ldc2_w 5946490962422876008
      // 119: lload 2
      // 11a: lxor
      // 11b: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/_oa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 123: goto 130
      // 126: ldc2_w 8183125814198627904
      // 129: lload 2
      // 12a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: lload 2
      // 131: lconst_0
      // 132: lcmp
      // 133: iflt 18a
      // 136: aload 22
      // 138: ifnonnull 18a
      // 13b: ifeq 16b
      // 13e: goto 14b
      // 141: ldc2_w 8183125814198627904
      // 144: lload 2
      // 145: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: aload 25
      // 14d: iload 24
      // 14f: getstatic com/zelix/n.Z Lcom/zelix/n;
      // 152: aastore
      // 153: aload 22
      // 155: lload 2
      // 156: lconst_0
      // 157: lcmp
      // 158: ifle 1a4
      // 15b: ifnull 1a2
      // 15e: goto 16b
      // 161: ldc2_w 8183125814198627904
      // 164: lload 2
      // 165: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 27
      // 16d: sipush 19495
      // 170: ldc2_w 2279753349212433454
      // 173: lload 2
      // 174: lxor
      // 175: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/_oa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17d: goto 18a
      // 180: ldc2_w 8183125814198627904
      // 183: lload 2
      // 184: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: ifeq 1a2
      // 18d: aload 25
      // 18f: iload 24
      // 191: getstatic com/zelix/n.o Lcom/zelix/n;
      // 194: aastore
      // 195: goto 1a2
      // 198: ldc2_w 8183125814198627904
      // 19b: lload 2
      // 19c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aload 22
      // 1a4: ifnull 353
      // 1a7: aload 0
      // 1a8: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 1ab: instanceof com/zelix/x7
      // 1ae: goto 1bb
      // 1b1: ldc2_w 8183125814198627904
      // 1b4: lload 2
      // 1b5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: aload 22
      // 1bd: lload 2
      // 1be: lconst_0
      // 1bf: lcmp
      // 1c0: ifle 20c
      // 1c3: ifnonnull 20a
      // 1c6: ifeq 1f6
      // 1c9: goto 1d6
      // 1cc: ldc2_w 8183125814198627904
      // 1cf: lload 2
      // 1d0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: aload 25
      // 1d8: iload 24
      // 1da: ldc2_w 8031723645001652380
      // 1dd: lload 2
      // 1de: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: aastore
      // 1e4: aload 22
      // 1e6: ifnull 353
      // 1e9: goto 1f6
      // 1ec: ldc2_w 8183125814198627904
      // 1ef: lload 2
      // 1f0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 1fa: instanceof com/zelix/xb
      // 1fd: goto 20a
      // 200: ldc2_w 8183125814198627904
      // 203: lload 2
      // 204: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: aload 22
      // 20c: lload 2
      // 20d: lconst_0
      // 20e: lcmp
      // 20f: ifle 279
      // 212: ifnonnull 277
      // 215: ifeq 263
      // 218: goto 225
      // 21b: ldc2_w 8183125814198627904
      // 21e: lload 2
      // 21f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: athrow
      // 225: iload 24
      // 227: bipush 1
      // 228: iadd
      // 229: lload 2
      // 22a: lconst_0
      // 22b: lcmp
      // 22c: iflt 26a
      // 22f: lload 18
      // 231: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 234: astore 25
      // 236: aload 23
      // 238: bipush 0
      // 239: aload 25
      // 23b: bipush 0
      // 23c: iload 24
      // 23e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 241: aload 25
      // 243: iload 24
      // 245: iload 8
      // 247: i2c
      // 248: iload 9
      // 24a: i2s
      // 24b: sipush 28443
      // 24e: ldc2_w 6030849867384278800
      // 251: lload 2
      // 252: lxor
      // 253: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/_oa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: iload 10
      // 25a: invokestatic com/zelix/n.s (CSLjava/lang/String;I)Lcom/zelix/n;
      // 25d: aastore
      // 25e: aload 22
      // 260: ifnull 353
      // 263: aload 0
      // 264: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 267: instanceof com/zelix/x_
      // 26a: goto 277
      // 26d: ldc2_w 8183125814198627904
      // 270: lload 2
      // 271: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: athrow
      // 277: aload 22
      // 279: lload 2
      // 27a: lconst_0
      // 27b: lcmp
      // 27c: ifle 2e6
      // 27f: ifnonnull 2e4
      // 282: ifeq 2d0
      // 285: goto 292
      // 288: ldc2_w 8183125814198627904
      // 28b: lload 2
      // 28c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: athrow
      // 292: iload 24
      // 294: bipush 1
      // 295: iadd
      // 296: lload 2
      // 297: lconst_0
      // 298: lcmp
      // 299: ifle 2d7
      // 29c: lload 18
      // 29e: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 2a1: astore 25
      // 2a3: aload 23
      // 2a5: bipush 0
      // 2a6: aload 25
      // 2a8: bipush 0
      // 2a9: iload 24
      // 2ab: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2ae: aload 25
      // 2b0: iload 24
      // 2b2: iload 8
      // 2b4: i2c
      // 2b5: iload 9
      // 2b7: i2s
      // 2b8: sipush 31663
      // 2bb: ldc2_w 8499535061791169445
      // 2be: lload 2
      // 2bf: lxor
      // 2c0: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/_oa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: iload 10
      // 2c7: invokestatic com/zelix/n.s (CSLjava/lang/String;I)Lcom/zelix/n;
      // 2ca: aastore
      // 2cb: aload 22
      // 2cd: ifnull 353
      // 2d0: aload 0
      // 2d1: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 2d4: instanceof com/zelix/x2
      // 2d7: goto 2e4
      // 2da: ldc2_w 8183125814198627904
      // 2dd: lload 2
      // 2de: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: athrow
      // 2e4: aload 22
      // 2e6: ifnonnull 30a
      // 2e9: ifeq 353
      // 2ec: goto 2f9
      // 2ef: ldc2_w 8183125814198627904
      // 2f2: lload 2
      // 2f3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: athrow
      // 2f9: iload 24
      // 2fb: bipush 1
      // 2fc: iadd
      // 2fd: goto 30a
      // 300: ldc2_w 8183125814198627904
      // 303: lload 2
      // 304: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: athrow
      // 30a: lload 18
      // 30c: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 30f: astore 25
      // 311: aload 23
      // 313: bipush 0
      // 314: aload 25
      // 316: bipush 0
      // 317: iload 24
      // 319: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 31c: aload 0
      // 31d: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 320: checkcast com/zelix/x2
      // 323: astore 27
      // 325: aload 27
      // 327: lload 16
      // 329: bipush 1
      // 32a: anewarray 151
      // 32d: dup_x2
      // 32e: dup_x2
      // 32f: pop
      // 330: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 333: bipush 0
      // 334: swap
      // 335: aastore
      // 336: ldc2_w 8153289640925448311
      // 339: lload 2
      // 33a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: astore 28
      // 341: aload 25
      // 343: iload 24
      // 345: iload 8
      // 347: i2c
      // 348: iload 9
      // 34a: i2s
      // 34b: aload 28
      // 34d: iload 10
      // 34f: invokestatic com/zelix/n.s (CSLjava/lang/String;I)Lcom/zelix/n;
      // 352: aastore
      // 353: new com/zelix/_kz
      // 356: dup
      // 357: aload 25
      // 359: aload 26
      // 35b: aload 1
      // 35c: invokevirtual com/zelix/_kz.z ()Lcom/zelix/p5;
      // 35f: lload 20
      // 361: dup2_x1
      // 362: pop2
      // 363: aload 1
      // 364: lload 14
      // 366: invokevirtual com/zelix/_kz.C (J)Ljava/util/Set;
      // 369: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 36c: areturn
   }

   public boolean B(long var1) {
      return this.K instanceof md;
   }

   public _oa(xl var1, long var2) {
      var2 = b ^ var2;
      super(c<"q">(5017, 7660201716110836243L ^ var2));
      this.K = var1;
   }

   public final boolean N(int var1, int var2, long var3) {
      return false;
   }

   public int d(long var1) {
      return 2;
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
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
      // 00a: lstore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/vl
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Set
      // 019: astore 7
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/ig
      // 021: astore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Integer
      // 029: invokevirtual java/lang/Integer.intValue ()I
      // 02c: istore 3
      // 02d: pop
      // 02e: lload 5
      // 030: dup2
      // 031: ldc2_w 121987924923469
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 97216502536050
      // 03b: lxor
      // 03c: lstore 10
      // 03e: pop2
      // 03f: ldc2_w 2998777842624017496
      // 042: lload 5
      // 044: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: astore 12
      // 04b: aload 0
      // 04c: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 04f: instanceof com/zelix/mf
      // 052: aload 12
      // 054: ifnonnull 121
      // 057: ifeq 120
      // 05a: goto 068
      // 05d: ldc2_w 3335890826319573403
      // 060: lload 5
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 0
      // 069: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 06c: checkcast com/zelix/mf
      // 06f: astore 13
      // 071: aload 13
      // 073: lload 10
      // 075: bipush 1
      // 076: anewarray 151
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: ldc2_w 3432430603366247159
      // 085: lload 5
      // 087: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: aload 12
      // 08e: ifnonnull 11f
      // 091: ifeq 11e
      // 094: goto 0a2
      // 097: ldc2_w 3335890826319573403
      // 09a: lload 5
      // 09c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 7
      // 0a4: aload 13
      // 0a6: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0ab: aload 12
      // 0ad: ifnonnull 11f
      // 0b0: goto 0be
      // 0b3: ldc2_w 3335890826319573403
      // 0b6: lload 5
      // 0b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: ifne 11e
      // 0c1: goto 0cf
      // 0c4: ldc2_w 3335890826319573403
      // 0c7: lload 5
      // 0c9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: aload 4
      // 0d2: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 0d5: lload 8
      // 0d7: dup2_x1
      // 0d8: pop2
      // 0d9: aload 4
      // 0db: aload 13
      // 0dd: new com/zelix/eb
      // 0e0: dup
      // 0e1: iload 3
      // 0e2: aload 0
      // 0e3: invokespecial com/zelix/eb.<init> (ILjava/lang/Object;)V
      // 0e6: bipush 5
      // 0e7: anewarray 151
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 4
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x1
      // 0f0: swap
      // 0f1: bipush 3
      // 0f2: swap
      // 0f3: aastore
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: bipush 2
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: bipush 1
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: ldc2_w 3315194698407733423
      // 10a: lload 5
      // 10c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: bipush 1
      // 112: ireturn
      // 113: ldc2_w 3335890826319573403
      // 116: lload 5
      // 118: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: bipush 0
      // 11f: ireturn
      // 120: bipush 0
      // 121: ireturn
   }

   public void K(long param1, DataOutputStream param3, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 62876048357146
      // 05: lxor
      // 06: dup2
      // 07: bipush 32
      // 09: lushr
      // 0a: l2i
      // 0b: istore 5
      // 0d: dup2
      // 0e: bipush 32
      // 10: lshl
      // 11: bipush 32
      // 13: lushr
      // 14: l2i
      // 15: istore 6
      // 17: pop2
      // 18: pop2
      // 19: ldc2_w -2833976140785367698
      // 1c: lload 1
      // 1d: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 0
      // 23: iload 5
      // 25: aload 3
      // 26: iload 6
      // 28: invokespecial com/zelix/_og.W (ILjava/io/DataOutputStream;I)V
      // 2b: astore 7
      // 2d: aload 4
      // 2f: aload 0
      // 30: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 33: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 38: checkcast com/zelix/xl
      // 3b: astore 8
      // 3d: aload 7
      // 3f: ifnonnull 6a
      // 42: aload 8
      // 44: ifnull 75
      // 47: goto 54
      // 4a: ldc2_w -2342705029633818451
      // 4d: lload 1
      // 4e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 3
      // 55: aload 8
      // 57: invokevirtual com/zelix/xl.B ()I
      // 5a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 5d: goto 6a
      // 60: ldc2_w -2342705029633818451
      // 63: lload 1
      // 64: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: lload 1
      // 6b: lconst_0
      // 6c: lcmp
      // 6d: ifle 80
      // 70: aload 7
      // 72: ifnull 8d
      // 75: aload 3
      // 76: aload 0
      // 77: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 7a: invokevirtual com/zelix/xl.B ()I
      // 7d: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 80: goto 8d
      // 83: ldc2_w -2342705029633818451
      // 86: lload 1
      // 87: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: return
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      super.W(var6, var2, var7);
      var2.writeByte(this.K.B());
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public _og p(Map var1, long var2, byte var4) {
      long var5 = var2 << 8 | (long)var4 << 56 >>> 56;
      long var7 = var5 ^ 63572574923285L;
      int[] var10000 = x44.a<"u">(-8071398902952095175L, var5);
      xl var11 = (xl)sh.a(this.K, var1, var7);
      int[] var9 = var10000;

      xl var10;
      label47: {
         label55: {
            label51: {
               try {
                  var16 = var11;
                  if (var9 != null) {
                     break label55;
                  }

                  if (var11 == null) {
                     break label51;
                  }
               } catch (gj var15) {
                  throw x44.a<"u">(var15, -8635059712188377094L, var5);
               }

               var10 = var11;

               try {
                  if (var2 <= 0L || var9 == null) {
                     break label47;
                  }
               } catch (gj var14) {
                  boolean var10001 = false;
                  throw x44.a<"u">(var14, -8635059712188377094L, var5);
               }
            }

            try {
               var16 = this.K;
            } catch (gj var13) {
               boolean var18 = false;
               throw x44.a<"u">(var13, -8635059712188377094L, var5);
            }
         }

         var10 = var16;
      }

      try {
         return var10.B() > c<"q">(16344, 6928184808878042499L ^ var5) ? new _ow(c<"q">(15904, 3642640972576058493L ^ var5), this.K) : null;
      } catch (gj var12) {
         throw x44.a<"u">(var12, -8635059712188377094L, var5);
      }
   }

   public boolean f(short param1, vl param2, Set param3, int param4, int param5, ig param6, int param7) {
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
      // 005: iload 4
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 5
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: lstore 8
      // 01b: lload 8
      // 01d: dup2
      // 01e: ldc2_w 51717154991211
      // 021: lxor
      // 022: lstore 10
      // 024: dup2
      // 025: ldc2_w 133245571623281
      // 028: lxor
      // 029: lstore 12
      // 02b: pop2
      // 02c: ldc2_w 5889456469583252606
      // 02f: lload 8
      // 031: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: astore 14
      // 038: aload 0
      // 039: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 03c: instanceof com/zelix/md
      // 03f: aload 14
      // 041: ifnonnull 14a
      // 044: ifeq 149
      // 047: goto 055
      // 04a: ldc2_w 6227694279444875709
      // 04d: lload 8
      // 04f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: athrow
      // 055: aload 0
      // 056: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 059: checkcast com/zelix/md
      // 05c: astore 15
      // 05e: aload 15
      // 060: invokevirtual com/zelix/md.U ()Lcom/zelix/mx;
      // 063: astore 16
      // 065: aload 16
      // 067: bipush 0
      // 068: anewarray 151
      // 06b: ldc2_w 5233385655635653200
      // 06e: lload 8
      // 070: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: aload 14
      // 077: ifnonnull 148
      // 07a: bipush 2
      // 07b: if_icmplt 147
      // 07e: goto 08c
      // 081: ldc2_w 6227694279444875709
      // 084: lload 8
      // 086: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: aload 15
      // 08e: lload 12
      // 090: bipush 1
      // 091: anewarray 151
      // 094: dup_x2
      // 095: dup_x2
      // 096: pop
      // 097: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09a: bipush 0
      // 09b: swap
      // 09c: aastore
      // 09d: ldc2_w 6212380124711547677
      // 0a0: lload 8
      // 0a2: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: aload 14
      // 0a9: ifnonnull 148
      // 0ac: goto 0ba
      // 0af: ldc2_w 6227694279444875709
      // 0b2: lload 8
      // 0b4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: ifeq 147
      // 0bd: goto 0cb
      // 0c0: ldc2_w 6227694279444875709
      // 0c3: lload 8
      // 0c5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 3
      // 0cc: aload 15
      // 0ce: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0d3: aload 14
      // 0d5: ifnonnull 148
      // 0d8: goto 0e6
      // 0db: ldc2_w 6227694279444875709
      // 0de: lload 8
      // 0e0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: ifne 147
      // 0e9: goto 0f7
      // 0ec: ldc2_w 6227694279444875709
      // 0ef: lload 8
      // 0f1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 2
      // 0f8: aload 6
      // 0fa: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 0fd: lload 10
      // 0ff: dup2_x1
      // 100: pop2
      // 101: aload 6
      // 103: aload 15
      // 105: new com/zelix/eb
      // 108: dup
      // 109: iload 7
      // 10b: aload 0
      // 10c: invokespecial com/zelix/eb.<init> (ILjava/lang/Object;)V
      // 10f: bipush 5
      // 110: anewarray 151
      // 113: dup_x1
      // 114: swap
      // 115: bipush 4
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: bipush 3
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 2
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x2
      // 128: dup_x2
      // 129: pop
      // 12a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12d: bipush 0
      // 12e: swap
      // 12f: aastore
      // 130: ldc2_w 6208126292874858633
      // 133: lload 8
      // 135: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: bipush 1
      // 13b: ireturn
      // 13c: ldc2_w 6227694279444875709
      // 13f: lload 8
      // 141: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: bipush 0
      // 148: ireturn
      // 149: bipush 0
      // 14a: ireturn
   }

   public final boolean c(char var1, short var2, int var3) {
      return false;
   }

   public void x(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/md
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/md
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w -718932483479934016
      // 1e: lload 4
      // 20: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 6
      // 27: aload 0
      // 28: aload 6
      // 2a: ifnonnull 51
      // 2d: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 30: aload 3
      // 31: if_acmpne 55
      // 34: goto 42
      // 37: ldc2_w -1021352636934656509
      // 3a: lload 4
      // 3c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 51
      // 46: ldc2_w -1021352636934656509
      // 49: lload 4
      // 4b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 2
      // 52: putfield com/zelix/_oa.K Lcom/zelix/xl;
      // 55: return
   }

   public xl T(long var1) {
      return this.K;
   }

   public void h(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/x7
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast com/zelix/x7
      // 18: astore 5
      // 1a: pop
      // 1b: ldc2_w 1351514959005716228
      // 1e: lload 3
      // 1f: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnonnull 4e
      // 2c: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 2f: aload 2
      // 30: if_acmpne 53
      // 33: goto 40
      // 36: ldc2_w 1519736411329137351
      // 39: lload 3
      // 3a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: goto 4e
      // 44: ldc2_w 1519736411329137351
      // 47: lload 3
      // 48: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 5
      // 50: putfield com/zelix/_oa.K Lcom/zelix/xl;
      // 53: return
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
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
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 40214334285223
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 32198005677074
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 43317403178689
      // 02e: lxor
      // 02f: lstore 10
      // 031: dup2
      // 032: ldc2_w 72462291038852
      // 035: lxor
      // 036: lstore 12
      // 038: pop2
      // 039: ldc2_w 8216154267410362304
      // 03c: lload 3
      // 03d: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: new java/lang/StringBuilder
      // 045: dup
      // 046: sipush 29875
      // 049: ldc2_w 5519180937727695636
      // 04c: lload 3
      // 04d: lxor
      // 04e: invokedynamic q (IJ)I bsm=com/zelix/_oa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: invokespecial java/lang/StringBuilder.<init> (I)V
      // 056: astore 15
      // 058: aload 0
      // 059: lload 8
      // 05b: bipush 1
      // 05c: anewarray 151
      // 05f: dup_x2
      // 060: dup_x2
      // 061: pop
      // 062: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 065: bipush 0
      // 066: swap
      // 067: aastore
      // 068: ldc2_w 8353405308985101719
      // 06b: lload 3
      // 06c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: astore 16
      // 073: aload 15
      // 075: new java/lang/StringBuilder
      // 078: dup
      // 079: invokespecial java/lang/StringBuilder.<init> ()V
      // 07c: aload 16
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 081: ldc " "
      // 083: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 086: aload 0
      // 087: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 08a: lload 6
      // 08c: bipush 1
      // 08d: anewarray 151
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: ldc2_w 8468695778281420936
      // 09c: lload 3
      // 09d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ab: pop
      // 0ac: aload 0
      // 0ad: getfield com/zelix/_oa.a I
      // 0b0: lload 12
      // 0b2: dup2_x1
      // 0b3: pop2
      // 0b4: bipush 2
      // 0b5: anewarray 151
      // 0b8: dup_x1
      // 0b9: swap
      // 0ba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bd: bipush 1
      // 0be: swap
      // 0bf: aastore
      // 0c0: dup_x2
      // 0c1: dup_x2
      // 0c2: pop
      // 0c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c6: bipush 0
      // 0c7: swap
      // 0c8: aastore
      // 0c9: ldc2_w 8570484206580877217
      // 0cc: lload 3
      // 0cd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: astore 17
      // 0d4: aload 17
      // 0d6: aload 0
      // 0d7: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 0da: lload 6
      // 0dc: bipush 1
      // 0dd: anewarray 151
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 0
      // 0e7: swap
      // 0e8: aastore
      // 0e9: ldc2_w 8468695778281420936
      // 0ec: lload 3
      // 0ed: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: lload 10
      // 0f4: dup2_x1
      // 0f5: pop2
      // 0f6: bipush 3
      // 0f7: anewarray 151
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 2
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x2
      // 100: dup_x2
      // 101: pop
      // 102: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x1
      // 109: swap
      // 10a: bipush 0
      // 10b: swap
      // 10c: aastore
      // 10d: ldc2_w 7799761149368071863
      // 110: lload 3
      // 111: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: astore 17
      // 118: astore 14
      // 11a: aload 14
      // 11c: ifnonnull 17d
      // 11f: aload 17
      // 121: invokevirtual java/lang/String.length ()I
      // 124: ifle 15b
      // 127: goto 134
      // 12a: ldc2_w 8490164088526367235
      // 12d: lload 3
      // 12e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 15
      // 136: new java/lang/StringBuilder
      // 139: dup
      // 13a: invokespecial java/lang/StringBuilder.<init> ()V
      // 13d: ldc "\t"
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: aload 17
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: pop
      // 14e: goto 15b
      // 151: ldc2_w 8490164088526367235
      // 154: lload 3
      // 155: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: aload 5
      // 15d: new java/lang/StringBuilder
      // 160: dup
      // 161: invokespecial java/lang/StringBuilder.<init> ()V
      // 164: aload 2
      // 165: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 168: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16b: aload 2
      // 16c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 172: aload 15
      // 174: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 177: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17a: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 17d: return
   }

   public final boolean I(long var1) {
      return true;
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 133348779907761L;
      long var6 = var2 ^ 71039313027844L;
      StringBuilder var8 = new StringBuilder();
      var8.append(x44.a<"j">(this, new Object[]{var6}, 935372178048627329L, var2));
      var8.append((char)c<"q">(21789, 4985743945820308904L ^ var2));
      var8.append(x44.a<"j">(this.K, new Object[]{var4}, 761253629207512990L, var2));
      return var8.toString();
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   _oa(_xx param1, long param2, va param4, _y4 param5, _y4 param6, _y4 param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: bipush 32
      // 003: lshl
      // 004: iload 8
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: getstatic com/zelix/_oa.b J
      // 011: lxor
      // 012: lstore 9
      // 014: lload 9
      // 016: dup2
      // 017: ldc2_w 95639128093431
      // 01a: lxor
      // 01b: lstore 11
      // 01d: dup2
      // 01e: ldc2_w 130666663154251
      // 021: lxor
      // 022: dup2
      // 023: bipush 8
      // 025: lushr
      // 026: lstore 13
      // 028: dup2
      // 029: bipush 56
      // 02b: lshl
      // 02c: bipush 56
      // 02e: lushr
      // 02f: l2i
      // 030: istore 15
      // 032: pop2
      // 033: pop2
      // 034: aload 0
      // 035: sipush 28817
      // 038: ldc2_w 6477024442219268587
      // 03b: lload 9
      // 03d: lxor
      // 03e: invokedynamic q (IJ)I bsm=com/zelix/_oa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: invokespecial com/zelix/_og.<init> (I)V
      // 046: ldc2_w 2655655343319726367
      // 049: lload 9
      // 04b: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: aload 1
      // 051: invokevirtual com/zelix/_xx.read ()I
      // 054: istore 17
      // 056: astore 16
      // 058: aload 0
      // 059: aload 4
      // 05b: lload 13
      // 05d: iload 17
      // 05f: iload 15
      // 061: i2b
      // 062: invokeinterface com/zelix/va.N (JIB)Lcom/zelix/xl; 5
      // 067: putfield com/zelix/_oa.K Lcom/zelix/xl;
      // 06a: aload 0
      // 06b: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 06e: instanceof com/zelix/md
      // 071: aload 16
      // 073: ifnonnull 0be
      // 076: ifeq 0a9
      // 079: goto 087
      // 07c: ldc2_w 2525520973962755292
      // 07f: lload 9
      // 081: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: aload 5
      // 089: aload 0
      // 08a: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 08d: checkcast com/zelix/md
      // 090: aload 0
      // 091: lload 11
      // 093: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 096: aload 16
      // 098: ifnull 130
      // 09b: goto 0a9
      // 09e: ldc2_w 2525520973962755292
      // 0a1: lload 9
      // 0a3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 0ad: instanceof com/zelix/mf
      // 0b0: goto 0be
      // 0b3: ldc2_w 2525520973962755292
      // 0b6: lload 9
      // 0b8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: iload 8
      // 0c0: ifge 110
      // 0c3: aload 16
      // 0c5: ifnonnull 110
      // 0c8: ifeq 0fb
      // 0cb: goto 0d9
      // 0ce: ldc2_w 2525520973962755292
      // 0d1: lload 9
      // 0d3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: aload 6
      // 0db: aload 0
      // 0dc: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 0df: checkcast com/zelix/mf
      // 0e2: aload 0
      // 0e3: lload 11
      // 0e5: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0e8: aload 16
      // 0ea: ifnull 130
      // 0ed: goto 0fb
      // 0f0: ldc2_w 2525520973962755292
      // 0f3: lload 9
      // 0f5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 0ff: instanceof com/zelix/x7
      // 102: goto 110
      // 105: ldc2_w 2525520973962755292
      // 108: lload 9
      // 10a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: ifeq 130
      // 113: aload 7
      // 115: aload 0
      // 116: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 119: checkcast com/zelix/x7
      // 11c: aload 0
      // 11d: lload 11
      // 11f: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 122: goto 130
      // 125: ldc2_w 2525520973962755292
      // 128: lload 9
      // 12a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: return
   }

   public boolean X(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.K instanceof mf;
   }

   public boolean H(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.K instanceof mf;
   }

   public void W(Object[] param1) {
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
      // 04: checkcast com/zelix/mf
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/mf
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w 2806242346226268980
      // 1e: lload 3
      // 1f: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnonnull 4f
      // 2c: getfield com/zelix/_oa.K Lcom/zelix/xl;
      // 2f: aload 5
      // 31: if_acmpne 53
      // 34: goto 41
      // 37: ldc2_w 2389015621020958455
      // 3a: lload 3
      // 3b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 0
      // 42: goto 4f
      // 45: ldc2_w 2389015621020958455
      // 48: lload 3
      // 49: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 2
      // 50: putfield com/zelix/_oa.K Lcom/zelix/xl;
      // 53: return
   }

   static {
      long var11 = b ^ 79253798747325L;
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
      String var17 = "ÑâzÑkøws\u0005\u007f6[?¨\u001f]\u0010w¦]\u001f\u0096ZJ,\u001a4èý¨¢ûª8\u009f\u0015Ë®ÝæoráÑ\u0006¡1²\r\u009f\u001cÚU~\fÙ!Á&÷)\u0002ã)\u001e\u008dÀ\u009fÃÏ\u001br¡\bt\u0089ý\u001d;!uæ\u0018¡ýQïKQ\u009c";
      int var19 = "ÑâzÑkøws\u0005\u007f6[?¨\u001f]\u0010w¦]\u001f\u0096ZJ,\u001a4èý¨¢ûª8\u009f\u0015Ë®ÝæoráÑ\u0006¡1²\r\u009f\u001cÚU~\fÙ!Á&÷)\u0002ã)\u001e\u008dÀ\u009fÃÏ\u001br¡\bt\u0089ý\u001d;!uæ\u0018¡ýQïKQ\u009c"
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
                     g = new String[5];
                     n = new HashMap(13);
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
                     String var4 = "å\u009f\u00857ýö\"Ð¹\u0095\u0086íy\u0080²Å\u0017\u0086X\u009ch@\u0015ÄñþþÙ¾$Ó-";
                     int var5 = "å\u009f\u00857ýö\"Ð¹\u0095\u0086íy\u0080²Å\u0017\u0086X\u009ch@\u0015ÄñþþÙ¾$Ó-".length();
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
                                    l = var6;
                                    m = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u008dXU'_.cÈQit¯î0\\\u008d";
                                 var5 = "\u008dXU'_.cÈQit¯î0\\\u008d".length();
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

                  var17 = "n\u009d¾°\u0012oÐÌ¾ÁZ\u009b$ø\\Ï\u0095é\u009d¤;ÒMÜ¾\u007fá\u0003\u00811+£vRg\u001f\r\u000eOûÙ_$mìÑ®`a\u0099ØT¬]o\u0017\u0010(\u0006H§\u008f½\"\u0007áËeg°\t\u0018î";
                  var19 = "n\u009d¾°\u0012oÐÌ¾ÁZ\u009b$ø\\Ï\u0095é\u009d¤;ÒMÜ¾\u007fá\u0003\u00811+£vRg\u001f\r\u000eOûÙ_$mìÑ®`a\u0099ØT¬]o\u0017\u0010(\u0006H§\u008f½\"\u0007áËeg°\t\u0018î"
                     .length();
                  var16 = '8';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23388;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_oa", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/_oa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20656;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_oa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
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
         throw new RuntimeException("com/zelix/_oa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
