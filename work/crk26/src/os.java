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

public class os {
   private l6x M;
   private Map X;
   private l6x y;
   private static final long a = prr.a(591139263324927894L, -535405586785152623L, MethodHandles.lookup().lookupClass()).a(87957638963534L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

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
      // 0c: getstatic com/zelix/os.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 33583048321331
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 9006439530720879307
      // 1e: lload 2
      // 1f: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/os.y Lcom/zelix/l6x;
      // 28: lload 4
      // 2a: dup2_x1
      // 2b: pop2
      // 2c: bipush 2
      // 2d: anewarray 59
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
      // 3e: ldc2_w 8715872721152062500
      // 41: lload 2
      // 42: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/l6x; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: astore 7
      // 49: astore 6
      // 4b: aload 6
      // 4d: ifnonnull 75
      // 50: aload 7
      // 52: ifnull 7a
      // 55: goto 62
      // 58: ldc2_w 7059669511868707100
      // 5b: lload 2
      // 5c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: aload 7
      // 65: putfield com/zelix/os.y Lcom/zelix/l6x;
      // 68: goto 75
      // 6b: ldc2_w 7059669511868707100
      // 6e: lload 2
      // 6f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 6
      // 77: ifnull 99
      // 7a: new com/zelix/n9
      // 7d: dup
      // 7e: sipush 27009
      // 81: ldc2_w 38861923822711182
      // 84: lload 2
      // 85: lxor
      // 86: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/os.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: invokespecial com/zelix/n9.<init> (Ljava/lang/String;)V
      // 8e: athrow
      // 8f: ldc2_w 7059669511868707100
      // 92: lload 2
      // 93: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: return
   }

   public os(char var1, int var2, Object var3, char var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 71761288353286L;
      super();
      this.X = m44.a<"k">(new Object[]{var7}, 3630680475316213376L, var5);
      this.M = new l6x(this, var3, null, null);
      this.y = this.M;
      this.X.put(var3, this.y);
   }

   private void P(Object[] param1) {
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
      // 00e: checkcast com/zelix/l6x
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/os.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 20536889419022
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 95235161616973
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w 7458811036275538357
      // 02d: lload 2
      // 02e: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 9
      // 035: aload 4
      // 037: aload 9
      // 039: ifnonnull 06d
      // 03c: ifnonnull 06b
      // 03f: goto 04c
      // 042: ldc2_w 8828942112914860642
      // 045: lload 2
      // 046: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: new java/lang/IllegalArgumentException
      // 04f: dup
      // 050: sipush 17806
      // 053: ldc2_w 4574061673307637501
      // 056: lload 2
      // 057: lxor
      // 058: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/os.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 060: athrow
      // 061: ldc2_w 8828942112914860642
      // 064: lload 2
      // 065: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 4
      // 06d: aload 9
      // 06f: ifnonnull 0a7
      // 072: aload 0
      // 073: getfield com/zelix/os.M Lcom/zelix/l6x;
      // 076: if_acmpne 0a5
      // 079: goto 086
      // 07c: ldc2_w 8828942112914860642
      // 07f: lload 2
      // 080: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: new com/zelix/n9
      // 089: dup
      // 08a: sipush 26125
      // 08d: ldc2_w 550755458295113087
      // 090: lload 2
      // 091: lxor
      // 092: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/os.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: invokespecial com/zelix/n9.<init> (Ljava/lang/String;)V
      // 09a: athrow
      // 09b: ldc2_w 8828942112914860642
      // 09e: lload 2
      // 09f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 4
      // 0a7: astore 10
      // 0a9: aload 10
      // 0ab: ifnull 107
      // 0ae: aload 10
      // 0b0: aload 0
      // 0b1: getfield com/zelix/os.M Lcom/zelix/l6x;
      // 0b4: aload 9
      // 0b6: lload 2
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0c1
      // 0bc: ifnonnull 125
      // 0bf: aload 9
      // 0c1: ifnonnull 125
      // 0c4: goto 0d1
      // 0c7: ldc2_w 8828942112914860642
      // 0ca: lload 2
      // 0cb: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: if_acmpeq 107
      // 0d4: goto 0e1
      // 0d7: ldc2_w 8828942112914860642
      // 0da: lload 2
      // 0db: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 7
      // 0e3: aload 10
      // 0e5: bipush 2
      // 0e6: anewarray 59
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
      // 0f7: ldc2_w 7172906104460488538
      // 0fa: lload 2
      // 0fb: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/l6x; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: astore 10
      // 102: aload 9
      // 104: ifnull 0a9
      // 107: aload 10
      // 109: lload 2
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: iflt 0b0
      // 10f: aload 9
      // 111: ifnonnull 166
      // 114: aload 0
      // 115: getfield com/zelix/os.M Lcom/zelix/l6x;
      // 118: goto 125
      // 11b: ldc2_w 8828942112914860642
      // 11e: lload 2
      // 11f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: if_acmpeq 147
      // 128: new com/zelix/n9
      // 12b: dup
      // 12c: sipush 12618
      // 12f: ldc2_w 6100420865912500799
      // 132: lload 2
      // 133: lxor
      // 134: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/os.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: invokespecial com/zelix/n9.<init> (Ljava/lang/String;)V
      // 13c: athrow
      // 13d: ldc2_w 8828942112914860642
      // 140: lload 2
      // 141: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: lload 7
      // 149: aload 4
      // 14b: bipush 2
      // 14c: anewarray 59
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
      // 15d: ldc2_w 7172906104460488538
      // 160: lload 2
      // 161: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/l6x; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: astore 11
      // 168: aload 11
      // 16a: aload 4
      // 16c: lload 5
      // 16e: bipush 3
      // 16f: anewarray 59
      // 172: dup_x2
      // 173: dup_x2
      // 174: pop
      // 175: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 178: bipush 2
      // 179: swap
      // 17a: aastore
      // 17b: dup_x1
      // 17c: swap
      // 17d: bipush 1
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: ldc2_w 7413590973124859324
      // 188: lload 2
      // 189: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: istore 12
      // 190: return
   }

