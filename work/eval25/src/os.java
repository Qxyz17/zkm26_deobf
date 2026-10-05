package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class os extends y1 implements ve {
   List n = new ArrayList();
   private static final long a = ess.a(-5007523433945794807L, -3831474103117962355L, MethodHandles.lookup().lookupClass()).a(203112160546960L);
   private static final String b;

   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 139470081862105L;
      long var9 = var3 ^ 30801124401018L;
      long var11 = var3 ^ 1133881831266L;
      int var10000 = x44.a<"u">(8293401855148283125L, var3);
      int var14 = this.u(var11);
      int var15 = 0;
      int var13 = var10000;

      label34: {
         while (var15 < var14) {
            try {
               if (var3 > 0L) {
                  var18 = this.a(var15);
                  if (var13 != 0) {
                     break label34;
                  }

                  var18.h(this, var2, var5);
                  var15++;
               }

               if (var13 == 0) {
                  continue;
               }
            } catch (gj var16) {
               throw x44.a<"u">(var16, 8623113849600896630L, var3);
            }

            if (var3 >= 0L) {
               break;
            }
         }

         var18 = var1;
      }

      yp var17 = (yp)var18;
      x44.a<"m">(var17, new Object[]{x44.a<"m">(this, new Object[]{var9}, 7529833552096535138L, var3), var7}, 8582700333955172653L, var3);
   }

   public String g(Object[] param1) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/os.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 3640382903981806952
      // 15: lload 2
      // 16: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: new java/lang/StringBuilder
      // 1e: dup
      // 1f: invokespecial java/lang/StringBuilder.<init> ()V
      // 22: astore 5
      // 24: istore 4
      // 26: aload 0
      // 27: getfield com/zelix/os.n Ljava/util/List;
      // 2a: iload 4
      // 2c: ifne 50
      // 2f: ifnull d7
      // 32: goto 3f
      // 35: ldc2_w 3906412674114007019
      // 38: lload 2
      // 39: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/os.n Ljava/util/List;
      // 43: goto 50
      // 46: ldc2_w 3906412674114007019
      // 49: lload 2
      // 4a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: invokeinterface java/util/List.size ()I 1
      // 55: istore 6
      // 57: bipush 0
      // 58: istore 7
      // 5a: iload 7
      // 5c: iload 6
      // 5e: if_icmpge d7
      // 61: aload 0
      // 62: getfield com/zelix/os.n Ljava/util/List;
      // 65: iload 7
      // 67: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6c: checkcast java/lang/String
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: iflt dc
      // 75: astore 8
      // 77: aload 5
      // 79: aload 8
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: iload 4
      // 80: ifne d9
      // 83: pop
      // 84: iload 4
      // 86: lload 2
      // 87: lconst_0
      // 88: lcmp
      // 89: ifle d4
      // 8c: ifne d2
      // 8f: goto 9c
      // 92: ldc2_w 3906412674114007019
      // 95: lload 2
      // 96: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: iload 7
      // 9e: aload 0
      // 9f: getfield com/zelix/os.n Ljava/util/List;
      // a2: invokeinterface java/util/List.size ()I 1
      // a7: bipush 1
      // a8: isub
      // a9: if_icmpge cf
      // ac: goto b9
      // af: ldc2_w 3906412674114007019
      // b2: lload 2
      // b3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: athrow
      // b9: aload 5
      // bb: getstatic com/zelix/os.b Ljava/lang/String;
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: pop
      // c2: goto cf
      // c5: ldc2_w 3906412674114007019
      // c8: lload 2
      // c9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: athrow
      // cf: iinc 7 1
      // d2: iload 4
      // d4: ifeq 5a
      // d7: aload 5
      // d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // dc: areturn
   }

   public os(int var1) {
      super(var1);
   }

   public void f(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      this.n.add(var4);
   }

   static {
      long var0 = a ^ 66019742278286L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Z\u008dÜd»µð\u0000".getBytes("ISO-8859-1"));
      String var5 = b(var4).intern();
      byte var10001 = -1;
      b = var5;
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
}
