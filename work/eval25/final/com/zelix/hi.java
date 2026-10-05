package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hi extends hq {
   private final int u;
   private final int M;
   private final ie[] D;
   private final ie[] a;
   private static final long b = ess.a(4234274080608377375L, -3119206095151873648L, MethodHandles.lookup().lookupClass()).a(111659660565992L);
   private static final long[] e;
   private static final Integer[] i;
   private static final Map n = new HashMap(13);

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      return c<"a">(11678, 4949673695014168559L ^ var2);
   }

   hi(int param1, long param2, h8 param4, _xx param5, _y4 param6, _y4 param7, PrintWriter param8, wp param9, Map param10, Map param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hi.b J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 1317057646665
      // 00b: lxor
      // 00c: lstore 12
      // 00e: dup2
      // 00f: ldc2_w 101274741546277
      // 012: lxor
      // 013: lstore 14
      // 015: dup2
      // 016: ldc2_w 118385039141633
      // 019: lxor
      // 01a: lstore 16
      // 01c: dup2
      // 01d: ldc2_w 36474816595463
      // 020: lxor
      // 021: dup2
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 18
      // 028: dup2
      // 029: bipush 32
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 19
      // 032: dup2
      // 033: bipush 48
      // 035: lshl
      // 036: bipush 48
      // 038: lushr
      // 039: l2i
      // 03a: istore 20
      // 03c: pop2
      // 03d: dup2
      // 03e: ldc2_w 122828031938408
      // 041: lxor
      // 042: lstore 21
      // 044: pop2
      // 045: ldc2_w -2167385096709614161
      // 048: lload 2
      // 049: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 0
      // 04f: aload 4
      // 051: invokespecial com/zelix/hq.<init> (Lcom/zelix/h8;)V
      // 054: aload 0
      // 055: sipush 30279
      // 058: ldc2_w 1542711907719306793
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic a (IJ)I bsm=com/zelix/hi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: putfield com/zelix/hi.M I
      // 065: istore 23
      // 067: iload 18
      // 069: iload 19
      // 06b: i2s
      // 06c: iload 20
      // 06e: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 071: astore 24
      // 073: aload 0
      // 074: aload 5
      // 076: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 079: putfield com/zelix/hi.u I
      // 07c: aload 5
      // 07e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 081: istore 25
      // 083: aload 0
      // 084: iload 25
      // 086: anewarray 44
      // 089: putfield com/zelix/hi.a [Lcom/zelix/ie;
      // 08c: bipush 0
      // 08d: istore 26
      // 08f: iload 26
      // 091: iload 25
      // 093: if_icmpge 14f
      // 096: aload 0
      // 097: getfield com/zelix/hi.a [Lcom/zelix/ie;
      // 09a: iload 26
      // 09c: aload 4
      // 09e: checkcast com/zelix/h6
      // 0a1: aload 5
      // 0a3: aload 6
      // 0a5: aload 7
      // 0a7: aload 8
      // 0a9: aload 10
      // 0ab: aload 11
      // 0ad: aload 24
      // 0af: lload 14
      // 0b1: bipush 9
      // 0b3: anewarray 155
      // 0b6: dup_x2
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bc: bipush 8
      // 0be: swap
      // 0bf: aastore
      // 0c0: dup_x1
      // 0c1: swap
      // 0c2: bipush 7
      // 0c4: swap
      // 0c5: aastore
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: bipush 6
      // 0ca: swap
      // 0cb: aastore
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 5
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 4
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: bipush 3
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 2
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 1
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 0
      // 0e8: swap
      // 0e9: aastore
      // 0ea: ldc2_w -417815470006117562
      // 0ed: lload 2
      // 0ee: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: aastore
      // 0f4: iload 23
      // 0f6: lload 2
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 14c
      // 0fc: ifne 14a
      // 0ff: aload 0
      // 100: getfield com/zelix/hi.a [Lcom/zelix/ie;
      // 103: iload 26
      // 105: aaload
      // 106: bipush 0
      // 107: anewarray 155
      // 10a: ldc2_w -311818202963580680
      // 10d: lload 2
      // 10e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: iload 23
      // 115: ifne 166
      // 118: goto 125
      // 11b: ldc2_w -1844631991032359556
      // 11e: lload 2
      // 11f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: ifne 147
      // 128: goto 135
      // 12b: ldc2_w -1844631991032359556
      // 12e: lload 2
      // 12f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: aload 0
      // 136: bipush 0
      // 137: putfield com/zelix/hi.P Z
      // 13a: goto 147
      // 13d: ldc2_w -1844631991032359556
      // 140: lload 2
      // 141: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: iinc 26 1
      // 14a: iload 23
      // 14c: ifeq 08f
      // 14f: aload 5
      // 151: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 154: istore 26
      // 156: aload 0
      // 157: iload 26
      // 159: anewarray 44
      // 15c: putfield com/zelix/hi.D [Lcom/zelix/ie;
      // 15f: lload 2
      // 160: lconst_0
      // 161: lcmp
      // 162: ifle 0f4
      // 165: bipush 0
      // 166: istore 27
      // 168: iload 27
      // 16a: iload 26
      // 16c: if_icmpge 22e
      // 16f: aload 0
      // 170: getfield com/zelix/hi.D [Lcom/zelix/ie;
      // 173: iload 27
      // 175: aload 4
      // 177: checkcast com/zelix/h6
      // 17a: aload 5
      // 17c: aload 6
      // 17e: aload 7
      // 180: aload 8
      // 182: aload 10
      // 184: aload 11
      // 186: aload 24
      // 188: lload 14
      // 18a: bipush 9
      // 18c: anewarray 155
      // 18f: dup_x2
      // 190: dup_x2
      // 191: pop
      // 192: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 195: bipush 8
      // 197: swap
      // 198: aastore
      // 199: dup_x1
      // 19a: swap
      // 19b: bipush 7
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 6
      // 1a3: swap
      // 1a4: aastore
      // 1a5: dup_x1
      // 1a6: swap
      // 1a7: bipush 5
      // 1a8: swap
      // 1a9: aastore
      // 1aa: dup_x1
      // 1ab: swap
      // 1ac: bipush 4
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x1
      // 1b0: swap
      // 1b1: bipush 3
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x1
      // 1b5: swap
      // 1b6: bipush 2
      // 1b7: swap
      // 1b8: aastore
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: bipush 1
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: bipush 0
      // 1c1: swap
      // 1c2: aastore
      // 1c3: ldc2_w -417815470006117562
      // 1c6: lload 2
      // 1c7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: aastore
      // 1cd: iload 23
      // 1cf: lload 2
      // 1d0: lconst_0
      // 1d1: lcmp
      // 1d2: ifle 22b
      // 1d5: ifne 229
      // 1d8: aload 0
      // 1d9: getfield com/zelix/hi.D [Lcom/zelix/ie;
      // 1dc: iload 27
      // 1de: aaload
      // 1df: bipush 0
      // 1e0: anewarray 155
      // 1e3: ldc2_w -311818202963580680
      // 1e6: lload 2
      // 1e7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: iload 23
      // 1ee: lload 2
      // 1ef: lconst_0
      // 1f0: lcmp
      // 1f1: ifle 258
      // 1f4: ifne 257
      // 1f7: goto 204
      // 1fa: ldc2_w -1844631991032359556
      // 1fd: lload 2
      // 1fe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: ifne 226
      // 207: goto 214
      // 20a: ldc2_w -1844631991032359556
      // 20d: lload 2
      // 20e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: aload 0
      // 215: bipush 0
      // 216: putfield com/zelix/hi.P Z
      // 219: goto 226
      // 21c: ldc2_w -1844631991032359556
      // 21f: lload 2
      // 220: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: athrow
      // 226: iinc 27 1
      // 229: iload 23
      // 22b: ifeq 168
      // 22e: aload 9
      // 230: lload 21
      // 232: invokevirtual com/zelix/wp.C (J)I
      // 235: istore 27
      // 237: iload 23
      // 239: lload 2
      // 23a: lconst_0
      // 23b: lcmp
      // 23c: iflt 1cf
      // 23f: lload 2
      // 240: lconst_0
      // 241: lcmp
      // 242: ifle 27e
      // 245: ifne 276
      // 248: iload 27
      // 24a: goto 257
      // 24d: ldc2_w -1844631991032359556
      // 250: lload 2
      // 251: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: bipush -1
      // 258: if_icmpne 281
      // 25b: aload 0
      // 25c: aload 0
      // 25d: ldc2_w -376390803473728156
      // 260: lload 2
      // 261: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: putfield com/zelix/hi.c I
      // 269: goto 276
      // 26c: ldc2_w -1844631991032359556
      // 26f: lload 2
      // 270: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: athrow
      // 276: lload 2
      // 277: lconst_0
      // 278: lcmp
      // 279: ifle 2bd
      // 27c: iload 23
      // 27e: ifeq 2a1
      // 281: aload 0
      // 282: iload 27
      // 284: bipush 1
      // 285: iadd
      // 286: aload 0
      // 287: ldc2_w -376390803473728156
      // 28a: lload 2
      // 28b: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: iadd
      // 291: putfield com/zelix/hi.c I
      // 294: goto 2a1
      // 297: ldc2_w -1844631991032359556
      // 29a: lload 2
      // 29b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: aload 9
      // 2a3: aload 0
      // 2a4: getfield com/zelix/hi.c I
      // 2a7: invokevirtual com/zelix/wp.V (I)V
      // 2aa: aload 6
      // 2ac: aload 24
      // 2ae: aload 0
      // 2af: getfield com/zelix/hi.c I
      // 2b2: lload 12
      // 2b4: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 2b7: aload 0
      // 2b8: lload 16
      // 2ba: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 2bd: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Irreducible bytecode was duplicated to produce valid code
   public int z(long var1) {
      long var10001 = var1 ^ 116660075572968L;
      int var3 = (int)((var1 ^ 116660075572968L) >>> 32);
      int var4 = (int)((var1 ^ 116660075572968L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var7 = 1;
      int var8 = this.a.length;
      int var9 = this.D.length;
      int var10000 = x44.a<"s">(-186072575882441472L, var1);
      var7 += 2;
      byte var6 = (byte)var10000;
      var7 += 2;
      int var10 = 0;

      label83: {
         label67:
         while (true) {
            if (var10 < var8) {
               var7 += this.a[var10].E(var3, (short)var4, (char)var5);

               try {
                  var10++;
               } catch (gj var12) {
                  boolean var19 = false;
                  throw x44.a<"s">(var12, -1760650403892898678L, var1);
               }

               do {
                  try {
                     var10000 = var6;
                     if (var1 < 0L) {
                        break label83;
                     }

                     if (var6 == 0) {
                        break label67;
                     }

                     if (var6 != 0) {
                        continue label67;
                     }
                  } catch (gj var11) {
                     boolean var20 = false;
                     throw x44.a<"s">(var11, -1760650403892898678L, var1);
                  }
               } while (var1 <= 0L);
            }

            var7 += 2;
            break;
         }

         var10000 = (byte)0;
      }

      var10 = var10000;

      label46:
      while (true) {
         if (var10 < var9) {
            var10000 = var7 + this.D[var10].E(var3, (short)var4, (char)var5);
            if (var1 > 0L) {
               if (var6 == 0) {
                  break;
               }

               var7 = var10000;
               var10++;
               var10000 = var6;
            }

            if (var10000 != 0) {
               continue;
            }
         }

         while (var1 < 0L) {
            if (var6 != 0) {
               continue label46;
            }
         }

         var10000 = var7;
         break;
      }

      return var10000;
   }

   void N(long param1, _8l param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w -6348162585463318644
      // 0c: lload 1
      // 0d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: aload 0
      // 13: getfield com/zelix/hi.a [Lcom/zelix/ie;
      // 16: arraylength
      // 17: istore 7
      // 19: aload 0
      // 1a: getfield com/zelix/hi.D [Lcom/zelix/ie;
      // 1d: arraylength
      // 1e: istore 8
      // 20: bipush 0
      // 21: istore 9
      // 23: istore 6
      // 25: iload 9
      // 27: iload 7
      // 29: if_icmpge 5f
      // 2c: aload 0
      // 2d: getfield com/zelix/hi.a [Lcom/zelix/ie;
      // 30: iload 9
      // 32: aaload
      // 33: lload 4
      // 35: aload 3
      // 36: invokevirtual com/zelix/ie.N (JLcom/zelix/_8l;)V
      // 39: iinc 9 1
      // 3c: iload 6
      // 3e: lload 1
      // 3f: lconst_0
      // 40: lcmp
      // 41: ifle 64
      // 44: ifeq 62
      // 47: iload 6
      // 49: ifne 25
      // 4c: lload 1
      // 4d: lconst_0
      // 4e: lcmp
      // 4f: ifle 3c
      // 52: goto 5f
      // 55: ldc2_w -4819751068784292346
      // 58: lload 1
      // 59: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: bipush 0
      // 60: istore 9
      // 62: iload 9
      // 64: lload 1
      // 65: lconst_0
      // 66: lcmp
      // 67: ifle 81
      // 6a: iload 8
      // 6c: if_icmpge 97
      // 6f: aload 0
      // 70: getfield com/zelix/hi.D [Lcom/zelix/ie;
      // 73: iload 9
      // 75: aaload
      // 76: lload 4
      // 78: aload 3
      // 79: invokevirtual com/zelix/ie.N (JLcom/zelix/_8l;)V
      // 7c: iinc 9 1
      // 7f: iload 6
      // 81: ifne 62
      // 84: lload 1
      // 85: lconst_0
      // 86: lcmp
      // 87: ifle 62
      // 8a: goto 97
      // 8d: ldc2_w -4819751068784292346
      // 90: lload 1
      // 91: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: return
   }

   public hi(h6 var1, int var2, _op var3, ie[] var4, ie[] var5, long var6) {
      var6 = b ^ var6;
      super(var1);
      this.M = c<"a">(11678, 4949617573121875570L ^ var6);
      this.W = var3;
      this.u = var2;
      this.c = var3.W();
      this.D = var4;
      this.a = var5;
   }

   protected void W(DataOutputStream param1, wp param2, Map param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:31 from source 28_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: lload 4
      // 02: dup2
      // 03: ldc2_w 129981310600266
      // 06: lxor
      // 07: dup2
      // 08: bipush 32
      // 0a: lushr
      // 0b: l2i
      // 0c: istore 6
      // 0e: dup2
      // 0f: bipush 32
      // 11: lshl
      // 12: bipush 48
      // 14: lushr
      // 15: l2i
      // 16: istore 7
      // 18: dup2
      // 19: bipush 48
      // 1b: lshl
      // 1c: bipush 48
      // 1e: lushr
      // 1f: l2i
      // 20: istore 8
      // 22: pop2
      // 23: pop2
      // 24: aload 0
      // 25: getfield com/zelix/hi.a [Lcom/zelix/ie;
      // 28: arraylength
      // 29: istore 10
      // 2b: ldc2_w -7311434477302338846
      // 2e: lload 4
      // 30: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 0
      // 36: getfield com/zelix/hi.D [Lcom/zelix/ie;
      // 39: arraylength
      // 3a: istore 11
      // 3c: aload 1
      // 3d: sipush 11678
      // 40: ldc2_w 4949652863514895333
      // 43: lload 4
      // 45: lxor
      // 46: invokedynamic a (IJ)I bsm=com/zelix/hi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 4e: aload 1
      // 4f: aload 0
      // 50: ldc2_w -7146419504261358736
      // 53: lload 4
      // 55: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 5d: istore 9
      // 5f: aload 1
      // 60: iload 10
      // 62: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 65: bipush 0
      // 66: istore 12
      // 68: iload 12
      // 6a: iload 10
      // 6c: if_icmpge ab
      // 6f: aload 0
      // 70: getfield com/zelix/hi.a [Lcom/zelix/ie;
      // 73: iload 12
      // 75: aaload
      // 76: aload 1
      // 77: iload 6
      // 79: iload 7
      // 7b: i2c
      // 7c: iload 8
      // 7e: aload 3
      // 7f: invokevirtual com/zelix/ie.b (Ljava/io/DataOutputStream;ICILjava/util/Map;)V
      // 82: iinc 12 1
      // 85: iload 9
      // 87: lload 4
      // 89: lconst_0
      // 8a: lcmp
      // 8b: iflt b2
      // 8e: ifeq b1
      // 91: iload 9
      // 93: ifne 68
      // 96: lload 4
      // 98: lconst_0
      // 99: lcmp
      // 9a: ifle 85
      // 9d: goto ab
      // a0: ldc2_w -9191117692267089048
      // a3: lload 4
      // a5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: aload 1
      // ac: iload 11
      // ae: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // b1: bipush 0
      // b2: istore 12
      // b4: iload 12
      // b6: iload 11
      // b8: if_icmpge d6
      // bb: aload 0
      // bc: getfield com/zelix/hi.D [Lcom/zelix/ie;
      // bf: iload 12
      // c1: aaload
      // c2: aload 1
      // c3: iload 6
      // c5: iload 7
      // c7: i2c
      // c8: iload 8
      // ca: aload 3
      // cb: invokevirtual com/zelix/ie.b (Ljava/io/DataOutputStream;ICILjava/util/Map;)V
      // ce: iinc 12 1
      // d1: iload 9
      // d3: ifne b4
      // d6: lload 4
      // d8: lconst_0
      // d9: lcmp
      // da: iflt d1
      // dd: return
   }

   static {
      long var0 = b ^ 112488494274466L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "\u000e¨\u0080\u0093ê\u0080\u0094\u0089\u0089ÖõïH3&æ";
      int var7 = "\u000e¨\u0080\u0093ê\u0080\u0094\u0089\u0089ÖõïH3&æ".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
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
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      e = var8;
      i = new Integer[2];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22608;
      if (i[var3] == null) {
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/hi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/hi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
