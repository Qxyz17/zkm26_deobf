package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zq extends jf implements _un {
   private ArrayList s;
   private ArrayList H;
   private static final long a = ess.a(-2457394434870401615L, 3606956344713531365L, MethodHandles.lookup().lookupClass()).a(41364034507297L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public void m(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"m">(this, 7675796096543906714L, var3).add(var2);
   }

   public void b(Object[] var1) {
      ff var4 = (ff)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"l">(this, -6254438850114865861L, var2).add(var4);
   }

   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      _ur var5 = (_ur)var1[2];
      long var6 = var3 ^ 48793404717166L;
      long var8 = var3 ^ 118083454661445L;
      long var10 = var3 ^ 0L;
      long var12 = var3 ^ 13027774328841L;
      long var14 = var3 ^ 134528422017690L;
      long var16 = var3 ^ 36819027518018L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var3);
      int var19 = x44.a<"i">(this, new Object[]{var14}, 7145691849331111744L, var3);
      int var20 = 0;
      int[] var18 = var10000;

      label34: {
         while (var20 < var19) {
            try {
               if (var3 > 0L) {
                  var23 = this.e(var20);
                  if (var18 != null) {
                     break label34;
                  }

                  x44.a<"i">(var23, new Object[]{var10, this, var5}, 8818198965911889370L, var3);
                  var20++;
               }

               if (var18 == null) {
                  continue;
               }
            } catch (gj var21) {
               throw x44.a<"q">(var21, 7216778578189564702L, var3);
            }

            if (var3 >= 0L) {
               break;
            }
         }

         var23 = var2;
      }

      jo var22 = (jo)var23;
      x44.a<"i">(
         var22,
         new Object[]{x44.a<"m">(this, 7454281001248619386L, var3).toArray(new ff[x44.a<"m">(this, 7454281001248619386L, var3).size()]), var8},
         8689870601979296528L,
         var3
      );
      x44.a<"i">(
         var22,
         new Object[]{
            var16,
            new _fd(
               x44.a<"m">(this, 9121376356264267658L, var3).size(),
               x44.a<"i">(this, new Object[]{var6}, 8681744622162316982L, var3),
               x44.a<"o">(this, new Object[]{var12}, 8670457974705757560L, var3)
            )
         },
         7092620502392661813L,
         var3
      );
   }

   public static String w(Object[] param0) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/zq.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: new java/lang/StringBuilder
      // 1c: dup
      // 1d: invokespecial java/lang/StringBuilder.<init> ()V
      // 20: astore 5
      // 22: ldc2_w -7536483109295573289
      // 25: lload 1
      // 26: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 0
      // 2c: istore 7
      // 2e: astore 4
      // 30: iload 7
      // 32: aload 3
      // 33: invokevirtual java/lang/String.length ()I
      // 36: if_icmpge e9
      // 39: aload 3
      // 3a: aload 4
      // 3c: ifnonnull ee
      // 3f: iload 7
      // 41: invokevirtual java/lang/String.charAt (I)C
      // 44: istore 6
      // 46: aload 4
      // 48: lload 1
      // 49: lconst_0
      // 4a: lcmp
      // 4b: iflt 98
      // 4e: ifnonnull 96
      // 51: iload 6
      // 53: lookupswitch 121 2 36 35 91 78
      // 6c: ldc2_w -8233960550276935038
      // 6f: lload 1
      // 70: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 5
      // 78: sipush 22432
      // 7b: ldc2_w 8132723443291287725
      // 7e: lload 1
      // 7f: lxor
      // 80: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88: pop
      // 89: goto 96
      // 8c: ldc2_w -8233960550276935038
      // 8f: lload 1
      // 90: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: aload 4
      // 98: lload 1
      // 99: lconst_0
      // 9a: lcmp
      // 9b: ifle e6
      // 9e: ifnull e1
      // a1: aload 5
      // a3: sipush 21728
      // a6: ldc2_w 3136491248160404463
      // a9: lload 1
      // aa: lxor
      // ab: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b3: pop
      // b4: aload 4
      // b6: lload 1
      // b7: lconst_0
      // b8: lcmp
      // b9: ifle e6
      // bc: ifnull e1
      // bf: goto cc
      // c2: ldc2_w -8233960550276935038
      // c5: lload 1
      // c6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: athrow
      // cc: aload 5
      // ce: iload 6
      // d0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // d3: pop
      // d4: goto e1
      // d7: ldc2_w -8233960550276935038
      // da: lload 1
      // db: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: athrow
      // e1: iinc 7 1
      // e4: aload 4
      // e6: ifnull 30
      // e9: aload 5
      // eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ee: areturn
   }

   public zq(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 36901888307846L;
      super(var4, var3);
      x44.a<"r">(this, new ArrayList(), 8310747448684921418L, var1);
      x44.a<"r">(this, new ArrayList(), 7688483142566672058L, var1);
   }

   private Pattern J(Object[] param1) {
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
      // 00c: getstatic com/zelix/zq.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 60170182236565
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: new java/lang/StringBuilder
      // 01e: dup
      // 01f: invokespecial java/lang/StringBuilder.<init> ()V
      // 022: astore 7
      // 024: ldc2_w 577085938466826684
      // 027: lload 2
      // 028: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 7
      // 02f: sipush 18110
      // 032: ldc2_w 3138091447280598747
      // 035: lload 2
      // 036: lxor
      // 037: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03f: pop
      // 040: aload 0
      // 041: ldc2_w 604236651648596349
      // 044: lload 2
      // 045: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 04d: astore 8
      // 04f: astore 6
      // 051: aload 8
      // 053: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 058: ifeq 194
      // 05b: aload 8
      // 05d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 062: checkcast java/lang/String
      // 065: astore 9
      // 067: aload 9
      // 069: aload 6
      // 06b: ifnonnull 1b2
      // 06e: ldc "*"
      // 070: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 073: lload 2
      // 074: lconst_0
      // 075: lcmp
      // 076: iflt 12f
      // 079: aload 6
      // 07b: ifnonnull 12f
      // 07e: goto 08b
      // 081: ldc2_w 1355628095296327145
      // 084: lload 2
      // 085: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: lload 2
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: iflt 122
      // 091: ifeq 11b
      // 094: goto 0a1
      // 097: ldc2_w 1355628095296327145
      // 09a: lload 2
      // 09b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: lload 2
      // 0a2: lconst_0
      // 0a3: lcmp
      // 0a4: ifle 103
      // 0a7: aload 0
      // 0a8: ldc2_w 604236651648596349
      // 0ab: lload 2
      // 0ac: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: invokevirtual java/util/ArrayList.size ()I
      // 0b4: bipush 1
      // 0b5: if_icmpne 0f0
      // 0b8: goto 0c5
      // 0bb: ldc2_w 1355628095296327145
      // 0be: lload 2
      // 0bf: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 7
      // 0c7: sipush 22304
      // 0ca: ldc2_w 671715534413590336
      // 0cd: lload 2
      // 0ce: lxor
      // 0cf: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d7: pop
      // 0d8: aload 6
      // 0da: lload 2
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: ifle 191
      // 0e0: ifnull 18f
      // 0e3: goto 0f0
      // 0e6: ldc2_w 1355628095296327145
      // 0e9: lload 2
      // 0ea: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 7
      // 0f2: sipush 17638
      // 0f5: ldc2_w 6604836703396527233
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: pop
      // 103: aload 6
      // 105: lload 2
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 191
      // 10b: ifnull 18f
      // 10e: goto 11b
      // 111: ldc2_w 1355628095296327145
      // 114: lload 2
      // 115: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 9
      // 11d: ldc "?"
      // 11f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 122: goto 12f
      // 125: ldc2_w 1355628095296327145
      // 128: lload 2
      // 129: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: ifeq 15d
      // 132: aload 7
      // 134: sipush 21866
      // 137: ldc2_w 4898512563134491912
      // 13a: lload 2
      // 13b: lxor
      // 13c: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: pop
      // 145: aload 6
      // 147: lload 2
      // 148: lconst_0
      // 149: lcmp
      // 14a: iflt 191
      // 14d: ifnull 18f
      // 150: goto 15d
      // 153: ldc2_w 1355628095296327145
      // 156: lload 2
      // 157: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: aload 7
      // 15f: lload 4
      // 161: aload 9
      // 163: bipush 2
      // 164: anewarray 34
      // 167: dup_x1
      // 168: swap
      // 169: bipush 1
      // 16a: swap
      // 16b: aastore
      // 16c: dup_x2
      // 16d: dup_x2
      // 16e: pop
      // 16f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 172: bipush 0
      // 173: swap
      // 174: aastore
      // 175: ldc2_w 1327871099561924941
      // 178: lload 2
      // 179: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 181: pop
      // 182: goto 18f
      // 185: ldc2_w 1355628095296327145
      // 188: lload 2
      // 189: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: aload 6
      // 191: ifnull 051
      // 194: aload 7
      // 196: sipush 24123
      // 199: ldc2_w 7715496229076493912
      // 19c: lload 2
      // 19d: lxor
      // 19e: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a6: pop
      // 1a7: aload 7
      // 1a9: lload 2
      // 1aa: lconst_0
      // 1ab: lcmp
      // 1ac: iflt 062
      // 1af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b2: ldc2_w 883485916125179368
      // 1b5: lload 2
      // 1b6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/regex/Pattern; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public String D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int[] var10000 = x44.a<"q">(4640149229034168795L, var2);
      StringBuffer var5 = new StringBuffer();
      x44.a<"i">(var5, (char)b<"a">(29371, 6214683111296614970L ^ var2), 5034655276453506654L, var2);
      int[] var4 = var10000;

      label58: {
         try {
            if (var4 != null) {
               return var5.toString();
            }

            if (x44.a<"m">(this, 4613244788217180442L, var2) == null) {
               break label58;
            }
         } catch (gj var9) {
            throw x44.a<"q">(var9, 6536710049195033998L, var2);
         }

         int var6 = x44.a<"m">(this, 4613244788217180442L, var2).size();
         int var7 = 0;

         label52:
         while (var7 < var6) {
            String var8 = (String)x44.a<"m">(this, 4613244788217180442L, var2).get(var7);

            try {
               var5.append(var8);
               var7++;
            } catch (gj var11) {
               boolean var10001 = false;
               throw x44.a<"q">(var11, 6536710049195033998L, var2);
            }

            while (true) {
               try {
                  var10000 = var4;
                  if (var2 > 0L) {
                     if (var4 != null) {
                        return var5.toString();
                     }

                     var10000 = var4;
                  }

                  if (var10000 == null) {
                     break;
                  }
               } catch (gj var10) {
                  boolean var15 = false;
                  throw x44.a<"q">(var10, 6536710049195033998L, var2);
               }

               if (var2 >= 0L) {
                  break label52;
               }
            }
         }
      }

      x44.a<"i">(var5, (char)b<"a">(22022, 7587387826220000902L ^ var2), 5034655276453506654L, var2);
      return var5.toString();
   }

   static {
      long var11 = a ^ 131493135328208L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "eÚ\u0010\u0012JLói9Ä¦¾;~C´0?]¦{\fà#ó\u0015¯ö\u0081\u0006ÃÉ\u0004Õ\u000eÌ\u009e:7\r\u0000\u009aº³nV\u0002u;ÙìE°4hØV\tðßè\u0080\u0015\u008cQ\u0010\u0019\u0019\u0006óû\u001d\u009d\u0097gÔ\u000b\u0099\u0013¢øÛ\u0010jCó£Xé!\u0015Ëõ¦\u0011\u0011nJ\u009d8 d\b\u0099`\u009bï¦X\u0007 \u0006>\u008a\u001e\bMqÎ\u0019]c?¥\u001b¼i\u001d\u009e¨yæ\u0087ÎÚ\u00953ÆÅ9Ú¼¬G-ùó\u008ev\u0018Ý\u0081o\u0081W3";
      int var19 = "eÚ\u0010\u0012JLói9Ä¦¾;~C´0?]¦{\fà#ó\u0015¯ö\u0081\u0006ÃÉ\u0004Õ\u000eÌ\u009e:7\r\u0000\u009aº³nV\u0002u;ÙìE°4hØV\tðßè\u0080\u0015\u008cQ\u0010\u0019\u0019\u0006óû\u001d\u009d\u0097gÔ\u000b\u0099\u0013¢øÛ\u0010jCó£Xé!\u0015Ëõ¦\u0011\u0011nJ\u009d8 d\b\u0099`\u009bï¦X\u0007 \u0006>\u008a\u001e\bMqÎ\u0019]c?¥\u001b¼i\u001d\u009e¨yæ\u0087ÎÚ\u00953ÆÅ9Ú¼¬G-ùó\u008ev\u0018Ý\u0081o\u0081W3"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[7];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u008aÄ×Fq÷ì]$,ä0êD\u009eÚ";
                     int var5 = "\u008aÄ×Fq÷ì]$,ä0êD\u009eÚ".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
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
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "ñ\t\u0013\u00944þm\u000ezOtõó\u0007ÒD\u0010¾³\u000fê»\ne\u0018\u000f\u009d\u001câzá\u008e\u008e";
                  var19 = "ñ\t\u0013\u00944þm\u000ezOtõó\u0007ÒD\u0010¾³\u000fê»\ne\u0018\u000f\u009d\u001câzá\u008e\u008e".length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14779;
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
            throw new RuntimeException("com/zelix/zq", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/zq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31034;
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
            throw new RuntimeException("com/zelix/zq", var14);
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
         throw new RuntimeException("com/zelix/zq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
