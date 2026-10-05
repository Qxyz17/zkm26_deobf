package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class iq extends h8 implements _zv {
   private mx M;
   String x;
   private int P;
   boolean g;
   private static final long a = ess.a(-2684077071586187710L, -2075377707795103208L, MethodHandles.lookup().lookupClass()).a(137305979023641L);
   private static final String b;
   private static final long c;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void H(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      boolean var5 = x44.a<"w">(6131351258492134780L, var3);

      label41: {
         try {
            if (this.M == null) {
               return;
            }

            if (!mc.Bz) {
               break label41;
            }
         } catch (gj var9) {
            throw x44.a<"w">(var9, 5557117005354096199L, var3);
         }

         String var6 = this.M.u() + (int)c + "a";

         try {
            this.M.v(var6);
            if (var3 <= 0L || var5) {
               return;
            }
         } catch (gj var8) {
            boolean var10001 = false;
            throw x44.a<"w">(var8, 5557117005354096199L, var3);
         }
      }

      try {
         this.M.v("a");
      } catch (gj var7) {
         boolean var11 = false;
         throw x44.a<"w">(var7, 5557117005354096199L, var3);
      }
   }

   iq(bi var1, long var2, _83 var4, List var5) {
      var2 = a ^ var2;
      super(var1);
      x44.a<"s">(this, true, 4504016472100476614L, var2);
      mx var6 = var4.Y("a", var5);
      this.M = var6;
   }

   protected void W(Object[] param1) {
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
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/Map
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast com/zelix/_ur
      // 17: astore 4
      // 19: dup
      // 1a: bipush 3
      // 1b: aaload
      // 1c: checkcast java/lang/Long
      // 1f: invokevirtual java/lang/Long.longValue ()J
      // 22: lstore 2
      // 23: pop
      // 24: getstatic com/zelix/iq.a J
      // 27: lload 2
      // 28: lxor
      // 29: lstore 2
      // 2a: ldc2_w 7558058782009089191
      // 2d: lload 2
      // 2e: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: istore 7
      // 35: aload 0
      // 36: getfield com/zelix/iq.M Lcom/zelix/mx;
      // 39: iload 7
      // 3b: ifne 69
      // 3e: ifnull ce
      // 41: goto 4e
      // 44: ldc2_w 7898404577958295237
      // 47: lload 2
      // 48: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 5
      // 50: aload 0
      // 51: getfield com/zelix/iq.M Lcom/zelix/mx;
      // 54: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 59: checkcast com/zelix/xl
      // 5c: goto 69
      // 5f: ldc2_w 7898404577958295237
      // 62: lload 2
      // 63: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: astore 8
      // 6b: iload 7
      // 6d: lload 2
      // 6e: lconst_0
      // 6f: lcmp
      // 70: iflt a1
      // 73: ifne 9f
      // 76: aload 8
      // 78: ifnull aa
      // 7b: goto 88
      // 7e: ldc2_w 7898404577958295237
      // 81: lload 2
      // 82: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: aload 6
      // 8a: aload 8
      // 8c: invokevirtual com/zelix/xl.B ()I
      // 8f: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 92: goto 9f
      // 95: ldc2_w 7898404577958295237
      // 98: lload 2
      // 99: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: iload 7
      // a1: lload 2
      // a2: lconst_0
      // a3: lcmp
      // a4: iflt cb
      // a7: ifeq c3
      // aa: aload 6
      // ac: aload 0
      // ad: getfield com/zelix/iq.M Lcom/zelix/mx;
      // b0: invokevirtual com/zelix/mx.B ()I
      // b3: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // b6: goto c3
      // b9: ldc2_w 7898404577958295237
      // bc: lload 2
      // bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: athrow
      // c3: lload 2
      // c4: lconst_0
      // c5: lcmp
      // c6: iflt f0
      // c9: iload 7
      // cb: ifeq e1
      // ce: aload 6
      // d0: bipush 0
      // d1: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // d4: goto e1
      // d7: ldc2_w 7898404577958295237
      // da: lload 2
      // db: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: athrow
      // e1: aload 6
      // e3: aload 0
      // e4: ldc2_w 8633675645395473741
      // e7: lload 2
      // e8: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // f0: return
   }

   String D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 4297569919982922627L, var2);
   }

   boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 7902154216896710125L, var2);
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 10727274753381L;

      try {
         if (this.M != null) {
            var3.H(this.M, this, this.x(), var4);
         }
      } catch (gj var6) {
         throw x44.a<"w">(var6, -4616474657956027209L, var1);
      }
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: ldc2_w -4813852749984134795
      // 1e: lload 6
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: getfield com/zelix/iq.M Lcom/zelix/mx;
      // 2b: iload 8
      // 2d: ifne 66
      // 30: ifnull 7d
      // 33: goto 41
      // 36: ldc2_w -5166023383443234025
      // 39: lload 6
      // 3b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 0
      // 42: iload 8
      // 44: ifne 79
      // 47: goto 55
      // 4a: ldc2_w -5166023383443234025
      // 4d: lload 6
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/iq.M Lcom/zelix/mx;
      // 58: goto 66
      // 5b: ldc2_w -5166023383443234025
      // 5e: lload 6
      // 60: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 1
      // 67: if_acmpne 7d
      // 6a: aload 0
      // 6b: goto 79
      // 6e: ldc2_w -5166023383443234025
      // 71: lload 6
      // 73: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 3
      // 7a: putfield com/zelix/iq.M Lcom/zelix/mx;
      // 7d: return
   }

   protected void v(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/iq.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 5460479582790908845
      // 1c: lload 3
      // 1d: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: iload 5
      // 26: ifeq 55
      // 29: aload 0
      // 2a: getfield com/zelix/iq.M Lcom/zelix/mx;
      // 2d: ifnull 60
      // 30: goto 3d
      // 33: ldc2_w 6039241601052493974
      // 36: lload 3
      // 37: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 2
      // 3e: aload 0
      // 3f: getfield com/zelix/iq.M Lcom/zelix/mx;
      // 42: invokevirtual com/zelix/mx.B ()I
      // 45: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 48: goto 55
      // 4b: ldc2_w 6039241601052493974
      // 4e: lload 3
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: lload 3
      // 56: lconst_0
      // 57: lcmp
      // 58: ifle 80
      // 5b: iload 5
      // 5d: ifne 72
      // 60: aload 2
      // 61: bipush 0
      // 62: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 65: goto 72
      // 68: ldc2_w 6039241601052493974
      // 6b: lload 3
      // 6c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 2
      // 73: aload 0
      // 74: ldc2_w 5297233034524109598
      // 77: lload 3
      // 78: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 80: return
   }

   int v(Object[] var1) {
      return 4;
   }

   iq(h8 param1, _xx param2, _y4 param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/iq.a J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 137443729432612
      // 00e: lxor
      // 00f: lstore 6
      // 011: dup2
      // 012: ldc2_w 75426722153353
      // 015: lxor
      // 016: lstore 8
      // 018: dup2
      // 019: ldc2_w 102450285527192
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 8
      // 020: lushr
      // 021: lstore 10
      // 023: dup2
      // 024: bipush 56
      // 026: lshl
      // 027: bipush 56
      // 029: lushr
      // 02a: l2i
      // 02b: istore 12
      // 02d: pop2
      // 02e: dup2
      // 02f: ldc2_w 46210236471200
      // 032: lxor
      // 033: lstore 13
      // 035: pop2
      // 036: ldc2_w -596273522910967853
      // 039: lload 4
      // 03b: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 0
      // 041: aload 1
      // 042: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 045: aload 0
      // 046: bipush 1
      // 047: ldc2_w -735944112645972594
      // 04a: lload 4
      // 04c: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: aload 2
      // 052: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 055: istore 17
      // 057: istore 16
      // 059: aload 0
      // 05a: aload 2
      // 05b: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 05e: iload 16
      // 060: ifeq 091
      // 063: ldc2_w -721257374703446176
      // 066: lload 4
      // 068: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: iload 17
      // 06f: ifeq 14c
      // 072: goto 080
      // 075: ldc2_w -1174969594380323608
      // 078: lload 4
      // 07a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: aload 0
      // 081: iload 17
      // 083: goto 091
      // 086: ldc2_w -1174969594380323608
      // 089: lload 4
      // 08b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: istore 15
      // 093: lload 10
      // 095: iload 15
      // 097: iload 12
      // 099: i2b
      // 09a: invokevirtual com/zelix/iq.N (JIB)Lcom/zelix/xl;
      // 09d: astore 18
      // 09f: iload 16
      // 0a1: lload 4
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 0b0
      // 0a8: ifeq 102
      // 0ab: aload 18
      // 0ad: instanceof com/zelix/mx
      // 0b0: ifeq 0e8
      // 0b3: goto 0c1
      // 0b6: ldc2_w -1174969594380323608
      // 0b9: lload 4
      // 0bb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: aload 18
      // 0c4: checkcast com/zelix/mx
      // 0c7: putfield com/zelix/iq.M Lcom/zelix/mx;
      // 0ca: aload 3
      // 0cb: aload 0
      // 0cc: getfield com/zelix/iq.M Lcom/zelix/mx;
      // 0cf: aload 0
      // 0d0: lload 6
      // 0d2: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0d5: iload 16
      // 0d7: ifne 14c
      // 0da: goto 0e8
      // 0dd: ldc2_w -1174969594380323608
      // 0e0: lload 4
      // 0e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: bipush 0
      // 0ea: ldc2_w -735944112645972594
      // 0ed: lload 4
      // 0ef: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: goto 102
      // 0f7: ldc2_w -1174969594380323608
      // 0fa: lload 4
      // 0fc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 0
      // 103: new java/lang/StringBuilder
      // 106: dup
      // 107: invokespecial java/lang/StringBuilder.<init> ()V
      // 10a: getstatic com/zelix/iq.b Ljava/lang/String;
      // 10d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 110: aload 18
      // 112: lload 8
      // 114: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 117: lload 13
      // 119: dup2_x1
      // 11a: pop2
      // 11b: bipush 2
      // 11c: anewarray 160
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 1
      // 122: swap
      // 123: aastore
      // 124: dup_x2
      // 125: dup_x2
      // 126: pop
      // 127: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12a: bipush 0
      // 12b: swap
      // 12c: aastore
      // 12d: ldc2_w -1495820855924958089
      // 130: lload 4
      // 132: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: ldc "'"
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 142: ldc2_w -1475363513762858079
      // 145: lload 4
      // 147: invokedynamic s (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: return
   }

   static {
      long var5 = a ^ 50472461171445L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("\u000eÿºè´\u0098µ\u00ad¬3µU,¥\u0081wôù§\txÛ2ùÇ¢\u000f.QíÕ*È}\u00167\"\u0090\u0007\u0090".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      b = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -1109130217379485612L;
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
      long var14 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      var10001 = -1;
      c = var14;
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
