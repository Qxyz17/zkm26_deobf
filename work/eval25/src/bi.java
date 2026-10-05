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

public class bi extends hv {
   private iq[] t;
   private static final long a = ess.a(2584565209158418640L, 7064663200613471227L, MethodHandles.lookup().lookupClass()).a(207310820316935L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long g;

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
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 5
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 0
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 88904347469799
      // 02f: lxor
      // 030: lstore 9
      // 032: pop2
      // 033: ldc2_w -3921248847547794946
      // 036: lload 3
      // 037: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 0
      // 03d: aload 6
      // 03f: lload 7
      // 041: aload 2
      // 042: aload 5
      // 044: bipush 4
      // 045: anewarray 114
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 3
      // 04b: swap
      // 04c: aastore
      // 04d: dup_x1
      // 04e: swap
      // 04f: bipush 2
      // 050: swap
      // 051: aastore
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: invokespecial com/zelix/hv.j ([Ljava/lang/Object;)V
      // 063: istore 11
      // 065: aload 0
      // 066: ldc2_w -3795817549990238860
      // 069: lload 3
      // 06a: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 11
      // 071: ifeq 096
      // 074: ifeq 10d
      // 077: goto 084
      // 07a: ldc2_w -2989456708953793909
      // 07d: lload 3
      // 07e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: aload 0
      // 085: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 088: arraylength
      // 089: goto 096
      // 08c: ldc2_w -2989456708953793909
      // 08f: lload 3
      // 090: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: istore 12
      // 098: aload 6
      // 09a: iload 12
      // 09c: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 09f: bipush 0
      // 0a0: istore 13
      // 0a2: iload 13
      // 0a4: iload 12
      // 0a6: if_icmpge 102
      // 0a9: aload 0
      // 0aa: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 0ad: iload 13
      // 0af: aaload
      // 0b0: aload 6
      // 0b2: aload 2
      // 0b3: aload 5
      // 0b5: lload 9
      // 0b7: bipush 4
      // 0b8: anewarray 114
      // 0bb: dup_x2
      // 0bc: dup_x2
      // 0bd: pop
      // 0be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c1: bipush 3
      // 0c2: swap
      // 0c3: aastore
      // 0c4: dup_x1
      // 0c5: swap
      // 0c6: bipush 2
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 1
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: bipush 0
      // 0d1: swap
      // 0d2: aastore
      // 0d3: ldc2_w -3588110911779870022
      // 0d6: lload 3
      // 0d7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: iinc 13 1
      // 0df: iload 11
      // 0e1: lload 3
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: ifle 0ec
      // 0e7: ifeq 129
      // 0ea: iload 11
      // 0ec: ifne 0a2
      // 0ef: lload 3
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: ifle 0df
      // 0f5: goto 102
      // 0f8: ldc2_w -2989456708953793909
      // 0fb: lload 3
      // 0fc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: lload 3
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 11c
      // 108: iload 11
      // 10a: ifne 129
      // 10d: aload 6
      // 10f: aload 0
      // 110: ldc2_w -4010137101812909442
      // 113: lload 3
      // 114: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: invokevirtual java/io/DataOutputStream.write ([B)V
      // 11c: goto 129
      // 11f: ldc2_w -2989456708953793909
      // 122: lload 3
      // 123: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: return
   }

   void f(Object[] param1) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/bi.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 81649876612196
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 1915695667632941823
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 28: arraylength
      // 29: istore 7
      // 2b: istore 6
      // 2d: bipush 0
      // 2e: istore 8
      // 30: iload 8
      // 32: iload 7
      // 34: if_icmpge 68
      // 37: aload 0
      // 38: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 3b: iload 8
      // 3d: aaload
      // 3e: lload 4
      // 40: iload 8
      // 42: bipush 2
      // 43: anewarray 114
      // 46: dup_x1
      // 47: swap
      // 48: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4b: bipush 1
      // 4c: swap
      // 4d: aastore
      // 4e: dup_x2
      // 4f: dup_x2
      // 50: pop
      // 51: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 54: bipush 0
      // 55: swap
      // 56: aastore
      // 57: ldc2_w 505354237290127597
      // 5a: lload 2
      // 5b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: iinc 8 1
      // 63: iload 6
      // 65: ifne 30
      // 68: lload 2
      // 69: lconst_0
      // 6a: lcmp
      // 6b: iflt 63
      // 6e: return
   }

