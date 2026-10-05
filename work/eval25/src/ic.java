package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ic extends h8 implements _y1, yk {
   private String x;
   private pf[] G;
   private int Z;
   private int s;
   private _op U;
   private int f;
   private _ya E;
   private boolean k;
   private _fo[] C;
   private int p;
   private static final long a = ess.a(4882282955482041982L, 5461571300514195435L, MethodHandles.lookup().lookupClass()).a(87704853821444L);
   private static final long b;

   private boolean t(Object[] param1) {
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
      // 004: checkcast com/zelix/_op
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/w
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/ic.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 46204123261269
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 126184626311695
      // 02e: lxor
      // 02f: dup2
      // 030: bipush 32
      // 032: lushr
      // 033: l2i
      // 034: istore 8
      // 036: dup2
      // 037: bipush 32
      // 039: lshl
      // 03a: bipush 56
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 9
      // 040: dup2
      // 041: bipush 40
      // 043: lshl
      // 044: bipush 40
      // 046: lushr
      // 047: l2i
      // 048: istore 10
      // 04a: pop2
      // 04b: dup2
      // 04c: ldc2_w 41213908514389
      // 04f: lxor
      // 050: lstore 11
      // 052: pop2
      // 053: ldc2_w 5612561096885173641
      // 056: lload 2
      // 057: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 4
      // 05e: lload 6
      // 060: aload 5
      // 062: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 065: astore 14
      // 067: istore 13
      // 069: iload 13
      // 06b: ifeq 10a
      // 06e: aload 14
      // 070: ifnull 0dc
      // 073: goto 080
      // 076: ldc2_w 6130174108461517829
      // 079: lload 2
      // 07a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: aload 14
      // 082: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 087: astore 15
      // 089: aload 15
      // 08b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 090: ifeq 0dc
      // 093: aload 15
      // 095: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09a: checkcast com/zelix/yk
      // 09d: astore 16
      // 09f: iload 13
      // 0a1: ifeq 10a
      // 0a4: aload 16
      // 0a6: iload 8
      // 0a8: iload 9
      // 0aa: i2b
      // 0ab: iload 10
      // 0ad: invokeinterface com/zelix/yk.B (IBI)Lcom/zelix/wd; 4
      // 0b2: ldc2_w 5412660771349370734
      // 0b5: lload 2
      // 0b6: invokedynamic k (JJ)Lcom/zelix/wd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: if_acmpne 0d7
      // 0be: goto 0cb
      // 0c1: ldc2_w 6130174108461517829
      // 0c4: lload 2
      // 0c5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: bipush 0
      // 0cc: ireturn
      // 0cd: ldc2_w 6130174108461517829
      // 0d0: lload 2
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: iload 13
      // 0d9: ifne 089
      // 0dc: aload 5
      // 0de: ldc2_w 5371865174825679303
      // 0e1: lload 2
      // 0e2: invokedynamic k (JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: lload 11
      // 0e9: bipush 2
      // 0ea: anewarray 224
      // 0ed: dup_x2
      // 0ee: dup_x2
      // 0ef: pop
      // 0f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: ldc2_w 5495574247080964716
      // 0fe: lload 2
      // 0ff: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: lload 2
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 10a
      // 10a: bipush 1
      // 10b: ireturn
   }

   public int i(Object[] param1) {
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
      // 00c: ldc2_w 7519203345081130013
      // 00f: lload 2
      // 010: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: bipush 1
      // 016: istore 5
      // 018: istore 4
      // 01a: ldc2_w 7567133279979525381
      // 01d: lload 2
      // 01e: invokedynamic n (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: aload 0
      // 024: ldc2_w 7924221082572892370
      // 027: lload 2
      // 028: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: invokevirtual com/zelix/_ya.ordinal ()I
      // 030: iaload
      // 031: iload 4
      // 033: lload 2
      // 034: lconst_0
      // 035: lcmp
      // 036: ifle 1c8
      // 039: ifne 1c6
      // 03c: tableswitch 381 1 22 114 114 141 168 168 198 198 198 222 249 276 276 311 338 338 338 338 365 365 365 365 365
      // 0a4: ldc2_w 7917307962044806344
      // 0a7: lload 2
      // 0a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: iinc 5 1
      // 0b1: lload 2
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 1bc
      // 0b7: iload 4
      // 0b9: ifeq 1b9
      // 0bc: goto 0c9
      // 0bf: ldc2_w 7917307962044806344
      // 0c2: lload 2
      // 0c3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: iinc 5 2
      // 0cc: lload 2
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 1bc
      // 0d2: iload 4
      // 0d4: ifeq 1b9
      // 0d7: goto 0e4
      // 0da: ldc2_w 7917307962044806344
      // 0dd: lload 2
      // 0de: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: iinc 5 1
      // 0e7: iinc 5 1
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: iflt 1bc
      // 0f0: iload 4
      // 0f2: ifeq 1b9
      // 0f5: goto 102
      // 0f8: ldc2_w 7917307962044806344
      // 0fb: lload 2
      // 0fc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: lload 2
      // 103: lconst_0
      // 104: lcmp
      // 105: ifle 1bc
      // 108: iload 4
      // 10a: ifeq 1b9
      // 10d: goto 11a
      // 110: ldc2_w 7917307962044806344
      // 113: lload 2
      // 114: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: iinc 5 1
      // 11d: lload 2
      // 11e: lconst_0
      // 11f: lcmp
      // 120: iflt 1bc
      // 123: iload 4
      // 125: ifeq 1b9
      // 128: goto 135
      // 12b: ldc2_w 7917307962044806344
      // 12e: lload 2
      // 12f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: iinc 5 2
      // 138: lload 2
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 1bc
      // 13e: iload 4
      // 140: ifeq 1b9
      // 143: goto 150
      // 146: ldc2_w 7917307962044806344
      // 149: lload 2
      // 14a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: iinc 5 2
      // 153: iload 5
      // 155: aload 0
      // 156: ldc2_w 8049102230426686273
      // 159: lload 2
      // 15a: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/_fo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: arraylength
      // 160: getstatic com/zelix/ic.b J
      // 163: l2i
      // 164: imul
      // 165: iadd
      // 166: istore 5
      // 168: lload 2
      // 169: lconst_0
      // 16a: lcmp
      // 16b: ifle 1bc
      // 16e: iload 4
      // 170: ifeq 1b9
      // 173: iinc 5 2
      // 176: lload 2
      // 177: lconst_0
      // 178: lcmp
      // 179: ifle 1bc
      // 17c: iload 4
      // 17e: ifeq 1b9
      // 181: goto 18e
      // 184: ldc2_w 7917307962044806344
      // 187: lload 2
      // 188: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: iinc 5 2
      // 191: lload 2
      // 192: lconst_0
      // 193: lcmp
      // 194: iflt 1bc
      // 197: iload 4
      // 199: ifeq 1b9
      // 19c: goto 1a9
      // 19f: ldc2_w 7917307962044806344
      // 1a2: lload 2
      // 1a3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: iinc 5 3
      // 1ac: goto 1b9
      // 1af: ldc2_w 7917307962044806344
      // 1b2: lload 2
      // 1b3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: iinc 5 1
      // 1bc: aload 0
      // 1bd: ldc2_w 8630305032080753128
      // 1c0: lload 2
      // 1c1: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: iload 4
      // 1c8: ifne 221
      // 1cb: ifle 21f
      // 1ce: goto 1db
      // 1d1: ldc2_w 7917307962044806344
      // 1d4: lload 2
      // 1d5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: bipush 0
      // 1dc: istore 6
      // 1de: iload 6
      // 1e0: aload 0
      // 1e1: ldc2_w 8630305032080753128
      // 1e4: lload 2
      // 1e5: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: if_icmpge 21f
      // 1ed: iload 5
      // 1ef: aload 0
      // 1f0: ldc2_w 8593116145119864394
      // 1f3: lload 2
      // 1f4: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: iload 6
      // 1fb: aaload
      // 1fc: bipush 0
      // 1fd: anewarray 224
      // 200: ldc2_w 7600162824351129623
      // 203: lload 2
      // 204: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: iadd
      // 20a: lload 2
      // 20b: lconst_0
      // 20c: lcmp
      // 20d: ifle 21c
      // 210: iload 4
      // 212: ifne 221
      // 215: istore 5
      // 217: iinc 6 1
      // 21a: iload 4
      // 21c: ifeq 1de
      // 21f: iload 5
      // 221: ireturn
   }

   public void N(long var1, _8l var3) {
   }

   public void m(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/w
      // 011: astore 2
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 0
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 11807521485311
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: ldc2_w 776228157401415297
      // 026: lload 3
      // 027: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 9
      // 02e: aload 0
      // 02f: ldc2_w 1660989909681236412
      // 032: lload 3
      // 033: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: iload 9
      // 03a: ifne 071
      // 03d: ifeq 194
      // 040: goto 04d
      // 043: ldc2_w 1099944130259261012
      // 046: lload 3
      // 047: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: ldc2_w 837668839920187289
      // 050: lload 3
      // 051: invokedynamic j (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: aload 0
      // 057: ldc2_w 1109110261333576270
      // 05a: lload 3
      // 05b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: invokevirtual com/zelix/_ya.ordinal ()I
      // 063: iaload
      // 064: goto 071
      // 067: ldc2_w 1099944130259261012
      // 06a: lload 3
      // 06b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: lload 3
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 0de
      // 077: tableswitch 285 1 22 101 101 101 101 101 101 101 101 101 101 119 119 234 252 252 252 252 252 252 252 252 252
      // 0dc: iload 9
      // 0de: ifeq 194
      // 0e1: goto 0ee
      // 0e4: ldc2_w 1099944130259261012
      // 0e7: lload 3
      // 0e8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: ldc2_w 948011201534587357
      // 0f2: lload 3
      // 0f3: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/_fo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: astore 10
      // 0fa: aload 10
      // 0fc: arraylength
      // 0fd: istore 11
      // 0ff: bipush 0
      // 100: istore 12
      // 102: iload 12
      // 104: iload 11
      // 106: if_icmpge 156
      // 109: aload 10
      // 10b: iload 12
      // 10d: aaload
      // 10e: astore 13
      // 110: aload 13
      // 112: lload 5
      // 114: aload 2
      // 115: bipush 2
      // 116: anewarray 224
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 1
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x2
      // 11f: dup_x2
      // 120: pop
      // 121: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 124: bipush 0
      // 125: swap
      // 126: aastore
      // 127: ldc2_w 634142396878774171
      // 12a: lload 3
      // 12b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: iinc 12 1
      // 133: iload 9
      // 135: lload 3
      // 136: lconst_0
      // 137: lcmp
      // 138: iflt 140
      // 13b: ifne 194
      // 13e: iload 9
      // 140: ifeq 102
      // 143: lload 3
      // 144: lconst_0
      // 145: lcmp
      // 146: iflt 133
      // 149: goto 156
      // 14c: ldc2_w 1099944130259261012
      // 14f: lload 3
      // 150: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: iload 9
      // 158: lload 3
      // 159: lconst_0
      // 15a: lcmp
      // 15b: ifle 163
      // 15e: ifeq 194
      // 161: iload 9
      // 163: ifeq 194
      // 166: goto 173
      // 169: ldc2_w 1099944130259261012
      // 16c: lload 3
      // 16d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: aload 2
      // 174: aload 0
      // 175: ldc2_w 1569081513710654735
      // 178: lload 3
      // 179: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: lload 7
      // 180: dup2_x1
      // 181: pop2
      // 182: aload 0
      // 183: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 186: pop
      // 187: goto 194
      // 18a: ldc2_w 1099944130259261012
      // 18d: lload 3
      // 18e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: return
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: pop
      // 017: getstatic com/zelix/ic.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: ldc2_w -7804505034031912972
      // 020: lload 2
      // 021: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: istore 5
      // 028: iload 5
      // 02a: ifne 196
      // 02d: iload 4
      // 02f: tableswitch 1142 0 75 327 370 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 407 444 481 518 555 592 629 666 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 1142 703 740 777 814 851 888 925 962 999 1036 1073 1110
      // 16c: ldc2_w -7622718145396502751
      // 16f: lload 2
      // 170: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 0
      // 177: ldc2_w -8135615274775486792
      // 17a: lload 2
      // 17b: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: ldc2_w -7633255537562234053
      // 183: lload 2
      // 184: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: goto 196
      // 18c: ldc2_w -7622718145396502751
      // 18f: lload 2
      // 190: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: iload 5
      // 198: lload 2
      // 199: lconst_0
      // 19a: lcmp
      // 19b: iflt 1b6
      // 19e: ifeq 4a5
      // 1a1: aload 0
      // 1a2: ldc2_w -8636643304169487211
      // 1a5: lload 2
      // 1a6: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: ldc2_w -7633255537562234053
      // 1ae: lload 2
      // 1af: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: iload 5
      // 1b6: ifeq 4a5
      // 1b9: goto 1c6
      // 1bc: ldc2_w -7622718145396502751
      // 1bf: lload 2
      // 1c0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: ldc2_w -7767197819963119239
      // 1ca: lload 2
      // 1cb: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: ldc2_w -7633255537562234053
      // 1d3: lload 2
      // 1d4: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: iload 5
      // 1db: ifeq 4a5
      // 1de: goto 1eb
      // 1e1: ldc2_w -7622718145396502751
      // 1e4: lload 2
      // 1e5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: ldc2_w -7915234952651700354
      // 1ef: lload 2
      // 1f0: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: ldc2_w -7633255537562234053
      // 1f8: lload 2
      // 1f9: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: iload 5
      // 200: ifeq 4a5
      // 203: goto 210
      // 206: ldc2_w -7622718145396502751
      // 209: lload 2
      // 20a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: athrow
      // 210: aload 0
      // 211: ldc2_w -8226637462855356440
      // 214: lload 2
      // 215: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: ldc2_w -7633255537562234053
      // 21d: lload 2
      // 21e: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: iload 5
      // 225: ifeq 4a5
      // 228: goto 235
      // 22b: ldc2_w -7622718145396502751
      // 22e: lload 2
      // 22f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: aload 0
      // 236: ldc2_w -8023528629921947888
      // 239: lload 2
      // 23a: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: ldc2_w -7633255537562234053
      // 242: lload 2
      // 243: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: iload 5
      // 24a: ifeq 4a5
      // 24d: goto 25a
      // 250: ldc2_w -7622718145396502751
      // 253: lload 2
      // 254: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: aload 0
      // 25b: ldc2_w -8273347072739708003
      // 25e: lload 2
      // 25f: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: ldc2_w -7633255537562234053
      // 267: lload 2
      // 268: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: iload 5
      // 26f: ifeq 4a5
      // 272: goto 27f
      // 275: ldc2_w -7622718145396502751
      // 278: lload 2
      // 279: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: athrow
      // 27f: aload 0
      // 280: ldc2_w -8142238411683947315
      // 283: lload 2
      // 284: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: ldc2_w -7633255537562234053
      // 28c: lload 2
      // 28d: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: iload 5
      // 294: ifeq 4a5
      // 297: goto 2a4
      // 29a: ldc2_w -7622718145396502751
      // 29d: lload 2
      // 29e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: ldc2_w -7920946155489842600
      // 2a8: lload 2
      // 2a9: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: ldc2_w -7633255537562234053
      // 2b1: lload 2
      // 2b2: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: iload 5
      // 2b9: ifeq 4a5
      // 2bc: goto 2c9
      // 2bf: ldc2_w -7622718145396502751
      // 2c2: lload 2
      // 2c3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: athrow
      // 2c9: aload 0
      // 2ca: ldc2_w -8535190655604473025
      // 2cd: lload 2
      // 2ce: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d3: ldc2_w -7633255537562234053
      // 2d6: lload 2
      // 2d7: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: iload 5
      // 2de: ifeq 4a5
      // 2e1: goto 2ee
      // 2e4: ldc2_w -7622718145396502751
      // 2e7: lload 2
      // 2e8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: athrow
      // 2ee: aload 0
      // 2ef: ldc2_w -8159195758129047530
      // 2f2: lload 2
      // 2f3: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: ldc2_w -7633255537562234053
      // 2fb: lload 2
      // 2fc: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 301: iload 5
      // 303: ifeq 4a5
      // 306: goto 313
      // 309: ldc2_w -7622718145396502751
      // 30c: lload 2
      // 30d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 312: athrow
      // 313: aload 0
      // 314: ldc2_w -8092676183951323170
      // 317: lload 2
      // 318: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31d: ldc2_w -7633255537562234053
      // 320: lload 2
      // 321: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: iload 5
      // 328: ifeq 4a5
      // 32b: goto 338
      // 32e: ldc2_w -7622718145396502751
      // 331: lload 2
      // 332: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 337: athrow
      // 338: aload 0
      // 339: ldc2_w -7757738504079958199
      // 33c: lload 2
      // 33d: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 342: ldc2_w -7633255537562234053
      // 345: lload 2
      // 346: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: iload 5
      // 34d: ifeq 4a5
      // 350: goto 35d
      // 353: ldc2_w -7622718145396502751
      // 356: lload 2
      // 357: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: athrow
      // 35d: aload 0
      // 35e: ldc2_w -8579975319011852857
      // 361: lload 2
      // 362: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: ldc2_w -7633255537562234053
      // 36a: lload 2
      // 36b: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: iload 5
      // 372: ifeq 4a5
      // 375: goto 382
      // 378: ldc2_w -7622718145396502751
      // 37b: lload 2
      // 37c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 381: athrow
      // 382: aload 0
      // 383: ldc2_w -8111729378471535516
      // 386: lload 2
      // 387: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38c: ldc2_w -7633255537562234053
      // 38f: lload 2
      // 390: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 395: iload 5
      // 397: ifeq 4a5
      // 39a: goto 3a7
      // 39d: ldc2_w -7622718145396502751
      // 3a0: lload 2
      // 3a1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: athrow
      // 3a7: aload 0
      // 3a8: ldc2_w -7803086339897095989
      // 3ab: lload 2
      // 3ac: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: ldc2_w -7633255537562234053
      // 3b4: lload 2
      // 3b5: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ba: iload 5
      // 3bc: ifeq 4a5
      // 3bf: goto 3cc
      // 3c2: ldc2_w -7622718145396502751
      // 3c5: lload 2
      // 3c6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: aload 0
      // 3cd: ldc2_w -7974718844068793799
      // 3d0: lload 2
      // 3d1: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d6: ldc2_w -7633255537562234053
      // 3d9: lload 2
      // 3da: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: iload 5
      // 3e1: ifeq 4a5
      // 3e4: goto 3f1
      // 3e7: ldc2_w -7622718145396502751
      // 3ea: lload 2
      // 3eb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: athrow
      // 3f1: aload 0
      // 3f2: ldc2_w -8071138513776936166
      // 3f5: lload 2
      // 3f6: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: ldc2_w -7633255537562234053
      // 3fe: lload 2
      // 3ff: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 404: iload 5
      // 406: ifeq 4a5
      // 409: goto 416
      // 40c: ldc2_w -7622718145396502751
      // 40f: lload 2
      // 410: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 415: athrow
      // 416: aload 0
      // 417: ldc2_w -7585974465644456597
      // 41a: lload 2
      // 41b: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: ldc2_w -7633255537562234053
      // 423: lload 2
      // 424: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: iload 5
      // 42b: ifeq 4a5
      // 42e: goto 43b
      // 431: ldc2_w -7622718145396502751
      // 434: lload 2
      // 435: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43a: athrow
      // 43b: aload 0
      // 43c: ldc2_w -8515342328707257929
      // 43f: lload 2
      // 440: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 445: ldc2_w -7633255537562234053
      // 448: lload 2
      // 449: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44e: iload 5
      // 450: ifeq 4a5
      // 453: goto 460
      // 456: ldc2_w -7622718145396502751
      // 459: lload 2
      // 45a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: athrow
      // 460: aload 0
      // 461: ldc2_w -8051796660795320577
      // 464: lload 2
      // 465: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46a: ldc2_w -7633255537562234053
      // 46d: lload 2
      // 46e: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 473: iload 5
      // 475: ifeq 4a5
      // 478: goto 485
      // 47b: ldc2_w -7622718145396502751
      // 47e: lload 2
      // 47f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 484: athrow
      // 485: aload 0
      // 486: ldc2_w -8134820888122147856
      // 489: lload 2
      // 48a: invokedynamic o (JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48f: ldc2_w -7633255537562234053
      // 492: lload 2
      // 493: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_ya;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 498: goto 4a5
      // 49b: ldc2_w -7622718145396502751
      // 49e: lload 2
      // 49f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: athrow
      // 4a5: return
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 6030094649057080097L, var2);
   }

   private static boolean m(Object[] param0) {
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
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast [Lcom/zelix/pf;
      // 11: astore 1
      // 12: pop
      // 13: getstatic com/zelix/ic.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: lload 2
      // 1a: dup2
      // 1b: ldc2_w 82422180254807
      // 1e: lxor
      // 1f: lstore 4
      // 21: pop2
      // 22: ldc2_w -1940542919440936619
      // 25: lload 2
      // 26: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 6
      // 2d: aload 1
      // 2e: iload 6
      // 30: ifne 44
      // 33: ifnull 5a
      // 36: goto 43
      // 39: ldc2_w -2263146493149775488
      // 3c: lload 2
      // 3d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 1
      // 44: iload 6
      // 46: ifne 67
      // 49: arraylength
      // 4a: ifne 66
      // 4d: goto 5a
      // 50: ldc2_w -2263146493149775488
      // 53: lload 2
      // 54: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: bipush 0
      // 5b: ireturn
      // 5c: ldc2_w -2263146493149775488
      // 5f: lload 2
      // 60: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 1
      // 67: astore 7
      // 69: aload 7
      // 6b: arraylength
      // 6c: istore 8
      // 6e: bipush 0
      // 6f: istore 9
      // 71: iload 9
      // 73: iload 8
      // 75: if_icmpge da
      // 78: aload 7
      // 7a: iload 9
      // 7c: aaload
      // 7d: astore 10
      // 7f: iload 6
      // 81: lload 2
      // 82: lconst_0
      // 83: lcmp
      // 84: iflt d7
      // 87: ifne d5
      // 8a: aload 10
      // 8c: lload 4
      // 8e: bipush 1
      // 8f: anewarray 224
      // 92: dup_x2
      // 93: dup_x2
      // 94: pop
      // 95: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98: bipush 0
      // 99: swap
      // 9a: aastore
      // 9b: ldc2_w -1993309684833066676
      // 9e: lload 2
      // 9f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: iload 6
      // a6: ifne db
      // a9: goto b6
      // ac: ldc2_w -2263146493149775488
      // af: lload 2
      // b0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: athrow
      // b6: ifeq d2
      // b9: goto c6
      // bc: ldc2_w -2263146493149775488
      // bf: lload 2
      // c0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: athrow
      // c6: bipush 1
      // c7: ireturn
      // c8: ldc2_w -2263146493149775488
      // cb: lload 2
      // cc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: athrow
      // d2: iinc 9 1
      // d5: iload 6
      // d7: ifeq 71
      // da: bipush 0
      // db: ireturn
   }

   public boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this, -3739278320718761302L, var2);
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      Set var4 = (Set)var1[1];
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void n(Object[] var1) {
      Set var3 = (Set)var1[0];
      Set var4 = (Set)var1[1];
      Set var5 = (Set)var1[2];
      Set var2 = (Set)var1[3];
   }

   public wd B(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      return x44.a<"l">(-7416636350030723743L, var4);
   }

   public void J(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/util/Map
      // 018: astore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 6
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 63045189754357
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 129133674480222
      // 02f: lxor
      // 030: lstore 9
      // 032: dup2
      // 033: ldc2_w 1473138436781
      // 036: lxor
      // 037: lstore 11
      // 039: pop2
      // 03a: ldc2_w -5735359121590942685
      // 03d: lload 3
      // 03e: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: aload 2
      // 044: aload 0
      // 045: ldc2_w -5348578944778964756
      // 048: lload 3
      // 049: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: lload 9
      // 050: bipush 1
      // 051: anewarray 224
      // 054: dup_x2
      // 055: dup_x2
      // 056: pop
      // 057: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05a: bipush 0
      // 05b: swap
      // 05c: aastore
      // 05d: ldc2_w -5732179149909597937
      // 060: lload 3
      // 061: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 069: istore 13
      // 06b: ldc2_w -5675202390562927301
      // 06e: lload 3
      // 06f: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: aload 0
      // 075: ldc2_w -5348578944778964756
      // 078: lload 3
      // 079: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokevirtual com/zelix/_ya.ordinal ()I
      // 081: iaload
      // 082: iload 13
      // 084: ifne 333
      // 087: tableswitch 660 1 22 111 111 149 187 187 239 239 239 263 301 339 339 394 432 432 432 432 543 543 543 543 543
      // 0ec: ldc2_w -5340821130893153034
      // 0ef: lload 3
      // 0f0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 2
      // 0f7: aload 0
      // 0f8: ldc2_w -6195909568196621981
      // 0fb: lload 3
      // 0fc: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 104: lload 3
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 329
      // 10a: iload 13
      // 10c: ifeq 31b
      // 10f: goto 11c
      // 112: ldc2_w -5340821130893153034
      // 115: lload 3
      // 116: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: aload 2
      // 11d: aload 0
      // 11e: ldc2_w -6195909568196621981
      // 121: lload 3
      // 122: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 12a: lload 3
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: iflt 329
      // 130: iload 13
      // 132: ifeq 31b
      // 135: goto 142
      // 138: ldc2_w -5340821130893153034
      // 13b: lload 3
      // 13c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: aload 2
      // 143: aload 0
      // 144: ldc2_w -6195909568196621981
      // 147: lload 3
      // 148: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 150: aload 2
      // 151: aload 0
      // 152: ldc2_w -5832172883090641458
      // 155: lload 3
      // 156: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 15e: lload 3
      // 15f: lconst_0
      // 160: lcmp
      // 161: iflt 329
      // 164: iload 13
      // 166: ifeq 31b
      // 169: goto 176
      // 16c: ldc2_w -5340821130893153034
      // 16f: lload 3
      // 170: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: lload 3
      // 177: lconst_0
      // 178: lcmp
      // 179: iflt 329
      // 17c: iload 13
      // 17e: ifeq 31b
      // 181: goto 18e
      // 184: ldc2_w -5340821130893153034
      // 187: lload 3
      // 188: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 2
      // 18f: aload 0
      // 190: ldc2_w -6195909568196621981
      // 193: lload 3
      // 194: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 19c: lload 3
      // 19d: lconst_0
      // 19e: lcmp
      // 19f: iflt 329
      // 1a2: iload 13
      // 1a4: ifeq 31b
      // 1a7: goto 1b4
      // 1aa: ldc2_w -5340821130893153034
      // 1ad: lload 3
      // 1ae: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 2
      // 1b5: aload 0
      // 1b6: ldc2_w -6195909568196621981
      // 1b9: lload 3
      // 1ba: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 1c2: lload 3
      // 1c3: lconst_0
      // 1c4: lcmp
      // 1c5: iflt 329
      // 1c8: iload 13
      // 1ca: ifeq 31b
      // 1cd: goto 1da
      // 1d0: ldc2_w -5340821130893153034
      // 1d3: lload 3
      // 1d4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: aload 0
      // 1db: lload 11
      // 1dd: aload 2
      // 1de: bipush 2
      // 1df: anewarray 224
      // 1e2: dup_x1
      // 1e3: swap
      // 1e4: bipush 1
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x2
      // 1e8: dup_x2
      // 1e9: pop
      // 1ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ed: bipush 0
      // 1ee: swap
      // 1ef: aastore
      // 1f0: ldc2_w -5402873970521622154
      // 1f3: lload 3
      // 1f4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: lload 3
      // 1fa: lconst_0
      // 1fb: lcmp
      // 1fc: ifle 329
      // 1ff: iload 13
      // 201: ifeq 31b
      // 204: goto 211
      // 207: ldc2_w -5340821130893153034
      // 20a: lload 3
      // 20b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: athrow
      // 211: aload 2
      // 212: aload 0
      // 213: ldc2_w -6195909568196621981
      // 216: lload 3
      // 217: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 21f: lload 3
      // 220: lconst_0
      // 221: lcmp
      // 222: iflt 329
      // 225: iload 13
      // 227: ifeq 31b
      // 22a: goto 237
      // 22d: ldc2_w -5340821130893153034
      // 230: lload 3
      // 231: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: athrow
      // 237: lload 3
      // 238: lconst_0
      // 239: lcmp
      // 23a: iflt 28e
      // 23d: aload 0
      // 23e: ldc2_w -5808480839842091091
      // 241: lload 3
      // 242: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: ifnull 280
      // 24a: goto 257
      // 24d: ldc2_w -5340821130893153034
      // 250: lload 3
      // 251: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: aload 2
      // 258: aload 0
      // 259: ldc2_w -5808480839842091091
      // 25c: lload 3
      // 25d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: invokevirtual com/zelix/_op.W ()I
      // 265: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 268: lload 3
      // 269: lconst_0
      // 26a: lcmp
      // 26b: iflt 329
      // 26e: iload 13
      // 270: ifeq 31b
      // 273: goto 280
      // 276: ldc2_w -5340821130893153034
      // 279: lload 3
      // 27a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: athrow
      // 280: aload 2
      // 281: aload 0
      // 282: ldc2_w -5809324461923465749
      // 285: lload 3
      // 286: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 28e: lload 3
      // 28f: lconst_0
      // 290: lcmp
      // 291: ifle 329
      // 294: iload 13
      // 296: ifeq 31b
      // 299: goto 2a6
      // 29c: ldc2_w -5340821130893153034
      // 29f: lload 3
      // 2a0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: lload 3
      // 2a7: lconst_0
      // 2a8: lcmp
      // 2a9: iflt 2fd
      // 2ac: aload 0
      // 2ad: ldc2_w -5808480839842091091
      // 2b0: lload 3
      // 2b1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: ifnull 2ef
      // 2b9: goto 2c6
      // 2bc: ldc2_w -5340821130893153034
      // 2bf: lload 3
      // 2c0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: athrow
      // 2c6: aload 2
      // 2c7: aload 0
      // 2c8: ldc2_w -5808480839842091091
      // 2cb: lload 3
      // 2cc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: invokevirtual com/zelix/_op.W ()I
      // 2d4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2d7: lload 3
      // 2d8: lconst_0
      // 2d9: lcmp
      // 2da: ifle 318
      // 2dd: iload 13
      // 2df: ifeq 30a
      // 2e2: goto 2ef
      // 2e5: ldc2_w -5340821130893153034
      // 2e8: lload 3
      // 2e9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: athrow
      // 2ef: aload 2
      // 2f0: aload 0
      // 2f1: ldc2_w -5809324461923465749
      // 2f4: lload 3
      // 2f5: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fa: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2fd: goto 30a
      // 300: ldc2_w -5340821130893153034
      // 303: lload 3
      // 304: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: athrow
      // 30a: aload 2
      // 30b: aload 0
      // 30c: ldc2_w -6195909568196621981
      // 30f: lload 3
      // 310: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 318: goto 31b
      // 31b: aload 2
      // 31c: aload 0
      // 31d: ldc2_w -5765880288420079146
      // 320: lload 3
      // 321: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 329: aload 0
      // 32a: ldc2_w -5765880288420079146
      // 32d: lload 3
      // 32e: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: iload 13
      // 335: ifne 349
      // 338: ifle 38d
      // 33b: goto 348
      // 33e: ldc2_w -5340821130893153034
      // 341: lload 3
      // 342: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: athrow
      // 348: bipush 0
      // 349: istore 14
      // 34b: iload 14
      // 34d: aload 0
      // 34e: ldc2_w -5765880288420079146
      // 351: lload 3
      // 352: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: if_icmpge 38d
      // 35a: aload 0
      // 35b: ldc2_w -5801028546320073100
      // 35e: lload 3
      // 35f: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 364: iload 14
      // 366: aaload
      // 367: aload 2
      // 368: lload 7
      // 36a: bipush 2
      // 36b: anewarray 224
      // 36e: dup_x2
      // 36f: dup_x2
      // 370: pop
      // 371: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 374: bipush 1
      // 375: swap
      // 376: aastore
      // 377: dup_x1
      // 378: swap
      // 379: bipush 0
      // 37a: swap
      // 37b: aastore
      // 37c: ldc2_w -5681420356692660286
      // 37f: lload 3
      // 380: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: iinc 14 1
      // 388: iload 13
      // 38a: ifeq 34b
      // 38d: return
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 1344976186482L;
      h4 var6 = x44.a<"j">(this, new Object[]{var4}, -8950998890690910335L, var2);
      return x44.a<"j">(var6, new Object[0], -9179115047963512279L, var2);
   }

   boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"n">(this, -980289932977326257L, var2) == x44.a<"k">(-1299116255208724661L, var2)) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, -989982899785110699L, var2);
      }

      return false;
   }

   boolean x(Object[] param1) {
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
      // 00c: getstatic com/zelix/ic.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 57672894817403
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w 2976526673401355530
      // 01e: lload 2
      // 01f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: istore 6
      // 026: ldc2_w 2888204872918373394
      // 029: lload 2
      // 02a: invokedynamic i (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: aload 0
      // 030: ldc2_w 3237896476638472645
      // 033: lload 2
      // 034: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: invokevirtual com/zelix/_ya.ordinal ()I
      // 03c: iaload
      // 03d: iload 6
      // 03f: ifne 1c1
      // 042: tableswitch 382 1 22 112 112 124 166 166 168 168 168 210 252 254 254 296 298 298 298 298 340 340 340 340 340
      // 0a8: ldc2_w 3227041353500210655
      // 0ab: lload 2
      // 0ac: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: bipush 1
      // 0b3: ireturn
      // 0b4: ldc2_w 3227041353500210655
      // 0b7: lload 2
      // 0b8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: ldc2_w 3915824061529614173
      // 0c2: lload 2
      // 0c3: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: lload 4
      // 0ca: dup2_x1
      // 0cb: pop2
      // 0cc: bipush 2
      // 0cd: anewarray 224
      // 0d0: dup_x1
      // 0d1: swap
      // 0d2: bipush 1
      // 0d3: swap
      // 0d4: aastore
      // 0d5: dup_x2
      // 0d6: dup_x2
      // 0d7: pop
      // 0d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: ldc2_w 3295367728649039986
      // 0e1: lload 2
      // 0e2: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: ireturn
      // 0e8: bipush 1
      // 0e9: ireturn
      // 0ea: aload 0
      // 0eb: ldc2_w 3915824061529614173
      // 0ee: lload 2
      // 0ef: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: lload 4
      // 0f6: dup2_x1
      // 0f7: pop2
      // 0f8: bipush 2
      // 0f9: anewarray 224
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: bipush 1
      // 0ff: swap
      // 100: aastore
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: ldc2_w 3295367728649039986
      // 10d: lload 2
      // 10e: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: ireturn
      // 114: aload 0
      // 115: ldc2_w 3915824061529614173
      // 118: lload 2
      // 119: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: lload 4
      // 120: dup2_x1
      // 121: pop2
      // 122: bipush 2
      // 123: anewarray 224
      // 126: dup_x1
      // 127: swap
      // 128: bipush 1
      // 129: swap
      // 12a: aastore
      // 12b: dup_x2
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 131: bipush 0
      // 132: swap
      // 133: aastore
      // 134: ldc2_w 3295367728649039986
      // 137: lload 2
      // 138: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: ireturn
      // 13e: bipush 0
      // 13f: ireturn
      // 140: aload 0
      // 141: ldc2_w 3915824061529614173
      // 144: lload 2
      // 145: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: lload 4
      // 14c: dup2_x1
      // 14d: pop2
      // 14e: bipush 2
      // 14f: anewarray 224
      // 152: dup_x1
      // 153: swap
      // 154: bipush 1
      // 155: swap
      // 156: aastore
      // 157: dup_x2
      // 158: dup_x2
      // 159: pop
      // 15a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15d: bipush 0
      // 15e: swap
      // 15f: aastore
      // 160: ldc2_w 3295367728649039986
      // 163: lload 2
      // 164: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: ireturn
      // 16a: bipush 0
      // 16b: ireturn
      // 16c: aload 0
      // 16d: ldc2_w 3915824061529614173
      // 170: lload 2
      // 171: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: lload 4
      // 178: dup2_x1
      // 179: pop2
      // 17a: bipush 2
      // 17b: anewarray 224
      // 17e: dup_x1
      // 17f: swap
      // 180: bipush 1
      // 181: swap
      // 182: aastore
      // 183: dup_x2
      // 184: dup_x2
      // 185: pop
      // 186: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 189: bipush 0
      // 18a: swap
      // 18b: aastore
      // 18c: ldc2_w 3295367728649039986
      // 18f: lload 2
      // 190: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: ireturn
      // 196: aload 0
      // 197: ldc2_w 3915824061529614173
      // 19a: lload 2
      // 19b: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: lload 4
      // 1a2: dup2_x1
      // 1a3: pop2
      // 1a4: bipush 2
      // 1a5: anewarray 224
      // 1a8: dup_x1
      // 1a9: swap
      // 1aa: bipush 1
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x2
      // 1ae: dup_x2
      // 1af: pop
      // 1b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b3: bipush 0
      // 1b4: swap
      // 1b5: aastore
      // 1b6: ldc2_w 3295367728649039986
      // 1b9: lload 2
      // 1ba: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: ireturn
      // 1c0: bipush 0
      // 1c1: ireturn
   }

   public void r(Object[] var1) {
      long var4 = (Long)var1[0];
      HashMap var2 = (HashMap)var1[1];
      HashMap var3 = (HashMap)var1[2];
   }

   public void e(Integer param1, long param2, _op param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -7634270188711532953
      // 03: lload 2
      // 04: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 5
      // 0b: ldc2_w -8493582219059284442
      // 0e: lload 2
      // 0f: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14: aload 0
      // 15: ldc2_w -8152890478787179535
      // 18: lload 2
      // 19: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: invokevirtual com/zelix/_ya.ordinal ()I
      // 21: iaload
      // 22: lload 2
      // 23: lconst_0
      // 24: lcmp
      // 25: iflt 92
      // 28: tableswitch 147 1 22 104 104 104 104 104 104 104 104 104 104 104 104 104 122 122 122 122 122 122 122 122 122
      // 90: iload 5
      // 92: ifne bb
      // 95: goto a2
      // 98: ldc2_w -8143477904192333845
      // 9b: lload 2
      // 9c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: athrow
      // a2: aload 0
      // a3: aload 4
      // a5: ldc2_w -7748095760983026512
      // a8: lload 2
      // a9: invokedynamic w (Ljava/lang/Object;Lcom/zelix/_op;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: goto bb
      // b1: ldc2_w -8143477904192333845
      // b4: lload 2
      // b5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: return
   }

   public void s(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 4
      // 013: pop
      // 014: lload 2
      // 015: dup2
      // 016: ldc2_w 45991247641447
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 112084537992396
      // 020: lxor
      // 021: lstore 7
      // 023: dup2
      // 024: ldc2_w 19602436066367
      // 027: lxor
      // 028: lstore 9
      // 02a: pop2
      // 02b: ldc2_w 1654503070477787825
      // 02e: lload 2
      // 02f: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: aload 4
      // 036: aload 0
      // 037: ldc2_w 1392763797106153086
      // 03a: lload 2
      // 03b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: lload 7
      // 042: bipush 1
      // 043: anewarray 224
      // 046: dup_x2
      // 047: dup_x2
      // 048: pop
      // 049: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04c: bipush 0
      // 04d: swap
      // 04e: aastore
      // 04f: ldc2_w 1648640634361563037
      // 052: lload 2
      // 053: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 05b: istore 11
      // 05d: ldc2_w 1706778481764150185
      // 060: lload 2
      // 061: invokedynamic j (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: aload 0
      // 067: ldc2_w 1392763797106153086
      // 06a: lload 2
      // 06b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: invokevirtual com/zelix/_ya.ordinal ()I
      // 073: iaload
      // 074: iload 11
      // 076: ifne 335
      // 079: tableswitch 675 1 22 113 113 152 191 191 245 245 245 269 308 347 347 403 442 442 442 442 555 555 555 555 555
      // 0e0: ldc2_w 1401613410511030884
      // 0e3: lload 2
      // 0e4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: aload 4
      // 0ec: aload 0
      // 0ed: ldc2_w 905687045604372465
      // 0f0: lload 2
      // 0f1: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 0f9: lload 2
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: iflt 32b
      // 0ff: iload 11
      // 101: ifeq 31c
      // 104: goto 111
      // 107: ldc2_w 1401613410511030884
      // 10a: lload 2
      // 10b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 4
      // 113: aload 0
      // 114: ldc2_w 905687045604372465
      // 117: lload 2
      // 118: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 120: lload 2
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 32b
      // 126: iload 11
      // 128: ifeq 31c
      // 12b: goto 138
      // 12e: ldc2_w 1401613410511030884
      // 131: lload 2
      // 132: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 4
      // 13a: aload 0
      // 13b: ldc2_w 905687045604372465
      // 13e: lload 2
      // 13f: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 147: aload 4
      // 149: aload 0
      // 14a: ldc2_w 692961891796831068
      // 14d: lload 2
      // 14e: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 156: lload 2
      // 157: lconst_0
      // 158: lcmp
      // 159: ifle 32b
      // 15c: iload 11
      // 15e: ifeq 31c
      // 161: goto 16e
      // 164: ldc2_w 1401613410511030884
      // 167: lload 2
      // 168: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: lload 2
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 32b
      // 174: iload 11
      // 176: ifeq 31c
      // 179: goto 186
      // 17c: ldc2_w 1401613410511030884
      // 17f: lload 2
      // 180: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 4
      // 188: aload 0
      // 189: ldc2_w 905687045604372465
      // 18c: lload 2
      // 18d: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 195: lload 2
      // 196: lconst_0
      // 197: lcmp
      // 198: ifle 32b
      // 19b: iload 11
      // 19d: ifeq 31c
      // 1a0: goto 1ad
      // 1a3: ldc2_w 1401613410511030884
      // 1a6: lload 2
      // 1a7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: aload 4
      // 1af: aload 0
      // 1b0: ldc2_w 905687045604372465
      // 1b3: lload 2
      // 1b4: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 1bc: lload 2
      // 1bd: lconst_0
      // 1be: lcmp
      // 1bf: ifle 32b
      // 1c2: iload 11
      // 1c4: ifeq 31c
      // 1c7: goto 1d4
      // 1ca: ldc2_w 1401613410511030884
      // 1cd: lload 2
      // 1ce: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: aload 0
      // 1d5: lload 9
      // 1d7: aload 4
      // 1d9: bipush 2
      // 1da: anewarray 224
      // 1dd: dup_x1
      // 1de: swap
      // 1df: bipush 1
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x2
      // 1e3: dup_x2
      // 1e4: pop
      // 1e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e8: bipush 0
      // 1e9: swap
      // 1ea: aastore
      // 1eb: ldc2_w 1411652246533513188
      // 1ee: lload 2
      // 1ef: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: lload 2
      // 1f5: lconst_0
      // 1f6: lcmp
      // 1f7: iflt 32b
      // 1fa: iload 11
      // 1fc: ifeq 31c
      // 1ff: goto 20c
      // 202: ldc2_w 1401613410511030884
      // 205: lload 2
      // 206: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: athrow
      // 20c: aload 4
      // 20e: aload 0
      // 20f: ldc2_w 905687045604372465
      // 212: lload 2
      // 213: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 21b: lload 2
      // 21c: lconst_0
      // 21d: lcmp
      // 21e: ifle 32b
      // 221: iload 11
      // 223: ifeq 31c
      // 226: goto 233
      // 229: ldc2_w 1401613410511030884
      // 22c: lload 2
      // 22d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: lload 2
      // 234: lconst_0
      // 235: lcmp
      // 236: ifle 28c
      // 239: aload 0
      // 23a: ldc2_w 717816104341539135
      // 23d: lload 2
      // 23e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: ifnull 27d
      // 246: goto 253
      // 249: ldc2_w 1401613410511030884
      // 24c: lload 2
      // 24d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 4
      // 255: aload 0
      // 256: ldc2_w 717816104341539135
      // 259: lload 2
      // 25a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: invokevirtual com/zelix/_op.W ()I
      // 262: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 265: lload 2
      // 266: lconst_0
      // 267: lcmp
      // 268: iflt 32b
      // 26b: iload 11
      // 26d: ifeq 31c
      // 270: goto 27d
      // 273: ldc2_w 1401613410511030884
      // 276: lload 2
      // 277: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: aload 4
      // 27f: aload 0
      // 280: ldc2_w 716972482812781433
      // 283: lload 2
      // 284: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 28c: lload 2
      // 28d: lconst_0
      // 28e: lcmp
      // 28f: ifle 32b
      // 292: iload 11
      // 294: ifeq 31c
      // 297: goto 2a4
      // 29a: ldc2_w 1401613410511030884
      // 29d: lload 2
      // 29e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: lload 2
      // 2a5: lconst_0
      // 2a6: lcmp
      // 2a7: ifle 2fd
      // 2aa: aload 0
      // 2ab: ldc2_w 717816104341539135
      // 2ae: lload 2
      // 2af: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: ifnull 2ee
      // 2b7: goto 2c4
      // 2ba: ldc2_w 1401613410511030884
      // 2bd: lload 2
      // 2be: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c3: athrow
      // 2c4: aload 4
      // 2c6: aload 0
      // 2c7: ldc2_w 717816104341539135
      // 2ca: lload 2
      // 2cb: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: invokevirtual com/zelix/_op.W ()I
      // 2d3: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2d6: lload 2
      // 2d7: lconst_0
      // 2d8: lcmp
      // 2d9: ifle 319
      // 2dc: iload 11
      // 2de: ifeq 30a
      // 2e1: goto 2ee
      // 2e4: ldc2_w 1401613410511030884
      // 2e7: lload 2
      // 2e8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: athrow
      // 2ee: aload 4
      // 2f0: aload 0
      // 2f1: ldc2_w 716972482812781433
      // 2f4: lload 2
      // 2f5: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fa: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2fd: goto 30a
      // 300: ldc2_w 1401613410511030884
      // 303: lload 2
      // 304: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: athrow
      // 30a: aload 4
      // 30c: aload 0
      // 30d: ldc2_w 905687045604372465
      // 310: lload 2
      // 311: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 319: goto 31c
      // 31c: aload 4
      // 31e: aload 0
      // 31f: ldc2_w 678190796957220676
      // 322: lload 2
      // 323: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 328: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 32b: aload 0
      // 32c: ldc2_w 678190796957220676
      // 32f: lload 2
      // 330: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: iload 11
      // 337: ifne 34b
      // 33a: ifle 390
      // 33d: goto 34a
      // 340: ldc2_w 1401613410511030884
      // 343: lload 2
      // 344: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 349: athrow
      // 34a: bipush 0
      // 34b: istore 12
      // 34d: iload 12
      // 34f: aload 0
      // 350: ldc2_w 678190796957220676
      // 353: lload 2
      // 354: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 359: if_icmpge 390
      // 35c: aload 0
      // 35d: ldc2_w 715100128824350950
      // 360: lload 2
      // 361: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: iload 12
      // 368: aaload
      // 369: aload 4
      // 36b: lload 5
      // 36d: bipush 2
      // 36e: anewarray 224
      // 371: dup_x2
      // 372: dup_x2
      // 373: pop
      // 374: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 377: bipush 1
      // 378: swap
      // 379: aastore
      // 37a: dup_x1
      // 37b: swap
      // 37c: bipush 0
      // 37d: swap
      // 37e: aastore
      // 37f: ldc2_w 1708441832648640848
      // 382: lload 2
      // 383: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: iinc 12 1
      // 38b: iload 11
      // 38d: ifeq 34d
      // 390: return
   }

   private void h(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/ic.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 105807142777235
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 5677939402614
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 123968607262378
      // 02d: lxor
      // 02e: lstore 9
      // 030: dup2
      // 031: ldc2_w 134198358074749
      // 034: lxor
      // 035: lstore 11
      // 037: dup2
      // 038: ldc2_w 30935311250522
      // 03b: lxor
      // 03c: lstore 13
      // 03e: dup2
      // 03f: ldc2_w 121256402645375
      // 042: lxor
      // 043: lstore 15
      // 045: pop2
      // 046: ldc2_w 8281747138737096362
      // 049: lload 2
      // 04a: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: aload 4
      // 051: aload 0
      // 052: ldc2_w 8431610876197734902
      // 055: lload 2
      // 056: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/_fo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: arraylength
      // 05c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 05f: aload 0
      // 060: ldc2_w 8431610876197734902
      // 063: lload 2
      // 064: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/_fo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: astore 18
      // 06b: istore 17
      // 06d: aload 18
      // 06f: arraylength
      // 070: istore 19
      // 072: bipush 0
      // 073: istore 20
      // 075: iload 20
      // 077: iload 19
      // 079: if_icmpge 19e
      // 07c: aload 18
      // 07e: iload 20
      // 080: aaload
      // 081: astore 21
      // 083: iload 17
      // 085: lload 2
      // 086: lconst_0
      // 087: lcmp
      // 088: iflt 0a8
      // 08b: ifne 13d
      // 08e: aload 21
      // 090: lload 7
      // 092: bipush 1
      // 093: anewarray 224
      // 096: dup_x2
      // 097: dup_x2
      // 098: pop
      // 099: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09c: bipush 0
      // 09d: swap
      // 09e: aastore
      // 09f: ldc2_w 8039782921729483835
      // 0a2: lload 2
      // 0a3: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: ifeq 111
      // 0ab: goto 0b8
      // 0ae: ldc2_w 8604359199708180095
      // 0b1: lload 2
      // 0b2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 4
      // 0ba: aload 21
      // 0bc: lload 5
      // 0be: bipush 1
      // 0bf: anewarray 224
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: ldc2_w 7588457080617178983
      // 0ce: lload 2
      // 0cf: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: invokevirtual com/zelix/_op.W ()I
      // 0d7: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0da: aload 4
      // 0dc: aload 21
      // 0de: lload 9
      // 0e0: bipush 1
      // 0e1: anewarray 224
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 0
      // 0eb: swap
      // 0ec: aastore
      // 0ed: ldc2_w 8436084107815356450
      // 0f0: lload 2
      // 0f1: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0f9: iload 17
      // 0fb: lload 2
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: ifle 19b
      // 101: ifeq 177
      // 104: goto 111
      // 107: ldc2_w 8604359199708180095
      // 10a: lload 2
      // 10b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 4
      // 113: aload 21
      // 115: lload 13
      // 117: bipush 1
      // 118: anewarray 224
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: ldc2_w 8246906914062823922
      // 127: lload 2
      // 128: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 130: goto 13d
      // 133: ldc2_w 8604359199708180095
      // 136: lload 2
      // 137: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 4
      // 13f: aload 21
      // 141: lload 15
      // 143: bipush 1
      // 144: anewarray 224
      // 147: dup_x2
      // 148: dup_x2
      // 149: pop
      // 14a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: ldc2_w 8511577738120030859
      // 153: lload 2
      // 154: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: aload 21
      // 15b: lload 13
      // 15d: bipush 1
      // 15e: anewarray 224
      // 161: dup_x2
      // 162: dup_x2
      // 163: pop
      // 164: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w 8246906914062823922
      // 16d: lload 2
      // 16e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: isub
      // 174: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 177: aload 4
      // 179: aload 21
      // 17b: lload 11
      // 17d: bipush 1
      // 17e: anewarray 224
      // 181: dup_x2
      // 182: dup_x2
      // 183: pop
      // 184: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 187: bipush 0
      // 188: swap
      // 189: aastore
      // 18a: ldc2_w 8596015147075844829
      // 18d: lload 2
      // 18e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 196: iinc 20 1
      // 199: iload 17
      // 19b: ifeq 075
      // 19e: return
   }

   boolean w(Object[] param1) {
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
      // 00f: checkcast java/util/HashSet
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/w
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/ic.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 79389439548740
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 11608573538870
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 16444193531003
      // 037: lxor
      // 038: lstore 10
      // 03a: pop2
      // 03b: ldc2_w -539341691577317143
      // 03e: lload 4
      // 040: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: bipush 0
      // 046: istore 13
      // 048: istore 12
      // 04a: aload 0
      // 04b: ldc2_w -559571141300648307
      // 04e: lload 4
      // 050: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: iload 12
      // 057: ifeq 271
      // 05a: ifeq 26f
      // 05d: goto 06b
      // 060: ldc2_w -2273528512481003163
      // 063: lload 4
      // 065: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: ldc2_w -1968359073713563480
      // 06e: lload 4
      // 070: invokedynamic k (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: aload 0
      // 076: ldc2_w -2281814905915005569
      // 079: lload 4
      // 07b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: invokevirtual com/zelix/_ya.ordinal ()I
      // 083: iaload
      // 084: iload 12
      // 086: ifeq 271
      // 089: goto 097
      // 08c: ldc2_w -2273528512481003163
      // 08f: lload 4
      // 091: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: lload 4
      // 099: lconst_0
      // 09a: lcmp
      // 09b: iflt 111
      // 09e: tableswitch 465 1 22 113 113 113 113 113 113 113 113 113 113 132 132 284 303 303 303 303 303 303 303 303 303
      // 104: ldc2_w -2273528512481003163
      // 107: lload 4
      // 109: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: iload 12
      // 111: ifne 26f
      // 114: goto 122
      // 117: ldc2_w -2273528512481003163
      // 11a: lload 4
      // 11c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: aload 0
      // 123: ldc2_w -2154682507231584532
      // 126: lload 4
      // 128: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/_fo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: astore 14
      // 12f: aload 14
      // 131: arraylength
      // 132: istore 15
      // 134: bipush 0
      // 135: istore 16
      // 137: iload 16
      // 139: iload 15
      // 13b: if_icmpge 1a7
      // 13e: aload 14
      // 140: iload 16
      // 142: aaload
      // 143: astore 17
      // 145: iload 12
      // 147: lload 4
      // 149: lconst_0
      // 14a: lcmp
      // 14b: ifle 1a4
      // 14e: ifeq 1a2
      // 151: aload 17
      // 153: lload 10
      // 155: aload 3
      // 156: aload 2
      // 157: bipush 3
      // 158: anewarray 224
      // 15b: dup_x1
      // 15c: swap
      // 15d: bipush 2
      // 15e: swap
      // 15f: aastore
      // 160: dup_x1
      // 161: swap
      // 162: bipush 1
      // 163: swap
      // 164: aastore
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 0
      // 16c: swap
      // 16d: aastore
      // 16e: ldc2_w -561375687415518525
      // 171: lload 4
      // 173: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: iload 12
      // 17a: ifeq 271
      // 17d: goto 18b
      // 180: ldc2_w -2273528512481003163
      // 183: lload 4
      // 185: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: ifeq 19f
      // 18e: goto 19c
      // 191: ldc2_w -2273528512481003163
      // 194: lload 4
      // 196: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: bipush 1
      // 19d: istore 13
      // 19f: iinc 16 1
      // 1a2: iload 12
      // 1a4: ifne 137
      // 1a7: iload 12
      // 1a9: lload 4
      // 1ab: lconst_0
      // 1ac: lcmp
      // 1ad: iflt 271
      // 1b0: lload 4
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: iflt 1bc
      // 1b7: ifne 26f
      // 1ba: iload 12
      // 1bc: ifne 26f
      // 1bf: goto 1cd
      // 1c2: ldc2_w -2273528512481003163
      // 1c5: lload 4
      // 1c7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: athrow
      // 1cd: aload 3
      // 1ce: aload 0
      // 1cf: ldc2_w -362685094275384770
      // 1d2: lload 4
      // 1d4: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: ldc2_w -1969909877619026414
      // 1dc: lload 4
      // 1de: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: iload 12
      // 1e5: ifeq 271
      // 1e8: goto 1f6
      // 1eb: ldc2_w -2273528512481003163
      // 1ee: lload 4
      // 1f0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: ifeq 26f
      // 1f9: goto 207
      // 1fc: ldc2_w -2273528512481003163
      // 1ff: lload 4
      // 201: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 2
      // 208: aload 0
      // 209: ldc2_w -362685094275384770
      // 20c: lload 4
      // 20e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: aload 0
      // 214: lload 8
      // 216: bipush 3
      // 217: anewarray 224
      // 21a: dup_x2
      // 21b: dup_x2
      // 21c: pop
      // 21d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 220: bipush 2
      // 221: swap
      // 222: aastore
      // 223: dup_x1
      // 224: swap
      // 225: bipush 1
      // 226: swap
      // 227: aastore
      // 228: dup_x1
      // 229: swap
      // 22a: bipush 0
      // 22b: swap
      // 22c: aastore
      // 22d: ldc2_w -432163313657709579
      // 230: lload 4
      // 232: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: pop
      // 238: aload 0
      // 239: aload 0
      // 23a: ldc2_w -362685094275384770
      // 23d: lload 4
      // 23f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: lload 6
      // 246: aload 2
      // 247: bipush 3
      // 248: anewarray 224
      // 24b: dup_x1
      // 24c: swap
      // 24d: bipush 2
      // 24e: swap
      // 24f: aastore
      // 250: dup_x2
      // 251: dup_x2
      // 252: pop
      // 253: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 256: bipush 1
      // 257: swap
      // 258: aastore
      // 259: dup_x1
      // 25a: swap
      // 25b: bipush 0
      // 25c: swap
      // 25d: aastore
      // 25e: ldc2_w -2157536924755260708
      // 261: lload 4
      // 263: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: pop
      // 269: bipush 1
      // 26a: istore 13
      // 26c: goto 26f
      // 26f: iload 13
      // 271: ireturn
   }

   ic(long param1, h8 param3, _xx param4, _y4 param5, _y4 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ic.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 87206699358214
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 32
      // 00f: lushr
      // 010: l2i
      // 011: istore 7
      // 013: dup2
      // 014: bipush 32
      // 016: lshl
      // 017: bipush 48
      // 019: lushr
      // 01a: l2i
      // 01b: istore 8
      // 01d: dup2
      // 01e: bipush 48
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 9
      // 027: pop2
      // 028: dup2
      // 029: ldc2_w 53548897631347
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 23452678785051
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 10378602543461
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 24810555163231
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 136519078104999
      // 048: lxor
      // 049: lstore 18
      // 04b: dup2
      // 04c: ldc2_w 7875290194544
      // 04f: lxor
      // 050: lstore 20
      // 052: dup2
      // 053: ldc2_w 45378975269957
      // 056: lxor
      // 057: lstore 22
      // 059: dup2
      // 05a: ldc2_w 100257845281120
      // 05d: lxor
      // 05e: lstore 24
      // 060: pop2
      // 061: aload 0
      // 062: aload 3
      // 063: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 066: aload 0
      // 067: bipush 1
      // 068: ldc2_w 2249876370783527304
      // 06b: lload 1
      // 06c: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: ldc2_w 212118074374436533
      // 074: lload 1
      // 075: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: aload 0
      // 07b: aload 4
      // 07d: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 080: lload 14
      // 082: dup2_x1
      // 083: pop2
      // 084: bipush 2
      // 085: anewarray 224
      // 088: dup_x1
      // 089: swap
      // 08a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08d: bipush 1
      // 08e: swap
      // 08f: aastore
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: ldc2_w 2273279133703732556
      // 09c: lload 1
      // 09d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: istore 26
      // 0a4: ldc2_w 264534222881767341
      // 0a7: lload 1
      // 0a8: invokedynamic n (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: aload 0
      // 0ae: ldc2_w 527051784822276730
      // 0b1: lload 1
      // 0b2: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ya; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokevirtual com/zelix/_ya.ordinal ()I
      // 0ba: iaload
      // 0bb: iload 26
      // 0bd: ifne 420
      // 0c0: tableswitch 839 1 22 114 114 153 192 192 246 246 246 270 309 348 348 676 715 715 715 715 775 775 775 775 775
      // 128: ldc2_w 538152107723136608
      // 12b: lload 1
      // 12c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 0
      // 133: aload 4
      // 135: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 138: ldc2_w 1771537622325525493
      // 13b: lload 1
      // 13c: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: lload 1
      // 142: lconst_0
      // 143: lcmp
      // 144: ifle 416
      // 147: iload 26
      // 149: ifeq 407
      // 14c: goto 159
      // 14f: ldc2_w 538152107723136608
      // 152: lload 1
      // 153: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: aload 0
      // 15a: aload 4
      // 15c: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 15f: ldc2_w 1771537622325525493
      // 162: lload 1
      // 163: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: lload 1
      // 169: lconst_0
      // 16a: lcmp
      // 16b: ifle 416
      // 16e: iload 26
      // 170: ifeq 407
      // 173: goto 180
      // 176: ldc2_w 538152107723136608
      // 179: lload 1
      // 17a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: aload 0
      // 181: aload 4
      // 183: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 186: ldc2_w 1771537622325525493
      // 189: lload 1
      // 18a: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: aload 0
      // 190: aload 4
      // 192: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 195: ldc2_w 2132881782762561368
      // 198: lload 1
      // 199: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: lload 1
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: iflt 416
      // 1a4: iload 26
      // 1a6: ifeq 407
      // 1a9: goto 1b6
      // 1ac: ldc2_w 538152107723136608
      // 1af: lload 1
      // 1b0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: lload 1
      // 1b7: lconst_0
      // 1b8: lcmp
      // 1b9: iflt 416
      // 1bc: iload 26
      // 1be: ifeq 407
      // 1c1: goto 1ce
      // 1c4: ldc2_w 538152107723136608
      // 1c7: lload 1
      // 1c8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: aload 4
      // 1d1: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 1d4: ldc2_w 1771537622325525493
      // 1d7: lload 1
      // 1d8: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: lload 1
      // 1de: lconst_0
      // 1df: lcmp
      // 1e0: iflt 416
      // 1e3: iload 26
      // 1e5: ifeq 407
      // 1e8: goto 1f5
      // 1eb: ldc2_w 538152107723136608
      // 1ee: lload 1
      // 1ef: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: aload 0
      // 1f6: aload 4
      // 1f8: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 1fb: ldc2_w 1771537622325525493
      // 1fe: lload 1
      // 1ff: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: lload 1
      // 205: lconst_0
      // 206: lcmp
      // 207: ifle 416
      // 20a: iload 26
      // 20c: ifeq 407
      // 20f: goto 21c
      // 212: ldc2_w 538152107723136608
      // 215: lload 1
      // 216: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: aload 4
      // 21e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 221: istore 27
      // 223: aload 0
      // 224: iload 27
      // 226: anewarray 293
      // 229: ldc2_w 368217701561760233
      // 22c: lload 1
      // 22d: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/_fo;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: bipush 0
      // 233: istore 28
      // 235: iload 28
      // 237: iload 27
      // 239: if_icmpge 359
      // 23c: new com/zelix/_fo
      // 23f: dup
      // 240: aload 0
      // 241: invokespecial com/zelix/_fo.<init> (Lcom/zelix/ic;)V
      // 244: astore 29
      // 246: aload 29
      // 248: aload 4
      // 24a: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 24d: lload 16
      // 24f: dup2_x1
      // 250: pop2
      // 251: bipush 2
      // 252: anewarray 224
      // 255: dup_x1
      // 256: swap
      // 257: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 25a: bipush 1
      // 25b: swap
      // 25c: aastore
      // 25d: dup_x2
      // 25e: dup_x2
      // 25f: pop
      // 260: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 263: bipush 0
      // 264: swap
      // 265: aastore
      // 266: ldc2_w 235091311200798186
      // 269: lload 1
      // 26a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: aload 29
      // 271: aload 29
      // 273: lload 22
      // 275: bipush 1
      // 276: anewarray 224
      // 279: dup_x2
      // 27a: dup_x2
      // 27b: pop
      // 27c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27f: bipush 0
      // 280: swap
      // 281: aastore
      // 282: ldc2_w 175028248909054445
      // 285: lload 1
      // 286: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: aload 4
      // 28d: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 290: iadd
      // 291: lload 10
      // 293: bipush 2
      // 294: anewarray 224
      // 297: dup_x2
      // 298: dup_x2
      // 299: pop
      // 29a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29d: bipush 1
      // 29e: swap
      // 29f: aastore
      // 2a0: dup_x1
      // 2a1: swap
      // 2a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a5: bipush 0
      // 2a6: swap
      // 2a7: aastore
      // 2a8: ldc2_w 2046748754933405517
      // 2ab: lload 1
      // 2ac: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: aload 29
      // 2b3: aload 4
      // 2b5: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 2b8: lload 18
      // 2ba: bipush 2
      // 2bb: anewarray 224
      // 2be: dup_x2
      // 2bf: dup_x2
      // 2c0: pop
      // 2c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c4: bipush 1
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2cc: bipush 0
      // 2cd: swap
      // 2ce: aastore
      // 2cf: ldc2_w 65805704789137213
      // 2d2: lload 1
      // 2d3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: aload 6
      // 2da: aload 29
      // 2dc: lload 22
      // 2de: bipush 1
      // 2df: anewarray 224
      // 2e2: dup_x2
      // 2e3: dup_x2
      // 2e4: pop
      // 2e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e8: bipush 0
      // 2e9: swap
      // 2ea: aastore
      // 2eb: ldc2_w 175028248909054445
      // 2ee: lload 1
      // 2ef: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f7: aload 29
      // 2f9: lload 12
      // 2fb: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 2fe: aload 6
      // 300: aload 29
      // 302: lload 24
      // 304: bipush 1
      // 305: anewarray 224
      // 308: dup_x2
      // 309: dup_x2
      // 30a: pop
      // 30b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30e: bipush 0
      // 30f: swap
      // 310: aastore
      // 311: ldc2_w 432354070062897812
      // 314: lload 1
      // 315: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31d: aload 29
      // 31f: lload 12
      // 321: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 324: aload 0
      // 325: ldc2_w 368217701561760233
      // 328: lload 1
      // 329: lload 1
      // 32a: lconst_0
      // 32b: lcmp
      // 32c: ifle 41b
      // 32f: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/_fo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: iload 28
      // 336: aload 29
      // 338: aastore
      // 339: iinc 28 1
      // 33c: iload 26
      // 33e: ifne 416
      // 341: iload 26
      // 343: ifeq 235
      // 346: lload 1
      // 347: lconst_0
      // 348: lcmp
      // 349: iflt 33c
      // 34c: goto 359
      // 34f: ldc2_w 538152107723136608
      // 352: lload 1
      // 353: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: athrow
      // 359: lload 1
      // 35a: lconst_0
      // 35b: lcmp
      // 35c: ifle 416
      // 35f: iload 26
      // 361: ifeq 407
      // 364: aload 0
      // 365: aload 4
      // 367: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 36a: ldc2_w 1771537622325525493
      // 36d: lload 1
      // 36e: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: lload 1
      // 374: lconst_0
      // 375: lcmp
      // 376: ifle 416
      // 379: iload 26
      // 37b: ifeq 407
      // 37e: goto 38b
      // 381: ldc2_w 538152107723136608
      // 384: lload 1
      // 385: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38a: athrow
      // 38b: aload 0
      // 38c: aload 4
      // 38e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 391: ldc2_w 2159285985090811773
      // 394: lload 1
      // 395: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39a: aload 6
      // 39c: aload 0
      // 39d: ldc2_w 2159285985090811773
      // 3a0: lload 1
      // 3a1: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3a9: aload 0
      // 3aa: lload 12
      // 3ac: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 3af: lload 1
      // 3b0: lconst_0
      // 3b1: lcmp
      // 3b2: iflt 416
      // 3b5: iload 26
      // 3b7: ifeq 407
      // 3ba: goto 3c7
      // 3bd: ldc2_w 538152107723136608
      // 3c0: lload 1
      // 3c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: aload 0
      // 3c8: aload 4
      // 3ca: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 3cd: ldc2_w 2159285985090811773
      // 3d0: lload 1
      // 3d1: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d6: aload 6
      // 3d8: aload 0
      // 3d9: ldc2_w 2159285985090811773
      // 3dc: lload 1
      // 3dd: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e5: aload 0
      // 3e6: lload 12
      // 3e8: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 3eb: aload 0
      // 3ec: aload 4
      // 3ee: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 3f1: ldc2_w 1771537622325525493
      // 3f4: lload 1
      // 3f5: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fa: goto 407
      // 3fd: ldc2_w 538152107723136608
      // 400: lload 1
      // 401: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: athrow
      // 407: aload 0
      // 408: aload 4
      // 40a: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 40d: ldc2_w 2120363553155902272
      // 410: lload 1
      // 411: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 416: aload 0
      // 417: ldc2_w 2120363553155902272
      // 41a: lload 1
      // 41b: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: iload 26
      // 422: ifne 45a
      // 425: ifle 4ea
      // 428: goto 435
      // 42b: ldc2_w 538152107723136608
      // 42e: lload 1
      // 42f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 434: athrow
      // 435: aload 0
      // 436: aload 0
      // 437: ldc2_w 2120363553155902272
      // 43a: lload 1
      // 43b: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 440: anewarray 68
      // 443: ldc2_w 2155229992486784226
      // 446: lload 1
      // 447: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/pf;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44c: bipush 0
      // 44d: goto 45a
      // 450: ldc2_w 538152107723136608
      // 453: lload 1
      // 454: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: athrow
      // 45a: istore 27
      // 45c: iload 27
      // 45e: aload 0
      // 45f: ldc2_w 2120363553155902272
      // 462: lload 1
      // 463: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 468: if_icmpge 4ea
      // 46b: aload 0
      // 46c: ldc2_w 2155229992486784226
      // 46f: lload 1
      // 470: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 475: iload 27
      // 477: new com/zelix/pf
      // 47a: dup
      // 47b: aload 0
      // 47c: iload 7
      // 47e: iload 8
      // 480: i2c
      // 481: aload 4
      // 483: iload 9
      // 485: i2s
      // 486: invokespecial com/zelix/pf.<init> (Lcom/zelix/h8;ICLcom/zelix/_xx;S)V
      // 489: aastore
      // 48a: iload 26
      // 48c: lload 1
      // 48d: lconst_0
      // 48e: lcmp
      // 48f: ifle 4e7
      // 492: ifne 4e5
      // 495: aload 0
      // 496: ldc2_w 2155229992486784226
      // 499: lload 1
      // 49a: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/pf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49f: iload 27
      // 4a1: aaload
      // 4a2: lload 20
      // 4a4: bipush 1
      // 4a5: anewarray 224
      // 4a8: dup_x2
      // 4a9: dup_x2
      // 4aa: pop
      // 4ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4ae: bipush 0
      // 4af: swap
      // 4b0: aastore
      // 4b1: ldc2_w 2290701819133173301
      // 4b4: lload 1
      // 4b5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ba: ifne 4e2
      // 4bd: goto 4ca
      // 4c0: ldc2_w 538152107723136608
      // 4c3: lload 1
      // 4c4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c9: athrow
      // 4ca: aload 0
      // 4cb: bipush 0
      // 4cc: ldc2_w 2249876370783527304
      // 4cf: lload 1
      // 4d0: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d5: goto 4e2
      // 4d8: ldc2_w 538152107723136608
      // 4db: lload 1
      // 4dc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e1: athrow
      // 4e2: iinc 27 1
      // 4e5: iload 26
      // 4e7: ifeq 45c
      // 4ea: return
   }

   static {
      long var0 = a ^ 7169962138310L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -312490945824572745L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
