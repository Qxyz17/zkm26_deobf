package com.zelix;

import java.io.PrintWriter;
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

public class hh extends h4 implements _zv {
   boolean h;
   int x;
   id[] j;
   byte[] o;
   private static final long a = ess.a(-3511256650324581262L, -6956334674271367695L, MethodHandles.lookup().lookupClass()).a(140660841422959L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   void r(Object[] var1) {
      ArrayList var2 = (ArrayList)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      boolean var5 = x44.a<"t">(-5886904664612954585L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"h">(this, -5821492796846123764L, var3);
            if (!var5) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var7) {
            throw x44.a<"t">(var7, -5829199612414367908L, var3);
         }

         var10000 = 0;
      }

      int var6 = var10000;

      while (var6 < this.j.length) {
         var2.add(this.j[var6]);
         var6++;
         if (!var5) {
            break;
         }
      }
   }

   void T(Object[] var1) {
      w var2 = (w)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 105236823161621L;
      boolean var7 = x44.a<"v">(3589624899605824916L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"j">(this, 3305607932307855334L, var3);
            if (var7) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var9) {
            throw x44.a<"v">(var9, 3310288756575298998L, var3);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < this.j.length) {
         x44.a<"n">(this.j[var8], new Object[]{var5, var2}, 2992245854229225394L, var3);
         var8++;
         if (var7) {
            break;
         }
      }
   }

