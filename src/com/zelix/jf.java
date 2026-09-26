package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jf extends jv implements gm, ni {
   x8 m;
   static final va h;
   private static final long a = prr.a(-4187204755898432684L, -4569653669588711184L, MethodHandles.lookup().lookupClass()).a(18919164611104L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   jf(jr var1, x8 var2, l6q var3, long var4) {
      var4 = a ^ var4;
      long var6 = var4 ^ 52158470310061L;
      super(var1.t, var1.l);
      this.m = var2;
      var3.t(var2, this, var6);
   }

   static {
      long var0 = a ^ 40236301276733L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "½(\u0094üÞ!\u000b\u00865ÝëÓ%kÔ|°f\u0002v\u007f\u009b\u0083\u001c";
      int var7 = "½(\u0094üÞ!\u000b\u00865ÝëÓ%kÔ|°f\u0002v\u007f\u009b\u0083\u001c".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[5];
                     h = va.Q;
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "¡\u009b\u0097yK4\u001dZ\u000b¼\u0017\u0007\u0019Ç\u0014«";
                  var7 = "¡\u009b\u0097yK4\u001dZ\u000b¼\u0017\u0007\u0019Ç\u0014«".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   public va A(long var1) {
      return h;
   }

   void w(long param1, DataOutputStream param3, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 7191396267850401064
      // 03: lload 1
      // 04: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: aload 3
      // 0a: getstatic com/zelix/jf.h Lcom/zelix/va;
      // 0d: invokevirtual com/zelix/va.g ()I
      // 10: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 13: istore 5
      // 15: aload 4
      // 17: aload 0
      // 18: getfield com/zelix/jf.m Lcom/zelix/x8;
      // 1b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 20: checkcast com/zelix/x8
      // 23: checkcast com/zelix/x8
      // 26: astore 6
      // 28: iload 5
      // 2a: lload 1
      // 2b: lconst_0
      // 2c: lcmp
      // 2d: ifle 63
      // 30: ifne 5b
      // 33: aload 6
      // 35: ifnull 66
      // 38: goto 45
      // 3b: ldc2_w 9150374959265722010
      // 3e: lload 1
      // 3f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 3
      // 46: aload 6
      // 48: invokevirtual com/zelix/x8.E ()I
      // 4b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 4e: goto 5b
      // 51: ldc2_w 9150374959265722010
      // 54: lload 1
      // 55: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: lload 1
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: ifle 71
      // 61: iload 5
      // 63: ifeq 7e
      // 66: aload 3
      // 67: aload 0
      // 68: getfield com/zelix/jf.m Lcom/zelix/x8;
      // 6b: invokevirtual com/zelix/x8.E ()I
      // 6e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 71: goto 7e
      // 74: ldc2_w 9150374959265722010
      // 77: lload 1
      // 78: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: return
   }

   void O(DataOutputStream var1, long var2) {
      var1.writeByte(h.g());
      var1.writeShort(this.m.E());
   }

   jf(int var1, to var2, long var3, x8 var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 92309036616977L;
      this(var1, var2, var6, var5, null);
   }

   public void q(x8 param1, long param2, x8 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -5906177365838858378
      // 03: lload 2
      // 04: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 5
      // 0b: aload 0
      // 0c: iload 5
      // 0e: ifeq 33
      // 11: getfield com/zelix/jf.m Lcom/zelix/x8;
      // 14: aload 1
      // 15: if_acmpne 38
      // 18: goto 25
      // 1b: ldc2_w -5912497112593236588
      // 1e: lload 2
      // 1f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: athrow
      // 25: aload 0
      // 26: goto 33
      // 29: ldc2_w -5912497112593236588
      // 2c: lload 2
      // 2d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: aload 4
      // 35: putfield com/zelix/jf.m Lcom/zelix/x8;
      // 38: return
   }

   public String z(char var1, int var2, short var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 102593366253010L;
      return m44.a<"r">(this, new Object[]{var6}, -769804561390226470L, var4);
   }

   public String N(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.m.V().replace((char)b<"a">(12116, 2743180740812686565L ^ var2), (char)b<"a">(22027, 2495904439659380158L ^ var2));
   }

   public boolean v(String var1, int var2, short var3, short var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 86080562884140L;
      return this.g(var7).equals(var1);
   }

   public _f m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 78528229787614L;
      long var6 = var2 ^ 103699060128809L;
      long var8 = var2 ^ 3325783804721L;
      int var10000 = m44.a<"j">(7444160617677324714L, var2);
      String var11 = m44.a<"j">(new Object[]{var6, this.g(var8)}, 7332418153517746149L, var2);
      int var10 = var10000;

      try {
         if (var10 != 0) {
            return l62.B(var11, var4);
         }

         if (var11 == null) {
            return null;
         }
      } catch (n9 var12) {
         throw m44.a<"j">(var12, 8826679110831876632L, var2);
      }

      return l62.B(var11, var4);
   }

   public void r(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      this.m.A(var2);
   }

   public void I(Object[] param1) {
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
      // 004: checkcast java/util/HashMap
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/jf.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 118630285818091
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 17498214756137
      // 025: lxor
      // 026: lstore 7
      // 028: pop2
      // 029: ldc2_w 7694127715738268600
      // 02c: lload 3
      // 02d: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: istore 9
      // 034: aload 0
      // 035: iload 9
      // 037: ifeq 072
      // 03a: getfield com/zelix/jf.l Lcom/zelix/to;
      // 03d: lload 5
      // 03f: bipush 1
      // 040: anewarray 351
      // 043: dup_x2
      // 044: dup_x2
      // 045: pop
      // 046: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 049: bipush 0
      // 04a: swap
      // 04b: aastore
      // 04c: ldc2_w 7966040393389664741
      // 04f: lload 3
      // 050: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/jv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: aload 0
      // 056: if_acmpne 071
      // 059: goto 066
      // 05c: ldc2_w 7583100445631101274
      // 05f: lload 3
      // 060: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: return
      // 067: ldc2_w 7583100445631101274
      // 06a: lload 3
      // 06b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: aload 0
      // 072: getfield com/zelix/jf.m Lcom/zelix/x8;
      // 075: invokevirtual com/zelix/x8.V ()Ljava/lang/String;
      // 078: astore 10
      // 07a: aload 2
      // 07b: aload 10
      // 07d: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 080: checkcast java/lang/String
      // 083: astore 11
      // 085: aload 11
      // 087: iload 9
      // 089: ifeq 0f8
      // 08c: ifnull 0e6
      // 08f: goto 09c
      // 092: ldc2_w 7583100445631101274
      // 095: lload 3
      // 096: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 11
      // 09e: aload 10
      // 0a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a3: lload 3
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: ifle 0fd
      // 0a9: iload 9
      // 0ab: ifeq 0fd
      // 0ae: goto 0bb
      // 0b1: ldc2_w 7583100445631101274
      // 0b4: lload 3
      // 0b5: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: ifne 0e6
      // 0be: goto 0cb
      // 0c1: ldc2_w 7583100445631101274
      // 0c4: lload 3
      // 0c5: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield com/zelix/jf.m Lcom/zelix/x8;
      // 0cf: aload 11
      // 0d1: invokevirtual com/zelix/x8.A (Ljava/lang/String;)V
      // 0d4: iload 9
      // 0d6: ifne 116
      // 0d9: goto 0e6
      // 0dc: ldc2_w 7583100445631101274
      // 0df: lload 3
      // 0e0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 10
      // 0e8: aload 2
      // 0e9: lload 7
      // 0eb: ldc2_w 8156723526458453280
      // 0ee: lload 3
      // 0ef: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: astore 11
      // 0f6: aload 10
      // 0f8: aload 11
      // 0fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fd: ifne 116
      // 100: aload 0
      // 101: getfield com/zelix/jf.m Lcom/zelix/x8;
      // 104: aload 11
      // 106: invokevirtual com/zelix/x8.A (Ljava/lang/String;)V
      // 109: goto 116
      // 10c: ldc2_w 7583100445631101274
      // 10f: lload 3
      // 110: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: athrow
      // 116: return
   }

   public boolean N(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 78794133772325L;
      return this.g(var3).startsWith("[");
   }

   jf(int var1, to var2, long var3, x8 var5, l6q var6) {
      var3 = a ^ var3;
      long var7 = var3 ^ 126184430304639L;
      super(var1, var2);
      int var10000 = m44.a<"h">(-7724554392139271640L, var3);
      this.m = var5;
      int var9 = var10000;

      label20: {
         try {
            var12 = var6;
            if (var9 != 0) {
               break label20;
            }

            if (var6 == null) {
               return;
            }
         } catch (n9 var10) {
            throw m44.a<"h">(var10, -8503763725483222630L, var3);
         }

         var12 = var6;
      }

      var12.t(var5, this, var7);
   }

   public String h(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 117509725569282L;
      String var5 = this.m.V();
      return R(var3, var5);
   }

   public String g(long var1) {
      int var10000 = m44.a<"k">(-1405127884242842981L, var1);
      String var4 = this.m.V();
      int var3 = var10000;

      try {
         int var10001 = var3;
         if (var1 > 0L) {
            if (var3 != 0) {
               return var4;
            }

            var10001 = b<"a">(23965, 1439983058766032285L ^ var1);
         }

         if (var4.indexOf(var10001) == -1) {
            return var4;
         }
      } catch (n9 var5) {
         throw m44.a<"k">(var5, -1058439487231155927L, var1);
      }

      return var4.replace((char)b<"a">(22027, 2495847416700036618L ^ var1), (char)b<"a">(30645, 7186409978282526646L ^ var1));
   }

   private static String R(long param0, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/jf.a J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: ldc2_w 5978523853299790867
      // 009: lload 0
      // 00a: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: istore 3
      // 010: aload 2
      // 011: ldc ";"
      // 013: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 016: iload 3
      // 017: ifne 037
      // 01a: ifeq 036
      // 01d: goto 02a
      // 020: ldc2_w 5748750926793973665
      // 023: lload 0
      // 024: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: athrow
      // 02a: aload 2
      // 02b: areturn
      // 02c: ldc2_w 5748750926793973665
      // 02f: lload 0
      // 030: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: athrow
      // 036: bipush 0
      // 037: istore 4
      // 039: aload 2
      // 03a: iload 4
      // 03c: invokevirtual java/lang/String.charAt (I)C
      // 03f: sipush 32723
      // 042: ldc2_w 7096555634111213913
      // 045: lload 0
      // 046: lxor
      // 047: invokedynamic a (IJ)I bsm=com/zelix/jf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: if_icmpne 056
      // 04f: iinc 4 1
      // 052: iload 3
      // 053: ifeq 039
      // 056: aload 2
      // 057: bipush 0
      // 058: iload 4
      // 05a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 05d: astore 5
      // 05f: iload 4
      // 061: lload 0
      // 062: lconst_0
      // 063: lcmp
      // 064: iflt 053
      // 067: iload 3
      // 068: lload 0
      // 069: lconst_0
      // 06a: lcmp
      // 06b: iflt 09d
      // 06e: ifne 096
      // 071: aload 2
      // 072: invokevirtual java/lang/String.length ()I
      // 075: bipush 1
      // 076: isub
      // 077: if_icmpne 195
      // 07a: goto 087
      // 07d: ldc2_w 5748750926793973665
      // 080: lload 0
      // 081: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: iload 4
      // 089: goto 096
      // 08c: ldc2_w 5748750926793973665
      // 08f: lload 0
      // 090: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: lload 0
      // 097: lconst_0
      // 098: lcmp
      // 099: ifle 0d4
      // 09c: iload 3
      // 09d: ifne 0d4
      // 0a0: ifle 177
      // 0a3: goto 0b0
      // 0a6: ldc2_w 5748750926793973665
      // 0a9: lload 0
      // 0aa: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 2
      // 0b1: iload 3
      // 0b2: ifne 176
      // 0b5: goto 0c2
      // 0b8: ldc2_w 5748750926793973665
      // 0bb: lload 0
      // 0bc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: iload 4
      // 0c4: invokevirtual java/lang/String.charAt (I)C
      // 0c7: goto 0d4
      // 0ca: ldc2_w 5748750926793973665
      // 0cd: lload 0
      // 0ce: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: tableswitch 128 66 90 116 116 116 128 116 128 128 116 116 128 128 128 128 128 128 128 128 116 128 128 128 128 128 128 116
      // 148: aload 2
      // 149: areturn
      // 14a: ldc2_w 5748750926793973665
      // 14d: lload 0
      // 14e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: new java/lang/StringBuilder
      // 157: dup
      // 158: invokespecial java/lang/StringBuilder.<init> ()V
      // 15b: aload 5
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 160: ldc "L"
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: aload 2
      // 166: iload 4
      // 168: invokevirtual java/lang/String.charAt (I)C
      // 16b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 16e: ldc ";"
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 176: areturn
      // 177: new java/lang/StringBuilder
      // 17a: dup
      // 17b: invokespecial java/lang/StringBuilder.<init> ()V
      // 17e: aload 5
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 183: ldc "L"
      // 185: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 188: aload 2
      // 189: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18c: ldc ";"
      // 18e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 191: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 194: areturn
      // 195: new java/lang/StringBuilder
      // 198: dup
      // 199: invokespecial java/lang/StringBuilder.<init> ()V
      // 19c: aload 5
      // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a1: ldc "L"
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a6: aload 2
      // 1a7: iload 4
      // 1a9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1af: ldc ";"
      // 1b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b7: areturn
   }

   public _v E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 28005279226750L;
      long var6 = var2 ^ 10280344408076L;
      long var8 = var2 ^ 92426048579348L;
      int var10000 = m44.a<"o">(-3788741500339311217L, var2);
      String var11 = m44.a<"o">(new Object[]{var6, this.g(var8)}, -3898801711691617344L, var2);
      int var10 = var10000;

      try {
         if (var10 != 0) {
            return l62.G(var4, var11);
         }

         if (var11 == null) {
            return null;
         }
      } catch (n9 var12) {
         throw m44.a<"o">(var12, -3000524439451597251L, var2);
      }

      return l62.G(var4, var11);
   }

   public boolean e(long var1, gu var3, Object var4, Object var5) {
      long var6 = var1 ^ 12215597448316L;
      return var3.K(this, var4, var6, var5);
   }

   public x8 F() {
      return this.m;
   }

   public static jf C(String param0, long param1, Collection param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/jf.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 17259918560511
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w 6953826178124023396
      // 12: lload 1
      // 13: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 3
      // 19: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1e: astore 7
      // 20: istore 6
      // 22: aload 7
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 73
      // 2c: aload 7
      // 2e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33: checkcast com/zelix/jf
      // 36: astore 8
      // 38: aload 8
      // 3a: iload 6
      // 3c: ifne 6d
      // 3f: lload 4
      // 41: invokevirtual com/zelix/jf.g (J)Ljava/lang/String;
      // 44: aload 0
      // 45: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48: lload 1
      // 49: lconst_0
      // 4a: lcmp
      // 4b: ifle 70
      // 4e: ifeq 6e
      // 51: goto 5e
      // 54: ldc2_w 9056920640636300758
      // 57: lload 1
      // 58: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 8
      // 60: goto 6d
      // 63: ldc2_w 9056920640636300758
      // 66: lload 1
      // 67: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: areturn
      // 6e: iload 6
      // 70: ifeq 22
      // 73: aconst_null
      // 74: areturn
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18629;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/jf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("com/zelix/jf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
