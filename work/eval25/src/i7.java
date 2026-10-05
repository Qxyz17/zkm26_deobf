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

public class i7 extends i2 {
   private mf d;
   private static final long a = ess.a(-5688028133483848269L, 4078413641938457314L, MethodHandles.lookup().lookupClass()).a(212869854305195L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      x44.a<"o">(x44.a<"k">(this, -4816444201305519157L, var1), var4, var3, this, this.x(), -5042689185191220486L, var1);
   }

   public void B(Object[] var1) {
      long var3 = (Long)var1[0];
      Set var2 = (Set)var1[1];
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
   }

   Integer g(Object[] param1) {
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
      // 0c: getstatic com/zelix/i7.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 101599843000618
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 19410723425714
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w -1082688369673124675
      // 25: lload 2
      // 26: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 8
      // 2d: aload 0
      // 2e: lload 4
      // 30: bipush 1
      // 31: anewarray 21
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: ldc2_w -1043589654083379954
      // 40: lload 2
      // 41: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: iload 8
      // 48: ifne 8a
      // 4b: ifeq 8e
      // 4e: goto 5b
      // 51: ldc2_w -1207202816302663866
      // 54: lload 2
      // 55: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 0
      // 5c: ldc2_w -630311976705752669
      // 5f: lload 2
      // 60: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mf; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: lload 6
      // 67: bipush 1
      // 68: anewarray 21
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 0
      // 72: swap
      // 73: aastore
      // 74: ldc2_w -1213877197817281507
      // 77: lload 2
      // 78: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: goto 8a
      // 80: ldc2_w -1207202816302663866
      // 83: lload 2
      // 84: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8d: areturn
      // 8e: aconst_null
      // 8f: areturn
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   boolean r(Object[] var1) {
      return false;
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public void Y(Object[] var1) {
      Set var3 = (Set)var1[0];
      Set var5 = (Set)var1[1];
      Set var4 = (Set)var1[2];
      long var6 = (Long)var1[3];
      Set var2 = (Set)var1[4];
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 37062053491832L;
      return String.valueOf((char)x44.a<"o">(this, new Object[]{var4}, 1480035799822543221L, var2));
   }

   public void s(Object[] var1) {
      long var2 = (Long)var1[0];
      DataOutputStream var4 = (DataOutputStream)var1[1];
      long var5 = var2 ^ 111534839130684L;
      var4.writeByte(x44.a<"k">(this, new Object[]{var5}, 778665830265632561L, var2));
      var4.writeShort(x44.a<"o">(this, 1246604242110080943L, var2).B());
   }

   i7(h8 param1, long param2, int param4, _xx param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i7.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 52369076511684
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 62954275482700
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 21383796583143
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 36239208181597
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
      // 033: ldc2_w 133437179590341
      // 036: lxor
      // 037: lstore 15
      // 039: pop2
      // 03a: ldc2_w -2847152667570280426
      // 03d: lload 2
      // 03e: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: aload 0
      // 044: aload 1
      // 045: iload 4
      // 047: lload 15
      // 049: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 04c: aload 5
      // 04e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 051: istore 18
      // 053: istore 17
      // 055: aload 0
      // 056: lload 12
      // 058: iload 18
      // 05a: iload 14
      // 05c: i2b
      // 05d: invokevirtual com/zelix/i7.N (JIB)Lcom/zelix/xl;
      // 060: astore 19
      // 062: iload 17
      // 064: ifeq 0e4
      // 067: aload 19
      // 069: ifnull 0b5
      // 06c: goto 079
      // 06f: ldc2_w -2680435577945750860
      // 072: lload 2
      // 073: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: lload 2
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 0d7
      // 07f: aload 19
      // 081: instanceof com/zelix/mf
      // 084: ifeq 0b5
      // 087: goto 094
      // 08a: ldc2_w -2680435577945750860
      // 08d: lload 2
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 0
      // 095: aload 19
      // 097: checkcast com/zelix/mf
      // 09a: ldc2_w -4417283581079735215
      // 09d: lload 2
      // 09e: invokedynamic v (Ljava/lang/Object;Lcom/zelix/mf;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: iload 17
      // 0a5: ifne 17a
      // 0a8: goto 0b5
      // 0ab: ldc2_w -2680435577945750860
      // 0ae: lload 2
      // 0af: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: bipush 0
      // 0b7: lload 10
      // 0b9: bipush 2
      // 0ba: anewarray 21
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
      // 0ce: ldc2_w -2865437730017736786
      // 0d1: lload 2
      // 0d2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: goto 0e4
      // 0da: ldc2_w -2680435577945750860
      // 0dd: lload 2
      // 0de: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: new java/lang/StringBuilder
      // 0e8: dup
      // 0e9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ec: sipush 12979
      // 0ef: lload 2
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: iflt 109
      // 0f5: ldc2_w 7350410040699187832
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/i7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: iload 17
      // 101: ifeq 14f
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: iload 18
      // 109: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 10c: aload 19
      // 10e: ifnull 152
      // 111: goto 11e
      // 114: ldc2_w -2680435577945750860
      // 117: lload 2
      // 118: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: new java/lang/StringBuilder
      // 121: dup
      // 122: invokespecial java/lang/StringBuilder.<init> ()V
      // 125: sipush 10967
      // 128: ldc2_w 6114149238950521373
      // 12b: lload 2
      // 12c: lxor
      // 12d: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/i7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 135: aload 19
      // 137: lload 8
      // 139: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 142: goto 14f
      // 145: ldc2_w -2680435577945750860
      // 148: lload 2
      // 149: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: goto 154
      // 152: ldc ""
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15a: lload 6
      // 15c: dup2_x1
      // 15d: pop2
      // 15e: bipush 2
      // 15f: anewarray 21
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
      // 170: ldc2_w -4042566558105777008
      // 173: lload 2
      // 174: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: return
      // 17a: return
   }

   public void r(Object[] var1) {
      long var2 = (Long)var1[0];
      HashMap var4 = (HashMap)var1[1];
      HashMap var5 = (HashMap)var1[2];
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      return 3;
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void J(Object[] var1) {
      DataOutputStream var6 = (DataOutputStream)var1[0];
      long var2 = (Long)var1[1];
      Map var5 = (Map)var1[2];
      _ur var4 = (_ur)var1[3];
      long var7 = var2 ^ 129683512282286L;
      var6.writeByte(x44.a<"i">(this, new Object[]{var7}, -6026818023045852765L, var2));
      var6.writeShort(x44.a<"m">(this, -5197502004545535683L, var2).B());
   }

   public void k(Object[] var1) {
      _ug var3 = (_ug)var1[0];
      long var4 = (Long)var1[1];
      ei var6 = (ei)var1[2];
      _ur var2 = (_ur)var1[3];
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   static {
      long var0 = a ^ 18249878640982L;
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
      String var6 = "\u001e²\u008eQ\u0099:ô6Å\u008dä3\nÄBKÕ\u0091\u0003¾¨<®±ÿ±.Që\u0087\u001e!\u0013\u00853\fJ\u0094l=\u0085]\u0012\u007f{ÃW\u0084\u001bO´{`\u001e³Ó -Óò&\u0081®\u0005Þ©P?i\u009d¨W\u0010â¶2\u0093\u0017)'¥¯£FÔÝwøb";
      int var8 = "\u001e²\u008eQ\u0099:ô6Å\u008dä3\nÄBKÕ\u0091\u0003¾¨<®±ÿ±.Që\u0087\u001e!\u0013\u00853\fJ\u0094l=\u0085]\u0012\u007f{ÃW\u0084\u001bO´{`\u001e³Ó -Óò&\u0081®\u0005Þ©P?i\u009d¨W\u0010â¶2\u0093\u0017)'¥¯£FÔÝwøb"
         .length();
      char var5 = 'H';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            e = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5141;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/i7", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/i7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
