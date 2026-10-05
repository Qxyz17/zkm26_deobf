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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ip extends i2 {
   private xh M;
   private static final long a = ess.a(176459672143616006L, 9185671038818047506L, MethodHandles.lookup().lookupClass()).a(3772369816524L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public void Y(Object[] var1) {
      Set var5 = (Set)var1[0];
      Set var7 = (Set)var1[1];
      Set var6 = (Set)var1[2];
      long var2 = (Long)var1[3];
      Set var4 = (Set)var1[4];
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 37062053491832L;
      return String.valueOf((char)x44.a<"o">(this, new Object[]{var4}, 1480035799822543221L, var2));
   }

   public void k(Object[] var1) {
      _ug var6 = (_ug)var1[0];
      long var4 = (Long)var1[1];
      ei var2 = (ei)var1[2];
      _ur var3 = (_ur)var1[3];
   }

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      x44.a<"o">(x44.a<"k">(this, -6458147897877680550L, var1), var4, var3, this, this.x(), -4738195157245132768L, var1);
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
   }

   boolean r(Object[] var1) {
      return false;
   }

   public void s(Object[] var1) {
      long var2 = (Long)var1[0];
      DataOutputStream var4 = (DataOutputStream)var1[1];
      long var5 = var2 ^ 111534839130684L;
      var4.writeByte(x44.a<"k">(this, new Object[]{var5}, 778665830265632561L, var2));
      var4.writeShort(x44.a<"o">(this, 721792843375837758L, var2).B());
   }

   public void J(Object[] var1) {
      DataOutputStream var4 = (DataOutputStream)var1[0];
      long var2 = (Long)var1[1];
      Map var5 = (Map)var1[2];
      _ur var6 = (_ur)var1[3];
      long var7 = var2 ^ 129683512282286L;
      var4.writeByte(x44.a<"i">(this, new Object[]{var7}, -6026818023045852765L, var2));
      var4.writeShort(x44.a<"m">(this, -6010543781058730836L, var2).B());
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      Set var4 = (Set)var1[1];
   }

   public void r(Object[] var1) {
      long var3 = (Long)var1[0];
      HashMap var5 = (HashMap)var1[1];
      HashMap var2 = (HashMap)var1[2];
   }

   ip(int param1, h8 param2, int param3, int param4, _xx param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: getstatic com/zelix/ip.a J
      // 012: lxor
      // 013: lstore 6
      // 015: lload 6
      // 017: dup2
      // 018: ldc2_w 121184216859760
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 132868726262776
      // 022: lxor
      // 023: lstore 10
      // 025: dup2
      // 026: ldc2_w 91141548035411
      // 029: lxor
      // 02a: lstore 12
      // 02c: dup2
      // 02d: ldc2_w 107081573091561
      // 030: lxor
      // 031: dup2
      // 032: bipush 8
      // 034: lushr
      // 035: lstore 14
      // 037: dup2
      // 038: bipush 56
      // 03a: lshl
      // 03b: bipush 56
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 16
      // 041: pop2
      // 042: dup2
      // 043: ldc2_w 62440330056049
      // 046: lxor
      // 047: lstore 17
      // 049: pop2
      // 04a: aload 0
      // 04b: aload 2
      // 04c: iload 3
      // 04d: lload 17
      // 04f: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 052: aload 5
      // 054: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 057: istore 20
      // 059: ldc2_w -2107741421812656389
      // 05c: lload 6
      // 05e: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aload 0
      // 064: lload 14
      // 066: iload 20
      // 068: iload 16
      // 06a: i2b
      // 06b: invokevirtual com/zelix/ip.N (JIB)Lcom/zelix/xl;
      // 06e: astore 21
      // 070: istore 19
      // 072: iload 19
      // 074: ifne 0f8
      // 077: aload 21
      // 079: ifnull 0c7
      // 07c: goto 08a
      // 07f: ldc2_w -1732716078866179654
      // 082: lload 6
      // 084: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: iload 1
      // 08b: iflt 0ea
      // 08e: aload 21
      // 090: instanceof com/zelix/xh
      // 093: ifeq 0c7
      // 096: goto 0a4
      // 099: ldc2_w -1732716078866179654
      // 09c: lload 6
      // 09e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: aload 21
      // 0a7: checkcast com/zelix/xh
      // 0aa: ldc2_w -122046501379377548
      // 0ad: lload 6
      // 0af: invokedynamic r (Ljava/lang/Object;Lcom/zelix/xh;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: iload 19
      // 0b6: ifeq 192
      // 0b9: goto 0c7
      // 0bc: ldc2_w -1732716078866179654
      // 0bf: lload 6
      // 0c1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: bipush 0
      // 0c9: lload 12
      // 0cb: bipush 2
      // 0cc: anewarray 270
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 1
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: ldc2_w -31619726429151206
      // 0e3: lload 6
      // 0e5: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: goto 0f8
      // 0ed: ldc2_w -1732716078866179654
      // 0f0: lload 6
      // 0f2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: new java/lang/StringBuilder
      // 0fc: dup
      // 0fd: invokespecial java/lang/StringBuilder.<init> ()V
      // 100: sipush 18186
      // 103: iload 4
      // 105: ifle 11d
      // 108: ldc2_w 4008923553658128097
      // 10b: lload 6
      // 10d: lxor
      // 10e: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ip.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: iload 19
      // 115: ifne 166
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: iload 20
      // 11d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 120: aload 21
      // 122: ifnull 169
      // 125: goto 133
      // 128: ldc2_w -1732716078866179654
      // 12b: lload 6
      // 12d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: new java/lang/StringBuilder
      // 136: dup
      // 137: invokespecial java/lang/StringBuilder.<init> ()V
      // 13a: sipush 32274
      // 13d: ldc2_w 1747376529763074040
      // 140: lload 6
      // 142: lxor
      // 143: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ip.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b: aload 21
      // 14d: lload 10
      // 14f: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 155: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 158: goto 166
      // 15b: ldc2_w -1732716078866179654
      // 15e: lload 6
      // 160: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: goto 16b
      // 169: ldc ""
      // 16b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 171: lload 8
      // 173: dup2_x1
      // 174: pop2
      // 175: bipush 2
      // 176: anewarray 270
      // 179: dup_x1
      // 17a: swap
      // 17b: bipush 1
      // 17c: swap
      // 17d: aastore
      // 17e: dup_x2
      // 17f: dup_x2
      // 180: pop
      // 181: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 184: bipush 0
      // 185: swap
      // 186: aastore
      // 187: ldc2_w -2282855845941581020
      // 18a: lload 6
      // 18c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: return
      // 192: return
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      return 3;
   }

   static {
      long var0 = a ^ 108838728636163L;
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
      String var6 = "wßc>~cõ\u0093\u0099ãªÙ\rqñ<H[f\u008dÄ¦\u001dæÐ¹F\u0005wx°¼\u0002\fsù\"/ßoN\"ýöÞ\u009b²q¸KJx§>\u0015©\"\u001eKzI\u008cÕ\u0095\u0080£\u0091pv\tº¿¨étq\u0089\u008ae.ú[#ª\u0089xc.Ã";
      int var8 = "wßc>~cõ\u0093\u0099ãªÙ\rqñ<H[f\u008dÄ¦\u001dæÐ¹F\u0005wx°¼\u0002\fsù\"/ßoN\"ýöÞ\u009b²q¸KJx§>\u0015©\"\u001eKzI\u008cÕ\u0095\u0080£\u0091pv\tº¿¨étq\u0089\u008ae.ú[#ª\u0089xc.Ã"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29312;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ip", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/ip" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
