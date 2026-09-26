package com.zelix;

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

public abstract class km extends kw {
   final lkv F;
   b5[] n;
   int r;
   byte[] o;
   boolean N;
   private static final long a = prr.a(-5093979396207743147L, -490483328988736258L, MethodHandles.lookup().lookupClass()).a(81872174808432L);
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;

   final void C(Object[] param1) {
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
      // 13: getstatic com/zelix/km.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 66503734061501
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 8668183833533689004
      // 25: lload 3
      // 26: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 2
      // 2c: aload 0
      // 2d: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 30: arraylength
      // 31: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 34: bipush 0
      // 35: istore 8
      // 37: istore 7
      // 39: iload 8
      // 3b: aload 0
      // 3c: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 3f: arraylength
      // 40: if_icmpge 70
      // 43: aload 0
      // 44: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 47: iload 8
      // 49: aaload
      // 4a: lload 5
      // 4c: aload 2
      // 4d: bipush 2
      // 4e: anewarray 426
      // 51: dup_x1
      // 52: swap
      // 53: bipush 1
      // 54: swap
      // 55: aastore
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w 9110108747414928002
      // 62: lload 3
      // 63: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: iinc 8 1
      // 6b: iload 7
      // 6d: ifeq 39
      // 70: lload 3
      // 71: lconst_0
      // 72: lcmp
      // 73: ifle 6b
      // 76: return
   }

   final void a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 91779528348226L;
      boolean var6 = m44.a<"i">(723080230523920111L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = this.N;
            if (var6) {
               break label28;
            }

            if (!this.N) {
               return;
            }
         } catch (n9 var8) {
            throw m44.a<"i">(var8, 632417113578887600L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < this.n.length) {
         m44.a<"v">(this.n[var7], new Object[]{var4}, 920800405734912514L, var2);
         var7++;
         if (var6) {
            break;
         }
      }
   }

