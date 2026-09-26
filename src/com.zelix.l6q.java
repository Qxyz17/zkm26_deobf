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

public class l6q implements me {
   private final boolean L;
   Map o;
   private final boolean J;
   private w9 P;
   private int T;
   private static final long a = prr.a(-2825637176191731300L, 7652117924282439151L, MethodHandles.lookup().lookupClass()).a(60913710728638L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public l6q(long param1, l6q param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/l6q.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 126295284038695
      // 00b: lxor
      // 00c: lstore 4
      // 00e: dup2
      // 00f: ldc2_w 59602967647175
      // 012: lxor
      // 013: dup2
      // 014: bipush 32
      // 016: lushr
      // 017: l2i
      // 018: istore 6
      // 01a: dup2
      // 01b: bipush 32
      // 01d: lshl
      // 01e: bipush 48
      // 020: lushr
      // 021: l2i
      // 022: istore 7
      // 024: dup2
      // 025: bipush 48
      // 027: lshl
      // 028: bipush 48
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 8
      // 02e: pop2
      // 02f: pop2
      // 030: aload 0
      // 031: invokespecial java/lang/Object.<init> ()V
      // 034: aload 0
      // 035: sipush 26227
      // 038: ldc2_w 6016239483196154152
      // 03b: lload 1
      // 03c: lxor
      // 03d: invokedynamic t (IJ)I bsm=com/zelix/l6q.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: putfield com/zelix/l6q.T I
      // 045: ldc2_w 4250015256102577357
      // 048: lload 1
      // 049: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 0
      // 04f: aconst_null
      // 050: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 053: aload 0
      // 054: aload 3
      // 055: getfield com/zelix/l6q.J Z
      // 058: putfield com/zelix/l6q.J Z
      // 05b: aload 0
      // 05c: aload 3
      // 05d: ldc2_w 4113190578946779837
      // 060: lload 1
      // 061: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: putfield com/zelix/l6q.L Z
      // 069: aload 0
      // 06a: aload 3
      // 06b: getfield com/zelix/l6q.T I
      // 06e: putfield com/zelix/l6q.T I
      // 071: aload 3
      // 072: getfield com/zelix/l6q.o Ljava/util/Map;
      // 075: invokeinterface java/util/Map.size ()I 1
      // 07a: iload 6
      // 07c: iload 7
      // 07e: i2c
      // 07f: iload 8
      // 081: i2s
      // 082: invokestatic com/zelix/cf.x (IICS)I
      // 085: istore 10
      // 087: astore 9
      // 089: aload 0
      // 08a: getfield com/zelix/l6q.J Z
      // 08d: aload 9
      // 08f: ifnonnull 0f0
      // 092: ifeq 0c7
      // 095: goto 0a2
      // 098: ldc2_w 2398847079366007162
      // 09b: lload 1
      // 09c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: lload 1
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: iflt 14c
      // 0a9: new java/util/concurrent/ConcurrentHashMap
      // 0ac: dup
      // 0ad: iload 10
      // 0af: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 0b2: putfield com/zelix/l6q.o Ljava/util/Map;
      // 0b5: aload 9
      // 0b7: ifnull 14b
      // 0ba: goto 0c7
      // 0bd: ldc2_w 2398847079366007162
      // 0c0: lload 1
      // 0c1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: aload 9
      // 0ca: ifnonnull 126
      // 0cd: goto 0da
      // 0d0: ldc2_w 2398847079366007162
      // 0d3: lload 1
      // 0d4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: ldc2_w 4113190578946779837
      // 0dd: lload 1
      // 0de: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: goto 0f0
      // 0e6: ldc2_w 2398847079366007162
      // 0e9: lload 1
      // 0ea: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: ifeq 118
      // 0f3: aload 0
      // 0f4: lload 1
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: iflt 14c
      // 0fa: new java/util/IdentityHashMap
      // 0fd: dup
      // 0fe: iload 10
      // 100: invokespecial java/util/IdentityHashMap.<init> (I)V
      // 103: putfield com/zelix/l6q.o Ljava/util/Map;
      // 106: aload 9
      // 108: ifnull 14b
      // 10b: goto 118
      // 10e: ldc2_w 2398847079366007162
      // 111: lload 1
      // 112: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: aload 0
      // 119: goto 126
      // 11c: ldc2_w 2398847079366007162
      // 11f: lload 1
      // 120: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iload 10
      // 128: lload 4
      // 12a: bipush 2
      // 12b: anewarray 142
      // 12e: dup_x2
      // 12f: dup_x2
      // 130: pop
      // 131: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 134: bipush 1
      // 135: swap
      // 136: aastore
      // 137: dup_x1
      // 138: swap
      // 139: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13c: bipush 0
      // 13d: swap
      // 13e: aastore
      // 13f: ldc2_w 4100033730727755014
      // 142: lload 1
      // 143: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: putfield com/zelix/l6q.o Ljava/util/Map;
      // 14b: aload 3
      // 14c: getfield com/zelix/l6q.o Ljava/util/Map;
      // 14f: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 154: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 159: astore 11
      // 15b: aload 11
      // 15d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 162: ifeq 1c5
      // 165: aload 11
      // 167: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16c: checkcast java/util/Map$Entry
      // 16f: astore 12
      // 171: aload 12
      // 173: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 178: checkcast java/util/List
      // 17b: astore 14
      // 17d: aload 0
      // 17e: getfield com/zelix/l6q.J Z
      // 181: ifeq 1a2
      // 184: new java/util/Vector
      // 187: dup
      // 188: aload 12
      // 18a: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 18f: checkcast java/util/Collection
      // 192: invokespecial java/util/Vector.<init> (Ljava/util/Collection;)V
      // 195: astore 13
      // 197: aload 9
      // 199: lload 1
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 1c2
      // 19f: ifnull 1ad
      // 1a2: new java/util/ArrayList
      // 1a5: dup
      // 1a6: aload 14
      // 1a8: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 1ab: astore 13
      // 1ad: aload 0
      // 1ae: getfield com/zelix/l6q.o Ljava/util/Map;
      // 1b1: aload 12
      // 1b3: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 1b8: aload 13
      // 1ba: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1bf: pop
      // 1c0: aload 9
      // 1c2: ifnull 15b
      // 1c5: return
   }

   public int Q(Object[] var1) {
      long var2 = (Long)var1[0];
      String var10000 = m44.a<"o">(-3122897539923195233L, var2);
      int var5 = 0;
      String var4 = var10000;
      Iterator var6 = this.o.values().iterator();

      while (true) {
         if (var6.hasNext()) {
            List var7 = (List)var6.next();
            if (var2 > 0L) {
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

   public boolean J(short var1, Object var2, int var3, char var4) {
      return this.o.containsKey(var2);
   }

   private void P(Object param1, char param2, Collection param3, long param4, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: lload 4
      // 007: bipush 16
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: getstatic com/zelix/l6q.a J
      // 011: lxor
      // 012: lstore 7
      // 014: lload 7
      // 016: dup2
      // 017: ldc2_w 23277481026165
      // 01a: lxor
      // 01b: lstore 9
      // 01d: pop2
      // 01e: ldc2_w 1641138619563444464
      // 021: lload 7
      // 023: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: astore 11
      // 02a: aload 0
      // 02b: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 02e: aload 11
      // 030: ifnonnull 085
      // 033: ifnull 07b
      // 036: goto 044
      // 039: ldc2_w 970246508297663815
      // 03c: lload 7
      // 03e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: athrow
      // 044: aload 0
      // 045: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 048: lload 9
      // 04a: dup2_x1
      // 04b: pop2
      // 04c: bipush 2
      // 04d: anewarray 142
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
      // 05e: ldc2_w 755153288353251892
      // 061: lload 7
      // 063: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 0
      // 069: aconst_null
      // 06a: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 06d: goto 07b
      // 070: ldc2_w 970246508297663815
      // 073: lload 7
      // 075: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 0
      // 07c: getfield com/zelix/l6q.o Ljava/util/Map;
      // 07f: aload 1
      // 080: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 085: checkcast java/util/List
      // 088: astore 12
      // 08a: iload 2
      // 08b: iflt 0ea
      // 08e: aload 12
      // 090: ifnonnull 0ea
      // 093: aload 0
      // 094: getfield com/zelix/l6q.J Z
      // 097: ifeq 0c7
      // 09a: goto 0a8
      // 09d: ldc2_w 970246508297663815
      // 0a0: lload 7
      // 0a2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: new java/util/Vector
      // 0ab: dup
      // 0ac: aload 0
      // 0ad: getfield com/zelix/l6q.T I
      // 0b0: aload 3
      // 0b1: invokeinterface java/util/Collection.size ()I 1
      // 0b6: invokestatic java/lang/Math.max (II)I
      // 0b9: invokespecial java/util/Vector.<init> (I)V
      // 0bc: astore 12
      // 0be: aload 11
      // 0c0: iload 2
      // 0c1: iflt 0e9
      // 0c4: ifnull 0dd
      // 0c7: new java/util/ArrayList
      // 0ca: dup
      // 0cb: aload 0
      // 0cc: getfield com/zelix/l6q.T I
      // 0cf: aload 3
      // 0d0: invokeinterface java/util/Collection.size ()I 1
      // 0d5: invokestatic java/lang/Math.max (II)I
      // 0d8: invokespecial java/util/ArrayList.<init> (I)V
      // 0db: astore 12
      // 0dd: aload 0
      // 0de: getfield com/zelix/l6q.o Ljava/util/Map;
      // 0e1: aload 1
      // 0e2: aload 12
      // 0e4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e9: pop
      // 0ea: iload 6
      // 0ec: aload 11
      // 0ee: ifnonnull 13a
      // 0f1: ifeq 124
      // 0f4: goto 102
      // 0f7: ldc2_w 970246508297663815
      // 0fa: lload 7
      // 0fc: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 12
      // 104: bipush 0
      // 105: aload 3
      // 106: ldc2_w 1299712034028672730
      // 109: lload 7
      // 10b: invokedynamic w (Ljava/lang/Object;ILjava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: pop
      // 111: aload 11
      // 113: ifnull 13b
      // 116: goto 124
      // 119: ldc2_w 970246508297663815
      // 11c: lload 7
      // 11e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: aload 12
      // 126: aload 3
      // 127: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 12c: goto 13a
      // 12f: ldc2_w 970246508297663815
      // 132: lload 7
      // 134: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: pop
      // 13b: return
   }

   public boolean R(Object[] param1) {
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
      // 00e: checkcast java/lang/Object
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Object
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 37078418734392
      // 020: lxor
      // 021: lstore 6
      // 023: pop2
      // 024: ldc2_w -3923960795388979267
      // 027: lload 3
      // 028: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: astore 8
      // 02f: aload 0
      // 030: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 033: aload 8
      // 035: ifnonnull 088
      // 038: ifnull 07d
      // 03b: goto 048
      // 03e: ldc2_w -3298263732116526582
      // 041: lload 3
      // 042: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: athrow
      // 048: aload 0
      // 049: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 04c: lload 6
      // 04e: dup2_x1
      // 04f: pop2
      // 050: bipush 2
      // 051: anewarray 142
      // 054: dup_x1
      // 055: swap
      // 056: bipush 1
      // 057: swap
      // 058: aastore
      // 059: dup_x2
      // 05a: dup_x2
      // 05b: pop
      // 05c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: ldc2_w -3082745309348668039
      // 065: lload 3
      // 066: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: aload 0
      // 06c: aconst_null
      // 06d: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 070: goto 07d
      // 073: ldc2_w -3298263732116526582
      // 076: lload 3
      // 077: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield com/zelix/l6q.o Ljava/util/Map;
      // 081: aload 5
      // 083: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 088: checkcast java/util/List
      // 08b: astore 9
      // 08d: aload 9
      // 08f: ifnonnull 09e
      // 092: bipush 0
      // 093: ireturn
      // 094: ldc2_w -3298263732116526582
      // 097: lload 3
      // 098: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: bipush 0
      // 09f: istore 10
      // 0a1: aload 9
      // 0a3: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a8: astore 11
      // 0aa: aload 11
      // 0ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b1: ifeq 0fb
      // 0b4: aload 11
      // 0b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bb: aload 2
      // 0bc: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0bf: aload 8
      // 0c1: lload 3
      // 0c2: lconst_0
      // 0c3: lcmp
      // 0c4: ifle 10a
      // 0c7: ifnonnull 108
      // 0ca: aload 8
      // 0cc: ifnonnull 0f4
      // 0cf: goto 0dc
      // 0d2: ldc2_w -3298263732116526582
      // 0d5: lload 3
      // 0d6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: ifeq 0aa
      // 0df: goto 0ec
      // 0e2: ldc2_w -3298263732116526582
      // 0e5: lload 3
      // 0e6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 11
      // 0ee: invokeinterface java/util/Iterator.remove ()V 1
      // 0f3: bipush 1
      // 0f4: istore 10
      // 0f6: aload 8
      // 0f8: ifnull 0aa
      // 0fb: aload 9
      // 0fd: lload 3
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 0bb
      // 103: invokeinterface java/util/List.size ()I 1
      // 108: aload 8
      // 10a: ifnonnull 138
      // 10d: ifne 136
      // 110: goto 11d
      // 113: ldc2_w -3298263732116526582
      // 116: lload 3
      // 117: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield com/zelix/l6q.o Ljava/util/Map;
      // 121: aload 5
      // 123: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 128: pop
      // 129: goto 136
      // 12c: ldc2_w -3298263732116526582
      // 12f: lload 3
      // 130: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: iload 10
      // 138: ireturn
   }

   public boolean J(Object[] var1) {
      return this.J;
   }

   public List H(Object[] param1) {
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
      // 0a: istore 5
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Object
      // 12: astore 6
      // 14: dup
      // 15: bipush 2
      // 16: aaload
      // 17: checkcast java/lang/Integer
      // 1a: invokevirtual java/lang/Integer.intValue ()I
      // 1d: istore 4
      // 1f: dup
      // 20: bipush 3
      // 21: aaload
      // 22: checkcast java/util/List
      // 25: astore 2
      // 26: dup
      // 27: bipush 4
      // 28: aaload
      // 29: checkcast java/lang/Integer
      // 2c: invokevirtual java/lang/Integer.intValue ()I
      // 2f: istore 3
      // 30: pop
      // 31: iload 5
      // 33: i2l
      // 34: bipush 56
      // 36: lshl
      // 37: iload 4
      // 39: i2l
      // 3a: bipush 32
      // 3c: lshl
      // 3d: bipush 8
      // 3f: lushr
      // 40: lor
      // 41: iload 3
      // 42: i2l
      // 43: bipush 40
      // 45: lshl
      // 46: bipush 40
      // 48: lushr
      // 49: lor
      // 4a: getstatic com/zelix/l6q.a J
      // 4d: lxor
      // 4e: lstore 7
      // 50: lload 7
      // 52: dup2
      // 53: ldc2_w 74442505515735
      // 56: lxor
      // 57: lstore 9
      // 59: pop2
      // 5a: ldc2_w 460537587097213010
      // 5d: lload 7
      // 5f: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: astore 11
      // 66: aload 0
      // 67: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 6a: aload 11
      // 6c: ifnonnull c3
      // 6f: ifnull b7
      // 72: goto 80
      // 75: ldc2_w 2149717378034902501
      // 78: lload 7
      // 7a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 84: lload 9
      // 86: dup2_x1
      // 87: pop2
      // 88: bipush 2
      // 89: anewarray 142
      // 8c: dup_x1
      // 8d: swap
      // 8e: bipush 1
      // 8f: swap
      // 90: aastore
      // 91: dup_x2
      // 92: dup_x2
      // 93: pop
      // 94: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 97: bipush 0
      // 98: swap
      // 99: aastore
      // 9a: ldc2_w 1934438383319749270
      // 9d: lload 7
      // 9f: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: aload 0
      // a5: aconst_null
      // a6: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // a9: goto b7
      // ac: ldc2_w 2149717378034902501
      // af: lload 7
      // b1: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: athrow
      // b7: aload 0
      // b8: getfield com/zelix/l6q.o Ljava/util/Map;
      // bb: aload 6
      // bd: aload 2
      // be: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // c3: checkcast java/util/List
      // c6: areturn
   }

   public void f(Object[] param1) {
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
      // 00c: getstatic com/zelix/l6q.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w 7906197127822537614
      // 015: lload 2
      // 016: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: aload 0
      // 01c: getfield com/zelix/l6q.o Ljava/util/Map;
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
      // 04b: ifle 0ad
      // 04e: aload 4
      // 050: ifnonnull 0ad
      // 053: ifeq 089
      // 056: goto 063
      // 059: ldc2_w 8505338752446975545
      // 05c: lload 2
      // 05d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: aload 6
      // 065: checkcast java/util/Vector
      // 068: ldc2_w 8221917526714914240
      // 06b: lload 2
      // 06c: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: aload 4
      // 073: lload 2
      // 074: lconst_0
      // 075: lcmp
      // 076: ifle 12e
      // 079: ifnull 12c
      // 07c: goto 089
      // 07f: ldc2_w 8505338752446975545
      // 082: lload 2
      // 083: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 6
      // 08b: aload 4
      // 08d: ifnonnull 0d2
      // 090: goto 09d
      // 093: ldc2_w 8505338752446975545
      // 096: lload 2
      // 097: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: instanceof java/util/ArrayList
      // 0a0: goto 0ad
      // 0a3: ldc2_w 8505338752446975545
      // 0a6: lload 2
      // 0a7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: ifeq 0d0
      // 0b0: aload 6
      // 0b2: checkcast java/util/ArrayList
      // 0b5: invokevirtual java/util/ArrayList.trimToSize ()V
      // 0b8: aload 4
      // 0ba: lload 2
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: iflt 12e
      // 0c0: ifnull 12c
      // 0c3: goto 0d0
      // 0c6: ldc2_w 8505338752446975545
      // 0c9: lload 2
      // 0ca: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 6
      // 0d2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d5: astore 7
      // 0d7: aload 7
      // 0d9: getstatic com/zelix/l6q.b Ljava/lang/String;
      // 0dc: bipush 0
      // 0dd: anewarray 358
      // 0e0: swap
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: dup2_x1
      // 0e4: invokestatic com/zelix/f33.b (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
      // 0e7: swap
      // 0e8: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 0eb: astore 8
      // 0ed: aload 8
      // 0ef: aload 4
      // 0f1: ifnonnull 11c
      // 0f4: ifnull 11d
      // 0f7: goto 104
      // 0fa: ldc2_w 8505338752446975545
      // 0fd: lload 2
      // 0fe: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 8
      // 106: aload 6
      // 108: bipush 0
      // 109: anewarray 142
      // 10c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 10f: goto 11c
      // 112: ldc2_w 8505338752446975545
      // 115: lload 2
      // 116: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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

   public l6q(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 56360591748932L;
      this(false, var3, 5, var4, false);
   }

   l6q(boolean param1, int param2, int param3, long param4, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/l6q.a J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 16901850792702
      // 00e: lxor
      // 00f: lstore 7
      // 011: dup2
      // 012: ldc2_w 83250574552350
      // 015: lxor
      // 016: dup2
      // 017: bipush 32
      // 019: lushr
      // 01a: l2i
      // 01b: istore 9
      // 01d: dup2
      // 01e: bipush 32
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 10
      // 027: dup2
      // 028: bipush 48
      // 02a: lshl
      // 02b: bipush 48
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 11
      // 031: pop2
      // 032: pop2
      // 033: aload 0
      // 034: invokespecial java/lang/Object.<init> ()V
      // 037: aload 0
      // 038: sipush 31279
      // 03b: ldc2_w 2046706187125523375
      // 03e: lload 4
      // 040: lxor
      // 041: invokedynamic t (IJ)I bsm=com/zelix/l6q.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: putfield com/zelix/l6q.T I
      // 049: ldc2_w -8925452928779118060
      // 04c: lload 4
      // 04e: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: aload 0
      // 054: aconst_null
      // 055: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 058: aload 0
      // 059: iload 3
      // 05a: putfield com/zelix/l6q.T I
      // 05d: astore 12
      // 05f: aload 0
      // 060: iload 1
      // 061: putfield com/zelix/l6q.L Z
      // 064: aload 0
      // 065: iload 6
      // 067: putfield com/zelix/l6q.J Z
      // 06a: iload 2
      // 06b: iload 9
      // 06d: iload 10
      // 06f: i2c
      // 070: iload 11
      // 072: i2s
      // 073: invokestatic com/zelix/cf.x (IICS)I
      // 076: istore 13
      // 078: iload 6
      // 07a: aload 12
      // 07c: ifnonnull 0bf
      // 07f: ifeq 0b0
      // 082: goto 090
      // 085: ldc2_w -6948184272272185437
      // 088: lload 4
      // 08a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: aload 0
      // 091: new java/util/concurrent/ConcurrentHashMap
      // 094: dup
      // 095: iload 13
      // 097: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 09a: putfield com/zelix/l6q.o Ljava/util/Map;
      // 09d: aload 12
      // 09f: ifnull 117
      // 0a2: goto 0b0
      // 0a5: ldc2_w -6948184272272185437
      // 0a8: lload 4
      // 0aa: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: iload 1
      // 0b1: goto 0bf
      // 0b4: ldc2_w -6948184272272185437
      // 0b7: lload 4
      // 0b9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: ifeq 0e2
      // 0c2: aload 0
      // 0c3: new java/util/IdentityHashMap
      // 0c6: dup
      // 0c7: iload 13
      // 0c9: invokespecial java/util/IdentityHashMap.<init> (I)V
      // 0cc: putfield com/zelix/l6q.o Ljava/util/Map;
      // 0cf: aload 12
      // 0d1: ifnull 117
      // 0d4: goto 0e2
      // 0d7: ldc2_w -6948184272272185437
      // 0da: lload 4
      // 0dc: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: iload 13
      // 0e5: lload 7
      // 0e7: bipush 2
      // 0e8: anewarray 142
      // 0eb: dup_x2
      // 0ec: dup_x2
      // 0ed: pop
      // 0ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f1: bipush 1
      // 0f2: swap
      // 0f3: aastore
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: ldc2_w -8773219372148784161
      // 0ff: lload 4
      // 101: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: putfield com/zelix/l6q.o Ljava/util/Map;
      // 109: goto 117
      // 10c: ldc2_w -6948184272272185437
      // 10f: lload 4
      // 111: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: return
   }

   public int w(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.o.size();
   }

   public l6q(boolean var1, long var2, int var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 61239422256959L;
      this(var1, var4, 5, var5, false);
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return m44.a<"u">(this.o, 4789035369793381943L, var2);
   }

   public void Q(Object[] var1) {
      Object var2 = var1[0];
      Collection var3 = (Collection)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      int var6 = (int)((var4 ^ 72668201442518L) >>> 48);
      long var7 = (var4 ^ 72668201442518L) << 16 >>> 16;
      this.P(var2, (char)var6, var3, var7, true);
   }

   public Set H(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.o.keySet();
   }

   public l6q(int var1, int var2, short var3, int var4, boolean var5, char var6) {
      long var7 = ((long)var3 << 48 | (long)var4 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 63019516315027L;
      this(false, var1, var2, var9, var5);
   }

   public l6q(short var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 38077020972387L;
      this(false, a<"t">(15996, 8652126600307620243L ^ var4), 5, var6, false);
   }

   public l6q(long var1, boolean var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 84861023493728L;
      this(false, a<"t">(7559, 7862256135045914985L ^ var1), 5, var4, var3);
   }

   public void u(Object var1, Collection var2, long var3) {
      var3 = a ^ var3;
      int var5 = (int)((var3 ^ 14319059453400L) >>> 48);
      long var6 = (var3 ^ 14319059453400L) << 16 >>> 16;
      this.P(var1, (char)var5, var2, var6, false);
   }

   public Set D(long var1) {
      return this.o.entrySet();
   }

   public List u(Object[] param1) {
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
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 24865000713438
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w 1760200846252246619
      // 20: lload 2
      // 21: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: astore 7
      // 28: aload 0
      // 29: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 2c: aload 7
      // 2e: ifnonnull 81
      // 31: ifnull 76
      // 34: goto 41
      // 37: ldc2_w 278099174959954924
      // 3a: lload 2
      // 3b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 0
      // 42: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 45: lload 5
      // 47: dup2_x1
      // 48: pop2
      // 49: bipush 2
      // 4a: anewarray 142
      // 4d: dup_x1
      // 4e: swap
      // 4f: bipush 1
      // 50: swap
      // 51: aastore
      // 52: dup_x2
      // 53: dup_x2
      // 54: pop
      // 55: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 58: bipush 0
      // 59: swap
      // 5a: aastore
      // 5b: ldc2_w 347292141362842783
      // 5e: lload 2
      // 5f: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: aload 0
      // 65: aconst_null
      // 66: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 69: goto 76
      // 6c: ldc2_w 278099174959954924
      // 6f: lload 2
      // 70: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 0
      // 77: getfield com/zelix/l6q.o Ljava/util/Map;
      // 7a: aload 4
      // 7c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 81: checkcast java/util/List
      // 84: areturn
   }

   public boolean w(Object[] param1) {
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
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Object
      // 18: astore 5
      // 1a: pop
      // 1b: ldc2_w 698414953867253639
      // 1e: lload 3
      // 1f: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/l6q.o Ljava/util/Map;
      // 28: aload 2
      // 29: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2e: checkcast java/util/List
      // 31: astore 7
      // 33: astore 6
      // 35: aload 7
      // 37: aload 6
      // 39: lload 3
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: iflt 62
      // 3f: ifnonnull 60
      // 42: ifnonnull 5e
      // 45: goto 52
      // 48: ldc2_w 1297098665419090480
      // 4b: lload 3
      // 4c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
      // 54: ldc2_w 1297098665419090480
      // 57: lload 3
      // 58: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 7
      // 60: aload 5
      // 62: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 67: ireturn
   }

   public synchronized Enumeration U(Object[] var1) {
      long var2 = (Long)var1[0];
      return Collections.enumeration(this.o.keySet());
   }

   public l6q(int var1, boolean var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 123316228164617L;
      this(false, var1, 5, var5, var2);
   }

   public Enumeration H(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Object
      // 11: astore 4
      // 13: pop
      // 14: ldc2_w 468435717504637110
      // 17: lload 2
      // 18: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: astore 5
      // 1f: aload 0
      // 20: getfield com/zelix/l6q.o Ljava/util/Map;
      // 23: aload 4
      // 25: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a: checkcast java/util/List
      // 2d: dup
      // 2e: astore 6
      // 30: aload 5
      // 32: ifnonnull 53
      // 35: ifnonnull 51
      // 38: goto 45
      // 3b: ldc2_w 2103545116871107841
      // 3e: lload 2
      // 3f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aconst_null
      // 46: areturn
      // 47: ldc2_w 2103545116871107841
      // 4a: lload 2
      // 4b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 6
      // 53: invokestatic java/util/Collections.enumeration (Ljava/util/Collection;)Ljava/util/Enumeration;
      // 56: areturn
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
      // 00e: checkcast com/zelix/l6q
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/l6q.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 15176814787149
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w -8142958895802183480
      // 025: lload 3
      // 026: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 7
      // 02d: aload 0
      // 02e: aload 7
      // 030: ifnonnull 07c
      // 033: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 036: ifnull 07b
      // 039: goto 046
      // 03c: ldc2_w -7687896450549764737
      // 03f: lload 3
      // 040: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: aload 0
      // 047: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 04a: lload 5
      // 04c: dup2_x1
      // 04d: pop2
      // 04e: bipush 2
      // 04f: anewarray 142
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
      // 060: ldc2_w -7907530344287954420
      // 063: lload 3
      // 064: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: aload 0
      // 06a: aconst_null
      // 06b: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 06e: goto 07b
      // 071: ldc2_w -7687896450549764737
      // 074: lload 3
      // 075: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 2
      // 07c: getfield com/zelix/l6q.o Ljava/util/Map;
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
      // 0b7: getfield com/zelix/l6q.o Ljava/util/Map;
      // 0ba: aload 10
      // 0bc: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c1: checkcast java/util/List
      // 0c4: astore 12
      // 0c6: aload 12
      // 0c8: aload 7
      // 0ca: ifnonnull 13a
      // 0cd: ifnonnull 12b
      // 0d0: goto 0dd
      // 0d3: ldc2_w -7687896450549764737
      // 0d6: lload 3
      // 0d7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield com/zelix/l6q.J Z
      // 0e1: ifeq 107
      // 0e4: goto 0f1
      // 0e7: ldc2_w -7687896450549764737
      // 0ea: lload 3
      // 0eb: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
      // 113: getfield com/zelix/l6q.o Ljava/util/Map;
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
      // 130: ldc2_w -7687896450549764737
      // 133: lload 3
      // 134: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 11
      // 13c: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 141: pop
      // 142: aload 7
      // 144: ifnull 08b
      // 147: return
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 86262356159151
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 6781336637669720106
      // 18: lload 2
      // 19: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: getfield com/zelix/l6q.o Ljava/util/Map;
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
      // 66: ldc2_w 5020767360647265693
      // 69: lload 2
      // 6a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 0
      // 71: getfield com/zelix/l6q.o Ljava/util/Map;
      // 74: invokeinterface java/util/Map.clear ()V 1
      // 79: aload 0
      // 7a: lload 2
      // 7b: lconst_0
      // 7c: lcmp
      // 7d: ifle c9
      // 80: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 83: aload 6
      // 85: ifnonnull a9
      // 88: ifnull cd
      // 8b: goto 98
      // 8e: ldc2_w 5020767360647265693
      // 91: lload 2
      // 92: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: aload 0
      // 99: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 9c: goto a9
      // 9f: ldc2_w 5020767360647265693
      // a2: lload 2
      // a3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: athrow
      // a9: lload 4
      // ab: dup2_x1
      // ac: pop2
      // ad: bipush 2
      // ae: anewarray 142
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
      // bf: ldc2_w 4800991912325008110
      // c2: lload 2
      // c3: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: aload 0
      // c9: aconst_null
      // ca: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // cd: return
   }

   public l6q(int var1, long var2, int var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 74100027553480L;
      this(false, var1, var4, var5, false);
   }

   public List t(char var1, Object var2, int var3, short var4) {
      return (List)this.o.get(var2);
   }

   public void t(Object param1, Object param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 3
      // 01: dup2
      // 02: ldc2_w 71361579091962
      // 05: lxor
      // 06: lstore 5
      // 08: pop2
      // 09: ldc2_w 8307218462119259519
      // 0c: lload 3
      // 0d: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: astore 7
      // 14: aload 0
      // 15: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 18: aload 7
      // 1a: ifnonnull 6c
      // 1d: ifnull 62
      // 20: goto 2d
      // 23: ldc2_w 7563892071812780232
      // 26: lload 3
      // 27: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 31: lload 5
      // 33: dup2_x1
      // 34: pop2
      // 35: bipush 2
      // 36: anewarray 142
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
      // 47: ldc2_w 8067497410230609851
      // 4a: lload 3
      // 4b: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: aload 0
      // 51: aconst_null
      // 52: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 55: goto 62
      // 58: ldc2_w 7563892071812780232
      // 5b: lload 3
      // 5c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: getfield com/zelix/l6q.o Ljava/util/Map;
      // 66: aload 1
      // 67: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6c: checkcast java/util/List
      // 6f: astore 8
      // 71: aload 8
      // 73: aload 7
      // 75: lload 3
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle d7
      // 7b: ifnonnull d6
      // 7e: ifnonnull d4
      // 81: goto 8e
      // 84: ldc2_w 7563892071812780232
      // 87: lload 3
      // 88: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield com/zelix/l6q.J Z
      // 92: ifeq ba
      // 95: goto a2
      // 98: ldc2_w 7563892071812780232
      // 9b: lload 3
      // 9c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: athrow
      // a2: new java/util/Vector
      // a5: dup
      // a6: aload 0
      // a7: getfield com/zelix/l6q.T I
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
      // bf: getfield com/zelix/l6q.T I
      // c2: invokespecial java/util/ArrayList.<init> (I)V
      // c5: astore 8
      // c7: aload 0
      // c8: getfield com/zelix/l6q.o Ljava/util/Map;
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

   public Enumeration p(Object[] param1) {
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
      // 00e: ldc2_w 71811910836617
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 117074607214588
      // 018: lxor
      // 019: dup2
      // 01a: bipush 32
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 6
      // 020: dup2
      // 021: bipush 32
      // 023: lshl
      // 024: bipush 56
      // 026: lushr
      // 027: l2i
      // 028: istore 7
      // 02a: dup2
      // 02b: bipush 40
      // 02d: lshl
      // 02e: bipush 40
      // 030: lushr
      // 031: l2i
      // 032: istore 8
      // 034: pop2
      // 035: pop2
      // 036: ldc2_w -5973085692725710035
      // 039: lload 2
      // 03a: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: astore 9
      // 041: aload 0
      // 042: aload 9
      // 044: ifnonnull 0eb
      // 047: getfield com/zelix/l6q.J Z
      // 04a: ifeq 0dd
      // 04d: goto 05a
      // 050: ldc2_w -5284364090364817766
      // 053: lload 2
      // 054: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: athrow
      // 05a: aload 0
      // 05b: getfield com/zelix/l6q.o Ljava/util/Map;
      // 05e: dup
      // 05f: astore 10
      // 061: monitorenter
      // 062: aload 0
      // 063: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 066: aload 9
      // 068: ifnonnull 0ab
      // 06b: ifnonnull 09a
      // 06e: aload 0
      // 06f: new com/zelix/w9
      // 072: dup
      // 073: iload 6
      // 075: aload 0
      // 076: aconst_null
      // 077: iload 7
      // 079: i2b
      // 07a: iload 8
      // 07c: invokespecial com/zelix/w9.<init> (ILcom/zelix/l6q;Lcom/zelix/rz;BI)V
      // 07f: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 082: lload 2
      // 083: lconst_0
      // 084: lcmp
      // 085: iflt 0cd
      // 088: aload 9
      // 08a: ifnull 0ca
      // 08d: goto 09a
      // 090: ldc2_w -5284364090364817766
      // 093: lload 2
      // 094: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 09e: goto 0ab
      // 0a1: ldc2_w -5284364090364817766
      // 0a4: lload 2
      // 0a5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: lload 4
      // 0ad: dup2_x1
      // 0ae: pop2
      // 0af: bipush 2
      // 0b0: anewarray 142
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 1
      // 0b6: swap
      // 0b7: aastore
      // 0b8: dup_x2
      // 0b9: dup_x2
      // 0ba: pop
      // 0bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0be: bipush 0
      // 0bf: swap
      // 0c0: aastore
      // 0c1: ldc2_w -5250180737215939186
      // 0c4: lload 2
      // 0c5: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: aload 10
      // 0cc: monitorexit
      // 0cd: goto 0d8
      // 0d0: astore 11
      // 0d2: aload 10
      // 0d4: monitorexit
      // 0d5: aload 11
      // 0d7: athrow
      // 0d8: aload 9
      // 0da: ifnull 15f
      // 0dd: aload 0
      // 0de: goto 0eb
      // 0e1: ldc2_w -5284364090364817766
      // 0e4: lload 2
      // 0e5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 0ee: aload 9
      // 0f0: ifnonnull 140
      // 0f3: ifnonnull 12f
      // 0f6: goto 103
      // 0f9: ldc2_w -5284364090364817766
      // 0fc: lload 2
      // 0fd: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: aload 0
      // 104: lload 2
      // 105: lconst_0
      // 106: lcmp
      // 107: ifle 160
      // 10a: new com/zelix/w9
      // 10d: dup
      // 10e: iload 6
      // 110: aload 0
      // 111: aconst_null
      // 112: iload 7
      // 114: i2b
      // 115: iload 8
      // 117: invokespecial com/zelix/w9.<init> (ILcom/zelix/l6q;Lcom/zelix/rz;BI)V
      // 11a: putfield com/zelix/l6q.P Lcom/zelix/w9;
      // 11d: aload 9
      // 11f: ifnull 15f
      // 122: goto 12f
      // 125: ldc2_w -5284364090364817766
      // 128: lload 2
      // 129: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 133: goto 140
      // 136: ldc2_w -5284364090364817766
      // 139: lload 2
      // 13a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: lload 4
      // 142: dup2_x1
      // 143: pop2
      // 144: bipush 2
      // 145: anewarray 142
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x2
      // 14e: dup_x2
      // 14f: pop
      // 150: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w -5250180737215939186
      // 159: lload 2
      // 15a: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: aload 0
      // 160: getfield com/zelix/l6q.P Lcom/zelix/w9;
      // 163: areturn
   }

   static {
      long var11 = a ^ 86979074366919L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("z\u0001¦\u0000Æ5\u0083\u0015³\u0096¸ \u0097\u0014ö÷".getBytes("ISO-8859-1"));
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
      String var4 = "/\u0082\u008d\u0084\u001c\u00967¥Æ(\u0098l\u008eSlÌ";
      int var5 = "/\u0082\u008d\u0084\u001c\u00967¥Æ(\u0098l\u008eSlÌ".length();
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

                  var4 = "¨Ð\u0087\týÏ\u0015k\u0017\u0010{Ò]ÔS\u0005";
                  var5 = "¨Ð\u0087\týÏ\u0015k\u0017\u0010{Ò]ÔS\u0005".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29667;
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
            throw new RuntimeException("com/zelix/l6q", var14);
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
         throw new RuntimeException("com/zelix/l6q" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
