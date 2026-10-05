package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _r9 implements sr {
   private String V;
   md E;
   private boolean c;
   private static final long d = ess.a(-1538700443699470595L, -2241312541551312016L, MethodHandles.lookup().lookupClass()).a(179569809632118L);
   private static final String e;
   private static final long f;

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_r9.d J
      // 03: ldc2_w 30855638418843
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w 5589567612337628807
      // 0b: lload 1
      // 0c: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 3
      // 12: aload 0
      // 13: ldc2_w 5622026849166466342
      // 16: lload 1
      // 17: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: iload 3
      // 1d: ifne 47
      // 20: ifnull 4b
      // 23: goto 30
      // 26: ldc2_w 6235641919520716135
      // 29: lload 1
      // 2a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: aload 0
      // 31: ldc2_w 5622026849166466342
      // 34: lload 1
      // 35: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: goto 47
      // 3d: ldc2_w 6235641919520716135
      // 40: lload 1
      // 41: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: invokevirtual com/zelix/md.hashCode ()I
      // 4a: ireturn
      // 4b: bipush 0
      // 4c: ireturn
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
      // 00: getstatic com/zelix/_r9.d J
      // 03: ldc2_w 27322487871190
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 6836225542834402762
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/_r9
      // 17: iload 4
      // 19: ifne c5
      // 1c: ifeq c4
      // 1f: goto 2c
      // 22: ldc2_w 5027274476092401194
      // 25: lload 2
      // 26: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/_r9
      // 30: astore 5
      // 32: aload 0
      // 33: ldc2_w 6721753733723033195
      // 36: lload 2
      // 37: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: iload 4
      // 3e: ifne b1
      // 41: ifnull a6
      // 44: goto 51
      // 47: ldc2_w 5027274476092401194
      // 4a: lload 2
      // 4b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 5
      // 53: ldc2_w 6721753733723033195
      // 56: lload 2
      // 57: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: iload 4
      // 5e: ifne 95
      // 61: goto 6e
      // 64: ldc2_w 5027274476092401194
      // 67: lload 2
      // 68: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: ifnull a4
      // 71: goto 7e
      // 74: ldc2_w 5027274476092401194
      // 77: lload 2
      // 78: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: ldc2_w 6721753733723033195
      // 82: lload 2
      // 83: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: goto 95
      // 8b: ldc2_w 5027274476092401194
      // 8e: lload 2
      // 8f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: aload 5
      // 97: ldc2_w 6721753733723033195
      // 9a: lload 2
      // 9b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: invokevirtual com/zelix/md.equals (Ljava/lang/Object;)Z
      // a3: ireturn
      // a4: bipush 0
      // a5: ireturn
      // a6: aload 5
      // a8: ldc2_w 6721753733723033195
      // ab: lload 2
      // ac: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: ifnonnull c2
      // b4: bipush 1
      // b5: goto c3
      // b8: ldc2_w 5027274476092401194
      // bb: lload 2
      // bc: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: bipush 0
      // c3: ireturn
      // c4: bipush 0
      // c5: ireturn
   }

   private _r9(md param1, long param2, boolean param4, String param5, short param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: bipush 16
      // 03: lshl
      // 04: iload 6
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 48
      // 0c: lushr
      // 0d: lor
      // 0e: getstatic com/zelix/_r9.d J
      // 11: lxor
      // 12: lstore 7
      // 14: ldc2_w -8605442335480650874
      // 17: lload 7
      // 19: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: invokespecial java/lang/Object.<init> ()V
      // 22: istore 9
      // 24: iload 9
      // 26: ifne 74
      // 29: aload 1
      // 2a: ifnonnull 4e
      // 2d: goto 3b
      // 30: ldc2_w -7815994253117886362
      // 33: lload 7
      // 35: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: new java/lang/IllegalArgumentException
      // 3e: dup
      // 3f: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 42: athrow
      // 43: ldc2_w -7815994253117886362
      // 46: lload 7
      // 48: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 1
      // 50: ldc2_w -8429610080953018329
      // 53: lload 7
      // 55: invokedynamic u (Ljava/lang/Object;Lcom/zelix/md;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: aload 0
      // 5b: iload 4
      // 5d: ldc2_w -7657250696023115418
      // 60: lload 7
      // 62: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: aload 0
      // 68: aload 5
      // 6a: ldc2_w -8456263095756742546
      // 6d: lload 7
      // 6f: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: return
   }

   public boolean r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return x44.a<"l">(this, -5641397677543596696L, var2);
   }

   public final md b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return x44.a<"h">(this, -2090112713703280163L, var2);
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public String h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return x44.a<"l">(this, 4529311405090542608L, var2);
   }

   public boolean z(Object[] param1) {
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
      // 0c: getstatic com/zelix/_r9.d J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 5762387205529052397
      // 15: lload 2
      // 16: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w 5606452587557381893
      // 21: lload 2
      // 22: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifne 53
      // 2c: ifnull 6f
      // 2f: goto 3c
      // 32: ldc2_w 6116818254534555405
      // 35: lload 2
      // 36: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w 5606452587557381893
      // 40: lload 2
      // 41: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w 6116818254534555405
      // 4c: lload 2
      // 4d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: invokevirtual java/lang/String.length ()I
      // 56: iload 4
      // 58: ifne 6c
      // 5b: ifle 6f
      // 5e: goto 6b
      // 61: ldc2_w 6116818254534555405
      // 64: lload 2
      // 65: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   public final String s(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 87403430158810
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -6597357955616321692
      // 18: lload 2
      // 19: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: istore 6
      // 20: aload 0
      // 21: ldc2_w -6348342207182048059
      // 24: lload 2
      // 25: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: iload 6
      // 2c: ifne 56
      // 2f: ifnull 6f
      // 32: goto 3f
      // 35: ldc2_w -4653862676234183548
      // 38: lload 2
      // 39: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: ldc2_w -6348342207182048059
      // 43: lload 2
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: goto 56
      // 4c: ldc2_w -4653862676234183548
      // 4f: lload 2
      // 50: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: lload 4
      // 58: bipush 1
      // 59: anewarray 43
      // 5c: dup_x2
      // 5d: dup_x2
      // 5e: pop
      // 5f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62: bipush 0
      // 63: swap
      // 64: aastore
      // 65: ldc2_w -4792523240555738986
      // 68: lload 2
      // 69: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: areturn
      // 6f: aconst_null
      // 70: areturn
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public final String i(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 80958296610590
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -1057002200846667978
      // 18: lload 2
      // 19: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: istore 6
      // 20: aload 0
      // 21: iload 6
      // 23: ifeq 4d
      // 26: ldc2_w -1035162936291548543
      // 29: lload 2
      // 2a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: ifnull 66
      // 32: goto 3f
      // 35: ldc2_w -1644275508140668224
      // 38: lload 2
      // 39: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: goto 4d
      // 43: ldc2_w -1644275508140668224
      // 46: lload 2
      // 47: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: lload 4
      // 4f: bipush 1
      // 50: anewarray 43
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 0
      // 5a: swap
      // 5b: aastore
      // 5c: ldc2_w -1028252212025049676
      // 5f: lload 2
      // 60: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: areturn
      // 66: getstatic com/zelix/_r9.e Ljava/lang/String;
      // 69: areturn
   }

   public int B(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      return -1;
   }

   public _r9(long var1, md var3, boolean var4) {
      var1 = d ^ var1;
      long var5 = (var1 ^ 80761401437017L) >>> 16;
      int var7 = (int)((var1 ^ 80761401437017L) << 48 >>> 48);
      this(var3, var5, var4, null, (short)var7);
   }

   public _r9(md var1, long var2) {
      var2 = d ^ var2;
      long var4 = (var2 ^ 12915969203871L) >>> 16;
      int var6 = (int)((var2 ^ 12915969203871L) << 48 >>> 48);
      this(var1, var4, false, null, (short)var6);
   }

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 135986204036823L;
      return x44.a<"k">(this, new Object[]{var4}, 7541792749215339658L, var2);
   }

   public String d(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 67135027577178
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 2759175744993671208
      // 18: lload 2
      // 19: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: lload 4
      // 21: bipush 1
      // 22: anewarray 43
      // 25: dup_x2
      // 26: dup_x2
      // 27: pop
      // 28: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b: bipush 0
      // 2c: swap
      // 2d: aastore
      // 2e: ldc2_w 2820539996338035463
      // 31: lload 2
      // 32: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: astore 7
      // 39: istore 6
      // 3b: aload 7
      // 3d: iload 6
      // 3f: ifeq 60
      // 42: ifnonnull 5e
      // 45: goto 52
      // 48: ldc2_w 4481105279653797342
      // 4b: lload 2
      // 4c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aconst_null
      // 53: areturn
      // 54: ldc2_w 4481105279653797342
      // 57: lload 2
      // 58: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 7
      // 60: getstatic com/zelix/_r9.f J
      // 63: l2i
      // 64: invokevirtual java/lang/String.lastIndexOf (I)I
      // 67: istore 8
      // 69: iload 8
      // 6b: lload 2
      // 6c: lconst_0
      // 6d: lcmp
      // 6e: ifle ab
      // 71: iload 6
      // 73: ifeq ab
      // 76: bipush -1
      // 77: if_icmple 92
      // 7a: goto 87
      // 7d: ldc2_w 4481105279653797342
      // 80: lload 2
      // 81: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: aload 7
      // 89: iload 8
      // 8b: bipush 1
      // 8c: iadd
      // 8d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 90: astore 7
      // 92: aload 7
      // 94: iload 6
      // 96: ifeq e8
      // 99: ldc "L"
      // 9b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 9e: goto ab
      // a1: ldc2_w 4481105279653797342
      // a4: lload 2
      // a5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: ifeq e6
      // ae: aload 7
      // b0: iload 6
      // b2: ifeq e8
      // b5: goto c2
      // b8: ldc2_w 4481105279653797342
      // bb: lload 2
      // bc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: ldc ";"
      // c4: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // c7: ifeq e6
      // ca: goto d7
      // cd: ldc2_w 4481105279653797342
      // d0: lload 2
      // d1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: athrow
      // d7: aload 7
      // d9: bipush 1
      // da: aload 7
      // dc: invokevirtual java/lang/String.length ()I
      // df: bipush 1
      // e0: isub
      // e1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // e4: astore 7
      // e6: aload 7
      // e8: areturn
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public _r9(md var1, long var2, String var4) {
      var2 = d ^ var2;
      long var5 = (var2 ^ 114169978831547L) >>> 16;
      int var7 = (int)((var2 ^ 114169978831547L) << 48 >>> 48);
      this(var1, var5, false, var4, (short)var7);
   }

   static {
      long var5 = d ^ 59622983751442L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("ú\u009a~0NB(1".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      e = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 7908583521905571465L;
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
      f = var14;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
