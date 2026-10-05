package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _oq extends _og {
   n w;
   private static final long b = ess.a(5058218018396245131L, 2544557699768110710L, MethodHandles.lookup().lookupClass()).a(228805675912110L);
   private static final long g;

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      return x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2);
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public _oq(int var1) {
      super(var1);
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
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
      // 0e: ifnonnull 30
      // 11: iload 2
      // 12: if_icmplt 33
      // 15: goto 22
      // 18: ldc2_w 8222842954770761155
      // 1b: lload 3
      // 1c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: athrow
      // 22: bipush 1
      // 23: goto 30
      // 26: ldc2_w 8222842954770761155
      // 29: lload 3
      // 2a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean c(char var1, short var2, int var3) {
      return false;
   }

   abstract void K(Object[] var1);

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public boolean N() {
      return true;
   }

   public boolean Y(Object[] var1) {
      int var2 = (Integer)var1[0];
      n var3 = (n)var1[1];
      int var6 = (Integer)var1[2];
      long var4 = (Long)var1[3];
      return false;
   }

   public n i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"j">(this, -7741878850275537292L, var2);
   }

   public boolean I(long var1) {
      return true;
   }

   public final void k(Object[] param1) {
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
      // 04: checkcast java/io/PrintWriter
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/StringBuilder
      // 19: astore 2
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 32198005677074
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 72462291038852
      // 28: lxor
      // 29: lstore 8
      // 2b: pop2
      // 2c: ldc2_w 8216154267410362304
      // 2f: lload 4
      // 31: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: new java/lang/StringBuilder
      // 39: dup
      // 3a: getstatic com/zelix/_oq.g J
      // 3d: l2i
      // 3e: invokespecial java/lang/StringBuilder.<init> (I)V
      // 41: astore 11
      // 43: astore 10
      // 45: aload 11
      // 47: aload 2
      // 48: ldc2_w 8254020082990028588
      // 4b: lload 4
      // 4d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: pop
      // 53: aload 11
      // 55: aload 2
      // 56: ldc2_w 8254020082990028588
      // 59: lload 4
      // 5b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: pop
      // 61: aload 11
      // 63: aload 0
      // 64: lload 6
      // 66: bipush 1
      // 67: anewarray 151
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 0
      // 71: swap
      // 72: aastore
      // 73: ldc2_w 8353405308985101719
      // 76: lload 4
      // 78: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80: pop
      // 81: aload 0
      // 82: getfield com/zelix/_oq.a I
      // 85: lload 8
      // 87: dup2_x1
      // 88: pop2
      // 89: bipush 2
      // 8a: anewarray 151
      // 8d: dup_x1
      // 8e: swap
      // 8f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 92: bipush 1
      // 93: swap
      // 94: aastore
      // 95: dup_x2
      // 96: dup_x2
      // 97: pop
      // 98: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9b: bipush 0
      // 9c: swap
      // 9d: aastore
      // 9e: ldc2_w 8570484206580877217
      // a1: lload 4
      // a3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: astore 12
      // aa: aload 10
      // ac: ifnonnull f6
      // af: aload 12
      // b1: invokevirtual java/lang/String.length ()I
      // b4: ifle ed
      // b7: goto c5
      // ba: ldc2_w 8039271247044171855
      // bd: lload 4
      // bf: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: athrow
      // c5: aload 11
      // c7: new java/lang/StringBuilder
      // ca: dup
      // cb: invokespecial java/lang/StringBuilder.<init> ()V
      // ce: ldc "\t"
      // d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d3: aload 12
      // d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // de: pop
      // df: goto ed
      // e2: ldc2_w 8039271247044171855
      // e5: lload 4
      // e7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ec: athrow
      // ed: aload 3
      // ee: aload 11
      // f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // f3: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // f6: return
   }

   public _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var8 = var2 ^ 32610570959058L;
      long var10 = var2 ^ 100702781803961L;
      long var12 = var2 ^ 118237195067467L;
      long var14 = var2 ^ 37585498234552L;
      n[] var16 = var1.r();
      n[] var17 = var1.m();
      int var18 = var17.length;
      p5 var19 = var1.z();
      n[] var20 = n.S(var18 - 1, var12);
      System.arraycopy(var17, 0, var20, 0, var18 - 1);
      x44.a<"t">(this, var17[var17.length - 1], 8058697697202763053L, var2);
      _kz var21 = new _kz(var20, var16, var14, var19, var1.C(var8));
      x44.a<"o">(this, new Object[]{var21, var10}, 8027492553457540567L, var2);
      return var21;
   }

   static {
      long var0 = b ^ 31438627021619L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -8828969001259957783L;
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
      g = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
