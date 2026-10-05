package com.zelix;

import java.io.DataOutputStream;
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

public class md extends xe implements _zv, rt {
   private boolean u;
   mx n;
   md f;
   static final w5 P;
   private static final long a = ess.a(-6995442997217476675L, -3609576138152233814L, MethodHandles.lookup().lookupClass()).a(156723855996745L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   public String C(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 100023681756774L;
      return "\"" + x44.a<"k">(this, var4, -1626695100374741949L, var2) + "\"";
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   protected void V(DataOutputStream param1, long param2, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 6273785328803656433
      // 03: lload 2
      // 04: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: aload 1
      // 0a: getstatic com/zelix/md.P Lcom/zelix/w5;
      // 0d: invokevirtual com/zelix/w5.l ()I
      // 10: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 13: astore 5
      // 15: aload 4
      // 17: aload 0
      // 18: getfield com/zelix/md.n Lcom/zelix/mx;
      // 1b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 20: checkcast com/zelix/mx
      // 23: checkcast com/zelix/mx
      // 26: astore 6
      // 28: aload 5
      // 2a: lload 2
      // 2b: lconst_0
      // 2c: lcmp
      // 2d: ifle 63
      // 30: ifnonnull 5b
      // 33: aload 6
      // 35: ifnull 66
      // 38: goto 45
      // 3b: ldc2_w 5755743945842593768
      // 3e: lload 2
      // 3f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 1
      // 46: aload 6
      // 48: invokevirtual com/zelix/mx.B ()I
      // 4b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 4e: goto 5b
      // 51: ldc2_w 5755743945842593768
      // 54: lload 2
      // 55: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: lload 2
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: ifle 71
      // 61: aload 5
      // 63: ifnull 7e
      // 66: aload 1
      // 67: aload 0
      // 68: getfield com/zelix/md.n Lcom/zelix/mx;
      // 6b: invokevirtual com/zelix/mx.B ()I
      // 6e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 71: goto 7e
      // 74: ldc2_w 5755743945842593768
      // 77: lload 2
      // 78: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: return
   }

   md(long var1, m4 var3, mx var4, _y4 var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 136776102911959L;
      super(var3.i, var3.j);
      this.n = var4;
      var5.G(var4, this, var6);
      x44.a<"p">(this, true, -8529177605623991157L, var1);
   }

   public String N(long var1) {
      return this.n.u();
   }

   public final String G(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 137214445240483L;
      return x44.a<"n">(this, var4, -8671127616137534842L, var2);
   }

   public String l(char var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      return b<"a">(7074, 8404845470876243384L ^ var4);
   }

   public boolean w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -2642174077967079812L, var2);
   }

   public w5 m(long var1) {
      return P;
   }

   public String t(long var1) {
      return this.n.u();
   }

   public String g(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 125763864918884L;
      long var6 = var2 ^ 88469187170830L;
      String[] var10000 = x44.a<"s">(6338232232020095508L, var2);
      String var9 = x44.a<"s">(new Object[]{var4, x44.a<"k">(this, var6, 6126263156876980267L, var2)}, 6240113731566295459L, var2);
      String[] var8 = var10000;

      try {
         if (var8 != null) {
            return var9;
         }

         if (var9.length() <= c<"a">(21262, 5270270768037542617L ^ var2)) {
            return var9;
         }
      } catch (gj var10) {
         throw x44.a<"s">(var10, 5694125228160356109L, var2);
      }

      return var9.substring(0, c<"a">(1713, 6436843905560211303L ^ var2))
         + b<"a">(4026, 8339922249401370615L ^ var2)
         + (var9.length() - c<"a">(7768, 1124452550172702604L ^ var2))
         + b<"a">(27517, 8020062171103978289L ^ var2)
         + var9.substring(var9.length() - c<"a">(26564, 8376019035000180241L ^ var2));
   }

