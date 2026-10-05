package com.zelix;

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

public class hg extends hn {
   private ie[] s;
   private ie[] i;
   private static final long a = ess.a(-5812748620147722536L, 1670569243439508217L, MethodHandles.lookup().lookupClass()).a(162073850013783L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"m">(3550, 3344921654316358656L ^ var2);
   }

   final void N(long param1, _8l param3) {
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
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w -5003033307729260843
      // 0c: lload 1
      // 0d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: aload 0
      // 13: ldc2_w -6814102496887175937
      // 16: lload 1
      // 17: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: arraylength
      // 1d: istore 7
      // 1f: istore 6
      // 21: bipush 0
      // 22: istore 8
      // 24: iload 8
      // 26: iload 7
      // 28: if_icmpge 64
      // 2b: aload 0
      // 2c: ldc2_w -6814102496887175937
      // 2f: lload 1
      // 30: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: iload 8
      // 37: aaload
      // 38: lload 4
      // 3a: aload 3
      // 3b: invokevirtual com/zelix/ie.N (JLcom/zelix/_8l;)V
      // 3e: iinc 8 1
      // 41: iload 6
      // 43: lload 1
      // 44: lconst_0
      // 45: lcmp
      // 46: ifle 72
      // 49: ifne 71
      // 4c: iload 6
      // 4e: ifeq 24
      // 51: lload 1
      // 52: lconst_0
      // 53: lcmp
      // 54: ifle 41
      // 57: goto 64
      // 5a: ldc2_w -6907385145306368574
      // 5d: lload 1
      // 5e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: aload 0
      // 65: ldc2_w -6613417624703340227
      // 68: lload 1
      // 69: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: arraylength
      // 6f: istore 8
      // 71: bipush 0
      // 72: istore 9
      // 74: iload 9
      // 76: iload 8
      // 78: if_icmpge 96
      // 7b: aload 0
      // 7c: ldc2_w -6613417624703340227
      // 7f: lload 1
      // 80: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: iload 9
      // 87: aaload
      // 88: lload 4
      // 8a: aload 3
      // 8b: invokevirtual com/zelix/ie.N (JLcom/zelix/_8l;)V
      // 8e: iinc 9 1
      // 91: iload 6
      // 93: ifeq 74
      // 96: lload 1
      // 97: lconst_0
      // 98: lcmp
      // 99: ifle 91
      // 9c: return
   }

