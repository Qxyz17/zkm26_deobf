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

public class l_ {
   private static final long a = ess.a(2111758146128141230L, -6485515673634587953L, MethodHandles.lookup().lookupClass()).a(171225148141308L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static int l(Object[] param0) {
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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/String
      // 18: astore 1
      // 19: pop
      // 1a: getstatic com/zelix/l_.a J
      // 1d: lload 3
      // 1e: lxor
      // 1f: lstore 3
      // 20: ldc2_w -117735651401013415
      // 23: lload 3
      // 24: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: astore 5
      // 2b: aload 2
      // 2c: aload 5
      // 2e: ifnonnull 42
      // 31: ifnull d2
      // 34: goto 41
      // 37: ldc2_w -2134717920436238983
      // 3a: lload 3
      // 3b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 2
      // 42: invokevirtual java/lang/String.length ()I
      // 45: aload 5
      // 47: ifnonnull d3
      // 4a: ifle d2
      // 4d: goto 5a
      // 50: ldc2_w -2134717920436238983
      // 53: lload 3
      // 54: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 1
      // 5b: lload 3
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: iflt 84
      // 61: aload 5
      // 63: ifnonnull 84
      // 66: goto 73
      // 69: ldc2_w -2134717920436238983
      // 6c: lload 3
      // 6d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: ifnull d2
      // 76: goto 83
      // 79: ldc2_w -2134717920436238983
      // 7c: lload 3
      // 7d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: aload 1
      // 84: invokevirtual java/lang/String.length ()I
      // 87: aload 5
      // 89: ifnonnull d3
      // 8c: ifle d2
      // 8f: goto 9c
      // 92: ldc2_w -2134717920436238983
      // 95: lload 3
      // 96: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: aload 1
      // 9d: invokevirtual java/lang/String.length ()I
      // a0: istore 6
      // a2: bipush -1
      // a3: istore 7
      // a5: bipush 0
      // a6: iload 6
      // a8: isub
      // a9: istore 8
      // ab: iload 8
      // ad: iload 6
      // af: iadd
      // b0: istore 8
      // b2: aload 2
      // b3: aload 1
      // b4: iload 8
      // b6: ldc2_w -511681195541983383
      // b9: lload 3
      // ba: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: istore 8
      // c1: iinc 7 1
      // c4: iload 8
      // c6: bipush -1
      // c7: if_icmpne ab
      // ca: iload 7
      // cc: aload 5
      // ce: ifnonnull c6
      // d1: ireturn
      // d2: bipush 0
      // d3: ireturn
   }

   public static int p(long param0, String param2, char param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/l_.a J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: ldc2_w -1876067803020919566
      // 09: lload 0
      // 0a: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 4
      // 11: aload 2
      // 12: aload 4
      // 14: ifnonnull 28
      // 17: ifnull ae
      // 1a: goto 27
      // 1d: ldc2_w -435561541483831598
      // 20: lload 0
      // 21: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual java/lang/String.length ()I
      // 2b: aload 4
      // 2d: ifnonnull af
      // 30: ifle ae
      // 33: goto 40
      // 36: ldc2_w -435561541483831598
      // 39: lload 0
      // 3a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 2
      // 41: invokevirtual java/lang/String.toCharArray ()[C
      // 44: astore 5
      // 46: bipush 0
      // 47: istore 6
      // 49: aload 5
      // 4b: astore 7
      // 4d: aload 7
      // 4f: arraylength
      // 50: istore 8
      // 52: bipush 0
      // 53: istore 9
      // 55: iload 9
      // 57: iload 8
      // 59: if_icmpge ab
      // 5c: aload 7
      // 5e: iload 9
      // 60: caload
      // 61: istore 10
      // 63: aload 4
      // 65: lload 0
      // 66: lconst_0
      // 67: lcmp
      // 68: iflt a8
      // 6b: ifnonnull a6
      // 6e: iload 10
      // 70: aload 4
      // 72: ifnonnull ad
      // 75: goto 82
      // 78: ldc2_w -435561541483831598
      // 7b: lload 0
      // 7c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: iload 3
      // 83: if_icmpne a3
      // 86: goto 93
      // 89: ldc2_w -435561541483831598
      // 8c: lload 0
      // 8d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: iinc 6 1
      // 96: goto a3
      // 99: ldc2_w -435561541483831598
      // 9c: lload 0
      // 9d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: iinc 9 1
      // a6: aload 4
      // a8: ifnull 55
      // ab: iload 6
      // ad: ireturn
      // ae: bipush 0
      // af: ireturn
   }

   public static boolean y(long param0, String param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/l_.a J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: lload 0
      // 007: dup2
      // 008: ldc2_w 56392467013330
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 32
      // 00f: lushr
      // 010: l2i
      // 011: istore 4
      // 013: dup2
      // 014: bipush 32
      // 016: lshl
      // 017: bipush 48
      // 019: lushr
      // 01a: l2i
      // 01b: istore 5
      // 01d: dup2
      // 01e: bipush 48
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 6
      // 027: pop2
      // 028: pop2
      // 029: ldc2_w -8615222096088821388
      // 02c: lload 0
      // 02d: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: astore 7
      // 034: aload 3
      // 035: ldc "*"
      // 037: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03a: aload 7
      // 03c: ifnonnull 07d
      // 03f: ifne 07c
      // 042: goto 04f
      // 045: ldc2_w -7749894006528756908
      // 048: lload 0
      // 049: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: aload 2
      // 050: aload 3
      // 051: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 054: lload 0
      // 055: lconst_0
      // 056: lcmp
      // 057: ifle 084
      // 05a: aload 7
      // 05c: ifnonnull 084
      // 05f: goto 06c
      // 062: ldc2_w -7749894006528756908
      // 065: lload 0
      // 066: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: athrow
      // 06c: ifeq 07e
      // 06f: goto 07c
      // 072: ldc2_w -7749894006528756908
      // 075: lload 0
      // 076: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: bipush 1
      // 07d: ireturn
      // 07e: aload 2
      // 07f: ldc "*"
      // 081: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 084: bipush -1
      // 085: lload 0
      // 086: lconst_0
      // 087: lcmp
      // 088: iflt 0c6
      // 08b: aload 7
      // 08d: ifnonnull 0c6
      // 090: if_icmpne 0dc
      // 093: goto 0a0
      // 096: ldc2_w -7749894006528756908
      // 099: lload 0
      // 09a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 3
      // 0a1: ldc "*"
      // 0a3: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0a6: aload 7
      // 0a8: ifnonnull 0db
      // 0ab: goto 0b8
      // 0ae: ldc2_w -7749894006528756908
      // 0b1: lload 0
      // 0b2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: bipush -1
      // 0b9: goto 0c6
      // 0bc: ldc2_w -7749894006528756908
      // 0bf: lload 0
      // 0c0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: if_icmpne 0dc
      // 0c9: aload 2
      // 0ca: aload 3
      // 0cb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ce: goto 0db
      // 0d1: ldc2_w -7749894006528756908
      // 0d4: lload 0
      // 0d5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: ireturn
      // 0dc: new java/util/StringTokenizer
      // 0df: dup
      // 0e0: aload 3
      // 0e1: ldc "*"
      // 0e3: bipush 1
      // 0e4: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 0e7: astore 8
      // 0e9: aload 8
      // 0eb: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 0ee: anewarray 13
      // 0f1: astore 9
      // 0f3: bipush 0
      // 0f4: istore 10
      // 0f6: aload 8
      // 0f8: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0fb: ifeq 110
      // 0fe: aload 9
      // 100: iload 10
      // 102: iinc 10 1
      // 105: aload 8
      // 107: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 10a: aastore
      // 10b: aload 7
      // 10d: ifnull 0f6
      // 110: bipush 0
      // 111: istore 11
      // 113: bipush 0
      // 114: istore 12
      // 116: aload 2
      // 117: lload 0
      // 118: lconst_0
      // 119: lcmp
      // 11a: ifle 10d
      // 11d: iload 11
      // 11f: aload 9
      // 121: iload 4
      // 123: iload 5
      // 125: i2c
      // 126: iload 12
      // 128: iload 6
      // 12a: invokestatic com/zelix/l_.Z (Ljava/lang/String;I[Ljava/lang/String;ICII)Z
      // 12d: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static int r(String var0, int var1, char[] var2, long var3) {
      var3 = a ^ var3;
      String var10000 = x44.a<"r">(-6326552088328163017L, var3);
      int var6 = var0.length();
      String var5 = var10000;
      int var7 = var1;

      label70:
      while (true) {
         int var12 = var7;
         int var10001 = var6;

         label66:
         while (true) {
            if (var12 < var10001) {
               var10000 = var0;
            } else {
               if (var3 >= 0L) {
                  return -1;
               }

               var10000 = var0;
            }

            while (true) {
               char var8 = var10000.charAt(var7);
               if (var5 != null) {
                  return 0;
               }

               int var9 = 0;
               var12 = var9;
               var10001 = var2.length;

               while (var12 < var10001) {
                  try {
                     var12 = var8;
                     if (var5 != null) {
                        return var8;
                     }

                     var10001 = var2[var9];
                     if (var5 != null) {
                        continue label66;
                     }
                  } catch (IllegalArgumentException var10) {
                     throw x44.a<"r">(var10, -5462339453318425833L, var3);
                  }

                  if (var3 >= 0L) {
                     if (var12 == var10001) {
                        return var7;
                     }

                     var9++;
                     if (var5 != null) {
                        break;
                     }

                     var12 = var9;
                     var10001 = var2.length;
                  }
               }

               var7++;
               var10000 = var5;
               if (var3 >= 0L) {
                  if (var5 == null) {
                     continue label70;
                  }

                  if (var3 >= 0L) {
                     return -1;
                  }

                  var10000 = var0;
               }
            }
         }
      }
   }

   public static String c(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/String
      // 020: astore 3
      // 021: pop
      // 022: getstatic com/zelix/l_.a J
      // 025: lload 4
      // 027: lxor
      // 028: lstore 4
      // 02a: ldc2_w 8160182099287566394
      // 02d: lload 4
      // 02f: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: astore 6
      // 036: aload 2
      // 037: aload 6
      // 039: ifnonnull 06f
      // 03c: ifnonnull 06e
      // 03f: goto 04d
      // 042: ldc2_w 7871314900019202586
      // 045: lload 4
      // 047: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: new java/lang/IllegalArgumentException
      // 050: dup
      // 051: sipush 1688
      // 054: ldc2_w 8367994435297090661
      // 057: lload 4
      // 059: lxor
      // 05a: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 062: athrow
      // 063: ldc2_w 7871314900019202586
      // 066: lload 4
      // 068: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: aload 2
      // 06f: invokevirtual java/lang/String.length ()I
      // 072: istore 7
      // 074: new java/io/StringWriter
      // 077: dup
      // 078: iload 7
      // 07a: invokespecial java/io/StringWriter.<init> (I)V
      // 07d: astore 8
      // 07f: aload 2
      // 080: invokevirtual java/lang/String.toCharArray ()[C
      // 083: astore 9
      // 085: aload 1
      // 086: invokevirtual java/lang/String.length ()I
      // 089: istore 10
      // 08b: bipush 0
      // 08c: istore 11
      // 08e: bipush 0
      // 08f: istore 12
      // 091: iload 11
      // 093: iload 7
      // 095: if_icmpge 101
      // 098: aload 2
      // 099: aload 6
      // 09b: lload 4
      // 09d: lconst_0
      // 09e: lcmp
      // 09f: iflt 0a7
      // 0a2: ifnonnull 129
      // 0a5: aload 6
      // 0a7: ifnonnull 129
      // 0aa: goto 0b8
      // 0ad: ldc2_w 7871314900019202586
      // 0b0: lload 4
      // 0b2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: iload 11
      // 0bb: ldc2_w 8612385278992547850
      // 0be: lload 4
      // 0c0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: dup
      // 0c6: istore 12
      // 0c8: bipush -1
      // 0c9: lload 4
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: iflt 0f9
      // 0d0: if_icmple 101
      // 0d3: aload 8
      // 0d5: aload 9
      // 0d7: iload 11
      // 0d9: iload 12
      // 0db: iload 11
      // 0dd: isub
      // 0de: ldc2_w 7647471794976784570
      // 0e1: lload 4
      // 0e3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: aload 8
      // 0ea: aload 3
      // 0eb: ldc2_w 8275556163537189413
      // 0ee: lload 4
      // 0f0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: iload 12
      // 0f7: iload 10
      // 0f9: iadd
      // 0fa: istore 11
      // 0fc: aload 6
      // 0fe: ifnull 091
      // 101: aload 8
      // 103: aload 9
      // 105: iload 11
      // 107: iload 7
      // 109: iload 11
      // 10b: isub
      // 10c: ldc2_w 7647471794976784570
      // 10f: lload 4
      // 111: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: aload 8
      // 118: lload 4
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 0ea
      // 11f: ldc2_w 7984893931623157136
      // 122: lload 4
      // 124: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: areturn
   }

   public static int k(Object[] param0) {
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
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 4
      // 1d: pop
      // 1e: getstatic com/zelix/l_.a J
      // 21: lload 1
      // 22: lxor
      // 23: lstore 1
      // 24: ldc2_w 484643089175420861
      // 27: lload 1
      // 28: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 3
      // 2e: invokevirtual java/lang/String.length ()I
      // 31: istore 6
      // 33: astore 5
      // 35: iload 6
      // 37: aload 5
      // 39: ifnonnull 5a
      // 3c: ifne 58
      // 3f: goto 4c
      // 42: ldc2_w 1926275113188933021
      // 45: lload 1
      // 46: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: bipush -1
      // 4d: ireturn
      // 4e: ldc2_w 1926275113188933021
      // 51: lload 1
      // 52: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: iload 4
      // 5a: istore 7
      // 5c: aload 3
      // 5d: iload 7
      // 5f: invokevirtual java/lang/String.charAt (I)C
      // 62: istore 8
      // 64: iload 8
      // 66: ldc2_w 1871205271883755910
      // 69: lload 1
      // 6a: invokedynamic p (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: ifeq bf
      // 72: iinc 7 1
      // 75: iload 7
      // 77: aload 5
      // 79: lload 1
      // 7a: lconst_0
      // 7b: lcmp
      // 7c: ifle 84
      // 7f: ifnonnull c7
      // 82: aload 5
      // 84: ifnonnull b8
      // 87: goto 94
      // 8a: ldc2_w 1926275113188933021
      // 8d: lload 1
      // 8e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: iload 6
      // 96: if_icmpne b2
      // 99: goto a6
      // 9c: ldc2_w 1926275113188933021
      // 9f: lload 1
      // a0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: bipush -1
      // a7: ireturn
      // a8: ldc2_w 1926275113188933021
      // ab: lload 1
      // ac: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 3
      // b3: iload 7
      // b5: invokevirtual java/lang/String.charAt (I)C
      // b8: istore 8
      // ba: aload 5
      // bc: ifnull 64
      // bf: lload 1
      // c0: lconst_0
      // c1: lcmp
      // c2: iflt 75
      // c5: iload 7
      // c7: ireturn
   }

   public static String G(Object[] var0) {
      String var1 = (String)var0[0];
      int var6 = (Integer)var0[1];
      int var5 = (Integer)var0[2];
      long var2 = (Long)var0[3];
      int var4 = (Integer)var0[4];
      var2 = a ^ var2;
      int var7 = var1.length();
      StringBuilder var8;
      switch (var6) {
         case 76:
            var8 = new StringBuilder(var1);
            int var9 = var5 - var7;
            int var10 = 0;

            try {
               while (var10 < var9) {
                  var8.append((char)var4);
                  var10++;
                  if (var2 < 0L) {
                     return var8.toString().substring(0, var5);
                  }
               }
            } catch (IllegalArgumentException var12) {
               throw x44.a<"w">(var12, -8992292235128888302L, var2);
            }

            if (var2 >= 0L) {
               break;
            }
         case 82:
            var8 = new StringBuilder();
            int var14 = var5 - var7;
            int var15 = 0;

            label36: {
               try {
                  while (var15 < var14) {
                     var8.append((char)var4);
                     var15++;
                     if (var2 < 0L) {
                        break label36;
                     }
                  }
               } catch (IllegalArgumentException var11) {
                  throw x44.a<"w">(var11, -8992292235128888302L, var2);
               }

               var8.append(var1);
            }

            if (var2 > 0L) {
               break;
            }

            throw new IllegalArgumentException(a<"l">(5942, 3043410963139355589L ^ var2));
         default:
            throw new IllegalArgumentException(a<"l">(5942, 3043410963139355589L ^ var2));
      }

      return var8.toString().substring(0, var5);
   }

   public static String A(Object[] var0) {
      int var3 = (Integer)var0[0];
      int var4 = (Integer)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      StringBuilder var5 = new StringBuilder(var3);
      int var6 = 0;

      try {
         while (var6 < var3) {
            StringBuilder var10000 = var5.append((char)var4);
            if (var1 <= 0L) {
               return var10000.toString();
            }

            var6++;
         }
      } catch (IllegalArgumentException var7) {
         throw x44.a<"u">(var7, -2355682551722543000L, var1);
      }

      return var5.toString();
   }

   private static boolean Z(String param0, int param1, String[] param2, int param3, char param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 6
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/l_.a J
      // 01c: lxor
      // 01d: lstore 7
      // 01f: lload 7
      // 021: dup2
      // 022: ldc2_w 14741801793299
      // 025: lxor
      // 026: dup2
      // 027: bipush 32
      // 029: lushr
      // 02a: l2i
      // 02b: istore 9
      // 02d: dup2
      // 02e: bipush 32
      // 030: lshl
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 10
      // 037: dup2
      // 038: bipush 48
      // 03a: lshl
      // 03b: bipush 48
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 11
      // 041: pop2
      // 042: pop2
      // 043: ldc2_w -6795462313644476235
      // 046: lload 7
      // 048: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: astore 12
      // 04f: iload 1
      // 050: aload 0
      // 051: invokevirtual java/lang/String.length ()I
      // 054: aload 12
      // 056: ifnonnull 113
      // 059: if_icmplt 0fc
      // 05c: goto 06a
      // 05f: ldc2_w -4777221516112586091
      // 062: lload 7
      // 064: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: iload 5
      // 06c: aload 2
      // 06d: arraylength
      // 06e: iload 6
      // 070: iflt 0a8
      // 073: aload 12
      // 075: ifnonnull 0a8
      // 078: goto 086
      // 07b: ldc2_w -4777221516112586091
      // 07e: lload 7
      // 080: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: if_icmplt 0a4
      // 089: goto 097
      // 08c: ldc2_w -4777221516112586091
      // 08f: lload 7
      // 091: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: bipush 1
      // 098: ireturn
      // 099: ldc2_w -4777221516112586091
      // 09c: lload 7
      // 09e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: iload 5
      // 0a6: aload 2
      // 0a7: arraylength
      // 0a8: if_icmpge 0f5
      // 0ab: aload 2
      // 0ac: iload 5
      // 0ae: aaload
      // 0af: ldc "*"
      // 0b1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b4: aload 12
      // 0b6: ifnonnull 0fb
      // 0b9: goto 0c7
      // 0bc: ldc2_w -4777221516112586091
      // 0bf: lload 7
      // 0c1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 12
      // 0c9: ifnonnull 0ec
      // 0cc: goto 0da
      // 0cf: ldc2_w -4777221516112586091
      // 0d2: lload 7
      // 0d4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: ifne 0ed
      // 0dd: goto 0eb
      // 0e0: ldc2_w -4777221516112586091
      // 0e3: lload 7
      // 0e5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: bipush 0
      // 0ec: ireturn
      // 0ed: iinc 5 1
      // 0f0: aload 12
      // 0f2: ifnull 0a4
      // 0f5: iload 6
      // 0f7: ifle 0ab
      // 0fa: bipush 1
      // 0fb: ireturn
      // 0fc: iload 5
      // 0fe: aload 12
      // 100: ifnonnull 117
      // 103: aload 2
      // 104: arraylength
      // 105: goto 113
      // 108: ldc2_w -4777221516112586091
      // 10b: lload 7
      // 10d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: if_icmplt 118
      // 116: bipush 0
      // 117: ireturn
      // 118: aload 2
      // 119: iload 5
      // 11b: aaload
      // 11c: astore 13
      // 11e: aload 13
      // 120: ldc "*"
      // 122: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 125: aload 12
      // 127: ifnonnull 27c
      // 12a: ifeq 26f
      // 12d: goto 13b
      // 130: ldc2_w -4777221516112586091
      // 133: lload 7
      // 135: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: aload 13
      // 13d: ldc "*"
      // 13f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 142: ifeq 193
      // 145: goto 153
      // 148: ldc2_w -4777221516112586091
      // 14b: lload 7
      // 14d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: iinc 5 1
      // 156: iload 5
      // 158: aload 12
      // 15a: iload 6
      // 15c: ifle 1a0
      // 15f: ifnonnull 19e
      // 162: aload 2
      // 163: arraylength
      // 164: aload 12
      // 166: ifnonnull 1ca
      // 169: goto 177
      // 16c: ldc2_w -4777221516112586091
      // 16f: lload 7
      // 171: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: if_icmpge 193
      // 17a: goto 188
      // 17d: ldc2_w -4777221516112586091
      // 180: lload 7
      // 182: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: aload 2
      // 189: iload 5
      // 18b: aaload
      // 18c: astore 13
      // 18e: aload 12
      // 190: ifnull 13b
      // 193: aload 13
      // 195: ldc "*"
      // 197: iload 3
      // 198: ifle 1d0
      // 19b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19e: aload 12
      // 1a0: iload 3
      // 1a1: ifle 1c7
      // 1a4: ifnonnull 1c6
      // 1a7: ifeq 1c5
      // 1aa: goto 1b8
      // 1ad: ldc2_w -4777221516112586091
      // 1b0: lload 7
      // 1b2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: athrow
      // 1b8: bipush 1
      // 1b9: ireturn
      // 1ba: ldc2_w -4777221516112586091
      // 1bd: lload 7
      // 1bf: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: iload 1
      // 1c6: aload 0
      // 1c7: invokevirtual java/lang/String.length ()I
      // 1ca: if_icmpge 268
      // 1cd: aload 0
      // 1ce: aload 13
      // 1d0: iload 1
      // 1d1: ldc2_w -6410249946607103867
      // 1d4: lload 7
      // 1d6: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: istore 14
      // 1dd: iload 14
      // 1df: aload 12
      // 1e1: iload 4
      // 1e3: iflt 1eb
      // 1e6: ifnonnull 26e
      // 1e9: aload 12
      // 1eb: ifnonnull 25f
      // 1ee: goto 1fc
      // 1f1: ldc2_w -4777221516112586091
      // 1f4: lload 7
      // 1f6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: bipush -1
      // 1fd: if_icmpeq 250
      // 200: goto 20e
      // 203: ldc2_w -4777221516112586091
      // 206: lload 7
      // 208: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: iload 14
      // 210: istore 1
      // 211: aload 0
      // 212: iload 1
      // 213: aload 13
      // 215: invokevirtual java/lang/String.length ()I
      // 218: iadd
      // 219: aload 2
      // 21a: iload 5
      // 21c: bipush 1
      // 21d: iadd
      // 21e: iload 9
      // 220: swap
      // 221: iload 10
      // 223: i2c
      // 224: swap
      // 225: iload 11
      // 227: invokestatic com/zelix/l_.Z (Ljava/lang/String;I[Ljava/lang/String;ICII)Z
      // 22a: istore 15
      // 22c: iload 15
      // 22e: aload 12
      // 230: ifnonnull 245
      // 233: ifeq 246
      // 236: goto 244
      // 239: ldc2_w -4777221516112586091
      // 23c: lload 7
      // 23e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: bipush 1
      // 245: ireturn
      // 246: aload 12
      // 248: iload 6
      // 24a: ifle 265
      // 24d: ifnull 260
      // 250: bipush 0
      // 251: goto 25f
      // 254: ldc2_w -4777221516112586091
      // 257: lload 7
      // 259: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: athrow
      // 25f: ireturn
      // 260: iinc 1 1
      // 263: aload 12
      // 265: ifnull 1c5
      // 268: iload 6
      // 26a: iflt 1cd
      // 26d: bipush 0
      // 26e: ireturn
      // 26f: aload 0
      // 270: iload 1
      // 271: aload 13
      // 273: bipush 0
      // 274: aload 13
      // 276: invokevirtual java/lang/String.length ()I
      // 279: invokevirtual java/lang/String.regionMatches (ILjava/lang/String;II)Z
      // 27c: istore 14
      // 27e: iload 14
      // 280: aload 12
      // 282: ifnonnull 2be
      // 285: ifne 2a3
      // 288: goto 296
      // 28b: ldc2_w -4777221516112586091
      // 28e: lload 7
      // 290: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: bipush 0
      // 297: ireturn
      // 298: ldc2_w -4777221516112586091
      // 29b: lload 7
      // 29d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: athrow
      // 2a3: iload 1
      // 2a4: aload 13
      // 2a6: invokevirtual java/lang/String.length ()I
      // 2a9: iadd
      // 2aa: istore 1
      // 2ab: aload 0
      // 2ac: iload 1
      // 2ad: aload 2
      // 2ae: iload 5
      // 2b0: bipush 1
      // 2b1: iadd
      // 2b2: iload 9
      // 2b4: swap
      // 2b5: iload 10
      // 2b7: i2c
      // 2b8: swap
      // 2b9: iload 11
      // 2bb: invokestatic com/zelix/l_.Z (Ljava/lang/String;I[Ljava/lang/String;ICII)Z
      // 2be: ireturn
   }

   public static String Y(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/l_.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 1904403356226
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: ldc2_w 8243755940899875683
      // 025: lload 1
      // 026: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: new java/lang/StringBuilder
      // 02e: dup
      // 02f: invokespecial java/lang/StringBuilder.<init> ()V
      // 032: astore 7
      // 034: astore 6
      // 036: bipush 0
      // 037: istore 9
      // 039: iload 9
      // 03b: aload 3
      // 03c: invokevirtual java/lang/String.length ()I
      // 03f: if_icmpge 32d
      // 042: aload 3
      // 043: aload 6
      // 045: ifnonnull 332
      // 048: iload 9
      // 04a: invokevirtual java/lang/String.charAt (I)C
      // 04d: istore 8
      // 04f: iload 8
      // 051: lload 1
      // 052: lconst_0
      // 053: lcmp
      // 054: ifle 239
      // 057: aload 6
      // 059: ifnonnull 239
      // 05c: lookupswitch 462 9 0 94 8 118 9 161 10 204 12 247 13 290 34 333 39 376 92 419
      // 0b0: ldc2_w 7955038137228544323
      // 0b3: lload 1
      // 0b4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 6
      // 0bc: lload 1
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 32a
      // 0c2: ifnull 325
      // 0c5: goto 0d2
      // 0c8: ldc2_w 7955038137228544323
      // 0cb: lload 1
      // 0cc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 7
      // 0d4: sipush 19061
      // 0d7: ldc2_w 898944063485400019
      // 0da: lload 1
      // 0db: lxor
      // 0dc: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: pop
      // 0e5: aload 6
      // 0e7: lload 1
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 32a
      // 0ed: ifnull 325
      // 0f0: goto 0fd
      // 0f3: ldc2_w 7955038137228544323
      // 0f6: lload 1
      // 0f7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: aload 7
      // 0ff: sipush 18364
      // 102: ldc2_w 6487895976134762011
      // 105: lload 1
      // 106: lxor
      // 107: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10f: pop
      // 110: aload 6
      // 112: lload 1
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 32a
      // 118: ifnull 325
      // 11b: goto 128
      // 11e: ldc2_w 7955038137228544323
      // 121: lload 1
      // 122: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 7
      // 12a: sipush 25069
      // 12d: ldc2_w 1257491105757755464
      // 130: lload 1
      // 131: lxor
      // 132: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: pop
      // 13b: aload 6
      // 13d: lload 1
      // 13e: lconst_0
      // 13f: lcmp
      // 140: ifle 32a
      // 143: ifnull 325
      // 146: goto 153
      // 149: ldc2_w 7955038137228544323
      // 14c: lload 1
      // 14d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: aload 7
      // 155: sipush 20463
      // 158: ldc2_w 741113340183303749
      // 15b: lload 1
      // 15c: lxor
      // 15d: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: pop
      // 166: aload 6
      // 168: lload 1
      // 169: lconst_0
      // 16a: lcmp
      // 16b: iflt 32a
      // 16e: ifnull 325
      // 171: goto 17e
      // 174: ldc2_w 7955038137228544323
      // 177: lload 1
      // 178: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: aload 7
      // 180: sipush 22597
      // 183: ldc2_w 843648794217890277
      // 186: lload 1
      // 187: lxor
      // 188: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: pop
      // 191: aload 6
      // 193: lload 1
      // 194: lconst_0
      // 195: lcmp
      // 196: iflt 32a
      // 199: ifnull 325
      // 19c: goto 1a9
      // 19f: ldc2_w 7955038137228544323
      // 1a2: lload 1
      // 1a3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: aload 7
      // 1ab: sipush 9002
      // 1ae: ldc2_w 7608647331050371715
      // 1b1: lload 1
      // 1b2: lxor
      // 1b3: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bb: pop
      // 1bc: aload 6
      // 1be: lload 1
      // 1bf: lconst_0
      // 1c0: lcmp
      // 1c1: iflt 32a
      // 1c4: ifnull 325
      // 1c7: goto 1d4
      // 1ca: ldc2_w 7955038137228544323
      // 1cd: lload 1
      // 1ce: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: aload 7
      // 1d6: sipush 17431
      // 1d9: ldc2_w 4340346413988371903
      // 1dc: lload 1
      // 1dd: lxor
      // 1de: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e6: pop
      // 1e7: aload 6
      // 1e9: lload 1
      // 1ea: lconst_0
      // 1eb: lcmp
      // 1ec: iflt 32a
      // 1ef: ifnull 325
      // 1f2: goto 1ff
      // 1f5: ldc2_w 7955038137228544323
      // 1f8: lload 1
      // 1f9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: aload 7
      // 201: sipush 24503
      // 204: ldc2_w 4955753034625828372
      // 207: lload 1
      // 208: lxor
      // 209: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 211: pop
      // 212: aload 6
      // 214: lload 1
      // 215: lconst_0
      // 216: lcmp
      // 217: ifle 32a
      // 21a: ifnull 325
      // 21d: goto 22a
      // 220: ldc2_w 7955038137228544323
      // 223: lload 1
      // 224: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: iload 8
      // 22c: goto 239
      // 22f: ldc2_w 7955038137228544323
      // 232: lload 1
      // 233: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: athrow
      // 239: sipush 6256
      // 23c: ldc2_w 4342996505693360510
      // 23f: lload 1
      // 240: lxor
      // 241: invokedynamic z (IJ)I bsm=com/zelix/l_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: lload 1
      // 247: lconst_0
      // 248: lcmp
      // 249: iflt 27d
      // 24c: aload 6
      // 24e: ifnonnull 27d
      // 251: if_icmplt 280
      // 254: goto 261
      // 257: ldc2_w 7955038137228544323
      // 25a: lload 1
      // 25b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: athrow
      // 261: iload 8
      // 263: sipush 24605
      // 266: ldc2_w 6270356397743827216
      // 269: lload 1
      // 26a: lxor
      // 26b: invokedynamic z (IJ)I bsm=com/zelix/l_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: goto 27d
      // 273: ldc2_w 7955038137228544323
      // 276: lload 1
      // 277: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: if_icmple 310
      // 280: aload 7
      // 282: new java/lang/StringBuilder
      // 285: dup
      // 286: invokespecial java/lang/StringBuilder.<init> ()V
      // 289: sipush 16071
      // 28c: ldc2_w 3967357371991107430
      // 28f: lload 1
      // 290: lxor
      // 291: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/l_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 299: iload 8
      // 29b: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 29e: sipush 32504
      // 2a1: ldc2_w 7934025855382452212
      // 2a4: lload 1
      // 2a5: lxor
      // 2a6: invokedynamic z (IJ)I bsm=com/zelix/l_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: bipush 4
      // 2ac: lload 4
      // 2ae: sipush 29562
      // 2b1: ldc2_w 2981536018052414069
      // 2b4: lload 1
      // 2b5: lxor
      // 2b6: invokedynamic z (IJ)I bsm=com/zelix/l_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: bipush 5
      // 2bc: anewarray 170
      // 2bf: dup_x1
      // 2c0: swap
      // 2c1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2c4: bipush 4
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x2
      // 2c8: dup_x2
      // 2c9: pop
      // 2ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cd: bipush 3
      // 2ce: swap
      // 2cf: aastore
      // 2d0: dup_x1
      // 2d1: swap
      // 2d2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2d5: bipush 2
      // 2d6: swap
      // 2d7: aastore
      // 2d8: dup_x1
      // 2d9: swap
      // 2da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2dd: bipush 1
      // 2de: swap
      // 2df: aastore
      // 2e0: dup_x1
      // 2e1: swap
      // 2e2: bipush 0
      // 2e3: swap
      // 2e4: aastore
      // 2e5: ldc2_w 7757491895456722540
      // 2e8: lload 1
      // 2e9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f7: pop
      // 2f8: aload 6
      // 2fa: lload 1
      // 2fb: lconst_0
      // 2fc: lcmp
      // 2fd: ifle 32a
      // 300: ifnull 325
      // 303: goto 310
      // 306: ldc2_w 7955038137228544323
      // 309: lload 1
      // 30a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: athrow
      // 310: aload 7
      // 312: iload 8
      // 314: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 317: pop
      // 318: goto 325
      // 31b: ldc2_w 7955038137228544323
      // 31e: lload 1
      // 31f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 324: athrow
      // 325: iinc 9 1
      // 328: aload 6
      // 32a: ifnull 039
      // 32d: aload 7
      // 32f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 332: areturn
   }

   static {
      long var11 = a ^ 27392675332134L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[11];
      int var18 = 0;
      String var17 = "ýÆ7Ñ¦8\u0083¬>\u00862v\u0007÷\u0082Å\u0010V\u0098y/7¬\bmy\\\u0096lÓ|È;( \u0019\u0094\u008c8UF]\u0085ª\u0099\u009e\u0090Wê%MÇ&\u0086jmae´r\u0014\u009d\u0002Unît¾²ë=\u000e\u0017Ì\u0010?ÿú1ã6\b~\u0015Ò¿?NÕs\u001c\u0018\u0089Q>2c\u0082\u001fÖk\u0016\u009dÕ\u000f\u0099ÏÚ\\\u001b0K9sä\u009a\u0010$iÌ\f\u0006=Ðc¿í\r¥T\u009c»³\u0010?%'¯¶sv¥\u0080o\u001b\u007f³^3\u0014\u0010=ê\u008eß\u000bN\\\u0088¥TïÈ§\u008b\u0011¾\u0010K\u009c\u0083\u008d\ruA\u008eüºÙÕ\u0099b\u001b¬";
      int var19 = "ýÆ7Ñ¦8\u0083¬>\u00862v\u0007÷\u0082Å\u0010V\u0098y/7¬\bmy\\\u0096lÓ|È;( \u0019\u0094\u008c8UF]\u0085ª\u0099\u009e\u0090Wê%MÇ&\u0086jmae´r\u0014\u009d\u0002Unît¾²ë=\u000e\u0017Ì\u0010?ÿú1ã6\b~\u0015Ò¿?NÕs\u001c\u0018\u0089Q>2c\u0082\u001fÖk\u0016\u009dÕ\u000f\u0099ÏÚ\\\u001b0K9sä\u009a\u0010$iÌ\f\u0006=Ðc¿í\r¥T\u009c»³\u0010?%'¯¶sv¥\u0080o\u001b\u007f³^3\u0014\u0010=ê\u008eß\u000bN\\\u0088¥TïÈ§\u008b\u0011¾\u0010K\u009c\u0083\u008d\ruA\u008eüºÙÕ\u0099b\u001b¬"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[11];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "¯·r®ãÍÌ\u008bÔ\u0018\u0096J\u0011«b|";
                     int var5 = "¯·r®ãÍÌ\u008bÔ\u0018\u0096J\u0011«b|".length();
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
                                    f = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0082|\u001ck²\u0080*$ëí¹5ØâÞ\u0011";
                                 var5 = "\u0082|\u001ck²\u0080*$ëí¹5ØâÞ\u0011".length();
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

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "q\u009bøøöw§ôsÇrÒ`æ&y\u0010vmRñt\u001a÷%ç¥¬\u0006\u0019`S\u0015";
                  var19 = "q\u009bøøöw§ôsÇrÒ`æ&y\u0010vmRñt\u001a÷%ç¥¬\u0006\u0019`S\u0015".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31005;
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
            throw new RuntimeException("com/zelix/l_", var10);
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
         throw new RuntimeException("com/zelix/l_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27057;
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
            throw new RuntimeException("com/zelix/l_", var14);
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
         throw new RuntimeException("com/zelix/l_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
