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

public class n {
   public static final n Z;
   public static final n S;
   public static final n d;
   public static final n D;
   public static final n u;
   public static final n C;
   public static final n v;
   public static final n c;
   public static final n o;
   public static final n e;
   public static final n z;
   private static Map N;
   public static final n f;
   public static final n s;
   public static final n Y;
   public static final n h;
   public static final n J;
   public static final n l;
   public static final n b;
   private static _ro L;
   public static final n H;
   public static final n I;
   public static final n w;
   public static final n g;
   private static n[] W;
   private final String X;
   public static final n n;
   public static final n Q;
   public static final n R;
   private static final long i = ess.a(6949592424530389524L, -596292779525739756L, MethodHandles.lookup().lookupClass()).a(103957438331613L);
   private static final String[] j;
   private static final String[] k;
   private static final Map m = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public boolean s(String var1) {
      return this.X.endsWith(var1);
   }

   protected n(String var1) {
      this.X = var1;
   }

   public n M(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/n.i J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 99503485664406
      // 0b: lxor
      // 0c: dup2
      // 0d: bipush 48
      // 0f: lushr
      // 10: l2i
      // 11: istore 3
      // 12: dup2
      // 13: bipush 16
      // 15: lshl
      // 16: bipush 48
      // 18: lushr
      // 19: l2i
      // 1a: istore 4
      // 1c: dup2
      // 1d: bipush 32
      // 1f: lshl
      // 20: bipush 32
      // 22: lushr
      // 23: l2i
      // 24: istore 5
      // 26: pop2
      // 27: pop2
      // 28: ldc2_w -2467171648839597152
      // 2b: lload 1
      // 2c: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: istore 6
      // 33: aload 0
      // 34: getfield com/zelix/n.X Ljava/lang/String;
      // 37: bipush 0
      // 38: invokevirtual java/lang/String.charAt (I)C
      // 3b: iload 6
      // 3d: ifeq 97
      // 40: sipush 2532
      // 43: ldc2_w 9192914046350509768
      // 46: lload 1
      // 47: lxor
      // 48: invokedynamic g (IJ)I bsm=com/zelix/n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: if_icmpne 7c
      // 50: goto 5d
      // 53: ldc2_w -4556310043914847685
      // 56: lload 1
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield com/zelix/n.X Ljava/lang/String;
      // 61: bipush 1
      // 62: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 65: iload 3
      // 66: i2c
      // 67: swap
      // 68: iload 4
      // 6a: i2s
      // 6b: swap
      // 6c: iload 5
      // 6e: invokestatic com/zelix/n.s (CSLjava/lang/String;I)Lcom/zelix/n;
      // 71: areturn
      // 72: ldc2_w -4556310043914847685
      // 75: lload 1
      // 76: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 0
      // 7d: iload 6
      // 7f: ifeq 9d
      // 82: getfield com/zelix/n.X Ljava/lang/String;
      // 85: ldc "n"
      // 87: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 8a: goto 97
      // 8d: ldc2_w -4556310043914847685
      // 90: lload 1
      // 91: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: ifeq 9e
      // 9a: getstatic com/zelix/n.I Lcom/zelix/n;
      // 9d: areturn
      // 9e: aconst_null
      // 9f: areturn
   }

   public boolean S(Object[] var1) {
      return this.X.equals("?");
   }

   public boolean o() {
      return true;
   }

   public String j() {
      return this.X;
   }

