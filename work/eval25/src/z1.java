package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class z1 extends jf {
   int g;
   ArrayList U;
   static final Map b;
   private static final long a = ess.a(-7237266132483182087L, -7936423405181278557L, MethodHandles.lookup().lookupClass()).a(137128171016435L);

   void k(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"n">(this, 5213051036632640921L, var3).add(var2);
   }

   public String J(Object[] param1) {
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
      // 00c: getstatic com/zelix/z1.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w -7066008013602833330
      // 015: lload 2
      // 016: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: new java/lang/StringBuffer
      // 01e: dup
      // 01f: invokespecial java/lang/StringBuffer.<init> ()V
      // 022: astore 5
      // 024: astore 4
      // 026: aload 0
      // 027: ldc2_w -6994598974869095633
      // 02a: lload 2
      // 02b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: invokevirtual java/util/ArrayList.size ()I
      // 033: istore 6
      // 035: iload 6
      // 037: aload 4
      // 039: ifnonnull 04d
      // 03c: ifeq 1b9
      // 03f: goto 04c
      // 042: ldc2_w -7434787352562657279
      // 045: lload 2
      // 046: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: bipush 0
      // 04d: istore 7
      // 04f: iload 7
      // 051: aload 0
      // 052: ldc2_w -9220337002058884907
      // 055: lload 2
      // 056: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: if_icmpge 08c
      // 05e: aload 5
      // 060: ldc "["
      // 062: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 065: pop
      // 066: iinc 7 1
      // 069: aload 4
      // 06b: lload 2
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: iflt 076
      // 071: ifnonnull 12d
      // 074: aload 4
      // 076: ifnull 04f
      // 079: lload 2
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 069
      // 07f: goto 08c
      // 082: ldc2_w -7434787352562657279
      // 085: lload 2
      // 086: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: iload 6
      // 08e: aload 4
      // 090: ifnonnull 12e
      // 093: bipush 1
      // 094: if_icmpne 125
      // 097: goto 0a4
      // 09a: ldc2_w -7434787352562657279
      // 09d: lload 2
      // 09e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: ldc2_w -6994598974869095633
      // 0a8: lload 2
      // 0a9: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: bipush 0
      // 0af: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0b2: checkcast java/lang/String
      // 0b5: astore 7
      // 0b7: ldc2_w -8845439424308896280
      // 0ba: lload 2
      // 0bb: invokedynamic m (JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: aload 7
      // 0c2: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c7: checkcast java/lang/String
      // 0ca: astore 8
      // 0cc: aload 4
      // 0ce: ifnonnull 11a
      // 0d1: aload 8
      // 0d3: ifnull 0fd
      // 0d6: goto 0e3
      // 0d9: ldc2_w -7434787352562657279
      // 0dc: lload 2
      // 0dd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 5
      // 0e5: aload 8
      // 0e7: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0ea: pop
      // 0eb: aload 4
      // 0ed: ifnull 122
      // 0f0: goto 0fd
      // 0f3: ldc2_w -7434787352562657279
      // 0f6: lload 2
      // 0f7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: aload 5
      // 0ff: ldc "L"
      // 101: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 104: pop
      // 105: aload 5
      // 107: aload 7
      // 109: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 10c: pop
      // 10d: goto 11a
      // 110: ldc2_w -7434787352562657279
      // 113: lload 2
      // 114: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 5
      // 11c: ldc ";"
      // 11e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 121: pop
      // 122: goto 1b9
      // 125: aload 5
      // 127: ldc "L"
      // 129: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 12c: pop
      // 12d: bipush 0
      // 12e: istore 7
      // 130: iload 7
      // 132: iload 6
      // 134: if_icmpge 1ab
      // 137: aload 0
      // 138: ldc2_w -6994598974869095633
      // 13b: lload 2
      // 13c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: iload 7
      // 143: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 146: checkcast java/lang/String
      // 149: lload 2
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: iflt 1be
      // 14f: astore 8
      // 151: aload 4
      // 153: ifnonnull 1b9
      // 156: aload 4
      // 158: lload 2
      // 159: lconst_0
      // 15a: lcmp
      // 15b: iflt 1a8
      // 15e: ifnonnull 1a6
      // 161: goto 16e
      // 164: ldc2_w -7434787352562657279
      // 167: lload 2
      // 168: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: lload 2
      // 16f: lconst_0
      // 170: lcmp
      // 171: iflt 1a3
      // 174: iload 7
      // 176: ifle 19b
      // 179: goto 186
      // 17c: ldc2_w -7434787352562657279
      // 17f: lload 2
      // 180: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 5
      // 188: ldc "/"
      // 18a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 18d: pop
      // 18e: goto 19b
      // 191: ldc2_w -7434787352562657279
      // 194: lload 2
      // 195: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: aload 5
      // 19d: aload 8
      // 19f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1a2: pop
      // 1a3: iinc 7 1
      // 1a6: aload 4
      // 1a8: ifnull 130
      // 1ab: aload 5
      // 1ad: ldc ";"
      // 1af: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1b2: lload 2
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: iflt 146
      // 1b8: pop
      // 1b9: aload 5
      // 1bb: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1be: areturn
   }

   void R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"v">(this, x44.a<"i">(this, -377197843632512484L, var2) + 1, -377197843632512484L, var2);
   }

   public z1(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 116244438414579L;
      super(var4, var1);
      x44.a<"w">(this, new ArrayList(), -5305763671398771809L, var2);
   }

   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      _ur var3 = (_ur)var1[2];
      long var6 = var4 ^ 52240336242830L;
      long var8 = var4 ^ 75427126383632L;
      long var10 = var4 ^ 0L;
      long var12 = var4 ^ 134528422017690L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var4);
      int var15 = x44.a<"i">(this, new Object[]{var12}, 7145691849331111744L, var4);
      int var16 = 0;
      int[] var14 = var10000;

      label34: {
         while (var16 < var15) {
            try {
               if (var4 > 0L) {
                  var19 = this.e(var16);
                  if (var14 != null) {
                     break label34;
                  }

                  x44.a<"i">(var19, new Object[]{var10, this, var3}, 8818198965911889370L, var4);
                  var16++;
               }

               if (var14 == null) {
                  continue;
               }
            } catch (gj var17) {
               throw x44.a<"q">(var17, 8923634754376596228L, var4);
            }

            if (var4 >= 0L) {
               break;
            }
         }

         var19 = var2;
      }

      _un var18 = (_un)var19;
      x44.a<"i">(var18, new Object[]{x44.a<"i">(this, new Object[]{var6}, 8692674758133396026L, var4), var8}, 7448078780805022163L, var4);
   }

   static {
      long var16 = a ^ 117848445267690L;
      long var18 = var16 ^ 93886756681159L;
      Cipher var8;
      Cipher var10000 = var8 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var9 = 1; var9 < 8; var9++) {
         var10003[var9] = (byte)((int)(var16 << var9 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var13 = 0;
      String var12 = "Q«*Ü7á\u0094þ\b\"Ã\u008b¹\u0098üñÐ\bdîÀ\u0013è}Ç|\bEB\b\u0000j4äK\b³:\u0011;\u001eo\u0091\u008c\biÉ¯ZC\u001a¿P";
      int var14 = "Q«*Ü7á\u0094þ\b\"Ã\u008b¹\u0098üñÐ\bdîÀ\u0013è}Ç|\bEB\b\u0000j4äK\b³:\u0011;\u001eo\u0091\u008c\biÉ¯ZC\u001a¿P".length();
      char var11 = '\b';
      int var21 = -1;

      label37:
      while (true) {
         String var22 = var12.substring(++var21, var21 + var11);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var8.doFinal(var22.getBytes("ISO-8859-1"));
            String var31 = b(var15).intern();
            switch (var10001) {
               case 0:
                  var7[var13++] = var31;
                  if ((var21 += var11) >= var14) {
                     Cipher var2;
                     var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var4 = 4490398146976725429L;
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
                     long var35 = ((long)var6[0] & 255L) << 56
                        | ((long)var6[1] & 255L) << 48
                        | ((long)var6[2] & 255L) << 40
                        | ((long)var6[3] & 255L) << 32
                        | ((long)var6[4] & 255L) << 24
                        | ((long)var6[5] & 255L) << 16
                        | ((long)var6[6] & 255L) << 8
                        | (long)var6[7] & 255L;
                     var10001 = -1;
                     long var0 = var35;
                     int var25 = (int)var0;
                     Object[] var37 = new Object[]{null, var18};
                     var37[0] = var25;
                     b = x44.a<"r">(var37, 848017331285920887L, var16);
                     x44.a<"k">(1472881536874089638L, var16).put(var7[4], "B");
                     x44.a<"k">(1472881536874089638L, var16).put(var7[2], "C");
                     x44.a<"k">(1472881536874089638L, var16).put(var7[7], "D");
                     x44.a<"k">(1472881536874089638L, var16).put(var7[3], "F");
                     x44.a<"k">(1472881536874089638L, var16).put(var7[1], "I");
                     x44.a<"k">(1472881536874089638L, var16).put(var7[0], "J");
                     x44.a<"k">(1472881536874089638L, var16).put(var7[5], "S");
                     x44.a<"k">(1472881536874089638L, var16).put(var7[6], "Z");
                     return;
                  }

                  var11 = var12.charAt(var21);
                  break;
               default:
                  var7[var13++] = var31;
                  if ((var21 += var11) < var14) {
                     var11 = var12.charAt(var21);
                     continue label37;
                  }

                  var12 = "@8q\b)·\u008dü\bù7¹pÔ\u001b?×";
                  var14 = "@8q\b)·\u008dü\bù7¹pÔ\u001b?×".length();
                  var11 = '\b';
                  var21 = -1;
            }

            var22 = var12.substring(++var21, var21 + var11);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
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
}