   protected void P(Object[] param1) {
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
      // 014: getstatic com/zelix/hg.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 36191031661924
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 53130286874664
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 86809519959377
      // 02d: lxor
      // 02e: lstore 9
      // 030: pop2
      // 031: ldc2_w 5527808046309932252
      // 034: lload 2
      // 035: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: aload 0
      // 03b: getfield com/zelix/hg.P Z
      // 03e: lload 7
      // 040: dup2_x1
      // 041: pop2
      // 042: bipush 1
      // 043: anewarray 9
      // 046: dup
      // 047: bipush 0
      // 048: new java/lang/StringBuilder
      // 04b: dup
      // 04c: invokespecial java/lang/StringBuilder.<init> ()V
      // 04f: sipush 14367
      // 052: ldc2_w 893647584517596367
      // 055: lload 2
      // 056: lxor
      // 057: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/hg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: aload 0
      // 060: lload 5
      // 062: bipush 1
      // 063: anewarray 322
      // 066: dup_x2
      // 067: dup_x2
      // 068: pop
      // 069: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06c: bipush 0
      // 06d: swap
      // 06e: aastore
      // 06f: ldc2_w 5859517401537316855
      // 072: lload 2
      // 073: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07e: aastore
      // 07f: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 082: istore 11
      // 084: iload 11
      // 086: ifeq 0b6
      // 089: aload 0
      // 08a: getfield com/zelix/hg.W Lcom/zelix/_op;
      // 08d: ifnull 0c1
      // 090: goto 09d
      // 093: ldc2_w 5437104983715995282
      // 096: lload 2
      // 097: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 4
      // 09f: aload 0
      // 0a0: getfield com/zelix/hg.W Lcom/zelix/_op;
      // 0a3: invokevirtual com/zelix/_op.W ()I
      // 0a6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0a9: goto 0b6
      // 0ac: ldc2_w 5437104983715995282
      // 0af: lload 2
      // 0b0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: iload 11
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: iflt 0e2
      // 0be: ifne 0d7
      // 0c1: aload 4
      // 0c3: aload 0
      // 0c4: getfield com/zelix/hg.c I
      // 0c7: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0ca: goto 0d7
      // 0cd: ldc2_w 5437104983715995282
      // 0d0: lload 2
      // 0d1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: ldc2_w 5349997098108579759
      // 0db: lload 2
      // 0dc: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: arraylength
      // 0e2: istore 12
      // 0e4: aload 4
      // 0e6: iload 12
      // 0e8: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0eb: bipush 0
      // 0ec: istore 13
      // 0ee: iload 13
      // 0f0: iload 12
      // 0f2: if_icmpge 147
      // 0f5: aload 0
      // 0f6: ldc2_w 5349997098108579759
      // 0f9: lload 2
      // 0fa: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: iload 13
      // 101: aaload
      // 102: aload 4
      // 104: lload 9
      // 106: bipush 2
      // 107: anewarray 322
      // 10a: dup_x2
      // 10b: dup_x2
      // 10c: pop
      // 10d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 110: bipush 1
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w 5346857657824707714
      // 11b: lload 2
      // 11c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: iinc 13 1
      // 124: iload 11
      // 126: lload 2
      // 127: lconst_0
      // 128: lcmp
      // 129: ifle 15c
      // 12c: ifeq 15b
      // 12f: iload 11
      // 131: ifne 0ee
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 124
      // 13a: goto 147
      // 13d: ldc2_w 5437104983715995282
      // 140: lload 2
      // 141: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: aload 0
      // 148: ldc2_w 5721850092540795501
      // 14b: lload 2
      // 14c: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: arraylength
      // 152: istore 13
      // 154: aload 4
      // 156: iload 13
      // 158: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 15b: bipush 0
      // 15c: istore 14
      // 15e: iload 14
      // 160: iload 13
      // 162: if_icmpge 199
      // 165: aload 0
      // 166: ldc2_w 5721850092540795501
      // 169: lload 2
      // 16a: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: iload 14
      // 171: aaload
      // 172: aload 4
      // 174: lload 9
      // 176: bipush 2
      // 177: anewarray 322
      // 17a: dup_x2
      // 17b: dup_x2
      // 17c: pop
      // 17d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 180: bipush 1
      // 181: swap
      // 182: aastore
      // 183: dup_x1
      // 184: swap
      // 185: bipush 0
      // 186: swap
      // 187: aastore
      // 188: ldc2_w 5346857657824707714
      // 18b: lload 2
      // 18c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: iinc 14 1
      // 194: iload 11
      // 196: ifne 15e
      // 199: lload 2
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: ifle 194
      // 19f: return
   }

   public hg(h7 var1, _op var2, _kz var3, _8c var4, Set var5, long var6, List var8, boolean var9, Map var10, Map var11) {
      int var14;
      int var15;
      int var16;
      n[] var18;
      label16: {
         var6 = a ^ var6;
         long var12 = var6 ^ 99766024594081L;
         long var10001 = var6 ^ 9494330421585L;
         var14 = (int)((var6 ^ 9494330421585L) >>> 48);
         var15 = (int)((var6 ^ 9494330421585L) << 16 >>> 32);
         var16 = (int)(var10001 << 48 >>> 48);
         boolean var10000 = x44.a<"r">(8272159806419977864L, var6);
         super(var1);
         boolean var17 = var10000;
         this.W = var2;
         if (var9) {
            var18 = x44.a<"j">(var3, new Object[]{var12}, 8597029881291141221L, var6);
            if (var6 <= 0L) {
               return;
            }

            if (!var17) {
               break label16;
            }
         }

         var18 = var3.r();
      }

      x44.a<"q">(this, ie.f(var1, var18, var4, var5, var8, true, (short)var14, var10, var15, var16, var11), 7580204493070191778L, var6);
      x44.a<"q">(this, ie.f(var1, var3.m(), var4, var5, var8, false, (short)var14, var10, var15, var16, var11), 7810738769804081504L, var6);
      this.P = true;
   }