   public static n W(int param0, String param1, int param2, short param3, boolean param4, _ob param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 0
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: getstatic com/zelix/n.i J
      // 1a: lxor
      // 1b: lstore 6
      // 1d: aconst_null
      // 1e: astore 8
      // 20: aload 1
      // 21: invokevirtual java/lang/String.length ()I
      // 24: bipush 2
      // 25: if_icmple 4b
      // 28: aload 1
      // 29: sipush 4459
      // 2c: ldc2_w 8280266689713601920
      // 2f: lload 6
      // 31: lxor
      // 32: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3a: ifeq 59
      // 3d: goto 4b
      // 40: ldc2_w -8529874528879611040
      // 43: lload 6
      // 45: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: getstatic com/zelix/n.N Ljava/util/Map;
      // 4e: aload 1
      // 4f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 54: checkcast com/zelix/n
      // 57: astore 8
      // 59: aload 8
      // 5b: iload 0
      // 5c: iflt d8
      // 5f: ifnonnull d6
      // 62: aload 5
      // 64: ifnonnull ca
      // 67: goto 75
      // 6a: ldc2_w -8529874528879611040
      // 6d: lload 6
      // 6f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: iload 4
      // 77: ifeq bc
      // 7a: goto 88
      // 7d: ldc2_w -8529874528879611040
      // 80: lload 6
      // 82: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: getstatic com/zelix/n.L Lcom/zelix/_ro;
      // 8b: aload 1
      // 8c: invokevirtual com/zelix/_ro.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 8f: checkcast com/zelix/n
      // 92: astore 8
      // 94: aload 8
      // 96: iload 0
      // 97: ifle d8
      // 9a: ifnonnull d6
      // 9d: new com/zelix/n
      // a0: dup
      // a1: aload 1
      // a2: invokespecial com/zelix/n.<init> (Ljava/lang/String;)V
      // a5: astore 8
      // a7: getstatic com/zelix/n.L Lcom/zelix/_ro;
      // aa: aload 1
      // ab: aload 8
      // ad: ldc2_w -7661504177095294434
      // b0: lload 6
      // b2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: pop
      // b8: iload 0
      // b9: ifge d6
      // bc: new com/zelix/f
      // bf: dup
      // c0: aload 1
      // c1: invokespecial com/zelix/f.<init> (Ljava/lang/String;)V
      // c4: astore 8
      // c6: iload 0
      // c7: ifgt d6
      // ca: new com/zelix/k
      // cd: dup
      // ce: aload 1
      // cf: aload 5
      // d1: invokespecial com/zelix/k.<init> (Ljava/lang/String;Lcom/zelix/_ob;)V
      // d4: astore 8
      // d6: aload 8
      // d8: areturn
   }