   protected void O(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 4
      // 013: pop
      // 014: lload 2
      // 015: dup2
      // 016: ldc2_w 114259145761973
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 0
      // 020: lxor
      // 021: lstore 7
      // 023: pop2
      // 024: ldc2_w -8511028589403193946
      // 027: lload 2
      // 028: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: lload 7
      // 030: aload 4
      // 032: bipush 2
      // 033: anewarray 114
      // 036: dup_x1
      // 037: swap
      // 038: bipush 1
      // 039: swap
      // 03a: aastore
      // 03b: dup_x2
      // 03c: dup_x2
      // 03d: pop
      // 03e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 041: bipush 0
      // 042: swap
      // 043: aastore
      // 044: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 047: istore 9
      // 049: aload 0
      // 04a: ldc2_w -7614518121811986315
      // 04d: lload 2
      // 04e: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: iload 9
      // 055: ifne 07a
      // 058: ifeq 0e4
      // 05b: goto 068
      // 05e: ldc2_w -8394128173450999926
      // 061: lload 2
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 0
      // 069: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 06c: arraylength
      // 06d: goto 07a
      // 070: ldc2_w -8394128173450999926
      // 073: lload 2
      // 074: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: istore 10
      // 07c: aload 4
      // 07e: iload 10
      // 080: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 083: bipush 0
      // 084: istore 11
      // 086: iload 11
      // 088: iload 10
      // 08a: if_icmpge 0d9
      // 08d: aload 0
      // 08e: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 091: iload 11
      // 093: aaload
      // 094: aload 4
      // 096: lload 5
      // 098: bipush 2
      // 099: anewarray 114
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 1
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 0
      // 0a8: swap
      // 0a9: aastore
      // 0aa: ldc2_w -8622929331700582471
      // 0ad: lload 2
      // 0ae: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: iinc 11 1
      // 0b6: iload 9
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: ifle 0c3
      // 0be: ifne 100
      // 0c1: iload 9
      // 0c3: ifeq 086
      // 0c6: lload 2
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 0b6
      // 0cc: goto 0d9
      // 0cf: ldc2_w -8394128173450999926
      // 0d2: lload 2
      // 0d3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: lload 2
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 0f3
      // 0df: iload 9
      // 0e1: ifeq 100
      // 0e4: aload 4
      // 0e6: aload 0
      // 0e7: ldc2_w -7685285436080527489
      // 0ea: lload 2
      // 0eb: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: invokevirtual java/io/DataOutputStream.write ([B)V
      // 0f3: goto 100
      // 0f6: ldc2_w -8394128173450999926
      // 0f9: lload 2
      // 0fa: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: return
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
      // 004: checkcast com/zelix/_3
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/List
      // 019: astore 8
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Long
      // 021: invokevirtual java/lang/Long.longValue ()J
      // 024: lstore 6
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/_83
      // 02c: astore 5
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/util/List
      // 034: astore 2
      // 035: pop
      // 036: getstatic com/zelix/bi.a J
      // 039: lload 6
      // 03b: lxor
      // 03c: lstore 6
      // 03e: lload 6
      // 040: dup2
      // 041: ldc2_w 75827848992047
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 4567367769733
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 51050690691225
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 136468986168311
      // 059: lxor
      // 05a: lstore 15
      // 05c: pop2
      // 05d: ldc2_w -4259925931376249717
      // 060: lload 6
      // 062: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: aload 4
      // 069: lload 13
      // 06b: bipush 1
      // 06c: anewarray 114
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 0
      // 076: swap
      // 077: aastore
      // 078: ldc2_w -2808956736738899809
      // 07b: lload 6
      // 07d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: istore 18
      // 084: istore 17
      // 086: aload 4
      // 088: bipush 0
      // 089: anewarray 114
      // 08c: ldc2_w -2602938338373981720
      // 08f: lload 6
      // 091: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: istore 19
      // 098: iload 18
      // 09a: anewarray 397
      // 09d: astore 20
      // 09f: aload 4
      // 0a1: lload 11
      // 0a3: bipush 1
      // 0a4: anewarray 114
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w -2737189394528183707
      // 0b3: lload 6
      // 0b5: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: astore 21
      // 0bc: bipush 0
      // 0bd: istore 22
      // 0bf: aload 21
      // 0c1: iload 22
      // 0c3: iaload
      // 0c4: istore 23
      // 0c6: bipush 0
      // 0c7: istore 24
      // 0c9: bipush 0
      // 0ca: istore 25
      // 0cc: iload 25
      // 0ce: iload 18
      // 0d0: if_icmpge 1a4
      // 0d3: lload 6
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: ifle 1bf
      // 0da: iload 25
      // 0dc: iload 17
      // 0de: ifeq 1be
      // 0e1: iload 23
      // 0e3: iload 17
      // 0e5: ifeq 149
      // 0e8: goto 0f6
      // 0eb: ldc2_w -2596870629454931970
      // 0ee: lload 6
      // 0f0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: if_icmpne 17f
      // 0f9: goto 107
      // 0fc: ldc2_w -2596870629454931970
      // 0ff: lload 6
      // 101: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 20
      // 109: iload 25
      // 10b: new com/zelix/iq
      // 10e: dup
      // 10f: aload 0
      // 110: lload 15
      // 112: aload 5
      // 114: aload 2
      // 115: invokespecial com/zelix/iq.<init> (Lcom/zelix/bi;JLcom/zelix/_83;Ljava/util/List;)V
      // 118: aastore
      // 119: iinc 22 1
      // 11c: iload 22
      // 11e: lload 6
      // 120: lconst_0
      // 121: lcmp
      // 122: iflt 175
      // 125: iload 17
      // 127: ifeq 171
      // 12a: goto 138
      // 12d: ldc2_w -2596870629454931970
      // 130: lload 6
      // 132: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 21
      // 13a: arraylength
      // 13b: goto 149
      // 13e: ldc2_w -2596870629454931970
      // 141: lload 6
      // 143: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: if_icmpge 15f
      // 14c: aload 21
      // 14e: iload 22
      // 150: iaload
      // 151: istore 23
      // 153: iload 17
      // 155: lload 6
      // 157: lconst_0
      // 158: lcmp
      // 159: iflt 1a1
      // 15c: ifne 19c
      // 15f: getstatic com/zelix/bi.g J
      // 162: l2i
      // 163: goto 171
      // 166: ldc2_w -2596870629454931970
      // 169: lload 6
      // 16b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: istore 23
      // 173: iload 17
      // 175: lload 6
      // 177: lconst_0
      // 178: lcmp
      // 179: ifle 1a1
      // 17c: ifne 19c
      // 17f: aload 20
      // 181: iload 25
      // 183: aload 0
      // 184: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 187: iload 24
      // 189: iinc 24 1
      // 18c: aaload
      // 18d: aastore
      // 18e: goto 19c
      // 191: ldc2_w -2596870629454931970
      // 194: lload 6
      // 196: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: iinc 25 1
      // 19f: iload 17
      // 1a1: ifne 0cc
      // 1a4: aload 0
      // 1a5: aload 20
      // 1a7: putfield com/zelix/bi.t [Lcom/zelix/iq;
      // 1aa: lload 6
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: iflt 0d3
      // 1b1: aload 0
      // 1b2: lload 9
      // 1b4: ldc2_w -2687434159643049582
      // 1b7: lload 6
      // 1b9: invokedynamic h (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: pop
      // 1bf: return
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
      // 19: aload 3
      // 1a: aload 0
      // 1b: getfield com/zelix/bi.c Lcom/zelix/mx;
      // 1e: aload 0
      // 1f: aload 0
      // 20: invokevirtual com/zelix/bi.x ()Lcom/zelix/h8;
      // 23: lload 6
      // 25: invokevirtual com/zelix/_8l.H (Lcom/zelix/xl;Ljava/lang/Object;Ljava/lang/Object;J)Z
      // 28: pop
      // 29: istore 8
      // 2b: aload 0
      // 2c: ldc2_w -6548045577707648250
      // 2f: lload 1
      // 30: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: iload 8
      // 37: ifeq 5c
      // 3a: ifeq 83
      // 3d: goto 4a
      // 40: ldc2_w -5120179602271046407
      // 43: lload 1
      // 44: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 4e: arraylength
      // 4f: goto 5c
      // 52: ldc2_w -5120179602271046407
      // 55: lload 1
      // 56: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: istore 9
      // 5e: bipush 0
      // 5f: istore 10
      // 61: iload 10
      // 63: iload 9
      // 65: if_icmpge 83
      // 68: aload 0
      // 69: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 6c: iload 10
      // 6e: aaload
      // 6f: lload 4
      // 71: aload 3
      // 72: ldc2_w -4926467265418489313
      // 75: lload 1
      // 76: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: iinc 10 1
      // 7e: iload 8
      // 80: ifne 61
      // 83: return
   }

