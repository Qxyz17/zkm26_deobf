package com.zelix;

import java.io.IOException;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dj implements Serializable {
   public static final String b;
   private static final Comparator C;
   private static final Comparator X;
   private static final long a = ess.a(-4562729200580942775L, 8639180456743486207L, MethodHandles.lookup().lookupClass()).a(125343807751868L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public static long R(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/hy
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_yv
      // 019: astore 1
      // 01a: pop
      // 01b: getstatic com/zelix/dj.a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 57573245237351
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 57726938718990
      // 02d: lxor
      // 02e: lstore 7
      // 030: dup2
      // 031: ldc2_w 75229473287345
      // 034: lxor
      // 035: lstore 9
      // 037: dup2
      // 038: ldc2_w 6025167316953
      // 03b: lxor
      // 03c: lstore 11
      // 03e: dup2
      // 03f: ldc2_w 81082633993800
      // 042: lxor
      // 043: lstore 13
      // 045: dup2
      // 046: ldc2_w 85986142349322
      // 049: lxor
      // 04a: lstore 15
      // 04c: dup2
      // 04d: ldc2_w 108962160015171
      // 050: lxor
      // 051: dup2
      // 052: bipush 16
      // 054: lushr
      // 055: lstore 17
      // 057: dup2
      // 058: bipush 48
      // 05a: lshl
      // 05b: bipush 48
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 19
      // 061: pop2
      // 062: dup2
      // 063: ldc2_w 126418502876331
      // 066: lxor
      // 067: lstore 20
      // 069: dup2
      // 06a: ldc2_w 8830023140832
      // 06d: lxor
      // 06e: lstore 22
      // 070: dup2
      // 071: ldc2_w 133038506108837
      // 074: lxor
      // 075: lstore 24
      // 077: dup2
      // 078: ldc2_w 38637773665154
      // 07b: lxor
      // 07c: lstore 26
      // 07e: dup2
      // 07f: ldc2_w 84423319148686
      // 082: lxor
      // 083: lstore 28
      // 085: dup2
      // 086: ldc2_w 22097843527707
      // 089: lxor
      // 08a: lstore 30
      // 08c: dup2
      // 08d: ldc2_w 108932365059653
      // 090: lxor
      // 091: lstore 32
      // 093: dup2
      // 094: ldc2_w 90681452528018
      // 097: lxor
      // 098: lstore 34
      // 09a: dup2
      // 09b: ldc2_w 96891185457834
      // 09e: lxor
      // 09f: lstore 36
      // 0a1: dup2
      // 0a2: ldc2_w 107634722534570
      // 0a5: lxor
      // 0a6: lstore 38
      // 0a8: dup2
      // 0a9: ldc2_w 115981453468507
      // 0ac: lxor
      // 0ad: dup2
      // 0ae: bipush 56
      // 0b0: lushr
      // 0b1: l2i
      // 0b2: istore 40
      // 0b4: dup2
      // 0b5: bipush 8
      // 0b7: lshl
      // 0b8: bipush 8
      // 0ba: lushr
      // 0bb: lstore 41
      // 0bd: pop2
      // 0be: dup2
      // 0bf: ldc2_w 113905852599470
      // 0c2: lxor
      // 0c3: lstore 43
      // 0c5: dup2
      // 0c6: ldc2_w 66353382774125
      // 0c9: lxor
      // 0ca: lstore 45
      // 0cc: dup2
      // 0cd: ldc2_w 139062710827951
      // 0d0: lxor
      // 0d1: lstore 47
      // 0d3: pop2
      // 0d4: ldc2_w 8775700182568421795
      // 0d7: lload 2
      // 0d8: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: aload 4
      // 0df: lload 24
      // 0e1: invokevirtual com/zelix/hy.k (J)Ljava/lang/String;
      // 0e4: astore 53
      // 0e6: istore 52
      // 0e8: aload 1
      // 0e9: lload 17
      // 0eb: iload 19
      // 0ed: i2s
      // 0ee: aload 53
      // 0f0: sipush 27215
      // 0f3: ldc2_w 4411273684778355437
      // 0f6: lload 2
      // 0f7: lxor
      // 0f8: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: invokeinterface com/zelix/_yv.m (JSLjava/lang/String;Ljava/lang/String;)Z 6
      // 102: iload 52
      // 104: ifeq 13e
      // 107: ifne 261
      // 10a: goto 117
      // 10d: ldc2_w 9175218578151510684
      // 110: lload 2
      // 111: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 1
      // 118: lload 17
      // 11a: iload 19
      // 11c: i2s
      // 11d: aload 53
      // 11f: sipush 19444
      // 122: ldc2_w 1803071862088608600
      // 125: lload 2
      // 126: lxor
      // 127: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: invokeinterface com/zelix/_yv.m (JSLjava/lang/String;Ljava/lang/String;)Z 6
      // 131: goto 13e
      // 134: ldc2_w 9175218578151510684
      // 137: lload 2
      // 138: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: iload 52
      // 140: lload 2
      // 141: lconst_0
      // 142: lcmp
      // 143: iflt 180
      // 146: ifeq 178
      // 149: ifne 261
      // 14c: goto 159
      // 14f: ldc2_w 9175218578151510684
      // 152: lload 2
      // 153: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: aload 53
      // 15b: sipush 5209
      // 15e: ldc2_w 1259695102495683831
      // 161: lload 2
      // 162: lxor
      // 163: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16b: goto 178
      // 16e: ldc2_w 9175218578151510684
      // 171: lload 2
      // 172: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: lload 2
      // 179: lconst_0
      // 17a: lcmp
      // 17b: iflt 1c9
      // 17e: iload 52
      // 180: ifeq 1c9
      // 183: ifne 261
      // 186: goto 193
      // 189: ldc2_w 9175218578151510684
      // 18c: lload 2
      // 18d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: aload 1
      // 194: aload 53
      // 196: sipush 15784
      // 199: ldc2_w 8793500541098319113
      // 19c: lload 2
      // 19d: lxor
      // 19e: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: iload 52
      // 1a5: ifeq 27d
      // 1a8: goto 1b5
      // 1ab: ldc2_w 9175218578151510684
      // 1ae: lload 2
      // 1af: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: lload 15
      // 1b7: invokeinterface com/zelix/_yv.l (Ljava/lang/String;Ljava/lang/String;J)Z 5
      // 1bc: goto 1c9
      // 1bf: ldc2_w 9175218578151510684
      // 1c2: lload 2
      // 1c3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: ifne 26d
      // 1cc: aload 1
      // 1cd: aload 53
      // 1cf: sipush 21022
      // 1d2: ldc2_w 5147224158732694195
      // 1d5: lload 2
      // 1d6: lxor
      // 1d7: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: iload 52
      // 1de: ifeq 27d
      // 1e1: goto 1ee
      // 1e4: ldc2_w 9175218578151510684
      // 1e7: lload 2
      // 1e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: lload 15
      // 1f0: invokeinterface com/zelix/_yv.l (Ljava/lang/String;Ljava/lang/String;J)Z 5
      // 1f5: ifne 26d
      // 1f8: goto 205
      // 1fb: ldc2_w 9175218578151510684
      // 1fe: lload 2
      // 1ff: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: athrow
      // 205: aload 53
      // 207: sipush 25478
      // 20a: ldc2_w 5834340276403569452
      // 20d: lload 2
      // 20e: lxor
      // 20f: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 217: lload 2
      // 218: lconst_0
      // 219: lcmp
      // 21a: ifle 25e
      // 21d: iload 52
      // 21f: ifeq 25e
      // 222: goto 22f
      // 225: ldc2_w 9175218578151510684
      // 228: lload 2
      // 229: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: athrow
      // 22f: ifne 26d
      // 232: goto 23f
      // 235: ldc2_w 9175218578151510684
      // 238: lload 2
      // 239: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: athrow
      // 23f: aload 53
      // 241: sipush 12456
      // 244: ldc2_w 8179596642186809357
      // 247: lload 2
      // 248: lxor
      // 249: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 251: goto 25e
      // 254: ldc2_w 9175218578151510684
      // 257: lload 2
      // 258: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: athrow
      // 25e: ifne 26d
      // 261: lconst_0
      // 262: lreturn
      // 263: ldc2_w 9175218578151510684
      // 266: lload 2
      // 267: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: aload 1
      // 26e: aload 53
      // 270: sipush 5625
      // 273: ldc2_w 2812321155946378586
      // 276: lload 2
      // 277: lxor
      // 278: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: ldc "J"
      // 27f: astore 49
      // 281: astore 50
      // 283: astore 51
      // 285: lload 13
      // 287: aload 51
      // 289: aload 50
      // 28b: aload 49
      // 28d: bipush 4
      // 28e: anewarray 50
      // 291: dup_x1
      // 292: swap
      // 293: bipush 3
      // 294: swap
      // 295: aastore
      // 296: dup_x1
      // 297: swap
      // 298: bipush 2
      // 299: swap
      // 29a: aastore
      // 29b: dup_x1
      // 29c: swap
      // 29d: bipush 1
      // 29e: swap
      // 29f: aastore
      // 2a0: dup_x2
      // 2a1: dup_x2
      // 2a2: pop
      // 2a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a6: bipush 0
      // 2a7: swap
      // 2a8: aastore
      // 2a9: ldc2_w 6932782494068985832
      // 2ac: lload 2
      // 2ad: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ir; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: astore 54
      // 2b4: aload 54
      // 2b6: iload 52
      // 2b8: ifeq 2cd
      // 2bb: ifnull 319
      // 2be: goto 2cb
      // 2c1: ldc2_w 9175218578151510684
      // 2c4: lload 2
      // 2c5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: athrow
      // 2cb: aload 54
      // 2cd: lload 34
      // 2cf: bipush 1
      // 2d0: anewarray 50
      // 2d3: dup_x2
      // 2d4: dup_x2
      // 2d5: pop
      // 2d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d9: bipush 0
      // 2da: swap
      // 2db: aastore
      // 2dc: ldc2_w 7360687637329225794
      // 2df: lload 2
      // 2e0: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: astore 55
      // 2e7: aload 55
      // 2e9: iload 52
      // 2eb: ifeq 300
      // 2ee: ifnull 319
      // 2f1: goto 2fe
      // 2f4: ldc2_w 9175218578151510684
      // 2f7: lload 2
      // 2f8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: athrow
      // 2fe: aload 55
      // 300: lload 45
      // 302: bipush 1
      // 303: anewarray 50
      // 306: dup_x2
      // 307: dup_x2
      // 308: pop
      // 309: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30c: bipush 0
      // 30d: swap
      // 30e: aastore
      // 30f: ldc2_w 8833028560640836401
      // 312: lload 2
      // 313: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 318: lreturn
      // 319: new java/io/ByteArrayOutputStream
      // 31c: dup
      // 31d: sipush 13730
      // 320: ldc2_w 1707956610507771604
      // 323: lload 2
      // 324: lxor
      // 325: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: invokespecial java/io/ByteArrayOutputStream.<init> (I)V
      // 32d: astore 55
      // 32f: lconst_0
      // 330: lstore 56
      // 332: sipush 19241
      // 335: ldc2_w 3963884963971967887
      // 338: lload 2
      // 339: lxor
      // 33a: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: ldc2_w 7430519176665991091
      // 342: lload 2
      // 343: invokedynamic p (Ljava/lang/Object;JJ)Ljava/security/MessageDigest; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: astore 58
      // 34a: new java/security/DigestOutputStream
      // 34d: dup
      // 34e: aload 55
      // 350: aload 58
      // 352: invokespecial java/security/DigestOutputStream.<init> (Ljava/io/OutputStream;Ljava/security/MessageDigest;)V
      // 355: astore 59
      // 357: new java/io/DataOutputStream
      // 35a: dup
      // 35b: aload 59
      // 35d: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 360: astore 60
      // 362: aload 60
      // 364: aload 4
      // 366: lload 30
      // 368: bipush 1
      // 369: anewarray 50
      // 36c: dup_x2
      // 36d: dup_x2
      // 36e: pop
      // 36f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 372: bipush 0
      // 373: swap
      // 374: aastore
      // 375: ldc2_w 8871417038079815607
      // 378: lload 2
      // 379: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: ldc2_w 7267819744269768687
      // 381: lload 2
      // 382: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: aload 4
      // 389: iload 40
      // 38b: i2b
      // 38c: lload 41
      // 38e: bipush 2
      // 38f: anewarray 50
      // 392: dup_x2
      // 393: dup_x2
      // 394: pop
      // 395: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 398: bipush 1
      // 399: swap
      // 39a: aastore
      // 39b: dup_x1
      // 39c: swap
      // 39d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3a0: bipush 0
      // 3a1: swap
      // 3a2: aastore
      // 3a3: ldc2_w 8854272646703922558
      // 3a6: lload 2
      // 3a7: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: istore 61
      // 3ae: iload 61
      // 3b0: iload 52
      // 3b2: lload 2
      // 3b3: lconst_0
      // 3b4: lcmp
      // 3b5: iflt 3f4
      // 3b8: ifeq 3ec
      // 3bb: bipush -1
      // 3bc: if_icmpne 3d3
      // 3bf: goto 3cc
      // 3c2: ldc2_w 9175218578151510684
      // 3c5: lload 2
      // 3c6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: aload 4
      // 3ce: invokevirtual com/zelix/hy.b ()I
      // 3d1: istore 61
      // 3d3: ldc2_w 9125302410301720023
      // 3d6: lload 2
      // 3d7: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dc: sipush 24975
      // 3df: ldc2_w 7191512608248430895
      // 3e2: lload 2
      // 3e3: lxor
      // 3e4: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3ec: lload 2
      // 3ed: lconst_0
      // 3ee: lcmp
      // 3ef: ifle 430
      // 3f2: iload 52
      // 3f4: ifeq 430
      // 3f7: ifne 417
      // 3fa: goto 407
      // 3fd: ldc2_w 9175218578151510684
      // 400: lload 2
      // 401: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: athrow
      // 407: iload 61
      // 409: bipush 0
      // 40a: ldc2_w 4162669427450788728
      // 40d: lload 2
      // 40e: lxor
      // 40f: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: iand
      // 415: istore 61
      // 417: aload 4
      // 419: iload 52
      // 41b: ifeq 4b5
      // 41e: lload 28
      // 420: invokevirtual com/zelix/hy.d (J)Z
      // 423: goto 430
      // 426: ldc2_w 9175218578151510684
      // 429: lload 2
      // 42a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42f: athrow
      // 430: lload 2
      // 431: lconst_0
      // 432: lcmp
      // 433: ifle 448
      // 436: ifeq 4a6
      // 439: aload 4
      // 43b: bipush 0
      // 43c: anewarray 50
      // 43f: ldc2_w 7033977791704650496
      // 442: lload 2
      // 443: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: iload 52
      // 44a: ifeq 4a4
      // 44d: goto 45a
      // 450: ldc2_w 9175218578151510684
      // 453: lload 2
      // 454: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: athrow
      // 45a: ifle 487
      // 45d: goto 46a
      // 460: ldc2_w 9175218578151510684
      // 463: lload 2
      // 464: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 469: athrow
      // 46a: iload 61
      // 46c: sipush 20489
      // 46f: ldc2_w 8627450607999118192
      // 472: lload 2
      // 473: lxor
      // 474: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 479: ior
      // 47a: istore 61
      // 47c: lload 2
      // 47d: lconst_0
      // 47e: lcmp
      // 47f: iflt 4b3
      // 482: iload 52
      // 484: ifne 4a6
      // 487: iload 61
      // 489: sipush 1764
      // 48c: ldc2_w 3381713315005775257
      // 48f: lload 2
      // 490: lxor
      // 491: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 496: iand
      // 497: goto 4a4
      // 49a: ldc2_w 9175218578151510684
      // 49d: lload 2
      // 49e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: athrow
      // 4a4: istore 61
      // 4a6: aload 60
      // 4a8: iload 61
      // 4aa: ldc2_w 6981065659604464625
      // 4ad: lload 2
      // 4ae: invokedynamic h (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b3: aload 4
      // 4b5: lload 7
      // 4b7: bipush 1
      // 4b8: anewarray 50
      // 4bb: dup_x2
      // 4bc: dup_x2
      // 4bd: pop
      // 4be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c1: bipush 0
      // 4c2: swap
      // 4c3: aastore
      // 4c4: ldc2_w 7035074905931523170
      // 4c7: lload 2
      // 4c8: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cd: astore 62
      // 4cf: aload 62
      // 4d1: ldc2_w 8978174096316954880
      // 4d4: lload 2
      // 4d5: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4da: bipush 0
      // 4db: istore 63
      // 4dd: iload 63
      // 4df: aload 62
      // 4e1: arraylength
      // 4e2: if_icmpge 53c
      // 4e5: aload 62
      // 4e7: iload 63
      // 4e9: aaload
      // 4ea: sipush 17989
      // 4ed: ldc2_w 4889741640367537458
      // 4f0: lload 2
      // 4f1: lxor
      // 4f2: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: sipush 25587
      // 4fa: ldc2_w 3366299957310904448
      // 4fd: lload 2
      // 4fe: lxor
      // 4ff: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 504: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 507: astore 64
      // 509: aload 60
      // 50b: aload 64
      // 50d: ldc2_w 7267819744269768687
      // 510: lload 2
      // 511: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 516: iinc 63 1
      // 519: iload 52
      // 51b: lload 2
      // 51c: lconst_0
      // 51d: lcmp
      // 51e: iflt 526
      // 521: ifeq af4
      // 524: iload 52
      // 526: ifne 4dd
      // 529: lload 2
      // 52a: lconst_0
      // 52b: lcmp
      // 52c: iflt 519
      // 52f: goto 53c
      // 532: ldc2_w 9175218578151510684
      // 535: lload 2
      // 536: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53b: athrow
      // 53c: aload 4
      // 53e: lload 32
      // 540: bipush 1
      // 541: anewarray 50
      // 544: dup_x2
      // 545: dup_x2
      // 546: pop
      // 547: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 54a: bipush 0
      // 54b: swap
      // 54c: aastore
      // 54d: ldc2_w 9116741221755982403
      // 550: lload 2
      // 551: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/yd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 556: astore 63
      // 558: aload 63
      // 55a: ldc2_w 7323787989295656800
      // 55d: lload 2
      // 55e: invokedynamic i (JJ)Ljava/util/Comparator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 563: lload 36
      // 565: bipush 2
      // 566: anewarray 50
      // 569: dup_x2
      // 56a: dup_x2
      // 56b: pop
      // 56c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 56f: bipush 1
      // 570: swap
      // 571: aastore
      // 572: dup_x1
      // 573: swap
      // 574: bipush 0
      // 575: swap
      // 576: aastore
      // 577: ldc2_w 9160487069027816817
      // 57a: lload 2
      // 57b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 580: aload 63
      // 582: ldc2_w 7373745704403445019
      // 585: lload 2
      // 586: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58b: ifeq 6d7
      // 58e: aload 63
      // 590: ldc2_w 8895869876489219035
      // 593: lload 2
      // 594: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 599: checkcast com/zelix/ir
      // 59c: astore 64
      // 59e: aload 64
      // 5a0: lload 43
      // 5a2: invokevirtual com/zelix/ir.C (J)Z
      // 5a5: lload 2
      // 5a6: lconst_0
      // 5a7: lcmp
      // 5a8: ifle 70b
      // 5ab: iload 52
      // 5ad: ifeq 70b
      // 5b0: iload 52
      // 5b2: ifeq 66d
      // 5b5: goto 5c2
      // 5b8: ldc2_w 9175218578151510684
      // 5bb: lload 2
      // 5bc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: athrow
      // 5c2: lload 2
      // 5c3: lconst_0
      // 5c4: lcmp
      // 5c5: ifle 660
      // 5c8: ifeq 649
      // 5cb: goto 5d8
      // 5ce: ldc2_w 9175218578151510684
      // 5d1: lload 2
      // 5d2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d7: athrow
      // 5d8: aload 64
      // 5da: lload 9
      // 5dc: invokevirtual com/zelix/ir.n (J)Z
      // 5df: iload 52
      // 5e1: lload 2
      // 5e2: lconst_0
      // 5e3: lcmp
      // 5e4: ifle 636
      // 5e7: ifeq 634
      // 5ea: goto 5f7
      // 5ed: ldc2_w 9175218578151510684
      // 5f0: lload 2
      // 5f1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f6: athrow
      // 5f7: lload 2
      // 5f8: lconst_0
      // 5f9: lcmp
      // 5fa: ifle 6d4
      // 5fd: ifne 6d2
      // 600: goto 60d
      // 603: ldc2_w 9175218578151510684
      // 606: lload 2
      // 607: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60c: athrow
      // 60d: aload 64
      // 60f: lload 26
      // 611: bipush 1
      // 612: anewarray 50
      // 615: dup_x2
      // 616: dup_x2
      // 617: pop
      // 618: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61b: bipush 0
      // 61c: swap
      // 61d: aastore
      // 61e: ldc2_w 8839911924822684780
      // 621: lload 2
      // 622: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 627: goto 634
      // 62a: ldc2_w 9175218578151510684
      // 62d: lload 2
      // 62e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 633: athrow
      // 634: iload 52
      // 636: ifeq 66d
      // 639: ifne 6d2
      // 63c: goto 649
      // 63f: ldc2_w 9175218578151510684
      // 642: lload 2
      // 643: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 648: athrow
      // 649: aload 60
      // 64b: aload 64
      // 64d: lload 22
      // 64f: invokevirtual com/zelix/ir.w (J)Ljava/lang/String;
      // 652: ldc2_w 7267819744269768687
      // 655: lload 2
      // 656: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65b: aload 64
      // 65d: invokevirtual com/zelix/ir.D ()I
      // 660: goto 66d
      // 663: ldc2_w 9175218578151510684
      // 666: lload 2
      // 667: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66c: athrow
      // 66d: istore 65
      // 66f: iload 52
      // 671: lload 2
      // 672: lconst_0
      // 673: lcmp
      // 674: iflt 693
      // 677: ifeq 6c2
      // 67a: ldc2_w 9125302410301720023
      // 67d: lload 2
      // 67e: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 683: sipush 1718
      // 686: ldc2_w 3454241566987970078
      // 689: lload 2
      // 68a: lxor
      // 68b: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 690: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 693: ifne 6b5
      // 696: goto 6a3
      // 699: ldc2_w 9175218578151510684
      // 69c: lload 2
      // 69d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a2: athrow
      // 6a3: iload 65
      // 6a5: sipush 27660
      // 6a8: ldc2_w 5300432919156578160
      // 6ab: lload 2
      // 6ac: lxor
      // 6ad: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b2: iand
      // 6b3: istore 65
      // 6b5: aload 60
      // 6b7: iload 65
      // 6b9: ldc2_w 6981065659604464625
      // 6bc: lload 2
      // 6bd: invokedynamic h (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c2: aload 60
      // 6c4: aload 64
      // 6c6: invokevirtual com/zelix/ir.H ()Ljava/lang/String;
      // 6c9: ldc2_w 7267819744269768687
      // 6cc: lload 2
      // 6cd: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d2: iload 52
      // 6d4: ifne 580
      // 6d7: aload 1
      // 6d8: lload 2
      // 6d9: lconst_0
      // 6da: lcmp
      // 6db: ifle 599
      // 6de: ldc2_w 8878661115983259921
      // 6e1: lload 2
      // 6e2: invokedynamic i (JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e7: lload 20
      // 6e9: aload 4
      // 6eb: bipush 3
      // 6ec: anewarray 50
      // 6ef: dup_x1
      // 6f0: swap
      // 6f1: bipush 2
      // 6f2: swap
      // 6f3: aastore
      // 6f4: dup_x2
      // 6f5: dup_x2
      // 6f6: pop
      // 6f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6fa: bipush 1
      // 6fb: swap
      // 6fc: aastore
      // 6fd: dup_x1
      // 6fe: swap
      // 6ff: bipush 0
      // 700: swap
      // 701: aastore
      // 702: ldc2_w 9130393748757621284
      // 705: lload 2
      // 706: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70b: ifeq 763
      // 70e: aload 60
      // 710: sipush 29621
      // 713: ldc2_w 212761909747946268
      // 716: lload 2
      // 717: lxor
      // 718: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71d: ldc2_w 7267819744269768687
      // 720: lload 2
      // 721: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 726: aload 60
      // 728: sipush 31813
      // 72b: ldc2_w 4294657964237768511
      // 72e: lload 2
      // 72f: lxor
      // 730: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 735: ldc2_w 6981065659604464625
      // 738: lload 2
      // 739: invokedynamic h (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73e: aload 60
      // 740: sipush 17597
      // 743: ldc2_w 5575124930106500121
      // 746: lload 2
      // 747: lxor
      // 748: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74d: ldc2_w 7267819744269768687
      // 750: lload 2
      // 751: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 756: goto 763
      // 759: ldc2_w 9175218578151510684
      // 75c: lload 2
      // 75d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 762: athrow
      // 763: aload 4
      // 765: lload 5
      // 767: bipush 1
      // 768: anewarray 50
      // 76b: dup_x2
      // 76c: dup_x2
      // 76d: pop
      // 76e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 771: bipush 0
      // 772: swap
      // 773: aastore
      // 774: ldc2_w 8950082692836438463
      // 777: lload 2
      // 778: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/yd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77d: astore 64
      // 77f: aload 64
      // 781: ldc2_w 8692696659997924478
      // 784: lload 2
      // 785: invokedynamic i (JJ)Ljava/util/Comparator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78a: lload 36
      // 78c: bipush 2
      // 78d: anewarray 50
      // 790: dup_x2
      // 791: dup_x2
      // 792: pop
      // 793: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 796: bipush 1
      // 797: swap
      // 798: aastore
      // 799: dup_x1
      // 79a: swap
      // 79b: bipush 0
      // 79c: swap
      // 79d: aastore
      // 79e: ldc2_w 9160487069027816817
      // 7a1: lload 2
      // 7a2: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a7: new java/util/Vector
      // 7aa: dup
      // 7ab: invokespecial java/util/Vector.<init> ()V
      // 7ae: astore 65
      // 7b0: new java/util/Vector
      // 7b3: dup
      // 7b4: invokespecial java/util/Vector.<init> ()V
      // 7b7: astore 66
      // 7b9: aload 64
      // 7bb: ldc2_w 7373745704403445019
      // 7be: lload 2
      // 7bf: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c4: ifeq 89b
      // 7c7: aload 64
      // 7c9: ldc2_w 8895869876489219035
      // 7cc: lload 2
      // 7cd: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d2: checkcast com/zelix/ig
      // 7d5: astore 67
      // 7d7: aload 67
      // 7d9: lload 43
      // 7db: invokevirtual com/zelix/ig.C (J)Z
      // 7de: iload 52
      // 7e0: lload 2
      // 7e1: lconst_0
      // 7e2: lcmp
      // 7e3: iflt 7eb
      // 7e6: ifeq 8a2
      // 7e9: iload 52
      // 7eb: lload 2
      // 7ec: lconst_0
      // 7ed: lcmp
      // 7ee: ifle 833
      // 7f1: ifeq 82b
      // 7f4: goto 801
      // 7f7: ldc2_w 9175218578151510684
      // 7fa: lload 2
      // 7fb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 800: athrow
      // 801: lload 2
      // 802: lconst_0
      // 803: lcmp
      // 804: iflt 898
      // 807: ifne 896
      // 80a: goto 817
      // 80d: ldc2_w 9175218578151510684
      // 810: lload 2
      // 811: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 816: athrow
      // 817: aload 67
      // 819: lload 38
      // 81b: invokevirtual com/zelix/ig.Q (J)Z
      // 81e: goto 82b
      // 821: ldc2_w 9175218578151510684
      // 824: lload 2
      // 825: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82a: athrow
      // 82b: lload 2
      // 82c: lconst_0
      // 82d: lcmp
      // 82e: iflt 879
      // 831: iload 52
      // 833: ifeq 879
      // 836: ifeq 865
      // 839: goto 846
      // 83c: ldc2_w 9175218578151510684
      // 83f: lload 2
      // 840: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 845: athrow
      // 846: aload 65
      // 848: aload 67
      // 84a: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 84d: iload 52
      // 84f: lload 2
      // 850: lconst_0
      // 851: lcmp
      // 852: ifle 898
      // 855: ifne 896
      // 858: goto 865
      // 85b: ldc2_w 9175218578151510684
      // 85e: lload 2
      // 85f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 864: athrow
      // 865: aload 67
      // 867: lload 11
      // 869: invokevirtual com/zelix/ig.V (J)Z
      // 86c: goto 879
      // 86f: ldc2_w 9175218578151510684
      // 872: lload 2
      // 873: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 878: athrow
      // 879: lload 2
      // 87a: lconst_0
      // 87b: lcmp
      // 87c: iflt 898
      // 87f: ifne 896
      // 882: aload 66
      // 884: aload 67
      // 886: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 889: goto 896
      // 88c: ldc2_w 9175218578151510684
      // 88f: lload 2
      // 890: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 895: athrow
      // 896: iload 52
      // 898: ifne 7b9
      // 89b: lload 2
      // 89c: lconst_0
      // 89d: lcmp
      // 89e: iflt af4
      // 8a1: bipush 0
      // 8a2: istore 67
      // 8a4: iload 67
      // 8a6: aload 65
      // 8a8: invokevirtual java/util/Vector.size ()I
      // 8ab: if_icmpge 96d
      // 8ae: aload 65
      // 8b0: iload 67
      // 8b2: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 8b5: checkcast com/zelix/ig
      // 8b8: astore 68
      // 8ba: aload 60
      // 8bc: aload 68
      // 8be: lload 47
      // 8c0: invokevirtual com/zelix/ig.t (J)Ljava/lang/String;
      // 8c3: ldc2_w 7267819744269768687
      // 8c6: lload 2
      // 8c7: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8cc: aload 68
      // 8ce: invokevirtual com/zelix/ig.D ()I
      // 8d1: istore 69
      // 8d3: iload 52
      // 8d5: lload 2
      // 8d6: lconst_0
      // 8d7: lcmp
      // 8d8: ifle 96a
      // 8db: ifeq 968
      // 8de: ldc2_w 9125302410301720023
      // 8e1: lload 2
      // 8e2: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e7: sipush 1718
      // 8ea: ldc2_w 3454241566987970078
      // 8ed: lload 2
      // 8ee: lxor
      // 8ef: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8f7: iload 52
      // 8f9: ifeq 974
      // 8fc: goto 909
      // 8ff: ldc2_w 9175218578151510684
      // 902: lload 2
      // 903: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 908: athrow
      // 909: ifne 92b
      // 90c: goto 919
      // 90f: ldc2_w 9175218578151510684
      // 912: lload 2
      // 913: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 918: athrow
      // 919: iload 69
      // 91b: sipush 12378
      // 91e: ldc2_w 7763183958110309157
      // 921: lload 2
      // 922: lxor
      // 923: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 928: iand
      // 929: istore 69
      // 92b: aload 60
      // 92d: iload 69
      // 92f: ldc2_w 6981065659604464625
      // 932: lload 2
      // 933: invokedynamic h (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 938: aload 60
      // 93a: aload 68
      // 93c: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // 93f: sipush 8720
      // 942: ldc2_w 1994567563757001056
      // 945: lload 2
      // 946: lxor
      // 947: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94c: sipush 5427
      // 94f: ldc2_w 3063872312274005569
      // 952: lload 2
      // 953: lxor
      // 954: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 959: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 95c: ldc2_w 7267819744269768687
      // 95f: lload 2
      // 960: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 965: iinc 67 1
      // 968: iload 52
      // 96a: ifne 8a4
      // 96d: lload 2
      // 96e: lconst_0
      // 96f: lcmp
      // 970: ifle 976
      // 973: bipush 0
      // 974: istore 67
      // 976: iload 67
      // 978: aload 66
      // 97a: invokevirtual java/util/Vector.size ()I
      // 97d: if_icmpge a45
      // 980: aload 66
      // 982: iload 67
      // 984: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 987: checkcast com/zelix/ig
      // 98a: astore 68
      // 98c: aload 60
      // 98e: aload 68
      // 990: lload 47
      // 992: invokevirtual com/zelix/ig.t (J)Ljava/lang/String;
      // 995: ldc2_w 7267819744269768687
      // 998: lload 2
      // 999: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99e: aload 68
      // 9a0: invokevirtual com/zelix/ig.D ()I
      // 9a3: istore 69
      // 9a5: iload 52
      // 9a7: lload 2
      // 9a8: lconst_0
      // 9a9: lcmp
      // 9aa: ifle 9b2
      // 9ad: ifeq a56
      // 9b0: iload 52
      // 9b2: lload 2
      // 9b3: lconst_0
      // 9b4: lcmp
      // 9b5: iflt a42
      // 9b8: ifeq a40
      // 9bb: goto 9c8
      // 9be: ldc2_w 9175218578151510684
      // 9c1: lload 2
      // 9c2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c7: athrow
      // 9c8: ldc2_w 9125302410301720023
      // 9cb: lload 2
      // 9cc: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d1: sipush 1718
      // 9d4: ldc2_w 3454241566987970078
      // 9d7: lload 2
      // 9d8: lxor
      // 9d9: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/dj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9e1: ifne a03
      // 9e4: goto 9f1
      // 9e7: ldc2_w 9175218578151510684
      // 9ea: lload 2
      // 9eb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f0: athrow
      // 9f1: iload 69
      // 9f3: sipush 32565
      // 9f6: ldc2_w 9039766177844118606
      // 9f9: lload 2
      // 9fa: lxor
      // 9fb: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a00: iand
      // a01: istore 69
      // a03: aload 60
      // a05: iload 69
      // a07: ldc2_w 6981065659604464625
      // a0a: lload 2
      // a0b: invokedynamic h (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a10: aload 60
      // a12: aload 68
      // a14: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // a17: sipush 8720
      // a1a: ldc2_w 1994567563757001056
      // a1d: lload 2
      // a1e: lxor
      // a1f: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a24: sipush 5427
      // a27: ldc2_w 3063872312274005569
      // a2a: lload 2
      // a2b: lxor
      // a2c: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a31: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // a34: ldc2_w 7267819744269768687
      // a37: lload 2
      // a38: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3d: iinc 67 1
      // a40: iload 52
      // a42: ifne 976
      // a45: aload 60
      // a47: ldc2_w 7224077822565563516
      // a4a: lload 2
      // a4b: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a50: lload 2
      // a51: lconst_0
      // a52: lcmp
      // a53: ifle a56
      // a56: aload 58
      // a58: ldc2_w 9157607084003899619
      // a5b: lload 2
      // a5c: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a61: astore 67
      // a63: bipush 0
      // a64: istore 68
      // a66: iload 68
      // a68: sipush 10501
      // a6b: ldc2_w 2396041289115439739
      // a6e: lload 2
      // a6f: lxor
      // a70: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a75: aload 67
      // a77: arraylength
      // a78: ldc2_w 7217919236022171434
      // a7b: lload 2
      // a7c: invokedynamic p (IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a81: if_icmpge ad4
      // a84: lload 56
      // a86: aload 67
      // a88: iload 68
      // a8a: baload
      // a8b: sipush 12636
      // a8e: ldc2_w 7159785014368111149
      // a91: lload 2
      // a92: lxor
      // a93: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a98: iand
      // a99: i2l
      // a9a: iload 68
      // a9c: sipush 10501
      // a9f: ldc2_w 2396041289115439739
      // aa2: lload 2
      // aa3: lxor
      // aa4: invokedynamic s (IJ)I bsm=com/zelix/dj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa9: imul
      // aaa: lshl
      // aab: ladd
      // aac: lload 2
      // aad: lconst_0
      // aae: lcmp
      // aaf: iflt af6
      // ab2: lstore 56
      // ab4: iinc 68 1
      // ab7: iload 52
      // ab9: ifeq af4
      // abc: iload 52
      // abe: ifne a66
      // ac1: lload 2
      // ac2: lconst_0
      // ac3: lcmp
      // ac4: iflt ab7
      // ac7: goto ad4
      // aca: ldc2_w 9175218578151510684
      // acd: lload 2
      // ace: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad3: athrow
      // ad4: goto af4
      // ad7: astore 58
      // ad9: lconst_0
      // ada: lstore 56
      // adc: goto af4
      // adf: astore 58
      // ae1: new com/zelix/_sk
      // ae4: dup
      // ae5: aload 58
      // ae7: ldc2_w 7359123531744697412
      // aea: lload 2
      // aeb: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af0: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // af3: athrow
      // af4: lload 56
      // af6: lreturn
   }

   static {
      long var20 = a ^ 128355417784756L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[15];
      int var16 = 0;
      String var15 = "Î¹JÞMR½\u0006@¤\u0098áÅ¨¡](\u009bÛ\u0094,F=\u009e>}\u0083à$\u0004/Ýj=êÄ¤|ËÝç0i¡oHÐ\u0083JÚërÛ¤¢\u000e{ ¬ç\u0017kiéÏ{\u009cX]\u0097\u0080³Î£8½\u009d!9[ô\u0012Ç\u0019µµê\u0089lÂ(v¸\f\u0087\u0017\u0089¦¿¦Egb£)8j£^»jQøKú\u0005n^ìY¥B\u0014ÆÆ¢¬'}E\u0005\u0010ë\u001e[&\r\u008b\u0007¼KbÍ\u0099\u0084×³®(Wï\b\u0011 ÅY\u001bà6û\u0097Ä\u0083\bd³\u001a\u000eü·[\rñÎ\u0001Ï{æ§#¯J\u0005¸WJ\u001cÉ1\u0010\u0099eØÃµ.-'\u0098\u0099îþ\u0087ªÌ\u009c\u0010\u0085]©\fðz\u0095¦[\u0091Ù«\u0016\u0000ëá\u0010I¼\u008dc¬õ»\u009a\u008b^\u0006À\u008b:\u0016§ o\u007f\u0013Ê3\u0097£\\ÓòbNÔ.D³Fwá9õðJGîÙY\u0017bÐÍÒ(]\u001a\u0016ë4\u0012¯\u0013Ð\ty\rèÙ½\u0089\u000bÿ´¸\u0010p#þ\u0006)§«\u007f©\n\u0005\rÂÐìä\u0006¦> ÎíaÓ´\u009f'2\u009fÿ£zükF?5Û\u0006Ó\u001b\u007fB\u0083\u0018\u001c+²\u0001Ê\u0096\u0096(Æq¥½ÒÁÚÔ\u0016\u0007ÙîËw\u0097àsË\u0093\u0088YO=0!>_\u001a\u0018'Ù\u0086Í\u0088\n8ÀW¼ð";
      int var17 = "Î¹JÞMR½\u0006@¤\u0098áÅ¨¡](\u009bÛ\u0094,F=\u009e>}\u0083à$\u0004/Ýj=êÄ¤|ËÝç0i¡oHÐ\u0083JÚërÛ¤¢\u000e{ ¬ç\u0017kiéÏ{\u009cX]\u0097\u0080³Î£8½\u009d!9[ô\u0012Ç\u0019µµê\u0089lÂ(v¸\f\u0087\u0017\u0089¦¿¦Egb£)8j£^»jQøKú\u0005n^ìY¥B\u0014ÆÆ¢¬'}E\u0005\u0010ë\u001e[&\r\u008b\u0007¼KbÍ\u0099\u0084×³®(Wï\b\u0011 ÅY\u001bà6û\u0097Ä\u0083\bd³\u001a\u000eü·[\rñÎ\u0001Ï{æ§#¯J\u0005¸WJ\u001cÉ1\u0010\u0099eØÃµ.-'\u0098\u0099îþ\u0087ªÌ\u009c\u0010\u0085]©\fðz\u0095¦[\u0091Ù«\u0016\u0000ëá\u0010I¼\u008dc¬õ»\u009a\u008b^\u0006À\u008b:\u0016§ o\u007f\u0013Ê3\u0097£\\ÓòbNÔ.D³Fwá9õðJGîÙY\u0017bÐÍÒ(]\u001a\u0016ë4\u0012¯\u0013Ð\ty\rèÙ½\u0089\u000bÿ´¸\u0010p#þ\u0006)§«\u007f©\n\u0005\rÂÐìä\u0006¦> ÎíaÓ´\u009f'2\u009fÿ£zükF?5Û\u0006Ó\u001b\u007fB\u0083\u0018\u001c+²\u0001Ê\u0096\u0096(Æq¥½ÒÁÚÔ\u0016\u0007ÙîËw\u0097àsË\u0093\u0088YO=0!>_\u001a\u0018'Ù\u0086Í\u0088\n8ÀW¼ð"
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     c = var18;
                     d = new String[15];
                     h = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[14];
                     int var3 = 0;
                     String var4 = "Pô{À\u0014U¦\u0015\u001cçª\u0003ñ¹!çf*×v©¿Ì!ð+ý\"tâôy¼AÝ'@y\u009d$òÙAVÚ \u009dù\u0084Q\u007f\u008b5L\u009c\u0003$®UÝf, ¸§îÌ)E/Í\u0004L@\u008blg5?ñ]${\u00adõ!Î\u0015ÙÍ\r\u008d\u001b*\u0083ñ";
                     int var5 = "Pô{À\u0014U¦\u0015\u001cçª\u0003ñ¹!çf*×v©¿Ì!ð+ý\"tâôy¼AÝ'@y\u009d$òÙAVÚ \u009dù\u0084Q\u007f\u008b5L\u009c\u0003$®UÝf, ¸§îÌ)E/Í\u0004L@\u008blg5?ñ]${\u00adõ!Î\u0015ÙÍ\r\u008d\u001b*\u0083ñ"
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
                                    f = var6;
                                    g = new Integer[14];
                                    b = x44.a<"s">(
                                       a<"d">(21372, 7306188019825133644L ^ var20), a<"d">(12127, 8536907704050889827L ^ var20), 1916740601688171953L, var20
                                    );
                                    X = new dv();
                                    C = new _8v();
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "c?d|n÷\u0097\u0012ríÐ»GQ\u0082Á";
                                 var5 = "c?d|n÷\u0097\u0012ríÐ»GQ\u0082Á".length();
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

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "\u0090 ¿àmÜv;\u0000\u000e\u0096´g\u0017¿\u009c+cº7mÄþ$¢ë&[\u0004X¾\u0087\u0018:¸\u0007\u00834I1ìà×Å¬t~\u008cõ!À*\u0001\u0010L\u009b£";
                  var17 = "\u0090 ¿àmÜv;\u0000\u000e\u0096´g\u0017¿\u009c+cº7mÄþ$¢ë&[\u0004X¾\u0087\u0018:¸\u0007\u00834I1ìà×Å¬t~\u008cõ!À*\u0001\u0010L\u009b£"
                     .length();
                  var14 = ' ';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private static IOException a(IOException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5579;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/dj", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/dj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19984;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/dj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("com/zelix/dj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
