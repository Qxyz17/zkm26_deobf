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

public class _8k extends _8d {
   private static final String h;
   private static final String e;
   private static final String j;
   private static final String[] k;
   private static final String b;
   private static final String d;
   private static final String a;
   private static final long i = ess.a(-3212578185884728365L, 4120653790998945607L, MethodHandles.lookup().lookupClass()).a(263139577474782L);
   private static final String[] l;
   private static final Map m = new HashMap(13);
   private static final String f;
   private static final String g;
   private static final String c;

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

   public long x(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = i ^ var2;
      return (long)(var4.hashCode() + a<"l">(31344, 9200577992637805038L ^ var2).hashCode() + a<"l">(13153, 6488746082265905385L ^ var2).hashCode());
   }

   public static String p(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(20782, 3635388228045648258L ^ var1);
   }

   public static String b(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(14944, 624223708973667829L ^ var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3872;
      if (l[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_8k", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         l[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
   }

   public static String c(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(31493, 1531421344525339933L ^ var1);
   }

   public static String P(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(28331, 4486587397917849186L ^ var1);
   }

   public static String G(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(12290, 9134678893247629048L ^ var1);
   }

   public static String h(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(31915, 8706316653602168945L ^ var1);
   }

   public static String S(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(778, 8812417267666910310L ^ var1);
   }

   static {
      long var0 = i ^ 92448357130898L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[20];
      int var7 = 0;
      String var6 = "â¨º¥:\b(ìo½-/ÄÝ\u001f)\u0099\u001c\u009cêpû\u0010¾ÂÌ\u0088\u0003JEgT R\u00146\rÝ\u0096{\u0096E°MÔ,-G\u0084Ú°\u009d¼\u0092±\u008b>hÚ©\u001f/Ç&\u0016 Ëôo¨Õ\u008f\u009e×éJÒ\u0001z²\u0017r1æÍ¨&ô¶£\u0001D¨:y£ý\u0005\u0018\u0018\u0099\u0000Ø]Bô3\n[G4p\u001dRÒ¸9t§ð×3\n(ßÚr¼n\u0095CÞ\u001a~(/\u0016¾é\u0001$h\u0087ô# ºvÿ\u008dÒ|`Ò-g\u0089ì¬Â\u00808\u0082}(ïôó\r,\u0019ÙÉ¡\u009a\u0098ÃP\u0081Ü8»ag\u000f, ?\u0096¤E/|;ûh{ë¦\u0014³\u0011Ì\u009aâ =%@³°ýµ\u0099w\u000f\u001a\u009c§Cïµ§iÅÅB\r¾åZÝ$ËÏ uì k:\u0081S*\u0097Ñ%ÊLÚ¢.\u0087ùE\u008c\u009b\u000f\rµXÈßPçUG\u008e\u0098A\u001b\u0018Í\u0016`X\u008d´~\u001dÛ=\u0091:à\u0090*AI\buLU\u0093MG u®>.\u008b»¥ã\u0089\u0095\u0003\u0011+Â¥\u000f}þé;®=\u009eÂÉï\u0013\u0087]&I!(¦\f¯\u001a\\\u009ez\u001dP³R?zwC\u0012×%e\u0000@H\u009dv\r\u001fòd|! pø (\u0011ùöÿ+ º7\u008fªÒ\u000f\u0003Ì\u009c\u0010\u0089\r\u0091ûµqJ âa\u008aÛ=f\u009c\u0084x\r\u001fÙ\u0086\u0004(Úo\u0019e\u0085af-°\u009a\u008dGíèhUÎMþ\u0003p¤c\u00001B¬\u0083Þk\u001a\u0082[\u0000\u0088ºH\u001d\u0094U(üîÙiÂò\u0085\u0083Y}W\u009e\u0094ÒK\f$Ä\u008c\u0082ý\u0004¸AL\u009cW¢(oPÈf«c®Tb\u0015\u007f \u0083Y\u0099fëdÌ@ð3ã\u0000e\u0010¹\u009a_\u000eÎC3\u0086\u0003pSÅ\u0000H'hå¯(ô\u0084ã<\u0013\u0010ÏÕõDh(~\b+E>R;î¸'\u0084\u0085,´#}8é6¯ÀtïbM;ÔÖ \u0014N\u008f+\u0012\u0003Y\u00005Á5\u0088L^ä\u008dR`zQ»¿º\u001f%ÕoG¢Ö+h Ýz\u0015Ah\u00adf)ö\u0011Q¡ð«\u0099\u0080]PG\u0012\u0019ºh\u0002bÊ«\u0001S<7ª";
      int var8 = "â¨º¥:\b(ìo½-/ÄÝ\u001f)\u0099\u001c\u009cêpû\u0010¾ÂÌ\u0088\u0003JEgT R\u00146\rÝ\u0096{\u0096E°MÔ,-G\u0084Ú°\u009d¼\u0092±\u008b>hÚ©\u001f/Ç&\u0016 Ëôo¨Õ\u008f\u009e×éJÒ\u0001z²\u0017r1æÍ¨&ô¶£\u0001D¨:y£ý\u0005\u0018\u0018\u0099\u0000Ø]Bô3\n[G4p\u001dRÒ¸9t§ð×3\n(ßÚr¼n\u0095CÞ\u001a~(/\u0016¾é\u0001$h\u0087ô# ºvÿ\u008dÒ|`Ò-g\u0089ì¬Â\u00808\u0082}(ïôó\r,\u0019ÙÉ¡\u009a\u0098ÃP\u0081Ü8»ag\u000f, ?\u0096¤E/|;ûh{ë¦\u0014³\u0011Ì\u009aâ =%@³°ýµ\u0099w\u000f\u001a\u009c§Cïµ§iÅÅB\r¾åZÝ$ËÏ uì k:\u0081S*\u0097Ñ%ÊLÚ¢.\u0087ùE\u008c\u009b\u000f\rµXÈßPçUG\u008e\u0098A\u001b\u0018Í\u0016`X\u008d´~\u001dÛ=\u0091:à\u0090*AI\buLU\u0093MG u®>.\u008b»¥ã\u0089\u0095\u0003\u0011+Â¥\u000f}þé;®=\u009eÂÉï\u0013\u0087]&I!(¦\f¯\u001a\\\u009ez\u001dP³R?zwC\u0012×%e\u0000@H\u009dv\r\u001fòd|! pø (\u0011ùöÿ+ º7\u008fªÒ\u000f\u0003Ì\u009c\u0010\u0089\r\u0091ûµqJ âa\u008aÛ=f\u009c\u0084x\r\u001fÙ\u0086\u0004(Úo\u0019e\u0085af-°\u009a\u008dGíèhUÎMþ\u0003p¤c\u00001B¬\u0083Þk\u001a\u0082[\u0000\u0088ºH\u001d\u0094U(üîÙiÂò\u0085\u0083Y}W\u009e\u0094ÒK\f$Ä\u008c\u0082ý\u0004¸AL\u009cW¢(oPÈf«c®Tb\u0015\u007f \u0083Y\u0099fëdÌ@ð3ã\u0000e\u0010¹\u009a_\u000eÎC3\u0086\u0003pSÅ\u0000H'hå¯(ô\u0084ã<\u0013\u0010ÏÕõDh(~\b+E>R;î¸'\u0084\u0085,´#}8é6¯ÀtïbM;ÔÖ \u0014N\u008f+\u0012\u0003Y\u00005Á5\u0088L^ä\u008dR`zQ»¿º\u001f%ÕoG¢Ö+h Ýz\u0015Ah\u00adf)ö\u0011Q¡ð«\u0099\u0080]PG\u0012\u0019ºh\u0002bÊ«\u0001S<7ª"
         .length();
      char var5 = ' ';
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
                     k = var9;
                     l = new String[20];
                     e = a<"l">(13673, 1528569845283293077L ^ var0);
                     b = a<"l">(4837, 8461385540538703878L ^ var0);
                     g = a<"l">(9153, 3510673811165090093L ^ var0);
                     d = a<"l">(30367, 322925044031538273L ^ var0);
                     f = a<"l">(23707, 2093185616350506613L ^ var0);
                     a = a<"l">(4445, 7103310626501469117L ^ var0);
                     j = a<"l">(8733, 5508122039045394687L ^ var0);
                     h = a<"l">(21722, 5408417931002504764L ^ var0);
                     c = a<"l">(22062, 1058142980765770945L ^ var0);
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

                  var6 = "Ü5J¼ê¹Ü]\u00820\u0081úÚãê+ÿÅ\u0015áÅ#²\u0080\u0018¡\u009e^#V\u0080«R0ß1\u0016\u0095?b\u0013\u0087§Êë¯+1r";
                  var8 = "Ü5J¼ê¹Ü]\u00820\u0081úÚãê+ÿÅ\u0015áÅ#²\u0080\u0018¡\u009e^#V\u0080«R0ß1\u0016\u0095?b\u0013\u0087§Êë¯+1r".length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   public static String a(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = i ^ var1;
      return a<"l">(998, 945248639062239168L ^ var1);
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
         throw new RuntimeException("com/zelix/_8k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static String F(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ i;
      return a<"l">(12566, 8602550453483618918L ^ var4);
   }
}