   bi(h8 param1, int param2, String param3, _xx param4, long param5, _y4 param7, PrintWriter param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/bi.a J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 48736498290760
      // 00e: lxor
      // 00f: lstore 9
      // 011: dup2
      // 012: ldc2_w 84778245875101
      // 015: lxor
      // 016: lstore 11
      // 018: dup2
      // 019: ldc2_w 35376278886409
      // 01c: lxor
      // 01d: lstore 13
      // 01f: dup2
      // 020: ldc2_w 74286764612818
      // 023: lxor
      // 024: lstore 15
      // 026: dup2
      // 027: ldc2_w 2660358153288
      // 02a: lxor
      // 02b: lstore 17
      // 02d: dup2
      // 02e: ldc2_w 102861327468587
      // 031: lxor
      // 032: lstore 19
      // 034: pop2
      // 035: aload 0
      // 036: lload 11
      // 038: aload 1
      // 039: iload 2
      // 03a: aload 3
      // 03b: aload 4
      // 03d: aload 7
      // 03f: invokespecial com/zelix/hv.<init> (JLcom/zelix/h8;ILjava/lang/String;Lcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 042: aload 0
      // 043: getfield com/zelix/bi.C I
      // 046: newarray 8
      // 048: astore 22
      // 04a: ldc2_w 321321109028353055
      // 04d: lload 5
      // 04f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 4
      // 056: aload 22
      // 058: invokevirtual com/zelix/_xx.read ([B)I
      // 05b: pop
      // 05c: istore 21
      // 05e: aload 22
      // 060: lload 15
      // 062: bipush 0
      // 063: bipush 3
      // 064: anewarray 114
      // 067: dup_x1
      // 068: swap
      // 069: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 06c: bipush 2
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: ldc2_w 97981473694381615
      // 080: lload 5
      // 082: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: astore 23
      // 089: aload 0
      // 08a: iload 21
      // 08c: ifeq 207
      // 08f: getfield com/zelix/bi.C I
      // 092: bipush 2
      // 093: if_icmplt 1ec
      // 096: goto 0a4
      // 099: ldc2_w 1973196606779840362
      // 09c: lload 5
      // 09e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 23
      // 0a6: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 0a9: istore 24
      // 0ab: aload 0
      // 0ac: iload 24
      // 0ae: anewarray 397
      // 0b1: putfield com/zelix/bi.t [Lcom/zelix/iq;
      // 0b4: bipush 0
      // 0b5: istore 25
      // 0b7: iload 25
      // 0b9: iload 24
      // 0bb: if_icmpge 1d9
      // 0be: aload 0
      // 0bf: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 0c2: iload 25
      // 0c4: new com/zelix/iq
      // 0c7: dup
      // 0c8: aload 0
      // 0c9: aload 23
      // 0cb: aload 7
      // 0cd: lload 19
      // 0cf: invokespecial com/zelix/iq.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;J)V
      // 0d2: aastore
      // 0d3: iload 21
      // 0d5: lload 5
      // 0d7: lconst_0
      // 0d8: lcmp
      // 0d9: iflt 0e1
      // 0dc: ifeq 283
      // 0df: iload 21
      // 0e1: lload 5
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: iflt 1d6
      // 0e8: ifeq 1d4
      // 0eb: goto 0f9
      // 0ee: ldc2_w 1973196606779840362
      // 0f1: lload 5
      // 0f3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 0fd: iload 25
      // 0ff: aaload
      // 100: lload 9
      // 102: bipush 1
      // 103: anewarray 114
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w 2107205267099210178
      // 112: lload 5
      // 114: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: ifne 1d1
      // 11c: goto 12a
      // 11f: ldc2_w 1973196606779840362
      // 122: lload 5
      // 124: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: aload 0
      // 12b: bipush 0
      // 12c: ldc2_w 482992535319062677
      // 12f: lload 5
      // 131: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: aload 0
      // 137: aload 22
      // 139: ldc2_w 412152651831801759
      // 13c: lload 5
      // 13e: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: aload 8
      // 145: new java/lang/StringBuilder
      // 148: dup
      // 149: invokespecial java/lang/StringBuilder.<init> ()V
      // 14c: sipush 30869
      // 14f: ldc2_w 6204669184277412199
      // 152: lload 5
      // 154: lxor
      // 155: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15d: aload 0
      // 15e: lload 17
      // 160: invokevirtual com/zelix/bi.o (J)Ljava/lang/String;
      // 163: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 166: sipush 1533
      // 169: ldc2_w 5760309528179966985
      // 16c: lload 5
      // 16e: lxor
      // 16f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 177: aload 0
      // 178: bipush 0
      // 179: anewarray 114
      // 17c: ldc2_w 383691788776617959
      // 17f: lload 5
      // 181: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: sipush 4902
      // 18c: ldc2_w 633914335574921939
      // 18f: lload 5
      // 191: lxor
      // 192: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: aload 0
      // 19b: getfield com/zelix/bi.t [Lcom/zelix/iq;
      // 19e: iload 25
      // 1a0: aaload
      // 1a1: lload 13
      // 1a3: bipush 1
      // 1a4: anewarray 114
      // 1a7: dup_x2
      // 1a8: dup_x2
      // 1a9: pop
      // 1aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ad: bipush 0
      // 1ae: swap
      // 1af: aastore
      // 1b0: ldc2_w 402495358692872294
      // 1b3: lload 5
      // 1b5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c0: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1c3: goto 1d1
      // 1c6: ldc2_w 1973196606779840362
      // 1c9: lload 5
      // 1cb: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: iinc 25 1
      // 1d4: iload 21
      // 1d6: ifne 0b7
      // 1d9: lload 5
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: ifle 283
      // 1e0: iload 21
      // 1e2: lload 5
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: iflt 0d5
      // 1e9: ifne 277
      // 1ec: aload 0
      // 1ed: bipush 0
      // 1ee: ldc2_w 482992535319062677
      // 1f1: lload 5
      // 1f3: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: aload 0
      // 1f9: goto 207
      // 1fc: ldc2_w 1973196606779840362
      // 1ff: lload 5
      // 201: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 22
      // 209: ldc2_w 412152651831801759
      // 20c: lload 5
      // 20e: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: aload 8
      // 215: new java/lang/StringBuilder
      // 218: dup
      // 219: invokespecial java/lang/StringBuilder.<init> ()V
      // 21c: sipush 19495
      // 21f: ldc2_w 443661365721681360
      // 222: lload 5
      // 224: lxor
      // 225: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22d: aload 0
      // 22e: lload 17
      // 230: invokevirtual com/zelix/bi.o (J)Ljava/lang/String;
      // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 236: sipush 24051
      // 239: ldc2_w 8206870481815624704
      // 23c: lload 5
      // 23e: lxor
      // 23f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 247: aload 0
      // 248: bipush 0
      // 249: anewarray 114
      // 24c: ldc2_w 383691788776617959
      // 24f: lload 5
      // 251: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 259: sipush 543
      // 25c: ldc2_w 6629160756971865070
      // 25f: lload 5
      // 261: lxor
      // 262: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26a: aload 0
      // 26b: getfield com/zelix/bi.C I
      // 26e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 271: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 274: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 277: aload 23
      // 279: ldc2_w 109269181065965137
      // 27c: lload 5
      // 27e: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: goto 323
      // 286: astore 24
      // 288: aload 0
      // 289: bipush 0
      // 28a: ldc2_w 482992535319062677
      // 28d: lload 5
      // 28f: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: aload 0
      // 295: aload 22
      // 297: ldc2_w 412152651831801759
      // 29a: lload 5
      // 29c: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: aload 8
      // 2a3: new java/lang/StringBuilder
      // 2a6: dup
      // 2a7: invokespecial java/lang/StringBuilder.<init> ()V
      // 2aa: sipush 19495
      // 2ad: ldc2_w 443661365721681360
      // 2b0: lload 5
      // 2b2: lxor
      // 2b3: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bb: aload 0
      // 2bc: lload 17
      // 2be: invokevirtual com/zelix/bi.o (J)Ljava/lang/String;
      // 2c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c4: sipush 24051
      // 2c7: ldc2_w 8206870481815624704
      // 2ca: lload 5
      // 2cc: lxor
      // 2cd: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d5: aload 0
      // 2d6: bipush 0
      // 2d7: anewarray 114
      // 2da: ldc2_w 383691788776617959
      // 2dd: lload 5
      // 2df: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: sipush 130
      // 2ea: ldc2_w 7929778789622481268
      // 2ed: lload 5
      // 2ef: lxor
      // 2f0: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/bi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f8: aload 24
      // 2fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2fd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 300: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 303: aload 23
      // 305: ldc2_w 109269181065965137
      // 308: lload 5
      // 30a: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: goto 323
      // 312: astore 26
      // 314: aload 23
      // 316: ldc2_w 109269181065965137
      // 319: lload 5
      // 31b: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: aload 26
      // 322: athrow
      // 323: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   int x(long var1) {
      byte var3 = x44.a<"w">(1283234628292256164L, var1);

      label76: {
         try {
            byte var10000 = x44.a<"k">(this, 1371513101512654126L, var1);
            if (var3 == 0) {
               return var10000;
            }

            if (var10000 != 0) {
               break label76;
            }
         } catch (gj var9) {
            throw x44.a<"w">(var9, 1069968973727089361L, var1);
         }

         return x44.a<"k">(this, 1153830147368182308L, var1).length;
      }

      int var4 = 1;
      int var5 = this.t.length;
      int var6 = 0;

      label47:
      while (var6 < var5) {
         var4 += x44.a<"o">(this.t[var6], new Object[0], 1105598556338731767L, var1);

         try {
            var6++;
         } catch (gj var8) {
            boolean var10001 = false;
            throw x44.a<"w">(var8, 1069968973727089361L, var1);
         }

         do {
            try {
               if (var1 < 0L) {
                  return var3;
               }

               if (var3 == 0) {
                  return this.C;
               }

               if (var3 != 0) {
                  continue label47;
               }
            } catch (gj var7) {
               boolean var12 = false;
               throw x44.a<"w">(var7, 1069968973727089361L, var1);
            }
         } while (var1 <= 0L);
         break;
      }

      this.C = var4;
      return this.C;
   }

