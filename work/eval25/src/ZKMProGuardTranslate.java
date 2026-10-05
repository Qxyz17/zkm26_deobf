package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ZKMProGuardTranslate extends ar {
   private static final long a = ess.a(-1983775840448115097L, -6339089492321167333L, MethodHandles.lookup().lookupClass()).a(790095200422L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public String getTranslatedStackTrace(String var1) {
      long var2 = a ^ 90286608596193L;
      long var4 = var2 ^ 50025128530872L;
      return x44.a<"w">(new Object[]{var1, new Properties(), var4}, -836601277299478622L, var2);
   }

   public void close() {
      long var1 = a ^ 76658454261225L;
      long var3 = var1 ^ 10819291739950L;
      x44.a<"w">(new Object[]{var3}, 4482333330341157237L, var1);
   }

   public static void main(String[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 7022463226838764251
      // 003: ldc2_w 5138370320949988109
      // 006: invokestatic java/lang/invoke/MethodHandles.lookup ()Ljava/lang/invoke/MethodHandles$Lookup;
      // 009: invokevirtual java/lang/invoke/MethodHandles$Lookup.lookupClass ()Ljava/lang/Class;
      // 00c: invokestatic com/zelix/ess.a (JJLjava/lang/Object;)Lcom/zelix/b44;
      // 00f: ldc2_w 259060965200918
      // 012: invokeinterface com/zelix/b44.a (J)J 3
      // 017: ldc2_w 74426237554283
      // 01a: lxor
      // 01b: lstore 1
      // 01c: lload 1
      // 01d: dup2
      // 01e: ldc2_w 95475972313472
      // 021: lxor
      // 022: lstore 3
      // 023: dup2
      // 024: ldc2_w 12641483561113
      // 027: lxor
      // 028: lstore 5
      // 02a: dup2
      // 02b: ldc2_w 62878736977003
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 22971837858165
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 14482671646983
      // 03c: lxor
      // 03d: lstore 11
      // 03f: pop2
      // 040: ldc2_w -6407192039546528359
      // 043: lload 1
      // 044: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: astore 13
      // 04b: aload 0
      // 04c: arraylength
      // 04d: aload 13
      // 04f: ifnonnull 090
      // 052: bipush 2
      // 053: if_icmpeq 099
      // 056: goto 063
      // 059: ldc2_w -6414956917182127543
      // 05c: lload 1
      // 05d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: ldc2_w -4892433609662420872
      // 066: lload 1
      // 067: invokedynamic k (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: sipush 7315
      // 06f: ldc2_w 366624889516233404
      // 072: lload 1
      // 073: lxor
      // 074: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: ldc2_w -6422153177602948159
      // 07c: lload 1
      // 07d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: bipush 1
      // 083: goto 090
      // 086: ldc2_w -6414956917182127543
      // 089: lload 1
      // 08a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: ldc2_w -6744070929474173556
      // 093: lload 1
      // 094: invokedynamic r (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: new java/io/File
      // 09c: dup
      // 09d: aload 0
      // 09e: bipush 0
      // 09f: aaload
      // 0a0: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0a3: astore 14
      // 0a5: new java/io/File
      // 0a8: dup
      // 0a9: aload 0
      // 0aa: bipush 1
      // 0ab: aaload
      // 0ac: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0af: astore 15
      // 0b1: aload 13
      // 0b3: ifnonnull 155
      // 0b6: aload 14
      // 0b8: ldc2_w -6381583938577960564
      // 0bb: lload 1
      // 0bc: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: ifeq 0fe
      // 0c4: goto 0d1
      // 0c7: ldc2_w -6414956917182127543
      // 0ca: lload 1
      // 0cb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 14
      // 0d3: ldc2_w -6430760084483857120
      // 0d6: lload 1
      // 0d7: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: aload 13
      // 0de: ifnonnull 184
      // 0e1: goto 0ee
      // 0e4: ldc2_w -6414956917182127543
      // 0e7: lload 1
      // 0e8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: ifeq 15a
      // 0f1: goto 0fe
      // 0f4: ldc2_w -6414956917182127543
      // 0f7: lload 1
      // 0f8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: ldc2_w -4892433609662420872
      // 101: lload 1
      // 102: invokedynamic k (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: new java/lang/StringBuilder
      // 10a: dup
      // 10b: invokespecial java/lang/StringBuilder.<init> ()V
      // 10e: sipush 19388
      // 111: ldc2_w 4191181807401846165
      // 114: lload 1
      // 115: lxor
      // 116: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: aload 14
      // 120: ldc2_w -4748065383031704040
      // 123: lload 1
      // 124: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c: sipush 26118
      // 12f: ldc2_w 4170768065440671789
      // 132: lload 1
      // 133: lxor
      // 134: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13f: ldc2_w -6422153177602948159
      // 142: lload 1
      // 143: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: goto 155
      // 14b: ldc2_w -6414956917182127543
      // 14e: lload 1
      // 14f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 13
      // 157: ifnull 34c
      // 15a: aload 15
      // 15c: aload 13
      // 15e: ifnonnull 1f2
      // 161: goto 16e
      // 164: ldc2_w -6414956917182127543
      // 167: lload 1
      // 168: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: ldc2_w -6430760084483857120
      // 171: lload 1
      // 172: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: goto 184
      // 17a: ldc2_w -6414956917182127543
      // 17d: lload 1
      // 17e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: ifeq 1e3
      // 187: ldc2_w -4892433609662420872
      // 18a: lload 1
      // 18b: invokedynamic k (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: new java/lang/StringBuilder
      // 193: dup
      // 194: invokespecial java/lang/StringBuilder.<init> ()V
      // 197: sipush 8731
      // 19a: ldc2_w 2186786060408663089
      // 19d: lload 1
      // 19e: lxor
      // 19f: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: aload 15
      // 1a9: ldc2_w -4748065383031704040
      // 1ac: lload 1
      // 1ad: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b5: sipush 5675
      // 1b8: ldc2_w 7246303304983451653
      // 1bb: lload 1
      // 1bc: lxor
      // 1bd: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c8: ldc2_w -6422153177602948159
      // 1cb: lload 1
      // 1cc: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: aload 13
      // 1d3: ifnull 34c
      // 1d6: goto 1e3
      // 1d9: ldc2_w -6414956917182127543
      // 1dc: lload 1
      // 1dd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: aload 14
      // 1e5: goto 1f2
      // 1e8: ldc2_w -6414956917182127543
      // 1eb: lload 1
      // 1ec: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: lload 7
      // 1f4: dup2_x1
      // 1f5: pop2
      // 1f6: bipush 2
      // 1f7: anewarray 172
      // 1fa: dup_x1
      // 1fb: swap
      // 1fc: bipush 1
      // 1fd: swap
      // 1fe: aastore
      // 1ff: dup_x2
      // 200: dup_x2
      // 201: pop
      // 202: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 205: bipush 0
      // 206: swap
      // 207: aastore
      // 208: ldc2_w -4889890323274294628
      // 20b: lload 1
      // 20c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: astore 16
      // 213: aload 16
      // 215: new java/util/Properties
      // 218: dup
      // 219: invokespecial java/util/Properties.<init> ()V
      // 21c: lload 9
      // 21e: bipush 3
      // 21f: anewarray 172
      // 222: dup_x2
      // 223: dup_x2
      // 224: pop
      // 225: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 228: bipush 2
      // 229: swap
      // 22a: aastore
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 1
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: bipush 0
      // 233: swap
      // 234: aastore
      // 235: ldc2_w -6435940692939932305
      // 238: lload 1
      // 239: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: astore 17
      // 240: new com/zelix/pg
      // 243: dup
      // 244: lload 11
      // 246: invokespecial com/zelix/pg.<init> (J)V
      // 249: astore 18
      // 24b: aload 17
      // 24d: lload 3
      // 24e: aload 15
      // 250: aload 18
      // 252: bipush 4
      // 253: anewarray 172
      // 256: dup_x1
      // 257: swap
      // 258: bipush 3
      // 259: swap
      // 25a: aastore
      // 25b: dup_x1
      // 25c: swap
      // 25d: bipush 2
      // 25e: swap
      // 25f: aastore
      // 260: dup_x2
      // 261: dup_x2
      // 262: pop
      // 263: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 266: bipush 1
      // 267: swap
      // 268: aastore
      // 269: dup_x1
      // 26a: swap
      // 26b: bipush 0
      // 26c: swap
      // 26d: aastore
      // 26e: ldc2_w -4985588262337019671
      // 271: lload 1
      // 272: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: pop
      // 278: aload 13
      // 27a: ifnonnull 2fe
      // 27d: aload 18
      // 27f: lload 5
      // 281: invokevirtual com/zelix/pg.n (J)Z
      // 284: ifeq 303
      // 287: goto 294
      // 28a: ldc2_w -6414956917182127543
      // 28d: lload 1
      // 28e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: athrow
      // 294: ldc2_w -4892433609662420872
      // 297: lload 1
      // 298: invokedynamic k (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: new java/lang/StringBuilder
      // 2a0: dup
      // 2a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a4: sipush 30446
      // 2a7: ldc2_w 3341327303190935750
      // 2aa: lload 1
      // 2ab: lxor
      // 2ac: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b4: aload 14
      // 2b6: ldc2_w -4748065383031704040
      // 2b9: lload 1
      // 2ba: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c2: sipush 6538
      // 2c5: ldc2_w 9042684033502025639
      // 2c8: lload 1
      // 2c9: lxor
      // 2ca: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d2: aload 15
      // 2d4: ldc2_w -4748065383031704040
      // 2d7: lload 1
      // 2d8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e0: ldc "'"
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e8: ldc2_w -6422153177602948159
      // 2eb: lload 1
      // 2ec: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: goto 2fe
      // 2f4: ldc2_w -6414956917182127543
      // 2f7: lload 1
      // 2f8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: athrow
      // 2fe: aload 13
      // 300: ifnull 34c
      // 303: ldc2_w -4892433609662420872
      // 306: lload 1
      // 307: invokedynamic k (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30c: new java/lang/StringBuilder
      // 30f: dup
      // 310: invokespecial java/lang/StringBuilder.<init> ()V
      // 313: sipush 13982
      // 316: ldc2_w 3526441298393446578
      // 319: lload 1
      // 31a: lxor
      // 31b: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ZKMProGuardTranslate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 323: aload 18
      // 325: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 328: checkcast java/lang/String
      // 32b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32e: ldc "'"
      // 330: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 333: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 336: ldc2_w -6422153177602948159
      // 339: lload 1
      // 33a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: goto 34c
      // 342: ldc2_w -6414956917182127543
      // 345: lload 1
      // 346: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: athrow
      // 34c: return
   }

   static {
      long var0 = a ^ 13464904089947L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "Ò\u000eî\u009fV\u001aÃâÓ=ãW\u0098×¬¯8!ËÒ\u000ewfãnv=gÿ\u008c\u0092>\u001cs?·5\u008cø\u001dU\u0084ZÍð `a\u0002h\u0086Ëk¥âÃ¡ÿW\u008fë\u0082QÅG<3h¾¬mW]HM*'«\u001eÏ\u0013Uûþþ\u0092\u0001äÃ_\u009a¼FÎx.¶²ÎÝ&)ìk©ù\u0090¬¢g| v¼Ó\u0004Ê·Yê\u0089çcøL\u0096þb4u\u009aÑ\u009d5£Eiùï7\u009e¢é-\u0004\u008c\u0010*>iÇ\u000fæ»²\u001as³5Ñ\u0000J& \"c\u00944pðJ\u001aFÞµ>\r\u009c\u008cÃÀ\u0092`\u000bO\u007f]\u0094Ê\u008bÃxÛ\t\u0097V wKv\u0093¹\u0003\u0012¤¿º½\u0095úøñ\u009döð\u0080\u0004\u0092¿õ\u009a\u0014\u0018\t\u0017ÄàÇC";
      int var8 = "Ò\u000eî\u009fV\u001aÃâÓ=ãW\u0098×¬¯8!ËÒ\u000ewfãnv=gÿ\u008c\u0092>\u001cs?·5\u008cø\u001dU\u0084ZÍð `a\u0002h\u0086Ëk¥âÃ¡ÿW\u008fë\u0082QÅG<3h¾¬mW]HM*'«\u001eÏ\u0013Uûþþ\u0092\u0001äÃ_\u009a¼FÎx.¶²ÎÝ&)ìk©ù\u0090¬¢g| v¼Ó\u0004Ê·Yê\u0089çcøL\u0096þb4u\u009aÑ\u009d5£Eiùï7\u009e¢é-\u0004\u008c\u0010*>iÇ\u000fæ»²\u001as³5Ñ\u0000J& \"c\u00944pðJ\u001aFÞµ>\r\u009c\u008cÃÀ\u0092`\u000bO\u007f]\u0094Ê\u008bÃxÛ\t\u0097V wKv\u0093¹\u0003\u0012¤¿º½\u0095úøñ\u009döð\u0080\u0004\u0092¿õ\u009a\u0014\u0018\t\u0017ÄàÇC"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[8];
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

                  var6 = ";å\u000f\u0014\u0085v\u009d\u000bN\u009cn O&ï%æ\u0089êL\"ñäk`'Á+\u0004sØ*f:vÁüêÚÔª\u0082ë\u000e?m*\u008eNr\u009bj¹@]\u00ad\u0005\u0004ÄY9özj\u0089O×vPÉ\ro\u0018z\u001a\u001f9,\u0094Û\u0090RY¨¢\nâøü¶\u001a²µ¿\u0083hüÈYX¶\u0082[¶iÙ't6æ1Ó\u009c\u0003}Õõ¥Àà\u009e\u0002~O\u009d&Ì/(ì\u008c\u0018\u009cîí\u0012\u001d°{\u0097»\u0098¤£ÚWç s<êÒP$.êÛ\u008dÏ ièmh¯UQ>n";
                  var8 = ";å\u000f\u0014\u0085v\u009d\u000bN\u009cn O&ï%æ\u0089êL\"ñäk`'Á+\u0004sØ*f:vÁüêÚÔª\u0082ë\u000e?m*\u008eNr\u009bj¹@]\u00ad\u0005\u0004ÄY9özj\u0089O×vPÉ\ro\u0018z\u001a\u001f9,\u0094Û\u0090RY¨¢\nâøü¶\u001a²µ¿\u0083hüÈYX¶\u0082[¶iÙ't6æ1Ó\u009c\u0003}Õõ¥Àà\u009e\u0002~O\u009d&Ì/(ì\u008c\u0018\u009cîí\u0012\u001d°{\u0097»\u0098¤£ÚWç s<êÒP$.êÛ\u008dÏ ièmh¯UQ>n"
                     .length();
                  var5 = 128;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15696;
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
            throw new RuntimeException("com/zelix/ZKMProGuardTranslate", var10);
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
         throw new RuntimeException("com/zelix/ZKMProGuardTranslate" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
