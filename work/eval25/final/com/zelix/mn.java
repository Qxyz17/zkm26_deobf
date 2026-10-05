package com.zelix;

import java.io.DataOutputStream;
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

public class mn extends xl implements _u0, _zv, rt {
   mx q;
   mx Y;
   static final w5 x;
   private static final long a = ess.a(331608880070621138L, 4264749706152441749L, MethodHandles.lookup().lookupClass()).a(271594677379888L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   void T(Object[] var1) {
      long var2 = (Long)var1[0];
      HashMap var4 = (HashMap)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 14621685452911L;
      String var7 = this.q.u();
      String var8 = x44.a<"p">(var7, var4, var5, 864929374488068807L, var2);

      try {
         if (var8 != var7) {
            this.q.v(var8);
         }
      } catch (gj var9) {
         throw x44.a<"p">(var9, 774824732567829115L, var2);
      }
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   static {
      long var20 = a ^ 94167220765901L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[2];
      int var16 = 0;
      String var15 = "¥Û\u0013\u0017\u0002²j\rðCI)ß=+\u001f\u0010tû\u0007\u0098\u007f\u008b²ºÓ»i'\u008dÚjÖ";
      int var17 = "¥Û\u0013\u0017\u0002²j\rðCI)ß=+\u001f\u0010tû\u0007\u0098\u007f\u008b²ºÓ»i'\u008dÚjÖ".length();
      char var14 = 16;
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var27 = b(var19).intern();
         int var10001 = -1;
         var18[var16++] = var27;
         if ((var13 += var14) >= var17) {
            b = var18;
            c = new String[2];
            g = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "û\u0000\u001e\u0012L¸}v\t_ø\u0012@¸Ý×r\u0013\u007f<gr¬²";
            int var5 = "û\u0000\u001e\u0012L¸}v\t_ø\u0012@¸Ý×r\u0013\u007f<gr¬²".length();
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            e = var6;
            f = new Integer[3];
            x = x44.a<"i">(-8875587529223959910L, var20);
            return;
         }

         var14 = var15.charAt(var13);
      }
   }

   mn(int param1, long param2, _83 param4, mx param5, mx param6, _y4 param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/mn.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 125899073917642
      // 0b: lxor
      // 0c: lstore 8
      // 0e: pop2
      // 0f: ldc2_w -8885460248789655215
      // 12: lload 2
      // 13: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 0
      // 19: iload 1
      // 1a: aload 4
      // 1c: invokespecial com/zelix/xl.<init> (ILcom/zelix/_83;)V
      // 1f: astore 10
      // 21: aload 0
      // 22: aload 5
      // 24: putfield com/zelix/mn.Y Lcom/zelix/mx;
      // 27: aload 0
      // 28: aload 6
      // 2a: putfield com/zelix/mn.q Lcom/zelix/mx;
      // 2d: aload 7
      // 2f: aload 10
      // 31: ifnonnull 5d
      // 34: ifnull 65
      // 37: goto 44
      // 3a: ldc2_w -8904013399631334187
      // 3d: lload 2
      // 3e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 7
      // 46: aload 5
      // 48: aload 0
      // 49: lload 8
      // 4b: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 4e: aload 7
      // 50: goto 5d
      // 53: ldc2_w -8904013399631334187
      // 56: lload 2
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 6
      // 5f: aload 0
      // 60: lload 8
      // 62: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 65: return
   }

   public String t(long var1) {
      long var3 = var1 ^ 8063306675912L;
      return this.Y.N(var3) + c<"l">(32201, 841689897657325500L ^ var1) + this.q.N(var3);
   }

   public List L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 50530475496368L;
      return x44.a<"r">(new Object[]{var4, this.M()}, -4428099300477058975L, var2);
   }

