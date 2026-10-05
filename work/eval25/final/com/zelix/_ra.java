package com.zelix;

import java.io.Reader;
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

public class _ra {
   protected boolean d;
   protected int[] R;
   protected int J;
   protected Reader f;
   protected int b;
   protected int L;
   protected int[] w;
   protected char[] i;
   int A;
   protected boolean S;
   protected int G;
   int O;
   int I;
   public int h;
   protected int F;
   private static final long a = ess.a(-3157830812098960812L, -3980971001279635010L, MethodHandles.lookup().lookupClass()).a(111438175238647L);
   private static final long[] c;
   private static final Integer[] e;
   private static final Map g = new HashMap(13);

   public _ra(Reader var1, int var2, int var3, char var4, int var5, int var6, char var7) {
      long var8 = ((long)var3 << 32 | (long)var4 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      super();
      x44.a<"p">(this, -1, -9113713592997437885L, var8);
      x44.a<"p">(this, 0, -6940668771794687549L, var8);
      x44.a<"p">(this, 1, -7246777503062674523L, var8);
      x44.a<"p">(this, false, -8782670839477682783L, var8);
      x44.a<"p">(this, false, -7318879477516107729L, var8);
      x44.a<"p">(this, 0, -7073649287282208099L, var8);
      x44.a<"p">(this, 0, -9197661826777207833L, var8);
      x44.a<"p">(this, a<"y">(3975, 1444259215501415567L ^ var8), -7473471650705516132L, var8);
      x44.a<"p">(this, var1, -8672720844374954177L, var8);
      x44.a<"p">(this, var2, -7246777503062674523L, var8);
      x44.a<"p">(this, var5 - 1, -6940668771794687549L, var8);
      x44.a<"p">(this, var6, -8674871365377196552L, var8);
      x44.a<"p">(this, var6, -9121205297961902688L, var8);
      x44.a<"p">(this, new char[var6], -9150541182740604900L, var8);
      x44.a<"p">(this, new int[var6], -8929468703498730075L, var8);
      x44.a<"p">(this, new int[var6], -7457195322682994330L, var8);
   }

   public _ra(Reader var1, long var2, int var4, int var5) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 128786764269852L;
      int var6 = (int)((var2 ^ 128786764269852L) >>> 32);
      int var7 = (int)((var2 ^ 128786764269852L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      this(var1, var4, var6, (char)var7, var5, a<"y">(15428, 4398130246294444543L ^ var2), (char)var8);
   }

   public char W(Object[] param1) {
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
      // 00c: getstatic com/zelix/_ra.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 113179270484242
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 134939564162533
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -6075713225073426420
      // 025: lload 2
      // 026: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 8
      // 02d: aload 0
      // 02e: ldc2_w -6024684015508715560
      // 031: lload 2
      // 032: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: iload 8
      // 039: ifeq 0ea
      // 03c: ifle 0d3
      // 03f: goto 04c
      // 042: ldc2_w -5613810504379396634
      // 045: lload 2
      // 046: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: aload 0
      // 04d: dup
      // 04e: ldc2_w -6024684015508715560
      // 051: lload 2
      // 052: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: bipush 1
      // 058: isub
      // 059: ldc2_w -6024684015508715560
      // 05c: lload 2
      // 05d: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: aload 0
      // 063: dup
      // 064: ldc2_w -5928206864442838404
      // 067: lload 2
      // 068: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: bipush 1
      // 06e: iadd
      // 06f: dup_x1
      // 070: ldc2_w -5928206864442838404
      // 073: lload 2
      // 074: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: iload 8
      // 07b: ifeq 0d2
      // 07e: goto 08b
      // 081: ldc2_w -5613810504379396634
      // 084: lload 2
      // 085: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 0
      // 08c: ldc2_w -6078741334508908089
      // 08f: lload 2
      // 090: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: if_icmpne 0bd
      // 098: goto 0a5
      // 09b: ldc2_w -5613810504379396634
      // 09e: lload 2
      // 09f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: bipush 0
      // 0a7: ldc2_w -5928206864442838404
      // 0aa: lload 2
      // 0ab: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: goto 0bd
      // 0b3: ldc2_w -5613810504379396634
      // 0b6: lload 2
      // 0b7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: ldc2_w -5963348902323227613
      // 0c1: lload 2
      // 0c2: invokedynamic h (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: aload 0
      // 0c8: ldc2_w -5928206864442838404
      // 0cb: lload 2
      // 0cc: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: caload
      // 0d2: ireturn
      // 0d3: aload 0
      // 0d4: dup
      // 0d5: ldc2_w -5928206864442838404
      // 0d8: lload 2
      // 0d9: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: bipush 1
      // 0df: iadd
      // 0e0: dup_x1
      // 0e1: ldc2_w -5928206864442838404
      // 0e4: lload 2
      // 0e5: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: iload 8
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 0ff
      // 0f2: ifeq 14a
      // 0f5: aload 0
      // 0f6: ldc2_w -5626671652906565982
      // 0f9: lload 2
      // 0fa: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: if_icmplt 135
      // 102: goto 10f
      // 105: ldc2_w -5613810504379396634
      // 108: lload 2
      // 109: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 0
      // 110: lload 4
      // 112: bipush 1
      // 113: anewarray 175
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w -5439405714599794957
      // 122: lload 2
      // 123: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: goto 135
      // 12b: ldc2_w -5613810504379396634
      // 12e: lload 2
      // 12f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: aload 0
      // 136: ldc2_w -5963348902323227613
      // 139: lload 2
      // 13a: invokedynamic h (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: aload 0
      // 140: ldc2_w -5928206864442838404
      // 143: lload 2
      // 144: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: caload
      // 14a: istore 9
      // 14c: aload 0
      // 14d: lload 6
      // 14f: iload 9
      // 151: bipush 2
      // 152: anewarray 175
      // 155: dup_x1
      // 156: swap
      // 157: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15a: bipush 1
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x2
      // 15e: dup_x2
      // 15f: pop
      // 160: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: ldc2_w -5657986436818216305
      // 169: lload 2
      // 16a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: iload 9
      // 171: ireturn
   }

   protected void C(Object[] param1) {
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
      // 00c: getstatic com/zelix/_ra.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 21332600034140
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 132993368015086
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -3715209635017959856
      // 025: lload 2
      // 026: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 8
      // 02d: aload 0
      // 02e: ldc2_w -2931244064873965542
      // 031: lload 2
      // 032: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 0
      // 038: ldc2_w -3752201741949495513
      // 03b: lload 2
      // 03c: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: iload 8
      // 043: ifne 303
      // 046: if_icmpne 2c6
      // 049: goto 056
      // 04c: ldc2_w -3121108984701555874
      // 04f: lload 2
      // 050: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: athrow
      // 056: aload 0
      // 057: ldc2_w -3752201741949495513
      // 05a: lload 2
      // 05b: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: aload 0
      // 061: ldc2_w -3667106528007702657
      // 064: lload 2
      // 065: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: iload 8
      // 06c: lload 2
      // 06d: lconst_0
      // 06e: lcmp
      // 06f: iflt 1e2
      // 072: ifne 1da
      // 075: goto 082
      // 078: ldc2_w -3121108984701555874
      // 07b: lload 2
      // 07c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: lload 2
      // 083: lconst_0
      // 084: lcmp
      // 085: iflt 1cd
      // 088: if_icmpne 1b9
      // 08b: goto 098
      // 08e: ldc2_w -3121108984701555874
      // 091: lload 2
      // 092: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 0
      // 099: ldc2_w -3096164290822504784
      // 09c: lload 2
      // 09d: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 148
      // 0a8: iload 8
      // 0aa: ifne 148
      // 0ad: goto 0ba
      // 0b0: ldc2_w -3121108984701555874
      // 0b3: lload 2
      // 0b4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: sipush 4110
      // 0bd: ldc2_w 1179844193459175808
      // 0c0: lload 2
      // 0c1: lxor
      // 0c2: invokedynamic y (IJ)I bsm=com/zelix/_ra.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: if_icmple 119
      // 0ca: goto 0d7
      // 0cd: ldc2_w -3121108984701555874
      // 0d0: lload 2
      // 0d1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: aload 0
      // 0d9: bipush 0
      // 0da: dup_x1
      // 0db: ldc2_w -2931244064873965542
      // 0de: lload 2
      // 0df: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: ldc2_w -3818228156065426236
      // 0e7: lload 2
      // 0e8: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: ldc2_w -3096164290822504784
      // 0f2: lload 2
      // 0f3: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: ldc2_w -3752201741949495513
      // 0fb: lload 2
      // 0fc: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: iload 8
      // 103: lload 2
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 302
      // 109: ifeq 2c6
      // 10c: goto 119
      // 10f: ldc2_w -3121108984701555874
      // 112: lload 2
      // 113: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: aload 0
      // 11a: lload 2
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 18d
      // 120: iload 8
      // 122: ifne 18d
      // 125: goto 132
      // 128: ldc2_w -3121108984701555874
      // 12b: lload 2
      // 12c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: ldc2_w -3096164290822504784
      // 135: lload 2
      // 136: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: goto 148
      // 13e: ldc2_w -3121108984701555874
      // 141: lload 2
      // 142: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: athrow
      // 148: lload 2
      // 149: lconst_0
      // 14a: lcmp
      // 14b: ifle 169
      // 14e: ifge 17f
      // 151: aload 0
      // 152: aload 0
      // 153: bipush 0
      // 154: dup_x1
      // 155: ldc2_w -2931244064873965542
      // 158: lload 2
      // 159: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: ldc2_w -3818228156065426236
      // 161: lload 2
      // 162: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: iload 8
      // 169: lload 2
      // 16a: lconst_0
      // 16b: lcmp
      // 16c: iflt 302
      // 16f: ifeq 2c6
      // 172: goto 17f
      // 175: ldc2_w -3121108984701555874
      // 178: lload 2
      // 179: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: aload 0
      // 180: goto 18d
      // 183: ldc2_w -3121108984701555874
      // 186: lload 2
      // 187: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: lload 6
      // 18f: bipush 0
      // 190: bipush 2
      // 191: anewarray 175
      // 194: dup_x1
      // 195: swap
      // 196: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 199: bipush 1
      // 19a: swap
      // 19b: aastore
      // 19c: dup_x2
      // 19d: dup_x2
      // 19e: pop
      // 19f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a2: bipush 0
      // 1a3: swap
      // 1a4: aastore
      // 1a5: ldc2_w -3191293067207715981
      // 1a8: lload 2
      // 1a9: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: iload 8
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: iflt 302
      // 1b6: ifeq 2c6
      // 1b9: aload 0
      // 1ba: ldc2_w -3752201741949495513
      // 1bd: lload 2
      // 1be: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: aload 0
      // 1c4: ldc2_w -3096164290822504784
      // 1c7: lload 2
      // 1c8: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: goto 1da
      // 1d0: ldc2_w -3121108984701555874
      // 1d3: lload 2
      // 1d4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: lload 2
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: ifle 268
      // 1e0: iload 8
      // 1e2: ifne 268
      // 1e5: if_icmple 221
      // 1e8: goto 1f5
      // 1eb: ldc2_w -3121108984701555874
      // 1ee: lload 2
      // 1ef: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: aload 0
      // 1f6: aload 0
      // 1f7: ldc2_w -3667106528007702657
      // 1fa: lload 2
      // 1fb: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: ldc2_w -3752201741949495513
      // 203: lload 2
      // 204: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: iload 8
      // 20b: lload 2
      // 20c: lconst_0
      // 20d: lcmp
      // 20e: ifle 302
      // 211: ifeq 2c6
      // 214: goto 221
      // 217: ldc2_w -3121108984701555874
      // 21a: lload 2
      // 21b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 0
      // 222: iload 8
      // 224: lload 2
      // 225: lconst_0
      // 226: lcmp
      // 227: ifle 2bd
      // 22a: ifne 2b3
      // 22d: goto 23a
      // 230: ldc2_w -3121108984701555874
      // 233: lload 2
      // 234: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: athrow
      // 23a: ldc2_w -3096164290822504784
      // 23d: lload 2
      // 23e: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: aload 0
      // 244: ldc2_w -3752201741949495513
      // 247: lload 2
      // 248: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: isub
      // 24e: sipush 20286
      // 251: ldc2_w 6960753482760937138
      // 254: lload 2
      // 255: lxor
      // 256: invokedynamic y (IJ)I bsm=com/zelix/_ra.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: goto 268
      // 25e: ldc2_w -3121108984701555874
      // 261: lload 2
      // 262: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: athrow
      // 268: if_icmpge 2a5
      // 26b: aload 0
      // 26c: lload 6
      // 26e: bipush 1
      // 26f: bipush 2
      // 270: anewarray 175
      // 273: dup_x1
      // 274: swap
      // 275: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 278: bipush 1
      // 279: swap
      // 27a: aastore
      // 27b: dup_x2
      // 27c: dup_x2
      // 27d: pop
      // 27e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 281: bipush 0
      // 282: swap
      // 283: aastore
      // 284: ldc2_w -3191293067207715981
      // 287: lload 2
      // 288: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: iload 8
      // 28f: lload 2
      // 290: lconst_0
      // 291: lcmp
      // 292: ifle 302
      // 295: ifeq 2c6
      // 298: goto 2a5
      // 29b: ldc2_w -3121108984701555874
      // 29e: lload 2
      // 29f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a4: athrow
      // 2a5: aload 0
      // 2a6: goto 2b3
      // 2a9: ldc2_w -3121108984701555874
      // 2ac: lload 2
      // 2ad: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: athrow
      // 2b3: aload 0
      // 2b4: ldc2_w -3096164290822504784
      // 2b7: lload 2
      // 2b8: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: ldc2_w -3752201741949495513
      // 2c0: lload 2
      // 2c1: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: aload 0
      // 2c7: ldc2_w -3665026120752175688
      // 2ca: lload 2
      // 2cb: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: aload 0
      // 2d1: ldc2_w -3781397266715667813
      // 2d4: lload 2
      // 2d5: invokedynamic h (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: aload 0
      // 2db: ldc2_w -2931244064873965542
      // 2de: lload 2
      // 2df: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: aload 0
      // 2e5: ldc2_w -3752201741949495513
      // 2e8: lload 2
      // 2e9: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: aload 0
      // 2ef: ldc2_w -2931244064873965542
      // 2f2: lload 2
      // 2f3: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: isub
      // 2f9: ldc2_w -3218952106061111070
      // 2fc: lload 2
      // 2fd: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: dup
      // 303: istore 9
      // 305: bipush -1
      // 306: if_icmpne 32e
      // 309: aload 0
      // 30a: ldc2_w -3665026120752175688
      // 30d: lload 2
      // 30e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: ldc2_w -3034964372569558292
      // 316: lload 2
      // 317: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: new java/io/IOException
      // 31f: dup
      // 320: invokespecial java/io/IOException.<init> ()V
      // 323: athrow
      // 324: ldc2_w -3121108984701555874
      // 327: lload 2
      // 328: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: athrow
      // 32e: aload 0
      // 32f: dup
      // 330: ldc2_w -2931244064873965542
      // 333: lload 2
      // 334: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: iload 9
      // 33b: iadd
      // 33c: ldc2_w -2931244064873965542
      // 33f: lload 2
      // 340: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: return
      // 346: astore 10
      // 348: aload 0
      // 349: dup
      // 34a: ldc2_w -3818228156065426236
      // 34d: lload 2
      // 34e: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: bipush 1
      // 354: isub
      // 355: ldc2_w -3818228156065426236
      // 358: lload 2
      // 359: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35e: aload 0
      // 35f: bipush 0
      // 360: lload 4
      // 362: bipush 2
      // 363: anewarray 175
      // 366: dup_x2
      // 367: dup_x2
      // 368: pop
      // 369: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 36c: bipush 1
      // 36d: swap
      // 36e: aastore
      // 36f: dup_x1
      // 370: swap
      // 371: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 374: bipush 0
      // 375: swap
      // 376: aastore
      // 377: ldc2_w -3502619258127910878
      // 37a: lload 2
      // 37b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: aload 0
      // 381: iload 8
      // 383: lload 2
      // 384: lconst_0
      // 385: lcmp
      // 386: iflt 3be
      // 389: ifne 3b4
      // 38c: ldc2_w -3096164290822504784
      // 38f: lload 2
      // 390: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 395: bipush -1
      // 396: if_icmpne 3c7
      // 399: goto 3a6
      // 39c: ldc2_w -3121108984701555874
      // 39f: lload 2
      // 3a0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: athrow
      // 3a6: aload 0
      // 3a7: goto 3b4
      // 3aa: ldc2_w -3121108984701555874
      // 3ad: lload 2
      // 3ae: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b3: athrow
      // 3b4: aload 0
      // 3b5: ldc2_w -3818228156065426236
      // 3b8: lload 2
      // 3b9: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: ldc2_w -3096164290822504784
      // 3c1: lload 2
      // 3c2: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: aload 10
      // 3c9: athrow
   }

   public int u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -2904751141522254335L, var2)[x44.a<"k">(this, -3734846137829267565L, var2)];
   }