   hg(long param1, h8 param3, _xx param4, _y4 param5, _y4 param6, PrintWriter param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hg.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 69852020319121
      // 00b: lxor
      // 00c: lstore 8
      // 00e: dup2
      // 00f: ldc2_w 108502867898109
      // 012: lxor
      // 013: lstore 10
      // 015: dup2
      // 016: ldc2_w 93590494583001
      // 019: lxor
      // 01a: lstore 12
      // 01c: dup2
      // 01d: ldc2_w 38295619944469
      // 020: lxor
      // 021: lstore 14
      // 023: dup2
      // 024: ldc2_w 34743641437663
      // 027: lxor
      // 028: dup2
      // 029: bipush 32
      // 02b: lushr
      // 02c: l2i
      // 02d: istore 16
      // 02f: dup2
      // 030: bipush 32
      // 032: lshl
      // 033: bipush 48
      // 035: lushr
      // 036: l2i
      // 037: istore 17
      // 039: dup2
      // 03a: bipush 48
      // 03c: lshl
      // 03d: bipush 48
      // 03f: lushr
      // 040: l2i
      // 041: istore 18
      // 043: pop2
      // 044: pop2
      // 045: aload 0
      // 046: aload 3
      // 047: invokespecial com/zelix/hn.<init> (Lcom/zelix/h8;)V
      // 04a: ldc2_w -7911742583079000457
      // 04d: lload 1
      // 04e: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: lload 14
      // 055: bipush 1
      // 056: anewarray 322
      // 059: dup_x2
      // 05a: dup_x2
      // 05b: pop
      // 05c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: ldc2_w -8220885381628138618
      // 065: lload 1
      // 066: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: astore 20
      // 06d: istore 19
      // 06f: lload 14
      // 071: bipush 1
      // 072: anewarray 322
      // 075: dup_x2
      // 076: dup_x2
      // 077: pop
      // 078: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: ldc2_w -8220885381628138618
      // 081: lload 1
      // 082: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: astore 21
      // 089: iload 16
      // 08b: iload 17
      // 08d: i2s
      // 08e: iload 18
      // 090: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 093: astore 22
      // 095: aload 0
      // 096: aload 4
      // 098: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 09b: putfield com/zelix/hg.c I
      // 09e: aload 5
      // 0a0: aload 22
      // 0a2: aload 0
      // 0a3: getfield com/zelix/hg.c I
      // 0a6: lload 8
      // 0a8: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 0ab: aload 0
      // 0ac: lload 12
      // 0ae: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0b1: aload 4
      // 0b3: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0b6: istore 23
      // 0b8: aload 0
      // 0b9: iload 23
      // 0bb: anewarray 231
      // 0be: ldc2_w -8517135519344808867
      // 0c1: lload 1
      // 0c2: invokedynamic v (Ljava/lang/Object;[Lcom/zelix/ie;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: bipush 0
      // 0c8: istore 24
      // 0ca: iload 24
      // 0cc: iload 23
      // 0ce: if_icmpge 195
      // 0d1: aload 0
      // 0d2: ldc2_w -8517135519344808867
      // 0d5: lload 1
      // 0d6: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: iload 24
      // 0dd: aload 3
      // 0de: checkcast com/zelix/h9
      // 0e1: aload 4
      // 0e3: aload 5
      // 0e5: aload 6
      // 0e7: aload 7
      // 0e9: aload 20
      // 0eb: aload 21
      // 0ed: aload 22
      // 0ef: lload 10
      // 0f1: bipush 9
      // 0f3: anewarray 322
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 8
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: bipush 7
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: bipush 6
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 5
      // 10f: swap
      // 110: aastore
      // 111: dup_x1
      // 112: swap
      // 113: bipush 4
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: bipush 3
      // 119: swap
      // 11a: aastore
      // 11b: dup_x1
      // 11c: swap
      // 11d: bipush 2
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 1
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 0
      // 128: swap
      // 129: aastore
      // 12a: ldc2_w -8508529232924366690
      // 12d: lload 1
      // 12e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: aastore
      // 134: iload 19
      // 136: lload 1
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 192
      // 13c: ifne 190
      // 13f: aload 0
      // 140: ldc2_w -8517135519344808867
      // 143: lload 1
      // 144: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: iload 24
      // 14b: aaload
      // 14c: bipush 0
      // 14d: anewarray 322
      // 150: ldc2_w -8614246675021456608
      // 153: lload 1
      // 154: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: iload 19
      // 15b: ifne 1b2
      // 15e: goto 16b
      // 161: ldc2_w -8609063405953540768
      // 164: lload 1
      // 165: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: ifne 18d
      // 16e: goto 17b
      // 171: ldc2_w -8609063405953540768
      // 174: lload 1
      // 175: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: aload 0
      // 17c: bipush 0
      // 17d: putfield com/zelix/hg.P Z
      // 180: goto 18d
      // 183: ldc2_w -8609063405953540768
      // 186: lload 1
      // 187: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: iinc 24 1
      // 190: iload 19
      // 192: ifeq 0ca
      // 195: aload 4
      // 197: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 19a: istore 24
      // 19c: aload 0
      // 19d: iload 24
      // 19f: anewarray 231
      // 1a2: ldc2_w -8315311724637398625
      // 1a5: lload 1
      // 1a6: invokedynamic v (Ljava/lang/Object;[Lcom/zelix/ie;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: lload 1
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: ifle 134
      // 1b1: bipush 0
      // 1b2: istore 25
      // 1b4: iload 25
      // 1b6: iload 24
      // 1b8: if_icmpge 26d
      // 1bb: aload 0
      // 1bc: ldc2_w -8315311724637398625
      // 1bf: lload 1
      // 1c0: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: iload 25
      // 1c7: aload 3
      // 1c8: checkcast com/zelix/h9
      // 1cb: aload 4
      // 1cd: aload 5
      // 1cf: aload 6
      // 1d1: aload 7
      // 1d3: aload 20
      // 1d5: aload 21
      // 1d7: aload 22
      // 1d9: lload 10
      // 1db: bipush 9
      // 1dd: anewarray 322
      // 1e0: dup_x2
      // 1e1: dup_x2
      // 1e2: pop
      // 1e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e6: bipush 8
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 7
      // 1ee: swap
      // 1ef: aastore
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: bipush 6
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 5
      // 1f9: swap
      // 1fa: aastore
      // 1fb: dup_x1
      // 1fc: swap
      // 1fd: bipush 4
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: bipush 3
      // 203: swap
      // 204: aastore
      // 205: dup_x1
      // 206: swap
      // 207: bipush 2
      // 208: swap
      // 209: aastore
      // 20a: dup_x1
      // 20b: swap
      // 20c: bipush 1
      // 20d: swap
      // 20e: aastore
      // 20f: dup_x1
      // 210: swap
      // 211: bipush 0
      // 212: swap
      // 213: aastore
      // 214: ldc2_w -8508529232924366690
      // 217: lload 1
      // 218: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: aastore
      // 21e: iload 19
      // 220: lload 1
      // 221: lconst_0
      // 222: lcmp
      // 223: ifle 26a
      // 226: ifne 268
      // 229: aload 0
      // 22a: ldc2_w -8315311724637398625
      // 22d: lload 1
      // 22e: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: iload 25
      // 235: aaload
      // 236: bipush 0
      // 237: anewarray 322
      // 23a: ldc2_w -8614246675021456608
      // 23d: lload 1
      // 23e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: ifne 265
      // 246: goto 253
      // 249: ldc2_w -8609063405953540768
      // 24c: lload 1
      // 24d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 0
      // 254: bipush 0
      // 255: putfield com/zelix/hg.P Z
      // 258: goto 265
      // 25b: ldc2_w -8609063405953540768
      // 25e: lload 1
      // 25f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: iinc 25 1
      // 268: iload 19
      // 26a: ifeq 1b4
      // 26d: lload 1
      // 26e: lconst_0
      // 26f: lcmp
      // 270: ifle 21e
      // 273: return
   }