   public static n x(String var0, boolean var1, long var2) {
      var2 = i ^ var2;
      long var10001 = var2 ^ 21947425436905L;
      int var4 = (int)((var2 ^ 21947425436905L) >>> 32);
      int var5 = (int)((var2 ^ 21947425436905L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return W(var4, var0, var5, (short)var6, var1, null);
   }

   static {
      long var20 = i ^ 74352685804042L;
      long var10001 = var20 ^ 101447047766693L;
      int var22 = (int)((var20 ^ 101447047766693L) >>> 48);
      int var23 = (int)((var20 ^ 101447047766693L) << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      long var25 = var20 ^ 13564314138469L;
      long var27 = var20 ^ 112351124442837L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[25];
      int var16 = 0;
      String var15 = "÷\\ÓÀ»UöZÌo¥}6\u001aê\u0094îbÕ´&3RNö^ömrý)º6\u001fÞé,\u0082B\t\u0010\u0088\u0092\u0014:ü\u0015/\u0094ßÐ×h\b'\u009eÏ }\u0000ox¦Ñ96\u0019ä´ÉÌi\u009dÉâýº0zm\u0017àè\u0012²j$Ý´T\u0010\u0001Ë3ðúTZ\u0085ÜTÇF.H\u0091ì\u0010Ë\u00889âóf\u0081À\r+\u001aÛw¤\u0086y\u0010B\b\u0099©\u0083\u0095ª^\u0002!\u0097Qòä\u0010Â\u0010ncz\n²©R³¿\u0098[UN$yí(zî\u008a¼\rµ`éY\u0017\u0097ÿµÙ¾}\u0007iÓ7\u0015\u0080 xÚ\u0019ÁZ;¬ãX¸²û§¼©´\u008f\u0010ù\u001f\u0004~Rö;%ãåT ÞCFÕ\u0010&ö_Ògó\u009bÔ¾\u0084Ã¨Èú\u008fï\u0010\u009aâ\u0013ó\u009c\u00adjY=\u0081Ïà\f=V\u009d\u0010Ã´ÒDÄ\u0004x\u0087íJæ\u000ftb¥ð\u0010Ü¿\u009d7Z×0ïr©ýÎqÃ\u0095\u0080\u0010ô\u0016å\u0001\\Ç\f*'þ\u0013\u0012ÖIL]\u0010fV¼\u0016?g®\u0094.·n\u009e\u0015 }\b(;1]\u000e¢RI\u00184,æ\u0000ÎÆ\u008eaÌ)ÀVõ\u0081&¢Èn?V\u0081¸\u0089Ã/aÆ5^öÎN\u0010\u000biªe\u009c¸ä\u008c ¿á8.£^\u0083(=È\u0081ÑÄ\u008bôÛ\u0005óP;\u0019\u009f\u009eïN×ï±Ïw\u0000>\f^Üß\u009d½\u0088)ª.ÿdc\u007fzÅ\u0010Pô?:\u008e\u0097Ðyû¥\u008fÈFÙõí\u0010\u0098q\n¯)0jtc\u0094Gn.RÑ\u000f\u0010'ÍjÈ2\u0085m\u0011\fx¶¯iôq=\u0010ßÆµRY\u0003ð;\u008dDGFÏ¹8\u0011 \nz\u0083zà°¬<\u0011\u001c\t5miâG\\OÔ\u008a»Q+#W\u0087YÆ.\u001dõÿ";
      int var17 = "÷\\ÓÀ»UöZÌo¥}6\u001aê\u0094îbÕ´&3RNö^ömrý)º6\u001fÞé,\u0082B\t\u0010\u0088\u0092\u0014:ü\u0015/\u0094ßÐ×h\b'\u009eÏ }\u0000ox¦Ñ96\u0019ä´ÉÌi\u009dÉâýº0zm\u0017àè\u0012²j$Ý´T\u0010\u0001Ë3ðúTZ\u0085ÜTÇF.H\u0091ì\u0010Ë\u00889âóf\u0081À\r+\u001aÛw¤\u0086y\u0010B\b\u0099©\u0083\u0095ª^\u0002!\u0097Qòä\u0010Â\u0010ncz\n²©R³¿\u0098[UN$yí(zî\u008a¼\rµ`éY\u0017\u0097ÿµÙ¾}\u0007iÓ7\u0015\u0080 xÚ\u0019ÁZ;¬ãX¸²û§¼©´\u008f\u0010ù\u001f\u0004~Rö;%ãåT ÞCFÕ\u0010&ö_Ògó\u009bÔ¾\u0084Ã¨Èú\u008fï\u0010\u009aâ\u0013ó\u009c\u00adjY=\u0081Ïà\f=V\u009d\u0010Ã´ÒDÄ\u0004x\u0087íJæ\u000ftb¥ð\u0010Ü¿\u009d7Z×0ïr©ýÎqÃ\u0095\u0080\u0010ô\u0016å\u0001\\Ç\f*'þ\u0013\u0012ÖIL]\u0010fV¼\u0016?g®\u0094.·n\u009e\u0015 }\b(;1]\u000e¢RI\u00184,æ\u0000ÎÆ\u008eaÌ)ÀVõ\u0081&¢Èn?V\u0081¸\u0089Ã/aÆ5^öÎN\u0010\u000biªe\u009c¸ä\u008c ¿á8.£^\u0083(=È\u0081ÑÄ\u008bôÛ\u0005óP;\u0019\u009f\u009eïN×ï±Ïw\u0000>\f^Üß\u009d½\u0088)ª.ÿdc\u007fzÅ\u0010Pô?:\u008e\u0097Ðyû¥\u008fÈFÙõí\u0010\u0098q\n¯)0jtc\u0094Gn.RÑ\u000f\u0010'ÍjÈ2\u0085m\u0011\fx¶¯iôq=\u0010ßÆµRY\u0003ð;\u008dDGFÏ¹8\u0011 \nz\u0083zà°¬<\u0011\u001c\t5miâG\\OÔ\u008a»Q+#W\u0087YÆ.\u001dõÿ"
         .length();
      char var14 = '(';
      int var30 = -1;

      label45:
      while (true) {
         String var31 = var15.substring(++var30, var30 + var14);
         byte var34 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var41 = a(var19).intern();
            switch (var34) {
               case 0:
                  var18[var16++] = var41;
                  if ((var30 += var14) >= var17) {
                     j = var18;
                     k = new String[25];
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
                     String var4 = "\u0017\u009a±§.Ãnå\u0000\u0096\u0085\u0017\tR¤G";
                     int var5 = "\u0017\u009a±§.Ãnå\u0000\u0096\u0085\u0017\tR¤G".length();
                     byte var2 = 0;

                     do {
                        byte var38 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                        int var39 = var3++;
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
                        byte var46 = -1;
                        var6[var39] = var10004;
                     } while (var2 < var5);

                     p = var6;
                     q = new Integer[2];
                     N = x44.a<"u">(new Object[]{var27}, -8995438089760119482L, var20);
                     L = new _ro(var25, a<"a">(23118, 959398692474560962L ^ var20));
                     W = new n[0];
                     N.put("B", new n("B"));
                     N.put("Z", new n("Z"));
                     N.put("C", new n("C"));
                     N.put("S", new n("S"));
                     N.put("I", new n("I"));
                     N.put("F", new n("F"));
                     N.put("J", new n("J"));
                     N.put("D", new n("D"));
                     N.put("?", new n("?"));
                     N.put("n", new n("n"));
                     N.put("~", new n("~"));
                     N.put(a<"a">(10308, 4829126379862578129L ^ var20), new n(a<"a">(16136, 7728604323124266140L ^ var20)));
                     N.put(a<"a">(18872, 2757502015438729776L ^ var20), new n(a<"a">(31220, 2669361162273292925L ^ var20)));
                     N.put(a<"a">(20787, 2281055226719709881L ^ var20), new n(a<"a">(32502, 3303130929309615474L ^ var20)));
                     N.put(a<"a">(14399, 3830883533830276031L ^ var20), new n(a<"a">(22302, 7129107439402658952L ^ var20)));
                     N.put(a<"a">(31794, 3315819830972942261L ^ var20), new n(a<"a">(1344, 3711078739511672525L ^ var20)));
                     N.put(a<"a">(16884, 613236669375396465L ^ var20), new n(a<"a">(31916, 5352989862067701565L ^ var20)));
                     N.put(a<"a">(14348, 8101585968149742478L ^ var20), new n(a<"a">(8810, 6313855124121934305L ^ var20)));
                     N.put(a<"a">(16229, 459259377812522218L ^ var20), new n(a<"a">(24739, 7187026482817145649L ^ var20)));
                     N.put(a<"a">(12983, 171681018286262560L ^ var20), new n(a<"a">(4459, 8280181252609796840L ^ var20)));
                     b = s((char)var22, (short)var23, "B", var24);
                     z = s((char)var22, (short)var23, "Z", var24);
                     S = s((char)var22, (short)var23, "C", var24);
                     h = s((char)var22, (short)var23, "S", var24);
                     n = s((char)var22, (short)var23, "I", var24);
                     D = s((char)var22, (short)var23, "J", var24);
                     o = s((char)var22, (short)var23, "F", var24);
                     c = s((char)var22, (short)var23, "D", var24);
                     Y = s((char)var22, (short)var23, "?", var24);
                     I = s((char)var22, (short)var23, "n", var24);
                     l = s((char)var22, (short)var23, "~", var24);
                     e = s((char)var22, (short)var23, a<"a">(4459, 8280181252609796840L ^ var20), var24);
                     g = s((char)var22, (short)var23, a<"a">(5423, 7030272872848977582L ^ var20), var24);
                     v = s((char)var22, (short)var23, a<"a">(3190, 1481319346067109880L ^ var20), var24);
                     Z = s((char)var22, (short)var23, a<"a">(23668, 3830332016487344100L ^ var20), var24);
                     Q = s((char)var22, (short)var23, a<"a">(8110, 6312172023586350120L ^ var20), var24);
                     R = s((char)var22, (short)var23, a<"a">(27144, 8197759330249806225L ^ var20), var24);
                     H = s((char)var22, (short)var23, a<"a">(16136, 7728604323124266140L ^ var20), var24);
                     w = s((char)var22, (short)var23, a<"a">(31220, 2669361162273292925L ^ var20), var24);
                     f = s((char)var22, (short)var23, a<"a">(32502, 3303130929309615474L ^ var20), var24);
                     u = s((char)var22, (short)var23, a<"a">(22302, 7129107439402658952L ^ var20), var24);
                     s = s((char)var22, (short)var23, a<"a">(1344, 3711078739511672525L ^ var20), var24);
                     C = s((char)var22, (short)var23, a<"a">(8810, 6313855124121934305L ^ var20), var24);
                     J = s((char)var22, (short)var23, a<"a">(31916, 5352989862067701565L ^ var20), var24);
                     d = s((char)var22, (short)var23, a<"a">(24739, 7187026482817145649L ^ var20), var24);
                     return;
                  }

                  var14 = var15.charAt(var30);
                  break;
               default:
                  var18[var16++] = var41;
                  if ((var30 += var14) < var17) {
                     var14 = var15.charAt(var30);
                     continue label45;
                  }

                  var15 = "\u009fT5O¿\u009eæÈ\u009d\n©xs\u0088\u008fô \u008eðÏ¹û¢¾É.à¼áx¥¸}oðíãb\u0014\u001c²\u0093\u009f³E¨\u0091\u0086È";
                  var17 = "\u009fT5O¿\u009eæÈ\u009d\n©xs\u0088\u008fô \u008eðÏ¹û¢¾É.à¼áx¥¸}oðíãb\u0014\u001c²\u0093\u009f³E¨\u0091\u0086È".length();
                  var14 = 16;
                  var30 = -1;
            }

            var31 = var15.substring(++var30, var30 + var14);
            var34 = 0;
         }
      }
   }

   public boolean z(Object[] param1) {
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
      // 0c: getstatic com/zelix/n.i J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -5833914400174427797
      // 15: lload 2
      // 16: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getstatic com/zelix/n.b Lcom/zelix/n;
      // 21: iload 4
      // 23: ifeq 4d
      // 26: if_acmpeq d4
      // 29: goto 36
      // 2c: ldc2_w -5616092570033043216
      // 2f: lload 2
      // 30: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: ldc2_w -5504389012122439867
      // 3a: lload 2
      // 3b: invokedynamic l (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: goto 4d
      // 43: ldc2_w -5616092570033043216
      // 46: lload 2
      // 47: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: iload 4
      // 4f: lload 2
      // 50: lconst_0
      // 51: lcmp
      // 52: ifle 7b
      // 55: ifeq 79
      // 58: if_acmpeq d4
      // 5b: goto 68
      // 5e: ldc2_w -5616092570033043216
      // 61: lload 2
      // 62: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 0
      // 69: getstatic com/zelix/n.S Lcom/zelix/n;
      // 6c: goto 79
      // 6f: ldc2_w -5616092570033043216
      // 72: lload 2
      // 73: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: iload 4
      // 7b: lload 2
      // 7c: lconst_0
      // 7d: lcmp
      // 7e: iflt ad
      // 81: ifeq a5
      // 84: if_acmpeq d4
      // 87: goto 94
      // 8a: ldc2_w -5616092570033043216
      // 8d: lload 2
      // 8e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: aload 0
      // 95: getstatic com/zelix/n.h Lcom/zelix/n;
      // 98: goto a5
      // 9b: ldc2_w -5616092570033043216
      // 9e: lload 2
      // 9f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: lload 2
      // a6: lconst_0
      // a7: lcmp
      // a8: ifle d1
      // ab: iload 4
      // ad: ifeq d1
      // b0: if_acmpeq d4
      // b3: goto c0
      // b6: ldc2_w -5616092570033043216
      // b9: lload 2
      // ba: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: aload 0
      // c1: getstatic com/zelix/n.n Lcom/zelix/n;
      // c4: goto d1
      // c7: ldc2_w -5616092570033043216
      // ca: lload 2
      // cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: athrow
      // d1: if_acmpne e2
      // d4: bipush 1
      // d5: goto e3
      // d8: ldc2_w -5616092570033043216
      // db: lload 2
      // dc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e1: athrow
      // e2: bipush 0
      // e3: ireturn
   }

   public boolean T(String var1) {
      return this.X.equals(var1);
   }

   public boolean n(String var1) {
      return this.X.startsWith(var1);
   }

   public boolean U(Object[] var1) {
      return this.X.equals("n");
   }

   public static n s(char var0, short var1, String var2, int var3) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ i;
      long var6 = var4 ^ 88876598666760L;
      return x(var2, true, var6);
   }

   public String Y(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/n.i J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 80295063007191
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w 1765408541473211933
      // 11: lload 1
      // 12: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: new java/lang/StringBuffer
      // 1a: dup
      // 1b: invokespecial java/lang/StringBuffer.<init> ()V
      // 1e: astore 6
      // 20: istore 5
      // 22: aload 6
      // 24: aload 0
      // 25: getfield com/zelix/n.X Ljava/lang/String;
      // 28: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 2b: iload 5
      // 2d: ifeq 9c
      // 30: pop
      // 31: aload 0
      // 32: invokevirtual com/zelix/n.o ()Z
      // 35: ifne 9a
      // 38: goto 45
      // 3b: ldc2_w 394515647760629638
      // 3e: lload 1
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: lload 1
      // 46: lconst_0
      // 47: lcmp
      // 48: iflt 8d
      // 4b: aload 0
      // 4c: lload 3
      // 4d: invokevirtual com/zelix/n.P (J)Z
      // 50: ifeq 85
      // 53: goto 60
      // 56: ldc2_w 394515647760629638
      // 59: lload 1
      // 5a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 6
      // 62: sipush 22374
      // 65: ldc2_w 8410331935521552251
      // 68: lload 1
      // 69: lxor
      // 6a: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 72: pop
      // 73: iload 5
      // 75: ifne 9a
      // 78: goto 85
      // 7b: ldc2_w 394515647760629638
      // 7e: lload 1
      // 7f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: aload 6
      // 87: ldc "*"
      // 89: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 8c: pop
      // 8d: goto 9a
      // 90: ldc2_w 394515647760629638
      // 93: lload 1
      // 94: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: aload 6
      // 9c: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 9f: areturn
   }

   public boolean Y(long var1) {
      var1 = i ^ var1;

      try {
         if (this == l) {
            return true;
         }
      } catch (gj var3) {
         throw x44.a<"t">(var3, -56648206569372215L, var1);
      }

      return false;
   }

   @Override
   public int hashCode() {
      return this.X.hashCode();
   }

   public boolean P(long var1) {
      boolean var3 = x44.a<"t">(3803711974741827548L, var1);

      try {
         boolean var10000 = this.o();
         if (var3) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"t">(var4, 3075625269280624721L, var1);
      }

      return false;
   }

   public static n[] S(int param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/n.i J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -944448010776122234
      // 09: lload 1
      // 0a: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: iload 0
      // 11: iload 3
      // 12: ifeq 34
      // 15: ifne 33
      // 18: goto 25
      // 1b: ldc2_w -1161152607730526947
      // 1e: lload 1
      // 1f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: athrow
      // 25: getstatic com/zelix/n.W [Lcom/zelix/n;
      // 28: areturn
      // 29: ldc2_w -1161152607730526947
      // 2c: lload 1
      // 2d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: iload 0
      // 34: anewarray 50
      // 37: areturn
   }

   public int Z(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/n.i J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 112875090335754884
      // 09: lload 1
      // 0a: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 0
      // 11: getfield com/zelix/n.X Ljava/lang/String;
      // 14: ldc "J"
      // 16: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19: iload 3
      // 1a: ifne 58
      // 1d: ifne 57
      // 20: goto 2d
      // 23: ldc2_w 2303217700265977097
      // 26: lload 1
      // 27: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/zelix/n.X Ljava/lang/String;
      // 31: ldc "D"
      // 33: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 36: iload 3
      // 37: ifne 5a
      // 3a: goto 47
      // 3d: ldc2_w 2303217700265977097
      // 40: lload 1
      // 41: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: ifeq 59
      // 4a: goto 57
      // 4d: ldc2_w 2303217700265977097
      // 50: lload 1
      // 51: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: bipush 2
      // 58: ireturn
      // 59: bipush 1
      // 5a: ireturn
   }

   public static boolean Y(Object[] param0) {
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
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/n.i J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -5234756630777013169
      // 1c: lload 2
      // 1d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: invokevirtual java/lang/String.length ()I
      // 28: iload 4
      // 2a: ifne e7
      // 2d: bipush 1
      // 2e: if_icmpne e6
      // 31: goto 3e
      // 34: ldc2_w -6251621269131275326
      // 37: lload 2
      // 38: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 1
      // 3f: bipush 0
      // 40: invokevirtual java/lang/String.charAt (I)C
      // 43: iload 4
      // 45: ifne e5
      // 48: goto 55
      // 4b: ldc2_w -6251621269131275326
      // 4e: lload 2
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: lload 2
      // 56: lconst_0
      // 57: lcmp
      // 58: iflt d7
      // 5b: tableswitch 137 66 90 123 123 135 137 123 137 137 123 135 137 137 137 137 137 137 137 137 123 137 137 137 137 137 137 123
      // cc: ldc2_w -6251621269131275326
      // cf: lload 2
      // d0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: athrow
      // d6: bipush 0
      // d7: ireturn
      // d8: ldc2_w -6251621269131275326
      // db: lload 2
      // dc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e1: athrow
      // e2: bipush 1
      // e3: ireturn
      // e4: bipush 0
      // e5: ireturn
      // e6: bipush 0
      // e7: ireturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/n.i J
      // 03: ldc2_w 28689415427104
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 4520009371806520751
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/n
      // 17: iload 4
      // 19: ifne 9d
      // 1c: ifeq 9c
      // 1f: goto 2c
      // 22: ldc2_w 2368299199905913378
      // 25: lload 2
      // 26: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/n
      // 30: getfield com/zelix/n.X Ljava/lang/String;
      // 33: aload 0
      // 34: getfield com/zelix/n.X Ljava/lang/String;
      // 37: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3a: iload 4
      // 3c: ifne 70
      // 3f: goto 4c
      // 42: ldc2_w 2368299199905913378
      // 45: lload 2
      // 46: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: ifeq 9a
      // 4f: goto 5c
      // 52: ldc2_w 2368299199905913378
      // 55: lload 2
      // 56: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 1
      // 5d: checkcast com/zelix/n
      // 60: invokevirtual com/zelix/n.o ()Z
      // 63: goto 70
      // 66: ldc2_w 2368299199905913378
      // 69: lload 2
      // 6a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: iload 4
      // 72: ifne 97
      // 75: aload 0
      // 76: invokevirtual com/zelix/n.o ()Z
      // 79: if_icmpne 9a
      // 7c: goto 89
      // 7f: ldc2_w 2368299199905913378
      // 82: lload 2
      // 83: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 97
      // 8d: ldc2_w 2368299199905913378
      // 90: lload 2
      // 91: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: goto 9b
      // 9a: bipush 0
      // 9b: ireturn
      // 9c: bipush 0
      // 9d: ireturn
   }

   public boolean m(Object[] param1) {
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
      // 0c: getstatic com/zelix/n.i J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 1979924520083648623
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/n.X Ljava/lang/String;
      // 21: bipush 0
      // 22: invokevirtual java/lang/String.charAt (I)C
      // 25: iload 4
      // 27: ifne 55
      // 2a: sipush 32581
      // 2d: ldc2_w 2159326076676896177
      // 30: lload 2
      // 31: lxor
      // 32: invokedynamic g (IJ)I bsm=com/zelix/n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: if_icmpne 58
      // 3a: goto 47
      // 3d: ldc2_w 368650701723074530
      // 40: lload 2
      // 41: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: bipush 1
      // 48: goto 55
      // 4b: ldc2_w 368650701723074530
      // 4e: lload 2
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   public n S() {
      return new n(this.X);
   }

   public boolean n(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/n.i J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -7945674909894739282
      // 09: lload 1
      // 0a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 0
      // 11: getfield com/zelix/n.X Ljava/lang/String;
      // 14: ldc "L"
      // 16: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 19: iload 3
      // 1a: ifne 43
      // 1d: ifeq 5b
      // 20: goto 2d
      // 23: ldc2_w -8080331000473684701
      // 26: lload 1
      // 27: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/zelix/n.X Ljava/lang/String;
      // 31: ldc ";"
      // 33: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 36: goto 43
      // 39: ldc2_w -8080331000473684701
      // 3c: lload 1
      // 3d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: iload 3
      // 44: ifne 58
      // 47: ifeq 5b
      // 4a: goto 57
      // 4d: ldc2_w -8080331000473684701
      // 50: lload 1
      // 51: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: bipush 1
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public boolean c(Object[] param1) {
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
      // 0c: getstatic com/zelix/n.i J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 4016913600223422940
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getstatic com/zelix/n.D Lcom/zelix/n;
      // 21: iload 4
      // 23: ifeq 47
      // 26: if_acmpeq 4a
      // 29: goto 36
      // 2c: ldc2_w 3078375204341796935
      // 2f: lload 2
      // 30: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getstatic com/zelix/n.c Lcom/zelix/n;
      // 3a: goto 47
      // 3d: ldc2_w 3078375204341796935
      // 40: lload 2
      // 41: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: if_acmpne 58
      // 4a: bipush 1
      // 4b: goto 59
      // 4e: ldc2_w 3078375204341796935
      // 51: lload 2
      // 52: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30375;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/n", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("com/zelix/n" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7224;
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
            throw new RuntimeException("com/zelix/n", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
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
         throw new RuntimeException("com/zelix/n" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
