package com.zelix;

import java.io.DataOutputStream;
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

public class j9 extends j1 implements gm, hj {
   final tg v;
   xm f;
   private static final long a = prr.a(-3704993108232601656L, 8315902171330890903L, MethodHandles.lookup().lookupClass()).a(8797589179755L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   void O(DataOutputStream param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: dup2
      // 002: ldc2_w 134392187328166
      // 005: lxor
      // 006: lstore 4
      // 008: pop2
      // 009: ldc2_w -509579923954426359
      // 00c: lload 2
      // 00d: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012: aload 1
      // 013: ldc2_w -249228105775542599
      // 016: lload 2
      // 017: invokedynamic m (JJ)Lcom/zelix/va; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01c: invokevirtual com/zelix/va.g ()I
      // 01f: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 022: istore 6
      // 024: aload 1
      // 025: aload 0
      // 026: ldc2_w -459810606581667793
      // 029: lload 2
      // 02a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: lload 4
      // 031: bipush 1
      // 032: anewarray 192
      // 035: dup_x2
      // 036: dup_x2
      // 037: pop
      // 038: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03b: bipush 0
      // 03c: swap
      // 03d: aastore
      // 03e: ldc2_w -191468325577463865
      // 041: lload 2
      // 042: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 04a: iload 6
      // 04c: ifne 0c0
      // 04f: ldc2_w -96777485539684519
      // 052: lload 2
      // 053: invokedynamic m (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: aload 0
      // 059: ldc2_w -459810606581667793
      // 05c: lload 2
      // 05d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: invokevirtual com/zelix/tg.ordinal ()I
      // 065: iaload
      // 066: tableswitch 166 1 9 60 60 60 60 101 101 101 101 136
      // 098: ldc2_w -2027361445937606888
      // 09b: lload 2
      // 09c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 1
      // 0a3: aload 0
      // 0a4: ldc2_w -506016100408545436
      // 0a7: lload 2
      // 0a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: invokevirtual com/zelix/xm.E ()I
      // 0b0: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0b3: goto 0c0
      // 0b6: ldc2_w -2027361445937606888
      // 0b9: lload 2
      // 0ba: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: iload 6
      // 0c2: lload 2
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: iflt 0de
      // 0c8: ifeq 10c
      // 0cb: aload 1
      // 0cc: aload 0
      // 0cd: ldc2_w -506016100408545436
      // 0d0: lload 2
      // 0d1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: invokevirtual com/zelix/xm.E ()I
      // 0d9: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0dc: iload 6
      // 0de: ifeq 10c
      // 0e1: goto 0ee
      // 0e4: ldc2_w -2027361445937606888
      // 0e7: lload 2
      // 0e8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 1
      // 0ef: aload 0
      // 0f0: ldc2_w -506016100408545436
      // 0f3: lload 2
      // 0f4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: invokevirtual com/zelix/xm.E ()I
      // 0fc: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0ff: goto 10c
      // 102: ldc2_w -2027361445937606888
      // 105: lload 2
      // 106: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: return
   }

   j9(long var1, int var3, to var4, tg var5, xm var6) {
      var1 = a ^ var1;
      super(var3, var4);
      this.v = var5;
      m44.a<"r">(this, var6, -6562525357615058061L, var1);
   }

   public boolean e(long var1, gu var3, Object var4, Object var5) {
      long var6 = var1 ^ 12215597448316L;
      return var3.K(this, var4, var6, var5);
   }

   private boolean b(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var5 = ((long)var2 << 48 | (long)var4 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 26941517544021L;
      int var9 = m44.a<"l">(-5253265019932388868L, var5);

      try {
         int var10000 = m44.a<"h">(-5666353044144422740L, var5)[m44.a<"r">(this, -5302055905636292646L, var5).ordinal()];
         if (var9 != 0) {
            return (boolean)var10000;
         } else {
            switch (var10000) {
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 9:
                  return (boolean)0;
               case 2:
               case 4:
               case 6:
                  return true;
               default:
                  throw new n9(
                     b<"w">(1454, 7007415945105478779L ^ var5)
                        + m44.a<"r">(this, -5302055905636292646L, var5)
                        + b<"w">(19375, 5319257389874436729L ^ var5)
                        + this.L(var7)
                  );
            }
         }
      } catch (n9 var10) {
         throw m44.a<"l">(var10, -6041472179568754451L, var5);
      }
   }

   public String e(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 97378392447521L;
      int var4 = (int)((var2 ^ 97378392447521L) >>> 32);
      int var5 = (int)((var2 ^ 97378392447521L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return m44.a<"p">(this, 5599459656691456555L, var2).b(var4, (short)var5, (short)var6) + (int)e + m44.a<"p">(this, 5599459656691456555L, var2).R();
   }

   public boolean W(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/j9.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -1422613869339243867
      // 15: lload 2
      // 16: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: ldc2_w -1584023964884280331
      // 23: lload 2
      // 24: invokedynamic i (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: aload 0
      // 2a: ldc2_w -1354972932672766845
      // 2d: lload 2
      // 2e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: invokevirtual com/zelix/tg.ordinal ()I
      // 36: iaload
      // 37: iload 4
      // 39: ifne a2
      // 3c: tableswitch 100 1 9 62 62 62 62 80 80 80 80 94
      // 70: ldc2_w -616682558676395084
      // 73: lload 2
      // 74: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: iload 4
      // 7c: ifeq a0
      // 7f: goto 8c
      // 82: ldc2_w -616682558676395084
      // 85: lload 2
      // 86: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: bipush 1
      // 8d: istore 5
      // 8f: iload 4
      // 91: lload 2
      // 92: lconst_0
      // 93: lcmp
      // 94: iflt 9b
      // 97: ifeq a0
      // 9a: bipush 1
      // 9b: istore 5
      // 9d: goto a0
      // a0: iload 5
      // a2: ireturn
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"u">(this, 4978785852029571718L, var2).v();
   }

   public b0 k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, 557172572741095461L, var2).G();
   }

   public String b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"p">(this, -5905002997315569261L, var2).R();
   }

   xm I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"p">(this, 8159785563570284195L, var2);
   }

