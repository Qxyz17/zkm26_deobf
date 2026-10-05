package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s3 {
   private final String N;
   private final int E;
   public static s3 c;
   private final String I;
   private static final long a = ess.a(-199443445775617956L, -3220335265027384915L, MethodHandles.lookup().lookupClass()).a(194692707751482L);

   static {
      long var4 = a ^ 25669081505602L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("+\"aÔ5N{\u001b9\u0093\u0006oåSD50\u0017>\u0004~|¤=".getBytes("ISO-8859-1"));
      String var6 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var6;
      x44.a<"w">(new s3(var0, "J"), 2159150914283855219L, var4);
   }

   public String I(Object[] var1) {
      return this.N;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/s3.a J
      // 03: ldc2_w 122126248311793
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -2147929304075436503
      // 0b: lload 2
      // 0c: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 1
      // 14: instanceof com/zelix/s3
      // 17: aload 4
      // 19: ifnonnull b3
      // 1c: ifeq b2
      // 1f: goto 2c
      // 22: ldc2_w -6555735452117328
      // 25: lload 2
      // 26: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/s3
      // 30: astore 5
      // 32: aload 0
      // 33: getfield com/zelix/s3.E I
      // 36: aload 4
      // 38: ifnonnull 69
      // 3b: aload 5
      // 3d: getfield com/zelix/s3.E I
      // 40: if_icmpne b0
      // 43: goto 50
      // 46: ldc2_w -6555735452117328
      // 49: lload 2
      // 4a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 0
      // 51: getfield com/zelix/s3.I Ljava/lang/String;
      // 54: aload 5
      // 56: getfield com/zelix/s3.I Ljava/lang/String;
      // 59: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5c: goto 69
      // 5f: ldc2_w -6555735452117328
      // 62: lload 2
      // 63: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: aload 4
      // 6b: ifnonnull 97
      // 6e: ifeq b0
      // 71: goto 7e
      // 74: ldc2_w -6555735452117328
      // 77: lload 2
      // 78: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield com/zelix/s3.N Ljava/lang/String;
      // 82: aload 5
      // 84: getfield com/zelix/s3.N Ljava/lang/String;
      // 87: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8a: goto 97
      // 8d: ldc2_w -6555735452117328
      // 90: lload 2
      // 91: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: aload 4
      // 99: ifnonnull ad
      // 9c: ifeq b0
      // 9f: goto ac
      // a2: ldc2_w -6555735452117328
      // a5: lload 2
      // a6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: bipush 1
      // ad: goto b1
      // b0: bipush 0
      // b1: ireturn
      // b2: bipush 0
      // b3: ireturn
   }

   public s3(String var1, String var2) {
      this.I = var1;
      this.N = var2;
      this.E = var1.hashCode() ^ var2.hashCode();
   }

   @Override
   public Object clone() {
      return new s3(this.I, this.N, this.E);
   }

   public String x(Object[] var1) {
      Map var4 = (Map)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 135931952379399L;
      return _fz.g(this.N, var4, var5) + " " + this.I;
   }

   public String a(Object[] var1) {
      return this.I;
   }

   @Override
   public int hashCode() {
      return this.E;
   }

   private s3(String var1, String var2, int var3) {
      this.I = var1;
      this.N = var2;
      this.E = var3;
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
}
