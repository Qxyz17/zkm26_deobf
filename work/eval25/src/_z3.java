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

public class _z3 {
   private Object y;
   private Object A;
   private Object i;
   private static final long a = ess.a(-4475520972243429305L, -6959959394766187542L, MethodHandles.lookup().lookupClass()).a(81691681612807L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public Object S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 4188946359091188618L, var2);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 24579506721002L;
      String var10000 = x44.a<"v">(-4114095909450096669L, var1);
      int var4 = 0;
      String var3 = var10000;

      label41: {
         label40: {
            try {
               var10000 = (String)x44.a<"j">(this, -4606360775052407137L, var1);
               if (var3 != null) {
                  break label41;
               }

               if (var10000 == null) {
                  break label40;
               }
            } catch (IllegalArgumentException var6) {
               throw x44.a<"v">(var6, -4055816981644297819L, var1);
            }

            var4 ^= x44.a<"j">(this, -4606360775052407137L, var1).hashCode();
         }

         var10000 = (String)x44.a<"j">(this, -2483526294465943603L, var1);
      }

      label32: {
         label31: {
            try {
               if (var3 != null) {
                  break label32;
               }

               if (var10000 == null) {
                  break label31;
               }
            } catch (IllegalArgumentException var5) {
               throw x44.a<"v">(var5, -4055816981644297819L, var1);
            }

            var4 ^= x44.a<"j">(this, -2483526294465943603L, var1).hashCode();
         }

         var10000 = (String)x44.a<"j">(this, -2499708758459599641L, var1);
      }

      if (var10000 != null) {
         var4 ^= x44.a<"j">(this, -2499708758459599641L, var1).hashCode();
      }

