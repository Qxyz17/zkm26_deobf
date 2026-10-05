package com.zelix;

import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
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
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class s6 extends s7 {
   static String[] d;
   JEditorPane B;
   private static final long a = ess.a(-850373155964697741L, -885316763939066584L, MethodHandles.lookup().lookupClass()).a(277708794822986L);
   private static final String[] m;
   private static final String[] n;
   private static final Map o = new HashMap(13);
   private static final long[] A;
   private static final Integer[] C;
   private static final Map E;

   public s6(JFrame var1, String var2, long var3, String var5, BufferedReader var6, boolean var7, boolean var8, boolean var9) {
      var3 = a ^ var3;
      long var10001 = var3 ^ 21286481386674L;
      int var10 = (int)((var3 ^ 21286481386674L) >>> 32);
      int var11 = (int)((var3 ^ 21286481386674L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      this(var1, var2, var5, var6, var10, var7, (char)var11, var8, true, null, var12);
   }

   public s6(JFrame var1, String var2, String var3, BufferedReader var4, int var5, boolean var6, char var7, boolean var8, boolean var9, eq var10, int var11) {
      long var12 = ((long)var5 << 32 | (long)var7 << 48 >>> 32 | (long)var11 << 48 >>> 48) ^ a;
      long var10001 = var12 ^ 14654788618716L;
      int var14 = (int)((var12 ^ 14654788618716L) >>> 48);
      int var15 = (int)((var12 ^ 14654788618716L) << 16 >>> 48);
      int var16 = (int)(var10001 << 32 >>> 32);
      super(var1, var2, var3, (short)var14, var4, var6, var8, (short)var15, var16, var9);
   }

   public s6(JFrame var1, String var2, String var3, BufferedReader var4, boolean var5, long var6, boolean var8) {
      var6 = a ^ var6;
      long var9 = var6 ^ 119312535654256L;
      this(var1, var2, var9, var3, var4, var5, var8, true);
   }

   protected void e(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 64009925116695L;
      long var6 = var2 ^ 94634866201160L;
      long var8 = var2 ^ 125672976716396L;
      long var10 = var2 ^ 80171386674689L;
      long var12 = var2 ^ 127086144951120L;
      Dimension var14 = x44.a<"l">(x44.a<"t">(-6986201662714524323L, var2), -8961167422694866879L, var2);
      Container var15 = x44.a<"l">(this, -8755325737436054691L, var2);
      x44.a<"w">(this, new _s4(var6, var15), -7183631372642156506L, var2);
      x44.a<"l">(var15, x44.a<"h">(this, -7183631372642156506L, var2), -7195544812959005908L, var2);
      x44.a<"w">(this, new JLabel(), -6966787808045415403L, var2);
      x44.a<"l">(var15, x44.a<"h">(this, -6966787808045415403L, var2), c<"q">(14539, 9057166203351348966L ^ var2), -6970211715214576325L, var2);
      JPanel var16 = new JPanel();
      x44.a<"l">(
         var16, new so(1, f<"c">(3465, 4387565620971323705L ^ var2), false, f<"c">(2415, 5529918805632239064L ^ var2), var8), -7288333475486617504L, var2
      );
      x44.a<"l">(var15, var16, c<"q">(14327, 5072999547291023823L ^ var2), -6970211715214576325L, var2);
      x44.a<"w">(this, new JTextArea(), -8857106709324582969L, var2);
      x44.a<"l">(var16, new uo(x44.a<"h">(this, -8857106709324582969L, var2), var4), c<"q">(11699, 3271565525314970506L ^ var2), -7128263262541402547L, var2);
      x44.a<"w">(this, new JEditorPane(), -9221588954914949510L, var2);
      x44.a<"l">(x44.a<"h">(this, -9221588954914949510L, var2), false, -7405932938063264399L, var2);

      try {
         x44.a<"l">(
            x44.a<"h">(this, -9221588954914949510L, var2),
            x44.a<"t">(new Object[]{c<"q">(24580, 5917680222357417514L ^ var2), var12}, -6979890137975154857L, var2),
            -8807121232864550502L,
            var2
         );
      } catch (IOException var20) {
         x44.a<"l">(
            x44.a<"h">(this, -9221588954914949510L, var2),
            x44.a<"l">(var20, -8723172887453430092L, var2) + c<"q">(31558, 6493070131228472686L ^ var2) + c<"q">(1035, 5120620230944295472L ^ var2),
            -7106505410075263123L,
            var2
         );
      }

      x44.a<"l">(var16, new uo(x44.a<"h">(this, -9221588954914949510L, var2), var4), c<"q">(10781, 316497389450437681L ^ var2), -7128263262541402547L, var2);
      x44.a<"w">(this, new JButton(c<"q">(22456, 3475471090418932121L ^ var2)), -7395187339492062387L, var2);
      x44.a<"l">(var15, x44.a<"h">(this, -7395187339492062387L, var2), c<"q">(23351, 2451795699145299218L ^ var2), -6970211715214576325L, var2);
      r3 var17 = new r3(this);
      x44.a<"l">(this, var17, -9002205031223052054L, var2);
      ud var18 = new ud(this);
      x44.a<"l">(x44.a<"h">(this, -7395187339492062387L, var2), var18, -7072459325258913403L, var2);
      x44.a<"l">(x44.a<"h">(this, -8857106709324582969L, var2), var18, -9057529141710331521L, var2);
      _yw var19 = new _yw(this);
      x44.a<"l">(x44.a<"h">(this, -7395187339492062387L, var2), var19, -7172737514000818722L, var2);
      x44.a<"l">(x44.a<"h">(this, -9221588954914949510L, var2), new lk(this), -9009832682195824565L, var2);
      x44.a<"l">(x44.a<"h">(this, -7183631372642156506L, var2), new Object[]{x44.a<"m">(-7206967223493459098L, var2), var10}, -8696855847334329624L, var2);
      x44.a<"l">(
         this,
         x44.a<"t">(f<"c">(26114, 8298070460776295092L ^ var2), x44.a<"h">(var14, -8652893162589618342L, var2), -7485249611185485026L, var2),
         x44.a<"t">(f<"c">(30121, 2516782942934907165L ^ var2), x44.a<"h">(var14, -8870463851237477896L, var2), -7485249611185485026L, var2),
         -7277161446573860437L,
         var2
      );
   }

   static {
      long var20 = a ^ 31799459724996L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[19];
      int var16 = 0;
      String var15 = "¹ÒB\u008c\nÛÑêð\u0092áVé/aàH\u0098Þ&ÂM©\u000eÇ\u0098á¶{l\u0004®@É\u0003»Q\u001f%r½c\u009d´k\u001eXôt¦¿Q³<ñÎ\u0010z\u0019øï\u0003ÃN\u000f»G\u0013{³\u008b¡è0Â}V*'©òÑ3mñ¿j!)\u0007\u0092*Õ\b\u000bdbÂ¦µr\u0092o\n¿&ÅÀ\u0003\u0096¤Ôt\u000e\u001dr?\u0085¹RÁ\u0086@[v[\u009ct=Y¥\u0001!\u009a³\u0013\u0081Ë\u0097ÔÞÕß %«9>2ã]sßÔJÌ\u0098¸¢ÿ\u009e;\u000bG\u009fúü\u00ad¤\ni\u0088~¿\u0019G§%è\u0004&ï.ºCÞ§\u0010³ÂÓpt\u0096\u008bh+y×³XÁÞn\u0018OU¥òöEÐìjßçH\r\"÷¿\u0084×ö¨ø%\u0005\u0088`Ä\u0091Å\u008bµÔoc(z\u0082!úêÒO\u008f·ÙX^Ð\u000eµ2A\u0011k\u000e8ÀVÖÞN9{§×`\u001d ÿÿý\u0012§Åzi|:\u0096~,\u008bD4ÔÖ3\u0002J/Uwñ\u000f½,°\u0005s'\u0083 Ì´×<¢èÅ\u009fCjó8ÑbxOh\u0094\u0017E\u0010V¶¥©è&ùßÕSÑ:u\u009c_®\u0010\u001f|Ð'\u008cöU\u0096\u0005b«¾Ò,hUH\u0012\u000býoè3ìChlV\u000f\u008aÂ\u008a9#\u008bJ0\u0092Ð°\u0014@½'ã\u000etºÕy\u0084òY\u0015ô¨Í\u009c\u009aY±¼\u00adñ\u0086+@\u0094ïXB\u0093Ý\u00861U\u0002\u009eÑµO×=Ò7aÂ\u0010f(§\u0004£@\u0001Ú¿\u0091õ\u0099Ñ\u008a¬ÉËí\u0017îDò¬\u009fa1¹;cé\u001d\u009eÓ5î\\Â\u00ad@¶\u0097-@~iï\u0094×Çï|Ù\u0014í:\u009b®Á®ÿ¡\b×\u0087\u008a_½\u0016è³mz·osPAßBdu-\f9ð Ê]iùây\u0088e¥íoÿ°ÓH\u0019\n\u008bäe;\u0010fï\u00ad\u0092\u008dALÈ\u001c\u0015\u0004îaÜ]3@P¢O\u0088\u0017þvÌ\u0093\u008f§sC|¶G8\u008dÈ\u00ad\u0013 Ì\u0099(\u0093\u0082\u0002m´\u008c3R9q\n\r5\u00adrhmA7M»9gnÛì\"Ï\u0080(\u0096éA~KKN\u008c:\u0018\u000eÚêÊÖrûäAþ\u009fÁK¹\n\u0081¼Æ¾?«n\u001f£0wÝ|\u0095\u000b&>tni'\u0000\u0017rV÷3\u0014\nÇÛ+Å+úÙ¹J/{\u0082Î!*y3\u0017úÛëú\u0011¶\u009aAÊ«Ù Ö/\u001f¢¯·j!_¸\u0003oº²\u000b¾\rgY½%\\eã\u0013Ê§ÂÒ£dU";
      int var17 = "¹ÒB\u008c\nÛÑêð\u0092áVé/aàH\u0098Þ&ÂM©\u000eÇ\u0098á¶{l\u0004®@É\u0003»Q\u001f%r½c\u009d´k\u001eXôt¦¿Q³<ñÎ\u0010z\u0019øï\u0003ÃN\u000f»G\u0013{³\u008b¡è0Â}V*'©òÑ3mñ¿j!)\u0007\u0092*Õ\b\u000bdbÂ¦µr\u0092o\n¿&ÅÀ\u0003\u0096¤Ôt\u000e\u001dr?\u0085¹RÁ\u0086@[v[\u009ct=Y¥\u0001!\u009a³\u0013\u0081Ë\u0097ÔÞÕß %«9>2ã]sßÔJÌ\u0098¸¢ÿ\u009e;\u000bG\u009fúü\u00ad¤\ni\u0088~¿\u0019G§%è\u0004&ï.ºCÞ§\u0010³ÂÓpt\u0096\u008bh+y×³XÁÞn\u0018OU¥òöEÐìjßçH\r\"÷¿\u0084×ö¨ø%\u0005\u0088`Ä\u0091Å\u008bµÔoc(z\u0082!úêÒO\u008f·ÙX^Ð\u000eµ2A\u0011k\u000e8ÀVÖÞN9{§×`\u001d ÿÿý\u0012§Åzi|:\u0096~,\u008bD4ÔÖ3\u0002J/Uwñ\u000f½,°\u0005s'\u0083 Ì´×<¢èÅ\u009fCjó8ÑbxOh\u0094\u0017E\u0010V¶¥©è&ùßÕSÑ:u\u009c_®\u0010\u001f|Ð'\u008cöU\u0096\u0005b«¾Ò,hUH\u0012\u000býoè3ìChlV\u000f\u008aÂ\u008a9#\u008bJ0\u0092Ð°\u0014@½'ã\u000etºÕy\u0084òY\u0015ô¨Í\u009c\u009aY±¼\u00adñ\u0086+@\u0094ïXB\u0093Ý\u00861U\u0002\u009eÑµO×=Ò7aÂ\u0010f(§\u0004£@\u0001Ú¿\u0091õ\u0099Ñ\u008a¬ÉËí\u0017îDò¬\u009fa1¹;cé\u001d\u009eÓ5î\\Â\u00ad@¶\u0097-@~iï\u0094×Çï|Ù\u0014í:\u009b®Á®ÿ¡\b×\u0087\u008a_½\u0016è³mz·osPAßBdu-\f9ð Ê]iùây\u0088e¥íoÿ°ÓH\u0019\n\u008bäe;\u0010fï\u00ad\u0092\u008dALÈ\u001c\u0015\u0004îaÜ]3@P¢O\u0088\u0017þvÌ\u0093\u008f§sC|¶G8\u008dÈ\u00ad\u0013 Ì\u0099(\u0093\u0082\u0002m´\u008c3R9q\n\r5\u00adrhmA7M»9gnÛì\"Ï\u0080(\u0096éA~KKN\u008c:\u0018\u000eÚêÊÖrûäAþ\u009fÁK¹\n\u0081¼Æ¾?«n\u001f£0wÝ|\u0095\u000b&>tni'\u0000\u0017rV÷3\u0014\nÇÛ+Å+úÙ¹J/{\u0082Î!*y3\u0017úÛëú\u0011¶\u009aAÊ«Ù Ö/\u001f¢¯·j!_¸\u0003oº²\u000b¾\rgY½%\\eã\u0013Ê§ÂÒ£dU"
         .length();
      char var14 = '8';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = d(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     m = var18;
                     n = new String[19];
                     E = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "LìÎ\u0010§zf\u007f\u000e\u0084NÓ\u001aE\u009cd\u0093H3\u0013ÜV°/l8Õvz§\"\u0014ûó'ÚH\u0087kdÒqüx¬Â\\\u0011%\\{¬ÿ\u001b\u0000\u001d";
                     int var5 = "LìÎ\u0010§zf\u007f\u000e\u0084NÓ\u001aE\u009cd\u0093H3\u0013ÜV°/l8Õvz§\"\u0014ûó'ÚH\u0087kdÒqüx¬Â\\\u0011%\\{¬ÿ\u001b\u0000\u001d"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var41 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var41;
                           byte[] var10 = var0.doFinal(
                              new byte[]{
                                 (byte)((int)(var8 >>> 56)),
                                 (byte)((int)(var8 >>> 48)),
                                 (byte)((int)(var8 >>> 40)),
                                 (byte)((int)(var8 >>> 32)),
                                 (byte)((int)(var8 >>> 24)),
                                 (byte)((int)(var8 >>> 16)),
                                 (byte)((int)(var8 >>> 8)),
                                 (byte)((int)var8)
                              }
                           );
                           long var46 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var28[var10001] = var46;
                                 if (var2 >= var5) {
                                    A = var6;
                                    C = new Integer[9];
                                    String[] var29 = new String[f<"c">(16094, 1463203908644888092L ^ var20)];
                                    var29[0] = c<"q">(11217, 388438180398074247L ^ var20);
                                    var29[1] = c<"q">(32414, 3455062196421221581L ^ var20);
                                    var29[2] = c<"q">(17959, 5729266140709446781L ^ var20);
                                    var29[3] = c<"q">(925, 211686804971233731L ^ var20);
                                    var29[4] = c<"q">(12924, 1079991985661612073L ^ var20);
                                    var29[5] = c<"q">(13063, 449067343590003036L ^ var20);
                                    var29[f<"c">(24739, 8174948130759049319L ^ var20)] = c<"q">(21087, 7001194245124550663L ^ var20);
                                    var29[f<"c">(25995, 4849659233193985350L ^ var20)] = c<"q">(21329, 2075117150745489664L ^ var20);
                                    var29[f<"c">(19550, 5814391053398781085L ^ var20)] = c<"q">(10443, 4326628536891804313L ^ var20);
                                    var29[f<"c">(24105, 797818320536289001L ^ var20)] = c<"q">(3373, 1578317430064689018L ^ var20);
                                    x44.a<"t">(var29, -5221081830028660969L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "-\u001c\u0018Ø\u0005%^s\u001a!à\u000f\u0083\u0080+ù";
                                 var5 = "-\u001c\u0018Ø\u0005%^s\u001a!à\u000f\u0083\u0080+ù".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var41 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "$\u0094\u000f\u0010\u00905\u0093\u0092üÀKí\u0087·´¡\u0003|G\u001d²3\u00881\u0010]\u001c®YÆ\u0097ê\u0098Trù\u000f*´·p";
                  var17 = "$\u0094\u000f\u0010\u00905\u0093\u0092üÀKí\u0087·´¡\u0003|G\u001d²3\u00881\u0010]\u001c®YÆ\u0097ê\u0098Trù\u000f*´·p".length();
                  var14 = 24;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1910;
      if (n[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])o.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/s6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = m[var5].getBytes("ISO-8859-1");
         n[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return n[var5];
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
         throw new RuntimeException("com/zelix/s6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int f(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17899;
      if (C[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/s6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/s6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
