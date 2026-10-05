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

public class i6 extends i2 {
   private ms i;
   private static final long a = ess.a(-5627377440345326907L, 6838128239361765261L, MethodHandles.lookup().lookupClass()).a(27684525428346L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void k(Object[] var1) {
      _ug var2 = (_ug)var1[0];
      long var5 = (Long)var1[1];
      ei var3 = (ei)var1[2];
      _ur var4 = (_ur)var1[3];
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      return 3;
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   boolean r(Object[] var1) {
      return false;
   }

   public void s(Object[] var1) {
      long var3 = (Long)var1[0];
      DataOutputStream var2 = (DataOutputStream)var1[1];
      long var5 = var3 ^ 111534839130684L;
      var2.writeByte(x44.a<"k">(this, new Object[]{var5}, 778665830265632561L, var3));
      var2.writeShort(x44.a<"o">(this, 617107442253099134L, var3).B());
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      Set var4 = (Set)var1[1];
   }

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      x44.a<"o">(x44.a<"k">(this, -6560555524155745254L, var1), var4, var3, this, this.x(), -6401290128336968084L, var1);
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void r(Object[] var1) {
      long var4 = (Long)var1[0];
      HashMap var2 = (HashMap)var1[1];
      HashMap var3 = (HashMap)var1[2];
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void J(Object[] var1) {
      DataOutputStream var5 = (DataOutputStream)var1[0];
      long var3 = (Long)var1[1];
      Map var2 = (Map)var1[2];
      _ur var6 = (_ur)var1[3];
      long var7 = var3 ^ 129683512282286L;
      var5.writeByte(x44.a<"i">(this, new Object[]{var7}, -6026818023045852765L, var3));
      var5.writeShort(x44.a<"m">(this, -5908028438062082324L, var3).B());
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 37062053491832L;
      return String.valueOf((char)x44.a<"o">(this, new Object[]{var4}, 1480035799822543221L, var2));
   }

   i6(h8 param1, int param2, _xx param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i6.a J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 78830065888935
      // 00e: lxor
      // 00f: lstore 6
      // 011: dup2
      // 012: ldc2_w 89414795190575
      // 015: lxor
      // 016: lstore 8
      // 018: dup2
      // 019: ldc2_w 135660362639236
      // 01c: lxor
      // 01d: lstore 10
      // 01f: dup2
      // 020: ldc2_w 80155750015550
      // 023: lxor
      // 024: dup2
      // 025: bipush 8
      // 027: lushr
      // 028: lstore 12
      // 02a: dup2
      // 02b: bipush 56
      // 02d: lshl
      // 02e: bipush 56
      // 030: lushr
      // 031: l2i
      // 032: istore 14
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 19032838290342
      // 039: lxor
      // 03a: lstore 15
      // 03c: pop2
      // 03d: ldc2_w 1522086557916996981
      // 040: lload 4
      // 042: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: aload 0
      // 048: aload 1
      // 049: iload 2
      // 04a: lload 15
      // 04c: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 04f: aload 3
      // 050: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 053: istore 18
      // 055: aload 0
      // 056: lload 12
      // 058: iload 18
      // 05a: iload 14
      // 05c: i2b
      // 05d: invokevirtual com/zelix/i6.N (JIB)Lcom/zelix/xl;
      // 060: astore 19
      // 062: istore 17
      // 064: iload 17
      // 066: ifeq 0ed
      // 069: aload 19
      // 06b: ifnull 0bc
      // 06e: goto 07c
      // 071: ldc2_w 1385838425385373255
      // 074: lload 4
      // 076: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: lload 4
      // 07e: lconst_0
      // 07f: lcmp
      // 080: iflt 0df
      // 083: aload 19
      // 085: instanceof com/zelix/ms
      // 088: ifeq 0bc
      // 08b: goto 099
      // 08e: ldc2_w 1385838425385373255
      // 091: lload 4
      // 093: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 0
      // 09a: aload 19
      // 09c: checkcast com/zelix/ms
      // 09f: ldc2_w 1589062485707255523
      // 0a2: lload 4
      // 0a4: invokedynamic u (Ljava/lang/Object;Lcom/zelix/ms;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: iload 17
      // 0ab: ifne 189
      // 0ae: goto 0bc
      // 0b1: ldc2_w 1385838425385373255
      // 0b4: lload 4
      // 0b6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: bipush 0
      // 0be: lload 10
      // 0c0: bipush 2
      // 0c1: anewarray 109
      // 0c4: dup_x2
      // 0c5: dup_x2
      // 0c6: pop
      // 0c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ca: bipush 1
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: ldc2_w 1538123875008269005
      // 0d8: lload 4
      // 0da: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: goto 0ed
      // 0e2: ldc2_w 1385838425385373255
      // 0e5: lload 4
      // 0e7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: new java/lang/StringBuilder
      // 0f1: dup
      // 0f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f5: sipush 10948
      // 0f8: lload 4
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: ifle 114
      // 0ff: ldc2_w 6353624347895625514
      // 102: lload 4
      // 104: lxor
      // 105: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/i6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: iload 17
      // 10c: ifeq 15d
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: iload 18
      // 114: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 117: aload 19
      // 119: ifnull 160
      // 11c: goto 12a
      // 11f: ldc2_w 1385838425385373255
      // 122: lload 4
      // 124: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: new java/lang/StringBuilder
      // 12d: dup
      // 12e: invokespecial java/lang/StringBuilder.<init> ()V
      // 131: sipush 15679
      // 134: ldc2_w 3190409406541914320
      // 137: lload 4
      // 139: lxor
      // 13a: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/i6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: aload 19
      // 144: lload 8
      // 146: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14f: goto 15d
      // 152: ldc2_w 1385838425385373255
      // 155: lload 4
      // 157: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: goto 162
      // 160: ldc ""
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 168: lload 6
      // 16a: dup2_x1
      // 16b: pop2
      // 16c: bipush 2
      // 16d: anewarray 109
      // 170: dup_x1
      // 171: swap
      // 172: bipush 1
      // 173: swap
      // 174: aastore
      // 175: dup_x2
      // 176: dup_x2
      // 177: pop
      // 178: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17b: bipush 0
      // 17c: swap
      // 17d: aastore
      // 17e: ldc2_w 758437835565662707
      // 181: lload 4
      // 183: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: return
      // 189: return
   }

   public void Y(Object[] var1) {
      Set var6 = (Set)var1[0];
      Set var5 = (Set)var1[1];
      Set var7 = (Set)var1[2];
      long var3 = (Long)var1[3];
      Set var2 = (Set)var1[4];
   }

   static {
      long var0 = a ^ 88443125242715L;
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
      String var6 = "\u0019\fL§Ü²Ú¢è)%.\u008esr{ªËÊíÆa0´-Æ§zæ5\t¡ËBQ\u0096\u00990§aiW-\u0088MhÊãq)½\u001d#\u0014Úö\u008fò\u0080c´)¾Ë©.\u0090*\u0080a¬%Ô´wüÇ8²'\u0010)»\u0004\u0088g\u008f1{À8\u0012ÁÌOøÔ";
      int var8 = "\u0019\fL§Ü²Ú¢è)%.\u008esr{ªËÊíÆa0´-Æ§zæ5\t¡ËBQ\u0096\u00990§aiW-\u0088MhÊãq)½\u001d#\u0014Úö\u008fò\u0080c´)¾Ë©.\u0090*\u0080a¬%Ô´wüÇ8²'\u0010)»\u0004\u0088g\u008f1{À8\u0012ÁÌOøÔ"
         .length();
      char var5 = 'P';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17491;
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
            throw new RuntimeException("com/zelix/i6", var10);
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
         throw new RuntimeException("com/zelix/i6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