   public void T(Object[] param1) {
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
      // 04: checkcast com/zelix/xm
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/xm
      // 19: astore 4
      // 1b: pop
      // 1c: ldc2_w 3971612704010432097
      // 1f: lload 2
      // 20: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 56
      // 2d: ldc2_w 3008988334572371548
      // 30: lload 2
      // 31: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 5
      // 38: if_acmpne 61
      // 3b: goto 48
      // 3e: ldc2_w 3667348993155718688
      // 41: lload 2
      // 42: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: goto 56
      // 4c: ldc2_w 3667348993155718688
      // 4f: lload 2
      // 50: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 4
      // 58: ldc2_w 3008988334572371548
      // 5b: lload 2
      // 5c: invokedynamic u (Ljava/lang/Object;Lcom/zelix/xm;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: return
   }

   public void C(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 7
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 5
      // 02a: pop
      // 02b: getstatic com/zelix/j9.a J
      // 02e: lload 3
      // 02f: lxor
      // 030: lstore 3
      // 031: lload 3
      // 032: dup2
      // 033: ldc2_w 45205040444349
      // 036: lxor
      // 037: lstore 8
      // 039: dup2
      // 03a: ldc2_w 49292493958482
      // 03d: lxor
      // 03e: dup2
      // 03f: bipush 48
      // 041: lushr
      // 042: l2i
      // 043: istore 10
      // 045: dup2
      // 046: bipush 16
      // 048: lshl
      // 049: bipush 48
      // 04b: lushr
      // 04c: l2i
      // 04d: istore 11
      // 04f: dup2
      // 050: bipush 32
      // 052: lshl
      // 053: bipush 32
      // 055: lushr
      // 056: l2i
      // 057: istore 12
      // 059: pop2
      // 05a: dup2
      // 05b: ldc2_w 26555338316538
      // 05e: lxor
      // 05f: lstore 13
      // 061: dup2
      // 062: ldc2_w 95015028573358
      // 065: lxor
      // 066: dup2
      // 067: bipush 32
      // 069: lushr
      // 06a: l2i
      // 06b: istore 15
      // 06d: dup2
      // 06e: bipush 32
      // 070: lshl
      // 071: bipush 48
      // 073: lushr
      // 074: l2i
      // 075: istore 16
      // 077: dup2
      // 078: bipush 48
      // 07a: lshl
      // 07b: bipush 48
      // 07d: lushr
      // 07e: l2i
      // 07f: istore 17
      // 081: pop2
      // 082: dup2
      // 083: ldc2_w 48291768393031
      // 086: lxor
      // 087: lstore 18
      // 089: pop2
      // 08a: ldc2_w 1001587325412594841
      // 08d: lload 3
      // 08e: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 0
      // 094: ldc2_w 1385499108625794212
      // 097: lload 3
      // 098: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: iload 15
      // 09f: iload 16
      // 0a1: i2s
      // 0a2: iload 17
      // 0a4: i2s
      // 0a5: invokevirtual com/zelix/xm.b (ISS)Ljava/lang/String;
      // 0a8: astore 21
      // 0aa: istore 20
      // 0ac: aconst_null
      // 0ad: astore 22
      // 0af: aload 21
      // 0b1: iload 20
      // 0b3: ifeq 0da
      // 0b6: ldc "["
      // 0b8: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0bb: ifne 1a8
      // 0be: goto 0cb
      // 0c1: ldc2_w 584712110418093272
      // 0c4: lload 3
      // 0c5: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 21
      // 0cd: goto 0da
      // 0d0: ldc2_w 584712110418093272
      // 0d3: lload 3
      // 0d4: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: lload 8
      // 0dc: invokestatic com/zelix/l62.B (Ljava/lang/String;J)Lcom/zelix/_f;
      // 0df: astore 22
      // 0e1: lload 3
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: ifle 12d
      // 0e7: aload 22
      // 0e9: iload 20
      // 0eb: ifeq 12b
      // 0ee: ifnull 1a8
      // 0f1: goto 0fe
      // 0f4: ldc2_w 584712110418093272
      // 0f7: lload 3
      // 0f8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: aload 22
      // 101: lload 18
      // 103: bipush 2
      // 104: anewarray 192
      // 107: dup_x2
      // 108: dup_x2
      // 109: pop
      // 10a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10d: bipush 1
      // 10e: swap
      // 10f: aastore
      // 110: dup_x1
      // 111: swap
      // 112: bipush 0
      // 113: swap
      // 114: aastore
      // 115: ldc2_w 1646212482032881385
      // 118: lload 3
      // 119: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_f; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: goto 12b
      // 121: ldc2_w 584712110418093272
      // 124: lload 3
      // 125: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: astore 22
      // 12d: aload 0
      // 12e: iload 10
      // 130: i2c
      // 131: iload 11
      // 133: i2s
      // 134: iload 12
      // 136: bipush 3
      // 137: anewarray 192
      // 13a: dup_x1
      // 13b: swap
      // 13c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13f: bipush 2
      // 140: swap
      // 141: aastore
      // 142: dup_x1
      // 143: swap
      // 144: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 147: bipush 1
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w 1453561111868038785
      // 155: lload 3
      // 156: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: iload 20
      // 15d: ifeq 1a7
      // 160: ifeq 192
      // 163: goto 170
      // 166: ldc2_w 584712110418093272
      // 169: lload 3
      // 16a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: aload 7
      // 172: aload 22
      // 174: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 179: pop
      // 17a: iload 20
      // 17c: lload 3
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: ifle 1bf
      // 182: ifne 1a8
      // 185: goto 192
      // 188: ldc2_w 584712110418093272
      // 18b: lload 3
      // 18c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: aload 2
      // 193: aload 22
      // 195: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 19a: goto 1a7
      // 19d: ldc2_w 584712110418093272
      // 1a0: lload 3
      // 1a1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: pop
      // 1a8: ldc2_w 1542518552192427161
      // 1ab: lload 3
      // 1ac: invokedynamic m (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: aload 0
      // 1b2: ldc2_w 1323602680726799343
      // 1b5: lload 3
      // 1b6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: invokevirtual com/zelix/tg.ordinal ()I
      // 1be: iaload
      // 1bf: tableswitch 754 1 9 49 49 49 49 408 408 408 408 408
      // 1f0: aload 0
      // 1f1: ldc2_w 1385499108625794212
      // 1f4: lload 3
      // 1f5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: invokevirtual com/zelix/xm.G ()Lcom/zelix/b0;
      // 1fd: checkcast com/zelix/b4
      // 200: astore 23
      // 202: aload 23
      // 204: lload 3
      // 205: lconst_0
      // 206: lcmp
      // 207: iflt 221
      // 20a: iload 20
      // 20c: ifeq 221
      // 20f: ifnull 4b1
      // 212: goto 21f
      // 215: ldc2_w 584712110418093272
      // 218: lload 3
      // 219: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: athrow
      // 21f: aload 23
      // 221: lload 3
      // 222: lconst_0
      // 223: lcmp
      // 224: ifle 25b
      // 227: invokevirtual com/zelix/b4.J ()Z
      // 22a: iload 20
      // 22c: ifeq 258
      // 22f: ifeq 4b1
      // 232: goto 23f
      // 235: ldc2_w 584712110418093272
      // 238: lload 3
      // 239: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: athrow
      // 23f: aload 6
      // 241: aload 23
      // 243: checkcast com/zelix/bf
      // 246: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 24b: goto 258
      // 24e: ldc2_w 584712110418093272
      // 251: lload 3
      // 252: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: athrow
      // 258: pop
      // 259: aload 23
      // 25b: lload 13
      // 25d: invokevirtual com/zelix/b4.G (J)Lcom/zelix/_v;
      // 260: checkcast com/zelix/_f
      // 263: astore 24
      // 265: aload 22
      // 267: iload 20
      // 269: ifeq 2d5
      // 26c: ifnull 2a8
      // 26f: goto 27c
      // 272: ldc2_w 584712110418093272
      // 275: lload 3
      // 276: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: athrow
      // 27c: lload 3
      // 27d: lconst_0
      // 27e: lcmp
      // 27f: iflt 2d7
      // 282: aload 24
      // 284: iload 20
      // 286: ifeq 2d5
      // 289: goto 296
      // 28c: ldc2_w 584712110418093272
      // 28f: lload 3
      // 290: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: aload 22
      // 298: if_acmpeq 352
      // 29b: goto 2a8
      // 29e: ldc2_w 584712110418093272
      // 2a1: lload 3
      // 2a2: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: aload 0
      // 2a9: aload 24
      // 2ab: lload 18
      // 2ad: bipush 2
      // 2ae: anewarray 192
      // 2b1: dup_x2
      // 2b2: dup_x2
      // 2b3: pop
      // 2b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b7: bipush 1
      // 2b8: swap
      // 2b9: aastore
      // 2ba: dup_x1
      // 2bb: swap
      // 2bc: bipush 0
      // 2bd: swap
      // 2be: aastore
      // 2bf: ldc2_w 1646212482032881385
      // 2c2: lload 3
      // 2c3: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_f; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: goto 2d5
      // 2cb: ldc2_w 584712110418093272
      // 2ce: lload 3
      // 2cf: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: astore 24
      // 2d7: aload 0
      // 2d8: iload 10
      // 2da: i2c
      // 2db: iload 11
      // 2dd: i2s
      // 2de: iload 12
      // 2e0: bipush 3
      // 2e1: anewarray 192
      // 2e4: dup_x1
      // 2e5: swap
      // 2e6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e9: bipush 2
      // 2ea: swap
      // 2eb: aastore
      // 2ec: dup_x1
      // 2ed: swap
      // 2ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f1: bipush 1
      // 2f2: swap
      // 2f3: aastore
      // 2f4: dup_x1
      // 2f5: swap
      // 2f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f9: bipush 0
      // 2fa: swap
      // 2fb: aastore
      // 2fc: ldc2_w 1453561111868038785
      // 2ff: lload 3
      // 300: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: iload 20
      // 307: ifeq 351
      // 30a: ifeq 33c
      // 30d: goto 31a
      // 310: ldc2_w 584712110418093272
      // 313: lload 3
      // 314: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: athrow
      // 31a: aload 7
      // 31c: aload 24
      // 31e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 323: pop
      // 324: iload 20
      // 326: lload 3
      // 327: lconst_0
      // 328: lcmp
      // 329: ifle 354
      // 32c: ifne 352
      // 32f: goto 33c
      // 332: ldc2_w 584712110418093272
      // 335: lload 3
      // 336: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: athrow
      // 33c: aload 2
      // 33d: aload 24
      // 33f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 344: goto 351
      // 347: ldc2_w 584712110418093272
      // 34a: lload 3
      // 34b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: athrow
      // 351: pop
      // 352: iload 20
      // 354: ifne 4b1
      // 357: aload 0
      // 358: ldc2_w 1385499108625794212
      // 35b: lload 3
      // 35c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: invokevirtual com/zelix/xm.G ()Lcom/zelix/b0;
      // 364: checkcast com/zelix/b1
      // 367: astore 24
      // 369: aload 24
      // 36b: lload 3
      // 36c: lconst_0
      // 36d: lcmp
      // 36e: ifle 388
      // 371: iload 20
      // 373: ifeq 388
      // 376: ifnull 4b1
      // 379: goto 386
      // 37c: ldc2_w 584712110418093272
      // 37f: lload 3
      // 380: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: aload 24
      // 388: invokevirtual com/zelix/b1.J ()Z
      // 38b: iload 20
      // 38d: ifeq 3b9
      // 390: ifeq 4b1
      // 393: goto 3a0
      // 396: ldc2_w 584712110418093272
      // 399: lload 3
      // 39a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: athrow
      // 3a0: aload 5
      // 3a2: aload 24
      // 3a4: checkcast com/zelix/bn
      // 3a7: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 3ac: goto 3b9
      // 3af: ldc2_w 584712110418093272
      // 3b2: lload 3
      // 3b3: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b8: athrow
      // 3b9: istore 25
      // 3bb: aload 24
      // 3bd: lload 13
      // 3bf: invokevirtual com/zelix/b1.G (J)Lcom/zelix/_v;
      // 3c2: checkcast com/zelix/_f
      // 3c5: astore 26
      // 3c7: aload 22
      // 3c9: iload 20
      // 3cb: ifeq 437
      // 3ce: ifnull 40a
      // 3d1: goto 3de
      // 3d4: ldc2_w 584712110418093272
      // 3d7: lload 3
      // 3d8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: athrow
      // 3de: lload 3
      // 3df: lconst_0
      // 3e0: lcmp
      // 3e1: ifle 439
      // 3e4: aload 26
      // 3e6: iload 20
      // 3e8: ifeq 437
      // 3eb: goto 3f8
      // 3ee: ldc2_w 584712110418093272
      // 3f1: lload 3
      // 3f2: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: athrow
      // 3f8: aload 22
      // 3fa: if_acmpeq 4ae
      // 3fd: goto 40a
      // 400: ldc2_w 584712110418093272
      // 403: lload 3
      // 404: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 409: athrow
      // 40a: aload 0
      // 40b: aload 22
      // 40d: lload 18
      // 40f: bipush 2
      // 410: anewarray 192
      // 413: dup_x2
      // 414: dup_x2
      // 415: pop
      // 416: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 419: bipush 1
      // 41a: swap
      // 41b: aastore
      // 41c: dup_x1
      // 41d: swap
      // 41e: bipush 0
      // 41f: swap
      // 420: aastore
      // 421: ldc2_w 1646212482032881385
      // 424: lload 3
      // 425: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_f; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42a: goto 437
      // 42d: ldc2_w 584712110418093272
      // 430: lload 3
      // 431: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 436: athrow
      // 437: astore 22
      // 439: aload 0
      // 43a: iload 10
      // 43c: i2c
      // 43d: iload 11
      // 43f: i2s
      // 440: iload 12
      // 442: bipush 3
      // 443: anewarray 192
      // 446: dup_x1
      // 447: swap
      // 448: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 44b: bipush 2
      // 44c: swap
      // 44d: aastore
      // 44e: dup_x1
      // 44f: swap
      // 450: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 453: bipush 1
      // 454: swap
      // 455: aastore
      // 456: dup_x1
      // 457: swap
      // 458: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 45b: bipush 0
      // 45c: swap
      // 45d: aastore
      // 45e: ldc2_w 1453561111868038785
      // 461: lload 3
      // 462: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 467: iload 20
      // 469: ifeq 4ad
      // 46c: ifeq 498
      // 46f: goto 47c
      // 472: ldc2_w 584712110418093272
      // 475: lload 3
      // 476: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47b: athrow
      // 47c: aload 7
      // 47e: aload 26
      // 480: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 485: pop
      // 486: iload 20
      // 488: ifne 4ae
      // 48b: goto 498
      // 48e: ldc2_w 584712110418093272
      // 491: lload 3
      // 492: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 497: athrow
      // 498: aload 2
      // 499: aload 26
      // 49b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 4a0: goto 4ad
      // 4a3: ldc2_w 584712110418093272
      // 4a6: lload 3
      // 4a7: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ac: athrow
      // 4ad: pop
      // 4ae: goto 4b1
      // 4b1: return
   }

