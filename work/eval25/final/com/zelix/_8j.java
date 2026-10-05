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

public class _8j extends _8_ {
   private static final String a;
   private static final long b = ess.a(-5911706327777547330L, -2752282717056406677L, MethodHandles.lookup().lookupClass()).a(243990199923676L);
   private static final String[] e;
   private final String[] Q;
   private static final String d;
   private static final Map g = new HashMap(13);
   private static final String c;
   private static final String[] f;

   public String H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return a<"k">(22484, 5074167193318650372L ^ var2);
   }

   static {
      long var0 = b ^ 10135106269569L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[17];
      int var7 = 0;
      String var6 = "ýÚ$¦Lå¼ïCm\u0002¯üè\u0018X²¢¨ÉÜ\u0083\u0003©F+¦9Sß\\\u008d¦,øàb¹ùDÓ\u0017Ó\u0004\u0019Ä}a\u0000\u0005Ý\u0011ºàûS{2éÎ`6J\f\u0011p¦µ\u001f/6\r_(\u0099Ö¤M:l9omJ¸ú+×Xç\u0016\b¥ÿ_\u008a{¸Þü\u009e½ÈWä)½\u000fn\u008f>\u0093Î\u007f\f\réèJmÈ\n\u0001z\u00886\u000e _¢/\u0087\u008cØ}4\u0017âÞ\f=t°|ªî\u009b0\u00998n0\u0013²RWü\u0017³\u008f\u0019Í\u0099.ú,\u001cèþÂ÷\u009e'\u001bøòÐ æÅC\u0098Á/ý\u009f\u0087µ\u0087\u0095\u0015öð*\u0003Ô\u001actú_ð\u0091Úñí,T\u0088\u001aXQû³c²\u009d\u007f\u0007\nø{á\"ïfë\u0016¶Ç¬\u0002\u0083Ç\u000bsHØ§@\u0019\u0088\u00adQûî©æ$\u0082\u0090ÚßÏ¤H÷k©¶æ\u0086!>5\u0003n\u009dÐ\u001c2\u0099ït2\u0093\u0006ý,á\u008cDÌÖV1QIlÉ\u0000\u0011\u0006\u0080êVUÇ\u0091 ìJæ9ÂÚ|5%B£ÃµÝsÇ\u0080A\u008e\u0084ðõË\u0085UÒ¾o=üª9 )\u001c\u000f¸\u009f\u008eHõ\u0006îiÎ?²Wì\u008do¸\u0017\u008b\u001dï;R&\u009eÃyNj\b\u0018X°W$¬\u0014ËOr6§qÖ±4@\u009e\f^Ïù ÀY@\u0001\u0084\u0018\td\u0085\u001cª8ò6·f\u00841:ª\f\u0014á'NþÔì\u0003Þ$îì\u0096w\u0081\u00972°\u009b·® \fµÖ\u0010`YiÃý°^w\bÑ\u0012L(\"·óF\u0084Ñ§X¯·IÞ\u0081\u008do.\u0088\u008c¹AgF¬t:ô\t\u009b´\u0081\u0094\u008cîf\u0093÷.å\u0087ØÈ\rw\u0011\u00ad(\\\u008eN»dvXcs:Ã\u0010Ò\u0007©NY\u008eiÕZ?»t\u0019\u001do\u007f1\u0011\u001c\u0017ü¬ËA7\u0087\u000b\u001c\u008eWí\u001bc¨c\u0099ô^\u0018`YÐ\u008bv×\u0001\u0087ÂÆ\u0096û\u009a0¥èÔ,IÛÈÜñÅ(ÁyP\u0002æî\u009aË`oÕ\u0095\tñ\u0094\u0016s)¬\u009f\u008c\u0012,ò¦ÓÈ9u¹äÛ\u0091l\u0006\u0017hâê\u0090X\u0016Ô¢\u0090ùÃV9]12no\u009bX\u0019|,w\u0012!\f»¨\u0088Î8´\u0001ö²©`0\u000f\u0083rµGÒë\u0083\u0094³jÍB\u0099 \u0015\u0090ëÙ¶Si.TªI\u0092ÍÛ\u0080\u007fóÊH\u0098½\u0083æ»\u008fó\"^xOÅjd\u0007Q\u0091úù^ è\u008c{ÏJº×(Z§\u00876¶J¿\u008e\u0018j\u0080×Å×ô&\u008fó\u0096Ò&\u009eÓ²`tÉ>\u000bï\u0082\u001e$\u0093©²àÔÛù`\u0097\u008a8\nUÛ\u0094®_\tÊq¥â¹_\u0018Vû´óL\u00010-\u007f²|ðöáQmé3\u00ad\u0090áý¦\u0087^òtûz\u0097·\u0092S%u=ß\u009eu¦\u001aÝ6\u009d\u0005e®$ÏôoÙRþÇQA\u0089O¦\u00145\u008fX:\u001bÛÍäe=¤Ö¯\u0093êO\u0014Ó\u0018\u007fuùwGM!l³mÜs¡j¢p»¸=ô\u008eÝ0\u0018\u008e\u0004æi\u0097al½Ó\u0095_\u008cñ¬F\u0005\u0016ìäé\u008f¡B¦E_\u0080Ë\u0089\u0015\u0081è\u0080\u0001¡{\u0007};#/³í \u0094ÔoÉ";
      int var8 = "ýÚ$¦Lå¼ïCm\u0002¯üè\u0018X²¢¨ÉÜ\u0083\u0003©F+¦9Sß\\\u008d¦,øàb¹ùDÓ\u0017Ó\u0004\u0019Ä}a\u0000\u0005Ý\u0011ºàûS{2éÎ`6J\f\u0011p¦µ\u001f/6\r_(\u0099Ö¤M:l9omJ¸ú+×Xç\u0016\b¥ÿ_\u008a{¸Þü\u009e½ÈWä)½\u000fn\u008f>\u0093Î\u007f\f\réèJmÈ\n\u0001z\u00886\u000e _¢/\u0087\u008cØ}4\u0017âÞ\f=t°|ªî\u009b0\u00998n0\u0013²RWü\u0017³\u008f\u0019Í\u0099.ú,\u001cèþÂ÷\u009e'\u001bøòÐ æÅC\u0098Á/ý\u009f\u0087µ\u0087\u0095\u0015öð*\u0003Ô\u001actú_ð\u0091Úñí,T\u0088\u001aXQû³c²\u009d\u007f\u0007\nø{á\"ïfë\u0016¶Ç¬\u0002\u0083Ç\u000bsHØ§@\u0019\u0088\u00adQûî©æ$\u0082\u0090ÚßÏ¤H÷k©¶æ\u0086!>5\u0003n\u009dÐ\u001c2\u0099ït2\u0093\u0006ý,á\u008cDÌÖV1QIlÉ\u0000\u0011\u0006\u0080êVUÇ\u0091 ìJæ9ÂÚ|5%B£ÃµÝsÇ\u0080A\u008e\u0084ðõË\u0085UÒ¾o=üª9 )\u001c\u000f¸\u009f\u008eHõ\u0006îiÎ?²Wì\u008do¸\u0017\u008b\u001dï;R&\u009eÃyNj\b\u0018X°W$¬\u0014ËOr6§qÖ±4@\u009e\f^Ïù ÀY@\u0001\u0084\u0018\td\u0085\u001cª8ò6·f\u00841:ª\f\u0014á'NþÔì\u0003Þ$îì\u0096w\u0081\u00972°\u009b·® \fµÖ\u0010`YiÃý°^w\bÑ\u0012L(\"·óF\u0084Ñ§X¯·IÞ\u0081\u008do.\u0088\u008c¹AgF¬t:ô\t\u009b´\u0081\u0094\u008cîf\u0093÷.å\u0087ØÈ\rw\u0011\u00ad(\\\u008eN»dvXcs:Ã\u0010Ò\u0007©NY\u008eiÕZ?»t\u0019\u001do\u007f1\u0011\u001c\u0017ü¬ËA7\u0087\u000b\u001c\u008eWí\u001bc¨c\u0099ô^\u0018`YÐ\u008bv×\u0001\u0087ÂÆ\u0096û\u009a0¥èÔ,IÛÈÜñÅ(ÁyP\u0002æî\u009aË`oÕ\u0095\tñ\u0094\u0016s)¬\u009f\u008c\u0012,ò¦ÓÈ9u¹äÛ\u0091l\u0006\u0017hâê\u0090X\u0016Ô¢\u0090ùÃV9]12no\u009bX\u0019|,w\u0012!\f»¨\u0088Î8´\u0001ö²©`0\u000f\u0083rµGÒë\u0083\u0094³jÍB\u0099 \u0015\u0090ëÙ¶Si.TªI\u0092ÍÛ\u0080\u007fóÊH\u0098½\u0083æ»\u008fó\"^xOÅjd\u0007Q\u0091úù^ è\u008c{ÏJº×(Z§\u00876¶J¿\u008e\u0018j\u0080×Å×ô&\u008fó\u0096Ò&\u009eÓ²`tÉ>\u000bï\u0082\u001e$\u0093©²àÔÛù`\u0097\u008a8\nUÛ\u0094®_\tÊq¥â¹_\u0018Vû´óL\u00010-\u007f²|ðöáQmé3\u00ad\u0090áý¦\u0087^òtûz\u0097·\u0092S%u=ß\u009eu¦\u001aÝ6\u009d\u0005e®$ÏôoÙRþÇQA\u0089O¦\u00145\u008fX:\u001bÛÍäe=¤Ö¯\u0093êO\u0014Ó\u0018\u007fuùwGM!l³mÜs¡j¢p»¸=ô\u008eÝ0\u0018\u008e\u0004æi\u0097al½Ó\u0095_\u008cñ¬F\u0005\u0016ìäé\u008f¡B¦E_\u0080Ë\u0089\u0015\u0081è\u0080\u0001¡{\u0007};#/³í \u0094ÔoÉ"
         .length();
      char var5 = 'X';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     e = var9;
                     f = new String[17];
                     d = a<"k">(14621, 4786808986808710261L ^ var0);
                     a = a<"k">(16882, 3334086213338041493L ^ var0);
                     c = a<"k">(18183, 1482526563841706596L ^ var0);
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

                  var6 = ">ñÌ,àFV¤ºÉ$Áo¯\u0018Âi\u0087\u0080¡É\\)\u0005Fû©µò*c.{W\u0004á%RÛY\u009aê>ÉmÒ]¼.Ñð\u0084Z<u®å§¯s©Ø\u009eê#A±Óò6tÏ úO´\u00ad\u001a\u001c7x&LÃ\u001dì\u0017\u0012X!\u0097`K\u00845(n\u000bQ\u001bè´°É0w\u008d\u0090½\u0081Öù\u00060\u0098®ªÏVìÉ<Ì»f78\u000e\u007f(ðx\u000f¹kÂTe\u0089\u000f5þ2ã¬Âp½}\u008f´\u0091IhõH\u008c-®©Ø:y$`á »B|§ø:,h9\u0010";
                  var8 = ">ñÌ,àFV¤ºÉ$Áo¯\u0018Âi\u0087\u0080¡É\\)\u0005Fû©µò*c.{W\u0004á%RÛY\u009aê>ÉmÒ]¼.Ñð\u0084Z<u®å§¯s©Ø\u009eê#A±Óò6tÏ úO´\u00ad\u001a\u001c7x&LÃ\u001dì\u0017\u0012X!\u0097`K\u00845(n\u000bQ\u001bè´°É0w\u008d\u0090½\u0081Öù\u00060\u0098®ªÏVìÉ<Ì»f78\u000e\u007f(ðx\u000f¹kÂTe\u0089\u000f5þ2ã¬Âp½}\u008f´\u0091IhõH\u008c-®©Ø:y$`á »B|§ø:,h9\u0010"
                     .length();
                  var5 = 'X';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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

   public String P(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.Q[var2];
   }

   public String V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return a<"k">(2280, 2811584927197536118L ^ var2);
   }

   public _8j(long var1) {
      var1 = b ^ var1;
      super();
      String[] var3 = new String[]{
         a<"k">(14902, 859122874150332615L ^ var1),
         a<"k">(5907, 4558484719507670499L ^ var1),
         a<"k">(79, 2470285370211668657L ^ var1),
         a<"k">(8824, 3842390353184862361L ^ var1),
         a<"k">(22395, 8425923999481873796L ^ var1),
         a<"k">(17701, 2352787496337070041L ^ var1),
         a<"k">(19724, 3232401984184541173L ^ var1),
         a<"k">(6584, 6980541504804424515L ^ var1),
         a<"k">(32393, 3855162102026333299L ^ var1),
         a<"k">(31246, 7477795562786023676L ^ var1)
      };
      this.Q = var3;
   }

   public String a(Object[] var1) {
      Object var2 = var1[0];
      return this.Q[(Integer)var2].trim();
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13319;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_8j", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("com/zelix/_8j" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public String R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return a<"k">(16205, 7983704677957964901L ^ var2);
   }

   public String X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return a<"k">(31487, 7979970152815393170L ^ var2);
   }
}
