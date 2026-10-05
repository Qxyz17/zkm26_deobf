package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zf extends jf implements li, _i {
   private LinkedList a;
   private static final long c = ess.a(8234464099429847595L, 2340566909343163957L, MethodHandles.lookup().lookupClass()).a(118100042701292L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public String k(Object[] param1) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 0
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w -7689612073377745673
      // 018: lload 2
      // 019: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: new java/lang/StringBuilder
      // 021: dup
      // 022: invokespecial java/lang/StringBuilder.<init> ()V
      // 025: astore 7
      // 027: aload 7
      // 029: ldc "{"
      // 02b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02e: pop
      // 02f: astore 6
      // 031: bipush 1
      // 032: istore 8
      // 034: aload 0
      // 035: ldc2_w -7968609137195655061
      // 038: lload 2
      // 039: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/LinkedList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: ldc2_w -8621184583638792972
      // 041: lload 2
      // 042: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: astore 9
      // 049: aload 9
      // 04b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 050: ifeq 172
      // 053: aload 9
      // 055: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05a: checkcast java/util/List
      // 05d: astore 10
      // 05f: aload 6
      // 061: ifnonnull 180
      // 064: iload 8
      // 066: aload 6
      // 068: ifnonnull 0c1
      // 06b: goto 078
      // 06e: ldc2_w -7601473676316556360
      // 071: lload 2
      // 072: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: lload 2
      // 079: lconst_0
      // 07a: lcmp
      // 07b: iflt 0b4
      // 07e: ifne 0b3
      // 081: goto 08e
      // 084: ldc2_w -7601473676316556360
      // 087: lload 2
      // 088: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: aload 7
      // 090: sipush 3554
      // 093: ldc2_w 4526818313762420078
      // 096: lload 2
      // 097: lxor
      // 098: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: pop
      // 0a1: aload 6
      // 0a3: ifnull 0c3
      // 0a6: goto 0b3
      // 0a9: ldc2_w -7601473676316556360
      // 0ac: lload 2
      // 0ad: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: bipush 0
      // 0b4: goto 0c1
      // 0b7: ldc2_w -7601473676316556360
      // 0ba: lload 2
      // 0bb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: istore 8
      // 0c3: bipush 1
      // 0c4: istore 11
      // 0c6: aload 10
      // 0c8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0cd: astore 12
      // 0cf: aload 12
      // 0d1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d6: ifeq 167
      // 0d9: aload 12
      // 0db: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e0: checkcast com/zelix/js
      // 0e3: astore 13
      // 0e5: iload 11
      // 0e7: aload 6
      // 0e9: ifnonnull 050
      // 0ec: aload 6
      // 0ee: lload 2
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: ifle 068
      // 0f4: ifnonnull 140
      // 0f7: ifne 132
      // 0fa: goto 107
      // 0fd: ldc2_w -7601473676316556360
      // 100: lload 2
      // 101: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 7
      // 109: sipush 9416
      // 10c: ldc2_w 886544626259500101
      // 10f: lload 2
      // 110: lxor
      // 111: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: pop
      // 11a: aload 6
      // 11c: lload 2
      // 11d: lconst_0
      // 11e: lcmp
      // 11f: iflt 164
      // 122: ifnull 142
      // 125: goto 132
      // 128: ldc2_w -7601473676316556360
      // 12b: lload 2
      // 12c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: bipush 0
      // 133: goto 140
      // 136: ldc2_w -7601473676316556360
      // 139: lload 2
      // 13a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: istore 11
      // 142: aload 7
      // 144: aload 13
      // 146: lload 4
      // 148: bipush 1
      // 149: anewarray 221
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 0
      // 153: swap
      // 154: aastore
      // 155: ldc2_w -7628096406949735218
      // 158: lload 2
      // 159: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: pop
      // 162: aload 6
      // 164: ifnull 0cf
      // 167: aload 6
      // 169: lload 2
      // 16a: lconst_0
      // 16b: lcmp
      // 16c: iflt 0e0
      // 16f: ifnull 049
      // 172: aload 7
      // 174: ldc "}"
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 179: pop
      // 17a: lload 2
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: iflt 180
      // 180: aload 7
      // 182: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 185: areturn
   }

   public zf(int var1, long var2) {
      var2 = c ^ var2;
      long var4 = var2 ^ 4714950589631L;
      super(var4, var1);
      x44.a<"s">(this, new LinkedList(), -5103469895322744786L, var2);
   }

   public boolean g(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w 1088308826894773924
      // 20: lload 2
      // 21: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: bipush 0
      // 27: istore 8
      // 29: astore 7
      // 2b: aload 0
      // 2c: ldc2_w 809136820200340024
      // 2f: lload 2
      // 30: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/LinkedList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: ldc2_w 1299314741123833511
      // 38: lload 2
      // 39: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: astore 9
      // 40: aload 9
      // 42: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 47: ifeq da
      // 4a: aload 9
      // 4c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 51: checkcast java/util/List
      // 54: astore 10
      // 56: aload 10
      // 58: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 5d: astore 11
      // 5f: aload 11
      // 61: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 66: ifeq ce
      // 69: aload 11
      // 6b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 70: checkcast com/zelix/js
      // 73: astore 12
      // 75: lload 2
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle d7
      // 7b: aload 12
      // 7d: aload 4
      // 7f: lload 5
      // 81: bipush 2
      // 82: anewarray 221
      // 85: dup_x2
      // 86: dup_x2
      // 87: pop
      // 88: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8b: bipush 1
      // 8c: swap
      // 8d: aastore
      // 8e: dup_x1
      // 8f: swap
      // 90: bipush 0
      // 91: swap
      // 92: aastore
      // 93: ldc2_w 1630674421987690011
      // 96: lload 2
      // 97: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: aload 7
      // 9e: ifnonnull d5
      // a1: ifne c9
      // a4: goto b1
      // a7: ldc2_w 923609988316060139
      // aa: lload 2
      // ab: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: aload 7
      // b3: ifnull 40
      // b6: lload 2
      // b7: lconst_0
      // b8: lcmp
      // b9: iflt 56
      // bc: goto c9
      // bf: ldc2_w 923609988316060139
      // c2: lload 2
      // c3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: athrow
      // c9: aload 7
      // cb: ifnull 5f
      // ce: lload 2
      // cf: lconst_0
      // d0: lcmp
      // d1: ifle d7
      // d4: bipush 1
      // d5: istore 8
      // d7: goto da
      // da: iload 8
      // dc: ireturn
   }

   public void t(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 0e: checkcast com/zelix/_za
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 5
      // 1b: pop
      // 1c: lload 2
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 134528422017690
      // 28: lxor
      // 29: lstore 8
      // 2b: pop2
      // 2c: ldc2_w 9148277501292601163
      // 2f: lload 2
      // 30: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 0
      // 36: lload 8
      // 38: bipush 1
      // 39: anewarray 221
      // 3c: dup_x2
      // 3d: dup_x2
      // 3e: pop
      // 3f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42: bipush 0
      // 43: swap
      // 44: aastore
      // 45: ldc2_w 7145691849331111744
      // 48: lload 2
      // 49: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: istore 11
      // 50: astore 10
      // 52: bipush 0
      // 53: istore 12
      // 55: iload 12
      // 57: iload 11
      // 59: if_icmpge 8f
      // 5c: aload 0
      // 5d: iload 12
      // 5f: invokevirtual com/zelix/zf.e (I)Lcom/zelix/_za;
      // 62: lload 6
      // 64: aload 0
      // 65: aload 5
      // 67: bipush 3
      // 68: anewarray 221
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 2
      // 6e: swap
      // 6f: aastore
      // 70: dup_x1
      // 71: swap
      // 72: bipush 1
      // 73: swap
      // 74: aastore
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w 8818198965911889370
      // 81: lload 2
      // 82: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 12 1
      // 8a: aload 10
      // 8c: ifnull 55
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: iflt 8a
      // 95: return
   }

   public void N(Object[] var1) {
      long var3 = (Long)var1[0];
      int var5 = (Integer)var1[1];
      js var2 = (js)var1[2];
      long var6 = var3 << 16 | (long)var5 << 48 >>> 48;
      LinkedList var8 = new LinkedList();
      var8.add(var2);
      x44.a<"i">(x44.a<"m">(this, 1848151135317584039L, var6), var8, 1873167991419738505L, var6);
   }

   public void X(Object[] var1) {
      long var3 = (Long)var1[0];
      js var2 = (js)var1[1];
      var3 = c ^ var3;
      ((List)x44.a<"m">(x44.a<"i">(this, -2656693742652806621L, var3), -4262214889607366880L, var3)).add(var2);
   }

   public void x(Object[] var1) {
      js var4 = (js)var1[0];
      long var2 = (Long)var1[1];
      var2 = c ^ var2;
      long var5 = (var2 ^ 45609589782271L) >>> 16;
      int var7 = (int)((var2 ^ 45609589782271L) << 48 >>> 48);
      Object[] var10005 = new Object[]{null, Integer.valueOf((short)var7), var4};
      var10005[0] = var5;
      x44.a<"n">(this, var10005, -6234994408964129426L, var2);
   }

   static {
      long var0 = c ^ 40472749009166L;
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
      String var6 = " »×5Óka§'\u0089\u0001öq\u0013`\u0097\u0010Úqã§gR\u0089\u0082xYT\u009e(\u001fÿU";
      int var8 = " »×5Óka§'\u0089\u0001öq\u0013`\u0097\u0010Úqã§gR\u0089\u0082xYT\u009e(\u001fÿU".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9243;
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
            throw new RuntimeException("com/zelix/zf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/zf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
