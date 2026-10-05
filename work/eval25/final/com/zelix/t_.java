package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class t_ extends KeyAdapter {
   final uq l;
   private static final long a = ess.a(1544339633026304062L, 2972424572086161620L, MethodHandles.lookup().lookupClass()).a(216105945983389L);
   private static final long b;

   t_(uq var1) {
      this.l = var1;
   }

   @Override
   public void keyPressed(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/t_.a J
      // 003: ldc2_w 116411727004051
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 46503115431372
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 13520192250549
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 116182794984593
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 131451651481989
      // 022: lxor
      // 023: lstore 10
      // 025: dup2
      // 026: ldc2_w 109070141902592
      // 029: lxor
      // 02a: lstore 12
      // 02c: dup2
      // 02d: ldc2_w 26229548766158
      // 030: lxor
      // 031: lstore 14
      // 033: pop2
      // 034: ldc2_w -9125116861878469433
      // 037: lload 2
      // 038: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 16
      // 03f: aload 1
      // 040: aload 16
      // 042: ifnull 079
      // 045: ldc2_w -9187326894708795231
      // 048: lload 2
      // 049: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: getstatic com/zelix/t_.b J
      // 051: l2i
      // 052: if_icmpne 2e1
      // 055: goto 062
      // 058: ldc2_w -8958937368278910869
      // 05b: lload 2
      // 05c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 1
      // 063: ldc2_w -6928964588472097165
      // 066: lload 2
      // 067: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: goto 079
      // 06f: ldc2_w -8958937368278910869
      // 072: lload 2
      // 073: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: astore 17
      // 07b: aload 1
      // 07c: ldc2_w -6928964588472097165
      // 07f: lload 2
      // 080: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 0
      // 086: ldc2_w -8921913004915045567
      // 089: lload 2
      // 08a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: ldc2_w -7286739087792359190
      // 092: lload 2
      // 093: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: aload 16
      // 09a: ifnull 103
      // 09d: if_acmpne 0e1
      // 0a0: goto 0ad
      // 0a3: ldc2_w -8958937368278910869
      // 0a6: lload 2
      // 0a7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: ldc2_w -8921913004915045567
      // 0b1: lload 2
      // 0b2: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: lload 4
      // 0b9: bipush 1
      // 0ba: anewarray 21
      // 0bd: dup_x2
      // 0be: dup_x2
      // 0bf: pop
      // 0c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c3: bipush 0
      // 0c4: swap
      // 0c5: aastore
      // 0c6: ldc2_w -8865213711404551109
      // 0c9: lload 2
      // 0ca: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: aload 16
      // 0d1: ifnonnull 2e1
      // 0d4: goto 0e1
      // 0d7: ldc2_w -8958937368278910869
      // 0da: lload 2
      // 0db: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 17
      // 0e3: aload 0
      // 0e4: ldc2_w -8921913004915045567
      // 0e7: lload 2
      // 0e8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: ldc2_w -7408263358542612526
      // 0f0: lload 2
      // 0f1: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: goto 103
      // 0f9: ldc2_w -8958937368278910869
      // 0fc: lload 2
      // 0fd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: aload 16
      // 105: ifnull 16e
      // 108: if_acmpne 14c
      // 10b: goto 118
      // 10e: ldc2_w -8958937368278910869
      // 111: lload 2
      // 112: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: aload 0
      // 119: ldc2_w -8921913004915045567
      // 11c: lload 2
      // 11d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: lload 8
      // 124: bipush 1
      // 125: anewarray 21
      // 128: dup_x2
      // 129: dup_x2
      // 12a: pop
      // 12b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12e: bipush 0
      // 12f: swap
      // 130: aastore
      // 131: ldc2_w -7315392236843598288
      // 134: lload 2
      // 135: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: aload 16
      // 13c: ifnonnull 2e1
      // 13f: goto 14c
      // 142: ldc2_w -8958937368278910869
      // 145: lload 2
      // 146: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: aload 17
      // 14e: aload 0
      // 14f: ldc2_w -8921913004915045567
      // 152: lload 2
      // 153: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: ldc2_w -8859421524215173287
      // 15b: lload 2
      // 15c: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: goto 16e
      // 164: ldc2_w -8958937368278910869
      // 167: lload 2
      // 168: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 16
      // 170: ifnull 1d9
      // 173: if_acmpne 1b7
      // 176: goto 183
      // 179: ldc2_w -8958937368278910869
      // 17c: lload 2
      // 17d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: aload 0
      // 184: ldc2_w -8921913004915045567
      // 187: lload 2
      // 188: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: lload 14
      // 18f: bipush 1
      // 190: anewarray 21
      // 193: dup_x2
      // 194: dup_x2
      // 195: pop
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: bipush 0
      // 19a: swap
      // 19b: aastore
      // 19c: ldc2_w -8810825629991946055
      // 19f: lload 2
      // 1a0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: aload 16
      // 1a7: ifnonnull 2e1
      // 1aa: goto 1b7
      // 1ad: ldc2_w -8958937368278910869
      // 1b0: lload 2
      // 1b1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: aload 17
      // 1b9: aload 0
      // 1ba: ldc2_w -8921913004915045567
      // 1bd: lload 2
      // 1be: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: ldc2_w -7405060133996272426
      // 1c6: lload 2
      // 1c7: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: goto 1d9
      // 1cf: ldc2_w -8958937368278910869
      // 1d2: lload 2
      // 1d3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: aload 16
      // 1db: ifnull 244
      // 1de: if_acmpne 222
      // 1e1: goto 1ee
      // 1e4: ldc2_w -8958937368278910869
      // 1e7: lload 2
      // 1e8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: aload 0
      // 1ef: ldc2_w -8921913004915045567
      // 1f2: lload 2
      // 1f3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: lload 12
      // 1fa: bipush 1
      // 1fb: anewarray 21
      // 1fe: dup_x2
      // 1ff: dup_x2
      // 200: pop
      // 201: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 204: bipush 0
      // 205: swap
      // 206: aastore
      // 207: ldc2_w -8959975642292212064
      // 20a: lload 2
      // 20b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: aload 16
      // 212: ifnonnull 2e1
      // 215: goto 222
      // 218: ldc2_w -8958937368278910869
      // 21b: lload 2
      // 21c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 17
      // 224: aload 0
      // 225: ldc2_w -8921913004915045567
      // 228: lload 2
      // 229: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: ldc2_w -8907355115689079643
      // 231: lload 2
      // 232: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: goto 244
      // 23a: ldc2_w -8958937368278910869
      // 23d: lload 2
      // 23e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: aload 16
      // 246: ifnull 2af
      // 249: if_acmpne 28d
      // 24c: goto 259
      // 24f: ldc2_w -8958937368278910869
      // 252: lload 2
      // 253: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: aload 0
      // 25a: ldc2_w -8921913004915045567
      // 25d: lload 2
      // 25e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: lload 10
      // 265: bipush 1
      // 266: anewarray 21
      // 269: dup_x2
      // 26a: dup_x2
      // 26b: pop
      // 26c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26f: bipush 0
      // 270: swap
      // 271: aastore
      // 272: ldc2_w -7234106692236068538
      // 275: lload 2
      // 276: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: aload 16
      // 27d: ifnonnull 2e1
      // 280: goto 28d
      // 283: ldc2_w -8958937368278910869
      // 286: lload 2
      // 287: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: athrow
      // 28d: aload 17
      // 28f: aload 0
      // 290: ldc2_w -8921913004915045567
      // 293: lload 2
      // 294: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: ldc2_w -7375554641036649136
      // 29c: lload 2
      // 29d: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: goto 2af
      // 2a5: ldc2_w -8958937368278910869
      // 2a8: lload 2
      // 2a9: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: if_acmpne 2e1
      // 2b2: aload 0
      // 2b3: ldc2_w -8921913004915045567
      // 2b6: lload 2
      // 2b7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/uq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: lload 6
      // 2be: bipush 1
      // 2bf: anewarray 21
      // 2c2: dup_x2
      // 2c3: dup_x2
      // 2c4: pop
      // 2c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c8: bipush 0
      // 2c9: swap
      // 2ca: aastore
      // 2cb: ldc2_w -8844151602759990491
      // 2ce: lload 2
      // 2cf: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: goto 2e1
      // 2d7: ldc2_w -8958937368278910869
      // 2da: lload 2
      // 2db: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: athrow
      // 2e1: return
   }

   static {
      long var0 = a ^ 48823539982966L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -7875882305410363821L;
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
