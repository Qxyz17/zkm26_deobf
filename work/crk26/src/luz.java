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

public class luz {
   private final boolean N;
   private final String B;
   private final String D;
   private final boolean H;
   private final boolean x;
   private String b;
   private final String Y;
   private static final long a = prr.a(-6532170898996907435L, -5085382741669106104L, MethodHandles.lookup().lookupClass()).a(212566845335560L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   luz(String var1, long var2, String var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 52252764209755L;
      this(var1, var4, var5, false, null, null, false, false);
   }

   luz(String var1, String var2, long var3, boolean var5, String var6, String var7, boolean var8, boolean var9) {
      var3 = a ^ var3;
      super();
      this.B = var1;
      this.D = var2;
      this.Y = var6;
      this.H = var8;
      m44.a<"v">(this, var7, 4743616424839628709L, var3);
      this.x = var5;
      this.N = var9;
   }

   public boolean m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (m44.a<"w">(this, 4557559998930551176L, var2) != null) {
            return true;
         }
      } catch (n9 var4) {
         throw m44.a<"i">(var4, 2602044098516978265L, var2);
      }

      return false;
   }

   public String j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"q">(this, -7860232215752238983L, var2);
   }

   luz(long var1, String var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 69651634579532L;
      this(var3, "", var4, false, null, null, false, false);
   }

   public String I(Object[] param1) {
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
      // 0c: getstatic com/zelix/luz.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -5178204667098226579
      // 15: lload 2
      // 16: invokedynamic o (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: aload 4
      // 20: ifnonnull 55
      // 23: ldc2_w -5059750774053952851
      // 26: lload 2
      // 27: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: ifeq 54
      // 2f: goto 3c
      // 32: ldc2_w -6802009163308527649
      // 35: lload 2
      // 36: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: sipush 25894
      // 3f: ldc2_w 1103163317775070865
      // 42: lload 2
      // 43: lxor
      // 44: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/luz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: areturn
      // 4a: ldc2_w -6802009163308527649
      // 4d: lload 2
      // 4e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: ldc2_w -6401156281497637447
      // 58: lload 2
      // 59: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: areturn
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 92765007694557L;
      int[] var10000 = m44.a<"l">(6615799003161150366L, var1);
      int var4 = m44.a<"r">(this, 4738622388535684336L, var1).hashCode() ^ m44.a<"r">(this, 4961240730221170250L, var1).hashCode();
      int[] var3 = var10000;

      label37: {
         label36: {
            try {
               var7 = this;
               if (var3 != null) {
                  break label37;
               }

               if (m44.a<"r">(this, 6434189369344092157L, var1) == null) {
                  break label36;
               }
            } catch (n9 var6) {
               throw m44.a<"l">(var6, 4785409792146533420L, var1);
            }

            var4 ^= m44.a<"r">(this, 6434189369344092157L, var1).hashCode();
         }

         var7 = this;
      }

      try {
         byte var8 = m44.a<"r">(var7, 6501930214658621790L, var1);
         if (var3 != null) {
            return var8;
         }

         if (var8 == 0) {
            return var4;
         }
      } catch (n9 var5) {
         throw m44.a<"l">(var5, 4785409792146533420L, var1);
      }

      var4 ^= a<"f">(22980, 250841286797797761L ^ var1).hashCode();
      return var4;
   }

   String w(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      long var5 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;
      return m44.a<"t">(this, 7044987269971011509L, var5);
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, -2388034863208041495L, var2);
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
      // 000: getstatic com/zelix/luz.a J
      // 003: ldc2_w 134569779879369
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -3691786103427935094
      // 00b: lload 2
      // 00c: invokedynamic h (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: instanceof com/zelix/luz
      // 017: aload 4
      // 019: ifnonnull 259
      // 01c: ifeq 24b
      // 01f: goto 02c
      // 022: ldc2_w -3063258192123757768
      // 025: lload 2
      // 026: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/luz
      // 030: astore 6
      // 032: aload 0
      // 033: ldc2_w -2965943844046603292
      // 036: lload 2
      // 037: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 6
      // 03e: ldc2_w -2965943844046603292
      // 041: lload 2
      // 042: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04a: aload 4
      // 04c: ifnonnull 0a7
      // 04f: ifeq 099
      // 052: goto 05f
      // 055: ldc2_w -3063258192123757768
      // 058: lload 2
      // 059: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: aload 0
      // 060: ldc2_w -3184625384390796962
      // 063: lload 2
      // 064: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: aload 4
      // 06b: ifnonnull 0c5
      // 06e: goto 07b
      // 071: ldc2_w -3063258192123757768
      // 074: lload 2
      // 075: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 6
      // 07d: ldc2_w -3184625384390796962
      // 080: lload 2
      // 081: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 089: ifne 0ae
      // 08c: goto 099
      // 08f: ldc2_w -3063258192123757768
      // 092: lload 2
      // 093: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: bipush 0
      // 09a: goto 0a7
      // 09d: ldc2_w -3063258192123757768
      // 0a0: lload 2
      // 0a1: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: istore 5
      // 0a9: aload 4
      // 0ab: ifnull 246
      // 0ae: aload 0
      // 0af: ldc2_w -3576144968221134615
      // 0b2: lload 2
      // 0b3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: goto 0c5
      // 0bb: ldc2_w -3063258192123757768
      // 0be: lload 2
      // 0bf: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 4
      // 0c7: ifnonnull 11e
      // 0ca: ifnull 107
      // 0cd: goto 0da
      // 0d0: ldc2_w -3063258192123757768
      // 0d3: lload 2
      // 0d4: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 6
      // 0dc: ldc2_w -3576144968221134615
      // 0df: lload 2
      // 0e0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: aload 4
      // 0e7: ifnonnull 11e
      // 0ea: goto 0f7
      // 0ed: ldc2_w -3063258192123757768
      // 0f0: lload 2
      // 0f1: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: ifnull 1f3
      // 0fa: goto 107
      // 0fd: ldc2_w -3063258192123757768
      // 100: lload 2
      // 101: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 0
      // 108: ldc2_w -3576144968221134615
      // 10b: lload 2
      // 10c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: goto 11e
      // 114: ldc2_w -3063258192123757768
      // 117: lload 2
      // 118: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: aload 4
      // 120: ifnonnull 189
      // 123: ifnonnull 160
      // 126: goto 133
      // 129: ldc2_w -3063258192123757768
      // 12c: lload 2
      // 12d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 6
      // 135: ldc2_w -3576144968221134615
      // 138: lload 2
      // 139: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: aload 4
      // 140: ifnonnull 189
      // 143: goto 150
      // 146: ldc2_w -3063258192123757768
      // 149: lload 2
      // 14a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: ifnonnull 1f3
      // 153: goto 160
      // 156: ldc2_w -3063258192123757768
      // 159: lload 2
      // 15a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 0
      // 161: aload 4
      // 163: ifnonnull 209
      // 166: goto 173
      // 169: ldc2_w -3063258192123757768
      // 16c: lload 2
      // 16d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: ldc2_w -3576144968221134615
      // 176: lload 2
      // 177: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: goto 189
      // 17f: ldc2_w -3063258192123757768
      // 182: lload 2
      // 183: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: ifnull 1fb
      // 18c: aload 6
      // 18e: aload 4
      // 190: ifnonnull 209
      // 193: goto 1a0
      // 196: ldc2_w -3063258192123757768
      // 199: lload 2
      // 19a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: ldc2_w -3576144968221134615
      // 1a3: lload 2
      // 1a4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: ifnull 1fb
      // 1ac: goto 1b9
      // 1af: ldc2_w -3063258192123757768
      // 1b2: lload 2
      // 1b3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: ldc2_w -3576144968221134615
      // 1bd: lload 2
      // 1be: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: aload 6
      // 1c5: ldc2_w -3576144968221134615
      // 1c8: lload 2
      // 1c9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d1: aload 4
      // 1d3: ifnonnull 212
      // 1d6: goto 1e3
      // 1d9: ldc2_w -3063258192123757768
      // 1dc: lload 2
      // 1dd: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: ifne 1fb
      // 1e6: goto 1f3
      // 1e9: ldc2_w -3063258192123757768
      // 1ec: lload 2
      // 1ed: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: bipush 0
      // 1f4: istore 5
      // 1f6: aload 4
      // 1f8: ifnull 246
      // 1fb: aload 0
      // 1fc: goto 209
      // 1ff: ldc2_w -3063258192123757768
      // 202: lload 2
      // 203: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: ldc2_w -3661618732781611446
      // 20c: lload 2
      // 20d: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: aload 4
      // 214: ifnonnull 240
      // 217: aload 6
      // 219: ldc2_w -3661618732781611446
      // 21c: lload 2
      // 21d: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: if_icmpne 243
      // 225: goto 232
      // 228: ldc2_w -3063258192123757768
      // 22b: lload 2
      // 22c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: bipush 1
      // 233: goto 240
      // 236: ldc2_w -3063258192123757768
      // 239: lload 2
      // 23a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: goto 244
      // 243: bipush 0
      // 244: istore 5
      // 246: aload 4
      // 248: ifnull 25b
      // 24b: bipush 0
      // 24c: goto 259
      // 24f: ldc2_w -3063258192123757768
      // 252: lload 2
      // 253: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: istore 5
      // 25b: iload 5
      // 25d: ireturn
   }

   String X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"q">(this, -517383968507312538L, var2);
   }

   public boolean Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (m44.a<"p">(this, -301501903887139423L, var2) != null) {
            return true;
         }
      } catch (n9 var4) {
         throw m44.a<"n">(var4, -2187831919876616218L, var2);
      }

      return false;
   }

   public boolean E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"p">(this, -3915584977247087924L, var2);
   }

   boolean U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"t">(this, 7820767727925549300L, var2);
   }

   public final String Y(Object[] param1) {
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
      // 0c: getstatic com/zelix/luz.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 58342855729395
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: new java/lang/StringBuilder
      // 1e: dup
      // 1f: invokespecial java/lang/StringBuilder.<init> ()V
      // 22: astore 7
      // 24: ldc2_w 4882031671525628814
      // 27: lload 2
      // 28: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 7
      // 2f: aload 0
      // 30: ldc2_w 6472385288102606048
      // 33: lload 2
      // 34: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c: pop
      // 3d: astore 6
      // 3f: aload 6
      // 41: ifnonnull ef
      // 44: aload 0
      // 45: lload 4
      // 47: bipush 1
      // 48: anewarray 63
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w 6803078244888664509
      // 57: lload 2
      // 58: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: ifne c8
      // 60: goto 6d
      // 63: ldc2_w 6519328858588705852
      // 66: lload 2
      // 67: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: ldc2_w 6686053229030561370
      // 71: lload 2
      // 72: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: aload 6
      // 79: ifnonnull fc
      // 7c: goto 89
      // 7f: ldc2_w 6519328858588705852
      // 82: lload 2
      // 83: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: ifnull f7
      // 8c: goto 99
      // 8f: ldc2_w 6519328858588705852
      // 92: lload 2
      // 93: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 0
      // 9a: ldc2_w 6686053229030561370
      // 9d: lload 2
      // 9e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: aload 6
      // a5: ifnonnull fc
      // a8: goto b5
      // ab: ldc2_w 6519328858588705852
      // ae: lload 2
      // af: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: invokevirtual java/lang/String.length ()I
      // b8: ifle f7
      // bb: goto c8
      // be: ldc2_w 6519328858588705852
      // c1: lload 2
      // c2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 7
      // ca: getstatic com/zelix/luz.f J
      // cd: l2i
      // ce: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // d1: pop
      // d2: aload 7
      // d4: aload 0
      // d5: ldc2_w 6686053229030561370
      // d8: lload 2
      // d9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e1: pop
      // e2: goto ef
      // e5: ldc2_w 6519328858588705852
      // e8: lload 2
      // e9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ee: athrow
      // ef: aload 7
      // f1: ldc ")"
      // f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // f6: pop
      // f7: aload 7
      // f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // fc: areturn
   }

   static {
      long var5 = a ^ 125150796346515L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "V\u0013eqerrbl§×\u00871èà8T×\u009e\u0099\u0081å£\u009b\u0097\u008bA\u0016\u0086@+)\\C\u0001^5\u0083\u0097 (còOÃ¢ß ´Óå\u0091YÝÍ\t\u0099\u008d\u0094.ö\u0092\u0003Óü\u009b\u0094^}×\u0097ü¿çÚ×\u001c\u0091^\u0087=";
      int var13 = "V\u0013eqerrbl§×\u00871èà8T×\u009e\u0099\u0081å£\u009b\u0097\u008bA\u0016\u0086@+)\\C\u0001^5\u0083\u0097 (còOÃ¢ß ´Óå\u0091YÝÍ\t\u0099\u008d\u0094.ö\u0092\u0003Óü\u009b\u0094^}×\u0097ü¿çÚ×\u001c\u0091^\u0087="
         .length();
      char var10 = '(';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            c = var14;
            d = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -2348983617381494704L;
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
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            f = var23;
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9231;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/luz", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/luz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
