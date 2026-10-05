package com.zelix;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ww {
   private _y4 J;
   private hu[] V;
   private Map D;
   private static final long a = ess.a(4813334965795666090L, -5209802677032962175L, MethodHandles.lookup().lookupClass()).a(228437990580145L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public synchronized List C(Object[] param1) {
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
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/ww.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 35501323590058
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 32
      // 022: lushr
      // 023: l2i
      // 024: istore 5
      // 026: dup2
      // 027: bipush 32
      // 029: lshl
      // 02a: bipush 48
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 6
      // 030: dup2
      // 031: bipush 48
      // 033: lshl
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 7
      // 03a: pop2
      // 03b: pop2
      // 03c: ldc2_w 5038781946298096117
      // 03f: lload 3
      // 040: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: aconst_null
      // 046: astore 9
      // 048: astore 8
      // 04a: bipush 0
      // 04b: istore 10
      // 04d: iload 10
      // 04f: aload 0
      // 050: ldc2_w 5185641265603455176
      // 053: lload 3
      // 054: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: arraylength
      // 05a: if_icmpge 199
      // 05d: aload 0
      // 05e: ldc2_w 5185641265603455176
      // 061: lload 3
      // 062: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: iload 10
      // 069: aaload
      // 06a: astore 11
      // 06c: aload 11
      // 06e: iload 5
      // 070: iload 6
      // 072: iload 7
      // 074: i2c
      // 075: invokevirtual com/zelix/hz.O (IIC)Ljava/lang/String;
      // 078: astore 12
      // 07a: aload 12
      // 07c: aload 2
      // 07d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 080: ifeq 0db
      // 083: aload 9
      // 085: aload 8
      // 087: lload 3
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 092
      // 08d: ifnonnull 151
      // 090: aload 8
      // 092: ifnonnull 0bd
      // 095: goto 0a2
      // 098: ldc2_w 6472338081630409902
      // 09b: lload 3
      // 09c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: ifnonnull 0bb
      // 0a5: goto 0b2
      // 0a8: ldc2_w 6472338081630409902
      // 0ab: lload 3
      // 0ac: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: new java/util/ArrayList
      // 0b5: dup
      // 0b6: invokespecial java/util/ArrayList.<init> ()V
      // 0b9: astore 9
      // 0bb: aload 9
      // 0bd: aload 0
      // 0be: ldc2_w 5185641265603455176
      // 0c1: lload 3
      // 0c2: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: iload 10
      // 0c9: aaload
      // 0ca: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cf: pop
      // 0d0: aload 8
      // 0d2: lload 3
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: ifle 196
      // 0d8: ifnull 191
      // 0db: lload 3
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: ifle 156
      // 0e1: aload 12
      // 0e3: aload 8
      // 0e5: ifnonnull 151
      // 0e8: goto 0f5
      // 0eb: ldc2_w 6472338081630409902
      // 0ee: lload 3
      // 0ef: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: lload 3
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: iflt 144
      // 0fb: sipush 22201
      // 0fe: ldc2_w 8832266802704439490
      // 101: lload 3
      // 102: lxor
      // 103: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/ww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10b: ifeq 133
      // 10e: goto 11b
      // 111: ldc2_w 6472338081630409902
      // 114: lload 3
      // 115: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 8
      // 11d: lload 3
      // 11e: lconst_0
      // 11f: lcmp
      // 120: iflt 196
      // 123: ifnull 191
      // 126: goto 133
      // 129: ldc2_w 6472338081630409902
      // 12c: lload 3
      // 12d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 0
      // 134: ldc2_w 4663833380656131366
      // 137: lload 3
      // 138: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: aload 12
      // 13f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 144: goto 151
      // 147: ldc2_w 6472338081630409902
      // 14a: lload 3
      // 14b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: checkcast com/zelix/hz
      // 154: astore 11
      // 156: lload 3
      // 157: lconst_0
      // 158: lcmp
      // 159: ifle 161
      // 15c: aload 11
      // 15e: ifnonnull 179
      // 161: aload 8
      // 163: lload 3
      // 164: lconst_0
      // 165: lcmp
      // 166: ifle 196
      // 169: ifnull 191
      // 16c: goto 179
      // 16f: ldc2_w 6472338081630409902
      // 172: lload 3
      // 173: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 8
      // 17b: ifnull 06c
      // 17e: lload 3
      // 17f: lconst_0
      // 180: lcmp
      // 181: ifle 083
      // 184: goto 191
      // 187: ldc2_w 6472338081630409902
      // 18a: lload 3
      // 18b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: iinc 10 1
      // 194: aload 8
      // 196: ifnull 04d
      // 199: aload 9
      // 19b: areturn
   }

   public List i(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 54580998907784L;
      List var7 = x44.a<"n">(this, -7834612258447941424L, var2).M(var4, var5);

      try {
         if (var7 == null) {
            return null;
         }
      } catch (gj var8) {
         throw x44.a<"r">(var8, -8644309290230708875L, var2);
      }

      return new ArrayList(var7);
   }

   public xn L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 121419031617447L;
      long var10001 = var2 ^ 98055383277879L;
      int var6 = (int)((var2 ^ 98055383277879L) >>> 48);
      int var7 = (int)((var2 ^ 98055383277879L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      xn var9 = new xn((char)var6, (char)var7, var8);
      x44.a<"o">(var9, new Object[]{var4, x44.a<"k">(this, -6345181339561211698L, var2)}, -6680567304618318419L, var2);
      return var9;
   }

   public ww(File[] param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ww.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 111509825076160
      // 00b: lxor
      // 00c: lstore 4
      // 00e: dup2
      // 00f: ldc2_w 13328922978292
      // 012: lxor
      // 013: lstore 6
      // 015: dup2
      // 016: ldc2_w 27834966814213
      // 019: lxor
      // 01a: lstore 8
      // 01c: dup2
      // 01d: ldc2_w 133165625722268
      // 020: lxor
      // 021: lstore 10
      // 023: dup2
      // 024: ldc2_w 135103164096019
      // 027: lxor
      // 028: lstore 12
      // 02a: dup2
      // 02b: ldc2_w 69503213997063
      // 02e: lxor
      // 02f: lstore 14
      // 031: dup2
      // 032: ldc2_w 16137802912296
      // 035: lxor
      // 036: lstore 16
      // 038: dup2
      // 039: ldc2_w 25238003494520
      // 03c: lxor
      // 03d: lstore 18
      // 03f: dup2
      // 040: ldc2_w 44108489348236
      // 043: lxor
      // 044: lstore 20
      // 046: dup2
      // 047: ldc2_w 47555708159461
      // 04a: lxor
      // 04b: dup2
      // 04c: bipush 32
      // 04e: lushr
      // 04f: l2i
      // 050: istore 22
      // 052: dup2
      // 053: bipush 32
      // 055: lshl
      // 056: bipush 32
      // 058: lushr
      // 059: l2i
      // 05a: istore 23
      // 05c: pop2
      // 05d: dup2
      // 05e: ldc2_w 83070551718275
      // 061: lxor
      // 062: lstore 24
      // 064: pop2
      // 065: ldc2_w -4878178289209565099
      // 068: lload 2
      // 069: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: aload 0
      // 06f: invokespecial java/lang/Object.<init> ()V
      // 072: new java/util/ArrayList
      // 075: dup
      // 076: aload 1
      // 077: arraylength
      // 078: bipush 5
      // 079: imul
      // 07a: getstatic com/zelix/ww.e J
      // 07d: l2i
      // 07e: invokestatic java/lang/Math.max (II)I
      // 081: invokespecial java/util/ArrayList.<init> (I)V
      // 084: astore 27
      // 086: astore 26
      // 088: bipush 0
      // 089: istore 28
      // 08b: iload 28
      // 08d: aload 1
      // 08e: arraylength
      // 08f: if_icmpge 2e3
      // 092: aload 1
      // 093: iload 28
      // 095: aaload
      // 096: ldc2_w -6831064151246440497
      // 099: lload 2
      // 09a: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: aload 26
      // 0a1: lload 2
      // 0a2: lconst_0
      // 0a3: lcmp
      // 0a4: ifle 0ac
      // 0a7: ifnonnull 347
      // 0aa: aload 26
      // 0ac: ifnonnull 0f8
      // 0af: goto 0bc
      // 0b2: ldc2_w -6885371629773542130
      // 0b5: lload 2
      // 0b6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: ifeq 1dd
      // 0bf: goto 0cc
      // 0c2: ldc2_w -6885371629773542130
      // 0c5: lload 2
      // 0c6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 1
      // 0cd: iload 28
      // 0cf: aaload
      // 0d0: aload 26
      // 0d2: ifnonnull 10c
      // 0d5: goto 0e2
      // 0d8: ldc2_w -6885371629773542130
      // 0db: lload 2
      // 0dc: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: ldc2_w -6880803524530134173
      // 0e5: lload 2
      // 0e6: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: goto 0f8
      // 0ee: ldc2_w -6885371629773542130
      // 0f1: lload 2
      // 0f2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: ifeq 1dd
      // 0fb: aload 1
      // 0fc: iload 28
      // 0fe: aaload
      // 0ff: goto 10c
      // 102: ldc2_w -6885371629773542130
      // 105: lload 2
      // 106: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: ldc2_w -5163276023371599781
      // 10f: lload 2
      // 110: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: astore 29
      // 117: aload 1
      // 118: iload 28
      // 11a: aaload
      // 11b: new com/zelix/ac
      // 11e: dup
      // 11f: invokespecial com/zelix/ac.<init> ()V
      // 122: ldc2_w -6561510570599587621
      // 125: lload 2
      // 126: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: astore 30
      // 12d: aload 30
      // 12f: ifnull 1cc
      // 132: bipush 0
      // 133: istore 31
      // 135: iload 31
      // 137: aload 30
      // 139: arraylength
      // 13a: if_icmpge 1cc
      // 13d: new java/lang/StringBuilder
      // 140: dup
      // 141: invokespecial java/lang/StringBuilder.<init> ()V
      // 144: aload 29
      // 146: lload 2
      // 147: lconst_0
      // 148: lcmp
      // 149: ifle 156
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: aload 26
      // 151: ifnonnull 452
      // 154: aload 29
      // 156: aload 26
      // 158: ifnonnull 193
      // 15b: goto 168
      // 15e: ldc2_w -6885371629773542130
      // 161: lload 2
      // 162: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: ldc2_w -4724022435939590665
      // 16b: lload 2
      // 16c: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 174: ifeq 196
      // 177: goto 184
      // 17a: ldc2_w -6885371629773542130
      // 17d: lload 2
      // 17e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: ldc ""
      // 186: goto 193
      // 189: ldc2_w -6885371629773542130
      // 18c: lload 2
      // 18d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: goto 19f
      // 196: ldc2_w -4724022435939590665
      // 199: lload 2
      // 19a: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a2: aload 30
      // 1a4: iload 31
      // 1a6: aaload
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ad: astore 32
      // 1af: aload 27
      // 1b1: new com/zelix/_rv
      // 1b4: dup
      // 1b5: iload 22
      // 1b7: aload 32
      // 1b9: iload 23
      // 1bb: invokespecial com/zelix/_rv.<init> (ILjava/lang/String;I)V
      // 1be: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1c3: pop
      // 1c4: iinc 31 1
      // 1c7: aload 26
      // 1c9: ifnull 135
      // 1cc: aload 26
      // 1ce: lload 2
      // 1cf: lconst_0
      // 1d0: lcmp
      // 1d1: ifle 452
      // 1d4: lload 2
      // 1d5: lconst_0
      // 1d6: lcmp
      // 1d7: iflt 2e0
      // 1da: ifnull 2db
      // 1dd: aconst_null
      // 1de: astore 29
      // 1e0: new com/zelix/_ux
      // 1e3: dup
      // 1e4: aload 1
      // 1e5: iload 28
      // 1e7: aaload
      // 1e8: invokespecial com/zelix/_ux.<init> (Ljava/io/File;)V
      // 1eb: astore 29
      // 1ed: aload 29
      // 1ef: ldc2_w -6665987761956648534
      // 1f2: lload 2
      // 1f3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: astore 30
      // 1fa: aload 30
      // 1fc: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 201: ifeq 299
      // 204: aload 30
      // 206: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 20b: checkcast java/util/zip/ZipEntry
      // 20e: astore 31
      // 210: aload 31
      // 212: invokevirtual java/util/zip/ZipEntry.isDirectory ()Z
      // 215: aload 26
      // 217: ifnonnull 08d
      // 21a: aload 26
      // 21c: lload 2
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: ifle 0a1
      // 222: lload 2
      // 223: lconst_0
      // 224: lcmp
      // 225: iflt 25f
      // 228: ifnonnull 25d
      // 22b: ifne 294
      // 22e: goto 23b
      // 231: ldc2_w -6885371629773542130
      // 234: lload 2
      // 235: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: athrow
      // 23b: aload 31
      // 23d: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 240: sipush 12088
      // 243: ldc2_w 7494307289521084641
      // 246: lload 2
      // 247: lxor
      // 248: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/ww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 250: goto 25d
      // 253: ldc2_w -6885371629773542130
      // 256: lload 2
      // 257: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: athrow
      // 25d: aload 26
      // 25f: ifnonnull 293
      // 262: ifeq 294
      // 265: goto 272
      // 268: ldc2_w -6885371629773542130
      // 26b: lload 2
      // 26c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: athrow
      // 272: aload 27
      // 274: new com/zelix/_rv
      // 277: dup
      // 278: lload 18
      // 27a: aload 29
      // 27c: aload 31
      // 27e: invokespecial com/zelix/_rv.<init> (JLjava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)V
      // 281: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 286: goto 293
      // 289: ldc2_w -6885371629773542130
      // 28c: lload 2
      // 28d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: athrow
      // 293: pop
      // 294: aload 26
      // 296: ifnull 1fa
      // 299: lload 2
      // 29a: lconst_0
      // 29b: lcmp
      // 29c: iflt 346
      // 29f: goto 2db
      // 2a2: astore 30
      // 2a4: new com/zelix/_sk
      // 2a7: dup
      // 2a8: new java/lang/StringBuilder
      // 2ab: dup
      // 2ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 2af: aload 30
      // 2b1: ldc2_w -5002273267201920303
      // 2b4: lload 2
      // 2b5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bd: sipush 32003
      // 2c0: ldc2_w 4682979451844168411
      // 2c3: lload 2
      // 2c4: lxor
      // 2c5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/ww.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cd: aload 1
      // 2ce: iload 28
      // 2d0: aaload
      // 2d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d7: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 2da: pop
      // 2db: iinc 28 1
      // 2de: aload 26
      // 2e0: ifnull 08b
      // 2e3: aload 0
      // 2e4: aload 27
      // 2e6: invokeinterface java/util/List.size ()I 1
      // 2eb: anewarray 258
      // 2ee: ldc2_w -4731178144063729304
      // 2f1: lload 2
      // 2f2: invokedynamic r (Ljava/lang/Object;[Lcom/zelix/hu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: aload 0
      // 2f8: aload 27
      // 2fa: invokeinterface java/util/List.size ()I 1
      // 2ff: lload 14
      // 301: invokestatic com/zelix/sh.Q (IJ)I
      // 304: lload 10
      // 306: bipush 2
      // 307: anewarray 68
      // 30a: dup_x2
      // 30b: dup_x2
      // 30c: pop
      // 30d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 310: bipush 1
      // 311: swap
      // 312: aastore
      // 313: dup_x1
      // 314: swap
      // 315: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 318: bipush 0
      // 319: swap
      // 31a: aastore
      // 31b: ldc2_w -4926956427723228116
      // 31e: lload 2
      // 31f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 324: ldc2_w -5109016614577777530
      // 327: lload 2
      // 328: invokedynamic r (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: aload 0
      // 32e: new com/zelix/_y4
      // 331: dup
      // 332: lload 24
      // 334: invokespecial com/zelix/_y4.<init> (J)V
      // 337: ldc2_w -4954278643066926933
      // 33a: lload 2
      // 33b: invokedynamic r (Ljava/lang/Object;Lcom/zelix/_y4;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: lload 2
      // 341: lconst_0
      // 342: lcmp
      // 343: iflt 092
      // 346: bipush 0
      // 347: istore 28
      // 349: iload 28
      // 34b: aload 27
      // 34d: invokeinterface java/util/List.size ()I 1
      // 352: if_icmpge 434
      // 355: aload 27
      // 357: iload 28
      // 359: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 35e: checkcast com/zelix/_rv
      // 361: astore 29
      // 363: lload 4
      // 365: aload 29
      // 367: bipush 2
      // 368: anewarray 68
      // 36b: dup_x1
      // 36c: swap
      // 36d: bipush 1
      // 36e: swap
      // 36f: aastore
      // 370: dup_x2
      // 371: dup_x2
      // 372: pop
      // 373: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 376: bipush 0
      // 377: swap
      // 378: aastore
      // 379: ldc2_w -6533258131617686204
      // 37c: lload 2
      // 37d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 382: astore 30
      // 384: aload 0
      // 385: ldc2_w -4731178144063729304
      // 388: lload 2
      // 389: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: iload 28
      // 390: aload 30
      // 392: aastore
      // 393: aload 0
      // 394: ldc2_w -5109016614577777530
      // 397: lload 2
      // 398: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: aload 30
      // 39f: lload 6
      // 3a1: invokevirtual com/zelix/hu.k (J)Ljava/lang/String;
      // 3a4: aload 30
      // 3a6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3ab: pop
      // 3ac: aload 30
      // 3ae: lload 16
      // 3b0: bipush 1
      // 3b1: anewarray 68
      // 3b4: dup_x2
      // 3b5: dup_x2
      // 3b6: pop
      // 3b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ba: bipush 0
      // 3bb: swap
      // 3bc: aastore
      // 3bd: ldc2_w -5114971080112309761
      // 3c0: lload 2
      // 3c1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: astore 31
      // 3c8: bipush 0
      // 3c9: aload 26
      // 3cb: ifnonnull 43b
      // 3ce: istore 32
      // 3d0: iload 32
      // 3d2: aload 31
      // 3d4: arraylength
      // 3d5: if_icmpge 42c
      // 3d8: aload 0
      // 3d9: ldc2_w -4954278643066926933
      // 3dc: lload 2
      // 3dd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: aload 31
      // 3e4: iload 32
      // 3e6: aaload
      // 3e7: lload 12
      // 3e9: bipush 1
      // 3ea: anewarray 68
      // 3ed: dup_x2
      // 3ee: dup_x2
      // 3ef: pop
      // 3f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f3: bipush 0
      // 3f4: swap
      // 3f5: aastore
      // 3f6: ldc2_w -6559914173677258556
      // 3f9: lload 2
      // 3fa: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ff: aload 30
      // 401: lload 8
      // 403: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 406: iinc 32 1
      // 409: aload 26
      // 40b: lload 2
      // 40c: lconst_0
      // 40d: lcmp
      // 40e: ifle 431
      // 411: ifnonnull 42f
      // 414: aload 26
      // 416: ifnull 3d0
      // 419: lload 2
      // 41a: lconst_0
      // 41b: lcmp
      // 41c: ifle 409
      // 41f: goto 42c
      // 422: ldc2_w -6885371629773542130
      // 425: lload 2
      // 426: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42b: athrow
      // 42c: iinc 28 1
      // 42f: aload 26
      // 431: ifnull 349
      // 434: lload 2
      // 435: lconst_0
      // 436: lcmp
      // 437: iflt 43d
      // 43a: bipush 0
      // 43b: istore 28
      // 43d: iload 28
      // 43f: aload 27
      // 441: invokeinterface java/util/List.size ()I 1
      // 446: if_icmpge 479
      // 449: aload 27
      // 44b: iload 28
      // 44d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 452: checkcast com/zelix/_rv
      // 455: astore 29
      // 457: aload 29
      // 459: lload 20
      // 45b: bipush 1
      // 45c: anewarray 68
      // 45f: dup_x2
      // 460: dup_x2
      // 461: pop
      // 462: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 465: bipush 0
      // 466: swap
      // 467: aastore
      // 468: ldc2_w -6608542864516504586
      // 46b: lload 2
      // 46c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 471: iinc 28 1
      // 474: aload 26
      // 476: ifnull 43d
      // 479: return
   }

   static {
      long var5 = a ^ 31661677081395L;
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
      String var11 = "¡\u0000\u0084\u0001|ò\u0000È*)\u001e>(o\u0099\b\u0018«U\u001bß*\u0018\u0003ª¸µXçê\u001d?\u0003_u[óà\u001eÏü(Sy2\u0083¹<¾DZ\u0095K}\bÕ\u0097Usgt7)¡GzMÿ@XÆ)hNµ\u000e\u0006âÈ¶ÿ®";
      int var13 = "¡\u0000\u0084\u0001|ò\u0000È*)\u001e>(o\u0099\b\u0018«U\u001bß*\u0018\u0003ª¸µXçê\u001d?\u0003_u[óà\u001eÏü(Sy2\u0083¹<¾DZ\u0095K}\bÕ\u0097Usgt7)¡GzMÿ@XÆ)hNµ\u000e\u0006âÈ¶ÿ®"
         .length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 8083084821788100512L;
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
            e = var23;
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17123;
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
            throw new RuntimeException("com/zelix/ww", var10);
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
         throw new RuntimeException("com/zelix/ww" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