   boolean G(Object[] param1) {
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
      // 004: checkcast com/zelix/tg
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/xm
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/j9.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 29172791786399
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 76548578938645
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 129777016465711
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
      // 053: ldc2_w -4707186640472188856
      // 056: lload 2
      // 057: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: istore 13
      // 05e: aload 0
      // 05f: iload 13
      // 061: ifne 08d
      // 064: ldc2_w -4620902389543047570
      // 067: lload 2
      // 068: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 5
      // 06f: if_acmpne 110
      // 072: goto 07f
      // 075: ldc2_w -6513206770013877927
      // 078: lload 2
      // 079: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 0
      // 080: goto 08d
      // 083: ldc2_w -6513206770013877927
      // 086: lload 2
      // 087: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: ldc2_w -4703050507165144795
      // 090: lload 2
      // 091: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: lload 8
      // 098: invokevirtual com/zelix/xm.A (J)Lcom/zelix/va;
      // 09b: aload 4
      // 09d: lload 8
      // 09f: invokevirtual com/zelix/xm.A (J)Lcom/zelix/va;
      // 0a2: invokevirtual com/zelix/va.equals (Ljava/lang/Object;)Z
      // 0a5: iload 13
      // 0a7: ifne 111
      // 0aa: ifeq 110
      // 0ad: goto 0ba
      // 0b0: ldc2_w -6513206770013877927
      // 0b3: lload 2
      // 0b4: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: ldc2_w -4703050507165144795
      // 0be: lload 2
      // 0bf: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: aload 4
      // 0c6: iload 10
      // 0c8: iload 11
      // 0ca: i2s
      // 0cb: iload 12
      // 0cd: i2s
      // 0ce: invokevirtual com/zelix/xm.b (ISS)Ljava/lang/String;
      // 0d1: aload 4
      // 0d3: invokevirtual com/zelix/xm.R ()Ljava/lang/String;
      // 0d6: lload 6
      // 0d8: dup2_x1
      // 0d9: pop2
      // 0da: aload 4
      // 0dc: invokevirtual com/zelix/xm.v ()Ljava/lang/String;
      // 0df: invokevirtual com/zelix/xm.I (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Z
      // 0e2: iload 13
      // 0e4: ifne 111
      // 0e7: goto 0f4
      // 0ea: ldc2_w -6513206770013877927
      // 0ed: lload 2
      // 0ee: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: ifeq 110
      // 0f7: goto 104
      // 0fa: ldc2_w -6513206770013877927
      // 0fd: lload 2
      // 0fe: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: bipush 1
      // 105: ireturn
      // 106: ldc2_w -6513206770013877927
      // 109: lload 2
      // 10a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: bipush 0
      // 111: ireturn
   }

