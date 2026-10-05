package com.zelix;

import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class s7 extends s9 {
   public JButton D;
   static Vector S;
   protected eq J;
   static String[] c;
   private static final long e = ess.a(-2682883948275426743L, 3320264180311232504L, MethodHandles.lookup().lookupClass()).a(98149737404202L);
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);
   private static final long[] s;
   private static final Integer[] t;
   private static final Map z;

   static {
      long var20 = e ^ 113996650377300L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[14];
      int var16 = 0;
      String var15 = "á\u009e\u0093\u0004ÓDü[´=`\u0081\u0094\u0007¢âMmË¸G&\u0015ðÀ½\u0004ÏÀÙ4\tõ|\n«Ðt\u000f\u0090M\u0018nD4\u009ev\u0090\u0010ò\\\u0096ª\u009b\u0085\\¸Ã1J\u000f\u0092óo>\u0010\u008b&UÒ.T¹µ(H7fkcÍ\u00ad \u0013|WBü\u001eÉóá\u009b¶\u00029ÌÎ>\u0018\u007føÛ\u009e\\\u0096\u000f\u008e¸ÅQj\u0005O\b@ªùìì\u009d´I8Î²\u000fð1Ä\u000ek®g°\u0092cë¤Â3¬¥nD\u001e*Ó]Ð#È{V\u008f\u001f\u0089!RwÎÉÐ'\\iê»M\u00960£<ª#µëDMÖ@-°8\u0091éuk\u001bó\u0018\u0099z)!j\u0084ø\u009eì¹\u0018H4×éÓ\u000b$Ü\u008eÁÿê¡¾:À^·\u0098ÙTwkF\u0096>{UFNÕÙ¶cm\u0085\u001bð\u0014¯´b|\u0010NÞY0áêDÖ¢\u0004^\u0094!1Å\nXÉ-\u0011¥\u0094\u009eA@Ë,õ³¼Kbà\u0091Òy\u0092\u0097Ìï@\u008f4ÜQ\u0005M\u0017ï\u0099\u0092\u0010.¼è?\u0084Å¸\u00adëø\u0085[\u009d\u0089¢\u009a\u0080Êõ]][[§\u001eñ6\u009dú²ã\\P¶5¯tPgêXDã\u0094\u0005'½Éf\u0011v@ä(:´\u0012!¾}1{iR\u0093\u009a9cq\u008d\u0082ÝëH4û¨¸ªõ\n9\u007fp\u0015ÓÄ:Ë\u008f1£\u001e/(\u0099ú þP?\u0006ÌxÅ÷ªÅ`\u009a\u0018d6xXÂ´\"È\u008c\u0005\u0096èJóEÒgj\u008b#\u001c`¼òH¤6l½º³N{öb\u0000cv\u0003Tâ°~³ý\u009d\"MVî(×m\u0018Ë0sÊ\u0082\u0082°îäfÉ\u009e\u0080§µÞÚf\u0092î$\fãÇ© ÿ\u009c~ûVu\u0080º\u0093Ûõ\u0099\u0016*ÌlW@¼C79Vÿûx¿£t\u0096&Òcu¨;ëô¥ÿß(È\u0098+ïú~\u0086ÔÒ\u0003\\\u0012àõ_]\u008cÐñ*?&èëÜû¢^>ÙÇ\f4bHØ\u0011a¸-";
      int var17 = "á\u009e\u0093\u0004ÓDü[´=`\u0081\u0094\u0007¢âMmË¸G&\u0015ðÀ½\u0004ÏÀÙ4\tõ|\n«Ðt\u000f\u0090M\u0018nD4\u009ev\u0090\u0010ò\\\u0096ª\u009b\u0085\\¸Ã1J\u000f\u0092óo>\u0010\u008b&UÒ.T¹µ(H7fkcÍ\u00ad \u0013|WBü\u001eÉóá\u009b¶\u00029ÌÎ>\u0018\u007føÛ\u009e\\\u0096\u000f\u008e¸ÅQj\u0005O\b@ªùìì\u009d´I8Î²\u000fð1Ä\u000ek®g°\u0092cë¤Â3¬¥nD\u001e*Ó]Ð#È{V\u008f\u001f\u0089!RwÎÉÐ'\\iê»M\u00960£<ª#µëDMÖ@-°8\u0091éuk\u001bó\u0018\u0099z)!j\u0084ø\u009eì¹\u0018H4×éÓ\u000b$Ü\u008eÁÿê¡¾:À^·\u0098ÙTwkF\u0096>{UFNÕÙ¶cm\u0085\u001bð\u0014¯´b|\u0010NÞY0áêDÖ¢\u0004^\u0094!1Å\nXÉ-\u0011¥\u0094\u009eA@Ë,õ³¼Kbà\u0091Òy\u0092\u0097Ìï@\u008f4ÜQ\u0005M\u0017ï\u0099\u0092\u0010.¼è?\u0084Å¸\u00adëø\u0085[\u009d\u0089¢\u009a\u0080Êõ]][[§\u001eñ6\u009dú²ã\\P¶5¯tPgêXDã\u0094\u0005'½Éf\u0011v@ä(:´\u0012!¾}1{iR\u0093\u009a9cq\u008d\u0082ÝëH4û¨¸ªõ\n9\u007fp\u0015ÓÄ:Ë\u008f1£\u001e/(\u0099ú þP?\u0006ÌxÅ÷ªÅ`\u009a\u0018d6xXÂ´\"È\u008c\u0005\u0096èJóEÒgj\u008b#\u001c`¼òH¤6l½º³N{öb\u0000cv\u0003Tâ°~³ý\u009d\"MVî(×m\u0018Ë0sÊ\u0082\u0082°îäfÉ\u009e\u0080§µÞÚf\u0092î$\fãÇ© ÿ\u009c~ûVu\u0080º\u0093Ûõ\u0099\u0016*ÌlW@¼C79Vÿûx¿£t\u0096&Òcu¨;ëô¥ÿß(È\u0098+ïú~\u0086ÔÒ\u0003\\\u0012àõ_]\u008cÐñ*?&èëÜû¢^>ÙÇ\f4bHØ\u0011a¸-"
         .length();
      char var14 = '0';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = c(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     j = var18;
                     k = new String[14];
                     z = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "w?ã8§\f¬\u0003vÙ±ZCßoN\u001fàGÓÁ\u000f?X3\u0007\u0002Ùïi\u0080\u000f\u0001\u0014\u0013\u001a\u001aUÈ\u0093bÞïÎk@\u008f\u0095";
                     int var5 = "w?ã8§\f¬\u0003vÙ±ZCßoN\u001fàGÓÁ\u000f?X3\u0007\u0002Ùïi\u0080\u000f\u0001\u0014\u0013\u001a\u001aUÈ\u0093bÞïÎk@\u008f\u0095"
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
                                    s = var6;
                                    t = new Integer[8];
                                    x44.a<"v">(new Vector(), 4536395771055487634L, var20);
                                    String[] var29 = new String[e<"h">(6449, 7550169569032367137L ^ var20)];
                                    var29[0] = b<"x">(25278, 6615366384332139812L ^ var20);
                                    var29[1] = b<"x">(11404, 2815720149564924689L ^ var20);
                                    var29[2] = b<"x">(15417, 505997592279331746L ^ var20);
                                    var29[3] = b<"x">(175, 6767729652502236988L ^ var20);
                                    var29[4] = b<"x">(23571, 7935325895570936705L ^ var20);
                                    var29[5] = b<"x">(17075, 8241971220708805922L ^ var20);
                                    var29[e<"h">(13178, 3284294332284946028L ^ var20)] = b<"x">(22360, 8350996583985699022L ^ var20);
                                    var29[e<"h">(19039, 2418938199357112140L ^ var20)] = b<"x">(16402, 1082721194345877390L ^ var20);
                                    var29[e<"h">(8789, 1654737515835086663L ^ var20)] = b<"x">(22186, 3181591459668908341L ^ var20);
                                    var29[e<"h">(6213, 8184498036869098833L ^ var20)] = b<"x">(29425, 2298030642220694895L ^ var20);
                                    x44.a<"v">(var29, 2821100925901035406L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0010\u001bÈ¿ðh\u001b´\u0097JÞ[\u0090\u0011L ";
                                 var5 = "\u0010\u001bÈ¿ðh\u001b´\u0097JÞ[\u0090\u0011L ".length();
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

                  var15 = "\fÞ%¥#Þ÷>N÷ÙÂ9\u0017÷PîÞÛ\"Ù4JF0¢5\u008f\u008d\u009dñÜhèÆñð\u008d\u001e¾\u001dÀsÖlñ#_©\u001dCGX*FH²X*óçû\u0015\u000e\u0081\u001eÓïü\u000f\u0092B>";
                  var17 = "\fÞ%¥#Þ÷>N÷ÙÂ9\u0017÷PîÞÛ\"Ù4JF0¢5\u008f\u008d\u009dñÜhèÆñð\u008d\u001e¾\u001dÀsÖlñ#_©\u001dCGX*FH²X*óçû\u0015\u000e\u0081\u001eÓïü\u000f\u0092B>"
                     .length();
                  var14 = 24;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public s7(long var1, JFrame var3, String var4, String var5, BufferedReader var6, char var7, boolean var8, boolean var9, boolean var10, eq var11) {
      long var12 = (var1 << 16 | (long)var7 << 48 >>> 48) ^ e;
      long var14 = var12 ^ 108045071868198L;
      long var16 = var12 ^ 31247145935138L;
      super(var3, var4, var5, var16, var6, var8, var9, var10);
      x44.a<"i">(-6646292135580325979L, var12).addElement(this);
      int var18 = x44.a<"i">(-6646292135580325979L, var12).size() * e<"h">(12399, 8819022680148531279L ^ var12);
      x44.a<"s">(this, var11, -6642340833210322471L, var12);
      Object[] var10006 = new Object[]{null, null, null, var10};
      var10006[2] = var14;
      var10006[1] = var18;
      var10006[0] = var18;
      x44.a<"h">(this, var10006, -6790039796078613371L, var12);
   }

   public s7(JFrame var1, String var2, String var3, short var4, BufferedReader var5, boolean var6, boolean var7, short var8, int var9, boolean var10) {
      long var11 = ((long)var4 << 48 | (long)var8 << 48 >>> 16 | (long)var9 << 32 >>> 32) ^ e;
      long var13 = (var11 ^ 19245689174701L) >>> 16;
      int var15 = (int)((var11 ^ 19245689174701L) << 48 >>> 48);
      this(var13, var1, var2, var3, var5, (char)var15, var6, var7, true, null);
   }

   public s7(JFrame var1, String var2, long var3, String var5, String var6, boolean var7, boolean var8) {
      var3 = e ^ var3;
      long var9 = var3 ^ 118978551058738L;
      this(var1, var2, var5, new BufferedReader(new StringReader(var6)), var7, var9, var8);
   }

   public s7(JFrame var1, String var2, String var3, String var4, boolean var5, boolean var6, long var7, boolean var9) {
      var7 = e ^ var7;
      long var10001 = var7 ^ 46084533402587L;
      int var10 = (int)((var7 ^ 46084533402587L) >>> 48);
      int var11 = (int)((var7 ^ 46084533402587L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      BufferedReader var16 = new BufferedReader(new StringReader(var4));
      this(var1, var2, var3, (short)var10, var16, var5, var6, (short)var11, var12, var9);
   }

   protected void e(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 64009925116695L;
      long var6 = var2 ^ 94634866201160L;
      long var8 = var2 ^ 80171386674689L;
      x44.a<"t">(-8675186610326491212L, var2);
      Dimension var11 = x44.a<"l">(x44.a<"t">(-6986201662714524323L, var2), -8961167422694866879L, var2);
      Container var12 = x44.a<"l">(this, -9032452429127926566L, var2);
      x44.a<"w">(this, new _s4(var6, var12), -7183631372642156506L, var2);
      x44.a<"l">(var12, x44.a<"h">(this, -7183631372642156506L, var2), -7195544812959005908L, var2);
      x44.a<"w">(this, new JLabel(), -6966787808045415403L, var2);
      x44.a<"l">(var12, x44.a<"h">(this, -6966787808045415403L, var2), b<"x">(22906, 3353086841853373849L ^ var2), -6970211715214576325L, var2);
      x44.a<"w">(this, new JTextArea(), -8857106709324582969L, var2);
      x44.a<"l">(var12, new uo(x44.a<"h">(this, -8857106709324582969L, var2), var4), b<"x">(6544, 3791447625202216310L ^ var2), -6970211715214576325L, var2);
      x44.a<"w">(this, new JButton(b<"x">(24933, 4874885561088857473L ^ var2)), -7395187339492062387L, var2);
      x44.a<"l">(var12, x44.a<"h">(this, -7395187339492062387L, var2), b<"x">(13642, 104374327971152301L ^ var2), -6970211715214576325L, var2);
      xo var13 = new xo(this);
      x44.a<"l">(this, var13, -8921657714532262411L, var2);
      tj var14 = new tj(this);
      x44.a<"l">(x44.a<"h">(this, -7395187339492062387L, var2), var14, -7072459325258913403L, var2);
      x44.a<"l">(x44.a<"h">(this, -8857106709324582969L, var2), var14, -9057529141710331521L, var2);
      _yt var15 = new _yt(this);

      try {
         x44.a<"l">(x44.a<"h">(this, -7395187339492062387L, var2), var15, -7172737514000818722L, var2);
         x44.a<"l">(x44.a<"h">(this, -7183631372642156506L, var2), new Object[]{x44.a<"m">(-7181605374147105539L, var2), var8}, -8696855847334329624L, var2);
         x44.a<"l">(
            this,
            x44.a<"t">(e<"h">(23645, 5946757624643981883L ^ var2), x44.a<"h">(var11, -8652893162589618342L, var2), -7485249611185485026L, var2),
            x44.a<"t">(e<"h">(231, 5081124570648399493L ^ var2), x44.a<"h">(var11, -8870463851237477896L, var2), -7485249611185485026L, var2),
            -7152788393362116149L,
            var2
         );
         if (x44.a<"t">(-7440108452593766384L, var2) == null) {
            x44.a<"t">("uVVEJc", -8773345681893386825L, var2);
         }
      } catch (gj var16) {
         throw x44.a<"t">(var16, -8842047821848294197L, var2);
      }
   }

   public s7(JFrame var1, String var2, String var3, BufferedReader var4, boolean var5, long var6, boolean var8) {
      var6 = e ^ var6;
      long var10001 = var6 ^ 105390893277258L;
      int var9 = (int)((var6 ^ 105390893277258L) >>> 48);
      int var10 = (int)((var6 ^ 105390893277258L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      this(var1, var2, var3, (short)var9, var4, var5, var8, (short)var10, var11, true);
   }

   public final void B(Object[] param1) {
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
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 6244445152447
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w -8688085647701397694
      // 1f: lload 2
      // 20: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: ldc2_w -8831013673964535529
      // 28: lload 2
      // 29: invokedynamic k (JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 0
      // 2f: ldc2_w -7067027917450129148
      // 32: lload 2
      // 33: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: pop
      // 39: astore 8
      // 3b: aload 0
      // 3c: lload 4
      // 3e: bipush 1
      // 3f: anewarray 115
      // 42: dup_x2
      // 43: dup_x2
      // 44: pop
      // 45: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48: bipush 0
      // 49: swap
      // 4a: aastore
      // 4b: invokespecial com/zelix/s9.B ([Ljava/lang/Object;)V
      // 4e: aload 0
      // 4f: ldc2_w -8834965798753396885
      // 52: lload 2
      // 53: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: aload 8
      // 5a: ifnull 84
      // 5d: ifnull 9c
      // 60: goto 6d
      // 63: ldc2_w -8810008693188703171
      // 66: lload 2
      // 67: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: ldc2_w -8834965798753396885
      // 71: lload 2
      // 72: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: goto 84
      // 7a: ldc2_w -8810008693188703171
      // 7d: lload 2
      // 7e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: lload 6
      // 86: bipush 1
      // 87: anewarray 115
      // 8a: dup_x2
      // 8b: dup_x2
      // 8c: pop
      // 8d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 90: bipush 0
      // 91: swap
      // 92: aastore
      // 93: ldc2_w -9024340145870806296
      // 96: lload 2
      // 97: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: return
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15802;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/s7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/s7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18233;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])z.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               z.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/s7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/s7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
