package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface uk {
   String[] r;

   static {
      long var9 = ess.a(7819090470747440228L, 6062637120786396674L, MethodHandles.lookup().lookupClass()).a(156166504787317L) ^ 74460177747150L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[31];
      int var6 = 0;
      String var5 = "\u0005\u0005\u0014Fû|\u0098\\\bL\u00009\u0015\b5\u0093Y\b÷¯\u0010\u0089éÍàH\b{\u0099Å\u0099õÖØ\u000e\b\n¤[T\u0016%\fe\b¦&ª&©\u0010Ã\u001a\baib~äti(\b¸E§4\u0080\u0098É\u000b\bf®ô$8AºV\b=ÌÍÝ/*\u001f\u0093\u0010\u000bð\"\u0019\u0084B(\u00867æ\u0001f´\u0013\u0097\f\b=ÌÍÝ/*\u001f\u0093\u0018E\u009cg\u0099ûV\u0098\u0014,ZX\u0006t¢cÝWB\u0095@¡\u0089¿Â\b\u0003\bõ÷Ô\u00078Ñ\b{úd#\u0080ýc´\u0018E\u009cg\u0099ûV\u0098\u0014þÐvÒ\u0098[R\u008bÚw#{\u0007\u001cG\u0082\u0010\u001c;.Ç\r\u009cÈv´Ó\u0012m\u0013\u0005M\u009b\blûÖ£:Å1=\bXCÙ\u0082AÔY\u009c\u0018\u001e\u0091C·åâÐ¥¢\u0006!ð¶ë. ?\u009f(®ëÐt\u000f\b¸E§4\u0080\u0098É\u000b\u0010óÖ«^8¹\u000bñù\u001eCB®D\u009c\u0017\bìáªÔ03iP\b\u0006ÝÔ\u00ad\u009b\u007fì>\b³Ó\nUÿ\nÊT\bñ)'ùií5z\bD}J\u008aÈ$¡z\bÎ\u001b×Øö*MG\u0010TII\u0089kOUt\u0095ÚZ\u000e«\u0089º>";
      int var7 = "\u0005\u0005\u0014Fû|\u0098\\\bL\u00009\u0015\b5\u0093Y\b÷¯\u0010\u0089éÍàH\b{\u0099Å\u0099õÖØ\u000e\b\n¤[T\u0016%\fe\b¦&ª&©\u0010Ã\u001a\baib~äti(\b¸E§4\u0080\u0098É\u000b\bf®ô$8AºV\b=ÌÍÝ/*\u001f\u0093\u0010\u000bð\"\u0019\u0084B(\u00867æ\u0001f´\u0013\u0097\f\b=ÌÍÝ/*\u001f\u0093\u0018E\u009cg\u0099ûV\u0098\u0014,ZX\u0006t¢cÝWB\u0095@¡\u0089¿Â\b\u0003\bõ÷Ô\u00078Ñ\b{úd#\u0080ýc´\u0018E\u009cg\u0099ûV\u0098\u0014þÐvÒ\u0098[R\u008bÚw#{\u0007\u001cG\u0082\u0010\u001c;.Ç\r\u009cÈv´Ó\u0012m\u0013\u0005M\u009b\blûÖ£:Å1=\bXCÙ\u0082AÔY\u009c\u0018\u001e\u0091C·åâÐ¥¢\u0006!ð¶ë. ?\u009f(®ëÐt\u000f\b¸E§4\u0080\u0098É\u000b\u0010óÖ«^8¹\u000bñù\u001eCB®D\u009c\u0017\bìáªÔ03iP\b\u0006ÝÔ\u00ad\u009b\u007fì>\b³Ó\nUÿ\nÊT\bñ)'ùií5z\bD}J\u008aÈ$¡z\bÎ\u001b×Øö*MG\u0010TII\u0089kOUt\u0095ÚZ\u000e«\u0089º>"
         .length();
      char var4 = '\b';
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     r = new String[]{
                        var0[23],
                        var0[24],
                        var0[27],
                        var0[13],
                        var0[5],
                        var0[12],
                        var0[3],
                        var0[30],
                        var0[20],
                        var0[7],
                        var0[15],
                        var0[21],
                        var0[2],
                        var0[22],
                        var0[1],
                        var0[8],
                        var0[4],
                        var0[0],
                        var0[25],
                        var0[17],
                        var0[26],
                        var0[14],
                        var0[6],
                        var0[10],
                        var0[28],
                        var0[16],
                        var0[9],
                        var0[11],
                        var0[29],
                        var0[19],
                        var0[18]
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

                  var5 = "E\u009cg\u0099ûV\u0098\u0014\u0092Ð\u0015\u008eÄ:\u00ad\u001b\\jEÞÿ\u009bwN\u0018Ûh\f8[Ê×\rýÓx¨Z\nu¨º\u0016¶Ê\u0085kÔt";
                  var7 = "E\u009cg\u0099ûV\u0098\u0014\u0092Ð\u0015\u008eÄ:\u00ad\u001b\\jEÞÿ\u009bwN\u0018Ûh\f8[Ê×\rýÓx¨Z\nu¨º\u0016¶Ê\u0085kÔt".length();
                  var4 = 24;
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
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
}