   public String z(char var1, int var2, short var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 0L;
      int var6 = (int)((var4 ^ 0L) >>> 48);
      int var7 = (int)((var4 ^ 0L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      StringBuilder var9 = new StringBuilder();
      var9.append(m44.a<"s">(this, -1483265086643029285L, var4));
      var9.append(b<"w">(11804, 1571825724344885961L ^ var4));
      var9.append(m44.a<"r">(m44.a<"s">(this, -1581242881830797936L, var4), (char)var6, var7, (short)var8, -1311284489808475622L, var4));
      return var9.toString();
   }

   public j9(int var1, long var2, to var4, tg var5, xm var6, l6q var7) {
      var2 = a ^ var2;
      long var8 = var2 ^ 37612575115539L;
      super(var1, var4);
      this.v = var5;
      m44.a<"p">(this, var6, -6865930554293848279L, var2);
      var7.t(var6, this, var8);
   }

   public tg D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"p">(this, -8808718712276233104L, var2);
   }

   public String m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 13840365783089L;
      int var4 = (int)((var2 ^ 13840365783089L) >>> 32);
      int var5 = (int)((var2 ^ 13840365783089L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return m44.a<"p">(this, -2331436456778528709L, var2).b(var4, (short)var5, (short)var6);
   }

   public boolean F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (m44.a<"s">(this, -2084494667187342685L, var2) == m44.a<"i">(-240347470389914069L, var2)) {
            return true;
         }
      } catch (n9 var4) {
         throw m44.a<"m">(var4, -481513430990908012L, var2);
      }

      return false;
   }

