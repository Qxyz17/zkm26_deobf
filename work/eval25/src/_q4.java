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

public class _q4 extends _ni implements _r4, qk, _y9 {
   private String c;
   private String t;
   private String M;
   private String j;
   private List U;
   private List q;
   private String z;
   private List u;
   private List C;
   private static final long a = ess.a(-3140097693491165249L, 1999877086752633676L, MethodHandles.lookup().lookupClass()).a(26632137511949L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map k;

   public String e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 39420928533366L;
      return x44.a<"i">(this, new Object[]{var4}, -6742035130356767907L, var2);
   }

   boolean T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = x44.a<"q">(7457365165367426397L, var2);

      try {
         boolean var10000 = x44.a<"m">(this, 7395852049665564508L, var2).isEmpty();
         if (var4 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, 8989657038351999409L, var2);
      }

      return false;
   }

   List i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 7307984252170607764L, var2);
   }

   public boolean c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = x44.a<"q">(-2176401951826621847L, var2);

      try {
         boolean var10000 = x44.a<"m">(this, -514116413685898416L, var2).isEmpty();
         if (var4 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, -355239119799441823L, var2);
      }

      return false;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private String f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var10000 = x44.a<"w">(3440073815796843551L, var2);
      StringBuilder var5 = new StringBuilder();
      int var4 = var10000;

      label39:
      for (String var11 : x44.a<"k">(this, 3939304715515604262L, var2)) {
         if (var2 <= 0L) {
            return var11;
         }

         String var7 = var11;

         try {
            var5.append(var7);
         } catch (gj var9) {
            boolean var10001 = false;
            throw x44.a<"w">(var9, 3848232402116798487L, var2);
         }

         do {
            try {
               StringBuilder var13 = var5.append((char)b<"v">(9824, 5757473344744839906L ^ var2));
               if (var4 == 0) {
                  return var13.toString();
               }

               if (var4 != 0) {
                  continue label39;
               }
            } catch (gj var8) {
               boolean var14 = false;
               throw x44.a<"w">(var8, 3848232402116798487L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var5.toString();
   }

   public boolean U(Object[] param1) {
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
      // 0c: getstatic com/zelix/_q4.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -146423932862835115
      // 15: lload 2
      // 16: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -93562817498827999
      // 21: lload 2
      // 22: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifeq 53
      // 2c: ifnull 6f
      // 2f: goto 3c
      // 32: ldc2_w -1788494034244191651
      // 35: lload 2
      // 36: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -93562817498827999
      // 40: lload 2
      // 41: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w -1788494034244191651
      // 4c: lload 2
      // 4d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: invokevirtual java/lang/String.length ()I
      // 56: iload 4
      // 58: ifeq 6c
      // 5b: ifle 6f
      // 5e: goto 6b
      // 61: ldc2_w -1788494034244191651
      // 64: lload 2
      // 65: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   boolean V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = x44.a<"r">(578393162233647654L, var2);

      try {
         boolean var10000 = x44.a<"n">(this, 1574451398289904985L, var2).isEmpty();
         if (var4 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var5) {
         throw x44.a<"r">(var5, 1421610179579137738L, var2);
      }

      return false;
   }

   private String C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 30708835855410L;
      StringBuilder var6 = new StringBuilder();
      var6.append((char)b<"v">(894, 8227154066499004940L ^ var2));
      var6.append(x44.a<"v">(new Object[]{x44.a<"j">(this, -5113630888439286630L, var2), var4}, -5171860162635566432L, var2));
      var6.append((char)b<"v">(7740, 2112027151562929997L ^ var2));
      return var6.toString();
   }

   public void B(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"v">(this, var4, -5578852223418794239L, var2);
   }

   public _q4(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 50767444672555L;
      super(var4, var3);
      x44.a<"q">(this, new ArrayList(), -2423369329420220973L, var1);
      x44.a<"q">(this, new ArrayList(), -2354938196249800009L, var1);
      x44.a<"q">(this, new ArrayList(), -4039709747988414961L, var1);
      x44.a<"q">(this, new ArrayList(), -2598043133332022415L, var1);
   }

   void w(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = a ^ var3;
      x44.a<"l">(this, 3426085397809590027L, var3).add(var2);
   }

   public void N(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"i">(this, 3758671899281534884L, var3).add(var2);
   }

   List J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 4379938227043365166L, var2);
   }

   void C(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/_uu
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: getstatic com/zelix/_q4.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 60955526194927
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: ldc2_w 5835496918542961371
      // 2d: lload 3
      // 2e: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: istore 8
      // 35: aload 0
      // 36: iload 8
      // 38: ifne c1
      // 3b: ldc2_w 5484647556154648344
      // 3e: lload 3
      // 3f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: ifnull c0
      // 47: goto 54
      // 4a: ldc2_w 5424470227422582327
      // 4d: lload 3
      // 4e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 2
      // 55: new java/lang/StringBuilder
      // 58: dup
      // 59: invokespecial java/lang/StringBuilder.<init> ()V
      // 5c: sipush 4049
      // 5f: ldc2_w 8231928909502323670
      // 62: lload 3
      // 63: lxor
      // 64: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c: aload 5
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: sipush 15027
      // 74: ldc2_w 337095127217516214
      // 77: lload 3
      // 78: lxor
      // 79: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81: aload 0
      // 82: ldc2_w 5484647556154648344
      // 85: lload 3
      // 86: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8e: ldc "'"
      // 90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 96: lload 6
      // 98: bipush 2
      // 99: anewarray 406
      // 9c: dup_x2
      // 9d: dup_x2
      // 9e: pop
      // 9f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a2: bipush 1
      // a3: swap
      // a4: aastore
      // a5: dup_x1
      // a6: swap
      // a7: bipush 0
      // a8: swap
      // a9: aastore
      // aa: ldc2_w 5752865621014278650
      // ad: lload 3
      // ae: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: goto c0
      // b6: ldc2_w 5424470227422582327
      // b9: lload 3
      // ba: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: aload 0
      // c1: aload 5
      // c3: ldc2_w 5484647556154648344
      // c6: lload 3
      // c7: invokedynamic t (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: return
   }

   String D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 111495909921203L;
      return x44.a<"m">(this, new Object[]{var4}, 8361123333991399533L, var2);
   }

   void F(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/_uu
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic com/zelix/_q4.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 25984906905933
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w 9176639862717736313
      // 30: lload 4
      // 32: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: istore 8
      // 39: aload 0
      // 3a: iload 8
      // 3c: ifne cb
      // 3f: ldc2_w 7158777395747354079
      // 42: lload 4
      // 44: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: ifnull ca
      // 4c: goto 5a
      // 4f: ldc2_w 7270417545720347029
      // 52: lload 4
      // 54: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 2
      // 5b: new java/lang/StringBuilder
      // 5e: dup
      // 5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 62: sipush 29407
      // 65: ldc2_w 3363627339015997821
      // 68: lload 4
      // 6a: lxor
      // 6b: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 73: aload 3
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: sipush 30528
      // 7a: ldc2_w 865046923121872106
      // 7d: lload 4
      // 7f: lxor
      // 80: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88: aload 0
      // 89: ldc2_w 7158777395747354079
      // 8c: lload 4
      // 8e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 96: ldc "'"
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9e: lload 6
      // a0: bipush 2
      // a1: anewarray 406
      // a4: dup_x2
      // a5: dup_x2
      // a6: pop
      // a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // aa: bipush 1
      // ab: swap
      // ac: aastore
      // ad: dup_x1
      // ae: swap
      // af: bipush 0
      // b0: swap
      // b1: aastore
      // b2: ldc2_w 6950294607834242648
      // b5: lload 4
      // b7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: goto ca
      // bf: ldc2_w 7270417545720347029
      // c2: lload 4
      // c4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: athrow
      // ca: aload 0
      // cb: aload 3
      // cc: ldc2_w 7158777395747354079
      // cf: lload 4
      // d1: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: return
   }

   public String H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 47031125149378L;
      return x44.a<"l">(this, new Object[]{var4}, 1354997052400781965L, var2);
   }

   public final void K(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/az
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_uu
      // 019: astore 3
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 0
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 15765287379933
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 40659853048087
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 61084179180318
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 93842937350952
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 3040651286911
      // 044: lxor
      // 045: lstore 16
      // 047: dup2
      // 048: ldc2_w 139324542296055
      // 04b: lxor
      // 04c: lstore 18
      // 04e: dup2
      // 04f: ldc2_w 101216835141935
      // 052: lxor
      // 053: lstore 20
      // 055: dup2
      // 056: ldc2_w 44279685464663
      // 059: lxor
      // 05a: lstore 22
      // 05c: dup2
      // 05d: ldc2_w 101507837958073
      // 060: lxor
      // 061: lstore 24
      // 063: dup2
      // 064: ldc2_w 102075380350535
      // 067: lxor
      // 068: lstore 26
      // 06a: dup2
      // 06b: ldc2_w 40344672083216
      // 06e: lxor
      // 06f: lstore 28
      // 071: dup2
      // 072: ldc2_w 89968223186826
      // 075: lxor
      // 076: lstore 30
      // 078: dup2
      // 079: ldc2_w 67543711075120
      // 07c: lxor
      // 07d: dup2
      // 07e: bipush 48
      // 080: lushr
      // 081: l2i
      // 082: istore 32
      // 084: dup2
      // 085: bipush 16
      // 087: lshl
      // 088: bipush 32
      // 08a: lushr
      // 08b: l2i
      // 08c: istore 33
      // 08e: dup2
      // 08f: bipush 48
      // 091: lshl
      // 092: bipush 48
      // 094: lushr
      // 095: l2i
      // 096: istore 34
      // 098: pop2
      // 099: dup2
      // 09a: ldc2_w 47122815691702
      // 09d: lxor
      // 09e: lstore 35
      // 0a0: dup2
      // 0a1: ldc2_w 125856825183713
      // 0a4: lxor
      // 0a5: lstore 37
      // 0a7: dup2
      // 0a8: ldc2_w 6961601372714
      // 0ab: lxor
      // 0ac: lstore 39
      // 0ae: dup2
      // 0af: ldc2_w 26606550269691
      // 0b2: lxor
      // 0b3: lstore 41
      // 0b5: dup2
      // 0b6: ldc2_w 18013617099839
      // 0b9: lxor
      // 0ba: lstore 43
      // 0bc: dup2
      // 0bd: ldc2_w 12703793543226
      // 0c0: lxor
      // 0c1: lstore 45
      // 0c3: pop2
      // 0c4: ldc2_w 3018414783042270147
      // 0c7: lload 4
      // 0c9: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: bipush 0
      // 0cf: istore 48
      // 0d1: istore 47
      // 0d3: iload 48
      // 0d5: aload 0
      // 0d6: lload 20
      // 0d8: bipush 1
      // 0d9: anewarray 406
      // 0dc: dup_x2
      // 0dd: dup_x2
      // 0de: pop
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: bipush 0
      // 0e3: swap
      // 0e4: aastore
      // 0e5: ldc2_w 3459742712771822671
      // 0e8: lload 4
      // 0ea: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: if_icmpge 164
      // 0f2: aload 0
      // 0f3: iload 48
      // 0f5: lload 30
      // 0f7: bipush 2
      // 0f8: anewarray 406
      // 0fb: dup_x2
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 101: bipush 1
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 109: bipush 0
      // 10a: swap
      // 10b: aastore
      // 10c: ldc2_w 3156618655040194173
      // 10f: lload 4
      // 111: lload 4
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 142
      // 118: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: iload 47
      // 11f: ifne 17e
      // 122: lload 6
      // 124: aload 0
      // 125: aload 3
      // 126: bipush 3
      // 127: anewarray 406
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 2
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 1
      // 132: swap
      // 133: aastore
      // 134: dup_x2
      // 135: dup_x2
      // 136: pop
      // 137: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13a: bipush 0
      // 13b: swap
      // 13c: aastore
      // 13d: ldc2_w 3570806773825883371
      // 140: lload 4
      // 142: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: iinc 48 1
      // 14a: iload 47
      // 14c: ifeq 0d3
      // 14f: lload 4
      // 151: lconst_0
      // 152: lcmp
      // 153: ifle 0f2
      // 156: goto 164
      // 159: ldc2_w 3629865195587956527
      // 15c: lload 4
      // 15e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: aload 0
      // 165: lload 45
      // 167: bipush 1
      // 168: anewarray 406
      // 16b: dup_x2
      // 16c: dup_x2
      // 16d: pop
      // 16e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 171: bipush 0
      // 172: swap
      // 173: aastore
      // 174: ldc2_w 3905488149096465397
      // 177: lload 4
      // 179: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: checkcast com/zelix/_nj
      // 181: astore 48
      // 183: aload 0
      // 184: iload 47
      // 186: lload 4
      // 188: lconst_0
      // 189: lcmp
      // 18a: iflt 1ff
      // 18d: ifne 1f6
      // 190: ldc2_w 3153003609950971475
      // 193: lload 4
      // 195: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: ifnull 1f5
      // 19d: goto 1ab
      // 1a0: ldc2_w 3629865195587956527
      // 1a3: lload 4
      // 1a5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: aload 48
      // 1ad: aload 0
      // 1ae: lload 35
      // 1b0: bipush 1
      // 1b1: anewarray 406
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 0
      // 1bb: swap
      // 1bc: aastore
      // 1bd: ldc2_w 3075804359576054685
      // 1c0: lload 4
      // 1c2: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: lload 8
      // 1c9: dup2_x1
      // 1ca: pop2
      // 1cb: bipush 2
      // 1cc: anewarray 406
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 1
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x2
      // 1d5: dup_x2
      // 1d6: pop
      // 1d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1da: bipush 0
      // 1db: swap
      // 1dc: aastore
      // 1dd: ldc2_w 3454969247177666211
      // 1e0: lload 4
      // 1e2: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: goto 1f5
      // 1ea: ldc2_w 3629865195587956527
      // 1ed: lload 4
      // 1ef: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: aload 0
      // 1f6: lload 4
      // 1f8: lconst_0
      // 1f9: lcmp
      // 1fa: ifle 26b
      // 1fd: iload 47
      // 1ff: ifne 26b
      // 202: ldc2_w 3572283689382914590
      // 205: lload 4
      // 207: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: invokeinterface java/util/List.size ()I 1
      // 211: ifle 26a
      // 214: goto 222
      // 217: ldc2_w 3629865195587956527
      // 21a: lload 4
      // 21c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 48
      // 224: aload 0
      // 225: lload 26
      // 227: bipush 1
      // 228: anewarray 406
      // 22b: dup_x2
      // 22c: dup_x2
      // 22d: pop
      // 22e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 231: bipush 0
      // 232: swap
      // 233: aastore
      // 234: ldc2_w 3046857444073927176
      // 237: lload 4
      // 239: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: lload 14
      // 240: bipush 2
      // 241: anewarray 406
      // 244: dup_x2
      // 245: dup_x2
      // 246: pop
      // 247: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24a: bipush 1
      // 24b: swap
      // 24c: aastore
      // 24d: dup_x1
      // 24e: swap
      // 24f: bipush 0
      // 250: swap
      // 251: aastore
      // 252: ldc2_w 3634145341234099898
      // 255: lload 4
      // 257: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: goto 26a
      // 25f: ldc2_w 3629865195587956527
      // 262: lload 4
      // 264: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: aload 0
      // 26b: ldc2_w 3820503993498050048
      // 26e: lload 4
      // 270: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: lload 4
      // 277: lconst_0
      // 278: lcmp
      // 279: ifle 2be
      // 27c: iload 47
      // 27e: ifne 2be
      // 281: ifnonnull 2c1
      // 284: goto 292
      // 287: ldc2_w 3629865195587956527
      // 28a: lload 4
      // 28c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: athrow
      // 292: aload 0
      // 293: iload 47
      // 295: ifne 30c
      // 298: goto 2a6
      // 29b: ldc2_w 3629865195587956527
      // 29e: lload 4
      // 2a0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: ldc2_w 4018713721111191744
      // 2a9: lload 4
      // 2ab: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: goto 2be
      // 2b3: ldc2_w 3629865195587956527
      // 2b6: lload 4
      // 2b8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: ifnull 30b
      // 2c1: aload 48
      // 2c3: aload 0
      // 2c4: lload 43
      // 2c6: bipush 1
      // 2c7: anewarray 406
      // 2ca: dup_x2
      // 2cb: dup_x2
      // 2cc: pop
      // 2cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d0: bipush 0
      // 2d1: swap
      // 2d2: aastore
      // 2d3: ldc2_w 3568214686663755233
      // 2d6: lload 4
      // 2d8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: lload 16
      // 2df: dup2_x1
      // 2e0: pop2
      // 2e1: bipush 2
      // 2e2: anewarray 406
      // 2e5: dup_x1
      // 2e6: swap
      // 2e7: bipush 1
      // 2e8: swap
      // 2e9: aastore
      // 2ea: dup_x2
      // 2eb: dup_x2
      // 2ec: pop
      // 2ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f0: bipush 0
      // 2f1: swap
      // 2f2: aastore
      // 2f3: ldc2_w 3506203184661075188
      // 2f6: lload 4
      // 2f8: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: goto 30b
      // 300: ldc2_w 3629865195587956527
      // 303: lload 4
      // 305: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: athrow
      // 30b: aload 0
      // 30c: ldc2_w 2899520029436694978
      // 30f: lload 4
      // 311: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 31b: astore 49
      // 31d: aload 49
      // 31f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 324: ifeq 37b
      // 327: aload 49
      // 329: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32e: checkcast java/lang/String
      // 331: astore 50
      // 333: aload 48
      // 335: lload 37
      // 337: aload 50
      // 339: bipush 2
      // 33a: anewarray 406
      // 33d: dup_x1
      // 33e: swap
      // 33f: bipush 1
      // 340: swap
      // 341: aastore
      // 342: dup_x2
      // 343: dup_x2
      // 344: pop
      // 345: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 348: bipush 0
      // 349: swap
      // 34a: aastore
      // 34b: ldc2_w 3137025876590679315
      // 34e: lload 4
      // 350: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: iload 47
      // 357: lload 4
      // 359: lconst_0
      // 35a: lcmp
      // 35b: ifle 39b
      // 35e: ifne 38d
      // 361: iload 47
      // 363: ifeq 31d
      // 366: lload 4
      // 368: lconst_0
      // 369: lcmp
      // 36a: iflt 355
      // 36d: goto 37b
      // 370: ldc2_w 3629865195587956527
      // 373: lload 4
      // 375: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: athrow
      // 37b: aload 0
      // 37c: ldc2_w 3764128513236006076
      // 37f: lload 4
      // 381: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 386: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 38b: astore 49
      // 38d: aload 49
      // 38f: lload 4
      // 391: lconst_0
      // 392: lcmp
      // 393: ifle 402
      // 396: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 39b: ifeq 3f2
      // 39e: aload 49
      // 3a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3a5: checkcast java/lang/String
      // 3a8: astore 50
      // 3aa: aload 48
      // 3ac: lload 37
      // 3ae: aload 50
      // 3b0: bipush 2
      // 3b1: anewarray 406
      // 3b4: dup_x1
      // 3b5: swap
      // 3b6: bipush 1
      // 3b7: swap
      // 3b8: aastore
      // 3b9: dup_x2
      // 3ba: dup_x2
      // 3bb: pop
      // 3bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3bf: bipush 0
      // 3c0: swap
      // 3c1: aastore
      // 3c2: ldc2_w 3137025876590679315
      // 3c5: lload 4
      // 3c7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cc: iload 47
      // 3ce: lload 4
      // 3d0: lconst_0
      // 3d1: lcmp
      // 3d2: iflt 412
      // 3d5: ifne 404
      // 3d8: iload 47
      // 3da: ifeq 38d
      // 3dd: lload 4
      // 3df: lconst_0
      // 3e0: lcmp
      // 3e1: ifle 3f2
      // 3e4: goto 3f2
      // 3e7: ldc2_w 3629865195587956527
      // 3ea: lload 4
      // 3ec: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f1: athrow
      // 3f2: aload 0
      // 3f3: ldc2_w 3502867340642221434
      // 3f6: lload 4
      // 3f8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 402: astore 49
      // 404: aload 49
      // 406: lload 4
      // 408: lconst_0
      // 409: lcmp
      // 40a: ifle 41c
      // 40d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 412: ifeq 5f7
      // 415: aload 49
      // 417: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41c: checkcast com/zelix/xs
      // 41f: astore 50
      // 421: aload 50
      // 423: iload 47
      // 425: ifne 561
      // 428: lload 22
      // 42a: bipush 1
      // 42b: anewarray 406
      // 42e: dup_x2
      // 42f: dup_x2
      // 430: pop
      // 431: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 434: bipush 0
      // 435: swap
      // 436: aastore
      // 437: ldc2_w 3834322253970481794
      // 43a: lload 4
      // 43c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 441: ifeq 55f
      // 444: goto 452
      // 447: ldc2_w 3629865195587956527
      // 44a: lload 4
      // 44c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 451: athrow
      // 452: aload 50
      // 454: iload 47
      // 456: ifne 561
      // 459: goto 467
      // 45c: ldc2_w 3629865195587956527
      // 45f: lload 4
      // 461: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 466: athrow
      // 467: lload 39
      // 469: bipush 1
      // 46a: anewarray 406
      // 46d: dup_x2
      // 46e: dup_x2
      // 46f: pop
      // 470: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 473: bipush 0
      // 474: swap
      // 475: aastore
      // 476: ldc2_w 2950304257821561114
      // 479: lload 4
      // 47b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 480: ifne 55f
      // 483: goto 491
      // 486: ldc2_w 3629865195587956527
      // 489: lload 4
      // 48b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 490: athrow
      // 491: aload 3
      // 492: new java/lang/StringBuilder
      // 495: dup
      // 496: invokespecial java/lang/StringBuilder.<init> ()V
      // 499: sipush 12120
      // 49c: ldc2_w 4811035489359741506
      // 49f: lload 4
      // 4a1: lxor
      // 4a2: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4aa: aload 50
      // 4ac: lload 28
      // 4ae: bipush 1
      // 4af: anewarray 406
      // 4b2: dup_x2
      // 4b3: dup_x2
      // 4b4: pop
      // 4b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b8: bipush 0
      // 4b9: swap
      // 4ba: aastore
      // 4bb: ldc2_w 3102646240529189507
      // 4be: lload 4
      // 4c0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c8: sipush 4853
      // 4cb: ldc2_w 853101647296331758
      // 4ce: lload 4
      // 4d0: lxor
      // 4d1: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d9: aload 48
      // 4db: lload 10
      // 4dd: bipush 1
      // 4de: anewarray 406
      // 4e1: dup_x2
      // 4e2: dup_x2
      // 4e3: pop
      // 4e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e7: bipush 0
      // 4e8: swap
      // 4e9: aastore
      // 4ea: ldc2_w 2923609937309484140
      // 4ed: lload 4
      // 4ef: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f7: sipush 30843
      // 4fa: ldc2_w 803273025682543975
      // 4fd: lload 4
      // 4ff: lxor
      // 500: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 505: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 508: aload 48
      // 50a: lload 12
      // 50c: bipush 1
      // 50d: anewarray 406
      // 510: dup_x2
      // 511: dup_x2
      // 512: pop
      // 513: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 516: bipush 0
      // 517: swap
      // 518: aastore
      // 519: ldc2_w 3936579428098839194
      // 51c: lload 4
      // 51e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 523: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 526: ldc "."
      // 528: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 52b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52e: lload 18
      // 530: bipush 2
      // 531: anewarray 406
      // 534: dup_x2
      // 535: dup_x2
      // 536: pop
      // 537: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53a: bipush 1
      // 53b: swap
      // 53c: aastore
      // 53d: dup_x1
      // 53e: swap
      // 53f: bipush 0
      // 540: swap
      // 541: aastore
      // 542: ldc2_w 3949095066529335522
      // 545: lload 4
      // 547: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54c: iload 47
      // 54e: ifeq 404
      // 551: goto 55f
      // 554: ldc2_w 3629865195587956527
      // 557: lload 4
      // 559: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55e: athrow
      // 55f: aload 50
      // 561: lload 28
      // 563: bipush 1
      // 564: anewarray 406
      // 567: dup_x2
      // 568: dup_x2
      // 569: pop
      // 56a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 56d: bipush 0
      // 56e: swap
      // 56f: aastore
      // 570: ldc2_w 3102646240529189507
      // 573: lload 4
      // 575: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57a: lload 41
      // 57c: bipush 2
      // 57d: anewarray 406
      // 580: dup_x2
      // 581: dup_x2
      // 582: pop
      // 583: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 586: bipush 1
      // 587: swap
      // 588: aastore
      // 589: dup_x1
      // 58a: swap
      // 58b: bipush 0
      // 58c: swap
      // 58d: aastore
      // 58e: ldc2_w 3094218454377848937
      // 591: lload 4
      // 593: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 598: astore 51
      // 59a: aload 50
      // 59c: lload 24
      // 59e: aload 51
      // 5a0: bipush 2
      // 5a1: anewarray 406
      // 5a4: dup_x1
      // 5a5: swap
      // 5a6: bipush 1
      // 5a7: swap
      // 5a8: aastore
      // 5a9: dup_x2
      // 5aa: dup_x2
      // 5ab: pop
      // 5ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5af: bipush 0
      // 5b0: swap
      // 5b1: aastore
      // 5b2: ldc2_w 3446310798786253120
      // 5b5: lload 4
      // 5b7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bc: aload 48
      // 5be: iload 32
      // 5c0: i2c
      // 5c1: aload 50
      // 5c3: iload 33
      // 5c5: iload 34
      // 5c7: bipush 4
      // 5c8: anewarray 406
      // 5cb: dup_x1
      // 5cc: swap
      // 5cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d0: bipush 3
      // 5d1: swap
      // 5d2: aastore
      // 5d3: dup_x1
      // 5d4: swap
      // 5d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d8: bipush 2
      // 5d9: swap
      // 5da: aastore
      // 5db: dup_x1
      // 5dc: swap
      // 5dd: bipush 1
      // 5de: swap
      // 5df: aastore
      // 5e0: dup_x1
      // 5e1: swap
      // 5e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5e5: bipush 0
      // 5e6: swap
      // 5e7: aastore
      // 5e8: ldc2_w 3399334492164853110
      // 5eb: lload 4
      // 5ed: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f2: iload 47
      // 5f4: ifeq 404
      // 5f7: return
   }

   List e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -6385107180235102237L, var2);
   }

   void T(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = a ^ var3;
      x44.a<"s">(this, var2, -7650993878999268649L, var3);
   }

   private String t(Object[] param1) {
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
      // 00c: getstatic com/zelix/_q4.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 36645882532795
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w -8889075257329049981
      // 01e: lload 2
      // 01f: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: new java/lang/StringBuilder
      // 027: dup
      // 028: invokespecial java/lang/StringBuilder.<init> ()V
      // 02b: astore 7
      // 02d: istore 6
      // 02f: aload 0
      // 030: ldc2_w -7474549016448191680
      // 033: lload 2
      // 034: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: iload 6
      // 03b: ifne 11f
      // 03e: ifnull 115
      // 041: goto 04e
      // 044: ldc2_w -6980607669272362385
      // 047: lload 2
      // 048: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: athrow
      // 04e: aload 7
      // 050: sipush 5713
      // 053: ldc2_w 3408691505281652224
      // 056: lload 2
      // 057: lxor
      // 058: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 060: iload 6
      // 062: ifne 114
      // 065: goto 072
      // 068: ldc2_w -6980607669272362385
      // 06b: lload 2
      // 06c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: lload 2
      // 073: lconst_0
      // 074: lcmp
      // 075: ifle 0ea
      // 078: pop
      // 079: aload 0
      // 07a: ldc2_w -7448031914669699547
      // 07d: lload 2
      // 07e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: ifnull 0e8
      // 086: goto 093
      // 089: ldc2_w -6980607669272362385
      // 08c: lload 2
      // 08d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 7
      // 095: ldc "@"
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: pop
      // 09b: aload 7
      // 09d: aload 0
      // 09e: ldc2_w -7448031914669699547
      // 0a1: lload 2
      // 0a2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: lload 4
      // 0a9: bipush 2
      // 0aa: anewarray 406
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 1
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w -8669176202552685271
      // 0be: lload 2
      // 0bf: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: pop
      // 0c8: aload 7
      // 0ca: sipush 9824
      // 0cd: ldc2_w 5757547786316640410
      // 0d0: lload 2
      // 0d1: lxor
      // 0d2: invokedynamic v (IJ)I bsm=com/zelix/_q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0da: pop
      // 0db: goto 0e8
      // 0de: ldc2_w -6980607669272362385
      // 0e1: lload 2
      // 0e2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 7
      // 0ea: aload 0
      // 0eb: ldc2_w -7474549016448191680
      // 0ee: lload 2
      // 0ef: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: lload 4
      // 0f6: bipush 2
      // 0f7: anewarray 406
      // 0fa: dup_x2
      // 0fb: dup_x2
      // 0fc: pop
      // 0fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 100: bipush 1
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w -8669176202552685271
      // 10b: lload 2
      // 10c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114: pop
      // 115: aload 0
      // 116: ldc2_w -7312315615008027264
      // 119: lload 2
      // 11a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: iload 6
      // 121: ifne 200
      // 124: ifnull 1fb
      // 127: goto 134
      // 12a: ldc2_w -6980607669272362385
      // 12d: lload 2
      // 12e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 7
      // 136: sipush 20747
      // 139: ldc2_w 3835198084747989330
      // 13c: lload 2
      // 13d: lxor
      // 13e: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 146: iload 6
      // 148: ifne 1fa
      // 14b: goto 158
      // 14e: ldc2_w -6980607669272362385
      // 151: lload 2
      // 152: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: lload 2
      // 159: lconst_0
      // 15a: lcmp
      // 15b: ifle 1d0
      // 15e: pop
      // 15f: aload 0
      // 160: ldc2_w -8797042370398138293
      // 163: lload 2
      // 164: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: ifnull 1ce
      // 16c: goto 179
      // 16f: ldc2_w -6980607669272362385
      // 172: lload 2
      // 173: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 7
      // 17b: ldc "@"
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: pop
      // 181: aload 7
      // 183: aload 0
      // 184: ldc2_w -8797042370398138293
      // 187: lload 2
      // 188: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: lload 4
      // 18f: bipush 2
      // 190: anewarray 406
      // 193: dup_x2
      // 194: dup_x2
      // 195: pop
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: bipush 1
      // 19a: swap
      // 19b: aastore
      // 19c: dup_x1
      // 19d: swap
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: ldc2_w -8669176202552685271
      // 1a4: lload 2
      // 1a5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ad: pop
      // 1ae: aload 7
      // 1b0: sipush 9824
      // 1b3: ldc2_w 5757547786316640410
      // 1b6: lload 2
      // 1b7: lxor
      // 1b8: invokedynamic v (IJ)I bsm=com/zelix/_q4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1c0: pop
      // 1c1: goto 1ce
      // 1c4: ldc2_w -6980607669272362385
      // 1c7: lload 2
      // 1c8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 7
      // 1d0: aload 0
      // 1d1: ldc2_w -7312315615008027264
      // 1d4: lload 2
      // 1d5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: lload 4
      // 1dc: bipush 2
      // 1dd: anewarray 406
      // 1e0: dup_x2
      // 1e1: dup_x2
      // 1e2: pop
      // 1e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e6: bipush 1
      // 1e7: swap
      // 1e8: aastore
      // 1e9: dup_x1
      // 1ea: swap
      // 1eb: bipush 0
      // 1ec: swap
      // 1ed: aastore
      // 1ee: ldc2_w -8669176202552685271
      // 1f1: lload 2
      // 1f2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fa: pop
      // 1fb: aload 7
      // 1fd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 200: areturn
   }

   void O(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = a ^ var3;
      x44.a<"h">(this, 3323186522467162081L, var3).add(var2);
   }

   public void P(Object[] var1) {
      xs var4 = (xs)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"i">(this, 8506885321385491432L, var2).add(var4);
   }

   boolean M(Object[] param1) {
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
      // 0c: getstatic com/zelix/_q4.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -1243676054814309089
      // 15: lload 2
      // 16: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -919483992452278216
      // 21: lload 2
      // 22: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifeq 53
      // 2c: ifnonnull 56
      // 2f: goto 3c
      // 32: ldc2_w -835522029665769193
      // 35: lload 2
      // 36: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -1009605818007230728
      // 40: lload 2
      // 41: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w -835522029665769193
      // 4c: lload 2
      // 4d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: ifnull 64
      // 56: bipush 1
      // 57: goto 65
      // 5a: ldc2_w -835522029665769193
      // 5d: lload 2
      // 5e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: bipush 0
      // 65: ireturn
   }

   void S(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/_uu
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic com/zelix/_q4.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 1728324980507
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w 8723454223228724015
      // 30: lload 4
      // 32: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: istore 8
      // 39: aload 0
      // 3a: iload 8
      // 3c: ifne cb
      // 3f: ldc2_w 8666868319628176871
      // 42: lload 4
      // 44: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: ifnull ca
      // 4c: goto 5a
      // 4f: ldc2_w 7112204212909031363
      // 52: lload 4
      // 54: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 3
      // 5b: new java/lang/StringBuilder
      // 5e: dup
      // 5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 62: sipush 29272
      // 65: ldc2_w 757057513506721706
      // 68: lload 4
      // 6a: lxor
      // 6b: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 73: aload 2
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: sipush 30528
      // 7a: ldc2_w 865066781791636156
      // 7d: lload 4
      // 7f: lxor
      // 80: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_q4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88: aload 0
      // 89: ldc2_w 8666868319628176871
      // 8c: lload 4
      // 8e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 96: ldc "'"
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9e: lload 6
      // a0: bipush 2
      // a1: anewarray 406
      // a4: dup_x2
      // a5: dup_x2
      // a6: pop
      // a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // aa: bipush 1
      // ab: swap
      // ac: aastore
      // ad: dup_x1
      // ae: swap
      // af: bipush 0
      // b0: swap
      // b1: aastore
      // b2: ldc2_w 7359583482971084814
      // b5: lload 4
      // b7: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: goto ca
      // bf: ldc2_w 7112204212909031363
      // c2: lload 4
      // c4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: athrow
      // ca: aload 0
      // cb: aload 2
      // cc: ldc2_w 8666868319628176871
      // cf: lload 4
      // d1: invokedynamic p (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: return
   }

   static {
      long var11 = a ^ 24633556868152L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[10];
      int var18 = 0;
      String var17 = "¹gþ?k\u00904\u009c:ÁR5\u0080ðGÚî(\u00adSÜ§Qq\u0098R©\u0089+o½ç\u0084ËC\u000bÔÑ\u0097Øh\u0007\u0002*ýèâüHw@\u009c_¸\u0080\u0019©\u008b\u0080Ð\u001fýPÒ\u0084E\u0081Wá\u0006È\u0013³km_A-Stþ\u009f\u0095ê7b)\u0094@¯á´uæó\u0013oÊ³<\u009dADPx³qéØA©Ä\u0018(K\u001bígQ\u00adè\u000eÂ©'Ü\u000b~,é°q£;j¶Á@zgâî\u0091%\u0091Ã\u00ad^TM\næÎÕ#I\u008e'|\u008dý\u00813¹\u0098\u008d<\u000eÒl\u0000í´ûõ\u0086:<\u0093v\u0088Zþó-â>íä\u0016dj÷\u0094úñÐº0\u0087\u0081b`anti(BÀ{Alj\u001a_ÅZ\u0099$yËºëz!}\u009c\t¸\u0002ñ\u0088<Å×\u001eì\u0000df\u009aC\u001bXvïúJÀ´ *¯\u001b²±S»OÔ{ËÑaÙ\u0095\u001d\b\u0096zÀÈ\u0002\u0003\u0086¶1¢(H³y\u008d\u0019Óª³\\z\"\u0093\u0015\rEÒkÐ½ îÌÅ\u0007\u0080ßZ1\u0089éh\u009d«\fN.ÙÛ\u008c\u0089n\u007fI\u008cy/Ø\u008b,¾|x(àK7xÖõ\u009bÝH\u0083\u0080Xëãí%:ûù\u007f\u008e\u0086±*ÖÝïlâ}gì{N®£\u008ejÐàh¥Ã½ÄÃ\u0096\u007f(\u0099\u000e\u0088.QD\u0087\u0010`äOâÂ4¤ÏÅp\"&É\u009aãl\u0002¢è\u008f\u001aéz\u0011.\u009aÇ¨\u008a·\u0084ªo³\u0085Û\\ºÈ\u0014Uî³d°»\u0017IÑlâ(¨\u0018êÔ\u009a\u009b,XË~l¾hÄe\bA\u000f9=Ô¸uÜ\u0014ÀF\u0081\u00109QòU\u0010'·`×\u0091÷\u0090xc7\u0011\u00959¨\u0004oÎD^ô~§ÇÇ>\u001e¥Q\u009d®nþ\u009e¿6\"%ÅH¬\u0095\u008f\u008fùaSýÛ\u0005ßÍ7ã6ØfÐÌsªeñiÝnJ\r\u0013\u001a\u0003bÂ÷\u001cÌþ\u0091µ{\u0081\u0098\u0081}ÓtBC\u0087PÌ{m6ñ³Îß³4";
      int var19 = "¹gþ?k\u00904\u009c:ÁR5\u0080ðGÚî(\u00adSÜ§Qq\u0098R©\u0089+o½ç\u0084ËC\u000bÔÑ\u0097Øh\u0007\u0002*ýèâüHw@\u009c_¸\u0080\u0019©\u008b\u0080Ð\u001fýPÒ\u0084E\u0081Wá\u0006È\u0013³km_A-Stþ\u009f\u0095ê7b)\u0094@¯á´uæó\u0013oÊ³<\u009dADPx³qéØA©Ä\u0018(K\u001bígQ\u00adè\u000eÂ©'Ü\u000b~,é°q£;j¶Á@zgâî\u0091%\u0091Ã\u00ad^TM\næÎÕ#I\u008e'|\u008dý\u00813¹\u0098\u008d<\u000eÒl\u0000í´ûõ\u0086:<\u0093v\u0088Zþó-â>íä\u0016dj÷\u0094úñÐº0\u0087\u0081b`anti(BÀ{Alj\u001a_ÅZ\u0099$yËºëz!}\u009c\t¸\u0002ñ\u0088<Å×\u001eì\u0000df\u009aC\u001bXvïúJÀ´ *¯\u001b²±S»OÔ{ËÑaÙ\u0095\u001d\b\u0096zÀÈ\u0002\u0003\u0086¶1¢(H³y\u008d\u0019Óª³\\z\"\u0093\u0015\rEÒkÐ½ îÌÅ\u0007\u0080ßZ1\u0089éh\u009d«\fN.ÙÛ\u008c\u0089n\u007fI\u008cy/Ø\u008b,¾|x(àK7xÖõ\u009bÝH\u0083\u0080Xëãí%:ûù\u007f\u008e\u0086±*ÖÝïlâ}gì{N®£\u008ejÐàh¥Ã½ÄÃ\u0096\u007f(\u0099\u000e\u0088.QD\u0087\u0010`äOâÂ4¤ÏÅp\"&É\u009aãl\u0002¢è\u008f\u001aéz\u0011.\u009aÇ¨\u008a·\u0084ªo³\u0085Û\\ºÈ\u0014Uî³d°»\u0017IÑlâ(¨\u0018êÔ\u009a\u009b,XË~l¾hÄe\bA\u000f9=Ô¸uÜ\u0014ÀF\u0081\u00109QòU\u0010'·`×\u0091÷\u0090xc7\u0011\u00959¨\u0004oÎD^ô~§ÇÇ>\u001e¥Q\u009d®nþ\u009e¿6\"%ÅH¬\u0095\u008f\u008fùaSýÛ\u0005ßÍ7ã6ØfÐÌsªeñiÝnJ\r\u0013\u001a\u0003bÂ÷\u001cÌþ\u0091µ{\u0081\u0098\u0081}ÓtBC\u0087PÌ{m6ñ³Îß³4"
         .length();
      char var16 = 'p';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     d = new String[10];
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0096f5\u008c2\u0084úÕÑ \u0096f\u00adÚ]%\u001e×]U\u0013´2V";
                     int var5 = "\u0096f5\u008c2\u0084úÕÑ \u0096f\u00adÚ]%\u001e×]U\u0013´2V".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(
                           new byte[]{
                              (byte)((int)(var8 >>> 56)),
                              (byte)((int)(var8 >>> 48)),
                              (byte)((int)(var8 >>> 40)),
                              (byte)((int)(var8 >>> 32)),
                              (byte)((int)(var8 >>> 24)),
                              (byte)((int)(var8 >>> 16)),
                              (byte)((int)(var8 >>> 8)),
                              (byte)((int)var8)
                           }
                        );
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     f = var6;
                     g = new Integer[3];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "\u00ad0\"sÔ·&»\u0000\u0085ã\u0090â\u008cfÖ$!\u0087¹J\u0003j\tÂ'KMÛP®¨T\u000fÁ\u0004HtÍ\u0015\u0018´ª\u0082ãÄð#®¸OÚ.Â\u0087,&ÌO2òÃ\u0088¾\u0019";
                  var19 = "\u00ad0\"sÔ·&»\u0000\u0085ã\u0090â\u008cfÖ$!\u0087¹J\u0003j\tÂ'KMÛP®¨T\u000fÁ\u0004HtÍ\u0015\u0018´ª\u0082ãÄð#®¸OÚ.Â\u0087,&ÌO2òÃ\u0088¾\u0019"
                     .length();
                  var16 = '(';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22156;
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
            throw new RuntimeException("com/zelix/_q4", var10);
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
         throw new RuntimeException("com/zelix/_q4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16430;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = f[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_q4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_q4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
