package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _nj extends _n7 {
   _gz k;
   Set K;
   String D;
   List r;
   List y;
   String b;
   String V;
   private static final long f = ess.a(6974655510104287858L, -3097666202301612166L, MethodHandles.lookup().lookupClass()).a(107382898268308L);
   private static final String[] n;
   private static final String[] o;
   private static final Map p = new HashMap(13);
   private static final long[] z;
   private static final Integer[] A;
   private static final Map B;

   abstract boolean Y(Object[] var1);

   public final void N(Object[] var1) {
      int var4 = (Integer)var1[0];
      xs var2 = (xs)var1[1];
      int var5 = (Integer)var1[2];
      int var3 = (Integer)var1[3];
      long var6 = ((long)var4 << 48 | (long)var5 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ f;
      x44.a<"j">(this, -4719061225186687823L, var6).add(var2);
   }

   private String U(Object[] param1) {
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
      // 00c: getstatic com/zelix/_nj.f J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 65336871612744
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 123450530242043
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 5810996979985
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 87790279455360
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 116179056537409
      // 033: lxor
      // 034: lstore 12
      // 036: pop2
      // 037: new java/lang/StringBuilder
      // 03a: dup
      // 03b: invokespecial java/lang/StringBuilder.<init> ()V
      // 03e: astore 15
      // 040: ldc2_w -6016100159153686878
      // 043: lload 2
      // 044: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: new java/util/LinkedHashSet
      // 04c: dup
      // 04d: invokespecial java/util/LinkedHashSet.<init> ()V
      // 050: astore 16
      // 052: istore 14
      // 054: iload 14
      // 056: ifne 16b
      // 059: aload 0
      // 05a: ldc2_w -5872475063565406033
      // 05d: lload 2
      // 05e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_gz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: ifnull 159
      // 066: goto 073
      // 069: ldc2_w -5620505021883908881
      // 06c: lload 2
      // 06d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: aload 0
      // 074: ldc2_w -5872475063565406033
      // 077: lload 2
      // 078: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_gz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: lload 8
      // 07f: bipush 1
      // 080: anewarray 337
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: ldc2_w -5920915567315493437
      // 08f: lload 2
      // 090: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_q4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: astore 17
      // 097: aload 17
      // 099: lload 10
      // 09b: bipush 1
      // 09c: anewarray 337
      // 09f: dup_x2
      // 0a0: dup_x2
      // 0a1: pop
      // 0a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a5: bipush 0
      // 0a6: swap
      // 0a7: aastore
      // 0a8: ldc2_w -5466521168397593722
      // 0ab: lload 2
      // 0ac: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: iload 14
      // 0b3: lload 2
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: ifle 117
      // 0b9: ifne 115
      // 0bc: ifeq 0fb
      // 0bf: goto 0cc
      // 0c2: ldc2_w -5620505021883908881
      // 0c5: lload 2
      // 0c6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 16
      // 0ce: aload 17
      // 0d0: lload 4
      // 0d2: bipush 1
      // 0d3: anewarray 337
      // 0d6: dup_x2
      // 0d7: dup_x2
      // 0d8: pop
      // 0d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dc: bipush 0
      // 0dd: swap
      // 0de: aastore
      // 0df: ldc2_w -5748478035149157150
      // 0e2: lload 2
      // 0e3: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 0ed: pop
      // 0ee: goto 0fb
      // 0f1: ldc2_w -5620505021883908881
      // 0f4: lload 2
      // 0f5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 17
      // 0fd: lload 6
      // 0ff: bipush 1
      // 100: anewarray 337
      // 103: dup_x2
      // 104: dup_x2
      // 105: pop
      // 106: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 109: bipush 0
      // 10a: swap
      // 10b: aastore
      // 10c: ldc2_w -5809349245600369044
      // 10f: lload 2
      // 110: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iload 14
      // 117: ifne 172
      // 11a: ifeq 159
      // 11d: goto 12a
      // 120: ldc2_w -5620505021883908881
      // 123: lload 2
      // 124: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: aload 16
      // 12c: aload 17
      // 12e: lload 12
      // 130: bipush 1
      // 131: anewarray 337
      // 134: dup_x2
      // 135: dup_x2
      // 136: pop
      // 137: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13a: bipush 0
      // 13b: swap
      // 13c: aastore
      // 13d: ldc2_w -5377523922437220232
      // 140: lload 2
      // 141: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 14b: pop
      // 14c: goto 159
      // 14f: ldc2_w -5620505021883908881
      // 152: lload 2
      // 153: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: aload 16
      // 15b: aload 0
      // 15c: ldc2_w -5618462248252729751
      // 15f: lload 2
      // 160: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 16a: pop
      // 16b: aload 16
      // 16d: invokeinterface java/util/Set.size ()I 1
      // 172: istore 17
      // 174: bipush 0
      // 175: istore 18
      // 177: aload 16
      // 179: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 17e: astore 19
      // 180: aload 19
      // 182: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 187: ifeq 205
      // 18a: aload 19
      // 18c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 191: checkcast java/lang/String
      // 194: lload 2
      // 195: lconst_0
      // 196: lcmp
      // 197: iflt 20a
      // 19a: astore 20
      // 19c: aload 15
      // 19e: aload 20
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a3: iload 14
      // 1a5: ifne 207
      // 1a8: pop
      // 1a9: iload 14
      // 1ab: lload 2
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: iflt 202
      // 1b1: ifne 200
      // 1b4: goto 1c1
      // 1b7: ldc2_w -5620505021883908881
      // 1ba: lload 2
      // 1bb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: lload 2
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: ifle 200
      // 1c7: iload 18
      // 1c9: iload 17
      // 1cb: bipush 1
      // 1cc: isub
      // 1cd: if_icmpge 1fd
      // 1d0: goto 1dd
      // 1d3: ldc2_w -5620505021883908881
      // 1d6: lload 2
      // 1d7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 15
      // 1df: sipush 15231
      // 1e2: ldc2_w 4282908555871169226
      // 1e5: lload 2
      // 1e6: lxor
      // 1e7: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ef: pop
      // 1f0: goto 1fd
      // 1f3: ldc2_w -5620505021883908881
      // 1f6: lload 2
      // 1f7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: iinc 18 1
      // 200: iload 14
      // 202: ifeq 180
      // 205: aload 15
      // 207: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20a: areturn
   }

   public void m(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = f ^ var3;
      x44.a<"p">(this, var2, -2929260233309440926L, var3);
   }

   List l(Object[] var1) {
      long var3 = (Long)var1[0];
      _uu var2 = (_uu)var1[1];
      var3 = f ^ var3;
      long var5 = var3 ^ 69617435967322L;
      long var7 = var3 ^ 18968314175271L;
      long var9 = var3 ^ 56787013148701L;
      long var11 = var3 ^ 68887980900526L;
      int var10000 = x44.a<"r">(1551765150444600874L, var3);
      ArrayList var14 = new ArrayList(x44.a<"n">(this, 591929242461155845L, var3).size());
      int var13 = var10000;

      label34:
      for (xs var16 : x44.a<"n">(this, 591929242461155845L, var3)) {
         String var17 = x44.a<"j">(
            this, new Object[]{var11, x44.a<"j">(var16, new Object[]{var9}, 1586330595315136398L, var3), var2}, 1515040022472547859L, var3
         );

         do {
            try {
               if (var3 >= 0L) {
                  if (var13 == 0) {
                     return var14;
                  }

                  var14.add(
                     new p3(
                        var17,
                        x44.a<"j">(var16, new Object[]{var5}, 593112662199443343L, var3),
                        x44.a<"j">(var16, new Object[]{var7}, 1584283022748871703L, var3)
                     )
                  );
               }

               if (var13 != 0) {
                  continue label34;
               }
            } catch (gj var18) {
               throw x44.a<"r">(var18, 690167734198453379L, var3);
            }
         } while (var3 <= 0L);
         break;
      }

      return var14;
   }

   private static String A(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 1
      // 12: pop
      // 13: getstatic com/zelix/_nj.f J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -4809930142632827105
      // 1c: lload 2
      // 1d: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: iload 4
      // 27: ifne 75
      // 2a: sipush 30685
      // 2d: ldc2_w 6078418033537524329
      // 30: lload 2
      // 31: lxor
      // 32: invokedynamic n (IJ)I bsm=com/zelix/_nj.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: invokevirtual java/lang/String.indexOf (I)I
      // 3a: bipush -1
      // 3b: if_icmple 57
      // 3e: goto 4b
      // 41: ldc2_w -6898737595361301166
      // 44: lload 2
      // 45: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 1
      // 4c: areturn
      // 4d: ldc2_w -6898737595361301166
      // 50: lload 2
      // 51: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: new java/lang/StringBuilder
      // 5a: dup
      // 5b: invokespecial java/lang/StringBuilder.<init> ()V
      // 5e: sipush 28832
      // 61: ldc2_w 8125523060538929324
      // 64: lload 2
      // 65: lxor
      // 66: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: aload 1
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 75: areturn
   }

   public _nj(long var1, int var3) {
      var1 = f ^ var1;
      long var4 = var1 ^ 113711393780350L;
      super(var4, var3);
      x44.a<"u">(this, new LinkedHashSet(), -4539904951858731887L, var1);
      x44.a<"u">(this, new ArrayList(), -4421755053244483439L, var1);
   }

   void k(Object[] var1) {
      _gz var4 = (_gz)var1[0];
      long var2 = (Long)var1[1];
      var2 = f ^ var2;
      x44.a<"t">(this, var4, -5210116675553580642L, var2);
   }

   String p(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: aload 1
      // 0001: dup
      // 0002: bipush 0
      // 0003: aaload
      // 0004: checkcast java/lang/Long
      // 0007: invokevirtual java/lang/Long.longValue ()J
      // 000a: lstore 3
      // 000b: dup
      // 000c: bipush 1
      // 000d: aaload
      // 000e: checkcast java/lang/String
      // 0011: astore 2
      // 0012: dup
      // 0013: bipush 2
      // 0014: aaload
      // 0015: checkcast com/zelix/_uu
      // 0018: astore 5
      // 001a: pop
      // 001b: getstatic com/zelix/_nj.f J
      // 001e: lload 3
      // 001f: lxor
      // 0020: lstore 3
      // 0021: lload 3
      // 0022: dup2
      // 0023: ldc2_w 93871394718781
      // 0026: lxor
      // 0027: lstore 6
      // 0029: dup2
      // 002a: ldc2_w 77054866806324
      // 002d: lxor
      // 002e: lstore 8
      // 0030: dup2
      // 0031: ldc2_w 51189408005328
      // 0034: lxor
      // 0035: lstore 10
      // 0037: dup2
      // 0038: ldc2_w 13158541371775
      // 003b: lxor
      // 003c: lstore 12
      // 003e: dup2
      // 003f: ldc2_w 103843622979843
      // 0042: lxor
      // 0043: lstore 14
      // 0045: dup2
      // 0046: ldc2_w 16690157052637
      // 0049: lxor
      // 004a: lstore 16
      // 004c: dup2
      // 004d: ldc2_w 23478544098736
      // 0050: lxor
      // 0051: lstore 18
      // 0053: dup2
      // 0054: ldc2_w 54135195000851
      // 0057: lxor
      // 0058: lstore 20
      // 005a: dup2
      // 005b: ldc2_w 93645434970170
      // 005e: lxor
      // 005f: lstore 22
      // 0061: dup2
      // 0062: ldc2_w 133665579012391
      // 0065: lxor
      // 0066: lstore 24
      // 0068: dup2
      // 0069: ldc2_w 47029139835595
      // 006c: lxor
      // 006d: lstore 26
      // 006f: dup2
      // 0070: ldc2_w 42415744418413
      // 0073: lxor
      // 0074: lstore 28
      // 0076: dup2
      // 0077: ldc2_w 114695804226843
      // 007a: lxor
      // 007b: lstore 30
      // 007d: dup2
      // 007e: ldc2_w 50147167076825
      // 0081: lxor
      // 0082: lstore 32
      // 0084: dup2
      // 0085: ldc2_w 89746528291989
      // 0088: lxor
      // 0089: lstore 34
      // 008b: dup2
      // 008c: ldc2_w 105920020238682
      // 008f: lxor
      // 0090: lstore 36
      // 0092: dup2
      // 0093: ldc2_w 67297502509250
      // 0096: lxor
      // 0097: lstore 38
      // 0099: dup2
      // 009a: ldc2_w 13982738044682
      // 009d: lxor
      // 009e: lstore 40
      // 00a0: dup2
      // 00a1: ldc2_w 102578422073345
      // 00a4: lxor
      // 00a5: lstore 42
      // 00a7: pop2
      // 00a8: ldc2_w -3049046209545535987
      // 00ab: lload 3
      // 00ac: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00b1: bipush 0
      // 00b2: istore 45
      // 00b4: istore 44
      // 00b6: aconst_null
      // 00b7: astore 46
      // 00b9: aload 2
      // 00ba: ldc "<"
      // 00bc: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 00bf: iload 44
      // 00c1: ifeq 00f3
      // 00c4: bipush -1
      // 00c5: if_icmple 059e
      // 00c8: goto 00d5
      // 00cb: ldc2_w -3912342285130922844
      // 00ce: lload 3
      // 00cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00d4: athrow
      // 00d5: aload 2
      // 00d6: sipush 28905
      // 00d9: ldc2_w 4489757799792056581
      // 00dc: lload 3
      // 00dd: lxor
      // 00de: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 00e6: goto 00f3
      // 00e9: ldc2_w -3912342285130922844
      // 00ec: lload 3
      // 00ed: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f2: athrow
      // 00f3: ifeq 04ec
      // 00f6: aload 0
      // 00f7: ldc2_w -2969101311588480796
      // 00fa: lload 3
      // 00fb: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_gz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0100: iload 44
      // 0102: ifeq 0139
      // 0105: goto 0112
      // 0108: ldc2_w -3912342285130922844
      // 010b: lload 3
      // 010c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0111: athrow
      // 0112: ifnull 043c
      // 0115: goto 0122
      // 0118: ldc2_w -3912342285130922844
      // 011b: lload 3
      // 011c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0121: athrow
      // 0122: aload 0
      // 0123: ldc2_w -2969101311588480796
      // 0126: lload 3
      // 0127: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_gz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012c: goto 0139
      // 012f: ldc2_w -3912342285130922844
      // 0132: lload 3
      // 0133: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0138: athrow
      // 0139: lload 36
      // 013b: bipush 1
      // 013c: anewarray 337
      // 013f: dup_x2
      // 0140: dup_x2
      // 0141: pop
      // 0142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0145: bipush 0
      // 0146: swap
      // 0147: aastore
      // 0148: ldc2_w -3053498044515146360
      // 014b: lload 3
      // 014c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_q4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0151: astore 46
      // 0153: aload 46
      // 0155: lload 42
      // 0157: bipush 1
      // 0158: anewarray 337
      // 015b: dup_x2
      // 015c: dup_x2
      // 015d: pop
      // 015e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0161: bipush 0
      // 0162: swap
      // 0163: aastore
      // 0164: ldc2_w -3788217656605356726
      // 0167: lload 3
      // 0168: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016d: astore 47
      // 016f: aload 47
      // 0171: iload 44
      // 0173: ifeq 01a1
      // 0176: invokeinterface java/util/List.size ()I 1
      // 017b: bipush 1
      // 017c: if_icmpne 035c
      // 017f: goto 018c
      // 0182: ldc2_w -3912342285130922844
      // 0185: lload 3
      // 0186: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018b: athrow
      // 018c: aload 47
      // 018e: bipush 0
      // 018f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0194: goto 01a1
      // 0197: ldc2_w -3912342285130922844
      // 019a: lload 3
      // 019b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a0: athrow
      // 01a1: checkcast com/zelix/xs
      // 01a4: lload 22
      // 01a6: bipush 1
      // 01a7: anewarray 337
      // 01aa: dup_x2
      // 01ab: dup_x2
      // 01ac: pop
      // 01ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 01b0: bipush 0
      // 01b1: swap
      // 01b2: aastore
      // 01b3: ldc2_w -3016107953803855959
      // 01b6: lload 3
      // 01b7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01bc: astore 48
      // 01be: aload 48
      // 01c0: sipush 13968
      // 01c3: ldc2_w 1312118285795352423
      // 01c6: lload 3
      // 01c7: lxor
      // 01c8: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01cd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01d0: lload 3
      // 01d1: lconst_0
      // 01d2: lcmp
      // 01d3: ifle 022a
      // 01d6: iload 44
      // 01d8: ifeq 022a
      // 01db: ifeq 0204
      // 01de: goto 01eb
      // 01e1: ldc2_w -3912342285130922844
      // 01e4: lload 3
      // 01e5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01ea: athrow
      // 01eb: sipush 14262
      // 01ee: ldc2_w 6364377032933367387
      // 01f1: lload 3
      // 01f2: lxor
      // 01f3: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f8: astore 2
      // 01f9: iload 44
      // 01fb: lload 3
      // 01fc: lconst_0
      // 01fd: lcmp
      // 01fe: iflt 0359
      // 0201: ifne 0351
      // 0204: aload 48
      // 0206: iload 44
      // 0208: ifeq 0240
      // 020b: goto 0218
      // 020e: ldc2_w -3912342285130922844
      // 0211: lload 3
      // 0212: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0217: athrow
      // 0218: ldc "*"
      // 021a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 021d: goto 022a
      // 0220: ldc2_w -3912342285130922844
      // 0223: lload 3
      // 0224: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0229: athrow
      // 022a: ifeq 028a
      // 022d: aload 48
      // 022f: bipush 1
      // 0230: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0233: goto 0240
      // 0236: ldc2_w -3912342285130922844
      // 0239: lload 3
      // 023a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023f: athrow
      // 0240: astore 49
      // 0242: aload 49
      // 0244: invokevirtual java/lang/String.length ()I
      // 0247: iload 44
      // 0249: ifeq 027d
      // 024c: ifle 027f
      // 024f: goto 025c
      // 0252: ldc2_w -3912342285130922844
      // 0255: lload 3
      // 0256: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025b: athrow
      // 025c: new java/lang/StringBuilder
      // 025f: dup
      // 0260: invokespecial java/lang/StringBuilder.<init> ()V
      // 0263: sipush 3907
      // 0266: ldc2_w 338744702289831615
      // 0269: lload 3
      // 026a: lxor
      // 026b: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0270: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0273: aload 49
      // 0275: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0278: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 027b: astore 2
      // 027c: bipush 1
      // 027d: istore 45
      // 027f: iload 44
      // 0281: lload 3
      // 0282: lconst_0
      // 0283: lcmp
      // 0284: iflt 0359
      // 0287: ifne 0351
      // 028a: aload 5
      // 028c: new java/lang/StringBuilder
      // 028f: dup
      // 0290: invokespecial java/lang/StringBuilder.<init> ()V
      // 0293: sipush 21055
      // 0296: ldc2_w 7963500170020764615
      // 0299: lload 3
      // 029a: lxor
      // 029b: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02a3: aload 0
      // 02a4: lload 6
      // 02a6: bipush 1
      // 02a7: anewarray 337
      // 02aa: dup_x2
      // 02ab: dup_x2
      // 02ac: pop
      // 02ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 02b0: bipush 0
      // 02b1: swap
      // 02b2: aastore
      // 02b3: ldc2_w -3046458487457859258
      // 02b6: lload 3
      // 02b7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02bf: sipush 10124
      // 02c2: ldc2_w 6774223987754847846
      // 02c5: lload 3
      // 02c6: lxor
      // 02c7: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02cf: aload 0
      // 02d0: lload 8
      // 02d2: bipush 1
      // 02d3: anewarray 337
      // 02d6: dup_x2
      // 02d7: dup_x2
      // 02d8: pop
      // 02d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 02dc: bipush 0
      // 02dd: swap
      // 02de: aastore
      // 02df: ldc2_w -3779650690414350416
      // 02e2: lload 3
      // 02e3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 02eb: sipush 12397
      // 02ee: ldc2_w 5633021546789394822
      // 02f1: lload 3
      // 02f2: lxor
      // 02f3: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02fb: aload 2
      // 02fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02ff: sipush 7279
      // 0302: ldc2_w 7023573983468942727
      // 0305: lload 3
      // 0306: lxor
      // 0307: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 030f: aload 48
      // 0311: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0314: sipush 4610
      // 0317: ldc2_w 8006304469393472491
      // 031a: lload 3
      // 031b: lxor
      // 031c: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0321: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0324: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0327: lload 16
      // 0329: bipush 2
      // 032a: anewarray 337
      // 032d: dup_x2
      // 032e: dup_x2
      // 032f: pop
      // 0330: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0333: bipush 1
      // 0334: swap
      // 0335: aastore
      // 0336: dup_x1
      // 0337: swap
      // 0338: bipush 0
      // 0339: swap
      // 033a: aastore
      // 033b: ldc2_w -3754752422061181496
      // 033e: lload 3
      // 033f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0344: goto 0351
      // 0347: ldc2_w -3912342285130922844
      // 034a: lload 3
      // 034b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0350: athrow
      // 0351: lload 3
      // 0352: lconst_0
      // 0353: lcmp
      // 0354: ifle 042c
      // 0357: iload 44
      // 0359: ifne 0439
      // 035c: aload 5
      // 035e: new java/lang/StringBuilder
      // 0361: dup
      // 0362: invokespecial java/lang/StringBuilder.<init> ()V
      // 0365: sipush 5753
      // 0368: ldc2_w 2161654509796917129
      // 036b: lload 3
      // 036c: lxor
      // 036d: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0372: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0375: aload 0
      // 0376: lload 6
      // 0378: bipush 1
      // 0379: anewarray 337
      // 037c: dup_x2
      // 037d: dup_x2
      // 037e: pop
      // 037f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0382: bipush 0
      // 0383: swap
      // 0384: aastore
      // 0385: ldc2_w -3046458487457859258
      // 0388: lload 3
      // 0389: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0391: sipush 10708
      // 0394: ldc2_w 7433618910973607991
      // 0397: lload 3
      // 0398: lxor
      // 0399: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03a1: aload 0
      // 03a2: lload 8
      // 03a4: bipush 1
      // 03a5: anewarray 337
      // 03a8: dup_x2
      // 03a9: dup_x2
      // 03aa: pop
      // 03ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03ae: bipush 0
      // 03af: swap
      // 03b0: aastore
      // 03b1: ldc2_w -3779650690414350416
      // 03b4: lload 3
      // 03b5: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03ba: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 03bd: sipush 20011
      // 03c0: ldc2_w 821884091834738642
      // 03c3: lload 3
      // 03c4: lxor
      // 03c5: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03cd: aload 2
      // 03ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03d1: sipush 9893
      // 03d4: ldc2_w 5592628892196982593
      // 03d7: lload 3
      // 03d8: lxor
      // 03d9: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03e1: aload 0
      // 03e2: ldc2_w -2969101311588480796
      // 03e5: lload 3
      // 03e6: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_gz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03eb: ldc2_w -3796546647266452899
      // 03ee: lload 3
      // 03ef: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f4: invokeinterface java/util/List.size ()I 1
      // 03f9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 03fc: sipush 29096
      // 03ff: ldc2_w 8211055644874086474
      // 0402: lload 3
      // 0403: lxor
      // 0404: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0409: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 040c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 040f: lload 16
      // 0411: bipush 2
      // 0412: anewarray 337
      // 0415: dup_x2
      // 0416: dup_x2
      // 0417: pop
      // 0418: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 041b: bipush 1
      // 041c: swap
      // 041d: aastore
      // 041e: dup_x1
      // 041f: swap
      // 0420: bipush 0
      // 0421: swap
      // 0422: aastore
      // 0423: ldc2_w -3754752422061181496
      // 0426: lload 3
      // 0427: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042c: goto 0439
      // 042f: ldc2_w -3912342285130922844
      // 0432: lload 3
      // 0433: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0438: athrow
      // 0439: goto 059e
      // 043c: aload 5
      // 043e: new java/lang/StringBuilder
      // 0441: dup
      // 0442: invokespecial java/lang/StringBuilder.<init> ()V
      // 0445: sipush 23255
      // 0448: ldc2_w 1506115780320113452
      // 044b: lload 3
      // 044c: lxor
      // 044d: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0452: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0455: aload 0
      // 0456: lload 6
      // 0458: bipush 1
      // 0459: anewarray 337
      // 045c: dup_x2
      // 045d: dup_x2
      // 045e: pop
      // 045f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0462: bipush 0
      // 0463: swap
      // 0464: aastore
      // 0465: ldc2_w -3046458487457859258
      // 0468: lload 3
      // 0469: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0471: sipush 10708
      // 0474: ldc2_w 7433618910973607991
      // 0477: lload 3
      // 0478: lxor
      // 0479: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0481: aload 0
      // 0482: lload 8
      // 0484: bipush 1
      // 0485: anewarray 337
      // 0488: dup_x2
      // 0489: dup_x2
      // 048a: pop
      // 048b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 048e: bipush 0
      // 048f: swap
      // 0490: aastore
      // 0491: ldc2_w -3779650690414350416
      // 0494: lload 3
      // 0495: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 049d: sipush 5925
      // 04a0: ldc2_w 2293147436942294724
      // 04a3: lload 3
      // 04a4: lxor
      // 04a5: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04ad: aload 2
      // 04ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04b1: sipush 31383
      // 04b4: ldc2_w 3796702662425023353
      // 04b7: lload 3
      // 04b8: lxor
      // 04b9: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04c4: lload 16
      // 04c6: bipush 2
      // 04c7: anewarray 337
      // 04ca: dup_x2
      // 04cb: dup_x2
      // 04cc: pop
      // 04cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04d0: bipush 1
      // 04d1: swap
      // 04d2: aastore
      // 04d3: dup_x1
      // 04d4: swap
      // 04d5: bipush 0
      // 04d6: swap
      // 04d7: aastore
      // 04d8: ldc2_w -3754752422061181496
      // 04db: lload 3
      // 04dc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e1: lload 3
      // 04e2: lconst_0
      // 04e3: lcmp
      // 04e4: ifle 0591
      // 04e7: iload 44
      // 04e9: ifne 059e
      // 04ec: aload 5
      // 04ee: new java/lang/StringBuilder
      // 04f1: dup
      // 04f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 04f5: sipush 5753
      // 04f8: ldc2_w 2161654509796917129
      // 04fb: lload 3
      // 04fc: lxor
      // 04fd: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0502: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0505: aload 0
      // 0506: lload 6
      // 0508: bipush 1
      // 0509: anewarray 337
      // 050c: dup_x2
      // 050d: dup_x2
      // 050e: pop
      // 050f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0512: bipush 0
      // 0513: swap
      // 0514: aastore
      // 0515: ldc2_w -3046458487457859258
      // 0518: lload 3
      // 0519: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0521: sipush 10708
      // 0524: ldc2_w 7433618910973607991
      // 0527: lload 3
      // 0528: lxor
      // 0529: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0531: aload 0
      // 0532: lload 8
      // 0534: bipush 1
      // 0535: anewarray 337
      // 0538: dup_x2
      // 0539: dup_x2
      // 053a: pop
      // 053b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 053e: bipush 0
      // 053f: swap
      // 0540: aastore
      // 0541: ldc2_w -3779650690414350416
      // 0544: lload 3
      // 0545: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 054d: sipush 20011
      // 0550: ldc2_w 821884091834738642
      // 0553: lload 3
      // 0554: lxor
      // 0555: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 055d: aload 2
      // 055e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0561: sipush 13437
      // 0564: ldc2_w 3921211986998386075
      // 0567: lload 3
      // 0568: lxor
      // 0569: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0571: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0574: lload 16
      // 0576: bipush 2
      // 0577: anewarray 337
      // 057a: dup_x2
      // 057b: dup_x2
      // 057c: pop
      // 057d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0580: bipush 1
      // 0581: swap
      // 0582: aastore
      // 0583: dup_x1
      // 0584: swap
      // 0585: bipush 0
      // 0586: swap
      // 0587: aastore
      // 0588: ldc2_w -3754752422061181496
      // 058b: lload 3
      // 058c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0591: goto 059e
      // 0594: ldc2_w -3912342285130922844
      // 0597: lload 3
      // 0598: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059d: athrow
      // 059e: new java/lang/StringBuilder
      // 05a1: dup
      // 05a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 05a5: astore 47
      // 05a7: aload 46
      // 05a9: iload 44
      // 05ab: lload 3
      // 05ac: lconst_0
      // 05ad: lcmp
      // 05ae: ifle 05c8
      // 05b1: ifeq 05c6
      // 05b4: ifnull 06f6
      // 05b7: goto 05c4
      // 05ba: ldc2_w -3912342285130922844
      // 05bd: lload 3
      // 05be: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c3: athrow
      // 05c4: aload 46
      // 05c6: iload 44
      // 05c8: ifeq 0602
      // 05cb: lload 24
      // 05cd: bipush 1
      // 05ce: anewarray 337
      // 05d1: dup_x2
      // 05d2: dup_x2
      // 05d3: pop
      // 05d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d7: bipush 0
      // 05d8: swap
      // 05d9: aastore
      // 05da: ldc2_w -3145223599691876656
      // 05dd: lload 3
      // 05de: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e3: ifeq 06f6
      // 05e6: goto 05f3
      // 05e9: ldc2_w -3912342285130922844
      // 05ec: lload 3
      // 05ed: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f2: athrow
      // 05f3: aload 46
      // 05f5: goto 0602
      // 05f8: ldc2_w -3912342285130922844
      // 05fb: lload 3
      // 05fc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0601: athrow
      // 0602: lload 34
      // 0604: bipush 1
      // 0605: anewarray 337
      // 0608: dup_x2
      // 0609: dup_x2
      // 060a: pop
      // 060b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 060e: bipush 0
      // 060f: swap
      // 0610: aastore
      // 0611: ldc2_w -3078205619205812635
      // 0614: lload 3
      // 0615: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061a: astore 48
      // 061c: lload 3
      // 061d: lconst_0
      // 061e: lcmp
      // 061f: ifle 06e1
      // 0622: iload 45
      // 0624: ifeq 06ee
      // 0627: aload 5
      // 0629: new java/lang/StringBuilder
      // 062c: dup
      // 062d: invokespecial java/lang/StringBuilder.<init> ()V
      // 0630: sipush 5753
      // 0633: ldc2_w 2161654509796917129
      // 0636: lload 3
      // 0637: lxor
      // 0638: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0640: aload 0
      // 0641: lload 6
      // 0643: bipush 1
      // 0644: anewarray 337
      // 0647: dup_x2
      // 0648: dup_x2
      // 0649: pop
      // 064a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 064d: bipush 0
      // 064e: swap
      // 064f: aastore
      // 0650: ldc2_w -3046458487457859258
      // 0653: lload 3
      // 0654: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0659: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 065c: sipush 10708
      // 065f: ldc2_w 7433618910973607991
      // 0662: lload 3
      // 0663: lxor
      // 0664: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0669: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066c: aload 0
      // 066d: lload 8
      // 066f: bipush 1
      // 0670: anewarray 337
      // 0673: dup_x2
      // 0674: dup_x2
      // 0675: pop
      // 0676: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0679: bipush 0
      // 067a: swap
      // 067b: aastore
      // 067c: ldc2_w -3779650690414350416
      // 067f: lload 3
      // 0680: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0685: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0688: sipush 20011
      // 068b: ldc2_w 821884091834738642
      // 068e: lload 3
      // 068f: lxor
      // 0690: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0695: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0698: aload 48
      // 069a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 069d: sipush 20906
      // 06a0: ldc2_w 3231584579092199519
      // 06a3: lload 3
      // 06a4: lxor
      // 06a5: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06ad: aload 2
      // 06ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06b1: sipush 15951
      // 06b4: ldc2_w 4640057122774013856
      // 06b7: lload 3
      // 06b8: lxor
      // 06b9: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06c4: lload 16
      // 06c6: bipush 2
      // 06c7: anewarray 337
      // 06ca: dup_x2
      // 06cb: dup_x2
      // 06cc: pop
      // 06cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06d0: bipush 1
      // 06d1: swap
      // 06d2: aastore
      // 06d3: dup_x1
      // 06d4: swap
      // 06d5: bipush 0
      // 06d6: swap
      // 06d7: aastore
      // 06d8: ldc2_w -3754752422061181496
      // 06db: lload 3
      // 06dc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e1: goto 06ee
      // 06e4: ldc2_w -3912342285130922844
      // 06e7: lload 3
      // 06e8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06ed: athrow
      // 06ee: aload 47
      // 06f0: aload 48
      // 06f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06f5: pop
      // 06f6: lload 3
      // 06f7: lconst_0
      // 06f8: lcmp
      // 06f9: ifle 07fa
      // 06fc: aload 0
      // 06fd: ldc2_w -3952178382645188068
      // 0700: lload 3
      // 0701: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0706: ifnull 07fa
      // 0709: iload 45
      // 070b: ifeq 07ea
      // 070e: goto 071b
      // 0711: ldc2_w -3912342285130922844
      // 0714: lload 3
      // 0715: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071a: athrow
      // 071b: aload 5
      // 071d: new java/lang/StringBuilder
      // 0720: dup
      // 0721: invokespecial java/lang/StringBuilder.<init> ()V
      // 0724: sipush 5753
      // 0727: ldc2_w 2161654509796917129
      // 072a: lload 3
      // 072b: lxor
      // 072c: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0731: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0734: aload 0
      // 0735: lload 6
      // 0737: bipush 1
      // 0738: anewarray 337
      // 073b: dup_x2
      // 073c: dup_x2
      // 073d: pop
      // 073e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0741: bipush 0
      // 0742: swap
      // 0743: aastore
      // 0744: ldc2_w -3046458487457859258
      // 0747: lload 3
      // 0748: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0750: sipush 10708
      // 0753: ldc2_w 7433618910973607991
      // 0756: lload 3
      // 0757: lxor
      // 0758: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0760: aload 0
      // 0761: lload 8
      // 0763: bipush 1
      // 0764: anewarray 337
      // 0767: dup_x2
      // 0768: dup_x2
      // 0769: pop
      // 076a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 076d: bipush 0
      // 076e: swap
      // 076f: aastore
      // 0770: ldc2_w -3779650690414350416
      // 0773: lload 3
      // 0774: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0779: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 077c: sipush 20011
      // 077f: ldc2_w 821884091834738642
      // 0782: lload 3
      // 0783: lxor
      // 0784: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0789: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078c: aload 0
      // 078d: ldc2_w -3952178382645188068
      // 0790: lload 3
      // 0791: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0796: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0799: sipush 20906
      // 079c: ldc2_w 3231584579092199519
      // 079f: lload 3
      // 07a0: lxor
      // 07a1: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a9: aload 2
      // 07aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07ad: sipush 26920
      // 07b0: ldc2_w 431101008637133007
      // 07b3: lload 3
      // 07b4: lxor
      // 07b5: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07bd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07c0: lload 16
      // 07c2: bipush 2
      // 07c3: anewarray 337
      // 07c6: dup_x2
      // 07c7: dup_x2
      // 07c8: pop
      // 07c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07cc: bipush 1
      // 07cd: swap
      // 07ce: aastore
      // 07cf: dup_x1
      // 07d0: swap
      // 07d1: bipush 0
      // 07d2: swap
      // 07d3: aastore
      // 07d4: ldc2_w -3754752422061181496
      // 07d7: lload 3
      // 07d8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07dd: goto 07ea
      // 07e0: ldc2_w -3912342285130922844
      // 07e3: lload 3
      // 07e4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e9: athrow
      // 07ea: aload 47
      // 07ec: aload 0
      // 07ed: ldc2_w -3952178382645188068
      // 07f0: lload 3
      // 07f1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f9: pop
      // 07fa: aload 46
      // 07fc: iload 44
      // 07fe: lload 3
      // 07ff: lconst_0
      // 0800: lcmp
      // 0801: ifle 081b
      // 0804: ifeq 0819
      // 0807: ifnull 0973
      // 080a: goto 0817
      // 080d: ldc2_w -3912342285130922844
      // 0810: lload 3
      // 0811: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0816: athrow
      // 0817: aload 46
      // 0819: iload 44
      // 081b: ifeq 0855
      // 081e: lload 30
      // 0820: bipush 1
      // 0821: anewarray 337
      // 0824: dup_x2
      // 0825: dup_x2
      // 0826: pop
      // 0827: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 082a: bipush 0
      // 082b: swap
      // 082c: aastore
      // 082d: ldc2_w -3064716517444517557
      // 0830: lload 3
      // 0831: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0836: ifeq 0973
      // 0839: goto 0846
      // 083c: ldc2_w -3912342285130922844
      // 083f: lload 3
      // 0840: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0845: athrow
      // 0846: aload 46
      // 0848: goto 0855
      // 084b: ldc2_w -3912342285130922844
      // 084e: lload 3
      // 084f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0854: athrow
      // 0855: lload 10
      // 0857: bipush 1
      // 0858: anewarray 337
      // 085b: dup_x2
      // 085c: dup_x2
      // 085d: pop
      // 085e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0861: bipush 0
      // 0862: swap
      // 0863: aastore
      // 0864: ldc2_w -3273136266539119214
      // 0867: lload 3
      // 0868: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086d: astore 48
      // 086f: iload 44
      // 0871: lload 3
      // 0872: lconst_0
      // 0873: lcmp
      // 0874: iflt 095b
      // 0877: ifeq 0953
      // 087a: iload 45
      // 087c: ifeq 095e
      // 087f: goto 088c
      // 0882: ldc2_w -3912342285130922844
      // 0885: lload 3
      // 0886: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088b: athrow
      // 088c: aload 5
      // 088e: new java/lang/StringBuilder
      // 0891: dup
      // 0892: invokespecial java/lang/StringBuilder.<init> ()V
      // 0895: sipush 5753
      // 0898: ldc2_w 2161654509796917129
      // 089b: lload 3
      // 089c: lxor
      // 089d: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a5: aload 0
      // 08a6: lload 6
      // 08a8: bipush 1
      // 08a9: anewarray 337
      // 08ac: dup_x2
      // 08ad: dup_x2
      // 08ae: pop
      // 08af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08b2: bipush 0
      // 08b3: swap
      // 08b4: aastore
      // 08b5: ldc2_w -3046458487457859258
      // 08b8: lload 3
      // 08b9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08c1: sipush 10708
      // 08c4: ldc2_w 7433618910973607991
      // 08c7: lload 3
      // 08c8: lxor
      // 08c9: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d1: aload 0
      // 08d2: lload 8
      // 08d4: bipush 1
      // 08d5: anewarray 337
      // 08d8: dup_x2
      // 08d9: dup_x2
      // 08da: pop
      // 08db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08de: bipush 0
      // 08df: swap
      // 08e0: aastore
      // 08e1: ldc2_w -3779650690414350416
      // 08e4: lload 3
      // 08e5: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08ea: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08ed: sipush 20011
      // 08f0: ldc2_w 821884091834738642
      // 08f3: lload 3
      // 08f4: lxor
      // 08f5: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08fd: aload 2
      // 08fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0901: sipush 20906
      // 0904: ldc2_w 3231584579092199519
      // 0907: lload 3
      // 0908: lxor
      // 0909: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0911: aload 48
      // 0913: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0916: sipush 25843
      // 0919: ldc2_w 8673422217261845794
      // 091c: lload 3
      // 091d: lxor
      // 091e: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0923: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0926: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0929: lload 16
      // 092b: bipush 2
      // 092c: anewarray 337
      // 092f: dup_x2
      // 0930: dup_x2
      // 0931: pop
      // 0932: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0935: bipush 1
      // 0936: swap
      // 0937: aastore
      // 0938: dup_x1
      // 0939: swap
      // 093a: bipush 0
      // 093b: swap
      // 093c: aastore
      // 093d: ldc2_w -3754752422061181496
      // 0940: lload 3
      // 0941: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0946: goto 0953
      // 0949: ldc2_w -3912342285130922844
      // 094c: lload 3
      // 094d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0952: athrow
      // 0953: lload 3
      // 0954: lconst_0
      // 0955: lcmp
      // 0956: ifle 0973
      // 0959: iload 44
      // 095b: ifne 0973
      // 095e: aload 47
      // 0960: aload 48
      // 0962: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0965: pop
      // 0966: goto 0973
      // 0969: ldc2_w -3912342285130922844
      // 096c: lload 3
      // 096d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0972: athrow
      // 0973: aload 0
      // 0974: iload 44
      // 0976: lload 3
      // 0977: lconst_0
      // 0978: lcmp
      // 0979: ifle 0aa3
      // 097c: ifeq 0aa2
      // 097f: ldc2_w -3033313831034334483
      // 0982: lload 3
      // 0983: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0988: ifnull 0aa1
      // 098b: goto 0998
      // 098e: ldc2_w -3912342285130922844
      // 0991: lload 3
      // 0992: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0997: athrow
      // 0998: lload 3
      // 0999: lconst_0
      // 099a: lcmp
      // 099b: ifle 0a94
      // 099e: iload 45
      // 09a0: ifeq 0a84
      // 09a3: goto 09b0
      // 09a6: ldc2_w -3912342285130922844
      // 09a9: lload 3
      // 09aa: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09af: athrow
      // 09b0: aload 5
      // 09b2: new java/lang/StringBuilder
      // 09b5: dup
      // 09b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 09b9: sipush 5753
      // 09bc: ldc2_w 2161654509796917129
      // 09bf: lload 3
      // 09c0: lxor
      // 09c1: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09c9: aload 0
      // 09ca: lload 6
      // 09cc: bipush 1
      // 09cd: anewarray 337
      // 09d0: dup_x2
      // 09d1: dup_x2
      // 09d2: pop
      // 09d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d6: bipush 0
      // 09d7: swap
      // 09d8: aastore
      // 09d9: ldc2_w -3046458487457859258
      // 09dc: lload 3
      // 09dd: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e5: sipush 10708
      // 09e8: ldc2_w 7433618910973607991
      // 09eb: lload 3
      // 09ec: lxor
      // 09ed: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09f5: aload 0
      // 09f6: lload 8
      // 09f8: bipush 1
      // 09f9: anewarray 337
      // 09fc: dup_x2
      // 09fd: dup_x2
      // 09fe: pop
      // 09ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a02: bipush 0
      // 0a03: swap
      // 0a04: aastore
      // 0a05: ldc2_w -3779650690414350416
      // 0a08: lload 3
      // 0a09: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a11: sipush 20011
      // 0a14: ldc2_w 821884091834738642
      // 0a17: lload 3
      // 0a18: lxor
      // 0a19: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a21: aload 2
      // 0a22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a25: sipush 20906
      // 0a28: ldc2_w 3231584579092199519
      // 0a2b: lload 3
      // 0a2c: lxor
      // 0a2d: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a32: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a35: aload 0
      // 0a36: ldc2_w -3033313831034334483
      // 0a39: lload 3
      // 0a3a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a42: sipush 5143
      // 0a45: ldc2_w 8392391861975285191
      // 0a48: lload 3
      // 0a49: lxor
      // 0a4a: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a52: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a55: lload 16
      // 0a57: bipush 2
      // 0a58: anewarray 337
      // 0a5b: dup_x2
      // 0a5c: dup_x2
      // 0a5d: pop
      // 0a5e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a61: bipush 1
      // 0a62: swap
      // 0a63: aastore
      // 0a64: dup_x1
      // 0a65: swap
      // 0a66: bipush 0
      // 0a67: swap
      // 0a68: aastore
      // 0a69: ldc2_w -3754752422061181496
      // 0a6c: lload 3
      // 0a6d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a72: iload 44
      // 0a74: ifne 0aa1
      // 0a77: goto 0a84
      // 0a7a: ldc2_w -3912342285130922844
      // 0a7d: lload 3
      // 0a7e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a83: athrow
      // 0a84: aload 47
      // 0a86: aload 0
      // 0a87: ldc2_w -3033313831034334483
      // 0a8a: lload 3
      // 0a8b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a93: pop
      // 0a94: goto 0aa1
      // 0a97: ldc2_w -3912342285130922844
      // 0a9a: lload 3
      // 0a9b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa0: athrow
      // 0aa1: aload 0
      // 0aa2: bipush 0
      // 0aa3: anewarray 337
      // 0aa6: ldc2_w -3406356712671337146
      // 0aa9: lload 3
      // 0aaa: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aaf: lload 3
      // 0ab0: lconst_0
      // 0ab1: lcmp
      // 0ab2: iflt 0b0a
      // 0ab5: iload 44
      // 0ab7: ifeq 0b0a
      // 0aba: ifeq 0bc6
      // 0abd: goto 0aca
      // 0ac0: ldc2_w -3912342285130922844
      // 0ac3: lload 3
      // 0ac4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac9: athrow
      // 0aca: aload 47
      // 0acc: aload 2
      // 0acd: lload 20
      // 0acf: bipush 2
      // 0ad0: anewarray 337
      // 0ad3: dup_x2
      // 0ad4: dup_x2
      // 0ad5: pop
      // 0ad6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad9: bipush 1
      // 0ada: swap
      // 0adb: aastore
      // 0adc: dup_x1
      // 0add: swap
      // 0ade: bipush 0
      // 0adf: swap
      // 0ae0: aastore
      // 0ae1: ldc2_w -3711789720758182131
      // 0ae4: lload 3
      // 0ae5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aed: pop
      // 0aee: aload 0
      // 0aef: ldc2_w -3869626411321692638
      // 0af2: lload 3
      // 0af3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af8: invokeinterface java/util/Set.size ()I 1
      // 0afd: goto 0b0a
      // 0b00: ldc2_w -3912342285130922844
      // 0b03: lload 3
      // 0b04: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b09: athrow
      // 0b0a: ifne 0bf7
      // 0b0d: aload 46
      // 0b0f: iload 44
      // 0b11: lload 3
      // 0b12: lconst_0
      // 0b13: lcmp
      // 0b14: iflt 0b3b
      // 0b17: ifeq 0b39
      // 0b1a: goto 0b27
      // 0b1d: ldc2_w -3912342285130922844
      // 0b20: lload 3
      // 0b21: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b26: athrow
      // 0b27: ifnull 0ba8
      // 0b2a: goto 0b37
      // 0b2d: ldc2_w -3912342285130922844
      // 0b30: lload 3
      // 0b31: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b36: athrow
      // 0b37: aload 46
      // 0b39: iload 44
      // 0b3b: ifeq 0bf9
      // 0b3e: lload 26
      // 0b40: bipush 1
      // 0b41: anewarray 337
      // 0b44: dup_x2
      // 0b45: dup_x2
      // 0b46: pop
      // 0b47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b4a: bipush 0
      // 0b4b: swap
      // 0b4c: aastore
      // 0b4d: ldc2_w -3717608344571778099
      // 0b50: lload 3
      // 0b51: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b56: ifne 0bf7
      // 0b59: goto 0b66
      // 0b5c: ldc2_w -3912342285130922844
      // 0b5f: lload 3
      // 0b60: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b65: athrow
      // 0b66: aload 46
      // 0b68: iload 44
      // 0b6a: lload 3
      // 0b6b: lconst_0
      // 0b6c: lcmp
      // 0b6d: iflt 0bfb
      // 0b70: ifeq 0bf9
      // 0b73: goto 0b80
      // 0b76: ldc2_w -3912342285130922844
      // 0b79: lload 3
      // 0b7a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7f: athrow
      // 0b80: lload 18
      // 0b82: bipush 1
      // 0b83: anewarray 337
      // 0b86: dup_x2
      // 0b87: dup_x2
      // 0b88: pop
      // 0b89: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8c: bipush 0
      // 0b8d: swap
      // 0b8e: aastore
      // 0b8f: ldc2_w -2942417642188108249
      // 0b92: lload 3
      // 0b93: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b98: ifne 0bf7
      // 0b9b: goto 0ba8
      // 0b9e: ldc2_w -3912342285130922844
      // 0ba1: lload 3
      // 0ba2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba7: athrow
      // 0ba8: aload 47
      // 0baa: aload 47
      // 0bac: invokevirtual java/lang/StringBuilder.length ()I
      // 0baf: bipush 1
      // 0bb0: isub
      // 0bb1: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 0bb4: iload 44
      // 0bb6: ifne 0bf7
      // 0bb9: goto 0bc6
      // 0bbc: ldc2_w -3912342285130922844
      // 0bbf: lload 3
      // 0bc0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc5: athrow
      // 0bc6: aload 47
      // 0bc8: lload 12
      // 0bca: aload 2
      // 0bcb: bipush 2
      // 0bcc: anewarray 337
      // 0bcf: dup_x1
      // 0bd0: swap
      // 0bd1: bipush 1
      // 0bd2: swap
      // 0bd3: aastore
      // 0bd4: dup_x2
      // 0bd5: dup_x2
      // 0bd6: pop
      // 0bd7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bda: bipush 0
      // 0bdb: swap
      // 0bdc: aastore
      // 0bdd: ldc2_w -3061720080433258497
      // 0be0: lload 3
      // 0be1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be9: pop
      // 0bea: goto 0bf7
      // 0bed: ldc2_w -3912342285130922844
      // 0bf0: lload 3
      // 0bf1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf6: athrow
      // 0bf7: aload 46
      // 0bf9: iload 44
      // 0bfb: ifeq 0c10
      // 0bfe: ifnull 0c50
      // 0c01: goto 0c0e
      // 0c04: ldc2_w -3912342285130922844
      // 0c07: lload 3
      // 0c08: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0d: athrow
      // 0c0e: aload 46
      // 0c10: lload 14
      // 0c12: bipush 1
      // 0c13: anewarray 337
      // 0c16: dup_x2
      // 0c17: dup_x2
      // 0c18: pop
      // 0c19: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c1c: bipush 0
      // 0c1d: swap
      // 0c1e: aastore
      // 0c1f: ldc2_w -4003092371183242071
      // 0c22: lload 3
      // 0c23: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c28: invokeinterface java/util/List.size ()I 1
      // 0c2d: aload 46
      // 0c2f: lload 40
      // 0c31: bipush 1
      // 0c32: anewarray 337
      // 0c35: dup_x2
      // 0c36: dup_x2
      // 0c37: pop
      // 0c38: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c3b: bipush 0
      // 0c3c: swap
      // 0c3d: aastore
      // 0c3e: ldc2_w -3669211699582230477
      // 0c41: lload 3
      // 0c42: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c47: invokeinterface java/util/List.size ()I 1
      // 0c4c: iadd
      // 0c4d: goto 0c51
      // 0c50: bipush 0
      // 0c51: istore 48
      // 0c53: aload 0
      // 0c54: ldc2_w -3869626411321692638
      // 0c57: lload 3
      // 0c58: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5d: invokeinterface java/util/Set.size ()I 1
      // 0c62: istore 49
      // 0c64: aload 0
      // 0c65: bipush 0
      // 0c66: anewarray 337
      // 0c69: ldc2_w -3637363217369123534
      // 0c6c: lload 3
      // 0c6d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c72: iload 44
      // 0c74: lload 3
      // 0c75: lconst_0
      // 0c76: lcmp
      // 0c77: ifle 0cbb
      // 0c7a: ifeq 0cb9
      // 0c7d: ifeq 0cb7
      // 0c80: goto 0c8d
      // 0c83: ldc2_w -3912342285130922844
      // 0c86: lload 3
      // 0c87: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8c: athrow
      // 0c8d: iload 49
      // 0c8f: iload 44
      // 0c91: lload 3
      // 0c92: lconst_0
      // 0c93: lcmp
      // 0c94: iflt 0cd2
      // 0c97: ifeq 0cd0
      // 0c9a: goto 0ca7
      // 0c9d: ldc2_w -3912342285130922844
      // 0ca0: lload 3
      // 0ca1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca6: athrow
      // 0ca7: ifgt 0cce
      // 0caa: goto 0cb7
      // 0cad: ldc2_w -3912342285130922844
      // 0cb0: lload 3
      // 0cb1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb6: athrow
      // 0cb7: iload 48
      // 0cb9: iload 44
      // 0cbb: ifeq 0e66
      // 0cbe: ifle 0e65
      // 0cc1: goto 0cce
      // 0cc4: ldc2_w -3912342285130922844
      // 0cc7: lload 3
      // 0cc8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ccd: athrow
      // 0cce: iload 45
      // 0cd0: iload 44
      // 0cd2: lload 3
      // 0cd3: lconst_0
      // 0cd4: lcmp
      // 0cd5: ifle 0dc5
      // 0cd8: ifeq 0dc4
      // 0cdb: ifeq 0da2
      // 0cde: goto 0ceb
      // 0ce1: ldc2_w -3912342285130922844
      // 0ce4: lload 3
      // 0ce5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cea: athrow
      // 0ceb: aload 5
      // 0ced: new java/lang/StringBuilder
      // 0cf0: dup
      // 0cf1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cf4: sipush 5753
      // 0cf7: ldc2_w 2161654509796917129
      // 0cfa: lload 3
      // 0cfb: lxor
      // 0cfc: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d01: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d04: aload 0
      // 0d05: lload 6
      // 0d07: bipush 1
      // 0d08: anewarray 337
      // 0d0b: dup_x2
      // 0d0c: dup_x2
      // 0d0d: pop
      // 0d0e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d11: bipush 0
      // 0d12: swap
      // 0d13: aastore
      // 0d14: ldc2_w -3046458487457859258
      // 0d17: lload 3
      // 0d18: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d20: sipush 10708
      // 0d23: ldc2_w 7433618910973607991
      // 0d26: lload 3
      // 0d27: lxor
      // 0d28: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d30: aload 0
      // 0d31: lload 8
      // 0d33: bipush 1
      // 0d34: anewarray 337
      // 0d37: dup_x2
      // 0d38: dup_x2
      // 0d39: pop
      // 0d3a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3d: bipush 0
      // 0d3e: swap
      // 0d3f: aastore
      // 0d40: ldc2_w -3779650690414350416
      // 0d43: lload 3
      // 0d44: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d49: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d4c: sipush 20011
      // 0d4f: ldc2_w 821884091834738642
      // 0d52: lload 3
      // 0d53: lxor
      // 0d54: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5c: aload 2
      // 0d5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d60: sipush 2203
      // 0d63: ldc2_w 694376439552270692
      // 0d66: lload 3
      // 0d67: lxor
      // 0d68: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d70: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d73: lload 16
      // 0d75: bipush 2
      // 0d76: anewarray 337
      // 0d79: dup_x2
      // 0d7a: dup_x2
      // 0d7b: pop
      // 0d7c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7f: bipush 1
      // 0d80: swap
      // 0d81: aastore
      // 0d82: dup_x1
      // 0d83: swap
      // 0d84: bipush 0
      // 0d85: swap
      // 0d86: aastore
      // 0d87: ldc2_w -3754752422061181496
      // 0d8a: lload 3
      // 0d8b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d90: iload 44
      // 0d92: ifne 0e65
      // 0d95: goto 0da2
      // 0d98: ldc2_w -3912342285130922844
      // 0d9b: lload 3
      // 0d9c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da1: athrow
      // 0da2: aload 47
      // 0da4: sipush 14420
      // 0da7: ldc2_w 3519074245848125876
      // 0daa: lload 3
      // 0dab: lxor
      // 0dac: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db4: pop
      // 0db5: iload 49
      // 0db7: goto 0dc4
      // 0dba: ldc2_w -3912342285130922844
      // 0dbd: lload 3
      // 0dbe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc3: athrow
      // 0dc4: bipush 1
      // 0dc5: lload 3
      // 0dc6: lconst_0
      // 0dc7: lcmp
      // 0dc8: ifle 0e3a
      // 0dcb: iload 44
      // 0dcd: ifeq 0e3a
      // 0dd0: if_icmple 0e00
      // 0dd3: goto 0de0
      // 0dd6: ldc2_w -3912342285130922844
      // 0dd9: lload 3
      // 0dda: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ddf: athrow
      // 0de0: aload 47
      // 0de2: sipush 23065
      // 0de5: ldc2_w 2862071398879192670
      // 0de8: lload 3
      // 0de9: lxor
      // 0dea: invokedynamic n (IJ)I bsm=com/zelix/_nj.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0def: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0df2: pop
      // 0df3: goto 0e00
      // 0df6: ldc2_w -3912342285130922844
      // 0df9: lload 3
      // 0dfa: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dff: athrow
      // 0e00: lload 3
      // 0e01: lconst_0
      // 0e02: lcmp
      // 0e03: ifle 0e2a
      // 0e06: aload 47
      // 0e08: aload 0
      // 0e09: lload 38
      // 0e0b: bipush 1
      // 0e0c: anewarray 337
      // 0e0f: dup_x2
      // 0e10: dup_x2
      // 0e11: pop
      // 0e12: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e15: bipush 0
      // 0e16: swap
      // 0e17: aastore
      // 0e18: ldc2_w -3299627171000656501
      // 0e1b: lload 3
      // 0e1c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e21: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e24: iload 44
      // 0e26: ifeq 0e64
      // 0e29: pop
      // 0e2a: iload 49
      // 0e2c: bipush 1
      // 0e2d: goto 0e3a
      // 0e30: ldc2_w -3912342285130922844
      // 0e33: lload 3
      // 0e34: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e39: athrow
      // 0e3a: if_icmple 0e5d
      // 0e3d: aload 47
      // 0e3f: sipush 2689
      // 0e42: ldc2_w 1815216314983265989
      // 0e45: lload 3
      // 0e46: lxor
      // 0e47: invokedynamic n (IJ)I bsm=com/zelix/_nj.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0e4f: pop
      // 0e50: goto 0e5d
      // 0e53: ldc2_w -3912342285130922844
      // 0e56: lload 3
      // 0e57: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5c: athrow
      // 0e5d: aload 47
      // 0e5f: ldc "}"
      // 0e61: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e64: pop
      // 0e65: bipush 0
      // 0e66: istore 50
      // 0e68: bipush 0
      // 0e69: istore 51
      // 0e6b: aload 46
      // 0e6d: iload 44
      // 0e6f: lload 3
      // 0e70: lconst_0
      // 0e71: lcmp
      // 0e72: iflt 0e8c
      // 0e75: ifeq 0e8a
      // 0e78: ifnull 0f44
      // 0e7b: goto 0e88
      // 0e7e: ldc2_w -3912342285130922844
      // 0e81: lload 3
      // 0e82: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e87: athrow
      // 0e88: aload 46
      // 0e8a: iload 44
      // 0e8c: ifeq 0ec6
      // 0e8f: lload 28
      // 0e91: bipush 1
      // 0e92: anewarray 337
      // 0e95: dup_x2
      // 0e96: dup_x2
      // 0e97: pop
      // 0e98: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9b: bipush 0
      // 0e9c: swap
      // 0e9d: aastore
      // 0e9e: ldc2_w -3876545635430338472
      // 0ea1: lload 3
      // 0ea2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea7: ifeq 0f44
      // 0eaa: goto 0eb7
      // 0ead: ldc2_w -3912342285130922844
      // 0eb0: lload 3
      // 0eb1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb6: athrow
      // 0eb7: aload 46
      // 0eb9: goto 0ec6
      // 0ebc: ldc2_w -3912342285130922844
      // 0ebf: lload 3
      // 0ec0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec5: athrow
      // 0ec6: lload 32
      // 0ec8: bipush 1
      // 0ec9: anewarray 337
      // 0ecc: dup_x2
      // 0ecd: dup_x2
      // 0ece: pop
      // 0ecf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed2: bipush 0
      // 0ed3: swap
      // 0ed4: aastore
      // 0ed5: ldc2_w -3955156640985670135
      // 0ed8: lload 3
      // 0ed9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ede: astore 52
      // 0ee0: aload 47
      // 0ee2: aload 52
      // 0ee4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ee7: pop
      // 0ee8: aload 52
      // 0eea: sipush 13951
      // 0eed: ldc2_w 8609792567031455628
      // 0ef0: lload 3
      // 0ef1: lxor
      // 0ef2: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef7: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0efa: bipush -1
      // 0efb: iload 44
      // 0efd: ifeq 0f3e
      // 0f00: if_icmple 0f13
      // 0f03: goto 0f10
      // 0f06: ldc2_w -3912342285130922844
      // 0f09: lload 3
      // 0f0a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0f: athrow
      // 0f10: bipush 1
      // 0f11: istore 50
      // 0f13: aload 52
      // 0f15: iload 44
      // 0f17: lload 3
      // 0f18: lconst_0
      // 0f19: lcmp
      // 0f1a: ifle 0f50
      // 0f1d: ifeq 0f4e
      // 0f20: sipush 14926
      // 0f23: ldc2_w 2746891568220820408
      // 0f26: lload 3
      // 0f27: lxor
      // 0f28: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2d: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0f30: bipush -1
      // 0f31: goto 0f3e
      // 0f34: ldc2_w -3912342285130922844
      // 0f37: lload 3
      // 0f38: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3d: athrow
      // 0f3e: if_icmple 0f44
      // 0f41: bipush 1
      // 0f42: istore 51
      // 0f44: aload 0
      // 0f45: ldc2_w -3172252464783720314
      // 0f48: lload 3
      // 0f49: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4e: iload 44
      // 0f50: ifeq 11fb
      // 0f53: ifnull 11f6
      // 0f56: goto 0f63
      // 0f59: ldc2_w -3912342285130922844
      // 0f5c: lload 3
      // 0f5d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f62: athrow
      // 0f63: iload 50
      // 0f65: iload 44
      // 0f67: ifeq 10b9
      // 0f6a: goto 0f77
      // 0f6d: ldc2_w -3912342285130922844
      // 0f70: lload 3
      // 0f71: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f76: athrow
      // 0f77: lload 3
      // 0f78: lconst_0
      // 0f79: lcmp
      // 0f7a: ifle 10ac
      // 0f7d: ifeq 10aa
      // 0f80: goto 0f8d
      // 0f83: ldc2_w -3912342285130922844
      // 0f86: lload 3
      // 0f87: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8c: athrow
      // 0f8d: aload 0
      // 0f8e: ldc2_w -3172252464783720314
      // 0f91: lload 3
      // 0f92: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f97: sipush 9262
      // 0f9a: ldc2_w 3369085919199546847
      // 0f9d: lload 3
      // 0f9e: lxor
      // 0f9f: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa4: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0fa7: iload 44
      // 0fa9: lload 3
      // 0faa: lconst_0
      // 0fab: lcmp
      // 0fac: ifle 10bb
      // 0faf: ifeq 10b9
      // 0fb2: goto 0fbf
      // 0fb5: ldc2_w -3912342285130922844
      // 0fb8: lload 3
      // 0fb9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fbe: athrow
      // 0fbf: lload 3
      // 0fc0: lconst_0
      // 0fc1: lcmp
      // 0fc2: ifle 10ac
      // 0fc5: bipush -1
      // 0fc6: if_icmple 10aa
      // 0fc9: goto 0fd6
      // 0fcc: ldc2_w -3912342285130922844
      // 0fcf: lload 3
      // 0fd0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd5: athrow
      // 0fd6: aload 5
      // 0fd8: new java/lang/StringBuilder
      // 0fdb: dup
      // 0fdc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fdf: sipush 5753
      // 0fe2: ldc2_w 2161654509796917129
      // 0fe5: lload 3
      // 0fe6: lxor
      // 0fe7: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fef: aload 0
      // 0ff0: lload 6
      // 0ff2: bipush 1
      // 0ff3: anewarray 337
      // 0ff6: dup_x2
      // 0ff7: dup_x2
      // 0ff8: pop
      // 0ff9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ffc: bipush 0
      // 0ffd: swap
      // 0ffe: aastore
      // 0fff: ldc2_w -3046458487457859258
      // 1002: lload 3
      // 1003: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1008: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100b: sipush 10708
      // 100e: ldc2_w 7433618910973607991
      // 1011: lload 3
      // 1012: lxor
      // 1013: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1018: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 101b: aload 0
      // 101c: lload 8
      // 101e: bipush 1
      // 101f: anewarray 337
      // 1022: dup_x2
      // 1023: dup_x2
      // 1024: pop
      // 1025: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1028: bipush 0
      // 1029: swap
      // 102a: aastore
      // 102b: ldc2_w -3779650690414350416
      // 102e: lload 3
      // 102f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1034: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1037: sipush 24898
      // 103a: ldc2_w 4509731109280745616
      // 103d: lload 3
      // 103e: lxor
      // 103f: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1044: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1047: aload 0
      // 1048: ldc2_w -3172252464783720314
      // 104b: lload 3
      // 104c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1054: sipush 20906
      // 1057: ldc2_w 3231584579092199519
      // 105a: lload 3
      // 105b: lxor
      // 105c: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1061: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1064: aload 2
      // 1065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1068: sipush 18740
      // 106b: ldc2_w 1802827235596050641
      // 106e: lload 3
      // 106f: lxor
      // 1070: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1078: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 107b: lload 16
      // 107d: bipush 2
      // 107e: anewarray 337
      // 1081: dup_x2
      // 1082: dup_x2
      // 1083: pop
      // 1084: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1087: bipush 1
      // 1088: swap
      // 1089: aastore
      // 108a: dup_x1
      // 108b: swap
      // 108c: bipush 0
      // 108d: swap
      // 108e: aastore
      // 108f: ldc2_w -3754752422061181496
      // 1092: lload 3
      // 1093: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1098: iload 44
      // 109a: ifne 11f6
      // 109d: goto 10aa
      // 10a0: ldc2_w -3912342285130922844
      // 10a3: lload 3
      // 10a4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a9: athrow
      // 10aa: iload 51
      // 10ac: goto 10b9
      // 10af: ldc2_w -3912342285130922844
      // 10b2: lload 3
      // 10b3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b8: athrow
      // 10b9: iload 44
      // 10bb: lload 3
      // 10bc: lconst_0
      // 10bd: lcmp
      // 10be: iflt 1102
      // 10c1: ifeq 10fb
      // 10c4: ifeq 11d9
      // 10c7: goto 10d4
      // 10ca: ldc2_w -3912342285130922844
      // 10cd: lload 3
      // 10ce: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d3: athrow
      // 10d4: aload 0
      // 10d5: ldc2_w -3172252464783720314
      // 10d8: lload 3
      // 10d9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10de: sipush 8396
      // 10e1: ldc2_w 3615505597545564478
      // 10e4: lload 3
      // 10e5: lxor
      // 10e6: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10eb: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 10ee: goto 10fb
      // 10f1: ldc2_w -3912342285130922844
      // 10f4: lload 3
      // 10f5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10fa: athrow
      // 10fb: lload 3
      // 10fc: lconst_0
      // 10fd: lcmp
      // 10fe: iflt 11c9
      // 1101: bipush -1
      // 1102: if_icmple 11d9
      // 1105: aload 5
      // 1107: new java/lang/StringBuilder
      // 110a: dup
      // 110b: invokespecial java/lang/StringBuilder.<init> ()V
      // 110e: sipush 5753
      // 1111: ldc2_w 2161654509796917129
      // 1114: lload 3
      // 1115: lxor
      // 1116: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 111e: aload 0
      // 111f: lload 6
      // 1121: bipush 1
      // 1122: anewarray 337
      // 1125: dup_x2
      // 1126: dup_x2
      // 1127: pop
      // 1128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112b: bipush 0
      // 112c: swap
      // 112d: aastore
      // 112e: ldc2_w -3046458487457859258
      // 1131: lload 3
      // 1132: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113a: sipush 10708
      // 113d: ldc2_w 7433618910973607991
      // 1140: lload 3
      // 1141: lxor
      // 1142: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114a: aload 0
      // 114b: lload 8
      // 114d: bipush 1
      // 114e: anewarray 337
      // 1151: dup_x2
      // 1152: dup_x2
      // 1153: pop
      // 1154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1157: bipush 0
      // 1158: swap
      // 1159: aastore
      // 115a: ldc2_w -3779650690414350416
      // 115d: lload 3
      // 115e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1163: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1166: sipush 17761
      // 1169: ldc2_w 5416304319273479346
      // 116c: lload 3
      // 116d: lxor
      // 116e: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1176: aload 0
      // 1177: ldc2_w -3172252464783720314
      // 117a: lload 3
      // 117b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1183: sipush 20906
      // 1186: ldc2_w 3231584579092199519
      // 1189: lload 3
      // 118a: lxor
      // 118b: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1190: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1193: aload 2
      // 1194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1197: sipush 20933
      // 119a: ldc2_w 8098620888170707000
      // 119d: lload 3
      // 119e: lxor
      // 119f: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11aa: lload 16
      // 11ac: bipush 2
      // 11ad: anewarray 337
      // 11b0: dup_x2
      // 11b1: dup_x2
      // 11b2: pop
      // 11b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11b6: bipush 1
      // 11b7: swap
      // 11b8: aastore
      // 11b9: dup_x1
      // 11ba: swap
      // 11bb: bipush 0
      // 11bc: swap
      // 11bd: aastore
      // 11be: ldc2_w -3754752422061181496
      // 11c1: lload 3
      // 11c2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c7: iload 44
      // 11c9: ifne 11f6
      // 11cc: goto 11d9
      // 11cf: ldc2_w -3912342285130922844
      // 11d2: lload 3
      // 11d3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d8: athrow
      // 11d9: aload 47
      // 11db: aload 0
      // 11dc: ldc2_w -3172252464783720314
      // 11df: lload 3
      // 11e0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e8: pop
      // 11e9: goto 11f6
      // 11ec: ldc2_w -3912342285130922844
      // 11ef: lload 3
      // 11f0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f5: athrow
      // 11f6: aload 47
      // 11f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11fb: areturn
   }

   public void i(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = f ^ var3;
      x44.a<"u">(this, var2, 7164380169818268774L, var3);
   }

   public void u(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = f ^ var2;
      x44.a<"r">(this, var4, -637876994750372774L, var2);
   }

   void r(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = f ^ var2;
      x44.a<"k">(this, -428395555229573536L, var2).add(var4);
   }

   abstract boolean J(Object[] var1);

   private static String b(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/_nj.f J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: aload 1
      // 01a: invokevirtual java/lang/String.length ()I
      // 01d: istore 5
      // 01f: ldc2_w -777445200067535209
      // 022: lload 2
      // 023: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: aload 1
      // 029: sipush 2192
      // 02c: ldc2_w 2664491575509161039
      // 02f: lload 2
      // 030: lxor
      // 031: invokedynamic n (IJ)I bsm=com/zelix/_nj.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: invokevirtual java/lang/String.lastIndexOf (I)I
      // 039: istore 6
      // 03b: istore 4
      // 03d: iload 6
      // 03f: iload 4
      // 041: ifeq 0cb
      // 044: ifle 0c9
      // 047: goto 054
      // 04a: ldc2_w -1644103591094049730
      // 04d: lload 2
      // 04e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: iload 6
      // 056: iload 4
      // 058: ifeq 0cb
      // 05b: goto 068
      // 05e: ldc2_w -1644103591094049730
      // 061: lload 2
      // 062: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: iload 5
      // 06a: bipush 1
      // 06b: isub
      // 06c: if_icmpge 0c9
      // 06f: goto 07c
      // 072: ldc2_w -1644103591094049730
      // 075: lload 2
      // 076: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: aload 1
      // 07d: iload 6
      // 07f: bipush 1
      // 080: iadd
      // 081: invokevirtual java/lang/String.charAt (I)C
      // 084: iload 4
      // 086: lload 2
      // 087: lconst_0
      // 088: lcmp
      // 089: ifle 0cd
      // 08c: ifeq 0cb
      // 08f: goto 09c
      // 092: ldc2_w -1644103591094049730
      // 095: lload 2
      // 096: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: sipush 4354
      // 09f: ldc2_w 5052100717995298270
      // 0a2: lload 2
      // 0a3: lxor
      // 0a4: invokedynamic n (IJ)I bsm=com/zelix/_nj.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: if_icmpne 0c9
      // 0ac: goto 0b9
      // 0af: ldc2_w -1644103591094049730
      // 0b2: lload 2
      // 0b3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: iinc 6 1
      // 0bc: goto 0c9
      // 0bf: ldc2_w -1644103591094049730
      // 0c2: lload 2
      // 0c3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: iload 6
      // 0cb: iload 4
      // 0cd: lload 2
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 164
      // 0d3: ifeq 161
      // 0d6: ifle 144
      // 0d9: goto 0e6
      // 0dc: ldc2_w -1644103591094049730
      // 0df: lload 2
      // 0e0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: iload 6
      // 0e8: iload 5
      // 0ea: bipush 1
      // 0eb: isub
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 16e
      // 0f2: iload 4
      // 0f4: ifeq 16e
      // 0f7: goto 104
      // 0fa: ldc2_w -1644103591094049730
      // 0fd: lload 2
      // 0fe: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: if_icmpge 144
      // 107: goto 114
      // 10a: ldc2_w -1644103591094049730
      // 10d: lload 2
      // 10e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: new java/lang/StringBuilder
      // 117: dup
      // 118: invokespecial java/lang/StringBuilder.<init> ()V
      // 11b: aload 1
      // 11c: bipush 0
      // 11d: iload 6
      // 11f: bipush 1
      // 120: iadd
      // 121: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: ldc "^"
      // 129: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c: aload 1
      // 12d: iload 6
      // 12f: bipush 1
      // 130: iadd
      // 131: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: ldc "^"
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13f: astore 7
      // 141: aload 7
      // 143: areturn
      // 144: aload 1
      // 145: iload 4
      // 147: lload 2
      // 148: lconst_0
      // 149: lcmp
      // 14a: iflt 151
      // 14d: ifeq 1d8
      // 150: bipush 0
      // 151: invokevirtual java/lang/String.charAt (I)C
      // 154: goto 161
      // 157: ldc2_w -1644103591094049730
      // 15a: lload 2
      // 15b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: sipush 2192
      // 164: ldc2_w 2664491575509161039
      // 167: lload 2
      // 168: lxor
      // 169: invokedynamic n (IJ)I bsm=com/zelix/_nj.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: if_icmpne 1a8
      // 171: aload 1
      // 172: iload 4
      // 174: ifeq 1de
      // 177: goto 184
      // 17a: ldc2_w -1644103591094049730
      // 17d: lload 2
      // 17e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: iload 5
      // 186: bipush 1
      // 187: isub
      // 188: invokevirtual java/lang/String.charAt (I)C
      // 18b: sipush 2192
      // 18e: ldc2_w 2664491575509161039
      // 191: lload 2
      // 192: lxor
      // 193: invokedynamic n (IJ)I bsm=com/zelix/_nj.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: if_icmpeq 1dd
      // 19b: goto 1a8
      // 19e: ldc2_w -1644103591094049730
      // 1a1: lload 2
      // 1a2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: new java/lang/StringBuilder
      // 1ab: dup
      // 1ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 1af: sipush 10037
      // 1b2: ldc2_w 8803108983666208347
      // 1b5: lload 2
      // 1b6: lxor
      // 1b7: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/_nj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bf: aload 1
      // 1c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c3: ldc "^"
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1cb: goto 1d8
      // 1ce: ldc2_w -1644103591094049730
      // 1d1: lload 2
      // 1d2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: astore 7
      // 1da: aload 7
      // 1dc: areturn
      // 1dd: aload 1
      // 1de: areturn
   }

   static {
      long var11 = f ^ 27009375757696L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[36];
      int var18 = 0;
      String var17 = "¢zLÕç\f9å\u001awð\u00adE4\u0080j\u0003\u008b\u0099\u0001\u0097¸¾\t\b[\u0016\u0093\u0083U`\røc÷Á\u0097Nnð>£\u007fµ\u0081Km\u0097å3Dþw\u0089}$©\u0011ãµuòÉRAñ÷_³\u0081ûÓ(¶\u0088jÖ\u0013l\u0013#¿Ö\u009e¯\u001añ\u0080\u0018d¨©¨hüY,[\u0010£0ñ÷-ß?D\u0083«Ó\u0086Ç\u001c\u0018,kUu/ÌÁ6£G÷£¢c³{©×e©}\u001b\u0005ª Ò\u0005ç\u008fà\u0010\u0017tYÛ-)\u0088\u0091Bý\u0094ÎÐ¾ÖÁ\u008a®%ã«\n#¯¨×\u0010þ1\u0096¼\u0019\u001eÅ°[¡\u0012¨óqØ\u0087\u0010Ó8Z§\b*r\b6\u001b\u001554vüÎ {,Æç\u0001\u009bês\u0084ÌE¦\bÉÀË.\u0090F\u0092\u009d\"\u009cEù\u0000\"\u008eÐÞ£S\u0010^\u0090é£\"\u009er¸\u0016T\u001b¹eíW½XZx\u008aZ\u0081b_£FNnß÷u!\u0017\u009f\u0006\u000eû\u008f®T\u0091ïJ:\u0084b\u0005#ÍKÑ\u0015\t\u009bò\u0097û\u000fä^Õ\u0018s\t°\u0093\u009cÑKËr¸xtºo¼\u0017RTg?p\u009cÎ\u0096&\u0001\u0005\u0007ïd1«\u0095ÞÉB\u009b\u00800r01\u0017\u0010üÁþq¾\u0096$\u0095ØVDú°ÄQz\u0010Rº\u0091=>\u0085\u0012%ýç+¥1\u007fw¡ \u0007xæáo×~cëmó4æ»\u001dÞgÃÀè\u00808\u0006\u009e\nÁ1\u00adZ\u0096(Ô\u0010î\u007f\u0098©µràê·7`ÀM§ù\u0090\u0010\u0014NÎ5¢Î0²\u0003\\«\u0081´å\u0083\u0080\u0010kÂ0\u0000\u001eØRÓI0\u0019T±\u0010\u001aï\u0010Ã{>ý9ËA\u0091_È9Ú\u001a}K \u0018RU\u0081\u00adå[Ú\bc«Ö\u0086Í®R\u0003ê\u0086¸ÒÊçØ\u0015@8{\u0096¡Mûí\u0012\u0087ùQ\u009b±ãPB\u0010\u0016\t\u0083\u0080Ö\u0093ä\u0085Ö\u0003Ñ\r\u0015\ré_£E\u001a\u0080\u008cø¦·¦Ë\u001aN1\u0013Ý\u008c0\u0016aÁø\u0095)V¨ËuZÀ\u008f{\u0010F\u0098\u001bÍÆ \u0000p)o\u008bþÕ\u001a\n½\u0018\u0098c\u0096\u000b\u0093âµH$2¨K\u0086¤\u0096\u008cãL$®\nôK\u009b\u0010/h¦Õ\u008c6\u009c\u001b®=£«y\u0017Ié\u0010\tí\u0016Û\u0080r¿¾Ð\tNpBB\u001c\u0005\u0010Q7°\u0014ßõö\u009f\u008c´\u0083BfIÖÀ\u0010\u0018\u0082\u0006\u008b^\u0004TÙ\u001c\u0000÷-°Û\u009a\u0088\u0018têjúca\u0090hµ\u008dmÉ\u0088Ç\u0093\u000e4ôðI®=,\f\u0010½eêrt¡D\u0096Ü\u0086¡¤Þ\";\u0082 ÙÝ#\u001f\ntrËuj}\u0002¥\u0012\u009d\u009d\u0016)\u0015åX\u001b,\u0081~\bå³Èé\u0084\u0013\u0010Y\u0099c\u008b=Ì\u0099vjÄ\u0086Ç\u0081\u000fæg\u0010ý\u0096 mÇ¹åîí1{Ðõw#\u001b\u0010\u009dÈÁ\u001bÉ\u001dÞq~5þy\u009c\f\f)\u0010¢ágPÁUs\u0097u»\u00adü\u00ad*EÁ\u0010\u001fù\t\u001e>«\"\u008b\u0083\u0003As;>«Â\u0010\u0099º\u008e{\u008bWQ\n\u0017ø£\u001cº\u000f\u001c\u0086\u0010V¶þ\u001f¬Î;à°§Í\u001b\u0016Ñ\\¡";
      int var19 = "¢zLÕç\f9å\u001awð\u00adE4\u0080j\u0003\u008b\u0099\u0001\u0097¸¾\t\b[\u0016\u0093\u0083U`\røc÷Á\u0097Nnð>£\u007fµ\u0081Km\u0097å3Dþw\u0089}$©\u0011ãµuòÉRAñ÷_³\u0081ûÓ(¶\u0088jÖ\u0013l\u0013#¿Ö\u009e¯\u001añ\u0080\u0018d¨©¨hüY,[\u0010£0ñ÷-ß?D\u0083«Ó\u0086Ç\u001c\u0018,kUu/ÌÁ6£G÷£¢c³{©×e©}\u001b\u0005ª Ò\u0005ç\u008fà\u0010\u0017tYÛ-)\u0088\u0091Bý\u0094ÎÐ¾ÖÁ\u008a®%ã«\n#¯¨×\u0010þ1\u0096¼\u0019\u001eÅ°[¡\u0012¨óqØ\u0087\u0010Ó8Z§\b*r\b6\u001b\u001554vüÎ {,Æç\u0001\u009bês\u0084ÌE¦\bÉÀË.\u0090F\u0092\u009d\"\u009cEù\u0000\"\u008eÐÞ£S\u0010^\u0090é£\"\u009er¸\u0016T\u001b¹eíW½XZx\u008aZ\u0081b_£FNnß÷u!\u0017\u009f\u0006\u000eû\u008f®T\u0091ïJ:\u0084b\u0005#ÍKÑ\u0015\t\u009bò\u0097û\u000fä^Õ\u0018s\t°\u0093\u009cÑKËr¸xtºo¼\u0017RTg?p\u009cÎ\u0096&\u0001\u0005\u0007ïd1«\u0095ÞÉB\u009b\u00800r01\u0017\u0010üÁþq¾\u0096$\u0095ØVDú°ÄQz\u0010Rº\u0091=>\u0085\u0012%ýç+¥1\u007fw¡ \u0007xæáo×~cëmó4æ»\u001dÞgÃÀè\u00808\u0006\u009e\nÁ1\u00adZ\u0096(Ô\u0010î\u007f\u0098©µràê·7`ÀM§ù\u0090\u0010\u0014NÎ5¢Î0²\u0003\\«\u0081´å\u0083\u0080\u0010kÂ0\u0000\u001eØRÓI0\u0019T±\u0010\u001aï\u0010Ã{>ý9ËA\u0091_È9Ú\u001a}K \u0018RU\u0081\u00adå[Ú\bc«Ö\u0086Í®R\u0003ê\u0086¸ÒÊçØ\u0015@8{\u0096¡Mûí\u0012\u0087ùQ\u009b±ãPB\u0010\u0016\t\u0083\u0080Ö\u0093ä\u0085Ö\u0003Ñ\r\u0015\ré_£E\u001a\u0080\u008cø¦·¦Ë\u001aN1\u0013Ý\u008c0\u0016aÁø\u0095)V¨ËuZÀ\u008f{\u0010F\u0098\u001bÍÆ \u0000p)o\u008bþÕ\u001a\n½\u0018\u0098c\u0096\u000b\u0093âµH$2¨K\u0086¤\u0096\u008cãL$®\nôK\u009b\u0010/h¦Õ\u008c6\u009c\u001b®=£«y\u0017Ié\u0010\tí\u0016Û\u0080r¿¾Ð\tNpBB\u001c\u0005\u0010Q7°\u0014ßõö\u009f\u008c´\u0083BfIÖÀ\u0010\u0018\u0082\u0006\u008b^\u0004TÙ\u001c\u0000÷-°Û\u009a\u0088\u0018têjúca\u0090hµ\u008dmÉ\u0088Ç\u0093\u000e4ôðI®=,\f\u0010½eêrt¡D\u0096Ü\u0086¡¤Þ\";\u0082 ÙÝ#\u001f\ntrËuj}\u0002¥\u0012\u009d\u009d\u0016)\u0015åX\u001b,\u0081~\bå³Èé\u0084\u0013\u0010Y\u0099c\u008b=Ì\u0099vjÄ\u0086Ç\u0081\u000fæg\u0010ý\u0096 mÇ¹åîí1{Ðõw#\u001b\u0010\u009dÈÁ\u001bÉ\u001dÞq~5þy\u009c\f\f)\u0010¢ágPÁUs\u0097u»\u00adü\u00ad*EÁ\u0010\u001fù\t\u001e>«\"\u008b\u0083\u0003As;>«Â\u0010\u0099º\u008e{\u008bWQ\n\u0017ø£\u001cº\u000f\u001c\u0086\u0010V¶þ\u001f¬Î;à°§Í\u001b\u0016Ñ\\¡"
         .length();
      char var16 = 'X';
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
                     n = var20;
                     o = new String[36];
                     B = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "\u0090\u0006²fÄN¼â!Ná Cõº\u0010\u0087\u0095J19Ë=ï";
                     int var5 = "\u0090\u0006²fÄN¼â!Ná Cõº\u0010\u0087\u0095J19Ë=ï".length();
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
                                    z = var6;
                                    A = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "«\u000eî_\u001fþ.×¢[?\nHêá(";
                                 var5 = "«\u000eî_\u001fþ.×¢[?\nHêá(".length();
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

                  var17 = ";ï\b¥e¦\u0019½\"[÷:>8Z\u0084\u000fîÐ\u007fsï©){<VÈ`£\u009eäè\u0012a\u0081£\u001e\u0090\u0006%IV\u001c&\u0081\u0004ö7ëþ¬7ÒÉB8\u0005\u009f¬\u000f®X\u008dîÒ1\u0086êt]\u0091\u001f»Å®\u001f{sß\u0004ºØÇzó÷\u0012\u0091ðDx«_»Õo]ÿ\u00043ô/\u0017\u0010ÈS#¢o?ö\u0003";
                  var19 = ";ï\b¥e¦\u0019½\"[÷:>8Z\u0084\u000fîÐ\u007fsï©){<VÈ`£\u009eäè\u0012a\u0081£\u001e\u0090\u0006%IV\u001c&\u0081\u0004ö7ëþ¬7ÒÉB8\u0005\u009f¬\u000f®X\u008dîÒ1\u0086êt]\u0091\u001f»Å®\u001f{sß\u0004ºØÇzó÷\u0012\u0091ðDx«_»Õo]ÿ\u00043ô/\u0017\u0010ÈS#¢o?ö\u0003"
                     .length();
                  var16 = '8';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj d(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12110;
      if (o[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])p.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_nj", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = n[var5].getBytes("ISO-8859-1");
         o[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return o[var5];
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
         throw new RuntimeException("com/zelix/_nj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31480;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_nj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_nj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
