package com.zelix;

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

public class a4 extends Exception implements pc {
   public String[] A;
   protected boolean E;
   public int[][] M;
   public v6 y;
   protected String o;
   private static final long a = ess.a(5477203731689957836L, -8333298470950724443L, MethodHandles.lookup().lookupClass()).a(211790416404096L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public a4(short var1, int var2, v6 var3, int[][] var4, String[] var5, char var6) {
      long var7 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      super("");
      x44.a<"u">(this, mc.R, -6684724199769716960L, var7);
      x44.a<"u">(this, true, -5005205358942536087L, var7);
      x44.a<"u">(this, var3, -6471982468615992282L, var7);
      x44.a<"u">(this, var4, -4970219869806984508L, var7);
      x44.a<"u">(this, var5, -4938583765239387713L, var7);
   }

   @Override
   public String getMessage() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/a4.a J
      // 003: ldc2_w 62992745759364
      // 006: lxor
      // 007: lstore 1
      // 008: lload 1
      // 009: dup2
      // 00a: ldc2_w 127455230632866
      // 00d: lxor
      // 00e: lstore 3
      // 00f: pop2
      // 010: ldc2_w -2228126055749040391
      // 013: lload 1
      // 014: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: istore 5
      // 01b: aload 0
      // 01c: iload 5
      // 01e: ifne 048
      // 021: ldc2_w -1801756371047521762
      // 024: lload 1
      // 025: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: ifne 04c
      // 02d: goto 03a
      // 030: ldc2_w -435729081846571197
      // 033: lload 1
      // 034: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: athrow
      // 03a: aload 0
      // 03b: goto 048
      // 03e: ldc2_w -435729081846571197
      // 041: lload 1
      // 042: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: athrow
      // 048: invokespecial java/lang/Exception.getMessage ()Ljava/lang/String;
      // 04b: areturn
      // 04c: ldc ""
      // 04e: astore 6
      // 050: bipush 0
      // 051: istore 7
      // 053: bipush 0
      // 054: istore 8
      // 056: iload 8
      // 058: aload 0
      // 059: ldc2_w -1769585614515970381
      // 05c: lload 1
      // 05d: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: arraylength
      // 063: if_icmpge 177
      // 066: iload 7
      // 068: iload 5
      // 06a: ifne 09c
      // 06d: aload 0
      // 06e: ldc2_w -1769585614515970381
      // 071: lload 1
      // 072: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: iload 8
      // 079: aaload
      // 07a: arraylength
      // 07b: if_icmpge 09b
      // 07e: goto 08b
      // 081: ldc2_w -435729081846571197
      // 084: lload 1
      // 085: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 0
      // 08c: ldc2_w -1769585614515970381
      // 08f: lload 1
      // 090: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: iload 8
      // 097: aaload
      // 098: arraylength
      // 099: istore 7
      // 09b: bipush 0
      // 09c: istore 9
      // 09e: iload 9
      // 0a0: aload 0
      // 0a1: ldc2_w -1769585614515970381
      // 0a4: lload 1
      // 0a5: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 8
      // 0ac: aaload
      // 0ad: arraylength
      // 0ae: if_icmpge 0ff
      // 0b1: new java/lang/StringBuilder
      // 0b4: dup
      // 0b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b8: aload 6
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bd: aload 0
      // 0be: ldc2_w -1800964698970622520
      // 0c1: lload 1
      // 0c2: invokedynamic m (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: aload 0
      // 0c8: ldc2_w -1769585614515970381
      // 0cb: lload 1
      // 0cc: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: iload 8
      // 0d3: aaload
      // 0d4: iload 9
      // 0d6: iaload
      // 0d7: aaload
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: ldc " "
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e3: astore 6
      // 0e5: iinc 9 1
      // 0e8: iload 5
      // 0ea: ifne 172
      // 0ed: iload 5
      // 0ef: ifeq 09e
      // 0f2: goto 0ff
      // 0f5: ldc2_w -435729081846571197
      // 0f8: lload 1
      // 0f9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 0
      // 100: ldc2_w -1769585614515970381
      // 103: lload 1
      // 104: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: iload 8
      // 10b: aaload
      // 10c: aload 0
      // 10d: ldc2_w -1769585614515970381
      // 110: lload 1
      // 111: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: iload 8
      // 118: aaload
      // 119: arraylength
      // 11a: bipush 1
      // 11b: isub
      // 11c: iaload
      // 11d: ifeq 141
      // 120: new java/lang/StringBuilder
      // 123: dup
      // 124: invokespecial java/lang/StringBuilder.<init> ()V
      // 127: aload 6
      // 129: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c: sipush 23853
      // 12f: ldc2_w 3109746641319925362
      // 132: lload 1
      // 133: lxor
      // 134: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13f: astore 6
      // 141: new java/lang/StringBuilder
      // 144: dup
      // 145: invokespecial java/lang/StringBuilder.<init> ()V
      // 148: aload 6
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: aload 0
      // 14e: ldc2_w -50657940273128617
      // 151: lload 1
      // 152: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15a: sipush 20845
      // 15d: ldc2_w 588259784700369459
      // 160: lload 1
      // 161: lxor
      // 162: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16d: astore 6
      // 16f: iinc 8 1
      // 172: iload 5
      // 174: ifeq 056
      // 177: aload 0
      // 178: ldc2_w -407023661683978159
      // 17b: lload 1
      // 17c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/v6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: getfield com/zelix/v6.S Ljava/lang/String;
      // 184: astore 8
      // 186: sipush 5576
      // 189: aload 0
      // 18a: ldc2_w -407023661683978159
      // 18d: lload 1
      // 18e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/v6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: getfield com/zelix/v6.D Lcom/zelix/v6;
      // 196: astore 9
      // 198: ldc2_w 2043788181918113424
      // 19b: lload 1
      // 19c: lxor
      // 19d: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: astore 10
      // 1a4: bipush 0
      // 1a5: istore 11
      // 1a7: iload 11
      // 1a9: iload 7
      // 1ab: if_icmpge 271
      // 1ae: iload 11
      // 1b0: iload 5
      // 1b2: ifne 37e
      // 1b5: iload 5
      // 1b7: ifne 204
      // 1ba: goto 1c7
      // 1bd: ldc2_w -435729081846571197
      // 1c0: lload 1
      // 1c1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: athrow
      // 1c7: ifeq 1ed
      // 1ca: goto 1d7
      // 1cd: ldc2_w -435729081846571197
      // 1d0: lload 1
      // 1d1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: new java/lang/StringBuilder
      // 1da: dup
      // 1db: invokespecial java/lang/StringBuilder.<init> ()V
      // 1de: aload 10
      // 1e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e3: ldc " "
      // 1e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1eb: astore 10
      // 1ed: aload 9
      // 1ef: iload 5
      // 1f1: ifne 267
      // 1f4: getfield com/zelix/v6.W I
      // 1f7: goto 204
      // 1fa: ldc2_w -435729081846571197
      // 1fd: lload 1
      // 1fe: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: ifne 22c
      // 207: new java/lang/StringBuilder
      // 20a: dup
      // 20b: invokespecial java/lang/StringBuilder.<init> ()V
      // 20e: aload 10
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: aload 0
      // 214: ldc2_w -1800964698970622520
      // 217: lload 1
      // 218: invokedynamic m (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: bipush 0
      // 21e: aaload
      // 21f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 222: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 225: astore 10
      // 227: iload 5
      // 229: ifeq 271
      // 22c: new java/lang/StringBuilder
      // 22f: dup
      // 230: invokespecial java/lang/StringBuilder.<init> ()V
      // 233: aload 10
      // 235: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 238: aload 0
      // 239: aload 9
      // 23b: getfield com/zelix/v6.S Ljava/lang/String;
      // 23e: lload 3
      // 23f: bipush 2
      // 240: anewarray 35
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
      // 251: ldc2_w -1892304682966056108
      // 254: lload 1
      // 255: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 260: astore 10
      // 262: aload 9
      // 264: getfield com/zelix/v6.D Lcom/zelix/v6;
      // 267: astore 9
      // 269: iinc 11 1
      // 26c: iload 5
      // 26e: ifeq 1a7
      // 271: new java/lang/StringBuilder
      // 274: dup
      // 275: invokespecial java/lang/StringBuilder.<init> ()V
      // 278: aload 10
      // 27a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27d: sipush 23294
      // 280: ldc2_w 7875555839678550442
      // 283: lload 1
      // 284: lxor
      // 285: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28d: aload 0
      // 28e: ldc2_w -50657940273128617
      // 291: lload 1
      // 292: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29a: aload 8
      // 29c: iload 5
      // 29e: ifne 2b3
      // 2a1: ifnull 30c
      // 2a4: goto 2b1
      // 2a7: ldc2_w -435729081846571197
      // 2aa: lload 1
      // 2ab: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: athrow
      // 2b1: aload 8
      // 2b3: iload 5
      // 2b5: ifne 309
      // 2b8: invokevirtual java/lang/String.length ()I
      // 2bb: ifle 30c
      // 2be: goto 2cb
      // 2c1: ldc2_w -435729081846571197
      // 2c4: lload 1
      // 2c5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: athrow
      // 2cb: new java/lang/StringBuilder
      // 2ce: dup
      // 2cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d2: sipush 12385
      // 2d5: ldc2_w 7485810503584643878
      // 2d8: lload 1
      // 2d9: lxor
      // 2da: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e2: aload 8
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: ldc "\""
      // 2e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ec: aload 0
      // 2ed: ldc2_w -50657940273128617
      // 2f0: lload 1
      // 2f1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2fc: goto 309
      // 2ff: ldc2_w -435729081846571197
      // 302: lload 1
      // 303: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: goto 30e
      // 30c: ldc ""
      // 30e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 311: sipush 29218
      // 314: ldc2_w 6561145726674811236
      // 317: lload 1
      // 318: lxor
      // 319: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 321: aload 0
      // 322: ldc2_w -407023661683978159
      // 325: lload 1
      // 326: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/v6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: getfield com/zelix/v6.D Lcom/zelix/v6;
      // 32e: getfield com/zelix/v6.Q I
      // 331: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 334: sipush 17404
      // 337: ldc2_w 7299782988917672103
      // 33a: lload 1
      // 33b: lxor
      // 33c: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 344: aload 0
      // 345: ldc2_w -407023661683978159
      // 348: lload 1
      // 349: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/v6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: getfield com/zelix/v6.D Lcom/zelix/v6;
      // 351: getfield com/zelix/v6.j I
      // 354: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 357: ldc "."
      // 359: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35c: aload 0
      // 35d: ldc2_w -50657940273128617
      // 360: lload 1
      // 361: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 369: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 36c: iload 5
      // 36e: ifne 40e
      // 371: astore 10
      // 373: aload 0
      // 374: ldc2_w -1769585614515970381
      // 377: lload 1
      // 378: invokedynamic m (Ljava/lang/Object;JJ)[[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: arraylength
      // 37e: bipush 1
      // 37f: if_icmpne 3c5
      // 382: new java/lang/StringBuilder
      // 385: dup
      // 386: invokespecial java/lang/StringBuilder.<init> ()V
      // 389: aload 10
      // 38b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38e: sipush 21839
      // 391: ldc2_w 1879216233556319770
      // 394: lload 1
      // 395: lxor
      // 396: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39e: aload 0
      // 39f: ldc2_w -50657940273128617
      // 3a2: lload 1
      // 3a3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ab: sipush 8534
      // 3ae: ldc2_w 64776261311195663
      // 3b1: lload 1
      // 3b2: lxor
      // 3b3: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3bb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3be: astore 10
      // 3c0: iload 5
      // 3c2: ifeq 410
      // 3c5: new java/lang/StringBuilder
      // 3c8: dup
      // 3c9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3cc: aload 10
      // 3ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d1: sipush 22011
      // 3d4: ldc2_w 3111589562203578022
      // 3d7: lload 1
      // 3d8: lxor
      // 3d9: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e1: aload 0
      // 3e2: ldc2_w -50657940273128617
      // 3e5: lload 1
      // 3e6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ee: sipush 8534
      // 3f1: ldc2_w 64776261311195663
      // 3f4: lload 1
      // 3f5: lxor
      // 3f6: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3fe: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 401: goto 40e
      // 404: ldc2_w -435729081846571197
      // 407: lload 1
      // 408: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40d: athrow
      // 40e: astore 10
      // 410: new java/lang/StringBuilder
      // 413: dup
      // 414: invokespecial java/lang/StringBuilder.<init> ()V
      // 417: aload 10
      // 419: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41c: aload 6
      // 41e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 421: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 424: astore 10
      // 426: aload 10
      // 428: areturn
   }

