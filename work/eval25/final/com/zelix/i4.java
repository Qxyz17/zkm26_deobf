package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i4 extends i2 {
   private i2[] v;
   private static final long a = ess.a(-9105890089449962674L, 695745730052541462L, MethodHandles.lookup().lookupClass()).a(74837213859122L);
   private static final String c;

   boolean r(Object[] var1) {
      return true;
   }

   public void r(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/util/HashMap
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/util/HashMap
      // 18: astore 5
      // 1a: pop
      // 1b: lload 3
      // 1c: dup2
      // 1d: ldc2_w 0
      // 20: lxor
      // 21: lstore 6
      // 23: pop2
      // 24: ldc2_w -3106693066594656090
      // 27: lload 3
      // 28: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: bipush 0
      // 2e: istore 9
      // 30: istore 8
      // 32: iload 9
      // 34: aload 0
      // 35: ldc2_w -3458130666725894602
      // 38: lload 3
      // 39: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: arraylength
      // 3f: if_icmpge 7c
      // 42: aload 0
      // 43: ldc2_w -3458130666725894602
      // 46: lload 3
      // 47: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: iload 9
      // 4e: aaload
      // 4f: lload 6
      // 51: aload 2
      // 52: aload 5
      // 54: bipush 3
      // 55: anewarray 79
      // 58: dup_x1
      // 59: swap
      // 5a: bipush 2
      // 5b: swap
      // 5c: aastore
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 1
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -3905870472572326763
      // 6e: lload 3
      // 6f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: iinc 9 1
      // 77: iload 8
      // 79: ifeq 32
      // 7c: lload 3
      // 7d: lconst_0
      // 7e: lcmp
      // 7f: iflt 77
      // 82: return
   }

   public void N(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -9204078231132916736
      // 18: lload 2
      // 19: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: bipush 0
      // 1f: istore 7
      // 21: istore 6
      // 23: iload 7
      // 25: aload 0
      // 26: ldc2_w -8888974285856226672
      // 29: lload 2
      // 2a: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: arraylength
      // 30: if_icmpge 60
      // 33: aload 0
      // 34: ldc2_w -8888974285856226672
      // 37: lload 2
      // 38: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: iload 7
      // 3f: aaload
      // 40: lload 4
      // 42: bipush 1
      // 43: anewarray 79
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w -8855412647066353201
      // 52: lload 2
      // 53: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: iinc 7 1
      // 5b: iload 6
      // 5d: ifeq 23
      // 60: lload 2
      // 61: lconst_0
      // 62: lcmp
      // 63: iflt 5b
      // 66: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      int var7 = 1;
      int var10000 = x44.a<"w">(8443967753616639300L, var2);
      var7 += 2;
      int var8 = 0;
      byte var6 = (byte)var10000;

      label30:
      while (true) {
         if (var8 < x44.a<"k">(this, 7834324896332294797L, var2).length) {
            var10000 = var7 + x44.a<"o">(x44.a<"k">(this, 7834324896332294797L, var2)[var8], new Object[]{var4}, 8341412904070076432L, var2);
            if (var2 > 0L) {
               if (var6 == 0) {
                  break;
               }

               var7 = var10000;
               var8++;
               var10000 = var6;
            }

            if (var10000 != 0) {
               continue;
            }
         }

         while (var2 < 0L) {
            if (var6 != 0) {
               continue label30;
            }
         }

         var10000 = var7;
         break;
      }

      return var10000;
   }

   public void s(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 111534839130684
      // 19: lxor
      // 1a: lstore 5
      // 1c: dup2
      // 1d: ldc2_w 0
      // 20: lxor
      // 21: lstore 7
      // 23: pop2
      // 24: aload 4
      // 26: aload 0
      // 27: lload 5
      // 29: bipush 1
      // 2a: anewarray 79
      // 2d: dup_x2
      // 2e: dup_x2
      // 2f: pop
      // 30: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33: bipush 0
      // 34: swap
      // 35: aastore
      // 36: ldc2_w 778665830265632561
      // 39: lload 2
      // 3a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 42: ldc2_w 1654503070477787825
      // 45: lload 2
      // 46: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: aload 4
      // 4d: aload 0
      // 4e: ldc2_w 1303078098874455073
      // 51: lload 2
      // 52: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: arraylength
      // 58: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 5b: bipush 0
      // 5c: istore 10
      // 5e: istore 9
      // 60: iload 10
      // 62: aload 0
      // 63: ldc2_w 1303078098874455073
      // 66: lload 2
      // 67: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: arraylength
      // 6d: if_icmpge a4
      // 70: aload 0
      // 71: ldc2_w 1303078098874455073
      // 74: lload 2
      // 75: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: iload 10
      // 7c: aaload
      // 7d: lload 7
      // 7f: aload 4
      // 81: bipush 2
      // 82: anewarray 79
      // 85: dup_x1
      // 86: swap
      // 87: bipush 1
      // 88: swap
      // 89: aastore
      // 8a: dup_x2
      // 8b: dup_x2
      // 8c: pop
      // 8d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 90: bipush 0
      // 91: swap
      // 92: aastore
      // 93: ldc2_w 1487731694784835769
      // 96: lload 2
      // 97: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: iinc 10 1
      // 9f: iload 9
      // a1: ifeq 60
      // a4: lload 2
      // a5: lconst_0
      // a6: lcmp
      // a7: ifle 9f
      // aa: return
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void B(Object[] var1) {
      long var3 = (Long)var1[0];
      Set var2 = (Set)var1[1];
      long var5 = var3 ^ 13860179763599L;
      long var7 = var3 ^ 0L;
      boolean var9 = x44.a<"r">(-5968474420302013119L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"j">(this, new Object[]{var5}, -5683195001731015253L, var3);
            if (!var9) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var11) {
            throw x44.a<"r">(var11, -6117025695969683520L, var3);
         }

         var10000 = 0;
      }

      int var10 = var10000;

      while (var10 < x44.a<"n">(this, -5423359588685942136L, var3).length) {
         x44.a<"j">(x44.a<"n">(this, -5423359588685942136L, var3)[var10], new Object[]{var7, var2}, -5909839366793002371L, var3);
         var10++;
         if (!var9) {
            break;
         }
      }
   }

   i4(long param1, h8 param3, int param4, _xx param5, _y4 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i4.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 69352449489205
      // 00b: lxor
      // 00c: lstore 7
      // 00e: dup2
      // 00f: ldc2_w 4125546197014
      // 012: lxor
      // 013: lstore 9
      // 015: dup2
      // 016: ldc2_w 76628960431657
      // 019: lxor
      // 01a: lstore 11
      // 01c: dup2
      // 01d: ldc2_w 116470983830580
      // 020: lxor
      // 021: lstore 13
      // 023: dup2
      // 024: ldc2_w 105373365032081
      // 027: lxor
      // 028: lstore 15
      // 02a: dup2
      // 02b: ldc2_w 14273751489038
      // 02e: lxor
      // 02f: lstore 17
      // 031: pop2
      // 032: ldc2_w -9039303853622381849
      // 035: lload 1
      // 036: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: aload 0
      // 03c: aload 3
      // 03d: iload 4
      // 03f: lload 13
      // 041: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 044: aload 5
      // 046: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 049: istore 20
      // 04b: aload 0
      // 04c: iload 20
      // 04e: anewarray 118
      // 051: ldc2_w -7270478742574965458
      // 054: lload 1
      // 055: invokedynamic w (Ljava/lang/Object;[Lcom/zelix/i2;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: istore 19
      // 05c: bipush 0
      // 05d: istore 21
      // 05f: iload 21
      // 061: iload 20
      // 063: if_icmpge 15a
      // 066: lload 15
      // 068: aload 0
      // 069: aload 5
      // 06b: aload 6
      // 06d: bipush 4
      // 06e: anewarray 79
      // 071: dup_x1
      // 072: swap
      // 073: bipush 3
      // 074: swap
      // 075: aastore
      // 076: dup_x1
      // 077: swap
      // 078: bipush 2
      // 079: swap
      // 07a: aastore
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 1
      // 07e: swap
      // 07f: aastore
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 0
      // 087: swap
      // 088: aastore
      // 089: ldc2_w -9182664771410906972
      // 08c: lload 1
      // 08d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: astore 22
      // 094: iload 19
      // 096: lload 1
      // 097: lconst_0
      // 098: lcmp
      // 099: iflt 157
      // 09c: ifeq 155
      // 09f: aload 22
      // 0a1: lload 11
      // 0a3: bipush 1
      // 0a4: anewarray 79
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w -7023515990391770611
      // 0b3: lload 1
      // 0b4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: ifne 143
      // 0bc: goto 0c9
      // 0bf: ldc2_w -8881735479839786906
      // 0c2: lload 1
      // 0c3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: bipush 0
      // 0cb: lload 9
      // 0cd: bipush 2
      // 0ce: anewarray 79
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 1
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x1
      // 0db: swap
      // 0dc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: ldc2_w -9022122776942289569
      // 0e5: lload 1
      // 0e6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: aload 0
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: getstatic com/zelix/i4.c Ljava/lang/String;
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: aload 22
      // 0fb: lload 17
      // 0fd: bipush 1
      // 0fe: anewarray 79
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: ldc2_w -8812631245650103406
      // 10d: lload 1
      // 10e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 119: lload 7
      // 11b: dup2_x1
      // 11c: pop2
      // 11d: bipush 2
      // 11e: anewarray 79
      // 121: dup_x1
      // 122: swap
      // 123: bipush 1
      // 124: swap
      // 125: aastore
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: ldc2_w -7127795714275076511
      // 132: lload 1
      // 133: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: return
      // 139: ldc2_w -8881735479839786906
      // 13c: lload 1
      // 13d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: aload 0
      // 144: ldc2_w -7270478742574965458
      // 147: lload 1
      // 148: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: iload 21
      // 14f: aload 22
      // 151: aastore
      // 152: iinc 21 1
      // 155: iload 19
      // 157: ifne 05f
      // 15a: return
   }

   public void Y(Object[] param1) {
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
      // 04: checkcast java/util/Set
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/Set
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/util/Set
      // 17: astore 2
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: lstore 5
      // 23: dup
      // 24: bipush 4
      // 25: aaload
      // 26: checkcast java/util/Set
      // 29: astore 3
      // 2a: pop
      // 2b: lload 5
      // 2d: dup2
      // 2e: ldc2_w 0
      // 31: lxor
      // 32: lstore 8
      // 34: pop2
      // 35: ldc2_w 1887524154404252251
      // 38: lload 5
      // 3a: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: bipush 0
      // 40: istore 11
      // 42: istore 10
      // 44: iload 11
      // 46: aload 0
      // 47: ldc2_w 262957160486585746
      // 4a: lload 5
      // 4c: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: arraylength
      // 52: if_icmpge 9e
      // 55: aload 0
      // 56: ldc2_w 262957160486585746
      // 59: lload 5
      // 5b: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: iload 11
      // 62: aaload
      // 63: aload 7
      // 65: aload 4
      // 67: aload 2
      // 68: lload 8
      // 6a: aload 3
      // 6b: bipush 5
      // 6c: anewarray 79
      // 6f: dup_x1
      // 70: swap
      // 71: bipush 4
      // 72: swap
      // 73: aastore
      // 74: dup_x2
      // 75: dup_x2
      // 76: pop
      // 77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7a: bipush 3
      // 7b: swap
      // 7c: aastore
      // 7d: dup_x1
      // 7e: swap
      // 7f: bipush 2
      // 80: swap
      // 81: aastore
      // 82: dup_x1
      // 83: swap
      // 84: bipush 1
      // 85: swap
      // 86: aastore
      // 87: dup_x1
      // 88: swap
      // 89: bipush 0
      // 8a: swap
      // 8b: aastore
      // 8c: ldc2_w 1858952226571036198
      // 8f: lload 5
      // 91: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: iinc 11 1
      // 99: iload 10
      // 9b: ifne 44
      // 9e: lload 5
      // a0: lconst_0
      // a1: lcmp
      // a2: ifle 99
      // a5: return
   }

   public void N(long param1, _8l param3) {
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
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w -6348162585463318644
      // 0c: lload 1
      // 0d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: bipush 0
      // 13: istore 7
      // 15: istore 6
      // 17: iload 7
      // 19: aload 0
      // 1a: ldc2_w -4723949660035188667
      // 1d: lload 1
      // 1e: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: arraylength
      // 24: if_icmpge 42
      // 27: aload 0
      // 28: ldc2_w -4723949660035188667
      // 2b: lload 1
      // 2c: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: iload 7
      // 33: aaload
      // 34: lload 4
      // 36: aload 3
      // 37: invokevirtual com/zelix/i2.N (JLcom/zelix/_8l;)V
      // 3a: iinc 7 1
      // 3d: iload 6
      // 3f: ifne 17
      // 42: lload 1
      // 43: lconst_0
      // 44: lcmp
      // 45: ifle 3d
      // 48: return
   }

   public void p(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 864055557601181625
      // 18: lload 2
      // 19: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: bipush 0
      // 1f: istore 7
      // 21: istore 6
      // 23: iload 7
      // 25: aload 0
      // 26: ldc2_w 1089082300636514601
      // 29: lload 2
      // 2a: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: arraylength
      // 30: if_icmpge 60
      // 33: aload 0
      // 34: ldc2_w 1089082300636514601
      // 37: lload 2
      // 38: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: iload 7
      // 3f: aaload
      // 40: lload 4
      // 42: bipush 1
      // 43: anewarray 79
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w 624436350458718719
      // 52: lload 2
      // 53: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: iinc 7 1
      // 5b: iload 6
      // 5d: ifeq 23
      // 60: lload 2
      // 61: lconst_0
      // 62: lcmp
      // 63: iflt 5b
      // 66: return
   }

   String Q(Object[] param1) {
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
      // 00e: ldc2_w 0
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: aconst_null
      // 016: astore 7
      // 018: ldc2_w 1569171828397647276
      // 01b: lload 2
      // 01c: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: bipush 0
      // 022: istore 8
      // 024: istore 6
      // 026: iload 8
      // 028: aload 0
      // 029: ldc2_w 887546014884416101
      // 02c: lload 2
      // 02d: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: arraylength
      // 033: if_icmpge 105
      // 036: iload 6
      // 038: lload 2
      // 039: lconst_0
      // 03a: lcmp
      // 03b: ifle 043
      // 03e: ifeq 144
      // 041: iload 8
      // 043: ifne 0a3
      // 046: goto 053
      // 049: ldc2_w 1438509600438480685
      // 04c: lload 2
      // 04d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: aload 0
      // 054: ldc2_w 887546014884416101
      // 057: lload 2
      // 058: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: iload 8
      // 05f: aaload
      // 060: lload 4
      // 062: bipush 1
      // 063: anewarray 79
      // 066: dup_x2
      // 067: dup_x2
      // 068: pop
      // 069: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06c: bipush 0
      // 06d: swap
      // 06e: aastore
      // 06f: ldc2_w 760436741570560152
      // 072: lload 2
      // 073: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: astore 7
      // 07a: iload 6
      // 07c: lload 2
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: ifle 102
      // 082: ifeq 100
      // 085: aload 7
      // 087: ifnonnull 0fd
      // 08a: goto 097
      // 08d: ldc2_w 1438509600438480685
      // 090: lload 2
      // 091: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: aconst_null
      // 098: areturn
      // 099: ldc2_w 1438509600438480685
      // 09c: lload 2
      // 09d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: ldc2_w 887546014884416101
      // 0a7: lload 2
      // 0a8: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: iload 8
      // 0af: aaload
      // 0b0: lload 4
      // 0b2: bipush 1
      // 0b3: anewarray 79
      // 0b6: dup_x2
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bc: bipush 0
      // 0bd: swap
      // 0be: aastore
      // 0bf: ldc2_w 760436741570560152
      // 0c2: lload 2
      // 0c3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: astore 9
      // 0ca: aload 9
      // 0cc: lload 2
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: iflt 0e9
      // 0d2: iload 6
      // 0d4: ifeq 0e9
      // 0d7: ifnull 0f1
      // 0da: goto 0e7
      // 0dd: ldc2_w 1438509600438480685
      // 0e0: lload 2
      // 0e1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: aload 9
      // 0eb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ee: ifne 0fd
      // 0f1: aconst_null
      // 0f2: areturn
      // 0f3: ldc2_w 1438509600438480685
      // 0f6: lload 2
      // 0f7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: iinc 8 1
      // 100: iload 6
      // 102: ifne 026
      // 105: aload 7
      // 107: lload 2
      // 108: lconst_0
      // 109: lcmp
      // 10a: ifle 0c8
      // 10d: iload 6
      // 10f: ifeq 143
      // 112: ifnull 144
      // 115: goto 122
      // 118: ldc2_w 1438509600438480685
      // 11b: lload 2
      // 11c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: new java/lang/StringBuilder
      // 125: dup
      // 126: invokespecial java/lang/StringBuilder.<init> ()V
      // 129: ldc "["
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: aload 7
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 133: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 136: goto 143
      // 139: ldc2_w 1438509600438480685
      // 13c: lload 2
      // 13d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: areturn
      // 144: aconst_null
      // 145: areturn
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public void k(Object[] param1) {
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
      // 04: checkcast com/zelix/_ug
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
      // 16: checkcast com/zelix/ei
      // 19: astore 6
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 3
      // 22: pop
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w -2380776427528786273
      // 30: lload 4
      // 32: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: bipush 0
      // 38: istore 10
      // 3a: istore 9
      // 3c: iload 10
      // 3e: aload 0
      // 3f: ldc2_w -4079650617397935786
      // 42: lload 4
      // 44: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: arraylength
      // 4a: if_icmpge 8f
      // 4d: aload 0
      // 4e: ldc2_w -4079650617397935786
      // 51: lload 4
      // 53: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: iload 10
      // 5a: aaload
      // 5b: aload 2
      // 5c: lload 7
      // 5e: aload 6
      // 60: aload 3
      // 61: bipush 4
      // 62: anewarray 79
      // 65: dup_x1
      // 66: swap
      // 67: bipush 3
      // 68: swap
      // 69: aastore
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 2
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 1
      // 76: swap
      // 77: aastore
      // 78: dup_x1
      // 79: swap
      // 7a: bipush 0
      // 7b: swap
      // 7c: aastore
      // 7d: ldc2_w -2789298174820095435
      // 80: lload 4
      // 82: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 10 1
      // 8a: iload 9
      // 8c: ifne 3c
      // 8f: lload 4
      // 91: lconst_0
      // 92: lcmp
      // 93: ifle 8a
      // 96: return
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
   }

   i2[] m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -1679482038209925499L, var2);
   }

   public void J(Object[] param1) {
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
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/util/Map
      // 18: astore 6
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/_ur
      // 20: astore 5
      // 22: pop
      // 23: lload 3
      // 24: dup2
      // 25: ldc2_w 0
      // 28: lxor
      // 29: lstore 7
      // 2b: dup2
      // 2c: ldc2_w 129683512282286
      // 2f: lxor
      // 30: lstore 9
      // 32: pop2
      // 33: ldc2_w -5735359121590942685
      // 36: lload 3
      // 37: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: aload 2
      // 3d: aload 0
      // 3e: lload 9
      // 40: bipush 1
      // 41: anewarray 79
      // 44: dup_x2
      // 45: dup_x2
      // 46: pop
      // 47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a: bipush 0
      // 4b: swap
      // 4c: aastore
      // 4d: ldc2_w -6026818023045852765
      // 50: lload 3
      // 51: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 59: istore 11
      // 5b: aload 2
      // 5c: aload 0
      // 5d: ldc2_w -5438265726398270797
      // 60: lload 3
      // 61: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: arraylength
      // 67: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 6a: bipush 0
      // 6b: istore 12
      // 6d: iload 12
      // 6f: aload 0
      // 70: ldc2_w -5438265726398270797
      // 73: lload 3
      // 74: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: arraylength
      // 7a: if_icmpge be
      // 7d: aload 0
      // 7e: ldc2_w -5438265726398270797
      // 81: lload 3
      // 82: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/i2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iload 12
      // 89: aaload
      // 8a: aload 2
      // 8b: lload 7
      // 8d: aload 6
      // 8f: aload 5
      // 91: bipush 4
      // 92: anewarray 79
      // 95: dup_x1
      // 96: swap
      // 97: bipush 3
      // 98: swap
      // 99: aastore
      // 9a: dup_x1
      // 9b: swap
      // 9c: bipush 2
      // 9d: swap
      // 9e: aastore
      // 9f: dup_x2
      // a0: dup_x2
      // a1: pop
      // a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a5: bipush 1
      // a6: swap
      // a7: aastore
      // a8: dup_x1
      // a9: swap
      // aa: bipush 0
      // ab: swap
      // ac: aastore
      // ad: ldc2_w -5471663062566679087
      // b0: lload 3
      // b1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: iinc 12 1
      // b9: iload 11
      // bb: ifeq 6d
      // be: lload 3
      // bf: lconst_0
      // c0: lcmp
      // c1: ifle b9
      // c4: return
   }

   static {
      long var0 = a ^ 102668263699200L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÜÚ¯\u0080p½\u0094\u0003r\u0082\u0092\u0014¯@s?\u0090\u00040d\nÊ\u00advÕVåBy\u0081t\u001d".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      c = var5;
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
}
