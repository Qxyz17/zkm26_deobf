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

public class t extends e {
   private static t Y;
   private static final long c = ess.a(6118516420004096077L, -3367228288484465010L, MethodHandles.lookup().lookupClass()).a(195680612974985L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);

   private t(long var1) {
      var1 = c ^ var1;
      super();
      x44.a<"w">(this, "", -147159477409847002L, var1);
      x44.a<"w">(this, 0, -382272775753400410L, var1);
      x44.a<"w">(this, true, -132525007518582034L, var1);
   }

   static {
      long var9 = c ^ 47809380473894L;
      long var11 = var9 ^ 48652131970473L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "£éÅ14öÀ\u0017£0\u0081êM\u008d\u008f3\u0010\u001cå £\u001fÐ»\u0087\u0015l\u0013\u0015Ù\u001b8^\u0010(\u009c¹)S\u0019\u0094í2[Çé\u0003\u00ad-¶";
      int var6 = "£éÅ14öÀ\u0017£0\u0081êM\u008d\u008f3\u0010\u001cå £\u001fÐ»\u0087\u0015l\u0013\u0015Ù\u001b8^\u0010(\u009c¹)S\u0019\u0094í2[Çé\u0003\u00ad-¶"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var15 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var15;
         if ((var2 += var3) >= var6) {
            e = var7;
            f = new String[3];
            x44.a<"q">(new t(var11), -2000538706176362442L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   t(short param1, int param2, _kz param3, char param4) {
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
      // 00e: iload 4
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: getstatic com/zelix/t.c J
      // 01b: lxor
      // 01c: lstore 5
      // 01e: lload 5
      // 020: dup2
      // 021: ldc2_w 20623245023240
      // 024: lxor
      // 025: lstore 7
      // 027: dup2
      // 028: ldc2_w 43354114327175
      // 02b: lxor
      // 02c: lstore 9
      // 02e: dup2
      // 02f: ldc2_w 136535382131811
      // 032: lxor
      // 033: lstore 11
      // 035: pop2
      // 036: aload 0
      // 037: invokespecial com/zelix/e.<init> ()V
      // 03a: ldc2_w -2001202347309068497
      // 03d: lload 5
      // 03f: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: aload 3
      // 045: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 048: astore 14
      // 04a: new java/lang/StringBuilder
      // 04d: dup
      // 04e: invokespecial java/lang/StringBuilder.<init> ()V
      // 051: astore 15
      // 053: aload 0
      // 054: bipush 0
      // 055: ldc2_w -2111465803118778459
      // 058: lload 5
      // 05a: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: istore 13
      // 061: aload 14
      // 063: arraylength
      // 064: istore 16
      // 066: bipush 0
      // 067: istore 17
      // 069: iload 17
      // 06b: iload 16
      // 06d: if_icmpge 137
      // 070: aload 14
      // 072: iload 17
      // 074: aaload
      // 075: astore 18
      // 077: aload 0
      // 078: dup
      // 079: ldc2_w -2111465803118778459
      // 07c: lload 5
      // 07e: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: aload 18
      // 085: lload 9
      // 087: invokevirtual com/zelix/n.Z (J)I
      // 08a: iadd
      // 08b: ldc2_w -2111465803118778459
      // 08e: lload 5
      // 090: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: iload 4
      // 097: iflt 152
      // 09a: aload 18
      // 09c: invokevirtual com/zelix/n.o ()Z
      // 09f: iload 13
      // 0a1: ifne 150
      // 0a4: iload 13
      // 0a6: iload 1
      // 0a7: iflt 116
      // 0aa: ifne 112
      // 0ad: goto 0bb
      // 0b0: ldc2_w -311293243327976470
      // 0b3: lload 5
      // 0b5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: iload 4
      // 0bd: iflt 0fa
      // 0c0: ifne 0eb
      // 0c3: goto 0d1
      // 0c6: ldc2_w -311293243327976470
      // 0c9: lload 5
      // 0cb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: bipush 1
      // 0d3: ldc2_w -1861577842858548499
      // 0d6: lload 5
      // 0d8: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: goto 0eb
      // 0e0: ldc2_w -311293243327976470
      // 0e3: lload 5
      // 0e5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 15
      // 0ed: aload 18
      // 0ef: lload 7
      // 0f1: invokevirtual com/zelix/n.Y (J)Ljava/lang/String;
      // 0f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f7: pop
      // 0f8: iload 13
      // 0fa: iload 4
      // 0fc: iflt 134
      // 0ff: ifne 132
      // 102: iload 17
      // 104: goto 112
      // 107: ldc2_w -311293243327976470
      // 10a: lload 5
      // 10c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: iload 16
      // 114: bipush 1
      // 115: isub
      // 116: if_icmpge 12f
      // 119: aload 15
      // 11b: ldc "|"
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: pop
      // 121: goto 12f
      // 124: ldc2_w -311293243327976470
      // 127: lload 5
      // 129: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: iinc 17 1
      // 132: iload 13
      // 134: ifeq 069
      // 137: aload 15
      // 139: sipush 10519
      // 13c: ldc2_w 3081089128038973404
      // 13f: lload 5
      // 141: lxor
      // 142: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14a: pop
      // 14b: iload 1
      // 14c: iflt 152
      // 14f: bipush 0
      // 150: istore 17
      // 152: aload 3
      // 153: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 156: astore 18
      // 158: aload 18
      // 15a: arraylength
      // 15b: istore 19
      // 15d: bipush 0
      // 15e: istore 20
      // 160: iload 20
      // 162: iload 19
      // 164: if_icmpge 1db
      // 167: aload 18
      // 169: iload 20
      // 16b: aaload
      // 16c: invokevirtual com/zelix/n.o ()Z
      // 16f: iload 13
      // 171: iload 4
      // 173: iflt 18e
      // 176: ifne 18c
      // 179: ifne 1d3
      // 17c: goto 18a
      // 17f: ldc2_w -311293243327976470
      // 182: lload 5
      // 184: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: iload 17
      // 18c: iload 13
      // 18e: ifne 1c5
      // 191: ifne 1c4
      // 194: goto 1a2
      // 197: ldc2_w -311293243327976470
      // 19a: lload 5
      // 19c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aload 15
      // 1a4: sipush 19690
      // 1a7: ldc2_w 6245645649813592610
      // 1aa: lload 5
      // 1ac: lxor
      // 1ad: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b5: pop
      // 1b6: goto 1c4
      // 1b9: ldc2_w -311293243327976470
      // 1bc: lload 5
      // 1be: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: bipush 1
      // 1c5: istore 17
      // 1c7: aload 0
      // 1c8: bipush 1
      // 1c9: ldc2_w -1861577842858548499
      // 1cc: lload 5
      // 1ce: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: iinc 20 1
      // 1d6: iload 13
      // 1d8: ifeq 160
      // 1db: iload 4
      // 1dd: ifle 167
      // 1e0: aload 3
      // 1e1: invokevirtual com/zelix/_kz.z ()Lcom/zelix/p5;
      // 1e4: astore 20
      // 1e6: iload 13
      // 1e8: ifne 254
      // 1eb: aload 20
      // 1ed: ifnull 244
      // 1f0: goto 1fe
      // 1f3: ldc2_w -311293243327976470
      // 1f6: lload 5
      // 1f8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: athrow
      // 1fe: aload 15
      // 200: sipush 1120
      // 203: ldc2_w 1717169039952220841
      // 206: lload 5
      // 208: lxor
      // 209: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 211: pop
      // 212: aload 15
      // 214: aload 20
      // 216: lload 11
      // 218: bipush 1
      // 219: anewarray 227
      // 21c: dup_x2
      // 21d: dup_x2
      // 21e: pop
      // 21f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 222: bipush 0
      // 223: swap
      // 224: aastore
      // 225: ldc2_w -1737259361016061494
      // 228: lload 5
      // 22a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: invokevirtual java/lang/Object.hashCode ()I
      // 232: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 235: pop
      // 236: goto 244
      // 239: ldc2_w -311293243327976470
      // 23c: lload 5
      // 23e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: aload 0
      // 245: aload 15
      // 247: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24a: ldc2_w -1876212303612514011
      // 24d: lload 5
      // 24f: invokedynamic t (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: return
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32581;
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
            throw new RuntimeException("com/zelix/t", var10);
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
         throw new RuntimeException("com/zelix/t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
