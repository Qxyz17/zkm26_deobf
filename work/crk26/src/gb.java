package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface gb {
   String[] q;

   static {
      long var9 = prr.a(-6814725148232099836L, -3374033838496821026L, MethodHandles.lookup().lookupClass()).a(54089859311942L) ^ 74367683360652L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[21];
      int var6 = 0;
      String var5 = "ÄA\u0011P,DNC\u0010´x¹w½Æ²·/\u009a\u0091fP\u0098\u009bå sDòÜã\u0004£\u0097k¾\u000f¯\u0093síM\u0000¥Å\u0015\u000b§¥µ\u0080\u00002\u009f²\u00897V\u0018ØýÍ§Á®\u0090PAñ>\u0093¡\u009c<è±¥OØ°\u0095´\u0098\u0010£À\u0091d»\u001bÕ\u0002â_\u001cÝìµ\u0019¼\u0010ØýÍ§Á®\u0090PÖv²\túS:t\u0010:ì\u0017Eë\u0091\u0092Lb/hHüÞ\u001ez\u0018é%rÎ¯K\u008e§\u00997}.ø1PËÈ\u000f\u008c¸Ë\u0011Uà ØýÍ§Á®\u0090P\u0085a+s\\\u0092uK^%O\u00adÀ{\u0018\u0007G×{NKü¨÷ \u0083ÄÑ|¹\u009eú33Ó\u0000¹Ê\u0010® \u0087WAb°·J\u0007Þv\u00110j  ÷ \u0083ÄÑ|¹\u009eú33Ó\u0000¹Ê\u0010® âúOQ\u00adÝ²p\u0087\b\u001eø×L§r é%rÎ¯K\u008e§\u00997}.ø1PËp'Ù\u001ftS\u0081\u0001&\u0088\u000e7)l\u008d^\u0018%\u007f\u0081¢\u009czAr¬U\u001dV]\u008eÔ\u008cJã*3õJîÊ\bÜ³\u0000P\u0083\u001d\u0086× ØýÍ§Á®\u0090P\u0085a+s\\\u0092uK\u000fl³ëT¡ÂyWÒ±ÑQ\u0018uÔ\u0018hÀF\u008d±\u0012\u0087Óædê$\u0005| \u0080\u009b\u008d½\u0082gµÍÎ\u0010×÷pßHI\u000e\u0007Ö&$\fÅ\u008a_æ hÀF\u008d±\u0012\u0087Óædê$\u0005| \u0080ÛðåØsi\u001d\u000f<`Çw$\u0081É<\u0010OPð£'\u008e\u0013Çà \u0088\f\u0093°öð";
      int var7 = "ÄA\u0011P,DNC\u0010´x¹w½Æ²·/\u009a\u0091fP\u0098\u009bå sDòÜã\u0004£\u0097k¾\u000f¯\u0093síM\u0000¥Å\u0015\u000b§¥µ\u0080\u00002\u009f²\u00897V\u0018ØýÍ§Á®\u0090PAñ>\u0093¡\u009c<è±¥OØ°\u0095´\u0098\u0010£À\u0091d»\u001bÕ\u0002â_\u001cÝìµ\u0019¼\u0010ØýÍ§Á®\u0090PÖv²\túS:t\u0010:ì\u0017Eë\u0091\u0092Lb/hHüÞ\u001ez\u0018é%rÎ¯K\u008e§\u00997}.ø1PËÈ\u000f\u008c¸Ë\u0011Uà ØýÍ§Á®\u0090P\u0085a+s\\\u0092uK^%O\u00adÀ{\u0018\u0007G×{NKü¨÷ \u0083ÄÑ|¹\u009eú33Ó\u0000¹Ê\u0010® \u0087WAb°·J\u0007Þv\u00110j  ÷ \u0083ÄÑ|¹\u009eú33Ó\u0000¹Ê\u0010® âúOQ\u00adÝ²p\u0087\b\u001eø×L§r é%rÎ¯K\u008e§\u00997}.ø1PËp'Ù\u001ftS\u0081\u0001&\u0088\u000e7)l\u008d^\u0018%\u007f\u0081¢\u009czAr¬U\u001dV]\u008eÔ\u008cJã*3õJîÊ\bÜ³\u0000P\u0083\u001d\u0086× ØýÍ§Á®\u0090P\u0085a+s\\\u0092uK\u000fl³ëT¡ÂyWÒ±ÑQ\u0018uÔ\u0018hÀF\u008d±\u0012\u0087Óædê$\u0005| \u0080\u009b\u008d½\u0082gµÍÎ\u0010×÷pßHI\u000e\u0007Ö&$\fÅ\u008a_æ hÀF\u008d±\u0012\u0087Óædê$\u0005| \u0080ÛðåØsi\u001d\u000f<`Çw$\u0081É<\u0010OPð£'\u008e\u0013Çà \u0088\f\u0093°öð"
         .length();
      char var4 = '\b';
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     q = new String[]{
                        var0[18],
                        var0[12],
                        var0[10],
                        var0[9],
                        var0[6],
                        var0[4],
                        var0[13],
                        var0[0],
                        var0[16],
                        var0[7],
                        var0[11],
                        var0[20],
                        var0[3],
                        var0[15],
                        var0[17],
                        var0[8],
                        var0[14],
                        var0[1],
                        var0[19],
                        var0[2],
                        var0[5]
                     };
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "sDòÜã\u0004£\u0097k¾\u000f¯\u0093síM=,¹\u0012\u0084{¤°MÊT\u008eõÉÓN\u0018ØýÍ§Á®\u0090P\u0012K\n\u0017\u000bÇÄßÀ\u0000ÛâØí¨Ý";
                  var7 = "sDòÜã\u0004£\u0097k¾\u000f¯\u0093síM=,¹\u0012\u0084{¤°MÊT\u008eõÉÓN\u0018ØýÍ§Á®\u0090P\u0012K\n\u0017\u000bÇÄßÀ\u0000ÛâØí¨Ý".length();
                  var4 = ' ';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
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
}
