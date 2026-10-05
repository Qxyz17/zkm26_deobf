package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i9 extends i1 {
   private final int S;
   private int T;
   private final int e;
   private String M;
   private char[] k;
   private ArrayList s;
   private static final long a = prr.a(-9142612437613584324L, -3227785121813203858L, MethodHandles.lookup().lookupClass()).a(64636247772085L);
   private static final long[] b;
   private static final Integer[] d;
   private static final Map f = new HashMap(13);

   final char M(Object[] param1) {
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
      // 17: getstatic com/zelix/i9.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: ldc2_w -9021179717075475838
      // 20: lload 2
      // 21: invokedynamic o (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: astore 5
      // 28: iload 4
      // 2a: sipush 14090
      // 2d: ldc2_w 8060880339576642777
      // 30: lload 2
      // 31: lxor
      // 32: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 5
      // 39: ifnonnull 77
      // 3c: if_icmpgt 68
      // 3f: goto 4c
      // 42: ldc2_w -8981218795198964226
      // 45: lload 2
      // 46: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: sipush 3747
      // 4f: ldc2_w 8222766264831403382
      // 52: lload 2
      // 53: lxor
      // 54: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: iload 4
      // 5b: iadd
      // 5c: i2c
      // 5d: ireturn
      // 5e: ldc2_w -8981218795198964226
      // 61: lload 2
      // 62: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: sipush 9148
      // 6b: ldc2_w 6463196501311768676
      // 6e: lload 2
      // 6f: lxor
      // 70: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: iload 4
      // 77: iadd
      // 78: i2c
      // 79: ireturn
   }

   public i9(int var1, int var2, byte var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      long var7 = var5 ^ 129066832056508L;
      this(var7, var4, null);
   }

   public final String L(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 138839660224359L;
      int[] var10000 = m44.a<"i">(-6275744256548812636L, var3);
      String var8 = null;
      int[] var7 = var10000;

      while (true) {
         Object[] var10004 = new Object[]{null, var5};
         var10004[0] = var2;
         var8 = m44.a<"v">(this, var10004, -5846391626530437220L, var3);
         String var11 = var8;

         while (var11 != null) {
            var11 = var8;
            if (var7 == null) {
               return var8;
            }
         }
      }
   }

   final char v(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 2
      // 015: pop
      // 016: getstatic com/zelix/i9.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: ldc2_w 3735206913128420250
      // 01f: lload 3
      // 020: invokedynamic o (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: astore 5
      // 027: aload 0
      // 028: ldc2_w 3929268244421167081
      // 02b: lload 3
      // 02c: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: aload 5
      // 033: ifnonnull 112
      // 036: ifne 104
      // 039: goto 046
      // 03c: ldc2_w 3622027856500042982
      // 03f: lload 3
      // 040: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: iload 2
      // 047: sipush 9112
      // 04a: ldc2_w 5051868008019065179
      // 04d: lload 3
      // 04e: lxor
      // 04f: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 5
      // 056: lload 3
      // 057: lconst_0
      // 058: lcmp
      // 059: ifle 0b6
      // 05c: ifnonnull 0b4
      // 05f: goto 06c
      // 062: ldc2_w 3622027856500042982
      // 065: lload 3
      // 066: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: athrow
      // 06c: if_icmpgt 099
      // 06f: goto 07c
      // 072: ldc2_w 3622027856500042982
      // 075: lload 3
      // 076: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: sipush 28658
      // 07f: ldc2_w 4709409200634311996
      // 082: lload 3
      // 083: lxor
      // 084: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: iload 2
      // 08a: iadd
      // 08b: i2c
      // 08c: lload 3
      // 08d: lconst_0
      // 08e: lcmp
      // 08f: iflt 09a
      // 092: istore 6
      // 094: aload 5
      // 096: ifnull 176
      // 099: iload 2
      // 09a: sipush 7966
      // 09d: ldc2_w 9191485322603939295
      // 0a0: lload 3
      // 0a1: lxor
      // 0a2: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: goto 0b4
      // 0aa: ldc2_w 3622027856500042982
      // 0ad: lload 3
      // 0ae: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 5
      // 0b6: ifnonnull 0f5
      // 0b9: if_icmpgt 0e6
      // 0bc: goto 0c9
      // 0bf: ldc2_w 3622027856500042982
      // 0c2: lload 3
      // 0c3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: sipush 7704
      // 0cc: ldc2_w 7405609086150853850
      // 0cf: lload 3
      // 0d0: lxor
      // 0d1: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: iload 2
      // 0d7: iadd
      // 0d8: i2c
      // 0d9: lload 3
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 0e7
      // 0df: istore 6
      // 0e1: aload 5
      // 0e3: ifnull 176
      // 0e6: iload 2
      // 0e7: bipush 4
      // 0e8: goto 0f5
      // 0eb: ldc2_w 3622027856500042982
      // 0ee: lload 3
      // 0ef: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: isub
      // 0f6: i2c
      // 0f7: lload 3
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: iflt 105
      // 0fd: istore 6
      // 0ff: aload 5
      // 101: ifnull 176
      // 104: iload 2
      // 105: goto 112
      // 108: ldc2_w 3622027856500042982
      // 10b: lload 3
      // 10c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: lload 3
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 174
      // 118: sipush 14090
      // 11b: ldc2_w 8060798777960623553
      // 11e: lload 3
      // 11f: lxor
      // 120: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: aload 5
      // 127: ifnonnull 172
      // 12a: if_icmpgt 157
      // 12d: goto 13a
      // 130: ldc2_w 3622027856500042982
      // 133: lload 3
      // 134: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: sipush 3747
      // 13d: ldc2_w 8222843291491423342
      // 140: lload 3
      // 141: lxor
      // 142: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: iload 2
      // 148: iadd
      // 149: i2c
      // 14a: lload 3
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 164
      // 150: istore 6
      // 152: aload 5
      // 154: ifnull 176
      // 157: sipush 26260
      // 15a: ldc2_w 1968434907160394844
      // 15d: lload 3
      // 15e: lxor
      // 15f: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: iload 2
      // 165: goto 172
      // 168: ldc2_w 3622027856500042982
      // 16b: lload 3
      // 16c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: iadd
      // 173: i2c
      // 174: istore 6
      // 176: iload 6
      // 178: ireturn
   }

   public final String y(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/i9.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 62983603811649
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 126970844103769
      // 028: lxor
      // 029: lstore 7
      // 02b: pop2
      // 02c: ldc2_w 8533829613218240034
      // 02f: lload 3
      // 030: invokedynamic o (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: astore 9
      // 037: iload 2
      // 038: aload 9
      // 03a: ifnonnull 06b
      // 03d: aload 0
      // 03e: getfield com/zelix/i9.s Ljava/util/ArrayList;
      // 041: invokevirtual java/util/ArrayList.size ()I
      // 044: if_icmpge 06a
      // 047: goto 054
      // 04a: ldc2_w 8645883315390146910
      // 04d: lload 3
      // 04e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 0
      // 055: getfield com/zelix/i9.s Ljava/util/ArrayList;
      // 058: iload 2
      // 059: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 05c: checkcast java/lang/String
      // 05f: areturn
      // 060: ldc2_w 8645883315390146910
      // 063: lload 3
      // 064: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: bipush 0
      // 06b: istore 10
      // 06d: aload 0
      // 06e: ldc2_w 7764362209865639275
      // 071: lload 3
      // 072: invokedynamic q (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: iload 10
      // 079: iinc 10 1
      // 07c: aload 0
      // 07d: iload 2
      // 07e: aload 0
      // 07f: ldc2_w 7502812441047068785
      // 082: lload 3
      // 083: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: irem
      // 089: lload 5
      // 08b: bipush 2
      // 08c: anewarray 226
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 1
      // 096: swap
      // 097: aastore
      // 098: dup_x1
      // 099: swap
      // 09a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w 8028777698586297984
      // 0a3: lload 3
      // 0a4: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: castore
      // 0aa: iload 2
      // 0ab: aload 0
      // 0ac: ldc2_w 7502812441047068785
      // 0af: lload 3
      // 0b0: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: idiv
      // 0b6: istore 11
      // 0b8: iload 11
      // 0ba: ifle 111
      // 0bd: aload 0
      // 0be: ldc2_w 7764362209865639275
      // 0c1: lload 3
      // 0c2: invokedynamic q (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: iload 10
      // 0c9: iinc 10 1
      // 0cc: aload 0
      // 0cd: iload 11
      // 0cf: aload 0
      // 0d0: ldc2_w 8584029199306518611
      // 0d3: lload 3
      // 0d4: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: irem
      // 0da: lload 7
      // 0dc: dup2_x1
      // 0dd: pop2
      // 0de: bipush 2
      // 0df: anewarray 226
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
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
      // 0f3: ldc2_w 7921679729897099118
      // 0f6: lload 3
      // 0f7: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: castore
      // 0fd: iload 11
      // 0ff: aload 0
      // 100: ldc2_w 8584029199306518611
      // 103: lload 3
      // 104: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: idiv
      // 10a: istore 11
      // 10c: aload 9
      // 10e: ifnull 0b8
      // 111: new java/lang/String
      // 114: dup
      // 115: aload 0
      // 116: ldc2_w 7764362209865639275
      // 119: lload 3
      // 11a: invokedynamic q (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: bipush 0
      // 120: iload 10
      // 122: invokespecial java/lang/String.<init> ([CII)V
      // 125: astore 12
      // 127: aload 0
      // 128: ldc2_w 8307700801229619267
      // 12b: lload 3
      // 12c: lload 3
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: ifle 0c2
      // 132: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: aload 9
      // 139: ifnonnull 175
      // 13c: ifnull 177
      // 13f: goto 14c
      // 142: ldc2_w 8645883315390146910
      // 145: lload 3
      // 146: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: new java/lang/StringBuilder
      // 14f: dup
      // 150: invokespecial java/lang/StringBuilder.<init> ()V
      // 153: aload 0
      // 154: ldc2_w 8307700801229619267
      // 157: lload 3
      // 158: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 160: aload 12
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 168: goto 175
      // 16b: ldc2_w 8645883315390146910
      // 16e: lload 3
      // 16f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: athrow
      // 175: astore 12
      // 177: ldc2_w 8250445425996762730
      // 17a: lload 3
      // 17b: invokedynamic k (JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: aload 12
      // 182: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 187: aload 9
      // 189: lload 3
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: iflt 1a8
      // 18f: ifnonnull 1a6
      // 192: ifeq 1a5
      // 195: goto 1a2
      // 198: ldc2_w 8645883315390146910
      // 19b: lload 3
      // 19c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aconst_null
      // 1a3: astore 12
      // 1a5: iload 2
      // 1a6: aload 9
      // 1a8: ifnonnull 1d8
      // 1ab: aload 0
      // 1ac: getfield com/zelix/i9.s Ljava/util/ArrayList;
      // 1af: invokevirtual java/util/ArrayList.size ()I
      // 1b2: if_icmpne 1d9
      // 1b5: goto 1c2
      // 1b8: ldc2_w 8645883315390146910
      // 1bb: lload 3
      // 1bc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: getfield com/zelix/i9.s Ljava/util/ArrayList;
      // 1c6: aload 12
      // 1c8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1cb: goto 1d8
      // 1ce: ldc2_w 8645883315390146910
      // 1d1: lload 3
      // 1d2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: pop
      // 1d9: aload 12
      // 1db: areturn
   }

   public i9(long param1, int param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/i9.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -2951206757272668345
      // 09: lload 1
      // 0a: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokespecial com/zelix/i1.<init> ()V
      // 13: astore 5
      // 15: aload 0
      // 16: new java/util/ArrayList
      // 19: dup
      // 1a: sipush 15072
      // 1d: ldc2_w 5378120718470153463
      // 20: lload 1
      // 21: lxor
      // 22: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: invokespecial java/util/ArrayList.<init> (I)V
      // 2a: putfield com/zelix/i9.s Ljava/util/ArrayList;
      // 2d: aload 0
      // 2e: sipush 1432
      // 31: ldc2_w 2105581436005137280
      // 34: lload 1
      // 35: lxor
      // 36: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: newarray 5
      // 3d: ldc2_w -3844390126414167026
      // 40: lload 1
      // 41: invokedynamic v (Ljava/lang/Object;[CJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: aload 0
      // 47: iload 3
      // 48: ldc2_w -3289110606066506956
      // 4b: lload 1
      // 4c: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: aload 0
      // 52: aload 4
      // 54: ldc2_w -3301257160870616794
      // 57: lload 1
      // 58: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: aload 5
      // 5f: ifnonnull c5
      // 62: iload 3
      // 63: ifne a7
      // 66: goto 73
      // 69: ldc2_w -2983303972789630917
      // 6c: lload 1
      // 6d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: aload 0
      // 74: sipush 12518
      // 77: ldc2_w 1527351877606903540
      // 7a: lload 1
      // 7b: lxor
      // 7c: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: putfield com/zelix/i9.S I
      // 84: aload 0
      // 85: sipush 19104
      // 88: ldc2_w 3588186360569984177
      // 8b: lload 1
      // 8c: lxor
      // 8d: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: putfield com/zelix/i9.e I
      // 95: aload 5
      // 97: ifnull d6
      // 9a: goto a7
      // 9d: ldc2_w -2983303972789630917
      // a0: lload 1
      // a1: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: aload 0
      // a8: sipush 900
      // ab: ldc2_w 2861700316413541776
      // ae: lload 1
      // af: lxor
      // b0: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: putfield com/zelix/i9.S I
      // b8: goto c5
      // bb: ldc2_w -2983303972789630917
      // be: lload 1
      // bf: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: athrow
      // c5: aload 0
      // c6: sipush 11546
      // c9: ldc2_w 5072833388177789699
      // cc: lload 1
      // cd: lxor
      // ce: invokedynamic e (IJ)I bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: putfield com/zelix/i9.e I
      // d6: return
   }

   static {
      long var0 = a ^ 53881288945957L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[14];
      int var5 = 0;
      String var6 = "íp\u0098µ©>üGgÜ.T~z«\u0000%tíDG\rú\u0004\bá2ÄÒ\n\u0084b¼¨¦äZZë:$Ñ\u0094\u008eÛ\u000fý\u0018²ZÛ²Cy\u0010»èíÂ\u00145êy¬\u0004\u0011yá\tµ\u001f\u009aÜÏ\u001a\u001e@Üâõb\u0099\u0088®\u000b\u0091Á±Ùl@¦\u008b\u0017×\u0001";
      int var7 = "íp\u0098µ©>üGgÜ.T~z«\u0000%tíDG\rú\u0004\bá2ÄÒ\n\u0084b¼¨¦äZZë:$Ñ\u0094\u008eÛ\u000fý\u0018²ZÛ²Cy\u0010»èíÂ\u00145êy¬\u0004\u0011yá\tµ\u001f\u009aÜÏ\u001a\u001e@Üâõb\u0099\u0088®\u000b\u0091Á±Ùl@¦\u008b\u0017×\u0001"
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
                     b = var8;
                     d = new Integer[14];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "\u0086W\u008d¡s¥Ï\t9\u0002n\u001c!\u0004+T";
                  var7 = "\u0086W\u008d¡s¥Ï\t9\u0002n\u001c!\u0004+T".length();
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

   private static n9 a(n9 var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25105;
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/i9", var14);
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
         throw new RuntimeException("com/zelix/i9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
