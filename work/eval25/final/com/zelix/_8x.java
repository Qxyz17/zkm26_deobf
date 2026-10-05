package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class _8x implements Serializable {
   Object Q;
   Object p;
   Object y;
   Object W;
   private static final long a = ess.a(-1701039834635695367L, 2681266921020545123L, MethodHandles.lookup().lookupClass()).a(130427596572423L);

   public Object Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -3120292676374526210L, var2);
   }

   public Object W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 2528672606869435085L, var2);
   }

   public Object p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -1012361694220705235L, var2);
   }

   public _8x(Object var1, Object var2, Object var3, Object var4, char var5, int var6, int var7) {
      long var8 = ((long)var5 << 48 | (long)var6 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ a;
      super();
      x44.a<"v">(this, var1, 3361384187101193504L, var8);
      x44.a<"v">(this, var2, 3299268175504866839L, var8);
      x44.a<"v">(this, var3, 4033047146397525428L, var8);
      x44.a<"v">(this, var4, 3369523672406081304L, var8);
   }

   public Object P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -3586182913142438467L, var2);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 139781193588919L;
      String var10000 = x44.a<"r">(-9204346116658456249L, var1);
      int var4 = 0;
      String var3 = var10000;

      label57: {
         label56: {
            try {
               var10000 = (String)x44.a<"n">(this, -9072120406507681377L, var1);
               if (var3 != null) {
                  break label57;
               }

               if (var10000 == null) {
                  break label56;
               }
            } catch (gj var7) {
               throw x44.a<"r">(var7, -7221598045641672728L, var1);
            }

            var4 ^= x44.a<"n">(this, -9072120406507681377L, var1).hashCode();
         }

         var10000 = (String)x44.a<"n">(this, -9118089979045195096L, var1);
      }

      label48: {
         label47: {
            try {
               if (var3 != null) {
                  break label48;
               }

               if (var10000 == null) {
                  break label47;
               }
            } catch (gj var6) {
               throw x44.a<"r">(var6, -7221598045641672728L, var1);
            }

            var4 ^= x44.a<"n">(this, -9118089979045195096L, var1).hashCode();
         }

         var10000 = (String)x44.a<"n">(this, -7257814032413046517L, var1);
      }

      label39: {
         label38: {
            try {
               if (var3 != null) {
                  break label39;
               }

               if (var10000 == null) {
                  break label38;
               }
            } catch (gj var5) {
               throw x44.a<"r">(var5, -7221598045641672728L, var1);
            }

            var4 ^= x44.a<"n">(this, -7257814032413046517L, var1).hashCode();
         }

         var10000 = (String)x44.a<"n">(this, -9043896035687459929L, var1);
      }

      if (var10000 != null) {
         var4 ^= x44.a<"n">(this, -9043896035687459929L, var1).hashCode();
      }

      return var4;
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
      // 000: getstatic com/zelix/_8x.a J
      // 003: ldc2_w 72042788865655
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -6448124021842722937
      // 00b: lload 2
      // 00c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: instanceof com/zelix/_8x
      // 017: aload 4
      // 019: ifnonnull 3e0
      // 01c: ifeq 3df
      // 01f: goto 02c
      // 022: ldc2_w -4825742849227468504
      // 025: lload 2
      // 026: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/_8x
      // 030: astore 5
      // 032: aload 0
      // 033: ldc2_w -6568108445994799265
      // 036: lload 2
      // 037: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 4
      // 03e: ifnonnull 095
      // 041: ifnonnull 07e
      // 044: goto 051
      // 047: ldc2_w -4825742849227468504
      // 04a: lload 2
      // 04b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: aload 5
      // 053: ldc2_w -6568108445994799265
      // 056: lload 2
      // 057: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 4
      // 05e: ifnonnull 128
      // 061: goto 06e
      // 064: ldc2_w -4825742849227468504
      // 067: lload 2
      // 068: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: ifnull 111
      // 071: goto 07e
      // 074: ldc2_w -4825742849227468504
      // 077: lload 2
      // 078: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: aload 0
      // 07f: ldc2_w -6568108445994799265
      // 082: lload 2
      // 083: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: goto 095
      // 08b: ldc2_w -4825742849227468504
      // 08e: lload 2
      // 08f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 4
      // 097: ifnonnull 0c2
      // 09a: ifnull 3d9
      // 09d: goto 0aa
      // 0a0: ldc2_w -4825742849227468504
      // 0a3: lload 2
      // 0a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 5
      // 0ac: ldc2_w -6568108445994799265
      // 0af: lload 2
      // 0b0: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: goto 0c2
      // 0b8: ldc2_w -4825742849227468504
      // 0bb: lload 2
      // 0bc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 4
      // 0c4: ifnonnull 0ee
      // 0c7: ifnull 3d9
      // 0ca: goto 0d7
      // 0cd: ldc2_w -4825742849227468504
      // 0d0: lload 2
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: ldc2_w -6568108445994799265
      // 0db: lload 2
      // 0dc: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: goto 0ee
      // 0e4: ldc2_w -4825742849227468504
      // 0e7: lload 2
      // 0e8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 4
      // 0f0: ifnonnull 128
      // 0f3: aload 5
      // 0f5: ldc2_w -6568108445994799265
      // 0f8: lload 2
      // 0f9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 101: ifeq 3d9
      // 104: goto 111
      // 107: ldc2_w -4825742849227468504
      // 10a: lload 2
      // 10b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: ldc2_w -6361835997725756312
      // 115: lload 2
      // 116: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: goto 128
      // 11e: ldc2_w -4825742849227468504
      // 121: lload 2
      // 122: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 4
      // 12a: ifnonnull 181
      // 12d: ifnonnull 16a
      // 130: goto 13d
      // 133: ldc2_w -4825742849227468504
      // 136: lload 2
      // 137: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 5
      // 13f: ldc2_w -6361835997725756312
      // 142: lload 2
      // 143: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: aload 4
      // 14a: ifnonnull 214
      // 14d: goto 15a
      // 150: ldc2_w -4825742849227468504
      // 153: lload 2
      // 154: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: ifnull 1fd
      // 15d: goto 16a
      // 160: ldc2_w -4825742849227468504
      // 163: lload 2
      // 164: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 0
      // 16b: ldc2_w -6361835997725756312
      // 16e: lload 2
      // 16f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: goto 181
      // 177: ldc2_w -4825742849227468504
      // 17a: lload 2
      // 17b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: aload 4
      // 183: ifnonnull 1ae
      // 186: ifnull 3d9
      // 189: goto 196
      // 18c: ldc2_w -4825742849227468504
      // 18f: lload 2
      // 190: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: aload 5
      // 198: ldc2_w -6361835997725756312
      // 19b: lload 2
      // 19c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: goto 1ae
      // 1a4: ldc2_w -4825742849227468504
      // 1a7: lload 2
      // 1a8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 4
      // 1b0: ifnonnull 1da
      // 1b3: ifnull 3d9
      // 1b6: goto 1c3
      // 1b9: ldc2_w -4825742849227468504
      // 1bc: lload 2
      // 1bd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: ldc2_w -6361835997725756312
      // 1c7: lload 2
      // 1c8: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: goto 1da
      // 1d0: ldc2_w -4825742849227468504
      // 1d3: lload 2
      // 1d4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: aload 4
      // 1dc: ifnonnull 214
      // 1df: aload 5
      // 1e1: ldc2_w -6361835997725756312
      // 1e4: lload 2
      // 1e5: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1ed: ifeq 3d9
      // 1f0: goto 1fd
      // 1f3: ldc2_w -4825742849227468504
      // 1f6: lload 2
      // 1f7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: aload 0
      // 1fe: ldc2_w -4789808878674382901
      // 201: lload 2
      // 202: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: goto 214
      // 20a: ldc2_w -4825742849227468504
      // 20d: lload 2
      // 20e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: aload 4
      // 216: ifnonnull 26d
      // 219: ifnonnull 256
      // 21c: goto 229
      // 21f: ldc2_w -4825742849227468504
      // 222: lload 2
      // 223: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: aload 5
      // 22b: ldc2_w -4789808878674382901
      // 22e: lload 2
      // 22f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: aload 4
      // 236: ifnonnull 300
      // 239: goto 246
      // 23c: ldc2_w -4825742849227468504
      // 23f: lload 2
      // 240: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: ifnull 2e9
      // 249: goto 256
      // 24c: ldc2_w -4825742849227468504
      // 24f: lload 2
      // 250: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: aload 0
      // 257: ldc2_w -4789808878674382901
      // 25a: lload 2
      // 25b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: goto 26d
      // 263: ldc2_w -4825742849227468504
      // 266: lload 2
      // 267: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: aload 4
      // 26f: ifnonnull 29a
      // 272: ifnull 3d9
      // 275: goto 282
      // 278: ldc2_w -4825742849227468504
      // 27b: lload 2
      // 27c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: athrow
      // 282: aload 5
      // 284: ldc2_w -4789808878674382901
      // 287: lload 2
      // 288: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: goto 29a
      // 290: ldc2_w -4825742849227468504
      // 293: lload 2
      // 294: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: athrow
      // 29a: aload 4
      // 29c: ifnonnull 2c6
      // 29f: ifnull 3d9
      // 2a2: goto 2af
      // 2a5: ldc2_w -4825742849227468504
      // 2a8: lload 2
      // 2a9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: ldc2_w -4789808878674382901
      // 2b3: lload 2
      // 2b4: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: goto 2c6
      // 2bc: ldc2_w -4825742849227468504
      // 2bf: lload 2
      // 2c0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: athrow
      // 2c6: aload 4
      // 2c8: ifnonnull 300
      // 2cb: aload 5
      // 2cd: ldc2_w -4789808878674382901
      // 2d0: lload 2
      // 2d1: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2d9: ifeq 3d9
      // 2dc: goto 2e9
      // 2df: ldc2_w -4825742849227468504
      // 2e2: lload 2
      // 2e3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: athrow
      // 2e9: aload 0
      // 2ea: ldc2_w -6575925212020460185
      // 2ed: lload 2
      // 2ee: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: goto 300
      // 2f6: ldc2_w -4825742849227468504
      // 2f9: lload 2
      // 2fa: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: athrow
      // 300: aload 4
      // 302: ifnonnull 359
      // 305: ifnonnull 342
      // 308: goto 315
      // 30b: ldc2_w -4825742849227468504
      // 30e: lload 2
      // 30f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: athrow
      // 315: aload 5
      // 317: ldc2_w -6575925212020460185
      // 31a: lload 2
      // 31b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: aload 4
      // 322: ifnonnull 359
      // 325: goto 332
      // 328: ldc2_w -4825742849227468504
      // 32b: lload 2
      // 32c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: ifnull 3d5
      // 335: goto 342
      // 338: ldc2_w -4825742849227468504
      // 33b: lload 2
      // 33c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: aload 0
      // 343: ldc2_w -6575925212020460185
      // 346: lload 2
      // 347: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: goto 359
      // 34f: ldc2_w -4825742849227468504
      // 352: lload 2
      // 353: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: athrow
      // 359: aload 4
      // 35b: ifnonnull 386
      // 35e: ifnull 3d9
      // 361: goto 36e
      // 364: ldc2_w -4825742849227468504
      // 367: lload 2
      // 368: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: athrow
      // 36e: aload 5
      // 370: ldc2_w -6575925212020460185
      // 373: lload 2
      // 374: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: goto 386
      // 37c: ldc2_w -4825742849227468504
      // 37f: lload 2
      // 380: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: aload 4
      // 388: ifnonnull 3b2
      // 38b: ifnull 3d9
      // 38e: goto 39b
      // 391: ldc2_w -4825742849227468504
      // 394: lload 2
      // 395: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39a: athrow
      // 39b: aload 0
      // 39c: ldc2_w -6575925212020460185
      // 39f: lload 2
      // 3a0: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: goto 3b2
      // 3a8: ldc2_w -4825742849227468504
      // 3ab: lload 2
      // 3ac: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: athrow
      // 3b2: aload 5
      // 3b4: ldc2_w -6575925212020460185
      // 3b7: lload 2
      // 3b8: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bd: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 3c0: aload 4
      // 3c2: ifnonnull 3d6
      // 3c5: ifeq 3d9
      // 3c8: goto 3d5
      // 3cb: ldc2_w -4825742849227468504
      // 3ce: lload 2
      // 3cf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d4: athrow
      // 3d5: bipush 1
      // 3d6: goto 3da
      // 3d9: bipush 0
      // 3da: istore 6
      // 3dc: iload 6
      // 3de: ireturn
      // 3df: bipush 0
      // 3e0: ireturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