   protected final void N(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/lqu
      // 021: astore 6
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 0
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 50819876077675
      // 030: lxor
      // 031: lstore 9
      // 033: pop2
      // 034: ldc2_w 1680553024964027930
      // 037: lload 2
      // 038: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: aload 5
      // 040: aload 4
      // 042: lload 7
      // 044: aload 6
      // 046: bipush 4
      // 047: anewarray 426
      // 04a: dup_x1
      // 04b: swap
      // 04c: bipush 3
      // 04d: swap
      // 04e: aastore
      // 04f: dup_x2
      // 050: dup_x2
      // 051: pop
      // 052: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055: bipush 2
      // 056: swap
      // 057: aastore
      // 058: dup_x1
      // 059: swap
      // 05a: bipush 1
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: invokespecial com/zelix/kw.N ([Ljava/lang/Object;)V
      // 065: istore 11
      // 067: aload 0
      // 068: getfield com/zelix/km.N Z
      // 06b: iload 11
      // 06d: ifeq 098
      // 070: ifeq 102
      // 073: goto 080
      // 076: ldc2_w 992164032002350258
      // 079: lload 2
      // 07a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: aload 5
      // 082: aload 0
      // 083: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 086: arraylength
      // 087: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 08a: bipush 0
      // 08b: goto 098
      // 08e: ldc2_w 992164032002350258
      // 091: lload 2
      // 092: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: istore 12
      // 09a: iload 12
      // 09c: aload 0
      // 09d: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 0a0: arraylength
      // 0a1: if_icmpge 0f7
      // 0a4: aload 0
      // 0a5: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 0a8: iload 12
      // 0aa: aaload
      // 0ab: aload 5
      // 0ad: aload 4
      // 0af: lload 9
      // 0b1: bipush 3
      // 0b2: anewarray 426
      // 0b5: dup_x2
      // 0b6: dup_x2
      // 0b7: pop
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: bipush 2
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: bipush 0
      // 0c6: swap
      // 0c7: aastore
      // 0c8: ldc2_w 1127125947052758916
      // 0cb: lload 2
      // 0cc: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: iinc 12 1
      // 0d4: iload 11
      // 0d6: lload 2
      // 0d7: lconst_0
      // 0d8: lcmp
      // 0d9: iflt 0e1
      // 0dc: ifeq 11e
      // 0df: iload 11
      // 0e1: ifne 09a
      // 0e4: lload 2
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: iflt 0d4
      // 0ea: goto 0f7
      // 0ed: ldc2_w 992164032002350258
      // 0f0: lload 2
      // 0f1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: lload 2
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: iflt 111
      // 0fd: iload 11
      // 0ff: ifne 11e
      // 102: aload 5
      // 104: aload 0
      // 105: ldc2_w 1126093380793972925
      // 108: lload 2
      // 109: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokevirtual java/io/DataOutputStream.write ([B)V
      // 111: goto 11e
      // 114: ldc2_w 992164032002350258
      // 117: lload 2
      // 118: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: return
   }

   void q(Object[] param1) {
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
      // 00e: checkcast java/util/Set
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/km.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 75579432477113
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: ldc2_w -7076647614317868755
      // 026: lload 2
      // 027: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 7
      // 02e: aload 0
      // 02f: getfield com/zelix/km.N Z
      // 032: ifeq 142
      // 035: new java/util/ArrayList
      // 038: dup
      // 039: aload 0
      // 03a: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 03d: arraylength
      // 03e: invokespecial java/util/ArrayList.<init> (I)V
      // 041: astore 8
      // 043: bipush 0
      // 044: istore 9
      // 046: iload 9
      // 048: aload 0
      // 049: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 04c: arraylength
      // 04d: if_icmpge 0cb
      // 050: aload 0
      // 051: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 054: iload 9
      // 056: aaload
      // 057: astore 10
      // 059: iload 7
      // 05b: lload 2
      // 05c: lconst_0
      // 05d: lcmp
      // 05e: iflt 0c8
      // 061: ifne 0c6
      // 064: aload 4
      // 066: getstatic com/zelix/km.S Lcom/zelix/o9;
      // 069: aload 10
      // 06b: bipush 0
      // 06c: anewarray 426
      // 06f: ldc2_w -8682418185107276492
      // 072: lload 2
      // 073: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: lload 5
      // 07a: dup2_x1
      // 07b: pop2
      // 07c: invokevirtual com/zelix/o9.e (JI)Ljava/lang/Integer;
      // 07f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 084: iload 7
      // 086: lload 2
      // 087: lconst_0
      // 088: lcmp
      // 089: iflt 0da
      // 08c: ifne 0d8
      // 08f: goto 09c
      // 092: ldc2_w -6988289344335982990
      // 095: lload 2
      // 096: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: ifeq 0c3
      // 09f: goto 0ac
      // 0a2: ldc2_w -6988289344335982990
      // 0a5: lload 2
      // 0a6: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 8
      // 0ae: aload 10
      // 0b0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b5: pop
      // 0b6: goto 0c3
      // 0b9: ldc2_w -6988289344335982990
      // 0bc: lload 2
      // 0bd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: iinc 9 1
      // 0c6: iload 7
      // 0c8: ifeq 046
      // 0cb: aload 8
      // 0cd: lload 2
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: iflt 0fa
      // 0d3: invokeinterface java/util/List.size ()I 1
      // 0d8: iload 7
      // 0da: lload 2
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: iflt 0e8
      // 0e0: ifne 10c
      // 0e3: aload 0
      // 0e4: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 0e7: arraylength
      // 0e8: if_icmpge 142
      // 0eb: goto 0f8
      // 0ee: ldc2_w -6988289344335982990
      // 0f1: lload 2
      // 0f2: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: aload 8
      // 0fa: invokeinterface java/util/List.size ()I 1
      // 0ff: goto 10c
      // 102: ldc2_w -6988289344335982990
      // 105: lload 2
      // 106: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: anewarray 110
      // 10f: astore 9
      // 111: aload 0
      // 112: aload 8
      // 114: aload 9
      // 116: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 11b: checkcast [Lcom/zelix/b5;
      // 11e: putfield com/zelix/km.n [Lcom/zelix/b5;
      // 121: aload 0
      // 122: aload 0
      // 123: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 126: arraylength
      // 127: putfield com/zelix/km.r I
      // 12a: aload 0
      // 12b: aload 0
      // 12c: getfield com/zelix/km.r I
      // 12f: sipush 17294
      // 132: ldc2_w 3227944615584823874
      // 135: lload 2
      // 136: lxor
      // 137: invokedynamic k (IJ)I bsm=com/zelix/km.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: imul
      // 13d: bipush 2
      // 13e: iadd
      // 13f: putfield com/zelix/km.W I
      // 142: return
   }

   km(long param1, _4 param3, int param4, String param5, h1 param6, lkv param7, l6q param8, PrintWriter param9, l6q param10, String param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/km.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 24177019495995
      // 00b: lxor
      // 00c: lstore 12
      // 00e: dup2
      // 00f: ldc2_w 100841533628399
      // 012: lxor
      // 013: lstore 14
      // 015: dup2
      // 016: ldc2_w 60839172811743
      // 019: lxor
      // 01a: lstore 16
      // 01c: dup2
      // 01d: ldc2_w 64867959286034
      // 020: lxor
      // 021: lstore 18
      // 023: pop2
      // 024: ldc2_w -3546609020925263985
      // 027: lload 1
      // 028: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: aload 3
      // 02f: iload 4
      // 031: aload 5
      // 033: lload 18
      // 035: aload 6
      // 037: aload 8
      // 039: invokespecial com/zelix/kw.<init> (Lcom/zelix/_4;ILjava/lang/String;JLcom/zelix/h1;Lcom/zelix/l6q;)V
      // 03c: istore 20
      // 03e: aload 0
      // 03f: bipush 1
      // 040: putfield com/zelix/km.N Z
      // 043: aload 0
      // 044: aload 7
      // 046: putfield com/zelix/km.F Lcom/zelix/lkv;
      // 049: aload 0
      // 04a: getfield com/zelix/km.W I
      // 04d: newarray 8
      // 04f: astore 21
      // 051: aload 6
      // 053: aload 21
      // 055: invokevirtual com/zelix/h1.read ([B)I
      // 058: pop
      // 059: aload 21
      // 05b: bipush 0
      // 05c: lload 12
      // 05e: bipush 3
      // 05f: anewarray 426
      // 062: dup_x2
      // 063: dup_x2
      // 064: pop
      // 065: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068: bipush 2
      // 069: swap
      // 06a: aastore
      // 06b: dup_x1
      // 06c: swap
      // 06d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 070: bipush 1
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: bipush 0
      // 076: swap
      // 077: aastore
      // 078: ldc2_w -3151133419354511220
      // 07b: lload 1
      // 07c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/h1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: astore 22
      // 083: aload 0
      // 084: iload 20
      // 086: ifeq 351
      // 089: getfield com/zelix/km.W I
      // 08c: bipush 2
      // 08d: if_icmplt 2ea
      // 090: goto 09d
      // 093: ldc2_w -3147541019246557913
      // 096: lload 1
      // 097: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 0
      // 09e: aload 22
      // 0a0: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 0a3: putfield com/zelix/km.r I
      // 0a6: aload 0
      // 0a7: lload 1
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: ifle 2d4
      // 0ad: iload 20
      // 0af: ifeq 2d4
      // 0b2: goto 0bf
      // 0b5: ldc2_w -3147541019246557913
      // 0b8: lload 1
      // 0b9: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: getfield com/zelix/km.r I
      // 0c2: sipush 17294
      // 0c5: ldc2_w 3227916850162774295
      // 0c8: lload 1
      // 0c9: lxor
      // 0ca: invokedynamic k (IJ)I bsm=com/zelix/km.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: imul
      // 0d0: bipush 2
      // 0d1: iadd
      // 0d2: aload 0
      // 0d3: getfield com/zelix/km.W I
      // 0d6: if_icmpne 256
      // 0d9: goto 0e6
      // 0dc: ldc2_w -3147541019246557913
      // 0df: lload 1
      // 0e0: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: aload 0
      // 0e8: getfield com/zelix/km.r I
      // 0eb: anewarray 110
      // 0ee: putfield com/zelix/km.n [Lcom/zelix/b5;
      // 0f1: bipush 0
      // 0f2: istore 23
      // 0f4: iload 23
      // 0f6: aload 0
      // 0f7: getfield com/zelix/km.r I
      // 0fa: if_icmpge 245
      // 0fd: aload 0
      // 0fe: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 101: iload 23
      // 103: aload 0
      // 104: aload 22
      // 106: aload 0
      // 107: ldc2_w -3662209137538295718
      // 10a: lload 1
      // 10b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/lkv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aload 8
      // 112: aload 10
      // 114: lload 14
      // 116: bipush 5
      // 117: anewarray 426
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 4
      // 121: swap
      // 122: aastore
      // 123: dup_x1
      // 124: swap
      // 125: bipush 3
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 2
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x1
      // 12e: swap
      // 12f: bipush 1
      // 130: swap
      // 131: aastore
      // 132: dup_x1
      // 133: swap
      // 134: bipush 0
      // 135: swap
      // 136: aastore
      // 137: ldc2_w -3369638333613855098
      // 13a: lload 1
      // 13b: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/b5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: aastore
      // 141: iload 20
      // 143: lload 1
      // 144: lconst_0
      // 145: lcmp
      // 146: ifle 14e
      // 149: ifeq 367
      // 14c: iload 20
      // 14e: lload 1
      // 14f: lconst_0
      // 150: lcmp
      // 151: iflt 242
      // 154: ifeq 240
      // 157: goto 164
      // 15a: ldc2_w -3147541019246557913
      // 15d: lload 1
      // 15e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: lload 1
      // 165: lconst_0
      // 166: lcmp
      // 167: iflt 233
      // 16a: aload 0
      // 16b: getfield com/zelix/km.N Z
      // 16e: ifeq 230
      // 171: goto 17e
      // 174: ldc2_w -3147541019246557913
      // 177: lload 1
      // 178: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: aload 0
      // 17f: lload 1
      // 180: lconst_0
      // 181: lcmp
      // 182: iflt 21a
      // 185: iload 20
      // 187: ifeq 21a
      // 18a: goto 197
      // 18d: ldc2_w -3147541019246557913
      // 190: lload 1
      // 191: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 19a: iload 23
      // 19c: aaload
      // 19d: bipush 0
      // 19e: anewarray 426
      // 1a1: ldc2_w -3586371734237533307
      // 1a4: lload 1
      // 1a5: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: ifne 230
      // 1ad: goto 1ba
      // 1b0: ldc2_w -3147541019246557913
      // 1b3: lload 1
      // 1b4: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: aload 0
      // 1bb: bipush 0
      // 1bc: putfield com/zelix/km.N Z
      // 1bf: aload 9
      // 1c1: new java/lang/StringBuilder
      // 1c4: dup
      // 1c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c8: sipush 4436
      // 1cb: ldc2_w 4099449057804881931
      // 1ce: lload 1
      // 1cf: lxor
      // 1d0: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d8: aload 0
      // 1d9: lload 16
      // 1db: invokevirtual com/zelix/km.f (J)Ljava/lang/String;
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: sipush 14085
      // 1e4: ldc2_w 3267292169694262878
      // 1e7: lload 1
      // 1e8: lxor
      // 1e9: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: aload 11
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f6: sipush 8739
      // 1f9: ldc2_w 3608314503631348606
      // 1fc: lload 1
      // 1fd: lxor
      // 1fe: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 206: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 209: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 20c: aload 0
      // 20d: goto 21a
      // 210: ldc2_w -3147541019246557913
      // 213: lload 1
      // 214: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: aload 21
      // 21c: ldc2_w -3011289643630370520
      // 21f: lload 1
      // 220: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: iload 20
      // 227: lload 1
      // 228: lconst_0
      // 229: lcmp
      // 22a: ifle 253
      // 22d: ifne 245
      // 230: iinc 23 1
      // 233: goto 240
      // 236: ldc2_w -3147541019246557913
      // 239: lload 1
      // 23a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: iload 20
      // 242: ifne 0f4
      // 245: lload 1
      // 246: lconst_0
      // 247: lcmp
      // 248: iflt 367
      // 24b: iload 20
      // 24d: lload 1
      // 24e: lconst_0
      // 24f: lcmp
      // 250: iflt 143
      // 253: ifne 35c
      // 256: aload 0
      // 257: bipush 0
      // 258: putfield com/zelix/km.N Z
      // 25b: aload 9
      // 25d: new java/lang/StringBuilder
      // 260: dup
      // 261: invokespecial java/lang/StringBuilder.<init> ()V
      // 264: sipush 5112
      // 267: ldc2_w 2883246245544202914
      // 26a: lload 1
      // 26b: lxor
      // 26c: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 274: aload 0
      // 275: lload 16
      // 277: invokevirtual com/zelix/km.f (J)Ljava/lang/String;
      // 27a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27d: sipush 530
      // 280: ldc2_w 1552616309105591115
      // 283: lload 1
      // 284: lxor
      // 285: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28d: aload 11
      // 28f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 292: sipush 3745
      // 295: ldc2_w 7883590033281945597
      // 298: lload 1
      // 299: lxor
      // 29a: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a2: aload 0
      // 2a3: getfield com/zelix/km.r I
      // 2a6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2a9: sipush 918
      // 2ac: ldc2_w 2212102193009492686
      // 2af: lload 1
      // 2b0: lxor
      // 2b1: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b9: aload 0
      // 2ba: getfield com/zelix/km.W I
      // 2bd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c3: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2c6: aload 0
      // 2c7: goto 2d4
      // 2ca: ldc2_w -3147541019246557913
      // 2cd: lload 1
      // 2ce: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d3: athrow
      // 2d4: aload 21
      // 2d6: ldc2_w -3011289643630370520
      // 2d9: lload 1
      // 2da: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: lload 1
      // 2e0: lconst_0
      // 2e1: lcmp
      // 2e2: iflt 367
      // 2e5: iload 20
      // 2e7: ifne 35c
      // 2ea: aload 0
      // 2eb: bipush 0
      // 2ec: putfield com/zelix/km.N Z
      // 2ef: aload 9
      // 2f1: new java/lang/StringBuilder
      // 2f4: dup
      // 2f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f8: sipush 5112
      // 2fb: ldc2_w 2883246245544202914
      // 2fe: lload 1
      // 2ff: lxor
      // 300: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 308: aload 0
      // 309: lload 16
      // 30b: invokevirtual com/zelix/km.f (J)Ljava/lang/String;
      // 30e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 311: sipush 530
      // 314: ldc2_w 1552616309105591115
      // 317: lload 1
      // 318: lxor
      // 319: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 321: aload 11
      // 323: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 326: sipush 11793
      // 329: ldc2_w 3460478511744659279
      // 32c: lload 1
      // 32d: lxor
      // 32e: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/km.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 336: aload 0
      // 337: getfield com/zelix/km.W I
      // 33a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 33d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 340: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 343: aload 0
      // 344: goto 351
      // 347: ldc2_w -3147541019246557913
      // 34a: lload 1
      // 34b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: athrow
      // 351: aload 21
      // 353: ldc2_w -3011289643630370520
      // 356: lload 1
      // 357: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: aload 22
      // 35e: ldc2_w -4006226789621578420
      // 361: lload 1
      // 362: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: goto 37a
      // 36a: astore 24
      // 36c: aload 22
      // 36e: ldc2_w -4006226789621578420
      // 371: lload 1
      // 372: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: aload 24
      // 379: athrow
      // 37a: return
   }

   void G(Object[] var1) {
      df var4 = (df)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 101619522637097L;
      boolean var7 = m44.a<"h">(2362688953870799233L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = this.N;
            if (!var7) {
               break label28;
            }

            if (!this.N) {
               return;
            }
         } catch (n9 var9) {
            throw m44.a<"h">(var9, 4206270696725048105L, var2);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < this.n.length) {
         m44.a<"w">(this.n[var8], new Object[]{var5, var4}, 4080821092517435980L, var2);
         var8++;
         if (!var7) {
            break;
         }
      }
   }

   void z(gu param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 113240848016893
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w 6170399952317654249
      // 13: lload 2
      // 14: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 8
      // 1b: aload 0
      // 1c: getfield com/zelix/km.N Z
      // 1f: iload 8
      // 21: ifeq 54
      // 24: ifeq 7b
      // 27: goto 34
      // 2a: ldc2_w 5708299248435469889
      // 2d: lload 2
      // 2e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: athrow
      // 34: aload 1
      // 35: aload 0
      // 36: getfield com/zelix/km.b Lcom/zelix/x8;
      // 39: aload 0
      // 3a: aload 0
      // 3b: invokevirtual com/zelix/km.H ()Lcom/zelix/_4;
      // 3e: lload 4
      // 40: dup2_x1
      // 41: pop2
      // 42: invokevirtual com/zelix/gu.K (Lcom/zelix/js;Ljava/lang/Object;JLjava/lang/Object;)Z
      // 45: pop
      // 46: bipush 0
      // 47: goto 54
      // 4a: ldc2_w 5708299248435469889
      // 4d: lload 2
      // 4e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: istore 9
      // 56: iload 9
      // 58: aload 0
      // 59: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 5c: arraylength
      // 5d: if_icmpge 7b
      // 60: aload 0
      // 61: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 64: iload 9
      // 66: aaload
      // 67: aload 1
      // 68: lload 6
      // 6a: ldc2_w 6207356877339248454
      // 6d: lload 2
      // 6e: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: iinc 9 1
      // 76: iload 8
      // 78: ifne 56
      // 7b: return
   }

   protected final void c(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 111606548645625
      // 1f: lxor
      // 20: lstore 7
      // 22: pop2
      // 23: ldc2_w 1272493964096652623
      // 26: lload 3
      // 27: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: lload 5
      // 2f: aload 2
      // 30: bipush 2
      // 31: anewarray 426
      // 34: dup_x1
      // 35: swap
      // 36: bipush 1
      // 37: swap
      // 38: aastore
      // 39: dup_x2
      // 3a: dup_x2
      // 3b: pop
      // 3c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f: bipush 0
      // 40: swap
      // 41: aastore
      // 42: invokespecial com/zelix/kw.c ([Ljava/lang/Object;)V
      // 45: istore 9
      // 47: aload 0
      // 48: iload 9
      // 4a: ifne 6e
      // 4d: getfield com/zelix/km.N Z
      // 50: ifeq 97
      // 53: goto 60
      // 56: ldc2_w 1398058877560046096
      // 59: lload 3
      // 5a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 0
      // 61: goto 6e
      // 64: ldc2_w 1398058877560046096
      // 67: lload 3
      // 68: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: aload 2
      // 6f: lload 7
      // 71: bipush 2
      // 72: anewarray 426
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 1
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x1
      // 7f: swap
      // 80: bipush 0
      // 81: swap
      // 82: aastore
      // 83: ldc2_w 1625859627419531950
      // 86: lload 3
      // 87: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: lload 3
      // 8d: lconst_0
      // 8e: lcmp
      // 8f: ifle a5
      // 92: iload 9
      // 94: ifeq b2
      // 97: aload 2
      // 98: aload 0
      // 99: ldc2_w 1225708336046122527
      // 9c: lload 3
      // 9d: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: invokevirtual java/io/DataOutputStream.write ([B)V
      // a5: goto b2
      // a8: ldc2_w 1398058877560046096
      // ab: lload 3
      // ac: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: return
   }

   void V(Object[] param1) {
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
      // 00e: checkcast java/util/HashSet
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/df
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/km.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 56594930013382
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 26437160175385
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 36215226463844
      // 034: lxor
      // 035: dup2
      // 036: bipush 32
      // 038: lushr
      // 039: l2i
      // 03a: istore 10
      // 03c: dup2
      // 03d: bipush 32
      // 03f: lshl
      // 040: bipush 48
      // 042: lushr
      // 043: l2i
      // 044: istore 11
      // 046: dup2
      // 047: bipush 48
      // 049: lshl
      // 04a: bipush 48
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 12
      // 050: pop2
      // 051: pop2
      // 052: ldc2_w -2341651766845207705
      // 055: lload 3
      // 056: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: istore 13
      // 05d: aload 0
      // 05e: getfield com/zelix/km.N Z
      // 061: iload 13
      // 063: ifne 08d
      // 066: ifeq 3c1
      // 069: goto 076
      // 06c: ldc2_w -2499812532533490632
      // 06f: lload 3
      // 070: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: aload 2
      // 077: ldc2_w -4228277880869480531
      // 07a: lload 3
      // 07b: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: goto 08d
      // 083: ldc2_w -2499812532533490632
      // 086: lload 3
      // 087: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: ifle 3c1
      // 090: new java/util/ArrayList
      // 093: dup
      // 094: aload 0
      // 095: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 098: arraylength
      // 099: invokespecial java/util/ArrayList.<init> (I)V
      // 09c: astore 14
      // 09e: bipush 0
      // 09f: istore 15
      // 0a1: iload 15
      // 0a3: aload 0
      // 0a4: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 0a7: arraylength
      // 0a8: if_icmpge 276
      // 0ab: aload 2
      // 0ac: aload 0
      // 0ad: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 0b0: iload 15
      // 0b2: aaload
      // 0b3: bipush 0
      // 0b4: anewarray 426
      // 0b7: ldc2_w -4607149244086578208
      // 0ba: lload 3
      // 0bb: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: ldc2_w -4090791684142306918
      // 0c3: lload 3
      // 0c4: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: iload 13
      // 0cb: lload 3
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 283
      // 0d1: ifne 281
      // 0d4: iload 13
      // 0d6: ifne 15b
      // 0d9: goto 0e6
      // 0dc: ldc2_w -2499812532533490632
      // 0df: lload 3
      // 0e0: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: lload 3
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: iflt 14e
      // 0ec: ifeq 142
      // 0ef: goto 0fc
      // 0f2: ldc2_w -2499812532533490632
      // 0f5: lload 3
      // 0f6: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 2
      // 0fd: aload 0
      // 0fe: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 101: iload 15
      // 103: aaload
      // 104: bipush 0
      // 105: anewarray 426
      // 108: ldc2_w -2849324842096399219
      // 10b: lload 3
      // 10c: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: ldc2_w -4090791684142306918
      // 114: lload 3
      // 115: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: iload 13
      // 11c: ifne 1b5
      // 11f: goto 12c
      // 122: ldc2_w -2499812532533490632
      // 125: lload 3
      // 126: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: lload 3
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: iflt 1a8
      // 132: ifne 167
      // 135: goto 142
      // 138: ldc2_w -2499812532533490632
      // 13b: lload 3
      // 13c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: aload 14
      // 144: aload 0
      // 145: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 148: iload 15
      // 14a: aaload
      // 14b: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 14e: goto 15b
      // 151: ldc2_w -2499812532533490632
      // 154: lload 3
      // 155: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: pop
      // 15c: iload 13
      // 15e: lload 3
      // 15f: lconst_0
      // 160: lcmp
      // 161: ifle 273
      // 164: ifeq 26e
      // 167: aload 5
      // 169: aload 0
      // 16a: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 16d: iload 15
      // 16f: aaload
      // 170: bipush 0
      // 171: anewarray 426
      // 174: ldc2_w -4607149244086578208
      // 177: lload 3
      // 178: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: aload 0
      // 17e: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 181: iload 15
      // 183: aaload
      // 184: lload 6
      // 186: dup2_x1
      // 187: pop2
      // 188: bipush 3
      // 189: anewarray 426
      // 18c: dup_x1
      // 18d: swap
      // 18e: bipush 2
      // 18f: swap
      // 190: aastore
      // 191: dup_x2
      // 192: dup_x2
      // 193: pop
      // 194: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 197: bipush 1
      // 198: swap
      // 199: aastore
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 0
      // 19d: swap
      // 19e: aastore
      // 19f: ldc2_w -2872402414359727997
      // 1a2: lload 3
      // 1a3: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: goto 1b5
      // 1ab: ldc2_w -2499812532533490632
      // 1ae: lload 3
      // 1af: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: istore 16
      // 1b7: aload 5
      // 1b9: aload 0
      // 1ba: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 1bd: iload 15
      // 1bf: aaload
      // 1c0: bipush 0
      // 1c1: anewarray 426
      // 1c4: ldc2_w -2849324842096399219
      // 1c7: lload 3
      // 1c8: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: aload 0
      // 1ce: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 1d1: iload 15
      // 1d3: aaload
      // 1d4: lload 6
      // 1d6: dup2_x1
      // 1d7: pop2
      // 1d8: bipush 3
      // 1d9: anewarray 426
      // 1dc: dup_x1
      // 1dd: swap
      // 1de: bipush 2
      // 1df: swap
      // 1e0: aastore
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 1
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 0
      // 1ed: swap
      // 1ee: aastore
      // 1ef: ldc2_w -2872402414359727997
      // 1f2: lload 3
      // 1f3: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: istore 16
      // 1fa: aload 0
      // 1fb: aload 0
      // 1fc: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 1ff: iload 15
      // 201: aaload
      // 202: bipush 0
      // 203: anewarray 426
      // 206: ldc2_w -4607149244086578208
      // 209: lload 3
      // 20a: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: aload 5
      // 211: lload 8
      // 213: bipush 3
      // 214: anewarray 426
      // 217: dup_x2
      // 218: dup_x2
      // 219: pop
      // 21a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21d: bipush 2
      // 21e: swap
      // 21f: aastore
      // 220: dup_x1
      // 221: swap
      // 222: bipush 1
      // 223: swap
      // 224: aastore
      // 225: dup_x1
      // 226: swap
      // 227: bipush 0
      // 228: swap
      // 229: aastore
      // 22a: ldc2_w -2761234928168560293
      // 22d: lload 3
      // 22e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: pop
      // 234: aload 0
      // 235: aload 0
      // 236: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 239: iload 15
      // 23b: aaload
      // 23c: bipush 0
      // 23d: anewarray 426
      // 240: ldc2_w -2849324842096399219
      // 243: lload 3
      // 244: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: aload 5
      // 24b: lload 8
      // 24d: bipush 3
      // 24e: anewarray 426
      // 251: dup_x2
      // 252: dup_x2
      // 253: pop
      // 254: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 257: bipush 2
      // 258: swap
      // 259: aastore
      // 25a: dup_x1
      // 25b: swap
      // 25c: bipush 1
      // 25d: swap
      // 25e: aastore
      // 25f: dup_x1
      // 260: swap
      // 261: bipush 0
      // 262: swap
      // 263: aastore
      // 264: ldc2_w -2761234928168560293
      // 267: lload 3
      // 268: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: pop
      // 26e: iinc 15 1
      // 271: iload 13
      // 273: ifeq 0a1
      // 276: aload 14
      // 278: lload 3
      // 279: lconst_0
      // 27a: lcmp
      // 27b: ifle 2a3
      // 27e: invokevirtual java/util/ArrayList.size ()I
      // 281: iload 13
      // 283: lload 3
      // 284: lconst_0
      // 285: lcmp
      // 286: iflt 291
      // 289: ifne 2b3
      // 28c: aload 0
      // 28d: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 290: arraylength
      // 291: if_icmpge 2e7
      // 294: goto 2a1
      // 297: ldc2_w -2499812532533490632
      // 29a: lload 3
      // 29b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: aload 14
      // 2a3: invokevirtual java/util/ArrayList.size ()I
      // 2a6: goto 2b3
      // 2a9: ldc2_w -2499812532533490632
      // 2ac: lload 3
      // 2ad: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: athrow
      // 2b3: anewarray 110
      // 2b6: astore 15
      // 2b8: aload 0
      // 2b9: aload 14
      // 2bb: aload 15
      // 2bd: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 2c0: checkcast [Lcom/zelix/b5;
      // 2c3: putfield com/zelix/km.n [Lcom/zelix/b5;
      // 2c6: aload 0
      // 2c7: aload 0
      // 2c8: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 2cb: arraylength
      // 2cc: putfield com/zelix/km.r I
      // 2cf: aload 0
      // 2d0: aload 0
      // 2d1: getfield com/zelix/km.r I
      // 2d4: sipush 2914
      // 2d7: ldc2_w 7025005440536965349
      // 2da: lload 3
      // 2db: lxor
      // 2dc: invokedynamic k (IJ)I bsm=com/zelix/km.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: imul
      // 2e2: bipush 2
      // 2e3: iadd
      // 2e4: putfield com/zelix/km.W I
      // 2e7: aload 0
      // 2e8: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 2eb: astore 15
      // 2ed: aload 15
      // 2ef: arraylength
      // 2f0: istore 16
      // 2f2: bipush 0
      // 2f3: istore 17
      // 2f5: iload 17
      // 2f7: iload 16
      // 2f9: if_icmpge 3c1
      // 2fc: aload 15
      // 2fe: iload 17
      // 300: aaload
      // 301: astore 18
      // 303: aload 18
      // 305: bipush 0
      // 306: anewarray 426
      // 309: ldc2_w -4607149244086578208
      // 30c: lload 3
      // 30d: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 312: bipush 2
      // 313: iload 10
      // 315: iload 11
      // 317: i2c
      // 318: iload 12
      // 31a: i2c
      // 31b: invokevirtual com/zelix/iq.a (IICC)Z
      // 31e: lload 3
      // 31f: lconst_0
      // 320: lcmp
      // 321: iflt 38e
      // 324: iload 13
      // 326: ifne 38e
      // 329: ifne 35b
      // 32c: goto 339
      // 32f: ldc2_w -2499812532533490632
      // 332: lload 3
      // 333: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: athrow
      // 339: aload 18
      // 33b: bipush 0
      // 33c: anewarray 426
      // 33f: ldc2_w -4607149244086578208
      // 342: lload 3
      // 343: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: getstatic com/zelix/m7.t Lcom/zelix/m7;
      // 34b: invokevirtual com/zelix/iq.G (Lcom/zelix/m7;)V
      // 34e: goto 35b
      // 351: ldc2_w -2499812532533490632
      // 354: lload 3
      // 355: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: athrow
      // 35b: aload 18
      // 35d: bipush 0
      // 35e: anewarray 426
      // 361: ldc2_w -2849324842096399219
      // 364: lload 3
      // 365: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: iload 13
      // 36c: lload 3
      // 36d: lconst_0
      // 36e: lcmp
      // 36f: iflt 376
      // 372: ifne 3b3
      // 375: bipush 2
      // 376: iload 10
      // 378: iload 11
      // 37a: i2c
      // 37b: iload 12
      // 37d: i2c
      // 37e: invokevirtual com/zelix/iq.a (IICC)Z
      // 381: goto 38e
      // 384: ldc2_w -2499812532533490632
      // 387: lload 3
      // 388: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38d: athrow
      // 38e: lload 3
      // 38f: lconst_0
      // 390: lcmp
      // 391: ifle 3be
      // 394: ifne 3b9
      // 397: aload 18
      // 399: bipush 0
      // 39a: anewarray 426
      // 39d: ldc2_w -2849324842096399219
      // 3a0: lload 3
      // 3a1: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: goto 3b3
      // 3a9: ldc2_w -2499812532533490632
      // 3ac: lload 3
      // 3ad: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b2: athrow
      // 3b3: getstatic com/zelix/m7.t Lcom/zelix/m7;
      // 3b6: invokevirtual com/zelix/iq.G (Lcom/zelix/m7;)V
      // 3b9: iinc 17 1
      // 3bc: iload 13
      // 3be: ifeq 2f5
      // 3c1: return
   }

   private boolean w(Object[] param1) {
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
      // 04: checkcast com/zelix/iq
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/df
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: getstatic com/zelix/km.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 51692383070282
      // 27: lxor
      // 28: lstore 6
      // 2a: dup2
      // 2b: ldc2_w 100342922820776
      // 2e: lxor
      // 2f: lstore 8
      // 31: pop2
      // 32: ldc2_w -611389676550118556
      // 35: lload 2
      // 36: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: istore 10
      // 3d: aload 0
      // 3e: getfield com/zelix/km.N Z
      // 41: iload 10
      // 43: ifne 57
      // 46: ifne 58
      // 49: goto 56
      // 4c: ldc2_w -770746703381748677
      // 4f: lload 2
      // 50: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: bipush 0
      // 57: ireturn
      // 58: aload 4
      // 5a: lload 8
      // 5c: aload 5
      // 5e: invokevirtual com/zelix/df.J (JLjava/lang/Object;)Ljava/util/Set;
      // 61: astore 11
      // 63: iload 10
      // 65: ifne fa
      // 68: aload 11
      // 6a: ifnull d2
      // 6d: goto 7a
      // 70: ldc2_w -770746703381748677
      // 73: lload 2
      // 74: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 11
      // 7c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 81: astore 12
      // 83: aload 12
      // 85: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8a: ifeq d2
      // 8d: aload 12
      // 8f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 94: checkcast com/zelix/lmt
      // 97: astore 13
      // 99: aload 13
      // 9b: instanceof com/zelix/b5
      // 9e: iload 10
      // a0: lload 2
      // a1: lconst_0
      // a2: lcmp
      // a3: iflt ab
      // a6: ifne fb
      // a9: iload 10
      // ab: ifne cc
      // ae: goto bb
      // b1: ldc2_w -770746703381748677
      // b4: lload 2
      // b5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: ifeq cd
      // be: goto cb
      // c1: ldc2_w -770746703381748677
      // c4: lload 2
      // c5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: athrow
      // cb: bipush 0
      // cc: ireturn
      // cd: iload 10
      // cf: ifeq 83
      // d2: aload 5
      // d4: lload 6
      // d6: ldc2_w -1163444901826884130
      // d9: lload 2
      // da: invokedynamic n (JJ)Lcom/zelix/ow; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // df: bipush 2
      // e0: anewarray 426
      // e3: dup_x1
      // e4: swap
      // e5: bipush 1
      // e6: swap
      // e7: aastore
      // e8: dup_x2
      // e9: dup_x2
      // ea: pop
      // eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ee: bipush 0
      // ef: swap
      // f0: aastore
      // f1: ldc2_w -653304518904020486
      // f4: lload 2
      // f5: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fa: bipush 1
      // fb: ireturn
   }

   abstract b5 j(Object[] var1);

   Map j(Object[] param1) {
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
      // 00c: getstatic com/zelix/km.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 68836527808967
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 101171830235460
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 8928077356655
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 84622513631631
      // 02c: lxor
      // 02d: dup2
      // 02e: bipush 32
      // 030: lushr
      // 031: l2i
      // 032: istore 10
      // 034: dup2
      // 035: bipush 32
      // 037: lshl
      // 038: bipush 48
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 11
      // 03e: dup2
      // 03f: bipush 48
      // 041: lshl
      // 042: bipush 48
      // 044: lushr
      // 045: l2i
      // 046: istore 12
      // 048: pop2
      // 049: pop2
      // 04a: ldc2_w -7082816018664928941
      // 04d: lload 2
      // 04e: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: istore 13
      // 055: aload 0
      // 056: getfield com/zelix/km.N Z
      // 059: ifne 068
      // 05c: aconst_null
      // 05d: areturn
      // 05e: ldc2_w -6954998203703570932
      // 061: lload 2
      // 062: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: new java/util/ArrayList
      // 06b: dup
      // 06c: aload 0
      // 06d: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 070: arraylength
      // 071: invokespecial java/util/ArrayList.<init> (I)V
      // 074: astore 14
      // 076: aload 0
      // 077: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 07a: arraylength
      // 07b: iload 10
      // 07d: iload 11
      // 07f: i2c
      // 080: iload 12
      // 082: i2s
      // 083: invokestatic com/zelix/cf.x (IICS)I
      // 086: lload 8
      // 088: bipush 2
      // 089: anewarray 426
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 1
      // 093: swap
      // 094: aastore
      // 095: dup_x1
      // 096: swap
      // 097: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09a: bipush 0
      // 09b: swap
      // 09c: aastore
      // 09d: ldc2_w -7300822941492699314
      // 0a0: lload 2
      // 0a1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: astore 15
      // 0a8: aload 0
      // 0a9: getfield com/zelix/km.n [Lcom/zelix/b5;
      // 0ac: astore 16
      // 0ae: aload 16
      // 0b0: arraylength
      // 0b1: istore 17
      // 0b3: bipush 0
      // 0b4: istore 18
      // 0b6: iload 18
      // 0b8: iload 17
      // 0ba: if_icmpge 14b
      // 0bd: aload 16
      // 0bf: iload 18
      // 0c1: aaload
      // 0c2: astore 19
      // 0c4: iload 13
      // 0c6: lload 2
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 148
      // 0cc: ifne 146
      // 0cf: aload 19
      // 0d1: bipush 0
      // 0d2: anewarray 426
      // 0d5: ldc2_w -8858030652481118034
      // 0d8: lload 2
      // 0d9: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: iload 13
      // 0e0: ifne 151
      // 0e3: goto 0f0
      // 0e6: ldc2_w -6954998203703570932
      // 0e9: lload 2
      // 0ea: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: ifeq 143
      // 0f3: goto 100
      // 0f6: ldc2_w -6954998203703570932
      // 0f9: lload 2
      // 0fa: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 14
      // 102: new com/zelix/lk9
      // 105: dup
      // 106: aload 19
      // 108: bipush 0
      // 109: anewarray 426
      // 10c: ldc2_w -8647016223340888758
      // 10f: lload 2
      // 110: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: aload 19
      // 117: lload 6
      // 119: bipush 1
      // 11a: anewarray 426
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: ldc2_w -7370425541796885737
      // 129: lload 2
      // 12a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: invokespecial com/zelix/lk9.<init> (ILjava/lang/Object;)V
      // 132: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 135: pop
      // 136: goto 143
      // 139: ldc2_w -6954998203703570932
      // 13c: lload 2
      // 13d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: iinc 18 1
      // 146: iload 13
      // 148: ifeq 0b6
      // 14b: aload 14
      // 14d: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 150: bipush -1
      // 151: istore 16
      // 153: aload 14
      // 155: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 158: astore 17
      // 15a: aload 17
      // 15c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 161: ifeq 1c0
      // 164: aload 17
      // 166: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16b: checkcast com/zelix/lk9
      // 16e: astore 18
      // 170: aload 18
      // 172: lload 2
      // 173: lconst_0
      // 174: lcmp
      // 175: iflt 1ba
      // 178: invokevirtual com/zelix/lk9.n ()I
      // 17b: iload 13
      // 17d: ifne 1a4
      // 180: iload 16
      // 182: if_icmple 1bb
      // 185: goto 192
      // 188: ldc2_w -6954998203703570932
      // 18b: lload 2
      // 18c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: aload 18
      // 194: invokevirtual com/zelix/lk9.n ()I
      // 197: goto 1a4
      // 19a: ldc2_w -6954998203703570932
      // 19d: lload 2
      // 19e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: istore 16
      // 1a6: aload 15
      // 1a8: getstatic com/zelix/km.S Lcom/zelix/o9;
      // 1ab: lload 4
      // 1ad: iload 16
      // 1af: invokevirtual com/zelix/o9.e (JI)Ljava/lang/Integer;
      // 1b2: aload 18
      // 1b4: invokevirtual com/zelix/lk9.W ()Ljava/lang/Object;
      // 1b7: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1ba: pop
      // 1bb: iload 13
      // 1bd: ifeq 15a
      // 1c0: aload 15
      // 1c2: lload 2
      // 1c3: lconst_0
      // 1c4: lcmp
      // 1c5: ifle 16b
      // 1c8: areturn
   }

   public void W(Object[] var1) {
      long var3 = (Long)var1[0];
      int var5 = (Integer)var1[1];
      int var7 = (Integer)var1[2];
      HashMap var6 = (HashMap)var1[3];
      HashMap var2 = (HashMap)var1[4];
      long var8 = var3 ^ 11834931931659L;
      boolean var10 = m44.a<"n">(8223466915102598904L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = this.N;
            if (var10) {
               break label28;
            }

            if (!this.N) {
               return;
            }
         } catch (n9 var12) {
            throw m44.a<"n">(var12, 8129479145561072039L, var3);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < this.n.length) {
         b5 var13 = this.n[var11];
         Object[] var10006 = new Object[]{null, null, var7, var2};
         var10006[1] = var8;
         var10006[0] = var5;
         m44.a<"q">(var13, var10006, 8349290212028726254L, var3);
         var11++;
         if (var10) {
            break;
         }
      }
   }

   final int g(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      boolean var6 = m44.a<"n">(-22607516224745753L, var4);

      try {
         if (!var6) {
            return this.N;
         }

         if (this.N) {
            return 2 + this.n.length * c<"k">(17294, 3227843098802716799L ^ var4);
         }
      } catch (n9 var8) {
         throw m44.a<"n">(var8, -1929238934413331377L, var4);
      }

      return m44.a<"p">(this, -1775113755907108800L, var4).length;
   }

   static {
      long var11 = a ^ 105813291932472L;
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
      String var17 = "£\u000e\u0014M½3Â\u0092*³)='{RF\u0018CtDîstn\u008e§\u009e\u000eáà\u0099}gv\u0017²\u00adRû>¯\u0010éÕ[Bw4\u00ad\u001bÊ¥ìõÖ\u0017&N ·æîÛY\u0081µ\u008d\u0081S`8^¡ÐÀ\u009e¿a\u001eIÛj©$\u0081\u0018æ\u0092ï&\u007f\u0010\u0099Ü\u0086m¶\u009c¤\u000fÏ¥\u0013Ä\u0096öÔî l\u0093\u0005\u0091\u0010l+\u009cÂ{ò\u0084°®1çèAÀ6&Bñ6Í\u0005@\u0096¬#v\u0092";
      int var19 = "£\u000e\u0014M½3Â\u0092*³)='{RF\u0018CtDîstn\u008e§\u009e\u000eáà\u0099}gv\u0017²\u00adRû>¯\u0010éÕ[Bw4\u00ad\u001bÊ¥ìõÖ\u0017&N ·æîÛY\u0081µ\u008d\u0081S`8^¡ÐÀ\u009e¿a\u001eIÛj©$\u0081\u0018æ\u0092ï&\u007f\u0010\u0099Ü\u0086m¶\u009c¤\u000fÏ¥\u0013Ä\u0096öÔî l\u0093\u0005\u0091\u0010l+\u009cÂ{ò\u0084°®1çèAÀ6&Bñ6Í\u0005@\u0096¬#v\u0092"
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
                     d = var20;
                     g = new String[8];
                     l = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "[ty5F8ÌJ\u0005[ø;\u0014íq\t";
                     int var5 = "[ty5F8ÌJ\u0005[ø;\u0014íq\t".length();
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

                     j = var6;
                     k = new Integer[2];
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

                  var17 = "C>¬|TÁ£Bªë\u0097FqúæG\u0010}ë¸;»ü\nâ¿1\u0015\r¢`õJ";
                  var19 = "C>¬|TÁ£Bªë\u0097FqúæG\u0010}ë¸;»ü\nâ¿1\u0015\r¢`õJ".length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23684;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/km", var10);
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
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/km" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12097;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/km", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("com/zelix/km" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
