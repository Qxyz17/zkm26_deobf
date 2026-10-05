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

public class tx implements sr {
   private HashSet X;
   private HashSet s;
   private HashSet J;
   private static final long a = ess.a(7810665656954998727L, -1221001666549119426L, MethodHandles.lookup().lookupClass()).a(83327893684788L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public int B(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      return -1;
   }

   public tx(HashSet var1, long var2, HashSet var4, HashSet var5) {
      var2 = a ^ var2;
      super();
      x44.a<"v">(this, var1, 5670388833326048391L, var2);
      x44.a<"v">(this, var4, 6330947494372829652L, var2);
      x44.a<"v">(this, var5, 5819664546051094354L, var2);
   }

   public String s(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 67135027577178L;
      return x44.a<"n">(this, new Object[]{var4}, 4257525885383194696L, var2);
   }

   public String i(Object[] param1) {
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
      // 00e: ldc2_w 124769698489904
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w -1057002200846667978
      // 018: lload 2
      // 019: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: istore 6
      // 020: new java/lang/StringBuilder
      // 023: dup
      // 024: invokespecial java/lang/StringBuilder.<init> ()V
      // 027: sipush 3177
      // 02a: ldc2_w 676250401898056568
      // 02d: lload 2
      // 02e: lxor
      // 02f: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/tx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 037: aload 0
      // 038: aload 0
      // 039: ldc2_w -1217036228101143254
      // 03c: lload 2
      // 03d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: lload 4
      // 044: bipush 2
      // 045: anewarray 94
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
      // 056: ldc2_w -1110126533508181979
      // 059: lload 2
      // 05a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: iload 6
      // 061: ifeq 0b3
      // 064: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 067: aload 0
      // 068: ldc2_w -688636972545062791
      // 06b: lload 2
      // 06c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: ifnull 0a4
      // 074: goto 081
      // 077: ldc2_w -970993609696718785
      // 07a: lload 2
      // 07b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aload 0
      // 082: ldc2_w -688636972545062791
      // 085: lload 2
      // 086: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ldc2_w -977135994099484206
      // 08e: lload 2
      // 08f: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: ifne 0b6
      // 097: goto 0a4
      // 09a: ldc2_w -970993609696718785
      // 09d: lload 2
      // 09e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: ldc ""
      // 0a6: goto 0b3
      // 0a9: ldc2_w -970993609696718785
      // 0ac: lload 2
      // 0ad: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: goto 0fb
      // 0b6: new java/lang/StringBuilder
      // 0b9: dup
      // 0ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bd: sipush 6148
      // 0c0: ldc2_w 4840621378696863508
      // 0c3: lload 2
      // 0c4: lxor
      // 0c5: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/tx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: aload 0
      // 0ce: aload 0
      // 0cf: ldc2_w -688636972545062791
      // 0d2: lload 2
      // 0d3: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: lload 4
      // 0da: bipush 2
      // 0db: anewarray 94
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
      // 0ec: ldc2_w -1110126533508181979
      // 0ef: lload 2
      // 0f0: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: sipush 6284
      // 101: ldc2_w 8657939419281547166
      // 104: lload 2
      // 105: lxor
      // 106: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/tx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: aload 0
      // 10f: aload 0
      // 110: ldc2_w -1049644976982272257
      // 113: lload 2
      // 114: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: lload 4
      // 11b: bipush 2
      // 11c: anewarray 94
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
      // 12d: ldc2_w -1110126533508181979
      // 130: lload 2
      // 131: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: ldc ">"
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 141: areturn
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 17700938034797L;
      boolean var10000 = x44.a<"r">(-3571758921054728180L, var1);
      int var4 = 0;
      boolean var3 = var10000;

      label41: {
         label40: {
            try {
               var7 = x44.a<"n">(this, -3447960944531391984L, var1);
               if (!var3) {
                  break label41;
               }

               if (var7 == null) {
                  break label40;
               }
            } catch (gj var6) {
               throw x44.a<"r">(var6, -3622019714524156155L, var1);
            }

            var4 = x44.a<"n">(this, -3447960944531391984L, var1).hashCode();
         }

         var7 = x44.a<"n">(this, -3942006041183946941L, var1);
      }

      label32: {
         label31: {
            try {
               if (!var3) {
                  break label32;
               }

               if (var7 == null) {
                  break label31;
               }
            } catch (gj var5) {
               throw x44.a<"r">(var5, -3622019714524156155L, var1);
            }

            var4 ^= x44.a<"n">(this, -3942006041183946941L, var1).hashCode();
         }

         var7 = x44.a<"n">(this, -3579025512821167675L, var1);
      }

      if (var7 != null) {
         var4 ^= x44.a<"n">(this, -3579025512821167675L, var1).hashCode();
      }

      return var4;
   }

   public tx(long var1, HashSet var3, HashSet var4) {
      var1 = a ^ var1;
      super();
      x44.a<"p">(this, var3, -8532258467520748639L, var1);
      x44.a<"p">(this, var4, -7501437137801596812L, var1);
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
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
      // 000: getstatic com/zelix/tx.a J
      // 003: ldc2_w 971144790833
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 3091185168924
      // 00d: lxor
      // 00e: lstore 4
      // 010: pop2
      // 011: ldc2_w -2075454829679772336
      // 014: lload 2
      // 015: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: istore 6
      // 01c: aload 1
      // 01d: instanceof com/zelix/tx
      // 020: iload 6
      // 022: ifeq 143
      // 025: ifeq 142
      // 028: goto 035
      // 02b: ldc2_w -2242774224371367335
      // 02e: lload 2
      // 02f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: athrow
      // 035: aload 1
      // 036: checkcast com/zelix/tx
      // 039: astore 7
      // 03b: aload 0
      // 03c: aload 0
      // 03d: ldc2_w -181708372382640308
      // 040: lload 2
      // 041: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: aload 7
      // 048: ldc2_w -181708372382640308
      // 04b: lload 2
      // 04c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: lload 4
      // 053: bipush 3
      // 054: anewarray 94
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
      // 06a: ldc2_w -2237763224491825898
      // 06d: lload 2
      // 06e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: iload 6
      // 075: ifeq 0cd
      // 078: ifeq 140
      // 07b: goto 088
      // 07e: ldc2_w -2242774224371367335
      // 081: lload 2
      // 082: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: aload 0
      // 089: aload 0
      // 08a: ldc2_w -2011069854191494625
      // 08d: lload 2
      // 08e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 7
      // 095: ldc2_w -2011069854191494625
      // 098: lload 2
      // 099: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: lload 4
      // 0a0: bipush 3
      // 0a1: anewarray 94
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
      // 0b7: ldc2_w -2237763224491825898
      // 0ba: lload 2
      // 0bb: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: goto 0cd
      // 0c3: ldc2_w -2242774224371367335
      // 0c6: lload 2
      // 0c7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: iload 6
      // 0cf: ifeq 127
      // 0d2: ifeq 140
      // 0d5: goto 0e2
      // 0d8: ldc2_w -2242774224371367335
      // 0db: lload 2
      // 0dc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: aload 0
      // 0e4: ldc2_w -2087225216091962215
      // 0e7: lload 2
      // 0e8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 7
      // 0ef: ldc2_w -2087225216091962215
      // 0f2: lload 2
      // 0f3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: lload 4
      // 0fa: bipush 3
      // 0fb: anewarray 94
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
      // 111: ldc2_w -2237763224491825898
      // 114: lload 2
      // 115: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: goto 127
      // 11d: ldc2_w -2242774224371367335
      // 120: lload 2
      // 121: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: iload 6
      // 129: ifeq 13d
      // 12c: ifeq 140
      // 12f: goto 13c
      // 132: ldc2_w -2242774224371367335
      // 135: lload 2
      // 136: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: bipush 1
      // 13d: goto 141
      // 140: bipush 0
      // 141: ireturn
      // 142: bipush 0
      // 143: ireturn
   }

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 135986204036823L;
      return x44.a<"k">(this, new Object[]{var4}, 8401609821942577093L, var2);
   }

