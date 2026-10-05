package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class y1 implements rp {
   private static int Q;
   protected int H;
   protected rp F;
   protected rp[] S;
   private static final long o = ess.a(2080122068793620245L, -1591511662827877388L, MethodHandles.lookup().lookupClass()).a(127723502393436L);
   private static final String r;

   public static int S() {
      int var0 = B();
      return var0 == 0 ? 83 : 0;
   }

   public rp a(int var1) {
      return this.S[var1];
   }

   public String H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = o ^ var2;
      return x44.a<"k">(4641625838727900627L, var2)[this.H];
   }

   public static void n(int var0) {
      Q = var0;
   }

   public void O(rp var1) {
      this.F = var1;
   }

   public void y() {
   }

   public void x() {
   }

   public y1(int var1) {
      this.H = var1;
   }

   public void x(long param1, rp param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 4758461244077378166
      // 03: lload 1
      // 04: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 5
      // 0b: aload 0
      // 0c: iload 5
      // 0e: lload 1
      // 0f: lconst_0
      // 10: lcmp
      // 11: ifle 3c
      // 14: ifeq 38
      // 17: getfield com/zelix/y1.S [Lcom/zelix/rp;
      // 1a: ifnonnull 4d
      // 1d: goto 2a
      // 20: ldc2_w 4860443565364345195
      // 23: lload 1
      // 24: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 38
      // 2e: ldc2_w 4860443565364345195
      // 31: lload 1
      // 32: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: iload 4
      // 3a: bipush 1
      // 3b: iadd
      // 3c: anewarray 63
      // 3f: putfield com/zelix/y1.S [Lcom/zelix/rp;
      // 42: lload 1
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt b0
      // 48: iload 5
      // 4a: ifne a8
      // 4d: iload 4
      // 4f: lload 1
      // 50: lconst_0
      // 51: lcmp
      // 52: iflt 8d
      // 55: aload 0
      // 56: getfield com/zelix/y1.S [Lcom/zelix/rp;
      // 59: arraylength
      // 5a: iload 5
      // 5c: ifeq 8c
      // 5f: goto 6c
      // 62: ldc2_w 4860443565364345195
      // 65: lload 1
      // 66: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: if_icmplt a8
      // 6f: goto 7c
      // 72: ldc2_w 4860443565364345195
      // 75: lload 1
      // 76: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: iload 4
      // 7e: bipush 1
      // 7f: goto 8c
      // 82: ldc2_w 4860443565364345195
      // 85: lload 1
      // 86: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: iadd
      // 8d: anewarray 63
      // 90: astore 6
      // 92: aload 0
      // 93: getfield com/zelix/y1.S [Lcom/zelix/rp;
      // 96: bipush 0
      // 97: aload 6
      // 99: bipush 0
      // 9a: aload 0
      // 9b: getfield com/zelix/y1.S [Lcom/zelix/rp;
      // 9e: arraylength
      // 9f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // a2: aload 0
      // a3: aload 6
      // a5: putfield com/zelix/y1.S [Lcom/zelix/rp;
      // a8: aload 0
      // a9: getfield com/zelix/y1.S [Lcom/zelix/rp;
      // ac: iload 4
      // ae: aload 3
      // af: aastore
      // b0: return
   }

   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 7253515289753L;
      throw new Error(r + x44.a<"m">(this, new Object[]{var5}, 8227116060801393456L, var3));
   }

   public int u(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -2559711430740640873
      // 03: lload 1
      // 04: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield com/zelix/y1.S [Lcom/zelix/rp;
      // 0e: iload 3
      // 0f: ifne 34
      // 12: ifnonnull 30
      // 15: goto 22
      // 18: ldc2_w -2546298282694908239
      // 1b: lload 1
      // 1c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: athrow
      // 22: bipush 0
      // 23: goto 35
      // 26: ldc2_w -2546298282694908239
      // 29: lload 1
      // 2a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: aload 0
      // 31: getfield com/zelix/y1.S [Lcom/zelix/rp;
      // 34: arraylength
      // 35: ireturn
   }

   public static int B() {
      return Q;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void F(long var1) {
      long var3 = var1 ^ 0L;
      int var5 = x44.a<"r">(2015082191537749018L, var1);
      if (this.S != null) {
         int var6 = 0;

         label43:
         while (var6 < this.S.length) {
            try {
               this.S[var6].F(var3);
               this.S[var6] = null;
               var6++;
            } catch (gj var8) {
               boolean var10001 = false;
               throw x44.a<"r">(var8, 1955879059399942460L, var1);
            }

            while (true) {
               try {
                  int var9 = var5;
                  if (var1 >= 0L) {
                     if (var5 != 0) {
                        return;
                     }

                     var9 = var5;
                  }

                  if (var9 == 0) {
                     break;
                  }
               } catch (gj var7) {
                  boolean var10 = false;
                  throw x44.a<"r">(var7, 1955879059399942460L, var1);
               }

               if (var1 >= 0L) {
                  break label43;
               }
            }
         }

         this.S = null;
      }
   }

   static {
      long var3 = o ^ 69669668410243L;
      if (x44.a<"v">(-5478025504133678203L, var3) == 0) {
         x44.a<"v">(1, -6224834283478864672L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal(
         "ò<\u000b#\u0005^=¥5¼[ø\u0000ÿ¢\u0010t&Ït\u001f\u008e\u0096Ò35Ì \u001e\u000e÷\u001a´\u0006\"gÓdQ\u008a©û§ÏV\u009bnçbk\u001a ?\u008fNÔ"
            .getBytes("ISO-8859-1")
      );
      String var5 = a(var2).intern();
      byte var10001 = -1;
      r = var5;
   }

   private static gj c(gj var0) {
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
