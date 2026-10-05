package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class he extends h4 implements _zv {
   boolean Y;
   int x;
   is[] n;
   byte[] g;
   private static final long a = ess.a(8523917061606864642L, -3137787192012282321L, MethodHandles.lookup().lookupClass()).a(140992548129789L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   int U(Object[] param1) {
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
      // 00e: checkcast java/util/HashSet
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/he.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 21265445431872
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: ldc2_w 6962836761137730788
      // 026: lload 2
      // 027: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 7
      // 02e: aload 0
      // 02f: iload 7
      // 031: ifne 161
      // 034: ldc2_w 7010303346356456902
      // 037: lload 2
      // 038: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: ifnull 160
      // 040: goto 04d
      // 043: ldc2_w 7131848751818696726
      // 046: lload 2
      // 047: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: new java/util/ArrayList
      // 050: dup
      // 051: aload 0
      // 052: ldc2_w 7010303346356456902
      // 055: lload 2
      // 056: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: arraylength
      // 05c: invokespecial java/util/ArrayList.<init> (I)V
      // 05f: astore 8
      // 061: bipush 0
      // 062: istore 9
      // 064: iload 9
      // 066: aload 0
      // 067: ldc2_w 7010303346356456902
      // 06a: lload 2
      // 06b: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: arraylength
      // 071: if_icmpge 0fb
      // 074: aload 0
      // 075: ldc2_w 7010303346356456902
      // 078: lload 2
      // 079: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: iload 9
      // 080: aaload
      // 081: lload 5
      // 083: aload 4
      // 085: bipush 2
      // 086: anewarray 269
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 1
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x2
      // 08f: dup_x2
      // 090: pop
      // 091: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: ldc2_w 8890122136420114000
      // 09a: lload 2
      // 09b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: iload 7
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 10c
      // 0a8: ifne 10a
      // 0ab: iload 7
      // 0ad: ifne 0f2
      // 0b0: goto 0bd
      // 0b3: ldc2_w 7131848751818696726
      // 0b6: lload 2
      // 0b7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: lload 2
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 0f8
      // 0c3: ifne 0f3
      // 0c6: goto 0d3
      // 0c9: ldc2_w 7131848751818696726
      // 0cc: lload 2
      // 0cd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 8
      // 0d5: aload 0
      // 0d6: ldc2_w 7010303346356456902
      // 0d9: lload 2
      // 0da: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: iload 9
      // 0e1: aaload
      // 0e2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0e5: goto 0f2
      // 0e8: ldc2_w 7131848751818696726
      // 0eb: lload 2
      // 0ec: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: pop
      // 0f3: iinc 9 1
      // 0f6: iload 7
      // 0f8: ifeq 064
      // 0fb: aload 8
      // 0fd: invokevirtual java/util/ArrayList.size ()I
      // 100: istore 9
      // 102: lload 2
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 074
      // 108: iload 9
      // 10a: iload 7
      // 10c: lload 2
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: iflt 120
      // 112: ifne 16a
      // 115: aload 0
      // 116: ldc2_w 7010303346356456902
      // 119: lload 2
      // 11a: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: arraylength
      // 120: if_icmpge 160
      // 123: goto 130
      // 126: ldc2_w 7131848751818696726
      // 129: lload 2
      // 12a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 0
      // 131: aload 8
      // 133: iload 9
      // 135: anewarray 391
      // 138: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 13b: checkcast [Lcom/zelix/is;
      // 13e: ldc2_w 7010303346356456902
      // 141: lload 2
      // 142: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/is;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: aload 0
      // 148: iload 9
      // 14a: ldc2_w 9036386449729481323
      // 14d: lload 2
      // 14e: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: goto 160
      // 156: ldc2_w 7131848751818696726
      // 159: lload 2
      // 15a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 0
      // 161: ldc2_w 9036386449729481323
      // 164: lload 2
      // 165: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: ireturn
   }

   public void B(Object[] var1) {
      HashSet var5 = (HashSet)var1[0];
      long var2 = (Long)var1[1];
      HashSet var7 = (HashSet)var1[2];
      HashSet var6 = (HashSet)var1[3];
      HashSet var4 = (HashSet)var1[4];
      var2 = a ^ var2;
      long var8 = var2 ^ 89849731630939L;
      boolean var10 = x44.a<"v">(6645237734390458492L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"j">(this, 6441338205109066806L, var2);
            if (var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"v">(var12, 6800783988908577934L, var2);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"j">(this, 4755772891054692083L, var2)) {
         x44.a<"n">(x44.a<"j">(this, 6760411455183860062L, var2)[var11], new Object[]{var5, var7, var6, var8, var4}, 4896632128549996346L, var2);
         var11++;
         if (var10) {
            break;
         }
      }
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
      // 16: ldc2_w 62568130681193
      // 19: lxor
      // 1a: lstore 5
      // 1c: dup2
      // 1d: ldc2_w 0
      // 20: lxor
      // 21: lstore 7
      // 23: pop2
      // 24: ldc2_w -7740090294292667137
      // 27: lload 2
      // 28: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 0
      // 2e: lload 7
      // 30: aload 4
      // 32: bipush 2
      // 33: anewarray 269
      // 36: dup_x1
      // 37: swap
      // 38: bipush 1
      // 39: swap
      // 3a: aastore
      // 3b: dup_x2
      // 3c: dup_x2
      // 3d: pop
      // 3e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41: bipush 0
      // 42: swap
      // 43: aastore
      // 44: invokespecial com/zelix/h4.O ([Ljava/lang/Object;)V
      // 47: istore 9
      // 49: aload 0
      // 4a: iload 9
      // 4c: ifeq 76
      // 4f: ldc2_w -8305100684699809300
      // 52: lload 2
      // 53: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: ifeq a0
      // 5b: goto 68
      // 5e: ldc2_w -8378000337885232812
      // 61: lload 2
      // 62: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 0
      // 69: goto 76
      // 6c: ldc2_w -8378000337885232812
      // 6f: lload 2
      // 70: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 4
      // 78: lload 5
      // 7a: bipush 2
      // 7b: anewarray 269
      // 7e: dup_x2
      // 7f: dup_x2
      // 80: pop
      // 81: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 84: bipush 1
      // 85: swap
      // 86: aastore
      // 87: dup_x1
      // 88: swap
      // 89: bipush 0
      // 8a: swap
      // 8b: aastore
      // 8c: ldc2_w -8225299070783960583
      // 8f: lload 2
      // 90: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: lload 2
      // 96: lconst_0
      // 97: lcmp
      // 98: iflt af
      // 9b: iload 9
      // 9d: ifne bc
      // a0: aload 4
      // a2: aload 0
      // a3: ldc2_w -7733052785188697307
      // a6: lload 2
      // a7: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: invokevirtual java/io/DataOutputStream.write ([B)V
      // af: goto bc
      // b2: ldc2_w -8378000337885232812
      // b5: lload 2
      // b6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: athrow
      // bc: return
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
      // 08: dup2
      // 09: ldc2_w 10727274753381
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -6348162585463318644
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 8
      // 1b: aload 3
      // 1c: aload 0
      // 1d: getfield com/zelix/he.c Lcom/zelix/mx;
      // 20: aload 0
      // 21: aload 0
      // 22: invokevirtual com/zelix/he.x ()Lcom/zelix/h8;
      // 25: lload 6
      // 27: invokevirtual com/zelix/_8l.H (Lcom/zelix/xl;Ljava/lang/Object;Ljava/lang/Object;J)Z
      // 2a: iload 8
      // 2c: ifeq 58
      // 2f: pop
      // 30: aload 0
      // 31: ldc2_w -4937975636670818313
      // 34: lload 1
      // 35: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: ifnull 8b
      // 3d: goto 4a
      // 40: ldc2_w -5131787775308484057
      // 43: lload 1
      // 44: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 58
      // 4e: ldc2_w -5131787775308484057
      // 51: lload 1
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: istore 9
      // 5a: iload 9
      // 5c: aload 0
      // 5d: ldc2_w -4937975636670818313
      // 60: lload 1
      // 61: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: arraylength
      // 67: if_icmpge 8b
      // 6a: aload 0
      // 6b: ldc2_w -4937975636670818313
      // 6e: lload 1
      // 6f: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: iload 9
      // 76: aaload
      // 77: lload 4
      // 79: aload 3
      // 7a: ldc2_w -6427111769483304793
      // 7d: lload 1
      // 7e: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: iinc 9 1
      // 86: iload 8
      // 88: ifne 5a
      // 8b: return
   }

   is w(Object[] param1) {
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
      // 04: checkcast com/zelix/x9
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/he.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 96704433233563
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 96704433233563
      // 25: lxor
      // 26: lstore 7
      // 28: pop2
      // 29: ldc2_w -8558072887140566703
      // 2c: lload 3
      // 2d: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: istore 9
      // 34: aload 0
      // 35: ldc2_w -7993774978909318078
      // 38: lload 3
      // 39: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: iload 9
      // 40: ifeq 54
      // 43: ifeq ed
      // 46: goto 53
      // 49: ldc2_w -7632070868153754374
      // 4c: lload 3
      // 4d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: bipush 0
      // 54: istore 10
      // 56: iload 10
      // 58: aload 0
      // 59: ldc2_w -8535529908709450105
      // 5c: lload 3
      // 5d: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: if_icmpge ed
      // 65: aload 0
      // 66: ldc2_w -7663546995466897110
      // 69: lload 3
      // 6a: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: iload 10
      // 71: aaload
      // 72: astore 11
      // 74: iload 9
      // 76: lload 3
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt ea
      // 7c: ifeq e8
      // 7f: aload 11
      // 81: ldc2_w -7805150142234029596
      // 84: lload 3
      // 85: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: ifnull e5
      // 8d: goto 9a
      // 90: ldc2_w -7632070868153754374
      // 93: lload 3
      // 94: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: aload 11
      // 9c: iload 9
      // 9e: ifeq e4
      // a1: goto ae
      // a4: ldc2_w -7632070868153754374
      // a7: lload 3
      // a8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: ldc2_w -7805150142234029596
      // b1: lload 3
      // b2: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: lload 5
      // b9: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // bc: aload 2
      // bd: lload 7
      // bf: invokevirtual com/zelix/x9.W (J)Ljava/lang/String;
      // c2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // c5: ifeq e5
      // c8: goto d5
      // cb: ldc2_w -7632070868153754374
      // ce: lload 3
      // cf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: athrow
      // d5: aload 11
      // d7: goto e4
      // da: ldc2_w -7632070868153754374
      // dd: lload 3
      // de: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: athrow
      // e4: areturn
      // e5: iinc 10 1
      // e8: iload 9
      // ea: ifne 56
      // ed: aconst_null
      // ee: areturn
   }

   he(long param1, h8 param3, int param4, String param5, _xx param6, _y4 param7, _y4 param8, PrintWriter param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/he.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 81639093877352
      // 00b: lxor
      // 00c: lstore 10
      // 00e: dup2
      // 00f: ldc2_w 107983176627608
      // 012: lxor
      // 013: lstore 12
      // 015: dup2
      // 016: ldc2_w 130379607351761
      // 019: lxor
      // 01a: lstore 14
      // 01c: dup2
      // 01d: ldc2_w 79880532402217
      // 020: lxor
      // 021: lstore 16
      // 023: dup2
      // 024: ldc2_w 133672536704755
      // 027: lxor
      // 028: lstore 18
      // 02a: dup2
      // 02b: ldc2_w 33142608986657
      // 02e: lxor
      // 02f: lstore 20
      // 031: dup2
      // 032: ldc2_w 107219439577953
      // 035: lxor
      // 036: lstore 22
      // 038: dup2
      // 039: ldc2_w 89912672600572
      // 03c: lxor
      // 03d: lstore 24
      // 03f: dup2
      // 040: ldc2_w 5265372734483
      // 043: lxor
      // 044: lstore 26
      // 046: dup2
      // 047: ldc2_w 44593697338297
      // 04a: lxor
      // 04b: lstore 28
      // 04d: pop2
      // 04e: aload 0
      // 04f: aload 3
      // 050: iload 4
      // 052: aload 5
      // 054: lload 20
      // 056: aload 6
      // 058: aload 7
      // 05a: invokespecial com/zelix/h4.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 05d: ldc2_w -6687052705755261066
      // 060: lload 1
      // 061: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: aload 0
      // 067: bipush 1
      // 068: ldc2_w -6454139281004534980
      // 06b: lload 1
      // 06c: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: istore 30
      // 073: aload 0
      // 074: getfield com/zelix/he.C I
      // 077: iload 30
      // 079: ifne 5f5
      // 07c: bipush 2
      // 07d: if_icmplt 54f
      // 080: goto 08d
      // 083: ldc2_w -6815268408398533756
      // 086: lload 1
      // 087: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: aload 0
      // 08e: aload 6
      // 090: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 093: ldc2_w -4686674618494834183
      // 096: lload 1
      // 097: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: aload 0
      // 09d: ldc2_w -4686674618494834183
      // 0a0: lload 1
      // 0a1: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: sipush 24094
      // 0a9: ldc2_w 1039789846021557707
      // 0ac: lload 1
      // 0ad: lxor
      // 0ae: invokedynamic c (IJ)I bsm=com/zelix/he.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: imul
      // 0b4: bipush 2
      // 0b5: iadd
      // 0b6: lload 1
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 54c
      // 0bc: iload 30
      // 0be: ifne 543
      // 0c1: goto 0ce
      // 0c4: ldc2_w -6815268408398533756
      // 0c7: lload 1
      // 0c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield com/zelix/he.C I
      // 0d2: if_icmpne 436
      // 0d5: goto 0e2
      // 0d8: ldc2_w -6815268408398533756
      // 0db: lload 1
      // 0dc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: aload 0
      // 0e4: ldc2_w -4686674618494834183
      // 0e7: lload 1
      // 0e8: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: anewarray 391
      // 0f0: ldc2_w -6711561797418168748
      // 0f3: lload 1
      // 0f4: invokedynamic w (Ljava/lang/Object;[Lcom/zelix/is;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: bipush 0
      // 0fa: istore 31
      // 0fc: iload 31
      // 0fe: aload 0
      // 0ff: ldc2_w -4686674618494834183
      // 102: lload 1
      // 103: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: if_icmpge 3a8
      // 10b: aload 0
      // 10c: ldc2_w -6711561797418168748
      // 10f: lload 1
      // 110: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iload 31
      // 117: new com/zelix/is
      // 11a: dup
      // 11b: aload 0
      // 11c: aload 6
      // 11e: lload 14
      // 120: aload 7
      // 122: aload 8
      // 124: aload 9
      // 126: invokespecial com/zelix/is.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;JLcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;)V
      // 129: aastore
      // 12a: iload 30
      // 12c: lload 1
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: ifle 13f
      // 132: ifne 3a3
      // 135: aload 0
      // 136: ldc2_w -6454139281004534980
      // 139: lload 1
      // 13a: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: iload 30
      // 141: lload 1
      // 142: lconst_0
      // 143: lcmp
      // 144: iflt 3c0
      // 147: ifne 3b8
      // 14a: goto 157
      // 14d: ldc2_w -6815268408398533756
      // 150: lload 1
      // 151: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: ifeq 3a0
      // 15a: goto 167
      // 15d: ldc2_w -6815268408398533756
      // 160: lload 1
      // 161: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: aload 0
      // 168: ldc2_w -6711561797418168748
      // 16b: lload 1
      // 16c: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: iload 31
      // 173: aaload
      // 174: iload 30
      // 176: ifne 24b
      // 179: goto 186
      // 17c: ldc2_w -6815268408398533756
      // 17f: lload 1
      // 180: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: lload 1
      // 187: lconst_0
      // 188: lcmp
      // 189: ifle 23e
      // 18c: ldc2_w -6646684636165105771
      // 18f: lload 1
      // 190: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: ifne 231
      // 198: goto 1a5
      // 19b: ldc2_w -6815268408398533756
      // 19e: lload 1
      // 19f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: lload 10
      // 1a8: bipush 0
      // 1a9: bipush 2
      // 1aa: anewarray 269
      // 1ad: dup_x1
      // 1ae: swap
      // 1af: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b2: bipush 1
      // 1b3: swap
      // 1b4: aastore
      // 1b5: dup_x2
      // 1b6: dup_x2
      // 1b7: pop
      // 1b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bb: bipush 0
      // 1bc: swap
      // 1bd: aastore
      // 1be: ldc2_w -6411178468542789937
      // 1c1: lload 1
      // 1c2: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: aload 9
      // 1c9: new java/lang/StringBuilder
      // 1cc: dup
      // 1cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d0: sipush 15388
      // 1d3: ldc2_w 3110895430068496159
      // 1d6: lload 1
      // 1d7: lxor
      // 1d8: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e0: aload 0
      // 1e1: lload 16
      // 1e3: invokevirtual com/zelix/he.k (J)Ljava/lang/String;
      // 1e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e9: sipush 27941
      // 1ec: ldc2_w 2055516708733564455
      // 1ef: lload 1
      // 1f0: lxor
      // 1f1: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f9: sipush 13870
      // 1fc: ldc2_w 6702319150675717409
      // 1ff: lload 1
      // 200: lxor
      // 201: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 209: sipush 15029
      // 20c: ldc2_w 3494273537732633011
      // 20f: lload 1
      // 210: lxor
      // 211: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21c: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 21f: iload 30
      // 221: ifeq 3a0
      // 224: goto 231
      // 227: ldc2_w -6815268408398533756
      // 22a: lload 1
      // 22b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: aload 0
      // 232: ldc2_w -6711561797418168748
      // 235: lload 1
      // 236: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: iload 31
      // 23d: aaload
      // 23e: goto 24b
      // 241: ldc2_w -6815268408398533756
      // 244: lload 1
      // 245: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: athrow
      // 24b: lload 12
      // 24d: bipush 1
      // 24e: anewarray 269
      // 251: dup_x2
      // 252: dup_x2
      // 253: pop
      // 254: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 257: bipush 0
      // 258: swap
      // 259: aastore
      // 25a: ldc2_w -4714945826362087695
      // 25d: lload 1
      // 25e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: astore 32
      // 265: iload 30
      // 267: ifne 3a3
      // 26a: aload 32
      // 26c: ifnull 3a0
      // 26f: goto 27c
      // 272: ldc2_w -6815268408398533756
      // 275: lload 1
      // 276: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: athrow
      // 27c: aload 0
      // 27d: ldc2_w -6711561797418168748
      // 280: lload 1
      // 281: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: iload 31
      // 288: aaload
      // 289: lload 24
      // 28b: bipush 1
      // 28c: anewarray 269
      // 28f: dup_x2
      // 290: dup_x2
      // 291: pop
      // 292: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 295: bipush 0
      // 296: swap
      // 297: aastore
      // 298: ldc2_w -6349001614666062848
      // 29b: lload 1
      // 29c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: astore 33
      // 2a3: aload 0
      // 2a4: ldc2_w -6711561797418168748
      // 2a7: lload 1
      // 2a8: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: iload 31
      // 2af: aaload
      // 2b0: lload 18
      // 2b2: bipush 1
      // 2b3: anewarray 269
      // 2b6: dup_x2
      // 2b7: dup_x2
      // 2b8: pop
      // 2b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2bc: bipush 0
      // 2bd: swap
      // 2be: aastore
      // 2bf: ldc2_w -6728587547665836017
      // 2c2: lload 1
      // 2c3: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: astore 34
      // 2ca: iload 30
      // 2cc: lload 1
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: ifle 3a5
      // 2d2: ifne 3a3
      // 2d5: aload 34
      // 2d7: ifnull 3a0
      // 2da: goto 2e7
      // 2dd: ldc2_w -6815268408398533756
      // 2e0: lload 1
      // 2e1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e6: athrow
      // 2e7: aload 34
      // 2e9: invokevirtual java/lang/String.length ()I
      // 2ec: aload 33
      // 2ee: invokevirtual java/lang/String.length ()I
      // 2f1: aload 32
      // 2f3: invokevirtual java/lang/String.length ()I
      // 2f6: isub
      // 2f7: if_icmple 3a0
      // 2fa: goto 307
      // 2fd: ldc2_w -6815268408398533756
      // 300: lload 1
      // 301: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: athrow
      // 307: aload 9
      // 309: new java/lang/StringBuilder
      // 30c: dup
      // 30d: invokespecial java/lang/StringBuilder.<init> ()V
      // 310: sipush 17573
      // 313: ldc2_w 6585234157830610857
      // 316: lload 1
      // 317: lxor
      // 318: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 320: aload 0
      // 321: lload 16
      // 323: invokevirtual com/zelix/he.k (J)Ljava/lang/String;
      // 326: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 329: sipush 31769
      // 32c: ldc2_w 4069509590968936216
      // 32f: lload 1
      // 330: lxor
      // 331: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 339: sipush 6686
      // 33c: ldc2_w 1203641552542744851
      // 33f: lload 1
      // 340: lxor
      // 341: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 349: sipush 27141
      // 34c: ldc2_w 5611798574712074498
      // 34f: lload 1
      // 350: lxor
      // 351: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 356: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 359: aload 34
      // 35b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35e: sipush 3358
      // 361: ldc2_w 2236467502251628062
      // 364: lload 1
      // 365: lxor
      // 366: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36e: aload 33
      // 370: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 373: sipush 3897
      // 376: ldc2_w 7194633976410133564
      // 379: lload 1
      // 37a: lxor
      // 37b: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 383: aload 32
      // 385: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 388: ldc "'"
      // 38a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 390: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 393: goto 3a0
      // 396: ldc2_w -6815268408398533756
      // 399: lload 1
      // 39a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: athrow
      // 3a0: iinc 31 1
      // 3a3: iload 30
      // 3a5: ifeq 0fc
      // 3a8: aload 0
      // 3a9: ldc2_w -6454139281004534980
      // 3ac: lload 1
      // 3ad: lload 1
      // 3ae: lconst_0
      // 3af: lcmp
      // 3b0: iflt 110
      // 3b3: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b8: lload 1
      // 3b9: lconst_0
      // 3ba: lcmp
      // 3bb: ifle 612
      // 3be: iload 30
      // 3c0: ifne 612
      // 3c3: ifne 5f6
      // 3c6: goto 3d3
      // 3c9: ldc2_w -6815268408398533756
      // 3cc: lload 1
      // 3cd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d2: athrow
      // 3d3: new java/io/ByteArrayOutputStream
      // 3d6: dup
      // 3d7: aload 0
      // 3d8: getfield com/zelix/he.C I
      // 3db: invokespecial java/io/ByteArrayOutputStream.<init> (I)V
      // 3de: astore 31
      // 3e0: new java/io/DataOutputStream
      // 3e3: dup
      // 3e4: aload 31
      // 3e6: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 3e9: astore 32
      // 3eb: aload 0
      // 3ec: aload 32
      // 3ee: lload 28
      // 3f0: bipush 2
      // 3f1: anewarray 269
      // 3f4: dup_x2
      // 3f5: dup_x2
      // 3f6: pop
      // 3f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3fa: bipush 1
      // 3fb: swap
      // 3fc: aastore
      // 3fd: dup_x1
      // 3fe: swap
      // 3ff: bipush 0
      // 400: swap
      // 401: aastore
      // 402: ldc2_w -6410365570753273047
      // 405: lload 1
      // 406: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40b: aload 0
      // 40c: aload 31
      // 40e: ldc2_w -6727640944329310055
      // 411: lload 1
      // 412: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: ldc2_w -4720127415958724107
      // 41a: lload 1
      // 41b: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: aload 0
      // 421: aconst_null
      // 422: ldc2_w -6711561797418168748
      // 425: lload 1
      // 426: invokedynamic w (Ljava/lang/Object;[Lcom/zelix/is;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42b: lload 1
      // 42c: lconst_0
      // 42d: lcmp
      // 42e: ifle 5f6
      // 431: iload 30
      // 433: ifeq 5f6
      // 436: aload 0
      // 437: lload 10
      // 439: bipush 0
      // 43a: bipush 2
      // 43b: anewarray 269
      // 43e: dup_x1
      // 43f: swap
      // 440: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 443: bipush 1
      // 444: swap
      // 445: aastore
      // 446: dup_x2
      // 447: dup_x2
      // 448: pop
      // 449: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 44c: bipush 0
      // 44d: swap
      // 44e: aastore
      // 44f: ldc2_w -6411178468542789937
      // 452: lload 1
      // 453: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 458: aload 9
      // 45a: new java/lang/StringBuilder
      // 45d: dup
      // 45e: invokespecial java/lang/StringBuilder.<init> ()V
      // 461: sipush 17573
      // 464: ldc2_w 6585234157830610857
      // 467: lload 1
      // 468: lxor
      // 469: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 471: aload 0
      // 472: lload 16
      // 474: invokevirtual com/zelix/he.k (J)Ljava/lang/String;
      // 477: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47a: sipush 31769
      // 47d: ldc2_w 4069509590968936216
      // 480: lload 1
      // 481: lxor
      // 482: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 487: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48a: sipush 6686
      // 48d: ldc2_w 1203641552542744851
      // 490: lload 1
      // 491: lxor
      // 492: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 497: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49a: sipush 27608
      // 49d: ldc2_w 1508497483578618076
      // 4a0: lload 1
      // 4a1: lxor
      // 4a2: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4ad: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 4b0: aload 0
      // 4b1: aload 0
      // 4b2: getfield com/zelix/he.C I
      // 4b5: newarray 8
      // 4b7: ldc2_w -4720127415958724107
      // 4ba: lload 1
      // 4bb: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c0: aload 0
      // 4c1: ldc2_w -4720127415958724107
      // 4c4: lload 1
      // 4c5: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ca: bipush 0
      // 4cb: aload 0
      // 4cc: ldc2_w -4686674618494834183
      // 4cf: lload 1
      // 4d0: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d5: sipush 28141
      // 4d8: ldc2_w 4870868778015751737
      // 4db: lload 1
      // 4dc: lxor
      // 4dd: invokedynamic c (IJ)I bsm=com/zelix/he.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: iushr
      // 4e3: sipush 28788
      // 4e6: ldc2_w 4252822113698309027
      // 4e9: lload 1
      // 4ea: lxor
      // 4eb: invokedynamic c (IJ)I bsm=com/zelix/he.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f0: iand
      // 4f1: i2b
      // 4f2: bastore
      // 4f3: aload 0
      // 4f4: ldc2_w -4720127415958724107
      // 4f7: lload 1
      // 4f8: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fd: bipush 1
      // 4fe: aload 0
      // 4ff: ldc2_w -4686674618494834183
      // 502: lload 1
      // 503: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 508: bipush 0
      // 509: iushr
      // 50a: sipush 12665
      // 50d: ldc2_w 5991568938610533039
      // 510: lload 1
      // 511: lxor
      // 512: invokedynamic c (IJ)I bsm=com/zelix/he.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 517: iand
      // 518: i2b
      // 519: bastore
      // 51a: aload 6
      // 51c: aload 0
      // 51d: ldc2_w -4720127415958724107
      // 520: lload 1
      // 521: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: bipush 2
      // 527: aload 0
      // 528: getfield com/zelix/he.C I
      // 52b: bipush 2
      // 52c: isub
      // 52d: ldc2_w -6755798702204919555
      // 530: lload 1
      // 531: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 536: goto 543
      // 539: ldc2_w -6815268408398533756
      // 53c: lload 1
      // 53d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 542: athrow
      // 543: pop
      // 544: lload 1
      // 545: lconst_0
      // 546: lcmp
      // 547: ifle 5f6
      // 54a: iload 30
      // 54c: ifeq 5f6
      // 54f: aload 0
      // 550: lload 10
      // 552: bipush 0
      // 553: bipush 2
      // 554: anewarray 269
      // 557: dup_x1
      // 558: swap
      // 559: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 55c: bipush 1
      // 55d: swap
      // 55e: aastore
      // 55f: dup_x2
      // 560: dup_x2
      // 561: pop
      // 562: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 565: bipush 0
      // 566: swap
      // 567: aastore
      // 568: ldc2_w -6411178468542789937
      // 56b: lload 1
      // 56c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 571: aload 9
      // 573: new java/lang/StringBuilder
      // 576: dup
      // 577: invokespecial java/lang/StringBuilder.<init> ()V
      // 57a: sipush 17573
      // 57d: ldc2_w 6585234157830610857
      // 580: lload 1
      // 581: lxor
      // 582: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 587: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58a: aload 0
      // 58b: lload 16
      // 58d: invokevirtual com/zelix/he.k (J)Ljava/lang/String;
      // 590: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 593: sipush 31769
      // 596: ldc2_w 4069509590968936216
      // 599: lload 1
      // 59a: lxor
      // 59b: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a3: sipush 6686
      // 5a6: ldc2_w 1203641552542744851
      // 5a9: lload 1
      // 5aa: lxor
      // 5ab: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5b3: sipush 26158
      // 5b6: ldc2_w 6444088309123464480
      // 5b9: lload 1
      // 5ba: lxor
      // 5bb: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/he.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5c6: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 5c9: aload 0
      // 5ca: aload 0
      // 5cb: getfield com/zelix/he.C I
      // 5ce: newarray 8
      // 5d0: ldc2_w -4720127415958724107
      // 5d3: lload 1
      // 5d4: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d9: aload 6
      // 5db: aload 0
      // 5dc: ldc2_w -4720127415958724107
      // 5df: lload 1
      // 5e0: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e5: invokevirtual com/zelix/_xx.read ([B)I
      // 5e8: goto 5f5
      // 5eb: ldc2_w -6815268408398533756
      // 5ee: lload 1
      // 5ef: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f4: athrow
      // 5f5: pop
      // 5f6: aload 0
      // 5f7: iload 30
      // 5f9: ifne 660
      // 5fc: ldc2_w -6454139281004534980
      // 5ff: lload 1
      // 600: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 605: goto 612
      // 608: ldc2_w -6815268408398533756
      // 60b: lload 1
      // 60c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 611: athrow
      // 612: lload 1
      // 613: lconst_0
      // 614: lcmp
      // 615: ifle 642
      // 618: ifeq 652
      // 61b: aload 3
      // 61c: checkcast com/zelix/hz
      // 61f: bipush 1
      // 620: lload 26
      // 622: bipush 2
      // 623: anewarray 269
      // 626: dup_x2
      // 627: dup_x2
      // 628: pop
      // 629: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62c: bipush 1
      // 62d: swap
      // 62e: aastore
      // 62f: dup_x1
      // 630: swap
      // 631: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 634: bipush 0
      // 635: swap
      // 636: aastore
      // 637: ldc2_w -4761443181250673495
      // 63a: lload 1
      // 63b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 640: iload 30
      // 642: ifeq 684
      // 645: goto 652
      // 648: ldc2_w -6815268408398533756
      // 64b: lload 1
      // 64c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 651: athrow
      // 652: aload 3
      // 653: goto 660
      // 656: ldc2_w -6815268408398533756
      // 659: lload 1
      // 65a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65f: athrow
      // 660: checkcast com/zelix/hz
      // 663: bipush 1
      // 664: lload 22
      // 666: bipush 2
      // 667: anewarray 269
      // 66a: dup_x2
      // 66b: dup_x2
      // 66c: pop
      // 66d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 670: bipush 1
      // 671: swap
      // 672: aastore
      // 673: dup_x1
      // 674: swap
      // 675: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 678: bipush 0
      // 679: swap
      // 67a: aastore
      // 67b: ldc2_w -6798345637057428733
      // 67e: lload 1
      // 67f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 684: return
   }

   protected void j(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 4
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 75742052495569
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 0
      // 030: lxor
      // 031: lstore 9
      // 033: pop2
      // 034: ldc2_w -3106497998795710297
      // 037: lload 2
      // 038: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: aload 6
      // 040: lload 9
      // 042: aload 5
      // 044: aload 4
      // 046: bipush 4
      // 047: anewarray 269
      // 04a: dup_x1
      // 04b: swap
      // 04c: bipush 3
      // 04d: swap
      // 04e: aastore
      // 04f: dup_x1
      // 050: swap
      // 051: bipush 2
      // 052: swap
      // 053: aastore
      // 054: dup_x2
      // 055: dup_x2
      // 056: pop
      // 057: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05a: bipush 1
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 065: istore 11
      // 067: aload 0
      // 068: ldc2_w -3332915521919052563
      // 06b: lload 2
      // 06c: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: iload 11
      // 073: ifne 0a3
      // 076: ifeq 118
      // 079: goto 086
      // 07c: ldc2_w -2974032696662827947
      // 07f: lload 2
      // 080: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: aload 6
      // 088: aload 0
      // 089: ldc2_w -3952816617096487384
      // 08c: lload 2
      // 08d: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 095: bipush 0
      // 096: goto 0a3
      // 099: ldc2_w -2974032696662827947
      // 09c: lload 2
      // 09d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: istore 12
      // 0a5: iload 12
      // 0a7: aload 0
      // 0a8: ldc2_w -3952816617096487384
      // 0ab: lload 2
      // 0ac: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: if_icmpge 10d
      // 0b4: aload 0
      // 0b5: ldc2_w -3095399680704792187
      // 0b8: lload 2
      // 0b9: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: iload 12
      // 0c0: aaload
      // 0c1: lload 7
      // 0c3: aload 6
      // 0c5: aload 5
      // 0c7: bipush 3
      // 0c8: anewarray 269
      // 0cb: dup_x1
      // 0cc: swap
      // 0cd: bipush 2
      // 0ce: swap
      // 0cf: aastore
      // 0d0: dup_x1
      // 0d1: swap
      // 0d2: bipush 1
      // 0d3: swap
      // 0d4: aastore
      // 0d5: dup_x2
      // 0d6: dup_x2
      // 0d7: pop
      // 0d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: ldc2_w -2926503450020124698
      // 0e1: lload 2
      // 0e2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: iinc 12 1
      // 0ea: iload 11
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 0f7
      // 0f2: ifne 134
      // 0f5: iload 11
      // 0f7: ifeq 0a5
      // 0fa: lload 2
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: ifle 0ea
      // 100: goto 10d
      // 103: ldc2_w -2974032696662827947
      // 106: lload 2
      // 107: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: lload 2
      // 10e: lconst_0
      // 10f: lcmp
      // 110: iflt 127
      // 113: iload 11
      // 115: ifeq 134
      // 118: aload 6
      // 11a: aload 0
      // 11b: ldc2_w -3913648525928835548
      // 11e: lload 2
      // 11f: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: invokevirtual java/io/DataOutputStream.write ([B)V
      // 127: goto 134
      // 12a: ldc2_w -2974032696662827947
      // 12d: lload 2
      // 12e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: return
   }

   void a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 115027067352651L;
      boolean var6 = x44.a<"t">(-5203183598868528242L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"h">(this, -5578255218417764412L, var2);
            if (var6) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var8) {
            throw x44.a<"t">(var8, -5362932190560665732L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < x44.a<"h">(this, -6193062293472822015L, var2)) {
         x44.a<"l">(x44.a<"h">(this, -5322134420693984596L, var2)[var7], new Object[]{var4}, -5494681924028530844L, var2);
         var7++;
         if (var6) {
            break;
         }
      }
   }

   protected void n(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/he.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 132741473523614
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 5580474152895282459
      // 25: lload 3
      // 26: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 2
      // 2c: aload 0
      // 2d: ldc2_w 5603033622608173773
      // 30: lload 3
      // 31: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 39: istore 7
      // 3b: bipush 0
      // 3c: istore 8
      // 3e: iload 8
      // 40: aload 0
      // 41: ldc2_w 5603033622608173773
      // 44: lload 3
      // 45: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: if_icmpge 80
      // 4d: aload 0
      // 4e: ldc2_w 5904167700559117664
      // 51: lload 3
      // 52: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: iload 8
      // 59: aaload
      // 5a: aload 2
      // 5b: lload 5
      // 5d: bipush 2
      // 5e: anewarray 269
      // 61: dup_x2
      // 62: dup_x2
      // 63: pop
      // 64: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 67: bipush 1
      // 68: swap
      // 69: aastore
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: ldc2_w 5687300687109698726
      // 72: lload 3
      // 73: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: iinc 8 1
      // 7b: iload 7
      // 7d: ifne 3e
      // 80: lload 3
      // 81: lconst_0
      // 82: lcmp
      // 83: iflt 7b
      // 86: return
   }

   int x(long var1) {
      return 2 + x44.a<"k">(this, 1260688832666535538L, var1) * c<"c">(28141, 4870791203916468658L ^ var1);
   }

   public int g(Object[] param1) {
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
      // 004: checkcast com/zelix/_ue
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/he.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 74626574770366
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: ldc2_w 5123618032368251742
      // 026: lload 2
      // 027: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 7
      // 02e: aload 0
      // 02f: iload 7
      // 031: ifne 161
      // 034: ldc2_w 5112660421755677308
      // 037: lload 2
      // 038: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: ifnull 160
      // 040: goto 04d
      // 043: ldc2_w 4990871259585335212
      // 046: lload 2
      // 047: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: new java/util/ArrayList
      // 050: dup
      // 051: aload 0
      // 052: ldc2_w 5112660421755677308
      // 055: lload 2
      // 056: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: arraylength
      // 05c: invokespecial java/util/ArrayList.<init> (I)V
      // 05f: astore 8
      // 061: bipush 0
      // 062: istore 9
      // 064: iload 9
      // 066: aload 0
      // 067: ldc2_w 5112660421755677308
      // 06a: lload 2
      // 06b: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: arraylength
      // 071: if_icmpge 0fb
      // 074: aload 0
      // 075: ldc2_w 5112660421755677308
      // 078: lload 2
      // 079: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: iload 9
      // 080: aaload
      // 081: lload 5
      // 083: aload 4
      // 085: bipush 2
      // 086: anewarray 269
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 1
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x2
      // 08f: dup_x2
      // 090: pop
      // 091: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: ldc2_w 6669090058985146222
      // 09a: lload 2
      // 09b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: iload 7
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 10c
      // 0a8: ifne 10a
      // 0ab: iload 7
      // 0ad: ifne 0f2
      // 0b0: goto 0bd
      // 0b3: ldc2_w 4990871259585335212
      // 0b6: lload 2
      // 0b7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: lload 2
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 0f8
      // 0c3: ifne 0f3
      // 0c6: goto 0d3
      // 0c9: ldc2_w 4990871259585335212
      // 0cc: lload 2
      // 0cd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 8
      // 0d5: aload 0
      // 0d6: ldc2_w 5112660421755677308
      // 0d9: lload 2
      // 0da: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: iload 9
      // 0e1: aaload
      // 0e2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0e5: goto 0f2
      // 0e8: ldc2_w 4990871259585335212
      // 0eb: lload 2
      // 0ec: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: pop
      // 0f3: iinc 9 1
      // 0f6: iload 7
      // 0f8: ifeq 064
      // 0fb: aload 8
      // 0fd: invokevirtual java/util/ArrayList.size ()I
      // 100: istore 9
      // 102: lload 2
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 074
      // 108: iload 9
      // 10a: iload 7
      // 10c: lload 2
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: iflt 120
      // 112: ifne 16a
      // 115: aload 0
      // 116: ldc2_w 5112660421755677308
      // 119: lload 2
      // 11a: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/is; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: arraylength
      // 120: if_icmpge 160
      // 123: goto 130
      // 126: ldc2_w 4990871259585335212
      // 129: lload 2
      // 12a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 0
      // 131: aload 8
      // 133: iload 9
      // 135: anewarray 391
      // 138: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 13b: checkcast [Lcom/zelix/is;
      // 13e: ldc2_w 5112660421755677308
      // 141: lload 2
      // 142: invokedynamic w (Ljava/lang/Object;[Lcom/zelix/is;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: aload 0
      // 148: iload 9
      // 14a: ldc2_w 6547664079077133777
      // 14d: lload 2
      // 14e: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: goto 160
      // 156: ldc2_w 4990871259585335212
      // 159: lload 2
      // 15a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 0
      // 161: ldc2_w 6547664079077133777
      // 164: lload 2
      // 165: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: ireturn
   }

   void f(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = a ^ var3;
      x44.a<"r">(this, var2, -2554869829781808679L, var3);
   }

   static {
      long var11 = a ^ 101295980508392L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[12];
      int var18 = 0;
      String var17 = "´CeË\u0087i7H1\u0088°^\u0011f\u008bj\u0010QHw##ÚD\u00ad½Ã\u0084¼\u001a\u0002\u0089·\u0010Ms\u0019\"ÍÞ\u001bq\u0019Ást!ñÇü =Ï\u008e\u0015\u0092Þ½\u009bÈuxV³#v\u0097§pÁàä\tâ\u00008j\u0088½\u009aU¹Á\u00100«=\u0015\u0099]\u0007îÑ²2þK<\u001fB\u0010î\u0085ÑXÞ\nÌô\u0016å$\u0000L£Éá\u0010OyBFØé;\u0017H\u0089GÁ×ëÌG\u0010VåC8\bQÁ\fÇ°ù1÷Sy>\u0010\u007fN÷(ÝEáZ§¶\u0087»\u0006»Õ\u00118y\u0090\u0093\u009c\u0092\u0091\u0007Æ)\u0016C\u001c±þ\u0010æWÐ5*ð¿Sñ;\u0019Qóø°G\u0084®ôCm\n)È\u0099ày²\u000ehÈëJW\u0087\u0098&ÑH\u001bù";
      int var19 = "´CeË\u0087i7H1\u0088°^\u0011f\u008bj\u0010QHw##ÚD\u00ad½Ã\u0084¼\u001a\u0002\u0089·\u0010Ms\u0019\"ÍÞ\u001bq\u0019Ást!ñÇü =Ï\u008e\u0015\u0092Þ½\u009bÈuxV³#v\u0097§pÁàä\tâ\u00008j\u0088½\u009aU¹Á\u00100«=\u0015\u0099]\u0007îÑ²2þK<\u001fB\u0010î\u0085ÑXÞ\nÌô\u0016å$\u0000L£Éá\u0010OyBFØé;\u0017H\u0089GÁ×ëÌG\u0010VåC8\bQÁ\fÇ°ù1÷Sy>\u0010\u007fN÷(ÝEáZ§¶\u0087»\u0006»Õ\u00118y\u0090\u0093\u009c\u0092\u0091\u0007Æ)\u0016C\u001c±þ\u0010æWÐ5*ð¿Sñ;\u0019Qóø°G\u0084®ôCm\n)È\u0099ày²\u000ehÈëJW\u0087\u0098&ÑH\u001bù"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     d = new String[12];
                     i = new HashMap(13);
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
                     String var4 = "´tL\u0094iÍß³äÉr\u001eË´¿\u001f";
                     int var5 = "´tL\u0094iÍß³äÉr\u001eË´¿\u001f".length();
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
                                    h = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "ñÄ© ÙxÁúgÕj\u0086rØòG";
                                 var5 = "ñÄ© ÙxÁúgÕj\u0086rØòG".length();
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

                  var17 = ":£\u009a\u001fÖIÃ\u0012ÝO¿\fX¡¨r0¹¤½;2ö'\u0001W\u009cÅ²\u00190SÁÏ=En\u008e \u00151×\u0091\u007f¾¬ú_Õ{uÛÏw$ª·»8\u0000è%\u0095\u001aÅ";
                  var19 = ":£\u009a\u001fÖIÃ\u0012ÝO¿\fX¡¨r0¹¤½;2ö'\u0001W\u009cÅ²\u00190SÁÏ=En\u008e \u00151×\u0091\u007f¾¬ú_Õ{uÛÏw$ª·»8\u0000è%\u0095\u001aÅ"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27107;
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
            throw new RuntimeException("com/zelix/he", var10);
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
         throw new RuntimeException("com/zelix/he" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8499;
      if (h[var3] == null) {
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
            throw new RuntimeException("com/zelix/he", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/he" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
