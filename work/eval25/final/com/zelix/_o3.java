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

public class _o3 extends _ow {
   private int O;
   private static final long b = ess.a(8557504706012819774L, 2307740592264937402L, MethodHandles.lookup().lookupClass()).a(161762269000860L);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map p = new HashMap(13);

   public boolean Y(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 5
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/n
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 6
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Long
      // 24: invokevirtual java/lang/Long.longValue ()J
      // 27: lstore 3
      // 28: pop
      // 29: ldc2_w 5084457588552424266
      // 2c: lload 3
      // 2d: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: astore 7
      // 34: iload 5
      // 36: aload 7
      // 38: ifnonnull 5d
      // 3b: iload 6
      // 3d: bipush 1
      // 3e: isub
      // 3f: if_icmplt 60
      // 42: goto 4f
      // 45: ldc2_w 6490072533242659962
      // 48: lload 3
      // 49: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 5d
      // 53: ldc2_w 6490072533242659962
      // 56: lload 3
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: goto 61
      // 60: bipush 0
      // 61: ireturn
   }

   public void K(long var1, DataOutputStream var3, Map var4) {
      long var5 = var1 ^ 0L;
      super.K(var5, var3, var4);
      var3.writeByte(x44.a<"n">(this, -4557388565241546678L, var1));
   }

   public void k(Object[] param1) {
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
      // 004: checkcast java/io/PrintWriter
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 32198005677074
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 43317403178689
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 72462291038852
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 128528899487657
      // 036: lxor
      // 037: lstore 12
      // 039: pop2
      // 03a: new java/lang/StringBuilder
      // 03d: dup
      // 03e: sipush 3849
      // 041: ldc2_w 478087235716301877
      // 044: lload 4
      // 046: lxor
      // 047: invokedynamic a (IJ)I bsm=com/zelix/_o3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: invokespecial java/lang/StringBuilder.<init> (I)V
      // 04f: astore 15
      // 051: aload 0
      // 052: lload 6
      // 054: bipush 1
      // 055: anewarray 13
      // 058: dup_x2
      // 059: dup_x2
      // 05a: pop
      // 05b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05e: bipush 0
      // 05f: swap
      // 060: aastore
      // 061: ldc2_w 8353405308985101719
      // 064: lload 4
      // 066: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: astore 16
      // 06d: ldc2_w 8216154267410362304
      // 070: lload 4
      // 072: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 15
      // 079: new java/lang/StringBuilder
      // 07c: dup
      // 07d: invokespecial java/lang/StringBuilder.<init> ()V
      // 080: aload 16
      // 082: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 085: ldc " "
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: aload 0
      // 08b: getfield com/zelix/_o3.o Lcom/zelix/xl;
      // 08e: invokevirtual com/zelix/xl.B ()I
      // 091: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 094: ldc " "
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: aload 0
      // 09a: ldc2_w 7669333638774395620
      // 09d: lload 4
      // 09f: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ad: pop
      // 0ae: aload 0
      // 0af: getfield com/zelix/_o3.a I
      // 0b2: lload 10
      // 0b4: dup2_x1
      // 0b5: pop2
      // 0b6: bipush 2
      // 0b7: anewarray 13
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bf: bipush 1
      // 0c0: swap
      // 0c1: aastore
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: ldc2_w 8570484206580877217
      // 0ce: lload 4
      // 0d0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: astore 17
      // 0d7: astore 14
      // 0d9: aload 17
      // 0db: aload 0
      // 0dc: getfield com/zelix/_o3.o Lcom/zelix/xl;
      // 0df: lload 12
      // 0e1: ldc2_w 8448228292890142953
      // 0e4: lload 4
      // 0e6: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: lload 8
      // 0ed: dup2_x1
      // 0ee: pop2
      // 0ef: bipush 3
      // 0f0: anewarray 13
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 2
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 1
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w 7799761149368071863
      // 109: lload 4
      // 10b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: astore 17
      // 112: aload 17
      // 114: aload 0
      // 115: ldc2_w 7669333638774395620
      // 118: lload 4
      // 11a: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: ldc2_w 8463256255195338727
      // 122: lload 4
      // 124: invokedynamic t (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: lload 8
      // 12b: dup2_x1
      // 12c: pop2
      // 12d: bipush 3
      // 12e: anewarray 13
      // 131: dup_x1
      // 132: swap
      // 133: bipush 2
      // 134: swap
      // 135: aastore
      // 136: dup_x2
      // 137: dup_x2
      // 138: pop
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: bipush 1
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: ldc2_w 7799761149368071863
      // 147: lload 4
      // 149: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: astore 17
      // 150: aload 14
      // 152: ifnonnull 1b4
      // 155: aload 17
      // 157: invokevirtual java/lang/String.length ()I
      // 15a: ifle 193
      // 15d: goto 16b
      // 160: ldc2_w 7970075496460054768
      // 163: lload 4
      // 165: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 15
      // 16d: new java/lang/StringBuilder
      // 170: dup
      // 171: invokespecial java/lang/StringBuilder.<init> ()V
      // 174: ldc "\t"
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 179: aload 17
      // 17b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 181: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 184: pop
      // 185: goto 193
      // 188: ldc2_w 7970075496460054768
      // 18b: lload 4
      // 18d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: aload 3
      // 194: new java/lang/StringBuilder
      // 197: dup
      // 198: invokespecial java/lang/StringBuilder.<init> ()V
      // 19b: aload 2
      // 19c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a2: aload 2
      // 1a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a9: aload 15
      // 1ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b1: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1b4: return
   }

