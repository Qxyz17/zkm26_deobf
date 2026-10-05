package com.zelix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JButton;
import javax.swing.JFrame;

public class r4 extends rh implements ActionListener {
   static String[] P;
   JButton u;
   snp d;
   private static final long a = prr.a(-8369157182990850792L, 6744490272090638236L, MethodHandles.lookup().lookupClass()).a(268892480605633L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);

   public r4(JFrame var1, String var2, long var3, kd var5) {
      var2 = "About Zelix KlassMaster Unlimited";
      var3 = a ^ var3;
      long var10001 = var3 ^ 100669563369186L;
      int var6 = (int)((var3 ^ 100669563369186L) >>> 32);
      int var7 = (int)((var3 ^ 100669563369186L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var3 ^ 67056593473880L;
      long var11 = var3 ^ 60800869158125L;
      super(var6, var1, var2, (short)var7, true, (char)var8);
      m44.a<"p">(
         this,
         new Object[]{
            b<"g">(28488, 8497789517878862976L ^ var3), b<"g">(24771, 7503979702819433220L ^ var3), var9, b<"g">(6882, 3190131492734652718L ^ var3), var5
         },
         -8287495916992264164L,
         var3
      );
      m44.a<"p">(this, new Object[]{var11}, -8140716912877436158L, var3);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      long var2 = a ^ 115477560711694L;
      long var4 = var2 ^ 9334825744177L;
      m44.a<"u">(this, new Object[]{var4}, 2763968546992988897L, var2);
   }

   public void n(Object[] param1) {
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
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/String
      // 020: astore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/kd
      // 028: astore 7
      // 02a: pop
      // 02b: getstatic com/zelix/r4.a J
      // 02e: lload 3
      // 02f: lxor
      // 030: lstore 3
      // 031: lload 3
      // 032: dup2
      // 033: ldc2_w 114565620817132
      // 036: lxor
      // 037: lstore 8
      // 039: dup2
      // 03a: ldc2_w 115617286467714
      // 03d: lxor
      // 03e: lstore 10
      // 040: dup2
      // 041: ldc2_w 3667515707317
      // 044: lxor
      // 045: lstore 12
      // 047: dup2
      // 048: ldc2_w 44362185379631
      // 04b: lxor
      // 04c: lstore 14
      // 04e: dup2
      // 04f: ldc2_w 84955272133183
      // 052: lxor
      // 053: lstore 16
      // 055: pop2
      // 056: aload 0
      // 057: ldc2_w -882641999340825035
      // 05a: lload 3
      // 05b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/awt/Container; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: astore 19
      // 062: ldc2_w -866593575167294199
      // 065: lload 3
      // 066: invokedynamic l (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: new com/zelix/ah
      // 06e: dup
      // 06f: aload 19
      // 071: lload 16
      // 073: invokespecial com/zelix/ah.<init> (Ljava/awt/Container;J)V
      // 076: astore 20
      // 078: aload 19
      // 07a: aload 20
      // 07c: ldc2_w -1723350530672536343
      // 07f: lload 3
      // 080: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 0
      // 086: new com/zelix/snp
      // 089: dup
      // 08a: lload 14
      // 08c: aload 6
      // 08e: aload 2
      // 08f: aload 5
      // 091: aload 7
      // 093: invokespecial com/zelix/snp.<init> (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zelix/kd;)V
      // 096: ldc2_w -788126614903552252
      // 099: lload 3
      // 09a: invokedynamic p (Ljava/lang/Object;Lcom/zelix/snp;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: astore 18
      // 0a1: aload 0
      // 0a2: ldc2_w -788126614903552252
      // 0a5: lload 3
      // 0a6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/snp; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: lload 12
      // 0ad: bipush 1
      // 0ae: anewarray 49
      // 0b1: dup_x2
      // 0b2: dup_x2
      // 0b3: pop
      // 0b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b7: bipush 0
      // 0b8: swap
      // 0b9: aastore
      // 0ba: ldc2_w -1584263074985452535
      // 0bd: lload 3
      // 0be: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: aload 18
      // 0c5: ifnonnull 11b
      // 0c8: ifne 0f9
      // 0cb: goto 0d8
      // 0ce: ldc2_w -717762243593607168
      // 0d1: lload 3
      // 0d2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 19
      // 0da: ldc2_w -658513151256854408
      // 0dd: lload 3
      // 0de: invokedynamic h (JJ)Ljava/awt/Color; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: ldc2_w -623014344558859272
      // 0e6: lload 3
      // 0e7: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: goto 0f9
      // 0ef: ldc2_w -717762243593607168
      // 0f2: lload 3
      // 0f3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: ldc2_w -788126614903552252
      // 0fd: lload 3
      // 0fe: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/snp; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: lload 12
      // 105: bipush 1
      // 106: anewarray 49
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: ldc2_w -1584263074985452535
      // 115: lload 3
      // 116: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: lload 3
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 219
      // 121: aload 18
      // 123: ifnonnull 219
      // 126: ifne 169
      // 129: goto 136
      // 12c: ldc2_w -717762243593607168
      // 12f: lload 3
      // 130: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 0
      // 137: ldc2_w -658513151256854408
      // 13a: lload 3
      // 13b: invokedynamic h (JJ)Ljava/awt/Color; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: ldc2_w -1203962501833540397
      // 143: lload 3
      // 144: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: aload 0
      // 14a: ldc2_w -1607269216551659717
      // 14d: lload 3
      // 14e: invokedynamic h (JJ)Ljava/awt/Color; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: ldc2_w -1216944927974598297
      // 156: lload 3
      // 157: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: goto 169
      // 15f: ldc2_w -717762243593607168
      // 162: lload 3
      // 163: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 19
      // 16b: aload 0
      // 16c: ldc2_w -788126614903552252
      // 16f: lload 3
      // 170: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/snp; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: sipush 7984
      // 178: ldc2_w 3062467202478680978
      // 17b: lload 3
      // 17c: lxor
      // 17d: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/r4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: ldc2_w -1057086110558040540
      // 185: lload 3
      // 186: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: aload 0
      // 18c: new javax/swing/JButton
      // 18f: dup
      // 190: sipush 2332
      // 193: ldc2_w 2673586290544754099
      // 196: lload 3
      // 197: lxor
      // 198: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/r4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: invokespecial javax/swing/JButton.<init> (Ljava/lang/String;)V
      // 1a0: ldc2_w -656026320363908455
      // 1a3: lload 3
      // 1a4: invokedynamic p (Ljava/lang/Object;Ljavax/swing/JButton;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: aload 0
      // 1aa: ldc2_w -656026320363908455
      // 1ad: lload 3
      // 1ae: invokedynamic r (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: aload 0
      // 1b4: ldc2_w -1234749440927953451
      // 1b7: lload 3
      // 1b8: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: aload 19
      // 1bf: aload 0
      // 1c0: ldc2_w -656026320363908455
      // 1c3: lload 3
      // 1c4: invokedynamic r (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: sipush 25876
      // 1cc: ldc2_w 2000275383232844217
      // 1cf: lload 3
      // 1d0: lxor
      // 1d1: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/r4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: ldc2_w -1057086110558040540
      // 1d9: lload 3
      // 1da: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: lload 3
      // 1e0: lconst_0
      // 1e1: lcmp
      // 1e2: iflt 2b2
      // 1e5: aload 0
      // 1e6: aload 18
      // 1e8: ifnonnull 2a8
      // 1eb: ldc2_w -788126614903552252
      // 1ee: lload 3
      // 1ef: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/snp; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: lload 12
      // 1f6: bipush 1
      // 1f7: anewarray 49
      // 1fa: dup_x2
      // 1fb: dup_x2
      // 1fc: pop
      // 1fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 200: bipush 0
      // 201: swap
      // 202: aastore
      // 203: ldc2_w -1584263074985452535
      // 206: lload 3
      // 207: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: goto 219
      // 20f: ldc2_w -717762243593607168
      // 212: lload 3
      // 213: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: ifne 261
      // 21c: aload 0
      // 21d: ldc2_w -656026320363908455
      // 220: lload 3
      // 221: invokedynamic r (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: ldc2_w -658513151256854408
      // 229: lload 3
      // 22a: invokedynamic h (JJ)Ljava/awt/Color; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: ldc2_w -1134817897298255625
      // 232: lload 3
      // 233: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: aload 0
      // 239: ldc2_w -656026320363908455
      // 23c: lload 3
      // 23d: invokedynamic r (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: ldc2_w -1607269216551659717
      // 245: lload 3
      // 246: invokedynamic h (JJ)Ljava/awt/Color; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: ldc2_w -1158674272831904103
      // 24e: lload 3
      // 24f: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: goto 261
      // 257: ldc2_w -717762243593607168
      // 25a: lload 3
      // 25b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: athrow
      // 261: aload 20
      // 263: ldc2_w -630807773065055268
      // 266: lload 3
      // 267: invokedynamic h (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: lload 10
      // 26e: bipush 2
      // 26f: anewarray 49
      // 272: dup_x2
      // 273: dup_x2
      // 274: pop
      // 275: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 278: bipush 1
      // 279: swap
      // 27a: aastore
      // 27b: dup_x1
      // 27c: swap
      // 27d: bipush 0
      // 27e: swap
      // 27f: aastore
      // 280: ldc2_w -1379840944032876313
      // 283: lload 3
      // 284: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: aload 0
      // 28a: lload 8
      // 28c: bipush 2
      // 28d: anewarray 49
      // 290: dup_x2
      // 291: dup_x2
      // 292: pop
      // 293: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 296: bipush 1
      // 297: swap
      // 298: aastore
      // 299: dup_x1
      // 29a: swap
      // 29b: bipush 0
      // 29c: swap
      // 29d: aastore
      // 29e: ldc2_w -1516605079246463724
      // 2a1: lload 3
      // 2a2: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: aload 0
      // 2a8: bipush 0
      // 2a9: ldc2_w -608619110864695816
      // 2ac: lload 3
      // 2ad: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: new com/zelix/fc
      // 2b5: dup
      // 2b6: aload 0
      // 2b7: invokespecial com/zelix/fc.<init> (Lcom/zelix/r4;)V
      // 2ba: astore 21
      // 2bc: aload 0
      // 2bd: ldc2_w -656026320363908455
      // 2c0: lload 3
      // 2c1: invokedynamic r (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: aload 21
      // 2c8: ldc2_w -1538703666468908122
      // 2cb: lload 3
      // 2cc: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: return
   }

   static {
      long var9 = a ^ 52099568322930L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[11];
      int var5 = 0;
      String var4 = "\u001c¿,\rMõçê\u0084Þ£\u0091Ç-:\u0091o\u0082N°®Ã\u0019\u0096@\u0000\u0012\u0094f\"(\u008e\u009a\u0016*2ñÖ\u008b\u0014,³\u0081\t\u008cd¹²ÓYÂ\u0097_«¦.E´$¥ó\u0092]\u0082Êt\u001d\u000b\u0093\u0000¿\u0083ù\u007f]àe.¢\u0084\u0097;\u0089\u008eÝ\u0099\u000b\u00ad\u0081 °VP\u009d%(\u0000Ç\n\u00011y\t3^§-Ò\u0091>2K_ë0\u0091\u0006Ï8öØ`0Ï¾ÚÚ\u0087\u0084Jç\bf\u0085`\u0016(\fDÄÛvÒ>\u0007\u0014ÄXÕ#³@#M\u0088\rg\u0087pq:üô\u001díÖ\u0015\u0099w\u0089\u0019(nÉ8\u000fòÞ5\u009f+W¤L\u0097\u009ay¿\u008e!\u0003ï\u001a\u001eâv8%n\u0093ëÁ\u0003\fÒ^ýÅ°\fÉÛ8\u0083_\u001d\u0010åÉËý\u009e\u0095£#\u009aãü¸ZO,\u0013WeéIÜ\u0099\"à\u0092s(lÂÿ1K\u001c\u0014G \u0091Ðí\u0098Êþë`\u0000E\u0098xä\u0098âû ´uBñô\u001f!å\u0081\u001d\u0000¼J#Â\\d;l\u0090Û?ô»(¢½Xé)2³ w`ï\u008d²\u0017\u009d]¸(7Â-5jÏ½\u008c\u00861Öô81Lêxs_\u0093;n\u0010Pú\u000f\u0001é\u0095ãqý\u008cpÕ\u008a\u0081\\#";
      int var6 = "\u001c¿,\rMõçê\u0084Þ£\u0091Ç-:\u0091o\u0082N°®Ã\u0019\u0096@\u0000\u0012\u0094f\"(\u008e\u009a\u0016*2ñÖ\u008b\u0014,³\u0081\t\u008cd¹²ÓYÂ\u0097_«¦.E´$¥ó\u0092]\u0082Êt\u001d\u000b\u0093\u0000¿\u0083ù\u007f]àe.¢\u0084\u0097;\u0089\u008eÝ\u0099\u000b\u00ad\u0081 °VP\u009d%(\u0000Ç\n\u00011y\t3^§-Ò\u0091>2K_ë0\u0091\u0006Ï8öØ`0Ï¾ÚÚ\u0087\u0084Jç\bf\u0085`\u0016(\fDÄÛvÒ>\u0007\u0014ÄXÕ#³@#M\u0088\rg\u0087pq:üô\u001díÖ\u0015\u0099w\u0089\u0019(nÉ8\u000fòÞ5\u009f+W¤L\u0097\u009ay¿\u008e!\u0003ï\u001a\u001eâv8%n\u0093ëÁ\u0003\fÒ^ýÅ°\fÉÛ8\u0083_\u001d\u0010åÉËý\u009e\u0095£#\u009aãü¸ZO,\u0013WeéIÜ\u0099\"à\u0092s(lÂÿ1K\u001c\u0014G \u0091Ðí\u0098Êþë`\u0000E\u0098xä\u0098âû ´uBñô\u001f!å\u0081\u001d\u0000¼J#Â\\d;l\u0090Û?ô»(¢½Xé)2³ w`ï\u008d²\u0017\u009d]¸(7Â-5jÏ½\u008c\u00861Öô81Lêxs_\u0093;n\u0010Pú\u000f\u0001é\u0095ãqý\u008cpÕ\u008a\u0081\\#"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[11];
                     m44.a<"m">(
                        new String[]{
                           b<"g">(14617, 3108160425454948494L ^ var9),
                           b<"g">(21853, 2568075609051446478L ^ var9),
                           b<"g">(1953, 4573642074609380919L ^ var9),
                           b<"g">(6281, 6456844817436504349L ^ var9),
                           b<"g">(8044, 4331218158058632958L ^ var9)
                        },
                        3030015497284824814L,
                        var9
                     );
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Y\u0011×)DU{ã\u000fôa\u0019-[¼\u0006Mu\u000bÉ(Ò\u0017-.±v\u0004+\u00135ÐSDÙ\"E\u009e\"\u008ba\\fv>\u0019\u0014ßSÕé[\f\"ë©2¹)e\u0006L['f\u0015¡XP\u0018ö\u0007_m¸p:\u0098Þð \u0092\u0010âÕ:=3\u0019\u0006;>Å'ÜU7ÑË`Ý±\u00988\u0013ÅpÍ\u0088ãë3\u0010\u0081Ã_Y\u009a\u0087\u0003ñ|Õ\u0006·ØÆ\u0086ã";
                  var6 = "Y\u0011×)DU{ã\u000fôa\u0019-[¼\u0006Mu\u000bÉ(Ò\u0017-.±v\u0004+\u00135ÐSDÙ\"E\u009e\"\u008ba\\fv>\u0019\u0014ßSÕé[\f\"ë©2¹)e\u0006L['f\u0015¡XP\u0018ö\u0007_m¸p:\u0098Þð \u0092\u0010âÕ:=3\u0019\u0006;>Å'ÜU7ÑË`Ý±\u00988\u0013ÅpÍ\u0088ãë3\u0010\u0081Ã_Y\u009a\u0087\u0003ñ|Õ\u0006·ØÆ\u0086ã"
                     .length();
                  var3 = 'p';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20182;
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
            throw new RuntimeException("com/zelix/r4", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/r4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