   public int V(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      return x44.a<"m">(this, 5059942139012534236L, var5)[x44.a<"m">(this, 4698785247896136333L, var5)];
   }

   protected void Q(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: pop
      // 017: getstatic com/zelix/_ra.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: ldc2_w -2267579107651192153
      // 020: lload 2
      // 021: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: aload 0
      // 027: dup
      // 028: ldc2_w -442005129595023437
      // 02b: lload 2
      // 02c: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: bipush 1
      // 032: iadd
      // 033: ldc2_w -442005129595023437
      // 036: lload 2
      // 037: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: istore 5
      // 03e: aload 0
      // 03f: ldc2_w -279652195931986337
      // 042: lload 2
      // 043: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: iload 5
      // 04a: ifne 0b2
      // 04d: ifeq 09b
      // 050: goto 05d
      // 053: ldc2_w -551537299089111127
      // 056: lload 2
      // 057: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 0
      // 05e: bipush 0
      // 05f: ldc2_w -279652195931986337
      // 062: lload 2
      // 063: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 0
      // 069: dup
      // 06a: ldc2_w -207690690397121067
      // 06d: lload 2
      // 06e: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 0
      // 074: bipush 1
      // 075: dup_x1
      // 076: ldc2_w -442005129595023437
      // 079: lload 2
      // 07a: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: iadd
      // 080: ldc2_w -207690690397121067
      // 083: lload 2
      // 084: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: iload 5
      // 08b: ifeq 15a
      // 08e: goto 09b
      // 091: ldc2_w -551537299089111127
      // 094: lload 2
      // 095: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 0
      // 09c: ldc2_w -2274938708839801903
      // 09f: lload 2
      // 0a0: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: goto 0b2
      // 0a8: ldc2_w -551537299089111127
      // 0ab: lload 2
      // 0ac: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 15c
      // 0b8: iload 5
      // 0ba: ifne 15c
      // 0bd: ifeq 15a
      // 0c0: goto 0cd
      // 0c3: ldc2_w -551537299089111127
      // 0c6: lload 2
      // 0c7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: bipush 0
      // 0cf: iload 5
      // 0d1: ifne 151
      // 0d4: goto 0e1
      // 0d7: ldc2_w -551537299089111127
      // 0da: lload 2
      // 0db: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 2
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: iflt 144
      // 0e7: ldc2_w -2274938708839801903
      // 0ea: lload 2
      // 0eb: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: iload 4
      // 0f2: sipush 624
      // 0f5: ldc2_w 644766475735449354
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic y (IJ)I bsm=com/zelix/_ra.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: if_icmpne 12c
      // 102: goto 10f
      // 105: ldc2_w -551537299089111127
      // 108: lload 2
      // 109: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 0
      // 110: bipush 1
      // 111: ldc2_w -279652195931986337
      // 114: lload 2
      // 115: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: iload 5
      // 11c: ifeq 15a
      // 11f: goto 12c
      // 122: ldc2_w -551537299089111127
      // 125: lload 2
      // 126: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 0
      // 12d: dup
      // 12e: ldc2_w -207690690397121067
      // 131: lload 2
      // 132: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: aload 0
      // 138: bipush 1
      // 139: dup_x1
      // 13a: ldc2_w -442005129595023437
      // 13d: lload 2
      // 13e: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: iadd
      // 144: goto 151
      // 147: ldc2_w -551537299089111127
      // 14a: lload 2
      // 14b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: ldc2_w -207690690397121067
      // 154: lload 2
      // 155: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: iload 4
      // 15c: lload 2
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 197
      // 162: tableswitch 192 9 13 104 69 192 192 34
      // 184: aload 0
      // 185: bipush 1
      // 186: ldc2_w -2274938708839801903
      // 189: lload 2
      // 18a: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: lload 2
      // 190: lconst_0
      // 191: lcmp
      // 192: ifle 260
      // 195: iload 5
      // 197: ifeq 222
      // 19a: goto 1a7
      // 19d: ldc2_w -551537299089111127
      // 1a0: lload 2
      // 1a1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: bipush 1
      // 1a9: ldc2_w -279652195931986337
      // 1ac: lload 2
      // 1ad: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: lload 2
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: ifle 260
      // 1b8: iload 5
      // 1ba: ifeq 222
      // 1bd: goto 1ca
      // 1c0: ldc2_w -551537299089111127
      // 1c3: lload 2
      // 1c4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: dup
      // 1cc: ldc2_w -442005129595023437
      // 1cf: lload 2
      // 1d0: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: bipush 1
      // 1d6: isub
      // 1d7: ldc2_w -442005129595023437
      // 1da: lload 2
      // 1db: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: aload 0
      // 1e1: dup
      // 1e2: ldc2_w -442005129595023437
      // 1e5: lload 2
      // 1e6: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: aload 0
      // 1ec: ldc2_w -128210707674054676
      // 1ef: lload 2
      // 1f0: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: aload 0
      // 1f6: ldc2_w -442005129595023437
      // 1f9: lload 2
      // 1fa: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: aload 0
      // 200: ldc2_w -128210707674054676
      // 203: lload 2
      // 204: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: irem
      // 20a: isub
      // 20b: iadd
      // 20c: ldc2_w -442005129595023437
      // 20f: lload 2
      // 210: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: goto 222
      // 218: ldc2_w -551537299089111127
      // 21b: lload 2
      // 21c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 0
      // 223: ldc2_w -2133505912840854571
      // 226: lload 2
      // 227: invokedynamic o (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: aload 0
      // 22d: ldc2_w -1732212480292390861
      // 230: lload 2
      // 231: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: aload 0
      // 237: ldc2_w -207690690397121067
      // 23a: lload 2
      // 23b: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: iastore
      // 241: aload 0
      // 242: ldc2_w -75755842219542762
      // 245: lload 2
      // 246: invokedynamic o (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: aload 0
      // 24c: ldc2_w -1732212480292390861
      // 24f: lload 2
      // 250: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: aload 0
      // 256: ldc2_w -442005129595023437
      // 259: lload 2
      // 25a: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: iastore
      // 260: return
   }

