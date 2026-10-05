package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class wo implements Serializable {
   private Object F;
   private Object I;
   private static final long a = ess.a(-6263013094407294275L, 1732001569204400505L, MethodHandles.lookup().lookupClass()).a(21636488435436L);

   public wo(short param1, Object param2, int param3, short param4, Object param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/wo.a J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: ldc2_w -9058753754147022004
      // 21: lload 6
      // 23: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aload 0
      // 29: invokespecial java/lang/Object.<init> ()V
      // 2c: astore 8
      // 2e: aload 8
      // 30: ifnonnull 6a
      // 33: aload 2
      // 34: ifnonnull 5f
      // 37: goto 45
      // 3a: ldc2_w -8723338906198645474
      // 3d: lload 6
      // 3f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: new java/lang/IllegalArgumentException
      // 48: dup
      // 49: aload 0
      // 4a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 4d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 50: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 53: athrow
      // 54: ldc2_w -8723338906198645474
      // 57: lload 6
      // 59: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 2
      // 61: putfield com/zelix/wo.F Ljava/lang/Object;
      // 64: aload 0
      // 65: aload 5
      // 67: putfield com/zelix/wo.I Ljava/lang/Object;
      // 6a: return
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
      // 000: getstatic com/zelix/wo.a J
      // 003: ldc2_w 68136253876303
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w 3549282782597687365
      // 00b: lload 2
      // 00c: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: instanceof com/zelix/wo
      // 017: aload 4
      // 019: ifnonnull 122
      // 01c: ifeq 121
      // 01f: goto 02c
      // 022: ldc2_w 3889205645942904343
      // 025: lload 2
      // 026: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/wo
      // 030: astore 5
      // 032: aload 0
      // 033: getfield com/zelix/wo.F Ljava/lang/Object;
      // 036: aload 4
      // 038: ifnonnull 064
      // 03b: aload 5
      // 03d: getfield com/zelix/wo.F Ljava/lang/Object;
      // 040: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 043: ifeq 11f
      // 046: goto 053
      // 049: ldc2_w 3889205645942904343
      // 04c: lload 2
      // 04d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: aload 0
      // 054: getfield com/zelix/wo.I Ljava/lang/Object;
      // 057: goto 064
      // 05a: ldc2_w 3889205645942904343
      // 05d: lload 2
      // 05e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 4
      // 066: ifnonnull 0b1
      // 069: ifnonnull 0a0
      // 06c: goto 079
      // 06f: ldc2_w 3889205645942904343
      // 072: lload 2
      // 073: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 5
      // 07b: getfield com/zelix/wo.I Ljava/lang/Object;
      // 07e: aload 4
      // 080: ifnonnull 0b1
      // 083: goto 090
      // 086: ldc2_w 3889205645942904343
      // 089: lload 2
      // 08a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: ifnull 11b
      // 093: goto 0a0
      // 096: ldc2_w 3889205645942904343
      // 099: lload 2
      // 09a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield com/zelix/wo.I Ljava/lang/Object;
      // 0a4: goto 0b1
      // 0a7: ldc2_w 3889205645942904343
      // 0aa: lload 2
      // 0ab: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: aload 4
      // 0b3: ifnonnull 0d8
      // 0b6: ifnull 11f
      // 0b9: goto 0c6
      // 0bc: ldc2_w 3889205645942904343
      // 0bf: lload 2
      // 0c0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 5
      // 0c8: getfield com/zelix/wo.I Ljava/lang/Object;
      // 0cb: goto 0d8
      // 0ce: ldc2_w 3889205645942904343
      // 0d1: lload 2
      // 0d2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 4
      // 0da: ifnonnull 0fe
      // 0dd: ifnull 11f
      // 0e0: goto 0ed
      // 0e3: ldc2_w 3889205645942904343
      // 0e6: lload 2
      // 0e7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield com/zelix/wo.I Ljava/lang/Object;
      // 0f1: goto 0fe
      // 0f4: ldc2_w 3889205645942904343
      // 0f7: lload 2
      // 0f8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 5
      // 100: getfield com/zelix/wo.I Ljava/lang/Object;
      // 103: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 106: aload 4
      // 108: ifnonnull 11c
      // 10b: ifeq 11f
      // 10e: goto 11b
      // 111: ldc2_w 3889205645942904343
      // 114: lload 2
      // 115: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: bipush 1
      // 11c: goto 120
      // 11f: bipush 0
      // 120: ireturn
      // 121: bipush 0
      // 122: ireturn
   }

   public Object P(Object[] var1) {
      Object var2 = var1[0];
      Object var3 = this.I;
      this.I = var2;
      return var3;
   }

   public Object v() {
      return this.F;
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/wo.a J
      // 03: ldc2_w 48189656458204
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -4984776912560020522
      // 0b: lload 1
      // 0c: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: getfield com/zelix/wo.I Ljava/lang/Object;
      // 16: aload 3
      // 17: ifnonnull 40
      // 1a: ifnonnull 3c
      // 1d: goto 2a
      // 20: ldc2_w -4725914548082483836
      // 23: lload 1
      // 24: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/zelix/wo.F Ljava/lang/Object;
      // 2e: invokevirtual java/lang/Object.hashCode ()I
      // 31: ireturn
      // 32: ldc2_w -4725914548082483836
      // 35: lload 1
      // 36: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield com/zelix/wo.F Ljava/lang/Object;
      // 40: invokevirtual java/lang/Object.hashCode ()I
      // 43: aload 0
      // 44: getfield com/zelix/wo.I Ljava/lang/Object;
      // 47: invokevirtual java/lang/Object.hashCode ()I
      // 4a: ixor
      // 4b: ireturn
   }

   public Object R(Object[] param1) {
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
      // 14: getstatic com/zelix/wo.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -3719982272025209509
      // 1d: lload 2
      // 1e: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 5
      // 25: aload 4
      // 27: aload 5
      // 29: ifnonnull 59
      // 2c: ifnonnull 55
      // 2f: goto 3c
      // 32: ldc2_w -3970105752964289783
      // 35: lload 2
      // 36: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: new java/lang/IllegalArgumentException
      // 3f: dup
      // 40: aload 0
      // 41: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 44: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 47: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4a: athrow
      // 4b: ldc2_w -3970105752964289783
      // 4e: lload 2
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 0
      // 56: getfield com/zelix/wo.F Ljava/lang/Object;
      // 59: astore 6
      // 5b: aload 0
      // 5c: aload 4
      // 5e: putfield com/zelix/wo.F Ljava/lang/Object;
      // 61: aload 6
      // 63: areturn
   }

   public Object G() {
      return this.I;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
