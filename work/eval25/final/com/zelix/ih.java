package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ih extends ie implements yk {
   private _op J;
   private _ob t;
   private static final long b = ess.a(2579800863626008866L, -398840837742520240L, MethodHandles.lookup().lookupClass()).a(120054933824533L);
   private static final String c;

   protected void b(DataOutputStream param1, int param2, char param3, int param4, Map param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 4
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: lstore 6
      // 01a: lload 6
      // 01c: dup2
      // 01d: ldc2_w 140635337017104
      // 020: lxor
      // 021: lstore 8
      // 023: dup2
      // 024: ldc2_w 122389609845340
      // 027: lxor
      // 028: lstore 10
      // 02a: pop2
      // 02b: ldc2_w 267272957407016945
      // 02e: lload 6
      // 030: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: istore 12
      // 037: aload 0
      // 038: iload 12
      // 03a: ifne 0ba
      // 03d: getfield com/zelix/ih.P Z
      // 040: ifne 099
      // 043: goto 051
      // 046: ldc2_w 2242822667828281167
      // 049: lload 6
      // 04b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: lload 10
      // 053: bipush 0
      // 054: bipush 1
      // 055: anewarray 58
      // 058: dup
      // 059: bipush 0
      // 05a: new java/lang/StringBuilder
      // 05d: dup
      // 05e: invokespecial java/lang/StringBuilder.<init> ()V
      // 061: getstatic com/zelix/ih.c Ljava/lang/String;
      // 064: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 067: aload 0
      // 068: lload 8
      // 06a: bipush 1
      // 06b: anewarray 131
      // 06e: dup_x2
      // 06f: dup_x2
      // 070: pop
      // 071: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 074: bipush 0
      // 075: swap
      // 076: aastore
      // 077: ldc2_w 226709446317987203
      // 07a: lload 6
      // 07c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 087: aastore
      // 088: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 08b: goto 099
      // 08e: ldc2_w 2242822667828281167
      // 091: lload 6
      // 093: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: iload 4
      // 09b: ifle 0ab
      // 09e: aload 1
      // 09f: aload 0
      // 0a0: getfield com/zelix/ih.j I
      // 0a3: iload 12
      // 0a5: ifne 114
      // 0a8: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 0ab: aload 0
      // 0ac: goto 0ba
      // 0af: ldc2_w 2242822667828281167
      // 0b2: lload 6
      // 0b4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: ldc2_w 501597320802446778
      // 0bd: lload 6
      // 0bf: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: ifnull 0ec
      // 0c7: aload 1
      // 0c8: aload 0
      // 0c9: ldc2_w 501597320802446778
      // 0cc: lload 6
      // 0ce: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual com/zelix/_op.W ()I
      // 0d6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0d9: iload 12
      // 0db: ifeq 117
      // 0de: goto 0ec
      // 0e1: ldc2_w 2242822667828281167
      // 0e4: lload 6
      // 0e6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 1
      // 0ed: aload 0
      // 0ee: ldc2_w 2000874846821531385
      // 0f1: lload 6
      // 0f3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ob; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: bipush 0
      // 0f9: anewarray 131
      // 0fc: ldc2_w 1986964732262958033
      // 0ff: lload 6
      // 101: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: goto 114
      // 109: ldc2_w 2242822667828281167
      // 10c: lload 6
      // 10e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 117: return
   }

   public void e(Integer var1, long var2, _op var4) {
      x44.a<"w">(this, var4, -8198397891182058123L, var2);
   }

   ih(h8 var1, long var2, int var4, _ob var5) {
      var2 = b ^ var2;
      super(var1, var4);
      x44.a<"q">(this, var5, 6968655713072760200L, var2);
   }

   public void m(Object[] var1) {
      long var3 = (Long)var1[0];
      w var2 = (w)var1[1];
      long var5 = var3 ^ 11807521485311L;

      try {
         if (x44.a<"o">(this, 1118638904798782666L, var3) != null) {
            var2.u(var5, x44.a<"o">(this, 1118638904798782666L, var3), this);
         }
      } catch (gj var7) {
         throw x44.a<"s">(var7, 1607828387837523519L, var3);
      }
   }

   public boolean b(long var1, ie var3) {
      byte var4 = x44.a<"v">(-3411280863734668052L, var1);

      label51: {
         try {
            int var10001 = var4;
            if (var1 > 0L) {
               if (var4 != 0) {
                  return (boolean)this.j;
               }

               var10001 = var3.j;
            }

            if (this.j == var10001) {
               break label51;
            }
         } catch (gj var7) {
            throw x44.a<"v">(var7, -3729787381628736430L, var1);
         }

         return (boolean)0;
      }

      ih var5 = (ih)var3;

      try {
         if (x44.a<"j">(this, -3973951252355715612L, var1) == x44.a<"j">(var5, -3973951252355715612L, var1)) {
            return true;
         }
      } catch (gj var6) {
         throw x44.a<"v">(var6, -3729787381628736430L, var1);
      }

      return false;
   }

   public wd B(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      return x44.a<"l">(-7453813595339780162L, var4);
   }

   ih(h8 var1, int var2, long var3, _xx var5, _y4 var6, _y4 var7, PrintWriter var8) {
      var3 = b ^ var3;
      long var9 = var3 ^ 96174296935028L;
      long var11 = var3 ^ 68038157832508L;
      super(var1, var2);
      int var13 = var5.readUnsignedShort();
      var6.G(z.R(var13, var9), this, var11);
   }

   static {
      long var0 = b ^ 128417714048672L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0015Ý1Üq\u008aÛÒ¿\u007f)ëâ\u009c¾|g&ÎéF\fJ\u009eí^)|Ô5âÅ".getBytes("ISO-8859-1"));
      String var5 = c(var4).intern();
      byte var10001 = -1;
      c = var5;
   }

   private static gj b(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
