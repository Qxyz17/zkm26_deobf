package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ps extends ho {
   boolean t = false;
   private w2[] u;
   public static final String N;

   public synchronized boolean S() {
      return this.t;
   }

   public final void e(long param1, Object param3, Object param4, Object param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 129910742289337
      // 005: lxor
      // 006: lstore 6
      // 008: pop2
      // 009: bipush 0
      // 00a: istore 9
      // 00c: ldc2_w 3692818142906559035
      // 00f: lload 1
      // 010: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: aload 0
      // 016: dup
      // 017: astore 10
      // 019: monitorenter
      // 01a: astore 8
      // 01c: aload 0
      // 01d: aload 8
      // 01f: ifnonnull 05d
      // 022: invokevirtual com/zelix/ps.S ()Z
      // 025: ifeq 05b
      // 028: goto 035
      // 02b: ldc2_w 3167881083062921978
      // 02e: lload 1
      // 02f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: athrow
      // 035: aload 0
      // 036: getfield com/zelix/ps.A Ljava/util/List;
      // 039: aload 8
      // 03b: ifnonnull 063
      // 03e: goto 04b
      // 041: ldc2_w 3167881083062921978
      // 044: lload 1
      // 045: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: ifnonnull 05f
      // 04e: goto 05b
      // 051: ldc2_w 3167881083062921978
      // 054: lload 1
      // 055: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: aload 10
      // 05d: monitorexit
      // 05e: return
      // 05f: aload 0
      // 060: getfield com/zelix/ps.A Ljava/util/List;
      // 063: invokeinterface java/util/List.size ()I 1
      // 068: lload 1
      // 069: lconst_0
      // 06a: lcmp
      // 06b: iflt 0be
      // 06e: aload 8
      // 070: ifnonnull 0be
      // 073: istore 9
      // 075: aload 0
      // 076: lload 1
      // 077: lconst_0
      // 078: lcmp
      // 079: iflt 089
      // 07c: ldc2_w 3331111175366686075
      // 07f: lload 1
      // 080: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/w2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: ifnonnull 0af
      // 088: aload 0
      // 089: iload 9
      // 08b: anewarray 11
      // 08e: ldc2_w 3331111175366686075
      // 091: lload 1
      // 092: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/w2;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: lload 1
      // 098: lconst_0
      // 099: lcmp
      // 09a: ifle 119
      // 09d: aload 8
      // 09f: ifnull 0e8
      // 0a2: goto 0af
      // 0a5: ldc2_w 3167881083062921978
      // 0a8: lload 1
      // 0a9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: iload 9
      // 0b1: goto 0be
      // 0b4: ldc2_w 3167881083062921978
      // 0b7: lload 1
      // 0b8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: ldc2_w 3331111175366686075
      // 0c2: lload 1
      // 0c3: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/w2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: arraylength
      // 0c9: if_icmple 0e8
      // 0cc: aload 0
      // 0cd: iload 9
      // 0cf: anewarray 11
      // 0d2: ldc2_w 3331111175366686075
      // 0d5: lload 1
      // 0d6: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/w2;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: goto 0e8
      // 0de: ldc2_w 3167881083062921978
      // 0e1: lload 1
      // 0e2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: aload 0
      // 0ea: getfield com/zelix/ps.A Ljava/util/List;
      // 0ed: aload 0
      // 0ee: ldc2_w 3331111175366686075
      // 0f1: lload 1
      // 0f2: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/w2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 0fc: checkcast [Lcom/zelix/w2;
      // 0ff: ldc2_w 3331111175366686075
      // 102: lload 1
      // 103: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/w2;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: aload 0
      // 109: bipush 0
      // 10a: anewarray 76
      // 10d: ldc2_w 4008813112356711102
      // 110: lload 1
      // 111: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: aload 10
      // 118: monitorexit
      // 119: goto 124
      // 11c: astore 11
      // 11e: aload 10
      // 120: monitorexit
      // 121: aload 11
      // 123: athrow
      // 124: iload 9
      // 126: bipush 1
      // 127: isub
      // 128: istore 10
      // 12a: iload 10
      // 12c: iflt 180
      // 12f: aload 0
      // 130: ldc2_w 3331111175366686075
      // 133: lload 1
      // 134: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/w2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: iload 10
      // 13b: aaload
      // 13c: aload 8
      // 13e: ifnonnull 16b
      // 141: ifnull 178
      // 144: goto 151
      // 147: ldc2_w 3167881083062921978
      // 14a: lload 1
      // 14b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: aload 0
      // 152: ldc2_w 3331111175366686075
      // 155: lload 1
      // 156: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/w2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: iload 10
      // 15d: aaload
      // 15e: goto 16b
      // 161: ldc2_w 3167881083062921978
      // 164: lload 1
      // 165: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: lload 6
      // 16d: aload 0
      // 16e: aload 3
      // 16f: aload 4
      // 171: aload 5
      // 173: invokeinterface com/zelix/w2.G (JLcom/zelix/v_;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V 7
      // 178: iinc 10 -1
      // 17b: aload 8
      // 17d: ifnull 12a
      // 180: lload 1
      // 181: lconst_0
      // 182: lcmp
      // 183: iflt 12f
      // 186: return
   }

   public synchronized void o() {
      this.t = true;
   }

   protected synchronized void f(Object[] var1) {
      this.t = false;
   }

   static {
      long var4 = ess.a(4870098819507746481L, 7284477205053940026L, MethodHandles.lookup().lookupClass()).a(123490246079794L) ^ 115584380181346L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("¸\u0085\u0016\u0003\u0090Fÿ\u0015Ì}o\u0004Äf×Î".getBytes("ISO-8859-1"));
      String var6 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var6;
      N = x44.a<"u">(var0, 3998235789022869612L, var4);
   }

   private static gj c(gj var0) {
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
