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
import javax.swing.JFrame;

public class ue extends uj {
   eu h;
   e8 g;
   en o;
   private static final long c = ess.a(-410146103357199724L, -8844037251714209346L, MethodHandles.lookup().lookupClass()).a(40739818359249L);
   private static final String[] d;
   private static final String[] j;
   private static final Map k = new HashMap(13);

   protected final void R(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 19307919075270
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w -8642576093970008683
      // 018: lload 2
      // 019: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: astore 6
      // 020: aload 0
      // 021: ldc2_w -7517849078236852709
      // 024: lload 2
      // 025: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: bipush 1
      // 02b: aload 6
      // 02d: ifnull 094
      // 030: if_icmpne 07c
      // 033: goto 040
      // 036: ldc2_w -7938819084988603603
      // 039: lload 2
      // 03a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: athrow
      // 040: sipush 21755
      // 043: ldc2_w 6291154318575812834
      // 046: lload 2
      // 047: lxor
      // 048: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/ue.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: lload 4
      // 04f: bipush 2
      // 050: anewarray 71
      // 053: dup_x2
      // 054: dup_x2
      // 055: pop
      // 056: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059: bipush 1
      // 05a: swap
      // 05b: aastore
      // 05c: dup_x1
      // 05d: swap
      // 05e: bipush 0
      // 05f: swap
      // 060: aastore
      // 061: ldc2_w -7554726856480850332
      // 064: lload 2
      // 065: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 6
      // 06c: ifnonnull 13d
      // 06f: goto 07c
      // 072: ldc2_w -7938819084988603603
      // 075: lload 2
      // 076: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: aload 0
      // 07d: ldc2_w -7517849078236852709
      // 080: lload 2
      // 081: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: bipush 2
      // 087: goto 094
      // 08a: ldc2_w -7938819084988603603
      // 08d: lload 2
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: ifle 103
      // 09a: aload 6
      // 09c: ifnull 103
      // 09f: if_icmpne 0eb
      // 0a2: goto 0af
      // 0a5: ldc2_w -7938819084988603603
      // 0a8: lload 2
      // 0a9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: sipush 28522
      // 0b2: ldc2_w 5651449025165818742
      // 0b5: lload 2
      // 0b6: lxor
      // 0b7: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/ue.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: lload 4
      // 0be: bipush 2
      // 0bf: anewarray 71
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 1
      // 0c9: swap
      // 0ca: aastore
      // 0cb: dup_x1
      // 0cc: swap
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: ldc2_w -7554726856480850332
      // 0d3: lload 2
      // 0d4: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: aload 6
      // 0db: ifnonnull 13d
      // 0de: goto 0eb
      // 0e1: ldc2_w -7938819084988603603
      // 0e4: lload 2
      // 0e5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: ldc2_w -7517849078236852709
      // 0ef: lload 2
      // 0f0: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: bipush 3
      // 0f6: goto 103
      // 0f9: ldc2_w -7938819084988603603
      // 0fc: lload 2
      // 0fd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: if_icmpne 13d
      // 106: sipush 5166
      // 109: ldc2_w 3439575594242080817
      // 10c: lload 2
      // 10d: lxor
      // 10e: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/ue.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: lload 4
      // 115: bipush 2
      // 116: anewarray 71
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 1
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 0
      // 125: swap
      // 126: aastore
      // 127: ldc2_w -7554726856480850332
      // 12a: lload 2
      // 12b: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: goto 13d
      // 133: ldc2_w -7938819084988603603
      // 136: lload 2
      // 137: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: return
   }

