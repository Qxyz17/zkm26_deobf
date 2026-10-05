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
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class si extends ss implements eo {
   private jf M;
   private static final long b = prr.a(130600684722111516L, 5033208993611462586L, MethodHandles.lookup().lookupClass()).a(174405882617379L);
   private static final String[] h;
   private static final String[] i;
   private static final Map j = new HashMap(13);

   public void S(Object[] param1) {
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
      // 1c: ldc2_w -7028195342100598978
      // 1f: lload 2
      // 20: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 50
      // 2d: getfield com/zelix/si.M Lcom/zelix/jf;
      // 30: aload 5
      // 32: if_acmpne 55
      // 35: goto 42
      // 38: ldc2_w -7157747953390602373
      // 3b: lload 2
      // 3c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 50
      // 46: ldc2_w -7157747953390602373
      // 49: lload 2
      // 4a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 4
      // 52: putfield com/zelix/si.M Lcom/zelix/jf;
      // 55: return
   }

   protected void r(DataOutputStream param1, long param2, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: dup2
      // 002: ldc2_w 37746908501545
      // 005: lxor
      // 006: lstore 5
      // 008: dup2
      // 009: ldc2_w 113115607996493
      // 00c: lxor
      // 00d: lstore 7
      // 00f: pop2
      // 010: ldc2_w 3620787434600556248
      // 013: lload 2
      // 014: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: istore 9
      // 01b: iload 9
      // 01d: ifne 0a4
      // 020: aload 0
      // 021: getfield com/zelix/si.c Z
      // 024: ifne 084
      // 027: goto 034
      // 02a: ldc2_w 2935125513433121642
      // 02d: lload 2
      // 02e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: athrow
      // 034: bipush 0
      // 035: bipush 1
      // 036: anewarray 6
      // 039: dup
      // 03a: bipush 0
      // 03b: new java/lang/StringBuilder
      // 03e: dup
      // 03f: invokespecial java/lang/StringBuilder.<init> ()V
      // 042: sipush 29786
      // 045: ldc2_w 4839662750596648076
      // 048: lload 2
      // 049: lxor
      // 04a: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/si.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 052: aload 0
      // 053: lload 5
      // 055: bipush 1
      // 056: anewarray 201
      // 059: dup_x2
      // 05a: dup_x2
      // 05b: pop
      // 05c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: ldc2_w 3793153905972666927
      // 065: lload 2
      // 066: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 071: aastore
      // 072: lload 7
      // 074: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 077: goto 084
      // 07a: ldc2_w 2935125513433121642
      // 07d: lload 2
      // 07e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: lload 2
      // 085: lconst_0
      // 086: lcmp
      // 087: ifle 097
      // 08a: aload 1
      // 08b: aload 0
      // 08c: getfield com/zelix/si.R I
      // 08f: iload 9
      // 091: ifne 12f
      // 094: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 097: goto 0a4
      // 09a: ldc2_w 2935125513433121642
      // 09d: lload 2
      // 09e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 4
      // 0a6: lload 2
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: iflt 0ba
      // 0ac: ifnull 11a
      // 0af: aload 4
      // 0b1: aload 0
      // 0b2: getfield com/zelix/si.M Lcom/zelix/jf;
      // 0b5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0ba: checkcast com/zelix/js
      // 0bd: astore 10
      // 0bf: iload 9
      // 0c1: lload 2
      // 0c2: lconst_0
      // 0c3: lcmp
      // 0c4: iflt 0f4
      // 0c7: ifne 0f2
      // 0ca: aload 10
      // 0cc: ifnull 0fd
      // 0cf: goto 0dc
      // 0d2: ldc2_w 2935125513433121642
      // 0d5: lload 2
      // 0d6: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: aload 10
      // 0df: invokevirtual com/zelix/js.E ()I
      // 0e2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0e5: goto 0f2
      // 0e8: ldc2_w 2935125513433121642
      // 0eb: lload 2
      // 0ec: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: iload 9
      // 0f4: lload 2
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: iflt 117
      // 0fa: ifeq 115
      // 0fd: aload 1
      // 0fe: aload 0
      // 0ff: getfield com/zelix/si.M Lcom/zelix/jf;
      // 102: invokevirtual com/zelix/jf.E ()I
      // 105: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 108: goto 115
      // 10b: ldc2_w 2935125513433121642
      // 10e: lload 2
      // 10f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: iload 9
      // 117: ifeq 132
      // 11a: aload 1
      // 11b: aload 0
      // 11c: getfield com/zelix/si.M Lcom/zelix/jf;
      // 11f: invokevirtual com/zelix/jf.E ()I
      // 122: goto 12f
      // 125: ldc2_w 2935125513433121642
      // 128: lload 2
      // 129: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 132: return
   }

   protected si(_4 param1, long param2, int param4, int param5, h1 param6, l6q param7, PrintWriter param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/si.b J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 11595871219585
      // 0b: lxor
      // 0c: lstore 9
      // 0e: dup2
      // 0f: ldc2_w 83393524564424
      // 12: lxor
      // 13: lstore 11
      // 15: dup2
      // 16: ldc2_w 47889878017167
      // 19: lxor
      // 1a: lstore 13
      // 1c: pop2
      // 1d: aload 0
      // 1e: aload 1
      // 1f: iload 4
      // 21: invokespecial com/zelix/ss.<init> (Lcom/zelix/_4;I)V
      // 24: ldc2_w -7871829939134806490
      // 27: lload 2
      // 28: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 0
      // 2e: lload 11
      // 30: iload 5
      // 32: invokevirtual com/zelix/si.m (JI)Lcom/zelix/js;
      // 35: astore 16
      // 37: istore 15
      // 39: iload 15
      // 3b: ifne 8c
      // 3e: aload 16
      // 40: instanceof com/zelix/jf
      // 43: ifeq 7a
      // 46: goto 53
      // 49: ldc2_w -8627327307014757484
      // 4c: lload 2
      // 4d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: aload 0
      // 54: aload 16
      // 56: checkcast com/zelix/jf
      // 59: putfield com/zelix/si.M Lcom/zelix/jf;
      // 5c: aload 7
      // 5e: aload 0
      // 5f: getfield com/zelix/si.M Lcom/zelix/jf;
      // 62: aload 0
      // 63: lload 13
      // 65: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 68: iload 15
      // 6a: ifeq e4
      // 6d: goto 7a
      // 70: ldc2_w -8627327307014757484
      // 73: lload 2
      // 74: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 0
      // 7b: bipush 0
      // 7c: putfield com/zelix/si.c Z
      // 7f: goto 8c
      // 82: ldc2_w -8627327307014757484
      // 85: lload 2
      // 86: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: aload 8
      // 8e: new java/lang/StringBuilder
      // 91: dup
      // 92: invokespecial java/lang/StringBuilder.<init> ()V
      // 95: sipush 25511
      // 98: ldc2_w 2221572110390033290
      // 9b: lload 2
      // 9c: lxor
      // 9d: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/si.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a5: aload 0
      // a6: lload 9
      // a8: invokevirtual com/zelix/si.f (J)Ljava/lang/String;
      // ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ae: sipush 9505
      // b1: ldc2_w 4079412382660738315
      // b4: lload 2
      // b5: lxor
      // b6: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/si.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // be: sipush 7711
      // c1: ldc2_w 2174526480517662262
      // c4: lload 2
      // c5: lxor
      // c6: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/si.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ce: sipush 10734
      // d1: ldc2_w 7860361441083404741
      // d4: lload 2
      // d5: lxor
      // d6: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/si.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e1: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // e4: return
   }

   static ss V(ko param0, int param1, long param2, String param4, t6 param5, Set param6, List param7, Map param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/si.b J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 54258601167328
      // 0b: lxor
      // 0c: lstore 9
      // 0e: pop2
      // 0f: ldc2_w 4192275033229708133
      // 12: lload 2
      // 13: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: istore 11
      // 1a: aload 8
      // 1c: aload 4
      // 1e: iload 11
      // 20: ifeq 49
      // 23: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 28: ifeq 5e
      // 2b: goto 38
      // 2e: ldc2_w 4103259010465207072
      // 31: lload 2
      // 32: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: aload 8
      // 3a: aload 4
      // 3c: goto 49
      // 3f: ldc2_w 4103259010465207072
      // 42: lload 2
      // 43: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4e: checkcast com/zelix/si
      // 51: astore 12
      // 53: lload 2
      // 54: lconst_0
      // 55: lcmp
      // 56: ifle 73
      // 59: iload 11
      // 5b: ifne 7f
      // 5e: new com/zelix/si
      // 61: dup
      // 62: aload 0
      // 63: iload 1
      // 64: aload 4
      // 66: aload 5
      // 68: aload 6
      // 6a: aload 7
      // 6c: lload 9
      // 6e: invokespecial com/zelix/si.<init> (Lcom/zelix/_4;ILjava/lang/String;Lcom/zelix/t6;Ljava/util/Set;Ljava/util/List;J)V
      // 71: astore 12
      // 73: aload 8
      // 75: aload 4
      // 77: aload 12
      // 79: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7e: pop
      // 7f: aload 12
      // 81: areturn
   }

   public boolean h(short var1, short var2, int var3, ss var4) {
      long var5 = (long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32;
      long var7 = var5 ^ 93252405302649L;
      boolean var9 = m44.a<"j">(-97956903315664917L, var5);

      label27: {
         try {
            if (!var9) {
               return (boolean)this.R;
            }

            if (this.R == var4.R) {
               break label27;
            }
         } catch (n9 var11) {
            throw m44.a<"j">(var11, -252277389486925906L, var5);
         }

         return (boolean)0;
      }

      si var10 = (si)var4;
      return this.M.g(var7).equals(var10.M.g(var7));
   }

   protected si(_4 param1, int param2, String param3, t6 param4, Set param5, List param6, long param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/si.b J
      // 003: lload 7
      // 005: lxor
      // 006: lstore 7
      // 008: lload 7
      // 00a: dup2
      // 00b: ldc2_w 91800052786221
      // 00e: lxor
      // 00f: lstore 9
      // 011: dup2
      // 012: ldc2_w 114049673575299
      // 015: lxor
      // 016: lstore 11
      // 018: pop2
      // 019: ldc2_w 8566592488607785477
      // 01c: lload 7
      // 01e: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: aload 0
      // 024: aload 1
      // 025: iload 2
      // 026: invokespecial com/zelix/ss.<init> (Lcom/zelix/_4;I)V
      // 029: istore 13
      // 02b: aload 3
      // 02c: iload 13
      // 02e: ifne 099
      // 031: ldc "L"
      // 033: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 036: ifeq 08a
      // 039: goto 047
      // 03c: ldc2_w 7811090709820295095
      // 03f: lload 7
      // 041: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: athrow
      // 047: aload 3
      // 048: iload 13
      // 04a: ifne 099
      // 04d: goto 05b
      // 050: ldc2_w 7811090709820295095
      // 053: lload 7
      // 055: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: ldc ";"
      // 05d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 060: ifeq 08a
      // 063: goto 071
      // 066: ldc2_w 7811090709820295095
      // 069: lload 7
      // 06b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: aload 3
      // 072: bipush 1
      // 073: aload 3
      // 074: invokevirtual java/lang/String.length ()I
      // 077: bipush 1
      // 078: isub
      // 079: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 07c: lload 7
      // 07e: lconst_0
      // 07f: lcmp
      // 080: ifle 08b
      // 083: astore 14
      // 085: iload 13
      // 087: ifeq 09b
      // 08a: aload 3
      // 08b: goto 099
      // 08e: ldc2_w 7811090709820295095
      // 091: lload 7
      // 093: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: astore 14
      // 09b: aload 14
      // 09d: lload 11
      // 09f: aload 5
      // 0a1: invokestatic com/zelix/jf.C (Ljava/lang/String;JLjava/util/Collection;)Lcom/zelix/jf;
      // 0a4: astore 15
      // 0a6: iload 13
      // 0a8: lload 7
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: ifle 104
      // 0af: ifne 0fb
      // 0b2: aload 15
      // 0b4: ifnonnull 0e7
      // 0b7: goto 0c5
      // 0ba: ldc2_w 7811090709820295095
      // 0bd: lload 7
      // 0bf: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: aload 4
      // 0c8: aload 14
      // 0ca: lload 9
      // 0cc: aload 6
      // 0ce: invokevirtual com/zelix/t6.S (Ljava/lang/String;JLjava/util/List;)Lcom/zelix/jf;
      // 0d1: putfield com/zelix/si.M Lcom/zelix/jf;
      // 0d4: iload 13
      // 0d6: ifeq 105
      // 0d9: goto 0e7
      // 0dc: ldc2_w 7811090709820295095
      // 0df: lload 7
      // 0e1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: aload 15
      // 0ea: putfield com/zelix/si.M Lcom/zelix/jf;
      // 0ed: goto 0fb
      // 0f0: ldc2_w 7811090709820295095
      // 0f3: lload 7
      // 0f5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 5
      // 0fd: aload 15
      // 0ff: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 104: pop
      // 105: return
   }

   void z(gu var1, long var2) {
      long var4 = var2 ^ 120816807025025L;
      this.M.e(var4, var1, this, this.H());
   }

   static {
      long var0 = b ^ 119137378208797L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\u0017ÆÒ\nà0ýiVÒ-wy\u0090\u0013÷ãJ¶A>n¨Qi³\u009bJ¡p?ýàYGÁò!K\u001fE;%O\u0010²±ú0ÿr]sïum_ÕRgvÆ\u0000J@_´IêÑ5TÅo\fãù¿.\"ÒÛô\u0089Lrqu\u0096|Í\u0099ÎÁ\u009f\u0098T\u0010f\u0014\u0092²Ìþ\u0092 ïÇB~^8%4";
      int var8 = "\u0017ÆÒ\nà0ýiVÒ-wy\u0090\u0013÷ãJ¶A>n¨Qi³\u009bJ¡p?ýàYGÁò!K\u001fE;%O\u0010²±ú0ÿr]sïum_ÕRgvÆ\u0000J@_´IêÑ5TÅo\fãù¿.\"ÒÛô\u0089Lrqu\u0096|Í\u0099ÎÁ\u009f\u0098T\u0010f\u0014\u0092²Ìþ\u0092 ïÇB~^8%4"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     h = var9;
                     i = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "^g\u009a%O\u0013\u0094\f]\u000bâæUuç»\u0010\u0015Åº0\u0006DU¬ îi5Ñ=ç\u009d";
                  var8 = "^g\u009a%O\u0013\u0094\f]\u000bâæUuç»\u0010\u0015Åº0\u0006DU¬ îi5Ñ=ç\u009d".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 430;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/si", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("com/zelix/si" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
