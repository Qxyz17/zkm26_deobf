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
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class lbg extends lb8 {
   JLabel u;
   JButton s;
   JButton i;
   static final String U;
   static String[] R;
   JEditorPane Y;
   private static final long a = prr.a(2290713239191795374L, -5058531735627691541L, MethodHandles.lookup().lookupClass()).a(10327974519331L);
   private static final String[] b;
   private static final String[] c;
   private static final Map h = new HashMap(13);
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;

   static {
      long var20 = a ^ 44528964079168L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[26];
      int var16 = 0;
      String var15 = "Rí\u0001\u0099Í¢\u0093Ki\u000fó\u0095ÞsRZ\\\u0007Ø\u0005ª4KÉ0»Þ9]ò|\u0003<ôñ\u009f\u0000\u00008bäòJv3¾\u0002ZÚ\u009e\\£ºí~`\u0082\rFLÐªæ*cð\u001c\u0099ôÓøý08\u008d!Qg[5wVÄ\u0005ºY\u00827\n¾¶åLGvÌ\u001d\u009eá\u0083\u0090¸3Z7Îuúxf¦ý\tÙ\u0082¢°Qz²mÅãVPÔå¢Ä·(:µ¨f\"P¹5ã\u0085G\u000b\u009a£\u001dð\téùw¬ÖwI@¸ï®öæu8\n\u0019*\u008c*Âj^(\u0093\u0015uç\u0095£&;kÜ\u0083!©¨Q-Ò\u008b£j\u0013\u0090%{\u009d\u008e\u008b\u0094¸ô\u009fÝ\u0013©ýÆ\u000bbì\u0099`W±0Ó\u0094ç\u009c¶MÃï\u009eÞðDók¸KyÚÿ\u001ejn´Þ<®\u0014\u008bt0é;\n\u0093õ\u008aD#¼yh»±\u008a\u0089±z\u0000ä\bUm\u0018l\u0085\u0096ä´»;ò@¨¼üïmÁ~EÜ\u008esVÓþÅo\u009eÈ -9F_ M\u0095ÄähÍO\u0018\bþL\u001a¨)SÁìZr\u001a\u0010¬f¬´Ô´\u0087[,^\u0095 ®Pôå5Æ¿6!ð?\u00867§ù\u0007æ\u0084I\u0019Ë\u001aÁ×iH¹\u0006÷\u009dÎ®Xs9\u000b\u0089&AÒTs6êþ\u0007Ä\u0015ð\u008c\u008asê×DhSÝªÏTeI®¬Q8êºqÞ\u001d+?æûéð\u000b7ÄlÄX{r\u000e#÷\u0013\u0081ÐjõæÓ\u0093Ô,yQa2Xá+\u0017ZÄ\u001a£Ø¼:z\u0003Ó»#°!\u0010\u0097\u0016\u0096©7©ZÂÇ\u0006\u009a\u001c\u00ad\u0014Êq0yHD»Ä\u001d_\u0089\u009fiU`±Hf8¤¥u\u001e>& </Ù\u008a\\:f×\u00ad\u00976¿Y\u0003_ò×ª\u00adÖÇß\\j{\u0018°\u009b_\u0098R*\u009d\u0087\u001bÖ9\u001eé\u0080Y%\u0093\u0003\u0098é\u008dÊT\u0096\u0010A\u0004\u007fÉ|<ZÆdú8%\u0010B\u001a/\u0010\u009e$¨\u008c\u0013þWQ=µ6\u008c'6º\u0015\u0010\u008a2TM%¸YE|CÒ\u0013\u0013å\u0094J\u0010ü´\u009cÖ»`\u0084Æ\b5³ðxÈ\u009f8@\u0082\u008a«5\u0084@¿ÄùmÏ\u009bä\u0086V-\u0096+\u0098\u008d\u0010µ\u009c\b\"sØöF?\u0093ÈpN\u000f´\u007f³!\u0005ÒyÎú\u0096y\u0015¨HQ\u0017\u0089\u009b.©\n\u008e)ø\u008e²\u0014\u0010\u0088(¿\u0087iQ v\u000b8\u0004\r¹+\u001f>\u008b\u0088ª\u00871\u0006Qn¸³¶}\u0015\u0083þ\u0004!§^µ\fûä\u009e\u0001:\u0010A\u0011oa¬¶h³JNÛ\u009eA/\u0007ª`\u009bÂ\u0095up\u00adyOÞÓäÒ#æ\u0096!bäk¹|\u009c¹r\u0007ÃM&G\u0093\u0092LÔ\u008d?\r\u009eácªÁ¥ÍuR»Ê/Ú\u001bh\\×\u001b\u0019\u0000ú-\u001b\u008c\u009f<økÜ\u0014\u0005°\u0097\u0097K¤äÖ©7\u0089¥ê\u0010\u008cª§iF\u00adp\u001e\u0012ËÝ|D/,¦\u0010+\u008eÆ^/JIÿ5nmÖmpï\"8á\u009b\u0091Þ\bÒÐ\u0083úz»~\n\nL@À/\u0001\u00ad¼\u0087æ]+j2I&,Ñ\u008f\u0080¶\u001b`\u008fH'r¦Ñ\rY\u009eò£\u001fñ\u0084Å\u000e\u0018ZUß\u0010M¾Ü\u0091·Ð\u00adÛp)B½æÝ\u0015u8Á\u0016]Å0â,g¥]÷Ò4\u009d\u0004H_×P÷áö K(bbçZ\bß\u0014ËT\u001bU&&»:R\u0085M\u00ado(\u009c¬]Î@º\u0087\u0099Où";
      int var17 = "Rí\u0001\u0099Í¢\u0093Ki\u000fó\u0095ÞsRZ\\\u0007Ø\u0005ª4KÉ0»Þ9]ò|\u0003<ôñ\u009f\u0000\u00008bäòJv3¾\u0002ZÚ\u009e\\£ºí~`\u0082\rFLÐªæ*cð\u001c\u0099ôÓøý08\u008d!Qg[5wVÄ\u0005ºY\u00827\n¾¶åLGvÌ\u001d\u009eá\u0083\u0090¸3Z7Îuúxf¦ý\tÙ\u0082¢°Qz²mÅãVPÔå¢Ä·(:µ¨f\"P¹5ã\u0085G\u000b\u009a£\u001dð\téùw¬ÖwI@¸ï®öæu8\n\u0019*\u008c*Âj^(\u0093\u0015uç\u0095£&;kÜ\u0083!©¨Q-Ò\u008b£j\u0013\u0090%{\u009d\u008e\u008b\u0094¸ô\u009fÝ\u0013©ýÆ\u000bbì\u0099`W±0Ó\u0094ç\u009c¶MÃï\u009eÞðDók¸KyÚÿ\u001ejn´Þ<®\u0014\u008bt0é;\n\u0093õ\u008aD#¼yh»±\u008a\u0089±z\u0000ä\bUm\u0018l\u0085\u0096ä´»;ò@¨¼üïmÁ~EÜ\u008esVÓþÅo\u009eÈ -9F_ M\u0095ÄähÍO\u0018\bþL\u001a¨)SÁìZr\u001a\u0010¬f¬´Ô´\u0087[,^\u0095 ®Pôå5Æ¿6!ð?\u00867§ù\u0007æ\u0084I\u0019Ë\u001aÁ×iH¹\u0006÷\u009dÎ®Xs9\u000b\u0089&AÒTs6êþ\u0007Ä\u0015ð\u008c\u008asê×DhSÝªÏTeI®¬Q8êºqÞ\u001d+?æûéð\u000b7ÄlÄX{r\u000e#÷\u0013\u0081ÐjõæÓ\u0093Ô,yQa2Xá+\u0017ZÄ\u001a£Ø¼:z\u0003Ó»#°!\u0010\u0097\u0016\u0096©7©ZÂÇ\u0006\u009a\u001c\u00ad\u0014Êq0yHD»Ä\u001d_\u0089\u009fiU`±Hf8¤¥u\u001e>& </Ù\u008a\\:f×\u00ad\u00976¿Y\u0003_ò×ª\u00adÖÇß\\j{\u0018°\u009b_\u0098R*\u009d\u0087\u001bÖ9\u001eé\u0080Y%\u0093\u0003\u0098é\u008dÊT\u0096\u0010A\u0004\u007fÉ|<ZÆdú8%\u0010B\u001a/\u0010\u009e$¨\u008c\u0013þWQ=µ6\u008c'6º\u0015\u0010\u008a2TM%¸YE|CÒ\u0013\u0013å\u0094J\u0010ü´\u009cÖ»`\u0084Æ\b5³ðxÈ\u009f8@\u0082\u008a«5\u0084@¿ÄùmÏ\u009bä\u0086V-\u0096+\u0098\u008d\u0010µ\u009c\b\"sØöF?\u0093ÈpN\u000f´\u007f³!\u0005ÒyÎú\u0096y\u0015¨HQ\u0017\u0089\u009b.©\n\u008e)ø\u008e²\u0014\u0010\u0088(¿\u0087iQ v\u000b8\u0004\r¹+\u001f>\u008b\u0088ª\u00871\u0006Qn¸³¶}\u0015\u0083þ\u0004!§^µ\fûä\u009e\u0001:\u0010A\u0011oa¬¶h³JNÛ\u009eA/\u0007ª`\u009bÂ\u0095up\u00adyOÞÓäÒ#æ\u0096!bäk¹|\u009c¹r\u0007ÃM&G\u0093\u0092LÔ\u008d?\r\u009eácªÁ¥ÍuR»Ê/Ú\u001bh\\×\u001b\u0019\u0000ú-\u001b\u008c\u009f<økÜ\u0014\u0005°\u0097\u0097K¤äÖ©7\u0089¥ê\u0010\u008cª§iF\u00adp\u001e\u0012ËÝ|D/,¦\u0010+\u008eÆ^/JIÿ5nmÖmpï\"8á\u009b\u0091Þ\bÒÐ\u0083úz»~\n\nL@À/\u0001\u00ad¼\u0087æ]+j2I&,Ñ\u008f\u0080¶\u001b`\u008fH'r¦Ñ\rY\u009eò£\u001fñ\u0084Å\u000e\u0018ZUß\u0010M¾Ü\u0091·Ð\u00adÛp)B½æÝ\u0015u8Á\u0016]Å0â,g¥]÷Ò4\u009d\u0004H_×P÷áö K(bbçZ\bß\u0014ËT\u001bU&&»:R\u0085M\u00ado(\u009c¬]Î@º\u0087\u0099Où"
         .length();
      char var14 = 24;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[26];
                     l = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[13];
                     int var3 = 0;
                     String var4 = "T\u0012{\u0080¹.º3ä'ú7F|Á\u008e\u0004_.b8\u0010o\u0005\u008eïjÿ\u0092^³\u001aÍØ¬§ÄÇ\u0018\u0093s\u0083\u0019Z¯Q\u009f\u0000Ì\u0092ã¹fL6Ð\r³\u000eÈpî\u0084\u0017\u0081sÝhä\u0080\u0081\tq+üqÏ\u001f2\u000b¹îðë|\u0090bl";
                     int var5 = "T\u0012{\u0080¹.º3ä'ú7F|Á\u008e\u0004_.b8\u0010o\u0005\u008eïjÿ\u0092^³\u001aÍØ¬§ÄÇ\u0018\u0093s\u0083\u0019Z¯Q\u009f\u0000Ì\u0092ã¹fL6Ð\r³\u000eÈpî\u0084\u0017\u0081sÝhä\u0080\u0081\tq+üqÏ\u001f2\u000b¹îðë|\u0090bl"
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
                                    j = var6;
                                    k = new Integer[13];
                                    U = m44.a<"h">(2694887737267910704L, var20);
                                    String[] var29 = new String[c<"n">(20786, 2241446397629820703L ^ var20)];
                                    var29[0] = b<"k">(26004, 6680241800568493653L ^ var20);
                                    var29[1] = b<"k">(1027, 5719848118146906057L ^ var20);
                                    var29[2] = b<"k">(6466, 1889689811898706575L ^ var20);
                                    var29[3] = b<"k">(10737, 8000064421317155374L ^ var20);
                                    var29[4] = b<"k">(21319, 8809378932487151759L ^ var20);
                                    var29[5] = b<"k">(21388, 4593923132311429198L ^ var20);
                                    var29[c<"n">(15191, 6695843093230552444L ^ var20)] = b<"k">(22215, 3363974064980550920L ^ var20);
                                    var29[c<"n">(31173, 7836463469942917095L ^ var20)] = b<"k">(1684, 6189733109414606157L ^ var20);
                                    var29[c<"n">(1650, 4323899533777811537L ^ var20)] = b<"k">(32636, 476501166470122671L ^ var20);
                                    var29[c<"n">(8837, 4520426003875142828L ^ var20)] = b<"k">(11813, 1926258898187558382L ^ var20);
                                    var29[c<"n">(3462, 410748399778608046L ^ var20)] = b<"k">(19281, 2356668144900896927L ^ var20);
                                    var29[c<"n">(10180, 5664319866477713893L ^ var20)] = b<"k">(1510, 2101347403969574461L ^ var20);
                                    var29[c<"n">(28945, 3563860955767000894L ^ var20)] = b<"k">(7352, 7865982554010955618L ^ var20);
                                    var29[c<"n">(12873, 829079445564066917L ^ var20)] = b<"k">(6764, 4419937182251329964L ^ var20);
                                    var29[c<"n">(7167, 2310532375498565073L ^ var20)] = b<"k">(20759, 93729157633467102L ^ var20);
                                    var29[c<"n">(17490, 1079863899582593655L ^ var20)] = b<"k">(16425, 3700963094545331188L ^ var20);
                                    m44.a<"o">(var29, 2451864073956797708L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0019´ò\bñ-\u0097é\u001b\u009eäos¤'ë";
                                 var5 = "\u0019´ò\bñ-\u0097é\u001b\u009eäos¤'ë".length();
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

                  var15 = "j¯º\u0085OÓü=X7R\u00053Zå\u0089@õ\f\u00144²Kn{W\u008e}È\u0005à\u009e+\u0017sc'\u0094î\u008a\u0083ìèP!\u001b';\u000bI^\u000eÌ÷ú¢)\u008bAõ ×qJ|B#1à\r¹\u001fJ|{\u008e¨\u009c\u0001\u0082K";
                  var17 = "j¯º\u0085OÓü=X7R\u00053Zå\u0089@õ\f\u00144²Kn{W\u008e}È\u0005à\u009e+\u0017sc'\u0094î\u008a\u0083ìèP!\u001b';\u000bI^\u000eÌ÷ú¢)\u008bAõ ×qJ|B#1à\r¹\u001fJ|{\u008e¨\u009c\u0001\u0082K"
                     .length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public lbg(JFrame param1, long param2, String param4, String param5, String param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/lbg.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 17373017334339
      // 00b: lxor
      // 00c: lstore 7
      // 00e: dup2
      // 00f: ldc2_w 117287548538479
      // 012: lxor
      // 013: lstore 9
      // 015: dup2
      // 016: ldc2_w 49322171520455
      // 019: lxor
      // 01a: lstore 11
      // 01c: dup2
      // 01d: ldc2_w 97772285909048
      // 020: lxor
      // 021: lstore 13
      // 023: dup2
      // 024: ldc2_w 42574925305425
      // 027: lxor
      // 028: lstore 15
      // 02a: dup2
      // 02b: ldc2_w 9589472386938
      // 02e: lxor
      // 02f: lstore 17
      // 031: dup2
      // 032: ldc2_w 69081335177909
      // 035: lxor
      // 036: lstore 19
      // 038: pop2
      // 039: ldc2_w -8002692363365826668
      // 03c: lload 2
      // 03d: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: aload 0
      // 043: aload 1
      // 044: aload 4
      // 046: bipush 1
      // 047: invokespecial com/zelix/lb8.<init> (Ljava/awt/Frame;Ljava/lang/String;Z)V
      // 04a: astore 21
      // 04c: aload 1
      // 04d: aload 21
      // 04f: ifnull 080
      // 052: ldc2_w -8066959980177499278
      // 055: lload 2
      // 056: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: ifne 076
      // 05e: goto 06b
      // 061: ldc2_w -7805156889732869103
      // 064: lload 2
      // 065: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: return
      // 06c: ldc2_w -7805156889732869103
      // 06f: lload 2
      // 070: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: aload 0
      // 077: ldc2_w -7799566854279486448
      // 07a: lload 2
      // 07b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/awt/Container; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: astore 22
      // 082: new com/zelix/ah
      // 085: dup
      // 086: aload 22
      // 088: lload 17
      // 08a: invokespecial com/zelix/ah.<init> (Ljava/awt/Container;J)V
      // 08d: astore 23
      // 08f: aload 22
      // 091: aload 23
      // 093: ldc2_w -8264061137218096724
      // 096: lload 2
      // 097: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: aload 0
      // 09d: new javax/swing/JLabel
      // 0a0: dup
      // 0a1: aload 5
      // 0a3: invokespecial javax/swing/JLabel.<init> (Ljava/lang/String;)V
      // 0a6: ldc2_w -7870073827838505760
      // 0a9: lload 2
      // 0aa: invokedynamic u (Ljava/lang/Object;Ljavax/swing/JLabel;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: aload 6
      // 0b1: ldc "<"
      // 0b3: lload 7
      // 0b5: sipush 13954
      // 0b8: ldc2_w 6636314638431793841
      // 0bb: lload 2
      // 0bc: lxor
      // 0bd: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: bipush 4
      // 0c3: anewarray 298
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: bipush 3
      // 0c9: swap
      // 0ca: aastore
      // 0cb: dup_x2
      // 0cc: dup_x2
      // 0cd: pop
      // 0ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d1: bipush 2
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: ldc2_w -8332540574407619192
      // 0e1: lload 2
      // 0e2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: astore 6
      // 0e9: aload 6
      // 0eb: ldc ">"
      // 0ed: lload 7
      // 0ef: sipush 22247
      // 0f2: ldc2_w 2262352112912552653
      // 0f5: lload 2
      // 0f6: lxor
      // 0f7: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: bipush 4
      // 0fd: anewarray 298
      // 100: dup_x1
      // 101: swap
      // 102: bipush 3
      // 103: swap
      // 104: aastore
      // 105: dup_x2
      // 106: dup_x2
      // 107: pop
      // 108: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10b: bipush 2
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 1
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w -8332540574407619192
      // 11b: lload 2
      // 11c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: astore 6
      // 123: aload 6
      // 125: ldc2_w -8338218355942045788
      // 128: lload 2
      // 129: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: lload 7
      // 130: sipush 7758
      // 133: ldc2_w 5069933581587126907
      // 136: lload 2
      // 137: lxor
      // 138: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: bipush 4
      // 13e: anewarray 298
      // 141: dup_x1
      // 142: swap
      // 143: bipush 3
      // 144: swap
      // 145: aastore
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 2
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 1
      // 152: swap
      // 153: aastore
      // 154: dup_x1
      // 155: swap
      // 156: bipush 0
      // 157: swap
      // 158: aastore
      // 159: ldc2_w -8332540574407619192
      // 15c: lload 2
      // 15d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: astore 6
      // 164: aload 0
      // 165: new javax/swing/JEditorPane
      // 168: dup
      // 169: invokespecial javax/swing/JEditorPane.<init> ()V
      // 16c: ldc2_w -7932420720683645016
      // 16f: lload 2
      // 170: invokedynamic u (Ljava/lang/Object;Ljavax/swing/JEditorPane;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: aload 0
      // 176: ldc2_w -7932420720683645016
      // 179: lload 2
      // 17a: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JEditorPane; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: bipush 0
      // 180: ldc2_w -7799068229078675395
      // 183: lload 2
      // 184: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: aload 0
      // 18a: ldc2_w -7932420720683645016
      // 18d: lload 2
      // 18e: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JEditorPane; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: lload 15
      // 195: dup2_x1
      // 196: pop2
      // 197: aload 6
      // 199: bipush 3
      // 19a: anewarray 298
      // 19d: dup_x1
      // 19e: swap
      // 19f: bipush 2
      // 1a0: swap
      // 1a1: aastore
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: bipush 1
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x2
      // 1a8: dup_x2
      // 1a9: pop
      // 1aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ad: bipush 0
      // 1ae: swap
      // 1af: aastore
      // 1b0: ldc2_w -8349302075184796722
      // 1b3: lload 2
      // 1b4: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: aload 22
      // 1bb: aload 0
      // 1bc: ldc2_w -7870073827838505760
      // 1bf: lload 2
      // 1c0: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JLabel; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: sipush 12008
      // 1c8: ldc2_w 2432811749129988806
      // 1cb: lload 2
      // 1cc: lxor
      // 1cd: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: ldc2_w -7777368883379754143
      // 1d5: lload 2
      // 1d6: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: aload 22
      // 1dd: new com/zelix/v
      // 1e0: dup
      // 1e1: aload 0
      // 1e2: ldc2_w -7932420720683645016
      // 1e5: lload 2
      // 1e6: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JEditorPane; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: lload 19
      // 1ed: dup2_x1
      // 1ee: pop2
      // 1ef: invokespecial com/zelix/v.<init> (JLjava/awt/Component;)V
      // 1f2: sipush 8516
      // 1f5: ldc2_w 1643276516615234925
      // 1f8: lload 2
      // 1f9: lxor
      // 1fa: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: ldc2_w -7777368883379754143
      // 202: lload 2
      // 203: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: aload 0
      // 209: new javax/swing/JButton
      // 20c: dup
      // 20d: sipush 12737
      // 210: ldc2_w 7405455605438723562
      // 213: lload 2
      // 214: lxor
      // 215: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: invokespecial javax/swing/JButton.<init> (Ljava/lang/String;)V
      // 21d: ldc2_w -7891452024019458564
      // 220: lload 2
      // 221: invokedynamic u (Ljava/lang/Object;Ljavax/swing/JButton;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: aload 22
      // 228: aload 0
      // 229: ldc2_w -7891452024019458564
      // 22c: lload 2
      // 22d: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: sipush 24284
      // 235: ldc2_w 6046675662162942708
      // 238: lload 2
      // 239: lxor
      // 23a: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: ldc2_w -7777368883379754143
      // 242: lload 2
      // 243: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: aload 0
      // 249: new javax/swing/JButton
      // 24c: dup
      // 24d: sipush 20176
      // 250: ldc2_w 4209071030557264623
      // 253: lload 2
      // 254: lxor
      // 255: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: invokespecial javax/swing/JButton.<init> (Ljava/lang/String;)V
      // 25d: ldc2_w -8300146688732738490
      // 260: lload 2
      // 261: invokedynamic u (Ljava/lang/Object;Ljavax/swing/JButton;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: aload 22
      // 268: aload 0
      // 269: ldc2_w -8300146688732738490
      // 26c: lload 2
      // 26d: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: sipush 22467
      // 275: ldc2_w 8008722506883159026
      // 278: lload 2
      // 279: lxor
      // 27a: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: ldc2_w -7777368883379754143
      // 282: lload 2
      // 283: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: aload 0
      // 289: ldc2_w -8300146688732738490
      // 28c: lload 2
      // 28d: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: sipush 16667
      // 295: ldc2_w 2704341455551120698
      // 298: lload 2
      // 299: lxor
      // 29a: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lbg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: lload 9
      // 2a1: bipush 2
      // 2a2: anewarray 298
      // 2a5: dup_x2
      // 2a6: dup_x2
      // 2a7: pop
      // 2a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ab: bipush 1
      // 2ac: swap
      // 2ad: aastore
      // 2ae: dup_x1
      // 2af: swap
      // 2b0: bipush 0
      // 2b1: swap
      // 2b2: aastore
      // 2b3: ldc2_w -8463501155031003051
      // 2b6: lload 2
      // 2b7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: ldc2_w -7608650673167273389
      // 2bf: lload 2
      // 2c0: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: aload 23
      // 2c7: ldc2_w -7643779770141893919
      // 2ca: lload 2
      // 2cb: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: lload 11
      // 2d2: bipush 2
      // 2d3: anewarray 298
      // 2d6: dup_x2
      // 2d7: dup_x2
      // 2d8: pop
      // 2d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2dc: bipush 1
      // 2dd: swap
      // 2de: aastore
      // 2df: dup_x1
      // 2e0: swap
      // 2e1: bipush 0
      // 2e2: swap
      // 2e3: aastore
      // 2e4: ldc2_w -8530780847808701022
      // 2e7: lload 2
      // 2e8: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: aload 0
      // 2ee: sipush 9136
      // 2f1: ldc2_w 6909218119264184951
      // 2f4: lload 2
      // 2f5: lxor
      // 2f6: invokedynamic n (IJ)I bsm=com/zelix/lbg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: sipush 3227
      // 2fe: ldc2_w 6563857609691465046
      // 301: lload 2
      // 302: lxor
      // 303: invokedynamic n (IJ)I bsm=com/zelix/lbg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: ldc2_w -8313659044746001374
      // 30b: lload 2
      // 30c: invokedynamic v (Ljava/lang/Object;IIJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: new com/zelix/gq
      // 314: dup
      // 315: aload 0
      // 316: invokespecial com/zelix/gq.<init> (Lcom/zelix/lbg;)V
      // 319: astore 24
      // 31b: aload 0
      // 31c: aload 24
      // 31e: ldc2_w -8055288940898478625
      // 321: lload 2
      // 322: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: new com/zelix/i5
      // 32a: dup
      // 32b: aload 0
      // 32c: invokespecial com/zelix/i5.<init> (Lcom/zelix/lbg;)V
      // 32f: astore 25
      // 331: aload 0
      // 332: ldc2_w -7891452024019458564
      // 335: lload 2
      // 336: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: aload 25
      // 33d: ldc2_w -8079412829896116509
      // 340: lload 2
      // 341: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: aload 0
      // 347: ldc2_w -8300146688732738490
      // 34a: lload 2
      // 34b: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: aload 25
      // 352: ldc2_w -8079412829896116509
      // 355: lload 2
      // 356: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35b: new com/zelix/ne
      // 35e: dup
      // 35f: aload 0
      // 360: invokespecial com/zelix/ne.<init> (Lcom/zelix/lbg;)V
      // 363: astore 26
      // 365: aload 0
      // 366: ldc2_w -7891452024019458564
      // 369: lload 2
      // 36a: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36f: aload 26
      // 371: ldc2_w -8387941041454847856
      // 374: lload 2
      // 375: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: aload 0
      // 37b: ldc2_w -8300146688732738490
      // 37e: lload 2
      // 37f: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: aload 26
      // 386: ldc2_w -8387941041454847856
      // 389: lload 2
      // 38a: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: aload 0
      // 390: ldc2_w -7791332771150801114
      // 393: lload 2
      // 394: invokedynamic v (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 399: astore 27
      // 39b: aload 1
      // 39c: ldc2_w -8413527810399222914
      // 39f: lload 2
      // 3a0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/awt/Point; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: astore 28
      // 3a7: aload 1
      // 3a8: ldc2_w -8549763138417854071
      // 3ab: lload 2
      // 3ac: invokedynamic v (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: astore 29
      // 3b3: aload 29
      // 3b5: ldc2_w -8345473232389951064
      // 3b8: lload 2
      // 3b9: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: bipush 2
      // 3bf: idiv
      // 3c0: aload 27
      // 3c2: ldc2_w -8345473232389951064
      // 3c5: lload 2
      // 3c6: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: bipush 2
      // 3cc: idiv
      // 3cd: isub
      // 3ce: aload 28
      // 3d0: ldc2_w -8302405099889601016
      // 3d3: lload 2
      // 3d4: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: iadd
      // 3da: istore 30
      // 3dc: aload 29
      // 3de: ldc2_w -7959240859797806471
      // 3e1: lload 2
      // 3e2: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e7: bipush 2
      // 3e8: idiv
      // 3e9: aload 27
      // 3eb: ldc2_w -7959240859797806471
      // 3ee: lload 2
      // 3ef: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f4: bipush 2
      // 3f5: idiv
      // 3f6: isub
      // 3f7: aload 28
      // 3f9: ldc2_w -7769191868375064743
      // 3fc: lload 2
      // 3fd: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: iadd
      // 403: istore 31
      // 405: bipush 0
      // 406: iload 30
      // 408: invokestatic java/lang/Math.max (II)I
      // 40b: istore 30
      // 40d: bipush 0
      // 40e: iload 31
      // 410: invokestatic java/lang/Math.max (II)I
      // 413: istore 31
      // 415: aload 0
      // 416: iload 30
      // 418: iload 31
      // 41a: ldc2_w -8336082607702916844
      // 41d: lload 2
      // 41e: invokedynamic v (Ljava/lang/Object;IIJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 423: lload 13
      // 425: aload 0
      // 426: bipush 1
      // 427: bipush 3
      // 428: anewarray 298
      // 42b: dup_x1
      // 42c: swap
      // 42d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 430: bipush 2
      // 431: swap
      // 432: aastore
      // 433: dup_x1
      // 434: swap
      // 435: bipush 1
      // 436: swap
      // 437: aastore
      // 438: dup_x2
      // 439: dup_x2
      // 43a: pop
      // 43b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43e: bipush 0
      // 43f: swap
      // 440: aastore
      // 441: ldc2_w -8070028910756571545
      // 444: lload 2
      // 445: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44a: return
   }

   public static void k(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast javax/swing/JFrame
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/String
      // 0f: astore 7
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/lang/String
      // 21: astore 1
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast java/lang/String
      // 28: astore 5
      // 2a: dup
      // 2b: bipush 5
      // 2c: aaload
      // 2d: checkcast java/lang/Boolean
      // 30: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 33: istore 4
      // 35: pop
      // 36: getstatic com/zelix/lbg.a J
      // 39: lload 2
      // 3a: lxor
      // 3b: lstore 2
      // 3c: lload 2
      // 3d: dup2
      // 3e: ldc2_w 62560642596777
      // 41: lxor
      // 42: lstore 8
      // 44: pop2
      // 45: ldc2_w 5315074178111235750
      // 48: lload 2
      // 49: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: new com/zelix/lbu
      // 51: dup
      // 52: aload 6
      // 54: aload 7
      // 56: aload 1
      // 57: aload 5
      // 59: invokespecial com/zelix/lbu.<init> (Ljavax/swing/JFrame;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 5c: astore 11
      // 5e: astore 10
      // 60: iload 4
      // 62: aload 10
      // 64: ifnull 80
      // 67: ifeq d0
      // 6a: goto 77
      // 6d: ldc2_w 5376406622341254435
      // 70: lload 2
      // 71: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: ldc2_w 5321854526695335178
      // 7a: lload 2
      // 7b: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: ifne ad
      // 83: aload 11
      // 85: ldc2_w 5954215070972498253
      // 88: lload 2
      // 89: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: goto e8
      // 91: ldc2_w 5376406622341254435
      // 94: lload 2
      // 95: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: astore 12
      // 9d: goto e8
      // a0: astore 12
      // a2: aload 10
      // a4: lload 2
      // a5: lconst_0
      // a6: lcmp
      // a7: ifle c0
      // aa: ifnonnull e8
      // ad: new com/zelix/lbg
      // b0: dup
      // b1: aload 6
      // b3: lload 8
      // b5: aload 7
      // b7: aload 1
      // b8: aload 5
      // ba: invokespecial com/zelix/lbg.<init> (Ljavax/swing/JFrame;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // bd: pop
      // be: aload 10
      // c0: ifnonnull e8
      // c3: goto d0
      // c6: ldc2_w 5376406622341254435
      // c9: lload 2
      // ca: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: athrow
      // d0: aload 11
      // d2: ldc2_w 5739025290326854136
      // d5: lload 2
      // d6: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: goto e8
      // de: ldc2_w 5376406622341254435
      // e1: lload 2
      // e2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e7: athrow
      // e8: return
   }

   public void O(Object[] var1) {
      long var2 = (Long)var1[0];
      m44.a<"t">(this, false, -323324272626195480L, var2);
      m44.a<"t">(this, -2127575909263387920L, var2);
   }

   public void M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      m44.a<"v">(m44.a<"w">(this, -3350009093214091328L, var2), -3472174477778422377L, var2);
      m44.a<"v">(m44.a<"w">(this, -3350009093214091328L, var2), -3227931138392405861L, var2);
   }

   private static Exception a(Exception var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6929;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/lbg", var10);
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
         throw new RuntimeException("com/zelix/lbg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5874;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lbg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/lbg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
