package com.zelix;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rl {
   private static final String f;
   private static Object v;
   private Map j;
   private Set U;
   private Map C;
   public static String Y;
   private Set u;
   public static char b;
   private List d;
   private static final String R;
   private static final char P;
   private static final String[] e;
   private boolean G;
   private String W;
   private static final long a = ess.a(-3292358461474359036L, -1461332727949690679L, MethodHandles.lookup().lookupClass()).a(112084303533395L);
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   public static String i(Object[] var0) {
      String var3 = (String)var0[0];
      boolean var4 = (Boolean)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;

      try {
         if (var4) {
            return var3.replace((char)b<"a">(6578, 4287806087995209722L ^ var1), x44.a<"h">(-7622408960217011155L, var1))
               + a<"e">(24985, 4409131986530004801L ^ var1);
         }
      } catch (g3 var5) {
         throw x44.a<"q">(var5, -7989941074747018006L, var1);
      }

      return var3 + a<"e">(8342, 3404014204202069572L ^ var1);
   }

   public _rv c(Object[] param1) {
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
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 3
      // 01d: pop
      // 01e: getstatic com/zelix/rl.a J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 79817654192473
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 34659454400110
      // 033: lxor
      // 034: lstore 8
      // 036: dup2
      // 037: ldc2_w 41462023766996
      // 03a: lxor
      // 03b: lstore 10
      // 03d: dup2
      // 03e: ldc2_w 133250344987920
      // 041: lxor
      // 042: lstore 12
      // 044: dup2
      // 045: ldc2_w 122964986555518
      // 048: lxor
      // 049: lstore 14
      // 04b: dup2
      // 04c: ldc2_w 37948368077065
      // 04f: lxor
      // 050: lstore 16
      // 052: pop2
      // 053: ldc2_w -6590774205952705140
      // 056: lload 4
      // 058: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: aload 0
      // 05e: ldc2_w -5128170373060710303
      // 061: lload 4
      // 063: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 2
      // 069: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 06e: astore 19
      // 070: astore 18
      // 072: aload 19
      // 074: aload 18
      // 076: ifnonnull 08c
      // 079: ifnull 139
      // 07c: goto 08a
      // 07f: ldc2_w -4682032438673696014
      // 082: lload 4
      // 084: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: aload 19
      // 08c: lload 4
      // 08e: lconst_0
      // 08f: lcmp
      // 090: iflt 0c2
      // 093: aload 18
      // 095: ifnonnull 0c2
      // 098: ldc2_w -5059974381259029713
      // 09b: lload 4
      // 09d: invokedynamic h (JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: if_acmpne 0c0
      // 0a5: goto 0b3
      // 0a8: ldc2_w -4682032438673696014
      // 0ab: lload 4
      // 0ad: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aconst_null
      // 0b4: areturn
      // 0b5: ldc2_w -4682032438673696014
      // 0b8: lload 4
      // 0ba: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 19
      // 0c2: instanceof java/io/File
      // 0c5: aload 18
      // 0c7: ifnonnull 10d
      // 0ca: ifeq 0f5
      // 0cd: goto 0db
      // 0d0: ldc2_w -4682032438673696014
      // 0d3: lload 4
      // 0d5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: new com/zelix/_rv
      // 0de: dup
      // 0df: aload 19
      // 0e1: checkcast java/io/File
      // 0e4: lload 6
      // 0e6: invokespecial com/zelix/_rv.<init> (Ljava/io/File;J)V
      // 0e9: areturn
      // 0ea: ldc2_w -4682032438673696014
      // 0ed: lload 4
      // 0ef: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 19
      // 0f7: aload 18
      // 0f9: ifnonnull 112
      // 0fc: instanceof com/zelix/wo
      // 0ff: goto 10d
      // 102: ldc2_w -4682032438673696014
      // 105: lload 4
      // 107: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: ifeq 139
      // 110: aload 19
      // 112: checkcast com/zelix/wo
      // 115: astore 20
      // 117: aload 20
      // 119: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 11c: checkcast java/util/zip/ZipFile
      // 11f: astore 21
      // 121: aload 20
      // 123: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 126: checkcast java/util/zip/ZipEntry
      // 129: astore 22
      // 12b: new com/zelix/_rv
      // 12e: dup
      // 12f: lload 12
      // 131: aload 21
      // 133: aload 22
      // 135: invokespecial com/zelix/_rv.<init> (JLjava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)V
      // 138: areturn
      // 139: aconst_null
      // 13a: astore 20
      // 13c: bipush 0
      // 13d: istore 21
      // 13f: iload 21
      // 141: aload 0
      // 142: ldc2_w -6510994023963304003
      // 145: lload 4
      // 147: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: invokeinterface java/util/List.size ()I 1
      // 151: if_icmpge 25f
      // 154: aload 0
      // 155: ldc2_w -6510994023963304003
      // 158: lload 4
      // 15a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: iload 21
      // 161: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 166: astore 22
      // 168: aload 22
      // 16a: instanceof java/io/File
      // 16d: aload 18
      // 16f: lload 4
      // 171: lconst_0
      // 172: lcmp
      // 173: ifle 269
      // 176: ifnonnull 267
      // 179: aload 18
      // 17b: ifnonnull 1fb
      // 17e: goto 18c
      // 181: ldc2_w -4682032438673696014
      // 184: lload 4
      // 186: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: ifeq 1f6
      // 18f: goto 19d
      // 192: ldc2_w -4682032438673696014
      // 195: lload 4
      // 197: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: aload 0
      // 19e: aload 22
      // 1a0: checkcast java/io/File
      // 1a3: aload 2
      // 1a4: lload 10
      // 1a6: bipush 3
      // 1a7: anewarray 388
      // 1aa: dup_x2
      // 1ab: dup_x2
      // 1ac: pop
      // 1ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b0: bipush 2
      // 1b1: swap
      // 1b2: aastore
      // 1b3: dup_x1
      // 1b4: swap
      // 1b5: bipush 1
      // 1b6: swap
      // 1b7: aastore
      // 1b8: dup_x1
      // 1b9: swap
      // 1ba: bipush 0
      // 1bb: swap
      // 1bc: aastore
      // 1bd: ldc2_w -5158610022240846158
      // 1c0: lload 4
      // 1c2: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: lload 4
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: ifle 1d7
      // 1ce: astore 20
      // 1d0: aload 18
      // 1d2: ifnonnull 25a
      // 1d5: aload 20
      // 1d7: ifnull 257
      // 1da: goto 1e8
      // 1dd: ldc2_w -4682032438673696014
      // 1e0: lload 4
      // 1e2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: goto 25f
      // 1eb: ldc2_w -4682032438673696014
      // 1ee: lload 4
      // 1f0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aload 22
      // 1f8: instanceof java/util/zip/ZipFile
      // 1fb: ifeq 257
      // 1fe: aload 0
      // 1ff: aload 22
      // 201: checkcast java/util/zip/ZipFile
      // 204: lload 16
      // 206: aload 2
      // 207: bipush 3
      // 208: anewarray 388
      // 20b: dup_x1
      // 20c: swap
      // 20d: bipush 2
      // 20e: swap
      // 20f: aastore
      // 210: dup_x2
      // 211: dup_x2
      // 212: pop
      // 213: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 216: bipush 1
      // 217: swap
      // 218: aastore
      // 219: dup_x1
      // 21a: swap
      // 21b: bipush 0
      // 21c: swap
      // 21d: aastore
      // 21e: ldc2_w -6368223805749909589
      // 221: lload 4
      // 223: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: astore 20
      // 22a: aload 18
      // 22c: lload 4
      // 22e: lconst_0
      // 22f: lcmp
      // 230: ifle 25c
      // 233: ifnonnull 25a
      // 236: aload 20
      // 238: ifnull 257
      // 23b: goto 249
      // 23e: ldc2_w -4682032438673696014
      // 241: lload 4
      // 243: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: goto 25f
      // 24c: ldc2_w -4682032438673696014
      // 24f: lload 4
      // 251: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: iinc 21 1
      // 25a: aload 18
      // 25c: ifnull 13f
      // 25f: lload 4
      // 261: lconst_0
      // 262: lcmp
      // 263: ifle 6ca
      // 266: iload 3
      // 267: aload 18
      // 269: ifnonnull 677
      // 26c: ifeq 66c
      // 26f: goto 27d
      // 272: ldc2_w -4682032438673696014
      // 275: lload 4
      // 277: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: aload 20
      // 27f: ifnonnull 66c
      // 282: goto 290
      // 285: ldc2_w -4682032438673696014
      // 288: lload 4
      // 28a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: athrow
      // 290: aload 0
      // 291: aload 18
      // 293: ifnonnull 66d
      // 296: goto 2a4
      // 299: ldc2_w -4682032438673696014
      // 29c: lload 4
      // 29e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2a7: new java/lang/StringBuilder
      // 2aa: dup
      // 2ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ae: ldc "/"
      // 2b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b3: aload 2
      // 2b4: sipush 4561
      // 2b7: ldc2_w 8278648643647836546
      // 2ba: lload 4
      // 2bc: lxor
      // 2bd: invokedynamic a (IJ)I bsm=com/zelix/rl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: sipush 21286
      // 2c5: ldc2_w 3362604705946063732
      // 2c8: lload 4
      // 2ca: lxor
      // 2cb: invokedynamic a (IJ)I bsm=com/zelix/rl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 2d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d6: sipush 8342
      // 2d9: ldc2_w 3403998128834084956
      // 2dc: lload 4
      // 2de: lxor
      // 2df: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/rl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ea: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 2ed: astore 21
      // 2ef: aload 21
      // 2f1: lload 4
      // 2f3: lconst_0
      // 2f4: lcmp
      // 2f5: iflt 2fd
      // 2f8: ifnull 66c
      // 2fb: aload 21
      // 2fd: ldc2_w -5151223647975276891
      // 300: lload 4
      // 302: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: astore 22
      // 309: aload 21
      // 30b: ldc2_w -6651807374964271431
      // 30e: lload 4
      // 310: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: lload 14
      // 317: dup2_x1
      // 318: pop2
      // 319: bipush 2
      // 31a: anewarray 388
      // 31d: dup_x1
      // 31e: swap
      // 31f: bipush 1
      // 320: swap
      // 321: aastore
      // 322: dup_x2
      // 323: dup_x2
      // 324: pop
      // 325: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 328: bipush 0
      // 329: swap
      // 32a: aastore
      // 32b: ldc2_w -6674656298669601802
      // 32e: lload 4
      // 330: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: astore 23
      // 337: aload 22
      // 339: sipush 14143
      // 33c: ldc2_w 1583080849409677299
      // 33f: lload 4
      // 341: lxor
      // 342: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/rl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: ldc2_w -6574410404645321486
      // 34a: lload 4
      // 34c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: aload 18
      // 353: lload 4
      // 355: lconst_0
      // 356: lcmp
      // 357: ifle 5e7
      // 35a: ifnonnull 5e5
      // 35d: ifeq 5bd
      // 360: goto 36e
      // 363: ldc2_w -4682032438673696014
      // 366: lload 4
      // 368: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: athrow
      // 36e: aload 23
      // 370: bipush 0
      // 371: bipush 5
      // 372: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 375: aload 18
      // 377: ifnonnull 3ca
      // 37a: goto 388
      // 37d: ldc2_w -4682032438673696014
      // 380: lload 4
      // 382: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: athrow
      // 388: sipush 28626
      // 38b: ldc2_w 1573002773199605530
      // 38e: lload 4
      // 390: lxor
      // 391: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/rl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 396: ldc2_w -6574410404645321486
      // 399: lload 4
      // 39b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a0: ifeq 498
      // 3a3: goto 3b1
      // 3a6: ldc2_w -4682032438673696014
      // 3a9: lload 4
      // 3ab: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b0: athrow
      // 3b1: aload 23
      // 3b3: bipush 5
      // 3b4: aload 23
      // 3b6: invokevirtual java/lang/String.length ()I
      // 3b9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3bc: goto 3ca
      // 3bf: ldc2_w -4682032438673696014
      // 3c2: lload 4
      // 3c4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: athrow
      // 3ca: astore 25
      // 3cc: aload 25
      // 3ce: sipush 15965
      // 3d1: ldc2_w 1157899410376539656
      // 3d4: lload 4
      // 3d6: lxor
      // 3d7: invokedynamic a (IJ)I bsm=com/zelix/rl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dc: invokevirtual java/lang/String.indexOf (I)I
      // 3df: istore 26
      // 3e1: iload 26
      // 3e3: aload 18
      // 3e5: ifnonnull 3fa
      // 3e8: ifle 3fd
      // 3eb: goto 3f9
      // 3ee: ldc2_w -4682032438673696014
      // 3f1: lload 4
      // 3f3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: athrow
      // 3f9: bipush 1
      // 3fa: goto 3fe
      // 3fd: bipush 0
      // 3fe: bipush 1
      // 3ff: anewarray 7
      // 402: dup
      // 403: bipush 0
      // 404: aload 21
      // 406: ldc2_w -6427763358763896552
      // 409: lload 4
      // 40b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 410: aastore
      // 411: lload 8
      // 413: dup2_x2
      // 414: pop2
      // 415: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 418: iload 26
      // 41a: aload 18
      // 41c: lload 4
      // 41e: lconst_0
      // 41f: lcmp
      // 420: iflt 428
      // 423: ifnonnull 459
      // 426: aload 25
      // 428: sipush 11809
      // 42b: ldc2_w 643481730054434416
      // 42e: lload 4
      // 430: lxor
      // 431: invokedynamic a (IJ)I bsm=com/zelix/rl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 436: invokevirtual java/lang/String.lastIndexOf (I)I
      // 439: if_icmpne 45c
      // 43c: goto 44a
      // 43f: ldc2_w -4682032438673696014
      // 442: lload 4
      // 444: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 449: athrow
      // 44a: bipush 1
      // 44b: goto 459
      // 44e: ldc2_w -4682032438673696014
      // 451: lload 4
      // 453: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 458: athrow
      // 459: goto 45d
      // 45c: bipush 0
      // 45d: bipush 1
      // 45e: anewarray 7
      // 461: dup
      // 462: bipush 0
      // 463: aload 21
      // 465: ldc2_w -6427763358763896552
      // 468: lload 4
      // 46a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46f: aastore
      // 470: lload 8
      // 472: dup2_x2
      // 473: pop2
      // 474: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 477: aload 25
      // 479: bipush 0
      // 47a: iload 26
      // 47c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 47f: astore 27
      // 481: new java/io/File
      // 484: dup
      // 485: aload 27
      // 487: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 48a: astore 24
      // 48c: lload 4
      // 48e: lconst_0
      // 48f: lcmp
      // 490: ifle 4a3
      // 493: aload 18
      // 495: ifnull 4a3
      // 498: new java/io/File
      // 49b: dup
      // 49c: aload 23
      // 49e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 4a1: astore 24
      // 4a3: aload 24
      // 4a5: ldc2_w -6747728576880184153
      // 4a8: lload 4
      // 4aa: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4af: aload 18
      // 4b1: ifnonnull 4f2
      // 4b4: ifeq 5b1
      // 4b7: goto 4c5
      // 4ba: ldc2_w -4682032438673696014
      // 4bd: lload 4
      // 4bf: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c4: athrow
      // 4c5: aload 24
      // 4c7: aload 18
      // 4c9: ifnonnull 4f7
      // 4cc: goto 4da
      // 4cf: ldc2_w -4682032438673696014
      // 4d2: lload 4
      // 4d4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d9: athrow
      // 4da: ldc2_w -6635466489029648373
      // 4dd: lload 4
      // 4df: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e4: goto 4f2
      // 4e7: ldc2_w -4682032438673696014
      // 4ea: lload 4
      // 4ec: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f1: athrow
      // 4f2: ifne 5b1
      // 4f5: aload 24
      // 4f7: ldc2_w -4958405925189323981
      // 4fa: lload 4
      // 4fc: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: astore 26
      // 503: aload 0
      // 504: ldc2_w -4992383185022835245
      // 507: lload 4
      // 509: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50e: lload 4
      // 510: lconst_0
      // 511: lcmp
      // 512: ifle 552
      // 515: aload 26
      // 517: aload 18
      // 519: ifnonnull 54d
      // 51c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 521: ifeq 563
      // 524: goto 532
      // 527: ldc2_w -4682032438673696014
      // 52a: lload 4
      // 52c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 531: athrow
      // 532: aload 0
      // 533: ldc2_w -4992383185022835245
      // 536: lload 4
      // 538: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53d: aload 26
      // 53f: goto 54d
      // 542: ldc2_w -4682032438673696014
      // 545: lload 4
      // 547: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54c: athrow
      // 54d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 552: checkcast java/util/zip/ZipFile
      // 555: astore 25
      // 557: lload 4
      // 559: lconst_0
      // 55a: lcmp
      // 55b: ifle 5ac
      // 55e: aload 18
      // 560: ifnull 583
      // 563: new com/zelix/_ux
      // 566: dup
      // 567: aload 24
      // 569: invokespecial com/zelix/_ux.<init> (Ljava/io/File;)V
      // 56c: astore 25
      // 56e: aload 0
      // 56f: ldc2_w -4992383185022835245
      // 572: lload 4
      // 574: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 579: aload 26
      // 57b: aload 25
      // 57d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 582: pop
      // 583: aload 0
      // 584: aload 25
      // 586: lload 16
      // 588: aload 2
      // 589: bipush 3
      // 58a: anewarray 388
      // 58d: dup_x1
      // 58e: swap
      // 58f: bipush 2
      // 590: swap
      // 591: aastore
      // 592: dup_x2
      // 593: dup_x2
      // 594: pop
      // 595: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 598: bipush 1
      // 599: swap
      // 59a: aastore
      // 59b: dup_x1
      // 59c: swap
      // 59d: bipush 0
      // 59e: swap
      // 59f: aastore
      // 5a0: ldc2_w -6368223805749909589
      // 5a3: lload 4
      // 5a5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5aa: astore 20
      // 5ac: goto 5b1
      // 5af: astore 25
      // 5b1: aload 18
      // 5b3: lload 4
      // 5b5: lconst_0
      // 5b6: lcmp
      // 5b7: ifle 5bf
      // 5ba: ifnull 66c
      // 5bd: aload 22
      // 5bf: sipush 24640
      // 5c2: ldc2_w 5010580812041011339
      // 5c5: lload 4
      // 5c7: lxor
      // 5c8: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/rl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cd: ldc2_w -6574410404645321486
      // 5d0: lload 4
      // 5d2: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d7: goto 5e5
      // 5da: ldc2_w -4682032438673696014
      // 5dd: lload 4
      // 5df: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e4: athrow
      // 5e5: aload 18
      // 5e7: ifnonnull 677
      // 5ea: ifeq 66c
      // 5ed: goto 5fb
      // 5f0: ldc2_w -4682032438673696014
      // 5f3: lload 4
      // 5f5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fa: athrow
      // 5fb: new java/io/File
      // 5fe: dup
      // 5ff: aload 23
      // 601: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 604: astore 24
      // 606: aload 24
      // 608: ldc2_w -6747728576880184153
      // 60b: lload 4
      // 60d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 612: aload 18
      // 614: ifnonnull 677
      // 617: ifeq 66c
      // 61a: goto 628
      // 61d: ldc2_w -4682032438673696014
      // 620: lload 4
      // 622: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 627: athrow
      // 628: aload 24
      // 62a: ldc2_w -6635466489029648373
      // 62d: lload 4
      // 62f: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 634: lload 4
      // 636: lconst_0
      // 637: lcmp
      // 638: ifle 677
      // 63b: aload 18
      // 63d: ifnonnull 677
      // 640: goto 64e
      // 643: ldc2_w -4682032438673696014
      // 646: lload 4
      // 648: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64d: athrow
      // 64e: ifne 66c
      // 651: goto 65f
      // 654: ldc2_w -4682032438673696014
      // 657: lload 4
      // 659: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65e: athrow
      // 65f: new com/zelix/_rv
      // 662: dup
      // 663: aload 24
      // 665: lload 6
      // 667: invokespecial com/zelix/_rv.<init> (Ljava/io/File;J)V
      // 66a: astore 20
      // 66c: aload 0
      // 66d: ldc2_w -4874094634130128274
      // 670: lload 4
      // 672: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 677: ifeq 6ca
      // 67a: aload 20
      // 67c: aload 18
      // 67e: ifnonnull 6cc
      // 681: goto 68f
      // 684: ldc2_w -4682032438673696014
      // 687: lload 4
      // 689: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68e: athrow
      // 68f: ifnonnull 6ca
      // 692: goto 6a0
      // 695: ldc2_w -4682032438673696014
      // 698: lload 4
      // 69a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69f: athrow
      // 6a0: aload 0
      // 6a1: ldc2_w -5128170373060710303
      // 6a4: lload 4
      // 6a6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ab: aload 2
      // 6ac: ldc2_w -5059974381259029713
      // 6af: lload 4
      // 6b1: invokedynamic h (JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6bb: pop
      // 6bc: goto 6ca
      // 6bf: ldc2_w -4682032438673696014
      // 6c2: lload 4
      // 6c4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c9: athrow
      // 6ca: aload 20
      // 6cc: areturn
   }

   private _rv n(Object[] param1) {
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
      // 004: checkcast java/util/zip/ZipFile
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
      // 015: checkcast java/lang/String
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/rl.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 611385824025
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 116748795631612
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 136340364861580
      // 034: lxor
      // 035: lstore 10
      // 037: dup2
      // 038: ldc2_w 42640301568546
      // 03b: lxor
      // 03c: lstore 12
      // 03e: dup2
      // 03f: ldc2_w 52926687407889
      // 042: lxor
      // 043: lstore 14
      // 045: pop2
      // 046: ldc2_w 2960229412724748304
      // 049: lload 3
      // 04a: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: aload 5
      // 051: bipush 0
      // 052: lload 14
      // 054: bipush 3
      // 055: anewarray 388
      // 058: dup_x2
      // 059: dup_x2
      // 05a: pop
      // 05b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05e: bipush 2
      // 05f: swap
      // 060: aastore
      // 061: dup_x1
      // 062: swap
      // 063: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 066: bipush 1
      // 067: swap
      // 068: aastore
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 0
      // 06c: swap
      // 06d: aastore
      // 06e: ldc2_w 3545661548516407477
      // 071: lload 3
      // 072: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: astore 17
      // 079: aload 2
      // 07a: aload 17
      // 07c: ldc2_w 3512059526514721789
      // 07f: lload 3
      // 080: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/zip/ZipEntry; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: astore 18
      // 087: astore 16
      // 089: aload 18
      // 08b: aload 16
      // 08d: ifnonnull 143
      // 090: ifnonnull 13b
      // 093: goto 0a0
      // 096: ldc2_w 3646246078044510062
      // 099: lload 3
      // 09a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: ldc2_w 3852521878980149831
      // 0a3: lload 3
      // 0a4: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: astore 19
      // 0ab: aload 19
      // 0ad: arraylength
      // 0ae: istore 20
      // 0b0: bipush 0
      // 0b1: istore 21
      // 0b3: iload 21
      // 0b5: iload 20
      // 0b7: if_icmpge 13b
      // 0ba: aload 19
      // 0bc: iload 21
      // 0be: aaload
      // 0bf: astore 22
      // 0c1: new java/lang/StringBuilder
      // 0c4: dup
      // 0c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c8: aload 22
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: aload 17
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d5: astore 23
      // 0d7: aload 2
      // 0d8: aload 23
      // 0da: ldc2_w 3512059526514721789
      // 0dd: lload 3
      // 0de: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/zip/ZipEntry; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: astore 18
      // 0e5: aload 16
      // 0e7: lload 3
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: iflt 138
      // 0ed: ifnonnull 136
      // 0f0: aload 18
      // 0f2: aload 16
      // 0f4: ifnonnull 143
      // 0f7: goto 104
      // 0fa: ldc2_w 3646246078044510062
      // 0fd: lload 3
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: ifnull 126
      // 107: goto 114
      // 10a: ldc2_w 3646246078044510062
      // 10d: lload 3
      // 10e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: aload 16
      // 116: ifnull 13b
      // 119: goto 126
      // 11c: ldc2_w 3646246078044510062
      // 11f: lload 3
      // 120: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iinc 21 1
      // 129: goto 136
      // 12c: ldc2_w 3646246078044510062
      // 12f: lload 3
      // 130: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 16
      // 138: ifnull 0b3
      // 13b: lload 3
      // 13c: lconst_0
      // 13d: lcmp
      // 13e: iflt 1ff
      // 141: aload 18
      // 143: aload 16
      // 145: ifnonnull 15a
      // 148: ifnull 1ff
      // 14b: goto 158
      // 14e: ldc2_w 3646246078044510062
      // 151: lload 3
      // 152: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: aload 18
      // 15a: invokevirtual java/util/zip/ZipEntry.isDirectory ()Z
      // 15d: ifne 1ff
      // 160: new java/io/File
      // 163: dup
      // 164: aload 2
      // 165: ldc2_w 3765144415172276168
      // 168: lload 3
      // 169: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 171: astore 19
      // 173: aload 19
      // 175: lload 12
      // 177: bipush 2
      // 178: anewarray 388
      // 17b: dup_x2
      // 17c: dup_x2
      // 17d: pop
      // 17e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 181: bipush 1
      // 182: swap
      // 183: aastore
      // 184: dup_x1
      // 185: swap
      // 186: bipush 0
      // 187: swap
      // 188: aastore
      // 189: ldc2_w 3077992940381009579
      // 18c: lload 3
      // 18d: lload 3
      // 18e: lconst_0
      // 18f: lcmp
      // 190: ifle 1b2
      // 193: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: ifeq 1f2
      // 19b: aload 2
      // 19c: ldc2_w 3765144415172276168
      // 19f: lload 3
      // 1a0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: bipush 1
      // 1a6: anewarray 388
      // 1a9: dup_x1
      // 1aa: swap
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: ldc2_w 3110901641858749572
      // 1b1: lload 3
      // 1b2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: astore 20
      // 1b9: aload 20
      // 1bb: ifnull 1f2
      // 1be: new com/zelix/_f2
      // 1c1: dup
      // 1c2: aload 19
      // 1c4: ldc2_w 3939577804808224431
      // 1c7: lload 3
      // 1c8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: lload 8
      // 1cf: dup2_x1
      // 1d0: pop2
      // 1d1: aload 19
      // 1d3: ldc2_w 3908222565716444488
      // 1d6: lload 3
      // 1d7: invokedynamic m (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: aload 20
      // 1de: invokespecial com/zelix/_f2.<init> (JLjava/lang/String;JLjava/lang/String;)V
      // 1e1: astore 21
      // 1e3: new com/zelix/_rv
      // 1e6: dup
      // 1e7: aload 2
      // 1e8: lload 6
      // 1ea: aload 18
      // 1ec: aload 21
      // 1ee: invokespecial com/zelix/_rv.<init> (Ljava/util/zip/ZipFile;JLjava/util/zip/ZipEntry;Lcom/zelix/_f2;)V
      // 1f1: areturn
      // 1f2: new com/zelix/_rv
      // 1f5: dup
      // 1f6: lload 10
      // 1f8: aload 2
      // 1f9: aload 18
      // 1fb: invokespecial com/zelix/_rv.<init> (JLjava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)V
      // 1fe: areturn
      // 1ff: aconst_null
      // 200: areturn
   }

   public rl(String var1, long var2, boolean var4) {
      var2 = a ^ var2;
      int var5 = (int)((var2 ^ 6444911219121L) >>> 32);
      int var6 = (int)((var2 ^ 6444911219121L) << 32 >>> 32);
      this(var1, var4, var5, false, var6, (_zk)null);
   }

   static {
      long var20 = a ^ 32174614600820L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[25];
      int var16 = 0;
      String var15 = "4\u009e¸Z\u001b\u000b>æÛè\u0088Qº§\u001e£M±3 ¬gA¼¨nV\u001f\u0005\u000em\u0005\u0010\u0095j+/&¡hµýù©\u0014-½¼µ\u0010\u0094\u0012\u0001¹z!¨õ\u0010ñl«ÙI4é\u0010Uv Âÿ\u0098HÜj*:Tà\u0082ëÍ\u0010(W\u0083°hæ<ÈÃ\u0099Åój\t\u008a\u0096\u0010\u007f§+¹\u0004\fóB\u0014uë\u0085\u009e-\u009fB(§³ôu£Ù\u008e\u001aÏ8LGÆÊê?\fÁ\u0081t\u008d!mÁl\u001eaD :«\u0004%E\u0091}pÅjê@\u0018¾?¾Âþ\u009a´£õM¸0ÊÿÏ\r3\u007fAè2þÑm\fÎÃ\u0013ÄmeÑÙ\u0016RStfÍÌé\u0087T=\u0088¡\u008c~êç){¡\u00ad\u0099Q\u0093»-C9êZ(\u007f§\u009560¦ê°\u001cz£?\u009c+Ç\u0085U\u0017yéyÉãª\\¿Ï%ðñ¾ÓDó:EVa~Ö\u0010°\\\u0085\u009dA\u001céÙÄDä\u0097)·éï\u0010ÒisjS¤\r\u0095Q\u009aWë*\u0082e\u0089\u0018<\u0017zqfÅ'\u008eïÓÖ\u008eÑ\u0085Hÿ7óVZûïñ¿\u0010\u008d\u008fòOLX«ê`\u000fÚFG].) ò/òõ\u0017ÊÈås\u0006F{~(O\u0015fx-\u0096\u0098\u0091\u0080wÖdsÂlötj \u001bTÍ!bR³\u0082\u0083@Ïí\u0004\u008dH%\f=&ó¬â ñ-ÁU\u0091Å4îN(¤\u00190ÄÞ\u0095\u0004p9Þ\u000e\u0091\u0014#ûV´¢Àè\u009c\u0003\u0016u`\u008d\u009féß@°¾\u0011È\u0088÷ò\u0085\u0011`\u0010\u0001\u008aSW{ÇÄpØ.öí\u009d:nØ8>î\u0006·±¸\u008a¥¿Yu\u0081àà\u000b2Óf´ùùÅkÔø)\u008eúøãkIªÁöEÛ@\u0093þ\u000bò!ôñ»ø®hGHØE\u0015ÃÞ \u009f(äFÃô\u001b²\u008b(77ú\r\u009eLy\u0002¾\u0082\r3ÛÀÃOdP\u0018%>\u009b\u0010Ûüy\u008c\u0080b²ª\u0093ÓE\u0014~3|\u000b\u0010Å¥ùJ\u0005\bmÀ¾\u0090Î¨st]f\u0010\u001fXÇ\\îó¤R\u001aì\u0004ë\u009bYàH\u0010\u0082æmp\u0097\u00adD¥Yw¨ ¶¹kK";
      int var17 = "4\u009e¸Z\u001b\u000b>æÛè\u0088Qº§\u001e£M±3 ¬gA¼¨nV\u001f\u0005\u000em\u0005\u0010\u0095j+/&¡hµýù©\u0014-½¼µ\u0010\u0094\u0012\u0001¹z!¨õ\u0010ñl«ÙI4é\u0010Uv Âÿ\u0098HÜj*:Tà\u0082ëÍ\u0010(W\u0083°hæ<ÈÃ\u0099Åój\t\u008a\u0096\u0010\u007f§+¹\u0004\fóB\u0014uë\u0085\u009e-\u009fB(§³ôu£Ù\u008e\u001aÏ8LGÆÊê?\fÁ\u0081t\u008d!mÁl\u001eaD :«\u0004%E\u0091}pÅjê@\u0018¾?¾Âþ\u009a´£õM¸0ÊÿÏ\r3\u007fAè2þÑm\fÎÃ\u0013ÄmeÑÙ\u0016RStfÍÌé\u0087T=\u0088¡\u008c~êç){¡\u00ad\u0099Q\u0093»-C9êZ(\u007f§\u009560¦ê°\u001cz£?\u009c+Ç\u0085U\u0017yéyÉãª\\¿Ï%ðñ¾ÓDó:EVa~Ö\u0010°\\\u0085\u009dA\u001céÙÄDä\u0097)·éï\u0010ÒisjS¤\r\u0095Q\u009aWë*\u0082e\u0089\u0018<\u0017zqfÅ'\u008eïÓÖ\u008eÑ\u0085Hÿ7óVZûïñ¿\u0010\u008d\u008fòOLX«ê`\u000fÚFG].) ò/òõ\u0017ÊÈås\u0006F{~(O\u0015fx-\u0096\u0098\u0091\u0080wÖdsÂlötj \u001bTÍ!bR³\u0082\u0083@Ïí\u0004\u008dH%\f=&ó¬â ñ-ÁU\u0091Å4îN(¤\u00190ÄÞ\u0095\u0004p9Þ\u000e\u0091\u0014#ûV´¢Àè\u009c\u0003\u0016u`\u008d\u009féß@°¾\u0011È\u0088÷ò\u0085\u0011`\u0010\u0001\u008aSW{ÇÄpØ.öí\u009d:nØ8>î\u0006·±¸\u008a¥¿Yu\u0081àà\u000b2Óf´ùùÅkÔø)\u008eúøãkIªÁöEÛ@\u0093þ\u000bò!ôñ»ø®hGHØE\u0015ÃÞ \u009f(äFÃô\u001b²\u008b(77ú\r\u009eLy\u0002¾\u0082\r3ÛÀÃOdP\u0018%>\u009b\u0010Ûüy\u008c\u0080b²ª\u0093ÓE\u0014~3|\u000b\u0010Å¥ùJ\u0005\bmÀ¾\u0090Î¨st]f\u0010\u001fXÇ\\îó¤R\u001aì\u0004ë\u009bYàH\u0010\u0082æmp\u0097\u00adD¥Yw¨ ¶¹kK"
         .length();
      char var14 = ' ';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     c = var18;
                     g = new String[25];
                     l = new HashMap(13);
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
                     String var4 = "_Uñk\u00856\u001aD·\fi\n{\u001e\u0005e-\u001e)Z_\u0019ì\u007f\u008b\u001d\u001eÒ\u00916gÍ";
                     int var5 = "_Uñk\u00856\u001aD·\fi\n{\u001e\u0005e-\u001e)Z_\u0019ì\u007f\u008b\u001d\u001eÒ\u00916gÍ".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var41 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var41;
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
                           long var46 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var28[var10001] = var46;
                                 if (var2 >= var5) {
                                    i = var6;
                                    k = new Integer[6];
                                    f = x44.a<"r">(a<"e">(6802, 491052885071961317L ^ var20), 1915041274656003459L, var20);
                                    P = x44.a<"k">(455259797266983578L, var20).charAt(0);
                                    long var35 = 8729956130712106124L ^ var20;
                                    R = x44.a<"r">(a<"e">(16293, 7020956262778976717L ^ var20), 1915041274656003459L, var20);
                                    e = new String[]{a<"e">(21765, 1450988529827304313L ^ var20), a<"e">(30531, 5122096215757910321L ^ var20)};
                                    x44.a<"s">(new Object(), 2266484000565503388L, var20);
                                    x44.a<"s">((char)b<"a">(4715, var35), 176737817267852740L, var20);
                                    x44.a<"s">(String.valueOf(x44.a<"k">(176737817267852740L, var20)), 429919662551338409L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\"ï\"n\u0015«\u0099ëÀ=¶VM{É\u0086";
                                 var5 = "\"ï\"n\u0015«\u0099ëÀ=¶VM{É\u0086".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var41 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "R\u001eÀ©ë,\u009bX\"±\u008bÐ\u009c\u008aÇNýÓÍ\u0087§78\u008a(a§æÑ\u0080Y(\u0010\u0094.6\u0096#5Hï\u0012\u00914ÔªåÍã";
                  var17 = "R\u001eÀ©ë,\u009bX\"±\u008bÐ\u009c\u008aÇNýÓÍ\u0087§78\u008a(a§æÑ\u0080Y(\u0010\u0094.6\u0096#5Hï\u0012\u00914ÔªåÍã".length();
                  var14 = ' ';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public boolean j(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/rl.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: aload 2
      // 01a: sipush 21286
      // 01d: ldc2_w 3362581348244882217
      // 020: lload 3
      // 021: lxor
      // 022: invokedynamic a (IJ)I bsm=com/zelix/rl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: ldc2_w -1697075241108450712
      // 02a: lload 3
      // 02b: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 033: astore 6
      // 035: ldc2_w -804513728079532591
      // 038: lload 3
      // 039: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: bipush 0
      // 03f: istore 7
      // 041: astore 5
      // 043: iload 7
      // 045: aload 0
      // 046: ldc2_w -722445457007276064
      // 049: lload 3
      // 04a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: invokeinterface java/util/List.size ()I 1
      // 054: if_icmpge 1c3
      // 057: aload 0
      // 058: ldc2_w -722445457007276064
      // 05b: lload 3
      // 05c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: iload 7
      // 063: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 068: astore 8
      // 06a: aload 8
      // 06c: instanceof java/io/File
      // 06f: aload 5
      // 071: lload 3
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 07c
      // 077: ifnonnull 1c4
      // 07a: aload 5
      // 07c: ifnonnull 15d
      // 07f: goto 08c
      // 082: ldc2_w -1199362074934064465
      // 085: lload 3
      // 086: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: ifeq 139
      // 08f: goto 09c
      // 092: ldc2_w -1199362074934064465
      // 095: lload 3
      // 096: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 8
      // 09e: checkcast java/io/File
      // 0a1: astore 9
      // 0a3: new java/lang/StringBuilder
      // 0a6: dup
      // 0a7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0aa: aload 9
      // 0ac: ldc2_w -1482490402511477906
      // 0af: lload 3
      // 0b0: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b8: ldc2_w -1099149109690721164
      // 0bb: lload 3
      // 0bc: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: aload 6
      // 0c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cc: astore 10
      // 0ce: new java/io/File
      // 0d1: dup
      // 0d2: aload 10
      // 0d4: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0d7: astore 11
      // 0d9: aload 11
      // 0db: ldc2_w -1007022506792934150
      // 0de: lload 3
      // 0df: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: aload 5
      // 0e6: lload 3
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: iflt 119
      // 0ec: ifnonnull 117
      // 0ef: ifeq 12e
      // 0f2: goto 0ff
      // 0f5: ldc2_w -1199362074934064465
      // 0f8: lload 3
      // 0f9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 11
      // 101: ldc2_w -885238098355261354
      // 104: lload 3
      // 105: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: goto 117
      // 10d: ldc2_w -1199362074934064465
      // 110: lload 3
      // 111: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 5
      // 119: ifnonnull 12d
      // 11c: ifeq 12e
      // 11f: goto 12c
      // 122: ldc2_w -1199362074934064465
      // 125: lload 3
      // 126: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: bipush 1
      // 12d: ireturn
      // 12e: aload 5
      // 130: lload 3
      // 131: lconst_0
      // 132: lcmp
      // 133: ifle 13b
      // 136: ifnull 1bb
      // 139: aload 8
      // 13b: aload 5
      // 13d: ifnonnull 162
      // 140: goto 14d
      // 143: ldc2_w -1199362074934064465
      // 146: lload 3
      // 147: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: instanceof java/util/zip/ZipFile
      // 150: goto 15d
      // 153: ldc2_w -1199362074934064465
      // 156: lload 3
      // 157: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: ifeq 1bb
      // 160: aload 8
      // 162: checkcast java/util/zip/ZipFile
      // 165: astore 9
      // 167: aload 9
      // 169: aload 2
      // 16a: ldc2_w -1334116102051717572
      // 16d: lload 3
      // 16e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/zip/ZipEntry; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: astore 10
      // 175: aload 5
      // 177: lload 3
      // 178: lconst_0
      // 179: lcmp
      // 17a: ifle 1c0
      // 17d: ifnonnull 1be
      // 180: aload 10
      // 182: ifnull 1bb
      // 185: goto 192
      // 188: ldc2_w -1199362074934064465
      // 18b: lload 3
      // 18c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: aload 10
      // 194: invokevirtual java/util/zip/ZipEntry.isDirectory ()Z
      // 197: aload 5
      // 199: ifnonnull 1ba
      // 19c: goto 1a9
      // 19f: ldc2_w -1199362074934064465
      // 1a2: lload 3
      // 1a3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: ifeq 1bb
      // 1ac: goto 1b9
      // 1af: ldc2_w -1199362074934064465
      // 1b2: lload 3
      // 1b3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: bipush 1
      // 1ba: ireturn
      // 1bb: iinc 7 1
      // 1be: aload 5
      // 1c0: ifnull 043
      // 1c3: bipush 0
      // 1c4: ireturn
   }

   private void X(Object[] var1) {
      String var5 = (String)var1[0];
      _zk var4 = (_zk)var1[1];
      long var2 = (Long)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 22283862928920L;
      long var8 = var2 ^ 70381670434363L;

      rl var10000;
      Object var10001;
      label17: {
         try {
            x44.a<"s">(this, var5, -6446724899243358988L, var2);
            x44.a<"s">(this, new LinkedHashSet(), -6791069713547749222L, var2);
            x44.a<"s">(
               this,
               x44.a<"p">(
                  new Object[]{var5, x44.a<"l">(this, -6791069713547749222L, var2), x44.a<"l">(this, -6649335096042461208L, var2), var8, null, var4},
                  -6609264324917374757L,
                  var2
               ),
               -4747541176139004924L,
               var2
            );
            var10000 = this;
            if (x44.a<"i">(-4893203425442081144L, var2)) {
               var10001 = new ConcurrentHashMap();
               break label17;
            }
         } catch (g3 var10) {
            throw x44.a<"p">(var10, -6575535457550499509L, var2);
         }

         var10001 = x44.a<"p">(new Object[]{var6}, -6636974492323986037L, var2);
      }

      x44.a<"s">(var10000, (Map)var10001, -6670955651042071592L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static boolean z(Object[] var0) {
      String var1 = (String)var0[0];
      long var3 = (Long)var0[1];
      String var2 = (String)var0[2];
      var3 = a ^ var3;
      long var5 = var3 ^ 91311466136942L;
      _ux var9 = null;
      String var10000 = x44.a<"r">(246497147065277039L, var3);
      File var10 = new File(var1);
      String var7 = var10000;

      try {
         var9 = new _ux(var10);
      } catch (IOException var17) {
         label73: {
            try {
               if (var3 < 0L) {
                  return false;
               }

               var26 = var9;
               if (var7 != null) {
                  break label73;
               }

               if (var9 == null) {
                  return false;
               }
            } catch (IOException var16) {
               throw x44.a<"r">(var16, 1793965730243755281L, var3);
            }

            try {
               var26 = var9;
            } catch (IOException var15) {
               boolean var10001 = false;
               return false;
            }
         }

         try {
            x44.a<"j">(var26, 48905492165678822L, var3);
         } catch (IOException var14) {
            boolean var31 = false;
         }

         return false;
      }

      Object[] var10004 = new Object[]{null, null, var5};
      var10004[1] = false;
      var10004[0] = var2;
      String var11 = x44.a<"r">(var10004, 1966906774945714890L, var3);
      ZipEntry var12 = x44.a<"j">(var9, var11, 1928161482131499394L, var3);

      boolean var8;
      label124: {
         label147: {
            label130: {
               label120: {
                  try {
                     var27 = var12;
                     if (var3 < 0L || var7 != null) {
                        break label120;
                     }

                     if (var12 == null) {
                        break label130;
                     }
                  } catch (IOException var24) {
                     throw x44.a<"r">(var24, 1793965730243755281L, var3);
                  }

                  var27 = var12;
               }

               try {
                  var28 = var27.isDirectory();
                  if (var7 != null) {
                     break label147;
                  }

                  if (var28) {
                     break label130;
                  }
               } catch (IOException var23) {
                  throw x44.a<"r">(var23, 1793965730243755281L, var3);
               }

               var8 = true;

               try {
                  if (var3 <= 0L || var7 == null) {
                     break label124;
                  }
               } catch (IOException var22) {
                  boolean var32 = false;
                  throw x44.a<"r">(var22, 1793965730243755281L, var3);
               }
            }

            try {
               var28 = false;
            } catch (IOException var21) {
               boolean var33 = false;
               throw x44.a<"r">(var21, 1793965730243755281L, var3);
            }
         }

         var8 = var28;
      }

      label93: {
         try {
            if (var3 < 0L) {
               return var8;
            }

            var30 = var9;
            if (var7 != null) {
               break label93;
            }

            if (var9 == null) {
               return var8;
            }
         } catch (IOException var20) {
            throw x44.a<"r">(var20, 1793965730243755281L, var3);
         }

         try {
            var30 = var9;
         } catch (IOException var19) {
            boolean var34 = false;
            return var8;
         }
      }

      try {
         x44.a<"j">(var30, 48905492165678822L, var3);
      } catch (IOException var18) {
         boolean var35 = false;
      }

      return var8;
   }

   private static boolean M(Object[] var0) {
      long var2 = (Long)var0[0];
      String var4 = (String)var0[1];
      Set var1 = (Set)var0[2];
      var2 = a ^ var2;
      String var5 = x44.a<"w">(-4391412612928906742L, var2);

      try {
         boolean var10000 = x44.a<"n">(-4312525736048064093L, var2);
         if (var5 != null) {
            return var10000;
         }

         if (var10000) {
            return var1.add(var4);
         }
      } catch (g3 var6) {
         throw x44.a<"w">(var6, -2846177159323714188L, var2);
      }

      var4 = x44.a<"o">(var4, -2869260299877767787L, var2);
      return var1.add(var4);
   }

   public static List X(Object[] var0) {
      String var3 = (String)var0[0];
      Set var4 = (Set)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 76342698339164L;
      return x44.a<"r">(new Object[]{var3, var4, var5, null, null}, -9138288405848225641L, var1);
   }

   public Object[] l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(x44.a<"n">(this, 7092918622583462006L, var2), 8822673919663241603L, var2);
   }

   private static void k(Object[] var0) {
      ZipFile var5 = (ZipFile)var0[0];
      long var2 = (Long)var0[1];
      List var1 = (List)var0[2];
      Set var4 = (Set)var0[3];
      Set var7 = (Set)var0[4];
      _zk var6 = (_zk)var0[5];
      var2 = a ^ var2;
      long var8 = var2 ^ 24651986504570L;
      long var10 = var2 ^ 36024172575216L;
      long var12 = var2 ^ 45522091003215L;
      long var14 = var2 ^ 43651875032213L;
      long var16 = var2 ^ 45863967736078L;
      String var10000 = x44.a<"u">(6590072023768056432L, var2);
      Enumeration var19 = x44.a<"m">(var5, 6911256203506414910L, var2);
      String var18 = var10000;

      while (var19.hasMoreElements()) {
         ZipEntry var20 = (ZipEntry)var19.nextElement();
         String var21 = x44.a<"u">(var16, var5, var20, 4804785593663092589L, var2);

         label136: {
            label127: {
               try {
                  var37 = var20.isDirectory();
                  if (var18 != null) {
                     break label127;
                  }

                  if (var37) {
                     break label136;
                  }
               } catch (IOException var33) {
                  throw x44.a<"u">(var33, 4682171438720967950L, var2);
               }

               var37 = false;
            }

            boolean var22 = var37;

            try {
               var22 = x44.a<"u">(var5, var8, var20, 4841136618101098087L, var2);
            } catch (IOException var26) {
               var4.add(var21);
            }

            label119:
            if (var22) {
               File var23 = null;
               boolean var24 = false;

               label116: {
                  try {
                     label138: {
                        var23 = x44.a<"u">(new Object[]{var5, var12, var20}, 4972400530022265035L, var2);

                        String var10001;
                        label100: {
                           label99: {
                              try {
                                 var40 = var7;
                                 var10001 = var18;
                                 if (var2 <= 0L) {
                                    break label100;
                                 }

                                 if (var18 != null) {
                                    break label99;
                                 }

                                 if (var7 == null) {
                                    break label138;
                                 }
                              } catch (IOException var30) {
                                 throw x44.a<"u">(var30, 4682171438720967950L, var2);
                              }

                              var40 = var7;
                           }

                           var10001 = x44.a<"m">(var23, 4957418948018244815L, var2);
                        }

                        var40.add(var10001);
                     }
                  } catch (IOException var32) {
                     IOException var25 = var32;
                     var38 = true;
                     if (var2 < 0L || var18 != null) {
                        break label116;
                     }

                     var24 = true;

                     try {
                        label112: {
                           _zk var39 = var6;
                           if (var2 >= 0L) {
                              if (var6 == null) {
                                 break label112;
                              }

                              var39 = var6;
                           }

                           x44.a<"m">(
                              var39,
                              new Object[]{
                                 a<"e">(12222, 7665940921386856587L ^ var2),
                                 var10,
                                 a<"e">(14196, 7429791931687299142L ^ var2)
                                    + x44.a<"l">(4912543385796709424L, var2)
                                    + a<"e">(14265, 2620433241908308121L ^ var2)
                                    + var21
                                    + a<"e">(15564, 7445710747034084321L ^ var2)
                                    + var25
                                    + a<"e">(21319, 4922979455349820534L ^ var2)
                              },
                              6689355109760868132L,
                              var2
                           );
                        }
                     } catch (IOException var31) {
                        throw x44.a<"u">(var31, 4682171438720967950L, var2);
                     }
                  }

                  var38 = var24;
               }

               try {
                  if (var38 || var23 == null) {
                     break label119;
                  }
               } catch (IOException var29) {
                  throw x44.a<"u">(var29, 4682171438720967950L, var2);
               }

               try {
                  _ux var36 = new _ux(var23);
                  var1.add(var36);
                  x44.a<"u">(new Object[]{var36, var14, var1, var4, var7, var6}, 6854219691670177056L, var2);
               } catch (IOException var28) {
                  label141: {
                     var24 = true;

                     String var42;
                     label80: {
                        label79: {
                           try {
                              var41 = var6;
                              var42 = var18;
                              if (var2 < 0L) {
                                 break label80;
                              }

                              if (var18 != null) {
                                 break label79;
                              }

                              if (var6 == null) {
                                 break label141;
                              }
                           } catch (IOException var27) {
                              throw x44.a<"u">(var27, 4682171438720967950L, var2);
                           }

                           var41 = var6;
                        }

                        var42 = a<"e">(9780, 2365349521695340810L ^ var2);
                     }

                     x44.a<"m">(
                        var41,
                        new Object[]{
                           var42,
                           var10,
                           a<"e">(19644, 923964375222850456L ^ var2)
                              + x44.a<"m">(var23, 4957418948018244815L, var2)
                              + a<"e">(12730, 807268373840653977L ^ var2)
                              + x44.a<"l">(4912543385796709424L, var2)
                              + a<"e">(31272, 8854496779586053390L ^ var2)
                              + var21
                              + a<"e">(29103, 768331106588536462L ^ var2)
                              + var28
                        },
                        6689355109760868132L,
                        var2
                     );
                  }
               }
            }
         }

         if (var18 != null) {
            break;
         }
      }
   }

   public static List G(Object[] var0) {
      String var6 = (String)var0[0];
      Set var3 = (Set)var0[1];
      long var4 = (Long)var0[2];
      File var2 = (File)var0[3];
      _zk var1 = (_zk)var0[4];
      var4 = a ^ var4;
      long var7 = var4 ^ 61100306668808L;
      return x44.a<"s">(new Object[]{var6, var3, null, var7, var2, var1}, -4650992957241472024L, var4);
   }

   private static void r(Object[] param0) {
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
      // 004: checkcast java/util/zip/ZipFile
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/List
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 1
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/String
      // 01d: astore 3
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast java/lang/Long
      // 024: invokevirtual java/lang/Long.longValue ()J
      // 027: lstore 4
      // 029: pop
      // 02a: getstatic com/zelix/rl.a J
      // 02d: lload 4
      // 02f: lxor
      // 030: lstore 4
      // 032: lload 4
      // 034: dup2
      // 035: ldc2_w 137588950795411
      // 038: lxor
      // 039: lstore 7
      // 03b: dup2
      // 03c: ldc2_w 79431948475149
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 111885490727661
      // 046: lxor
      // 047: lstore 11
      // 049: pop2
      // 04a: ldc2_w 8190027237802928300
      // 04d: lload 4
      // 04f: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: astore 13
      // 056: aload 3
      // 057: ifnull 1bc
      // 05a: new java/util/StringTokenizer
      // 05d: dup
      // 05e: aload 3
      // 05f: ldc " "
      // 061: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 064: astore 14
      // 066: new java/io/File
      // 069: dup
      // 06a: aload 2
      // 06b: ldc2_w 7853275491455268724
      // 06e: lload 4
      // 070: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 078: astore 15
      // 07a: aload 15
      // 07c: ldc2_w 8014679905724387268
      // 07f: lload 4
      // 081: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: astore 16
      // 088: aload 14
      // 08a: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 08d: ifeq 1bc
      // 090: aload 14
      // 092: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 095: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 098: astore 17
      // 09a: aload 17
      // 09c: lload 7
      // 09e: bipush 2
      // 09f: anewarray 388
      // 0a2: dup_x2
      // 0a3: dup_x2
      // 0a4: pop
      // 0a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 7807347591179265513
      // 0b3: lload 4
      // 0b5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: astore 18
      // 0bc: aload 18
      // 0be: aload 16
      // 0c0: lload 9
      // 0c2: bipush 3
      // 0c3: anewarray 388
      // 0c6: dup_x2
      // 0c7: dup_x2
      // 0c8: pop
      // 0c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cc: bipush 2
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: bipush 1
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: bipush 0
      // 0d7: swap
      // 0d8: aastore
      // 0d9: ldc2_w 8150617946875636492
      // 0dc: lload 4
      // 0de: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: astore 18
      // 0e5: aload 18
      // 0e7: lload 11
      // 0e9: bipush 2
      // 0ea: anewarray 388
      // 0ed: dup_x2
      // 0ee: dup_x2
      // 0ef: pop
      // 0f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: ldc2_w 8260659951830833713
      // 0fe: lload 4
      // 100: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: ifeq 121
      // 108: new java/io/File
      // 10b: dup
      // 10c: aload 16
      // 10e: aload 18
      // 110: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 113: astore 19
      // 115: lload 4
      // 117: lconst_0
      // 118: lcmp
      // 119: iflt 12c
      // 11c: aload 13
      // 11e: ifnull 12c
      // 121: new java/io/File
      // 124: dup
      // 125: aload 18
      // 127: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 12a: astore 19
      // 12c: aload 19
      // 12e: ldc2_w 8609562223698256263
      // 131: lload 4
      // 133: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: aload 13
      // 13a: ifnonnull 1b6
      // 13d: ifeq 17c
      // 140: goto 14e
      // 143: ldc2_w 7648831715692662738
      // 146: lload 4
      // 148: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 6
      // 150: aload 19
      // 152: ldc2_w 7930904583004497427
      // 155: lload 4
      // 157: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 161: pop
      // 162: aload 13
      // 164: lload 4
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 1b9
      // 16b: ifnull 1b7
      // 16e: goto 17c
      // 171: ldc2_w 7648831715692662738
      // 174: lload 4
      // 176: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: aload 1
      // 17d: new java/lang/StringBuilder
      // 180: dup
      // 181: invokespecial java/lang/StringBuilder.<init> ()V
      // 184: aload 19
      // 186: ldc2_w 7930904583004497427
      // 189: lload 4
      // 18b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 193: ldc2_w 8205732891363092055
      // 196: lload 4
      // 198: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a3: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1a8: goto 1b6
      // 1ab: ldc2_w 7648831715692662738
      // 1ae: lload 4
      // 1b0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: pop
      // 1b7: aload 13
      // 1b9: ifnull 088
      // 1bc: return
   }

   public static List s(Object[] param0) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Set
      // 017: astore 7
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/io/File
      // 029: astore 1
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/_zk
      // 030: astore 4
      // 032: pop
      // 033: getstatic com/zelix/rl.a J
      // 036: lload 2
      // 037: lxor
      // 038: lstore 2
      // 039: lload 2
      // 03a: dup2
      // 03b: ldc2_w 197775196324
      // 03e: lxor
      // 03f: lstore 8
      // 041: dup2
      // 042: ldc2_w 59861650394277
      // 045: lxor
      // 046: lstore 10
      // 048: dup2
      // 049: ldc2_w 58492384255802
      // 04c: lxor
      // 04d: lstore 12
      // 04f: dup2
      // 050: ldc2_w 126496316141109
      // 053: lxor
      // 054: lstore 14
      // 056: dup2
      // 057: ldc2_w 84460050594503
      // 05a: lxor
      // 05b: lstore 16
      // 05d: dup2
      // 05e: ldc2_w 103086364257111
      // 061: lxor
      // 062: lstore 18
      // 064: dup2
      // 065: ldc2_w 47595899708030
      // 068: lxor
      // 069: lstore 20
      // 06b: dup2
      // 06c: ldc2_w 27276233518810
      // 06f: lxor
      // 070: lstore 22
      // 072: dup2
      // 073: ldc2_w 52926633798971
      // 076: lxor
      // 077: lstore 24
      // 079: dup2
      // 07a: ldc2_w 28175059745284
      // 07d: lxor
      // 07e: lstore 26
      // 080: dup2
      // 081: ldc2_w 72374109067896
      // 084: lxor
      // 085: lstore 28
      // 087: pop2
      // 088: ldc2_w -747686127432897381
      // 08b: lload 2
      // 08c: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: astore 30
      // 093: aload 1
      // 094: aload 30
      // 096: ifnonnull 0b2
      // 099: ifnonnull 0b3
      // 09c: goto 0a9
      // 09f: ldc2_w -1292138473871782939
      // 0a2: lload 2
      // 0a3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: ldc2_w -960591562547553378
      // 0ac: lload 2
      // 0ad: invokedynamic o (JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: astore 1
      // 0b3: new java/util/Vector
      // 0b6: dup
      // 0b7: invokespecial java/util/Vector.<init> ()V
      // 0ba: astore 31
      // 0bc: new java/util/StringTokenizer
      // 0bf: dup
      // 0c0: aload 5
      // 0c2: ldc2_w -1233159442899778820
      // 0c5: lload 2
      // 0c6: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0ce: astore 32
      // 0d0: aload 32
      // 0d2: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0d5: ifeq 258
      // 0d8: aload 32
      // 0da: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0dd: astore 33
      // 0df: aload 33
      // 0e1: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0e4: invokevirtual java/lang/String.length ()I
      // 0e7: aload 30
      // 0e9: ifnonnull 252
      // 0ec: ifle 23c
      // 0ef: goto 0fc
      // 0f2: ldc2_w -1292138473871782939
      // 0f5: lload 2
      // 0f6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 33
      // 0fe: lload 8
      // 100: bipush 2
      // 101: anewarray 388
      // 104: dup_x2
      // 105: dup_x2
      // 106: pop
      // 107: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10a: bipush 1
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x1
      // 10e: swap
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: ldc2_w -1698358127534644770
      // 115: lload 2
      // 116: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: astore 34
      // 11d: aload 34
      // 11f: aload 1
      // 120: lload 12
      // 122: bipush 3
      // 123: anewarray 388
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 2
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 1
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 0
      // 137: swap
      // 138: aastore
      // 139: ldc2_w -780333459441078469
      // 13c: lload 2
      // 13d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: astore 34
      // 144: lload 16
      // 146: aload 34
      // 148: bipush 2
      // 149: anewarray 388
      // 14c: dup_x1
      // 14d: swap
      // 14e: bipush 1
      // 14f: swap
      // 150: aastore
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 0
      // 158: swap
      // 159: aastore
      // 15a: ldc2_w -1312363747567011673
      // 15d: lload 2
      // 15e: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: aload 30
      // 165: ifnonnull 230
      // 168: ifeq 21a
      // 16b: goto 178
      // 16e: ldc2_w -1292138473871782939
      // 171: lload 2
      // 172: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: new com/zelix/pg
      // 17b: dup
      // 17c: lload 24
      // 17e: invokespecial com/zelix/pg.<init> (J)V
      // 181: astore 35
      // 183: aload 34
      // 185: aload 1
      // 186: lload 28
      // 188: aload 35
      // 18a: bipush 1
      // 18b: bipush 5
      // 18c: anewarray 388
      // 18f: dup_x1
      // 190: swap
      // 191: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 194: bipush 4
      // 195: swap
      // 196: aastore
      // 197: dup_x1
      // 198: swap
      // 199: bipush 3
      // 19a: swap
      // 19b: aastore
      // 19c: dup_x2
      // 19d: dup_x2
      // 19e: pop
      // 19f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a2: bipush 2
      // 1a3: swap
      // 1a4: aastore
      // 1a5: dup_x1
      // 1a6: swap
      // 1a7: bipush 1
      // 1a8: swap
      // 1a9: aastore
      // 1aa: dup_x1
      // 1ab: swap
      // 1ac: bipush 0
      // 1ad: swap
      // 1ae: aastore
      // 1af: ldc2_w -592831779098498548
      // 1b2: lload 2
      // 1b3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: astore 36
      // 1ba: aload 35
      // 1bc: lload 10
      // 1be: invokevirtual com/zelix/pg.n (J)Z
      // 1c1: aload 30
      // 1c3: ifnonnull 20e
      // 1c6: ifeq 1f8
      // 1c9: goto 1d6
      // 1cc: ldc2_w -1292138473871782939
      // 1cf: lload 2
      // 1d0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: aload 31
      // 1d8: aload 36
      // 1da: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 1df: pop
      // 1e0: aload 30
      // 1e2: lload 2
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: iflt 211
      // 1e8: ifnull 20f
      // 1eb: goto 1f8
      // 1ee: ldc2_w -1292138473871782939
      // 1f1: lload 2
      // 1f2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: aload 6
      // 1fa: aload 34
      // 1fc: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 201: goto 20e
      // 204: ldc2_w -1292138473871782939
      // 207: lload 2
      // 208: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: pop
      // 20f: aload 30
      // 211: lload 2
      // 212: lconst_0
      // 213: lcmp
      // 214: iflt 233
      // 217: ifnull 231
      // 21a: aload 31
      // 21c: aload 34
      // 21e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 223: goto 230
      // 226: ldc2_w -1292138473871782939
      // 229: lload 2
      // 22a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: pop
      // 231: aload 30
      // 233: lload 2
      // 234: lconst_0
      // 235: lcmp
      // 236: ifle 255
      // 239: ifnull 253
      // 23c: aload 6
      // 23e: aload 33
      // 240: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 245: goto 252
      // 248: ldc2_w -1292138473871782939
      // 24b: lload 2
      // 24c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: athrow
      // 252: pop
      // 253: aload 30
      // 255: ifnull 0d0
      // 258: new java/util/ArrayList
      // 25b: dup
      // 25c: aload 31
      // 25e: invokeinterface java/util/List.size ()I 1
      // 263: invokespecial java/util/ArrayList.<init> (I)V
      // 266: astore 33
      // 268: lload 18
      // 26a: bipush 1
      // 26b: anewarray 388
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 0
      // 275: swap
      // 276: aastore
      // 277: ldc2_w -1489706314105134433
      // 27a: lload 2
      // 27b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: astore 34
      // 282: bipush 0
      // 283: istore 35
      // 285: iload 35
      // 287: aload 31
      // 289: invokeinterface java/util/List.size ()I 1
      // 28e: if_icmpge 4b2
      // 291: aload 31
      // 293: iload 35
      // 295: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 29a: checkcast java/lang/String
      // 29d: astore 36
      // 29f: aload 30
      // 2a1: lload 2
      // 2a2: lconst_0
      // 2a3: lcmp
      // 2a4: iflt 4af
      // 2a7: ifnonnull 4ad
      // 2aa: lload 26
      // 2ac: aload 36
      // 2ae: aload 34
      // 2b0: bipush 3
      // 2b1: anewarray 388
      // 2b4: dup_x1
      // 2b5: swap
      // 2b6: bipush 2
      // 2b7: swap
      // 2b8: aastore
      // 2b9: dup_x1
      // 2ba: swap
      // 2bb: bipush 1
      // 2bc: swap
      // 2bd: aastore
      // 2be: dup_x2
      // 2bf: dup_x2
      // 2c0: pop
      // 2c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c4: bipush 0
      // 2c5: swap
      // 2c6: aastore
      // 2c7: ldc2_w -689403037981134977
      // 2ca: lload 2
      // 2cb: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: ifeq 4aa
      // 2d3: goto 2e0
      // 2d6: ldc2_w -1292138473871782939
      // 2d9: lload 2
      // 2da: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: athrow
      // 2e0: aload 36
      // 2e2: lload 22
      // 2e4: bipush 2
      // 2e5: anewarray 388
      // 2e8: dup_x2
      // 2e9: dup_x2
      // 2ea: pop
      // 2eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ee: bipush 1
      // 2ef: swap
      // 2f0: aastore
      // 2f1: dup_x1
      // 2f2: swap
      // 2f3: bipush 0
      // 2f4: swap
      // 2f5: aastore
      // 2f6: ldc2_w -678707115401437690
      // 2f9: lload 2
      // 2fa: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: ifeq 326
      // 302: goto 30f
      // 305: ldc2_w -1292138473871782939
      // 308: lload 2
      // 309: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30e: athrow
      // 30f: new java/io/File
      // 312: dup
      // 313: aload 1
      // 314: aload 36
      // 316: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 319: astore 37
      // 31b: lload 2
      // 31c: lconst_0
      // 31d: lcmp
      // 31e: iflt 331
      // 321: aload 30
      // 323: ifnull 331
      // 326: new java/io/File
      // 329: dup
      // 32a: aload 36
      // 32c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 32f: astore 37
      // 331: aload 37
      // 333: ldc2_w -915301412459272784
      // 336: lload 2
      // 337: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33c: aload 30
      // 33e: ifnonnull 4a9
      // 341: ifeq 48a
      // 344: goto 351
      // 347: ldc2_w -1292138473871782939
      // 34a: lload 2
      // 34b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: athrow
      // 351: lload 2
      // 352: lconst_0
      // 353: lcmp
      // 354: ifle 39b
      // 357: aload 37
      // 359: ldc2_w -937482334383410916
      // 35c: lload 2
      // 35d: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: aload 30
      // 364: ifnonnull 39a
      // 367: goto 374
      // 36a: ldc2_w -1292138473871782939
      // 36d: lload 2
      // 36e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: athrow
      // 374: ifeq 3a0
      // 377: goto 384
      // 37a: ldc2_w -1292138473871782939
      // 37d: lload 2
      // 37e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: athrow
      // 384: aload 33
      // 386: aload 37
      // 388: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 38d: goto 39a
      // 390: ldc2_w -1292138473871782939
      // 393: lload 2
      // 394: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 399: athrow
      // 39a: pop
      // 39b: aload 30
      // 39d: ifnull 4aa
      // 3a0: new com/zelix/_ux
      // 3a3: dup
      // 3a4: aload 37
      // 3a6: invokespecial com/zelix/_ux.<init> (Ljava/io/File;)V
      // 3a9: astore 38
      // 3ab: aload 33
      // 3ad: aload 38
      // 3af: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3b4: lload 2
      // 3b5: lconst_0
      // 3b6: lcmp
      // 3b7: iflt 3c9
      // 3ba: pop
      // 3bb: aload 30
      // 3bd: ifnonnull 44f
      // 3c0: ldc2_w -987265560405875748
      // 3c3: lload 2
      // 3c4: invokedynamic o (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: ifeq 413
      // 3cc: goto 3d9
      // 3cf: ldc2_w -1292138473871782939
      // 3d2: lload 2
      // 3d3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d8: athrow
      // 3d9: aload 38
      // 3db: lload 14
      // 3dd: aload 31
      // 3df: aload 6
      // 3e1: bipush 4
      // 3e2: anewarray 388
      // 3e5: dup_x1
      // 3e6: swap
      // 3e7: bipush 3
      // 3e8: swap
      // 3e9: aastore
      // 3ea: dup_x1
      // 3eb: swap
      // 3ec: bipush 2
      // 3ed: swap
      // 3ee: aastore
      // 3ef: dup_x2
      // 3f0: dup_x2
      // 3f1: pop
      // 3f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f5: bipush 1
      // 3f6: swap
      // 3f7: aastore
      // 3f8: dup_x1
      // 3f9: swap
      // 3fa: bipush 0
      // 3fb: swap
      // 3fc: aastore
      // 3fd: ldc2_w -984109967109302372
      // 400: lload 2
      // 401: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: goto 413
      // 409: ldc2_w -1292138473871782939
      // 40c: lload 2
      // 40d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 412: athrow
      // 413: aload 38
      // 415: lload 20
      // 417: aload 33
      // 419: aload 6
      // 41b: aload 7
      // 41d: aload 4
      // 41f: bipush 6
      // 421: anewarray 388
      // 424: dup_x1
      // 425: swap
      // 426: bipush 5
      // 427: swap
      // 428: aastore
      // 429: dup_x1
      // 42a: swap
      // 42b: bipush 4
      // 42c: swap
      // 42d: aastore
      // 42e: dup_x1
      // 42f: swap
      // 430: bipush 3
      // 431: swap
      // 432: aastore
      // 433: dup_x1
      // 434: swap
      // 435: bipush 2
      // 436: swap
      // 437: aastore
      // 438: dup_x2
      // 439: dup_x2
      // 43a: pop
      // 43b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43e: bipush 1
      // 43f: swap
      // 440: aastore
      // 441: dup_x1
      // 442: swap
      // 443: bipush 0
      // 444: swap
      // 445: aastore
      // 446: ldc2_w -1012157060092154933
      // 449: lload 2
      // 44a: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44f: goto 4aa
      // 452: astore 38
      // 454: aload 6
      // 456: aload 37
      // 458: ldc2_w -1574211762056879580
      // 45b: lload 2
      // 45c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 461: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 466: pop
      // 467: goto 4aa
      // 46a: astore 38
      // 46c: aload 6
      // 46e: aload 37
      // 470: ldc2_w -1574211762056879580
      // 473: lload 2
      // 474: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 479: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 47e: lload 2
      // 47f: lconst_0
      // 480: lcmp
      // 481: ifle 49c
      // 484: pop
      // 485: aload 30
      // 487: ifnull 4aa
      // 48a: aload 6
      // 48c: aload 37
      // 48e: ldc2_w -1574211762056879580
      // 491: lload 2
      // 492: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 497: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 49c: goto 4a9
      // 49f: ldc2_w -1292138473871782939
      // 4a2: lload 2
      // 4a3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a8: athrow
      // 4a9: pop
      // 4aa: iinc 35 1
      // 4ad: aload 30
      // 4af: ifnull 285
      // 4b2: aload 33
      // 4b4: lload 2
      // 4b5: lconst_0
      // 4b6: lcmp
      // 4b7: iflt 29a
      // 4ba: areturn
   }

   private static void n(Object[] var0) {
      ZipFile var1 = (ZipFile)var0[0];
      long var4 = (Long)var0[1];
      List var2 = (List)var0[2];
      Set var3 = (Set)var0[3];
      var4 = a ^ var4;
      long var6 = var4 ^ 104026657213549L;
      long var8 = var4 ^ 15396772424194L;
      long var10 = var4 ^ 36506512518380L;
      ZipEntry var12 = x44.a<"n">(var1, a<"e">(8266, 2780179877656802107L ^ var4), -8172216185705497130L, var4);
      if (var12 != null) {
         wt var13;
         try {
            var13 = new wt(var1, var12, var10);
         } catch (Exception var15) {
            return;
         }

         x44.a<"v">(
            new Object[]{var1, var2, var3, x44.a<"n">(var13, new Object[]{var6, a<"e">(8744, 5118028498727907649L ^ var4)}, -8101144380101467339L, var4), var8},
            -7989656783905369712L,
            var4
         );
         x44.a<"v">(
            new Object[]{var1, var2, var3, x44.a<"n">(var13, new Object[]{var6, a<"e">(4383, 728108755538838127L ^ var4)}, -8101144380101467339L, var4), var8},
            -7989656783905369712L,
            var4
         );
      }
   }

   private rl(String var1, boolean var2, int var3, boolean var4, int var5, _zk var6) {
      long var7 = ((long)var3 << 32 | (long)var5 << 32 >>> 32) ^ a;
      long var9 = var7 ^ 105946706427359L;
      long var11 = var7 ^ 92000363192146L;
      long var13 = var7 ^ 86235034939966L;
      super();
      x44.a<"t">(this, x44.a<"w">(new Object[]{var13}, 8231053651127041014L, var7), 8106379180455703599L, var7);
      x44.a<"t">(this, x44.a<"w">(new Object[]{var9}, 8080529493208700492L, var7), 8271174028852096429L, var7);
      x44.a<"t">(this, var4, 8369339317901298192L, var7);
      x44.a<"i">(this, new Object[]{var1, var6, var11}, 7785586697265496760L, var7);
   }

   private _rv L(Object[] param1) {
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
      // 04: checkcast java/io/File
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/String
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic com/zelix/rl.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 81987190605336
      // 29: lxor
      // 2a: lstore 6
      // 2c: dup2
      // 2d: ldc2_w 60562791460300
      // 30: lxor
      // 31: lstore 8
      // 33: pop2
      // 34: new java/lang/StringBuilder
      // 37: dup
      // 38: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b: aload 2
      // 3c: ldc2_w 3778861014072065138
      // 3f: lload 4
      // 41: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: ldc2_w 3432619717012243304
      // 4c: lload 4
      // 4e: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56: aload 3
      // 57: bipush 1
      // 58: lload 8
      // 5a: bipush 3
      // 5b: anewarray 388
      // 5e: dup_x2
      // 5f: dup_x2
      // 60: pop
      // 61: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 64: bipush 2
      // 65: swap
      // 66: aastore
      // 67: dup_x1
      // 68: swap
      // 69: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6c: bipush 1
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x1
      // 70: swap
      // 71: bipush 0
      // 72: swap
      // 73: aastore
      // 74: ldc2_w 3740731327349652072
      // 77: lload 4
      // 79: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 84: astore 11
      // 86: ldc2_w 3155299036870881997
      // 89: lload 4
      // 8b: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: new java/io/File
      // 93: dup
      // 94: aload 11
      // 96: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 99: astore 12
      // 9b: astore 10
      // 9d: aload 12
      // 9f: ldc2_w 3249983314085182438
      // a2: lload 4
      // a4: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: aload 10
      // ab: ifnonnull d9
      // ae: ifeq f3
      // b1: goto bf
      // b4: ldc2_w 3478773750395835827
      // b7: lload 4
      // b9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: athrow
      // bf: aload 12
      // c1: ldc2_w 3218688781466120010
      // c4: lload 4
      // c6: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: goto d9
      // ce: ldc2_w 3478773750395835827
      // d1: lload 4
      // d3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8: athrow
      // d9: ifne f3
      // dc: new com/zelix/_rv
      // df: dup
      // e0: aload 12
      // e2: lload 6
      // e4: invokespecial com/zelix/_rv.<init> (Ljava/io/File;J)V
      // e7: areturn
      // e8: ldc2_w 3478773750395835827
      // eb: lload 4
      // ed: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f2: athrow
      // f3: aconst_null
      // f4: areturn
   }

   public _rv w(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/rl.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 60756402630332
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 14781575502598
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 78143707395244
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 11303032953307
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: ldc2_w -262628233791543970
      // 03a: lload 3
      // 03b: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 0
      // 041: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 044: invokevirtual java/lang/Class.getProtectionDomain ()Ljava/security/ProtectionDomain;
      // 047: ldc2_w -294973656597808794
      // 04a: lload 3
      // 04b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/security/CodeSource; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: astore 14
      // 052: astore 13
      // 054: aload 14
      // 056: aload 13
      // 058: ifnonnull 06d
      // 05b: ifnull 372
      // 05e: goto 06b
      // 061: ldc2_w -1741700594457656800
      // 064: lload 3
      // 065: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 14
      // 06d: ldc2_w -19148401680852656
      // 070: lload 3
      // 071: invokedynamic k (Ljava/lang/Object;JJ)Ljava/net/URL; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: astore 15
      // 078: aload 15
      // 07a: aload 13
      // 07c: ifnonnull 091
      // 07f: ifnull 372
      // 082: goto 08f
      // 085: ldc2_w -1741700594457656800
      // 088: lload 3
      // 089: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 15
      // 091: ldc2_w -2283037324161112457
      // 094: lload 3
      // 095: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: astore 16
      // 09c: aload 15
      // 09e: ldc2_w -332667502195503509
      // 0a1: lload 3
      // 0a2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: lload 9
      // 0a9: dup2_x1
      // 0aa: pop2
      // 0ab: bipush 2
      // 0ac: anewarray 388
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: bipush 1
      // 0b2: swap
      // 0b3: aastore
      // 0b4: dup_x2
      // 0b5: dup_x2
      // 0b6: pop
      // 0b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ba: bipush 0
      // 0bb: swap
      // 0bc: aastore
      // 0bd: ldc2_w -320613527817170140
      // 0c0: lload 3
      // 0c1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: astore 17
      // 0c8: aload 16
      // 0ca: sipush 394
      // 0cd: ldc2_w 3461260933973539229
      // 0d0: lload 3
      // 0d1: lxor
      // 0d2: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/rl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: ldc2_w -283400952037794784
      // 0da: lload 3
      // 0db: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: aload 13
      // 0e2: lload 3
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 1c6
      // 0e8: ifnonnull 1c4
      // 0eb: ifeq 19f
      // 0ee: goto 0fb
      // 0f1: ldc2_w -1741700594457656800
      // 0f4: lload 3
      // 0f5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: new java/io/File
      // 0fe: dup
      // 0ff: aload 17
      // 101: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 104: astore 18
      // 106: lload 3
      // 107: lconst_0
      // 108: lcmp
      // 109: iflt 194
      // 10c: aload 18
      // 10e: ldc2_w -393668765152072587
      // 111: lload 3
      // 112: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: ifeq 194
      // 11a: aconst_null
      // 11b: astore 19
      // 11d: aload 18
      // 11f: ldc2_w -344456487434880807
      // 122: lload 3
      // 123: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: ifeq 156
      // 12b: aload 0
      // 12c: aload 18
      // 12e: aload 2
      // 12f: lload 7
      // 131: bipush 3
      // 132: anewarray 388
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 2
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 1
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: bipush 0
      // 146: swap
      // 147: aastore
      // 148: ldc2_w -2253269585548794272
      // 14b: lload 3
      // 14c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: astore 19
      // 153: goto 191
      // 156: aconst_null
      // 157: astore 20
      // 159: new com/zelix/_ux
      // 15c: dup
      // 15d: aload 18
      // 15f: invokespecial com/zelix/_ux.<init> (Ljava/io/File;)V
      // 162: astore 20
      // 164: aload 0
      // 165: aload 20
      // 167: lload 11
      // 169: aload 2
      // 16a: bipush 3
      // 16b: anewarray 388
      // 16e: dup_x1
      // 16f: swap
      // 170: bipush 2
      // 171: swap
      // 172: aastore
      // 173: dup_x2
      // 174: dup_x2
      // 175: pop
      // 176: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 179: bipush 1
      // 17a: swap
      // 17b: aastore
      // 17c: dup_x1
      // 17d: swap
      // 17e: bipush 0
      // 17f: swap
      // 180: aastore
      // 181: ldc2_w -50191656297988231
      // 184: lload 3
      // 185: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: astore 19
      // 18c: goto 191
      // 18f: astore 21
      // 191: aload 19
      // 193: areturn
      // 194: aload 13
      // 196: lload 3
      // 197: lconst_0
      // 198: lcmp
      // 199: iflt 1a1
      // 19c: ifnull 372
      // 19f: aload 16
      // 1a1: sipush 4124
      // 1a4: ldc2_w 1073303599155931159
      // 1a7: lload 3
      // 1a8: lxor
      // 1a9: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/rl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: ldc2_w -283400952037794784
      // 1b1: lload 3
      // 1b2: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: goto 1c4
      // 1ba: ldc2_w -1741700594457656800
      // 1bd: lload 3
      // 1be: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: aload 13
      // 1c6: ifnonnull 362
      // 1c9: ifeq 354
      // 1cc: goto 1d9
      // 1cf: ldc2_w -1741700594457656800
      // 1d2: lload 3
      // 1d3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: aload 17
      // 1db: bipush 0
      // 1dc: bipush 5
      // 1dd: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1e0: aload 13
      // 1e2: ifnonnull 230
      // 1e5: goto 1f2
      // 1e8: ldc2_w -1741700594457656800
      // 1eb: lload 3
      // 1ec: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: sipush 12250
      // 1f5: ldc2_w 6147233848102508491
      // 1f8: lload 3
      // 1f9: lxor
      // 1fa: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/rl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: ldc2_w -283400952037794784
      // 202: lload 3
      // 203: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: ifeq 2f5
      // 20b: goto 218
      // 20e: ldc2_w -1741700594457656800
      // 211: lload 3
      // 212: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 17
      // 21a: bipush 5
      // 21b: aload 17
      // 21d: invokevirtual java/lang/String.length ()I
      // 220: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 223: goto 230
      // 226: ldc2_w -1741700594457656800
      // 229: lload 3
      // 22a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: astore 19
      // 232: aload 19
      // 234: sipush 11809
      // 237: ldc2_w 643508959971735202
      // 23a: lload 3
      // 23b: lxor
      // 23c: invokedynamic a (IJ)I bsm=com/zelix/rl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: invokevirtual java/lang/String.indexOf (I)I
      // 244: istore 20
      // 246: iload 20
      // 248: aload 13
      // 24a: ifnonnull 25e
      // 24d: ifle 261
      // 250: goto 25d
      // 253: ldc2_w -1741700594457656800
      // 256: lload 3
      // 257: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: athrow
      // 25d: bipush 1
      // 25e: goto 262
      // 261: bipush 0
      // 262: bipush 1
      // 263: anewarray 7
      // 266: dup
      // 267: bipush 0
      // 268: aload 15
      // 26a: ldc2_w -136841352407717430
      // 26d: lload 3
      // 26e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: aastore
      // 274: lload 5
      // 276: dup2_x2
      // 277: pop2
      // 278: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 27b: iload 20
      // 27d: aload 13
      // 27f: lload 3
      // 280: lconst_0
      // 281: lcmp
      // 282: ifle 28a
      // 285: ifnonnull 2b8
      // 288: aload 19
      // 28a: sipush 11809
      // 28d: ldc2_w 643508959971735202
      // 290: lload 3
      // 291: lxor
      // 292: invokedynamic a (IJ)I bsm=com/zelix/rl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: invokevirtual java/lang/String.lastIndexOf (I)I
      // 29a: if_icmpne 2bb
      // 29d: goto 2aa
      // 2a0: ldc2_w -1741700594457656800
      // 2a3: lload 3
      // 2a4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: athrow
      // 2aa: bipush 1
      // 2ab: goto 2b8
      // 2ae: ldc2_w -1741700594457656800
      // 2b1: lload 3
      // 2b2: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: goto 2bc
      // 2bb: bipush 0
      // 2bc: bipush 1
      // 2bd: anewarray 7
      // 2c0: dup
      // 2c1: bipush 0
      // 2c2: aload 15
      // 2c4: ldc2_w -136841352407717430
      // 2c7: lload 3
      // 2c8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: aastore
      // 2ce: lload 5
      // 2d0: dup2_x2
      // 2d1: pop2
      // 2d2: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 2d5: aload 19
      // 2d7: bipush 0
      // 2d8: iload 20
      // 2da: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2dd: astore 21
      // 2df: new java/io/File
      // 2e2: dup
      // 2e3: aload 21
      // 2e5: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2e8: lload 3
      // 2e9: lconst_0
      // 2ea: lcmp
      // 2eb: ifle 2fe
      // 2ee: astore 18
      // 2f0: aload 13
      // 2f2: ifnull 300
      // 2f5: new java/io/File
      // 2f8: dup
      // 2f9: aload 17
      // 2fb: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2fe: astore 18
      // 300: aload 18
      // 302: ldc2_w -393668765152072587
      // 305: lload 3
      // 306: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: ifeq 34f
      // 30e: aconst_null
      // 30f: astore 19
      // 311: aconst_null
      // 312: astore 20
      // 314: new com/zelix/_ux
      // 317: dup
      // 318: aload 18
      // 31a: invokespecial com/zelix/_ux.<init> (Ljava/io/File;)V
      // 31d: astore 20
      // 31f: aload 0
      // 320: aload 20
      // 322: lload 11
      // 324: aload 2
      // 325: bipush 3
      // 326: anewarray 388
      // 329: dup_x1
      // 32a: swap
      // 32b: bipush 2
      // 32c: swap
      // 32d: aastore
      // 32e: dup_x2
      // 32f: dup_x2
      // 330: pop
      // 331: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 334: bipush 1
      // 335: swap
      // 336: aastore
      // 337: dup_x1
      // 338: swap
      // 339: bipush 0
      // 33a: swap
      // 33b: aastore
      // 33c: ldc2_w -50191656297988231
      // 33f: lload 3
      // 340: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: astore 19
      // 347: goto 34c
      // 34a: astore 21
      // 34c: aload 19
      // 34e: areturn
      // 34f: aload 13
      // 351: ifnull 372
      // 354: bipush 0
      // 355: goto 362
      // 358: ldc2_w -1741700594457656800
      // 35b: lload 3
      // 35c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: bipush 1
      // 363: anewarray 7
      // 366: dup
      // 367: bipush 0
      // 368: aload 16
      // 36a: aastore
      // 36b: lload 5
      // 36d: dup2_x2
      // 36e: pop2
      // 36f: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 372: aconst_null
      // 373: areturn
   }

   public void O(Object[] param1) {
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
      // 00c: getstatic com/zelix/rl.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w -3840512262861040713
      // 015: lload 2
      // 016: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: astore 4
      // 01d: aload 0
      // 01e: ldc2_w -3774206875026148986
      // 021: lload 2
      // 022: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 4
      // 029: ifnonnull 0bf
      // 02c: ifnull 0b0
      // 02f: goto 03c
      // 032: ldc2_w -3369523772964145975
      // 035: lload 2
      // 036: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: athrow
      // 03c: bipush 0
      // 03d: istore 5
      // 03f: iload 5
      // 041: aload 0
      // 042: ldc2_w -3774206875026148986
      // 045: lload 2
      // 046: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: invokeinterface java/util/List.size ()I 1
      // 050: if_icmpge 0b0
      // 053: aload 0
      // 054: ldc2_w -3774206875026148986
      // 057: lload 2
      // 058: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: lload 2
      // 05e: lconst_0
      // 05f: lcmp
      // 060: ifle 06f
      // 063: aload 4
      // 065: ifnonnull 0bf
      // 068: iload 5
      // 06a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 06f: astore 6
      // 071: aload 4
      // 073: lload 2
      // 074: lconst_0
      // 075: lcmp
      // 076: iflt 0ad
      // 079: ifnonnull 0ab
      // 07c: aload 6
      // 07e: instanceof java/util/zip/ZipFile
      // 081: ifeq 0a8
      // 084: goto 091
      // 087: ldc2_w -3369523772964145975
      // 08a: lload 2
      // 08b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: aload 6
      // 093: checkcast java/util/zip/ZipFile
      // 096: astore 7
      // 098: aload 7
      // 09a: ldc2_w -3930016427183825090
      // 09d: lload 2
      // 09e: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: goto 0a8
      // 0a6: astore 8
      // 0a8: iinc 5 1
      // 0ab: aload 4
      // 0ad: ifnull 03f
      // 0b0: aload 0
      // 0b1: ldc2_w -3131019582876693528
      // 0b4: lload 2
      // 0b5: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0bf: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0c4: astore 5
      // 0c6: aload 5
      // 0c8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0cd: ifeq 100
      // 0d0: aload 5
      // 0d2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d7: checkcast java/util/zip/ZipFile
      // 0da: astore 6
      // 0dc: aload 6
      // 0de: ldc2_w -3930016427183825090
      // 0e1: lload 2
      // 0e2: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: aload 4
      // 0e9: ifnonnull 180
      // 0ec: goto 0fb
      // 0ef: ldc2_w -3369523772964145975
      // 0f2: lload 2
      // 0f3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: astore 7
      // 0fb: aload 4
      // 0fd: ifnull 0c6
      // 100: aload 0
      // 101: ldc2_w -3009853322584485270
      // 104: lload 2
      // 105: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: lload 2
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: ifle 0d7
      // 110: aload 4
      // 112: ifnonnull 13c
      // 115: ifnull 180
      // 118: goto 125
      // 11b: ldc2_w -3369523772964145975
      // 11e: lload 2
      // 11f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: aload 0
      // 126: ldc2_w -3009853322584485270
      // 129: lload 2
      // 12a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: goto 13c
      // 132: ldc2_w -3369523772964145975
      // 135: lload 2
      // 136: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 141: astore 5
      // 143: aload 5
      // 145: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14a: ifeq 180
      // 14d: aload 5
      // 14f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 154: checkcast java/lang/String
      // 157: astore 6
      // 159: new java/io/File
      // 15c: dup
      // 15d: aload 6
      // 15f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 162: astore 7
      // 164: aload 7
      // 166: ldc2_w -2999119462498793988
      // 169: lload 2
      // 16a: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: istore 8
      // 171: goto 17b
      // 174: astore 7
      // 176: aload 7
      // 178: athrow
      // 179: astore 7
      // 17b: aload 4
      // 17d: ifnull 143
      // 180: return
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5787;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/rl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/rl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13827;
      if (k[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/rl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("com/zelix/rl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
