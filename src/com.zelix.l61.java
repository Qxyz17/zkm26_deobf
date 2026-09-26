package com.zelix;

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

public class l61 {
   private static final int w;
   private static final String X;
   private static final long a = prr.a(9082824362887007493L, 3011105699164815745L, MethodHandles.lookup().lookupClass()).a(68485393161632L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static boolean e(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 1
      // 15: pop
      // 16: getstatic com/zelix/l61.a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: ldc2_w 920550978141688560
      // 1f: lload 1
      // 20: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 3
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 23937
      // 30: ldc2_w 505784539071583364
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w 1330691913458777690
      // 43: lload 1
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w 1330691913458777690
      // 51: lload 1
      // 52: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static int I(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return m44.a<"k">(-8557437522255624775L, var1);
   }

   public static boolean u(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: pop
      // 16: getstatic com/zelix/l61.a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: ldc2_w -1027320648392183928
      // 1f: lload 1
      // 20: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 3
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 12270
      // 30: ldc2_w 49094235843271569
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w -1220514728093220062
      // 43: lload 1
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w -1220514728093220062
      // 51: lload 1
      // 52: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean Z(long param0, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/l61.a J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: ldc2_w -3194397803462406755
      // 09: lload 0
      // 0a: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: iload 2
      // 11: aload 3
      // 12: ifnonnull 40
      // 15: sipush 19155
      // 18: ldc2_w 5566164711270440119
      // 1b: lload 0
      // 1c: lxor
      // 1d: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: if_icmplt 43
      // 25: goto 32
      // 28: ldc2_w -3667375829318229705
      // 2b: lload 0
      // 2c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: bipush 1
      // 33: goto 40
      // 36: ldc2_w -3667375829318229705
      // 39: lload 0
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   public static boolean n(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/l61.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w 2244537376776388880
      // 15: lload 1
      // 16: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 3
      // 1c: ldc2_w 401541826133707030
      // 1f: lload 1
      // 20: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 3
      // 26: ifnonnull 54
      // 29: sipush 21438
      // 2c: ldc2_w 1463064100918331721
      // 2f: lload 1
      // 30: lxor
      // 31: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmplt 57
      // 39: goto 46
      // 3c: ldc2_w 114797639663349178
      // 3f: lload 1
      // 40: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w 114797639663349178
      // 4d: lload 1
      // 4e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public static boolean x(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/l61.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w 3426250124950122938
      // 1f: lload 2
      // 20: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 11436
      // 30: ldc2_w 5512515612261304043
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w 3548160683059043600
      // 43: lload 2
      // 44: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w 3548160683059043600
      // 51: lload 2
      // 52: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean w(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/l61.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w 8383497682547862126
      // 15: lload 1
      // 16: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 3
      // 1c: ldc2_w 7992913292389655144
      // 1f: lload 1
      // 20: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 3
      // 26: ifnonnull 54
      // 29: sipush 17053
      // 2c: ldc2_w 8795608767590560528
      // 2f: lload 1
      // 30: lxor
      // 31: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmplt 57
      // 39: goto 46
      // 3c: ldc2_w 7703917039817361092
      // 3f: lload 1
      // 40: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w 7703917039817361092
      // 4d: lload 1
      // 4e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public static boolean T(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/l61.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w 1098357659225559304
      // 1f: lload 2
      // 20: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 13212
      // 30: ldc2_w 2169408096399620460
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w 1265444952097160610
      // 43: lload 2
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w 1265444952097160610
      // 51: lload 2
      // 52: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static int A(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 3
      // 015: pop
      // 016: getstatic com/zelix/l61.a J
      // 019: lload 1
      // 01a: lxor
      // 01b: lstore 1
      // 01c: ldc2_w 4416093553047577471
      // 01f: lload 1
      // 020: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: astore 4
      // 027: iload 3
      // 028: aload 4
      // 02a: ifnonnull 074
      // 02d: bipush 1
      // 02e: if_icmpge 073
      // 031: goto 03e
      // 034: ldc2_w 2592095029253951445
      // 037: lload 1
      // 038: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: athrow
      // 03e: new java/lang/IllegalArgumentException
      // 041: dup
      // 042: new java/lang/StringBuilder
      // 045: dup
      // 046: invokespecial java/lang/StringBuilder.<init> ()V
      // 049: sipush 15366
      // 04c: ldc2_w 4861998755360164596
      // 04f: lload 1
      // 050: lxor
      // 051: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/l61.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 059: iload 3
      // 05a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 05d: ldc "'"
      // 05f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 062: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 065: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 068: athrow
      // 069: ldc2_w 2592095029253951445
      // 06c: lload 1
      // 06d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: iload 3
      // 074: aload 4
      // 076: ifnonnull 26b
      // 079: tableswitch 485 1 25 125 149 163 177 191 205 219 233 247 261 275 289 303 317 331 345 359 373 387 401 415 429 443 457 471
      // 0ec: ldc2_w 2592095029253951445
      // 0ef: lload 1
      // 0f0: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: sipush 11802
      // 0f9: ldc2_w 3578293182965077663
      // 0fc: lload 1
      // 0fd: lxor
      // 0fe: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: ireturn
      // 104: ldc2_w 2592095029253951445
      // 107: lload 1
      // 108: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: sipush 9142
      // 111: ldc2_w 779644631327431469
      // 114: lload 1
      // 115: lxor
      // 116: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: ireturn
      // 11c: sipush 22106
      // 11f: ldc2_w 2719363895774129886
      // 122: lload 1
      // 123: lxor
      // 124: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: ireturn
      // 12a: sipush 19699
      // 12d: ldc2_w 9009359219964818540
      // 130: lload 1
      // 131: lxor
      // 132: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: ireturn
      // 138: sipush 16930
      // 13b: ldc2_w 4193791594975410872
      // 13e: lload 1
      // 13f: lxor
      // 140: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: ireturn
      // 146: sipush 14525
      // 149: ldc2_w 7571523165868736548
      // 14c: lload 1
      // 14d: lxor
      // 14e: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: ireturn
      // 154: sipush 31827
      // 157: ldc2_w 6700895251053511872
      // 15a: lload 1
      // 15b: lxor
      // 15c: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: ireturn
      // 162: sipush 24571
      // 165: ldc2_w 5102326967734314874
      // 168: lload 1
      // 169: lxor
      // 16a: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: ireturn
      // 170: sipush 21438
      // 173: ldc2_w 1463096372269820710
      // 176: lload 1
      // 177: lxor
      // 178: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: ireturn
      // 17e: sipush 17999
      // 181: ldc2_w 2785434831893970649
      // 184: lload 1
      // 185: lxor
      // 186: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: ireturn
      // 18c: sipush 29732
      // 18f: ldc2_w 7864304387352956079
      // 192: lload 1
      // 193: lxor
      // 194: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: ireturn
      // 19a: sipush 27563
      // 19d: ldc2_w 226383416466707253
      // 1a0: lload 1
      // 1a1: lxor
      // 1a2: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: ireturn
      // 1a8: sipush 31959
      // 1ab: ldc2_w 7809686384871015493
      // 1ae: lload 1
      // 1af: lxor
      // 1b0: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: ireturn
      // 1b6: sipush 1125
      // 1b9: ldc2_w 5095850460107504885
      // 1bc: lload 1
      // 1bd: lxor
      // 1be: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: ireturn
      // 1c4: sipush 17375
      // 1c7: ldc2_w 6496106787027925826
      // 1ca: lload 1
      // 1cb: lxor
      // 1cc: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: ireturn
      // 1d2: sipush 31930
      // 1d5: ldc2_w 2484109110273705013
      // 1d8: lload 1
      // 1d9: lxor
      // 1da: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: ireturn
      // 1e0: sipush 435
      // 1e3: ldc2_w 3493318457700186416
      // 1e6: lload 1
      // 1e7: lxor
      // 1e8: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: ireturn
      // 1ee: sipush 13987
      // 1f1: ldc2_w 2221746410219261487
      // 1f4: lload 1
      // 1f5: lxor
      // 1f6: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: ireturn
      // 1fc: sipush 14011
      // 1ff: ldc2_w 3476708943770865205
      // 202: lload 1
      // 203: lxor
      // 204: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: ireturn
      // 20a: sipush 14514
      // 20d: ldc2_w 301893409072431142
      // 210: lload 1
      // 211: lxor
      // 212: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: ireturn
      // 218: sipush 3964
      // 21b: ldc2_w 4908597505365407725
      // 21e: lload 1
      // 21f: lxor
      // 220: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: ireturn
      // 226: sipush 24000
      // 229: ldc2_w 7416421533807191383
      // 22c: lload 1
      // 22d: lxor
      // 22e: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: ireturn
      // 234: sipush 21786
      // 237: ldc2_w 5202975455973092755
      // 23a: lload 1
      // 23b: lxor
      // 23c: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: ireturn
      // 242: sipush 14161
      // 245: ldc2_w 5111704294096457668
      // 248: lload 1
      // 249: lxor
      // 24a: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: ireturn
      // 250: sipush 9201
      // 253: ldc2_w 7419877693014072188
      // 256: lload 1
      // 257: lxor
      // 258: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: ireturn
      // 25e: sipush 11203
      // 261: ldc2_w 7024883703066088308
      // 264: lload 1
      // 265: lxor
      // 266: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: ireturn
   }

   static {
      long var20 = a ^ 128696221497302L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[3];
      int var16 = 0;
      String var15 = "8nTüÈõ«tQÑéC:ð>æ¸·ÃÃgK\r\u0003ÿ¯fØ\bí\u001a\u0014·\u0099U\u0090×ýì¾\u0010OÜµíýeQ\u008fwqò&\u008fuhx8aÊ6}î\u009eZxæ\u001bÝ´$Ó1ÝA\u001fä\u0083TéÇ\u0006GÒà9F\u0095zÖz>¦Ä«\u001b\u0018(\bC/)ã\u0007ôV¸\u0005AÀõÿ\bf";
      int var17 = "8nTüÈõ«tQÑéC:ð>æ¸·ÃÃgK\r\u0003ÿ¯fØ\bí\u001a\u0014·\u0099U\u0090×ýì¾\u0010OÜµíýeQ\u008fwqò&\u008fuhx8aÊ6}î\u009eZxæ\u001bÝ´$Ó1ÝA\u001fä\u0083TéÇ\u0006GÒà9F\u0095zÖz>¦Ä«\u001b\u0018(\bC/)ã\u0007ôV¸\u0005AÀõÿ\bf"
         .length();
      char var14 = '(';
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var31 = a(var19).intern();
         int var10001 = -1;
         var18[var16++] = var31;
         if ((var13 += var14) >= var17) {
            b = var18;
            c = new String[3];
            g = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[33];
            int var3 = 0;
            String var4 = "Îö\u0080?\u001e\u0014ÀF~`Ú7ih9\u009cç3<>õ\u008cÆ\u0097¦:\u000bçW\u00ad?¦\u0002Ù®®7.0\u001f\bÏ\u0098½c\u0095ÜÛ(ÎÕIå\u009c&\u0005ð\u001a\u009bæv\u0006\u001cùæ\u0001\u0080Ûl\u0091\u0012\u0006Å\u0095_Q@¹\f\u0081\u0090÷a÷[ú\u009eAòQK>§L\u0084?\u001fÖ\u0016ôU£\u009dG+j\u008b\u009aoÉIA\u0086\u001e¥¶^\u0081óO\u008e%z\u0017M¾y\u009ac\u0007£»\u0083º\u0092¥\u009cnAG>\u009c}ò¬}á¯Óß½gË\u0097\u0097;\u0012°É0a\u0095Ví\u0019ÐuÞ1Âþ1\u0018GÝ!éé\u000eôýµR\u0014·\u0000{G<\u000f·`¸%dD\u008f\u001e\u0001òÂ\u0089¤y_\u00801Ý\u0087\u009c~\u0085d°\u0082ÊD÷\u0006Zê/ËØ \u0098Bµ\u0005ì\u0089Õ\u001bÀ!\u001c8\u0097<}.ñ,\u0004´Ç\u0093¼";
            int var5 = "Îö\u0080?\u001e\u0014ÀF~`Ú7ih9\u009cç3<>õ\u008cÆ\u0097¦:\u000bçW\u00ad?¦\u0002Ù®®7.0\u001f\bÏ\u0098½c\u0095ÜÛ(ÎÕIå\u009c&\u0005ð\u001a\u009bæv\u0006\u001cùæ\u0001\u0080Ûl\u0091\u0012\u0006Å\u0095_Q@¹\f\u0081\u0090÷a÷[ú\u009eAòQK>§L\u0084?\u001fÖ\u0016ôU£\u009dG+j\u008b\u009aoÉIA\u0086\u001e¥¶^\u0081óO\u008e%z\u0017M¾y\u009ac\u0007£»\u0083º\u0092¥\u009cnAG>\u009c}ò¬}á¯Óß½gË\u0097\u0097;\u0012°É0a\u0095Ví\u0019ÐuÞ1Âþ1\u0018GÝ!éé\u000eôýµR\u0014·\u0000{G<\u000f·`¸%dD\u008f\u001e\u0001òÂ\u0089¤y_\u00801Ý\u0087\u009c~\u0085d°\u0082ÊD÷\u0006Zê/ËØ \u0098Bµ\u0005ì\u0089Õ\u001bÀ!\u001c8\u0097<}.ñ,\u0004´Ç\u0093¼"
               .length();
            byte var2 = 0;

            label32:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var26 = var6;
               var10001 = var3++;
               long var34 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var37 = -1;

               while (true) {
                  long var8 = var34;
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
                  long var39 = ((long)var10[0] & 255L) << 56
                     | ((long)var10[1] & 255L) << 48
                     | ((long)var10[2] & 255L) << 40
                     | ((long)var10[3] & 255L) << 32
                     | ((long)var10[4] & 255L) << 24
                     | ((long)var10[5] & 255L) << 16
                     | ((long)var10[6] & 255L) << 8
                     | (long)var10[7] & 255L;
                  switch (var37) {
                     case 0:
                        var26[var10001] = var39;
                        if (var2 >= var5) {
                           e = var6;
                           f = new Integer[33];
                           X = m44.a<"n">(a<"h">(4863, 970348354044549654L ^ var20), 274707486393722992L, var20);
                           String[] var22 = m44.a<"q">(
                              m44.a<"j">(1734360547239028077L, var20), a<"h">(17411, 2406004972018306283L ^ var20), 2098444906452580547L, var20
                           );
                           w = Integer.parseInt(var22[0]);
                           return;
                        }
                        break;
                     default:
                        var26[var10001] = var39;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "è1\u0002\u009cg²\u0085¶~þÙ\u00963Õxµ";
                        var5 = "è1\u0002\u009cg²\u0085¶~þÙ\u00963Õxµ".length();
                        var2 = 0;
                  }

                  byte var30 = var2;
                  var2 += 8;
                  var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                  var26 = var6;
                  var10001 = var3++;
                  var34 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var37 = 0;
               }
            }
         }

         var14 = var15.charAt(var13);
      }
   }