   public boolean N(int param1, int param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 8037225787695755852
      // 03: lload 3
      // 04: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: astore 5
      // 0b: iload 1
      // 0c: aload 5
      // 0e: ifnonnull 32
      // 11: iload 2
      // 12: bipush 1
      // 13: isub
      // 14: if_icmplt 35
      // 17: goto 24
      // 1a: ldc2_w 8293158729477582204
      // 1d: lload 3
      // 1e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: athrow
      // 24: bipush 1
      // 25: goto 32
      // 28: ldc2_w 8293158729477582204
      // 2b: lload 3
      // 2c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   public int d(long var1) {
      return 4;
   }

   public _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var10001 = var2 ^ 40956089078999L;
      int var8 = (int)((var2 ^ 40956089078999L) >>> 48);
      int var9 = (int)((var2 ^ 40956089078999L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var2 ^ 9675472245010L;
      long var13 = var2 ^ 32610570959058L;
      long var15 = var2 ^ 118237195067467L;
      long var17 = var2 ^ 37585498234552L;
      n[] var19 = var1.m();
      n[] var20 = var1.r();
      int var21 = var19.length;
      n[] var22 = com.zelix.n.S(var21 - x44.a<"k">(this, 7939178312647906983L, var2) + 1, var15);
      int var23 = var22.length;
      System.arraycopy(var19, 0, var22, 0, var23 - 1);
      x7 var24 = (x7)this.o;
      String var25 = var24.a(var11);
      var22[var23 - 1] = com.zelix.n.s((char)var8, (short)var9, var25, var10);
      return new _kz(var22, var20, var17, var1.z(), var1.C(var13));
   }

   _o3(_xx var1, va var2, _y4 var3, _y4 var4, _y4 var5, char var6, _y4 var7, char var8, _y4 var9, int var10) {
      long var11 = ((long)var6 << 48 | (long)var8 << 48 >>> 16 | (long)var10 << 32 >>> 32) ^ b;
      long var13 = var11 ^ 95653441951043L;
      super(c<"a">(31641, 49838132133549267L ^ var11), var1, var2, var3, var4, var5, var7, var9, var13);
      x44.a<"p">(this, var1.read(), 1016048124472555155L, var11);
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      long var6 = var2 ^ 45294604634303L;
      StringBuilder var8 = new StringBuilder();
      var8.append(x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2));
      var8.append((char)c<"a">(12269, 4704679027372465092L ^ var2));
      var8.append(x44.a<"j">(this.o, var6, 731974627431766015L, var2));
      var8.append((char)c<"a">(1292, 7025506282598347044L ^ var2));
      var8.append(x44.a<"n">(this, 1547179552469315058L, var2));
      return var8.toString();
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      super.W(var6, var2, var7);
      var2.writeByte(x44.a<"l">(this, 4024773383783665488L, var4));
   }

   static {
      long var0 = b ^ 58838073809277L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "\u001e\u0097é\u0001\u008c<2°|\u009b\u0095¶Ô£Ä\u0087";
      int var7 = "\u001e\u0097é\u0001\u008c<2°|\u009b\u0095¶Ô£Ä\u0087".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
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
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     m = var8;
                     n = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "\u0088i TÙnÅ>\u0010\u00995k\u009a0ëu";
                  var7 = "\u0088i TÙnÅ>\u0010\u00995k\u009a0ëu".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13352;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
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
         throw new RuntimeException("com/zelix/_o3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
