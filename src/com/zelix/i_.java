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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i_ extends oz implements r8, a, eo, hj, mb, y0, c4 {
   js k;
   private static final long b = prr.a(2188974264768775754L, -8373156838438720254L, MethodHandles.lookup().lookupClass()).a(236663533968631L);
   private static final String[] d;
   private static final String[] e;
   private static final Map g = new HashMap(13);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map t;

   public void U(Object[] param1) {
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
      // 04: checkcast com/zelix/xa
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/xa
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: ldc2_w -5485674813792749566
      // 1f: lload 2
      // 20: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 50
      // 2d: getfield com/zelix/i_.k Lcom/zelix/js;
      // 30: aload 5
      // 32: if_acmpne 55
      // 35: goto 42
      // 38: ldc2_w -6100475499714101502
      // 3b: lload 2
      // 3c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 50
      // 46: ldc2_w -6100475499714101502
      // 49: lload 2
      // 4a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 4
      // 52: putfield com/zelix/i_.k Lcom/zelix/js;
      // 55: return
   }

   public final boolean d(Object[] param1) {
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
      // 00e: ldc2_w 115546993362373
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 40731758451123
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 136783368459356
      // 01f: lxor
      // 020: lstore 8
      // 022: dup2
      // 023: ldc2_w 25788387872022
      // 026: lxor
      // 027: lstore 10
      // 029: pop2
      // 02a: ldc2_w -388614089625603416
      // 02d: lload 2
      // 02e: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: istore 12
      // 035: aload 0
      // 036: getfield com/zelix/i_.X I
      // 039: iload 12
      // 03b: ifne 290
      // 03e: lookupswitch 547 16 19 148 20 160 178 162 179 148 180 162 181 148 182 284 183 284 184 284 185 284 186 406 187 148 189 148 192 148 193 148 197 148
      // 0c8: ldc2_w -161133991089641065
      // 0cb: lload 2
      // 0cc: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: bipush 0
      // 0d3: ireturn
      // 0d4: ldc2_w -161133991089641065
      // 0d7: lload 2
      // 0d8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: bipush 1
      // 0df: ireturn
      // 0e0: aload 0
      // 0e1: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0e4: checkcast com/zelix/xk
      // 0e7: astore 13
      // 0e9: aload 13
      // 0eb: lload 4
      // 0ed: invokevirtual com/zelix/xk.V (J)Ljava/lang/String;
      // 0f0: astore 14
      // 0f2: aload 14
      // 0f4: lload 2
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 111
      // 0fa: iload 12
      // 0fc: ifne 111
      // 0ff: ifnull 158
      // 102: goto 10f
      // 105: ldc2_w -161133991089641065
      // 108: lload 2
      // 109: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 14
      // 111: ldc "J"
      // 113: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 116: iload 12
      // 118: ifne 155
      // 11b: ifne 154
      // 11e: goto 12b
      // 121: ldc2_w -161133991089641065
      // 124: lload 2
      // 125: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 14
      // 12d: ldc "D"
      // 12f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 132: iload 12
      // 134: ifne 155
      // 137: goto 144
      // 13a: ldc2_w -161133991089641065
      // 13d: lload 2
      // 13e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: ifeq 158
      // 147: goto 154
      // 14a: ldc2_w -161133991089641065
      // 14d: lload 2
      // 14e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: bipush 1
      // 155: goto 159
      // 158: bipush 0
      // 159: ireturn
      // 15a: aload 0
      // 15b: getfield com/zelix/i_.k Lcom/zelix/js;
      // 15e: checkcast com/zelix/xu
      // 161: astore 15
      // 163: aload 15
      // 165: lload 6
      // 167: invokevirtual com/zelix/xu.m (J)Ljava/lang/String;
      // 16a: astore 16
      // 16c: aload 16
      // 16e: lload 2
      // 16f: lconst_0
      // 170: lcmp
      // 171: iflt 18b
      // 174: iload 12
      // 176: ifne 18b
      // 179: ifnull 1d2
      // 17c: goto 189
      // 17f: ldc2_w -161133991089641065
      // 182: lload 2
      // 183: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: aload 16
      // 18b: ldc "J"
      // 18d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 190: iload 12
      // 192: ifne 1cf
      // 195: ifne 1ce
      // 198: goto 1a5
      // 19b: ldc2_w -161133991089641065
      // 19e: lload 2
      // 19f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: aload 16
      // 1a7: ldc "D"
      // 1a9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ac: iload 12
      // 1ae: ifne 1cf
      // 1b1: goto 1be
      // 1b4: ldc2_w -161133991089641065
      // 1b7: lload 2
      // 1b8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: ifeq 1d2
      // 1c1: goto 1ce
      // 1c4: ldc2_w -161133991089641065
      // 1c7: lload 2
      // 1c8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: bipush 1
      // 1cf: goto 1d3
      // 1d2: bipush 0
      // 1d3: ireturn
      // 1d4: aload 0
      // 1d5: getfield com/zelix/i_.k Lcom/zelix/js;
      // 1d8: checkcast com/zelix/jd
      // 1db: astore 17
      // 1dd: aload 17
      // 1df: lload 8
      // 1e1: bipush 1
      // 1e2: anewarray 24
      // 1e5: dup_x2
      // 1e6: dup_x2
      // 1e7: pop
      // 1e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1eb: bipush 0
      // 1ec: swap
      // 1ed: aastore
      // 1ee: ldc2_w -280443508208831266
      // 1f1: lload 2
      // 1f2: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: astore 18
      // 1f9: aload 18
      // 1fb: lload 2
      // 1fc: lconst_0
      // 1fd: lcmp
      // 1fe: iflt 218
      // 201: iload 12
      // 203: ifne 218
      // 206: ifnull 25f
      // 209: goto 216
      // 20c: ldc2_w -161133991089641065
      // 20f: lload 2
      // 210: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: athrow
      // 216: aload 18
      // 218: ldc "J"
      // 21a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 21d: iload 12
      // 21f: ifne 25c
      // 222: ifne 25b
      // 225: goto 232
      // 228: ldc2_w -161133991089641065
      // 22b: lload 2
      // 22c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: aload 18
      // 234: ldc "D"
      // 236: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 239: iload 12
      // 23b: ifne 25c
      // 23e: goto 24b
      // 241: ldc2_w -161133991089641065
      // 244: lload 2
      // 245: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: athrow
      // 24b: ifeq 25f
      // 24e: goto 25b
      // 251: ldc2_w -161133991089641065
      // 254: lload 2
      // 255: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: athrow
      // 25b: bipush 1
      // 25c: goto 260
      // 25f: bipush 0
      // 260: ireturn
      // 261: bipush 0
      // 262: bipush 1
      // 263: anewarray 12
      // 266: dup
      // 267: bipush 0
      // 268: new java/lang/StringBuilder
      // 26b: dup
      // 26c: invokespecial java/lang/StringBuilder.<init> ()V
      // 26f: sipush 25749
      // 272: ldc2_w 4780297319010590218
      // 275: lload 2
      // 276: lxor
      // 277: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27f: aload 0
      // 280: getfield com/zelix/i_.X I
      // 283: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 286: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 289: aastore
      // 28a: lload 10
      // 28c: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 28f: bipush 0
      // 290: ireturn
   }

   public hz n(hz param1, boolean param2, char param3, int param4, boolean param5, loj param6, char param7, String param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 7
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: lstore 9
      // 01b: lload 9
      // 01d: dup2
      // 01e: ldc2_w 9235592160028
      // 021: lxor
      // 022: lstore 11
      // 024: dup2
      // 025: ldc2_w 6215624408093
      // 028: lxor
      // 029: lstore 13
      // 02b: dup2
      // 02c: ldc2_w 114161761794490
      // 02f: lxor
      // 030: lstore 15
      // 032: dup2
      // 033: ldc2_w 31988536357509
      // 036: lxor
      // 037: lstore 17
      // 039: dup2
      // 03a: ldc2_w 121995932232441
      // 03d: lxor
      // 03e: lstore 19
      // 040: dup2
      // 041: ldc2_w 124303018560863
      // 044: lxor
      // 045: lstore 21
      // 047: dup2
      // 048: ldc2_w 9278367680005
      // 04b: lxor
      // 04c: lstore 23
      // 04e: dup2
      // 04f: ldc2_w 332116234582
      // 052: lxor
      // 053: lstore 25
      // 055: dup2
      // 056: ldc2_w 101946427565099
      // 059: lxor
      // 05a: dup2
      // 05b: bipush 56
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 27
      // 061: dup2
      // 062: bipush 8
      // 064: lshl
      // 065: bipush 32
      // 067: lushr
      // 068: l2i
      // 069: istore 28
      // 06b: dup2
      // 06c: bipush 40
      // 06e: lshl
      // 06f: bipush 40
      // 071: lushr
      // 072: l2i
      // 073: istore 29
      // 075: pop2
      // 076: dup2
      // 077: ldc2_w 65811635556040
      // 07a: lxor
      // 07b: dup2
      // 07c: bipush 8
      // 07e: lushr
      // 07f: lstore 30
      // 081: dup2
      // 082: bipush 56
      // 084: lshl
      // 085: bipush 56
      // 087: lushr
      // 088: l2i
      // 089: istore 32
      // 08b: pop2
      // 08c: dup2
      // 08d: ldc2_w 5679798847631
      // 090: lxor
      // 091: lstore 33
      // 093: dup2
      // 094: ldc2_w 8842354942294
      // 097: lxor
      // 098: lstore 35
      // 09a: dup2
      // 09b: ldc2_w 66632514719157
      // 09e: lxor
      // 09f: lstore 37
      // 0a1: dup2
      // 0a2: ldc2_w 129763427281871
      // 0a5: lxor
      // 0a6: lstore 39
      // 0a8: pop2
      // 0a9: new com/zelix/lby
      // 0ac: dup
      // 0ad: lload 30
      // 0af: aload 8
      // 0b1: iload 32
      // 0b3: i2b
      // 0b4: invokespecial com/zelix/lby.<init> (JLjava/lang/String;B)V
      // 0b7: astore 42
      // 0b9: aload 1
      // 0ba: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 0bd: astore 43
      // 0bf: aload 1
      // 0c0: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 0c3: astore 44
      // 0c5: aconst_null
      // 0c6: astore 45
      // 0c8: aload 44
      // 0ca: arraylength
      // 0cb: istore 46
      // 0cd: ldc2_w -4354173775004039090
      // 0d0: lload 9
      // 0d2: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 1
      // 0d8: invokevirtual com/zelix/hz.j ()Lcom/zelix/fb;
      // 0db: astore 47
      // 0dd: istore 41
      // 0df: aload 1
      // 0e0: lload 13
      // 0e2: invokevirtual com/zelix/hz.k (J)Ljava/util/Set;
      // 0e5: astore 48
      // 0e7: aload 0
      // 0e8: getfield com/zelix/i_.X I
      // 0eb: iload 41
      // 0ed: ifeq 855
      // 0f0: lookupswitch 1892 15 19 143 20 907 178 1094 179 1168 180 1210 181 1286 182 1446 183 1420 184 1472 185 1446 186 1498 187 1601 189 1672 192 1766 193 1842
      // 174: ldc2_w -2658557484950466738
      // 177: lload 9
      // 179: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: iload 46
      // 181: bipush 1
      // 182: iadd
      // 183: lload 25
      // 185: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 188: astore 45
      // 18a: aload 44
      // 18c: bipush 0
      // 18d: aload 45
      // 18f: bipush 0
      // 190: iload 46
      // 192: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 195: aload 0
      // 196: getfield com/zelix/i_.k Lcom/zelix/js;
      // 199: instanceof com/zelix/c
      // 19c: iload 41
      // 19e: iload 7
      // 1a0: ifle 2cf
      // 1a3: ifeq 2cd
      // 1a6: ifeq 2b8
      // 1a9: goto 1b7
      // 1ac: ldc2_w -2658557484950466738
      // 1af: lload 9
      // 1b1: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: getfield com/zelix/i_.k Lcom/zelix/js;
      // 1bb: checkcast com/zelix/c
      // 1be: lload 35
      // 1c0: invokeinterface com/zelix/c.j (J)Ljava/lang/String; 3
      // 1c5: astore 49
      // 1c7: aload 49
      // 1c9: sipush 13461
      // 1cc: ldc2_w 3064681577023547586
      // 1cf: lload 9
      // 1d1: lxor
      // 1d2: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1da: iload 41
      // 1dc: iload 3
      // 1dd: iflt 23c
      // 1e0: ifeq 235
      // 1e3: ifeq 214
      // 1e6: goto 1f4
      // 1e9: ldc2_w -2658557484950466738
      // 1ec: lload 9
      // 1ee: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: aload 45
      // 1f6: iload 46
      // 1f8: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 1fb: aastore
      // 1fc: iload 41
      // 1fe: iload 4
      // 200: iflt 2b0
      // 203: ifne 2ae
      // 206: goto 214
      // 209: ldc2_w -2658557484950466738
      // 20c: lload 9
      // 20e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: aload 49
      // 216: sipush 19223
      // 219: ldc2_w 6472760952396142418
      // 21c: lload 9
      // 21e: lxor
      // 21f: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 227: goto 235
      // 22a: ldc2_w -2658557484950466738
      // 22d: lload 9
      // 22f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: iload 4
      // 237: iflt 291
      // 23a: iload 41
      // 23c: ifeq 291
      // 23f: ifeq 270
      // 242: goto 250
      // 245: ldc2_w -2658557484950466738
      // 248: lload 9
      // 24a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: athrow
      // 250: aload 45
      // 252: iload 46
      // 254: getstatic com/zelix/v7.Y Lcom/zelix/v7;
      // 257: aastore
      // 258: iload 41
      // 25a: iload 7
      // 25c: ifle 2b0
      // 25f: ifne 2ae
      // 262: goto 270
      // 265: ldc2_w -2658557484950466738
      // 268: lload 9
      // 26a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: athrow
      // 270: aload 49
      // 272: sipush 27941
      // 275: ldc2_w 6941538905803059559
      // 278: lload 9
      // 27a: lxor
      // 27b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 283: goto 291
      // 286: ldc2_w -2658557484950466738
      // 289: lload 9
      // 28b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: athrow
      // 291: iload 3
      // 292: iflt 2b0
      // 295: ifeq 2ae
      // 298: aload 45
      // 29a: iload 46
      // 29c: getstatic com/zelix/v7.V Lcom/zelix/v7;
      // 29f: aastore
      // 2a0: goto 2ae
      // 2a3: ldc2_w -2658557484950466738
      // 2a6: lload 9
      // 2a8: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: athrow
      // 2ae: iload 41
      // 2b0: iload 7
      // 2b2: ifle 2bf
      // 2b5: ifne 469
      // 2b8: aload 0
      // 2b9: getfield com/zelix/i_.k Lcom/zelix/js;
      // 2bc: instanceof com/zelix/jf
      // 2bf: goto 2cd
      // 2c2: ldc2_w -2658557484950466738
      // 2c5: lload 9
      // 2c7: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: athrow
      // 2cd: iload 41
      // 2cf: iload 7
      // 2d1: ifle 321
      // 2d4: ifeq 31f
      // 2d7: ifeq 30a
      // 2da: goto 2e8
      // 2dd: ldc2_w -2658557484950466738
      // 2e0: lload 9
      // 2e2: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: athrow
      // 2e8: aload 45
      // 2ea: iload 46
      // 2ec: ldc2_w -2615269712084233667
      // 2ef: lload 9
      // 2f1: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: aastore
      // 2f7: iload 41
      // 2f9: ifne 469
      // 2fc: goto 30a
      // 2ff: ldc2_w -2658557484950466738
      // 302: lload 9
      // 304: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: athrow
      // 30a: aload 0
      // 30b: getfield com/zelix/i_.k Lcom/zelix/js;
      // 30e: instanceof com/zelix/j2
      // 311: goto 31f
      // 314: ldc2_w -2658557484950466738
      // 317: lload 9
      // 319: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: iload 41
      // 321: iload 4
      // 323: ifle 38e
      // 326: ifeq 38c
      // 329: ifeq 377
      // 32c: goto 33a
      // 32f: ldc2_w -2658557484950466738
      // 332: lload 9
      // 334: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: athrow
      // 33a: iload 46
      // 33c: bipush 1
      // 33d: iadd
      // 33e: lload 25
      // 340: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 343: astore 45
      // 345: aload 44
      // 347: bipush 0
      // 348: aload 45
      // 34a: bipush 0
      // 34b: iload 46
      // 34d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 350: aload 45
      // 352: iload 46
      // 354: iload 27
      // 356: i2b
      // 357: iload 28
      // 359: iload 29
      // 35b: sipush 30411
      // 35e: ldc2_w 1162045264073484955
      // 361: lload 9
      // 363: lxor
      // 364: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 36c: aastore
      // 36d: iload 41
      // 36f: iload 7
      // 371: iflt 37e
      // 374: ifne 469
      // 377: aload 0
      // 378: getfield com/zelix/i_.k Lcom/zelix/js;
      // 37b: instanceof com/zelix/j9
      // 37e: goto 38c
      // 381: ldc2_w -2658557484950466738
      // 384: lload 9
      // 386: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38b: athrow
      // 38c: iload 41
      // 38e: iload 3
      // 38f: iflt 3fa
      // 392: ifeq 3f8
      // 395: ifeq 3e3
      // 398: goto 3a6
      // 39b: ldc2_w -2658557484950466738
      // 39e: lload 9
      // 3a0: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: athrow
      // 3a6: iload 46
      // 3a8: bipush 1
      // 3a9: iadd
      // 3aa: lload 25
      // 3ac: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 3af: astore 45
      // 3b1: aload 44
      // 3b3: bipush 0
      // 3b4: aload 45
      // 3b6: bipush 0
      // 3b7: iload 46
      // 3b9: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3bc: aload 45
      // 3be: iload 46
      // 3c0: iload 27
      // 3c2: i2b
      // 3c3: iload 28
      // 3c5: iload 29
      // 3c7: sipush 14490
      // 3ca: ldc2_w 6398058744939586766
      // 3cd: lload 9
      // 3cf: lxor
      // 3d0: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d5: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 3d8: aastore
      // 3d9: iload 41
      // 3db: iload 7
      // 3dd: ifle 3ea
      // 3e0: ifne 469
      // 3e3: aload 0
      // 3e4: getfield com/zelix/i_.k Lcom/zelix/js;
      // 3e7: instanceof com/zelix/j5
      // 3ea: goto 3f8
      // 3ed: ldc2_w -2658557484950466738
      // 3f0: lload 9
      // 3f2: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: athrow
      // 3f8: iload 41
      // 3fa: ifeq 420
      // 3fd: ifeq 469
      // 400: goto 40e
      // 403: ldc2_w -2658557484950466738
      // 406: lload 9
      // 408: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40d: athrow
      // 40e: iload 46
      // 410: bipush 1
      // 411: iadd
      // 412: goto 420
      // 415: ldc2_w -2658557484950466738
      // 418: lload 9
      // 41a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41f: athrow
      // 420: lload 25
      // 422: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 425: astore 45
      // 427: aload 44
      // 429: bipush 0
      // 42a: aload 45
      // 42c: bipush 0
      // 42d: iload 46
      // 42f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 432: aload 0
      // 433: getfield com/zelix/i_.k Lcom/zelix/js;
      // 436: checkcast com/zelix/j5
      // 439: astore 49
      // 43b: aload 49
      // 43d: lload 17
      // 43f: bipush 1
      // 440: anewarray 24
      // 443: dup_x2
      // 444: dup_x2
      // 445: pop
      // 446: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 449: bipush 0
      // 44a: swap
      // 44b: aastore
      // 44c: ldc2_w -2683358755509513721
      // 44f: lload 9
      // 451: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: astore 50
      // 458: aload 45
      // 45a: iload 46
      // 45c: iload 27
      // 45e: i2b
      // 45f: iload 28
      // 461: iload 29
      // 463: aload 50
      // 465: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 468: aastore
      // 469: new com/zelix/hz
      // 46c: dup
      // 46d: aload 45
      // 46f: aload 43
      // 471: lload 15
      // 473: aload 47
      // 475: aload 48
      // 477: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 47a: areturn
      // 47b: iload 46
      // 47d: bipush 1
      // 47e: iadd
      // 47f: lload 25
      // 481: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 484: astore 45
      // 486: aload 44
      // 488: bipush 0
      // 489: aload 45
      // 48b: bipush 0
      // 48c: iload 46
      // 48e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 491: aload 0
      // 492: getfield com/zelix/i_.k Lcom/zelix/js;
      // 495: checkcast com/zelix/c
      // 498: lload 35
      // 49a: invokeinterface com/zelix/c.j (J)Ljava/lang/String; 3
      // 49f: astore 49
      // 4a1: aload 49
      // 4a3: sipush 17158
      // 4a6: ldc2_w 7739820134899998558
      // 4a9: lload 9
      // 4ab: lxor
      // 4ac: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4b4: iload 4
      // 4b6: ifle 50b
      // 4b9: iload 41
      // 4bb: ifeq 50b
      // 4be: ifeq 4ea
      // 4c1: goto 4cf
      // 4c4: ldc2_w -2658557484950466738
      // 4c7: lload 9
      // 4c9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ce: athrow
      // 4cf: aload 45
      // 4d1: iload 46
      // 4d3: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 4d6: aastore
      // 4d7: iload 41
      // 4d9: ifne 524
      // 4dc: goto 4ea
      // 4df: ldc2_w -2658557484950466738
      // 4e2: lload 9
      // 4e4: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e9: athrow
      // 4ea: aload 49
      // 4ec: sipush 2609
      // 4ef: ldc2_w 5050132617710671478
      // 4f2: lload 9
      // 4f4: lxor
      // 4f5: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4fd: goto 50b
      // 500: ldc2_w -2658557484950466738
      // 503: lload 9
      // 505: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50a: athrow
      // 50b: ifeq 524
      // 50e: aload 45
      // 510: iload 46
      // 512: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 515: aastore
      // 516: goto 524
      // 519: ldc2_w -2658557484950466738
      // 51c: lload 9
      // 51e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 523: athrow
      // 524: new com/zelix/hz
      // 527: dup
      // 528: aload 45
      // 52a: aload 43
      // 52c: lload 15
      // 52e: aload 47
      // 530: aload 48
      // 532: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 535: areturn
      // 536: iload 46
      // 538: bipush 1
      // 539: iadd
      // 53a: lload 25
      // 53c: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 53f: astore 45
      // 541: aload 44
      // 543: bipush 0
      // 544: aload 45
      // 546: bipush 0
      // 547: iload 46
      // 549: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 54c: aload 0
      // 54d: getfield com/zelix/i_.k Lcom/zelix/js;
      // 550: checkcast com/zelix/xk
      // 553: astore 50
      // 555: aload 45
      // 557: iload 46
      // 559: aload 50
      // 55b: lload 11
      // 55d: invokevirtual com/zelix/xk.V (J)Ljava/lang/String;
      // 560: iload 27
      // 562: i2b
      // 563: swap
      // 564: iload 28
      // 566: swap
      // 567: iload 29
      // 569: swap
      // 56a: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 56d: aastore
      // 56e: new com/zelix/hz
      // 571: dup
      // 572: aload 45
      // 574: aload 43
      // 576: lload 15
      // 578: aload 47
      // 57a: aload 48
      // 57c: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 57f: areturn
      // 580: iload 46
      // 582: bipush 1
      // 583: isub
      // 584: lload 25
      // 586: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 589: astore 45
      // 58b: aload 44
      // 58d: bipush 0
      // 58e: aload 45
      // 590: bipush 0
      // 591: iload 46
      // 593: bipush 1
      // 594: isub
      // 595: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 598: new com/zelix/hz
      // 59b: dup
      // 59c: aload 45
      // 59e: aload 43
      // 5a0: lload 15
      // 5a2: aload 47
      // 5a4: aload 48
      // 5a6: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 5a9: areturn
      // 5aa: iload 46
      // 5ac: lload 25
      // 5ae: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 5b1: astore 45
      // 5b3: aload 44
      // 5b5: bipush 0
      // 5b6: aload 45
      // 5b8: bipush 0
      // 5b9: iload 46
      // 5bb: bipush 1
      // 5bc: isub
      // 5bd: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 5c0: aload 0
      // 5c1: getfield com/zelix/i_.k Lcom/zelix/js;
      // 5c4: checkcast com/zelix/xk
      // 5c7: astore 51
      // 5c9: aload 45
      // 5cb: iload 46
      // 5cd: bipush 1
      // 5ce: isub
      // 5cf: aload 51
      // 5d1: lload 11
      // 5d3: invokevirtual com/zelix/xk.V (J)Ljava/lang/String;
      // 5d6: iload 27
      // 5d8: i2b
      // 5d9: swap
      // 5da: iload 28
      // 5dc: swap
      // 5dd: iload 29
      // 5df: swap
      // 5e0: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 5e3: aastore
      // 5e4: new com/zelix/hz
      // 5e7: dup
      // 5e8: aload 45
      // 5ea: aload 43
      // 5ec: lload 15
      // 5ee: aload 47
      // 5f0: aload 48
      // 5f2: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 5f5: areturn
      // 5f6: iload 46
      // 5f8: bipush 2
      // 5f9: isub
      // 5fa: lload 25
      // 5fc: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 5ff: astore 45
      // 601: aload 44
      // 603: bipush 0
      // 604: aload 45
      // 606: bipush 0
      // 607: iload 46
      // 609: bipush 2
      // 60a: isub
      // 60b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 60e: iload 2
      // 60f: ifeq 66a
      // 612: aload 0
      // 613: getfield com/zelix/i_.k Lcom/zelix/js;
      // 616: checkcast com/zelix/xk
      // 619: astore 52
      // 61b: aload 44
      // 61d: iload 46
      // 61f: bipush 1
      // 620: isub
      // 621: aaload
      // 622: aload 52
      // 624: lload 11
      // 626: invokevirtual com/zelix/xk.V (J)Ljava/lang/String;
      // 629: iload 27
      // 62b: i2b
      // 62c: swap
      // 62d: iload 28
      // 62f: swap
      // 630: iload 29
      // 632: swap
      // 633: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 636: lload 21
      // 638: aload 6
      // 63a: aload 8
      // 63c: bipush 5
      // 63d: anewarray 24
      // 640: dup_x1
      // 641: swap
      // 642: bipush 4
      // 643: swap
      // 644: aastore
      // 645: dup_x1
      // 646: swap
      // 647: bipush 3
      // 648: swap
      // 649: aastore
      // 64a: dup_x2
      // 64b: dup_x2
      // 64c: pop
      // 64d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 650: bipush 2
      // 651: swap
      // 652: aastore
      // 653: dup_x1
      // 654: swap
      // 655: bipush 1
      // 656: swap
      // 657: aastore
      // 658: dup_x1
      // 659: swap
      // 65a: bipush 0
      // 65b: swap
      // 65c: aastore
      // 65d: ldc2_w -4348026623736594657
      // 660: lload 9
      // 662: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 667: ifne 66a
      // 66a: new com/zelix/hz
      // 66d: dup
      // 66e: aload 45
      // 670: aload 43
      // 672: lload 15
      // 674: aload 47
      // 676: aload 48
      // 678: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 67b: areturn
      // 67c: aload 0
      // 67d: aload 44
      // 67f: iload 46
      // 681: aload 43
      // 683: lload 33
      // 685: aload 47
      // 687: aload 48
      // 689: bipush 1
      // 68a: bipush 1
      // 68b: iload 2
      // 68c: iload 5
      // 68e: aload 6
      // 690: aload 8
      // 692: invokespecial com/zelix/i_.L ([Lcom/zelix/v7;I[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;ZZZZLcom/zelix/loj;Ljava/lang/String;)Lcom/zelix/hz;
      // 695: areturn
      // 696: aload 0
      // 697: aload 44
      // 699: iload 46
      // 69b: aload 43
      // 69d: lload 33
      // 69f: aload 47
      // 6a1: aload 48
      // 6a3: bipush 1
      // 6a4: bipush 0
      // 6a5: iload 2
      // 6a6: iload 5
      // 6a8: aload 6
      // 6aa: aload 8
      // 6ac: invokespecial com/zelix/i_.L ([Lcom/zelix/v7;I[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;ZZZZLcom/zelix/loj;Ljava/lang/String;)Lcom/zelix/hz;
      // 6af: areturn
      // 6b0: aload 0
      // 6b1: aload 44
      // 6b3: iload 46
      // 6b5: aload 43
      // 6b7: lload 33
      // 6b9: aload 47
      // 6bb: aload 48
      // 6bd: bipush 0
      // 6be: bipush 0
      // 6bf: iload 2
      // 6c0: iload 5
      // 6c2: aload 6
      // 6c4: aload 8
      // 6c6: invokespecial com/zelix/i_.L ([Lcom/zelix/v7;I[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;ZZZZLcom/zelix/loj;Ljava/lang/String;)Lcom/zelix/hz;
      // 6c9: areturn
      // 6ca: aload 0
      // 6cb: aload 44
      // 6cd: iload 46
      // 6cf: aload 43
      // 6d1: aload 47
      // 6d3: aload 48
      // 6d5: iload 2
      // 6d6: iload 5
      // 6d8: aload 6
      // 6da: lload 19
      // 6dc: aload 8
      // 6de: bipush 10
      // 6e0: anewarray 24
      // 6e3: dup_x1
      // 6e4: swap
      // 6e5: bipush 9
      // 6e7: swap
      // 6e8: aastore
      // 6e9: dup_x2
      // 6ea: dup_x2
      // 6eb: pop
      // 6ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6ef: bipush 8
      // 6f1: swap
      // 6f2: aastore
      // 6f3: dup_x1
      // 6f4: swap
      // 6f5: bipush 7
      // 6f7: swap
      // 6f8: aastore
      // 6f9: dup_x1
      // 6fa: swap
      // 6fb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6fe: bipush 6
      // 700: swap
      // 701: aastore
      // 702: dup_x1
      // 703: swap
      // 704: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 707: bipush 5
      // 708: swap
      // 709: aastore
      // 70a: dup_x1
      // 70b: swap
      // 70c: bipush 4
      // 70d: swap
      // 70e: aastore
      // 70f: dup_x1
      // 710: swap
      // 711: bipush 3
      // 712: swap
      // 713: aastore
      // 714: dup_x1
      // 715: swap
      // 716: bipush 2
      // 717: swap
      // 718: aastore
      // 719: dup_x1
      // 71a: swap
      // 71b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 71e: bipush 1
      // 71f: swap
      // 720: aastore
      // 721: dup_x1
      // 722: swap
      // 723: bipush 0
      // 724: swap
      // 725: aastore
      // 726: ldc2_w -2431516890995556898
      // 729: lload 9
      // 72b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 730: areturn
      // 731: iload 46
      // 733: bipush 1
      // 734: iadd
      // 735: lload 25
      // 737: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 73a: astore 45
      // 73c: aload 44
      // 73e: bipush 0
      // 73f: aload 45
      // 741: bipush 0
      // 742: iload 46
      // 744: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 747: aload 0
      // 748: getfield com/zelix/i_.k Lcom/zelix/js;
      // 74b: checkcast com/zelix/jf
      // 74e: astore 52
      // 750: aload 45
      // 752: iload 46
      // 754: aload 52
      // 756: lload 37
      // 758: invokevirtual com/zelix/jf.h (J)Ljava/lang/String;
      // 75b: lload 23
      // 75d: bipush 0
      // 75e: aload 0
      // 75f: checkcast com/zelix/ic
      // 762: invokestatic com/zelix/v7.Q (Ljava/lang/String;JZLcom/zelix/ic;)Lcom/zelix/v7;
      // 765: aastore
      // 766: new com/zelix/hz
      // 769: dup
      // 76a: aload 45
      // 76c: aload 43
      // 76e: lload 15
      // 770: aload 47
      // 772: aload 48
      // 774: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 777: areturn
      // 778: iload 46
      // 77a: lload 25
      // 77c: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 77f: astore 45
      // 781: aload 44
      // 783: bipush 0
      // 784: aload 45
      // 786: bipush 0
      // 787: iload 46
      // 789: bipush 1
      // 78a: isub
      // 78b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 78e: aload 0
      // 78f: getfield com/zelix/i_.k Lcom/zelix/js;
      // 792: checkcast com/zelix/jf
      // 795: astore 53
      // 797: aload 45
      // 799: iload 46
      // 79b: bipush 1
      // 79c: isub
      // 79d: new java/lang/StringBuilder
      // 7a0: dup
      // 7a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 7a4: ldc "["
      // 7a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a9: aload 53
      // 7ab: lload 37
      // 7ad: invokevirtual com/zelix/jf.h (J)Ljava/lang/String;
      // 7b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7b6: iload 27
      // 7b8: i2b
      // 7b9: swap
      // 7ba: iload 28
      // 7bc: swap
      // 7bd: iload 29
      // 7bf: swap
      // 7c0: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 7c3: aastore
      // 7c4: new com/zelix/hz
      // 7c7: dup
      // 7c8: aload 45
      // 7ca: aload 43
      // 7cc: lload 15
      // 7ce: aload 47
      // 7d0: aload 48
      // 7d2: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 7d5: areturn
      // 7d6: iload 46
      // 7d8: lload 25
      // 7da: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 7dd: astore 45
      // 7df: aload 44
      // 7e1: bipush 0
      // 7e2: aload 45
      // 7e4: bipush 0
      // 7e5: iload 46
      // 7e7: bipush 1
      // 7e8: isub
      // 7e9: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 7ec: aload 0
      // 7ed: getfield com/zelix/i_.k Lcom/zelix/js;
      // 7f0: checkcast com/zelix/jf
      // 7f3: astore 54
      // 7f5: aload 45
      // 7f7: iload 46
      // 7f9: bipush 1
      // 7fa: isub
      // 7fb: aload 54
      // 7fd: lload 37
      // 7ff: invokevirtual com/zelix/jf.h (J)Ljava/lang/String;
      // 802: iload 27
      // 804: i2b
      // 805: swap
      // 806: iload 28
      // 808: swap
      // 809: iload 29
      // 80b: swap
      // 80c: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 80f: aastore
      // 810: new com/zelix/hz
      // 813: dup
      // 814: aload 45
      // 816: aload 43
      // 818: lload 15
      // 81a: aload 47
      // 81c: aload 48
      // 81e: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 821: areturn
      // 822: iload 46
      // 824: lload 25
      // 826: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 829: astore 45
      // 82b: aload 44
      // 82d: bipush 0
      // 82e: aload 45
      // 830: bipush 0
      // 831: iload 46
      // 833: bipush 1
      // 834: isub
      // 835: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 838: aload 45
      // 83a: iload 46
      // 83c: bipush 1
      // 83d: isub
      // 83e: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 841: aastore
      // 842: new com/zelix/hz
      // 845: dup
      // 846: aload 45
      // 848: aload 43
      // 84a: lload 15
      // 84c: aload 47
      // 84e: aload 48
      // 850: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 853: areturn
      // 854: bipush 0
      // 855: bipush 1
      // 856: anewarray 12
      // 859: dup
      // 85a: bipush 0
      // 85b: new java/lang/StringBuilder
      // 85e: dup
      // 85f: invokespecial java/lang/StringBuilder.<init> ()V
      // 862: sipush 25749
      // 865: ldc2_w 4780402113743091923
      // 868: lload 9
      // 86a: lxor
      // 86b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 870: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 873: aload 0
      // 874: getfield com/zelix/i_.X I
      // 877: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 87a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 87d: aastore
      // 87e: lload 39
      // 880: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 883: aconst_null
      // 884: areturn
   }

   public boolean r(Object[] param1) {
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
      // 004: checkcast com/zelix/ii
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/bn
      // 017: astore 5
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Integer
      // 029: invokevirtual java/lang/Integer.intValue ()I
      // 02c: istore 7
      // 02e: pop
      // 02f: lload 2
      // 030: dup2
      // 031: ldc2_w 128783059689007
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 20501208929285
      // 03b: lxor
      // 03c: lstore 10
      // 03e: pop2
      // 03f: ldc2_w 8691382388752823105
      // 042: lload 2
      // 043: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: istore 12
      // 04a: aload 0
      // 04b: getfield com/zelix/i_.X I
      // 04e: iload 12
      // 050: ifeq 14c
      // 053: sipush 4410
      // 056: ldc2_w 8562346218717644316
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: if_icmpne 14b
      // 063: goto 070
      // 066: ldc2_w 6923660124136469569
      // 069: lload 2
      // 06a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: aload 0
      // 071: getfield com/zelix/i_.k Lcom/zelix/js;
      // 074: instanceof com/zelix/xp
      // 077: iload 12
      // 079: ifeq 14c
      // 07c: goto 089
      // 07f: ldc2_w 6923660124136469569
      // 082: lload 2
      // 083: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: ifeq 14b
      // 08c: goto 099
      // 08f: ldc2_w 6923660124136469569
      // 092: lload 2
      // 093: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 0
      // 09a: getfield com/zelix/i_.k Lcom/zelix/js;
      // 09d: checkcast com/zelix/xp
      // 0a0: astore 13
      // 0a2: aload 13
      // 0a4: lload 8
      // 0a6: bipush 1
      // 0a7: anewarray 24
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w 7320776223038961253
      // 0b6: lload 2
      // 0b7: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: iload 12
      // 0be: ifeq 14a
      // 0c1: ifeq 149
      // 0c4: goto 0d1
      // 0c7: ldc2_w 6923660124136469569
      // 0ca: lload 2
      // 0cb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 4
      // 0d3: aload 13
      // 0d5: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0da: iload 12
      // 0dc: ifeq 14a
      // 0df: goto 0ec
      // 0e2: ldc2_w 6923660124136469569
      // 0e5: lload 2
      // 0e6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: ifne 149
      // 0ef: goto 0fc
      // 0f2: ldc2_w 6923660124136469569
      // 0f5: lload 2
      // 0f6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 6
      // 0fe: aload 5
      // 100: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 103: aload 5
      // 105: aload 13
      // 107: new com/zelix/lk9
      // 10a: dup
      // 10b: iload 7
      // 10d: aload 0
      // 10e: invokespecial com/zelix/lk9.<init> (ILjava/lang/Object;)V
      // 111: lload 10
      // 113: bipush 5
      // 114: anewarray 24
      // 117: dup_x2
      // 118: dup_x2
      // 119: pop
      // 11a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11d: bipush 4
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 3
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 2
      // 128: swap
      // 129: aastore
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 1
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 0
      // 132: swap
      // 133: aastore
      // 134: ldc2_w 9012032619352306582
      // 137: lload 2
      // 138: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: bipush 1
      // 13e: ireturn
      // 13f: ldc2_w 6923660124136469569
      // 142: lload 2
      // 143: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: bipush 0
      // 14a: ireturn
      // 14b: bipush 0
      // 14c: ireturn
   }

   public boolean P(Object[] param1) {
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
      // 0c: ldc2_w 5697171316799031075
      // 0f: lload 2
      // 10: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/zelix/i_.X I
      // 1b: iload 4
      // 1d: lload 2
      // 1e: lconst_0
      // 1f: lcmp
      // 20: iflt 59
      // 23: ifne 57
      // 26: sipush 22012
      // 29: ldc2_w 4412600810210683523
      // 2c: lload 2
      // 2d: lxor
      // 2e: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: if_icmpne 70
      // 36: goto 43
      // 39: ldc2_w 5208623898935090204
      // 3c: lload 2
      // 3d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 0
      // 44: getfield com/zelix/i_.k Lcom/zelix/js;
      // 47: instanceof com/zelix/xa
      // 4a: goto 57
      // 4d: ldc2_w 5208623898935090204
      // 50: lload 2
      // 51: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 4
      // 59: ifne 6d
      // 5c: ifeq 70
      // 5f: goto 6c
      // 62: ldc2_w 5208623898935090204
      // 65: lload 2
      // 66: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   public i_(int var1, js var2) {
      super(var1);
      this.k = var2;
   }

   i_(int param1, h1 param2, hp param3, long param4, l6q param6, l6q param7, l6q param8, l6q param9, l6q param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i_.b J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 125468097323857
      // 00e: lxor
      // 00f: lstore 11
      // 011: dup2
      // 012: ldc2_w 84746021936668
      // 015: lxor
      // 016: lstore 13
      // 018: dup2
      // 019: ldc2_w 49777912511323
      // 01c: lxor
      // 01d: lstore 15
      // 01f: pop2
      // 020: aload 0
      // 021: iload 1
      // 022: invokespecial com/zelix/oz.<init> (I)V
      // 025: ldc2_w -8125915710696504090
      // 028: lload 4
      // 02a: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: aload 2
      // 030: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 033: istore 18
      // 035: istore 17
      // 037: aload 0
      // 038: aload 3
      // 039: lload 13
      // 03b: iload 18
      // 03d: invokeinterface com/zelix/hp.m (JI)Lcom/zelix/js; 4
      // 042: putfield com/zelix/i_.k Lcom/zelix/js;
      // 045: iload 17
      // 047: ifeq 0ac
      // 04a: getstatic com/zelix/l6u.r [I
      // 04d: aload 0
      // 04e: getfield com/zelix/i_.k Lcom/zelix/js;
      // 051: lload 11
      // 053: invokevirtual com/zelix/js.A (J)Lcom/zelix/va;
      // 056: invokevirtual com/zelix/va.ordinal ()I
      // 059: iaload
      // 05a: tableswitch 225 1 7 53 94 128 162 196 196 196
      // 084: ldc2_w -7515728506846116890
      // 087: lload 4
      // 089: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 9
      // 091: aload 0
      // 092: getfield com/zelix/i_.k Lcom/zelix/js;
      // 095: checkcast com/zelix/jf
      // 098: aload 0
      // 099: lload 15
      // 09b: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 09e: goto 0ac
      // 0a1: ldc2_w -7515728506846116890
      // 0a4: lload 4
      // 0a6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: iload 17
      // 0ae: lload 4
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: iflt 0c9
      // 0b5: ifne 13b
      // 0b8: aload 6
      // 0ba: aload 0
      // 0bb: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0be: checkcast com/zelix/xt
      // 0c1: aload 0
      // 0c2: lload 15
      // 0c4: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c7: iload 17
      // 0c9: ifne 13b
      // 0cc: goto 0da
      // 0cf: ldc2_w -7515728506846116890
      // 0d2: lload 4
      // 0d4: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 7
      // 0dc: aload 0
      // 0dd: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0e0: checkcast com/zelix/xp
      // 0e3: aload 0
      // 0e4: lload 15
      // 0e6: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0e9: iload 17
      // 0eb: ifne 13b
      // 0ee: goto 0fc
      // 0f1: ldc2_w -7515728506846116890
      // 0f4: lload 4
      // 0f6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 8
      // 0fe: aload 0
      // 0ff: getfield com/zelix/i_.k Lcom/zelix/js;
      // 102: checkcast com/zelix/xa
      // 105: aload 0
      // 106: lload 15
      // 108: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 10b: iload 17
      // 10d: ifne 13b
      // 110: goto 11e
      // 113: ldc2_w -7515728506846116890
      // 116: lload 4
      // 118: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: aload 10
      // 120: aload 0
      // 121: getfield com/zelix/i_.k Lcom/zelix/js;
      // 124: checkcast com/zelix/xm
      // 127: aload 0
      // 128: lload 15
      // 12a: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 12d: goto 13b
      // 130: ldc2_w -7515728506846116890
      // 133: lload 4
      // 135: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: return
   }

   public final boolean T(long var1) {
      return false;
   }

   public boolean A(Object[] param1) {
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
      // 004: checkcast com/zelix/ii
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/bn
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Integer
      // 029: invokevirtual java/lang/Integer.intValue ()I
      // 02c: istore 3
      // 02d: pop
      // 02e: lload 4
      // 030: dup2
      // 031: ldc2_w 60629655652462
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 112325692451384
      // 03b: lxor
      // 03c: lstore 10
      // 03e: pop2
      // 03f: ldc2_w 8873843081478927125
      // 042: lload 4
      // 044: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: istore 12
      // 04b: aload 0
      // 04c: getfield com/zelix/i_.X I
      // 04f: iload 12
      // 051: ifne 155
      // 054: sipush 32179
      // 057: ldc2_w 3893128723763001081
      // 05a: lload 4
      // 05c: lxor
      // 05d: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: if_icmpne 154
      // 065: goto 073
      // 068: ldc2_w 8970868856979515434
      // 06b: lload 4
      // 06d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: aload 0
      // 074: getfield com/zelix/i_.k Lcom/zelix/js;
      // 077: instanceof com/zelix/xa
      // 07a: iload 12
      // 07c: ifne 155
      // 07f: goto 08d
      // 082: ldc2_w 8970868856979515434
      // 085: lload 4
      // 087: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: ifeq 154
      // 090: goto 09e
      // 093: ldc2_w 8970868856979515434
      // 096: lload 4
      // 098: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0a2: checkcast com/zelix/xa
      // 0a5: astore 13
      // 0a7: aload 13
      // 0a9: lload 10
      // 0ab: bipush 1
      // 0ac: anewarray 24
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 9202386550191910299
      // 0bb: lload 4
      // 0bd: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: iload 12
      // 0c4: ifne 153
      // 0c7: ifeq 152
      // 0ca: goto 0d8
      // 0cd: ldc2_w 8970868856979515434
      // 0d0: lload 4
      // 0d2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 6
      // 0da: aload 13
      // 0dc: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0e1: iload 12
      // 0e3: ifne 153
      // 0e6: goto 0f4
      // 0e9: ldc2_w 8970868856979515434
      // 0ec: lload 4
      // 0ee: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: ifne 152
      // 0f7: goto 105
      // 0fa: ldc2_w 8970868856979515434
      // 0fd: lload 4
      // 0ff: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 2
      // 106: aload 7
      // 108: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 10b: aload 7
      // 10d: aload 13
      // 10f: new com/zelix/lk9
      // 112: dup
      // 113: iload 3
      // 114: aload 0
      // 115: invokespecial com/zelix/lk9.<init> (ILjava/lang/Object;)V
      // 118: lload 8
      // 11a: bipush 5
      // 11b: anewarray 24
      // 11e: dup_x2
      // 11f: dup_x2
      // 120: pop
      // 121: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 124: bipush 4
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 3
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x1
      // 12d: swap
      // 12e: bipush 2
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 1
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: bipush 0
      // 139: swap
      // 13a: aastore
      // 13b: ldc2_w 7023942418792329213
      // 13e: lload 4
      // 140: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: bipush 1
      // 146: ireturn
      // 147: ldc2_w 8970868856979515434
      // 14a: lload 4
      // 14c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: bipush 0
      // 153: ireturn
      // 154: bipush 0
      // 155: ireturn
   }

   public boolean d(ii param1, Set param2, bn param3, int param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 5
      // 002: dup2
      // 003: ldc2_w 88807803932621
      // 006: lxor
      // 007: lstore 7
      // 009: dup2
      // 00a: ldc2_w 88905532612688
      // 00d: lxor
      // 00e: lstore 9
      // 010: pop2
      // 011: ldc2_w -4862376159837014858
      // 014: lload 5
      // 016: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: istore 11
      // 01d: aload 0
      // 01e: getfield com/zelix/i_.X I
      // 021: iload 11
      // 023: ifne 168
      // 026: sipush 11474
      // 029: ldc2_w 8648224956489424959
      // 02c: lload 5
      // 02e: lxor
      // 02f: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: if_icmpne 167
      // 037: goto 045
      // 03a: ldc2_w -4909615928495493239
      // 03d: lload 5
      // 03f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: athrow
      // 045: aload 0
      // 046: getfield com/zelix/i_.k Lcom/zelix/js;
      // 049: instanceof com/zelix/xt
      // 04c: iload 11
      // 04e: ifne 168
      // 051: goto 05f
      // 054: ldc2_w -4909615928495493239
      // 057: lload 5
      // 059: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: ifeq 167
      // 062: goto 070
      // 065: ldc2_w -4909615928495493239
      // 068: lload 5
      // 06a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: aload 0
      // 071: getfield com/zelix/i_.k Lcom/zelix/js;
      // 074: checkcast com/zelix/xt
      // 077: astore 12
      // 079: aload 12
      // 07b: invokevirtual com/zelix/xt.V ()Lcom/zelix/x8;
      // 07e: astore 13
      // 080: aload 13
      // 082: bipush 0
      // 083: anewarray 24
      // 086: ldc2_w -4722412079814637109
      // 089: lload 5
      // 08b: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: iload 11
      // 092: lload 5
      // 094: lconst_0
      // 095: lcmp
      // 096: iflt 09d
      // 099: ifne 166
      // 09c: bipush 2
      // 09d: if_icmplt 165
      // 0a0: goto 0ae
      // 0a3: ldc2_w -4909615928495493239
      // 0a6: lload 5
      // 0a8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 12
      // 0b0: lload 9
      // 0b2: bipush 1
      // 0b3: anewarray 24
      // 0b6: dup_x2
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bc: bipush 0
      // 0bd: swap
      // 0be: aastore
      // 0bf: ldc2_w -6562076652257736268
      // 0c2: lload 5
      // 0c4: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: iload 11
      // 0cb: ifne 166
      // 0ce: goto 0dc
      // 0d1: ldc2_w -4909615928495493239
      // 0d4: lload 5
      // 0d6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: ifeq 165
      // 0df: goto 0ed
      // 0e2: ldc2_w -4909615928495493239
      // 0e5: lload 5
      // 0e7: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 2
      // 0ee: aload 12
      // 0f0: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0f5: iload 11
      // 0f7: ifne 166
      // 0fa: goto 108
      // 0fd: ldc2_w -4909615928495493239
      // 100: lload 5
      // 102: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: ifne 165
      // 10b: goto 119
      // 10e: ldc2_w -4909615928495493239
      // 111: lload 5
      // 113: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: aload 1
      // 11a: aload 3
      // 11b: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 11e: aload 3
      // 11f: aload 12
      // 121: new com/zelix/lk9
      // 124: dup
      // 125: iload 4
      // 127: aload 0
      // 128: invokespecial com/zelix/lk9.<init> (ILjava/lang/Object;)V
      // 12b: lload 7
      // 12d: bipush 5
      // 12e: anewarray 24
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 4
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 3
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 2
      // 142: swap
      // 143: aastore
      // 144: dup_x1
      // 145: swap
      // 146: bipush 1
      // 147: swap
      // 148: aastore
      // 149: dup_x1
      // 14a: swap
      // 14b: bipush 0
      // 14c: swap
      // 14d: aastore
      // 14e: ldc2_w -6423987347638458274
      // 151: lload 5
      // 153: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: bipush 1
      // 159: ireturn
      // 15a: ldc2_w -4909615928495493239
      // 15d: lload 5
      // 15f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: bipush 0
      // 166: ireturn
      // 167: bipush 0
      // 168: ireturn
   }

   public final void k(Object[] param1) {
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
      // 04: checkcast com/zelix/jd
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/jd
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: ldc2_w -5520680336640542530
      // 1f: lload 2
      // 20: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 50
      // 2d: getfield com/zelix/i_.k Lcom/zelix/js;
      // 30: aload 4
      // 32: if_acmpne 55
      // 35: goto 42
      // 38: ldc2_w -6058840738147582018
      // 3b: lload 2
      // 3c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 50
      // 46: ldc2_w -6058840738147582018
      // 49: lload 2
      // 4a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 5
      // 52: putfield com/zelix/i_.k Lcom/zelix/js;
      // 55: return
   }

   public final void o(Object[] param1) {
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
      // 04: checkcast com/zelix/xp
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/xp
      // 19: astore 3
      // 1a: pop
      // 1b: ldc2_w 7272722803229110065
      // 1e: lload 4
      // 20: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 51
      // 2d: getfield com/zelix/i_.k Lcom/zelix/js;
      // 30: aload 2
      // 31: if_acmpne 55
      // 34: goto 42
      // 37: ldc2_w 8963800240429262897
      // 3a: lload 4
      // 3c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 51
      // 46: ldc2_w 8963800240429262897
      // 49: lload 4
      // 4b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 3
      // 52: putfield com/zelix/i_.k Lcom/zelix/js;
      // 55: return
   }

   private hz L(
      v7[] param1,
      int param2,
      v7[] param3,
      long param4,
      fb param6,
      Set param7,
      boolean param8,
      boolean param9,
      boolean param10,
      boolean param11,
      loj param12,
      String param13
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i_.b J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 7669244275357
      // 00e: lxor
      // 00f: lstore 14
      // 011: dup2
      // 012: ldc2_w 136881772688579
      // 015: lxor
      // 016: lstore 16
      // 018: dup2
      // 019: ldc2_w 53950580464399
      // 01c: lxor
      // 01d: lstore 18
      // 01f: dup2
      // 020: ldc2_w 27743328481887
      // 023: lxor
      // 024: lstore 20
      // 026: dup2
      // 027: ldc2_w 15034288314443
      // 02a: lxor
      // 02b: lstore 22
      // 02d: dup2
      // 02e: ldc2_w 50590530428571
      // 031: lxor
      // 032: lstore 24
      // 034: dup2
      // 035: ldc2_w 80926016140919
      // 038: lxor
      // 039: lstore 26
      // 03b: dup2
      // 03c: ldc2_w 23566976516874
      // 03f: lxor
      // 040: dup2
      // 041: bipush 56
      // 043: lushr
      // 044: l2i
      // 045: istore 28
      // 047: dup2
      // 048: bipush 8
      // 04a: lshl
      // 04b: bipush 32
      // 04d: lushr
      // 04e: l2i
      // 04f: istore 29
      // 051: dup2
      // 052: bipush 40
      // 054: lshl
      // 055: bipush 40
      // 057: lushr
      // 058: l2i
      // 059: istore 30
      // 05b: pop2
      // 05c: dup2
      // 05d: ldc2_w 125403028171241
      // 060: lxor
      // 061: dup2
      // 062: bipush 8
      // 064: lushr
      // 065: lstore 31
      // 067: dup2
      // 068: bipush 56
      // 06a: lshl
      // 06b: bipush 56
      // 06d: lushr
      // 06e: l2i
      // 06f: istore 33
      // 071: pop2
      // 072: dup2
      // 073: ldc2_w 62512454068862
      // 076: lxor
      // 077: lstore 34
      // 079: pop2
      // 07a: new com/zelix/lby
      // 07d: dup
      // 07e: lload 31
      // 080: aload 13
      // 082: iload 33
      // 084: i2b
      // 085: invokespecial com/zelix/lby.<init> (JLjava/lang/String;B)V
      // 088: astore 37
      // 08a: ldc2_w -4943979131773439152
      // 08d: lload 4
      // 08f: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: aload 0
      // 095: getfield com/zelix/i_.k Lcom/zelix/js;
      // 098: checkcast com/zelix/xu
      // 09b: astore 38
      // 09d: istore 36
      // 09f: aload 38
      // 0a1: lload 14
      // 0a3: invokevirtual com/zelix/xu.A (J)Ljava/util/List;
      // 0a6: astore 39
      // 0a8: aload 39
      // 0aa: invokeinterface java/util/List.size ()I 1
      // 0af: istore 40
      // 0b1: aload 38
      // 0b3: lload 22
      // 0b5: invokevirtual com/zelix/xu.m (J)Ljava/lang/String;
      // 0b8: astore 41
      // 0ba: aload 41
      // 0bc: ifnonnull 0ce
      // 0bf: bipush 0
      // 0c0: goto 0cf
      // 0c3: ldc2_w -4883131409867724689
      // 0c6: lload 4
      // 0c8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: bipush 1
      // 0cf: istore 42
      // 0d1: iload 10
      // 0d3: iload 36
      // 0d5: lload 4
      // 0d7: lconst_0
      // 0d8: lcmp
      // 0d9: ifle 25e
      // 0dc: ifne 25c
      // 0df: ifeq 251
      // 0e2: goto 0f0
      // 0e5: ldc2_w -4883131409867724689
      // 0e8: lload 4
      // 0ea: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: bipush 0
      // 0f1: istore 43
      // 0f3: iload 43
      // 0f5: iload 40
      // 0f7: if_icmpge 251
      // 0fa: aload 1
      // 0fb: iload 2
      // 0fc: iload 40
      // 0fe: isub
      // 0ff: iload 43
      // 101: iadd
      // 102: aaload
      // 103: astore 44
      // 105: aload 39
      // 107: iload 43
      // 109: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10e: iload 28
      // 110: i2b
      // 111: swap
      // 112: iload 29
      // 114: swap
      // 115: iload 30
      // 117: swap
      // 118: checkcast java/lang/String
      // 11b: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 11e: astore 45
      // 120: aload 44
      // 122: aload 45
      // 124: lload 34
      // 126: aload 12
      // 128: aload 13
      // 12a: bipush 5
      // 12b: anewarray 24
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 4
      // 131: swap
      // 132: aastore
      // 133: dup_x1
      // 134: swap
      // 135: bipush 3
      // 136: swap
      // 137: aastore
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 2
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: bipush 1
      // 144: swap
      // 145: aastore
      // 146: dup_x1
      // 147: swap
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w -6590458378275301314
      // 14e: lload 4
      // 150: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: iload 36
      // 157: ifne 25c
      // 15a: ifne 244
      // 15d: goto 16b
      // 160: ldc2_w -4883131409867724689
      // 163: lload 4
      // 165: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: new com/zelix/u9
      // 16e: dup
      // 16f: new java/lang/StringBuilder
      // 172: dup
      // 173: invokespecial java/lang/StringBuilder.<init> ()V
      // 176: sipush 27864
      // 179: ldc2_w 9050923816159483820
      // 17c: lload 4
      // 17e: lxor
      // 17f: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 187: aload 44
      // 189: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 18c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18f: sipush 24861
      // 192: ldc2_w 3595591434634435183
      // 195: lload 4
      // 197: lxor
      // 198: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a0: aload 45
      // 1a2: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a8: sipush 1152
      // 1ab: ldc2_w 6670138048065306620
      // 1ae: lload 4
      // 1b0: lxor
      // 1b1: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b9: iload 43
      // 1bb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1be: sipush 8753
      // 1c1: ldc2_w 3913123035361597780
      // 1c4: lload 4
      // 1c6: lxor
      // 1c7: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cf: aload 38
      // 1d1: lload 16
      // 1d3: bipush 1
      // 1d4: anewarray 24
      // 1d7: dup_x2
      // 1d8: dup_x2
      // 1d9: pop
      // 1da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dd: bipush 0
      // 1de: swap
      // 1df: aastore
      // 1e0: ldc2_w -6743607688235547806
      // 1e3: lload 4
      // 1e5: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ed: sipush 9212
      // 1f0: ldc2_w 3021488881979316356
      // 1f3: lload 4
      // 1f5: lxor
      // 1f6: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fe: aload 38
      // 200: lload 18
      // 202: bipush 1
      // 203: anewarray 24
      // 206: dup_x2
      // 207: dup_x2
      // 208: pop
      // 209: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20c: bipush 0
      // 20d: swap
      // 20e: aastore
      // 20f: ldc2_w -4858737244390457213
      // 212: lload 4
      // 214: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21c: sipush 25149
      // 21f: ldc2_w 396519070120810826
      // 222: lload 4
      // 224: lxor
      // 225: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22d: aload 37
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 232: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 235: invokespecial com/zelix/u9.<init> (Ljava/lang/String;)V
      // 238: athrow
      // 239: ldc2_w -4883131409867724689
      // 23c: lload 4
      // 23e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: goto 249
      // 247: astore 46
      // 249: iinc 43 1
      // 24c: iload 36
      // 24e: ifeq 0f3
      // 251: iload 2
      // 252: iload 40
      // 254: lload 4
      // 256: lconst_0
      // 257: lcmp
      // 258: iflt 25e
      // 25b: isub
      // 25c: iload 8
      // 25e: iload 36
      // 260: ifne 275
      // 263: ifeq 278
      // 266: goto 274
      // 269: ldc2_w -4883131409867724689
      // 26c: lload 4
      // 26e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: athrow
      // 274: bipush 1
      // 275: goto 279
      // 278: bipush 0
      // 279: isub
      // 27a: iload 42
      // 27c: iadd
      // 27d: istore 43
      // 27f: iload 43
      // 281: iload 42
      // 283: isub
      // 284: iload 36
      // 286: ifne 314
      // 289: ifge 312
      // 28c: goto 29a
      // 28f: ldc2_w -4883131409867724689
      // 292: lload 4
      // 294: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: athrow
      // 29a: new com/zelix/u9
      // 29d: dup
      // 29e: new java/lang/StringBuilder
      // 2a1: dup
      // 2a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a5: sipush 29641
      // 2a8: ldc2_w 8779738521158846632
      // 2ab: lload 4
      // 2ad: lxor
      // 2ae: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b6: iload 43
      // 2b8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2bb: sipush 10317
      // 2be: ldc2_w 8010599827611472695
      // 2c1: lload 4
      // 2c3: lxor
      // 2c4: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cc: aload 38
      // 2ce: lload 18
      // 2d0: bipush 1
      // 2d1: anewarray 24
      // 2d4: dup_x2
      // 2d5: dup_x2
      // 2d6: pop
      // 2d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2da: bipush 0
      // 2db: swap
      // 2dc: aastore
      // 2dd: ldc2_w -4858737244390457213
      // 2e0: lload 4
      // 2e2: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ea: sipush 25149
      // 2ed: ldc2_w 396519070120810826
      // 2f0: lload 4
      // 2f2: lxor
      // 2f3: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fb: aload 37
      // 2fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 300: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 303: invokespecial com/zelix/u9.<init> (Ljava/lang/String;)V
      // 306: athrow
      // 307: ldc2_w -4883131409867724689
      // 30a: lload 4
      // 30c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: athrow
      // 312: iload 43
      // 314: lload 26
      // 316: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 319: astore 44
      // 31b: aload 1
      // 31c: bipush 0
      // 31d: aload 44
      // 31f: bipush 0
      // 320: iload 43
      // 322: iload 42
      // 324: isub
      // 325: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 328: iload 42
      // 32a: iload 36
      // 32c: lload 4
      // 32e: lconst_0
      // 32f: lcmp
      // 330: iflt 36e
      // 333: ifne 36c
      // 336: bipush 1
      // 337: if_icmpne 36a
      // 33a: goto 348
      // 33d: ldc2_w -4883131409867724689
      // 340: lload 4
      // 342: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: athrow
      // 348: aload 44
      // 34a: aload 44
      // 34c: arraylength
      // 34d: bipush 1
      // 34e: isub
      // 34f: iload 28
      // 351: i2b
      // 352: iload 29
      // 354: iload 30
      // 356: aload 41
      // 358: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 35b: aastore
      // 35c: goto 36a
      // 35f: ldc2_w -4883131409867724689
      // 362: lload 4
      // 364: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: athrow
      // 36a: iload 9
      // 36c: iload 36
      // 36e: ifne 397
      // 371: ifeq 484
      // 374: goto 382
      // 377: ldc2_w -4883131409867724689
      // 37a: lload 4
      // 37c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 381: athrow
      // 382: aload 38
      // 384: lload 20
      // 386: invokevirtual com/zelix/xu.O (J)Z
      // 389: goto 397
      // 38c: ldc2_w -4883131409867724689
      // 38f: lload 4
      // 391: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 396: athrow
      // 397: ifeq 484
      // 39a: aload 1
      // 39b: iload 2
      // 39c: iload 40
      // 39e: isub
      // 39f: bipush 1
      // 3a0: isub
      // 3a1: aaload
      // 3a2: astore 45
      // 3a4: aload 45
      // 3a6: invokevirtual com/zelix/v7.M ()Lcom/zelix/v7;
      // 3a9: astore 46
      // 3ab: aload 3
      // 3ac: arraylength
      // 3ad: istore 47
      // 3af: iload 47
      // 3b1: lload 26
      // 3b3: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 3b6: astore 48
      // 3b8: aload 3
      // 3b9: bipush 0
      // 3ba: aload 48
      // 3bc: bipush 0
      // 3bd: iload 47
      // 3bf: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3c2: bipush 0
      // 3c3: istore 49
      // 3c5: iload 49
      // 3c7: iload 43
      // 3c9: if_icmpge 420
      // 3cc: aload 44
      // 3ce: iload 49
      // 3d0: iload 36
      // 3d2: ifne 415
      // 3d5: aaload
      // 3d6: aload 45
      // 3d8: lload 4
      // 3da: lconst_0
      // 3db: lcmp
      // 3dc: iflt 44b
      // 3df: iload 36
      // 3e1: ifne 44b
      // 3e4: goto 3f2
      // 3e7: ldc2_w -4883131409867724689
      // 3ea: lload 4
      // 3ec: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f1: athrow
      // 3f2: if_acmpne 418
      // 3f5: goto 403
      // 3f8: ldc2_w -4883131409867724689
      // 3fb: lload 4
      // 3fd: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: athrow
      // 403: aload 44
      // 405: iload 49
      // 407: goto 415
      // 40a: ldc2_w -4883131409867724689
      // 40d: lload 4
      // 40f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: athrow
      // 415: aload 46
      // 417: aastore
      // 418: iinc 49 1
      // 41b: iload 36
      // 41d: ifeq 3c5
      // 420: bipush 0
      // 421: lload 4
      // 423: lconst_0
      // 424: lcmp
      // 425: ifle 41d
      // 428: istore 49
      // 42a: iload 49
      // 42c: iload 47
      // 42e: if_icmpge 46b
      // 431: aload 48
      // 433: iload 49
      // 435: iload 36
      // 437: ifne 460
      // 43a: aaload
      // 43b: aload 45
      // 43d: goto 44b
      // 440: ldc2_w -4883131409867724689
      // 443: lload 4
      // 445: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44a: athrow
      // 44b: if_acmpne 463
      // 44e: aload 48
      // 450: iload 49
      // 452: goto 460
      // 455: ldc2_w -4883131409867724689
      // 458: lload 4
      // 45a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: athrow
      // 460: aload 46
      // 462: aastore
      // 463: iinc 49 1
      // 466: iload 36
      // 468: ifeq 42a
      // 46b: lload 4
      // 46d: lconst_0
      // 46e: lcmp
      // 46f: iflt 431
      // 472: new com/zelix/hz
      // 475: dup
      // 476: aload 44
      // 478: aload 48
      // 47a: lload 24
      // 47c: aload 6
      // 47e: aload 7
      // 480: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 483: areturn
      // 484: new com/zelix/hz
      // 487: dup
      // 488: aload 44
      // 48a: aload 3
      // 48b: lload 24
      // 48d: aload 6
      // 48f: aload 7
      // 491: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 494: areturn
   }

   public final boolean z(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 6462909829008691820
      // 03: lload 1
      // 04: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield com/zelix/i_.X I
      // 0e: iload 3
      // 0f: ifeq 47
      // 12: tableswitch 52 182 185 40 40 40 40
      // 30: ldc2_w 4699761536924898668
      // 33: lload 1
      // 34: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: bipush 1
      // 3b: ireturn
      // 3c: ldc2_w 4699761536924898668
      // 3f: lload 1
      // 40: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 0
      // 47: ireturn
   }

   public boolean a(Object[] param1) {
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
      // 0c: ldc2_w 6221690961620213131
      // 0f: lload 2
      // 10: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/zelix/i_.X I
      // 1b: iload 4
      // 1d: lload 2
      // 1e: lconst_0
      // 1f: lcmp
      // 20: ifle 59
      // 23: ifeq 57
      // 26: sipush 11474
      // 29: ldc2_w 8648305927322506557
      // 2c: lload 2
      // 2d: lxor
      // 2e: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: if_icmpne 70
      // 36: goto 43
      // 39: ldc2_w 5683495449695345291
      // 3c: lload 2
      // 3d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 0
      // 44: getfield com/zelix/i_.k Lcom/zelix/js;
      // 47: instanceof com/zelix/xp
      // 4a: goto 57
      // 4d: ldc2_w 5683495449695345291
      // 50: lload 2
      // 51: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 4
      // 59: ifeq 6d
      // 5c: ifeq 70
      // 5f: goto 6c
      // 62: ldc2_w 5683495449695345291
      // 65: lload 2
      // 66: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   public final void S(Object[] param1) {
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
      // 04: checkcast com/zelix/jf
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/jf
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: ldc2_w -8934589895468429347
      // 1f: lload 2
      // 20: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 50
      // 2d: getfield com/zelix/i_.k Lcom/zelix/js;
      // 30: aload 5
      // 32: if_acmpne 55
      // 35: goto 42
      // 38: ldc2_w -7166981985832990499
      // 3b: lload 2
      // 3c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 50
      // 46: ldc2_w -7166981985832990499
      // 49: lload 2
      // 4a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 4
      // 52: putfield com/zelix/i_.k Lcom/zelix/js;
      // 55: return
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
      // 00b: pop
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 27198363034645
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 21892777563843
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 36930367930982
      // 01f: lxor
      // 020: lstore 8
      // 022: pop2
      // 023: ldc2_w 8497003223765482968
      // 026: lload 2
      // 027: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 10
      // 02e: aload 0
      // 02f: getfield com/zelix/i_.X I
      // 032: iload 10
      // 034: ifne 166
      // 037: lookupswitch 256 16 19 147 20 147 178 147 179 159 180 159 181 159 182 159 183 159 184 161 185 159 186 159 187 147 189 159 192 159 193 159 197 159
      // 0c0: ldc2_w 8265160434887747303
      // 0c3: lload 2
      // 0c4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: bipush 1
      // 0cb: ireturn
      // 0cc: ldc2_w 8265160434887747303
      // 0cf: lload 2
      // 0d0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: ireturn
      // 0d8: aload 0
      // 0d9: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0dc: checkcast com/zelix/xu
      // 0df: astore 11
      // 0e1: aload 11
      // 0e3: lload 2
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: iflt 112
      // 0e9: iload 10
      // 0eb: ifne 112
      // 0ee: lload 6
      // 0f0: invokevirtual com/zelix/xu.m (J)Ljava/lang/String;
      // 0f3: ifnull 135
      // 0f6: goto 103
      // 0f9: ldc2_w 8265160434887747303
      // 0fc: lload 2
      // 0fd: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: aload 11
      // 105: goto 112
      // 108: ldc2_w 8265160434887747303
      // 10b: lload 2
      // 10c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: lload 4
      // 114: invokevirtual com/zelix/xu.A (J)Ljava/util/List;
      // 117: invokeinterface java/util/List.size ()I 1
      // 11c: iload 10
      // 11e: ifne 132
      // 121: ifne 135
      // 124: goto 131
      // 127: ldc2_w 8265160434887747303
      // 12a: lload 2
      // 12b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: bipush 1
      // 132: goto 136
      // 135: bipush 0
      // 136: ireturn
      // 137: bipush 0
      // 138: bipush 1
      // 139: anewarray 12
      // 13c: dup
      // 13d: bipush 0
      // 13e: new java/lang/StringBuilder
      // 141: dup
      // 142: invokespecial java/lang/StringBuilder.<init> ()V
      // 145: sipush 18426
      // 148: ldc2_w 4578783931921560076
      // 14b: lload 2
      // 14c: lxor
      // 14d: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: aload 0
      // 156: getfield com/zelix/i_.X I
      // 159: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 15c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15f: aastore
      // 160: lload 8
      // 162: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 165: bipush 0
      // 166: ireturn
   }

   public void G(short var1, int var2, DataOutputStream var3, int var4) {
      long var5 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var10001 = var5 ^ 0L;
      int var7 = (int)((var5 ^ 0L) >>> 48);
      int var8 = (int)((var5 ^ 0L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      super.G((short)var7, var8, var3, var9);
      var3.writeShort(this.k.E());
   }

   public boolean v(Object[] param1) {
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
      // 00a: istore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/v7
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 2
      // 028: pop
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 66111898833573
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 132141267689246
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 32634434743377
      // 03d: lxor
      // 03e: lstore 11
      // 040: pop2
      // 041: ldc2_w -2604110477085223953
      // 044: lload 5
      // 046: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: istore 13
      // 04d: aload 0
      // 04e: getfield com/zelix/i_.X I
      // 051: iload 13
      // 053: ifne 27c
      // 056: lookupswitch 502 15 19 141 20 141 178 141 179 209 180 154 181 209 182 260 183 260 184 260 185 260 186 260 187 141 189 154 192 207 193 207
      // 0d8: ldc2_w -2556773934157707056
      // 0db: lload 5
      // 0dd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: bipush 0
      // 0e4: ireturn
      // 0e5: ldc2_w -2556773934157707056
      // 0e8: lload 5
      // 0ea: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: iload 3
      // 0f1: iload 13
      // 0f3: lload 5
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 100
      // 0fa: ifne 120
      // 0fd: iload 2
      // 0fe: bipush 1
      // 0ff: isub
      // 100: if_icmplt 123
      // 103: goto 111
      // 106: ldc2_w -2556773934157707056
      // 109: lload 5
      // 10b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: bipush 1
      // 112: goto 120
      // 115: ldc2_w -2556773934157707056
      // 118: lload 5
      // 11a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: goto 124
      // 123: bipush 0
      // 124: ireturn
      // 125: bipush 0
      // 126: ireturn
      // 127: iload 3
      // 128: iload 13
      // 12a: lload 5
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: ifle 135
      // 131: ifne 155
      // 134: iload 2
      // 135: if_icmplt 158
      // 138: goto 146
      // 13b: ldc2_w -2556773934157707056
      // 13e: lload 5
      // 140: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: bipush 1
      // 147: goto 155
      // 14a: ldc2_w -2556773934157707056
      // 14d: lload 5
      // 14f: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: goto 159
      // 158: bipush 0
      // 159: ireturn
      // 15a: aload 0
      // 15b: iload 13
      // 15d: ifne 1c3
      // 160: getfield com/zelix/i_.X I
      // 163: sipush 25561
      // 166: ldc2_w 6500504983012296808
      // 169: lload 5
      // 16b: lxor
      // 16c: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: if_icmpne 1b4
      // 174: goto 182
      // 177: ldc2_w -2556773934157707056
      // 17a: lload 5
      // 17c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: aload 0
      // 183: getfield com/zelix/i_.k Lcom/zelix/js;
      // 186: checkcast com/zelix/jd
      // 189: astore 15
      // 18b: aload 15
      // 18d: lload 9
      // 18f: bipush 1
      // 190: anewarray 24
      // 193: dup_x2
      // 194: dup_x2
      // 195: pop
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: bipush 0
      // 19a: swap
      // 19b: aastore
      // 19c: ldc2_w -4504995126585326952
      // 19f: lload 5
      // 1a1: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: istore 14
      // 1a8: iload 13
      // 1aa: lload 5
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: ifle 1e9
      // 1b1: ifeq 1e8
      // 1b4: aload 0
      // 1b5: goto 1c3
      // 1b8: ldc2_w -2556773934157707056
      // 1bb: lload 5
      // 1bd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: getfield com/zelix/i_.k Lcom/zelix/js;
      // 1c6: checkcast com/zelix/xu
      // 1c9: astore 15
      // 1cb: aload 15
      // 1cd: lload 7
      // 1cf: bipush 1
      // 1d0: anewarray 24
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: ldc2_w -2802645562167582354
      // 1df: lload 5
      // 1e1: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: istore 14
      // 1e8: iload 3
      // 1e9: iload 13
      // 1eb: lload 5
      // 1ed: lconst_0
      // 1ee: lcmp
      // 1ef: iflt 1f9
      // 1f2: ifne 24b
      // 1f5: iload 2
      // 1f6: iload 14
      // 1f8: isub
      // 1f9: if_icmplt 24a
      // 1fc: goto 20a
      // 1ff: ldc2_w -2556773934157707056
      // 202: lload 5
      // 204: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: aload 4
      // 20c: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 20f: sipush 5165
      // 212: ldc2_w 135479355484540912
      // 215: lload 5
      // 217: lxor
      // 218: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 220: iload 13
      // 222: ifne 245
      // 225: goto 233
      // 228: ldc2_w -2556773934157707056
      // 22b: lload 5
      // 22d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: ifne 248
      // 236: goto 244
      // 239: ldc2_w -2556773934157707056
      // 23c: lload 5
      // 23e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: bipush 1
      // 245: goto 249
      // 248: bipush 0
      // 249: ireturn
      // 24a: bipush 0
      // 24b: ireturn
      // 24c: bipush 0
      // 24d: bipush 1
      // 24e: anewarray 12
      // 251: dup
      // 252: bipush 0
      // 253: new java/lang/StringBuilder
      // 256: dup
      // 257: invokespecial java/lang/StringBuilder.<init> ()V
      // 25a: sipush 25749
      // 25d: ldc2_w 4780304715343855437
      // 260: lload 5
      // 262: lxor
      // 263: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: aload 0
      // 26c: getfield com/zelix/i_.X I
      // 26f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 272: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 275: aastore
      // 276: lload 11
      // 278: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 27b: bipush 0
      // 27c: ireturn
   }

   public void h(Object[] param1) {
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
      // 00e: checkcast java/io/PrintWriter
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 102513965841398
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 94237236529450
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 111883434377042
      // 02e: lxor
      // 02f: lstore 10
      // 031: dup2
      // 032: ldc2_w 9522033084411
      // 035: lxor
      // 036: dup2
      // 037: bipush 32
      // 039: lushr
      // 03a: l2i
      // 03b: istore 12
      // 03d: dup2
      // 03e: bipush 32
      // 040: lshl
      // 041: bipush 56
      // 043: lushr
      // 044: l2i
      // 045: istore 13
      // 047: dup2
      // 048: bipush 40
      // 04a: lshl
      // 04b: bipush 40
      // 04d: lushr
      // 04e: l2i
      // 04f: istore 14
      // 051: pop2
      // 052: pop2
      // 053: new java/lang/StringBuilder
      // 056: dup
      // 057: sipush 4979
      // 05a: ldc2_w 4068008448699274038
      // 05d: lload 3
      // 05e: lxor
      // 05f: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: invokespecial java/lang/StringBuilder.<init> (I)V
      // 067: astore 16
      // 069: aload 16
      // 06b: aload 2
      // 06c: ldc2_w -1446051688896854452
      // 06f: lload 3
      // 070: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: pop
      // 076: aload 16
      // 078: aload 2
      // 079: ldc2_w -1446051688896854452
      // 07c: lload 3
      // 07d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: pop
      // 083: ldc2_w -1142121718372861931
      // 086: lload 3
      // 087: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: aload 16
      // 08e: aload 0
      // 08f: iload 12
      // 091: iload 13
      // 093: i2b
      // 094: iload 14
      // 096: bipush 3
      // 097: anewarray 24
      // 09a: dup_x1
      // 09b: swap
      // 09c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09f: bipush 2
      // 0a0: swap
      // 0a1: aastore
      // 0a2: dup_x1
      // 0a3: swap
      // 0a4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a7: bipush 1
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0af: bipush 0
      // 0b0: swap
      // 0b1: aastore
      // 0b2: ldc2_w -636251684499120046
      // 0b5: lload 3
      // 0b6: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: pop
      // 0bf: aload 16
      // 0c1: sipush 4265
      // 0c4: ldc2_w 6872629958573560038
      // 0c7: lload 3
      // 0c8: lxor
      // 0c9: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0d1: pop
      // 0d2: aload 16
      // 0d4: aload 0
      // 0d5: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0d8: lload 8
      // 0da: bipush 1
      // 0db: anewarray 24
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w -1439441735835203503
      // 0ea: lload 3
      // 0eb: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: pop
      // 0f4: istore 15
      // 0f6: aload 0
      // 0f7: lload 10
      // 0f9: bipush 1
      // 0fa: anewarray 24
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w -1388346946909084418
      // 109: lload 3
      // 10a: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: astore 17
      // 111: lload 6
      // 113: aload 17
      // 115: aload 0
      // 116: getfield com/zelix/i_.k Lcom/zelix/js;
      // 119: lload 8
      // 11b: bipush 1
      // 11c: anewarray 24
      // 11f: dup_x2
      // 120: dup_x2
      // 121: pop
      // 122: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 125: bipush 0
      // 126: swap
      // 127: aastore
      // 128: ldc2_w -1439441735835203503
      // 12b: lload 3
      // 12c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: bipush 3
      // 132: anewarray 24
      // 135: dup_x1
      // 136: swap
      // 137: bipush 2
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 1
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 0
      // 146: swap
      // 147: aastore
      // 148: ldc2_w -1214410100789358428
      // 14b: lload 3
      // 14c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: astore 17
      // 153: iload 15
      // 155: ifne 1a2
      // 158: aload 17
      // 15a: invokevirtual java/lang/String.length ()I
      // 15d: ifle 195
      // 160: goto 16d
      // 163: ldc2_w -612900013225581782
      // 166: lload 3
      // 167: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: aload 16
      // 16f: sipush 15952
      // 172: ldc2_w 4328662281327263256
      // 175: lload 3
      // 176: lxor
      // 177: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 17f: pop
      // 180: aload 16
      // 182: aload 17
      // 184: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 187: pop
      // 188: goto 195
      // 18b: ldc2_w -612900013225581782
      // 18e: lload 3
      // 18f: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: aload 5
      // 197: aload 16
      // 199: ldc2_w -1115217303126203474
      // 19c: lload 3
      // 19d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: return
   }

   public final void T(Object[] param1) {
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
      // 04: checkcast com/zelix/xm
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
      // 16: checkcast com/zelix/xm
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w 3749176034057453531
      // 1e: lload 3
      // 1f: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 4f
      // 2c: getfield com/zelix/i_.k Lcom/zelix/js;
      // 2f: aload 5
      // 31: if_acmpne 53
      // 34: goto 41
      // 37: ldc2_w 3210936473484572891
      // 3a: lload 3
      // 3b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 0
      // 42: goto 4f
      // 45: ldc2_w 3210936473484572891
      // 48: lload 3
      // 49: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 2
      // 50: putfield com/zelix/i_.k Lcom/zelix/js;
      // 53: return
   }

   public oz r(Map param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: lstore 5
      // 1a: lload 5
      // 1c: dup2
      // 1d: ldc2_w 46596226632346
      // 20: lxor
      // 21: lstore 7
      // 23: dup2
      // 24: ldc2_w 112878472744304
      // 27: lxor
      // 28: lstore 9
      // 2a: pop2
      // 2b: ldc2_w 8704658504643637502
      // 2e: lload 5
      // 30: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: istore 11
      // 37: aload 0
      // 38: iload 11
      // 3a: ifne 79
      // 3d: getfield com/zelix/i_.X I
      // 40: sipush 11474
      // 43: ldc2_w 8648279800683930743
      // 46: lload 5
      // 48: lxor
      // 49: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: if_icmpne ea
      // 51: goto 5f
      // 54: ldc2_w 9193531549757664193
      // 57: lload 5
      // 59: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield com/zelix/i_.k Lcom/zelix/js;
      // 63: lload 7
      // 65: dup2_x1
      // 66: pop2
      // 67: aload 1
      // 68: invokestatic com/zelix/cf.J (JLjava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
      // 6b: goto 79
      // 6e: ldc2_w 9193531549757664193
      // 71: lload 5
      // 73: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: checkcast com/zelix/js
      // 7c: astore 13
      // 7e: aload 13
      // 80: iload 11
      // 82: ifne b5
      // 85: ifnull a3
      // 88: goto 96
      // 8b: ldc2_w 9193531549757664193
      // 8e: lload 5
      // 90: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: aload 13
      // 98: astore 12
      // 9a: iload 11
      // 9c: iload 2
      // 9d: iflt bc
      // a0: ifeq b7
      // a3: aload 0
      // a4: getfield com/zelix/i_.k Lcom/zelix/js;
      // a7: goto b5
      // aa: ldc2_w 9193531549757664193
      // ad: lload 5
      // af: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: astore 12
      // b7: aload 12
      // b9: invokevirtual com/zelix/js.E ()I
      // bc: sipush 18149
      // bf: ldc2_w 6756265939374198338
      // c2: lload 5
      // c4: lxor
      // c5: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: if_icmpgt e8
      // cd: new com/zelix/io
      // d0: dup
      // d1: aload 0
      // d2: getfield com/zelix/i_.k Lcom/zelix/js;
      // d5: lload 9
      // d7: dup2_x1
      // d8: pop2
      // d9: invokespecial com/zelix/io.<init> (JLcom/zelix/js;)V
      // dc: areturn
      // dd: ldc2_w 9193531549757664193
      // e0: lload 5
      // e2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e7: athrow
      // e8: aconst_null
      // e9: areturn
      // ea: aconst_null
      // eb: areturn
   }

   public boolean g(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 752188044712510019
      // 03: lload 1
      // 04: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield com/zelix/i_.X I
      // 0e: iload 3
      // 0f: lload 1
      // 10: lconst_0
      // 11: lcmp
      // 12: iflt 4a
      // 15: ifne 49
      // 18: sipush 11474
      // 1b: ldc2_w 8648243242104313546
      // 1e: lload 1
      // 1f: lxor
      // 20: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: if_icmpne 61
      // 28: goto 35
      // 2b: ldc2_w 948179231879829884
      // 2e: lload 1
      // 2f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/zelix/i_.k Lcom/zelix/js;
      // 39: instanceof com/zelix/xt
      // 3c: goto 49
      // 3f: ldc2_w 948179231879829884
      // 42: lload 1
      // 43: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: iload 3
      // 4a: ifne 5e
      // 4d: ifeq 61
      // 50: goto 5d
      // 53: ldc2_w 948179231879829884
      // 56: lload 1
      // 57: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: ireturn
   }

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 110204503419190L;
      long var10001 = var2 ^ 62838192416743L;
      int var6 = (int)((var2 ^ 62838192416743L) >>> 32);
      int var7 = (int)((var2 ^ 62838192416743L) << 32 >>> 56);
      int var8 = (int)(var10001 << 40 >>> 40);
      StringBuilder var9 = new StringBuilder();
      byte var10003 = (byte)var7;
      Object[] var10006 = new Object[]{null, null, var8};
      var10006[1] = Integer.valueOf(var10003);
      var10006[0] = var6;
      var9.append(m44.a<"s">(this, var10006, -7550383759637692338L, var2));
      var9.append((char)e<"u">(27151, 5580091176033946199L ^ var2));
      var9.append(m44.a<"s">(this.k, new Object[]{var4}, -8351324275647535027L, var2));
      return var9.toString();
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
      // 0c: ldc2_w -4714861885735356766
      // 0f: lload 2
      // 10: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/zelix/i_.X I
      // 1b: iload 4
      // 1d: ifne 53
      // 20: lookupswitch 50 2 179 38 181 38
      // 3c: ldc2_w -5059329164615864931
      // 3f: lload 2
      // 40: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: ireturn
      // 48: ldc2_w -5059329164615864931
      // 4b: lload 2
      // 4c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
   }

   public boolean u(Object[] param1) {
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
      // 0c: ldc2_w 6583934264900751490
      // 0f: lload 2
      // 10: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/zelix/i_.X I
      // 1b: iload 4
      // 1d: lload 2
      // 1e: lconst_0
      // 1f: lcmp
      // 20: ifle 59
      // 23: ifeq 57
      // 26: sipush 11474
      // 29: ldc2_w 8648252448432560180
      // 2c: lload 2
      // 2d: lxor
      // 2e: invokedynamic u (IJ)I bsm=com/zelix/i_.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: if_icmpne 70
      // 36: goto 43
      // 39: ldc2_w 4888344431443105666
      // 3c: lload 2
      // 3d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 0
      // 44: getfield com/zelix/i_.k Lcom/zelix/js;
      // 47: instanceof com/zelix/xp
      // 4a: goto 57
      // 4d: ldc2_w 4888344431443105666
      // 50: lload 2
      // 51: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 4
      // 59: ifeq 6d
      // 5c: ifeq 70
      // 5f: goto 6c
      // 62: ldc2_w 4888344431443105666
      // 65: lload 2
      // 66: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   public int T(char var1, int var2, char var3) {
      return 3;
   }

   public final void V(Object[] param1) {
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
      // 04: checkcast com/zelix/xt
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/xt
      // 0e: astore 5
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: ldc2_w 4490842495129154958
      // 1e: lload 3
      // 1f: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 4e
      // 2c: getfield com/zelix/i_.k Lcom/zelix/js;
      // 2f: aload 2
      // 30: if_acmpne 53
      // 33: goto 40
      // 36: ldc2_w 2799721076389884558
      // 39: lload 3
      // 3a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: goto 4e
      // 44: ldc2_w 2799721076389884558
      // 47: lload 3
      // 48: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 5
      // 50: putfield com/zelix/i_.k Lcom/zelix/js;
      // 53: return
   }

   private hz w(Object[] param1) {
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
      // 004: checkcast [Lcom/zelix/v7;
      // 007: astore 10
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast [Lcom/zelix/v7;
      // 019: astore 9
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/fb
      // 021: astore 7
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 8
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/lang/Boolean
      // 031: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 034: istore 11
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/lang/Boolean
      // 03d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 040: istore 12
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast com/zelix/loj
      // 049: astore 2
      // 04a: dup
      // 04b: bipush 8
      // 04d: aaload
      // 04e: checkcast java/lang/Long
      // 051: invokevirtual java/lang/Long.longValue ()J
      // 054: lstore 5
      // 056: dup
      // 057: bipush 9
      // 059: aaload
      // 05a: checkcast java/lang/String
      // 05d: astore 4
      // 05f: pop
      // 060: getstatic com/zelix/i_.b J
      // 063: lload 5
      // 065: lxor
      // 066: lstore 5
      // 068: lload 5
      // 06a: dup2
      // 06b: ldc2_w 76815704571117
      // 06e: lxor
      // 06f: lstore 13
      // 071: dup2
      // 072: ldc2_w 25977291740853
      // 075: lxor
      // 076: lstore 15
      // 078: dup2
      // 079: ldc2_w 91280315942920
      // 07c: lxor
      // 07d: lstore 17
      // 07f: dup2
      // 080: ldc2_w 27439219321975
      // 083: lxor
      // 084: lstore 19
      // 086: dup2
      // 087: ldc2_w 113705905336915
      // 08a: lxor
      // 08b: lstore 21
      // 08d: dup2
      // 08e: ldc2_w 37675522397185
      // 091: lxor
      // 092: lstore 23
      // 094: dup2
      // 095: ldc2_w 71128935225026
      // 098: lxor
      // 099: lstore 25
      // 09b: dup2
      // 09c: ldc2_w 96871425872134
      // 09f: lxor
      // 0a0: lstore 27
      // 0a2: dup2
      // 0a3: ldc2_w 139299061457276
      // 0a6: lxor
      // 0a7: dup2
      // 0a8: bipush 56
      // 0aa: lushr
      // 0ab: l2i
      // 0ac: istore 29
      // 0ae: dup2
      // 0af: bipush 8
      // 0b1: lshl
      // 0b2: bipush 32
      // 0b4: lushr
      // 0b5: l2i
      // 0b6: istore 30
      // 0b8: dup2
      // 0b9: bipush 40
      // 0bb: lshl
      // 0bc: bipush 40
      // 0be: lushr
      // 0bf: l2i
      // 0c0: istore 31
      // 0c2: pop2
      // 0c3: dup2
      // 0c4: ldc2_w 28396723784607
      // 0c7: lxor
      // 0c8: dup2
      // 0c9: bipush 8
      // 0cb: lushr
      // 0cc: lstore 32
      // 0ce: dup2
      // 0cf: bipush 56
      // 0d1: lshl
      // 0d2: bipush 56
      // 0d4: lushr
      // 0d5: l2i
      // 0d6: istore 34
      // 0d8: pop2
      // 0d9: dup2
      // 0da: ldc2_w 79176256581320
      // 0dd: lxor
      // 0de: dup2
      // 0df: bipush 32
      // 0e1: lushr
      // 0e2: l2i
      // 0e3: istore 35
      // 0e5: dup2
      // 0e6: bipush 32
      // 0e8: lshl
      // 0e9: bipush 56
      // 0eb: lushr
      // 0ec: l2i
      // 0ed: istore 36
      // 0ef: dup2
      // 0f0: bipush 40
      // 0f2: lshl
      // 0f3: bipush 40
      // 0f5: lushr
      // 0f6: l2i
      // 0f7: istore 37
      // 0f9: pop2
      // 0fa: dup2
      // 0fb: ldc2_w 12451529124846
      // 0fe: lxor
      // 0ff: lstore 38
      // 101: dup2
      // 102: ldc2_w 12493816588340
      // 105: lxor
      // 106: lstore 40
      // 108: pop2
      // 109: new com/zelix/lby
      // 10c: dup
      // 10d: lload 32
      // 10f: aload 4
      // 111: iload 34
      // 113: i2b
      // 114: invokespecial com/zelix/lby.<init> (JLjava/lang/String;B)V
      // 117: astore 43
      // 119: ldc2_w 5099759282427694361
      // 11c: lload 5
      // 11e: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: aload 0
      // 124: getfield com/zelix/i_.k Lcom/zelix/js;
      // 127: checkcast com/zelix/jd
      // 12a: astore 44
      // 12c: istore 42
      // 12e: aload 44
      // 130: lload 38
      // 132: bipush 1
      // 133: anewarray 24
      // 136: dup_x2
      // 137: dup_x2
      // 138: pop
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: bipush 0
      // 13d: swap
      // 13e: aastore
      // 13f: ldc2_w 4874402182276441370
      // 142: lload 5
      // 144: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/j9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: astore 45
      // 14b: aload 45
      // 14d: lload 25
      // 14f: bipush 1
      // 150: anewarray 24
      // 153: dup_x2
      // 154: dup_x2
      // 155: pop
      // 156: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 159: bipush 0
      // 15a: swap
      // 15b: aastore
      // 15c: ldc2_w 6866349938040649171
      // 15f: lload 5
      // 161: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: ldc2_w 5033906049692299101
      // 169: lload 5
      // 16b: invokedynamic o (JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokevirtual com/zelix/tg.equals (Ljava/lang/Object;)Z
      // 173: ifne 202
      // 176: new com/zelix/u9
      // 179: dup
      // 17a: new java/lang/StringBuilder
      // 17d: dup
      // 17e: invokespecial java/lang/StringBuilder.<init> ()V
      // 181: aload 0
      // 182: iload 35
      // 184: iload 36
      // 186: i2b
      // 187: iload 37
      // 189: bipush 3
      // 18a: anewarray 24
      // 18d: dup_x1
      // 18e: swap
      // 18f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 192: bipush 2
      // 193: swap
      // 194: aastore
      // 195: dup_x1
      // 196: swap
      // 197: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19a: bipush 1
      // 19b: swap
      // 19c: aastore
      // 19d: dup_x1
      // 19e: swap
      // 19f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a2: bipush 0
      // 1a3: swap
      // 1a4: aastore
      // 1a5: ldc2_w 6780403286411053409
      // 1a8: lload 5
      // 1aa: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b2: ldc " "
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: aload 45
      // 1b9: lload 25
      // 1bb: bipush 1
      // 1bc: anewarray 24
      // 1bf: dup_x2
      // 1c0: dup_x2
      // 1c1: pop
      // 1c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c5: bipush 0
      // 1c6: swap
      // 1c7: aastore
      // 1c8: ldc2_w 6866349938040649171
      // 1cb: lload 5
      // 1cd: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: ldc2_w 4643376440326200422
      // 1d5: lload 5
      // 1d7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1df: sipush 3328
      // 1e2: ldc2_w 1392485276544537622
      // 1e5: lload 5
      // 1e7: lxor
      // 1e8: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f3: invokespecial com/zelix/u9.<init> (Ljava/lang/String;)V
      // 1f6: athrow
      // 1f7: ldc2_w 6795309534540253721
      // 1fa: lload 5
      // 1fc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: aload 44
      // 204: lload 19
      // 206: bipush 1
      // 207: anewarray 24
      // 20a: dup_x2
      // 20b: dup_x2
      // 20c: pop
      // 20d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 210: bipush 0
      // 211: swap
      // 212: aastore
      // 213: ldc2_w 6760501506806352408
      // 216: lload 5
      // 218: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/js; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: astore 46
      // 21f: aload 44
      // 221: lload 21
      // 223: bipush 1
      // 224: anewarray 24
      // 227: dup_x2
      // 228: dup_x2
      // 229: pop
      // 22a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22d: bipush 0
      // 22e: swap
      // 22f: aastore
      // 230: ldc2_w 6907944380410677277
      // 233: lload 5
      // 235: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: astore 47
      // 23c: lload 27
      // 23e: aload 47
      // 240: invokestatic com/zelix/js.a (JLcom/zelix/xb;)Ljava/util/List;
      // 243: astore 48
      // 245: aload 48
      // 247: invokeinterface java/util/List.size ()I 1
      // 24c: istore 49
      // 24e: aload 47
      // 250: lload 40
      // 252: invokestatic com/zelix/js.T (Lcom/zelix/xb;J)Ljava/lang/String;
      // 255: astore 50
      // 257: aload 50
      // 259: ifnonnull 26b
      // 25c: bipush 0
      // 25d: goto 26c
      // 260: ldc2_w 6795309534540253721
      // 263: lload 5
      // 265: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: athrow
      // 26b: bipush 1
      // 26c: istore 51
      // 26e: iload 11
      // 270: iload 42
      // 272: ifeq 3c6
      // 275: ifeq 3bf
      // 278: goto 286
      // 27b: ldc2_w 6795309534540253721
      // 27e: lload 5
      // 280: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: athrow
      // 286: bipush 0
      // 287: istore 52
      // 289: iload 52
      // 28b: iload 49
      // 28d: if_icmpge 3bf
      // 290: aload 10
      // 292: iload 3
      // 293: iload 49
      // 295: isub
      // 296: iload 52
      // 298: iadd
      // 299: aaload
      // 29a: astore 53
      // 29c: aload 48
      // 29e: iload 52
      // 2a0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2a5: iload 29
      // 2a7: i2b
      // 2a8: swap
      // 2a9: iload 30
      // 2ab: swap
      // 2ac: iload 31
      // 2ae: swap
      // 2af: checkcast java/lang/String
      // 2b2: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 2b5: astore 54
      // 2b7: aload 53
      // 2b9: aload 54
      // 2bb: lload 17
      // 2bd: aload 2
      // 2be: aload 4
      // 2c0: bipush 5
      // 2c1: anewarray 24
      // 2c4: dup_x1
      // 2c5: swap
      // 2c6: bipush 4
      // 2c7: swap
      // 2c8: aastore
      // 2c9: dup_x1
      // 2ca: swap
      // 2cb: bipush 3
      // 2cc: swap
      // 2cd: aastore
      // 2ce: dup_x2
      // 2cf: dup_x2
      // 2d0: pop
      // 2d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d4: bipush 2
      // 2d5: swap
      // 2d6: aastore
      // 2d7: dup_x1
      // 2d8: swap
      // 2d9: bipush 1
      // 2da: swap
      // 2db: aastore
      // 2dc: dup_x1
      // 2dd: swap
      // 2de: bipush 0
      // 2df: swap
      // 2e0: aastore
      // 2e1: ldc2_w 5115973572375329352
      // 2e4: lload 5
      // 2e6: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: iload 42
      // 2ed: lload 5
      // 2ef: lconst_0
      // 2f0: lcmp
      // 2f1: ifle 3cf
      // 2f4: ifeq 3cd
      // 2f7: ifne 3b2
      // 2fa: goto 308
      // 2fd: ldc2_w 6795309534540253721
      // 300: lload 5
      // 302: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: athrow
      // 308: new com/zelix/u9
      // 30b: dup
      // 30c: new java/lang/StringBuilder
      // 30f: dup
      // 310: invokespecial java/lang/StringBuilder.<init> ()V
      // 313: sipush 32185
      // 316: ldc2_w 3551280183472055484
      // 319: lload 5
      // 31b: lxor
      // 31c: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 324: aload 53
      // 326: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 329: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32c: sipush 8374
      // 32f: ldc2_w 1933994071294556592
      // 332: lload 5
      // 334: lxor
      // 335: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33d: aload 54
      // 33f: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 342: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 345: sipush 9486
      // 348: ldc2_w 5433088731487222787
      // 34b: lload 5
      // 34d: lxor
      // 34e: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 356: iload 52
      // 358: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 35b: sipush 27034
      // 35e: ldc2_w 9137190298276786323
      // 361: lload 5
      // 363: lxor
      // 364: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36c: aload 47
      // 36e: lload 15
      // 370: bipush 1
      // 371: anewarray 24
      // 374: dup_x2
      // 375: dup_x2
      // 376: pop
      // 377: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37a: bipush 0
      // 37b: swap
      // 37c: aastore
      // 37d: ldc2_w 6822931051362209923
      // 380: lload 5
      // 382: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38a: sipush 29329
      // 38d: ldc2_w 1570183562317589402
      // 390: lload 5
      // 392: lxor
      // 393: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39b: aload 43
      // 39d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3a3: invokespecial com/zelix/u9.<init> (Ljava/lang/String;)V
      // 3a6: athrow
      // 3a7: ldc2_w 6795309534540253721
      // 3aa: lload 5
      // 3ac: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: athrow
      // 3b2: goto 3b7
      // 3b5: astore 55
      // 3b7: iinc 52 1
      // 3ba: iload 42
      // 3bc: ifne 289
      // 3bf: iload 3
      // 3c0: iload 49
      // 3c2: isub
      // 3c3: iload 51
      // 3c5: iadd
      // 3c6: istore 52
      // 3c8: iload 52
      // 3ca: iload 51
      // 3cc: isub
      // 3cd: iload 42
      // 3cf: ifeq 42e
      // 3d2: ifge 42c
      // 3d5: goto 3e3
      // 3d8: ldc2_w 6795309534540253721
      // 3db: lload 5
      // 3dd: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: athrow
      // 3e3: new com/zelix/u9
      // 3e6: dup
      // 3e7: new java/lang/StringBuilder
      // 3ea: dup
      // 3eb: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ee: sipush 19289
      // 3f1: ldc2_w 907844403748688449
      // 3f4: lload 5
      // 3f6: lxor
      // 3f7: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ff: iload 52
      // 401: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 404: sipush 25149
      // 407: ldc2_w 396558798739274556
      // 40a: lload 5
      // 40c: lxor
      // 40d: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 412: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 415: aload 43
      // 417: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 41a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41d: invokespecial com/zelix/u9.<init> (Ljava/lang/String;)V
      // 420: athrow
      // 421: ldc2_w 6795309534540253721
      // 424: lload 5
      // 426: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42b: athrow
      // 42c: iload 52
      // 42e: lload 23
      // 430: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 433: astore 53
      // 435: aload 10
      // 437: bipush 0
      // 438: iload 42
      // 43a: lload 5
      // 43c: lconst_0
      // 43d: lcmp
      // 43e: iflt 47b
      // 441: ifeq 478
      // 444: aload 53
      // 446: bipush 0
      // 447: iload 52
      // 449: iload 51
      // 44b: isub
      // 44c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 44f: iload 51
      // 451: bipush 1
      // 452: if_icmpne 485
      // 455: goto 463
      // 458: ldc2_w 6795309534540253721
      // 45b: lload 5
      // 45d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 462: athrow
      // 463: aload 53
      // 465: aload 53
      // 467: arraylength
      // 468: bipush 1
      // 469: isub
      // 46a: goto 478
      // 46d: ldc2_w 6795309534540253721
      // 470: lload 5
      // 472: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 477: athrow
      // 478: iload 29
      // 47a: i2b
      // 47b: iload 30
      // 47d: iload 31
      // 47f: aload 50
      // 481: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 484: aastore
      // 485: new com/zelix/hz
      // 488: dup
      // 489: aload 53
      // 48b: aload 9
      // 48d: lload 13
      // 48f: aload 7
      // 491: aload 8
      // 493: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 496: areturn
   }

   public js s(long var1) {
      return this.k;
   }

   public void H(DataOutputStream param1, Map param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 3
      // 01: dup2
      // 02: ldc2_w 109183790174989
      // 05: lxor
      // 06: dup2
      // 07: bipush 48
      // 09: lushr
      // 0a: l2i
      // 0b: istore 5
      // 0d: dup2
      // 0e: bipush 16
      // 10: lshl
      // 11: bipush 32
      // 13: lushr
      // 14: l2i
      // 15: istore 6
      // 17: dup2
      // 18: bipush 48
      // 1a: lshl
      // 1b: bipush 48
      // 1d: lushr
      // 1e: l2i
      // 1f: istore 7
      // 21: pop2
      // 22: pop2
      // 23: ldc2_w 6106537255087152994
      // 26: lload 3
      // 27: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: iload 5
      // 2f: i2s
      // 30: iload 6
      // 32: aload 1
      // 33: iload 7
      // 35: invokespecial com/zelix/oz.G (SILjava/io/DataOutputStream;I)V
      // 38: istore 8
      // 3a: aload 2
      // 3b: aload 0
      // 3c: getfield com/zelix/i_.k Lcom/zelix/js;
      // 3f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 44: checkcast com/zelix/js
      // 47: astore 9
      // 49: iload 8
      // 4b: ifeq 76
      // 4e: aload 9
      // 50: ifnull 81
      // 53: goto 60
      // 56: ldc2_w 5491842119061133410
      // 59: lload 3
      // 5a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 1
      // 61: aload 9
      // 63: invokevirtual com/zelix/js.E ()I
      // 66: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 69: goto 76
      // 6c: ldc2_w 5491842119061133410
      // 6f: lload 3
      // 70: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: lload 3
      // 77: lconst_0
      // 78: lcmp
      // 79: ifle 8c
      // 7c: iload 8
      // 7e: ifne 99
      // 81: aload 1
      // 82: aload 0
      // 83: getfield com/zelix/i_.k Lcom/zelix/js;
      // 86: invokevirtual com/zelix/js.E ()I
      // 89: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 8c: goto 99
      // 8f: ldc2_w 5491842119061133410
      // 92: lload 3
      // 93: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: return
   }

   public final boolean e(long var1, int var3) {
      return true;
   }

   public boolean M(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -4121761074631209712
      // 03: lload 1
      // 04: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield com/zelix/i_.X I
      // 0e: iload 3
      // 0f: ifeq 47
      // 12: tableswitch 52 178 181 40 40 40 40
      // 30: ldc2_w -2430635186844513776
      // 33: lload 1
      // 34: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: bipush 1
      // 3b: ireturn
      // 3c: ldc2_w -2430635186844513776
      // 3f: lload 1
      // 40: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 0
      // 47: ireturn
   }

   public final boolean S(Object[] param1) {
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
      // 00e: ldc2_w 81224219859039
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 18364091946416
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 135930187418874
      // 01f: lxor
      // 020: lstore 8
      // 022: pop2
      // 023: ldc2_w 4284947856774443844
      // 026: lload 2
      // 027: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 10
      // 02e: aload 0
      // 02f: getfield com/zelix/i_.X I
      // 032: iload 10
      // 034: ifne 160
      // 037: lookupswitch 250 16 19 147 20 147 178 147 179 159 180 147 181 159 182 161 183 161 184 161 185 161 186 196 187 147 189 147 192 159 193 147 197 147
      // 0c0: ldc2_w 4336937483530381435
      // 0c3: lload 2
      // 0c4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: bipush 1
      // 0cb: ireturn
      // 0cc: ldc2_w 4336937483530381435
      // 0cf: lload 2
      // 0d0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: ireturn
      // 0d8: aload 0
      // 0d9: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0dc: checkcast com/zelix/xu
      // 0df: astore 11
      // 0e1: aload 11
      // 0e3: lload 4
      // 0e5: invokevirtual com/zelix/xu.m (J)Ljava/lang/String;
      // 0e8: ifnull 0f9
      // 0eb: bipush 1
      // 0ec: goto 0fa
      // 0ef: ldc2_w 4336937483530381435
      // 0f2: lload 2
      // 0f3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: bipush 0
      // 0fa: ireturn
      // 0fb: aload 0
      // 0fc: getfield com/zelix/i_.k Lcom/zelix/js;
      // 0ff: checkcast com/zelix/jd
      // 102: astore 12
      // 104: aload 12
      // 106: lload 6
      // 108: bipush 1
      // 109: anewarray 24
      // 10c: dup_x2
      // 10d: dup_x2
      // 10e: pop
      // 10f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112: bipush 0
      // 113: swap
      // 114: aastore
      // 115: ldc2_w 4465256124779476274
      // 118: lload 2
      // 119: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: ifnull 12f
      // 121: bipush 1
      // 122: goto 130
      // 125: ldc2_w 4336937483530381435
      // 128: lload 2
      // 129: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: bipush 0
      // 130: ireturn
      // 131: bipush 0
      // 132: bipush 1
      // 133: anewarray 12
      // 136: dup
      // 137: bipush 0
      // 138: new java/lang/StringBuilder
      // 13b: dup
      // 13c: invokespecial java/lang/StringBuilder.<init> ()V
      // 13f: sipush 25749
      // 142: ldc2_w 4780408007246421990
      // 145: lload 2
      // 146: lxor
      // 147: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: aload 0
      // 150: getfield com/zelix/i_.X I
      // 153: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 156: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 159: aastore
      // 15a: lload 8
      // 15c: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 15f: bipush 0
      // 160: ireturn
   }

   public boolean Y(long param1, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 127669014781140
      // 005: lxor
      // 006: lstore 5
      // 008: dup2
      // 009: ldc2_w 52858886721903
      // 00c: lxor
      // 00d: lstore 7
      // 00f: dup2
      // 010: ldc2_w 94093767828000
      // 013: lxor
      // 014: lstore 9
      // 016: pop2
      // 017: ldc2_w 6173625216586931614
      // 01a: lload 1
      // 01b: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: istore 11
      // 022: aload 0
      // 023: getfield com/zelix/i_.X I
      // 026: iload 11
      // 028: ifne 1f7
      // 02b: lookupswitch 413 15 19 139 20 139 178 139 179 202 180 151 181 202 182 251 183 251 184 251 185 251 186 332 187 139 189 151 192 151 193 151
      // 0ac: ldc2_w 5977907945272624801
      // 0af: lload 1
      // 0b0: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: bipush 0
      // 0b7: ireturn
      // 0b8: ldc2_w 5977907945272624801
      // 0bb: lload 1
      // 0bc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: iload 3
      // 0c3: iload 11
      // 0c5: lload 1
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: ifle 0d2
      // 0cb: ifne 0f0
      // 0ce: iload 4
      // 0d0: bipush 1
      // 0d1: isub
      // 0d2: if_icmplt 0f3
      // 0d5: goto 0e2
      // 0d8: ldc2_w 5977907945272624801
      // 0db: lload 1
      // 0dc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: bipush 1
      // 0e3: goto 0f0
      // 0e6: ldc2_w 5977907945272624801
      // 0e9: lload 1
      // 0ea: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: goto 0f4
      // 0f3: bipush 0
      // 0f4: ireturn
      // 0f5: iload 3
      // 0f6: iload 11
      // 0f8: lload 1
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 103
      // 0fe: ifne 121
      // 101: iload 4
      // 103: if_icmplt 124
      // 106: goto 113
      // 109: ldc2_w 5977907945272624801
      // 10c: lload 1
      // 10d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: bipush 1
      // 114: goto 121
      // 117: ldc2_w 5977907945272624801
      // 11a: lload 1
      // 11b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: goto 125
      // 124: bipush 0
      // 125: ireturn
      // 126: iload 3
      // 127: iload 11
      // 129: lload 1
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 154
      // 12f: ifne 172
      // 132: iload 4
      // 134: aload 0
      // 135: getfield com/zelix/i_.k Lcom/zelix/js;
      // 138: checkcast com/zelix/xu
      // 13b: lload 5
      // 13d: bipush 1
      // 13e: anewarray 24
      // 141: dup_x2
      // 142: dup_x2
      // 143: pop
      // 144: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 147: bipush 0
      // 148: swap
      // 149: aastore
      // 14a: ldc2_w 6298926779693641503
      // 14d: lload 1
      // 14e: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: isub
      // 154: if_icmplt 175
      // 157: goto 164
      // 15a: ldc2_w 5977907945272624801
      // 15d: lload 1
      // 15e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: bipush 1
      // 165: goto 172
      // 168: ldc2_w 5977907945272624801
      // 16b: lload 1
      // 16c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: goto 176
      // 175: bipush 0
      // 176: ireturn
      // 177: iload 3
      // 178: iload 11
      // 17a: lload 1
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: iflt 1a5
      // 180: ifne 1c3
      // 183: iload 4
      // 185: aload 0
      // 186: getfield com/zelix/i_.k Lcom/zelix/js;
      // 189: checkcast com/zelix/jd
      // 18c: lload 7
      // 18e: bipush 1
      // 18f: anewarray 24
      // 192: dup_x2
      // 193: dup_x2
      // 194: pop
      // 195: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 198: bipush 0
      // 199: swap
      // 19a: aastore
      // 19b: ldc2_w 5695438280132955369
      // 19e: lload 1
      // 19f: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: isub
      // 1a5: if_icmplt 1c6
      // 1a8: goto 1b5
      // 1ab: ldc2_w 5977907945272624801
      // 1ae: lload 1
      // 1af: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: bipush 1
      // 1b6: goto 1c3
      // 1b9: ldc2_w 5977907945272624801
      // 1bc: lload 1
      // 1bd: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: goto 1c7
      // 1c6: bipush 0
      // 1c7: ireturn
      // 1c8: bipush 0
      // 1c9: bipush 1
      // 1ca: anewarray 12
      // 1cd: dup
      // 1ce: bipush 0
      // 1cf: new java/lang/StringBuilder
      // 1d2: dup
      // 1d3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d6: sipush 25749
      // 1d9: ldc2_w 4780366435669602620
      // 1dc: lload 1
      // 1dd: lxor
      // 1de: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/i_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e6: aload 0
      // 1e7: getfield com/zelix/i_.X I
      // 1ea: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f0: aastore
      // 1f1: lload 9
      // 1f3: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 1f6: bipush 0
      // 1f7: ireturn
   }

   static {
      long var11 = b ^ 114872833453259L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[25];
      int var18 = 0;
      String var17 = "i\u0000äë¹¸\u0080Ñ4\u0002\u0083$\u0083¯A\u0007\u0010¸¿Þ\u0017`à½`G±\u0089J\u0017el\u0088@\u0098$¾XJÝð}7ö5\u008a¸\u0098 \u001aÿn\u0099Ý9bhÓÃ×L\u0003\u0003®\u0017OÄq$#~)xÎtJû3Wï\u008b \u001d\u008c¯Q/r\u0086\u0081vmÔ}qJÙa8%\"g \u009e\u00192\u0092}\u0096\u001eãú3\u0095\u0003ÝÐwríy\u000b\\E0L0¼,8ç\u007fÛ(QÀì\u0096®¢\u0005\u0086üü\u001aW\u0089j#Z¬\u0099iÎò@²Æ¯©ÜöJ-\u0014DR £/\u0086ÃÑÞ#\u00ad°\u0014\u0086³àú\u008có¥û)KÛóäÈý\u0001ð\u0085è/c÷«¸ÈXríJÄ\u0003WÆ\u0097ROHT\u001b1CDH>À\u0092±JëhN1\u001fÓ\u0085±\u008b\u00964\u0082\u0007«'yö\u0000¿íÚ×P*óNûÏ»\u0017ï»\u009es¸ðð\u009c\u009bOkÃáñl[\u0015ª\u0015H\u0085\u0084®e\u001etÊ\"#`\u008c2³ÞX{\u008c@â)s\fAIËiq¡?\u0010\u0083\u0084®PBxª¬\u0013Ö\u001d.6Ô\u00ad^p\u0016sÉ=°¤)\u0001`\u0017Þj\u0015¹Ä%Ì\u0011 |XcÄ\u001b\u008d\u0006 Í¹u\u008fñd¶,8:w\u0093/\u0019=\u0085\n\r\u009a\u001fm¿\u001f¡'s\u001a¤\u0081ù\u000b\u0085T¾I§Üh£\u00056<\b,/\u008eQÀê\u00adWZát\u0011Y½ÚÄPýå-¨ª D\u0003ö\u0083éTýL\u0010\u0095ÂÑÀ\u0080ö{&£u«þ}æ\u007f+\u009a\u0081Úå\u00adbú \u0088¤¸6o\u0085ÇÙûøû\u001d\u000e\u000bå\u0093óÀ\u000fáÅDÁ46ó\u0084B\u0014vX¾ Upjuï\u0015\u0011\u0086\u008dÿÃ\u001d\u0004ÍyØ«ì\u0086U~\u0091s¡\u008eâÏ\u0084<<ÆÀ\u0010\u0091%â\u0018\u0090ñ\u001f=[\u009eÄ\u0017ÓNeÜ uéã\u0089î«³\u001d¨Ë§l¾\u009c×_ÀBØt´pR÷9ÞGÀ÷ã¼»\u0018Lyãò}HQE×ô´\u008af\u008b\u008a4\u001ex'K\u0017r\u009a£ ÑaHW`\u0017©Ïç\u0091\u0084fé\u000e:Û\u0013D¸©\u008d¯u¸ÞÝ8Û\u0013ï\u0094 \u00105M?TùKe¨3#UV¿ÜJ'\u0010\u009f¿~\u008e¸è\u001c{\u009d*\u0098\u0014Æ\u0082\u0080C Øi¸@*D--í\n¨«ý»¬!(\u0092d\u0015\u009d\u00ad\u009c-Ë¨\u0018:ÇÎçÇ\u0010ýì[\u0086&¼\u0099)\u008aÜ1WErkr z¾\u0084Â\u009d0aB6û4 \u0081nµk\u0007»üÿG\u0099#Æ\u0012ñ\u0006lb\u008c\u008e<(q%\u0010Ä\u009e\u00024\u001b\\g\\^S\u0090$'$ïò{y¿NÇ<DI6\u001cìÈ\u0012;Îÿ½×ñÛï\u0010¶ÝÁ\u0085Â*$<\u000bôVpÍ\u000b»T\u0010_vÂ|\u0083\u0006ÏÁ\u0097Oáð¼ê¯6";
      int var19 = "i\u0000äë¹¸\u0080Ñ4\u0002\u0083$\u0083¯A\u0007\u0010¸¿Þ\u0017`à½`G±\u0089J\u0017el\u0088@\u0098$¾XJÝð}7ö5\u008a¸\u0098 \u001aÿn\u0099Ý9bhÓÃ×L\u0003\u0003®\u0017OÄq$#~)xÎtJû3Wï\u008b \u001d\u008c¯Q/r\u0086\u0081vmÔ}qJÙa8%\"g \u009e\u00192\u0092}\u0096\u001eãú3\u0095\u0003ÝÐwríy\u000b\\E0L0¼,8ç\u007fÛ(QÀì\u0096®¢\u0005\u0086üü\u001aW\u0089j#Z¬\u0099iÎò@²Æ¯©ÜöJ-\u0014DR £/\u0086ÃÑÞ#\u00ad°\u0014\u0086³àú\u008có¥û)KÛóäÈý\u0001ð\u0085è/c÷«¸ÈXríJÄ\u0003WÆ\u0097ROHT\u001b1CDH>À\u0092±JëhN1\u001fÓ\u0085±\u008b\u00964\u0082\u0007«'yö\u0000¿íÚ×P*óNûÏ»\u0017ï»\u009es¸ðð\u009c\u009bOkÃáñl[\u0015ª\u0015H\u0085\u0084®e\u001etÊ\"#`\u008c2³ÞX{\u008c@â)s\fAIËiq¡?\u0010\u0083\u0084®PBxª¬\u0013Ö\u001d.6Ô\u00ad^p\u0016sÉ=°¤)\u0001`\u0017Þj\u0015¹Ä%Ì\u0011 |XcÄ\u001b\u008d\u0006 Í¹u\u008fñd¶,8:w\u0093/\u0019=\u0085\n\r\u009a\u001fm¿\u001f¡'s\u001a¤\u0081ù\u000b\u0085T¾I§Üh£\u00056<\b,/\u008eQÀê\u00adWZát\u0011Y½ÚÄPýå-¨ª D\u0003ö\u0083éTýL\u0010\u0095ÂÑÀ\u0080ö{&£u«þ}æ\u007f+\u009a\u0081Úå\u00adbú \u0088¤¸6o\u0085ÇÙûøû\u001d\u000e\u000bå\u0093óÀ\u000fáÅDÁ46ó\u0084B\u0014vX¾ Upjuï\u0015\u0011\u0086\u008dÿÃ\u001d\u0004ÍyØ«ì\u0086U~\u0091s¡\u008eâÏ\u0084<<ÆÀ\u0010\u0091%â\u0018\u0090ñ\u001f=[\u009eÄ\u0017ÓNeÜ uéã\u0089î«³\u001d¨Ë§l¾\u009c×_ÀBØt´pR÷9ÞGÀ÷ã¼»\u0018Lyãò}HQE×ô´\u008af\u008b\u008a4\u001ex'K\u0017r\u009a£ ÑaHW`\u0017©Ïç\u0091\u0084fé\u000e:Û\u0013D¸©\u008d¯u¸ÞÝ8Û\u0013ï\u0094 \u00105M?TùKe¨3#UV¿ÜJ'\u0010\u009f¿~\u008e¸è\u001c{\u009d*\u0098\u0014Æ\u0082\u0080C Øi¸@*D--í\n¨«ý»¬!(\u0092d\u0015\u009d\u00ad\u009c-Ë¨\u0018:ÇÎçÇ\u0010ýì[\u0086&¼\u0099)\u008aÜ1WErkr z¾\u0084Â\u009d0aB6û4 \u0081nµk\u0007»üÿG\u0099#Æ\u0012ñ\u0006lb\u008c\u008e<(q%\u0010Ä\u009e\u00024\u001b\\g\\^S\u0090$'$ïò{y¿NÇ<DI6\u001cìÈ\u0012;Îÿ½×ñÛï\u0010¶ÝÁ\u0085Â*$<\u000bôVpÍ\u000b»T\u0010_vÂ|\u0083\u0006ÏÁ\u0097Oáð¼ê¯6"
         .length();
      char var16 = 16;
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
                     d = var20;
                     e = new String[25];
                     t = new HashMap(13);
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
                     String var4 = "Å¹\u009bóÔ\u0019\u0011\u009af÷æðg$5ú'|\u001b\u0092øW'¶\u000eÈù\u008c·OOöC\u000b\t\u0098cØ\u0016U\f¥aSöì¦\u0000ëT\u008a§..$à\u0000\u0002\u0087fI@È|";
                     int var5 = "Å¹\u009bóÔ\u0019\u0011\u009af÷æðg$5ú'|\u001b\u0092øW'¶\u000eÈù\u008c·OOöC\u000b\t\u0098cØ\u0016U\f¥aSöì¦\u0000ëT\u008a§..$à\u0000\u0002\u0087fI@È|"
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
                                    m = var6;
                                    n = new Integer[10];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "3q¶-G3¤E\u009c>ûÙlø\\¨";
                                 var5 = "3q¶-G3¤E\u009c>ûÙlø\\¨".length();
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

                  var17 = "¨ª\b\u0083l\u00adI \u001b\u0093\u0081qht-\u0017>&ðmZEÃ\"¯·e.8jìõ\u008cº-hnªËýHºz\u008a=I×ÒF÷Ôâ§d¼\b\u009d\u0099IÄª\u0015¸\u0011Èå\u0017¬Yä\u0010\u0010ÚfÃE\u0097û\u008c9¡\u0016\u008a\u0086\u0002\u0096|\u0085\u0083CyWÔ9B¶~\u0093>õ(ôTî\u00ad±ÕÛI5\fëh";
                  var19 = "¨ª\b\u0083l\u00adI \u001b\u0093\u0081qht-\u0017>&ðmZEÃ\"¯·e.8jìõ\u008cº-hnªËýHºz\u008a=I×ÒF÷Ôâ§d¼\b\u009d\u0099IÄª\u0015¸\u0011Èå\u0017¬Yä\u0010\u0010ÚfÃE\u0097û\u008c9¡\u0016\u008a\u0086\u0002\u0096|\u0085\u0083CyWÔ9B¶~\u0093>õ(ôTî\u00ad±ÕÛI5\fëh"
                     .length();
                  var16 = '(';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22188;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/i_", var10);
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
         throw new RuntimeException("com/zelix/i_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26322;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/i_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
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
         throw new RuntimeException("com/zelix/i_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