   public static boolean v(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/l61.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w 6230849204274743374
      // 1f: lload 2
      // 20: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 24571
      // 30: ldc2_w 5102414270837705803
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w 5244874238328153316
      // 43: lload 2
      // 44: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w 5244874238328153316
      // 51: lload 2
      // 52: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean g(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 1
      // 15: pop
      // 16: getstatic com/zelix/l61.a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: ldc2_w -5515725619644617406
      // 1f: lload 1
      // 20: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 3
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 17053
      // 30: ldc2_w 8795628951303566396
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w -5925099079079542296
      // 43: lload 1
      // 44: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w -5925099079079542296
      // 51: lload 1
      // 52: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean m(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/l61.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w -7103511586500934819
      // 15: lload 1
      // 16: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 3
      // 1c: ldc2_w -8655950185323771045
      // 1f: lload 1
      // 20: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 3
      // 26: ifnonnull 54
      // 29: sipush 30825
      // 2c: ldc2_w 5966383353011642571
      // 2f: lload 1
      // 30: lxor
      // 31: invokedynamic n (IJ)I bsm=com/zelix/l61.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmplt 57
      // 39: goto 46
      // 3c: ldc2_w -8945656447530012681
      // 3f: lload 1
      // 40: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w -8945656447530012681
      // 4d: lload 1
      // 4e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17912;
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
            throw new RuntimeException("com/zelix/l61", var10);
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
         throw new RuntimeException("com/zelix/l61" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19359;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/l61", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("com/zelix/l61" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
