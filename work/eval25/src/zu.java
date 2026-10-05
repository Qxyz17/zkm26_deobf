package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zu extends jf implements rh, m, ys, ta {
   private String q;
   private _ur M;
   private fo u;
   private Map S;
   private String V;
   private ff f;
   private fk l;
   private ff[] s;
   private List W;
   private _fd R;
   private _uq Y;
   private static final long a = ess.a(-2447610668425324226L, -5980802155897555324L, MethodHandles.lookup().lookupClass()).a(82853235289910L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   void e(Object[] var1) {
      _fd var2 = (_fd)var1[0];
      this.R = var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var3 ^ 4642332491320L;
      long var8 = var3 ^ 0L;
      long var10 = var3 ^ 134528422017690L;
      x44.a<"r">(this, var2, 9060805756155593317L, var3);
      int[] var10000 = x44.a<"q">(9148277501292601163L, var3);
      int var13 = x44.a<"i">(this, new Object[]{var10}, 7145691849331111744L, var3);
      int[] var12 = var10000;
      int var14 = 0;

      label43:
      while (var14 < var13) {
         _za var15 = this.e(var14);

         try {
            x44.a<"i">(var15, new Object[]{var8, this, x44.a<"m">(this, 9060805756155593317L, var3)}, 8818198965911889370L, var3);
            var14++;
         } catch (gj var17) {
            boolean var10001 = false;
            throw x44.a<"q">(var17, 7065329010643757473L, var3);
         }

         while (true) {
            try {
               var10000 = var12;
               if (var3 >= 0L) {
                  if (var12 != null) {
                     return;
                  }

                  var10000 = var12;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var16) {
               boolean var20 = false;
               throw x44.a<"q">(var16, 7065329010643757473L, var3);
            }

            if (var3 >= 0L) {
               break label43;
            }
         }
      }

      x44.a<"o">(this, new Object[]{var6}, 7204948108350469216L, var3);
   }

   void D(Object[] var1) {
      long var3 = (Long)var1[0];
      ff[] var2 = (ff[])var1[1];
      var3 = a ^ var3;
      x44.a<"s">(this, var2, -600813987664604243L, var3);
   }

   private void n(Object[] var1) {
      long var4;
      byte var7;
      long var8;
      label16: {
         long var2 = (Long)var1[0];
         var8 = a ^ var2;
         var4 = var8 ^ 91152202089086L;
         int[] var6 = x44.a<"q">(-2732235949419660373L, var8);
         if (x44.a<"m">(this, -2738168383078989127L, var8) != null) {
            var7 = 3;
            if (var8 <= 0L) {
               return;
            }

            if (var6 == null) {
               break label16;
            }
         }

         var7 = 4;
      }

      Map var10001 = x44.a<"m">(this, -4402396521713202322L, var8);
      Object[] var10005 = new Object[]{null, null, var4};
      var10005[1] = Integer.valueOf(var7);
      var10005[0] = var10001;
      this.Y = x44.a<"q">(var10005, -4348591990035800082L, var8);
   }

   public void C(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"m">(this, -3696905777623932646L, var2).add(var4);
   }

   public final boolean H(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/hz
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/we
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 62758482205207
      // 021: lxor
      // 022: dup2
      // 023: bipush 56
      // 025: lushr
      // 026: l2i
      // 027: istore 6
      // 029: dup2
      // 02a: bipush 8
      // 02c: lshl
      // 02d: bipush 8
      // 02f: lushr
      // 030: lstore 7
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 77673023439919
      // 037: lxor
      // 038: dup2
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 9
      // 03f: dup2
      // 040: bipush 16
      // 042: lshl
      // 043: bipush 32
      // 045: lushr
      // 046: l2i
      // 047: istore 10
      // 049: dup2
      // 04a: bipush 48
      // 04c: lshl
      // 04d: bipush 48
      // 04f: lushr
      // 050: l2i
      // 051: istore 11
      // 053: pop2
      // 054: dup2
      // 055: ldc2_w 78527832303995
      // 058: lxor
      // 059: lstore 12
      // 05b: dup2
      // 05c: ldc2_w 34256808453880
      // 05f: lxor
      // 060: lstore 14
      // 062: dup2
      // 063: ldc2_w 87763374250080
      // 066: lxor
      // 067: lstore 16
      // 069: dup2
      // 06a: ldc2_w 14197363204487
      // 06d: lxor
      // 06e: dup2
      // 06f: bipush 32
      // 071: lushr
      // 072: l2i
      // 073: istore 18
      // 075: dup2
      // 076: bipush 32
      // 078: lshl
      // 079: bipush 48
      // 07b: lushr
      // 07c: l2i
      // 07d: istore 19
      // 07f: dup2
      // 080: bipush 48
      // 082: lshl
      // 083: bipush 48
      // 085: lushr
      // 086: l2i
      // 087: istore 20
      // 089: pop2
      // 08a: dup2
      // 08b: ldc2_w 122714573872157
      // 08e: lxor
      // 08f: lstore 21
      // 091: dup2
      // 092: ldc2_w 113628790317264
      // 095: lxor
      // 096: dup2
      // 097: bipush 48
      // 099: lushr
      // 09a: l2i
      // 09b: istore 23
      // 09d: dup2
      // 09e: bipush 16
      // 0a0: lshl
      // 0a1: bipush 32
      // 0a3: lushr
      // 0a4: l2i
      // 0a5: istore 24
      // 0a7: dup2
      // 0a8: bipush 48
      // 0aa: lshl
      // 0ab: bipush 48
      // 0ad: lushr
      // 0ae: l2i
      // 0af: istore 25
      // 0b1: pop2
      // 0b2: dup2
      // 0b3: ldc2_w 46191388728827
      // 0b6: lxor
      // 0b7: dup2
      // 0b8: bipush 48
      // 0ba: lushr
      // 0bb: l2i
      // 0bc: istore 26
      // 0be: dup2
      // 0bf: bipush 16
      // 0c1: lshl
      // 0c2: bipush 48
      // 0c4: lushr
      // 0c5: l2i
      // 0c6: istore 27
      // 0c8: dup2
      // 0c9: bipush 32
      // 0cb: lshl
      // 0cc: bipush 32
      // 0ce: lushr
      // 0cf: l2i
      // 0d0: istore 28
      // 0d2: pop2
      // 0d3: dup2
      // 0d4: ldc2_w 28026413356652
      // 0d7: lxor
      // 0d8: lstore 29
      // 0da: dup2
      // 0db: ldc2_w 112727093451867
      // 0de: lxor
      // 0df: lstore 31
      // 0e1: dup2
      // 0e2: ldc2_w 71713049020645
      // 0e5: lxor
      // 0e6: lstore 33
      // 0e8: dup2
      // 0e9: ldc2_w 51715359156105
      // 0ec: lxor
      // 0ed: lstore 35
      // 0ef: dup2
      // 0f0: ldc2_w 32769134282969
      // 0f3: lxor
      // 0f4: lstore 37
      // 0f6: dup2
      // 0f7: ldc2_w 55973351184304
      // 0fa: lxor
      // 0fb: lstore 39
      // 0fd: dup2
      // 0fe: ldc2_w 81878266152570
      // 101: lxor
      // 102: lstore 41
      // 104: dup2
      // 105: ldc2_w 139614121792522
      // 108: lxor
      // 109: lstore 43
      // 10b: dup2
      // 10c: ldc2_w 29623147729172
      // 10f: lxor
      // 110: lstore 45
      // 112: dup2
      // 113: ldc2_w 115040998593925
      // 116: lxor
      // 117: lstore 47
      // 119: dup2
      // 11a: ldc2_w 32867648633871
      // 11d: lxor
      // 11e: lstore 49
      // 120: pop2
      // 121: ldc2_w 811819383434717946
      // 124: lload 4
      // 126: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: astore 51
      // 12d: aload 0
      // 12e: ldc2_w 815466887112676328
      // 131: lload 4
      // 133: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/fk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: ifnull 34f
      // 13b: aload 3
      // 13c: lload 21
      // 13e: bipush 1
      // 13f: anewarray 86
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w 1650698572369816501
      // 14e: lload 4
      // 150: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: astore 52
      // 157: aload 52
      // 159: astore 53
      // 15b: aload 53
      // 15d: arraylength
      // 15e: istore 54
      // 160: bipush 0
      // 161: istore 55
      // 163: iload 55
      // 165: iload 54
      // 167: if_icmpge 34a
      // 16a: aload 53
      // 16c: iload 55
      // 16e: aaload
      // 16f: astore 56
      // 171: aload 56
      // 173: invokevirtual com/zelix/iz.D ()I
      // 176: aload 0
      // 177: getfield com/zelix/zu.Y Lcom/zelix/_uq;
      // 17a: iload 23
      // 17c: i2c
      // 17d: swap
      // 17e: iload 24
      // 180: swap
      // 181: iload 25
      // 183: i2s
      // 184: invokestatic com/zelix/za.J (ICILcom/zelix/_uq;S)Z
      // 187: aload 51
      // 189: lload 4
      // 18b: lconst_0
      // 18c: lcmp
      // 18d: ifle 195
      // 190: ifnonnull 724
      // 193: aload 51
      // 195: ifnonnull 219
      // 198: goto 1a6
      // 19b: ldc2_w 1710254921996540944
      // 19e: lload 4
      // 1a0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: ifne 1d1
      // 1a9: goto 1b7
      // 1ac: ldc2_w 1710254921996540944
      // 1af: lload 4
      // 1b1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: aload 51
      // 1b9: lload 4
      // 1bb: lconst_0
      // 1bc: lcmp
      // 1bd: ifle 347
      // 1c0: ifnull 342
      // 1c3: goto 1d1
      // 1c6: ldc2_w 1710254921996540944
      // 1c9: lload 4
      // 1cb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: aload 51
      // 1d4: lload 4
      // 1d6: lconst_0
      // 1d7: lcmp
      // 1d8: ifle 24e
      // 1db: ifnonnull 245
      // 1de: goto 1ec
      // 1e1: ldc2_w 1710254921996540944
      // 1e4: lload 4
      // 1e6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: ldc2_w 815466887112676328
      // 1ef: lload 4
      // 1f1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/fk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: aload 56
      // 1f8: lload 37
      // 1fa: ldc2_w 1021969324104251872
      // 1fd: lload 4
      // 1ff: invokedynamic p (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: lload 16
      // 206: dup2_x1
      // 207: pop2
      // 208: invokevirtual com/zelix/fk.R (JLjava/lang/String;)Z
      // 20b: goto 219
      // 20e: ldc2_w 1710254921996540944
      // 211: lload 4
      // 213: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: ifne 236
      // 21c: aload 51
      // 21e: lload 4
      // 220: lconst_0
      // 221: lcmp
      // 222: ifle 347
      // 225: ifnull 342
      // 228: goto 236
      // 22b: ldc2_w 1710254921996540944
      // 22e: lload 4
      // 230: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: aload 0
      // 237: goto 245
      // 23a: ldc2_w 1710254921996540944
      // 23d: lload 4
      // 23f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: athrow
      // 245: lload 4
      // 247: lconst_0
      // 248: lcmp
      // 249: ifle 2b2
      // 24c: aload 51
      // 24e: ifnonnull 2b2
      // 251: getfield com/zelix/zu.f Lcom/zelix/ff;
      // 254: ifnull 2a3
      // 257: goto 265
      // 25a: ldc2_w 1710254921996540944
      // 25d: lload 4
      // 25f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: aload 56
      // 267: aload 0
      // 268: getfield com/zelix/zu.f Lcom/zelix/ff;
      // 26b: aload 2
      // 26c: lload 35
      // 26e: ldc2_w 1150859067261441266
      // 271: lload 4
      // 273: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: ifne 2a3
      // 27b: goto 289
      // 27e: ldc2_w 1710254921996540944
      // 281: lload 4
      // 283: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: athrow
      // 289: aload 51
      // 28b: lload 4
      // 28d: lconst_0
      // 28e: lcmp
      // 28f: iflt 347
      // 292: ifnull 342
      // 295: goto 2a3
      // 298: ldc2_w 1710254921996540944
      // 29b: lload 4
      // 29d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: athrow
      // 2a3: aload 0
      // 2a4: goto 2b2
      // 2a7: ldc2_w 1710254921996540944
      // 2aa: lload 4
      // 2ac: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: athrow
      // 2b2: ldc2_w 932486471133258280
      // 2b5: lload 4
      // 2b7: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: lload 4
      // 2be: lconst_0
      // 2bf: lcmp
      // 2c0: iflt 2f2
      // 2c3: aload 51
      // 2c5: ifnonnull 2f2
      // 2c8: ifnull 332
      // 2cb: goto 2d9
      // 2ce: ldc2_w 1710254921996540944
      // 2d1: lload 4
      // 2d3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: athrow
      // 2d9: aload 0
      // 2da: ldc2_w 932486471133258280
      // 2dd: lload 4
      // 2df: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: goto 2f2
      // 2e7: ldc2_w 1710254921996540944
      // 2ea: lload 4
      // 2ec: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: athrow
      // 2f2: iload 26
      // 2f4: i2s
      // 2f5: iload 27
      // 2f7: i2c
      // 2f8: iload 28
      // 2fa: aload 56
      // 2fc: invokestatic com/zelix/_u5.E (SCILcom/zelix/i8;)Ljava/lang/String;
      // 2ff: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 302: aload 51
      // 304: ifnonnull 341
      // 307: ifne 332
      // 30a: goto 318
      // 30d: ldc2_w 1710254921996540944
      // 310: lload 4
      // 312: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: athrow
      // 318: aload 51
      // 31a: lload 4
      // 31c: lconst_0
      // 31d: lcmp
      // 31e: iflt 347
      // 321: ifnull 342
      // 324: goto 332
      // 327: ldc2_w 1710254921996540944
      // 32a: lload 4
      // 32c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: bipush 1
      // 333: goto 341
      // 336: ldc2_w 1710254921996540944
      // 339: lload 4
      // 33b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: athrow
      // 341: ireturn
      // 342: iinc 55 1
      // 345: aload 51
      // 347: ifnull 163
      // 34a: aload 51
      // 34c: ifnull 723
      // 34f: aload 3
      // 350: lload 31
      // 352: invokevirtual com/zelix/hz.n (J)[Lcom/zelix/iu;
      // 355: astore 52
      // 357: aload 52
      // 359: astore 53
      // 35b: aload 53
      // 35d: arraylength
      // 35e: istore 54
      // 360: bipush 0
      // 361: istore 55
      // 363: iload 55
      // 365: iload 54
      // 367: if_icmpge 723
      // 36a: aload 53
      // 36c: iload 55
      // 36e: aaload
      // 36f: astore 56
      // 371: aload 56
      // 373: invokevirtual com/zelix/iu.D ()I
      // 376: aload 0
      // 377: getfield com/zelix/zu.Y Lcom/zelix/_uq;
      // 37a: iload 23
      // 37c: i2c
      // 37d: swap
      // 37e: iload 24
      // 380: swap
      // 381: iload 25
      // 383: i2s
      // 384: invokestatic com/zelix/za.J (ICILcom/zelix/_uq;S)Z
      // 387: aload 51
      // 389: lload 4
      // 38b: lconst_0
      // 38c: lcmp
      // 38d: ifle 395
      // 390: ifnonnull 724
      // 393: aload 51
      // 395: lload 4
      // 397: lconst_0
      // 398: lcmp
      // 399: ifle 40d
      // 39c: ifnonnull 404
      // 39f: goto 3ad
      // 3a2: ldc2_w 1710254921996540944
      // 3a5: lload 4
      // 3a7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: athrow
      // 3ad: lload 4
      // 3af: lconst_0
      // 3b0: lcmp
      // 3b1: ifle 3f6
      // 3b4: ifne 3df
      // 3b7: goto 3c5
      // 3ba: ldc2_w 1710254921996540944
      // 3bd: lload 4
      // 3bf: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c4: athrow
      // 3c5: aload 51
      // 3c7: lload 4
      // 3c9: lconst_0
      // 3ca: lcmp
      // 3cb: ifle 720
      // 3ce: ifnull 71b
      // 3d1: goto 3df
      // 3d4: ldc2_w 1710254921996540944
      // 3d7: lload 4
      // 3d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3de: athrow
      // 3df: aload 0
      // 3e0: getfield com/zelix/zu.u Lcom/zelix/fo;
      // 3e3: iload 18
      // 3e5: iload 19
      // 3e7: aload 56
      // 3e9: iload 20
      // 3eb: i2c
      // 3ec: invokestatic com/zelix/_u5.l (IILcom/zelix/iu;C)Ljava/lang/String;
      // 3ef: lload 16
      // 3f1: dup2_x1
      // 3f2: pop2
      // 3f3: invokevirtual com/zelix/fo.R (JLjava/lang/String;)Z
      // 3f6: goto 404
      // 3f9: ldc2_w 1710254921996540944
      // 3fc: lload 4
      // 3fe: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 403: athrow
      // 404: lload 4
      // 406: lconst_0
      // 407: lcmp
      // 408: iflt 465
      // 40b: aload 51
      // 40d: ifnonnull 465
      // 410: ifne 43b
      // 413: goto 421
      // 416: ldc2_w 1710254921996540944
      // 419: lload 4
      // 41b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: athrow
      // 421: aload 51
      // 423: lload 4
      // 425: lconst_0
      // 426: lcmp
      // 427: ifle 720
      // 42a: ifnull 71b
      // 42d: goto 43b
      // 430: ldc2_w 1710254921996540944
      // 433: lload 4
      // 435: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43a: athrow
      // 43b: iload 26
      // 43d: i2s
      // 43e: iload 27
      // 440: i2c
      // 441: iload 28
      // 443: aload 56
      // 445: invokestatic com/zelix/_u5.E (SCILcom/zelix/i8;)Ljava/lang/String;
      // 448: iload 6
      // 44a: i2b
      // 44b: swap
      // 44c: aload 0
      // 44d: getfield com/zelix/zu.R Lcom/zelix/_fd;
      // 450: lload 7
      // 452: dup2_x1
      // 453: pop2
      // 454: invokestatic com/zelix/za.S (BLjava/lang/String;JLcom/zelix/_fd;)Z
      // 457: goto 465
      // 45a: ldc2_w 1710254921996540944
      // 45d: lload 4
      // 45f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 464: athrow
      // 465: ifne 482
      // 468: aload 51
      // 46a: lload 4
      // 46c: lconst_0
      // 46d: lcmp
      // 46e: ifle 720
      // 471: ifnull 71b
      // 474: goto 482
      // 477: ldc2_w 1710254921996540944
      // 47a: lload 4
      // 47c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 481: athrow
      // 482: aload 0
      // 483: getfield com/zelix/zu.f Lcom/zelix/ff;
      // 486: ifnull 4ef
      // 489: goto 497
      // 48c: ldc2_w 1710254921996540944
      // 48f: lload 4
      // 491: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 496: athrow
      // 497: aload 56
      // 499: aload 0
      // 49a: getfield com/zelix/zu.f Lcom/zelix/ff;
      // 49d: lload 43
      // 49f: aload 2
      // 4a0: invokestatic com/zelix/za.z (Lcom/zelix/iu;Lcom/zelix/ff;JLcom/zelix/we;)Z
      // 4a3: lload 4
      // 4a5: lconst_0
      // 4a6: lcmp
      // 4a7: ifle 51b
      // 4aa: aload 51
      // 4ac: ifnonnull 51b
      // 4af: goto 4bd
      // 4b2: ldc2_w 1710254921996540944
      // 4b5: lload 4
      // 4b7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bc: athrow
      // 4bd: lload 4
      // 4bf: lconst_0
      // 4c0: lcmp
      // 4c1: ifle 50d
      // 4c4: ifne 4ef
      // 4c7: goto 4d5
      // 4ca: ldc2_w 1710254921996540944
      // 4cd: lload 4
      // 4cf: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d4: athrow
      // 4d5: aload 51
      // 4d7: lload 4
      // 4d9: lconst_0
      // 4da: lcmp
      // 4db: ifle 720
      // 4de: ifnull 71b
      // 4e1: goto 4ef
      // 4e4: ldc2_w 1710254921996540944
      // 4e7: lload 4
      // 4e9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ee: athrow
      // 4ef: iload 9
      // 4f1: i2c
      // 4f2: iload 10
      // 4f4: aload 56
      // 4f6: aload 0
      // 4f7: ldc2_w 943814125484550429
      // 4fa: lload 4
      // 4fc: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/ff; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: aload 0
      // 502: getfield com/zelix/zu.R Lcom/zelix/_fd;
      // 505: iload 11
      // 507: i2s
      // 508: swap
      // 509: aload 2
      // 50a: invokestatic com/zelix/za.d (CILcom/zelix/iu;[Lcom/zelix/ff;SLcom/zelix/_fd;Lcom/zelix/we;)Z
      // 50d: goto 51b
      // 510: ldc2_w 1710254921996540944
      // 513: lload 4
      // 515: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51a: athrow
      // 51b: ifne 538
      // 51e: aload 51
      // 520: lload 4
      // 522: lconst_0
      // 523: lcmp
      // 524: iflt 720
      // 527: ifnull 71b
      // 52a: goto 538
      // 52d: ldc2_w 1710254921996540944
      // 530: lload 4
      // 532: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 537: athrow
      // 538: new com/zelix/pg
      // 53b: dup
      // 53c: lload 33
      // 53e: invokespecial com/zelix/pg.<init> (J)V
      // 541: astore 57
      // 543: aload 2
      // 544: aload 56
      // 546: aload 0
      // 547: ldc2_w 1335508176393551651
      // 54a: lload 4
      // 54c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 551: lload 47
      // 553: dup2_x1
      // 554: pop2
      // 555: aload 57
      // 557: invokestatic com/zelix/za.h (Lcom/zelix/we;Lcom/zelix/iu;JLjava/util/List;Lcom/zelix/pg;)Z
      // 55a: istore 58
      // 55c: aload 57
      // 55e: lload 12
      // 560: invokevirtual com/zelix/pg.n (J)Z
      // 563: aload 51
      // 565: lload 4
      // 567: lconst_0
      // 568: lcmp
      // 569: iflt 6dd
      // 56c: ifnonnull 6db
      // 56f: ifne 6d9
      // 572: goto 580
      // 575: ldc2_w 1710254921996540944
      // 578: lload 4
      // 57a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57f: athrow
      // 580: aload 57
      // 582: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 585: checkcast java/lang/String
      // 588: astore 59
      // 58a: aload 0
      // 58b: lload 39
      // 58d: bipush 1
      // 58e: anewarray 86
      // 591: dup_x2
      // 592: dup_x2
      // 593: pop
      // 594: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 597: bipush 0
      // 598: swap
      // 599: aastore
      // 59a: ldc2_w 876015182049658594
      // 59d: lload 4
      // 59f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/fw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a4: astore 60
      // 5a6: aload 59
      // 5a8: lload 29
      // 5aa: sipush 17841
      // 5ad: ldc2_w 4588233658077314253
      // 5b0: lload 4
      // 5b2: lxor
      // 5b3: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b8: aload 0
      // 5b9: lload 49
      // 5bb: bipush 1
      // 5bc: anewarray 86
      // 5bf: dup_x2
      // 5c0: dup_x2
      // 5c1: pop
      // 5c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c5: bipush 0
      // 5c6: swap
      // 5c7: aastore
      // 5c8: ldc2_w 947847513080899137
      // 5cb: lload 4
      // 5cd: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d2: bipush 4
      // 5d3: anewarray 86
      // 5d6: dup_x1
      // 5d7: swap
      // 5d8: bipush 3
      // 5d9: swap
      // 5da: aastore
      // 5db: dup_x1
      // 5dc: swap
      // 5dd: bipush 2
      // 5de: swap
      // 5df: aastore
      // 5e0: dup_x2
      // 5e1: dup_x2
      // 5e2: pop
      // 5e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e6: bipush 1
      // 5e7: swap
      // 5e8: aastore
      // 5e9: dup_x1
      // 5ea: swap
      // 5eb: bipush 0
      // 5ec: swap
      // 5ed: aastore
      // 5ee: ldc2_w 987136623326386308
      // 5f1: lload 4
      // 5f3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f8: astore 59
      // 5fa: aload 59
      // 5fc: lload 29
      // 5fe: sipush 11592
      // 601: ldc2_w 4432448957599355962
      // 604: lload 4
      // 606: lxor
      // 607: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60c: aload 60
      // 60e: lload 45
      // 610: bipush 1
      // 611: anewarray 86
      // 614: dup_x2
      // 615: dup_x2
      // 616: pop
      // 617: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61a: bipush 0
      // 61b: swap
      // 61c: aastore
      // 61d: ldc2_w 872416121824673724
      // 620: lload 4
      // 622: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 627: bipush 4
      // 628: anewarray 86
      // 62b: dup_x1
      // 62c: swap
      // 62d: bipush 3
      // 62e: swap
      // 62f: aastore
      // 630: dup_x1
      // 631: swap
      // 632: bipush 2
      // 633: swap
      // 634: aastore
      // 635: dup_x2
      // 636: dup_x2
      // 637: pop
      // 638: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63b: bipush 1
      // 63c: swap
      // 63d: aastore
      // 63e: dup_x1
      // 63f: swap
      // 640: bipush 0
      // 641: swap
      // 642: aastore
      // 643: ldc2_w 987136623326386308
      // 646: lload 4
      // 648: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64d: astore 59
      // 64f: aload 59
      // 651: lload 29
      // 653: sipush 26419
      // 656: ldc2_w 1067940230827105862
      // 659: lload 4
      // 65b: lxor
      // 65c: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 661: aload 60
      // 663: lload 41
      // 665: bipush 1
      // 666: anewarray 86
      // 669: dup_x2
      // 66a: dup_x2
      // 66b: pop
      // 66c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66f: bipush 0
      // 670: swap
      // 671: aastore
      // 672: ldc2_w 1041484078300704926
      // 675: lload 4
      // 677: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67c: ldc2_w 648458794886310507
      // 67f: lload 4
      // 681: invokedynamic p (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 686: bipush 4
      // 687: anewarray 86
      // 68a: dup_x1
      // 68b: swap
      // 68c: bipush 3
      // 68d: swap
      // 68e: aastore
      // 68f: dup_x1
      // 690: swap
      // 691: bipush 2
      // 692: swap
      // 693: aastore
      // 694: dup_x2
      // 695: dup_x2
      // 696: pop
      // 697: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 69a: bipush 1
      // 69b: swap
      // 69c: aastore
      // 69d: dup_x1
      // 69e: swap
      // 69f: bipush 0
      // 6a0: swap
      // 6a1: aastore
      // 6a2: ldc2_w 987136623326386308
      // 6a5: lload 4
      // 6a7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ac: astore 59
      // 6ae: aload 0
      // 6af: ldc2_w 580804181227567060
      // 6b2: lload 4
      // 6b4: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b9: aload 59
      // 6bb: lload 14
      // 6bd: bipush 2
      // 6be: anewarray 86
      // 6c1: dup_x2
      // 6c2: dup_x2
      // 6c3: pop
      // 6c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c7: bipush 1
      // 6c8: swap
      // 6c9: aastore
      // 6ca: dup_x1
      // 6cb: swap
      // 6cc: bipush 0
      // 6cd: swap
      // 6ce: aastore
      // 6cf: ldc2_w 1135294775172706797
      // 6d2: lload 4
      // 6d4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d9: iload 58
      // 6db: aload 51
      // 6dd: ifnonnull 71a
      // 6e0: ifne 70b
      // 6e3: goto 6f1
      // 6e6: ldc2_w 1710254921996540944
      // 6e9: lload 4
      // 6eb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f0: athrow
      // 6f1: aload 51
      // 6f3: lload 4
      // 6f5: lconst_0
      // 6f6: lcmp
      // 6f7: ifle 720
      // 6fa: ifnull 71b
      // 6fd: goto 70b
      // 700: ldc2_w 1710254921996540944
      // 703: lload 4
      // 705: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70a: athrow
      // 70b: bipush 1
      // 70c: goto 71a
      // 70f: ldc2_w 1710254921996540944
      // 712: lload 4
      // 714: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 719: athrow
      // 71a: ireturn
      // 71b: iinc 55 1
      // 71e: aload 51
      // 720: ifnull 363
      // 723: bipush 0
      // 724: ireturn
   }

   public void a(Object[] var1) {
      long var3 = (Long)var1[0];
      ff var2 = (ff)var1[1];
      this.f = var2;
   }

   void T(Object[] param1) {
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
      // 013: getstatic com/zelix/zu.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 128095811488828
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 13327989841398
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 114807449195464
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 101815485139608
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: aload 0
      // 038: lload 5
      // 03a: bipush 1
      // 03b: anewarray 86
      // 03e: dup_x2
      // 03f: dup_x2
      // 040: pop
      // 041: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 044: bipush 0
      // 045: swap
      // 046: aastore
      // 047: ldc2_w -7519747754289341074
      // 04a: lload 3
      // 04b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/fw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: lload 11
      // 052: bipush 1
      // 053: anewarray 86
      // 056: dup_x2
      // 057: dup_x2
      // 058: pop
      // 059: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05c: bipush 0
      // 05d: swap
      // 05e: aastore
      // 05f: ldc2_w -7523483355744082896
      // 062: lload 3
      // 063: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: astore 14
      // 06a: ldc2_w -8014033467534298762
      // 06d: lload 3
      // 06e: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 0
      // 074: lload 5
      // 076: bipush 1
      // 077: anewarray 86
      // 07a: dup_x2
      // 07b: dup_x2
      // 07c: pop
      // 07d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 080: bipush 0
      // 081: swap
      // 082: aastore
      // 083: ldc2_w -7519747754289341074
      // 086: lload 3
      // 087: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/fw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: lload 7
      // 08e: bipush 1
      // 08f: anewarray 86
      // 092: dup_x2
      // 093: dup_x2
      // 094: pop
      // 095: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 098: bipush 0
      // 099: swap
      // 09a: aastore
      // 09b: ldc2_w -7640253239245985006
      // 09e: lload 3
      // 09f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: istore 15
      // 0a6: astore 13
      // 0a8: aload 2
      // 0a9: aload 13
      // 0ab: ifnonnull 190
      // 0ae: sipush 29687
      // 0b1: ldc2_w 2017764474029461766
      // 0b4: lload 3
      // 0b5: lxor
      // 0b6: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0be: ifne 179
      // 0c1: goto 0ce
      // 0c4: ldc2_w -8345084748618135652
      // 0c7: lload 3
      // 0c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 2
      // 0cf: aload 13
      // 0d1: ifnonnull 190
      // 0d4: goto 0e1
      // 0d7: ldc2_w -8345084748618135652
      // 0da: lload 3
      // 0db: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 3
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: iflt 183
      // 0e7: sipush 22293
      // 0ea: ldc2_w 4933065752728597993
      // 0ed: lload 3
      // 0ee: lxor
      // 0ef: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f7: ifne 179
      // 0fa: goto 107
      // 0fd: ldc2_w -8345084748618135652
      // 100: lload 3
      // 101: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 2
      // 108: aload 13
      // 10a: lload 3
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: ifle 192
      // 110: ifnonnull 190
      // 113: goto 120
      // 116: ldc2_w -8345084748618135652
      // 119: lload 3
      // 11a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: lload 3
      // 121: lconst_0
      // 122: lcmp
      // 123: iflt 183
      // 126: sipush 1144
      // 129: ldc2_w 622949439110030991
      // 12c: lload 3
      // 12d: lxor
      // 12e: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 136: ifne 179
      // 139: goto 146
      // 13c: ldc2_w -8345084748618135652
      // 13f: lload 3
      // 140: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: aload 2
      // 147: aload 13
      // 149: ifnonnull 2c8
      // 14c: goto 159
      // 14f: ldc2_w -8345084748618135652
      // 152: lload 3
      // 153: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: sipush 845
      // 15c: ldc2_w 4280308273395999152
      // 15f: lload 3
      // 160: lxor
      // 161: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 169: ifeq 2b7
      // 16c: goto 179
      // 16f: ldc2_w -8345084748618135652
      // 172: lload 3
      // 173: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 0
      // 17a: ldc2_w -7774210792709792589
      // 17d: lload 3
      // 17e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: goto 190
      // 186: ldc2_w -8345084748618135652
      // 189: lload 3
      // 18a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: aload 13
      // 192: lload 3
      // 193: lconst_0
      // 194: lcmp
      // 195: ifle 1e7
      // 198: ifnonnull 1e5
      // 19b: ifnonnull 1ce
      // 19e: goto 1ab
      // 1a1: ldc2_w -8345084748618135652
      // 1a4: lload 3
      // 1a5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: lload 3
      // 1ad: lconst_0
      // 1ae: lcmp
      // 1af: ifle 2b8
      // 1b2: aload 2
      // 1b3: ldc2_w -7774210792709792589
      // 1b6: lload 3
      // 1b7: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: aload 13
      // 1be: ifnull 2b7
      // 1c1: goto 1ce
      // 1c4: ldc2_w -8345084748618135652
      // 1c7: lload 3
      // 1c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: ldc2_w -7774210792709792589
      // 1d2: lload 3
      // 1d3: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: goto 1e5
      // 1db: ldc2_w -8345084748618135652
      // 1de: lload 3
      // 1df: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: athrow
      // 1e5: aload 13
      // 1e7: ifnonnull 2c8
      // 1ea: aload 2
      // 1eb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ee: ifne 2b7
      // 1f1: goto 1fe
      // 1f4: ldc2_w -8345084748618135652
      // 1f7: lload 3
      // 1f8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: ldc2_w -7817360291284325288
      // 202: lload 3
      // 203: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: new java/lang/StringBuilder
      // 20b: dup
      // 20c: invokespecial java/lang/StringBuilder.<init> ()V
      // 20f: ldc "\""
      // 211: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 214: aload 2
      // 215: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 218: sipush 16577
      // 21b: ldc2_w 1084480375919895091
      // 21e: lload 3
      // 21f: lxor
      // 220: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 228: aload 0
      // 229: ldc2_w -7774210792709792589
      // 22c: lload 3
      // 22d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 235: sipush 1255
      // 238: ldc2_w 7589317615187797523
      // 23b: lload 3
      // 23c: lxor
      // 23d: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 245: aload 14
      // 247: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24a: sipush 23790
      // 24d: ldc2_w 8678044214671703576
      // 250: lload 3
      // 251: lxor
      // 252: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25a: iload 15
      // 25c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 25f: sipush 19177
      // 262: ldc2_w 8143067216316491802
      // 265: lload 3
      // 266: lxor
      // 267: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26f: aload 2
      // 270: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 273: sipush 15341
      // 276: ldc2_w 5124703457132124437
      // 279: lload 3
      // 27a: lxor
      // 27b: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 283: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 286: bipush 1
      // 287: lload 9
      // 289: bipush 3
      // 28a: anewarray 86
      // 28d: dup_x2
      // 28e: dup_x2
      // 28f: pop
      // 290: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 293: bipush 2
      // 294: swap
      // 295: aastore
      // 296: dup_x1
      // 297: swap
      // 298: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 29b: bipush 1
      // 29c: swap
      // 29d: aastore
      // 29e: dup_x1
      // 29f: swap
      // 2a0: bipush 0
      // 2a1: swap
      // 2a2: aastore
      // 2a3: ldc2_w -7854458479123889107
      // 2a6: lload 3
      // 2a7: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: return
      // 2ad: ldc2_w -8345084748618135652
      // 2b0: lload 3
      // 2b1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: ldc2_w -8630373169127898701
      // 2bb: lload 3
      // 2bc: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: aload 2
      // 2c2: aload 2
      // 2c3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2c8: astore 16
      // 2ca: lload 3
      // 2cb: lconst_0
      // 2cc: lcmp
      // 2cd: ifle 347
      // 2d0: aload 16
      // 2d2: ifnull 354
      // 2d5: aload 0
      // 2d6: ldc2_w -7817360291284325288
      // 2d9: lload 3
      // 2da: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: new java/lang/StringBuilder
      // 2e2: dup
      // 2e3: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e6: ldc "\""
      // 2e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2eb: aload 2
      // 2ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ef: sipush 19861
      // 2f2: ldc2_w 2344784924518379370
      // 2f5: lload 3
      // 2f6: lxor
      // 2f7: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ff: aload 14
      // 301: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 304: sipush 18180
      // 307: ldc2_w 1003895960289601009
      // 30a: lload 3
      // 30b: lxor
      // 30c: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/zu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 314: iload 15
      // 316: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 319: ldc "."
      // 31b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 321: bipush 1
      // 322: lload 9
      // 324: bipush 3
      // 325: anewarray 86
      // 328: dup_x2
      // 329: dup_x2
      // 32a: pop
      // 32b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32e: bipush 2
      // 32f: swap
      // 330: aastore
      // 331: dup_x1
      // 332: swap
      // 333: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 336: bipush 1
      // 337: swap
      // 338: aastore
      // 339: dup_x1
      // 33a: swap
      // 33b: bipush 0
      // 33c: swap
      // 33d: aastore
      // 33e: ldc2_w -7854458479123889107
      // 341: lload 3
      // 342: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: goto 354
      // 34a: ldc2_w -8345084748618135652
      // 34d: lload 3
      // 34e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: athrow
      // 354: return
   }

   public zu(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 70282174420768L;
      long var6 = var2 ^ 239452188650L;
      super(var4, var1);
      int var10001 = (int)e;
      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = var10001;
      x44.a<"t">(this, x44.a<"w">(var10004, -7932644267198146982L, var2), -8187101697788819480L, var2);
      x44.a<"t">(this, new ArrayList(), -8115564857011625228L, var2);
   }

   void r(Object[] var1) {
      fo var2 = (fo)var1[0];
      this.u = var2;
   }

   public String o(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 93693534072418
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 11452745429262
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w 8596022076981270261
      // 1f: lload 2
      // 20: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 8
      // 27: aload 0
      // 28: aload 8
      // 2a: ifnonnull 9c
      // 2d: ldc2_w 8601315863099125735
      // 30: lload 2
      // 31: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/fk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: ifnull 9b
      // 39: goto 46
      // 3c: ldc2_w 7760570973278101535
      // 3f: lload 2
      // 40: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: getfield com/zelix/zu.f Lcom/zelix/ff;
      // 4a: lload 6
      // 4c: dup2_x1
      // 4d: pop2
      // 4e: aload 0
      // 4f: getfield com/zelix/zu.Y Lcom/zelix/_uq;
      // 52: aload 0
      // 53: ldc2_w 8142444792115371559
      // 56: lload 2
      // 57: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: aload 0
      // 5d: ldc2_w 8601315863099125735
      // 60: lload 2
      // 61: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/fk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: bipush 5
      // 67: anewarray 86
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 4
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x1
      // 70: swap
      // 71: bipush 3
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: bipush 2
      // 77: swap
      // 78: aastore
      // 79: dup_x1
      // 7a: swap
      // 7b: bipush 1
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x2
      // 7f: dup_x2
      // 80: pop
      // 81: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 84: bipush 0
      // 85: swap
      // 86: aastore
      // 87: ldc2_w 8437230782374184687
      // 8a: lload 2
      // 8b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: areturn
      // 91: ldc2_w 7760570973278101535
      // 94: lload 2
      // 95: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: aload 0
      // 9c: getfield com/zelix/zu.f Lcom/zelix/ff;
      // 9f: aload 0
      // a0: getfield com/zelix/zu.Y Lcom/zelix/_uq;
      // a3: aload 0
      // a4: getfield com/zelix/zu.u Lcom/zelix/fo;
      // a7: lload 4
      // a9: dup2_x1
      // aa: pop2
      // ab: aload 0
      // ac: getfield com/zelix/zu.R Lcom/zelix/_fd;
      // af: aload 0
      // b0: ldc2_w 8148705071715439890
      // b3: lload 2
      // b4: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/ff; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: aload 0
      // ba: ldc2_w 7964528498827346732
      // bd: lload 2
      // be: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: bipush 7
      // c5: anewarray 86
      // c8: dup_x1
      // c9: swap
      // ca: bipush 6
      // cc: swap
      // cd: aastore
      // ce: dup_x1
      // cf: swap
      // d0: bipush 5
      // d1: swap
      // d2: aastore
      // d3: dup_x1
      // d4: swap
      // d5: bipush 4
      // d6: swap
      // d7: aastore
      // d8: dup_x1
      // d9: swap
      // da: bipush 3
      // db: swap
      // dc: aastore
      // dd: dup_x2
      // de: dup_x2
      // df: pop
      // e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e3: bipush 2
      // e4: swap
      // e5: aastore
      // e6: dup_x1
      // e7: swap
      // e8: bipush 1
      // e9: swap
      // ea: aastore
      // eb: dup_x1
      // ec: swap
      // ed: bipush 0
      // ee: swap
      // ef: aastore
      // f0: ldc2_w 8313836007446138007
      // f3: lload 2
      // f4: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f9: areturn
   }

   public void X(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"p">(this, var4, 8012909115104362987L, var2);
   }

   public void M(Object[] var1) {
      fk var4 = (fk)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"w">(this, var4, -9199344374423201556L, var2);
   }

   static {
      long var5 = a ^ 45869233521073L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[14];
      int var12 = 0;
      String var11 = "Ë4b¤\u009c\r\u000e¥à>\u009517jùýùõÂÙ7\u0000/~\u0096N©o\u009druC\u009f[Öfù«Ã\u000f\u0010Hfb÷\u000fö\rZð\u000bÄÔKAHù\u0010n&îôëü¾Þhb%è\u008b\u0013{¨(N\u0088mM\u009dãJ7¹LB£\u009fñßÞ*Õ:S\u008e\"¬\u0010çTy\u0003\u009d\u0017ç\u009a^'\n¯\bYû±\u0010\bWåhñ`\u0013\u0014KzD\u009eT4×i\u0010fAzXÈ[rôU({j¸ä7È\u0010\u0088+g0ök\u001fù\u00188´\u0084S\u0012R\\07\t{wõ\u0017¶\u000bDÈ,O¾!\u0084Ù\u0095~gÞ^J\u0004qÀ7\u008d\u0099ÑÕ/úBÙß|mR}t¾\u0017VËg¥`î\u0010Ù\u0096Û]¾}Ý\u009a!Û¼\u00943U\u0016ñ §\u001fså}\u0088ÌáíKW:\u0080\u0010éß²âþPìïÑ¼ý65ÀK{!¹0\u00ad>U,¥Þ\u0082í(;÷¬Z\u0010Né-²4¹xÊ\u009dz3O¯±_,)\"á\u0018dm²\u008aM\u009a\u001a®ð£8é\ru\u0010 '\u000fÄBL\u0016gâHò»Zà¥\u001b";
      int var13 = "Ë4b¤\u009c\r\u000e¥à>\u009517jùýùõÂÙ7\u0000/~\u0096N©o\u009druC\u009f[Öfù«Ã\u000f\u0010Hfb÷\u000fö\rZð\u000bÄÔKAHù\u0010n&îôëü¾Þhb%è\u008b\u0013{¨(N\u0088mM\u009dãJ7¹LB£\u009fñßÞ*Õ:S\u008e\"¬\u0010çTy\u0003\u009d\u0017ç\u009a^'\n¯\bYû±\u0010\bWåhñ`\u0013\u0014KzD\u009eT4×i\u0010fAzXÈ[rôU({j¸ä7È\u0010\u0088+g0ök\u001fù\u00188´\u0084S\u0012R\\07\t{wõ\u0017¶\u000bDÈ,O¾!\u0084Ù\u0095~gÞ^J\u0004qÀ7\u008d\u0099ÑÕ/úBÙß|mR}t¾\u0017VËg¥`î\u0010Ù\u0096Û]¾}Ý\u009a!Û¼\u00943U\u0016ñ §\u001fså}\u0088ÌáíKW:\u0080\u0010éß²âþPìïÑ¼ý65ÀK{!¹0\u00ad>U,¥Þ\u0082í(;÷¬Z\u0010Né-²4¹xÊ\u009dz3O¯±_,)\"á\u0018dm²\u008aM\u009a\u001a®ð£8é\ru\u0010 '\u000fÄBL\u0016gâHò»Zà¥\u001b"
         .length();
      char var10 = '(';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = b(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     b = var14;
                     c = new String[14];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 7400822824717255761L;
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
                     e = var30;
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

                  var11 = "/SM\u0019ñ\u001f\u007fÂö\u0014Bùº\u0099Ê\u0011 \u0005\u009c@(õ¯X¨\u009d»mm\u0097\\Ú²Òÿ)\u0089\u0084\u0094åB\u0096Ö\u0087ö\u0017'\u0086\b";
                  var13 = "/SM\u0019ñ\u001f\u007fÂö\u0014Bùº\u0099Ê\u0011 \u0005\u009c@(õ¯X¨\u009d»mm\u0097\\Ú²Òÿ)\u0089\u0084\u0094åB\u0096Ö\u0087ö\u0017'\u0086\b"
                     .length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15330;
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
            throw new RuntimeException("com/zelix/zu", var10);
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
         throw new RuntimeException("com/zelix/zu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
