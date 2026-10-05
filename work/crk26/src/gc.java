package com.zelix;

import java.lang.invoke.MethodHandles;

public class gc {
   private Object r;
   private final Object P;
   private static final long a = prr.a(6807531483848465494L, 5207453293960608768L, MethodHandles.lookup().lookupClass()).a(109285833689070L);

   public Object I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"q">(this, 1196625706294844297L, var2);
   }

   public Object L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"w">(this, -9117140692179929728L, var2);
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
      // 000: getstatic com/zelix/gc.a J
      // 003: ldc2_w 95964396289387
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -6310530784212175270
      // 00b: lload 2
      // 00c: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: instanceof com/zelix/gc
      // 017: aload 4
      // 019: ifnonnull 152
      // 01c: ifeq 151
      // 01f: goto 02c
      // 022: ldc2_w -5229185640295439173
      // 025: lload 2
      // 026: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/gc
      // 030: astore 5
      // 032: aload 0
      // 033: ldc2_w -5573756190909154892
      // 036: lload 2
      // 037: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 4
      // 03e: ifnonnull 076
      // 041: aload 5
      // 043: ldc2_w -5573756190909154892
      // 046: lload 2
      // 047: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 04f: ifeq 14f
      // 052: goto 05f
      // 055: ldc2_w -5229185640295439173
      // 058: lload 2
      // 059: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: aload 0
      // 060: ldc2_w -5336120348272230133
      // 063: lload 2
      // 064: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: goto 076
      // 06c: ldc2_w -5229185640295439173
      // 06f: lload 2
      // 070: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: aload 4
      // 078: ifnonnull 0cf
      // 07b: ifnonnull 0b8
      // 07e: goto 08b
      // 081: ldc2_w -5229185640295439173
      // 084: lload 2
      // 085: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 5
      // 08d: ldc2_w -5336120348272230133
      // 090: lload 2
      // 091: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: aload 4
      // 098: ifnonnull 0cf
      // 09b: goto 0a8
      // 09e: ldc2_w -5229185640295439173
      // 0a1: lload 2
      // 0a2: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: ifnull 14b
      // 0ab: goto 0b8
      // 0ae: ldc2_w -5229185640295439173
      // 0b1: lload 2
      // 0b2: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: ldc2_w -5336120348272230133
      // 0bc: lload 2
      // 0bd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: goto 0cf
      // 0c5: ldc2_w -5229185640295439173
      // 0c8: lload 2
      // 0c9: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 4
      // 0d1: ifnonnull 0fc
      // 0d4: ifnull 14f
      // 0d7: goto 0e4
      // 0da: ldc2_w -5229185640295439173
      // 0dd: lload 2
      // 0de: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 5
      // 0e6: ldc2_w -5336120348272230133
      // 0e9: lload 2
      // 0ea: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: goto 0fc
      // 0f2: ldc2_w -5229185640295439173
      // 0f5: lload 2
      // 0f6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 4
      // 0fe: ifnonnull 128
      // 101: ifnull 14f
      // 104: goto 111
      // 107: ldc2_w -5229185640295439173
      // 10a: lload 2
      // 10b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: ldc2_w -5336120348272230133
      // 115: lload 2
      // 116: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: goto 128
      // 11e: ldc2_w -5229185640295439173
      // 121: lload 2
      // 122: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 5
      // 12a: ldc2_w -5336120348272230133
      // 12d: lload 2
      // 12e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 136: aload 4
      // 138: ifnonnull 14c
      // 13b: ifeq 14f
      // 13e: goto 14b
      // 141: ldc2_w -5229185640295439173
      // 144: lload 2
      // 145: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: bipush 1
      // 14c: goto 150
      // 14f: bipush 0
      // 150: ireturn
      // 151: bipush 0
      // 152: ireturn
   }

   public gc(long param1, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/gc.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -5705744159342481689
      // 09: lload 1
      // 0a: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokespecial java/lang/Object.<init> ()V
      // 13: astore 4
      // 15: aload 4
      // 17: ifnonnull 49
      // 1a: aload 3
      // 1b: ifnonnull 44
      // 1e: goto 2b
      // 21: ldc2_w -5777184729297978362
      // 24: lload 1
      // 25: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: athrow
      // 2b: new java/lang/IllegalArgumentException
      // 2e: dup
      // 2f: aload 0
      // 30: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 33: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 36: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 39: athrow
      // 3a: ldc2_w -5777184729297978362
      // 3d: lload 1
      // 3e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: aload 3
      // 46: putfield com/zelix/gc.P Ljava/lang/Object;
      // 49: return
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
      // 00: getstatic com/zelix/gc.a J
      // 03: ldc2_w 114219260512821
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -2363742151295188732
      // 0b: lload 1
      // 0c: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: ldc2_w -4419022484998490539
      // 16: lload 1
      // 17: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 3
      // 1d: ifnonnull 52
      // 20: ifnonnull 48
      // 23: goto 30
      // 26: ldc2_w -4598170841494154267
      // 29: lload 1
      // 2a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: aload 0
      // 31: ldc2_w -4181527518965477654
      // 34: lload 1
      // 35: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: invokevirtual java/lang/Object.hashCode ()I
      // 3d: ireturn
      // 3e: ldc2_w -4598170841494154267
      // 41: lload 1
      // 42: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: ldc2_w -4181527518965477654
      // 4c: lload 1
      // 4d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: invokevirtual java/lang/Object.hashCode ()I
      // 55: aload 0
      // 56: ldc2_w -4419022484998490539
      // 59: lload 1
      // 5a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: invokevirtual java/lang/Object.hashCode ()I
      // 62: ixor
      // 63: ireturn
   }

   public Object y(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      Object var5 = m44.a<"q">(this, 139337604548965654L, var2);
      m44.a<"s">(this, var4, 139337604548965654L, var2);
      return var5;
   }

   public gc(Object param1, Object param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/gc.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: ldc2_w 3676992126652853553
      // 09: lload 3
      // 0a: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokespecial java/lang/Object.<init> ()V
      // 13: astore 5
      // 15: aload 5
      // 17: ifnonnull 54
      // 1a: aload 1
      // 1b: ifnonnull 44
      // 1e: goto 2b
      // 21: ldc2_w 3171943890560057296
      // 24: lload 3
      // 25: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: athrow
      // 2b: new java/lang/IllegalArgumentException
      // 2e: dup
      // 2f: aload 0
      // 30: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 33: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 36: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 39: athrow
      // 3a: ldc2_w 3171943890560057296
      // 3d: lload 3
      // 3e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: aload 1
      // 46: putfield com/zelix/gc.P Ljava/lang/Object;
      // 49: aload 0
      // 4a: aload 2
      // 4b: ldc2_w 3357850943823583840
      // 4e: lload 3
      // 4f: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: return
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
