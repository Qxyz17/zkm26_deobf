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

public class i9 extends i2 {
   private xv r;
   private static final long a = ess.a(4615036777634940387L, -2213120952543853646L, MethodHandles.lookup().lookupClass()).a(218394185854268L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public void k(Object[] var1) {
      _ug var6 = (_ug)var1[0];
      long var2 = (Long)var1[1];
      ei var5 = (ei)var1[2];
      _ur var4 = (_ur)var1[3];
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      Set var4 = (Set)var1[1];
   }

   public void r(Object[] var1) {
      long var2 = (Long)var1[0];
      HashMap var4 = (HashMap)var1[1];
      HashMap var5 = (HashMap)var1[2];
   }

   i9(long param1, h8 param3, int param4, _xx param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i9.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 121143696542595
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 132823909794827
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 91251333743264
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 107173659887386
      // 020: lxor
      // 021: dup2
      // 022: bipush 8
      // 024: lushr
      // 025: lstore 12
      // 027: dup2
      // 028: bipush 56
      // 02a: lshl
      // 02b: bipush 56
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 14
      // 031: pop2
      // 032: dup2
      // 033: ldc2_w 62468512308866
      // 036: lxor
      // 037: lstore 15
      // 039: pop2
      // 03a: ldc2_w -1136138322848595887
      // 03d: lload 1
      // 03e: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: aload 0
      // 044: aload 3
      // 045: iload 4
      // 047: lload 15
      // 049: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 04c: istore 17
      // 04e: aload 5
      // 050: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 053: istore 18
      // 055: aload 0
      // 056: lload 12
      // 058: iload 18
      // 05a: iload 14
      // 05c: i2b
      // 05d: invokevirtual com/zelix/i9.N (JIB)Lcom/zelix/xl;
      // 060: astore 19
      // 062: iload 17
      // 064: ifeq 0e4
      // 067: aload 19
      // 069: ifnull 0b5
      // 06c: goto 079
      // 06f: ldc2_w -759525960557505381
      // 072: lload 1
      // 073: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: lload 1
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 0d7
      // 07f: aload 19
      // 081: instanceof com/zelix/xv
      // 084: ifeq 0b5
      // 087: goto 094
      // 08a: ldc2_w -759525960557505381
      // 08d: lload 1
      // 08e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 0
      // 095: aload 19
      // 097: checkcast com/zelix/xv
      // 09a: ldc2_w -1006138519626623835
      // 09d: lload 1
      // 09e: invokedynamic q (Ljava/lang/Object;Lcom/zelix/xv;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: iload 17
      // 0a5: ifne 179
      // 0a8: goto 0b5
      // 0ab: ldc2_w -759525960557505381
      // 0ae: lload 1
      // 0af: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: bipush 0
      // 0b7: lload 10
      // 0b9: bipush 2
      // 0ba: anewarray 30
      // 0bd: dup_x2
      // 0be: dup_x2
      // 0bf: pop
      // 0c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c3: bipush 1
      // 0c4: swap
      // 0c5: aastore
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0cb: bipush 0
      // 0cc: swap
      // 0cd: aastore
      // 0ce: ldc2_w -1117831569478340631
      // 0d1: lload 1
      // 0d2: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: goto 0e4
      // 0da: ldc2_w -759525960557505381
      // 0dd: lload 1
      // 0de: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: new java/lang/StringBuilder
      // 0e8: dup
      // 0e9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ec: sipush 6308
      // 0ef: lload 1
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: ifle 109
      // 0f5: ldc2_w 882949237435130622
      // 0f8: lload 1
      // 0f9: lxor
      // 0fa: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: iload 17
      // 101: ifeq 14f
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: iload 18
      // 109: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 10c: aload 19
      // 10e: ifnull 152
      // 111: goto 11e
      // 114: ldc2_w -759525960557505381
      // 117: lload 1
      // 118: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: new java/lang/StringBuilder
      // 121: dup
      // 122: invokespecial java/lang/StringBuilder.<init> ()V
      // 125: sipush 20930
      // 128: ldc2_w 1562504344285195161
      // 12b: lload 1
      // 12c: lxor
      // 12d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/i9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 135: aload 19
      // 137: lload 8
      // 139: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 142: goto 14f
      // 145: ldc2_w -759525960557505381
      // 148: lload 1
      // 149: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: goto 154
      // 152: ldc ""
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15a: lload 6
      // 15c: dup2_x1
      // 15d: pop2
      // 15e: bipush 2
      // 15f: anewarray 30
      // 162: dup_x1
      // 163: swap
      // 164: bipush 1
      // 165: swap
      // 166: aastore
      // 167: dup_x2
      // 168: dup_x2
      // 169: pop
      // 16a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16d: bipush 0
      // 16e: swap
      // 16f: aastore
      // 170: ldc2_w -1179192485600598825
      // 173: lload 1
      // 174: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: return
   }

   public void s(Object[] var1) {
      long var3 = (Long)var1[0];
      DataOutputStream var2 = (DataOutputStream)var1[1];
      long var5 = var3 ^ 111534839130684L;
      var2.writeByte(x44.a<"k">(this, new Object[]{var5}, 778665830265632561L, var3));
      var2.writeShort(x44.a<"o">(this, 698145750835113756L, var3).B());
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 37062053491832L;
      return String.valueOf((char)x44.a<"o">(this, new Object[]{var4}, 1480035799822543221L, var2));
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      return 3;
   }

   boolean r(Object[] var1) {
      return false;
   }

   public void J(Object[] var1) {
      DataOutputStream var4 = (DataOutputStream)var1[0];
      long var5 = (Long)var1[1];
      Map var2 = (Map)var1[2];
      _ur var3 = (_ur)var1[3];
      long var7 = var5 ^ 129683512282286L;
      var4.writeByte(x44.a<"i">(this, new Object[]{var7}, -6026818023045852765L, var5));
      var4.writeShort(x44.a<"m">(this, -5826990108550624882L, var5).B());
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      x44.a<"o">(x44.a<"k">(this, -6497548928043515016L, var1), var4, var3, this, this.x(), -6601966529104202865L, var1);
   }

   public void Y(Object[] var1) {
      Set var5 = (Set)var1[0];
      Set var3 = (Set)var1[1];
      Set var2 = (Set)var1[2];
      long var6 = (Long)var1[3];
      Set var4 = (Set)var1[4];
   }

   static {
      long var0 = a ^ 123973867169081L;
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
      String var6 = "Ö¢jÌ(\\Äu+\n±`À\u001bXèHæÜ±¢äÂÀÛôx(à6ÓM¸PØ\u0094!ý:<ÓïÇKÈr÷á\u0092Ó&¶`!ÈªI\u0094Ê\u00adr×Ù\u000ea0j\u0082\u0016jåÏ×|\u0096\b\n0¤\u0013\u0091\u009f,Ìà\u007f÷§\u008d";
      int var8 = "Ö¢jÌ(\\Äu+\n±`À\u001bXèHæÜ±¢äÂÀÛôx(à6ÓM¸PØ\u0094!ý:<ÓïÇKÈr÷á\u0092Ó&¶`!ÈªI\u0094Ê\u00adr×Ù\u000ea0j\u0082\u0016jåÏ×|\u0096\b\n0¤\u0013\u0091\u009f,Ìà\u007f÷§\u008d"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1730;
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
            throw new RuntimeException("com/zelix/i9", var10);
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
         throw new RuntimeException("com/zelix/i9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