   void S(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 36471657904402L;
      long var6 = var2 ^ 48228935404460L;
      long var8 = var2 ^ 102536132256420L;
      long var10 = var2 ^ 120409143990423L;

      ue var10000;
      en var10001;
      en var10002;
      ue var10003;
      pn var10004;
      boolean var10005;
      label22: {
         try {
            var10000 = this;
            var10001 = new en;
            var10002 = var10001;
            var10003 = this;
            var10004 = x44.a<"l">(this, -5402679116386116631L, var2);
            if (x44.a<"l">(this, -6141178301222292618L, var2) == 1) {
               var10005 = true;
               break label22;
            }
         } catch (gj var16) {
            throw x44.a<"p">(var16, -5999149992028758464L, var2);
         }

         var10005 = false;
      }

      var10002./* $VF: Unable to resugar constructor */<init>(var10003, var10004, var10, var10005, x44.a<"l">(this, -6141178301222292618L, var2));
      x44.a<"s">(var10000, var10001, -5774810021546112954L, var2);
      var10004 = x44.a<"l">(this, -5402679116386116631L, var2);
      var10005 = x44.a<"l">(this, -6141178301222292618L, var2) != 3;
      int var12 = x44.a<"l">(this, -6141178301222292618L, var2);
      boolean var13 = var10005;
      pn var14 = var10004;
      x44.a<"s">(this, new ez(var6, this, var14, var13, var12), -5840925002342986382L, var2);
      x44.a<"s">(
         this, new eu(this, x44.a<"l">(this, -5402679116386116631L, var2), var8, x44.a<"l">(this, -6141178301222292618L, var2)), -5931570990530621673L, var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"t">(22643, 8067975990518575363L ^ var2),
         null,
         x44.a<"l">(this, -5774810021546112954L, var2),
         x44.a<"p">(new Object[]{c<"t">(2119, 7755453179064951100L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"t">(8434, 8911340782211107205L ^ var2),
         null,
         x44.a<"l">(this, -5840925002342986382L, var2),
         x44.a<"p">(new Object[]{c<"t">(32074, 7047099606081786937L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"t">(23007, 8839117969919897769L ^ var2),
         null,
         x44.a<"l">(this, -5931570990530621673L, var2),
         x44.a<"p">(new Object[]{c<"t">(1882, 762187857243221551L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(x44.a<"l">(this, -5828574482245427290L, var2), x44.a<"l">(this, -5931570990530621673L, var2), -5491807491691095246L, var2);
   }

   public ue(JFrame var1, String var2, pn var3, int var4, long var5, eq var7, char var8) {
      long var9 = (var5 << 16 | (long)var8 << 48 >>> 48) ^ c;
      long var11 = var9 ^ 94489268989042L;
      super(var1, var11, var2, var3, var4, var7);
   }

   static {
      long var0 = c ^ 120223083337975L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = " £ÛÈ\u008aN\u0004\u0091µ4\u000f\u0090È×hY\u0085Ë\u000evôL³Ú*}$'çÊ«bØg\u0082M\u009bå\u0094îwð²|ã.\u0087t\u0010$EÈ Ô\u008cÙ;\u0093}\u009d\u0012r½vþ\u0010\u009cB\u008a\u0082xí\u007f\u0016ê.2Ô\u0012\u0088ßi(\\\u0085\f-³\u0005*\u0088\u009e\u000e/º\u0000Ü\u0000RSR\u0010Aìù£f\u008eì¸Çïò*¨ü\u009cS\u008dMpÍ\u0003(wß4Å\u0003õÆø7\bó4\u001dÛð\u008a&\u0082Cþ\u001e-Íý\u0091\u001bÃZ\u009fáù¸_Ä\u008d\u007fc\u0090\t\u0091\u0010®bÛÌuÅÐEêùz\u001d#\u009f¿z(\u001fBÛ\u0002\u0017!Õ#»¶}þD\r\u009e\u009e/\u0090+¡Ñì`Ë\u0013:\u0086\u0094\u0087\u0082\u0018ò·:ØO}~ R";
      int var8 = " £ÛÈ\u008aN\u0004\u0091µ4\u000f\u0090È×hY\u0085Ë\u000evôL³Ú*}$'çÊ«bØg\u0082M\u009bå\u0094îwð²|ã.\u0087t\u0010$EÈ Ô\u008cÙ;\u0093}\u009d\u0012r½vþ\u0010\u009cB\u008a\u0082xí\u007f\u0016ê.2Ô\u0012\u0088ßi(\\\u0085\f-³\u0005*\u0088\u009e\u000e/º\u0000Ü\u0000RSR\u0010Aìù£f\u008eì¸Çïò*¨ü\u009cS\u008dMpÍ\u0003(wß4Å\u0003õÆø7\bó4\u001dÛð\u008a&\u0082Cþ\u001e-Íý\u0091\u001bÃZ\u009fáù¸_Ä\u008d\u007fc\u0090\t\u0091\u0010®bÛÌuÅÐEêùz\u001d#\u009f¿z(\u001fBÛ\u0002\u0017!Õ#»¶}þD\r\u009e\u009e/\u0090+¡Ñì`Ë\u0013:\u0086\u0094\u0087\u0082\u0018ò·:ØO}~ R"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     j = new String[9];
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

                  var6 = "ìÁî\u0012Ïû\u008d\u0007Å\u0088>Llø\r»@M\u000e¶Ã7õñnÜ®vy\u0003§BÕþ\u001aUeq±>í\n \u009d\u000f\u000e\u0086B£TLÁ¹C!¢¨¥ôWZ\u001a#\u001b®lú\n\u0010»\u009f}ZÑÛÄ»\u009aÈÇ\u001e";
                  var8 = "ìÁî\u0012Ïû\u008d\u0007Å\u0088>Llø\r»@M\u000e¶Ã7õñnÜ®vy\u0003§BÕþ\u001aUeq±>í\n \u009d\u000f\u000e\u0086B£TLÁ¹C!¢¨¥ôWZ\u001a#\u001b®lú\n\u0010»\u009f}ZÑÛÄ»\u009aÈÇ\u001e"
                     .length();
                  var5 = 16;
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

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2120;
      if (j[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ue", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         j[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return j[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ue" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