   public void v(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 2
      // 02a: pop
      // 02b: getstatic com/zelix/j9.a J
      // 02e: lload 4
      // 030: lxor
      // 031: lstore 4
      // 033: lload 4
      // 035: dup2
      // 036: ldc2_w 99820107337963
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 53887291641811
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 119454947829876
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 107737486346656
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 94671877062273
      // 055: lxor
      // 056: dup2
      // 057: bipush 48
      // 059: lushr
      // 05a: l2i
      // 05b: istore 16
      // 05d: dup2
      // 05e: bipush 16
      // 060: lshl
      // 061: bipush 48
      // 063: lushr
      // 064: l2i
      // 065: istore 17
      // 067: dup2
      // 068: bipush 32
      // 06a: lshl
      // 06b: bipush 32
      // 06d: lushr
      // 06e: l2i
      // 06f: istore 18
      // 071: pop2
      // 072: dup2
      // 073: ldc2_w 108751450032425
      // 076: lxor
      // 077: lstore 19
      // 079: dup2
      // 07a: ldc2_w 49083541313405
      // 07d: lxor
      // 07e: dup2
      // 07f: bipush 32
      // 081: lushr
      // 082: l2i
      // 083: istore 21
      // 085: dup2
      // 086: bipush 32
      // 088: lshl
      // 089: bipush 48
      // 08b: lushr
      // 08c: l2i
      // 08d: istore 22
      // 08f: dup2
      // 090: bipush 48
      // 092: lshl
      // 093: bipush 48
      // 095: lushr
      // 096: l2i
      // 097: istore 23
      // 099: pop2
      // 09a: dup2
      // 09b: ldc2_w 64054386534817
      // 09e: lxor
      // 09f: lstore 24
      // 0a1: pop2
      // 0a2: ldc2_w -9151617785539008998
      // 0a5: lload 4
      // 0a7: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: aload 0
      // 0ad: ldc2_w -9157732466397587593
      // 0b0: lload 4
      // 0b2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: iload 21
      // 0b9: iload 22
      // 0bb: i2s
      // 0bc: iload 23
      // 0be: i2s
      // 0bf: invokevirtual com/zelix/xm.b (ISS)Ljava/lang/String;
      // 0c2: astore 27
      // 0c4: istore 26
      // 0c6: aconst_null
      // 0c7: astore 28
      // 0c9: aload 0
      // 0ca: iload 16
      // 0cc: i2c
      // 0cd: iload 17
      // 0cf: i2s
      // 0d0: iload 18
      // 0d2: bipush 3
      // 0d3: anewarray 192
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0db: bipush 2
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x1
      // 0df: swap
      // 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3: bipush 1
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: ldc2_w -8647072985603453614
      // 0f1: lload 4
      // 0f3: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: ifeq 10b
      // 0fb: aload 6
      // 0fd: astore 29
      // 0ff: lload 4
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 10e
      // 106: iload 26
      // 108: ifeq 10e
      // 10b: aload 3
      // 10c: astore 29
      // 10e: aload 27
      // 110: iload 26
      // 112: ifne 13b
      // 115: ldc "["
      // 117: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 11a: ifne 1d5
      // 11d: goto 12b
      // 120: ldc2_w -7219786563853781237
      // 123: lload 4
      // 125: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 27
      // 12d: goto 13b
      // 130: ldc2_w -7219786563853781237
      // 133: lload 4
      // 135: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: lload 8
      // 13d: dup2_x1
      // 13e: pop2
      // 13f: invokestatic com/zelix/l62.G (JLjava/lang/String;)Lcom/zelix/_v;
      // 142: astore 28
      // 144: aload 28
      // 146: lload 4
      // 148: lconst_0
      // 149: lcmp
      // 14a: ifle 165
      // 14d: iload 26
      // 14f: ifne 165
      // 152: ifnull 1d5
      // 155: goto 163
      // 158: ldc2_w -7219786563853781237
      // 15b: lload 4
      // 15d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: aload 28
      // 165: lload 10
      // 167: invokevirtual com/zelix/_v.N (J)Z
      // 16a: iload 26
      // 16c: ifne 1d4
      // 16f: ifeq 1bd
      // 172: goto 180
      // 175: ldc2_w -7219786563853781237
      // 178: lload 4
      // 17a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: aload 29
      // 182: aload 28
      // 184: lload 14
      // 186: bipush 1
      // 187: anewarray 192
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 0
      // 191: swap
      // 192: aastore
      // 193: ldc2_w -9156334987052803920
      // 196: lload 4
      // 198: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 1a2: pop
      // 1a3: iload 26
      // 1a5: lload 4
      // 1a7: lconst_0
      // 1a8: lcmp
      // 1a9: iflt 1ee
      // 1ac: ifeq 1d5
      // 1af: goto 1bd
      // 1b2: ldc2_w -7219786563853781237
      // 1b5: lload 4
      // 1b7: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: aload 29
      // 1bf: aload 28
      // 1c1: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1c6: goto 1d4
      // 1c9: ldc2_w -7219786563853781237
      // 1cc: lload 4
      // 1ce: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: pop
      // 1d5: ldc2_w -8738290883835938998
      // 1d8: lload 4
      // 1da: invokedynamic n (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: aload 0
      // 1e0: ldc2_w -9111596310389829572
      // 1e3: lload 4
      // 1e5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: invokevirtual com/zelix/tg.ordinal ()I
      // 1ed: iaload
      // 1ee: tableswitch 657 1 9 50 50 50 50 330 330 330 330 330
      // 220: aload 0
      // 221: ldc2_w -9157732466397587593
      // 224: lload 4
      // 226: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: invokevirtual com/zelix/xm.G ()Lcom/zelix/b0;
      // 22e: checkcast com/zelix/b4
      // 231: astore 30
      // 233: aload 30
      // 235: iload 26
      // 237: ifne 265
      // 23a: ifnull 47f
      // 23d: goto 24b
      // 240: ldc2_w -7219786563853781237
      // 243: lload 4
      // 245: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: athrow
      // 24b: aload 7
      // 24d: aload 30
      // 24f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 254: pop
      // 255: aload 30
      // 257: goto 265
      // 25a: ldc2_w -7219786563853781237
      // 25d: lload 4
      // 25f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: lload 19
      // 267: invokevirtual com/zelix/b4.G (J)Lcom/zelix/_v;
      // 26a: astore 31
      // 26c: aload 28
      // 26e: iload 26
      // 270: ifne 2c3
      // 273: ifnull 2b3
      // 276: goto 284
      // 279: ldc2_w -7219786563853781237
      // 27c: lload 4
      // 27e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: aload 31
      // 286: lload 4
      // 288: lconst_0
      // 289: lcmp
      // 28a: iflt 2c3
      // 28d: iload 26
      // 28f: ifne 2c3
      // 292: goto 2a0
      // 295: ldc2_w -7219786563853781237
      // 298: lload 4
      // 29a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: athrow
      // 2a0: aload 28
      // 2a2: if_acmpeq 333
      // 2a5: goto 2b3
      // 2a8: ldc2_w -7219786563853781237
      // 2ab: lload 4
      // 2ad: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: athrow
      // 2b3: aload 31
      // 2b5: goto 2c3
      // 2b8: ldc2_w -7219786563853781237
      // 2bb: lload 4
      // 2bd: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: athrow
      // 2c3: lload 10
      // 2c5: invokevirtual com/zelix/_v.N (J)Z
      // 2c8: iload 26
      // 2ca: ifne 332
      // 2cd: ifeq 31b
      // 2d0: goto 2de
      // 2d3: ldc2_w -7219786563853781237
      // 2d6: lload 4
      // 2d8: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: aload 29
      // 2e0: aload 31
      // 2e2: lload 14
      // 2e4: bipush 1
      // 2e5: anewarray 192
      // 2e8: dup_x2
      // 2e9: dup_x2
      // 2ea: pop
      // 2eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ee: bipush 0
      // 2ef: swap
      // 2f0: aastore
      // 2f1: ldc2_w -9156334987052803920
      // 2f4: lload 4
      // 2f6: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 300: pop
      // 301: iload 26
      // 303: lload 4
      // 305: lconst_0
      // 306: lcmp
      // 307: ifle 335
      // 30a: ifeq 333
      // 30d: goto 31b
      // 310: ldc2_w -7219786563853781237
      // 313: lload 4
      // 315: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: athrow
      // 31b: aload 29
      // 31d: aload 31
      // 31f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 324: goto 332
      // 327: ldc2_w -7219786563853781237
      // 32a: lload 4
      // 32c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: pop
      // 333: iload 26
      // 335: ifeq 47f
      // 338: aload 0
      // 339: ldc2_w -9157732466397587593
      // 33c: lload 4
      // 33e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: invokevirtual com/zelix/xm.G ()Lcom/zelix/b0;
      // 346: checkcast com/zelix/b1
      // 349: astore 31
      // 34b: aload 31
      // 34d: iload 26
      // 34f: ifne 37c
      // 352: ifnull 47f
      // 355: goto 363
      // 358: ldc2_w -7219786563853781237
      // 35b: lload 4
      // 35d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: athrow
      // 363: aload 2
      // 364: aload 31
      // 366: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 36b: pop
      // 36c: aload 31
      // 36e: goto 37c
      // 371: ldc2_w -7219786563853781237
      // 374: lload 4
      // 376: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37b: athrow
      // 37c: lload 19
      // 37e: invokevirtual com/zelix/b1.G (J)Lcom/zelix/_v;
      // 381: astore 32
      // 383: aload 28
      // 385: iload 26
      // 387: ifne 3da
      // 38a: ifnull 3ca
      // 38d: goto 39b
      // 390: ldc2_w -7219786563853781237
      // 393: lload 4
      // 395: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39a: athrow
      // 39b: aload 32
      // 39d: lload 4
      // 39f: lconst_0
      // 3a0: lcmp
      // 3a1: iflt 3da
      // 3a4: iload 26
      // 3a6: ifne 3da
      // 3a9: goto 3b7
      // 3ac: ldc2_w -7219786563853781237
      // 3af: lload 4
      // 3b1: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: athrow
      // 3b7: aload 28
      // 3b9: if_acmpeq 47c
      // 3bc: goto 3ca
      // 3bf: ldc2_w -7219786563853781237
      // 3c2: lload 4
      // 3c4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: athrow
      // 3ca: aload 32
      // 3cc: goto 3da
      // 3cf: ldc2_w -7219786563853781237
      // 3d2: lload 4
      // 3d4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: athrow
      // 3da: lload 12
      // 3dc: invokevirtual com/zelix/_v.h (J)Ljava/lang/String;
      // 3df: lload 24
      // 3e1: dup2_x1
      // 3e2: pop2
      // 3e3: invokestatic com/zelix/l62.r (JLjava/lang/String;)Z
      // 3e6: iload 26
      // 3e8: lload 4
      // 3ea: lconst_0
      // 3eb: lcmp
      // 3ec: iflt 41a
      // 3ef: ifne 418
      // 3f2: ifne 47c
      // 3f5: goto 403
      // 3f8: ldc2_w -7219786563853781237
      // 3fb: lload 4
      // 3fd: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: athrow
      // 403: aload 32
      // 405: lload 10
      // 407: invokevirtual com/zelix/_v.N (J)Z
      // 40a: goto 418
      // 40d: ldc2_w -7219786563853781237
      // 410: lload 4
      // 412: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: athrow
      // 418: iload 26
      // 41a: ifne 47b
      // 41d: ifeq 464
      // 420: goto 42e
      // 423: ldc2_w -7219786563853781237
      // 426: lload 4
      // 428: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42d: athrow
      // 42e: aload 29
      // 430: aload 32
      // 432: lload 14
      // 434: bipush 1
      // 435: anewarray 192
      // 438: dup_x2
      // 439: dup_x2
      // 43a: pop
      // 43b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43e: bipush 0
      // 43f: swap
      // 440: aastore
      // 441: ldc2_w -9156334987052803920
      // 444: lload 4
      // 446: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 450: pop
      // 451: iload 26
      // 453: ifeq 47c
      // 456: goto 464
      // 459: ldc2_w -7219786563853781237
      // 45c: lload 4
      // 45e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 463: athrow
      // 464: aload 29
      // 466: aload 32
      // 468: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 46d: goto 47b
      // 470: ldc2_w -7219786563853781237
      // 473: lload 4
      // 475: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47a: athrow
      // 47b: pop
      // 47c: goto 47f
      // 47f: return
   }

