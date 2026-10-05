package com.zelix;

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

public class p1 extends pt {
   private static String S;
   private static final long b = ess.a(6723059928841476823L, 9214894267154403455L, MethodHandles.lookup().lookupClass()).a(30854685996609L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f = new HashMap(13);

   public String H(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"k">(1501363595386670722L, var2);
   }

   public boolean accept(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/p1.b J
      // 003: ldc2_w 3995289318217
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 25922251418561
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 4493526043139
      // 014: lxor
      // 015: lstore 6
      // 017: pop2
      // 018: ldc2_w -5656300529401523286
      // 01b: lload 2
      // 01c: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: aload 1
      // 022: ldc2_w -5314670420018242653
      // 025: lload 2
      // 026: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 02e: astore 9
      // 030: astore 8
      // 032: aload 1
      // 033: ldc2_w -5212529946257968056
      // 036: lload 2
      // 037: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 8
      // 03e: ifnull 086
      // 041: ifeq 05d
      // 044: goto 051
      // 047: ldc2_w -5555280153854630342
      // 04a: lload 2
      // 04b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: bipush 1
      // 052: ireturn
      // 053: ldc2_w -5555280153854630342
      // 056: lload 2
      // 057: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 1
      // 05e: ldc2_w -5314670420018242653
      // 061: lload 2
      // 062: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: lload 4
      // 069: dup2_x1
      // 06a: pop2
      // 06b: bipush 2
      // 06c: anewarray 99
      // 06f: dup_x1
      // 070: swap
      // 071: bipush 1
      // 072: swap
      // 073: aastore
      // 074: dup_x2
      // 075: dup_x2
      // 076: pop
      // 077: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: ldc2_w -6034450450507881002
      // 080: lload 2
      // 081: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: aload 8
      // 088: ifnull 0b9
      // 08b: ifeq 0a7
      // 08e: goto 09b
      // 091: ldc2_w -5555280153854630342
      // 094: lload 2
      // 095: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: bipush 1
      // 09c: ireturn
      // 09d: ldc2_w -5555280153854630342
      // 0a0: lload 2
      // 0a1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 9
      // 0a9: sipush 26200
      // 0ac: ldc2_w 4242205106901979242
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/p1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0b9: aload 8
      // 0bb: ifnull 0f9
      // 0be: ifeq 0da
      // 0c1: goto 0ce
      // 0c4: ldc2_w -5555280153854630342
      // 0c7: lload 2
      // 0c8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: bipush 1
      // 0cf: ireturn
      // 0d0: ldc2_w -5555280153854630342
      // 0d3: lload 2
      // 0d4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: lload 6
      // 0dc: aload 9
      // 0de: bipush 2
      // 0df: anewarray 99
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w -5270562153597605421
      // 0f3: lload 2
      // 0f4: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: aload 8
      // 0fb: ifnull 11b
      // 0fe: ifeq 11a
      // 101: goto 10e
      // 104: ldc2_w -5555280153854630342
      // 107: lload 2
      // 108: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: bipush 1
      // 10f: ireturn
      // 110: ldc2_w -5555280153854630342
      // 113: lload 2
      // 114: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: bipush 0
      // 11b: ireturn
   }

   static {
      long var9 = b ^ 10612572661795L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "x\u0094Ö\u001cXo3\u0001*#¾ªb×É+\u0018Kª\u0081CS9þØö\"_ò ¯ýgT\u009fÿÇ0â1\u0098?Q\r`XõI\u0080¨eüß\u0000\u009dlÖ>ã\"°Y¤i\u0010¤85´\u001dv¤]Þ6Wìï\u001cÞ\u0089";
      int var6 = "x\u0094Ö\u001cXo3\u0001*#¾ªb×É+\u0018Kª\u0081CS9þØö\"_ò ¯ýgT\u009fÿÇ0â1\u0098?Q\r`XõI\u0080¨eüß\u0000\u009dlÖ>ã\"°Y¤i\u0010¤85´\u001dv¤]Þ6Wìï\u001cÞ\u0089"
         .length();
      char var3 = '@';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[2];
            x44.a<"q">(a<"r">(835, 9191276386467655194L ^ var9), -628285313809765104L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21538;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/p1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/p1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
