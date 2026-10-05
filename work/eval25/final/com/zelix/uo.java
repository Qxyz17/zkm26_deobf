package com.zelix;

import java.awt.Component;
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
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class uo extends JScrollPane implements ChangeListener {
   private static final String n;
   private static final String i;
   private boolean d;
   private Component a;
   private static final String e;
   private static final long b = ess.a(-5138694112249003737L, -6096688947682745333L, MethodHandles.lookup().lookupClass()).a(256306009463493L);
   private static final String[] c;
   private static final String[] f;
   private static final Map g = new HashMap(13);

   @Override
   public void stateChanged(ChangeEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/uo.b J
      // 03: ldc2_w 83921889476293
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 2858848903650414467
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 2728831985716304435
      // 17: lload 2
      // 18: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Component; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnull 49
      // 22: ifnull 52
      // 25: goto 32
      // 28: ldc2_w 4326071576151766163
      // 2b: lload 2
      // 2c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aload 0
      // 33: ldc2_w 2728831985716304435
      // 36: lload 2
      // 37: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Component; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: goto 49
      // 3f: ldc2_w 4326071576151766163
      // 42: lload 2
      // 43: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: ldc2_w 4219931263321607416
      // 4c: lload 2
      // 4d: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: return
   }

   static {
      long var9 = b ^ 109052778508303L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "\u000e\u0018b/æRëëHA0\r\u000f8o¶\u0010Äî&Ô\r\u0018éG:7\\Õ\u0000Ýîn\u0010\u0012hÌ[\u0006Î¯ÎÞÌ:È\u0013Ýp\u0016\u0010\u0080Ô+<\u0092\u0099:f§ú\u0001\r ïah";
      int var6 = "\u000e\u0018b/æRëëHA0\r\u000f8o¶\u0010Äî&Ô\r\u0018éG:7\\Õ\u0000Ýîn\u0010\u0012hÌ[\u0006Î¯ÎÞÌ:È\u0013Ýp\u0016\u0010\u0080Ô+<\u0092\u0099:f§ú\u0001\r ïah"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     c = var7;
                     f = new String[6];
                     e = x44.a<"q">(a<"r">(29674, 6325098272163645105L ^ var9), a<"r">(31656, 811839019150003959L ^ var9), -879435587008344861L, var9);
                     n = x44.a<"q">(a<"r">(10395, 2500134279624465857L ^ var9), -1310324655245434176L, var9);
                     i = x44.a<"q">(a<"r">(1545, 3572586661687407445L ^ var9), -1310324655245434176L, var9);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "l\niLêøàyÅ\nõÒÉDÒûÎ¥è¼4o3¤5ØFî\\snb ,S\u009dów5ð\u0003 =¨!\u0016\u008e\u009aæ\u0004`¦åÐgÜ?¸!ë\u0015«\u0015?,";
                  var6 = "l\niLêøàyÅ\nõÒÉDÒûÎ¥è¼4o3¤5ØFî\\snb ,S\u009dów5ð\u0003 =¨!\u0016\u008e\u009aæ\u0004`¦åÐgÜ?¸!ë\u0015«\u0015?,".length();
                  var3 = ' ';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   public uo(Component var1, long var2) {
      var2 = b ^ var2;
      long var4 = var2 ^ 21662778205943L;
      super(var1);
      x44.a<"u">(this, var1, -3363101718723039554L, var2);
      x44.a<"h">(this, new Object[]{var4}, -3267454641123020276L, var2);
   }

   private void N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 97767956570461L;
      x44.a<"w">(this, x44.a<"t">(new Object[]{var4}, -108514486102891394L, var2), -115872488333814322L, var2);
      x44.a<"l">(x44.a<"l">(this, -364653747955821789L, var2), this, -2031908644675831023L, var2);
   }

   private static boolean M(Object[] param0) {
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
      // 00c: getstatic com/zelix/uo.b J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: ldc2_w -7742815568559752028
      // 015: lload 1
      // 016: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: astore 3
      // 01c: ldc2_w -8483434925893324051
      // 01f: lload 1
      // 020: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: sipush 20316
      // 028: ldc2_w 6665503344152774639
      // 02b: lload 1
      // 02c: lxor
      // 02d: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/uo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 035: aload 3
      // 036: ifnull 150
      // 039: bipush -1
      // 03a: if_icmpeq 14f
      // 03d: goto 04a
      // 040: ldc2_w -8129526739244677196
      // 043: lload 1
      // 044: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: athrow
      // 04a: ldc2_w -7503017764848162448
      // 04d: lload 1
      // 04e: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: sipush 24354
      // 056: ldc2_w 7272374448304002962
      // 059: lload 1
      // 05a: lxor
      // 05b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/uo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 063: aload 3
      // 064: ifnull 150
      // 067: goto 074
      // 06a: ldc2_w -8129526739244677196
      // 06d: lload 1
      // 06e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: bipush -1
      // 075: if_icmpeq 14f
      // 078: goto 085
      // 07b: ldc2_w -8129526739244677196
      // 07e: lload 1
      // 07f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: new java/util/StringTokenizer
      // 088: dup
      // 089: ldc2_w -8586021930128485685
      // 08c: lload 1
      // 08d: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: ldc "."
      // 094: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 097: astore 4
      // 099: bipush 0
      // 09a: istore 5
      // 09c: aload 4
      // 09e: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0a1: ifeq 14f
      // 0a4: aload 4
      // 0a6: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0a9: astore 6
      // 0ab: aload 3
      // 0ac: lload 1
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: iflt 14c
      // 0b2: ifnull 14b
      // 0b5: iload 5
      // 0b7: aload 3
      // 0b8: ifnull 150
      // 0bb: goto 0c8
      // 0be: ldc2_w -8129526739244677196
      // 0c1: lload 1
      // 0c2: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: lookupswitch 128 2 0 38 1 90
      // 0e4: ldc2_w -8129526739244677196
      // 0e7: lload 1
      // 0e8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 6
      // 0f0: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0f3: istore 7
      // 0f5: iload 7
      // 0f7: aload 3
      // 0f8: ifnull 11a
      // 0fb: bipush 1
      // 0fc: if_icmple 11b
      // 0ff: goto 10c
      // 102: ldc2_w -8129526739244677196
      // 105: lload 1
      // 106: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: bipush 0
      // 10d: goto 11a
      // 110: ldc2_w -8129526739244677196
      // 113: lload 1
      // 114: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: ireturn
      // 11b: goto 148
      // 11e: astore 7
      // 120: bipush 0
      // 121: ireturn
      // 122: aload 6
      // 124: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 127: istore 7
      // 129: iload 7
      // 12b: aload 3
      // 12c: ifnull 143
      // 12f: bipush 3
      // 130: if_icmpne 142
      // 133: goto 140
      // 136: ldc2_w -8129526739244677196
      // 139: lload 1
      // 13a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: bipush 1
      // 141: ireturn
      // 142: bipush 0
      // 143: ireturn
      // 144: astore 7
      // 146: bipush 0
      // 147: ireturn
      // 148: iinc 5 1
      // 14b: aload 3
      // 14c: ifnonnull 09c
      // 14f: bipush 0
      // 150: ireturn
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21244;
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
            throw new RuntimeException("com/zelix/uo", var10);
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
         throw new RuntimeException("com/zelix/uo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
