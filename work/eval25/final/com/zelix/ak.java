package com.zelix;

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

public class ak implements _zu, lw {
   private boolean B;
   private _s4 P;
   private boolean y;
   private List n;
   private int G;
   private String c;
   private List d;
   private static final long a = ess.a(-4530719863244769734L, -6929917991890483764L, MethodHandles.lookup().lookupClass()).a(211832668650479L);
   private static final String[] b;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long g;

   public boolean M(Object[] param1) {
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
      // 14: pop2
      // 15: ldc2_w -1504382428224672294
      // 18: lload 2
      // 19: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: ldc2_w -772696754229046470
      // 22: lload 2
      // 23: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: bipush 0
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast com/zelix/_zu
      // 31: astore 7
      // 33: istore 6
      // 35: aload 7
      // 37: lload 4
      // 39: bipush 1
      // 3a: anewarray 326
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w -1401782803454566067
      // 49: lload 2
      // 4a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: iload 6
      // 51: ifne 71
      // 54: ifeq 70
      // 57: goto 64
      // 5a: ldc2_w -1660340831615233671
      // 5d: lload 2
      // 5e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: ldc2_w -1660340831615233671
      // 69: lload 2
      // 6a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 0
      // 71: ireturn
   }

   int Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 77804438745873L;
      int var10000 = x44.a<"r">(7923543504904760115L, var2);
      _zu var7 = (_zu)x44.a<"n">(this, 8336053603184874963L, var2).get(0);
      int var6 = var10000;

      label27: {
         try {
            byte var11 = var7 instanceof me;
            if (var6 != 0) {
               return var11;
            }

            if (var11 != 0) {
               break label27;
            }
         } catch (NumberFormatException var9) {
            throw x44.a<"r">(var9, 7934216917694863248L, var2);
         }

         return 0;
      }