   private boolean k(Object[] param1) {
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
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/HashSet
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: getstatic com/zelix/tx.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: ldc2_w -244534007678756978
      // 24: lload 3
      // 25: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: istore 6
      // 2c: aload 5
      // 2e: iload 6
      // 30: ifne 70
      // 33: ifnull 6f
      // 36: goto 43
      // 39: ldc2_w -276858526741406063
      // 3c: lload 3
      // 3d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 2
      // 44: iload 6
      // 46: ifne 68
      // 49: goto 56
      // 4c: ldc2_w -276858526741406063
      // 4f: lload 3
      // 50: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: ifnull 6d
      // 59: goto 66
      // 5c: ldc2_w -276858526741406063
      // 5f: lload 3
      // 60: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 5
      // 68: aload 2
      // 69: invokevirtual java/util/HashSet.equals (Ljava/lang/Object;)Z
      // 6c: ireturn
      // 6d: bipush 0
      // 6e: ireturn
      // 6f: aload 2
      // 70: ifnonnull 81
      // 73: bipush 1
      // 74: goto 82
      // 77: ldc2_w -276858526741406063
      // 7a: lload 3
      // 7b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
   }

   private String f(Object[] param1) {
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
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/tx.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 6250470033636
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: new java/lang/StringBuffer
      // 26: dup
      // 27: invokespecial java/lang/StringBuffer.<init> ()V
      // 2a: astore 8
      // 2c: ldc2_w 4238178504234357188
      // 2f: lload 2
      // 30: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 8
      // 37: ldc "["
      // 39: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 3c: pop
      // 3d: istore 7
      // 3f: aload 4
      // 41: ldc2_w 2701908456553683508
      // 44: lload 2
      // 45: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: astore 9
      // 4c: aload 9
      // 4e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 53: ifeq e1
      // 56: aload 9
      // 58: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5d: checkcast com/zelix/sr
      // 60: astore 10
      // 62: lload 2
      // 63: lconst_0
      // 64: lcmp
      // 65: ifle 8d
      // 68: aload 8
      // 6a: aload 10
      // 6c: lload 5
      // 6e: bipush 1
      // 6f: anewarray 94
      // 72: dup_x2
      // 73: dup_x2
      // 74: pop
      // 75: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 78: bipush 0
      // 79: swap
      // 7a: aastore
      // 7b: ldc2_w 4318566794248279774
      // 7e: lload 2
      // 7f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 87: iload 7
      // 89: ifne db
      // 8c: pop
      // 8d: iload 7
      // 8f: ifne ef
      // 92: goto 9f
      // 95: ldc2_w 4207017204460394715
      // 98: lload 2
      // 99: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: aload 9
      // a1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a6: lload 2
      // a7: lconst_0
      // a8: lcmp
      // a9: ifle de
      // ac: ifeq dc
      // af: goto bc
      // b2: ldc2_w 4207017204460394715
      // b5: lload 2
      // b6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: athrow
      // bc: aload 8
      // be: sipush 6869
      // c1: ldc2_w 600697294908003618
      // c4: lload 2
      // c5: lxor
      // c6: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/tx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // ce: goto db
      // d1: ldc2_w 4207017204460394715
      // d4: lload 2
      // d5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da: athrow
      // db: pop
      // dc: iload 7
      // de: ifeq 4c
      // e1: aload 8
      // e3: ldc "]"
      // e5: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // e8: pop
      // e9: lload 2
      // ea: lconst_0
      // eb: lcmp
      // ec: iflt ef
      // ef: aload 8
      // f1: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // f4: areturn
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   static {
      long var0 = a ^ 85753292385762L;
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
      String var6 = "ùX`\u0098-\u0000ÂÑÍA·àâ|s\t\u0010+'hð6ÿä1îYÓÞN\u0006s\\";
      int var8 = "ùX`\u0098-\u0000ÂÑÍA·àâ|s\t\u0010+'hð6ÿä1îYÓÞN\u0006s\\".length();
      char var5 = 16;
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
                     c = var9;
                     d = new String[4];
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

                  var6 = "t^r\r;\u0013Å-T\u0017V\u0084a\u001fÅ*Ô\u0089\u000báB\u0000øÀÜ\u0086\n\u0012Õ\u00930¥×\u0096\u0080v\u007fN\u0095¥\u0018\u001dó¹Î¯Ö6<z\u0092}\rÚl]£\u009b\u009fÿÃ\u001aK\u0015³";
                  var8 = "t^r\r;\u0013Å-T\u0017V\u0084a\u001fÅ*Ô\u0089\u000báB\u0000øÀÜ\u0086\n\u0012Õ\u00930¥×\u0096\u0080v\u007fN\u0095¥\u0018\u001dó¹Î¯Ö6<z\u0092}\rÚl]£\u009b\u009fÿÃ\u001aK\u0015³"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14480;
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
            throw new RuntimeException("com/zelix/tx", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("com/zelix/tx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
