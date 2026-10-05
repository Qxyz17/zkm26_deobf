package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _u1 extends _u4 {
   private final Set v;
   private static final long c = ess.a(-5648600034301346729L, -2171409826533912717L, MethodHandles.lookup().lookupClass()).a(140292623913394L);
   private static final String[] f;
   private static final String[] g;
   private static final Map i = new HashMap(13);

   public Enumeration F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      return Collections.enumeration(x44.a<"j">(this, -5333872751817544589L, var2));
   }

   public boolean n(Object[] var1) {
      hy var4 = (hy)var1[0];
      hy var5 = (hy)var1[1];
      long var2 = (Long)var1[2];
      var2 = c ^ var2;
      hk[] var10000 = x44.a<"u">(-6412770262037480679L, var2);
      Object var7 = x44.a<"i">(this, -6500073896064668650L, var2).remove(var4);
      hk[] var6 = var10000;

      label33: {
         label32: {
            try {
               var10000 = (hk[])var7;
               if (var6 != null) {
                  break label33;
               }

               if (var7 == null) {
                  break label32;
               }
            } catch (gj var10) {
               throw x44.a<"u">(var10, -4923503885899472406L, var2);
            }

            Object var8 = x44.a<"i">(this, -4903561297581340154L, var2).put(var4, var5);
         }

         var10000 = (hk[])var7;
      }

      try {
         if (var10000 != null) {
            return true;
         }
      } catch (gj var9) {
         throw x44.a<"u">(var9, -4923503885899472406L, var2);
      }

      return false;
   }

   public _u1(int var1, byte var2, pk var3, int var4, List var5, _ur var6) {
      long var7 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ c;
      long var9 = (var7 ^ 111689012425663L) >>> 8;
      int var11 = (int)((var7 ^ 111689012425663L) << 56 >>> 56);
      long var12 = var7 ^ 40234872419198L;
      super(var3, var9, var5, (byte)var11, var6);
      this.v = x44.a<"w">(new Object[]{var12}, -5513820644736550218L, var7);
   }

   public final boolean u(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast com/zelix/hy
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 4
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 129949410477558
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 48786710613852
      // 028: lxor
      // 029: lstore 8
      // 02b: pop2
      // 02c: ldc2_w -4441554230782042556
      // 02f: lload 2
      // 030: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 0
      // 036: ldc2_w -2385682287021209747
      // 039: lload 2
      // 03a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: aload 5
      // 041: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 046: pop
      // 047: astore 10
      // 049: aload 0
      // 04a: aload 5
      // 04c: aload 5
      // 04e: lload 6
      // 050: bipush 3
      // 051: anewarray 42
      // 054: dup_x2
      // 055: dup_x2
      // 056: pop
      // 057: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05a: bipush 2
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 1
      // 060: swap
      // 061: aastore
      // 062: dup_x1
      // 063: swap
      // 064: bipush 0
      // 065: swap
      // 066: aastore
      // 067: ldc2_w -2348061042709686898
      // 06a: lload 2
      // 06b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: istore 11
      // 072: aload 0
      // 073: ldc2_w -2330713563772832058
      // 076: lload 2
      // 077: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: ldc2_w -2793615448202418008
      // 07f: lload 2
      // 080: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 10
      // 087: ifnonnull 10d
      // 08a: ifeq 10b
      // 08d: goto 09a
      // 090: ldc2_w -2382089927769750345
      // 093: lload 2
      // 094: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 0
      // 09b: ldc2_w -4495294116420641865
      // 09e: lload 2
      // 09f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: new java/lang/StringBuilder
      // 0a7: dup
      // 0a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ab: sipush 15195
      // 0ae: ldc2_w 5500757328244992925
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_u1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: aload 0
      // 0bc: lload 8
      // 0be: aload 5
      // 0c0: bipush 2
      // 0c1: anewarray 42
      // 0c4: dup_x1
      // 0c5: swap
      // 0c6: bipush 1
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 0
      // 0d0: swap
      // 0d1: aastore
      // 0d2: ldc2_w -4538632822828950258
      // 0d5: lload 2
      // 0d6: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: sipush 11578
      // 0e1: ldc2_w 1773615944513289725
      // 0e4: lload 2
      // 0e5: lxor
      // 0e6: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_u1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ee: aload 4
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: ldc "\""
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fb: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 0fe: goto 10b
      // 101: ldc2_w -2382089927769750345
      // 104: lload 2
      // 105: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: iload 11
      // 10d: ireturn
   }

   public boolean V(Object[] var1) {
      hy var2 = (hy)var1[0];
      long var3 = (Long)var1[1];
      var3 = c ^ var3;
      return x44.a<"h">(this, -380466238821506255L, var3).contains(var2);
   }

   static {
      long var0 = c ^ 100320586097527L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "zJ[9-,\u0099\u0004,%Ád¦Ã×#\u009bGsë¾\u00822|\u0001ÓÈÿpâ$ø²\bÖ\u0019\b;X\f0ÖµbÝ»îUý>ñ\u009e×ø£¿'ñ<ôãµ¹i\u0093ß®§\u0016<\u0090«\b4\u0003M%áÅ\u0012ø[Y«_O\u0087\u009f\u0086";
      int var8 = "zJ[9-,\u0099\u0004,%Ád¦Ã×#\u009bGsë¾\u00822|\u0001ÓÈÿpâ$ø²\bÖ\u0019\b;X\f0ÖµbÝ»îUý>ñ\u009e×ø£¿'ñ<ôãµ¹i\u0093ß®§\u0016<\u0090«\b4\u0003M%áÅ\u0012ø[Y«_O\u0087\u009f\u0086"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7149;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_u1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_u1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
