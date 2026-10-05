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

public class x7 extends x9 implements _u0, _zv {
   static final w5 K;
   mx r;
   private static final long a = ess.a(8614394642901177113L, -2262731800621019895L, MethodHandles.lookup().lookupClass()).a(119734273669636L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public void C(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/util/HashMap
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/x7.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 66131760710999
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 65887398282050
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w 2244654717920574151
      // 02d: lload 2
      // 02e: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 9
      // 035: aload 0
      // 036: aload 9
      // 038: ifnonnull 073
      // 03b: getfield com/zelix/x7.j Lcom/zelix/_83;
      // 03e: lload 7
      // 040: bipush 1
      // 041: anewarray 319
      // 044: dup_x2
      // 045: dup_x2
      // 046: pop
      // 047: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04a: bipush 0
      // 04b: swap
      // 04c: aastore
      // 04d: ldc2_w 152266978214871205
      // 050: lload 2
      // 051: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: aload 0
      // 057: if_acmpne 072
      // 05a: goto 067
      // 05d: ldc2_w 541864883176664275
      // 060: lload 2
      // 061: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: return
      // 068: ldc2_w 541864883176664275
      // 06b: lload 2
      // 06c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 0
      // 073: getfield com/zelix/x7.r Lcom/zelix/mx;
      // 076: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 079: astore 10
      // 07b: aload 4
      // 07d: aload 10
      // 07f: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 082: checkcast java/lang/String
      // 085: astore 11
      // 087: aload 11
      // 089: aload 9
      // 08b: ifnonnull 0fb
      // 08e: ifnull 0e8
      // 091: goto 09e
      // 094: ldc2_w 541864883176664275
      // 097: lload 2
      // 098: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 11
      // 0a0: aload 10
      // 0a2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a5: lload 2
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 100
      // 0ab: aload 9
      // 0ad: ifnonnull 100
      // 0b0: goto 0bd
      // 0b3: ldc2_w 541864883176664275
      // 0b6: lload 2
      // 0b7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: ifne 0e8
      // 0c0: goto 0cd
      // 0c3: ldc2_w 541864883176664275
      // 0c6: lload 2
      // 0c7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: getfield com/zelix/x7.r Lcom/zelix/mx;
      // 0d1: aload 11
      // 0d3: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // 0d6: aload 9
      // 0d8: ifnull 119
      // 0db: goto 0e8
      // 0de: ldc2_w 541864883176664275
      // 0e1: lload 2
      // 0e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 10
      // 0ea: aload 4
      // 0ec: lload 5
      // 0ee: ldc2_w 1817459490995083263
      // 0f1: lload 2
      // 0f2: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: astore 11
      // 0f9: aload 10
      // 0fb: aload 11
      // 0fd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 100: ifne 119
      // 103: aload 0
      // 104: getfield com/zelix/x7.r Lcom/zelix/mx;
      // 107: aload 11
      // 109: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // 10c: goto 119
      // 10f: ldc2_w 541864883176664275
      // 112: lload 2
      // 113: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: return
   }

   public String a(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 9121035281952L;
      String var5 = this.r.u();
      return o(var3, var5);
   }

   x7(int var1, int var2, _83 var3, short var4, short var5, mx var6) {
      long var7 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 138852105040853L;
      this(var1, var3, var9, var6, null);
   }

   public String N(long var1) {
      long var3 = var1 ^ 56211538473232L;
      return x44.a<"m">(this, new Object[]{var3}, -2686273882761342250L, var1);
   }

   public String W(long var1) {
      String[] var10000 = x44.a<"q">(-7617879561339079770L, var1);
      String var4 = this.r.u();
      String[] var3 = var10000;

      try {
         if (var3 != null) {
            return var4;
         }

         if (var4.indexOf(b<"v">(17799, 2751555537792262512L ^ var1)) == -1) {
            return var4;
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, -8150301150304574030L, var1);
      }

      return var4.replace((char)b<"v">(17799, 2751555537792262512L ^ var1), (char)b<"v">(25184, 5405109335182165653L ^ var1));
   }

   public hy M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 114003103463995L;
      long var6 = var2 ^ 62936180388533L;
      long var8 = var2 ^ 15823802171698L;
      String[] var10000 = x44.a<"r">(-6017726880326563427L, var2);
      String var11 = x44.a<"r">(new Object[]{this.W(var4), var8}, -5228855659034887969L, var2);
      String[] var10 = var10000;

      try {
         if (var10 != null) {
            return yn.Z(var6, var11);
         }

         if (var11 == null) {
            return null;
         }
      } catch (gj var12) {
         throw x44.a<"r">(var12, -5413546764586229879L, var2);
      }

      return yn.Z(var6, var11);
   }

