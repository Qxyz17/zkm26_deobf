package com.zelix;

import java.io.PrintWriter;
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

public class ir extends iz {
   private static final long b = ess.a(-6315692250415932803L, 7879866767461267444L, MethodHandles.lookup().lookupClass()).a(197842199217166L);
   private static final String[] k;
   private static final String[] m;
   private static final Map o = new HashMap(13);
   private static final long[] t;
   private static final Integer[] u;
   private static final Map v;

   public hy O() {
      return (hy)this.x();
   }

   ir(h8 param1, _xx param2, _y4 param3, _y4 param4, _y4 param5, long param6, _y4 param8, _y4 param9, _y4 param10, _y4 param11, PrintWriter param12, ej param13) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ir.b J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 4290582246351
      // 00e: lxor
      // 00f: lstore 14
      // 011: dup2
      // 012: ldc2_w 116531444369944
      // 015: lxor
      // 016: lstore 16
      // 018: dup2
      // 019: ldc2_w 6303816255668
      // 01c: lxor
      // 01d: lstore 18
      // 01f: dup2
      // 020: ldc2_w 121080081971566
      // 023: lxor
      // 024: lstore 20
      // 026: dup2
      // 027: ldc2_w 110021253011591
      // 02a: lxor
      // 02b: lstore 22
      // 02d: pop2
      // 02e: aload 0
      // 02f: lload 22
      // 031: aload 1
      // 032: aload 2
      // 033: aload 3
      // 034: aload 12
      // 036: invokespecial com/zelix/iz.<init> (JLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Ljava/io/PrintWriter;)V
      // 039: ldc2_w -1308596022038569540
      // 03c: lload 6
      // 03e: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: aload 0
      // 044: aload 0
      // 045: getfield com/zelix/ir.F I
      // 048: anewarray 99
      // 04b: putfield com/zelix/ir.J [Lcom/zelix/h4;
      // 04e: istore 24
      // 050: bipush 0
      // 051: istore 25
      // 053: iload 25
      // 055: aload 0
      // 056: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 059: arraylength
      // 05a: if_icmpge 105
      // 05d: aload 0
      // 05e: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 061: iload 25
      // 063: aload 0
      // 064: aload 2
      // 065: aload 3
      // 066: aload 4
      // 068: aload 5
      // 06a: aload 8
      // 06c: aload 9
      // 06e: lload 18
      // 070: aload 10
      // 072: aload 11
      // 074: aconst_null
      // 075: aload 12
      // 077: aconst_null
      // 078: aload 13
      // 07a: bipush 14
      // 07c: anewarray 204
      // 07f: dup_x1
      // 080: swap
      // 081: bipush 13
      // 083: swap
      // 084: aastore
      // 085: dup_x1
      // 086: swap
      // 087: bipush 12
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 11
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: bipush 10
      // 095: swap
      // 096: aastore
      // 097: dup_x1
      // 098: swap
      // 099: bipush 9
      // 09b: swap
      // 09c: aastore
      // 09d: dup_x1
      // 09e: swap
      // 09f: bipush 8
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 7
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x1
      // 0ae: swap
      // 0af: bipush 6
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 5
      // 0b6: swap
      // 0b7: aastore
      // 0b8: dup_x1
      // 0b9: swap
      // 0ba: bipush 4
      // 0bb: swap
      // 0bc: aastore
      // 0bd: dup_x1
      // 0be: swap
      // 0bf: bipush 3
      // 0c0: swap
      // 0c1: aastore
      // 0c2: dup_x1
      // 0c3: swap
      // 0c4: bipush 2
      // 0c5: swap
      // 0c6: aastore
      // 0c7: dup_x1
      // 0c8: swap
      // 0c9: bipush 1
      // 0ca: swap
      // 0cb: aastore
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 0
      // 0cf: swap
      // 0d0: aastore
      // 0d1: ldc2_w -977350607383688054
      // 0d4: lload 6
      // 0d6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/h4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aastore
      // 0dc: iinc 25 1
      // 0df: iload 24
      // 0e1: lload 6
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 0ed
      // 0e8: ifeq 1b4
      // 0eb: iload 24
      // 0ed: ifne 053
      // 0f0: lload 6
      // 0f2: lconst_0
      // 0f3: lcmp
      // 0f4: iflt 0df
      // 0f7: goto 105
      // 0fa: ldc2_w -1420166676602549355
      // 0fd: lload 6
      // 0ff: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 0
      // 106: iload 24
      // 108: lload 6
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: iflt 1b6
      // 10f: ifeq 1b5
      // 112: invokevirtual com/zelix/ir.H ()Ljava/lang/String;
      // 115: lload 20
      // 117: bipush 1
      // 118: ldc2_w -1365991659223603470
      // 11b: lload 6
      // 11d: invokedynamic w (Ljava/lang/Object;JZJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: ifnonnull 1b4
      // 125: goto 133
      // 128: ldc2_w -1420166676602549355
      // 12b: lload 6
      // 12d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 12
      // 135: new java/lang/StringBuilder
      // 138: dup
      // 139: invokespecial java/lang/StringBuilder.<init> ()V
      // 13c: sipush 14503
      // 13f: ldc2_w 4168258908804987706
      // 142: lload 6
      // 144: lxor
      // 145: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: aload 0
      // 14e: lload 16
      // 150: invokevirtual com/zelix/ir.j (J)Ljava/lang/String;
      // 153: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 156: sipush 14455
      // 159: ldc2_w 761723548810263524
      // 15c: lload 6
      // 15e: lxor
      // 15f: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 167: sipush 26263
      // 16a: ldc2_w 3311847983488394496
      // 16d: lload 6
      // 16f: lxor
      // 170: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17b: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 17e: aload 0
      // 17f: bipush 0
      // 180: lload 14
      // 182: bipush 2
      // 183: anewarray 204
      // 186: dup_x2
      // 187: dup_x2
      // 188: pop
      // 189: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c: bipush 1
      // 18d: swap
      // 18e: aastore
      // 18f: dup_x1
      // 190: swap
      // 191: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 194: bipush 0
      // 195: swap
      // 196: aastore
      // 197: ldc2_w -1399403979346906635
      // 19a: lload 6
      // 19c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: iload 24
      // 1a3: ifne 1d7
      // 1a6: goto 1b4
      // 1a9: ldc2_w -1420166676602549355
      // 1ac: lload 6
      // 1ae: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: bipush 1
      // 1b6: lload 14
      // 1b8: bipush 2
      // 1b9: anewarray 204
      // 1bc: dup_x2
      // 1bd: dup_x2
      // 1be: pop
      // 1bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c2: bipush 1
      // 1c3: swap
      // 1c4: aastore
      // 1c5: dup_x1
      // 1c6: swap
      // 1c7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1ca: bipush 0
      // 1cb: swap
      // 1cc: aastore
      // 1cd: ldc2_w -1399403979346906635
      // 1d0: lload 6
      // 1d2: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: return
   }

   public boolean c(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.w.u().equals(c<"o">(12455, 5714138580217560262L ^ var2));
   }

   void I(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/e7
      // 00f: astore 11
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_8z
      // 017: astore 4
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 19
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast com/zelix/_8z
      // 02a: astore 15
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/util/Map
      // 032: astore 8
      // 034: dup
      // 035: bipush 6
      // 037: aaload
      // 038: checkcast com/zelix/_y4
      // 03b: astore 7
      // 03d: dup
      // 03e: bipush 7
      // 040: aaload
      // 041: checkcast com/zelix/_y4
      // 044: astore 10
      // 046: dup
      // 047: bipush 8
      // 049: aaload
      // 04a: checkcast java/util/Map
      // 04d: astore 2
      // 04e: dup
      // 04f: bipush 9
      // 051: aaload
      // 052: checkcast java/util/Map
      // 055: astore 13
      // 057: dup
      // 058: bipush 10
      // 05a: aaload
      // 05b: checkcast java/lang/String
      // 05e: astore 12
      // 060: dup
      // 061: bipush 11
      // 063: aaload
      // 064: checkcast com/zelix/_uw
      // 067: astore 5
      // 069: dup
      // 06a: bipush 12
      // 06c: aaload
      // 06d: checkcast java/util/Map
      // 070: astore 3
      // 071: dup
      // 072: bipush 13
      // 074: aaload
      // 075: checkcast java/util/HashMap
      // 078: astore 18
      // 07a: dup
      // 07b: bipush 14
      // 07d: aaload
      // 07e: checkcast java/util/HashMap
      // 081: astore 9
      // 083: dup
      // 084: bipush 15
      // 086: aaload
      // 087: checkcast com/zelix/w
      // 08a: astore 14
      // 08c: dup
      // 08d: bipush 16
      // 08f: aaload
      // 090: checkcast com/zelix/_8z
      // 093: astore 17
      // 095: dup
      // 096: bipush 17
      // 098: aaload
      // 099: checkcast java/util/Map
      // 09c: astore 16
      // 09e: pop
      // 09f: getstatic com/zelix/ir.b J
      // 0a2: lload 19
      // 0a4: lxor
      // 0a5: lstore 19
      // 0a7: lload 19
      // 0a9: dup2
      // 0aa: ldc2_w 40164094030304
      // 0ad: lxor
      // 0ae: lstore 21
      // 0b0: dup2
      // 0b1: ldc2_w 71675705612884
      // 0b4: lxor
      // 0b5: lstore 23
      // 0b7: dup2
      // 0b8: ldc2_w 78179232852368
      // 0bb: lxor
      // 0bc: lstore 25
      // 0be: dup2
      // 0bf: ldc2_w 130859032885780
      // 0c2: lxor
      // 0c3: lstore 27
      // 0c5: dup2
      // 0c6: ldc2_w 44125361619287
      // 0c9: lxor
      // 0ca: lstore 29
      // 0cc: dup2
      // 0cd: ldc2_w 117675394548372
      // 0d0: lxor
      // 0d1: lstore 31
      // 0d3: dup2
      // 0d4: ldc2_w 17519538567042
      // 0d7: lxor
      // 0d8: lstore 33
      // 0da: dup2
      // 0db: ldc2_w 46492399653152
      // 0de: lxor
      // 0df: lstore 35
      // 0e1: dup2
      // 0e2: ldc2_w 77377255565822
      // 0e5: lxor
      // 0e6: dup2
      // 0e7: bipush 32
      // 0e9: lushr
      // 0ea: l2i
      // 0eb: istore 37
      // 0ed: dup2
      // 0ee: bipush 32
      // 0f0: lshl
      // 0f1: bipush 56
      // 0f3: lushr
      // 0f4: l2i
      // 0f5: istore 38
      // 0f7: dup2
      // 0f8: bipush 40
      // 0fa: lshl
      // 0fb: bipush 40
      // 0fd: lushr
      // 0fe: l2i
      // 0ff: istore 39
      // 101: pop2
      // 102: dup2
      // 103: ldc2_w 101981835543375
      // 106: lxor
      // 107: lstore 40
      // 109: dup2
      // 10a: ldc2_w 26474432309822
      // 10d: lxor
      // 10e: lstore 42
      // 110: pop2
      // 111: ldc2_w 5605187487664733603
      // 114: lload 19
      // 116: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: aload 0
      // 11c: lload 21
      // 11e: invokevirtual com/zelix/ir.w (J)Ljava/lang/String;
      // 121: astore 45
      // 123: aload 0
      // 124: lload 31
      // 126: bipush 1
      // 127: anewarray 204
      // 12a: dup_x2
      // 12b: dup_x2
      // 12c: pop
      // 12d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: ldc2_w 5620475661013867861
      // 136: lload 19
      // 138: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: astore 46
      // 13f: istore 44
      // 141: aload 5
      // 143: lload 40
      // 145: aload 0
      // 146: bipush 2
      // 147: anewarray 204
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 1
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x2
      // 150: dup_x2
      // 151: pop
      // 152: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 155: bipush 0
      // 156: swap
      // 157: aastore
      // 158: ldc2_w 5678590963219206592
      // 15b: lload 19
      // 15d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: ifeq 175
      // 165: aload 45
      // 167: astore 47
      // 169: lload 19
      // 16b: lconst_0
      // 16c: lcmp
      // 16d: iflt 344
      // 170: iload 44
      // 172: ifne 344
      // 175: aload 13
      // 177: lload 19
      // 179: lconst_0
      // 17a: lcmp
      // 17b: ifle 205
      // 17e: iload 44
      // 180: ifeq 205
      // 183: goto 191
      // 186: ldc2_w 5500517362708556682
      // 189: lload 19
      // 18b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: lload 19
      // 193: lconst_0
      // 194: lcmp
      // 195: ifle 1f7
      // 198: ifnull 1f5
      // 19b: goto 1a9
      // 19e: ldc2_w 5500517362708556682
      // 1a1: lload 19
      // 1a3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: aload 13
      // 1ab: aload 0
      // 1ac: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1b1: lload 19
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: iflt 225
      // 1b8: iload 44
      // 1ba: ifeq 225
      // 1bd: goto 1cb
      // 1c0: ldc2_w 5500517362708556682
      // 1c3: lload 19
      // 1c5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: ifeq 1f5
      // 1ce: goto 1dc
      // 1d1: ldc2_w 5500517362708556682
      // 1d4: lload 19
      // 1d6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: aload 13
      // 1de: aload 0
      // 1df: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1e4: checkcast java/lang/String
      // 1e7: astore 47
      // 1e9: lload 19
      // 1eb: lconst_0
      // 1ec: lcmp
      // 1ed: ifle 344
      // 1f0: iload 44
      // 1f2: ifne 344
      // 1f5: aload 16
      // 1f7: goto 205
      // 1fa: ldc2_w 5500517362708556682
      // 1fd: lload 19
      // 1ff: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: athrow
      // 205: lload 19
      // 207: lconst_0
      // 208: lcmp
      // 209: ifle 23e
      // 20c: aload 0
      // 20d: iload 44
      // 20f: ifeq 239
      // 212: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 217: goto 225
      // 21a: ldc2_w 5500517362708556682
      // 21d: lload 19
      // 21f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: athrow
      // 225: ifeq 287
      // 228: aload 16
      // 22a: aload 0
      // 22b: goto 239
      // 22e: ldc2_w 5500517362708556682
      // 231: lload 19
      // 233: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: athrow
      // 239: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 23e: checkcast java/lang/String
      // 241: astore 47
      // 243: aload 8
      // 245: aload 47
      // 247: aload 0
      // 248: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 24d: pop
      // 24e: aload 2
      // 24f: aload 47
      // 251: aload 0
      // 252: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 257: pop
      // 258: aload 10
      // 25a: aload 0
      // 25b: lload 33
      // 25d: bipush 1
      // 25e: anewarray 204
      // 261: dup_x2
      // 262: dup_x2
      // 263: pop
      // 264: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 267: bipush 0
      // 268: swap
      // 269: aastore
      // 26a: ldc2_w 6030779254979231269
      // 26d: lload 19
      // 26f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: aload 47
      // 276: lload 23
      // 278: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 27b: lload 19
      // 27d: lconst_0
      // 27e: lcmp
      // 27f: ifle 344
      // 282: iload 44
      // 284: ifne 344
      // 287: aload 0
      // 288: lload 33
      // 28a: bipush 1
      // 28b: anewarray 204
      // 28e: dup_x2
      // 28f: dup_x2
      // 290: pop
      // 291: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 294: bipush 0
      // 295: swap
      // 296: aastore
      // 297: ldc2_w 6030779254979231269
      // 29a: lload 19
      // 29c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: astore 48
      // 2a3: aload 11
      // 2a5: aload 6
      // 2a7: aload 0
      // 2a8: aload 45
      // 2aa: aload 46
      // 2ac: aload 48
      // 2ae: aload 8
      // 2b0: aload 7
      // 2b2: aload 10
      // 2b4: aload 2
      // 2b5: aload 0
      // 2b6: lload 27
      // 2b8: bipush 1
      // 2b9: anewarray 204
      // 2bc: dup_x2
      // 2bd: dup_x2
      // 2be: pop
      // 2bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c2: bipush 0
      // 2c3: swap
      // 2c4: aastore
      // 2c5: ldc2_w 5244392609759745596
      // 2c8: lload 19
      // 2ca: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: aload 3
      // 2d0: aload 18
      // 2d2: aload 14
      // 2d4: lload 35
      // 2d6: aload 17
      // 2d8: bipush 15
      // 2da: anewarray 204
      // 2dd: dup_x1
      // 2de: swap
      // 2df: bipush 14
      // 2e1: swap
      // 2e2: aastore
      // 2e3: dup_x2
      // 2e4: dup_x2
      // 2e5: pop
      // 2e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e9: bipush 13
      // 2eb: swap
      // 2ec: aastore
      // 2ed: dup_x1
      // 2ee: swap
      // 2ef: bipush 12
      // 2f1: swap
      // 2f2: aastore
      // 2f3: dup_x1
      // 2f4: swap
      // 2f5: bipush 11
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x1
      // 2fa: swap
      // 2fb: bipush 10
      // 2fd: swap
      // 2fe: aastore
      // 2ff: dup_x1
      // 300: swap
      // 301: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 304: bipush 9
      // 306: swap
      // 307: aastore
      // 308: dup_x1
      // 309: swap
      // 30a: bipush 8
      // 30c: swap
      // 30d: aastore
      // 30e: dup_x1
      // 30f: swap
      // 310: bipush 7
      // 312: swap
      // 313: aastore
      // 314: dup_x1
      // 315: swap
      // 316: bipush 6
      // 318: swap
      // 319: aastore
      // 31a: dup_x1
      // 31b: swap
      // 31c: bipush 5
      // 31d: swap
      // 31e: aastore
      // 31f: dup_x1
      // 320: swap
      // 321: bipush 4
      // 322: swap
      // 323: aastore
      // 324: dup_x1
      // 325: swap
      // 326: bipush 3
      // 327: swap
      // 328: aastore
      // 329: dup_x1
      // 32a: swap
      // 32b: bipush 2
      // 32c: swap
      // 32d: aastore
      // 32e: dup_x1
      // 32f: swap
      // 330: bipush 1
      // 331: swap
      // 332: aastore
      // 333: dup_x1
      // 334: swap
      // 335: bipush 0
      // 336: swap
      // 337: aastore
      // 338: ldc2_w 5956967009343822442
      // 33b: lload 19
      // 33d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 342: astore 47
      // 344: aload 47
      // 346: iload 44
      // 348: ifeq 35e
      // 34b: ifnonnull 360
      // 34e: goto 35c
      // 351: ldc2_w 5500517362708556682
      // 354: lload 19
      // 356: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35b: athrow
      // 35c: aload 45
      // 35e: astore 47
      // 360: new com/zelix/s3
      // 363: dup
      // 364: aload 45
      // 366: aload 0
      // 367: invokevirtual com/zelix/ir.H ()Ljava/lang/String;
      // 36a: invokespecial com/zelix/s3.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 36d: astore 48
      // 36f: new com/zelix/s3
      // 372: dup
      // 373: aload 47
      // 375: aload 0
      // 376: invokevirtual com/zelix/ir.H ()Ljava/lang/String;
      // 379: invokespecial com/zelix/s3.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 37c: astore 49
      // 37e: aload 4
      // 380: aload 12
      // 382: aload 48
      // 384: aload 49
      // 386: iload 37
      // 388: iload 38
      // 38a: i2b
      // 38b: iload 39
      // 38d: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 390: checkcast com/zelix/s3
      // 393: astore 50
      // 395: aload 15
      // 397: aload 12
      // 399: aload 49
      // 39b: aload 48
      // 39d: iload 37
      // 39f: iload 38
      // 3a1: i2b
      // 3a2: iload 39
      // 3a4: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 3a7: checkcast com/zelix/s3
      // 3aa: astore 51
      // 3ac: aload 51
      // 3ae: iload 44
      // 3b0: ifeq 491
      // 3b3: ifnull 489
      // 3b6: goto 3c4
      // 3b9: ldc2_w 5500517362708556682
      // 3bc: lload 19
      // 3be: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c3: athrow
      // 3c4: lload 29
      // 3c6: bipush 0
      // 3c7: bipush 1
      // 3c8: anewarray 14
      // 3cb: dup
      // 3cc: bipush 0
      // 3cd: new java/lang/StringBuilder
      // 3d0: dup
      // 3d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d4: sipush 1776
      // 3d7: ldc2_w 9000436085865981296
      // 3da: lload 19
      // 3dc: lxor
      // 3dd: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e5: aload 12
      // 3e7: aload 9
      // 3e9: lload 25
      // 3eb: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 3ee: checkcast java/lang/String
      // 3f1: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 3f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f7: sipush 10283
      // 3fa: ldc2_w 6727245280015223722
      // 3fd: lload 19
      // 3ff: lxor
      // 400: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 405: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 408: aload 48
      // 40a: bipush 0
      // 40b: anewarray 204
      // 40e: ldc2_w 5856469656187145664
      // 411: lload 19
      // 413: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 418: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41b: sipush 22898
      // 41e: ldc2_w 5004611368763292411
      // 421: lload 19
      // 423: lxor
      // 424: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42c: aload 51
      // 42e: bipush 0
      // 42f: anewarray 204
      // 432: ldc2_w 5856469656187145664
      // 435: lload 19
      // 437: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 43f: sipush 25638
      // 442: ldc2_w 3872502385737746349
      // 445: lload 19
      // 447: lxor
      // 448: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 450: aload 49
      // 452: bipush 0
      // 453: anewarray 204
      // 456: ldc2_w 5856469656187145664
      // 459: lload 19
      // 45b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 460: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 463: sipush 22112
      // 466: ldc2_w 1677974421084403182
      // 469: lload 19
      // 46b: lxor
      // 46c: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 471: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 474: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 477: aastore
      // 478: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 47b: goto 489
      // 47e: ldc2_w 5500517362708556682
      // 481: lload 19
      // 483: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 488: athrow
      // 489: aload 18
      // 48b: aload 0
      // 48c: aload 47
      // 48e: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 491: astore 52
      // 493: lload 19
      // 495: lconst_0
      // 496: lcmp
      // 497: iflt 4c5
      // 49a: aload 47
      // 49c: aload 45
      // 49e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a1: ifne 4d3
      // 4a4: aload 0
      // 4a5: aload 47
      // 4a7: lload 42
      // 4a9: bipush 2
      // 4aa: anewarray 204
      // 4ad: dup_x2
      // 4ae: dup_x2
      // 4af: pop
      // 4b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b3: bipush 1
      // 4b4: swap
      // 4b5: aastore
      // 4b6: dup_x1
      // 4b7: swap
      // 4b8: bipush 0
      // 4b9: swap
      // 4ba: aastore
      // 4bb: ldc2_w 5613812217446805102
      // 4be: lload 19
      // 4c0: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: goto 4d3
      // 4c8: ldc2_w 5500517362708556682
      // 4cb: lload 19
      // 4cd: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d2: athrow
      // 4d3: return
   }

   public boolean Q(Object[] var1) {
      return this.w.u().equals("J");
   }

   public boolean k() {
      return true;
   }

   hj f(Object[] param1) {
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
      // 0c: ldc2_w 7290398567230296424
      // 0f: lload 2
      // 10: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: bipush 0
      // 16: istore 5
      // 18: istore 4
      // 1a: iload 5
      // 1c: aload 0
      // 1d: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 20: arraylength
      // 21: if_icmpge 69
      // 24: aload 0
      // 25: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 28: iload 5
      // 2a: aaload
      // 2b: iload 4
      // 2d: ifne 5d
      // 30: instanceof com/zelix/hj
      // 33: lload 2
      // 34: lconst_0
      // 35: lcmp
      // 36: iflt 66
      // 39: ifeq 61
      // 3c: goto 49
      // 3f: ldc2_w 8775190877173882392
      // 42: lload 2
      // 43: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 4d: iload 5
      // 4f: aaload
      // 50: goto 5d
      // 53: ldc2_w 8775190877173882392
      // 56: lload 2
      // 57: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: checkcast com/zelix/hj
      // 60: areturn
      // 61: iinc 5 1
      // 64: iload 4
      // 66: ifeq 1a
      // 69: lload 2
      // 6a: lconst_0
      // 6b: lcmp
      // 6c: ifle 24
      // 6f: aconst_null
      // 70: areturn
   }

   public void g(Object[] param1) {
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
      // 017: getstatic com/zelix/ir.b J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 122997448272823
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 122223480739608
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 17814181633944
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 92399611845878
      // 037: lxor
      // 038: lstore 11
      // 03a: pop2
      // 03b: ldc2_w -437801711728931416
      // 03e: lload 2
      // 03f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: istore 13
      // 046: iload 4
      // 048: bipush 1
      // 049: if_icmpne 208
      // 04c: new java/util/ArrayList
      // 04f: dup
      // 050: aload 0
      // 051: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 054: arraylength
      // 055: invokespecial java/util/ArrayList.<init> (I)V
      // 058: astore 14
      // 05a: bipush 0
      // 05b: istore 15
      // 05d: iload 15
      // 05f: aload 0
      // 060: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 063: arraylength
      // 064: if_icmpge 166
      // 067: aload 0
      // 068: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 06b: iload 15
      // 06d: aaload
      // 06e: instanceof com/zelix/b6
      // 071: iload 13
      // 073: lload 2
      // 074: lconst_0
      // 075: lcmp
      // 076: ifle 173
      // 079: ifne 171
      // 07c: iload 13
      // 07e: lload 2
      // 07f: lconst_0
      // 080: lcmp
      // 081: ifle 0b6
      // 084: ifne 0b4
      // 087: goto 094
      // 08a: ldc2_w -1943423174785695016
      // 08d: lload 2
      // 08e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: ifeq 0aa
      // 097: goto 0a4
      // 09a: ldc2_w -1943423174785695016
      // 09d: lload 2
      // 09e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: lload 2
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: ifge 15e
      // 0aa: aload 0
      // 0ab: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 0ae: iload 15
      // 0b0: aaload
      // 0b1: instanceof com/zelix/by
      // 0b4: iload 13
      // 0b6: ifne 15d
      // 0b9: ifeq 144
      // 0bc: goto 0c9
      // 0bf: ldc2_w -1943423174785695016
      // 0c2: lload 2
      // 0c3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 0cd: iload 15
      // 0cf: aaload
      // 0d0: checkcast com/zelix/by
      // 0d3: astore 16
      // 0d5: aload 16
      // 0d7: lload 5
      // 0d9: bipush 1
      // 0da: anewarray 204
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 0
      // 0e4: swap
      // 0e5: aastore
      // 0e6: ldc2_w -119247161377227576
      // 0e9: lload 2
      // 0ea: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: pop
      // 0f0: aload 16
      // 0f2: lload 7
      // 0f4: bipush 1
      // 0f5: anewarray 204
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w -528985672507380994
      // 104: lload 2
      // 105: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: iload 13
      // 10c: ifne 138
      // 10f: ifne 139
      // 112: goto 11f
      // 115: ldc2_w -1943423174785695016
      // 118: lload 2
      // 119: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 14
      // 121: aload 0
      // 122: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 125: iload 15
      // 127: aaload
      // 128: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 12b: goto 138
      // 12e: ldc2_w -1943423174785695016
      // 131: lload 2
      // 132: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: pop
      // 139: iload 13
      // 13b: lload 2
      // 13c: lconst_0
      // 13d: lcmp
      // 13e: iflt 163
      // 141: ifeq 15e
      // 144: aload 14
      // 146: aload 0
      // 147: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 14a: iload 15
      // 14c: aaload
      // 14d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 150: goto 15d
      // 153: ldc2_w -1943423174785695016
      // 156: lload 2
      // 157: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: pop
      // 15e: iinc 15 1
      // 161: iload 13
      // 163: ifeq 05d
      // 166: aload 14
      // 168: lload 2
      // 169: lconst_0
      // 16a: lcmp
      // 16b: ifle 193
      // 16e: invokevirtual java/util/ArrayList.size ()I
      // 171: iload 13
      // 173: lload 2
      // 174: lconst_0
      // 175: lcmp
      // 176: ifle 181
      // 179: ifne 1e3
      // 17c: aload 0
      // 17d: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 180: arraylength
      // 181: if_icmpge 1b2
      // 184: goto 191
      // 187: ldc2_w -1943423174785695016
      // 18a: lload 2
      // 18b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: aload 14
      // 193: invokevirtual java/util/ArrayList.size ()I
      // 196: anewarray 99
      // 199: astore 15
      // 19b: aload 0
      // 19c: aload 14
      // 19e: aload 15
      // 1a0: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a3: checkcast [Lcom/zelix/h4;
      // 1a6: putfield com/zelix/ir.J [Lcom/zelix/h4;
      // 1a9: aload 0
      // 1aa: aload 0
      // 1ab: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 1ae: arraylength
      // 1af: putfield com/zelix/ir.F I
      // 1b2: aload 0
      // 1b3: iload 13
      // 1b5: lload 2
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: ifle 1e8
      // 1bb: ifne 1e7
      // 1be: lload 11
      // 1c0: bipush 1
      // 1c1: anewarray 204
      // 1c4: dup_x2
      // 1c5: dup_x2
      // 1c6: pop
      // 1c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ca: bipush 0
      // 1cb: swap
      // 1cc: aastore
      // 1cd: ldc2_w -1938072105530647692
      // 1d0: lload 2
      // 1d1: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: goto 1e3
      // 1d9: ldc2_w -1943423174785695016
      // 1dc: lload 2
      // 1dd: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: ifeq 208
      // 1e6: aload 0
      // 1e7: bipush 0
      // 1e8: lload 9
      // 1ea: bipush 2
      // 1eb: anewarray 204
      // 1ee: dup_x2
      // 1ef: dup_x2
      // 1f0: pop
      // 1f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f4: bipush 1
      // 1f5: swap
      // 1f6: aastore
      // 1f7: dup_x1
      // 1f8: swap
      // 1f9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1fc: bipush 0
      // 1fd: swap
      // 1fe: aastore
      // 1ff: ldc2_w -1856569659996990436
      // 202: lload 2
      // 203: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: return
   }

   public hy f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 100824600046223L;
      long var6 = var2 ^ 19007994887712L;
      boolean var10000 = x44.a<"p">(3864595216058615243L, var2);
      String var9 = hz.P(this.H(), var6);
      boolean var8 = var10000;

      try {
         if (!var8) {
            return yn.Z(var4, var9);
         }

         if (var9 == null) {
            return null;
         }
      } catch (NumberFormatException var10) {
         throw x44.a<"p">(var10, 3764358278503322594L, var2);
      }

      return yn.Z(var4, var9);
   }

   public boolean x(Object[] param1) {
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
      // 0c: getstatic com/zelix/ir.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 5995641353578899312
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aconst_null
      // 1c: astore 5
      // 1e: istore 4
      // 20: aload 0
      // 21: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 24: arraylength
      // 25: bipush 1
      // 26: isub
      // 27: anewarray 99
      // 2a: astore 6
      // 2c: bipush 0
      // 2d: istore 7
      // 2f: bipush 0
      // 30: istore 8
      // 32: iload 8
      // 34: aload 0
      // 35: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 38: arraylength
      // 39: if_icmpge cf
      // 3c: aload 0
      // 3d: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 40: iload 8
      // 42: aaload
      // 43: instanceof com/zelix/hj
      // 46: iload 4
      // 48: lload 2
      // 49: lconst_0
      // 4a: lcmp
      // 4b: iflt 53
      // 4e: ifne fc
      // 51: iload 4
      // 53: lload 2
      // 54: lconst_0
      // 55: lcmp
      // 56: iflt a8
      // 59: ifne 9f
      // 5c: goto 69
      // 5f: ldc2_w 5755533569254729728
      // 62: lload 2
      // 63: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: ifeq 90
      // 6c: goto 79
      // 6f: ldc2_w 5755533569254729728
      // 72: lload 2
      // 73: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 0
      // 7a: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // 7d: iload 8
      // 7f: aaload
      // 80: checkcast com/zelix/hj
      // 83: astore 5
      // 85: iload 4
      // 87: lload 2
      // 88: lconst_0
      // 89: lcmp
      // 8a: ifle cc
      // 8d: ifeq c7
      // 90: iload 7
      // 92: goto 9f
      // 95: ldc2_w 5755533569254729728
      // 98: lload 2
      // 99: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: lload 2
      // a0: lconst_0
      // a1: lcmp
      // a2: ifle cc
      // a5: aload 6
      // a7: arraylength
      // a8: if_icmpge c7
      // ab: aload 6
      // ad: iload 7
      // af: iinc 7 1
      // b2: aload 0
      // b3: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // b6: iload 8
      // b8: aaload
      // b9: aastore
      // ba: goto c7
      // bd: ldc2_w 5755533569254729728
      // c0: lload 2
      // c1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: iinc 8 1
      // ca: iload 4
      // cc: ifeq 32
      // cf: lload 2
      // d0: lconst_0
      // d1: lcmp
      // d2: iflt ef
      // d5: aload 5
      // d7: lload 2
      // d8: lconst_0
      // d9: lcmp
      // da: iflt 43
      // dd: ifnull fb
      // e0: aload 0
      // e1: aload 6
      // e3: putfield com/zelix/ir.J [Lcom/zelix/h4;
      // e6: aload 0
      // e7: aload 0
      // e8: getfield com/zelix/ir.J [Lcom/zelix/h4;
      // eb: arraylength
      // ec: putfield com/zelix/ir.F I
      // ef: bipush 1
      // f0: ireturn
      // f1: ldc2_w 5755533569254729728
      // f4: lload 2
      // f5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fa: athrow
      // fb: bipush 0
      // fc: ireturn
   }

   void x(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_8z
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/hy
      // 01e: astore 6
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast com/zelix/pk
      // 026: astore 8
      // 028: dup
      // 029: bipush 5
      // 02a: aaload
      // 02b: checkcast java/lang/Long
      // 02e: invokevirtual java/lang/Long.longValue ()J
      // 031: lstore 3
      // 032: pop
      // 033: getstatic com/zelix/ir.b J
      // 036: lload 3
      // 037: lxor
      // 038: lstore 3
      // 039: lload 3
      // 03a: dup2
      // 03b: ldc2_w 113503892587151
      // 03e: lxor
      // 03f: lstore 9
      // 041: dup2
      // 042: ldc2_w 26129401618634
      // 045: lxor
      // 046: lstore 11
      // 048: dup2
      // 049: ldc2_w 2202600031587
      // 04c: lxor
      // 04d: lstore 13
      // 04f: dup2
      // 050: ldc2_w 78443017221485
      // 053: lxor
      // 054: lstore 15
      // 056: dup2
      // 057: ldc2_w 6474837826193
      // 05a: lxor
      // 05b: dup2
      // 05c: bipush 32
      // 05e: lushr
      // 05f: l2i
      // 060: istore 17
      // 062: dup2
      // 063: bipush 32
      // 065: lshl
      // 066: bipush 56
      // 068: lushr
      // 069: l2i
      // 06a: istore 18
      // 06c: dup2
      // 06d: bipush 40
      // 06f: lshl
      // 070: bipush 40
      // 072: lushr
      // 073: l2i
      // 074: istore 19
      // 076: pop2
      // 077: dup2
      // 078: ldc2_w 100778431633745
      // 07b: lxor
      // 07c: lstore 20
      // 07e: pop2
      // 07f: ldc2_w 4514546291250040524
      // 082: lload 3
      // 083: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: aload 0
      // 089: lload 11
      // 08b: invokevirtual com/zelix/ir.k (J)Ljava/lang/String;
      // 08e: astore 23
      // 090: istore 22
      // 092: aload 0
      // 093: lload 9
      // 095: invokevirtual com/zelix/ir.w (J)Ljava/lang/String;
      // 098: astore 24
      // 09a: aload 24
      // 09c: aload 2
      // 09d: invokevirtual java/lang/String.length ()I
      // 0a0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0a3: astore 25
      // 0a5: new java/lang/StringBuilder
      // 0a8: dup
      // 0a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ac: aload 5
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b1: aload 25
      // 0b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b9: astore 26
      // 0bb: aload 8
      // 0bd: iload 22
      // 0bf: ifeq 28f
      // 0c2: aload 23
      // 0c4: lload 13
      // 0c6: aload 26
      // 0c8: bipush 3
      // 0c9: anewarray 204
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 2
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 1
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x1
      // 0db: swap
      // 0dc: bipush 0
      // 0dd: swap
      // 0de: aastore
      // 0df: ldc2_w 2436236955318964163
      // 0e2: lload 3
      // 0e3: lload 3
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: iflt 278
      // 0e9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: ifeq 22f
      // 0f1: goto 0fe
      // 0f4: ldc2_w 4556095645699594469
      // 0f7: lload 3
      // 0f8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: new java/lang/StringBuffer
      // 101: dup
      // 102: invokespecial java/lang/StringBuffer.<init> ()V
      // 105: astore 27
      // 107: aload 25
      // 109: iload 22
      // 10b: ifeq 1b7
      // 10e: invokevirtual java/lang/String.length ()I
      // 111: ifle 19a
      // 114: goto 121
      // 117: ldc2_w 4556095645699594469
      // 11a: lload 3
      // 11b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 25
      // 123: invokevirtual java/lang/String.length ()I
      // 126: bipush 1
      // 127: isub
      // 128: istore 28
      // 12a: iload 28
      // 12c: iflt 19a
      // 12f: aload 25
      // 131: iload 28
      // 133: invokevirtual java/lang/String.charAt (I)C
      // 136: istore 29
      // 138: iload 22
      // 13a: lload 3
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: ifle 145
      // 140: ifeq 290
      // 143: iload 22
      // 145: lload 3
      // 146: lconst_0
      // 147: lcmp
      // 148: ifle 197
      // 14b: ifeq 195
      // 14e: goto 15b
      // 151: ldc2_w 4556095645699594469
      // 154: lload 3
      // 155: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: iload 29
      // 15d: ldc2_w 2585801313715814758
      // 160: lload 3
      // 161: invokedynamic w (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: ifeq 192
      // 169: goto 176
      // 16c: ldc2_w 4556095645699594469
      // 16f: lload 3
      // 170: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 27
      // 178: bipush 0
      // 179: iload 29
      // 17b: ldc2_w 4158733850279044004
      // 17e: lload 3
      // 17f: invokedynamic o (Ljava/lang/Object;ICJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: pop
      // 185: goto 192
      // 188: ldc2_w 4556095645699594469
      // 18b: lload 3
      // 18c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: iinc 28 -1
      // 195: iload 22
      // 197: ifne 12a
      // 19a: lload 3
      // 19b: lconst_0
      // 19c: lcmp
      // 19d: iflt 290
      // 1a0: aload 26
      // 1a2: bipush 0
      // 1a3: aload 26
      // 1a5: invokevirtual java/lang/String.length ()I
      // 1a8: aload 27
      // 1aa: ldc2_w 4036369110556135130
      // 1ad: lload 3
      // 1ae: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: isub
      // 1b4: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1b7: astore 28
      // 1b9: bipush -1
      // 1ba: istore 29
      // 1bc: aload 27
      // 1be: ldc2_w 4036369110556135130
      // 1c1: lload 3
      // 1c2: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: iload 22
      // 1c9: ifeq 22c
      // 1cc: ifle 1eb
      // 1cf: goto 1dc
      // 1d2: ldc2_w 4556095645699594469
      // 1d5: lload 3
      // 1d6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: aload 27
      // 1de: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1e1: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1e4: istore 29
      // 1e6: goto 1eb
      // 1e9: astore 30
      // 1eb: iinc 29 1
      // 1ee: new java/lang/StringBuilder
      // 1f1: dup
      // 1f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f5: aload 28
      // 1f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fa: iload 29
      // 1fc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ff: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 202: astore 26
      // 204: aload 8
      // 206: aload 23
      // 208: lload 13
      // 20a: aload 26
      // 20c: bipush 3
      // 20d: anewarray 204
      // 210: dup_x1
      // 211: swap
      // 212: bipush 2
      // 213: swap
      // 214: aastore
      // 215: dup_x2
      // 216: dup_x2
      // 217: pop
      // 218: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21b: bipush 1
      // 21c: swap
      // 21d: aastore
      // 21e: dup_x1
      // 21f: swap
      // 220: bipush 0
      // 221: swap
      // 222: aastore
      // 223: ldc2_w 2436236955318964163
      // 226: lload 3
      // 227: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: ifne 1eb
      // 22f: aload 0
      // 230: aload 26
      // 232: lload 20
      // 234: bipush 2
      // 235: anewarray 204
      // 238: dup_x2
      // 239: dup_x2
      // 23a: pop
      // 23b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23e: bipush 1
      // 23f: swap
      // 240: aastore
      // 241: dup_x1
      // 242: swap
      // 243: bipush 0
      // 244: swap
      // 245: aastore
      // 246: ldc2_w 4505578523638258945
      // 249: lload 3
      // 24a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: aload 8
      // 251: aload 6
      // 253: aload 0
      // 254: aload 24
      // 256: lload 15
      // 258: bipush 4
      // 259: anewarray 204
      // 25c: dup_x2
      // 25d: dup_x2
      // 25e: pop
      // 25f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 262: bipush 3
      // 263: swap
      // 264: aastore
      // 265: dup_x1
      // 266: swap
      // 267: bipush 2
      // 268: swap
      // 269: aastore
      // 26a: dup_x1
      // 26b: swap
      // 26c: bipush 1
      // 26d: swap
      // 26e: aastore
      // 26f: dup_x1
      // 270: swap
      // 271: bipush 0
      // 272: swap
      // 273: aastore
      // 274: ldc2_w 4531810294333816411
      // 277: lload 3
      // 278: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: aload 7
      // 27f: aload 23
      // 281: aload 24
      // 283: aload 26
      // 285: iload 17
      // 287: iload 18
      // 289: i2b
      // 28a: iload 19
      // 28c: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 28f: pop
      // 290: return
   }

   ir(hz param1, mx param2, mx param3, h4[] param4, int param5, long param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ir.b J
      // 03: lload 6
      // 05: lxor
      // 06: lstore 6
      // 08: lload 6
      // 0a: dup2
      // 0b: ldc2_w 113068153924914
      // 0e: lxor
      // 0f: lstore 8
      // 11: pop2
      // 12: ldc2_w 5844229328152323422
      // 15: lload 6
      // 17: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 0
      // 1d: lload 8
      // 1f: aload 1
      // 20: aload 2
      // 21: aload 3
      // 22: aload 4
      // 24: iload 5
      // 26: invokespecial com/zelix/iz.<init> (JLcom/zelix/hz;Lcom/zelix/mx;Lcom/zelix/mx;[Lcom/zelix/h4;I)V
      // 29: istore 10
      // 2b: bipush 0
      // 2c: istore 11
      // 2e: iload 11
      // 30: aload 4
      // 32: arraylength
      // 33: if_icmpge 57
      // 36: aload 4
      // 38: iload 11
      // 3a: aaload
      // 3b: aload 0
      // 3c: bipush 1
      // 3d: anewarray 204
      // 40: dup_x1
      // 41: swap
      // 42: bipush 0
      // 43: swap
      // 44: aastore
      // 45: ldc2_w 5903840780467838567
      // 48: lload 6
      // 4a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: iinc 11 1
      // 52: iload 10
      // 54: ifeq 2e
      // 57: lload 6
      // 59: lconst_0
      // 5a: lcmp
      // 5b: ifle 52
      // 5e: return
   }

   public hz d(long var1) {
      return this.O();
   }

   public static String V(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/ir.b J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 124336183947968
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: ldc2_w 3068635996048202495
      // 025: lload 2
      // 026: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 6
      // 02d: aload 1
      // 02e: ldc "/"
      // 030: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 033: dup
      // 034: istore 8
      // 036: bipush -1
      // 037: if_icmpeq 04f
      // 03a: aload 1
      // 03b: iload 8
      // 03d: bipush 1
      // 03e: iadd
      // 03f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 042: astore 7
      // 044: lload 2
      // 045: lconst_0
      // 046: lcmp
      // 047: iflt 097
      // 04a: iload 6
      // 04c: ifne 052
      // 04f: aload 1
      // 050: astore 7
      // 052: aload 7
      // 054: lload 4
      // 056: sipush 19194
      // 059: ldc2_w 3139870671365574181
      // 05c: lload 2
      // 05d: lxor
      // 05e: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: sipush 30752
      // 066: ldc2_w 9080717220783799542
      // 069: lload 2
      // 06a: lxor
      // 06b: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: bipush 4
      // 071: anewarray 204
      // 074: dup_x1
      // 075: swap
      // 076: bipush 3
      // 077: swap
      // 078: aastore
      // 079: dup_x1
      // 07a: swap
      // 07b: bipush 2
      // 07c: swap
      // 07d: aastore
      // 07e: dup_x2
      // 07f: dup_x2
      // 080: pop
      // 081: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 084: bipush 1
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: ldc2_w 2963205755355790376
      // 08f: lload 2
      // 090: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: astore 7
      // 097: new java/lang/StringBuilder
      // 09a: dup
      // 09b: invokespecial java/lang/StringBuilder.<init> ()V
      // 09e: astore 9
      // 0a0: aload 7
      // 0a2: bipush 0
      // 0a3: invokevirtual java/lang/String.charAt (I)C
      // 0a6: ldc2_w 3480134258589783112
      // 0a9: lload 2
      // 0aa: invokedynamic t (CJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: istore 10
      // 0b1: iload 6
      // 0b3: lload 2
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: ifle 1af
      // 0b9: ifeq 1ad
      // 0bc: iload 10
      // 0be: sipush 3088
      // 0c1: ldc2_w 5734064028698064389
      // 0c4: lload 2
      // 0c5: lxor
      // 0c6: invokedynamic z (IJ)I bsm=com/zelix/ir.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: if_icmpeq 199
      // 0ce: goto 0db
      // 0d1: ldc2_w 3101184749919194326
      // 0d4: lload 2
      // 0d5: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: iload 10
      // 0dd: sipush 16157
      // 0e0: ldc2_w 4548792460248843533
      // 0e3: lload 2
      // 0e4: lxor
      // 0e5: invokedynamic z (IJ)I bsm=com/zelix/ir.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: iload 6
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 130
      // 0f2: ifeq 12e
      // 0f5: goto 102
      // 0f8: ldc2_w 3101184749919194326
      // 0fb: lload 2
      // 0fc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: if_icmpeq 199
      // 105: goto 112
      // 108: ldc2_w 3101184749919194326
      // 10b: lload 2
      // 10c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: iload 10
      // 114: sipush 1465
      // 117: ldc2_w 2604082683420360616
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic z (IJ)I bsm=com/zelix/ir.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: goto 12e
      // 124: ldc2_w 3101184749919194326
      // 127: lload 2
      // 128: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: iload 6
      // 130: lload 2
      // 131: lconst_0
      // 132: lcmp
      // 133: iflt 167
      // 136: ifeq 165
      // 139: if_icmpeq 199
      // 13c: goto 149
      // 13f: ldc2_w 3101184749919194326
      // 142: lload 2
      // 143: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: iload 10
      // 14b: sipush 11072
      // 14e: ldc2_w 7544325831194644819
      // 151: lload 2
      // 152: lxor
      // 153: invokedynamic z (IJ)I bsm=com/zelix/ir.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: goto 165
      // 15b: ldc2_w 3101184749919194326
      // 15e: lload 2
      // 15f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: iload 6
      // 167: ifeq 196
      // 16a: if_icmpeq 199
      // 16d: goto 17a
      // 170: ldc2_w 3101184749919194326
      // 173: lload 2
      // 174: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: iload 10
      // 17c: sipush 14958
      // 17f: ldc2_w 8504838550263562364
      // 182: lload 2
      // 183: lxor
      // 184: invokedynamic z (IJ)I bsm=com/zelix/ir.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: goto 196
      // 18c: ldc2_w 3101184749919194326
      // 18f: lload 2
      // 190: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: if_icmpne 1b2
      // 199: aload 9
      // 19b: sipush 27894
      // 19e: ldc2_w 6852021808369412133
      // 1a1: lload 2
      // 1a2: lxor
      // 1a3: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/ir.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ab: astore 9
      // 1ad: iload 6
      // 1af: ifne 1bb
      // 1b2: aload 9
      // 1b4: ldc "a"
      // 1b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b9: astore 9
      // 1bb: aload 9
      // 1bd: new java/lang/StringBuilder
      // 1c0: dup
      // 1c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c4: iload 10
      // 1c6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1c9: aload 7
      // 1cb: bipush 1
      // 1cc: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d8: pop
      // 1d9: aload 9
      // 1db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1de: areturn
   }

   public boolean u(Object[] param1) {
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
      // 0c: getstatic com/zelix/ir.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -2060790569228184820
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 0
      // 1c: getfield com/zelix/ir.w Lcom/zelix/mx;
      // 1f: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 22: astore 5
      // 24: istore 4
      // 26: aload 5
      // 28: invokevirtual java/lang/String.length ()I
      // 2b: iload 4
      // 2d: ifeq a1
      // 30: bipush 1
      // 31: if_icmpne a0
      // 34: goto 41
      // 37: ldc2_w -2091083296505527003
      // 3a: lload 2
      // 3b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 5
      // 43: bipush 0
      // 44: invokevirtual java/lang/String.charAt (I)C
      // 47: iload 4
      // 49: ifeq 9f
      // 4c: goto 59
      // 4f: ldc2_w -2091083296505527003
      // 52: lload 2
      // 53: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: lload 2
      // 5a: lconst_0
      // 5b: lcmp
      // 5c: ifle 93
      // 5f: lookupswitch 63 4 66 51 67 51 73 51 83 51
      // 88: ldc2_w -2091083296505527003
      // 8b: lload 2
      // 8c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: bipush 1
      // 93: ireturn
      // 94: ldc2_w -2091083296505527003
      // 97: lload 2
      // 98: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: bipush 0
      // 9f: ireturn
      // a0: bipush 0
      // a1: ireturn
   }

   static {
      long var11 = b ^ 40889716575536L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[12];
      int var18 = 0;
      String var17 = "]õT4þuSI\u007fBâ\bvµ\"jAç×Uàûæý\u0010\u0010\u0016dÐ&\u00814Rí¬¹\u000e\u0090ßx±\u0010×xXH\"ç¹\u0088ù\u0012vl§A\u008bË8áª¦$FÎ\u001c¦~Ð\u0017.*\u0099\u00ad©\u0093\fÍ±ø\u0087À\u0002\u008c©ÈëÔ´*\u0001Êv\u008fPÛlü\f6e\u000eR\u0081\n8w\u0002\u0094¿xÆ£é\u0016\u0010ÛÓ¨\u000bÂ\u0095'»ò\r\u0093Éâ\u001fÕ\u008f\u0010\u008exö\u0098p\u0004©\u0015\f\u0087\tØ^¬A\n(®.shF\u0094ÀP½\u0019(òxª#µ\bC~w»ûR6åÔ¸+\u0013\u0085Ï\u0004\u0017/ù\u0081¶4\u0006\u0006\u0010;\u0016¬~n FýKã\"zö\u009cæ\u0006\u0010CßÈzv\u000f¦<Ñ(Ð&ÚeYü\u0010U¨0¢\u0097%-X1@¨Â\u0002;Þ¼";
      int var19 = "]õT4þuSI\u007fBâ\bvµ\"jAç×Uàûæý\u0010\u0010\u0016dÐ&\u00814Rí¬¹\u000e\u0090ßx±\u0010×xXH\"ç¹\u0088ù\u0012vl§A\u008bË8áª¦$FÎ\u001c¦~Ð\u0017.*\u0099\u00ad©\u0093\fÍ±ø\u0087À\u0002\u008c©ÈëÔ´*\u0001Êv\u008fPÛlü\f6e\u000eR\u0081\n8w\u0002\u0094¿xÆ£é\u0016\u0010ÛÓ¨\u000bÂ\u0095'»ò\r\u0093Éâ\u001fÕ\u008f\u0010\u008exö\u0098p\u0004©\u0015\f\u0087\tØ^¬A\n(®.shF\u0094ÀP½\u0019(òxª#µ\bC~w»ûR6åÔ¸+\u0013\u0085Ï\u0004\u0017/ù\u0081¶4\u0006\u0006\u0010;\u0016¬~n FýKã\"zö\u009cæ\u0006\u0010CßÈzv\u000f¦<Ñ(Ð&ÚeYü\u0010U¨0¢\u0097%-X1@¨Â\u0002;Þ¼"
         .length();
      char var16 = 24;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     k = var20;
                     m = new String[12];
                     v = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "åÃN\r±vA\u009c]gj¤Uð¼\u00074^Ò\r[\rq·";
                     int var5 = "åÃN\r±vA\u009c]gj¤Uð¼\u00074^Ò\r[\rq·".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    t = var6;
                                    u = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "+íHîá\u0019¸\r®\u001d6©\u0080ß±Ý";
                                 var5 = "+íHîá\u0019¸\r®\u001d6©\u0080ß±Ý".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "\u000e{=í&I\u0080\u001cîÑÌ\u009e\u0004C(48tCu&%åÏ7\u0004ÝÃ\u0012\u00ad$\u0011$UÀ\u00822\u009cU£\u0085,ÍÕ\u0004MËk\u0006Ò\u008b7\u0006õ,\u0018WZ\u001c\u0007è\u0096\u008a\u0091º¶xB@4\u0010\u008f@";
                  var19 = "\u000e{=í&I\u0080\u001cîÑÌ\u009e\u0004C(48tCu&%åÏ7\u0004ÝÃ\u0012\u00ad$\u0011$UÀ\u00822\u009cU£\u0085,ÍÕ\u0004MËk\u0006Ò\u008b7\u0006õ,\u0018WZ\u001c\u0007è\u0096\u008a\u0091º¶xB@4\u0010\u008f@"
                     .length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25312;
      if (m[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])o.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ir", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         m[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return m[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ir" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7206;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ir", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ir" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