   public final void z(Object[] var1) {
      String var2 = (String)var1[0];
      this.q.v(var2);
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x.l());
      var3.writeShort(this.Y.B());
      var3.writeShort(this.q.B());
   }

   mn(mm var1, mx var2, mx var3) {
      super(var1.i, var1.j);
      this.Y = var2;
      this.q = var3;
   }

   public String C(Object[] param1) {
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
      // 00e: ldc2_w 106282555859775
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 94112851725289
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 100023681756774
      // 01f: lxor
      // 020: lstore 8
      // 022: pop2
      // 023: ldc2_w -1468764822655889796
      // 026: lload 2
      // 027: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: aload 0
      // 02d: getfield com/zelix/mn.Y Lcom/zelix/mx;
      // 030: lload 8
      // 032: invokevirtual com/zelix/mx.N (J)Ljava/lang/String;
      // 035: astore 11
      // 037: astore 10
      // 039: aload 0
      // 03a: getfield com/zelix/mn.q Lcom/zelix/mx;
      // 03d: lload 8
      // 03f: invokevirtual com/zelix/mx.N (J)Ljava/lang/String;
      // 042: astore 12
      // 044: aload 11
      // 046: astore 13
      // 048: aload 12
      // 04a: aload 10
      // 04c: ifnonnull 142
      // 04f: sipush 21531
      // 052: ldc2_w 1942083799483213507
      // 055: lload 2
      // 056: lxor
      // 057: invokedynamic l (IJ)I bsm=com/zelix/mn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: invokevirtual java/lang/String.indexOf (I)I
      // 05f: ifne 140
      // 062: goto 06f
      // 065: ldc2_w -1494086584324088840
      // 068: lload 2
      // 069: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: new java/lang/StringBuilder
      // 072: dup
      // 073: invokespecial java/lang/StringBuilder.<init> ()V
      // 076: aload 13
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: ldc "("
      // 07d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 080: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 083: astore 13
      // 085: lload 6
      // 087: aload 12
      // 089: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 08c: astore 14
      // 08e: bipush 0
      // 08f: istore 15
      // 091: iload 15
      // 093: aload 14
      // 095: invokeinterface java/util/List.size ()I 1
      // 09a: if_icmpge 124
      // 09d: new java/lang/StringBuilder
      // 0a0: dup
      // 0a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a4: aload 13
      // 0a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a9: lload 2
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: iflt 0c8
      // 0af: aload 14
      // 0b1: iload 15
      // 0b3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0b8: checkcast java/lang/String
      // 0bb: lload 4
      // 0bd: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 0c0: aload 10
      // 0c2: ifnonnull 10f
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: aload 10
      // 0ca: ifnonnull 13b
      // 0cd: goto 0da
      // 0d0: ldc2_w -1494086584324088840
      // 0d3: lload 2
      // 0d4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: iload 15
      // 0dc: aload 14
      // 0de: invokeinterface java/util/List.size ()I 1
      // 0e3: bipush 1
      // 0e4: isub
      // 0e5: if_icmpge 112
      // 0e8: goto 0f5
      // 0eb: ldc2_w -1494086584324088840
      // 0ee: lload 2
      // 0ef: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: sipush 21641
      // 0f8: ldc2_w 3835472745178903948
      // 0fb: lload 2
      // 0fc: lxor
      // 0fd: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/mn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: goto 10f
      // 105: ldc2_w -1494086584324088840
      // 108: lload 2
      // 109: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: goto 114
      // 112: ldc ""
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 117: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11a: astore 13
      // 11c: iinc 15 1
      // 11f: aload 10
      // 121: ifnull 091
      // 124: new java/lang/StringBuilder
      // 127: dup
      // 128: invokespecial java/lang/StringBuilder.<init> ()V
      // 12b: aload 13
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: ldc ")"
      // 132: lload 2
      // 133: lconst_0
      // 134: lcmp
      // 135: iflt 0c0
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: astore 13
      // 140: aload 13
      // 142: areturn
   }

   public final void q(Object[] var1) {
      String var2 = (String)var1[0];
      this.Y.v(var2);
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
      // 1b: ldc2_w -6799946151540505536
      // 1e: lload 6
      // 20: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 8
      // 27: aload 0
      // 28: getfield com/zelix/mn.Y Lcom/zelix/mx;
      // 2b: aload 1
      // 2c: aload 8
      // 2e: ifnonnull 80
      // 31: if_acmpne 5a
      // 34: goto 42
      // 37: ldc2_w -6809536066433134140
      // 3a: lload 6
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: aload 3
      // 44: putfield com/zelix/mn.Y Lcom/zelix/mx;
      // 47: aload 8
      // 49: ifnull 88
      // 4c: goto 5a
      // 4f: ldc2_w -6809536066433134140
      // 52: lload 6
      // 54: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 8
      // 5d: ifnonnull 84
      // 60: goto 6e
      // 63: ldc2_w -6809536066433134140
      // 66: lload 6
      // 68: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: getfield com/zelix/mn.q Lcom/zelix/mx;
      // 71: aload 1
      // 72: goto 80
      // 75: ldc2_w -6809536066433134140
      // 78: lload 6
      // 7a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: if_acmpne 88
      // 83: aload 0
      // 84: aload 3
      // 85: putfield com/zelix/mn.q Lcom/zelix/mx;
      // 88: return
   }

   mx X() {
      return this.q;
   }

   public List y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 19276172867455L;
      return x44.a<"s">(new Object[]{this.M(), var4}, -4918549776921446057L, var2);
   }

   public w5 m(long var1) {
      return x;
   }

   protected void V(DataOutputStream param1, long param2, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getstatic com/zelix/mn.x Lcom/zelix/w5;
      // 04: invokevirtual com/zelix/w5.l ()I
      // 07: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 0a: ldc2_w 6273785328803656433
      // 0d: lload 2
      // 0e: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13: aload 4
      // 15: aload 0
      // 16: getfield com/zelix/mn.Y Lcom/zelix/mx;
      // 19: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1e: checkcast com/zelix/mx
      // 21: checkcast com/zelix/mx
      // 24: astore 6
      // 26: astore 5
      // 28: aload 5
      // 2a: lload 2
      // 2b: lconst_0
      // 2c: lcmp
      // 2d: ifle 5d
      // 30: ifnonnull 5b
      // 33: aload 6
      // 35: ifnull 66
      // 38: goto 45
      // 3b: ldc2_w 6327241376841344885
      // 3e: lload 2
      // 3f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 1
      // 46: aload 6
      // 48: invokevirtual com/zelix/mx.B ()I
      // 4b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 4e: goto 5b
      // 51: ldc2_w 6327241376841344885
      // 54: lload 2
      // 55: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 5
      // 5d: lload 2
      // 5e: lconst_0
      // 5f: lcmp
      // 60: iflt 89
      // 63: ifnull 7e
      // 66: aload 1
      // 67: aload 0
      // 68: getfield com/zelix/mn.Y Lcom/zelix/mx;
      // 6b: invokevirtual com/zelix/mx.B ()I
      // 6e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 71: goto 7e
      // 74: ldc2_w 6327241376841344885
      // 77: lload 2
      // 78: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 4
      // 80: aload 0
      // 81: getfield com/zelix/mn.q Lcom/zelix/mx;
      // 84: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 89: checkcast com/zelix/mx
      // 8c: checkcast com/zelix/mx
      // 8f: astore 7
      // 91: aload 5
      // 93: lload 2
      // 94: lconst_0
      // 95: lcmp
      // 96: ifle cc
      // 99: ifnonnull c4
      // 9c: aload 7
      // 9e: ifnull cf
      // a1: goto ae
      // a4: ldc2_w 6327241376841344885
      // a7: lload 2
      // a8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: aload 1
      // af: aload 7
      // b1: invokevirtual com/zelix/mx.B ()I
      // b4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // b7: goto c4
      // ba: ldc2_w 6327241376841344885
      // bd: lload 2
      // be: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: lload 2
      // c5: lconst_0
      // c6: lcmp
      // c7: iflt da
      // ca: aload 5
      // cc: ifnull e7
      // cf: aload 1
      // d0: aload 0
      // d1: getfield com/zelix/mn.q Lcom/zelix/mx;
      // d4: invokevirtual com/zelix/mx.B ()I
      // d7: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // da: goto e7
      // dd: ldc2_w 6327241376841344885
      // e0: lload 2
      // e1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e6: athrow
      // e7: return
   }

   public String F() {
      return this.Y.u();
   }

   public String M() {
      return this.q.u();
   }

   mx C() {
      return this.Y;
   }

   public String N(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 64120673652057
      // 005: lxor
      // 006: lstore 3
      // 007: dup2
      // 008: ldc2_w 16908466103695
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 0
      // 012: lxor
      // 013: lstore 7
      // 015: pop2
      // 016: ldc2_w -4180540208703037414
      // 019: lload 1
      // 01a: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: getfield com/zelix/mn.q Lcom/zelix/mx;
      // 023: lload 7
      // 025: invokevirtual com/zelix/mx.N (J)Ljava/lang/String;
      // 028: astore 10
      // 02a: aload 0
      // 02b: getfield com/zelix/mn.Y Lcom/zelix/mx;
      // 02e: lload 7
      // 030: invokevirtual com/zelix/mx.N (J)Ljava/lang/String;
      // 033: astore 11
      // 035: astore 9
      // 037: new java/lang/StringBuilder
      // 03a: dup
      // 03b: invokespecial java/lang/StringBuilder.<init> ()V
      // 03e: aload 10
      // 040: lload 3
      // 041: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 044: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 047: ldc " "
      // 049: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04c: aload 11
      // 04e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 051: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 054: astore 12
      // 056: aload 10
      // 058: aload 9
      // 05a: ifnonnull 14f
      // 05d: sipush 17613
      // 060: ldc2_w 8266427715251755121
      // 063: lload 1
      // 064: lxor
      // 065: invokedynamic l (IJ)I bsm=com/zelix/mn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: invokevirtual java/lang/String.indexOf (I)I
      // 06d: ifne 14d
      // 070: goto 07d
      // 073: ldc2_w -4240795653272586850
      // 076: lload 1
      // 077: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: new java/lang/StringBuilder
      // 080: dup
      // 081: invokespecial java/lang/StringBuilder.<init> ()V
      // 084: aload 12
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: ldc "("
      // 08b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 091: astore 12
      // 093: lload 5
      // 095: aload 10
      // 097: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 09a: astore 13
      // 09c: bipush 0
      // 09d: istore 14
      // 09f: iload 14
      // 0a1: aload 13
      // 0a3: invokeinterface java/util/List.size ()I 1
      // 0a8: if_icmpge 131
      // 0ab: new java/lang/StringBuilder
      // 0ae: dup
      // 0af: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b2: aload 12
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: lload 1
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 0d5
      // 0bd: aload 13
      // 0bf: iload 14
      // 0c1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c6: checkcast java/lang/String
      // 0c9: lload 3
      // 0ca: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 0cd: aload 9
      // 0cf: ifnonnull 11c
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: aload 9
      // 0d7: ifnonnull 148
      // 0da: goto 0e7
      // 0dd: ldc2_w -4240795653272586850
      // 0e0: lload 1
      // 0e1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: iload 14
      // 0e9: aload 13
      // 0eb: invokeinterface java/util/List.size ()I 1
      // 0f0: bipush 1
      // 0f1: isub
      // 0f2: if_icmpge 11f
      // 0f5: goto 102
      // 0f8: ldc2_w -4240795653272586850
      // 0fb: lload 1
      // 0fc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: sipush 15188
      // 105: ldc2_w 6454414885149930550
      // 108: lload 1
      // 109: lxor
      // 10a: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/mn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: goto 11c
      // 112: ldc2_w -4240795653272586850
      // 115: lload 1
      // 116: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: goto 121
      // 11f: ldc ""
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 127: astore 12
      // 129: iinc 14 1
      // 12c: aload 9
      // 12e: ifnull 09f
      // 131: new java/lang/StringBuilder
      // 134: dup
      // 135: invokespecial java/lang/StringBuilder.<init> ()V
      // 138: aload 12
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: ldc ")"
      // 13f: lload 1
      // 140: lconst_0
      // 141: lcmp
      // 142: iflt 0cd
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14b: astore 12
      // 14d: aload 12
      // 14f: areturn
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2012;
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
            throw new RuntimeException("com/zelix/mn", var10);
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
         throw new RuntimeException("com/zelix/mn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21506;
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
            throw new RuntimeException("com/zelix/mn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/mn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
