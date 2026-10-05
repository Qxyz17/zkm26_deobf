package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _fs {
   private final _y4 H;
   private final Map x;
   private final String w;
   private final _y4 W;
   private final Set m;
   private final Map G;
   private static final long a = ess.a(3096211082019400390L, -922347327392172380L, MethodHandles.lookup().lookupClass()).a(136110833199848L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public void K(Object[] var1) {
      String var5 = (String)var1[0];
      long var2 = (Long)var1[1];
      String var4 = (String)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 77986234163738L;
      boolean var10000 = x44.a<"v">(1398222314454365272L, var2);
      String var9 = x44.a<"j">(this, 754067285532507240L, var2).put(var5, var4);
      boolean var8 = var10000;

      label26: {
         try {
            var13 = var9;
            if (!var8) {
               break label26;
            }

            if (var9 == null) {
               return;
            }
         } catch (gj var11) {
            throw x44.a<"v">(var11, 823606637647660299L, var2);
         }

         var13 = var9;
      }

      try {
         if (!var13.equals(var4)) {
            x44.a<"n">(
               this,
               new Object[]{
                  a<"m">(2653, 7705524518585557045L ^ var2)
                     + var5
                     + a<"m">(8694, 2453674361972706180L ^ var2)
                     + var9
                     + a<"m">(20376, 4852128246159353313L ^ var2)
                     + var4
                     + "'",
                  var6
               },
               1250860433333749127L,
               var2
            );
         }
      } catch (gj var10) {
         throw x44.a<"v">(var10, 823606637647660299L, var2);
      }
   }

   public String T(Object[] param1) {
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
      // 00c: getstatic com/zelix/_fs.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 35742695516803
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 8930399273403
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 7656749220431
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 61374337312305
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 21520347094427
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 2348840664597
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 130730170132231
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 37901124451709
      // 048: lxor
      // 049: lstore 18
      // 04b: pop2
      // 04c: ldc2_w 8007487437372704799
      // 04f: lload 2
      // 050: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: new java/lang/StringBuilder
      // 058: dup
      // 059: sipush 15090
      // 05c: ldc2_w 6841017157887470894
      // 05f: lload 2
      // 060: lxor
      // 061: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: invokespecial java/lang/StringBuilder.<init> (I)V
      // 069: astore 21
      // 06b: aload 21
      // 06d: sipush 8037
      // 070: ldc2_w 2251179903388289369
      // 073: lload 2
      // 074: lxor
      // 075: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07d: pop
      // 07e: aload 21
      // 080: aload 0
      // 081: ldc2_w 8187889263471584303
      // 084: lload 2
      // 085: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d: pop
      // 08e: istore 20
      // 090: aload 21
      // 092: sipush 2232
      // 095: ldc2_w 3886043347339976329
      // 098: lload 2
      // 099: lxor
      // 09a: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: pop
      // 0a3: aload 21
      // 0a5: sipush 664
      // 0a8: ldc2_w 8628124197486466236
      // 0ab: lload 2
      // 0ac: lxor
      // 0ad: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b5: pop
      // 0b6: aload 21
      // 0b8: sipush 23379
      // 0bb: ldc2_w 8508374968193928322
      // 0be: lload 2
      // 0bf: lxor
      // 0c0: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c8: pop
      // 0c9: aload 21
      // 0cb: sipush 25779
      // 0ce: ldc2_w 6689444603301982877
      // 0d1: lload 2
      // 0d2: lxor
      // 0d3: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: pop
      // 0dc: aload 21
      // 0de: sipush 23379
      // 0e1: ldc2_w 8508374968193928322
      // 0e4: lload 2
      // 0e5: lxor
      // 0e6: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ee: pop
      // 0ef: aload 21
      // 0f1: lload 4
      // 0f3: bipush 1
      // 0f4: anewarray 360
      // 0f7: dup_x2
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fd: bipush 0
      // 0fe: swap
      // 0ff: aastore
      // 100: ldc2_w 8376094631512495973
      // 103: lload 2
      // 104: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10c: pop
      // 10d: aload 21
      // 10f: getstatic com/zelix/mc.R Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: pop
      // 116: aload 21
      // 118: getstatic com/zelix/mc.R Ljava/lang/String;
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: pop
      // 11f: aload 0
      // 120: ldc2_w 7596250840645616052
      // 123: lload 2
      // 124: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: invokeinterface java/util/Set.size ()I 1
      // 12e: iload 20
      // 130: ifeq 229
      // 133: ifle 21a
      // 136: goto 143
      // 139: ldc2_w 8586461719658232140
      // 13c: lload 2
      // 13d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: new java/util/ArrayList
      // 146: dup
      // 147: aload 0
      // 148: ldc2_w 7596250840645616052
      // 14b: lload 2
      // 14c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: invokeinterface java/util/Set.size ()I 1
      // 156: bipush 2
      // 157: iadd
      // 158: invokespecial java/util/ArrayList.<init> (I)V
      // 15b: astore 22
      // 15d: aload 22
      // 15f: new java/lang/StringBuilder
      // 162: dup
      // 163: invokespecial java/lang/StringBuilder.<init> ()V
      // 166: aload 0
      // 167: ldc2_w 7596250840645616052
      // 16a: lload 2
      // 16b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokeinterface java/util/Set.size ()I 1
      // 175: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 178: sipush 24604
      // 17b: ldc2_w 1170929275555673655
      // 17e: lload 2
      // 17f: lxor
      // 180: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 188: sipush 27708
      // 18b: ldc2_w 4098120499605731855
      // 18e: lload 2
      // 18f: lxor
      // 190: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 198: sipush 3231
      // 19b: ldc2_w 1007966298394958522
      // 19e: lload 2
      // 19f: lxor
      // 1a0: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ab: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1b0: pop
      // 1b1: aload 22
      // 1b3: ldc ""
      // 1b5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ba: pop
      // 1bb: aload 22
      // 1bd: aload 0
      // 1be: ldc2_w 7596250840645616052
      // 1c1: lload 2
      // 1c2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 1cc: pop
      // 1cd: aload 22
      // 1cf: invokeinterface java/util/List.size ()I 1
      // 1d4: anewarray 8
      // 1d7: astore 23
      // 1d9: aload 22
      // 1db: aload 23
      // 1dd: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1e2: pop
      // 1e3: aload 21
      // 1e5: bipush 0
      // 1e6: lload 16
      // 1e8: aload 23
      // 1ea: bipush 3
      // 1eb: anewarray 360
      // 1ee: dup_x1
      // 1ef: swap
      // 1f0: bipush 2
      // 1f1: swap
      // 1f2: aastore
      // 1f3: dup_x2
      // 1f4: dup_x2
      // 1f5: pop
      // 1f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f9: bipush 1
      // 1fa: swap
      // 1fb: aastore
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 201: bipush 0
      // 202: swap
      // 203: aastore
      // 204: ldc2_w 7603408023318971694
      // 207: lload 2
      // 208: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: pop
      // 211: aload 21
      // 213: getstatic com/zelix/mc.R Ljava/lang/String;
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: pop
      // 21a: aload 0
      // 21b: ldc2_w 8516808943093874735
      // 21e: lload 2
      // 21f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: invokeinterface java/util/Map.size ()I 1
      // 229: lload 2
      // 22a: lconst_0
      // 22b: lcmp
      // 22c: iflt 447
      // 22f: iload 20
      // 231: ifeq 447
      // 234: ifle 426
      // 237: goto 244
      // 23a: ldc2_w 8586461719658232140
      // 23d: lload 2
      // 23e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: aload 0
      // 245: ldc2_w 8516808943093874735
      // 248: lload 2
      // 249: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: invokeinterface java/util/Map.size ()I 1
      // 253: lload 8
      // 255: invokestatic com/zelix/sh.Q (IJ)I
      // 258: lload 12
      // 25a: dup2_x1
      // 25b: pop2
      // 25c: bipush 2
      // 25d: anewarray 360
      // 260: dup_x1
      // 261: swap
      // 262: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 265: bipush 1
      // 266: swap
      // 267: aastore
      // 268: dup_x2
      // 269: dup_x2
      // 26a: pop
      // 26b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26e: bipush 0
      // 26f: swap
      // 270: aastore
      // 271: ldc2_w 8031696136335257186
      // 274: lload 2
      // 275: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: astore 22
      // 27c: aload 0
      // 27d: ldc2_w 8516808943093874735
      // 280: lload 2
      // 281: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 28b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 290: astore 23
      // 292: aload 23
      // 294: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 299: ifeq 417
      // 29c: aload 23
      // 29e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a3: checkcast java/util/Map$Entry
      // 2a6: astore 24
      // 2a8: aload 24
      // 2aa: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2af: checkcast java/lang/String
      // 2b2: astore 25
      // 2b4: aload 24
      // 2b6: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2bb: checkcast java/lang/String
      // 2be: astore 26
      // 2c0: new java/lang/StringBuilder
      // 2c3: dup
      // 2c4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c7: astore 27
      // 2c9: new java/util/StringTokenizer
      // 2cc: dup
      // 2cd: aload 25
      // 2cf: ldc "."
      // 2d1: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 2d4: astore 28
      // 2d6: aload 28
      // 2d8: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 2db: istore 29
      // 2dd: bipush 1
      // 2de: iload 20
      // 2e0: ifeq 447
      // 2e3: istore 30
      // 2e5: iload 30
      // 2e7: iload 29
      // 2e9: bipush 1
      // 2ea: isub
      // 2eb: if_icmpgt 3d4
      // 2ee: aload 27
      // 2f0: aload 28
      // 2f2: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 2f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f8: pop
      // 2f9: aload 27
      // 2fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2fe: astore 31
      // 300: aload 22
      // 302: aload 31
      // 304: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 309: lload 2
      // 30a: lconst_0
      // 30b: lcmp
      // 30c: ifle 414
      // 30f: iload 20
      // 311: ifeq 411
      // 314: iload 20
      // 316: lload 2
      // 317: lconst_0
      // 318: lcmp
      // 319: ifle 3b4
      // 31c: ifeq 3aa
      // 31f: goto 32c
      // 322: ldc2_w 8586461719658232140
      // 325: lload 2
      // 326: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: athrow
      // 32c: ifne 3a8
      // 32f: goto 33c
      // 332: ldc2_w 8586461719658232140
      // 335: lload 2
      // 336: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: athrow
      // 33c: aload 0
      // 33d: lload 18
      // 33f: aload 31
      // 341: aload 26
      // 343: lload 10
      // 345: iload 30
      // 347: bipush 3
      // 348: anewarray 360
      // 34b: dup_x1
      // 34c: swap
      // 34d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 350: bipush 2
      // 351: swap
      // 352: aastore
      // 353: dup_x2
      // 354: dup_x2
      // 355: pop
      // 356: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 359: bipush 1
      // 35a: swap
      // 35b: aastore
      // 35c: dup_x1
      // 35d: swap
      // 35e: bipush 0
      // 35f: swap
      // 360: aastore
      // 361: ldc2_w 7549249537315668224
      // 364: lload 2
      // 365: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: aload 21
      // 36c: bipush 4
      // 36d: anewarray 360
      // 370: dup_x1
      // 371: swap
      // 372: bipush 3
      // 373: swap
      // 374: aastore
      // 375: dup_x1
      // 376: swap
      // 377: bipush 2
      // 378: swap
      // 379: aastore
      // 37a: dup_x1
      // 37b: swap
      // 37c: bipush 1
      // 37d: swap
      // 37e: aastore
      // 37f: dup_x2
      // 380: dup_x2
      // 381: pop
      // 382: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 385: bipush 0
      // 386: swap
      // 387: aastore
      // 388: ldc2_w 8556820650898056898
      // 38b: lload 2
      // 38c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 391: aload 22
      // 393: aload 31
      // 395: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 39a: pop
      // 39b: goto 3a8
      // 39e: ldc2_w 8586461719658232140
      // 3a1: lload 2
      // 3a2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: athrow
      // 3a8: iload 30
      // 3aa: lload 2
      // 3ab: lconst_0
      // 3ac: lcmp
      // 3ad: ifle 3d1
      // 3b0: iload 29
      // 3b2: bipush 2
      // 3b3: isub
      // 3b4: if_icmpgt 3cc
      // 3b7: aload 27
      // 3b9: ldc "."
      // 3bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3be: pop
      // 3bf: goto 3cc
      // 3c2: ldc2_w 8586461719658232140
      // 3c5: lload 2
      // 3c6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: iinc 30 1
      // 3cf: iload 20
      // 3d1: ifne 2e5
      // 3d4: aload 0
      // 3d5: lload 18
      // 3d7: aload 25
      // 3d9: aload 26
      // 3db: aload 21
      // 3dd: bipush 4
      // 3de: anewarray 360
      // 3e1: dup_x1
      // 3e2: swap
      // 3e3: bipush 3
      // 3e4: swap
      // 3e5: aastore
      // 3e6: dup_x1
      // 3e7: swap
      // 3e8: bipush 2
      // 3e9: swap
      // 3ea: aastore
      // 3eb: dup_x1
      // 3ec: swap
      // 3ed: bipush 1
      // 3ee: swap
      // 3ef: aastore
      // 3f0: dup_x2
      // 3f1: dup_x2
      // 3f2: pop
      // 3f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f6: bipush 0
      // 3f7: swap
      // 3f8: aastore
      // 3f9: ldc2_w 8556820650898056898
      // 3fc: lload 2
      // 3fd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: aload 22
      // 404: lload 2
      // 405: lconst_0
      // 406: lcmp
      // 407: ifle 466
      // 40a: aload 25
      // 40c: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 411: pop
      // 412: iload 20
      // 414: ifne 292
      // 417: aload 21
      // 419: getstatic com/zelix/mc.R Ljava/lang/String;
      // 41c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41f: lload 2
      // 420: lconst_0
      // 421: lcmp
      // 422: ifle 2a3
      // 425: pop
      // 426: aload 0
      // 427: ldc2_w 8512794814879292877
      // 42a: lload 2
      // 42b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 430: iload 20
      // 432: ifeq 461
      // 435: invokeinterface java/util/Map.size ()I 1
      // 43a: goto 447
      // 43d: ldc2_w 8586461719658232140
      // 440: lload 2
      // 441: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: athrow
      // 447: ifle 610
      // 44a: aload 0
      // 44b: ldc2_w 8512794814879292877
      // 44e: lload 2
      // 44f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 454: goto 461
      // 457: ldc2_w 8586461719658232140
      // 45a: lload 2
      // 45b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 460: athrow
      // 461: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 466: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 46b: astore 22
      // 46d: aload 22
      // 46f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 474: ifeq 610
      // 477: aload 22
      // 479: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 47e: checkcast java/util/Map$Entry
      // 481: astore 23
      // 483: aload 21
      // 485: sipush 5676
      // 488: ldc2_w 6355730008796626961
      // 48b: lload 2
      // 48c: lxor
      // 48d: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 492: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 495: pop
      // 496: aload 23
      // 498: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 49d: checkcast java/lang/String
      // 4a0: astore 24
      // 4a2: aload 21
      // 4a4: aload 24
      // 4a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a9: lload 2
      // 4aa: lconst_0
      // 4ab: lcmp
      // 4ac: iflt 556
      // 4af: pop
      // 4b0: iload 20
      // 4b2: ifeq 547
      // 4b5: aload 24
      // 4b7: lload 2
      // 4b8: lconst_0
      // 4b9: lcmp
      // 4ba: ifle 615
      // 4bd: iload 20
      // 4bf: ifeq 615
      // 4c2: goto 4cf
      // 4c5: ldc2_w 8586461719658232140
      // 4c8: lload 2
      // 4c9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ce: athrow
      // 4cf: aload 23
      // 4d1: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 4d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4d9: ifeq 527
      // 4dc: goto 4e9
      // 4df: ldc2_w 8586461719658232140
      // 4e2: lload 2
      // 4e3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e8: athrow
      // 4e9: aload 21
      // 4eb: sipush 15370
      // 4ee: ldc2_w 4347309884516543447
      // 4f1: lload 2
      // 4f2: lxor
      // 4f3: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f8: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4fb: pop
      // 4fc: aload 21
      // 4fe: sipush 2895
      // 501: ldc2_w 5846482704433454457
      // 504: lload 2
      // 505: lxor
      // 506: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50e: pop
      // 50f: iload 20
      // 511: lload 2
      // 512: lconst_0
      // 513: lcmp
      // 514: iflt 60d
      // 517: ifne 557
      // 51a: goto 527
      // 51d: ldc2_w 8586461719658232140
      // 520: lload 2
      // 521: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: athrow
      // 527: aload 21
      // 529: sipush 5970
      // 52c: ldc2_w 576220653470908787
      // 52f: lload 2
      // 530: lxor
      // 531: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 536: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 539: pop
      // 53a: goto 547
      // 53d: ldc2_w 8586461719658232140
      // 540: lload 2
      // 541: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 546: athrow
      // 547: aload 21
      // 549: aload 23
      // 54b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 550: checkcast java/lang/String
      // 553: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 556: pop
      // 557: aload 21
      // 559: getstatic com/zelix/mc.R Ljava/lang/String;
      // 55c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55f: pop
      // 560: aload 0
      // 561: aload 24
      // 563: sipush 8959
      // 566: ldc2_w 4107314434212803784
      // 569: lload 2
      // 56a: lxor
      // 56b: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 570: aload 0
      // 571: ldc2_w 8120225681076860844
      // 574: lload 2
      // 575: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57a: aload 24
      // 57c: lload 6
      // 57e: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 581: lload 14
      // 583: dup2_x1
      // 584: pop2
      // 585: aload 21
      // 587: bipush 5
      // 588: anewarray 360
      // 58b: dup_x1
      // 58c: swap
      // 58d: bipush 4
      // 58e: swap
      // 58f: aastore
      // 590: dup_x1
      // 591: swap
      // 592: bipush 3
      // 593: swap
      // 594: aastore
      // 595: dup_x2
      // 596: dup_x2
      // 597: pop
      // 598: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59b: bipush 2
      // 59c: swap
      // 59d: aastore
      // 59e: dup_x1
      // 59f: swap
      // 5a0: bipush 1
      // 5a1: swap
      // 5a2: aastore
      // 5a3: dup_x1
      // 5a4: swap
      // 5a5: bipush 0
      // 5a6: swap
      // 5a7: aastore
      // 5a8: ldc2_w 8446047808986864139
      // 5ab: lload 2
      // 5ac: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b1: aload 0
      // 5b2: aload 24
      // 5b4: sipush 25000
      // 5b7: ldc2_w 436275488656160642
      // 5ba: lload 2
      // 5bb: lxor
      // 5bc: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: aload 0
      // 5c2: ldc2_w 7546865581384180382
      // 5c5: lload 2
      // 5c6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: aload 24
      // 5cd: lload 6
      // 5cf: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 5d2: lload 14
      // 5d4: dup2_x1
      // 5d5: pop2
      // 5d6: aload 21
      // 5d8: bipush 5
      // 5d9: anewarray 360
      // 5dc: dup_x1
      // 5dd: swap
      // 5de: bipush 4
      // 5df: swap
      // 5e0: aastore
      // 5e1: dup_x1
      // 5e2: swap
      // 5e3: bipush 3
      // 5e4: swap
      // 5e5: aastore
      // 5e6: dup_x2
      // 5e7: dup_x2
      // 5e8: pop
      // 5e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5ec: bipush 2
      // 5ed: swap
      // 5ee: aastore
      // 5ef: dup_x1
      // 5f0: swap
      // 5f1: bipush 1
      // 5f2: swap
      // 5f3: aastore
      // 5f4: dup_x1
      // 5f5: swap
      // 5f6: bipush 0
      // 5f7: swap
      // 5f8: aastore
      // 5f9: ldc2_w 8446047808986864139
      // 5fc: lload 2
      // 5fd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 602: aload 21
      // 604: getstatic com/zelix/mc.R Ljava/lang/String;
      // 607: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60a: pop
      // 60b: iload 20
      // 60d: ifne 46d
      // 610: aload 21
      // 612: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 615: ldc2_w 7679234977095909949
      // 618: lload 2
      // 619: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61e: ifnonnull 64b
      // 621: iload 20
      // 623: ifeq 641
      // 626: goto 633
      // 629: ldc2_w 8586461719658232140
      // 62c: lload 2
      // 62d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 632: athrow
      // 633: bipush 0
      // 634: goto 642
      // 637: ldc2_w 8586461719658232140
      // 63a: lload 2
      // 63b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 640: athrow
      // 641: bipush 1
      // 642: ldc2_w 7731397362254934691
      // 645: lload 2
      // 646: invokedynamic q (ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64b: areturn
   }

   private void M(Object[] param1) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/List
      // 021: astore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/StringBuilder
      // 028: astore 5
      // 02a: pop
      // 02b: getstatic com/zelix/_fs.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: ldc2_w -969889242797484619
      // 036: lload 6
      // 038: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 8
      // 03f: aload 3
      // 040: iload 8
      // 042: ifeq 057
      // 045: ifnull 158
      // 048: goto 056
      // 04b: ldc2_w -1548340204117269274
      // 04e: lload 6
      // 050: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: athrow
      // 056: aload 3
      // 057: iload 8
      // 059: ifeq 099
      // 05c: invokeinterface java/util/List.size ()I 1
      // 061: ifle 158
      // 064: goto 072
      // 067: ldc2_w -1548340204117269274
      // 06a: lload 6
      // 06c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 5
      // 074: aload 2
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: pop
      // 079: aload 5
      // 07b: aload 4
      // 07d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 080: pop
      // 081: aload 5
      // 083: getstatic com/zelix/mc.R Ljava/lang/String;
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: pop
      // 08a: aload 3
      // 08b: goto 099
      // 08e: ldc2_w -1548340204117269274
      // 091: lload 6
      // 093: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09e: astore 9
      // 0a0: aload 9
      // 0a2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a7: ifeq 158
      // 0aa: aload 9
      // 0ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b1: checkcast java/lang/String
      // 0b4: astore 10
      // 0b6: aload 10
      // 0b8: sipush 23809
      // 0bb: ldc2_w 5255326519533033094
      // 0be: lload 6
      // 0c0: lxor
      // 0c1: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0c9: bipush -1
      // 0ca: lload 6
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 109
      // 0d1: iload 8
      // 0d3: ifeq 109
      // 0d6: if_icmpne 153
      // 0d9: goto 0e7
      // 0dc: ldc2_w -1548340204117269274
      // 0df: lload 6
      // 0e1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 10
      // 0e9: sipush 23831
      // 0ec: ldc2_w 3273691392557405851
      // 0ef: lload 6
      // 0f1: lxor
      // 0f2: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0fa: bipush -1
      // 0fb: goto 109
      // 0fe: ldc2_w -1548340204117269274
      // 101: lload 6
      // 103: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: if_icmpne 153
      // 10c: aload 5
      // 10e: sipush 15370
      // 111: ldc2_w 4347296317881628285
      // 114: lload 6
      // 116: lxor
      // 117: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 11f: pop
      // 120: aload 5
      // 122: sipush 15370
      // 125: ldc2_w 4347296317881628285
      // 128: lload 6
      // 12a: lxor
      // 12b: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 133: pop
      // 134: aload 5
      // 136: aload 10
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: pop
      // 13c: aload 5
      // 13e: getstatic com/zelix/mc.R Ljava/lang/String;
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: pop
      // 145: goto 153
      // 148: ldc2_w -1548340204117269274
      // 14b: lload 6
      // 14d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: iload 8
      // 155: ifne 0a0
      // 158: return
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/String
      // 015: astore 5
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/String
      // 01d: astore 6
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/util/List
      // 025: astore 4
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/lang/Long
      // 02d: invokevirtual java/lang/Long.longValue ()J
      // 030: lstore 7
      // 032: pop
      // 033: getstatic com/zelix/_fs.a J
      // 036: lload 7
      // 038: lxor
      // 039: lstore 7
      // 03b: lload 7
      // 03d: dup2
      // 03e: ldc2_w 128525365287513
      // 041: lxor
      // 042: lstore 9
      // 044: pop2
      // 045: new java/lang/StringBuilder
      // 048: dup
      // 049: invokespecial java/lang/StringBuilder.<init> ()V
      // 04c: astore 12
      // 04e: aload 12
      // 050: aload 3
      // 051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 054: pop
      // 055: ldc2_w -7695496096289574389
      // 058: lload 7
      // 05a: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: aload 12
      // 061: sipush 23711
      // 064: ldc2_w 7164220310491181394
      // 067: lload 7
      // 069: lxor
      // 06a: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 072: pop
      // 073: aload 12
      // 075: aload 5
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: pop
      // 07b: aload 12
      // 07d: sipush 20116
      // 080: ldc2_w 3554157182616249178
      // 083: lload 7
      // 085: lxor
      // 086: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 08e: pop
      // 08f: istore 11
      // 091: iload 11
      // 093: ifeq 150
      // 096: aload 4
      // 098: ifnull 135
      // 09b: goto 0a9
      // 09e: ldc2_w -8269337873405836456
      // 0a1: lload 7
      // 0a3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 4
      // 0ab: invokeinterface java/util/List.size ()I 1
      // 0b0: istore 13
      // 0b2: bipush 0
      // 0b3: istore 14
      // 0b5: iload 14
      // 0b7: iload 13
      // 0b9: if_icmpge 135
      // 0bc: aload 12
      // 0be: aload 4
      // 0c0: iload 14
      // 0c2: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c7: checkcast java/lang/String
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: pop
      // 0ce: iload 11
      // 0d0: lload 7
      // 0d2: lconst_0
      // 0d3: lcmp
      // 0d4: ifle 132
      // 0d7: ifeq 130
      // 0da: iload 14
      // 0dc: lload 7
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 171
      // 0e3: iload 11
      // 0e5: ifeq 171
      // 0e8: goto 0f6
      // 0eb: ldc2_w -8269337873405836456
      // 0ee: lload 7
      // 0f0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: iload 13
      // 0f8: bipush 1
      // 0f9: isub
      // 0fa: if_icmpge 12d
      // 0fd: goto 10b
      // 100: ldc2_w -8269337873405836456
      // 103: lload 7
      // 105: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 12
      // 10d: sipush 12051
      // 110: ldc2_w 5362030276817339097
      // 113: lload 7
      // 115: lxor
      // 116: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 11e: pop
      // 11f: goto 12d
      // 122: ldc2_w -8269337873405836456
      // 125: lload 7
      // 127: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: iinc 14 1
      // 130: iload 11
      // 132: ifne 0b5
      // 135: aload 12
      // 137: sipush 2997
      // 13a: ldc2_w 2710893768960501374
      // 13d: lload 7
      // 13f: lxor
      // 140: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 148: pop
      // 149: lload 7
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 1d1
      // 150: iload 11
      // 152: lload 7
      // 154: lconst_0
      // 155: lcmp
      // 156: iflt 163
      // 159: ifeq 1df
      // 15c: aload 5
      // 15e: aload 6
      // 160: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 163: goto 171
      // 166: ldc2_w -8269337873405836456
      // 169: lload 7
      // 16b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: lload 7
      // 173: lconst_0
      // 174: lcmp
      // 175: iflt 1ac
      // 178: ifeq 1bd
      // 17b: aload 12
      // 17d: sipush 10216
      // 180: ldc2_w 1016112381367732780
      // 183: lload 7
      // 185: lxor
      // 186: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 18e: pop
      // 18f: aload 12
      // 191: sipush 24479
      // 194: ldc2_w 7618663476988556200
      // 197: lload 7
      // 199: lxor
      // 19a: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a2: pop
      // 1a3: lload 7
      // 1a5: lconst_0
      // 1a6: lcmp
      // 1a7: iflt 1fd
      // 1aa: iload 11
      // 1ac: ifne 1e7
      // 1af: goto 1bd
      // 1b2: ldc2_w -8269337873405836456
      // 1b5: lload 7
      // 1b7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: aload 12
      // 1bf: sipush 8567
      // 1c2: ldc2_w 2853027906180271427
      // 1c5: lload 7
      // 1c7: lxor
      // 1c8: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d0: pop
      // 1d1: goto 1df
      // 1d4: ldc2_w -8269337873405836456
      // 1d7: lload 7
      // 1d9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 12
      // 1e1: aload 6
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e6: pop
      // 1e7: aload 0
      // 1e8: ldc2_w -7876920859321476982
      // 1eb: lload 7
      // 1ed: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: aload 2
      // 1f3: aload 12
      // 1f5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f8: lload 9
      // 1fa: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1fd: return
   }

   private void T(Object[] param1) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 6
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/lang/StringBuilder
      // 21: astore 4
      // 23: pop
      // 24: getstatic com/zelix/_fs.a J
      // 27: lload 2
      // 28: lxor
      // 29: lstore 2
      // 2a: ldc2_w -1017142241500965155
      // 2d: lload 2
      // 2e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: sipush 23044
      // 38: ldc2_w 28657788507837156
      // 3b: lload 2
      // 3c: lxor
      // 3d: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45: pop
      // 46: istore 7
      // 48: aload 4
      // 4a: aload 5
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: iload 7
      // 52: ifeq ca
      // 55: aload 5
      // 57: aload 6
      // 59: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5c: ifeq aa
      // 5f: goto 6c
      // 62: ldc2_w -1591159816494159986
      // 65: lload 2
      // 66: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: aload 4
      // 6e: sipush 15370
      // 71: ldc2_w 4347260815039902997
      // 74: lload 2
      // 75: lxor
      // 76: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 7e: pop
      // 7f: aload 4
      // 81: sipush 2895
      // 84: ldc2_w 5846460563327157179
      // 87: lload 2
      // 88: lxor
      // 89: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: pop
      // 92: lload 2
      // 93: lconst_0
      // 94: lcmp
      // 95: ifle db
      // 98: iload 7
      // 9a: ifne d2
      // 9d: goto aa
      // a0: ldc2_w -1591159816494159986
      // a3: lload 2
      // a4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: athrow
      // aa: aload 4
      // ac: sipush 5970
      // af: ldc2_w 576188359088152497
      // b2: lload 2
      // b3: lxor
      // b4: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bc: pop
      // bd: goto ca
      // c0: ldc2_w -1591159816494159986
      // c3: lload 2
      // c4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: athrow
      // ca: aload 4
      // cc: aload 6
      // ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d1: pop
      // d2: aload 4
      // d4: getstatic com/zelix/mc.R Ljava/lang/String;
      // d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // da: pop
      // db: return
   }

   public void O(Object[] param1) {
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
      // 016: checkcast java/lang/String
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/String
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/String
      // 029: astore 7
      // 02b: pop
      // 02c: getstatic com/zelix/_fs.a J
      // 02f: lload 2
      // 030: lxor
      // 031: lstore 2
      // 032: lload 2
      // 033: dup2
      // 034: ldc2_w 84072248911856
      // 037: lxor
      // 038: lstore 8
      // 03a: pop2
      // 03b: ldc2_w -6296837668806914142
      // 03e: lload 2
      // 03f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: new java/lang/StringBuilder
      // 047: dup
      // 048: invokespecial java/lang/StringBuilder.<init> ()V
      // 04b: astore 11
      // 04d: aload 11
      // 04f: aload 5
      // 051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 054: pop
      // 055: aload 11
      // 057: sipush 23379
      // 05a: ldc2_w 8508352009352612671
      // 05d: lload 2
      // 05e: lxor
      // 05f: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 067: pop
      // 068: istore 10
      // 06a: aload 11
      // 06c: aload 6
      // 06e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 071: pop
      // 072: iload 10
      // 074: ifeq 0ec
      // 077: aload 6
      // 079: aload 7
      // 07b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07e: ifeq 0cc
      // 081: goto 08e
      // 084: ldc2_w -5722859519986352399
      // 087: lload 2
      // 088: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: aload 11
      // 090: sipush 15370
      // 093: ldc2_w 4347332259319180394
      // 096: lload 2
      // 097: lxor
      // 098: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0a0: pop
      // 0a1: aload 11
      // 0a3: sipush 2895
      // 0a6: ldc2_w 5846391318033423044
      // 0a9: lload 2
      // 0aa: lxor
      // 0ab: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b3: pop
      // 0b4: lload 2
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: iflt 10a
      // 0ba: iload 10
      // 0bc: ifne 0f4
      // 0bf: goto 0cc
      // 0c2: ldc2_w -5722859519986352399
      // 0c5: lload 2
      // 0c6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 11
      // 0ce: sipush 5970
      // 0d1: ldc2_w 576259847357941454
      // 0d4: lload 2
      // 0d5: lxor
      // 0d6: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: pop
      // 0df: goto 0ec
      // 0e2: ldc2_w -5722859519986352399
      // 0e5: lload 2
      // 0e6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 11
      // 0ee: aload 7
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: pop
      // 0f4: aload 0
      // 0f5: ldc2_w -5256339729592291311
      // 0f8: lload 2
      // 0f9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: aload 4
      // 100: aload 11
      // 102: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 105: lload 8
      // 107: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 10a: return
   }

   public void e(Object[] param1) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/_fs.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 25908384399879
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 45166223719445
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 105974747970992
      // 034: lxor
      // 035: lstore 10
      // 037: pop2
      // 038: ldc2_w -7545260266938304567
      // 03b: lload 3
      // 03c: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: aload 0
      // 042: ldc2_w -7751857559613915259
      // 045: lload 3
      // 046: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 2
      // 04c: aload 5
      // 04e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 053: checkcast java/lang/String
      // 056: astore 13
      // 058: istore 12
      // 05a: aload 13
      // 05c: iload 12
      // 05e: ifne 18c
      // 061: ifnull 179
      // 064: goto 071
      // 067: ldc2_w -7682747175673783548
      // 06a: lload 3
      // 06b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: lload 3
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 16c
      // 077: aload 13
      // 079: aload 5
      // 07b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07e: ifne 10b
      // 081: goto 08e
      // 084: ldc2_w -7682747175673783548
      // 087: lload 3
      // 088: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: aload 0
      // 08f: new java/lang/StringBuilder
      // 092: dup
      // 093: invokespecial java/lang/StringBuilder.<init> ()V
      // 096: sipush 22264
      // 099: ldc2_w 3421356559636931200
      // 09c: lload 3
      // 09d: lxor
      // 09e: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6: aload 2
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: sipush 17261
      // 0ad: ldc2_w 8046005176588285713
      // 0b0: lload 3
      // 0b1: lxor
      // 0b2: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ba: aload 13
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: sipush 10540
      // 0c2: ldc2_w 767819265066163523
      // 0c5: lload 3
      // 0c6: lxor
      // 0c7: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: aload 5
      // 0d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d4: ldc "'"
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0dc: lload 8
      // 0de: bipush 2
      // 0df: anewarray 360
      // 0e2: dup_x2
      // 0e3: dup_x2
      // 0e4: pop
      // 0e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e8: bipush 1
      // 0e9: swap
      // 0ea: aastore
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w -8118691509068129400
      // 0f3: lload 3
      // 0f4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: iload 12
      // 0fb: ifeq 179
      // 0fe: goto 10b
      // 101: ldc2_w -7682747175673783548
      // 104: lload 3
      // 105: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 0
      // 10c: new java/lang/StringBuilder
      // 10f: dup
      // 110: invokespecial java/lang/StringBuilder.<init> ()V
      // 113: sipush 30554
      // 116: ldc2_w 2755728630749954874
      // 119: lload 3
      // 11a: lxor
      // 11b: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: aload 2
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: sipush 8445
      // 12a: ldc2_w 4790084367013020
      // 12d: lload 3
      // 12e: lxor
      // 12f: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: aload 5
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: sipush 1513
      // 13f: ldc2_w 9103662280460202381
      // 142: lload 3
      // 143: lxor
      // 144: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/_fs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14f: lload 8
      // 151: bipush 2
      // 152: anewarray 360
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 1
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: ldc2_w -8118691509068129400
      // 166: lload 3
      // 167: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: goto 179
      // 16f: ldc2_w -7682747175673783548
      // 172: lload 3
      // 173: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 2
      // 17a: sipush 25678
      // 17d: ldc2_w 2788336283770163678
      // 180: lload 3
      // 181: lxor
      // 182: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: lload 6
      // 189: invokestatic com/zelix/hz.p (Ljava/lang/String;CJ)Ljava/lang/String;
      // 18c: astore 14
      // 18e: aload 14
      // 190: iload 12
      // 192: ifne 1c9
      // 195: invokevirtual java/lang/String.length ()I
      // 198: ifle 1f2
      // 19b: goto 1a8
      // 19e: ldc2_w -7682747175673783548
      // 1a1: lload 3
      // 1a2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 5
      // 1aa: sipush 10735
      // 1ad: ldc2_w 4695093133271686268
      // 1b0: lload 3
      // 1b1: lxor
      // 1b2: invokedynamic n (IJ)I bsm=com/zelix/_fs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: lload 6
      // 1b9: invokestatic com/zelix/hz.p (Ljava/lang/String;CJ)Ljava/lang/String;
      // 1bc: goto 1c9
      // 1bf: ldc2_w -7682747175673783548
      // 1c2: lload 3
      // 1c3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: astore 15
      // 1cb: aload 0
      // 1cc: aload 14
      // 1ce: lload 10
      // 1d0: aload 15
      // 1d2: bipush 3
      // 1d3: anewarray 360
      // 1d6: dup_x1
      // 1d7: swap
      // 1d8: bipush 2
      // 1d9: swap
      // 1da: aastore
      // 1db: dup_x2
      // 1dc: dup_x2
      // 1dd: pop
      // 1de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e1: bipush 1
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x1
      // 1e5: swap
      // 1e6: bipush 0
      // 1e7: swap
      // 1e8: aastore
      // 1e9: ldc2_w -8021808980827081695
      // 1ec: lload 3
      // 1ed: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: return
   }

   public void E(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      String var5 = a<"m">(28148, 3842717129672345124L ^ var2) + var4;
      x44.a<"o">(this, 6091453012783397974L, var2).add(var5);
   }

   public _fs(String var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 97973748860694L;
      super();
      this.G = new TreeMap();
      this.x = new LinkedHashMap();
      this.m = new LinkedHashSet();
      this.H = new _y4(var4);
      this.W = new _y4(var4);
      this.w = var1;
   }

   private static String B(Object[] param0) {
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
      // 04: checkcast java/lang/String
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
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 1
      // 1c: pop
      // 1d: getstatic com/zelix/_fs.a J
      // 20: lload 3
      // 21: lxor
      // 22: lstore 3
      // 23: ldc2_w 3075526628044410257
      // 26: lload 3
      // 27: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: new java/util/StringTokenizer
      // 2f: dup
      // 30: aload 2
      // 31: ldc "."
      // 33: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 36: astore 6
      // 38: istore 5
      // 3a: aload 6
      // 3c: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 3f: istore 7
      // 41: new java/lang/StringBuilder
      // 44: dup
      // 45: invokespecial java/lang/StringBuilder.<init> ()V
      // 48: astore 8
      // 4a: bipush 0
      // 4b: istore 9
      // 4d: iload 9
      // 4f: iload 1
      // 50: if_icmpge c7
      // 53: iload 9
      // 55: lload 3
      // 56: lconst_0
      // 57: lcmp
      // 58: ifle 9c
      // 5b: iload 5
      // 5d: ifeq 9c
      // 60: iload 7
      // 62: if_icmpge c7
      // 65: goto 72
      // 68: ldc2_w 3649891772296903874
      // 6b: lload 3
      // 6c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: lload 3
      // 73: lconst_0
      // 74: lcmp
      // 75: ifle c2
      // 78: aload 8
      // 7a: iload 5
      // 7c: ifeq be
      // 7f: goto 8c
      // 82: ldc2_w 3649891772296903874
      // 85: lload 3
      // 86: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: invokevirtual java/lang/StringBuilder.length ()I
      // 8f: goto 9c
      // 92: ldc2_w 3649891772296903874
      // 95: lload 3
      // 96: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: ifle b4
      // 9f: aload 8
      // a1: ldc "."
      // a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a6: pop
      // a7: goto b4
      // aa: ldc2_w 3649891772296903874
      // ad: lload 3
      // ae: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: aload 8
      // b6: aload 6
      // b8: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // be: pop
      // bf: iinc 9 1
      // c2: iload 5
      // c4: ifne 4d
      // c7: aload 8
      // c9: lload 3
      // ca: lconst_0
      // cb: lcmp
      // cc: iflt b6
      // cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d2: areturn
   }

   static {
      long var11 = a ^ 27817422477148L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[27];
      int var18 = 0;
      String var17 = "!ñjX£ÀvKR®I\u0000ÁÝIDx¦æqbP\u0006ô\u0089Þõ¿-û\u001a¡¶Ê&HÍ.ªZ0!\u009b8ò\u0087\u0084Bv\u0084»Auåõyô»Ñ©²Î¢©\u0087;\u0085¦\u0080\u009exZï\u000f\u0003qÊ¾=ù\u0090À<§*²\\¶\u0090\u0018þ²ôï\u0013\u0099C/)þË\u009eøõôü\u0017>\u009dÂë£\u0002U\u0010ï\u001b1\u009bà]\u000bxw¼Ç~ÎvH«\u0010Ù³3\u001fß(ñø¦\fZÐ<kÐ6\u0010\u0007Çæ\u00848(\u0015ûæªQ,uØ·Ì\u0018((©\u000bJ]©è\u0011Ú\"$¡\u009dO\u009b`è®Îï\u0083¢\u000e «äpSj?µ¦¼Ä%dÑ\u008c Þ\u0002\u0085?TÊÀY\u0087\u0084É£«ø¦\u000fA0\u0097A\u001b\u001bÈ_:sÂ:ðcl& \u009fÅ\u0017Í*û\u0097\u0013·þêÕ1®í¿>\u0083\u001a\u0015Ý\u0096\u001c\u0004Ó%\u0093ÉåW\u0010®S\u0010Ó\u0099\u0003ùY\"5ê0\u001d\b\u001c\t\u007fì\u0084\u0018D²!\u0001\u000e~\u000eÜ2\u0092\u0082¯\u0011[´\u001a3+´?\u0082EÁ\n(\u00867ÃÀl\u008aÚ\u00892\u000b´1\u001c%¥\u0094øV\u008f{Ï'²\u009c·\u008d{l¤«s@\u008d5\u0002Pk\u0084\u009fJ B©î\u000f¨\u0089q§\u0015x\u0006³â\u001c¤\u0084\u009dRÄñµ£\u0082\u0019\u0082r5\u000fºñÝ\n\u0010âA\u0016&ÀBã\u0017\u001bË\u0003bã;kx\u0018ÖÄ\u0096J\u0011<PtÐ\u0019÷ø\u009e\u0003\u008eIåw¡jó3Ð\u001e0ý\bq)Ø\u009c$¿Y\u001c6çÙõãã¹ÌòX]\u0001)÷\u0085\nþ\"æsr\u001dpaxk+8\u0080Ó\u0011ùcùüÕdÅPÉ'©Kù\u000f'\u0085`\u008f\u008eÖN\u001eMRZ\u0095tsË*6Ù\u00808\u007fX\u0094|hk\u0083¥\u0005\u00111Àã\u0086\u000f\u0083\u0000¼\u0001\u001cK®ÇZ:\u000fpâ¬\u009ef:\u007fÚ\u009f\u00adS\u009b-j@ßS\u000f\u0012Nrh<Â\f}¿?`¸vRá©ÈÏèYh\u000e6\u0081}\u001bêÑÄxÜ*\u0088ó«uÊÒN\u00882u\u0099R\u0080\u009c\\Â\\8\u0001«è<\u0099\ræÍ\u0012é1?\u0016C»\u009d°Ø\u0011\u0090\u000eKLlMÎRjÞ\u0014\u008aÃ\u0086´ÆÉ²±\u0018\u0013Z\u0083\u0013\u0007V;30p#*\u000e\u0013½0\u00adt Ñ\u00adé£.ì»ÍÊüî¡\u009b\u0097X\u009f$\u0018.U%Zõ\u008et]¹EúÓ Ã\u0018(s©\u001cÎI×â.v\u009e7-Þ|¶\u008a\u00828\u0081M<Ã\f(ÓL\nØ\u001dqp©\u008a\u001eÓ\u0090VÛÏzbùs!&ÁÑd}=\u009e*@:\u0095-|øjEZåáñ\u0010ìï5\u0003rQmÑeùI_Þª$V\u0018ÙscÀ&(À§sM\u001dä¥X\tøï\u0087\u0086´\u0084õ\u008c° ·®\u0010\u0099â\u0007íA<>\u009e?\röÿ|\u0001â\tD¼BýBÕËû0\u008c\u008f4 (\u0085g\u0002\"ä?\u000e\u0094\u0018án¥Êg#ü*·rVvÞ\u0000\u008dÂ¸ùî¦`§ÕS\u0006 E\u0084\u001eÔ9";
      int var19 = "!ñjX£ÀvKR®I\u0000ÁÝIDx¦æqbP\u0006ô\u0089Þõ¿-û\u001a¡¶Ê&HÍ.ªZ0!\u009b8ò\u0087\u0084Bv\u0084»Auåõyô»Ñ©²Î¢©\u0087;\u0085¦\u0080\u009exZï\u000f\u0003qÊ¾=ù\u0090À<§*²\\¶\u0090\u0018þ²ôï\u0013\u0099C/)þË\u009eøõôü\u0017>\u009dÂë£\u0002U\u0010ï\u001b1\u009bà]\u000bxw¼Ç~ÎvH«\u0010Ù³3\u001fß(ñø¦\fZÐ<kÐ6\u0010\u0007Çæ\u00848(\u0015ûæªQ,uØ·Ì\u0018((©\u000bJ]©è\u0011Ú\"$¡\u009dO\u009b`è®Îï\u0083¢\u000e «äpSj?µ¦¼Ä%dÑ\u008c Þ\u0002\u0085?TÊÀY\u0087\u0084É£«ø¦\u000fA0\u0097A\u001b\u001bÈ_:sÂ:ðcl& \u009fÅ\u0017Í*û\u0097\u0013·þêÕ1®í¿>\u0083\u001a\u0015Ý\u0096\u001c\u0004Ó%\u0093ÉåW\u0010®S\u0010Ó\u0099\u0003ùY\"5ê0\u001d\b\u001c\t\u007fì\u0084\u0018D²!\u0001\u000e~\u000eÜ2\u0092\u0082¯\u0011[´\u001a3+´?\u0082EÁ\n(\u00867ÃÀl\u008aÚ\u00892\u000b´1\u001c%¥\u0094øV\u008f{Ï'²\u009c·\u008d{l¤«s@\u008d5\u0002Pk\u0084\u009fJ B©î\u000f¨\u0089q§\u0015x\u0006³â\u001c¤\u0084\u009dRÄñµ£\u0082\u0019\u0082r5\u000fºñÝ\n\u0010âA\u0016&ÀBã\u0017\u001bË\u0003bã;kx\u0018ÖÄ\u0096J\u0011<PtÐ\u0019÷ø\u009e\u0003\u008eIåw¡jó3Ð\u001e0ý\bq)Ø\u009c$¿Y\u001c6çÙõãã¹ÌòX]\u0001)÷\u0085\nþ\"æsr\u001dpaxk+8\u0080Ó\u0011ùcùüÕdÅPÉ'©Kù\u000f'\u0085`\u008f\u008eÖN\u001eMRZ\u0095tsË*6Ù\u00808\u007fX\u0094|hk\u0083¥\u0005\u00111Àã\u0086\u000f\u0083\u0000¼\u0001\u001cK®ÇZ:\u000fpâ¬\u009ef:\u007fÚ\u009f\u00adS\u009b-j@ßS\u000f\u0012Nrh<Â\f}¿?`¸vRá©ÈÏèYh\u000e6\u0081}\u001bêÑÄxÜ*\u0088ó«uÊÒN\u00882u\u0099R\u0080\u009c\\Â\\8\u0001«è<\u0099\ræÍ\u0012é1?\u0016C»\u009d°Ø\u0011\u0090\u000eKLlMÎRjÞ\u0014\u008aÃ\u0086´ÆÉ²±\u0018\u0013Z\u0083\u0013\u0007V;30p#*\u000e\u0013½0\u00adt Ñ\u00adé£.ì»ÍÊüî¡\u009b\u0097X\u009f$\u0018.U%Zõ\u008et]¹EúÓ Ã\u0018(s©\u001cÎI×â.v\u009e7-Þ|¶\u008a\u00828\u0081M<Ã\f(ÓL\nØ\u001dqp©\u008a\u001eÓ\u0090VÛÏzbùs!&ÁÑd}=\u009e*@:\u0095-|øjEZåáñ\u0010ìï5\u0003rQmÑeùI_Þª$V\u0018ÙscÀ&(À§sM\u001dä¥X\tøï\u0087\u0086´\u0084õ\u008c° ·®\u0010\u0099â\u0007íA<>\u009e?\röÿ|\u0001â\tD¼BýBÕËû0\u008c\u008f4 (\u0085g\u0002\"ä?\u000e\u0094\u0018án¥Êg#ü*·rVvÞ\u0000\u008dÂ¸ùî¦`§ÕS\u0006 E\u0084\u001eÔ9"
         .length();
      char var16 = '(';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[27];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "¨2£Wqòë\u0088\u00028ß-ý#\u0096O>;½iÌ\u000fjîÄ \u0089ý¯B6ÓãÓ\u0096\u007fcS\u0015J«¹\u00ad¥Tq\u0002\u0007¢:ÛU6\u001a]±ÆQàÇ\u0097\u0001à÷";
                     int var5 = "¨2£Wqòë\u0088\u00028ß-ý#\u0096O>;½iÌ\u000fjîÄ \u0089ý¯B6ÓãÓ\u0096\u007fcS\u0015J«¹\u00ad¥Tq\u0002\u0007¢:ÛU6\u001a]±ÆQàÇ\u0097\u0001à÷"
                        .length();
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
                                    e = var6;
                                    f = new Integer[10];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "îY&×àænÒ\u0095\u0089vGü£T\u0091";
                                 var5 = "îY&×àænÒ\u0095\u0089vGü£T\u0091".length();
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

                  var17 = "ªy \u001c¬0ðqÌ\u0014\u0084_äT\u0011p\u0010A\\ogÉÓQ]A¥ÙÕÚòjê";
                  var19 = "ªy \u001c¬0ðqÌ\u0014\u0084_äT\u0011p\u0010A\\ogÉÓQ]A¥ÙÕÚòjê".length();
                  var16 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27990;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_fs", var10);
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
         throw new RuntimeException("com/zelix/_fs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27818;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_fs", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_fs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
