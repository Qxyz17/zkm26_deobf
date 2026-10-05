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

public class _o7 extends _o9 {
   private static final long c = ess.a(4706302305820505443L, -9020782638191300011L, MethodHandles.lookup().lookupClass()).a(6750873738410L);
   private static final long[] n;
   private static final Integer[] o;
   private static final Map p = new HashMap(13);

   public _o7(int var1, int var2, long var3, int var5, _xx var6, t7 var7) {
      var3 = c ^ var3;
      long var8 = var3 ^ 78718910215508L;
      super(var1, var2, var5, var8, var6, var7);
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
      // 029: invokevirtual com/zelix/_o7.P (J)Z
      // 02c: aload 8
      // 02e: ifnonnull 069
      // 031: ifeq 062
      // 034: goto 042
      // 037: ldc2_w 3447467401560108184
      // 03a: lload 4
      // 03c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: athrow
      // 042: aload 2
      // 043: sipush 25588
      // 046: ldc2_w 6119289293452153560
      // 049: lload 4
      // 04b: lxor
      // 04c: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 054: goto 062
      // 057: ldc2_w 3447467401560108184
      // 05a: lload 4
      // 05c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 0
      // 063: getfield com/zelix/_o7.C Lcom/zelix/vi;
      // 066: invokevirtual com/zelix/vi.H ()I
      // 069: istore 9
      // 06b: ldc2_w 2959109661092012511
      // 06e: lload 4
      // 070: invokedynamic i (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: aload 0
      // 076: getfield com/zelix/_o7.O Lcom/zelix/y4;
      // 079: invokevirtual com/zelix/y4.ordinal ()I
      // 07c: iaload
      // 07d: iload 1
      // 07e: ifle 10c
      // 081: aload 8
      // 083: ifnonnull 10c
      // 086: tableswitch 1561 1 12 73 191 313 435 557 679 801 923 1045 1167 1289 1449
      // 0c4: ldc2_w 3447467401560108184
      // 0c7: lload 4
      // 0c9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: sipush 22239
      // 0d3: ldc2_w 999967996839045096
      // 0d6: lload 4
      // 0d8: lxor
      // 0d9: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 0e1: aload 8
      // 0e3: iload 3
      // 0e4: ifle 13e
      // 0e7: ifnonnull 13c
      // 0ea: goto 0f8
      // 0ed: ldc2_w 3447467401560108184
      // 0f0: lload 4
      // 0f2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: lload 6
      // 0fb: invokevirtual com/zelix/_o7.P (J)Z
      // 0fe: goto 10c
      // 101: ldc2_w 3447467401560108184
      // 104: lload 4
      // 106: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: ifeq 128
      // 10f: aload 2
      // 110: iload 9
      // 112: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 115: aload 8
      // 117: ifnull 69f
      // 11a: goto 128
      // 11d: ldc2_w 3447467401560108184
      // 120: lload 4
      // 122: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 2
      // 129: iload 9
      // 12b: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 12e: goto 13c
      // 131: ldc2_w 3447467401560108184
      // 134: lload 4
      // 136: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: aload 8
      // 13e: iload 3
      // 13f: ifle 159
      // 142: ifnull 69f
      // 145: aload 2
      // 146: sipush 30649
      // 149: ldc2_w 5583165290971825815
      // 14c: lload 4
      // 14e: lxor
      // 14f: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 157: aload 8
      // 159: iload 1
      // 15a: ifle 1b8
      // 15d: ifnonnull 1b6
      // 160: goto 16e
      // 163: ldc2_w 3447467401560108184
      // 166: lload 4
      // 168: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: iload 1
      // 16f: ifle 1a8
      // 172: aload 0
      // 173: lload 6
      // 175: invokevirtual com/zelix/_o7.P (J)Z
      // 178: ifeq 1a2
      // 17b: goto 189
      // 17e: ldc2_w 3447467401560108184
      // 181: lload 4
      // 183: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: aload 2
      // 18a: iload 9
      // 18c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 18f: aload 8
      // 191: ifnull 69f
      // 194: goto 1a2
      // 197: ldc2_w 3447467401560108184
      // 19a: lload 4
      // 19c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aload 2
      // 1a3: iload 9
      // 1a5: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 1a8: goto 1b6
      // 1ab: ldc2_w 3447467401560108184
      // 1ae: lload 4
      // 1b0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: aload 8
      // 1b8: iload 1
      // 1b9: iflt 1d3
      // 1bc: ifnull 69f
      // 1bf: aload 2
      // 1c0: sipush 25703
      // 1c3: ldc2_w 839968139550430543
      // 1c6: lload 4
      // 1c8: lxor
      // 1c9: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 1d1: aload 8
      // 1d3: iload 3
      // 1d4: ifle 232
      // 1d7: ifnonnull 230
      // 1da: goto 1e8
      // 1dd: ldc2_w 3447467401560108184
      // 1e0: lload 4
      // 1e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: iload 3
      // 1e9: ifle 222
      // 1ec: aload 0
      // 1ed: lload 6
      // 1ef: invokevirtual com/zelix/_o7.P (J)Z
      // 1f2: ifeq 21c
      // 1f5: goto 203
      // 1f8: ldc2_w 3447467401560108184
      // 1fb: lload 4
      // 1fd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: aload 2
      // 204: iload 9
      // 206: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 209: aload 8
      // 20b: ifnull 69f
      // 20e: goto 21c
      // 211: ldc2_w 3447467401560108184
      // 214: lload 4
      // 216: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: aload 2
      // 21d: iload 9
      // 21f: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 222: goto 230
      // 225: ldc2_w 3447467401560108184
      // 228: lload 4
      // 22a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: aload 8
      // 232: iload 3
      // 233: ifle 24d
      // 236: ifnull 69f
      // 239: aload 2
      // 23a: sipush 21699
      // 23d: ldc2_w 137740084271621619
      // 240: lload 4
      // 242: lxor
      // 243: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 24b: aload 8
      // 24d: iload 1
      // 24e: iflt 2ac
      // 251: ifnonnull 2aa
      // 254: goto 262
      // 257: ldc2_w 3447467401560108184
      // 25a: lload 4
      // 25c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: athrow
      // 262: iload 1
      // 263: iflt 29c
      // 266: aload 0
      // 267: lload 6
      // 269: invokevirtual com/zelix/_o7.P (J)Z
      // 26c: ifeq 296
      // 26f: goto 27d
      // 272: ldc2_w 3447467401560108184
      // 275: lload 4
      // 277: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: aload 2
      // 27e: iload 9
      // 280: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 283: aload 8
      // 285: ifnull 69f
      // 288: goto 296
      // 28b: ldc2_w 3447467401560108184
      // 28e: lload 4
      // 290: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: aload 2
      // 297: iload 9
      // 299: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 29c: goto 2aa
      // 29f: ldc2_w 3447467401560108184
      // 2a2: lload 4
      // 2a4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: athrow
      // 2aa: aload 8
      // 2ac: iload 3
      // 2ad: iflt 2c7
      // 2b0: ifnull 69f
      // 2b3: aload 2
      // 2b4: sipush 28332
      // 2b7: ldc2_w 5640343759871614862
      // 2ba: lload 4
      // 2bc: lxor
      // 2bd: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 2c5: aload 8
      // 2c7: iload 1
      // 2c8: iflt 326
      // 2cb: ifnonnull 324
      // 2ce: goto 2dc
      // 2d1: ldc2_w 3447467401560108184
      // 2d4: lload 4
      // 2d6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: athrow
      // 2dc: iload 3
      // 2dd: ifle 316
      // 2e0: aload 0
      // 2e1: lload 6
      // 2e3: invokevirtual com/zelix/_o7.P (J)Z
      // 2e6: ifeq 310
      // 2e9: goto 2f7
      // 2ec: ldc2_w 3447467401560108184
      // 2ef: lload 4
      // 2f1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: athrow
      // 2f7: aload 2
      // 2f8: iload 9
      // 2fa: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2fd: aload 8
      // 2ff: ifnull 69f
      // 302: goto 310
      // 305: ldc2_w 3447467401560108184
      // 308: lload 4
      // 30a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: athrow
      // 310: aload 2
      // 311: iload 9
      // 313: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 316: goto 324
      // 319: ldc2_w 3447467401560108184
      // 31c: lload 4
      // 31e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: aload 8
      // 326: iload 3
      // 327: ifle 341
      // 32a: ifnull 69f
      // 32d: aload 2
      // 32e: sipush 5799
      // 331: ldc2_w 8121902069026645910
      // 334: lload 4
      // 336: lxor
      // 337: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33c: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 33f: aload 8
      // 341: iload 3
      // 342: ifle 3a0
      // 345: ifnonnull 39e
      // 348: goto 356
      // 34b: ldc2_w 3447467401560108184
      // 34e: lload 4
      // 350: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: athrow
      // 356: iload 3
      // 357: ifle 390
      // 35a: aload 0
      // 35b: lload 6
      // 35d: invokevirtual com/zelix/_o7.P (J)Z
      // 360: ifeq 38a
      // 363: goto 371
      // 366: ldc2_w 3447467401560108184
      // 369: lload 4
      // 36b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: athrow
      // 371: aload 2
      // 372: iload 9
      // 374: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 377: aload 8
      // 379: ifnull 69f
      // 37c: goto 38a
      // 37f: ldc2_w 3447467401560108184
      // 382: lload 4
      // 384: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 389: athrow
      // 38a: aload 2
      // 38b: iload 9
      // 38d: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 390: goto 39e
      // 393: ldc2_w 3447467401560108184
      // 396: lload 4
      // 398: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: athrow
      // 39e: aload 8
      // 3a0: iload 3
      // 3a1: iflt 3bb
      // 3a4: ifnull 69f
      // 3a7: aload 2
      // 3a8: sipush 1967
      // 3ab: ldc2_w 6835889597097080476
      // 3ae: lload 4
      // 3b0: lxor
      // 3b1: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 3b9: aload 8
      // 3bb: iload 1
      // 3bc: ifle 41a
      // 3bf: ifnonnull 418
      // 3c2: goto 3d0
      // 3c5: ldc2_w 3447467401560108184
      // 3c8: lload 4
      // 3ca: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cf: athrow
      // 3d0: iload 1
      // 3d1: ifle 40a
      // 3d4: aload 0
      // 3d5: lload 6
      // 3d7: invokevirtual com/zelix/_o7.P (J)Z
      // 3da: ifeq 404
      // 3dd: goto 3eb
      // 3e0: ldc2_w 3447467401560108184
      // 3e3: lload 4
      // 3e5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: athrow
      // 3eb: aload 2
      // 3ec: iload 9
      // 3ee: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 3f1: aload 8
      // 3f3: ifnull 69f
      // 3f6: goto 404
      // 3f9: ldc2_w 3447467401560108184
      // 3fc: lload 4
      // 3fe: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 403: athrow
      // 404: aload 2
      // 405: iload 9
      // 407: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 40a: goto 418
      // 40d: ldc2_w 3447467401560108184
      // 410: lload 4
      // 412: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: athrow
      // 418: aload 8
      // 41a: iload 1
      // 41b: iflt 435
      // 41e: ifnull 69f
      // 421: aload 2
      // 422: sipush 14808
      // 425: ldc2_w 300755390628645118
      // 428: lload 4
      // 42a: lxor
      // 42b: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 430: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 433: aload 8
      // 435: iload 1
      // 436: iflt 494
      // 439: ifnonnull 492
      // 43c: goto 44a
      // 43f: ldc2_w 3447467401560108184
      // 442: lload 4
      // 444: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 449: athrow
      // 44a: iload 3
      // 44b: ifle 484
      // 44e: aload 0
      // 44f: lload 6
      // 451: invokevirtual com/zelix/_o7.P (J)Z
      // 454: ifeq 47e
      // 457: goto 465
      // 45a: ldc2_w 3447467401560108184
      // 45d: lload 4
      // 45f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 464: athrow
      // 465: aload 2
      // 466: iload 9
      // 468: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 46b: aload 8
      // 46d: ifnull 69f
      // 470: goto 47e
      // 473: ldc2_w 3447467401560108184
      // 476: lload 4
      // 478: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47d: athrow
      // 47e: aload 2
      // 47f: iload 9
      // 481: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 484: goto 492
      // 487: ldc2_w 3447467401560108184
      // 48a: lload 4
      // 48c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 491: athrow
      // 492: aload 8
      // 494: iload 1
      // 495: iflt 4af
      // 498: ifnull 69f
      // 49b: aload 2
      // 49c: sipush 13391
      // 49f: ldc2_w 7440339623243236724
      // 4a2: lload 4
      // 4a4: lxor
      // 4a5: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4aa: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 4ad: aload 8
      // 4af: iload 3
      // 4b0: iflt 50e
      // 4b3: ifnonnull 50c
      // 4b6: goto 4c4
      // 4b9: ldc2_w 3447467401560108184
      // 4bc: lload 4
      // 4be: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c3: athrow
      // 4c4: iload 3
      // 4c5: ifle 4fe
      // 4c8: aload 0
      // 4c9: lload 6
      // 4cb: invokevirtual com/zelix/_o7.P (J)Z
      // 4ce: ifeq 4f8
      // 4d1: goto 4df
      // 4d4: ldc2_w 3447467401560108184
      // 4d7: lload 4
      // 4d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: athrow
      // 4df: aload 2
      // 4e0: iload 9
      // 4e2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 4e5: aload 8
      // 4e7: ifnull 69f
      // 4ea: goto 4f8
      // 4ed: ldc2_w 3447467401560108184
      // 4f0: lload 4
      // 4f2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: athrow
      // 4f8: aload 2
      // 4f9: iload 9
      // 4fb: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 4fe: goto 50c
      // 501: ldc2_w 3447467401560108184
      // 504: lload 4
      // 506: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50b: athrow
      // 50c: aload 8
      // 50e: iload 3
      // 50f: iflt 529
      // 512: ifnull 69f
      // 515: aload 2
      // 516: sipush 23433
      // 519: ldc2_w 8890263558481980068
      // 51c: lload 4
      // 51e: lxor
      // 51f: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 524: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 527: aload 8
      // 529: iload 3
      // 52a: ifle 588
      // 52d: ifnonnull 586
      // 530: goto 53e
      // 533: ldc2_w 3447467401560108184
      // 536: lload 4
      // 538: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53d: athrow
      // 53e: iload 3
      // 53f: iflt 578
      // 542: aload 0
      // 543: lload 6
      // 545: invokevirtual com/zelix/_o7.P (J)Z
      // 548: ifeq 572
      // 54b: goto 559
      // 54e: ldc2_w 3447467401560108184
      // 551: lload 4
      // 553: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 558: athrow
      // 559: aload 2
      // 55a: iload 9
      // 55c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 55f: aload 8
      // 561: ifnull 69f
      // 564: goto 572
      // 567: ldc2_w 3447467401560108184
      // 56a: lload 4
      // 56c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 571: athrow
      // 572: aload 2
      // 573: iload 9
      // 575: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 578: goto 586
      // 57b: ldc2_w 3447467401560108184
      // 57e: lload 4
      // 580: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 585: athrow
      // 586: aload 8
      // 588: iload 1
      // 589: iflt 5a3
      // 58c: ifnull 69f
      // 58f: aload 2
      // 590: sipush 23018
      // 593: ldc2_w 6161204137024530654
      // 596: lload 4
      // 598: lxor
      // 599: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59e: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 5a1: aload 8
      // 5a3: iload 1
      // 5a4: ifle 628
      // 5a7: ifnonnull 626
      // 5aa: goto 5b8
      // 5ad: ldc2_w 3447467401560108184
      // 5b0: lload 4
      // 5b2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b7: athrow
      // 5b8: iload 1
      // 5b9: ifle 618
      // 5bc: aload 0
      // 5bd: lload 6
      // 5bf: invokevirtual com/zelix/_o7.P (J)Z
      // 5c2: ifeq 5ff
      // 5c5: goto 5d3
      // 5c8: ldc2_w 3447467401560108184
      // 5cb: lload 4
      // 5cd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d2: athrow
      // 5d3: aload 2
      // 5d4: iload 9
      // 5d6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 5d9: aload 2
      // 5da: aload 0
      // 5db: bipush 0
      // 5dc: anewarray 22
      // 5df: ldc2_w 3353703252641302209
      // 5e2: lload 4
      // 5e4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e9: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 5ec: aload 8
      // 5ee: ifnull 69f
      // 5f1: goto 5ff
      // 5f4: ldc2_w 3447467401560108184
      // 5f7: lload 4
      // 5f9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fe: athrow
      // 5ff: aload 2
      // 600: iload 9
      // 602: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 605: aload 2
      // 606: aload 0
      // 607: bipush 0
      // 608: anewarray 22
      // 60b: ldc2_w 3353703252641302209
      // 60e: lload 4
      // 610: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 615: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 618: goto 626
      // 61b: ldc2_w 3447467401560108184
      // 61e: lload 4
      // 620: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 625: athrow
      // 626: aload 8
      // 628: iload 3
      // 629: ifle 643
      // 62c: ifnull 69f
      // 62f: aload 2
      // 630: sipush 28506
      // 633: ldc2_w 3527434727894851194
      // 636: lload 4
      // 638: lxor
      // 639: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63e: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 641: aload 8
      // 643: ifnonnull 69c
      // 646: goto 654
      // 649: ldc2_w 3447467401560108184
      // 64c: lload 4
      // 64e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 653: athrow
      // 654: iload 1
      // 655: ifle 68e
      // 658: aload 0
      // 659: lload 6
      // 65b: invokevirtual com/zelix/_o7.P (J)Z
      // 65e: ifeq 688
      // 661: goto 66f
      // 664: ldc2_w 3447467401560108184
      // 667: lload 4
      // 669: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66e: athrow
      // 66f: aload 2
      // 670: iload 9
      // 672: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 675: aload 8
      // 677: ifnull 69f
      // 67a: goto 688
      // 67d: ldc2_w 3447467401560108184
      // 680: lload 4
      // 682: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 687: athrow
      // 688: aload 2
      // 689: iload 9
      // 68b: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 68e: goto 69c
      // 691: ldc2_w 3447467401560108184
      // 694: lload 4
      // 696: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69b: athrow
      // 69c: goto 69f
      // 69f: return
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
      // 016: getfield com/zelix/_o7.C Lcom/zelix/vi;
      // 019: invokevirtual com/zelix/vi.H ()I
      // 01c: istore 5
      // 01e: astore 4
      // 020: ldc2_w 260329956982115155
      // 023: lload 2
      // 024: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: aload 0
      // 02a: getfield com/zelix/_o7.O Lcom/zelix/y4;
      // 02d: invokevirtual com/zelix/y4.ordinal ()I
      // 030: iaload
      // 031: aload 4
      // 033: ifnonnull 131
      // 036: tableswitch 250 1 12 72 96 110 124 138 152 166 180 194 208 222 236
      // 074: ldc2_w 386152256504170004
      // 077: lload 2
      // 078: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: sipush 29325
      // 081: ldc2_w 1560694639503681832
      // 084: lload 2
      // 085: lxor
      // 086: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ireturn
      // 08c: ldc2_w 386152256504170004
      // 08f: lload 2
      // 090: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: sipush 14505
      // 099: ldc2_w 5663424597484233491
      // 09c: lload 2
      // 09d: lxor
      // 09e: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: ireturn
      // 0a4: sipush 14469
      // 0a7: ldc2_w 1318994828933620515
      // 0aa: lload 2
      // 0ab: lxor
      // 0ac: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: ireturn
      // 0b2: sipush 10523
      // 0b5: ldc2_w 8255935286731862710
      // 0b8: lload 2
      // 0b9: lxor
      // 0ba: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: ireturn
      // 0c0: sipush 32600
      // 0c3: ldc2_w 5116651471054251255
      // 0c6: lload 2
      // 0c7: lxor
      // 0c8: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: ireturn
      // 0ce: sipush 2411
      // 0d1: ldc2_w 2710200695946302147
      // 0d4: lload 2
      // 0d5: lxor
      // 0d6: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: ireturn
      // 0dc: sipush 22878
      // 0df: ldc2_w 2810687222806184679
      // 0e2: lload 2
      // 0e3: lxor
      // 0e4: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: ireturn
      // 0ea: sipush 21500
      // 0ed: ldc2_w 1877708384213928002
      // 0f0: lload 2
      // 0f1: lxor
      // 0f2: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: ireturn
      // 0f8: sipush 405
      // 0fb: ldc2_w 550830852023114302
      // 0fe: lload 2
      // 0ff: lxor
      // 100: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: ireturn
      // 106: sipush 16771
      // 109: ldc2_w 3954101950268742176
      // 10c: lload 2
      // 10d: lxor
      // 10e: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: ireturn
      // 114: sipush 10437
      // 117: ldc2_w 6526144091967452012
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: ireturn
      // 122: sipush 24608
      // 125: ldc2_w 2621458038213196679
      // 128: lload 2
      // 129: lxor
      // 12a: invokedynamic j (IJ)I bsm=com/zelix/_o7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: ireturn
      // 130: bipush -1
      // 131: ireturn
   }

