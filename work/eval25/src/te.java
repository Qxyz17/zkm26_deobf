package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class te implements t7 {
   private List G;
   private int[] J;
   private be H;
   private static final long a = ess.a(5541722299806583206L, -1150862186364185556L, MethodHandles.lookup().lookupClass()).a(211045752631319L);

   private void c(Object[] param1) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/String
      // 01b: astore 5
      // 01d: pop
      // 01e: getstatic com/zelix/te.a J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 116773168559635
      // 029: lxor
      // 02a: dup2
      // 02b: bipush 32
      // 02d: lushr
      // 02e: lstore 6
      // 030: dup2
      // 031: bipush 32
      // 033: lshl
      // 034: bipush 32
      // 036: lushr
      // 037: l2i
      // 038: istore 8
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 17962304324565
      // 03f: lxor
      // 040: lstore 9
      // 042: pop2
      // 043: ldc2_w 7506561251999636584
      // 046: lload 3
      // 047: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: lload 6
      // 04e: aload 5
      // 050: iload 8
      // 052: bipush 3
      // 053: anewarray 224
      // 056: dup_x1
      // 057: swap
      // 058: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05b: bipush 2
      // 05c: swap
      // 05d: aastore
      // 05e: dup_x1
      // 05f: swap
      // 060: bipush 1
      // 061: swap
      // 062: aastore
      // 063: dup_x2
      // 064: dup_x2
      // 065: pop
      // 066: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 069: bipush 0
      // 06a: swap
      // 06b: aastore
      // 06c: ldc2_w 8073073384547055535
      // 06f: lload 3
      // 070: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: astore 12
      // 077: istore 11
      // 079: bipush 0
      // 07a: istore 13
      // 07c: iload 2
      // 07d: iload 11
      // 07f: ifne 0b6
      // 082: ifne 0b5
      // 085: goto 092
      // 088: ldc2_w 7606717543183770949
      // 08b: lload 3
      // 08c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: aload 0
      // 093: getfield com/zelix/te.G Ljava/util/List;
      // 096: new com/zelix/vi
      // 099: dup
      // 09a: iload 13
      // 09c: iinc 13 1
      // 09f: invokespecial com/zelix/vi.<init> (I)V
      // 0a2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a7: pop
      // 0a8: goto 0b5
      // 0ab: ldc2_w 7606717543183770949
      // 0ae: lload 3
      // 0af: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: bipush 0
      // 0b6: istore 14
      // 0b8: iload 14
      // 0ba: aload 12
      // 0bc: invokeinterface java/util/List.size ()I 1
      // 0c1: if_icmpge 179
      // 0c4: aload 12
      // 0c6: iload 14
      // 0c8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0cd: checkcast java/lang/String
      // 0d0: astore 15
      // 0d2: aload 15
      // 0d4: lload 9
      // 0d6: bipush 2
      // 0d7: anewarray 224
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 1
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w 7573712234815491189
      // 0eb: lload 3
      // 0ec: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: iload 11
      // 0f3: ifne 170
      // 0f6: ifeq 14e
      // 0f9: goto 106
      // 0fc: ldc2_w 7606717543183770949
      // 0ff: lload 3
      // 100: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: getfield com/zelix/te.G Ljava/util/List;
      // 10a: new com/zelix/vi
      // 10d: dup
      // 10e: iload 13
      // 110: iinc 13 1
      // 113: bipush 1
      // 114: bipush 0
      // 115: invokespecial com/zelix/vi.<init> (IZZ)V
      // 118: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 11d: pop
      // 11e: aload 0
      // 11f: getfield com/zelix/te.G Ljava/util/List;
      // 122: new com/zelix/vi
      // 125: dup
      // 126: iload 13
      // 128: iinc 13 1
      // 12b: bipush 0
      // 12c: bipush 1
      // 12d: invokespecial com/zelix/vi.<init> (IZZ)V
      // 130: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 135: pop
      // 136: iload 11
      // 138: lload 3
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 176
      // 13e: ifeq 171
      // 141: goto 14e
      // 144: ldc2_w 7606717543183770949
      // 147: lload 3
      // 148: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 0
      // 14f: getfield com/zelix/te.G Ljava/util/List;
      // 152: new com/zelix/vi
      // 155: dup
      // 156: iload 13
      // 158: iinc 13 1
      // 15b: invokespecial com/zelix/vi.<init> (I)V
      // 15e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 163: goto 170
      // 166: ldc2_w 7606717543183770949
      // 169: lload 3
      // 16a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: pop
      // 171: iinc 14 1
      // 174: iload 11
      // 176: ifeq 0b8
      // 179: return
   }

   public void B(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      boolean var10000 = x44.a<"v">(-8752790593375652115L, var3);
      int var6 = var2;
      boolean var5 = var10000;

      while (var6 < this.G.size()) {
         vi var7 = (vi)this.G.get(var6);
         x44.a<"n">(var7, new Object[0], -8822104730984347495L, var3);
         x44.a<"n">(var7, new Object[0], -9196686147499405985L, var3);
         var6++;
         if (!var5) {
            break;
         }
      }
   }

   public void q(Object[] var1) {
      long var3 = (Long)var1[0];
      be var2 = (be)var1[1];
      var3 = a ^ var3;
      x44.a<"v">(this, var2, 7368264592950388237L, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public vi T(long var1, int var3, int var4) {
      long var5 = (var1 << 32 | (long)var4 << 32 >>> 32) ^ a;
      boolean var7 = x44.a<"u">(512256780461683551L, var5);

      label33: {
         int var10000;
         label32: {
            try {
               var10000 = this.G.isEmpty();
               if (var7) {
                  break label32;
               }

               if (var10000 != 0) {
                  break label33;
               }
            } catch (gj var10) {
               throw x44.a<"u">(var10, 479407074244102770L, var5);
            }

            var10000 = var3;
         }

         try {
            if (var10000 <= this.G.size() - 1) {
               return (vi)this.G.get(var3);
            }
         } catch (gj var9) {
            boolean var10001 = false;
            throw x44.a<"u">(var9, 479407074244102770L, var5);
         }
      }

      try {
         return null;
      } catch (gj var8) {
         boolean var12 = false;
         throw x44.a<"u">(var8, 479407074244102770L, var5);
      }
   }

   public void M(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 6
      // 021: dup
      // 022: bipush 3
      // 023: aaload
      // 024: checkcast java/util/Random
      // 027: astore 3
      // 028: pop
      // 029: getstatic com/zelix/te.a J
      // 02c: lload 4
      // 02e: lxor
      // 02f: lstore 4
      // 031: lload 4
      // 033: dup2
      // 034: ldc2_w 75332017650695
      // 037: lxor
      // 038: lstore 7
      // 03a: pop2
      // 03b: ldc2_w 5692828004009213802
      // 03e: lload 4
      // 040: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: new java/util/ArrayList
      // 048: dup
      // 049: aload 0
      // 04a: getfield com/zelix/te.G Ljava/util/List;
      // 04d: invokeinterface java/util/List.size ()I 1
      // 052: invokespecial java/util/ArrayList.<init> (I)V
      // 055: astore 10
      // 057: istore 9
      // 059: iload 2
      // 05a: istore 11
      // 05c: iload 11
      // 05e: iload 6
      // 060: if_icmpge 1b4
      // 063: new java/util/ArrayList
      // 066: dup
      // 067: invokespecial java/util/ArrayList.<init> ()V
      // 06a: astore 12
      // 06c: aload 10
      // 06e: aload 12
      // 070: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 075: pop
      // 076: aload 0
      // 077: getfield com/zelix/te.G Ljava/util/List;
      // 07a: iload 11
      // 07c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 081: checkcast com/zelix/vi
      // 084: astore 13
      // 086: aload 12
      // 088: aload 13
      // 08a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 08f: pop
      // 090: lload 4
      // 092: lconst_0
      // 093: lcmp
      // 094: ifle 1dc
      // 097: iload 11
      // 099: iload 9
      // 09b: ifeq 1da
      // 09e: istore 14
      // 0a0: aload 13
      // 0a2: invokevirtual com/zelix/vi.F ()Z
      // 0a5: ifne 10e
      // 0a8: aload 13
      // 0aa: invokevirtual com/zelix/vi.Z ()Z
      // 0ad: iload 9
      // 0af: lload 4
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: ifle 12f
      // 0b6: ifeq 126
      // 0b9: iload 9
      // 0bb: ifeq 1aa
      // 0be: goto 0cc
      // 0c1: ldc2_w 6037995040492052254
      // 0c4: lload 4
      // 0c6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: lload 4
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 199
      // 0d3: ifeq 197
      // 0d6: goto 0e4
      // 0d9: ldc2_w 6037995040492052254
      // 0dc: lload 4
      // 0de: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: iload 14
      // 0e6: iload 6
      // 0e8: bipush 1
      // 0e9: isub
      // 0ea: iload 9
      // 0ec: ifeq 1a9
      // 0ef: goto 0fd
      // 0f2: ldc2_w 6037995040492052254
      // 0f5: lload 4
      // 0f7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: if_icmpge 197
      // 100: goto 10e
      // 103: ldc2_w 6037995040492052254
      // 106: lload 4
      // 108: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: aload 0
      // 10f: getfield com/zelix/te.G Ljava/util/List;
      // 112: iinc 14 1
      // 115: iload 14
      // 117: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11c: checkcast com/zelix/vi
      // 11f: astore 13
      // 121: aload 13
      // 123: invokevirtual com/zelix/vi.F ()Z
      // 126: lload 4
      // 128: lconst_0
      // 129: lcmp
      // 12a: ifle 194
      // 12d: iload 9
      // 12f: ifeq 191
      // 132: ifne 17a
      // 135: goto 143
      // 138: ldc2_w 6037995040492052254
      // 13b: lload 4
      // 13d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: aload 13
      // 145: invokevirtual com/zelix/vi.Z ()Z
      // 148: lload 4
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: iflt 1b1
      // 14f: iload 9
      // 151: ifeq 1aa
      // 154: goto 162
      // 157: ldc2_w 6037995040492052254
      // 15a: lload 4
      // 15c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: lload 4
      // 164: lconst_0
      // 165: lcmp
      // 166: iflt 199
      // 169: ifeq 197
      // 16c: goto 17a
      // 16f: ldc2_w 6037995040492052254
      // 172: lload 4
      // 174: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: aload 12
      // 17c: aload 13
      // 17e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 183: goto 191
      // 186: ldc2_w 6037995040492052254
      // 189: lload 4
      // 18b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: pop
      // 192: iload 9
      // 194: ifne 0a0
      // 197: iload 11
      // 199: aload 12
      // 19b: invokeinterface java/util/List.size ()I 1
      // 1a0: bipush 1
      // 1a1: lload 4
      // 1a3: lconst_0
      // 1a4: lcmp
      // 1a5: iflt 0ec
      // 1a8: isub
      // 1a9: iadd
      // 1aa: istore 11
      // 1ac: iinc 11 1
      // 1af: iload 9
      // 1b1: ifne 05c
      // 1b4: aload 10
      // 1b6: aload 3
      // 1b7: ldc2_w 6320212291771781357
      // 1ba: lload 4
      // 1bc: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: aload 0
      // 1c2: iload 6
      // 1c4: iload 2
      // 1c5: isub
      // 1c6: newarray 10
      // 1c8: ldc2_w 5982587593524510032
      // 1cb: lload 4
      // 1cd: invokedynamic r (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: lload 4
      // 1d4: lconst_0
      // 1d5: lcmp
      // 1d6: ifle 1dc
      // 1d9: iload 2
      // 1da: istore 11
      // 1dc: aload 10
      // 1de: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1e3: astore 12
      // 1e5: aload 12
      // 1e7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ec: ifeq 262
      // 1ef: aload 12
      // 1f1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f6: checkcast java/util/List
      // 1f9: astore 13
      // 1fb: iload 9
      // 1fd: ifeq 284
      // 200: aload 13
      // 202: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 207: astore 14
      // 209: aload 14
      // 20b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 210: ifeq 256
      // 213: aload 14
      // 215: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21a: checkcast com/zelix/vi
      // 21d: astore 15
      // 21f: aload 0
      // 220: ldc2_w 5982587593524510032
      // 223: lload 4
      // 225: invokedynamic m (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: iload 11
      // 22c: iload 2
      // 22d: isub
      // 22e: aload 15
      // 230: invokevirtual com/zelix/vi.H ()I
      // 233: iastore
      // 234: aload 0
      // 235: getfield com/zelix/te.G Ljava/util/List;
      // 238: iload 11
      // 23a: iinc 11 1
      // 23d: aload 15
      // 23f: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 244: pop
      // 245: iload 9
      // 247: ifeq 1e5
      // 24a: iload 9
      // 24c: lload 4
      // 24e: lconst_0
      // 24f: lcmp
      // 250: ifle 1fd
      // 253: ifne 209
      // 256: iload 9
      // 258: lload 4
      // 25a: lconst_0
      // 25b: lcmp
      // 25c: ifle 1ec
      // 25f: ifne 1e5
      // 262: aload 0
      // 263: lload 7
      // 265: bipush 1
      // 266: anewarray 224
      // 269: dup_x2
      // 26a: dup_x2
      // 26b: pop
      // 26c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26f: bipush 0
      // 270: swap
      // 271: aastore
      // 272: ldc2_w 6223091857671127938
      // 275: lload 4
      // 277: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: pop
      // 27d: lload 4
      // 27f: lconst_0
      // 280: lcmp
      // 281: iflt 284
      // 284: return
   }

   public te(long var1, boolean var3, String var4, int var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 126525520493284L;
      super();
      this.G = new ArrayList(var5);
      Object[] var10005 = new Object[]{null, var6, var4};
      var10005[0] = var3;
      x44.a<"m">(this, var10005, -1327305255420303392L, var1);
   }

   public vi B(Object[] param1) {
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
      // 0c: getstatic com/zelix/te.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -6132522740930994528
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/te.G Ljava/util/List;
      // 21: iload 4
      // 23: ifne 5b
      // 26: invokeinterface java/util/List.isEmpty ()Z 1
      // 2b: ifeq 47
      // 2e: goto 3b
      // 31: ldc2_w -6100068601134798963
      // 34: lload 2
      // 35: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: aconst_null
      // 3c: areturn
      // 3d: ldc2_w -6100068601134798963
      // 40: lload 2
      // 41: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/te.G Ljava/util/List;
      // 4b: aload 0
      // 4c: getfield com/zelix/te.G Ljava/util/List;
      // 4f: invokeinterface java/util/List.size ()I 1
      // 54: bipush 2
      // 55: isub
      // 56: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5b: checkcast com/zelix/vi
      // 5e: astore 5
      // 60: aload 5
      // 62: areturn
   }

   static boolean I(Object[] param0) {
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
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/te.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 1568541072662339968
      // 1c: lload 2
      // 1d: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: ldc "J"
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: iload 4
      // 2c: ifne 68
      // 2f: ifne 67
      // 32: goto 3f
      // 35: ldc2_w 1475007122767026349
      // 38: lload 2
      // 39: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 1
      // 40: ldc "D"
      // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45: iload 4
      // 47: ifne 6a
      // 4a: goto 57
      // 4d: ldc2_w 1475007122767026349
      // 50: lload 2
      // 51: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: ifeq 69
      // 5a: goto 67
      // 5d: ldc2_w 1475007122767026349
      // 60: lload 2
      // 61: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: bipush 1
      // 68: ireturn
      // 69: bipush 0
      // 6a: ireturn
   }

   te(be var1, int var2, char var3, int var4, int var5) {
      long var6 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 42919478615819L;
      long var10 = var6 ^ 101793419577992L;
      super();
      x44.a<"t">(this, var1, -6950438518783500345L, var6);
      this.G = new ArrayList(var4);
      String var12 = x44.a<"k">(this, -6950438518783500345L, var6).b().H();
      boolean var10001 = x44.a<"o">(x44.a<"k">(this, -6950438518783500345L, var6), new Object[]{var8}, -8715121491187836985L, var6);
      Object[] var10005 = new Object[]{null, var10, var12};
      var10005[0] = var10001;
      x44.a<"i">(this, var10005, -7063797743826724980L, var6);
   }

   public vi M(int param1, y4 param2, long param3, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 2861715107990410226
      // 003: lload 3
      // 004: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 009: istore 6
      // 00b: aload 0
      // 00c: getfield com/zelix/te.G Ljava/util/List;
      // 00f: invokeinterface java/util/List.size ()I 1
      // 014: iload 6
      // 016: lload 3
      // 017: lconst_0
      // 018: lcmp
      // 019: iflt 020
      // 01c: ifne 150
      // 01f: iload 1
      // 020: if_icmple 13a
      // 023: goto 030
      // 026: ldc2_w 2741019097787935455
      // 029: lload 3
      // 02a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: athrow
      // 030: aload 0
      // 031: getfield com/zelix/te.G Ljava/util/List;
      // 034: iload 1
      // 035: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 03a: checkcast com/zelix/vi
      // 03d: astore 7
      // 03f: iload 6
      // 041: lload 3
      // 042: lconst_0
      // 043: lcmp
      // 044: iflt 131
      // 047: ifne 12f
      // 04a: aload 2
      // 04b: invokevirtual com/zelix/y4.U ()Z
      // 04e: ifeq 104
      // 051: goto 05e
      // 054: ldc2_w 2741019097787935455
      // 057: lload 3
      // 058: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 7
      // 060: bipush 0
      // 061: anewarray 224
      // 064: ldc2_w 4330403695420141849
      // 067: lload 3
      // 068: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 7
      // 06f: iload 6
      // 071: ifne 0eb
      // 074: goto 081
      // 077: ldc2_w 2741019097787935455
      // 07a: lload 3
      // 07b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: invokevirtual com/zelix/vi.F ()V
      // 084: aload 0
      // 085: getfield com/zelix/te.G Ljava/util/List;
      // 088: invokeinterface java/util/List.size ()I 1
      // 08d: iload 1
      // 08e: bipush 1
      // 08f: iadd
      // 090: if_icmple 0d0
      // 093: goto 0a0
      // 096: ldc2_w 2741019097787935455
      // 099: lload 3
      // 09a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield com/zelix/te.G Ljava/util/List;
      // 0a4: iload 1
      // 0a5: bipush 1
      // 0a6: iadd
      // 0a7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ac: checkcast com/zelix/vi
      // 0af: astore 8
      // 0b1: aload 8
      // 0b3: bipush 0
      // 0b4: anewarray 224
      // 0b7: ldc2_w 4168072549489849567
      // 0ba: lload 3
      // 0bb: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: aload 8
      // 0c2: invokevirtual com/zelix/vi.K ()V
      // 0c5: iload 6
      // 0c7: lload 3
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: iflt 101
      // 0cd: ifeq 0f9
      // 0d0: new com/zelix/vi
      // 0d3: dup
      // 0d4: iload 1
      // 0d5: bipush 1
      // 0d6: iadd
      // 0d7: bipush 0
      // 0d8: bipush 1
      // 0d9: iload 5
      // 0db: invokespecial com/zelix/vi.<init> (IZZI)V
      // 0de: goto 0eb
      // 0e1: ldc2_w 2741019097787935455
      // 0e4: lload 3
      // 0e5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: astore 8
      // 0ed: aload 0
      // 0ee: getfield com/zelix/te.G Ljava/util/List;
      // 0f1: aload 8
      // 0f3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f8: pop
      // 0f9: lload 3
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: iflt 122
      // 0ff: iload 6
      // 101: ifeq 1ef
      // 104: aload 7
      // 106: bipush 0
      // 107: anewarray 224
      // 10a: ldc2_w 4168072549489849567
      // 10d: lload 3
      // 10e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: aload 7
      // 115: bipush 0
      // 116: anewarray 224
      // 119: ldc2_w 4330403695420141849
      // 11c: lload 3
      // 11d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: goto 12f
      // 125: ldc2_w 2741019097787935455
      // 128: lload 3
      // 129: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: iload 6
      // 131: lload 3
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 143
      // 137: ifeq 1ef
      // 13a: aload 0
      // 13b: getfield com/zelix/te.G Ljava/util/List;
      // 13e: invokeinterface java/util/List.size ()I 1
      // 143: goto 150
      // 146: ldc2_w 2741019097787935455
      // 149: lload 3
      // 14a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: istore 8
      // 152: iload 8
      // 154: iload 1
      // 155: if_icmpge 197
      // 158: new com/zelix/vi
      // 15b: dup
      // 15c: iload 8
      // 15e: iload 5
      // 160: invokespecial com/zelix/vi.<init> (II)V
      // 163: lload 3
      // 164: lconst_0
      // 165: lcmp
      // 166: ifle 1e1
      // 169: astore 9
      // 16b: aload 0
      // 16c: getfield com/zelix/te.G Ljava/util/List;
      // 16f: aload 9
      // 171: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 176: pop
      // 177: iinc 8 1
      // 17a: iload 6
      // 17c: ifne 1d7
      // 17f: iload 6
      // 181: ifeq 152
      // 184: lload 3
      // 185: lconst_0
      // 186: lcmp
      // 187: iflt 17a
      // 18a: goto 197
      // 18d: ldc2_w 2741019097787935455
      // 190: lload 3
      // 191: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: aload 2
      // 198: invokevirtual com/zelix/y4.U ()Z
      // 19b: ifeq 1d7
      // 19e: new com/zelix/vi
      // 1a1: dup
      // 1a2: iload 1
      // 1a3: bipush 1
      // 1a4: bipush 0
      // 1a5: iload 5
      // 1a7: invokespecial com/zelix/vi.<init> (IZZI)V
      // 1aa: astore 7
      // 1ac: aload 0
      // 1ad: getfield com/zelix/te.G Ljava/util/List;
      // 1b0: aload 7
      // 1b2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1b7: pop
      // 1b8: new com/zelix/vi
      // 1bb: dup
      // 1bc: iload 1
      // 1bd: bipush 1
      // 1be: iadd
      // 1bf: bipush 0
      // 1c0: bipush 1
      // 1c1: iload 5
      // 1c3: invokespecial com/zelix/vi.<init> (IZZI)V
      // 1c6: astore 8
      // 1c8: aload 0
      // 1c9: getfield com/zelix/te.G Ljava/util/List;
      // 1cc: aload 8
      // 1ce: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d3: pop
      // 1d4: goto 1ef
      // 1d7: new com/zelix/vi
      // 1da: dup
      // 1db: iload 1
      // 1dc: iload 5
      // 1de: invokespecial com/zelix/vi.<init> (II)V
      // 1e1: astore 7
      // 1e3: aload 0
      // 1e4: getfield com/zelix/te.G Ljava/util/List;
      // 1e7: aload 7
      // 1e9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ee: pop
      // 1ef: aload 7
      // 1f1: areturn
   }

   public int y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var10000 = x44.a<"s">(1174874543709103113L, var2);
      int var5 = 0;
      byte var4 = (byte)var10000;
      int var6 = 0;

      label34:
      while (var6 < this.G.size()) {
         vi var7 = (vi)this.G.get(var6);

         do {
            try {
               var10000 = var7.B(var5);
               if (var2 >= 0L) {
                  if (var4 != 0) {
                     return var10000;
                  }

                  var5++;
                  var6++;
                  var10000 = var4;
               }

               if (var10000 == 0) {
                  continue label34;
               }
            } catch (gj var8) {
               throw x44.a<"s">(var8, 1292861634355338532L, var2);
            }
         } while (var2 <= 0L);
         break;
      }

      return ((vi)this.G.get(this.G.size() - 1)).H();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void W(Object[] var1) {
      int var5 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      int var4 = (Integer)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 106468689643679L;
      int var9 = this.G.size();
      boolean var10000 = x44.a<"q">(-4928951478043374606L, var2);
      int var10 = var9 - var5;
      boolean var8 = var10000;

      try {
         if (var10 == 0) {
            return;
         }
      } catch (gj var17) {
         throw x44.a<"q">(var17, -6389657716589941882L, var2);
      }

      ArrayList var12 = new ArrayList(var5);
      int var13 = var10;

      label48:
      while (var13 < var9) {
         vi var14 = (vi)this.G.remove(var10);

         try {
            var12.add(var14);
            var13++;
         } catch (gj var16) {
            boolean var10001 = false;
            throw x44.a<"q">(var16, -6389657716589941882L, var2);
         }

         while (true) {
            try {
               var10000 = var8;
               if (var2 >= 0L) {
                  if (!var8) {
                     return;
                  }

                  var10000 = var8;
               }

               if (var10000) {
                  break;
               }
            } catch (gj var15) {
               boolean var21 = false;
               throw x44.a<"q">(var15, -6389657716589941882L, var2);
            }

            if (var2 >= 0L) {
               break label48;
            }
         }
      }

      x44.a<"i">(this.G, var4, var12, -5040767985051494295L, var2);
      x44.a<"i">(this, new Object[]{var6}, -6717970673486596326L, var2);
   }

   public vi k(Object[] var1) {
      int var6;
      vi var8;
      long var10;
      label16: {
         var6 = (Integer)var1[0];
         boolean var5 = (Boolean)var1[1];
         long var2 = (Long)var1[2];
         int var4 = (Integer)var1[3];
         var10 = a ^ var2;
         boolean var7 = x44.a<"q">(5557315533115586907L, var10);
         if (var5) {
            vi var9 = new vi(var6 + 1, false, true, var4);
            x44.a<"i">(this.G, var6, var9, 6278247753864164645L, var10);
            var8 = new vi(var6, true, false, var4);
            x44.a<"i">(this.G, var6, var8, 6278247753864164645L, var10);
            if (var10 <= 0L) {
               break label16;
            }

            if (!var7) {
               return var8;
            }
         }

         var8 = new vi(var6, var4);
      }

      x44.a<"i">(this.G, var6, var8, 6278247753864164645L, var10);
      return var8;
   }

   public int[] z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -7760528031946163685L, var2);
   }

   public int x(Object[] var1) {
      return this.G.size();
   }

   public int D(Object[] param1) {
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
      // 0c: getstatic com/zelix/te.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -2838484501401965345
      // 15: lload 2
      // 16: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/te.G Ljava/util/List;
      // 21: invokeinterface java/util/List.isEmpty ()Z 1
      // 26: iload 4
      // 28: ifne 61
      // 2b: ifeq 47
      // 2e: goto 3b
      // 31: ldc2_w -2799135049311660558
      // 34: lload 2
      // 35: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: bipush -1
      // 3c: ireturn
      // 3d: ldc2_w -2799135049311660558
      // 40: lload 2
      // 41: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/te.G Ljava/util/List;
      // 4b: aload 0
      // 4c: getfield com/zelix/te.G Ljava/util/List;
      // 4f: invokeinterface java/util/List.size ()I 1
      // 54: bipush 1
      // 55: isub
      // 56: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5b: checkcast com/zelix/vi
      // 5e: invokevirtual com/zelix/vi.H ()I
      // 61: ireturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
