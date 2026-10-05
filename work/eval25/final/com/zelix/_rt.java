package com.zelix;

import java.awt.Component;
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
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class _rt extends DefaultListCellRenderer {
   final q5 j;
   _nx I;
   private static final long a = ess.a(-8813925325985106510L, 6629466439065510149L, MethodHandles.lookup().lookupClass()).a(278439828895127L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public Component getListCellRendererComponent(JList param1, Object param2, int param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_rt.a J
      // 003: ldc2_w 118695825677461
      // 006: lxor
      // 007: lstore 6
      // 009: lload 6
      // 00b: dup2
      // 00c: ldc2_w 92259126240237
      // 00f: lxor
      // 010: lstore 8
      // 012: pop2
      // 013: aload 0
      // 014: aload 1
      // 015: aload 2
      // 016: iload 3
      // 017: iload 4
      // 019: iload 5
      // 01b: invokespecial javax/swing/DefaultListCellRenderer.getListCellRendererComponent (Ljavax/swing/JList;Ljava/lang/Object;IZZ)Ljava/awt/Component;
      // 01e: pop
      // 01f: ldc2_w -6723695299088315745
      // 022: lload 6
      // 024: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: aload 2
      // 02a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 02d: astore 11
      // 02f: aload 11
      // 031: astore 12
      // 033: astore 10
      // 035: aload 12
      // 037: ldc "."
      // 039: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03c: aload 10
      // 03e: ifnull 0a2
      // 041: ifeq 06e
      // 044: goto 052
      // 047: ldc2_w -4699644282872842641
      // 04a: lload 6
      // 04c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: athrow
      // 052: aload 0
      // 053: ldc2_w -4855561695616613232
      // 056: lload 6
      // 058: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/q5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: ldc2_w -5061361604280405432
      // 060: lload 6
      // 062: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: astore 12
      // 069: aload 10
      // 06b: ifnonnull 0f5
      // 06e: aload 12
      // 070: aload 10
      // 072: ifnull 0db
      // 075: goto 083
      // 078: ldc2_w -4699644282872842641
      // 07b: lload 6
      // 07d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: sipush 21680
      // 086: ldc2_w 6294571061822515132
      // 089: lload 6
      // 08b: lxor
      // 08c: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/_rt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 094: goto 0a2
      // 097: ldc2_w -4699644282872842641
      // 09a: lload 6
      // 09c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: ifeq 0f5
      // 0a5: aload 0
      // 0a6: ldc2_w -4855561695616613232
      // 0a9: lload 6
      // 0ab: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/q5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: ldc2_w -4978092438886204786
      // 0b3: lload 6
      // 0b5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: aload 10
      // 0bc: ifnull 0fe
      // 0bf: goto 0cd
      // 0c2: ldc2_w -4699644282872842641
      // 0c5: lload 6
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: ldc2_w -4626965188546426588
      // 0d0: lload 6
      // 0d2: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: astore 12
      // 0d9: aload 12
      // 0db: ifnonnull 0f5
      // 0de: aload 0
      // 0df: ldc2_w -4855561695616613232
      // 0e2: lload 6
      // 0e4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/q5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: ldc2_w -5061361604280405432
      // 0ec: lload 6
      // 0ee: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: astore 12
      // 0f5: new java/io/File
      // 0f8: dup
      // 0f9: aload 12
      // 0fb: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0fe: astore 13
      // 100: aload 0
      // 101: ldc2_w -4975490704447909191
      // 104: lload 6
      // 106: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_nx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: aload 13
      // 10d: lload 8
      // 10f: bipush 2
      // 110: anewarray 119
      // 113: dup_x2
      // 114: dup_x2
      // 115: pop
      // 116: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 119: bipush 1
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x1
      // 11d: swap
      // 11e: bipush 0
      // 11f: swap
      // 120: aastore
      // 121: ldc2_w -4699679373251370920
      // 124: lload 6
      // 126: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljavax/swing/Icon; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: astore 14
      // 12d: aload 14
      // 12f: ifnull 14d
      // 132: aload 0
      // 133: aload 14
      // 135: ldc2_w -4805630990212346490
      // 138: lload 6
      // 13a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: goto 14d
      // 142: ldc2_w -4699644282872842641
      // 145: lload 6
      // 147: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: aload 11
      // 14f: ldc "."
      // 151: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 154: aload 10
      // 156: ifnull 18b
      // 159: ifne 1a1
      // 15c: goto 16a
      // 15f: ldc2_w -4699644282872842641
      // 162: lload 6
      // 164: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 11
      // 16c: sipush 32378
      // 16f: ldc2_w 3595620676903783799
      // 172: lload 6
      // 174: lxor
      // 175: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/_rt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17d: goto 18b
      // 180: ldc2_w -4699644282872842641
      // 183: lload 6
      // 185: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 10
      // 18d: ifnull 1f7
      // 190: ifeq 1c1
      // 193: goto 1a1
      // 196: ldc2_w -4699644282872842641
      // 199: lload 6
      // 19b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: aload 11
      // 1a4: ldc2_w -4837319190521720710
      // 1a7: lload 6
      // 1a9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: aload 10
      // 1b0: ifnonnull 249
      // 1b3: goto 1c1
      // 1b6: ldc2_w -4699644282872842641
      // 1b9: lload 6
      // 1bb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: aload 10
      // 1c4: ifnull 233
      // 1c7: goto 1d5
      // 1ca: ldc2_w -4699644282872842641
      // 1cd: lload 6
      // 1cf: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: ldc2_w -4855561695616613232
      // 1d8: lload 6
      // 1da: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/q5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: ldc2_w -6736829649947717284
      // 1e2: lload 6
      // 1e4: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: goto 1f7
      // 1ec: ldc2_w -4699644282872842641
      // 1ef: lload 6
      // 1f1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: athrow
      // 1f7: ifeq 224
      // 1fa: aload 0
      // 1fb: aload 13
      // 1fd: ldc2_w -6839217012183537387
      // 200: lload 6
      // 202: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: ldc2_w -4837319190521720710
      // 20a: lload 6
      // 20c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: aload 10
      // 213: ifnonnull 249
      // 216: goto 224
      // 219: ldc2_w -4699644282872842641
      // 21c: lload 6
      // 21e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: aload 0
      // 225: goto 233
      // 228: ldc2_w -4699644282872842641
      // 22b: lload 6
      // 22d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aload 13
      // 235: ldc2_w -5162467802614508090
      // 238: lload 6
      // 23a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: ldc2_w -4837319190521720710
      // 242: lload 6
      // 244: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: aload 0
      // 24a: areturn
   }

   _rt(q5 var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 2398937788618L;
      int var4 = (int)((var2 ^ 2398937788618L) >>> 32);
      int var5 = (int)((var2 ^ 2398937788618L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      this.j = var1;
      super();
      x44.a<"q">(this, new _nx(var4, (char)var5, (short)var6), -979895284279109076L, var2);
   }

   static {
      long var0 = a ^ 66002948475452L;
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
      String var6 = " \u009d\u0002úD\u001d\u0010\u009cW\u0007¸³8\u0099*Ò\u0010;0è\u0003uN$m\u0088ä\u0014ÕÝN\u001b²";
      int var8 = " \u009d\u0002úD\u001d\u0010\u009cW\u0007¸³8\u0099*Ò\u0010;0è\u0003uN$m\u0088ä\u0014ÕÝN\u001b²".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8057;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_rt", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/_rt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