   protected String Y(Object[] param1) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/a4.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: ldc2_w 3109798694952471749
      // 01d: lload 2
      // 01e: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: new java/lang/StringBuffer
      // 026: dup
      // 027: invokespecial java/lang/StringBuffer.<init> ()V
      // 02a: astore 6
      // 02c: istore 5
      // 02e: bipush 0
      // 02f: istore 8
      // 031: iload 8
      // 033: aload 4
      // 035: invokevirtual java/lang/String.length ()I
      // 038: if_icmpge 311
      // 03b: aload 4
      // 03d: iload 5
      // 03f: lload 2
      // 040: lconst_0
      // 041: lcmp
      // 042: iflt 04a
      // 045: ifne 31c
      // 048: iload 8
      // 04a: invokevirtual java/lang/String.charAt (I)C
      // 04d: iload 5
      // 04f: lload 2
      // 050: lconst_0
      // 051: lcmp
      // 052: ifle 235
      // 055: ifne 234
      // 058: goto 065
      // 05b: ldc2_w 3733441153797625215
      // 05e: lload 2
      // 05f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: athrow
      // 065: lload 2
      // 066: lconst_0
      // 067: lcmp
      // 068: iflt 227
      // 06b: lookupswitch 437 9 0 91 8 115 9 158 10 201 12 244 13 287 34 330 39 362 92 394
      // 0bc: ldc2_w 3733441153797625215
      // 0bf: lload 2
      // 0c0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: iload 5
      // 0c8: lload 2
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: ifle 30e
      // 0ce: ifeq 309
      // 0d1: goto 0de
      // 0d4: ldc2_w 3733441153797625215
      // 0d7: lload 2
      // 0d8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 6
      // 0e0: sipush 10653
      // 0e3: ldc2_w 6233685392089819387
      // 0e6: lload 2
      // 0e7: lxor
      // 0e8: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0f0: pop
      // 0f1: iload 5
      // 0f3: lload 2
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: iflt 30e
      // 0f9: ifeq 309
      // 0fc: goto 109
      // 0ff: ldc2_w 3733441153797625215
      // 102: lload 2
      // 103: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 6
      // 10b: sipush 332
      // 10e: ldc2_w 69762441577037859
      // 111: lload 2
      // 112: lxor
      // 113: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 11b: pop
      // 11c: iload 5
      // 11e: lload 2
      // 11f: lconst_0
      // 120: lcmp
      // 121: iflt 30e
      // 124: ifeq 309
      // 127: goto 134
      // 12a: ldc2_w 3733441153797625215
      // 12d: lload 2
      // 12e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 6
      // 136: sipush 4297
      // 139: ldc2_w 6100717321672692133
      // 13c: lload 2
      // 13d: lxor
      // 13e: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 146: pop
      // 147: iload 5
      // 149: lload 2
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: iflt 30e
      // 14f: ifeq 309
      // 152: goto 15f
      // 155: ldc2_w 3733441153797625215
      // 158: lload 2
      // 159: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 6
      // 161: sipush 23919
      // 164: ldc2_w 3683401398709443585
      // 167: lload 2
      // 168: lxor
      // 169: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 171: pop
      // 172: iload 5
      // 174: lload 2
      // 175: lconst_0
      // 176: lcmp
      // 177: iflt 30e
      // 17a: ifeq 309
      // 17d: goto 18a
      // 180: ldc2_w 3733441153797625215
      // 183: lload 2
      // 184: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 6
      // 18c: sipush 28871
      // 18f: ldc2_w 1135476280960905645
      // 192: lload 2
      // 193: lxor
      // 194: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 19c: pop
      // 19d: iload 5
      // 19f: lload 2
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: ifle 30e
      // 1a5: ifeq 309
      // 1a8: goto 1b5
      // 1ab: ldc2_w 3733441153797625215
      // 1ae: lload 2
      // 1af: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aload 6
      // 1b7: ldc "\""
      // 1b9: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1bc: pop
      // 1bd: iload 5
      // 1bf: lload 2
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: iflt 30e
      // 1c5: ifeq 309
      // 1c8: goto 1d5
      // 1cb: ldc2_w 3733441153797625215
      // 1ce: lload 2
      // 1cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: aload 6
      // 1d7: ldc "'"
      // 1d9: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1dc: pop
      // 1dd: iload 5
      // 1df: lload 2
      // 1e0: lconst_0
      // 1e1: lcmp
      // 1e2: iflt 30e
      // 1e5: ifeq 309
      // 1e8: goto 1f5
      // 1eb: ldc2_w 3733441153797625215
      // 1ee: lload 2
      // 1ef: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: aload 6
      // 1f7: sipush 4286
      // 1fa: ldc2_w 3705136465104933342
      // 1fd: lload 2
      // 1fe: lxor
      // 1ff: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 207: pop
      // 208: iload 5
      // 20a: lload 2
      // 20b: lconst_0
      // 20c: lcmp
      // 20d: iflt 30e
      // 210: ifeq 309
      // 213: goto 220
      // 216: ldc2_w 3733441153797625215
      // 219: lload 2
      // 21a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: athrow
      // 220: aload 4
      // 222: iload 8
      // 224: invokevirtual java/lang/String.charAt (I)C
      // 227: goto 234
      // 22a: ldc2_w 3733441153797625215
      // 22d: lload 2
      // 22e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: athrow
      // 234: dup
      // 235: istore 7
      // 237: sipush 13247
      // 23a: ldc2_w 4239760929741025231
      // 23d: lload 2
      // 23e: lxor
      // 23f: invokedynamic r (IJ)I bsm=com/zelix/a4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: iload 5
      // 246: ifne 275
      // 249: if_icmplt 278
      // 24c: goto 259
      // 24f: ldc2_w 3733441153797625215
      // 252: lload 2
      // 253: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: iload 7
      // 25b: sipush 3307
      // 25e: ldc2_w 8252053422419579032
      // 261: lload 2
      // 262: lxor
      // 263: invokedynamic r (IJ)I bsm=com/zelix/a4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: goto 275
      // 26b: ldc2_w 3733441153797625215
      // 26e: lload 2
      // 26f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: athrow
      // 275: if_icmple 2ee
      // 278: new java/lang/StringBuilder
      // 27b: dup
      // 27c: invokespecial java/lang/StringBuilder.<init> ()V
      // 27f: sipush 27869
      // 282: ldc2_w 5389814351440965046
      // 285: lload 2
      // 286: lxor
      // 287: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28f: iload 7
      // 291: sipush 21114
      // 294: ldc2_w 7437007328104304139
      // 297: lload 2
      // 298: lxor
      // 299: invokedynamic r (IJ)I bsm=com/zelix/a4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: ldc2_w 3089888170167463305
      // 2a1: lload 2
      // 2a2: invokedynamic u (IIJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ad: astore 9
      // 2af: aload 6
      // 2b1: new java/lang/StringBuilder
      // 2b4: dup
      // 2b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b8: sipush 5254
      // 2bb: ldc2_w 4708841197168465387
      // 2be: lload 2
      // 2bf: lxor
      // 2c0: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/a4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c8: aload 9
      // 2ca: aload 9
      // 2cc: invokevirtual java/lang/String.length ()I
      // 2cf: bipush 4
      // 2d0: isub
      // 2d1: aload 9
      // 2d3: invokevirtual java/lang/String.length ()I
      // 2d6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2df: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 2e2: pop
      // 2e3: iload 5
      // 2e5: lload 2
      // 2e6: lconst_0
      // 2e7: lcmp
      // 2e8: ifle 30e
      // 2eb: ifeq 309
      // 2ee: aload 6
      // 2f0: iload 7
      // 2f2: ldc2_w 3261312878560462530
      // 2f5: lload 2
      // 2f6: invokedynamic m (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: pop
      // 2fc: goto 309
      // 2ff: ldc2_w 3733441153797625215
      // 302: lload 2
      // 303: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: iinc 8 1
      // 30c: iload 5
      // 30e: ifeq 031
      // 311: aload 6
      // 313: lload 2
      // 314: lconst_0
      // 315: lcmp
      // 316: ifle 0f0
      // 319: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 31c: areturn
   }

   public a4(long var1) {
      var1 = a ^ var1;
      super();
      x44.a<"w">(this, mc.R, -3271533675922803070L, var1);
      x44.a<"w">(this, false, -3806725261127757877L, var1);
   }

   static {
      long var11 = a ^ 41195095803480L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[18];
      int var18 = 0;
      String var17 = "ÝÏ\u0096\u0090ÔZt¯^|\u00ad¥ï°f\u0018\u0010(\u001e\u0004^p\u0004¡PÌ¿Ö¸V\u0001n\u007f\u0010ÿ\u0014\u001dèM\u0084ä=îq?}\u0001ælB\u0018^q2þÙÄde\u0099'\u008d8\u0093\u0096iÓQó1ØÒè\u0083/\u00109òº.Lâ>YÏ'±\u008d%ô\u008bÙ\u0010\u0000b/à\u009bÞN3Ó¦TÆ+0\u0085G\u0010àe(\u008fÍ!£9k\u0012\u0080© è#\u0014\u0010ÇX\u0018¬\u007fÏ©B\u0093V#½Zß«õ\u0010}$\u0097ãA|ì\u0019Æ-8Ò\u0005¶\u0081$\u0010¶£xÇ¬ßénÌ¶Çà\u001fÐEù\u0010k\u0086\u0004*Èd\u009b4z[\u0096Xq4\u0082À(ÖG°¦\u0013\u0097cõ\u009b|?HOÓ¯\u0003&í\u0083\u0088*DØ¨wy\u0092¼Ó\b«x\u0088Ì\u009aPpÔÇ\u0085\u0010\u001asä.¦!d\u008d½Ü\u0011T&Ø¶ë \u008d\u008c\u000b:Þ)ÞÌ¨j\tãâøÂc\fµ.\\öù~¼7ÉX\u0088¯´\u0004p8¢Ô\u0007Ë\u0000ê>ó{Æ½Ïi\u009bÎ&U/\t¢(î»À´\u0080Ì,Â)£\u0097²§\u009f¦ål-\u009b\u0087T\u0084\\²ªMð÷Wµ=ÙLzQ\u0010z!D*ghB@\u008b#\u00854¿]Á\u008a";
      int var19 = "ÝÏ\u0096\u0090ÔZt¯^|\u00ad¥ï°f\u0018\u0010(\u001e\u0004^p\u0004¡PÌ¿Ö¸V\u0001n\u007f\u0010ÿ\u0014\u001dèM\u0084ä=îq?}\u0001ælB\u0018^q2þÙÄde\u0099'\u008d8\u0093\u0096iÓQó1ØÒè\u0083/\u00109òº.Lâ>YÏ'±\u008d%ô\u008bÙ\u0010\u0000b/à\u009bÞN3Ó¦TÆ+0\u0085G\u0010àe(\u008fÍ!£9k\u0012\u0080© è#\u0014\u0010ÇX\u0018¬\u007fÏ©B\u0093V#½Zß«õ\u0010}$\u0097ãA|ì\u0019Æ-8Ò\u0005¶\u0081$\u0010¶£xÇ¬ßénÌ¶Çà\u001fÐEù\u0010k\u0086\u0004*Èd\u009b4z[\u0096Xq4\u0082À(ÖG°¦\u0013\u0097cõ\u009b|?HOÓ¯\u0003&í\u0083\u0088*DØ¨wy\u0092¼Ó\b«x\u0088Ì\u009aPpÔÇ\u0085\u0010\u001asä.¦!d\u008d½Ü\u0011T&Ø¶ë \u008d\u008c\u000b:Þ)ÞÌ¨j\tãâøÂc\fµ.\\öù~¼7ÉX\u0088¯´\u0004p8¢Ô\u0007Ë\u0000ê>ó{Æ½Ïi\u009bÎ&U/\t¢(î»À´\u0080Ì,Â)£\u0097²§\u009f¦ål-\u009b\u0087T\u0084\\²ªMð÷Wµ=ÙLzQ\u0010z!D*ghB@\u008b#\u00854¿]Á\u008a"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[18];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "$×W^¿\u009b\n3°-X»Ím\f\u0095\u0013Ç¾ûiÂp\u0095";
                     int var5 = "$×W^¿\u009b\n3°-X»Ím\f\u0095\u0013Ç¾ûiÂp\u0095".length();
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

                     e = var6;
                     f = new Integer[3];
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

                  var17 = "\u0087c-`¦\u008aeÉU$åa\u0019\u0018X\u0086\u0000\u009b\u0086êÂóvg\u0018µ2H¸O½ÙÊH§¯ÇEØ\u0080¯N\u001b\u00ad\u0093Î0=/";
                  var19 = "\u0087c-`¦\u008aeÉU$åa\u0019\u0018X\u0086\u0000\u009b\u0086êÂóvg\u0018µ2H¸O½ÙÊH§¯ÇEØ\u0080¯N\u001b\u00ad\u0093Î0=/".length();
                  var16 = 24;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8268;
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
            throw new RuntimeException("com/zelix/a4", var10);
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
         throw new RuntimeException("com/zelix/a4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15703;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/a4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("com/zelix/a4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