   public boolean t(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 119044374785774L;
      return this.W(var3).startsWith("[");
   }

   void V(DataOutputStream param1, long param2, Map param4) {
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
      // 0a: getstatic com/zelix/x7.K Lcom/zelix/w5;
      // 0d: invokevirtual com/zelix/w5.l ()I
      // 10: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 13: astore 5
      // 15: aload 4
      // 17: aload 0
      // 18: getfield com/zelix/x7.r Lcom/zelix/mx;
      // 1b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 20: checkcast com/zelix/mx
      // 23: checkcast com/zelix/mx
      // 26: astore 6
      // 28: aload 5
      // 2a: lload 2
      // 2b: lconst_0
      // 2c: lcmp
      // 2d: iflt 63
      // 30: ifnonnull 5b
      // 33: aload 6
      // 35: ifnull 66
      // 38: goto 45
      // 3b: ldc2_w 5743070474077316325
      // 3e: lload 2
      // 3f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 1
      // 46: aload 6
      // 48: invokevirtual com/zelix/mx.B ()I
      // 4b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 4e: goto 5b
      // 51: ldc2_w 5743070474077316325
      // 54: lload 2
      // 55: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: lload 2
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: iflt 71
      // 61: aload 5
      // 63: ifnull 7e
      // 66: aload 1
      // 67: aload 0
      // 68: getfield com/zelix/x7.r Lcom/zelix/mx;
      // 6b: invokevirtual com/zelix/mx.B ()I
      // 6e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 71: goto 7e
      // 74: ldc2_w 5743070474077316325
      // 77: lload 2
      // 78: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: return
   }

