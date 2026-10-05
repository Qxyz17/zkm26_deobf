package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class az implements d1 {
   private boolean J;
   private boolean N;
   private int l = -1;
   private final int R;
   private static final long a = prr.a(-7756024822637681193L, 74653596428512078L, MethodHandles.lookup().lookupClass()).a(229019717933304L);
   private static final long b;

   public boolean o(byte param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 56
      // 04: lshl
      // 05: lload 2
      // 06: bipush 8
      // 08: lshl
      // 09: bipush 8
      // 0b: lushr
      // 0c: lor
      // 0d: getstatic com/zelix/az.a J
      // 10: lxor
      // 11: lstore 4
      // 13: ldc2_w 7907265098218136975
      // 16: lload 4
      // 18: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: istore 6
      // 1f: aload 0
      // 20: getfield com/zelix/az.l I
      // 23: iload 6
      // 25: ifne 4c
      // 28: getstatic com/zelix/az.b J
      // 2b: l2i
      // 2c: if_icmple 4f
      // 2f: goto 3d
      // 32: ldc2_w 8581684872791299563
      // 35: lload 4
      // 37: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 4c
      // 41: ldc2_w 8581684872791299563
      // 44: lload 4
      // 46: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: goto 50
      // 4f: bipush 0
      // 50: ireturn
   }

   public void j(Object[] var1) {
      this.N = false;
   }

   public int x(int var1) {
      int var2 = this.l;
      this.l = var1;
      return var2;
   }

   public void v() {
      this.N = true;
   }

   public az(int var1, int var2) {
      this.l = var1;
      this.R = var2;
   }

   public boolean R(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = m44.a<"n">(5418089773181075692L, var2);

      try {
         int var10000 = m44.a<"p">(this, 5589068708928958837L, var2);
         if (!var4) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (n9 var5) {
         throw m44.a<"n">(var5, 5639758343718874295L, var2);
      }

      return (boolean)0;
   }

   public int n() {
      return this.l;
   }

   public az(int var1, boolean var2, boolean var3) {
      this(var1, var2, var3, 0);
   }

   public void Z(Object[] var1) {
      this.J = false;
   }

   public boolean J() {
      return this.J;
   }

   public az(int var1) {
      this(var1, 0);
   }

   public boolean y() {
      return this.N;
   }

   public void f() {
      this.J = true;
   }

   public az(int var1, boolean var2, boolean var3, int var4) {
      this.l = var1;
      this.R = var4;
      this.N = var2;
      this.J = var3;
   }

   static {
      long var0 = a ^ 109741369075906L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -4941285948401968483L;
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

   private static n9 a(n9 var0) {
      return var0;
   }
}
