package com.zelix;

import java.awt.Container;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class d8 extends dd {
   private File N;
   as V;
   po O;
   eq l;
   private static final long a = ess.a(8057356046907107916L, -4943307770528725264L, MethodHandles.lookup().lookupClass()).a(20003495845332L);
   private static final String[] i;
   private static final String[] j;
   private static final Map m = new HashMap(13);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   protected void M(Object[] var1) {
      Object var8 = var1[0];
      Object var7 = var1[1];
      Object var4 = var1[2];
      Object var2 = var1[3];
      Object var5 = var1[4];
      Object var6 = var1[5];
      Object var3 = var1[6];
      long var9 = (Long)var1[7];
      long var11 = var9 ^ 297298040212L;
      long var13 = var9 ^ 45554541515499L;
      long var15 = var9 ^ 33512356773684L;
      long var17 = var9 ^ 35309586951409L;
      long var19 = var9 ^ 95577780075609L;
      long var10001 = var9 ^ 17269891170557L;
      int var21 = (int)((var9 ^ 17269891170557L) >>> 48);
      int var22 = (int)((var9 ^ 17269891170557L) << 16 >>> 32);
      int var23 = (int)(var10001 << 48 >>> 48);
      long var24 = var9 ^ 60806348823376L;
      long var26 = var9 ^ 41154306738481L;
      long var28 = var9 ^ 5056776641392L;
      long var30 = var9 ^ 121011386763584L;
      long var32 = var9 ^ 100515280996879L;
      long var34 = var9 ^ 76487848691270L;
      long var36 = var9 ^ 71640382701036L;
      x44.a<"p">(this, x44.a<"s">(new Object[]{var13}, -6982963201578403464L, var9), -8981709812944476158L, var9);
      List var39 = (List)var8;
      String var40 = (String)var7;
      String var41 = (String)var4;
      int[] var10000 = x44.a<"s">(-8844655890591221541L, var9);
      String var42 = (String)var2;
      Container var43 = x44.a<"k">(this, -7455686434895847029L, var9);
      _s4 var44 = new _s4(var32, var43);
      int[] var38 = var10000;
      x44.a<"k">(var43, var44, -8907197129527157909L, var9);
      tt var45 = new tt((char)var21, var22, false, true, 5, (char)var23, 5);
      _s4 var46 = new _s4(var32, var45);

      label54: {
         label58: {
            try {
               x44.a<"k">(var45, var46, -9034873776369358809L, var9);
               x44.a<"p">(this, new JLabel(var40), -8936427198730026750L, var9);
               x44.a<"k">(var45, x44.a<"o">(this, -8936427198730026750L, var9), c<"z">(32659, 2853475880849457390L ^ var9), -8839335514784156150L, var9);
               x44.a<"p">(this, new q5(var28, new DefaultListModel()), -8953598576910851160L, var9);
               x44.a<"p">(
                  this, (DefaultListModel)x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var9), -7456302456577042002L, var9), -7120313560445745545L, var9
               );
               if (var38 == null) {
                  break label54;
               }

               if (var39 == null) {
                  break label58;
               }
            } catch (gj var49) {
               throw x44.a<"s">(var49, -7190010493696365948L, var9);
            }

            label52:
            for (String var48 : var39) {
               try {
                  x44.a<"k">(this, new Object[]{var48, var19}, -7222340850422530871L, var9);
               } catch (gj var51) {
                  boolean var55 = false;
                  throw x44.a<"s">(var51, -7190010493696365948L, var9);
               }

               while (true) {
                  try {
                     var10000 = var38;
                     if (var9 >= 0L) {
                        if (var38 == null) {
                           break label54;
                        }

                        var10000 = var38;
                     }

                     if (var10000 != null) {
                        break;
                     }
                  } catch (gj var50) {
                     boolean var56 = false;
                     throw x44.a<"s">(var50, -7190010493696365948L, var9);
                  }

                  if (var9 >= 0L) {
                     break label52;
                  }
               }
            }
         }

         x44.a<"k">(var45, new uo(x44.a<"o">(this, -8953598576910851160L, var9), var24), c<"z">(995, 7761817794459942047L ^ var9), -8839335514784156150L, var9);
         x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var9), 2, -9147683637724418281L, var9);
         x44.a<"p">(this, new JButton(c<"z">(2193, 5372644397091305460L ^ var9)), -7429688383397806281L, var9);
         x44.a<"k">(
            x44.a<"o">(this, -7429688383397806281L, var9),
            x44.a<"s">(new Object[]{c<"z">(5648, 3629804971264190832L ^ var9), var26}, -9060970373903050785L, var9),
            -7012224312561665088L,
            var9
         );
         x44.a<"k">(var45, x44.a<"o">(this, -7429688383397806281L, var9), c<"z">(22242, 2149946128223824270L ^ var9), -8839335514784156150L, var9);
         x44.a<"p">(this, new JButton(c<"z">(22514, 1478141551185750161L ^ var9)), -6967992343712920248L, var9);
         x44.a<"k">(
            x44.a<"o">(this, -6967992343712920248L, var9),
            x44.a<"s">(new Object[]{c<"z">(30729, 4456893887105779574L ^ var9), var26}, -9060970373903050785L, var9),
            -7012224312561665088L,
            var9
         );
         x44.a<"k">(var45, x44.a<"o">(this, -6967992343712920248L, var9), c<"z">(5229, 4539745415436774171L ^ var9), -8839335514784156150L, var9);
         x44.a<"p">(this, new JButton(c<"z">(30900, 245232125029271515L ^ var9)), -7063282592745791582L, var9);
         x44.a<"k">(
            x44.a<"o">(this, -7063282592745791582L, var9),
            x44.a<"s">(new Object[]{c<"z">(80, 2611306339553820475L ^ var9), var26}, -9060970373903050785L, var9),
            -7012224312561665088L,
            var9
         );
         x44.a<"k">(var45, x44.a<"o">(this, -7063282592745791582L, var9), c<"z">(852, 1589472655486368819L ^ var9), -8839335514784156150L, var9);
         x44.a<"p">(this, new JButton(c<"z">(9952, 3369550798143232394L ^ var9)), -8702381759462028581L, var9);
         x44.a<"k">(
            x44.a<"o">(this, -8702381759462028581L, var9),
            x44.a<"s">(new Object[]{c<"z">(12786, 4423937865417789066L ^ var9), var26}, -9060970373903050785L, var9),
            -7012224312561665088L,
            var9
         );
         x44.a<"k">(var45, x44.a<"o">(this, -8702381759462028581L, var9), c<"z">(26387, 4549092952441313389L ^ var9), -8839335514784156150L, var9);
         x44.a<"k">(var46, new Object[]{x44.a<"j">(-8710251634882384470L, var9), var34}, -6986909492850926929L, var9);
         x44.a<"k">(var43, var45, c<"z">(18972, 8293296131744134513L ^ var9), -8717886799741620868L, var9);
         x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var9), this, -7428223235030437049L, var9);
         x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var9), this, -8958712241607375136L, var9);
         x44.a<"k">(x44.a<"o">(this, -6967992343712920248L, var9), this, -8920966476704791143L, var9);
         x44.a<"k">(x44.a<"o">(this, -7063282592745791582L, var9), this, -8920966476704791143L, var9);
         x44.a<"k">(x44.a<"o">(this, -8702381759462028581L, var9), this, -8920966476704791143L, var9);
         x44.a<"k">(x44.a<"o">(this, -7429688383397806281L, var9), this, -8920966476704791143L, var9);
         x44.a<"k">(x44.a<"o">(this, -6967992343712920248L, var9), this, -8818436412853440062L, var9);
         x44.a<"k">(x44.a<"o">(this, -7063282592745791582L, var9), this, -8818436412853440062L, var9);
         x44.a<"k">(x44.a<"o">(this, -8702381759462028581L, var9), this, -8818436412853440062L, var9);
         x44.a<"k">(x44.a<"o">(this, -7429688383397806281L, var9), this, -8818436412853440062L, var9);
         x44.a<"k">(this, new Object[]{var30}, -8674532747485436261L, var9);
      }

      StringBuffer var52 = new StringBuffer(c<"z">(27927, 2108973757668479601L ^ var9));
      x44.a<"k">(this, new Object[]{var15, var41, var42, var52, var43}, -8835157473265147301L, var9);
      x44.a<"k">(var44, new Object[]{var36, var52.toString()}, -7313353165823419638L, var9);
      x44.a<"k">(this, x44.a<"s">(new Object[]{this, var11}, -8691864418112648565L, var9), -9070997567981572240L, var9);
      x44.a<"s">(new Object[]{this, var17}, -8922908125232722563L, var9);
   }

   final void H(Object[] param1) {
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
      // 00e: ldc2_w 120069929596896
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 74770885346602
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 104890990491466
      // 01f: lxor
      // 020: lstore 8
      // 022: dup2
      // 023: ldc2_w 55132399949948
      // 026: lxor
      // 027: lstore 10
      // 029: dup2
      // 02a: ldc2_w 27086674183498
      // 02d: lxor
      // 02e: lstore 12
      // 030: dup2
      // 031: ldc2_w 90003096274937
      // 034: lxor
      // 035: lstore 14
      // 037: dup2
      // 038: ldc2_w 15828001346596
      // 03b: lxor
      // 03c: lstore 16
      // 03e: dup2
      // 03f: ldc2_w 40323690036040
      // 042: lxor
      // 043: lstore 18
      // 045: pop2
      // 046: ldc2_w 7309120369317419253
      // 049: lload 2
      // 04a: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: aload 0
      // 050: ldc2_w 9007725502273611353
      // 053: lload 2
      // 054: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: ldc2_w 8938497533280200981
      // 05c: lload 2
      // 05d: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: istore 21
      // 064: astore 20
      // 066: new java/lang/StringBuilder
      // 069: dup
      // 06a: invokespecial java/lang/StringBuilder.<init> ()V
      // 06d: astore 22
      // 06f: bipush 0
      // 070: istore 23
      // 072: iload 23
      // 074: iload 21
      // 076: if_icmpge 139
      // 079: aload 0
      // 07a: ldc2_w 9007725502273611353
      // 07d: lload 2
      // 07e: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: iload 23
      // 085: ldc2_w 7156456407076138416
      // 088: lload 2
      // 089: invokedynamic m (Ljava/lang/Object;IJJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: checkcast java/io/File
      // 091: astore 24
      // 093: aload 20
      // 095: lload 2
      // 096: lconst_0
      // 097: lcmp
      // 098: ifle 0e2
      // 09b: ifnull 0da
      // 09e: aload 24
      // 0a0: ldc2_w 9032400208770999373
      // 0a3: lload 2
      // 0a4: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: ifne 0e5
      // 0ac: goto 0b9
      // 0af: ldc2_w 8942386999527426730
      // 0b2: lload 2
      // 0b3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 22
      // 0bb: aload 24
      // 0bd: ldc2_w 9004097041191744537
      // 0c0: lload 2
      // 0c1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: pop
      // 0cd: goto 0da
      // 0d0: ldc2_w 8942386999527426730
      // 0d3: lload 2
      // 0d4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: lload 2
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: ifle 106
      // 0e0: aload 20
      // 0e2: ifnonnull 106
      // 0e5: aload 22
      // 0e7: aload 24
      // 0e9: ldc2_w 8958875926323999831
      // 0ec: lload 2
      // 0ed: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: pop
      // 0f9: goto 106
      // 0fc: ldc2_w 8942386999527426730
      // 0ff: lload 2
      // 100: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: lload 2
      // 107: lconst_0
      // 108: lcmp
      // 109: iflt 134
      // 10c: iload 23
      // 10e: iload 21
      // 110: bipush 1
      // 111: isub
      // 112: if_icmpge 131
      // 115: aload 22
      // 117: ldc2_w 7183967112412820158
      // 11a: lload 2
      // 11b: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: pop
      // 124: goto 131
      // 127: ldc2_w 8942386999527426730
      // 12a: lload 2
      // 12b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: iinc 23 1
      // 134: aload 20
      // 136: ifnonnull 072
      // 139: aload 22
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: lload 2
      // 13f: lconst_0
      // 140: lcmp
      // 141: iflt 08e
      // 144: astore 23
      // 146: aload 0
      // 147: ldc2_w 9182372497417133051
      // 14a: lload 2
      // 14b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: lload 16
      // 152: bipush 1
      // 153: anewarray 315
      // 156: dup_x2
      // 157: dup_x2
      // 158: pop
      // 159: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: ldc2_w 9204808061539773084
      // 162: lload 2
      // 163: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: astore 24
      // 16a: aload 24
      // 16c: aload 23
      // 16e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 171: aload 20
      // 173: ifnull 1fc
      // 176: ifne 1e8
      // 179: goto 186
      // 17c: ldc2_w 8942386999527426730
      // 17f: lload 2
      // 180: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 0
      // 187: aload 23
      // 189: aload 0
      // 18a: ldc2_w 9007725502273611353
      // 18d: lload 2
      // 18e: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: ldc2_w 7058469156395909252
      // 196: lload 2
      // 197: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: lload 8
      // 19e: dup2_x1
      // 19f: pop2
      // 1a0: bipush 3
      // 1a1: anewarray 315
      // 1a4: dup_x1
      // 1a5: swap
      // 1a6: bipush 2
      // 1a7: swap
      // 1a8: aastore
      // 1a9: dup_x2
      // 1aa: dup_x2
      // 1ab: pop
      // 1ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1af: bipush 1
      // 1b0: swap
      // 1b1: aastore
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: bipush 0
      // 1b5: swap
      // 1b6: aastore
      // 1b7: ldc2_w 6995225545336852753
      // 1ba: lload 2
      // 1bb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: aload 20
      // 1c2: lload 2
      // 1c3: lconst_0
      // 1c4: lcmp
      // 1c5: iflt 1fe
      // 1c8: ifnull 1fc
      // 1cb: goto 1d8
      // 1ce: ldc2_w 8942386999527426730
      // 1d1: lload 2
      // 1d2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: ifeq 309
      // 1db: goto 1e8
      // 1de: ldc2_w 8942386999527426730
      // 1e1: lload 2
      // 1e2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: aload 24
      // 1ea: aload 23
      // 1ec: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ef: goto 1fc
      // 1f2: ldc2_w 8942386999527426730
      // 1f5: lload 2
      // 1f6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: aload 20
      // 1fe: ifnull 2a8
      // 201: ifne 2a9
      // 204: goto 211
      // 207: ldc2_w 8942386999527426730
      // 20a: lload 2
      // 20b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: athrow
      // 211: aload 0
      // 212: aload 23
      // 214: lload 10
      // 216: bipush 2
      // 217: anewarray 315
      // 21a: dup_x2
      // 21b: dup_x2
      // 21c: pop
      // 21d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 220: bipush 1
      // 221: swap
      // 222: aastore
      // 223: dup_x1
      // 224: swap
      // 225: bipush 0
      // 226: swap
      // 227: aastore
      // 228: ldc2_w 9052369603302701270
      // 22b: lload 2
      // 22c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: aload 0
      // 232: ldc2_w 9182372497417133051
      // 235: lload 2
      // 236: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: aload 23
      // 23d: lload 6
      // 23f: bipush 2
      // 240: anewarray 315
      // 243: dup_x2
      // 244: dup_x2
      // 245: pop
      // 246: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 249: bipush 1
      // 24a: swap
      // 24b: aastore
      // 24c: dup_x1
      // 24d: swap
      // 24e: bipush 0
      // 24f: swap
      // 250: aastore
      // 251: ldc2_w 6975594528882918238
      // 254: lload 2
      // 255: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: pop
      // 25b: aload 0
      // 25c: ldc2_w 9182372497417133051
      // 25f: lload 2
      // 260: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: new com/zelix/pg
      // 268: dup
      // 269: lload 18
      // 26b: invokespecial com/zelix/pg.<init> (J)V
      // 26e: new com/zelix/pg
      // 271: dup
      // 272: lload 18
      // 274: invokespecial com/zelix/pg.<init> (J)V
      // 277: lload 4
      // 279: dup2_x2
      // 27a: pop2
      // 27b: bipush 3
      // 27c: anewarray 315
      // 27f: dup_x1
      // 280: swap
      // 281: bipush 2
      // 282: swap
      // 283: aastore
      // 284: dup_x1
      // 285: swap
      // 286: bipush 1
      // 287: swap
      // 288: aastore
      // 289: dup_x2
      // 28a: dup_x2
      // 28b: pop
      // 28c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28f: bipush 0
      // 290: swap
      // 291: aastore
      // 292: ldc2_w 9084350849808469138
      // 295: lload 2
      // 296: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: goto 2a8
      // 29e: ldc2_w 8942386999527426730
      // 2a1: lload 2
      // 2a2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: pop
      // 2a9: aload 0
      // 2aa: bipush 1
      // 2ab: ldc2_w 9202281813474255453
      // 2ae: lload 2
      // 2af: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: aload 0
      // 2b5: lload 12
      // 2b7: bipush 1
      // 2b8: anewarray 315
      // 2bb: dup_x2
      // 2bc: dup_x2
      // 2bd: pop
      // 2be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c1: bipush 0
      // 2c2: swap
      // 2c3: aastore
      // 2c4: ldc2_w 9203768336903943095
      // 2c7: lload 2
      // 2c8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: aload 0
      // 2ce: ldc2_w 8869981620498094971
      // 2d1: lload 2
      // 2d2: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: aload 0
      // 2d8: ldc2_w 9182372497417133051
      // 2db: lload 2
      // 2dc: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: bipush 1
      // 2e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e5: lload 14
      // 2e7: dup2_x1
      // 2e8: pop2
      // 2e9: bipush 3
      // 2ea: anewarray 315
      // 2ed: dup_x1
      // 2ee: swap
      // 2ef: bipush 2
      // 2f0: swap
      // 2f1: aastore
      // 2f2: dup_x2
      // 2f3: dup_x2
      // 2f4: pop
      // 2f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f8: bipush 1
      // 2f9: swap
      // 2fa: aastore
      // 2fb: dup_x1
      // 2fc: swap
      // 2fd: bipush 0
      // 2fe: swap
      // 2ff: aastore
      // 300: ldc2_w 6923113684765856820
      // 303: lload 2
      // 304: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: return
   }

   protected void Z(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 113826629411850L;
      long var6 = var2 ^ 11513958743392L;
      x44.a<"v">(this, true, 6842495783614513949L, var2);
      x44.a<"m">(this, new Object[]{var4}, 6843824009314669303L, var2);
      x44.a<"m">(x44.a<"i">(this, 6510233006245968443L, var2), new Object[]{var6}, 6565146161145330487L, var2);
   }

   void k(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"i">(x44.a<"m">(this, 2810086568161764653L, var2), var4, 4288831153297245062L, var2);
      x44.a<"i">(x44.a<"m">(this, 2810086568161764653L, var2), 4345448362968612119L, var2);
   }

   d8(JFrame var1, long var2, String var4, po var5, String var6, String var7, String var8, as var9, eq var10) {
      var2 = a ^ var2;
      long var11 = var2 ^ 32708552876299L;
      long var13 = var2 ^ 110646497864489L;
      long var15 = var2 ^ 94990762093773L;
      long var17 = var2 ^ 77326890349748L;
      super(var1, var11, var4, var5.Z(new Object[]{var15}), var6, var7, var8);
      x44.a<"w">(this, new File(x44.a<"m">(-332514985457120605L, var2)), -526209150592890239L, var2);
      x44.a<"w">(this, var5, -2261004991890602998L, var2);
      x44.a<"w">(this, var10, -1951855672846138230L, var2);
      x44.a<"w">(this, var9, -2201626700019064160L, var2);
      x44.a<"l">(this, new Object[]{var13}, -2195185773824930987L, var2);
      x44.a<"t">(new Object[]{x44.a<"h">(this, -2203792705048925566L, var2), var17}, -406146451901803837L, var2);
   }

   public void N(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 120940350691690
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w -6907062902181896769
      // 1f: lload 2
      // 20: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: lload 6
      // 28: bipush 1
      // 29: anewarray 315
      // 2c: dup_x2
      // 2d: dup_x2
      // 2e: pop
      // 2f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32: bipush 0
      // 33: swap
      // 34: aastore
      // 35: invokespecial com/zelix/dd.N ([Ljava/lang/Object;)V
      // 38: astore 8
      // 3a: aload 0
      // 3b: aload 8
      // 3d: ifnull 67
      // 40: ldc2_w -4972244265863452905
      // 43: lload 2
      // 44: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: ifne 88
      // 4c: goto 59
      // 4f: ldc2_w -5092545082994683936
      // 52: lload 2
      // 53: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: goto 67
      // 5d: ldc2_w -5092545082994683936
      // 60: lload 2
      // 61: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: ldc2_w -4732551021708992975
      // 6a: lload 2
      // 6b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: lload 4
      // 72: bipush 1
      // 73: anewarray 315
      // 76: dup_x2
      // 77: dup_x2
      // 78: pop
      // 79: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c: bipush 0
      // 7d: swap
      // 7e: aastore
      // 7f: ldc2_w -4677425680368410819
      // 82: lload 2
      // 83: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: return
   }

   protected void s(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 96220742129266L;
      x44.a<"q">(new Object[]{c<"z">(12328, 7282101273681490853L ^ var2), var4}, 7393910029253152720L, var2);
   }

   void B(Object[] param1) {
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
      // 00e: ldc2_w 68216752807770
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 136013387138104
      // 018: lxor
      // 019: dup2
      // 01a: bipush 48
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 6
      // 020: dup2
      // 021: bipush 16
      // 023: lshl
      // 024: bipush 32
      // 026: lushr
      // 027: l2i
      // 028: istore 7
      // 02a: dup2
      // 02b: bipush 48
      // 02d: lshl
      // 02e: bipush 48
      // 030: lushr
      // 031: l2i
      // 032: istore 8
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 47708108812249
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 58301098060681
      // 040: lxor
      // 041: lstore 11
      // 043: dup2
      // 044: ldc2_w 26936891530797
      // 047: lxor
      // 048: lstore 13
      // 04a: dup2
      // 04b: ldc2_w 63803447196964
      // 04e: lxor
      // 04f: lstore 15
      // 051: dup2
      // 052: ldc2_w 7596526824003
      // 055: lxor
      // 056: lstore 17
      // 058: pop2
      // 059: bipush 1
      // 05a: anewarray 399
      // 05d: dup
      // 05e: bipush 0
      // 05f: new com/zelix/p4
      // 062: dup
      // 063: invokespecial com/zelix/p4.<init> ()V
      // 066: aastore
      // 067: astore 20
      // 069: ldc2_w -3216933177191354687
      // 06c: lload 2
      // 06d: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aload 0
      // 073: ldc2_w -3353064803364576444
      // 076: lload 2
      // 077: invokedynamic m (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: ldc2_w -3864004772617223581
      // 07f: lload 2
      // 080: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: astore 21
      // 087: new com/zelix/q_
      // 08a: dup
      // 08b: aload 0
      // 08c: ldc2_w -3353064803364576444
      // 08f: lload 2
      // 090: invokedynamic m (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: bipush 1
      // 096: bipush 3
      // 097: lload 9
      // 099: aload 20
      // 09b: bipush 0
      // 09c: bipush 0
      // 09d: invokespecial com/zelix/q_.<init> (Ljava/io/File;ZIJ[Lcom/zelix/pt;IZ)V
      // 0a0: astore 22
      // 0a2: astore 19
      // 0a4: aload 22
      // 0a6: aload 0
      // 0a7: lload 15
      // 0a9: sipush 25724
      // 0ac: ldc2_w 6070992518597709085
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: bipush 3
      // 0b7: anewarray 315
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: bipush 2
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x2
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c5: bipush 1
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x1
      // 0c9: swap
      // 0ca: bipush 0
      // 0cb: swap
      // 0cc: aastore
      // 0cd: ldc2_w -3692770668728505375
      // 0d0: lload 2
      // 0d1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: istore 23
      // 0d8: iload 23
      // 0da: aload 19
      // 0dc: ifnull 125
      // 0df: bipush 1
      // 0e0: if_icmpne 2b8
      // 0e3: goto 0f0
      // 0e6: ldc2_w -3878263895222322018
      // 0e9: lload 2
      // 0ea: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 21
      // 0f2: aload 22
      // 0f4: lload 11
      // 0f6: bipush 1
      // 0f7: anewarray 315
      // 0fa: dup_x2
      // 0fb: dup_x2
      // 0fc: pop
      // 0fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 100: bipush 0
      // 101: swap
      // 102: aastore
      // 103: ldc2_w -3809486298131420706
      // 106: lload 2
      // 107: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: ldc2_w -3864004772617223581
      // 10f: lload 2
      // 110: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 118: goto 125
      // 11b: ldc2_w -3878263895222322018
      // 11e: lload 2
      // 11f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: ifne 159
      // 128: aload 0
      // 129: aload 22
      // 12b: lload 11
      // 12d: bipush 1
      // 12e: anewarray 315
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 0
      // 138: swap
      // 139: aastore
      // 13a: ldc2_w -3809486298131420706
      // 13d: lload 2
      // 13e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: ldc2_w -3353064803364576444
      // 146: lload 2
      // 147: invokedynamic r (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: goto 159
      // 14f: ldc2_w -3878263895222322018
      // 152: lload 2
      // 153: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: aload 22
      // 15b: iload 6
      // 15d: i2s
      // 15e: iload 7
      // 160: iload 8
      // 162: bipush 3
      // 163: anewarray 315
      // 166: dup_x1
      // 167: swap
      // 168: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16b: bipush 2
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x1
      // 16f: swap
      // 170: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 173: bipush 1
      // 174: swap
      // 175: aastore
      // 176: dup_x1
      // 177: swap
      // 178: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17b: bipush 0
      // 17c: swap
      // 17d: aastore
      // 17e: ldc2_w -3763367760451797766
      // 181: lload 2
      // 182: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: astore 24
      // 189: bipush 0
      // 18a: istore 25
      // 18c: iload 25
      // 18e: aload 24
      // 190: arraylength
      // 191: if_icmpge 2b8
      // 194: aload 24
      // 196: iload 25
      // 198: aaload
      // 199: astore 26
      // 19b: aload 26
      // 19d: ldc2_w -3864004772617223581
      // 1a0: lload 2
      // 1a1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: astore 27
      // 1a8: aload 19
      // 1aa: lload 2
      // 1ab: lconst_0
      // 1ac: lcmp
      // 1ad: ifle 294
      // 1b0: ifnull 292
      // 1b3: aload 26
      // 1b5: ldc2_w -3239433206397368841
      // 1b8: lload 2
      // 1b9: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: ifeq 247
      // 1c1: goto 1ce
      // 1c4: ldc2_w -3878263895222322018
      // 1c7: lload 2
      // 1c8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: lload 2
      // 1d0: lconst_0
      // 1d1: lcmp
      // 1d2: iflt 224
      // 1d5: aload 19
      // 1d7: ifnull 224
      // 1da: goto 1e7
      // 1dd: ldc2_w -3878263895222322018
      // 1e0: lload 2
      // 1e1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: aload 27
      // 1e9: lload 17
      // 1eb: bipush 2
      // 1ec: anewarray 315
      // 1ef: dup_x2
      // 1f0: dup_x2
      // 1f1: pop
      // 1f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f5: bipush 1
      // 1f6: swap
      // 1f7: aastore
      // 1f8: dup_x1
      // 1f9: swap
      // 1fa: bipush 0
      // 1fb: swap
      // 1fc: aastore
      // 1fd: ldc2_w -3612090006930396461
      // 200: lload 2
      // 201: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: ifeq 29d
      // 209: goto 216
      // 20c: ldc2_w -3878263895222322018
      // 20f: lload 2
      // 210: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: athrow
      // 216: aload 0
      // 217: goto 224
      // 21a: ldc2_w -3878263895222322018
      // 21d: lload 2
      // 21e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: lload 4
      // 226: bipush 1
      // 227: anewarray 315
      // 22a: dup_x2
      // 22b: dup_x2
      // 22c: pop
      // 22d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 230: bipush 0
      // 231: swap
      // 232: aastore
      // 233: ldc2_w -3348551216936619903
      // 236: lload 2
      // 237: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: aload 19
      // 23e: lload 2
      // 23f: lconst_0
      // 240: lcmp
      // 241: iflt 2a2
      // 244: ifnonnull 29d
      // 247: new com/zelix/wf
      // 24a: dup
      // 24b: aload 0
      // 24c: sipush 32435
      // 24f: ldc2_w 7025486041403889619
      // 252: lload 2
      // 253: lxor
      // 254: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: new java/lang/StringBuilder
      // 25c: dup
      // 25d: invokespecial java/lang/StringBuilder.<init> ()V
      // 260: ldc "'"
      // 262: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 265: aload 27
      // 267: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26a: sipush 11708
      // 26d: ldc2_w 1314031655764575455
      // 270: lload 2
      // 271: lxor
      // 272: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27d: lload 13
      // 27f: dup2_x1
      // 280: pop2
      // 281: invokespecial com/zelix/wf.<init> (Ljava/awt/Frame;Ljava/lang/String;JLjava/lang/String;)V
      // 284: pop
      // 285: goto 292
      // 288: ldc2_w -3878263895222322018
      // 28b: lload 2
      // 28c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: athrow
      // 292: aload 19
      // 294: lload 2
      // 295: lconst_0
      // 296: lcmp
      // 297: ifle 2a2
      // 29a: ifnonnull 2b8
      // 29d: iinc 25 1
      // 2a0: aload 19
      // 2a2: ifnonnull 18c
      // 2a5: lload 2
      // 2a6: lconst_0
      // 2a7: lcmp
      // 2a8: iflt 1a8
      // 2ab: goto 2b8
      // 2ae: ldc2_w -3878263895222322018
      // 2b1: lload 2
      // 2b2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: return
   }

   boolean d(Object[] param1) {
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
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Enumeration
      // 019: astore 3
      // 01a: pop
      // 01b: getstatic com/zelix/d8.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 94234334629383
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 136922039418061
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 72271377197276
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 60346168454595
      // 03e: lxor
      // 03f: lstore 12
      // 041: dup2
      // 042: ldc2_w 109745290922343
      // 045: lxor
      // 046: lstore 14
      // 048: dup2
      // 049: ldc2_w 30974342759087
      // 04c: lxor
      // 04d: lstore 16
      // 04f: pop2
      // 050: ldc2_w -7167462557216251630
      // 053: lload 4
      // 055: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: bipush 0
      // 05b: istore 22
      // 05d: astore 21
      // 05f: new com/zelix/pg
      // 062: dup
      // 063: lload 16
      // 065: invokespecial com/zelix/pg.<init> (J)V
      // 068: astore 23
      // 06a: aload 2
      // 06b: new java/io/File
      // 06e: dup
      // 06f: ldc2_w -7100893258922070859
      // 072: lload 4
      // 074: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 07c: new com/zelix/pg
      // 07f: dup
      // 080: lload 16
      // 082: invokespecial com/zelix/pg.<init> (J)V
      // 085: aconst_null
      // 086: checkcast com/zelix/_zk
      // 089: aload 23
      // 08b: astore 18
      // 08d: astore 19
      // 08f: astore 20
      // 091: lload 14
      // 093: aload 20
      // 095: aload 19
      // 097: aload 18
      // 099: bipush 6
      // 09b: anewarray 315
      // 09e: dup_x1
      // 09f: swap
      // 0a0: bipush 5
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x1
      // 0a4: swap
      // 0a5: bipush 4
      // 0a6: swap
      // 0a7: aastore
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: bipush 3
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 2
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 1
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: ldc2_w -8959818455303190502
      // 0c3: lload 4
      // 0c5: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: istore 24
      // 0cc: aload 21
      // 0ce: ifnull 145
      // 0d1: iload 24
      // 0d3: ifne 14a
      // 0d6: goto 0e4
      // 0d9: ldc2_w -8791443051312729267
      // 0dc: lload 4
      // 0de: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: sipush 10003
      // 0e8: ldc2_w 8463118317491651000
      // 0eb: lload 4
      // 0ed: lxor
      // 0ee: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: lload 10
      // 0f5: sipush 31132
      // 0f8: ldc2_w 5612074267452628788
      // 0fb: lload 4
      // 0fd: lxor
      // 0fe: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: aload 23
      // 105: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 108: checkcast java/lang/String
      // 10b: bipush 5
      // 10c: anewarray 315
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 4
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: bipush 3
      // 117: swap
      // 118: aastore
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 2
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w -7163683062967333918
      // 12f: lload 4
      // 131: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: pop
      // 137: goto 145
      // 13a: ldc2_w -8791443051312729267
      // 13d: lload 4
      // 13f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: aload 21
      // 147: ifnonnull 350
      // 14a: new java/lang/StringBuilder
      // 14d: dup
      // 14e: invokespecial java/lang/StringBuilder.<init> ()V
      // 151: astore 25
      // 153: aload 3
      // 154: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 159: ifeq 19f
      // 15c: aload 3
      // 15d: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 162: checkcast java/io/File
      // 165: astore 26
      // 167: aload 25
      // 169: aload 26
      // 16b: ldc2_w -8812582711507169872
      // 16e: lload 4
      // 170: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: pop
      // 179: aload 21
      // 17b: lload 4
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: iflt 187
      // 182: ifnull 350
      // 185: aload 21
      // 187: ifnonnull 153
      // 18a: lload 4
      // 18c: lconst_0
      // 18d: lcmp
      // 18e: iflt 179
      // 191: goto 19f
      // 194: ldc2_w -8791443051312729267
      // 197: lload 4
      // 199: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: aload 0
      // 1a0: ldc2_w -8752341644103671268
      // 1a3: lload 4
      // 1a5: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: lload 12
      // 1ac: bipush 1
      // 1ad: anewarray 315
      // 1b0: dup_x2
      // 1b1: dup_x2
      // 1b2: pop
      // 1b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b6: bipush 0
      // 1b7: swap
      // 1b8: aastore
      // 1b9: ldc2_w -8765917273539996805
      // 1bc: lload 4
      // 1be: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: astore 26
      // 1c5: aload 0
      // 1c6: ldc2_w -8752341644103671268
      // 1c9: lload 4
      // 1cb: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: aload 25
      // 1d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d5: lload 8
      // 1d7: bipush 2
      // 1d8: anewarray 315
      // 1db: dup_x2
      // 1dc: dup_x2
      // 1dd: pop
      // 1de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e1: bipush 1
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x1
      // 1e5: swap
      // 1e6: bipush 0
      // 1e7: swap
      // 1e8: aastore
      // 1e9: ldc2_w -7410265528562648391
      // 1ec: lload 4
      // 1ee: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: pop
      // 1f4: aload 0
      // 1f5: ldc2_w -8752341644103671268
      // 1f8: lload 4
      // 1fa: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: new com/zelix/pg
      // 202: dup
      // 203: lload 16
      // 205: invokespecial com/zelix/pg.<init> (J)V
      // 208: new com/zelix/pg
      // 20b: dup
      // 20c: lload 16
      // 20e: invokespecial com/zelix/pg.<init> (J)V
      // 211: lload 6
      // 213: dup2_x2
      // 214: pop2
      // 215: bipush 3
      // 216: anewarray 315
      // 219: dup_x1
      // 21a: swap
      // 21b: bipush 2
      // 21c: swap
      // 21d: aastore
      // 21e: dup_x1
      // 21f: swap
      // 220: bipush 1
      // 221: swap
      // 222: aastore
      // 223: dup_x2
      // 224: dup_x2
      // 225: pop
      // 226: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 229: bipush 0
      // 22a: swap
      // 22b: aastore
      // 22c: ldc2_w -8649971840257559179
      // 22f: lload 4
      // 231: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: aload 21
      // 238: ifnull 34e
      // 23b: ifne 34d
      // 23e: goto 24c
      // 241: ldc2_w -8791443051312729267
      // 244: lload 4
      // 246: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: athrow
      // 24c: aload 0
      // 24d: ldc2_w -8752341644103671268
      // 250: lload 4
      // 252: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: aload 26
      // 259: lload 8
      // 25b: bipush 2
      // 25c: anewarray 315
      // 25f: dup_x2
      // 260: dup_x2
      // 261: pop
      // 262: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 265: bipush 1
      // 266: swap
      // 267: aastore
      // 268: dup_x1
      // 269: swap
      // 26a: bipush 0
      // 26b: swap
      // 26c: aastore
      // 26d: ldc2_w -7410265528562648391
      // 270: lload 4
      // 272: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: pop
      // 278: aload 0
      // 279: ldc2_w -8752341644103671268
      // 27c: lload 4
      // 27e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: new com/zelix/pg
      // 286: dup
      // 287: lload 16
      // 289: invokespecial com/zelix/pg.<init> (J)V
      // 28c: new com/zelix/pg
      // 28f: dup
      // 290: lload 16
      // 292: invokespecial com/zelix/pg.<init> (J)V
      // 295: lload 6
      // 297: dup2_x2
      // 298: pop2
      // 299: bipush 3
      // 29a: anewarray 315
      // 29d: dup_x1
      // 29e: swap
      // 29f: bipush 2
      // 2a0: swap
      // 2a1: aastore
      // 2a2: dup_x1
      // 2a3: swap
      // 2a4: bipush 1
      // 2a5: swap
      // 2a6: aastore
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: ldc2_w -8649971840257559179
      // 2b3: lload 4
      // 2b5: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: pop
      // 2bb: aload 0
      // 2bc: sipush 10646
      // 2bf: ldc2_w 6730149399171501873
      // 2c2: lload 4
      // 2c4: lxor
      // 2c5: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: lload 10
      // 2cc: sipush 12760
      // 2cf: ldc2_w 8240325540580923256
      // 2d2: lload 4
      // 2d4: lxor
      // 2d5: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: new java/lang/StringBuilder
      // 2dd: dup
      // 2de: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e1: sipush 1047
      // 2e4: ldc2_w 6169777592161968822
      // 2e7: lload 4
      // 2e9: lxor
      // 2ea: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f2: ldc2_w -7168317080281709620
      // 2f5: lload 4
      // 2f7: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ff: sipush 32421
      // 302: ldc2_w 7291598022027106312
      // 305: lload 4
      // 307: lxor
      // 308: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/d8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 310: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 313: bipush 5
      // 314: anewarray 315
      // 317: dup_x1
      // 318: swap
      // 319: bipush 4
      // 31a: swap
      // 31b: aastore
      // 31c: dup_x1
      // 31d: swap
      // 31e: bipush 3
      // 31f: swap
      // 320: aastore
      // 321: dup_x2
      // 322: dup_x2
      // 323: pop
      // 324: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 327: bipush 2
      // 328: swap
      // 329: aastore
      // 32a: dup_x1
      // 32b: swap
      // 32c: bipush 1
      // 32d: swap
      // 32e: aastore
      // 32f: dup_x1
      // 330: swap
      // 331: bipush 0
      // 332: swap
      // 333: aastore
      // 334: ldc2_w -7163683062967333918
      // 337: lload 4
      // 339: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: pop
      // 33f: goto 34d
      // 342: ldc2_w -8791443051312729267
      // 345: lload 4
      // 347: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: athrow
      // 34d: bipush 1
      // 34e: istore 22
      // 350: iload 22
      // 352: ireturn
   }

   static {
      long var0 = a ^ 96694742476271L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[26];
      int var7 = 0;
      String var6 = "à\u008d\u0089%|\u0095\u0084ÒNy\u009d\u0016'\u000fØ\u0087(\u0094nº\u009f\u0001àÄÚhò{ª\u0018Á\u0000x\u0018\u0089ôíÖ\f¹\u007fnÃi\u00adÒ-eõÅùÂTÃ:k\u0004\u0010\u0098MÊ\u008dp\u001fQM\n\u008e\u0087\u00ad\u0099\u00801¡ \u0085uÊ¤vJ8\u0097\u008eÊ~\ne\u0007û@\u008d\t´\u001f\u0091²\u0014è\u009aè\u008bÍèUÛ¯ §¢ÔçÖ\u0012³¸7p\u0002û¨\u0091\u001d½LT\u0089\u0087t\u001cðì\u0087Ã&±i7\u008cb\u0018´p\u0091sLÔß%{Û9ÒHçà6©xÉ\tø¡¥\\(Ãä\u0084\u009eÉ\u000f\u009eb!\u008f}¹:×³\rÕê¶n>\u0018©ç½,s\u0090ç¥!*\u0005\u0099aå/\u0085r2p\u00adi¨wú¹`9MçÇ'7Ï\"bø~ÜKD\u009a\u0001 c%\u0082\u009dõq7\u008bç>\u0014Z;Pêsäñ4ìR\u0017l?ñ\u0083\u009eÀÔ níhÕÿ¢ÿË\u001f\u008d\u0001O\u0092¿\u0088m\u0091³}\u0093\u0001H5*Tîy\u0012mR\u009dN1B\u0011\u001aÉ¯\u000baÚ_m\"\u008fU\u001fÌÛ^¯\u0017\u0010ñD\u0001zé\u0010#Ý¥×½ý;Ê\u0099«]3t\"ö\u0010ø\u0012eõÀ\u001b²©æ\u0013§+ûÁ7¯êi±¦°Þ¬Ç«\b8\u0089ÏeÛ^B[\u0093\u0003w\u0085Ç·ÝU`\u0013^Yï2¨ÕOªeáb\u0080Ã\u008c·@K¶ÊÒ¤µ6æ^\u0083\u0098\u007f®\u000f\"þ¦(ìEÆ\u001f)©\u0002\u0085\u0092\u009bª\u0004ä°Ý©L\u0096Óz\u0010¹\u008fêàkE_·ê¡ \u0015\u001f\u001b\u00017j\u001eÀ\u0084 ¤U8nÃÇ\u0000\u0013e\u0088 J°¬ï¤\u0086\u008d\u001b\u008c\u008fpýÐ§¹n£Î¼µ\u0003\u0091\u0007l2å¿\\äÏÊ\rj$ë!×D\u008bÒÊÚÑª2\u0014Ì%Â\u001c]\u0017M[µ¡WÝ8éû\u008eû®\u000b²Ö®Ý\u0084?5½ÿ2\u0084oÜnN3ø7?×ÿ\u001cÞ6ð\u0019\u0013MjÅ\u0092aÓhõè§B<ø\u0095CÉçÌ\u0085Ü¸\u001a;ÃÇh\u0010?\u0097V¥N\u009byM\u008fÀY\u0004£\\¶;\u0010gi\u0088%6 ß\fQ\u00109AHf0û\u0010_n½fObè\u001904\u0011Uw5ØF ¥ôóYa»Ë\u0015ò\b\u001c.øÂä÷î<\fÜØ\u00014\u0091½\u0001\r%¬bÖ\u0094(¶\u0012ü@^ê?ulCö\u0001\u0000\u0010r\u0007«\u0097æM*\u000f°hW)¢\u0083i\u009bÑ(p2¥\u00919½G1(J&Çi©ìµ²F\u008cpp´±ÉðC\u001bXE(ãg\rÐ¸ëPM¼]Íà\"\u0091¿ém²Æ(\"\u001e\rPÝVy9Kêt¨\u0090\u001d\u0014ê\u0097ìª¿ø*\u001a\u0080Ú\u0018Øf¦`½\u0013¿ÄeÉzº§0\u0010[¯\u001e^\u007fÉ\u0005I\u0012<\u0003\u0093¿RÂ¡\u0010É\u001d_\f¹\u0002»þ|\u0097SÚÅòI$\u00109eå\u0012\u0096Ë\u0081Ù\u0080Åk£Q\u0011\u0090È (\u0080Ûj«X-\u0092>KUQ[d\u0095~\u0082úÊ\u0081\u00adÔØÒ\u0000%ìg±p16 _\u0007\u0017úÝ]µ\u0013b2\u009feb\u001495Pþhkë»mK\u0001Æ\u001f[³Æ\u000e9(\u0004£è\u008afUôj5\u0017S^\u0096\u008b%!YÃ¤\u0088×G\u000b\u0082@\u0084\"\u0094ñ=ºµ\u0080\u009bá\u008523', \u008eþ;Êéµ\u0013#ìP?÷\u0005Íkm\u0099L\u009f-Ú²-s\u0081rf\u009d\u0082HÁ-";
      int var8 = "à\u008d\u0089%|\u0095\u0084ÒNy\u009d\u0016'\u000fØ\u0087(\u0094nº\u009f\u0001àÄÚhò{ª\u0018Á\u0000x\u0018\u0089ôíÖ\f¹\u007fnÃi\u00adÒ-eõÅùÂTÃ:k\u0004\u0010\u0098MÊ\u008dp\u001fQM\n\u008e\u0087\u00ad\u0099\u00801¡ \u0085uÊ¤vJ8\u0097\u008eÊ~\ne\u0007û@\u008d\t´\u001f\u0091²\u0014è\u009aè\u008bÍèUÛ¯ §¢ÔçÖ\u0012³¸7p\u0002û¨\u0091\u001d½LT\u0089\u0087t\u001cðì\u0087Ã&±i7\u008cb\u0018´p\u0091sLÔß%{Û9ÒHçà6©xÉ\tø¡¥\\(Ãä\u0084\u009eÉ\u000f\u009eb!\u008f}¹:×³\rÕê¶n>\u0018©ç½,s\u0090ç¥!*\u0005\u0099aå/\u0085r2p\u00adi¨wú¹`9MçÇ'7Ï\"bø~ÜKD\u009a\u0001 c%\u0082\u009dõq7\u008bç>\u0014Z;Pêsäñ4ìR\u0017l?ñ\u0083\u009eÀÔ níhÕÿ¢ÿË\u001f\u008d\u0001O\u0092¿\u0088m\u0091³}\u0093\u0001H5*Tîy\u0012mR\u009dN1B\u0011\u001aÉ¯\u000baÚ_m\"\u008fU\u001fÌÛ^¯\u0017\u0010ñD\u0001zé\u0010#Ý¥×½ý;Ê\u0099«]3t\"ö\u0010ø\u0012eõÀ\u001b²©æ\u0013§+ûÁ7¯êi±¦°Þ¬Ç«\b8\u0089ÏeÛ^B[\u0093\u0003w\u0085Ç·ÝU`\u0013^Yï2¨ÕOªeáb\u0080Ã\u008c·@K¶ÊÒ¤µ6æ^\u0083\u0098\u007f®\u000f\"þ¦(ìEÆ\u001f)©\u0002\u0085\u0092\u009bª\u0004ä°Ý©L\u0096Óz\u0010¹\u008fêàkE_·ê¡ \u0015\u001f\u001b\u00017j\u001eÀ\u0084 ¤U8nÃÇ\u0000\u0013e\u0088 J°¬ï¤\u0086\u008d\u001b\u008c\u008fpýÐ§¹n£Î¼µ\u0003\u0091\u0007l2å¿\\äÏÊ\rj$ë!×D\u008bÒÊÚÑª2\u0014Ì%Â\u001c]\u0017M[µ¡WÝ8éû\u008eû®\u000b²Ö®Ý\u0084?5½ÿ2\u0084oÜnN3ø7?×ÿ\u001cÞ6ð\u0019\u0013MjÅ\u0092aÓhõè§B<ø\u0095CÉçÌ\u0085Ü¸\u001a;ÃÇh\u0010?\u0097V¥N\u009byM\u008fÀY\u0004£\\¶;\u0010gi\u0088%6 ß\fQ\u00109AHf0û\u0010_n½fObè\u001904\u0011Uw5ØF ¥ôóYa»Ë\u0015ò\b\u001c.øÂä÷î<\fÜØ\u00014\u0091½\u0001\r%¬bÖ\u0094(¶\u0012ü@^ê?ulCö\u0001\u0000\u0010r\u0007«\u0097æM*\u000f°hW)¢\u0083i\u009bÑ(p2¥\u00919½G1(J&Çi©ìµ²F\u008cpp´±ÉðC\u001bXE(ãg\rÐ¸ëPM¼]Íà\"\u0091¿ém²Æ(\"\u001e\rPÝVy9Kêt¨\u0090\u001d\u0014ê\u0097ìª¿ø*\u001a\u0080Ú\u0018Øf¦`½\u0013¿ÄeÉzº§0\u0010[¯\u001e^\u007fÉ\u0005I\u0012<\u0003\u0093¿RÂ¡\u0010É\u001d_\f¹\u0002»þ|\u0097SÚÅòI$\u00109eå\u0012\u0096Ë\u0081Ù\u0080Åk£Q\u0011\u0090È (\u0080Ûj«X-\u0092>KUQ[d\u0095~\u0082úÊ\u0081\u00adÔØÒ\u0000%ìg±p16 _\u0007\u0017úÝ]µ\u0013b2\u009feb\u001495Pþhkë»mK\u0001Æ\u001f[³Æ\u000e9(\u0004£è\u008afUôj5\u0017S^\u0096\u008b%!YÃ¤\u0088×G\u000b\u0082@\u0084\"\u0094ñ=ºµ\u0080\u009bá\u008523', \u008eþ;Êéµ\u0013#ìP?÷\u0005Íkm\u0099L\u009f-Ú²-s\u0081rf\u009d\u0082HÁ-"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     i = var9;
                     j = new String[26];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "*S§1ÃÐ~\t\u000f\u001b~Lc\u0003½ç\u0018ï\u0089\u000fq\u0001¸F\u000bÙn\u0001\bkæ\u001c\u0096\u0080\u0011\u0090gMB\u008bM";
                  var8 = "*S§1ÃÐ~\t\u000f\u001b~Lc\u0003½ç\u0018ï\u0089\u000fq\u0001¸F\u000bÙn\u0001\bkæ\u001c\u0096\u0080\u0011\u0090gMB\u008bM".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11895;
      if (j[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/d8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = i[var5].getBytes("ISO-8859-1");
         j[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return j[var5];
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
         throw new RuntimeException("com/zelix/d8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