   public void F(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/_ra.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 3017638844022489666
      // 1f: lload 3
      // 20: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: dup
      // 27: ldc2_w 3326594727756400022
      // 2a: lload 3
      // 2b: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 2
      // 31: iadd
      // 32: ldc2_w 3326594727756400022
      // 35: lload 3
      // 36: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: istore 5
      // 3d: aload 0
      // 3e: dup
      // 3f: ldc2_w 3455583409548603442
      // 42: lload 3
      // 43: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: iload 2
      // 49: isub
      // 4a: iload 5
      // 4c: ifeq 8c
      // 4f: dup_x1
      // 50: ldc2_w 3455583409548603442
      // 53: lload 3
      // 54: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: ifge 95
      // 5c: goto 69
      // 5f: ldc2_w 3484036374425145256
      // 62: lload 3
      // 63: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: aload 0
      // 6a: dup
      // 6b: ldc2_w 3455583409548603442
      // 6e: lload 3
      // 6f: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: aload 0
      // 75: ldc2_w 3021226501688677257
      // 78: lload 3
      // 79: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: iadd
      // 7f: goto 8c
      // 82: ldc2_w 3484036374425145256
      // 85: lload 3
      // 86: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: ldc2_w 3455583409548603442
      // 8f: lload 3
      // 90: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: return
   }

