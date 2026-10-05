package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class e1 implements Serializable {
   private Object M;
   private Object V;
   private Object z;
   private static final long a = ess.a(9120496799346195918L, -4822528809002242534L, MethodHandles.lookup().lookupClass()).a(244221076782968L);

   public Object M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -1637795364339559570L, var2);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 43293320813211L;
      String var10000 = x44.a<"q">(-4174559204142424300L, var1);
      int var4 = 0;
      String var3 = var10000;

      label41: {
         label40: {
            try {
               var10000 = (String)x44.a<"m">(this, -4281523359097962365L, var1);
               if (var3 != null) {
                  break label41;
               }

               if (var10000 == null) {
                  break label40;
               }
            } catch (gj var6) {
               throw x44.a<"q">(var6, -4193672369794042719L, var1);
            }

            var4 ^= x44.a<"m">(this, -4281523359097962365L, var1).hashCode();
         }

         var10000 = (String)x44.a<"m">(this, -4100817867045269637L, var1);
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
            } catch (gj var5) {
               throw x44.a<"q">(var5, -4193672369794042719L, var1);
            }

            var4 ^= x44.a<"m">(this, -4100817867045269637L, var1).hashCode();
         }

         var10000 = (String)x44.a<"m">(this, -4475350178046444593L, var1);
      }

      if (var10000 != null) {
         var4 ^= x44.a<"m">(this, -4475350178046444593L, var1).hashCode();
      }

      return var4;
   }

   public Object z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 7674044515092754024L, var2);
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
      // 000: getstatic com/zelix/e1.a J
      // 003: ldc2_w 139646465394463
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w 1987394636845679248
      // 00b: lload 2
      // 00c: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: instanceof com/zelix/e1
      // 017: aload 4
      // 019: ifnonnull 2f4
      // 01c: ifeq 2f3
      // 01f: goto 02c
      // 022: ldc2_w 1750014949708196133
      // 025: lload 2
      // 026: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/e1
      // 030: astore 5
      // 032: aload 0
      // 033: ldc2_w 1806120822014287111
      // 036: lload 2
      // 037: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 4
      // 03e: ifnonnull 095
      // 041: ifnonnull 07e
      // 044: goto 051
      // 047: ldc2_w 1750014949708196133
      // 04a: lload 2
      // 04b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: aload 5
      // 053: ldc2_w 1806120822014287111
      // 056: lload 2
      // 057: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 4
      // 05e: ifnonnull 128
      // 061: goto 06e
      // 064: ldc2_w 1750014949708196133
      // 067: lload 2
      // 068: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: ifnull 111
      // 071: goto 07e
      // 074: ldc2_w 1750014949708196133
      // 077: lload 2
      // 078: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: aload 0
      // 07f: ldc2_w 1806120822014287111
      // 082: lload 2
      // 083: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: goto 095
      // 08b: ldc2_w 1750014949708196133
      // 08e: lload 2
      // 08f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 4
      // 097: ifnonnull 0c2
      // 09a: ifnull 2ed
      // 09d: goto 0aa
      // 0a0: ldc2_w 1750014949708196133
      // 0a3: lload 2
      // 0a4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 5
      // 0ac: ldc2_w 1806120822014287111
      // 0af: lload 2
      // 0b0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: goto 0c2
      // 0b8: ldc2_w 1750014949708196133
      // 0bb: lload 2
      // 0bc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 4
      // 0c4: ifnonnull 0ee
      // 0c7: ifnull 2ed
      // 0ca: goto 0d7
      // 0cd: ldc2_w 1750014949708196133
      // 0d0: lload 2
      // 0d1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: ldc2_w 1806120822014287111
      // 0db: lload 2
      // 0dc: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: goto 0ee
      // 0e4: ldc2_w 1750014949708196133
      // 0e7: lload 2
      // 0e8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 4
      // 0f0: ifnonnull 128
      // 0f3: aload 5
      // 0f5: ldc2_w 1806120822014287111
      // 0f8: lload 2
      // 0f9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 101: ifeq 2ed
      // 104: goto 111
      // 107: ldc2_w 1750014949708196133
      // 10a: lload 2
      // 10b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: ldc2_w 1914785762197754623
      // 115: lload 2
      // 116: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: goto 128
      // 11e: ldc2_w 1750014949708196133
      // 121: lload 2
      // 122: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 4
      // 12a: ifnonnull 181
      // 12d: ifnonnull 16a
      // 130: goto 13d
      // 133: ldc2_w 1750014949708196133
      // 136: lload 2
      // 137: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 5
      // 13f: ldc2_w 1914785762197754623
      // 142: lload 2
      // 143: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: aload 4
      // 14a: ifnonnull 214
      // 14d: goto 15a
      // 150: ldc2_w 1750014949708196133
      // 153: lload 2
      // 154: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: ifnull 1fd
      // 15d: goto 16a
      // 160: ldc2_w 1750014949708196133
      // 163: lload 2
      // 164: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 0
      // 16b: ldc2_w 1914785762197754623
      // 16e: lload 2
      // 16f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: goto 181
      // 177: ldc2_w 1750014949708196133
      // 17a: lload 2
      // 17b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: aload 4
      // 183: ifnonnull 1ae
      // 186: ifnull 2ed
      // 189: goto 196
      // 18c: ldc2_w 1750014949708196133
      // 18f: lload 2
      // 190: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: aload 5
      // 198: ldc2_w 1914785762197754623
      // 19b: lload 2
      // 19c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: goto 1ae
      // 1a4: ldc2_w 1750014949708196133
      // 1a7: lload 2
      // 1a8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 4
      // 1b0: ifnonnull 1da
      // 1b3: ifnull 2ed
      // 1b6: goto 1c3
      // 1b9: ldc2_w 1750014949708196133
      // 1bc: lload 2
      // 1bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: ldc2_w 1914785762197754623
      // 1c7: lload 2
      // 1c8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: goto 1da
      // 1d0: ldc2_w 1750014949708196133
      // 1d3: lload 2
      // 1d4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: aload 4
      // 1dc: ifnonnull 214
      // 1df: aload 5
      // 1e1: ldc2_w 1914785762197754623
      // 1e4: lload 2
      // 1e5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1ed: ifeq 2ed
      // 1f0: goto 1fd
      // 1f3: ldc2_w 1750014949708196133
      // 1f6: lload 2
      // 1f7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: aload 0
      // 1fe: ldc2_w 2044639558783182411
      // 201: lload 2
      // 202: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: goto 214
      // 20a: ldc2_w 1750014949708196133
      // 20d: lload 2
      // 20e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: aload 4
      // 216: ifnonnull 26d
      // 219: ifnonnull 256
      // 21c: goto 229
      // 21f: ldc2_w 1750014949708196133
      // 222: lload 2
      // 223: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: aload 5
      // 22b: ldc2_w 2044639558783182411
      // 22e: lload 2
      // 22f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: aload 4
      // 236: ifnonnull 26d
      // 239: goto 246
      // 23c: ldc2_w 1750014949708196133
      // 23f: lload 2
      // 240: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: ifnull 2e9
      // 249: goto 256
      // 24c: ldc2_w 1750014949708196133
      // 24f: lload 2
      // 250: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: aload 0
      // 257: ldc2_w 2044639558783182411
      // 25a: lload 2
      // 25b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: goto 26d
      // 263: ldc2_w 1750014949708196133
      // 266: lload 2
      // 267: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: aload 4
      // 26f: ifnonnull 29a
      // 272: ifnull 2ed
      // 275: goto 282
      // 278: ldc2_w 1750014949708196133
      // 27b: lload 2
      // 27c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: athrow
      // 282: aload 5
      // 284: ldc2_w 2044639558783182411
      // 287: lload 2
      // 288: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: goto 29a
      // 290: ldc2_w 1750014949708196133
      // 293: lload 2
      // 294: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: athrow
      // 29a: aload 4
      // 29c: ifnonnull 2c6
      // 29f: ifnull 2ed
      // 2a2: goto 2af
      // 2a5: ldc2_w 1750014949708196133
      // 2a8: lload 2
      // 2a9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: ldc2_w 2044639558783182411
      // 2b3: lload 2
      // 2b4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: goto 2c6
      // 2bc: ldc2_w 1750014949708196133
      // 2bf: lload 2
      // 2c0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: athrow
      // 2c6: aload 5
      // 2c8: ldc2_w 2044639558783182411
      // 2cb: lload 2
      // 2cc: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2d4: aload 4
      // 2d6: ifnonnull 2ea
      // 2d9: ifeq 2ed
      // 2dc: goto 2e9
      // 2df: ldc2_w 1750014949708196133
      // 2e2: lload 2
      // 2e3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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

   public e1(long var1, Object var3, Object var4, Object var5) {
      var1 = a ^ var1;
      super();
      x44.a<"u">(this, var3, -6180094956344988116L, var1);
      x44.a<"u">(this, var4, -6216679762505276972L, var1);
      x44.a<"u">(this, var5, -5815482027054656160L, var1);
   }

   public Object O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 7816984225232233494L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