   static {
      long var0 = a ^ 17982030994178L;
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
      String var6 = "=TÍÀ&¯S\u0010¿ÔbÿâÌ\u009bn\u0086pw/þ&Ç7";
      int var7 = "=TÍÀ&¯S\u0010¿ÔbÿâÌ\u009bn\u0086pw/þ&Ç7".length();
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
                     K = w5.l;
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ÔÁø\u0098óBM\u008e)W}ð¸Zd=";
                  var7 = "ÔÁø\u0098óBM\u008e)W}ð¸Zd=".length();
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

   public w5 m(long var1) {
      return K;
   }

   private static String o(long param0, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/x7.a J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: ldc2_w 82078977302291650
      // 009: lload 0
      // 00a: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: astore 3
      // 010: aload 2
      // 011: ldc ";"
      // 013: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 016: aload 3
      // 017: ifnonnull 037
      // 01a: ifeq 036
      // 01d: goto 02a
      // 020: ldc2_w 1837487109258015446
      // 023: lload 0
      // 024: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: athrow
      // 02a: aload 2
      // 02b: areturn
      // 02c: ldc2_w 1837487109258015446
      // 02f: lload 0
      // 030: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: athrow
      // 036: bipush 0
      // 037: istore 4
      // 039: aload 2
      // 03a: iload 4
      // 03c: invokevirtual java/lang/String.charAt (I)C
      // 03f: sipush 15154
      // 042: ldc2_w 8377730228256475301
      // 045: lload 0
      // 046: lxor
      // 047: invokedynamic v (IJ)I bsm=com/zelix/x7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: if_icmpne 056
      // 04f: iinc 4 1
      // 052: aload 3
      // 053: ifnull 039
      // 056: aload 2
      // 057: bipush 0
      // 058: iload 4
      // 05a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 05d: astore 5
      // 05f: lload 0
      // 060: lconst_0
      // 061: lcmp
      // 062: ifle 052
      // 065: iload 4
      // 067: aload 3
      // 068: lload 0
      // 069: lconst_0
      // 06a: lcmp
      // 06b: ifle 09d
      // 06e: ifnonnull 096
      // 071: aload 2
      // 072: invokevirtual java/lang/String.length ()I
      // 075: bipush 1
      // 076: isub
      // 077: if_icmpne 195
      // 07a: goto 087
      // 07d: ldc2_w 1837487109258015446
      // 080: lload 0
      // 081: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: iload 4
      // 089: goto 096
      // 08c: ldc2_w 1837487109258015446
      // 08f: lload 0
      // 090: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: lload 0
      // 097: lconst_0
      // 098: lcmp
      // 099: iflt 0d4
      // 09c: aload 3
      // 09d: ifnonnull 0d4
      // 0a0: ifle 177
      // 0a3: goto 0b0
      // 0a6: ldc2_w 1837487109258015446
      // 0a9: lload 0
      // 0aa: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 2
      // 0b1: aload 3
      // 0b2: ifnonnull 176
      // 0b5: goto 0c2
      // 0b8: ldc2_w 1837487109258015446
      // 0bb: lload 0
      // 0bc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: iload 4
      // 0c4: invokevirtual java/lang/String.charAt (I)C
      // 0c7: goto 0d4
      // 0ca: ldc2_w 1837487109258015446
      // 0cd: lload 0
      // 0ce: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: tableswitch 128 66 90 116 116 116 128 116 128 128 116 116 128 128 128 128 128 128 128 128 116 128 128 128 128 128 128 116
      // 148: aload 2
      // 149: areturn
      // 14a: ldc2_w 1837487109258015446
      // 14d: lload 0
      // 14e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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

   public mx i() {
      return this.r;
   }

   public hz C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 140322468892835L;
      long var6 = var2 ^ 24551921429418L;
      long var8 = var2 ^ 77469546313131L;
      String[] var10000 = x44.a<"r">(496703798736413445L, var2);
      String var11 = x44.a<"r">(new Object[]{this.W(var4), var6}, 2159272935439372871L, var2);
      String[] var10 = var10000;

      try {
         if (var10 != null) {
            return yn.x(var8, var11);
         }

         if (var11 == null) {
            return null;
         }
      } catch (gj var12) {
         throw x44.a<"r">(var12, 2181765142487430417L, var2);
      }

      return yn.x(var8, var11);
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public static x7 y(String param0, Collection param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/x7.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 42145401347833
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w -8593153194169602721
      // 12: lload 2
      // 13: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 1
      // 19: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1e: astore 7
      // 20: astore 6
      // 22: aload 7
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 6d
      // 2c: aload 7
      // 2e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33: checkcast com/zelix/x7
      // 36: astore 8
      // 38: aload 8
      // 3a: aload 6
      // 3c: ifnonnull 67
      // 3f: lload 4
      // 41: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 44: aload 0
      // 45: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48: ifeq 68
      // 4b: goto 58
      // 4e: ldc2_w -8062157888613876917
      // 51: lload 2
      // 52: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 8
      // 5a: goto 67
      // 5d: ldc2_w -8062157888613876917
      // 60: lload 2
      // 61: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: areturn
      // 68: aload 6
      // 6a: ifnull 22
      // 6d: aconst_null
      // 6e: areturn
   }

   void T(long var1, DataOutputStream var3) {
      var3.writeByte(K.l());
      var3.writeShort(this.r.B());
   }

   x7(int var1, _83 var2, long var3, mx var5, _y4 var6) {
      var3 = a ^ var3;
      long var7 = var3 ^ 87331351870452L;
      String[] var10000 = x44.a<"p">(3282769086469720175L, var3);
      super(var1, var2);
      String[] var9 = var10000;

      label20: {
         try {
            this.r = var5;
            var12 = var6;
            if (var9 != null) {
               break label20;
            }

            if (var6 == null) {
               return;
            }
         } catch (gj var10) {
            throw x44.a<"p">(var10, 3831780121806036603L, var3);
         }

         var12 = var6;
      }

      var12.G(var5, this, var7);
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
      // 2d: getfield com/zelix/x7.r Lcom/zelix/mx;
      // 30: aload 1
      // 31: if_acmpne 55
      // 34: goto 42
      // 37: ldc2_w -5115464997708017068
      // 3a: lload 6
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 51
      // 46: ldc2_w -5115464997708017068
      // 49: lload 6
      // 4b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 3
      // 52: putfield com/zelix/x7.r Lcom/zelix/mx;
      // 55: return
   }

   public void b(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      this.r.v(var4);
   }

   public String u(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.r.u().replace((char)b<"v">(29153, 5949372945789024187L ^ var2), (char)b<"v">(32168, 5986233647959112688L ^ var2));
   }

   x7(x6 var1, int var2, mx var3, int var4, _y4 var5, char var6) {
      long var7 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 1128969587001L;
      super(var1.i, var1.j);
      this.r = var3;
      var5.G(var3, this, var9);
   }

   public boolean M(long var1, String var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 43190836019358L;
      return this.W(var4).equals(var3);
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16373;
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
            throw new RuntimeException("com/zelix/x7", var14);
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
         throw new RuntimeException("com/zelix/x7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
