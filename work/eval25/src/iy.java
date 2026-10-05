package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class iy extends iz {
   private static final long b = ess.a(-11906511162297345L, -3300942039656973977L, MethodHandles.lookup().lookupClass()).a(270307162041865L);
   private static final String[] k;
   private static final String[] m;
   private static final Map o = new HashMap(13);

   iy(long param1, h8 param3, _xx param4, _y4 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/iy.b J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 60590287511470
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 37287780875113
      // 012: lxor
      // 013: dup2
      // 014: bipush 8
      // 016: lushr
      // 017: lstore 8
      // 019: dup2
      // 01a: bipush 56
      // 01c: lshl
      // 01d: bipush 56
      // 01f: lushr
      // 020: l2i
      // 021: istore 10
      // 023: pop2
      // 024: dup2
      // 025: ldc2_w 69946596492763
      // 028: lxor
      // 029: lstore 11
      // 02b: dup2
      // 02c: ldc2_w 113808066177926
      // 02f: lxor
      // 030: lstore 13
      // 032: dup2
      // 033: ldc2_w 38263036230831
      // 036: lxor
      // 037: lstore 15
      // 039: pop2
      // 03a: aload 0
      // 03b: aload 3
      // 03c: aload 4
      // 03e: lload 6
      // 040: aload 5
      // 042: invokespecial com/zelix/iz.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;JLcom/zelix/_y4;)V
      // 045: aload 0
      // 046: aload 0
      // 047: getfield com/zelix/iy.F I
      // 04a: anewarray 180
      // 04d: putfield com/zelix/iy.J [Lcom/zelix/h4;
      // 050: ldc2_w 5496890357128199202
      // 053: lload 1
      // 054: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: bipush 0
      // 05a: istore 18
      // 05c: istore 17
      // 05e: iload 18
      // 060: aload 0
      // 061: getfield com/zelix/iy.F I
      // 064: if_icmpge 1a6
      // 067: aload 4
      // 069: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 06c: istore 19
      // 06e: aload 3
      // 06f: lload 8
      // 071: iload 19
      // 073: iload 10
      // 075: i2b
      // 076: invokevirtual com/zelix/h8.N (JIB)Lcom/zelix/xl;
      // 079: astore 20
      // 07b: aload 20
      // 07d: iload 17
      // 07f: lload 1
      // 080: lconst_0
      // 081: lcmp
      // 082: iflt 0f1
      // 085: ifeq 0ef
      // 088: ifnonnull 0ed
      // 08b: goto 098
      // 08e: ldc2_w 5647714752907499608
      // 091: lload 1
      // 092: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: new com/zelix/_sx
      // 09b: dup
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: aload 3
      // 0a4: lload 11
      // 0a6: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 0a9: lload 13
      // 0ab: ldc2_w 6074529001720174415
      // 0ae: lload 1
      // 0af: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: sipush 22760
      // 0ba: ldc2_w 3179301916456426708
      // 0bd: lload 1
      // 0be: lxor
      // 0bf: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: iload 19
      // 0c9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0cc: sipush 20370
      // 0cf: ldc2_w 358632940186471338
      // 0d2: lload 1
      // 0d3: lxor
      // 0d4: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0df: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 0e2: athrow
      // 0e3: ldc2_w 5647714752907499608
      // 0e6: lload 1
      // 0e7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 20
      // 0ef: iload 17
      // 0f1: ifeq 179
      // 0f4: instanceof com/zelix/mx
      // 0f7: ifne 177
      // 0fa: goto 107
      // 0fd: ldc2_w 5647714752907499608
      // 100: lload 1
      // 101: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: new com/zelix/_sx
      // 10a: dup
      // 10b: new java/lang/StringBuilder
      // 10e: dup
      // 10f: invokespecial java/lang/StringBuilder.<init> ()V
      // 112: aload 3
      // 113: lload 11
      // 115: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 118: lload 13
      // 11a: ldc2_w 6074529001720174415
      // 11d: lload 1
      // 11e: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: sipush 5048
      // 129: ldc2_w 1351063463971248003
      // 12c: lload 1
      // 12d: lxor
      // 12e: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 136: iload 19
      // 138: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 13b: sipush 24567
      // 13e: ldc2_w 7787785832377686990
      // 141: lload 1
      // 142: lxor
      // 143: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b: aload 20
      // 14d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 150: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 153: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 156: sipush 7826
      // 159: ldc2_w 4791898223658982056
      // 15c: lload 1
      // 15d: lxor
      // 15e: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/iy.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 166: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 169: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 16c: athrow
      // 16d: ldc2_w 5647714752907499608
      // 170: lload 1
      // 171: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: aload 20
      // 179: checkcast com/zelix/mx
      // 17c: astore 21
      // 17e: aload 21
      // 180: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 183: astore 22
      // 185: aload 0
      // 186: getfield com/zelix/iy.J [Lcom/zelix/h4;
      // 189: iload 18
      // 18b: new com/zelix/bw
      // 18e: dup
      // 18f: aload 3
      // 190: iload 19
      // 192: aload 22
      // 194: lload 15
      // 196: aload 4
      // 198: aload 5
      // 19a: invokespecial com/zelix/bw.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 19d: aastore
      // 19e: iinc 18 1
      // 1a1: iload 17
      // 1a3: ifne 05e
      // 1a6: return
   }

   void N(long var1, _8l var3) {
   }

   iy(hz param1, mx param2, mx param3, long param4, h4[] param6, int param7) {
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
      // 00: getstatic com/zelix/iy.b J
      // 03: lload 4
      // 05: lxor
      // 06: lstore 4
      // 08: lload 4
      // 0a: dup2
      // 0b: ldc2_w 105906622675249
      // 0e: lxor
      // 0f: lstore 8
      // 11: pop2
      // 12: aload 0
      // 13: lload 8
      // 15: aload 1
      // 16: aload 2
      // 17: aload 3
      // 18: aload 6
      // 1a: iload 7
      // 1c: invokespecial com/zelix/iz.<init> (JLcom/zelix/hz;Lcom/zelix/mx;Lcom/zelix/mx;[Lcom/zelix/h4;I)V
      // 1f: ldc2_w -7462828046851463164
      // 22: lload 4
      // 24: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: bipush 0
      // 2a: istore 11
      // 2c: istore 10
      // 2e: iload 11
      // 30: aload 6
      // 32: arraylength
      // 33: if_icmpge 57
      // 36: aload 6
      // 38: iload 11
      // 3a: aaload
      // 3b: aload 0
      // 3c: bipush 1
      // 3d: anewarray 104
      // 40: dup_x1
      // 41: swap
      // 42: bipush 0
      // 43: swap
      // 44: aastore
      // 45: ldc2_w -8796196998937458076
      // 48: lload 4
      // 4a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: iinc 11 1
      // 52: iload 10
      // 54: ifne 2e
      // 57: lload 4
      // 59: lconst_0
      // 5a: lcmp
      // 5b: iflt 52
      // 5e: return
   }

   void H(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 57344457126152L;
      long var7 = var2 ^ 74841066115170L;
      boolean var10000 = x44.a<"t">(7701876789565611686L, var2);
      s3 var10 = this.r(var5);
      s3 var11 = (s3)var4.get(var10);
      boolean var9 = var10000;

      label26: {
         try {
            var15 = var11;
            if (var9) {
               break label26;
            }

            if (var11 == null) {
               return;
            }
         } catch (gj var13) {
            throw x44.a<"t">(var13, 8484124555883766661L, var2);
         }

         var15 = var11;
      }

      try {
         if (!var15.equals(var10)) {
            x44.a<"l">(this, new Object[]{x44.a<"l">(var11, new Object[0], 7717481026660382620L, var2), var7}, 8625546067257136178L, var2);
         }
      } catch (gj var12) {
         throw x44.a<"t">(var12, 8484124555883766661L, var2);
      }
   }

   public boolean k() {
      return false;
   }

   static {
      long var0 = b ^ 57543770391290L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "F{\u0099ÊM\r¿Ê\u0098X¾ó\u0003\u008a;u=càé\u00077×Cä£ø>¾î¤èÉ\u0099\u0098à\u0095\u001aÈËa\u000eß\u0082L\u008eÔ\u0012ù\u000f-\u008d9\u0004Qv\u0010J\u008a\u0084\u0081ìÒÅH¥BîÒB\u0018\u009b·8û¯\u009aC?£ä\u008fhJ\u008b#ïÐ±\\\u008b1ß1:nnØÕiåí÷\u008bt~î\u001b³ãhÔ«N\\º¹!\u000f>\fWÄ¢fÑ}ïÐ\u0005";
      int var8 = "F{\u0099ÊM\r¿Ê\u0098X¾ó\u0003\u008a;u=càé\u00077×Cä£ø>¾î¤èÉ\u0099\u0098à\u0095\u001aÈËa\u000eß\u0082L\u008eÔ\u0012ù\u000f-\u008d9\u0004Qv\u0010J\u008a\u0084\u0081ìÒÅH¥BîÒB\u0018\u009b·8û¯\u009aC?£ä\u008fhJ\u008b#ïÐ±\\\u008b1ß1:nnØÕiåí÷\u008bt~î\u001b³ãhÔ«N\\º¹!\u000f>\fWÄ¢fÑ}ïÐ\u0005"
         .length();
      char var5 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     k = var9;
                     m = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "pN\u008a\u0092yqPÍö.\"ù\u0015Ý\u001c\u0088\u0091\u009ez?\u0005fâ\u009f\u001c\u001cî|,5\u0014\u0083~\"åê\u008búñ¸Hâ\nñ\u0089ÐÏcö×\u0012\u0094âq\f^2¬¡$å* éì\u0016xEº,\u008f\u001eEb¯hþ;É¼«\u0002°=\u0003P\u0010±\u009f\u0082\u0011\u0002Ý\u0082_Ø1MÂ\u0013\u0091FðBæ À ¡^\u009fNì";
                  var8 = "pN\u008a\u0092yqPÍö.\"ù\u0015Ý\u001c\u0088\u0091\u009ez?\u0005fâ\u009f\u001c\u001cî|,5\u0014\u0083~\"åê\u008búñ¸Hâ\nñ\u0089ÐÏcö×\u0012\u0094âq\f^2¬¡$å* éì\u0016xEº,\u008f\u001eEb¯hþ;É¼«\u0002°=\u0003P\u0010±\u009f\u0082\u0011\u0002Ý\u0082_Ø1MÂ\u0013\u0091FðBæ À ¡^\u009fNì"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1234;
      if (m[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])o.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/iy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         m[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return m[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/iy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
