package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _yk {
   private final _8z H;
   private static final long a = ess.a(1561312258387518212L, -5794708503854705254L, MethodHandles.lookup().lookupClass()).a(281170047688364L);
   private static final String b;

   public void D(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var4 = var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 119948352506849L;
      long var7 = var2 ^ 105372075201458L;
      String var10000 = x44.a<"v">(-2461283583986121517L, var2);
      Map var10 = x44.a<"j">(this, -4234817215926383498L, var2).D(var4);
      String var9 = var10000;

      label28: {
         try {
            var17 = var10;
            if (var9 != null) {
               break label28;
            }

            if (var10 == null) {
               return;
            }
         } catch (gj var15) {
            throw x44.a<"v">(var15, -2632176473727654803L, var2);
         }

         var17 = var10;
      }

      Iterator var11 = x44.a<"n">(x44.a<"v">(new Object[]{var17.keySet(), var5}, -4192734150765138037L, var2), -2515964376860892578L, var2);

      while (var11.hasNext()) {
         v_ var12 = (v_)var11.next();
         w2 var13 = (w2)var10.get(var12);
         w2 var14 = x44.a<"n">(this, new Object[]{var12, var7, var13, var4}, -4351764230286596284L, var2);
         if (var9 != null) {
            break;
         }
      }
   }

   public void f(Object[] var1) {
      long var4 = (Long)var1[0];
      v_ var3 = (v_)var1[1];
      w2 var6 = (w2)var1[2];
      Object var2 = var1[3];
      var4 = a ^ var4;
      long var7 = var4 ^ 93503697075820L;
      long var10001 = var4 ^ 104250172318124L;
      int var9 = (int)((var4 ^ 104250172318124L) >>> 32);
      int var10 = (int)((var4 ^ 104250172318124L) << 32 >>> 56);
      int var11 = (int)(var10001 << 40 >>> 40);
      x44.a<"j">(var3, new Object[]{var6, var7}, -8769025972036438760L, var4);
      x44.a<"n">(this, -9003019601532908990L, var4).s(var2, var3, var6, var9, (byte)var10, var11);
   }

   public w2 m(Object[] var1) {
      v_ var5 = (v_)var1[0];
      long var2 = (Long)var1[1];
      w2 var4 = (w2)var1[2];
      Object var6 = var1[3];
      var2 = a ^ var2;
      long var7 = var2 ^ 118298808674566L;
      long var9 = var2 ^ 90190595462440L;
      x44.a<"m">(var5, new Object[]{var4, var7}, 3454788429302990250L, var2);
      return (w2)x44.a<"m">(x44.a<"i">(this, 2984058092354019365L, var2), new Object[]{var6, var9, var5}, 3409965763159035048L, var2);
   }

   public _yk(long var1, boolean var3) {
      var1 = a ^ var1;
      long var4 = (var1 ^ 46493764770432L) >>> 32;
      int var6 = (int)((var1 ^ 46493764770432L) << 32 >>> 32);
      super();
      this.H = new _8z(var3, var4, var6);
   }

   public _yk(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var6 = var4 ^ 80920176475975L;
      this(var6, false);
   }

   public void m(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/_yk.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 108292303473689
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 32
      // 25: lushr
      // 26: l2i
      // 27: istore 5
      // 29: dup2
      // 2a: bipush 48
      // 2c: lshl
      // 2d: bipush 48
      // 2f: lushr
      // 30: l2i
      // 31: istore 6
      // 33: pop2
      // 34: dup2
      // 35: ldc2_w 52034064146307
      // 38: lxor
      // 39: lstore 7
      // 3b: pop2
      // 3c: ldc2_w 9058386140921226417
      // 3f: lload 2
      // 40: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: new com/zelix/tc
      // 48: dup
      // 49: aload 0
      // 4a: ldc2_w 7302852330273139732
      // 4d: lload 2
      // 4e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: bipush 0
      // 54: anewarray 92
      // 57: ldc2_w 7015291369005401309
      // 5a: lload 2
      // 5b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: iload 4
      // 62: i2c
      // 63: swap
      // 64: iload 5
      // 66: iload 6
      // 68: invokespecial com/zelix/tc.<init> (CLjava/util/Enumeration;II)V
      // 6b: ldc2_w 7354853903821794405
      // 6e: lload 2
      // 6f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: astore 10
      // 76: astore 9
      // 78: aload 10
      // 7a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7f: ifeq ae
      // 82: aload 0
      // 83: aload 10
      // 85: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8a: lload 7
      // 8c: dup2_x1
      // 8d: pop2
      // 8e: bipush 2
      // 8f: anewarray 92
      // 92: dup_x1
      // 93: swap
      // 94: bipush 1
      // 95: swap
      // 96: aastore
      // 97: dup_x2
      // 98: dup_x2
      // 99: pop
      // 9a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9d: bipush 0
      // 9e: swap
      // 9f: aastore
      // a0: ldc2_w 7310754345490652846
      // a3: lload 2
      // a4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: aload 9
      // ab: ifnull 78
      // ae: lload 2
      // af: lconst_0
      // b0: lcmp
      // b1: iflt a9
      // b4: return
   }

   public void H(Object[] var1) {
      hk var2 = (hk)var1[0];
      w2 var3 = (w2)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 139231934997387L;
      String var10004 = b;
      x44.a<"h">(this, new Object[]{var6, var2, var3, var10004}, 2232836030827521663L, var4);
   }

   static {
      long var0 = a ^ 3901171835297L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Fc¡\u009b's\u0081\u00adÍ(ê&\u0099Æ\u0082©".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