      me var8 = (me)var7;
      return x44.a<"j">(var8, new Object[]{var4}, 8331424004682678786L, var2);
   }

   public boolean H(Object[] param1) {
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
      // 14: pop2
      // 15: ldc2_w 6689098935924103581
      // 18: lload 2
      // 19: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: ldc2_w 6584812514258140445
      // 22: lload 2
      // 23: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: bipush 0
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast com/zelix/_zu
      // 31: astore 7
      // 33: istore 6
      // 35: aload 7
      // 37: lload 4
      // 39: bipush 1
      // 3a: anewarray 326
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w 6805139437014649006
      // 49: lload 2
      // 4a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: iload 6
      // 51: ifeq 71
      // 54: ifeq 70
      // 57: goto 64
      // 5a: ldc2_w 5103256442157989726
      // 5d: lload 2
      // 5e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: ldc2_w 5103256442157989726
      // 69: lload 2
      // 6a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 0
      // 71: ireturn
   }

   private String J(Object[] param1) {
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
      // 00c: getstatic com/zelix/ak.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 32890068173685
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 113268038349945
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 26643004565516
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 118967746430826
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 136608285344625
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 62994270452020
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 85805757912921
      // 041: lxor
      // 042: dup2
      // 043: bipush 48
      // 045: lushr
      // 046: l2i
      // 047: istore 16
      // 049: dup2
      // 04a: bipush 16
      // 04c: lshl
      // 04d: bipush 32
      // 04f: lushr
      // 050: l2i
      // 051: istore 17
      // 053: dup2
      // 054: bipush 48
      // 056: lshl
      // 057: bipush 48
      // 059: lushr
      // 05a: l2i
      // 05b: istore 18
      // 05d: pop2
      // 05e: dup2
      // 05f: ldc2_w 4026909215693
      // 062: lxor
      // 063: lstore 19
      // 065: dup2
      // 066: ldc2_w 42049369476974
      // 069: lxor
      // 06a: lstore 21
      // 06c: dup2
      // 06d: ldc2_w 119930565012891
      // 070: lxor
      // 071: lstore 23
      // 073: dup2
      // 074: ldc2_w 118967746430826
      // 077: lxor
      // 078: lstore 25
      // 07a: dup2
      // 07b: ldc2_w 53152045155831
      // 07e: lxor
      // 07f: lstore 27
      // 081: pop2
      // 082: ldc2_w -1030102819932457103
      // 085: lload 2
      // 086: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: aload 0
      // 08c: bipush 1
      // 08d: ldc2_w -1541775044005302786
      // 090: lload 2
      // 091: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: istore 29
      // 098: new java/util/StringTokenizer
      // 09b: dup
      // 09c: aload 0
      // 09d: ldc2_w -731009052439007774
      // 0a0: lload 2
      // 0a1: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: sipush 19697
      // 0a9: ldc2_w 6284602831855230099
      // 0ac: lload 2
      // 0ad: lxor
      // 0ae: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ak.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: bipush 1
      // 0b4: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 0b7: astore 30
      // 0b9: aload 30
      // 0bb: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0be: ifeq 427
      // 0c1: aload 30
      // 0c3: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0c6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0c9: astore 31
      // 0cb: aload 0
      // 0cc: aload 31
      // 0ce: lload 4
      // 0d0: bipush 2
      // 0d1: anewarray 326
      // 0d4: dup_x2
      // 0d5: dup_x2
      // 0d6: pop
      // 0d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0da: bipush 1
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: ldc2_w -827981182918399752
      // 0e5: lload 2
      // 0e6: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: lload 2
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: ifle 127
      // 0f1: iload 29
      // 0f3: ifne 124
      // 0f6: ifeq 130
      // 0f9: goto 106
      // 0fc: ldc2_w -982274993747964974
      // 0ff: lload 2
      // 100: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: ldc2_w -1260733568746552387
      // 10a: lload 2
      // 10b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aload 31
      // 112: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 117: goto 124
      // 11a: ldc2_w -982274993747964974
      // 11d: lload 2
      // 11e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: pop
      // 125: iload 29
      // 127: lload 2
      // 128: lconst_0
      // 129: lcmp
      // 12a: ifle 424
      // 12d: ifeq 422
      // 130: aconst_null
      // 131: astore 32
      // 133: aload 31
      // 135: ldc "."
      // 137: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 13a: istore 33
      // 13c: aload 31
      // 13e: lload 19
      // 140: bipush 2
      // 141: anewarray 326
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w -1544906445787114103
      // 155: lload 2
      // 156: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: iload 29
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 1d0
      // 163: ifne 1ce
      // 166: ifeq 1cc
      // 169: goto 176
      // 16c: ldc2_w -982274993747964974
      // 16f: lload 2
      // 170: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: new com/zelix/dc
      // 179: dup
      // 17a: aload 0
      // 17b: ldc2_w -1617113600566269639
      // 17e: lload 2
      // 17f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_s4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: lload 8
      // 186: dup2_x1
      // 187: pop2
      // 188: aload 31
      // 18a: invokespecial com/zelix/dc.<init> (JLcom/zelix/_s4;Ljava/lang/String;)V
      // 18d: astore 34
      // 18f: aload 34
      // 191: lload 10
      // 193: bipush 1
      // 194: anewarray 326
      // 197: dup_x2
      // 198: dup_x2
      // 199: pop
      // 19a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19d: bipush 0
      // 19e: swap
      // 19f: aastore
      // 1a0: ldc2_w -1368259012602158335
      // 1a3: lload 2
      // 1a4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: astore 35
      // 1ab: aload 35
      // 1ad: iload 29
      // 1af: ifne 1c4
      // 1b2: ifnull 1c5
      // 1b5: goto 1c2
      // 1b8: ldc2_w -982274993747964974
      // 1bb: lload 2
      // 1bc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aload 35
      // 1c4: areturn
      // 1c5: aload 34
      // 1c7: astore 32
      // 1c9: goto 369
      // 1cc: iload 33
      // 1ce: iload 29
      // 1d0: lload 2
      // 1d1: lconst_0
      // 1d2: lcmp
      // 1d3: iflt 2ab
      // 1d6: ifne 2a9
      // 1d9: bipush -1
      // 1da: if_icmpeq 29a
      // 1dd: goto 1ea
      // 1e0: ldc2_w -982274993747964974
      // 1e3: lload 2
      // 1e4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 31
      // 1ec: bipush 0
      // 1ed: iload 33
      // 1ef: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f2: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1f5: astore 34
      // 1f7: aload 31
      // 1f9: iload 33
      // 1fb: bipush 1
      // 1fc: iadd
      // 1fd: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 200: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 203: astore 35
      // 205: aload 35
      // 207: lload 12
      // 209: bipush 2
      // 20a: anewarray 326
      // 20d: dup_x2
      // 20e: dup_x2
      // 20f: pop
      // 210: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 213: bipush 1
      // 214: swap
      // 215: aastore
      // 216: dup_x1
      // 217: swap
      // 218: bipush 0
      // 219: swap
      // 21a: aastore
      // 21b: ldc2_w -1046368982676892922
      // 21e: lload 2
      // 21f: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: istore 36
      // 226: aload 34
      // 228: sipush 12980
      // 22b: ldc2_w 1138572003301778129
      // 22e: lload 2
      // 22f: lxor
      // 230: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ak.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 238: ifeq 257
      // 23b: new com/zelix/me
      // 23e: dup
      // 23f: aload 0
      // 240: ldc2_w -1617113600566269639
      // 243: lload 2
      // 244: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_s4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: lload 14
      // 24b: dup2_x1
      // 24c: pop2
      // 24d: iload 36
      // 24f: invokespecial com/zelix/me.<init> (JLcom/zelix/_s4;I)V
      // 252: astore 32
      // 254: goto 297
      // 257: aload 0
      // 258: ldc2_w -1617113600566269639
      // 25b: lload 2
      // 25c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_s4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: lload 27
      // 263: aload 34
      // 265: bipush 2
      // 266: anewarray 326
      // 269: dup_x1
      // 26a: swap
      // 26b: bipush 1
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 0
      // 275: swap
      // 276: aastore
      // 277: ldc2_w -1176473041758815130
      // 27a: lload 2
      // 27b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: astore 37
      // 282: new com/zelix/_zb
      // 285: dup
      // 286: aload 37
      // 288: iload 16
      // 28a: i2c
      // 28b: iload 36
      // 28d: iload 17
      // 28f: iload 18
      // 291: i2s
      // 292: invokespecial com/zelix/_zb.<init> (Lcom/zelix/_rx;CIIS)V
      // 295: astore 32
      // 297: goto 369
      // 29a: aload 31
      // 29c: bipush 0
      // 29d: invokevirtual java/lang/String.charAt (I)C
      // 2a0: ldc2_w -1549937987558061831
      // 2a3: lload 2
      // 2a4: invokedynamic p (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: iload 29
      // 2ab: ifne 2c3
      // 2ae: ifeq 304
      // 2b1: goto 2be
      // 2b4: ldc2_w -982274993747964974
      // 2b7: lload 2
      // 2b8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: aload 31
      // 2c0: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 2c3: istore 34
      // 2c5: new com/zelix/pj
      // 2c8: dup
      // 2c9: iload 34
      // 2cb: lload 23
      // 2cd: invokespecial com/zelix/pj.<init> (IJ)V
      // 2d0: astore 32
      // 2d2: goto 369
      // 2d5: astore 34
      // 2d7: new java/lang/StringBuilder
      // 2da: dup
      // 2db: invokespecial java/lang/StringBuilder.<init> ()V
      // 2de: sipush 23815
      // 2e1: ldc2_w 2995712944811904355
      // 2e4: lload 2
      // 2e5: lxor
      // 2e6: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ak.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ee: aload 0
      // 2ef: ldc2_w -731009052439007774
      // 2f2: lload 2
      // 2f3: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fb: ldc "'"
      // 2fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 300: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 303: areturn
      // 304: aload 0
      // 305: ldc2_w -1617113600566269639
      // 308: lload 2
      // 309: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_s4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30e: lload 6
      // 310: aload 31
      // 312: bipush 2
      // 313: anewarray 326
      // 316: dup_x1
      // 317: swap
      // 318: bipush 1
      // 319: swap
      // 31a: aastore
      // 31b: dup_x2
      // 31c: dup_x2
      // 31d: pop
      // 31e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 321: bipush 0
      // 322: swap
      // 323: aastore
      // 324: ldc2_w -637483424522267162
      // 327: lload 2
      // 328: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ak; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: astore 34
      // 32f: aload 34
      // 331: lload 25
      // 333: bipush 1
      // 334: anewarray 326
      // 337: dup_x2
      // 338: dup_x2
      // 339: pop
      // 33a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33d: bipush 0
      // 33e: swap
      // 33f: aastore
      // 340: ldc2_w -1307356236044664392
      // 343: lload 2
      // 344: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 349: astore 35
      // 34b: aload 35
      // 34d: iload 29
      // 34f: ifne 364
      // 352: ifnull 365
      // 355: goto 362
      // 358: ldc2_w -982274993747964974
      // 35b: lload 2
      // 35c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: aload 35
      // 364: areturn
      // 365: aload 34
      // 367: astore 32
      // 369: aload 0
      // 36a: ldc2_w -1158024669496047215
      // 36d: lload 2
      // 36e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: aload 32
      // 375: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 37a: pop
      // 37b: aload 0
      // 37c: ldc2_w -1158024669496047215
      // 37f: lload 2
      // 380: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: invokeinterface java/util/List.size ()I 1
      // 38a: lload 2
      // 38b: lconst_0
      // 38c: lcmp
      // 38d: iflt 3cd
      // 390: iload 29
      // 392: ifne 3cd
      // 395: bipush 1
      // 396: if_icmple 422
      // 399: goto 3a6
      // 39c: ldc2_w -982274993747964974
      // 39f: lload 2
      // 3a0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: athrow
      // 3a6: aload 32
      // 3a8: lload 21
      // 3aa: bipush 1
      // 3ab: anewarray 326
      // 3ae: dup_x2
      // 3af: dup_x2
      // 3b0: pop
      // 3b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b4: bipush 0
      // 3b5: swap
      // 3b6: aastore
      // 3b7: ldc2_w -734283980169654022
      // 3ba: lload 2
      // 3bb: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c0: goto 3cd
      // 3c3: ldc2_w -982274993747964974
      // 3c6: lload 2
      // 3c7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cc: athrow
      // 3cd: lload 2
      // 3ce: lconst_0
      // 3cf: lcmp
      // 3d0: iflt 424
      // 3d3: ifeq 422
      // 3d6: new java/lang/StringBuilder
      // 3d9: dup
      // 3da: invokespecial java/lang/StringBuilder.<init> ()V
      // 3dd: sipush 19028
      // 3e0: ldc2_w 2346335522388777523
      // 3e3: lload 2
      // 3e4: lxor
      // 3e5: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ak.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ed: aload 31
      // 3ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f2: sipush 28092
      // 3f5: ldc2_w 2053785152311672282
      // 3f8: lload 2
      // 3f9: lxor
      // 3fa: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ak.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 402: aload 0
      // 403: ldc2_w -731009052439007774
      // 406: lload 2
      // 407: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40f: ldc "'"
      // 411: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 414: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 417: areturn
      // 418: ldc2_w -982274993747964974
      // 41b: lload 2
      // 41c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 421: athrow
      // 422: iload 29
      // 424: ifeq 0b9
      // 427: aconst_null
      // 428: areturn
   }

   public String u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 4673582236427655395L, var2);
   }

   public boolean q(Object[] param1) {
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
      // 14: pop2
      // 15: ldc2_w 2531620063440463335
      // 18: lload 2
      // 19: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: ldc2_w 4430301008603536135
      // 22: lload 2
      // 23: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: bipush 0
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast com/zelix/_zu
      // 31: astore 7
      // 33: istore 6
      // 35: aload 7
      // 37: lload 4
      // 39: bipush 1
      // 3a: anewarray 326
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w 4547035456670427578
      // 49: lload 2
      // 4a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: iload 6
      // 51: ifne 71
      // 54: ifeq 70
      // 57: goto 64
      // 5a: ldc2_w 2362151066788010308
      // 5d: lload 2
      // 5e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: ldc2_w 2362151066788010308
      // 69: lload 2
      // 6a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 0
      // 71: ireturn
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -5582530165586262979L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void R(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      int var10000 = x44.a<"q">(-654965281369050208L, var2);
      int var7 = 0;
      int var6 = var10000;

      label43:
      while (var7 < x44.a<"m">(this, -1054800428604287200L, var2).size()) {
         _zu var8 = (_zu)x44.a<"m">(this, -1054800428604287200L, var2).get(var7);

         try {
            x44.a<"i">(var8, new Object[]{var4}, -1188155648108193658L, var2);
            var7++;
         } catch (NumberFormatException var10) {
            boolean var10001 = false;
            throw x44.a<"q">(var10, -1373874742482217629L, var2);
         }

         while (true) {
            try {
               var10000 = var6;
               if (var2 >= 0L) {
                  if (var6 == 0) {
                     return;
                  }

                  var10000 = var6;
               }

               if (var10000 != 0) {
                  break;
               }
            } catch (NumberFormatException var9) {
               boolean var13 = false;
               throw x44.a<"q">(var9, -1373874742482217629L, var2);
            }

            if (var2 >= 0L) {
               break label43;
            }
         }
      }

      x44.a<"r">(this, false, -1512492915823321671L, var2);
      x44.a<"r">(this, (int)g, -1069036492568043312L, var2);
   }

   public boolean L(Object[] param1) {
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
      // 00e: checkcast java/lang/Boolean
      // 011: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 014: istore 4
      // 016: pop
      // 017: lload 2
      // 018: dup2
      // 019: ldc2_w 42414652410804
      // 01c: lxor
      // 01d: lstore 5
      // 01f: dup2
      // 020: ldc2_w 0
      // 023: lxor
      // 024: lstore 7
      // 026: dup2
      // 027: ldc2_w 29033237019750
      // 02a: lxor
      // 02b: lstore 9
      // 02d: pop2
      // 02e: ldc2_w -7440112789677318534
      // 031: lload 2
      // 032: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: istore 11
      // 039: aload 0
      // 03a: ldc2_w -7153700035217905149
      // 03d: lload 2
      // 03e: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: iload 11
      // 045: ifne 1f4
      // 048: ifne 1ea
      // 04b: goto 058
      // 04e: ldc2_w -7253755011558399271
      // 051: lload 2
      // 052: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: athrow
      // 058: aload 0
      // 059: bipush 1
      // 05a: ldc2_w -7153700035217905149
      // 05d: lload 2
      // 05e: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: bipush 0
      // 064: istore 12
      // 066: iload 12
      // 068: aload 0
      // 069: ldc2_w -8726040293667643238
      // 06c: lload 2
      // 06d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: invokeinterface java/util/List.size ()I 1
      // 077: if_icmpge 1ea
      // 07a: bipush 0
      // 07b: istore 13
      // 07d: aload 0
      // 07e: ldc2_w -8726040293667643238
      // 081: lload 2
      // 082: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: iload 12
      // 089: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 08e: checkcast com/zelix/_zu
      // 091: astore 14
      // 093: aload 14
      // 095: lload 7
      // 097: iload 4
      // 099: bipush 2
      // 09a: anewarray 326
      // 09d: dup_x1
      // 09e: swap
      // 09f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0a2: bipush 1
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x2
      // 0a6: dup_x2
      // 0a7: pop
      // 0a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ab: bipush 0
      // 0ac: swap
      // 0ad: aastore
      // 0ae: ldc2_w -7178614144028204945
      // 0b1: lload 2
      // 0b2: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: iload 11
      // 0b9: lload 2
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: ifle 0c4
      // 0bf: ifne 1f4
      // 0c2: iload 11
      // 0c4: ifne 10b
      // 0c7: goto 0d4
      // 0ca: ldc2_w -7253755011558399271
      // 0cd: lload 2
      // 0ce: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: ifeq 118
      // 0d7: goto 0e4
      // 0da: ldc2_w -7253755011558399271
      // 0dd: lload 2
      // 0de: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 14
      // 0e6: lload 9
      // 0e8: bipush 1
      // 0e9: anewarray 326
      // 0ec: dup_x2
      // 0ed: dup_x2
      // 0ee: pop
      // 0ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: ldc2_w -8786707164826549645
      // 0f8: lload 2
      // 0f9: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: goto 10b
      // 101: ldc2_w -7253755011558399271
      // 104: lload 2
      // 105: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: istore 13
      // 10d: iload 11
      // 10f: lload 2
      // 110: lconst_0
      // 111: lcmp
      // 112: iflt 13a
      // 115: ifeq 130
      // 118: aload 0
      // 119: bipush 0
      // 11a: ldc2_w -7153700035217905149
      // 11d: lload 2
      // 11e: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: goto 130
      // 126: ldc2_w -7253755011558399271
      // 129: lload 2
      // 12a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 0
      // 131: ldc2_w -7153700035217905149
      // 134: lload 2
      // 135: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: lload 2
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: ifle 157
      // 140: iload 11
      // 142: ifne 157
      // 145: ifeq 1e2
      // 148: goto 155
      // 14b: ldc2_w -7253755011558399271
      // 14e: lload 2
      // 14f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: iload 12
      // 157: lload 2
      // 158: lconst_0
      // 159: lcmp
      // 15a: iflt 16e
      // 15d: ifne 184
      // 160: aload 0
      // 161: iload 13
      // 163: ldc2_w -8750356680235018390
      // 166: lload 2
      // 167: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: iload 11
      // 16e: lload 2
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 1e7
      // 174: ifeq 1e2
      // 177: goto 184
      // 17a: ldc2_w -7253755011558399271
      // 17d: lload 2
      // 17e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: aload 0
      // 185: ldc2_w -8679624673844073802
      // 188: lload 2
      // 189: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: iload 12
      // 190: bipush 1
      // 191: isub
      // 192: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 197: checkcast java/lang/String
      // 19a: astore 15
      // 19c: aload 0
      // 19d: aload 0
      // 19e: aload 0
      // 19f: ldc2_w -8750356680235018390
      // 1a2: lload 2
      // 1a3: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: lload 5
      // 1aa: iload 13
      // 1ac: aload 15
      // 1ae: bipush 4
      // 1af: anewarray 326
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: bipush 3
      // 1b5: swap
      // 1b6: aastore
      // 1b7: dup_x1
      // 1b8: swap
      // 1b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1bc: bipush 2
      // 1bd: swap
      // 1be: aastore
      // 1bf: dup_x2
      // 1c0: dup_x2
      // 1c1: pop
      // 1c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c5: bipush 1
      // 1c6: swap
      // 1c7: aastore
      // 1c8: dup_x1
      // 1c9: swap
      // 1ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1cd: bipush 0
      // 1ce: swap
      // 1cf: aastore
      // 1d0: ldc2_w -7490252189712555909
      // 1d3: lload 2
      // 1d4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: ldc2_w -8750356680235018390
      // 1dc: lload 2
      // 1dd: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: iinc 12 1
      // 1e5: iload 11
      // 1e7: ifeq 066
      // 1ea: aload 0
      // 1eb: ldc2_w -7153700035217905149
      // 1ee: lload 2
      // 1ef: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: ireturn
   }

   public String d(Object[] param1) {
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
      // 0e: ldc2_w 125392110485921
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 46285987256795
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w -658023889820438501
      // 1f: lload 2
      // 20: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: lload 6
      // 28: bipush 1
      // 29: anewarray 326
      // 2c: dup_x2
      // 2d: dup_x2
      // 2e: pop
      // 2f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32: bipush 0
      // 33: swap
      // 34: aastore
      // 35: ldc2_w -959614569418401369
      // 38: lload 2
      // 39: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: istore 8
      // 40: aload 0
      // 41: iload 8
      // 43: ifne 6d
      // 46: ldc2_w -1301276446215083372
      // 49: lload 2
      // 4a: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: ifne 86
      // 52: goto 5f
      // 55: ldc2_w -777946070664393544
      // 58: lload 2
      // 59: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: goto 6d
      // 63: ldc2_w -777946070664393544
      // 66: lload 2
      // 67: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: lload 4
      // 6f: bipush 1
      // 70: anewarray 326
      // 73: dup_x2
      // 74: dup_x2
      // 75: pop
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w -1102192381665547435
      // 7f: lload 2
      // 80: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: areturn
      // 86: aconst_null
      // 87: areturn
   }

   private boolean R(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/ak.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 8361589257338925775
      // 1c: lload 3
      // 1d: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: aload 2
      // 25: ldc "+"
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: iload 5
      // 2c: ifne b8
      // 2f: ifne b7
      // 32: goto 3f
      // 35: ldc2_w 8637976418237795948
      // 38: lload 3
      // 39: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 2
      // 40: ldc "-"
      // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45: iload 5
      // 47: ifne b8
      // 4a: goto 57
      // 4d: ldc2_w 8637976418237795948
      // 50: lload 3
      // 51: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: ifne b7
      // 5a: goto 67
      // 5d: ldc2_w 8637976418237795948
      // 60: lload 3
      // 61: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 2
      // 68: ldc "*"
      // 6a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6d: iload 5
      // 6f: ifne b8
      // 72: goto 7f
      // 75: ldc2_w 8637976418237795948
      // 78: lload 3
      // 79: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: ifne b7
      // 82: goto 8f
      // 85: ldc2_w 8637976418237795948
      // 88: lload 3
      // 89: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: aload 2
      // 90: ldc "/"
      // 92: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 95: iload 5
      // 97: ifne ba
      // 9a: goto a7
      // 9d: ldc2_w 8637976418237795948
      // a0: lload 3
      // a1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: ifeq b9
      // aa: goto b7
      // ad: ldc2_w 8637976418237795948
      // b0: lload 3
      // b1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: athrow
      // b7: bipush 1
      // b8: ireturn
      // b9: bipush 0
      // ba: ireturn
   }

   public boolean k(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      _zu var6 = (_zu)x44.a<"j">(this, -2268696504061950209L, var2).get(0);
      return x44.a<"n">(var6, new Object[]{var4}, -386910848355836012L, var2);
   }

   private int B(Object[] param1) {
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
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 5
      // 21: dup
      // 22: bipush 3
      // 23: aaload
      // 24: checkcast java/lang/String
      // 27: astore 6
      // 29: pop
      // 2a: getstatic com/zelix/ak.a J
      // 2d: lload 2
      // 2e: lxor
      // 2f: lstore 2
      // 30: ldc2_w -3734513043789346459
      // 33: lload 2
      // 34: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: istore 7
      // 3b: aload 6
      // 3d: ldc "+"
      // 3f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42: iload 7
      // 44: ifeq 6e
      // 47: ifeq 67
      // 4a: goto 57
      // 4d: ldc2_w -3014521594495078490
      // 50: lload 2
      // 51: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 4
      // 59: iload 5
      // 5b: iadd
      // 5c: ireturn
      // 5d: ldc2_w -3014521594495078490
      // 60: lload 2
      // 61: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 6
      // 69: ldc "-"
      // 6b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6e: iload 7
      // 70: lload 2
      // 71: lconst_0
      // 72: lcmp
      // 73: ifle a2
      // 76: ifeq a0
      // 79: ifeq 99
      // 7c: goto 89
      // 7f: ldc2_w -3014521594495078490
      // 82: lload 2
      // 83: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: iload 4
      // 8b: iload 5
      // 8d: isub
      // 8e: ireturn
      // 8f: ldc2_w -3014521594495078490
      // 92: lload 2
      // 93: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 6
      // 9b: ldc "*"
      // 9d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a0: iload 7
      // a2: ifeq ca
      // a5: ifeq c5
      // a8: goto b5
      // ab: ldc2_w -3014521594495078490
      // ae: lload 2
      // af: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: iload 4
      // b7: iload 5
      // b9: imul
      // ba: ireturn
      // bb: ldc2_w -3014521594495078490
      // be: lload 2
      // bf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: athrow
      // c5: iload 4
      // c7: iload 5
      // c9: idiv
      // ca: ireturn
   }

   int H(Object[] param1) {
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
      // 00c: getstatic com/zelix/ak.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 50643745427726
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 9466179132090
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 20872869570268
      // 025: lxor
      // 026: lstore 8
      // 028: pop2
      // 029: ldc2_w 2011253175312146080
      // 02c: lload 2
      // 02d: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: bipush 0
      // 033: istore 11
      // 035: istore 10
      // 037: bipush 1
      // 038: istore 12
      // 03a: iload 12
      // 03c: aload 0
      // 03d: ldc2_w 2043763460097931808
      // 040: lload 2
      // 041: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: invokeinterface java/util/List.size ()I 1
      // 04b: if_icmpge 126
      // 04e: aload 0
      // 04f: ldc2_w 2043763460097931808
      // 052: lload 2
      // 053: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: iload 12
      // 05a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 05f: checkcast com/zelix/_zu
      // 062: astore 13
      // 064: iload 10
      // 066: lload 2
      // 067: lconst_0
      // 068: lcmp
      // 069: iflt 123
      // 06c: ifeq 121
      // 06f: aload 13
      // 071: lload 6
      // 073: bipush 0
      // 074: bipush 2
      // 075: anewarray 326
      // 078: dup_x1
      // 079: swap
      // 07a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07d: bipush 1
      // 07e: swap
      // 07f: aastore
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 0
      // 087: swap
      // 088: aastore
      // 089: ldc2_w 493840031033866965
      // 08c: lload 2
      // 08d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: iload 10
      // 094: ifeq 130
      // 097: goto 0a4
      // 09a: ldc2_w 139458360195201123
      // 09d: lload 2
      // 09e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: ifeq 11e
      // 0a7: goto 0b4
      // 0aa: ldc2_w 139458360195201123
      // 0ad: lload 2
      // 0ae: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 13
      // 0b6: lload 8
      // 0b8: bipush 1
      // 0b9: anewarray 326
      // 0bc: dup_x2
      // 0bd: dup_x2
      // 0be: pop
      // 0bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c2: bipush 0
      // 0c3: swap
      // 0c4: aastore
      // 0c5: ldc2_w 2068648660851022025
      // 0c8: lload 2
      // 0c9: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: istore 14
      // 0d0: aload 0
      // 0d1: ldc2_w 2103690943959953420
      // 0d4: lload 2
      // 0d5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: iload 12
      // 0dc: bipush 1
      // 0dd: isub
      // 0de: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e3: checkcast java/lang/String
      // 0e6: astore 15
      // 0e8: aload 0
      // 0e9: iload 11
      // 0eb: lload 4
      // 0ed: iload 14
      // 0ef: aload 15
      // 0f1: bipush 4
      // 0f2: anewarray 326
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: bipush 3
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ff: bipush 2
      // 100: swap
      // 101: aastore
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w 195712853085911745
      // 116: lload 2
      // 117: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: istore 11
      // 11e: iinc 12 1
      // 121: iload 10
      // 123: ifne 03a
      // 126: iload 11
      // 128: lload 2
      // 129: lconst_0
      // 12a: lcmp
      // 12b: iflt 130
      // 12e: bipush -1
      // 12f: imul
      // 130: ireturn
   }

   public int X(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this, -362989942111507700L, var2);
   }

   ak(long var1, _s4 var3, String var4) {
      var1 = a ^ var1;
      super();
      x44.a<"v">(this, new ArrayList(), -5145175351012761884L, var1);
      x44.a<"v">(this, new ArrayList(), -5046972182811978552L, var1);
      x44.a<"v">(this, var3, -4684958254473789876L, var1);
      x44.a<"v">(this, var4, -6723984373747385705L, var1);
   }

   static {
      long var5 = a ^ 17158038941263L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[5];
      int var12 = 0;
      String var11 = "Z\u0091\u00adh×Ð\u0010^0fK\u008a;\u008cAßpm°\u0016øf '\b®6Ñh¥¥pB\u0083;nU\u0018¬v\\Õ\u0006þ4\u008atC\u0003pt\u001bh]e\u0098\u000f²-¼\u0017+1uF\u001bá\u009e¼c\u000b½\u0082\u0081\\Ï¤¾\u0005\u001f@@²\u008d\u0017u}\u0004¸Ì´\u008c\u0019Ü\u00135Ç(gño\u001f\u0082[\u001aáø\u0018^1¯>u<}È· öÎ?E2.ì\u007fÙ¦8\u0018ÿR\u009açëC¿\u001d_\u0086ÙÍÎuKÜ+ \u0087{¾ÄZò";
      int var13 = "Z\u0091\u00adh×Ð\u0010^0fK\u008a;\u008cAßpm°\u0016øf '\b®6Ñh¥¥pB\u0083;nU\u0018¬v\\Õ\u0006þ4\u008atC\u0003pt\u001bh]e\u0098\u000f²-¼\u0017+1uF\u001bá\u009e¼c\u000b½\u0082\u0081\\Ï¤¾\u0005\u001f@@²\u008d\u0017u}\u0004¸Ì´\u008c\u0019Ü\u00135Ç(gño\u001f\u0082[\u001aáø\u0018^1¯>u<}È· öÎ?E2.ì\u007fÙ¦8\u0018ÿR\u009açëC¿\u001d_\u0086ÙÍÎuKÜ+ \u0087{¾ÄZò"
         .length();
      char var10 = 16;
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
                     e = new String[5];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -4967740932054217942L;
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
                     g = var30;
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

                  var11 = "*§0½\u0095Õ\u0085Vë\u000bCµ-ºoË~¼Î\u0090îºÉýåËâÞ>e(\u009d\u0010M\u0091\të\u0093À²óDM|]Öüº\u0083";
                  var13 = "*§0½\u0095Õ\u0085Vë\u000bCµ-ºoË~¼Î\u0090îºÉýåËâÞ>e(\u009d\u0010M\u0091\të\u0093À²óDM|]Öüº\u0083".length();
                  var10 = ' ';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11261;
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
            throw new RuntimeException("com/zelix/ak", var10);
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
         throw new RuntimeException("com/zelix/ak" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
