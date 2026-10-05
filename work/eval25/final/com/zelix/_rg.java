package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _rg extends KeyAdapter {
   final u4 d;
   private static final long a = ess.a(-3042638834508173857L, -3763826251325032754L, MethodHandles.lookup().lookupClass()).a(168174413349188L);
   private static final long b;

   @Override
   public void keyPressed(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_rg.a J
      // 003: ldc2_w 75988635272754
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 67528905459927
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 120129933237106
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 21892808730770
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 71830690805261
      // 022: lxor
      // 023: lstore 10
      // 025: dup2
      // 026: ldc2_w 81036883291092
      // 029: lxor
      // 02a: lstore 12
      // 02c: dup2
      // 02d: ldc2_w 53513031568803
      // 030: lxor
      // 031: lstore 14
      // 033: pop2
      // 034: ldc2_w 6383135308642034959
      // 037: lload 2
      // 038: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 16
      // 03f: aload 1
      // 040: aload 16
      // 042: ifnull 079
      // 045: ldc2_w 6433515129055183209
      // 048: lload 2
      // 049: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: getstatic com/zelix/_rg.b J
      // 051: l2i
      // 052: if_icmpne 2e7
      // 055: goto 062
      // 058: ldc2_w 4869128598739721250
      // 05b: lload 2
      // 05c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 1
      // 063: ldc2_w 5052825866754523067
      // 066: lload 2
      // 067: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: goto 079
      // 06f: ldc2_w 4869128598739721250
      // 072: lload 2
      // 073: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: astore 17
      // 07b: aload 17
      // 07d: aload 0
      // 07e: ldc2_w 6351357299485691102
      // 081: lload 2
      // 082: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: ldc2_w 6393398868903953110
      // 08a: lload 2
      // 08b: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: aload 16
      // 092: ifnull 102
      // 095: if_acmpne 0e0
      // 098: goto 0a5
      // 09b: ldc2_w 4869128598739721250
      // 09e: lload 2
      // 09f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: ldc2_w 6351357299485691102
      // 0a9: lload 2
      // 0aa: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: lload 10
      // 0b1: dup2_x1
      // 0b2: pop2
      // 0b3: bipush 2
      // 0b4: anewarray 47
      // 0b7: dup_x1
      // 0b8: swap
      // 0b9: bipush 1
      // 0ba: swap
      // 0bb: aastore
      // 0bc: dup_x2
      // 0bd: dup_x2
      // 0be: pop
      // 0bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c2: bipush 0
      // 0c3: swap
      // 0c4: aastore
      // 0c5: ldc2_w 5159729072377244262
      // 0c8: lload 2
      // 0c9: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: aload 16
      // 0d0: ifnonnull 2e7
      // 0d3: goto 0e0
      // 0d6: ldc2_w 4869128598739721250
      // 0d9: lload 2
      // 0da: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: aload 17
      // 0e2: aload 0
      // 0e3: ldc2_w 6351357299485691102
      // 0e6: lload 2
      // 0e7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: ldc2_w 6410746070478880595
      // 0ef: lload 2
      // 0f0: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: goto 102
      // 0f8: ldc2_w 4869128598739721250
      // 0fb: lload 2
      // 0fc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 16
      // 104: ifnull 174
      // 107: if_acmpne 152
      // 10a: goto 117
      // 10d: ldc2_w 4869128598739721250
      // 110: lload 2
      // 111: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 0
      // 118: ldc2_w 6351357299485691102
      // 11b: lload 2
      // 11c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: lload 8
      // 123: dup2_x1
      // 124: pop2
      // 125: bipush 2
      // 126: anewarray 47
      // 129: dup_x1
      // 12a: swap
      // 12b: bipush 1
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x2
      // 12f: dup_x2
      // 130: pop
      // 131: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 134: bipush 0
      // 135: swap
      // 136: aastore
      // 137: ldc2_w 4759598676488790238
      // 13a: lload 2
      // 13b: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: aload 16
      // 142: ifnonnull 2e7
      // 145: goto 152
      // 148: ldc2_w 4869128598739721250
      // 14b: lload 2
      // 14c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: aload 17
      // 154: aload 0
      // 155: ldc2_w 6351357299485691102
      // 158: lload 2
      // 159: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: ldc2_w 5097318985601734748
      // 161: lload 2
      // 162: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: goto 174
      // 16a: ldc2_w 4869128598739721250
      // 16d: lload 2
      // 16e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: aload 16
      // 176: ifnull 1df
      // 179: if_acmpne 1bd
      // 17c: goto 189
      // 17f: ldc2_w 4869128598739721250
      // 182: lload 2
      // 183: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: aload 0
      // 18a: ldc2_w 6351357299485691102
      // 18d: lload 2
      // 18e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: lload 14
      // 195: bipush 1
      // 196: anewarray 47
      // 199: dup_x2
      // 19a: dup_x2
      // 19b: pop
      // 19c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19f: bipush 0
      // 1a0: swap
      // 1a1: aastore
      // 1a2: ldc2_w 6759722391687005822
      // 1a5: lload 2
      // 1a6: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: aload 16
      // 1ad: ifnonnull 2e7
      // 1b0: goto 1bd
      // 1b3: ldc2_w 4869128598739721250
      // 1b6: lload 2
      // 1b7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: aload 17
      // 1bf: aload 0
      // 1c0: ldc2_w 6351357299485691102
      // 1c3: lload 2
      // 1c4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: ldc2_w 6530753132091971006
      // 1cc: lload 2
      // 1cd: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: goto 1df
      // 1d5: ldc2_w 4869128598739721250
      // 1d8: lload 2
      // 1d9: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 16
      // 1e1: ifnull 24a
      // 1e4: if_acmpne 228
      // 1e7: goto 1f4
      // 1ea: ldc2_w 4869128598739721250
      // 1ed: lload 2
      // 1ee: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: ldc2_w 6351357299485691102
      // 1f8: lload 2
      // 1f9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: lload 4
      // 200: bipush 1
      // 201: anewarray 47
      // 204: dup_x2
      // 205: dup_x2
      // 206: pop
      // 207: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20a: bipush 0
      // 20b: swap
      // 20c: aastore
      // 20d: ldc2_w 4999980165241017147
      // 210: lload 2
      // 211: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: aload 16
      // 218: ifnonnull 2e7
      // 21b: goto 228
      // 21e: ldc2_w 4869128598739721250
      // 221: lload 2
      // 222: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: athrow
      // 228: aload 17
      // 22a: aload 0
      // 22b: ldc2_w 6351357299485691102
      // 22e: lload 2
      // 22f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: ldc2_w 5117105526635437958
      // 237: lload 2
      // 238: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: goto 24a
      // 240: ldc2_w 4869128598739721250
      // 243: lload 2
      // 244: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: aload 16
      // 24c: ifnull 2b5
      // 24f: if_acmpne 293
      // 252: goto 25f
      // 255: ldc2_w 4869128598739721250
      // 258: lload 2
      // 259: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: athrow
      // 25f: aload 0
      // 260: ldc2_w 6351357299485691102
      // 263: lload 2
      // 264: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: lload 6
      // 26b: bipush 1
      // 26c: anewarray 47
      // 26f: dup_x2
      // 270: dup_x2
      // 271: pop
      // 272: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 275: bipush 0
      // 276: swap
      // 277: aastore
      // 278: ldc2_w 6637937837326227078
      // 27b: lload 2
      // 27c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: aload 16
      // 283: ifnonnull 2e7
      // 286: goto 293
      // 289: ldc2_w 4869128598739721250
      // 28c: lload 2
      // 28d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: athrow
      // 293: aload 17
      // 295: aload 0
      // 296: ldc2_w 6351357299485691102
      // 299: lload 2
      // 29a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: ldc2_w 4814001569629716544
      // 2a2: lload 2
      // 2a3: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: goto 2b5
      // 2ab: ldc2_w 4869128598739721250
      // 2ae: lload 2
      // 2af: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: athrow
      // 2b5: if_acmpne 2e7
      // 2b8: aload 0
      // 2b9: ldc2_w 6351357299485691102
      // 2bc: lload 2
      // 2bd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: lload 12
      // 2c4: bipush 1
      // 2c5: anewarray 47
      // 2c8: dup_x2
      // 2c9: dup_x2
      // 2ca: pop
      // 2cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ce: bipush 0
      // 2cf: swap
      // 2d0: aastore
      // 2d1: ldc2_w 4859867084609283474
      // 2d4: lload 2
      // 2d5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: goto 2e7
      // 2dd: ldc2_w 4869128598739721250
      // 2e0: lload 2
      // 2e1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e6: athrow
      // 2e7: return
   }

   _rg(u4 var1) {
      this.d = var1;
   }

   static {
      long var0 = a ^ 118248680700910L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 8443526425790664038L;
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
