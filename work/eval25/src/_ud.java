package com.zelix;

import java.awt.Color;
import java.awt.Component;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class _ud {
   public static String v;
   public static final String z;
   public static Class[] Q;
   private static final long a = ess.a(-4369572895613330535L, -8373096337456562421L, MethodHandles.lookup().lookupClass()).a(138402716569658L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static void J(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/awt/Component
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/_ud.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: lload 2
      // 1a: dup2
      // 1b: ldc2_w 65005200183564
      // 1e: lxor
      // 1f: lstore 4
      // 21: pop2
      // 22: ldc2_w 5159923277831958452
      // 25: lload 2
      // 26: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 6
      // 2d: aload 6
      // 2f: ifnull 76
      // 32: ldc2_w 4887166236876635950
      // 35: lload 2
      // 36: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: ifeq 81
      // 3e: goto 4b
      // 41: ldc2_w 4935239421857181463
      // 44: lload 2
      // 45: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 1
      // 4c: lload 4
      // 4e: bipush 2
      // 4f: anewarray 86
      // 52: dup_x2
      // 53: dup_x2
      // 54: pop
      // 55: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 58: bipush 1
      // 59: swap
      // 5a: aastore
      // 5b: dup_x1
      // 5c: swap
      // 5d: bipush 0
      // 5e: swap
      // 5f: aastore
      // 60: ldc2_w 6364505302615229167
      // 63: lload 2
      // 64: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: goto 76
      // 6c: ldc2_w 4935239421857181463
      // 6f: lload 2
      // 70: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: lload 2
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt 92
      // 7c: aload 6
      // 7e: ifnonnull 9f
      // 81: new com/zelix/_ny
      // 84: dup
      // 85: aload 1
      // 86: invokespecial com/zelix/_ny.<init> (Ljava/awt/Component;)V
      // 89: ldc2_w 6767129319657911029
      // 8c: lload 2
      // 8d: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: goto 9f
      // 95: ldc2_w 4935239421857181463
      // 98: lload 2
      // 99: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: return
   }

   public static boolean a(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/awt/Color
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/_ud.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w -1333682296870025902
      // 1c: lload 1
      // 1d: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 3
      // 23: ldc2_w -706246185492580003
      // 26: lload 1
      // 27: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 3
      // 2d: ldc2_w -1151634229170493065
      // 30: lload 1
      // 31: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: iadd
      // 37: aload 3
      // 38: ldc2_w -927427439022814074
      // 3b: lload 1
      // 3c: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: iadd
      // 42: istore 5
      // 44: astore 4
      // 46: sipush 29536
      // 49: ldc2_w 6481720463477064035
      // 4c: lload 1
      // 4d: lxor
      // 4e: invokedynamic a (IJ)I bsm=com/zelix/_ud.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: iload 5
      // 55: isub
      // 56: aload 4
      // 58: ifnull 86
      // 5b: sipush 11713
      // 5e: ldc2_w 6943246702925881285
      // 61: lload 1
      // 62: lxor
      // 63: invokedynamic a (IJ)I bsm=com/zelix/_ud.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: if_icmpge 89
      // 6b: goto 78
      // 6e: ldc2_w -1253394882690972175
      // 71: lload 1
      // 72: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: bipush 1
      // 79: goto 86
      // 7c: ldc2_w -1253394882690972175
      // 7f: lload 1
      // 80: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: goto 8a
      // 89: bipush 0
      // 8a: ireturn
   }

   public static void q(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast javax/swing/JEditorPane
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 1
      // 1a: pop
      // 1b: getstatic com/zelix/_ud.a J
      // 1e: lload 2
      // 1f: lxor
      // 20: lstore 2
      // 21: lload 2
      // 22: dup2
      // 23: ldc2_w 100090348627220
      // 26: lxor
      // 27: lstore 5
      // 29: pop2
      // 2a: ldc2_w -4349089684817384565
      // 2d: lload 2
      // 2e: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: astore 7
      // 35: aload 7
      // 37: ifnull 85
      // 3a: ldc2_w -4040321691362657519
      // 3d: lload 2
      // 3e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: ifeq 8a
      // 46: goto 53
      // 49: ldc2_w -4593063574047773912
      // 4c: lload 2
      // 4d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: aload 4
      // 55: aload 1
      // 56: lload 5
      // 58: bipush 3
      // 59: anewarray 86
      // 5c: dup_x2
      // 5d: dup_x2
      // 5e: pop
      // 5f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62: bipush 2
      // 63: swap
      // 64: aastore
      // 65: dup_x1
      // 66: swap
      // 67: bipush 1
      // 68: swap
      // 69: aastore
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: ldc2_w -4415943433033649972
      // 72: lload 2
      // 73: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: goto 85
      // 7b: ldc2_w -4593063574047773912
      // 7e: lload 2
      // 7f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: aload 7
      // 87: ifnonnull a1
      // 8a: new com/zelix/m6
      // 8d: dup
      // 8e: aload 4
      // 90: aload 1
      // 91: invokespecial com/zelix/m6.<init> (Ljavax/swing/JEditorPane;Ljava/lang/String;)V
      // 94: astore 8
      // 96: aload 8
      // 98: ldc2_w -2749734151182436662
      // 9b: lload 2
      // 9c: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: return
   }

   public static gh y(Object[] var0) {
      JFrame var1 = (JFrame)var0[0];
      String var5 = (String)var0[1];
      long var3 = (Long)var0[2];
      String var2 = (String)var0[3];
      String var6 = (String)var0[4];
      var3 = a ^ var3;
      long var10001 = var3 ^ 68222312855870L;
      int var7 = (int)((var3 ^ 68222312855870L) >>> 48);
      int var8 = (int)((var3 ^ 68222312855870L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var3 ^ 96652881848846L;

      try {
         if (var6.length() > b<"a">(28278, 4655353414082776297L ^ var3)) {
            return new gv((short)var7, (char)var8, var1, var5, var9, var2, var6);
         }
      } catch (gj var12) {
         throw x44.a<"r">(var12, 9080204216189064553L, var3);
      }

      return new wf(var1, var5, var10, var6);
   }

   public static boolean u(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/awt/Color
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/_ud.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w 6789354510995977751
      // 1c: lload 1
      // 1d: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 3
      // 23: ldc2_w 5005617011371592216
      // 26: lload 1
      // 27: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 3
      // 2d: ldc2_w 4846431980785834546
      // 30: lload 1
      // 31: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: iadd
      // 37: aload 3
      // 38: ldc2_w 4639960341245198275
      // 3b: lload 1
      // 3c: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: iadd
      // 42: istore 5
      // 44: astore 4
      // 46: iload 5
      // 48: aload 4
      // 4a: ifnull 78
      // 4d: sipush 29550
      // 50: ldc2_w 4099409765844546094
      // 53: lload 1
      // 54: lxor
      // 55: invokedynamic a (IJ)I bsm=com/zelix/_ud.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: if_icmpge 7b
      // 5d: goto 6a
      // 60: ldc2_w 6763954801632884404
      // 63: lload 1
      // 64: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 78
      // 6e: ldc2_w 6763954801632884404
      // 71: lload 1
      // 72: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: goto 7c
      // 7b: bipush 0
      // 7c: ireturn
   }

   public static boolean X(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/awt/Color
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/awt/Color
      // 018: astore 1
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Integer
      // 01f: invokevirtual java/lang/Integer.intValue ()I
      // 022: istore 5
      // 024: pop
      // 025: getstatic com/zelix/_ud.a J
      // 028: lload 3
      // 029: lxor
      // 02a: lstore 3
      // 02b: aload 2
      // 02c: ldc2_w 560014007260776618
      // 02f: lload 3
      // 030: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: istore 7
      // 037: aload 2
      // 038: ldc2_w 140715321536567424
      // 03b: lload 3
      // 03c: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: istore 8
      // 043: ldc2_w 2056656392607839397
      // 046: lload 3
      // 047: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 2
      // 04d: ldc2_w 204461590225927537
      // 050: lload 3
      // 051: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: istore 9
      // 058: aload 1
      // 059: ldc2_w 560014007260776618
      // 05c: lload 3
      // 05d: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: istore 10
      // 064: aload 1
      // 065: ldc2_w 140715321536567424
      // 068: lload 3
      // 069: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: istore 11
      // 070: aload 1
      // 071: ldc2_w 204461590225927537
      // 074: lload 3
      // 075: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: istore 12
      // 07c: iload 7
      // 07e: iload 10
      // 080: isub
      // 081: ldc2_w 2215440947200091803
      // 084: lload 3
      // 085: invokedynamic u (IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: istore 13
      // 08c: iload 13
      // 08e: iload 8
      // 090: iload 11
      // 092: isub
      // 093: ldc2_w 2215440947200091803
      // 096: lload 3
      // 097: invokedynamic u (IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: iadd
      // 09d: istore 13
      // 09f: iload 13
      // 0a1: iload 9
      // 0a3: iload 12
      // 0a5: isub
      // 0a6: ldc2_w 2215440947200091803
      // 0a9: lload 3
      // 0aa: invokedynamic u (IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: iadd
      // 0b0: istore 13
      // 0b2: bipush 0
      // 0b3: istore 14
      // 0b5: iload 7
      // 0b7: iload 10
      // 0b9: isub
      // 0ba: ldc2_w 2215440947200091803
      // 0bd: lload 3
      // 0be: invokedynamic u (IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: istore 15
      // 0c5: astore 6
      // 0c7: iload 15
      // 0c9: istore 14
      // 0cb: iload 8
      // 0cd: iload 11
      // 0cf: isub
      // 0d0: ldc2_w 2215440947200091803
      // 0d3: lload 3
      // 0d4: invokedynamic u (IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: istore 15
      // 0db: iload 15
      // 0dd: iload 14
      // 0df: aload 6
      // 0e1: ifnull 10c
      // 0e4: if_icmple 0f8
      // 0e7: goto 0f4
      // 0ea: ldc2_w 2264311076979045382
      // 0ed: lload 3
      // 0ee: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: iload 15
      // 0f6: istore 14
      // 0f8: iload 9
      // 0fa: iload 12
      // 0fc: isub
      // 0fd: ldc2_w 2215440947200091803
      // 100: lload 3
      // 101: invokedynamic u (IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: istore 15
      // 108: iload 15
      // 10a: iload 14
      // 10c: lload 3
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: ifle 141
      // 112: aload 6
      // 114: ifnull 141
      // 117: if_icmple 12b
      // 11a: goto 127
      // 11d: ldc2_w 2264311076979045382
      // 120: lload 3
      // 121: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: iload 15
      // 129: istore 14
      // 12b: iload 13
      // 12d: aload 6
      // 12f: ifnull 17c
      // 132: iload 5
      // 134: goto 141
      // 137: ldc2_w 2264311076979045382
      // 13a: lload 3
      // 13b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: if_icmpge 16e
      // 144: iload 14
      // 146: aload 6
      // 148: ifnull 17c
      // 14b: goto 158
      // 14e: ldc2_w 2264311076979045382
      // 151: lload 3
      // 152: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: iload 5
      // 15a: bipush 2
      // 15b: imul
      // 15c: bipush 3
      // 15d: idiv
      // 15e: if_icmple 17f
      // 161: goto 16e
      // 164: ldc2_w 2264311076979045382
      // 167: lload 3
      // 168: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: bipush 1
      // 16f: goto 17c
      // 172: ldc2_w 2264311076979045382
      // 175: lload 3
      // 176: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: goto 180
      // 17f: bipush 0
      // 180: ireturn
   }

   public static boolean p(Object[] var0) {
      Color var1 = (Color)var0[0];
      Color var4 = (Color)var0[1];
      long var2 = (Long)var0[2];
      var2 = a ^ var2;
      long var5 = var2 ^ 72789979158680L;
      Object[] var10005 = new Object[]{null, null, var4, b<"a">(16416, 3004556804456990821L ^ var2)};
      var10005[1] = var5;
      var10005[0] = var1;
      return x44.a<"q">(var10005, -3957740751531181065L, var2);
   }

   private static void B(Object[] var0) {
      JEditorPane var1 = (JEditorPane)var0[0];
      String var4 = (String)var0[1];
      long var2 = (Long)var0[2];
      var2 = a ^ var2;
      x44.a<"k">(var1, a<"j">(9695, 840225874166263328L ^ var2), 3402901107703239131L, var2);
      x44.a<"k">(var1, var4, 3415851690624208234L, var2);
      x44.a<"k">(var1, 0, 3469671271511025152L, var2);
   }

   public static void a(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/awt/Window
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/_ud.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -6917090948260263890
      // 1c: lload 2
      // 1d: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 4
      // 26: ifnull 6f
      // 29: ldc2_w -6608883730700199756
      // 2c: lload 2
      // 2d: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: ifeq 5e
      // 35: goto 42
      // 38: ldc2_w -6636253523776583539
      // 3b: lload 2
      // 3c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 1
      // 43: ldc2_w -4635445410033281682
      // 46: lload 2
      // 47: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: aload 4
      // 4e: ifnonnull d7
      // 51: goto 5e
      // 54: ldc2_w -6636253523776583539
      // 57: lload 2
      // 58: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: new com/zelix/_yx
      // 61: dup
      // 62: aload 1
      // 63: invokespecial com/zelix/_yx.<init> (Ljava/awt/Window;)V
      // 66: ldc2_w -4767159431776848579
      // 69: lload 2
      // 6a: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: goto d7
      // 72: astore 5
      // 74: new com/zelix/gj
      // 77: dup
      // 78: new java/lang/StringBuilder
      // 7b: dup
      // 7c: invokespecial java/lang/StringBuilder.<init> ()V
      // 7f: aload 5
      // 81: ldc2_w -6614404866921890965
      // 84: lload 2
      // 85: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: ldc " "
      // 8f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 92: aload 1
      // 93: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 96: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 99: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9f: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // a2: athrow
      // a3: astore 5
      // a5: new com/zelix/gj
      // a8: dup
      // a9: new java/lang/StringBuilder
      // ac: dup
      // ad: invokespecial java/lang/StringBuilder.<init> ()V
      // b0: aload 5
      // b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b5: ldc2_w -6386586564698614705
      // b8: lload 2
      // b9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: ldc " "
      // c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c6: aload 1
      // c7: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // ca: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d3: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // d6: athrow
      // d7: return
   }

   public static void c(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/awt/Window
      // 11: astore 1
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Boolean
      // 18: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1b: istore 2
      // 1c: pop
      // 1d: getstatic com/zelix/_ud.a J
      // 20: lload 3
      // 21: lxor
      // 22: lstore 3
      // 23: ldc2_w -2158692464579982811
      // 26: lload 3
      // 27: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: astore 5
      // 2e: aload 5
      // 30: ifnull 7b
      // 33: ldc2_w -1854425825558603073
      // 36: lload 3
      // 37: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: ifeq 69
      // 3f: goto 4c
      // 42: ldc2_w -2167343719259731322
      // 45: lload 3
      // 46: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 1
      // 4d: iload 2
      // 4e: ldc2_w -55942434854738249
      // 51: lload 3
      // 52: invokedynamic m (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: aload 5
      // 59: ifnonnull e3
      // 5c: goto 69
      // 5f: ldc2_w -2167343719259731322
      // 62: lload 3
      // 63: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: new com/zelix/_oh
      // 6c: dup
      // 6d: aload 1
      // 6e: iload 2
      // 6f: invokespecial com/zelix/_oh.<init> (Ljava/awt/Window;Z)V
      // 72: ldc2_w -9883461405051082
      // 75: lload 3
      // 76: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: goto e3
      // 7e: astore 6
      // 80: new com/zelix/gj
      // 83: dup
      // 84: new java/lang/StringBuilder
      // 87: dup
      // 88: invokespecial java/lang/StringBuilder.<init> ()V
      // 8b: aload 6
      // 8d: ldc2_w -1855571989981021856
      // 90: lload 3
      // 91: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: ldc " "
      // 9b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9e: aload 1
      // 9f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // a2: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ab: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // ae: athrow
      // af: astore 6
      // b1: new com/zelix/gj
      // b4: dup
      // b5: new java/lang/StringBuilder
      // b8: dup
      // b9: invokespecial java/lang/StringBuilder.<init> ()V
      // bc: aload 6
      // be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c1: ldc2_w -1921612549831387580
      // c4: lload 3
      // c5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cd: ldc " "
      // cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d2: aload 1
      // d3: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // d6: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // df: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // e2: athrow
      // e3: return
   }

   private static void w(Object[] var0) {
      Component var3 = (Component)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;

      try {
         Method var4 = var3.getClass().getMethod(a<"j">(23096, 722776194671747554L ^ var1), x44.a<"m">(-4413889584246067459L, var1));
         var4.invoke(var3, x44.a<"m">(-4413889584246067459L, var1));
      } catch (Throwable var5) {
         x44.a<"l">(var3, -4223769056979134509L, var1);
      }
   }

   public static boolean m(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/awt/Color
      // 11: astore 1
      // 12: pop
      // 13: getstatic com/zelix/_ud.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -94091462701558114
      // 1c: lload 2
      // 1d: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 1
      // 23: ldc2_w -1873885013117867375
      // 26: lload 2
      // 27: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 1
      // 2d: ldc2_w -2033122819120842053
      // 30: lload 2
      // 31: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: iadd
      // 37: aload 1
      // 38: ldc2_w -2239015808622960822
      // 3b: lload 2
      // 3c: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: iadd
      // 42: istore 5
      // 44: astore 4
      // 46: iload 5
      // 48: aload 4
      // 4a: ifnull 78
      // 4d: sipush 25612
      // 50: ldc2_w 3228765855728584130
      // 53: lload 2
      // 54: lxor
      // 55: invokedynamic a (IJ)I bsm=com/zelix/_ud.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: if_icmpge 7b
      // 5d: goto 6a
      // 60: ldc2_w -191547385334557123
      // 63: lload 2
      // 64: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 78
      // 6e: ldc2_w -191547385334557123
      // 71: lload 2
      // 72: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: goto 7c
      // 7b: bipush 0
      // 7c: ireturn
   }

   static {
      long var20 = a ^ 103769756373662L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "¬Ø\fó1?\u0005%«~óµ\u007f\u0006¼ps\u0010e= \u000fU¼f§4tL±p\u0086\u0094\u000f\u008d/v^sG(`×ú|>\u0002tÁUF>\u001dûL®\u009b\u001e1\u0011xïf³ï&øb=²_ Æ\\?\\¾¢cG7";
      int var17 = "¬Ø\fó1?\u0005%«~óµ\u007f\u0006¼ps\u0010e= \u000fU¼f§4tL±p\u0086\u0094\u000f\u008d/v^sG(`×ú|>\u0002tÁUF>\u001dûL®\u009b\u001e1\u0011xïf³ï&øb=²_ Æ\\?\\¾¢cG7"
         .length();
      char var14 = '(';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[4];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "Ðü¶\u007f>\u001cÖ\u001f\u009f*Ò\u009cc\u000e«\\\u009fº\u0092¤~\u001eV'ãXIÛ u\u0000¯";
                     int var5 = "Ðü¶\u007f>\u001cÖ\u001f\u009f*Ò\u009cc\u000e«\\\u009fº\u0092¤~\u001eV'ãXIÛ u\u0000¯".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
                           byte[] var10 = var0.doFinal(
                              new byte[]{
                                 (byte)((int)(var8 >>> 56)),
                                 (byte)((int)(var8 >>> 48)),
                                 (byte)((int)(var8 >>> 40)),
                                 (byte)((int)(var8 >>> 32)),
                                 (byte)((int)(var8 >>> 24)),
                                 (byte)((int)(var8 >>> 16)),
                                 (byte)((int)(var8 >>> 8)),
                                 (byte)((int)var8)
                              }
                           );
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[6];
                                    x44.a<"p">(new Class[0], -8614389389410819024L, var20);
                                    x44.a<"p">(a<"j">(22040, 3446162853947434766L ^ var20), -8143693679972266741L, var20);
                                    z = x44.a<"q">(a<"j">(22803, 110997645107587079L ^ var20), "\n", -7648364970371011853L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0095\u008d!tGX®®Q»ÂG3ßÄh";
                                 var5 = "\u0095\u008d!tGX®®Q»ÂG3ßÄh".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "µ\u008aðIgD\u0095\u009c\u0088S Ó\tzp\u0099\u0016ÖÄ\u008f\"'*Â¶@*ÍQÐV\u0098\u0018}Z\u000bs\f\u0017ãÂ\u009dlj¾Å\u0093¥[!í aâS\u001fS";
                  var17 = "µ\u008aðIgD\u0095\u009c\u0088S Ó\tzp\u0099\u0016ÖÄ\u008f\"'*Â¶@*ÍQÐV\u0098\u0018}Z\u000bs\f\u0017ãÂ\u009dlj¾Å\u0093¥[!í aâS\u001fS"
                     .length();
                  var14 = ' ';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12453;
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
            throw new RuntimeException("com/zelix/_ud", var10);
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
         throw new RuntimeException("com/zelix/_ud" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20927;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_ud", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("com/zelix/_ud" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
