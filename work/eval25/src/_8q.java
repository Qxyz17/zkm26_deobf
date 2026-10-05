package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8q {
   protected File h;
   private static final long a = ess.a(2101871413823803475L, 6374904414581554115L, MethodHandles.lookup().lookupClass()).a(202566811963846L);
   private static final String b;

   protected void I(Object[] var1) {
      File var4 = (File)var1[0];
      List var5 = (List)var1[1];
      long var2 = (Long)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 60542656827020L;
      String var10000 = x44.a<"p">(-3165256919498450496L, var2);
      String[] var9 = x44.a<"h">(var4, new _fg(), -2924603855437393086L, var2);
      String var8 = var10000;

      label34: {
         label33: {
            label32: {
               try {
                  var10000 = var9;
                  if (var8 != null) {
                     break label33;
                  }

                  if (var9 == null) {
                     break label32;
                  }
               } catch (gj var13) {
                  throw x44.a<"p">(var13, -3155226340505814298L, var2);
               }

               var10000 = var9;
               break label33;
            }

            var16 = 0;
            break label34;
         }

         var16 = ((Object[])var10000).length;
      }

      int var10 = var16;
      int var11 = 0;

      while (var11 < var10) {
         File var12 = new File(var4, var9[var11]);
         var5.add(x44.a<"h">(var12, -3764666792836955198L, var2));
         x44.a<"h">(this, new Object[]{var12, var5, var6}, -3696893619348695085L, var2);
         var11++;
         if (var8 != null) {
            break;
         }
      }
   }

   public List a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 21543080357237L;
      ArrayList var6 = new ArrayList();
      x44.a<"i">(this, new Object[]{x44.a<"m">(this, -1255601791318943213L, var2), var6, var4}, -1204472859523861462L, var2);
      return var6;
   }

   public static void a(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 1
      // 12: pop
      // 13: getstatic com/zelix/_8q.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w -4054651334592787864
      // 1c: lload 1
      // 1d: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 3
      // 25: ifnull 9e
      // 28: new java/io/File
      // 2b: dup
      // 2c: aload 3
      // 2d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 30: astore 5
      // 32: aload 5
      // 34: ldc2_w -4539064949000071170
      // 37: lload 1
      // 38: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: lload 1
      // 3e: lconst_0
      // 3f: lcmp
      // 40: iflt 70
      // 43: aload 4
      // 45: ifnonnull 70
      // 48: ifne 9e
      // 4b: goto 58
      // 4e: ldc2_w -4062772629494568626
      // 51: lload 1
      // 52: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 5
      // 5a: ldc2_w -2697302739365808177
      // 5d: lload 1
      // 5e: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: goto 70
      // 66: ldc2_w -4062772629494568626
      // 69: lload 1
      // 6a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: ifne 9e
      // 73: new java/io/IOException
      // 76: dup
      // 77: new java/lang/StringBuilder
      // 7a: dup
      // 7b: invokespecial java/lang/StringBuilder.<init> ()V
      // 7e: getstatic com/zelix/_8q.b Ljava/lang/String;
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: aload 3
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88: ldc "'"
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 90: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 93: athrow
      // 94: ldc2_w -4062772629494568626
      // 97: lload 1
      // 98: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: return
   }

   public _8q(char var1, File var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      super();
      x44.a<"t">(this, var2, -7120949864965445203L, var5);
   }

   static {
      long var0 = a ^ 87699738130281L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("|3fÒÍ6\f+\u0002®'r\u008cAõ½Lß\u001d\u0003\u0017\u0093×û´\u0091%©Ît\u009dJ".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
