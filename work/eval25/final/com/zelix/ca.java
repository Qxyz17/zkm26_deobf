package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ca extends jf implements _ng {
   private String h;
   private String l;
   private static final long a = ess.a(4544992871158145200L, -661956236077654823L, MethodHandles.lookup().lookupClass()).a(94625190505980L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public String o(Object[] var1) {
      long var2 = (Long)var1[0];
      return "@" + x44.a<"k">(this, 8086656254047024599L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var3 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var4 ^ 1528888560062L;
      long var8 = var4 ^ 0L;
      long var10 = var4 ^ 134528422017690L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var4);
      StringBuilder var13 = new StringBuilder();
      int[] var12 = var10000;
      int var14 = x44.a<"i">(this, new Object[]{var10}, 7145691849331111744L, var4);
      int var15 = 0;

      label43:
      while (var15 < var14) {
         _za var16 = this.e(var15);
         x44.a<"i">(var16, new Object[]{var8, this, var2}, 8818198965911889370L, var4);
         _f6 var17 = (_f6)var16;

         try {
            var13.append(x44.a<"i">(var17, new Object[]{var6}, 8816223563478557836L, var4));
            var15++;
         } catch (gj var19) {
            boolean var10001 = false;
            throw x44.a<"q">(var19, 7275834150715489425L, var4);
         }

         while (true) {
            try {
               var10000 = var12;
               if (var4 > 0L) {
                  if (var12 != null) {
                     return;
                  }

                  var10000 = var12;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var18) {
               boolean var22 = false;
               throw x44.a<"q">(var18, 7275834150715489425L, var4);
            }

            if (var4 > 0L) {
               break label43;
            }
         }
      }

      x44.a<"r">(this, var13.toString(), 8757128973067353193L, var4);
      x44.a<"r">(
         this,
         x44.a<"m">(this, 8757128973067353193L, var4)
            .replace((char)a<"y">(11318, 5636096227844292832L ^ var4), (char)a<"y">(19789, 2411211967451881882L ^ var4)),
         7332193822159042590L,
         var4
      );
   }

   public ca(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 18927431265196L;
      super(var4, var3);
   }

   boolean A(Object[] param1) {
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
      // 0c: getstatic com/zelix/ca.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 7274165881389663565
      // 15: lload 2
      // 16: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 9207360749961962008
      // 21: lload 2
      // 22: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: ldc "*"
      // 29: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2c: aload 4
      // 2e: ifnonnull 50
      // 31: bipush -1
      // 32: if_icmpne 53
      // 35: goto 42
      // 38: ldc2_w 9150969345018193559
      // 3b: lload 2
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 1
      // 43: goto 50
      // 46: ldc2_w 9150969345018193559
      // 49: lload 2
      // 4a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   public boolean B(int var1, int var2, int var3, Set var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var7 = var5 ^ 81252256890928L;
      int[] var10000 = x44.a<"r">(-6605049255937145368L, var5);
      Iterator var10 = var4.iterator();
      int[] var9 = var10000;

      while (var10.hasNext()) {
         boolean var11 = l_.y(var7, (String)var10.next(), x44.a<"n">(this, -4656092854894157123L, var5));

         while (var11) {
            var11 = true;
            if (var1 >= 0 && var9 == null) {
               return true;
            }
         }
      }

      return false;
   }

   static {
      long var0 = a ^ 127502824851461L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "')üVá|ÓøÅÐ¤ù¢Ã¨õ";
      int var7 = "')üVá|ÓøÅÐ¤ù¢Ã¨õ".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23549;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = b[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ca", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/ca" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