   public boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (this.y == this.M) {
            return true;
         }
      } catch (n9 var4) {
         throw m44.a<"n">(var4, -4535729836288618007L, var2);
      }

      return false;
   }

   public boolean v(Object[] param1) {
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
      // 13: getstatic com/zelix/os.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 3969409111288850720
      // 1c: lload 3
      // 1d: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 0
      // 23: getfield com/zelix/os.X Ljava/util/Map;
      // 26: aload 2
      // 27: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2c: checkcast com/zelix/l6x
      // 2f: astore 6
      // 31: astore 5
      // 33: aload 5
      // 35: ifnonnull 5d
      // 38: aload 6
      // 3a: ifnull 5f
      // 3d: goto 4a
      // 40: ldc2_w 3031940159439616759
      // 43: lload 3
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 6
      // 4d: putfield com/zelix/os.y Lcom/zelix/l6x;
      // 50: goto 5d
      // 53: ldc2_w 3031940159439616759
      // 56: lload 3
      // 57: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: bipush 1
      // 5e: ireturn
      // 5f: bipush 0
      // 60: ireturn
   }

   public void B(Object[] var1) {
      this.y = this.M;
   }

   public Iterator k(Object[] var1) {
      return new u0(this, this);
   }

   public Enumeration W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = m44.a<"h">(-4835135875957546288L, var2);
      ArrayList var5 = new ArrayList();
      String var4 = var10000;
      Iterator var6 = m44.a<"w">(this, new Object[0], -6847468938653409497L, var2);

      while (var6.hasNext()) {
         try {
            Object var10001 = var4;
            if (var2 > 0L) {
               if (var4 != null) {
                  return Collections.enumeration(var5);
               }

               var10001 = ((l6x)var6.next()).W();
            }

            var5.add(var10001);
            if (var4 == null) {
               continue;
            }
         } catch (n9 var7) {
            throw m44.a<"h">(var7, -6781413313831227129L, var2);
         }

         if (var2 > 0L) {
            break;
         }
      }

      return Collections.enumeration(var5);
   }

   public void U(Object[] var1) {
      Object var2 = var1[0];
      this.y = l6x.f(this.y, var2);
      this.X.put(var2, this.y);
   }

   public void A(Object[] param1) {
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
      // 13: getstatic com/zelix/os.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 60881866734368
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 3381751270351515864
      // 25: lload 3
      // 26: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 7
      // 2d: aload 0
      // 2e: getfield com/zelix/os.y Lcom/zelix/l6x;
      // 31: aload 7
      // 33: ifnonnull 90
      // 36: aload 0
      // 37: getfield com/zelix/os.M Lcom/zelix/l6x;
      // 3a: if_acmpeq 96
      // 3d: goto 4a
      // 40: ldc2_w 3741319006623539983
      // 43: lload 3
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 0
      // 4c: getfield com/zelix/os.y Lcom/zelix/l6x;
      // 4f: lload 5
      // 51: dup2_x1
      // 52: pop2
      // 53: bipush 2
      // 54: anewarray 59
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
      // 65: ldc2_w 3091204217636480567
      // 68: lload 3
      // 69: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/l6x; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: aload 2
      // 6f: invokestatic com/zelix/l6x.f (Lcom/zelix/l6x;Ljava/lang/Object;)Lcom/zelix/l6x;
      // 72: putfield com/zelix/os.y Lcom/zelix/l6x;
      // 75: aload 0
      // 76: getfield com/zelix/os.X Ljava/util/Map;
      // 79: aload 2
      // 7a: aload 0
      // 7b: getfield com/zelix/os.y Lcom/zelix/l6x;
      // 7e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 83: goto 90
      // 86: ldc2_w 3741319006623539983
      // 89: lload 3
      // 8a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: pop
      // 91: aload 7
      // 93: ifnull b5
      // 96: new com/zelix/n9
      // 99: dup
      // 9a: sipush 21806
      // 9d: ldc2_w 8646703856352354099
      // a0: lload 3
      // a1: lxor
      // a2: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/os.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: invokespecial com/zelix/n9.<init> (Ljava/lang/String;)V
      // aa: athrow
      // ab: ldc2_w 3741319006623539983
      // ae: lload 3
      // af: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: return
   }

   static {
      long var0 = a ^ 100069348801868L;
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
      String var6 = "hKWÐù¤º\u0003\u001c\rÓe\u0014£K\u0090±]Î)\u009dë)Ï\u0080\u001f*Z\u008e\b´ÛøWµ@a}û%8\u001a²Á/\u001e¶\u0095§_qÝÍÙÎ£\u0006²§ÝÀ\u0085\u009fú y)µµ¥>µ¥)³Y\u008cWî®\u008a\u001b\u008ccNo]3½CÔ\u0005@ÍÈ\b\u0090\u0018¬\u001c°©\u0014aFÅá\u0011£¬©ï\u001cE\u0099\u0081â7\u009fHú?";
      int var8 = "hKWÐù¤º\u0003\u001c\rÓe\u0014£K\u0090±]Î)\u009dë)Ï\u0080\u001f*Z\u008e\b´ÛøWµ@a}û%8\u001a²Á/\u001e¶\u0095§_qÝÍÙÎ£\u0006²§ÝÀ\u0085\u009fú y)µµ¥>µ¥)³Y\u008cWî®\u008a\u001b\u008ccNo]3½CÔ\u0005@ÍÈ\b\u0090\u0018¬\u001c°©\u0014aFÅá\u0011£¬©ï\u001cE\u0099\u0081â7\u009fHú?"
         .length();
      char var5 = '(';
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

                  var6 = "3spw3¶\u000fÓD\u0017Ò0Ík\u0080ø!óK@ÕQ²Æ@rwh\u000bº\\R\u0006rpØ\fn\u0090¾8\u0088º\u0091Q¼\u0090í\u00adø`Íy\u001c\u0002\u00ad\u0002j\u009aÆý©\u0091;\u009e\u0086\u009fÕÛ\u0019j\u0095M\u0081gN\\ÁY\u0094\u0013K¿\u0017ð\"ñ¦D\u001fé²¤Êýh ";
                  var8 = "3spw3¶\u000fÓD\u0017Ò0Ík\u0080ø!óK@ÕQ²Æ@rwh\u000bº\\R\u0006rpØ\fn\u0090¾8\u0088º\u0091Q¼\u0090í\u00adø`Íy\u001c\u0002\u00ad\u0002j\u009aÆý©\u0091;\u009e\u0086\u009fÕÛ\u0019j\u0095M\u0081gN\\ÁY\u0094\u0013K¿\u0017ð\"ñ¦D\u001fé²¤Êýh "
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10931;
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
            throw new RuntimeException("com/zelix/os", var10);
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
         throw new RuntimeException("com/zelix/os" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
