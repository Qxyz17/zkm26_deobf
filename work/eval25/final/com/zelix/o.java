package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o {
   static final char[][] s;
   private static final long a = ess.a(3558360643621907052L, 2009979703096668539L, MethodHandles.lookup().lookupClass()).a(173382222459496L);

   _3 r(Object[] param1) {
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
      // 00a: lstore 10
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/String
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 9
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/util/List
      // 024: astore 7
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/String
      // 02c: astore 4
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast com/zelix/wp
      // 034: astore 2
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast com/zelix/_3
      // 03c: astore 5
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/lang/Boolean
      // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048: istore 6
      // 04a: dup
      // 04b: bipush 8
      // 04d: aaload
      // 04e: checkcast [[C
      // 051: astore 8
      // 053: pop
      // 054: getstatic com/zelix/o.a J
      // 057: lload 10
      // 059: lxor
      // 05a: lstore 10
      // 05c: lload 10
      // 05e: dup2
      // 05f: ldc2_w 67729362108067
      // 062: lxor
      // 063: lstore 12
      // 065: dup2
      // 066: ldc2_w 8716008410531
      // 069: lxor
      // 06a: lstore 14
      // 06c: dup2
      // 06d: ldc2_w 17021671731645
      // 070: lxor
      // 071: lstore 16
      // 073: dup2
      // 074: ldc2_w 32484383693967
      // 077: lxor
      // 078: lstore 18
      // 07a: dup2
      // 07b: ldc2_w 46513989856887
      // 07e: lxor
      // 07f: lstore 20
      // 081: dup2
      // 082: ldc2_w 34896692775183
      // 085: lxor
      // 086: lstore 22
      // 088: pop2
      // 089: ldc2_w -4945406429299964204
      // 08c: lload 10
      // 08e: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 8
      // 095: aload 2
      // 096: lload 22
      // 098: invokevirtual com/zelix/wp.C (J)I
      // 09b: aaload
      // 09c: astore 25
      // 09e: istore 24
      // 0a0: aload 5
      // 0a2: ifnonnull 0b4
      // 0a5: bipush 1
      // 0a6: goto 0b5
      // 0a9: ldc2_w -5087751127781129324
      // 0ac: lload 10
      // 0ae: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: bipush 0
      // 0b5: istore 26
      // 0b7: ldc2_w -5002920208736284695
      // 0ba: lload 10
      // 0bc: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iload 24
      // 0c3: ifeq 14a
      // 0c6: ifne 104
      // 0c9: goto 0d7
      // 0cc: ldc2_w -5087751127781129324
      // 0cf: lload 10
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: iload 9
      // 0d9: iload 24
      // 0db: ifeq 194
      // 0de: goto 0ec
      // 0e1: ldc2_w -5087751127781129324
      // 0e4: lload 10
      // 0e6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: lload 10
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 186
      // 0f3: ifeq 158
      // 0f6: goto 104
      // 0f9: ldc2_w -5087751127781129324
      // 0fc: lload 10
      // 0fe: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 25
      // 106: aload 7
      // 108: aload 5
      // 10a: iload 6
      // 10c: lload 16
      // 10e: bipush 5
      // 10f: anewarray 199
      // 112: dup_x2
      // 113: dup_x2
      // 114: pop
      // 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118: bipush 4
      // 119: swap
      // 11a: aastore
      // 11b: dup_x1
      // 11c: swap
      // 11d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 120: bipush 3
      // 121: swap
      // 122: aastore
      // 123: dup_x1
      // 124: swap
      // 125: bipush 2
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 1
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x1
      // 12e: swap
      // 12f: bipush 0
      // 130: swap
      // 131: aastore
      // 132: ldc2_w -4831040907714870527
      // 135: lload 10
      // 137: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: goto 14a
      // 13f: ldc2_w -5087751127781129324
      // 142: lload 10
      // 144: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: istore 27
      // 14c: iload 24
      // 14e: lload 10
      // 150: lconst_0
      // 151: lcmp
      // 152: iflt 198
      // 155: ifne 196
      // 158: lload 20
      // 15a: aload 25
      // 15c: aload 7
      // 15e: aload 5
      // 160: bipush 4
      // 161: anewarray 199
      // 164: dup_x1
      // 165: swap
      // 166: bipush 3
      // 167: swap
      // 168: aastore
      // 169: dup_x1
      // 16a: swap
      // 16b: bipush 2
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x1
      // 16f: swap
      // 170: bipush 1
      // 171: swap
      // 172: aastore
      // 173: dup_x2
      // 174: dup_x2
      // 175: pop
      // 176: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 179: bipush 0
      // 17a: swap
      // 17b: aastore
      // 17c: ldc2_w -5039897227157781823
      // 17f: lload 10
      // 181: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: goto 194
      // 189: ldc2_w -5087751127781129324
      // 18c: lload 10
      // 18e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: istore 27
      // 196: iload 27
      // 198: iload 24
      // 19a: lload 10
      // 19c: lconst_0
      // 19d: lcmp
      // 19e: iflt 210
      // 1a1: ifeq 20e
      // 1a4: ifeq 204
      // 1a7: goto 1b5
      // 1aa: ldc2_w -5087751127781129324
      // 1ad: lload 10
      // 1af: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aload 2
      // 1b6: lload 12
      // 1b8: invokevirtual com/zelix/wp.l (J)I
      // 1bb: pop
      // 1bc: aload 2
      // 1bd: lload 22
      // 1bf: invokevirtual com/zelix/wp.C (J)I
      // 1c2: iload 24
      // 1c4: ifeq 202
      // 1c7: goto 1d5
      // 1ca: ldc2_w -5087751127781129324
      // 1cd: lload 10
      // 1cf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: aload 8
      // 1d7: arraylength
      // 1d8: if_icmplt 1f6
      // 1db: goto 1e9
      // 1de: ldc2_w -5087751127781129324
      // 1e1: lload 10
      // 1e3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: aconst_null
      // 1ea: areturn
      // 1eb: ldc2_w -5087751127781129324
      // 1ee: lload 10
      // 1f0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aload 8
      // 1f8: aload 2
      // 1f9: lload 22
      // 1fb: invokevirtual com/zelix/wp.C (J)I
      // 1fe: aaload
      // 1ff: astore 25
      // 201: bipush 1
      // 202: istore 26
      // 204: ldc2_w -5002920208736284695
      // 207: lload 10
      // 209: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: iload 24
      // 210: ifeq 226
      // 213: ifne 229
      // 216: goto 224
      // 219: ldc2_w -5087751127781129324
      // 21c: lload 10
      // 21e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: iload 9
      // 226: ifeq 289
      // 229: aload 3
      // 22a: aload 7
      // 22c: aload 4
      // 22e: aload 25
      // 230: aload 5
      // 232: lload 14
      // 234: iload 6
      // 236: iload 26
      // 238: bipush 8
      // 23a: anewarray 199
      // 23d: dup_x1
      // 23e: swap
      // 23f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 242: bipush 7
      // 244: swap
      // 245: aastore
      // 246: dup_x1
      // 247: swap
      // 248: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 24b: bipush 6
      // 24d: swap
      // 24e: aastore
      // 24f: dup_x2
      // 250: dup_x2
      // 251: pop
      // 252: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 255: bipush 5
      // 256: swap
      // 257: aastore
      // 258: dup_x1
      // 259: swap
      // 25a: bipush 4
      // 25b: swap
      // 25c: aastore
      // 25d: dup_x1
      // 25e: swap
      // 25f: bipush 3
      // 260: swap
      // 261: aastore
      // 262: dup_x1
      // 263: swap
      // 264: bipush 2
      // 265: swap
      // 266: aastore
      // 267: dup_x1
      // 268: swap
      // 269: bipush 1
      // 26a: swap
      // 26b: aastore
      // 26c: dup_x1
      // 26d: swap
      // 26e: bipush 0
      // 26f: swap
      // 270: aastore
      // 271: ldc2_w -6887167408145194985
      // 274: lload 10
      // 276: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: lload 10
      // 27d: lconst_0
      // 27e: lcmp
      // 27f: iflt 2db
      // 282: astore 28
      // 284: iload 24
      // 286: ifne 2dd
      // 289: aload 3
      // 28a: aload 7
      // 28c: lload 18
      // 28e: aload 4
      // 290: aload 25
      // 292: aload 5
      // 294: iload 6
      // 296: iload 26
      // 298: bipush 8
      // 29a: anewarray 199
      // 29d: dup_x1
      // 29e: swap
      // 29f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2a2: bipush 7
      // 2a4: swap
      // 2a5: aastore
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ab: bipush 6
      // 2ad: swap
      // 2ae: aastore
      // 2af: dup_x1
      // 2b0: swap
      // 2b1: bipush 5
      // 2b2: swap
      // 2b3: aastore
      // 2b4: dup_x1
      // 2b5: swap
      // 2b6: bipush 4
      // 2b7: swap
      // 2b8: aastore
      // 2b9: dup_x1
      // 2ba: swap
      // 2bb: bipush 3
      // 2bc: swap
      // 2bd: aastore
      // 2be: dup_x2
      // 2bf: dup_x2
      // 2c0: pop
      // 2c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c4: bipush 2
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: bipush 1
      // 2ca: swap
      // 2cb: aastore
      // 2cc: dup_x1
      // 2cd: swap
      // 2ce: bipush 0
      // 2cf: swap
      // 2d0: aastore
      // 2d1: ldc2_w -6533789900334681148
      // 2d4: lload 10
      // 2d6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: astore 28
      // 2dd: aload 28
      // 2df: areturn
   }

   static {
      long var11 = a ^ 26800785459792L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[37];
      int var4 = 0;
      String var5 = "ö½\u009fÂ&â§¹\u001e!-\u001cÌw¶!r\u0083\u009eu\u008d\u0003²·\u0084î°*ô©\u0003ï\u00175Ù\u0003¶Uæ<ó<¡ªh\u0000O;-#â\u0092\u0092}\u0099ñMóm\u000eËAñF<h$ïS\u0082Ñhnr|v\u0001\u0084N\b¶S\u0002î\u0096Ôn\u0000=A\u008c\u007f\u009aÎqÏòzÀ¢(À6[{ðÅ¸\u0001\u009b\u0099\u00874Ý^æyEà\u0081Å¯¤ÂI3ÍÙX@\\Ytm\u0011Ì}µ|â\u0003jð\u0014Lï¹,©í-\u0010\u0095ÁóÄ=5üq\u001e\r^ð\u0002êð¸Ñr(Ó29GpÄÛ;z\u0006\u0002ô6\u0088\u0082Cæ\u0005T\u0092\u008d|Rz6,ºBº³¾ ^sÐ\u000eëY\u001dL²7V$\u0094èõ\u007f'¡bÒï¾\u00187r>ÿåÑ\u001asÏËG¢é0yøH\u0092¯ ¡sfØ1\u0006a%Ì±È\u008a1Ì«<Ó\rÅ/Ð\u00ad%Ø\u001e½ÆÏé?\u0015Ð¬\u0086";
      int var6 = "ö½\u009fÂ&â§¹\u001e!-\u001cÌw¶!r\u0083\u009eu\u008d\u0003²·\u0084î°*ô©\u0003ï\u00175Ù\u0003¶Uæ<ó<¡ªh\u0000O;-#â\u0092\u0092}\u0099ñMóm\u000eËAñF<h$ïS\u0082Ñhnr|v\u0001\u0084N\b¶S\u0002î\u0096Ôn\u0000=A\u008c\u007f\u009aÎqÏòzÀ¢(À6[{ðÅ¸\u0001\u009b\u0099\u00874Ý^æyEà\u0081Å¯¤ÂI3ÍÙX@\\Ytm\u0011Ì}µ|â\u0003jð\u0014Lï¹,©í-\u0010\u0095ÁóÄ=5üq\u001e\r^ð\u0002êð¸Ñr(Ó29GpÄÛ;z\u0006\u0002ô6\u0088\u0082Cæ\u0005T\u0092\u008d|Rz6,ºBº³¾ ^sÐ\u000eëY\u001dL²7V$\u0094èõ\u007f'¡bÒï¾\u00187r>ÿåÑ\u001asÏËG¢é0yøH\u0092¯ ¡sfØ1\u0006a%Ì±È\u008a1Ì«<Ó\rÅ/Ð\u00ad%Ø\u001e½ÆÏé?\u0015Ð¬\u0086"
         .length();
      byte var3 = 0;

      label24:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var14 = var0;
         var10001 = var4++;
         long var18 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var20 = -1;

         while (true) {
            long var8 = var18;
            byte[] var10 = var1.doFinal(
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
            long var22 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var20) {
               case 0:
                  var14[var10001] = var22;
                  if (var3 >= var6) {
                     char[][] var15 = new char[(int)var0[18]][];
                     var15[0] = new char[]{(char)((int)var0[32])};
                     var15[1] = new char[]{(char)((int)var0[16]), (char)((int)var0[10])};
                     var15[2] = new char[]{(char)((int)var0[36]), (char)((int)var0[20])};
                     var15[3] = new char[]{(char)((int)var0[20]), (char)((int)var0[4])};
                     var15[4] = new char[]{(char)((int)var0[34]), (char)((int)var0[20])};
                     var15[5] = new char[]{(char)((int)var0[20]), (char)((int)var0[24])};
                     var15[(int)var0[33]] = new char[]{(char)((int)var0[17]), (char)((int)var0[20])};
                     var15[(int)var0[11]] = new char[]{(char)((int)var0[20]), (char)((int)var0[25])};
                     var15[(int)var0[8]] = new char[]{(char)((int)var0[10]), (char)((int)var0[20])};
                     var15[(int)var0[15]] = new char[]{(char)((int)var0[20]), (char)((int)var0[10])};
                     var15[(int)var0[0]] = new char[]{(char)((int)var0[10]), (char)((int)var0[10]), (char)((int)var0[4])};
                     var15[(int)var0[14]] = new char[]{(char)((int)var0[10]), (char)((int)var0[4]), (char)((int)var0[10])};
                     var15[(int)var0[2]] = new char[]{(char)((int)var0[4]), (char)((int)var0[10]), (char)((int)var0[10])};
                     var15[(int)var0[12]] = new char[]{(char)((int)var0[24]), (char)((int)var0[24]), (char)((int)var0[10])};
                     var15[(int)var0[23]] = new char[]{(char)((int)var0[24]), (char)((int)var0[10]), (char)((int)var0[24])};
                     var15[(int)var0[29]] = new char[]{(char)((int)var0[24]), (char)((int)var0[10]), (char)((int)var0[10])};
                     var15[(int)var0[22]] = new char[]{(char)((int)var0[24]), (char)((int)var0[10]), (char)((int)var0[25])};
                     var15[(int)var0[35]] = new char[]{(char)((int)var0[24]), (char)((int)var0[25]), (char)((int)var0[10])};
                     var15[(int)var0[31]] = new char[]{(char)((int)var0[10]), (char)((int)var0[24]), (char)((int)var0[24])};
                     var15[(int)var0[28]] = new char[]{(char)((int)var0[10]), (char)((int)var0[24]), (char)((int)var0[10])};
                     var15[(int)var0[5]] = new char[]{(char)((int)var0[10]), (char)((int)var0[24]), (char)((int)var0[25])};
                     var15[(int)var0[26]] = new char[]{(char)((int)var0[10]), (char)((int)var0[10]), (char)((int)var0[24])};
                     var15[(int)var0[9]] = new char[]{(char)((int)var0[10]), (char)((int)var0[10]), (char)((int)var0[10])};
                     var15[(int)var0[3]] = new char[]{(char)((int)var0[10]), (char)((int)var0[10]), (char)((int)var0[25])};
                     var15[(int)var0[21]] = new char[]{(char)((int)var0[10]), (char)((int)var0[25]), (char)((int)var0[24])};
                     var15[(int)var0[6]] = new char[]{(char)((int)var0[10]), (char)((int)var0[25]), (char)((int)var0[10])};
                     var15[(int)var0[30]] = new char[]{(char)((int)var0[10]), (char)((int)var0[25]), (char)((int)var0[25])};
                     var15[(int)var0[13]] = new char[]{(char)((int)var0[25]), (char)((int)var0[24]), (char)((int)var0[10])};
                     var15[(int)var0[27]] = new char[]{(char)((int)var0[25]), (char)((int)var0[10]), (char)((int)var0[24])};
                     var15[(int)var0[7]] = new char[]{(char)((int)var0[25]), (char)((int)var0[10]), (char)((int)var0[10])};
                     var15[(int)var0[19]] = new char[]{(char)((int)var0[25]), (char)((int)var0[10]), (char)((int)var0[25])};
                     var15[(int)var0[1]] = new char[]{(char)((int)var0[25]), (char)((int)var0[25]), (char)((int)var0[10])};
                     s = var15;
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var22;
                  if (var3 < var6) {
                     continue label24;
                  }

                  var5 = "£#¥DF\u0086¢Ë\u008a!P9hL\u0094:";
                  var6 = "£#¥DF\u0086¢Ë\u008a!P9hL\u0094:".length();
                  var3 = 0;
            }

            byte var17 = var3;
            var3 += 8;
            var7 = var5.substring(var17, var3).getBytes("ISO-8859-1");
            var14 = var0;
            var10001 = var4++;
            var18 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var20 = 0;
         }
      }
   }

   _3 e(Object[] param1) {
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
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 9
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 5
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/util/List
      // 025: astore 2
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/String
      // 02c: astore 3
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast [C
      // 033: astore 10
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast com/zelix/_3
      // 03c: astore 7
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/lang/Boolean
      // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048: istore 4
      // 04a: pop
      // 04b: getstatic com/zelix/o.a J
      // 04e: lload 5
      // 050: lxor
      // 051: lstore 5
      // 053: lload 5
      // 055: dup2
      // 056: ldc2_w 92425823276592
      // 059: lxor
      // 05a: lstore 11
      // 05c: dup2
      // 05d: ldc2_w 101815965905454
      // 060: lxor
      // 061: lstore 13
      // 063: dup2
      // 064: ldc2_w 86215410720540
      // 067: lxor
      // 068: lstore 15
      // 06a: dup2
      // 06b: ldc2_w 133793249701348
      // 06e: lxor
      // 06f: lstore 17
      // 071: pop2
      // 072: ldc2_w 2442241574985431721
      // 075: lload 5
      // 077: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: istore 19
      // 07e: aload 7
      // 080: ifnonnull 092
      // 083: bipush 1
      // 084: goto 093
      // 087: ldc2_w 4249144791923408903
      // 08a: lload 5
      // 08c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: bipush 0
      // 093: istore 20
      // 095: ldc2_w 4107667076870442106
      // 098: lload 5
      // 09a: invokedynamic h (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: iload 19
      // 0a1: ifne 127
      // 0a4: ifne 0e2
      // 0a7: goto 0b5
      // 0aa: ldc2_w 4249144791923408903
      // 0ad: lload 5
      // 0af: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: iload 9
      // 0b7: iload 19
      // 0b9: ifne 170
      // 0bc: goto 0ca
      // 0bf: ldc2_w 4249144791923408903
      // 0c2: lload 5
      // 0c4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: lload 5
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 162
      // 0d1: ifeq 135
      // 0d4: goto 0e2
      // 0d7: ldc2_w 4249144791923408903
      // 0da: lload 5
      // 0dc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 10
      // 0e4: aload 2
      // 0e5: aload 7
      // 0e7: iload 4
      // 0e9: lload 13
      // 0eb: bipush 5
      // 0ec: anewarray 199
      // 0ef: dup_x2
      // 0f0: dup_x2
      // 0f1: pop
      // 0f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f5: bipush 4
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0fd: bipush 3
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: bipush 2
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w 4568868841895936146
      // 112: lload 5
      // 114: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: goto 127
      // 11c: ldc2_w 4249144791923408903
      // 11f: lload 5
      // 121: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: istore 21
      // 129: iload 19
      // 12b: lload 5
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: iflt 174
      // 132: ifeq 172
      // 135: lload 17
      // 137: aload 10
      // 139: aload 2
      // 13a: aload 7
      // 13c: bipush 4
      // 13d: anewarray 199
      // 140: dup_x1
      // 141: swap
      // 142: bipush 3
      // 143: swap
      // 144: aastore
      // 145: dup_x1
      // 146: swap
      // 147: bipush 2
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 1
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x2
      // 150: dup_x2
      // 151: pop
      // 152: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 155: bipush 0
      // 156: swap
      // 157: aastore
      // 158: ldc2_w 4151724907220189522
      // 15b: lload 5
      // 15d: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: goto 170
      // 165: ldc2_w 4249144791923408903
      // 168: lload 5
      // 16a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: istore 21
      // 172: iload 21
      // 174: iload 19
      // 176: lload 5
      // 178: lconst_0
      // 179: lcmp
      // 17a: iflt 1aa
      // 17d: ifne 1a8
      // 180: ifeq 19e
      // 183: goto 191
      // 186: ldc2_w 4249144791923408903
      // 189: lload 5
      // 18b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: aconst_null
      // 192: areturn
      // 193: ldc2_w 4249144791923408903
      // 196: lload 5
      // 198: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: ldc2_w 4107667076870442106
      // 1a1: lload 5
      // 1a3: invokedynamic h (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: iload 19
      // 1aa: ifne 1c0
      // 1ad: ifne 1c3
      // 1b0: goto 1be
      // 1b3: ldc2_w 4249144791923408903
      // 1b6: lload 5
      // 1b8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: iload 9
      // 1c0: ifeq 222
      // 1c3: aload 8
      // 1c5: aload 2
      // 1c6: aload 3
      // 1c7: aload 10
      // 1c9: aload 7
      // 1cb: lload 11
      // 1cd: iload 4
      // 1cf: iload 20
      // 1d1: bipush 8
      // 1d3: anewarray 199
      // 1d6: dup_x1
      // 1d7: swap
      // 1d8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1db: bipush 7
      // 1dd: swap
      // 1de: aastore
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1e4: bipush 6
      // 1e6: swap
      // 1e7: aastore
      // 1e8: dup_x2
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ee: bipush 5
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 4
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 3
      // 1f9: swap
      // 1fa: aastore
      // 1fb: dup_x1
      // 1fc: swap
      // 1fd: bipush 2
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: bipush 1
      // 203: swap
      // 204: aastore
      // 205: dup_x1
      // 206: swap
      // 207: bipush 0
      // 208: swap
      // 209: aastore
      // 20a: ldc2_w 2591978101174117252
      // 20d: lload 5
      // 20f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: lload 5
      // 216: lconst_0
      // 217: lcmp
      // 218: ifle 273
      // 21b: astore 22
      // 21d: iload 19
      // 21f: ifeq 275
      // 222: aload 8
      // 224: aload 2
      // 225: lload 15
      // 227: aload 3
      // 228: aload 10
      // 22a: aload 7
      // 22c: iload 4
      // 22e: iload 20
      // 230: bipush 8
      // 232: anewarray 199
      // 235: dup_x1
      // 236: swap
      // 237: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 23a: bipush 7
      // 23c: swap
      // 23d: aastore
      // 23e: dup_x1
      // 23f: swap
      // 240: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 243: bipush 6
      // 245: swap
      // 246: aastore
      // 247: dup_x1
      // 248: swap
      // 249: bipush 5
      // 24a: swap
      // 24b: aastore
      // 24c: dup_x1
      // 24d: swap
      // 24e: bipush 4
      // 24f: swap
      // 250: aastore
      // 251: dup_x1
      // 252: swap
      // 253: bipush 3
      // 254: swap
      // 255: aastore
      // 256: dup_x2
      // 257: dup_x2
      // 258: pop
      // 259: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25c: bipush 2
      // 25d: swap
      // 25e: aastore
      // 25f: dup_x1
      // 260: swap
      // 261: bipush 1
      // 262: swap
      // 263: aastore
      // 264: dup_x1
      // 265: swap
      // 266: bipush 0
      // 267: swap
      // 268: aastore
      // 269: ldc2_w 2792235440282579031
      // 26c: lload 5
      // 26e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: astore 22
      // 275: aload 22
      // 277: areturn
   }

   private static boolean U(Object[] var0) {
      char[] var6 = (char[])var0[0];
      List var5 = (List)var0[1];
      _3 var3 = (_3)var0[2];
      byte var4 = (Boolean)var0[3];
      long var1 = (Long)var0[4];
      var1 = a ^ var1;
      int var7 = x44.a<"w">(6312631053142527191L, var1);

      _3 var10000;
      label46: {
         try {
            var10000 = var3;
            if (var7 != 0) {
               break label46;
            }

            if (var3 == null) {
               return false;
            }
         } catch (gj var10) {
            throw x44.a<"w">(var10, 5515100943501276793L, var1);
         }

         var10000 = var3;
      }

      int var10001;
      byte var10002;
      label36: {
         label35: {
            try {
               var12 = x44.a<"o">(var10000, new Object[0], 5705631530900420675L, var1).L();
               var10001 = var5.size();
               var10002 = var4;
               if (var7 != 0) {
                  break label36;
               }

               if (var4 != 0) {
                  break label35;
               }
            } catch (gj var9) {
               throw x44.a<"w">(var9, 5515100943501276793L, var1);
            }

            var10002 = 0;
            break label36;
         }

         var10002 = 1;
      }

      try {
         return var12 >= var10001 - var10002;
      } catch (gj var8) {
         throw x44.a<"w">(var8, 5515100943501276793L, var1);
      }
   }

   private static boolean u(Object[] param0) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast [C
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/List
      // 19: astore 1
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/_3
      // 20: astore 3
      // 21: pop
      // 22: getstatic com/zelix/o.a J
      // 25: lload 4
      // 27: lxor
      // 28: lstore 4
      // 2a: ldc2_w -7964202097517089549
      // 2d: lload 4
      // 2f: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: istore 6
      // 36: aload 3
      // 37: iload 6
      // 39: ifeq 4e
      // 3c: ifnull a0
      // 3f: goto 4d
      // 42: ldc2_w -7835218675073979981
      // 45: lload 4
      // 47: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 3
      // 4e: bipush 0
      // 4f: anewarray 199
      // 52: ldc2_w -8080070035443253803
      // 55: lload 4
      // 57: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: bipush 1
      // 5d: isub
      // 5e: istore 7
      // 60: aload 3
      // 61: bipush 0
      // 62: anewarray 199
      // 65: ldc2_w -8584988147917475353
      // 68: lload 4
      // 6a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_a; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual com/zelix/_a.L ()I
      // 72: iload 6
      // 74: lload 4
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle 80
      // 7b: ifeq 9f
      // 7e: iload 7
      // 80: if_icmpne 9e
      // 83: goto 91
      // 86: ldc2_w -7835218675073979981
      // 89: lload 4
      // 8b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: bipush 1
      // 92: ireturn
      // 93: ldc2_w -7835218675073979981
      // 96: lload 4
      // 98: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: bipush 0
      // 9f: ireturn
      // a0: bipush 0
      // a1: ireturn
   }

   private static _3 H(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/List
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/String
      // 015: astore 9
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast [C
      // 01d: astore 5
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast com/zelix/_3
      // 025: astore 6
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/lang/Long
      // 02d: invokevirtual java/lang/Long.longValue ()J
      // 030: lstore 7
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/lang/Boolean
      // 039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c: istore 1
      // 03d: dup
      // 03e: bipush 7
      // 040: aaload
      // 041: checkcast java/lang/Boolean
      // 044: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 047: istore 4
      // 049: pop
      // 04a: getstatic com/zelix/o.a J
      // 04d: lload 7
      // 04f: lxor
      // 050: lstore 7
      // 052: lload 7
      // 054: dup2
      // 055: ldc2_w 136083871263084
      // 058: lxor
      // 059: lstore 10
      // 05b: dup2
      // 05c: ldc2_w 81833379660622
      // 05f: lxor
      // 060: lstore 12
      // 062: pop2
      // 063: ldc2_w -960016846175547609
      // 066: lload 7
      // 068: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 3
      // 06e: invokeinterface java/util/List.size ()I 1
      // 073: istore 15
      // 075: istore 14
      // 077: aload 5
      // 079: arraylength
      // 07a: istore 16
      // 07c: iload 16
      // 07e: newarray 10
      // 080: astore 17
      // 082: iload 4
      // 084: iload 14
      // 086: ifeq 1bb
      // 089: ifne 1ac
      // 08c: goto 09a
      // 08f: ldc2_w -1110247808831124889
      // 092: lload 7
      // 094: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 6
      // 09c: lload 10
      // 09e: bipush 1
      // 09f: anewarray 199
      // 0a2: dup_x2
      // 0a3: dup_x2
      // 0a4: pop
      // 0a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8: bipush 0
      // 0a9: swap
      // 0aa: aastore
      // 0ab: ldc2_w -1302961563917521524
      // 0ae: lload 7
      // 0b0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: astore 17
      // 0b7: iload 15
      // 0b9: iload 16
      // 0bb: iadd
      // 0bc: istore 18
      // 0be: iload 16
      // 0c0: bipush 1
      // 0c1: isub
      // 0c2: istore 19
      // 0c4: iload 19
      // 0c6: iflt 1a0
      // 0c9: iload 14
      // 0cb: lload 7
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 0da
      // 0d2: ifeq 1d3
      // 0d5: aload 17
      // 0d7: iload 19
      // 0d9: iaload
      // 0da: iload 18
      // 0dc: iload 16
      // 0de: isub
      // 0df: iload 19
      // 0e1: iadd
      // 0e2: iload 1
      // 0e3: iload 14
      // 0e5: ifeq 108
      // 0e8: goto 0f6
      // 0eb: ldc2_w -1110247808831124889
      // 0ee: lload 7
      // 0f0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: ifeq 10b
      // 0f9: goto 107
      // 0fc: ldc2_w -1110247808831124889
      // 0ff: lload 7
      // 101: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: bipush 1
      // 108: goto 10c
      // 10b: bipush 0
      // 10c: isub
      // 10d: iload 14
      // 10f: ifeq 136
      // 112: if_icmplt 12a
      // 115: goto 123
      // 118: ldc2_w -1110247808831124889
      // 11b: lload 7
      // 11d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: lload 7
      // 125: lconst_0
      // 126: lcmp
      // 127: ifgt 183
      // 12a: aload 17
      // 12c: iload 19
      // 12e: dup2
      // 12f: iaload
      // 130: bipush 1
      // 131: iadd
      // 132: iastore
      // 133: iload 19
      // 135: bipush 1
      // 136: iadd
      // 137: istore 20
      // 139: iload 20
      // 13b: iload 16
      // 13d: if_icmpge 177
      // 140: aload 17
      // 142: iload 20
      // 144: aload 17
      // 146: iload 20
      // 148: bipush 1
      // 149: isub
      // 14a: iaload
      // 14b: bipush 1
      // 14c: iadd
      // 14d: iastore
      // 14e: iinc 20 1
      // 151: iload 14
      // 153: lload 7
      // 155: lconst_0
      // 156: lcmp
      // 157: iflt 1a2
      // 15a: ifeq 1a0
      // 15d: iload 14
      // 15f: ifne 139
      // 162: lload 7
      // 164: lconst_0
      // 165: lcmp
      // 166: ifle 151
      // 169: goto 177
      // 16c: ldc2_w -1110247808831124889
      // 16f: lload 7
      // 171: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: iload 14
      // 179: lload 7
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: ifle 188
      // 180: ifne 1a0
      // 183: iinc 19 -1
      // 186: iload 14
      // 188: ifne 0c4
      // 18b: lload 7
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: ifle 0c9
      // 192: goto 1a0
      // 195: ldc2_w -1110247808831124889
      // 198: lload 7
      // 19a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: iload 14
      // 1a2: lload 7
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: iflt 1ad
      // 1a9: ifne 1d3
      // 1ac: bipush 0
      // 1ad: goto 1bb
      // 1b0: ldc2_w -1110247808831124889
      // 1b3: lload 7
      // 1b5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: istore 18
      // 1bd: iload 18
      // 1bf: iload 16
      // 1c1: if_icmpge 1d3
      // 1c4: aload 17
      // 1c6: iload 18
      // 1c8: iload 18
      // 1ca: iastore
      // 1cb: iinc 18 1
      // 1ce: iload 14
      // 1d0: ifne 1bd
      // 1d3: new com/zelix/_3
      // 1d6: dup
      // 1d7: aload 3
      // 1d8: aload 9
      // 1da: aload 5
      // 1dc: aload 17
      // 1de: lload 12
      // 1e0: invokespecial com/zelix/_3.<init> (Ljava/util/List;Ljava/lang/String;[C[IJ)V
      // 1e3: astore 18
      // 1e5: aload 18
      // 1e7: areturn
   }

   private static _3 h(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/List
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/String
      // 021: astore 7
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast [C
      // 029: astore 1
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/_3
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/lang/Boolean
      // 039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c: istore 4
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/lang/Boolean
      // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048: istore 6
      // 04a: pop
      // 04b: getstatic com/zelix/o.a J
      // 04e: lload 2
      // 04f: lxor
      // 050: lstore 2
      // 051: lload 2
      // 052: dup2
      // 053: ldc2_w 107350434068544
      // 056: lxor
      // 057: lstore 10
      // 059: dup2
      // 05a: ldc2_w 88009638007394
      // 05d: lxor
      // 05e: lstore 12
      // 060: pop2
      // 061: aload 9
      // 063: invokeinterface java/util/List.size ()I 1
      // 068: istore 15
      // 06a: ldc2_w -4996485885756317211
      // 06d: lload 2
      // 06e: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 1
      // 074: arraylength
      // 075: istore 16
      // 077: istore 14
      // 079: iload 16
      // 07b: newarray 10
      // 07d: astore 17
      // 07f: iload 6
      // 081: iload 14
      // 083: ifne 18a
      // 086: ifne 17c
      // 089: goto 096
      // 08c: ldc2_w -6792692787926770869
      // 08f: lload 2
      // 090: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: aload 8
      // 098: lload 10
      // 09a: bipush 1
      // 09b: anewarray 199
      // 09e: dup_x2
      // 09f: dup_x2
      // 0a0: pop
      // 0a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a4: bipush 0
      // 0a5: swap
      // 0a6: aastore
      // 0a7: ldc2_w -4843927912060666720
      // 0aa: lload 2
      // 0ab: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: astore 17
      // 0b2: iload 15
      // 0b4: iload 16
      // 0b6: iadd
      // 0b7: istore 18
      // 0b9: bipush 0
      // 0ba: istore 19
      // 0bc: iload 19
      // 0be: iload 16
      // 0c0: if_icmpge 171
      // 0c3: iload 14
      // 0c5: lload 2
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: ifle 0d3
      // 0cb: ifne 1c2
      // 0ce: aload 17
      // 0d0: iload 19
      // 0d2: iaload
      // 0d3: lload 2
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 110
      // 0d9: iload 19
      // 0db: iload 14
      // 0dd: ifne 10f
      // 0e0: goto 0ed
      // 0e3: ldc2_w -6792692787926770869
      // 0e6: lload 2
      // 0e7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: if_icmpne 103
      // 0f0: goto 0fd
      // 0f3: ldc2_w -6792692787926770869
      // 0f6: lload 2
      // 0f7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: ifgt 156
      // 103: aload 17
      // 105: iload 19
      // 107: dup2
      // 108: iaload
      // 109: bipush 1
      // 10a: isub
      // 10b: iastore
      // 10c: iload 19
      // 10e: bipush 1
      // 10f: isub
      // 110: istore 20
      // 112: iload 20
      // 114: iflt 14b
      // 117: aload 17
      // 119: iload 20
      // 11b: aload 17
      // 11d: iload 20
      // 11f: bipush 1
      // 120: iadd
      // 121: iaload
      // 122: bipush 1
      // 123: isub
      // 124: iastore
      // 125: iinc 20 -1
      // 128: iload 14
      // 12a: lload 2
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: iflt 173
      // 130: ifne 171
      // 133: iload 14
      // 135: ifeq 112
      // 138: lload 2
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 128
      // 13e: goto 14b
      // 141: ldc2_w -6792692787926770869
      // 144: lload 2
      // 145: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: iload 14
      // 14d: lload 2
      // 14e: lconst_0
      // 14f: lcmp
      // 150: iflt 15b
      // 153: ifeq 171
      // 156: iinc 19 1
      // 159: iload 14
      // 15b: ifeq 0bc
      // 15e: lload 2
      // 15f: lconst_0
      // 160: lcmp
      // 161: iflt 0c3
      // 164: goto 171
      // 167: ldc2_w -6792692787926770869
      // 16a: lload 2
      // 16b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: iload 14
      // 173: lload 2
      // 174: lconst_0
      // 175: lcmp
      // 176: ifle 17d
      // 179: ifeq 1c2
      // 17c: bipush 0
      // 17d: goto 18a
      // 180: ldc2_w -6792692787926770869
      // 183: lload 2
      // 184: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: istore 18
      // 18c: iload 18
      // 18e: iload 16
      // 190: if_icmpge 1c2
      // 193: aload 17
      // 195: iload 18
      // 197: iload 15
      // 199: iload 18
      // 19b: iadd
      // 19c: iload 4
      // 19e: iload 14
      // 1a0: ifne 1b4
      // 1a3: ifeq 1b7
      // 1a6: goto 1b3
      // 1a9: ldc2_w -6792692787926770869
      // 1ac: lload 2
      // 1ad: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: bipush 1
      // 1b4: goto 1b8
      // 1b7: bipush 0
      // 1b8: isub
      // 1b9: iastore
      // 1ba: iinc 18 1
      // 1bd: iload 14
      // 1bf: ifeq 18c
      // 1c2: new com/zelix/_3
      // 1c5: dup
      // 1c6: aload 9
      // 1c8: aload 7
      // 1ca: aload 1
      // 1cb: aload 17
      // 1cd: lload 12
      // 1cf: invokespecial com/zelix/_3.<init> (Ljava/util/List;Ljava/lang/String;[C[IJ)V
      // 1d2: astore 18
      // 1d4: aload 18
      // 1d6: areturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