   public int z(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 116660075572968
      // 05: lxor
      // 06: dup2
      // 07: bipush 32
      // 09: lushr
      // 0a: l2i
      // 0b: istore 3
      // 0c: dup2
      // 0d: bipush 32
      // 0f: lshl
      // 10: bipush 48
      // 12: lushr
      // 13: l2i
      // 14: istore 4
      // 16: dup2
      // 17: bipush 48
      // 19: lshl
      // 1a: bipush 48
      // 1c: lushr
      // 1d: l2i
      // 1e: istore 5
      // 20: pop2
      // 21: pop2
      // 22: ldc2_w -2297535580721589159
      // 25: lload 1
      // 26: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: getstatic com/zelix/hg.f J
      // 2e: l2i
      // 2f: istore 7
      // 31: bipush 0
      // 32: istore 8
      // 34: istore 6
      // 36: iload 8
      // 38: aload 0
      // 39: ldc2_w -296298760367153549
      // 3c: lload 1
      // 3d: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: arraylength
      // 43: if_icmpge 88
      // 46: iload 7
      // 48: aload 0
      // 49: ldc2_w -296298760367153549
      // 4c: lload 1
      // 4d: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: iload 8
      // 54: aaload
      // 55: iload 3
      // 56: iload 4
      // 58: i2s
      // 59: iload 5
      // 5b: i2c
      // 5c: invokevirtual com/zelix/ie.E (ISC)I
      // 5f: iadd
      // 60: istore 7
      // 62: iinc 8 1
      // 65: iload 6
      // 67: lload 1
      // 68: lconst_0
      // 69: lcmp
      // 6a: iflt 8d
      // 6d: ifne 8b
      // 70: iload 6
      // 72: ifeq 36
      // 75: lload 1
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle 65
      // 7b: goto 88
      // 7e: ldc2_w -385007225130094770
      // 81: lload 1
      // 82: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: bipush 0
      // 89: istore 8
      // 8b: iload 8
      // 8d: aload 0
      // 8e: ldc2_w -93362225776776271
      // 91: lload 1
      // 92: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: arraylength
      // 98: lload 1
      // 99: lconst_0
      // 9a: lcmp
      // 9b: ifle bd
      // 9e: if_icmpge d7
      // a1: iload 7
      // a3: aload 0
      // a4: ldc2_w -93362225776776271
      // a7: lload 1
      // a8: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: iload 8
      // af: aaload
      // b0: iload 3
      // b1: iload 4
      // b3: i2s
      // b4: iload 5
      // b6: i2c
      // b7: invokevirtual com/zelix/ie.E (ISC)I
      // ba: iadd
      // bb: iload 6
      // bd: ifne df
      // c0: goto cd
      // c3: ldc2_w -385007225130094770
      // c6: lload 1
      // c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: athrow
      // cd: istore 7
      // cf: iinc 8 1
      // d2: iload 6
      // d4: ifeq 8b
      // d7: lload 1
      // d8: lconst_0
      // d9: lcmp
      // da: iflt 8b
      // dd: iload 7
      // df: ireturn
   }