   protected void y(Object[] param1) {
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
      // 00e: checkcast java/lang/Boolean
      // 011: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 014: istore 4
      // 016: pop
      // 017: getstatic com/zelix/_ra.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: ldc2_w 8814288944592638448
      // 020: lload 2
      // 021: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: aload 0
      // 027: ldc2_w 8818020501254242363
      // 02a: lload 2
      // 02b: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: sipush 20286
      // 033: ldc2_w 6960775628984281590
      // 036: lload 2
      // 037: lxor
      // 038: invokedynamic y (IJ)I bsm=com/zelix/_ra.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: iadd
      // 03e: newarray 5
      // 040: astore 6
      // 042: istore 5
      // 044: aload 0
      // 045: ldc2_w 8818020501254242363
      // 048: lload 2
      // 049: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: sipush 20286
      // 051: ldc2_w 6960775628984281590
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic y (IJ)I bsm=com/zelix/_ra.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: iadd
      // 05c: newarray 10
      // 05e: astore 7
      // 060: aload 0
      // 061: ldc2_w 8818020501254242363
      // 064: lload 2
      // 065: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: sipush 20286
      // 06d: ldc2_w 6960775628984281590
      // 070: lload 2
      // 071: lxor
      // 072: invokedynamic y (IJ)I bsm=com/zelix/_ra.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: iadd
      // 078: newarray 10
      // 07a: astore 8
      // 07c: iload 5
      // 07e: ifeq 2d6
      // 081: iload 4
      // 083: ifeq 218
      // 086: goto 093
      // 089: ldc2_w 7200027708168854554
      // 08c: lload 2
      // 08d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 0
      // 094: ldc2_w 8989734473684559327
      // 097: lload 2
      // 098: invokedynamic l (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: aload 0
      // 09e: ldc2_w 7083038637466372596
      // 0a1: lload 2
      // 0a2: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: aload 6
      // 0a9: bipush 0
      // 0aa: aload 0
      // 0ab: ldc2_w 8818020501254242363
      // 0ae: lload 2
      // 0af: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: aload 0
      // 0b5: ldc2_w 7083038637466372596
      // 0b8: lload 2
      // 0b9: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: isub
      // 0bf: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c2: aload 0
      // 0c3: ldc2_w 8989734473684559327
      // 0c6: lload 2
      // 0c7: invokedynamic l (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: bipush 0
      // 0cd: aload 6
      // 0cf: aload 0
      // 0d0: ldc2_w 8818020501254242363
      // 0d3: lload 2
      // 0d4: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: aload 0
      // 0da: ldc2_w 7083038637466372596
      // 0dd: lload 2
      // 0de: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: isub
      // 0e4: aload 0
      // 0e5: ldc2_w 8955083913225167744
      // 0e8: lload 2
      // 0e9: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f1: aload 0
      // 0f2: aload 6
      // 0f4: ldc2_w 8989734473684559327
      // 0f7: lload 2
      // 0f8: invokedynamic s (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: aload 0
      // 0fe: ldc2_w 8779603780205901926
      // 101: lload 2
      // 102: invokedynamic l (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: aload 0
      // 108: ldc2_w 7083038637466372596
      // 10b: lload 2
      // 10c: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: aload 7
      // 113: bipush 0
      // 114: aload 0
      // 115: ldc2_w 8818020501254242363
      // 118: lload 2
      // 119: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: aload 0
      // 11f: ldc2_w 7083038637466372596
      // 122: lload 2
      // 123: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: isub
      // 129: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 12c: aload 0
      // 12d: ldc2_w 8779603780205901926
      // 130: lload 2
      // 131: invokedynamic l (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: bipush 0
      // 137: aload 7
      // 139: aload 0
      // 13a: ldc2_w 8818020501254242363
      // 13d: lload 2
      // 13e: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: aload 0
      // 144: ldc2_w 7083038637466372596
      // 147: lload 2
      // 148: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: isub
      // 14e: aload 0
      // 14f: ldc2_w 8955083913225167744
      // 152: lload 2
      // 153: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 15b: aload 0
      // 15c: aload 7
      // 15e: ldc2_w 8779603780205901926
      // 161: lload 2
      // 162: invokedynamic s (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: aload 0
      // 168: ldc2_w 7296381995173702821
      // 16b: lload 2
      // 16c: invokedynamic l (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: aload 0
      // 172: ldc2_w 7083038637466372596
      // 175: lload 2
      // 176: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: aload 8
      // 17d: bipush 0
      // 17e: aload 0
      // 17f: ldc2_w 8818020501254242363
      // 182: lload 2
      // 183: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: aload 0
      // 189: ldc2_w 7083038637466372596
      // 18c: lload 2
      // 18d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: isub
      // 193: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 196: aload 0
      // 197: ldc2_w 7296381995173702821
      // 19a: lload 2
      // 19b: invokedynamic l (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: bipush 0
      // 1a1: aload 8
      // 1a3: aload 0
      // 1a4: ldc2_w 8818020501254242363
      // 1a7: lload 2
      // 1a8: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: aload 0
      // 1ae: ldc2_w 7083038637466372596
      // 1b1: lload 2
      // 1b2: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: isub
      // 1b8: aload 0
      // 1b9: ldc2_w 8955083913225167744
      // 1bc: lload 2
      // 1bd: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1c5: aload 0
      // 1c6: aload 8
      // 1c8: ldc2_w 7296381995173702821
      // 1cb: lload 2
      // 1cc: invokedynamic s (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: aload 0
      // 1d2: aload 0
      // 1d3: dup
      // 1d4: ldc2_w 8955083913225167744
      // 1d7: lload 2
      // 1d8: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: aload 0
      // 1de: ldc2_w 8818020501254242363
      // 1e1: lload 2
      // 1e2: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: aload 0
      // 1e8: ldc2_w 7083038637466372596
      // 1eb: lload 2
      // 1ec: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: isub
      // 1f2: iadd
      // 1f3: dup_x1
      // 1f4: ldc2_w 8955083913225167744
      // 1f7: lload 2
      // 1f8: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: ldc2_w 6923745572314525534
      // 200: lload 2
      // 201: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: iload 5
      // 208: ifne 300
      // 20b: goto 218
      // 20e: ldc2_w 7200027708168854554
      // 211: lload 2
      // 212: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 0
      // 219: ldc2_w 8989734473684559327
      // 21c: lload 2
      // 21d: invokedynamic l (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: aload 0
      // 223: ldc2_w 7083038637466372596
      // 226: lload 2
      // 227: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: aload 6
      // 22e: bipush 0
      // 22f: aload 0
      // 230: ldc2_w 8818020501254242363
      // 233: lload 2
      // 234: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: aload 0
      // 23a: ldc2_w 7083038637466372596
      // 23d: lload 2
      // 23e: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: isub
      // 244: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 247: aload 0
      // 248: aload 6
      // 24a: ldc2_w 8989734473684559327
      // 24d: lload 2
      // 24e: invokedynamic s (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: aload 0
      // 254: ldc2_w 8779603780205901926
      // 257: lload 2
      // 258: invokedynamic l (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: aload 0
      // 25e: ldc2_w 7083038637466372596
      // 261: lload 2
      // 262: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: aload 7
      // 269: bipush 0
      // 26a: aload 0
      // 26b: ldc2_w 8818020501254242363
      // 26e: lload 2
      // 26f: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: aload 0
      // 275: ldc2_w 7083038637466372596
      // 278: lload 2
      // 279: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: isub
      // 27f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 282: aload 0
      // 283: aload 7
      // 285: ldc2_w 8779603780205901926
      // 288: lload 2
      // 289: invokedynamic s (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: aload 0
      // 28f: ldc2_w 7296381995173702821
      // 292: lload 2
      // 293: invokedynamic l (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: aload 0
      // 299: ldc2_w 7083038637466372596
      // 29c: lload 2
      // 29d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: aload 8
      // 2a4: bipush 0
      // 2a5: aload 0
      // 2a6: ldc2_w 8818020501254242363
      // 2a9: lload 2
      // 2aa: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: aload 0
      // 2b0: ldc2_w 7083038637466372596
      // 2b3: lload 2
      // 2b4: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: isub
      // 2ba: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2bd: aload 0
      // 2be: aload 8
      // 2c0: ldc2_w 7296381995173702821
      // 2c3: lload 2
      // 2c4: invokedynamic s (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: goto 2d6
      // 2cc: ldc2_w 7200027708168854554
      // 2cf: lload 2
      // 2d0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: athrow
      // 2d6: aload 0
      // 2d7: aload 0
      // 2d8: dup
      // 2d9: ldc2_w 8955083913225167744
      // 2dc: lload 2
      // 2dd: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: aload 0
      // 2e3: ldc2_w 7083038637466372596
      // 2e6: lload 2
      // 2e7: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: isub
      // 2ed: dup_x1
      // 2ee: ldc2_w 8955083913225167744
      // 2f1: lload 2
      // 2f2: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: ldc2_w 6923745572314525534
      // 2fa: lload 2
      // 2fb: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: goto 318
      // 303: astore 9
      // 305: new java/lang/Error
      // 308: dup
      // 309: aload 9
      // 30b: ldc2_w 6978402178978255817
      // 30e: lload 2
      // 30f: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 317: athrow
      // 318: aload 0
      // 319: dup
      // 31a: ldc2_w 8818020501254242363
      // 31d: lload 2
      // 31e: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: sipush 20286
      // 326: ldc2_w 6960775628984281590
      // 329: lload 2
      // 32a: lxor
      // 32b: invokedynamic y (IJ)I bsm=com/zelix/_ra.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: iadd
      // 331: ldc2_w 8818020501254242363
      // 334: lload 2
      // 335: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: aload 0
      // 33b: aload 0
      // 33c: ldc2_w 8818020501254242363
      // 33f: lload 2
      // 340: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: ldc2_w 8982909406479196259
      // 348: lload 2
      // 349: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: aload 0
      // 34f: bipush 0
      // 350: ldc2_w 7083038637466372596
      // 353: lload 2
      // 354: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 359: lload 2
      // 35a: lconst_0
      // 35b: lcmp
      // 35c: iflt 379
      // 35f: ldc2_w 8692901174748352524
      // 362: lload 2
      // 363: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: ifnonnull 386
      // 36b: iinc 5 1
      // 36e: iload 5
      // 370: ldc2_w 8816009718543903163
      // 373: lload 2
      // 374: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: goto 386
      // 37c: ldc2_w 7200027708168854554
      // 37f: lload 2
      // 380: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: return
   }

