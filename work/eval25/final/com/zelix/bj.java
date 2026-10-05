package com.zelix;

import java.io.DataOutputStream;
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

public class bj extends h4 implements _zv {
   mx o;
   private static final long a = ess.a(-8932124448384616577L, -7297476221625698782L, MethodHandles.lookup().lookupClass()).a(122882163705910L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   protected void j(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 5
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 6
      // 23: pop
      // 24: lload 2
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w -3921248847547794946
      // 30: lload 2
      // 31: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 0
      // 37: aload 4
      // 39: lload 7
      // 3b: aload 5
      // 3d: aload 6
      // 3f: bipush 4
      // 40: anewarray 115
      // 43: dup_x1
      // 44: swap
      // 45: bipush 3
      // 46: swap
      // 47: aastore
      // 48: dup_x1
      // 49: swap
      // 4a: bipush 2
      // 4b: swap
      // 4c: aastore
      // 4d: dup_x2
      // 4e: dup_x2
      // 4f: pop
      // 50: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53: bipush 1
      // 54: swap
      // 55: aastore
      // 56: dup_x1
      // 57: swap
      // 58: bipush 0
      // 59: swap
      // 5a: aastore
      // 5b: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 5e: istore 9
      // 60: aload 5
      // 62: aload 0
      // 63: ldc2_w -3816153478891860701
      // 66: lload 2
      // 67: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 71: checkcast com/zelix/mx
      // 74: checkcast com/zelix/mx
      // 77: astore 10
      // 79: iload 9
      // 7b: ifeq a7
      // 7e: aload 10
      // 80: ifnull b2
      // 83: goto 90
      // 86: ldc2_w -3592149378224466362
      // 89: lload 2
      // 8a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: aload 4
      // 92: aload 10
      // 94: invokevirtual com/zelix/mx.B ()I
      // 97: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 9a: goto a7
      // 9d: ldc2_w -3592149378224466362
      // a0: lload 2
      // a1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: lload 2
      // a8: lconst_0
      // a9: lcmp
      // aa: ifle c4
      // ad: iload 9
      // af: ifne d1
      // b2: aload 4
      // b4: aload 0
      // b5: ldc2_w -3816153478891860701
      // b8: lload 2
      // b9: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: invokevirtual com/zelix/mx.B ()I
      // c1: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // c4: goto d1
      // c7: ldc2_w -3592149378224466362
      // ca: lload 2
      // cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: athrow
      // d1: return
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 10727274753381L;
      var3.H(this.c, this, this.x(), var6);
      x44.a<"k">(this, -6523345790112373935L, var1).O(var4, var3, this, this.x());
   }

   protected void O(Object[] var1) {
      long var2 = (Long)var1[0];
      DataOutputStream var4 = (DataOutputStream)var1[1];
      long var5 = var2 ^ 0L;
      super.O(new Object[]{var5, var4});
      var4.writeShort(x44.a<"h">(this, -7634994788735135710L, var2).B());
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: lload 6
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: dup2
      // 23: bipush 48
      // 25: lushr
      // 26: l2i
      // 27: istore 8
      // 29: dup2
      // 2a: bipush 16
      // 2c: lshl
      // 2d: bipush 32
      // 2f: lushr
      // 30: l2i
      // 31: istore 9
      // 33: dup2
      // 34: bipush 48
      // 36: lshl
      // 37: bipush 48
      // 39: lushr
      // 3a: l2i
      // 3b: istore 10
      // 3d: pop2
      // 3e: pop2
      // 3f: ldc2_w -6897634359885852628
      // 42: lload 6
      // 44: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: istore 11
      // 4b: aload 0
      // 4c: iload 11
      // 4e: ifeq 9b
      // 51: ldc2_w -6712599526890347279
      // 54: lload 6
      // 56: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: aload 1
      // 5c: if_acmpne 8c
      // 5f: goto 6d
      // 62: ldc2_w -6344342867914047596
      // 65: lload 6
      // 67: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 3
      // 6f: ldc2_w -6712599526890347279
      // 72: lload 6
      // 74: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: iload 11
      // 7b: ifne a8
      // 7e: goto 8c
      // 81: ldc2_w -6344342867914047596
      // 84: lload 6
      // 86: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: aload 0
      // 8d: goto 9b
      // 90: ldc2_w -6344342867914047596
      // 93: lload 6
      // 95: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: aload 1
      // 9c: iload 8
      // 9e: i2s
      // 9f: aload 3
      // a0: iload 9
      // a2: iload 10
      // a4: i2s
      // a5: invokespecial com/zelix/h4.b (Lcom/zelix/mx;SLcom/zelix/mx;IS)V
      // a8: return
   }

   bj(h8 var1, long var2, int var4, String var5, _xx var6, _y4 var7) {
      var2 = a ^ var2;
      long var8 = var2 ^ 31898925815055L;
      long var10 = var2 ^ 100782099002488L;
      long var12 = var2 ^ 26820501004161L;
      long var14 = (var2 ^ 61882662944573L) >>> 8;
      int var16 = (int)((var2 ^ 61882662944573L) << 56 >>> 56);
      super(var1, var4, var5, var10, var6, var7);
      int var17 = var6.readUnsignedShort();
      xl var18 = this.N(var14, var17, (byte)var16);
      x44.a<"m">(this, new Object[]{var8, var18}, -3558022904856161189L, var2);
      var7.G(x44.a<"i">(this, -3854420106257331029L, var2), this, var12);
   }

   void q(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/xl
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/bj.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 74564712902434
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 122080110495102
      // 025: lxor
      // 026: lstore 7
      // 028: pop2
      // 029: ldc2_w 3186819588752873597
      // 02c: lload 3
      // 02d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: istore 9
      // 034: iload 9
      // 036: ifne 107
      // 039: aload 2
      // 03a: instanceof com/zelix/mx
      // 03d: ifne 0f9
      // 040: goto 04d
      // 043: ldc2_w 3962116690539753116
      // 046: lload 3
      // 047: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: new com/zelix/_sx
      // 050: dup
      // 051: new java/lang/StringBuilder
      // 054: dup
      // 055: invokespecial java/lang/StringBuilder.<init> ()V
      // 058: sipush 17969
      // 05b: ldc2_w 399976742094017088
      // 05e: lload 3
      // 05f: lxor
      // 060: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 068: aload 0
      // 069: lload 5
      // 06b: invokevirtual com/zelix/bj.k (J)Ljava/lang/String;
      // 06e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 071: sipush 19881
      // 074: ldc2_w 51589042413574618
      // 077: lload 3
      // 078: lxor
      // 079: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 081: sipush 16866
      // 084: ldc2_w 6488293518156993938
      // 087: lload 3
      // 088: lxor
      // 089: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 091: sipush 14759
      // 094: ldc2_w 5494762990379658709
      // 097: lload 3
      // 098: lxor
      // 099: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a1: aload 2
      // 0a2: ifnull 0ed
      // 0a5: goto 0b2
      // 0a8: ldc2_w 3962116690539753116
      // 0ab: lload 3
      // 0ac: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: aload 2
      // 0ba: lload 7
      // 0bc: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c2: ldc " "
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: aload 2
      // 0c8: invokevirtual com/zelix/xl.B ()I
      // 0cb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ce: ldc " "
      // 0d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d3: aload 2
      // 0d4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d7: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e0: goto 0ef
      // 0e3: ldc2_w 3962116690539753116
      // 0e6: lload 3
      // 0e7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: ldc ""
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f5: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: aload 2
      // 0fb: checkcast com/zelix/mx
      // 0fe: ldc2_w 3733510128705041913
      // 101: lload 3
      // 102: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: return
   }

   static {
      long var0 = a ^ 64241681844488L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u0015âÔñ=õRL\u001c\u0016¡\u0097\u00009~\u0015f÷PÃ¨ë\u0003>8GØÿ\u0089Ez\u008aÜpq¿r^\u0010\u0000p\u0011ô\u0083Ç\u0004\u0090ã\u0018ÝPÜ3\u0099ÖÒ)<Ô\u00810ÿ\u000blUá×}ÔÄ<\u0010M\u0015dÐÿ$ût\u0092";
      int var8 = "\u0015âÔñ=õRL\u001c\u0016¡\u0097\u00009~\u0015f÷PÃ¨ë\u0003>8GØÿ\u0089Ez\u008aÜpq¿r^\u0010\u0000p\u0011ô\u0083Ç\u0004\u0090ã\u0018ÝPÜ3\u0099ÖÒ)<Ô\u00810ÿ\u000blUá×}ÔÄ<\u0010M\u0015dÐÿ$ût\u0092"
         .length();
      char var5 = 24;
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
                     b = var9;
                     d = new String[4];
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

                  var6 = "è\u001fÄ\u0011±\u008e\u008acHÌã¨ÁAè§\u0010Þú÷>\u0087ø2\u00968\u000bn\u0017ôsH\u009c";
                  var8 = "è\u001fÄ\u0011±\u008e\u008acHÌã¨ÁAè§\u0010Þú÷>\u0087ø2\u00968\u000bn\u0017ôsH\u009c".length();
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27037;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bj", var10);
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
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/bj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
