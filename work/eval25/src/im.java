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

public class im extends h8 implements _y1, _zv {
   private i2 c;
   private boolean W;
   private String b;
   private iu J;
   private mx s;
   private static final long a = ess.a(-1243574830315346623L, 5479197597495642677L, MethodHandles.lookup().lookupClass()).a(179913906326108L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public void N(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 23367676796757
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w -7119091599166165671
      // 1f: lload 2
      // 20: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: iload 8
      // 2a: ifeq b7
      // 2d: ldc2_w -8834456800820839782
      // 30: lload 2
      // 31: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: ifnull b6
      // 39: goto 46
      // 3c: ldc2_w -6994598465372690951
      // 3f: lload 2
      // 40: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: lload 2
      // 47: lconst_0
      // 48: lcmp
      // 49: iflt d8
      // 4c: aload 0
      // 4d: iload 8
      // 4f: ifeq b7
      // 52: goto 5f
      // 55: ldc2_w -6994598465372690951
      // 58: lload 2
      // 59: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: ldc2_w -8834456800820839782
      // 62: lload 2
      // 63: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: lload 6
      // 6a: invokevirtual com/zelix/iu.t (J)Ljava/lang/String;
      // 6d: aload 0
      // 6e: ldc2_w -7329383303536527652
      // 71: lload 2
      // 72: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 7a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7d: ifne b6
      // 80: goto 8d
      // 83: ldc2_w -6994598465372690951
      // 86: lload 2
      // 87: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: aload 0
      // 8e: ldc2_w -7329383303536527652
      // 91: lload 2
      // 92: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: aload 0
      // 98: ldc2_w -8834456800820839782
      // 9b: lload 2
      // 9c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: lload 6
      // a3: invokevirtual com/zelix/iu.t (J)Ljava/lang/String;
      // a6: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // a9: goto b6
      // ac: ldc2_w -6994598465372690951
      // af: lload 2
      // b0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: athrow
      // b6: aload 0
      // b7: ldc2_w -8876112190074671378
      // ba: lload 2
      // bb: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: lload 4
      // c2: bipush 1
      // c3: anewarray 308
      // c6: dup_x2
      // c7: dup_x2
      // c8: pop
      // c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cc: bipush 0
      // cd: swap
      // ce: aastore
      // cf: ldc2_w -8855412647066353201
      // d2: lload 2
      // d3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8: return
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: ldc2_w -6897634359885852628
      // 1e: lload 6
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: iload 8
      // 2a: ifeq 58
      // 2d: ldc2_w -6395809355097928791
      // 30: lload 6
      // 32: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 1
      // 38: if_acmpne 63
      // 3b: goto 49
      // 3e: ldc2_w -6657595468988163956
      // 41: lload 6
      // 43: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 58
      // 4d: ldc2_w -6657595468988163956
      // 50: lload 6
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 3
      // 59: ldc2_w -6395809355097928791
      // 5c: lload 6
      // 5e: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: return
   }

   public void r(Object[] var1) {
      long var2 = (Long)var1[0];
      HashMap var4 = (HashMap)var1[1];
      HashMap var5 = (HashMap)var1[2];
      long var6 = var2 ^ 0L;
      x44.a<"l">(x44.a<"h">(this, -3425002371916498360L, var2), new Object[]{var6, var4, var5}, -3905870472572326763L, var2);
   }

   public void T(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 8
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Set
      // 017: astore 4
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Set
      // 01f: astore 5
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast java/lang/Long
      // 027: invokevirtual java/lang/Long.longValue ()J
      // 02a: lstore 2
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/util/Set
      // 031: astore 6
      // 033: pop
      // 034: getstatic com/zelix/im.a J
      // 037: lload 2
      // 038: lxor
      // 039: lstore 2
      // 03a: lload 2
      // 03b: dup2
      // 03c: ldc2_w 124034689587050
      // 03f: lxor
      // 040: lstore 9
      // 042: pop2
      // 043: ldc2_w -3649140584798421711
      // 046: lload 2
      // 047: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: istore 11
      // 04e: iload 11
      // 050: ifeq 11a
      // 053: aload 7
      // 055: ifnull 0dc
      // 058: goto 065
      // 05b: ldc2_w -3565034712132176495
      // 05e: lload 2
      // 05f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: athrow
      // 065: aload 0
      // 066: iload 11
      // 068: ifeq 0dd
      // 06b: goto 078
      // 06e: ldc2_w -3565034712132176495
      // 071: lload 2
      // 072: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: ldc2_w -3094546576143455502
      // 07b: lload 2
      // 07c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: ifnull 0dc
      // 084: goto 091
      // 087: ldc2_w -3565034712132176495
      // 08a: lload 2
      // 08b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: lload 2
      // 092: lconst_0
      // 093: lcmp
      // 094: ifle 11a
      // 097: aload 0
      // 098: iload 11
      // 09a: ifeq 0dd
      // 09d: goto 0aa
      // 0a0: ldc2_w -3565034712132176495
      // 0a3: lload 2
      // 0a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: ldc2_w -3094546576143455502
      // 0ad: lload 2
      // 0ae: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: invokevirtual com/zelix/iu.k ()Z
      // 0b6: ifeq 0dc
      // 0b9: goto 0c6
      // 0bc: ldc2_w -3565034712132176495
      // 0bf: lload 2
      // 0c0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 6
      // 0c8: aload 0
      // 0c9: ldc2_w -3094546576143455502
      // 0cc: lload 2
      // 0cd: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: checkcast com/zelix/ig
      // 0d5: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0da: istore 12
      // 0dc: aload 0
      // 0dd: ldc2_w -3118191964952002938
      // 0e0: lload 2
      // 0e1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: aload 8
      // 0e8: aload 4
      // 0ea: aload 5
      // 0ec: lload 9
      // 0ee: aload 6
      // 0f0: bipush 5
      // 0f1: anewarray 308
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: bipush 4
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x2
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ff: bipush 3
      // 100: swap
      // 101: aastore
      // 102: dup_x1
      // 103: swap
      // 104: bipush 2
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: bipush 1
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 0
      // 10f: swap
      // 110: aastore
      // 111: ldc2_w -3556115288431988404
      // 114: lload 2
      // 115: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: return
   }

   public void B(Object[] param1) {
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
      // 0e: checkcast java/util/Set
      // 11: astore 2
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: ldc2_w -5968474420302013119
      // 1f: lload 3
      // 20: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 7
      // 27: aload 0
      // 28: iload 7
      // 2a: ifeq 54
      // 2d: ldc2_w -5818705618621016728
      // 30: lload 3
      // 31: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: ifeq 7b
      // 39: goto 46
      // 3c: ldc2_w -5839358874957064735
      // 3f: lload 3
      // 40: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: goto 54
      // 4a: ldc2_w -5839358874957064735
      // 4d: lload 3
      // 4e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: ldc2_w -5419544258178015498
      // 57: lload 3
      // 58: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: lload 5
      // 5f: aload 2
      // 60: bipush 2
      // 61: anewarray 308
      // 64: dup_x1
      // 65: swap
      // 66: bipush 1
      // 67: swap
      // 68: aastore
      // 69: dup_x2
      // 6a: dup_x2
      // 6b: pop
      // 6c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f: bipush 0
      // 70: swap
      // 71: aastore
      // 72: ldc2_w -5909839366793002371
      // 75: lload 3
      // 76: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: return
   }

   public void J(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 2
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/_ur
      // 20: astore 4
      // 22: pop
      // 23: lload 5
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w -5735359121590942685
      // 30: lload 5
      // 32: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 2
      // 38: aload 0
      // 39: ldc2_w -6166643473858787585
      // 3c: lload 5
      // 3e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 48: checkcast com/zelix/mx
      // 4b: checkcast com/zelix/mx
      // 4e: astore 10
      // 50: istore 9
      // 52: iload 9
      // 54: ifne 81
      // 57: aload 10
      // 59: ifnull 8d
      // 5c: goto 6a
      // 5f: ldc2_w -5850928977755253286
      // 62: lload 5
      // 64: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 3
      // 6b: aload 10
      // 6d: invokevirtual com/zelix/mx.B ()I
      // 70: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 73: goto 81
      // 76: ldc2_w -5850928977755253286
      // 79: lload 5
      // 7b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: lload 5
      // 83: lconst_0
      // 84: lcmp
      // 85: iflt e4
      // 88: iload 9
      // 8a: ifeq ad
      // 8d: aload 3
      // 8e: aload 0
      // 8f: ldc2_w -6166643473858787585
      // 92: lload 5
      // 94: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: invokevirtual com/zelix/mx.B ()I
      // 9c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 9f: goto ad
      // a2: ldc2_w -5850928977755253286
      // a5: lload 5
      // a7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: aload 0
      // ae: ldc2_w -5408026948444512563
      // b1: lload 5
      // b3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 3
      // b9: lload 7
      // bb: aload 2
      // bc: aload 4
      // be: bipush 4
      // bf: anewarray 308
      // c2: dup_x1
      // c3: swap
      // c4: bipush 3
      // c5: swap
      // c6: aastore
      // c7: dup_x1
      // c8: swap
      // c9: bipush 2
      // ca: swap
      // cb: aastore
      // cc: dup_x2
      // cd: dup_x2
      // ce: pop
      // cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d2: bipush 1
      // d3: swap
      // d4: aastore
      // d5: dup_x1
      // d6: swap
      // d7: bipush 0
      // d8: swap
      // d9: aastore
      // da: ldc2_w -5471663062566679087
      // dd: lload 5
      // df: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e4: return
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return 2 + x44.a<"o">(x44.a<"k">(this, 7839833440261392115L, var2), new Object[]{var4}, 8341412904070076432L, var2);
   }

   String P(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/im.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 46832855164983
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -1457565175750402175
      // 1e: lload 2
      // 1f: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifne 53
      // 2c: ldc2_w -817778854287831311
      // 2f: lload 2
      // 30: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: ifeq a3
      // 38: goto 45
      // 3b: ldc2_w -761378344591192456
      // 3e: lload 2
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: goto 53
      // 49: ldc2_w -761378344591192456
      // 4c: lload 2
      // 4d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: iload 6
      // 55: ifne 8a
      // 58: ldc2_w -1232702117818773221
      // 5b: lload 2
      // 5c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: ifnull 89
      // 64: goto 71
      // 67: ldc2_w -761378344591192456
      // 6a: lload 2
      // 6b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: aload 0
      // 72: ldc2_w -1232702117818773221
      // 75: lload 2
      // 76: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: invokevirtual com/zelix/iu.z ()Ljava/lang/String;
      // 7e: areturn
      // 7f: ldc2_w -761378344591192456
      // 82: lload 2
      // 83: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 0
      // 8a: lload 4
      // 8c: bipush 1
      // 8d: anewarray 308
      // 90: dup_x2
      // 91: dup_x2
      // 92: pop
      // 93: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 96: bipush 0
      // 97: swap
      // 98: aastore
      // 99: ldc2_w -1126716096754106644
      // 9c: lload 2
      // 9d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: areturn
      // a3: aconst_null
      // a4: areturn
   }

   String O(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/im.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 3434551711227714541
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: iload 4
      // 20: ifne 4a
      // 23: ldc2_w 3515869654302313117
      // 26: lload 2
      // 27: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: ifeq 57
      // 2f: goto 3c
      // 32: ldc2_w 3531737767353338388
      // 35: lload 2
      // 36: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: goto 4a
      // 40: ldc2_w 3531737767353338388
      // 43: lload 2
      // 44: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: ldc2_w 3865704485218949425
      // 4d: lload 2
      // 4e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 56: areturn
      // 57: aconst_null
      // 58: areturn
   }

   public void s(Object[] var1) {
      long var3 = (Long)var1[0];
      DataOutputStream var2 = (DataOutputStream)var1[1];
      long var5 = var3 ^ 0L;
      var2.writeShort(x44.a<"o">(this, 934988319516991597L, var3).B());
      x44.a<"k">(x44.a<"o">(this, 1324274508829309023L, var3), new Object[]{var5, var2}, 1487731694784835769L, var3);
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      x44.a<"k">(x44.a<"o">(this, 1110278677825463639L, var2), new Object[]{var4}, 624436350458718719L, var2);
   }

   i2 r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 3161721207777526239L, var2);
   }

   public void N(long param1, _8l param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 80221771876344
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -6348162585463318644
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 8
      // 1b: aload 0
      // 1c: ldc2_w -6488915267242270811
      // 1f: lload 1
      // 20: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: iload 8
      // 27: ifeq 5c
      // 2a: ifeq 6d
      // 2d: goto 3a
      // 30: ldc2_w -6612658733820092628
      // 33: lload 1
      // 34: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: ldc2_w -6873090494281970679
      // 3e: lload 1
      // 3f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: lload 4
      // 46: aload 3
      // 47: aload 0
      // 48: aload 0
      // 49: invokevirtual com/zelix/im.x ()Lcom/zelix/h8;
      // 4c: invokevirtual com/zelix/mx.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 4f: goto 5c
      // 52: ldc2_w -6612658733820092628
      // 55: lload 1
      // 56: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: pop
      // 5d: aload 0
      // 5e: ldc2_w -4754505061925219269
      // 61: lload 1
      // 62: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: lload 6
      // 69: aload 3
      // 6a: invokevirtual com/zelix/i2.N (JLcom/zelix/_8l;)V
      // 6d: return
   }

   public boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this, -3553126205776382745L, var2);
   }

   public String Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 8499821889107706078L, var2);
   }

   public void c(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_ug
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/ei
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/_ur
      // 01e: astore 2
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 4
      // 02a: pop
      // 02b: getstatic com/zelix/im.a J
      // 02e: lload 4
      // 030: lxor
      // 031: lstore 4
      // 033: lload 4
      // 035: dup2
      // 036: ldc2_w 7804220691783
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 93179771554663
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 121883425354105
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 33106605743732
      // 04e: lxor
      // 04f: lstore 14
      // 051: pop2
      // 052: ldc2_w -8380407898311181352
      // 055: lload 4
      // 057: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: istore 16
      // 05e: iload 16
      // 060: ifeq 1bf
      // 063: aload 6
      // 065: ifnull 188
      // 068: goto 076
      // 06b: ldc2_w -8615639784493878408
      // 06e: lload 4
      // 070: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: aload 0
      // 077: ldc2_w -8301853519339216803
      // 07a: lload 4
      // 07c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 084: astore 17
      // 086: aload 0
      // 087: ldc2_w -7903643073771030417
      // 08a: lload 4
      // 08c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: lload 14
      // 093: bipush 1
      // 094: anewarray 308
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w -7711988628540252436
      // 0a3: lload 4
      // 0a5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: astore 18
      // 0ac: lload 4
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: ifle 0f3
      // 0b3: aload 18
      // 0b5: ifnull 0f3
      // 0b8: aload 0
      // 0b9: aload 6
      // 0bb: new com/zelix/_fz
      // 0be: dup
      // 0bf: aload 17
      // 0c1: sipush 29919
      // 0c4: ldc2_w 3343504450997412080
      // 0c7: lload 4
      // 0c9: lxor
      // 0ca: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/im.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: aload 18
      // 0d1: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0d4: lload 10
      // 0d6: dup2_x1
      // 0d7: pop2
      // 0d8: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // 0db: ldc2_w -7789928991234118629
      // 0de: lload 4
      // 0e0: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: goto 0f3
      // 0e8: ldc2_w -8615639784493878408
      // 0eb: lload 4
      // 0ed: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: lload 4
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: iflt 1bf
      // 0fa: aload 0
      // 0fb: iload 16
      // 0fd: ifeq 189
      // 100: ldc2_w -7789928991234118629
      // 103: lload 4
      // 105: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: ifnonnull 188
      // 10d: goto 11b
      // 110: ldc2_w -8615639784493878408
      // 113: lload 4
      // 115: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 6
      // 11d: lload 12
      // 11f: aload 17
      // 121: bipush 2
      // 122: anewarray 308
      // 125: dup_x1
      // 126: swap
      // 127: bipush 1
      // 128: swap
      // 129: aastore
      // 12a: dup_x2
      // 12b: dup_x2
      // 12c: pop
      // 12d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: ldc2_w -8160122522885321991
      // 136: lload 4
      // 138: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: astore 19
      // 13f: iload 16
      // 141: lload 4
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 152
      // 148: ifeq 1bf
      // 14b: aload 19
      // 14d: invokeinterface java/util/List.size ()I 1
      // 152: bipush 1
      // 153: if_icmpne 188
      // 156: goto 164
      // 159: ldc2_w -8615639784493878408
      // 15c: lload 4
      // 15e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: aload 0
      // 165: aload 19
      // 167: bipush 0
      // 168: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 16d: checkcast com/zelix/iu
      // 170: ldc2_w -7789928991234118629
      // 173: lload 4
      // 175: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: goto 188
      // 17d: ldc2_w -8615639784493878408
      // 180: lload 4
      // 182: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: aload 0
      // 189: ldc2_w -7903643073771030417
      // 18c: lload 4
      // 18e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: aload 3
      // 194: lload 8
      // 196: aload 7
      // 198: aload 2
      // 199: bipush 4
      // 19a: anewarray 308
      // 19d: dup_x1
      // 19e: swap
      // 19f: bipush 3
      // 1a0: swap
      // 1a1: aastore
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: bipush 2
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x2
      // 1a8: dup_x2
      // 1a9: pop
      // 1aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ad: bipush 1
      // 1ae: swap
      // 1af: aastore
      // 1b0: dup_x1
      // 1b1: swap
      // 1b2: bipush 0
      // 1b3: swap
      // 1b4: aastore
      // 1b5: ldc2_w -8354904019067551886
      // 1b8: lload 4
      // 1ba: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: return
   }

   im(h8 param1, _xx param2, _y4 param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/im.a J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 52403198606093
      // 00e: lxor
      // 00f: lstore 6
      // 011: dup2
      // 012: ldc2_w 65969918953194
      // 015: lxor
      // 016: lstore 8
      // 018: dup2
      // 019: ldc2_w 2643213002055
      // 01c: lxor
      // 01d: lstore 10
      // 01f: dup2
      // 020: ldc2_w 30594626938454
      // 023: lxor
      // 024: dup2
      // 025: bipush 8
      // 027: lushr
      // 028: lstore 12
      // 02a: dup2
      // 02b: bipush 56
      // 02d: lshl
      // 02e: bipush 56
      // 030: lushr
      // 031: l2i
      // 032: istore 14
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 121105547697619
      // 039: lxor
      // 03a: lstore 15
      // 03c: dup2
      // 03d: ldc2_w 127829520680811
      // 040: lxor
      // 041: lstore 17
      // 043: dup2
      // 044: ldc2_w 43361338837492
      // 047: lxor
      // 048: lstore 19
      // 04a: pop2
      // 04b: ldc2_w 5870401007427871005
      // 04e: lload 4
      // 050: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: aload 0
      // 056: aload 1
      // 057: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 05a: istore 21
      // 05c: aload 0
      // 05d: bipush 1
      // 05e: ldc2_w 6008836197939915060
      // 061: lload 4
      // 063: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 2
      // 069: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 06c: istore 22
      // 06e: aload 0
      // 06f: lload 12
      // 071: iload 22
      // 073: iload 14
      // 075: i2b
      // 076: invokevirtual com/zelix/im.N (JIB)Lcom/zelix/xl;
      // 079: astore 23
      // 07b: iload 21
      // 07d: ifeq 106
      // 080: aload 23
      // 082: ifnull 0ec
      // 085: goto 093
      // 088: ldc2_w 5956587426936334781
      // 08b: lload 4
      // 08d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: lload 4
      // 095: lconst_0
      // 096: lcmp
      // 097: ifle 0f8
      // 09a: aload 23
      // 09c: instanceof com/zelix/mx
      // 09f: ifeq 0ec
      // 0a2: goto 0b0
      // 0a5: ldc2_w 5956587426936334781
      // 0a8: lload 4
      // 0aa: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: aload 23
      // 0b3: checkcast com/zelix/mx
      // 0b6: ldc2_w 6200596604503227032
      // 0b9: lload 4
      // 0bb: invokedynamic u (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: aload 3
      // 0c1: aload 0
      // 0c2: ldc2_w 6200596604503227032
      // 0c5: lload 4
      // 0c7: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: aload 0
      // 0cd: lload 8
      // 0cf: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0d2: lload 4
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: iflt 1f6
      // 0d9: iload 21
      // 0db: ifne 1c0
      // 0de: goto 0ec
      // 0e1: ldc2_w 5956587426936334781
      // 0e4: lload 4
      // 0e6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: bipush 0
      // 0ee: ldc2_w 6008836197939915060
      // 0f1: lload 4
      // 0f3: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: goto 106
      // 0fb: ldc2_w 5956587426936334781
      // 0fe: lload 4
      // 100: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: new java/lang/StringBuilder
      // 10a: dup
      // 10b: invokespecial java/lang/StringBuilder.<init> ()V
      // 10e: sipush 10438
      // 111: lload 4
      // 113: lconst_0
      // 114: lcmp
      // 115: iflt 12d
      // 118: ldc2_w 8806400489219417645
      // 11b: lload 4
      // 11d: lxor
      // 11e: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/im.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: iload 21
      // 125: ifeq 1aa
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: iload 22
      // 12d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 130: aload 23
      // 132: ifnull 1ad
      // 135: goto 143
      // 138: ldc2_w 5956587426936334781
      // 13b: lload 4
      // 13d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: new java/lang/StringBuilder
      // 146: dup
      // 147: invokespecial java/lang/StringBuilder.<init> ()V
      // 14a: sipush 30925
      // 14d: ldc2_w 607383341334443556
      // 150: lload 4
      // 152: lxor
      // 153: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/im.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15b: aload 23
      // 15d: lload 10
      // 15f: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 165: sipush 16865
      // 168: ldc2_w 7808230001692380942
      // 16b: lload 4
      // 16d: lxor
      // 16e: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/im.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 176: aload 23
      // 178: lload 6
      // 17a: bipush 1
      // 17b: anewarray 308
      // 17e: dup_x2
      // 17f: dup_x2
      // 180: pop
      // 181: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 184: bipush 0
      // 185: swap
      // 186: aastore
      // 187: ldc2_w 6197714224886787351
      // 18a: lload 4
      // 18c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 194: ldc "\""
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 199: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19c: goto 1aa
      // 19f: ldc2_w 5956587426936334781
      // 1a2: lload 4
      // 1a4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: goto 1af
      // 1ad: ldc ""
      // 1af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b5: ldc2_w 5974616953455503297
      // 1b8: lload 4
      // 1ba: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: return
      // 1c0: aload 0
      // 1c1: lload 17
      // 1c3: aload 0
      // 1c4: aload 2
      // 1c5: aload 3
      // 1c6: bipush 4
      // 1c7: anewarray 308
      // 1ca: dup_x1
      // 1cb: swap
      // 1cc: bipush 3
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 2
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x1
      // 1d5: swap
      // 1d6: bipush 1
      // 1d7: swap
      // 1d8: aastore
      // 1d9: dup_x2
      // 1da: dup_x2
      // 1db: pop
      // 1dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1df: bipush 0
      // 1e0: swap
      // 1e1: aastore
      // 1e2: ldc2_w 6010815244792685406
      // 1e5: lload 4
      // 1e7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: ldc2_w 5230239958643204778
      // 1ef: lload 4
      // 1f1: invokedynamic u (Ljava/lang/Object;Lcom/zelix/i2;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: lload 4
      // 1f8: lconst_0
      // 1f9: lcmp
      // 1fa: iflt 29e
      // 1fd: aload 0
      // 1fe: iload 21
      // 200: ifeq 252
      // 203: ldc2_w 5230239958643204778
      // 206: lload 4
      // 208: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: lload 15
      // 20f: bipush 1
      // 210: anewarray 308
      // 213: dup_x2
      // 214: dup_x2
      // 215: pop
      // 216: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 219: bipush 0
      // 21a: swap
      // 21b: aastore
      // 21c: ldc2_w 5583723565451960823
      // 21f: lload 4
      // 221: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: ifne 29f
      // 229: goto 237
      // 22c: ldc2_w 5956587426936334781
      // 22f: lload 4
      // 231: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: athrow
      // 237: aload 0
      // 238: bipush 0
      // 239: ldc2_w 6008836197939915060
      // 23c: lload 4
      // 23e: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: aload 0
      // 244: goto 252
      // 247: ldc2_w 5956587426936334781
      // 24a: lload 4
      // 24c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: athrow
      // 252: new java/lang/StringBuilder
      // 255: dup
      // 256: invokespecial java/lang/StringBuilder.<init> ()V
      // 259: sipush 26455
      // 25c: ldc2_w 3167213158814788031
      // 25f: lload 4
      // 261: lxor
      // 262: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/im.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26a: aload 0
      // 26b: ldc2_w 5230239958643204778
      // 26e: lload 4
      // 270: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: lload 19
      // 277: bipush 1
      // 278: anewarray 308
      // 27b: dup_x2
      // 27c: dup_x2
      // 27d: pop
      // 27e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 281: bipush 0
      // 282: swap
      // 283: aastore
      // 284: ldc2_w 6217523877389901928
      // 287: lload 4
      // 289: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 291: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 294: ldc2_w 5974616953455503297
      // 297: lload 4
      // 299: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: return
      // 29f: return
   }

   String u(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/im.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 105745889238796
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 37417495887842
      // 1e: lxor
      // 1f: lstore 6
      // 21: dup2
      // 22: ldc2_w 36509355520116
      // 25: lxor
      // 26: lstore 8
      // 28: pop2
      // 29: ldc2_w 3328717347194018421
      // 2c: lload 2
      // 2d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: istore 10
      // 34: aload 0
      // 35: ldc2_w 3072800382713397403
      // 38: lload 2
      // 39: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: lload 6
      // 40: bipush 1
      // 41: anewarray 308
      // 44: dup_x2
      // 45: dup_x2
      // 46: pop
      // 47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a: bipush 0
      // 4b: swap
      // 4c: aastore
      // 4d: ldc2_w 3408119760005071814
      // 50: lload 2
      // 51: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: iload 10
      // 58: ifne ac
      // 5b: ifeq df
      // 5e: goto 6b
      // 61: ldc2_w 3502464150308866956
      // 64: lload 2
      // 65: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: ldc2_w 3072800382713397403
      // 6f: lload 2
      // 70: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: iload 10
      // 77: ifne c6
      // 7a: goto 87
      // 7d: ldc2_w 3502464150308866956
      // 80: lload 2
      // 81: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: lload 4
      // 89: bipush 1
      // 8a: anewarray 308
      // 8d: dup_x2
      // 8e: dup_x2
      // 8f: pop
      // 90: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93: bipush 0
      // 94: swap
      // 95: aastore
      // 96: ldc2_w 3685413039016988209
      // 99: lload 2
      // 9a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: goto ac
      // a2: ldc2_w 3502464150308866956
      // a5: lload 2
      // a6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: ifeq df
      // af: aload 0
      // b0: ldc2_w 3072800382713397403
      // b3: lload 2
      // b4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: goto c6
      // bc: ldc2_w 3502464150308866956
      // bf: lload 2
      // c0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: athrow
      // c6: lload 8
      // c8: bipush 1
      // c9: anewarray 308
      // cc: dup_x2
      // cd: dup_x2
      // ce: pop
      // cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d2: bipush 0
      // d3: swap
      // d4: aastore
      // d5: ldc2_w 3660087535633083120
      // d8: lload 2
      // d9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: areturn
      // df: aconst_null
      // e0: areturn
   }

   static {
      long var0 = a ^ 32483287279708L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\"\u0006\roÏÒÜÿ[\fÓÃ^¾=\u0086¶\u0089\\`m\u001fôÆ&0\u0085'IÆUÂê\u0094á\u0005\u0001[\u0015Þ¼æj\u000bÆ\u000b\u008bâ\u0017$¯°\u0087Óði\u0010¿\u008dÆí\u009a\u008f¹W#VI5\"\u0016od\u0010V\u0080¬Ã\u0006¼ª´\u0096Ï\u0091_\rÐ-\u0011";
      int var8 = "\"\u0006\roÏÒÜÿ[\fÓÃ^¾=\u0086¶\u0089\\`m\u001fôÆ&0\u0085'IÆUÂê\u0094á\u0005\u0001[\u0015Þ¼æj\u000bÆ\u000b\u008bâ\u0017$¯°\u0087Óði\u0010¿\u008dÆí\u009a\u008f¹W#VI5\"\u0016od\u0010V\u0080¬Ã\u0006¼ª´\u0096Ï\u0091_\rÐ-\u0011"
         .length();
      char var5 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[5];
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

                  var6 = "ñ4\u0018%×n1\bíÑ¥ªz\u0013a\u0087$Ì;\n\u008fÐ\u0086+¿ó\u0016\u009dK\u0013d2\u000e\u0098T@ÿ\u0011Ó\u0099\u008d9JñÙ)ë\u0016\u0010Äÿz{òåãum\u001bX\u0092ê\u0098Ëc";
                  var8 = "ñ4\u0018%×n1\bíÑ¥ªz\u0013a\u0087$Ì;\n\u008fÐ\u0086+¿ó\u0016\u009dK\u0013d2\u000e\u0098T@ÿ\u0011Ó\u0099\u008d9JñÙ)ë\u0016\u0010Äÿz{òåãum\u001bX\u0092ê\u0098Ëc"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4926;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/im", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/im" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