   public int S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -9012537030897007780L, var2)[x44.a<"n">(this, -8683860293579433798L, var2)];
   }

   public int R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -2456154728751115251L, var2)[x44.a<"l">(this, -4256233895040689368L, var2)];
   }

   public String g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"j">(this, 7365907665265359358L, var2) >= x44.a<"j">(this, 8661036423968904074L, var2)) {
            return new String(
               x44.a<"j">(this, 7403882046707416993L, var2),
               x44.a<"j">(this, 8661036423968904074L, var2),
               x44.a<"j">(this, 7365907665265359358L, var2) - x44.a<"j">(this, 8661036423968904074L, var2) + 1
            );
         }
      } catch (gj var4) {
         throw x44.a<"v">(var4, 8761066619816494692L, var2);
      }

      return new String(
            x44.a<"j">(this, 7403882046707416993L, var2),
            x44.a<"j">(this, 8661036423968904074L, var2),
            x44.a<"j">(this, 6927040132838136389L, var2) - x44.a<"j">(this, 8661036423968904074L, var2)
         )
         + new String(x44.a<"j">(this, 7403882046707416993L, var2), 0, x44.a<"j">(this, 7365907665265359358L, var2) + 1);
   }

   public char k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 45737753343434L;
      x44.a<"w">(this, -1, 3589502553604921960L, var2);
      char var6 = x44.a<"l">(this, new Object[]{var4}, 3506447632320832741L, var2);
      x44.a<"w">(this, x44.a<"h">(this, 3448247472280809500L, var2), 3589502553604921960L, var2);
      return var6;
   }

   static {
      long var0 = a ^ 81044705826473L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "\u009aßð1!»Ä\u0010 \u0002[6ÐË\u0094_\u001b\u009e\u0093\u0098Æ\u008fÄ\u0097";
      int var7 = "\u009aßð1!»Ä\u0010 \u0002[6ÐË\u0094_\u001b\u009e\u0093\u0098Æ\u008fÄ\u0097".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     c = var8;
                     e = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "OùMs9ºl\r\u0089y&\fB§¸\u0002";
                  var7 = "OùMs9ºl\r\u0089y&\fB§¸\u0002".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20361;
      if (e[var3] == null) {
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
         long var5 = c[var3];
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
            throw new RuntimeException("com/zelix/_ra", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_ra" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