   static {
      long var0 = c ^ 100802623039283L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[25];
      int var5 = 0;
      String var6 = "\u009dó+]\u0089¤·\u0088~\u0090¾Ýú\u0092\u0019\u001fÁ\u0086Å\u000eÊ³u_Ã\u0007[ëç\u001cÇúÀãfú\u0090\u0092ßÉ\f \u008f\u0000zçK\u0080ÇÆnË7\tá<N\u009d\u008fØ\u0094-\u0017ÈL\u0005d\u009f©\u0010ÉócZ\n\u001bóÔ\u001cea\u0095Ï\u009esH»<Û!Î,W6\u0014\u0087Ú3³·JèI\tv\u0019\u008fz+ÇÍËö¨é\tFì ù\u008cz¿k :\u009eE\"ÍRç\u009b\u0010O»I½É\u0006·m=ßôY\u008a.Z\u001aIØ£\u0090S\u001d\u0011\u009c\u0010Ì«bå\u009fîO?X¹Ô\u0089íÏ«©Þv\u009bBZs_¾û";
      int var7 = "\u009dó+]\u0089¤·\u0088~\u0090¾Ýú\u0092\u0019\u001fÁ\u0086Å\u000eÊ³u_Ã\u0007[ëç\u001cÇúÀãfú\u0090\u0092ßÉ\f \u008f\u0000zçK\u0080ÇÆnË7\tá<N\u009d\u008fØ\u0094-\u0017ÈL\u0005d\u009f©\u0010ÉócZ\n\u001bóÔ\u001cea\u0095Ï\u009esH»<Û!Î,W6\u0014\u0087Ú3³·JèI\tv\u0019\u008fz+ÇÍËö¨é\tFì ù\u008cz¿k :\u009eE\"ÍRç\u009b\u0010O»I½É\u0006·m=ßôY\u008a.Z\u001aIØ£\u0090S\u001d\u0011\u009c\u0010Ì«bå\u009fîO?X¹Ô\u0089íÏ«©Þv\u009bBZs_¾û"
         .length();
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
                     n = var8;
                     o = new Integer[25];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "\u00915¿{éËþ\u007f\u001e?âL\u0090|¹d";
                  var7 = "\u00915¿{éËþ\u007f\u001e?âL\u0090|¹d".length();
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

   private static gj a(gj var0) {
      return var0;
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21376;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
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
         throw new RuntimeException("com/zelix/_o7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
