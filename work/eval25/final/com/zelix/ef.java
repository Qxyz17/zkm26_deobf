package com.zelix;

import java.awt.Container;
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
import javax.swing.DefaultListModel;

public class ef implements w2, aj {
   Object G;
   px x;
   DefaultListModel I;
   q0 g;
   private static final long a = ess.a(2542582741123887704L, -538698084672888686L, MethodHandles.lookup().lookupClass()).a(262337877399782L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void G(long var1, v_ var3, Object var4, Object var5, Object var6) {
      long var7 = var1 ^ 112122282961382L;
      new _nz(this, var7, var3, var4, var5, var6);
   }

   public ef(long var1, px var3, q0 var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 124025148049328L;
      long var7 = var1 ^ 60064937286817L;
      super();
      x44.a<"u">(this, var3, 2620848096692219631L, var1);
      x44.a<"u">(this, var4, 4109114942101271113L, var1);
      x44.a<"u">(this, (DefaultListModel)x44.a<"n">(var4, 4247850743509949207L, var1), 2686911870780187226L, var1);
      x44.a<"n">(x44.a<"j">(this, 2686911870780187226L, var1), a<"n">(10738, 5369117144252742688L ^ var1), 2609041616764930208L, var1);
      x44.a<"n">(x44.a<"j">(this, 4109114942101271113L, var1), false, 2513657394046331433L, var1);
      x44.a<"n">(var3, new Object[]{this, var5}, 2501072605586831018L, var1);
      x44.a<"h">(this, new Object[]{var7}, 4498979698578229808L, var1);
   }

   public void e(Object[] param1) {
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
      // 004: checkcast com/zelix/v_
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Object
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Object
      // 017: astore 7
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 3
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Object
      // 029: astore 2
      // 02a: pop
      // 02b: lload 3
      // 02c: dup2
      // 02d: ldc2_w 97722095999176
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 24402212659390
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 19145398195572
      // 03e: lxor
      // 03f: lstore 12
      // 041: pop2
      // 042: ldc2_w -8823256414617134699
      // 045: lload 3
      // 046: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 6
      // 04d: checkcast com/zelix/px
      // 050: bipush 0
      // 051: anewarray 211
      // 054: ldc2_w -7017943279669731401
      // 057: lload 3
      // 058: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: astore 15
      // 05f: astore 14
      // 061: aload 14
      // 063: ifnonnull 23e
      // 066: aload 15
      // 068: ifnull 1cf
      // 06b: goto 078
      // 06e: ldc2_w -7301685130914413557
      // 071: lload 3
      // 072: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: aload 15
      // 07a: aload 14
      // 07c: lload 3
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: ifle 0bd
      // 082: ifnonnull 0bb
      // 085: goto 092
      // 088: ldc2_w -7301685130914413557
      // 08b: lload 3
      // 08c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: aload 0
      // 093: ldc2_w -7434222365588818852
      // 096: lload 3
      // 097: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: if_acmpeq 257
      // 09f: goto 0ac
      // 0a2: ldc2_w -7301685130914413557
      // 0a5: lload 3
      // 0a6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 15
      // 0ae: goto 0bb
      // 0b1: ldc2_w -7301685130914413557
      // 0b4: lload 3
      // 0b5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 14
      // 0bd: ifnonnull 0f3
      // 0c0: instanceof com/zelix/hy
      // 0c3: ifeq 1ab
      // 0c6: goto 0d3
      // 0c9: ldc2_w -7301685130914413557
      // 0cc: lload 3
      // 0cd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: new javax/swing/DefaultListModel
      // 0d7: dup
      // 0d8: invokespecial javax/swing/DefaultListModel.<init> ()V
      // 0db: ldc2_w -7397456450662588859
      // 0de: lload 3
      // 0df: invokedynamic r (Ljava/lang/Object;Ljavax/swing/DefaultListModel;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: aload 15
      // 0e6: goto 0f3
      // 0e9: ldc2_w -7301685130914413557
      // 0ec: lload 3
      // 0ed: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: checkcast com/zelix/hy
      // 0f6: astore 16
      // 0f8: aload 16
      // 0fa: lload 8
      // 0fc: bipush 1
      // 0fd: anewarray 211
      // 100: dup_x2
      // 101: dup_x2
      // 102: pop
      // 103: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: ldc2_w -9121966046393493048
      // 10c: lload 3
      // 10d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: astore 17
      // 114: aload 17
      // 116: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 11b: ifeq 17a
      // 11e: aload 17
      // 120: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 125: checkcast com/zelix/p8
      // 128: astore 18
      // 12a: aload 0
      // 12b: ldc2_w -7397456450662588859
      // 12e: lload 3
      // 12f: lload 3
      // 130: lconst_0
      // 131: lcmp
      // 132: iflt 19c
      // 135: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: aload 18
      // 13c: lload 12
      // 13e: bipush 1
      // 13f: anewarray 211
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w -7086622891499162038
      // 14e: lload 3
      // 14f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: ldc2_w -7482153436020230977
      // 157: lload 3
      // 158: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: aload 14
      // 15f: ifnonnull 197
      // 162: aload 14
      // 164: ifnull 114
      // 167: lload 3
      // 168: lconst_0
      // 169: lcmp
      // 16a: ifle 15d
      // 16d: goto 17a
      // 170: ldc2_w -7301685130914413557
      // 173: lload 3
      // 174: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: aload 0
      // 17b: ldc2_w -8855868153561510314
      // 17e: lload 3
      // 17f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: aload 0
      // 185: ldc2_w -7397456450662588859
      // 188: lload 3
      // 189: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: ldc2_w -8685470865049113584
      // 191: lload 3
      // 192: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: aload 0
      // 198: ldc2_w -8855868153561510314
      // 19b: lload 3
      // 19c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: bipush 1
      // 1a2: ldc2_w -6990309526492817866
      // 1a5: lload 3
      // 1a6: invokedynamic i (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: aload 0
      // 1ac: lload 10
      // 1ae: bipush 1
      // 1af: anewarray 211
      // 1b2: dup_x2
      // 1b3: dup_x2
      // 1b4: pop
      // 1b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b8: bipush 0
      // 1b9: swap
      // 1ba: aastore
      // 1bb: ldc2_w -9047530842858670545
      // 1be: lload 3
      // 1bf: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: lload 3
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: iflt 263
      // 1ca: aload 14
      // 1cc: ifnull 257
      // 1cf: aload 0
      // 1d0: new javax/swing/DefaultListModel
      // 1d3: dup
      // 1d4: invokespecial javax/swing/DefaultListModel.<init> ()V
      // 1d7: ldc2_w -7397456450662588859
      // 1da: lload 3
      // 1db: invokedynamic r (Ljava/lang/Object;Ljavax/swing/DefaultListModel;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: aload 0
      // 1e1: ldc2_w -7397456450662588859
      // 1e4: lload 3
      // 1e5: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: sipush 27454
      // 1ed: ldc2_w 84488350142399218
      // 1f0: lload 3
      // 1f1: lxor
      // 1f2: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/ef.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: ldc2_w -7482153436020230977
      // 1fa: lload 3
      // 1fb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: aload 0
      // 201: ldc2_w -8855868153561510314
      // 204: lload 3
      // 205: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: aload 0
      // 20b: ldc2_w -7397456450662588859
      // 20e: lload 3
      // 20f: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: ldc2_w -8685470865049113584
      // 217: lload 3
      // 218: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: aload 0
      // 21e: ldc2_w -8855868153561510314
      // 221: lload 3
      // 222: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: bipush 0
      // 228: ldc2_w -6990309526492817866
      // 22b: lload 3
      // 22c: invokedynamic i (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: goto 23e
      // 234: ldc2_w -7301685130914413557
      // 237: lload 3
      // 238: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: aload 0
      // 23f: lload 10
      // 241: bipush 1
      // 242: anewarray 211
      // 245: dup_x2
      // 246: dup_x2
      // 247: pop
      // 248: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24b: bipush 0
      // 24c: swap
      // 24d: aastore
      // 24e: ldc2_w -9047530842858670545
      // 251: lload 3
      // 252: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: aload 0
      // 258: aload 15
      // 25a: ldc2_w -7434222365588818852
      // 25d: lload 3
      // 25e: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: return
   }

   private void R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Container var4 = x44.a<"j">(x44.a<"n">(this, -3304816547395741331L, var2), -3055792201054396123L, var2);
      x44.a<"j">(var4, -3290993502666739820L, var2);
      x44.a<"j">(var4, x44.a<"n">(this, -3304816547395741331L, var2), a<"n">(23226, 4303236672567141455L ^ var2), -3613410411691497563L, var2);
   }

   static {
      long var0 = a ^ 89861778001550L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "¸<\u0083Ù»\u0016ÒêåûE~¤4ç¤ýº7ñ\"[SZh\u000f\u0017ð²Î\u0013s\r\u0005a¨I\u0086É·(îÜ\u008d\u0014\u008a\u0000\u008a\r\u0089ô\nX\u0006>3\neË6bìò\u0012/¡tÔÀD*0\u001byÊ|Oå¶gô\u0010íåE\u0001\u000eÊ´a/~ò¼$Y(\u0013";
      int var8 = "¸<\u0083Ù»\u0016ÒêåûE~¤4ç¤ýº7ñ\"[SZh\u000f\u0017ð²Î\u0013s\r\u0005a¨I\u0086É·(îÜ\u008d\u0014\u008a\u0000\u008a\r\u0089ô\nX\u0006>3\neË6bìò\u0012/¡tÔÀD*0\u001byÊ|Oå¶gô\u0010íåE\u0001\u000eÊ´a/~ò¼$Y(\u0013"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25910;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ef", var10);
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
         throw new RuntimeException("com/zelix/ef" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
