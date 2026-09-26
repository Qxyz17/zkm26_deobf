package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lt8 extends l7t implements r5 {
   private ArrayList q;
   private ArrayList X;
   private static final long a = prr.a(-1811539657800774507L, -5308320496727089655L, MethodHandles.lookup().lookupClass()).a(208599716035168L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public void o(Object[] var1) {
      lyt var4 = (lyt)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      m44.a<"r">(this, -3345461630133653761L, var2).add(var4);
   }

   public lt8(int var1, short var2, char var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      int var7 = (int)((var5 ^ 71913746737955L) >>> 56);
      long var8 = (var5 ^ 71913746737955L) << 8 >>> 8;
      super((byte)var7, var1, var8);
      m44.a<"s">(this, new ArrayList(), 3723415119788906386L, var5);
      m44.a<"s">(this, new ArrayList(), 3878087278069271228L, var5);
   }

   public void M(Object[] var1) {
      lmu var2 = (lmu)var1[0];
      lqu var3 = (lqu)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 72911609181061L;
      long var8 = var4 ^ 88168710229609L;
      long var10 = var4 ^ 138058900796100L;
      long var12 = var4 ^ 113293458487398L;
      long var14 = var4 ^ 78419313187334L;
      long var16 = var4 ^ 0L;
      int var10000 = m44.a<"h">(-5113628074367501874L, var4);
      int var19 = m44.a<"w">(this, new Object[]{var14}, -4972914505230991179L, var4);
      int var20 = 0;
      int var18 = var10000;

      label34: {
         while (var20 < var19) {
            try {
               if (var4 > 0L) {
                  var23 = this.V(var20);
                  if (var18 == 0) {
                     break label34;
                  }

                  m44.a<"w">(var23, new Object[]{this, var3, var16}, -6656114929610942631L, var4);
                  var20++;
               }

               if (var18 != 0) {
                  continue;
               }
            } catch (n9 var21) {
               throw m44.a<"h">(var21, -5177868666801382267L, var4);
            }

            if (var4 >= 0L) {
               break;
            }
         }

         var23 = var2;
      }

      l7q var22 = (l7q)var23;
      m44.a<"w">(
         var22,
         new Object[]{m44.a<"v">(this, -6485481996440479085L, var4).toArray(new lyt[m44.a<"v">(this, -6485481996440479085L, var4).size()]), var8},
         -6606636839438654798L,
         var4
      );
      m44.a<"w">(
         var22,
         new Object[]{
            var12,
            new ir(
               m44.a<"v">(this, -6664357697843329091L, var4).size(),
               m44.a<"w">(this, new Object[]{var10}, -6787853481097809299L, var4),
               m44.a<"i">(this, new Object[]{var6}, -6844893272263847591L, var4)
            )
         },
         -4876827090073005414L,
         var4
      );
   }

   public void r(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      m44.a<"q">(this, -7803591736132978806L, var3).add(var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public String C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var10000 = m44.a<"m">(6425422016847383059L, var2);
      StringBuffer var5 = new StringBuffer();
      m44.a<"r">(var5, (char)b<"d">(8159, 1696013615749695289L ^ var2), 6680298979842306809L, var2);
      int var4 = var10000;

      label58: {
         try {
            if (var4 != 0) {
               return var5.toString();
            }

            if (m44.a<"s">(this, 6622029072933355480L, var2) == null) {
               break label58;
            }
         } catch (n9 var9) {
            throw m44.a<"m">(var9, 4630226264794686688L, var2);
         }

         int var6 = m44.a<"s">(this, 6622029072933355480L, var2).size();
         int var7 = 0;

         label52:
         while (var7 < var6) {
            String var8 = (String)m44.a<"s">(this, 6622029072933355480L, var2).get(var7);

            try {
               var5.append(var8);
               var7++;
            } catch (n9 var11) {
               boolean var10001 = false;
               throw m44.a<"m">(var11, 4630226264794686688L, var2);
            }

            while (true) {
               try {
                  var10000 = var4;
                  if (var2 > 0L) {
                     if (var4 != 0) {
                        return var5.toString();
                     }

                     var10000 = var4;
                  }

                  if (var10000 == 0) {
                     break;
                  }
               } catch (n9 var10) {
                  boolean var15 = false;
                  throw m44.a<"m">(var10, 4630226264794686688L, var2);
               }

               if (var2 >= 0L) {
                  break label52;
               }
            }
         }
      }

      m44.a<"r">(var5, (char)b<"d">(23982, 1756109104632087881L ^ var2), 6680298979842306809L, var2);
      return var5.toString();
   }

   public static String V(Object[] param0) {
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
      // 13: getstatic com/zelix/lt8.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -6013803289648681908
      // 1c: lload 2
      // 1d: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: new java/lang/StringBuilder
      // 25: dup
      // 26: invokespecial java/lang/StringBuilder.<init> ()V
      // 29: astore 5
      // 2b: istore 4
      // 2d: bipush 0
      // 2e: istore 7
      // 30: iload 7
      // 32: aload 1
      // 33: invokevirtual java/lang/String.length ()I
      // 36: if_icmpge f1
      // 39: aload 1
      // 3a: iload 4
      // 3c: lload 2
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: ifle 47
      // 42: ifeq f6
      // 45: iload 7
      // 47: invokevirtual java/lang/String.charAt (I)C
      // 4a: istore 6
      // 4c: iload 4
      // 4e: lload 2
      // 4f: lconst_0
      // 50: lcmp
      // 51: iflt a0
      // 54: ifeq 9e
      // 57: iload 6
      // 59: lookupswitch 123 2 36 37 91 80
      // 74: ldc2_w -5933896610603103993
      // 77: lload 2
      // 78: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 5
      // 80: sipush 7200
      // 83: ldc2_w 9028584717148796255
      // 86: lload 2
      // 87: lxor
      // 88: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: pop
      // 91: goto 9e
      // 94: ldc2_w -5933896610603103993
      // 97: lload 2
      // 98: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: iload 4
      // a0: lload 2
      // a1: lconst_0
      // a2: lcmp
      // a3: iflt ee
      // a6: ifne e9
      // a9: aload 5
      // ab: sipush 9582
      // ae: ldc2_w 8475150657690340375
      // b1: lload 2
      // b2: lxor
      // b3: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bb: pop
      // bc: iload 4
      // be: lload 2
      // bf: lconst_0
      // c0: lcmp
      // c1: ifle ee
      // c4: ifne e9
      // c7: goto d4
      // ca: ldc2_w -5933896610603103993
      // cd: lload 2
      // ce: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: athrow
      // d4: aload 5
      // d6: iload 6
      // d8: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // db: pop
      // dc: goto e9
      // df: ldc2_w -5933896610603103993
      // e2: lload 2
      // e3: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e8: athrow
      // e9: iinc 7 1
      // ec: iload 4
      // ee: ifne 30
      // f1: aload 5
      // f3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // f6: areturn
   }

   private Pattern I(Object[] param1) {
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
      // 00c: getstatic com/zelix/lt8.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 89924873659911
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w -9210744984878645014
      // 01e: lload 2
      // 01f: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: new java/lang/StringBuilder
      // 027: dup
      // 028: invokespecial java/lang/StringBuilder.<init> ()V
      // 02b: astore 7
      // 02d: aload 7
      // 02f: sipush 13967
      // 032: ldc2_w 7485598313870308179
      // 035: lload 2
      // 036: lxor
      // 037: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03f: pop
      // 040: aload 0
      // 041: ldc2_w -7302846714288947559
      // 044: lload 2
      // 045: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 04d: astore 8
      // 04f: istore 6
      // 051: aload 8
      // 053: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 058: ifeq 19a
      // 05b: aload 8
      // 05d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 062: checkcast java/lang/String
      // 065: astore 9
      // 067: aload 9
      // 069: iload 6
      // 06b: ifeq 1b8
      // 06e: ldc "*"
      // 070: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 073: lload 2
      // 074: lconst_0
      // 075: lcmp
      // 076: iflt 12f
      // 079: iload 6
      // 07b: ifeq 12f
      // 07e: goto 08b
      // 081: ldc2_w -9151066497980258911
      // 084: lload 2
      // 085: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: lload 2
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: iflt 122
      // 091: ifeq 11b
      // 094: goto 0a1
      // 097: ldc2_w -9151066497980258911
      // 09a: lload 2
      // 09b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: ldc2_w -7302846714288947559
      // 0a5: lload 2
      // 0a6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: invokevirtual java/util/ArrayList.size ()I
      // 0ae: lload 2
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: ifle 105
      // 0b4: bipush 1
      // 0b5: if_icmpne 0f0
      // 0b8: goto 0c5
      // 0bb: ldc2_w -9151066497980258911
      // 0be: lload 2
      // 0bf: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 7
      // 0c7: sipush 25732
      // 0ca: ldc2_w 1189976186505027929
      // 0cd: lload 2
      // 0ce: lxor
      // 0cf: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d7: pop
      // 0d8: iload 6
      // 0da: lload 2
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: ifle 197
      // 0e0: ifne 195
      // 0e3: goto 0f0
      // 0e6: ldc2_w -9151066497980258911
      // 0e9: lload 2
      // 0ea: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 7
      // 0f2: sipush 1558
      // 0f5: ldc2_w 2517433497364693964
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: pop
      // 103: iload 6
      // 105: lload 2
      // 106: lconst_0
      // 107: lcmp
      // 108: iflt 197
      // 10b: ifne 195
      // 10e: goto 11b
      // 111: ldc2_w -9151066497980258911
      // 114: lload 2
      // 115: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 9
      // 11d: ldc "?"
      // 11f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 122: goto 12f
      // 125: ldc2_w -9151066497980258911
      // 128: lload 2
      // 129: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: lload 2
      // 130: lconst_0
      // 131: lcmp
      // 132: iflt 14d
      // 135: ifeq 163
      // 138: aload 7
      // 13a: sipush 25205
      // 13d: ldc2_w 112697889553475499
      // 140: lload 2
      // 141: lxor
      // 142: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14a: pop
      // 14b: iload 6
      // 14d: lload 2
      // 14e: lconst_0
      // 14f: lcmp
      // 150: iflt 197
      // 153: ifne 195
      // 156: goto 163
      // 159: ldc2_w -9151066497980258911
      // 15c: lload 2
      // 15d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: aload 7
      // 165: aload 9
      // 167: lload 4
      // 169: bipush 2
      // 16a: anewarray 36
      // 16d: dup_x2
      // 16e: dup_x2
      // 16f: pop
      // 170: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 173: bipush 1
      // 174: swap
      // 175: aastore
      // 176: dup_x1
      // 177: swap
      // 178: bipush 0
      // 179: swap
      // 17a: aastore
      // 17b: ldc2_w -6993402928559933333
      // 17e: lload 2
      // 17f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 187: pop
      // 188: goto 195
      // 18b: ldc2_w -9151066497980258911
      // 18e: lload 2
      // 18f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: iload 6
      // 197: ifne 051
      // 19a: aload 7
      // 19c: sipush 4161
      // 19f: ldc2_w 8213438490952111513
      // 1a2: lload 2
      // 1a3: lxor
      // 1a4: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: pop
      // 1ad: aload 7
      // 1af: lload 2
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: iflt 062
      // 1b5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b8: ldc2_w -8940136938539684522
      // 1bb: lload 2
      // 1bc: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/regex/Pattern; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: areturn
   }

   static {
      long var11 = a ^ 90390738042934L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "\u009c\u0010ì\u009bðZ¨o\u009e||:£ýÃl\u0010'í2\u008e§&²áË´\u001a\u001cd\\^Ê0,Ë¥m\u001du¿÷1m\u0000*\u0001Yz\u0010àay\\ù±ªØ\u009f\u0080\\O0×\u0091õJýO\u0019\u008a\u0016çcíÓ\u0086âì°j\n\u0010\u0089\u0091m²UzL\u0019¯r§\u0085Ô\u009bXM\u0010\"\u000b3\u000eû\u0099ÛÞ\u0013P\"è\u000b±1¨";
      int var19 = "\u009c\u0010ì\u009bðZ¨o\u009e||:£ýÃl\u0010'í2\u008e§&²áË´\u001a\u001cd\\^Ê0,Ë¥m\u001du¿÷1m\u0000*\u0001Yz\u0010àay\\ù±ªØ\u009f\u0080\\O0×\u0091õJýO\u0019\u008a\u0016çcíÓ\u0086âì°j\n\u0010\u0089\u0091m²UzL\u0019¯r§\u0085Ô\u009bXM\u0010\"\u000b3\u000eû\u0099ÛÞ\u0013P\"è\u000b±1¨"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     d = new String[7];
                     h = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "®¶@å²\f\u009au\u008a,\u008bß\u001a\u009fõ\u0003";
                     int var5 = "®¶@å²\f\u009au\u008a,\u008bß\u001a\u009fõ\u0003".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
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
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     f = var6;
                     g = new Integer[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "\u001eÎ»ÎBnñÈ\u0089gõ¸¹KÎ\u00868'..´\u008a´|ÀäHÓ\u009e\u0094]\u0091¿ÿi7p\u009e\u0004\u0097\u008b'ÃµÝ*\u000b9ò¢\u0019µ$õÌõ÷.¦(½o\u0092ì\u0002\u000b©ÅåËû\u009an";
                  var19 = "\u001eÎ»ÎBnñÈ\u0089gõ¸¹KÎ\u00868'..´\u008a´|ÀäHÓ\u009e\u0094]\u0091¿ÿi7p\u009e\u0004\u0097\u008b'ÃµÝ*\u000b9ò¢\u0019µ$õÌõ÷.¦(½o\u0092ì\u0002\u000b©ÅåËû\u009an"
                     .length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2415;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/lt8", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/lt8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21781;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lt8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("com/zelix/lt8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
