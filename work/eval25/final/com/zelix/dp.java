package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class dp implements Comparable {
   private List A;
   private dm g;
   private dm U;
   private dm q;
   private Set f;
   private static final long a = ess.a(7905062385441782588L, 2421842444545525121L, MethodHandles.lookup().lookupClass()).a(40860924910162L);

   public boolean D(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: pop
      // 17: getstatic com/zelix/dp.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: lload 2
      // 1e: dup2
      // 1f: ldc2_w 121191094780315
      // 22: lxor
      // 23: lstore 5
      // 25: pop2
      // 26: ldc2_w -1858057847344105388
      // 29: lload 2
      // 2a: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 0
      // 30: getfield com/zelix/dp.f Ljava/util/Set;
      // 33: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 38: astore 8
      // 3a: istore 7
      // 3c: aload 8
      // 3e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 43: ifeq 8f
      // 46: aload 8
      // 48: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4d: checkcast com/zelix/dm
      // 50: astore 9
      // 52: aload 9
      // 54: iload 4
      // 56: lload 5
      // 58: invokevirtual com/zelix/dm.L (IJ)Z
      // 5b: iload 7
      // 5d: lload 2
      // 5e: lconst_0
      // 5f: lcmp
      // 60: ifle 68
      // 63: ifeq 90
      // 66: iload 7
      // 68: ifeq 89
      // 6b: goto 78
      // 6e: ldc2_w -339459074965466845
      // 71: lload 2
      // 72: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: ifeq 8a
      // 7b: goto 88
      // 7e: ldc2_w -339459074965466845
      // 81: lload 2
      // 82: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: bipush 1
      // 89: ireturn
      // 8a: iload 7
      // 8c: ifne 3c
      // 8f: bipush 0
      // 90: ireturn
   }

   private void f(dm param1, BitSet param2, Set param3, List param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/dp.a J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 86961052738723
      // 00e: lxor
      // 00f: dup2
      // 010: bipush 48
      // 012: lushr
      // 013: l2i
      // 014: istore 7
      // 016: dup2
      // 017: bipush 16
      // 019: lshl
      // 01a: bipush 48
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 8
      // 020: dup2
      // 021: bipush 32
      // 023: lshl
      // 024: bipush 32
      // 026: lushr
      // 027: l2i
      // 028: istore 9
      // 02a: pop2
      // 02b: dup2
      // 02c: ldc2_w 12375439457047
      // 02f: lxor
      // 030: lstore 10
      // 032: pop2
      // 033: ldc2_w 202676662824462789
      // 036: lload 5
      // 038: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 12
      // 03f: iload 12
      // 041: ifne 072
      // 044: aload 3
      // 045: aload 1
      // 046: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 04b: ifeq 154
      // 04e: goto 05c
      // 051: ldc2_w 2075847118643689124
      // 054: lload 5
      // 056: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 2
      // 05d: aload 1
      // 05e: invokevirtual com/zelix/dm.m ()I
      // 061: invokevirtual java/util/BitSet.set (I)V
      // 064: goto 072
      // 067: ldc2_w 2075847118643689124
      // 06a: lload 5
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 1
      // 073: iload 12
      // 075: ifne 0be
      // 078: aload 0
      // 079: getfield com/zelix/dp.g Lcom/zelix/dm;
      // 07c: if_acmpne 0af
      // 07f: goto 08d
      // 082: ldc2_w 2075847118643689124
      // 085: lload 5
      // 087: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: aload 0
      // 08e: iload 7
      // 090: i2c
      // 091: aload 2
      // 092: iload 8
      // 094: i2c
      // 095: iload 9
      // 097: aload 4
      // 099: invokespecial com/zelix/dp.y (CLjava/util/BitSet;CILjava/util/List;)V
      // 09c: iload 12
      // 09e: ifeq 171
      // 0a1: goto 0af
      // 0a4: ldc2_w 2075847118643689124
      // 0a7: lload 5
      // 0a9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 1
      // 0b0: goto 0be
      // 0b3: ldc2_w 2075847118643689124
      // 0b6: lload 5
      // 0b8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: invokevirtual com/zelix/dm.K ()Ljava/util/List;
      // 0c1: astore 13
      // 0c3: aload 13
      // 0c5: iload 12
      // 0c7: ifne 0dd
      // 0ca: ifnull 141
      // 0cd: goto 0db
      // 0d0: ldc2_w 2075847118643689124
      // 0d3: lload 5
      // 0d5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 13
      // 0dd: invokeinterface java/util/List.size ()I 1
      // 0e2: istore 14
      // 0e4: aload 13
      // 0e6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0eb: astore 15
      // 0ed: aload 15
      // 0ef: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f4: ifeq 141
      // 0f7: aload 15
      // 0f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fe: checkcast com/zelix/dm
      // 101: astore 16
      // 103: iload 12
      // 105: ifne 171
      // 108: aload 0
      // 109: aload 16
      // 10b: iload 14
      // 10d: ifle 133
      // 110: goto 11e
      // 113: ldc2_w 2075847118643689124
      // 116: lload 5
      // 118: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: aload 2
      // 11f: invokevirtual java/util/BitSet.clone ()Ljava/lang/Object;
      // 122: checkcast java/util/BitSet
      // 125: goto 134
      // 128: ldc2_w 2075847118643689124
      // 12b: lload 5
      // 12d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 2
      // 134: aload 3
      // 135: aload 4
      // 137: lload 10
      // 139: invokespecial com/zelix/dp.f (Lcom/zelix/dm;Ljava/util/BitSet;Ljava/util/Set;Ljava/util/List;J)V
      // 13c: iload 12
      // 13e: ifeq 0ed
      // 141: lload 5
      // 143: lconst_0
      // 144: lcmp
      // 145: iflt 171
      // 148: lload 5
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: iflt 163
      // 14f: iload 12
      // 151: ifeq 171
      // 154: aload 0
      // 155: iload 7
      // 157: i2c
      // 158: aload 2
      // 159: iload 8
      // 15b: i2c
      // 15c: iload 9
      // 15e: aload 4
      // 160: invokespecial com/zelix/dp.y (CLjava/util/BitSet;CILjava/util/List;)V
      // 163: goto 171
      // 166: ldc2_w 2075847118643689124
      // 169: lload 5
      // 16b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: return
   }

   public dm m() {
      return this.g;
   }

   public void U(Object[] var1) {
      dm var2 = (dm)var1[0];
      this.A.add(var2);
   }

   public List o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = (var2 ^ 116684822983835L) >>> 16;
      int var6 = (int)((var2 ^ 116684822983835L) << 48 >>> 48);
      return new _ov(var4, (char)var6, this.A);
   }

   public dm U(Object[] var1) {
      return (dm)this.A.get(0);
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 104092417414909L;
      return x44.a<"i">(this, new Object[]{(dp)var1}, 7233940132092436046L, var2);
   }

   public boolean M(Object[] var1) {
      dm var2 = (dm)var1[0];
      return this.f.contains(var2);
   }

   public dm b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -4706081794052505404L, var2);
   }

   void d(Object[] param1) {
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
      // 004: checkcast java/util/List
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
      // 016: checkcast com/zelix/_8z
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic com/zelix/dp.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 109500704280008
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 129706838883426
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 62190852732331
      // 035: lxor
      // 036: lstore 10
      // 038: pop2
      // 039: ldc2_w 5696479326607692143
      // 03c: lload 2
      // 03d: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: lload 6
      // 044: bipush 1
      // 045: anewarray 20
      // 048: dup_x2
      // 049: dup_x2
      // 04a: pop
      // 04b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04e: bipush 0
      // 04f: swap
      // 050: aastore
      // 051: ldc2_w 5606064915909493760
      // 054: lload 2
      // 055: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: astore 13
      // 05c: new java/util/BitSet
      // 05f: dup
      // 060: aload 4
      // 062: invokeinterface java/util/List.size ()I 1
      // 067: invokespecial java/util/BitSet.<init> (I)V
      // 06a: astore 14
      // 06c: aload 0
      // 06d: getfield com/zelix/dp.A Ljava/util/List;
      // 070: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 075: astore 15
      // 077: istore 12
      // 079: aload 15
      // 07b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 080: ifeq 0cb
      // 083: aload 15
      // 085: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08a: checkcast com/zelix/dm
      // 08d: astore 16
      // 08f: aload 14
      // 091: ldc2_w 5712327432021301250
      // 094: lload 2
      // 095: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: aload 0
      // 09b: aload 16
      // 09d: aload 14
      // 09f: aload 13
      // 0a1: aload 4
      // 0a3: lload 10
      // 0a5: invokespecial com/zelix/dp.f (Lcom/zelix/dm;Ljava/util/BitSet;Ljava/util/Set;Ljava/util/List;J)V
      // 0a8: iload 12
      // 0aa: lload 2
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: iflt 0b5
      // 0b0: ifeq 21d
      // 0b3: iload 12
      // 0b5: ifne 079
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: iflt 0a8
      // 0be: goto 0cb
      // 0c1: ldc2_w 5941039807269779480
      // 0c4: lload 2
      // 0c5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 5
      // 0cd: iload 12
      // 0cf: lload 2
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: ifle 0eb
      // 0d5: ifeq 0ea
      // 0d8: ifnull 21d
      // 0db: goto 0e8
      // 0de: ldc2_w 5941039807269779480
      // 0e1: lload 2
      // 0e2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 5
      // 0ea: bipush 0
      // 0eb: anewarray 20
      // 0ee: ldc2_w 6101233650629753076
      // 0f1: lload 2
      // 0f2: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0fc: astore 15
      // 0fe: aload 15
      // 100: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 105: ifeq 21d
      // 108: aload 15
      // 10a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10f: checkcast com/zelix/dm
      // 112: astore 16
      // 114: aload 0
      // 115: getfield com/zelix/dp.f Ljava/util/Set;
      // 118: iload 12
      // 11a: ifeq 153
      // 11d: aload 16
      // 11f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 124: lload 2
      // 125: lconst_0
      // 126: lcmp
      // 127: iflt 21a
      // 12a: ifeq 212
      // 12d: goto 13a
      // 130: ldc2_w 5941039807269779480
      // 133: lload 2
      // 134: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 5
      // 13c: aload 16
      // 13e: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 141: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 146: goto 153
      // 149: ldc2_w 5941039807269779480
      // 14c: lload 2
      // 14d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 158: astore 17
      // 15a: aload 17
      // 15c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 161: ifeq 212
      // 164: aload 17
      // 166: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16b: checkcast com/zelix/dm
      // 16e: astore 18
      // 170: aload 0
      // 171: getfield com/zelix/dp.A Ljava/util/List;
      // 174: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 179: iload 12
      // 17b: ifeq 100
      // 17e: astore 19
      // 180: aload 19
      // 182: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 187: ifeq 207
      // 18a: aload 19
      // 18c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 191: checkcast com/zelix/dm
      // 194: astore 20
      // 196: aload 14
      // 198: ldc2_w 5712327432021301250
      // 19b: lload 2
      // 19c: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: aload 18
      // 1a3: aload 20
      // 1a5: aload 14
      // 1a7: lload 8
      // 1a9: bipush 3
      // 1aa: anewarray 20
      // 1ad: dup_x2
      // 1ae: dup_x2
      // 1af: pop
      // 1b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b3: bipush 2
      // 1b4: swap
      // 1b5: aastore
      // 1b6: dup_x1
      // 1b7: swap
      // 1b8: bipush 1
      // 1b9: swap
      // 1ba: aastore
      // 1bb: dup_x1
      // 1bc: swap
      // 1bd: bipush 0
      // 1be: swap
      // 1bf: aastore
      // 1c0: ldc2_w 5690043415241183457
      // 1c3: lload 2
      // 1c4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: iload 12
      // 1cb: ifeq 161
      // 1ce: iload 12
      // 1d0: lload 2
      // 1d1: lconst_0
      // 1d2: lcmp
      // 1d3: ifle 1cb
      // 1d6: ifeq 201
      // 1d9: ifeq 202
      // 1dc: goto 1e9
      // 1df: ldc2_w 5941039807269779480
      // 1e2: lload 2
      // 1e3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: getfield com/zelix/dp.f Ljava/util/Set;
      // 1ed: aload 18
      // 1ef: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1f4: goto 201
      // 1f7: ldc2_w 5941039807269779480
      // 1fa: lload 2
      // 1fb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: athrow
      // 201: pop
      // 202: iload 12
      // 204: ifne 180
      // 207: iload 12
      // 209: lload 2
      // 20a: lconst_0
      // 20b: lcmp
      // 20c: iflt 161
      // 20f: ifne 15a
      // 212: iload 12
      // 214: lload 2
      // 215: lconst_0
      // 216: lcmp
      // 217: iflt 105
      // 21a: ifne 0fe
      // 21d: return
   }

   public dp(int param1, byte param2, dm param3, int param4, dm param5) {
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
      // 005: iload 2
      // 006: i2l
      // 007: bipush 56
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 4
      // 010: i2l
      // 011: bipush 40
      // 013: lshl
      // 014: bipush 40
      // 016: lushr
      // 017: lor
      // 018: getstatic com/zelix/dp.a J
      // 01b: lxor
      // 01c: lstore 6
      // 01e: lload 6
      // 020: dup2
      // 021: ldc2_w 131886846085218
      // 024: lxor
      // 025: lstore 8
      // 027: dup2
      // 028: ldc2_w 21284286910583
      // 02b: lxor
      // 02c: lstore 10
      // 02e: dup2
      // 02f: ldc2_w 27463938407514
      // 032: lxor
      // 033: lstore 12
      // 035: dup2
      // 036: ldc2_w 104721667523930
      // 039: lxor
      // 03a: lstore 14
      // 03c: dup2
      // 03d: ldc2_w 124884673640666
      // 040: lxor
      // 041: dup2
      // 042: bipush 48
      // 044: lushr
      // 045: l2i
      // 046: istore 16
      // 048: dup2
      // 049: bipush 16
      // 04b: lshl
      // 04c: bipush 16
      // 04e: lushr
      // 04f: lstore 17
      // 051: pop2
      // 052: pop2
      // 053: ldc2_w -8863644550725013525
      // 056: lload 6
      // 058: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: aload 0
      // 05e: invokespecial java/lang/Object.<init> ()V
      // 061: istore 19
      // 063: aload 0
      // 064: new java/util/ArrayList
      // 067: dup
      // 068: invokespecial java/util/ArrayList.<init> ()V
      // 06b: putfield com/zelix/dp.A Ljava/util/List;
      // 06e: aload 0
      // 06f: lload 14
      // 071: bipush 1
      // 072: anewarray 20
      // 075: dup_x2
      // 076: dup_x2
      // 077: pop
      // 078: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: ldc2_w -8836481383706719086
      // 081: lload 6
      // 083: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: putfield com/zelix/dp.f Ljava/util/Set;
      // 08b: aload 0
      // 08c: aload 3
      // 08d: putfield com/zelix/dp.g Lcom/zelix/dm;
      // 090: aload 0
      // 091: getfield com/zelix/dp.A Ljava/util/List;
      // 094: aload 5
      // 096: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09b: pop
      // 09c: iload 19
      // 09e: ifne 1af
      // 0a1: aload 5
      // 0a3: aload 3
      // 0a4: lload 8
      // 0a6: bipush 2
      // 0a7: anewarray 20
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w -8731497507250357048
      // 0bb: lload 6
      // 0bd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: ifeq 183
      // 0c5: goto 0d3
      // 0c8: ldc2_w -7286564079981105014
      // 0cb: lload 6
      // 0cd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: aload 5
      // 0d6: lload 10
      // 0d8: bipush 1
      // 0d9: anewarray 20
      // 0dc: dup_x2
      // 0dd: dup_x2
      // 0de: pop
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: bipush 0
      // 0e3: swap
      // 0e4: aastore
      // 0e5: ldc2_w -7067818041736776126
      // 0e8: lload 6
      // 0ea: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/dm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: putfield com/zelix/dp.U Lcom/zelix/dm;
      // 0f2: iload 19
      // 0f4: iload 1
      // 0f5: ifle 180
      // 0f8: ifne 17a
      // 0fb: goto 109
      // 0fe: ldc2_w -7286564079981105014
      // 101: lload 6
      // 103: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: iload 1
      // 10a: ifle 16c
      // 10d: aload 3
      // 10e: iload 16
      // 110: i2s
      // 111: lload 17
      // 113: ldc2_w -8922916401770633851
      // 116: lload 6
      // 118: invokedynamic k (Ljava/lang/Object;SJJJ)Lcom/zelix/dm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: aload 0
      // 11e: getfield com/zelix/dp.U Lcom/zelix/dm;
      // 121: if_acmpeq 160
      // 124: goto 132
      // 127: ldc2_w -7286564079981105014
      // 12a: lload 6
      // 12c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 0
      // 133: aload 3
      // 134: iload 16
      // 136: i2s
      // 137: lload 17
      // 139: ldc2_w -8922916401770633851
      // 13c: lload 6
      // 13e: invokedynamic k (Ljava/lang/Object;SJJJ)Lcom/zelix/dm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: ldc2_w -7340081694855109546
      // 146: lload 6
      // 148: invokedynamic p (Ljava/lang/Object;Lcom/zelix/dm;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: iload 19
      // 14f: ifeq 1d4
      // 152: goto 160
      // 155: ldc2_w -7286564079981105014
      // 158: lload 6
      // 15a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 0
      // 161: aload 3
      // 162: ldc2_w -7340081694855109546
      // 165: lload 6
      // 167: invokedynamic p (Ljava/lang/Object;Lcom/zelix/dm;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: goto 17a
      // 16f: ldc2_w -7286564079981105014
      // 172: lload 6
      // 174: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: iload 1
      // 17b: ifle 1a1
      // 17e: iload 19
      // 180: ifeq 1d4
      // 183: aload 0
      // 184: aload 3
      // 185: lload 10
      // 187: bipush 1
      // 188: anewarray 20
      // 18b: dup_x2
      // 18c: dup_x2
      // 18d: pop
      // 18e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 191: bipush 0
      // 192: swap
      // 193: aastore
      // 194: ldc2_w -7067818041736776126
      // 197: lload 6
      // 199: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/dm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: putfield com/zelix/dp.U Lcom/zelix/dm;
      // 1a1: goto 1af
      // 1a4: ldc2_w -7286564079981105014
      // 1a7: lload 6
      // 1a9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: aload 0
      // 1b0: aload 3
      // 1b1: lload 12
      // 1b3: bipush 1
      // 1b4: anewarray 20
      // 1b7: dup_x2
      // 1b8: dup_x2
      // 1b9: pop
      // 1ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bd: bipush 0
      // 1be: swap
      // 1bf: aastore
      // 1c0: ldc2_w -7084902369470378395
      // 1c3: lload 6
      // 1c5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/dm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: ldc2_w -7340081694855109546
      // 1cd: lload 6
      // 1cf: invokedynamic p (Ljava/lang/Object;Lcom/zelix/dm;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: return
   }

   private void y(char param1, BitSet param2, char param3, int param4, List param5) {
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
      // 05: iload 3
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 32
      // 13: lshl
      // 14: bipush 32
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/dp.a J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: aload 5
      // 20: invokeinterface java/util/List.size ()I 1
      // 25: istore 9
      // 27: ldc2_w 6729584074268980849
      // 2a: lload 6
      // 2c: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: bipush 0
      // 32: istore 10
      // 34: istore 8
      // 36: iload 10
      // 38: iload 9
      // 3a: if_icmpge 82
      // 3d: aload 2
      // 3e: iload 10
      // 40: invokevirtual java/util/BitSet.get (I)Z
      // 43: iload 8
      // 45: ifne 79
      // 48: ifeq 7a
      // 4b: goto 59
      // 4e: ldc2_w 4862383064371833104
      // 51: lload 6
      // 53: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: getfield com/zelix/dp.f Ljava/util/Set;
      // 5d: aload 5
      // 5f: iload 10
      // 61: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 66: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 6b: goto 79
      // 6e: ldc2_w 4862383064371833104
      // 71: lload 6
      // 73: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: pop
      // 7a: iinc 10 1
      // 7d: iload 8
      // 7f: ifeq 36
      // 82: iload 3
      // 83: ifle 3d
      // 86: return
   }

   public dm C(Object[] var1) {
      return this.U;
   }

   public int u(Object[] var1) {
      dp var2 = (dp)var1[0];
      return this.g.l() - var2.g.l();
   }

   private static gj a(gj var0) {
      return var0;
   }
}
