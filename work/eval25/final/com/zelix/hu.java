package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hu extends hz {
   iy[] U;
   _8b w;
   in[] d;
   private static final long e = ess.a(24477176159512768L, -550636376492373670L, MethodHandles.lookup().lookupClass()).a(228576339124736L);
   private static final String[] g;
   private static final String[] h;
   private static final Map o = new HashMap(13);

   public in[] f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = e ^ var2;
      return x44.a<"m">(this, -4707943556859849312L, var2);
   }

   public in I(Object[] var1) {
      long var3 = (Long)var1[0];
      _fz var2 = (_fz)var1[1];
      var3 = e ^ var3;
      long var5 = (var3 ^ 7594665480982L) >>> 32;
      int var7 = (int)((var3 ^ 7594665480982L) << 32 >>> 32);
      long var10001 = var3 ^ 125059597005258L;
      int var8 = (int)((var3 ^ 125059597005258L) >>> 32);
      int var9 = (int)((var3 ^ 125059597005258L) << 32 >>> 40);
      int var10 = (int)(var10001 << 56 >>> 56);
      long var11 = var3 ^ 4726926076552L;
      var10001 = var3 ^ 48528671105748L;
      int var13 = (int)((var3 ^ 48528671105748L) >>> 48);
      int var14 = (int)((var3 ^ 48528671105748L) << 16 >>> 32);
      int var15 = (int)(var10001 << 48 >>> 48);
      long var16 = var3 ^ 60964412601491L;
      long var18 = var3 ^ 12469405649030L;
      long var20 = var3 ^ 121065327990264L;
      boolean var10000 = x44.a<"w">(-5456484062882462676L, var3);
      in var23 = (in)this.s(var16, var2);
      boolean var22 = var10000;

      label30: {
         try {
            if (!var22) {
               return var23;
            }

            if (var23 == null) {
               break label30;
            }
         } catch (gj var31) {
            throw x44.a<"w">(var31, -6273951007427403125L, var3);
         }

         return var23;
      }

      ArrayList var24 = new ArrayList();
      _8b var25 = (_8b)x44.a<"o">(this, var11, -5441575237859468495L, var3);
      mx var26 = var25.Y(var2.v(), var24);
      mx var27 = var25.Y(x44.a<"o">(var2, new Object[0], -5379972925278631947L, var3), var24);
      mx var28 = var25.Y(b<"g">(12284, 3211675306855676789L ^ var3), var24);
      x7[] var29 = new x7[]{var25.a(var8, var9, b<"g">(23835, 1421058772527991184L ^ var3), var24, (byte)var10)};
      h4[] var30 = new h4[]{new hb(var18, var28, var29)};
      var23 = new in(this, var26, var27, var30, true, var5, 3, var7);
      x44.a<"o">(var25, new Object[]{var24, var20}, -6265735109638438727L, var3);
      char var10002 = (char)var13;
      Object[] var10006 = new Object[]{null, null, null, Integer.valueOf((char)var15)};
      var10006[2] = var14;
      var10006[1] = Integer.valueOf(var10002);
      var10006[0] = var23;
      x44.a<"i">(this, var10006, -5375741831252570551L, var3);
      return var23;
   }

   public final boolean b() {
      return false;
   }

   public void S(Object[] var1) {
      HashMap var2 = (HashMap)var1[0];
      long var4 = (Long)var1[1];
      _zk var3 = (_zk)var1[2];
      var4 = e ^ var4;
      long var6 = var4 ^ 104107631595675L;
      long var8 = var4 ^ 70765442676917L;
      long var10 = var4 ^ 10970039972400L;
      boolean var10000 = x44.a<"r">(7375986092744004120L, var4);
      x44.a<"j">(x44.a<"n">(this, 8770856190646210088L, var4), new Object[]{var8, var2, var3}, 9094846490495828996L, var4);
      in[] var13 = x44.a<"j">(this, new Object[]{var6}, 8912809365005056844L, var4);
      boolean var12 = var10000;

      for (in var17 : var13) {
         x44.a<"j">(var17, new Object[]{var10, var2}, 9064087262203057257L, var4);
         if (var12) {
            break;
         }
      }
   }

   public void l(Object[] param1) {
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
      // 04: checkcast com/zelix/_8z
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
      // 16: checkcast com/zelix/vx
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/hu.e J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 27741389249213
      // 29: lxor
      // 2a: lstore 6
      // 2c: dup2
      // 2d: ldc2_w 4493525870688
      // 30: lxor
      // 31: lstore 8
      // 33: pop2
      // 34: ldc2_w 4959005345571763387
      // 37: lload 4
      // 39: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: aload 2
      // 3f: aload 0
      // 40: lload 6
      // 42: invokevirtual com/zelix/hu.k (J)Ljava/lang/String;
      // 45: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 48: astore 11
      // 4a: bipush 0
      // 4b: istore 12
      // 4d: istore 10
      // 4f: iload 12
      // 51: aload 0
      // 52: getfield com/zelix/hu.R I
      // 55: if_icmpge 94
      // 58: aload 0
      // 59: ldc2_w 6425250545480790561
      // 5c: lload 4
      // 5e: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: iload 12
      // 65: aaload
      // 66: lload 8
      // 68: aload 11
      // 6a: aload 3
      // 6b: bipush 3
      // 6c: anewarray 245
      // 6f: dup_x1
      // 70: swap
      // 71: bipush 2
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: bipush 1
      // 77: swap
      // 78: aastore
      // 79: dup_x2
      // 7a: dup_x2
      // 7b: pop
      // 7c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7f: bipush 0
      // 80: swap
      // 81: aastore
      // 82: ldc2_w 6679693565973225216
      // 85: lload 4
      // 87: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: iinc 12 1
      // 8f: iload 10
      // 91: ifne 4f
      // 94: lload 4
      // 96: lconst_0
      // 97: lcmp
      // 98: iflt 8f
      // 9b: return
   }

   public void Z(Object[] param1) {
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
      // 00e: checkcast com/zelix/_ur
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_yv
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 44916713158833
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 45516185629098
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 47274114953780
      // 02e: lxor
      // 02f: lstore 10
      // 031: dup2
      // 032: ldc2_w 54157878383530
      // 035: lxor
      // 036: lstore 12
      // 038: dup2
      // 039: ldc2_w 69626334299042
      // 03c: lxor
      // 03d: lstore 14
      // 03f: pop2
      // 040: aload 0
      // 041: ldc2_w -525427320691208411
      // 044: lload 3
      // 045: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: aload 5
      // 04c: aload 2
      // 04d: lload 12
      // 04f: bipush 3
      // 050: anewarray 245
      // 053: dup_x2
      // 054: dup_x2
      // 055: pop
      // 056: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059: bipush 2
      // 05a: swap
      // 05b: aastore
      // 05c: dup_x1
      // 05d: swap
      // 05e: bipush 1
      // 05f: swap
      // 060: aastore
      // 061: dup_x1
      // 062: swap
      // 063: bipush 0
      // 064: swap
      // 065: aastore
      // 066: ldc2_w -1730975230519723671
      // 069: lload 3
      // 06a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: ldc2_w -1778396443165273323
      // 072: lload 3
      // 073: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: bipush 0
      // 079: istore 17
      // 07b: istore 16
      // 07d: iload 17
      // 07f: aload 0
      // 080: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 083: arraylength
      // 084: if_icmpge 1d9
      // 087: aload 0
      // 088: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 08b: iload 17
      // 08d: aaload
      // 08e: instanceof com/zelix/_yl
      // 091: iload 16
      // 093: lload 3
      // 094: lconst_0
      // 095: lcmp
      // 096: iflt 09e
      // 099: ifne 1e0
      // 09c: iload 16
      // 09e: lload 3
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: ifle 123
      // 0a4: ifne 11b
      // 0a7: goto 0b4
      // 0aa: ldc2_w -1833405103133184789
      // 0ad: lload 3
      // 0ae: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: lload 3
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: ifle 10e
      // 0ba: ifeq 104
      // 0bd: goto 0ca
      // 0c0: ldc2_w -1833405103133184789
      // 0c3: lload 3
      // 0c4: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 0ce: iload 17
      // 0d0: aaload
      // 0d1: checkcast com/zelix/_yl
      // 0d4: lload 10
      // 0d6: bipush 1
      // 0d7: anewarray 245
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 0
      // 0e1: swap
      // 0e2: aastore
      // 0e3: ldc2_w -1802367556345286937
      // 0e6: lload 3
      // 0e7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: iload 16
      // 0ee: lload 3
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: iflt 1d6
      // 0f4: ifeq 1d1
      // 0f7: goto 104
      // 0fa: ldc2_w -1833405103133184789
      // 0fd: lload 3
      // 0fe: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 0
      // 105: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 108: iload 17
      // 10a: aaload
      // 10b: instanceof com/zelix/b7
      // 10e: goto 11b
      // 111: ldc2_w -1833405103133184789
      // 114: lload 3
      // 115: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: lload 3
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 199
      // 121: iload 16
      // 123: ifne 199
      // 126: ifeq 170
      // 129: goto 136
      // 12c: ldc2_w -1833405103133184789
      // 12f: lload 3
      // 130: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 0
      // 137: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 13a: iload 17
      // 13c: aaload
      // 13d: checkcast com/zelix/b7
      // 140: lload 8
      // 142: bipush 1
      // 143: anewarray 245
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 0
      // 14d: swap
      // 14e: aastore
      // 14f: ldc2_w -1928399793729628508
      // 152: lload 3
      // 153: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: iload 16
      // 15a: lload 3
      // 15b: lconst_0
      // 15c: lcmp
      // 15d: iflt 1d6
      // 160: ifeq 1d1
      // 163: goto 170
      // 166: ldc2_w -1833405103133184789
      // 169: lload 3
      // 16a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: aload 0
      // 171: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 174: iload 17
      // 176: aaload
      // 177: iload 16
      // 179: ifne 1b6
      // 17c: goto 189
      // 17f: ldc2_w -1833405103133184789
      // 182: lload 3
      // 183: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: instanceof com/zelix/bq
      // 18c: goto 199
      // 18f: ldc2_w -1833405103133184789
      // 192: lload 3
      // 193: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: athrow
      // 199: lload 3
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 1d6
      // 19f: ifeq 1d1
      // 1a2: aload 0
      // 1a3: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 1a6: iload 17
      // 1a8: aaload
      // 1a9: goto 1b6
      // 1ac: ldc2_w -1833405103133184789
      // 1af: lload 3
      // 1b0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: checkcast com/zelix/bq
      // 1b9: lload 14
      // 1bb: bipush 1
      // 1bc: anewarray 245
      // 1bf: dup_x2
      // 1c0: dup_x2
      // 1c1: pop
      // 1c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c5: bipush 0
      // 1c6: swap
      // 1c7: aastore
      // 1c8: ldc2_w -469666524104375401
      // 1cb: lload 3
      // 1cc: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: iinc 17 1
      // 1d4: iload 16
      // 1d6: ifeq 07d
      // 1d9: lload 3
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: iflt 087
      // 1df: bipush 0
      // 1e0: istore 17
      // 1e2: iload 17
      // 1e4: aload 0
      // 1e5: getfield com/zelix/hu.c I
      // 1e8: if_icmpge 236
      // 1eb: aload 0
      // 1ec: ldc2_w -1772201541824613281
      // 1ef: lload 3
      // 1f0: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/iy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: iload 17
      // 1f7: aaload
      // 1f8: lload 6
      // 1fa: bipush 1
      // 1fb: anewarray 245
      // 1fe: dup_x2
      // 1ff: dup_x2
      // 200: pop
      // 201: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 204: bipush 0
      // 205: swap
      // 206: aastore
      // 207: ldc2_w -474430284730008340
      // 20a: lload 3
      // 20b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: iinc 17 1
      // 213: iload 16
      // 215: lload 3
      // 216: lconst_0
      // 217: lcmp
      // 218: iflt 23b
      // 21b: ifne 239
      // 21e: iload 16
      // 220: ifeq 1e2
      // 223: lload 3
      // 224: lconst_0
      // 225: lcmp
      // 226: iflt 213
      // 229: goto 236
      // 22c: ldc2_w -1833405103133184789
      // 22f: lload 3
      // 230: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: bipush 0
      // 237: istore 17
      // 239: iload 17
      // 23b: lload 3
      // 23c: lconst_0
      // 23d: lcmp
      // 23e: ifle 272
      // 241: aload 0
      // 242: getfield com/zelix/hu.R I
      // 245: if_icmpge 288
      // 248: aload 0
      // 249: ldc2_w -1739427478267179818
      // 24c: lload 3
      // 24d: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: iload 17
      // 254: aaload
      // 255: lload 6
      // 257: bipush 1
      // 258: anewarray 245
      // 25b: dup_x2
      // 25c: dup_x2
      // 25d: pop
      // 25e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 261: bipush 0
      // 262: swap
      // 263: aastore
      // 264: ldc2_w -474430284730008340
      // 267: lload 3
      // 268: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: iinc 17 1
      // 270: iload 16
      // 272: ifeq 239
      // 275: lload 3
      // 276: lconst_0
      // 277: lcmp
      // 278: ifle 239
      // 27b: goto 288
      // 27e: ldc2_w -1833405103133184789
      // 281: lload 3
      // 282: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: athrow
      // 288: return
   }

   public iz[] u(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 128024350293264L;
      return x44.a<"m">(this, new Object[]{var4}, -7533950759642566027L, var2);
   }

   public iu[] n(long var1) {
      long var3 = var1 ^ 4806358186450L;
      return x44.a<"k">(this, new Object[]{var3}, -7855981901540666875L, var1);
   }

   public void M(Object[] param1) {
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
      // 004: checkcast java/util/Map
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_y4
      // 00e: astore 8
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Map
      // 016: astore 4
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/_zq
      // 01e: astore 7
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/lang/Long
      // 026: invokevirtual java/lang/Long.longValue ()J
      // 029: lstore 5
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_zq
      // 031: astore 3
      // 032: pop
      // 033: getstatic com/zelix/hu.e J
      // 036: lload 5
      // 038: lxor
      // 039: lstore 5
      // 03b: lload 5
      // 03d: dup2
      // 03e: ldc2_w 34572224919700
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 63584610087842
      // 048: lxor
      // 049: lstore 11
      // 04b: dup2
      // 04c: ldc2_w 27130838173048
      // 04f: lxor
      // 050: lstore 13
      // 052: dup2
      // 053: ldc2_w 84891949602172
      // 056: lxor
      // 057: lstore 15
      // 059: dup2
      // 05a: ldc2_w 101581620942870
      // 05d: lxor
      // 05e: lstore 17
      // 060: pop2
      // 061: ldc2_w 7223730606530122837
      // 064: lload 5
      // 066: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: bipush 0
      // 06c: istore 20
      // 06e: istore 19
      // 070: iload 20
      // 072: aload 0
      // 073: getfield com/zelix/hu.R I
      // 076: if_icmpge 136
      // 079: aload 0
      // 07a: ldc2_w 8774462282325119695
      // 07d: lload 5
      // 07f: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: iload 20
      // 086: aaload
      // 087: astore 21
      // 089: aload 2
      // 08a: aload 21
      // 08c: lload 15
      // 08e: invokevirtual com/zelix/in.G (J)Lcom/zelix/_fz;
      // 091: aload 21
      // 093: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 098: pop
      // 099: aload 8
      // 09b: aload 21
      // 09d: invokevirtual com/zelix/in.H ()Ljava/lang/String;
      // 0a0: aload 21
      // 0a2: lload 17
      // 0a4: ldc2_w 9134602309914509819
      // 0a7: lload 5
      // 0a9: invokedynamic n (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: lload 11
      // 0b0: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0b3: aload 4
      // 0b5: aload 21
      // 0b7: lload 9
      // 0b9: invokevirtual com/zelix/in.s (J)Lcom/zelix/_fr;
      // 0bc: aload 21
      // 0be: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c3: pop
      // 0c4: lload 5
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: iflt 131
      // 0cb: aload 0
      // 0cc: iload 19
      // 0ce: ifeq 12d
      // 0d1: lload 13
      // 0d3: invokevirtual com/zelix/hu.d (J)Z
      // 0d6: ifeq 112
      // 0d9: goto 0e7
      // 0dc: ldc2_w 8689421554674709234
      // 0df: lload 5
      // 0e1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: aload 21
      // 0eb: lload 17
      // 0ed: ldc2_w 9134602309914509819
      // 0f0: lload 5
      // 0f2: invokedynamic n (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: aload 21
      // 0f9: ldc2_w 7308830549140890882
      // 0fc: lload 5
      // 0fe: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: pop
      // 104: goto 112
      // 107: ldc2_w 8689421554674709234
      // 10a: lload 5
      // 10c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: aload 3
      // 113: aload 21
      // 115: lload 17
      // 117: ldc2_w 9134602309914509819
      // 11a: lload 5
      // 11c: invokedynamic n (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: aload 21
      // 123: ldc2_w 7308830549140890882
      // 126: lload 5
      // 128: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: pop
      // 12e: iinc 20 1
      // 131: iload 19
      // 133: ifne 070
      // 136: return
   }

   public _83 w(long var1) {
      return x44.a<"k">(this, 6655572475484302285L, var1);
   }

   public iy G(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 9
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Integer
      // 023: invokevirtual java/lang/Integer.intValue ()I
      // 026: istore 4
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/String
      // 02e: astore 5
      // 030: dup
      // 031: bipush 5
      // 032: aaload
      // 033: checkcast java/lang/Integer
      // 036: invokevirtual java/lang/Integer.intValue ()I
      // 039: istore 8
      // 03b: dup
      // 03c: bipush 6
      // 03e: aaload
      // 03f: checkcast java/lang/Boolean
      // 042: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 045: istore 7
      // 047: dup
      // 048: bipush 7
      // 04a: aaload
      // 04b: checkcast java/lang/Integer
      // 04e: invokevirtual java/lang/Integer.intValue ()I
      // 051: istore 6
      // 053: pop
      // 054: iload 3
      // 055: i2l
      // 056: bipush 32
      // 058: lshl
      // 059: iload 9
      // 05b: i2l
      // 05c: bipush 56
      // 05e: lshl
      // 05f: bipush 32
      // 061: lushr
      // 062: lor
      // 063: iload 4
      // 065: i2l
      // 066: bipush 40
      // 068: lshl
      // 069: bipush 40
      // 06b: lushr
      // 06c: lor
      // 06d: getstatic com/zelix/hu.e J
      // 070: lxor
      // 071: lstore 10
      // 073: lload 10
      // 075: dup2
      // 076: ldc2_w 92786646471226
      // 079: lxor
      // 07a: lstore 12
      // 07c: dup2
      // 07d: ldc2_w 16408335016321
      // 080: lxor
      // 081: lstore 14
      // 083: dup2
      // 084: ldc2_w 26821401158830
      // 087: lxor
      // 088: lstore 16
      // 08a: dup2
      // 08b: ldc2_w 66747844425862
      // 08e: lxor
      // 08f: lstore 18
      // 091: dup2
      // 092: ldc2_w 5796317686889
      // 095: lxor
      // 096: lstore 20
      // 098: dup2
      // 099: ldc2_w 92995634468374
      // 09c: lxor
      // 09d: lstore 22
      // 09f: dup2
      // 0a0: ldc2_w 5873957132784
      // 0a3: lxor
      // 0a4: lstore 24
      // 0a6: dup2
      // 0a7: ldc2_w 62726898708449
      // 0aa: lxor
      // 0ab: lstore 26
      // 0ad: dup2
      // 0ae: ldc2_w 12374402326672
      // 0b1: lxor
      // 0b2: lstore 28
      // 0b4: dup2
      // 0b5: ldc2_w 2600098668751
      // 0b8: lxor
      // 0b9: lstore 30
      // 0bb: pop2
      // 0bc: ldc2_w -4526458486572453564
      // 0bf: lload 10
      // 0c1: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: istore 35
      // 0c8: aload 0
      // 0c9: new com/zelix/s3
      // 0cc: dup
      // 0cd: aload 2
      // 0ce: aload 5
      // 0d0: invokespecial com/zelix/s3.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0d3: lload 30
      // 0d5: dup2_x1
      // 0d6: pop2
      // 0d7: bipush 2
      // 0d8: anewarray 245
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 1
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 0
      // 0e7: swap
      // 0e8: aastore
      // 0e9: ldc2_w -2435568798384038019
      // 0ec: lload 10
      // 0ee: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: ifnull 103
      // 0f6: aconst_null
      // 0f7: areturn
      // 0f8: ldc2_w -2484272210830583837
      // 0fb: lload 10
      // 0fd: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: new java/util/ArrayList
      // 106: dup
      // 107: bipush 2
      // 108: invokespecial java/util/ArrayList.<init> (I)V
      // 10b: astore 36
      // 10d: new com/zelix/mx
      // 110: dup
      // 111: bipush 0
      // 112: aload 0
      // 113: ldc2_w -4342254055446252499
      // 116: lload 10
      // 118: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: aload 2
      // 11e: invokespecial com/zelix/mx.<init> (ILcom/zelix/_83;Ljava/lang/String;)V
      // 121: astore 37
      // 123: aload 36
      // 125: aload 37
      // 127: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 12a: pop
      // 12b: new com/zelix/mx
      // 12e: dup
      // 12f: bipush 0
      // 130: aload 0
      // 131: ldc2_w -4342254055446252499
      // 134: lload 10
      // 136: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 5
      // 13d: invokespecial com/zelix/mx.<init> (ILcom/zelix/_83;Ljava/lang/String;)V
      // 140: astore 38
      // 142: aload 36
      // 144: aload 38
      // 146: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 149: pop
      // 14a: bipush 0
      // 14b: anewarray 589
      // 14e: astore 39
      // 150: new com/zelix/iy
      // 153: dup
      // 154: aload 0
      // 155: aload 37
      // 157: aload 38
      // 159: lload 22
      // 15b: aload 39
      // 15d: iload 6
      // 15f: invokespecial com/zelix/iy.<init> (Lcom/zelix/hz;Lcom/zelix/mx;Lcom/zelix/mx;J[Lcom/zelix/h4;I)V
      // 162: astore 40
      // 164: aload 40
      // 166: lload 24
      // 168: bipush 1
      // 169: bipush 2
      // 16a: anewarray 245
      // 16d: dup_x1
      // 16e: swap
      // 16f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 172: bipush 1
      // 173: swap
      // 174: aastore
      // 175: dup_x2
      // 176: dup_x2
      // 177: pop
      // 178: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17b: bipush 0
      // 17c: swap
      // 17d: aastore
      // 17e: ldc2_w -4378659215590847206
      // 181: lload 10
      // 183: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: iload 7
      // 18a: iload 35
      // 18c: iload 9
      // 18e: ifgt 1db
      // 191: ifeq 1d9
      // 194: ifeq 1d7
      // 197: goto 1a5
      // 19a: ldc2_w -2484272210830583837
      // 19d: lload 10
      // 19f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: aload 40
      // 1a7: bipush 1
      // 1a8: lload 14
      // 1aa: bipush 2
      // 1ab: anewarray 245
      // 1ae: dup_x2
      // 1af: dup_x2
      // 1b0: pop
      // 1b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b4: bipush 1
      // 1b5: swap
      // 1b6: aastore
      // 1b7: dup_x1
      // 1b8: swap
      // 1b9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1bc: bipush 0
      // 1bd: swap
      // 1be: aastore
      // 1bf: ldc2_w -2595134211821320889
      // 1c2: lload 10
      // 1c4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: goto 1d7
      // 1cc: ldc2_w -2484272210830583837
      // 1cf: lload 10
      // 1d1: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: iload 8
      // 1d9: iload 35
      // 1db: ifeq 314
      // 1de: tableswitch 234 1 4 41 92 143 193
      // 1fc: ldc2_w -2484272210830583837
      // 1ff: lload 10
      // 201: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 40
      // 209: lload 16
      // 20b: bipush 1
      // 20c: anewarray 245
      // 20f: dup_x2
      // 210: dup_x2
      // 211: pop
      // 212: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 215: bipush 0
      // 216: swap
      // 217: aastore
      // 218: ldc2_w -4157995127192752253
      // 21b: lload 10
      // 21d: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: iload 4
      // 224: iflt 2e9
      // 227: iload 35
      // 229: ifne 2c8
      // 22c: goto 23a
      // 22f: ldc2_w -2484272210830583837
      // 232: lload 10
      // 234: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: athrow
      // 23a: aload 40
      // 23c: lload 18
      // 23e: bipush 1
      // 23f: anewarray 245
      // 242: dup_x2
      // 243: dup_x2
      // 244: pop
      // 245: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 248: bipush 0
      // 249: swap
      // 24a: aastore
      // 24b: ldc2_w -4431527831284193943
      // 24e: lload 10
      // 250: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: iload 9
      // 257: ifge 2e9
      // 25a: iload 35
      // 25c: ifne 2c8
      // 25f: goto 26d
      // 262: ldc2_w -2484272210830583837
      // 265: lload 10
      // 267: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: aload 40
      // 26f: lload 12
      // 271: bipush 1
      // 272: anewarray 245
      // 275: dup_x2
      // 276: dup_x2
      // 277: pop
      // 278: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27b: bipush 0
      // 27c: swap
      // 27d: aastore
      // 27e: ldc2_w -2763704377410017979
      // 281: lload 10
      // 283: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: iload 3
      // 289: ifle 2e9
      // 28c: iload 35
      // 28e: ifne 2c8
      // 291: goto 29f
      // 294: ldc2_w -2484272210830583837
      // 297: lload 10
      // 299: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: athrow
      // 29f: aload 40
      // 2a1: lload 12
      // 2a3: bipush 1
      // 2a4: anewarray 245
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: ldc2_w -2763704377410017979
      // 2b3: lload 10
      // 2b5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: goto 2c8
      // 2bd: ldc2_w -2484272210830583837
      // 2c0: lload 10
      // 2c2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: athrow
      // 2c8: aload 0
      // 2c9: aload 40
      // 2cb: lload 26
      // 2cd: bipush 2
      // 2ce: anewarray 245
      // 2d1: dup_x2
      // 2d2: dup_x2
      // 2d3: pop
      // 2d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d7: bipush 1
      // 2d8: swap
      // 2d9: aastore
      // 2da: dup_x1
      // 2db: swap
      // 2dc: bipush 0
      // 2dd: swap
      // 2de: aastore
      // 2df: ldc2_w -4572105384933142271
      // 2e2: lload 10
      // 2e4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: aload 0
      // 2ea: ldc2_w -4342254055446252499
      // 2ed: lload 10
      // 2ef: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: aload 36
      // 2f6: lload 28
      // 2f8: bipush 2
      // 2f9: anewarray 245
      // 2fc: dup_x2
      // 2fd: dup_x2
      // 2fe: pop
      // 2ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 302: bipush 1
      // 303: swap
      // 304: aastore
      // 305: dup_x1
      // 306: swap
      // 307: bipush 0
      // 308: swap
      // 309: aastore
      // 30a: ldc2_w -2565989350646303279
      // 30d: lload 10
      // 30f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: pop
      // 315: aload 0
      // 316: ldc2_w -2314610413343926262
      // 319: lload 10
      // 31b: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: aload 0
      // 321: new com/zelix/wp
      // 324: dup
      // 325: bipush 4
      // 326: invokespecial com/zelix/wp.<init> (I)V
      // 329: aload 0
      // 32a: aconst_null
      // 32b: astore 32
      // 32d: astore 33
      // 32f: astore 34
      // 331: lload 20
      // 333: aload 34
      // 335: aload 33
      // 337: aload 32
      // 339: ldc2_w -2372982033198846396
      // 33c: lload 10
      // 33e: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: aload 40
      // 345: areturn
   }

   public void I(Object[] var1) {
      long var5 = (Long)var1[0];
      _yv var3 = (_yv)var1[1];
      _ug var4 = (_ug)var1[2];
      ei var2 = (ei)var1[3];
      var5 = e ^ var5;
      long var7 = var5 ^ 13584854679772L;
      x44.a<"k">(x44.a<"o">(this, 2427789917955986977L, var5), new Object[]{var7, var3, var4, var2}, 4401780377688707174L, var5);
   }

   public xl N(long var1, int var3, byte var4) {
      long var5 = var1 << 8 | (long)var4 << 56 >>> 56;
      long var7 = (var5 ^ 0L) >>> 8;
      int var9 = (int)((var5 ^ 0L) << 56 >>> 56);
      return x44.a<"l">(this, -5354148553652436446L, var5).N(var7, var3, (byte)var9);
   }

   public void e(Object[] param1) {
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
      // 004: checkcast com/zelix/_ur
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_yv
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Boolean
      // 020: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 023: istore 5
      // 025: pop
      // 026: lload 3
      // 027: dup2
      // 028: ldc2_w 17033126053065
      // 02b: lxor
      // 02c: lstore 7
      // 02e: dup2
      // 02f: ldc2_w 91824612581952
      // 032: lxor
      // 033: lstore 9
      // 035: dup2
      // 036: ldc2_w 17464148791783
      // 039: lxor
      // 03a: lstore 11
      // 03c: dup2
      // 03d: ldc2_w 83603185851440
      // 040: lxor
      // 041: lstore 13
      // 043: pop2
      // 044: aload 0
      // 045: ldc2_w 8070866734025066385
      // 048: lload 3
      // 049: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 6
      // 050: aload 2
      // 051: lload 11
      // 053: bipush 3
      // 054: anewarray 245
      // 057: dup_x2
      // 058: dup_x2
      // 059: pop
      // 05a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d: bipush 2
      // 05e: swap
      // 05f: aastore
      // 060: dup_x1
      // 061: swap
      // 062: bipush 1
      // 063: swap
      // 064: aastore
      // 065: dup_x1
      // 066: swap
      // 067: bipush 0
      // 068: swap
      // 069: aastore
      // 06a: ldc2_w 8084340372575379504
      // 06d: lload 3
      // 06e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: ldc2_w 8255807872177226488
      // 076: lload 3
      // 077: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: bipush 0
      // 07d: istore 16
      // 07f: istore 15
      // 081: iload 16
      // 083: aload 0
      // 084: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 087: arraylength
      // 088: if_icmpge 165
      // 08b: aload 0
      // 08c: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 08f: iload 16
      // 091: aaload
      // 092: instanceof com/zelix/_yl
      // 095: iload 15
      // 097: lload 3
      // 098: lconst_0
      // 099: lcmp
      // 09a: iflt 0a2
      // 09d: ifeq 16c
      // 0a0: iload 15
      // 0a2: ifeq 125
      // 0a5: goto 0b2
      // 0a8: ldc2_w 7942761979165615199
      // 0ab: lload 3
      // 0ac: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: ifeq 0fc
      // 0b5: goto 0c2
      // 0b8: ldc2_w 7942761979165615199
      // 0bb: lload 3
      // 0bc: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 0c6: iload 16
      // 0c8: aaload
      // 0c9: checkcast com/zelix/_yl
      // 0cc: lload 13
      // 0ce: bipush 1
      // 0cf: anewarray 245
      // 0d2: dup_x2
      // 0d3: dup_x2
      // 0d4: pop
      // 0d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d8: bipush 0
      // 0d9: swap
      // 0da: aastore
      // 0db: ldc2_w 7810720584158574335
      // 0de: lload 3
      // 0df: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: iload 15
      // 0e6: lload 3
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: iflt 162
      // 0ec: ifne 15d
      // 0ef: goto 0fc
      // 0f2: ldc2_w 7942761979165615199
      // 0f5: lload 3
      // 0f6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 100: iload 16
      // 102: aaload
      // 103: iload 15
      // 105: ifeq 142
      // 108: goto 115
      // 10b: ldc2_w 7942761979165615199
      // 10e: lload 3
      // 10f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: instanceof com/zelix/b7
      // 118: goto 125
      // 11b: ldc2_w 7942761979165615199
      // 11e: lload 3
      // 11f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: lload 3
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 162
      // 12b: ifeq 15d
      // 12e: aload 0
      // 12f: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 132: iload 16
      // 134: aaload
      // 135: goto 142
      // 138: ldc2_w 7942761979165615199
      // 13b: lload 3
      // 13c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: checkcast com/zelix/b7
      // 145: lload 7
      // 147: bipush 1
      // 148: anewarray 245
      // 14b: dup_x2
      // 14c: dup_x2
      // 14d: pop
      // 14e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 151: bipush 0
      // 152: swap
      // 153: aastore
      // 154: ldc2_w 7657464198465723323
      // 157: lload 3
      // 158: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: iinc 16 1
      // 160: iload 15
      // 162: ifne 081
      // 165: lload 3
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 08b
      // 16b: bipush 0
      // 16c: istore 16
      // 16e: iload 16
      // 170: aload 0
      // 171: getfield com/zelix/hu.c I
      // 174: if_icmpge 1c2
      // 177: aload 0
      // 178: ldc2_w 8058017514218224875
      // 17b: lload 3
      // 17c: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/iy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: iload 16
      // 183: aaload
      // 184: lload 9
      // 186: bipush 1
      // 187: anewarray 245
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 0
      // 191: swap
      // 192: aastore
      // 193: ldc2_w 8616512617732132811
      // 196: lload 3
      // 197: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: iinc 16 1
      // 19f: iload 15
      // 1a1: lload 3
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: ifle 1c7
      // 1a7: ifeq 1c5
      // 1aa: iload 15
      // 1ac: ifne 16e
      // 1af: lload 3
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: ifle 19f
      // 1b5: goto 1c2
      // 1b8: ldc2_w 7942761979165615199
      // 1bb: lload 3
      // 1bc: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: bipush 0
      // 1c3: istore 16
      // 1c5: iload 16
      // 1c7: lload 3
      // 1c8: lconst_0
      // 1c9: lcmp
      // 1ca: iflt 1fe
      // 1cd: aload 0
      // 1ce: getfield com/zelix/hu.R I
      // 1d1: if_icmpge 214
      // 1d4: aload 0
      // 1d5: ldc2_w 8027802428682945634
      // 1d8: lload 3
      // 1d9: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: iload 16
      // 1e0: aaload
      // 1e1: lload 9
      // 1e3: bipush 1
      // 1e4: anewarray 245
      // 1e7: dup_x2
      // 1e8: dup_x2
      // 1e9: pop
      // 1ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ed: bipush 0
      // 1ee: swap
      // 1ef: aastore
      // 1f0: ldc2_w 8616512617732132811
      // 1f3: lload 3
      // 1f4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: iinc 16 1
      // 1fc: iload 15
      // 1fe: ifne 1c5
      // 201: lload 3
      // 202: lconst_0
      // 203: lcmp
      // 204: ifle 1c5
      // 207: goto 214
      // 20a: ldc2_w 7942761979165615199
      // 20d: lload 3
      // 20e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: return
   }

   public void a(Object[] param1) {
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
      // 04: checkcast com/zelix/_8z
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/hu.e J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 134985581473860
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 99750728144619
      // 26: lxor
      // 27: lstore 7
      // 29: pop2
      // 2a: ldc2_w -5897306577675379134
      // 2d: lload 2
      // 2e: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: bipush 0
      // 34: istore 10
      // 36: istore 9
      // 38: iload 10
      // 3a: aload 0
      // 3b: getfield com/zelix/hu.c I
      // 3e: if_icmpge 80
      // 41: aload 0
      // 42: ldc2_w -5518634328974647215
      // 45: lload 2
      // 46: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/iy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: iload 10
      // 4d: aaload
      // 4e: aload 4
      // 50: aload 0
      // 51: lload 5
      // 53: invokevirtual com/zelix/hu.k (J)Ljava/lang/String;
      // 56: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 59: lload 7
      // 5b: dup2_x1
      // 5c: pop2
      // 5d: bipush 2
      // 5e: anewarray 245
      // 61: dup_x1
      // 62: swap
      // 63: bipush 1
      // 64: swap
      // 65: aastore
      // 66: dup_x2
      // 67: dup_x2
      // 68: pop
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: ldc2_w -5669261660051482679
      // 72: lload 2
      // 73: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: iinc 10 1
      // 7b: iload 9
      // 7d: ifne 38
      // 80: lload 2
      // 81: lconst_0
      // 82: lcmp
      // 83: ifle 7b
      // 86: return
   }

   public iy[] b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = e ^ var2;
      return x44.a<"i">(this, -390176473005102675L, var2);
   }

   public void n(Object[] param1) {
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
      // 00a: istore 8
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 6
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 2
      // 021: dup
      // 022: bipush 3
      // 023: aaload
      // 024: checkcast java/util/HashMap
      // 027: astore 10
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/util/HashSet
      // 02f: astore 4
      // 031: dup
      // 032: bipush 5
      // 033: aaload
      // 034: checkcast java/util/Set
      // 037: astore 5
      // 039: dup
      // 03a: bipush 6
      // 03c: aaload
      // 03d: checkcast java/util/HashMap
      // 040: astore 9
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast com/zelix/_zk
      // 049: astore 7
      // 04b: pop
      // 04c: lload 2
      // 04d: dup2
      // 04e: ldc2_w 55866376562213
      // 051: lxor
      // 052: lstore 11
      // 054: dup2
      // 055: ldc2_w 32488930688161
      // 058: lxor
      // 059: lstore 13
      // 05b: dup2
      // 05c: ldc2_w 11767452655125
      // 05f: lxor
      // 060: lstore 15
      // 062: dup2
      // 063: ldc2_w 137528778089438
      // 066: lxor
      // 067: lstore 17
      // 069: pop2
      // 06a: aload 0
      // 06b: ldc2_w 2240573610119374984
      // 06e: lload 2
      // 06f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: lload 15
      // 076: aload 10
      // 078: aload 7
      // 07a: bipush 3
      // 07b: anewarray 245
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 2
      // 081: swap
      // 082: aastore
      // 083: dup_x1
      // 084: swap
      // 085: bipush 1
      // 086: swap
      // 087: aastore
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 0
      // 08f: swap
      // 090: aastore
      // 091: ldc2_w 1771929362039382692
      // 094: lload 2
      // 095: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: ldc2_w 71088554960041144
      // 09d: lload 2
      // 09e: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: bipush 0
      // 0a4: istore 20
      // 0a6: istore 19
      // 0a8: iload 20
      // 0aa: aload 0
      // 0ab: getfield com/zelix/hu.R I
      // 0ae: if_icmpge 11e
      // 0b1: aload 0
      // 0b2: ldc2_w 31838136560069499
      // 0b5: lload 2
      // 0b6: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: iload 20
      // 0bd: aaload
      // 0be: iload 8
      // 0c0: lload 11
      // 0c2: iload 6
      // 0c4: aload 9
      // 0c6: aload 10
      // 0c8: bipush 5
      // 0c9: anewarray 245
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 4
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 3
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0db: bipush 2
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ec: bipush 0
      // 0ed: swap
      // 0ee: aastore
      // 0ef: ldc2_w 1754945202316683040
      // 0f2: lload 2
      // 0f3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: iinc 20 1
      // 0fb: iload 19
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: ifle 129
      // 103: ifne 121
      // 106: iload 19
      // 108: ifeq 0a8
      // 10b: lload 2
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: iflt 0fb
      // 111: goto 11e
      // 114: ldc2_w 81975965050620742
      // 117: lload 2
      // 118: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: bipush 0
      // 11f: istore 20
      // 121: lload 2
      // 122: lconst_0
      // 123: lcmp
      // 124: ifle 1c3
      // 127: iload 20
      // 129: aload 0
      // 12a: getfield com/zelix/hu.c I
      // 12d: if_icmpge 1aa
      // 130: aload 0
      // 131: ldc2_w 57055200854742002
      // 134: lload 2
      // 135: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/iy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: iload 20
      // 13c: aaload
      // 13d: iload 8
      // 13f: lload 11
      // 141: iload 6
      // 143: aload 9
      // 145: aload 10
      // 147: bipush 5
      // 148: anewarray 245
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 4
      // 14e: swap
      // 14f: aastore
      // 150: dup_x1
      // 151: swap
      // 152: bipush 3
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15a: bipush 2
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x2
      // 15e: dup_x2
      // 15f: pop
      // 160: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 163: bipush 1
      // 164: swap
      // 165: aastore
      // 166: dup_x1
      // 167: swap
      // 168: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16b: bipush 0
      // 16c: swap
      // 16d: aastore
      // 16e: ldc2_w 1754945202316683040
      // 171: lload 2
      // 172: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: iinc 20 1
      // 17a: iload 19
      // 17c: lload 2
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: ifle 1c4
      // 182: ifne 1c3
      // 185: goto 192
      // 188: ldc2_w 81975965050620742
      // 18b: lload 2
      // 18c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: iload 19
      // 194: ifeq 121
      // 197: lload 2
      // 198: lconst_0
      // 199: lcmp
      // 19a: iflt 121
      // 19d: goto 1aa
      // 1a0: ldc2_w 81975965050620742
      // 1a3: lload 2
      // 1a4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: lload 17
      // 1ad: bipush 1
      // 1ae: anewarray 245
      // 1b1: dup_x2
      // 1b2: dup_x2
      // 1b3: pop
      // 1b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b7: bipush 0
      // 1b8: swap
      // 1b9: aastore
      // 1ba: ldc2_w 219835728278091075
      // 1bd: lload 2
      // 1be: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: bipush 0
      // 1c4: istore 20
      // 1c6: iload 20
      // 1c8: aload 0
      // 1c9: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 1cc: arraylength
      // 1cd: if_icmpge 219
      // 1d0: aload 0
      // 1d1: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 1d4: iload 20
      // 1d6: aaload
      // 1d7: iload 8
      // 1d9: iload 6
      // 1db: aload 9
      // 1dd: aload 10
      // 1df: lload 13
      // 1e1: bipush 5
      // 1e2: anewarray 245
      // 1e5: dup_x2
      // 1e6: dup_x2
      // 1e7: pop
      // 1e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1eb: bipush 4
      // 1ec: swap
      // 1ed: aastore
      // 1ee: dup_x1
      // 1ef: swap
      // 1f0: bipush 3
      // 1f1: swap
      // 1f2: aastore
      // 1f3: dup_x1
      // 1f4: swap
      // 1f5: bipush 2
      // 1f6: swap
      // 1f7: aastore
      // 1f8: dup_x1
      // 1f9: swap
      // 1fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fd: bipush 1
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 205: bipush 0
      // 206: swap
      // 207: aastore
      // 208: ldc2_w 80854062923256745
      // 20b: lload 2
      // 20c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: iinc 20 1
      // 214: iload 19
      // 216: ifeq 1c6
      // 219: lload 2
      // 21a: lconst_0
      // 21b: lcmp
      // 21c: ifle 214
      // 21f: return
   }

   public hu(long param1, _xx param3, _rv param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hu.e J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 89493490298747
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 133305129429536
      // 012: lxor
      // 013: lstore 7
      // 015: dup2
      // 016: ldc2_w 120537537487621
      // 019: lxor
      // 01a: lstore 9
      // 01c: dup2
      // 01d: ldc2_w 75646459765824
      // 020: lxor
      // 021: lstore 11
      // 023: dup2
      // 024: ldc2_w 70175841756997
      // 027: lxor
      // 028: lstore 13
      // 02a: dup2
      // 02b: ldc2_w 17969189126218
      // 02e: lxor
      // 02f: lstore 15
      // 031: dup2
      // 032: ldc2_w 23938327015317
      // 035: lxor
      // 036: lstore 17
      // 038: dup2
      // 039: ldc2_w 73580219173519
      // 03c: lxor
      // 03d: dup2
      // 03e: bipush 32
      // 040: lushr
      // 041: lstore 19
      // 043: dup2
      // 044: bipush 32
      // 046: lshl
      // 047: bipush 32
      // 049: lushr
      // 04a: l2i
      // 04b: istore 21
      // 04d: pop2
      // 04e: dup2
      // 04f: ldc2_w 19244343774928
      // 052: lxor
      // 053: dup2
      // 054: bipush 48
      // 056: lushr
      // 057: l2i
      // 058: istore 22
      // 05a: dup2
      // 05b: bipush 16
      // 05d: lshl
      // 05e: bipush 16
      // 060: lushr
      // 061: lstore 23
      // 063: pop2
      // 064: dup2
      // 065: ldc2_w 65625525293171
      // 068: lxor
      // 069: lstore 25
      // 06b: dup2
      // 06c: ldc2_w 2506529918326
      // 06f: lxor
      // 070: lstore 27
      // 072: dup2
      // 073: ldc2_w 71972381104667
      // 076: lxor
      // 077: lstore 29
      // 079: dup2
      // 07a: ldc2_w 27053143403997
      // 07d: lxor
      // 07e: dup2
      // 07f: bipush 48
      // 081: lushr
      // 082: l2i
      // 083: istore 31
      // 085: dup2
      // 086: bipush 16
      // 088: lshl
      // 089: bipush 32
      // 08b: lushr
      // 08c: l2i
      // 08d: istore 32
      // 08f: dup2
      // 090: bipush 48
      // 092: lshl
      // 093: bipush 48
      // 095: lushr
      // 096: l2i
      // 097: istore 33
      // 099: pop2
      // 09a: pop2
      // 09b: ldc2_w -1774826806098471116
      // 09e: lload 1
      // 09f: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: aload 0
      // 0a5: aload 4
      // 0a7: aload 3
      // 0a8: lload 25
      // 0aa: bipush 1
      // 0ab: anewarray 245
      // 0ae: dup_x2
      // 0af: dup_x2
      // 0b0: pop
      // 0b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: invokevirtual com/zelix/_xx.R ([Ljava/lang/Object;)[B
      // 0ba: lload 15
      // 0bc: bipush 0
      // 0bd: invokespecial com/zelix/hz.<init> (Lcom/zelix/_rv;[BJI)V
      // 0c0: istore 34
      // 0c2: aload 0
      // 0c3: lload 29
      // 0c5: aload 3
      // 0c6: bipush 2
      // 0c7: anewarray 245
      // 0ca: dup_x1
      // 0cb: swap
      // 0cc: bipush 1
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 0
      // 0d6: swap
      // 0d7: aastore
      // 0d8: ldc2_w -1998885047655137054
      // 0db: lload 1
      // 0dc: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: new com/zelix/_y4
      // 0e4: dup
      // 0e5: lload 13
      // 0e7: invokespecial com/zelix/_y4.<init> (J)V
      // 0ea: astore 35
      // 0ec: new com/zelix/_y4
      // 0ef: dup
      // 0f0: lload 13
      // 0f2: invokespecial com/zelix/_y4.<init> (J)V
      // 0f5: astore 36
      // 0f7: new com/zelix/_y4
      // 0fa: dup
      // 0fb: lload 13
      // 0fd: invokespecial com/zelix/_y4.<init> (J)V
      // 100: astore 37
      // 102: new com/zelix/_y4
      // 105: dup
      // 106: lload 13
      // 108: invokespecial com/zelix/_y4.<init> (J)V
      // 10b: astore 38
      // 10d: new com/zelix/_y4
      // 110: dup
      // 111: lload 13
      // 113: invokespecial com/zelix/_y4.<init> (J)V
      // 116: astore 39
      // 118: new com/zelix/_y4
      // 11b: dup
      // 11c: lload 13
      // 11e: invokespecial com/zelix/_y4.<init> (J)V
      // 121: astore 40
      // 123: new com/zelix/_y4
      // 126: dup
      // 127: lload 13
      // 129: invokespecial com/zelix/_y4.<init> (J)V
      // 12c: astore 41
      // 12e: new com/zelix/_y4
      // 131: dup
      // 132: lload 13
      // 134: invokespecial com/zelix/_y4.<init> (J)V
      // 137: astore 42
      // 139: aload 0
      // 13a: new com/zelix/_8b
      // 13d: dup
      // 13e: aload 3
      // 13f: aload 0
      // 140: aload 35
      // 142: lload 19
      // 144: iload 21
      // 146: aload 36
      // 148: aload 37
      // 14a: aload 41
      // 14c: invokespecial com/zelix/_8b.<init> (Lcom/zelix/_xx;Lcom/zelix/hu;Lcom/zelix/_y4;JILcom/zelix/_y4;Lcom/zelix/_y4;Lcom/zelix/_y4;)V
      // 14f: ldc2_w -1887725812220472739
      // 152: lload 1
      // 153: invokedynamic t (Ljava/lang/Object;Lcom/zelix/_8b;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: aload 0
      // 159: aload 0
      // 15a: ldc2_w -1887725812220472739
      // 15d: lload 1
      // 15e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: bipush 0
      // 164: anewarray 245
      // 167: ldc2_w -305514819879764217
      // 16a: lload 1
      // 16b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: ldc2_w -2145113312413567289
      // 173: lload 1
      // 174: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: aload 0
      // 17a: new com/zelix/h2
      // 17d: dup
      // 17e: aload 0
      // 17f: aload 3
      // 180: invokespecial com/zelix/h2.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;)V
      // 183: putfield com/zelix/hu.m Lcom/zelix/h2;
      // 186: aload 3
      // 187: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 18a: istore 43
      // 18c: aload 3
      // 18d: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 190: istore 44
      // 192: aload 0
      // 193: aload 3
      // 194: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 197: ldc2_w -1835183072035774220
      // 19a: lload 1
      // 19b: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: aload 0
      // 1a1: ldc2_w -1835183072035774220
      // 1a4: lload 1
      // 1a5: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: newarray 10
      // 1ac: astore 45
      // 1ae: bipush 0
      // 1af: istore 46
      // 1b1: iload 46
      // 1b3: aload 0
      // 1b4: ldc2_w -1835183072035774220
      // 1b7: lload 1
      // 1b8: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: if_icmpge 1ef
      // 1c0: aload 45
      // 1c2: iload 46
      // 1c4: aload 3
      // 1c5: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 1c8: iastore
      // 1c9: iinc 46 1
      // 1cc: iload 34
      // 1ce: lload 1
      // 1cf: lconst_0
      // 1d0: lcmp
      // 1d1: ifle 243
      // 1d4: ifeq 242
      // 1d7: iload 34
      // 1d9: ifne 1b1
      // 1dc: lload 1
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: iflt 1cc
      // 1e2: goto 1ef
      // 1e5: ldc2_w -290954934257274477
      // 1e8: lload 1
      // 1e9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: athrow
      // 1ef: aload 0
      // 1f0: iload 43
      // 1f2: iload 44
      // 1f4: aload 45
      // 1f6: lload 27
      // 1f8: aconst_null
      // 1f9: bipush 5
      // 1fa: anewarray 245
      // 1fd: dup_x1
      // 1fe: swap
      // 1ff: bipush 4
      // 200: swap
      // 201: aastore
      // 202: dup_x2
      // 203: dup_x2
      // 204: pop
      // 205: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 208: bipush 3
      // 209: swap
      // 20a: aastore
      // 20b: dup_x1
      // 20c: swap
      // 20d: bipush 2
      // 20e: swap
      // 20f: aastore
      // 210: dup_x1
      // 211: swap
      // 212: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 215: bipush 1
      // 216: swap
      // 217: aastore
      // 218: dup_x1
      // 219: swap
      // 21a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21d: bipush 0
      // 21e: swap
      // 21f: aastore
      // 220: ldc2_w -2208537231582959202
      // 223: lload 1
      // 224: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: aload 0
      // 22a: aload 3
      // 22b: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 22e: putfield com/zelix/hu.c I
      // 231: aload 0
      // 232: aload 0
      // 233: getfield com/zelix/hu.c I
      // 236: anewarray 430
      // 239: ldc2_w -423375933210236633
      // 23c: lload 1
      // 23d: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/iy;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: bipush 0
      // 243: istore 46
      // 245: iload 46
      // 247: aload 0
      // 248: getfield com/zelix/hu.c I
      // 24b: if_icmpge 270
      // 24e: aload 0
      // 24f: ldc2_w -423375933210236633
      // 252: lload 1
      // 253: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/iy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: iload 46
      // 25a: new com/zelix/iy
      // 25d: dup
      // 25e: lload 11
      // 260: aload 0
      // 261: aload 3
      // 262: aload 35
      // 264: invokespecial com/zelix/iy.<init> (JLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 267: aastore
      // 268: iinc 46 1
      // 26b: iload 34
      // 26d: ifne 245
      // 270: lload 1
      // 271: lconst_0
      // 272: lcmp
      // 273: ifle 26b
      // 276: new java/io/PrintWriter
      // 279: dup
      // 27a: new java/io/ByteArrayOutputStream
      // 27d: dup
      // 27e: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 281: invokespecial java/io/PrintWriter.<init> (Ljava/io/OutputStream;)V
      // 284: astore 46
      // 286: new com/zelix/ej
      // 289: dup
      // 28a: iload 22
      // 28c: i2c
      // 28d: lload 23
      // 28f: invokespecial com/zelix/ej.<init> (CJ)V
      // 292: astore 47
      // 294: aload 0
      // 295: aload 3
      // 296: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 299: putfield com/zelix/hu.R I
      // 29c: aload 0
      // 29d: aload 0
      // 29e: getfield com/zelix/hu.R I
      // 2a1: anewarray 436
      // 2a4: ldc2_w -386058126035660370
      // 2a7: lload 1
      // 2a8: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/in;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: bipush 0
      // 2ae: istore 48
      // 2b0: iload 48
      // 2b2: aload 0
      // 2b3: getfield com/zelix/hu.R I
      // 2b6: if_icmpge 307
      // 2b9: aload 0
      // 2ba: ldc2_w -386058126035660370
      // 2bd: lload 1
      // 2be: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c3: iload 48
      // 2c5: new com/zelix/in
      // 2c8: dup
      // 2c9: aload 0
      // 2ca: iload 31
      // 2cc: i2c
      // 2cd: aload 3
      // 2ce: aload 35
      // 2d0: iload 32
      // 2d2: aload 36
      // 2d4: aload 37
      // 2d6: aload 46
      // 2d8: iload 33
      // 2da: i2c
      // 2db: aload 47
      // 2dd: invokespecial com/zelix/in.<init> (Lcom/zelix/h8;CLcom/zelix/_xx;Lcom/zelix/_y4;ILcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;CLcom/zelix/ej;)V
      // 2e0: aastore
      // 2e1: iinc 48 1
      // 2e4: iload 34
      // 2e6: lload 1
      // 2e7: lconst_0
      // 2e8: lcmp
      // 2e9: ifle 31b
      // 2ec: ifeq 31a
      // 2ef: iload 34
      // 2f1: ifne 2b0
      // 2f4: lload 1
      // 2f5: lconst_0
      // 2f6: lcmp
      // 2f7: ifle 2e4
      // 2fa: goto 307
      // 2fd: ldc2_w -290954934257274477
      // 300: lload 1
      // 301: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: athrow
      // 307: aload 0
      // 308: aload 3
      // 309: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 30c: putfield com/zelix/hu.W I
      // 30f: aload 0
      // 310: aload 0
      // 311: getfield com/zelix/hu.W I
      // 314: anewarray 589
      // 317: putfield com/zelix/hu.N [Lcom/zelix/h4;
      // 31a: bipush 0
      // 31b: istore 48
      // 31d: iload 48
      // 31f: aload 0
      // 320: getfield com/zelix/hu.W I
      // 323: if_icmpge 39d
      // 326: aload 0
      // 327: getfield com/zelix/hu.N [Lcom/zelix/h4;
      // 32a: iload 48
      // 32c: aload 0
      // 32d: aload 3
      // 32e: aload 35
      // 330: aload 36
      // 332: aload 37
      // 334: aload 46
      // 336: lload 5
      // 338: aload 47
      // 33a: bipush 8
      // 33c: anewarray 245
      // 33f: dup_x1
      // 340: swap
      // 341: bipush 7
      // 343: swap
      // 344: aastore
      // 345: dup_x2
      // 346: dup_x2
      // 347: pop
      // 348: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34b: bipush 6
      // 34d: swap
      // 34e: aastore
      // 34f: dup_x1
      // 350: swap
      // 351: bipush 5
      // 352: swap
      // 353: aastore
      // 354: dup_x1
      // 355: swap
      // 356: bipush 4
      // 357: swap
      // 358: aastore
      // 359: dup_x1
      // 35a: swap
      // 35b: bipush 3
      // 35c: swap
      // 35d: aastore
      // 35e: dup_x1
      // 35f: swap
      // 360: bipush 2
      // 361: swap
      // 362: aastore
      // 363: dup_x1
      // 364: swap
      // 365: bipush 1
      // 366: swap
      // 367: aastore
      // 368: dup_x1
      // 369: swap
      // 36a: bipush 0
      // 36b: swap
      // 36c: aastore
      // 36d: ldc2_w -2137185802814020521
      // 370: lload 1
      // 371: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/h4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: aastore
      // 377: iinc 48 1
      // 37a: lload 1
      // 37b: lconst_0
      // 37c: lcmp
      // 37d: iflt 414
      // 380: iload 34
      // 382: ifeq 414
      // 385: iload 34
      // 387: ifne 31d
      // 38a: lload 1
      // 38b: lconst_0
      // 38c: lcmp
      // 38d: iflt 37a
      // 390: goto 39d
      // 393: ldc2_w -290954934257274477
      // 396: lload 1
      // 397: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39c: athrow
      // 39d: aload 0
      // 39e: lload 9
      // 3a0: bipush 1
      // 3a1: anewarray 245
      // 3a4: dup_x2
      // 3a5: dup_x2
      // 3a6: pop
      // 3a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3aa: bipush 0
      // 3ab: swap
      // 3ac: aastore
      // 3ad: ldc2_w -1746929843868442391
      // 3b0: lload 1
      // 3b1: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: aload 0
      // 3b7: ldc2_w -1887725812220472739
      // 3ba: lload 1
      // 3bb: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8b; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c0: aload 35
      // 3c2: lload 7
      // 3c4: aload 36
      // 3c6: aload 38
      // 3c8: aload 39
      // 3ca: aload 40
      // 3cc: aload 37
      // 3ce: aload 41
      // 3d0: aload 42
      // 3d2: bipush 9
      // 3d4: anewarray 245
      // 3d7: dup_x1
      // 3d8: swap
      // 3d9: bipush 8
      // 3db: swap
      // 3dc: aastore
      // 3dd: dup_x1
      // 3de: swap
      // 3df: bipush 7
      // 3e1: swap
      // 3e2: aastore
      // 3e3: dup_x1
      // 3e4: swap
      // 3e5: bipush 6
      // 3e7: swap
      // 3e8: aastore
      // 3e9: dup_x1
      // 3ea: swap
      // 3eb: bipush 5
      // 3ec: swap
      // 3ed: aastore
      // 3ee: dup_x1
      // 3ef: swap
      // 3f0: bipush 4
      // 3f1: swap
      // 3f2: aastore
      // 3f3: dup_x1
      // 3f4: swap
      // 3f5: bipush 3
      // 3f6: swap
      // 3f7: aastore
      // 3f8: dup_x1
      // 3f9: swap
      // 3fa: bipush 2
      // 3fb: swap
      // 3fc: aastore
      // 3fd: dup_x2
      // 3fe: dup_x2
      // 3ff: pop
      // 400: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 403: bipush 1
      // 404: swap
      // 405: aastore
      // 406: dup_x1
      // 407: swap
      // 408: bipush 0
      // 409: swap
      // 40a: aastore
      // 40b: ldc2_w -2189375137159033528
      // 40e: lload 1
      // 40f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: lload 1
      // 415: lconst_0
      // 416: lcmp
      // 417: ifle 43a
      // 41a: aload 3
      // 41b: iload 34
      // 41d: ifeq 431
      // 420: ifnull 580
      // 423: goto 430
      // 426: ldc2_w -290954934257274477
      // 429: lload 1
      // 42a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42f: athrow
      // 430: aload 3
      // 431: ldc2_w -2112416883985265286
      // 434: lload 1
      // 435: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43a: goto 580
      // 43d: astore 35
      // 43f: new com/zelix/_sk
      // 442: dup
      // 443: new java/lang/StringBuilder
      // 446: dup
      // 447: invokespecial java/lang/StringBuilder.<init> ()V
      // 44a: sipush 27769
      // 44d: ldc2_w 278915558961490921
      // 450: lload 1
      // 451: lxor
      // 452: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 457: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45a: aload 4
      // 45c: lload 17
      // 45e: invokevirtual com/zelix/_rv.C (J)Ljava/lang/String;
      // 461: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 464: sipush 10270
      // 467: ldc2_w 2829064076447641482
      // 46a: lload 1
      // 46b: lxor
      // 46c: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 471: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 474: aload 35
      // 476: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 479: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 47c: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 47f: athrow
      // 480: astore 35
      // 482: new com/zelix/_sk
      // 485: dup
      // 486: new java/lang/StringBuilder
      // 489: dup
      // 48a: invokespecial java/lang/StringBuilder.<init> ()V
      // 48d: aload 4
      // 48f: lload 17
      // 491: invokevirtual com/zelix/_rv.C (J)Ljava/lang/String;
      // 494: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 497: sipush 24723
      // 49a: ldc2_w 5818918236032771848
      // 49d: lload 1
      // 49e: lxor
      // 49f: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a7: aload 35
      // 4a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4ac: sipush 26468
      // 4af: ldc2_w 2710559318782877942
      // 4b2: lload 1
      // 4b3: lxor
      // 4b4: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4bf: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 4c2: athrow
      // 4c3: astore 35
      // 4c5: new com/zelix/_sk
      // 4c8: dup
      // 4c9: new java/lang/StringBuilder
      // 4cc: dup
      // 4cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 4d0: aload 4
      // 4d2: lload 17
      // 4d4: invokevirtual com/zelix/_rv.C (J)Ljava/lang/String;
      // 4d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4da: sipush 28448
      // 4dd: ldc2_w 2513704036512377013
      // 4e0: lload 1
      // 4e1: lxor
      // 4e2: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4ea: aload 35
      // 4ec: ldc2_w -464585183284513234
      // 4ef: lload 1
      // 4f0: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f8: sipush 26218
      // 4fb: ldc2_w 5211424002435981820
      // 4fe: lload 1
      // 4ff: lxor
      // 500: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 505: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 508: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 50b: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 50e: athrow
      // 50f: astore 49
      // 511: lload 1
      // 512: lconst_0
      // 513: lcmp
      // 514: ifle 537
      // 517: aload 3
      // 518: iload 34
      // 51a: ifeq 52e
      // 51d: ifnull 57d
      // 520: goto 52d
      // 523: ldc2_w -290954934257274477
      // 526: lload 1
      // 527: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52c: athrow
      // 52d: aload 3
      // 52e: ldc2_w -2112416883985265286
      // 531: lload 1
      // 532: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 537: goto 57d
      // 53a: astore 50
      // 53c: new com/zelix/_sk
      // 53f: dup
      // 540: new java/lang/StringBuilder
      // 543: dup
      // 544: invokespecial java/lang/StringBuilder.<init> ()V
      // 547: sipush 17883
      // 54a: ldc2_w 7750552271594750529
      // 54d: lload 1
      // 54e: lxor
      // 54f: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 554: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 557: aload 4
      // 559: lload 17
      // 55b: invokevirtual com/zelix/_rv.C (J)Ljava/lang/String;
      // 55e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 561: sipush 24723
      // 564: ldc2_w 5818918236032771848
      // 567: lload 1
      // 568: lxor
      // 569: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/hu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 571: aload 50
      // 573: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 576: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 579: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 57c: athrow
      // 57d: aload 49
      // 57f: athrow
      // 580: return
   }

   public in D(Object[] var1) {
      String var10 = (String)var1[0];
      String var12 = (String)var1[1];
      ArrayList var11 = (ArrayList)var1[2];
      int var5 = (Integer)var1[3];
      int var6 = (Integer)var1[4];
      long var8 = (Long)var1[5];
      te var4 = (te)var1[6];
      r6[] var13 = (r6[])var1[7];
      List var7 = (List)var1[8];
      _xi var2 = (_xi)var1[9];
      String var14 = (String)var1[10];
      int var3 = (Integer)var1[11];
      var8 = e ^ var8;
      long var15 = var8 ^ 104050617564642L;
      long var17 = var8 ^ 111037334419200L;
      long var19 = (var8 ^ 115944492992934L) >>> 32;
      int var21 = (int)((var8 ^ 115944492992934L) << 32 >>> 32);
      long var22 = var8 ^ 6080253814862L;
      long var24 = var8 ^ 34055733431771L;
      long var10001 = var8 ^ 74465559246948L;
      int var26 = (int)((var8 ^ 74465559246948L) >>> 48);
      int var27 = (int)((var8 ^ 74465559246948L) << 16 >>> 32);
      int var28 = (int)(var10001 << 48 >>> 48);
      long var29 = var8 ^ 17137391613480L;
      be var31 = new be(var17, var11, var4, var14);
      mx var32 = new mx(0, x44.a<"k">(this, -6024342745862956043L, var8), var10);
      var7.add(var32);
      mx var33 = new mx(0, x44.a<"k">(this, -6024342745862956043L, var8), var12);
      var7.add(var33);
      mx var34 = new mx(0, x44.a<"k">(this, -6024342745862956043L, var8), b<"g">(19847, 4137196805169628088L ^ var8));
      var7.add(var34);
      h_ var35 = new h_(var34, var5, var22, var6, var31, var13);
      h4[] var36 = new h4[]{var35};
      in var37 = new in(this, var32, var33, var36, false, var19, var3, var21);
      x44.a<"o">(var37, new Object[]{var15}, -5296986038159553891L, var8);
      Object[] var10004 = new Object[]{null, true};
      var10004[0] = var29;
      x44.a<"o">(var37, var10004, -5988685356718562622L, var8);
      char var10002 = (char)var26;
      Object[] var10006 = new Object[]{null, null, null, Integer.valueOf((char)var28)};
      var10006[2] = var27;
      var10006[1] = Integer.valueOf(var10002);
      var10006[0] = var37;
      x44.a<"i">(this, var10006, -5776454956697742087L, var8);
      x44.a<"o">(var2, new Object[]{var24, var37}, -5666368895112978961L, var8);
      return var37;
   }

   void N(long var1, _8l var3) {
   }

   private synchronized void m(Object[] var1) {
      iy var4 = (iy)var1[0];
      long var2 = (Long)var1[1];
      var2 = e ^ var2;
      iy[] var5 = new iy[this.c + 1];
      System.arraycopy(x44.a<"j">(this, -4940818418301228970L, var2), 0, var5, 0, this.c);
      var5[this.c] = var4;
      x44.a<"n">(var4, new Object[]{this}, -4923302549232618459L, var2);
      x44.a<"u">(this, var5, -4940818418301228970L, var2);
      this.c++;
   }

   private synchronized void U(Object[] var1) {
      in var2 = (in)var1[0];
      int var3 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      int var4 = (Integer)var1[3];
      long var6 = ((long)var3 << 48 | (long)var5 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ e;
      in[] var8 = new in[this.R + 1];
      System.arraycopy(x44.a<"o">(this, -4357109093375743870L, var6), 0, var8, 0, this.R);
      var8[this.R] = var2;
      x44.a<"k">(var2, new Object[]{this}, -4327508311885575048L, var6);
      x44.a<"p">(this, var8, -4357109093375743870L, var6);
      this.R++;
   }

   static {
      long var0 = e ^ 37406649710923L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "ÏG¼ºm\u008f_|\u0092\u0090\tóåÉÆ\u001d+\u001b)\rG\u001bÿÊÚì\u008fÏ\u0018p@] L\u0082ñ¦\u0018j\u00028\u001a¹úä\u0086\u0083l4ÁîÒ\u009eþº¼\u0084?d%tög\u008d¹gÕÙ2\u0093\u0085\u0002rë§åA6û\u008d!\u0085«/²Ý\u0016å{VV/\u0096²F8¤ \u008bmÚ\\\u008cÛ\u000f\u0017X*6¹w;x¦\"\u008eë\u0087ði\u008a½·::Ê¸È+j0Ó/\u0080y\u001c\u007f(í\u0017ù\u0012êâó7âÊ¿h\\ç\u0080ì\u0082cßV\u0082àd#\u00adC\u008c\u008e\\=5RË±\u0092º\u0003cÖâë\u0010ýÖØ\u0013XØ\u0011ú0Þ»\u0004\u0004ÁËë@9¹\u0099hÈ}åp\u0084µ[udÈR\u0015Çu\u0085Þ¦Ü\u0095ñ\u0004/¼c\u0015å\u001c\u0098_g\u000eºãuÛSXçT.ýb-ÛõKG¬\u008d\u0005\r@\u0095§\u0082òJe3\u001d\u0010Ñ¿µÍ\u0099\u0003ã\u0097,jy\u0096\f=\u0015Ù\u0010T\u0099[ëGW\u009d\u0016\u009c:´\u0088\nP¤Ý";
      int var8 = "ÏG¼ºm\u008f_|\u0092\u0090\tóåÉÆ\u001d+\u001b)\rG\u001bÿÊÚì\u008fÏ\u0018p@] L\u0082ñ¦\u0018j\u00028\u001a¹úä\u0086\u0083l4ÁîÒ\u009eþº¼\u0084?d%tög\u008d¹gÕÙ2\u0093\u0085\u0002rë§åA6û\u008d!\u0085«/²Ý\u0016å{VV/\u0096²F8¤ \u008bmÚ\\\u008cÛ\u000f\u0017X*6¹w;x¦\"\u008eë\u0087ði\u008a½·::Ê¸È+j0Ó/\u0080y\u001c\u007f(í\u0017ù\u0012êâó7âÊ¿h\\ç\u0080ì\u0082cßV\u0082àd#\u00adC\u008c\u008e\\=5RË±\u0092º\u0003cÖâë\u0010ýÖØ\u0013XØ\u0011ú0Þ»\u0004\u0004ÁËë@9¹\u0099hÈ}åp\u0084µ[udÈR\u0015Çu\u0085Þ¦Ü\u0095ñ\u0004/¼c\u0015å\u001c\u0098_g\u000eºãuÛSXçT.ýb-ÛõKG¬\u008d\u0005\r@\u0095§\u0082òJe3\u001d\u0010Ñ¿µÍ\u0099\u0003ã\u0097,jy\u0096\f=\u0015Ù\u0010T\u0099[ëGW\u009d\u0016\u009c:´\u0088\nP¤Ý"
         .length();
      char var5 = '(';
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
                     g = var9;
                     h = new String[10];
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

                  var6 = "v\u0016môÛ¡Ù\u0086q¨s\u0092'º¾N8\u0081\u0015Ø\u0083\u00822§h\u00adT9ëá½±\u00169<¼ápÏÀ\u0098w·c\u0083\u0097k»\u0087\u0098\u001a³\u0080H4wM¶y\u0090¬zLè*cö\u00adzï\u0094ù=";
                  var8 = "v\u0016môÛ¡Ù\u0086q¨s\u0092'º¾N8\u0081\u0015Ø\u0083\u00822§h\u00adT9ëá½±\u00169<¼ápÏÀ\u0098w·c\u0083\u0097k»\u0087\u0098\u001a³\u0080H4wM¶y\u0090¬zLè*cö\u00adzï\u0094ù="
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11375;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])o.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/hu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("com/zelix/hu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
