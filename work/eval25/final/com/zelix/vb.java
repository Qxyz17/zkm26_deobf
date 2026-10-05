package com.zelix;

import java.lang.invoke.MethodHandles;

public class vb extends vj implements Comparable {
   private final String E;
   private static final long b = ess.a(-426674101971946043L, 4726324289264995500L, MethodHandles.lookup().lookupClass()).a(13351660275442L);

   @Override
   public int compareTo(Object var1) {
      long var2 = b ^ 55866076510098L;
      long var4 = var2 ^ 86610417552750L;
      return x44.a<"m">(this, new Object[]{(vb)var1, var4}, 8226961014069950067L, var2);
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
      // 000: getstatic com/zelix/vb.b J
      // 003: ldc2_w 98942303327415
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -7501773062532636773
      // 00b: lload 2
      // 00c: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: istore 4
      // 013: aload 1
      // 014: instanceof com/zelix/vb
      // 017: iload 4
      // 019: ifeq 15c
      // 01c: ifeq 15b
      // 01f: goto 02c
      // 022: ldc2_w -8138161100956988382
      // 025: lload 2
      // 026: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/vb
      // 030: astore 5
      // 032: aload 0
      // 033: getfield com/zelix/vb.d Ljava/lang/String;
      // 036: aload 5
      // 038: getfield com/zelix/vb.d Ljava/lang/String;
      // 03b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03e: iload 4
      // 040: ifeq 08a
      // 043: ifeq 159
      // 046: goto 053
      // 049: ldc2_w -8138161100956988382
      // 04c: lload 2
      // 04d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: aload 0
      // 054: ldc2_w -7548233405265144730
      // 057: lload 2
      // 058: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: iload 4
      // 05f: ifeq 09e
      // 062: goto 06f
      // 065: ldc2_w -8138161100956988382
      // 068: lload 2
      // 069: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: aload 5
      // 071: ldc2_w -7548233405265144730
      // 074: lload 2
      // 075: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07d: goto 08a
      // 080: ldc2_w -8138161100956988382
      // 083: lload 2
      // 084: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: ifeq 159
      // 08d: aload 0
      // 08e: getfield com/zelix/vb.p Ljava/lang/String;
      // 091: goto 09e
      // 094: ldc2_w -8138161100956988382
      // 097: lload 2
      // 098: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: iload 4
      // 0a0: ifeq 0eb
      // 0a3: ifnonnull 0da
      // 0a6: goto 0b3
      // 0a9: ldc2_w -8138161100956988382
      // 0ac: lload 2
      // 0ad: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 5
      // 0b5: getfield com/zelix/vb.p Ljava/lang/String;
      // 0b8: iload 4
      // 0ba: ifeq 0eb
      // 0bd: goto 0ca
      // 0c0: ldc2_w -8138161100956988382
      // 0c3: lload 2
      // 0c4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: ifnull 155
      // 0cd: goto 0da
      // 0d0: ldc2_w -8138161100956988382
      // 0d3: lload 2
      // 0d4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 0
      // 0db: getfield com/zelix/vb.p Ljava/lang/String;
      // 0de: goto 0eb
      // 0e1: ldc2_w -8138161100956988382
      // 0e4: lload 2
      // 0e5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: iload 4
      // 0ed: ifeq 112
      // 0f0: ifnull 159
      // 0f3: goto 100
      // 0f6: ldc2_w -8138161100956988382
      // 0f9: lload 2
      // 0fa: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 5
      // 102: getfield com/zelix/vb.p Ljava/lang/String;
      // 105: goto 112
      // 108: ldc2_w -8138161100956988382
      // 10b: lload 2
      // 10c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: iload 4
      // 114: ifeq 138
      // 117: ifnull 159
      // 11a: goto 127
      // 11d: ldc2_w -8138161100956988382
      // 120: lload 2
      // 121: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 0
      // 128: getfield com/zelix/vb.p Ljava/lang/String;
      // 12b: goto 138
      // 12e: ldc2_w -8138161100956988382
      // 131: lload 2
      // 132: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 5
      // 13a: getfield com/zelix/vb.p Ljava/lang/String;
      // 13d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 140: iload 4
      // 142: ifeq 156
      // 145: ifeq 159
      // 148: goto 155
      // 14b: ldc2_w -8138161100956988382
      // 14e: lload 2
      // 14f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: bipush 1
      // 156: goto 15a
      // 159: bipush 0
      // 15a: ireturn
      // 15b: bipush 0
      // 15c: ireturn
   }

