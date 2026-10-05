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
import javax.swing.JList;
import javax.swing.ListModel;

public class q0 extends JList {
   private static final String w;
   private static final String j;
   private boolean z;
   private static final String Q;
   private int u;
   private static final long b = ess.a(1509311651089324137L, 3655672461109309254L, MethodHandles.lookup().lookupClass()).a(48488467297492L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);
   private static final long r;

   private void X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 136898178500890L;
      x44.a<"q">(this, x44.a<"r">(new Object[]{var4}, 2449639220171982491L, var2), 2549999312415863773L, var2);
      x44.a<"j">(this, new ra(this), 2365140866199129090L, var2);
      x44.a<"j">(this, new qy(this), 2354164662337896814L, var2);
   }

   public q0(long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 25463197221231L;
      super();
      x44.a<"o">(this, new Object[]{var3}, -8565788153093963071L, var1);
   }

   public q0(ListModel var1, long var2) {
      var2 = b ^ var2;
      long var4 = var2 ^ 134556515878277L;
      super(var1);
      x44.a<"m">(this, new Object[]{var4}, 993703727943796267L, var2);
   }

   private static boolean G(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: pop
      // 00c: getstatic com/zelix/q0.b J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: ldc2_w 48364713233754244
      // 015: lload 1
      // 016: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: astore 3
      // 01c: ldc2_w 414705620944431030
      // 01f: lload 1
      // 020: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: sipush 24157
      // 028: ldc2_w 6942152912693030495
      // 02b: lload 1
      // 02c: lxor
      // 02d: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 035: bipush -1
      // 036: aload 3
      // 037: ifnull 0bd
      // 03a: if_icmpne 085
      // 03d: goto 04a
      // 040: ldc2_w 277835530382632331
      // 043: lload 1
      // 044: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: athrow
      // 04a: ldc2_w 414705620944431030
      // 04d: lload 1
      // 04e: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: sipush 13210
      // 056: ldc2_w 6101478921084437407
      // 059: lload 1
      // 05a: lxor
      // 05b: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 063: aload 3
      // 064: ifnull 1f8
      // 067: goto 074
      // 06a: ldc2_w 277835530382632331
      // 06d: lload 1
      // 06e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: bipush -1
      // 075: if_icmpeq 1f7
      // 078: goto 085
      // 07b: ldc2_w 277835530382632331
      // 07e: lload 1
      // 07f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: ldc2_w 420154335248100956
      // 088: lload 1
      // 089: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: sipush 28265
      // 091: ldc2_w 4593373004891512430
      // 094: lload 1
      // 095: lxor
      // 096: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 09e: aload 3
      // 09f: ifnull 1f8
      // 0a2: goto 0af
      // 0a5: ldc2_w 277835530382632331
      // 0a8: lload 1
      // 0a9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: bipush -1
      // 0b0: goto 0bd
      // 0b3: ldc2_w 277835530382632331
      // 0b6: lload 1
      // 0b7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: if_icmpeq 1f7
      // 0c0: new java/util/StringTokenizer
      // 0c3: dup
      // 0c4: ldc2_w 1734397418175438944
      // 0c7: lload 1
      // 0c8: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: ldc "."
      // 0cf: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0d2: astore 4
      // 0d4: bipush 0
      // 0d5: istore 5
      // 0d7: aload 4
      // 0d9: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0dc: ifeq 1f7
      // 0df: aload 4
      // 0e1: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0e4: astore 6
      // 0e6: aload 3
      // 0e7: lload 1
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 1f4
      // 0ed: ifnull 1f3
      // 0f0: iload 5
      // 0f2: aload 3
      // 0f3: ifnull 1f8
      // 0f6: goto 103
      // 0f9: ldc2_w 277835530382632331
      // 0fc: lload 1
      // 0fd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: tableswitch 237 0 2 35 87 151
      // 11c: ldc2_w 277835530382632331
      // 11f: lload 1
      // 120: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 6
      // 128: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 12b: istore 7
      // 12d: iload 7
      // 12f: aload 3
      // 130: ifnull 152
      // 133: bipush 1
      // 134: if_icmple 153
      // 137: goto 144
      // 13a: ldc2_w 277835530382632331
      // 13d: lload 1
      // 13e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: bipush 0
      // 145: goto 152
      // 148: ldc2_w 277835530382632331
      // 14b: lload 1
      // 14c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: ireturn
      // 153: goto 1f0
      // 156: astore 7
      // 158: bipush 0
      // 159: ireturn
      // 15a: aload 6
      // 15c: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 15f: istore 7
      // 161: iload 7
      // 163: bipush 4
      // 164: aload 3
      // 165: ifnull 18e
      // 168: if_icmpge 17a
      // 16b: goto 178
      // 16e: ldc2_w 277835530382632331
      // 171: lload 1
      // 172: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: bipush 1
      // 179: ireturn
      // 17a: iload 7
      // 17c: aload 3
      // 17d: ifnull 192
      // 180: bipush 4
      // 181: goto 18e
      // 184: ldc2_w 277835530382632331
      // 187: lload 1
      // 188: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: if_icmple 193
      // 191: bipush 0
      // 192: ireturn
      // 193: goto 1f0
      // 196: astore 7
      // 198: bipush 0
      // 199: ireturn
      // 19a: aload 6
      // 19c: invokevirtual java/lang/String.length ()I
      // 19f: aload 3
      // 1a0: ifnull 1c6
      // 1a3: ifle 1f0
      // 1a6: goto 1b3
      // 1a9: ldc2_w 277835530382632331
      // 1ac: lload 1
      // 1ad: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: aload 6
      // 1b5: bipush 0
      // 1b6: invokevirtual java/lang/String.charAt (I)C
      // 1b9: goto 1c6
      // 1bc: ldc2_w 277835530382632331
      // 1bf: lload 1
      // 1c0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: athrow
      // 1c6: istore 7
      // 1c8: iload 7
      // 1ca: aload 3
      // 1cb: ifnull 1ef
      // 1ce: getstatic com/zelix/q0.r J
      // 1d1: l2i
      // 1d2: if_icmpne 1ee
      // 1d5: goto 1e2
      // 1d8: ldc2_w 277835530382632331
      // 1db: lload 1
      // 1dc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: bipush 1
      // 1e3: ireturn
      // 1e4: ldc2_w 277835530382632331
      // 1e7: lload 1
      // 1e8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: bipush 0
      // 1ef: ireturn
      // 1f0: iinc 5 1
      // 1f3: aload 3
      // 1f4: ifnonnull 0d7
      // 1f7: bipush 0
      // 1f8: ireturn
   }

   static {
      long var14 = b ^ 138343242250963L;
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[7];
      int var10 = 0;
      String var9 = "^5\u0086%\u008d\u0018N ¥å\u0086ÈGÄe\u0087Îû \n¿Æ\"ú=NJ\b\u0086$\nA\u0010\u008fnø\u0000½:p°×\t^[\n»\u0097½\u0010~íDôËÁ\u009cWPCwþþ\u0084É\u0017\u00108ñ\u0094õ\u000e\u0086\u0080¦È\u00915<\fxÓ\u0082\u0010\u0001Ê\u009c\u008fÎÆAóÌ\u0096\u0084B\u0012³!\u0006";
      int var11 = "^5\u0086%\u008d\u0018N ¥å\u0086ÈGÄe\u0087Îû \n¿Æ\"ú=NJ\b\u0086$\nA\u0010\u008fnø\u0000½:p°×\t^[\n»\u0097½\u0010~íDôËÁ\u009cWPCwþþ\u0084É\u0017\u00108ñ\u0094õ\u000e\u0086\u0080¦È\u00915<\fxÓ\u0082\u0010\u0001Ê\u009c\u008fÎÆAóÌ\u0096\u0084B\u0012³!\u0006"
         .length();
      char var8 = ' ';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var9.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var13).intern();
            switch (var10001) {
               case 0:
                  var12[var10++] = var26;
                  if ((var17 += var8) >= var11) {
                     e = var12;
                     f = new String[7];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -940575043380203686L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)((int)(var2 >>> 56)),
                           (byte)((int)(var2 >>> 48)),
                           (byte)((int)(var2 >>> 40)),
                           (byte)((int)(var2 >>> 32)),
                           (byte)((int)(var2 >>> 24)),
                           (byte)((int)(var2 >>> 16)),
                           (byte)((int)(var2 >>> 8)),
                           (byte)((int)var2)
                        }
                     );
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     r = var30;
                     w = x44.a<"t">(a<"m">(28851, 4169674489069207650L ^ var14), a<"m">(29641, 9089161271434609433L ^ var14), 6545697147933648382L, var14);
                     j = x44.a<"t">(a<"m">(6709, 4152147908054117089L ^ var14), 4957807559687818205L, var14);
                     Q = x44.a<"t">(a<"m">(3768, 7376650996467039851L ^ var14), 4957807559687818205L, var14);
                     return;
                  }

                  var8 = var9.charAt(var17);
                  break;
               default:
                  var12[var10++] = var26;
                  if ((var17 += var8) < var11) {
                     var8 = var9.charAt(var17);
                     continue label37;
                  }

                  var9 = "ú\u0005\u0016\u0003Òq\n\u00022D\u009d²¥Ro\u0096ø\r\u009cI\u0092g]\u0004\u0096\rn\r\u000b=Mn\u0010Ôãxé\u0014sëºz»\u000b\u0098Fìúx";
                  var11 = "ú\u0005\u0016\u0003Òq\n\u00022D\u009d²¥Ro\u0096ø\r\u009cI\u0092g]\u0004\u0096\rn\r\u000b=Mn\u0010Ôãxé\u0014sëºz»\u000b\u0098Fìúx"
                     .length();
                  var8 = ' ';
                  var17 = -1;
            }

            var18 = var9.substring(++var17, var17 + var8);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15982;
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
            throw new RuntimeException("com/zelix/q0", var10);
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
         throw new RuntimeException("com/zelix/q0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
