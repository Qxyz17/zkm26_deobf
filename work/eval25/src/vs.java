package com.zelix;

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

public class vs extends oe {
   private static final String[] a;
   private static final String[] b;
   private static final Map c = new HashMap(13);

   public void h(rp param1, aa param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 3
      // 001: dup2
      // 002: ldc2_w 95366066230805
      // 005: lxor
      // 006: lstore 5
      // 008: dup2
      // 009: ldc2_w 83178430546430
      // 00c: lxor
      // 00d: lstore 7
      // 00f: dup2
      // 010: ldc2_w 135549664002114
      // 013: lxor
      // 014: lstore 9
      // 016: dup2
      // 017: ldc2_w 128107402539816
      // 01a: lxor
      // 01b: lstore 11
      // 01d: pop2
      // 01e: ldc2_w 8264398724260313806
      // 021: lload 3
      // 022: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 0
      // 028: getfield com/zelix/vs.F Lcom/zelix/rp;
      // 02b: checkcast com/zelix/yh
      // 02e: astore 14
      // 030: istore 13
      // 032: aload 0
      // 033: getfield com/zelix/vs.j Ljava/lang/String;
      // 036: sipush 23101
      // 039: ldc2_w 1262424808846667247
      // 03c: lload 3
      // 03d: lxor
      // 03e: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/vs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 046: iload 13
      // 048: ifeq 0a8
      // 04b: ifeq 087
      // 04e: goto 05b
      // 051: ldc2_w 7804525451498931982
      // 054: lload 3
      // 055: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: aload 14
      // 05d: lload 11
      // 05f: bipush 1
      // 060: anewarray 13
      // 063: dup_x2
      // 064: dup_x2
      // 065: pop
      // 066: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 069: bipush 0
      // 06a: swap
      // 06b: aastore
      // 06c: ldc2_w 7840828528077821629
      // 06f: lload 3
      // 070: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: iload 13
      // 077: ifne 1a2
      // 07a: goto 087
      // 07d: ldc2_w 7804525451498931982
      // 080: lload 3
      // 081: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: aload 0
      // 088: getfield com/zelix/vs.j Ljava/lang/String;
      // 08b: sipush 11870
      // 08e: ldc2_w 7464299848623806863
      // 091: lload 3
      // 092: lxor
      // 093: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/vs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09b: goto 0a8
      // 09e: ldc2_w 7804525451498931982
      // 0a1: lload 3
      // 0a2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: iload 13
      // 0aa: lload 3
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 118
      // 0b0: ifeq 110
      // 0b3: ifeq 0ef
      // 0b6: goto 0c3
      // 0b9: ldc2_w 7804525451498931982
      // 0bc: lload 3
      // 0bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: aload 14
      // 0c5: lload 9
      // 0c7: bipush 1
      // 0c8: anewarray 13
      // 0cb: dup_x2
      // 0cc: dup_x2
      // 0cd: pop
      // 0ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d1: bipush 0
      // 0d2: swap
      // 0d3: aastore
      // 0d4: ldc2_w 7669687624461557038
      // 0d7: lload 3
      // 0d8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: iload 13
      // 0df: ifne 1a2
      // 0e2: goto 0ef
      // 0e5: ldc2_w 7804525451498931982
      // 0e8: lload 3
      // 0e9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield com/zelix/vs.j Ljava/lang/String;
      // 0f3: sipush 23282
      // 0f6: ldc2_w 2117799844143148322
      // 0f9: lload 3
      // 0fa: lxor
      // 0fb: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/vs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 103: goto 110
      // 106: ldc2_w 7804525451498931982
      // 109: lload 3
      // 10a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: lload 3
      // 111: lconst_0
      // 112: lcmp
      // 113: ifle 178
      // 116: iload 13
      // 118: ifeq 178
      // 11b: ifeq 157
      // 11e: goto 12b
      // 121: ldc2_w 7804525451498931982
      // 124: lload 3
      // 125: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 14
      // 12d: lload 5
      // 12f: bipush 1
      // 130: anewarray 13
      // 133: dup_x2
      // 134: dup_x2
      // 135: pop
      // 136: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 139: bipush 0
      // 13a: swap
      // 13b: aastore
      // 13c: ldc2_w 7581407911111960723
      // 13f: lload 3
      // 140: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: iload 13
      // 147: ifne 1a2
      // 14a: goto 157
      // 14d: ldc2_w 7804525451498931982
      // 150: lload 3
      // 151: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/zelix/vs.j Ljava/lang/String;
      // 15b: sipush 22232
      // 15e: ldc2_w 7355349051028906251
      // 161: lload 3
      // 162: lxor
      // 163: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/vs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16b: goto 178
      // 16e: ldc2_w 7804525451498931982
      // 171: lload 3
      // 172: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: ifeq 1a2
      // 17b: aload 14
      // 17d: lload 7
      // 17f: bipush 1
      // 180: anewarray 13
      // 183: dup_x2
      // 184: dup_x2
      // 185: pop
      // 186: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 189: bipush 0
      // 18a: swap
      // 18b: aastore
      // 18c: ldc2_w 7574943273407574271
      // 18f: lload 3
      // 190: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: goto 1a2
      // 198: ldc2_w 7804525451498931982
      // 19b: lload 3
      // 19c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: return
   }

   public vs(int var1) {
      super(var1);
   }

   static {
      long var10000 = ess.a(9090617301209330608L, 6256588653678933114L, MethodHandles.lookup().lookupClass()).a(55774077995272L);
      long var0 = var10000 ^ 65598123463426L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "C W 9 î\u008f#\"\u009cþ\u0013A\u0092£\u0010Wz¹Xæ\u0013]\u0095ó\u0084Å\u0088\u00879^l";
      int var8 = "C W 9 î\u008f#\"\u009cþ\u0013A\u0092£\u0010Wz¹Xæ\u0013]\u0095ó\u0084Å\u0088\u00879^l".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     a = var9;
                     b = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "p-ÿ²³Ç\u0097\u0092ÅÞ6ö^-Ú-\u0018\fäN\\Eñã/<i´~½\u007fF\u0082ú\u009c\u009a|É\u0001_½";
                  var8 = "p-ÿ²³Ç\u0097\u0092ÅÞ6ö^-Ú-\u0018\fäN\\Eñã/<i´~½\u007fF\u0082ú\u009c\u009a|É\u0001_½".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3780;
      if (b[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])c.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               c.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/vs", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = a[var5].getBytes("ISO-8859-1");
         b[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return b[var5];
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
         throw new RuntimeException("com/zelix/vs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
