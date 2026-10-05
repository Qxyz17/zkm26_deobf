package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class v2 {
   private String u;
   private final String d;
   private boolean M;
   private _f2 z;
   private final ArrayList V;
   private static final long a = ess.a(9199044474923133830L, 1681334440769245517L, MethodHandles.lookup().lookupClass()).a(253370252981400L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long f;

   public v2(_f2 param1, long param2, ZipFile param4, ZipEntry param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/v2.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 5687790601883
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 129524422821554
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 131726013634948
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 48546457357429
      // 020: lxor
      // 021: lstore 12
      // 023: dup2
      // 024: ldc2_w 79025459511240
      // 027: lxor
      // 028: dup2
      // 029: bipush 48
      // 02b: lushr
      // 02c: l2i
      // 02d: istore 14
      // 02f: dup2
      // 030: bipush 16
      // 032: lshl
      // 033: bipush 32
      // 035: lushr
      // 036: l2i
      // 037: istore 15
      // 039: dup2
      // 03a: bipush 48
      // 03c: lshl
      // 03d: bipush 48
      // 03f: lushr
      // 040: l2i
      // 041: istore 16
      // 043: pop2
      // 044: pop2
      // 045: ldc2_w -3733226340436616781
      // 048: lload 2
      // 049: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 0
      // 04f: invokespecial java/lang/Object.<init> ()V
      // 052: aload 0
      // 053: new java/util/ArrayList
      // 056: dup
      // 057: invokespecial java/util/ArrayList.<init> ()V
      // 05a: putfield com/zelix/v2.V Ljava/util/ArrayList;
      // 05d: astore 17
      // 05f: aconst_null
      // 060: astore 18
      // 062: aconst_null
      // 063: astore 19
      // 065: aload 0
      // 066: aload 1
      // 067: ldc2_w -3240651010951305107
      // 06a: lload 2
      // 06b: invokedynamic v (Ljava/lang/Object;Lcom/zelix/_f2;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: aload 0
      // 071: aload 4
      // 073: ldc2_w -4035134422100847736
      // 076: lload 2
      // 077: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: ldc2_w -2882470954261401651
      // 07f: lload 2
      // 080: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 0
      // 086: aload 5
      // 088: ldc2_w -3025292911699585817
      // 08b: lload 2
      // 08c: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: aload 17
      // 093: ifnull 0b8
      // 096: getstatic com/zelix/v2.f J
      // 099: l2i
      // 09a: if_icmpne 0bb
      // 09d: goto 0aa
      // 0a0: ldc2_w -3940332428720967325
      // 0a3: lload 2
      // 0a4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: goto 0b8
      // 0ae: ldc2_w -3940332428720967325
      // 0b1: lload 2
      // 0b2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: goto 0bc
      // 0bb: bipush 0
      // 0bc: ldc2_w -3325018740663002409
      // 0bf: lload 2
      // 0c0: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: aload 4
      // 0c7: aload 5
      // 0c9: ldc2_w -3944304534665821802
      // 0cc: lload 2
      // 0cd: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: astore 18
      // 0d4: aload 18
      // 0d6: sipush 158
      // 0d9: ldc2_w 1032555549780962252
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/v2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: aconst_null
      // 0e4: lload 6
      // 0e6: bipush 4
      // 0e7: anewarray 40
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 3
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 2
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 1
      // 0fb: swap
      // 0fc: aastore
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: bipush 0
      // 100: swap
      // 101: aastore
      // 102: ldc2_w -3997410191639695022
      // 105: lload 2
      // 106: invokedynamic u (Ljava/lang/Object;JJ)Ljava/io/BufferedReader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: astore 19
      // 10d: aload 0
      // 10e: aload 19
      // 110: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 113: putfield com/zelix/v2.d Ljava/lang/String;
      // 116: aload 0
      // 117: ldc2_w -2965447613129522156
      // 11a: lload 2
      // 11b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: lload 2
      // 121: lconst_0
      // 122: lcmp
      // 123: iflt 164
      // 126: aload 17
      // 128: ifnull 164
      // 12b: ifnonnull 15a
      // 12e: goto 13b
      // 131: ldc2_w -3940332428720967325
      // 134: lload 2
      // 135: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: new com/zelix/_sf
      // 13e: dup
      // 13f: sipush 25227
      // 142: ldc2_w 484290552289790424
      // 145: lload 2
      // 146: lxor
      // 147: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/v2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: invokespecial com/zelix/_sf.<init> (Ljava/lang/String;)V
      // 14f: athrow
      // 150: ldc2_w -3940332428720967325
      // 153: lload 2
      // 154: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: aload 0
      // 15b: ldc2_w -2965447613129522156
      // 15e: lload 2
      // 15f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: sipush 13165
      // 167: ldc2_w 3525353851746211897
      // 16a: lload 2
      // 16b: lxor
      // 16c: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/v2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 174: aload 17
      // 176: ifnull 1a9
      // 179: ifne 1a8
      // 17c: goto 189
      // 17f: ldc2_w -3940332428720967325
      // 182: lload 2
      // 183: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: new com/zelix/_sf
      // 18c: dup
      // 18d: sipush 20173
      // 190: ldc2_w 4937186284077032858
      // 193: lload 2
      // 194: lxor
      // 195: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/v2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: invokespecial com/zelix/_sf.<init> (Ljava/lang/String;)V
      // 19d: athrow
      // 19e: ldc2_w -3940332428720967325
      // 1a1: lload 2
      // 1a2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: bipush 0
      // 1a9: istore 20
      // 1ab: iload 20
      // 1ad: ifne 297
      // 1b0: new com/zelix/xq
      // 1b3: dup
      // 1b4: iload 14
      // 1b6: i2s
      // 1b7: iload 15
      // 1b9: iload 16
      // 1bb: i2c
      // 1bc: aload 19
      // 1be: invokespecial com/zelix/xq.<init> (SICLjava/io/BufferedReader;)V
      // 1c1: astore 21
      // 1c3: lload 2
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: iflt 2cd
      // 1c9: aload 17
      // 1cb: ifnull 2cd
      // 1ce: aload 21
      // 1d0: lload 8
      // 1d2: bipush 1
      // 1d3: anewarray 40
      // 1d6: dup_x2
      // 1d7: dup_x2
      // 1d8: pop
      // 1d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dc: bipush 0
      // 1dd: swap
      // 1de: aastore
      // 1df: ldc2_w -3124615792892038305
      // 1e2: lload 2
      // 1e3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: aload 17
      // 1ea: ifnull 290
      // 1ed: goto 1fa
      // 1f0: ldc2_w -3940332428720967325
      // 1f3: lload 2
      // 1f4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: athrow
      // 1fa: ifne 276
      // 1fd: goto 20a
      // 200: ldc2_w -3940332428720967325
      // 203: lload 2
      // 204: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: aload 0
      // 20b: ldc2_w -3762883452087318242
      // 20e: lload 2
      // 20f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: ldc2_w -3933602475678348750
      // 217: lload 2
      // 218: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: aload 17
      // 21f: ifnull 275
      // 222: goto 22f
      // 225: ldc2_w -3940332428720967325
      // 228: lload 2
      // 229: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: athrow
      // 22f: ifeq 266
      // 232: goto 23f
      // 235: ldc2_w -3940332428720967325
      // 238: lload 2
      // 239: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: athrow
      // 23f: aload 21
      // 241: lload 10
      // 243: bipush 1
      // 244: anewarray 40
      // 247: dup_x2
      // 248: dup_x2
      // 249: pop
      // 24a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24d: bipush 0
      // 24e: swap
      // 24f: aastore
      // 250: ldc2_w -4002765936449626670
      // 253: lload 2
      // 254: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: goto 266
      // 25c: ldc2_w -3940332428720967325
      // 25f: lload 2
      // 260: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: athrow
      // 266: aload 0
      // 267: ldc2_w -3762883452087318242
      // 26a: lload 2
      // 26b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: aload 21
      // 272: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 275: pop
      // 276: aload 21
      // 278: lload 12
      // 27a: bipush 1
      // 27b: anewarray 40
      // 27e: dup_x2
      // 27f: dup_x2
      // 280: pop
      // 281: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 284: bipush 0
      // 285: swap
      // 286: aastore
      // 287: ldc2_w -3578867226084443794
      // 28a: lload 2
      // 28b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: istore 20
      // 292: aload 17
      // 294: ifnonnull 1ab
      // 297: lload 2
      // 298: lconst_0
      // 299: lcmp
      // 29a: ifle 2cd
      // 29d: lload 2
      // 29e: lconst_0
      // 29f: lcmp
      // 2a0: iflt 2c5
      // 2a3: aload 19
      // 2a5: aload 17
      // 2a7: ifnull 2bc
      // 2aa: ifnull 2cd
      // 2ad: goto 2ba
      // 2b0: ldc2_w -3940332428720967325
      // 2b3: lload 2
      // 2b4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: athrow
      // 2ba: aload 19
      // 2bc: ldc2_w -3765418361435736930
      // 2bf: lload 2
      // 2c0: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: goto 374
      // 2c8: astore 20
      // 2ca: goto 374
      // 2cd: lload 2
      // 2ce: lconst_0
      // 2cf: lcmp
      // 2d0: iflt 2f5
      // 2d3: aload 18
      // 2d5: aload 17
      // 2d7: ifnull 2ec
      // 2da: ifnull 374
      // 2dd: goto 2ea
      // 2e0: ldc2_w -3940332428720967325
      // 2e3: lload 2
      // 2e4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: athrow
      // 2ea: aload 18
      // 2ec: ldc2_w -3634450211565915242
      // 2ef: lload 2
      // 2f0: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: goto 374
      // 2f8: astore 20
      // 2fa: goto 374
      // 2fd: astore 22
      // 2ff: lload 2
      // 300: lconst_0
      // 301: lcmp
      // 302: ifle 327
      // 305: aload 19
      // 307: aload 17
      // 309: ifnull 31e
      // 30c: ifnull 337
      // 30f: goto 31c
      // 312: ldc2_w -3940332428720967325
      // 315: lload 2
      // 316: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: athrow
      // 31c: aload 19
      // 31e: ldc2_w -3765418361435736930
      // 321: lload 2
      // 322: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: goto 371
      // 32a: astore 23
      // 32c: lload 2
      // 32d: lconst_0
      // 32e: lcmp
      // 32f: iflt 337
      // 332: aload 17
      // 334: ifnonnull 371
      // 337: lload 2
      // 338: lconst_0
      // 339: lcmp
      // 33a: iflt 36c
      // 33d: aload 18
      // 33f: aload 17
      // 341: ifnull 363
      // 344: goto 351
      // 347: ldc2_w -3940332428720967325
      // 34a: lload 2
      // 34b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: athrow
      // 351: ifnull 371
      // 354: goto 361
      // 357: ldc2_w -3940332428720967325
      // 35a: lload 2
      // 35b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: athrow
      // 361: aload 18
      // 363: ldc2_w -3634450211565915242
      // 366: lload 2
      // 367: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36c: goto 371
      // 36f: astore 23
      // 371: aload 22
      // 373: athrow
      // 374: return
   }

   public void P(Object[] param1) {
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
      // 004: checkcast java/util/zip/ZipOutputStream
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/w
      // 020: astore 7
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/w
      // 028: astore 8
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/lang/Boolean
      // 030: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 033: istore 4
      // 035: pop
      // 036: getstatic com/zelix/v2.a J
      // 039: lload 5
      // 03b: lxor
      // 03c: lstore 5
      // 03e: lload 5
      // 040: dup2
      // 041: ldc2_w 114233635053547
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 98501358859026
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 126649878795217
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 58293623560778
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 33988881228019
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 80633871459692
      // 067: lxor
      // 068: lstore 19
      // 06a: dup2
      // 06b: ldc2_w 14436997002735
      // 06e: lxor
      // 06f: lstore 21
      // 071: dup2
      // 072: ldc2_w 137481583143887
      // 075: lxor
      // 076: lstore 23
      // 078: pop2
      // 079: ldc2_w -6284312789471543990
      // 07c: lload 5
      // 07e: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: aload 7
      // 085: lload 19
      // 087: bipush 1
      // 088: anewarray 40
      // 08b: dup_x2
      // 08c: dup_x2
      // 08d: pop
      // 08e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 091: bipush 0
      // 092: swap
      // 093: aastore
      // 094: ldc2_w -5849400622941619000
      // 097: lload 5
      // 099: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: aload 8
      // 0a0: lload 19
      // 0a2: bipush 1
      // 0a3: anewarray 40
      // 0a6: dup_x2
      // 0a7: dup_x2
      // 0a8: pop
      // 0a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac: bipush 0
      // 0ad: swap
      // 0ae: aastore
      // 0af: ldc2_w -5849400622941619000
      // 0b2: lload 5
      // 0b4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: iadd
      // 0ba: lload 15
      // 0bc: invokestatic com/zelix/sh.Q (IJ)I
      // 0bf: lload 13
      // 0c1: bipush 2
      // 0c2: anewarray 40
      // 0c5: dup_x2
      // 0c6: dup_x2
      // 0c7: pop
      // 0c8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cb: bipush 1
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w -5921418731654567327
      // 0d9: lload 5
      // 0db: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: astore 26
      // 0e2: aload 7
      // 0e4: lload 9
      // 0e6: bipush 1
      // 0e7: anewarray 40
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: ldc2_w -6304619428771455272
      // 0f6: lload 5
      // 0f8: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 102: astore 27
      // 104: astore 25
      // 106: aload 27
      // 108: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10d: ifeq 151
      // 110: aload 27
      // 112: lload 5
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 175
      // 119: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11e: checkcast com/zelix/_f2
      // 121: astore 28
      // 123: aload 26
      // 125: aload 28
      // 127: invokevirtual com/zelix/_f2.x ()Ljava/lang/String;
      // 12a: aload 28
      // 12c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 131: pop
      // 132: aload 25
      // 134: ifnull 173
      // 137: aload 25
      // 139: ifnonnull 106
      // 13c: lload 5
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 132
      // 143: goto 151
      // 146: ldc2_w -5933377934783146598
      // 149: lload 5
      // 14b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: aload 8
      // 153: lload 9
      // 155: bipush 1
      // 156: anewarray 40
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 0
      // 160: swap
      // 161: aastore
      // 162: ldc2_w -6304619428771455272
      // 165: lload 5
      // 167: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 171: astore 27
      // 173: aload 27
      // 175: lload 5
      // 177: lconst_0
      // 178: lcmp
      // 179: iflt 18b
      // 17c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 181: ifeq 1a4
      // 184: aload 27
      // 186: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 18b: checkcast com/zelix/_f2
      // 18e: astore 28
      // 190: aload 26
      // 192: aload 28
      // 194: invokevirtual com/zelix/_f2.x ()Ljava/lang/String;
      // 197: aload 28
      // 199: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 19e: pop
      // 19f: aload 25
      // 1a1: ifnonnull 173
      // 1a4: new com/zelix/sk
      // 1a7: dup
      // 1a8: lload 11
      // 1aa: aload 2
      // 1ab: sipush 30528
      // 1ae: ldc2_w 2598187964498540783
      // 1b1: lload 5
      // 1b3: lxor
      // 1b4: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/v2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: iload 4
      // 1bb: invokespecial com/zelix/sk.<init> (JLjava/util/zip/ZipOutputStream;Ljava/lang/String;Z)V
      // 1be: lload 5
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: ifle 18b
      // 1c5: astore 27
      // 1c7: new java/io/PrintWriter
      // 1ca: dup
      // 1cb: new java/io/OutputStreamWriter
      // 1ce: dup
      // 1cf: aload 27
      // 1d1: lload 21
      // 1d3: bipush 1
      // 1d4: anewarray 40
      // 1d7: dup_x2
      // 1d8: dup_x2
      // 1d9: pop
      // 1da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dd: bipush 0
      // 1de: swap
      // 1df: aastore
      // 1e0: ldc2_w -5818218199680337888
      // 1e3: lload 5
      // 1e5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/OutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: sipush 6650
      // 1ed: ldc2_w 663597032150799958
      // 1f0: lload 5
      // 1f2: lxor
      // 1f3: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/v2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: invokespecial java/io/OutputStreamWriter.<init> (Ljava/io/OutputStream;Ljava/lang/String;)V
      // 1fb: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 1fe: astore 28
      // 200: aload 28
      // 202: aload 0
      // 203: ldc2_w -5610968745118998291
      // 206: lload 5
      // 208: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 210: aload 28
      // 212: ldc2_w -5549134774724591302
      // 215: lload 5
      // 217: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: aload 0
      // 21d: ldc2_w -5818996154911838745
      // 220: lload 5
      // 222: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 22a: astore 29
      // 22c: aload 29
      // 22e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 233: ifeq 2b0
      // 236: aload 29
      // 238: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 23d: checkcast com/zelix/xq
      // 240: astore 30
      // 242: aload 30
      // 244: aload 28
      // 246: aload 0
      // 247: ldc2_w -5188237277284610924
      // 24a: lload 5
      // 24c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: aload 26
      // 253: aload 7
      // 255: lload 23
      // 257: aload 8
      // 259: bipush 6
      // 25b: anewarray 40
      // 25e: dup_x1
      // 25f: swap
      // 260: bipush 5
      // 261: swap
      // 262: aastore
      // 263: dup_x2
      // 264: dup_x2
      // 265: pop
      // 266: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 269: bipush 4
      // 26a: swap
      // 26b: aastore
      // 26c: dup_x1
      // 26d: swap
      // 26e: bipush 3
      // 26f: swap
      // 270: aastore
      // 271: dup_x1
      // 272: swap
      // 273: bipush 2
      // 274: swap
      // 275: aastore
      // 276: dup_x1
      // 277: swap
      // 278: bipush 1
      // 279: swap
      // 27a: aastore
      // 27b: dup_x1
      // 27c: swap
      // 27d: bipush 0
      // 27e: swap
      // 27f: aastore
      // 280: ldc2_w -6204087710993903396
      // 283: lload 5
      // 285: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: aload 25
      // 28c: lload 5
      // 28e: lconst_0
      // 28f: lcmp
      // 290: iflt 2f4
      // 293: ifnull 2ea
      // 296: aload 25
      // 298: ifnonnull 22c
      // 29b: lload 5
      // 29d: lconst_0
      // 29e: lcmp
      // 29f: iflt 28a
      // 2a2: goto 2b0
      // 2a5: ldc2_w -5933377934783146598
      // 2a8: lload 5
      // 2aa: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: athrow
      // 2b0: aload 28
      // 2b2: ldc2_w -5549134774724591302
      // 2b5: lload 5
      // 2b7: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: aload 28
      // 2be: ldc2_w -5249401184251464009
      // 2c1: lload 5
      // 2c3: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: aload 27
      // 2ca: aload 3
      // 2cb: lload 17
      // 2cd: bipush 2
      // 2ce: anewarray 40
      // 2d1: dup_x2
      // 2d2: dup_x2
      // 2d3: pop
      // 2d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d7: bipush 1
      // 2d8: swap
      // 2d9: aastore
      // 2da: dup_x1
      // 2db: swap
      // 2dc: bipush 0
      // 2dd: swap
      // 2de: aastore
      // 2df: ldc2_w -5282201742183744568
      // 2e2: lload 5
      // 2e4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/zip/CRC32; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: pop
      // 2ea: ldc2_w -5577940735406745032
      // 2ed: lload 5
      // 2ef: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: lload 5
      // 2f6: lconst_0
      // 2f7: lcmp
      // 2f8: iflt 302
      // 2fb: ifnonnull 31a
      // 2fe: bipush 3
      // 2ff: anewarray 9
      // 302: ldc2_w -5723473840057039921
      // 305: lload 5
      // 307: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30c: goto 31a
      // 30f: ldc2_w -5933377934783146598
      // 312: lload 5
      // 314: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: athrow
      // 31a: return
   }

   static {
      long var5 = a ^ 82092070021739L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "\u0017æÇ\u0003ìVHCr«u\u0098þßjÍ\u0082èÝ°\u001bæ\u001a\u0007ÙÒR{+\u001b 4î\u0011¨\u0099ì\u0089\u009dH(\u001a\u0090É8\u00809t&3\u008a7óÓ¯Ô\tq\u0081\u0093ê\u008e\"[¥5sý\u0086\u0015±ÈÉßÌ:\u0006\u0016\u001d\u0007í\u0010oA-\u008eïÉÊ{\u001a\u008bäÆ\u0092ç\r\u0087(m\u0089\u0010]\u001e´Êµò\u0085ãÎQÇRÄ«`\u0002},wÂ\u000eP\u0016\u0099 é\t\u009aí\u008bo\u0014\u0084\u0018;-M";
      int var13 = "\u0017æÇ\u0003ìVHCr«u\u0098þßjÍ\u0082èÝ°\u001bæ\u001a\u0007ÙÒR{+\u001b 4î\u0011¨\u0099ì\u0089\u009dH(\u001a\u0090É8\u00809t&3\u008a7óÓ¯Ô\tq\u0081\u0093ê\u008e\"[¥5sý\u0086\u0015±ÈÉßÌ:\u0006\u0016\u001d\u0007í\u0010oA-\u008eïÉÊ{\u001a\u008bäÆ\u0092ç\r\u0087(m\u0089\u0010]\u001e´Êµò\u0085ãÎQÇRÄ«`\u0002},wÂ\u000eP\u0016\u0099 é\t\u009aí\u008bo\u0014\u0084\u0018;-M"
         .length();
      char var10 = '(';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     b = var14;
                     c = new String[6];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 1336199193585858975L;
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
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     f = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "¥ÔÏ\u0016ßõÉT$Æt\u001eg\u00920³db\u0085§\u0082¬,,¬ç×þ\u0002\u008d \u0014sÍí$\u0082e±$\u0010Z(çßã\u0017·0\u009fËÑCÕé-,";
                  var13 = "¥ÔÏ\u0016ßõÉT$Æt\u001eg\u00920³db\u0085§\u0082¬,,¬ç×þ\u0002\u008d \u0014sÍí$\u0082e±$\u0010Z(çßã\u0017·0\u009fËÑCÕé-,".length();
                  var10 = '(';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11481;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/v2", var10);
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
         throw new RuntimeException("com/zelix/v2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