      return var4;
   }

   public Object e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -8401496160176721630L, var2);
   }

   public Object j(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;

      try {
         switch (var4) {
            case 0:
               return x44.a<"j">(this, 6808006707359437047L, var2);
            case 1:
               return x44.a<"j">(this, 4891103526204504485L, var2);
            case 2:
               return x44.a<"j">(this, 4838921402180610703L, var2);
         }
      } catch (IllegalArgumentException var5) {
         throw x44.a<"v">(var5, 6475853771775649741L, var2);
      }

      throw new IllegalArgumentException(a<"p">(18790, 8499137912810968288L ^ var2) + var4);
   }

   public _z3(Object var1, Object var2, Object var3, long var4) {
      var4 = a ^ var4;
      super();
      x44.a<"t">(this, var1, -6630429659303170698L, var4);
      x44.a<"t">(this, var2, -4728306942308285404L, var4);
      x44.a<"t">(this, var3, -4708988134281095410L, var4);
   }

   public Object B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 6414508935248861065L, var2);
   }

   public Object q(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      Object var5 = x44.a<"l">(this, -2434604155070716813L, var2);
      x44.a<"s">(this, var4, -2434604155070716813L, var2);
      return var5;
   }

   public Object W(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      Object var5 = x44.a<"h">(this, 650010581209768109L, var2);
      x44.a<"w">(this, var4, 650010581209768109L, var2);
      return var5;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_z3.a J
      // 003: ldc2_w 78456566746572
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w 2000049655250420421
      // 00b: lload 2
      // 00c: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: instanceof com/zelix/_z3
      // 017: aload 4
      // 019: ifnonnull 2f4
      // 01c: ifeq 2f3
      // 01f: goto 02c
      // 022: ldc2_w 1914178208393520259
      // 025: lload 2
      // 026: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/_z3
      // 030: astore 5
      // 032: aload 0
      // 033: ldc2_w 2104511736181396409
      // 036: lload 2
      // 037: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 4
      // 03e: ifnonnull 095
      // 041: ifnonnull 07e
      // 044: goto 051
      // 047: ldc2_w 1914178208393520259
      // 04a: lload 2
      // 04b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: aload 5
      // 053: ldc2_w 2104511736181396409
      // 056: lload 2
      // 057: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 4
      // 05e: ifnonnull 128
      // 061: goto 06e
      // 064: ldc2_w 1914178208393520259
      // 067: lload 2
      // 068: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: ifnull 111
      // 071: goto 07e
      // 074: ldc2_w 1914178208393520259
      // 077: lload 2
      // 078: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: aload 0
      // 07f: ldc2_w 2104511736181396409
      // 082: lload 2
      // 083: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: goto 095
      // 08b: ldc2_w 1914178208393520259
      // 08e: lload 2
      // 08f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 4
      // 097: ifnonnull 0c2
      // 09a: ifnull 2ed
      // 09d: goto 0aa
      // 0a0: ldc2_w 1914178208393520259
      // 0a3: lload 2
      // 0a4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 5
      // 0ac: ldc2_w 2104511736181396409
      // 0af: lload 2
      // 0b0: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: goto 0c2
      // 0b8: ldc2_w 1914178208393520259
      // 0bb: lload 2
      // 0bc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 4
      // 0c4: ifnonnull 0ee
      // 0c7: ifnull 2ed
      // 0ca: goto 0d7
      // 0cd: ldc2_w 1914178208393520259
      // 0d0: lload 2
      // 0d1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: ldc2_w 2104511736181396409
      // 0db: lload 2
      // 0dc: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: goto 0ee
      // 0e4: ldc2_w 1914178208393520259
      // 0e7: lload 2
      // 0e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 4
      // 0f0: ifnonnull 128
      // 0f3: aload 5
      // 0f5: ldc2_w 2104511736181396409
      // 0f8: lload 2
      // 0f9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 101: ifeq 2ed
      // 104: goto 111
      // 107: ldc2_w 1914178208393520259
      // 10a: lload 2
      // 10b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: ldc2_w 49237228576914155
      // 115: lload 2
      // 116: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: goto 128
      // 11e: ldc2_w 1914178208393520259
      // 121: lload 2
      // 122: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 4
      // 12a: ifnonnull 181
      // 12d: ifnonnull 16a
      // 130: goto 13d
      // 133: ldc2_w 1914178208393520259
      // 136: lload 2
      // 137: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 5
      // 13f: ldc2_w 49237228576914155
      // 142: lload 2
      // 143: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: aload 4
      // 14a: ifnonnull 214
      // 14d: goto 15a
      // 150: ldc2_w 1914178208393520259
      // 153: lload 2
      // 154: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: ifnull 1fd
      // 15d: goto 16a
      // 160: ldc2_w 1914178208393520259
      // 163: lload 2
      // 164: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 0
      // 16b: ldc2_w 49237228576914155
      // 16e: lload 2
      // 16f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: goto 181
      // 177: ldc2_w 1914178208393520259
      // 17a: lload 2
      // 17b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: aload 4
      // 183: ifnonnull 1ae
      // 186: ifnull 2ed
      // 189: goto 196
      // 18c: ldc2_w 1914178208393520259
      // 18f: lload 2
      // 190: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: aload 5
      // 198: ldc2_w 49237228576914155
      // 19b: lload 2
      // 19c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: goto 1ae
      // 1a4: ldc2_w 1914178208393520259
      // 1a7: lload 2
      // 1a8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 4
      // 1b0: ifnonnull 1da
      // 1b3: ifnull 2ed
      // 1b6: goto 1c3
      // 1b9: ldc2_w 1914178208393520259
      // 1bc: lload 2
      // 1bd: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: ldc2_w 49237228576914155
      // 1c7: lload 2
      // 1c8: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: goto 1da
      // 1d0: ldc2_w 1914178208393520259
      // 1d3: lload 2
      // 1d4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: aload 4
      // 1dc: ifnonnull 214
      // 1df: aload 5
      // 1e1: ldc2_w 49237228576914155
      // 1e4: lload 2
      // 1e5: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1ed: ifeq 2ed
      // 1f0: goto 1fd
      // 1f3: ldc2_w 1914178208393520259
      // 1f6: lload 2
      // 1f7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: aload 0
      // 1fe: ldc2_w 29573706407471553
      // 201: lload 2
      // 202: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: goto 214
      // 20a: ldc2_w 1914178208393520259
      // 20d: lload 2
      // 20e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: aload 4
      // 216: ifnonnull 26d
      // 219: ifnonnull 256
      // 21c: goto 229
      // 21f: ldc2_w 1914178208393520259
      // 222: lload 2
      // 223: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: aload 5
      // 22b: ldc2_w 29573706407471553
      // 22e: lload 2
      // 22f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: aload 4
      // 236: ifnonnull 26d
      // 239: goto 246
      // 23c: ldc2_w 1914178208393520259
      // 23f: lload 2
      // 240: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: ifnull 2e9
      // 249: goto 256
      // 24c: ldc2_w 1914178208393520259
      // 24f: lload 2
      // 250: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: aload 0
      // 257: ldc2_w 29573706407471553
      // 25a: lload 2
      // 25b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: goto 26d
      // 263: ldc2_w 1914178208393520259
      // 266: lload 2
      // 267: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: aload 4
      // 26f: ifnonnull 29a
      // 272: ifnull 2ed
      // 275: goto 282
      // 278: ldc2_w 1914178208393520259
      // 27b: lload 2
      // 27c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: athrow
      // 282: aload 5
      // 284: ldc2_w 29573706407471553
      // 287: lload 2
      // 288: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: goto 29a
      // 290: ldc2_w 1914178208393520259
      // 293: lload 2
      // 294: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: athrow
      // 29a: aload 4
      // 29c: ifnonnull 2c6
      // 29f: ifnull 2ed
      // 2a2: goto 2af
      // 2a5: ldc2_w 1914178208393520259
      // 2a8: lload 2
      // 2a9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: ldc2_w 29573706407471553
      // 2b3: lload 2
      // 2b4: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: goto 2c6
      // 2bc: ldc2_w 1914178208393520259
      // 2bf: lload 2
      // 2c0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: athrow
      // 2c6: aload 5
      // 2c8: ldc2_w 29573706407471553
      // 2cb: lload 2
      // 2cc: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2d4: aload 4
      // 2d6: ifnonnull 2ea
      // 2d9: ifeq 2ed
      // 2dc: goto 2e9
      // 2df: ldc2_w 1914178208393520259
      // 2e2: lload 2
      // 2e3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: athrow
      // 2e9: bipush 1
      // 2ea: goto 2ee
      // 2ed: bipush 0
      // 2ee: istore 6
      // 2f0: iload 6
      // 2f2: ireturn
      // 2f3: bipush 0
      // 2f4: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public Object d(Object[] var1) {
      int var5;
      long var10;
      label51: {
         Object var4 = var1[0];
         var5 = (Integer)var1[1];
         long var2 = (Long)var1[2];
         var10 = a ^ var2;
         String var6 = x44.a<"w">(-7946951732899116878L, var10);
         Object var7;
         switch (var5) {
            case 0:
               var7 = x44.a<"k">(this, -7546940788916348466L, var10);
               x44.a<"t">(this, var4, -7546940788916348466L, var10);
               if (var10 < 0L) {
                  return var6;
               }

               if (var6 == null) {
                  break;
               }
            case 1:
               var7 = x44.a<"k">(this, -8441513785175658340L, var10);
               x44.a<"t">(this, var4, -8441513785175658340L, var10);
               if (var10 < 0L) {
                  return var6;
               }

               if (var6 == null) {
                  break;
               }
            case 2:
               var7 = x44.a<"k">(this, -8494270270811642954L, var10);

               try {
                  x44.a<"t">(this, var4, -8494270270811642954L, var10);
                  if (var10 <= 0L) {
                     return var6;
                  }

                  if (var6 == null) {
                     break;
                  }
               } catch (IllegalArgumentException var9) {
                  boolean var10001 = false;
                  throw x44.a<"w">(var9, -8005185857561465100L, var10);
               }
            default:
               break label51;
         }

         return var7;
      }

      try {
         throw new IllegalArgumentException(a<"p">(16639, 7657861184110777409L ^ var10) + var5);
      } catch (IllegalArgumentException var8) {
         boolean var12 = false;
         throw x44.a<"w">(var8, -8005185857561465100L, var10);
      }
   }

   static {
      long var0 = a ^ 8585163553642L;
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
      String var6 = "ç\"îThÜæÓ°¶\u0018£¥Uh\u0087¶|¾\u008e\u008eÑ1¥üÀì«=p\u008d\u001a`0V9L\u0006ó÷ÌÄÑ\u0013±(¢\u0090®f\u0005ýnÃ¥¯r4B,ÏKKßÕ\u0092\u0018\u0017 Ø\u0018ñHÌ¶\u0093ó\u0014ß\u007fu\u0005§\\Ï\u0007\u0010\u0004\u0084æ\u0083ÃyrÃå&ß\u00075t :\nY \u0013+§`]ô¶sCé<xÎ©ù×\u009fÔ\u0014n\u0011O\u0084³è`Ég¾.jsé\u001ey\u0001\u0000\f}";
      int var8 = "ç\"îThÜæÓ°¶\u0018£¥Uh\u0087¶|¾\u008e\u008eÑ1¥üÀì«=p\u008d\u001a`0V9L\u0006ó÷ÌÄÑ\u0013±(¢\u0090®f\u0005ýnÃ¥¯r4B,ÏKKßÕ\u0092\u0018\u0017 Ø\u0018ñHÌ¶\u0093ó\u0014ß\u007fu\u0005§\\Ï\u0007\u0010\u0004\u0084æ\u0083ÃyrÃå&ß\u00075t :\nY \u0013+§`]ô¶sCé<xÎ©ù×\u009fÔ\u0014n\u0011O\u0084³è`Ég¾.jsé\u001ey\u0001\u0000\f}"
         .length();
      char var5 = 'H';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6098;
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
            throw new RuntimeException("com/zelix/_z3", var10);
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
         throw new RuntimeException("com/zelix/_z3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
