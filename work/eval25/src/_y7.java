package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _y7 {
   private _x1 j;
   private Map K;
   private _x1 U;
   private static final long a = ess.a(-7244647669373653731L, -1713943017304991982L, MethodHandles.lookup().lookupClass()).a(134234745722780L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void f(Object[] param1) {
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
      // 0e: checkcast java/lang/Object
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/_y7.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 30552511864806
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -1996342030435484337
      // 25: lload 3
      // 26: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 7
      // 2d: aload 0
      // 2e: getfield com/zelix/_y7.j Lcom/zelix/_x1;
      // 31: aload 7
      // 33: ifnonnull 90
      // 36: aload 0
      // 37: getfield com/zelix/_y7.U Lcom/zelix/_x1;
      // 3a: if_acmpeq 96
      // 3d: goto 4a
      // 40: ldc2_w -1992140080427475677
      // 43: lload 3
      // 44: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 0
      // 4c: getfield com/zelix/_y7.j Lcom/zelix/_x1;
      // 4f: lload 5
      // 51: dup2_x1
      // 52: pop2
      // 53: bipush 2
      // 54: anewarray 297
      // 57: dup_x1
      // 58: swap
      // 59: bipush 1
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x2
      // 5d: dup_x2
      // 5e: pop
      // 5f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62: bipush 0
      // 63: swap
      // 64: aastore
      // 65: ldc2_w -55682754107786458
      // 68: lload 3
      // 69: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/_x1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: aload 2
      // 6f: invokestatic com/zelix/_x1.z (Lcom/zelix/_x1;Ljava/lang/Object;)Lcom/zelix/_x1;
      // 72: putfield com/zelix/_y7.j Lcom/zelix/_x1;
      // 75: aload 0
      // 76: getfield com/zelix/_y7.K Ljava/util/Map;
      // 79: aload 2
      // 7a: aload 0
      // 7b: getfield com/zelix/_y7.j Lcom/zelix/_x1;
      // 7e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 83: goto 90
      // 86: ldc2_w -1992140080427475677
      // 89: lload 3
      // 8a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: pop
      // 91: aload 7
      // 93: ifnull b5
      // 96: new com/zelix/gj
      // 99: dup
      // 9a: sipush 25987
      // 9d: ldc2_w 8484532497666528322
      // a0: lload 3
      // a1: lxor
      // a2: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_y7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // aa: athrow
      // ab: ldc2_w -1992140080427475677
      // ae: lload 3
      // af: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: return
   }

   public _y7(Object var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 50003514303177L;
      super();
      this.K = x44.a<"q">(new Object[]{var4}, 8013456123187005786L, var2);
      this.U = new _x1(this, var1, null, null);
      this.j = this.U;
      this.K.put(var1, this.j);
   }

   public void q(Object[] var1) {
      this.j = this.U;
   }

   public Enumeration q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = x44.a<"t">(7034054424800950425L, var2);
      ArrayList var5 = new ArrayList();
      String var4 = var10000;
      Iterator var6 = x44.a<"l">(this, new Object[0], 7390672097262893513L, var2);

      while (var6.hasNext()) {
         try {
            Object var10001 = var4;
            if (var2 >= 0L) {
               if (var4 != null) {
                  return Collections.enumeration(var5);
               }

               var10001 = ((_x1)var6.next()).x();
            }

            var5.add(var10001);
            if (var4 == null) {
               continue;
            }
         } catch (gj var7) {
            throw x44.a<"t">(var7, 7029016886566115573L, var2);
         }

         if (var2 >= 0L) {
            break;
         }
      }

      return Collections.enumeration(var5);
   }

   public void v(Object[] param1) {
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
      // 0c: getstatic com/zelix/_y7.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 8587689912861
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -3337011713255094092
      // 1e: lload 2
      // 1f: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/_y7.j Lcom/zelix/_x1;
      // 28: lload 4
      // 2a: dup2_x1
      // 2b: pop2
      // 2c: bipush 2
      // 2d: anewarray 297
      // 30: dup_x1
      // 31: swap
      // 32: bipush 1
      // 33: swap
      // 34: aastore
      // 35: dup_x2
      // 36: dup_x2
      // 37: pop
      // 38: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b: bipush 0
      // 3c: swap
      // 3d: aastore
      // 3e: ldc2_w -3836731727147757859
      // 41: lload 2
      // 42: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/_x1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: astore 7
      // 49: astore 6
      // 4b: aload 6
      // 4d: ifnonnull 75
      // 50: aload 7
      // 52: ifnull 7a
      // 55: goto 62
      // 58: ldc2_w -3341280458789590824
      // 5b: lload 2
      // 5c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: aload 7
      // 65: putfield com/zelix/_y7.j Lcom/zelix/_x1;
      // 68: goto 75
      // 6b: ldc2_w -3341280458789590824
      // 6e: lload 2
      // 6f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 6
      // 77: ifnull 99
      // 7a: new com/zelix/gj
      // 7d: dup
      // 7e: sipush 9950
      // 81: ldc2_w 2903107253048287975
      // 84: lload 2
      // 85: lxor
      // 86: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_y7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // 8e: athrow
      // 8f: ldc2_w -3341280458789590824
      // 92: lload 2
      // 93: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: return
   }

   public Iterator E(Object[] var1) {
      return new et(this, this);
   }

   public boolean u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (this.j == this.U) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"v">(var4, 747037032610050855L, var2);
      }

      return false;
   }

   public void F(Object[] var1) {
      Object var2 = var1[0];
      this.j = _x1.z(this.j, var2);
      this.K.put(var2, this.j);
   }

   public boolean a(Object[] param1) {
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
      // 0e: checkcast java/lang/Object
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/_y7.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w 2689634775267163223
      // 1d: lload 2
      // 1e: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: aload 0
      // 24: getfield com/zelix/_y7.K Ljava/util/Map;
      // 27: aload 4
      // 29: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2e: checkcast com/zelix/_x1
      // 31: astore 6
      // 33: astore 5
      // 35: aload 5
      // 37: ifnonnull 5f
      // 3a: aload 6
      // 3c: ifnull 61
      // 3f: goto 4c
      // 42: ldc2_w 2684829502343650363
      // 45: lload 2
      // 46: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 6
      // 4f: putfield com/zelix/_y7.j Lcom/zelix/_x1;
      // 52: goto 5f
      // 55: ldc2_w 2684829502343650363
      // 58: lload 2
      // 59: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: bipush 1
      // 60: ireturn
      // 61: bipush 0
      // 62: ireturn
   }

   private void W(Object[] param1) {
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
      // 004: checkcast com/zelix/_x1
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/_y7.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 118510454459276
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 82063175193671
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w 8079987151915346213
      // 02d: lload 2
      // 02e: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 9
      // 035: aload 4
      // 037: aload 9
      // 039: ifnonnull 06d
      // 03c: ifnonnull 06b
      // 03f: goto 04c
      // 042: ldc2_w 8083977993478392137
      // 045: lload 2
      // 046: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: new java/lang/IllegalArgumentException
      // 04f: dup
      // 050: sipush 14295
      // 053: ldc2_w 4028523670919221885
      // 056: lload 2
      // 057: lxor
      // 058: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_y7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 060: athrow
      // 061: ldc2_w 8083977993478392137
      // 064: lload 2
      // 065: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 4
      // 06d: aload 9
      // 06f: ifnonnull 0a7
      // 072: aload 0
      // 073: getfield com/zelix/_y7.U Lcom/zelix/_x1;
      // 076: if_acmpne 0a5
      // 079: goto 086
      // 07c: ldc2_w 8083977993478392137
      // 07f: lload 2
      // 080: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: new com/zelix/gj
      // 089: dup
      // 08a: sipush 31015
      // 08d: ldc2_w 6883805184585096330
      // 090: lload 2
      // 091: lxor
      // 092: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_y7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // 09a: athrow
      // 09b: ldc2_w 8083977993478392137
      // 09e: lload 2
      // 09f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 4
      // 0a7: astore 10
      // 0a9: aload 10
      // 0ab: ifnull 107
      // 0ae: aload 10
      // 0b0: aload 0
      // 0b1: getfield com/zelix/_y7.U Lcom/zelix/_x1;
      // 0b4: aload 9
      // 0b6: lload 2
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0c1
      // 0bc: ifnonnull 125
      // 0bf: aload 9
      // 0c1: ifnonnull 125
      // 0c4: goto 0d1
      // 0c7: ldc2_w 8083977993478392137
      // 0ca: lload 2
      // 0cb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: if_acmpeq 107
      // 0d4: goto 0e1
      // 0d7: ldc2_w 8083977993478392137
      // 0da: lload 2
      // 0db: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 5
      // 0e3: aload 10
      // 0e5: bipush 2
      // 0e6: anewarray 297
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: bipush 1
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x2
      // 0ef: dup_x2
      // 0f0: pop
      // 0f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f4: bipush 0
      // 0f5: swap
      // 0f6: aastore
      // 0f7: ldc2_w 7732782633706172236
      // 0fa: lload 2
      // 0fb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/_x1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: astore 10
      // 102: aload 9
      // 104: ifnull 0a9
      // 107: aload 10
      // 109: lload 2
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: ifle 0b0
      // 10f: aload 9
      // 111: ifnonnull 166
      // 114: aload 0
      // 115: getfield com/zelix/_y7.U Lcom/zelix/_x1;
      // 118: goto 125
      // 11b: ldc2_w 8083977993478392137
      // 11e: lload 2
      // 11f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: if_acmpeq 147
      // 128: new com/zelix/gj
      // 12b: dup
      // 12c: sipush 3109
      // 12f: ldc2_w 8803960851835627916
      // 132: lload 2
      // 133: lxor
      // 134: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_y7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // 13c: athrow
      // 13d: ldc2_w 8083977993478392137
      // 140: lload 2
      // 141: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: lload 5
      // 149: aload 4
      // 14b: bipush 2
      // 14c: anewarray 297
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 1
      // 152: swap
      // 153: aastore
      // 154: dup_x2
      // 155: dup_x2
      // 156: pop
      // 157: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15a: bipush 0
      // 15b: swap
      // 15c: aastore
      // 15d: ldc2_w 7732782633706172236
      // 160: lload 2
      // 161: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/_x1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: astore 11
      // 168: lload 7
      // 16a: aload 11
      // 16c: aload 4
      // 16e: bipush 3
      // 16f: anewarray 297
      // 172: dup_x1
      // 173: swap
      // 174: bipush 2
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: bipush 1
      // 17a: swap
      // 17b: aastore
      // 17c: dup_x2
      // 17d: dup_x2
      // 17e: pop
      // 17f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: ldc2_w 8574814403798610529
      // 188: lload 2
      // 189: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: istore 12
      // 190: return
   }

   static {
      long var0 = a ^ 18920859135802L;
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
      String var6 = "Å!ä\u009a+°4Çwm\u0088ø>£Zçÿþ\u0007O\u0006G9\r\u008a\u0094\\=\u0019p´@l!:£\u009c+\u008d\u007fÁÂ=\u008aÐÁäà(~7\u0085¥~\u0080|.ÁSQ¯Íl=\u0092\bà¶Ð7·õ(>VË5u¯yÉ\u0091\u001cru \u0085%x8løè.|àÞÚÖs6\u0092Òëyøß\u0086\u000ehâkRTè¿\u0084\nH±AÙpÉp:\u0016\u0095ÒQ¥ã\">Þ-ñ\u0015\u0093\u0090÷Ú[µÄÐ";
      int var8 = "Å!ä\u009a+°4Çwm\u0088ø>£Zçÿþ\u0007O\u0006G9\r\u008a\u0094\\=\u0019p´@l!:£\u009c+\u008d\u007fÁÂ=\u008aÐÁäà(~7\u0085¥~\u0080|.ÁSQ¯Íl=\u0092\bà¶Ð7·õ(>VË5u¯yÉ\u0091\u001cru \u0085%x8løè.|àÞÚÖs6\u0092Òëyøß\u0086\u000ehâkRTè¿\u0084\nH±AÙpÉp:\u0016\u0095ÒQ¥ã\">Þ-ñ\u0015\u0093\u0090÷Ú[µÄÐ"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[5];
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

                  var6 = "_\u007fö\u0006à\u0086\u0006\u008aým\u009cI¢\u0017;_I6\r`\"A\u0092\f([\u0005\u0005Õµik©à\u0085oþs.N^\u0090\\\n\u0000åå«=\u0012íí·\u0016¸Î)fÅ\u00997§83\u0007";
                  var8 = "_\u007fö\u0006à\u0086\u0006\u008aým\u009cI¢\u0017;_I6\r`\"A\u0092\f([\u0005\u0005Õµik©à\u0085oþs.N^\u0090\\\n\u0000åå«=\u0012íí·\u0016¸Î)fÅ\u00997§83\u0007"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18258;
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
            throw new RuntimeException("com/zelix/_y7", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/_y7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
