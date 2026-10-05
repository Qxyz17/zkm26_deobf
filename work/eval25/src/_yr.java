package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _yr implements sr {
   private String B;
   private _og g;
   private static final long a = ess.a(-7452032006676882148L, -1884210057767204239L, MethodHandles.lookup().lookupClass()).a(99881416740141L);
   private static final String c;

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_yr.a J
      // 003: ldc2_w 121117594269562
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -6525695167663354267
      // 00b: lload 2
      // 00c: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: istore 4
      // 013: aload 1
      // 014: instanceof com/zelix/_yr
      // 017: iload 4
      // 019: ifne 197
      // 01c: ifeq 196
      // 01f: goto 02c
      // 022: ldc2_w -4985619906702869516
      // 025: lload 2
      // 026: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/_yr
      // 030: astore 6
      // 032: aload 0
      // 033: ldc2_w -4964871198534810543
      // 036: lload 2
      // 037: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: iload 4
      // 03e: ifne 0ca
      // 041: ifnull 0b2
      // 044: goto 051
      // 047: ldc2_w -4985619906702869516
      // 04a: lload 2
      // 04b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: aload 6
      // 053: ldc2_w -4964871198534810543
      // 056: lload 2
      // 057: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: iload 4
      // 05e: ifne 095
      // 061: goto 06e
      // 064: ldc2_w -4985619906702869516
      // 067: lload 2
      // 068: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: ifnull 0aa
      // 071: goto 07e
      // 074: ldc2_w -4985619906702869516
      // 077: lload 2
      // 078: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: aload 0
      // 07f: ldc2_w -4964871198534810543
      // 082: lload 2
      // 083: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: goto 095
      // 08b: ldc2_w -4985619906702869516
      // 08e: lload 2
      // 08f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 6
      // 097: ldc2_w -4964871198534810543
      // 09a: lload 2
      // 09b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0a3: istore 5
      // 0a5: iload 4
      // 0a7: ifeq 0de
      // 0aa: bipush 0
      // 0ab: istore 5
      // 0ad: iload 4
      // 0af: ifeq 0de
      // 0b2: aload 6
      // 0b4: ldc2_w -4964871198534810543
      // 0b7: lload 2
      // 0b8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: goto 0ca
      // 0c0: ldc2_w -4985619906702869516
      // 0c3: lload 2
      // 0c4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: ifnonnull 0db
      // 0cd: bipush 1
      // 0ce: goto 0dc
      // 0d1: ldc2_w -4985619906702869516
      // 0d4: lload 2
      // 0d5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: bipush 0
      // 0dc: istore 5
      // 0de: iload 5
      // 0e0: iload 4
      // 0e2: ifne 195
      // 0e5: ifeq 194
      // 0e8: goto 0f5
      // 0eb: ldc2_w -4985619906702869516
      // 0ee: lload 2
      // 0ef: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: ldc2_w -5056251198865383264
      // 0f9: lload 2
      // 0fa: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: iload 4
      // 101: ifne 181
      // 104: goto 111
      // 107: ldc2_w -4985619906702869516
      // 10a: lload 2
      // 10b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: ifnull 176
      // 114: goto 121
      // 117: ldc2_w -4985619906702869516
      // 11a: lload 2
      // 11b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 6
      // 123: ldc2_w -5056251198865383264
      // 126: lload 2
      // 127: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: iload 4
      // 12e: ifne 165
      // 131: goto 13e
      // 134: ldc2_w -4985619906702869516
      // 137: lload 2
      // 138: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: ifnull 174
      // 141: goto 14e
      // 144: ldc2_w -4985619906702869516
      // 147: lload 2
      // 148: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 0
      // 14f: ldc2_w -5056251198865383264
      // 152: lload 2
      // 153: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: goto 165
      // 15b: ldc2_w -4985619906702869516
      // 15e: lload 2
      // 15f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: aload 6
      // 167: ldc2_w -5056251198865383264
      // 16a: lload 2
      // 16b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 173: ireturn
      // 174: bipush 0
      // 175: ireturn
      // 176: aload 6
      // 178: ldc2_w -5056251198865383264
      // 17b: lload 2
      // 17c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: ifnonnull 192
      // 184: bipush 1
      // 185: goto 193
      // 188: ldc2_w -4985619906702869516
      // 18b: lload 2
      // 18c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: bipush 0
      // 193: ireturn
      // 194: bipush 0
      // 195: ireturn
      // 196: bipush 0
      // 197: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 133218046759512L;
      boolean var10000 = x44.a<"w">(-4380930909820330671L, var1);
      int var4 = 0;
      boolean var3 = var10000;

      label25: {
         label24: {
            try {
               var6 = this;
               if (!var3) {
                  break label25;
               }

               if (x44.a<"k">(this, -2433301704453152397L, var1) == null) {
                  break label24;
               }
            } catch (gj var5) {
               throw x44.a<"w">(var5, -2311030424430731562L, var1);
            }

            var4 = x44.a<"k">(this, -2433301704453152397L, var1).hashCode();
         }

         var6 = this;
      }

      if (x44.a<"k">(var6, -2524688308000782974L, var1) != null) {
         var4 ^= x44.a<"k">(this, -2524688308000782974L, var1).hashCode();
      }

      return var4;
   }

   public int B(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      return -1;
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 67135027577178L;
      return x44.a<"n">(this, new Object[]{var4}, 2638598220331950658L, var2);
   }

   public _yr(_og param1, long param2, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_yr.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w -995178013909706459
      // 09: lload 2
      // 0a: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokespecial java/lang/Object.<init> ()V
      // 13: istore 5
      // 15: aload 0
      // 16: iload 5
      // 18: ifne 69
      // 1b: aload 1
      // 1c: ldc2_w -1416025855979646191
      // 1f: lload 2
      // 20: invokedynamic v (Ljava/lang/Object;Lcom/zelix/_og;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 4
      // 27: ldc "["
      // 29: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2c: ifeq 5b
      // 2f: goto 3c
      // 32: ldc2_w -1328565104026276684
      // 35: lload 2
      // 36: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: getstatic com/zelix/_yr.c Ljava/lang/String;
      // 40: ldc2_w -1255116311618439200
      // 43: lload 2
      // 44: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: iload 5
      // 4b: ifeq 74
      // 4e: goto 5b
      // 51: ldc2_w -1328565104026276684
      // 54: lload 2
      // 55: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 69
      // 5f: ldc2_w -1328565104026276684
      // 62: lload 2
      // 63: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: aload 4
      // 6b: ldc2_w -1255116311618439200
      // 6e: lload 2
      // 6f: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: return
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String i(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"l">(this, -1256071322730809371L, var2);
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public String s(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"h">(this, -5127913977809378911L, var2);
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 135986204036823L;
      return x44.a<"k">(this, new Object[]{var4}, 7715626839263636943L, var2);
   }

   static {
      long var0 = a ^ 23614989569984L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("-\u001a8¾c\nå±hvÑùer\bSO\u009dCl¬\u0000)h".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      c = var5;
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
}
