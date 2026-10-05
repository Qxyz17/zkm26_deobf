package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ho extends hk {
   public static final String q;
   private static String K;

   public static void b(String var0) {
      K = var0;
   }

   public static String B() {
      return K;
   }

   public void y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 70497549808725L;
      x44.a<"k">(this, var4, null, null, null, -4094550302260103560L, var2);
   }

   public synchronized void F(Object[] var1) {
      w2 var4 = (w2)var1[0];
      long var2 = (Long)var1[1];
      String var5 = x44.a<"s">(-2845499658620518010L, var2);

      ho var9;
      label43: {
         label42: {
            try {
               var10000 = this.A;
               if (var2 < 0L || var5 != null) {
                  break label42;
               }

               if (this.A == null) {
                  return;
               }
            } catch (gj var8) {
               throw x44.a<"s">(var8, -2706856673185805704L, var2);
            }

            try {
               var10000 = this.A;
               if (var2 > 0L) {
                  x44.a<"k">(this.A, var4, -2760472726926461086L, var2);
                  var9 = this;
                  if (var5 != null) {
                     break label43;
                  }

                  var10000 = this.A;
               }
            } catch (gj var7) {
               throw x44.a<"s">(var7, -2706856673185805704L, var2);
            }
         }

         try {
            if (!var10000.isEmpty()) {
               return;
            }

            var9 = this;
         } catch (gj var6) {
            throw x44.a<"s">(var6, -2706856673185805704L, var2);
         }
      }

      var9.A = null;
   }

   public void e(long param1, Object param3, Object param4, Object param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 129910742289337
      // 05: lxor
      // 06: lstore 6
      // 08: pop2
      // 09: ldc2_w 3692818142906559035
      // 0c: lload 1
      // 0d: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: bipush 0
      // 13: istore 9
      // 15: aload 0
      // 16: dup
      // 17: astore 11
      // 19: monitorenter
      // 1a: astore 8
      // 1c: aload 0
      // 1d: getfield com/zelix/ho.A Ljava/util/List;
      // 20: aload 8
      // 22: ifnonnull 3d
      // 25: ifnonnull 39
      // 28: goto 35
      // 2b: ldc2_w 3589957800670831045
      // 2e: lload 1
      // 2f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 11
      // 37: monitorexit
      // 38: return
      // 39: aload 0
      // 3a: getfield com/zelix/ho.A Ljava/util/List;
      // 3d: invokeinterface java/util/List.size ()I 1
      // 42: istore 9
      // 44: iload 9
      // 46: anewarray 72
      // 49: astore 10
      // 4b: aload 0
      // 4c: getfield com/zelix/ho.A Ljava/util/List;
      // 4f: aload 10
      // 51: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 56: checkcast [Lcom/zelix/w2;
      // 59: astore 10
      // 5b: aload 11
      // 5d: monitorexit
      // 5e: goto 69
      // 61: astore 12
      // 63: aload 11
      // 65: monitorexit
      // 66: aload 12
      // 68: athrow
      // 69: iload 9
      // 6b: bipush 1
      // 6c: isub
      // 6d: istore 11
      // 6f: iload 11
      // 71: iflt b5
      // 74: aload 10
      // 76: iload 11
      // 78: aaload
      // 79: aload 8
      // 7b: ifnonnull a0
      // 7e: ifnull ad
      // 81: goto 8e
      // 84: ldc2_w 3589957800670831045
      // 87: lload 1
      // 88: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 10
      // 90: iload 11
      // 92: aaload
      // 93: goto a0
      // 96: ldc2_w 3589957800670831045
      // 99: lload 1
      // 9a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: lload 6
      // a2: aload 0
      // a3: aload 3
      // a4: aload 4
      // a6: aload 5
      // a8: invokeinterface com/zelix/w2.G (JLcom/zelix/v_;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V 7
      // ad: iinc 11 -1
      // b0: aload 8
      // b2: ifnull 6f
      // b5: lload 1
      // b6: lconst_0
      // b7: lcmp
      // b8: ifle 74
      // bb: return
   }

   public final synchronized void V(Object[] param1) {
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
      // 04: checkcast com/zelix/w2
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: ldc2_w -6516805525595177845
      // 16: lload 3
      // 17: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: astore 5
      // 1e: aload 0
      // 1f: getfield com/zelix/ho.A Ljava/util/List;
      // 22: lload 3
      // 23: lconst_0
      // 24: lcmp
      // 25: iflt 5a
      // 28: aload 5
      // 2a: ifnonnull 5a
      // 2d: ifnonnull 56
      // 30: goto 3d
      // 33: ldc2_w -6385480888797874315
      // 36: lload 3
      // 37: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: new java/util/ArrayList
      // 41: dup
      // 42: bipush 2
      // 43: invokespecial java/util/ArrayList.<init> (I)V
      // 46: putfield com/zelix/ho.A Ljava/util/List;
      // 49: goto 56
      // 4c: ldc2_w -6385480888797874315
      // 4f: lload 3
      // 50: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/zelix/ho.A Ljava/util/List;
      // 5a: aload 2
      // 5b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 60: aload 5
      // 62: ifnonnull 8c
      // 65: ifne 8d
      // 68: goto 75
      // 6b: ldc2_w -6385480888797874315
      // 6e: lload 3
      // 6f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 0
      // 76: getfield com/zelix/ho.A Ljava/util/List;
      // 79: aload 2
      // 7a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7f: goto 8c
      // 82: ldc2_w -6385480888797874315
      // 85: lload 3
      // 86: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: pop
      // 8d: return
   }

   static {
      long var4 = ess.a(-8209072722941065589L, 7135319879722857553L, MethodHandles.lookup().lookupClass()).a(242596812711495L) ^ 63413871221459L;
      if (x44.a<"p">(2603512834080783653L, var4) != null) {
         x44.a<"p">("oMuAXb", 4550624567438852589L, var4);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("ý.OÖº¿àqÚ\u008a\u001a¸&_\u0015\u0018".getBytes("ISO-8859-1"));
      String var6 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var6;
      q = x44.a<"p">(var0, 4362215799525487513L, var4);
   }

   private static gj e(gj var0) {
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
}
