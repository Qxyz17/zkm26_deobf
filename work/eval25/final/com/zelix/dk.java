package com.zelix;

import java.awt.Container;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Enumeration;
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

public class dk extends dd {
   eq y;
   List q;
   as S;
   String K;
   private static final long a = ess.a(-884916528562863290L, -8408807718750624420L, MethodHandles.lookup().lookupClass()).a(215680803263530L);
   private static final String[] d;
   private static final String[] i;
   private static final Map j = new HashMap(13);

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
      // 29: anewarray 343
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
      // 4f: ldc2_w -6881845948044251305
      // 52: lload 2
      // 53: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: goto 67
      // 5d: ldc2_w -6881845948044251305
      // 60: lload 2
      // 61: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: ldc2_w -4757014254770061649
      // 6a: lload 2
      // 6b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: lload 4
      // 72: bipush 1
      // 73: anewarray 343
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

   boolean E(Object[] var1) {
      String var3 = (String)var1[0];
      Enumeration var2 = (Enumeration)var1[1];
      return true;
   }

   dk(JFrame var1, String var2, List var3, String var4, String var5, String var6, String var7, as var8, eq var9, long var10) {
      var10 = a ^ var10;
      long var12 = var10 ^ 122164702708132L;
      long var14 = var10 ^ 24214072068998L;
      long var16 = var10 ^ 58206265922587L;
      super(var1, var12, var2, var3, var5, var6, var7);
      x44.a<"p">(this, var3, -7005717250875813365L, var10);
      x44.a<"p">(this, var4, -8824871798795153447L, var10);
      x44.a<"p">(this, var9, -8651478204069985093L, var10);
      x44.a<"p">(this, var8, -7477156298485586793L, var10);
      x44.a<"k">(this, new Object[]{var14}, -9140529816624829446L, var10);
      x44.a<"s">(new Object[]{x44.a<"o">(this, -9095586167823316435L, var10), var16}, -7281650651052707220L, var10);
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
      // 00e: ldc2_w 14009861533601
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 27086674183498
      // 018: lxor
      // 019: lstore 6
      // 01b: pop2
      // 01c: aload 0
      // 01d: ldc2_w 9007725502273611353
      // 020: lload 2
      // 021: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: ldc2_w 8938497533280200981
      // 029: lload 2
      // 02a: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: istore 9
      // 031: new java/util/ArrayList
      // 034: dup
      // 035: iload 9
      // 037: invokespecial java/util/ArrayList.<init> (I)V
      // 03a: astore 10
      // 03c: ldc2_w 7309120369317419253
      // 03f: lload 2
      // 040: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: new java/lang/StringBuilder
      // 048: dup
      // 049: invokespecial java/lang/StringBuilder.<init> ()V
      // 04c: astore 11
      // 04e: bipush 0
      // 04f: istore 12
      // 051: astore 8
      // 053: iload 12
      // 055: iload 9
      // 057: if_icmpge 123
      // 05a: aload 0
      // 05b: ldc2_w 9007725502273611353
      // 05e: lload 2
      // 05f: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: iload 12
      // 066: ldc2_w 7156456407076138416
      // 069: lload 2
      // 06a: invokedynamic m (Ljava/lang/Object;IJJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: checkcast java/io/File
      // 072: astore 13
      // 074: aload 13
      // 076: aload 8
      // 078: ifnull 0d0
      // 07b: ldc2_w 9032400208770999373
      // 07e: lload 2
      // 07f: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: ifne 0c1
      // 087: goto 094
      // 08a: ldc2_w 7292696899013552669
      // 08d: lload 2
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 13
      // 096: ldc2_w 9004097041191744537
      // 099: lload 2
      // 09a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0a2: astore 14
      // 0a4: aload 10
      // 0a6: aload 14
      // 0a8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ad: pop
      // 0ae: aload 11
      // 0b0: aload 14
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b5: pop
      // 0b6: lload 2
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: ifle 0f0
      // 0bc: aload 8
      // 0be: ifnonnull 0f0
      // 0c1: aload 13
      // 0c3: goto 0d0
      // 0c6: ldc2_w 7292696899013552669
      // 0c9: lload 2
      // 0ca: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: ldc2_w 8958875926323999831
      // 0d3: lload 2
      // 0d4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0dc: astore 14
      // 0de: aload 10
      // 0e0: aload 14
      // 0e2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e7: pop
      // 0e8: aload 11
      // 0ea: aload 14
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: pop
      // 0f0: lload 2
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: ifle 11e
      // 0f6: iload 12
      // 0f8: iload 9
      // 0fa: bipush 1
      // 0fb: isub
      // 0fc: if_icmpge 11b
      // 0ff: aload 11
      // 101: ldc2_w 7323643575229689456
      // 104: lload 2
      // 105: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: pop
      // 10e: goto 11b
      // 111: ldc2_w 7292696899013552669
      // 114: lload 2
      // 115: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: iinc 12 1
      // 11e: aload 8
      // 120: ifnonnull 053
      // 123: aload 11
      // 125: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 128: lload 2
      // 129: lconst_0
      // 12a: lcmp
      // 12b: ifle 06f
      // 12e: astore 12
      // 130: aload 0
      // 131: aload 8
      // 133: ifnull 1db
      // 136: ldc2_w 8852299697844269191
      // 139: lload 2
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: iflt 1b7
      // 13f: lload 2
      // 140: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: aload 12
      // 147: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14a: ifne 1a9
      // 14d: goto 15a
      // 150: ldc2_w 7292696899013552669
      // 153: lload 2
      // 154: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: aload 0
      // 15b: aload 8
      // 15d: ifnull 1db
      // 160: goto 16d
      // 163: ldc2_w 7292696899013552669
      // 166: lload 2
      // 167: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: aload 12
      // 16f: aload 0
      // 170: ldc2_w 9007725502273611353
      // 173: lload 2
      // 174: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: ldc2_w 7058469156395909252
      // 17c: lload 2
      // 17d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: bipush 2
      // 183: anewarray 343
      // 186: dup_x1
      // 187: swap
      // 188: bipush 1
      // 189: swap
      // 18a: aastore
      // 18b: dup_x1
      // 18c: swap
      // 18d: bipush 0
      // 18e: swap
      // 18f: aastore
      // 190: ldc2_w 8668403289166676847
      // 193: lload 2
      // 194: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: ifeq 215
      // 19c: goto 1a9
      // 19f: ldc2_w 7292696899013552669
      // 1a2: lload 2
      // 1a3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: bipush 1
      // 1ab: ldc2_w 9202281813474255453
      // 1ae: lload 2
      // 1af: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: aload 0
      // 1b5: lload 6
      // 1b7: bipush 1
      // 1b8: anewarray 343
      // 1bb: dup_x2
      // 1bc: dup_x2
      // 1bd: pop
      // 1be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c1: bipush 0
      // 1c2: swap
      // 1c3: aastore
      // 1c4: ldc2_w 7314386891207740648
      // 1c7: lload 2
      // 1c8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: aload 0
      // 1ce: goto 1db
      // 1d1: ldc2_w 7292696899013552669
      // 1d4: lload 2
      // 1d5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: ldc2_w 8696917209401932773
      // 1de: lload 2
      // 1df: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: aload 10
      // 1e6: aload 12
      // 1e8: bipush 1
      // 1e9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ec: lload 4
      // 1ee: dup2_x1
      // 1ef: pop2
      // 1f0: bipush 4
      // 1f1: anewarray 343
      // 1f4: dup_x1
      // 1f5: swap
      // 1f6: bipush 3
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x2
      // 1fa: dup_x2
      // 1fb: pop
      // 1fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ff: bipush 2
      // 200: swap
      // 201: aastore
      // 202: dup_x1
      // 203: swap
      // 204: bipush 1
      // 205: swap
      // 206: aastore
      // 207: dup_x1
      // 208: swap
      // 209: bipush 0
      // 20a: swap
      // 20b: aastore
      // 20c: ldc2_w 7004011425663957751
      // 20f: lload 2
      // 210: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   protected void M(Object[] var1) {
      Object var7 = var1[0];
      Object var5 = var1[1];
      Object var6 = var1[2];
      Object var2 = var1[3];
      Object var3 = var1[4];
      Object var10 = var1[5];
      Object var4 = var1[6];
      long var8 = (Long)var1[7];
      long var11 = var8 ^ 297298040212L;
      long var13 = var8 ^ 45554541515499L;
      long var15 = var8 ^ 33512356773684L;
      long var17 = var8 ^ 35309586951409L;
      long var19 = var8 ^ 95577780075609L;
      long var10001 = var8 ^ 17269891170557L;
      int var21 = (int)((var8 ^ 17269891170557L) >>> 48);
      int var22 = (int)((var8 ^ 17269891170557L) << 16 >>> 32);
      int var23 = (int)(var10001 << 48 >>> 48);
      long var24 = var8 ^ 60806348823376L;
      long var26 = var8 ^ 41154306738481L;
      long var28 = var8 ^ 5056776641392L;
      long var30 = var8 ^ 121011386763584L;
      long var32 = var8 ^ 100515280996879L;
      long var34 = var8 ^ 76487848691270L;
      long var36 = var8 ^ 71640382701036L;
      x44.a<"p">(this, x44.a<"s">(new Object[]{var13}, -6982963201578403464L, var8), -8981709812944476158L, var8);
      List var39 = (List)var7;
      String var40 = (String)var5;
      String var41 = (String)var6;
      String var42 = (String)var2;
      int[] var10000 = x44.a<"s">(-8844655890591221541L, var8);
      Container var43 = x44.a<"k">(this, -7244352668283436925L, var8);
      _s4 var44 = new _s4(var32, var43);
      x44.a<"k">(var43, var44, -8907197129527157909L, var8);
      tt var45 = new tt((char)var21, var22, false, true, 5, (char)var23, 5);
      int[] var38 = var10000;
      _s4 var46 = new _s4(var32, var45);

      label54: {
         label58: {
            try {
               x44.a<"k">(var45, var46, -9034873776369358809L, var8);
               x44.a<"p">(this, new JLabel(var40), -8936427198730026750L, var8);
               x44.a<"k">(var45, x44.a<"o">(this, -8936427198730026750L, var8), c<"q">(1053, 6535429435988309210L ^ var8), -8839335514784156150L, var8);
               x44.a<"p">(this, new q5(var28, new DefaultListModel()), -8953598576910851160L, var8);
               x44.a<"p">(
                  this, (DefaultListModel)x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var8), -7456302456577042002L, var8), -7120313560445745545L, var8
               );
               if (var38 == null) {
                  break label54;
               }

               if (var39 == null) {
                  break label58;
               }
            } catch (gj var49) {
               throw x44.a<"s">(var49, -8855603931199747533L, var8);
            }

            label52:
            for (String var48 : var39) {
               try {
                  x44.a<"k">(this, new Object[]{var48, var19}, -7222340850422530871L, var8);
               } catch (gj var51) {
                  boolean var55 = false;
                  throw x44.a<"s">(var51, -8855603931199747533L, var8);
               }

               while (true) {
                  try {
                     var10000 = var38;
                     if (var8 >= 0L) {
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
                     throw x44.a<"s">(var50, -8855603931199747533L, var8);
                  }

                  if (var8 >= 0L) {
                     break label52;
                  }
               }
            }
         }

         x44.a<"k">(var45, new uo(x44.a<"o">(this, -8953598576910851160L, var8), var24), c<"q">(2813, 8738563328164002367L ^ var8), -8839335514784156150L, var8);
         x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var8), 2, -9147683637724418281L, var8);
         x44.a<"p">(this, new JButton(c<"q">(23770, 3259638674335312919L ^ var8)), -7429688383397806281L, var8);
         x44.a<"k">(
            x44.a<"o">(this, -7429688383397806281L, var8),
            x44.a<"s">(new Object[]{c<"q">(14996, 1655394536227392073L ^ var8), var26}, -9060970373903050785L, var8),
            -7012224312561665088L,
            var8
         );
         x44.a<"k">(var45, x44.a<"o">(this, -7429688383397806281L, var8), c<"q">(26332, 2118045488968406547L ^ var8), -8839335514784156150L, var8);
         x44.a<"p">(this, new JButton(c<"q">(22983, 824402371313084697L ^ var8)), -6967992343712920248L, var8);
         x44.a<"k">(
            x44.a<"o">(this, -6967992343712920248L, var8),
            x44.a<"s">(new Object[]{c<"q">(20740, 6014532694665109964L ^ var8), var26}, -9060970373903050785L, var8),
            -7012224312561665088L,
            var8
         );
         x44.a<"k">(var45, x44.a<"o">(this, -6967992343712920248L, var8), c<"q">(23388, 2225019522067671952L ^ var8), -8839335514784156150L, var8);
         x44.a<"p">(this, new JButton(c<"q">(10222, 1665781159385323300L ^ var8)), -7063282592745791582L, var8);
         x44.a<"k">(
            x44.a<"o">(this, -7063282592745791582L, var8),
            x44.a<"s">(new Object[]{c<"q">(13400, 9087976386474624132L ^ var8), var26}, -9060970373903050785L, var8),
            -7012224312561665088L,
            var8
         );
         x44.a<"k">(var45, x44.a<"o">(this, -7063282592745791582L, var8), c<"q">(21382, 8955683816184718146L ^ var8), -8839335514784156150L, var8);
         x44.a<"p">(this, new JButton(c<"q">(10297, 6303181898372307196L ^ var8)), -8702381759462028581L, var8);
         x44.a<"k">(
            x44.a<"o">(this, -8702381759462028581L, var8),
            x44.a<"s">(new Object[]{c<"q">(30015, 8072862384731653600L ^ var8), var26}, -9060970373903050785L, var8),
            -7012224312561665088L,
            var8
         );
         x44.a<"k">(var45, x44.a<"o">(this, -8702381759462028581L, var8), c<"q">(4182, 7264439231501951135L ^ var8), -8839335514784156150L, var8);
         x44.a<"k">(var46, new Object[]{x44.a<"j">(-8710251634882384470L, var8), var34}, -6986909492850926929L, var8);
         x44.a<"k">(var43, var45, c<"q">(11100, 1386976884014209938L ^ var8), -8717886799741620868L, var8);
         x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var8), this, -7428223235030437049L, var8);
         x44.a<"k">(x44.a<"o">(this, -8953598576910851160L, var8), this, -8958712241607375136L, var8);
         x44.a<"k">(x44.a<"o">(this, -6967992343712920248L, var8), this, -8920966476704791143L, var8);
         x44.a<"k">(x44.a<"o">(this, -7063282592745791582L, var8), this, -8920966476704791143L, var8);
         x44.a<"k">(x44.a<"o">(this, -8702381759462028581L, var8), this, -8920966476704791143L, var8);
         x44.a<"k">(x44.a<"o">(this, -7429688383397806281L, var8), this, -8920966476704791143L, var8);
         x44.a<"k">(x44.a<"o">(this, -6967992343712920248L, var8), this, -8818436412853440062L, var8);
         x44.a<"k">(x44.a<"o">(this, -7063282592745791582L, var8), this, -8818436412853440062L, var8);
         x44.a<"k">(x44.a<"o">(this, -8702381759462028581L, var8), this, -8818436412853440062L, var8);
         x44.a<"k">(x44.a<"o">(this, -7429688383397806281L, var8), this, -8818436412853440062L, var8);
         x44.a<"k">(this, new Object[]{var30}, -8674532747485436261L, var8);
      }

      StringBuffer var52 = new StringBuffer(c<"q">(3433, 3153782222899183018L ^ var8));
      x44.a<"k">(this, new Object[]{var15, var41, var42, var52, var43}, -8835157473265147301L, var8);
      x44.a<"k">(var44, new Object[]{var36, var52.toString()}, -7313353165823419638L, var8);
      x44.a<"k">(this, x44.a<"s">(new Object[]{this, var11}, -8691864418112648565L, var8), -8994863977904688957L, var8);
      x44.a<"s">(new Object[]{this, var17}, -8922908125232722563L, var8);
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
      // 03d: ldc2_w 26936891530797
      // 040: lxor
      // 041: lstore 11
      // 043: dup2
      // 044: ldc2_w 63803447196964
      // 047: lxor
      // 048: lstore 13
      // 04a: dup2
      // 04b: ldc2_w 7596526824003
      // 04e: lxor
      // 04f: lstore 15
      // 051: pop2
      // 052: ldc2_w -3216933177191354687
      // 055: lload 2
      // 056: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aconst_null
      // 05c: astore 18
      // 05e: astore 17
      // 060: aload 0
      // 061: ldc2_w -3363699015472943619
      // 064: lload 2
      // 065: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: ldc2_w -3733389433782040797
      // 06d: lload 2
      // 06e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: ifnull 0e3
      // 076: new java/io/File
      // 079: dup
      // 07a: aload 0
      // 07b: ldc2_w -3363699015472943619
      // 07e: lload 2
      // 07f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: ldc2_w -3733389433782040797
      // 087: lload 2
      // 088: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 090: astore 19
      // 092: aload 19
      // 094: ldc2_w -3239433206397368841
      // 097: lload 2
      // 098: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: aload 17
      // 09f: ifnull 0dc
      // 0a2: ifeq 0e3
      // 0a5: goto 0b2
      // 0a8: ldc2_w -3242377184758719447
      // 0ab: lload 2
      // 0ac: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 19
      // 0b4: aload 17
      // 0b6: ifnull 0e1
      // 0b9: goto 0c6
      // 0bc: ldc2_w -3242377184758719447
      // 0bf: lload 2
      // 0c0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: ldc2_w -3262173659343072933
      // 0c9: lload 2
      // 0ca: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: goto 0dc
      // 0d2: ldc2_w -3242377184758719447
      // 0d5: lload 2
      // 0d6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: ifeq 0e3
      // 0df: aload 19
      // 0e1: astore 18
      // 0e3: bipush 2
      // 0e4: anewarray 198
      // 0e7: dup
      // 0e8: bipush 0
      // 0e9: new com/zelix/pp
      // 0ec: dup
      // 0ed: invokespecial com/zelix/pp.<init> ()V
      // 0f0: aastore
      // 0f1: dup
      // 0f2: bipush 1
      // 0f3: new com/zelix/pm
      // 0f6: dup
      // 0f7: invokespecial com/zelix/pm.<init> ()V
      // 0fa: aastore
      // 0fb: astore 19
      // 0fd: new com/zelix/q_
      // 100: dup
      // 101: aload 18
      // 103: bipush 1
      // 104: bipush 1
      // 105: lload 9
      // 107: aload 19
      // 109: bipush 0
      // 10a: bipush 0
      // 10b: invokespecial com/zelix/q_.<init> (Ljava/io/File;ZIJ[Lcom/zelix/pt;IZ)V
      // 10e: astore 20
      // 110: aload 20
      // 112: aload 0
      // 113: lload 13
      // 115: sipush 12161
      // 118: ldc2_w 5405987650759330141
      // 11b: lload 2
      // 11c: lxor
      // 11d: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/dk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: bipush 3
      // 123: anewarray 343
      // 126: dup_x1
      // 127: swap
      // 128: bipush 2
      // 129: swap
      // 12a: aastore
      // 12b: dup_x2
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 131: bipush 1
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 0
      // 137: swap
      // 138: aastore
      // 139: ldc2_w -3692770668728505375
      // 13c: lload 2
      // 13d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: istore 21
      // 144: iload 21
      // 146: bipush 1
      // 147: if_icmpne 2db
      // 14a: aload 20
      // 14c: iload 6
      // 14e: i2s
      // 14f: iload 7
      // 151: iload 8
      // 153: bipush 3
      // 154: anewarray 343
      // 157: dup_x1
      // 158: swap
      // 159: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15c: bipush 2
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x1
      // 160: swap
      // 161: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 164: bipush 1
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16c: bipush 0
      // 16d: swap
      // 16e: aastore
      // 16f: ldc2_w -3763367760451797766
      // 172: lload 2
      // 173: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: astore 22
      // 17a: bipush 0
      // 17b: istore 23
      // 17d: iload 23
      // 17f: aload 22
      // 181: arraylength
      // 182: if_icmpge 2db
      // 185: aload 22
      // 187: iload 23
      // 189: aaload
      // 18a: astore 24
      // 18c: aload 24
      // 18e: ldc2_w -3864004772617223581
      // 191: lload 2
      // 192: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: astore 25
      // 199: aload 17
      // 19b: ifnull 2d0
      // 19e: aload 24
      // 1a0: ldc2_w -3239433206397368841
      // 1a3: lload 2
      // 1a4: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: ifeq 285
      // 1ac: goto 1b9
      // 1af: ldc2_w -3242377184758719447
      // 1b2: lload 2
      // 1b3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: aload 17
      // 1bc: ifnull 209
      // 1bf: goto 1cc
      // 1c2: ldc2_w -3242377184758719447
      // 1c5: lload 2
      // 1c6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: aload 25
      // 1ce: lload 15
      // 1d0: bipush 2
      // 1d1: anewarray 343
      // 1d4: dup_x2
      // 1d5: dup_x2
      // 1d6: pop
      // 1d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1da: bipush 1
      // 1db: swap
      // 1dc: aastore
      // 1dd: dup_x1
      // 1de: swap
      // 1df: bipush 0
      // 1e0: swap
      // 1e1: aastore
      // 1e2: ldc2_w -3612090006930396461
      // 1e5: lload 2
      // 1e6: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: ifeq 221
      // 1ee: goto 1fb
      // 1f1: ldc2_w -3242377184758719447
      // 1f4: lload 2
      // 1f5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: goto 209
      // 1ff: ldc2_w -3242377184758719447
      // 202: lload 2
      // 203: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: lload 4
      // 20b: bipush 1
      // 20c: anewarray 343
      // 20f: dup_x2
      // 210: dup_x2
      // 211: pop
      // 212: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 215: bipush 0
      // 216: swap
      // 217: aastore
      // 218: ldc2_w -3348551216936619903
      // 21b: lload 2
      // 21c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: aload 24
      // 223: ldc2_w -3116557111482981806
      // 226: lload 2
      // 227: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: astore 26
      // 22e: aload 17
      // 230: ifnull 267
      // 233: aload 26
      // 235: ifnull 27a
      // 238: goto 245
      // 23b: ldc2_w -3242377184758719447
      // 23e: lload 2
      // 23f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: athrow
      // 245: aload 0
      // 246: ldc2_w -3363699015472943619
      // 249: lload 2
      // 24a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: aload 26
      // 251: ldc2_w -3724937600273390516
      // 254: lload 2
      // 255: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: goto 267
      // 25d: ldc2_w -3242377184758719447
      // 260: lload 2
      // 261: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: aload 0
      // 268: ldc2_w -3363699015472943619
      // 26b: lload 2
      // 26c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: ldc2_w -3312944575085210785
      // 274: lload 2
      // 275: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: aload 17
      // 27c: lload 2
      // 27d: lconst_0
      // 27e: lcmp
      // 27f: iflt 2d8
      // 282: ifnonnull 2d3
      // 285: new com/zelix/wf
      // 288: dup
      // 289: aload 0
      // 28a: sipush 26393
      // 28d: ldc2_w 5664603847566868930
      // 290: lload 2
      // 291: lxor
      // 292: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/dk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: new java/lang/StringBuilder
      // 29a: dup
      // 29b: invokespecial java/lang/StringBuilder.<init> ()V
      // 29e: ldc "'"
      // 2a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a3: aload 25
      // 2a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a8: sipush 9539
      // 2ab: ldc2_w 4407915771594572697
      // 2ae: lload 2
      // 2af: lxor
      // 2b0: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/dk.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2bb: lload 11
      // 2bd: dup2_x1
      // 2be: pop2
      // 2bf: invokespecial com/zelix/wf.<init> (Ljava/awt/Frame;Ljava/lang/String;JLjava/lang/String;)V
      // 2c2: pop
      // 2c3: goto 2d0
      // 2c6: ldc2_w -3242377184758719447
      // 2c9: lload 2
      // 2ca: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: goto 2db
      // 2d3: iinc 23 1
      // 2d6: aload 17
      // 2d8: ifnonnull 17d
      // 2db: return
   }

   protected void Z(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 11513958743392L;
      long var6 = var2 ^ 113826629411850L;
      x44.a<"v">(this, true, 6842495783614513949L, var2);
      x44.a<"m">(this, new Object[]{var6}, 4954402947106483624L, var2);
      x44.a<"m">(x44.a<"i">(this, 6481197988830648997L, var2), new Object[]{var4}, 6565146161145330487L, var2);
   }

   protected void s(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 96220742129266L;
      x44.a<"q">(new Object[]{c<"q">(21741, 5847021201573239004L ^ var2), var4}, 7393910029253152720L, var2);
   }

   static {
      long var0 = a ^ 56331148573881L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[20];
      int var7 = 0;
      String var6 = "ýÁkº×Ò½ö#wcíB¹îÄ\u0018q;\u008bÞ\u007fçf,+Õ\u008càÇ\u0095@¸¾\u009då\u008f\r~Næ\u0018!¢°\b4U\u008a\u0085\u0007/\u0091b\u0085+ñd-\u000b\u001d·`\u008fz@\u0010ÿ?´\u0015S\u0017õ?´þµ\u0086÷\u008c/1\u0010ËÍ#\u0015/@¡*Ì©\u008a%\u001de)Ý(SÎ«ý»\u0000<:nÜg>Üw\u009bÖlt;ÝìÚQF³Õ¯¿£0ëmj\\\u0082Zðm=é\u0010,Ð\u0091\u0099?\u009ef\u001bBX¡\u0084§¯A¬\u0010ÅÍÐ\u008dr\u0017>C.×\u001b%ïWÛ@ \u0007ö\u0082Ä÷ÁüÚÂ5\u008a«)\u00958\u001bsËê\u0089ÛLü%f/\u009692¬T¬\u0010h¹ $}å/öß\u0092©8Ö\u0083«\u0004\u0010\u00900ë+\u0090\u0005øL-OÏ·¨¿öÁ(]áO/®\u0099p~%vgq¡ºÄ\u009b\u009d)õ¶¦Ú{Óo\u0088\u0091\u008eÝ\"\u008cÌ\f¸£\u0092_ÄËÚ ÕÆqöÈoÐ[þ@)ìÒ¿så\u0015Pæ\u008dâÌ\u0015Ò¤³\u0087\u0087øQ6ï(\u001dó¦\u0096xÖÍ³{o\u0000ÚÞð\u0005ç\u0096\u000bo7\u0095\u0007þ\nX>¬¥kl³Ã\u009cßÛ¿:\u009c\u008e±ð«/\u00171kD\fvA\u0082tY¸á|É?\u00177.a\u0003®]L¸x0\"^QM}H\u001cràG\u008d¯â\u008cN>»ùÁ¡chí\u0015ý<-»>³<ûú¾U¶Qq\u0015ô\u0002+&\u0018©\u00adÆ\u0005\u0089'üà¦\u0097\u0013\u009b\u0089\u0015\u0096 ð%\u0011ú·4Qþg~®\u0090¨ÛB\u0097¯J à1.\u001fM\u008c\u0094úT´\u0000½WÐ \u0015º47¹òo\u0095§®\u0005·Q\u008d&V¡\b®,ÉQ#¬{\u0006`Vå\u0014ùÛ<\u0013ýx\u0089¬\" ëfA·\u0081Lºð\u0011ßF«ýækÞáb\u0080C´ª Î$Ð\u009aG\u000eÚ=G-7\rnÝ\u009fJ{ìèE\u0093¤#\u0098\u0098Ëþ\u0001ouV\u008a*½\u0097>¿r*P1á\u0094\u0019\u0095å?ìÜoÈ®'_e\u0010ä\u0084IaH\u0097ï\u008a[Y¯P_,æ¨ º\u0080\u0010QLßkÊ\"DO³d\u000bvÐ%\u0011¼ò\u0006t\u009c@Çâ#0.¾yá\u0018Fäÿ1¯§\\\u0087\u00ad\u0097%¡ùÂ'\u0082dá&\u008cx&y#";
      int var8 = "ýÁkº×Ò½ö#wcíB¹îÄ\u0018q;\u008bÞ\u007fçf,+Õ\u008càÇ\u0095@¸¾\u009då\u008f\r~Næ\u0018!¢°\b4U\u008a\u0085\u0007/\u0091b\u0085+ñd-\u000b\u001d·`\u008fz@\u0010ÿ?´\u0015S\u0017õ?´þµ\u0086÷\u008c/1\u0010ËÍ#\u0015/@¡*Ì©\u008a%\u001de)Ý(SÎ«ý»\u0000<:nÜg>Üw\u009bÖlt;ÝìÚQF³Õ¯¿£0ëmj\\\u0082Zðm=é\u0010,Ð\u0091\u0099?\u009ef\u001bBX¡\u0084§¯A¬\u0010ÅÍÐ\u008dr\u0017>C.×\u001b%ïWÛ@ \u0007ö\u0082Ä÷ÁüÚÂ5\u008a«)\u00958\u001bsËê\u0089ÛLü%f/\u009692¬T¬\u0010h¹ $}å/öß\u0092©8Ö\u0083«\u0004\u0010\u00900ë+\u0090\u0005øL-OÏ·¨¿öÁ(]áO/®\u0099p~%vgq¡ºÄ\u009b\u009d)õ¶¦Ú{Óo\u0088\u0091\u008eÝ\"\u008cÌ\f¸£\u0092_ÄËÚ ÕÆqöÈoÐ[þ@)ìÒ¿så\u0015Pæ\u008dâÌ\u0015Ò¤³\u0087\u0087øQ6ï(\u001dó¦\u0096xÖÍ³{o\u0000ÚÞð\u0005ç\u0096\u000bo7\u0095\u0007þ\nX>¬¥kl³Ã\u009cßÛ¿:\u009c\u008e±ð«/\u00171kD\fvA\u0082tY¸á|É?\u00177.a\u0003®]L¸x0\"^QM}H\u001cràG\u008d¯â\u008cN>»ùÁ¡chí\u0015ý<-»>³<ûú¾U¶Qq\u0015ô\u0002+&\u0018©\u00adÆ\u0005\u0089'üà¦\u0097\u0013\u009b\u0089\u0015\u0096 ð%\u0011ú·4Qþg~®\u0090¨ÛB\u0097¯J à1.\u001fM\u008c\u0094úT´\u0000½WÐ \u0015º47¹òo\u0095§®\u0005·Q\u008d&V¡\b®,ÉQ#¬{\u0006`Vå\u0014ùÛ<\u0013ýx\u0089¬\" ëfA·\u0081Lºð\u0011ßF«ýækÞáb\u0080C´ª Î$Ð\u009aG\u000eÚ=G-7\rnÝ\u009fJ{ìèE\u0093¤#\u0098\u0098Ëþ\u0001ouV\u008a*½\u0097>¿r*P1á\u0094\u0019\u0095å?ìÜoÈ®'_e\u0010ä\u0084IaH\u0097ï\u008a[Y¯P_,æ¨ º\u0080\u0010QLßkÊ\"DO³d\u000bvÐ%\u0011¼ò\u0006t\u009c@Çâ#0.¾yá\u0018Fäÿ1¯§\\\u0087\u00ad\u0097%¡ùÂ'\u0082dá&\u008cx&y#"
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
                     d = var9;
                     i = new String[20];
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

                  var6 = "\teF\u009cqÃÜ\u0013&¼\u009fæ\u0083B9Z\u0098\u0092òs\u0010q\u008d\u0087ñï$d¾ìíÚþe ¡Ob\u009eÀ\u0010.ªõQ\u001f¾¿7ø\u001a×\n·\u009f\u009cÖ";
                  var8 = "\teF\u009cqÃÜ\u0013&¼\u009fæ\u0083B9Z\u0098\u0092òs\u0010q\u008d\u0087ñï$d¾ìíÚþe ¡Ob\u009eÀ\u0010.ªõQ\u001f¾¿7ø\u001a×\n·\u009f\u009cÖ"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25045;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/dk", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("com/zelix/dk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