   public String E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"m">(this, 2030641093326446455L, var2);
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
      // 00: getstatic com/zelix/vb.b J
      // 03: ldc2_w 75355887164089
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -7475030322065227858
      // 0b: lload 1
      // 0c: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 3
      // 12: aload 0
      // 13: getfield com/zelix/vb.p Ljava/lang/String;
      // 16: iload 3
      // 17: ifne 4e
      // 1a: ifnonnull 4a
      // 1d: goto 2a
      // 20: ldc2_w -9150913201322622420
      // 23: lload 1
      // 24: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/zelix/vb.d Ljava/lang/String;
      // 2e: invokevirtual java/lang/String.hashCode ()I
      // 31: aload 0
      // 32: ldc2_w -7408046727743530392
      // 35: lload 1
      // 36: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: invokevirtual java/lang/String.hashCode ()I
      // 3e: ixor
      // 3f: ireturn
      // 40: ldc2_w -9150913201322622420
      // 43: lload 1
      // 44: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield com/zelix/vb.d Ljava/lang/String;
      // 4e: invokevirtual java/lang/String.hashCode ()I
      // 51: aload 0
      // 52: ldc2_w -7408046727743530392
      // 55: lload 1
      // 56: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: invokevirtual java/lang/String.hashCode ()I
      // 5e: ixor
      // 5f: aload 0
      // 60: getfield com/zelix/vb.p Ljava/lang/String;
      // 63: invokevirtual java/lang/String.hashCode ()I
      // 66: ixor
      // 67: ireturn
   }

   vb(String var1, String var2, String var3, int var4) {
      super(var1, var3, var4);
      this.E = var2;
   }

   public final int h(Object[] param1) {
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
      // 04: checkcast com/zelix/vb
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/vb.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 3526898795937240863
      // 1c: lload 3
      // 1d: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 0
      // 23: getfield com/zelix/vb.d Ljava/lang/String;
      // 26: aload 2
      // 27: getfield com/zelix/vb.d Ljava/lang/String;
      // 2a: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 2d: istore 6
      // 2f: istore 5
      // 31: iload 6
      // 33: iload 5
      // 35: ifne 70
      // 38: ifeq 55
      // 3b: goto 48
      // 3e: ldc2_w 3003963277239331485
      // 41: lload 3
      // 42: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: iload 6
      // 4a: ireturn
      // 4b: ldc2_w 3003963277239331485
      // 4e: lload 3
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 0
      // 56: ldc2_w 3566851463823667929
      // 59: lload 3
      // 5a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: aload 2
      // 60: ldc2_w 3566851463823667929
      // 63: lload 3
      // 64: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 6c: istore 6
      // 6e: iload 6
      // 70: iload 5
      // 72: ifne d9
      // 75: ifne d7
      // 78: goto 85
      // 7b: ldc2_w 3003963277239331485
      // 7e: lload 3
      // 7f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: aload 0
      // 86: getfield com/zelix/vb.p Ljava/lang/String;
      // 89: iload 5
      // 8b: lload 3
      // 8c: lconst_0
      // 8d: lcmp
      // 8e: ifle c4
      // 91: ifne c2
      // 94: goto a1
      // 97: ldc2_w 3003963277239331485
      // 9a: lload 3
      // 9b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: ifnull d7
      // a4: goto b1
      // a7: ldc2_w 3003963277239331485
      // aa: lload 3
      // ab: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: aload 2
      // b2: getfield com/zelix/vb.p Ljava/lang/String;
      // b5: goto c2
      // b8: ldc2_w 3003963277239331485
      // bb: lload 3
      // bc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: iload 5
      // c4: ifne de
      // c7: ifnonnull da
      // ca: goto d7
      // cd: ldc2_w 3003963277239331485
      // d0: lload 3
      // d1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: athrow
      // d7: iload 6
      // d9: ireturn
      // da: aload 0
      // db: getfield com/zelix/vb.p Ljava/lang/String;
      // de: aload 2
      // df: getfield com/zelix/vb.p Ljava/lang/String;
      // e2: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // e5: ireturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
