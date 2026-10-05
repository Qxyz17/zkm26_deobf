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

public class q extends e {
   private static q m;
   private static final long c = ess.a(-3552891698937484997L, 6757880799740497182L, MethodHandles.lookup().lookupClass()).a(108515053752562L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);

   private q(long var1) {
      var1 = c ^ var1;
      super();
      x44.a<"q">(this, "", -5797466855012943016L, var1);
      x44.a<"q">(this, 0, -6282651982166020648L, var1);
      x44.a<"q">(this, true, -6028278565361751920L, var1);
   }

   q(short param1, int param2, int param3, _kz param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 48
      // 012: lshl
      // 013: bipush 48
      // 015: lushr
      // 016: lor
      // 017: getstatic com/zelix/q.c J
      // 01a: lxor
      // 01b: lstore 5
      // 01d: lload 5
      // 01f: dup2
      // 020: ldc2_w 62096480604164
      // 023: lxor
      // 024: lstore 7
      // 026: dup2
      // 027: ldc2_w 15214469646987
      // 02a: lxor
      // 02b: lstore 9
      // 02d: dup2
      // 02e: ldc2_w 95201463438447
      // 031: lxor
      // 032: lstore 11
      // 034: pop2
      // 035: aload 0
      // 036: invokespecial com/zelix/e.<init> ()V
      // 039: aload 4
      // 03b: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 03e: astore 14
      // 040: new java/lang/StringBuilder
      // 043: dup
      // 044: invokespecial java/lang/StringBuilder.<init> ()V
      // 047: astore 15
      // 049: ldc2_w 8023071452306207029
      // 04c: lload 5
      // 04e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: aload 0
      // 054: bipush 0
      // 055: ldc2_w 7691791588084871081
      // 058: lload 5
      // 05a: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: aload 14
      // 061: arraylength
      // 062: istore 16
      // 064: istore 13
      // 066: bipush 0
      // 067: istore 17
      // 069: iload 17
      // 06b: iload 16
      // 06d: if_icmpge 134
      // 070: aload 14
      // 072: iload 1
      // 073: iflt 151
      // 076: iload 17
      // 078: aaload
      // 079: astore 18
      // 07b: aload 0
      // 07c: dup
      // 07d: ldc2_w 7691791588084871081
      // 080: lload 5
      // 082: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: aload 18
      // 089: lload 9
      // 08b: invokevirtual com/zelix/n.Z (J)I
      // 08e: iadd
      // 08f: ldc2_w 7691791588084871081
      // 092: lload 5
      // 094: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: iload 13
      // 09b: ifeq 14c
      // 09e: aload 18
      // 0a0: invokevirtual com/zelix/n.o ()Z
      // 0a3: iload 13
      // 0a5: iload 2
      // 0a6: ifle 113
      // 0a9: ifeq 10f
      // 0ac: goto 0ba
      // 0af: ldc2_w 7849963866559836300
      // 0b2: lload 5
      // 0b4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: iload 3
      // 0bb: iflt 0f8
      // 0be: ifne 0e9
      // 0c1: goto 0cf
      // 0c4: ldc2_w 7849963866559836300
      // 0c7: lload 5
      // 0c9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: bipush 1
      // 0d1: ldc2_w 7937157188269058785
      // 0d4: lload 5
      // 0d6: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: goto 0e9
      // 0de: ldc2_w 7849963866559836300
      // 0e1: lload 5
      // 0e3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 15
      // 0eb: aload 18
      // 0ed: lload 7
      // 0ef: invokevirtual com/zelix/n.Y (J)Ljava/lang/String;
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: pop
      // 0f6: iload 13
      // 0f8: iload 3
      // 0f9: iflt 131
      // 0fc: ifeq 12f
      // 0ff: iload 17
      // 101: goto 10f
      // 104: ldc2_w 7849963866559836300
      // 107: lload 5
      // 109: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: iload 16
      // 111: bipush 1
      // 112: isub
      // 113: if_icmpge 12c
      // 116: aload 15
      // 118: ldc "|"
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: pop
      // 11e: goto 12c
      // 121: ldc2_w 7849963866559836300
      // 124: lload 5
      // 126: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: iinc 17 1
      // 12f: iload 13
      // 131: ifne 069
      // 134: aload 15
      // 136: sipush 21105
      // 139: ldc2_w 6619392036166518135
      // 13c: lload 5
      // 13e: lxor
      // 13f: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/q.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: pop
      // 148: iload 3
      // 149: ifle 14c
      // 14c: aload 4
      // 14e: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 151: astore 17
      // 153: aload 17
      // 155: arraylength
      // 156: istore 18
      // 158: bipush 0
      // 159: istore 19
      // 15b: iload 19
      // 15d: iload 18
      // 15f: if_icmpge 1ed
      // 162: aload 17
      // 164: iload 19
      // 166: aaload
      // 167: astore 20
      // 169: aload 20
      // 16b: invokevirtual com/zelix/n.o ()Z
      // 16e: iload 13
      // 170: iload 1
      // 171: iflt 1cc
      // 174: ifeq 1c8
      // 177: ifne 1a2
      // 17a: goto 188
      // 17d: ldc2_w 7849963866559836300
      // 180: lload 5
      // 182: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: aload 0
      // 189: bipush 1
      // 18a: ldc2_w 7937157188269058785
      // 18d: lload 5
      // 18f: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: goto 1a2
      // 197: ldc2_w 7849963866559836300
      // 19a: lload 5
      // 19c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aload 15
      // 1a4: aload 20
      // 1a6: lload 7
      // 1a8: invokevirtual com/zelix/n.Y (J)Ljava/lang/String;
      // 1ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ae: pop
      // 1af: iload 13
      // 1b1: iload 2
      // 1b2: iflt 1ea
      // 1b5: ifeq 1e8
      // 1b8: iload 19
      // 1ba: goto 1c8
      // 1bd: ldc2_w 7849963866559836300
      // 1c0: lload 5
      // 1c2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: iload 18
      // 1ca: bipush 1
      // 1cb: isub
      // 1cc: if_icmpge 1e5
      // 1cf: aload 15
      // 1d1: ldc "|"
      // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d6: pop
      // 1d7: goto 1e5
      // 1da: ldc2_w 7849963866559836300
      // 1dd: lload 5
      // 1df: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: athrow
      // 1e5: iinc 19 1
      // 1e8: iload 13
      // 1ea: ifne 15b
      // 1ed: aload 4
      // 1ef: invokevirtual com/zelix/_kz.z ()Lcom/zelix/p5;
      // 1f2: astore 19
      // 1f4: iload 13
      // 1f6: ifeq 262
      // 1f9: aload 19
      // 1fb: ifnull 252
      // 1fe: goto 20c
      // 201: ldc2_w 7849963866559836300
      // 204: lload 5
      // 206: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: athrow
      // 20c: aload 15
      // 20e: sipush 24847
      // 211: ldc2_w 6262911802729559560
      // 214: lload 5
      // 216: lxor
      // 217: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/q.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: pop
      // 220: aload 15
      // 222: aload 19
      // 224: lload 11
      // 226: bipush 1
      // 227: anewarray 104
      // 22a: dup_x2
      // 22b: dup_x2
      // 22c: pop
      // 22d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 230: bipush 0
      // 231: swap
      // 232: aastore
      // 233: ldc2_w 8063740661749311942
      // 236: lload 5
      // 238: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: invokevirtual java/lang/Object.hashCode ()I
      // 240: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 243: pop
      // 244: goto 252
      // 247: ldc2_w 7849963866559836300
      // 24a: lload 5
      // 24c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: athrow
      // 252: aload 0
      // 253: aload 15
      // 255: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 258: ldc2_w 7924770060394035497
      // 25b: lload 5
      // 25d: invokedynamic p (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: return
   }

   static {
      long var9 = c ^ 62831136011666L;
      long var11 = var9 ^ 92090438473315L;
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
      String var4 = "¦RR\u0014\r°qÐÎZs\u009cá\u001d\u007fv\u0010Sn»Ø\u0018®Ø\u0091\u0003VúÅÔSÿ\u0097";
      int var6 = "¦RR\u0014\r°qÐÎZs\u009cá\u001d\u007fv\u0010Sn»Ø\u0018®Ø\u0091\u0003VúÅÔSÿ\u0097".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var15 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var15;
         if ((var2 += var3) >= var6) {
            e = var7;
            f = new String[2];
            x44.a<"s">(new q(var11), -5518112085777309985L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30342;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/q", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("com/zelix/q" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
