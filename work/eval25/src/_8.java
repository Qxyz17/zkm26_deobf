package com.zelix;

import java.io.Reader;
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

public class _8 {
   protected Reader L;
   protected boolean w;
   protected int l;
   public int g;
   int u;
   protected int E;
   protected int j;
   protected char[] C;
   int k;
   protected int[] H;
   protected int[] m;
   protected boolean r;
   protected int R;
   protected int z;
   int K;
   private static final long a = ess.a(-4682556444473495353L, -6155123222219300081L, MethodHandles.lookup().lookupClass()).a(167144329580262L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public int w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -5243761805253047329L, var2)[this.g];
   }

   public _8(Reader var1, int var2, int var3, long var4) {
      var4 = a ^ var4;
      long var6 = (var4 ^ 52168915647675L) >>> 16;
      int var8 = (int)((var4 ^ 52168915647675L) << 48 >>> 48);
      this(var1, var2, var6, var3, a<"u">(11422, 2229300752496441123L ^ var4), (short)var8);
   }

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (this.g >= x44.a<"m">(this, -4228355673518473312L, var2)) {
            return new String(
               x44.a<"m">(this, -2775556014268186855L, var2),
               x44.a<"m">(this, -4228355673518473312L, var2),
               this.g - x44.a<"m">(this, -4228355673518473312L, var2) + 1
            );
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, -2856654913397863301L, var2);
      }

      return new String(
            x44.a<"m">(this, -2775556014268186855L, var2),
            x44.a<"m">(this, -4228355673518473312L, var2),
            x44.a<"m">(this, -4291657590145983424L, var2) - x44.a<"m">(this, -4228355673518473312L, var2)
         )
         + new String(x44.a<"m">(this, -2775556014268186855L, var2), 0, this.g + 1);
   }

   protected void g(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: pop
      // 017: getstatic com/zelix/_8.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: ldc2_w -1117599381889101373
      // 020: lload 2
      // 021: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: aload 0
      // 027: dup
      // 028: ldc2_w -637452922239431522
      // 02b: lload 2
      // 02c: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: bipush 1
      // 032: iadd
      // 033: ldc2_w -637452922239431522
      // 036: lload 2
      // 037: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: astore 5
      // 03e: aload 0
      // 03f: ldc2_w -946008110138673572
      // 042: lload 2
      // 043: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: aload 5
      // 04a: ifnonnull 0b2
      // 04d: ifeq 09b
      // 050: goto 05d
      // 053: ldc2_w -631893509518138597
      // 056: lload 2
      // 057: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 0
      // 05e: bipush 0
      // 05f: ldc2_w -946008110138673572
      // 062: lload 2
      // 063: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 0
      // 069: dup
      // 06a: ldc2_w -803920357614187103
      // 06d: lload 2
      // 06e: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 0
      // 074: bipush 1
      // 075: dup_x1
      // 076: ldc2_w -637452922239431522
      // 079: lload 2
      // 07a: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: iadd
      // 080: ldc2_w -803920357614187103
      // 083: lload 2
      // 084: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: aload 5
      // 08b: ifnull 15a
      // 08e: goto 09b
      // 091: ldc2_w -631893509518138597
      // 094: lload 2
      // 095: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 0
      // 09c: ldc2_w -829266555846933279
      // 09f: lload 2
      // 0a0: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: goto 0b2
      // 0a8: ldc2_w -631893509518138597
      // 0ab: lload 2
      // 0ac: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: ifle 15c
      // 0b8: aload 5
      // 0ba: ifnonnull 15c
      // 0bd: ifeq 15a
      // 0c0: goto 0cd
      // 0c3: ldc2_w -631893509518138597
      // 0c6: lload 2
      // 0c7: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: bipush 0
      // 0cf: aload 5
      // 0d1: ifnonnull 151
      // 0d4: goto 0e1
      // 0d7: ldc2_w -631893509518138597
      // 0da: lload 2
      // 0db: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 2
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: iflt 144
      // 0e7: ldc2_w -829266555846933279
      // 0ea: lload 2
      // 0eb: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: iload 4
      // 0f2: sipush 1101
      // 0f5: ldc2_w 6287888508909262033
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic u (IJ)I bsm=com/zelix/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: if_icmpne 12c
      // 102: goto 10f
      // 105: ldc2_w -631893509518138597
      // 108: lload 2
      // 109: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 0
      // 110: bipush 1
      // 111: ldc2_w -946008110138673572
      // 114: lload 2
      // 115: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: aload 5
      // 11c: ifnull 15a
      // 11f: goto 12c
      // 122: ldc2_w -631893509518138597
      // 125: lload 2
      // 126: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 0
      // 12d: dup
      // 12e: ldc2_w -803920357614187103
      // 131: lload 2
      // 132: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: aload 0
      // 138: bipush 1
      // 139: dup_x1
      // 13a: ldc2_w -637452922239431522
      // 13d: lload 2
      // 13e: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: iadd
      // 144: goto 151
      // 147: ldc2_w -631893509518138597
      // 14a: lload 2
      // 14b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: ldc2_w -803920357614187103
      // 154: lload 2
      // 155: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: iload 4
      // 15c: tableswitch 194 9 13 106 71 194 194 36
      // 180: aload 0
      // 181: bipush 1
      // 182: ldc2_w -829266555846933279
      // 185: lload 2
      // 186: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: aload 5
      // 18d: lload 2
      // 18e: lconst_0
      // 18f: lcmp
      // 190: ifle 241
      // 193: ifnull 21e
      // 196: goto 1a3
      // 199: ldc2_w -631893509518138597
      // 19c: lload 2
      // 19d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: aload 0
      // 1a4: bipush 1
      // 1a5: ldc2_w -946008110138673572
      // 1a8: lload 2
      // 1a9: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: aload 5
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: ifle 241
      // 1b6: ifnull 21e
      // 1b9: goto 1c6
      // 1bc: ldc2_w -631893509518138597
      // 1bf: lload 2
      // 1c0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: dup
      // 1c8: ldc2_w -637452922239431522
      // 1cb: lload 2
      // 1cc: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: bipush 1
      // 1d2: isub
      // 1d3: ldc2_w -637452922239431522
      // 1d6: lload 2
      // 1d7: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: aload 0
      // 1dd: dup
      // 1de: ldc2_w -637452922239431522
      // 1e1: lload 2
      // 1e2: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: aload 0
      // 1e8: ldc2_w -907954004011231192
      // 1eb: lload 2
      // 1ec: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: aload 0
      // 1f2: ldc2_w -637452922239431522
      // 1f5: lload 2
      // 1f6: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: aload 0
      // 1fc: ldc2_w -907954004011231192
      // 1ff: lload 2
      // 200: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: irem
      // 206: isub
      // 207: iadd
      // 208: ldc2_w -637452922239431522
      // 20b: lload 2
      // 20c: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: goto 21e
      // 214: ldc2_w -631893509518138597
      // 217: lload 2
      // 218: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: aload 0
      // 21f: ldc2_w -964604950604755336
      // 222: lload 2
      // 223: invokedynamic m (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: aload 0
      // 229: getfield com/zelix/_8.g I
      // 22c: aload 0
      // 22d: ldc2_w -803920357614187103
      // 230: lload 2
      // 231: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: iastore
      // 237: aload 0
      // 238: ldc2_w -829500571461835989
      // 23b: lload 2
      // 23c: invokedynamic m (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: aload 0
      // 242: getfield com/zelix/_8.g I
      // 245: aload 0
      // 246: ldc2_w -637452922239431522
      // 249: lload 2
      // 24a: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: iastore
      // 250: return
   }

   public char B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 113435545271773L;
      x44.a<"u">(this, -1, 4924270846044733095L, var2);
      char var6 = x44.a<"n">(this, new Object[]{var4}, 6751321833435632285L, var2);
      x44.a<"u">(this, this.g, 4924270846044733095L, var2);
      return var6;
   }

   public void L(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: pop
      // 16: getstatic com/zelix/_8.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 7327950013105783820
      // 1f: lload 3
      // 20: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: dup
      // 27: ldc2_w 7148778917029267750
      // 2a: lload 3
      // 2b: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 2
      // 31: iadd
      // 32: ldc2_w 7148778917029267750
      // 35: lload 3
      // 36: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: astore 5
      // 3d: aload 0
      // 3e: dup
      // 3f: getfield com/zelix/_8.g I
      // 42: iload 2
      // 43: isub
      // 44: aload 5
      // 46: ifnonnull 7a
      // 49: dup_x1
      // 4a: putfield com/zelix/_8.g I
      // 4d: ifge 7d
      // 50: goto 5d
      // 53: ldc2_w 7130454736414406356
      // 56: lload 3
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: dup
      // 5f: getfield com/zelix/_8.g I
      // 62: aload 0
      // 63: ldc2_w 9142185854671644399
      // 66: lload 3
      // 67: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: iadd
      // 6d: goto 7a
      // 70: ldc2_w 7130454736414406356
      // 73: lload 3
      // 74: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: putfield com/zelix/_8.g I
      // 7d: return
   }

   protected void n(Object[] param1) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/_8.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: ldc2_w 1661279567253878448
      // 01f: lload 3
      // 020: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: aload 0
      // 026: ldc2_w 892705414133093459
      // 029: lload 3
      // 02a: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: sipush 15489
      // 032: ldc2_w 8295500940022139759
      // 035: lload 3
      // 036: lxor
      // 037: invokedynamic u (IJ)I bsm=com/zelix/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: iadd
      // 03d: newarray 5
      // 03f: astore 6
      // 041: aload 0
      // 042: ldc2_w 892705414133093459
      // 045: lload 3
      // 046: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: sipush 15489
      // 04e: ldc2_w 8295500940022139759
      // 051: lload 3
      // 052: lxor
      // 053: invokedynamic u (IJ)I bsm=com/zelix/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: iadd
      // 059: newarray 10
      // 05b: astore 7
      // 05d: aload 0
      // 05e: ldc2_w 892705414133093459
      // 061: lload 3
      // 062: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: sipush 15489
      // 06a: ldc2_w 8295500940022139759
      // 06d: lload 3
      // 06e: lxor
      // 06f: invokedynamic u (IJ)I bsm=com/zelix/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: iadd
      // 075: newarray 10
      // 077: astore 8
      // 079: astore 5
      // 07b: aload 5
      // 07d: ifnonnull 2b6
      // 080: iload 2
      // 081: ifeq 1f8
      // 084: goto 091
      // 087: ldc2_w 1173294961329570920
      // 08a: lload 3
      // 08b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: aload 0
      // 092: ldc2_w 1254323356348299018
      // 095: lload 3
      // 096: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: aload 0
      // 09c: ldc2_w 955504304383965107
      // 09f: lload 3
      // 0a0: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: aload 6
      // 0a7: bipush 0
      // 0a8: aload 0
      // 0a9: ldc2_w 892705414133093459
      // 0ac: lload 3
      // 0ad: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: aload 0
      // 0b3: ldc2_w 955504304383965107
      // 0b6: lload 3
      // 0b7: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: isub
      // 0bd: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c0: aload 0
      // 0c1: ldc2_w 1254323356348299018
      // 0c4: lload 3
      // 0c5: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: bipush 0
      // 0cb: aload 6
      // 0cd: aload 0
      // 0ce: ldc2_w 892705414133093459
      // 0d1: lload 3
      // 0d2: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 0
      // 0d8: ldc2_w 955504304383965107
      // 0db: lload 3
      // 0dc: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: isub
      // 0e2: aload 0
      // 0e3: getfield com/zelix/_8.g I
      // 0e6: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e9: aload 0
      // 0ea: aload 6
      // 0ec: ldc2_w 1254323356348299018
      // 0ef: lload 3
      // 0f0: invokedynamic q (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: aload 0
      // 0f6: ldc2_w 1580333929613437195
      // 0f9: lload 3
      // 0fa: invokedynamic n (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: aload 0
      // 100: ldc2_w 955504304383965107
      // 103: lload 3
      // 104: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: aload 7
      // 10b: bipush 0
      // 10c: aload 0
      // 10d: ldc2_w 892705414133093459
      // 110: lload 3
      // 111: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: aload 0
      // 117: ldc2_w 955504304383965107
      // 11a: lload 3
      // 11b: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: isub
      // 121: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 124: aload 0
      // 125: ldc2_w 1580333929613437195
      // 128: lload 3
      // 129: invokedynamic n (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: bipush 0
      // 12f: aload 7
      // 131: aload 0
      // 132: ldc2_w 892705414133093459
      // 135: lload 3
      // 136: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 0
      // 13c: ldc2_w 955504304383965107
      // 13f: lload 3
      // 140: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: isub
      // 146: aload 0
      // 147: getfield com/zelix/_8.g I
      // 14a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 14d: aload 0
      // 14e: aload 7
      // 150: ldc2_w 1580333929613437195
      // 153: lload 3
      // 154: invokedynamic q (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: aload 0
      // 15a: ldc2_w 1373162610581390424
      // 15d: lload 3
      // 15e: invokedynamic n (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: aload 0
      // 164: ldc2_w 955504304383965107
      // 167: lload 3
      // 168: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: aload 8
      // 16f: bipush 0
      // 170: aload 0
      // 171: ldc2_w 892705414133093459
      // 174: lload 3
      // 175: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: aload 0
      // 17b: ldc2_w 955504304383965107
      // 17e: lload 3
      // 17f: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: isub
      // 185: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 188: aload 0
      // 189: ldc2_w 1373162610581390424
      // 18c: lload 3
      // 18d: invokedynamic n (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: bipush 0
      // 193: aload 8
      // 195: aload 0
      // 196: ldc2_w 892705414133093459
      // 199: lload 3
      // 19a: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: aload 0
      // 1a0: ldc2_w 955504304383965107
      // 1a3: lload 3
      // 1a4: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: isub
      // 1aa: aload 0
      // 1ab: getfield com/zelix/_8.g I
      // 1ae: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1b1: aload 0
      // 1b2: aload 8
      // 1b4: ldc2_w 1373162610581390424
      // 1b7: lload 3
      // 1b8: invokedynamic q (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: aload 0
      // 1be: aload 0
      // 1bf: dup
      // 1c0: getfield com/zelix/_8.g I
      // 1c3: aload 0
      // 1c4: ldc2_w 892705414133093459
      // 1c7: lload 3
      // 1c8: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: aload 0
      // 1ce: ldc2_w 955504304383965107
      // 1d1: lload 3
      // 1d2: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: isub
      // 1d8: iadd
      // 1d9: dup_x1
      // 1da: putfield com/zelix/_8.g I
      // 1dd: ldc2_w 802151575812085622
      // 1e0: lload 3
      // 1e1: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: aload 5
      // 1e8: ifnull 2d4
      // 1eb: goto 1f8
      // 1ee: ldc2_w 1173294961329570920
      // 1f1: lload 3
      // 1f2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: ldc2_w 1254323356348299018
      // 1fc: lload 3
      // 1fd: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: aload 0
      // 203: ldc2_w 955504304383965107
      // 206: lload 3
      // 207: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: aload 6
      // 20e: bipush 0
      // 20f: aload 0
      // 210: ldc2_w 892705414133093459
      // 213: lload 3
      // 214: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: aload 0
      // 21a: ldc2_w 955504304383965107
      // 21d: lload 3
      // 21e: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: isub
      // 224: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 227: aload 0
      // 228: aload 6
      // 22a: ldc2_w 1254323356348299018
      // 22d: lload 3
      // 22e: invokedynamic q (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: aload 0
      // 234: ldc2_w 1580333929613437195
      // 237: lload 3
      // 238: invokedynamic n (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: aload 0
      // 23e: ldc2_w 955504304383965107
      // 241: lload 3
      // 242: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: aload 7
      // 249: bipush 0
      // 24a: aload 0
      // 24b: ldc2_w 892705414133093459
      // 24e: lload 3
      // 24f: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: aload 0
      // 255: ldc2_w 955504304383965107
      // 258: lload 3
      // 259: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: isub
      // 25f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 262: aload 0
      // 263: aload 7
      // 265: ldc2_w 1580333929613437195
      // 268: lload 3
      // 269: invokedynamic q (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: aload 0
      // 26f: ldc2_w 1373162610581390424
      // 272: lload 3
      // 273: invokedynamic n (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: aload 0
      // 279: ldc2_w 955504304383965107
      // 27c: lload 3
      // 27d: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: aload 8
      // 284: bipush 0
      // 285: aload 0
      // 286: ldc2_w 892705414133093459
      // 289: lload 3
      // 28a: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: aload 0
      // 290: ldc2_w 955504304383965107
      // 293: lload 3
      // 294: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: isub
      // 29a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 29d: aload 0
      // 29e: aload 8
      // 2a0: ldc2_w 1373162610581390424
      // 2a3: lload 3
      // 2a4: invokedynamic q (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: goto 2b6
      // 2ac: ldc2_w 1173294961329570920
      // 2af: lload 3
      // 2b0: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: aload 0
      // 2b7: aload 0
      // 2b8: dup
      // 2b9: getfield com/zelix/_8.g I
      // 2bc: aload 0
      // 2bd: ldc2_w 955504304383965107
      // 2c0: lload 3
      // 2c1: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: isub
      // 2c7: dup_x1
      // 2c8: putfield com/zelix/_8.g I
      // 2cb: ldc2_w 802151575812085622
      // 2ce: lload 3
      // 2cf: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: goto 2ec
      // 2d7: astore 9
      // 2d9: new java/lang/Error
      // 2dc: dup
      // 2dd: aload 9
      // 2df: ldc2_w 1678241674842006619
      // 2e2: lload 3
      // 2e3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 2eb: athrow
      // 2ec: aload 0
      // 2ed: dup
      // 2ee: ldc2_w 892705414133093459
      // 2f1: lload 3
      // 2f2: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: sipush 15489
      // 2fa: ldc2_w 8295500940022139759
      // 2fd: lload 3
      // 2fe: lxor
      // 2ff: invokedynamic u (IJ)I bsm=com/zelix/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: iadd
      // 305: ldc2_w 892705414133093459
      // 308: lload 3
      // 309: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30e: aload 0
      // 30f: aload 0
      // 310: ldc2_w 892705414133093459
      // 313: lload 3
      // 314: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: ldc2_w 1173422820529412964
      // 31c: lload 3
      // 31d: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: aload 0
      // 323: bipush 0
      // 324: ldc2_w 955504304383965107
      // 327: lload 3
      // 328: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: return
   }

   protected void d(Object[] param1) {
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
      // 00c: getstatic com/zelix/_8.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 97668267267944
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 87501139420628
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -8096225458577232358
      // 025: lload 2
      // 026: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 8
      // 02d: aload 0
      // 02e: ldc2_w -7814957315772968996
      // 031: lload 2
      // 032: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 0
      // 038: ldc2_w -8583098966156934194
      // 03b: lload 2
      // 03c: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: aload 8
      // 043: ifnonnull 2eb
      // 046: if_icmpne 2ae
      // 049: goto 056
      // 04c: ldc2_w -8583297198060364606
      // 04f: lload 2
      // 050: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: athrow
      // 056: aload 0
      // 057: ldc2_w -8583098966156934194
      // 05a: lload 2
      // 05b: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: aload 0
      // 061: ldc2_w -7725388626649477895
      // 064: lload 2
      // 065: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 8
      // 06c: lload 2
      // 06d: lconst_0
      // 06e: lcmp
      // 06f: ifle 1d0
      // 072: ifnonnull 1c8
      // 075: goto 082
      // 078: ldc2_w -8583297198060364606
      // 07b: lload 2
      // 07c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: lload 2
      // 083: lconst_0
      // 084: lcmp
      // 085: ifle 1bb
      // 088: if_icmpne 1a7
      // 08b: goto 098
      // 08e: ldc2_w -8583297198060364606
      // 091: lload 2
      // 092: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 0
      // 099: ldc2_w -7644645706960589031
      // 09c: lload 2
      // 09d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: ifle 142
      // 0a8: aload 8
      // 0aa: ifnonnull 142
      // 0ad: goto 0ba
      // 0b0: ldc2_w -8583297198060364606
      // 0b3: lload 2
      // 0b4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: sipush 31231
      // 0bd: ldc2_w 9079419436047308472
      // 0c0: lload 2
      // 0c1: lxor
      // 0c2: invokedynamic u (IJ)I bsm=com/zelix/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: if_icmple 113
      // 0ca: goto 0d7
      // 0cd: ldc2_w -8583297198060364606
      // 0d0: lload 2
      // 0d1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: aload 0
      // 0d9: bipush 0
      // 0da: dup_x1
      // 0db: ldc2_w -7814957315772968996
      // 0de: lload 2
      // 0df: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: putfield com/zelix/_8.g I
      // 0e7: aload 0
      // 0e8: lload 2
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: ifle 2af
      // 0ee: aload 0
      // 0ef: ldc2_w -7644645706960589031
      // 0f2: lload 2
      // 0f3: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: ldc2_w -8583098966156934194
      // 0fb: lload 2
      // 0fc: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: aload 8
      // 103: ifnull 2ae
      // 106: goto 113
      // 109: ldc2_w -8583297198060364606
      // 10c: lload 2
      // 10d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 0
      // 114: lload 2
      // 115: lconst_0
      // 116: lcmp
      // 117: ifle 17b
      // 11a: aload 8
      // 11c: ifnonnull 17b
      // 11f: goto 12c
      // 122: ldc2_w -8583297198060364606
      // 125: lload 2
      // 126: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: ldc2_w -7644645706960589031
      // 12f: lload 2
      // 130: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: goto 142
      // 138: ldc2_w -8583297198060364606
      // 13b: lload 2
      // 13c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: ifge 16d
      // 145: aload 0
      // 146: lload 2
      // 147: lconst_0
      // 148: lcmp
      // 149: iflt 2af
      // 14c: aload 0
      // 14d: bipush 0
      // 14e: dup_x1
      // 14f: ldc2_w -7814957315772968996
      // 152: lload 2
      // 153: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: putfield com/zelix/_8.g I
      // 15b: aload 8
      // 15d: ifnull 2ae
      // 160: goto 16d
      // 163: ldc2_w -8583297198060364606
      // 166: lload 2
      // 167: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: aload 0
      // 16e: goto 17b
      // 171: ldc2_w -8583297198060364606
      // 174: lload 2
      // 175: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: lload 2
      // 17c: lconst_0
      // 17d: lcmp
      // 17e: iflt 2af
      // 181: bipush 0
      // 182: lload 6
      // 184: bipush 2
      // 185: anewarray 390
      // 188: dup_x2
      // 189: dup_x2
      // 18a: pop
      // 18b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18e: bipush 1
      // 18f: swap
      // 190: aastore
      // 191: dup_x1
      // 192: swap
      // 193: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 196: bipush 0
      // 197: swap
      // 198: aastore
      // 199: ldc2_w -8472817937804648888
      // 19c: lload 2
      // 19d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: aload 8
      // 1a4: ifnull 2ae
      // 1a7: aload 0
      // 1a8: ldc2_w -8583098966156934194
      // 1ab: lload 2
      // 1ac: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: aload 0
      // 1b2: ldc2_w -7644645706960589031
      // 1b5: lload 2
      // 1b6: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: goto 1c8
      // 1be: ldc2_w -8583297198060364606
      // 1c1: lload 2
      // 1c2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: lload 2
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: ifle 250
      // 1ce: aload 8
      // 1d0: ifnonnull 250
      // 1d3: if_icmple 20f
      // 1d6: goto 1e3
      // 1d9: ldc2_w -8583297198060364606
      // 1dc: lload 2
      // 1dd: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: aload 0
      // 1e4: lload 2
      // 1e5: lconst_0
      // 1e6: lcmp
      // 1e7: iflt 2af
      // 1ea: aload 0
      // 1eb: ldc2_w -7725388626649477895
      // 1ee: lload 2
      // 1ef: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: ldc2_w -8583098966156934194
      // 1f7: lload 2
      // 1f8: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: aload 8
      // 1ff: ifnull 2ae
      // 202: goto 20f
      // 205: ldc2_w -8583297198060364606
      // 208: lload 2
      // 209: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: aload 0
      // 210: aload 8
      // 212: ifnonnull 29b
      // 215: goto 222
      // 218: ldc2_w -8583297198060364606
      // 21b: lload 2
      // 21c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: ldc2_w -7644645706960589031
      // 225: lload 2
      // 226: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: aload 0
      // 22c: ldc2_w -8583098966156934194
      // 22f: lload 2
      // 230: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: isub
      // 236: sipush 15489
      // 239: ldc2_w 8295607453756675013
      // 23c: lload 2
      // 23d: lxor
      // 23e: invokedynamic u (IJ)I bsm=com/zelix/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: goto 250
      // 246: ldc2_w -8583297198060364606
      // 249: lload 2
      // 24a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: athrow
      // 250: if_icmpge 28d
      // 253: aload 0
      // 254: lload 2
      // 255: lconst_0
      // 256: lcmp
      // 257: ifle 2af
      // 25a: bipush 1
      // 25b: lload 6
      // 25d: bipush 2
      // 25e: anewarray 390
      // 261: dup_x2
      // 262: dup_x2
      // 263: pop
      // 264: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 267: bipush 1
      // 268: swap
      // 269: aastore
      // 26a: dup_x1
      // 26b: swap
      // 26c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 26f: bipush 0
      // 270: swap
      // 271: aastore
      // 272: ldc2_w -8472817937804648888
      // 275: lload 2
      // 276: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: aload 8
      // 27d: ifnull 2ae
      // 280: goto 28d
      // 283: ldc2_w -8583297198060364606
      // 286: lload 2
      // 287: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: athrow
      // 28d: aload 0
      // 28e: goto 29b
      // 291: ldc2_w -8583297198060364606
      // 294: lload 2
      // 295: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: athrow
      // 29b: aload 0
      // 29c: ldc2_w -7644645706960589031
      // 29f: lload 2
      // 2a0: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: ldc2_w -8583098966156934194
      // 2a8: lload 2
      // 2a9: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: aload 0
      // 2af: ldc2_w -7678920258557206735
      // 2b2: lload 2
      // 2b3: invokedynamic l (Ljava/lang/Object;JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: aload 0
      // 2b9: ldc2_w -8520210901069844576
      // 2bc: lload 2
      // 2bd: invokedynamic l (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: aload 0
      // 2c3: ldc2_w -7814957315772968996
      // 2c6: lload 2
      // 2c7: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: aload 0
      // 2cd: ldc2_w -8583098966156934194
      // 2d0: lload 2
      // 2d1: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: aload 0
      // 2d7: ldc2_w -7814957315772968996
      // 2da: lload 2
      // 2db: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: isub
      // 2e1: ldc2_w -8417326672188589922
      // 2e4: lload 2
      // 2e5: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: dup
      // 2eb: istore 9
      // 2ed: bipush -1
      // 2ee: if_icmpne 316
      // 2f1: aload 0
      // 2f2: ldc2_w -7678920258557206735
      // 2f5: lload 2
      // 2f6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: ldc2_w -8242156744919602544
      // 2fe: lload 2
      // 2ff: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: new java/io/IOException
      // 307: dup
      // 308: invokespecial java/io/IOException.<init> ()V
      // 30b: athrow
      // 30c: ldc2_w -8583297198060364606
      // 30f: lload 2
      // 310: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: athrow
      // 316: aload 0
      // 317: dup
      // 318: ldc2_w -7814957315772968996
      // 31b: lload 2
      // 31c: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: iload 9
      // 323: iadd
      // 324: ldc2_w -7814957315772968996
      // 327: lload 2
      // 328: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: return
      // 32e: astore 10
      // 330: aload 0
      // 331: dup
      // 332: getfield com/zelix/_8.g I
      // 335: bipush 1
      // 336: isub
      // 337: lload 2
      // 338: lconst_0
      // 339: lcmp
      // 33a: iflt 394
      // 33d: putfield com/zelix/_8.g I
      // 340: aload 0
      // 341: lload 4
      // 343: bipush 0
      // 344: bipush 2
      // 345: anewarray 390
      // 348: dup_x1
      // 349: swap
      // 34a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34d: bipush 1
      // 34e: swap
      // 34f: aastore
      // 350: dup_x2
      // 351: dup_x2
      // 352: pop
      // 353: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 356: bipush 0
      // 357: swap
      // 358: aastore
      // 359: ldc2_w -7619822683934937404
      // 35c: lload 2
      // 35d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: aload 0
      // 363: aload 8
      // 365: ifnonnull 390
      // 368: ldc2_w -7644645706960589031
      // 36b: lload 2
      // 36c: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: bipush -1
      // 372: if_icmpne 39d
      // 375: goto 382
      // 378: ldc2_w -8583297198060364606
      // 37b: lload 2
      // 37c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 381: athrow
      // 382: aload 0
      // 383: goto 390
      // 386: ldc2_w -8583297198060364606
      // 389: lload 2
      // 38a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: athrow
      // 390: aload 0
      // 391: getfield com/zelix/_8.g I
      // 394: ldc2_w -7644645706960589031
      // 397: lload 2
      // 398: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: aload 10
      // 39f: athrow
   }

   public char U(Object[] param1) {
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
      // 00c: getstatic com/zelix/_8.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 37582369565795
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 55738248713146
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -7009464364649103609
      // 025: lload 2
      // 026: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 8
      // 02d: aload 0
      // 02e: ldc2_w -7476280534851833299
      // 031: lload 2
      // 032: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 8
      // 039: ifnonnull 0c6
      // 03c: ifle 0bb
      // 03f: goto 04c
      // 042: ldc2_w -7350142633608311329
      // 045: lload 2
      // 046: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: aload 0
      // 04d: dup
      // 04e: ldc2_w -7476280534851833299
      // 051: lload 2
      // 052: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: bipush 1
      // 058: isub
      // 059: ldc2_w -7476280534851833299
      // 05c: lload 2
      // 05d: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: aload 0
      // 063: dup
      // 064: getfield com/zelix/_8.g I
      // 067: bipush 1
      // 068: iadd
      // 069: dup_x1
      // 06a: putfield com/zelix/_8.g I
      // 06d: aload 8
      // 06f: ifnonnull 0ba
      // 072: goto 07f
      // 075: ldc2_w -7350142633608311329
      // 078: lload 2
      // 079: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 0
      // 080: ldc2_w -8803152563116171804
      // 083: lload 2
      // 084: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: if_icmpne 0ab
      // 08c: goto 099
      // 08f: ldc2_w -7350142633608311329
      // 092: lload 2
      // 093: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 0
      // 09a: bipush 0
      // 09b: putfield com/zelix/_8.g I
      // 09e: goto 0ab
      // 0a1: ldc2_w -7350142633608311329
      // 0a4: lload 2
      // 0a5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: ldc2_w -7431170519749017923
      // 0af: lload 2
      // 0b0: invokedynamic i (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 0
      // 0b6: getfield com/zelix/_8.g I
      // 0b9: caload
      // 0ba: ireturn
      // 0bb: aload 0
      // 0bc: dup
      // 0bd: getfield com/zelix/_8.g I
      // 0c0: bipush 1
      // 0c1: iadd
      // 0c2: dup_x1
      // 0c3: putfield com/zelix/_8.g I
      // 0c6: aload 8
      // 0c8: ifnonnull 11a
      // 0cb: aload 0
      // 0cc: ldc2_w -9036827652474790207
      // 0cf: lload 2
      // 0d0: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: if_icmplt 10b
      // 0d8: goto 0e5
      // 0db: ldc2_w -7350142633608311329
      // 0de: lload 2
      // 0df: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: lload 4
      // 0e8: bipush 1
      // 0e9: anewarray 390
      // 0ec: dup_x2
      // 0ed: dup_x2
      // 0ee: pop
      // 0ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: ldc2_w -7176413478200897091
      // 0f8: lload 2
      // 0f9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: goto 10b
      // 101: ldc2_w -7350142633608311329
      // 104: lload 2
      // 105: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 0
      // 10c: ldc2_w -7431170519749017923
      // 10f: lload 2
      // 110: invokedynamic i (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: aload 0
      // 116: getfield com/zelix/_8.g I
      // 119: caload
      // 11a: istore 9
      // 11c: aload 0
      // 11d: iload 9
      // 11f: lload 6
      // 121: bipush 2
      // 122: anewarray 390
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 1
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: ldc2_w -7332353021239491131
      // 139: lload 2
      // 13a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: iload 9
      // 141: ireturn
   }

   public char[] W(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/_8.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 8783823839638870104
      // 1f: lload 3
      // 20: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: iload 2
      // 26: newarray 5
      // 28: astore 6
      // 2a: astore 5
      // 2c: aload 0
      // 2d: aload 5
      // 2f: ifnonnull b2
      // 32: getfield com/zelix/_8.g I
      // 35: bipush 1
      // 36: iadd
      // 37: iload 2
      // 38: if_icmplt 79
      // 3b: goto 48
      // 3e: ldc2_w 9124297542527249024
      // 41: lload 3
      // 42: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: ldc2_w 9187384724205459938
      // 4c: lload 3
      // 4d: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: lload 3
      // 53: lconst_0
      // 54: lcmp
      // 55: iflt d1
      // 58: aload 0
      // 59: getfield com/zelix/_8.g I
      // 5c: iload 2
      // 5d: isub
      // 5e: bipush 1
      // 5f: iadd
      // 60: aload 6
      // 62: bipush 0
      // 63: iload 2
      // 64: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 67: aload 5
      // 69: ifnull cf
      // 6c: goto 79
      // 6f: ldc2_w 9124297542527249024
      // 72: lload 3
      // 73: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 0
      // 7a: ldc2_w 9187384724205459938
      // 7d: lload 3
      // 7e: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: aload 0
      // 84: ldc2_w 7101018897888377531
      // 87: lload 3
      // 88: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: iload 2
      // 8e: aload 0
      // 8f: getfield com/zelix/_8.g I
      // 92: isub
      // 93: bipush 1
      // 94: isub
      // 95: isub
      // 96: aload 6
      // 98: bipush 0
      // 99: iload 2
      // 9a: aload 0
      // 9b: getfield com/zelix/_8.g I
      // 9e: isub
      // 9f: bipush 1
      // a0: isub
      // a1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // a4: aload 0
      // a5: goto b2
      // a8: ldc2_w 9124297542527249024
      // ab: lload 3
      // ac: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: ldc2_w 9187384724205459938
      // b5: lload 3
      // b6: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: bipush 0
      // bc: aload 6
      // be: iload 2
      // bf: aload 0
      // c0: getfield com/zelix/_8.g I
      // c3: isub
      // c4: bipush 1
      // c5: isub
      // c6: aload 0
      // c7: getfield com/zelix/_8.g I
      // ca: bipush 1
      // cb: iadd
      // cc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // cf: aload 6
      // d1: areturn
   }

   public _8(Reader var1, int var2, long var3, int var5, int var6, short var7) {
      long var8 = (var3 << 16 | (long)var7 << 48 >>> 48) ^ a;
      super();
      this.g = -1;
      x44.a<"q">(this, 0, -4772566715117599107L, var8);
      x44.a<"q">(this, 1, -4740946135625906366L, var8);
      x44.a<"q">(this, false, -4711052886923833854L, var8);
      x44.a<"q">(this, false, -5171193912731501377L, var8);
      x44.a<"q">(this, 0, -6435220487659635994L, var8);
      x44.a<"q">(this, 0, -4892643845800061430L, var8);
      x44.a<"q">(this, a<"u">(17636, 5911741962781859480L ^ var8), -5078533644143422773L, var8);
      x44.a<"q">(this, var1, -6893658628505622005L, var8);
      x44.a<"q">(this, var2, -4740946135625906366L, var8);
      x44.a<"q">(this, var5 - 1, -4772566715117599107L, var8);
      x44.a<"q">(this, var6, -6776836291443082813L, var8);
      x44.a<"q">(this, var6, -4766914782592125196L, var8);
      x44.a<"q">(this, new char[var6], -4830090920522540390L, var8);
      x44.a<"q">(this, new int[var6], -5152636107880627045L, var8);
      x44.a<"q">(this, new int[var6], -4711286885287532088L, var8);
   }

   public int V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 2874259987456618677L, var2)[this.g];
   }

   public int S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -6626631729371178772L, var2)[x44.a<"i">(this, -4853294073604405676L, var2)];
   }

   public int D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -237999152201421852L, var2)[x44.a<"j">(this, -2090053903128963057L, var2)];
   }

   static {
      long var0 = a ^ 45227717176082L;
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
      String var6 = "±}Æü?r@Væ\u0018·\u0010\u001fóôÉ\u0085üÑM\u009f\u000bmî";
      int var7 = "±}Æü?r@Væ\u0018·\u0010\u001fóôÉ\u0085üÑM\u009f\u000bmî".length();
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
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "{\t¢Ba<¶¶&_H£[¼¤v";
                  var7 = "{\t¢Ba<¶¶&_H£[¼¤v".length();
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

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26941;
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
            throw new RuntimeException("com/zelix/_8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