   public boolean v(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: pop
      // 16: getstatic com/zelix/hh.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w -1001860048725227940
      // 1f: lload 3
      // 20: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: aload 0
      // 28: ldc2_w -1290380604376312786
      // 2b: lload 3
      // 2c: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: iload 5
      // 33: ifne 53
      // 36: ifne 52
      // 39: goto 46
      // 3c: ldc2_w -1281054887322900866
      // 3f: lload 3
      // 40: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 0
      // 47: ireturn
      // 48: ldc2_w -1281054887322900866
      // 4b: lload 3
      // 4c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 0
      // 53: istore 6
      // 55: iload 6
      // 57: aload 0
      // 58: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 5b: arraylength
      // 5c: if_icmpge b4
      // 5f: aload 0
      // 60: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 63: iload 6
      // 65: aaload
      // 66: invokevirtual com/zelix/id.q ()I
      // 69: iload 5
      // 6b: lload 3
      // 6c: lconst_0
      // 6d: lcmp
      // 6e: iflt 76
      // 71: ifne bb
      // 74: iload 5
      // 76: ifne ab
      // 79: goto 86
      // 7c: ldc2_w -1281054887322900866
      // 7f: lload 3
      // 80: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: lload 3
      // 87: lconst_0
      // 88: lcmp
      // 89: ifle b1
      // 8c: iload 2
      // 8d: if_icmpne ac
      // 90: goto 9d
      // 93: ldc2_w -1281054887322900866
      // 96: lload 3
      // 97: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto ab
      // a1: ldc2_w -1281054887322900866
      // a4: lload 3
      // a5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: ireturn
      // ac: iinc 6 1
      // af: iload 5
      // b1: ifeq 55
      // b4: lload 3
      // b5: lconst_0
      // b6: lcmp
      // b7: iflt 5f
      // ba: bipush 0
      // bb: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public int[] q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int[] var5 = new int[this.x];
      boolean var10000 = x44.a<"u">(2307144885838549102L, var2);
      int var6 = 0;
      boolean var4 = var10000;
      id[] var7 = this.j;
      int var8 = var7.length;
      int var9 = 0;

      label39:
      while (var9 < var8) {
         id var10 = var7[var9];

         try {
            if (var2 <= 0L) {
               return var5;
            }

            var5[var6++] = var10.q();
            var9++;
         } catch (gj var12) {
            boolean var10001 = false;
            throw x44.a<"u">(var12, 2401446366859618581L, var2);
         }

         do {
            try {
               if (!var4) {
                  return var5;
               }

               if (var4) {
                  continue label39;
               }
            } catch (gj var11) {
               boolean var17 = false;
               throw x44.a<"u">(var11, 2401446366859618581L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      x44.a<"u">(var5, 4558332582178922255L, var2);
      return var5;
   }

   protected void j(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 4
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 2
      // 22: pop
      // 23: lload 5
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w -3106497998795710297
      // 30: lload 5
      // 32: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 0
      // 38: aload 3
      // 39: lload 7
      // 3b: aload 4
      // 3d: aload 2
      // 3e: bipush 4
      // 3f: anewarray 175
      // 42: dup_x1
      // 43: swap
      // 44: bipush 3
      // 45: swap
      // 46: aastore
      // 47: dup_x1
      // 48: swap
      // 49: bipush 2
      // 4a: swap
      // 4b: aastore
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 1
      // 53: swap
      // 54: aastore
      // 55: dup_x1
      // 56: swap
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 5d: istore 9
      // 5f: aload 0
      // 60: ldc2_w -3968646872522116395
      // 63: lload 5
      // 65: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: iload 9
      // 6c: ifne 97
      // 6f: ifeq e2
      // 72: goto 80
      // 75: ldc2_w -3980080079025405819
      // 78: lload 5
      // 7a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 3
      // 81: aload 0
      // 82: getfield com/zelix/hh.x I
      // 85: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 88: bipush 0
      // 89: goto 97
      // 8c: ldc2_w -3980080079025405819
      // 8f: lload 5
      // 91: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: istore 10
      // 99: iload 10
      // 9b: aload 0
      // 9c: getfield com/zelix/hh.x I
      // 9f: if_icmpge d6
      // a2: aload 0
      // a3: getfield com/zelix/hh.j [Lcom/zelix/id;
      // a6: iload 10
      // a8: aaload
      // a9: aload 3
      // aa: invokevirtual com/zelix/id.W (Ljava/io/DataOutputStream;)V
      // ad: iinc 10 1
      // b0: iload 9
      // b2: lload 5
      // b4: lconst_0
      // b5: lcmp
      // b6: ifle be
      // b9: ifne ff
      // bc: iload 9
      // be: ifeq 99
      // c1: lload 5
      // c3: lconst_0
      // c4: lcmp
      // c5: ifle b0
      // c8: goto d6
      // cb: ldc2_w -3980080079025405819
      // ce: lload 5
      // d0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: athrow
      // d6: lload 5
      // d8: lconst_0
      // d9: lcmp
      // da: ifle f1
      // dd: iload 9
      // df: ifeq ff
      // e2: aload 3
      // e3: aload 0
      // e4: ldc2_w -4026960525001338492
      // e7: lload 5
      // e9: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ee: invokevirtual java/io/DataOutputStream.write ([B)V
      // f1: goto ff
      // f4: ldc2_w -3980080079025405819
      // f7: lload 5
      // f9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fe: athrow
      // ff: return
   }

   void Y(Object[] param1) {
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
      // 004: checkcast java/util/HashSet
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/w
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/hh.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 106195279954192
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 72992894447635
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w 5450962543813032911
      // 037: lload 4
      // 039: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: istore 10
      // 040: aload 0
      // 041: ldc2_w 5394698608160616676
      // 044: lload 4
      // 046: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: iload 10
      // 04d: ifeq 07a
      // 050: ifeq 1f2
      // 053: goto 061
      // 056: ldc2_w 5400575982408729268
      // 059: lload 4
      // 05b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: aload 3
      // 062: ldc2_w 5401186664356970838
      // 065: lload 4
      // 067: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: goto 07a
      // 06f: ldc2_w 5400575982408729268
      // 072: lload 4
      // 074: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: ifle 1f2
      // 07d: new java/util/ArrayList
      // 080: dup
      // 081: aload 0
      // 082: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 085: arraylength
      // 086: invokespecial java/util/ArrayList.<init> (I)V
      // 089: astore 11
      // 08b: bipush 0
      // 08c: istore 12
      // 08e: iload 12
      // 090: aload 0
      // 091: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 094: arraylength
      // 095: if_icmpge 189
      // 098: aload 0
      // 099: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 09c: iload 12
      // 09e: aaload
      // 09f: bipush 0
      // 0a0: anewarray 175
      // 0a3: ldc2_w 5613078917509932525
      // 0a6: lload 4
      // 0a8: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: astore 13
      // 0af: aload 3
      // 0b0: aload 13
      // 0b2: ldc2_w 6309283026667480372
      // 0b5: lload 4
      // 0b7: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: iload 10
      // 0be: lload 4
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifle 197
      // 0c5: ifeq 195
      // 0c8: iload 10
      // 0ca: ifeq 155
      // 0cd: goto 0db
      // 0d0: ldc2_w 5400575982408729268
      // 0d3: lload 4
      // 0d5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: lload 4
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: iflt 147
      // 0e2: ifne 11a
      // 0e5: goto 0f3
      // 0e8: ldc2_w 5400575982408729268
      // 0eb: lload 4
      // 0ed: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 11
      // 0f5: aload 0
      // 0f6: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 0f9: iload 12
      // 0fb: aaload
      // 0fc: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0ff: pop
      // 100: iload 10
      // 102: lload 4
      // 104: lconst_0
      // 105: lcmp
      // 106: ifle 186
      // 109: ifne 181
      // 10c: goto 11a
      // 10f: ldc2_w 5400575982408729268
      // 112: lload 4
      // 114: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 2
      // 11b: aload 13
      // 11d: aload 0
      // 11e: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 121: iload 12
      // 123: aaload
      // 124: lload 6
      // 126: bipush 3
      // 127: anewarray 175
      // 12a: dup_x2
      // 12b: dup_x2
      // 12c: pop
      // 12d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 130: bipush 2
      // 131: swap
      // 132: aastore
      // 133: dup_x1
      // 134: swap
      // 135: bipush 1
      // 136: swap
      // 137: aastore
      // 138: dup_x1
      // 139: swap
      // 13a: bipush 0
      // 13b: swap
      // 13c: aastore
      // 13d: ldc2_w 5271128952640850131
      // 140: lload 4
      // 142: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: goto 155
      // 14a: ldc2_w 5400575982408729268
      // 14d: lload 4
      // 14f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: istore 14
      // 157: aload 13
      // 159: ldc2_w 5325930585706879930
      // 15c: lload 4
      // 15e: invokedynamic m (JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: lload 8
      // 165: bipush 2
      // 166: anewarray 175
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 1
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: ldc2_w 5332918024018113578
      // 17a: lload 4
      // 17c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: iinc 12 1
      // 184: iload 10
      // 186: ifne 08e
      // 189: aload 11
      // 18b: lload 4
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: iflt 1b9
      // 192: invokevirtual java/util/ArrayList.size ()I
      // 195: iload 10
      // 197: lload 4
      // 199: lconst_0
      // 19a: lcmp
      // 19b: iflt 1a6
      // 19e: ifeq 1ca
      // 1a1: aload 0
      // 1a2: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 1a5: arraylength
      // 1a6: if_icmpge 1f2
      // 1a9: goto 1b7
      // 1ac: ldc2_w 5400575982408729268
      // 1af: lload 4
      // 1b1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: aload 11
      // 1b9: invokevirtual java/util/ArrayList.size ()I
      // 1bc: goto 1ca
      // 1bf: ldc2_w 5400575982408729268
      // 1c2: lload 4
      // 1c4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: anewarray 105
      // 1cd: astore 12
      // 1cf: aload 0
      // 1d0: aload 11
      // 1d2: aload 12
      // 1d4: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d7: checkcast [Lcom/zelix/id;
      // 1da: putfield com/zelix/hh.j [Lcom/zelix/id;
      // 1dd: aload 0
      // 1de: aload 0
      // 1df: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 1e2: arraylength
      // 1e3: putfield com/zelix/hh.x I
      // 1e6: aload 0
      // 1e7: aload 0
      // 1e8: getfield com/zelix/hh.x I
      // 1eb: bipush 4
      // 1ec: imul
      // 1ed: bipush 2
      // 1ee: iadd
      // 1ef: putfield com/zelix/hh.C I
      // 1f2: return
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 10727274753381L;
      long var6 = var1 ^ 0L;
      byte var10000 = x44.a<"w">(-5003033307729260843L, var1);
      var3.H(this.c, this, this.x(), var4);
      boolean var8 = (boolean)var10000;

      label28: {
         try {
            var10000 = x44.a<"k">(this, -6440517435902468953L, var1);
            if (var8) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var10) {
            throw x44.a<"w">(var10, -6435136508476428553L, var1);
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < this.x) {
         this.j[var9].N(var6, var3);
         var9++;
         if (var8) {
            break;
         }
      }
   }

   hh(h8 param1, int param2, String param3, _xx param4, _y4 param5, int param6, PrintWriter param7, _y4 param8, byte param9, int param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 6
      // 002: i2l
      // 003: bipush 32
      // 005: lshl
      // 006: iload 9
      // 008: i2l
      // 009: bipush 56
      // 00b: lshl
      // 00c: bipush 32
      // 00e: lushr
      // 00f: lor
      // 010: iload 10
      // 012: i2l
      // 013: bipush 40
      // 015: lshl
      // 016: bipush 40
      // 018: lushr
      // 019: lor
      // 01a: getstatic com/zelix/hh.a J
      // 01d: lxor
      // 01e: lstore 11
      // 020: lload 11
      // 022: dup2
      // 023: ldc2_w 117929333489424
      // 026: lxor
      // 027: lstore 13
      // 029: dup2
      // 02a: ldc2_w 106606571552356
      // 02d: lxor
      // 02e: lstore 15
      // 030: dup2
      // 031: ldc2_w 86634500711610
      // 034: lxor
      // 035: lstore 17
      // 037: pop2
      // 038: ldc2_w -4362640111316372706
      // 03b: lload 11
      // 03d: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: aload 0
      // 043: aload 1
      // 044: iload 2
      // 045: aload 3
      // 046: lload 13
      // 048: aload 4
      // 04a: aload 5
      // 04c: invokespecial com/zelix/h4.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 04f: istore 19
      // 051: aload 0
      // 052: bipush 1
      // 053: ldc2_w -4464002167790389195
      // 056: lload 11
      // 058: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: aload 0
      // 05e: getfield com/zelix/hh.C I
      // 061: iload 19
      // 063: ifeq 2ab
      // 066: bipush 2
      // 067: if_icmplt 214
      // 06a: goto 078
      // 06d: ldc2_w -4457491206417937819
      // 070: lload 11
      // 072: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: aload 0
      // 079: aload 4
      // 07b: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 07e: putfield com/zelix/hh.x I
      // 081: aload 0
      // 082: getfield com/zelix/hh.x I
      // 085: bipush 4
      // 086: imul
      // 087: bipush 2
      // 088: iadd
      // 089: iload 9
      // 08b: ifgt 20c
      // 08e: iload 19
      // 090: ifeq 209
      // 093: goto 0a1
      // 096: ldc2_w -4457491206417937819
      // 099: lload 11
      // 09b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield com/zelix/hh.C I
      // 0a5: if_icmpne 111
      // 0a8: goto 0b6
      // 0ab: ldc2_w -4457491206417937819
      // 0ae: lload 11
      // 0b0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: aload 0
      // 0b8: getfield com/zelix/hh.x I
      // 0bb: anewarray 105
      // 0be: putfield com/zelix/hh.j [Lcom/zelix/id;
      // 0c1: bipush 0
      // 0c2: istore 20
      // 0c4: iload 20
      // 0c6: aload 0
      // 0c7: getfield com/zelix/hh.x I
      // 0ca: if_icmpge 107
      // 0cd: aload 0
      // 0ce: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 0d1: iload 20
      // 0d3: new com/zelix/id
      // 0d6: dup
      // 0d7: lload 15
      // 0d9: aload 0
      // 0da: aload 4
      // 0dc: aload 8
      // 0de: invokespecial com/zelix/id.<init> (JLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 0e1: aastore
      // 0e2: iinc 20 1
      // 0e5: iload 19
      // 0e7: iload 6
      // 0e9: iflt 0f1
      // 0ec: ifeq 2ac
      // 0ef: iload 19
      // 0f1: ifne 0c4
      // 0f4: iload 6
      // 0f6: ifle 0e5
      // 0f9: goto 107
      // 0fc: ldc2_w -4457491206417937819
      // 0ff: lload 11
      // 101: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: iload 19
      // 109: iload 10
      // 10b: ifle 1fb
      // 10e: ifne 2ac
      // 111: aload 0
      // 112: bipush 0
      // 113: ldc2_w -4464002167790389195
      // 116: lload 11
      // 118: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: aload 7
      // 11f: new java/lang/StringBuilder
      // 122: dup
      // 123: invokespecial java/lang/StringBuilder.<init> ()V
      // 126: sipush 26884
      // 129: ldc2_w 5596325014213027446
      // 12c: lload 11
      // 12e: lxor
      // 12f: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: aload 0
      // 138: lload 17
      // 13a: invokevirtual com/zelix/hh.j (J)Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: sipush 22807
      // 143: ldc2_w 8494926540979983968
      // 146: lload 11
      // 148: lxor
      // 149: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: sipush 13139
      // 154: ldc2_w 6570408808089205798
      // 157: lload 11
      // 159: lxor
      // 15a: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 162: sipush 8281
      // 165: ldc2_w 7151305986800496424
      // 168: lload 11
      // 16a: lxor
      // 16b: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 176: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 179: aload 0
      // 17a: aload 0
      // 17b: getfield com/zelix/hh.C I
      // 17e: newarray 8
      // 180: ldc2_w -4396223929872852124
      // 183: lload 11
      // 185: invokedynamic v (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: aload 0
      // 18b: ldc2_w -4396223929872852124
      // 18e: lload 11
      // 190: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: bipush 0
      // 196: aload 0
      // 197: getfield com/zelix/hh.x I
      // 19a: sipush 14663
      // 19d: ldc2_w 6047495427829260731
      // 1a0: lload 11
      // 1a2: lxor
      // 1a3: invokedynamic g (IJ)I bsm=com/zelix/hh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: iushr
      // 1a9: sipush 7380
      // 1ac: ldc2_w 275957603764159529
      // 1af: lload 11
      // 1b1: lxor
      // 1b2: invokedynamic g (IJ)I bsm=com/zelix/hh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: iand
      // 1b8: i2b
      // 1b9: bastore
      // 1ba: aload 0
      // 1bb: ldc2_w -4396223929872852124
      // 1be: lload 11
      // 1c0: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: bipush 1
      // 1c6: aload 0
      // 1c7: getfield com/zelix/hh.x I
      // 1ca: bipush 0
      // 1cb: iushr
      // 1cc: sipush 4444
      // 1cf: ldc2_w 3045646647835052451
      // 1d2: lload 11
      // 1d4: lxor
      // 1d5: invokedynamic g (IJ)I bsm=com/zelix/hh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: iand
      // 1db: i2b
      // 1dc: bastore
      // 1dd: aload 4
      // 1df: aload 0
      // 1e0: ldc2_w -4396223929872852124
      // 1e3: lload 11
      // 1e5: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: bipush 2
      // 1eb: aload 0
      // 1ec: getfield com/zelix/hh.C I
      // 1ef: bipush 2
      // 1f0: isub
      // 1f1: ldc2_w -2373430286258037300
      // 1f4: lload 11
      // 1f6: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: goto 209
      // 1fe: ldc2_w -4457491206417937819
      // 201: lload 11
      // 203: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: pop
      // 20a: iload 19
      // 20c: iload 9
      // 20e: ifge 29d
      // 211: ifne 2ac
      // 214: aload 0
      // 215: bipush 0
      // 216: ldc2_w -4464002167790389195
      // 219: lload 11
      // 21b: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: aload 7
      // 222: new java/lang/StringBuilder
      // 225: dup
      // 226: invokespecial java/lang/StringBuilder.<init> ()V
      // 229: sipush 19058
      // 22c: ldc2_w 3868098463722652930
      // 22f: lload 11
      // 231: lxor
      // 232: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23a: aload 0
      // 23b: lload 17
      // 23d: invokevirtual com/zelix/hh.j (J)Ljava/lang/String;
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: sipush 18019
      // 246: ldc2_w 147080094447225109
      // 249: lload 11
      // 24b: lxor
      // 24c: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 254: sipush 23817
      // 257: ldc2_w 2821027548766196349
      // 25a: lload 11
      // 25c: lxor
      // 25d: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 265: sipush 23821
      // 268: ldc2_w 7002144028495663742
      // 26b: lload 11
      // 26d: lxor
      // 26e: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/hh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 276: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 279: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 27c: aload 0
      // 27d: aload 0
      // 27e: getfield com/zelix/hh.C I
      // 281: newarray 8
      // 283: ldc2_w -4396223929872852124
      // 286: lload 11
      // 288: invokedynamic v (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: aload 4
      // 28f: aload 0
      // 290: ldc2_w -4396223929872852124
      // 293: lload 11
      // 295: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: invokevirtual com/zelix/_xx.read ([B)I
      // 29d: goto 2ab
      // 2a0: ldc2_w -4457491206417937819
      // 2a3: lload 11
      // 2a5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: athrow
      // 2ab: pop
      // 2ac: return
   }

   protected void O(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -8511028589403193946
      // 20: lload 2
      // 21: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: lload 5
      // 29: aload 4
      // 2b: bipush 2
      // 2c: anewarray 175
      // 2f: dup_x1
      // 30: swap
      // 31: bipush 1
      // 32: swap
      // 33: aastore
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: invokespecial com/zelix/h4.O ([Ljava/lang/Object;)V
      // 40: istore 7
      // 42: aload 0
      // 43: ldc2_w -7643232394242756652
      // 46: lload 2
      // 47: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: iload 7
      // 4e: ifne 78
      // 51: ifeq c0
      // 54: goto 61
      // 57: ldc2_w -7655369150211465852
      // 5a: lload 2
      // 5b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 4
      // 63: aload 0
      // 64: getfield com/zelix/hh.x I
      // 67: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 6a: bipush 0
      // 6b: goto 78
      // 6e: ldc2_w -7655369150211465852
      // 71: lload 2
      // 72: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: istore 8
      // 7a: iload 8
      // 7c: aload 0
      // 7d: getfield com/zelix/hh.x I
      // 80: if_icmpge b5
      // 83: aload 0
      // 84: getfield com/zelix/hh.j [Lcom/zelix/id;
      // 87: iload 8
      // 89: aaload
      // 8a: aload 4
      // 8c: invokevirtual com/zelix/id.W (Ljava/io/DataOutputStream;)V
      // 8f: iinc 8 1
      // 92: iload 7
      // 94: lload 2
      // 95: lconst_0
      // 96: lcmp
      // 97: iflt 9f
      // 9a: ifne dc
      // 9d: iload 7
      // 9f: ifeq 7a
      // a2: lload 2
      // a3: lconst_0
      // a4: lcmp
      // a5: ifle 92
      // a8: goto b5
      // ab: ldc2_w -7655369150211465852
      // ae: lload 2
      // af: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: lload 2
      // b6: lconst_0
      // b7: lcmp
      // b8: iflt cf
      // bb: iload 7
      // bd: ifeq dc
      // c0: aload 4
      // c2: aload 0
      // c3: ldc2_w -7702249734161167227
      // c6: lload 2
      // c7: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: invokevirtual java/io/DataOutputStream.write ([B)V
      // cf: goto dc
      // d2: ldc2_w -7655369150211465852
      // d5: lload 2
      // d6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: return
   }

   static {
      long var11 = a ^ 53908876654962L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "\b5·kx.3\u0083ÓÔÈ0r\u0095\u0016Ø\u0010¶ã\u0014!ö,Ý\u0081\u0015Úi%vxÄ.\u0010àâj_¼\u009f\u0081ø÷\u0006ÀXcú]½\u0010\fÃÏ¹³î\u0004\u008f¢@0§º\u0001ù'\u0010\u0015í\u0014C^yFïK/zs]\u001bÊ1\u0010Ø\u009b\u0097ä'±\u001dApå\u0083ù^Ú&\u001b";
      int var19 = "\b5·kx.3\u0083ÓÔÈ0r\u0095\u0016Ø\u0010¶ã\u0014!ö,Ý\u0081\u0015Úi%vxÄ.\u0010àâj_¼\u009f\u0081ø÷\u0006ÀXcú]½\u0010\fÃÏ¹³î\u0004\u008f¢@0§º\u0001ù'\u0010\u0015í\u0014C^yFïK/zs]\u001bÊ1\u0010Ø\u009b\u0097ä'±\u001dApå\u0083ù^Ú&\u001b"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     d = new String[8];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0000ÖKÐ¶µ2Ê÷±_½ñB¡Û|ø:&·}\u009a®";
                     int var5 = "\u0000ÖKÐ¶µ2Ê÷±_½ñB¡Û|ø:&·}\u009a®".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
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
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     f = var6;
                     g = new Integer[3];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "bå(¸\\\u009eBÄWÂåõÝÝ\u008eºYÂÕ\u00adM\u008e?\u00ad»¯\u0097ú·Ý\u0014Z×ÚsM\u000e}»ÐD<£\u009c2B\u001b-L2\u008bZó\u001fæFH\u0093)![\u009a1\u0019Ñ\u009f6ïü\u0093\u0014®¨á\u00985Oî¥8\u0086\u009aô\u009d>¢\u0084Kä¾È¶+»\b\u008a\u001b\u0001\u0084Î%¸t*·©\u0095o98¥\u0086_ïÇðÈÅ4Ç\u0005-<ã\u001fö\"1\"";
                  var19 = "bå(¸\\\u009eBÄWÂåõÝÝ\u008eºYÂÕ\u00adM\u008e?\u00ad»¯\u0097ú·Ý\u0014Z×ÚsM\u000e}»ÐD<£\u009c2B\u001b-L2\u008bZó\u001fæFH\u0093)![\u009a1\u0019Ñ\u009f6ïü\u0093\u0014®¨á\u00985Oî¥8\u0086\u009aô\u009d>¢\u0084Kä¾È¶+»\b\u008a\u001b\u0001\u0084Î%¸t*·©\u0095o98¥\u0086_ïÇðÈÅ4Ç\u0005-<ã\u001fö\"1\""
                     .length();
                  var16 = '8';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16548;
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
            throw new RuntimeException("com/zelix/hh", var10);
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
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/hh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5931;
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/hh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("com/zelix/hh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
