package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

public class t4 extends KeyAdapter {
   final ur g;
   private static final long a = ess.a(-8762727398710016155L, -2603238346547167123L, MethodHandles.lookup().lookupClass()).a(118728871312916L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   @Override
   public void keyPressed(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/t4.a J
      // 003: ldc2_w 119475831564999
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 46398086739208
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 113070169025015
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 132814213224686
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 105712415188296
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w 8443689333185415348
      // 029: lload 2
      // 02a: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: aload 1
      // 030: ldc2_w 7756411675625378304
      // 033: lload 2
      // 034: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: astore 13
      // 03b: astore 12
      // 03d: aload 1
      // 03e: ldc2_w 8427113293532277970
      // 041: lload 2
      // 042: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: sipush 28345
      // 04a: ldc2_w 5818514989973107199
      // 04d: lload 2
      // 04e: lxor
      // 04f: invokedynamic a (IJ)I bsm=com/zelix/t4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 12
      // 056: ifnull 277
      // 059: if_icmpne 241
      // 05c: goto 069
      // 05f: ldc2_w 8140861636953318045
      // 062: lload 2
      // 063: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: aload 13
      // 06b: aload 0
      // 06c: ldc2_w 8066888622414427133
      // 06f: lload 2
      // 070: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: ldc2_w 8105534788024962520
      // 078: lload 2
      // 079: invokedynamic h (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: aload 12
      // 080: ifnull 108
      // 083: goto 090
      // 086: ldc2_w 8140861636953318045
      // 089: lload 2
      // 08a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: if_acmpne 0d4
      // 093: goto 0a0
      // 096: ldc2_w 8140861636953318045
      // 099: lload 2
      // 09a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: ldc2_w 8066888622414427133
      // 0a4: lload 2
      // 0a5: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: lload 10
      // 0ac: bipush 1
      // 0ad: anewarray 122
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 0
      // 0b7: swap
      // 0b8: aastore
      // 0b9: ldc2_w 8475157616186075198
      // 0bc: lload 2
      // 0bd: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: aload 12
      // 0c4: ifnonnull 36a
      // 0c7: goto 0d4
      // 0ca: ldc2_w 8140861636953318045
      // 0cd: lload 2
      // 0ce: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 13
      // 0d6: aload 0
      // 0d7: ldc2_w 8066888622414427133
      // 0da: lload 2
      // 0db: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: aload 12
      // 0e2: ifnull 158
      // 0e5: goto 0f2
      // 0e8: ldc2_w 8140861636953318045
      // 0eb: lload 2
      // 0ec: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: ldc2_w 8131213872566456330
      // 0f5: lload 2
      // 0f6: invokedynamic h (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: goto 108
      // 0fe: ldc2_w 8140861636953318045
      // 101: lload 2
      // 102: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: if_acmpne 13f
      // 10b: aload 0
      // 10c: ldc2_w 8066888622414427133
      // 10f: lload 2
      // 110: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: lload 8
      // 117: bipush 1
      // 118: anewarray 122
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: ldc2_w 7717177326125533294
      // 127: lload 2
      // 128: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: aload 12
      // 12f: ifnonnull 36a
      // 132: goto 13f
      // 135: ldc2_w 8140861636953318045
      // 138: lload 2
      // 139: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: aload 13
      // 141: aload 0
      // 142: ldc2_w 8066888622414427133
      // 145: lload 2
      // 146: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: goto 158
      // 14e: ldc2_w 8140861636953318045
      // 151: lload 2
      // 152: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: aload 12
      // 15a: ifnull 201
      // 15d: ldc2_w 7856907165770086553
      // 160: lload 2
      // 161: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/qi; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: if_acmpne 1e8
      // 169: goto 176
      // 16c: ldc2_w 8140861636953318045
      // 16f: lload 2
      // 170: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 0
      // 177: ldc2_w 8066888622414427133
      // 17a: lload 2
      // 17b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: ldc2_w 7856907165770086553
      // 183: lload 2
      // 184: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/qi; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: ldc2_w 8594818777148790381
      // 18c: lload 2
      // 18d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: checkcast com/zelix/hd
      // 195: astore 14
      // 197: aload 14
      // 199: lload 4
      // 19b: bipush 1
      // 19c: anewarray 122
      // 19f: dup_x2
      // 1a0: dup_x2
      // 1a1: pop
      // 1a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a5: bipush 0
      // 1a6: swap
      // 1a7: aastore
      // 1a8: ldc2_w 8142008564704461526
      // 1ab: lload 2
      // 1ac: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: ifne 1e3
      // 1b4: aload 0
      // 1b5: ldc2_w 8066888622414427133
      // 1b8: lload 2
      // 1b9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: lload 8
      // 1c0: bipush 1
      // 1c1: anewarray 122
      // 1c4: dup_x2
      // 1c5: dup_x2
      // 1c6: pop
      // 1c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ca: bipush 0
      // 1cb: swap
      // 1cc: aastore
      // 1cd: ldc2_w 7717177326125533294
      // 1d0: lload 2
      // 1d1: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: goto 1e3
      // 1d9: ldc2_w 8140861636953318045
      // 1dc: lload 2
      // 1dd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: aload 12
      // 1e5: ifnonnull 36a
      // 1e8: aload 13
      // 1ea: aload 0
      // 1eb: ldc2_w 8066888622414427133
      // 1ee: lload 2
      // 1ef: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: goto 201
      // 1f7: ldc2_w 8140861636953318045
      // 1fa: lload 2
      // 1fb: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: athrow
      // 201: ldc2_w 7734218082662089189
      // 204: lload 2
      // 205: invokedynamic h (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: if_acmpne 36a
      // 20d: aload 0
      // 20e: ldc2_w 8066888622414427133
      // 211: lload 2
      // 212: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: lload 6
      // 219: bipush 1
      // 21a: anewarray 122
      // 21d: dup_x2
      // 21e: dup_x2
      // 21f: pop
      // 220: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 223: bipush 0
      // 224: swap
      // 225: aastore
      // 226: ldc2_w 8437406112768548465
      // 229: lload 2
      // 22a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: aload 12
      // 231: ifnonnull 36a
      // 234: goto 241
      // 237: ldc2_w 8140861636953318045
      // 23a: lload 2
      // 23b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: athrow
      // 241: aload 1
      // 242: aload 12
      // 244: ifnull 27c
      // 247: goto 254
      // 24a: ldc2_w 8140861636953318045
      // 24d: lload 2
      // 24e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: athrow
      // 254: ldc2_w 8427113293532277970
      // 257: lload 2
      // 258: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: sipush 28633
      // 260: ldc2_w 7508763556874743966
      // 263: lload 2
      // 264: lxor
      // 265: invokedynamic a (IJ)I bsm=com/zelix/t4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: goto 277
      // 26d: ldc2_w 8140861636953318045
      // 270: lload 2
      // 271: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: athrow
      // 277: if_icmpne 36a
      // 27a: aload 13
      // 27c: aload 0
      // 27d: ldc2_w 8066888622414427133
      // 280: lload 2
      // 281: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: aload 12
      // 288: ifnull 32f
      // 28b: ldc2_w 7856907165770086553
      // 28e: lload 2
      // 28f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/qi; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: if_acmpne 316
      // 297: goto 2a4
      // 29a: ldc2_w 8140861636953318045
      // 29d: lload 2
      // 29e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: ldc2_w 8066888622414427133
      // 2a8: lload 2
      // 2a9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: ldc2_w 7856907165770086553
      // 2b1: lload 2
      // 2b2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/qi; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: ldc2_w 8594818777148790381
      // 2ba: lload 2
      // 2bb: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c0: checkcast com/zelix/hd
      // 2c3: astore 14
      // 2c5: aload 14
      // 2c7: lload 4
      // 2c9: bipush 1
      // 2ca: anewarray 122
      // 2cd: dup_x2
      // 2ce: dup_x2
      // 2cf: pop
      // 2d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d3: bipush 0
      // 2d4: swap
      // 2d5: aastore
      // 2d6: ldc2_w 8142008564704461526
      // 2d9: lload 2
      // 2da: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: ifne 311
      // 2e2: aload 0
      // 2e3: ldc2_w 8066888622414427133
      // 2e6: lload 2
      // 2e7: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: lload 6
      // 2ee: bipush 1
      // 2ef: anewarray 122
      // 2f2: dup_x2
      // 2f3: dup_x2
      // 2f4: pop
      // 2f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f8: bipush 0
      // 2f9: swap
      // 2fa: aastore
      // 2fb: ldc2_w 8437406112768548465
      // 2fe: lload 2
      // 2ff: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: goto 311
      // 307: ldc2_w 8140861636953318045
      // 30a: lload 2
      // 30b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: athrow
      // 311: aload 12
      // 313: ifnonnull 36a
      // 316: aload 13
      // 318: aload 0
      // 319: ldc2_w 8066888622414427133
      // 31c: lload 2
      // 31d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: goto 32f
      // 325: ldc2_w 8140861636953318045
      // 328: lload 2
      // 329: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: athrow
      // 32f: ldc2_w 7734218082662089189
      // 332: lload 2
      // 333: invokedynamic h (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: if_acmpne 36a
      // 33b: aload 0
      // 33c: ldc2_w 8066888622414427133
      // 33f: lload 2
      // 340: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: lload 6
      // 347: bipush 1
      // 348: anewarray 122
      // 34b: dup_x2
      // 34c: dup_x2
      // 34d: pop
      // 34e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 351: bipush 0
      // 352: swap
      // 353: aastore
      // 354: ldc2_w 8437406112768548465
      // 357: lload 2
      // 358: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35d: goto 36a
      // 360: ldc2_w 8140861636953318045
      // 363: lload 2
      // 364: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: athrow
      // 36a: return
   }

   t4(ur var1) {
      this.g = var1;
   }

   static {
      long var0 = a ^ 116009144551739L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "L\u008a\u007fi\\\u0094`,æã\fw©('v";
      int var7 = "L\u008a\u007fi\\\u0094`,æã\fw©('v".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32305;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/t4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/t4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
