package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class iz extends i8 {
   private static final long a = ess.a(7849830669823925541L, 931488128414001658L, MethodHandles.lookup().lookupClass()).a(99881957396188L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long s;

   public final s3 f(Object[] var1) {
      return new s3(this.z(), this.A());
   }

   public final boolean W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 72535458896656L;
      return x44.a<"j">(this.T, new Object[]{var4}, 6863497275394646911L, var2);
   }

   public final s3 r(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 674978563314L;
      return new s3(this.w(var3), this.H());
   }

   iz(h8 var1, _xx var2, long var3, _y4 var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 98070218414091L;
      super(var1, var2, var6, var5);
   }

   public String v(long var1) {
      long var3 = var1 ^ 85368799419230L;
      return xl.b(this.A(), var3) + " " + this.z();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final String U(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 98680655569251L;
      long var6 = var2 ^ 80229275866127L;
      long var10001 = var2 ^ 45977274974330L;
      int var8 = (int)((var2 ^ 45977274974330L) >>> 48);
      int var9 = (int)((var2 ^ 45977274974330L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var2 ^ 23447813675032L;
      boolean var10000 = x44.a<"w">(-1718461760483370932L, var2);
      StringBuffer var14 = new StringBuffer();
      boolean var13 = var10000;
      Enumeration var15 = this.x(var11);

      label37:
      while (var15.hasMoreElements()) {
         try {
            var14.append(b<"u">(12822, 9125889142321188104L ^ var2));
            x44.a<"o">(var14, (char)((int)s), -1666087329760804000L, var2);
            var14.append(sh.b((String)var15.nextElement()));
            StringBuffer var19 = var14.append(mc.R);
            if (var2 <= 0L) {
               return var19.toString();
            }
         } catch (gj var17) {
            boolean var20 = false;
            throw x44.a<"w">(var17, -1551078795013261902L, var2);
         }

         do {
            try {
               if (!var13) {
                  return var14.toString();
               }

               if (var13) {
                  continue label37;
               }
            } catch (gj var16) {
               boolean var21 = false;
               throw x44.a<"w">(var16, -1551078795013261902L, var2);
            }
         } while (var2 <= 0L);
         break;
      }

      var14.append(b<"u">(3893, 42700466797981738L ^ var2));
      var14.append(this.D((char)var8, var9, (short)var10));
      var14.append(xl.b(this.H(), var4));
      var14.append(" ");
      var14.append(this.w(var6));
      var14.append(mc.R);
      return var14.toString();
   }

   public void N(Object[] var1) {
      _ue var3 = (_ue)var1[0];
      long var4 = (Long)var1[1];
      qr var7 = (qr)var1[2];
      h4 var8 = (h4)var1[3];
      _ur var2 = (_ur)var1[4];
      PrintWriter var6 = (PrintWriter)var1[5];
   }

   public final ti P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 92689834620718L;
      long var6 = var2 ^ 48553439748210L;
      return new ti(this.L(var4), this.w(var6), this.H());
   }

   public boolean K() {
      return true;
   }

   public boolean c(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.w.u().equals(b<"u">(31902, 5711763256004938113L ^ var2));
   }

   public final String T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 20829185128542L;
      return xl.b(this.H(), var4);
   }

   public String g(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 21260823721203L;
      long var6 = var2 ^ 2328405901727L;
      return xl.b(this.H(), var4) + " " + this.w(var6);
   }

   iz(long param1, hz param3, mx param4, mx param5, h4[] param6, int param7) {
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
      // 00: getstatic com/zelix/iz.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: aload 0
      // 07: aload 3
      // 08: aload 4
      // 0a: aload 5
      // 0c: aload 6
      // 0e: iload 7
      // 10: invokespecial com/zelix/i8.<init> (Lcom/zelix/hz;Lcom/zelix/mx;Lcom/zelix/mx;[Lcom/zelix/h4;I)V
      // 13: ldc2_w 175347301730432554
      // 16: lload 1
      // 17: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: bipush 0
      // 1d: istore 9
      // 1f: istore 8
      // 21: iload 9
      // 23: aload 6
      // 25: arraylength
      // 26: if_icmpge 49
      // 29: aload 6
      // 2b: iload 9
      // 2d: aaload
      // 2e: aload 0
      // 2f: bipush 1
      // 30: anewarray 81
      // 33: dup_x1
      // 34: swap
      // 35: bipush 0
      // 36: swap
      // 37: aastore
      // 38: ldc2_w 187617390589594899
      // 3b: lload 1
      // 3c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: iinc 9 1
      // 44: iload 8
      // 46: ifeq 21
      // 49: lload 1
      // 4a: lconst_0
      // 4b: lcmp
      // 4c: ifle 44
      // 4f: return
   }

   String N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 47539409408373L;

      StringBuilder var10000;
      try {
         var10000 = new StringBuilder();
         if (this.n(var4)) {
            return var10000.append(b<"u">(22910, 4738343595940612680L ^ var2)).append(this.H()).toString();
         }
      } catch (gj var6) {
         throw x44.a<"t">(var6, 455525102824069529L, var2);
      }

      return var10000.append(":").append(this.H()).toString();
   }

   public final void M(Object[] var1) {
      boolean var4 = (Boolean)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 70806436296632L;
      h2 var10000 = this.T;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var5;
      x44.a<"l">(var10000, var10004, 404621159309973206L, var2);
   }

   iz(long var1, h8 var3, _xx var4, _y4 var5, PrintWriter var6) {
      var1 = a ^ var1;
      long var7 = var1 ^ 75301390458773L;
      super(var7, var3, var4, var5, var6);
   }

   hj f(Object[] param1) {
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
      // 0c: ldc2_w 7290398567230296424
      // 0f: lload 2
      // 10: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: bipush 0
      // 16: istore 5
      // 18: istore 4
      // 1a: iload 5
      // 1c: aload 0
      // 1d: getfield com/zelix/iz.J [Lcom/zelix/h4;
      // 20: arraylength
      // 21: if_icmpge 69
      // 24: aload 0
      // 25: getfield com/zelix/iz.J [Lcom/zelix/h4;
      // 28: iload 5
      // 2a: aaload
      // 2b: iload 4
      // 2d: ifne 5d
      // 30: instanceof com/zelix/hj
      // 33: lload 2
      // 34: lconst_0
      // 35: lcmp
      // 36: iflt 66
      // 39: ifeq 61
      // 3c: goto 49
      // 3f: ldc2_w 8792262893120415183
      // 42: lload 2
      // 43: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: getfield com/zelix/iz.J [Lcom/zelix/h4;
      // 4d: iload 5
      // 4f: aaload
      // 50: goto 5d
      // 53: ldc2_w 8792262893120415183
      // 56: lload 2
      // 57: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: checkcast com/zelix/hj
      // 60: areturn
      // 61: iinc 5 1
      // 64: iload 4
      // 66: ifeq 1a
      // 69: lload 2
      // 6a: lconst_0
      // 6b: lcmp
      // 6c: ifle 24
      // 6f: aconst_null
      // 70: areturn
   }

   static {
      long var5 = a ^ 64583814506328L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "\u0086·\u009aZ¿ñf³q2\u009a0_Ìí\u0012(râhß|\r\u009c¨·ôÑëÂÉBk$ýve1ê-û«Ð\u008fæä(ÉÏàjï±\"~\u0099«";
      int var13 = "\u0086·\u009aZ¿ñf³q2\u009a0_Ìí\u0012(râhß|\r\u009c¨·ôÑëÂÉBk$ýve1ê-û«Ð\u008fæä(ÉÏàjï±\"~\u0099«".length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     d = var14;
                     h = new String[4];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 8828427094467979805L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)((int)(var2 >>> 56)),
                           (byte)((int)(var2 >>> 48)),
                           (byte)((int)(var2 >>> 40)),
                           (byte)((int)(var2 >>> 32)),
                           (byte)((int)(var2 >>> 24)),
                           (byte)((int)(var2 >>> 16)),
                           (byte)((int)(var2 >>> 8)),
                           (byte)((int)var2)
                        }
                     );
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     s = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "W\u001df<v\u0005Ò¢§S,L\u0005Í(\u0099\u0010a+øCð5uYÔ\\Y\\-Ô\u000bï";
                  var13 = "W\u001df<v\u0005Ò¢§S,L\u0005Í(\u0099\u0010a+øCð5uYÔ\\Y\\-Ô\u000bï".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23449;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/iz", var10);
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
         h[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/iz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
