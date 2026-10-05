package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _y4 implements _yh {
   private int g;
   private final boolean E;
   Map v;
   private final boolean W;
   private e3 p;
   private static final long a = ess.a(-3165091170777837787L, 4718877790173431790L, MethodHandles.lookup().lookupClass()).a(70771358247661L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public boolean p(Object[] param1) {
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
      // 04: checkcast java/lang/Object
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
      // 16: checkcast java/lang/Object
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w -4946216965972188577
      // 1e: lload 3
      // 1f: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/_y4.v Ljava/util/Map;
      // 28: aload 5
      // 2a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2f: checkcast java/util/List
      // 32: astore 7
      // 34: astore 6
      // 36: aload 7
      // 38: aload 6
      // 3a: lload 3
      // 3b: lconst_0
      // 3c: lcmp
      // 3d: ifle 62
      // 40: ifnonnull 61
      // 43: ifnonnull 5f
      // 46: goto 53
      // 49: ldc2_w -4870352693338538077
      // 4c: lload 3
      // 4d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: bipush 0
      // 54: ireturn
      // 55: ldc2_w -4870352693338538077
      // 58: lload 3
      // 59: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 7
      // 61: aload 2
      // 62: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 67: ireturn
   }

   public boolean n(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this.v, -5861875311302440582L, var2);
   }

   _y4(boolean param1, int param2, int param3, boolean param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_y4.a J
      // 03: lload 5
      // 05: lxor
      // 06: lstore 5
      // 08: lload 5
      // 0a: dup2
      // 0b: ldc2_w 96909910019400
      // 0e: lxor
      // 0f: lstore 7
      // 11: dup2
      // 12: ldc2_w 33023658804435
      // 15: lxor
      // 16: lstore 9
      // 18: pop2
      // 19: aload 0
      // 1a: invokespecial java/lang/Object.<init> ()V
      // 1d: ldc2_w -1210180509398534608
      // 20: lload 5
      // 22: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 0
      // 28: sipush 420
      // 2b: ldc2_w 3546747707200095250
      // 2e: lload 5
      // 30: lxor
      // 31: invokedynamic d (IJ)I bsm=com/zelix/_y4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: putfield com/zelix/_y4.g I
      // 39: aload 0
      // 3a: aconst_null
      // 3b: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 3e: aload 0
      // 3f: iload 3
      // 40: putfield com/zelix/_y4.g I
      // 43: aload 0
      // 44: iload 1
      // 45: putfield com/zelix/_y4.W Z
      // 48: aload 0
      // 49: iload 4
      // 4b: putfield com/zelix/_y4.E Z
      // 4e: iload 2
      // 4f: lload 9
      // 51: invokestatic com/zelix/sh.Q (IJ)I
      // 54: istore 12
      // 56: astore 11
      // 58: iload 4
      // 5a: aload 11
      // 5c: ifnonnull 9f
      // 5f: ifeq 90
      // 62: goto 70
      // 65: ldc2_w -1727663880480150580
      // 68: lload 5
      // 6a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 0
      // 71: new java/util/concurrent/ConcurrentHashMap
      // 74: dup
      // 75: iload 12
      // 77: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 7a: putfield com/zelix/_y4.v Ljava/util/Map;
      // 7d: aload 11
      // 7f: ifnull f7
      // 82: goto 90
      // 85: ldc2_w -1727663880480150580
      // 88: lload 5
      // 8a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: iload 1
      // 91: goto 9f
      // 94: ldc2_w -1727663880480150580
      // 97: lload 5
      // 99: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: ifeq c2
      // a2: aload 0
      // a3: new java/util/IdentityHashMap
      // a6: dup
      // a7: iload 12
      // a9: invokespecial java/util/IdentityHashMap.<init> (I)V
      // ac: putfield com/zelix/_y4.v Ljava/util/Map;
      // af: aload 11
      // b1: ifnull f7
      // b4: goto c2
      // b7: ldc2_w -1727663880480150580
      // ba: lload 5
      // bc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: aload 0
      // c3: iload 12
      // c5: lload 7
      // c7: bipush 2
      // c8: anewarray 83
      // cb: dup_x2
      // cc: dup_x2
      // cd: pop
      // ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d1: bipush 1
      // d2: swap
      // d3: aastore
      // d4: dup_x1
      // d5: swap
      // d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d9: bipush 0
      // da: swap
      // db: aastore
      // dc: ldc2_w -915411577351899912
      // df: lload 5
      // e1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e6: putfield com/zelix/_y4.v Ljava/util/Map;
      // e9: goto f7
      // ec: ldc2_w -1727663880480150580
      // ef: lload 5
      // f1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f6: athrow
      // f7: return
   }

   private void l(Object param1, long param2, Collection param4, char param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: bipush 16
      // 003: lshl
      // 004: iload 5
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 48
      // 00c: lushr
      // 00d: lor
      // 00e: getstatic com/zelix/_y4.a J
      // 011: lxor
      // 012: lstore 7
      // 014: lload 7
      // 016: dup2
      // 017: ldc2_w 114742017717941
      // 01a: lxor
      // 01b: lstore 9
      // 01d: pop2
      // 01e: ldc2_w 4437450706479686800
      // 021: lload 7
      // 023: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: astore 11
      // 02a: aload 0
      // 02b: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 02e: aload 11
      // 030: ifnonnull 085
      // 033: ifnull 07b
      // 036: goto 044
      // 039: ldc2_w 4226192910581823852
      // 03c: lload 7
      // 03e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: athrow
      // 044: aload 0
      // 045: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 048: lload 9
      // 04a: dup2_x1
      // 04b: pop2
      // 04c: bipush 2
      // 04d: anewarray 83
      // 050: dup_x1
      // 051: swap
      // 052: bipush 1
      // 053: swap
      // 054: aastore
      // 055: dup_x2
      // 056: dup_x2
      // 057: pop
      // 058: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05b: bipush 0
      // 05c: swap
      // 05d: aastore
      // 05e: ldc2_w 2640896247669248508
      // 061: lload 7
      // 063: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 0
      // 069: aconst_null
      // 06a: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 06d: goto 07b
      // 070: ldc2_w 4226192910581823852
      // 073: lload 7
      // 075: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 0
      // 07c: getfield com/zelix/_y4.v Ljava/util/Map;
      // 07f: aload 1
      // 080: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 085: checkcast java/util/List
      // 088: astore 12
      // 08a: iload 5
      // 08c: iflt 0ef
      // 08f: aload 12
      // 091: ifnonnull 0ef
      // 094: aload 0
      // 095: getfield com/zelix/_y4.E Z
      // 098: ifeq 0cb
      // 09b: goto 0a9
      // 09e: ldc2_w 4226192910581823852
      // 0a1: lload 7
      // 0a3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: new java/util/Vector
      // 0ac: dup
      // 0ad: aload 0
      // 0ae: getfield com/zelix/_y4.g I
      // 0b1: aload 4
      // 0b3: invokeinterface java/util/Collection.size ()I 1
      // 0b8: invokestatic java/lang/Math.max (II)I
      // 0bb: invokespecial java/util/Vector.<init> (I)V
      // 0be: astore 12
      // 0c0: aload 11
      // 0c2: lload 2
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: iflt 0ee
      // 0c8: ifnull 0e2
      // 0cb: new java/util/ArrayList
      // 0ce: dup
      // 0cf: aload 0
      // 0d0: getfield com/zelix/_y4.g I
      // 0d3: aload 4
      // 0d5: invokeinterface java/util/Collection.size ()I 1
      // 0da: invokestatic java/lang/Math.max (II)I
      // 0dd: invokespecial java/util/ArrayList.<init> (I)V
      // 0e0: astore 12
      // 0e2: aload 0
      // 0e3: getfield com/zelix/_y4.v Ljava/util/Map;
      // 0e6: aload 1
      // 0e7: aload 12
      // 0e9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ee: pop
      // 0ef: iload 6
      // 0f1: aload 11
      // 0f3: ifnonnull 141
      // 0f6: ifeq 12a
      // 0f9: goto 107
      // 0fc: ldc2_w 4226192910581823852
      // 0ff: lload 7
      // 101: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 12
      // 109: bipush 0
      // 10a: aload 4
      // 10c: ldc2_w 2485977506556313629
      // 10f: lload 7
      // 111: invokedynamic m (Ljava/lang/Object;ILjava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: pop
      // 117: aload 11
      // 119: ifnull 142
      // 11c: goto 12a
      // 11f: ldc2_w 4226192910581823852
      // 122: lload 7
      // 124: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: aload 12
      // 12c: aload 4
      // 12e: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 133: goto 141
      // 136: ldc2_w 4226192910581823852
      // 139: lload 7
      // 13b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: pop
      // 142: return
   }

   public void v(long var1, Object var3, Collection var4) {
      var1 = a ^ var1;
      long var5 = (var1 ^ 7301202124245L) >>> 16;
      int var7 = (int)((var1 ^ 7301202124245L) << 48 >>> 48);
      this.l(var3, var5, var4, (char)var7, false);
   }

   public boolean I(Object[] param1) {
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
      // 00e: checkcast java/lang/Object
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Object
      // 019: astore 4
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 87243903266311
      // 021: lxor
      // 022: lstore 6
      // 024: pop2
      // 025: ldc2_w 2677067728500505634
      // 028: lload 2
      // 029: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: astore 8
      // 030: aload 0
      // 031: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 034: aload 8
      // 036: ifnonnull 089
      // 039: ifnull 07e
      // 03c: goto 049
      // 03f: ldc2_w 2455679016072962526
      // 042: lload 2
      // 043: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: athrow
      // 049: aload 0
      // 04a: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 04d: lload 6
      // 04f: dup2_x1
      // 050: pop2
      // 051: bipush 2
      // 052: anewarray 83
      // 055: dup_x1
      // 056: swap
      // 057: bipush 1
      // 058: swap
      // 059: aastore
      // 05a: dup_x2
      // 05b: dup_x2
      // 05c: pop
      // 05d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 060: bipush 0
      // 061: swap
      // 062: aastore
      // 063: ldc2_w 4329223849155807566
      // 066: lload 2
      // 067: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 0
      // 06d: aconst_null
      // 06e: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 071: goto 07e
      // 074: ldc2_w 2455679016072962526
      // 077: lload 2
      // 078: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield com/zelix/_y4.v Ljava/util/Map;
      // 082: aload 5
      // 084: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 089: checkcast java/util/List
      // 08c: astore 9
      // 08e: aload 9
      // 090: ifnonnull 09f
      // 093: bipush 0
      // 094: ireturn
      // 095: ldc2_w 2455679016072962526
      // 098: lload 2
      // 099: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: bipush 0
      // 0a0: istore 10
      // 0a2: aload 9
      // 0a4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a9: astore 11
      // 0ab: aload 11
      // 0ad: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b2: ifeq 0fd
      // 0b5: aload 11
      // 0b7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bc: aload 4
      // 0be: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0c1: aload 8
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 10c
      // 0c9: ifnonnull 10a
      // 0cc: aload 8
      // 0ce: ifnonnull 0f6
      // 0d1: goto 0de
      // 0d4: ldc2_w 2455679016072962526
      // 0d7: lload 2
      // 0d8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: ifeq 0ab
      // 0e1: goto 0ee
      // 0e4: ldc2_w 2455679016072962526
      // 0e7: lload 2
      // 0e8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 11
      // 0f0: invokeinterface java/util/Iterator.remove ()V 1
      // 0f5: bipush 1
      // 0f6: istore 10
      // 0f8: aload 8
      // 0fa: ifnull 0ab
      // 0fd: aload 9
      // 0ff: lload 2
      // 100: lconst_0
      // 101: lcmp
      // 102: ifle 0bc
      // 105: invokeinterface java/util/List.size ()I 1
      // 10a: aload 8
      // 10c: ifnonnull 13a
      // 10f: ifne 138
      // 112: goto 11f
      // 115: ldc2_w 2455679016072962526
      // 118: lload 2
      // 119: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield com/zelix/_y4.v Ljava/util/Map;
      // 123: aload 5
      // 125: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 12a: pop
      // 12b: goto 138
      // 12e: ldc2_w 2455679016072962526
      // 131: lload 2
      // 132: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: iload 10
      // 13a: ireturn
   }

   public _y4(int var1, boolean var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 7954356588471L;
      this(false, var1, 5, var2, var5);
   }

   public Set U(int var1, short var2, short var3) {
      return this.v.entrySet();
   }

   public void L(Object[] param1) {
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
      // 0e: ldc2_w 96246265267701
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 1068692567253587920
      // 18: lload 2
      // 19: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: getfield com/zelix/_y4.v Ljava/util/Map;
      // 22: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 27: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 2c: astore 7
      // 2e: astore 6
      // 30: aload 7
      // 32: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 37: ifeq 70
      // 3a: aload 7
      // 3c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41: checkcast java/util/List
      // 44: astore 8
      // 46: aload 8
      // 48: invokeinterface java/util/List.clear ()V 1
      // 4d: lload 2
      // 4e: lconst_0
      // 4f: lcmp
      // 50: ifle 79
      // 53: aload 6
      // 55: ifnonnull 79
      // 58: aload 6
      // 5a: ifnull 30
      // 5d: lload 2
      // 5e: lconst_0
      // 5f: lcmp
      // 60: iflt 4d
      // 63: goto 70
      // 66: ldc2_w 713341007617837612
      // 69: lload 2
      // 6a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 0
      // 71: getfield com/zelix/_y4.v Ljava/util/Map;
      // 74: invokeinterface java/util/Map.clear ()V 1
      // 79: aload 0
      // 7a: lload 2
      // 7b: lconst_0
      // 7c: lcmp
      // 7d: iflt c9
      // 80: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 83: aload 6
      // 85: ifnonnull a9
      // 88: ifnull cd
      // 8b: goto 98
      // 8e: ldc2_w 713341007617837612
      // 91: lload 2
      // 92: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: aload 0
      // 99: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 9c: goto a9
      // 9f: ldc2_w 713341007617837612
      // a2: lload 2
      // a3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: athrow
      // a9: lload 4
      // ab: dup2_x1
      // ac: pop2
      // ad: bipush 2
      // ae: anewarray 83
      // b1: dup_x1
      // b2: swap
      // b3: bipush 1
      // b4: swap
      // b5: aastore
      // b6: dup_x2
      // b7: dup_x2
      // b8: pop
      // b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bc: bipush 0
      // bd: swap
      // be: aastore
      // bf: ldc2_w 1722177119829353148
      // c2: lload 2
      // c3: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: aload 0
      // c9: aconst_null
      // ca: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // cd: return
   }

   public void G(Object param1, Object param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 3
      // 01: dup2
      // 02: ldc2_w 69132101632708
      // 05: lxor
      // 06: lstore 5
      // 08: pop2
      // 09: ldc2_w -8510207546610446111
      // 0c: lload 3
      // 0d: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: astore 7
      // 14: aload 0
      // 15: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 18: aload 7
      // 1a: ifnonnull 6c
      // 1d: ifnull 62
      // 20: goto 2d
      // 23: ldc2_w -8154010439732671203
      // 26: lload 3
      // 27: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 31: lload 5
      // 33: dup2_x1
      // 34: pop2
      // 35: bipush 2
      // 36: anewarray 83
      // 39: dup_x1
      // 3a: swap
      // 3b: bipush 1
      // 3c: swap
      // 3d: aastore
      // 3e: dup_x2
      // 3f: dup_x2
      // 40: pop
      // 41: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 44: bipush 0
      // 45: swap
      // 46: aastore
      // 47: ldc2_w -8009916239674317427
      // 4a: lload 3
      // 4b: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: aload 0
      // 51: aconst_null
      // 52: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 55: goto 62
      // 58: ldc2_w -8154010439732671203
      // 5b: lload 3
      // 5c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: getfield com/zelix/_y4.v Ljava/util/Map;
      // 66: aload 1
      // 67: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6c: checkcast java/util/List
      // 6f: astore 8
      // 71: aload 8
      // 73: aload 7
      // 75: lload 3
      // 76: lconst_0
      // 77: lcmp
      // 78: iflt d7
      // 7b: ifnonnull d6
      // 7e: ifnonnull d4
      // 81: goto 8e
      // 84: ldc2_w -8154010439732671203
      // 87: lload 3
      // 88: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield com/zelix/_y4.E Z
      // 92: ifeq ba
      // 95: goto a2
      // 98: ldc2_w -8154010439732671203
      // 9b: lload 3
      // 9c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: athrow
      // a2: new java/util/Vector
      // a5: dup
      // a6: aload 0
      // a7: getfield com/zelix/_y4.g I
      // aa: invokespecial java/util/Vector.<init> (I)V
      // ad: astore 8
      // af: aload 7
      // b1: lload 3
      // b2: lconst_0
      // b3: lcmp
      // b4: iflt d3
      // b7: ifnull c7
      // ba: new java/util/ArrayList
      // bd: dup
      // be: aload 0
      // bf: getfield com/zelix/_y4.g I
      // c2: invokespecial java/util/ArrayList.<init> (I)V
      // c5: astore 8
      // c7: aload 0
      // c8: getfield com/zelix/_y4.v Ljava/util/Map;
      // cb: aload 1
      // cc: aload 8
      // ce: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // d3: pop
      // d4: aload 8
      // d6: aload 2
      // d7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // dc: pop
      // dd: return
   }

   public _y4(long var1, int var3, int var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 54929100175220L;
      this(false, var3, var4, false, var5);
   }

   public boolean o(Object[] var1) {
      return this.E;
   }

   public void b(Object[] var1) {
      long var4 = (Long)var1[0];
      Object var3 = var1[1];
      Collection var2 = (Collection)var1[2];
      var4 = a ^ var4;
      long var6 = (var4 ^ 15192899396483L) >>> 16;
      int var8 = (int)((var4 ^ 15192899396483L) << 48 >>> 48);
      this.l(var3, var6, var2, (char)var8, true);
   }

   public List M(Object var1, long var2) {
      return (List)this.v.get(var1);
   }

   public int d(Object[] var1) {
      long var2 = (Long)var1[0];
      String var10000 = x44.a<"u">(-3592546026751666400L, var2);
      int var5 = 0;
      Iterator var6 = this.v.values().iterator();
      String var4 = var10000;

      while (true) {
         if (var6.hasNext()) {
            List var7 = (List)var6.next();
            if (var2 >= 0L) {
               var8 = var5 + var7.size();
               if (var4 != null) {
                  break;
               }

               var5 = var8;
            }

            if (var4 == null) {
               continue;
            }
         }

         var8 = var5;
         break;
      }

      return var8;
   }

   public _y4(long var1, boolean var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 68733835422699L;
      this(false, a<"d">(27210, 1285241351459311537L ^ var1), 5, var3, var4);
   }

   public _y4(boolean var1, long var2, int var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 8432345967219L;
      this(var1, var4, 5, false, var5);
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/_y4.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w 8320063661577235058
      // 015: lload 2
      // 016: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: aload 0
      // 01c: getfield com/zelix/_y4.v Ljava/util/Map;
      // 01f: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 024: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 029: astore 5
      // 02b: astore 4
      // 02d: aload 5
      // 02f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 034: ifeq 131
      // 037: aload 5
      // 039: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03e: checkcast java/util/List
      // 041: astore 6
      // 043: aload 6
      // 045: instanceof java/util/Vector
      // 048: lload 2
      // 049: lconst_0
      // 04a: lcmp
      // 04b: iflt 0ad
      // 04e: aload 4
      // 050: ifnonnull 0ad
      // 053: ifeq 089
      // 056: goto 063
      // 059: ldc2_w 8377896206331131790
      // 05c: lload 2
      // 05d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: aload 6
      // 065: checkcast java/util/Vector
      // 068: ldc2_w 8040053238965930165
      // 06b: lload 2
      // 06c: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: aload 4
      // 073: lload 2
      // 074: lconst_0
      // 075: lcmp
      // 076: ifle 12e
      // 079: ifnull 12c
      // 07c: goto 089
      // 07f: ldc2_w 8377896206331131790
      // 082: lload 2
      // 083: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 6
      // 08b: aload 4
      // 08d: ifnonnull 0d2
      // 090: goto 09d
      // 093: ldc2_w 8377896206331131790
      // 096: lload 2
      // 097: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: instanceof java/util/ArrayList
      // 0a0: goto 0ad
      // 0a3: ldc2_w 8377896206331131790
      // 0a6: lload 2
      // 0a7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: ifeq 0d0
      // 0b0: aload 6
      // 0b2: checkcast java/util/ArrayList
      // 0b5: invokevirtual java/util/ArrayList.trimToSize ()V
      // 0b8: aload 4
      // 0ba: lload 2
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: ifle 12e
      // 0c0: ifnull 12c
      // 0c3: goto 0d0
      // 0c6: ldc2_w 8377896206331131790
      // 0c9: lload 2
      // 0ca: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 6
      // 0d2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d5: astore 7
      // 0d7: aload 7
      // 0d9: getstatic com/zelix/_y4.b Ljava/lang/String;
      // 0dc: bipush 0
      // 0dd: anewarray 122
      // 0e0: swap
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: dup2_x1
      // 0e4: invokestatic com/zelix/u99.b (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
      // 0e7: swap
      // 0e8: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 0eb: astore 8
      // 0ed: aload 8
      // 0ef: aload 4
      // 0f1: ifnonnull 11c
      // 0f4: ifnull 11d
      // 0f7: goto 104
      // 0fa: ldc2_w 8377896206331131790
      // 0fd: lload 2
      // 0fe: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 8
      // 106: aload 6
      // 108: bipush 0
      // 109: anewarray 83
      // 10c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 10f: goto 11c
      // 112: ldc2_w 8377896206331131790
      // 115: lload 2
      // 116: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: pop
      // 11d: goto 12c
      // 120: astore 7
      // 122: goto 12c
      // 125: astore 7
      // 127: goto 12c
      // 12a: astore 7
      // 12c: aload 4
      // 12e: ifnull 02d
      // 131: return
   }

   public List t(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/List
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: getstatic com/zelix/_y4.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 110503380476870
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: ldc2_w -6275782350956744221
      // 2e: lload 2
      // 2f: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: astore 8
      // 36: aload 0
      // 37: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 3a: aload 8
      // 3c: ifnonnull 91
      // 3f: ifnull 84
      // 42: goto 4f
      // 45: ldc2_w -5776578093157618657
      // 48: lload 2
      // 49: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 53: lload 6
      // 55: dup2_x1
      // 56: pop2
      // 57: bipush 2
      // 58: anewarray 83
      // 5b: dup_x1
      // 5c: swap
      // 5d: bipush 1
      // 5e: swap
      // 5f: aastore
      // 60: dup_x2
      // 61: dup_x2
      // 62: pop
      // 63: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66: bipush 0
      // 67: swap
      // 68: aastore
      // 69: ldc2_w -5632501206099868529
      // 6c: lload 2
      // 6d: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: aload 0
      // 73: aconst_null
      // 74: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 77: goto 84
      // 7a: ldc2_w -5776578093157618657
      // 7d: lload 2
      // 7e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: aload 0
      // 85: getfield com/zelix/_y4.v Ljava/util/Map;
      // 88: aload 4
      // 8a: aload 5
      // 8c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 91: checkcast java/util/List
      // 94: areturn
   }

   public List P(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 11657989169393
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: ldc2_w 7768884355916526292
      // 1f: lload 3
      // 20: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 7
      // 27: aload 0
      // 28: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 2b: aload 7
      // 2d: ifnonnull 7f
      // 30: ifnull 75
      // 33: goto 40
      // 36: ldc2_w 7845858577821052712
      // 39: lload 3
      // 3a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 44: lload 5
      // 46: dup2_x1
      // 47: pop2
      // 48: bipush 2
      // 49: anewarray 83
      // 4c: dup_x1
      // 4d: swap
      // 4e: bipush 1
      // 4f: swap
      // 50: aastore
      // 51: dup_x2
      // 52: dup_x2
      // 53: pop
      // 54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: ldc2_w 8278244915658721208
      // 5d: lload 3
      // 5e: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: aload 0
      // 64: aconst_null
      // 65: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 68: goto 75
      // 6b: ldc2_w 7845858577821052712
      // 6e: lload 3
      // 6f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 0
      // 76: getfield com/zelix/_y4.v Ljava/util/Map;
      // 79: aload 2
      // 7a: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7f: checkcast java/util/List
      // 82: areturn
   }

   public boolean c(int var1, short var2, char var3, Object var4) {
      return this.v.containsKey(var4);
   }

   public _y4(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 36594697712450L;
      this(false, var3, 5, false, var4);
   }

   public void K(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/_y4
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/_y4.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 17132319264074
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w 462632882066562927
      // 025: lload 3
      // 026: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 7
      // 02d: aload 0
      // 02e: aload 7
      // 030: ifnonnull 07c
      // 033: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 036: ifnull 07b
      // 039: goto 046
      // 03c: ldc2_w 97130582512353939
      // 03f: lload 3
      // 040: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: aload 0
      // 047: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 04a: lload 5
      // 04c: dup2_x1
      // 04d: pop2
      // 04e: bipush 2
      // 04f: anewarray 83
      // 052: dup_x1
      // 053: swap
      // 054: bipush 1
      // 055: swap
      // 056: aastore
      // 057: dup_x2
      // 058: dup_x2
      // 059: pop
      // 05a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: ldc2_w 2258905865833015811
      // 063: lload 3
      // 064: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: aload 0
      // 06a: aconst_null
      // 06b: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 06e: goto 07b
      // 071: ldc2_w 97130582512353939
      // 074: lload 3
      // 075: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 2
      // 07c: getfield com/zelix/_y4.v Ljava/util/Map;
      // 07f: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 084: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 089: astore 8
      // 08b: aload 8
      // 08d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 092: ifeq 147
      // 095: aload 8
      // 097: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09c: checkcast java/util/Map$Entry
      // 09f: astore 9
      // 0a1: aload 9
      // 0a3: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0a8: astore 10
      // 0aa: aload 9
      // 0ac: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0b1: checkcast java/util/List
      // 0b4: astore 11
      // 0b6: aload 0
      // 0b7: getfield com/zelix/_y4.v Ljava/util/Map;
      // 0ba: aload 10
      // 0bc: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c1: checkcast java/util/List
      // 0c4: astore 12
      // 0c6: aload 12
      // 0c8: aload 7
      // 0ca: ifnonnull 13a
      // 0cd: ifnonnull 12b
      // 0d0: goto 0dd
      // 0d3: ldc2_w 97130582512353939
      // 0d6: lload 3
      // 0d7: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield com/zelix/_y4.E Z
      // 0e1: ifeq 107
      // 0e4: goto 0f1
      // 0e7: ldc2_w 97130582512353939
      // 0ea: lload 3
      // 0eb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: new java/util/Vector
      // 0f4: dup
      // 0f5: aload 11
      // 0f7: invokespecial java/util/Vector.<init> (Ljava/util/Collection;)V
      // 0fa: astore 13
      // 0fc: aload 7
      // 0fe: lload 3
      // 0ff: lconst_0
      // 100: lcmp
      // 101: iflt 122
      // 104: ifnull 112
      // 107: new java/util/ArrayList
      // 10a: dup
      // 10b: aload 11
      // 10d: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 110: astore 13
      // 112: aload 0
      // 113: getfield com/zelix/_y4.v Ljava/util/Map;
      // 116: aload 10
      // 118: aload 13
      // 11a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 11f: pop
      // 120: aload 7
      // 122: lload 3
      // 123: lconst_0
      // 124: lcmp
      // 125: iflt 144
      // 128: ifnull 142
      // 12b: aload 12
      // 12d: goto 13a
      // 130: ldc2_w 97130582512353939
      // 133: lload 3
      // 134: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 11
      // 13c: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 141: pop
      // 142: aload 7
      // 144: ifnull 08b
      // 147: return
   }

   public int L(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.v.size();
   }

   public _y4(_y4 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_y4.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 94779227780912
      // 00b: lxor
      // 00c: lstore 4
      // 00e: dup2
      // 00f: ldc2_w 17699317284523
      // 012: lxor
      // 013: lstore 6
      // 015: pop2
      // 016: aload 0
      // 017: invokespecial java/lang/Object.<init> ()V
      // 01a: aload 0
      // 01b: sipush 15835
      // 01e: ldc2_w 223190983732183575
      // 021: lload 2
      // 022: lxor
      // 023: invokedynamic d (IJ)I bsm=com/zelix/_y4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: putfield com/zelix/_y4.g I
      // 02b: ldc2_w -3076911628436517816
      // 02e: lload 2
      // 02f: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: aload 0
      // 035: aconst_null
      // 036: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 039: astore 8
      // 03b: aload 0
      // 03c: aload 1
      // 03d: getfield com/zelix/_y4.E Z
      // 040: putfield com/zelix/_y4.E Z
      // 043: aload 0
      // 044: aload 1
      // 045: ldc2_w -2987604656697506056
      // 048: lload 2
      // 049: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: putfield com/zelix/_y4.W Z
      // 051: aload 0
      // 052: aload 1
      // 053: getfield com/zelix/_y4.g I
      // 056: putfield com/zelix/_y4.g I
      // 059: aload 1
      // 05a: getfield com/zelix/_y4.v Ljava/util/Map;
      // 05d: invokeinterface java/util/Map.size ()I 1
      // 062: lload 6
      // 064: invokestatic com/zelix/sh.Q (IJ)I
      // 067: istore 9
      // 069: aload 0
      // 06a: getfield com/zelix/_y4.E Z
      // 06d: aload 8
      // 06f: ifnonnull 0d0
      // 072: ifeq 0a7
      // 075: goto 082
      // 078: ldc2_w -3279160618006736460
      // 07b: lload 2
      // 07c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: aload 0
      // 083: lload 2
      // 084: lconst_0
      // 085: lcmp
      // 086: iflt 12c
      // 089: new java/util/concurrent/ConcurrentHashMap
      // 08c: dup
      // 08d: iload 9
      // 08f: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 092: putfield com/zelix/_y4.v Ljava/util/Map;
      // 095: aload 8
      // 097: ifnull 12b
      // 09a: goto 0a7
      // 09d: ldc2_w -3279160618006736460
      // 0a0: lload 2
      // 0a1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: aload 8
      // 0aa: ifnonnull 106
      // 0ad: goto 0ba
      // 0b0: ldc2_w -3279160618006736460
      // 0b3: lload 2
      // 0b4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: ldc2_w -2987604656697506056
      // 0bd: lload 2
      // 0be: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: goto 0d0
      // 0c6: ldc2_w -3279160618006736460
      // 0c9: lload 2
      // 0ca: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: ifeq 0f8
      // 0d3: aload 0
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: ifle 12c
      // 0da: new java/util/IdentityHashMap
      // 0dd: dup
      // 0de: iload 9
      // 0e0: invokespecial java/util/IdentityHashMap.<init> (I)V
      // 0e3: putfield com/zelix/_y4.v Ljava/util/Map;
      // 0e6: aload 8
      // 0e8: ifnull 12b
      // 0eb: goto 0f8
      // 0ee: ldc2_w -3279160618006736460
      // 0f1: lload 2
      // 0f2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: goto 106
      // 0fc: ldc2_w -3279160618006736460
      // 0ff: lload 2
      // 100: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: iload 9
      // 108: lload 4
      // 10a: bipush 2
      // 10b: anewarray 83
      // 10e: dup_x2
      // 10f: dup_x2
      // 110: pop
      // 111: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 114: bipush 1
      // 115: swap
      // 116: aastore
      // 117: dup_x1
      // 118: swap
      // 119: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w -3948601251203133824
      // 122: lload 2
      // 123: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: putfield com/zelix/_y4.v Ljava/util/Map;
      // 12b: aload 1
      // 12c: getfield com/zelix/_y4.v Ljava/util/Map;
      // 12f: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 134: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 139: astore 10
      // 13b: aload 10
      // 13d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 142: ifeq 1a5
      // 145: aload 10
      // 147: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14c: checkcast java/util/Map$Entry
      // 14f: astore 11
      // 151: aload 11
      // 153: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 158: checkcast java/util/List
      // 15b: astore 13
      // 15d: aload 0
      // 15e: getfield com/zelix/_y4.E Z
      // 161: ifeq 182
      // 164: new java/util/Vector
      // 167: dup
      // 168: aload 11
      // 16a: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 16f: checkcast java/util/Collection
      // 172: invokespecial java/util/Vector.<init> (Ljava/util/Collection;)V
      // 175: astore 12
      // 177: aload 8
      // 179: lload 2
      // 17a: lconst_0
      // 17b: lcmp
      // 17c: ifle 1a2
      // 17f: ifnull 18d
      // 182: new java/util/ArrayList
      // 185: dup
      // 186: aload 13
      // 188: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 18b: astore 12
      // 18d: aload 0
      // 18e: getfield com/zelix/_y4.v Ljava/util/Map;
      // 191: aload 11
      // 193: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 198: aload 12
      // 19a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 19f: pop
      // 1a0: aload 8
      // 1a2: ifnull 13b
      // 1a5: return
   }

   public Set z(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.v.keySet();
   }

   public synchronized Enumeration Y(Object[] var1) {
      long var2 = (Long)var1[0];
      return Collections.enumeration(this.v.keySet());
   }

   public _y4(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 117320515826007L;
      this(false, a<"d">(366, 1795803794679922219L ^ var1), 5, false, var3);
   }

   public Enumeration e(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 73656711965867
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 140203575881416
      // 018: lxor
      // 019: lstore 6
      // 01b: pop2
      // 01c: ldc2_w 8196235497720015034
      // 01f: lload 2
      // 020: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: astore 8
      // 027: aload 0
      // 028: aload 8
      // 02a: ifnonnull 0cc
      // 02d: getfield com/zelix/_y4.E Z
      // 030: ifeq 0be
      // 033: goto 040
      // 036: ldc2_w 8542318204180739398
      // 039: lload 2
      // 03a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: athrow
      // 040: aload 0
      // 041: getfield com/zelix/_y4.v Ljava/util/Map;
      // 044: dup
      // 045: astore 9
      // 047: monitorenter
      // 048: aload 0
      // 049: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 04c: aload 8
      // 04e: ifnonnull 08c
      // 051: ifnonnull 07b
      // 054: aload 0
      // 055: new com/zelix/e3
      // 058: dup
      // 059: aload 0
      // 05a: aconst_null
      // 05b: lload 6
      // 05d: invokespecial com/zelix/e3.<init> (Lcom/zelix/_y4;Lcom/zelix/_fi;J)V
      // 060: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 063: lload 2
      // 064: lconst_0
      // 065: lcmp
      // 066: iflt 0ae
      // 069: aload 8
      // 06b: ifnull 0ab
      // 06e: goto 07b
      // 071: ldc2_w 8542318204180739398
      // 074: lload 2
      // 075: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 0
      // 07c: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 07f: goto 08c
      // 082: ldc2_w 8542318204180739398
      // 085: lload 2
      // 086: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: lload 4
      // 08e: dup2_x1
      // 08f: pop2
      // 090: bipush 2
      // 091: anewarray 83
      // 094: dup_x1
      // 095: swap
      // 096: bipush 1
      // 097: swap
      // 098: aastore
      // 099: dup_x2
      // 09a: dup_x2
      // 09b: pop
      // 09c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: ldc2_w 8191712423299811719
      // 0a5: lload 2
      // 0a6: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 9
      // 0ad: monitorexit
      // 0ae: goto 0b9
      // 0b1: astore 10
      // 0b3: aload 9
      // 0b5: monitorexit
      // 0b6: aload 10
      // 0b8: athrow
      // 0b9: aload 8
      // 0bb: ifnull 13b
      // 0be: aload 0
      // 0bf: goto 0cc
      // 0c2: ldc2_w 8542318204180739398
      // 0c5: lload 2
      // 0c6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 0cf: aload 8
      // 0d1: ifnonnull 11c
      // 0d4: ifnonnull 10b
      // 0d7: goto 0e4
      // 0da: ldc2_w 8542318204180739398
      // 0dd: lload 2
      // 0de: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: lload 2
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: iflt 13c
      // 0eb: new com/zelix/e3
      // 0ee: dup
      // 0ef: aload 0
      // 0f0: aconst_null
      // 0f1: lload 6
      // 0f3: invokespecial com/zelix/e3.<init> (Lcom/zelix/_y4;Lcom/zelix/_fi;J)V
      // 0f6: putfield com/zelix/_y4.p Lcom/zelix/e3;
      // 0f9: aload 8
      // 0fb: ifnull 13b
      // 0fe: goto 10b
      // 101: ldc2_w 8542318204180739398
      // 104: lload 2
      // 105: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 10f: goto 11c
      // 112: ldc2_w 8542318204180739398
      // 115: lload 2
      // 116: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: lload 4
      // 11e: dup2_x1
      // 11f: pop2
      // 120: bipush 2
      // 121: anewarray 83
      // 124: dup_x1
      // 125: swap
      // 126: bipush 1
      // 127: swap
      // 128: aastore
      // 129: dup_x2
      // 12a: dup_x2
      // 12b: pop
      // 12c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f: bipush 0
      // 130: swap
      // 131: aastore
      // 132: ldc2_w 8191712423299811719
      // 135: lload 2
      // 136: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 0
      // 13c: getfield com/zelix/_y4.p Lcom/zelix/e3;
      // 13f: areturn
   }

   public _y4(long var1, int var3, int var4, char var5, boolean var6) {
      long var7 = (var1 << 16 | (long)var5 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 99077388527700L;
      this(false, var3, var4, var6, var9);
   }

   public Enumeration f(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: ldc2_w -1287807863774841052
      // 17: lload 2
      // 18: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: astore 5
      // 1f: aload 0
      // 20: getfield com/zelix/_y4.v Ljava/util/Map;
      // 23: aload 4
      // 25: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a: checkcast java/util/List
      // 2d: dup
      // 2e: astore 6
      // 30: aload 5
      // 32: ifnonnull 53
      // 35: ifnonnull 51
      // 38: goto 45
      // 3b: ldc2_w -1652187239566202152
      // 3e: lload 2
      // 3f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aconst_null
      // 46: areturn
      // 47: ldc2_w -1652187239566202152
      // 4a: lload 2
      // 4b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 6
      // 53: invokestatic java/util/Collections.enumeration (Ljava/util/Collection;)Ljava/util/Enumeration;
      // 56: areturn
   }

   static {
      long var11 = a ^ 5525712483508L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("À1ó\u0093ÔÝWÏô\u0017À0\u001aÈ6~".getBytes("ISO-8859-1"));
      String var22 = a(var15).intern();
      int var10001 = -1;
      b = var22;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "D\u0002£l\u008a\u0017·êNWvÚ;5\u0007¶";
      int var5 = "D\u0002£l\u008a\u0017·êNWvÚ;5\u0007¶".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var27 = -1;

         while (true) {
            long var8 = var24;
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
            long var29 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "ÿ\u008cÐ\tý¥\u009cÃ\u009cÝ\u0085=wco\u0016";
                  var5 = "ÿ\u008cÐ\tý¥\u009cÃ\u009cÝ\u0085=wco\u0016".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var27 = 0;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14426;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_y4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_y4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
