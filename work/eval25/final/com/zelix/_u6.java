package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
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

public abstract class _u6 extends _u9 {
   private Map g;
   private Set k;
   private Set v;
   private static final long r = ess.a(2282697641658135602L, 9052449146068211384L, MethodHandles.lookup().lookupClass()).a(167966861472693L);
   private static final String[] t;
   private static final String[] D;
   private static final Map J = new HashMap(13);

   void X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = r ^ var2;
      long var4 = var2 ^ 5896290942760L;
      long var6 = var2 ^ 126844670215690L;
      hk[] var10000 = x44.a<"r">(-3173304263502049298L, var2);
      Enumeration var9 = x44.a<"j">(this.L, new Object[]{var6}, -3833935171163627520L, var2);
      hk[] var8 = var10000;

      while (var9.hasMoreElements()) {
         hr var10 = (hr)var9.nextElement();
         boolean var11 = x44.a<"n">(this, -3337225259463184352L, var2).add(var10);
         Object var12 = x44.a<"n">(this, -2924342376332028211L, var2).put(x44.a<"j">(var10, new Object[]{var4}, -3783335081888975458L, var2), var10);
         if (var8 != null) {
            break;
         }
      }
   }

   public final void Y(Object[] param1) {
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
      // 004: checkcast com/zelix/hr
      // 007: astore 4
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
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic com/zelix/_u6.r J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 3083383792495
      // 027: lxor
      // 028: lstore 6
      // 02a: pop2
      // 02b: ldc2_w -8092635357422087255
      // 02e: lload 2
      // 02f: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: astore 8
      // 036: aload 0
      // 037: ldc2_w -8221095857797125017
      // 03a: lload 2
      // 03b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 4
      // 042: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 047: aload 8
      // 049: ifnonnull 08c
      // 04c: ifeq 169
      // 04f: goto 05c
      // 052: ldc2_w -8006540334069197025
      // 055: lload 2
      // 056: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 0
      // 05d: ldc2_w -8221095857797125017
      // 060: lload 2
      // 061: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: aload 4
      // 068: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 06d: pop
      // 06e: aload 0
      // 06f: ldc2_w -7913639969984192024
      // 072: lload 2
      // 073: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: aload 4
      // 07a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 07f: goto 08c
      // 082: ldc2_w -8006540334069197025
      // 085: lload 2
      // 086: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: istore 9
      // 08e: new java/lang/StringBuilder
      // 091: dup
      // 092: invokespecial java/lang/StringBuilder.<init> ()V
      // 095: sipush 11435
      // 098: ldc2_w 1657438824259738883
      // 09b: lload 2
      // 09c: lxor
      // 09d: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/_u6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: aload 4
      // 0a7: lload 6
      // 0a9: bipush 1
      // 0aa: anewarray 206
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 0
      // 0b4: swap
      // 0b5: aastore
      // 0b6: ldc2_w -7549753330930112039
      // 0b9: lload 2
      // 0ba: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: sipush 31084
      // 0c5: ldc2_w 269496744378239173
      // 0c8: lload 2
      // 0c9: lxor
      // 0ca: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/_u6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2: aload 5
      // 0d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d7: ldc "\""
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0df: astore 10
      // 0e1: aload 0
      // 0e2: lload 2
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 11d
      // 0e8: aload 8
      // 0ea: ifnonnull 11d
      // 0ed: ldc2_w -7905252562076435669
      // 0f0: lload 2
      // 0f1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: ldc2_w -7721888319158311611
      // 0f9: lload 2
      // 0fa: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: ifeq 169
      // 102: goto 10f
      // 105: ldc2_w -8006540334069197025
      // 108: lload 2
      // 109: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 0
      // 110: goto 11d
      // 113: ldc2_w -8006540334069197025
      // 116: lload 2
      // 117: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: ldc2_w -8326941168628312486
      // 120: lload 2
      // 121: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: aload 8
      // 128: ifnonnull 152
      // 12b: ifnull 169
      // 12e: goto 13b
      // 131: ldc2_w -8006540334069197025
      // 134: lload 2
      // 135: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: aload 0
      // 13c: ldc2_w -8326941168628312486
      // 13f: lload 2
      // 140: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: goto 152
      // 148: ldc2_w -8006540334069197025
      // 14b: lload 2
      // 14c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: new java/lang/StringBuilder
      // 155: dup
      // 156: invokespecial java/lang/StringBuilder.<init> ()V
      // 159: ldc "\t"
      // 15b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15e: aload 10
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 166: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 169: return
   }

   public _u6(long var1, pk var3, List var4, List var5, _ur var6) {
      var1 = r ^ var1;
      long var10001 = var1 ^ 93233088997451L;
      int var7 = (int)((var1 ^ 93233088997451L) >>> 48);
      int var8 = (int)((var1 ^ 93233088997451L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 140205579758836L;
      long var12 = var1 ^ 89823546450709L;
      super(var3, var4, var5, (char)var7, var8, var6, (short)var9);
      x44.a<"w">(this, x44.a<"t">(new Object[]{var12}, -6696416758014661923L, var1), -6617537775940532826L, var1);
      x44.a<"w">(this, x44.a<"t">(new Object[]{var12}, -6696416758014661923L, var1), -4905512032624359383L, var1);
      x44.a<"w">(this, x44.a<"t">(new Object[]{var10}, -6842989709362313369L, var1), -6706804185344384181L, var1);
   }

   public Enumeration T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = r ^ var2;
      long var10001 = var2 ^ 40387014886315L;
      int var4 = (int)((var2 ^ 40387014886315L) >>> 48);
      int var5 = (int)((var2 ^ 40387014886315L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return new _8g((short)var4, var5, (short)var6, x44.a<"i">(this, -1173002990948561353L, var2));
   }

   static {
      long var0 = r ^ 130859040565291L;
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
      String var6 = "ÁÈyòÏ\u0084÷°\u008cxEo\ro[\u0092\u0001ëëAg\u0080y\u009e<:aò\u0012þ&*7\u0084\u008e\u0013d)¸ã@\u000eW}¦ÓfªËu¿ì¹ê\rc\u0095.Ö«Ã\u009fýº¡\u0010X+BÎ\u0006|°·\u0096yë<\u001fï\u0091ud\u0017 ¢Í`%ë\u0087 qß\u0090\u0085@b\u0000>ËÜÅg\u0010";
      int var8 = "ÁÈyòÏ\u0084÷°\u008cxEo\ro[\u0092\u0001ëëAg\u0080y\u009e<:aò\u0012þ&*7\u0084\u008e\u0013d)¸ã@\u000eW}¦ÓfªËu¿ì¹ê\rc\u0095.Ö«Ã\u009fýº¡\u0010X+BÎ\u0006|°·\u0096yë<\u001fï\u0091ud\u0017 ¢Í`%ë\u0087 qß\u0090\u0085@b\u0000>ËÜÅg\u0010"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            t = var9;
            D = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30574;
      if (D[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])J.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               J.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_u6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = t[var5].getBytes("ISO-8859-1");
         D[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return D[var5];
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
         throw new RuntimeException("com/zelix/_u6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
