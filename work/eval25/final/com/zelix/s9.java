package com.zelix;

import java.io.BufferedReader;
import java.io.IOException;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public abstract class s9 extends s2 {
   protected JTextArea P;
   protected JLabel K;
   static final String u;
   protected _s4 L;
   protected BufferedReader w;
   private static final long b = ess.a(418242451693827894L, -5381959449002222354L, MethodHandles.lookup().lookupClass()).a(58648277279097L);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public s9(JFrame param1, String param2, String param3, long param4, BufferedReader param6, boolean param7, boolean param8, boolean param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/s9.b J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 30950209122816
      // 00e: lxor
      // 00f: lstore 10
      // 011: dup2
      // 012: ldc2_w 6965899358309
      // 015: lxor
      // 016: lstore 12
      // 018: pop2
      // 019: ldc2_w 8646504363993817041
      // 01c: lload 4
      // 01e: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: aload 0
      // 024: aload 1
      // 025: aload 2
      // 026: iload 8
      // 028: lload 10
      // 02a: invokespecial com/zelix/s2.<init> (Ljavax/swing/JFrame;Ljava/lang/String;ZJ)V
      // 02d: astore 14
      // 02f: aload 0
      // 030: lload 12
      // 032: bipush 1
      // 033: anewarray 14
      // 036: dup_x2
      // 037: dup_x2
      // 038: pop
      // 039: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03c: bipush 0
      // 03d: swap
      // 03e: aastore
      // 03f: ldc2_w 8557436707946673981
      // 042: lload 4
      // 044: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: aload 0
      // 04a: ldc2_w 8013585112301745264
      // 04d: lload 4
      // 04f: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/JLabel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 3
      // 055: ldc2_w 8635937384977187079
      // 058: lload 4
      // 05a: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: aload 0
      // 060: aload 6
      // 062: ldc2_w 8579085375710913499
      // 065: lload 4
      // 067: invokedynamic r (Ljava/lang/Object;Ljava/io/BufferedReader;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aconst_null
      // 06d: astore 15
      // 06f: new java/lang/StringBuffer
      // 072: dup
      // 073: invokespecial java/lang/StringBuffer.<init> ()V
      // 076: astore 16
      // 078: aload 0
      // 079: ldc2_w 8462327515175608226
      // 07c: lload 4
      // 07e: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/JTextArea; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: iload 7
      // 085: ldc2_w 8126670494284572585
      // 088: lload 4
      // 08a: invokedynamic i (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: bipush 0
      // 090: istore 17
      // 092: aload 6
      // 094: aload 14
      // 096: ifnull 0ac
      // 099: ifnull 170
      // 09c: goto 0aa
      // 09f: ldc2_w 8351070256938048702
      // 0a2: lload 4
      // 0a4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 6
      // 0ac: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0af: astore 15
      // 0b1: aload 15
      // 0b3: ifnull 129
      // 0b6: iload 17
      // 0b8: lload 4
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: ifle 0f9
      // 0bf: sipush 26111
      // 0c2: ldc2_w 1216399886625391166
      // 0c5: lload 4
      // 0c7: lxor
      // 0c8: invokedynamic b (IJ)I bsm=com/zelix/s9.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: aload 14
      // 0cf: ifnull 0f8
      // 0d2: if_icmpge 129
      // 0d5: goto 0e3
      // 0d8: ldc2_w 8351070256938048702
      // 0db: lload 4
      // 0dd: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: iload 17
      // 0e5: aload 15
      // 0e7: invokevirtual java/lang/String.length ()I
      // 0ea: goto 0f8
      // 0ed: ldc2_w 8351070256938048702
      // 0f0: lload 4
      // 0f2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: iadd
      // 0f9: istore 17
      // 0fb: aload 16
      // 0fd: new java/lang/StringBuilder
      // 100: dup
      // 101: invokespecial java/lang/StringBuilder.<init> ()V
      // 104: aload 15
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: ldc2_w 8356150682199997392
      // 10c: lload 4
      // 10e: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 119: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 11c: pop
      // 11d: aload 6
      // 11f: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 122: astore 15
      // 124: aload 14
      // 126: ifnonnull 0b1
      // 129: aload 6
      // 12b: ldc2_w 8433700204393990698
      // 12e: lload 4
      // 130: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: lload 4
      // 137: lconst_0
      // 138: lcmp
      // 139: ifle 124
      // 13c: goto 170
      // 13f: astore 18
      // 141: goto 170
      // 144: astore 18
      // 146: aload 6
      // 148: ldc2_w 8433700204393990698
      // 14b: lload 4
      // 14d: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: goto 170
      // 155: astore 18
      // 157: goto 170
      // 15a: astore 19
      // 15c: aload 6
      // 15e: ldc2_w 8433700204393990698
      // 161: lload 4
      // 163: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: goto 16d
      // 16b: astore 20
      // 16d: aload 19
      // 16f: athrow
      // 170: lload 4
      // 172: lconst_0
      // 173: lcmp
      // 174: ifle 1ca
      // 177: aload 15
      // 179: ifnull 19a
      // 17c: aload 16
      // 17e: ldc2_w 7587186831938013645
      // 181: lload 4
      // 183: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 18b: pop
      // 18c: goto 19a
      // 18f: ldc2_w 8351070256938048702
      // 192: lload 4
      // 194: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: aload 0
      // 19b: ldc2_w 8462327515175608226
      // 19e: lload 4
      // 1a0: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/JTextArea; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: aload 16
      // 1a7: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1aa: ldc2_w 7704932019881583147
      // 1ad: lload 4
      // 1af: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: aload 0
      // 1b5: ldc2_w 8462327515175608226
      // 1b8: lload 4
      // 1ba: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/JTextArea; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: bipush 0
      // 1c0: ldc2_w 7560557793444208193
      // 1c3: lload 4
      // 1c5: invokedynamic i (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: return
   }

   static {
      long var20 = b ^ 76094858253338L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[2];
      int var17 = 0;
      String var16 = "\u001cÈi\u0006Ð%ëCfñî3ÍÕ`}\u0010ØtÓ\u0097î§$]=\u009d¬\u0089i\u008bþ\u0095";
      int var18 = "\u001cÈi\u0006Ð%ëCfñî3ÍÕ`}\u0010ØtÓ\u0097î§$]=\u009d¬\u0089i\u008bþ\u0095".length();
      char var15 = 16;
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var27 = b(var19).intern();
         int var10001 = -1;
         var11[var17++] = var27;
         if ((var14 += var15) >= var18) {
            r = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "lbçÕ\bñ¤\u009cÒ\u008aé\u000eX\u001ag\u009a";
            int var5 = "lbçÕ\bñ¤\u009cÒ\u008aé\u000eX\u001ag\u009a".length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               var10001 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(
                  new byte[]{
                     (byte)((int)(var8 >>> 56)),
                     (byte)((int)(var8 >>> 48)),
                     (byte)((int)(var8 >>> 40)),
                     (byte)((int)(var8 >>> 32)),
                     (byte)((int)(var8 >>> 24)),
                     (byte)((int)(var8 >>> 16)),
                     (byte)((int)(var8 >>> 8)),
                     (byte)((int)var8)
                  }
               );
               long var10004 = ((long)var10[0] & 255L) << 56
                  | ((long)var10[1] & 255L) << 48
                  | ((long)var10[2] & 255L) << 40
                  | ((long)var10[3] & 255L) << 32
                  | ((long)var10[4] & 255L) << 24
                  | ((long)var10[5] & 255L) << 16
                  | ((long)var10[6] & 255L) << 8
                  | (long)var10[7] & 255L;
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            p = var6;
            q = new Integer[2];
            u = x44.a<"k">(-6209250248962285069L, var20)
               + x44.a<"k">(-6209250248962285069L, var20)
               + var11[0]
               + d<"b">(6334, 133820082824209757L ^ var20)
               + var11[1];
            return;
         }

         var15 = var16.charAt(var14);
      }
   }

   protected abstract void e(Object[] var1);

   private static IOException a(IOException var0) {
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

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24315;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/s9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/s9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
