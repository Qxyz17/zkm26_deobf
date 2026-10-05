package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vi implements lu {
   private int o = -1;
   private boolean a;
   private boolean u;
   private final int h;
   private static final long b = ess.a(-6364176898648493064L, -7045962916059300762L, MethodHandles.lookup().lookupClass()).a(197478392402723L);
   private static final long c;

   public void K() {
      this.a = true;
   }

   public vi(int var1) {
      this(var1, 0);
   }

   public void F() {
      this.u = true;
   }

   public void t(Object[] var1) {
      this.u = false;
   }

   public int B(int var1) {
      int var2 = this.o;
      this.o = var1;
      return var2;
   }

   public boolean b(Object[] var1) {
      long var2 = (Long)var1[0];
      int[] var4 = x44.a<"u">(8950006777561801201L, var2);

      try {
         int var10000 = x44.a<"i">(this, 8925580733479153066L, var2);
         if (var4 != null) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"u">(var5, 8960667605706523199L, var2);
      }

      return (boolean)0;
   }

   public boolean Z() {
      return this.a;
   }

   public vi(int var1, boolean var2, boolean var3, int var4) {
      this.o = var1;
      this.h = var4;
      this.u = var2;
      this.a = var3;
   }

   public vi(int var1, boolean var2, boolean var3) {
      this(var1, var2, var3, 0);
   }

   public int H() {
      return this.o;
   }

   public boolean F() {
      return this.u;
   }

   public vi(int var1, int var2) {
      this.o = var1;
      this.h = var2;
   }

   public boolean s(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/vi.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 8609999689504910009
      // 09: lload 1
      // 0a: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: aload 0
      // 11: getfield com/zelix/vi.o I
      // 14: aload 3
      // 15: ifnonnull 3a
      // 18: getstatic com/zelix/vi.c J
      // 1b: l2i
      // 1c: if_icmple 3d
      // 1f: goto 2c
      // 22: ldc2_w 8580128121288509815
      // 25: lload 1
      // 26: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 3a
      // 30: ldc2_w 8580128121288509815
      // 33: lload 1
      // 34: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public void L(Object[] var1) {
      this.a = false;
   }

   static {
      long var0 = b ^ 109152777105068L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -390270588186507382L;
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
      c = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