   static {
      long var5 = a ^ 22185876970335L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[7];
      int var12 = 0;
      String var11 = "Ê6\u0012Æ\u0019Ý,mfõ\u0093\u008a±\u00ad\f¥(\u0095\u0088=.9ïñB#|)<B=ñì\u008dj'Dwä±â\u0096Ì\u008fñÑÑgÎï»þìá½ûæ\u0010ÌÅä\u0089\u0087\u001cð¥à):q\u001e8\u0011\u001a\u0010q&\u00ad\u0014{\"}`\u00adÈù§zþ±b\u0010\u000fÚèF´Õù?Ø\u009f¨5#\u008dË\u0096";
      int var13 = "Ê6\u0012Æ\u0019Ý,mfõ\u0093\u008a±\u00ad\f¥(\u0095\u0088=.9ïñB#|)<B=ñì\u008dj'Dwä±â\u0096Ì\u008fñÑÑgÎï»þìá½ûæ\u0010ÌÅä\u0089\u0087\u001cð¥à):q\u001e8\u0011\u001a\u0010q&\u00ad\u0014{\"}`\u00adÈù§zþ±b\u0010\u000fÚèF´Õù?Ø\u009f¨5#\u008dË\u0096"
         .length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = c(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     d = var14;
                     e = new String[7];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -2615047951540989846L;
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

                  var11 = "½²\u001c\u0099/\u0088Ò¹Ù\u0012\u009e ÅU\u0082\u009e z\u0086H¿ã6N1²\røãU\u001e¸7$G#H/U\u0006U%Cc'¼Üã\u008e";
                  var13 = "½²\u001c\u0099/\u0088Ò¹Ù\u0012\u009e ÅU\u0082\u009e z\u0086H¿ã6N1²\røãU\u001e¸7$G#H/U\u0006U%Cc'¼Üã\u008e".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2336;
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
            throw new RuntimeException("com/zelix/bi", var10);
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
         e[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/bi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