   protected void q(Object[] param1) {
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
      // 01b: pop
      // 01c: getstatic com/zelix/hg.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 21687767690323
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 3305678190879
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 119097916271427
      // 035: lxor
      // 036: dup2
      // 037: bipush 32
      // 039: lushr
      // 03a: l2i
      // 03b: istore 10
      // 03d: dup2
      // 03e: bipush 32
      // 040: lshl
      // 041: bipush 48
      // 043: lushr
      // 044: l2i
      // 045: istore 11
      // 047: dup2
      // 048: bipush 48
      // 04a: lshl
      // 04b: bipush 48
      // 04d: lushr
      // 04e: l2i
      // 04f: istore 12
      // 051: pop2
      // 052: pop2
      // 053: ldc2_w 2951800623318572210
      // 056: lload 2
      // 057: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 0
      // 05d: getfield com/zelix/hg.P Z
      // 060: lload 8
      // 062: dup2_x1
      // 063: pop2
      // 064: bipush 1
      // 065: anewarray 9
      // 068: dup
      // 069: bipush 0
      // 06a: new java/lang/StringBuilder
      // 06d: dup
      // 06e: invokespecial java/lang/StringBuilder.<init> ()V
      // 071: sipush 19802
      // 074: ldc2_w 2032977013776263356
      // 077: lload 2
      // 078: lxor
      // 079: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/hg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 081: aload 0
      // 082: lload 6
      // 084: bipush 1
      // 085: anewarray 322
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 0
      // 08f: swap
      // 090: aastore
      // 091: ldc2_w 2911017902477704896
      // 094: lload 2
      // 095: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a0: aastore
      // 0a1: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 0a4: istore 13
      // 0a6: iload 13
      // 0a8: ifne 0d8
      // 0ab: aload 0
      // 0ac: getfield com/zelix/hg.W Lcom/zelix/_op;
      // 0af: ifnull 0e3
      // 0b2: goto 0bf
      // 0b5: ldc2_w 3621819335326279589
      // 0b8: lload 2
      // 0b9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: aload 5
      // 0c1: aload 0
      // 0c2: getfield com/zelix/hg.W Lcom/zelix/_op;
      // 0c5: invokevirtual com/zelix/_op.W ()I
      // 0c8: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0cb: goto 0d8
      // 0ce: ldc2_w 3621819335326279589
      // 0d1: lload 2
      // 0d2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: iload 13
      // 0da: lload 2
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: ifle 104
      // 0e0: ifeq 0f9
      // 0e3: aload 5
      // 0e5: aload 0
      // 0e6: getfield com/zelix/hg.c I
      // 0e9: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0ec: goto 0f9
      // 0ef: ldc2_w 3621819335326279589
      // 0f2: lload 2
      // 0f3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: ldc2_w 3677243315751196312
      // 0fd: lload 2
      // 0fe: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: arraylength
      // 104: istore 14
      // 106: aload 5
      // 108: iload 14
      // 10a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 10d: bipush 0
      // 10e: istore 15
      // 110: iload 15
      // 112: iload 14
      // 114: if_icmpge 158
      // 117: aload 0
      // 118: ldc2_w 3677243315751196312
      // 11b: lload 2
      // 11c: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: iload 15
      // 123: aaload
      // 124: aload 5
      // 126: iload 10
      // 128: iload 11
      // 12a: i2c
      // 12b: iload 12
      // 12d: aload 4
      // 12f: invokevirtual com/zelix/ie.b (Ljava/io/DataOutputStream;ICILjava/util/Map;)V
      // 132: iinc 15 1
      // 135: iload 13
      // 137: lload 2
      // 138: lconst_0
      // 139: lcmp
      // 13a: iflt 16d
      // 13d: ifne 16c
      // 140: iload 13
      // 142: ifeq 110
      // 145: lload 2
      // 146: lconst_0
      // 147: lcmp
      // 148: iflt 135
      // 14b: goto 158
      // 14e: ldc2_w 3621819335326279589
      // 151: lload 2
      // 152: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: aload 0
      // 159: ldc2_w 3917897497515156314
      // 15c: lload 2
      // 15d: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: arraylength
      // 163: istore 15
      // 165: aload 5
      // 167: iload 15
      // 169: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 16c: bipush 0
      // 16d: istore 16
      // 16f: iload 16
      // 171: iload 15
      // 173: if_icmpge 199
      // 176: aload 0
      // 177: ldc2_w 3917897497515156314
      // 17a: lload 2
      // 17b: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: iload 16
      // 182: aaload
      // 183: aload 5
      // 185: iload 10
      // 187: iload 11
      // 189: i2c
      // 18a: iload 12
      // 18c: aload 4
      // 18e: invokevirtual com/zelix/ie.b (Ljava/io/DataOutputStream;ICILjava/util/Map;)V
      // 191: iinc 16 1
      // 194: iload 13
      // 196: ifeq 16f
      // 199: lload 2
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 194
      // 19f: return
   }

