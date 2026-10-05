package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.LongStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l2 {
   private final Random x;
   private final _yv O;
   private Map p;
   private Map P;
   private qb k;
   private final _z3 e;
   private final _yy U;
   private sm g;
   private _f2 q;
   private final _ug A;
   private final Iterator Y;
   private final Map j;
   private es o;
   private static final long a = ess.a(-6567931229377883098L, 6276464190138834134L, MethodHandles.lookup().lookupClass()).a(94903617206385L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);
   private static final long f;

   public lu r(Object[] var1) {
      long var3 = (Long)var1[0];
      ig var2 = (ig)var1[1];
      var3 = a ^ var3;
      return (lu)x44.a<"m">(this, -1929801206626502415L, var3).get(var2);
   }

   public _yy e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -1547490683165123865L, var2);
   }

   public List C(Object[] var1) {
      ig var2 = (ig)var1[0];
      List var7 = (List)var1[1];
      _xi var5 = (_xi)var1[2];
      long var3 = (Long)var1[3];
      int var6 = (Integer)var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 25332166118196L;
      long var10 = var3 ^ 89749373610024L;
      long var12 = var3 ^ 102776939408689L;
      long var14 = (var3 ^ 134603949675318L) >>> 32;
      int var16 = (int)((var3 ^ 134603949675318L) << 32 >>> 32);
      long var17 = var3 ^ 25329813874408L;
      long var19 = var3 ^ 5460938518932L;
      long var21 = var3 ^ 13732362587817L;
      long var23 = var3 ^ 24551529231227L;
      long var25 = var3 ^ 81249952071151L;
      long var27 = var3 ^ 8700915545603L;
      long var29 = var3 ^ 101813456396683L;
      long var31 = var3 ^ 85530812356909L;
      long var33 = var3 ^ 42610774492035L;
      hy var35 = var2.Y();
      x44.a<"n">(
         x44.a<"j">(this, -6075592721766873350L, var3),
         new Object[]{
            var35,
            x44.a<"j">(this, -6131648203077677768L, var3),
            x44.a<"j">(this, -5759167870575052348L, var3),
            var31,
            var7,
            var5,
            x44.a<"j">(this, -5696663332708417392L, var3)
         },
         -6112355659845260474L,
         var3
      );
      ArrayList var36 = new ArrayList(x44.a<"n">(x44.a<"j">(this, -6075592721766873350L, var3), new Object[]{var12}, -6285052810748259785L, var3));
      _8c var37 = x44.a<"n">(var35, new Object[0], -5238366326833743500L, var3);
      Long var38 = x44.a<"n">(this, new Object[]{var2, var21}, -5465107365468360225L, var3);
      mr var39 = x44.a<"n">(x44.a<"j">(this, -6075592721766873350L, var3), new Object[]{var27}, -6276185694434425796L, var3);
      long var40 = x44.a<"n">(x44.a<"j">(this, -6075592721766873350L, var3), new Object[]{var33}, -6303294197554790829L, var3);
      long var42 = var38 ^ var40;
      int var44 = x44.a<"n">(var2, new Object[]{var17}, -5404717394751870667L, var3);
      int var10001 = var44 + 2;
      Object[] var10004 = new Object[]{null, var8};
      var10004[0] = var10001;
      x44.a<"n">(var2, var10004, -5839194039381952201L, var3);
      var36.add(new _ow(a<"p">(5242, 2944675852041039214L ^ var3), var39));
      var36.add(x44.a<"v">(var42, var37, var29, var7, -5792837151079851248L, var3));
      var36.add(_oe.E(a<"p">(688, 3819980314530986919L ^ var3)));
      te var45 = x44.a<"n">(var2, new Object[]{var23}, -6316875446608755939L, var3);
      Object[] var10006 = new Object[]{null, null, null, var6};
      var10006[2] = var10;
      var10006[1] = var45;
      var10006[0] = var44;
      var36.add(x44.a<"v">(var10006, -5682913719673653177L, var3));
      x44.a<"n">(this, new Object[]{var2, var45.T(var14, var44, var16), var19}, -5276148343333367881L, var3);
      var36.add(new _op(a<"p">(26273, 5416616853120540595L ^ var3), var25));
      return var36;
   }

   public void U(Object[] var1) {
      ig var2 = (ig)var1[0];
      lu var5 = (lu)var1[1];
      long var3 = (Long)var1[2];
      var3 = a ^ var3;
      lu var6 = x44.a<"o">(this, -7672447784180496317L, var3).put(var2, var5);
   }

   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      ig var2 = (ig)var1[1];
      int var5 = (Integer)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 139890505687224L;
      long var8 = var3 ^ 62002654283458L;
      long var10 = var3 ^ 5151088961258L;
      long var12 = var3 ^ 45001470441940L;
      long var14 = var3 ^ 12258152340165L;
      long var16 = var3 ^ 91087239731129L;
      long var18 = var3 ^ 87792559789900L;
      long var20 = var3 ^ 32950867011052L;
      long var22 = var3 ^ 67339926581514L;
      long var24 = var3 ^ 133200765101169L;
      long var26 = var3 ^ 32723797660040L;
      long var28 = var3 ^ 21790166955536L;
      long var30 = var3 ^ 51472048566509L;
      int var10000 = x44.a<"t">(-4339167462402556350L, var3);
      Object var33 = null;
      int var32 = var10000;

      label24: {
         label23: {
            label22: {
               try {
                  var39 = this;
                  if (var32 == 0) {
                     break label22;
                  }

                  if (x44.a<"h">(this, -4056855931580400215L, var3) != null) {
                     break label23;
                  }
               } catch (gj var36) {
                  throw x44.a<"t">(var36, -2515085144120877070L, var3);
               }

               var39 = this;
            }

            var33 = x44.a<"h">(var39, -2534943238118803890L, var3);
            break label24;
         }

         var33 = (_z3)x44.a<"h">(this, -2621767140062939213L, var3).get(x44.a<"h">(this, -4056855931580400215L, var3));
      }

      x44.a<"w">(this, new es(var2, true, false), -2403438398664969232L, var3);
      _yy var10001 = x44.a<"h">(this, -4180730240189500006L, var3);
      Object[] var10005 = new Object[]{null, var5};
      var10005[0] = var22;
      x44.a<"w">(this, x44.a<"l">(var10001, var10005, -4499006245522673358L, var3), -4552837329391727853L, var3);
      es var40 = x44.a<"h">(this, -2403438398664969232L, var3);
      sm var10002 = x44.a<"l">(x44.a<"h">(this, -4552837329391727853L, var3), new Object[]{var10}, -4459903457698330667L, var3);
      sm var10003 = x44.a<"l">(x44.a<"h">(this, -4552837329391727853L, var3), new Object[]{var28}, -2325575491015455293L, var3);
      long var10004 = x44.a<"l">(x44.a<"h">(this, -4552837329391727853L, var3), new Object[]{var24}, -2431233498636759948L, var3);
      Object[] var10007 = new Object[]{
         null, null, null, null, x44.a<"l">(x44.a<"h">(this, -4552837329391727853L, var3), new Object[]{var6}, -2528546243736881654L, var3)
      };
      var10007[3] = var10004;
      var10007[2] = var10003;
      var10007[1] = var10002;
      var10007[0] = var14;
      x44.a<"l">(var40, var10007, -4306481681872210623L, var3);
      es var41 = x44.a<"h">(this, -2403438398664969232L, var3);
      long var42 = (Long)x44.a<"h">(this, -4408622262909121950L, var3).next();
      Object[] var43 = new Object[]{null, var30};
      var43[0] = var42;
      x44.a<"l">(var41, var43, -4235808814536531233L, var3);
      hy var34 = var2.Y();
      x44.a<"l">(x44.a<"h">(this, -4180730240189500006L, var3), new Object[]{var34, var12, var33}, -2657683661842869602L, var3);
      x44.a<"l">(
         x44.a<"h">(this, -4180730240189500006L, var3), new Object[]{var2, var18, x44.a<"h">(this, -2403438398664969232L, var3)}, -4590882917817821297L, var3
      );
      x44.a<"l">(x44.a<"h">(this, -4180730240189500006L, var3), new Object[]{var20, var34}, -2504410317665739535L, var3);
      sm var35 = x44.a<"l">(x44.a<"h">(this, -2403438398664969232L, var3), new Object[]{var16}, -2553736437246845695L, var3);
      x44.a<"w">(
         this,
         new sm(var35, var8, x44.a<"l">(x44.a<"h">(this, -4180730240189500006L, var3), new Object[]{var26}, -4518881399038239417L, var3)),
         -2532713003168099936L,
         var3
      );
   }

   public void q(Object[] var1) {
      _f2 var2 = (_f2)var1[0];
      int var5 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      int var3 = (Integer)var1[3];
      long var6 = ((long)var5 << 56 | (long)var4 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ a;
      x44.a<"s">(this, var2, -3031169082903711755L, var6);
   }

   public Long V(Object[] var1) {
      ig var4 = (ig)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 81572697920558L;
      long var7 = x44.a<"v">(new Object[]{var5}, 8041068984993731085L, var2);
      Long var9 = x44.a<"j">(this, 8191981330448085225L, var2).put(var4, var7);
      return var7;
   }

   public long F(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 48364952095495L;
      sm var10000 = x44.a<"i">(this, -6201198431196650359L, var2);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var5;
      return x44.a<"m">(var10000, var10004, -5385608501415532419L, var2);
   }

   public Map J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -4371062701970022768L, var2);
   }

   public es R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -187068912455102414L, var2);
   }

   public Map e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"u">(x44.a<"i">(this, -2025346764269624670L, var2), -530519477898072602L, var2);
   }

   public boolean K(Object[] var1) {
      ig var2 = (ig)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return x44.a<"m">(this, -5480615182687292746L, var3).containsKey(var2);
   }

   public Long j(Object[] var1) {
      long var3 = (Long)var1[0];
      ig var2 = (ig)var1[1];
      var3 = a ^ var3;
      return (Long)x44.a<"l">(this, -7581261297878198385L, var3).get(var2);
   }

   public List A(Object[] var1) {
      te var7 = (te)var1[0];
      long var4 = (Long)var1[1];
      int var6 = (Integer)var1[2];
      wp var9 = (wp)var1[3];
      List var3 = (List)var1[4];
      _8c var2 = (_8c)var1[5];
      int var8 = (Integer)var1[6];
      var4 = a ^ var4;
      long var10 = var4 ^ 53216981326174L;
      long var10001 = var4 ^ 98746690695114L;
      int var12 = (int)((var4 ^ 98746690695114L) >>> 32);
      int var13 = (int)((var4 ^ 98746690695114L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      long var15 = var4 ^ 44133310467225L;
      long var17 = var4 ^ 113272255316575L;
      long var19 = var4 ^ 69107680594560L;
      long var21 = var4 ^ 57668480056007L;
      long var23 = var4 ^ 10300417884211L;
      long var25 = var4 ^ 19845783963042L;
      long var27 = var4 ^ 12374302553215L;
      long var29 = var4 ^ 76980833443874L;
      int var31 = 0;
      hy var32 = (hy)x44.a<"o">(var2, new Object[0], -3519706163161616134L, var4);
      int[] var33 = x44.a<"o">(x44.a<"k">(this, -3152489629808106463L, var4), new Object[]{var23}, -3390469645623456516L, var4);
      long var34 = x44.a<"o">(x44.a<"k">(this, -3522288660896521653L, var4), new Object[]{var17}, -3042648762393015488L, var4);
      Object[] var10004 = new Object[]{null, var19, var33};
      var10004[0] = var34;
      Long var36 = x44.a<"w">(var10004, -3801827086948472331L, var4);
      Long var37 = x44.a<"o">(x44.a<"k">(this, -3356863908615955800L, var4), new Object[]{var27}, -3529049748001519801L, var4);
      long var10000 = var37;
      var10004 = new Object[]{null, var19, var33};
      var10004[0] = var10000;
      Long var38 = x44.a<"w">(var10004, -3801827086948472331L, var4);
      Long var39 = (Long)x44.a<"k">(this, -3212621287838557223L, var4).next();
      sm var48 = x44.a<"k">(this, -3647094998323888101L, var4);
      var10001 = var39;
      var10004 = new Object[]{null, var21};
      var10004[0] = var10001;
      long var40 = x44.a<"o">(var48, var10004, -2971202851497135980L, var4);
      ArrayList var42 = new ArrayList();
      wp var43 = new wp();
      List var44 = x44.a<"o">(
         x44.a<"k">(this, -3152489629808106463L, var4),
         new Object[]{
            var32, var36, var38, var39, var43, var3, var2, x44.a<"k">(this, -3577692150627309175L, var4), var25, x44.a<"k">(this, -3124888091869536907L, var4)
         },
         -3518703897698407104L,
         var4
      );
      var31 += var43.C(var29);
      var42.addAll(var44);
      var42.add(_og.L(0, var12, var7, (short)var13, var8, (short)var14));
      var42.add(_oe.E(a<"p">(16630, 2371775241900793174L ^ var4)));
      Object[] var10006 = new Object[]{null, null, null, var8};
      var10006[2] = var15;
      var10006[1] = var7;
      var10006[0] = 0;
      var42.add(x44.a<"w">(var10006, -3057023206668165898L, var4));
      var42.add(new _op(a<"p">(30903, 6705453829113652502L ^ var4), var10));
      var31 += 3;
      var9.V(var31);
      return var42;
   }

   public l2(_yy var1, int var2, short var3, _z3 var4, Map var5, _yv var6, _ug var7, Random var8, char var9) {
      long var10 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var9 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 42984574970981L;
      super();
      int var10001 = a<"p">(2078, 1867616116952077838L ^ var10);
      Object[] var10004 = new Object[]{null, var12};
      var10004[0] = var10001;
      x44.a<"s">(this, x44.a<"p">(var10004, -7897430014483130923L, var10), -8556370557321574393L, var10);
      var10001 = a<"p">(27235, 58885332622963830L ^ var10);
      var10004 = new Object[]{null, var12};
      var10004[0] = var10001;
      x44.a<"s">(this, x44.a<"p">(var10004, -7897430014483130923L, var10), -7901956714392105072L, var10);
      this.U = var1;
      this.O = var6;
      this.A = var7;
      this.x = var8;
      LongStream var14 = x44.a<"h">(x44.a<"l">(this, -7621762469629564624L, var10), 1L, f, -8159842520866454952L, var10);
      this.Y = x44.a<"h">(var14, -7888887388390765572L, var10);
      this.e = var4;
      this.j = var5;
   }

   static {
      long var5 = a ^ 86860584734401L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var13 = new long[7];
      int var10 = 0;
      String var11 = "æ«\u0094\u0000SNþ\u0018¯\u0080\u0091\nÛâU?c|ÓJÑ\u0093£gú\u001dÒv³7ÀÆèL=Îlé¤*";
      int var12 = "æ«\u0094\u0000SNþ\u0018¯\u0080\u0091\nÛâU?c|ÓJÑ\u0093£gú\u001dÒv³7ÀÆèL=Îlé¤*".length();
      byte var9 = 0;

      label33:
      while (true) {
         int var10001 = var9;
         var9 += 8;
         byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
         long[] var19 = var13;
         var10001 = var10++;
         long var24 = ((long)var14[0] & 255L) << 56
            | ((long)var14[1] & 255L) << 48
            | ((long)var14[2] & 255L) << 40
            | ((long)var14[3] & 255L) << 32
            | ((long)var14[4] & 255L) << 24
            | ((long)var14[5] & 255L) << 16
            | ((long)var14[6] & 255L) << 8
            | (long)var14[7] & 255L;
         byte var28 = -1;

         while (true) {
            long var15 = var24;
            byte[] var17 = var7.doFinal(
               new byte[]{
                  (byte)((int)(var15 >>> 56)),
                  (byte)((int)(var15 >>> 48)),
                  (byte)((int)(var15 >>> 40)),
                  (byte)((int)(var15 >>> 32)),
                  (byte)((int)(var15 >>> 24)),
                  (byte)((int)(var15 >>> 16)),
                  (byte)((int)(var15 >>> 8)),
                  (byte)((int)var15)
               }
            );
            long var31 = ((long)var17[0] & 255L) << 56
               | ((long)var17[1] & 255L) << 48
               | ((long)var17[2] & 255L) << 40
               | ((long)var17[3] & 255L) << 32
               | ((long)var17[4] & 255L) << 24
               | ((long)var17[5] & 255L) << 16
               | ((long)var17[6] & 255L) << 8
               | (long)var17[7] & 255L;
            switch (var28) {
               case 0:
                  var19[var10001] = var31;
                  if (var9 >= var12) {
                     b = var13;
                     c = new Integer[7];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 8335445184558369576L;
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
                     long var27 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     byte var23 = -1;
                     f = var27;
                     return;
                  }
                  break;
               default:
                  var19[var10001] = var31;
                  if (var9 < var12) {
                     continue label33;
                  }

                  var11 = "'~K`\u0098WÓ¶°þ\u001déO\u0007;0";
                  var12 = "'~K`\u0098WÓ¶°þ\u001déO\u0007;0".length();
                  var9 = 0;
            }

            byte var22 = var9;
            var9 += 8;
            var14 = var11.substring(var22, var9).getBytes("ISO-8859-1");
            var19 = var13;
            var10001 = var10++;
            var24 = ((long)var14[0] & 255L) << 56
               | ((long)var14[1] & 255L) << 48
               | ((long)var14[2] & 255L) << 40
               | ((long)var14[3] & 255L) << 32
               | ((long)var14[4] & 255L) << 24
               | ((long)var14[5] & 255L) << 16
               | ((long)var14[6] & 255L) << 8
               | (long)var14[7] & 255L;
            var28 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 727;
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
            throw new RuntimeException("com/zelix/l2", var14);
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
         throw new RuntimeException("com/zelix/l2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
