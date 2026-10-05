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

public class _rk {
   private static final int f;
   private static final String P;
   private static final long a = ess.a(6290057190026894320L, 5572223278390060981L, MethodHandles.lookup().lookupClass()).a(238473755957403L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   static {
      long var20 = a ^ 139507812785647L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[3];
      int var16 = 0;
      String var15 = "F\u009bT\u001cp\tè.ðH( Úæxä:\u0013îÌuÙ·\u009a\u0085T\u000bI¶¦\u0081\u0005\u0010¸ßÀvf®\u009eå,Üµ¢¡±à(Oj¨?\u009a\u0015²\u0018pbr¼ÿK\n.\u0015\u008f\u0099ªÆ°ü#Ç5ç&¸\u008f«\u0003¤\u0091ðaXG\u0084\u0015\u00100÷¹HAÙ\r¶p´i\u0013Å\u0084\u009bñ";
      int var17 = "F\u009bT\u001cp\tè.ðH( Úæxä:\u0013îÌuÙ·\u009a\u0085T\u000bI¶¦\u0081\u0005\u0010¸ßÀvf®\u009eå,Üµ¢¡±à(Oj¨?\u009a\u0015²\u0018pbr¼ÿK\n.\u0015\u008f\u0099ªÆ°ü#Ç5ç&¸\u008f«\u0003¤\u0091ðaXG\u0084\u0015\u00100÷¹HAÙ\r¶p´i\u0013Å\u0084\u009bñ"
         .length();
      char var14 = '0';
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var31 = a(var19).intern();
         int var10001 = -1;
         var18[var16++] = var31;
         if ((var13 += var14) >= var17) {
            b = var18;
            c = new String[3];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[33];
            int var3 = 0;
            String var4 = "oõ\u0014\u001cÙ¹\u0081\u0007\u009c\u0011È\u0014\u0096{\rCG_¯\u0092=c^ýF6`àµ}À|KÈ8g¿¸å.7Ã\u0094u²Ó¿\f¸@.gãJ5O\u001fß\u001c\u001c¸<\u001c\næ\u008c¨ø£Z¢I°ý*±@'òÿâû_ù\u0011Í£H»°EÙ\u008f<µªÁ\u0088RKIIò\u0099ï\u008f\u0083ðè×åÝ,å\f\fñÈ§:o~\u008e\u0016éÿBiÒ©\u0091\u009cDV$\u0081ÍFµYry5\u0089\u000b}ÆB\u0093r-ü\u0012 Õæqôs¤JÃ\u0015z¨â\u0014\u0010UãÌ>Ao°õñë)\t¯ÿ³\u00105ö½Ô&&\u0091Óá_jÓ\u0013\u0010ÍÖ#DÀ}|\u0018R¼z!\u000f\u0090Ðeå\fÞ\u0005\u0010\u0089¸«\tì\u0099[ðÃ\u008b\u0016))¨7£¨lÍ}ôr°L[Ñ\fÞB";
            int var5 = "oõ\u0014\u001cÙ¹\u0081\u0007\u009c\u0011È\u0014\u0096{\rCG_¯\u0092=c^ýF6`àµ}À|KÈ8g¿¸å.7Ã\u0094u²Ó¿\f¸@.gãJ5O\u001fß\u001c\u001c¸<\u001c\næ\u008c¨ø£Z¢I°ý*±@'òÿâû_ù\u0011Í£H»°EÙ\u008f<µªÁ\u0088RKIIò\u0099ï\u008f\u0083ðè×åÝ,å\f\fñÈ§:o~\u008e\u0016éÿBiÒ©\u0091\u009cDV$\u0081ÍFµYry5\u0089\u000b}ÆB\u0093r-ü\u0012 Õæqôs¤JÃ\u0015z¨â\u0014\u0010UãÌ>Ao°õñë)\t¯ÿ³\u00105ö½Ô&&\u0091Óá_jÓ\u0013\u0010ÍÖ#DÀ}|\u0018R¼z!\u000f\u0090Ðeå\fÞ\u0005\u0010\u0089¸«\tì\u0099[ðÃ\u008b\u0016))¨7£¨lÍ}ôr°L[Ñ\fÞB"
               .length();
            byte var2 = 0;

            label32:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var26 = var6;
               var10001 = var3++;
               long var34 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var37 = -1;

               while (true) {
                  long var8 = var34;
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
                  long var39 = ((long)var10[0] & 255L) << 56
                     | ((long)var10[1] & 255L) << 48
                     | ((long)var10[2] & 255L) << 40
                     | ((long)var10[3] & 255L) << 32
                     | ((long)var10[4] & 255L) << 24
                     | ((long)var10[5] & 255L) << 16
                     | ((long)var10[6] & 255L) << 8
                     | (long)var10[7] & 255L;
                  switch (var37) {
                     case 0:
                        var26[var10001] = var39;
                        if (var2 >= var5) {
                           e = var6;
                           g = new Integer[33];
                           P = x44.a<"v">(a<"g">(1218, 2247485536759979633L ^ var20), -407678604650220217L, var20);
                           String[] var22 = x44.a<"n">(
                              x44.a<"o">(-2232755036661037936L, var20), a<"g">(11984, 735397222936294496L ^ var20), -164719717311721364L, var20
                           );
                           f = Integer.parseInt(var22[0]);
                           return;
                        }
                        break;
                     default:
                        var26[var10001] = var39;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "¦±}·\u0007öþ5}äÌ^f8Ç²";
                        var5 = "¦±}·\u0007öþ5}äÌ^f8Ç²".length();
                        var2 = 0;
                  }

                  byte var30 = var2;
                  var2 += 8;
                  var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                  var26 = var6;
                  var10001 = var3++;
                  var34 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var37 = 0;
               }
            }
         }

         var14 = var15.charAt(var13);
      }
   }

   public static boolean v(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 1
      // 15: pop
      // 16: getstatic com/zelix/_rk.a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: ldc2_w -4055788774043623758
      // 1f: lload 1
      // 20: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 3
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 5871
      // 30: ldc2_w 694544729515065947
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w -4248347625880566272
      // 43: lload 1
      // 44: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w -4248347625880566272
      // 51: lload 1
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean w(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/_rk.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w -519936138320289332
      // 1f: lload 2
      // 20: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 25896
      // 30: ldc2_w 529334223103774463
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w -399422781330491010
      // 43: lload 2
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w -399422781330491010
      // 51: lload 2
      // 52: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean g(long param0, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_rk.a J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: ldc2_w 4252774030581637632
      // 09: lload 0
      // 0a: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: iload 2
      // 11: aload 3
      // 12: ifnonnull 40
      // 15: sipush 32754
      // 18: ldc2_w 8855452010322204643
      // 1b: lload 0
      // 1c: lxor
      // 1d: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: if_icmplt 43
      // 25: goto 32
      // 28: ldc2_w 4159290568159804082
      // 2b: lload 0
      // 2c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: bipush 1
      // 33: goto 40
      // 36: ldc2_w 4159290568159804082
      // 39: lload 0
      // 3a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   public static int E(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return x44.a<"j">(-8275841055789672983L, var1);
   }

   public static boolean C(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/_rk.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w -1458139592134298937
      // 15: lload 1
      // 16: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 3
      // 1c: ldc2_w -880704278305805560
      // 1f: lload 1
      // 20: invokedynamic k (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 3
      // 26: ifnonnull 54
      // 29: sipush 30347
      // 2c: ldc2_w 8877278598535990855
      // 2f: lload 1
      // 30: lxor
      // 31: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmplt 57
      // 39: goto 46
      // 3c: ldc2_w -1621434358080869771
      // 3f: lload 1
      // 40: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w -1621434358080869771
      // 4d: lload 1
      // 4e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public static boolean U(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 1
      // 15: pop
      // 16: getstatic com/zelix/_rk.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w 7381653256605433716
      // 1f: lload 2
      // 20: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 25009
      // 30: ldc2_w 1730070414409684181
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w 7263392814242555846
      // 43: lload 2
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w 7263392814242555846
      // 51: lload 2
      // 52: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean e(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/_rk.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w 5662646348035872657
      // 15: lload 1
      // 16: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 3
      // 1c: ldc2_w 6237902464127585886
      // 1f: lload 1
      // 20: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 3
      // 26: ifnonnull 54
      // 29: sipush 7014
      // 2c: ldc2_w 504847101049734901
      // 2f: lload 1
      // 30: lxor
      // 31: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmplt 57
      // 39: goto 46
      // 3c: ldc2_w 5488169507963293475
      // 3f: lload 1
      // 40: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w 5488169507963293475
      // 4d: lload 1
      // 4e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public static boolean a(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/_rk.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w -2187708626139678553
      // 15: lload 1
      // 16: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 3
      // 1c: ldc2_w -457384208735772312
      // 1f: lload 1
      // 20: invokedynamic k (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 3
      // 26: ifnonnull 54
      // 29: sipush 25896
      // 2c: ldc2_w 529437826529089428
      // 2f: lload 1
      // 30: lxor
      // 31: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmplt 57
      // 39: goto 46
      // 3c: ldc2_w -2080780303923814379
      // 3f: lload 1
      // 40: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w -2080780303923814379
      // 4d: lload 1
      // 4e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public static boolean j(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/_rk.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w 8448941132827356228
      // 1f: lload 2
      // 20: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 13940
      // 30: ldc2_w 8651004616076431404
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w 8645940402299565302
      // 43: lload 2
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w 8645940402299565302
      // 51: lload 2
      // 52: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static int T(Object[] param0) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 2
      // 015: pop
      // 016: getstatic com/zelix/_rk.a J
      // 019: lload 2
      // 01a: lxor
      // 01b: lstore 2
      // 01c: ldc2_w -84864476839548970
      // 01f: lload 2
      // 020: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: astore 4
      // 027: iload 1
      // 028: aload 4
      // 02a: ifnonnull 074
      // 02d: bipush 1
      // 02e: if_icmpge 073
      // 031: goto 03e
      // 034: ldc2_w -257083428980981916
      // 037: lload 2
      // 038: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: athrow
      // 03e: new java/lang/IllegalArgumentException
      // 041: dup
      // 042: new java/lang/StringBuilder
      // 045: dup
      // 046: invokespecial java/lang/StringBuilder.<init> ()V
      // 049: sipush 10418
      // 04c: ldc2_w 600104285584633389
      // 04f: lload 2
      // 050: lxor
      // 051: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/_rk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 059: iload 1
      // 05a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 05d: ldc "'"
      // 05f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 062: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 065: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 068: athrow
      // 069: ldc2_w -257083428980981916
      // 06c: lload 2
      // 06d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: iload 1
      // 074: aload 4
      // 076: ifnonnull 26b
      // 079: tableswitch 485 1 25 125 149 163 177 191 205 219 233 247 261 275 289 303 317 331 345 359 373 387 401 415 429 443 457 471
      // 0ec: ldc2_w -257083428980981916
      // 0ef: lload 2
      // 0f0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: sipush 18486
      // 0f9: ldc2_w 4928982445930931690
      // 0fc: lload 2
      // 0fd: lxor
      // 0fe: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: ireturn
      // 104: ldc2_w -257083428980981916
      // 107: lload 2
      // 108: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: sipush 10196
      // 111: ldc2_w 5358336485239556614
      // 114: lload 2
      // 115: lxor
      // 116: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: ireturn
      // 11c: sipush 9190
      // 11f: ldc2_w 3631715298561363491
      // 122: lload 2
      // 123: lxor
      // 124: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: ireturn
      // 12a: sipush 19273
      // 12d: ldc2_w 2244445117314131603
      // 130: lload 2
      // 131: lxor
      // 132: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: ireturn
      // 138: sipush 5628
      // 13b: ldc2_w 4700958799407003703
      // 13e: lload 2
      // 13f: lxor
      // 140: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: ireturn
      // 146: sipush 18374
      // 149: ldc2_w 2469733913063025166
      // 14c: lload 2
      // 14d: lxor
      // 14e: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: ireturn
      // 154: sipush 11144
      // 157: ldc2_w 8515605229775521356
      // 15a: lload 2
      // 15b: lxor
      // 15c: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: ireturn
      // 162: sipush 4604
      // 165: ldc2_w 3149083000728632370
      // 168: lload 2
      // 169: lxor
      // 16a: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: ireturn
      // 170: sipush 2911
      // 173: ldc2_w 213612454039103111
      // 176: lload 2
      // 177: lxor
      // 178: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: ireturn
      // 17e: sipush 31318
      // 181: ldc2_w 6134085363951884180
      // 184: lload 2
      // 185: lxor
      // 186: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: ireturn
      // 18c: sipush 19902
      // 18f: ldc2_w 7415148355035324513
      // 192: lload 2
      // 193: lxor
      // 194: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: ireturn
      // 19a: sipush 21790
      // 19d: ldc2_w 154622149706053854
      // 1a0: lload 2
      // 1a1: lxor
      // 1a2: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: ireturn
      // 1a8: sipush 11383
      // 1ab: ldc2_w 843843906637169086
      // 1ae: lload 2
      // 1af: lxor
      // 1b0: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: ireturn
      // 1b6: sipush 8174
      // 1b9: ldc2_w 4162776443406660157
      // 1bc: lload 2
      // 1bd: lxor
      // 1be: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: ireturn
      // 1c4: sipush 7831
      // 1c7: ldc2_w 4039400905196614465
      // 1ca: lload 2
      // 1cb: lxor
      // 1cc: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: ireturn
      // 1d2: sipush 31910
      // 1d5: ldc2_w 185330038478655859
      // 1d8: lload 2
      // 1d9: lxor
      // 1da: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: ireturn
      // 1e0: sipush 20443
      // 1e3: ldc2_w 2824650800624787991
      // 1e6: lload 2
      // 1e7: lxor
      // 1e8: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: ireturn
      // 1ee: sipush 6980
      // 1f1: ldc2_w 172625204124137107
      // 1f4: lload 2
      // 1f5: lxor
      // 1f6: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: ireturn
      // 1fc: sipush 30347
      // 1ff: ldc2_w 8877237156429519702
      // 202: lload 2
      // 203: lxor
      // 204: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: ireturn
      // 20a: sipush 7038
      // 20d: ldc2_w 3053505892190664352
      // 210: lload 2
      // 211: lxor
      // 212: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: ireturn
      // 218: sipush 10471
      // 21b: ldc2_w 8645012165767496996
      // 21e: lload 2
      // 21f: lxor
      // 220: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: ireturn
      // 226: sipush 22016
      // 229: ldc2_w 6400495002759920603
      // 22c: lload 2
      // 22d: lxor
      // 22e: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: ireturn
      // 234: sipush 15193
      // 237: ldc2_w 3823416264828393096
      // 23a: lload 2
      // 23b: lxor
      // 23c: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: ireturn
      // 242: sipush 30574
      // 245: ldc2_w 8456786334503459464
      // 248: lload 2
      // 249: lxor
      // 24a: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: ireturn
      // 250: sipush 26760
      // 253: ldc2_w 8327869671562822985
      // 256: lload 2
      // 257: lxor
      // 258: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: ireturn
      // 25e: sipush 9572
      // 261: ldc2_w 8183009600692684989
      // 264: lload 2
      // 265: lxor
      // 266: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: ireturn
   }

   public static boolean M(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: pop
      // 16: getstatic com/zelix/_rk.a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: ldc2_w 621172977811788186
      // 1f: lload 1
      // 20: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 3
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 2911
      // 30: ldc2_w 213567868074152139
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w 730425669486643496
      // 43: lload 1
      // 44: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w 730425669486643496
      // 51: lload 1
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean J(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: pop
      // 16: getstatic com/zelix/_rk.a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: ldc2_w -2095027244481905688
      // 1f: lload 1
      // 20: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 3
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: sipush 32121
      // 30: ldc2_w 4482190370896432264
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic v (IJ)I bsm=com/zelix/_rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmplt 5b
      // 3d: goto 4a
      // 40: ldc2_w -2283096188976831654
      // 43: lload 1
      // 44: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 58
      // 4e: ldc2_w -2283096188976831654
      // 51: lload 1
      // 52: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27287;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_rk", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/_rk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16846;
      if (g[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_rk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_rk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