   static {
      long var5 = a ^ 102118167900725L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[3];
      int var12 = 0;
      String var11 = "g(8\u0013¸¯\u0007\u0082 \u007fí\u00ad!lÞ:D\u0082êõcó\u0097\u0093\u0019\u0097ïJkkabjP3ËÈîâÀlUå¬ù87ùLBz\u000f+\u009bTG0j\u0016É¿:ÍL\u0015O\t/·\b\u000b~{è'½Û\u0093V~:\u001djÙ£<(£\u007fWÍhé@æh\u0091+\r\u0096\u0092ê:\u009a¸\u0018-V¡w¯ñëz3ônnc\u000b×ãáÜýÝ\f\n:\u0088";
      int var13 = "g(8\u0013¸¯\u0007\u0082 \u007fí\u00ad!lÞ:D\u0082êõcó\u0097\u0093\u0019\u0097ïJkkabjP3ËÈîâÀlUå¬ù87ùLBz\u000f+\u009bTG0j\u0016É¿:ÍL\u0015O\t/·\b\u000b~{è'½Û\u0093V~:\u001djÙ£<(£\u007fWÍhé@æh\u0091+\r\u0096\u0092ê:\u009a¸\u0018-V¡w¯ñëz3ônnc\u000b×ãáÜýÝ\f\n:\u0088"
         .length();
      char var10 = '8';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            d = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -5536805001334045899L;
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
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            f = var23;
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23749;
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
            throw new RuntimeException("com/zelix/hg", var10);
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
         throw new RuntimeException("com/zelix/hg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