   public void s(Object[] param1) {
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
      // 04: checkcast java/util/Set
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/j9.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w 7522990384266555672
      // 1d: lload 2
      // 1e: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: ldc2_w 8136172515383984408
      // 28: lload 2
      // 29: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 0
      // 2f: ldc2_w 8637688687860819566
      // 32: lload 2
      // 33: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/tg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: invokevirtual com/zelix/tg.ordinal ()I
      // 3b: iaload
      // 3c: tableswitch 154 1 9 151 151 151 151 52 52 52 52 52
      // 70: aload 0
      // 71: ldc2_w 8555455701682594085
      // 74: lload 2
      // 75: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xm; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: invokevirtual com/zelix/xm.G ()Lcom/zelix/b0;
      // 7d: checkcast com/zelix/b1
      // 80: astore 6
      // 82: aload 6
      // 84: lload 2
      // 85: lconst_0
      // 86: lcmp
      // 87: ifle a1
      // 8a: iload 5
      // 8c: ifeq a1
      // 8f: ifnull d3
      // 92: goto 9f
      // 95: ldc2_w 7898202320498164057
      // 98: lload 2
      // 99: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: aload 6
      // a1: invokevirtual com/zelix/b1.J ()Z
      // a4: iload 5
      // a6: ifeq d2
      // a9: ifeq d3
      // ac: goto b9
      // af: ldc2_w 7898202320498164057
      // b2: lload 2
      // b3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: athrow
      // b9: aload 4
      // bb: aload 6
      // bd: checkcast com/zelix/bn
      // c0: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // c5: goto d2
      // c8: ldc2_w 7898202320498164057
      // cb: lload 2
      // cc: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: athrow
      // d2: pop
      // d3: goto d6
      // d6: return
   }

   static {
      long var5 = a ^ 72355746418655L;
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
      String var11 = "¬Vb*\u0098¦Òoõz.>Ræ§¨0¦\u0014o)q»÷§\u0092\u008cGjÒ\u009c.õ°å¿V6V~\u009f[ç%pß4Ò°¡U?ÃÚ¯â\u009d\u0013\u001c\u0099ì5[\u0013ø\u0010JQP\u000bÃ+Ë\u0017\u0018\feË\u0080\u001cÞF";
      int var13 = "¬Vb*\u0098¦Òoõz.>Ræ§¨0¦\u0014o)q»÷§\u0092\u008cGjÒ\u009c.õ°å¿V6V~\u009f[ç%pß4Ò°¡U?ÃÚ¯â\u009d\u0013\u001c\u0099ì5[\u0013ø\u0010JQP\u000bÃ+Ë\u0017\u0018\feË\u0080\u001cÞF"
         .length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = b(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -5961078226053352100L;
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
            e = var23;
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12919;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/j9", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/j9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
