package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dm extends t5 implements Comparable {
   private List f;
   private int x = -1;
   private String Q;
   private List u;
   private dm B;
   private List m;
   private List v;
   private List H;
   private int s;
   static int N;
   private int P;
   private int j;
   private dm V;
   private static final long a = ess.a(3736693321788433536L, -3418996577525539199L, MethodHandles.lookup().lookupClass()).a(95364961823711L);
   private static final String[] c;
   private static final String[] e;
   private static final Map h = new HashMap(13);
   private static final long i;

   public int l() {
      return this.P;
   }

   public static int Z(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return x44.a<"o">(7074665732728686430L, var1);
   }

   boolean F(int param1, short param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: getstatic com/zelix/dm.a J
      // 1a: lxor
      // 1b: lstore 4
      // 1d: ldc2_w -2348650888783576827
      // 20: lload 4
      // 22: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: istore 6
      // 29: aload 0
      // 2a: getfield com/zelix/dm.m Ljava/util/List;
      // 2d: iload 6
      // 2f: ifeq 55
      // 32: ifnull 74
      // 35: goto 43
      // 38: ldc2_w -2337504878309013992
      // 3b: lload 4
      // 3d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 0
      // 44: getfield com/zelix/dm.m Ljava/util/List;
      // 47: goto 55
      // 4a: ldc2_w -2337504878309013992
      // 4d: lload 4
      // 4f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: invokeinterface java/util/List.size ()I 1
      // 5a: iload 6
      // 5c: ifeq 71
      // 5f: ifle 74
      // 62: goto 70
      // 65: ldc2_w -2337504878309013992
      // 68: lload 4
      // 6a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   List W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -8359991065888522086L, var2);
   }

   public int C() {
      return this.s;
   }

   List K() {
      return this.m;
   }

   public boolean L(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/dm.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w -1179301855257623369
      // 09: lload 2
      // 0a: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: iload 1
      // 12: aload 0
      // 13: getfield com/zelix/dm.P I
      // 16: iload 4
      // 18: ifne 4f
      // 1b: if_icmplt 56
      // 1e: goto 2b
      // 21: ldc2_w -1428795972941695556
      // 24: lload 2
      // 25: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: athrow
      // 2b: iload 1
      // 2c: iload 4
      // 2e: ifne 53
      // 31: goto 3e
      // 34: ldc2_w -1428795972941695556
      // 37: lload 2
      // 38: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/dm.s I
      // 42: goto 4f
      // 45: ldc2_w -1428795972941695556
      // 48: lload 2
      // 49: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: if_icmpgt 56
      // 52: bipush 1
      // 53: goto 57
      // 56: bipush 0
      // 57: ireturn
   }

   static void k(m_ param0, Map param1, long param2, Set param4, Map param5, _ov param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/dm.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 80456082308179
      // 00b: lxor
      // 00c: lstore 7
      // 00e: dup2
      // 00f: ldc2_w 115597640624441
      // 012: lxor
      // 013: dup2
      // 014: bipush 48
      // 016: lushr
      // 017: l2i
      // 018: istore 9
      // 01a: dup2
      // 01b: bipush 16
      // 01d: lshl
      // 01e: bipush 32
      // 020: lushr
      // 021: l2i
      // 022: istore 10
      // 024: dup2
      // 025: bipush 48
      // 027: lshl
      // 028: bipush 48
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 11
      // 02e: pop2
      // 02f: pop2
      // 030: ldc2_w -4627120976255560484
      // 033: lload 2
      // 034: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: new java/util/LinkedList
      // 03c: dup
      // 03d: invokespecial java/util/LinkedList.<init> ()V
      // 040: astore 13
      // 042: new java/util/LinkedList
      // 045: dup
      // 046: invokespecial java/util/LinkedList.<init> ()V
      // 049: astore 14
      // 04b: istore 12
      // 04d: aload 0
      // 04e: getfield com/zelix/m_.C Lcom/zelix/dm;
      // 051: astore 15
      // 053: aload 15
      // 055: iload 12
      // 057: ifne 128
      // 05a: getfield com/zelix/dm.H Ljava/util/List;
      // 05d: ifnull 11d
      // 060: goto 06d
      // 063: ldc2_w -4881748713658948137
      // 066: lload 2
      // 067: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: aload 15
      // 06f: getfield com/zelix/dm.H Ljava/util/List;
      // 072: invokeinterface java/util/List.size ()I 1
      // 077: istore 16
      // 079: bipush 0
      // 07a: istore 17
      // 07c: iload 17
      // 07e: iload 16
      // 080: if_icmpge 11d
      // 083: aload 15
      // 085: getfield com/zelix/dm.H Ljava/util/List;
      // 088: iload 17
      // 08a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 08f: checkcast com/zelix/dm
      // 092: astore 18
      // 094: new com/zelix/wo
      // 097: dup
      // 098: iload 9
      // 09a: i2s
      // 09b: aload 15
      // 09d: iload 10
      // 09f: iload 11
      // 0a1: i2s
      // 0a2: aload 18
      // 0a4: invokespecial com/zelix/wo.<init> (SLjava/lang/Object;ISLjava/lang/Object;)V
      // 0a7: astore 19
      // 0a9: iload 12
      // 0ab: lload 2
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: ifle 0f8
      // 0b1: ifne 0f6
      // 0b4: iload 17
      // 0b6: lload 2
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: ifle 151
      // 0bc: iload 12
      // 0be: ifne 151
      // 0c1: goto 0ce
      // 0c4: ldc2_w -4881748713658948137
      // 0c7: lload 2
      // 0c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: iload 16
      // 0d0: bipush 1
      // 0d1: isub
      // 0d2: if_icmpne 101
      // 0d5: goto 0e2
      // 0d8: ldc2_w -4881748713658948137
      // 0db: lload 2
      // 0dc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 13
      // 0e4: aload 19
      // 0e6: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 0e9: goto 0f6
      // 0ec: ldc2_w -4881748713658948137
      // 0ef: lload 2
      // 0f0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: iload 12
      // 0f8: lload 2
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: ifle 11a
      // 0fe: ifeq 115
      // 101: aload 14
      // 103: aload 19
      // 105: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 108: goto 115
      // 10b: ldc2_w -4881748713658948137
      // 10e: lload 2
      // 10f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: iinc 17 1
      // 118: iload 12
      // 11a: ifeq 07c
      // 11d: aload 15
      // 11f: lload 2
      // 120: lconst_0
      // 121: lcmp
      // 122: ifle 1e1
      // 125: getfield com/zelix/dm.V Lcom/zelix/dm;
      // 128: ifnull 14c
      // 12b: new com/zelix/wo
      // 12e: dup
      // 12f: iload 9
      // 131: i2s
      // 132: aload 15
      // 134: aload 15
      // 136: getfield com/zelix/dm.V Lcom/zelix/dm;
      // 139: iload 10
      // 13b: swap
      // 13c: iload 11
      // 13e: i2s
      // 13f: swap
      // 140: invokespecial com/zelix/wo.<init> (SLjava/lang/Object;ISLjava/lang/Object;)V
      // 143: astore 16
      // 145: aload 13
      // 147: aload 16
      // 149: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 14c: aload 13
      // 14e: invokevirtual java/util/LinkedList.isEmpty ()Z
      // 151: lload 2
      // 152: lconst_0
      // 153: lcmp
      // 154: iflt 15f
      // 157: ifeq 193
      // 15a: aload 14
      // 15c: invokevirtual java/util/LinkedList.isEmpty ()Z
      // 15f: iload 12
      // 161: ifne 1b7
      // 164: goto 171
      // 167: ldc2_w -4881748713658948137
      // 16a: lload 2
      // 16b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: iload 12
      // 173: ifne 1b7
      // 176: goto 183
      // 179: ldc2_w -4881748713658948137
      // 17c: lload 2
      // 17d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: ifne 326
      // 186: goto 193
      // 189: ldc2_w -4881748713658948137
      // 18c: lload 2
      // 18d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: aload 13
      // 195: iload 12
      // 197: ifne 1e1
      // 19a: goto 1a7
      // 19d: ldc2_w -4881748713658948137
      // 1a0: lload 2
      // 1a1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: invokevirtual java/util/LinkedList.isEmpty ()Z
      // 1aa: goto 1b7
      // 1ad: ldc2_w -4881748713658948137
      // 1b0: lload 2
      // 1b1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: ifne 1cf
      // 1ba: aload 13
      // 1bc: invokevirtual java/util/LinkedList.remove ()Ljava/lang/Object;
      // 1bf: checkcast com/zelix/wo
      // 1c2: lload 2
      // 1c3: lconst_0
      // 1c4: lcmp
      // 1c5: ifle 1d4
      // 1c8: astore 16
      // 1ca: iload 12
      // 1cc: ifeq 1e6
      // 1cf: aload 14
      // 1d1: invokevirtual java/util/LinkedList.remove ()Ljava/lang/Object;
      // 1d4: goto 1e1
      // 1d7: ldc2_w -4881748713658948137
      // 1da: lload 2
      // 1db: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: athrow
      // 1e1: checkcast com/zelix/wo
      // 1e4: astore 16
      // 1e6: aload 16
      // 1e8: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 1eb: checkcast com/zelix/dm
      // 1ee: astore 17
      // 1f0: aload 16
      // 1f2: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 1f5: checkcast com/zelix/dm
      // 1f8: astore 18
      // 1fa: aload 5
      // 1fc: aload 17
      // 1fe: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 203: checkcast com/zelix/m_
      // 206: astore 19
      // 208: aload 17
      // 20a: aload 19
      // 20c: aload 18
      // 20e: aload 1
      // 20f: aload 4
      // 211: aload 5
      // 213: aload 6
      // 215: lload 7
      // 217: invokestatic com/zelix/dm.J (Lcom/zelix/dm;Lcom/zelix/m_;Lcom/zelix/dm;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;Lcom/zelix/_ov;J)Ljava/util/BitSet;
      // 21a: astore 20
      // 21c: aload 20
      // 21e: ifnull 321
      // 221: new com/zelix/m_
      // 224: dup
      // 225: aload 18
      // 227: aload 20
      // 229: invokespecial com/zelix/m_.<init> (Lcom/zelix/dm;Ljava/util/BitSet;)V
      // 22c: astore 21
      // 22e: aload 5
      // 230: aload 18
      // 232: aload 21
      // 234: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 239: astore 22
      // 23b: aload 18
      // 23d: iload 12
      // 23f: ifne 2fd
      // 242: getfield com/zelix/dm.H Ljava/util/List;
      // 245: ifnull 2f8
      // 248: goto 255
      // 24b: ldc2_w -4881748713658948137
      // 24e: lload 2
      // 24f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: athrow
      // 255: aload 18
      // 257: getfield com/zelix/dm.H Ljava/util/List;
      // 25a: invokeinterface java/util/List.size ()I 1
      // 25f: istore 23
      // 261: bipush 0
      // 262: istore 24
      // 264: iload 24
      // 266: iload 23
      // 268: if_icmpge 2f8
      // 26b: aload 18
      // 26d: getfield com/zelix/dm.H Ljava/util/List;
      // 270: iload 24
      // 272: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 277: checkcast com/zelix/dm
      // 27a: astore 25
      // 27c: new com/zelix/wo
      // 27f: dup
      // 280: iload 9
      // 282: i2s
      // 283: aload 18
      // 285: iload 10
      // 287: iload 11
      // 289: i2s
      // 28a: aload 25
      // 28c: invokespecial com/zelix/wo.<init> (SLjava/lang/Object;ISLjava/lang/Object;)V
      // 28f: astore 26
      // 291: iload 12
      // 293: lload 2
      // 294: lconst_0
      // 295: lcmp
      // 296: ifle 2d3
      // 299: ifne 2d1
      // 29c: iload 24
      // 29e: iload 23
      // 2a0: bipush 1
      // 2a1: isub
      // 2a2: iload 12
      // 2a4: ifne 268
      // 2a7: lload 2
      // 2a8: lconst_0
      // 2a9: lcmp
      // 2aa: ifle 268
      // 2ad: goto 2ba
      // 2b0: ldc2_w -4881748713658948137
      // 2b3: lload 2
      // 2b4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: athrow
      // 2ba: if_icmpne 2dc
      // 2bd: aload 13
      // 2bf: aload 26
      // 2c1: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 2c4: goto 2d1
      // 2c7: ldc2_w -4881748713658948137
      // 2ca: lload 2
      // 2cb: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: iload 12
      // 2d3: lload 2
      // 2d4: lconst_0
      // 2d5: lcmp
      // 2d6: ifle 2f5
      // 2d9: ifeq 2f0
      // 2dc: aload 14
      // 2de: aload 26
      // 2e0: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 2e3: goto 2f0
      // 2e6: ldc2_w -4881748713658948137
      // 2e9: lload 2
      // 2ea: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: athrow
      // 2f0: iinc 24 1
      // 2f3: iload 12
      // 2f5: ifeq 264
      // 2f8: aload 18
      // 2fa: getfield com/zelix/dm.V Lcom/zelix/dm;
      // 2fd: ifnull 321
      // 300: new com/zelix/wo
      // 303: dup
      // 304: iload 9
      // 306: i2s
      // 307: aload 18
      // 309: aload 18
      // 30b: getfield com/zelix/dm.V Lcom/zelix/dm;
      // 30e: iload 10
      // 310: swap
      // 311: iload 11
      // 313: i2s
      // 314: swap
      // 315: invokespecial com/zelix/wo.<init> (SLjava/lang/Object;ISLjava/lang/Object;)V
      // 318: astore 23
      // 31a: aload 13
      // 31c: aload 23
      // 31e: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 321: iload 12
      // 323: ifeq 14c
      // 326: lload 2
      // 327: lconst_0
      // 328: lcmp
      // 329: ifle 193
      // 32c: return
   }

   boolean a(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/dm.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -3770946741297916472
      // 09: lload 1
      // 0a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 0
      // 11: getfield com/zelix/dm.H Ljava/util/List;
      // 14: iload 3
      // 15: ifeq 39
      // 18: ifnull 56
      // 1b: goto 28
      // 1e: ldc2_w -3800318814021414187
      // 21: lload 1
      // 22: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/zelix/dm.H Ljava/util/List;
      // 2c: goto 39
      // 2f: ldc2_w -3800318814021414187
      // 32: lload 1
      // 33: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: invokeinterface java/util/List.size ()I 1
      // 3e: iload 3
      // 3f: ifeq 53
      // 42: ifle 56
      // 45: goto 52
      // 48: ldc2_w -3800318814021414187
      // 4b: lload 1
      // 4c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 1
      // 53: goto 57
      // 56: bipush 0
      // 57: ireturn
   }

   public _og F(Object[] param1) {
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
      // 0e: checkcast java/util/List
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/dm.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 9223185723340657898
      // 1c: lload 3
      // 1d: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 0
      // 23: getfield com/zelix/dm.s I
      // 26: istore 6
      // 28: istore 5
      // 2a: iload 6
      // 2c: aload 0
      // 2d: getfield com/zelix/dm.P I
      // 30: if_icmple 7d
      // 33: aload 2
      // 34: iload 6
      // 36: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3b: checkcast com/zelix/_og
      // 3e: iload 5
      // 40: ifne 74
      // 43: invokevirtual com/zelix/_og.W ()Z
      // 46: lload 3
      // 47: lconst_0
      // 48: lcmp
      // 49: ifle 7a
      // 4c: ifne 75
      // 4f: goto 5c
      // 52: ldc2_w 8968624094069695969
      // 55: lload 3
      // 56: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 2
      // 5d: iload 6
      // 5f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 64: checkcast com/zelix/_og
      // 67: goto 74
      // 6a: ldc2_w 8968624094069695969
      // 6d: lload 3
      // 6e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: areturn
      // 75: iinc 6 -1
      // 78: iload 5
      // 7a: ifeq 2a
      // 7d: lload 3
      // 7e: lconst_0
      // 7f: lcmp
      // 80: iflt 33
      // 83: aconst_null
      // 84: areturn
   }

   public void d() {
      this.m = null;
      this.H = null;
      this.V = null;
      this.B = null;
      this.u = null;
   }

   void P(int var1) {
      this.j = var1;
   }

   boolean t(Object[] param1) {
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
      // 0c: getstatic com/zelix/dm.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -5586680286110394003
      // 15: lload 2
      // 16: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/dm.Q Ljava/lang/String;
      // 21: iload 4
      // 23: ifne 47
      // 26: ifnull 70
      // 29: goto 36
      // 2c: ldc2_w -5624506148954412954
      // 2f: lload 2
      // 30: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/dm.Q Ljava/lang/String;
      // 3a: goto 47
      // 3d: ldc2_w -5624506148954412954
      // 40: lload 2
      // 41: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: sipush 3310
      // 4a: ldc2_w 4643079079267868373
      // 4d: lload 2
      // 4e: lxor
      // 4f: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 57: iload 4
      // 59: ifne 6d
      // 5c: ifeq 70
      // 5f: goto 6c
      // 62: ldc2_w -5624506148954412954
      // 65: lload 2
      // 66: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   boolean Q(Object[] param1) {
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
      // 0c: getstatic com/zelix/dm.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 2262370942530650375
      // 15: lload 2
      // 16: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w 263196623668512966
      // 21: lload 2
      // 22: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifeq 53
      // 2c: ifnull 71
      // 2f: goto 3c
      // 32: ldc2_w 2273728085980661274
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w 263196623668512966
      // 40: lload 2
      // 41: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w 2273728085980661274
      // 4c: lload 2
      // 4d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: invokeinterface java/util/List.size ()I 1
      // 58: iload 4
      // 5a: ifeq 6e
      // 5d: ifle 71
      // 60: goto 6d
      // 63: ldc2_w 2273728085980661274
      // 66: lload 2
      // 67: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 72
      // 71: bipush 0
      // 72: ireturn
   }

   public int I(dm param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/dm.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w -8068743452158297325
      // 09: lload 2
      // 0a: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: aload 0
      // 12: getfield com/zelix/dm.P I
      // 15: aload 1
      // 16: getfield com/zelix/dm.P I
      // 19: iload 4
      // 1b: ifne 5a
      // 1e: if_icmpge 3a
      // 21: goto 2e
      // 24: ldc2_w -7813831113037821416
      // 27: lload 2
      // 28: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: athrow
      // 2e: bipush -1
      // 2f: ireturn
      // 30: ldc2_w -7813831113037821416
      // 33: lload 2
      // 34: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/zelix/dm.P I
      // 3e: iload 4
      // 40: lload 2
      // 41: lconst_0
      // 42: lcmp
      // 43: ifle 4d
      // 46: ifne 6a
      // 49: aload 1
      // 4a: getfield com/zelix/dm.P I
      // 4d: goto 5a
      // 50: ldc2_w -7813831113037821416
      // 53: lload 2
      // 54: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: if_icmpne 69
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: ldc2_w -7813831113037821416
      // 62: lload 2
      // 63: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: bipush 1
      // 6a: ireturn
   }

   public String q() {
      return this.Q;
   }

   List o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.unmodifiableList(x44.a<"i">(this, -8479194765961931171L, var2));
   }

   boolean q(Object[] param1) {
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
      // 0c: getstatic com/zelix/dm.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8668780188954694489
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/dm.Q Ljava/lang/String;
      // 21: iload 4
      // 23: ifne 47
      // 26: ifnull 70
      // 29: goto 36
      // 2c: ldc2_w -8918274272211935828
      // 2f: lload 2
      // 30: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/dm.Q Ljava/lang/String;
      // 3a: goto 47
      // 3d: ldc2_w -8918274272211935828
      // 40: lload 2
      // 41: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: sipush 1898
      // 4a: ldc2_w 5814954429024280729
      // 4d: lload 2
      // 4e: lxor
      // 4f: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 57: iload 4
      // 59: ifne 6d
      // 5c: ifeq 70
      // 5f: goto 6c
      // 62: ldc2_w -8918274272211935828
      // 65: lload 2
      // 66: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   int m() {
      return this.j;
   }

   void n(dm param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/dm.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w -7055713144208198400
      // 09: lload 2
      // 0a: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: aload 0
      // 12: getfield com/zelix/dm.m Ljava/util/List;
      // 15: iload 4
      // 17: ifne 46
      // 1a: ifnonnull 42
      // 1d: goto 2a
      // 20: ldc2_w -7089597292292979701
      // 23: lload 2
      // 24: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: new java/util/ArrayList
      // 2e: dup
      // 2f: invokespecial java/util/ArrayList.<init> ()V
      // 32: putfield com/zelix/dm.m Ljava/util/List;
      // 35: goto 42
      // 38: ldc2_w -7089597292292979701
      // 3b: lload 2
      // 3c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/zelix/dm.m Ljava/util/List;
      // 46: aload 1
      // 47: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 4c: iload 4
      // 4e: ifne 78
      // 51: ifne 79
      // 54: goto 61
      // 57: ldc2_w -7089597292292979701
      // 5a: lload 2
      // 5b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/zelix/dm.m Ljava/util/List;
      // 65: aload 1
      // 66: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6b: goto 78
      // 6e: ldc2_w -7089597292292979701
      // 71: lload 2
      // 72: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: pop
      // 79: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public boolean e(Object[] var1) {
      _ov var2 = (_ov)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 48458656128393L;
      byte var10000 = x44.a<"u">(3497544786415038187L, var3);
      int var8 = this.s;
      byte var7 = var10000;

      while (true) {
         _og var9 = (_og)var2.get(var8);
         if (!var9.W() || --var8 <= this.P) {
            while (true) {
               var10000 = x44.a<"m">(var9, new Object[]{var5}, 2915374445898447673L, var3);
               if (var3 > 0L) {
                  if (var7 != 0) {
                     return (boolean)var10000;
                  }

                  if (var10000 > this.P) {
                     break;
                  }
               } else if (var10000 > var7) {
                  break;
               }
            }
         }
      }
   }

   void F(Object[] var1) {
      dm var2 = (dm)var1[0];
      this.V = var2;
   }

   void d(int var1) {
      this.P = var1;
   }

   void O(long param1, dm param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/dm.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 3640861468669750500
      // 09: lload 1
      // 0a: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: aload 0
      // 12: getfield com/zelix/dm.u Ljava/util/List;
      // 15: iload 4
      // 17: ifeq 46
      // 1a: ifnonnull 42
      // 1d: goto 2a
      // 20: ldc2_w 3634011206739028985
      // 23: lload 1
      // 24: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: new java/util/ArrayList
      // 2e: dup
      // 2f: invokespecial java/util/ArrayList.<init> ()V
      // 32: putfield com/zelix/dm.u Ljava/util/List;
      // 35: goto 42
      // 38: ldc2_w 3634011206739028985
      // 3b: lload 1
      // 3c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/zelix/dm.u Ljava/util/List;
      // 46: aload 3
      // 47: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4c: pop
      // 4d: return
   }

   dm P() {
      return this.V;
   }

   _og a(long var1, _ov var3) {
      var1 = a ^ var1;
      int var4 = this.s;

      _og var5;
      do {
         var5 = (_og)var3.get(var4);
      } while (var5.W() && --var4 > this.P);

      return var5;
   }

   public dm O(Object[] param1) {
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
      // 0c: getstatic com/zelix/dm.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 6910537239498765554
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/dm.H Ljava/util/List;
      // 21: iload 4
      // 23: ifne 47
      // 26: ifnull 7d
      // 29: goto 36
      // 2c: ldc2_w 6660414372961748473
      // 2f: lload 2
      // 30: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/dm.H Ljava/util/List;
      // 3a: goto 47
      // 3d: ldc2_w 6660414372961748473
      // 40: lload 2
      // 41: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: iload 4
      // 49: ifne 79
      // 4c: invokeinterface java/util/List.size ()I 1
      // 51: bipush 2
      // 52: if_icmpne 7d
      // 55: goto 62
      // 58: ldc2_w 6660414372961748473
      // 5b: lload 2
      // 5c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: getfield com/zelix/dm.H Ljava/util/List;
      // 66: bipush 1
      // 67: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6c: goto 79
      // 6f: ldc2_w 6660414372961748473
      // 72: lload 2
      // 73: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: checkcast com/zelix/dm
      // 7c: areturn
      // 7d: aconst_null
      // 7e: areturn
   }

   public Enumeration R(short param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: lload 2
      // 06: bipush 16
      // 08: lshl
      // 09: bipush 16
      // 0b: lushr
      // 0c: lor
      // 0d: getstatic com/zelix/dm.a J
      // 10: lxor
      // 11: lstore 4
      // 13: ldc2_w 6072175388254456358
      // 16: lload 4
      // 18: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: istore 6
      // 1f: aload 0
      // 20: getfield com/zelix/dm.H Ljava/util/List;
      // 23: iload 6
      // 25: ifeq 4b
      // 28: ifnull 4f
      // 2b: goto 39
      // 2e: ldc2_w 6101491973724998971
      // 31: lload 4
      // 33: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: aload 0
      // 3a: getfield com/zelix/dm.H Ljava/util/List;
      // 3d: goto 4b
      // 40: ldc2_w 6101491973724998971
      // 43: lload 4
      // 45: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: invokestatic java/util/Collections.enumeration (Ljava/util/Collection;)Ljava/util/Enumeration;
      // 4e: areturn
      // 4f: aconst_null
      // 50: areturn
   }

   void T(Object[] param1) {
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
      // 04: checkcast com/zelix/dm
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/dm.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w 8919503596127686877
      // 1d: lload 2
      // 1e: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: aload 0
      // 26: ldc2_w 7447804660897102677
      // 29: lload 2
      // 2a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: iload 5
      // 31: ifne 6c
      // 34: ifnonnull 62
      // 37: goto 44
      // 3a: ldc2_w 8665440079988564438
      // 3d: lload 2
      // 3e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: new java/util/ArrayList
      // 48: dup
      // 49: invokespecial java/util/ArrayList.<init> ()V
      // 4c: ldc2_w 7447804660897102677
      // 4f: lload 2
      // 50: invokedynamic v (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: goto 62
      // 58: ldc2_w 8665440079988564438
      // 5b: lload 2
      // 5c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: ldc2_w 7447804660897102677
      // 66: lload 2
      // 67: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: aload 4
      // 6e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 73: pop
      // 74: return
   }

   private boolean c(Object[] param1) {
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
      // 00e: checkcast com/zelix/dm
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/BitSet
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic com/zelix/dm.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 62006300740462
      // 027: lxor
      // 028: lstore 6
      // 02a: pop2
      // 02b: ldc2_w -1024929655983607900
      // 02e: lload 2
      // 02f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: istore 8
      // 036: aload 5
      // 038: aload 4
      // 03a: invokevirtual com/zelix/dm.m ()I
      // 03d: iload 8
      // 03f: ifeq 068
      // 042: invokevirtual java/util/BitSet.get (I)Z
      // 045: ifeq 061
      // 048: goto 055
      // 04b: ldc2_w -1067671768122709831
      // 04e: lload 2
      // 04f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: athrow
      // 055: bipush 0
      // 056: ireturn
      // 057: ldc2_w -1067671768122709831
      // 05a: lload 2
      // 05b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: aload 5
      // 063: aload 4
      // 065: invokevirtual com/zelix/dm.m ()I
      // 068: invokevirtual java/util/BitSet.set (I)V
      // 06b: aload 4
      // 06d: getfield com/zelix/dm.m Ljava/util/List;
      // 070: ifnonnull 07f
      // 073: bipush 0
      // 074: ireturn
      // 075: ldc2_w -1067671768122709831
      // 078: lload 2
      // 079: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: bipush 0
      // 080: istore 9
      // 082: aload 4
      // 084: getfield com/zelix/dm.m Ljava/util/List;
      // 087: invokeinterface java/util/List.size ()I 1
      // 08c: istore 10
      // 08e: bipush 0
      // 08f: istore 11
      // 091: iload 11
      // 093: iload 10
      // 095: if_icmpge 148
      // 098: aload 4
      // 09a: getfield com/zelix/dm.m Ljava/util/List;
      // 09d: iload 11
      // 09f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0a4: checkcast com/zelix/dm
      // 0a7: astore 12
      // 0a9: lload 2
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: ifle 0fe
      // 0af: aload 12
      // 0b1: aload 0
      // 0b2: iload 8
      // 0b4: ifeq 0d6
      // 0b7: if_acmpne 0d3
      // 0ba: goto 0c7
      // 0bd: ldc2_w -1067671768122709831
      // 0c0: lload 2
      // 0c1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: bipush 1
      // 0c8: ireturn
      // 0c9: ldc2_w -1067671768122709831
      // 0cc: lload 2
      // 0cd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: aload 12
      // 0d6: aload 5
      // 0d8: lload 6
      // 0da: dup2_x2
      // 0db: pop2
      // 0dc: bipush 3
      // 0dd: anewarray 330
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 2
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 1
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: ldc2_w -913508527867093302
      // 0f6: lload 2
      // 0f7: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: istore 9
      // 0fe: iload 8
      // 100: lload 2
      // 101: lconst_0
      // 102: lcmp
      // 103: iflt 145
      // 106: ifeq 143
      // 109: iload 9
      // 10b: ifeq 133
      // 10e: goto 11b
      // 111: ldc2_w -1067671768122709831
      // 114: lload 2
      // 115: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: iload 8
      // 11d: lload 2
      // 11e: lconst_0
      // 11f: lcmp
      // 120: iflt 14a
      // 123: ifne 148
      // 126: goto 133
      // 129: ldc2_w -1067671768122709831
      // 12c: lload 2
      // 12d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: iinc 11 1
      // 136: goto 143
      // 139: ldc2_w -1067671768122709831
      // 13c: lload 2
      // 13d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: iload 8
      // 145: ifne 091
      // 148: iload 9
      // 14a: ireturn
   }

   int u(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/dm.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 62006300740462
      // 00b: lxor
      // 00c: lstore 3
      // 00d: pop2
      // 00e: ldc2_w -2107473263262597982
      // 011: lload 1
      // 012: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: istore 5
      // 019: aload 0
      // 01a: getfield com/zelix/dm.x I
      // 01d: iload 5
      // 01f: ifeq 101
      // 022: bipush -1
      // 023: if_icmpne 0fd
      // 026: goto 033
      // 029: ldc2_w -2150281918605083713
      // 02c: lload 1
      // 02d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: athrow
      // 033: aload 0
      // 034: invokevirtual com/zelix/dm.k ()I
      // 037: istore 6
      // 039: aload 0
      // 03a: iload 5
      // 03c: ifeq 0f8
      // 03f: getfield com/zelix/dm.m Ljava/util/List;
      // 042: ifnull 0f7
      // 045: goto 052
      // 048: ldc2_w -2150281918605083713
      // 04b: lload 1
      // 04c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: athrow
      // 052: aload 0
      // 053: iload 5
      // 055: lload 1
      // 056: lconst_0
      // 057: lcmp
      // 058: iflt 0fa
      // 05b: ifeq 0f8
      // 05e: goto 06b
      // 061: ldc2_w -2150281918605083713
      // 064: lload 1
      // 065: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: getfield com/zelix/dm.m Ljava/util/List;
      // 06e: invokeinterface java/util/List.size ()I 1
      // 073: dup
      // 074: istore 7
      // 076: lload 1
      // 077: lconst_0
      // 078: lcmp
      // 079: ifle 083
      // 07c: ifle 0f7
      // 07f: getstatic com/zelix/dm.i J
      // 082: l2i
      // 083: istore 8
      // 085: bipush 0
      // 086: istore 9
      // 088: iload 9
      // 08a: iload 7
      // 08c: if_icmpge 0ea
      // 08f: aload 0
      // 090: getfield com/zelix/dm.m Ljava/util/List;
      // 093: iload 9
      // 095: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 09a: checkcast com/zelix/dm
      // 09d: astore 10
      // 09f: aload 10
      // 0a1: lload 3
      // 0a2: invokevirtual com/zelix/dm.u (J)I
      // 0a5: istore 11
      // 0a7: iload 5
      // 0a9: lload 1
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: ifle 0e7
      // 0af: ifeq 0e5
      // 0b2: iload 11
      // 0b4: lload 1
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: ifle 0f5
      // 0ba: iload 8
      // 0bc: iload 5
      // 0be: ifeq 0f4
      // 0c1: goto 0ce
      // 0c4: ldc2_w -2150281918605083713
      // 0c7: lload 1
      // 0c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: if_icmpge 0e2
      // 0d1: goto 0de
      // 0d4: ldc2_w -2150281918605083713
      // 0d7: lload 1
      // 0d8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: iload 11
      // 0e0: istore 8
      // 0e2: iinc 9 1
      // 0e5: iload 5
      // 0e7: ifne 088
      // 0ea: iload 6
      // 0ec: lload 1
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 0f5
      // 0f2: iload 8
      // 0f4: iadd
      // 0f5: istore 6
      // 0f7: aload 0
      // 0f8: iload 6
      // 0fa: putfield com/zelix/dm.x I
      // 0fd: aload 0
      // 0fe: getfield com/zelix/dm.x I
      // 101: ireturn
   }

   public int k() {
      return this.s - this.P + 1;
   }

   void Q(Object[] param1) {
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
      // 00c: getstatic com/zelix/dm.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w 8669433187268793157
      // 015: lload 2
      // 016: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: aload 0
      // 01c: getfield com/zelix/dm.H Ljava/util/List;
      // 01f: invokeinterface java/util/List.size ()I 1
      // 024: istore 5
      // 026: istore 4
      // 028: iload 5
      // 02a: iload 4
      // 02c: ifne 055
      // 02f: bipush 1
      // 030: if_icmple 103
      // 033: goto 040
      // 036: ldc2_w 8924341265777533518
      // 039: lload 2
      // 03a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: athrow
      // 040: aload 0
      // 041: getfield com/zelix/dm.H Ljava/util/List;
      // 044: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 047: bipush 0
      // 048: goto 055
      // 04b: ldc2_w 8924341265777533518
      // 04e: lload 2
      // 04f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: athrow
      // 055: istore 6
      // 057: bipush 0
      // 058: istore 7
      // 05a: iload 7
      // 05c: aload 0
      // 05d: getfield com/zelix/dm.H Ljava/util/List;
      // 060: invokeinterface java/util/List.size ()I 1
      // 065: if_icmpge 0e7
      // 068: aload 0
      // 069: getfield com/zelix/dm.H Ljava/util/List;
      // 06c: iload 7
      // 06e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 073: checkcast com/zelix/dm
      // 076: iload 4
      // 078: ifne 0f5
      // 07b: invokevirtual com/zelix/dm.l ()I
      // 07e: lload 2
      // 07f: lconst_0
      // 080: lcmp
      // 081: ifle 0c3
      // 084: iload 4
      // 086: ifne 0bf
      // 089: goto 096
      // 08c: ldc2_w 8924341265777533518
      // 08f: lload 2
      // 090: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: lload 2
      // 097: lconst_0
      // 098: lcmp
      // 099: ifle 0d1
      // 09c: aload 0
      // 09d: invokevirtual com/zelix/dm.C ()I
      // 0a0: if_icmple 0cc
      // 0a3: goto 0b0
      // 0a6: ldc2_w 8924341265777533518
      // 0a9: lload 2
      // 0aa: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: iload 7
      // 0b2: goto 0bf
      // 0b5: ldc2_w 8924341265777533518
      // 0b8: lload 2
      // 0b9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: istore 6
      // 0c1: iload 4
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 0d1
      // 0c9: ifeq 0e7
      // 0cc: iinc 7 1
      // 0cf: iload 4
      // 0d1: ifeq 05a
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 068
      // 0da: goto 0e7
      // 0dd: ldc2_w 8924341265777533518
      // 0e0: lload 2
      // 0e1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield com/zelix/dm.H Ljava/util/List;
      // 0eb: iload 6
      // 0ed: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 0f2: checkcast com/zelix/dm
      // 0f5: astore 7
      // 0f7: aload 0
      // 0f8: getfield com/zelix/dm.H Ljava/util/List;
      // 0fb: aload 7
      // 0fd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 102: pop
      // 103: return
   }

   private boolean r(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ur
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic com/zelix/dm.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 110402539484352
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 67342989608383
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 115206318452272
      // 035: lxor
      // 036: dup2
      // 037: bipush 56
      // 039: lushr
      // 03a: l2i
      // 03b: istore 10
      // 03d: dup2
      // 03e: bipush 8
      // 040: lshl
      // 041: bipush 8
      // 043: lushr
      // 044: lstore 11
      // 046: pop2
      // 047: pop2
      // 048: ldc2_w 7250912480838979509
      // 04b: lload 2
      // 04c: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: aload 0
      // 052: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 055: dup
      // 056: astore 14
      // 058: monitorenter
      // 059: istore 13
      // 05b: ldc2_w 8977219233999886821
      // 05e: lload 2
      // 05f: invokedynamic l (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: iload 13
      // 066: ifne 1d8
      // 069: ifne 1cf
      // 06c: goto 079
      // 06f: ldc2_w 7433693593069338302
      // 072: lload 2
      // 073: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 4
      // 07b: invokeinterface java/util/Set.size ()I 1
      // 080: iload 13
      // 082: ifne 0d8
      // 085: goto 092
      // 088: ldc2_w 7433693593069338302
      // 08b: lload 2
      // 08c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: bipush 5
      // 093: if_icmpeq 0d7
      // 096: goto 0a3
      // 099: ldc2_w 7433693593069338302
      // 09c: lload 2
      // 09d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: bipush -1
      // 0a4: ldc2_w 8977219233999886821
      // 0a7: lload 2
      // 0a8: invokedynamic t (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: aload 5
      // 0af: iload 10
      // 0b1: i2b
      // 0b2: lload 11
      // 0b4: bipush 2
      // 0b5: anewarray 330
      // 0b8: dup_x2
      // 0b9: dup_x2
      // 0ba: pop
      // 0bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0be: bipush 1
      // 0bf: swap
      // 0c0: aastore
      // 0c1: dup_x1
      // 0c2: swap
      // 0c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c6: bipush 0
      // 0c7: swap
      // 0c8: aastore
      // 0c9: ldc2_w 7084146862585866635
      // 0cc: lload 2
      // 0cd: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: bipush 0
      // 0d3: aload 14
      // 0d5: monitorexit
      // 0d6: ireturn
      // 0d7: bipush 0
      // 0d8: istore 15
      // 0da: aload 4
      // 0dc: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0e1: astore 16
      // 0e3: aload 16
      // 0e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ea: ifeq 1bf
      // 0ed: aload 16
      // 0ef: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f4: checkcast java/lang/String
      // 0f7: astore 17
      // 0f9: iload 13
      // 0fb: lload 2
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: iflt 1bc
      // 101: ifne 1ba
      // 104: aload 17
      // 106: sipush 15993
      // 109: ldc2_w 3793211702806837915
      // 10c: lload 2
      // 10d: lxor
      // 10e: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/dm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: lload 6
      // 115: bipush 3
      // 116: anewarray 330
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 2
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w 7084349872770142816
      // 12f: lload 2
      // 130: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: aload 0
      // 136: lload 8
      // 138: iload 15
      // 13a: bipush 2
      // 13b: anewarray 330
      // 13e: dup_x1
      // 13f: swap
      // 140: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 143: bipush 1
      // 144: swap
      // 145: aastore
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 0
      // 14d: swap
      // 14e: aastore
      // 14f: ldc2_w 7355903929260375897
      // 152: lload 2
      // 153: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: ldc2_w 8901110131026959286
      // 15b: lload 2
      // 15c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: iload 13
      // 163: ifne 1c6
      // 166: goto 173
      // 169: ldc2_w 7433693593069338302
      // 16c: lload 2
      // 16d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: ifne 1b7
      // 176: goto 183
      // 179: ldc2_w 7433693593069338302
      // 17c: lload 2
      // 17d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: bipush -1
      // 184: ldc2_w 8977219233999886821
      // 187: lload 2
      // 188: invokedynamic t (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: aload 5
      // 18f: iload 10
      // 191: i2b
      // 192: lload 11
      // 194: bipush 2
      // 195: anewarray 330
      // 198: dup_x2
      // 199: dup_x2
      // 19a: pop
      // 19b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19e: bipush 1
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: ldc2_w 7084146862585866635
      // 1ac: lload 2
      // 1ad: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: bipush 0
      // 1b3: aload 14
      // 1b5: monitorexit
      // 1b6: ireturn
      // 1b7: iinc 15 1
      // 1ba: iload 13
      // 1bc: ifeq 0e3
      // 1bf: lload 2
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: ifle 1cf
      // 1c5: bipush 1
      // 1c6: ldc2_w 8977219233999886821
      // 1c9: lload 2
      // 1ca: invokedynamic t (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: ldc2_w 8977219233999886821
      // 1d2: lload 2
      // 1d3: invokedynamic l (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: iload 13
      // 1da: lload 2
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: iflt 1e4
      // 1e0: ifne 202
      // 1e3: bipush 1
      // 1e4: if_icmpne 205
      // 1e7: goto 1f4
      // 1ea: ldc2_w 7433693593069338302
      // 1ed: lload 2
      // 1ee: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: bipush 1
      // 1f5: goto 202
      // 1f8: ldc2_w 7433693593069338302
      // 1fb: lload 2
      // 1fc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: goto 206
      // 205: bipush 0
      // 206: aload 14
      // 208: monitorexit
      // 209: ireturn
      // 20a: astore 18
      // 20c: aload 14
      // 20e: monitorexit
      // 20f: aload 18
      // 211: athrow
   }

   void y(Object[] var1) {
      dm var2 = (dm)var1[0];
      this.B = var2;
   }

   public dm v(Object[] var1) {
      return this.B;
   }

   Enumeration C(Object[] param1) {
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
      // 0c: getstatic com/zelix/dm.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 1012894413531484268
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/dm.u Ljava/util/List;
      // 21: iload 4
      // 23: ifeq 47
      // 26: ifnull 4b
      // 29: goto 36
      // 2c: ldc2_w 1073809294623102833
      // 2f: lload 2
      // 30: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/dm.u Ljava/util/List;
      // 3a: goto 47
      // 3d: ldc2_w 1073809294623102833
      // 40: lload 2
      // 41: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: invokestatic java/util/Collections.enumeration (Ljava/util/Collection;)Ljava/util/Enumeration;
      // 4a: areturn
      // 4b: new com/zelix/ri
      // 4e: dup
      // 4f: invokespecial com/zelix/ri.<init> ()V
      // 52: areturn
   }

   void e(String var1) {
      this.Q = var1;
   }

   private static BitSet J(dm param0, m_ param1, dm param2, Map param3, Set param4, Map param5, _ov param6, long param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/dm.a J
      // 003: lload 7
      // 005: lxor
      // 006: lstore 7
      // 008: lload 7
      // 00a: dup2
      // 00b: ldc2_w 125994003963279
      // 00e: lxor
      // 00f: lstore 9
      // 011: dup2
      // 012: ldc2_w 89935628285725
      // 015: lxor
      // 016: dup2
      // 017: bipush 32
      // 019: lushr
      // 01a: l2i
      // 01b: istore 11
      // 01d: dup2
      // 01e: bipush 32
      // 020: lshl
      // 021: bipush 56
      // 023: lushr
      // 024: l2i
      // 025: istore 12
      // 027: dup2
      // 028: bipush 40
      // 02a: lshl
      // 02b: bipush 40
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 13
      // 031: pop2
      // 032: pop2
      // 033: ldc2_w -8578133857865014303
      // 036: lload 7
      // 038: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 14
      // 03f: aload 4
      // 041: aload 2
      // 042: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 047: iload 14
      // 049: ifne 15d
      // 04c: ifeq 155
      // 04f: goto 05d
      // 052: ldc2_w -8395279112787176726
      // 055: lload 7
      // 057: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 1
      // 05e: getfield com/zelix/m_.r Ljava/util/BitSet;
      // 061: aload 2
      // 062: invokevirtual com/zelix/dm.m ()I
      // 065: iload 14
      // 067: ifne 150
      // 06a: goto 078
      // 06d: ldc2_w -8395279112787176726
      // 070: lload 7
      // 072: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: lload 7
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: ifle 142
      // 07f: invokevirtual java/util/BitSet.get (I)Z
      // 082: ifeq 129
      // 085: goto 093
      // 088: ldc2_w -8395279112787176726
      // 08b: lload 7
      // 08d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 3
      // 094: lload 7
      // 096: lconst_0
      // 097: lcmp
      // 098: ifle 102
      // 09b: aload 2
      // 09c: iload 14
      // 09e: ifne 0fd
      // 0a1: goto 0af
      // 0a4: ldc2_w -8395279112787176726
      // 0a7: lload 7
      // 0a9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0b4: ifne 0ed
      // 0b7: goto 0c5
      // 0ba: ldc2_w -8395279112787176726
      // 0bd: lload 7
      // 0bf: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: new com/zelix/dp
      // 0c8: dup
      // 0c9: iload 11
      // 0cb: iload 12
      // 0cd: i2b
      // 0ce: aload 2
      // 0cf: iload 13
      // 0d1: aload 0
      // 0d2: invokespecial com/zelix/dp.<init> (IBLcom/zelix/dm;ILcom/zelix/dm;)V
      // 0d5: astore 15
      // 0d7: aload 3
      // 0d8: aload 2
      // 0d9: aload 15
      // 0db: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e0: pop
      // 0e1: iload 14
      // 0e3: lload 7
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: ifle 126
      // 0ea: ifeq 11d
      // 0ed: aload 3
      // 0ee: aload 2
      // 0ef: goto 0fd
      // 0f2: ldc2_w -8395279112787176726
      // 0f5: lload 7
      // 0f7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 102: checkcast com/zelix/dp
      // 105: astore 15
      // 107: aload 15
      // 109: aload 0
      // 10a: bipush 1
      // 10b: anewarray 330
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w -8086306001567147487
      // 116: lload 7
      // 118: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: lload 7
      // 11f: lconst_0
      // 120: lcmp
      // 121: ifle 130
      // 124: iload 14
      // 126: ifeq 153
      // 129: aload 2
      // 12a: aload 0
      // 12b: lload 9
      // 12d: invokevirtual com/zelix/dm.n (Lcom/zelix/dm;J)V
      // 130: aload 5
      // 132: aload 2
      // 133: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 138: checkcast com/zelix/m_
      // 13b: getfield com/zelix/m_.r Ljava/util/BitSet;
      // 13e: aload 0
      // 13f: invokevirtual com/zelix/dm.m ()I
      // 142: goto 150
      // 145: ldc2_w -8395279112787176726
      // 148: lload 7
      // 14a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: invokevirtual java/util/BitSet.set (I)V
      // 153: aconst_null
      // 154: areturn
      // 155: aload 4
      // 157: aload 2
      // 158: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 15d: pop
      // 15e: aload 2
      // 15f: aload 0
      // 160: lload 9
      // 162: invokevirtual com/zelix/dm.n (Lcom/zelix/dm;J)V
      // 165: aload 1
      // 166: getfield com/zelix/m_.r Ljava/util/BitSet;
      // 169: invokevirtual java/util/BitSet.clone ()Ljava/lang/Object;
      // 16c: checkcast java/util/BitSet
      // 16f: astore 15
      // 171: aload 15
      // 173: aload 0
      // 174: invokevirtual com/zelix/dm.m ()I
      // 177: invokevirtual java/util/BitSet.set (I)V
      // 17a: aload 15
      // 17c: aload 2
      // 17d: invokevirtual com/zelix/dm.m ()I
      // 180: invokevirtual java/util/BitSet.set (I)V
      // 183: aload 15
      // 185: areturn
   }

   List H(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/dm.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 1622027443948980448
      // 09: lload 1
      // 0a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 0
      // 11: getfield com/zelix/dm.m Ljava/util/List;
      // 14: iload 3
      // 15: ifeq 3c
      // 18: ifnull 3d
      // 1b: goto 28
      // 1e: ldc2_w 1615367963660242941
      // 21: lload 1
      // 22: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/zelix/dm.m Ljava/util/List;
      // 2c: invokestatic java/util/Collections.unmodifiableList (Ljava/util/List;)Ljava/util/List;
      // 2f: goto 3c
      // 32: ldc2_w 1615367963660242941
      // 35: lload 1
      // 36: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: areturn
      // 3d: aconst_null
      // 3e: areturn
   }

   boolean n(Object[] var1) {
      dm var2 = (dm)var1[0];
      BitSet var3 = (BitSet)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 61417656271529L;
      x44.a<"m">(var3, -5167302110914498802L, var4);
      return x44.a<"k">(this, new Object[]{var6, var2, var3}, -5001916531779348723L, var4);
   }

   public int I(Object[] param1) {
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
      // 004: checkcast com/zelix/_kz
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast [Lcom/zelix/_kz;
      // 015: astore 16
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/util/Set
      // 01d: astore 5
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast com/zelix/dm
      // 025: astore 8
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast com/zelix/dm
      // 02d: astore 4
      // 02f: dup
      // 030: bipush 6
      // 032: aaload
      // 033: checkcast com/zelix/dm
      // 036: astore 9
      // 038: dup
      // 039: bipush 7
      // 03b: aaload
      // 03c: checkcast com/zelix/_ov
      // 03f: astore 11
      // 041: dup
      // 042: bipush 8
      // 044: aaload
      // 045: checkcast java/lang/Long
      // 048: invokevirtual java/lang/Long.longValue ()J
      // 04b: lstore 12
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast com/zelix/_fm
      // 054: astore 7
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast com/zelix/_ur
      // 05d: astore 6
      // 05f: dup
      // 060: bipush 11
      // 062: aaload
      // 063: checkcast com/zelix/pg
      // 066: astore 10
      // 068: dup
      // 069: bipush 12
      // 06b: aaload
      // 06c: checkcast java/lang/Boolean
      // 06f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 072: istore 14
      // 074: dup
      // 075: bipush 13
      // 077: aaload
      // 078: checkcast java/lang/String
      // 07b: astore 15
      // 07d: pop
      // 07e: getstatic com/zelix/dm.a J
      // 081: lload 12
      // 083: lxor
      // 084: lstore 12
      // 086: lload 12
      // 088: dup2
      // 089: ldc2_w 39328039697926
      // 08c: lxor
      // 08d: dup2
      // 08e: bipush 32
      // 090: lushr
      // 091: l2i
      // 092: istore 17
      // 094: dup2
      // 095: bipush 32
      // 097: lshl
      // 098: bipush 56
      // 09a: lushr
      // 09b: l2i
      // 09c: istore 18
      // 09e: dup2
      // 09f: bipush 40
      // 0a1: lshl
      // 0a2: bipush 40
      // 0a4: lushr
      // 0a5: l2i
      // 0a6: istore 19
      // 0a8: pop2
      // 0a9: dup2
      // 0aa: ldc2_w 71923520871535
      // 0ad: lxor
      // 0ae: dup2
      // 0af: bipush 32
      // 0b1: lushr
      // 0b2: l2i
      // 0b3: istore 20
      // 0b5: dup2
      // 0b6: bipush 32
      // 0b8: lshl
      // 0b9: bipush 32
      // 0bb: lushr
      // 0bc: lstore 21
      // 0be: pop2
      // 0bf: dup2
      // 0c0: ldc2_w 96777371448378
      // 0c3: lxor
      // 0c4: lstore 23
      // 0c6: dup2
      // 0c7: ldc2_w 62006300740462
      // 0ca: lxor
      // 0cb: lstore 25
      // 0cd: dup2
      // 0ce: ldc2_w 123442194401170
      // 0d1: lxor
      // 0d2: lstore 27
      // 0d4: dup2
      // 0d5: ldc2_w 90420105335144
      // 0d8: lxor
      // 0d9: lstore 29
      // 0db: dup2
      // 0dc: ldc2_w 26637411961353
      // 0df: lxor
      // 0e0: lstore 31
      // 0e2: pop2
      // 0e3: ldc2_w 3115902743472813407
      // 0e6: lload 12
      // 0e8: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: istore 33
      // 0ef: aload 0
      // 0f0: aload 9
      // 0f2: iload 33
      // 0f4: ifeq 12b
      // 0f7: if_acmpne 115
      // 0fa: goto 108
      // 0fd: ldc2_w 3158572336599069250
      // 100: lload 12
      // 102: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: bipush -1
      // 109: ireturn
      // 10a: ldc2_w 3158572336599069250
      // 10d: lload 12
      // 10f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 0
      // 116: iload 33
      // 118: ifeq 184
      // 11b: aload 8
      // 11d: goto 12b
      // 120: ldc2_w 3158572336599069250
      // 123: lload 12
      // 125: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: if_acmpne 175
      // 12e: aload 11
      // 130: aload 0
      // 131: getfield com/zelix/dm.P I
      // 134: invokevirtual com/zelix/_ov.get (I)Ljava/lang/Object;
      // 137: checkcast com/zelix/_og
      // 13a: invokevirtual com/zelix/_og.W ()Z
      // 13d: iload 33
      // 13f: ifeq 187
      // 142: goto 150
      // 145: ldc2_w 3158572336599069250
      // 148: lload 12
      // 14a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: ifeq 175
      // 153: goto 161
      // 156: ldc2_w 3158572336599069250
      // 159: lload 12
      // 15b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: aload 0
      // 162: getfield com/zelix/dm.P I
      // 165: bipush 1
      // 166: iadd
      // 167: istore 34
      // 169: iload 33
      // 16b: lload 12
      // 16d: lconst_0
      // 16e: lcmp
      // 16f: ifle 18f
      // 172: ifne 189
      // 175: aload 0
      // 176: goto 184
      // 179: ldc2_w 3158572336599069250
      // 17c: lload 12
      // 17e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: getfield com/zelix/dm.P I
      // 187: istore 34
      // 189: aload 0
      // 18a: getfield com/zelix/dm.s I
      // 18d: bipush 1
      // 18e: isub
      // 18f: istore 35
      // 191: iload 35
      // 193: iload 34
      // 195: if_icmplt 378
      // 198: aload 16
      // 19a: iload 35
      // 19c: aaload
      // 19d: lload 12
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: iflt 1d3
      // 1a4: iload 33
      // 1a6: ifeq 1d3
      // 1a9: lload 23
      // 1ab: invokevirtual com/zelix/_kz.n (J)Z
      // 1ae: iload 33
      // 1b0: ifeq 5cd
      // 1b3: goto 1c1
      // 1b6: ldc2_w 3158572336599069250
      // 1b9: lload 12
      // 1bb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: ifeq 370
      // 1c4: goto 1d2
      // 1c7: ldc2_w 3158572336599069250
      // 1ca: lload 12
      // 1cc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: aload 3
      // 1d3: aload 7
      // 1d5: aload 16
      // 1d7: iload 35
      // 1d9: aaload
      // 1da: aload 2
      // 1db: iload 14
      // 1dd: aload 15
      // 1df: ldc2_w 3570996632769362112
      // 1e2: lload 12
      // 1e4: invokedynamic h (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: iload 33
      // 1eb: ifeq 2ff
      // 1ee: ifne 28b
      // 1f1: goto 1ff
      // 1f4: ldc2_w 3158572336599069250
      // 1f7: lload 12
      // 1f9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: ldc2_w 3127804760246690398
      // 202: lload 12
      // 204: lload 12
      // 206: lconst_0
      // 207: lcmp
      // 208: iflt 25b
      // 20b: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: ifnonnull 256
      // 213: goto 221
      // 216: ldc2_w 3158572336599069250
      // 219: lload 12
      // 21b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: ldc2_w 3995687322771199320
      // 224: lload 12
      // 226: invokedynamic h (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: iload 33
      // 22d: ifeq 2ff
      // 230: goto 23e
      // 233: ldc2_w 3158572336599069250
      // 236: lload 12
      // 238: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: lload 12
      // 240: lconst_0
      // 241: lcmp
      // 242: iflt 2f1
      // 245: ifeq 28b
      // 248: goto 256
      // 24b: ldc2_w 3158572336599069250
      // 24e: lload 12
      // 250: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: ldc2_w 3933854648490332460
      // 259: lload 12
      // 25b: invokedynamic h (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: iload 33
      // 262: lload 12
      // 264: lconst_0
      // 265: lcmp
      // 266: iflt 301
      // 269: ifeq 2ff
      // 26c: goto 27a
      // 26f: ldc2_w 3158572336599069250
      // 272: lload 12
      // 274: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: athrow
      // 27a: ifeq 319
      // 27d: goto 28b
      // 280: ldc2_w 3158572336599069250
      // 283: lload 12
      // 285: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: athrow
      // 28b: aload 0
      // 28c: aload 7
      // 28e: bipush 0
      // 28f: anewarray 330
      // 292: ldc2_w 3557643689305913577
      // 295: lload 12
      // 297: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/we; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29c: checkcast com/zelix/pk
      // 29f: iload 17
      // 2a1: iload 18
      // 2a3: i2b
      // 2a4: iload 19
      // 2a6: bipush 3
      // 2a7: anewarray 330
      // 2aa: dup_x1
      // 2ab: swap
      // 2ac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2af: bipush 2
      // 2b0: swap
      // 2b1: aastore
      // 2b2: dup_x1
      // 2b3: swap
      // 2b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2b7: bipush 1
      // 2b8: swap
      // 2b9: aastore
      // 2ba: dup_x1
      // 2bb: swap
      // 2bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2bf: bipush 0
      // 2c0: swap
      // 2c1: aastore
      // 2c2: ldc2_w 3483892873885403753
      // 2c5: lload 12
      // 2c7: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: lload 27
      // 2ce: aload 6
      // 2d0: bipush 3
      // 2d1: anewarray 330
      // 2d4: dup_x1
      // 2d5: swap
      // 2d6: bipush 2
      // 2d7: swap
      // 2d8: aastore
      // 2d9: dup_x2
      // 2da: dup_x2
      // 2db: pop
      // 2dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2df: bipush 1
      // 2e0: swap
      // 2e1: aastore
      // 2e2: dup_x1
      // 2e3: swap
      // 2e4: bipush 0
      // 2e5: swap
      // 2e6: aastore
      // 2e7: ldc2_w 3805829429491294994
      // 2ea: lload 12
      // 2ec: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: goto 2ff
      // 2f4: ldc2_w 3158572336599069250
      // 2f7: lload 12
      // 2f9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fe: athrow
      // 2ff: iload 33
      // 301: ifeq 316
      // 304: ifne 319
      // 307: goto 315
      // 30a: ldc2_w 3158572336599069250
      // 30d: lload 12
      // 30f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: athrow
      // 315: bipush -1
      // 316: goto 31a
      // 319: bipush 1
      // 31a: iload 20
      // 31c: lload 21
      // 31e: invokevirtual com/zelix/_kz.J (Lcom/zelix/_fm;Lcom/zelix/_kz;Ljava/util/Set;ZLjava/lang/String;IIJ)Z
      // 321: lload 12
      // 323: lconst_0
      // 324: lcmp
      // 325: iflt 375
      // 328: ifeq 370
      // 32b: aload 3
      // 32c: lload 29
      // 32e: ldc2_w 3160531046318921701
      // 331: lload 12
      // 333: invokedynamic i (Ljava/lang/Object;JJJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: aload 16
      // 33a: iload 35
      // 33c: aaload
      // 33d: lload 29
      // 33f: ldc2_w 3160531046318921701
      // 342: lload 12
      // 344: invokedynamic i (Ljava/lang/Object;JJJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 349: if_acmpne 370
      // 34c: goto 35a
      // 34f: ldc2_w 3158572336599069250
      // 352: lload 12
      // 354: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 359: athrow
      // 35a: aload 10
      // 35c: lload 31
      // 35e: aload 0
      // 35f: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 362: iload 35
      // 364: ireturn
      // 365: ldc2_w 3158572336599069250
      // 368: lload 12
      // 36a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36f: athrow
      // 370: iinc 35 -1
      // 373: iload 33
      // 375: ifne 191
      // 378: lload 12
      // 37a: lconst_0
      // 37b: lcmp
      // 37c: ifle 198
      // 37f: aload 0
      // 380: iload 33
      // 382: lload 12
      // 384: lconst_0
      // 385: lcmp
      // 386: iflt 3b7
      // 389: ifeq 3ae
      // 38c: aload 4
      // 38e: if_acmpeq 5cc
      // 391: goto 39f
      // 394: ldc2_w 3158572336599069250
      // 397: lload 12
      // 399: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39e: athrow
      // 39f: aload 0
      // 3a0: goto 3ae
      // 3a3: ldc2_w 3158572336599069250
      // 3a6: lload 12
      // 3a8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: athrow
      // 3ae: lload 12
      // 3b0: lconst_0
      // 3b1: lcmp
      // 3b2: iflt 4e8
      // 3b5: iload 33
      // 3b7: ifeq 4e8
      // 3ba: getfield com/zelix/dm.H Ljava/util/List;
      // 3bd: ifnull 4e4
      // 3c0: goto 3ce
      // 3c3: ldc2_w 3158572336599069250
      // 3c6: lload 12
      // 3c8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cd: athrow
      // 3ce: aload 0
      // 3cf: getfield com/zelix/dm.H Ljava/util/List;
      // 3d2: invokeinterface java/util/List.size ()I 1
      // 3d7: istore 35
      // 3d9: bipush 0
      // 3da: istore 36
      // 3dc: iload 36
      // 3de: iload 35
      // 3e0: if_icmpge 4e4
      // 3e3: aload 0
      // 3e4: getfield com/zelix/dm.H Ljava/util/List;
      // 3e7: iload 36
      // 3e9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3ee: checkcast com/zelix/dm
      // 3f1: astore 37
      // 3f3: iload 33
      // 3f5: lload 12
      // 3f7: lconst_0
      // 3f8: lcmp
      // 3f9: ifle 408
      // 3fc: ifeq 4df
      // 3ff: aload 5
      // 401: aload 37
      // 403: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 408: iload 33
      // 40a: ifeq 5cd
      // 40d: goto 41b
      // 410: ldc2_w 3158572336599069250
      // 413: lload 12
      // 415: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: athrow
      // 41b: ifeq 4dc
      // 41e: goto 42c
      // 421: ldc2_w 3158572336599069250
      // 424: lload 12
      // 426: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42b: athrow
      // 42c: aload 37
      // 42e: aload 3
      // 42f: aload 2
      // 430: aload 16
      // 432: aload 5
      // 434: aload 8
      // 436: aload 4
      // 438: aload 9
      // 43a: aload 11
      // 43c: lload 25
      // 43e: aload 7
      // 440: aload 6
      // 442: aload 10
      // 444: iload 14
      // 446: aload 15
      // 448: bipush 14
      // 44a: anewarray 330
      // 44d: dup_x1
      // 44e: swap
      // 44f: bipush 13
      // 451: swap
      // 452: aastore
      // 453: dup_x1
      // 454: swap
      // 455: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 458: bipush 12
      // 45a: swap
      // 45b: aastore
      // 45c: dup_x1
      // 45d: swap
      // 45e: bipush 11
      // 460: swap
      // 461: aastore
      // 462: dup_x1
      // 463: swap
      // 464: bipush 10
      // 466: swap
      // 467: aastore
      // 468: dup_x1
      // 469: swap
      // 46a: bipush 9
      // 46c: swap
      // 46d: aastore
      // 46e: dup_x2
      // 46f: dup_x2
      // 470: pop
      // 471: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 474: bipush 8
      // 476: swap
      // 477: aastore
      // 478: dup_x1
      // 479: swap
      // 47a: bipush 7
      // 47c: swap
      // 47d: aastore
      // 47e: dup_x1
      // 47f: swap
      // 480: bipush 6
      // 482: swap
      // 483: aastore
      // 484: dup_x1
      // 485: swap
      // 486: bipush 5
      // 487: swap
      // 488: aastore
      // 489: dup_x1
      // 48a: swap
      // 48b: bipush 4
      // 48c: swap
      // 48d: aastore
      // 48e: dup_x1
      // 48f: swap
      // 490: bipush 3
      // 491: swap
      // 492: aastore
      // 493: dup_x1
      // 494: swap
      // 495: bipush 2
      // 496: swap
      // 497: aastore
      // 498: dup_x1
      // 499: swap
      // 49a: bipush 1
      // 49b: swap
      // 49c: aastore
      // 49d: dup_x1
      // 49e: swap
      // 49f: bipush 0
      // 4a0: swap
      // 4a1: aastore
      // 4a2: ldc2_w 3974063360290196458
      // 4a5: lload 12
      // 4a7: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ac: istore 38
      // 4ae: iload 33
      // 4b0: lload 12
      // 4b2: lconst_0
      // 4b3: lcmp
      // 4b4: iflt 4e1
      // 4b7: ifeq 4df
      // 4ba: iload 38
      // 4bc: bipush -1
      // 4bd: if_icmpeq 4dc
      // 4c0: goto 4ce
      // 4c3: ldc2_w 3158572336599069250
      // 4c6: lload 12
      // 4c8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cd: athrow
      // 4ce: iload 38
      // 4d0: ireturn
      // 4d1: ldc2_w 3158572336599069250
      // 4d4: lload 12
      // 4d6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4db: athrow
      // 4dc: iinc 36 1
      // 4df: iload 33
      // 4e1: ifne 3dc
      // 4e4: aload 0
      // 4e5: getfield com/zelix/dm.V Lcom/zelix/dm;
      // 4e8: ifnull 5cc
      // 4eb: aload 5
      // 4ed: aload 0
      // 4ee: getfield com/zelix/dm.V Lcom/zelix/dm;
      // 4f1: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 4f6: iload 33
      // 4f8: ifeq 5cd
      // 4fb: goto 509
      // 4fe: ldc2_w 3158572336599069250
      // 501: lload 12
      // 503: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 508: athrow
      // 509: ifeq 5cc
      // 50c: goto 51a
      // 50f: ldc2_w 3158572336599069250
      // 512: lload 12
      // 514: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 519: athrow
      // 51a: aload 0
      // 51b: getfield com/zelix/dm.V Lcom/zelix/dm;
      // 51e: aload 3
      // 51f: aload 2
      // 520: aload 16
      // 522: aload 5
      // 524: aload 8
      // 526: aload 4
      // 528: aload 9
      // 52a: aload 11
      // 52c: lload 25
      // 52e: aload 7
      // 530: aload 6
      // 532: aload 10
      // 534: iload 14
      // 536: aload 15
      // 538: bipush 14
      // 53a: anewarray 330
      // 53d: dup_x1
      // 53e: swap
      // 53f: bipush 13
      // 541: swap
      // 542: aastore
      // 543: dup_x1
      // 544: swap
      // 545: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 548: bipush 12
      // 54a: swap
      // 54b: aastore
      // 54c: dup_x1
      // 54d: swap
      // 54e: bipush 11
      // 550: swap
      // 551: aastore
      // 552: dup_x1
      // 553: swap
      // 554: bipush 10
      // 556: swap
      // 557: aastore
      // 558: dup_x1
      // 559: swap
      // 55a: bipush 9
      // 55c: swap
      // 55d: aastore
      // 55e: dup_x2
      // 55f: dup_x2
      // 560: pop
      // 561: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 564: bipush 8
      // 566: swap
      // 567: aastore
      // 568: dup_x1
      // 569: swap
      // 56a: bipush 7
      // 56c: swap
      // 56d: aastore
      // 56e: dup_x1
      // 56f: swap
      // 570: bipush 6
      // 572: swap
      // 573: aastore
      // 574: dup_x1
      // 575: swap
      // 576: bipush 5
      // 577: swap
      // 578: aastore
      // 579: dup_x1
      // 57a: swap
      // 57b: bipush 4
      // 57c: swap
      // 57d: aastore
      // 57e: dup_x1
      // 57f: swap
      // 580: bipush 3
      // 581: swap
      // 582: aastore
      // 583: dup_x1
      // 584: swap
      // 585: bipush 2
      // 586: swap
      // 587: aastore
      // 588: dup_x1
      // 589: swap
      // 58a: bipush 1
      // 58b: swap
      // 58c: aastore
      // 58d: dup_x1
      // 58e: swap
      // 58f: bipush 0
      // 590: swap
      // 591: aastore
      // 592: ldc2_w 3974063360290196458
      // 595: lload 12
      // 597: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59c: istore 35
      // 59e: iload 35
      // 5a0: iload 33
      // 5a2: lload 12
      // 5a4: lconst_0
      // 5a5: lcmp
      // 5a6: ifle 5ad
      // 5a9: ifeq 5cd
      // 5ac: bipush -1
      // 5ad: if_icmpeq 5cc
      // 5b0: goto 5be
      // 5b3: ldc2_w 3158572336599069250
      // 5b6: lload 12
      // 5b8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bd: athrow
      // 5be: iload 35
      // 5c0: ireturn
      // 5c1: ldc2_w 3158572336599069250
      // 5c4: lload 12
      // 5c6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: athrow
      // 5cc: bipush -1
      // 5cd: ireturn
   }

   void q(dm param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/dm.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w -30062090468912000
      // 09: lload 2
      // 0a: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: aload 0
      // 12: getfield com/zelix/dm.H Ljava/util/List;
      // 15: iload 4
      // 17: ifne 46
      // 1a: ifnonnull 42
      // 1d: goto 2a
      // 20: ldc2_w -280190591935896181
      // 23: lload 2
      // 24: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: new java/util/ArrayList
      // 2e: dup
      // 2f: invokespecial java/util/ArrayList.<init> ()V
      // 32: putfield com/zelix/dm.H Ljava/util/List;
      // 35: goto 42
      // 38: ldc2_w -280190591935896181
      // 3b: lload 2
      // 3c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/zelix/dm.H Ljava/util/List;
      // 46: aload 1
      // 47: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 4c: iload 4
      // 4e: ifne 78
      // 51: ifne 79
      // 54: goto 61
      // 57: ldc2_w -280190591935896181
      // 5a: lload 2
      // 5b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/zelix/dm.H Ljava/util/List;
      // 65: aload 1
      // 66: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6b: goto 78
      // 6e: ldc2_w -280190591935896181
      // 71: lload 2
      // 72: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: pop
      // 79: return
   }

   public dm T(Object[] param1) {
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
      // 0c: getstatic com/zelix/dm.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -1104532049972400439
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/dm.H Ljava/util/List;
      // 21: iload 4
      // 23: ifeq 47
      // 26: ifnull 7c
      // 29: goto 36
      // 2c: ldc2_w -1133921717566297644
      // 2f: lload 2
      // 30: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/dm.H Ljava/util/List;
      // 3a: goto 47
      // 3d: ldc2_w -1133921717566297644
      // 40: lload 2
      // 41: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: iload 4
      // 49: ifeq 78
      // 4c: invokeinterface java/util/List.size ()I 1
      // 51: ifle 7c
      // 54: goto 61
      // 57: ldc2_w -1133921717566297644
      // 5a: lload 2
      // 5b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/zelix/dm.H Ljava/util/List;
      // 65: bipush 0
      // 66: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6b: goto 78
      // 6e: ldc2_w -1133921717566297644
      // 71: lload 2
      // 72: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: checkcast com/zelix/dm
      // 7b: areturn
      // 7c: aconst_null
      // 7d: areturn
   }

   public boolean s(Object[] param1) {
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
      // 04: checkcast com/zelix/dm
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/dm.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -8650766543402144537
      // 1d: lload 2
      // 1e: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: aload 0
      // 26: getfield com/zelix/dm.H Ljava/util/List;
      // 29: iload 5
      // 2b: ifne 4f
      // 2e: ifnull 9a
      // 31: goto 3e
      // 34: ldc2_w -8900257190686073364
      // 37: lload 2
      // 38: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/dm.H Ljava/util/List;
      // 42: goto 4f
      // 45: ldc2_w -8900257190686073364
      // 48: lload 2
      // 49: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: lload 2
      // 50: lconst_0
      // 51: lcmp
      // 52: iflt 87
      // 55: iload 5
      // 57: ifne 87
      // 5a: invokeinterface java/util/List.size ()I 1
      // 5f: bipush 2
      // 60: if_icmpne 9a
      // 63: goto 70
      // 66: ldc2_w -8900257190686073364
      // 69: lload 2
      // 6a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 0
      // 71: getfield com/zelix/dm.H Ljava/util/List;
      // 74: bipush 0
      // 75: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7a: goto 87
      // 7d: ldc2_w -8900257190686073364
      // 80: lload 2
      // 81: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: aload 4
      // 89: if_acmpne 9a
      // 8c: bipush 1
      // 8d: goto 9b
      // 90: ldc2_w -8900257190686073364
      // 93: lload 2
      // 94: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: bipush 0
      // 9b: ireturn
   }

   dm c(short param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: lload 2
      // 06: bipush 16
      // 08: lshl
      // 09: bipush 16
      // 0b: lushr
      // 0c: lor
      // 0d: getstatic com/zelix/dm.a J
      // 10: lxor
      // 11: lstore 4
      // 13: ldc2_w 3984080169297960031
      // 16: lload 4
      // 18: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: istore 6
      // 1f: aload 0
      // 20: getfield com/zelix/dm.H Ljava/util/List;
      // 23: iload 6
      // 25: ifne 5b
      // 28: ifnull 5f
      // 2b: goto 39
      // 2e: ldc2_w 3802139083951238484
      // 31: lload 4
      // 33: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: aload 0
      // 3a: getfield com/zelix/dm.H Ljava/util/List;
      // 3d: aload 0
      // 3e: getfield com/zelix/dm.H Ljava/util/List;
      // 41: invokeinterface java/util/List.size ()I 1
      // 46: bipush 1
      // 47: isub
      // 48: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4d: goto 5b
      // 50: ldc2_w 3802139083951238484
      // 53: lload 4
      // 55: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: checkcast com/zelix/dm
      // 5e: areturn
      // 5f: aconst_null
      // 60: areturn
   }

   void c(Object[] param1) {
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
      // 0e: checkcast com/zelix/dm
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/dm.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -6249750769043553711
      // 1c: lload 3
      // 1d: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: aload 0
      // 25: ldc2_w -5267199357665952378
      // 28: lload 3
      // 29: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: iload 5
      // 30: ifne 6b
      // 33: ifnonnull 61
      // 36: goto 43
      // 39: ldc2_w -6139023814882004134
      // 3c: lload 3
      // 3d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 0
      // 44: new java/util/ArrayList
      // 47: dup
      // 48: invokespecial java/util/ArrayList.<init> ()V
      // 4b: ldc2_w -5267199357665952378
      // 4e: lload 3
      // 4f: invokedynamic r (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: goto 61
      // 57: ldc2_w -6139023814882004134
      // 5a: lload 3
      // 5b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: ldc2_w -5267199357665952378
      // 65: lload 3
      // 66: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: aload 2
      // 6c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 71: pop
      // 72: return
   }

   void T(int var1) {
      this.s = var1;
   }

   public List L(long var1) {
      var1 = a ^ var1;

      try {
         return this.H != null ? new ArrayList(this.H) : null;
      } catch (gj var3) {
         throw x44.a<"p">(var3, -4763480464322042765L, var1);
      }
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 93709929438493L;
      long var4 = var2 ^ 134270238310573L;
      return this.I((dm)var1, var4);
   }

   static {
      long var5 = a ^ 25963561211395L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[3];
      int var12 = 0;
      String var11 = "kxì:ç\u0001u\u001e\u0099\u009d\u0094á\u0095eð©ëå÷å\u0094aÀ5>ák\u001fÞÔI\u000e(Ùl Á\u0013X\u009eÔ¨:ß 6.þÕöÃ>Þðb^2§âÂúp\u008aí»\u0096ý\u0098G1\u0093Ä\u0013\u0018ÙXd\flÝ:LX~XMÒl\u0096³}ð\u0093Wî\u0015°n";
      int var13 = "kxì:ç\u0001u\u001e\u0099\u009d\u0094á\u0095eð©ëå÷å\u0094aÀ5>ák\u001fÞÔI\u000e(Ùl Á\u0013X\u009eÔ¨:ß 6.þÕöÃ>Þðb^2§âÂúp\u008aí»\u0096ý\u0098G1\u0093Ä\u0013\u0018ÙXd\flÝ:LX~XMÒl\u0096³}ð\u0093Wî\u0015°n"
         .length();
      char var10 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = b(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            c = var14;
            e = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -6055708488670845704L;
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
            i = var23;
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11765;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/dm", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/dm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