   public md M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -836048529730228923L, var2);
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(P.l());
      var3.writeShort(this.n.B());
   }

   public md(int param1, _83 param2, mx param3, md param4, short param5, _y4 param6, boolean param7, int param8, char param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 5
      // 02: i2l
      // 03: bipush 48
      // 05: lshl
      // 06: iload 8
      // 08: i2l
      // 09: bipush 32
      // 0b: lshl
      // 0c: bipush 16
      // 0e: lushr
      // 0f: lor
      // 10: iload 9
      // 12: i2l
      // 13: bipush 48
      // 15: lshl
      // 16: bipush 48
      // 18: lushr
      // 19: lor
      // 1a: getstatic com/zelix/md.a J
      // 1d: lxor
      // 1e: lstore 10
      // 20: lload 10
      // 22: dup2
      // 23: ldc2_w 112848809071458
      // 26: lxor
      // 27: lstore 12
      // 29: pop2
      // 2a: ldc2_w 367207027710124281
      // 2d: lload 10
      // 2f: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: aload 0
      // 35: iload 1
      // 36: aload 2
      // 37: invokespecial com/zelix/xe.<init> (ILcom/zelix/_83;)V
      // 3a: astore 14
      // 3c: aload 0
      // 3d: aload 3
      // 3e: putfield com/zelix/md.n Lcom/zelix/mx;
      // 41: aload 14
      // 43: ifnonnull 8a
      // 46: aload 6
      // 48: ifnull 70
      // 4b: goto 59
      // 4e: ldc2_w 2155219550958509536
      // 51: lload 10
      // 53: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 6
      // 5b: aload 3
      // 5c: aload 0
      // 5d: lload 12
      // 5f: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 62: goto 70
      // 65: ldc2_w 2155219550958509536
      // 68: lload 10
      // 6a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 0
      // 71: aload 4
      // 73: ldc2_w 1878752821131461426
      // 76: lload 10
      // 78: invokedynamic u (Ljava/lang/Object;Lcom/zelix/md;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: aload 0
      // 7e: iload 7
      // 80: ldc2_w 366864077239760958
      // 83: lload 10
      // 85: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: return
   }

   public void Y(Object[] var1) {
      int var3 = (Integer)var1[0];
      boolean var4 = (Boolean)var1[1];
      int var5 = (Integer)var1[2];
      int var2 = (Integer)var1[3];
      long var6 = ((long)var3 << 48 | (long)var5 << 32 >>> 16 | (long)var2 << 48 >>> 48) ^ a;
      x44.a<"t">(this, var4, -7035111225480404105L, var6);
   }

   public md(int var1, _83 var2, long var3, mx var5, boolean var6) {
      var3 = a ^ var3;
      long var10001 = var3 ^ 19006116781146L;
      int var7 = (int)((var3 ^ 19006116781146L) >>> 48);
      int var8 = (int)((var3 ^ 19006116781146L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      this(var1, var2, var5, null, (short)var7, null, var6, var8, (char)var9);
   }

   public mx U() {
      return this.n;
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: ldc2_w -6799946151540505536
      // 1e: lload 6
      // 20: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 8
      // 27: aload 0
      // 28: aload 8
      // 2a: ifnonnull 51
      // 2d: getfield com/zelix/md.n Lcom/zelix/mx;
      // 30: aload 1
      // 31: if_acmpne 55
      // 34: goto 42
      // 37: ldc2_w -5093068584036370087
      // 3a: lload 6
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 51
      // 46: ldc2_w -5093068584036370087
      // 49: lload 6
      // 4b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 3
      // 52: putfield com/zelix/md.n Lcom/zelix/mx;
      // 55: return
   }

   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      long var5 = var3 ^ 92703790740844L;
      this.n.v(var2);
      x44.a<"o">(this, new Object[]{var5}, -937336034939244895L, var3);
   }

   static {
      long var20 = a ^ 114703608060013L;
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
      String var15 = ":Â\u0098¸\u0088û^UcÙ·*Óm\u0080òmÈwÜCe\u0003\u0090Ú\u0082AØAöqé\u0010»\u000f*³ «´°÷áT\u0010Ö½£\u008b\u0010\u0086(tm\u0015\u008e««\b¥¡uMþé¿";
      int var17 = ":Â\u0098¸\u0088û^UcÙ·*Óm\u0080òmÈwÜCe\u0003\u0090Ú\u0082AØAöqé\u0010»\u000f*³ «´°÷áT\u0010Ö½£\u008b\u0010\u0086(tm\u0015\u008e««\b¥¡uMþé¿"
         .length();
      char var14 = ' ';
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var30 = b(var19).intern();
         int var10001 = -1;
         var18[var16++] = var30;
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
            long[] var6 = new long[4];
            int var3 = 0;
            String var4 = "\u0011U&;³÷ßMþµÙ\u008f:½ç;";
            int var5 = "\u0011U&;³÷ßMþµÙ\u008f:½ç;".length();
            byte var2 = 0;

            label32:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var25 = var6;
               var10001 = var3++;
               long var33 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var36 = -1;

               while (true) {
                  long var8 = var33;
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
                  long var38 = ((long)var10[0] & 255L) << 56
                     | ((long)var10[1] & 255L) << 48
                     | ((long)var10[2] & 255L) << 40
                     | ((long)var10[3] & 255L) << 32
                     | ((long)var10[4] & 255L) << 24
                     | ((long)var10[5] & 255L) << 16
                     | ((long)var10[6] & 255L) << 8
                     | (long)var10[7] & 255L;
                  switch (var36) {
                     case 0:
                        var25[var10001] = var38;
                        if (var2 >= var5) {
                           e = var6;
                           g = new Integer[4];
                           P = x44.a<"h">(7676075595192100659L, var20);
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "\u009c¼U\u0084\u001f:~Ñ\u0004MkÐ;lT+";
                        var5 = "\u009c¼U\u0084\u001f:~Ñ\u0004MkÐ;lT+".length();
                        var2 = 0;
                  }

                  byte var29 = var2;
                  var2 += 8;
                  var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                  var25 = var6;
                  var10001 = var3++;
                  var33 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var36 = 0;
               }
            }
         }

         var14 = var15.charAt(var13);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21244;
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
            throw new RuntimeException("com/zelix/md", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/md" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13158;
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
            throw new RuntimeException("com/zelix/md", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/md" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
