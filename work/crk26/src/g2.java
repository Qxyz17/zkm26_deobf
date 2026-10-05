package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g2 implements lmw {
   private HashSet d;
   private HashSet u;
   private HashSet R;
   private static final long a = prr.a(6973838772026042758L, 332624601802393227L, MethodHandles.lookup().lookupClass()).a(87744889924503L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);

   public boolean S(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String D(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public int n(Object[] var1) {
      long var2 = (Long)var1[0];
      return -1;
   }

   public boolean Y(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public g2(HashSet var1, HashSet var2, long var3) {
      var3 = a ^ var3;
      super();
      m44.a<"u">(this, var1, -2398523560613039482L, var3);
      m44.a<"u">(this, var2, -2878280609772279757L, var3);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/g2.a J
      // 003: ldc2_w 17438101918686
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 98675950003279
      // 00d: lxor
      // 00e: lstore 4
      // 010: pop2
      // 011: ldc2_w 476155575031951947
      // 014: lload 2
      // 015: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: astore 6
      // 01c: aload 1
      // 01d: instanceof com/zelix/g2
      // 020: aload 6
      // 022: ifnonnull 143
      // 025: ifeq 142
      // 028: goto 035
      // 02b: ldc2_w 1933776254337425609
      // 02e: lload 2
      // 02f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: athrow
      // 035: aload 1
      // 036: checkcast com/zelix/g2
      // 039: astore 7
      // 03b: aload 0
      // 03c: aload 0
      // 03d: ldc2_w 1929423656033056502
      // 040: lload 2
      // 041: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: aload 7
      // 048: ldc2_w 1929423656033056502
      // 04b: lload 2
      // 04c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: lload 4
      // 053: bipush 3
      // 054: anewarray 295
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
      // 06a: ldc2_w 52106069358190033
      // 06d: lload 2
      // 06e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 6
      // 075: ifnonnull 0cd
      // 078: ifeq 140
      // 07b: goto 088
      // 07e: ldc2_w 1933776254337425609
      // 081: lload 2
      // 082: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: aload 0
      // 089: aload 0
      // 08a: ldc2_w 440978516478956545
      // 08d: lload 2
      // 08e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 7
      // 095: ldc2_w 440978516478956545
      // 098: lload 2
      // 099: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: lload 4
      // 0a0: bipush 3
      // 0a1: anewarray 295
      // 0a4: dup_x2
      // 0a5: dup_x2
      // 0a6: pop
      // 0a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aa: bipush 2
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x1
      // 0ae: swap
      // 0af: bipush 1
      // 0b0: swap
      // 0b1: aastore
      // 0b2: dup_x1
      // 0b3: swap
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: ldc2_w 52106069358190033
      // 0ba: lload 2
      // 0bb: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: goto 0cd
      // 0c3: ldc2_w 1933776254337425609
      // 0c6: lload 2
      // 0c7: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 6
      // 0cf: ifnonnull 127
      // 0d2: ifeq 140
      // 0d5: goto 0e2
      // 0d8: ldc2_w 1933776254337425609
      // 0db: lload 2
      // 0dc: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: aload 0
      // 0e4: ldc2_w 2053148956882644035
      // 0e7: lload 2
      // 0e8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 7
      // 0ef: ldc2_w 2053148956882644035
      // 0f2: lload 2
      // 0f3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: lload 4
      // 0fa: bipush 3
      // 0fb: anewarray 295
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 2
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: bipush 1
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 0
      // 10f: swap
      // 110: aastore
      // 111: ldc2_w 52106069358190033
      // 114: lload 2
      // 115: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: goto 127
      // 11d: ldc2_w 1933776254337425609
      // 120: lload 2
      // 121: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 6
      // 129: ifnonnull 13d
      // 12c: ifeq 140
      // 12f: goto 13c
      // 132: ldc2_w 1933776254337425609
      // 135: lload 2
      // 136: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: bipush 1
      // 13d: goto 141
      // 140: bipush 0
      // 141: ireturn
      // 142: bipush 0
      // 143: ireturn
   }

   public String B(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 16565095633710L;
      return m44.a<"u">(this, new Object[]{var4}, 8987491227323068527L, var2);
   }

   private boolean J(Object[] param1) {
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
      // 04: checkcast java/util/HashSet
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/HashSet
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: getstatic com/zelix/g2.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: ldc2_w 7272330341031645244
      // 25: lload 2
      // 26: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 6
      // 2d: aload 4
      // 2f: aload 6
      // 31: ifnonnull 74
      // 34: ifnull 72
      // 37: goto 44
      // 3a: ldc2_w 8692231310556218046
      // 3d: lload 2
      // 3e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 5
      // 46: aload 6
      // 48: ifnonnull 6a
      // 4b: goto 58
      // 4e: ldc2_w 8692231310556218046
      // 51: lload 2
      // 52: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: ifnull 70
      // 5b: goto 68
      // 5e: ldc2_w 8692231310556218046
      // 61: lload 2
      // 62: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 4
      // 6a: aload 5
      // 6c: invokevirtual java/util/HashSet.equals (Ljava/lang/Object;)Z
      // 6f: ireturn
      // 70: bipush 0
      // 71: ireturn
      // 72: aload 5
      // 74: ifnonnull 85
      // 77: bipush 1
      // 78: goto 86
      // 7b: ldc2_w 8692231310556218046
      // 7e: lload 2
      // 7f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: bipush 0
      // 86: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 7286103646445L;
      String[] var10000 = m44.a<"j">(8478217087177294200L, var1);
      int var4 = 0;
      String[] var3 = var10000;

      label41: {
         label40: {
            try {
               var7 = m44.a<"t">(this, 7635213165555713477L, var1);
               if (var3 != null) {
                  break label41;
               }

               if (var7 == null) {
                  break label40;
               }
            } catch (n9 var6) {
               throw m44.a<"j">(var6, 7630555985469133818L, var1);
            }

            var4 = m44.a<"t">(this, 7635213165555713477L, var1).hashCode();
         }

         var7 = m44.a<"t">(this, 8443583975016818482L, var1);
      }

      label32: {
         label31: {
            try {
               if (var3 != null) {
                  break label32;
               }

               if (var7 == null) {
                  break label31;
               }
            } catch (n9 var5) {
               throw m44.a<"j">(var5, 7630555985469133818L, var1);
            }

            var4 ^= m44.a<"t">(this, 8443583975016818482L, var1).hashCode();
         }

         var7 = m44.a<"t">(this, 8020147211028684656L, var1);
      }

      if (var7 != null) {
         var4 ^= m44.a<"t">(this, 8020147211028684656L, var1).hashCode();
      }

      return var4;
   }

   public String x(Object[] param1) {
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
      // 00e: ldc2_w 116331213857277
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w 1888294398372277988
      // 018: lload 2
      // 019: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: astore 6
      // 020: new java/lang/StringBuilder
      // 023: dup
      // 024: invokespecial java/lang/StringBuilder.<init> ()V
      // 027: sipush 13246
      // 02a: ldc2_w 1923099270401840475
      // 02d: lload 2
      // 02e: lxor
      // 02f: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/g2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 037: aload 0
      // 038: aload 0
      // 039: ldc2_w 462047421751028313
      // 03c: lload 2
      // 03d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: lload 4
      // 044: bipush 2
      // 045: anewarray 295
      // 048: dup_x2
      // 049: dup_x2
      // 04a: pop
      // 04b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04e: bipush 1
      // 04f: swap
      // 050: aastore
      // 051: dup_x1
      // 052: swap
      // 053: bipush 0
      // 054: swap
      // 055: aastore
      // 056: ldc2_w 2249213211931003915
      // 059: lload 2
      // 05a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: aload 6
      // 061: ifnonnull 0b3
      // 064: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 067: aload 0
      // 068: ldc2_w 1923492955851688110
      // 06b: lload 2
      // 06c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: ifnull 0a4
      // 074: goto 081
      // 077: ldc2_w 466424346623163494
      // 07a: lload 2
      // 07b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aload 0
      // 082: ldc2_w 1923492955851688110
      // 085: lload 2
      // 086: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ldc2_w 1791635903166663202
      // 08e: lload 2
      // 08f: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: ifne 0b6
      // 097: goto 0a4
      // 09a: ldc2_w 466424346623163494
      // 09d: lload 2
      // 09e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: ldc ""
      // 0a6: goto 0b3
      // 0a9: ldc2_w 466424346623163494
      // 0ac: lload 2
      // 0ad: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: goto 0fb
      // 0b6: new java/lang/StringBuilder
      // 0b9: dup
      // 0ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bd: sipush 16714
      // 0c0: ldc2_w 2913168221090850733
      // 0c3: lload 2
      // 0c4: lxor
      // 0c5: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/g2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: aload 0
      // 0ce: aload 0
      // 0cf: ldc2_w 1923492955851688110
      // 0d2: lload 2
      // 0d3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: lload 4
      // 0da: bipush 2
      // 0db: anewarray 295
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: bipush 0
      // 0ea: swap
      // 0eb: aastore
      // 0ec: ldc2_w 2249213211931003915
      // 0ef: lload 2
      // 0f0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: sipush 8401
      // 101: ldc2_w 927425587704481335
      // 104: lload 2
      // 105: lxor
      // 106: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/g2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: aload 0
      // 10f: aload 0
      // 110: ldc2_w 58957050570027244
      // 113: lload 2
      // 114: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: lload 4
      // 11b: bipush 2
      // 11c: anewarray 295
      // 11f: dup_x2
      // 120: dup_x2
      // 121: pop
      // 122: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 125: bipush 1
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 0
      // 12b: swap
      // 12c: aastore
      // 12d: ldc2_w 2249213211931003915
      // 130: lload 2
      // 131: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: ldc ">"
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 141: areturn
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   private String L(Object[] param1) {
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
      // 04: checkcast java/util/HashSet
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/g2.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 23504640174021
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 9075180549943626017
      // 25: lload 3
      // 26: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: new java/lang/StringBuffer
      // 2e: dup
      // 2f: invokespecial java/lang/StringBuffer.<init> ()V
      // 32: astore 8
      // 34: astore 7
      // 36: aload 8
      // 38: ldc "["
      // 3a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 3d: pop
      // 3e: aload 2
      // 3f: ldc2_w 9213331877176153509
      // 42: lload 3
      // 43: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: astore 9
      // 4a: aload 9
      // 4c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 51: ifeq d9
      // 54: aload 9
      // 56: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5b: checkcast com/zelix/lmw
      // 5e: astore 10
      // 60: lload 3
      // 61: lconst_0
      // 62: lcmp
      // 63: ifle 8b
      // 66: aload 8
      // 68: aload 10
      // 6a: lload 5
      // 6c: bipush 1
      // 6d: anewarray 295
      // 70: dup_x2
      // 71: dup_x2
      // 72: pop
      // 73: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 76: bipush 0
      // 77: swap
      // 78: aastore
      // 79: ldc2_w 8664365831295982741
      // 7c: lload 3
      // 7d: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 85: aload 7
      // 87: ifnonnull d3
      // 8a: pop
      // 8b: aload 7
      // 8d: ifnonnull e7
      // 90: goto 9d
      // 93: ldc2_w 7042511718281075619
      // 96: lload 3
      // 97: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: aload 9
      // 9f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a4: ifeq d4
      // a7: goto b4
      // aa: ldc2_w 7042511718281075619
      // ad: lload 3
      // ae: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: aload 8
      // b6: sipush 14071
      // b9: ldc2_w 614467509289596886
      // bc: lload 3
      // bd: lxor
      // be: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/g2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // c6: goto d3
      // c9: ldc2_w 7042511718281075619
      // cc: lload 3
      // cd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: athrow
      // d3: pop
      // d4: aload 7
      // d6: ifnull 4a
      // d9: aload 8
      // db: ldc "]"
      // dd: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // e0: pop
      // e1: lload 3
      // e2: lconst_0
      // e3: lcmp
      // e4: ifle e7
      // e7: aload 8
      // e9: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // ec: areturn
   }

   public g2(long var1, HashSet var3, HashSet var4, HashSet var5) {
      var1 = a ^ var1;
      super();
      m44.a<"u">(this, var3, -3405002945384924018L, var1);
      m44.a<"u">(this, var4, -3718032839028547975L, var1);
      m44.a<"u">(this, var5, -3024713254740040133L, var1);
   }

   public String U(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 46917996190177L;
      return m44.a<"r">(this, new Object[]{var4}, 8536254357251619488L, var2);
   }

   static {
      long var0 = a ^ 91000670959996L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = " \u009eßÀEÆÁ\b\\^\u001d\"G\u0015æc×?\u0002d\u0099\u0088:\fQÛ#ª\u000b/¬f\u008bé\u0090ÛUO2¼\u0010É\u0006çY\u0006HËÿK,N´»ù\u009d\u0004";
      int var8 = " \u009eßÀEÆÁ\b\\^\u001d\"G\u0015æc×?\u0002d\u0099\u0088:\fQÛ#ª\u000b/¬f\u008bé\u0090ÛUO2¼\u0010É\u0006çY\u0006HËÿK,N´»ù\u009d\u0004".length();
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
                     c = new String[4];
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

                  var6 = "f_\f\u0081ö>reü%\"Z\u0004Õ!:®(ç\u0080ù\u0010îE\u0010@\u008düÙuY,ýäõôxñ;\u009by";
                  var8 = "f_\f\u0081ö>reü%\"Z\u0004Õ!:®(ç\u0080ù\u0010îE\u0010@\u008düÙuY,ýäõôxñ;\u009by".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28588;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/g2", var10);
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
         throw new RuntimeException("com/zelix/g2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
