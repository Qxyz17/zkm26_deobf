package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l6l implements lkp, loz {
   boolean K;
   int d;
   ah T;
   boolean V;
   String f;
   Vector B;
   String n;
   private static final long a = prr.a(-7981155399138311853L, 4978019281893796045L, MethodHandles.lookup().lookupClass()).a(25101892697505L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   String R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 23929811745698L;
      long var6 = var2 ^ 109091214595441L;
      long var8 = var2 ^ 130702038153943L;
      m44.a<"t">(this, true, -4645228595841153093L, var2);
      String var10000 = m44.a<"h">(-4758673588903241085L, var2);
      StringTokenizer var11 = new StringTokenizer(m44.a<"v">(this, -4614349116668806886L, var2), a<"x">(19674, 5046674357276802874L ^ var2));
      String var10 = var10000;
      m44.a<"t">(this, var11.nextToken().trim(), -6736004148776549242L, var2);
      String var12 = var11.nextToken();
      StringTokenizer var13 = new StringTokenizer(var12, ",");

      while (var13.hasMoreTokens()) {
         String var14 = var13.nextToken();
         ge var15 = new ge(var8, m44.a<"v">(this, -6406720732186742875L, var2), var14);
         String var16 = m44.a<"w">(var15, new Object[]{var6}, -6492951337011728990L, var2);

         try {
            if (var10 == null) {
               return var16;
            }

            if (var16 != null) {
               return var16;
            }
         } catch (n9 var18) {
            throw m44.a<"h">(var18, -6411867643237234122L, var2);
         }

         label38: {
            try {
               if (var2 < 0L) {
                  break label38;
               }

               if (m44.a<"w">(var15, new Object[]{var4}, -4746315781882060988L, var2)) {
                  return a<"x">(27789, 5170977695940206447L ^ var2) + m44.a<"v">(this, -4614349116668806886L, var2) + "'";
               }
            } catch (n9 var17) {
               throw m44.a<"h">(var17, -6411867643237234122L, var2);
            }

            m44.a<"v">(this, -5024996073940293005L, var2).addElement(var15);
         }

         if (var10 == null) {
            break;
         }
      }

      return null;
   }

   public boolean k(Object[] param1) {
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
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: pop
      // 017: lload 2
      // 018: dup2
      // 019: ldc2_w 101747208547237
      // 01c: lxor
      // 01d: lstore 5
      // 01f: dup2
      // 020: ldc2_w 0
      // 023: lxor
      // 024: lstore 7
      // 026: pop2
      // 027: ldc2_w 4022236455885607079
      // 02a: lload 2
      // 02b: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: astore 9
      // 032: aload 0
      // 033: ldc2_w 3596708360978155447
      // 036: lload 2
      // 037: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 9
      // 03e: ifnull 05e
      // 041: ifeq 05d
      // 044: goto 051
      // 047: ldc2_w 3251714870161539090
      // 04a: lload 2
      // 04b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: bipush 1
      // 052: ireturn
      // 053: ldc2_w 3251714870161539090
      // 056: lload 2
      // 057: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: bipush 0
      // 05e: istore 10
      // 060: iload 10
      // 062: aload 0
      // 063: ldc2_w 3487951711805235287
      // 066: lload 2
      // 067: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: invokevirtual java/util/Vector.size ()I
      // 06f: if_icmpge 0eb
      // 072: aload 0
      // 073: ldc2_w 3487951711805235287
      // 076: lload 2
      // 077: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: iload 10
      // 07e: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 081: checkcast com/zelix/ge
      // 084: astore 11
      // 086: aload 9
      // 088: lload 2
      // 089: lconst_0
      // 08a: lcmp
      // 08b: iflt 0e8
      // 08e: ifnull 0e6
      // 091: aload 11
      // 093: iload 4
      // 095: lload 7
      // 097: bipush 2
      // 098: anewarray 164
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 1
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w 3228131113560907707
      // 0af: lload 2
      // 0b0: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 9
      // 0b7: ifnull 0f2
      // 0ba: goto 0c7
      // 0bd: ldc2_w 3251714870161539090
      // 0c0: lload 2
      // 0c1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: ifne 0e3
      // 0ca: goto 0d7
      // 0cd: ldc2_w 3251714870161539090
      // 0d0: lload 2
      // 0d1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: bipush 0
      // 0d8: ireturn
      // 0d9: ldc2_w 3251714870161539090
      // 0dc: lload 2
      // 0dd: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: iinc 10 1
      // 0e6: aload 9
      // 0e8: ifnonnull 060
      // 0eb: lload 2
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: iflt 0f4
      // 0f1: bipush 0
      // 0f2: istore 10
      // 0f4: iload 10
      // 0f6: aload 0
      // 0f7: ldc2_w 3487951711805235287
      // 0fa: lload 2
      // 0fb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/util/Vector.size ()I
      // 103: if_icmpge 1dc
      // 106: aload 0
      // 107: ldc2_w 3487951711805235287
      // 10a: lload 2
      // 10b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: iload 10
      // 112: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 115: checkcast com/zelix/ge
      // 118: astore 11
      // 11a: aload 11
      // 11c: lload 5
      // 11e: bipush 1
      // 11f: anewarray 164
      // 122: dup_x2
      // 123: dup_x2
      // 124: pop
      // 125: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: ldc2_w 3056898500546101611
      // 12e: lload 2
      // 12f: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: istore 12
      // 136: aload 0
      // 137: aload 9
      // 139: ifnull 1b6
      // 13c: ldc2_w 2927611069974072994
      // 13f: lload 2
      // 140: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: sipush 15194
      // 148: ldc2_w 5868003637951824536
      // 14b: lload 2
      // 14c: lxor
      // 14d: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/l6l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 155: aload 9
      // 157: ifnull 1ee
      // 15a: goto 167
      // 15d: ldc2_w 3251714870161539090
      // 160: lload 2
      // 161: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: ifeq 1a8
      // 16a: goto 177
      // 16d: ldc2_w 3251714870161539090
      // 170: lload 2
      // 171: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: aload 0
      // 178: iload 12
      // 17a: aload 0
      // 17b: ldc2_w 3532240628533420404
      // 17e: lload 2
      // 17f: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: invokestatic java/lang/Math.max (II)I
      // 187: ldc2_w 3532240628533420404
      // 18a: lload 2
      // 18b: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: aload 9
      // 192: lload 2
      // 193: lconst_0
      // 194: lcmp
      // 195: iflt 1d9
      // 198: ifnonnull 1d4
      // 19b: goto 1a8
      // 19e: ldc2_w 3251714870161539090
      // 1a1: lload 2
      // 1a2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: goto 1b6
      // 1ac: ldc2_w 3251714870161539090
      // 1af: lload 2
      // 1b0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: iload 12
      // 1b8: aload 0
      // 1b9: ldc2_w 3532240628533420404
      // 1bc: lload 2
      // 1bd: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: ldc2_w 4031916484594780875
      // 1c5: lload 2
      // 1c6: invokedynamic l (IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: ldc2_w 3532240628533420404
      // 1ce: lload 2
      // 1cf: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: iinc 10 1
      // 1d7: aload 9
      // 1d9: ifnonnull 0f4
      // 1dc: aload 0
      // 1dd: lload 2
      // 1de: lconst_0
      // 1df: lcmp
      // 1e0: iflt 115
      // 1e3: bipush 1
      // 1e4: ldc2_w 3596708360978155447
      // 1e7: lload 2
      // 1e8: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: bipush 1
      // 1ee: ireturn
   }

   public int u(Object[] var1) {
      long var2 = (Long)var1[0];
      return m44.a<"w">(this, -2693057285620036911L, var2);
   }

   public boolean t(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public boolean P(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public boolean m(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   static boolean Y(Object[] param0) {
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
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 1
      // 12: pop
      // 13: getstatic com/zelix/l6l.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w 5140208531778134051
      // 1c: lload 1
      // 1d: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 3
      // 25: sipush 19793
      // 28: ldc2_w 6822832723776209936
      // 2b: lload 1
      // 2c: lxor
      // 2d: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/l6l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 35: aload 4
      // 37: ifnull 8f
      // 3a: ifne 7d
      // 3d: goto 4a
      // 40: ldc2_w 6747522128401461398
      // 43: lload 1
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 3
      // 4b: sipush 12005
      // 4e: ldc2_w 6384866223081842598
      // 51: lload 1
      // 52: lxor
      // 53: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/l6l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 5b: aload 4
      // 5d: ifnull fa
      // 60: goto 6d
      // 63: ldc2_w 6747522128401461398
      // 66: lload 1
      // 67: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: ifeq f9
      // 70: goto 7d
      // 73: ldc2_w 6747522128401461398
      // 76: lload 1
      // 77: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 3
      // 7e: bipush 3
      // 7f: invokevirtual java/lang/String.charAt (I)C
      // 82: goto 8f
      // 85: ldc2_w 6747522128401461398
      // 88: lload 1
      // 89: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: istore 5
      // 91: iload 5
      // 93: aload 4
      // 95: ifnull f4
      // 98: sipush 12871
      // 9b: ldc2_w 3708015030379262970
      // 9e: lload 1
      // 9f: lxor
      // a0: invokedynamic s (IJ)I bsm=com/zelix/l6l.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: if_icmpeq e6
      // a8: goto b5
      // ab: ldc2_w 6747522128401461398
      // ae: lload 1
      // af: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: iload 5
      // b7: aload 4
      // b9: ifnull f4
      // bc: goto c9
      // bf: ldc2_w 6747522128401461398
      // c2: lload 1
      // c3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: athrow
      // c9: sipush 4359
      // cc: ldc2_w 4847905495819555001
      // cf: lload 1
      // d0: lxor
      // d1: invokedynamic s (IJ)I bsm=com/zelix/l6l.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: if_icmpne f7
      // d9: goto e6
      // dc: ldc2_w 6747522128401461398
      // df: lload 1
      // e0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e5: athrow
      // e6: bipush 1
      // e7: goto f4
      // ea: ldc2_w 6747522128401461398
      // ed: lload 1
      // ee: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f3: athrow
      // f4: goto f8
      // f7: bipush 0
      // f8: ireturn
      // f9: bipush 0
      // fa: ireturn
   }

   public void b(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      m44.a<"q">(this, false, -6241015486444642498L, var2);
      String var10000 = m44.a<"m">(-5811687548070229970L, var2);
      int var7 = 0;
      String var6 = var10000;

      while (var7 < m44.a<"s">(this, -6273839927161816866L, var2).size()) {
         ge var8 = (ge)m44.a<"s">(this, -6273839927161816866L, var2).elementAt(var7);
         m44.a<"r">(var8, new Object[]{var4}, -6068437429200211664L, var2);
         var7++;
         if (var6 == null) {
            break;
         }
      }
   }

   l6l(long var1, ah var3, String var4) {
      var1 = a ^ var1;
      super();
      m44.a<"s">(this, new Vector(), -5299440393845643708L, var1);
      m44.a<"s">(this, var3, -6115331066764467310L, var1);
      m44.a<"s">(this, var4.trim(), -5493913984888834771L, var1);
   }

   public String v(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 128961840649805
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 22359260858332
      // 018: lxor
      // 019: lstore 6
      // 01b: pop2
      // 01c: ldc2_w -6303728162048339982
      // 01f: lload 2
      // 020: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: aload 0
      // 026: lload 6
      // 028: bipush 1
      // 029: anewarray 164
      // 02c: dup_x2
      // 02d: dup_x2
      // 02e: pop
      // 02f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 032: bipush 0
      // 033: swap
      // 034: aastore
      // 035: ldc2_w -5700443140472370347
      // 038: lload 2
      // 039: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: astore 8
      // 040: aconst_null
      // 041: astore 9
      // 043: aload 0
      // 044: aload 8
      // 046: ifnull 070
      // 049: ldc2_w -6126665690377170230
      // 04c: lload 2
      // 04d: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: ifne 08a
      // 055: goto 062
      // 058: ldc2_w -5587529601860624569
      // 05b: lload 2
      // 05c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 0
      // 063: goto 070
      // 066: ldc2_w -5587529601860624569
      // 069: lload 2
      // 06a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: lload 4
      // 072: bipush 1
      // 073: anewarray 164
      // 076: dup_x2
      // 077: dup_x2
      // 078: pop
      // 079: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07c: bipush 0
      // 07d: swap
      // 07e: aastore
      // 07f: ldc2_w -5448020284140015113
      // 082: lload 2
      // 083: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: astore 9
      // 08a: aload 9
      // 08c: aload 8
      // 08e: lload 2
      // 08f: lconst_0
      // 090: lcmp
      // 091: ifle 0e3
      // 094: ifnull 0d0
      // 097: ifnull 0b4
      // 09a: goto 0a7
      // 09d: ldc2_w -5587529601860624569
      // 0a0: lload 2
      // 0a1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 9
      // 0a9: areturn
      // 0aa: ldc2_w -5587529601860624569
      // 0ad: lload 2
      // 0ae: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: aload 8
      // 0b7: ifnull 120
      // 0ba: ldc2_w -5191096907974979081
      // 0bd: lload 2
      // 0be: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: goto 0d0
      // 0c6: ldc2_w -5587529601860624569
      // 0c9: lload 2
      // 0ca: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: lload 2
      // 0d1: lconst_0
      // 0d2: lcmp
      // 0d3: ifle 102
      // 0d6: sipush 15194
      // 0d9: ldc2_w 5867948609057201613
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/l6l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e6: ifeq 112
      // 0e9: aload 0
      // 0ea: sipush 10423
      // 0ed: ldc2_w 5355095207605159641
      // 0f0: lload 2
      // 0f1: lxor
      // 0f2: invokedynamic s (IJ)I bsm=com/zelix/l6l.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: ldc2_w -5886072498928976351
      // 0fa: lload 2
      // 0fb: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: aload 8
      // 102: ifnonnull 136
      // 105: goto 112
      // 108: ldc2_w -5587529601860624569
      // 10b: lload 2
      // 10c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: aload 0
      // 113: goto 120
      // 116: ldc2_w -5587529601860624569
      // 119: lload 2
      // 11a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: sipush 14098
      // 123: ldc2_w 8526288436994922879
      // 126: lload 2
      // 127: lxor
      // 128: invokedynamic s (IJ)I bsm=com/zelix/l6l.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: ldc2_w -5886072498928976351
      // 130: lload 2
      // 131: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: aconst_null
      // 137: areturn
   }

   public boolean s(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   static {
      long var11 = a ^ 104320202645965L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "&\u0004üÂ\u0011#ÄÝ)ï-\u001f©ÛòI¥\u008eîy±_£Ô!\u0093VÇq#ôå\\\u0019}±\u0099ñ¯D\n\u007fF\u000b3§¨\u008bÂÀ\u001aéDùÿ\u007fô§üeTÌ7@o4ÙÅÔör^3Rl\u00918d¬¹\t\u009bX1°*b\nsû·\u009c\u0092Ì<Ïó\u0086<ª9\\åN\u0091]£-Qé¨ \u00105z¦\u0082DÓÑ\u0088`W\u0006Ý\u008aWáÒ\u0010i\u0012\u001f\u001fCñ\u009bïÏÖÇÂ\u0090\u0091\u001dù";
      int var19 = "&\u0004üÂ\u0011#ÄÝ)ï-\u001f©ÛòI¥\u008eîy±_£Ô!\u0093VÇq#ôå\\\u0019}±\u0099ñ¯D\n\u007fF\u000b3§¨\u008bÂÀ\u001aéDùÿ\u007fô§üeTÌ7@o4ÙÅÔör^3Rl\u00918d¬¹\t\u009bX1°*b\nsû·\u009c\u0092Ì<Ïó\u0086<ª9\\åN\u0091]£-Qé¨ \u00105z¦\u0082DÓÑ\u0088`W\u0006Ý\u008aWáÒ\u0010i\u0012\u001f\u001fCñ\u009bïÏÖÇÂ\u0090\u0091\u001dù"
         .length();
      char var16 = 'p';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[5];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "|\u0001xÊ\u0087\u0013Øµ·\u0081[JY\u0011\u001aÒ";
                     int var5 = "|\u0001xÊ\u0087\u0013Øµ·\u0081[JY\u0011\u001aÒ".length();
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
                                    g = var6;
                                    h = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = " &OÎÓ\u0003\u0082\u0017ïS\u009d\ta\u0004º\r";
                                 var5 = " &OÎÓ\u0003\u0082\u0017ïS\u009d\ta\u0004º\r".length();
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

                  var17 = "f+\u009bô\u00ad\u009e\u0012\u0007¾í@¡\u0096\u0003\u0001Ö\u0010hï·A\u008fHòRé\u001d\u0089\u001b@¦\\@";
                  var19 = "f+\u009bô\u00ad\u009e\u0012\u0007¾í@¡\u0096\u0003\u0001Ö\u0010hï·A\u008fHòRé\u001d\u0089\u001b@¦\\@".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6157;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/l6l", var10);
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
         throw new RuntimeException("com/zelix/l6l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20720;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/l6l", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/l6l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
