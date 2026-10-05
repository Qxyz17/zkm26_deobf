package com.zelix;

import com.sun.kvem.environment.Obfuscator;
import java.io.File;
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

public class ZKMWtkPlugin extends _p implements Obfuscator {
   private File u;
   private static final long a = ess.a(-7598343079821148649L, -3365655333302364470L, MethodHandles.lookup().lookupClass()).a(223095063588457L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void run(File var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      long var8 = a ^ 55906571748144L;
      x44.a<"s">(x44.a<"o">(this, 8906500567188326396L, var8), var4, var1, var6, var5, 9204958598120884279L, var8);
   }

   public void createScriptFile(File param1, File param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMWtkPlugin.a J
      // 03: ldc2_w 22435829147409
      // 06: lxor
      // 07: lstore 3
      // 08: ldc2_w -7375466669952703703
      // 0b: lload 3
      // 0c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: aload 1
      // 13: ldc2_w -6936922571289222179
      // 16: lload 3
      // 17: invokedynamic q (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: astore 5
      // 1e: aload 0
      // 1f: ldc2_w -6936922571289222179
      // 22: lload 3
      // 23: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aload 5
      // 2a: ifnonnull 66
      // 2d: ifnonnull 5c
      // 30: goto 3d
      // 33: ldc2_w -7139614639411650490
      // 36: lload 3
      // 37: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: new java/lang/IllegalArgumentException
      // 40: dup
      // 41: sipush 30227
      // 44: ldc2_w 1533210246983817315
      // 47: lload 3
      // 48: lxor
      // 49: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ZKMWtkPlugin.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 51: athrow
      // 52: ldc2_w -7139614639411650490
      // 55: lload 3
      // 56: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 0
      // 5d: ldc2_w -6936922571289222179
      // 60: lload 3
      // 61: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: ldc2_w -7367871593158357188
      // 69: lload 3
      // 6a: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: ifne c4
      // 72: new java/lang/IllegalArgumentException
      // 75: dup
      // 76: new java/lang/StringBuilder
      // 79: dup
      // 7a: invokespecial java/lang/StringBuilder.<init> ()V
      // 7d: sipush 25646
      // 80: ldc2_w 3508182152688142940
      // 83: lload 3
      // 84: lxor
      // 85: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ZKMWtkPlugin.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: aload 0
      // 8e: ldc2_w -6936922571289222179
      // 91: lload 3
      // 92: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: ldc2_w -9175104187922200408
      // 9a: lload 3
      // 9b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: sipush 24668
      // a6: ldc2_w 2730406787281260077
      // a9: lload 3
      // aa: lxor
      // ab: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ZKMWtkPlugin.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b6: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // b9: athrow
      // ba: ldc2_w -7139614639411650490
      // bd: lload 3
      // be: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: return
   }

   static {
      long var0 = a ^ 56685879386516L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "'§\u008e\u0081ºß¹è7K\u0099Ó\u0000ð¯µm¢\u0085Ã¿Cp8À5Ù\u001fÄ\u008a\u0094\u009b¾±(\u001b4{ª\u000f0°j\u009f\u0093º\tðôâÈêgÀ\u008d\u0096Ê\u0089ó\u0017\t1\u009bïsëÕã\u0016ì\u0000¸ú-Ón$¾W\u00ad3ýî\u0010\u008b5\u0017\u0082Û ©(û¸ð\u0019\u0013:V±\u008d\u0099¤\u001aS\u001d;_\u009c§\b\u0092òªüw\u001bón5\fp";
      int var8 = "'§\u008e\u0081ºß¹è7K\u0099Ó\u0000ð¯µm¢\u0085Ã¿Cp8À5Ù\u001fÄ\u008a\u0094\u009b¾±(\u001b4{ª\u000f0°j\u009f\u0093º\tðôâÈêgÀ\u008d\u0096Ê\u0089ó\u0017\t1\u009bïsëÕã\u0016ì\u0000¸ú-Ón$¾W\u00ad3ýî\u0010\u008b5\u0017\u0082Û ©(û¸ð\u0019\u0013:V±\u008d\u0099¤\u001aS\u001d;_\u009c§\b\u0092òªüw\u001bón5\fp"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25529;
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
            throw new RuntimeException("com/zelix/ZKMWtkPlugin", var10);
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

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ZKMWtkPlugin" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
