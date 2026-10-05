package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class iw extends i2 {
   private ij k;
   private static final long a = ess.a(471135267376948949L, 2573732996845328500L, MethodHandles.lookup().lookupClass()).a(271011137560229L);
   private static final String c;

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      x44.a<"k">(x44.a<"o">(this, 1517706195894753223L, var2), new Object[]{var4}, 756443226561032122L, var2);
   }

   public void B(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/util/Set
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: dup2
      // 1d: ldc2_w 13860179763599
      // 20: lxor
      // 21: lstore 7
      // 23: pop2
      // 24: ldc2_w -5968474420302013119
      // 27: lload 2
      // 28: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: istore 9
      // 2f: aload 0
      // 30: iload 9
      // 32: ifeq 6b
      // 35: lload 7
      // 37: bipush 1
      // 38: anewarray 40
      // 3b: dup_x2
      // 3c: dup_x2
      // 3d: pop
      // 3e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41: bipush 0
      // 42: swap
      // 43: aastore
      // 44: ldc2_w -5683195001731015253
      // 47: lload 2
      // 48: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: ifeq 93
      // 50: goto 5d
      // 53: ldc2_w -5359944647120019701
      // 56: lload 2
      // 57: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: goto 6b
      // 61: ldc2_w -5359944647120019701
      // 64: lload 2
      // 65: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: ldc2_w -5859587618315441050
      // 6e: lload 2
      // 6f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: lload 5
      // 76: aload 4
      // 78: bipush 2
      // 79: anewarray 40
      // 7c: dup_x1
      // 7d: swap
      // 7e: bipush 1
      // 7f: swap
      // 80: aastore
      // 81: dup_x2
      // 82: dup_x2
      // 83: pop
      // 84: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 87: bipush 0
      // 88: swap
      // 89: aastore
      // 8a: ldc2_w -5691100076349281739
      // 8d: lload 2
      // 8e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: return
   }

   public void Y(Object[] var1) {
      Set var5 = (Set)var1[0];
      Set var2 = (Set)var1[1];
      Set var6 = (Set)var1[2];
      long var3 = (Long)var1[3];
      Set var7 = (Set)var1[4];
      long var8 = var3 ^ 77128727132909L;
      x44.a<"h">(x44.a<"l">(this, 1852383590153673596L, var3), new Object[]{var5, var2, var6, var7, var8}, 199036422254027244L, var3);
   }

   iw(long param1, h8 param3, int param4, _xx param5, _y4 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/iw.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 98390044756987
      // 00b: lxor
      // 00c: lstore 7
      // 00e: dup2
      // 00f: ldc2_w 1455857967856
      // 012: lxor
      // 013: lstore 9
      // 015: dup2
      // 016: ldc2_w 39439715810535
      // 019: lxor
      // 01a: lstore 11
      // 01c: dup2
      // 01d: ldc2_w 111805951132376
      // 020: lxor
      // 021: lstore 13
      // 023: dup2
      // 024: ldc2_w 17048137195258
      // 027: lxor
      // 028: lstore 15
      // 02a: dup2
      // 02b: ldc2_w 62476805947974
      // 02e: lxor
      // 02f: lstore 17
      // 031: pop2
      // 032: aload 0
      // 033: aload 3
      // 034: iload 4
      // 036: lload 15
      // 038: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 03b: ldc2_w -1133896213541437399
      // 03e: lload 1
      // 03f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: aload 0
      // 045: aload 0
      // 046: lload 9
      // 048: aload 5
      // 04a: aload 6
      // 04c: bipush 4
      // 04d: anewarray 40
      // 050: dup_x1
      // 051: swap
      // 052: bipush 3
      // 053: swap
      // 054: aastore
      // 055: dup_x1
      // 056: swap
      // 057: bipush 2
      // 058: swap
      // 059: aastore
      // 05a: dup_x2
      // 05b: dup_x2
      // 05c: pop
      // 05d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 060: bipush 1
      // 061: swap
      // 062: aastore
      // 063: dup_x1
      // 064: swap
      // 065: bipush 0
      // 066: swap
      // 067: aastore
      // 068: ldc2_w -1523409374786961451
      // 06b: lload 1
      // 06c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: ldc2_w -880806264017211122
      // 074: lload 1
      // 075: invokedynamic q (Ljava/lang/Object;Lcom/zelix/ij;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: istore 19
      // 07c: aload 0
      // 07d: iload 19
      // 07f: ifeq 0e3
      // 082: ldc2_w -880806264017211122
      // 085: lload 1
      // 086: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: lload 11
      // 08d: bipush 1
      // 08e: anewarray 40
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w -790375143073610293
      // 09d: lload 1
      // 09e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: ifne 138
      // 0a6: goto 0b3
      // 0a9: ldc2_w -1660269189204491677
      // 0ac: lload 1
      // 0ad: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: bipush 0
      // 0b5: lload 13
      // 0b7: bipush 2
      // 0b8: anewarray 40
      // 0bb: dup_x2
      // 0bc: dup_x2
      // 0bd: pop
      // 0be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c1: bipush 1
      // 0c2: swap
      // 0c3: aastore
      // 0c4: dup_x1
      // 0c5: swap
      // 0c6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c9: bipush 0
      // 0ca: swap
      // 0cb: aastore
      // 0cc: ldc2_w -1151622646638334063
      // 0cf: lload 1
      // 0d0: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: aload 0
      // 0d6: goto 0e3
      // 0d9: ldc2_w -1660269189204491677
      // 0dc: lload 1
      // 0dd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: new java/lang/StringBuilder
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ea: getstatic com/zelix/iw.c Ljava/lang/String;
      // 0ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0: aload 0
      // 0f1: ldc2_w -880806264017211122
      // 0f4: lload 1
      // 0f5: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: lload 17
      // 0fc: bipush 1
      // 0fd: anewarray 40
      // 100: dup_x2
      // 101: dup_x2
      // 102: pop
      // 103: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: ldc2_w -1602241483984044975
      // 10c: lload 1
      // 10d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: lload 7
      // 11a: dup2_x1
      // 11b: pop2
      // 11c: bipush 2
      // 11d: anewarray 40
      // 120: dup_x1
      // 121: swap
      // 122: bipush 1
      // 123: swap
      // 124: aastore
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 0
      // 12c: swap
      // 12d: aastore
      // 12e: ldc2_w -1163443833759701841
      // 131: lload 1
      // 132: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: return
      // 138: return
   }

   public void J(Object[] var1) {
      DataOutputStream var3 = (DataOutputStream)var1[0];
      long var5 = (Long)var1[1];
      Map var4 = (Map)var1[2];
      _ur var2 = (_ur)var1[3];
      long var7 = var5 ^ 129683512282286L;
      long var9 = var5 ^ 0L;
      var3.writeByte(x44.a<"i">(this, new Object[]{var7}, -6026818023045852765L, var5));
      x44.a<"i">(x44.a<"m">(this, -5866592681304200099L, var5), new Object[]{var3, var9, var4, var2}, -5673466977215309874L, var5);
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 88149529359499L;
      return x44.a<"o">(x44.a<"k">(this, 1604400008123274379L, var2), new Object[]{var4}, 1161042152843551832L, var2);
   }

   public void s(Object[] var1) {
      long var2 = (Long)var1[0];
      DataOutputStream var4 = (DataOutputStream)var1[1];
      long var5 = var2 ^ 111534839130684L;
      long var7 = var2 ^ 0L;
      var4.writeByte(x44.a<"k">(this, new Object[]{var5}, 778665830265632561L, var2));
      x44.a<"k">(x44.a<"o">(this, 578639481925356239L, var2), new Object[]{var7, var4}, 1312160044332452795L, var2);
   }

   boolean r(Object[] var1) {
      return false;
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
   }

   public void r(Object[] var1) {
      long var4 = (Long)var1[0];
      HashMap var3 = (HashMap)var1[1];
      HashMap var2 = (HashMap)var1[2];
      long var6 = var4 ^ 0L;
      x44.a<"l">(x44.a<"h">(this, -3886453300596930344L, var4), new Object[]{var6, var3, var2}, -3536230820607739346L, var4);
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      x44.a<"j">(x44.a<"n">(this, -7010187273889588098L, var2), new Object[]{var4}, -7229415454091004200L, var2);
   }

   public void k(Object[] var1) {
      _ug var4 = (_ug)var1[0];
      long var2 = (Long)var1[1];
      ei var6 = (ei)var1[2];
      _ur var5 = (_ur)var1[3];
      long var7 = var2 ^ 71478048667550L;
      x44.a<"l">(x44.a<"h">(this, -2490243978433749064L, var2), new Object[]{var4, var6, var7, var5}, -4306485503539913884L, var2);
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      byte var6 = 1;
      return var6 + x44.a<"o">(x44.a<"k">(this, 8551165637249938531L, var2), new Object[]{var4}, 8642505571887934335L, var2);
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 0L;
      x44.a<"o">(x44.a<"k">(this, -6601181959808096597L, var1), var4, var3, -6619829722399573103L, var1);
   }

   static {
      long var0 = a ^ 33044673460113L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÞI\r\u0003»kú1¤È\u001c+ä\u0081YÞ\u001b Ñ2\u0002\u007f¯nïé0ôú|m\u001c".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      c = var5;
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
}
